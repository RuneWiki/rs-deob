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

@ObfuscatedName("PFNLOREN")
public final class PFNLOREN implements ImageProducer, ImageObserver {

	@ObfuscatedName("PFNLOREN.c")
	public int field1070;

	@ObfuscatedName("PFNLOREN.d")
	public int field1071;

	@ObfuscatedName("PFNLOREN.b")
	public int[] field1069;

	@ObfuscatedName("PFNLOREN.e")
	public ColorModel field1072;

	@ObfuscatedName("PFNLOREN.g")
	public Image field1074;

	@ObfuscatedName("PFNLOREN.f")
	public ImageConsumer field1073;

	public PFNLOREN(int arg0, Component arg1, int arg2) {
		field1070 = arg0;
		field1071 = arg2;
		field1069 = new int[arg0 * arg2];
		field1072 = new DirectColorModel(32, 0xFF0000, 0xFF00, 255);
		field1074 = arg1.createImage(this);
		method467();
		arg1.prepareImage(field1074, this);
		method467();
		arg1.prepareImage(field1074, this);
		method467();
		arg1.prepareImage(field1074, this);
		method465();
	}

	@ObfuscatedName("PFNLOREN.a(Z)V")
	public void method465() {
		OMVHXJFV.method415(field1069, field1071, field1070);
	}

	@ObfuscatedName("PFNLOREN.a(ILjava/awt/Graphics;II)V")
	public void method466(Graphics arg0, int arg1, int arg2) {
		method467();
		arg0.drawImage(field1074, arg2, arg1, this);
	}

	public synchronized void addConsumer(ImageConsumer arg0) {
		field1073 = arg0;
		arg0.setDimensions(field1070, field1071);
		arg0.setProperties(null);
		arg0.setColorModel(field1072);
		arg0.setHints(14);
	}

	public synchronized boolean isConsumer(ImageConsumer arg0) {
		if (field1073 == arg0) {
			return true;
		}

		return false;
	}

	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (field1073 == arg0) {
			field1073 = null;
		}
	}

	public void startProduction(ImageConsumer arg0) {
		addConsumer(arg0);
	}

	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@ObfuscatedName("PFNLOREN.a()V")
	public synchronized void method467() {
		if (field1073 != null) {
			field1073.setPixels(0, 0, field1070, field1071, field1072, field1069, 0, field1070);
			field1073.imageComplete(2);
		}
	}

	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
