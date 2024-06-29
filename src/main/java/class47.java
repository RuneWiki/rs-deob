import java.awt.Component;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class47 extends class87 {

    @OriginalMember(owner = "client!ge", name = "x", descriptor = "Ljava/awt/Component;")
    private Component field1079;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public final void method406(int arg0, int arg1, int arg2, Graphics arg3) {
        if (arg0 != 32) {
            this.method407(null, -10, -103, -111);
        }
        arg3.drawImage(this.field1998, arg2, arg1, this.field1079);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljava/awt/Component;III)V")
    public final void method407(Component arg0, int arg1, int arg2, int arg3) {
        this.field2001 = arg2;
        this.field1994 = new int[arg2 * arg3 + 1];
        this.field1988 = arg3;
        if (arg1 <= 51) {
            return;
        }
        DataBufferInt var5 = new DataBufferInt(this.field1994, this.field1994.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field2001, this.field1988), var5, null);
        this.field1998 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field1079 = arg0;
        this.method714(123);
    }
}
