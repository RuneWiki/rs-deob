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

@OriginalClass("client!tg")
public class class182 extends class138 {

    @OriginalMember(owner = "client!tg", name = "r", descriptor = "Ljava/awt/Component;")
    private Component field3642;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Ljava/awt/Component;III)V")
    public final void method170(Component arg0, int arg1, int arg2, int arg3) {
        this.field2837 = arg2;
        this.field2844 = arg1;
        this.field2848 = new int[arg1 * arg2 + 1];
        DataBufferInt var5 = new DataBufferInt(this.field2848, this.field2848.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        if (arg3 == 4) {
            WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field2844, this.field2837), var5, null);
            this.field2843 = new BufferedImage(var6, var7, false, new Hashtable());
            this.field3642 = arg0;
            this.method905(1);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
    public final void method165(Graphics arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 8) {
            arg0.drawImage(this.field2843, arg1, arg3, this.field3642);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Ljava/awt/Graphics;IIIBI)V")
    public final void method169(Graphics arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        Shape var7 = arg0.getClip();
        arg0.clipRect(arg5, arg3, arg2, arg1);
        if (arg4 > -40) {
            this.field3642 = null;
        }
        arg0.drawImage(this.field2843, 0, 0, this.field3642);
        arg0.setClip(var7);
    }
}
