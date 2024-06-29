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

@OriginalClass("client!gka")
public class class390 extends class666 {

    @OriginalMember(owner = "client!gka", name = "q", descriptor = "Ljava/awt/Canvas;")
    private Canvas field5876;

    @OriginalMember(owner = "client!gka", name = "s", descriptor = "Ljava/awt/Image;")
    private Image field5877;

    @OriginalMember(owner = "client!gka", name = "p", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field5875;

    @OriginalMember(owner = "client!gka", name = "r", descriptor = "Ljava/awt/Shape;")
    private Shape field5878;

    @OriginalMember(owner = "client!gka", name = "a", descriptor = "(IIILjava/awt/Graphics;IIII)V", line = 11)
    public final void method3102(int arg0, int arg1, int arg2, Graphics arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field5878 = arg3.getClip();
        this.field5875.height = arg2;
        if (arg7 != 100) {
            this.field5877 = null;
        }
        this.field5875.width = arg4;
        this.field5875.x = arg6;
        this.field5875.y = arg5;
        arg3.setClip(this.field5875);
        arg3.drawImage(this.field5877, arg6 - arg0, -arg1 + arg5, this.field5876);
        arg3.setClip(this.field5878);
    }

    @OriginalMember(owner = "client!gka", name = "a", descriptor = "(Ljava/awt/Canvas;III)V", line = 29)
    public final void method3103(Canvas arg0, int arg1, int arg2, int arg3) {
        this.field5876 = arg0;
        this.field5875 = new Rectangle();
        this.field9688 = arg2;
        this.field9684 = arg3;
        this.field9685 = new int[this.field9688 * this.field9684];
        DataBufferInt var5 = new DataBufferInt(this.field9685, this.field9685.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field9688, this.field9684), var5, null);
        int var8 = 117 / ((arg1 + 48) / 49);
        this.field5877 = new BufferedImage(var6, var7, false, new Hashtable());
    }
}
