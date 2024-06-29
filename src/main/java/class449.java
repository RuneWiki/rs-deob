import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public class class449 extends class569 {

    @OriginalMember(owner = "client!hv", name = "Db", descriptor = "J")
    public static long field6708 = 0L;

    @OriginalMember(owner = "client!hv", name = "T", descriptor = "I")
    public static int field6692;

    @OriginalMember(owner = "client!hv", name = "ob", descriptor = "I")
    public static int field6693;

    @OriginalMember(owner = "client!hv", name = "pb", descriptor = "I")
    public static int field6694;

    @OriginalMember(owner = "client!hv", name = "qb", descriptor = "I")
    public static int field6695;

    @OriginalMember(owner = "client!hv", name = "rb", descriptor = "I")
    public static int field6696;

    @OriginalMember(owner = "client!hv", name = "sb", descriptor = "I")
    public static int field6697;

    @OriginalMember(owner = "client!hv", name = "tb", descriptor = "I")
    public static int field6698;

    @OriginalMember(owner = "client!hv", name = "ub", descriptor = "I")
    public static int field6699;

    @OriginalMember(owner = "client!hv", name = "vb", descriptor = "I")
    public static int field6700;

    @OriginalMember(owner = "client!hv", name = "wb", descriptor = "I")
    public static int field6701;

    @OriginalMember(owner = "client!hv", name = "xb", descriptor = "I")
    private int field6702;

    @OriginalMember(owner = "client!hv", name = "yb", descriptor = "I")
    public static int field6703;

    @OriginalMember(owner = "client!hv", name = "zb", descriptor = "I")
    public static int field6704;

    @OriginalMember(owner = "client!hv", name = "Ab", descriptor = "I")
    public static int field6705;

    @OriginalMember(owner = "client!hv", name = "Bb", descriptor = "I")
    private int field6706;

    @OriginalMember(owner = "client!hv", name = "Eb", descriptor = "I")
    public static int field6709;

    @OriginalMember(owner = "client!hv", name = "Fb", descriptor = "I")
    public static int field6710;

    @OriginalMember(owner = "client!hv", name = "Gb", descriptor = "I")
    public static int field6711;

    @OriginalMember(owner = "client!hv", name = "Hb", descriptor = "I")
    public static int field6712;

    @OriginalMember(owner = "client!hv", name = "Ib", descriptor = "Lkea;")
    public static class203 field6713;

    @OriginalMember(owner = "client!hv", name = "Cb", descriptor = "[I")
    public int[] field6707;

    static {
        new class474("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(II[[I[[IIII)Ld;", line = 4)
    public final class132 method304(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field6701;
        return new class628(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(IIIIIII)V", line = 12)
    public final void method351(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field6699;
        class51 var8 = (class51) this.method732(Thread.currentThread());
        class255 var9 = var8.field539;
        int var10 = -arg0 + arg2;
        int var11 = -arg1 + arg3;
        int var12 = var10 >= 0 ? var10 : -var10;
        int var13 = var11 >= 0 ? var11 : -var11;
        int var14 = var12;
        if (var12 < var13) {
            var14 = var13;
        }
        if (var14 != 0) {
            int var15 = (var10 << 16) / var14;
            int var16 = (var11 << 16) / var14;
            int var17 = (var15 >> 16) + var10;
            int var18 = (var16 >> 16) + var11;
            if (var16 <= var15) {
                var15 = -var15;
            } else {
                var16 = -var16;
            }
            int var19 = arg5 * var16 >> 17;
            int var20 = arg5 * var16 + 1 >> 17;
            int var21 = arg5 * var15 >> 17;
            int var22 = arg5 * var15 + 1 >> 17;
            int var23 = arg0 - var9.method1706();
            int var24 = arg1 - var9.method1701();
            int var25 = var19 + var23;
            int var26 = -var20 + var23;
            int var27 = var23 - -var17 + -var20;
            int var28 = var23 - -var17 + var19;
            int var29 = var24 - -var21;
            int var30 = var24 - var22;
            int var31 = var24 - (-var18 - -var22);
            int var32 = var18 + var24 - -var21;
            if (arg6 == 0) {
                var9.field3643 = 0;
            } else {
                if (~arg6 != -2) {
                    throw new IllegalArgumentException();
                }
                var9.field3643 = -(arg4 >>> 24) + 255;
            }
            var9.field3638 = ~var25 > -1 || var9.field3640 < var25 || ~var26 > -1 || var26 > var9.field3640 || ~var27 > -1 || var9.field3640 < var27;
            var9.method1699(var29, var30, var31, var25, var26, var27, 0, 0, 0, arg4);
            var9.field3638 = var25 < 0 || ~var25 < ~var9.field3640 || ~var26 > -1 || var9.field3640 < var26 || ~var28 > -1 || var28 > var9.field3640;
            var9.method1699(var29, var31, var32, var25, var27, var28, 0, 0, 0, arg4);
        }
    }

    @OriginalMember(owner = "client!hv", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 91)
    public final void method347(Canvas arg0) {
        ++field6694;
        class437 var2 = (class437) super.field8166.method524((byte) 98, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method2108(true);
            class437 var3 = class521.method3081((byte) 25, arg0);
            super.field8166.method520((byte) -111, var3, (long) arg0.hashCode());
            if (super.field8162 == arg0 && super.field8188 == null) {
                super.field8161 = var3;
                super.field8198 = var3.field6501;
                super.field8205 = var3.field6506;
                super.field8174 = var3.field6504;
                this.method3306();
                return;
            }
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "([Lba;Lq;[Lsda;I)V", line = 119)
    public final void method385(class327[] arg0, class364 arg1, class219[] arg2, int arg3) {
        ++field6705;
        for (int var5 = 0; arg0.length > var5; ++var5) {
            if (arg0[var5] != null) {
                arg0[var5].method1380(arg1, arg2 == null ? null : arg2[0], arg3);
            }
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(IIIIIIIIII)V", line = 137)
    public final void method294(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field6693;
        class51 var11 = (class51) this.method732(Thread.currentThread());
        class255 var12 = var11.field539;
        int var13 = arg2 - super.field8179;
        int var14 = arg1 - super.field8182;
        int var15 = arg5 - super.field8182;
        int var16 = arg4 - super.field8179;
        int var17 = arg0 - super.field8179;
        int var18 = arg3 - super.field8182;
        var12.field3635 = false;
        var12.field3638 = true;
        int var19 = arg6 >>> 24;
        if (arg9 == 0 || ~arg9 == -2 && var19 == 255) {
            var12.field3643 = 0;
            var12.field3645 = false;
            var12.method1702(var14, var18, var15, var17, var13, var16, 0, 0, 0, arg6, arg7, arg8);
        } else if (arg9 != 1) {
            if (arg9 != 2) {
                throw new IllegalArgumentException();
            }
            var12.field3643 = 128;
            var12.field3645 = true;
            var12.method1702(var14, var18, var15, var17, var13, var16, 0, 0, 0, arg6, arg7, arg8);
        } else {
            var12.field3643 = -var19 + 255;
            var12.field3645 = false;
            var12.method1702(var14, var18, var15, var17, var13, var16, 0, 0, 0, arg6, arg7, arg8);
        }
        var12.field3635 = true;
    }

    @OriginalMember(owner = "client!hv", name = "o", descriptor = "(I)V", line = 184)
    public static void method2783(int arg0) {
        if (arg0 != -26648) {
            method2785(9, 42, -108);
        }
        field6713 = null;
    }

    @OriginalMember(owner = "client!hv", name = "e", descriptor = "(I)V", line = 195)
    public final void method296(int arg0) {
        super.field8203[arg0].method3033(8191, (Runnable) null);
        ++field6703;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(ILoa;IIILqf;ILfa;I)V", line = 203)
    public static final void method2784(int arg0, class605 arg1, int arg2, int arg3, int arg4, class593 arg5, int arg6, class199 arg7, int arg8) {
        ++field6698;
        if (arg8 != 2) {
            method2783(99);
        }
        class431 var9 = class59.field680.method1014(arg2, 5187);
        if (var9 != null && var9.field6401 && var9.method2689(true, class23.field243)) {
            if (var9.field6428 != null) {
                int[] var10 = new int[var9.field6428.length];
                for (int var11 = 0; var11 < var10.length / 2; ++var11) {
                    int var13;
                    if (~class236.field3384 == -5) {
                        var13 = (int) class388.field5967 & 16383;
                    } else {
                        var13 = 16383 & (int) class388.field5967 + class17.field173;
                    }
                    int var14 = class605.field8859[var13];
                    int var15 = class605.field8858[var13];
                    if (~class236.field3384 != -5) {
                        var14 = var14 * 256 / (class34.field389 + 256);
                        var15 = var15 * 256 / (class34.field389 + 256);
                    }
                    var10[var11 * 2] = ((var9.field6428[var11 * 2] * 4 + arg6) * var15 + (var9.field6428[var11 * 2 + 1] * 4 + arg3) * var14 >> 14) + arg5.field8570 / 2 + arg0;
                    var10[var11 * 2 + 1] = arg5.field8518 / 2 + (arg4 - ((var9.field6428[var11 * 2 - -1] * 4 + arg3) * var15 - (var9.field6428[var11 * 2] * 4 + arg6) * var14 >> 14));
                }
                class124.method762(arg1, var10, var9.field6387, arg5.field8580, arg5.field8550);
                for (int var12 = 0; ~var12 > ~(var10.length / 2 + -1); ++var12) {
                    arg1.method303(var10[var12 * 2], var10[var12 * 2 + 1], var10[(var12 + 1) * 2], var10[(var12 - -1) * 2 + 1], var9.field6399, 1, arg7, arg0, arg4);
                }
                arg1.method303(var10[var10.length + -2], var10[var10.length + -1], var10[0], var10[1], var9.field6399, 1, arg7, arg0, arg4);
            }
            class433 var16 = null;
            if (~var9.field6407 != 0) {
                var16 = var9.method2691(false, arg1, 1768021437);
                if (var16 != null) {
                    class222.method1440(arg4, arg3, arg6, arg0, arg5, arg7, var16, -121);
                }
            }
            if (var9.field6418 != null) {
                int var17 = 0;
                if (var16 != null) {
                    var17 = var16.method1576();
                }
                class181 var18 = class280.field3903;
                class402 var19 = class327.field4720;
                if (~var9.field6400 == -2) {
                    var18 = class445.field6665;
                    var19 = class261.field3710;
                }
                if (var9.field6400 == 2) {
                    var19 = class281.field3921;
                    var18 = class472.field6992;
                }
                class254.method1688(arg0, arg7, var19, var9.field6392, var9.field6418, var17, arg6, var18, arg3, arg4, 2, arg5);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!hv", name = "d", descriptor = "(I)V", line = 303)
    public final void method345(int arg0) {
        super.field8203[arg0].method3033(8191, Thread.currentThread());
        ++field6710;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 311)
    public final void method361(Canvas arg0) {
        if (arg0 == null) {
            super.field8162 = null;
            super.field8161 = null;
            if (super.field8188 == null) {
                this.field6702 = this.field6706 = 1;
                super.field8205 = super.field8198 = 1;
                super.field8174 = null;
                this.method3306();
            }
        } else {
            class437 var2 = (class437) super.field8166.method524((byte) 122, (long) arg0.hashCode());
            if (var2 != null) {
                super.field8161 = var2;
                super.field8162 = arg0;
                if (super.field8188 == null) {
                    super.field8198 = var2.field6501;
                    super.field8174 = var2.field6504;
                    super.field8205 = var2.field6506;
                    if (~super.field8205 != ~this.field6702 || ~super.field8198 != ~this.field6706) {
                        this.field6706 = super.field8198;
                        this.field6702 = super.field8205;
                        this.field6707 = new int[this.field6706 * this.field6702];
                    }
                    this.method3306();
                }
            }
        }
        ++field6704;
    }

    @OriginalMember(owner = "client!hv", name = "m", descriptor = "()V", line = 361)
    public final void method349() {
        ++field6700;
        int var1 = this.field6707.length;
        int var2 = -var1 + var1 & 7;
        int var3 = 0;
        while (var3 < var2) {
            this.field6707[var3++] = Integer.MAX_VALUE;
            this.field6707[var3++] = Integer.MAX_VALUE;
            this.field6707[var3++] = Integer.MAX_VALUE;
            this.field6707[var3++] = Integer.MAX_VALUE;
            this.field6707[var3++] = Integer.MAX_VALUE;
            this.field6707[var3++] = Integer.MAX_VALUE;
            this.field6707[var3++] = Integer.MAX_VALUE;
            this.field6707[var3++] = Integer.MAX_VALUE;
        }
        while (var1 > var3) {
            this.field6707[var3++] = Integer.MAX_VALUE;
        }
    }

    @OriginalMember(owner = "client!hv", name = "w", descriptor = "()Z", line = 393)
    public final boolean method370() {
        ++field6696;
        return true;
    }

    @OriginalMember(owner = "client!hv", name = "E", descriptor = "()V", line = 406)
    public final void method728() {
        super.field8201 = super.field8168 - super.field8180;
        ++field6697;
        super.field8182 = super.field8196 - super.field8180;
        super.field8179 = super.field8190 - super.field8208;
        super.field8192 = -super.field8208 + super.field8194;
        for (int var1 = 0; var1 < super.field8167; ++var1) {
            class255 var5 = ((class51) super.field8203[var1]).field539;
            var5.field3640 = -super.field8190 + super.field8194;
            var5.field3634 = super.field8168 - super.field8196;
            var5.field3639 = super.field8180 - super.field8196;
            var5.field3631 = -super.field8190 + super.field8208;
        }
        int var2 = super.field8205 * super.field8196 + super.field8190;
        for (int var3 = super.field8196; ~super.field8168 < ~var3; ++var3) {
            for (int var4 = 0; var4 < super.field8167; ++var4) {
                ((class51) super.field8203[var4]).field539.field3637[var3 - super.field8196] = var2;
            }
            var2 += super.field8205;
        }
    }

    @OriginalMember(owner = "client!hv", name = "<init>", descriptor = "(Ljava/awt/Canvas;Le;)V", line = 459)
    public class449(Canvas arg0, class462 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(Ljava/lang/Runnable;)Lnw;", line = 462)
    public final class509 method732(Runnable arg0) {
        ++field6711;
        for (int var2 = 0; ~super.field8167 < ~var2; ++var2) {
            if (super.field8203[var2].field7408 == arg0) {
                return super.field8203[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(III)Z", line = 488)
    public static final boolean method2785(int arg0, int arg1, int arg2) {
        ++field6712;
        return arg1 != -21297 ? true : ~(544 & arg0) == -545 | ~(arg0 & 24) != -1;
    }

    @OriginalMember(owner = "client!hv", name = "h", descriptor = "(I)V", line = 500)
    public final void method348(int arg0) {
        ++field6709;
        super.field8167 = arg0;
        super.field8203 = new class51[super.field8167];
        for (int var2 = 0; super.field8167 > var2; ++var2) {
            super.field8203[var2] = new class51(this);
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lor;IIII)Lba;", line = 518)
    public final class327 method326(class557 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field6692;
        return new class530(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "([Lba;Lbe;Lq;[Lsda;I)V", line = 526)
    public final void method328(class327[] arg0, class33 arg1, class364 arg2, class219[] arg3, int arg4) {
        ++field6695;
        class530[] var6 = new class530[arg0.length];
        for (int var7 = 0; ~arg0.length < ~var7; ++var7) {
            if (arg0[var7] != null) {
                var6[var7] = (class530) arg0[var7];
            }
        }
        class530 var8 = class530.method3108(this, var6);
        var8.method2373(arg2, arg3 != null ? arg3[0] : null, arg1, arg4);
    }
}
