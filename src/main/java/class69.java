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

@OriginalClass("client!pk")
public class class69 extends class230 {

    @OriginalMember(owner = "client!pk", name = "m", descriptor = "Ljava/awt/Canvas;")
    private Canvas field896;

    @OriginalMember(owner = "client!pk", name = "k", descriptor = "Ljava/awt/Image;")
    private Image field894;

    @OriginalMember(owner = "client!pk", name = "l", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field895;

    @OriginalMember(owner = "client!pk", name = "j", descriptor = "Ljava/awt/Shape;")
    private Shape field893;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Ljava/awt/Graphics;IBI)V")
    public final void method468(Graphics arg0, int arg1, byte arg2, int arg3) {
        if (arg2 != -10) {
            this.field895 = (Rectangle) null;
        }
        arg0.drawImage(this.field894, arg1, arg3, this.field896);
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IILjava/awt/Graphics;III)V")
    public final void method469(int arg0, int arg1, Graphics arg2, int arg3, int arg4, int arg5) {
        this.field893 = arg2.getClip();
        this.field895.height = arg5;
        this.field895.y = arg3;
        this.field895.x = arg4;
        this.field895.width = arg0;
        arg2.setClip(this.field895);
        arg2.drawImage(this.field894, 0, arg1, this.field896);
        arg2.setClip(this.field893);
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
    public final void method470(Canvas arg0, int arg1) {
        this.field896 = arg0;
        this.field895 = new Rectangle();
        this.field3519 = this.field896.getSize().width;
        this.field3517 = this.field896.getSize().height;
        this.field3515 = new int[this.field3519 * this.field3517];
        DataBufferInt var3 = new DataBufferInt(this.field3515, this.field3515.length);
        DirectColorModel var4 = new DirectColorModel(32, 16711680, 65280, 255);
        if (arg1 > -90) {
            this.field893 = (Shape) null;
        }
        WritableRaster var5 = Raster.createWritableRaster(var4.createCompatibleSampleModel(this.field3519, this.field3517), var3, (Point) null);
        this.field894 = new BufferedImage(var4, var5, false, new Hashtable());
    }
}
