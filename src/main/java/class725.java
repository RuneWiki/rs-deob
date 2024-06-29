import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class725 extends class63 implements class560 {

    @OriginalMember(owner = "client!oa", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "Z")
    private boolean field10623 = false;

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "Lat;")
    private class398 field10622 = new class398();

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "I")
    private int field10635 = 4096;

    @OriginalMember(owner = "client!oa", name = "G", descriptor = "I")
    private int field10639 = 4096;

    @OriginalMember(owner = "client!oa", name = "N", descriptor = "Lqr;")
    private class69 field10638 = new class69(4);

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "Z")
    private boolean field10643 = false;

    @OriginalMember(owner = "client!oa", name = "H", descriptor = "Lsj;")
    private class486 field10637;

    @OriginalMember(owner = "client!oa", name = "P", descriptor = "[Ljava/lang/String;")
    private static final String[] field10645 = new String[] { method5273(method5272("D\u0012DfasSYxkd\u001aLq.f\u001fZ`o'\u0004C|f'\u001dEf#j\u001cDg.a\u001cD|.r\u001dFm}tSYgcb\u001cDm.p\u0001C|ktSC|")), method5273(method5272("t\u0004\u0019l")), method5273(method5272("T o")), method5273(method5272("D#\u007f")), method5273(method5272("m\u0012\\i f\u0004^&Mf\u001d\\i}")), method5273(method5272("t\u0016^Aii\u001cXm\\b\u0003Ka`s")), method5273(method5272("I\u001c\nEZ")), method5273(method5272("h\u0015L")) };

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "[I")
    private static int[] field10625 = new int[Math.max(Math.max(104, 20), 24573)];

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "[I")
    private static int[] field10626 = field10625;

    @OriginalMember(owner = "client!oa", name = "O", descriptor = "[I")
    public static int[] field10628 = field10625;

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "[F")
    private static float[] field10627 = new float[20];

    @OriginalMember(owner = "client!oa", name = "M", descriptor = "[I")
    private static int[] field10633 = field10625;

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "[F")
    private static float[] field10629 = field10627;

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "[I")
    private static int[] field10631 = new int[8191];

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "[B")
    private static byte[] field10640 = new byte[8191];

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "[S")
    private static short[] field10630 = new short[8191];

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "[I")
    public static int[] field10632 = new int[6];

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "[I")
    private static int[] field10641 = new int[8191];

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "I")
    public int field10644;

    @OriginalMember(owner = "client!oa", name = "J", descriptor = "Lp;")
    private class228 field10634;

    @OriginalMember(owner = "client!oa", name = "K", descriptor = "Lsj;")
    private class486 field10636;

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "Lya;")
    private class56 field10624;

    @OriginalMember(owner = "client!oa", name = "D", descriptor = "[La;")
    private class646[] field10642;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lkc;IIII)Lka;", line = 3)
    public final class499 method192(class141 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class41(this, this.field10624, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(IIIIII)V", line = 6)
    public final void method267(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method5265(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!oa", name = "finalize", descriptor = "()V", line = 11)
    protected final synchronized void finalize() {
        this.method668(-4369);
        if (this.nativeid != 0L) {
            class377.method3103(this, false);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lsn;Z)V", line = 19)
    private final void method5254(class659 arg0, boolean arg1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        for (class590 var8 = (class590) arg0.field9415.method3902((byte) -10); var8 != null; var8 = (class590) arg0.field9415.method3897(false)) {
            field10626[var3++] = var8.field8554;
            field10626[var3++] = var8.field8564;
            field10626[var3++] = var8.field8560;
            field10641[var4++] = var8.field8556;
            field10630[var6++] = (short) var8.field8566;
            field10631[var5++] = var8.field8559;
            if (arg1) {
                field10640[var7++] = var8.field8562;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "()V", line = 48)
    public final void method225() {
    }

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "()Z", line = 52)
    public final boolean method176() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(Z)V", line = 55)
    public final void method246(boolean arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "()Z", line = 58)
    public final boolean method167() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)I", line = 62)
    public final int method169(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(II)I", line = 66)
    public final int method151(int arg0, int arg1) {
        int var3 = arg0 & 1048575;
        int var4 = arg1 & 1048575;
        return var3 & var4 ^ var4;
    }

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "()Z", line = 72)
    public final boolean method158() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)Lel;", line = 76)
    public final class575 method209(int arg0, int arg1) {
        return this.method179(arg0, arg1, false);
    }

    @OriginalMember(owner = "client!oa", name = "OA", descriptor = "()Ljava/lang/Object;", line = 85)
    private final Object method5259() {
        return new class408(this);
    }

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "()Lsj;", line = 88)
    public final class486 method257() {
        return new class291();
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIIII)V", line = 92)
    public final void method208(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method250(arg0, arg1, arg2, arg4, arg5);
        this.method250(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method262(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
        this.method262(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILaa;II)V", line = 98)
    public final void method205(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class514 arg6, int arg7, int arg8) {
        this.method5268(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "()V", line = 103)
    public final void method202() {
        if (!this.field10623) {
            this.field10642 = null;
            this.field10634 = null;
            this.field10624 = null;
            this.field10637 = null;
            this.field10638.method730(true);
            for (class56 var1 = (class56) this.field10622.method3228(11); var1 != null; var1 = (class56) this.field10622.method3216(true)) {
                var1.method564();
            }
            this.field10622.method3224(false);
            this.method5260();
            if (this.field10643) {
                class300.method2587((byte) 93, false, true);
                this.field10643 = false;
            }
            this.method5262();
            class377.method3102((byte) -116);
            this.field10623 = true;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lkaa;[Luh;Z)Lda;", line = 134)
    public final class64 method184(class49 arg0, class174[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field2781;
            var5[var7] = arg1[var7].field2782;
            if (arg1[var7].field2779 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                throw new IllegalArgumentException(field10645[0]);
            } else {
                return new class695(this, this.field10624, arg0, arg1, (class107[]) null);
            }
        } else if (var6) {
            throw new IllegalArgumentException(field10645[0]);
        } else {
            return new class17(this, this.field10624, arg0, arg1, (class107[]) null);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIII)V", line = 171)
    public final void method236(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method5269().method4680(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V", line = 174)
    public final void method147(int arg0) {
        this.field10644 = arg0;
        this.field10642 = new class646[this.field10644];
        for (int var2 = 0; var2 < this.field10644; ++var2) {
            this.field10642[var2] = new class646(this, this.field10635, this.field10639);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILaa;IIIII)V", line = 187)
    public final void method261(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class514 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
    }

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "(I)V", line = 192)
    public final void method268(int arg0) {
        this.field10642[arg0].method4688();
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "()Z", line = 195)
    public final boolean method241() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "()Z", line = 198)
    public final boolean method160() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lsia;)V", line = 202)
    public final void method248(class769 arg0) {
        class638 var2 = (class638) arg0;
        this.method5256(var2.field9135.nativeid, var2.field9136.nativeid);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lsn;I)V", line = 207)
    public final void method172(class659 arg0, int arg1) {
        this.method5254(arg0, false);
        this.method5269().method4691(this, field10626, field10641, field10631, field10630, arg0.field9415.method3899((byte) -62));
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(S)Z", line = 211)
    private final boolean method5261(short arg0) {
        synchronized (this) {
            class304 var3 = super.field864.method1419(arg0, -109);
            if (var3 == null) {
                return false;
            } else {
                this.method5271(arg0, var3.field4894, var3.field4892, var3.field4913, var3.field4901, var3.field4907, var3.field4911, var3.field4893, var3.field4905, var3.field4899, var3.field4902, var3.field4890, var3.field4900, var3.field4906, var3.field4912, var3.field4909, var3.field4904, var3.field4898, var3.field4910, var3.field4896);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[[I[[IIII)Ls;", line = 224)
    public final class293 method204(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class699(this, this.field10624, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "()Z", line = 227)
    public final boolean method219() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ld;II)V", line = 363)
    public class725(Canvas arg0, class158 arg1, int arg2, int arg3) {
        super(arg1);
        try {
            if (!class259.method2177((byte) -72, field10645[1])) {
                throw new RuntimeException("");
            } else {
                class377.method3104(-62);
                this.method5255(super.field864, 0, 0);
                class517.method3877(true, false, 1);
                this.field10643 = true;
                this.field10637 = new class291();
                this.method254(new class291());
                this.method147(1);
                this.method234(0);
                if (arg0 != null) {
                    this.method231(arg0, arg2, arg3);
                    this.method210(arg0);
                }
            }
        } catch (Throwable var5) {
            this.method668(-4369);
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "(I)V", line = 235)
    public final void method260(int arg0) {
        class377.method3100((byte) 100);
        this.method5263(arg0);
        for (class56 var2 = (class56) this.field10622.method3228(11); var2 != null; var2 = (class56) this.field10622.method3216(true)) {
            var2.method565();
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 248)
    public final void method189(Canvas arg0) {
        if (this.field10634.field3556 == arg0) {
            this.method210((Canvas) null);
        }
        class228 var2 = (class228) this.field10638.method737((byte) -39, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method4173(-1);
            var2.method1995();
        }
    }

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "()V", line = 261)
    private final void method5262() {
        System.gc();
        System.runFinalization();
        class377.method3100((byte) 100);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lsn;)V", line = 266)
    public final void method191(class659 arg0) {
        if (arg0.field9415.method3899((byte) 93) != 0) {
            this.method5254(arg0, false);
            this.method5269().method4691(this, field10626, field10641, field10631, field10630, arg0.field9415.method3899((byte) 122));
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lza;)V", line = 273)
    public final void method157(class437 arg0) {
        this.field10624 = (class56) arg0;
        this.method5266(arg0);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;II)V", line = 278)
    public final void method231(Canvas arg0, int arg1, int arg2) {
        class228 var4 = (class228) this.field10638.method737((byte) -39, (long) arg0.hashCode());
        if (var4 == null) {
            try {
                Class var5 = Class.forName(field10645[4]);
                Method var6 = var5.getMethod(field10645[5], Boolean.TYPE);
                var6.invoke(arg0, Boolean.TRUE);
            } catch (Exception var8) {
            }
            class228 var7 = new class228(this, arg0, arg1, arg2);
            this.field10638.method738(var7, (long) arg0.hashCode(), -12002);
        } else {
            if (var4.field3554 != arg1 || var4.field3558 != arg2) {
                var4.method1996(arg0, arg1, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "()Z", line = 302)
    public final boolean method203() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "()Lsj;", line = 306)
    public final class486 method271() {
        return this.field10636;
    }

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "(I)Lza;", line = 311)
    public final class437 method228(int arg0) {
        class56 var2 = new class56(this, arg0);
        this.field10622.method3220(var2, 0);
        return var2;
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(Z)V", line = 315)
    public final void method178(boolean arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(II)Ltq;", line = 318)
    public final class657 method223(int arg0, int arg1) {
        return new class529(arg0, arg1);
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(IIIIII)Llia;", line = 322)
    public final class505 method235(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Llia;)V", line = 324)
    public final void method253(class505 arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)V", line = 327)
    public final void method150(int arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "()Z", line = 330)
    public final boolean method245() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(FFF)V", line = 332)
    public final void method159(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V", line = 336)
    public final void method256(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class146 {
        if (this.field10634 == null) {
            throw new IllegalStateException(field10645[7]);
        } else {
            this.field10634.method2000(arg0, arg1, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "()Z", line = 348)
    public final boolean method238() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;II)V", line = 352)
    public final void method232(Canvas arg0, int arg1, int arg2) {
        class228 var4 = (class228) this.field10638.method737((byte) -39, (long) arg0.hashCode());
        var4.method1996(arg0, arg1, arg2);
        if (arg0 != null && this.field10634.field3556 == arg0) {
            this.method210(arg0);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIIIIIII)V", line = 391)
    public final void method163(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
    }

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "()Z", line = 398)
    public final boolean method263() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "()V", line = 404)
    public final void method215() {
    }

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "()Lsj;", line = 410)
    public final class486 method251() {
        return this.field10637;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lel;Ltq;)Lsia;", line = 417)
    public final class769 method217(class575 arg0, class657 arg1) {
        return new class638(this, (class569) arg0, (class529) arg1);
    }

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "()La;", line = 422)
    public final class646 method5269() {
        for (int var1 = 0; var1 < this.field10644; ++var1) {
            if (this.field10642[var1].field9265 == Thread.currentThread()) {
                return this.field10642[var1];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIII)V", line = 433)
    public final void method197(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([IIIIIZ)Lhk;", line = 436)
    public final class107 method266(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return new class569(this, arg0, arg1, arg2, arg3, arg4, false);
    }

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "()V", line = 440)
    public final void method216() {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([I)V", line = 444)
    public final void method220(int[] arg0) {
        Dimension var2 = this.field10634.field3556.getSize();
        arg0[0] = var2.width;
        arg0[1] = var2.height;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIZ)Lhk;", line = 449)
    public final class107 method179(int arg0, int arg1, boolean arg2) {
        return new class569(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!oa", name = "WA", descriptor = "(S)Z", line = 452)
    private final boolean method5270(short arg0) {
        class158 var2 = super.field864;
        synchronized (super.field864) {
            if (!super.field864.method1417((byte) -104, arg0)) {
                return false;
            } else {
                class304 var4 = super.field864.method1419(arg0, -122);
                if (var4 == null) {
                    return false;
                } else {
                    int[] var6;
                    if (var4.field4892 != 2) {
                        var6 = super.field864.method1420(128, true, 128, arg0, 0.7F, -7385);
                    } else {
                        var6 = super.field864.method1415(arg0, 0.7F, 128, 128, 28039, true);
                    }
                    this.method5267(arg0, var6, var4.field4894, var4.field4892, var4.field4913, var4.field4901, var4.field4907, var4.field4911, var4.field4893, var4.field4905, var4.field4899, var4.field4902, var4.field4890, var4.field4900, var4.field4906, var4.field4912, var4.field4909, var4.field4904, var4.field4898, var4.field4910, var4.field4896);
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "()Z", line = 480)
    public final boolean method152() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "()V", line = 482)
    public final void method233() {
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V", line = 486)
    public final void method234(int arg0) {
        this.field10642[arg0].method4689();
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Llia;Llia;FLlia;)Llia;", line = 490)
    public final class505 method249(class505 arg0, class505 arg1, float arg2, class505 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIZ)Lhk;", line = 493)
    public final class107 method211(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return new class569(this, arg0, arg1, arg2, arg3, !arg4);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)V", line = 495)
    public final void method164(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "()V", line = 499)
    public final void method222() {
        this.method210(this.field10634.field3556);
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(II)V", line = 504)
    public final void method171(int arg0, int arg1) throws class146 {
        if (this.field10634 == null) {
            throw new IllegalStateException(field10645[7]);
        } else {
            this.field10634.method1998(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "()Z", line = 520)
    public final boolean method148() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "()Lwaa;", line = 526)
    public final class734 method240() {
        return new class734(0, field10645[2], 1, field10645[3], 0L);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[Lih;)V", line = 531)
    public final void method218(int arg0, class731[] arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < arg0; ++var4) {
            field10633[var3++] = arg1[var4].method5300(32);
            field10633[var3++] = arg1[var4].method5297(false);
            field10633[var3++] = arg1[var4].method5298(-4);
            field10633[var3++] = arg1[var4].method5295(32);
            field10629[var4] = arg1[var4].method5299(31541);
            field10633[var3++] = arg1[var4].method5294(true);
        }
        this.method5264(arg0, field10633, field10629);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Luh;Z)Lhk;", line = 550)
    public final class107 method213(class174 arg0, boolean arg1) {
        class569 var3 = new class569(this, arg0.field2775, arg0.field2776, arg0.field2779, 0, arg0.field2781, arg0.field2781, arg0.field2782);
        var3.method24(arg0.field2774, arg0.field2778, arg0.field2777, arg0.field2780);
        return var3;
    }

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "()I", line = 557)
    public final int method177() {
        return 4;
    }

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "()Z", line = 561)
    public final boolean method269() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lsj;)V", line = 566)
    public final void method254(class486 arg0) {
        this.field10636 = arg0;
        this.method5257(((class291) arg0).nativeid);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIF)Lih;", line = 575)
    public final class731 method195(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return new class359(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "(I)V", line = 587)
    public final void method270(int arg0) {
        this.field10635 = this.field10639 = arg0;
        if (this.field10644 > 1) {
            throw new IllegalStateException(field10645[6]);
        } else {
            this.method147(this.field10644);
            this.method234(0);
        }
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "()V", line = 594)
    public final void method194() {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[I[I)Laa;", line = 598)
    public final class514 method258(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class48(this, this.field10624, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 602)
    public final void method210(Canvas arg0) {
        if (arg0 != null) {
            class228 var2 = (class228) this.field10638.method737((byte) -39, (long) arg0.hashCode());
            this.field10634 = var2;
            this.method5258(var2);
        } else {
            this.field10634 = null;
            this.method5258((class228) null);
        }
    }

    @OriginalMember(owner = "client!oa", name = "H", descriptor = "(III[I)V")
    public final native void method229(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!oa", name = "xa", descriptor = "(F)V")
    public final native void method166(float arg0);

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "()I")
    public final native int method155();

    @OriginalMember(owner = "client!oa", name = "MA", descriptor = "(Ld;II)V")
    private final native void method5255(class158 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "(JJ)V")
    private final native void method5256(long arg0, long arg1);

    @OriginalMember(owner = "client!oa", name = "ma", descriptor = "(J)V")
    private final native void method5257(long arg0);

    @OriginalMember(owner = "client!oa", name = "aa", descriptor = "(IIIIII)V")
    public final native void method242(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "Q", descriptor = "(IIIIII[BII)V")
    public final native void method168(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!oa", name = "KA", descriptor = "(IIII)V")
    public final native void method221(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "la", descriptor = "()V")
    public final native void method227();

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "(Lp;)V")
    private final native void method5258(class228 arg0);

    @OriginalMember(owner = "client!oa", name = "GA", descriptor = "(I)V")
    public final native void method182(int arg0);

    @OriginalMember(owner = "client!oa", name = "na", descriptor = "(IIII)[I")
    public final native int[] method207(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "FA", descriptor = "()V")
    private final native void method5260();

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "(II)V")
    public final native void method247(int arg0, int arg1);

    @OriginalMember(owner = "client!oa", name = "K", descriptor = "([I)V")
    public final native void method201(int[] arg0);

    @OriginalMember(owner = "client!oa", name = "X", descriptor = "(I)V")
    public final native void method149(int arg0);

    @OriginalMember(owner = "client!oa", name = "XA", descriptor = "()I")
    public final native int method193();

    @OriginalMember(owner = "client!oa", name = "JA", descriptor = "(IIIIII)I")
    public final native int method252(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "HA", descriptor = "(IIII[I)V")
    public final native void method180(int arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!oa", name = "ZA", descriptor = "(IFFFFF)V")
    public final native void method243(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V")
    private final native void method5263(int arg0);

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "()I")
    public final native int method187();

    @OriginalMember(owner = "client!oa", name = "N", descriptor = "(I[I[F)V")
    private final native void method5264(int arg0, int[] arg1, float[] arg2);

    @OriginalMember(owner = "client!oa", name = "wa", descriptor = "(IIIIII)V")
    private final native void method5265(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "Y", descriptor = "()[I")
    public final native int[] method212();

    @OriginalMember(owner = "client!oa", name = "ra", descriptor = "(IIII)V")
    public final native void method259(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "(III)V")
    public final native void method237(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oa", name = "va", descriptor = "(Lza;)V")
    private final native void method5266(class437 arg0);

    @OriginalMember(owner = "client!oa", name = "CA", descriptor = "(S[ISIBBIZBBBBZZZZZBZZI)V")
    private final native void method5267(short arg0, int[] arg1, short arg2, int arg3, byte arg4, byte arg5, int arg6, boolean arg7, byte arg8, byte arg9, byte arg10, byte arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, boolean arg16, byte arg17, boolean arg18, boolean arg19, int arg20);

    @OriginalMember(owner = "client!oa", name = "T", descriptor = "(IIII)V")
    public final native void method162(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "M", descriptor = "()I")
    public final native int method198();

    @OriginalMember(owner = "client!oa", name = "Z", descriptor = "(IIIIIILaa;II)V")
    private final native void method5268(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class514 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!oa", name = "za", descriptor = "(IIIII)V")
    public final native void method174(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "(Z)V")
    public final native void method265(boolean arg0);

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "(Z)V")
    public final native void method121(boolean arg0);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIID)V")
    public final native void method199(int arg0, int arg1, int arg2, int arg3, double arg4);

    @OriginalMember(owner = "client!oa", name = "AA", descriptor = "(SSIBBIZBBBBZZZZZBZZI)V")
    private final native void method5271(short arg0, short arg1, int arg2, byte arg3, byte arg4, int arg5, boolean arg6, byte arg7, byte arg8, byte arg9, byte arg10, boolean arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, byte arg16, boolean arg17, boolean arg18, int arg19);

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "()I")
    public final native int method154();

    @OriginalMember(owner = "client!oa", name = "DA", descriptor = "(IIII)V")
    public final native void method156(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "(ILaa;II)V")
    public final native void method170(int arg0, class514 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "EA", descriptor = "(IIII)V")
    public final native void method214(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "U", descriptor = "(IIIII)V")
    public final native void method250(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "da", descriptor = "(III[I)V")
    public final native void method239(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!oa", name = "ya", descriptor = "()V")
    public final native void method196();

    @OriginalMember(owner = "client!oa", name = "P", descriptor = "(IIIII)V")
    public final native void method262(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "pa", descriptor = "()V")
    public final native void method181();

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "(IIIIIII)I")
    public final native int method183(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "(II)V")
    public final native void method161(int arg0, int arg1);

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5272(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 14);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5273(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 7;
                    break;
                case 1:
                    var10005 = 115;
                    break;
                case 2:
                    var10005 = 42;
                    break;
                case 3:
                    var10005 = 8;
                    break;
                default:
                    var10005 = 14;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
