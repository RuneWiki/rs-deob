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

@OriginalClass("client!cj")
public class class147 extends class51 {

    @OriginalMember(owner = "client!cj", name = "o", descriptor = "Ljava/awt/Component;")
    private Component field2407;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(BLjava/awt/Component;II)V")
    public final void method379(byte arg0, Component arg1, int arg2, int arg3) {
        this.field808 = new int[arg2 * arg3 + 1];
        this.field804 = arg3;
        this.field800 = arg2;
        DataBufferInt var5 = new DataBufferInt(this.field808, this.field808.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        if (arg0 >= 103) {
            WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field804, this.field800), var5, (Point) null);
            this.field803 = new BufferedImage(var6, var7, false, new Hashtable());
            this.field2407 = arg1;
            this.method385(0);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
    public final void method386(Graphics arg0, int arg1, int arg2, int arg3) {
        arg0.drawImage(this.field803, arg3, arg2, this.field2407);
        if (arg1 != 0) {
            this.field2407 = (Component) null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIZLjava/awt/Graphics;II)V")
    public final void method381(int arg0, int arg1, boolean arg2, Graphics arg3, int arg4, int arg5) {
        Shape var7 = arg3.getClip();
        arg3.clipRect(arg5, arg4, arg1, arg0);
        if (arg2) {
            this.method381(14, 11, false, (Graphics) null, 109, -54);
        }
        arg3.drawImage(this.field803, 0, 0, this.field2407);
        arg3.setClip(var7);
    }
}
