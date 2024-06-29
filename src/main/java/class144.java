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

@OriginalClass("client!vb")
public class class144 extends class11 {

    @OriginalMember(owner = "client!vb", name = "ib", descriptor = "Ljava/awt/Component;")
    private Component field3576;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILjava/awt/Component;BI)V")
    public final void method96(int arg0, Component arg1, byte arg2, int arg3) {
        this.field327 = arg3;
        this.field328 = arg0;
        this.field326 = new int[arg0 * arg3 + 1];
        DataBufferInt var5 = new DataBufferInt(this.field326, this.field326.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field328, this.field327), var5, null);
        this.field322 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field3576 = arg1;
        this.method100(true);
        int var8 = -74 / ((-arg2 - 36) / 47);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public final void method98(int arg0, int arg1, int arg2, Graphics arg3) {
        if (arg2 == -16961) {
            arg3.drawImage(this.field322, arg0, arg1, this.field3576);
        }
    }
}
