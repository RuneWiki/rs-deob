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

@OriginalClass("client!ir")
public class class25 extends class223 {

    @OriginalMember(owner = "client!ir", name = "q", descriptor = "Ljava/awt/Canvas;")
    private Canvas field419;

    @OriginalMember(owner = "client!ir", name = "p", descriptor = "Ljava/awt/Image;")
    private Image field418;

    @OriginalMember(owner = "client!ir", name = "r", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field420;

    @OriginalMember(owner = "client!ir", name = "o", descriptor = "Ljava/awt/Shape;")
    private Shape field417;

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IZIIIIILjava/awt/Graphics;)V", line = 9)
    public final void method244(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, Graphics arg7) {
        this.field417 = arg7.getClip();
        if (arg1) {
            this.method245(null, -92, -7, 84);
        }
        this.field420.y = arg3;
        this.field420.height = arg0;
        this.field420.x = arg4;
        this.field420.width = arg5;
        arg7.setClip(this.field420);
        arg7.drawImage(this.field418, arg4 - arg2, -arg6 + arg3, this.field419);
        arg7.setClip(this.field417);
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Ljava/awt/Canvas;III)V", line = 30)
    public final void method245(Canvas arg0, int arg1, int arg2, int arg3) {
        this.field419 = arg0;
        this.field420 = new Rectangle();
        if (arg3 != 2) {
            this.field420 = null;
        }
        this.field3163 = arg2;
        this.field3166 = arg1;
        this.field3165 = new int[this.field3166 * this.field3163];
        DataBufferInt var5 = new DataBufferInt(this.field3165, this.field3165.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field3163, this.field3166), var5, null);
        this.field418 = new BufferedImage(var6, var7, false, new Hashtable());
    }
}
