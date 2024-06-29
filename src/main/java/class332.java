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

@OriginalClass("client!js")
public class class332 extends class498 {

    @OriginalMember(owner = "client!js", name = "E", descriptor = "Ljava/awt/Canvas;")
    private Canvas field4633;

    @OriginalMember(owner = "client!js", name = "F", descriptor = "Ljava/awt/Image;")
    private Image field4634;

    @OriginalMember(owner = "client!js", name = "G", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field4635;

    @OriginalMember(owner = "client!js", name = "C", descriptor = "Ljava/awt/Shape;")
    private Shape field4632;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(IIILjava/awt/Graphics;IIII)V", line = 13)
    public final void method1106(int arg0, int arg1, int arg2, Graphics arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field4632 = arg3.getClip();
        this.field4635.x = arg5;
        this.field4635.width = arg6;
        this.field4635.y = arg0;
        this.field4635.height = arg2;
        arg3.setClip(this.field4635);
        arg3.drawImage(this.field4634, arg5 - arg1, -arg7 + arg0, this.field4633);
        if (arg4 == -1) {
            arg3.setClip(this.field4632);
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Ljava/awt/Canvas;III)V", line = 33)
    public final void method1107(Canvas arg0, int arg1, int arg2, int arg3) {
        this.field4633 = arg0;
        this.field4635 = new Rectangle();
        this.field6960 = arg1;
        this.field6963 = arg3;
        this.field6959 = new int[this.field6963 * this.field6960];
        DataBufferInt var5 = new DataBufferInt(this.field6959, this.field6959.length);
        if (arg2 > -42) {
            this.method1107(null, 6, -14, 63);
        }
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field6960, this.field6963), var5, null);
        this.field4634 = new BufferedImage(var6, var7, false, new Hashtable());
    }
}
