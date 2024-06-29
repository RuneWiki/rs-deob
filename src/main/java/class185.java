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

@OriginalClass("client!es")
public class class185 extends class343 {

    @OriginalMember(owner = "client!es", name = "u", descriptor = "Ljava/awt/Canvas;")
    private Canvas field2689;

    @OriginalMember(owner = "client!es", name = "v", descriptor = "Ljava/awt/Image;")
    private Image field2690;

    @OriginalMember(owner = "client!es", name = "s", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field2687;

    @OriginalMember(owner = "client!es", name = "t", descriptor = "Ljava/awt/Shape;")
    private Shape field2688;

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
    public final void method528(int arg0, int arg1, int arg2, Graphics arg3, int arg4, int arg5) {
        this.field2688 = arg3.getClip();
        this.field2687.height = arg1;
        this.field2687.width = arg2;
        this.field2687.y = arg4;
        this.field2687.x = arg0;
        arg3.setClip(this.field2687);
        arg3.drawImage(this.field2690, 0, 0, this.field2689);
        if (arg5 >= -19) {
            this.method529(null, 89, -84, -46);
        }
        arg3.setClip(this.field2688);
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
    public final void method527(Canvas arg0, int arg1) {
        this.field2689 = arg0;
        this.field2687 = new Rectangle();
        this.field5345 = this.field2689.getSize().width;
        this.field5346 = this.field2689.getSize().height;
        this.field5347 = new int[this.field5346 * this.field5345];
        DataBufferInt var3 = new DataBufferInt(this.field5347, this.field5347.length);
        DirectColorModel var4 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var5 = Raster.createWritableRaster(var4.createCompatibleSampleModel(this.field5345, this.field5346), var3, null);
        this.field2690 = new BufferedImage(var4, var5, false, new Hashtable());
        if (arg1 != 26183) {
            this.method528(-21, -68, 51, null, -127, -114);
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
    public final void method529(Graphics arg0, int arg1, int arg2, int arg3) {
        if (arg3 == 0) {
            arg0.drawImage(this.field2690, arg1, arg2, this.field2689);
        }
    }
}
