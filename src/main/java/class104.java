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

@OriginalClass("client!tf")
public class class104 extends class261 {

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "Ljava/awt/Component;")
    private Component field1883;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ILjava/awt/Graphics;BIII)V", line = 10)
    public final void method783(int arg0, Graphics arg1, byte arg2, int arg3, int arg4, int arg5) {
        if (arg2 != 13) {
            this.field1883 = (Component) null;
        }
        Shape var7 = arg1.getClip();
        arg1.clipRect(arg0, arg4, arg5, arg3);
        arg1.drawImage(this.field4535, 0, 0, this.field1883);
        arg1.setClip(var7);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIBLjava/awt/Component;)V", line = 23)
    public final void method784(int arg0, int arg1, byte arg2, Component arg3) {
        this.field4531 = new int[arg0 * arg1 + 1];
        this.field4536 = arg1;
        this.field4537 = arg0;
        DataBufferInt var5 = new DataBufferInt(this.field4531, this.field4531.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        if (arg2 != -59) {
            this.field1883 = (Component) null;
        }
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field4536, this.field4537), var5, (Point) null);
        this.field4535 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field1883 = arg3;
        this.method1836(6932);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIILjava/awt/Graphics;)V", line = 44)
    public final void method785(int arg0, int arg1, int arg2, Graphics arg3) {
        if (arg1 != 128) {
            this.field1883 = (Component) null;
        }
        arg3.drawImage(this.field4535, arg2, arg0, this.field1883);
    }
}
