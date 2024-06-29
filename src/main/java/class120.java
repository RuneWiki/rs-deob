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

@OriginalClass("client!sb")
public class class120 extends class159 {

    @OriginalMember(owner = "client!sb", name = "s", descriptor = "Ljava/awt/Component;")
    private Component field2123;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BILjava/awt/Component;I)V", line = 9)
    public final void method450(byte arg0, int arg1, Component arg2, int arg3) {
        this.field2834 = arg3;
        this.field2833 = new int[arg1 * arg3 + 1];
        this.field2839 = arg1;
        DataBufferInt var5 = new DataBufferInt(this.field2833, this.field2833.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field2839, this.field2834), var5, (Point) null);
        this.field2837 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field2123 = arg2;
        if (arg0 != -91) {
            this.field2123 = (Component) null;
        }
        this.method1182(48);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V", line = 30)
    public final void method446(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5) {
        if (arg1 >= -87) {
            this.field2123 = (Component) null;
        }
        Shape var7 = arg5.getClip();
        arg5.clipRect(arg3, arg2, arg0, arg4);
        arg5.drawImage(this.field2837, 0, 0, this.field2123);
        arg5.setClip(var7);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IBILjava/awt/Graphics;)V", line = 44)
    public final void method452(int arg0, byte arg1, int arg2, Graphics arg3) {
        if (arg1 != -16) {
            this.method450((byte) 63, -107, (Component) null, -39);
        }
        arg3.drawImage(this.field2837, arg0, arg2, this.field2123);
    }
}
