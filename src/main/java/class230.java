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

@OriginalClass("client!ae")
public class class230 extends class335 {

    @OriginalMember(owner = "client!ae", name = "B", descriptor = "Ljava/awt/Canvas;")
    private Canvas field3680;

    @OriginalMember(owner = "client!ae", name = "C", descriptor = "Ljava/awt/Image;")
    private Image field3681;

    @OriginalMember(owner = "client!ae", name = "z", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field3678;

    @OriginalMember(owner = "client!ae", name = "A", descriptor = "Ljava/awt/Shape;")
    private Shape field3679;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/awt/Graphics;BII)V", line = 12)
    public final void method1191(Graphics arg0, byte arg1, int arg2, int arg3) {
        int var5 = -121 / ((arg1 + 4) / 52);
        arg0.drawImage(this.field3681, arg3, arg2, this.field3680);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V", line = 20)
    public final void method1197(int arg0, int arg1, int arg2, Graphics arg3, int arg4, int arg5) {
        this.field3679 = arg3.getClip();
        this.field3678.y = arg0;
        this.field3678.width = arg4;
        this.field3678.x = arg1;
        this.field3678.height = arg2;
        arg3.setClip(this.field3678);
        arg3.drawImage(this.field3681, arg5, 0, this.field3680);
        arg3.setClip(this.field3679);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/awt/Canvas;I)V", line = 34)
    public final void method1192(Canvas arg0, int arg1) {
        this.field3680 = arg0;
        this.field3678 = new Rectangle();
        this.field5476 = this.field3680.getSize().width;
        this.field5480 = this.field3680.getSize().height;
        this.field5477 = new int[this.field5480 * this.field5476];
        DataBufferInt var3 = new DataBufferInt(this.field5477, this.field5477.length);
        DirectColorModel var4 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var5 = Raster.createWritableRaster(var4.createCompatibleSampleModel(this.field5476, this.field5480), var3, null);
        this.field3681 = new BufferedImage(var4, var5, false, new Hashtable());
        if (arg1 != 35) {
            this.method1192(null, -10);
        }
    }
}
