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

@OriginalClass("client!f")
public class class287 extends class460 {

    @OriginalMember(owner = "client!f", name = "A", descriptor = "Ljava/awt/Canvas;")
    private Canvas field4211;

    @OriginalMember(owner = "client!f", name = "B", descriptor = "Ljava/awt/Image;")
    private Image field4212;

    @OriginalMember(owner = "client!f", name = "D", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field4214;

    @OriginalMember(owner = "client!f", name = "C", descriptor = "Ljava/awt/Shape;")
    private Shape field4213;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IILjava/awt/Canvas;B)V")
    public final void method636(int arg0, int arg1, Canvas arg2, byte arg3) {
        this.field4211 = arg2;
        this.field4214 = new Rectangle();
        this.field6277 = arg0;
        this.field6278 = arg1;
        int var5 = -97 % ((-arg3 - 58) / 51);
        this.field6283 = new int[this.field6278 * this.field6277];
        DataBufferInt var6 = new DataBufferInt(this.field6283, this.field6283.length);
        DirectColorModel var7 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var8 = Raster.createWritableRaster(var7.createCompatibleSampleModel(this.field6278, this.field6277), var6, null);
        this.field4212 = new BufferedImage(var7, var8, false, new Hashtable());
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIIIIILjava/awt/Graphics;)V")
    public final void method635(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, Graphics arg7) {
        this.field4213 = arg7.getClip();
        this.field4214.x = arg3;
        this.field4214.width = arg5;
        this.field4214.height = arg0;
        this.field4214.y = arg6;
        arg7.setClip(this.field4214);
        if (arg2 != 0) {
            this.method635(124, 44, -71, 126, 50, 74, -9, null);
        }
        arg7.drawImage(this.field4212, arg3 - arg4, -arg1 + arg6, this.field4211);
        arg7.setClip(this.field4213);
    }
}
