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

@OriginalClass("client!sl")
public class class111 extends class175 {

    @OriginalMember(owner = "client!sl", name = "l", descriptor = "Ljava/awt/Component;")
    private Component field1869;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(ILjava/awt/Graphics;IZII)V", line = 10)
    public final void method957(int arg0, Graphics arg1, int arg2, boolean arg3, int arg4, int arg5) {
        Shape var7 = arg1.getClip();
        arg1.clipRect(arg5, arg2, arg4, arg0);
        if (arg3) {
            arg1.drawImage(this.field2986, 0, 0, this.field1869);
            arg1.setClip(var7);
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(BIILjava/awt/Component;)V", line = 24)
    public final void method958(byte arg0, int arg1, int arg2, Component arg3) {
        this.field2992 = arg2;
        this.field2994 = arg1;
        this.field2990 = new int[arg1 * arg2 + 1];
        DataBufferInt var5 = new DataBufferInt(this.field2990, this.field2990.length);
        if (arg0 >= -112) {
            this.field1869 = (Component) null;
        }
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field2994, this.field2992), var5, (Point) null);
        this.field2986 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field1869 = arg3;
        this.method1358(2);
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Ljava/awt/Graphics;IIB)V", line = 44)
    public final void method959(Graphics arg0, int arg1, int arg2, byte arg3) {
        if (arg3 >= 56) {
            arg0.drawImage(this.field2986, arg2, arg1, this.field1869);
        }
    }
}
