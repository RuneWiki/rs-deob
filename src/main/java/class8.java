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

@OriginalClass("client!l")
public class class8 extends class95 {

    @OriginalMember(owner = "client!l", name = "o", descriptor = "Ljava/awt/Component;")
    private Component field142;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(BIILjava/awt/Graphics;)V")
    public final void method66(byte arg0, int arg1, int arg2, Graphics arg3) {
        if (arg0 != 109) {
            this.field142 = (Component) null;
        }
        arg3.drawImage(this.field1553, arg1, arg2, this.field142);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Ljava/awt/Component;III)V")
    public final void method67(Component arg0, int arg1, int arg2, int arg3) {
        this.field1563 = arg1;
        this.field1560 = arg3;
        if (arg2 > -93) {
            return;
        }
        this.field1558 = new int[arg1 * arg3 + 1];
        DataBufferInt var5 = new DataBufferInt(this.field1558, this.field1558.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field1560, this.field1563), var5, (Point) null);
        this.field1553 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field142 = arg0;
        this.method667((byte) -72);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
    public final void method68(int arg0, int arg1, int arg2, Graphics arg3, int arg4, int arg5) {
        if (arg0 >= -113) {
            this.field142 = (Component) null;
        }
        Shape var7 = arg3.getClip();
        arg3.clipRect(arg5, arg4, arg1, arg2);
        arg3.drawImage(this.field1553, 0, 0, this.field142);
        arg3.setClip(var7);
    }
}
