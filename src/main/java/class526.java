import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class526 extends class206 implements class28 {

    @OriginalMember(owner = "client!a", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!a", name = "r", descriptor = "Z")
    private boolean field7359 = false;

    @OriginalMember(owner = "client!a", name = "t", descriptor = "Lui;")
    private class193 field7361 = new class193();

    @OriginalMember(owner = "client!a", name = "u", descriptor = "I")
    private int field7362 = 4096;

    @OriginalMember(owner = "client!a", name = "F", descriptor = "I")
    private int field7373 = 4096;

    @OriginalMember(owner = "client!a", name = "z", descriptor = "Lpt;")
    private class451 field7367 = new class451(4);

    @OriginalMember(owner = "client!a", name = "M", descriptor = "Z")
    private boolean field7380 = false;

    @OriginalMember(owner = "client!a", name = "H", descriptor = "Lm;")
    private class163 field7375;

    @OriginalMember(owner = "client!a", name = "s", descriptor = "[I")
    private static int[] field7360 = new int[Math.max(Math.max(80, 20), 24573)];

    @OriginalMember(owner = "client!a", name = "B", descriptor = "[I")
    private static int[] field7369 = field7360;

    @OriginalMember(owner = "client!a", name = "C", descriptor = "[I")
    private static int[] field7370 = new int[8191];

    @OriginalMember(owner = "client!a", name = "w", descriptor = "[I")
    public static int[] field7364 = new int[6];

    @OriginalMember(owner = "client!a", name = "I", descriptor = "[I")
    public static int[] field7376 = field7360;

    @OriginalMember(owner = "client!a", name = "y", descriptor = "[B")
    private static byte[] field7366 = new byte[8191];

    @OriginalMember(owner = "client!a", name = "G", descriptor = "[S")
    private static short[] field7374 = new short[8191];

    @OriginalMember(owner = "client!a", name = "E", descriptor = "[I")
    private static int[] field7372 = new int[8191];

    @OriginalMember(owner = "client!a", name = "A", descriptor = "[F")
    private static float[] field7368 = new float[20];

    @OriginalMember(owner = "client!a", name = "J", descriptor = "[I")
    private static int[] field7377 = field7360;

    @OriginalMember(owner = "client!a", name = "v", descriptor = "[F")
    private static float[] field7363 = field7368;

    @OriginalMember(owner = "client!a", name = "L", descriptor = "I")
    private int field7379;

    @OriginalMember(owner = "client!a", name = "q", descriptor = "Lc;")
    private class158 field7358;

    @OriginalMember(owner = "client!a", name = "x", descriptor = "Lm;")
    private class163 field7365;

    @OriginalMember(owner = "client!a", name = "D", descriptor = "Lb;")
    private class278 field7371;

    @OriginalMember(owner = "client!a", name = "K", descriptor = "[Lv;")
    private class495[] field7378;

    @OriginalMember(owner = "client!a", name = "v", descriptor = "()V", line = 2)
    public final void method1166() {
    }

    @OriginalMember(owner = "client!a", name = "y", descriptor = "()Lfd;", line = 5)
    public final class448 method1172() {
        return new class448(0, "SSE", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIILpa;II)V", line = 8)
    public final void method1178(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class309 arg6, int arg7, int arg8) {
        this.method2998(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lm;)V", line = 12)
    public final void method1160(class163 arg0) {
        this.field7365 = arg0;
        this.method3002(arg0);
    }

    @OriginalMember(owner = "client!a", name = "i", descriptor = "()V", line = 18)
    public final void method1123() {
        if (this.field7371 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field7371.method1573();
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lei;IIII)Lr;", line = 31)
    public final class157 method277(class152 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class12(this, this.field7358, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!a", name = "j", descriptor = "()Lm;", line = 34)
    public final class163 method1126() {
        return this.field7375;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 38)
    public final void method1139(Rectangle[] arg0, int arg1) {
        if (this.field7371 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field7371.method1575(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "([Lr;Lm;[Lcf;I)V", line = 51)
    public final void method273(class157[] arg0, class163 arg1, class517[] arg2, int arg3) {
        if (arg2 == null) {
            this.method3001().method2856(this, arg0, arg1, (int[]) null, -1, arg3);
        } else {
            class517 var5 = arg2[0];
            field7364[5] = 0;
            this.method3001().method2856(this, arg0, arg1, field7364, -1, arg3);
            var5.field7290 = field7364[0];
            var5.field7292 = field7364[1];
            var5.field7294 = field7364[2];
            var5.field7291 = field7364[3];
            var5.field7293 = field7364[4];
            var5.field7289 = field7364[5] != 0;
        }
    }

    @OriginalMember(owner = "client!a", name = "o", descriptor = "()V", line = 68)
    public final void method1137() {
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lu;)V", line = 71)
    public final void method1176(class64 arg0) {
        this.field7358 = (class158) arg0;
        this.method2987(arg0);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lmv;)V", line = 74)
    public final void method1189(class313 arg0) {
    }

    @OriginalMember(owner = "client!a", name = "f", descriptor = "()V", line = 77)
    public final void method1109() {
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(Z)V", line = 80)
    public final void method1181(boolean arg0) {
    }

    @OriginalMember(owner = "client!a", name = "Q", descriptor = "()Ljava/lang/Object;", line = 84)
    private final Object method2989() {
        return new class453(this);
    }

    @OriginalMember(owner = "client!a", name = "q", descriptor = "()Z", line = 92)
    public final boolean method1143() {
        return false;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V", line = 95)
    public final void method1138(int arg0) {
        class49.method263((byte) -1);
        this.method2990(arg0);
        for (class158 var2 = (class158) this.field7361.method1050((byte) 73); var2 != null; var2 = (class158) this.field7361.method1047(-7962)) {
            var2.method871();
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIII)Lmv;", line = 108)
    public final class313 method1136(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lfc;[Ldp;Z)Lra;", line = 114)
    public final class90 method1153(class216 arg0, class3[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field15;
            var5[var7] = arg1[var7].field14;
            if (arg1[var7].field9 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
            } else {
                return new class248(this, this.field7358, arg0, arg1, (class52[]) null);
            }
        } else if (var6) {
            throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
        } else {
            return new class231(this, this.field7358, arg0, arg1, (class52[]) null);
        }
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "()Z", line = 151)
    public final boolean method1105() {
        return true;
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 156)
    public final void method1149(Canvas arg0) {
        if (this.field7371.field3658 == arg0) {
            this.method274((Canvas) null);
        }
        class278 var2 = (class278) this.field7367.method2645((long) arg0.hashCode(), (byte) -121);
        if (var2 != null) {
            var2.method3187(true);
            var2.method1579();
        }
    }

    @OriginalMember(owner = "client!a", name = "k", descriptor = "()Z", line = 171)
    public final boolean method271() {
        return false;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II)I", line = 177)
    public final int method1128(int arg0, int arg1) {
        int var3 = arg0 & 1048575;
        int var4 = arg1 & 1048575;
        return var3 & var4 ^ var4;
    }

    @OriginalMember(owner = "client!a", name = "GA", descriptor = "(S)Z", line = 188)
    private final boolean method2992(short arg0) {
        class17 var2 = super.field2481;
        synchronized (super.field2481) {
            if (!super.field2481.method118(arg0, (byte) 72)) {
                return false;
            } else {
                class217 var4 = super.field2481.method119(-114, arg0);
                if (var4 == null) {
                    return false;
                } else {
                    int[] var6;
                    if (!var4.field2640) {
                        var6 = super.field2481.method120(128, true, 0.7F, arg0, 128, 96);
                    } else {
                        var6 = super.field2481.method116(0.7F, -115, 128, true, 128, arg0);
                    }
                    this.method2999(arg0, var4.field2656, var4.field2644, var4.field2650, var4.field2646, var4.field2652, var4.field2651, var4.field2660, var4.field2657, var4.field2641, var4.field2658, var4.field2659, var4.field2653, var6);
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ln;)V", line = 212)
    public class526(Canvas arg0, class17 arg1) {
        super(arg1);
        try {
            if (!class136.method757(0, "sw3d")) {
                throw new RuntimeException("");
            } else {
                class49.method259(0);
                this.method2988(super.field2481, 0, 0);
                class355.method1997(false, (byte) -113, true);
                this.field7380 = true;
                this.field7375 = new class361();
                this.method1160(new class361());
                this.method272(1);
                this.method278(0);
                if (arg0 != null) {
                    this.method1187(arg0);
                    this.method274(arg0);
                }
            }
        } catch (Throwable var3) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!a", name = "p", descriptor = "()Z", line = 238)
    public final boolean method1141() {
        return true;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "()Z", line = 243)
    public final boolean method1104() {
        return false;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "([Lr;Lka;Lm;[Lcf;I)V", line = 246)
    public final void method270(class157[] arg0, class400 arg1, class163 arg2, class517[] arg3, int arg4) {
        this.method2997(arg1, true);
        if (arg3 == null) {
            this.method3001().method2848(this, arg0, arg2, (int[]) null, arg4, field7369, field7372, field7370, field7374, field7366, arg1.field5256.method2380((byte) -48), field7376);
        } else {
            class517 var6 = arg3[0];
            field7364[5] = 0;
            this.method3001().method2848(this, arg0, arg2, field7364, arg4, field7369, field7372, field7370, field7374, field7366, arg1.field5256.method2380((byte) -48), field7376);
            var6.field7290 = field7364[0];
            var6.field7292 = field7364[1];
            var6.field7294 = field7364[2];
            var6.field7291 = field7364[3];
            var6.field7293 = field7364[4];
            var6.field7289 = field7364[5] != 0;
        }
        int var7 = 0;
        for (int var8 = 0; var8 < arg0.length; ++var8) {
            if (arg0[var8] != null) {
                class12 var9 = (class12) arg0[var8];
                var9.method68(var7, arg2);
                if (var9.field90 != null) {
                    var7 += var9.field90.length * 9;
                }
                if (var9.field91 != null) {
                    var7 += var9.field91.length * 3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "l", descriptor = "()V", line = 287)
    public final void method1131() {
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIII)V", line = 291)
    public final void method267(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method3001().method2861(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIII)V", line = 293)
    public final void method1132(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "(I)V", line = 296)
    public final void method1163(int arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I[Lcba;)V", line = 301)
    public final void method1193(int arg0, class469[] arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < arg0; ++var4) {
            field7377[var3++] = arg1[var4].method2731((byte) -96);
            field7377[var3++] = arg1[var4].method2730(-1);
            field7377[var3++] = arg1[var4].method2737((byte) -86);
            field7377[var3++] = arg1[var4].method2735((byte) 114);
            field7363[var4] = arg1[var4].method2734((byte) -37);
            field7377[var3++] = arg1[var4].method2736((byte) -87);
        }
        this.method3003(arg0, field7377, field7363);
    }

    @OriginalMember(owner = "client!a", name = "t", descriptor = "()Z", line = 320)
    public final boolean method1155() {
        return true;
    }

    @OriginalMember(owner = "client!a", name = "D", descriptor = "()Z", line = 323)
    public final boolean method1194() {
        return true;
    }

    @OriginalMember(owner = "client!a", name = "WA", descriptor = "(S)Z", line = 327)
    private final boolean method2995(short arg0) {
        synchronized (this) {
            class217 var3 = super.field2481.method119(-127, arg0);
            if (var3 == null) {
                return false;
            } else {
                this.method3000(arg0, var3.field2656, var3.field2644, var3.field2650, var3.field2646, var3.field2652, var3.field2651, var3.field2660, var3.field2657, var3.field2641, var3.field2658, var3.field2659, var3.field2653);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "B", descriptor = "()Z", line = 338)
    public final boolean method1190() {
        return true;
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(I)V", line = 341)
    public final void method278(int arg0) {
        this.field7378[arg0].method2859();
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lmv;Lmv;FLmv;)Lmv;", line = 344)
    public final class313 method1162(class313 arg0, class313 arg1, float arg2, class313 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(II)I", line = 347)
    public final int method1145(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "()Z", line = 350)
    public final boolean method1100() {
        return true;
    }

    @OriginalMember(owner = "client!a", name = "z", descriptor = "()Z", line = 354)
    public final boolean method1173() {
        return false;
    }

    @OriginalMember(owner = "client!a", name = "XA", descriptor = "()V", line = 357)
    private final void method2996() {
        System.gc();
        System.runFinalization();
        class49.method263((byte) -1);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Z)V", line = 363)
    private final void method2997(class400 arg0, boolean arg1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        for (class272 var8 = (class272) arg0.field5256.method2383(123); var8 != null; var8 = (class272) arg0.field5256.method2384(true)) {
            field7369[var3++] = var8.field3525;
            field7369[var3++] = var8.field3535;
            field7369[var3++] = var8.field3530;
            field7372[var4++] = var8.field3541;
            field7374[var6++] = (short) var8.field3534;
            field7370[var5++] = var8.field3540;
            if (arg1) {
                field7366[var7++] = var8.field3539;
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;)V", line = 394)
    public final void method1140(class400 arg0) {
        this.method2997(arg0, false);
        this.method3001().method2854(this, field7369, field7372, field7370, field7374, arg0.field5256.method2380((byte) -48));
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "([IIIII)Lha;", line = 401)
    public final class52 method1114(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class421(this, this.field7358, arg0, arg1, arg2, arg3, arg4) : new class572(this, this.field7358, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class421(this, this.field7358, arg0, arg1, arg2, arg3, arg4) : new class572(this, this.field7358, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 438)
    public final void method1187(Canvas arg0) {
        class278 var2 = (class278) this.field7367.method2645((long) arg0.hashCode(), (byte) -87);
        if (var2 == null) {
            try {
                Class var3 = Class.forName("java.awt.Canvas");
                Method var4 = var3.getMethod("setIgnoreRepaint", Boolean.TYPE);
                var4.invoke(arg0, Boolean.TRUE);
            } catch (Exception var6) {
            }
            class278 var5 = new class278(this, arg0);
            this.field7367.method2640(1, (long) arg0.hashCode(), var5);
        }
    }

    @OriginalMember(owner = "client!a", name = "e", descriptor = "()Z", line = 457)
    public final boolean method1108() {
        return true;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 464)
    public final void method268(Canvas arg0) {
        class278 var2 = (class278) this.field7367.method2645((long) arg0.hashCode(), (byte) -122);
        Dimension var3 = arg0.getSize();
        var2.method1574(arg0, var3.width, var3.height);
        if (arg0 != null && this.field7371.field3658 == arg0) {
            this.method274(arg0);
        }
    }

    @OriginalMember(owner = "client!a", name = "A", descriptor = "()Z", line = 477)
    public final boolean method1174() {
        return false;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II[I[I)Lpa;", line = 484)
    public final class309 method1148(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class179(this, this.field7358, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!a", name = "r", descriptor = "()Z", line = 487)
    public final boolean method1144() {
        return false;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 494)
    public final void method274(Canvas arg0) {
        if (arg0 != null) {
            class278 var2 = (class278) this.field7367.method2645((long) arg0.hashCode(), (byte) -106);
            this.field7371 = var2;
            this.method2994(var2);
        } else {
            this.field7371 = null;
            this.method2994((class278) null);
        }
    }

    @OriginalMember(owner = "client!a", name = "g", descriptor = "(I)Lu;", line = 510)
    public final class64 method1191(int arg0) {
        class158 var2 = new class158(this, arg0);
        this.field7361.method1040(var2, -94);
        return var2;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ldp;Z)Lha;", line = 517)
    public final class52 method1101(class3 arg0, boolean arg1) {
        int[] var3 = arg0.field13;
        byte[] var4 = arg0.field11;
        int var5 = arg0.field15;
        int var6 = arg0.field14;
        class52 var7;
        if (arg1 && arg0.field9 == null) {
            var7 = new class254(this, this.field7358, var3, var4, 0, arg0.field15, arg0.field15, arg0.field14);
        } else {
            int var8 = var5 * var6;
            int[] var9 = new int[var8];
            byte[] var10 = arg0.field9;
            if (var10 != null) {
                for (int var11 = 0; var11 < var6; ++var11) {
                    int var12 = var5 * var11;
                    for (int var13 = 0; var13 < var5; ++var13) {
                        var9[var12 + var13] = var3[var4[var12 + var13] & 255] | var10[var12 + var13] << 24;
                    }
                }
                var7 = new class421(this, this.field7358, var9, 0, var5, var5, var6);
            } else {
                boolean var14 = false;
                for (int var15 = 0; var15 < var8; ++var15) {
                    int var16 = arg0.field13[var4[var15] & 255];
                    if (var16 >>> 24 != 255) {
                        var14 = true;
                    }
                    var9[var15] = var16;
                }
                if (var14) {
                    var7 = new class421(this, this.field7358, var9, 0, arg0.field15, arg0.field15, arg0.field14);
                } else {
                    var7 = new class572(this, this.field7358, var9, 0, arg0.field15, arg0.field15, arg0.field14);
                }
            }
        }
        var7.method297(arg0.field12, arg0.field10, arg0.field17, arg0.field16);
        return var7;
    }

    @OriginalMember(owner = "client!a", name = "E", descriptor = "()Lv;", line = 595)
    public final class495 method3001() {
        for (int var1 = 0; var1 < this.field7379; ++var1) {
            if (this.field7378[var1].field6889 == Thread.currentThread()) {
                return this.field7378[var1];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!a", name = "h", descriptor = "()I", line = 607)
    public final int method1122() {
        return 4;
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(IIIIII)V", line = 612)
    public final void method1168(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2991(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIF)Lcba;", line = 621)
    public final class469 method1134(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return new class644(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "u", descriptor = "()V", line = 625)
    public final void method1158() {
        if (!this.field7359) {
            this.field7378 = null;
            this.field7371 = null;
            this.field7358 = null;
            this.field7375 = null;
            this.field7367.method2642(true);
            for (class158 var1 = (class158) this.field7361.method1050((byte) 73); var1 != null; var1 = (class158) this.field7361.method1047(-7962)) {
                var1.method870();
            }
            this.field7361.method1048(-7730);
            this.method2993();
            if (this.field7380) {
                class475.method2774(true, false, -1);
                this.field7380 = false;
            }
            this.method2996();
            class49.method262(0);
            this.field7359 = true;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIIIIII)V", line = 657)
    public final void method264(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)V", line = 659)
    public final void method1116(boolean arg0) {
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(IIIIZ)Lha;", line = 662)
    public final class52 method1161(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return arg4 ? new class421(this, this.field7358, arg0, arg1, arg2, arg3) : new class572(this, this.field7358, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!a", name = "C", descriptor = "()V", line = 668)
    public final void method1192() {
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(Z)V", line = 671)
    public final void method1185(boolean arg0) {
    }

    @OriginalMember(owner = "client!a", name = "f", descriptor = "(I)V", line = 674)
    public final void method275(int arg0) {
        this.field7378[arg0].method2860();
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(FFF)V", line = 676)
    public final void method1171(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!a", name = "finalize", descriptor = "()V", line = 680)
    protected final synchronized void finalize() {
        this.method1103((byte) 94);
        if (this.nativeid != 0L) {
            class49.method261(0, this);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lr;Lka;Lm;Lcf;I)V", line = 687)
    public final void method1177(class157 arg0, class400 arg1, class163 arg2, class517 arg3, int arg4) {
        this.method2997(arg1, true);
        if (arg3 == null) {
            this.method3001().method2863(this, arg0, arg2, (int[]) null, arg4, field7369, field7372, field7370, field7374, field7366, arg1.field5256.method2380((byte) -48), field7376);
        } else {
            field7364[5] = 0;
            this.method3001().method2863(this, arg0, arg2, field7364, arg4, field7369, field7372, field7370, field7374, field7366, arg1.field5256.method2380((byte) -48), field7376);
            arg3.field7290 = field7364[0];
            arg3.field7292 = field7364[1];
            arg3.field7294 = field7364[2];
            arg3.field7291 = field7364[3];
            arg3.field7293 = field7364[4];
            arg3.field7289 = field7364[5] != 0;
        }
        class12 var6 = (class12) arg0;
        var6.method68(0, arg2);
    }

    @OriginalMember(owner = "client!a", name = "s", descriptor = "()Lm;", line = 710)
    public final class163 method1150() {
        return new class361();
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V", line = 720)
    public final void method272(int arg0) {
        this.field7379 = arg0;
        this.field7378 = new class495[this.field7379];
        for (int var2 = 0; var2 < this.field7379; ++var2) {
            this.field7378[var2] = new class495(this, this.field7362, this.field7373);
        }
    }

    @OriginalMember(owner = "client!a", name = "g", descriptor = "()V", line = 732)
    public final void method1117() {
    }

    @OriginalMember(owner = "client!a", name = "x", descriptor = "()Z", line = 737)
    public final boolean method1169() {
        return false;
    }

    @OriginalMember(owner = "client!a", name = "m", descriptor = "()Z", line = 744)
    public final boolean method1135() {
        return true;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(IIIIII)V", line = 749)
    public final void method1142(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1130(arg0, arg1, arg2, arg4, arg5);
        this.method1130(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method1110(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
        this.method1110(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II[[I[[IIII)Lsa;", line = 782)
    public final class174 method265(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class233(this, this.field7358, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!a", name = "P", descriptor = "()F")
    public final native float method1167();

    @OriginalMember(owner = "client!a", name = "E", descriptor = "(III)V")
    public final native void method1120(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!a", name = "F", descriptor = "(IIII)V")
    public final native void method1119(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "ea", descriptor = "(Lu;)V")
    private final native void method2987(class64 arg0);

    @OriginalMember(owner = "client!a", name = "Y", descriptor = "(Ln;II)V")
    private final native void method2988(class17 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!a", name = "f", descriptor = "(IIIIII)V")
    public final native void method1133(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!a", name = "ra", descriptor = "()F")
    public final native float method1186();

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(IIII)V")
    public final native void method1179(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "L", descriptor = "(I)V")
    public final native void method1121(int arg0);

    @OriginalMember(owner = "client!a", name = "c", descriptor = "()I")
    public final native int method1175();

    @OriginalMember(owner = "client!a", name = "ba", descriptor = "()I")
    public final native int method1147();

    @OriginalMember(owner = "client!a", name = "HA", descriptor = "(I)V")
    private final native void method2990(int arg0);

    @OriginalMember(owner = "client!a", name = "ta", descriptor = "(II)V")
    public final native void method1184(int arg0, int arg1);

    @OriginalMember(owner = "client!a", name = "NA", descriptor = "(Z)V")
    public final native void method61(boolean arg0);

    @OriginalMember(owner = "client!a", name = "n", descriptor = "()V")
    public final native void method1182();

    @OriginalMember(owner = "client!a", name = "U", descriptor = "()I")
    public final native int method1127();

    @OriginalMember(owner = "client!a", name = "t", descriptor = "(IIIIII)V")
    private final native void method2991(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!a", name = "Z", descriptor = "(I)V")
    public final native void method1156(int arg0);

    @OriginalMember(owner = "client!a", name = "N", descriptor = "(IIII)V")
    public final native void method1107(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "za", descriptor = "(IIIIII[BII)V")
    public final native void method1125(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!a", name = "xa", descriptor = "()V")
    public final native void method1146();

    @OriginalMember(owner = "client!a", name = "w", descriptor = "()V")
    private final native void method2993();

    @OriginalMember(owner = "client!a", name = "MA", descriptor = "(Lb;)V")
    private final native void method2994(class278 arg0);

    @OriginalMember(owner = "client!a", name = "v", descriptor = "(IIII)[I")
    public final native int[] method1111(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "JA", descriptor = "(IIII)V")
    public final native void method1159(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "ca", descriptor = "(IIIIIILpa;II)V")
    private final native void method2998(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class309 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!a", name = "CA", descriptor = "()I")
    public final native int method1129();

    @OriginalMember(owner = "client!a", name = "UA", descriptor = "(IIIII)V")
    public final native void method1130(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!a", name = "d", descriptor = "([I)V")
    public final native void method1183(int[] arg0);

    @OriginalMember(owner = "client!a", name = "G", descriptor = "(ILpa;II)V")
    public final native void method1180(int arg0, class309 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "h", descriptor = "(SBBZZZBBBIIZZ[I)V")
    private final native void method2999(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12, int[] arg13);

    @OriginalMember(owner = "client!a", name = "q", descriptor = "(IIII)V")
    public final native void method1164(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "IA", descriptor = "(III[I)V")
    public final native void method1112(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!a", name = "RA", descriptor = "(SBBZZZBBBIIZZ)V")
    private final native void method3000(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12);

    @OriginalMember(owner = "client!a", name = "YA", descriptor = "()I")
    public final native int method1157();

    @OriginalMember(owner = "client!a", name = "B", descriptor = "(IIIIII)Z")
    public final native boolean method1102(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!a", name = "TA", descriptor = "(Lm;)V")
    private final native void method3002(class163 arg0);

    @OriginalMember(owner = "client!a", name = "e", descriptor = "(IIIII)V")
    public final native void method1110(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!a", name = "m", descriptor = "(IFFFFF)V")
    public final native void method1188(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!a", name = "oa", descriptor = "(I[I[F)V")
    private final native void method3003(int arg0, int[] arg1, float[] arg2);

    @OriginalMember(owner = "client!a", name = "M", descriptor = "(F)V")
    public final native void method1165(float arg0);

    @OriginalMember(owner = "client!a", name = "A", descriptor = "(IIIII)V")
    public final native void method1124(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!a", name = "la", descriptor = "(FF)V")
    public final native void method1106(float arg0, float arg1);
}
