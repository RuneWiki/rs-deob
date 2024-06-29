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

@OriginalClass("client!ho")
public class class212 extends class349 {

    @OriginalMember(owner = "client!ho", name = "s", descriptor = "Ljava/awt/Canvas;")
    private Canvas field2793;

    @OriginalMember(owner = "client!ho", name = "r", descriptor = "Ljava/awt/Image;")
    private Image field2792;

    @OriginalMember(owner = "client!ho", name = "u", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field2795;

    @OriginalMember(owner = "client!ho", name = "t", descriptor = "Ljava/awt/Shape;")
    private Shape field2794;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIIIIILjava/awt/Graphics;I)V", line = 13)
    public final void method583(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, Graphics arg6, int arg7) {
        this.field2794 = arg6.getClip();
        this.field2795.y = arg4;
        this.field2795.width = arg0;
        this.field2795.x = arg5;
        this.field2795.height = arg1;
        int var9 = -87 % ((15 - arg3) / 44);
        arg6.setClip(this.field2795);
        arg6.drawImage(this.field2792, arg5 - arg2, -arg7 + arg4, this.field2793);
        arg6.setClip(this.field2794);
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIBLjava/awt/Canvas;)V", line = 30)
    public final void method585(int arg0, int arg1, byte arg2, Canvas arg3) {
        this.field2793 = arg3;
        this.field2795 = new Rectangle();
        this.field4958 = arg1;
        this.field4954 = arg0;
        this.field4956 = new int[this.field4958 * this.field4954];
        DataBufferInt var5 = new DataBufferInt(this.field4956, this.field4956.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        if (arg2 >= -16) {
            this.method585(56, -50, (byte) -100, null);
        }
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field4958, this.field4954), var5, null);
        this.field2792 = new BufferedImage(var6, var7, false, new Hashtable());
    }
}
