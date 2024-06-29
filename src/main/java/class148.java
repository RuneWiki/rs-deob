import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageProducer;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class148 extends class589 implements ImageProducer {

    @OriginalMember(owner = "client!fd", name = "t", descriptor = "I")
    public static int field1900 = 0;

    @OriginalMember(owner = "client!fd", name = "L", descriptor = "I")
    public static int field1917 = 0;

    @OriginalMember(owner = "client!fd", name = "F", descriptor = "F")
    public static float field1911;

    @OriginalMember(owner = "client!fd", name = "u", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!fd", name = "v", descriptor = "I")
    public static int field1902;

    @OriginalMember(owner = "client!fd", name = "w", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!fd", name = "x", descriptor = "I")
    public static int field1904;

    @OriginalMember(owner = "client!fd", name = "y", descriptor = "I")
    public static int field1905;

    @OriginalMember(owner = "client!fd", name = "z", descriptor = "I")
    public static int field1906;

    @OriginalMember(owner = "client!fd", name = "B", descriptor = "I")
    public static int field1907;

    @OriginalMember(owner = "client!fd", name = "C", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!fd", name = "D", descriptor = "I")
    public static int field1909;

    @OriginalMember(owner = "client!fd", name = "E", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!fd", name = "H", descriptor = "I")
    public static int field1913;

    @OriginalMember(owner = "client!fd", name = "I", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!fd", name = "K", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!fd", name = "O", descriptor = "I")
    public static int field1919;

    @OriginalMember(owner = "client!fd", name = "r", descriptor = "Lgl;")
    public static class646 field1898;

    @OriginalMember(owner = "client!fd", name = "G", descriptor = "Ljava/awt/Canvas;")
    private Canvas field1912;

    @OriginalMember(owner = "client!fd", name = "s", descriptor = "Ljava/awt/Image;")
    private Image field1899;

    @OriginalMember(owner = "client!fd", name = "N", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field1918;

    @OriginalMember(owner = "client!fd", name = "J", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field1915;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)V")
    public static void method853(byte arg0) {
        if (arg0 >= 64) {
            field1898 = null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Z)V")
    private final synchronized void method854(boolean arg0) {
        if (arg0) {
            this.field1915 = null;
        }
        ++field1909;
        if (this.field1915 != null) {
            this.field1915.setPixels(0, 0, super.field8279, super.field8280, this.field1918, super.field8274, 0, super.field8279);
            this.field1915.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIILjava/awt/Graphics;BI)V")
    public final void method855(int arg0, int arg1, int arg2, Graphics arg3, byte arg4, int arg5) {
        ++field1901;
        this.method859(arg0, arg2, (byte) -42, arg1, arg5);
        Shape var7 = arg3.getClip();
        arg3.clipRect(arg1, arg0, arg2, arg5);
        arg3.drawImage(this.field1899, 0, 0, this.field1912);
        arg3.setClip(var7);
        int var8 = -90 % ((arg4 - -12) / 40);
    }

    @OriginalMember(owner = "client!fd", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        ++field1916;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!fd", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1915 == arg0) {
            this.field1915 = null;
        }
        ++field1904;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IILjava/awt/Graphics;B)V")
    public final void method856(int arg0, int arg1, Graphics arg2, byte arg3) {
        ++field1907;
        this.method854(false);
        arg2.drawImage(this.field1899, arg0, arg1, this.field1912);
        if (arg3 != -20) {
            this.method854(false);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
    public final void method857(int arg0, Canvas arg1) {
        ++field1910;
        this.field1912 = arg1;
        if (arg0 != -244) {
            field1911 = 0.22671159F;
        }
        super.field8279 = this.field1912.getSize().width;
        super.field8280 = this.field1912.getSize().height;
        super.field8274 = new int[super.field8280 * super.field8279];
        this.field1918 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1899 = this.field1912.createImage(this);
        this.method854(false);
        this.field1912.prepareImage(this.field1899, this.field1912);
        this.method854(false);
        this.field1912.prepareImage(this.field1899, this.field1912);
        this.method854(false);
        this.field1912.prepareImage(this.field1899, this.field1912);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(III)Z")
    public static final boolean method858(int arg0, int arg1, int arg2) {
        ++field1902;
        if (arg0 != -29773) {
            method858(-62, -27, -39);
        }
        return class512.method2767((byte) 46, arg2, arg1) || class638.method3573(3, arg1, arg2);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIBII)V")
    private final synchronized void method859(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        ++field1908;
        if (this.field1915 != null) {
            this.field1915.setPixels(arg3, arg0, arg1, arg4, this.field1918, super.field8274, super.field8279 * arg0 + arg3, super.field8279);
            if (arg2 == -42) {
                this.field1915.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field1906;
    }

    @OriginalMember(owner = "client!fd", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field1915 = arg0;
        ++field1903;
        arg0.setDimensions(super.field8279, super.field8280);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1918);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZII)V")
    public static final void method860(boolean arg0, int arg1, int arg2) {
        class126.field1583 = arg2;
        class304.field3746 = arg1;
        ++field1919;
        class168.method962(class82.field1091.field3685, class82.field1091.field3680, 55);
        if (!arg0) {
            class667.method3747(-106);
            class174.method1097(false, class562.field7815, 35, class355.field4528);
        } else {
            class174.method1097(false, "", 46, "");
        }
    }

    @OriginalMember(owner = "client!fd", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field1913;
        return this.field1915 == arg0;
    }
}
