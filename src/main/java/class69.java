import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class69 extends class295 implements class194 {

    @OriginalMember(owner = "client!w", name = "C", descriptor = "Z")
    private boolean field998 = false;

    @OriginalMember(owner = "client!w", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!w", name = "v", descriptor = "Lmg;")
    private class530 field991 = new class530();

    @OriginalMember(owner = "client!w", name = "L", descriptor = "I")
    private int field1007 = 4096;

    @OriginalMember(owner = "client!w", name = "J", descriptor = "I")
    private int field1005 = 4096;

    @OriginalMember(owner = "client!w", name = "I", descriptor = "Lew;")
    private class270 field1004 = new class270(4);

    @OriginalMember(owner = "client!w", name = "N", descriptor = "Z")
    private boolean field1009 = false;

    @OriginalMember(owner = "client!w", name = "H", descriptor = "Lc;")
    private class512 field1003;

    @OriginalMember(owner = "client!w", name = "s", descriptor = "[I")
    private static int[] field988 = new int[Math.max(Math.max(80, 20), 24573)];

    @OriginalMember(owner = "client!w", name = "w", descriptor = "[I")
    private static int[] field992 = field988;

    @OriginalMember(owner = "client!w", name = "u", descriptor = "[I")
    public static int[] field990 = field988;

    @OriginalMember(owner = "client!w", name = "x", descriptor = "[S")
    private static short[] field993 = new short[8191];

    @OriginalMember(owner = "client!w", name = "A", descriptor = "[B")
    private static byte[] field996 = new byte[8191];

    @OriginalMember(owner = "client!w", name = "z", descriptor = "[I")
    public static int[] field995 = new int[6];

    @OriginalMember(owner = "client!w", name = "E", descriptor = "[F")
    private static float[] field1000 = new float[20];

    @OriginalMember(owner = "client!w", name = "F", descriptor = "Ljava/lang/Boolean;")
    private static Boolean field1001 = Boolean.FALSE;

    @OriginalMember(owner = "client!w", name = "y", descriptor = "[F")
    private static float[] field994 = field1000;

    @OriginalMember(owner = "client!w", name = "B", descriptor = "[I")
    private static int[] field997 = new int[8191];

    @OriginalMember(owner = "client!w", name = "G", descriptor = "[I")
    private static int[] field1002 = new int[8191];

    @OriginalMember(owner = "client!w", name = "D", descriptor = "[I")
    private static int[] field999 = field988;

    @OriginalMember(owner = "client!w", name = "O", descriptor = "I")
    private int field1010;

    @OriginalMember(owner = "client!w", name = "t", descriptor = "Lg;")
    private class424 field989;

    @OriginalMember(owner = "client!w", name = "K", descriptor = "Lb;")
    private class474 field1006;

    @OriginalMember(owner = "client!w", name = "M", descriptor = "[Lk;")
    private class67[] field1008;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 5)
    public final void method454(Canvas arg0) {
        class474 var2 = (class474) this.field1004.method1592((byte) -25, (long) arg0.hashCode());
        Dimension var3 = arg0.getSize();
        var2.method2787(arg0, var3.width, var3.height);
        if (arg0 != null && this.field1006.field6867 == arg0) {
            this.method486(arg0);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lvk;Z)V", line = 16)
    private final void method456(class334 arg0, boolean arg1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        for (class526 var8 = (class526) arg0.field4875.method894(61); var8 != null; var8 = (class526) arg0.field4875.method890((byte) -89)) {
            field992[var3++] = var8.field7678;
            field992[var3++] = var8.field7679;
            field992[var3++] = var8.field7682;
            field1002[var4++] = var8.field7680;
            field993[var6++] = (short) var8.field7683;
            field997[var5++] = var8.field7676;
            if (arg1) {
                field996[var7++] = var8.field7684;
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "([Le;Lc;[Lrr;I)V", line = 46)
    public final void method457(class285[] arg0, class512 arg1, class305[] arg2, int arg3) {
        if (arg2 == null) {
            this.method487().method440(this, arg0, arg1, (int[]) null, -1, arg3);
        } else {
            class305 var5 = arg2[0];
            field995[5] = 0;
            this.method487().method440(this, arg0, arg1, field995, -1, arg3);
            var5.field4131 = field995[0];
            var5.field4136 = field995[1];
            var5.field4133 = field995[2];
            var5.field4134 = field995[3];
            var5.field4132 = field995[4];
            var5.field4135 = field995[5] != 0;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(II)I", line = 66)
    public final int method459(int arg0, int arg1) {
        int var3 = arg0 & 1048575;
        int var4 = arg1 & 1048575;
        return var3 & var4 ^ var4;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 76)
    public final void method463(Canvas arg0) {
        if (this.field1006.field6867 == arg0) {
            this.method486((Canvas) null);
        }
        class474 var2 = (class474) this.field1004.method1592((byte) -25, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method2791((byte) 112);
            var2.method2786();
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lks;Lks;FLks;)Lks;", line = 90)
    public final class23 method465(class23 arg0, class23 arg1, float arg2, class23 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!w", name = "k", descriptor = "()Z", line = 93)
    public final boolean method466() {
        return false;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIIIIII)V", line = 99)
    public final void method469(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(IIII)V", line = 106)
    public final void method474(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!w", name = "u", descriptor = "()Z", line = 109)
    public final boolean method475() {
        return true;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 112)
    public final void method476(Rectangle[] arg0, int arg1) {
        if (this.field1006 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field1006.method2785(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!w", name = "finalize", descriptor = "()V", line = 123)
    protected final synchronized void finalize() {
        this.method1713(-1);
        if (this.nativeid != 0L) {
            class260.method1547(-1, this);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lks;)V", line = 135)
    public final void method480(class23 arg0) {
    }

    @OriginalMember(owner = "client!w", name = "m", descriptor = "(S)Z", line = 141)
    private final boolean method483(short arg0) {
        class127 var2 = super.field3988;
        synchronized (super.field3988) {
            if (!super.field3988.method918(arg0, 108)) {
                return false;
            } else {
                class249 var4 = super.field3988.method914(false, arg0);
                if (var4 == null) {
                    return false;
                } else {
                    int[] var6;
                    if (var4.field3391 && var4.field3381) {
                        var6 = super.field3988.method915(128, arg0, 0.7F, (byte) 43, true, 128);
                    } else {
                        var6 = super.field3988.method917(128, true, 0.7F, arg0, 128, true);
                    }
                    this.method538(arg0, var4.field3393, var4.field3387, var4.field3381, var4.field3391, var4.field3384, var4.field3395, var4.field3376, var4.field3382, var4.field3377, var4.field3378, var4.field3375, var4.field3392, var6);
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "d", descriptor = "(I)V", line = 166)
    public final void method484(int arg0) {
        class260.method1545((byte) 51);
        this.method544(arg0);
        for (class424 var2 = (class424) this.field991.method3137(0); var2 != null; var2 = (class424) this.field991.method3132(0)) {
            var2.method2531();
        }
    }

    @OriginalMember(owner = "client!w", name = "e", descriptor = "()V", line = 178)
    public final void method485() {
    }

    @OriginalMember(owner = "client!w", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 181)
    public final void method486(Canvas arg0) {
        if (arg0 != null) {
            class474 var2 = (class474) this.field1004.method1592((byte) -25, (long) arg0.hashCode());
            this.field1006 = var2;
            this.method481(var2);
        } else {
            this.field1006 = null;
            this.method481((class474) null);
        }
    }

    @OriginalMember(owner = "client!w", name = "C", descriptor = "()Lk;", line = 199)
    public final class67 method487() {
        for (int var1 = 0; var1 < this.field1010; ++var1) {
            if (this.field1008[var1].field961 == Thread.currentThread()) {
                return this.field1008[var1];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!w", name = "B", descriptor = "()Lc;", line = 217)
    public final class512 method489() {
        return new class131();
    }

    @OriginalMember(owner = "client!w", name = "d", descriptor = "()V", line = 219)
    public final void method490() {
    }

    @OriginalMember(owner = "client!w", name = "j", descriptor = "()V", line = 221)
    public final void method491() {
    }

    @OriginalMember(owner = "client!w", name = "s", descriptor = "()Z", line = 224)
    public final boolean method492() {
        return true;
    }

    @OriginalMember(owner = "client!w", name = "h", descriptor = "(I)V", line = 227)
    public final void method493(int arg0) {
        this.field1010 = arg0;
        this.field1008 = new class67[this.field1010];
        for (int var2 = 0; var2 < this.field1010; ++var2) {
            this.field1008[var2] = new class67(this, this.field1007, this.field1005);
        }
    }

    @OriginalMember(owner = "client!w", name = "f", descriptor = "(I)V", line = 241)
    public final void method494(int arg0) {
        this.field1008[arg0].method447();
    }

    @OriginalMember(owner = "client!w", name = "X", descriptor = "(S)Z", line = 247)
    private final boolean method496(short arg0) {
        synchronized (this) {
            class249 var3 = super.field3988.method914(false, arg0);
            if (var3 == null) {
                return false;
            } else {
                this.method458(arg0, var3.field3393, var3.field3387, var3.field3381, var3.field3391, var3.field3384, var3.field3395, var3.field3376, var3.field3382, var3.field3377, var3.field3378, var3.field3375, var3.field3392);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Ln;)V", line = 258)
    public final void method497(class391 arg0) {
        this.field989 = (class424) arg0;
        this.method453(arg0);
    }

    @OriginalMember(owner = "client!w", name = "t", descriptor = "()Z", line = 262)
    public final boolean method498() {
        return true;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "([Le;Lvk;Lc;[Lrr;I)V", line = 265)
    public final void method499(class285[] arg0, class334 arg1, class512 arg2, class305[] arg3, int arg4) {
        this.method456(arg1, true);
        if (arg3 == null) {
            this.method487().method448(this, arg0, arg2, (int[]) null, arg4, field992, field1002, field997, field993, field996, arg1.field4875.method892((byte) -110), field990);
        } else {
            class305 var6 = arg3[0];
            field995[5] = 0;
            this.method487().method448(this, arg0, arg2, field995, arg4, field992, field1002, field997, field993, field996, arg1.field4875.method892((byte) -105), field990);
            var6.field4131 = field995[0];
            var6.field4136 = field995[1];
            var6.field4133 = field995[2];
            var6.field4134 = field995[3];
            var6.field4132 = field995[4];
            var6.field4135 = field995[5] != 0;
        }
        int var7 = 0;
        for (int var8 = 0; var8 < arg0.length; ++var8) {
            if (arg0[var8] != null) {
                class469 var9 = (class469) arg0[var8];
                var9.method2727(var7, arg2);
                if (var9.field6771 != null) {
                    var7 += var9.field6771.length * 9;
                }
                if (var9.field6774 != null) {
                    var7 += var9.field6774.length * 3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(ILjava/awt/Canvas;Ll;Lor;)V", line = 307)
    public class69(int arg0, Canvas arg1, class127 arg2, class173 arg3) {
        super(arg0, arg2);
        try {
            if (!field1001) {
                if (arg3 != null) {
                    arg3.method1176(-105, this.getClass());
                    field1001 = Boolean.TRUE;
                } else {
                    System.loadLibrary("jawt");
                    System.loadLibrary("sw3d");
                    field1001 = Boolean.TRUE;
                }
            }
            if (!field1001) {
                throw new RuntimeException("");
            } else {
                this.method479(super.field3988, 0, 0);
                class482.method2863(0, true, false);
                this.field1009 = true;
                this.field1003 = new class131();
                this.method548(new class131());
                this.method493(1);
                this.method494(0);
                if (arg1 != null) {
                    this.method535(arg1);
                    this.method486(arg1);
                }
            }
        } catch (Throwable var5) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "()Z", line = 348)
    public final boolean method500() {
        return false;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lqq;IIII)Le;", line = 351)
    public final class285 method501(class496 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class469(this, this.field989, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!w", name = "w", descriptor = "()I", line = 354)
    public final int method502() {
        return 4;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I[Lsa;)V", line = 358)
    public final void method503(int arg0, class447[] arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < arg0; ++var4) {
            field999[var3++] = arg1[var4].method2633(0);
            field999[var3++] = arg1[var4].method2640(-113);
            field999[var3++] = arg1[var4].method2638(21981);
            field999[var3++] = arg1[var4].method2636((byte) 127);
            field994[var4] = arg1[var4].method2639(24755);
            field999[var3++] = arg1[var4].method2637(97);
        }
        this.method455(arg0, field999, field994);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V", line = 377)
    public final void method504(int arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(FFF)V", line = 379)
    public final void method505(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(II[[I[[IIII)Lya;", line = 385)
    public final class11 method506(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class401(this, this.field989, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIII)V", line = 392)
    public final void method509(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method487().method444(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "([IIIII)Lo;", line = 396)
    public final class359 method510(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class460(this, this.field989, arg0, arg1, arg2, arg3, arg4) : new class227(this, this.field989, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class460(this, this.field989, arg0, arg1, arg2, arg3, arg4) : new class227(this, this.field989, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(I)V", line = 435)
    public final void method513(int arg0) {
        this.field1008[arg0].method446();
    }

    @OriginalMember(owner = "client!w", name = "g", descriptor = "()Z", line = 438)
    public final boolean method514() {
        return false;
    }

    @OriginalMember(owner = "client!w", name = "h", descriptor = "()V", line = 444)
    public final void method516() {
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIF)Lsa;", line = 448)
    public final class447 method518(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return new class282(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!w", name = "f", descriptor = "()Z", line = 454)
    public final boolean method519() {
        return false;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Z)V", line = 457)
    public final void method521(boolean arg0) {
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(Z)V", line = 469)
    public final void method524(boolean arg0) {
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(II)I", line = 473)
    public final int method525(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIILta;II)V", line = 476)
    public final void method526(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class336 arg6, int arg7, int arg8) {
        this.method468(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!w", name = "d", descriptor = "(IIIIII)V", line = 479)
    public final void method527(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method543(arg0, arg1, arg2, arg4, arg5);
        this.method543(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method556(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
        this.method556(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(Z)V", line = 484)
    public final void method528(boolean arg0) {
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lkt;[Lau;Z)Lla;", line = 487)
    public final class306 method529(class61 arg0, class396[] arg1, boolean arg2) {
        return arg2 ? new class204(this, this.field989, arg0, arg1, (class359[]) null) : new class242(this, this.field989, arg0, arg1, (class359[]) null);
    }

    @OriginalMember(owner = "client!w", name = "l", descriptor = "()Z", line = 496)
    public final boolean method531() {
        return true;
    }

    @OriginalMember(owner = "client!w", name = "y", descriptor = "()V", line = 498)
    public final void method532() {
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lvk;)V", line = 501)
    public final void method533(class334 arg0) {
        this.method456(arg0, false);
        this.method487().method437(this, field992, field1002, field997, field993, arg0.field4875.method892((byte) -128));
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 507)
    public final void method535(Canvas arg0) {
        class474 var2 = (class474) this.field1004.method1592((byte) -25, (long) arg0.hashCode());
        if (var2 == null) {
            try {
                Class var3 = Class.forName("java.awt.Canvas");
                Method var4 = var3.getMethod("setIgnoreRepaint", Boolean.TYPE);
                var4.invoke(arg0, Boolean.TRUE);
            } catch (Exception var6) {
            }
            class474 var5 = new class474(this, arg0);
            this.field1004.method1586(var5, (long) arg0.hashCode(), 1);
        }
    }

    @OriginalMember(owner = "client!w", name = "z", descriptor = "()V", line = 529)
    public final void method536() {
        if (this.field1006 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field1006.method2784();
        }
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(I)Ln;", line = 543)
    public final class391 method539(int arg0) {
        class424 var2 = new class424(this, arg0);
        this.field991.method3139(0, var2);
        return var2;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIII)Lks;", line = 548)
    public final class23 method540(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!w", name = "q", descriptor = "()Lc;", line = 555)
    public final class512 method541() {
        return this.field1003;
    }

    @OriginalMember(owner = "client!w", name = "i", descriptor = "()Z", line = 563)
    public final boolean method542() {
        return true;
    }

    @OriginalMember(owner = "client!w", name = "R", descriptor = "()V", line = 572)
    private final void method545() {
        System.gc();
        System.runFinalization();
        class260.method1545((byte) 51);
    }

    @OriginalMember(owner = "client!w", name = "x", descriptor = "()Z", line = 585)
    public final boolean method549() {
        return false;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "()Z", line = 589)
    public final boolean method550() {
        return false;
    }

    @OriginalMember(owner = "client!w", name = "o", descriptor = "()Z", line = 593)
    public final boolean method551() {
        return false;
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(IIIIII)V", line = 599)
    public final void method552(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method546(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Le;Lvk;Lc;Lrr;I)V", line = 602)
    public final void method553(class285 arg0, class334 arg1, class512 arg2, class305 arg3, int arg4) {
        this.method456(arg1, true);
        if (arg3 == null) {
            this.method487().method449(this, arg0, arg2, (int[]) null, arg4, field992, field1002, field997, field993, field996, arg1.field4875.method892((byte) -102), field990);
        } else {
            field995[5] = 0;
            this.method487().method449(this, arg0, arg2, field995, arg4, field992, field1002, field997, field993, field996, arg1.field4875.method892((byte) 102), field990);
            arg3.field4131 = field995[0];
            arg3.field4136 = field995[1];
            arg3.field4133 = field995[2];
            arg3.field4134 = field995[3];
            arg3.field4132 = field995[4];
            arg3.field4135 = field995[5] != 0;
        }
        class469 var6 = (class469) arg0;
        var6.method2727(0, arg2);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lau;Z)Lo;", line = 624)
    public final class359 method555(class396 arg0, boolean arg1) {
        int[] var3 = arg0.field5693;
        byte[] var4 = arg0.field5698;
        int var5 = arg0.field5696;
        int var6 = arg0.field5700;
        class359 var7;
        if (arg1 && arg0.field5695 == null) {
            var7 = new class368(this, this.field989, var3, var4, 0, arg0.field5696, arg0.field5696, arg0.field5700);
        } else {
            int var8 = var5 * var6;
            int[] var9 = new int[var8];
            byte[] var10 = arg0.field5695;
            if (var10 != null) {
                for (int var11 = 0; var11 < var6; ++var11) {
                    int var12 = var5 * var11;
                    for (int var13 = 0; var13 < var5; ++var13) {
                        var9[var12 + var13] = var3[var4[var12 + var13] & 255] | var10[var12 + var13] << 24;
                    }
                }
                var7 = new class460(this, this.field989, var9, 0, var5, var5, var6);
            } else {
                boolean var14 = false;
                for (int var15 = 0; var15 < var8; ++var15) {
                    int var16 = arg0.field5693[var4[var15] & 255];
                    if (var16 >>> 24 != 255) {
                        var14 = true;
                    }
                    var9[var15] = var16;
                }
                if (var14) {
                    var7 = new class460(this, this.field989, var9, 0, arg0.field5696, arg0.field5696, arg0.field5700);
                } else {
                    var7 = new class227(this, this.field989, var9, 0, arg0.field5696, arg0.field5696, arg0.field5700);
                }
            }
        }
        var7.method210(arg0.field5694, arg0.field5699, arg0.field5697, arg0.field5701);
        return var7;
    }

    @OriginalMember(owner = "client!w", name = "A", descriptor = "()Z", line = 705)
    public final boolean method557() {
        return true;
    }

    @OriginalMember(owner = "client!w", name = "qa", descriptor = "()Ljava/lang/Object;", line = 712)
    private final Object method559() {
        return new class493(this);
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "()V", line = 715)
    public final void method560() {
        if (!this.field998) {
            this.field1008 = null;
            this.field1006 = null;
            this.field989 = null;
            this.field1003 = null;
            this.field1004.method1583(83);
            for (class424 var1 = (class424) this.field991.method3137(0); var1 != null; var1 = (class424) this.field991.method3132(0)) {
                var1.method2533();
            }
            this.field991.method3143(true);
            this.method530();
            if (this.field1009) {
                class100.method786(false, 5, true);
                this.field1009 = false;
            }
            this.method545();
            class260.method1546((byte) -36);
            this.field998 = true;
        }
    }

    @OriginalMember(owner = "client!w", name = "m", descriptor = "()Z", line = 745)
    public final boolean method561() {
        return true;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(II[I[I)Lta;", line = 751)
    public final class336 method562(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class489(this, this.field989, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!w", name = "v", descriptor = "()Z", line = 766)
    public final boolean method564() {
        return true;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIZ)Lo;", line = 776)
    public final class359 method565(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return arg4 ? new class460(this, this.field989, arg0, arg1, arg2, arg3) : new class227(this, this.field989, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!w", name = "QA", descriptor = "(Ln;)V")
    private final native void method453(class391 arg0);

    @OriginalMember(owner = "client!w", name = "WA", descriptor = "(I[I[F)V")
    private final native void method455(int arg0, int[] arg1, float[] arg2);

    @OriginalMember(owner = "client!w", name = "l", descriptor = "(SBBZZZBBBIIZZ)V")
    private final native void method458(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12);

    @OriginalMember(owner = "client!w", name = "ZA", descriptor = "(IIIII)V")
    public final native void method460(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!w", name = "T", descriptor = "()F")
    public final native float method461();

    @OriginalMember(owner = "client!w", name = "da", descriptor = "(FF)V")
    public final native void method462(float arg0, float arg1);

    @OriginalMember(owner = "client!w", name = "r", descriptor = "()I")
    public final native int method464();

    @OriginalMember(owner = "client!w", name = "t", descriptor = "(I)V")
    public final native void method467(int arg0);

    @OriginalMember(owner = "client!w", name = "NA", descriptor = "(IIIIIILta;II)V")
    private final native void method468(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class336 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!w", name = "Y", descriptor = "()I")
    public final native int method470();

    @OriginalMember(owner = "client!w", name = "GA", descriptor = "(IIII)V")
    public final native void method471(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!w", name = "aa", descriptor = "()F")
    public final native float method472();

    @OriginalMember(owner = "client!w", name = "pa", descriptor = "()I")
    public final native int method473();

    @OriginalMember(owner = "client!w", name = "va", descriptor = "()V")
    public final native void method477();

    @OriginalMember(owner = "client!w", name = "v", descriptor = "(III[I)V")
    public final native void method478(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!w", name = "W", descriptor = "(Ll;II)V")
    private final native void method479(class127 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!w", name = "e", descriptor = "(Lb;)V")
    private final native void method481(class474 arg0);

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIII)V")
    public final native void method482(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!w", name = "n", descriptor = "()V")
    public final native void method488();

    @OriginalMember(owner = "client!w", name = "MA", descriptor = "([I)V")
    public final native void method495(int[] arg0);

    @OriginalMember(owner = "client!w", name = "OA", descriptor = "()I")
    public final native int method507();

    @OriginalMember(owner = "client!w", name = "P", descriptor = "(IIIIII)V")
    public final native void method508(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!w", name = "ba", descriptor = "(IIII)V")
    public final native void method511(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!w", name = "d", descriptor = "(II)V")
    public final native void method512(int arg0, int arg1);

    @OriginalMember(owner = "client!w", name = "HA", descriptor = "(IIII)V")
    public final native void method515(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!w", name = "s", descriptor = "(IIII)V")
    public final native void method517(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!w", name = "AA", descriptor = "()I")
    public final native int method520();

    @OriginalMember(owner = "client!w", name = "VA", descriptor = "(IIIIII)Z")
    public final native boolean method522(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!w", name = "ra", descriptor = "(ILta;II)V")
    public final native void method523(int arg0, class336 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!w", name = "p", descriptor = "()V")
    public final native void method442();

    @OriginalMember(owner = "client!w", name = "ua", descriptor = "()V")
    private final native void method530();

    @OriginalMember(owner = "client!w", name = "B", descriptor = "(IFFFFF)V")
    public final native void method534(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!w", name = "sa", descriptor = "(IIII)[I")
    public final native int[] method537(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!w", name = "J", descriptor = "(SBBZZZBBBIIZZ[I)V")
    private final native void method538(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12, int[] arg13);

    @OriginalMember(owner = "client!w", name = "ma", descriptor = "(IIIII)V")
    public final native void method543(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!w", name = "u", descriptor = "(I)V")
    private final native void method544(int arg0);

    @OriginalMember(owner = "client!w", name = "A", descriptor = "(IIIIII)V")
    private final native void method546(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!w", name = "ya", descriptor = "(I)V")
    public final native void method547(int arg0);

    @OriginalMember(owner = "client!w", name = "SA", descriptor = "(Lc;)V")
    public final native void method548(class512 arg0);

    @OriginalMember(owner = "client!w", name = "JA", descriptor = "(F)V")
    public final native void method554(float arg0);

    @OriginalMember(owner = "client!w", name = "IA", descriptor = "(IIIII)V")
    public final native void method556(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!w", name = "Q", descriptor = "(III)V")
    public final native void method558(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!w", name = "K", descriptor = "(IIIIII[BII)V")
    public final native void method563(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);
}
