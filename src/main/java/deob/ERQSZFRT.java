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

@ObfuscatedName("ERQSZFRT")
public final class ERQSZFRT implements ImageProducer, ImageObserver {

	@ObfuscatedName("ERQSZFRT.c")
	public int field568;

	@ObfuscatedName("ERQSZFRT.d")
	public int field569;

	@ObfuscatedName("ERQSZFRT.b")
	public int[] field567;

	@ObfuscatedName("ERQSZFRT.e")
	public ColorModel field570;

	@ObfuscatedName("ERQSZFRT.g")
	public Image field572;

	@ObfuscatedName("ERQSZFRT.f")
	public ImageConsumer field571;

	public ERQSZFRT(int arg0, int arg1, Component arg2) {
		field568 = arg1;
		field569 = arg0;
		field567 = new int[arg0 * arg1];
		field570 = new DirectColorModel(32, 0xFF0000, 0xFF00, 255);
		field572 = arg2.createImage(this);
		method175();
		arg2.prepareImage(field572, this);
		method175();
		arg2.prepareImage(field572, this);
		method175();
		arg2.prepareImage(field572, this);
		method173();
	}

	@ObfuscatedName("ERQSZFRT.a(Z)V")
	public void method173() {
		VMBJKBNJ.method542(field569, field568, field567);
	}

	@ObfuscatedName("ERQSZFRT.a(Ljava/awt/Graphics;ZII)V")
	public void method174(Graphics arg0, int arg1, int arg2) {
		method175();
		arg0.drawImage(field572, arg2, arg1, this);
	}

	public synchronized void addConsumer(ImageConsumer arg0) {
		field571 = arg0;
		arg0.setDimensions(field568, field569);
		arg0.setProperties(null);
		arg0.setColorModel(field570);
		arg0.setHints(14);
	}

	public synchronized boolean isConsumer(ImageConsumer arg0) {
		if (field571 == arg0) {
			return true;
		}

		return false;
	}

	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (field571 == arg0) {
			field571 = null;
		}
	}

	public void startProduction(ImageConsumer arg0) {
		addConsumer(arg0);
	}

	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@ObfuscatedName("ERQSZFRT.a()V")
	public synchronized void method175() {
		if (field571 != null) {
			field571.setPixels(0, 0, field568, field569, field570, field567, 0, field568);
			field571.imageComplete(2);
		}
	}

	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
