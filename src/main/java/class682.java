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

@OriginalClass("client!aca")
public class class682 extends class137 {

    @OriginalMember(owner = "client!aca", name = "s", descriptor = "Ljava/awt/Canvas;")
    private Canvas field9604;

    @OriginalMember(owner = "client!aca", name = "t", descriptor = "Ljava/awt/Image;")
    private Image field9605;

    @OriginalMember(owner = "client!aca", name = "q", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field9602;

    @OriginalMember(owner = "client!aca", name = "r", descriptor = "Ljava/awt/Shape;")
    private Shape field9603;

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(ILjava/awt/Canvas;)V", line = 13)
    public final void method1016(int arg0, Canvas arg1) {
        this.field9604 = arg1;
        this.field9602 = new Rectangle();
        this.field2223 = this.field9604.getSize().width;
        this.field2220 = this.field9604.getSize().height;
        this.field2221 = new int[this.field2223 * this.field2220];
        DataBufferInt var3 = new DataBufferInt(this.field2221, this.field2221.length);
        DirectColorModel var4 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var5 = Raster.createWritableRaster(var4.createCompatibleSampleModel(this.field2223, this.field2220), var3, null);
        if (arg0 == 1) {
            this.field9605 = new BufferedImage(var4, var5, false, new Hashtable());
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(IILjava/awt/Graphics;I)V", line = 34)
    public final void method1015(int arg0, int arg1, Graphics arg2, int arg3) {
        if (arg3 != 27644) {
            this.method1015(-123, -127, null, 86);
        }
        arg2.drawImage(this.field9605, arg0, arg1, this.field9604);
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V", line = 44)
    public final void method1014(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5) {
        if (arg4 != 11) {
            return;
        }
        this.field9603 = arg5.getClip();
        this.field9602.y = arg1;
        this.field9602.x = arg3;
        this.field9602.width = arg2;
        this.field9602.height = arg0;
        arg5.setClip(this.field9602);
        arg5.drawImage(this.field9605, 0, 0, this.field9604);
        arg5.setClip(this.field9603);
    }
}
