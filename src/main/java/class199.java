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

@OriginalClass("client!vb")
public class class199 extends class84 {

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "Ljava/awt/Component;")
    private Component field3881;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public final void method566(int arg0, Graphics arg1, int arg2, int arg3) {
        arg1.drawImage(this.field1682, arg3, arg2, this.field3881);
        int var5 = -41 % ((arg0 - 5) / 37);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IILjava/awt/Graphics;IBI)V")
    public final void method569(int arg0, int arg1, Graphics arg2, int arg3, byte arg4, int arg5) {
        if (arg4 <= -42) {
            Shape var7 = arg2.getClip();
            arg2.clipRect(arg0, arg5, arg1, arg3);
            arg2.drawImage(this.field1682, 0, 0, this.field3881);
            arg2.setClip(var7);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIILjava/awt/Component;)V")
    public final void method565(int arg0, int arg1, int arg2, Component arg3) {
        this.field1687 = arg2;
        this.field1681 = new int[arg1 * arg2 + 1];
        this.field1689 = arg1;
        DataBufferInt var5 = new DataBufferInt(this.field1681, this.field1681.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field1687, this.field1689), var5, null);
        if (arg0 >= -87) {
            this.method566(-78, null, -35, 70);
        }
        this.field1682 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field3881 = arg3;
        this.method563(2);
    }
}
