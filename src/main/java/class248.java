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

@OriginalClass("client!tea")
public class class248 extends class677 {

    @OriginalMember(owner = "client!tea", name = "s", descriptor = "Ljava/awt/Canvas;")
    private Canvas field3534;

    @OriginalMember(owner = "client!tea", name = "r", descriptor = "Ljava/awt/Image;")
    private Image field3533;

    @OriginalMember(owner = "client!tea", name = "t", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field3535;

    @OriginalMember(owner = "client!tea", name = "q", descriptor = "Ljava/awt/Shape;")
    private Shape field3532;

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(ILjava/awt/Canvas;BI)V", line = 11)
    public final void method909(int arg0, Canvas arg1, byte arg2, int arg3) {
        this.field3534 = arg1;
        this.field3535 = new Rectangle();
        this.field9632 = arg0;
        this.field9635 = arg3;
        this.field9631 = new int[this.field9635 * this.field9632];
        DataBufferInt var5 = new DataBufferInt(this.field9631, this.field9631.length);
        int var6 = 37 % ((-arg2 - 60) / 58);
        DirectColorModel var7 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var8 = Raster.createWritableRaster(var7.createCompatibleSampleModel(this.field9635, this.field9632), var5, null);
        this.field3533 = new BufferedImage(var7, var8, false, new Hashtable());
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(IIIILjava/awt/Graphics;III)V", line = 36)
    public final void method911(int arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5, int arg6, int arg7) {
        this.field3532 = arg4.getClip();
        this.field3535.y = arg0;
        this.field3535.x = arg1;
        this.field3535.width = arg3;
        this.field3535.height = arg7;
        arg4.setClip(this.field3535);
        arg4.drawImage(this.field3533, arg1 - arg2, -arg6 + arg0, this.field3534);
        arg4.setClip(this.field3532);
        int var9 = -41 / ((-arg5 - 6) / 54);
    }
}
