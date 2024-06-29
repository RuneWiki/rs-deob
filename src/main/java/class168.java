import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class168 extends class562 implements class247 {

    @OriginalMember(owner = "client!l", name = "r", descriptor = "Z")
    private boolean field2395 = false;

    @OriginalMember(owner = "client!l", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!l", name = "t", descriptor = "Lwo;")
    private class445 field2397 = new class445();

    @OriginalMember(owner = "client!l", name = "H", descriptor = "I")
    private int field2411 = 4096;

    @OriginalMember(owner = "client!l", name = "F", descriptor = "I")
    private int field2409 = 4096;

    @OriginalMember(owner = "client!l", name = "E", descriptor = "Lwh;")
    private class546 field2408 = new class546(4);

    @OriginalMember(owner = "client!l", name = "K", descriptor = "Z")
    private boolean field2414 = false;

    @OriginalMember(owner = "client!l", name = "D", descriptor = "Lq;")
    private class487 field2407;

    @OriginalMember(owner = "client!l", name = "q", descriptor = "[I")
    private static int[] field2394 = new int[Math.max(Math.max(104, 20), 24573)];

    @OriginalMember(owner = "client!l", name = "s", descriptor = "[F")
    private static float[] field2396 = new float[20];

    @OriginalMember(owner = "client!l", name = "v", descriptor = "[I")
    public static int[] field2399 = field2394;

    @OriginalMember(owner = "client!l", name = "x", descriptor = "[B")
    private static byte[] field2401 = new byte[8191];

    @OriginalMember(owner = "client!l", name = "C", descriptor = "[F")
    private static float[] field2406 = field2396;

    @OriginalMember(owner = "client!l", name = "w", descriptor = "[I")
    private static int[] field2400 = new int[8191];

    @OriginalMember(owner = "client!l", name = "u", descriptor = "[I")
    private static int[] field2398 = new int[8191];

    @OriginalMember(owner = "client!l", name = "z", descriptor = "[I")
    private static int[] field2403 = field2394;

    @OriginalMember(owner = "client!l", name = "I", descriptor = "[I")
    private static int[] field2412 = field2394;

    @OriginalMember(owner = "client!l", name = "J", descriptor = "[S")
    private static short[] field2413 = new short[8191];

    @OriginalMember(owner = "client!l", name = "A", descriptor = "[I")
    public static int[] field2404 = new int[6];

    @OriginalMember(owner = "client!l", name = "L", descriptor = "I")
    public int field2415;

    @OriginalMember(owner = "client!l", name = "y", descriptor = "Lm;")
    private class106 field2402;

    @OriginalMember(owner = "client!l", name = "G", descriptor = "Lta;")
    private class453 field2410;

    @OriginalMember(owner = "client!l", name = "B", descriptor = "Lq;")
    private class487 field2405;

    @OriginalMember(owner = "client!l", name = "M", descriptor = "[Lqa;")
    private class173[] field2416;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II[[I[[IIII)Li;")
    public final class270 method1037(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class214(this, this.field2402, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V")
    public final void method1038(int arg0) {
        this.field2415 = arg0;
        this.field2416 = new class173[this.field2415];
        for (int var2 = 0; var2 < this.field2415; ++var2) {
            this.field2416[var2] = new class173(this, this.field2409, this.field2411);
        }
    }

    @OriginalMember(owner = "client!l", name = "Q", descriptor = "(IIIIIILua;II)V")
    private final native void method1039(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class596 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIZ)Lf;")
    public final class532 method1040(int arg0, int arg1, boolean arg2) {
        return arg2 ? new class518(this, this.field2402, arg0, arg1) : new class639(this, this.field2402, arg0, arg1);
    }

    @OriginalMember(owner = "client!l", name = "ra", descriptor = "(F)V")
    public final native void method1041(float arg0);

    @OriginalMember(owner = "client!l", name = "da", descriptor = "(IIII)V")
    public final native void method1042(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!l", name = "w", descriptor = "(IIIIII)V")
    private final native void method1043(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!l", name = "JA", descriptor = "()V")
    public final native void method1044();

    @OriginalMember(owner = "client!l", name = "AA", descriptor = "(III[I)V")
    public final native void method1045(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIII)V")
    public final void method1046(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method1086().method1185(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!l", name = "EA", descriptor = "(Le;)V")
    private final native void method1047(class381 arg0);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lit;)V")
    public final void method1048(class513 arg0) {
    }

    @OriginalMember(owner = "client!l", name = "va", descriptor = "(I)V")
    public final native void method1049(int arg0);

    @OriginalMember(owner = "client!l", name = "q", descriptor = "()V")
    public final void method1050() {
    }

    @OriginalMember(owner = "client!l", name = "WA", descriptor = "()V")
    private final void method1051() {
        System.gc();
        System.runFinalization();
        class69.method387((byte) 107);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1052(Canvas arg0) {
        class453 var2 = (class453) this.field2408.method3057(1, (long) arg0.hashCode());
        Dimension var3 = arg0.getSize();
        var2.method2551(arg0, var3.width, var3.height);
        if (arg0 != null && this.field2410.field5973 == arg0) {
            this.method1143(arg0);
        }
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(II)I")
    public final int method1053(int arg0, int arg1) {
        int var3 = arg0 & 1048575;
        int var4 = arg1 & 1048575;
        return var3 & var4 ^ var4;
    }

    @OriginalMember(owner = "client!l", name = "BA", descriptor = "()I")
    public final native int method1054();

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIILua;II)V")
    public final void method1055(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class596 arg6, int arg7, int arg8) {
        this.method1039(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method1056(Rectangle[] arg0, int arg1) throws class56 {
        if (this.field2410 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field2410.method2546(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!l", name = "oa", descriptor = "([I)V")
    public final native void method1057(int[] arg0);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Z)V")
    public final void method1058(boolean arg0) {
    }

    @OriginalMember(owner = "client!l", name = "ia", descriptor = "(Lta;)V")
    private final native void method1059(class453 arg0);

    @OriginalMember(owner = "client!l", name = "VA", descriptor = "(IFFFFF)V")
    public final native void method1060(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!l", name = "m", descriptor = "()V")
    public final void method1061() {
    }

    @OriginalMember(owner = "client!l", name = "T", descriptor = "()I")
    public final native int method1062();

    @OriginalMember(owner = "client!l", name = "e", descriptor = "(I)V")
    public final void method1063(int arg0) {
        class69.method387((byte) -124);
        this.method1104(arg0);
        for (class106 var2 = (class106) this.field2397.method2506(68); var2 != null; var2 = (class106) this.field2397.method2505(-109)) {
            var2.method581();
        }
    }

    @OriginalMember(owner = "client!l", name = "YA", descriptor = "(IIII)V")
    public final native void method1064(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!l", name = "C", descriptor = "()Z")
    public final boolean method1065() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "IA", descriptor = "(IIIIII[BII)V")
    public final native void method1066(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!l", name = "fa", descriptor = "()Ljava/lang/Object;")
    private final Object method1067() {
        return new class497(this);
    }

    @OriginalMember(owner = "client!l", name = "h", descriptor = "(IIII)[I")
    public final native int[] method1068(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!l", name = "s", descriptor = "()Z")
    public final boolean method1069() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method1070(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!l", name = "u", descriptor = "()Z")
    public final boolean method1071() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "CA", descriptor = "(IIII)V")
    public final native void method1072(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!l", name = "pa", descriptor = "(III)V")
    public final native void method1073(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!l", name = "d", descriptor = "()Z")
    public final boolean method1074() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "e", descriptor = "()Lq;")
    public final class487 method1075() {
        return new class280();
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIZ)Lf;")
    public final class532 method1076(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return arg4 ? new class518(this, this.field2402, arg0, arg1, arg2, arg3) : new class639(this, this.field2402, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!l", name = "V", descriptor = "(IIII)V")
    public final native void method1077(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(I)Le;")
    public final class381 method1078(int arg0) {
        class106 var2 = new class106(this, arg0);
        this.field2397.method2507(var2, (byte) -128);
        return var2;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(FFF)V")
    public final void method1079(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II)I")
    public final int method1080(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!l", name = "f", descriptor = "(I)V")
    public final void method1081(int arg0) {
        this.field2416[arg0].method1176();
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(I)V")
    public final void method1082(int arg0) {
        this.field2416[arg0].method1182();
    }

    @OriginalMember(owner = "client!l", name = "O", descriptor = "(IIIIII)Z")
    public final native boolean method1083(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!l", name = "B", descriptor = "()Z")
    public final boolean method1084() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "I", descriptor = "(I[I[F)V")
    private final native void method1085(int arg0, int[] arg1, float[] arg2);

    @OriginalMember(owner = "client!l", name = "D", descriptor = "()Lqa;")
    public final class173 method1086() {
        for (int var1 = 0; var1 < this.field2415; ++var1) {
            if (this.field2416[var1].field2447 == Thread.currentThread()) {
                return this.field2416[var1];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "()Z")
    public final boolean method1087() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "la", descriptor = "(IIII)V")
    public final native void method1088(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lcca;IIII)Lda;")
    public final class470 method1089(class250 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class605(this, this.field2402, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!l", name = "GA", descriptor = "(II)V")
    public final native void method1090(int arg0, int arg1);

    @OriginalMember(owner = "client!l", name = "ZA", descriptor = "(Z)V")
    public final native void method1091(boolean arg0);

    @OriginalMember(owner = "client!l", name = "z", descriptor = "()V")
    public final void method1092() {
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(Z)V")
    public final void method1093(boolean arg0) {
    }

    @OriginalMember(owner = "client!l", name = "y", descriptor = "()Z")
    public final boolean method1094() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "FA", descriptor = "(ILua;II)V")
    public final native void method1095(int arg0, class596 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lec;)V")
    public final void method1096(class144 arg0) {
        this.method1116(arg0, false);
        this.method1086().method1183(this, field2412, field2398, field2400, field2413, arg0.field1942.method1880(39));
    }

    @OriginalMember(owner = "client!l", name = "R", descriptor = "()V")
    private final native void method1097();

    @OriginalMember(owner = "client!l", name = "t", descriptor = "()Z")
    public final boolean method1098() {
        return false;
    }

    @OriginalMember(owner = "client!l", name = "i", descriptor = "()Z")
    public final boolean method1099() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "finalize", descriptor = "()V")
    protected final synchronized void finalize() {
        this.method3127(true);
        if (this.nativeid != 0L) {
            class69.method386(-1995, this);
        }
    }

    @OriginalMember(owner = "client!l", name = "p", descriptor = "()Z")
    public final boolean method1100() {
        return false;
    }

    @OriginalMember(owner = "client!l", name = "e", descriptor = "(IIIIII)V")
    public final void method1101(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1043(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!l", name = "e", descriptor = "(IIIII)V")
    public final native void method1102(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!l", name = "A", descriptor = "(S)Z")
    private final boolean method1103(short arg0) {
        synchronized (this) {
            class105 var3 = super.field7682.method2959(123, arg0);
            if (var3 == null) {
                return false;
            } else {
                this.method1124(arg0, var3.field1244, var3.field1263, var3.field1250, var3.field1249, var3.field1256, var3.field1258, var3.field1248, var3.field1255, var3.field1262, var3.field1257, var3.field1254, var3.field1264);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "qa", descriptor = "(I)V")
    private final native void method1104(int arg0);

    @OriginalMember(owner = "client!l", name = "NA", descriptor = "(Lq;)V")
    private final native void method1105(class487 arg0);

    @OriginalMember(owner = "client!l", name = "f", descriptor = "()Z")
    public final boolean method1106() {
        return false;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lf;Z)V")
    public final void method1107(class532 arg0, boolean arg1) {
        if (arg0 instanceof class639) {
            this.method1155((class639) arg0);
        } else if (arg0 instanceof class518) {
            this.method1145((class518) arg0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!l", name = "U", descriptor = "()I")
    public final native int method1108();

    @OriginalMember(owner = "client!l", name = "g", descriptor = "(I)V")
    public final void method1109(int arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!l", name = "v", descriptor = "()[I")
    public final native int[] method1110();

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I[Lqea;)V")
    public final void method1111(int arg0, class392[] arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < arg0; ++var4) {
            field2403[var3++] = arg1[var4].method2258((byte) -41);
            field2403[var3++] = arg1[var4].method2261((byte) 37);
            field2403[var3++] = arg1[var4].method2257(-17895);
            field2403[var3++] = arg1[var4].method2260(2);
            field2406[var4] = arg1[var4].method2259(false);
            field2403[var3++] = arg1[var4].method2263(0);
        }
        this.method1085(arg0, field2403, field2406);
    }

    @OriginalMember(owner = "client!l", name = "n", descriptor = "()Z")
    public final boolean method1112() {
        return false;
    }

    @OriginalMember(owner = "client!l", name = "J", descriptor = "(IIIIII)V")
    public final native void method1113(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!l", name = "o", descriptor = "()V")
    public final void method1114() {
    }

    @OriginalMember(owner = "client!l", name = "OA", descriptor = "(Lfa;II)V")
    private final native void method1115(class522 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lec;Z)V")
    private final void method1116(class144 arg0, boolean arg1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        for (class545 var8 = (class545) arg0.field1942.method1875(2); var8 != null; var8 = (class545) arg0.field1942.method1878(true)) {
            field2412[var3++] = var8.field7451;
            field2412[var3++] = var8.field7448;
            field2412[var3++] = var8.field7456;
            field2398[var4++] = var8.field7454;
            field2413[var6++] = (short) var8.field7444;
            field2400[var5++] = var8.field7447;
            if (arg1) {
                field2401[var7++] = var8.field7446;
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "w", descriptor = "()Z")
    public final boolean method1117() {
        return false;
    }

    @OriginalMember(owner = "client!l", name = "MA", descriptor = "(III[I)V")
    public final native void method1118(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!l", name = "DA", descriptor = "()I")
    public final native int method1119();

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lec;I)V")
    public final void method1120(class144 arg0, int arg1) {
        this.method1116(arg0, false);
        this.method1086().method1183(this, field2412, field2398, field2400, field2413, arg0.field1942.method1880(39));
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(IIIIII)V")
    public final void method1121(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1144(arg0, arg1, arg2, arg4, arg5);
        this.method1144(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method1149(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
        this.method1149(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lfa;)V")
    public class168(Canvas arg0, class522 arg1) {
        super(arg1);
        try {
            if (!class324.method1882("sw3d", -46)) {
                throw new RuntimeException("");
            } else {
                class69.method385(-1);
                this.method1115(super.field7682, 0, 0);
                class413.method2341(-77, true, false);
                this.field2414 = true;
                this.field2407 = new class280();
                this.method1123(new class280());
                this.method1038(1);
                this.method1081(0);
                if (arg0 != null) {
                    this.method1132(arg0);
                    this.method1143(arg0);
                }
            }
        } catch (Throwable var3) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "([IIIII)Lf;")
    public final class532 method1122(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class518(this, this.field2402, arg0, arg1, arg2, arg3, arg4) : new class639(this, this.field2402, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class518(this, this.field2402, arg0, arg1, arg2, arg3, arg4) : new class639(this, this.field2402, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lq;)V")
    public final void method1123(class487 arg0) {
        this.field2405 = arg0;
        this.method1105(arg0);
    }

    @OriginalMember(owner = "client!l", name = "Z", descriptor = "(SBBZZZBBBIIZZ)V")
    private final native void method1124(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12);

    @OriginalMember(owner = "client!l", name = "A", descriptor = "()V")
    public final void method1125() {
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1126(Canvas arg0) {
        if (this.field2410.field5973 == arg0) {
            this.method1143((Canvas) null);
        }
        class453 var2 = (class453) this.field2408.method3057(1, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method242(true);
            var2.method2550();
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "([I)V")
    public final void method1127(int[] arg0) {
        Dimension var2 = this.field2410.field5973.getSize();
        arg0[0] = var2.width;
        arg0[1] = var2.height;
    }

    @OriginalMember(owner = "client!l", name = "UA", descriptor = "(Z)V")
    public final native void method528(boolean arg0);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II[I[I)Lua;")
    public final class596 method1128(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class395(this, this.field2402, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Le;)V")
    public final void method1129(class381 arg0) {
        this.field2402 = (class106) arg0;
        this.method1047(arg0);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Laga;[Ltq;Z)Lla;")
    public final class409 method1130(class658 arg0, class92[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field1132;
            var5[var7] = arg1[var7].field1128;
            if (arg1[var7].field1129 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
            } else {
                return new class673(this, this.field2402, arg0, arg1, (class532[]) null);
            }
        } else if (var6) {
            throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
        } else {
            return new class313(this, this.field2402, arg0, arg1, (class532[]) null);
        }
    }

    @OriginalMember(owner = "client!l", name = "W", descriptor = "(S)Z")
    private final boolean method1131(short arg0) {
        class522 var2 = super.field7682;
        synchronized (super.field7682) {
            if (!super.field7682.method2961(true, arg0)) {
                return false;
            } else {
                class105 var4 = super.field7682.method2959(118, arg0);
                if (var4 == null) {
                    return false;
                } else {
                    int[] var6;
                    if (!var4.field1253) {
                        var6 = super.field7682.method2964(arg0, (byte) 67, 128, true, 0.7F, 128);
                    } else {
                        var6 = super.field7682.method2963(true, 128, true, 128, 0.7F, arg0);
                    }
                    this.method1134(arg0, var4.field1244, var4.field1263, var4.field1250, var4.field1249, var4.field1256, var4.field1258, var4.field1248, var4.field1255, var4.field1262, var4.field1257, var4.field1254, var4.field1264, var6);
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1132(Canvas arg0) {
        class453 var2 = (class453) this.field2408.method3057(1, (long) arg0.hashCode());
        if (var2 == null) {
            try {
                Class var3 = Class.forName("java.awt.Canvas");
                Method var4 = var3.getMethod("setIgnoreRepaint", Boolean.TYPE);
                var4.invoke(arg0, Boolean.TRUE);
            } catch (Exception var6) {
            }
            class453 var5 = new class453(this, arg0);
            this.field2408.method3061(125, (long) arg0.hashCode(), var5);
        }
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "()I")
    public final int method1133() {
        return 4;
    }

    @OriginalMember(owner = "client!l", name = "xa", descriptor = "(SBBZZZBBBIIZZ[I)V")
    private final native void method1134(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12, int[] arg13);

    @OriginalMember(owner = "client!l", name = "g", descriptor = "()Z")
    public final boolean method1135() {
        return true;
    }

    @OriginalMember(owner = "client!l", name = "k", descriptor = "()Lq;")
    public final class487 method1136() {
        return this.field2405;
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "()I")
    public final native int method1137();

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(IIIIII)Lit;")
    public final class513 method1138(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Ltq;Z)Lf;")
    public final class532 method1139(class92 arg0, boolean arg1) {
        int[] var3 = arg0.field1127;
        byte[] var4 = arg0.field1130;
        int var5 = arg0.field1132;
        int var6 = arg0.field1128;
        class532 var7;
        if (arg1 && arg0.field1129 == null) {
            var7 = new class93(this, this.field2402, var3, var4, 0, arg0.field1132, arg0.field1132, arg0.field1128);
        } else {
            int var8 = var5 * var6;
            int[] var9 = new int[var8];
            byte[] var10 = arg0.field1129;
            if (var10 != null) {
                for (int var11 = 0; var11 < var6; ++var11) {
                    int var12 = var5 * var11;
                    for (int var13 = 0; var13 < var5; ++var13) {
                        var9[var12 + var13] = var3[var4[var12 + var13] & 255] | var10[var12 + var13] << 24;
                    }
                }
                var7 = new class518(this, this.field2402, var9, 0, var5, var5, var6);
            } else {
                boolean var14 = false;
                for (int var15 = 0; var15 < var8; ++var15) {
                    int var16 = arg0.field1127[var4[var15] & 255];
                    if (var16 >>> 24 != 255) {
                        var14 = true;
                    }
                    var9[var15] = var16;
                }
                if (var14) {
                    var7 = new class518(this, this.field2402, var9, 0, arg0.field1132, arg0.field1132, arg0.field1128);
                } else {
                    var7 = new class639(this, this.field2402, var9, 0, arg0.field1132, arg0.field1132, arg0.field1128);
                }
            }
        }
        var7.method527(arg0.field1125, arg0.field1126, arg0.field1131, arg0.field1133);
        return var7;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIII)V")
    public final void method1140(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!l", name = "l", descriptor = "()Laa;")
    public final class102 method1141() {
        return new class102(0, "SSE", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!l", name = "h", descriptor = "()V")
    public final void method1142() {
        if (!this.field2395) {
            this.field2416 = null;
            this.field2410 = null;
            this.field2402 = null;
            this.field2407 = null;
            this.field2408.method3063((byte) -41);
            for (class106 var1 = (class106) this.field2397.method2506(68); var1 != null; var1 = (class106) this.field2397.method2505(-121)) {
                var1.method582();
            }
            this.field2397.method2512(-11558);
            this.method1097();
            if (this.field2414) {
                class374.method2146(false, true, false);
                this.field2414 = false;
            }
            this.method1051();
            class69.method384(-112);
            this.field2395 = true;
        }
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1143(Canvas arg0) {
        if (arg0 != null) {
            class453 var2 = (class453) this.field2408.method3057(1, (long) arg0.hashCode());
            this.field2410 = var2;
            this.method1059(var2);
        } else {
            this.field2410 = null;
            this.method1059((class453) null);
        }
    }

    @OriginalMember(owner = "client!l", name = "XA", descriptor = "(IIIII)V")
    public final native void method1144(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!l", name = "ma", descriptor = "(Lt;)V")
    private final native void method1145(class518 arg0);

    @OriginalMember(owner = "client!l", name = "ja", descriptor = "(I)V")
    public final native void method1146(int arg0);

    @OriginalMember(owner = "client!l", name = "ya", descriptor = "()V")
    public final native void method1147();

    @OriginalMember(owner = "client!l", name = "L", descriptor = "()V")
    public final native void method1148();

    @OriginalMember(owner = "client!l", name = "m", descriptor = "(IIIII)V")
    public final native void method1149(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!l", name = "x", descriptor = "()V")
    public final void method1150() {
        this.method1143(this.field2410.field5973);
    }

    @OriginalMember(owner = "client!l", name = "j", descriptor = "()V")
    public final void method1151() throws class56 {
        if (this.field2410 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field2410.method2547();
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIF)Lqea;")
    public final class392 method1152(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return new class143(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!l", name = "r", descriptor = "()Lq;")
    public final class487 method1153() {
        return this.field2407;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lit;Lit;FLit;)Lit;")
    public final class513 method1154(class513 arg0, class513 arg1, float arg2, class513 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!l", name = "q", descriptor = "(Lva;)V")
    private final native void method1155(class639 arg0);
}
