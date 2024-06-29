import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class721 extends class66 implements class556 {

    @OriginalMember(owner = "client!oa", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "Z")
    private boolean field10115 = false;

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "Lga;")
    private class420 field10116 = new class420();

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "I")
    private int field10122 = 4096;

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "I")
    private int field10132 = 4096;

    @OriginalMember(owner = "client!oa", name = "D", descriptor = "Ltga;")
    private class64 field10124 = new class64(4);

    @OriginalMember(owner = "client!oa", name = "N", descriptor = "Z")
    private boolean field10134 = false;

    @OriginalMember(owner = "client!oa", name = "H", descriptor = "Leh;")
    private class378 field10128;

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "[I")
    private static int[] field10114 = new int[Math.max(Math.max(104, 20), 24573)];

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "[I")
    private static int[] field10118 = new int[8191];

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "[I")
    private static int[] field10126 = new int[8191];

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "[S")
    private static short[] field10121 = new short[8191];

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "[I")
    private static int[] field10119 = field10114;

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "[I")
    public static int[] field10120 = field10114;

    @OriginalMember(owner = "client!oa", name = "J", descriptor = "[F")
    private static float[] field10130 = new float[20];

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "[I")
    private static int[] field10129 = field10114;

    @OriginalMember(owner = "client!oa", name = "G", descriptor = "[F")
    private static float[] field10127 = field10130;

    @OriginalMember(owner = "client!oa", name = "K", descriptor = "[B")
    private static byte[] field10131 = new byte[8191];

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "[I")
    public static int[] field10117 = new int[6];

    @OriginalMember(owner = "client!oa", name = "O", descriptor = "I")
    public int field10135;

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "Lp;")
    private class227 field10125;

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "Leh;")
    private class378 field10123;

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "Lya;")
    private class59 field10113;

    @OriginalMember(owner = "client!oa", name = "M", descriptor = "[La;")
    private class643[] field10133;

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "()Leh;", line = 3)
    public final class378 method462() {
        return new class290();
    }

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "()Leh;", line = 9)
    public final class378 method493() {
        return this.field10123;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[I[I)Laa;", line = 13)
    public final class510 method430(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class51(this, this.field10113, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "()Z", line = 17)
    public final boolean method475() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lhm;IIII)Lka;", line = 20)
    public final class495 method420(class229 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class44(this, this.field10113, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lnea;Lvu;)Lcp;", line = 23)
    public final class753 method456(class742 arg0, class354 arg1) {
        return new class635(this, (class565) arg0, (class525) arg1);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lkf;[Lre;Z)Lda;", line = 29)
    public final class67 method403(class263 arg0, class625[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field8827;
            var5[var7] = arg1[var7].field8822;
            if (arg1[var7].field8820 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
            } else {
                return new class691(this, this.field10113, arg0, arg1, (class112[]) null);
            }
        } else if (var6) {
            throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
        } else {
            return new class19(this, this.field10113, arg0, arg1, (class112[]) null);
        }
    }

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "(I)V", line = 67)
    public final void method489(int arg0) {
        this.field10135 = arg0;
        this.field10133 = new class643[this.field10135];
        for (int var2 = 0; var2 < this.field10135; ++var2) {
            this.field10133[var2] = new class643(this, this.field10132, this.field10122);
        }
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "()V", line = 79)
    public final void method397() {
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)V", line = 83)
    public final void method458(int arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "()I", line = 88)
    public final int method471() {
        return 4;
    }

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "()Z", line = 91)
    public final boolean method465() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[[I[[IIII)Ls;", line = 95)
    public final class292 method477(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class695(this, this.field10113, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lag;Lag;FLag;)Lag;", line = 98)
    public final class710 method507(class710 arg0, class710 arg1, float arg2, class710 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V", line = 103)
    public final void method472(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class138 {
        if (this.field10125 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field10125.method1567(arg0, arg1, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;II)V", line = 114)
    public final void method505(Canvas arg0, int arg1, int arg2) {
        class227 var4 = (class227) this.field10124.method380((byte) -3, (long) arg0.hashCode());
        var4.method1566(arg0, arg1, arg2);
        if (arg0 != null && this.field10125.field3247 == arg0) {
            this.method510(arg0);
        }
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(II)I", line = 122)
    public final int method451(int arg0, int arg1) {
        int var3 = arg0 & 1048575;
        int var4 = arg1 & 1048575;
        return var3 & var4 ^ var4;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILaa;II)V", line = 129)
    public final void method414(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class510 arg6, int arg7, int arg8) {
        this.method4058(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "(I)V", line = 132)
    public final void method473(int arg0) {
        class349.method2207(85);
        this.method4055(arg0);
        for (class59 var2 = (class59) this.field10116.method2508((byte) 115); var2 != null; var2 = (class59) this.field10116.method2505((byte) -55)) {
            var2.method367();
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(FFF)V", line = 146)
    public final void method396(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "()V", line = 149)
    public final void method444() {
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIIII)V", line = 154)
    public final void method438(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method4060(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lhea;I)V", line = 157)
    public final void method464(class443 arg0, int arg1) {
        this.method4067(arg0, false);
        this.method4061().method3677(this, field10119, field10118, field10126, field10121, arg0.field6311.method1007(-99));
    }

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "()Lrda;", line = 162)
    public final class689 method483() {
        return new class689(0, "SSE", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(II)Lvu;", line = 166)
    public final class354 method442(int arg0, int arg1) {
        return new class525(arg0, arg1);
    }

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "()Z", line = 170)
    public final boolean method436() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "()Leh;", line = 174)
    public final class378 method433() {
        return this.field10128;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIII)V", line = 177)
    public final void method415(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method4061().method3651(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "()Z", line = 180)
    public final boolean method424() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([I)V", line = 184)
    public final void method470(int[] arg0) {
        Dimension var2 = this.field10125.field3247.getSize();
        arg0[0] = var2.width;
        arg0[1] = var2.height;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "()V", line = 188)
    public final void method395() {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lre;Z)Lqda;", line = 192)
    public final class112 method482(class625 arg0, boolean arg1) {
        class565 var3 = new class565(this, arg0.field8823, arg0.field8828, arg0.field8820, 0, arg0.field8827, arg0.field8827, arg0.field8822);
        var3.method790(arg0.field8826, arg0.field8825, arg0.field8824, arg0.field8821);
        return var3;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Z)V", line = 198)
    public final void method412(boolean arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V", line = 204)
    public final void method393(boolean arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ld;II)V", line = 207)
    public class721(Canvas arg0, class159 arg1, int arg2, int arg3) {
        super(arg1);
        try {
            if (!class291.method1971("sw3d", 0)) {
                throw new RuntimeException("");
            } else {
                class349.method2204(4563);
                this.method4054(super.field883, 0, 0);
                class211.method1486(false, true, (byte) 69);
                this.field10134 = true;
                this.field10128 = new class290();
                this.method445(new class290());
                this.method489(1);
                this.method441(0);
                if (arg0 != null) {
                    this.method498(arg0, arg2, arg3);
                    this.method510(arg0);
                }
            }
        } catch (Throwable var5) {
            this.method450(1);
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "()V", line = 236)
    public final void method447() {
        if (!this.field10115) {
            this.field10133 = null;
            this.field10125 = null;
            this.field10113 = null;
            this.field10128 = null;
            this.field10124.method387(-21125);
            for (class59 var1 = (class59) this.field10116.method2508((byte) -93); var1 != null; var1 = (class59) this.field10116.method2505((byte) -55)) {
                var1.method368();
            }
            this.field10116.method2503(10);
            this.method4053();
            if (this.field10134) {
                class209.method1485(false, (byte) 30, true);
                this.field10134 = false;
            }
            this.method4063();
            class349.method2208((byte) 59);
            this.field10115 = true;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)V", line = 267)
    public final void method406(int arg0, int arg1) throws class138 {
        if (this.field10125 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field10125.method1572(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILaa;IIIII)V", line = 277)
    public final void method479(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class510 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
    }

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "()Z", line = 280)
    public final boolean method497() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)I", line = 283)
    public final int method421(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;II)V", line = 287)
    public final void method498(Canvas arg0, int arg1, int arg2) {
        class227 var4 = (class227) this.field10124.method380((byte) -3, (long) arg0.hashCode());
        if (var4 == null) {
            try {
                Class var5 = Class.forName("java.awt.Canvas");
                Method var6 = var5.getMethod("setIgnoreRepaint", Boolean.TYPE);
                var6.invoke(arg0, Boolean.TRUE);
            } catch (Exception var8) {
            }
            class227 var7 = new class227(this, arg0, arg1, arg2);
            this.field10124.method384((long) arg0.hashCode(), var7, false);
        } else {
            if (var4.field3250 != arg1 || var4.field3248 != arg2) {
                var4.method1566(arg0, arg1, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Leh;)V", line = 311)
    public final void method445(class378 arg0) {
        this.field10123 = arg0;
        this.method4066(((class290) arg0).nativeid);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lag;)V", line = 315)
    public final void method484(class710 arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "()Z", line = 322)
    public final boolean method426() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lhea;)V", line = 325)
    public final void method437(class443 arg0) {
        if (arg0.field6311.method1007(-120) != 0) {
            this.method4067(arg0, false);
            this.method4061().method3677(this, field10119, field10118, field10126, field10121, arg0.field6311.method1007(-70));
        }
    }

    @OriginalMember(owner = "client!oa", name = "OA", descriptor = "()Ljava/lang/Object;", line = 332)
    private final Object method4057() {
        return new class404(this);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIIIIIII)V", line = 334)
    public final void method490(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
    }

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "()Z", line = 346)
    public final boolean method454() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "()Z", line = 352)
    public final boolean method448() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIF)Ljw;", line = 356)
    public final class578 method492(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return new class293(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "()Z", line = 359)
    public final boolean method509() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIZ)Lqda;", line = 362)
    public final class112 method502(int arg0, int arg1, boolean arg2) {
        return new class565(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "()La;", line = 369)
    public final class643 method4061() {
        for (int var1 = 0; var1 < this.field10135; ++var1) {
            if (this.field10133[var1].field9052 == Thread.currentThread()) {
                return this.field10133[var1];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V", line = 383)
    public final void method398(int arg0) {
        this.field10133[arg0].method3660();
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(S)Z", line = 386)
    private final boolean method4062(short arg0) {
        synchronized (this) {
            class181 var3 = super.field883.method1263(arg0, (byte) 118);
            if (var3 == null) {
                return false;
            } else {
                this.method4064(arg0, var3.field2747, var3.field2751, var3.field2745, var3.field2737, var3.field2749, var3.field2742, var3.field2748, var3.field2739, var3.field2740, var3.field2736, var3.field2744, var3.field2738, var3.field2734, var3.field2752, var3.field2755, var3.field2758, var3.field2750, var3.field2735, var3.field2746);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "()Z", line = 397)
    public final boolean method434() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 400)
    public final void method405(Canvas arg0) {
        if (this.field10125.field3247 == arg0) {
            this.method510((Canvas) null);
        }
        class227 var2 = (class227) this.field10124.method380((byte) -3, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method3117((byte) -96);
            var2.method1565();
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 414)
    public final void method510(Canvas arg0) {
        if (arg0 != null) {
            class227 var2 = (class227) this.field10124.method380((byte) -3, (long) arg0.hashCode());
            this.field10125 = var2;
            this.method4065(var2);
        } else {
            this.field10125 = null;
            this.method4065((class227) null);
        }
    }

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "()V", line = 431)
    private final void method4063() {
        System.gc();
        System.runFinalization();
        class349.method2207(90);
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "()V", line = 438)
    public final void method413() {
        this.method510(this.field10125.field3247);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "()V", line = 445)
    public final void method392() {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIII)V", line = 450)
    public final void method427(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([IIIIIZ)Lqda;", line = 456)
    public final class112 method481(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return new class565(this, arg0, arg1, arg2, arg3, arg4, false);
    }

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "()Z", line = 463)
    public final boolean method423() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "(I)Lza;", line = 468)
    public final class432 method508(int arg0) {
        class59 var2 = new class59(this, arg0);
        this.field10116.method2510(var2, false);
        return var2;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIIZ)Lqda;", line = 473)
    public final class112 method504(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return new class565(this, arg0, arg1, arg2, arg3, !arg4);
    }

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "(I)V", line = 483)
    public final void method495(int arg0) {
        this.field10132 = this.field10122 = arg0;
        if (this.field10135 > 1) {
            throw new IllegalStateException("No MT");
        } else {
            this.method489(this.field10135);
            this.method441(0);
        }
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "()Z", line = 492)
    public final boolean method422() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "()Z", line = 496)
    public final boolean method461() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[Ljw;)V", line = 500)
    public final void method429(int arg0, class578[] arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < arg0; ++var4) {
            field10129[var3++] = arg1[var4].method3358((byte) 22);
            field10129[var3++] = arg1[var4].method3355(0);
            field10129[var3++] = arg1[var4].method3363(-1);
            field10129[var3++] = arg1[var4].method3360(-31770);
            field10127[var4] = arg1[var4].method3356((byte) 95);
            field10129[var3++] = arg1[var4].method3362(0);
        }
        this.method4052(arg0, field10129, field10127);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lhea;Z)V", line = 520)
    private final void method4067(class443 arg0, boolean arg1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        for (class324 var8 = (class324) arg0.field6311.method1006(8573); var8 != null; var8 = (class324) arg0.field6311.method1003(false)) {
            field10119[var3++] = var8.field4854;
            field10119[var3++] = var8.field4857;
            field10119[var3++] = var8.field4855;
            field10118[var4++] = var8.field4861;
            field10121[var6++] = (short) var8.field4853;
            field10126[var5++] = var8.field4860;
            if (arg1) {
                field10131[var7++] = var8.field4864;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(IIIIII)V", line = 554)
    public final void method457(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method440(arg0, arg1, arg2, arg4, arg5);
        this.method440(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method431(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
        this.method431(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
    }

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "()V", line = 568)
    public final void method443() {
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(II)Lnea;", line = 583)
    public final class742 method501(int arg0, int arg1) {
        return this.method502(arg0, arg1, false);
    }

    @OriginalMember(owner = "client!oa", name = "finalize", descriptor = "()V", line = 586)
    protected final synchronized void finalize() {
        this.method450(1);
        if (this.nativeid != 0L) {
            class349.method2206(118, this);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lza;)V", line = 594)
    public final void method439(class432 arg0) {
        this.field10113 = (class59) arg0;
        this.method4056(arg0);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lcp;)V", line = 604)
    public final void method485(class753 arg0) {
        class635 var2 = (class635) arg0;
        this.method4068(var2.field8946.nativeid, var2.field8947.nativeid);
    }

    @OriginalMember(owner = "client!oa", name = "WA", descriptor = "(S)Z", line = 611)
    private final boolean method4069(short arg0) {
        class159 var2 = super.field883;
        synchronized (super.field883) {
            if (!super.field883.method1262(arg0, (byte) 123)) {
                return false;
            } else {
                class181 var4 = super.field883.method1263(arg0, (byte) 120);
                if (var4 == null) {
                    return false;
                } else {
                    int[] var6;
                    if (var4.field2751 != 2) {
                        var6 = super.field883.method1261(arg0, 128, -13756, true, 0.7F, 128);
                    } else {
                        var6 = super.field883.method1259(arg0, 128, 30767, 0.7F, true, 128);
                    }
                    this.method4059(arg0, var6, var4.field2747, var4.field2751, var4.field2745, var4.field2737, var4.field2749, var4.field2742, var4.field2748, var4.field2739, var4.field2740, var4.field2736, var4.field2744, var4.field2738, var4.field2734, var4.field2752, var4.field2755, var4.field2758, var4.field2750, var4.field2735, var4.field2746);
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V", line = 643)
    public final void method441(int arg0) {
        this.field10133[arg0].method3652();
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)V", line = 645)
    public final void method401(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIII)Lag;", line = 648)
    public final class710 method399(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "(Z)V")
    public final native void method408(boolean arg0);

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "()I")
    public final native int method460();

    @OriginalMember(owner = "client!oa", name = "N", descriptor = "(I[I[F)V")
    private final native void method4052(int arg0, int[] arg1, float[] arg2);

    @OriginalMember(owner = "client!oa", name = "FA", descriptor = "()V")
    private final native void method4053();

    @OriginalMember(owner = "client!oa", name = "ra", descriptor = "(IIII)V")
    public final native void method468(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "P", descriptor = "(IIIII)V")
    public final native void method431(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "XA", descriptor = "()I")
    public final native int method425();

    @OriginalMember(owner = "client!oa", name = "HA", descriptor = "(IIII[I)V")
    public final native void method513(int arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!oa", name = "T", descriptor = "(IIII)V")
    public final native void method453(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "()I")
    public final native int method404();

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "()I")
    public final native int method466();

    @OriginalMember(owner = "client!oa", name = "X", descriptor = "(I)V")
    public final native void method459(int arg0);

    @OriginalMember(owner = "client!oa", name = "MA", descriptor = "(Ld;II)V")
    private final native void method4054(class159 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oa", name = "za", descriptor = "(IIIII)V")
    public final native void method487(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "M", descriptor = "()I")
    public final native int method432();

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "(ILaa;II)V")
    public final native void method494(int arg0, class510 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "ya", descriptor = "()V")
    public final native void method449();

    @OriginalMember(owner = "client!oa", name = "na", descriptor = "(IIII)[I")
    public final native int[] method400(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIID)V")
    public final native void method410(int arg0, int arg1, int arg2, int arg3, double arg4);

    @OriginalMember(owner = "client!oa", name = "pa", descriptor = "()V")
    public final native void method418();

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V")
    private final native void method4055(int arg0);

    @OriginalMember(owner = "client!oa", name = "xa", descriptor = "(F)V")
    public final native void method506(float arg0);

    @OriginalMember(owner = "client!oa", name = "DA", descriptor = "(IIII)V")
    public final native void method409(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "(Z)V")
    public final native void method156(boolean arg0);

    @OriginalMember(owner = "client!oa", name = "va", descriptor = "(Lza;)V")
    private final native void method4056(class432 arg0);

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "(III)V")
    public final native void method435(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "(II)V")
    public final native void method512(int arg0, int arg1);

    @OriginalMember(owner = "client!oa", name = "K", descriptor = "([I)V")
    public final native void method428(int[] arg0);

    @OriginalMember(owner = "client!oa", name = "Z", descriptor = "(IIIIIILaa;II)V")
    private final native void method4058(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class510 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!oa", name = "CA", descriptor = "(S[ISIBBIZBBBBZZZZZBZZI)V")
    private final native void method4059(short arg0, int[] arg1, short arg2, int arg3, byte arg4, byte arg5, int arg6, boolean arg7, byte arg8, byte arg9, byte arg10, byte arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, boolean arg16, byte arg17, boolean arg18, boolean arg19, int arg20);

    @OriginalMember(owner = "client!oa", name = "wa", descriptor = "(IIIIII)V")
    private final native void method4060(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "EA", descriptor = "(IIII)V")
    public final native void method411(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "KA", descriptor = "(IIII)V")
    public final native void method455(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "U", descriptor = "(IIIII)V")
    public final native void method440(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "Q", descriptor = "(IIIIII[BII)V")
    public final native void method511(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!oa", name = "Y", descriptor = "()[I")
    public final native int[] method469();

    @OriginalMember(owner = "client!oa", name = "la", descriptor = "()V")
    public final native void method463();

    @OriginalMember(owner = "client!oa", name = "AA", descriptor = "(SSIBBIZBBBBZZZZZBZZI)V")
    private final native void method4064(short arg0, short arg1, int arg2, byte arg3, byte arg4, int arg5, boolean arg6, byte arg7, byte arg8, byte arg9, byte arg10, boolean arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, byte arg16, boolean arg17, boolean arg18, int arg19);

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "(Lp;)V")
    private final native void method4065(class227 arg0);

    @OriginalMember(owner = "client!oa", name = "ma", descriptor = "(J)V")
    private final native void method4066(long arg0);

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "(IIIIIII)I")
    public final native int method452(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!oa", name = "JA", descriptor = "(IIIIII)I")
    public final native int method394(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "GA", descriptor = "(I)V")
    public final native void method417(int arg0);

    @OriginalMember(owner = "client!oa", name = "aa", descriptor = "(IIIIII)V")
    public final native void method474(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "ZA", descriptor = "(IFFFFF)V")
    public final native void method499(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "(II)V")
    public final native void method446(int arg0, int arg1);

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "(JJ)V")
    private final native void method4068(long arg0, long arg1);

    @OriginalMember(owner = "client!oa", name = "da", descriptor = "(III[I)V")
    public final native void method500(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!oa", name = "H", descriptor = "(III[I)V")
    public final native void method407(int arg0, int arg1, int arg2, int[] arg3);
}
