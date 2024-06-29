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

@OriginalClass("client!dc")
public class class33 extends class188 {

    @OriginalMember(owner = "client!dc", name = "u", descriptor = "Ljava/awt/Component;")
    private Component field532;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ljava/awt/Component;IIB)V")
    public final void method88(Component arg0, int arg1, int arg2, byte arg3) {
        this.field3681 = arg2;
        this.field3694 = new int[arg1 * arg2 + 1];
        this.field3689 = arg1;
        DataBufferInt var5 = new DataBufferInt(this.field3694, this.field3694.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field3689, this.field3681), var5, null);
        this.field3691 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field532 = arg0;
        if (arg3 < 27) {
            this.field532 = null;
        }
        this.method1222(-27445);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILjava/awt/Graphics;IZII)V")
    public final void method86(int arg0, Graphics arg1, int arg2, boolean arg3, int arg4, int arg5) {
        Shape var7 = arg1.getClip();
        if (!arg3) {
            arg1.clipRect(arg2, arg5, arg0, arg4);
            arg1.drawImage(this.field3691, 0, 0, this.field532);
            arg1.setClip(var7);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IBLjava/awt/Graphics;I)V")
    public final void method89(int arg0, byte arg1, Graphics arg2, int arg3) {
        if (arg1 != -16) {
            this.field532 = null;
        }
        arg2.drawImage(this.field3691, arg3, arg0, this.field532);
    }
}
