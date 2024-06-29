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
public class class7 extends class73 {

    @OriginalMember(owner = "client!dc", name = "p", descriptor = "Ljava/awt/Component;")
    private Component field69;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public final void method38(int arg0, int arg1, int arg2, Graphics arg3) {
        if (arg2 != 0) {
            this.field69 = (Component) null;
        }
        arg3.drawImage(this.field1223, arg1, arg0, this.field69);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIILjava/awt/Component;)V")
    public final void method39(int arg0, int arg1, int arg2, Component arg3) {
        this.field1235 = arg1;
        this.field1225 = arg2;
        this.field1236 = new int[arg1 * arg2 + 1];
        if (arg0 != -7) {
            this.method38(-42, -25, -81, (Graphics) null);
        }
        DataBufferInt var5 = new DataBufferInt(this.field1236, this.field1236.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field1235, this.field1225), var5, (Point) null);
        this.field1223 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field69 = arg3;
        this.method497((byte) 102);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
    public final void method40(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 > -105) {
            this.method38(106, 93, -103, (Graphics) null);
        }
        Shape var7 = arg0.getClip();
        arg0.clipRect(arg1, arg3, arg2, arg4);
        arg0.drawImage(this.field1223, 0, 0, this.field69);
        arg0.setClip(var7);
    }
}
