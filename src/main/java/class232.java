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

@OriginalClass("client!ua")
public class class232 extends class90 {

    @OriginalMember(owner = "client!ua", name = "r", descriptor = "Ljava/awt/Component;")
    private Component field4156;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IBIILjava/awt/Graphics;I)V")
    public final void method694(int arg0, byte arg1, int arg2, int arg3, Graphics arg4, int arg5) {
        if (arg1 == 84) {
            Shape var7 = arg4.getClip();
            arg4.clipRect(arg0, arg3, arg5, arg2);
            arg4.drawImage(this.field1652, 0, 0, this.field4156);
            arg4.setClip(var7);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public final void method693(int arg0, Graphics arg1, int arg2, int arg3) {
        arg1.drawImage(this.field1652, arg0, arg3, this.field4156);
        if (arg2 <= 16) {
            this.method693(90, (Graphics) null, 49, 100);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIILjava/awt/Component;)V")
    public final void method697(int arg0, int arg1, int arg2, Component arg3) {
        this.field1659 = arg1;
        this.field1649 = new int[arg1 * arg2 + 1];
        this.field1661 = arg2;
        DataBufferInt var5 = new DataBufferInt(this.field1649, this.field1649.length);
        if (arg0 < 51) {
            this.method693(-47, (Graphics) null, -37, 81);
        }
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field1659, this.field1661), var5, (Point) null);
        this.field1652 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field4156 = arg3;
        this.method700(59);
    }
}
