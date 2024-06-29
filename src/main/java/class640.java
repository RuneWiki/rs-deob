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

@OriginalClass("client!cia")
public class class640 extends class584 {

    @OriginalMember(owner = "client!cia", name = "m", descriptor = "Ljava/awt/Canvas;")
    private Canvas field8751;

    @OriginalMember(owner = "client!cia", name = "n", descriptor = "Ljava/awt/Image;")
    private Image field8752;

    @OriginalMember(owner = "client!cia", name = "o", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field8753;

    @OriginalMember(owner = "client!cia", name = "l", descriptor = "Ljava/awt/Shape;")
    private Shape field8750;

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(IIIBLjava/awt/Graphics;III)V")
    public final void method1867(int arg0, int arg1, int arg2, byte arg3, Graphics arg4, int arg5, int arg6, int arg7) {
        if (arg3 != 19) {
            return;
        }
        this.field8750 = arg4.getClip();
        this.field8753.height = arg2;
        this.field8753.x = arg5;
        this.field8753.y = arg7;
        this.field8753.width = arg1;
        arg4.setClip(this.field8753);
        arg4.drawImage(this.field8752, arg5 - arg0, arg7 - arg6, this.field8751);
        arg4.setClip(this.field8750);
    }

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(Ljava/awt/Canvas;BII)V")
    public final void method1869(Canvas arg0, byte arg1, int arg2, int arg3) {
        this.field8751 = arg0;
        this.field8753 = new Rectangle();
        this.field7974 = arg3;
        if (arg1 <= 92) {
            return;
        }
        this.field7972 = arg2;
        this.field7973 = new int[this.field7974 * this.field7972];
        DataBufferInt var5 = new DataBufferInt(this.field7973, this.field7973.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field7972, this.field7974), var5, null);
        this.field8752 = new BufferedImage(var6, var7, false, new Hashtable());
    }
}
