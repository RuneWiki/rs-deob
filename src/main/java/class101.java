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

@OriginalClass("client!pe")
public class class101 extends class19 {

    @OriginalMember(owner = "client!pe", name = "o", descriptor = "Ljava/awt/Component;")
    private Component field1767;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIBLjava/awt/Graphics;)V", line = 10)
    public final void method187(int arg0, int arg1, int arg2, int arg3, byte arg4, Graphics arg5) {
        Shape var7 = arg5.getClip();
        arg5.clipRect(arg1, arg3, arg0, arg2);
        arg5.drawImage(this.field298, 0, 0, this.field1767);
        if (arg4 == -39) {
            arg5.setClip(var7);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IBILjava/awt/Graphics;)V", line = 26)
    public final void method188(int arg0, byte arg1, int arg2, Graphics arg3) {
        arg3.drawImage(this.field298, arg0, arg2, this.field1767);
        if (arg1 != 42) {
            this.field1767 = (Component) null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(BLjava/awt/Component;II)V", line = 36)
    public final void method185(byte arg0, Component arg1, int arg2, int arg3) {
        this.field303 = arg2;
        this.field297 = new int[arg2 * arg3 + 1];
        this.field295 = arg3;
        DataBufferInt var5 = new DataBufferInt(this.field297, this.field297.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field295, this.field303), var5, (Point) null);
        this.field298 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field1767 = arg1;
        this.method184(-11271);
        int var8 = 61 % ((arg0 - 38) / 59);
    }
}
