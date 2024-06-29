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

@OriginalClass("client!qf")
public class class710 extends class418 {

    @OriginalMember(owner = "client!qf", name = "o", descriptor = "Ljava/awt/Canvas;")
    private Canvas field9756;

    @OriginalMember(owner = "client!qf", name = "q", descriptor = "Ljava/awt/Image;")
    private Image field9758;

    @OriginalMember(owner = "client!qf", name = "p", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field9757;

    @OriginalMember(owner = "client!qf", name = "r", descriptor = "Ljava/awt/Shape;")
    private Shape field9759;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILjava/awt/Graphics;IIIIII)V")
    public final void method2460(int arg0, Graphics arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field9759 = arg1.getClip();
        this.field9757.x = arg6;
        this.field9757.width = arg0;
        this.field9757.height = arg7;
        this.field9757.y = arg4;
        if (arg5 != 6452) {
            this.method2462(-95, null, 80, -118);
        }
        arg1.setClip(this.field9757);
        arg1.drawImage(this.field9758, arg6 - arg3, -arg2 + arg4, this.field9756);
        arg1.setClip(this.field9759);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILjava/awt/Canvas;II)V")
    public final void method2462(int arg0, Canvas arg1, int arg2, int arg3) {
        this.field9756 = arg1;
        this.field9757 = new Rectangle();
        this.field5705 = arg0;
        this.field5709 = arg3;
        this.field5710 = new int[this.field5709 * this.field5705];
        if (arg2 != 18872) {
            this.method2460(59, null, -80, -97, 78, 19, 78, 80);
        }
        DataBufferInt var5 = new DataBufferInt(this.field5710, this.field5710.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field5705, this.field5709), var5, null);
        this.field9758 = new BufferedImage(var6, var7, false, new Hashtable());
    }
}
