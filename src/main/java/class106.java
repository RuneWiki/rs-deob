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

@OriginalClass("client!vj")
public class class106 extends class137 {

    @OriginalMember(owner = "client!vj", name = "n", descriptor = "Ljava/awt/Component;")
    private Component field1523;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V", line = 10)
    public final void method222(int arg0, int arg1, int arg2, Graphics arg3, int arg4, int arg5) {
        Shape var7 = arg3.getClip();
        arg3.clipRect(arg0, arg1, arg2, arg5);
        arg3.drawImage(this.field1987, 0, 0, this.field1523);
        arg3.setClip(var7);
        int var8 = -70 % ((-arg4 - 25) / 48);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIILjava/awt/Graphics;)V", line = 22)
    public final void method221(int arg0, int arg1, int arg2, Graphics arg3) {
        if (arg2 > -83) {
            this.method221(-77, -106, -30, (Graphics) null);
        }
        arg3.drawImage(this.field1987, arg1, arg0, this.field1523);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(BILjava/awt/Component;I)V", line = 35)
    public final void method219(byte arg0, int arg1, Component arg2, int arg3) {
        this.field1988 = new int[arg1 * arg3 + 1];
        this.field1984 = arg1;
        this.field1989 = arg3;
        DataBufferInt var5 = new DataBufferInt(this.field1988, this.field1988.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field1984, this.field1989), var5, (Point) null);
        this.field1987 = new BufferedImage(var6, var7, false, new Hashtable());
        if (arg0 < 32) {
            this.field1523 = (Component) null;
        }
        this.field1523 = arg2;
        this.method973(-27272);
    }
}
