import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class469 extends class162 implements class276 {

    @OriginalMember(owner = "client!h", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!h", name = "y", descriptor = "Lvp;")
    private class123 field6911 = new class123();

    @OriginalMember(owner = "client!h", name = "C", descriptor = "I")
    private int field6915 = 4096;

    @OriginalMember(owner = "client!h", name = "J", descriptor = "I")
    private int field6921 = 4096;

    @OriginalMember(owner = "client!h", name = "B", descriptor = "Lwa;")
    private class433 field6914 = new class433(4);

    @OriginalMember(owner = "client!h", name = "N", descriptor = "Z")
    private boolean field6924 = false;

    @OriginalMember(owner = "client!h", name = "D", descriptor = "Lia;")
    private class414 field6916;

    @OriginalMember(owner = "client!h", name = "q", descriptor = "[I")
    private static int[] field6903 = new int[Math.max(Math.max(80, 20), 24573)];

    @OriginalMember(owner = "client!h", name = "t", descriptor = "[I")
    private static int[] field6906 = new int[8191];

    @OriginalMember(owner = "client!h", name = "s", descriptor = "[S")
    private static short[] field6905 = new short[8191];

    @OriginalMember(owner = "client!h", name = "w", descriptor = "Ljava/lang/Boolean;")
    private static Boolean field6909 = Boolean.FALSE;

    @OriginalMember(owner = "client!h", name = "v", descriptor = "[I")
    public static int[] field6908 = field6903;

    @OriginalMember(owner = "client!h", name = "G", descriptor = "[I")
    public static int[] field6918 = new int[6];

    @OriginalMember(owner = "client!h", name = "I", descriptor = "[I")
    private static int[] field6920 = new int[8191];

    @OriginalMember(owner = "client!h", name = "A", descriptor = "[F")
    private static float[] field6913 = new float[20];

    @OriginalMember(owner = "client!h", name = "z", descriptor = "[I")
    private static int[] field6912 = field6903;

    @OriginalMember(owner = "client!h", name = "x", descriptor = "[B")
    private static byte[] field6910 = new byte[8191];

    @OriginalMember(owner = "client!h", name = "H", descriptor = "[I")
    private static int[] field6919 = field6903;

    @OriginalMember(owner = "client!h", name = "u", descriptor = "[F")
    private static float[] field6907 = field6913;

    @OriginalMember(owner = "client!h", name = "M", descriptor = "I")
    private int field6923;

    @OriginalMember(owner = "client!h", name = "r", descriptor = "Lba;")
    private class262 field6904;

    @OriginalMember(owner = "client!h", name = "L", descriptor = "Lla;")
    private class313 field6922;

    @OriginalMember(owner = "client!h", name = "F", descriptor = "Ljava/awt/Canvas;")
    private Canvas field6917;

    @OriginalMember(owner = "client!h", name = "O", descriptor = "[Lma;")
    private class10[] field6925;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II)I")
    public final int method1051(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!h", name = "GA", descriptor = "(IIII)V")
    public final native void method1050(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!h", name = "S", descriptor = "()V")
    public final native void method1116();

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIZ)Lf;")
    public final class529 method1067(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return arg4 ? new class395(this, this.field6904, arg0, arg1, arg2, arg3) : new class15(this, this.field6904, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!h", name = "ba", descriptor = "(IIII)V")
    public final native void method1021(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!h", name = "XA", descriptor = "(IFFFFF)V")
    public final native void method1049(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!h", name = "ua", descriptor = "(F)V")
    public final native void method1111(float arg0);

    @OriginalMember(owner = "client!h", name = "va", descriptor = "()V")
    public final native void method1112();

    @OriginalMember(owner = "client!h", name = "r", descriptor = "()Z")
    public final boolean method1096() {
        return false;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lc;Lpo;Lia;Lvk;I)V")
    public final void method1055(class121 arg0, class389 arg1, class414 arg2, class247 arg3, int arg4) {
        this.method2801(arg1, true);
        if (arg3 == null) {
            this.method2802().method62(this, arg0, arg2, (int[]) null, arg4, field6919, field6920, field6906, field6905, field6910, arg1.field5869.method1471(-30828), field6908);
        } else {
            field6918[5] = 0;
            this.method2802().method62(this, arg0, arg2, field6918, arg4, field6919, field6920, field6906, field6905, field6910, arg1.field5869.method1471(-30828), field6908);
            arg3.field3633 = field6918[0];
            arg3.field3634 = field6918[1];
            arg3.field3632 = field6918[2];
            arg3.field3630 = field6918[3];
            arg3.field3631 = field6918[4];
            arg3.field3629 = field6918[5] != 0;
        }
        class144 var6 = (class144) arg0;
        var6.method954(0, arg2);
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(Z)V")
    public final void method1110(boolean arg0) {
    }

    @OriginalMember(owner = "client!h", name = "I", descriptor = "()V")
    private final native void method2800();

    @OriginalMember(owner = "client!h", name = "a", descriptor = "()V")
    public final void method1019() {
        int var1 = 0;
        while (var1 < 9) {
            try {
                this.field6922.method1951();
                return;
            } catch (Exception var2) {
                class246.method1659((byte) 117, 200L);
                ++var1;
            }
        }
        this.field6922.method1951();
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(II)I")
    public final int method1122(int arg0, int arg1) {
        int var3 = arg0 & 1048575;
        int var4 = arg1 & 1048575;
        return var3 & var4 ^ var4;
    }

    @OriginalMember(owner = "client!h", name = "SA", descriptor = "(IIIIII)Z")
    public final native boolean method1105(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(IIIIII)Ltl;")
    public final class436 method1065(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!h", name = "la", descriptor = "()F")
    public final native float method1026();

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Ll;)V")
    public final void method1117(class16 arg0) {
        this.field6904 = (class262) arg0;
        this.method2805(arg0);
    }

    @OriginalMember(owner = "client!h", name = "h", descriptor = "()V")
    public final void method1041() {
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIF)Lkt;")
    public final class107 method1084(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return new class221(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!h", name = "v", descriptor = "()Z")
    public final boolean method1109() {
        return false;
    }

    @OriginalMember(owner = "client!h", name = "ya", descriptor = "()V")
    public final native void method60();

    @OriginalMember(owner = "client!h", name = "d", descriptor = "()I")
    public final native int method1076();

    @OriginalMember(owner = "client!h", name = "f", descriptor = "()Z")
    public final boolean method1037() {
        return true;
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1071(Canvas arg0) {
        class313 var2 = (class313) this.field6914.method2605(false, (long) arg0.hashCode());
        if (var2 == null) {
            try {
                Class var3 = Class.forName("java.awt.Canvas");
                Method var4 = var3.getMethod("setIgnoreRepaint", Boolean.TYPE);
                var4.invoke(arg0, Boolean.TRUE);
            } catch (Exception var6) {
            }
            class313 var5 = new class313(this, arg0);
            this.field6914.method2606(var5, (long) arg0.hashCode(), 0);
        }
    }

    @OriginalMember(owner = "client!h", name = "o", descriptor = "(FF)V")
    public final native void method1039(float arg0, float arg1);

    @OriginalMember(owner = "client!h", name = "B", descriptor = "()Z")
    public final boolean method1125() {
        return false;
    }

    @OriginalMember(owner = "client!h", name = "m", descriptor = "(Lia;)V")
    public final native void method1082(class414 arg0);

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lpo;Z)V")
    private final void method2801(class389 arg0, boolean arg1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        for (class479 var8 = (class479) arg0.field5869.method1473(16777215); var8 != null; var8 = (class479) arg0.field5869.method1472(27554)) {
            field6919[var3++] = var8.field7041;
            field6919[var3++] = var8.field7030;
            field6919[var3++] = var8.field7031;
            field6920[var4++] = var8.field7039;
            field6905[var6++] = (short) var8.field7036;
            field6906[var5++] = var8.field7032;
            if (arg1) {
                field6910[var7++] = var8.field7034;
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "E", descriptor = "()Lma;")
    public final class10 method2802() {
        for (int var1 = 0; var1 < this.field6923; ++var1) {
            if (this.field6925[var1].field130 == Thread.currentThread()) {
                return this.field6925[var1];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!h", name = "j", descriptor = "(ILea;II)V")
    public final native void method1034(int arg0, class381 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!h", name = "u", descriptor = "()Z")
    public final boolean method1107() {
        return true;
    }

    @OriginalMember(owner = "client!h", name = "g", descriptor = "(I)V")
    public final void method1123(int arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method1080(Rectangle[] arg0, int arg1) {
        int var3 = 0;
        while (var3 < 9) {
            try {
                for (int var4 = 0; var4 < arg1; ++var4) {
                    Rectangle var5 = arg0[var4];
                    if (var5.width > 0 && var5.height > 0) {
                        this.field6922.method1952(var5.x, var5.y, var5.width, var5.height);
                    }
                }
                return;
            } catch (Exception var8) {
                class246.method1659((byte) 117, 200L);
                ++var3;
            }
        }
        for (int var6 = 0; var6 < arg1; ++var6) {
            Rectangle var7 = arg0[var6];
            if (var7.width > 0 && var7.height > 0) {
                this.field6922.method1952(var7.x, var7.y, var7.width, var7.height);
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "w", descriptor = "()F")
    public final native float method1020();

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(I)V")
    public final void method1035(int arg0) {
        class236.method1600(false);
        this.method2813(arg0);
        for (class262 var2 = (class262) this.field6911.method816(117); var2 != null; var2 = (class262) this.field6911.method812(113)) {
            var2.method1742();
        }
    }

    @OriginalMember(owner = "client!h", name = "f", descriptor = "(SBBZZZBBBIIZZ[I)V")
    private final native void method2803(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12, int[] arg13);

    @OriginalMember(owner = "client!h", name = "d", descriptor = "(I)V")
    public final void method1100(int arg0) {
        this.field6925[arg0].method57();
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lgu;Z)Lf;")
    public final class529 method1030(class408 arg0, boolean arg1) {
        int[] var3 = arg0.field6152;
        byte[] var4 = arg0.field6146;
        int var5 = arg0.field6147;
        int var6 = arg0.field6151;
        class529 var7;
        if (arg1 && arg0.field6149 == null) {
            var7 = new class345(this, this.field6904, var3, var4, 0, arg0.field6147, arg0.field6147, arg0.field6151);
        } else {
            int var8 = var5 * var6;
            int[] var9 = new int[var8];
            byte[] var10 = arg0.field6149;
            if (var10 != null) {
                for (int var11 = 0; var11 < var6; ++var11) {
                    int var12 = var5 * var11;
                    for (int var13 = 0; var13 < var5; ++var13) {
                        var9[var12 + var13] = var3[var4[var12 + var13] & 255] | var10[var12 + var13] << 24;
                    }
                }
                var7 = new class395(this, this.field6904, var9, 0, var5, var5, var6);
            } else {
                boolean var14 = false;
                for (int var15 = 0; var15 < var8; ++var15) {
                    int var16 = arg0.field6152[var4[var15] & 255];
                    if (var16 >>> 24 != 255) {
                        var14 = true;
                    }
                    var9[var15] = var16;
                }
                if (var14) {
                    var7 = new class395(this, this.field6904, var9, 0, arg0.field6147, arg0.field6147, arg0.field6151);
                } else {
                    var7 = new class15(this, this.field6904, var9, 0, arg0.field6147, arg0.field6147, arg0.field6151);
                }
            }
        }
        var7.method96(arg0.field6148, arg0.field6144, arg0.field6150, arg0.field6145);
        return var7;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I[Lkt;)V")
    public final void method1068(int arg0, class107[] arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < arg0; ++var4) {
            field6912[var3++] = arg1[var4].method654((byte) 31);
            field6912[var3++] = arg1[var4].method663(0);
            field6912[var3++] = arg1[var4].method656(128);
            field6912[var3++] = arg1[var4].method661((byte) -87);
            field6907[var4] = arg1[var4].method658(0);
            field6912[var3++] = arg1[var4].method660(28825);
        }
        this.method2804(arg0, field6912, field6907);
    }

    @OriginalMember(owner = "client!h", name = "e", descriptor = "()V")
    public final void method1032() {
    }

    @OriginalMember(owner = "client!h", name = "W", descriptor = "()I")
    public final native int method1060();

    @OriginalMember(owner = "client!h", name = "l", descriptor = "()Z")
    public final boolean method1075() {
        return false;
    }

    @OriginalMember(owner = "client!h", name = "Z", descriptor = "(IIII)V")
    public final native void method1069(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II[I[I)Lea;")
    public final class381 method1093(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class198(this, this.field6904, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "([Lc;Lia;[Lvk;I)V")
    public final void method1031(class121[] arg0, class414 arg1, class247[] arg2, int arg3) {
        if (arg2 == null) {
            this.method2802().method52(this, arg0, arg1, (int[]) null, -1, arg3);
        } else {
            class247 var5 = arg2[0];
            field6918[5] = 0;
            this.method2802().method52(this, arg0, arg1, field6918, -1, arg3);
            var5.field3633 = field6918[0];
            var5.field3634 = field6918[1];
            var5.field3632 = field6918[2];
            var5.field3630 = field6918[3];
            var5.field3631 = field6918[4];
            var5.field3629 = field6918[5] != 0;
        }
    }

    @OriginalMember(owner = "client!h", name = "VA", descriptor = "(I[I[F)V")
    private final native void method2804(int arg0, int[] arg1, float[] arg2);

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(Z)V")
    public final void method1070(boolean arg0) {
    }

    @OriginalMember(owner = "client!h", name = "da", descriptor = "(IIIII)V")
    public final native void method1023(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!h", name = "u", descriptor = "([I)V")
    public final native void method1062(int[] arg0);

    @OriginalMember(owner = "client!h", name = "Y", descriptor = "(Ll;)V")
    private final native void method2805(class16 arg0);

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method1101(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!h", name = "pa", descriptor = "(IIII)V")
    public final native void method1098(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!h", name = "ZA", descriptor = "()V")
    private final void method2806() {
        System.gc();
        System.runFinalization();
        class236.method1600(false);
    }

    @OriginalMember(owner = "client!h", name = "ta", descriptor = "(IIIIIILea;II)V")
    private final native void method2807(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class381 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!h", name = "K", descriptor = "(IIIIII)V")
    private final native void method2808(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Ltl;)V")
    public final void method1083(class436 arg0) {
    }

    @OriginalMember(owner = "client!h", name = "O", descriptor = "(IIIII)V")
    public final native void method1048(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!h", name = "na", descriptor = "(I)V")
    public final native void method1022(int arg0);

    @OriginalMember(owner = "client!h", name = "FA", descriptor = "()I")
    public final native int method1114();

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lje;[Lgu;Z)Loa;")
    public final class489 method1081(class275 arg0, class408[] arg1, boolean arg2) {
        return arg2 ? new class194(this, this.field6904, arg0, arg1, (class529[]) null) : new class181(this, this.field6904, arg0, arg1, (class529[]) null);
    }

    @OriginalMember(owner = "client!h", name = "y", descriptor = "()Z")
    public final boolean method1119() {
        return true;
    }

    @OriginalMember(owner = "client!h", name = "g", descriptor = "()I")
    public final native int method1099();

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lqc;IIII)Lc;")
    public final class121 method1118(class521 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class144(this, this.field6904, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!h", name = "x", descriptor = "()Lia;")
    public final class414 method1115() {
        return this.field6916;
    }

    @OriginalMember(owner = "client!h", name = "q", descriptor = "()V")
    public final void method1094() {
        for (class262 var1 = (class262) this.field6911.method816(127); var1 != null; var1 = (class262) this.field6911.method812(99)) {
            var1.method1741();
        }
        this.field6911.method817(-4);
        this.method2800();
        if (this.field6924) {
            class318.method1985((byte) 79, false, true);
            this.field6924 = false;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Ltl;Ltl;FLtl;)Ltl;")
    public final class436 method1086(class436 arg0, class436 arg1, float arg2, class436 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!h", name = "MA", descriptor = "(S)Z")
    private final boolean method2809(short arg0) {
        class126 var2 = super.field2379;
        synchronized (super.field2379) {
            if (!super.field2379.method839(arg0, (byte) 46)) {
                return false;
            } else {
                class321 var4 = super.field2379.method838(true, arg0);
                if (var4 == null) {
                    return false;
                } else {
                    int[] var6;
                    if (var4.field4593 && var4.field4596) {
                        var6 = super.field2379.method837(128, true, 128, 0.7F, (byte) -116, arg0);
                    } else {
                        var6 = super.field2379.method836(true, 128, 128, 21, arg0, 0.7F);
                    }
                    this.method2803(arg0, var4.field4604, var4.field4594, var4.field4596, var4.field4593, var4.field4600, var4.field4583, var4.field4581, var4.field4585, var4.field4602, var4.field4592, var4.field4586, var4.field4597, var6);
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "([IIIII)Lf;")
    public final class529 method1078(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class395(this, this.field6904, arg0, arg1, arg2, arg3, arg4) : new class15(this, this.field6904, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class395(this, this.field6904, arg0, arg1, arg2, arg3, arg4) : new class15(this, this.field6904, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(FFF)V")
    public final void method1040(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)V")
    public final void method1053(boolean arg0) {
    }

    @OriginalMember(owner = "client!h", name = "j", descriptor = "()I")
    public final int method1056() {
        return 4;
    }

    @OriginalMember(owner = "client!h", name = "o", descriptor = "()V")
    public final void method1089() {
    }

    @OriginalMember(owner = "client!h", name = "A", descriptor = "()Ljava/lang/Object;")
    private final Object method2810() {
        return new class328();
    }

    @OriginalMember(owner = "client!h", name = "i", descriptor = "()V")
    public final void method1054() {
    }

    @OriginalMember(owner = "client!h", name = "aa", descriptor = "(IIIIII[BII)V")
    public final native void method1059(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!h", name = "t", descriptor = "()Z")
    public final boolean method1106() {
        return true;
    }

    @OriginalMember(owner = "client!h", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1085(Canvas arg0) {
        if (this.field6917 == arg0) {
            this.method1066((Canvas) null);
        }
        class313 var2 = (class313) this.field6914.method2605(false, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method2049(-58);
        }
        var2.method1950();
    }

    @OriginalMember(owner = "client!h", name = "NA", descriptor = "(IIIIII)V")
    public final native void method1036(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!h", name = "d", descriptor = "(IIIIII)V")
    public final void method1104(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1092(arg0, arg1, arg2, arg4, arg5);
        this.method1092(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method1023(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
        this.method1023(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1066(Canvas arg0) {
        if (arg0 != null) {
            class313 var2 = (class313) this.field6914.method2605(false, (long) arg0.hashCode());
            this.field6917 = arg0;
            this.field6922 = var2;
            this.method2811(var2);
        } else {
            this.field6917 = null;
            this.field6922 = null;
            this.method2811((class313) null);
        }
    }

    @OriginalMember(owner = "client!h", name = "ia", descriptor = "(III[I)V")
    public final native void method1074(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIII)V")
    public final void method1047(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2802().method69(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!h", name = "p", descriptor = "()Z")
    public final boolean method1091() {
        return true;
    }

    @OriginalMember(owner = "client!h", name = "P", descriptor = "(Lla;)V")
    private final native void method2811(class313 arg0);

    @OriginalMember(owner = "client!h", name = "b", descriptor = "()V")
    public final void method1024() {
    }

    @OriginalMember(owner = "client!h", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method60();
    }

    @OriginalMember(owner = "client!h", name = "V", descriptor = "(III)V")
    public final native void method1052(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!h", name = "z", descriptor = "()Z")
    public final boolean method1121() {
        return true;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIII)V")
    public final void method1033(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lpo;)V")
    public final void method1095(class389 arg0) {
        this.method2801(arg0, false);
        this.method2802().method67(this, field6919, field6920, field6906, field6905, arg0.field5869.method1471(-30828));
    }

    @OriginalMember(owner = "client!h", name = "m", descriptor = "()Z")
    public final boolean method1079() {
        return true;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)Ll;")
    public final class16 method1028(int arg0) {
        class262 var2 = new class262(this, arg0);
        this.field6911.method809(var2, false);
        return var2;
    }

    @OriginalMember(owner = "client!h", name = "B", descriptor = "(Lm;II)V")
    private final native void method2812(class126 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!h", name = "k", descriptor = "()Z")
    public final boolean method1073() {
        return false;
    }

    @OriginalMember(owner = "client!h", name = "M", descriptor = "(I)V")
    public final native void method1044(int arg0);

    @OriginalMember(owner = "client!h", name = "xa", descriptor = "()I")
    public final native int method1057();

    @OriginalMember(owner = "client!h", name = "ja", descriptor = "(I)V")
    private final native void method2813(int arg0);

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(I)V")
    public final void method1043(int arg0) {
        this.field6923 = arg0;
        this.field6925 = new class10[this.field6923];
        for (int var2 = 0; var2 < this.field6923; ++var2) {
            this.field6925[var2] = new class10(this, this.field6921, this.field6915);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "([Lc;Lpo;Lia;[Lvk;I)V")
    public final void method1038(class121[] arg0, class389 arg1, class414 arg2, class247[] arg3, int arg4) {
        this.method2801(arg1, true);
        if (arg3 == null) {
            this.method2802().method64(this, arg0, arg2, (int[]) null, arg4, field6919, field6920, field6906, field6905, field6910, arg1.field5869.method1471(-30828), field6908);
        } else {
            class247 var6 = arg3[0];
            field6918[5] = 0;
            this.method2802().method64(this, arg0, arg2, field6918, arg4, field6919, field6920, field6906, field6905, field6910, arg1.field5869.method1471(-30828), field6908);
            var6.field3633 = field6918[0];
            var6.field3634 = field6918[1];
            var6.field3632 = field6918[2];
            var6.field3630 = field6918[3];
            var6.field3631 = field6918[4];
            var6.field3629 = field6918[5] != 0;
        }
        int var7 = 0;
        for (int var8 = 0; var8 < arg0.length; ++var8) {
            if (arg0[var8] != null) {
                class144 var9 = (class144) arg0[var8];
                var9.method954(var7, arg2);
                if (var9.field2148 != null) {
                    var7 += var9.field2148.length * 9;
                }
                if (var9.field2149 != null) {
                    var7 += var9.field2149.length * 3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "()Z")
    public final boolean method1025() {
        return false;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1042(Canvas arg0) {
        class313 var2 = (class313) this.field6914.method2605(false, (long) arg0.hashCode());
        Dimension var3 = arg0.getSize();
        var2.method1949(arg0, var3.width, var3.height);
        if (arg0 != null && this.field6917 == arg0) {
            this.method1066(arg0);
        }
    }

    @OriginalMember(owner = "client!h", name = "U", descriptor = "(IIIII)V")
    public final native void method1092(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!h", name = "fa", descriptor = "(IIII)V")
    public final native void method1120(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!h", name = "C", descriptor = "()Lia;")
    public final class414 method1126() {
        return new class136();
    }

    @OriginalMember(owner = "client!h", name = "IA", descriptor = "(IIII)[I")
    public final native int[] method1063(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II[[I[[IIII)Lna;")
    public final class35 method1061(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class218(this, this.field6904, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!h", name = "JA", descriptor = "(II)V")
    public final native void method1102(int arg0, int arg1);

    @OriginalMember(owner = "client!h", name = "n", descriptor = "()Z")
    public final boolean method1088() {
        return false;
    }

    @OriginalMember(owner = "client!h", name = "EA", descriptor = "(S)Z")
    private final boolean method2814(short arg0) {
        synchronized (this) {
            class321 var3 = super.field2379.method838(true, arg0);
            if (var3 == null) {
                return false;
            } else {
                this.method2815(arg0, var3.field4604, var3.field4594, var3.field4596, var3.field4593, var3.field4600, var3.field4583, var3.field4581, var3.field4585, var3.field4602, var3.field4592, var3.field4586, var3.field4597);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lm;Lji;)V")
    public class469(int arg0, Canvas arg1, class126 arg2, class432 arg3) {
        super(arg0, arg2);
        try {
            if (!field6909) {
                if (arg3 != null) {
                    arg3.method2590((byte) 96, this.getClass());
                    field6909 = Boolean.TRUE;
                } else {
                    System.loadLibrary("jawt");
                    System.loadLibrary("sw3d");
                    field6909 = Boolean.TRUE;
                }
            }
            if (!field6909) {
                throw new RuntimeException("");
            } else {
                this.method2812(super.field2379, 0, 0);
                class493.method2956(126, false, true);
                this.field6924 = true;
                if (arg1 != null) {
                    this.method1071(arg1);
                    this.method1066(arg1);
                }
                this.field6916 = new class136();
                this.method1082(new class136());
                this.method1043(1);
                this.method1103(0);
            }
        } catch (Throwable var5) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!h", name = "s", descriptor = "()Z")
    public final boolean method1097() {
        return true;
    }

    @OriginalMember(owner = "client!h", name = "e", descriptor = "(IIIIII)V")
    public final void method1113(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2808(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!h", name = "e", descriptor = "(I)V")
    public final void method1103(int arg0) {
        this.field6925[arg0].method66();
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIILea;II)V")
    public final void method1058(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class381 arg6, int arg7, int arg8) {
        this.method2807(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!h", name = "l", descriptor = "(SBBZZZBBBIIZZ)V")
    private final native void method2815(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12);
}
