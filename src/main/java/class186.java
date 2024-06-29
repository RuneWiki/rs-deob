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

@OriginalClass("client!ue")
public class class186 extends class145 {

    @OriginalMember(owner = "client!ue", name = "w", descriptor = "Ljava/awt/Component;")
    private Component field3229;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public final void method121(int arg0, int arg1, int arg2, Graphics arg3) {
        if (arg0 < 72) {
            this.method124((Graphics) null, true, -108, 25, 34, 46);
        }
        arg3.drawImage(this.field2652, arg1, arg2, this.field3229);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Ljava/awt/Component;III)V")
    public final void method120(Component arg0, int arg1, int arg2, int arg3) {
        this.field2645 = new int[arg1 * arg3 + 1];
        this.field2660 = arg1;
        this.field2646 = arg3;
        DataBufferInt var5 = new DataBufferInt(this.field2645, this.field2645.length);
        int var6 = -5 % ((arg2 + 80) / 38);
        DirectColorModel var7 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var8 = Raster.createWritableRaster(var7.createCompatibleSampleModel(this.field2660, this.field2646), var5, (Point) null);
        this.field2652 = new BufferedImage(var7, var8, false, new Hashtable());
        this.field3229 = arg0;
        this.method1002(37);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Ljava/awt/Graphics;ZIIII)V")
    public final void method124(Graphics arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        Shape var7 = arg0.getClip();
        arg0.clipRect(arg3, arg4, arg2, arg5);
        if (!arg1) {
            this.method120((Component) null, -64, 3, 120);
        }
        arg0.drawImage(this.field2652, 0, 0, this.field3229);
        arg0.setClip(var7);
    }
}
