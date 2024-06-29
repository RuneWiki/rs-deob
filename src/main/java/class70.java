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

@OriginalClass("client!ld")
public class class70 extends class20 {

    @OriginalMember(owner = "client!ld", name = "v", descriptor = "Ljava/awt/Component;")
    private Component field1787;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILjava/awt/Graphics;II)V", line = 9)
    public final void method187(int arg0, Graphics arg1, int arg2, int arg3) {
        arg1.drawImage(this.field579, arg3, arg0, this.field1787);
        if (arg2 != -26826) {
            this.method187(-99, null, 14, 52);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILjava/awt/Component;II)V", line = 19)
    public final void method188(int arg0, Component arg1, int arg2, int arg3) {
        this.field593 = new int[arg0 * arg3 + 1];
        this.field577 = arg3;
        this.field590 = arg0;
        if (arg2 < 73) {
            this.field1787 = null;
        }
        DataBufferInt var5 = new DataBufferInt(this.field593, this.field593.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field590, this.field577), var5, null);
        this.field579 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field1787 = arg1;
        this.method181(14664);
    }
}
