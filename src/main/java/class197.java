import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class197 extends class288 implements class294 {

    @OriginalMember(owner = "client!w", name = "o", descriptor = "Z")
    private boolean field3155 = false;

    @OriginalMember(owner = "client!w", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!w", name = "n", descriptor = "Lmf;")
    private class291 field3154 = new class291();

    @OriginalMember(owner = "client!w", name = "F", descriptor = "I")
    private int field3172 = 4096;

    @OriginalMember(owner = "client!w", name = "G", descriptor = "I")
    private int field3173 = 4096;

    @OriginalMember(owner = "client!w", name = "D", descriptor = "Lmn;")
    private class249 field3170 = new class249(4);

    @OriginalMember(owner = "client!w", name = "H", descriptor = "Z")
    private boolean field3174 = false;

    @OriginalMember(owner = "client!w", name = "C", descriptor = "Lc;")
    private class124 field3169;

    @OriginalMember(owner = "client!w", name = "p", descriptor = "[I")
    private static int[] field3156 = new int[Math.max(Math.max(80, 20), 24573)];

    @OriginalMember(owner = "client!w", name = "r", descriptor = "[I")
    public static int[] field3158 = field3156;

    @OriginalMember(owner = "client!w", name = "v", descriptor = "[I")
    private static int[] field3162 = new int[8191];

    @OriginalMember(owner = "client!w", name = "t", descriptor = "[B")
    private static byte[] field3160 = new byte[8191];

    @OriginalMember(owner = "client!w", name = "y", descriptor = "[I")
    private static int[] field3165 = new int[8191];

    @OriginalMember(owner = "client!w", name = "x", descriptor = "[I")
    private static int[] field3164 = field3156;

    @OriginalMember(owner = "client!w", name = "s", descriptor = "[F")
    private static float[] field3159 = new float[20];

    @OriginalMember(owner = "client!w", name = "z", descriptor = "Ljava/lang/Boolean;")
    private static Boolean field3166 = Boolean.FALSE;

    @OriginalMember(owner = "client!w", name = "u", descriptor = "[F")
    private static float[] field3161 = field3159;

    @OriginalMember(owner = "client!w", name = "B", descriptor = "[I")
    private static int[] field3168 = field3156;

    @OriginalMember(owner = "client!w", name = "w", descriptor = "[I")
    public static int[] field3163 = new int[6];

    @OriginalMember(owner = "client!w", name = "q", descriptor = "[S")
    private static short[] field3157 = new short[8191];

    @OriginalMember(owner = "client!w", name = "I", descriptor = "I")
    private int field3175;

    @OriginalMember(owner = "client!w", name = "A", descriptor = "Lg;")
    private class109 field3167;

    @OriginalMember(owner = "client!w", name = "E", descriptor = "Lb;")
    private class221 field3171;

    @OriginalMember(owner = "client!w", name = "J", descriptor = "[Lk;")
    private class400[] field3176;

    @OriginalMember(owner = "client!w", name = "d", descriptor = "(I)V", line = 7)
    public final void method316(int arg0) {
        this.field3176[arg0].method2493();
    }

    @OriginalMember(owner = "client!w", name = "f", descriptor = "(I)Ln;", line = 12)
    public final class15 method404(int arg0) {
        class109 var2 = new class109(this, arg0);
        this.field3154.method1885(false, var2);
        return var2;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "([Le;Lc;[Lpr;I)V", line = 17)
    public final void method389(class374[] arg0, class124 arg1, class313[] arg2, int arg3) {
        if (arg2 == null) {
            this.method1332().method2497(this, arg0, arg1, (int[]) null, -1, arg3);
        } else {
            class313 var5 = arg2[0];
            field3163[5] = 0;
            this.method1332().method2497(this, arg0, arg1, field3163, -1, arg3);
            var5.field4719 = field3163[0];
            var5.field4718 = field3163[1];
            var5.field4722 = field3163[2];
            var5.field4717 = field3163[3];
            var5.field4720 = field3163[4];
            var5.field4721 = field3163[5] != 0;
        }
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(Z)V", line = 34)
    public final void method279(boolean arg0) {
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "()Z", line = 37)
    public final boolean method329() {
        return true;
    }

    @OriginalMember(owner = "client!w", name = "A", descriptor = "()Z", line = 40)
    public final boolean method284() {
        return true;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lfj;[Lef;Z)Lla;", line = 44)
    public final class317 method357(class470 arg0, class340[] arg1, boolean arg2) {
        return arg2 ? new class72(this, this.field3167, arg0, arg1, (class24[]) null) : new class279(this, this.field3167, arg0, arg1, (class24[]) null);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "()Z", line = 51)
    public final boolean method302() {
        return false;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIIIIII)V", line = 54)
    public final void method310(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lip;)V", line = 62)
    public final void method414(class502 arg0) {
        this.method1334(arg0, false);
        this.method1332().method2486(this, field3168, field3165, field3162, field3157, arg0.field7340.method1106(111));
    }

    @OriginalMember(owner = "client!w", name = "i", descriptor = "()Z", line = 67)
    public final boolean method421() {
        return false;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIII)V", line = 74)
    public final void method353(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method1332().method2483(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!w", name = "X", descriptor = "(S)Z", line = 78)
    private final boolean method1327(short arg0) {
        synchronized (this) {
            class486 var3 = super.field4358.method105(-126, arg0);
            if (var3 == null) {
                return false;
            } else {
                this.method1328(arg0, var3.field7139, var3.field7146, var3.field7148, var3.field7149, var3.field7161, var3.field7144, var3.field7150, var3.field7141, var3.field7152, var3.field7151, var3.field7157, var3.field7164);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "B", descriptor = "()Z", line = 89)
    public final boolean method334() {
        return false;
    }

    @OriginalMember(owner = "client!w", name = "u", descriptor = "()Z", line = 93)
    public final boolean method270() {
        return false;
    }

    @OriginalMember(owner = "client!w", name = "k", descriptor = "()V", line = 98)
    public final void method425() {
        if (!this.field3155) {
            this.method1330();
            this.field3176 = null;
            this.field3171 = null;
            this.field3167 = null;
            this.field3169 = null;
            this.field3170.method1614((byte) -24);
            for (class109 var1 = (class109) this.field3154.method1892(90); var1 != null; var1 = (class109) this.field3154.method1893((byte) -2)) {
                var1.method925();
            }
            this.field3154.method1891(-3);
            this.method1333();
            if (this.field3174) {
                class160.method1146(false, 301, true);
                this.field3174 = false;
            }
            this.field3155 = true;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "([IIIII)Lo;", line = 128)
    public final class24 method335(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class412(this, this.field3167, arg0, arg1, arg2, arg3, arg4) : new class201(this, this.field3167, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class412(this, this.field3167, arg0, arg1, arg2, arg3, arg4) : new class201(this, this.field3167, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!w", name = "j", descriptor = "()Z", line = 164)
    public final boolean method408() {
        return false;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I[Lbk;)V", line = 168)
    public final void method372(int arg0, class256[] arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < arg0; ++var4) {
            field3164[var3++] = arg1[var4].method1646(-127);
            field3164[var3++] = arg1[var4].method1655((byte) -126);
            field3164[var3++] = arg1[var4].method1653((byte) -81);
            field3164[var3++] = arg1[var4].method1647(-121);
            field3161[var4] = arg1[var4].method1650(91);
            field3164[var3++] = arg1[var4].method1652(-17454);
        }
        this.method1331(arg0, field3164, field3161);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Ln;)V", line = 186)
    public final void method432(class15 arg0) {
        this.field3167 = (class109) arg0;
        this.method1335(arg0);
    }

    @OriginalMember(owner = "client!w", name = "w", descriptor = "()Z", line = 191)
    public final boolean method309() {
        return true;
    }

    @OriginalMember(owner = "client!w", name = "f", descriptor = "(IIIIII)V", line = 195)
    public final void method398(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1337(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V", line = 199)
    public final void method358(int arg0) {
        this.field3175 = arg0;
        this.field3176 = new class400[this.field3175];
        for (int var2 = 0; var2 < this.field3175; ++var2) {
            this.field3176[var2] = new class400(this, this.field3173, this.field3172);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(II)I", line = 217)
    public final int method271(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIII)V", line = 225)
    public final void method365(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method345(arg0, arg1, arg2, arg4, arg5);
        this.method345(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method405(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
        this.method405(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(I)V", line = 231)
    public final void method409(int arg0) {
        this.field3176[arg0].method2489();
    }

    @OriginalMember(owner = "client!w", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 235)
    public final void method418(Canvas arg0) {
        class221 var2 = (class221) this.field3170.method1622((long) arg0.hashCode(), 66);
        if (var2 == null) {
            try {
                Class var3 = Class.forName("java.awt.Canvas");
                Method var4 = var3.getMethod("setIgnoreRepaint", Boolean.TYPE);
                var4.invoke(arg0, Boolean.TRUE);
            } catch (Exception var6) {
            }
            class221 var5 = new class221(this, arg0);
            this.field3170.method1618(var5, (long) arg0.hashCode(), -1);
        }
    }

    @OriginalMember(owner = "client!w", name = "m", descriptor = "(S)Z", line = 257)
    private final boolean method1329(short arg0) {
        class16 var2 = super.field4358;
        synchronized (super.field4358) {
            if (!super.field4358.method108(false, arg0)) {
                return false;
            } else {
                class486 var4 = super.field4358.method105(-125, arg0);
                if (var4 == null) {
                    return false;
                } else {
                    int[] var6;
                    if (var4.field7149 && var4.field7148) {
                        var6 = super.field4358.method106((byte) -39, true, 128, 0.7F, arg0, 128);
                    } else {
                        var6 = super.field4358.method109(128, arg0, false, true, 0.7F, 128);
                    }
                    this.method1323(arg0, var4.field7139, var4.field7146, var4.field7148, var4.field7149, var4.field7161, var4.field7144, var4.field7150, var4.field7141, var4.field7152, var4.field7151, var4.field7157, var4.field7164, var6);
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "g", descriptor = "()V", line = 282)
    public final void method333() {
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(II)I", line = 286)
    public final int method394(int arg0, int arg1) {
        int var3 = arg0 & 1048575;
        int var4 = arg1 & 1048575;
        return var3 & var4 ^ var4;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 295)
    public final void method318(Canvas arg0) {
        class221 var2 = (class221) this.field3170.method1622((long) arg0.hashCode(), -107);
        Dimension var3 = arg0.getSize();
        var2.method1475(arg0, var3.width, var3.height);
        if (arg0 != null && this.field3171.field3467 == arg0) {
            this.method311(arg0);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lpn;IIII)Le;", line = 305)
    public final class374 method297(class528 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class349(this, this.field3167, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!w", name = "q", descriptor = "()Z", line = 310)
    public final boolean method338() {
        return false;
    }

    @OriginalMember(owner = "client!w", name = "s", descriptor = "()I", line = 313)
    public final int method403() {
        return 4;
    }

    @OriginalMember(owner = "client!w", name = "m", descriptor = "()V", line = 315)
    public final void method282() {
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIF)Lbk;", line = 320)
    public final class256 method272(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return new class23(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "()Z", line = 323)
    public final boolean method396() {
        return false;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lqg;Lqg;FLqg;)Lqg;", line = 327)
    public final class325 method293(class325 arg0, class325 arg1, float arg2, class325 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!w", name = "o", descriptor = "()V", line = 329)
    public final void method388() {
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(ILjava/awt/Canvas;Ll;Llt;)V", line = 332)
    public class197(int arg0, Canvas arg1, class16 arg2, class480 arg3) {
        super(arg0, arg2);
        try {
            if (!field3166) {
                if (arg3 != null) {
                    arg3.method2880(-105, this.getClass());
                    field3166 = Boolean.TRUE;
                } else {
                    System.loadLibrary("jawt");
                    System.loadLibrary("sw3d");
                    field3166 = Boolean.TRUE;
                }
            }
            if (!field3166) {
                throw new RuntimeException("");
            } else {
                this.method1325(super.field4358, 0, 0);
                class140.method1050(1135383648, true, false);
                this.field3174 = true;
                this.field3169 = new class165();
                this.method326(new class165());
                this.method358(1);
                this.method316(0);
                if (arg1 != null) {
                    this.method418(arg1);
                    this.method311(arg1);
                }
            }
        } catch (Throwable var5) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!w", name = "R", descriptor = "()V", line = 373)
    private final void method1330() {
        System.gc();
        System.runFinalization();
        class157.method1135(24180);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(II[I[I)Lta;", line = 378)
    public final class144 method440(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class346(this, this.field3167, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!w", name = "e", descriptor = "(I)V", line = 381)
    public final void method413(int arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIILta;II)V", line = 384)
    public final void method320(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class144 arg6, int arg7, int arg8) {
        this.method1324(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(IIII)V", line = 390)
    public final void method278(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!w", name = "y", descriptor = "()Z", line = 399)
    public final boolean method351() {
        return true;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "([Le;Lip;Lc;[Lpr;I)V", line = 404)
    public final void method393(class374[] arg0, class502 arg1, class124 arg2, class313[] arg3, int arg4) {
        this.method1334(arg1, true);
        if (arg3 == null) {
            this.method1332().method2492(this, arg0, arg2, (int[]) null, arg4, field3168, field3165, field3162, field3157, field3160, arg1.field7340.method1106(79), field3158);
        } else {
            class313 var6 = arg3[0];
            field3163[5] = 0;
            this.method1332().method2492(this, arg0, arg2, field3163, arg4, field3168, field3165, field3162, field3157, field3160, arg1.field7340.method1106(104), field3158);
            var6.field4719 = field3163[0];
            var6.field4718 = field3163[1];
            var6.field4722 = field3163[2];
            var6.field4717 = field3163[3];
            var6.field4720 = field3163[4];
            var6.field4721 = field3163[5] != 0;
        }
        int var7 = 0;
        for (int var8 = 0; var8 < arg0.length; ++var8) {
            if (arg0[var8] != null) {
                class349 var9 = (class349) arg0[var8];
                var9.method2175(var7, arg2);
                if (var9.field5184 != null) {
                    var7 += var9.field5184.length * 9;
                }
                if (var9.field5181 != null) {
                    var7 += var9.field5181.length * 3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(FFF)V", line = 445)
    public final void method363(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 450)
    public final void method347(Canvas arg0) {
        if (this.field3171.field3467 == arg0) {
            this.method311((Canvas) null);
        }
        class221 var2 = (class221) this.field3170.method1622((long) arg0.hashCode(), 30);
        if (var2 != null) {
            var2.method1676(true);
            var2.method1476();
        }
    }

    @OriginalMember(owner = "client!w", name = "C", descriptor = "()Lk;", line = 467)
    public final class400 method1332() {
        for (int var1 = 0; var1 < this.field3175; ++var1) {
            if (this.field3176[var1].field6059 == Thread.currentThread()) {
                return this.field3176[var1];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Le;Lip;Lc;Lpr;I)V", line = 480)
    public final void method298(class374 arg0, class502 arg1, class124 arg2, class313 arg3, int arg4) {
        this.method1334(arg1, true);
        if (arg3 == null) {
            this.method1332().method2484(this, arg0, arg2, (int[]) null, arg4, field3168, field3165, field3162, field3157, field3160, arg1.field7340.method1106(101), field3158);
        } else {
            field3163[5] = 0;
            this.method1332().method2484(this, arg0, arg2, field3163, arg4, field3168, field3165, field3162, field3157, field3160, arg1.field7340.method1106(122), field3158);
            arg3.field4719 = field3163[0];
            arg3.field4718 = field3163[1];
            arg3.field4722 = field3163[2];
            arg3.field4717 = field3163[3];
            arg3.field4720 = field3163[4];
            arg3.field4721 = field3163[5] != 0;
        }
        class349 var6 = (class349) arg0;
        var6.method2175(0, arg2);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(II[[I[[IIII)Lya;", line = 503)
    public final class38 method376(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class158(this, this.field3167, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(I)V", line = 506)
    public final void method307(int arg0) {
        class157.method1135(24180);
        this.method1326(arg0);
        for (class109 var2 = (class109) this.field3154.method1892(98); var2 != null; var2 = (class109) this.field3154.method1893((byte) -2)) {
            var2.method923();
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lip;Z)V", line = 523)
    private final void method1334(class502 arg0, boolean arg1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        for (class7 var8 = (class7) arg0.field7340.method1111(0); var8 != null; var8 = (class7) arg0.field7340.method1107(-26598)) {
            field3168[var3++] = var8.field101;
            field3168[var3++] = var8.field102;
            field3168[var3++] = var8.field100;
            field3165[var4++] = var8.field104;
            field3157[var6++] = (short) var8.field106;
            field3162[var5++] = var8.field105;
            if (arg1) {
                field3160[var7++] = var8.field109;
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 554)
    public final void method311(Canvas arg0) {
        if (arg0 != null) {
            class221 var2 = (class221) this.field3170.method1622((long) arg0.hashCode(), 71);
            this.field3171 = var2;
            this.method1336(var2);
        } else {
            this.field3171 = null;
            this.method1336((class221) null);
        }
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(Z)V", line = 568)
    public final void method287(boolean arg0) {
    }

    @OriginalMember(owner = "client!w", name = "v", descriptor = "()V", line = 572)
    public final void method419() {
    }

    @OriginalMember(owner = "client!w", name = "z", descriptor = "()V", line = 574)
    public final void method277() {
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 577)
    public final void method337(Rectangle[] arg0, int arg1) {
        if (this.field3171 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field3171.method1478(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIZ)Lo;", line = 590)
    public final class24 method332(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return arg4 ? new class412(this, this.field3167, arg0, arg1, arg2, arg3) : new class201(this, this.field3167, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!w", name = "d", descriptor = "(IIIIII)Lqg;", line = 600)
    public final class325 method330(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!w", name = "d", descriptor = "()Lc;", line = 604)
    public final class124 method364() {
        return this.field3169;
    }

    @OriginalMember(owner = "client!w", name = "l", descriptor = "()Z", line = 622)
    public final boolean method449() {
        return true;
    }

    @OriginalMember(owner = "client!w", name = "x", descriptor = "()Z", line = 626)
    public final boolean method360() {
        return true;
    }

    @OriginalMember(owner = "client!w", name = "e", descriptor = "()V", line = 629)
    public final void method355() {
        if (this.field3171 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field3171.method1474();
        }
    }

    @OriginalMember(owner = "client!w", name = "finalize", descriptor = "()V", line = 643)
    protected final synchronized void finalize() {
        this.method1802((byte) -65);
        if (this.nativeid != 0L) {
            class157.method1134((byte) 115, this);
        }
    }

    @OriginalMember(owner = "client!w", name = "h", descriptor = "()Lc;", line = 652)
    public final class124 method399() {
        return new class165();
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lef;Z)Lo;", line = 662)
    public final class24 method374(class340 arg0, boolean arg1) {
        int[] var3 = arg0.field5112;
        byte[] var4 = arg0.field5113;
        int var5 = arg0.field5114;
        int var6 = arg0.field5115;
        class24 var7;
        if (arg1 && arg0.field5116 == null) {
            var7 = new class297(this, this.field3167, var3, var4, 0, arg0.field5114, arg0.field5114, arg0.field5115);
        } else {
            int var8 = var5 * var6;
            int[] var9 = new int[var8];
            byte[] var10 = arg0.field5116;
            if (var10 != null) {
                for (int var11 = 0; var11 < var6; ++var11) {
                    int var12 = var5 * var11;
                    for (int var13 = 0; var13 < var5; ++var13) {
                        var9[var12 + var13] = var3[var4[var12 + var13] & 255] | var10[var12 + var13] << 24;
                    }
                }
                var7 = new class412(this, this.field3167, var9, 0, var5, var5, var6);
            } else {
                boolean var14 = false;
                for (int var15 = 0; var15 < var8; ++var15) {
                    int var16 = arg0.field5112[var4[var15] & 255];
                    if (var16 >>> 24 != 255) {
                        var14 = true;
                    }
                    var9[var15] = var16;
                }
                if (var14) {
                    var7 = new class412(this, this.field3167, var9, 0, arg0.field5114, arg0.field5114, arg0.field5115);
                } else {
                    var7 = new class201(this, this.field3167, var9, 0, arg0.field5114, arg0.field5114, arg0.field5115);
                }
            }
        }
        var7.method148(arg0.field5119, arg0.field5118, arg0.field5117, arg0.field5120);
        return var7;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lqg;)V", line = 739)
    public final void method350(class325 arg0) {
    }

    @OriginalMember(owner = "client!w", name = "t", descriptor = "()Z", line = 744)
    public final boolean method280() {
        return true;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Z)V", line = 753)
    public final void method273(boolean arg0) {
    }

    @OriginalMember(owner = "client!w", name = "qa", descriptor = "()Ljava/lang/Object;", line = 756)
    private final Object method1338() {
        return new class251(this);
    }

    @OriginalMember(owner = "client!w", name = "f", descriptor = "()Z", line = 759)
    public final boolean method383() {
        return true;
    }

    @OriginalMember(owner = "client!w", name = "v", descriptor = "(III[I)V")
    public final native void method349(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!w", name = "ma", descriptor = "(IIIII)V")
    public final native void method345(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!w", name = "ba", descriptor = "(IIII)V")
    public final native void method371(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!w", name = "pa", descriptor = "()I")
    public final native int method317();

    @OriginalMember(owner = "client!w", name = "J", descriptor = "(SBBZZZBBBIIZZ[I)V")
    private final native void method1323(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12, int[] arg13);

    @OriginalMember(owner = "client!w", name = "aa", descriptor = "()F")
    public final native float method417();

    @OriginalMember(owner = "client!w", name = "NA", descriptor = "(IIIIIILta;II)V")
    private final native void method1324(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class144 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIII)V")
    public final native void method375(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!w", name = "W", descriptor = "(Ll;II)V")
    private final native void method1325(class16 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!w", name = "r", descriptor = "()I")
    public final native int method391();

    @OriginalMember(owner = "client!w", name = "P", descriptor = "(IIIIII)V")
    public final native void method327(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!w", name = "u", descriptor = "(I)V")
    private final native void method1326(int arg0);

    @OriginalMember(owner = "client!w", name = "T", descriptor = "()F")
    public final native float method431();

    @OriginalMember(owner = "client!w", name = "JA", descriptor = "(F)V")
    public final native void method397(float arg0);

    @OriginalMember(owner = "client!w", name = "MA", descriptor = "([I)V")
    public final native void method387(int[] arg0);

    @OriginalMember(owner = "client!w", name = "SA", descriptor = "(Lc;)V")
    public final native void method326(class124 arg0);

    @OriginalMember(owner = "client!w", name = "d", descriptor = "(II)V")
    public final native void method446(int arg0, int arg1);

    @OriginalMember(owner = "client!w", name = "ZA", descriptor = "(IIIII)V")
    public final native void method356(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!w", name = "va", descriptor = "()V")
    public final native void method321();

    @OriginalMember(owner = "client!w", name = "l", descriptor = "(SBBZZZBBBIIZZ)V")
    private final native void method1328(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12);

    @OriginalMember(owner = "client!w", name = "VA", descriptor = "(IIIIII)Z")
    public final native boolean method361(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!w", name = "K", descriptor = "(IIIIII[BII)V")
    public final native void method301(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!w", name = "B", descriptor = "(IFFFFF)V")
    public final native void method303(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!w", name = "GA", descriptor = "(IIII)V")
    public final native void method324(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!w", name = "ya", descriptor = "(I)V")
    public final native void method346(int arg0);

    @OriginalMember(owner = "client!w", name = "t", descriptor = "(I)V")
    public final native void method294(int arg0);

    @OriginalMember(owner = "client!w", name = "IA", descriptor = "(IIIII)V")
    public final native void method405(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!w", name = "ra", descriptor = "(ILta;II)V")
    public final native void method373(int arg0, class144 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!w", name = "WA", descriptor = "(I[I[F)V")
    private final native void method1331(int arg0, int[] arg1, float[] arg2);

    @OriginalMember(owner = "client!w", name = "p", descriptor = "()V")
    public final native void method615();

    @OriginalMember(owner = "client!w", name = "Q", descriptor = "(III)V")
    public final native void method448(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!w", name = "ua", descriptor = "()V")
    private final native void method1333();

    @OriginalMember(owner = "client!w", name = "s", descriptor = "(IIII)V")
    public final native void method428(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!w", name = "n", descriptor = "()V")
    public final native void method367();

    @OriginalMember(owner = "client!w", name = "sa", descriptor = "(IIII)[I")
    public final native int[] method313(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!w", name = "QA", descriptor = "(Ln;)V")
    private final native void method1335(class15 arg0);

    @OriginalMember(owner = "client!w", name = "da", descriptor = "(FF)V")
    public final native void method385(float arg0, float arg1);

    @OriginalMember(owner = "client!w", name = "HA", descriptor = "(IIII)V")
    public final native void method344(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!w", name = "AA", descriptor = "()I")
    public final native int method348();

    @OriginalMember(owner = "client!w", name = "OA", descriptor = "()I")
    public final native int method427();

    @OriginalMember(owner = "client!w", name = "Y", descriptor = "()I")
    public final native int method331();

    @OriginalMember(owner = "client!w", name = "e", descriptor = "(Lb;)V")
    private final native void method1336(class221 arg0);

    @OriginalMember(owner = "client!w", name = "A", descriptor = "(IIIIII)V")
    private final native void method1337(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
}
