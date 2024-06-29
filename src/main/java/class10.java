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

@OriginalClass("client!l")
public class class10 extends class161 {

    @OriginalMember(owner = "client!l", name = "n", descriptor = "Ljava/awt/Component;")
    private Component field114;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIILjava/awt/Component;)V")
    public final void method48(int arg0, int arg1, int arg2, Component arg3) {
        this.field2562 = arg2;
        this.field2565 = arg1;
        this.field2564 = new int[arg1 * arg2 + 1];
        DataBufferInt var5 = new DataBufferInt(this.field2564, this.field2564.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        if (arg0 == 24848) {
            WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field2562, this.field2565), var5, (Point) null);
            this.field2561 = new BufferedImage(var6, var7, false, new Hashtable());
            this.field114 = arg3;
            this.method1118(63);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public final void method49(int arg0, Graphics arg1, int arg2, int arg3) {
        if (arg2 == -129) {
            arg1.drawImage(this.field2561, arg3, arg0, this.field114);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIILjava/awt/Graphics;B)V")
    public final void method50(int arg0, int arg1, int arg2, int arg3, Graphics arg4, byte arg5) {
        Shape var7 = arg4.getClip();
        arg4.clipRect(arg3, arg1, arg0, arg2);
        arg4.drawImage(this.field2561, 0, 0, this.field114);
        arg4.setClip(var7);
        if (arg5 != 12) {
            this.method48(30, 66, -32, (Component) null);
        }
    }
}
