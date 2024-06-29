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

@OriginalClass("client!bk")
public class class49 extends class179 {

    @OriginalMember(owner = "client!bk", name = "r", descriptor = "Ljava/awt/Component;")
    private Component field759;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILjava/awt/Component;II)V", line = 10)
    public final void method355(int arg0, Component arg1, int arg2, int arg3) {
        this.field2934 = arg2;
        this.field2939 = new int[arg0 * arg2 + 1];
        if (arg3 <= 76) {
            return;
        }
        this.field2930 = arg0;
        DataBufferInt var5 = new DataBufferInt(this.field2939, this.field2939.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field2934, this.field2930), var5, (Point) null);
        this.field2931 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field759 = arg1;
        this.method1320(16089);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ljava/awt/Graphics;IIIZI)V", line = 31)
    public final void method356(Graphics arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        Shape var7 = arg0.getClip();
        arg0.clipRect(arg3, arg1, arg2, arg5);
        arg0.drawImage(this.field2931, 0, 0, this.field759);
        arg0.setClip(var7);
        if (!arg4) {
            this.method356((Graphics) null, -102, -96, -93, false, -108);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIILjava/awt/Graphics;)V", line = 47)
    public final void method357(int arg0, int arg1, int arg2, Graphics arg3) {
        if (arg2 == 1) {
            arg3.drawImage(this.field2931, arg0, arg1, this.field759);
        }
    }
}
