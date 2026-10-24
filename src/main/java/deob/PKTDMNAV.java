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

@ObfuscatedName("PKTDMNAV")
public final class PKTDMNAV implements ImageProducer, ImageObserver {

	@ObfuscatedName("PKTDMNAV.d")
	public int field1080;

	@ObfuscatedName("PKTDMNAV.e")
	public int field1081;

	@ObfuscatedName("PKTDMNAV.c")
	public int[] field1079;

	@ObfuscatedName("PKTDMNAV.f")
	public ColorModel field1082;

	@ObfuscatedName("PKTDMNAV.h")
	public Image field1084;

	@ObfuscatedName("PKTDMNAV.g")
	public ImageConsumer field1083;

	public PKTDMNAV(int arg0, Component arg1, int arg2) {
		field1080 = arg0;
		field1081 = arg2;
		field1079 = new int[arg0 * arg2];
		field1082 = new DirectColorModel(32, 0xFF0000, 0xFF00, 255);
		field1084 = arg1.createImage(this);
		method401();
		arg1.prepareImage(field1084, this);
		method401();
		arg1.prepareImage(field1084, this);
		method401();
		arg1.prepareImage(field1084, this);
		method399();
	}

	@ObfuscatedName("PKTDMNAV.a(Z)V")
	public void method399() {
		TTGPXKMD.method427(field1079, field1081, field1080);
	}

	@ObfuscatedName("PKTDMNAV.a(BIILjava/awt/Graphics;)V")
	public void method400(int arg0, int arg1, Graphics arg2) {
		method401();
		arg2.drawImage(field1084, arg1, arg0, this);
	}

	public synchronized void addConsumer(ImageConsumer arg0) {
		field1083 = arg0;
		arg0.setDimensions(field1080, field1081);
		arg0.setProperties(null);
		arg0.setColorModel(field1082);
		arg0.setHints(14);
	}

	public synchronized boolean isConsumer(ImageConsumer arg0) {
		if (field1083 == arg0) {
			return true;
		}

		return false;
	}

	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (field1083 == arg0) {
			field1083 = null;
		}
	}

	public void startProduction(ImageConsumer arg0) {
		addConsumer(arg0);
	}

	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@ObfuscatedName("PKTDMNAV.a()V")
	public synchronized void method401() {
		if (field1083 != null) {
			field1083.setPixels(0, 0, field1080, field1081, field1082, field1079, 0, field1080);
			field1083.imageComplete(2);
		}
	}

	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
