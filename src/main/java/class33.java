import java.awt.Component;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class33 extends class294 {

    @OriginalMember(owner = "client!hj", name = "m", descriptor = "Ljava/awt/Component;")
    private Component field445;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(BLjava/awt/Component;II)V", line = 9)
    public final void method220(byte arg0, Component arg1, int arg2, int arg3) {
        this.field4617 = new int[arg2 * arg3 + 1];
        this.field4621 = arg2;
        this.field4618 = arg3;
        if (arg0 >= -15) {
            return;
        }
        DataBufferInt var5 = new DataBufferInt(this.field4617, this.field4617.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field4621, this.field4618), var5, (Point) null);
        this.field4627 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field445 = arg1;
        this.method2054(-25);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIILjava/awt/Graphics;IB)V", line = 31)
    public final void method221(int arg0, int arg1, int arg2, Graphics arg3, int arg4, byte arg5) {
        Shape var7 = arg3.getClip();
        arg3.clipRect(arg4, arg0, arg2, arg1);
        arg3.drawImage(this.field4627, 0, 0, this.field445);
        arg3.setClip(var7);
        if (arg5 != 99) {
            this.field445 = (Component) null;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Ljava/awt/Graphics;III)V", line = 47)
    public final void method222(Graphics arg0, int arg1, int arg2, int arg3) {
        if (arg3 <= 15) {
            this.method220((byte) -59, (Component) null, -58, -48);
        }
        arg0.drawImage(this.field4627, arg1, arg2, this.field445);
    }
}
