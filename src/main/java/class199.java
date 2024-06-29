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

@OriginalClass("client!c")
public class class199 extends class527 {

    @OriginalMember(owner = "client!c", name = "x", descriptor = "Ljava/awt/Canvas;")
    private Canvas field2654;

    @OriginalMember(owner = "client!c", name = "v", descriptor = "Ljava/awt/Image;")
    private Image field2652;

    @OriginalMember(owner = "client!c", name = "w", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field2653;

    @OriginalMember(owner = "client!c", name = "u", descriptor = "Ljava/awt/Shape;")
    private Shape field2651;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ILjava/awt/Canvas;II)V", line = 11)
    public final void method708(int arg0, Canvas arg1, int arg2, int arg3) {
        this.field2654 = arg1;
        this.field2653 = new Rectangle();
        this.field7222 = arg2;
        this.field7220 = arg3;
        if (arg0 != -23497) {
            this.field2653 = null;
        }
        this.field7221 = new int[this.field7222 * this.field7220];
        DataBufferInt var5 = new DataBufferInt(this.field7221, this.field7221.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field7222, this.field7220), var5, null);
        this.field2652 = new BufferedImage(var6, var7, false, new Hashtable());
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIILjava/awt/Graphics;II)V", line = 34)
    public final void method709(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5, int arg6, int arg7) {
        if (arg7 != -25644) {
            return;
        }
        this.field2651 = arg5.getClip();
        this.field2653.y = arg2;
        this.field2653.height = arg3;
        this.field2653.width = arg0;
        this.field2653.x = arg6;
        arg5.setClip(this.field2653);
        arg5.drawImage(this.field2652, arg6 - arg4, -arg1 + arg2, this.field2654);
        arg5.setClip(this.field2651);
    }
}
