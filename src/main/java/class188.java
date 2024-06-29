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

@OriginalClass("client!aba")
public class class188 extends class637 {

    @OriginalMember(owner = "client!aba", name = "t", descriptor = "Ljava/awt/Canvas;")
    private Canvas field2459;

    @OriginalMember(owner = "client!aba", name = "r", descriptor = "Ljava/awt/Image;")
    private Image field2457;

    @OriginalMember(owner = "client!aba", name = "s", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field2458;

    @OriginalMember(owner = "client!aba", name = "q", descriptor = "Ljava/awt/Shape;")
    private Shape field2456;

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(IIIIILjava/awt/Graphics;II)V", line = 11)
    public final void method1260(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5, int arg6, int arg7) {
        int var9 = -93 % ((arg0 + 39) / 47);
        this.field2456 = arg5.getClip();
        this.field2458.width = arg7;
        this.field2458.height = arg1;
        this.field2458.y = arg4;
        this.field2458.x = arg6;
        arg5.setClip(this.field2458);
        arg5.drawImage(this.field2457, arg6 - arg3, -arg2 + arg4, this.field2459);
        arg5.setClip(this.field2456);
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(IIILjava/awt/Canvas;)V", line = 28)
    public final void method1261(int arg0, int arg1, int arg2, Canvas arg3) {
        this.field2459 = arg3;
        this.field2458 = new Rectangle();
        this.field8583 = arg2;
        this.field8584 = arg0;
        if (arg1 < 35) {
            return;
        }
        this.field8586 = new int[this.field8584 * this.field8583];
        DataBufferInt var5 = new DataBufferInt(this.field8586, this.field8586.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field8584, this.field8583), var5, null);
        this.field2457 = new BufferedImage(var6, var7, false, new Hashtable());
    }
}
