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

@OriginalClass("client!hf")
public class class69 extends class86 {

    @OriginalMember(owner = "client!hf", name = "s", descriptor = "Ljava/awt/Component;")
    private Component field1730;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILjava/awt/Graphics;IZ)V")
    public final void method230(int arg0, Graphics arg1, int arg2, boolean arg3) {
        if (!arg3) {
            arg1.drawImage(this.field2000, arg0, arg2, this.field1730);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
    public final void method223(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5) {
        Shape var7 = arg5.getClip();
        arg5.clipRect(arg0, arg4, arg3, arg2);
        arg5.drawImage(this.field2000, 0, 0, this.field1730);
        int var8 = 54 / ((arg1 + 64) / 42);
        arg5.setClip(var7);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljava/awt/Component;IIB)V")
    public final void method225(Component arg0, int arg1, int arg2, byte arg3) {
        this.field1999 = arg1;
        this.field1997 = arg2;
        this.field2010 = new int[arg1 * arg2 + 1];
        DataBufferInt var5 = new DataBufferInt(this.field2010, this.field2010.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field1999, this.field1997), var5, null);
        int var8 = 6 % ((53 - arg3) / 32);
        this.field2000 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field1730 = arg0;
        this.method719((byte) -10);
    }
}
