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

@OriginalClass("client!ck")
public class class436 extends class157 {

    @OriginalMember(owner = "client!ck", name = "B", descriptor = "Ljava/awt/Canvas;")
    private Canvas field6380;

    @OriginalMember(owner = "client!ck", name = "z", descriptor = "Ljava/awt/Image;")
    private Image field6379;

    @OriginalMember(owner = "client!ck", name = "C", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field6381;

    @OriginalMember(owner = "client!ck", name = "D", descriptor = "Ljava/awt/Shape;")
    private Shape field6382;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Ljava/awt/Graphics;BII)V", line = 9)
    public final void method1004(Graphics arg0, byte arg1, int arg2, int arg3) {
        arg0.drawImage(this.field6379, arg2, arg3, this.field6380);
        int var5 = -51 % ((74 - arg1) / 44);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Ljava/awt/Canvas;B)V", line = 18)
    public final void method1007(Canvas arg0, byte arg1) {
        this.field6380 = arg0;
        this.field6381 = new Rectangle();
        this.field2049 = this.field6380.getSize().width;
        this.field2054 = this.field6380.getSize().height;
        this.field2052 = new int[this.field2054 * this.field2049];
        DataBufferInt var3 = new DataBufferInt(this.field2052, this.field2052.length);
        DirectColorModel var4 = new DirectColorModel(32, 16711680, 65280, 255);
        if (arg1 <= 55) {
            this.method1007(null, (byte) 88);
        }
        WritableRaster var5 = Raster.createWritableRaster(var4.createCompatibleSampleModel(this.field2049, this.field2054), var3, null);
        this.field6379 = new BufferedImage(var4, var5, false, new Hashtable());
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Ljava/awt/Graphics;IBIII)V", line = 42)
    public final void method1001(Graphics arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        this.field6382 = arg0.getClip();
        this.field6381.x = arg1;
        this.field6381.height = arg5;
        this.field6381.y = arg3;
        this.field6381.width = arg4;
        arg0.setClip(this.field6381);
        arg0.drawImage(this.field6379, 0, 0, this.field6380);
        if (arg2 != -6) {
            this.method1001(null, -37, (byte) -11, -94, -24, -58);
        }
        arg0.setClip(this.field6382);
    }
}
