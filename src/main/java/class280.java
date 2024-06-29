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

@OriginalClass("client!wl")
public class class280 extends class458 {

    @OriginalMember(owner = "client!wl", name = "y", descriptor = "Ljava/awt/Canvas;")
    private Canvas field4019;

    @OriginalMember(owner = "client!wl", name = "x", descriptor = "Ljava/awt/Image;")
    private Image field4018;

    @OriginalMember(owner = "client!wl", name = "w", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field4017;

    @OriginalMember(owner = "client!wl", name = "z", descriptor = "Ljava/awt/Shape;")
    private Shape field4020;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V", line = 9)
    public final void method1420(int arg0, int arg1, int arg2, Graphics arg3, int arg4, int arg5) {
        this.field4020 = arg3.getClip();
        this.field4017.x = arg0;
        this.field4017.width = arg1;
        this.field4017.height = arg4;
        if (arg2 <= 0) {
            this.field4018 = null;
        }
        this.field4017.y = arg5;
        arg3.setClip(this.field4017);
        arg3.drawImage(this.field4018, 0, 0, this.field4019);
        arg3.setClip(this.field4020);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Ljava/awt/Graphics;IBI)V", line = 26)
    public final void method1417(Graphics arg0, int arg1, byte arg2, int arg3) {
        if (arg2 >= 4) {
            arg0.drawImage(this.field4018, arg3, arg1, this.field4019);
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Ljava/awt/Canvas;I)V", line = 42)
    public final void method1419(Canvas arg0, int arg1) {
        this.field4019 = arg0;
        this.field4017 = new Rectangle();
        this.field6755 = this.field4019.getSize().width;
        this.field6754 = this.field4019.getSize().height;
        this.field6756 = new int[this.field6755 * this.field6754];
        DataBufferInt var3 = new DataBufferInt(this.field6756, this.field6756.length);
        DirectColorModel var4 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var5 = Raster.createWritableRaster(var4.createCompatibleSampleModel(this.field6755, this.field6754), var3, null);
        this.field4018 = new BufferedImage(var4, var5, false, new Hashtable());
        if (arg1 != 0) {
            this.method1417(null, 63, (byte) 68, -37);
        }
    }
}
