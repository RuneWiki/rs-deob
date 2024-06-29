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
public class class24 extends class16 {

    @OriginalMember(owner = "client!de", name = "t", descriptor = "Ljava/awt/Component;")
    private Component field531;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ILjava/awt/Component;II)V")
    public final void method87(int arg0, Component arg1, int arg2, int arg3) {
        this.field307 = arg0;
        if (arg3 != -16) {
            this.field531 = null;
        }
        this.field301 = arg2;
        this.field312 = new int[arg0 * arg2 + 1];
        DataBufferInt var5 = new DataBufferInt(this.field312, this.field312.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field307, this.field301), var5, null);
        this.field315 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field531 = arg1;
        this.method92((byte) -4);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public final void method91(int arg0, Graphics arg1, int arg2, int arg3) {
        if (arg2 == 11675) {
            arg1.drawImage(this.field315, arg0, arg3, this.field531);
        }
    }
}
