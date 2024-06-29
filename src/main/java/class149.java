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

@OriginalClass("client!qf")
public class class149 extends class80 {

    @OriginalMember(owner = "client!qf", name = "r", descriptor = "Ljava/awt/Component;")
    private Component field3003;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IILjava/awt/Component;B)V")
    public final void method546(int arg0, int arg1, Component arg2, byte arg3) {
        this.field1741 = new int[arg0 * arg1 + 1];
        this.field1740 = arg1;
        this.field1735 = arg0;
        DataBufferInt var5 = new DataBufferInt(this.field1741, this.field1741.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field1735, this.field1740), var5, null);
        this.field1743 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field3003 = arg2;
        if (arg3 > -68) {
            this.method545(null, (byte) 71, -71, 67);
        }
        this.method542(7350);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ljava/awt/Graphics;IIBII)V")
    public final void method544(Graphics arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        if (arg3 == 116) {
            Shape var7 = arg0.getClip();
            arg0.clipRect(arg4, arg5, arg1, arg2);
            arg0.drawImage(this.field1743, 0, 0, this.field3003);
            arg0.setClip(var7);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ljava/awt/Graphics;BII)V")
    public final void method545(Graphics arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != 96) {
            this.method546(-121, 60, null, (byte) 24);
        }
        arg0.drawImage(this.field1743, arg2, arg3, this.field3003);
    }
}
