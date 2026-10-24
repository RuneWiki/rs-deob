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

@ObfuscatedName("YZGYDKDO")
public final class YZGYDKDO implements ImageProducer, ImageObserver {

	@ObfuscatedName("YZGYDKDO.b")
	public int field1501;

	@ObfuscatedName("YZGYDKDO.c")
	public int field1502;

	@ObfuscatedName("YZGYDKDO.a")
	public int[] field1500;

	@ObfuscatedName("YZGYDKDO.d")
	public ColorModel field1503;

	@ObfuscatedName("YZGYDKDO.f")
	public Image field1505;

	@ObfuscatedName("YZGYDKDO.e")
	public ImageConsumer field1504;

	public YZGYDKDO(Component arg0, int arg1, int arg2) {
		field1501 = arg1;
		field1502 = arg2;
		field1500 = new int[arg1 * arg2];
		field1503 = new DirectColorModel(32, 0xFF0000, 0xFF00, 255);
		field1505 = arg0.createImage(this);
		method586();
		arg0.prepareImage(field1505, this);
		method586();
		arg0.prepareImage(field1505, this);
		method586();
		arg0.prepareImage(field1505, this);
		method584();
	}

	@ObfuscatedName("YZGYDKDO.a(I)V")
	public void method584() {
		BDJXDJBP.method24(field1501, field1502, field1500);
	}

	@ObfuscatedName("YZGYDKDO.a(Ljava/awt/Graphics;III)V")
	public void method585(Graphics arg0, int arg1, int arg2) {
		method586();
		arg0.drawImage(field1505, arg2, arg1, this);
	}

	public synchronized void addConsumer(ImageConsumer arg0) {
		field1504 = arg0;
		arg0.setDimensions(field1501, field1502);
		arg0.setProperties(null);
		arg0.setColorModel(field1503);
		arg0.setHints(14);
	}

	public synchronized boolean isConsumer(ImageConsumer arg0) {
		if (field1504 == arg0) {
			return true;
		}

		return false;
	}

	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (field1504 == arg0) {
			field1504 = null;
		}
	}

	public void startProduction(ImageConsumer arg0) {
		addConsumer(arg0);
	}

	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@ObfuscatedName("YZGYDKDO.a()V")
	public synchronized void method586() {
		if (field1504 != null) {
			field1504.setPixels(0, 0, field1501, field1502, field1503, field1500, 0, field1501);
			field1504.imageComplete(2);
		}
	}

	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
