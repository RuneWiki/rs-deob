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

@OriginalClass("client!uj")
public class class475 extends class108 {

    @OriginalMember(owner = "client!uj", name = "r", descriptor = "Ljava/awt/Canvas;")
    private Canvas field6991;

    @OriginalMember(owner = "client!uj", name = "p", descriptor = "Ljava/awt/Image;")
    private Image field6989;

    @OriginalMember(owner = "client!uj", name = "s", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field6992;

    @OriginalMember(owner = "client!uj", name = "q", descriptor = "Ljava/awt/Shape;")
    private Shape field6990;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V", line = 12)
    public final void method812(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field6990 = arg0.getClip();
        this.field6992.height = arg5;
        this.field6992.x = arg2;
        this.field6992.width = arg3;
        if (arg4 <= 101) {
            this.field6990 = null;
        }
        this.field6992.y = arg1;
        arg0.setClip(this.field6992);
        arg0.drawImage(this.field6989, 0, 0, this.field6991);
        arg0.setClip(this.field6990);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IILjava/awt/Graphics;I)V", line = 29)
    public final void method810(int arg0, int arg1, Graphics arg2, int arg3) {
        arg2.drawImage(this.field6989, arg1, arg3, this.field6991);
        int var5 = 81 / ((-arg0 - 69) / 45);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ILjava/awt/Canvas;)V", line = 41)
    public final void method814(int arg0, Canvas arg1) {
        this.field6991 = arg1;
        this.field6992 = new Rectangle();
        this.field1601 = this.field6991.getSize().width;
        this.field1604 = this.field6991.getSize().height;
        this.field1605 = new int[this.field1604 * this.field1601];
        DataBufferInt var3 = new DataBufferInt(this.field1605, this.field1605.length);
        if (arg0 < 1) {
            this.method814(50, null);
        }
        DirectColorModel var4 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var5 = Raster.createWritableRaster(var4.createCompatibleSampleModel(this.field1601, this.field1604), var3, null);
        this.field6989 = new BufferedImage(var4, var5, false, new Hashtable());
    }
}
