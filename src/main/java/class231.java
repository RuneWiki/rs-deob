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

@OriginalClass("client!cu")
public class class231 extends class22 {

    @OriginalMember(owner = "client!cu", name = "B", descriptor = "Ljava/awt/Canvas;")
    private Canvas field3509;

    @OriginalMember(owner = "client!cu", name = "A", descriptor = "Ljava/awt/Image;")
    private Image field3508;

    @OriginalMember(owner = "client!cu", name = "z", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field3507;

    @OriginalMember(owner = "client!cu", name = "y", descriptor = "Ljava/awt/Shape;")
    private Shape field3506;

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIIBILjava/awt/Graphics;II)V")
    public final void method223(int arg0, int arg1, int arg2, byte arg3, int arg4, Graphics arg5, int arg6, int arg7) {
        this.field3506 = arg5.getClip();
        this.field3507.height = arg0;
        if (arg3 > -12) {
            this.method227(-57, -21, null, -105);
        }
        this.field3507.width = arg2;
        this.field3507.y = arg7;
        this.field3507.x = arg4;
        arg5.setClip(this.field3507);
        arg5.drawImage(this.field3508, arg4 - arg6, -arg1 + arg7, this.field3509);
        arg5.setClip(this.field3506);
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(IILjava/awt/Canvas;I)V")
    public final void method227(int arg0, int arg1, Canvas arg2, int arg3) {
        this.field3509 = arg2;
        this.field3507 = new Rectangle();
        this.field361 = arg3;
        this.field358 = arg0;
        this.field356 = new int[this.field361 * this.field358];
        if (arg1 != 13) {
            this.field3507 = null;
        }
        DataBufferInt var5 = new DataBufferInt(this.field356, this.field356.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field358, this.field361), var5, null);
        this.field3508 = new BufferedImage(var6, var7, false, new Hashtable());
    }
}
