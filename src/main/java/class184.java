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

@OriginalClass("client!ac")
public class class184 extends class83 {

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "Ljava/awt/Component;")
    private Component field3175;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIILjava/awt/Component;)V", line = 11)
    public final void method618(int arg0, int arg1, int arg2, Component arg3) {
        this.field1430 = new int[arg1 * arg2 + 1];
        this.field1431 = arg1;
        this.field1428 = arg2;
        DataBufferInt var5 = new DataBufferInt(this.field1430, this.field1430.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field1428, this.field1431), var5, (Point) null);
        this.field1432 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field3175 = arg3;
        if (arg0 == -732) {
            this.method612(-43);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IILjava/awt/Graphics;III)V", line = 31)
    public final void method615(int arg0, int arg1, Graphics arg2, int arg3, int arg4, int arg5) {
        if (arg5 != 64) {
            this.method611(47, (byte) 121, -61, (Graphics) null);
        }
        Shape var7 = arg2.getClip();
        arg2.clipRect(arg1, arg0, arg3, arg4);
        arg2.drawImage(this.field1432, 0, 0, this.field3175);
        arg2.setClip(var7);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IBILjava/awt/Graphics;)V", line = 45)
    public final void method611(int arg0, byte arg1, int arg2, Graphics arg3) {
        if (arg1 != -47) {
            this.method615(58, -64, (Graphics) null, 65, 0, -83);
        }
        arg3.drawImage(this.field1432, arg2, arg0, this.field3175);
    }
}
