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

@OriginalClass("client!cf")
public class class82 extends class336 {

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "Ljava/awt/Component;")
    private Component field1152;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIZILjava/awt/Graphics;I)V", line = 10)
    public final void method556(int arg0, int arg1, boolean arg2, int arg3, Graphics arg4, int arg5) {
        Shape var7 = arg4.getClip();
        arg4.clipRect(arg0, arg3, arg1, arg5);
        arg4.drawImage(this.field5251, 0, 0, this.field1152);
        if (!arg2) {
            arg4.setClip(var7);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IILjava/awt/Graphics;I)V", line = 23)
    public final void method557(int arg0, int arg1, Graphics arg2, int arg3) {
        arg2.drawImage(this.field5251, arg0, arg1, this.field1152);
        if (arg3 != -27039) {
            this.field1152 = (Component) null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZLjava/awt/Component;II)V", line = 33)
    public final void method558(boolean arg0, Component arg1, int arg2, int arg3) {
        if (!arg0) {
            return;
        }
        this.field5250 = arg3;
        this.field5253 = new int[arg2 * arg3 + 1];
        this.field5252 = arg2;
        DataBufferInt var5 = new DataBufferInt(this.field5253, this.field5253.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field5250, this.field5252), var5, (Point) null);
        this.field5251 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field1152 = arg1;
        this.method2345((byte) -123);
    }
}
