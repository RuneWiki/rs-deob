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

@OriginalClass("client!oa")
public class class98 extends class28 {

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "Ljava/awt/Component;")
    private Component field2370;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILjava/awt/Component;II)V")
    public final void method215(int arg0, Component arg1, int arg2, int arg3) {
        int var5 = 23 / ((arg0 + 13) / 35);
        this.field556 = arg3;
        this.field544 = new int[arg2 * arg3 + 1];
        this.field550 = arg2;
        DataBufferInt var6 = new DataBufferInt(this.field544, this.field544.length);
        DirectColorModel var7 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var8 = Raster.createWritableRaster(var7.createCompatibleSampleModel(this.field550, this.field556), var6, null);
        this.field560 = new BufferedImage(var7, var8, false, new Hashtable());
        this.field2370 = arg1;
        this.method214(8);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIBLjava/awt/Graphics;)V")
    public final void method210(int arg0, int arg1, byte arg2, Graphics arg3) {
        if (arg2 != 78) {
            this.field2370 = null;
        }
        arg3.drawImage(this.field560, arg0, arg1, this.field2370);
    }
}
