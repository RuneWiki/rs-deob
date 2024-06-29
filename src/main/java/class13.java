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

@OriginalClass("client!c")
public class class13 extends class62 {

    @OriginalMember(owner = "client!c", name = "q", descriptor = "Ljava/awt/Component;")
    private Component field356;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ILjava/awt/Graphics;II)V", line = 11)
    public final void method122(int arg0, Graphics arg1, int arg2, int arg3) {
        int var5 = 55 % ((arg0 - 71) / 43);
        arg1.drawImage(this.field1580, arg2, arg3, this.field356);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Ljava/awt/Component;IBI)V", line = 21)
    public final void method123(Component arg0, int arg1, byte arg2, int arg3) {
        this.field1591 = new int[arg1 * arg3 + 1];
        this.field1579 = arg1;
        this.field1593 = arg3;
        DataBufferInt var5 = new DataBufferInt(this.field1591, this.field1591.length);
        if (arg2 <= 0) {
            this.field356 = null;
        }
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field1579, this.field1593), var5, null);
        this.field1580 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field356 = arg0;
        this.method473((byte) -4);
    }
}
