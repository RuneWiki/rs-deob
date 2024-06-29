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

@OriginalClass("client!ga")
public class class161 extends class188 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!ga", name = "x", descriptor = "Z")
    public static boolean field2713 = false;

    @OriginalMember(owner = "client!ga", name = "E", descriptor = "[J")
    public static long[] field2720 = new long[500];

    @OriginalMember(owner = "client!ga", name = "C", descriptor = "I")
    public static int field2718 = 0;

    @OriginalMember(owner = "client!ga", name = "B", descriptor = "Lub;")
    private static class227 field2717 = class257.method1749("wave2:", 17263);

    @OriginalMember(owner = "client!ga", name = "F", descriptor = "Lub;")
    public static class227 field2721 = field2717;

    @OriginalMember(owner = "client!ga", name = "Q", descriptor = "Lub;")
    public static class227 field2732 = field2717;

    @OriginalMember(owner = "client!ga", name = "H", descriptor = "Lpf;")
    public static class168 field2723 = new class168(64);

    @OriginalMember(owner = "client!ga", name = "T", descriptor = "Z")
    public static boolean field2735 = false;

    @OriginalMember(owner = "client!ga", name = "t", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!ga", name = "u", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!ga", name = "v", descriptor = "I")
    public static int field2711;

    @OriginalMember(owner = "client!ga", name = "w", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!ga", name = "y", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!ga", name = "A", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!ga", name = "D", descriptor = "I")
    public static int field2719;

    @OriginalMember(owner = "client!ga", name = "G", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!ga", name = "I", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!ga", name = "J", descriptor = "I")
    public static int field2725;

    @OriginalMember(owner = "client!ga", name = "K", descriptor = "I")
    public static int field2726;

    @OriginalMember(owner = "client!ga", name = "L", descriptor = "I")
    public static int field2727;

    @OriginalMember(owner = "client!ga", name = "M", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!ga", name = "N", descriptor = "I")
    public static int field2729;

    @OriginalMember(owner = "client!ga", name = "O", descriptor = "I")
    public static int field2730;

    @OriginalMember(owner = "client!ga", name = "R", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!ga", name = "S", descriptor = "I")
    public static int field2734;

    @OriginalMember(owner = "client!ga", name = "s", descriptor = "Ln;")
    public static class138 field2708;

    @OriginalMember(owner = "client!ga", name = "P", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field2731;

    @OriginalMember(owner = "client!ga", name = "z", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field2715;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(BI)I")
    public static final int method988(byte arg0, int arg1) {
        int var2 = arg1 & 63;
        int var3 = arg1 >> 6 & 3;
        ++field2726;
        if (arg0 != 36) {
            field2718 = -7;
        }
        if (~var2 != -19) {
            if (~var2 == -20 || ~var2 == -22) {
                if (var3 == 0) {
                    return 16;
                }
                if (~var3 == -2) {
                    return 32;
                }
                if (var3 == 2) {
                    return 64;
                }
                if (var3 == 3) {
                    return 128;
                }
            }
        } else {
            if (~var3 == -1) {
                return 1;
            }
            if (~var3 == -2) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (~var3 == -4) {
                return 8;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIII)V")
    private final synchronized void method989(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2722;
        if (this.field2715 != null) {
            this.field2715.setPixels(arg4, arg2, arg3, arg1, this.field2731, super.field3202, super.field3201 * arg2 + arg4, super.field3201);
            this.field2715.imageComplete(arg0);
        }
    }

    @OriginalMember(owner = "client!ga", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field2709;
    }

    @OriginalMember(owner = "client!ga", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2734;
        return true;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILjava/awt/Graphics;BIII)V")
    public final void method718(int arg0, Graphics arg1, byte arg2, int arg3, int arg4, int arg5) {
        this.method989(2, arg3, arg4, arg5, arg0);
        ++field2728;
        Shape var7 = arg1.getClip();
        if (arg2 != -52) {
            field2724 = 110;
        }
        arg1.clipRect(arg0, arg4, arg5, arg3);
        arg1.drawImage(super.field3199, 0, 0, this);
        arg1.setClip(var7);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public final void method719(int arg0, int arg1, Graphics arg2, int arg3) {
        this.method991((byte) -65);
        arg2.drawImage(super.field3199, arg0, arg1, this);
        ++field2719;
        if (arg3 != 3108) {
            field2732 = null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field2733;
        if (this.field2715 == arg0) {
            this.field2715 = null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(I)V")
    public static void method990(int arg0) {
        field2708 = null;
        field2717 = null;
        if (arg0 < 109) {
            field2720 = null;
        }
        field2720 = null;
        field2732 = null;
        field2723 = null;
        field2721 = null;
    }

    @OriginalMember(owner = "client!ga", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field2710;
        return this.field2715 == arg0;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILjava/awt/Component;BI)V")
    public final void method717(int arg0, Component arg1, byte arg2, int arg3) {
        super.field3201 = arg3;
        ++field2711;
        super.field3210 = arg0;
        super.field3202 = new int[arg0 * arg3 + 1];
        this.field2731 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field3199 = arg1.createImage(this);
        this.method991((byte) -65);
        arg1.prepareImage(super.field3199, this);
        this.method991((byte) -65);
        arg1.prepareImage(super.field3199, this);
        int var5 = 51 / (arg2 / 37);
        this.method991((byte) -65);
        arg1.prepareImage(super.field3199, this);
        this.method1203(-1);
    }

    @OriginalMember(owner = "client!ga", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field2729;
        this.field2715 = arg0;
        arg0.setDimensions(super.field3201, super.field3210);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field2731);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!ga", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field2712;
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(B)V")
    private final synchronized void method991(byte arg0) {
        ++field2716;
        if (this.field2715 != null) {
            this.field2715.setPixels(0, 0, super.field3201, super.field3210, this.field2731, super.field3202, 0, super.field3201);
            if (arg0 != -65) {
                this.field2715 = null;
            }
            this.field2715.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "(I)V")
    public static final void method992(int arg0) {
        ++field2730;
        if (arg0 != 29172) {
            method993(-81, -124, 111, 18, 44, 83);
        }
        if (class149.field2596 != null) {
            class149.field2596.method97(0);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIIII)V")
    public static final void method993(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2725;
        int var8 = arg0 + 1;
        class246.method1644(arg1, class59.field1094[arg0], arg2, arg4, 1);
        int var9 = arg5 - 1;
        class246.method1644(arg1, class59.field1094[arg5], arg2, arg4, 1);
        for (int var6 = var8; var9 >= var6; ++var6) {
            int[] var7 = class59.field1094[var6];
            var7[arg4] = var7[arg2] = arg1;
        }
        if (arg3 > -110) {
            field2735 = true;
        }
    }
}
