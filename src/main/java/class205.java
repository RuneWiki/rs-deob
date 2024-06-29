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

@OriginalClass("client!ln")
public class class205 extends class153 {

    @OriginalMember(owner = "client!ln", name = "u", descriptor = "Ljava/awt/Component;")
    private Component field2949;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIBLjava/awt/Component;)V", line = 10)
    public final void method1105(int arg0, int arg1, byte arg2, Component arg3) {
        this.field2118 = arg1;
        this.field2124 = arg0;
        this.field2120 = new int[arg0 * arg1 + 1];
        int var5 = 88 / ((33 - arg2) / 35);
        DataBufferInt var6 = new DataBufferInt(this.field2120, this.field2120.length);
        DirectColorModel var7 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var8 = Raster.createWritableRaster(var7.createCompatibleSampleModel(this.field2118, this.field2124), var6, (Point) null);
        this.field2119 = new BufferedImage(var7, var8, false, new Hashtable());
        this.field2949 = arg3;
        this.method1111((byte) 121);
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IILjava/awt/Graphics;I)V", line = 30)
    public final void method1109(int arg0, int arg1, Graphics arg2, int arg3) {
        arg2.drawImage(this.field2119, arg3, arg0, this.field2949);
        if (arg1 != 30364) {
            this.method1110((Graphics) null, 48, (byte) -5, 59, -123, 87);
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Ljava/awt/Graphics;IBIII)V", line = 43)
    public final void method1110(Graphics arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        if (arg2 >= -49) {
            this.method1109(-41, -37, (Graphics) null, -65);
        }
        Shape var7 = arg0.getClip();
        arg0.clipRect(arg1, arg3, arg4, arg5);
        arg0.drawImage(this.field2119, 0, 0, this.field2949);
        arg0.setClip(var7);
    }
}
