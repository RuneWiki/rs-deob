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

@OriginalClass("client!ga")
public class class19 extends class140 {

    @OriginalMember(owner = "client!ga", name = "u", descriptor = "Ljava/awt/Component;")
    private Component field261;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Ljava/awt/Graphics;BIIII)V", line = 10)
    public final void method120(Graphics arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 >= 33) {
            Shape var7 = arg0.getClip();
            arg0.clipRect(arg5, arg3, arg2, arg4);
            arg0.drawImage(this.field2139, 0, 0, this.field261);
            arg0.setClip(var7);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILjava/awt/Graphics;II)V", line = 24)
    public final void method121(int arg0, Graphics arg1, int arg2, int arg3) {
        if (arg0 != -129) {
            this.field261 = (Component) null;
        }
        arg1.drawImage(this.field2139, arg2, arg3, this.field261);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Ljava/awt/Component;III)V", line = 36)
    public final void method122(Component arg0, int arg1, int arg2, int arg3) {
        this.field2124 = new int[arg1 * arg3 + 1];
        this.field2137 = arg3;
        this.field2123 = arg1;
        DataBufferInt var5 = new DataBufferInt(this.field2124, this.field2124.length);
        if (arg2 != 2) {
            this.method122((Component) null, -54, 4, -43);
        }
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field2137, this.field2123), var5, (Point) null);
        this.field2139 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field261 = arg0;
        this.method883(true);
    }
}
