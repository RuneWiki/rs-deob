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

@OriginalClass("client!kf")
public class class114 extends class94 {

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "Ljava/awt/Component;")
    private Component field2193;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIBLjava/awt/Graphics;II)V")
    public final void method582(int arg0, int arg1, byte arg2, Graphics arg3, int arg4, int arg5) {
        if (arg2 < -10) {
            Shape var7 = arg3.getClip();
            arg3.clipRect(arg5, arg0, arg4, arg1);
            arg3.drawImage(this.field1655, 0, 0, this.field2193);
            arg3.setClip(var7);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public final void method581(int arg0, int arg1, int arg2, Graphics arg3) {
        arg3.drawImage(this.field1655, arg0, arg2, this.field2193);
        int var5 = -110 / ((-arg1 - 21) / 53);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IILjava/awt/Component;B)V")
    public final void method583(int arg0, int arg1, Component arg2, byte arg3) {
        this.field1658 = arg1;
        this.field1649 = new int[arg0 * arg1 + 1];
        this.field1652 = arg0;
        if (arg3 != -104) {
            this.method582(-100, 44, (byte) -71, null, 89, -114);
        }
        DataBufferInt var5 = new DataBufferInt(this.field1649, this.field1649.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field1658, this.field1652), var5, null);
        this.field1655 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field2193 = arg2;
        this.method578(0);
    }
}
