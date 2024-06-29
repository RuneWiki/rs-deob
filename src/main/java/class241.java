import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class241 extends class540 {

    @OriginalMember(owner = "client!hm", name = "s", descriptor = "Ljava/awt/Canvas;")
    private Canvas field3587;

    @OriginalMember(owner = "client!hm", name = "v", descriptor = "Ljava/awt/Image;")
    private Image field3590;

    @OriginalMember(owner = "client!hm", name = "u", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field3589;

    @OriginalMember(owner = "client!hm", name = "t", descriptor = "Ljava/awt/Shape;")
    private Shape field3588;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Ljava/awt/Canvas;IIB)V")
    public final void method1621(Canvas arg0, int arg1, int arg2, byte arg3) {
        this.field3587 = arg0;
        this.field3589 = new Rectangle();
        this.field7470 = arg1;
        this.field7465 = arg2;
        this.field7471 = new int[this.field7470 * this.field7465];
        DataBufferInt var5 = new DataBufferInt(this.field7471, this.field7471.length);
        if (arg3 != -19) {
            this.field3589 = null;
        }
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field7465, this.field7470), var5, null);
        this.field3590 = new BufferedImage(var6, var7, false, new Hashtable());
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIIBIILjava/awt/Graphics;)V")
    public final void method1622(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, Graphics arg7) {
        this.field3588 = arg7.getClip();
        this.field3589.width = arg1;
        this.field3589.height = arg2;
        this.field3589.y = arg0;
        if (arg4 >= -18) {
            this.field3588 = null;
        }
        this.field3589.x = arg5;
        arg7.setClip(this.field3589);
        arg7.drawImage(this.field3590, arg5 - arg6, -arg3 + arg0, this.field3587);
        arg7.setClip(this.field3588);
    }
}
