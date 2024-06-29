import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class696 extends class60 implements class535 {

    @OriginalMember(owner = "client!oa", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "Z")
    private boolean field9678 = false;

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "Lfh;")
    private class653 field9676 = new class653();

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "I")
    private int field9688 = 4096;

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "I")
    private int field9692 = 4096;

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "Ltba;")
    private class165 field9686 = new class165(4);

    @OriginalMember(owner = "client!oa", name = "M", descriptor = "Z")
    private boolean field9696 = false;

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "Lpda;")
    private class631 field9689;

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "[I")
    private static int[] field9677 = new int[Math.max(Math.max(104, 20), 24573)];

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "[S")
    private static short[] field9684 = new short[8191];

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "[I")
    public static int[] field9682 = new int[6];

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "[B")
    private static byte[] field9681 = new byte[8191];

    @OriginalMember(owner = "client!oa", name = "K", descriptor = "[I")
    private static int[] field9694 = field9677;

    @OriginalMember(owner = "client!oa", name = "H", descriptor = "[I")
    private static int[] field9691 = new int[8191];

    @OriginalMember(owner = "client!oa", name = "G", descriptor = "[F")
    private static float[] field9690 = new float[20];

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "[I")
    private static int[] field9680 = new int[8191];

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "[I")
    public static int[] field9683 = field9677;

    @OriginalMember(owner = "client!oa", name = "N", descriptor = "[I")
    private static int[] field9697 = field9677;

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "[F")
    private static float[] field9687 = field9690;

    @OriginalMember(owner = "client!oa", name = "O", descriptor = "I")
    public int field9698;

    @OriginalMember(owner = "client!oa", name = "J", descriptor = "Lp;")
    private class221 field9693;

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "Lya;")
    private class53 field9679;

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "Lpda;")
    private class631 field9685;

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "[La;")
    private class620[] field9695;

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "()V", line = 3)
    public final void method522() {
    }

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "()La;", line = 8)
    public final class620 method3901() {
        for (int var1 = 0; var1 < this.field9698; ++var1) {
            if (this.field9695[var1].field8554 == Thread.currentThread()) {
                return this.field9695[var1];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(II)I", line = 25)
    public final int method542(int arg0, int arg1) {
        int var3 = arg0 & 1048575;
        int var4 = arg1 & 1048575;
        return var3 & var4 ^ var4;
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "()V", line = 31)
    public final void method459() {
        if (!this.field9678) {
            this.field9695 = null;
            this.field9693 = null;
            this.field9679 = null;
            this.field9689 = null;
            this.field9686.method1161(false);
            for (class53 var1 = (class53) this.field9676.method3672(-1); var1 != null; var1 = (class53) this.field9676.method3662(-1)) {
                var1.method398();
            }
            this.field9676.method3668(0);
            this.method3908();
            if (this.field9696) {
                class23.method163(false, true, (byte) 85);
                this.field9696 = false;
            }
            this.method3909();
            class166.method1166(25279);
            this.field9678 = true;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILaa;II)V", line = 62)
    public final void method447(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class489 arg6, int arg7, int arg8) {
        this.method3912(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!oa", name = "WA", descriptor = "(S)Z", line = 65)
    private final boolean method3903(short arg0) {
        class153 var2 = super.field830;
        synchronized (super.field830) {
            if (!super.field830.method1071((byte) 118, arg0)) {
                return false;
            } else {
                class537 var4 = super.field830.method1072(arg0, true);
                if (var4 == null) {
                    return false;
                } else {
                    int[] var6;
                    if (var4.field7450 != 2) {
                        var6 = super.field830.method1069(128, arg0, true, 128, 0.7F, 6766);
                    } else {
                        var6 = super.field830.method1068(128, 0.7F, arg0, -22669, true, 128);
                    }
                    this.method3904(arg0, var6, var4.field7451, var4.field7450, var4.field7443, var4.field7449, var4.field7439, var4.field7460, var4.field7438, var4.field7437, var4.field7441, var4.field7444, var4.field7456, var4.field7457, var4.field7453, var4.field7455, var4.field7442, var4.field7446, var4.field7452, var4.field7440, var4.field7458);
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([IIIIIZ)Liea;", line = 90)
    public final class481 method535(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return new class544(this, arg0, arg1, arg2, arg3, arg4, false);
    }

    @OriginalMember(owner = "client!oa", name = "finalize", descriptor = "()V", line = 99)
    protected final synchronized void finalize() {
        this.method478((byte) 91);
        if (this.nativeid != 0L) {
            class166.method1167(this, -1);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[[I[[IIII)Ls;", line = 111)
    public final class282 method539(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class670(this, this.field9679, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;II)V", line = 116)
    public final void method495(Canvas arg0, int arg1, int arg2) {
        class221 var4 = (class221) this.field9686.method1160((long) arg0.hashCode(), 122);
        var4.method1438(arg0, arg1, arg2);
        if (arg0 != null && this.field9693.field2958 == arg0) {
            this.method486(arg0);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V", line = 124)
    public final void method433(int arg0) {
        this.field9695[arg0].method3468();
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)V", line = 128)
    public final void method461(int arg0) {
        this.field9688 = this.field9692 = arg0;
        if (this.field9698 > 1) {
            throw new IllegalStateException("No MT");
        } else {
            this.method452(this.field9698);
            this.method506(0);
        }
    }

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "()V", line = 135)
    public final void method547() {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[Llaa;)V", line = 139)
    public final void method456(int arg0, class123[] arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < arg0; ++var4) {
            field9697[var3++] = arg1[var4].method932(-16562);
            field9697[var3++] = arg1[var4].method937(115);
            field9697[var3++] = arg1[var4].method938(0);
            field9697[var3++] = arg1[var4].method935(0);
            field9687[var4] = arg1[var4].method939(-11214);
            field9697[var3++] = arg1[var4].method934((byte) -65);
        }
        this.method3907(arg0, field9697, field9687);
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 157)
    public final void method533(Canvas arg0) {
        if (this.field9693.field2958 == arg0) {
            this.method486((Canvas) null);
        }
        class221 var2 = (class221) this.field9686.method1160((long) arg0.hashCode(), 120);
        if (var2 != null) {
            var2.method1175(-2);
            var2.method1433();
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lza;)V", line = 170)
    public final void method536(class416 arg0) {
        this.field9679 = (class53) arg0;
        this.method3913(arg0);
    }

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "()Lnia;", line = 174)
    public final class647 method499() {
        return new class647(0, "SSE", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V", line = 177)
    public final void method432(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class230 {
        if (this.field9693 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field9693.method1435(arg0, arg1, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V", line = 188)
    public final void method452(int arg0) {
        this.field9698 = arg0;
        this.field9695 = new class620[this.field9698];
        for (int var2 = 0; var2 < this.field9698; ++var2) {
            this.field9695[var2] = new class620(this, this.field9688, this.field9692);
        }
    }

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "()Z", line = 202)
    public final boolean method517() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "()Z", line = 205)
    public final boolean method549() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "()V", line = 207)
    public final void method469() {
    }

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "()Lpda;", line = 210)
    public final class631 method480() {
        return this.field9685;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lnl;)V", line = 216)
    public final void method550(class554 arg0) {
        class612 var2 = (class612) arg0;
        this.method3905(var2.field8474.nativeid, var2.field8473.nativeid);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lmda;Lmda;FLmda;)Lmda;", line = 225)
    public final class267 method485(class267 arg0, class267 arg1, float arg2, class267 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "()Z", line = 230)
    public final boolean method474() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIIIIIII)V", line = 233)
    public final void method488(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
    }

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "()Z", line = 237)
    public final boolean method498() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIZ)Liea;", line = 240)
    public final class481 method551(int arg0, int arg1, boolean arg2) {
        return new class544(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lmda;)V", line = 242)
    public final void method496(class267 arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "()V", line = 245)
    private final void method3909() {
        System.gc();
        System.runFinalization();
        class166.method1165(-102);
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "()I", line = 250)
    public final int method436() {
        return 4;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lpda;)V", line = 253)
    public final void method505(class631 arg0) {
        this.field9685 = arg0;
        this.method3906(((class280) arg0).nativeid);
    }

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "()Z", line = 259)
    public final boolean method476() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lfl;I)V", line = 263)
    public final void method545(class741 arg0, int arg1) {
        this.method3915(arg0, false);
        this.method3901().method3467(this, field9694, field9691, field9680, field9684, arg0.field10344.method2957(10));
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIII)V", line = 267)
    public final void method438(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method3902(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIIII)V", line = 273)
    public final void method460(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method491(arg0, arg1, arg2, arg4, arg5);
        this.method491(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method477(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
        this.method477(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Llga;IIII)Lka;", line = 279)
    public final class474 method540(class714 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class40(this, this.field9679, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V", line = 282)
    public final void method448(int arg0) {
        class166.method1165(-39);
        this.method3911(arg0);
        for (class53 var2 = (class53) this.field9676.method3672(-1); var2 != null; var2 = (class53) this.field9676.method3662(-1)) {
            var2.method397();
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 297)
    public final void method486(Canvas arg0) {
        if (arg0 != null) {
            class221 var2 = (class221) this.field9686.method1160((long) arg0.hashCode(), 123);
            this.field9693 = var2;
            this.method3910(var2);
        } else {
            this.field9693 = null;
            this.method3910((class221) null);
        }
    }

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "(I)Lza;", line = 313)
    public final class416 method541(int arg0) {
        class53 var2 = new class53(this, arg0);
        this.field9676.method3671(var2, false);
        return var2;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIZ)Liea;", line = 320)
    public final class481 method527(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return new class544(this, arg0, arg1, arg2, arg3, !arg4);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILaa;IIIII)V", line = 323)
    public final void method516(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class489 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIF)Llaa;", line = 326)
    public final class123 method471(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return new class466(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "()Z", line = 330)
    public final boolean method526() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "()Lpda;", line = 333)
    public final class631 method531() {
        return this.field9689;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Z)V", line = 335)
    public final void method507(boolean arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)I", line = 338)
    public final int method484(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)Llda;", line = 342)
    public final class488 method481(int arg0, int arg1) {
        return new class504(arg0, arg1);
    }

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "(I)V", line = 345)
    public final void method506(int arg0) {
        this.field9695[arg0].method3478();
    }

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "()Z", line = 348)
    public final boolean method490() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "()Z", line = 353)
    public final boolean method482() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "()V", line = 356)
    public final void method466() {
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "()Z", line = 361)
    public final boolean method442() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(II)Lhca;", line = 369)
    public final class492 method523(int arg0, int arg1) {
        return this.method551(arg0, arg1, false);
    }

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "()Lpda;", line = 373)
    public final class631 method502() {
        return new class280();
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lfl;)V", line = 377)
    public final void method455(class741 arg0) {
        if (arg0.field10344.method2957(10) != 0) {
            this.method3915(arg0, false);
            this.method3901().method3467(this, field9694, field9691, field9680, field9684, arg0.field10344.method2957(10));
        }
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(IIIIII)Lmda;", line = 385)
    public final class267 method520(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)V", line = 388)
    public final void method472(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "()V", line = 392)
    public final void method479() {
    }

    @OriginalMember(owner = "client!oa", name = "OA", descriptor = "()Ljava/lang/Object;", line = 396)
    private final Object method3914() {
        return new class390(this);
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "()V", line = 400)
    public final void method444() {
        this.method486(this.field9693.field2958);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lfl;Z)V", line = 404)
    private final void method3915(class741 arg0, boolean arg1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        for (class18 var8 = (class18) arg0.field10344.method2961((byte) 73); var8 != null; var8 = (class18) arg0.field10344.method2959(-65)) {
            field9694[var3++] = var8.field333;
            field9694[var3++] = var8.field339;
            field9694[var3++] = var8.field338;
            field9691[var4++] = var8.field337;
            field9684[var6++] = (short) var8.field335;
            field9680[var5++] = var8.field330;
            if (arg1) {
                field9681[var7++] = var8.field332;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIII)V", line = 433)
    public final void method434(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIII)V", line = 436)
    public final void method475(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method3901().method3488(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "()Z", line = 441)
    public final boolean method513() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(FFF)V", line = 443)
    public final void method463(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ld;II)V", line = 540)
    public class696(Canvas arg0, class153 arg1, int arg2, int arg3) {
        super(arg1);
        try {
            if (!class633.method3549("sw3d", 99)) {
                throw new RuntimeException("");
            } else {
                class166.method1163((byte) 125);
                this.method3917(super.field830, 0, 0);
                class273.method1613(true, false, 10);
                this.field9696 = true;
                this.field9689 = new class280();
                this.method505(new class280());
                this.method452(1);
                this.method506(0);
                if (arg0 != null) {
                    this.method518(arg0, arg2, arg3);
                    this.method486(arg0);
                }
            }
        } catch (Throwable var5) {
            this.method478((byte) 80);
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lhb;Z)Liea;", line = 451)
    public final class481 method508(class728 arg0, boolean arg1) {
        class544 var3 = new class544(this, arg0.field10131, arg0.field10134, arg0.field10133, 0, arg0.field10135, arg0.field10135, arg0.field10132);
        var3.method147(arg0.field10129, arg0.field10128, arg0.field10136, arg0.field10130);
        return var3;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;II)V", line = 459)
    public final void method518(Canvas arg0, int arg1, int arg2) {
        class221 var4 = (class221) this.field9686.method1160((long) arg0.hashCode(), 125);
        if (var4 == null) {
            try {
                Class var5 = Class.forName("java.awt.Canvas");
                Method var6 = var5.getMethod("setIgnoreRepaint", Boolean.TYPE);
                var6.invoke(arg0, Boolean.TRUE);
            } catch (Exception var8) {
            }
            class221 var7 = new class221(this, arg0, arg1, arg2);
            this.field9686.method1153(var7, (long) arg0.hashCode(), -1);
        } else {
            if (var4.field2957 != arg1 || var4.field2961 != arg2) {
                var4.method1438(arg0, arg1, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljl;[Lhb;Z)Lda;", line = 484)
    public final class61 method500(class274 arg0, class728[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field10135;
            var5[var7] = arg1[var7].field10132;
            if (arg1[var7].field10133 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
            } else {
                return new class666(this, this.field9679, arg0, arg1, (class481[]) null);
            }
        } else if (var6) {
            throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
        } else {
            return new class17(this, this.field9679, arg0, arg1, (class481[]) null);
        }
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(II)V", line = 524)
    public final void method497(int arg0, int arg1) throws class230 {
        if (this.field9693 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field9693.method1439(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V", line = 533)
    public final void method449(boolean arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "(I)V", line = 537)
    public final void method473(int arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "()Z", line = 568)
    public final boolean method519() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([I)V", line = 574)
    public final void method454(int[] arg0) {
        Dimension var2 = this.field9693.field2958.getSize();
        arg0[0] = var2.width;
        arg0[1] = var2.height;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "()Z", line = 579)
    public final boolean method431() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lhca;Llda;)Lnl;", line = 590)
    public final class554 method464(class492 arg0, class488 arg1) {
        return new class612(this, (class544) arg0, (class504) arg1);
    }

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "()Z", line = 594)
    public final boolean method467() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[I[I)Laa;", line = 616)
    public final class489 method487(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class47(this, this.field9679, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(S)Z", line = 636)
    private final boolean method3918(short arg0) {
        synchronized (this) {
            class537 var3 = super.field830.method1072(arg0, true);
            if (var3 == null) {
                return false;
            } else {
                this.method3916(arg0, var3.field7451, var3.field7450, var3.field7443, var3.field7449, var3.field7439, var3.field7460, var3.field7438, var3.field7437, var3.field7441, var3.field7444, var3.field7456, var3.field7457, var3.field7453, var3.field7455, var3.field7442, var3.field7446, var3.field7452, var3.field7440, var3.field7458);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "GA", descriptor = "(I)V")
    public final native void method462(int arg0);

    @OriginalMember(owner = "client!oa", name = "ra", descriptor = "(IIII)V")
    public final native void method503(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "wa", descriptor = "(IIIIII)V")
    private final native void method3902(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "na", descriptor = "(IIII)[I")
    public final native int[] method465(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "X", descriptor = "(I)V")
    public final native void method510(int arg0);

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "(II)V")
    public final native void method468(int arg0, int arg1);

    @OriginalMember(owner = "client!oa", name = "CA", descriptor = "(S[ISIBBIZBBBBZZZZZBZZI)V")
    private final native void method3904(short arg0, int[] arg1, short arg2, int arg3, byte arg4, byte arg5, int arg6, boolean arg7, byte arg8, byte arg9, byte arg10, byte arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, boolean arg16, byte arg17, boolean arg18, boolean arg19, int arg20);

    @OriginalMember(owner = "client!oa", name = "EA", descriptor = "(IIII)V")
    public final native void method453(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "(ILaa;II)V")
    public final native void method450(int arg0, class489 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "(JJ)V")
    private final native void method3905(long arg0, long arg1);

    @OriginalMember(owner = "client!oa", name = "XA", descriptor = "()I")
    public final native int method546();

    @OriginalMember(owner = "client!oa", name = "KA", descriptor = "(IIII)V")
    public final native void method534(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "pa", descriptor = "()V")
    public final native void method515();

    @OriginalMember(owner = "client!oa", name = "ma", descriptor = "(J)V")
    private final native void method3906(long arg0);

    @OriginalMember(owner = "client!oa", name = "JA", descriptor = "(IIIIII)I")
    public final native int method529(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "N", descriptor = "(I[I[F)V")
    private final native void method3907(int arg0, int[] arg1, float[] arg2);

    @OriginalMember(owner = "client!oa", name = "FA", descriptor = "()V")
    private final native void method3908();

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "(III)V")
    public final native void method457(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "()I")
    public final native int method537();

    @OriginalMember(owner = "client!oa", name = "M", descriptor = "()I")
    public final native int method470();

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "(IIIIIII)I")
    public final native int method501(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!oa", name = "U", descriptor = "(IIIII)V")
    public final native void method491(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "ya", descriptor = "()V")
    public final native void method512();

    @OriginalMember(owner = "client!oa", name = "Q", descriptor = "(IIIIII[BII)V")
    public final native void method443(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!oa", name = "aa", descriptor = "(IIIIII)V")
    public final native void method528(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "(Lp;)V")
    private final native void method3910(class221 arg0);

    @OriginalMember(owner = "client!oa", name = "P", descriptor = "(IIIII)V")
    public final native void method477(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "K", descriptor = "([I)V")
    public final native void method483(int[] arg0);

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V")
    private final native void method3911(int arg0);

    @OriginalMember(owner = "client!oa", name = "xa", descriptor = "(F)V")
    public final native void method511(float arg0);

    @OriginalMember(owner = "client!oa", name = "Y", descriptor = "()[I")
    public final native int[] method509();

    @OriginalMember(owner = "client!oa", name = "Z", descriptor = "(IIIIIILaa;II)V")
    private final native void method3912(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class489 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "(Z)V")
    public final native void method504(boolean arg0);

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "()I")
    public final native int method440();

    @OriginalMember(owner = "client!oa", name = "T", descriptor = "(IIII)V")
    public final native void method525(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "HA", descriptor = "(IIII[I)V")
    public final native void method530(int arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!oa", name = "va", descriptor = "(Lza;)V")
    private final native void method3913(class416 arg0);

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "(Z)V")
    public final native void method123(boolean arg0);

    @OriginalMember(owner = "client!oa", name = "H", descriptor = "(III[I)V")
    public final native void method553(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!oa", name = "za", descriptor = "(IIIII)V")
    public final native void method458(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIID)V")
    public final native void method524(int arg0, int arg1, int arg2, int arg3, double arg4);

    @OriginalMember(owner = "client!oa", name = "da", descriptor = "(III[I)V")
    public final native void method543(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!oa", name = "ZA", descriptor = "(IFFFFF)V")
    public final native void method548(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!oa", name = "la", descriptor = "()V")
    public final native void method446();

    @OriginalMember(owner = "client!oa", name = "DA", descriptor = "(IIII)V")
    public final native void method437(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "AA", descriptor = "(SSIBBIZBBBBZZZZZBZZI)V")
    private final native void method3916(short arg0, short arg1, int arg2, byte arg3, byte arg4, int arg5, boolean arg6, byte arg7, byte arg8, byte arg9, byte arg10, boolean arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, byte arg16, boolean arg17, boolean arg18, int arg19);

    @OriginalMember(owner = "client!oa", name = "MA", descriptor = "(Ld;II)V")
    private final native void method3917(class153 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "()I")
    public final native int method451();

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "(II)V")
    public final native void method493(int arg0, int arg1);
}
