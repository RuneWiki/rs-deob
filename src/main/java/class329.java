import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class329 extends class167 implements class439 {

    @OriginalMember(owner = "client!a", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!a", name = "q", descriptor = "Z")
    private boolean field4854 = false;

    @OriginalMember(owner = "client!a", name = "r", descriptor = "Lrk;")
    private class419 field4855 = new class419();

    @OriginalMember(owner = "client!a", name = "E", descriptor = "I")
    private int field4868 = 4096;

    @OriginalMember(owner = "client!a", name = "F", descriptor = "I")
    private int field4869 = 4096;

    @OriginalMember(owner = "client!a", name = "H", descriptor = "Lica;")
    private class205 field4871 = new class205(4);

    @OriginalMember(owner = "client!a", name = "J", descriptor = "Z")
    private boolean field4873 = false;

    @OriginalMember(owner = "client!a", name = "C", descriptor = "Lm;")
    private class105 field4866;

    @OriginalMember(owner = "client!a", name = "p", descriptor = "[I")
    private static int[] field4853 = new int[Math.max(Math.max(80, 20), 24573)];

    @OriginalMember(owner = "client!a", name = "x", descriptor = "[B")
    private static byte[] field4861 = new byte[8191];

    @OriginalMember(owner = "client!a", name = "v", descriptor = "[I")
    private static int[] field4859 = new int[8191];

    @OriginalMember(owner = "client!a", name = "s", descriptor = "[I")
    private static int[] field4856 = field4853;

    @OriginalMember(owner = "client!a", name = "A", descriptor = "[I")
    public static int[] field4864 = field4853;

    @OriginalMember(owner = "client!a", name = "w", descriptor = "[S")
    private static short[] field4860 = new short[8191];

    @OriginalMember(owner = "client!a", name = "y", descriptor = "[I")
    private static int[] field4862 = field4853;

    @OriginalMember(owner = "client!a", name = "t", descriptor = "[I")
    private static int[] field4857 = new int[8191];

    @OriginalMember(owner = "client!a", name = "z", descriptor = "[F")
    private static float[] field4863 = new float[20];

    @OriginalMember(owner = "client!a", name = "u", descriptor = "[F")
    private static float[] field4858 = field4863;

    @OriginalMember(owner = "client!a", name = "B", descriptor = "[I")
    public static int[] field4865 = new int[6];

    @OriginalMember(owner = "client!a", name = "I", descriptor = "I")
    private int field4872;

    @OriginalMember(owner = "client!a", name = "D", descriptor = "Lm;")
    private class105 field4867;

    @OriginalMember(owner = "client!a", name = "G", descriptor = "Lb;")
    private class573 field4870;

    @OriginalMember(owner = "client!a", name = "o", descriptor = "Lc;")
    private class618 field4852;

    @OriginalMember(owner = "client!a", name = "K", descriptor = "[Lv;")
    private class557[] field4874;

    @OriginalMember(owner = "client!a", name = "u", descriptor = "()V", line = 4)
    public final void method322() {
    }

    @OriginalMember(owner = "client!a", name = "x", descriptor = "()Z", line = 10)
    public final boolean method1007() {
        return true;
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "(I)V", line = 13)
    public final void method970(int arg0) {
        this.field4874[arg0].method3248();
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "()Z", line = 18)
    public final boolean method1030() {
        return true;
    }

    @OriginalMember(owner = "client!a", name = "j", descriptor = "()V", line = 20)
    public final void method313() {
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "()Z", line = 23)
    public final boolean method988() {
        return false;
    }

    @OriginalMember(owner = "client!a", name = "i", descriptor = "()Z", line = 26)
    public final boolean method984() {
        return false;
    }

    @OriginalMember(owner = "client!a", name = "finalize", descriptor = "()V", line = 29)
    protected final synchronized void finalize() {
        this.method1061(122);
        if (this.nativeid != 0L) {
            class75.method437(this, -1);
        }
    }

    @OriginalMember(owner = "client!a", name = "e", descriptor = "()Lm;", line = 37)
    public final class105 method1038() {
        return this.field4866;
    }

    @OriginalMember(owner = "client!a", name = "C", descriptor = "()Z", line = 40)
    public final boolean method986() {
        return true;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIILpa;II)V", line = 43)
    public final void method996(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class594 arg6, int arg7, int arg8) {
        this.method2056(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 50)
    public final void method1023(Canvas arg0) {
        class573 var2 = (class573) this.field4871.method1333((long) arg0.hashCode(), false);
        Dimension var3 = arg0.getSize();
        var2.method3353(arg0, var3.width, var3.height);
        if (arg0 != null && this.field4870.field8455 == arg0) {
            this.method964(arg0);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lm;)V", line = 60)
    public final void method999(class105 arg0) {
        this.field4867 = arg0;
        this.method2055(arg0);
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(Z)V", line = 66)
    public final void method992(boolean arg0) {
    }

    @OriginalMember(owner = "client!a", name = "B", descriptor = "()V", line = 71)
    public final void method341() {
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Llh;)V", line = 74)
    public final void method962(class125 arg0) {
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ln;)V", line = 77)
    public class329(Canvas arg0, class472 arg1) {
        super(arg1);
        try {
            if (!class53.method271((byte) -75, "sw3d")) {
                throw new RuntimeException("");
            } else {
                class75.method435(11309);
                this.method2051(super.field2262, 0, 0);
                class587.method3427(false, false, true);
                this.field4873 = true;
                this.field4866 = new class448();
                this.method999(new class448());
                this.method1044(1);
                this.method981(0);
                if (arg0 != null) {
                    this.method968(arg0);
                    this.method964(arg0);
                }
            }
        } catch (Throwable var3) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!a", name = "A", descriptor = "()Z", line = 104)
    public final boolean method1002() {
        return true;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIIIIII)V", line = 107)
    public final void method1039(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 111)
    public final void method964(Canvas arg0) {
        if (arg0 != null) {
            class573 var2 = (class573) this.field4871.method1333((long) arg0.hashCode(), false);
            this.field4870 = var2;
            this.method2060(var2);
        } else {
            this.field4870 = null;
            this.method2060((class573) null);
        }
    }

    @OriginalMember(owner = "client!a", name = "h", descriptor = "()Z", line = 128)
    public final boolean method278() {
        return false;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "([Lr;Lm;[Lgr;I)V", line = 132)
    public final void method967(class520[] arg0, class105 arg1, class525[] arg2, int arg3) {
        if (arg2 == null) {
            this.method2059().method3257(this, arg0, arg1, (int[]) null, -1, arg3);
        } else {
            class525 var5 = arg2[0];
            field4865[5] = 0;
            this.method2059().method3257(this, arg0, arg1, field4865, -1, arg3);
            var5.field7767 = field4865[0];
            var5.field7769 = field4865[1];
            var5.field7768 = field4865[2];
            var5.field7770 = field4865[3];
            var5.field7766 = field4865[4];
            var5.field7771 = field4865[5] != 0;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II)I", line = 150)
    public final int method978(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(II)I", line = 154)
    public final int method1026(int arg0, int arg1) {
        int var3 = arg0 & 1048575;
        int var4 = arg1 & 1048575;
        return var3 & var4 ^ var4;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIII)V", line = 159)
    public final void method280(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!a", name = "t", descriptor = "()V", line = 162)
    public final void method298() {
        if (!this.field4854) {
            this.field4874 = null;
            this.field4870 = null;
            this.field4852 = null;
            this.field4866 = null;
            this.field4871.method1332(-22538);
            for (class618 var1 = (class618) this.field4855.method2496((byte) -124); var1 != null; var1 = (class618) this.field4855.method2494(28)) {
                var1.method3580();
            }
            this.field4855.method2499(0);
            this.method2062();
            if (this.field4873) {
                class621.method3596(0, false, true);
                this.field4873 = false;
            }
            this.method2058();
            class75.method434(true);
            this.field4854 = true;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V", line = 193)
    public final void method351(int arg0) {
        class75.method436(-1);
        this.method2049(arg0);
        for (class618 var2 = (class618) this.field4855.method2496((byte) 123); var2 != null; var2 = (class618) this.field4855.method2494(109)) {
            var2.method3579();
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Loaa;)V", line = 206)
    public final void method989(class510 arg0) {
        this.method2054(arg0, false);
        this.method2059().method3258(this, field4862, field4857, field4859, field4860, arg0.field7577.method3018(0));
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIII)Llh;", line = 213)
    public final class125 method1033(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lbt;IIII)Lr;", line = 218)
    public final class520 method954(class114 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class315(this, this.field4852, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIF)Lat;", line = 223)
    public final class535 method995(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return new class20(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I[Lat;)V", line = 227)
    public final void method1045(int arg0, class535[] arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < arg0; ++var4) {
            field4856[var3++] = arg1[var4].method3151(-59);
            field4856[var3++] = arg1[var4].method3150(2);
            field4856[var3++] = arg1[var4].method3143(-88);
            field4856[var3++] = arg1[var4].method3146(0);
            field4858[var4] = arg1[var4].method3145(2);
            field4856[var3++] = arg1[var4].method3148((byte) -107);
        }
        this.method2050(arg0, field4856, field4858);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Loaa;Z)V", line = 246)
    private final void method2054(class510 arg0, boolean arg1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        for (class49 var8 = (class49) arg0.field7577.method3021(-9706); var8 != null; var8 = (class49) arg0.field7577.method3013((byte) 119)) {
            field4862[var3++] = var8.field564;
            field4862[var3++] = var8.field574;
            field4862[var3++] = var8.field567;
            field4857[var4++] = var8.field568;
            field4860[var6++] = (short) var8.field571;
            field4859[var5++] = var8.field562;
            if (arg1) {
                field4861[var7++] = var8.field565;
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V", line = 276)
    public final void method1043(int arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 280)
    public final void method354(Rectangle[] arg0, int arg1) throws class477 {
        if (this.field4870 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field4870.method3352(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!a", name = "y", descriptor = "()Z", line = 291)
    public final boolean method977() {
        return true;
    }

    @OriginalMember(owner = "client!a", name = "GA", descriptor = "(S)Z", line = 296)
    private final boolean method2057(short arg0) {
        class472 var2 = super.field2262;
        synchronized (super.field2262) {
            if (!super.field2262.method1758((byte) 35, arg0)) {
                return false;
            } else {
                class83 var4 = super.field2262.method1762(arg0, (byte) 45);
                if (var4 == null) {
                    return false;
                } else {
                    int[] var6;
                    if (!var4.field961) {
                        var6 = super.field2262.method1759(128, 128, 0.7F, (byte) 94, arg0, true);
                    } else {
                        var6 = super.field2262.method1764(0.7F, 128, arg0, 128, true, 74);
                    }
                    this.method2065(arg0, var4.field962, var4.field960, var4.field972, var4.field975, var4.field974, var4.field980, var4.field965, var4.field968, var4.field963, var4.field970, var4.field967, var4.field976, var6);
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "f", descriptor = "()V", line = 320)
    public final void method1017() {
    }

    @OriginalMember(owner = "client!a", name = "q", descriptor = "()Z", line = 323)
    public final boolean method345() {
        return false;
    }

    @OriginalMember(owner = "client!a", name = "f", descriptor = "(I)V", line = 326)
    public final void method981(int arg0) {
        this.field4874[arg0].method3260();
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "([Lr;Loaa;Lm;[Lgr;I)V", line = 332)
    public final void method958(class520[] arg0, class510 arg1, class105 arg2, class525[] arg3, int arg4) {
        this.method2054(arg1, true);
        if (arg3 == null) {
            this.method2059().method3246(this, arg0, arg2, (int[]) null, arg4, field4862, field4857, field4859, field4860, field4861, arg1.field7577.method3018(0), field4864);
        } else {
            class525 var6 = arg3[0];
            field4865[5] = 0;
            this.method2059().method3246(this, arg0, arg2, field4865, arg4, field4862, field4857, field4859, field4860, field4861, arg1.field7577.method3018(0), field4864);
            var6.field7767 = field4865[0];
            var6.field7769 = field4865[1];
            var6.field7768 = field4865[2];
            var6.field7770 = field4865[3];
            var6.field7766 = field4865[4];
            var6.field7771 = field4865[5] != 0;
        }
        int var7 = 0;
        for (int var8 = 0; var8 < arg0.length; ++var8) {
            if (arg0[var8] != null) {
                class315 var9 = (class315) arg0[var8];
                var9.method1955(var7, arg2);
                if (var9.field4728 != null) {
                    var7 += var9.field4728.length * 9;
                }
                if (var9.field4727 != null) {
                    var7 += var9.field4727.length * 3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "([IIIII)Lha;", line = 375)
    public final class116 method982(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class589(this, this.field4852, arg0, arg1, arg2, arg3, arg4) : new class478(this, this.field4852, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class589(this, this.field4852, arg0, arg1, arg2, arg3, arg4) : new class478(this, this.field4852, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!a", name = "XA", descriptor = "()V", line = 417)
    private final void method2058() {
        System.gc();
        System.runFinalization();
        class75.method436(-1);
    }

    @OriginalMember(owner = "client!a", name = "E", descriptor = "()Lv;", line = 424)
    public final class557 method2059() {
        for (int var1 = 0; var1 < this.field4872; ++var1) {
            if (this.field4874[var1].field8270 == Thread.currentThread()) {
                return this.field4874[var1];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(IIIIII)V", line = 436)
    public final void method1032(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1015(arg0, arg1, arg2, arg4, arg5);
        this.method1015(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method966(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
        this.method966(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lr;Loaa;Lm;Lgr;I)V", line = 444)
    public final void method1005(class520 arg0, class510 arg1, class105 arg2, class525 arg3, int arg4) {
        this.method2054(arg1, true);
        if (arg3 == null) {
            this.method2059().method3245(this, arg0, arg2, (int[]) null, arg4, field4862, field4857, field4859, field4860, field4861, arg1.field7577.method3018(0), field4864);
        } else {
            field4865[5] = 0;
            this.method2059().method3245(this, arg0, arg2, field4865, arg4, field4862, field4857, field4859, field4860, field4861, arg1.field7577.method3018(0), field4864);
            arg3.field7767 = field4865[0];
            arg3.field7769 = field4865[1];
            arg3.field7768 = field4865[2];
            arg3.field7770 = field4865[3];
            arg3.field7766 = field4865[4];
            arg3.field7771 = field4865[5] != 0;
        }
        class315 var6 = (class315) arg0;
        var6.method1955(0, arg2);
    }

    @OriginalMember(owner = "client!a", name = "D", descriptor = "()Z", line = 465)
    public final boolean method1006() {
        return false;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 470)
    public final void method968(Canvas arg0) {
        class573 var2 = (class573) this.field4871.method1333((long) arg0.hashCode(), false);
        if (var2 == null) {
            try {
                Class var3 = Class.forName("java.awt.Canvas");
                Method var4 = var3.getMethod("setIgnoreRepaint", Boolean.TYPE);
                var4.invoke(arg0, Boolean.TRUE);
            } catch (Exception var6) {
            }
            class573 var5 = new class573(this, arg0);
            this.field4871.method1341(var5, (byte) 103, (long) arg0.hashCode());
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Llh;Llh;FLlh;)Llh;", line = 489)
    public final class125 method332(class125 arg0, class125 arg1, float arg2, class125 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!a", name = "e", descriptor = "(I)Lu;", line = 498)
    public final class425 method1013(int arg0) {
        class618 var2 = new class618(this, arg0);
        this.field4855.method2492(var2, (byte) 41);
        return var2;
    }

    @OriginalMember(owner = "client!a", name = "z", descriptor = "()Z", line = 503)
    public final boolean method973() {
        return true;
    }

    @OriginalMember(owner = "client!a", name = "o", descriptor = "()Z", line = 507)
    public final boolean method955() {
        return true;
    }

    @OriginalMember(owner = "client!a", name = "k", descriptor = "()V", line = 512)
    public final void method288() throws class477 {
        if (this.field4870 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field4870.method3348();
        }
    }

    @OriginalMember(owner = "client!a", name = "v", descriptor = "()V", line = 522)
    public final void method286() {
    }

    @OriginalMember(owner = "client!a", name = "r", descriptor = "()I", line = 525)
    public final int method994() {
        return 4;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)V", line = 527)
    public final void method307(boolean arg0) {
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "()Lrr;", line = 532)
    public final class374 method287() {
        return new class374(0, "SSE", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 547)
    public final void method1000(Canvas arg0) {
        if (this.field4870.field8455 == arg0) {
            this.method964((Canvas) null);
        }
        class573 var2 = (class573) this.field4871.method1333((long) arg0.hashCode(), false);
        if (var2 != null) {
            var2.method2997(1);
            var2.method3355();
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ldd;[Lqr;Z)Lra;", line = 561)
    public final class262 method998(class166 arg0, class610[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field8975;
            var5[var7] = arg1[var7].field8972;
            if (arg1[var7].field8970 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
            } else {
                return new class91(this, this.field4852, arg0, arg1, (class116[]) null);
            }
        } else if (var6) {
            throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
        } else {
            return new class284(this, this.field4852, arg0, arg1, (class116[]) null);
        }
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "(IIIIII)V", line = 607)
    public final void method983(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2053(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "Q", descriptor = "()Ljava/lang/Object;", line = 611)
    private final Object method2063() {
        return new class354(this);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIII)V", line = 614)
    public final void method997(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2059().method3255(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!a", name = "WA", descriptor = "(S)Z", line = 617)
    private final boolean method2064(short arg0) {
        synchronized (this) {
            class83 var3 = super.field2262.method1762(arg0, (byte) 45);
            if (var3 == null) {
                return false;
            } else {
                this.method2061(arg0, var3.field962, var3.field960, var3.field972, var3.field975, var3.field974, var3.field980, var3.field965, var3.field968, var3.field963, var3.field970, var3.field967, var3.field976);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II[I[I)Lpa;", line = 629)
    public final class594 method1028(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class416(this, this.field4852, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lqr;Z)Lha;", line = 633)
    public final class116 method961(class610 arg0, boolean arg1) {
        int[] var3 = arg0.field8974;
        byte[] var4 = arg0.field8976;
        int var5 = arg0.field8975;
        int var6 = arg0.field8972;
        class116 var7;
        if (arg1 && arg0.field8970 == null) {
            var7 = new class291(this, this.field4852, var3, var4, 0, arg0.field8975, arg0.field8975, arg0.field8972);
        } else {
            int var8 = var5 * var6;
            int[] var9 = new int[var8];
            byte[] var10 = arg0.field8970;
            if (var10 != null) {
                for (int var11 = 0; var11 < var6; ++var11) {
                    int var12 = var5 * var11;
                    for (int var13 = 0; var13 < var5; ++var13) {
                        var9[var12 + var13] = var3[var4[var12 + var13] & 255] | var10[var12 + var13] << 24;
                    }
                }
                var7 = new class589(this, this.field4852, var9, 0, var5, var5, var6);
            } else {
                boolean var14 = false;
                for (int var15 = 0; var15 < var8; ++var15) {
                    int var16 = arg0.field8974[var4[var15] & 255];
                    if (var16 >>> 24 != 255) {
                        var14 = true;
                    }
                    var9[var15] = var16;
                }
                if (var14) {
                    var7 = new class589(this, this.field4852, var9, 0, arg0.field8975, arg0.field8975, arg0.field8972);
                } else {
                    var7 = new class478(this, this.field4852, var9, 0, arg0.field8975, arg0.field8975, arg0.field8972);
                }
            }
        }
        var7.method720(arg0.field8971, arg0.field8973, arg0.field8968, arg0.field8969);
        return var7;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II[[I[[IIII)Lsa;", line = 707)
    public final class543 method965(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class204(this, this.field4852, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!a", name = "s", descriptor = "()Z", line = 713)
    public final boolean method1031() {
        return false;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lu;)V", line = 720)
    public final void method971(class425 arg0) {
        this.field4852 = (class618) arg0;
        this.method2052(arg0);
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(Z)V", line = 726)
    public final void method953(boolean arg0) {
    }

    @OriginalMember(owner = "client!a", name = "l", descriptor = "()Lm;", line = 729)
    public final class105 method1020() {
        return new class448();
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(FFF)V", line = 732)
    public final void method347(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!a", name = "p", descriptor = "()V", line = 735)
    public final void method303() {
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIZ)Lha;", line = 741)
    public final class116 method1040(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return arg4 ? new class589(this, this.field4852, arg0, arg1, arg2, arg3) : new class478(this, this.field4852, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!a", name = "g", descriptor = "()Z", line = 754)
    public final boolean method1012() {
        return true;
    }

    @OriginalMember(owner = "client!a", name = "m", descriptor = "()Z", line = 764)
    public final boolean method976() {
        return false;
    }

    @OriginalMember(owner = "client!a", name = "g", descriptor = "(I)V", line = 791)
    public final void method1044(int arg0) {
        this.field4872 = arg0;
        this.field4874 = new class557[this.field4872];
        for (int var2 = 0; var2 < this.field4872; ++var2) {
            this.field4874[var2] = new class557(this, this.field4869, this.field4868);
        }
    }

    @OriginalMember(owner = "client!a", name = "HA", descriptor = "(I)V")
    private final native void method2049(int arg0);

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(IIII)V")
    public final native void method1016(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "oa", descriptor = "(I[I[F)V")
    private final native void method2050(int arg0, int[] arg1, float[] arg2);

    @OriginalMember(owner = "client!a", name = "CA", descriptor = "()I")
    public final native int method960();

    @OriginalMember(owner = "client!a", name = "q", descriptor = "(IIII)V")
    public final native void method1019(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "ta", descriptor = "(II)V")
    public final native void method1021(int arg0, int arg1);

    @OriginalMember(owner = "client!a", name = "M", descriptor = "(F)V")
    public final native void method987(float arg0);

    @OriginalMember(owner = "client!a", name = "Y", descriptor = "(Ln;II)V")
    private final native void method2051(class472 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!a", name = "ea", descriptor = "(Lu;)V")
    private final native void method2052(class425 arg0);

    @OriginalMember(owner = "client!a", name = "N", descriptor = "(IIII)V")
    public final native void method1022(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "ra", descriptor = "()F")
    public final native float method1041();

    @OriginalMember(owner = "client!a", name = "G", descriptor = "(ILpa;II)V")
    public final native void method956(int arg0, class594 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "la", descriptor = "(FF)V")
    public final native void method1009(float arg0, float arg1);

    @OriginalMember(owner = "client!a", name = "t", descriptor = "(IIIIII)V")
    private final native void method2053(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!a", name = "IA", descriptor = "(III[I)V")
    public final native void method1037(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!a", name = "Z", descriptor = "(I)V")
    public final native void method321(int arg0);

    @OriginalMember(owner = "client!a", name = "c", descriptor = "()I")
    public final native int method1018();

    @OriginalMember(owner = "client!a", name = "TA", descriptor = "(Lm;)V")
    private final native void method2055(class105 arg0);

    @OriginalMember(owner = "client!a", name = "ca", descriptor = "(IIIIIILpa;II)V")
    private final native void method2056(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class594 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!a", name = "v", descriptor = "(IIII)[I")
    public final native int[] method327(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "L", descriptor = "(I)V")
    public final native void method972(int arg0);

    @OriginalMember(owner = "client!a", name = "m", descriptor = "(IFFFFF)V")
    public final native void method1008(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!a", name = "UA", descriptor = "(IIIII)V")
    public final native void method1015(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!a", name = "P", descriptor = "()F")
    public final native float method957();

    @OriginalMember(owner = "client!a", name = "YA", descriptor = "()I")
    public final native int method311();

    @OriginalMember(owner = "client!a", name = "U", descriptor = "()I")
    public final native int method1029();

    @OriginalMember(owner = "client!a", name = "JA", descriptor = "(IIII)V")
    public final native void method979(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "ba", descriptor = "()I")
    public final native int method1024();

    @OriginalMember(owner = "client!a", name = "MA", descriptor = "(Lb;)V")
    private final native void method2060(class573 arg0);

    @OriginalMember(owner = "client!a", name = "za", descriptor = "(IIIIII[BII)V")
    public final native void method1011(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!a", name = "f", descriptor = "(IIIIII)V")
    public final native void method980(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!a", name = "E", descriptor = "(III)V")
    public final native void method974(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!a", name = "RA", descriptor = "(SBBZZZBBBIIZZ)V")
    private final native void method2061(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12);

    @OriginalMember(owner = "client!a", name = "xa", descriptor = "()V")
    public final native void method1034();

    @OriginalMember(owner = "client!a", name = "F", descriptor = "(IIII)V")
    public final native void method993(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "w", descriptor = "()V")
    private final native void method2062();

    @OriginalMember(owner = "client!a", name = "B", descriptor = "(IIIIII)Z")
    public final native boolean method1027(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!a", name = "A", descriptor = "(IIIII)V")
    public final native void method1003(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!a", name = "n", descriptor = "()V")
    public final native void method985();

    @OriginalMember(owner = "client!a", name = "e", descriptor = "(IIIII)V")
    public final native void method966(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!a", name = "NA", descriptor = "(Z)V")
    public final native void method530(boolean arg0);

    @OriginalMember(owner = "client!a", name = "h", descriptor = "(SBBZZZBBBIIZZ[I)V")
    private final native void method2065(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12, int[] arg13);

    @OriginalMember(owner = "client!a", name = "d", descriptor = "([I)V")
    public final native void method1025(int[] arg0);
}
