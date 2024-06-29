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

@OriginalClass("client!or")
public class class455 extends class281 {

    @OriginalMember(owner = "client!or", name = "v", descriptor = "Ljava/awt/Canvas;")
    private Canvas field6801;

    @OriginalMember(owner = "client!or", name = "x", descriptor = "Ljava/awt/Image;")
    private Image field6803;

    @OriginalMember(owner = "client!or", name = "w", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field6802;

    @OriginalMember(owner = "client!or", name = "u", descriptor = "Ljava/awt/Shape;")
    private Shape field6800;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Ljava/awt/Canvas;Z)V")
    public final void method1698(Canvas arg0, boolean arg1) {
        this.field6801 = arg0;
        this.field6802 = new Rectangle();
        this.field3721 = this.field6801.getSize().width;
        this.field3718 = this.field6801.getSize().height;
        this.field3725 = new int[this.field3721 * this.field3718];
        if (arg1) {
            DataBufferInt var3 = new DataBufferInt(this.field3725, this.field3725.length);
            DirectColorModel var4 = new DirectColorModel(32, 16711680, 65280, 255);
            WritableRaster var5 = Raster.createWritableRaster(var4.createCompatibleSampleModel(this.field3721, this.field3718), var3, null);
            this.field6803 = new BufferedImage(var4, var5, false, new Hashtable());
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Ljava/awt/Graphics;IBIII)V")
    public final void method1699(Graphics arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        this.field6800 = arg0.getClip();
        this.field6802.x = arg3;
        this.field6802.width = arg5;
        this.field6802.y = arg4;
        this.field6802.height = arg1;
        arg0.setClip(this.field6802);
        arg0.drawImage(this.field6803, 0, 0, this.field6801);
        arg0.setClip(this.field6800);
        if (arg2 >= -49) {
            this.field6801 = null;
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Ljava/awt/Graphics;BII)V")
    public final void method1700(Graphics arg0, byte arg1, int arg2, int arg3) {
        arg0.drawImage(this.field6803, arg2, arg3, this.field6801);
        int var5 = -4 / ((arg1 - 48) / 49);
    }
}
