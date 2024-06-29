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

@OriginalClass("client!wa")
public class class496 extends class78 {

    @OriginalMember(owner = "client!wa", name = "F", descriptor = "Ljava/awt/Canvas;")
    private Canvas field7244;

    @OriginalMember(owner = "client!wa", name = "I", descriptor = "Ljava/awt/Image;")
    private Image field7247;

    @OriginalMember(owner = "client!wa", name = "G", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field7245;

    @OriginalMember(owner = "client!wa", name = "H", descriptor = "Ljava/awt/Shape;")
    private Shape field7246;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
    public final void method453(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field7246 = arg0.getClip();
        int var7 = -26 / ((arg5 - 47) / 52);
        this.field7245.height = arg2;
        this.field7245.x = arg1;
        this.field7245.width = arg4;
        this.field7245.y = arg3;
        arg0.setClip(this.field7245);
        arg0.drawImage(this.field7247, 0, 0, this.field7244);
        arg0.setClip(this.field7246);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IBLjava/awt/Graphics;I)V")
    public final void method448(int arg0, byte arg1, Graphics arg2, int arg3) {
        if (arg1 == 39) {
            arg2.drawImage(this.field7247, arg0, arg3, this.field7244);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
    public final void method454(int arg0, Canvas arg1) {
        this.field7244 = arg1;
        this.field7245 = new Rectangle();
        this.field992 = this.field7244.getSize().width;
        this.field991 = this.field7244.getSize().height;
        if (arg0 != 2) {
            this.method453(null, 6, 36, -41, -63, -74);
        }
        this.field996 = new int[this.field992 * this.field991];
        DataBufferInt var3 = new DataBufferInt(this.field996, this.field996.length);
        DirectColorModel var4 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var5 = Raster.createWritableRaster(var4.createCompatibleSampleModel(this.field992, this.field991), var3, null);
        this.field7247 = new BufferedImage(var4, var5, false, new Hashtable());
    }
}
