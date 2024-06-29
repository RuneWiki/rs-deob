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

@OriginalClass("client!nc")
public class class18 extends class337 {

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "Ljava/awt/Canvas;")
    private Canvas field233;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "Ljava/awt/Image;")
    private Image field232;

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field235;

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "Ljava/awt/Shape;")
    private Shape field234;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Ljava/awt/Canvas;I)V", line = 9)
    public final void method140(Canvas arg0, int arg1) {
        this.field233 = arg0;
        this.field235 = new Rectangle();
        this.field5230 = this.field233.getSize().width;
        this.field5233 = this.field233.getSize().height;
        this.field5229 = new int[this.field5233 * this.field5230];
        DataBufferInt var3 = new DataBufferInt(this.field5229, this.field5229.length);
        DirectColorModel var4 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var5 = Raster.createWritableRaster(var4.createCompatibleSampleModel(this.field5230, this.field5233), var3, (Point) null);
        this.field232 = new BufferedImage(var4, var5, false, new Hashtable());
        if (arg1 != -4160) {
            this.field235 = (Rectangle) null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V", line = 32)
    public final void method141(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5) {
        if (arg0 < 27) {
            return;
        }
        this.field234 = arg5.getClip();
        this.field235.y = arg4;
        this.field235.x = arg2;
        this.field235.height = arg3;
        this.field235.width = arg1;
        arg5.setClip(this.field235);
        arg5.drawImage(this.field232, 0, 0, this.field233);
        arg5.setClip(this.field234);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IILjava/awt/Graphics;I)V", line = 49)
    public final void method142(int arg0, int arg1, Graphics arg2, int arg3) {
        arg2.drawImage(this.field232, arg1, arg3, this.field233);
        if (arg0 != -4163) {
            this.field233 = (Canvas) null;
        }
    }
}
