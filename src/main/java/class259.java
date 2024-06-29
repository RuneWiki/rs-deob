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

@OriginalClass("client!oj")
public class class259 extends class228 {

    @OriginalMember(owner = "client!oj", name = "u", descriptor = "Ljava/awt/Canvas;")
    private Canvas field3276;

    @OriginalMember(owner = "client!oj", name = "t", descriptor = "Ljava/awt/Image;")
    private Image field3275;

    @OriginalMember(owner = "client!oj", name = "s", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field3274;

    @OriginalMember(owner = "client!oj", name = "r", descriptor = "Ljava/awt/Shape;")
    private Shape field3273;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public final void method1385(int arg0, Graphics arg1, int arg2, int arg3) {
        if (arg0 == 28525) {
            arg1.drawImage(this.field3275, arg3, arg2, this.field3276);
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
    public final void method1387(Canvas arg0, int arg1) {
        this.field3276 = arg0;
        this.field3274 = new Rectangle();
        this.field2917 = this.field3276.getSize().width;
        this.field2918 = this.field3276.getSize().height;
        this.field2920 = new int[this.field2918 * this.field2917];
        if (arg1 != 0) {
            this.method1387(null, -25);
        }
        DataBufferInt var3 = new DataBufferInt(this.field2920, this.field2920.length);
        DirectColorModel var4 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var5 = Raster.createWritableRaster(var4.createCompatibleSampleModel(this.field2917, this.field2918), var3, null);
        this.field3275 = new BufferedImage(var4, var5, false, new Hashtable());
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
    public final void method1389(int arg0, int arg1, int arg2, Graphics arg3, int arg4, int arg5) {
        this.field3273 = arg3.getClip();
        this.field3274.x = arg0;
        this.field3274.y = arg2;
        this.field3274.height = arg5;
        if (arg1 == 255) {
            this.field3274.width = arg4;
            arg3.setClip(this.field3274);
            arg3.drawImage(this.field3275, 0, 0, this.field3276);
            arg3.setClip(this.field3273);
        }
    }
}
