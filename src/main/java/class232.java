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

@OriginalClass("client!eg")
public class class232 extends class257 {

    @OriginalMember(owner = "client!eg", name = "k", descriptor = "Ljava/awt/Component;")
    private Component field3608;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ILjava/awt/Graphics;IIIB)V")
    public final void method235(int arg0, Graphics arg1, int arg2, int arg3, int arg4, byte arg5) {
        Shape var7 = arg1.getClip();
        arg1.clipRect(arg2, arg3, arg4, arg0);
        arg1.drawImage(this.field3942, 0, 0, this.field3608);
        arg1.setClip(var7);
        if (arg5 != -104) {
            this.field3608 = (Component) null;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(BILjava/awt/Component;I)V")
    public final void method234(byte arg0, int arg1, Component arg2, int arg3) {
        this.field3938 = arg3;
        int var5 = 43 / ((-arg0 - 42) / 34);
        this.field3940 = new int[arg1 * arg3 + 1];
        this.field3941 = arg1;
        DataBufferInt var6 = new DataBufferInt(this.field3940, this.field3940.length);
        DirectColorModel var7 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var8 = Raster.createWritableRaster(var7.createCompatibleSampleModel(this.field3941, this.field3938), var6, (Point) null);
        this.field3942 = new BufferedImage(var7, var8, false, new Hashtable());
        this.field3608 = arg2;
        this.method1710(18814);
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public final void method232(int arg0, int arg1, int arg2, Graphics arg3) {
        if (arg0 != 27378) {
            this.method235(-39, (Graphics) null, -6, 90, -123, (byte) 40);
        }
        arg3.drawImage(this.field3942, arg2, arg1, this.field3608);
    }
}
