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

@ObfuscatedName("HURULSIZ")
public final class HURULSIZ implements ImageProducer, ImageObserver {

	@ObfuscatedName("HURULSIZ.c")
	public int field851;

	@ObfuscatedName("HURULSIZ.d")
	public int field852;

	@ObfuscatedName("HURULSIZ.b")
	public int[] field850;

	@ObfuscatedName("HURULSIZ.e")
	public ColorModel field853;

	@ObfuscatedName("HURULSIZ.g")
	public Image field855;

	@ObfuscatedName("HURULSIZ.f")
	public ImageConsumer field854;

	public HURULSIZ(int arg0, int arg1, Component arg2) {
		field851 = arg1;
		field852 = arg0;
		field850 = new int[arg0 * arg1];
		field853 = new DirectColorModel(32, 0xFF0000, 0xFF00, 255);
		field855 = arg2.createImage(this);
		method300();
		arg2.prepareImage(field855, this);
		method300();
		arg2.prepareImage(field855, this);
		method300();
		arg2.prepareImage(field855, this);
		method298();
	}

	@ObfuscatedName("HURULSIZ.a(I)V")
	public void method298() {
		GBJWVQAY.method284(field852, field851, field850);
	}

	@ObfuscatedName("HURULSIZ.a(Ljava/awt/Graphics;III)V")
	public void method299(Graphics arg0, int arg1, int arg2) {
		method300();
		arg0.drawImage(field855, arg1, arg2, this);
	}

	public synchronized void addConsumer(ImageConsumer arg0) {
		field854 = arg0;
		arg0.setDimensions(field851, field852);
		arg0.setProperties(null);
		arg0.setColorModel(field853);
		arg0.setHints(14);
	}

	public synchronized boolean isConsumer(ImageConsumer arg0) {
		if (field854 == arg0) {
			return true;
		}

		return false;
	}

	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (field854 == arg0) {
			field854 = null;
		}
	}

	public void startProduction(ImageConsumer arg0) {
		addConsumer(arg0);
	}

	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@ObfuscatedName("HURULSIZ.a()V")
	public synchronized void method300() {
		if (field854 != null) {
			field854.setPixels(0, 0, field851, field852, field853, field850, 0, field851);
			field854.imageComplete(2);
		}
	}

	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
