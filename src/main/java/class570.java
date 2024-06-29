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

@OriginalClass("client!jaa")
public class class570 extends class483 {

    @OriginalMember(owner = "client!jaa", name = "u", descriptor = "Ljava/awt/Canvas;")
    private Canvas field8033;

    @OriginalMember(owner = "client!jaa", name = "v", descriptor = "Ljava/awt/Image;")
    private Image field8034;

    @OriginalMember(owner = "client!jaa", name = "t", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field8032;

    @OriginalMember(owner = "client!jaa", name = "s", descriptor = "Ljava/awt/Shape;")
    private Shape field8031;

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(ZIILjava/awt/Graphics;II)V")
    public final void method1661(boolean arg0, int arg1, int arg2, Graphics arg3, int arg4, int arg5) {
        this.field8031 = arg3.getClip();
        this.field8032.width = arg2;
        this.field8032.x = arg1;
        this.field8032.height = arg4;
        this.field8032.y = arg5;
        arg3.setClip(this.field8032);
        arg3.drawImage(this.field8034, 0, 0, this.field8033);
        arg3.setClip(this.field8031);
        if (!arg0) {
            this.method1660(-59, -15, 62, null);
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
    public final void method1664(int arg0, Canvas arg1) {
        this.field8033 = arg1;
        if (arg0 <= 1) {
            return;
        }
        this.field8032 = new Rectangle();
        this.field6872 = this.field8033.getSize().width;
        this.field6868 = this.field8033.getSize().height;
        this.field6867 = new int[this.field6872 * this.field6868];
        DataBufferInt var3 = new DataBufferInt(this.field6867, this.field6867.length);
        DirectColorModel var4 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var5 = Raster.createWritableRaster(var4.createCompatibleSampleModel(this.field6872, this.field6868), var3, null);
        this.field8034 = new BufferedImage(var4, var5, false, new Hashtable());
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public final void method1660(int arg0, int arg1, int arg2, Graphics arg3) {
        if (arg1 != -31536) {
            this.field8032 = null;
        }
        arg3.drawImage(this.field8034, arg0, arg2, this.field8033);
    }
}
