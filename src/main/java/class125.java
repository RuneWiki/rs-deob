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

@OriginalClass("client!q")
public class class125 extends class83 {

    @OriginalMember(owner = "client!q", name = "m", descriptor = "Ljava/awt/Component;")
    private Component field2430;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIBIILjava/awt/Graphics;)V")
    public final void method76(int arg0, int arg1, byte arg2, int arg3, int arg4, Graphics arg5) {
        if (arg2 == -35) {
            Shape var7 = arg5.getClip();
            arg5.clipRect(arg4, arg1, arg0, arg3);
            arg5.drawImage(this.field1662, 0, 0, this.field2430);
            arg5.setClip(var7);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IBLjava/awt/Graphics;I)V")
    public final void method67(int arg0, byte arg1, Graphics arg2, int arg3) {
        arg2.drawImage(this.field1662, arg3, arg0, this.field2430);
        if (arg1 <= 60) {
            this.field2430 = (Component) null;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Ljava/awt/Component;IBI)V")
    public final void method70(Component arg0, int arg1, byte arg2, int arg3) {
        this.field1655 = arg3;
        this.field1659 = new int[arg1 * arg3 + 1];
        int var5 = 62 / ((arg2 + 69) / 49);
        this.field1658 = arg1;
        DataBufferInt var6 = new DataBufferInt(this.field1659, this.field1659.length);
        DirectColorModel var7 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var8 = Raster.createWritableRaster(var7.createCompatibleSampleModel(this.field1658, this.field1655), var6, (Point) null);
        this.field1662 = new BufferedImage(var7, var8, false, new Hashtable());
        this.field2430 = arg0;
        this.method603(false);
    }
}
