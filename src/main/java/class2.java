import java.awt.Component;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class2 extends class86 {

    @OriginalMember(owner = "client!ml", name = "n", descriptor = "Ljava/awt/Component;")
    private Component field19;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(BLjava/awt/Graphics;II)V", line = 9)
    public final void method10(byte arg0, Graphics arg1, int arg2, int arg3) {
        if (arg0 <= 76) {
            this.method10((byte) -44, (Graphics) null, -33, -52);
        }
        arg1.drawImage(this.field1531, arg3, arg2, this.field19);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIILjava/awt/Component;)V", line = 20)
    public final void method11(int arg0, int arg1, int arg2, Component arg3) {
        this.field1526 = new int[arg0 * arg2 + 1];
        this.field1532 = arg2;
        this.field1529 = arg0;
        DataBufferInt var5 = new DataBufferInt(this.field1526, this.field1526.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        if (arg1 == -9750) {
            WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field1529, this.field1532), var5, (Point) null);
            this.field1531 = new BufferedImage(var6, var7, false, new Hashtable());
            this.field19 = arg3;
            this.method654(false);
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILjava/awt/Graphics;IIBI)V", line = 45)
    public final void method12(int arg0, Graphics arg1, int arg2, int arg3, byte arg4, int arg5) {
        int var7 = 35 / ((arg4 - 24) / 39);
        Shape var8 = arg1.getClip();
        arg1.clipRect(arg0, arg5, arg3, arg2);
        arg1.drawImage(this.field1531, 0, 0, this.field19);
        arg1.setClip(var8);
    }
}
