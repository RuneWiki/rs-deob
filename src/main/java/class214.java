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

@OriginalClass("client!hs")
public class class214 extends class185 {

    @OriginalMember(owner = "client!hs", name = "x", descriptor = "Ljava/awt/Canvas;")
    private Canvas field3069;

    @OriginalMember(owner = "client!hs", name = "v", descriptor = "Ljava/awt/Image;")
    private Image field3067;

    @OriginalMember(owner = "client!hs", name = "w", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field3068;

    @OriginalMember(owner = "client!hs", name = "u", descriptor = "Ljava/awt/Shape;")
    private Shape field3066;

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIILjava/awt/Graphics;BI)V")
    public final void method1294(int arg0, int arg1, int arg2, Graphics arg3, byte arg4, int arg5) {
        this.field3066 = arg3.getClip();
        this.field3068.x = arg2;
        this.field3068.y = arg0;
        this.field3068.height = arg5;
        if (arg4 > -1) {
            this.field3069 = null;
        }
        this.field3068.width = arg1;
        arg3.setClip(this.field3068);
        arg3.drawImage(this.field3067, 0, 0, this.field3069);
        arg3.setClip(this.field3066);
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(BLjava/awt/Canvas;)V")
    public final void method1299(byte arg0, Canvas arg1) {
        this.field3069 = arg1;
        if (arg0 != 66) {
            return;
        }
        this.field3068 = new Rectangle();
        this.field2590 = this.field3069.getSize().width;
        this.field2589 = this.field3069.getSize().height;
        this.field2588 = new int[this.field2590 * this.field2589];
        DataBufferInt var3 = new DataBufferInt(this.field2588, this.field2588.length);
        DirectColorModel var4 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var5 = Raster.createWritableRaster(var4.createCompatibleSampleModel(this.field2590, this.field2589), var3, null);
        this.field3067 = new BufferedImage(var4, var5, false, new Hashtable());
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public final void method1301(int arg0, int arg1, int arg2, Graphics arg3) {
        arg3.drawImage(this.field3067, arg1, arg2, this.field3069);
        if (arg0 != -10312) {
            this.method1294(-65, -108, 61, null, (byte) 46, -11);
        }
    }
}
