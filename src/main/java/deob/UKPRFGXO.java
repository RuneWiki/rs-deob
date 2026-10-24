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

@ObfuscatedName("UKPRFGXO")
public final class UKPRFGXO implements ImageProducer, ImageObserver {

	@ObfuscatedName("UKPRFGXO.d")
	public int field1226;

	@ObfuscatedName("UKPRFGXO.e")
	public int field1227;

	@ObfuscatedName("UKPRFGXO.c")
	public int[] field1225;

	@ObfuscatedName("UKPRFGXO.f")
	public ColorModel field1228;

	@ObfuscatedName("UKPRFGXO.h")
	public Image field1230;

	@ObfuscatedName("UKPRFGXO.g")
	public ImageConsumer field1229;

	public UKPRFGXO(int arg0, Component arg1, int arg2) {
		field1226 = arg0;
		field1227 = arg2;
		field1225 = new int[arg0 * arg2];
		field1228 = new DirectColorModel(32, 0xFF0000, 0xFF00, 255);
		field1230 = arg1.createImage(this);
		method465();
		arg1.prepareImage(field1230, this);
		method465();
		arg1.prepareImage(field1230, this);
		method465();
		arg1.prepareImage(field1230, this);
		method463();
	}

	@ObfuscatedName("UKPRFGXO.a(B)V")
	public void method463() {
		IFHRXNFO.method310(field1227, field1225, field1226);
	}

	@ObfuscatedName("UKPRFGXO.a(ZILjava/awt/Graphics;I)V")
	public void method464(int arg0, Graphics arg1, int arg2) {
		method465();
		arg1.drawImage(field1230, arg2, arg0, this);
	}

	public synchronized void addConsumer(ImageConsumer arg0) {
		field1229 = arg0;
		arg0.setDimensions(field1226, field1227);
		arg0.setProperties(null);
		arg0.setColorModel(field1228);
		arg0.setHints(14);
	}

	public synchronized boolean isConsumer(ImageConsumer arg0) {
		if (field1229 == arg0) {
			return true;
		}

		return false;
	}

	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (field1229 == arg0) {
			field1229 = null;
		}
	}

	public void startProduction(ImageConsumer arg0) {
		addConsumer(arg0);
	}

	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@ObfuscatedName("UKPRFGXO.a()V")
	public synchronized void method465() {
		if (field1229 != null) {
			field1229.setPixels(0, 0, field1226, field1227, field1228, field1225, 0, field1226);
			field1229.imageComplete(2);
		}
	}

	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
