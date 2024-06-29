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

@OriginalClass("client!vk")
public class class168 extends class169 {

    @OriginalMember(owner = "client!vk", name = "k", descriptor = "Ljava/awt/Component;")
    private Component field2638;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIILjava/awt/Component;)V", line = 10)
    public final void method1165(int arg0, int arg1, int arg2, Component arg3) {
        this.field2646 = arg2;
        this.field2643 = new int[arg0 * arg2 + 1];
        this.field2644 = arg0;
        DataBufferInt var5 = new DataBufferInt(this.field2643, this.field2643.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field2644, this.field2646), var5, (Point) null);
        this.field2642 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field2638 = arg3;
        this.method1169(arg1 ^ arg1);
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(ZIILjava/awt/Graphics;)V", line = 30)
    public final void method1166(boolean arg0, int arg1, int arg2, Graphics arg3) {
        arg3.drawImage(this.field2642, arg1, arg2, this.field2638);
        if (arg0) {
            this.field2638 = (Component) null;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V", line = 41)
    public final void method1167(int arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5) {
        Shape var7 = arg4.getClip();
        arg4.clipRect(arg1, arg0, arg2, arg5);
        arg4.drawImage(this.field2642, 0, arg3, this.field2638);
        arg4.setClip(var7);
    }
}
