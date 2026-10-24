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

@ObfuscatedName("ESGPTMPA")
public final class ESGPTMPA implements ImageProducer, ImageObserver {

	@ObfuscatedName("ESGPTMPA.d")
	public int field607;

	@ObfuscatedName("ESGPTMPA.e")
	public int field608;

	@ObfuscatedName("ESGPTMPA.c")
	public int[] field606;

	@ObfuscatedName("ESGPTMPA.f")
	public ColorModel field609;

	@ObfuscatedName("ESGPTMPA.h")
	public Image field611;

	@ObfuscatedName("ESGPTMPA.g")
	public ImageConsumer field610;

	public ESGPTMPA(int arg0, int arg1, Component arg2) {
		field607 = arg1;
		field608 = arg0;
		field606 = new int[arg0 * arg1];
		field609 = new DirectColorModel(32, 0xFF0000, 0xFF00, 255);
		field611 = arg2.createImage(this);
		method208();
		arg2.prepareImage(field611, this);
		method208();
		arg2.prepareImage(field611, this);
		method208();
		arg2.prepareImage(field611, this);
		method206();
	}

	@ObfuscatedName("ESGPTMPA.a(B)V")
	public void method206() {
		FVBHOYJF.method209(field606, field608, field607);
	}

	@ObfuscatedName("ESGPTMPA.a(Ljava/awt/Graphics;BII)V")
	public void method207(Graphics arg0, int arg1, int arg2) {
		method208();
		arg0.drawImage(field611, arg2, arg1, this);
	}

	public synchronized void addConsumer(ImageConsumer arg0) {
		field610 = arg0;
		arg0.setDimensions(field607, field608);
		arg0.setProperties(null);
		arg0.setColorModel(field609);
		arg0.setHints(14);
	}

	public synchronized boolean isConsumer(ImageConsumer arg0) {
		if (field610 == arg0) {
			return true;
		}

		return false;
	}

	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (field610 == arg0) {
			field610 = null;
		}
	}

	public void startProduction(ImageConsumer arg0) {
		addConsumer(arg0);
	}

	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@ObfuscatedName("ESGPTMPA.a()V")
	public synchronized void method208() {
		if (field610 != null) {
			field610.setPixels(0, 0, field607, field608, field609, field606, 0, field607);
			field610.imageComplete(2);
		}
	}

	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
