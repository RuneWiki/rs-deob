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

@OriginalClass("client!vc")
public class class149 extends class150 {

    @OriginalMember(owner = "client!vc", name = "r", descriptor = "Ljava/awt/Component;")
    private Component field3461;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public final void method599(int arg0, int arg1, Graphics arg2, int arg3) {
        arg2.drawImage(this.field3472, arg1, arg3, this.field3461);
        if (arg0 != 21982) {
            this.method599(102, -41, null, -27);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IILjava/awt/Component;I)V")
    public final void method596(int arg0, int arg1, Component arg2, int arg3) {
        this.field3464 = arg0;
        if (arg3 < 113) {
            this.method602(65, (byte) -52, 68, 11, -32, null);
        }
        this.field3474 = new int[arg0 * arg1 + 1];
        this.field3475 = arg1;
        DataBufferInt var5 = new DataBufferInt(this.field3474, this.field3474.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field3475, this.field3464), var5, null);
        this.field3472 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field3461 = arg2;
        this.method1130((byte) -120);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IBIIILjava/awt/Graphics;)V")
    public final void method602(int arg0, byte arg1, int arg2, int arg3, int arg4, Graphics arg5) {
        Shape var7 = arg5.getClip();
        arg5.clipRect(arg0, arg2, arg4, arg3);
        arg5.drawImage(this.field3472, 0, 0, this.field3461);
        arg5.setClip(var7);
        if (arg1 >= -38) {
            this.field3461 = null;
        }
    }
}
