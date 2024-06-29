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

@OriginalClass("client!kd")
public class class166 extends class3 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!kd", name = "w", descriptor = "I")
    public static int field2828 = 127;

    @OriginalMember(owner = "client!kd", name = "t", descriptor = "[I")
    public static int[] field2825 = new int[4096];

    @OriginalMember(owner = "client!kd", name = "C", descriptor = "I")
    public static int field2834 = 0;

    @OriginalMember(owner = "client!kd", name = "p", descriptor = "I")
    public static int field2821;

    @OriginalMember(owner = "client!kd", name = "r", descriptor = "I")
    public static int field2823;

    @OriginalMember(owner = "client!kd", name = "s", descriptor = "I")
    public static int field2824;

    @OriginalMember(owner = "client!kd", name = "x", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!kd", name = "y", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!kd", name = "z", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!kd", name = "B", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!kd", name = "D", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!kd", name = "E", descriptor = "I")
    public static int field2836;

    @OriginalMember(owner = "client!kd", name = "F", descriptor = "I")
    public static int field2837;

    @OriginalMember(owner = "client!kd", name = "H", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!kd", name = "I", descriptor = "I")
    public static int field2840;

    @OriginalMember(owner = "client!kd", name = "J", descriptor = "I")
    public static int field2841;

    @OriginalMember(owner = "client!kd", name = "A", descriptor = "Lnc;")
    public static class136 field2832;

    @OriginalMember(owner = "client!kd", name = "v", descriptor = "Lrd;")
    public static class207 field2827;

    @OriginalMember(owner = "client!kd", name = "u", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field2826;

    @OriginalMember(owner = "client!kd", name = "q", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field2822;

    @OriginalMember(owner = "client!kd", name = "G", descriptor = "[I")
    public static int[] field2838;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZIIZII)Lgd;")
    public static final class65 method1061(boolean arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        ++field2839;
        long var6 = ((long) arg2 << 38) + ((long) arg4 << 40) + (arg0 ? 137438953472L : 0L) + ((long) arg1 << 16) + (long) arg5;
        class65 var8 = (class65) class148.field2575.method1499(0, var6);
        if (!arg3) {
            return null;
        } else if (var8 != null) {
            return var8;
        } else {
            class248.field4291 = false;
            class65 var9 = class123.method833(arg1, arg0, arg3, false, arg5, false, arg4, arg2);
            if (var9 != null && !class248.field4291) {
                class148.field2575.method1502((byte) -18, var9, var6);
            }
            return var9;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILjava/awt/Component;II)V")
    public final void method18(int arg0, Component arg1, int arg2, int arg3) {
        super.field27 = arg2;
        super.field37 = new int[arg2 * arg3 - -1];
        super.field29 = arg3;
        this.field2826 = new DirectColorModel(32, 16711680, 65280, 255);
        int var5 = -88 % ((15 - arg0) / 50);
        ++field2829;
        super.field31 = arg1.createImage(this);
        this.method1063((byte) -20);
        arg1.prepareImage(super.field31, this);
        this.method1063((byte) -20);
        arg1.prepareImage(super.field31, this);
        this.method1063((byte) -20);
        arg1.prepareImage(super.field31, this);
        this.method22(-121);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIZ)V")
    private final synchronized void method1062(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg4) {
            this.isConsumer((ImageConsumer) null);
        }
        ++field2833;
        if (this.field2822 != null) {
            this.field2822.setPixels(arg1, arg2, arg0, arg3, this.field2826, super.field37, super.field27 * arg2 + arg1, super.field27);
            this.field2822.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!kd", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field2840;
        return this.field2822 == arg0;
    }

    @OriginalMember(owner = "client!kd", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field2830;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V")
    private final synchronized void method1063(byte arg0) {
        ++field2821;
        if (this.field2822 != null) {
            if (arg0 != -20) {
                this.removeConsumer((ImageConsumer) null);
            }
            this.field2822.setPixels(0, 0, super.field27, super.field29, this.field2826, super.field37, 0, super.field27);
            this.field2822.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!kd", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field2841;
    }

    @OriginalMember(owner = "client!kd", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field2822 == arg0) {
            this.field2822 = null;
        }
        ++field2835;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public final void method17(int arg0, Graphics arg1, int arg2, int arg3) {
        ++field2836;
        this.method1063((byte) -20);
        arg1.drawImage(super.field31, arg3, arg2, this);
        if (arg0 != 5) {
            this.method1062(9, 16, 88, 58, false);
        }
    }

    @OriginalMember(owner = "client!kd", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2831;
        return true;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(B)V")
    public static final void method1064(byte arg0) {
        class236.field4021 = 0;
        class233.field3964 = null;
        class252.field4362 = null;
        if (arg0 <= 56) {
            method1065((byte) -73);
        }
        class74.field1123 = null;
        class243.field4226 = null;
        class94.field1482 = null;
        ++field2823;
        class122.field2021 = null;
        field2838 = null;
        class32.field389 = null;
        class1.field6 = null;
        class89.field1394 = null;
        class71.field1079.method318((byte) -117);
        class161.field2759.method318((byte) -120);
        class54.field741 = null;
        class105.field1690 = null;
        class64.field895 = null;
        class27.field336 = null;
        class87.field1355 = null;
        class130.field2293 = null;
        class198.field3430 = null;
        class241.field4122 = null;
        class212.field3669 = null;
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(B)V")
    public static void method1065(byte arg0) {
        if (arg0 == -51) {
            field2832 = null;
            field2838 = null;
            field2827 = null;
            field2825 = null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field2822 = arg0;
        ++field2824;
        arg0.setDimensions(super.field27, super.field29);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field2826);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljava/awt/Graphics;IIBII)V")
    public final void method21(Graphics arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        this.method1062(arg4, arg5, arg1, arg2, false);
        ++field2837;
        Shape var7 = arg0.getClip();
        arg0.clipRect(arg5, arg1, arg4, arg2);
        arg0.drawImage(super.field31, 0, 0, this);
        arg0.setClip(var7);
        if (arg3 <= 53) {
            field2834 = 125;
        }
    }
}
