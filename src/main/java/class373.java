import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class373 extends class129 implements class241 {

    @OriginalMember(owner = "client!h", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!h", name = "t", descriptor = "Ltu;")
    private class7 field4835 = new class7();

    @OriginalMember(owner = "client!h", name = "F", descriptor = "I")
    private int field4847 = 4096;

    @OriginalMember(owner = "client!h", name = "G", descriptor = "I")
    private int field4848 = 4096;

    @OriginalMember(owner = "client!h", name = "C", descriptor = "Ljr;")
    private class357 field4844 = new class357(4);

    @OriginalMember(owner = "client!h", name = "H", descriptor = "Lia;")
    private class142 field4849;

    @OriginalMember(owner = "client!h", name = "r", descriptor = "[I")
    private static int[] field4833 = new int[Math.max(Math.max(80, 20), 24573)];

    @OriginalMember(owner = "client!h", name = "w", descriptor = "[I")
    public static int[] field4838 = field4833;

    @OriginalMember(owner = "client!h", name = "A", descriptor = "[F")
    private static float[] field4842 = new float[20];

    @OriginalMember(owner = "client!h", name = "y", descriptor = "[I")
    public static int[] field4840 = new int[6];

    @OriginalMember(owner = "client!h", name = "u", descriptor = "[I")
    private static int[] field4836 = field4833;

    @OriginalMember(owner = "client!h", name = "J", descriptor = "[S")
    private static short[] field4851 = new short[8191];

    @OriginalMember(owner = "client!h", name = "v", descriptor = "[I")
    private static int[] field4837 = new int[8191];

    @OriginalMember(owner = "client!h", name = "x", descriptor = "[I")
    private static int[] field4839 = field4833;

    @OriginalMember(owner = "client!h", name = "K", descriptor = "[I")
    private static int[] field4852 = new int[8191];

    @OriginalMember(owner = "client!h", name = "z", descriptor = "[B")
    private static byte[] field4841 = new byte[8191];

    @OriginalMember(owner = "client!h", name = "D", descriptor = "Ljava/lang/Boolean;")
    private static Boolean field4845 = Boolean.FALSE;

    @OriginalMember(owner = "client!h", name = "B", descriptor = "[F")
    private static float[] field4843 = field4842;

    @OriginalMember(owner = "client!h", name = "L", descriptor = "I")
    private int field4853;

    @OriginalMember(owner = "client!h", name = "I", descriptor = "Lla;")
    private class304 field4850;

    @OriginalMember(owner = "client!h", name = "s", descriptor = "Lba;")
    private class498 field4834;

    @OriginalMember(owner = "client!h", name = "E", descriptor = "Ljava/awt/Canvas;")
    private Canvas field4846;

    @OriginalMember(owner = "client!h", name = "M", descriptor = "[Lma;")
    private class247[] field4854;

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(Z)V", line = 2)
    public final void method845(boolean arg0) {
    }

    @OriginalMember(owner = "client!h", name = "j", descriptor = "()Z", line = 5)
    public final boolean method850() {
        return false;
    }

    @OriginalMember(owner = "client!h", name = "e", descriptor = "()V", line = 10)
    public final void method841() {
    }

    @OriginalMember(owner = "client!h", name = "MA", descriptor = "(S)Z", line = 15)
    private final boolean method2171(short arg0) {
        class79 var2 = super.field1765;
        synchronized (super.field1765) {
            if (!super.field1765.method461(arg0, false)) {
                return false;
            } else {
                class499 var4 = super.field1765.method460(-26282, arg0);
                if (var4 == null) {
                    return false;
                } else {
                    int[] var6;
                    if (var4.field7335 && var4.field7349) {
                        var6 = super.field1765.method458(0.7F, 128, 128, (byte) 0, true, arg0);
                    } else {
                        var6 = super.field1765.method457(128, true, 0.7F, 12071, arg0, 128);
                    }
                    this.method2178(arg0, var4.field7334, var4.field7346, var4.field7349, var4.field7335, var4.field7348, var4.field7329, var4.field7340, var4.field7352, var4.field7344, var4.field7341, var4.field7345, var4.field7350, var6);
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 41)
    public final void method895(Canvas arg0) {
        class304 var2 = (class304) this.field4844.method2085((long) arg0.hashCode(), -5423);
        if (var2 == null) {
            class304 var3 = new class304(this, arg0);
            this.field4844.method2096((long) arg0.hashCode(), var3, (byte) 76);
        }
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(II)I", line = 52)
    public final int method880(int arg0, int arg1) {
        int var3 = arg0 & 1048575;
        int var4 = arg1 & 1048575;
        return var3 & var4 ^ var4;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 61)
    public final void method817(Rectangle[] arg0, int arg1) {
        for (int var3 = 0; var3 < arg1; ++var3) {
            Rectangle var4 = arg0[var3];
            if (var4.width > 0 && var4.height > 0) {
                this.field4850.method1820(var4.x, var4.y, var4.width, var4.height);
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(IIIIII)V", line = 81)
    public final void method891(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2179(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "()V", line = 84)
    public final void method822() {
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "()Z", line = 87)
    public final boolean method834() {
        return true;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIILea;II)V", line = 92)
    public final void method869(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class113 arg6, int arg7, int arg8) {
        this.method2185(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!h", name = "A", descriptor = "()Ljava/lang/Object;", line = 95)
    private final Object method2174() {
        return new class468();
    }

    @OriginalMember(owner = "client!h", name = "t", descriptor = "()Z", line = 100)
    public final boolean method897() {
        return true;
    }

    @OriginalMember(owner = "client!h", name = "h", descriptor = "(I)V", line = 104)
    public final void method908(int arg0) {
        this.field4854[arg0].method1538();
    }

    @OriginalMember(owner = "client!h", name = "y", descriptor = "()Z", line = 108)
    public final boolean method915() {
        return true;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIIIIII)V", line = 112)
    public final void method837(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lm;Lhs;)V", line = 117)
    public class373(int arg0, Canvas arg1, class79 arg2, class441 arg3) {
        super(arg0, arg2);
        try {
            if (!field4845) {
                if (arg3 != null) {
                    arg3.method2628(this.getClass(), -13805);
                    field4845 = Boolean.TRUE;
                } else {
                    System.loadLibrary("jawt");
                    System.loadLibrary("sw3d");
                    field4845 = Boolean.TRUE;
                }
            }
            if (!field4845) {
                throw new RuntimeException("");
            } else {
                this.method2177(super.field1765, 0, 0);
                if (arg1 != null) {
                    this.method895(arg1);
                    this.method919(arg1);
                }
                this.field4849 = new class442();
                this.method829(new class442());
                this.method914(1);
                this.method874(0);
            }
        } catch (Throwable var5) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!h", name = "m", descriptor = "()Z", line = 160)
    public final boolean method879() {
        return false;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Luu;IIII)Lc;", line = 164)
    public final class507 method888(class420 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class184(this, this.field4834, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!h", name = "n", descriptor = "()Z", line = 167)
    public final boolean method882() {
        return true;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lc;Liv;Lia;Laq;I)V", line = 172)
    public final void method824(class507 arg0, class287 arg1, class142 arg2, class530 arg3, int arg4) {
        this.method2176(arg1, true);
        if (arg3 == null) {
            this.method2183().method1542(this, arg0, arg2, (int[]) null, arg4, field4839, field4852, field4837, field4851, field4841, arg1.field3665.method2827(0), field4838);
        } else {
            field4840[5] = 0;
            this.method2183().method1542(this, arg0, arg2, field4840, arg4, field4839, field4852, field4837, field4851, field4841, arg1.field3665.method2827(0), field4838);
            arg3.field7811 = field4840[0];
            arg3.field7810 = field4840[1];
            arg3.field7809 = field4840[2];
            arg3.field7814 = field4840[3];
            arg3.field7812 = field4840[4];
            arg3.field7813 = field4840[5] != 0;
        }
        class184 var6 = (class184) arg0;
        var6.method1219(0, arg2);
    }

    @OriginalMember(owner = "client!h", name = "l", descriptor = "()V", line = 192)
    public final void method856() {
        if (this.field4846.getPeer() == null) {
            throw new RuntimeException();
        } else {
            this.field4850.method1821();
        }
    }

    @OriginalMember(owner = "client!h", name = "f", descriptor = "()I", line = 202)
    public final int method843() {
        return 4;
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(Z)V", line = 207)
    public final void method853(boolean arg0) {
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V", line = 210)
    public final void method818(int arg0) {
        class313.method1862(15946);
        this.method2173(arg0);
        for (class498 var2 = (class498) this.field4835.method49(41); var2 != null; var2 = (class498) this.field4835.method46((byte) 36)) {
            var2.method2982();
        }
    }

    @OriginalMember(owner = "client!h", name = "B", descriptor = "()Z", line = 223)
    public final boolean method923() {
        return false;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lvh;Lvh;FLvh;)Lvh;", line = 226)
    public final class191 method860(class191 arg0, class191 arg1, float arg2, class191 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "([Lc;Lia;[Laq;I)V", line = 229)
    public final void method873(class507[] arg0, class142 arg1, class530[] arg2, int arg3) {
        if (arg2 == null) {
            this.method2183().method1553(this, arg0, arg1, (int[]) null, -1, arg3);
        } else {
            class530 var5 = arg2[0];
            field4840[5] = 0;
            this.method2183().method1553(this, arg0, arg1, field4840, -1, arg3);
            var5.field7811 = field4840[0];
            var5.field7810 = field4840[1];
            var5.field7809 = field4840[2];
            var5.field7814 = field4840[3];
            var5.field7812 = field4840[4];
            var5.field7813 = field4840[5] != 0;
        }
    }

    @OriginalMember(owner = "client!h", name = "p", descriptor = "()Z", line = 249)
    public final boolean method886() {
        return false;
    }

    @OriginalMember(owner = "client!h", name = "i", descriptor = "(I)V", line = 253)
    public final void method914(int arg0) {
        this.field4853 = arg0;
        this.field4854 = new class247[this.field4853];
        for (int var2 = 0; var2 < this.field4853; ++var2) {
            this.field4854[var2] = new class247(this, this.field4847, this.field4848);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "([IIIII)Lf;", line = 267)
    public final class404 method921(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class66(this, this.field4834, arg0, arg1, arg2, arg3, arg4) : new class387(this, this.field4834, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class66(this, this.field4834, arg0, arg1, arg2, arg3, arg4) : new class387(this, this.field4834, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 303)
    public final void method852(Canvas arg0) {
        class304 var2 = (class304) this.field4844.method2085((long) arg0.hashCode(), -5423);
        Dimension var3 = arg0.getSize();
        var2.method1822(arg0, var3.width, var3.height);
        if (arg0 != null && this.field4846 == arg0) {
            this.method919(arg0);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Liv;Z)V", line = 314)
    private final void method2176(class287 arg0, boolean arg1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        for (class355 var8 = (class355) arg0.field3665.method2828(7); var8 != null; var8 = (class355) arg0.field3665.method2831(256)) {
            field4839[var3++] = var8.field4558;
            field4839[var3++] = var8.field4552;
            field4839[var3++] = var8.field4557;
            field4852[var4++] = var8.field4562;
            field4851[var6++] = (short) var8.field4556;
            field4837[var5++] = var8.field4553;
            if (arg1) {
                field4841[var7++] = var8.field4560;
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "z", descriptor = "()Lia;", line = 344)
    public final class142 method916() {
        return new class442();
    }

    @OriginalMember(owner = "client!h", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 349)
    public final void method919(Canvas arg0) {
        if (arg0 != null) {
            class304 var2 = (class304) this.field4844.method2085((long) arg0.hashCode(), -5423);
            this.field4846 = arg0;
            this.field4850 = var2;
            this.method2170(var2);
        } else {
            this.field4846 = null;
            this.field4850 = null;
            this.method2170((class304) null);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lvh;)V", line = 365)
    public final void method862(class191 arg0) {
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "()V", line = 367)
    public final void method836() {
    }

    @OriginalMember(owner = "client!h", name = "k", descriptor = "()Z", line = 371)
    public final boolean method854() {
        return false;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIF)Lve;", line = 375)
    public final class182 method870(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return new class193(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lne;Z)Lf;", line = 380)
    public final class404 method851(class136 arg0, boolean arg1) {
        int[] var3 = arg0.field1831;
        byte[] var4 = arg0.field1833;
        int var5 = arg0.field1837;
        int var6 = arg0.field1832;
        class404 var7;
        if (arg1 && arg0.field1830 == null) {
            var7 = new class464(this, this.field4834, var3, var4, 0, arg0.field1837, arg0.field1837, arg0.field1832);
        } else {
            int var8 = var5 * var6;
            int[] var9 = new int[var8];
            byte[] var10 = arg0.field1830;
            if (var10 != null) {
                for (int var11 = 0; var11 < var6; ++var11) {
                    int var12 = var5 * var11;
                    for (int var13 = 0; var13 < var5; ++var13) {
                        var9[var12 + var13] = var3[var4[var12 + var13] & 255] | var10[var12 + var13] << 24;
                    }
                }
                var7 = new class66(this, this.field4834, var9, 0, var5, var5, var6);
            } else {
                boolean var14 = false;
                for (int var15 = 0; var15 < var8; ++var15) {
                    int var16 = arg0.field1831[var4[var15] & 255];
                    if (var16 >>> 24 != 255) {
                        var14 = true;
                    }
                    var9[var15] = var16;
                }
                if (var14) {
                    var7 = new class66(this, this.field4834, var9, 0, arg0.field1837, arg0.field1837, arg0.field1832);
                } else {
                    var7 = new class387(this, this.field4834, var9, 0, arg0.field1837, arg0.field1837, arg0.field1832);
                }
            }
        }
        var7.method379(arg0.field1835, arg0.field1834, arg0.field1838, arg0.field1836);
        return var7;
    }

    @OriginalMember(owner = "client!h", name = "r", descriptor = "()V", line = 453)
    public final void method892() {
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIII)V", line = 457)
    public final void method830(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2183().method1537(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!h", name = "finalize", descriptor = "()V", line = 460)
    protected final void finalize() {
        this.method373();
    }

    @OriginalMember(owner = "client!h", name = "o", descriptor = "()Z", line = 466)
    public final boolean method884() {
        return true;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II[I[I)Lea;", line = 469)
    public final class113 method896(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class226(this, this.field4834, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!h", name = "f", descriptor = "(I)V", line = 472)
    public final void method874(int arg0) {
        this.field4854[arg0].method1551();
    }

    @OriginalMember(owner = "client!h", name = "d", descriptor = "(I)Ll;", line = 478)
    public final class125 method849(int arg0) {
        class498 var2 = new class498(this, arg0);
        this.field4835.method42(var2, 0);
        return var2;
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 483)
    public final void method877(Canvas arg0) {
        if (this.field4846 == arg0) {
            this.method919((Canvas) null);
        }
        class304 var2 = (class304) this.field4844.method2085((long) arg0.hashCode(), -5423);
        if (var2 != null) {
            var2.method3021(10);
        }
        var2.method1823();
    }

    @OriginalMember(owner = "client!h", name = "C", descriptor = "()Z", line = 495)
    public final boolean method924() {
        return false;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "([Lc;Liv;Lia;[Laq;I)V", line = 499)
    public final void method868(class507[] arg0, class287 arg1, class142 arg2, class530[] arg3, int arg4) {
        this.method2176(arg1, true);
        if (arg3 == null) {
            this.method2183().method1539(this, arg0, arg2, (int[]) null, arg4, field4839, field4852, field4837, field4851, field4841, arg1.field3665.method2827(0), field4838);
        } else {
            class530 var6 = arg3[0];
            field4840[5] = 0;
            this.method2183().method1539(this, arg0, arg2, field4840, arg4, field4839, field4852, field4837, field4851, field4841, arg1.field3665.method2827(0), field4838);
            var6.field7811 = field4840[0];
            var6.field7810 = field4840[1];
            var6.field7809 = field4840[2];
            var6.field7814 = field4840[3];
            var6.field7812 = field4840[4];
            var6.field7813 = field4840[5] != 0;
        }
        int var7 = 0;
        for (int var8 = 0; var8 < arg0.length; ++var8) {
            if (arg0[var8] != null) {
                class184 var9 = (class184) arg0[var8];
                var9.method1219(var7, arg2);
                if (var9.field2413 != null) {
                    var7 += var9.field2413.length * 9;
                }
                if (var9.field2415 != null) {
                    var7 += var9.field2415.length * 3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(FFF)V", line = 540)
    public final void method857(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!h", name = "x", descriptor = "()V", line = 542)
    public final void method911() {
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II[[I[[IIII)Lna;", line = 547)
    public final class251 method909(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class469(this, this.field4834, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!h", name = "s", descriptor = "()V", line = 553)
    public final void method893() {
        for (class498 var1 = (class498) this.field4835.method49(-102); var1 != null; var1 = (class498) this.field4835.method46((byte) 84)) {
            var1.method2984();
        }
        this.field4835.method47(0);
        this.method2184();
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(I)V", line = 568)
    public final void method820(int arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(II)I", line = 572)
    public final int method885(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIII)V", line = 574)
    public final void method833(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!h", name = "q", descriptor = "()Z", line = 577)
    public final boolean method890() {
        return false;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Liv;)V", line = 580)
    public final void method838(class287 arg0) {
        this.method2176(arg0, false);
        this.method2183().method1546(this, field4839, field4852, field4837, field4851, arg0.field3665.method2827(0));
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)V", line = 583)
    public final void method825(boolean arg0) {
    }

    @OriginalMember(owner = "client!h", name = "ZA", descriptor = "()V", line = 588)
    private final void method2180() {
        System.gc();
        System.runFinalization();
        class313.method1862(15946);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lov;[Lne;Z)Loa;", line = 594)
    public final class167 method867(class278 arg0, class136[] arg1, boolean arg2) {
        return arg2 ? new class68(this, this.field4834, arg0, arg1, (class404[]) null) : new class220(this, this.field4834, arg0, arg1, (class404[]) null);
    }

    @OriginalMember(owner = "client!h", name = "v", descriptor = "()Z", line = 601)
    public final boolean method903() {
        return true;
    }

    @OriginalMember(owner = "client!h", name = "u", descriptor = "()Z", line = 604)
    public final boolean method898() {
        return true;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Ll;)V", line = 607)
    public final void method832(class125 arg0) {
        this.field4834 = (class498) arg0;
        this.method2172(arg0);
    }

    @OriginalMember(owner = "client!h", name = "EA", descriptor = "(S)Z", line = 612)
    private final boolean method2181(short arg0) {
        synchronized (this) {
            class499 var3 = super.field1765.method460(-26282, arg0);
            if (var3 == null) {
                return false;
            } else {
                this.method2175(arg0, var3.field7334, var3.field7346, var3.field7349, var3.field7335, var3.field7348, var3.field7329, var3.field7340, var3.field7352, var3.field7344, var3.field7341, var3.field7345, var3.field7350);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "i", descriptor = "()Lia;", line = 625)
    public final class142 method847() {
        return this.field4849;
    }

    @OriginalMember(owner = "client!h", name = "f", descriptor = "(IIIIII)V", line = 629)
    public final void method918(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method904(arg0, arg1, arg2, arg4, arg5);
        this.method904(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method875(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
        this.method875(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
    }

    @OriginalMember(owner = "client!h", name = "D", descriptor = "()Lma;", line = 638)
    public final class247 method2183() {
        for (int var1 = 0; var1 < this.field4853; ++var1) {
            if (this.field4854[var1].field3166 == Thread.currentThread()) {
                return this.field4854[var1];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIZ)Lf;", line = 652)
    public final class404 method905(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return arg4 ? new class66(this, this.field4834, arg0, arg1, arg2, arg3) : new class387(this, this.field4834, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIII)Lvh;", line = 661)
    public final class191 method859(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I[Lve;)V", line = 692)
    public final void method906(int arg0, class182[] arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < arg0; ++var4) {
            field4836[var3++] = arg1[var4].method1203((byte) -76);
            field4836[var3++] = arg1[var4].method1199((byte) 3);
            field4836[var3++] = arg1[var4].method1202((byte) -60);
            field4836[var3++] = arg1[var4].method1194(true);
            field4843[var4] = arg1[var4].method1201(48);
            field4836[var3++] = arg1[var4].method1198((byte) -71);
        }
        this.method2182(arg0, field4836, field4843);
    }

    @OriginalMember(owner = "client!h", name = "h", descriptor = "()Z", line = 732)
    public final boolean method844() {
        return true;
    }

    @OriginalMember(owner = "client!h", name = "o", descriptor = "(FF)V")
    public final native void method913(float arg0, float arg1);

    @OriginalMember(owner = "client!h", name = "P", descriptor = "(Lla;)V")
    private final native void method2170(class304 arg0);

    @OriginalMember(owner = "client!h", name = "Z", descriptor = "(IIII)V")
    public final native void method899(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!h", name = "pa", descriptor = "(IIII)V")
    public final native void method925(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!h", name = "Y", descriptor = "(Ll;)V")
    private final native void method2172(class125 arg0);

    @OriginalMember(owner = "client!h", name = "ba", descriptor = "(IIII)V")
    public final native void method848(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!h", name = "ja", descriptor = "(I)V")
    private final native void method2173(int arg0);

    @OriginalMember(owner = "client!h", name = "na", descriptor = "(I)V")
    public final native void method922(int arg0);

    @OriginalMember(owner = "client!h", name = "j", descriptor = "(ILea;II)V")
    public final native void method912(int arg0, class113 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!h", name = "aa", descriptor = "(IIIIII[BII)V")
    public final native void method864(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!h", name = "d", descriptor = "()I")
    public final native int method871();

    @OriginalMember(owner = "client!h", name = "NA", descriptor = "(IIIIII)V")
    public final native void method861(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!h", name = "V", descriptor = "(III)V")
    public final native void method842(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!h", name = "M", descriptor = "(I)V")
    public final native void method900(int arg0);

    @OriginalMember(owner = "client!h", name = "u", descriptor = "([I)V")
    public final native void method846(int[] arg0);

    @OriginalMember(owner = "client!h", name = "la", descriptor = "()F")
    public final native float method863();

    @OriginalMember(owner = "client!h", name = "l", descriptor = "(SBBZZZBBBIIZZ)V")
    private final native void method2175(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12);

    @OriginalMember(owner = "client!h", name = "ya", descriptor = "()V")
    public final native void method373();

    @OriginalMember(owner = "client!h", name = "ua", descriptor = "(F)V")
    public final native void method901(float arg0);

    @OriginalMember(owner = "client!h", name = "fa", descriptor = "(IIII)V")
    public final native void method823(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!h", name = "B", descriptor = "(Lm;II)V")
    private final native void method2177(class79 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!h", name = "w", descriptor = "()F")
    public final native float method828();

    @OriginalMember(owner = "client!h", name = "f", descriptor = "(SBBZZZBBBIIZZ[I)V")
    private final native void method2178(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12, int[] arg13);

    @OriginalMember(owner = "client!h", name = "JA", descriptor = "(II)V")
    public final native void method894(int arg0, int arg1);

    @OriginalMember(owner = "client!h", name = "g", descriptor = "()I")
    public final native int method872();

    @OriginalMember(owner = "client!h", name = "FA", descriptor = "()I")
    public final native int method917();

    @OriginalMember(owner = "client!h", name = "K", descriptor = "(IIIIII)V")
    private final native void method2179(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!h", name = "W", descriptor = "()I")
    public final native int method876();

    @OriginalMember(owner = "client!h", name = "XA", descriptor = "(IFFFFF)V")
    public final native void method840(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!h", name = "U", descriptor = "(IIIII)V")
    public final native void method904(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!h", name = "xa", descriptor = "()I")
    public final native int method889();

    @OriginalMember(owner = "client!h", name = "ia", descriptor = "(III[I)V")
    public final native void method855(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!h", name = "da", descriptor = "(IIIII)V")
    public final native void method875(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!h", name = "VA", descriptor = "(I[I[F)V")
    private final native void method2182(int arg0, int[] arg1, float[] arg2);

    @OriginalMember(owner = "client!h", name = "IA", descriptor = "(IIII)[I")
    public final native int[] method835(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!h", name = "I", descriptor = "()V")
    private final native void method2184();

    @OriginalMember(owner = "client!h", name = "O", descriptor = "(IIIII)V")
    public final native void method883(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!h", name = "va", descriptor = "()V")
    public final native void method865();

    @OriginalMember(owner = "client!h", name = "ta", descriptor = "(IIIIIILea;II)V")
    private final native void method2185(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class113 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!h", name = "S", descriptor = "()V")
    public final native void method831();

    @OriginalMember(owner = "client!h", name = "SA", descriptor = "(IIIIII)Z")
    public final native boolean method887(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!h", name = "m", descriptor = "(Lia;)V")
    public final native void method829(class142 arg0);

    @OriginalMember(owner = "client!h", name = "GA", descriptor = "(IIII)V")
    public final native void method821(int arg0, int arg1, int arg2, int arg3);
}
