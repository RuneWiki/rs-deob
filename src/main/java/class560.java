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

@OriginalClass("client!ou")
public class class560 extends class649 {

    @OriginalMember(owner = "client!ou", name = "r", descriptor = "Ljava/awt/Canvas;")
    private Canvas field8097;

    @OriginalMember(owner = "client!ou", name = "p", descriptor = "Ljava/awt/Image;")
    private Image field8095;

    @OriginalMember(owner = "client!ou", name = "s", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field8098;

    @OriginalMember(owner = "client!ou", name = "q", descriptor = "Ljava/awt/Shape;")
    private Shape field8096;

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V", line = 12)
    public final void method950(int arg0, int arg1, int arg2, Graphics arg3, int arg4, int arg5) {
        this.field8096 = arg3.getClip();
        this.field8098.y = arg1;
        this.field8098.width = arg4;
        if (arg5 <= 8) {
            return;
        }
        this.field8098.height = arg0;
        this.field8098.x = arg2;
        arg3.setClip(this.field8098);
        arg3.drawImage(this.field8095, 0, 0, this.field8097);
        arg3.setClip(this.field8096);
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(ILjava/awt/Canvas;)V", line = 30)
    public final void method954(int arg0, Canvas arg1) {
        this.field8097 = arg1;
        this.field8098 = new Rectangle();
        this.field9206 = this.field8097.getSize().width;
        this.field9209 = this.field8097.getSize().height;
        this.field9210 = new int[this.field9209 * this.field9206];
        int var3 = 32 / ((arg0 + 3) / 62);
        DataBufferInt var4 = new DataBufferInt(this.field9210, this.field9210.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field9206, this.field9209), var4, null);
        this.field8095 = new BufferedImage(var5, var6, false, new Hashtable());
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(Ljava/awt/Graphics;IIB)V", line = 52)
    public final void method952(Graphics arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != -31) {
            this.field8096 = null;
        }
        arg0.drawImage(this.field8095, arg2, arg1, this.field8097);
    }
}
