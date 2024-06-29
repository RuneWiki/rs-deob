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

@OriginalClass("client!ww")
public class class734 extends class717 {

    @OriginalMember(owner = "client!ww", name = "v", descriptor = "Ljava/awt/Canvas;")
    private Canvas field10219;

    @OriginalMember(owner = "client!ww", name = "x", descriptor = "Ljava/awt/Image;")
    private Image field10221;

    @OriginalMember(owner = "client!ww", name = "u", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field10218;

    @OriginalMember(owner = "client!ww", name = "w", descriptor = "Ljava/awt/Shape;")
    private Shape field10220;

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(IIILjava/awt/Canvas;)V", line = 12)
    public final void method3426(int arg0, int arg1, int arg2, Canvas arg3) {
        this.field10219 = arg3;
        this.field10218 = new Rectangle();
        this.field9975 = arg2;
        this.field9980 = arg0;
        this.field9976 = new int[this.field9980 * this.field9975];
        DataBufferInt var5 = new DataBufferInt(this.field9976, this.field9976.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field9980, this.field9975), var5, null);
        this.field10221 = new BufferedImage(var6, var7, false, new Hashtable());
        if (arg1 != -17303) {
            this.field10218 = null;
        }
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(IIIIIILjava/awt/Graphics;I)V", line = 36)
    public final void method3429(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, Graphics arg6, int arg7) {
        this.field10220 = arg6.getClip();
        this.field10218.height = arg2;
        this.field10218.width = arg7;
        this.field10218.y = arg4;
        this.field10218.x = arg0;
        arg6.setClip(this.field10218);
        arg6.drawImage(this.field10221, arg0 - arg5, -arg1 + arg4, this.field10219);
        arg6.setClip(this.field10220);
        if (arg3 > -46) {
            this.field10218 = null;
        }
    }
}
