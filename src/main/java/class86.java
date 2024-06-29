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

@OriginalClass("client!mb")
public class class86 extends class127 {

    @OriginalMember(owner = "client!mb", name = "n", descriptor = "Ljava/awt/Component;")
    private Component field1582;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILjava/awt/Graphics;IIII)V")
    public final void method578(int arg0, Graphics arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 >= -87) {
            this.method578(61, (Graphics) null, -29, 70, -76, 66);
        }
        Shape var7 = arg1.getClip();
        arg1.clipRect(arg4, arg5, arg3, arg0);
        arg1.drawImage(this.field2264, 0, 0, this.field1582);
        arg1.setClip(var7);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIBLjava/awt/Component;)V")
    public final void method579(int arg0, int arg1, byte arg2, Component arg3) {
        this.field2266 = arg0;
        this.field2271 = arg1;
        if (arg2 != -70) {
            this.method578(21, (Graphics) null, 43, -75, -113, -109);
        }
        this.field2274 = new int[arg0 * arg1 + 1];
        DataBufferInt var5 = new DataBufferInt(this.field2274, this.field2274.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field2266, this.field2271), var5, (Point) null);
        this.field2264 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field1582 = arg3;
        this.method846((byte) 2);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IILjava/awt/Graphics;Z)V")
    public final void method580(int arg0, int arg1, Graphics arg2, boolean arg3) {
        arg2.drawImage(this.field2264, arg0, arg1, this.field1582);
        if (!arg3) {
            this.field1582 = (Component) null;
        }
    }
}
