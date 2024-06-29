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

@OriginalClass("client!gt")
public class class314 extends class46 {

    @OriginalMember(owner = "client!gt", name = "s", descriptor = "Ljava/awt/Canvas;")
    private Canvas field4737;

    @OriginalMember(owner = "client!gt", name = "q", descriptor = "Ljava/awt/Image;")
    private Image field4735;

    @OriginalMember(owner = "client!gt", name = "r", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field4736;

    @OriginalMember(owner = "client!gt", name = "t", descriptor = "Ljava/awt/Shape;")
    private Shape field4738;

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public final void method441(int arg0, Graphics arg1, int arg2, int arg3) {
        arg1.drawImage(this.field4735, arg2, arg0, this.field4737);
        int var5 = 70 % ((arg3 + 28) / 53);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
    public final void method440(int arg0, Canvas arg1) {
        this.field4737 = arg1;
        this.field4736 = new Rectangle();
        this.field859 = this.field4737.getSize().width;
        this.field855 = this.field4737.getSize().height;
        if (arg0 != -13858) {
            this.method440(40, null);
        }
        this.field858 = new int[this.field859 * this.field855];
        DataBufferInt var3 = new DataBufferInt(this.field858, this.field858.length);
        DirectColorModel var4 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var5 = Raster.createWritableRaster(var4.createCompatibleSampleModel(this.field859, this.field855), var3, null);
        this.field4735 = new BufferedImage(var4, var5, false, new Hashtable());
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
    public final void method442(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5) {
        this.field4738 = arg5.getClip();
        this.field4736.width = arg1;
        this.field4736.y = arg3;
        this.field4736.height = arg2;
        this.field4736.x = arg0;
        arg5.setClip(this.field4736);
        arg5.drawImage(this.field4735, 0, 0, this.field4737);
        if (arg4 == -30179) {
            arg5.setClip(this.field4738);
        }
    }
}
