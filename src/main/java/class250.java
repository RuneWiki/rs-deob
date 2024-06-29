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

@OriginalClass("client!ca")
public class class250 extends class223 {

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "Ljava/awt/Component;")
    private Component field4300;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILjava/awt/Graphics;ZI)V")
    public final void method361(int arg0, Graphics arg1, boolean arg2, int arg3) {
        if (arg2) {
            arg1.drawImage(this.field3908, arg0, arg3, this.field4300);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
    public final void method359(int arg0, int arg1, int arg2, Graphics arg3, int arg4, int arg5) {
        int var7 = -116 % ((67 - arg4) / 35);
        Shape var8 = arg3.getClip();
        arg3.clipRect(arg2, arg1, arg0, arg5);
        arg3.drawImage(this.field3908, 0, 0, this.field4300);
        arg3.setClip(var8);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Ljava/awt/Component;IIB)V")
    public final void method366(Component arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != 103) {
            this.method361(-16, (Graphics) null, false, 120);
        }
        this.field3909 = arg1;
        this.field3910 = arg2;
        this.field3905 = new int[arg1 * arg2 + 1];
        DataBufferInt var5 = new DataBufferInt(this.field3905, this.field3905.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field3909, this.field3910), var5, (Point) null);
        this.field3908 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field4300 = arg0;
        this.method1511((byte) 34);
    }
}
