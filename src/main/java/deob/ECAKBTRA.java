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

@ObfuscatedName("ECAKBTRA")
public final class ECAKBTRA implements ImageProducer, ImageObserver {

	@ObfuscatedName("ECAKBTRA.d")
	public int field753;

	@ObfuscatedName("ECAKBTRA.e")
	public int field754;

	@ObfuscatedName("ECAKBTRA.c")
	public int[] field752;

	@ObfuscatedName("ECAKBTRA.f")
	public ColorModel field755;

	@ObfuscatedName("ECAKBTRA.h")
	public Image field757;

	@ObfuscatedName("ECAKBTRA.g")
	public ImageConsumer field756;

	public ECAKBTRA(int arg0, Component arg1, int arg2) {
		field753 = arg2;
		field754 = arg0;
		field752 = new int[arg0 * arg2];
		field755 = new DirectColorModel(32, 0xFF0000, 0xFF00, 255);
		field757 = arg1.createImage(this);
		method214();
		arg1.prepareImage(field757, this);
		method214();
		arg1.prepareImage(field757, this);
		method214();
		arg1.prepareImage(field757, this);
		method212();
	}

	@ObfuscatedName("ECAKBTRA.a(I)V")
	public void method212() {
		LRYUPGSZ.method264(field753, field752, field754);
	}

	@ObfuscatedName("ECAKBTRA.a(IILjava/awt/Graphics;I)V")
	public void method213(int arg0, Graphics arg1, int arg2) {
		method214();
		arg1.drawImage(field757, arg0, arg2, this);
	}

	public synchronized void addConsumer(ImageConsumer arg0) {
		field756 = arg0;
		arg0.setDimensions(field753, field754);
		arg0.setProperties(null);
		arg0.setColorModel(field755);
		arg0.setHints(14);
	}

	public synchronized boolean isConsumer(ImageConsumer arg0) {
		if (field756 == arg0) {
			return true;
		}

		return false;
	}

	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (field756 == arg0) {
			field756 = null;
		}
	}

	public void startProduction(ImageConsumer arg0) {
		addConsumer(arg0);
	}

	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@ObfuscatedName("ECAKBTRA.a()V")
	public synchronized void method214() {
		if (field756 != null) {
			field756.setPixels(0, 0, field753, field754, field755, field752, 0, field753);
			field756.imageComplete(2);
		}
	}

	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
