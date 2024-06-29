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

@OriginalClass("client!hc")
public class class79 extends class73 {

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "Ljava/awt/Component;")
    private Component field1536;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILjava/awt/Component;II)V")
    public final void method465(int arg0, Component arg1, int arg2, int arg3) {
        this.field1433 = new int[arg0 * arg3 + 1];
        this.field1437 = arg3;
        if (arg2 != 8) {
            this.method463(-66, -120, 95, null, 94, (byte) 114);
        }
        this.field1431 = arg0;
        DataBufferInt var5 = new DataBufferInt(this.field1433, this.field1433.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field1437, this.field1431), var5, null);
        this.field1438 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field1536 = arg1;
        this.method462(38);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIILjava/awt/Graphics;IB)V")
    public final void method463(int arg0, int arg1, int arg2, Graphics arg3, int arg4, byte arg5) {
        Shape var7 = arg3.getClip();
        arg3.clipRect(arg0, arg1, arg4, arg2);
        arg3.drawImage(this.field1438, 0, 0, this.field1536);
        arg3.setClip(var7);
        int var8 = -90 % ((17 - arg5) / 59);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IILjava/awt/Graphics;B)V")
    public final void method466(int arg0, int arg1, Graphics arg2, byte arg3) {
        int var5 = 24 % ((24 - arg3) / 52);
        arg2.drawImage(this.field1438, arg0, arg1, this.field1536);
    }
}
