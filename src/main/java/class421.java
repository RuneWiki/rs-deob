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

@OriginalClass("client!tc")
public class class421 extends class402 {

    @OriginalMember(owner = "client!tc", name = "n", descriptor = "Ljava/awt/Canvas;")
    private Canvas field6039;

    @OriginalMember(owner = "client!tc", name = "m", descriptor = "Ljava/awt/Image;")
    private Image field6038;

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field6036;

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "Ljava/awt/Shape;")
    private Shape field6037;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Ljava/awt/Graphics;BIIII)V", line = 10)
    public final void method2358(Graphics arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field6037 = arg0.getClip();
        this.field6036.y = arg3;
        this.field6036.height = arg4;
        this.field6036.x = arg5;
        this.field6036.width = arg2;
        if (arg1 > -82) {
            this.method2356(-128, (Canvas) null);
        }
        arg0.setClip(this.field6036);
        arg0.drawImage(this.field6038, 0, 0, this.field6039);
        arg0.setClip(this.field6037);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIBLjava/awt/Graphics;)V", line = 30)
    public final void method2360(int arg0, int arg1, byte arg2, Graphics arg3) {
        arg3.drawImage(this.field6038, arg1, arg0, this.field6039);
        if (arg2 != 75) {
            this.method2358((Graphics) null, (byte) 86, -25, -75, -48, 81);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILjava/awt/Canvas;)V", line = 40)
    public final void method2356(int arg0, Canvas arg1) {
        if (arg0 != 0) {
            this.method2356(-15, (Canvas) null);
        }
        this.field6039 = arg1;
        this.field6036 = new Rectangle();
        this.field5866 = this.field6039.getSize().width;
        this.field5865 = this.field6039.getSize().height;
        this.field5869 = new int[this.field5866 * this.field5865];
        DataBufferInt var3 = new DataBufferInt(this.field5869, this.field5869.length);
        DirectColorModel var4 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var5 = Raster.createWritableRaster(var4.createCompatibleSampleModel(this.field5866, this.field5865), var3, (Point) null);
        this.field6038 = new BufferedImage(var4, var5, false, new Hashtable());
    }
}
