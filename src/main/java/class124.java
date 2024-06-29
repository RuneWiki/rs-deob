import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class124 extends class122 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!sa", name = "y", descriptor = "Lu;")
    private static class135 field2950 = class87.method676((byte) -52, "Report abuse");

    @OriginalMember(owner = "client!sa", name = "v", descriptor = "Z")
    public static boolean field2947 = true;

    @OriginalMember(owner = "client!sa", name = "w", descriptor = "Lu;")
    public static class135 field2948 = field2950;

    @OriginalMember(owner = "client!sa", name = "M", descriptor = "I")
    public static int field2964 = 0;

    @OriginalMember(owner = "client!sa", name = "u", descriptor = "Lu;")
    public static class135 field2946 = class87.method676((byte) -105, "hitmarks");

    @OriginalMember(owner = "client!sa", name = "x", descriptor = "Lu;")
    private static class135 field2949 = class87.method676((byte) -127, "Take");

    @OriginalMember(owner = "client!sa", name = "F", descriptor = "I")
    public static int field2957 = 0;

    @OriginalMember(owner = "client!sa", name = "O", descriptor = "Z")
    public static boolean field2966 = false;

    @OriginalMember(owner = "client!sa", name = "J", descriptor = "Lu;")
    public static class135 field2961 = class87.method676((byte) -49, "Verbindung mit Update)2Server)3)3)3");

    @OriginalMember(owner = "client!sa", name = "U", descriptor = "Lu;")
    private static class135 field2971 = class87.method676((byte) -108, "Enter name:");

    @OriginalMember(owner = "client!sa", name = "K", descriptor = "Lu;")
    public static class135 field2962 = field2971;

    @OriginalMember(owner = "client!sa", name = "T", descriptor = "Lu;")
    public static class135 field2970 = field2949;

    @OriginalMember(owner = "client!sa", name = "z", descriptor = "I")
    public static int field2951;

    @OriginalMember(owner = "client!sa", name = "A", descriptor = "I")
    public static int field2952;

    @OriginalMember(owner = "client!sa", name = "C", descriptor = "I")
    public static int field2954;

    @OriginalMember(owner = "client!sa", name = "D", descriptor = "I")
    public static int field2955;

    @OriginalMember(owner = "client!sa", name = "E", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!sa", name = "G", descriptor = "I")
    public static int field2958;

    @OriginalMember(owner = "client!sa", name = "H", descriptor = "I")
    public static int field2959;

    @OriginalMember(owner = "client!sa", name = "I", descriptor = "I")
    public static int field2960;

    @OriginalMember(owner = "client!sa", name = "L", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!sa", name = "P", descriptor = "I")
    public static int field2967;

    @OriginalMember(owner = "client!sa", name = "R", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!sa", name = "V", descriptor = "I")
    public static int field2972;

    @OriginalMember(owner = "client!sa", name = "X", descriptor = "I")
    public static int field2974;

    @OriginalMember(owner = "client!sa", name = "W", descriptor = "Lh;")
    public static class49 field2973;

    @OriginalMember(owner = "client!sa", name = "N", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field2965;

    @OriginalMember(owner = "client!sa", name = "B", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field2953;

    @OriginalMember(owner = "client!sa", name = "S", descriptor = "[Lbc;")
    public static class11[] field2969;

    @OriginalMember(owner = "client!sa", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2956;
        return true;
    }

    @OriginalMember(owner = "client!sa", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field2955;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
    public static final Class method972(String arg0, int arg1) throws ClassNotFoundException {
        ++field2959;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else {
            if (arg1 > -120) {
                method973(90);
            }
            if (arg0.equals("Z")) {
                return Boolean.TYPE;
            } else if (arg0.equals("F")) {
                return Float.TYPE;
            } else if (arg0.equals("D")) {
                return Double.TYPE;
            } else {
                return arg0.equals("C") ? Character.TYPE : Class.forName(arg0);
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "(I)V")
    public static void method973(int arg0) {
        field2969 = null;
        field2971 = null;
        if (arg0 != -65) {
            method974(110, false, (byte[]) null, -7, -24, 110, -128, -108, (class99[]) null, 0);
        }
        field2948 = null;
        field2946 = null;
        field2973 = null;
        field2970 = null;
        field2962 = null;
        field2950 = null;
        field2961 = null;
        field2949 = null;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IZ[BIIIII[Lob;I)V")
    public static final void method974(int arg0, boolean arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class99[] arg8, int arg9) {
        if (arg1) {
            method974(-90, true, (byte[]) null, 82, 59, -47, -103, 47, (class99[]) null, -95);
        }
        ++field2954;
        for (int var10 = 0; ~var10 > -9; ++var10) {
            for (int var15 = 0; var15 < 8; ++var15) {
                if (arg9 + var10 > 0 && arg9 + var10 < 103 && ~(arg3 + var15) < -1 && ~(arg3 + var15) > -104) {
                    arg8[arg6].field2391[arg9 + var10][arg3 + var15] = class4.method19(arg8[arg6].field2391[arg9 + var10][arg3 + var15], -16777217);
                }
            }
        }
        class59 var11 = new class59(arg2);
        for (int var12 = 0; ~var12 > -5; ++var12) {
            for (int var13 = 0; ~var13 > -65; ++var13) {
                for (int var14 = 0; var14 < 64; ++var14) {
                    if (arg0 == var12 && arg7 <= var13 && ~(arg7 + 8) < ~var13 && arg4 <= var14 && ~(arg4 + 8) < ~var14) {
                        class148.method1216(0, -50, class4.method18(7 & var14, arg5, 7 & var13, (byte) 123) + arg3, arg5, 0, arg6, var11, arg9 + class48.method359(arg5, 7 & var13, false, 7 & var14));
                    } else {
                        class148.method1216(0, -50, -1, 0, 0, 0, var11, -1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIILjava/awt/Component;)V")
    public final void method93(int arg0, int arg1, int arg2, Component arg3) {
        super.field2921 = new int[arg0 * arg1 - -1];
        ++field2967;
        super.field2925 = arg0;
        super.field2922 = arg1;
        this.field2965 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field2930 = arg3.createImage(this);
        this.method975(true);
        arg3.prepareImage(super.field2930, this);
        this.method975(true);
        arg3.prepareImage(super.field2930, this);
        this.method975(true);
        arg3.prepareImage(super.field2930, this);
        if (arg2 != 22) {
            this.addConsumer((ImageConsumer) null);
        }
        this.method966(-49);
    }

    @OriginalMember(owner = "client!sa", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field2951;
    }

    @OriginalMember(owner = "client!sa", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field2963;
        return this.field2953 == arg0;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Z)V")
    private final synchronized void method975(boolean arg0) {
        ++field2972;
        if (!arg0) {
            field2964 = 116;
        }
        if (this.field2953 != null) {
            this.field2953.setPixels(0, 0, super.field2925, super.field2922, this.field2965, super.field2921, 0, super.field2925);
            this.field2953.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZIILg;Lg;)Lua;")
    public static final class136 method976(boolean arg0, int arg1, int arg2, class43 arg3, class43 arg4) {
        ++field2968;
        boolean var5 = true;
        if (arg2 != 7) {
            method973(-25);
        }
        int[] var6 = arg4.method318(arg1, 0);
        for (int var7 = 0; ~var6.length < ~var7; ++var7) {
            byte[] var8 = arg4.method334(1663, arg1, var6[var7]);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = (var8[0] & 255) << 8 | 255 & var8[1];
                byte[] var10;
                if (arg0) {
                    var10 = arg3.method334(arg2 + 1656, 0, var9);
                } else {
                    var10 = arg3.method334(arg2 + 1656, var9, 0);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (!var5) {
            return null;
        } else {
            try {
                return new class136(arg4, arg3, arg1, arg0);
            } catch (Exception var11) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field2960;
        this.field2953 = arg0;
        arg0.setDimensions(super.field2925, super.field2922);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field2965);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public final void method94(int arg0, int arg1, Graphics arg2, int arg3) {
        ++field2974;
        if (arg0 == -17740) {
            this.method975(true);
            arg2.drawImage(super.field2930, arg3, arg1, this);
        }
    }

    @OriginalMember(owner = "client!sa", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field2958;
        if (this.field2953 == arg0) {
            this.field2953 = null;
        }
    }
}
