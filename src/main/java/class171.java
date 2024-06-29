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
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class171 extends class160 {

    @OriginalMember(owner = "client!t", name = "s", descriptor = "Ljava/awt/Component;")
    private Component field3340;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIILjava/awt/Component;)V")
    public final void method1098(int arg0, int arg1, int arg2, Component arg3) {
        this.field3104 = new int[arg0 * arg2 + 1];
        if (arg1 != -1) {
            this.method1100(null, 8, (byte) 64, -81, 58, -51);
        }
        this.field3112 = arg0;
        this.field3110 = arg2;
        DataBufferInt var5 = new DataBufferInt(this.field3104, this.field3104.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field3112, this.field3110), var5, null);
        this.field3111 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field3340 = arg3;
        this.method1096(false);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Ljava/awt/Graphics;IBIII)V")
    public final void method1100(Graphics arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        int var7 = -75 % ((arg2 + 47) / 47);
        Shape var8 = arg0.getClip();
        arg0.clipRect(arg1, arg4, arg5, arg3);
        arg0.drawImage(this.field3111, 0, 0, this.field3340);
        arg0.setClip(var8);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
    public final void method1095(Graphics arg0, int arg1, int arg2, int arg3) {
        if (arg3 != -1) {
            this.method1095(null, -49, -38, 5);
        }
        arg0.drawImage(this.field3111, arg2, arg1, this.field3340);
    }
}
