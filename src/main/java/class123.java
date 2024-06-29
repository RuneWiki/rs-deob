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

@OriginalClass("client!re")
public class class123 extends class70 {

    @OriginalMember(owner = "client!re", name = "q", descriptor = "Ljava/awt/Component;")
    private Component field2860;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(BIIILjava/awt/Graphics;I)V")
    public final void method523(byte arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5) {
        Shape var7 = arg4.getClip();
        arg4.clipRect(arg2, arg3, arg5, arg1);
        arg4.drawImage(this.field1469, 0, 0, this.field2860);
        int var8 = -77 % ((-arg0 - 75) / 32);
        arg4.setClip(var7);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public final void method521(int arg0, int arg1, int arg2, Graphics arg3) {
        arg3.drawImage(this.field1469, arg1, arg0, this.field2860);
        if (arg2 != 0) {
            this.method521(17, -43, -74, null);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Ljava/awt/Component;IIB)V")
    public final void method522(Component arg0, int arg1, int arg2, byte arg3) {
        this.field1473 = new int[arg1 * arg2 + 1];
        this.field1479 = arg1;
        this.field1470 = arg2;
        DataBufferInt var5 = new DataBufferInt(this.field1473, this.field1473.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        int var7 = -89 % ((40 - arg3) / 40);
        WritableRaster var8 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field1470, this.field1479), var5, null);
        this.field1469 = new BufferedImage(var6, var8, false, new Hashtable());
        this.field2860 = arg0;
        this.method524(0);
    }
}
