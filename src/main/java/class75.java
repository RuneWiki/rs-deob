import java.awt.Component;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class75 extends class86 {

    @OriginalMember(owner = "client!m", name = "B", descriptor = "Ljava/awt/Component;")
    private Component field1734;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IILjava/awt/Component;B)V", line = 10)
    public final void method468(int arg0, int arg1, Component arg2, byte arg3) {
        this.field1926 = arg0;
        this.field1925 = new int[arg0 * arg1 + 1];
        this.field1929 = arg1;
        DataBufferInt var5 = new DataBufferInt(this.field1925, this.field1925.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field1926, this.field1929), var5, null);
        this.field1911 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field1734 = arg2;
        this.method561((byte) -74);
        if (arg3 >= -103) {
            this.method465(19, 127, null, 72);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IILjava/awt/Graphics;I)V", line = 34)
    public final void method465(int arg0, int arg1, Graphics arg2, int arg3) {
        if (arg0 >= -50) {
            this.method468(-98, -24, null, (byte) 25);
        }
        arg2.drawImage(this.field1911, arg3, arg1, this.field1734);
    }
}
