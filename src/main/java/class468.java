import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class468 extends class162 implements class276 {

    @OriginalMember(owner = "client!h", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!h", name = "s", descriptor = "Lko;")
    private class348 field6872 = new class348();

    @OriginalMember(owner = "client!h", name = "I", descriptor = "I")
    private int field6888 = 4096;

    @OriginalMember(owner = "client!h", name = "K", descriptor = "I")
    private int field6890 = 4096;

    @OriginalMember(owner = "client!h", name = "D", descriptor = "Lcv;")
    private class398 field6883 = new class398(4);

    @OriginalMember(owner = "client!h", name = "M", descriptor = "Z")
    private boolean field6892 = false;

    @OriginalMember(owner = "client!h", name = "H", descriptor = "Lia;")
    private class413 field6887;

    @OriginalMember(owner = "client!h", name = "r", descriptor = "[I")
    private static int[] field6871 = new int[Math.max(Math.max(80, 20), 24573)];

    @OriginalMember(owner = "client!h", name = "u", descriptor = "[S")
    private static short[] field6874 = new short[8191];

    @OriginalMember(owner = "client!h", name = "x", descriptor = "[B")
    private static byte[] field6877 = new byte[8191];

    @OriginalMember(owner = "client!h", name = "w", descriptor = "[I")
    private static int[] field6876 = field6871;

    @OriginalMember(owner = "client!h", name = "z", descriptor = "[I")
    private static int[] field6879 = field6871;

    @OriginalMember(owner = "client!h", name = "y", descriptor = "[I")
    private static int[] field6878 = new int[8191];

    @OriginalMember(owner = "client!h", name = "B", descriptor = "Ljava/lang/Boolean;")
    private static Boolean field6881 = Boolean.FALSE;

    @OriginalMember(owner = "client!h", name = "E", descriptor = "[I")
    public static int[] field6884 = field6871;

    @OriginalMember(owner = "client!h", name = "F", descriptor = "[F")
    private static float[] field6885 = new float[20];

    @OriginalMember(owner = "client!h", name = "A", descriptor = "[I")
    public static int[] field6880 = new int[6];

    @OriginalMember(owner = "client!h", name = "C", descriptor = "[I")
    private static int[] field6882 = new int[8191];

    @OriginalMember(owner = "client!h", name = "v", descriptor = "[F")
    private static float[] field6875 = field6885;

    @OriginalMember(owner = "client!h", name = "L", descriptor = "I")
    private int field6891;

    @OriginalMember(owner = "client!h", name = "t", descriptor = "Lba;")
    private class262 field6873;

    @OriginalMember(owner = "client!h", name = "G", descriptor = "Lla;")
    private class313 field6886;

    @OriginalMember(owner = "client!h", name = "J", descriptor = "Ljava/awt/Canvas;")
    private Canvas field6889;

    @OriginalMember(owner = "client!h", name = "N", descriptor = "[Lma;")
    private class10[] field6893;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lmd;Lmd;FLmd;)Lmd;", line = 5)
    public final class379 method440(class379 arg0, class379 arg1, float arg2, class379 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V", line = 8)
    public final void method465(int arg0) {
        this.field6891 = arg0;
        this.field6893 = new class10[this.field6891];
        for (int var2 = 0; var2 < this.field6891; ++var2) {
            this.field6893[var2] = new class10(this, this.field6888, this.field6890);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II)I", line = 22)
    public final int method518(int arg0, int arg1) {
        int var3 = arg0 & 1048575;
        int var4 = arg1 & 1048575;
        return var3 & var4 ^ var4;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "()V", line = 30)
    public final void method444() {
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lgn;Z)V", line = 34)
    private final void method2787(class492 arg0, boolean arg1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        for (class421 var8 = (class421) arg0.field7181.method1483(-1145); var8 != null; var8 = (class421) arg0.field7181.method1484(-33)) {
            field6879[var3++] = var8.field6196;
            field6879[var3++] = var8.field6188;
            field6879[var3++] = var8.field6185;
            field6878[var4++] = var8.field6186;
            field6874[var6++] = (short) var8.field6194;
            field6882[var5++] = var8.field6191;
            if (arg1) {
                field6877[var7++] = var8.field6200;
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lm;Lci;)V", line = 64)
    public class468(int arg0, Canvas arg1, class126 arg2, class312 arg3) {
        super(arg0, arg2);
        try {
            if (!field6881) {
                if (arg3 != null) {
                    arg3.method1975(1, this.getClass());
                    field6881 = Boolean.TRUE;
                } else {
                    System.loadLibrary("jawt");
                    System.loadLibrary("sw3d");
                    field6881 = Boolean.TRUE;
                }
            }
            if (!field6881) {
                throw new RuntimeException("");
            } else {
                this.method2799(super.field2449, 0, 0);
                class91.method744(true, false, -58);
                this.field6892 = true;
                if (arg1 != null) {
                    this.method500(arg1);
                    this.method523(arg1);
                }
                this.field6887 = new class136();
                this.method497(new class136());
                this.method465(1);
                this.method468(0);
            }
        } catch (Throwable var5) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!h", name = "EA", descriptor = "(S)Z", line = 106)
    private final boolean method2788(short arg0) {
        synchronized (this) {
            class216 var3 = super.field2449.method935(arg0, -8037);
            if (var3 == null) {
                return false;
            } else {
                this.method2798(arg0, var3.field3116, var3.field3099, var3.field3095, var3.field3114, var3.field3097, var3.field3096, var3.field3111, var3.field3109, var3.field3119, var3.field3100, var3.field3120, var3.field3104);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "()I", line = 117)
    public final int method488() {
        return 4;
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(II)I", line = 120)
    public final int method472(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!h", name = "l", descriptor = "()Z", line = 124)
    public final boolean method513() {
        return true;
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 128)
    public final void method500(Canvas arg0) {
        class313 var2 = (class313) this.field6883.method2485(122, (long) arg0.hashCode());
        if (var2 == null) {
            try {
                Class var3 = Class.forName("java.awt.Canvas");
                Method var4 = var3.getMethod("setIgnoreRepaint", Boolean.TYPE);
                var4.invoke(arg0, Boolean.TRUE);
            } catch (Exception var6) {
            }
            class313 var5 = new class313(this, arg0);
            this.field6883.method2486(-109, var5, (long) arg0.hashCode());
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)V", line = 147)
    public final void method475(boolean arg0) {
    }

    @OriginalMember(owner = "client!h", name = "ZA", descriptor = "()V", line = 150)
    private final void method2789() {
        System.gc();
        System.runFinalization();
        class284.method1786(14844);
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 155)
    public final void method523(Canvas arg0) {
        if (arg0 != null) {
            class313 var2 = (class313) this.field6883.method2485(4, (long) arg0.hashCode());
            this.field6889 = arg0;
            this.field6886 = var2;
            this.method2796(var2);
        } else {
            this.field6889 = null;
            this.field6886 = null;
            this.method2796((class313) null);
        }
    }

    @OriginalMember(owner = "client!h", name = "B", descriptor = "()Z", line = 172)
    public final boolean method519() {
        return true;
    }

    @OriginalMember(owner = "client!h", name = "m", descriptor = "()Z", line = 177)
    public final boolean method473() {
        return false;
    }

    @OriginalMember(owner = "client!h", name = "q", descriptor = "()V", line = 180)
    public final void method448() {
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lds;[Ldt;Z)Loa;", line = 183)
    public final class488 method453(class12 arg0, class158[] arg1, boolean arg2) {
        return arg2 ? new class194(this, this.field6873, arg0, arg1, (class528[]) null) : new class181(this, this.field6873, arg0, arg1, (class528[]) null);
    }

    @OriginalMember(owner = "client!h", name = "i", descriptor = "()Lia;", line = 190)
    public final class413 method439() {
        return this.field6887;
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(IIIIII)V", line = 194)
    public final void method470(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2785(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!h", name = "h", descriptor = "()Z", line = 198)
    public final boolean method446() {
        return false;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 202)
    public final void method466(Canvas arg0) {
        if (this.field6889 == arg0) {
            this.method523((Canvas) null);
        }
        class313 var2 = (class313) this.field6883.method2485(112, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method2663(-109);
        }
        var2.method1978();
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lc;Lgn;Lia;Lsf;I)V", line = 213)
    public final void method531(class121 arg0, class492 arg1, class413 arg2, class361 arg3, int arg4) {
        this.method2787(arg1, true);
        if (arg3 == null) {
            this.method2797().method77(this, arg0, arg2, (int[]) null, arg4, field6879, field6878, field6882, field6874, field6877, arg1.field7181.method1487(28876), field6884);
        } else {
            field6880[5] = 0;
            this.method2797().method77(this, arg0, arg2, field6880, arg4, field6879, field6878, field6882, field6874, field6877, arg1.field7181.method1487(28876), field6884);
            arg3.field5442 = field6880[0];
            arg3.field5441 = field6880[1];
            arg3.field5445 = field6880[2];
            arg3.field5444 = field6880[3];
            arg3.field5446 = field6880[4];
            arg3.field5443 = field6880[5] != 0;
        }
        class144 var6 = (class144) arg0;
        var6.method1039(0, arg2);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "([Lc;Lia;[Lsf;I)V", line = 234)
    public final void method438(class121[] arg0, class413 arg1, class361[] arg2, int arg3) {
        if (arg2 == null) {
            this.method2797().method69(this, arg0, arg1, (int[]) null, -1, arg3);
        } else {
            class361 var5 = arg2[0];
            field6880[5] = 0;
            this.method2797().method69(this, arg0, arg1, field6880, -1, arg3);
            var5.field5442 = field6880[0];
            var5.field5441 = field6880[1];
            var5.field5445 = field6880[2];
            var5.field5444 = field6880[3];
            var5.field5446 = field6880[4];
            var5.field5443 = field6880[5] != 0;
        }
    }

    @OriginalMember(owner = "client!h", name = "f", descriptor = "()Z", line = 254)
    public final boolean method442() {
        return true;
    }

    @OriginalMember(owner = "client!h", name = "k", descriptor = "()V", line = 261)
    public final void method521() {
        int var1 = 0;
        while (var1 < 9) {
            try {
                this.field6886.method1977();
                return;
            } catch (Exception var2) {
                class185.method1285(117, 200L);
                ++var1;
            }
        }
        this.field6886.method1977();
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "([IIIII)Lf;", line = 277)
    public final class528 method527(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class395(this, this.field6873, arg0, arg1, arg2, arg3, arg4) : new class15(this, this.field6873, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class395(this, this.field6873, arg0, arg1, arg2, arg3, arg4) : new class15(this, this.field6873, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!h", name = "d", descriptor = "(I)V", line = 312)
    public final void method468(int arg0) {
        this.field6893[arg0].method80();
    }

    @OriginalMember(owner = "client!h", name = "e", descriptor = "()V", line = 321)
    public final void method427() {
        for (class262 var1 = (class262) this.field6872.method2257((byte) 115); var1 != null; var1 = (class262) this.field6872.method2256(27)) {
            var1.method1669();
        }
        this.field6872.method2264(23);
        this.method2786();
        if (this.field6892) {
            class86.method701(false, true, 0);
            this.field6892 = false;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIZ)Lf;", line = 338)
    public final class528 method532(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return arg4 ? new class395(this, this.field6873, arg0, arg1, arg2, arg3) : new class15(this, this.field6873, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!h", name = "p", descriptor = "()Z", line = 345)
    public final boolean method529() {
        return false;
    }

    @OriginalMember(owner = "client!h", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 349)
    public final void method533(Canvas arg0) {
        class313 var2 = (class313) this.field6883.method2485(33, (long) arg0.hashCode());
        Dimension var3 = arg0.getSize();
        var2.method1980(arg0, var3.width, var3.height);
        if (arg0 != null && this.field6889 == arg0) {
            this.method523(arg0);
        }
    }

    @OriginalMember(owner = "client!h", name = "x", descriptor = "()V", line = 357)
    public final void method503() {
    }

    @OriginalMember(owner = "client!h", name = "n", descriptor = "()Z", line = 361)
    public final boolean method482() {
        return true;
    }

    @OriginalMember(owner = "client!h", name = "MA", descriptor = "(S)Z", line = 364)
    private final boolean method2791(short arg0) {
        class126 var2 = super.field2449;
        synchronized (super.field2449) {
            if (!super.field2449.method937((byte) 43, arg0)) {
                return false;
            } else {
                class216 var4 = super.field2449.method935(arg0, -8037);
                if (var4 == null) {
                    return false;
                } else {
                    int[] var6;
                    if (var4.field3114 && var4.field3095) {
                        var6 = super.field2449.method938(arg0, true, 0.7F, (byte) -112, 128, 128);
                    } else {
                        var6 = super.field2449.method936((byte) -107, true, arg0, 128, 128, 0.7F);
                    }
                    this.method2792(arg0, var4.field3116, var4.field3099, var4.field3095, var4.field3114, var4.field3097, var4.field3096, var4.field3111, var4.field3109, var4.field3119, var4.field3100, var4.field3120, var4.field3104, var6);
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "z", descriptor = "()Z", line = 390)
    public final boolean method481() {
        return true;
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "()Z", line = 393)
    public final boolean method525() {
        return true;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Ldt;Z)Lf;", line = 397)
    public final class528 method517(class158 arg0, boolean arg1) {
        int[] var3 = arg0.field2386;
        byte[] var4 = arg0.field2384;
        int var5 = arg0.field2391;
        int var6 = arg0.field2388;
        class528 var7;
        if (arg1 && arg0.field2390 == null) {
            var7 = new class345(this, this.field6873, var3, var4, 0, arg0.field2391, arg0.field2391, arg0.field2388);
        } else {
            int var8 = var5 * var6;
            int[] var9 = new int[var8];
            byte[] var10 = arg0.field2390;
            if (var10 != null) {
                for (int var11 = 0; var11 < var6; ++var11) {
                    int var12 = var5 * var11;
                    for (int var13 = 0; var13 < var5; ++var13) {
                        var9[var12 + var13] = var3[var4[var12 + var13] & 255] | var10[var12 + var13] << 24;
                    }
                }
                var7 = new class395(this, this.field6873, var9, 0, var5, var5, var6);
            } else {
                boolean var14 = false;
                for (int var15 = 0; var15 < var8; ++var15) {
                    int var16 = arg0.field2386[var4[var15] & 255];
                    if (var16 >>> 24 != 255) {
                        var14 = true;
                    }
                    var9[var15] = var16;
                }
                if (var14) {
                    var7 = new class395(this, this.field6873, var9, 0, arg0.field2391, arg0.field2391, arg0.field2388);
                } else {
                    var7 = new class15(this, this.field6873, var9, 0, arg0.field2391, arg0.field2391, arg0.field2388);
                }
            }
        }
        var7.method141(arg0.field2392, arg0.field2385, arg0.field2387, arg0.field2389);
        return var7;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Ll;)V", line = 474)
    public final void method449(class16 arg0) {
        this.field6873 = (class262) arg0;
        this.method2793(arg0);
    }

    @OriginalMember(owner = "client!h", name = "r", descriptor = "()V", line = 478)
    public final void method506() {
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(Z)V", line = 481)
    public final void method494(boolean arg0) {
    }

    @OriginalMember(owner = "client!h", name = "g", descriptor = "(I)V", line = 488)
    public final void method454(int arg0) {
        this.field6893[arg0].method79();
    }

    @OriginalMember(owner = "client!h", name = "u", descriptor = "()Z", line = 491)
    public final boolean method493() {
        return false;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I[Ltj;)V", line = 498)
    public final void method464(int arg0, class131[] arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < arg0; ++var4) {
            field6876[var3++] = arg1[var4].method966(-106);
            field6876[var3++] = arg1[var4].method969((byte) -24);
            field6876[var3++] = arg1[var4].method965(false);
            field6876[var3++] = arg1[var4].method964((byte) -59);
            field6875[var4] = arg1[var4].method967(-121);
            field6876[var3++] = arg1[var4].method968(false);
        }
        this.method2790(arg0, field6876, field6875);
    }

    @OriginalMember(owner = "client!h", name = "e", descriptor = "(IIIIII)V", line = 518)
    public final void method516(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method530(arg0, arg1, arg2, arg4, arg5);
        this.method530(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method461(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
        this.method461(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lgn;)V", line = 525)
    public final void method467(class492 arg0) {
        this.method2787(arg0, false);
        this.method2797().method78(this, field6879, field6878, field6882, field6874, arg0.field7181.method1487(28876));
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II[I[I)Lea;", line = 530)
    public final class381 method431(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class198(this, this.field6873, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIII)V", line = 533)
    public final void method491(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2797().method71(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(FFF)V", line = 538)
    public final void method450(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!h", name = "j", descriptor = "()Lia;", line = 542)
    public final class413 method428() {
        return new class136();
    }

    @OriginalMember(owner = "client!h", name = "d", descriptor = "(IIIIII)Lmd;", line = 547)
    public final class379 method432(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lmd;)V", line = 549)
    public final void method455(class379 arg0) {
    }

    @OriginalMember(owner = "client!h", name = "s", descriptor = "()Z", line = 556)
    public final boolean method474() {
        return false;
    }

    @OriginalMember(owner = "client!h", name = "A", descriptor = "()Ljava/lang/Object;", line = 563)
    private final Object method2795() {
        return new class328();
    }

    @OriginalMember(owner = "client!h", name = "C", descriptor = "()Z", line = 568)
    public final boolean method522() {
        return true;
    }

    @OriginalMember(owner = "client!h", name = "h", descriptor = "(I)V", line = 571)
    public final void method507(int arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIII)V", line = 576)
    public final void method429(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!h", name = "D", descriptor = "()Lma;", line = 581)
    public final class10 method2797() {
        for (int var1 = 0; var1 < this.field6891; ++var1) {
            if (this.field6893[var1].field166 == Thread.currentThread()) {
                return this.field6893[var1];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!h", name = "v", descriptor = "()V", line = 594)
    public final void method510() {
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II[[I[[IIII)Lna;", line = 597)
    public final class35 method478(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class218(this, this.field6873, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "([Lc;Lgn;Lia;[Lsf;I)V", line = 600)
    public final void method495(class121[] arg0, class492 arg1, class413 arg2, class361[] arg3, int arg4) {
        this.method2787(arg1, true);
        if (arg3 == null) {
            this.method2797().method76(this, arg0, arg2, (int[]) null, arg4, field6879, field6878, field6882, field6874, field6877, arg1.field7181.method1487(28876), field6884);
        } else {
            class361 var6 = arg3[0];
            field6880[5] = 0;
            this.method2797().method76(this, arg0, arg2, field6880, arg4, field6879, field6878, field6882, field6874, field6877, arg1.field7181.method1487(28876), field6884);
            var6.field5442 = field6880[0];
            var6.field5441 = field6880[1];
            var6.field5445 = field6880[2];
            var6.field5444 = field6880[3];
            var6.field5446 = field6880[4];
            var6.field5443 = field6880[5] != 0;
        }
        int var7 = 0;
        for (int var8 = 0; var8 < arg0.length; ++var8) {
            if (arg0[var8] != null) {
                class144 var9 = (class144) arg0[var8];
                var9.method1039(var7, arg2);
                if (var9.field2124 != null) {
                    var7 += var9.field2124.length * 9;
                }
                if (var9.field2123 != null) {
                    var7 += var9.field2123.length * 3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "finalize", descriptor = "()V", line = 642)
    protected final void finalize() {
        this.method75();
    }

    @OriginalMember(owner = "client!h", name = "e", descriptor = "(I)Ll;", line = 646)
    public final class16 method452(int arg0) {
        class262 var2 = new class262(this, arg0);
        this.field6872.method2270(0, var2);
        return var2;
    }

    @OriginalMember(owner = "client!h", name = "o", descriptor = "()Z", line = 651)
    public final boolean method484() {
        return false;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIF)Ltj;", line = 656)
    public final class131 method483(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return new class82(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Llo;IIII)Lc;", line = 665)
    public final class121 method499(class527 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class144(this, this.field6873, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!h", name = "t", descriptor = "()Z", line = 678)
    public final boolean method524() {
        return true;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIILea;II)V", line = 682)
    public final void method460(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class381 arg6, int arg7, int arg8) {
        this.method2794(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 694)
    public final void method435(Rectangle[] arg0, int arg1) {
        int var3 = 0;
        while (var3 < 9) {
            try {
                for (int var4 = 0; var4 < arg1; ++var4) {
                    Rectangle var5 = arg0[var4];
                    if (var5.width > 0 && var5.height > 0) {
                        this.field6886.method1982(var5.x, var5.y, var5.width, var5.height);
                    }
                }
                return;
            } catch (Exception var8) {
                class185.method1285(111, 200L);
                ++var3;
            }
        }
        for (int var6 = 0; var6 < arg1; ++var6) {
            Rectangle var7 = arg0[var6];
            if (var7.width > 0 && var7.height > 0) {
                this.field6886.method1982(var7.x, var7.y, var7.width, var7.height);
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIIIIII)V", line = 740)
    public final void method456(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!h", name = "y", descriptor = "()Z", line = 748)
    public final boolean method469() {
        return false;
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(Z)V", line = 779)
    public final void method433(boolean arg0) {
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(I)V", line = 798)
    public final void method457(int arg0) {
        class284.method1786(14844);
        this.method2800(arg0);
        for (class262 var2 = (class262) this.field6872.method2257((byte) 107); var2 != null; var2 = (class262) this.field6872.method2256(-51)) {
            var2.method1670();
        }
    }

    @OriginalMember(owner = "client!h", name = "K", descriptor = "(IIIIII)V")
    private final native void method2785(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!h", name = "va", descriptor = "()V")
    public final native void method492();

    @OriginalMember(owner = "client!h", name = "M", descriptor = "(I)V")
    public final native void method436(int arg0);

    @OriginalMember(owner = "client!h", name = "I", descriptor = "()V")
    private final native void method2786();

    @OriginalMember(owner = "client!h", name = "Z", descriptor = "(IIII)V")
    public final native void method480(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!h", name = "W", descriptor = "()I")
    public final native int method459();

    @OriginalMember(owner = "client!h", name = "V", descriptor = "(III)V")
    public final native void method535(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!h", name = "GA", descriptor = "(IIII)V")
    public final native void method485(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!h", name = "VA", descriptor = "(I[I[F)V")
    private final native void method2790(int arg0, int[] arg1, float[] arg2);

    @OriginalMember(owner = "client!h", name = "JA", descriptor = "(II)V")
    public final native void method511(int arg0, int arg1);

    @OriginalMember(owner = "client!h", name = "m", descriptor = "(Lia;)V")
    public final native void method497(class413 arg0);

    @OriginalMember(owner = "client!h", name = "aa", descriptor = "(IIIIII[BII)V")
    public final native void method430(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!h", name = "xa", descriptor = "()I")
    public final native int method445();

    @OriginalMember(owner = "client!h", name = "d", descriptor = "()I")
    public final native int method512();

    @OriginalMember(owner = "client!h", name = "ba", descriptor = "(IIII)V")
    public final native void method536(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!h", name = "FA", descriptor = "()I")
    public final native int method489();

    @OriginalMember(owner = "client!h", name = "f", descriptor = "(SBBZZZBBBIIZZ[I)V")
    private final native void method2792(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12, int[] arg13);

    @OriginalMember(owner = "client!h", name = "Y", descriptor = "(Ll;)V")
    private final native void method2793(class16 arg0);

    @OriginalMember(owner = "client!h", name = "u", descriptor = "([I)V")
    public final native void method505(int[] arg0);

    @OriginalMember(owner = "client!h", name = "NA", descriptor = "(IIIIII)V")
    public final native void method471(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!h", name = "SA", descriptor = "(IIIIII)Z")
    public final native boolean method526(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!h", name = "pa", descriptor = "(IIII)V")
    public final native void method509(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!h", name = "ia", descriptor = "(III[I)V")
    public final native void method463(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!h", name = "ta", descriptor = "(IIIIIILea;II)V")
    private final native void method2794(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class381 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!h", name = "w", descriptor = "()F")
    public final native float method477();

    @OriginalMember(owner = "client!h", name = "da", descriptor = "(IIIII)V")
    public final native void method461(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!h", name = "ua", descriptor = "(F)V")
    public final native void method458(float arg0);

    @OriginalMember(owner = "client!h", name = "g", descriptor = "()I")
    public final native int method462();

    @OriginalMember(owner = "client!h", name = "j", descriptor = "(ILea;II)V")
    public final native void method434(int arg0, class381 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!h", name = "na", descriptor = "(I)V")
    public final native void method479(int arg0);

    @OriginalMember(owner = "client!h", name = "XA", descriptor = "(IFFFFF)V")
    public final native void method520(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!h", name = "S", descriptor = "()V")
    public final native void method501();

    @OriginalMember(owner = "client!h", name = "fa", descriptor = "(IIII)V")
    public final native void method502(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!h", name = "P", descriptor = "(Lla;)V")
    private final native void method2796(class313 arg0);

    @OriginalMember(owner = "client!h", name = "ya", descriptor = "()V")
    public final native void method75();

    @OriginalMember(owner = "client!h", name = "l", descriptor = "(SBBZZZBBBIIZZ)V")
    private final native void method2798(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12);

    @OriginalMember(owner = "client!h", name = "IA", descriptor = "(IIII)[I")
    public final native int[] method508(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!h", name = "B", descriptor = "(Lm;II)V")
    private final native void method2799(class126 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!h", name = "U", descriptor = "(IIIII)V")
    public final native void method530(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!h", name = "la", descriptor = "()F")
    public final native float method487();

    @OriginalMember(owner = "client!h", name = "o", descriptor = "(FF)V")
    public final native void method514(float arg0, float arg1);

    @OriginalMember(owner = "client!h", name = "O", descriptor = "(IIIII)V")
    public final native void method441(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!h", name = "ja", descriptor = "(I)V")
    private final native void method2800(int arg0);
}
