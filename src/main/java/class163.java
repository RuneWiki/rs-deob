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

@OriginalClass("client!q")
public class class163 extends class737 {

    @OriginalMember(owner = "client!q", name = "x", descriptor = "Ljava/awt/Canvas;")
    private Canvas field2085;

    @OriginalMember(owner = "client!q", name = "w", descriptor = "Ljava/awt/Image;")
    private Image field2084;

    @OriginalMember(owner = "client!q", name = "u", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field2082;

    @OriginalMember(owner = "client!q", name = "v", descriptor = "Ljava/awt/Shape;")
    private Shape field2083;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIILjava/awt/Graphics;III)V")
    public final void method1006(int arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5, int arg6, int arg7) {
        this.field2083 = arg4.getClip();
        if (arg3 != 2) {
            this.field2085 = null;
        }
        this.field2082.width = arg0;
        this.field2082.x = arg7;
        this.field2082.height = arg1;
        this.field2082.y = arg5;
        arg4.setClip(this.field2082);
        arg4.drawImage(this.field2084, arg7 - arg2, -arg6 + arg5, this.field2085);
        arg4.setClip(this.field2083);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Ljava/awt/Canvas;III)V")
    public final void method1007(Canvas arg0, int arg1, int arg2, int arg3) {
        this.field2085 = arg0;
        this.field2082 = new Rectangle();
        this.field10328 = arg1;
        if (arg3 != -21975) {
            this.field2084 = null;
        }
        this.field10323 = arg2;
        this.field10327 = new int[this.field10328 * this.field10323];
        DataBufferInt var5 = new DataBufferInt(this.field10327, this.field10327.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field10323, this.field10328), var5, null);
        this.field2084 = new BufferedImage(var6, var7, false, new Hashtable());
    }
}
