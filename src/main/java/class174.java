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

@OriginalClass("client!en")
public class class174 extends class56 {

    @OriginalMember(owner = "client!en", name = "q", descriptor = "Ljava/awt/Canvas;")
    private Canvas field2452;

    @OriginalMember(owner = "client!en", name = "s", descriptor = "Ljava/awt/Image;")
    private Image field2454;

    @OriginalMember(owner = "client!en", name = "p", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field2451;

    @OriginalMember(owner = "client!en", name = "r", descriptor = "Ljava/awt/Shape;")
    private Shape field2453;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(ZLjava/awt/Graphics;II)V")
    public final void method367(boolean arg0, Graphics arg1, int arg2, int arg3) {
        if (!arg0) {
            this.field2454 = (Image) null;
        }
        arg1.drawImage(this.field2454, arg3, arg2, this.field2452);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Ljava/awt/Canvas;Z)V")
    public final void method365(Canvas arg0, boolean arg1) {
        this.field2452 = arg0;
        this.field2451 = new Rectangle();
        this.field756 = this.field2452.getSize().width;
        this.field755 = this.field2452.getSize().height;
        this.field757 = new int[this.field756 * this.field755];
        DataBufferInt var3 = new DataBufferInt(this.field757, this.field757.length);
        DirectColorModel var4 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var5 = Raster.createWritableRaster(var4.createCompatibleSampleModel(this.field756, this.field755), var3, (Point) null);
        this.field2454 = new BufferedImage(var4, var5, arg1, new Hashtable());
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
    public final void method368(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5) {
        this.field2453 = arg5.getClip();
        this.field2451.x = arg1;
        this.field2451.height = arg3;
        this.field2451.y = arg4;
        this.field2451.width = arg0;
        arg5.setClip(this.field2451);
        arg5.drawImage(this.field2454, 0, 0, this.field2452);
        arg5.setClip(this.field2453);
        if (arg2 != 23608) {
            this.method368(107, -100, 23, -102, 27, (Graphics) null);
        }
    }
}
