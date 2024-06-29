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

@OriginalClass("client!pd")
public class class94 extends class34 {

    @OriginalMember(owner = "client!pd", name = "w", descriptor = "Ljava/awt/Component;")
    private Component field2182;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIILjava/awt/Component;)V", line = 9)
    public final void method321(int arg0, int arg1, int arg2, Component arg3) {
        this.field802 = arg0;
        if (arg2 != 50) {
            this.method320(-28, null, (byte) 102, -103);
        }
        this.field789 = new int[arg0 * arg1 + 1];
        this.field805 = arg1;
        DataBufferInt var5 = new DataBufferInt(this.field789, this.field789.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field805, this.field802), var5, null);
        this.field804 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field2182 = arg3;
        this.method323(arg2 ^ 0x32);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILjava/awt/Graphics;BI)V", line = 30)
    public final void method320(int arg0, Graphics arg1, byte arg2, int arg3) {
        arg1.drawImage(this.field804, arg0, arg3, this.field2182);
        if (arg2 != -89) {
            this.method321(-28, 107, 83, null);
        }
    }
}
