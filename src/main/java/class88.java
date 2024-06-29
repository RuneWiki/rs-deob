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

@OriginalClass("client!me")
public class class88 extends class152 {

    @OriginalMember(owner = "client!me", name = "x", descriptor = "Ljava/awt/Component;")
    private Component field2198;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public final void method63(int arg0, int arg1, int arg2, Graphics arg3) {
        if (arg1 != 103) {
            this.field2198 = null;
        }
        arg3.drawImage(this.field3399, arg0, arg2, this.field2198);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ILjava/awt/Graphics;IIII)V")
    public final void method59(int arg0, Graphics arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 > -8) {
            this.method63(-126, -61, 117, null);
        }
        Shape var7 = arg1.getClip();
        arg1.clipRect(arg3, arg4, arg0, arg2);
        arg1.drawImage(this.field3399, 0, 0, this.field2198);
        arg1.setClip(var7);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ILjava/awt/Component;IB)V")
    public final void method60(int arg0, Component arg1, int arg2, byte arg3) {
        this.field3411 = arg2;
        this.field3408 = arg0;
        this.field3407 = new int[arg0 * arg2 + 1];
        DataBufferInt var5 = new DataBufferInt(this.field3407, this.field3407.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field3411, this.field3408), var5, null);
        this.field3399 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field2198 = arg1;
        this.method1156(85);
        if (arg3 >= -96) {
            this.field2198 = null;
        }
    }
}
