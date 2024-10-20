package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

@ObfuscatedName("dk")
public final class class119 extends class41 {

    @ObfuscatedName("dk.c")
    public Component field1575;

    @ObfuscatedName("dk.q(IILjava/awt/Component;I)V")
    public final void method533(int arg0, int arg1, Component arg2) {
        this.field547 = arg0;
        this.field548 = arg1;
        this.field549 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field549, this.field549.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field547, this.field548), var4, (Point) null);
        this.field546 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field1575 = arg2;
        this.method524();
    }

    @ObfuscatedName("dk.o(Ljava/awt/Graphics;III)V")
    public final void method531(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field546, arg1, arg2, this.field1575);
    }

    @ObfuscatedName("dk.c(Ljava/awt/Graphics;IIIII)V")
    public final void method526(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field546, 0, 0, this.field1575);
        arg0.setClip(var6);
    }
}
