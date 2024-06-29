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

@OriginalClass("client!i")
public class class54 extends class223 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!i", name = "K", descriptor = "Ljd;")
    public static class85 field959 = class221.method1499("Untersuchen", (byte) 86);

    @OriginalMember(owner = "client!i", name = "L", descriptor = "Z")
    public static boolean field960 = false;

    @OriginalMember(owner = "client!i", name = "A", descriptor = "Ljd;")
    public static class85 field949 = class221.method1499("details", (byte) -84);

    @OriginalMember(owner = "client!i", name = "N", descriptor = "[I")
    public static int[] field962 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!i", name = "y", descriptor = "[I")
    public static int[] field947 = new int[100];

    @OriginalMember(owner = "client!i", name = "B", descriptor = "Lve;")
    public static class184 field950 = new class184(64);

    @OriginalMember(owner = "client!i", name = "p", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!i", name = "q", descriptor = "I")
    public static int field939;

    @OriginalMember(owner = "client!i", name = "r", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!i", name = "s", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!i", name = "t", descriptor = "I")
    public static int field942;

    @OriginalMember(owner = "client!i", name = "u", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!i", name = "w", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!i", name = "x", descriptor = "I")
    public static int field946;

    @OriginalMember(owner = "client!i", name = "z", descriptor = "I")
    public static int field948;

    @OriginalMember(owner = "client!i", name = "C", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!i", name = "D", descriptor = "I")
    public static int field952;

    @OriginalMember(owner = "client!i", name = "E", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!i", name = "G", descriptor = "I")
    public static int field955;

    @OriginalMember(owner = "client!i", name = "H", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!i", name = "I", descriptor = "I")
    public static int field957;

    @OriginalMember(owner = "client!i", name = "J", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "client!i", name = "O", descriptor = "I")
    public static int field963;

    @OriginalMember(owner = "client!i", name = "F", descriptor = "Lge;")
    public static class68 field954;

    @OriginalMember(owner = "client!i", name = "M", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field961;

    @OriginalMember(owner = "client!i", name = "v", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field944;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIBI)V")
    private final synchronized void method358(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        ++field939;
        int var6 = 121 % ((-7 - arg3) / 54);
        if (this.field944 != null) {
            this.field944.setPixels(arg2, arg1, arg0, arg4, this.field961, super.field3905, super.field3909 * arg1 + arg2, super.field3909);
            this.field944.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!i", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field955;
        this.field944 = arg0;
        arg0.setDimensions(super.field3909, super.field3910);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field961);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
    public final void method359(int arg0, int arg1, int arg2, Graphics arg3, int arg4, int arg5) {
        ++field963;
        int var7 = -42 / ((67 - arg4) / 35);
        this.method358(arg0, arg1, arg2, (byte) -127, arg5);
        Shape var8 = arg3.getClip();
        arg3.clipRect(arg2, arg1, arg0, arg5);
        arg3.drawImage(super.field3908, 0, 0, this);
        arg3.setClip(var8);
    }

    @OriginalMember(owner = "client!i", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field945;
    }

    @OriginalMember(owner = "client!i", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        ++field941;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BLge;)V")
    public static final void method360(byte arg0, class68 arg1) {
        class228.field3957 = arg1;
        ++field946;
        if (arg0 != 98) {
            field950 = null;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ILjava/awt/Graphics;ZI)V")
    public final void method361(int arg0, Graphics arg1, boolean arg2, int arg3) {
        if (!arg2) {
            field954 = null;
        }
        ++field948;
        this.method365(52);
        arg1.drawImage(super.field3908, arg0, arg3, this);
    }

    @OriginalMember(owner = "client!i", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field943;
        return this.field944 == arg0;
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(B)V")
    public static void method362(byte arg0) {
        field962 = null;
        field959 = null;
        field950 = null;
        field947 = null;
        field949 = null;
        if (arg0 <= 123) {
            field960 = false;
        }
        field954 = null;
    }

    @OriginalMember(owner = "client!i", name = "d", descriptor = "(B)V")
    public static final void method363(byte arg0) {
        ++field953;
        if (arg0 >= -34) {
            method362((byte) 108);
        }
        if (~class203.field3541 != -3) {
            if (~class99.field1784 == ~class151.field2551 && ~class194.field3315 == ~class175.field3008) {
                class203.field3541 = 0;
                class153.method1006(-64, class115.field2058 + -1);
            } else {
                class203.field3541 = 2;
                class152.field2604 = class175.field3008;
                class19.field278 = class99.field1784;
            }
        } else if (class19.field278 == class151.field2551 && class194.field3315 == class152.field2604) {
            class203.field3541 = 0;
            class153.method1006(-50, class115.field2058 + -1);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ILge;II)[Lee;")
    public static final class266[] method364(int arg0, class68 arg1, int arg2, int arg3) {
        ++field938;
        if (!class253.method1750(arg2, arg1, (byte) 118, arg3)) {
            return null;
        } else {
            int var4 = 115 % ((arg0 - 23) / 32);
            return class232.method1552(2);
        }
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(I)V")
    private final synchronized void method365(int arg0) {
        ++field958;
        if (this.field944 != null) {
            this.field944.setPixels(0, 0, super.field3909, super.field3910, this.field961, super.field3905, 0, super.field3909);
            this.field944.imageComplete(2);
            int var2 = 52 / ((-33 - arg0) / 52);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Ljava/awt/Component;IIB)V")
    public final void method366(Component arg0, int arg1, int arg2, byte arg3) {
        super.field3909 = arg1;
        super.field3905 = new int[arg1 * arg2 + 1];
        ++field956;
        super.field3910 = arg2;
        this.field961 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field3908 = arg0.createImage(this);
        this.method365(97);
        arg0.prepareImage(super.field3908, this);
        this.method365(-111);
        arg0.prepareImage(super.field3908, this);
        this.method365(arg3 + 14);
        if (arg3 != 103) {
            field960 = false;
        }
        arg0.prepareImage(super.field3908, this);
        this.method1511((byte) 34);
    }

    @OriginalMember(owner = "client!i", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field951;
        return true;
    }

    @OriginalMember(owner = "client!i", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field944 == arg0) {
            this.field944 = null;
        }
        ++field957;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ILjb;)Ljd;")
    public static final class85 method367(int arg0, class255 arg1) {
        ++field940;
        if (class161.method1057((byte) -74, client.method987(arg1)) == arg0) {
            return null;
        } else if (arg1.field4546 != null && ~arg1.field4546.method601(0).method586(true) != -1) {
            return arg1.field4546;
        } else {
            return class183.field3134 ? class226.field3934 : null;
        }
    }
}
