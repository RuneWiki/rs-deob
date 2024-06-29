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

@OriginalClass("client!jo")
public class class334 extends class593 {

    @OriginalMember(owner = "client!jo", name = "r", descriptor = "Ljava/awt/Canvas;")
    private Canvas field4665;

    @OriginalMember(owner = "client!jo", name = "s", descriptor = "Ljava/awt/Image;")
    private Image field4666;

    @OriginalMember(owner = "client!jo", name = "q", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field4664;

    @OriginalMember(owner = "client!jo", name = "t", descriptor = "Ljava/awt/Shape;")
    private Shape field4667;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIIIIIILjava/awt/Graphics;)V", line = 10)
    public final void method1280(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, Graphics arg7) {
        this.field4667 = arg7.getClip();
        this.field4664.y = arg4;
        int var9 = 70 % ((16 - arg3) / 62);
        this.field4664.width = arg2;
        this.field4664.height = arg0;
        this.field4664.x = arg1;
        arg7.setClip(this.field4664);
        arg7.drawImage(this.field4666, arg1 - arg6, arg4 - arg5, this.field4665);
        arg7.setClip(this.field4667);
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIZLjava/awt/Canvas;)V", line = 27)
    public final void method1281(int arg0, int arg1, boolean arg2, Canvas arg3) {
        this.field4665 = arg3;
        this.field4664 = new Rectangle();
        this.field8355 = arg0;
        this.field8351 = arg1;
        this.field8349 = new int[this.field8355 * this.field8351];
        DataBufferInt var5 = new DataBufferInt(this.field8349, this.field8349.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field8351, this.field8355), var5, null);
        this.field4666 = new BufferedImage(var6, var7, arg2, new Hashtable());
    }
}
