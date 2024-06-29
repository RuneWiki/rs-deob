import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class695 extends class59 implements class533 {

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "Z")
    private boolean field9665 = false;

    @OriginalMember(owner = "client!oa", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "Lro;")
    private class2 field9667 = new class2();

    @OriginalMember(owner = "client!oa", name = "G", descriptor = "I")
    private int field9677 = 4096;

    @OriginalMember(owner = "client!oa", name = "N", descriptor = "I")
    private int field9684 = 4096;

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "Ldu;")
    private class360 field9676 = new class360(4);

    @OriginalMember(owner = "client!oa", name = "P", descriptor = "Z")
    private boolean field9686 = false;

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "Lofa;")
    private class333 field9672;

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "[I")
    private static int[] field9668 = new int[Math.max(Math.max(104, 20), 24573)];

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "[I")
    public static int[] field9670 = field9668;

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "[S")
    private static short[] field9673 = new short[8191];

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "[I")
    private static int[] field9671 = new int[8191];

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "[B")
    private static byte[] field9669 = new byte[8191];

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "[I")
    private static int[] field9675 = field9668;

    @OriginalMember(owner = "client!oa", name = "K", descriptor = "[I")
    private static int[] field9681 = field9668;

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "[F")
    private static float[] field9679 = new float[20];

    @OriginalMember(owner = "client!oa", name = "J", descriptor = "[F")
    private static float[] field9680 = field9679;

    @OriginalMember(owner = "client!oa", name = "M", descriptor = "[I")
    public static int[] field9683 = new int[6];

    @OriginalMember(owner = "client!oa", name = "D", descriptor = "[I")
    private static int[] field9674 = new int[8191];

    @OriginalMember(owner = "client!oa", name = "Q", descriptor = "I")
    public int field9687;

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "Lp;")
    private class220 field9682;

    @OriginalMember(owner = "client!oa", name = "H", descriptor = "Lofa;")
    private class333 field9678;

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "Lya;")
    private class52 field9666;

    @OriginalMember(owner = "client!oa", name = "O", descriptor = "[La;")
    private class619[] field9685;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "()Z", line = 4)
    public final boolean method414() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "()Z", line = 7)
    public final boolean method390() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIII)V", line = 13)
    public final void method412(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method3916(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)V", line = 15)
    public final void method482(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[I[I)Laa;", line = 20)
    public final class490 method506(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class46(this, this.field9666, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "()Lofa;", line = 25)
    public final class333 method451() {
        return this.field9672;
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ld;II)V", line = 58)
    public class695(Canvas arg0, class152 arg1, int arg2, int arg3) {
        super(arg1);
        try {
            if (!class702.method3952(118, "sw3d")) {
                throw new RuntimeException("");
            } else {
                class521.method2894(-1);
                this.method3923(super.field717, 0, 0);
                class60.method519(false, true, true);
                this.field9686 = true;
                this.field9672 = new class280();
                this.method481(new class280());
                this.method437(1);
                this.method497(0);
                if (arg0 != null) {
                    this.method395(arg0, arg2, arg3);
                    this.method472(arg0);
                }
            }
        } catch (Throwable var5) {
            this.method487(119);
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([IIIIIZ)Lhu;", line = 34)
    public final class133 method495(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return new class542(this, arg0, arg1, arg2, arg3, arg4, false);
    }

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "()Z", line = 39)
    public final boolean method442() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "()Z", line = 42)
    public final boolean method449() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "(I)V", line = 47)
    public final void method497(int arg0) {
        this.field9685[arg0].method3398();
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lmj;Lbba;)Lnc;", line = 50)
    public final class23 method463(class655 arg0, class115 arg1) {
        return new class611(this, (class542) arg0, (class504) arg1);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lur;IIII)Lka;", line = 53)
    public final class475 method401(class538 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class39(this, this.field9666, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIIIIIII)V", line = 55)
    public final void method462(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Luj;I)V", line = 85)
    public final void method407(class388 arg0, int arg1) {
        this.method3913(arg0, false);
        this.method3917().method3395(this, field9675, field9674, field9671, field9673, arg0.field5411.method135(0));
    }

    @OriginalMember(owner = "client!oa", name = "finalize", descriptor = "()V", line = 91)
    protected final synchronized void finalize() {
        this.method487(121);
        if (this.nativeid != 0L) {
            class521.method2896(this, (byte) -106);
        }
    }

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "()V", line = 96)
    public final void method475() {
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(II)I", line = 99)
    public final int method410(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lrc;[Ljn;Z)Lda;", line = 108)
    public final class60 method425(class539 arg0, class720[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field10028;
            var5[var7] = arg1[var7].field10029;
            if (arg1[var7].field10030 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
            } else {
                return new class665(this, this.field9666, arg0, arg1, (class133[]) null);
            }
        } else if (var6) {
            throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
        } else {
            return new class16(this, this.field9666, arg0, arg1, (class133[]) null);
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;II)V", line = 150)
    public final void method484(Canvas arg0, int arg1, int arg2) {
        class220 var4 = (class220) this.field9676.method2135((long) arg0.hashCode(), (byte) 31);
        var4.method1417(arg0, arg1, arg2);
        if (arg0 != null && this.field9682.field3152 == arg0) {
            this.method472(arg0);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIII)V", line = 157)
    public final void method499(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Luj;Z)V", line = 161)
    private final void method3913(class388 arg0, boolean arg1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        for (class128 var8 = (class128) arg0.field5411.method136((byte) 118); var8 != null; var8 = (class128) arg0.field5411.method137(-126)) {
            field9675[var3++] = var8.field2110;
            field9675[var3++] = var8.field2107;
            field9675[var3++] = var8.field2111;
            field9674[var4++] = var8.field2113;
            field9673[var6++] = (short) var8.field2115;
            field9671[var5++] = var8.field2112;
            if (arg1) {
                field9669[var7++] = var8.field2104;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "()V", line = 190)
    public final void method431() {
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(S)Z", line = 195)
    private final boolean method3915(short arg0) {
        synchronized (this) {
            class758 var3 = super.field717.method91(arg0, (byte) 127);
            if (var3 == null) {
                return false;
            } else {
                this.method3918(arg0, var3.field10546, var3.field10541, var3.field10536, var3.field10558, var3.field10557, var3.field10548, var3.field10542, var3.field10537, var3.field10555, var3.field10554, var3.field10534, var3.field10543, var3.field10550, var3.field10544, var3.field10551, var3.field10535, var3.field10538, var3.field10547, var3.field10545);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "()Lofa;", line = 206)
    public final class333 method474() {
        return this.field9678;
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "()Lkea;", line = 209)
    public final class240 method397() {
        return new class240(0, "SSE", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V", line = 211)
    public final void method456(boolean arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)Lbba;", line = 214)
    public final class115 method394(int arg0, int arg1) {
        return new class504(arg0, arg1);
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V", line = 219)
    public final void method437(int arg0) {
        this.field9687 = arg0;
        this.field9685 = new class619[this.field9687];
        for (int var2 = 0; var2 < this.field9687; ++var2) {
            this.field9685[var2] = new class619(this, this.field9684, this.field9677);
        }
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(IIIIII)Ltea;", line = 232)
    public final class241 method477(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "()V", line = 235)
    public final void method511() {
        this.method472(this.field9682.field3152);
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(IIIIII)V", line = 238)
    public final void method455(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method480(arg0, arg1, arg2, arg4, arg5);
        this.method480(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method428(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
        this.method428(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Luj;)V", line = 246)
    public final void method508(class388 arg0) {
        if (arg0.field5411.method135(0) != 0) {
            this.method3913(arg0, false);
            this.method3917().method3395(this, field9675, field9674, field9671, field9673, arg0.field5411.method135(0));
        }
    }

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "()La;", line = 255)
    public final class619 method3917() {
        for (int var1 = 0; var1 < this.field9687; ++var1) {
            if (this.field9685[var1].field8262 == Thread.currentThread()) {
                return this.field9685[var1];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 267)
    public final void method472(Canvas arg0) {
        if (arg0 != null) {
            class220 var2 = (class220) this.field9676.method2135((long) arg0.hashCode(), (byte) 31);
            this.field9682 = var2;
            this.method3914(var2);
        } else {
            this.field9682 = null;
            this.method3914((class220) null);
        }
    }

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "()V", line = 282)
    public final void method500() {
    }

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "()Z", line = 289)
    public final boolean method443() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lofa;)V", line = 292)
    public final void method481(class333 arg0) {
        this.field9678 = arg0;
        this.method3909(((class280) arg0).nativeid);
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(II)V", line = 296)
    public final void method465(int arg0, int arg1) throws class149 {
        if (this.field9682 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field9682.method1415(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "()Z", line = 307)
    public final boolean method468() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ltea;Ltea;FLtea;)Ltea;", line = 310)
    public final class241 method429(class241 arg0, class241 arg1, float arg2, class241 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;II)V", line = 316)
    public final void method395(Canvas arg0, int arg1, int arg2) {
        class220 var4 = (class220) this.field9676.method2135((long) arg0.hashCode(), (byte) 31);
        if (var4 == null) {
            try {
                Class var5 = Class.forName("java.awt.Canvas");
                Method var6 = var5.getMethod("setIgnoreRepaint", Boolean.TYPE);
                var6.invoke(arg0, Boolean.TRUE);
            } catch (Exception var8) {
            }
            class220 var7 = new class220(this, arg0, arg1, arg2);
            this.field9676.method2143(-1, var7, (long) arg0.hashCode());
        } else {
            if (var4.field3154 != arg1 || var4.field3151 != arg2) {
                var4.method1417(arg0, arg1, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)Lza;", line = 341)
    public final class418 method408(int arg0) {
        class52 var2 = new class52(this, arg0);
        this.field9667.method11(var2, -126);
        return var2;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[[I[[IIII)Ls;", line = 348)
    public final class282 method452(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class669(this, this.field9666, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILaa;IIIII)V", line = 350)
    public final void method447(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class490 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
    }

    @OriginalMember(owner = "client!oa", name = "OA", descriptor = "()Ljava/lang/Object;", line = 353)
    private final Object method3920() {
        return new class391(this);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(FFF)V", line = 355)
    public final void method403(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "()Z", line = 358)
    public final boolean method505() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "()Z", line = 361)
    public final boolean method391() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "()Z", line = 366)
    public final boolean method459() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "()V", line = 368)
    public final void method503() {
    }

    @OriginalMember(owner = "client!oa", name = "WA", descriptor = "(S)Z", line = 374)
    private final boolean method3922(short arg0) {
        class152 var2 = super.field717;
        synchronized (super.field717) {
            if (!super.field717.method85(arg0, -32345)) {
                return false;
            } else {
                class758 var4 = super.field717.method91(arg0, (byte) 124);
                if (var4 == null) {
                    return false;
                } else {
                    int[] var6;
                    if (var4.field10541 != 2) {
                        var6 = super.field717.method86(-128, 128, 0.7F, true, arg0, 128);
                    } else {
                        var6 = super.field717.method92(true, (byte) -80, 128, 128, 0.7F, arg0);
                    }
                    this.method3919(arg0, var6, var4.field10546, var4.field10541, var4.field10536, var4.field10558, var4.field10557, var4.field10548, var4.field10542, var4.field10537, var4.field10555, var4.field10554, var4.field10534, var4.field10543, var4.field10550, var4.field10544, var4.field10551, var4.field10535, var4.field10538, var4.field10547, var4.field10545);
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[Ltn;)V", line = 399)
    public final void method460(int arg0, class87[] arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < arg0; ++var4) {
            field9681[var3++] = arg1[var4].method665(107);
            field9681[var3++] = arg1[var4].method669(-22096);
            field9681[var3++] = arg1[var4].method670((byte) -110);
            field9681[var3++] = arg1[var4].method673(-114);
            field9680[var4] = arg1[var4].method666((byte) 110);
            field9681[var3++] = arg1[var4].method671(false);
        }
        this.method3910(arg0, field9681, field9680);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V", line = 417)
    public final void method446(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class149 {
        if (this.field9682 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field9682.method1411(arg0, arg1, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIZ)Lhu;", line = 427)
    public final class133 method409(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return new class542(this, arg0, arg1, arg2, arg3, !arg4);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lnc;)V", line = 431)
    public final void method444(class23 arg0) {
        class611 var2 = (class611) arg0;
        this.method3912(var2.field8146.nativeid, var2.field8145.nativeid);
    }

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "()Z", line = 435)
    public final boolean method426() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)V", line = 439)
    public final void method441(int arg0) {
        this.field9685[arg0].method3384();
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)I", line = 443)
    public final int method405(int arg0, int arg1) {
        int var3 = arg0 & 1048575;
        int var4 = arg1 & 1048575;
        return var3 & var4 ^ var4;
    }

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "()V", line = 451)
    private final void method3924() {
        System.gc();
        System.runFinalization();
        class521.method2893(false);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ltea;)V", line = 459)
    public final void method440(class241 arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "()V", line = 463)
    public final void method458() {
        if (!this.field9665) {
            this.field9685 = null;
            this.field9682 = null;
            this.field9666 = null;
            this.field9672 = null;
            this.field9676.method2138(-1);
            for (class52 var1 = (class52) this.field9667.method21(2); var1 != null; var1 = (class52) this.field9667.method9(-127)) {
                var1.method362();
            }
            this.field9667.method23(10);
            this.method3911();
            if (this.field9686) {
                class60.method530(false, true, (byte) 119);
                this.field9686 = false;
            }
            this.method3924();
            class521.method2895(-26583);
            this.field9665 = true;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljn;Z)Lhu;", line = 494)
    public final class133 method415(class720 arg0, boolean arg1) {
        class542 var3 = new class542(this, arg0.field10027, arg0.field10023, arg0.field10030, 0, arg0.field10028, arg0.field10028, arg0.field10029);
        var3.method1032(arg0.field10024, arg0.field10031, arg0.field10026, arg0.field10025);
        return var3;
    }

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "()Z", line = 500)
    public final boolean method436() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([I)V", line = 504)
    public final void method510(int[] arg0) {
        Dimension var2 = this.field9682.field3152.getSize();
        arg0[0] = var2.width;
        arg0[1] = var2.height;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Z)V", line = 508)
    public final void method496(boolean arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIF)Ltn;", line = 511)
    public final class87 method413(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return new class594(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIZ)Lhu;", line = 514)
    public final class133 method418(int arg0, int arg1, boolean arg2) {
        return new class542(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lza;)V", line = 518)
    public final void method457(class418 arg0) {
        this.field9666 = (class52) arg0;
        this.method3908(arg0);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILaa;II)V", line = 523)
    public final void method411(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class490 arg6, int arg7, int arg8) {
        this.method3921(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "()Lofa;", line = 526)
    public final class333 method421() {
        return new class280();
    }

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "(I)V", line = 530)
    public final void method501(int arg0) {
        class521.method2893(false);
        this.method3907(arg0);
        for (class52 var2 = (class52) this.field9667.method21(2); var2 != null; var2 = (class52) this.field9667.method9(-127)) {
            var2.method363();
        }
    }

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "()Z", line = 544)
    public final boolean method485() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "(I)V", line = 548)
    public final void method492(int arg0) {
        this.field9684 = this.field9677 = arg0;
        if (this.field9687 > 1) {
            throw new IllegalStateException("No MT");
        } else {
            this.method437(this.field9687);
            this.method497(0);
        }
    }

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "()V", line = 556)
    public final void method439() {
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 566)
    public final void method507(Canvas arg0) {
        if (this.field9682.field3152 == arg0) {
            this.method472((Canvas) null);
        }
        class220 var2 = (class220) this.field9676.method2135((long) arg0.hashCode(), (byte) 31);
        if (var2 != null) {
            var2.method3564(true);
            var2.method1413();
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIII)V", line = 580)
    public final void method404(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method3917().method3396(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "()Z", line = 586)
    public final boolean method512() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "()I", line = 594)
    public final int method466() {
        return 4;
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(II)Lmj;", line = 598)
    public final class655 method417(int arg0, int arg1) {
        return this.method418(arg0, arg1, false);
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V", line = 614)
    public final void method420(int arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!oa", name = "xa", descriptor = "(F)V")
    public final native void method486(float arg0);

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V")
    private final native void method3907(int arg0);

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "(Z)V")
    public final native void method116(boolean arg0);

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "(II)V")
    public final native void method406(int arg0, int arg1);

    @OriginalMember(owner = "client!oa", name = "va", descriptor = "(Lza;)V")
    private final native void method3908(class418 arg0);

    @OriginalMember(owner = "client!oa", name = "ma", descriptor = "(J)V")
    private final native void method3909(long arg0);

    @OriginalMember(owner = "client!oa", name = "DA", descriptor = "(IIII)V")
    public final native void method445(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "T", descriptor = "(IIII)V")
    public final native void method433(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "P", descriptor = "(IIIII)V")
    public final native void method428(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "U", descriptor = "(IIIII)V")
    public final native void method480(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "M", descriptor = "()I")
    public final native int method448();

    @OriginalMember(owner = "client!oa", name = "la", descriptor = "()V")
    public final native void method435();

    @OriginalMember(owner = "client!oa", name = "N", descriptor = "(I[I[F)V")
    private final native void method3910(int arg0, int[] arg1, float[] arg2);

    @OriginalMember(owner = "client!oa", name = "Q", descriptor = "(IIIIII[BII)V")
    public final native void method430(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!oa", name = "KA", descriptor = "(IIII)V")
    public final native void method419(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "FA", descriptor = "()V")
    private final native void method3911();

    @OriginalMember(owner = "client!oa", name = "XA", descriptor = "()I")
    public final native int method402();

    @OriginalMember(owner = "client!oa", name = "X", descriptor = "(I)V")
    public final native void method479(int arg0);

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "()I")
    public final native int method396();

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "(JJ)V")
    private final native void method3912(long arg0, long arg1);

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "(Lp;)V")
    private final native void method3914(class220 arg0);

    @OriginalMember(owner = "client!oa", name = "pa", descriptor = "()V")
    public final native void method478();

    @OriginalMember(owner = "client!oa", name = "wa", descriptor = "(IIIIII)V")
    private final native void method3916(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "aa", descriptor = "(IIIIII)V")
    public final native void method504(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "AA", descriptor = "(SSIBBIZBBBBZZZZZBZZI)V")
    private final native void method3918(short arg0, short arg1, int arg2, byte arg3, byte arg4, int arg5, boolean arg6, byte arg7, byte arg8, byte arg9, byte arg10, boolean arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, byte arg16, boolean arg17, boolean arg18, int arg19);

    @OriginalMember(owner = "client!oa", name = "CA", descriptor = "(S[ISIBBIZBBBBZZZZZBZZI)V")
    private final native void method3919(short arg0, int[] arg1, short arg2, int arg3, byte arg4, byte arg5, int arg6, boolean arg7, byte arg8, byte arg9, byte arg10, byte arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, boolean arg16, byte arg17, boolean arg18, boolean arg19, int arg20);

    @OriginalMember(owner = "client!oa", name = "HA", descriptor = "(IIII[I)V")
    public final native void method398(int arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!oa", name = "da", descriptor = "(III[I)V")
    public final native void method471(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "(II)V")
    public final native void method491(int arg0, int arg1);

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "(IIIIIII)I")
    public final native int method400(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!oa", name = "Z", descriptor = "(IIIIIILaa;II)V")
    private final native void method3921(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class490 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!oa", name = "ya", descriptor = "()V")
    public final native void method454();

    @OriginalMember(owner = "client!oa", name = "EA", descriptor = "(IIII)V")
    public final native void method502(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "ra", descriptor = "(IIII)V")
    public final native void method490(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "MA", descriptor = "(Ld;II)V")
    private final native void method3923(class152 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oa", name = "H", descriptor = "(III[I)V")
    public final native void method494(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!oa", name = "GA", descriptor = "(I)V")
    public final native void method392(int arg0);

    @OriginalMember(owner = "client!oa", name = "na", descriptor = "(IIII)[I")
    public final native int[] method473(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "(III)V")
    public final native void method476(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "()I")
    public final native int method488();

    @OriginalMember(owner = "client!oa", name = "ZA", descriptor = "(IFFFFF)V")
    public final native void method423(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!oa", name = "Y", descriptor = "()[I")
    public final native int[] method469();

    @OriginalMember(owner = "client!oa", name = "JA", descriptor = "(IIIIII)I")
    public final native int method438(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "(Z)V")
    public final native void method493(boolean arg0);

    @OriginalMember(owner = "client!oa", name = "za", descriptor = "(IIIII)V")
    public final native void method416(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "()I")
    public final native int method424();

    @OriginalMember(owner = "client!oa", name = "K", descriptor = "([I)V")
    public final native void method393(int[] arg0);

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "(ILaa;II)V")
    public final native void method432(int arg0, class490 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIID)V")
    public final native void method483(int arg0, int arg1, int arg2, int arg3, double arg4);
}
