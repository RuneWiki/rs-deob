import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class691 extends class58 implements class529 {

    @OriginalMember(owner = "client!oa", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!oa", name = "P", descriptor = "Z")
    private boolean field9729 = false;

    @OriginalMember(owner = "client!oa", name = "J", descriptor = "Lnt;")
    private class220 field9724 = new class220();

    @OriginalMember(owner = "client!oa", name = "R", descriptor = "I")
    private int field9731 = 4096;

    @OriginalMember(owner = "client!oa", name = "V", descriptor = "I")
    private int field9735 = 4096;

    @OriginalMember(owner = "client!oa", name = "S", descriptor = "Lmp;")
    private class758 field9732 = new class758(4);

    @OriginalMember(owner = "client!oa", name = "Y", descriptor = "Z")
    private boolean field9738 = false;

    @OriginalMember(owner = "client!oa", name = "U", descriptor = "Lkd;")
    private class280 field9734;

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "[I")
    private static int[] field9716 = new int[Math.max(Math.max(104, 20), 24573)];

    @OriginalMember(owner = "client!oa", name = "H", descriptor = "[I")
    private static int[] field9722 = new int[8191];

    @OriginalMember(owner = "client!oa", name = "D", descriptor = "[I")
    public static int[] field9718 = new int[6];

    @OriginalMember(owner = "client!oa", name = "G", descriptor = "[S")
    private static short[] field9721 = new short[8191];

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "[I")
    private static int[] field9719 = field9716;

    @OriginalMember(owner = "client!oa", name = "K", descriptor = "[I")
    private static int[] field9725 = new int[8191];

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "[F")
    private static float[] field9720 = new float[20];

    @OriginalMember(owner = "client!oa", name = "N", descriptor = "[I")
    public static int[] field9727 = field9716;

    @OriginalMember(owner = "client!oa", name = "M", descriptor = "[F")
    private static float[] field9726 = field9720;

    @OriginalMember(owner = "client!oa", name = "O", descriptor = "[B")
    private static byte[] field9728 = new byte[8191];

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "[I")
    private static int[] field9723 = field9716;

    @OriginalMember(owner = "client!oa", name = "W", descriptor = "I")
    public int field9736;

    @OriginalMember(owner = "client!oa", name = "T", descriptor = "Lp;")
    private class216 field9733;

    @OriginalMember(owner = "client!oa", name = "Q", descriptor = "Lkd;")
    private class280 field9730;

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "Lya;")
    private class51 field9717;

    @OriginalMember(owner = "client!oa", name = "X", descriptor = "[La;")
    private class616[] field9737;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "()Lkd;", line = 3)
    public final class280 method530() {
        return this.field9734;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "()V", line = 10)
    public final void method533() {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 13)
    public final void method529(Canvas arg0) {
        if (arg0 != null) {
            class216 var2 = (class216) this.field9732.method4203(true, (long) arg0.hashCode());
            this.field9733 = var2;
            this.method3877(var2);
        } else {
            this.field9733 = null;
            this.method3877((class216) null);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[Lbh;)V", line = 29)
    public final void method575(int arg0, class36[] arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < arg0; ++var4) {
            field9719[var3++] = arg1[var4].method290((byte) 127);
            field9719[var3++] = arg1[var4].method298(false);
            field9719[var3++] = arg1[var4].method291(0);
            field9719[var3++] = arg1[var4].method294(58);
            field9726[var4] = arg1[var4].method296((byte) 3);
            field9719[var3++] = arg1[var4].method292(6865);
        }
        this.method3876(arg0, field9719, field9726);
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(II)I", line = 47)
    public final int method614(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "()Z", line = 50)
    public final boolean method560() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(II)Lc;", line = 55)
    public final class185 method644(int arg0, int arg1) {
        return this.method581(arg0, arg1, false);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lfp;[Lfw;Z)Lda;", line = 60)
    public final class59 method632(class323 arg0, class55[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field1044;
            var5[var7] = arg1[var7].field1038;
            if (arg1[var7].field1040 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
            } else {
                return new class661(this, this.field9717, arg0, arg1, (class743[]) null);
            }
        } else if (var6) {
            throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
        } else {
            return new class17(this, this.field9717, arg0, arg1, (class743[]) null);
        }
    }

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "()Z", line = 98)
    public final boolean method635() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "()Lkd;", line = 101)
    public final class280 method558() {
        return new class276();
    }

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "(I)Lza;", line = 107)
    public final class411 method568(int arg0) {
        class51 var2 = new class51(this, arg0);
        this.field9724.method1526(var2, -37);
        return var2;
    }

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "()V", line = 116)
    public final void method590() {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIII)V", line = 119)
    public final void method626(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method3887().method3547(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V", line = 122)
    public final void method628(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class701 {
        if (this.field9733 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field9733.method1503(arg0, arg1, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)Lvi;", line = 132)
    public final class536 method551(int arg0, int arg1) {
        return new class499(arg0, arg1);
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;II)V", line = 137)
    public final void method645(Canvas arg0, int arg1, int arg2) {
        class216 var4 = (class216) this.field9732.method4203(true, (long) arg0.hashCode());
        if (var4 == null) {
            try {
                Class var5 = Class.forName("java.awt.Canvas");
                Method var6 = var5.getMethod("setIgnoreRepaint", Boolean.TYPE);
                var6.invoke(arg0, Boolean.TRUE);
            } catch (Exception var8) {
            }
            class216 var7 = new class216(this, arg0, arg1, arg2);
            this.field9732.method4211(var7, (byte) 57, (long) arg0.hashCode());
        } else {
            if (var4.field3086 != arg1 || var4.field3089 != arg2) {
                var4.method1506(arg0, arg1, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "()Z", line = 160)
    public final boolean method600() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "(I)V", line = 166)
    public final void method591(int arg0) {
        this.field9736 = arg0;
        this.field9737 = new class616[this.field9736];
        for (int var2 = 0; var2 < this.field9736; ++var2) {
            this.field9737[var2] = new class616(this, this.field9731, this.field9735);
        }
    }

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "()Lkd;", line = 180)
    public final class280 method612() {
        return this.field9730;
    }

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "()Z", line = 184)
    public final boolean method562() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "()V", line = 187)
    private final void method3879() {
        System.gc();
        System.runFinalization();
        class727.method4044(100);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([I)V", line = 193)
    public final void method524(int[] arg0) {
        Dimension var2 = this.field9733.field3085.getSize();
        arg0[0] = var2.width;
        arg0[1] = var2.height;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)V", line = 197)
    public final void method625(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lza;)V", line = 200)
    public final void method578(class411 arg0) {
        this.field9717 = (class51) arg0;
        this.method3881(arg0);
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(S)Z", line = 204)
    private final boolean method3880(short arg0) {
        synchronized (this) {
            class546 var3 = super.field1084.method1154(-107, arg0);
            if (var3 == null) {
                return false;
            } else {
                this.method3890(arg0, var3.field7703, var3.field7708, var3.field7711, var3.field7694, var3.field7697, var3.field7706, var3.field7707, var3.field7696, var3.field7714, var3.field7712, var3.field7705, var3.field7710, var3.field7713, var3.field7704, var3.field7702, var3.field7709, var3.field7699, var3.field7715, var3.field7695);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIZ)Lkr;", line = 217)
    public final class743 method576(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return new class538(this, arg0, arg1, arg2, arg3, !arg4);
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Z)V", line = 220)
    public final void method564(boolean arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 223)
    public final void method607(Canvas arg0) {
        if (this.field9733.field3085 == arg0) {
            this.method529((Canvas) null);
        }
        class216 var2 = (class216) this.field9732.method4203(true, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method3617(1);
            var2.method1504();
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V", line = 237)
    public final void method527(int arg0) {
        this.field9737[arg0].method3545();
    }

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "()Z", line = 241)
    public final boolean method627() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "()Z", line = 244)
    public final boolean method605() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "(I)V", line = 248)
    public final void method570(int arg0) {
        this.field9737[arg0].method3568();
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(II)I", line = 253)
    public final int method611(int arg0, int arg1) {
        int var3 = arg0 & 1048575;
        int var4 = arg1 & 1048575;
        return var3 & var4 ^ var4;
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(IIIIII)Lsfa;", line = 259)
    public final class693 method609(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "WA", descriptor = "(S)Z", line = 264)
    private final boolean method3882(short arg0) {
        class149 var2 = super.field1084;
        synchronized (super.field1084) {
            if (!super.field1084.method1152(arg0, 110)) {
                return false;
            } else {
                class546 var4 = super.field1084.method1154(-120, arg0);
                if (var4 == null) {
                    return false;
                } else {
                    int[] var6;
                    if (var4.field7708 != 2) {
                        var6 = super.field1084.method1151(0.7F, 128, true, -18596, arg0, 128);
                    } else {
                        var6 = super.field1084.method1155(128, true, arg0, (byte) 79, 0.7F, 128);
                    }
                    this.method3878(arg0, var6, var4.field7703, var4.field7708, var4.field7711, var4.field7694, var4.field7697, var4.field7706, var4.field7707, var4.field7696, var4.field7714, var4.field7712, var4.field7705, var4.field7710, var4.field7713, var4.field7704, var4.field7702, var4.field7709, var4.field7699, var4.field7715, var4.field7695);
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Loo;Z)V", line = 289)
    private final void method3883(class624 arg0, boolean arg1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        for (class232 var8 = (class232) arg0.field8974.method2299(109); var8 != null; var8 = (class232) arg0.field8974.method2305(-126)) {
            field9723[var3++] = var8.field3297;
            field9723[var3++] = var8.field3295;
            field9723[var3++] = var8.field3300;
            field9725[var4++] = var8.field3303;
            field9721[var6++] = (short) var8.field3304;
            field9722[var5++] = var8.field3305;
            if (arg1) {
                field9728[var7++] = var8.field3302;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILaa;IIIII)V", line = 318)
    public final void method526(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class484 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ld;II)V", line = 321)
    public class691(Canvas arg0, class149 arg1, int arg2, int arg3) {
        super(arg1);
        try {
            if (!class96.method870(0, "sw3d")) {
                throw new RuntimeException("");
            } else {
                class727.method4042(0);
                this.method3889(super.field1084, 0, 0);
                class419.method2564(false, -125, true);
                this.field9738 = true;
                this.field9734 = new class276();
                this.method538(new class276());
                this.method591(1);
                this.method527(0);
                if (arg0 != null) {
                    this.method645(arg0, arg2, arg3);
                    this.method529(arg0);
                }
            }
        } catch (Throwable var5) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V", line = 348)
    public final void method559(int arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Loo;)V", line = 352)
    public final void method593(class624 arg0) {
        if (arg0.field8974.method2303(115) != 0) {
            this.method3883(arg0, false);
            this.method3887().method3554(this, field9723, field9725, field9722, field9721, arg0.field8974.method2303(123));
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;II)V", line = 360)
    public final void method572(Canvas arg0, int arg1, int arg2) {
        class216 var4 = (class216) this.field9732.method4203(true, (long) arg0.hashCode());
        var4.method1506(arg0, arg1, arg2);
        if (arg0 != null && this.field9733.field3085 == arg0) {
            this.method529(arg0);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIZ)Lkr;", line = 367)
    public final class743 method581(int arg0, int arg1, boolean arg2) {
        return new class538(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIF)Lbh;", line = 370)
    public final class36 method577(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return new class57(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!oa", name = "OA", descriptor = "()Ljava/lang/Object;", line = 377)
    private final Object method3884() {
        return new class384(this);
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)V", line = 388)
    public final void method566(int arg0) {
        class727.method4044(-90);
        this.method3885(arg0);
        for (class51 var2 = (class51) this.field9724.method1522(true); var2 != null; var2 = (class51) this.field9724.method1527((byte) 96)) {
            var2.method461();
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lww;IIII)Lka;", line = 401)
    public final class469 method646(class729 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class39(this, this.field9717, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "()V", line = 408)
    public final void method536() {
        this.method529(this.field9733.field3085);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Loo;I)V", line = 411)
    public final void method643(class624 arg0, int arg1) {
        this.method3883(arg0, false);
        this.method3887().method3554(this, field9723, field9725, field9722, field9721, arg0.field8974.method2303(-126));
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V", line = 420)
    public final void method548(boolean arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "()V", line = 423)
    public final void method638() {
        if (!this.field9729) {
            this.field9737 = null;
            this.field9733 = null;
            this.field9717 = null;
            this.field9734 = null;
            this.field9732.method4204((byte) 108);
            for (class51 var1 = (class51) this.field9724.method1522(true); var1 != null; var1 = (class51) this.field9724.method1527((byte) 66)) {
                var1.method460();
            }
            this.field9724.method1530((byte) 82);
            this.method3886();
            if (this.field9738) {
                class372.method2334(0, false, true);
                this.field9738 = false;
            }
            this.method3879();
            class727.method4046(-126);
            this.field9729 = true;
        }
    }

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "()Z", line = 453)
    public final boolean method622() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILaa;II)V", line = 457)
    public final void method588(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class484 arg6, int arg7, int arg8) {
        this.method3888(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)V", line = 463)
    public final void method554(int arg0, int arg1) throws class701 {
        if (this.field9733 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field9733.method1508(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(FFF)V", line = 472)
    public final void method606(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([IIIIIZ)Lkr;", line = 475)
    public final class743 method620(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return new class538(this, arg0, arg1, arg2, arg3, arg4, false);
    }

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "()I", line = 478)
    public final int method615() {
        return 4;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIIII)V", line = 484)
    public final void method553(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method3875(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lsfa;)V", line = 487)
    public final void method587(class693 arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[[I[[IIII)Ls;", line = 491)
    public final class278 method621(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class665(this, this.field9717, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "(IIIIII)V", line = 494)
    public final void method616(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method528(arg0, arg1, arg2, arg4, arg5);
        this.method528(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method541(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
        this.method541(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIII)V", line = 499)
    public final void method647(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIIIIIII)V", line = 509)
    public final void method535(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
    }

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "()Z", line = 515)
    public final boolean method634() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[I[I)Laa;", line = 518)
    public final class484 method573(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class45(this, this.field9717, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "()Z", line = 522)
    public final boolean method589() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "()Lsia;", line = 538)
    public final class732 method599() {
        return new class732(0, "SSE", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "()V", line = 540)
    public final void method565() {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lkd;)V", line = 546)
    public final void method538(class280 arg0) {
        this.field9730 = arg0;
        this.method3891(((class276) arg0).nativeid);
    }

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "()V", line = 550)
    public final void method595() {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lc;Lvi;)Luaa;", line = 556)
    public final class116 method544(class185 arg0, class536 arg1) {
        return new class608(this, (class538) arg0, (class499) arg1);
    }

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "()Z", line = 559)
    public final boolean method563() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "()La;", line = 567)
    public final class616 method3887() {
        for (int var1 = 0; var1 < this.field9736; ++var1) {
            if (this.field9737[var1].field8910 == Thread.currentThread()) {
                return this.field9737[var1];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "finalize", descriptor = "()V", line = 582)
    protected final synchronized void finalize() {
        this.method623(-1);
        if (this.nativeid != 0L) {
            class727.method4045(this, 13483);
        }
    }

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "(I)V", line = 588)
    public final void method608(int arg0) {
        this.field9731 = this.field9735 = arg0;
        if (this.field9736 > 1) {
            throw new IllegalStateException("No MT");
        } else {
            this.method591(this.field9736);
            this.method527(0);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lfw;Z)Lkr;", line = 599)
    public final class743 method637(class55 arg0, boolean arg1) {
        class538 var3 = new class538(this, arg0.field1039, arg0.field1041, arg0.field1040, 0, arg0.field1044, arg0.field1044, arg0.field1038);
        var3.method87(arg0.field1042, arg0.field1036, arg0.field1037, arg0.field1043);
        return var3;
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "()Z", line = 607)
    public final boolean method550() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "()V", line = 615)
    public final void method567() {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lsfa;Lsfa;FLsfa;)Lsfa;", line = 624)
    public final class693 method571(class693 arg0, class693 arg1, float arg2, class693 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "()Z", line = 628)
    public final boolean method618() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "()Z", line = 632)
    public final boolean method579() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Luaa;)V", line = 636)
    public final void method610(class116 arg0) {
        class608 var2 = (class608) arg0;
        this.method3874(var2.field8819.nativeid, var2.field8820.nativeid);
    }

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "(JJ)V")
    private final native void method3874(long arg0, long arg1);

    @OriginalMember(owner = "client!oa", name = "M", descriptor = "()I")
    public final native int method598();

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "(IIIIIII)I")
    public final native int method585(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!oa", name = "wa", descriptor = "(IIIIII)V")
    private final native void method3875(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIID)V")
    public final native void method532(int arg0, int arg1, int arg2, int arg3, double arg4);

    @OriginalMember(owner = "client!oa", name = "xa", descriptor = "(F)V")
    public final native void method552(float arg0);

    @OriginalMember(owner = "client!oa", name = "U", descriptor = "(IIIII)V")
    public final native void method528(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "Y", descriptor = "()[I")
    public final native int[] method547();

    @OriginalMember(owner = "client!oa", name = "K", descriptor = "([I)V")
    public final native void method624(int[] arg0);

    @OriginalMember(owner = "client!oa", name = "X", descriptor = "(I)V")
    public final native void method604(int arg0);

    @OriginalMember(owner = "client!oa", name = "N", descriptor = "(I[I[F)V")
    private final native void method3876(int arg0, int[] arg1, float[] arg2);

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "(Lp;)V")
    private final native void method3877(class216 arg0);

    @OriginalMember(owner = "client!oa", name = "CA", descriptor = "(S[ISIBBIZBBBBZZZZZBZZI)V")
    private final native void method3878(short arg0, int[] arg1, short arg2, int arg3, byte arg4, byte arg5, int arg6, boolean arg7, byte arg8, byte arg9, byte arg10, byte arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, boolean arg16, byte arg17, boolean arg18, boolean arg19, int arg20);

    @OriginalMember(owner = "client!oa", name = "P", descriptor = "(IIIII)V")
    public final native void method541(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "la", descriptor = "()V")
    public final native void method601();

    @OriginalMember(owner = "client!oa", name = "XA", descriptor = "()I")
    public final native int method531();

    @OriginalMember(owner = "client!oa", name = "va", descriptor = "(Lza;)V")
    private final native void method3881(class411 arg0);

    @OriginalMember(owner = "client!oa", name = "T", descriptor = "(IIII)V")
    public final native void method583(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "HA", descriptor = "(IIII[I)V")
    public final native void method631(int arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!oa", name = "na", descriptor = "(IIII)[I")
    public final native int[] method574(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "GA", descriptor = "(I)V")
    public final native void method617(int arg0);

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "(Z)V")
    public final native void method107(boolean arg0);

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "(Z)V")
    public final native void method539(boolean arg0);

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "(II)V")
    public final native void method580(int arg0, int arg1);

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "()I")
    public final native int method534();

    @OriginalMember(owner = "client!oa", name = "za", descriptor = "(IIIII)V")
    public final native void method640(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "(ILaa;II)V")
    public final native void method523(int arg0, class484 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V")
    private final native void method3885(int arg0);

    @OriginalMember(owner = "client!oa", name = "ZA", descriptor = "(IFFFFF)V")
    public final native void method522(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!oa", name = "FA", descriptor = "()V")
    private final native void method3886();

    @OriginalMember(owner = "client!oa", name = "EA", descriptor = "(IIII)V")
    public final native void method596(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "(II)V")
    public final native void method556(int arg0, int arg1);

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "(III)V")
    public final native void method636(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oa", name = "da", descriptor = "(III[I)V")
    public final native void method537(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!oa", name = "DA", descriptor = "(IIII)V")
    public final native void method545(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "ra", descriptor = "(IIII)V")
    public final native void method639(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "ya", descriptor = "()V")
    public final native void method619();

    @OriginalMember(owner = "client!oa", name = "JA", descriptor = "(IIIIII)I")
    public final native int method602(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "Q", descriptor = "(IIIIII[BII)V")
    public final native void method603(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!oa", name = "KA", descriptor = "(IIII)V")
    public final native void method584(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "pa", descriptor = "()V")
    public final native void method613();

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "()I")
    public final native int method594();

    @OriginalMember(owner = "client!oa", name = "H", descriptor = "(III[I)V")
    public final native void method592(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "()I")
    public final native int method641();

    @OriginalMember(owner = "client!oa", name = "aa", descriptor = "(IIIIII)V")
    public final native void method630(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "Z", descriptor = "(IIIIIILaa;II)V")
    private final native void method3888(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class484 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!oa", name = "MA", descriptor = "(Ld;II)V")
    private final native void method3889(class149 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oa", name = "AA", descriptor = "(SSIBBIZBBBBZZZZZBZZI)V")
    private final native void method3890(short arg0, short arg1, int arg2, byte arg3, byte arg4, int arg5, boolean arg6, byte arg7, byte arg8, byte arg9, byte arg10, boolean arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, byte arg16, boolean arg17, boolean arg18, int arg19);

    @OriginalMember(owner = "client!oa", name = "ma", descriptor = "(J)V")
    private final native void method3891(long arg0);
}
