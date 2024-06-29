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

@OriginalClass("client!aa")
public class class1 extends class114 {

    @OriginalMember(owner = "client!aa", name = "l", descriptor = "Ljava/awt/Component;")
    private Component field1;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILjava/awt/Graphics;II)V", line = 9)
    public final void method1(int arg0, Graphics arg1, int arg2, int arg3) {
        if (arg0 < -36) {
            arg1.drawImage(this.field2691, arg2, arg3, this.field1);
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIILjava/awt/Component;)V", line = 20)
    public final void method2(int arg0, int arg1, int arg2, Component arg3) {
        this.field2695 = arg0;
        if (arg2 != 26448) {
            this.field1 = null;
        }
        this.field2700 = arg1;
        this.field2690 = new int[arg0 * arg1 + 1];
        DataBufferInt var5 = new DataBufferInt(this.field2690, this.field2690.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field2695, this.field2700), var5, null);
        this.field2691 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field1 = arg3;
        this.method941(10);
    }
}
