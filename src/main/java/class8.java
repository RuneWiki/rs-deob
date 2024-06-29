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

@OriginalClass("client!b")
public class class8 extends class18 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!b", name = "F", descriptor = "Lpe;")
    public static class109 field191 = class141.method1120("Geben Sie Ihren Benutzernamen", 0);

    @OriginalMember(owner = "client!b", name = "v", descriptor = "I")
    public static int field181 = 0;

    @OriginalMember(owner = "client!b", name = "O", descriptor = "Lpe;")
    public static class109 field200 = class141.method1120("da dieser Computer gegen unsere ", 0);

    @OriginalMember(owner = "client!b", name = "P", descriptor = "I")
    public static int field201 = 127;

    @OriginalMember(owner = "client!b", name = "N", descriptor = "J")
    public static volatile long field199 = 0L;

    @OriginalMember(owner = "client!b", name = "H", descriptor = "Ljb;")
    public static class64 field193 = new class64(4096);

    @OriginalMember(owner = "client!b", name = "U", descriptor = "Lpe;")
    public static class109 field206 = class141.method1120("<col=ffff00>", 0);

    @OriginalMember(owner = "client!b", name = "T", descriptor = "I")
    public static int field205 = 0;

    @OriginalMember(owner = "client!b", name = "X", descriptor = "Lpe;")
    private static class109 field209 = class141.method1120("white:", 0);

    @OriginalMember(owner = "client!b", name = "W", descriptor = "Lpe;")
    public static class109 field208 = class141.method1120("Suche nach Updates )2 ", 0);

    @OriginalMember(owner = "client!b", name = "V", descriptor = "Lpe;")
    public static class109 field207 = field209;

    @OriginalMember(owner = "client!b", name = "Y", descriptor = "Lpe;")
    public static class109 field210 = field209;

    @OriginalMember(owner = "client!b", name = "x", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!b", name = "y", descriptor = "I")
    public static int field184;

    @OriginalMember(owner = "client!b", name = "z", descriptor = "I")
    public static int field185;

    @OriginalMember(owner = "client!b", name = "B", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!b", name = "C", descriptor = "I")
    public static int field188;

    @OriginalMember(owner = "client!b", name = "D", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!b", name = "E", descriptor = "I")
    public static int field190;

    @OriginalMember(owner = "client!b", name = "G", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!b", name = "I", descriptor = "I")
    public static int field194;

    @OriginalMember(owner = "client!b", name = "J", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!b", name = "K", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "client!b", name = "L", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "client!b", name = "M", descriptor = "I")
    public static int field198;

    @OriginalMember(owner = "client!b", name = "R", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "client!b", name = "S", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!b", name = "Q", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field202;

    @OriginalMember(owner = "client!b", name = "A", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field186;

    @OriginalMember(owner = "client!b", name = "w", descriptor = "Z")
    public static boolean field182;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Z)V")
    private final synchronized void method71(boolean arg0) {
        ++field195;
        if (!arg0) {
            if (this.field186 != null) {
                this.field186.setPixels(0, 0, super.field451, super.field445, this.field202, super.field443, 0, super.field451);
                this.field186.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IBLjava/awt/Component;I)V")
    public final void method72(int arg0, byte arg1, Component arg2, int arg3) {
        super.field443 = new int[arg0 * arg3 + 1];
        super.field445 = arg0;
        ++field188;
        super.field451 = arg3;
        this.field202 = new DirectColorModel(32, 16711680, 65280, 255);
        int var5 = 25 / ((arg1 - 61) / 61);
        super.field449 = arg2.createImage(this);
        this.method71(false);
        arg2.prepareImage(super.field449, this);
        this.method71(false);
        arg2.prepareImage(super.field449, this);
        this.method71(false);
        arg2.prepareImage(super.field449, this);
        this.method184((byte) 80);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
    public final void method73(Graphics arg0, int arg1, int arg2, int arg3) {
        this.method71(false);
        int var5 = -83 % ((-43 - arg1) / 49);
        ++field183;
        arg0.drawImage(super.field449, arg2, arg3, this);
    }

    @OriginalMember(owner = "client!b", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field185;
        return true;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BLub;)V")
    private static final void method74(byte arg0, class141 arg1) {
        arg1.field3092 = 0;
        if (~arg1.field3105 == -1) {
            arg1.field3111 = 1024;
        }
        int var2 = arg1.field3093 * 128 + arg1.field3071 * 64;
        if (~arg1.field3105 == -2) {
            arg1.field3111 = 1536;
        }
        int var3 = arg1.field3084 * 128 - -(arg1.field3071 * 64);
        ++field197;
        int var4 = arg1.field3112 - class12.field264;
        if (arg0 != 25) {
            method74((byte) -23, (class141) null);
        }
        if (~arg1.field3105 == -3) {
            arg1.field3111 = 0;
        }
        arg1.field3106 += (var3 - arg1.field3106) / var4;
        if (arg1.field3105 == 3) {
            arg1.field3111 = 512;
        }
        arg1.field3094 += (var2 - arg1.field3094) / var4;
    }

    @OriginalMember(owner = "client!b", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field184;
        this.field186 = arg0;
        arg0.setDimensions(super.field451, super.field445);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field202);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!b", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field190;
        return this.field186 == arg0;
    }

    @OriginalMember(owner = "client!b", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field204;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIII)V")
    private final synchronized void method75(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field194;
        if (arg2 < -75) {
            if (this.field186 != null) {
                this.field186.setPixels(arg0, arg3, arg4, arg1, this.field202, super.field443, super.field451 * arg3 + arg0, super.field451);
                this.field186.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIBII)V")
    public static final void method76(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        for (int var5 = 0; ~var5 > ~class19.field490; ++var5) {
            if (class50.field1045[var5] - -class61.field1207[var5] > arg3 && arg3 - -arg1 > class50.field1045[var5] && class137.field2981[var5] + class114.field2520[var5] > arg4 && arg4 - -arg0 > class114.field2520[var5]) {
                class120.field2663[var5] = true;
            }
        }
        if (arg2 != 105) {
            method76(100, -83, (byte) -42, 19, -23);
        }
        ++field192;
    }

    @OriginalMember(owner = "client!b", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field187;
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(Z)V")
    public static void method77(boolean arg0) {
        field200 = null;
        if (!arg0) {
            field207 = null;
        }
        field208 = null;
        field206 = null;
        field193 = null;
        field191 = null;
        field210 = null;
        field207 = null;
        field209 = null;
    }

    @OriginalMember(owner = "client!b", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field186 == arg0) {
            this.field186 = null;
        }
        ++field196;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IILjava/awt/Graphics;III)V")
    public final void method78(int arg0, int arg1, Graphics arg2, int arg3, int arg4, int arg5) {
        ++field203;
        if (arg4 == -1) {
            this.method75(arg5, arg3, arg4 ^ 114, arg1, arg0);
            Shape var7 = arg2.getClip();
            arg2.clipRect(arg5, arg1, arg0, arg3);
            arg2.drawImage(super.field449, 0, 0, this);
            arg2.setClip(var7);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IILub;)V")
    public static final void method79(int arg0, int arg1, class141 arg2) {
        if (~class12.field264 <= ~arg2.field3112) {
            if (~class12.field264 >= ~arg2.field3070) {
                class93.method776(false, arg2);
            } else {
                class124.method1007(-256, arg2);
            }
        } else {
            method74((byte) 25, arg2);
        }
        if (arg1 != 10637) {
            method76(48, -51, (byte) -76, 52, 7);
        }
        ++field189;
        if (~arg2.field3094 > -129 || arg2.field3106 < 128 || ~arg2.field3094 <= -13185 || arg2.field3106 >= 13184) {
            arg2.field3070 = 0;
            arg2.field3106 = arg2.field3121[0] * 128 + arg2.field3071 * 64;
            arg2.field3112 = 0;
            arg2.field3128 = -1;
            arg2.field3094 = arg2.field3120[0] * 128 + arg2.field3071 * 64;
            arg2.field3124 = -1;
            arg2.method1128(14535);
        }
        if (class136.field2975 == arg2 && (~arg2.field3094 > -1537 || arg2.field3106 < 1536 || arg2.field3094 >= 11776 || arg2.field3106 >= 11776)) {
            arg2.field3094 = arg2.field3120[0] * 128 - -(arg2.field3071 * 64);
            arg2.field3112 = 0;
            arg2.field3106 = arg2.field3121[0] * 128 - -(arg2.field3071 * 64);
            arg2.field3070 = 0;
            arg2.field3124 = -1;
            arg2.field3128 = -1;
            arg2.method1128(14535);
        }
        class154.method1187(false, arg2);
        class133.method1067((byte) 51, arg2);
    }
}
