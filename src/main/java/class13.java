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

@OriginalClass("client!be")
public class class13 extends class122 {

    @OriginalMember(owner = "client!be", name = "u", descriptor = "Ljava/awt/Component;")
    private Component field294;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIILjava/awt/Component;)V")
    public final void method93(int arg0, int arg1, int arg2, Component arg3) {
        if (arg2 != 22) {
            this.field294 = null;
        }
        this.field2925 = arg0;
        this.field2922 = arg1;
        this.field2921 = new int[arg0 * arg1 + 1];
        DataBufferInt var5 = new DataBufferInt(this.field2921, this.field2921.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field2925, this.field2922), var5, null);
        this.field2930 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field294 = arg3;
        this.method966(arg2 ^ 0xFFFFFFC7);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public final void method94(int arg0, int arg1, Graphics arg2, int arg3) {
        arg2.drawImage(this.field2930, arg3, arg1, this.field294);
        if (arg0 != -17740) {
            this.field294 = null;
        }
    }
}
