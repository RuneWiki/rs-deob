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

@ObfuscatedName("IOGVZQTL")
public final class IOGVZQTL implements ImageProducer, ImageObserver {

	@ObfuscatedName("IOGVZQTL.d")
	public int field725;

	@ObfuscatedName("IOGVZQTL.e")
	public int field726;

	@ObfuscatedName("IOGVZQTL.c")
	public int[] field724;

	@ObfuscatedName("IOGVZQTL.f")
	public ColorModel field727;

	@ObfuscatedName("IOGVZQTL.h")
	public Image field729;

	@ObfuscatedName("IOGVZQTL.g")
	public ImageConsumer field728;

	public IOGVZQTL(int arg0, int arg1, Component arg2) {
		field725 = arg0;
		field726 = arg1;
		field724 = new int[arg0 * arg1];
		field727 = new DirectColorModel(32, 0xFF0000, 0xFF00, 255);
		field729 = arg2.createImage(this);
		method323();
		arg2.prepareImage(field729, this);
		method323();
		arg2.prepareImage(field729, this);
		method323();
		arg2.prepareImage(field729, this);
		method321();
	}

	@ObfuscatedName("IOGVZQTL.a(I)V")
	public void method321() {
		TYMHEFTS.method523(field724, field726, field725);
	}

	@ObfuscatedName("IOGVZQTL.a(ILjava/awt/Graphics;IB)V")
	public void method322(int arg0, Graphics arg1, int arg2) {
		method323();
		arg1.drawImage(field729, arg2, arg0, this);
	}

	public synchronized void addConsumer(ImageConsumer arg0) {
		field728 = arg0;
		arg0.setDimensions(field725, field726);
		arg0.setProperties(null);
		arg0.setColorModel(field727);
		arg0.setHints(14);
	}

	public synchronized boolean isConsumer(ImageConsumer arg0) {
		if (field728 == arg0) {
			return true;
		}

		return false;
	}

	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (field728 == arg0) {
			field728 = null;
		}
	}

	public void startProduction(ImageConsumer arg0) {
		addConsumer(arg0);
	}

	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@ObfuscatedName("IOGVZQTL.a()V")
	public synchronized void method323() {
		if (field728 != null) {
			field728.setPixels(0, 0, field725, field726, field727, field724, 0, field725);
			field728.imageComplete(2);
		}
	}

	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
