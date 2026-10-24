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

@ObfuscatedName("BEVLZSVU")
public final class BEVLZSVU implements ImageProducer, ImageObserver {

	@ObfuscatedName("BEVLZSVU.d")
	public int field46;

	@ObfuscatedName("BEVLZSVU.e")
	public int field47;

	@ObfuscatedName("BEVLZSVU.c")
	public int[] field45;

	@ObfuscatedName("BEVLZSVU.f")
	public ColorModel field48;

	@ObfuscatedName("BEVLZSVU.h")
	public Image field50;

	@ObfuscatedName("BEVLZSVU.g")
	public ImageConsumer field49;

	public BEVLZSVU(int arg0, int arg1, Component arg2) {
		field46 = arg1;
		field47 = arg0;
		field45 = new int[arg0 * arg1];
		field48 = new DirectColorModel(32, 0xFF0000, 0xFF00, 255);
		field50 = arg2.createImage(this);
		method26();
		arg2.prepareImage(field50, this);
		method26();
		arg2.prepareImage(field50, this);
		method26();
		arg2.prepareImage(field50, this);
		method24();
	}

	@ObfuscatedName("BEVLZSVU.a(I)V")
	public void method24() {
		CXMSQZVC.method197(field47, field46, field45);
	}

	@ObfuscatedName("BEVLZSVU.a(IILjava/awt/Graphics;I)V")
	public void method25(int arg0, Graphics arg1, int arg2) {
		method26();
		arg1.drawImage(field50, arg2, arg0, this);
	}

	public synchronized void addConsumer(ImageConsumer arg0) {
		field49 = arg0;
		arg0.setDimensions(field46, field47);
		arg0.setProperties(null);
		arg0.setColorModel(field48);
		arg0.setHints(14);
	}

	public synchronized boolean isConsumer(ImageConsumer arg0) {
		if (field49 == arg0) {
			return true;
		}

		return false;
	}

	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (field49 == arg0) {
			field49 = null;
		}
	}

	public void startProduction(ImageConsumer arg0) {
		addConsumer(arg0);
	}

	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@ObfuscatedName("BEVLZSVU.a()V")
	public synchronized void method26() {
		if (field49 != null) {
			field49.setPixels(0, 0, field46, field47, field48, field45, 0, field46);
			field49.imageComplete(2);
		}
	}

	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
