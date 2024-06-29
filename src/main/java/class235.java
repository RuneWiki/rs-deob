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

@OriginalClass("client!tb")
public class class235 extends class281 {

    @OriginalMember(owner = "client!tb", name = "r", descriptor = "Ljava/awt/Component;")
    private Component field3552;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BLjava/awt/Component;II)V", line = 12)
    public final void method1285(byte arg0, Component arg1, int arg2, int arg3) {
        this.field4403 = new int[arg2 * arg3 + 1];
        this.field4402 = arg2;
        this.field4401 = arg3;
        DataBufferInt var5 = new DataBufferInt(this.field4403, this.field4403.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field4401, this.field4402), var5, (Point) null);
        this.field4405 = new BufferedImage(var6, var7, false, new Hashtable());
        int var8 = 44 / ((-arg0 - 4) / 52);
        this.field3552 = arg1;
        this.method1981(18517);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V", line = 30)
    public final void method1289(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        Shape var7 = arg0.getClip();
        if (arg5 >= -89) {
            this.field3552 = (Component) null;
        }
        arg0.clipRect(arg1, arg4, arg3, arg2);
        arg0.drawImage(this.field4405, 0, 0, this.field3552);
        arg0.setClip(var7);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILjava/awt/Graphics;II)V", line = 46)
    public final void method1290(int arg0, Graphics arg1, int arg2, int arg3) {
        if (arg0 != -1) {
            this.method1289((Graphics) null, 100, -30, -55, -70, -36);
        }
        arg1.drawImage(this.field4405, arg2, arg3, this.field3552);
    }
}
