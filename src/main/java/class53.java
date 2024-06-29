import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class53 extends class475 implements class784 {

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "Z")
    private boolean field746 = false;

    @OriginalMember(owner = "client!oa", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "Low;")
    private class665 field743 = new class665();

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "I")
    private int field754 = 4096;

    @OriginalMember(owner = "client!oa", name = "J", descriptor = "I")
    private int field758 = 4096;

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "Lsi;")
    private class769 field760 = new class769(4);

    @OriginalMember(owner = "client!oa", name = "O", descriptor = "Z")
    private boolean field763 = false;

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "Ldm;")
    private class765 field757;

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "[I")
    private static int[] field742 = new int[Math.max(Math.max(104, 20), 24573)];

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "[I")
    private static int[] field745 = new int[8191];

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "[I")
    private static int[] field744 = field742;

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "[S")
    private static short[] field748 = new short[8191];

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "[I")
    private static int[] field750 = field742;

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "[I")
    public static int[] field749 = new int[6];

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "[I")
    public static int[] field752 = field742;

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "[B")
    private static byte[] field747 = new byte[8191];

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "[F")
    private static float[] field751 = new float[20];

    @OriginalMember(owner = "client!oa", name = "K", descriptor = "[F")
    private static float[] field759 = field751;

    @OriginalMember(owner = "client!oa", name = "H", descriptor = "[I")
    private static int[] field756 = new int[8191];

    @OriginalMember(owner = "client!oa", name = "N", descriptor = "I")
    public int field762;

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "Lya;")
    private class318 field741;

    @OriginalMember(owner = "client!oa", name = "G", descriptor = "Lp;")
    private class64 field755;

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "Ldm;")
    private class765 field753;

    @OriginalMember(owner = "client!oa", name = "M", descriptor = "[La;")
    private class682[] field761;

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "()Z", line = 3)
    public final boolean method421() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIZ)Lmq;", line = 7)
    public final class85 method423(int arg0, int arg1, boolean arg2) {
        return new class332(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "()Z", line = 10)
    public final boolean method424() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lza;)V", line = 13)
    public final void method425(class731 arg0) {
        this.field741 = (class318) arg0;
        this.method522(arg0);
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(II)I", line = 17)
    public final int method426(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIF)Lmfa;", line = 20)
    public final class217 method427(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return new class447(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 23)
    public final void method428(Canvas arg0) {
        if (arg0 != null) {
            class64 var2 = (class64) this.field760.method4253((long) arg0.hashCode(), -1);
            this.field755 = var2;
            this.method450(var2);
        } else {
            this.field755 = null;
            this.method450((class64) null);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lgka;I)V", line = 38)
    public final void method429(class667 arg0, int arg1) {
        this.method451(arg0, false);
        this.method493().method3869(this, field750, field756, field745, field748, arg0.field9377.method2132(false));
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V", line = 42)
    public final void method430(int arg0) {
        this.field761[arg0].method3851();
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[I[I)Laa;", line = 45)
    public final class88 method431(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class304(this, this.field741, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;II)V", line = 49)
    public final void method432(Canvas arg0, int arg1, int arg2) {
        class64 var4 = (class64) this.field760.method4253((long) arg0.hashCode(), -1);
        var4.method643(arg0, arg1, arg2);
        if (arg0 != null && this.field755.field969 == arg0) {
            this.method428(arg0);
        }
    }

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "()Z", line = 56)
    public final boolean method433() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "()V", line = 59)
    public final void method138() {
    }

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "(IIIIII)Lvr;", line = 62)
    public final class458 method434(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "()Z", line = 65)
    public final boolean method435() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V", line = 68)
    public final void method86(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class684 {
        if (this.field755 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field755.method640(arg0, arg1, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;II)V", line = 85)
    public final void method437(Canvas arg0, int arg1, int arg2) {
        class64 var4 = (class64) this.field760.method4253((long) arg0.hashCode(), -1);
        if (var4 == null) {
            try {
                Class var5 = Class.forName("java.awt.Canvas");
                Method var6 = var5.getMethod("setIgnoreRepaint", Boolean.TYPE);
                var6.invoke(arg0, Boolean.TRUE);
            } catch (Exception var8) {
            }
            class64 var7 = new class64(this, arg0, arg1, arg2);
            this.field760.method4252(false, var7, (long) arg0.hashCode());
        } else {
            if (var4.field967 != arg1 || var4.field968 != arg2) {
                var4.method643(arg0, arg1, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "OA", descriptor = "()Ljava/lang/Object;", line = 108)
    private final Object method438() {
        return new class127(this);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Llf;Ljk;)Lrs;", line = 114)
    public final class730 method53(class567 arg0, class788 arg1) {
        return new class357(this, (class332) arg0, (class571) arg1);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIIIIIII)V", line = 116)
    public final void method441(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIII)V", line = 118)
    public final void method442(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
    }

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "()Z", line = 121)
    public final boolean method443() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "()Z", line = 124)
    public final boolean method99() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "finalize", descriptor = "()V", line = 128)
    protected final synchronized void finalize() {
        this.method2779((byte) -107);
        if (this.nativeid != 0L) {
            class270.method1726(this, -1);
        }
    }

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "()Z", line = 136)
    public final boolean method446() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(IIIIII)V", line = 139)
    public final void method447(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method521(arg0, arg1, arg2, arg4, arg5);
        this.method521(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method468(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
        this.method468(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lrs;)V", line = 146)
    public final void method120(class730 arg0) {
        class357 var2 = (class357) arg0;
        this.method448(var2.field5074.nativeid, var2.field5073.nativeid);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lgka;Z)V", line = 157)
    private final void method451(class667 arg0, boolean arg1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        for (class484 var8 = (class484) arg0.field9377.method2128(38); var8 != null; var8 = (class484) arg0.field9377.method2127((byte) -100)) {
            field750[var3++] = var8.field6681;
            field750[var3++] = var8.field6684;
            field750[var3++] = var8.field6685;
            field756[var4++] = var8.field6683;
            field748[var6++] = (short) var8.field6687;
            field745[var5++] = var8.field6689;
            if (arg1) {
                field747[var7++] = var8.field6688;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIIII)V", line = 188)
    public final void method453(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method486(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "()Z", line = 191)
    public final boolean method454() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lgka;)V", line = 194)
    public final void method455(class667 arg0) {
        if (arg0.field9377.method2132(false) != 0) {
            this.method451(arg0, false);
            this.method493().method3869(this, field750, field756, field745, field748, arg0.field9377.method2132(false));
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V", line = 201)
    public final void method456(int arg0) {
        this.field761[arg0].method3856();
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "()Z", line = 204)
    public final boolean method83() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "()Ldm;", line = 207)
    public final class765 method457() {
        return this.field757;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lvr;)V", line = 210)
    public final void method458(class458 arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([IIIIIZ)Lmq;", line = 214)
    public final class85 method460(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return new class332(this, arg0, arg1, arg2, arg3, arg4, false);
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)V", line = 217)
    public final void method461(int arg0) {
        this.field758 = this.field754 = arg0;
        if (this.field762 > 1) {
            throw new IllegalStateException("No MT");
        } else {
            this.method499(this.field762);
            this.method430(0);
        }
    }

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "()Lev;", line = 226)
    public final class165 method108() {
        return new class165(0, "SSE", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "()Ldm;", line = 233)
    public final class765 method463() {
        return new class669();
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(Z)V", line = 238)
    public final void method466(boolean arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([I)V", line = 242)
    public final void method467(int[] arg0) {
        Dimension var2 = this.field755.field969.getSize();
        arg0[0] = var2.width;
        arg0[1] = var2.height;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIII)V", line = 248)
    public final void method469(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method493().method3862(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "(I)V", line = 251)
    public final void method470(int arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "()I", line = 255)
    public final int method472() {
        return 4;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(FFF)V", line = 258)
    public final void method57(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "()Z", line = 262)
    public final boolean method475() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "()Z", line = 266)
    public final boolean method477() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "()Z", line = 272)
    public final boolean method479() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "WA", descriptor = "(S)Z", line = 275)
    private final boolean method480(short arg0) {
        class103 var2 = super.field6447;
        synchronized (super.field6447) {
            if (!super.field6447.method846(arg0, true)) {
                return false;
            } else {
                class719 var4 = super.field6447.method847(arg0, -99);
                if (var4 == null) {
                    return false;
                } else {
                    int[] var6;
                    if (var4.field10042 != 2) {
                        var6 = super.field6447.method844(true, (byte) 122, 0.7F, 128, arg0, 128);
                    } else {
                        var6 = super.field6447.method845(0.7F, arg0, true, (byte) 52, 128, 128);
                    }
                    this.method452(arg0, var6, var4.field10035, var4.field10042, var4.field10031, var4.field10036, var4.field10040, var4.field10044, var4.field10046, var4.field10043, var4.field10028, var4.field10038, var4.field10029, var4.field10033, var4.field10030, var4.field10032, var4.field10048, var4.field10034, var4.field10049, var4.field10045, var4.field10039);
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(II)Ljk;", line = 301)
    public final class788 method88(int arg0, int arg1) {
        return new class571(arg0, arg1);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)V", line = 305)
    public final void method127(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "()V", line = 307)
    public final void method87() {
    }

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "(I)V", line = 313)
    public final void method74(int arg0) {
        class270.method1722(-1);
        this.method439(arg0);
        for (class318 var2 = (class318) this.field743.method3731((byte) -119); var2 != null; var2 = (class318) this.field743.method3729((byte) -111)) {
            var2.method1933();
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lde;Z)Lmq;", line = 327)
    public final class85 method487(class418 arg0, boolean arg1) {
        class332 var3 = new class332(this, arg0.field5795, arg0.field5793, arg0.field5798, 0, arg0.field5796, arg0.field5796, arg0.field5792);
        var3.method2(arg0.field5794, arg0.field5799, arg0.field5797, arg0.field5800);
        return var3;
    }

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "()Ldm;", line = 334)
    public final class765 method489() {
        return this.field753;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "()V", line = 341)
    public final void method490() {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lrt;[Lde;Z)Lda;", line = 345)
    public final class443 method491(class470 arg0, class418[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field5796;
            var5[var7] = arg1[var7].field5792;
            if (arg1[var7].field5798 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
            } else {
                return new class241(this, this.field741, arg0, arg1, (class85[]) null);
            }
        } else if (var6) {
            throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
        } else {
            return new class763(this, this.field741, arg0, arg1, (class85[]) null);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 382)
    public final void method492(Canvas arg0) {
        if (this.field755.field969 == arg0) {
            this.method428((Canvas) null);
        }
        class64 var2 = (class64) this.field760.method4253((long) arg0.hashCode(), -1);
        if (var2 != null) {
            var2.method4237(-1);
            var2.method648();
        }
    }

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "()La;", line = 397)
    public final class682 method493() {
        for (int var1 = 0; var1 < this.field762; ++var1) {
            if (this.field761[var1].field9668 == Thread.currentThread()) {
                return this.field761[var1];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "()V", line = 410)
    private final void method495() {
        System.gc();
        System.runFinalization();
        class270.method1722(-1);
    }

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "(I)Lza;", line = 416)
    public final class731 method496(int arg0) {
        class318 var2 = new class318(this, arg0);
        this.field743.method3728((byte) 120, var2);
        return var2;
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "()V", line = 422)
    public final void method115() {
        this.method428(this.field755.field969);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)V", line = 425)
    public final void method109(int arg0, int arg1) throws class684 {
        if (this.field755 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field755.method647(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)I", line = 439)
    public final int method497(int arg0, int arg1) {
        int var3 = arg0 & 1048575;
        int var4 = arg1 & 1048575;
        return var3 & var4 ^ var4;
    }

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "()V", line = 444)
    public final void method121() {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ldm;)V", line = 447)
    public final void method498(class765 arg0) {
        this.field753 = arg0;
        this.method481(((class669) arg0).nativeid);
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V", line = 453)
    public final void method499(int arg0) {
        this.field762 = arg0;
        this.field761 = new class682[this.field762];
        for (int var2 = 0; var2 < this.field762; ++var2) {
            this.field761[var2] = new class682(this, this.field758, this.field754);
        }
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ld;II)V", line = 555)
    public class53(Canvas arg0, class103 arg1, int arg2, int arg3) {
        super(arg1);
        try {
            if (!class27.method224(89, "sw3d")) {
                throw new RuntimeException("");
            } else {
                class270.method1725(-1);
                this.method506(super.field6447, 0, 0);
                class588.method3450(false, (byte) -6, true);
                this.field763 = true;
                this.field757 = new class669();
                this.method498(new class669());
                this.method499(1);
                this.method430(0);
                if (arg0 != null) {
                    this.method437(arg0, arg2, arg3);
                    this.method428(arg0);
                }
            }
        } catch (Throwable var5) {
            this.method2779((byte) 96);
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "()Z", line = 470)
    public final boolean method500() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILaa;IIIII)V", line = 472)
    public final void method501(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class88 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIZ)Lmq;", line = 476)
    public final class85 method503(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return new class332(this, arg0, arg1, arg2, arg3, !arg4);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[Lmfa;)V", line = 481)
    public final void method504(int arg0, class217[] arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < arg0; ++var4) {
            field744[var3++] = arg1[var4].method1495(false);
            field744[var3++] = arg1[var4].method1494(false);
            field744[var3++] = arg1[var4].method1490((byte) -126);
            field744[var3++] = arg1[var4].method1491(0);
            field759[var4] = arg1[var4].method1488(false);
            field744[var3++] = arg1[var4].method1489((byte) -125);
        }
        this.method520(arg0, field744, field759);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILaa;II)V", line = 502)
    public final void method505(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class88 arg6, int arg7, int arg8) {
        this.method465(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "()V", line = 505)
    public final void method119() {
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(S)Z", line = 510)
    private final boolean method507(short arg0) {
        synchronized (this) {
            class719 var3 = super.field6447.method847(arg0, -93);
            if (var3 == null) {
                return false;
            } else {
                this.method478(arg0, var3.field10035, var3.field10042, var3.field10031, var3.field10036, var3.field10040, var3.field10044, var3.field10046, var3.field10043, var3.field10028, var3.field10038, var3.field10029, var3.field10033, var3.field10030, var3.field10032, var3.field10048, var3.field10034, var3.field10049, var3.field10045, var3.field10039);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[[I[[IIII)Ls;", line = 521)
    public final class419 method508(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class676(this, this.field741, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "()V", line = 524)
    public final void method142() {
        if (!this.field746) {
            this.field761 = null;
            this.field755 = null;
            this.field741 = null;
            this.field757 = null;
            this.field760.method4249((byte) 99);
            for (class318 var1 = (class318) this.field743.method3731((byte) -97); var1 != null; var1 = (class318) this.field743.method3729((byte) -112)) {
                var1.method1932();
            }
            this.field743.method3735(-4676);
            this.method494();
            if (this.field763) {
                class511.method2982(0, true, false);
                this.field763 = false;
            }
            this.method495();
            class270.method1724(105);
            this.field746 = true;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lida;IIII)Lka;", line = 599)
    public final class233 method514(class678 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class767(this, this.field741, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(II)Llf;", line = 603)
    public final class567 method76(int arg0, int arg1) {
        return this.method423(arg0, arg1, false);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lvr;Lvr;FLvr;)Lvr;", line = 607)
    public final class458 method94(class458 arg0, class458 arg1, float arg2, class458 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V", line = 648)
    public final void method137(boolean arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "K", descriptor = "([I)V")
    public final native void method422(int[] arg0);

    @OriginalMember(owner = "client!oa", name = "GA", descriptor = "(I)V")
    public final native void method97(int arg0);

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "(II)V")
    public final native void method75(int arg0, int arg1);

    @OriginalMember(owner = "client!oa", name = "aa", descriptor = "(IIIIII)V")
    public final native void method436(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V")
    private final native void method439(int arg0);

    @OriginalMember(owner = "client!oa", name = "EA", descriptor = "(IIII)V")
    public final native void method440(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "(Z)V")
    public final native void method444(boolean arg0);

    @OriginalMember(owner = "client!oa", name = "XA", descriptor = "()I")
    public final native int method445();

    @OriginalMember(owner = "client!oa", name = "ya", descriptor = "()V")
    public final native void method91();

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "(JJ)V")
    private final native void method448(long arg0, long arg1);

    @OriginalMember(owner = "client!oa", name = "DA", descriptor = "(IIII)V")
    public final native void method449(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "(Lp;)V")
    private final native void method450(class64 arg0);

    @OriginalMember(owner = "client!oa", name = "CA", descriptor = "(S[ISIBBIZBBBBZZZZZBZZI)V")
    private final native void method452(short arg0, int[] arg1, short arg2, int arg3, byte arg4, byte arg5, int arg6, boolean arg7, byte arg8, byte arg9, byte arg10, byte arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, boolean arg16, byte arg17, boolean arg18, boolean arg19, int arg20);

    @OriginalMember(owner = "client!oa", name = "Y", descriptor = "()[I")
    public final native int[] method459();

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "()I")
    public final native int method462();

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "(ILaa;II)V")
    public final native void method464(int arg0, class88 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "Z", descriptor = "(IIIIIILaa;II)V")
    private final native void method465(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class88 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIID)V")
    public final native void method79(int arg0, int arg1, int arg2, int arg3, double arg4);

    @OriginalMember(owner = "client!oa", name = "P", descriptor = "(IIIII)V")
    public final native void method468(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "(IIIIIII)I")
    public final native int method471(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!oa", name = "M", descriptor = "()I")
    public final native int method473();

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "()I")
    public final native int method474();

    @OriginalMember(owner = "client!oa", name = "ra", descriptor = "(IIII)V")
    public final native void method476(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "AA", descriptor = "(SSIBBIZBBBBZZZZZBZZI)V")
    private final native void method478(short arg0, short arg1, int arg2, byte arg3, byte arg4, int arg5, boolean arg6, byte arg7, byte arg8, byte arg9, byte arg10, boolean arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, byte arg16, boolean arg17, boolean arg18, int arg19);

    @OriginalMember(owner = "client!oa", name = "ma", descriptor = "(J)V")
    private final native void method481(long arg0);

    @OriginalMember(owner = "client!oa", name = "H", descriptor = "(III[I)V")
    public final native void method482(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!oa", name = "HA", descriptor = "(IIII[I)V")
    public final native void method483(int arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "(II)V")
    public final native void method484(int arg0, int arg1);

    @OriginalMember(owner = "client!oa", name = "da", descriptor = "(III[I)V")
    public final native void method485(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!oa", name = "wa", descriptor = "(IIIIII)V")
    private final native void method486(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "KA", descriptor = "(IIII)V")
    public final native void method488(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "FA", descriptor = "()V")
    private final native void method494();

    @OriginalMember(owner = "client!oa", name = "za", descriptor = "(IIIII)V")
    public final native void method502(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "MA", descriptor = "(Ld;II)V")
    private final native void method506(class103 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oa", name = "X", descriptor = "(I)V")
    public final native void method509(int arg0);

    @OriginalMember(owner = "client!oa", name = "Q", descriptor = "(IIIIII[BII)V")
    public final native void method510(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "(III)V")
    public final native void method511(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oa", name = "la", descriptor = "()V")
    public final native void method512();

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "(Z)V")
    public final native void method513(boolean arg0);

    @OriginalMember(owner = "client!oa", name = "pa", descriptor = "()V")
    public final native void method515();

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "()I")
    public final native int method60();

    @OriginalMember(owner = "client!oa", name = "xa", descriptor = "(F)V")
    public final native void method516(float arg0);

    @OriginalMember(owner = "client!oa", name = "ZA", descriptor = "(IFFFFF)V")
    public final native void method517(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!oa", name = "T", descriptor = "(IIII)V")
    public final native void method518(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "na", descriptor = "(IIII)[I")
    public final native int[] method82(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "JA", descriptor = "(IIIIII)I")
    public final native int method519(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "N", descriptor = "(I[I[F)V")
    private final native void method520(int arg0, int[] arg1, float[] arg2);

    @OriginalMember(owner = "client!oa", name = "U", descriptor = "(IIIII)V")
    public final native void method521(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "va", descriptor = "(Lza;)V")
    private final native void method522(class731 arg0);
}
