package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;

@ObfuscatedName("dp")
public final class class117 extends class40 implements ImageProducer, ImageObserver {

    @ObfuscatedName("dp.k")
    public ColorModel field1557;

    @ObfuscatedName("dp.r")
    public ImageConsumer field1556;

    @ObfuscatedName("dp.t(IILjava/awt/Component;B)V")
    public final void method527(int arg0, int arg1, Component arg2) {
        this.field535 = arg0;
        this.field534 = arg1;
        this.field533 = new int[arg0 * arg1 + 1];
        this.field1557 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field536 = arg2.createImage(this);
        this.method1423();
        arg2.prepareImage(this.field536, this);
        this.method1423();
        arg2.prepareImage(this.field536, this);
        this.method1423();
        arg2.prepareImage(this.field536, this);
        this.method528();
    }

    @ObfuscatedName("dp.h(Ljava/awt/Graphics;III)V")
    public final void method526(Graphics arg0, int arg1, int arg2) {
        this.method1423();
        arg0.drawImage(this.field536, arg1, arg2, this);
    }

    @ObfuscatedName("dp.k(Ljava/awt/Graphics;IIIII)V")
    public final void method530(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1424(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field536, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1556 = arg0;
        arg0.setDimensions(this.field535, this.field534);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1557);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1556 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1556 == arg0) {
            this.field1556 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("dp.u(I)V")
    public synchronized void method1423() {
        if (this.field1556 != null) {
            this.field1556.setPixels(0, 0, this.field535, this.field534, this.field1557, this.field533, 0, this.field535);
            this.field1556.imageComplete(2);
        }
    }

    @ObfuscatedName("dp.m(IIIIB)V")
    public synchronized void method1424(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1556 != null) {
            this.field1556.setPixels(arg0, arg1, arg2, arg3, this.field1557, this.field533, this.field535 * arg1 + arg0, this.field535);
            this.field1556.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
