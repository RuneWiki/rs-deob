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

@OriginalClass("client!na")
public class class78 extends class66 {

    @OriginalMember(owner = "client!na", name = "y", descriptor = "Ljava/awt/Component;")
    private Component field1986;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIILjava/awt/Component;)V", line = 13)
    public final void method495(int arg0, int arg1, int arg2, Component arg3) {
        this.field1626 = arg2;
        this.field1625 = new int[arg0 * arg2 + 1];
        this.field1627 = arg0;
        DataBufferInt var5 = new DataBufferInt(this.field1625, this.field1625.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field1626, this.field1627), var5, null);
        this.field1623 = new BufferedImage(var6, var7, false, new Hashtable());
        if (arg1 > -122) {
            this.field1986 = null;
        }
        this.field1986 = arg3;
        this.method496(55);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIBLjava/awt/Graphics;)V", line = 34)
    public final void method498(int arg0, int arg1, byte arg2, Graphics arg3) {
        if (arg2 != -12) {
            this.method495(75, 80, -23, null);
        }
        arg3.drawImage(this.field1623, arg1, arg0, this.field1986);
    }
}
