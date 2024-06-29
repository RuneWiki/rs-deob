import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class169 extends class135 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!kj", name = "x", descriptor = "Lqd;")
    public static class40 field2773 = class147.method1106(")3runescape)3com)4l=", (byte) -65);

    @OriginalMember(owner = "client!kj", name = "z", descriptor = "Lqd;")
    public static class40 field2775 = class147.method1106(": ", (byte) -113);

    @OriginalMember(owner = "client!kj", name = "y", descriptor = "Lsd;")
    public static class26 field2774 = new class26(new byte[5000]);

    @OriginalMember(owner = "client!kj", name = "H", descriptor = "Z")
    public static boolean field2782 = false;

    @OriginalMember(owner = "client!kj", name = "K", descriptor = "Lqd;")
    private static class40 field2785 = class147.method1106("purple:", (byte) -63);

    @OriginalMember(owner = "client!kj", name = "L", descriptor = "Lqd;")
    public static class40 field2786 = field2785;

    @OriginalMember(owner = "client!kj", name = "I", descriptor = "Lqd;")
    public static class40 field2783 = field2785;

    @OriginalMember(owner = "client!kj", name = "J", descriptor = "I")
    public static int field2784 = -1;

    @OriginalMember(owner = "client!kj", name = "N", descriptor = "Lqd;")
    public static class40 field2788 = class147.method1106("Ausw-=hlen", (byte) -102);

    @OriginalMember(owner = "client!kj", name = "n", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!kj", name = "o", descriptor = "I")
    public static int field2764;

    @OriginalMember(owner = "client!kj", name = "p", descriptor = "I")
    public static int field2765;

    @OriginalMember(owner = "client!kj", name = "r", descriptor = "I")
    public static int field2767;

    @OriginalMember(owner = "client!kj", name = "s", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!kj", name = "t", descriptor = "I")
    public static int field2769;

    @OriginalMember(owner = "client!kj", name = "u", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!kj", name = "v", descriptor = "I")
    public static int field2771;

    @OriginalMember(owner = "client!kj", name = "w", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!kj", name = "A", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!kj", name = "B", descriptor = "I")
    public static int field2777;

    @OriginalMember(owner = "client!kj", name = "D", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!kj", name = "F", descriptor = "I")
    public static int field2780;

    @OriginalMember(owner = "client!kj", name = "G", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!kj", name = "M", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!kj", name = "P", descriptor = "Lce;")
    public static class239 field2790;

    @OriginalMember(owner = "client!kj", name = "q", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field2766;

    @OriginalMember(owner = "client!kj", name = "E", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field2779;

    @OriginalMember(owner = "client!kj", name = "O", descriptor = "[Lcm;")
    public static class185[] field2789;

    @OriginalMember(owner = "client!kj", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 6)
    public final void startProduction(ImageConsumer arg0) {
        field2764++;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!kj", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 14)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        field2770++;
        this.field2779 = arg0;
        arg0.setDimensions(this.field2293, this.field2297);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field2766);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!kj", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 27)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2767++;
        return true;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILjava/awt/Graphics;IIII)V", line = 42)
    public final void method549(int arg0, Graphics arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 != 0) {
            this.addConsumer((ImageConsumer) null);
        }
        this.method1259(arg3, arg0, arg2, arg4, 64);
        field2765++;
        Shape var7 = arg1.getClip();
        arg1.clipRect(arg2, arg4, arg0, arg3);
        arg1.drawImage(this.field2287, 0, 0, this);
        arg1.setClip(var7);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)V", line = 58)
    private final synchronized void method1258(byte arg0) {
        if (arg0 < 45) {
            this.requestTopDownLeftRightResend((ImageConsumer) null);
        }
        field2768++;
        if (this.field2779 != null) {
            this.field2779.setPixels(0, 0, this.field2293, this.field2297, this.field2766, this.field2291, 0, this.field2293);
            this.field2779.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIIII)V", line = 80)
    private final synchronized void method1259(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = 58 / ((-arg4 - 3) / 57);
        field2769++;
        if (this.field2779 != null) {
            this.field2779.setPixels(arg2, arg3, arg1, arg0, this.field2766, this.field2291, this.field2293 * arg3 + arg2, this.field2293);
            this.field2779.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!kj", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 93)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        field2777++;
        return this.field2779 == arg0;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIILjava/awt/Component;)V", line = 101)
    public final void method547(int arg0, int arg1, int arg2, Component arg3) {
        this.field2291 = new int[arg1 * arg2 + 1];
        field2771++;
        this.field2293 = arg1;
        this.field2297 = arg2;
        this.field2766 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field2287 = arg3.createImage(this);
        this.method1258((byte) 124);
        arg3.prepareImage(this.field2287, this);
        this.method1258((byte) 88);
        if (arg0 == 16369) {
            arg3.prepareImage(this.field2287, this);
            this.method1258((byte) 60);
            arg3.prepareImage(this.field2287, this);
            this.method997(9101);
        }
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(B)V", line = 124)
    public static void method1260(byte arg0) {
        field2775 = null;
        field2774 = null;
        field2789 = null;
        field2790 = null;
        field2783 = null;
        field2786 = null;
        field2773 = null;
        field2788 = null;
        if (arg0 != 54) {
            field2788 = (class40) null;
        }
        field2785 = null;
    }

    @OriginalMember(owner = "client!kj", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 142)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        field2778++;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIILjava/awt/Graphics;)V", line = 154)
    public final void method548(int arg0, int arg1, int arg2, Graphics arg3) {
        this.method1258((byte) 49);
        if (arg1 != 0) {
            field2789 = (class185[]) null;
        }
        field2772++;
        arg3.drawImage(this.field2287, arg2, arg0, this);
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(IIIII)V", line = 176)
    public static final void method1261(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class177 var5 = class177.method1310(34, 8, arg4);
        if (arg1 != -9022) {
            field2785 = (class40) null;
        }
        var5.method1302(-20040);
        var5.field2908 = arg3;
        field2776++;
        var5.field2902 = arg0;
        var5.field2907 = arg2;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIBIIIIII)V", line = 204)
    public static final void method1262(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2780++;
        int var9 = -68 / ((30 - arg2) / 34);
        int var10 = arg7 - arg4;
        int var11 = arg1 - arg0;
        int var12 = (arg8 - arg6 << 16) / var10;
        int var13 = (arg3 - arg5 << 16) / var11;
        class194.method1383(0, arg6, (byte) 127, arg7, var13, 0, arg5, arg0, arg4, var12, arg1);
    }

    @OriginalMember(owner = "client!kj", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 244)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field2779 == arg0) {
            this.field2779 = null;
        }
        field2763++;
    }
}
