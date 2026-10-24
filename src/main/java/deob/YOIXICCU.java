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

@ObfuscatedName("YOIXICCU")
public final class YOIXICCU implements ImageProducer, ImageObserver {

	@ObfuscatedName("YOIXICCU.d")
	public int field1467;

	@ObfuscatedName("YOIXICCU.e")
	public int field1468;

	@ObfuscatedName("YOIXICCU.c")
	public int[] field1466;

	@ObfuscatedName("YOIXICCU.f")
	public ColorModel field1469;

	@ObfuscatedName("YOIXICCU.h")
	public Image field1471;

	@ObfuscatedName("YOIXICCU.g")
	public ImageConsumer field1470;

	public YOIXICCU(int arg0, Component arg1, int arg2) {
		field1467 = arg0;
		field1468 = arg2;
		field1466 = new int[arg0 * arg2];
		field1469 = new DirectColorModel(32, 0xFF0000, 0xFF00, 255);
		field1471 = arg1.createImage(this);
		method547();
		arg1.prepareImage(field1471, this);
		method547();
		arg1.prepareImage(field1471, this);
		method547();
		arg1.prepareImage(field1471, this);
		method545();
	}

	@ObfuscatedName("YOIXICCU.a(I)V")
	public void method545() {
		GEFFBGXP.method223(field1468, field1467, field1466);
	}

	@ObfuscatedName("YOIXICCU.a(Ljava/awt/Graphics;III)V")
	public void method546(Graphics arg0, int arg1, int arg2) {
		method547();
		arg0.drawImage(field1471, arg2, arg1, this);
	}

	public synchronized void addConsumer(ImageConsumer arg0) {
		field1470 = arg0;
		arg0.setDimensions(field1467, field1468);
		arg0.setProperties(null);
		arg0.setColorModel(field1469);
		arg0.setHints(14);
	}

	public synchronized boolean isConsumer(ImageConsumer arg0) {
		if (field1470 == arg0) {
			return true;
		}

		return false;
	}

	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (field1470 == arg0) {
			field1470 = null;
		}
	}

	public void startProduction(ImageConsumer arg0) {
		addConsumer(arg0);
	}

	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@ObfuscatedName("YOIXICCU.a()V")
	public synchronized void method547() {
		if (field1470 != null) {
			field1470.setPixels(0, 0, field1467, field1468, field1469, field1466, 0, field1467);
			field1470.imageComplete(2);
		}
	}

	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
