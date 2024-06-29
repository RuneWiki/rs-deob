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
public class class378 extends class256 {

    @OriginalMember(owner = "client!hs", name = "v", descriptor = "Ljava/awt/Canvas;")
    private Canvas field4625;

    @OriginalMember(owner = "client!hs", name = "x", descriptor = "Ljava/awt/Image;")
    private Image field4627;

    @OriginalMember(owner = "client!hs", name = "u", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field4624;

    @OriginalMember(owner = "client!hs", name = "w", descriptor = "Ljava/awt/Shape;")
    private Shape field4626;

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIILjava/awt/Canvas;)V")
    public final void method1648(int arg0, int arg1, int arg2, Canvas arg3) {
        this.field4625 = arg3;
        this.field4624 = new Rectangle();
        this.field3469 = arg0;
        this.field3468 = arg2;
        this.field3467 = new int[this.field3469 * this.field3468];
        DataBufferInt var5 = new DataBufferInt(this.field3467, this.field3467.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field3468, this.field3469), var5, null);
        this.field4627 = new BufferedImage(var6, var7, false, new Hashtable());
        if (arg1 != -1) {
            this.field4624 = null;
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IILjava/awt/Graphics;IIIII)V")
    public final void method1647(int arg0, int arg1, Graphics arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field4626 = arg2.getClip();
        this.field4624.width = arg3;
        this.field4624.y = arg7;
        if (arg1 != -1) {
            this.method1648(-11, -75, -7, null);
        }
        this.field4624.x = arg6;
        this.field4624.height = arg4;
        arg2.setClip(this.field4624);
        arg2.drawImage(this.field4627, arg6 - arg0, arg7 - arg5, this.field4625);
        arg2.setClip(this.field4626);
    }
}
