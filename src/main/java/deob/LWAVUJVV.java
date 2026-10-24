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

@ObfuscatedName("LWAVUJVV")
public final class LWAVUJVV implements ImageProducer, ImageObserver {

	@ObfuscatedName("LWAVUJVV.c")
	public int field1062;

	@ObfuscatedName("LWAVUJVV.d")
	public int field1063;

	@ObfuscatedName("LWAVUJVV.b")
	public int[] field1061;

	@ObfuscatedName("LWAVUJVV.e")
	public ColorModel field1064;

	@ObfuscatedName("LWAVUJVV.g")
	public Image field1066;

	@ObfuscatedName("LWAVUJVV.f")
	public ImageConsumer field1065;

	public LWAVUJVV(int arg0, int arg1, Component arg2) {
		field1062 = arg0;
		field1063 = arg1;
		field1061 = new int[arg0 * arg1];
		field1064 = new DirectColorModel(32, 0xFF0000, 0xFF00, 255);
		field1066 = arg2.createImage(this);
		method378();
		arg2.prepareImage(field1066, this);
		method378();
		arg2.prepareImage(field1066, this);
		method378();
		arg2.prepareImage(field1066, this);
		method376();
	}

	@ObfuscatedName("LWAVUJVV.a(I)V")
	public void method376() {
		RSDCQVXF.method453(field1062, field1061, field1063);
	}

	@ObfuscatedName("LWAVUJVV.a(Ljava/awt/Graphics;III)V")
	public void method377(Graphics arg0, int arg1, int arg2) {
		method378();
		arg0.drawImage(field1066, arg1, arg2, this);
	}

	public synchronized void addConsumer(ImageConsumer arg0) {
		field1065 = arg0;
		arg0.setDimensions(field1062, field1063);
		arg0.setProperties(null);
		arg0.setColorModel(field1064);
		arg0.setHints(14);
	}

	public synchronized boolean isConsumer(ImageConsumer arg0) {
		if (field1065 == arg0) {
			return true;
		}

		return false;
	}

	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (field1065 == arg0) {
			field1065 = null;
		}
	}

	public void startProduction(ImageConsumer arg0) {
		addConsumer(arg0);
	}

	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@ObfuscatedName("LWAVUJVV.a()V")
	public synchronized void method378() {
		if (field1065 != null) {
			field1065.setPixels(0, 0, field1062, field1063, field1064, field1061, 0, field1062);
			field1065.imageComplete(2);
		}
	}

	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
