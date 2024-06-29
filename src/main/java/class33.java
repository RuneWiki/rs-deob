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

@OriginalClass("client!oi")
public class class33 extends class213 {

    @OriginalMember(owner = "client!oi", name = "m", descriptor = "Ljava/awt/Component;")
    private Component field428;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IILjava/awt/Graphics;IBI)V", line = 10)
    public final void method236(int arg0, int arg1, Graphics arg2, int arg3, byte arg4, int arg5) {
        if (arg4 == 40) {
            Shape var7 = arg2.getClip();
            arg2.clipRect(arg1, arg0, arg3, arg5);
            arg2.drawImage(this.field3232, 0, 0, this.field428);
            arg2.setClip(var7);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Ljava/awt/Component;IBI)V", line = 24)
    public final void method237(Component arg0, int arg1, byte arg2, int arg3) {
        this.field3230 = arg3;
        this.field3231 = arg1;
        this.field3238 = new int[arg1 * arg3 + 1];
        DataBufferInt var5 = new DataBufferInt(this.field3238, this.field3238.length);
        if (arg2 <= 2) {
            return;
        }
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field3231, this.field3230), var5, (Point) null);
        this.field3232 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field428 = arg0;
        this.method1474(0);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILjava/awt/Graphics;II)V", line = 44)
    public final void method238(int arg0, Graphics arg1, int arg2, int arg3) {
        if (arg2 != 0) {
            this.field428 = (Component) null;
        }
        arg1.drawImage(this.field3232, arg0, arg3, this.field428);
    }
}
