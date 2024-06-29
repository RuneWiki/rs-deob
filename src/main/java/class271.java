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

@OriginalClass("client!n")
public class class271 extends class104 {

    @OriginalMember(owner = "client!n", name = "r", descriptor = "Ljava/awt/Component;")
    private Component field4667;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ILjava/awt/Graphics;II)V", line = 10)
    public final void method673(int arg0, Graphics arg1, int arg2, int arg3) {
        int var5 = -5 / ((arg0 + 31) / 39);
        arg1.drawImage(this.field1931, arg3, arg2, this.field4667);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(BLjava/awt/Component;II)V", line = 21)
    public final void method671(byte arg0, Component arg1, int arg2, int arg3) {
        if (arg0 > -79) {
            return;
        }
        this.field1930 = arg3;
        this.field1919 = arg2;
        this.field1920 = new int[arg2 * arg3 + 1];
        DataBufferInt var5 = new DataBufferInt(this.field1920, this.field1920.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field1919, this.field1930), var5, (Point) null);
        this.field1931 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field4667 = arg1;
        this.method765(0);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIZLjava/awt/Graphics;II)V", line = 43)
    public final void method679(int arg0, int arg1, boolean arg2, Graphics arg3, int arg4, int arg5) {
        Shape var7 = arg3.getClip();
        arg3.clipRect(arg1, arg0, arg5, arg4);
        arg3.drawImage(this.field1931, 0, 0, this.field4667);
        if (!arg2) {
            this.field4667 = (Component) null;
        }
        arg3.setClip(var7);
    }
}
