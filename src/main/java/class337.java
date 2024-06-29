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

@OriginalClass("client!aa")
public class class337 extends class228 {

    @OriginalMember(owner = "client!aa", name = "u", descriptor = "Ljava/awt/Canvas;")
    private Canvas field4536;

    @OriginalMember(owner = "client!aa", name = "x", descriptor = "Ljava/awt/Image;")
    private Image field4539;

    @OriginalMember(owner = "client!aa", name = "w", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field4538;

    @OriginalMember(owner = "client!aa", name = "v", descriptor = "Ljava/awt/Shape;")
    private Shape field4537;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
    public final void method1420(int arg0, Canvas arg1) {
        this.field4536 = arg1;
        this.field4538 = new Rectangle();
        this.field3239 = this.field4536.getSize().width;
        this.field3238 = this.field4536.getSize().height;
        if (arg0 != -1) {
            return;
        }
        this.field3236 = new int[this.field3239 * this.field3238];
        DataBufferInt var3 = new DataBufferInt(this.field3236, this.field3236.length);
        DirectColorModel var4 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var5 = Raster.createWritableRaster(var4.createCompatibleSampleModel(this.field3239, this.field3238), var3, null);
        this.field4539 = new BufferedImage(var4, var5, false, new Hashtable());
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IBILjava/awt/Graphics;)V")
    public final void method1419(int arg0, byte arg1, int arg2, Graphics arg3) {
        if (arg1 < -62) {
            arg3.drawImage(this.field4539, arg0, arg2, this.field4536);
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
    public final void method1416(int arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5) {
        this.field4537 = arg4.getClip();
        this.field4538.width = arg2;
        this.field4538.y = arg0;
        if (arg5 < 106) {
            this.field4538 = null;
        }
        this.field4538.x = arg3;
        this.field4538.height = arg1;
        arg4.setClip(this.field4538);
        arg4.drawImage(this.field4539, 0, 0, this.field4536);
        arg4.setClip(this.field4537);
    }
}
