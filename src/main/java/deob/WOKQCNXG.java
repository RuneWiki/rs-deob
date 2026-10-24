package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;

@ObfuscatedName("WOKQCNXG")
public final class WOKQCNXG implements ImageProducer, ImageObserver {

	@ObfuscatedName("WOKQCNXG.c")
	public int field1432;

	@ObfuscatedName("WOKQCNXG.d")
	public int field1433;

	@ObfuscatedName("WOKQCNXG.b")
	public int[] field1431;

	@ObfuscatedName("WOKQCNXG.e")
	public ColorModel field1434;

	@ObfuscatedName("WOKQCNXG.g")
	public Image field1436;

	@ObfuscatedName("WOKQCNXG.f")
	public ImageConsumer field1435;

	public WOKQCNXG(int arg0, int arg1, Component arg2) {
		field1432 = arg0;
		field1433 = arg1;
		field1431 = new int[arg0 * arg1];
		field1434 = new DirectColorModel(32, 0xFF0000, 0xFF00, 255);
		field1436 = arg2.createImage(this);
		method580();
		arg2.prepareImage(field1436, this);
		method580();
		arg2.prepareImage(field1436, this);
		method580();
		arg2.prepareImage(field1436, this);
		method578();
	}

	@ObfuscatedName("WOKQCNXG.a(I)V")
	public void method578() {
		UKUXLUWP.method541(field1432, field1431, field1433);
	}

	@ObfuscatedName("WOKQCNXG.a(IILjava/awt/Graphics;I)V")
	public void method579(int arg0, Graphics arg1, int arg2) {
		method580();
		arg1.drawImage(field1436, arg2, arg0, this);
	}

	public synchronized void addConsumer(ImageConsumer arg0) {
		field1435 = arg0;
		arg0.setDimensions(field1432, field1433);
		arg0.setProperties(null);
		arg0.setColorModel(field1434);
		arg0.setHints(14);
	}

	public synchronized boolean isConsumer(ImageConsumer arg0) {
		if (field1435 == arg0) {
			return true;
		}

		return false;
	}

	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (field1435 == arg0) {
			field1435 = null;
		}
	}

	public void startProduction(ImageConsumer arg0) {
		addConsumer(arg0);
	}

	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@ObfuscatedName("WOKQCNXG.a()V")
	public synchronized void method580() {
		if (field1435 != null) {
			field1435.setPixels(0, 0, field1432, field1433, field1434, field1431, 0, field1432);
			field1435.imageComplete(2);
		}
	}

	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
