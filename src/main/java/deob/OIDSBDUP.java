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

@ObfuscatedName("OIDSBDUP")
public final class OIDSBDUP implements ImageProducer, ImageObserver {

	@ObfuscatedName("OIDSBDUP.c")
	public int field1021;

	@ObfuscatedName("OIDSBDUP.d")
	public int field1022;

	@ObfuscatedName("OIDSBDUP.b")
	public int[] field1020;

	@ObfuscatedName("OIDSBDUP.e")
	public ColorModel field1023;

	@ObfuscatedName("OIDSBDUP.g")
	public Image field1025;

	@ObfuscatedName("OIDSBDUP.f")
	public ImageConsumer field1024;

	public OIDSBDUP(Component arg0, int arg1, int arg2) {
		field1021 = arg1;
		field1022 = arg2;
		field1020 = new int[arg1 * arg2];
		field1023 = new DirectColorModel(32, 0xFF0000, 0xFF00, 255);
		field1025 = arg0.createImage(this);
		method374();
		arg0.prepareImage(field1025, this);
		method374();
		arg0.prepareImage(field1025, this);
		method374();
		arg0.prepareImage(field1025, this);
		method372();
	}

	@ObfuscatedName("OIDSBDUP.a(I)V")
	public void method372() {
		KNERFXXY.method279(field1022, field1021, field1020);
	}

	@ObfuscatedName("OIDSBDUP.a(IILjava/awt/Graphics;I)V")
	public void method373(int arg0, Graphics arg1, int arg2) {
		method374();
		arg1.drawImage(field1025, arg2, arg0, this);
	}

	public synchronized void addConsumer(ImageConsumer arg0) {
		field1024 = arg0;
		arg0.setDimensions(field1021, field1022);
		arg0.setProperties(null);
		arg0.setColorModel(field1023);
		arg0.setHints(14);
	}

	public synchronized boolean isConsumer(ImageConsumer arg0) {
		if (field1024 == arg0) {
			return true;
		}

		return false;
	}

	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (field1024 == arg0) {
			field1024 = null;
		}
	}

	public void startProduction(ImageConsumer arg0) {
		addConsumer(arg0);
	}

	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@ObfuscatedName("OIDSBDUP.a()V")
	public synchronized void method374() {
		if (field1024 != null) {
			field1024.setPixels(0, 0, field1021, field1022, field1023, field1020, 0, field1021);
			field1024.imageComplete(2);
		}
	}

	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
