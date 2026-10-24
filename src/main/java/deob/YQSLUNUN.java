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

@ObfuscatedName("YQSLUNUN")
public final class YQSLUNUN implements ImageProducer, ImageObserver {

	@ObfuscatedName("YQSLUNUN.c")
	public int field1478;

	@ObfuscatedName("YQSLUNUN.d")
	public int field1479;

	@ObfuscatedName("YQSLUNUN.b")
	public int[] field1477;

	@ObfuscatedName("YQSLUNUN.e")
	public ColorModel field1480;

	@ObfuscatedName("YQSLUNUN.g")
	public Image field1482;

	@ObfuscatedName("YQSLUNUN.f")
	public ImageConsumer field1481;

	public YQSLUNUN(int arg0, Component arg1, int arg2) {
		field1478 = arg2;
		field1479 = arg0;
		field1477 = new int[arg0 * arg2];
		field1480 = new DirectColorModel(32, 0xFF0000, 0xFF00, 255);
		field1482 = arg1.createImage(this);
		method590();
		arg1.prepareImage(field1482, this);
		method590();
		arg1.prepareImage(field1482, this);
		method590();
		arg1.prepareImage(field1482, this);
		method588();
	}

	@ObfuscatedName("YQSLUNUN.a(I)V")
	public void method588() {
		HQRNTLRZ.method279(field1478, field1477, field1479);
	}

	@ObfuscatedName("YQSLUNUN.a(ILjava/awt/Graphics;II)V")
	public void method589(int arg0, Graphics arg1, int arg2) {
		method590();
		arg1.drawImage(field1482, arg2, arg0, this);
	}

	public synchronized void addConsumer(ImageConsumer arg0) {
		field1481 = arg0;
		arg0.setDimensions(field1478, field1479);
		arg0.setProperties(null);
		arg0.setColorModel(field1480);
		arg0.setHints(14);
	}

	public synchronized boolean isConsumer(ImageConsumer arg0) {
		if (field1481 == arg0) {
			return true;
		}

		return false;
	}

	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (field1481 == arg0) {
			field1481 = null;
		}
	}

	public void startProduction(ImageConsumer arg0) {
		addConsumer(arg0);
	}

	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@ObfuscatedName("YQSLUNUN.a()V")
	public synchronized void method590() {
		if (field1481 != null) {
			field1481.setPixels(0, 0, field1478, field1479, field1480, field1477, 0, field1478);
			field1481.imageComplete(2);
		}
	}

	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
