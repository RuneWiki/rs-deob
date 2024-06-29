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

@OriginalClass("client!pa")
public class class397 extends class125 {

    @OriginalMember(owner = "client!pa", name = "t", descriptor = "Ljava/awt/Canvas;")
    private Canvas field5517;

    @OriginalMember(owner = "client!pa", name = "s", descriptor = "Ljava/awt/Image;")
    private Image field5516;

    @OriginalMember(owner = "client!pa", name = "u", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field5518;

    @OriginalMember(owner = "client!pa", name = "r", descriptor = "Ljava/awt/Shape;")
    private Shape field5515;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIBLjava/awt/Graphics;IIII)V", line = 9)
    public final void method798(int arg0, int arg1, byte arg2, Graphics arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field5515 = arg3.getClip();
        this.field5518.height = arg5;
        this.field5518.width = arg1;
        this.field5518.y = arg6;
        this.field5518.x = arg4;
        arg3.setClip(this.field5518);
        arg3.drawImage(this.field5516, arg4 - arg0, -arg7 + arg6, this.field5517);
        arg3.setClip(this.field5515);
        if (arg2 != -63) {
            this.method800(-27, null, 79, (byte) -78);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILjava/awt/Canvas;IB)V", line = 29)
    public final void method800(int arg0, Canvas arg1, int arg2, byte arg3) {
        this.field5517 = arg1;
        this.field5518 = new Rectangle();
        this.field1701 = arg2;
        if (arg3 != 113) {
            this.field5518 = null;
        }
        this.field1700 = arg0;
        this.field1703 = new int[this.field1701 * this.field1700];
        DataBufferInt var5 = new DataBufferInt(this.field1703, this.field1703.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field1701, this.field1700), var5, null);
        this.field5516 = new BufferedImage(var6, var7, false, new Hashtable());
    }
}
