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

@OriginalClass("client!jn")
public class class427 extends class292 {

    @OriginalMember(owner = "client!jn", name = "n", descriptor = "Ljava/awt/Canvas;")
    private Canvas field6098;

    @OriginalMember(owner = "client!jn", name = "o", descriptor = "Ljava/awt/Image;")
    private Image field6099;

    @OriginalMember(owner = "client!jn", name = "m", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field6097;

    @OriginalMember(owner = "client!jn", name = "l", descriptor = "Ljava/awt/Shape;")
    private Shape field6096;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIZIILjava/awt/Graphics;)V")
    public final void method1642(int arg0, int arg1, boolean arg2, int arg3, int arg4, Graphics arg5) {
        this.field6096 = arg5.getClip();
        this.field6097.x = arg1;
        this.field6097.width = arg3;
        this.field6097.y = arg0;
        if (!arg2) {
            this.field6098 = (Canvas) null;
        }
        this.field6097.height = arg4;
        arg5.setClip(this.field6097);
        arg5.drawImage(this.field6099, 0, 0, this.field6098);
        arg5.setClip(this.field6096);
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public final void method1645(int arg0, int arg1, int arg2, Graphics arg3) {
        arg3.drawImage(this.field6099, arg2, arg1, this.field6098);
        if (arg0 <= 95) {
            this.field6097 = (Rectangle) null;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
    public final void method1639(Canvas arg0, int arg1) {
        this.field6098 = arg0;
        this.field6097 = new Rectangle();
        this.field4082 = this.field6098.getSize().width;
        this.field4083 = this.field6098.getSize().height;
        this.field4080 = new int[this.field4083 * this.field4082];
        DataBufferInt var3 = new DataBufferInt(this.field4080, this.field4080.length);
        DirectColorModel var4 = new DirectColorModel(32, 16711680, 65280, 255);
        if (arg1 != 1730965570) {
            this.field6097 = (Rectangle) null;
        }
        WritableRaster var5 = Raster.createWritableRaster(var4.createCompatibleSampleModel(this.field4082, this.field4083), var3, (Point) null);
        this.field6099 = new BufferedImage(var4, var5, false, new Hashtable());
    }
}
