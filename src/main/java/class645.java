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

@OriginalClass("client!og")
public class class645 extends class582 {

    @OriginalMember(owner = "client!og", name = "r", descriptor = "Ljava/awt/Canvas;")
    private Canvas field9150;

    @OriginalMember(owner = "client!og", name = "p", descriptor = "Ljava/awt/Image;")
    private Image field9148;

    @OriginalMember(owner = "client!og", name = "o", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field9147;

    @OriginalMember(owner = "client!og", name = "q", descriptor = "Ljava/awt/Shape;")
    private Shape field9149;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ILjava/awt/Canvas;IB)V", line = 10)
    public final void method39(int arg0, Canvas arg1, int arg2, byte arg3) {
        this.field9150 = arg1;
        this.field9147 = new Rectangle();
        this.field8225 = arg2;
        this.field8226 = arg0;
        this.field8228 = new int[this.field8226 * this.field8225];
        if (arg3 < -67) {
            DataBufferInt var5 = new DataBufferInt(this.field8228, this.field8228.length);
            DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
            WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field8225, this.field8226), var5, null);
            this.field9148 = new BufferedImage(var6, var7, false, new Hashtable());
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIIZILjava/awt/Graphics;I)V", line = 31)
    public final void method38(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, Graphics arg6, int arg7) {
        this.field9149 = arg6.getClip();
        if (!arg4) {
            this.method39(-104, null, 67, (byte) 47);
        }
        this.field9147.width = arg2;
        this.field9147.x = arg5;
        this.field9147.y = arg7;
        this.field9147.height = arg1;
        arg6.setClip(this.field9147);
        arg6.drawImage(this.field9148, arg5 - arg3, -arg0 + arg7, this.field9150);
        arg6.setClip(this.field9149);
    }
}
