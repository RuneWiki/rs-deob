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

@ObfuscatedName("NMOELDRY")
public final class NMOELDRY implements ImageProducer, ImageObserver {

	@ObfuscatedName("NMOELDRY.d")
	public int field1197;

	@ObfuscatedName("NMOELDRY.e")
	public int field1198;

	@ObfuscatedName("NMOELDRY.c")
	public int[] field1196;

	@ObfuscatedName("NMOELDRY.f")
	public ColorModel field1199;

	@ObfuscatedName("NMOELDRY.h")
	public Image field1201;

	@ObfuscatedName("NMOELDRY.g")
	public ImageConsumer field1200;

	public NMOELDRY(int arg0, int arg1, Component arg2) {
		field1197 = arg1;
		field1198 = arg0;
		field1196 = new int[arg0 * arg1];
		field1199 = new DirectColorModel(32, 0xFF0000, 0xFF00, 255);
		field1201 = arg2.createImage(this);
		method511();
		arg2.prepareImage(field1201, this);
		method511();
		arg2.prepareImage(field1201, this);
		method511();
		arg2.prepareImage(field1201, this);
		method509();
	}

	@ObfuscatedName("NMOELDRY.a(B)V")
	public void method509() {
		CYEOWDOP.method224(field1198, field1197, field1196);
	}

	@ObfuscatedName("NMOELDRY.a(IILjava/awt/Graphics;Z)V")
	public void method510(int arg0, int arg1, Graphics arg2) {
		method511();
		arg2.drawImage(field1201, arg0, arg1, this);
	}

	public synchronized void addConsumer(ImageConsumer arg0) {
		field1200 = arg0;
		arg0.setDimensions(field1197, field1198);
		arg0.setProperties(null);
		arg0.setColorModel(field1199);
		arg0.setHints(14);
	}

	public synchronized boolean isConsumer(ImageConsumer arg0) {
		if (field1200 == arg0) {
			return true;
		}

		return false;
	}

	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (field1200 == arg0) {
			field1200 = null;
		}
	}

	public void startProduction(ImageConsumer arg0) {
		addConsumer(arg0);
	}

	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@ObfuscatedName("NMOELDRY.a()V")
	public synchronized void method511() {
		if (field1200 != null) {
			field1200.setPixels(0, 0, field1197, field1198, field1199, field1196, 0, field1197);
			field1200.imageComplete(2);
		}
	}

	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
