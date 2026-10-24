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

@ObfuscatedName("TZRNBMTC")
public final class TZRNBMTC implements ImageProducer, ImageObserver {

	@ObfuscatedName("TZRNBMTC.e")
	public int field1279;

	@ObfuscatedName("TZRNBMTC.f")
	public int field1280;

	@ObfuscatedName("TZRNBMTC.d")
	public int[] field1278;

	@ObfuscatedName("TZRNBMTC.g")
	public ColorModel field1281;

	@ObfuscatedName("TZRNBMTC.i")
	public Image field1283;

	@ObfuscatedName("TZRNBMTC.h")
	public ImageConsumer field1282;

	public TZRNBMTC(int arg0, Component arg1, int arg2) {
		field1279 = arg0;
		field1280 = arg2;
		field1278 = new int[arg0 * arg2];
		field1281 = new DirectColorModel(32, 0xFF0000, 0xFF00, 255);
		field1283 = arg1.createImage(this);
		method494();
		arg1.prepareImage(field1283, this);
		method494();
		arg1.prepareImage(field1283, this);
		method494();
		arg1.prepareImage(field1283, this);
		method492();
	}

	@ObfuscatedName("TZRNBMTC.a(B)V")
	public void method492() {
		JNJDBENA.method283(field1279, field1280, field1278);
	}

	@ObfuscatedName("TZRNBMTC.a(IIILjava/awt/Graphics;)V")
	public void method493(int arg0, int arg1, Graphics arg2) {
		method494();
		arg2.drawImage(field1283, arg1, arg0, this);
	}

	public synchronized void addConsumer(ImageConsumer arg0) {
		field1282 = arg0;
		arg0.setDimensions(field1279, field1280);
		arg0.setProperties(null);
		arg0.setColorModel(field1281);
		arg0.setHints(14);
	}

	public synchronized boolean isConsumer(ImageConsumer arg0) {
		if (field1282 == arg0) {
			return true;
		}

		return false;
	}

	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (field1282 == arg0) {
			field1282 = null;
		}
	}

	public void startProduction(ImageConsumer arg0) {
		addConsumer(arg0);
	}

	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@ObfuscatedName("TZRNBMTC.a()V")
	public synchronized void method494() {
		if (field1282 != null) {
			field1282.setPixels(0, 0, field1279, field1280, field1281, field1278, 0, field1279);
			field1282.imageComplete(2);
		}
	}

	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
