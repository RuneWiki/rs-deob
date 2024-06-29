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

@OriginalClass("client!cj")
public class class470 extends class296 {

    @OriginalMember(owner = "client!cj", name = "s", descriptor = "Ljava/awt/Canvas;")
    private Canvas field7200;

    @OriginalMember(owner = "client!cj", name = "t", descriptor = "Ljava/awt/Image;")
    private Image field7201;

    @OriginalMember(owner = "client!cj", name = "u", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field7202;

    @OriginalMember(owner = "client!cj", name = "v", descriptor = "Ljava/awt/Shape;")
    private Shape field7203;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILjava/awt/Graphics;IIBI)V")
    public final void method1522(int arg0, Graphics arg1, int arg2, int arg3, byte arg4, int arg5) {
        this.field7203 = arg1.getClip();
        this.field7202.height = arg3;
        this.field7202.x = arg5;
        this.field7202.y = arg0;
        this.field7202.width = arg2;
        if (arg4 <= 35) {
            this.field7200 = null;
        }
        arg1.setClip(this.field7202);
        arg1.drawImage(this.field7201, 0, 0, this.field7200);
        arg1.setClip(this.field7203);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
    public final void method1519(int arg0, Canvas arg1) {
        this.field7200 = arg1;
        this.field7202 = new Rectangle();
        this.field4491 = this.field7200.getSize().width;
        this.field4498 = this.field7200.getSize().height;
        if (arg0 != 0) {
            return;
        }
        this.field4493 = new int[this.field4498 * this.field4491];
        DataBufferInt var3 = new DataBufferInt(this.field4493, this.field4493.length);
        DirectColorModel var4 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var5 = Raster.createWritableRaster(var4.createCompatibleSampleModel(this.field4491, this.field4498), var3, null);
        this.field7201 = new BufferedImage(var4, var5, false, new Hashtable());
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
    public final void method1518(Graphics arg0, int arg1, int arg2, int arg3) {
        arg0.drawImage(this.field7201, arg2, arg3, this.field7200);
        if (arg1 < 69) {
            this.field7203 = null;
        }
    }
}
