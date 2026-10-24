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

@ObfuscatedName("ZTWZAULT")
public final class ZTWZAULT implements ImageProducer, ImageObserver {

	@ObfuscatedName("ZTWZAULT.b")
	public int field1509;

	@ObfuscatedName("ZTWZAULT.c")
	public int field1510;

	@ObfuscatedName("ZTWZAULT.a")
	public int[] field1508;

	@ObfuscatedName("ZTWZAULT.d")
	public ColorModel field1511;

	@ObfuscatedName("ZTWZAULT.f")
	public Image field1513;

	@ObfuscatedName("ZTWZAULT.e")
	public ImageConsumer field1512;

	public ZTWZAULT(Component arg0, int arg1, int arg2) {
		field1509 = arg1;
		field1510 = arg2;
		field1508 = new int[arg1 * arg2];
		field1511 = new DirectColorModel(32, 0xFF0000, 0xFF00, 255);
		field1513 = arg0.createImage(this);
		method594();
		arg0.prepareImage(field1513, this);
		method594();
		arg0.prepareImage(field1513, this);
		method594();
		arg0.prepareImage(field1513, this);
		method592();
	}

	@ObfuscatedName("ZTWZAULT.a(I)V")
	public void method592() {
		CCFLBOBS.method138(field1510, field1508, field1509);
	}

	@ObfuscatedName("ZTWZAULT.a(Ljava/awt/Graphics;IZI)V")
	public void method593(Graphics arg0, int arg1, int arg2) {
		method594();
		arg0.drawImage(field1513, arg1, arg2, this);
	}

	public synchronized void addConsumer(ImageConsumer arg0) {
		field1512 = arg0;
		arg0.setDimensions(field1509, field1510);
		arg0.setProperties(null);
		arg0.setColorModel(field1511);
		arg0.setHints(14);
	}

	public synchronized boolean isConsumer(ImageConsumer arg0) {
		if (field1512 == arg0) {
			return true;
		}

		return false;
	}

	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (field1512 == arg0) {
			field1512 = null;
		}
	}

	public void startProduction(ImageConsumer arg0) {
		addConsumer(arg0);
	}

	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@ObfuscatedName("ZTWZAULT.a()V")
	public synchronized void method594() {
		if (field1512 != null) {
			field1512.setPixels(0, 0, field1509, field1510, field1511, field1508, 0, field1509);
			field1512.imageComplete(2);
		}
	}

	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
