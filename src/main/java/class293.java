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

@OriginalClass("client!w")
public class class293 extends class207 {

    @OriginalMember(owner = "client!w", name = "l", descriptor = "Ljava/awt/Component;")
    private Component field4544;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Ljava/awt/Component;IIB)V", line = 11)
    public final void method869(Component arg0, int arg1, int arg2, byte arg3) {
        this.field3179 = arg2;
        this.field3174 = arg1;
        this.field3173 = new int[arg1 * arg2 + 1];
        DataBufferInt var5 = new DataBufferInt(this.field3173, this.field3173.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        int var7 = 49 / ((arg3 - 44) / 53);
        WritableRaster var8 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field3174, this.field3179), var5, (Point) null);
        this.field3176 = new BufferedImage(var6, var8, false, new Hashtable());
        this.field4544 = arg0;
        this.method1475(true);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIILjava/awt/Graphics;)V", line = 30)
    public final void method867(int arg0, int arg1, int arg2, Graphics arg3) {
        arg3.drawImage(this.field3176, arg2, arg1, this.field4544);
        if (arg0 != 32722) {
            this.method871(true, -76, (Graphics) null, -37, -57, -10);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ZILjava/awt/Graphics;III)V", line = 42)
    public final void method871(boolean arg0, int arg1, Graphics arg2, int arg3, int arg4, int arg5) {
        if (arg0) {
            this.method867(39, 44, -101, (Graphics) null);
        }
        Shape var7 = arg2.getClip();
        arg2.clipRect(arg4, arg5, arg3, arg1);
        arg2.drawImage(this.field3176, 0, 0, this.field4544);
        arg2.setClip(var7);
    }
}
