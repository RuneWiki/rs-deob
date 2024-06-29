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

@OriginalClass("client!qk")
public class class334 extends class9 {

    @OriginalMember(owner = "client!qk", name = "m", descriptor = "Ljava/awt/Canvas;")
    private Canvas field4831;

    @OriginalMember(owner = "client!qk", name = "l", descriptor = "Ljava/awt/Image;")
    private Image field4830;

    @OriginalMember(owner = "client!qk", name = "o", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field4833;

    @OriginalMember(owner = "client!qk", name = "n", descriptor = "Ljava/awt/Shape;")
    private Shape field4832;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
    public final void method70(int arg0, Canvas arg1) {
        this.field4831 = arg1;
        this.field4833 = new Rectangle();
        this.field152 = this.field4831.getSize().width;
        if (arg0 != -28147) {
            this.field4831 = (Canvas) null;
        }
        this.field160 = this.field4831.getSize().height;
        this.field155 = new int[this.field160 * this.field152];
        DataBufferInt var3 = new DataBufferInt(this.field155, this.field155.length);
        DirectColorModel var4 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var5 = Raster.createWritableRaster(var4.createCompatibleSampleModel(this.field152, this.field160), var3, (Point) null);
        this.field4830 = new BufferedImage(var4, var5, false, new Hashtable());
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public final void method73(int arg0, int arg1, int arg2, Graphics arg3) {
        if (arg0 == -1) {
            arg3.drawImage(this.field4830, arg1, arg2, this.field4831);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIBLjava/awt/Graphics;II)V")
    public final void method69(int arg0, int arg1, byte arg2, Graphics arg3, int arg4, int arg5) {
        this.field4832 = arg3.getClip();
        this.field4833.y = arg0;
        this.field4833.width = arg5;
        if (arg2 != -26) {
            this.field4832 = (Shape) null;
        }
        this.field4833.height = arg1;
        this.field4833.x = arg4;
        arg3.setClip(this.field4833);
        arg3.drawImage(this.field4830, 0, 0, this.field4831);
        arg3.setClip(this.field4832);
    }
}
