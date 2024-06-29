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

@OriginalClass("client!hi")
public class class111 extends class58 {

    @OriginalMember(owner = "client!hi", name = "k", descriptor = "Ljava/awt/Component;")
    private Component field1977;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Ljava/awt/Component;IBI)V")
    public final void method458(Component arg0, int arg1, byte arg2, int arg3) {
        if (arg2 != 46) {
            return;
        }
        this.field1047 = new int[arg1 * arg3 + 1];
        this.field1042 = arg3;
        this.field1040 = arg1;
        DataBufferInt var5 = new DataBufferInt(this.field1047, this.field1047.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field1042, this.field1040), var5, (Point) null);
        this.field1044 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field1977 = arg0;
        this.method454(arg2 + 78);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public final void method455(int arg0, int arg1, Graphics arg2, int arg3) {
        int var5 = 40 % ((-arg1 - 40) / 32);
        arg2.drawImage(this.field1044, arg0, arg3, this.field1977);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIBLjava/awt/Graphics;I)V")
    public final void method453(int arg0, int arg1, int arg2, byte arg3, Graphics arg4, int arg5) {
        if (arg3 != 7) {
            this.method458((Component) null, 103, (byte) -111, 69);
        }
        Shape var7 = arg4.getClip();
        arg4.clipRect(arg0, arg1, arg2, arg5);
        arg4.drawImage(this.field1044, 0, 0, this.field1977);
        arg4.setClip(var7);
    }
}
