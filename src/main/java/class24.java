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

@OriginalClass("client!de")
public class class24 extends class125 {

    @OriginalMember(owner = "client!de", name = "t", descriptor = "Ljava/awt/Component;")
    private Component field617;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljava/awt/Component;IIZ)V", line = 10)
    public final void method195(Component arg0, int arg1, int arg2, boolean arg3) {
        this.field2847 = new int[arg1 * arg2 + 1];
        this.field2853 = arg2;
        this.field2841 = arg1;
        DataBufferInt var5 = new DataBufferInt(this.field2847, this.field2847.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field2841, this.field2853), var5, null);
        this.field2840 = new BufferedImage(var6, var7, arg3, new Hashtable());
        this.field617 = arg0;
        this.method984(-1);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIILjava/awt/Graphics;)V", line = 27)
    public final void method196(int arg0, int arg1, int arg2, Graphics arg3) {
        if (arg0 == -5917) {
            arg3.drawImage(this.field2840, arg2, arg1, this.field617);
        }
    }
}
