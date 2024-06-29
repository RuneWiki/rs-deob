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

@OriginalClass("client!ba")
public class class9 extends class93 {

    @OriginalMember(owner = "client!ba", name = "x", descriptor = "Ljava/awt/Component;")
    private Component field196;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Ljava/awt/Component;III)V")
    public final void method60(Component arg0, int arg1, int arg2, int arg3) {
        this.field2199 = arg3;
        this.field2210 = arg2;
        this.field2194 = new int[arg2 * arg3 + 1];
        if (arg1 <= 3) {
            this.field196 = null;
        }
        DataBufferInt var5 = new DataBufferInt(this.field2194, this.field2194.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field2199, this.field2210), var5, null);
        this.field2201 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field196 = arg0;
        this.method680(103);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILjava/awt/Graphics;IB)V")
    public final void method61(int arg0, Graphics arg1, int arg2, byte arg3) {
        if (arg3 > -31) {
            this.field196 = null;
        }
        arg1.drawImage(this.field2201, arg0, arg2, this.field196);
    }
}
