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

@OriginalClass("client!ca")
public class class16 extends class48 {

    @OriginalMember(owner = "client!ca", name = "t", descriptor = "Ljava/awt/Component;")
    private Component field332;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
    public final void method122(Graphics arg0, int arg1, int arg2, int arg3) {
        if (arg1 == 29504) {
            arg0.drawImage(this.field1122, arg3, arg2, this.field332);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIILjava/awt/Component;)V")
    public final void method123(int arg0, int arg1, int arg2, Component arg3) {
        this.field1123 = arg1;
        this.field1121 = arg2;
        this.field1125 = new int[arg1 * arg2 + 1];
        DataBufferInt var5 = new DataBufferInt(this.field1125, this.field1125.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        if (arg0 > -24) {
            this.field332 = null;
        }
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field1121, this.field1123), var5, null);
        this.field1122 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field332 = arg3;
        this.method362((byte) 87);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILjava/awt/Graphics;IIII)V")
    public final void method124(int arg0, Graphics arg1, int arg2, int arg3, int arg4, int arg5) {
        Shape var7 = arg1.getClip();
        arg1.clipRect(arg4, arg5, arg2, arg3);
        arg1.drawImage(this.field1122, arg0, 0, this.field332);
        arg1.setClip(var7);
    }
}
