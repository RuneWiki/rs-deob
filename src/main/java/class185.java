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

@OriginalClass("client!ue")
public class class185 extends class18 {

    @OriginalMember(owner = "client!ue", name = "n", descriptor = "Ljava/awt/Component;")
    private Component field3748;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
    public final void method189(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5) {
        Shape var7 = arg5.getClip();
        arg5.clipRect(arg0, arg1, arg2, arg4);
        arg5.drawImage(this.field429, 0, 0, this.field3748);
        arg5.setClip(var7);
        if (arg3 != 1530) {
            this.method188(90, 49, null, (byte) -107);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IILjava/awt/Component;I)V")
    public final void method193(int arg0, int arg1, Component arg2, int arg3) {
        this.field434 = arg0;
        this.field428 = new int[arg0 * arg1 + 1];
        this.field431 = arg1;
        DataBufferInt var5 = new DataBufferInt(this.field428, this.field428.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        if (arg3 > 103) {
            WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field434, this.field431), var5, null);
            this.field429 = new BufferedImage(var6, var7, false, new Hashtable());
            this.field3748 = arg2;
            this.method191((byte) -67);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IILjava/awt/Graphics;B)V")
    public final void method188(int arg0, int arg1, Graphics arg2, byte arg3) {
        if (arg3 != -121) {
            this.field3748 = null;
        }
        arg2.drawImage(this.field429, arg0, arg1, this.field3748);
    }
}
