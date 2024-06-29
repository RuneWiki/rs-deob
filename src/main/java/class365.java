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

@OriginalClass("client!gn")
public class class365 extends class434 {

    @OriginalMember(owner = "client!gn", name = "t", descriptor = "Ljava/awt/Canvas;")
    private Canvas field5578;

    @OriginalMember(owner = "client!gn", name = "r", descriptor = "Ljava/awt/Image;")
    private Image field5576;

    @OriginalMember(owner = "client!gn", name = "s", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field5577;

    @OriginalMember(owner = "client!gn", name = "q", descriptor = "Ljava/awt/Shape;")
    private Shape field5575;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IILjava/awt/Canvas;I)V", line = 13)
    public final void method517(int arg0, int arg1, Canvas arg2, int arg3) {
        this.field5578 = arg2;
        this.field5577 = new Rectangle();
        this.field6343 = arg3;
        this.field6340 = arg0;
        this.field6344 = new int[this.field6343 * this.field6340];
        int var5 = 23 / ((arg1 - 47) / 51);
        DataBufferInt var6 = new DataBufferInt(this.field6344, this.field6344.length);
        DirectColorModel var7 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var8 = Raster.createWritableRaster(var7.createCompatibleSampleModel(this.field6343, this.field6340), var6, null);
        this.field5576 = new BufferedImage(var7, var8, false, new Hashtable());
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(ILjava/awt/Graphics;IIIIII)V", line = 34)
    public final void method520(int arg0, Graphics arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field5575 = arg1.getClip();
        this.field5577.x = arg7;
        this.field5577.width = arg5;
        this.field5577.height = arg4;
        this.field5577.y = arg6;
        arg1.setClip(this.field5577);
        arg1.drawImage(this.field5576, arg7 - arg2, -arg0 + arg6, this.field5578);
        if (arg3 != 30075) {
            this.method520(-38, null, 36, 124, 120, -82, -104, 77);
        }
        arg1.setClip(this.field5575);
    }
}
