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

@OriginalClass("client!la")
public class class67 extends class92 {

    @OriginalMember(owner = "client!la", name = "y", descriptor = "Ljava/awt/Component;")
    private Component field1723;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IBLjava/awt/Graphics;I)V", line = 11)
    public final void method403(int arg0, byte arg1, Graphics arg2, int arg3) {
        arg2.drawImage(this.field2266, arg0, arg3, this.field1723);
        int var5 = -124 / ((arg1 - 11) / 60);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIILjava/awt/Component;)V", line = 22)
    public final void method399(int arg0, int arg1, int arg2, Component arg3) {
        this.field2265 = new int[arg0 * arg2 + 1];
        this.field2276 = arg0;
        int var5 = 2 % ((arg1 - 58) / 36);
        this.field2267 = arg2;
        DataBufferInt var6 = new DataBufferInt(this.field2265, this.field2265.length);
        DirectColorModel var7 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var8 = Raster.createWritableRaster(var7.createCompatibleSampleModel(this.field2267, this.field2276), var6, null);
        this.field2266 = new BufferedImage(var7, var8, false, new Hashtable());
        this.field1723 = arg3;
        this.method767(false);
    }
}
