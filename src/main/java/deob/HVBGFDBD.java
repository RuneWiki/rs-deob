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

@ObfuscatedName("HVBGFDBD")
public final class HVBGFDBD implements ImageProducer, ImageObserver {

	@ObfuscatedName("HVBGFDBD.d")
	public int field670;

	@ObfuscatedName("HVBGFDBD.e")
	public int field671;

	@ObfuscatedName("HVBGFDBD.c")
	public int[] field669;

	@ObfuscatedName("HVBGFDBD.f")
	public ColorModel field672;

	@ObfuscatedName("HVBGFDBD.h")
	public Image field674;

	@ObfuscatedName("HVBGFDBD.g")
	public ImageConsumer field673;

	public HVBGFDBD(Component arg0, int arg1, int arg2) {
		field670 = arg2;
		field671 = arg1;
		field669 = new int[arg1 * arg2];
		field672 = new DirectColorModel(32, 0xFF0000, 0xFF00, 255);
		field674 = arg0.createImage(this);
		method225();
		arg0.prepareImage(field674, this);
		method225();
		arg0.prepareImage(field674, this);
		method225();
		arg0.prepareImage(field674, this);
		method223();
	}

	@ObfuscatedName("HVBGFDBD.a(I)V")
	public void method223() {
		WNEQSCWL.method568(field669, field670, field671);
	}

	@ObfuscatedName("HVBGFDBD.a(Ljava/awt/Graphics;III)V")
	public void method224(Graphics arg0, int arg1, int arg2) {
		method225();
		arg0.drawImage(field674, arg2, arg1, this);
	}

	public synchronized void addConsumer(ImageConsumer arg0) {
		field673 = arg0;
		arg0.setDimensions(field670, field671);
		arg0.setProperties(null);
		arg0.setColorModel(field672);
		arg0.setHints(14);
	}

	public synchronized boolean isConsumer(ImageConsumer arg0) {
		if (field673 == arg0) {
			return true;
		}

		return false;
	}

	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (field673 == arg0) {
			field673 = null;
		}
	}

	public void startProduction(ImageConsumer arg0) {
		addConsumer(arg0);
	}

	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@ObfuscatedName("HVBGFDBD.a()V")
	public synchronized void method225() {
		if (field673 != null) {
			field673.setPixels(0, 0, field670, field671, field672, field669, 0, field670);
			field673.imageComplete(2);
		}
	}

	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
