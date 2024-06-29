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

@OriginalClass("client!pe")
public class class109 extends class130 {

    @OriginalMember(owner = "client!pe", name = "v", descriptor = "Ljava/awt/Component;")
    private Component field2623;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILjava/awt/Graphics;IIII)V")
    public final void method855(int arg0, Graphics arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != 32) {
            this.method856(-9, null, 104, (byte) 96);
        }
        Shape var7 = arg1.getClip();
        arg1.clipRect(arg5, arg2, arg3, arg4);
        arg1.drawImage(this.field2914, 0, 0, this.field2623);
        arg1.setClip(var7);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILjava/awt/Component;IB)V")
    public final void method856(int arg0, Component arg1, int arg2, byte arg3) {
        this.field2921 = arg0;
        this.field2926 = arg2;
        this.field2932 = new int[arg0 * arg2 + 1];
        DataBufferInt var5 = new DataBufferInt(this.field2932, this.field2932.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field2921, this.field2926), var5, null);
        this.field2914 = new BufferedImage(var6, var7, false, new Hashtable());
        if (arg3 >= 54) {
            this.field2623 = arg1;
            this.method999(-16);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public final void method857(int arg0, int arg1, Graphics arg2, int arg3) {
        arg2.drawImage(this.field2914, arg0, arg3, this.field2623);
        if (arg1 != 0) {
            this.method857(-83, 94, null, 50);
        }
    }
}
