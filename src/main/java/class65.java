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

@OriginalClass("client!ge")
public class class65 extends class84 {

    @OriginalMember(owner = "client!ge", name = "q", descriptor = "Ljava/awt/Component;")
    private Component field1271;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIILjava/awt/Component;)V")
    public final void method409(int arg0, int arg1, int arg2, Component arg3) {
        this.field1664 = arg1;
        if (arg2 != -13717) {
            this.method409(-93, -69, -114, null);
        }
        this.field1673 = arg0;
        this.field1675 = new int[arg0 * arg1 + 1];
        DataBufferInt var5 = new DataBufferInt(this.field1675, this.field1675.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field1664, this.field1673), var5, null);
        this.field1670 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field1271 = arg3;
        this.method552(arg2 ^ 0x3244);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljava/awt/Graphics;BIIII)V")
    public final void method410(Graphics arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        Shape var7 = arg0.getClip();
        arg0.clipRect(arg5, arg3, arg4, arg2);
        if (arg1 < 120) {
            this.method410(null, (byte) 2, -64, 121, -2, 30);
        }
        arg0.drawImage(this.field1670, 0, 0, this.field1271);
        arg0.setClip(var7);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public final void method411(int arg0, int arg1, Graphics arg2, int arg3) {
        int var5 = -78 % ((arg3 - 27) / 33);
        arg2.drawImage(this.field1670, arg1, arg0, this.field1271);
    }
}
