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

@OriginalClass("client!ea")
public class class543 extends class7 {

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "Ljava/awt/Canvas;")
    private Canvas field7452;

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "Ljava/awt/Image;")
    private Image field7449;

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field7450;

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "Ljava/awt/Shape;")
    private Shape field7451;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Ljava/awt/Canvas;I)V", line = 11)
    public final void method47(Canvas arg0, int arg1) {
        this.field7452 = arg0;
        this.field7450 = new Rectangle();
        this.field66 = this.field7452.getSize().width;
        this.field65 = this.field7452.getSize().height;
        if (arg1 != 22509) {
            return;
        }
        this.field64 = new int[this.field66 * this.field65];
        DataBufferInt var3 = new DataBufferInt(this.field64, this.field64.length);
        DirectColorModel var4 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var5 = Raster.createWritableRaster(var4.createCompatibleSampleModel(this.field66, this.field65), var3, null);
        this.field7449 = new BufferedImage(var4, var5, false, new Hashtable());
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V", line = 32)
    public final void method42(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field7451 = arg0.getClip();
        this.field7450.width = arg3;
        this.field7450.y = arg5;
        this.field7450.x = arg1;
        this.field7450.height = arg4;
        arg0.setClip(this.field7450);
        arg0.drawImage(this.field7449, 0, 0, this.field7452);
        arg0.setClip(this.field7451);
        if (arg2 > -11) {
            this.method47(null, -100);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BILjava/awt/Graphics;I)V", line = 51)
    public final void method43(byte arg0, int arg1, Graphics arg2, int arg3) {
        if (arg0 != 83) {
            this.field7451 = null;
        }
        arg2.drawImage(this.field7449, arg3, arg1, this.field7452);
    }
}
