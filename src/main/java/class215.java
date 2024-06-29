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

@OriginalClass("client!ec")
public class class215 extends class416 {

    @OriginalMember(owner = "client!ec", name = "s", descriptor = "Ljava/awt/Canvas;")
    private Canvas field3278;

    @OriginalMember(owner = "client!ec", name = "r", descriptor = "Ljava/awt/Image;")
    private Image field3277;

    @OriginalMember(owner = "client!ec", name = "q", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field3276;

    @OriginalMember(owner = "client!ec", name = "t", descriptor = "Ljava/awt/Shape;")
    private Shape field3279;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IBILjava/awt/Graphics;)V")
    public final void method821(int arg0, byte arg1, int arg2, Graphics arg3) {
        if (arg1 != 78) {
            this.method819(null, -78);
        }
        arg3.drawImage(this.field3277, arg2, arg0, this.field3278);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
    public final void method819(Canvas arg0, int arg1) {
        this.field3278 = arg0;
        this.field3276 = new Rectangle();
        this.field6015 = this.field3278.getSize().width;
        this.field6019 = this.field3278.getSize().height;
        if (arg1 != 1) {
            return;
        }
        this.field6016 = new int[this.field6019 * this.field6015];
        DataBufferInt var3 = new DataBufferInt(this.field6016, this.field6016.length);
        DirectColorModel var4 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var5 = Raster.createWritableRaster(var4.createCompatibleSampleModel(this.field6015, this.field6019), var3, null);
        this.field3277 = new BufferedImage(var4, var5, false, new Hashtable());
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
    public final void method820(int arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5) {
        this.field3279 = arg4.getClip();
        this.field3276.height = arg1;
        this.field3276.x = arg5;
        this.field3276.y = arg0;
        this.field3276.width = arg3;
        arg4.setClip(this.field3276);
        if (arg2 < -37) {
            arg4.drawImage(this.field3277, 0, 0, this.field3278);
            arg4.setClip(this.field3279);
        }
    }
}
