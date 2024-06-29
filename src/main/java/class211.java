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

@OriginalClass("client!wf")
public class class211 extends class170 {

    @OriginalMember(owner = "client!wf", name = "s", descriptor = "Ljava/awt/Component;")
    private Component field4164;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Ljava/awt/Component;IIB)V")
    public final void method360(Component arg0, int arg1, int arg2, byte arg3) {
        this.field3404 = arg1;
        this.field3402 = arg2;
        if (arg3 != -31) {
            this.method360(null, 92, 76, (byte) 72);
        }
        this.field3408 = new int[arg1 * arg2 + 1];
        DataBufferInt var5 = new DataBufferInt(this.field3408, this.field3408.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field3402, this.field3404), var5, null);
        this.field3395 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field4164 = arg0;
        this.method1111((byte) 51);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IBIILjava/awt/Graphics;I)V")
    public final void method363(int arg0, byte arg1, int arg2, int arg3, Graphics arg4, int arg5) {
        Shape var7 = arg4.getClip();
        arg4.clipRect(arg5, arg3, arg0, arg2);
        if (arg1 >= -91) {
            this.method360(null, -101, -110, (byte) 46);
        }
        arg4.drawImage(this.field3395, 0, 0, this.field4164);
        arg4.setClip(var7);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZILjava/awt/Graphics;I)V")
    public final void method359(boolean arg0, int arg1, Graphics arg2, int arg3) {
        arg2.drawImage(this.field3395, arg1, arg3, this.field4164);
        if (!arg0) {
            this.field4164 = null;
        }
    }
}
