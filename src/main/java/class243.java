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

@OriginalClass("client!ds")
public class class243 extends class318 {

    @OriginalMember(owner = "client!ds", name = "l", descriptor = "Ljava/awt/Canvas;")
    private Canvas field3238;

    @OriginalMember(owner = "client!ds", name = "j", descriptor = "Ljava/awt/Image;")
    private Image field3236;

    @OriginalMember(owner = "client!ds", name = "k", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field3237;

    @OriginalMember(owner = "client!ds", name = "i", descriptor = "Ljava/awt/Shape;")
    private Shape field3235;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(ZLjava/awt/Canvas;)V", line = 9)
    public final void method1598(boolean arg0, Canvas arg1) {
        this.field3238 = arg1;
        this.field3237 = new Rectangle();
        this.field4280 = this.field3238.getSize().width;
        this.field4281 = this.field3238.getSize().height;
        this.field4283 = new int[this.field4281 * this.field4280];
        DataBufferInt var3 = new DataBufferInt(this.field4283, this.field4283.length);
        DirectColorModel var4 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var5 = Raster.createWritableRaster(var4.createCompatibleSampleModel(this.field4280, this.field4281), var3, (Point) null);
        this.field3236 = new BufferedImage(var4, var5, arg0, new Hashtable());
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V", line = 27)
    public final void method1599(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5) {
        this.field3235 = arg5.getClip();
        this.field3237.width = arg4;
        this.field3237.y = arg0;
        this.field3237.height = arg3;
        this.field3237.x = arg2;
        arg5.setClip(this.field3237);
        arg5.drawImage(this.field3236, 0, arg1, this.field3238);
        arg5.setClip(this.field3235);
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IILjava/awt/Graphics;Z)V", line = 47)
    public final void method1600(int arg0, int arg1, Graphics arg2, boolean arg3) {
        if (arg3) {
            arg2.drawImage(this.field3236, arg1, arg0, this.field3238);
        }
    }
}
