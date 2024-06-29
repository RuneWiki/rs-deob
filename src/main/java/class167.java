import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Date;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class167 extends class141 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!nd", name = "K", descriptor = "Lqe;")
    public static class42 field2908 = new class42(16);

    @OriginalMember(owner = "client!nd", name = "N", descriptor = "Z")
    public static boolean field2911 = false;

    @OriginalMember(owner = "client!nd", name = "s", descriptor = "I")
    public static int field2890;

    @OriginalMember(owner = "client!nd", name = "t", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!nd", name = "u", descriptor = "I")
    public static int field2892;

    @OriginalMember(owner = "client!nd", name = "v", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "client!nd", name = "w", descriptor = "I")
    public static int field2894;

    @OriginalMember(owner = "client!nd", name = "x", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!nd", name = "y", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "client!nd", name = "z", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!nd", name = "A", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!nd", name = "C", descriptor = "I")
    public static int field2900;

    @OriginalMember(owner = "client!nd", name = "D", descriptor = "I")
    public static int field2901;

    @OriginalMember(owner = "client!nd", name = "F", descriptor = "I")
    public static int field2903;

    @OriginalMember(owner = "client!nd", name = "G", descriptor = "I")
    public static int field2904;

    @OriginalMember(owner = "client!nd", name = "H", descriptor = "I")
    public static int field2905;

    @OriginalMember(owner = "client!nd", name = "I", descriptor = "I")
    public static int field2906;

    @OriginalMember(owner = "client!nd", name = "J", descriptor = "I")
    public static int field2907;

    @OriginalMember(owner = "client!nd", name = "L", descriptor = "I")
    public static int field2909;

    @OriginalMember(owner = "client!nd", name = "M", descriptor = "I")
    public static int field2910;

    @OriginalMember(owner = "client!nd", name = "B", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field2899;

    @OriginalMember(owner = "client!nd", name = "E", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field2902;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IJ)Lda;")
    public static final class275 method1143(int arg0, long arg1) {
        ++field2892;
        class52.field875.setTime(new Date(arg1));
        int var3 = class52.field875.get(7);
        int var4 = class52.field875.get(5);
        int var5 = class52.field875.get(2);
        int var6 = class52.field875.get(1);
        if (arg0 != 10) {
            return null;
        } else {
            int var7 = class52.field875.get(11);
            int var8 = class52.field875.get(12);
            int var9 = class52.field875.get(13);
            return class197.method1291(new class275[] { class115.field2029[var3 + -1], client.field1494, class250.method1644(var4 / 10, (byte) -115), class250.method1644(var4 % 10, (byte) -115), class70.field1137, class213.field3627[var5], class70.field1137, class250.method1644(var6, (byte) -115), class196.field3356, class250.method1644(var7 / 10, (byte) -115), class250.method1644(var7 % 10, (byte) -115), class12.field190, class250.method1644(var8 / 10, (byte) -115), class250.method1644(var8 % 10, (byte) -115), class12.field190, class250.method1644(var9 / 10, (byte) -115), class250.method1644(var9 % 10, (byte) -115), class144.field2525 }, -30025);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIILda;Lda;Lda;)V")
    public static final void method1144(int arg0, int arg1, int arg2, class275 arg3, class275 arg4, class275 arg5) {
        for (int var6 = 99; ~var6 < -1; --var6) {
            class270.field4704[var6] = class270.field4704[var6 - 1];
            class190.field3273[var6] = class190.field3273[var6 - 1];
            class13.field195[var6] = class13.field195[var6 + -1];
            class17.field248[var6] = class17.field248[var6 + -1];
            class153.field2687[var6] = class153.field2687[var6 + -1];
        }
        class190.field3273[0] = arg3;
        class270.field4704[0] = arg1;
        ++field2890;
        ++class192.field3311;
        class153.field2687[0] = arg2;
        if (arg0 == 1) {
            class226.field3836 = class209.field3533;
            class13.field195[0] = arg4;
            class17.field248[0] = arg5;
        }
    }

    @OriginalMember(owner = "client!nd", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field2905;
    }

    @OriginalMember(owner = "client!nd", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field2910;
        if (this.field2902 == arg0) {
            this.field2902 = null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field2893;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIII)V")
    private final synchronized void method1145(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = -114 % ((-16 - arg3) / 43);
        ++field2894;
        if (this.field2902 != null) {
            this.field2902.setPixels(arg1, arg0, arg4, arg2, this.field2899, super.field2487, super.field2489 * arg0 + arg1, super.field2489);
            this.field2902.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(B)V")
    private final synchronized void method1146(byte arg0) {
        ++field2898;
        int var2 = -98 % ((-6 - arg0) / 32);
        if (this.field2902 != null) {
            this.field2902.setPixels(0, 0, super.field2489, super.field2486, this.field2899, super.field2487, 0, super.field2489);
            this.field2902.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIBLjava/awt/Graphics;)V")
    public final void method1018(int arg0, int arg1, byte arg2, Graphics arg3) {
        ++field2903;
        this.method1146((byte) -62);
        arg3.drawImage(super.field2484, arg0, arg1, this);
        int var5 = -46 / ((39 - arg2) / 37);
    }

    @OriginalMember(owner = "client!nd", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2907;
        return true;
    }

    @OriginalMember(owner = "client!nd", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field2895;
        return this.field2902 == arg0;
    }

    @OriginalMember(owner = "client!nd", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field2902 = arg0;
        ++field2909;
        arg0.setDimensions(super.field2489, super.field2486);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field2899);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IBI)V")
    public static final void method1147(int arg0, byte arg1, int arg2) {
        ++field2904;
        int var3 = arg0--;
        if (var3 > 25) {
            var3 = 25;
        }
        int var4 = class8.field123[arg0];
        int var5 = class150.field2617[arg0];
        if (~arg2 == -1) {
            class149.field2597.method526((byte) -57, 24);
            ++class13.field198;
            class149.field2597.method575((byte) 126, var3 + var3 + 3);
        }
        if (arg1 >= -115) {
            method1150(false, -72);
        }
        if (arg2 == 1) {
            ++class38.field638;
            class149.field2597.method526((byte) -84, 226);
            class149.field2597.method575((byte) 124, var3 + var3 + 3 + 14);
        }
        if (~arg2 == -3) {
            class149.field2597.method526((byte) -118, 3);
            class149.field2597.method575((byte) 125, var3 + 3 - -var3);
            ++class118.field2105;
        }
        class149.field2597.method602(class16.field237 + var5, false);
        class149.field2597.method575((byte) 125, class149.field2605[82] ? 1 : 0);
        class149.field2597.method582(class234.field4083 + var4, true);
        class108.field1878 = class8.field123[0];
        class220.field3746 = class150.field2617[0];
        for (int var6 = 1; var3 > var6; ++var6) {
            --arg0;
            class149.field2597.method575((byte) 127, class150.field2617[arg0] - var5);
            class149.field2597.method596(class8.field123[arg0] - var4, false);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
    public final void method1014(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2897;
        this.method1145(arg2, arg3, arg5, -121, arg4);
        Shape var7 = arg0.getClip();
        arg0.clipRect(arg3, arg2, arg4, arg5);
        arg0.drawImage(super.field2484, 0, arg1, this);
        arg0.setClip(var7);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Z)V")
    public static final void method1148(boolean arg0) {
        ++field2901;
        if (arg0) {
            class233.field4072.method987((byte) 88);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILjava/awt/Component;II)V")
    public final void method1015(int arg0, Component arg1, int arg2, int arg3) {
        ++field2900;
        super.field2486 = arg2;
        super.field2489 = arg0;
        super.field2487 = new int[arg0 * arg2 + 1];
        this.field2899 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field2484 = arg1.createImage(this);
        this.method1146((byte) 107);
        if (arg3 == 100) {
            arg1.prepareImage(super.field2484, this);
            this.method1146((byte) 71);
            arg1.prepareImage(super.field2484, this);
            this.method1146((byte) 70);
            arg1.prepareImage(super.field2484, this);
            this.method1016((byte) 118);
        }
    }

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "(B)V")
    public static void method1149(byte arg0) {
        if (arg0 != 91) {
            field2906 = -99;
        }
        field2908 = null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZI)Z")
    public static final boolean method1150(boolean arg0, int arg1) {
        if (arg0) {
            return false;
        } else {
            ++field2896;
            return ~arg1 == -199 || ~arg1 == -231 || ~arg1 == -157 || ~arg1 == -141 || ~arg1 == -224;
        }
    }
}
