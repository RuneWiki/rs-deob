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

@OriginalClass("client!mk")
public class class278 extends class240 {

    @OriginalMember(owner = "client!mk", name = "l", descriptor = "Ljava/awt/Component;")
    private Component field4769;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Ljava/awt/Component;III)V", line = 9)
    public final void method1124(Component arg0, int arg1, int arg2, int arg3) {
        this.field4002 = arg3;
        this.field4003 = new int[arg1 * arg3 + 1];
        this.field4006 = arg1;
        DataBufferInt var5 = new DataBufferInt(this.field4003, this.field4003.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field4002, this.field4006), var5, (Point) null);
        this.field3998 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field4769 = arg0;
        this.method1657(arg2);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IILjava/awt/Graphics;IIB)V", line = 29)
    public final void method1128(int arg0, int arg1, Graphics arg2, int arg3, int arg4, byte arg5) {
        if (arg5 != 62) {
            this.method1124((Component) null, 13, -78, 103);
        }
        Shape var7 = arg2.getClip();
        arg2.clipRect(arg3, arg1, arg0, arg4);
        arg2.drawImage(this.field3998, 0, 0, this.field4769);
        arg2.setClip(var7);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ILjava/awt/Graphics;BI)V", line = 44)
    public final void method1123(int arg0, Graphics arg1, byte arg2, int arg3) {
        if (arg2 < 51) {
            this.method1124((Component) null, -41, -120, -95);
        }
        arg1.drawImage(this.field3998, arg3, arg0, this.field4769);
    }
}
