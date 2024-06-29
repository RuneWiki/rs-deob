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
public class class123 extends class71 {

    @OriginalMember(owner = "client!re", name = "y", descriptor = "Ljava/awt/Component;")
    private Component field2829;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IBILjava/awt/Component;)V")
    public final void method526(int arg0, byte arg1, int arg2, Component arg3) {
        this.field1641 = arg2;
        this.field1656 = arg0;
        this.field1658 = new int[arg0 * arg2 + 1];
        DataBufferInt var5 = new DataBufferInt(this.field1658, this.field1658.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        if (arg1 >= -123) {
            this.field2829 = null;
        }
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field1656, this.field1641), var5, null);
        this.field1660 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field2829 = arg3;
        this.method601(17648);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIBLjava/awt/Graphics;)V")
    public final void method528(int arg0, int arg1, int arg2, int arg3, byte arg4, Graphics arg5) {
        Shape var7 = arg5.getClip();
        if (arg4 != 69) {
            this.field2829 = null;
        }
        arg5.clipRect(arg3, arg1, arg0, arg2);
        arg5.drawImage(this.field1660, 0, 0, this.field2829);
        arg5.setClip(var7);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public final void method529(int arg0, Graphics arg1, int arg2, int arg3) {
        arg1.drawImage(this.field1660, arg0, arg2, this.field2829);
        if (arg3 != -9680) {
            this.field2829 = null;
        }
    }
}
