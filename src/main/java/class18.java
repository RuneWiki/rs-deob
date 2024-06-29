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

@OriginalClass("client!dg")
public class class18 extends class711 {

    @OriginalMember(owner = "client!dg", name = "l", descriptor = "Ljava/awt/Canvas;")
    private Canvas field175;

    @OriginalMember(owner = "client!dg", name = "m", descriptor = "Ljava/awt/Image;")
    private Image field176;

    @OriginalMember(owner = "client!dg", name = "n", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field177;

    @OriginalMember(owner = "client!dg", name = "o", descriptor = "Ljava/awt/Shape;")
    private Shape field178;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Ljava/awt/Graphics;IIIIIII)V", line = 12)
    public final void method86(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field178 = arg0.getClip();
        this.field177.y = arg2;
        this.field177.x = arg4;
        if (arg6 != 3) {
            this.method86(null, 97, 73, -66, -64, -111, -20, -3);
        }
        this.field177.height = arg5;
        this.field177.width = arg1;
        arg0.setClip(this.field177);
        arg0.drawImage(this.field176, arg4 - arg3, -arg7 + arg2, this.field175);
        arg0.setClip(this.field178);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ILjava/awt/Canvas;II)V", line = 30)
    public final void method87(int arg0, Canvas arg1, int arg2, int arg3) {
        this.field175 = arg1;
        this.field177 = new Rectangle();
        if (arg3 != -23847) {
            this.field177 = null;
        }
        this.field10017 = arg2;
        this.field10016 = arg0;
        this.field10015 = new int[this.field10017 * this.field10016];
        DataBufferInt var5 = new DataBufferInt(this.field10015, this.field10015.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field10016, this.field10017), var5, null);
        this.field176 = new BufferedImage(var6, var7, false, new Hashtable());
    }
}
