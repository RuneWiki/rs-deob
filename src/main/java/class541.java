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

@OriginalClass("client!jd")
public class class541 extends class589 {

    @OriginalMember(owner = "client!jd", name = "r", descriptor = "Ljava/awt/Canvas;")
    private Canvas field7235;

    @OriginalMember(owner = "client!jd", name = "t", descriptor = "Ljava/awt/Image;")
    private Image field7237;

    @OriginalMember(owner = "client!jd", name = "s", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field7236;

    @OriginalMember(owner = "client!jd", name = "u", descriptor = "Ljava/awt/Shape;")
    private Shape field7238;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
    public final void method857(int arg0, Canvas arg1) {
        this.field7235 = arg1;
        this.field7236 = new Rectangle();
        this.field8279 = this.field7235.getSize().width;
        this.field8280 = this.field7235.getSize().height;
        this.field8274 = new int[this.field8280 * this.field8279];
        DataBufferInt var3 = new DataBufferInt(this.field8274, this.field8274.length);
        if (arg0 != -244) {
            this.method856(39, -106, null, (byte) -104);
        }
        DirectColorModel var4 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var5 = Raster.createWritableRaster(var4.createCompatibleSampleModel(this.field8279, this.field8280), var3, null);
        this.field7237 = new BufferedImage(var4, var5, false, new Hashtable());
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIILjava/awt/Graphics;BI)V")
    public final void method855(int arg0, int arg1, int arg2, Graphics arg3, byte arg4, int arg5) {
        this.field7238 = arg3.getClip();
        this.field7236.x = arg1;
        this.field7236.width = arg2;
        this.field7236.height = arg5;
        this.field7236.y = arg0;
        arg3.setClip(this.field7236);
        arg3.drawImage(this.field7237, 0, 0, this.field7235);
        arg3.setClip(this.field7238);
        int var7 = 21 / ((-arg4 - 12) / 40);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IILjava/awt/Graphics;B)V")
    public final void method856(int arg0, int arg1, Graphics arg2, byte arg3) {
        if (arg3 != -20) {
            this.method856(105, 126, null, (byte) -33);
        }
        arg2.drawImage(this.field7237, arg0, arg1, this.field7235);
    }
}
