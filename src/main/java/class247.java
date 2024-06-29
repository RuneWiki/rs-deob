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

@OriginalClass("client!ka")
public class class247 extends class254 {

    @OriginalMember(owner = "client!ka", name = "o", descriptor = "Ljava/awt/Component;")
    private Component field4325;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IBLjava/awt/Graphics;I)V")
    public final void method611(int arg0, byte arg1, Graphics arg2, int arg3) {
        arg2.drawImage(this.field4414, arg0, arg3, this.field4325);
        int var5 = -49 / ((63 - arg1) / 33);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
    public final void method607(int arg0, int arg1, int arg2, Graphics arg3, int arg4, int arg5) {
        Shape var7 = arg3.getClip();
        if (arg0 < -51) {
            arg3.clipRect(arg1, arg4, arg5, arg2);
            arg3.drawImage(this.field4414, 0, 0, this.field4325);
            arg3.setClip(var7);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Ljava/awt/Component;IZI)V")
    public final void method608(Component arg0, int arg1, boolean arg2, int arg3) {
        this.field4416 = arg1;
        this.field4423 = new int[arg1 * arg3 + 1];
        this.field4419 = arg3;
        DataBufferInt var5 = new DataBufferInt(this.field4423, this.field4423.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        if (!arg2) {
            this.method611(-75, (byte) 53, (Graphics) null, 42);
        }
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field4416, this.field4419), var5, (Point) null);
        this.field4414 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field4325 = arg0;
        this.method1690(-114);
    }
}
