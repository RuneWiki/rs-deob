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

@OriginalClass("client!pa")
public class class95 extends class119 {

    @OriginalMember(owner = "client!pa", name = "x", descriptor = "Ljava/awt/Component;")
    private Component field2162;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IILjava/awt/Graphics;I)V", line = 11)
    public final void method162(int arg0, int arg1, Graphics arg2, int arg3) {
        arg2.drawImage(this.field2814, arg1, arg3, this.field2162);
        if (arg0 != -1) {
            this.method159(null, 13, false, -127);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Ljava/awt/Component;IZI)V", line = 22)
    public final void method159(Component arg0, int arg1, boolean arg2, int arg3) {
        this.field2802 = arg3;
        this.field2812 = arg1;
        if (arg2) {
            this.method162(-109, 46, null, 16);
        }
        this.field2807 = new int[arg1 * arg3 + 1];
        DataBufferInt var5 = new DataBufferInt(this.field2807, this.field2807.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field2812, this.field2802), var5, null);
        this.field2814 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field2162 = arg0;
        this.method939((byte) -53);
    }
}
