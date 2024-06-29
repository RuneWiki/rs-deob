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

@OriginalClass("client!kd")
public class class73 extends class82 {

    @OriginalMember(owner = "client!kd", name = "q", descriptor = "Ljava/awt/Component;")
    private Component field1697;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IILjava/awt/Component;I)V", line = 9)
    public final void method130(int arg0, int arg1, Component arg2, int arg3) {
        if (arg3 != 0) {
            this.field1697 = null;
        }
        this.field1827 = arg1;
        this.field1829 = new int[arg0 * arg1 + 1];
        this.field1821 = arg0;
        DataBufferInt var5 = new DataBufferInt(this.field1829, this.field1829.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field1827, this.field1821), var5, null);
        this.field1825 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field1697 = arg2;
        this.method691(-66);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljava/awt/Graphics;IIB)V", line = 30)
    public final void method129(Graphics arg0, int arg1, int arg2, byte arg3) {
        if (arg3 >= -123) {
            this.method130(-100, -119, null, -26);
        }
        arg0.drawImage(this.field1825, arg1, arg2, this.field1697);
    }
}
