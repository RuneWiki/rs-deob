import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class454 extends class491 implements class242 {

    @OriginalMember(owner = "client!w", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!w", name = "u", descriptor = "Z")
    private boolean field6769 = false;

    @OriginalMember(owner = "client!w", name = "v", descriptor = "Lpu;")
    private class411 field6770 = new class411();

    @OriginalMember(owner = "client!w", name = "I", descriptor = "I")
    private int field6783 = 4096;

    @OriginalMember(owner = "client!w", name = "L", descriptor = "I")
    private int field6786 = 4096;

    @OriginalMember(owner = "client!w", name = "J", descriptor = "Lbu;")
    private class407 field6784 = new class407(4);

    @OriginalMember(owner = "client!w", name = "O", descriptor = "Z")
    private boolean field6789 = false;

    @OriginalMember(owner = "client!w", name = "K", descriptor = "Lc;")
    private class202 field6785;

    @OriginalMember(owner = "client!w", name = "s", descriptor = "[I")
    private static int[] field6767 = new int[Math.max(Math.max(80, 20), 24573)];

    @OriginalMember(owner = "client!w", name = "w", descriptor = "[F")
    private static float[] field6771 = new float[20];

    @OriginalMember(owner = "client!w", name = "x", descriptor = "[I")
    public static int[] field6772 = new int[6];

    @OriginalMember(owner = "client!w", name = "B", descriptor = "[I")
    private static int[] field6776 = field6767;

    @OriginalMember(owner = "client!w", name = "z", descriptor = "[I")
    private static int[] field6774 = new int[8191];

    @OriginalMember(owner = "client!w", name = "D", descriptor = "[I")
    public static int[] field6778 = field6767;

    @OriginalMember(owner = "client!w", name = "C", descriptor = "[B")
    private static byte[] field6777 = new byte[8191];

    @OriginalMember(owner = "client!w", name = "y", descriptor = "[S")
    private static short[] field6773 = new short[8191];

    @OriginalMember(owner = "client!w", name = "A", descriptor = "[I")
    private static int[] field6775 = new int[8191];

    @OriginalMember(owner = "client!w", name = "E", descriptor = "Ljava/lang/Boolean;")
    private static Boolean field6779 = Boolean.FALSE;

    @OriginalMember(owner = "client!w", name = "G", descriptor = "[I")
    private static int[] field6781 = field6767;

    @OriginalMember(owner = "client!w", name = "F", descriptor = "[F")
    private static float[] field6780 = field6771;

    @OriginalMember(owner = "client!w", name = "N", descriptor = "I")
    private int field6788;

    @OriginalMember(owner = "client!w", name = "H", descriptor = "Lb;")
    private class132 field6782;

    @OriginalMember(owner = "client!w", name = "t", descriptor = "Lg;")
    private class96 field6768;

    @OriginalMember(owner = "client!w", name = "M", descriptor = "[Lk;")
    private class28[] field6787;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "()Z", line = 4)
    public final boolean method912() {
        return true;
    }

    @OriginalMember(owner = "client!w", name = "finalize", descriptor = "()V", line = 7)
    protected final synchronized void finalize() {
        this.method2867((byte) -97);
        if (this.nativeid != 0L) {
            class248.method1686(false, this);
        }
    }

    @OriginalMember(owner = "client!w", name = "f", descriptor = "()Z", line = 15)
    public final boolean method833() {
        return true;
    }

    @OriginalMember(owner = "client!w", name = "v", descriptor = "()V", line = 18)
    public final void method842() {
    }

    @OriginalMember(owner = "client!w", name = "s", descriptor = "()V", line = 21)
    public final void method913() {
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lug;)V", line = 23)
    public final void method894(class322 arg0) {
    }

    @OriginalMember(owner = "client!w", name = "t", descriptor = "()Z", line = 27)
    public final boolean method861() {
        return true;
    }

    @OriginalMember(owner = "client!w", name = "w", descriptor = "()Z", line = 31)
    public final boolean method906() {
        return false;
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(Z)V", line = 33)
    public final void method900(boolean arg0) {
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(IIIIII)Lug;", line = 39)
    public final class322 method851(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!w", name = "qa", descriptor = "()Ljava/lang/Object;", line = 42)
    private final Object method2714() {
        return new class443(this);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(II[[I[[IIII)Lya;", line = 45)
    public final class220 method814(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class464(this, this.field6768, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "([IIIII)Lo;", line = 49)
    public final class138 method834(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class109(this, this.field6768, arg0, arg1, arg2, arg3, arg4) : new class89(this, this.field6768, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class109(this, this.field6768, arg0, arg1, arg2, arg3, arg4) : new class89(this, this.field6768, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "([Le;Ld;Lc;[Ltq;I)V", line = 84)
    public final void method838(class530[] arg0, class66 arg1, class202 arg2, class273[] arg3, int arg4) {
        this.method2724(arg1, true);
        if (arg3 == null) {
            this.method2725().method214(this, arg0, arg2, (int[]) null, arg4, field6776, field6774, field6775, field6773, field6777, arg1.field976.method2460((byte) 15), field6778);
        } else {
            class273 var6 = arg3[0];
            field6772[5] = 0;
            this.method2725().method214(this, arg0, arg2, field6772, arg4, field6776, field6774, field6775, field6773, field6777, arg1.field976.method2460((byte) -91), field6778);
            var6.field4517 = field6772[0];
            var6.field4516 = field6772[1];
            var6.field4521 = field6772[2];
            var6.field4518 = field6772[3];
            var6.field4519 = field6772[4];
            var6.field4520 = field6772[5] != 0;
        }
        int var7 = 0;
        for (int var8 = 0; var8 < arg0.length; ++var8) {
            if (arg0[var8] != null) {
                class390 var9 = (class390) arg0[var8];
                var9.method2439(var7, arg2);
                if (var9.field5978 != null) {
                    var7 += var9.field5978.length * 9;
                }
                if (var9.field5977 != null) {
                    var7 += var9.field5977.length * 3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lwh;Z)Lo;", line = 130)
    public final class138 method837(class523 arg0, boolean arg1) {
        int[] var3 = arg0.field7712;
        byte[] var4 = arg0.field7705;
        int var5 = arg0.field7707;
        int var6 = arg0.field7709;
        class138 var7;
        if (arg1 && arg0.field7708 == null) {
            var7 = new class114(this, this.field6768, var3, var4, 0, arg0.field7707, arg0.field7707, arg0.field7709);
        } else {
            int var8 = var5 * var6;
            int[] var9 = new int[var8];
            byte[] var10 = arg0.field7708;
            if (var10 != null) {
                for (int var11 = 0; var11 < var6; ++var11) {
                    int var12 = var5 * var11;
                    for (int var13 = 0; var13 < var5; ++var13) {
                        var9[var12 + var13] = var3[var4[var12 + var13] & 255] | var10[var12 + var13] << 24;
                    }
                }
                var7 = new class109(this, this.field6768, var9, 0, var5, var5, var6);
            } else {
                boolean var14 = false;
                for (int var15 = 0; var15 < var8; ++var15) {
                    int var16 = arg0.field7712[var4[var15] & 255];
                    if (var16 >>> 24 != 255) {
                        var14 = true;
                    }
                    var9[var15] = var16;
                }
                if (var14) {
                    var7 = new class109(this, this.field6768, var9, 0, arg0.field7707, arg0.field7707, arg0.field7709);
                } else {
                    var7 = new class89(this, this.field6768, var9, 0, arg0.field7707, arg0.field7707, arg0.field7709);
                }
            }
        }
        var7.method209(arg0.field7710, arg0.field7711, arg0.field7704, arg0.field7706);
        return var7;
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(IIII)V", line = 203)
    public final void method813(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!w", name = "z", descriptor = "()Z", line = 210)
    public final boolean method831() {
        return false;
    }

    @OriginalMember(owner = "client!w", name = "h", descriptor = "()Z", line = 219)
    public final boolean method807() {
        return false;
    }

    @OriginalMember(owner = "client!w", name = "A", descriptor = "()V", line = 222)
    public final void method844() {
        if (this.field6782 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field6782.method1001();
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIZ)Lo;", line = 232)
    public final class138 method843(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return arg4 ? new class109(this, this.field6768, arg0, arg1, arg2, arg3) : new class89(this, this.field6768, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!w", name = "d", descriptor = "(IIIIII)V", line = 239)
    public final void method915(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method854(arg0, arg1, arg2, arg4, arg5);
        this.method854(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method876(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
        this.method876(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIF)Lja;", line = 245)
    public final class450 method895(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return new class402(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!w", name = "e", descriptor = "(I)V", line = 248)
    public final void method897(int arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V", line = 251)
    public final void method852(int arg0) {
        this.field6788 = arg0;
        this.field6787 = new class28[this.field6788];
        for (int var2 = 0; var2 < this.field6788; ++var2) {
            this.field6787[var2] = new class28(this, this.field6786, this.field6783);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(FFF)V", line = 263)
    public final void method873(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 267)
    public final void method916(Canvas arg0) {
        class132 var2 = (class132) this.field6784.method2516((long) arg0.hashCode(), -1);
        Dimension var3 = arg0.getSize();
        var2.method1002(arg0, var3.width, var3.height);
        if (arg0 != null && this.field6782.field2249 == arg0) {
            this.method863(arg0);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(II)I", line = 277)
    public final int method902(int arg0, int arg1) {
        int var3 = arg0 & 1048575;
        int var4 = arg1 & 1048575;
        return var3 & var4 ^ var4;
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(I)V", line = 283)
    public final void method889(int arg0) {
        this.field6787[arg0].method212();
    }

    @OriginalMember(owner = "client!w", name = "d", descriptor = "(I)Ln;", line = 288)
    public final class511 method874(int arg0) {
        class96 var2 = new class96(this, arg0);
        this.field6770.method2541(0, var2);
        return var2;
    }

    @OriginalMember(owner = "client!w", name = "g", descriptor = "(I)V", line = 293)
    public final void method855(int arg0) {
        this.field6787[arg0].method215();
    }

    @OriginalMember(owner = "client!w", name = "m", descriptor = "()Lc;", line = 299)
    public final class202 method835() {
        return new class501();
    }

    @OriginalMember(owner = "client!w", name = "d", descriptor = "()Z", line = 303)
    public final boolean method827() {
        return true;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 308)
    public final void method863(Canvas arg0) {
        if (arg0 != null) {
            class132 var2 = (class132) this.field6784.method2516((long) arg0.hashCode(), -1);
            this.field6782 = var2;
            this.method2721(var2);
        } else {
            this.field6782 = null;
            this.method2721((class132) null);
        }
    }

    @OriginalMember(owner = "client!w", name = "q", descriptor = "()Z", line = 323)
    public final boolean method822() {
        return true;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lug;Lug;FLug;)Lug;", line = 326)
    public final class322 method812(class322 arg0, class322 arg1, float arg2, class322 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!w", name = "R", descriptor = "()V", line = 330)
    private final void method2719() {
        System.gc();
        System.runFinalization();
        class248.method1684((byte) -21);
    }

    @OriginalMember(owner = "client!w", name = "f", descriptor = "(I)V", line = 339)
    public final void method864(int arg0) {
        class248.method1684((byte) -21);
        this.method2720(arg0);
        for (class96 var2 = (class96) this.field6770.method2538(-3); var2 != null; var2 = (class96) this.field6770.method2535((byte) -75)) {
            var2.method669();
        }
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 354)
    public final void method846(Canvas arg0) {
        if (this.field6782.field2249 == arg0) {
            this.method863((Canvas) null);
        }
        class132 var2 = (class132) this.field6784.method2516((long) arg0.hashCode(), -1);
        if (var2 != null) {
            var2.method1821((byte) -88);
            var2.method1005();
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Le;Ld;Lc;Ltq;I)V", line = 367)
    public final void method853(class530 arg0, class66 arg1, class202 arg2, class273 arg3, int arg4) {
        this.method2724(arg1, true);
        if (arg3 == null) {
            this.method2725().method229(this, arg0, arg2, (int[]) null, arg4, field6776, field6774, field6775, field6773, field6777, arg1.field976.method2460((byte) -111), field6778);
        } else {
            field6772[5] = 0;
            this.method2725().method229(this, arg0, arg2, field6772, arg4, field6776, field6774, field6775, field6773, field6777, arg1.field976.method2460((byte) 75), field6778);
            arg3.field4517 = field6772[0];
            arg3.field4516 = field6772[1];
            arg3.field4521 = field6772[2];
            arg3.field4518 = field6772[3];
            arg3.field4519 = field6772[4];
            arg3.field4520 = field6772[5] != 0;
        }
        class390 var6 = (class390) arg0;
        var6.method2439(0, arg2);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "([Le;Lc;[Ltq;I)V", line = 388)
    public final void method880(class530[] arg0, class202 arg1, class273[] arg2, int arg3) {
        if (arg2 == null) {
            this.method2725().method216(this, arg0, arg1, (int[]) null, -1, arg3);
        } else {
            class273 var5 = arg2[0];
            field6772[5] = 0;
            this.method2725().method216(this, arg0, arg1, field6772, -1, arg3);
            var5.field4517 = field6772[0];
            var5.field4516 = field6772[1];
            var5.field4521 = field6772[2];
            var5.field4518 = field6772[3];
            var5.field4519 = field6772[4];
            var5.field4520 = field6772[5] != 0;
        }
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(IIIIII)V", line = 407)
    public final void method839(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2715(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!w", name = "B", descriptor = "()Z", line = 412)
    public final boolean method808() {
        return true;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lko;IIII)Le;", line = 420)
    public final class530 method875(class227 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class390(this, this.field6768, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Ld;)V", line = 425)
    public final void method885(class66 arg0) {
        this.method2724(arg0, false);
        this.method2725().method228(this, field6776, field6774, field6775, field6773, arg0.field976.method2460((byte) 57));
    }

    @OriginalMember(owner = "client!w", name = "y", descriptor = "()Z", line = 430)
    public final boolean method881() {
        return true;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIIIIII)V", line = 433)
    public final void method824(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(II)I", line = 439)
    public final int method878(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!w", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 443)
    public final void method890(Canvas arg0) {
        class132 var2 = (class132) this.field6784.method2516((long) arg0.hashCode(), -1);
        if (var2 == null) {
            try {
                Class var3 = Class.forName("java.awt.Canvas");
                Method var4 = var3.getMethod("setIgnoreRepaint", Boolean.TYPE);
                var4.invoke(arg0, Boolean.TRUE);
            } catch (Exception var6) {
            }
            class132 var5 = new class132(this, arg0);
            this.field6784.method2517(var5, (long) arg0.hashCode(), (byte) 114);
        }
    }

    @OriginalMember(owner = "client!w", name = "l", descriptor = "()Z", line = 463)
    public final boolean method815() {
        return false;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIILta;II)V", line = 467)
    public final void method899(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class448 arg6, int arg7, int arg8) {
        this.method2722(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!w", name = "k", descriptor = "()V", line = 469)
    public final void method888() {
    }

    @OriginalMember(owner = "client!w", name = "g", descriptor = "()V", line = 471)
    public final void method828() {
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Ld;Z)V", line = 477)
    private final void method2724(class66 arg0, boolean arg1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        for (class164 var8 = (class164) arg0.field976.method2468(0); var8 != null; var8 = (class164) arg0.field976.method2467((byte) 123)) {
            field6776[var3++] = var8.field2599;
            field6776[var3++] = var8.field2602;
            field6776[var3++] = var8.field2595;
            field6774[var4++] = var8.field2600;
            field6773[var6++] = (short) var8.field2601;
            field6775[var5++] = var8.field2594;
            if (arg1) {
                field6777[var7++] = var8.field2596;
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "()Z", line = 509)
    public final boolean method896() {
        return false;
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(ILjava/awt/Canvas;Ll;Lnv;)V", line = 670)
    public class454(int arg0, Canvas arg1, class196 arg2, class493 arg3) {
        super(arg0, arg2);
        try {
            if (!field6779) {
                if (arg3 != null) {
                    arg3.method2899(-19779, this.getClass());
                    field6779 = Boolean.TRUE;
                } else {
                    System.loadLibrary("jawt");
                    System.loadLibrary("sw3d");
                    field6779 = Boolean.TRUE;
                }
            }
            if (!field6779) {
                throw new RuntimeException("");
            } else {
                this.method2718(super.field7179, 0, 0);
                class213.method1402(true, 640, false);
                this.field6789 = true;
                this.field6785 = new class501();
                this.method911(new class501());
                this.method852(1);
                this.method855(0);
                if (arg1 != null) {
                    this.method890(arg1);
                    this.method863(arg1);
                }
            }
        } catch (Throwable var5) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!w", name = "C", descriptor = "()Lk;", line = 522)
    public final class28 method2725() {
        for (int var1 = 0; var1 < this.field6788; ++var1) {
            if (this.field6787[var1].field459 == Thread.currentThread()) {
                return this.field6787[var1];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Z)V", line = 534)
    public final void method886(boolean arg0) {
    }

    @OriginalMember(owner = "client!w", name = "i", descriptor = "()I", line = 538)
    public final int method883() {
        return 4;
    }

    @OriginalMember(owner = "client!w", name = "j", descriptor = "()Z", line = 541)
    public final boolean method841() {
        return true;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 544)
    public final void method901(Rectangle[] arg0, int arg1) {
        if (this.field6782 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field6782.method1008(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!w", name = "e", descriptor = "()Lc;", line = 554)
    public final class202 method820() {
        return this.field6785;
    }

    @OriginalMember(owner = "client!w", name = "o", descriptor = "()Z", line = 557)
    public final boolean method903() {
        return false;
    }

    @OriginalMember(owner = "client!w", name = "m", descriptor = "(S)Z", line = 561)
    private final boolean method2727(short arg0) {
        class196 var2 = super.field7179;
        synchronized (super.field7179) {
            if (!super.field7179.method194((byte) 89, arg0)) {
                return false;
            } else {
                class320 var4 = super.field7179.method195(arg0, (byte) -105);
                if (var4 == null) {
                    return false;
                } else {
                    int[] var6;
                    if (var4.field5023 && var4.field5028) {
                        var6 = super.field7179.method197(arg0, 0.7F, 128, (byte) 103, 128, true);
                    } else {
                        var6 = super.field7179.method187(true, false, 128, arg0, 128, 0.7F);
                    }
                    this.method2717(arg0, var4.field5029, var4.field5035, var4.field5028, var4.field5023, var4.field5027, var4.field5034, var4.field5021, var4.field5026, var4.field5033, var4.field5036, var4.field5019, var4.field5016, var6);
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(Z)V", line = 584)
    public final void method810(boolean arg0) {
    }

    @OriginalMember(owner = "client!w", name = "X", descriptor = "(S)Z", line = 587)
    private final boolean method2728(short arg0) {
        synchronized (this) {
            class320 var3 = super.field7179.method195(arg0, (byte) -105);
            if (var3 == null) {
                return false;
            } else {
                this.method2723(arg0, var3.field5029, var3.field5035, var3.field5028, var3.field5023, var3.field5027, var3.field5034, var3.field5021, var3.field5026, var3.field5033, var3.field5036, var3.field5019, var3.field5016);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "()V", line = 600)
    public final void method884() {
        if (!this.field6769) {
            this.field6787 = null;
            this.field6782 = null;
            this.field6768 = null;
            this.field6785 = null;
            this.field6784.method2525(0);
            for (class96 var1 = (class96) this.field6770.method2538(-3); var1 != null; var1 = (class96) this.field6770.method2535((byte) -95)) {
                var1.method670();
            }
            this.field6770.method2543(7655);
            this.method2713();
            if (this.field6789) {
                class276.method1823(-1, true, false);
                this.field6789 = false;
            }
            this.method2719();
            class248.method1683(0);
            this.field6769 = true;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I[Lja;)V", line = 637)
    public final void method870(int arg0, class450[] arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < arg0; ++var4) {
            field6781[var3++] = arg1[var4].method2700(false);
            field6781[var3++] = arg1[var4].method2697(122);
            field6781[var3++] = arg1[var4].method2696((byte) 122);
            field6781[var3++] = arg1[var4].method2694(false);
            field6780[var4] = arg1[var4].method2698(1865);
            field6781[var3++] = arg1[var4].method2695((byte) -40);
        }
        this.method2716(arg0, field6781, field6780);
    }

    @OriginalMember(owner = "client!w", name = "x", descriptor = "()V", line = 663)
    public final void method836() {
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(II[I[I)Lta;", line = 721)
    public final class448 method887(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class399(this, this.field6768, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIII)V", line = 729)
    public final void method856(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2725().method223(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Ln;)V", line = 738)
    public final void method849(class511 arg0) {
        this.field6768 = (class96) arg0;
        this.method2726(arg0);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lqm;[Lwh;Z)Lla;", line = 749)
    public final class296 method892(class331 arg0, class523[] arg1, boolean arg2) {
        return arg2 ? new class274(this, this.field6768, arg0, arg1, (class138[]) null) : new class47(this, this.field6768, arg0, arg1, (class138[]) null);
    }

    @OriginalMember(owner = "client!w", name = "u", descriptor = "()Z", line = 766)
    public final boolean method817() {
        return false;
    }

    @OriginalMember(owner = "client!w", name = "sa", descriptor = "(IIII)[I")
    public final native int[] method811(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!w", name = "SA", descriptor = "(Lc;)V")
    public final native void method911(class202 arg0);

    @OriginalMember(owner = "client!w", name = "s", descriptor = "(IIII)V")
    public final native void method871(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!w", name = "ua", descriptor = "()V")
    private final native void method2713();

    @OriginalMember(owner = "client!w", name = "VA", descriptor = "(IIIIII)Z")
    public final native boolean method832(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!w", name = "aa", descriptor = "()F")
    public final native float method898();

    @OriginalMember(owner = "client!w", name = "JA", descriptor = "(F)V")
    public final native void method910(float arg0);

    @OriginalMember(owner = "client!w", name = "A", descriptor = "(IIIIII)V")
    private final native void method2715(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!w", name = "WA", descriptor = "(I[I[F)V")
    private final native void method2716(int arg0, int[] arg1, float[] arg2);

    @OriginalMember(owner = "client!w", name = "va", descriptor = "()V")
    public final native void method848();

    @OriginalMember(owner = "client!w", name = "J", descriptor = "(SBBZZZBBBIIZZ[I)V")
    private final native void method2717(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12, int[] arg13);

    @OriginalMember(owner = "client!w", name = "Y", descriptor = "()I")
    public final native int method905();

    @OriginalMember(owner = "client!w", name = "ma", descriptor = "(IIIII)V")
    public final native void method854(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!w", name = "ra", descriptor = "(ILta;II)V")
    public final native void method825(int arg0, class448 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!w", name = "n", descriptor = "()V")
    public final native void method858();

    @OriginalMember(owner = "client!w", name = "W", descriptor = "(Ll;II)V")
    private final native void method2718(class196 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!w", name = "v", descriptor = "(III[I)V")
    public final native void method819(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!w", name = "B", descriptor = "(IFFFFF)V")
    public final native void method859(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!w", name = "HA", descriptor = "(IIII)V")
    public final native void method868(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!w", name = "u", descriptor = "(I)V")
    private final native void method2720(int arg0);

    @OriginalMember(owner = "client!w", name = "GA", descriptor = "(IIII)V")
    public final native void method857(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!w", name = "e", descriptor = "(Lb;)V")
    private final native void method2721(class132 arg0);

    @OriginalMember(owner = "client!w", name = "t", descriptor = "(I)V")
    public final native void method891(int arg0);

    @OriginalMember(owner = "client!w", name = "NA", descriptor = "(IIIIIILta;II)V")
    private final native void method2722(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class448 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!w", name = "Q", descriptor = "(III)V")
    public final native void method847(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!w", name = "ZA", descriptor = "(IIIII)V")
    public final native void method840(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!w", name = "l", descriptor = "(SBBZZZBBBIIZZ)V")
    private final native void method2723(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12);

    @OriginalMember(owner = "client!w", name = "da", descriptor = "(FF)V")
    public final native void method877(float arg0, float arg1);

    @OriginalMember(owner = "client!w", name = "K", descriptor = "(IIIIII[BII)V")
    public final native void method872(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!w", name = "d", descriptor = "(II)V")
    public final native void method862(int arg0, int arg1);

    @OriginalMember(owner = "client!w", name = "ba", descriptor = "(IIII)V")
    public final native void method829(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!w", name = "p", descriptor = "()V")
    public final native void method224();

    @OriginalMember(owner = "client!w", name = "MA", descriptor = "([I)V")
    public final native void method908(int[] arg0);

    @OriginalMember(owner = "client!w", name = "T", descriptor = "()F")
    public final native float method850();

    @OriginalMember(owner = "client!w", name = "QA", descriptor = "(Ln;)V")
    private final native void method2726(class511 arg0);

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIII)V")
    public final native void method826(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!w", name = "r", descriptor = "()I")
    public final native int method816();

    @OriginalMember(owner = "client!w", name = "IA", descriptor = "(IIIII)V")
    public final native void method876(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!w", name = "OA", descriptor = "()I")
    public final native int method879();

    @OriginalMember(owner = "client!w", name = "P", descriptor = "(IIIIII)V")
    public final native void method914(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!w", name = "AA", descriptor = "()I")
    public final native int method845();

    @OriginalMember(owner = "client!w", name = "ya", descriptor = "(I)V")
    public final native void method866(int arg0);

    @OriginalMember(owner = "client!w", name = "pa", descriptor = "()I")
    public final native int method823();
}
