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

@OriginalClass("client!pd")
public class class172 extends class137 {

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "Ljava/awt/Component;")
    private Component field2776;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILjava/awt/Component;II)V")
    public final void method1000(int arg0, Component arg1, int arg2, int arg3) {
        this.field2252 = new int[arg0 * arg2 + 1];
        this.field2248 = arg0;
        this.field2253 = arg2;
        if (arg3 != 1994341016) {
            return;
        }
        DataBufferInt var5 = new DataBufferInt(this.field2252, this.field2252.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field2253, this.field2248), var5, (Point) null);
        this.field2254 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field2776 = arg1;
        this.method1016(255);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public final void method1004(int arg0, int arg1, int arg2, Graphics arg3) {
        if (arg0 != -6187) {
            this.field2776 = (Component) null;
        }
        arg3.drawImage(this.field2254, arg1, arg2, this.field2776);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILjava/awt/Graphics;IIII)V")
    public final void method1005(int arg0, Graphics arg1, int arg2, int arg3, int arg4, int arg5) {
        Shape var7 = arg1.getClip();
        arg1.clipRect(arg2, arg0, arg5, arg3);
        if (arg4 == 16733373) {
            arg1.drawImage(this.field2254, 0, 0, this.field2776);
            arg1.setClip(var7);
        }
    }
}
