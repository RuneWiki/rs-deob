import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class693 extends class58 implements class532 {

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "Z")
    private boolean field9546 = false;

    @OriginalMember(owner = "client!oa", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "Lbg;")
    private class464 field9544 = new class464();

    @OriginalMember(owner = "client!oa", name = "G", descriptor = "I")
    private int field9558 = 4096;

    @OriginalMember(owner = "client!oa", name = "H", descriptor = "I")
    private int field9559 = 4096;

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "Lkk;")
    private class188 field9563 = new class188(4);

    @OriginalMember(owner = "client!oa", name = "O", descriptor = "Z")
    private boolean field9566 = false;

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "Lnga;")
    private class513 field9553;

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "[I")
    private static int[] field9545 = new int[Math.max(Math.max(104, 20), 24573)];

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "[I")
    public static int[] field9552 = field9545;

    @OriginalMember(owner = "client!oa", name = "D", descriptor = "[I")
    public static int[] field9555 = new int[6];

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "[I")
    private static int[] field9548 = field9545;

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "[B")
    private static byte[] field9550 = new byte[8191];

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "[I")
    private static int[] field9549 = new int[8191];

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "[S")
    private static short[] field9556 = new short[8191];

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "[I")
    private static int[] field9557 = new int[8191];

    @OriginalMember(owner = "client!oa", name = "J", descriptor = "[I")
    private static int[] field9561 = field9545;

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "[F")
    private static float[] field9560 = new float[20];

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "[F")
    private static float[] field9551 = field9560;

    @OriginalMember(owner = "client!oa", name = "M", descriptor = "I")
    public int field9564;

    @OriginalMember(owner = "client!oa", name = "K", descriptor = "Lp;")
    private class216 field9562;

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "Lnga;")
    private class513 field9554;

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "Lya;")
    private class51 field9547;

    @OriginalMember(owner = "client!oa", name = "N", descriptor = "[La;")
    private class618[] field9565;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[I[I)Laa;", line = 3)
    public final class486 method489(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class45(this, this.field9547, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "()Z", line = 7)
    public final boolean method413() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "OA", descriptor = "()Ljava/lang/Object;", line = 10)
    private final Object method3895() {
        return new class386(this);
    }

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "()V", line = 13)
    public final void method481() {
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V", line = 17)
    public final void method399(int arg0) {
        class198.method1218(-9657);
        this.method3908(arg0);
        for (class51 var2 = (class51) this.field9544.method2765(-12261); var2 != null; var2 = (class51) this.field9544.method2759(-15361)) {
            var2.method315();
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIZ)Loia;", line = 30)
    public final class88 method380(int arg0, int arg1, boolean arg2) {
        return new class541(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "()Lnga;", line = 33)
    public final class513 method439() {
        return this.field9553;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lmf;Lmf;FLmf;)Lmf;", line = 36)
    public final class418 method453(class418 arg0, class418 arg1, float arg2, class418 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIIIIIII)V", line = 41)
    public final void method482(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIII)V", line = 44)
    public final void method464(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ldm;Z)V", line = 48)
    private final void method3897(class50 arg0, boolean arg1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        for (class668 var8 = (class668) arg0.field578.method2062(-1); var8 != null; var8 = (class668) arg0.field578.method2057(0)) {
            field9561[var3++] = var8.field9077;
            field9561[var3++] = var8.field9079;
            field9561[var3++] = var8.field9072;
            field9557[var4++] = var8.field9084;
            field9556[var6++] = (short) var8.field9082;
            field9549[var5++] = var8.field9080;
            if (arg1) {
                field9550[var7++] = var8.field9085;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[Lwi;)V", line = 85)
    public final void method372(int arg0, class465[] arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < arg0; ++var4) {
            field9548[var3++] = arg1[var4].method2772(false);
            field9548[var3++] = arg1[var4].method2774(-115);
            field9548[var3++] = arg1[var4].method2773(true);
            field9548[var3++] = arg1[var4].method2777(-1);
            field9551[var4] = arg1[var4].method2780(-18277);
            field9548[var3++] = arg1[var4].method2778((byte) 112);
        }
        this.method3909(arg0, field9548, field9551);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ldm;I)V", line = 103)
    public final void method379(class50 arg0, int arg1) {
        this.method3897(arg0, false);
        this.method3904().method3468(this, field9561, field9557, field9549, field9556, arg0.field578.method2061(0));
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lnga;)V", line = 107)
    public final void method483(class513 arg0) {
        this.field9554 = arg0;
        this.method3910(((class276) arg0).nativeid);
    }

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "()V", line = 111)
    private final void method3899() {
        System.gc();
        System.runFinalization();
        class198.method1218(-9657);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIZ)Loia;", line = 117)
    public final class88 method386(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return new class541(this, arg0, arg1, arg2, arg3, !arg4);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ldga;Z)Loia;", line = 121)
    public final class88 method484(class204 arg0, boolean arg1) {
        class541 var3 = new class541(this, arg0.field2656, arg0.field2661, arg0.field2660, 0, arg0.field2657, arg0.field2657, arg0.field2664);
        var3.method655(arg0.field2662, arg0.field2659, arg0.field2658, arg0.field2663);
        return var3;
    }

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "()Z", line = 126)
    public final boolean method438() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(S)Z", line = 130)
    private final boolean method3901(short arg0) {
        synchronized (this) {
            class502 var3 = super.field715.method532((byte) 127, arg0);
            if (var3 == null) {
                return false;
            } else {
                this.method3912(arg0, var3.field7191, var3.field7203, var3.field7204, var3.field7195, var3.field7199, var3.field7208, var3.field7192, var3.field7196, var3.field7207, var3.field7193, var3.field7194, var3.field7201, var3.field7188, var3.field7198, var3.field7197, var3.field7200, var3.field7190, var3.field7205, var3.field7189);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "()Z", line = 141)
    public final boolean method374() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "()Lcf;", line = 145)
    public final class603 method451() {
        return new class603(0, "SSE", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "(I)V", line = 148)
    public final void method470(int arg0) {
        this.field9559 = this.field9558 = arg0;
        if (this.field9564 > 1) {
            throw new IllegalStateException("No MT");
        } else {
            this.method402(this.field9564);
            this.method443(0);
        }
    }

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "()Z", line = 156)
    public final boolean method463() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lgd;)V", line = 160)
    public final void method478(class339 arg0) {
        class610 var2 = (class610) arg0;
        this.method3898(var2.field8575.nativeid, var2.field8574.nativeid);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)Lza;", line = 165)
    public final class413 method371(int arg0) {
        class51 var2 = new class51(this, arg0);
        this.field9544.method2770((byte) -13, var2);
        return var2;
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(II)Lgba;", line = 170)
    public final class666 method473(int arg0, int arg1) {
        return new class501(arg0, arg1);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lmf;)V", line = 173)
    public final void method405(class418 arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lqm;[Ldga;Z)Lda;", line = 181)
    public final class59 method459(class143 arg0, class204[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field2657;
            var5[var7] = arg1[var7].field2664;
            if (arg1[var7].field2660 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
            } else {
                return new class663(this, this.field9547, arg0, arg1, (class88[]) null);
            }
        } else if (var6) {
            throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
        } else {
            return new class17(this, this.field9547, arg0, arg1, (class88[]) null);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILaa;IIIII)V", line = 217)
    public final void method456(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class486 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
    }

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "()V", line = 221)
    public final void method472() {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ldw;Lgba;)Lgd;", line = 224)
    public final class339 method467(class717 arg0, class666 arg1) {
        return new class610(this, (class541) arg0, (class501) arg1);
    }

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "()Z", line = 229)
    public final boolean method471() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 233)
    public final void method450(Canvas arg0) {
        if (arg0 != null) {
            class216 var2 = (class216) this.field9563.method1180((byte) 26, (long) arg0.hashCode());
            this.field9562 = var2;
            this.method3907(var2);
        } else {
            this.field9562 = null;
            this.method3907((class216) null);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)Ldw;", line = 249)
    public final class717 method415(int arg0, int arg1) {
        return this.method380(arg0, arg1, false);
    }

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "()Z", line = 252)
    public final boolean method462() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIF)Lwi;", line = 255)
    public final class465 method475(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return new class156(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "()Z", line = 259)
    public final boolean method396() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V", line = 263)
    public final void method375(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class76 {
        if (this.field9562 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field9562.method1332(arg0, arg1, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "()V", line = 272)
    public final void method377() {
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "()Z", line = 278)
    public final boolean method392() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "()Z", line = 284)
    public final boolean method491() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "()Lnga;", line = 287)
    public final class513 method427() {
        return new class276();
    }

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "()Z", line = 294)
    public final boolean method441() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "()Z", line = 299)
    public final boolean method468() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "()La;", line = 304)
    public final class618 method3904() {
        for (int var1 = 0; var1 < this.field9564; ++var1) {
            if (this.field9565[var1].field8627 == Thread.currentThread()) {
                return this.field9565[var1];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(II)I", line = 316)
    public final int method479(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "()V", line = 321)
    public final void method389() {
        if (!this.field9546) {
            this.field9565 = null;
            this.field9562 = null;
            this.field9547 = null;
            this.field9553 = null;
            this.field9563.method1175((byte) 84);
            for (class51 var1 = (class51) this.field9544.method2765(-12261); var1 != null; var1 = (class51) this.field9544.method2759(-15361)) {
                var1.method314();
            }
            this.field9544.method2767((byte) -19);
            this.method3900();
            if (this.field9566) {
                class19.method116(true, false, (byte) 66);
                this.field9566 = false;
            }
            this.method3899();
            class198.method1214(111);
            this.field9546 = true;
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)V", line = 351)
    public final void method435(int arg0, int arg1) throws class76 {
        if (this.field9562 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field9562.method1334(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "()V", line = 361)
    public final void method376() {
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ld;II)V", line = 369)
    public class693(Canvas arg0, class149 arg1, int arg2, int arg3) {
        super(arg1);
        try {
            if (!class608.method3425("sw3d", true)) {
                throw new RuntimeException("");
            } else {
                class198.method1215(-51);
                this.method3905(super.field715, 0, 0);
                class621.method3486(-16, false, true);
                this.field9566 = true;
                this.field9553 = new class276();
                this.method483(new class276());
                this.method402(1);
                this.method443(0);
                if (arg0 != null) {
                    this.method403(arg0, arg2, arg3);
                    this.method450(arg0);
                }
            }
        } catch (Throwable var5) {
            this.method474(1);
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[[I[[IIII)Ls;", line = 396)
    public final class278 method419(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class667(this, this.field9547, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 399)
    public final void method477(Canvas arg0) {
        if (this.field9562.field2832 == arg0) {
            this.method450((Canvas) null);
        }
        class216 var2 = (class216) this.field9563.method1180((byte) 26, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method1185(-44);
            var2.method1326();
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILaa;II)V", line = 412)
    public final void method383(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class486 arg6, int arg7, int arg8) {
        this.method3903(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([I)V", line = 418)
    public final void method420(int[] arg0) {
        Dimension var2 = this.field9562.field2832.getSize();
        arg0[0] = var2.width;
        arg0[1] = var2.height;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;II)V", line = 425)
    public final void method385(Canvas arg0, int arg1, int arg2) {
        class216 var4 = (class216) this.field9563.method1180((byte) 26, (long) arg0.hashCode());
        var4.method1330(arg0, arg1, arg2);
        if (arg0 != null && this.field9562.field2832 == arg0) {
            this.method450(arg0);
        }
    }

    @OriginalMember(owner = "client!oa", name = "finalize", descriptor = "()V", line = 432)
    protected final synchronized void finalize() {
        this.method474(1);
        if (this.nativeid != 0L) {
            class198.method1216((byte) 123, this);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ldm;)V", line = 440)
    public final void method381(class50 arg0) {
        if (arg0.field578.method2061(0) != 0) {
            this.method3897(arg0, false);
            this.method3904().method3468(this, field9561, field9557, field9549, field9556, arg0.field578.method2061(0));
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIII)V", line = 447)
    public final void method378(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method3902(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lie;IIII)Lka;", line = 450)
    public final class471 method397(class6 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class39(this, this.field9547, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Z)V", line = 457)
    public final void method449(boolean arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "()Lnga;", line = 460)
    public final class513 method436() {
        return this.field9554;
    }

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "()Z", line = 463)
    public final boolean method476() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "WA", descriptor = "(S)Z", line = 466)
    private final boolean method3906(short arg0) {
        class149 var2 = super.field715;
        synchronized (super.field715) {
            if (!super.field715.method531(arg0, 103)) {
                return false;
            } else {
                class502 var4 = super.field715.method532((byte) 127, arg0);
                if (var4 == null) {
                    return false;
                } else {
                    int[] var6;
                    if (var4.field7203 != 2) {
                        var6 = super.field715.method534(true, 128, 20377, 128, 0.7F, arg0);
                    } else {
                        var6 = super.field715.method530(128, -106, true, 0.7F, 128, arg0);
                    }
                    this.method3896(arg0, var6, var4.field7191, var4.field7203, var4.field7204, var4.field7195, var4.field7199, var4.field7208, var4.field7192, var4.field7196, var4.field7207, var4.field7193, var4.field7194, var4.field7201, var4.field7188, var4.field7198, var4.field7197, var4.field7200, var4.field7190, var4.field7205, var4.field7189);
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "()V", line = 494)
    public final void method412() {
        this.method450(this.field9562.field2832);
    }

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "(I)V", line = 500)
    public final void method443(int arg0) {
        this.field9565[arg0].method3455();
    }

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "()Z", line = 505)
    public final boolean method487() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)V", line = 510)
    public final void method486(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([IIIIIZ)Loia;", line = 513)
    public final class88 method421(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return new class541(this, arg0, arg1, arg2, arg3, arg4, false);
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(IIIIII)V", line = 519)
    public final void method445(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method433(arg0, arg1, arg2, arg4, arg5);
        this.method433(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method430(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
        this.method430(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lza;)V", line = 529)
    public final void method460(class413 arg0) {
        this.field9547 = (class51) arg0;
        this.method3911(arg0);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIII)V", line = 536)
    public final void method437(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method3904().method3456(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V", line = 538)
    public final void method373(boolean arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)V", line = 542)
    public final void method408(int arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(FFF)V", line = 549)
    public final void method428(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "(I)V", line = 553)
    public final void method416(int arg0) {
        this.field9565[arg0].method3477();
    }

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "()V", line = 561)
    public final void method432() {
    }

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "()I", line = 570)
    public final int method404() {
        return 4;
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(IIIIII)Lmf;", line = 579)
    public final class418 method448(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V", line = 585)
    public final void method402(int arg0) {
        this.field9564 = arg0;
        this.field9565 = new class618[this.field9564];
        for (int var2 = 0; var2 < this.field9564; ++var2) {
            this.field9565[var2] = new class618(this, this.field9559, this.field9558);
        }
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(II)I", line = 617)
    public final int method466(int arg0, int arg1) {
        int var3 = arg0 & 1048575;
        int var4 = arg1 & 1048575;
        return var3 & var4 ^ var4;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;II)V", line = 632)
    public final void method403(Canvas arg0, int arg1, int arg2) {
        class216 var4 = (class216) this.field9563.method1180((byte) 26, (long) arg0.hashCode());
        if (var4 == null) {
            try {
                Class var5 = Class.forName("java.awt.Canvas");
                Method var6 = var5.getMethod("setIgnoreRepaint", Boolean.TYPE);
                var6.invoke(arg0, Boolean.TRUE);
            } catch (Exception var8) {
            }
            class216 var7 = new class216(this, arg0, arg1, arg2);
            this.field9563.method1179((long) arg0.hashCode(), var7, (byte) -26);
        } else {
            if (var4.field2834 != arg1 || var4.field2833 != arg2) {
                var4.method1330(arg0, arg1, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "pa", descriptor = "()V")
    public final native void method414();

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "(III)V")
    public final native void method418(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "(Z)V")
    public final native void method490(boolean arg0);

    @OriginalMember(owner = "client!oa", name = "CA", descriptor = "(S[ISIBBIZBBBBZZZZZBZZI)V")
    private final native void method3896(short arg0, int[] arg1, short arg2, int arg3, byte arg4, byte arg5, int arg6, boolean arg7, byte arg8, byte arg9, byte arg10, byte arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, boolean arg16, byte arg17, boolean arg18, boolean arg19, int arg20);

    @OriginalMember(owner = "client!oa", name = "na", descriptor = "(IIII)[I")
    public final native int[] method409(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "(JJ)V")
    private final native void method3898(long arg0, long arg1);

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "(IIIIIII)I")
    public final native int method454(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "()I")
    public final native int method465();

    @OriginalMember(owner = "client!oa", name = "M", descriptor = "()I")
    public final native int method407();

    @OriginalMember(owner = "client!oa", name = "FA", descriptor = "()V")
    private final native void method3900();

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "(Z)V")
    public final native void method106(boolean arg0);

    @OriginalMember(owner = "client!oa", name = "EA", descriptor = "(IIII)V")
    public final native void method444(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "(II)V")
    public final native void method492(int arg0, int arg1);

    @OriginalMember(owner = "client!oa", name = "JA", descriptor = "(IIIIII)I")
    public final native int method442(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "(ILaa;II)V")
    public final native void method447(int arg0, class486 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "KA", descriptor = "(IIII)V")
    public final native void method469(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "wa", descriptor = "(IIIIII)V")
    private final native void method3902(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "da", descriptor = "(III[I)V")
    public final native void method423(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!oa", name = "Z", descriptor = "(IIIIIILaa;II)V")
    private final native void method3903(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class486 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!oa", name = "H", descriptor = "(III[I)V")
    public final native void method446(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!oa", name = "ZA", descriptor = "(IFFFFF)V")
    public final native void method390(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!oa", name = "U", descriptor = "(IIIII)V")
    public final native void method433(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "DA", descriptor = "(IIII)V")
    public final native void method391(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "XA", descriptor = "()I")
    public final native int method434();

    @OriginalMember(owner = "client!oa", name = "P", descriptor = "(IIIII)V")
    public final native void method430(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "K", descriptor = "([I)V")
    public final native void method398(int[] arg0);

    @OriginalMember(owner = "client!oa", name = "xa", descriptor = "(F)V")
    public final native void method406(float arg0);

    @OriginalMember(owner = "client!oa", name = "T", descriptor = "(IIII)V")
    public final native void method394(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "GA", descriptor = "(I)V")
    public final native void method429(int arg0);

    @OriginalMember(owner = "client!oa", name = "Y", descriptor = "()[I")
    public final native int[] method395();

    @OriginalMember(owner = "client!oa", name = "Q", descriptor = "(IIIIII[BII)V")
    public final native void method488(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!oa", name = "X", descriptor = "(I)V")
    public final native void method457(int arg0);

    @OriginalMember(owner = "client!oa", name = "la", descriptor = "()V")
    public final native void method424();

    @OriginalMember(owner = "client!oa", name = "MA", descriptor = "(Ld;II)V")
    private final native void method3905(class149 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oa", name = "HA", descriptor = "(IIII[I)V")
    public final native void method480(int arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "()I")
    public final native int method382();

    @OriginalMember(owner = "client!oa", name = "ya", descriptor = "()V")
    public final native void method440();

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "(Lp;)V")
    private final native void method3907(class216 arg0);

    @OriginalMember(owner = "client!oa", name = "aa", descriptor = "(IIIIII)V")
    public final native void method431(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "ra", descriptor = "(IIII)V")
    public final native void method422(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIID)V")
    public final native void method493(int arg0, int arg1, int arg2, int arg3, double arg4);

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V")
    private final native void method3908(int arg0);

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "(II)V")
    public final native void method455(int arg0, int arg1);

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "()I")
    public final native int method387();

    @OriginalMember(owner = "client!oa", name = "N", descriptor = "(I[I[F)V")
    private final native void method3909(int arg0, int[] arg1, float[] arg2);

    @OriginalMember(owner = "client!oa", name = "ma", descriptor = "(J)V")
    private final native void method3910(long arg0);

    @OriginalMember(owner = "client!oa", name = "va", descriptor = "(Lza;)V")
    private final native void method3911(class413 arg0);

    @OriginalMember(owner = "client!oa", name = "AA", descriptor = "(SSIBBIZBBBBZZZZZBZZI)V")
    private final native void method3912(short arg0, short arg1, int arg2, byte arg3, byte arg4, int arg5, boolean arg6, byte arg7, byte arg8, byte arg9, byte arg10, boolean arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, byte arg16, boolean arg17, boolean arg18, int arg19);

    @OriginalMember(owner = "client!oa", name = "za", descriptor = "(IIIII)V")
    public final native void method461(int arg0, int arg1, int arg2, int arg3, int arg4);
}
