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

@OriginalClass("client!tf")
public class class297 extends class753 {

    @OriginalMember(owner = "client!tf", name = "x", descriptor = "Ljava/awt/Canvas;")
    private Canvas field3986;

    @OriginalMember(owner = "client!tf", name = "z", descriptor = "Ljava/awt/Image;")
    private Image field3988;

    @OriginalMember(owner = "client!tf", name = "y", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field3987;

    @OriginalMember(owner = "client!tf", name = "w", descriptor = "Ljava/awt/Shape;")
    private Shape field3985;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIILjava/awt/Canvas;)V")
    public final void method1772(int arg0, int arg1, int arg2, Canvas arg3) {
        this.field3986 = arg3;
        this.field3987 = new Rectangle();
        this.field10443 = arg0;
        this.field10433 = arg1;
        this.field10438 = new int[this.field10443 * this.field10433];
        if (arg2 != 4095) {
            this.method1772(-47, -17, -7, null);
        }
        DataBufferInt var5 = new DataBufferInt(this.field10438, this.field10438.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field10433, this.field10443), var5, null);
        this.field3988 = new BufferedImage(var6, var7, false, new Hashtable());
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Ljava/awt/Graphics;IBIIIII)V")
    public final void method1773(Graphics arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2 != -125) {
            return;
        }
        this.field3985 = arg0.getClip();
        this.field3987.width = arg4;
        this.field3987.x = arg1;
        this.field3987.y = arg7;
        this.field3987.height = arg6;
        arg0.setClip(this.field3987);
        arg0.drawImage(this.field3988, arg1 - arg3, -arg5 + arg7, this.field3986);
        arg0.setClip(this.field3985);
    }
}
