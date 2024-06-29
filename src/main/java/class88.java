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

@OriginalClass("client!oa")
public class class88 extends class112 {

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "Ljava/awt/Component;")
    private Component field1666;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public final void method682(int arg0, int arg1, int arg2, Graphics arg3) {
        arg3.drawImage(this.field2122, arg1, arg0, this.field1666);
        if (arg2 != 128) {
            this.field1666 = (Component) null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
    public final void method683(int arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5) {
        if (arg0 <= 108) {
            this.method682(-53, -128, 87, (Graphics) null);
        }
        Shape var7 = arg4.getClip();
        arg4.clipRect(arg2, arg3, arg5, arg1);
        arg4.drawImage(this.field2122, 0, 0, this.field1666);
        arg4.setClip(var7);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(BILjava/awt/Component;I)V")
    public final void method684(byte arg0, int arg1, Component arg2, int arg3) {
        this.field2128 = arg1;
        this.field2126 = new int[arg1 * arg3 + 1];
        this.field2130 = arg3;
        DataBufferInt var5 = new DataBufferInt(this.field2126, this.field2126.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        int var7 = 36 % ((arg0 - 47) / 37);
        WritableRaster var8 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field2130, this.field2128), var5, (Point) null);
        this.field2122 = new BufferedImage(var6, var8, false, new Hashtable());
        this.field1666 = arg2;
        this.method914(110);
    }
}
