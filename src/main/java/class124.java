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

@OriginalClass("client!ng")
public class class124 extends class165 {

    @OriginalMember(owner = "client!ng", name = "r", descriptor = "Ljava/awt/Component;")
    private Component field2277;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public final void method763(int arg0, int arg1, Graphics arg2, int arg3) {
        arg2.drawImage(this.field3166, arg3, arg1, this.field2277);
        if (arg0 != 18307) {
            this.field2277 = null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(BILjava/awt/Component;I)V")
    public final void method764(byte arg0, int arg1, Component arg2, int arg3) {
        this.field3160 = new int[arg1 * arg3 + 1];
        if (arg0 != -10) {
            this.method764((byte) 38, 52, null, -49);
        }
        this.field3169 = arg1;
        this.field3165 = arg3;
        DataBufferInt var5 = new DataBufferInt(this.field3160, this.field3160.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field3169, this.field3165), var5, null);
        this.field3166 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field2277 = arg2;
        this.method1059((byte) 14);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IILjava/awt/Graphics;III)V")
    public final void method765(int arg0, int arg1, Graphics arg2, int arg3, int arg4, int arg5) {
        Shape var7 = arg2.getClip();
        arg2.clipRect(arg5, arg1, arg4, arg3);
        arg2.drawImage(this.field3166, 0, 0, this.field2277);
        if (arg0 == 64) {
            arg2.setClip(var7);
        }
    }
}
