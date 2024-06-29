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

@OriginalClass("client!hu")
public class class87 extends class267 {

    @OriginalMember(owner = "client!hu", name = "q", descriptor = "Ljava/awt/Canvas;")
    private Canvas field1256;

    @OriginalMember(owner = "client!hu", name = "r", descriptor = "Ljava/awt/Image;")
    private Image field1257;

    @OriginalMember(owner = "client!hu", name = "s", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field1258;

    @OriginalMember(owner = "client!hu", name = "t", descriptor = "Ljava/awt/Shape;")
    private Shape field1259;

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
    public final void method590(int arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5) {
        this.field1259 = arg4.getClip();
        this.field1258.width = arg3;
        this.field1258.x = arg0;
        this.field1258.y = arg2;
        this.field1258.height = arg1;
        arg4.setClip(this.field1258);
        arg4.drawImage(this.field1257, 0, 0, this.field1256);
        int var7 = 98 / ((60 - arg5) / 48);
        arg4.setClip(this.field1259);
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public final void method591(int arg0, Graphics arg1, int arg2, int arg3) {
        if (arg0 == 2) {
            arg1.drawImage(this.field1257, arg2, arg3, this.field1256);
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
    public final void method592(int arg0, Canvas arg1) {
        if (arg0 != 351943631) {
            this.method590(105, 6, 4, -19, null, 29);
        }
        this.field1256 = arg1;
        this.field1258 = new Rectangle();
        this.field3711 = this.field1256.getSize().width;
        this.field3715 = this.field1256.getSize().height;
        this.field3717 = new int[this.field3715 * this.field3711];
        DataBufferInt var3 = new DataBufferInt(this.field3717, this.field3717.length);
        DirectColorModel var4 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var5 = Raster.createWritableRaster(var4.createCompatibleSampleModel(this.field3711, this.field3715), var3, null);
        this.field1257 = new BufferedImage(var4, var5, false, new Hashtable());
    }
}
