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

@OriginalClass("client!vc")
public class class77 extends class451 {

    @OriginalMember(owner = "client!vc", name = "q", descriptor = "Ljava/awt/Canvas;")
    private Canvas field1092;

    @OriginalMember(owner = "client!vc", name = "r", descriptor = "Ljava/awt/Image;")
    private Image field1093;

    @OriginalMember(owner = "client!vc", name = "t", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field1094;

    @OriginalMember(owner = "client!vc", name = "s", descriptor = "Ljava/awt/Shape;")
    private Shape field1091;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIILjava/awt/Graphics;III)V")
    public final void method776(int arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5, int arg6, int arg7) {
        this.field1091 = arg4.getClip();
        this.field1094.width = arg2;
        this.field1094.y = arg3;
        this.field1094.height = arg6;
        if (arg7 == -303) {
            this.field1094.x = arg0;
            arg4.setClip(this.field1094);
            arg4.drawImage(this.field1093, arg0 - arg1, arg3 - arg5, this.field1092);
            arg4.setClip(this.field1091);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ljava/awt/Canvas;III)V")
    public final void method777(Canvas arg0, int arg1, int arg2, int arg3) {
        this.field1092 = arg0;
        this.field1094 = new Rectangle();
        this.field6616 = arg3;
        this.field6618 = arg2;
        if (arg1 <= 120) {
            return;
        }
        this.field6611 = new int[this.field6618 * this.field6616];
        DataBufferInt var5 = new DataBufferInt(this.field6611, this.field6611.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field6616, this.field6618), var5, null);
        this.field1093 = new BufferedImage(var6, var7, false, new Hashtable());
    }
}
