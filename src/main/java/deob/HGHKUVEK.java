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

@ObfuscatedName("HGHKUVEK")
public final class HGHKUVEK implements ImageProducer, ImageObserver {

	@ObfuscatedName("HGHKUVEK.c")
	public int field858;

	@ObfuscatedName("HGHKUVEK.d")
	public int field859;

	@ObfuscatedName("HGHKUVEK.b")
	public int[] field857;

	@ObfuscatedName("HGHKUVEK.e")
	public ColorModel field860;

	@ObfuscatedName("HGHKUVEK.g")
	public Image field862;

	@ObfuscatedName("HGHKUVEK.f")
	public ImageConsumer field861;

	public HGHKUVEK(Component arg0, int arg1, int arg2) {
		field858 = arg1;
		field859 = arg2;
		field857 = new int[arg1 * arg2];
		field860 = new DirectColorModel(32, 0xFF0000, 0xFF00, 255);
		field862 = arg0.createImage(this);
		method275();
		arg0.prepareImage(field862, this);
		method275();
		arg0.prepareImage(field862, this);
		method275();
		arg0.prepareImage(field862, this);
		method273();
	}

	@ObfuscatedName("HGHKUVEK.a(I)V")
	public void method273() {
		KPYGFVMA.method310(field858, field859, field857);
	}

	@ObfuscatedName("HGHKUVEK.a(Ljava/awt/Graphics;III)V")
	public void method274(Graphics arg0, int arg1, int arg2) {
		method275();
		arg0.drawImage(field862, arg1, arg2, this);
	}

	public synchronized void addConsumer(ImageConsumer arg0) {
		field861 = arg0;
		arg0.setDimensions(field858, field859);
		arg0.setProperties(null);
		arg0.setColorModel(field860);
		arg0.setHints(14);
	}

	public synchronized boolean isConsumer(ImageConsumer arg0) {
		if (field861 == arg0) {
			return true;
		}

		return false;
	}

	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (field861 == arg0) {
			field861 = null;
		}
	}

	public void startProduction(ImageConsumer arg0) {
		addConsumer(arg0);
	}

	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@ObfuscatedName("HGHKUVEK.a()V")
	public synchronized void method275() {
		if (field861 != null) {
			field861.setPixels(0, 0, field858, field859, field860, field857, 0, field858);
			field861.imageComplete(2);
		}
	}

	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
