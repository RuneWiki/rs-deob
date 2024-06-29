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

@OriginalClass("client!qc")
public class class260 extends class244 {

    @OriginalMember(owner = "client!qc", name = "p", descriptor = "Ljava/awt/Canvas;")
    private Canvas field4157;

    @OriginalMember(owner = "client!qc", name = "r", descriptor = "Ljava/awt/Image;")
    private Image field4159;

    @OriginalMember(owner = "client!qc", name = "o", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field4156;

    @OriginalMember(owner = "client!qc", name = "q", descriptor = "Ljava/awt/Shape;")
    private Shape field4158;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BILjava/awt/Graphics;I)V", line = 9)
    public final void method384(byte arg0, int arg1, Graphics arg2, int arg3) {
        if (arg0 != 124) {
            this.field4159 = null;
        }
        arg2.drawImage(this.field4159, arg1, arg3, this.field4157);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IILjava/awt/Graphics;ZII)V", line = 21)
    public final void method381(int arg0, int arg1, Graphics arg2, boolean arg3, int arg4, int arg5) {
        if (arg3) {
            this.method384((byte) -76, 22, null, -17);
        }
        this.field4158 = arg2.getClip();
        this.field4156.y = arg0;
        this.field4156.width = arg4;
        this.field4156.x = arg1;
        this.field4156.height = arg5;
        arg2.setClip(this.field4156);
        arg2.drawImage(this.field4159, 0, 0, this.field4157);
        arg2.setClip(this.field4158);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZLjava/awt/Canvas;)V", line = 39)
    public final void method383(boolean arg0, Canvas arg1) {
        this.field4157 = arg1;
        this.field4156 = new Rectangle();
        this.field3687 = this.field4157.getSize().width;
        this.field3685 = this.field4157.getSize().height;
        this.field3684 = new int[this.field3687 * this.field3685];
        DataBufferInt var3 = new DataBufferInt(this.field3684, this.field3684.length);
        DirectColorModel var4 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var5 = Raster.createWritableRaster(var4.createCompatibleSampleModel(this.field3687, this.field3685), var3, null);
        this.field4159 = new BufferedImage(var4, var5, arg0, new Hashtable());
    }
}
