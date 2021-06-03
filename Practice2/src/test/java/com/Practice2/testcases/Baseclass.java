package com.Practice2.testcases;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

	
	@Test
	public void forUrl()
	{
		//For git testing
	WebDriverManager.firefoxdriver().setup();
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("https://www.ebay.com");

}
}
