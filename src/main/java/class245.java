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

@OriginalClass("client!mh")
public class class245 extends class386 {

    @OriginalMember(owner = "client!mh", name = "n", descriptor = "Ljava/awt/Canvas;")
    private Canvas field3380;

    @OriginalMember(owner = "client!mh", name = "l", descriptor = "Ljava/awt/Image;")
    private Image field3378;

    @OriginalMember(owner = "client!mh", name = "m", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field3379;

    @OriginalMember(owner = "client!mh", name = "o", descriptor = "Ljava/awt/Shape;")
    private Shape field3381;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Ljava/awt/Canvas;B)V", line = 12)
    public final void method1606(Canvas arg0, byte arg1) {
        this.field3380 = arg0;
        this.field3379 = new Rectangle();
        this.field5435 = this.field3380.getSize().width;
        this.field5432 = this.field3380.getSize().height;
        if (arg1 != -88) {
            return;
        }
        this.field5436 = new int[this.field5435 * this.field5432];
        DataBufferInt var3 = new DataBufferInt(this.field5436, this.field5436.length);
        DirectColorModel var4 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var5 = Raster.createWritableRaster(var4.createCompatibleSampleModel(this.field5435, this.field5432), var3, (Point) null);
        this.field3378 = new BufferedImage(var4, var5, false, new Hashtable());
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIILjava/awt/Graphics;)V", line = 33)
    public final void method1607(int arg0, int arg1, int arg2, Graphics arg3) {
        arg3.drawImage(this.field3378, arg1, arg2, this.field3380);
        int var5 = 19 % ((-arg0 - 61) / 44);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILjava/awt/Graphics;IIIB)V", line = 43)
    public final void method1608(int arg0, Graphics arg1, int arg2, int arg3, int arg4, byte arg5) {
        this.field3381 = arg1.getClip();
        this.field3379.y = arg4;
        this.field3379.x = arg0;
        this.field3379.width = arg3;
        if (arg5 == 99) {
            this.field3379.height = arg2;
            arg1.setClip(this.field3379);
            arg1.drawImage(this.field3378, 0, 0, this.field3380);
            arg1.setClip(this.field3381);
        }
    }
}
