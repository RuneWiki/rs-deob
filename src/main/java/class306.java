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

@OriginalClass("client!vea")
public class class306 extends class298 {

    @OriginalMember(owner = "client!vea", name = "A", descriptor = "Ljava/awt/Canvas;")
    private Canvas field4019;

    @OriginalMember(owner = "client!vea", name = "y", descriptor = "Ljava/awt/Image;")
    private Image field4017;

    @OriginalMember(owner = "client!vea", name = "x", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field4016;

    @OriginalMember(owner = "client!vea", name = "z", descriptor = "Ljava/awt/Shape;")
    private Shape field4018;

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(Ljava/awt/Canvas;I)V", line = 9)
    public final void method1765(Canvas arg0, int arg1) {
        this.field4019 = arg0;
        this.field4016 = new Rectangle();
        this.field3899 = this.field4019.getSize().width;
        this.field3894 = this.field4019.getSize().height;
        this.field3895 = new int[this.field3899 * this.field3894];
        DataBufferInt var3 = new DataBufferInt(this.field3895, this.field3895.length);
        DirectColorModel var4 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var5 = Raster.createWritableRaster(var4.createCompatibleSampleModel(this.field3899, this.field3894), var3, null);
        if (arg1 > -13) {
            this.field4018 = null;
        }
        this.field4017 = new BufferedImage(var4, var5, false, new Hashtable());
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V", line = 31)
    public final void method1761(int arg0, int arg1, int arg2, Graphics arg3, int arg4, int arg5) {
        this.field4018 = arg3.getClip();
        this.field4016.y = arg2;
        this.field4016.height = arg0;
        this.field4016.width = arg1;
        this.field4016.x = arg5;
        if (arg4 == 16315) {
            arg3.setClip(this.field4016);
            arg3.drawImage(this.field4017, 0, 0, this.field4019);
            arg3.setClip(this.field4018);
        }
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(Ljava/awt/Graphics;IIB)V", line = 51)
    public final void method1759(Graphics arg0, int arg1, int arg2, byte arg3) {
        if (arg3 < 59) {
            this.method1761(104, 103, -63, null, -61, -107);
        }
        arg0.drawImage(this.field4017, arg1, arg2, this.field4019);
    }
}
