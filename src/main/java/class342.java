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

@OriginalClass("client!np")
public class class342 extends class283 {

    @OriginalMember(owner = "client!np", name = "v", descriptor = "Ljava/awt/Canvas;")
    private Canvas field5135;

    @OriginalMember(owner = "client!np", name = "u", descriptor = "Ljava/awt/Image;")
    private Image field5134;

    @OriginalMember(owner = "client!np", name = "w", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field5136;

    @OriginalMember(owner = "client!np", name = "t", descriptor = "Ljava/awt/Shape;")
    private Shape field5133;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Ljava/awt/Canvas;I)V", line = 9)
    public final void method206(Canvas arg0, int arg1) {
        this.field5135 = arg0;
        this.field5136 = new Rectangle();
        this.field4260 = this.field5135.getSize().width;
        this.field4258 = this.field5135.getSize().height;
        this.field4265 = new int[this.field4260 * this.field4258];
        if (arg1 != 7) {
            this.method210(-110, null, 52, -25, -65, -82);
        }
        DataBufferInt var3 = new DataBufferInt(this.field4265, this.field4265.length);
        DirectColorModel var4 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var5 = Raster.createWritableRaster(var4.createCompatibleSampleModel(this.field4260, this.field4258), var3, null);
        this.field5134 = new BufferedImage(var4, var5, false, new Hashtable());
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(IIILjava/awt/Graphics;)V", line = 33)
    public final void method209(int arg0, int arg1, int arg2, Graphics arg3) {
        if (arg2 == 14117) {
            arg3.drawImage(this.field5134, arg1, arg0, this.field5135);
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(ILjava/awt/Graphics;IIII)V", line = 43)
    public final void method210(int arg0, Graphics arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field5133 = arg1.getClip();
        this.field5136.x = arg4;
        this.field5136.width = arg2;
        this.field5136.height = arg3;
        this.field5136.y = arg5;
        arg1.setClip(this.field5136);
        if (arg0 != 64) {
            this.method206(null, 92);
        }
        arg1.drawImage(this.field5134, 0, 0, this.field5135);
        arg1.setClip(this.field5133);
    }
}
