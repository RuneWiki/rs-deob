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

@OriginalClass("client!ev")
public class class145 extends class49 {

    @OriginalMember(owner = "client!ev", name = "B", descriptor = "Ljava/awt/Canvas;")
    private Canvas field2492;

    @OriginalMember(owner = "client!ev", name = "A", descriptor = "Ljava/awt/Image;")
    private Image field2491;

    @OriginalMember(owner = "client!ev", name = "z", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field2490;

    @OriginalMember(owner = "client!ev", name = "y", descriptor = "Ljava/awt/Shape;")
    private Shape field2489;

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V", line = 10)
    public final void method387(int arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5) {
        this.field2489 = arg4.getClip();
        this.field2490.height = arg0;
        this.field2490.x = arg1;
        this.field2490.width = arg2;
        if (arg3 > 79) {
            this.field2490.y = arg5;
            arg4.setClip(this.field2490);
            arg4.drawImage(this.field2491, 0, 0, this.field2492);
            arg4.setClip(this.field2489);
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(ILjava/awt/Graphics;IZ)V", line = 28)
    public final void method390(int arg0, Graphics arg1, int arg2, boolean arg3) {
        arg1.drawImage(this.field2491, arg2, arg0, this.field2492);
        if (!arg3) {
            this.field2492 = null;
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(Ljava/awt/Canvas;B)V", line = 38)
    public final void method389(Canvas arg0, byte arg1) {
        this.field2492 = arg0;
        this.field2490 = new Rectangle();
        this.field643 = this.field2492.getSize().width;
        this.field638 = this.field2492.getSize().height;
        if (arg1 != 3) {
            this.field2489 = null;
        }
        this.field641 = new int[this.field643 * this.field638];
        DataBufferInt var3 = new DataBufferInt(this.field641, this.field641.length);
        DirectColorModel var4 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var5 = Raster.createWritableRaster(var4.createCompatibleSampleModel(this.field643, this.field638), var3, null);
        this.field2491 = new BufferedImage(var4, var5, false, new Hashtable());
    }
}
