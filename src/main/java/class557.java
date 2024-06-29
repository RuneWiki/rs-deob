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

@OriginalClass("client!lj")
public class class557 extends class246 {

    @OriginalMember(owner = "client!lj", name = "v", descriptor = "Ljava/awt/Canvas;")
    private Canvas field7523;

    @OriginalMember(owner = "client!lj", name = "w", descriptor = "Ljava/awt/Image;")
    private Image field7524;

    @OriginalMember(owner = "client!lj", name = "u", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field7522;

    @OriginalMember(owner = "client!lj", name = "t", descriptor = "Ljava/awt/Shape;")
    private Shape field7521;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Ljava/awt/Graphics;III)V", line = 10)
    public final void method1524(Graphics arg0, int arg1, int arg2, int arg3) {
        arg0.drawImage(this.field7524, arg2, arg3, this.field7523);
        if (arg1 != 22249) {
            this.field7524 = null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Ljava/awt/Canvas;Z)V", line = 21)
    public final void method1523(Canvas arg0, boolean arg1) {
        this.field7523 = arg0;
        this.field7522 = new Rectangle();
        this.field3498 = this.field7523.getSize().width;
        this.field3502 = this.field7523.getSize().height;
        this.field3503 = new int[this.field3502 * this.field3498];
        DataBufferInt var3 = new DataBufferInt(this.field3503, this.field3503.length);
        DirectColorModel var4 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var5 = Raster.createWritableRaster(var4.createCompatibleSampleModel(this.field3498, this.field3502), var3, null);
        this.field7524 = new BufferedImage(var4, var5, arg1, new Hashtable());
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIILjava/awt/Graphics;BI)V", line = 40)
    public final void method1522(int arg0, int arg1, int arg2, Graphics arg3, byte arg4, int arg5) {
        this.field7521 = arg3.getClip();
        this.field7522.x = arg5;
        this.field7522.width = arg1;
        this.field7522.y = arg2;
        this.field7522.height = arg0;
        int var7 = 29 / ((-arg4 - 51) / 55);
        arg3.setClip(this.field7522);
        arg3.drawImage(this.field7524, 0, 0, this.field7523);
        arg3.setClip(this.field7521);
    }
}
