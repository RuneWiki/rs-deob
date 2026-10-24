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

@ObfuscatedName("VFZXUVTW")
public final class VFZXUVTW implements ImageProducer, ImageObserver {

	@ObfuscatedName("VFZXUVTW.d")
	public int field1321;

	@ObfuscatedName("VFZXUVTW.e")
	public int field1322;

	@ObfuscatedName("VFZXUVTW.c")
	public int[] field1320;

	@ObfuscatedName("VFZXUVTW.f")
	public ColorModel field1323;

	@ObfuscatedName("VFZXUVTW.h")
	public Image field1325;

	@ObfuscatedName("VFZXUVTW.g")
	public ImageConsumer field1324;

	public VFZXUVTW(int arg0, int arg1, Component arg2) {
		field1321 = arg1;
		field1322 = arg0;
		field1320 = new int[arg0 * arg1];
		field1323 = new DirectColorModel(32, 0xFF0000, 0xFF00, 255);
		field1325 = arg2.createImage(this);
		method543();
		arg2.prepareImage(field1325, this);
		method543();
		arg2.prepareImage(field1325, this);
		method543();
		arg2.prepareImage(field1325, this);
		method541();
	}

	@ObfuscatedName("VFZXUVTW.a(B)V")
	public void method541() {
		MVOWZCMY.method340(field1322, field1321, field1320);
	}

	@ObfuscatedName("VFZXUVTW.a(IIILjava/awt/Graphics;)V")
	public void method542(int arg0, int arg1, Graphics arg2) {
		method543();
		arg2.drawImage(field1325, arg1, arg0, this);
	}

	public synchronized void addConsumer(ImageConsumer arg0) {
		field1324 = arg0;
		arg0.setDimensions(field1321, field1322);
		arg0.setProperties(null);
		arg0.setColorModel(field1323);
		arg0.setHints(14);
	}

	public synchronized boolean isConsumer(ImageConsumer arg0) {
		if (field1324 == arg0) {
			return true;
		}

		return false;
	}

	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (field1324 == arg0) {
			field1324 = null;
		}
	}

	public void startProduction(ImageConsumer arg0) {
		addConsumer(arg0);
	}

	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@ObfuscatedName("VFZXUVTW.a()V")
	public synchronized void method543() {
		if (field1324 != null) {
			field1324.setPixels(0, 0, field1321, field1322, field1323, field1320, 0, field1321);
			field1324.imageComplete(2);
		}
	}

	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
