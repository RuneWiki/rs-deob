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

@OriginalClass("client!ri")
public class class66 extends class38 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!ri", name = "o", descriptor = "Lp;")
    public static class280 field1095 = class18.method140((byte) -128, "Mem:");

    @OriginalMember(owner = "client!ri", name = "n", descriptor = "Lp;")
    public static class280 field1094 = class18.method140((byte) -125, "rot:");

    @OriginalMember(owner = "client!ri", name = "C", descriptor = "Lp;")
    public static class280 field1109 = class18.method140((byte) -127, " GMT");

    @OriginalMember(owner = "client!ri", name = "z", descriptor = "Lp;")
    public static class280 field1106 = class18.method140((byte) -118, " steht bereits auf Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!ri", name = "p", descriptor = "I")
    public static int field1096;

    @OriginalMember(owner = "client!ri", name = "q", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!ri", name = "r", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!ri", name = "s", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!ri", name = "t", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "client!ri", name = "u", descriptor = "I")
    public static int field1101;

    @OriginalMember(owner = "client!ri", name = "v", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!ri", name = "x", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!ri", name = "y", descriptor = "I")
    public static int field1105;

    @OriginalMember(owner = "client!ri", name = "A", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!ri", name = "B", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!ri", name = "E", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!ri", name = "F", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!ri", name = "G", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!ri", name = "H", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!ri", name = "w", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field1103;

    @OriginalMember(owner = "client!ri", name = "D", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field1110;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public final void method300(int arg0, int arg1, Graphics arg2, int arg3) {
        this.method456(arg0 ^ -14435);
        ++field1102;
        arg2.drawImage(super.field677, arg1, arg3, this);
        if (arg0 != -14412) {
            this.field1110 = null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIB)I")
    public static final int method454(int arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg2 & 3;
        if (arg3 >= -112) {
            method458(-111, -96, -71, -99, (class265) null, (class265) null, 118, 111, 3L);
        }
        ++field1104;
        if (~var4 == -1) {
            return arg0;
        } else if (~var4 == -2) {
            return arg1;
        } else {
            return ~var4 == -3 ? -arg0 + 7 : 7 - arg1;
        }
    }

    @OriginalMember(owner = "client!ri", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1096;
        return true;
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(I)V")
    public static void method455(int arg0) {
        field1095 = null;
        field1094 = null;
        field1106 = null;
        if (arg0 != 0) {
            field1112 = 18;
        }
        field1109 = null;
    }

    @OriginalMember(owner = "client!ri", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field1105;
        return this.field1110 == arg0;
    }

    @OriginalMember(owner = "client!ri", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1110 == arg0) {
            this.field1110 = null;
        }
        ++field1114;
    }

    @OriginalMember(owner = "client!ri", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field1108;
    }

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "(I)V")
    private final synchronized void method456(int arg0) {
        int var2 = -87 % ((arg0 - -5) / 42);
        ++field1098;
        if (this.field1110 != null) {
            this.field1110.setPixels(0, 0, super.field672, super.field681, this.field1103, super.field671, 0, super.field672);
            this.field1110.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Ljava/awt/Graphics;IIIIB)V")
    public final void method302(Graphics arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        this.method459(arg4, arg1, 128, arg3, arg2);
        Shape var7 = arg0.getClip();
        arg0.clipRect(arg2, arg1, arg4, arg3);
        arg0.drawImage(super.field677, 0, 0, this);
        if (arg5 == -16) {
            ++field1111;
            arg0.setClip(var7);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lp;Z)Z")
    public static final boolean method457(class280 arg0, boolean arg1) {
        ++field1100;
        if (arg0 == null) {
            return false;
        } else {
            int var2 = 0;
            if (!arg1) {
                field1112 = -8;
            }
            while (~class208.field3590 < ~var2) {
                if (arg0.method1887((byte) 32, class129.field2236[var2])) {
                    return true;
                }
                ++var2;
            }
            return arg0.method1887((byte) 32, class262.field4631.field2458);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIILrk;Lrk;IIJ)V")
    public static final void method458(int arg0, int arg1, int arg2, int arg3, class265 arg4, class265 arg5, int arg6, int arg7, long arg8) {
        if (arg4 != null || arg5 != null) {
            class163 var10 = new class163();
            var10.field2869 = arg8;
            var10.field2868 = arg1 * 128 + 64;
            var10.field2864 = arg2 * 128 + 64;
            var10.field2866 = arg3;
            var10.field2870 = arg4;
            var10.field2865 = arg5;
            var10.field2867 = arg6;
            var10.field2860 = arg7;
            for (int var11 = arg0; var11 >= 0; --var11) {
                if (class220.field3787[var11][arg1][arg2] == null) {
                    class220.field3787[var11][arg1][arg2] = new class162(var11, arg1, arg2);
                }
            }
            class220.field3787[arg0][arg1][arg2].field2849 = var10;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIII)V")
    private final synchronized void method459(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 128) {
            field1095 = null;
        }
        ++field1099;
        if (this.field1110 != null) {
            this.field1110.setPixels(arg4, arg1, arg0, arg3, this.field1103, super.field671, super.field672 * arg1 + arg4, super.field672);
            this.field1110.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Ljava/awt/Component;IIZ)V")
    public final void method301(Component arg0, int arg1, int arg2, boolean arg3) {
        super.field681 = arg2;
        super.field672 = arg1;
        if (!arg3) {
            this.field1103 = null;
        }
        ++field1107;
        super.field671 = new int[arg1 * arg2 - -1];
        this.field1103 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field677 = arg0.createImage(this);
        this.method456(81);
        arg0.prepareImage(super.field677, this);
        this.method456(107);
        arg0.prepareImage(super.field677, this);
        this.method456(-81);
        arg0.prepareImage(super.field677, this);
        this.method299(30);
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(III)V")
    public static final void method460(int arg0, int arg1, int arg2) {
        ++field1113;
        class157 var3 = class257.method1740(arg0, (byte) 101, 12);
        if (arg1 != -6303) {
            method457((class280) null, false);
        }
        var3.method1112((byte) 111);
        var3.field2748 = arg2;
    }

    @OriginalMember(owner = "client!ri", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field1097;
    }

    @OriginalMember(owner = "client!ri", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field1101;
        this.field1110 = arg0;
        arg0.setDimensions(super.field672, super.field681);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1103);
        arg0.setHints(14);
    }
}
