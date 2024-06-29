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

@OriginalClass("client!rc")
public class class113 extends class66 {

    @OriginalMember(owner = "client!rc", name = "u", descriptor = "Ljava/awt/Component;")
    private Component field2632;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public final void method526(int arg0, int arg1, int arg2, Graphics arg3) {
        if (arg0 != 0) {
            this.method526(125, -123, -51, null);
        }
        arg3.drawImage(this.field1425, arg1, arg2, this.field2632);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIILjava/awt/Component;)V")
    public final void method533(int arg0, int arg1, int arg2, Component arg3) {
        if (arg1 != 0) {
            return;
        }
        this.field1418 = new int[arg0 * arg2 + 1];
        this.field1420 = arg2;
        this.field1421 = arg0;
        DataBufferInt var5 = new DataBufferInt(this.field1418, this.field1418.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field1421, this.field1420), var5, null);
        this.field1425 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field2632 = arg3;
        this.method528(-1926);
    }
}
