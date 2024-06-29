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

@OriginalClass("client!wc")
public class class229 extends class273 {

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "Ljava/awt/Component;")
    private Component field3998;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IILjava/awt/Component;B)V")
    public final void method1469(int arg0, int arg1, Component arg2, byte arg3) {
        if (arg3 > -16) {
            this.method1469(40, 21, (Component) null, (byte) 77);
        }
        this.field4914 = new int[arg0 * arg1 + 1];
        this.field4905 = arg0;
        this.field4909 = arg1;
        DataBufferInt var5 = new DataBufferInt(this.field4914, this.field4914.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field4909, this.field4905), var5, (Point) null);
        this.field4902 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field3998 = arg2;
        this.method1895(0);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public final void method1472(int arg0, int arg1, int arg2, Graphics arg3) {
        arg3.drawImage(this.field4902, arg1, arg2, this.field3998);
        if (arg0 != 1000) {
            this.method1472(86, 97, 53, (Graphics) null);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BIIIILjava/awt/Graphics;)V")
    public final void method1467(byte arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5) {
        if (arg0 != -6) {
            this.method1469(-83, -22, (Component) null, (byte) -103);
        }
        Shape var7 = arg5.getClip();
        arg5.clipRect(arg3, arg4, arg2, arg1);
        arg5.drawImage(this.field4902, 0, 0, this.field3998);
        arg5.setClip(var7);
    }
}
