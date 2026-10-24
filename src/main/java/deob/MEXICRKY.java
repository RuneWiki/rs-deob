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

@ObfuscatedName("MEXICRKY")
public final class MEXICRKY implements ImageProducer, ImageObserver {

	@ObfuscatedName("MEXICRKY.e")
	public int field1002;

	@ObfuscatedName("MEXICRKY.f")
	public int field1003;

	@ObfuscatedName("MEXICRKY.d")
	public int[] field1001;

	@ObfuscatedName("MEXICRKY.g")
	public ColorModel field1004;

	@ObfuscatedName("MEXICRKY.i")
	public Image field1006;

	@ObfuscatedName("MEXICRKY.h")
	public ImageConsumer field1005;

	public MEXICRKY(int arg0, int arg1, Component arg2) {
		field1002 = arg1;
		field1003 = arg0;
		field1001 = new int[arg0 * arg1];
		field1004 = new DirectColorModel(32, 0xFF0000, 0xFF00, 255);
		field1006 = arg2.createImage(this);
		method362();
		arg2.prepareImage(field1006, this);
		method362();
		arg2.prepareImage(field1006, this);
		method362();
		arg2.prepareImage(field1006, this);
		method360();
	}

	@ObfuscatedName("MEXICRKY.a(I)V")
	public void method360() {
		UJSJLLWF.method479(field1001, field1002, field1003);
	}

	@ObfuscatedName("MEXICRKY.a(Ljava/awt/Graphics;IIB)V")
	public void method361(Graphics arg0, int arg1, int arg2) {
		method362();
		arg0.drawImage(field1006, arg1, arg2, this);
	}

	public synchronized void addConsumer(ImageConsumer arg0) {
		field1005 = arg0;
		arg0.setDimensions(field1002, field1003);
		arg0.setProperties(null);
		arg0.setColorModel(field1004);
		arg0.setHints(14);
	}

	public synchronized boolean isConsumer(ImageConsumer arg0) {
		if (field1005 == arg0) {
			return true;
		}

		return false;
	}

	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (field1005 == arg0) {
			field1005 = null;
		}
	}

	public void startProduction(ImageConsumer arg0) {
		addConsumer(arg0);
	}

	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@ObfuscatedName("MEXICRKY.a()V")
	public synchronized void method362() {
		if (field1005 != null) {
			field1005.setPixels(0, 0, field1002, field1003, field1004, field1001, 0, field1002);
			field1005.imageComplete(2);
		}
	}

	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
