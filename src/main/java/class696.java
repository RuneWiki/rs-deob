import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class696 extends class60 implements class534 {

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "Z")
    private boolean field9590 = false;

    @OriginalMember(owner = "client!oa", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "Lada;")
    private class164 field9591 = new class164();

    @OriginalMember(owner = "client!oa", name = "J", descriptor = "I")
    private int field9603 = 4096;

    @OriginalMember(owner = "client!oa", name = "H", descriptor = "I")
    private int field9601 = 4096;

    @OriginalMember(owner = "client!oa", name = "M", descriptor = "Lhe;")
    private class372 field9606 = new class372(4);

    @OriginalMember(owner = "client!oa", name = "T", descriptor = "Z")
    private boolean field9612 = false;

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "Lql;")
    private class738 field9602;

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "[I")
    private static int[] field9593 = new int[Math.max(Math.max(104, 20), 24573)];

    @OriginalMember(owner = "client!oa", name = "D", descriptor = "[S")
    private static short[] field9597 = new short[8191];

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "[I")
    public static int[] field9595 = new int[6];

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "[I")
    private static int[] field9599 = new int[8191];

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "[F")
    private static float[] field9605 = new float[20];

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "[I")
    private static int[] field9598 = new int[8191];

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "[F")
    private static float[] field9594 = field9605;

    @OriginalMember(owner = "client!oa", name = "G", descriptor = "[B")
    private static byte[] field9600 = new byte[8191];

    @OriginalMember(owner = "client!oa", name = "P", descriptor = "[I")
    public static int[] field9609 = field9593;

    @OriginalMember(owner = "client!oa", name = "O", descriptor = "[I")
    private static int[] field9608 = field9593;

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "[I")
    private static int[] field9596 = field9593;

    @OriginalMember(owner = "client!oa", name = "R", descriptor = "I")
    public int field9611;

    @OriginalMember(owner = "client!oa", name = "K", descriptor = "Lp;")
    private class219 field9604;

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "Lya;")
    private class53 field9592;

    @OriginalMember(owner = "client!oa", name = "N", descriptor = "Lql;")
    private class738 field9607;

    @OriginalMember(owner = "client!oa", name = "Q", descriptor = "[La;")
    private class621[] field9610;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(S)Z", line = 3)
    private final boolean method3941(short arg0) {
        synchronized (this) {
            class293 var3 = super.field849.method1124((byte) 82, arg0);
            if (var3 == null) {
                return false;
            } else {
                this.method3956(arg0, var3.field4175, var3.field4192, var3.field4185, var3.field4176, var3.field4172, var3.field4174, var3.field4179, var3.field4193, var3.field4188, var3.field4171, var3.field4184, var3.field4187, var3.field4178, var3.field4186, var3.field4189, var3.field4180, var3.field4181, var3.field4190, var3.field4182);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 14)
    public final void method446(Canvas arg0) {
        if (arg0 != null) {
            class219 var2 = (class219) this.field9606.method2287((long) arg0.hashCode(), (byte) -117);
            this.field9604 = var2;
            this.method3954(var2);
        } else {
            this.field9604 = null;
            this.method3954((class219) null);
        }
    }

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "(I)V", line = 30)
    public final void method495(int arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "()Z", line = 33)
    public final boolean method532() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "()Z", line = 39)
    public final boolean method496() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(IIIIII)V", line = 42)
    public final void method525(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method497(arg0, arg1, arg2, arg4, arg5);
        this.method497(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method458(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
        this.method458(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
    }

    @OriginalMember(owner = "client!oa", name = "OA", descriptor = "()Ljava/lang/Object;", line = 51)
    private final Object method3945() {
        return new class388(this);
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ld;II)V", line = 55)
    public class696(Canvas arg0, class151 arg1, int arg2, int arg3) {
        super(arg1);
        try {
            if (!class383.method2462((byte) 115, "sw3d")) {
                throw new RuntimeException("");
            } else {
                class161.method1175(-66);
                this.method3952(super.field849, 0, 0);
                class184.method1301(false, true, -22433);
                this.field9612 = true;
                this.field9602 = new class278();
                this.method534(new class278());
                this.method486(1);
                this.method471(0);
                if (arg0 != null) {
                    this.method455(arg0, arg2, arg3);
                    this.method446(arg0);
                }
            }
        } catch (Throwable var5) {
            this.method447((byte) -9);
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "()Lkaa;", line = 84)
    public final class48 method432() {
        return new class48(0, "SSE", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V", line = 87)
    public final void method471(int arg0) {
        this.field9610[arg0].method3583();
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIII)V", line = 95)
    public final void method522(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(IIIIII)Lom;", line = 100)
    public final class374 method503(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([IIIIIZ)Lpga;", line = 103)
    public final class536 method429(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return new class543(this, arg0, arg1, arg2, arg3, arg4, false);
    }

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "()La;", line = 108)
    public final class621 method3946() {
        for (int var1 = 0; var1 < this.field9611; ++var1) {
            if (this.field9610[var1].field8713 == Thread.currentThread()) {
                return this.field9610[var1];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;II)V", line = 121)
    public final void method417(Canvas arg0, int arg1, int arg2) {
        class219 var4 = (class219) this.field9606.method2287((long) arg0.hashCode(), (byte) -117);
        var4.method1467(arg0, arg1, arg2);
        if (arg0 != null && this.field9604.field3221 == arg0) {
            this.method446(arg0);
        }
    }

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "()Z", line = 128)
    public final boolean method478() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lof;Z)V", line = 132)
    private final void method3947(class624 arg0, boolean arg1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        for (class547 var8 = (class547) arg0.field8738.method2538(-18526); var8 != null; var8 = (class547) arg0.field8738.method2545(-13332)) {
            field9596[var3++] = var8.field7801;
            field9596[var3++] = var8.field7808;
            field9596[var3++] = var8.field7806;
            field9598[var4++] = var8.field7804;
            field9597[var6++] = (short) var8.field7810;
            field9599[var5++] = var8.field7800;
            if (arg1) {
                field9600[var7++] = var8.field7803;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "()Z", line = 162)
    public final boolean method540() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "()Lql;", line = 166)
    public final class738 method504() {
        return this.field9607;
    }

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "()Z", line = 169)
    public final boolean method512() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIII)V", line = 172)
    public final void method511(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method3946().method3586(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "()V", line = 176)
    public final void method498() {
        if (!this.field9590) {
            this.field9610 = null;
            this.field9604 = null;
            this.field9592 = null;
            this.field9602 = null;
            this.field9606.method2289(1393);
            for (class53 var1 = (class53) this.field9591.method1195(0); var1 != null; var1 = (class53) this.field9591.method1201(2)) {
                var1.method378();
            }
            this.field9591.method1200(83);
            this.method3944();
            if (this.field9612) {
                class441.method2739(false, true, 16383);
                this.field9612 = false;
            }
            this.method3957();
            class161.method1173(0);
            this.field9590 = true;
        }
    }

    @OriginalMember(owner = "client!oa", name = "finalize", descriptor = "()V", line = 207)
    protected final synchronized void finalize() {
        this.method447((byte) -9);
        if (this.nativeid != 0L) {
            class161.method1176(this, 0);
        }
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(II)I", line = 216)
    public final int method491(int arg0, int arg1) {
        int var3 = arg0 & 1048575;
        int var4 = arg1 & 1048575;
        return var3 & var4 ^ var4;
    }

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "()Z", line = 223)
    public final boolean method483() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)V", line = 226)
    public final void method480(int arg0) {
        this.field9610[arg0].method3588();
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIZ)Lpga;", line = 230)
    public final class536 method470(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return new class543(this, arg0, arg1, arg2, arg3, !arg4);
    }

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "()V", line = 232)
    public final void method536() {
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)V", line = 235)
    public final void method462(int arg0, int arg1) throws class566 {
        if (this.field9604 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field9604.method1466(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!oa", name = "WA", descriptor = "(S)Z", line = 249)
    private final boolean method3949(short arg0) {
        class151 var2 = super.field849;
        synchronized (super.field849) {
            if (!super.field849.method1121(-30695, arg0)) {
                return false;
            } else {
                class293 var4 = super.field849.method1124((byte) 31, arg0);
                if (var4 == null) {
                    return false;
                } else {
                    int[] var6;
                    if (var4.field4192 != 2) {
                        var6 = super.field849.method1123((byte) 93, 0.7F, true, arg0, 128, 128);
                    } else {
                        var6 = super.field849.method1126(true, arg0, (byte) 77, 0.7F, 128, 128);
                    }
                    this.method3958(arg0, var6, var4.field4175, var4.field4192, var4.field4185, var4.field4176, var4.field4172, var4.field4174, var4.field4179, var4.field4193, var4.field4188, var4.field4171, var4.field4184, var4.field4187, var4.field4178, var4.field4186, var4.field4189, var4.field4180, var4.field4181, var4.field4190, var4.field4182);
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lpk;)V", line = 276)
    public final void method452(class198 arg0) {
        class613 var2 = (class613) arg0;
        this.method3951(var2.field8658.nativeid, var2.field8660.nativeid);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lql;)V", line = 281)
    public final void method534(class738 arg0) {
        this.field9607 = arg0;
        this.method3953(((class278) arg0).nativeid);
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 286)
    public final void method510(Canvas arg0) {
        if (this.field9604.field3221 == arg0) {
            this.method446((Canvas) null);
        }
        class219 var2 = (class219) this.field9606.method2287((long) arg0.hashCode(), (byte) -117);
        if (var2 != null) {
            var2.method1304((byte) 7);
            var2.method1469();
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "()V", line = 300)
    public final void method427() {
    }

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "()Z", line = 305)
    public final boolean method475() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "()V", line = 309)
    public final void method538() {
        this.method446(this.field9604.field3221);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIIIIIII)V", line = 314)
    public final void method450(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lom;Lom;FLom;)Lom;", line = 320)
    public final class374 method499(class374 arg0, class374 arg1, float arg2, class374 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIII)V", line = 324)
    public final void method436(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method3950(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[Lraa;)V", line = 328)
    public final void method501(int arg0, class609[] arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < arg0; ++var4) {
            field9608[var3++] = arg1[var4].method3533(false);
            field9608[var3++] = arg1[var4].method3536(24108);
            field9608[var3++] = arg1[var4].method3531(20597);
            field9608[var3++] = arg1[var4].method3537(6490);
            field9594[var4] = arg1[var4].method3535((byte) -41);
            field9608[var3++] = arg1[var4].method3534(-123);
        }
        this.method3943(arg0, field9608, field9594);
    }

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "()V", line = 346)
    public final void method535() {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lom;)V", line = 348)
    public final void method440(class374 arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(II)I", line = 352)
    public final int method490(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ldh;IIII)Lka;", line = 355)
    public final class473 method418(class322 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class40(this, this.field9592, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "()Z", line = 362)
    public final boolean method456() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "()Z", line = 366)
    public final boolean method459() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILaa;II)V", line = 369)
    public final void method423(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class488 arg6, int arg7, int arg8) {
        this.method3955(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;II)V", line = 373)
    public final void method455(Canvas arg0, int arg1, int arg2) {
        class219 var4 = (class219) this.field9606.method2287((long) arg0.hashCode(), (byte) -117);
        if (var4 == null) {
            try {
                Class var5 = Class.forName("java.awt.Canvas");
                Method var6 = var5.getMethod("setIgnoreRepaint", Boolean.TYPE);
                var6.invoke(arg0, Boolean.TRUE);
            } catch (Exception var8) {
            }
            class219 var7 = new class219(this, arg0, arg1, arg2);
            this.field9606.method2278((byte) -31, (long) arg0.hashCode(), var7);
        } else {
            if (var4.field3220 != arg1 || var4.field3223 != arg2) {
                var4.method1467(arg0, arg1, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "(I)Lza;", line = 398)
    public final class415 method520(int arg0) {
        class53 var2 = new class53(this, arg0);
        this.field9591.method1203(var2, (byte) 102);
        return var2;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[[I[[IIII)Ls;", line = 411)
    public final class280 method477(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class670(this, this.field9592, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Z)V", line = 413)
    public final void method467(boolean arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "(I)V", line = 416)
    public final void method486(int arg0) {
        this.field9611 = arg0;
        this.field9610 = new class621[this.field9611];
        for (int var2 = 0; var2 < this.field9611; ++var2) {
            this.field9610[var2] = new class621(this, this.field9601, this.field9603);
        }
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "()Lql;", line = 430)
    public final class738 method442() {
        return this.field9602;
    }

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "()V", line = 433)
    public final void method533() {
    }

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "()V", line = 436)
    public final void method472() {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([I)V", line = 440)
    public final void method479(int[] arg0) {
        Dimension var2 = this.field9604.field3221.getSize();
        arg0[0] = var2.width;
        arg0[1] = var2.height;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lbi;Ldk;)Lpk;", line = 445)
    public final class198 method517(class482 arg0, class512 arg1) {
        return new class613(this, (class543) arg0, (class503) arg1);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lhia;[Lfg;Z)Lda;", line = 450)
    public final class61 method474(class66 arg0, class129[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field1734;
            var5[var7] = arg1[var7].field1739;
            if (arg1[var7].field1736 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
            } else {
                return new class666(this, this.field9592, arg0, arg1, (class536[]) null);
            }
        } else if (var6) {
            throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
        } else {
            return new class17(this, this.field9592, arg0, arg1, (class536[]) null);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V", line = 486)
    public final void method426(boolean arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILaa;IIIII)V", line = 488)
    public final void method449(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class488 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(II)Lbi;", line = 496)
    public final class482 method473(int arg0, int arg1) {
        return this.method493(arg0, arg1, false);
    }

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "()Z", line = 499)
    public final boolean method453() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "()Z", line = 504)
    public final boolean method537() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "()Z", line = 513)
    public final boolean method441() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "()V", line = 518)
    private final void method3957() {
        System.gc();
        System.runFinalization();
        class161.method1174(false);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)Ldk;", line = 527)
    public final class512 method454(int arg0, int arg1) {
        return new class503(arg0, arg1);
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V", line = 530)
    public final void method468(int arg0) {
        this.field9601 = this.field9603 = arg0;
        if (this.field9611 > 1) {
            throw new IllegalStateException("No MT");
        } else {
            this.method486(this.field9611);
            this.method471(0);
        }
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "()I", line = 542)
    public final int method433() {
        return 4;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIZ)Lpga;", line = 547)
    public final class536 method493(int arg0, int arg1, boolean arg2) {
        return new class543(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lfg;Z)Lpga;", line = 552)
    public final class536 method422(class129 arg0, boolean arg1) {
        class543 var3 = new class543(this, arg0.field1732, arg0.field1738, arg0.field1736, 0, arg0.field1734, arg0.field1734, arg0.field1739);
        var3.method1505(arg0.field1735, arg0.field1737, arg0.field1731, arg0.field1733);
        return var3;
    }

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "()Lql;", line = 557)
    public final class738 method515() {
        return new class278();
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V", line = 560)
    public final void method539(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class566 {
        if (this.field9604 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field9604.method1470(arg0, arg1, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lof;I)V", line = 572)
    public final void method505(class624 arg0, int arg1) {
        this.method3947(arg0, false);
        this.method3946().method3596(this, field9596, field9598, field9599, field9597, arg0.field8738.method2540(0));
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lza;)V", line = 576)
    public final void method445(class415 arg0) {
        this.field9592 = (class53) arg0;
        this.method3948(arg0);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(FFF)V", line = 583)
    public final void method489(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)V", line = 592)
    public final void method419(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIF)Lraa;", line = 597)
    public final class609 method443(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return new class276(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[I[I)Laa;", line = 610)
    public final class488 method521(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class47(this, this.field9592, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "(I)V", line = 613)
    public final void method487(int arg0) {
        class161.method1174(false);
        this.method3942(arg0);
        for (class53 var2 = (class53) this.field9591.method1195(0); var2 != null; var2 = (class53) this.field9591.method1201(2)) {
            var2.method376();
        }
    }

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "()Z", line = 641)
    public final boolean method518() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lof;)V", line = 653)
    public final void method523(class624 arg0) {
        if (arg0.field8738.method2540(0) != 0) {
            this.method3947(arg0, false);
            this.method3946().method3596(this, field9596, field9598, field9599, field9597, arg0.field8738.method2540(0));
        }
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V")
    private final native void method3942(int arg0);

    @OriginalMember(owner = "client!oa", name = "N", descriptor = "(I[I[F)V")
    private final native void method3943(int arg0, int[] arg1, float[] arg2);

    @OriginalMember(owner = "client!oa", name = "DA", descriptor = "(IIII)V")
    public final native void method500(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "(Z)V")
    public final native void method105(boolean arg0);

    @OriginalMember(owner = "client!oa", name = "FA", descriptor = "()V")
    private final native void method3944();

    @OriginalMember(owner = "client!oa", name = "la", descriptor = "()V")
    public final native void method469();

    @OriginalMember(owner = "client!oa", name = "pa", descriptor = "()V")
    public final native void method466();

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "(II)V")
    public final native void method528(int arg0, int arg1);

    @OriginalMember(owner = "client!oa", name = "U", descriptor = "(IIIII)V")
    public final native void method497(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "EA", descriptor = "(IIII)V")
    public final native void method439(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "ya", descriptor = "()V")
    public final native void method444();

    @OriginalMember(owner = "client!oa", name = "ra", descriptor = "(IIII)V")
    public final native void method529(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "GA", descriptor = "(I)V")
    public final native void method502(int arg0);

    @OriginalMember(owner = "client!oa", name = "H", descriptor = "(III[I)V")
    public final native void method421(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "()I")
    public final native int method464();

    @OriginalMember(owner = "client!oa", name = "XA", descriptor = "()I")
    public final native int method514();

    @OriginalMember(owner = "client!oa", name = "da", descriptor = "(III[I)V")
    public final native void method488(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!oa", name = "K", descriptor = "([I)V")
    public final native void method530(int[] arg0);

    @OriginalMember(owner = "client!oa", name = "va", descriptor = "(Lza;)V")
    private final native void method3948(class415 arg0);

    @OriginalMember(owner = "client!oa", name = "HA", descriptor = "(IIII[I)V")
    public final native void method425(int arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "(II)V")
    public final native void method430(int arg0, int arg1);

    @OriginalMember(owner = "client!oa", name = "wa", descriptor = "(IIIIII)V")
    private final native void method3950(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "Q", descriptor = "(IIIIII[BII)V")
    public final native void method519(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "(JJ)V")
    private final native void method3951(long arg0, long arg1);

    @OriginalMember(owner = "client!oa", name = "MA", descriptor = "(Ld;II)V")
    private final native void method3952(class151 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oa", name = "na", descriptor = "(IIII)[I")
    public final native int[] method428(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "ma", descriptor = "(J)V")
    private final native void method3953(long arg0);

    @OriginalMember(owner = "client!oa", name = "ZA", descriptor = "(IFFFFF)V")
    public final native void method460(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!oa", name = "T", descriptor = "(IIII)V")
    public final native void method509(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "Y", descriptor = "()[I")
    public final native int[] method434();

    @OriginalMember(owner = "client!oa", name = "X", descriptor = "(I)V")
    public final native void method438(int arg0);

    @OriginalMember(owner = "client!oa", name = "JA", descriptor = "(IIIIII)I")
    public final native int method494(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "P", descriptor = "(IIIII)V")
    public final native void method458(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "(Z)V")
    public final native void method463(boolean arg0);

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "(Lp;)V")
    private final native void method3954(class219 arg0);

    @OriginalMember(owner = "client!oa", name = "aa", descriptor = "(IIIIII)V")
    public final native void method516(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIID)V")
    public final native void method424(int arg0, int arg1, int arg2, int arg3, double arg4);

    @OriginalMember(owner = "client!oa", name = "za", descriptor = "(IIIII)V")
    public final native void method485(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "Z", descriptor = "(IIIIIILaa;II)V")
    private final native void method3955(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class488 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "(ILaa;II)V")
    public final native void method435(int arg0, class488 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "AA", descriptor = "(SSIBBIZBBBBZZZZZBZZI)V")
    private final native void method3956(short arg0, short arg1, int arg2, byte arg3, byte arg4, int arg5, boolean arg6, byte arg7, byte arg8, byte arg9, byte arg10, boolean arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, byte arg16, boolean arg17, boolean arg18, int arg19);

    @OriginalMember(owner = "client!oa", name = "KA", descriptor = "(IIII)V")
    public final native void method476(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "xa", descriptor = "(F)V")
    public final native void method484(float arg0);

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "()I")
    public final native int method461();

    @OriginalMember(owner = "client!oa", name = "M", descriptor = "()I")
    public final native int method508();

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "(IIIIIII)I")
    public final native int method524(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "()I")
    public final native int method457();

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "(III)V")
    public final native void method526(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oa", name = "CA", descriptor = "(S[ISIBBIZBBBBZZZZZBZZI)V")
    private final native void method3958(short arg0, int[] arg1, short arg2, int arg3, byte arg4, byte arg5, int arg6, boolean arg7, byte arg8, byte arg9, byte arg10, byte arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, boolean arg16, byte arg17, boolean arg18, boolean arg19, int arg20);
}
