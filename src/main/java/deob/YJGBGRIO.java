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

@ObfuscatedName("YJGBGRIO")
public final class YJGBGRIO implements ImageProducer, ImageObserver {

	@ObfuscatedName("YJGBGRIO.d")
	public int field1435;

	@ObfuscatedName("YJGBGRIO.e")
	public int field1436;

	@ObfuscatedName("YJGBGRIO.c")
	public int[] field1434;

	@ObfuscatedName("YJGBGRIO.f")
	public ColorModel field1437;

	@ObfuscatedName("YJGBGRIO.h")
	public Image field1439;

	@ObfuscatedName("YJGBGRIO.g")
	public ImageConsumer field1438;

	public YJGBGRIO(Component arg0, int arg1, int arg2) {
		field1435 = arg1;
		field1436 = arg2;
		field1434 = new int[arg1 * arg2];
		field1437 = new DirectColorModel(32, 0xFF0000, 0xFF00, 255);
		field1439 = arg0.createImage(this);
		method582();
		arg0.prepareImage(field1439, this);
		method582();
		arg0.prepareImage(field1439, this);
		method582();
		arg0.prepareImage(field1439, this);
		method580();
	}

	@ObfuscatedName("YJGBGRIO.a(Z)V")
	public void method580() {
		JOVUNXBE.method380(field1434, field1435, field1436);
	}

	@ObfuscatedName("YJGBGRIO.a(IIILjava/awt/Graphics;)V")
	public void method581(int arg0, int arg1, Graphics arg2) {
		method582();
		arg2.drawImage(field1439, arg0, arg1, this);
	}

	public synchronized void addConsumer(ImageConsumer arg0) {
		field1438 = arg0;
		arg0.setDimensions(field1435, field1436);
		arg0.setProperties(null);
		arg0.setColorModel(field1437);
		arg0.setHints(14);
	}

	public synchronized boolean isConsumer(ImageConsumer arg0) {
		if (field1438 == arg0) {
			return true;
		}

		return false;
	}

	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (field1438 == arg0) {
			field1438 = null;
		}
	}

	public void startProduction(ImageConsumer arg0) {
		addConsumer(arg0);
	}

	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@ObfuscatedName("YJGBGRIO.a()V")
	public synchronized void method582() {
		if (field1438 != null) {
			field1438.setPixels(0, 0, field1435, field1436, field1437, field1434, 0, field1435);
			field1438.imageComplete(2);
		}
	}

	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
