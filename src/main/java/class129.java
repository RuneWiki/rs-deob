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

@OriginalClass("client!sd")
public class class129 extends class75 {

    @OriginalMember(owner = "client!sd", name = "A", descriptor = "Ljava/awt/Component;")
    private Component field3064;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Ljava/awt/Graphics;IIB)V")
    public final void method647(Graphics arg0, int arg1, int arg2, byte arg3) {
        if (arg3 == 46) {
            arg0.drawImage(this.field1746, arg1, arg2, this.field3064);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IILjava/awt/Graphics;III)V")
    public final void method646(int arg0, int arg1, Graphics arg2, int arg3, int arg4, int arg5) {
        int var7 = -97 % ((arg1 - 10) / 54);
        Shape var8 = arg2.getClip();
        arg2.clipRect(arg0, arg4, arg5, arg3);
        arg2.drawImage(this.field1746, 0, 0, this.field3064);
        arg2.setClip(var8);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Ljava/awt/Component;IZI)V")
    public final void method640(Component arg0, int arg1, boolean arg2, int arg3) {
        this.field1737 = arg3;
        this.field1735 = new int[arg1 * arg3 + 1];
        this.field1731 = arg1;
        DataBufferInt var5 = new DataBufferInt(this.field1735, this.field1735.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field1731, this.field1737), var5, null);
        this.field1746 = new BufferedImage(var6, var7, arg2, new Hashtable());
        this.field3064 = arg0;
        this.method642(8430);
    }
}
