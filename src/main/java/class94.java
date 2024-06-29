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

@OriginalClass("client!kd")
public class class94 extends class67 {

    @OriginalMember(owner = "client!kd", name = "t", descriptor = "Ljava/awt/Component;")
    private Component field1831;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public final void method547(int arg0, int arg1, int arg2, Graphics arg3) {
        arg3.drawImage(this.field1357, arg2, arg0, this.field1831);
        if (arg1 <= 61) {
            this.method545(-30, -45, -72, null, 0, (byte) 34);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIILjava/awt/Graphics;IB)V")
    public final void method545(int arg0, int arg1, int arg2, Graphics arg3, int arg4, byte arg5) {
        Shape var7 = arg3.getClip();
        if (arg5 <= 90) {
            this.method545(-56, 88, -35, null, 86, (byte) 18);
        }
        arg3.clipRect(arg0, arg1, arg4, arg2);
        arg3.drawImage(this.field1357, 0, 0, this.field1831);
        arg3.setClip(var7);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIILjava/awt/Component;)V")
    public final void method548(int arg0, int arg1, int arg2, Component arg3) {
        if (arg0 != 4063) {
            this.field1831 = null;
        }
        this.field1369 = new int[arg1 * arg2 + 1];
        this.field1361 = arg2;
        this.field1354 = arg1;
        DataBufferInt var5 = new DataBufferInt(this.field1369, this.field1369.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field1354, this.field1361), var5, null);
        this.field1357 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field1831 = arg3;
        this.method544(0);
    }
}
