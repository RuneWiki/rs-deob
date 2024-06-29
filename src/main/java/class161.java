import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class161 extends class496 implements class47 {

    @OriginalMember(owner = "client!h", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!h", name = "u", descriptor = "Lvr;")
    private class306 field2322 = new class306();

    @OriginalMember(owner = "client!h", name = "M", descriptor = "I")
    private int field2339 = 4096;

    @OriginalMember(owner = "client!h", name = "N", descriptor = "I")
    private int field2340 = 4096;

    @OriginalMember(owner = "client!h", name = "K", descriptor = "Lqo;")
    private class141 field2337 = new class141(4);

    @OriginalMember(owner = "client!h", name = "Q", descriptor = "Z")
    private boolean field2343 = false;

    @OriginalMember(owner = "client!h", name = "L", descriptor = "Lia;")
    private class23 field2338;

    @OriginalMember(owner = "client!h", name = "v", descriptor = "[I")
    private static int[] field2323 = new int[Math.max(Math.max(80, 20), 24573)];

    @OriginalMember(owner = "client!h", name = "z", descriptor = "[I")
    public static int[] field2327 = new int[6];

    @OriginalMember(owner = "client!h", name = "w", descriptor = "[I")
    private static int[] field2324 = field2323;

    @OriginalMember(owner = "client!h", name = "E", descriptor = "[B")
    private static byte[] field2332 = new byte[8191];

    @OriginalMember(owner = "client!h", name = "D", descriptor = "[F")
    private static float[] field2331 = new float[20];

    @OriginalMember(owner = "client!h", name = "C", descriptor = "[I")
    public static int[] field2330 = field2323;

    @OriginalMember(owner = "client!h", name = "y", descriptor = "[F")
    private static float[] field2326 = field2331;

    @OriginalMember(owner = "client!h", name = "B", descriptor = "[I")
    private static int[] field2329 = field2323;

    @OriginalMember(owner = "client!h", name = "x", descriptor = "[I")
    private static int[] field2325 = new int[8191];

    @OriginalMember(owner = "client!h", name = "A", descriptor = "Ljava/lang/Boolean;")
    private static Boolean field2328 = Boolean.FALSE;

    @OriginalMember(owner = "client!h", name = "F", descriptor = "[I")
    private static int[] field2333 = new int[8191];

    @OriginalMember(owner = "client!h", name = "H", descriptor = "[S")
    private static short[] field2334 = new short[8191];

    @OriginalMember(owner = "client!h", name = "P", descriptor = "I")
    private int field2342;

    @OriginalMember(owner = "client!h", name = "I", descriptor = "Lla;")
    private class293 field2335;

    @OriginalMember(owner = "client!h", name = "t", descriptor = "Lba;")
    private class79 field2321;

    @OriginalMember(owner = "client!h", name = "J", descriptor = "Ljava/awt/Canvas;")
    private Canvas field2336;

    @OriginalMember(owner = "client!h", name = "O", descriptor = "[Lma;")
    private class446[] field2341;

    @OriginalMember(owner = "client!h", name = "B", descriptor = "(Lm;II)V")
    private final native void method1034(class373 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!h", name = "d", descriptor = "()I")
    public final native int method1035();

    @OriginalMember(owner = "client!h", name = "Y", descriptor = "(Ll;)V")
    private final native void method1036(class195 arg0);

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lvo;Z)V")
    private final void method1037(class258 arg0, boolean arg1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        for (class386 var8 = (class386) arg0.field3603.method2573(true); var8 != null; var8 = (class386) arg0.field3603.method2574(102)) {
            field2324[var3++] = var8.field5887;
            field2324[var3++] = var8.field5874;
            field2324[var3++] = var8.field5875;
            field2333[var4++] = var8.field5883;
            field2334[var6++] = (short) var8.field5885;
            field2325[var5++] = var8.field5881;
            if (arg1) {
                field2332[var7++] = var8.field5886;
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II[I[I)Lea;")
    public final class15 method1038(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class89(this, this.field2321, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIII)V")
    public final void method1039(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!h", name = "u", descriptor = "()Z")
    public final boolean method1040() {
        return true;
    }

    @OriginalMember(owner = "client!h", name = "ZA", descriptor = "()V")
    private final void method1041() {
        System.gc();
        System.runFinalization();
        class342.method2199(true);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lvo;)V")
    public final void method1042(class258 arg0) {
        this.method1037(arg0, false);
        this.method1060().method2694(this, field2324, field2333, field2325, field2334, arg0.field3603.method2568((byte) -68));
    }

    @OriginalMember(owner = "client!h", name = "f", descriptor = "()Z")
    public final boolean method1043() {
        return true;
    }

    @OriginalMember(owner = "client!h", name = "S", descriptor = "()V")
    public final native void method1044();

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V")
    public final void method1045(int arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!h", name = "pa", descriptor = "(IIII)V")
    public final native void method1046(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lc;Lvo;Lia;Lmn;I)V")
    public final void method1047(class201 arg0, class258 arg1, class23 arg2, class159 arg3, int arg4) {
        this.method1037(arg1, true);
        if (arg3 == null) {
            this.method1060().method2687(this, arg0, arg2, (int[]) null, arg4, field2324, field2333, field2325, field2334, field2332, arg1.field3603.method2568((byte) -68), field2330);
        } else {
            field2327[5] = 0;
            this.method1060().method2687(this, arg0, arg2, field2327, arg4, field2324, field2333, field2325, field2334, field2332, arg1.field3603.method2568((byte) -68), field2330);
            arg3.field2314 = field2327[0];
            arg3.field2317 = field2327[1];
            arg3.field2318 = field2327[2];
            arg3.field2319 = field2327[3];
            arg3.field2316 = field2327[4];
            arg3.field2315 = field2327[5] != 0;
        }
        class39 var6 = (class39) arg0;
        var6.method313(0, arg2);
    }

    @OriginalMember(owner = "client!h", name = "u", descriptor = "([I)V")
    public final native void method1048(int[] arg0);

    @OriginalMember(owner = "client!h", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1049(Canvas arg0) {
        if (this.field2336 == arg0) {
            this.method1082((Canvas) null);
        }
        class293 var2 = (class293) this.field2337.method943((long) arg0.hashCode(), -1);
        if (var2 != null) {
            var2.method2785((byte) -120);
        }
        var2.method1897();
    }

    @OriginalMember(owner = "client!h", name = "VA", descriptor = "(I[I[F)V")
    private final native void method1050(int arg0, int[] arg1, float[] arg2);

    @OriginalMember(owner = "client!h", name = "P", descriptor = "(Lla;)V")
    private final native void method1051(class293 arg0);

    @OriginalMember(owner = "client!h", name = "j", descriptor = "()Z")
    public final boolean method1052() {
        return false;
    }

    @OriginalMember(owner = "client!h", name = "M", descriptor = "(I)V")
    public final native void method1053(int arg0);

    @OriginalMember(owner = "client!h", name = "xa", descriptor = "()I")
    public final native int method1054();

    @OriginalMember(owner = "client!h", name = "ia", descriptor = "(III[I)V")
    public final native void method1055(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!h", name = "s", descriptor = "()Z")
    public final boolean method1056() {
        return true;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIILea;II)V")
    public final void method1057(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class15 arg6, int arg7, int arg8) {
        this.method1100(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!h", name = "ya", descriptor = "()V")
    public final native void method218();

    @OriginalMember(owner = "client!h", name = "e", descriptor = "()V")
    public final void method1058() {
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II[[I[[IIII)Lna;")
    public final class206 method1059(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class132(this, this.field2321, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!h", name = "D", descriptor = "()Lma;")
    public final class446 method1060() {
        for (int var1 = 0; var1 < this.field2342; ++var1) {
            if (this.field2341[var1].field6621 == Thread.currentThread()) {
                return this.field2341[var1];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!h", name = "I", descriptor = "()V")
    private final native void method1061();

    @OriginalMember(owner = "client!h", name = "a", descriptor = "([Lc;Lia;[Lmn;I)V")
    public final void method1062(class201[] arg0, class23 arg1, class159[] arg2, int arg3) {
        if (arg2 == null) {
            this.method1060().method2693(this, arg0, arg1, (int[]) null, -1, arg3);
        } else {
            class159 var5 = arg2[0];
            field2327[5] = 0;
            this.method1060().method2693(this, arg0, arg1, field2327, -1, arg3);
            var5.field2314 = field2327[0];
            var5.field2317 = field2327[1];
            var5.field2318 = field2327[2];
            var5.field2319 = field2327[3];
            var5.field2316 = field2327[4];
            var5.field2315 = field2327[5] != 0;
        }
    }

    @OriginalMember(owner = "client!h", name = "O", descriptor = "(IIIII)V")
    public final native void method1063(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!h", name = "m", descriptor = "(Lia;)V")
    public final native void method1064(class23 arg0);

    @OriginalMember(owner = "client!h", name = "b", descriptor = "()Z")
    public final boolean method1065() {
        return false;
    }

    @OriginalMember(owner = "client!h", name = "z", descriptor = "()V")
    public final void method1066() {
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)V")
    public final void method1067(boolean arg0) {
    }

    @OriginalMember(owner = "client!h", name = "g", descriptor = "()I")
    public final native int method1068();

    @OriginalMember(owner = "client!h", name = "W", descriptor = "()I")
    public final native int method1069();

    @OriginalMember(owner = "client!h", name = "i", descriptor = "()Z")
    public final boolean method1070() {
        return true;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIF)Ldd;")
    public final class471 method1071(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return new class85(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!h", name = "f", descriptor = "(I)V")
    public final void method1072(int arg0) {
        this.field2342 = arg0;
        this.field2341 = new class446[this.field2342];
        for (int var2 = 0; var2 < this.field2342; ++var2) {
            this.field2341[var2] = new class446(this, this.field2339, this.field2340);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIII)V")
    public final void method1073(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method1060().method2689(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(IIIIII)V")
    public final void method1074(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1116(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!h", name = "C", descriptor = "()V")
    public final void method1075() {
        int var1 = 0;
        while (var1 < 9) {
            try {
                this.field2335.method1895();
                return;
            } catch (Exception var2) {
                class106.method710(200L, (byte) 6);
                ++var1;
            }
        }
        this.field2335.method1895();
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lro;IIII)Lc;")
    public final class201 method1076(class192 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class39(this, this.field2321, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lm;Lhu;)V")
    public class161(int arg0, Canvas arg1, class373 arg2, class469 arg3) {
        super(arg0, arg2);
        try {
            if (!field2328) {
                if (arg3 != null) {
                    arg3.method2796(this.getClass(), false);
                    field2328 = Boolean.TRUE;
                } else {
                    System.loadLibrary("jawt");
                    System.loadLibrary("sw3d");
                    field2328 = Boolean.TRUE;
                }
            }
            if (!field2328) {
                throw new RuntimeException("");
            } else {
                this.method1034(super.field7256, 0, 0);
                class220.method1492((byte) -125, true, false);
                this.field2343 = true;
                if (arg1 != null) {
                    this.method1090(arg1);
                    this.method1082(arg1);
                }
                this.field2338 = new class521();
                this.method1064(new class521());
                this.method1072(1);
                this.method1105(0);
            }
        } catch (Throwable var5) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!h", name = "l", descriptor = "()Z")
    public final boolean method1077() {
        return true;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "([Lc;Lvo;Lia;[Lmn;I)V")
    public final void method1078(class201[] arg0, class258 arg1, class23 arg2, class159[] arg3, int arg4) {
        this.method1037(arg1, true);
        if (arg3 == null) {
            this.method1060().method2691(this, arg0, arg2, (int[]) null, arg4, field2324, field2333, field2325, field2334, field2332, arg1.field3603.method2568((byte) -68), field2330);
        } else {
            class159 var6 = arg3[0];
            field2327[5] = 0;
            this.method1060().method2691(this, arg0, arg2, field2327, arg4, field2324, field2333, field2325, field2334, field2332, arg1.field3603.method2568((byte) -68), field2330);
            var6.field2314 = field2327[0];
            var6.field2317 = field2327[1];
            var6.field2318 = field2327[2];
            var6.field2319 = field2327[3];
            var6.field2316 = field2327[4];
            var6.field2315 = field2327[5] != 0;
        }
        int var7 = 0;
        for (int var8 = 0; var8 < arg0.length; ++var8) {
            if (arg0[var8] != null) {
                class39 var9 = (class39) arg0[var8];
                var9.method313(var7, arg2);
                if (var9.field614 != null) {
                    var7 += var9.field614.length * 9;
                }
                if (var9.field615 != null) {
                    var7 += var9.field615.length * 3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "da", descriptor = "(IIIII)V")
    public final native void method1079(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!h", name = "j", descriptor = "(ILea;II)V")
    public final native void method1080(int arg0, class15 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lmc;Lmc;FLmc;)Lmc;")
    public final class242 method1081(class242 arg0, class242 arg1, float arg2, class242 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1082(Canvas arg0) {
        if (arg0 != null) {
            class293 var2 = (class293) this.field2337.method943((long) arg0.hashCode(), -1);
            this.field2336 = arg0;
            this.field2335 = var2;
            this.method1051(var2);
        } else {
            this.field2336 = null;
            this.field2335 = null;
            this.method1051((class293) null);
        }
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1083(Canvas arg0) {
        class293 var2 = (class293) this.field2337.method943((long) arg0.hashCode(), -1);
        Dimension var3 = arg0.getSize();
        var2.method1894(arg0, var3.width, var3.height);
        if (arg0 != null && this.field2336 == arg0) {
            this.method1082(arg0);
        }
    }

    @OriginalMember(owner = "client!h", name = "k", descriptor = "()I")
    public final int method1084() {
        return 4;
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "()V")
    public final void method1085() {
    }

    @OriginalMember(owner = "client!h", name = "aa", descriptor = "(IIIIII[BII)V")
    public final native void method1086(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!h", name = "o", descriptor = "(FF)V")
    public final native void method1087(float arg0, float arg1);

    @OriginalMember(owner = "client!h", name = "p", descriptor = "()Lia;")
    public final class23 method1088() {
        return this.field2338;
    }

    @OriginalMember(owner = "client!h", name = "r", descriptor = "()Z")
    public final boolean method1089() {
        return false;
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1090(Canvas arg0) {
        class293 var2 = (class293) this.field2337.method943((long) arg0.hashCode(), -1);
        if (var2 == null) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            }
            try {
                Class var3 = Class.forName("java.awt.Canvas");
                Method var4 = var3.getMethod("setIgnoreRepaint", Boolean.TYPE);
                var4.invoke(arg0, Boolean.TRUE);
            } catch (Exception var6) {
            }
            class293 var5 = new class293(this, arg0);
            this.field2337.method940((long) arg0.hashCode(), -83, var5);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method1091(Rectangle[] arg0, int arg1) {
        int var3 = 0;
        while (var3 < 9) {
            try {
                for (int var4 = 0; var4 < arg1; ++var4) {
                    Rectangle var5 = arg0[var4];
                    if (var5.width > 0 && var5.height > 0) {
                        this.field2335.method1896(var5.x, var5.y, var5.width, var5.height);
                    }
                }
                return;
            } catch (Exception var8) {
                class106.method710(200L, (byte) 6);
                ++var3;
            }
        }
        for (int var6 = 0; var6 < arg1; ++var6) {
            Rectangle var7 = arg0[var6];
            if (var7.width > 0 && var7.height > 0) {
                this.field2335.method1896(var7.x, var7.y, var7.width, var7.height);
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "()Lia;")
    public final class23 method1092() {
        return new class521();
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lmc;)V")
    public final void method1093(class242 arg0) {
    }

    @OriginalMember(owner = "client!h", name = "h", descriptor = "()Z")
    public final boolean method1094() {
        return true;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lse;[Lrl;Z)Loa;")
    public final class33 method1095(class4 arg0, class476[] arg1, boolean arg2) {
        return arg2 ? new class451(this, this.field2321, arg0, arg1, (class191[]) null) : new class447(this, this.field2321, arg0, arg1, (class191[]) null);
    }

    @OriginalMember(owner = "client!h", name = "ua", descriptor = "(F)V")
    public final native void method1096(float arg0);

    @OriginalMember(owner = "client!h", name = "a", descriptor = "([IIIII)Lf;")
    public final class191 method1097(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class28(this, this.field2321, arg0, arg1, arg2, arg3, arg4) : new class506(this, this.field2321, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class28(this, this.field2321, arg0, arg1, arg2, arg3, arg4) : new class506(this, this.field2321, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method1098(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!h", name = "B", descriptor = "()V")
    public final void method1099() {
        for (class79 var1 = (class79) this.field2322.method1970(64); var1 != null; var1 = (class79) this.field2322.method1960(24)) {
            var1.method515();
        }
        this.field2322.method1959((byte) 113);
        this.method1061();
        if (this.field2343) {
            class525.method3112(true, false, -50);
            this.field2343 = false;
        }
    }

    @OriginalMember(owner = "client!h", name = "ta", descriptor = "(IIIIIILea;II)V")
    private final native void method1100(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class15 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!h", name = "l", descriptor = "(SBBZZZBBBIIZZ)V")
    private final native void method1101(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12);

    @OriginalMember(owner = "client!h", name = "IA", descriptor = "(IIII)[I")
    public final native int[] method1102(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!h", name = "fa", descriptor = "(IIII)V")
    public final native void method1103(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!h", name = "w", descriptor = "()F")
    public final native float method1104();

    @OriginalMember(owner = "client!h", name = "e", descriptor = "(I)V")
    public final void method1105(int arg0) {
        this.field2341[arg0].method2700();
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I[Ldd;)V")
    public final void method1106(int arg0, class471[] arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < arg0; ++var4) {
            field2329[var3++] = arg1[var4].method2827(23087);
            field2329[var3++] = arg1[var4].method2825(45);
            field2329[var3++] = arg1[var4].method2832(15);
            field2329[var3++] = arg1[var4].method2830(123);
            field2326[var4] = arg1[var4].method2826(-1);
            field2329[var3++] = arg1[var4].method2833(false);
        }
        this.method1050(arg0, field2329, field2326);
    }

    @OriginalMember(owner = "client!h", name = "va", descriptor = "()V")
    public final native void method1107();

    @OriginalMember(owner = "client!h", name = "ba", descriptor = "(IIII)V")
    public final native void method1108(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!h", name = "o", descriptor = "()Z")
    public final boolean method1109() {
        return false;
    }

    @OriginalMember(owner = "client!h", name = "Z", descriptor = "(IIII)V")
    public final native void method1110(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!h", name = "FA", descriptor = "()I")
    public final native int method1111();

    @OriginalMember(owner = "client!h", name = "NA", descriptor = "(IIIIII)V")
    public final native void method1112(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!h", name = "A", descriptor = "()Ljava/lang/Object;")
    private final Object method1113() {
        return new class155();
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(Z)V")
    public final void method1114(boolean arg0) {
    }

    @OriginalMember(owner = "client!h", name = "la", descriptor = "()F")
    public final native float method1115();

    @OriginalMember(owner = "client!h", name = "K", descriptor = "(IIIIII)V")
    private final native void method1116(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lrl;Z)Lf;")
    public final class191 method1117(class476 arg0, boolean arg1) {
        int[] var3 = arg0.field6929;
        byte[] var4 = arg0.field6927;
        int var5 = arg0.field6933;
        int var6 = arg0.field6928;
        class191 var7;
        if (arg1 && arg0.field6925 == null) {
            var7 = new class387(this, this.field2321, var3, var4, 0, arg0.field6933, arg0.field6933, arg0.field6928);
        } else {
            int var8 = var5 * var6;
            int[] var9 = new int[var8];
            byte[] var10 = arg0.field6925;
            if (var10 != null) {
                for (int var11 = 0; var11 < var6; ++var11) {
                    int var12 = var5 * var11;
                    for (int var13 = 0; var13 < var5; ++var13) {
                        var9[var12 + var13] = var3[var4[var12 + var13] & 255] | var10[var12 + var13] << 24;
                    }
                }
                var7 = new class28(this, this.field2321, var9, 0, var5, var5, var6);
            } else {
                boolean var14 = false;
                for (int var15 = 0; var15 < var8; ++var15) {
                    int var16 = arg0.field6929[var4[var15] & 255];
                    if (var16 >>> 24 != 255) {
                        var14 = true;
                    }
                    var9[var15] = var16;
                }
                if (var14) {
                    var7 = new class28(this, this.field2321, var9, 0, arg0.field6933, arg0.field6933, arg0.field6928);
                } else {
                    var7 = new class506(this, this.field2321, var9, 0, arg0.field6933, arg0.field6933, arg0.field6928);
                }
            }
        }
        var7.method221(arg0.field6931, arg0.field6926, arg0.field6930, arg0.field6932);
        return var7;
    }

    @OriginalMember(owner = "client!h", name = "V", descriptor = "(III)V")
    public final native void method1118(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!h", name = "i", descriptor = "(I)V")
    public final void method1119(int arg0) {
        class342.method2199(true);
        this.method1136(arg0);
        for (class79 var2 = (class79) this.field2322.method1970(64); var2 != null; var2 = (class79) this.field2322.method1960(24)) {
            var2.method516();
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(FFF)V")
    public final void method1120(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!h", name = "x", descriptor = "()V")
    public final void method1121() {
    }

    @OriginalMember(owner = "client!h", name = "U", descriptor = "(IIIII)V")
    public final native void method1122(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!h", name = "SA", descriptor = "(IIIIII)Z")
    public final native boolean method1123(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!h", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method218();
    }

    @OriginalMember(owner = "client!h", name = "y", descriptor = "()Z")
    public final boolean method1124() {
        return false;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIII)V")
    public final void method1125(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1122(arg0, arg1, arg2, arg4, arg5);
        this.method1122(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method1079(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
        this.method1079(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
    }

    @OriginalMember(owner = "client!h", name = "na", descriptor = "(I)V")
    public final native void method1126(int arg0);

    @OriginalMember(owner = "client!h", name = "GA", descriptor = "(IIII)V")
    public final native void method1127(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!h", name = "MA", descriptor = "(S)Z")
    private final boolean method1128(short arg0) {
        class373 var2 = super.field7256;
        synchronized (super.field7256) {
            if (!super.field7256.method1556(true, arg0)) {
                return false;
            } else {
                class263 var4 = super.field7256.method1558(arg0, (byte) 121);
                if (var4 == null) {
                    return false;
                } else {
                    int[] var6;
                    if (var4.field3665 && var4.field3672) {
                        var6 = super.field7256.method1552(0.7F, arg0, true, 128, true, 128);
                    } else {
                        var6 = super.field7256.method1551(true, arg0, 128, 128, 0.7F, 19881);
                    }
                    this.method1135(arg0, var4.field3660, var4.field3661, var4.field3672, var4.field3665, var4.field3663, var4.field3664, var4.field3655, var4.field3671, var4.field3668, var4.field3666, var4.field3667, var4.field3674, var6);
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(I)Ll;")
    public final class195 method1129(int arg0) {
        class79 var2 = new class79(this, arg0);
        this.field2322.method1958(var2, 0);
        return var2;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II)I")
    public final int method1130(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!h", name = "g", descriptor = "(I)V")
    public final void method1131(int arg0) {
        this.field2341[arg0].method2684();
    }

    @OriginalMember(owner = "client!h", name = "t", descriptor = "()Z")
    public final boolean method1132() {
        return false;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Ll;)V")
    public final void method1133(class195 arg0) {
        this.field2321 = (class79) arg0;
        this.method1036(arg0);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIZ)Lf;")
    public final class191 method1134(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return arg4 ? new class28(this, this.field2321, arg0, arg1, arg2, arg3) : new class506(this, this.field2321, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!h", name = "f", descriptor = "(SBBZZZBBBIIZZ[I)V")
    private final native void method1135(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12, int[] arg13);

    @OriginalMember(owner = "client!h", name = "ja", descriptor = "(I)V")
    private final native void method1136(int arg0);

    @OriginalMember(owner = "client!h", name = "JA", descriptor = "(II)V")
    public final native void method1137(int arg0, int arg1);

    @OriginalMember(owner = "client!h", name = "v", descriptor = "()Z")
    public final boolean method1138() {
        return true;
    }

    @OriginalMember(owner = "client!h", name = "XA", descriptor = "(IFFFFF)V")
    public final native void method1139(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(IIIIII)Lmc;")
    public final class242 method1140(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(II)I")
    public final int method1141(int arg0, int arg1) {
        int var3 = arg0 & 1048575;
        int var4 = arg1 & 1048575;
        return var3 & var4 ^ var4;
    }

    @OriginalMember(owner = "client!h", name = "EA", descriptor = "(S)Z")
    private final boolean method1142(short arg0) {
        synchronized (this) {
            class263 var3 = super.field7256.method1558(arg0, (byte) 115);
            if (var3 == null) {
                return false;
            } else {
                this.method1101(arg0, var3.field3660, var3.field3661, var3.field3672, var3.field3665, var3.field3663, var3.field3664, var3.field3655, var3.field3671, var3.field3668, var3.field3666, var3.field3667, var3.field3674);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "m", descriptor = "()V")
    public final void method1143() {
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(Z)V")
    public final void method1144(boolean arg0) {
    }

    @OriginalMember(owner = "client!h", name = "q", descriptor = "()Z")
    public final boolean method1145() {
        return true;
    }

    @OriginalMember(owner = "client!h", name = "n", descriptor = "()Z")
    public final boolean method1146() {
        return false;
    }
}
