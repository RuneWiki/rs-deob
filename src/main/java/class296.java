import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class296 extends class278 {

    @OriginalMember(owner = "client!eo", name = "x", descriptor = "Lbq;")
    private class289 field3653 = new class289();

    @OriginalMember(owner = "client!eo", name = "A", descriptor = "Lnv;")
    public class417 field3656;

    @OriginalMember(owner = "client!eo", name = "m", descriptor = "I")
    private int field3642;

    @OriginalMember(owner = "client!eo", name = "r", descriptor = "[[[I")
    private int[][][] field3647;

    @OriginalMember(owner = "client!eo", name = "fb", descriptor = "[[F")
    private float[][] field3687;

    @OriginalMember(owner = "client!eo", name = "ib", descriptor = "[[F")
    private float[][] field3690;

    @OriginalMember(owner = "client!eo", name = "t", descriptor = "[[[Lni;")
    private class520[][][] field3649;

    @OriginalMember(owner = "client!eo", name = "Z", descriptor = "[[F")
    private float[][] field3681;

    @OriginalMember(owner = "client!eo", name = "P", descriptor = "[[S")
    public short[][] field3671;

    @OriginalMember(owner = "client!eo", name = "n", descriptor = "[[[I")
    public int[][][] field3643;

    @OriginalMember(owner = "client!eo", name = "Y", descriptor = "[[B")
    private byte[][] field3680;

    @OriginalMember(owner = "client!eo", name = "U", descriptor = "[[[I")
    public int[][][] field3676;

    @OriginalMember(owner = "client!eo", name = "W", descriptor = "I")
    public int field3678;

    @OriginalMember(owner = "client!eo", name = "T", descriptor = "[[[I")
    private int[][][] field3675;

    @OriginalMember(owner = "client!eo", name = "K", descriptor = "I")
    private int field3666;

    @OriginalMember(owner = "client!eo", name = "u", descriptor = "[[[I")
    public int[][][] field3650;

    @OriginalMember(owner = "client!eo", name = "F", descriptor = "[[B")
    private byte[][] field3661;

    @OriginalMember(owner = "client!eo", name = "cb", descriptor = "Lpfa;")
    private class295 field3684;

    @OriginalMember(owner = "client!eo", name = "N", descriptor = "Lou;")
    private class603 field3669;

    @OriginalMember(owner = "client!eo", name = "v", descriptor = "Z")
    public static boolean field3651 = false;

    @OriginalMember(owner = "client!eo", name = "o", descriptor = "I")
    public static int field3644;

    @OriginalMember(owner = "client!eo", name = "p", descriptor = "I")
    public static int field3645;

    @OriginalMember(owner = "client!eo", name = "q", descriptor = "I")
    public static int field3646;

    @OriginalMember(owner = "client!eo", name = "s", descriptor = "I")
    public static int field3648;

    @OriginalMember(owner = "client!eo", name = "w", descriptor = "I")
    public static int field3652;

    @OriginalMember(owner = "client!eo", name = "y", descriptor = "I")
    public static int field3654;

    @OriginalMember(owner = "client!eo", name = "z", descriptor = "I")
    public static int field3655;

    @OriginalMember(owner = "client!eo", name = "B", descriptor = "I")
    private int field3657;

    @OriginalMember(owner = "client!eo", name = "C", descriptor = "I")
    public static int field3658;

    @OriginalMember(owner = "client!eo", name = "D", descriptor = "I")
    public static int field3659;

    @OriginalMember(owner = "client!eo", name = "E", descriptor = "I")
    public static int field3660;

    @OriginalMember(owner = "client!eo", name = "G", descriptor = "I")
    public static int field3662;

    @OriginalMember(owner = "client!eo", name = "H", descriptor = "I")
    public static int field3663;

    @OriginalMember(owner = "client!eo", name = "I", descriptor = "I")
    public static int field3664;

    @OriginalMember(owner = "client!eo", name = "J", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "client!eo", name = "M", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!eo", name = "O", descriptor = "I")
    public static int field3670;

    @OriginalMember(owner = "client!eo", name = "Q", descriptor = "I")
    public static int field3672;

    @OriginalMember(owner = "client!eo", name = "R", descriptor = "I")
    private int field3673;

    @OriginalMember(owner = "client!eo", name = "V", descriptor = "I")
    public static int field3677;

    @OriginalMember(owner = "client!eo", name = "ab", descriptor = "I")
    private int field3682;

    @OriginalMember(owner = "client!eo", name = "jb", descriptor = "I")
    private int field3691;

    @OriginalMember(owner = "client!eo", name = "S", descriptor = "Loh;")
    public static class404 field3674;

    @OriginalMember(owner = "client!eo", name = "hb", descriptor = "Lid;")
    private class583 field3689;

    @OriginalMember(owner = "client!eo", name = "X", descriptor = "Lpw;")
    private class704 field3679;

    @OriginalMember(owner = "client!eo", name = "bb", descriptor = "Lpw;")
    public class704 field3683;

    @OriginalMember(owner = "client!eo", name = "db", descriptor = "Lpw;")
    public class704 field3685;

    @OriginalMember(owner = "client!eo", name = "eb", descriptor = "Lpw;")
    public class704 field3686;

    @OriginalMember(owner = "client!eo", name = "gb", descriptor = "[Lni;")
    private class520[] field3688;

    @OriginalMember(owner = "client!eo", name = "L", descriptor = "[[[I")
    private int[][][] field3667;

    @OriginalMember(owner = "client!eo", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1673(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        ++field3655;
        class150 var15 = this.field3656.field578;
        if (arg5 != null && this.field3667 == null) {
            this.field3667 = new int[super.field3410][super.field3408][];
        }
        if (arg3 != null && this.field3647 == null) {
            this.field3647 = new int[super.field3410][super.field3408][];
        }
        this.field3643[arg0][arg1] = arg2;
        this.field3650[arg0][arg1] = arg4;
        this.field3676[arg0][arg1] = arg6;
        this.field3675[arg0][arg1] = arg7;
        if (this.field3667 != null) {
            this.field3667[arg0][arg1] = arg5;
        }
        if (this.field3647 != null) {
            this.field3647[arg0][arg1] = arg3;
        }
        class520[] var16 = this.field3649[arg0][arg1] = new class520[arg6.length];
        for (int var17 = 0; ~var17 > ~arg6.length; ++var17) {
            int var18 = arg8[var17];
            int var19 = arg9[var17];
            if (~(32 & this.field3678) != -1 && var18 != -1 && var15.method931(var18, true).field3694) {
                var19 = 128;
                var18 = -1;
            }
            long var20 = (long) (var19 << 14) | (long) arg10 << 28 | (long) arg12 << 48 | (long) arg11 << 42 | (long) var18;
            class134 var22;
            for (var22 = this.field3684.method1754(false, var20); var22 != null; var22 = this.field3684.method1759(-1)) {
                class520 var23 = (class520) var22;
                if (~var23.field7410 == ~var18 && (float) var19 == var23.field7389 && ~var23.field7403 == ~arg10 && ~var23.field7390 == ~arg11 && var23.field7395 == arg12) {
                    break;
                }
            }
            if (var22 != null) {
                var16[var17] = (class520) var22;
            } else {
                var16[var17] = new class520(this, var18, var19, arg10, arg11, arg12);
                this.field3684.method1751(var16[var17], 3970, var20);
            }
        }
        if (arg13) {
            this.field3661[arg0][arg1] = (byte) class695.method3919(this.field3661[arg0][arg1], 1);
        }
        if (arg6.length > this.field3691) {
            this.field3691 = arg6.length;
        }
        this.field3682 += arg6.length;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(III[[ZZII)V")
    public final void method1670(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        this.method1765(arg0, arg2, (byte) 51, arg4, arg5, arg6, arg1, arg3);
        ++field3659;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(III[[ZZI)V")
    public final void method1667(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        ++field3677;
        this.method1765(arg0, arg2, (byte) 40, arg4, -1, arg5, arg1, arg3);
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1665(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field3662;
        int var18 = arg9.length;
        int[] var19 = new int[var18 * 3];
        int[] var20 = new int[var18 * 3];
        int[] var21 = new int[var18 * 3];
        int[] var22 = new int[var18 * 3];
        int[] var23 = new int[var18 * 3];
        int[] var24 = new int[var18 * 3];
        int[] var25 = arg3 == null ? null : new int[var18 * 3];
        int[] var26 = arg5 == null ? null : new int[var18 * 3];
        int var27 = 0;
        for (int var28 = 0; ~var28 > ~var18; ++var28) {
            int var29 = arg6[var28];
            int var30 = arg7[var28];
            int var31 = arg8[var28];
            var19[var27] = arg2[var29];
            var20[var27] = arg4[var29];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            var22[var27] = arg10 != null ? arg10[var28] : arg9[var28];
            if (arg3 != null) {
                var25[var27] = arg3[var29];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var29];
            }
            ++var27;
            var19[var27] = arg2[var30];
            var20[var27] = arg4[var30];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            var22[var27] = arg10 != null ? arg10[var28] : arg9[var28];
            if (arg3 != null) {
                var25[var27] = arg3[var30];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var30];
            }
            ++var27;
            var19[var27] = arg2[var31];
            var20[var27] = arg4[var31];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            var22[var27] = arg10 != null ? arg10[var28] : arg9[var28];
            if (arg3 != null) {
                var25[var27] = arg3[var31];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var31];
            }
            ++var27;
        }
        this.method1673(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1760(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field3670;
        if (~arg0 == ~arg1) {
            class186.method1148(arg3, arg7, arg2, arg5, arg1, -57, arg4);
        } else {
            if (arg6 < 107) {
                method1763((byte) -42);
            }
            if (-arg1 + arg2 >= class338.field4355 && ~(arg1 + arg2) >= ~class744.field10385 && class224.field2571 <= -arg0 + arg4 && ~(arg0 + arg4) >= ~class578.field8182) {
                class147.method916(true, arg1, arg3, arg5, arg2, arg7, arg0, arg4);
            } else {
                class24.method109(arg7, arg0, arg3, arg2, -100, arg5, arg1, arg4);
            }
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(Lr;IIIIZ)Z")
    public final boolean method1669(class182 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field3660;
        if (this.field3669 != null && arg0 != null) {
            int var7 = -(this.field3656.field5960 * arg2 >> 8) + arg1 >> this.field3656.field5920;
            int var8 = -(this.field3656.field6027 * arg2 >> 8) + arg3 >> this.field3656.field5920;
            return this.field3669.method3424(var7, arg0, (byte) -38, var8);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIIII)V")
    public static final void method1761(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3644;
        int var5 = 0;
        int var6 = arg4;
        int var7 = -arg4;
        if (arg0 <= 95) {
            method1761(102, -57, -115, 76, -127);
        }
        int var8 = -1;
        int var9 = class211.method1255(class338.field4355, arg3 + arg4, false, class744.field10385);
        int var10 = class211.method1255(class338.field4355, -arg4 + arg3, false, class744.field10385);
        class223.method1297(class408.field5585[arg1], -7, var10, arg2, var9);
        while (var6 > var5) {
            var8 += 2;
            var7 += var8;
            if (~var7 < -1) {
                --var6;
                var7 -= var6 << 1;
                int var11 = -var6 + arg1;
                int var12 = arg1 - -var6;
                if (var12 >= class224.field2571 && var11 <= class578.field8182) {
                    int var13 = class211.method1255(class338.field4355, arg3 + var5, false, class744.field10385);
                    int var14 = class211.method1255(class338.field4355, -var5 + arg3, false, class744.field10385);
                    if (~class578.field8182 <= ~var12) {
                        class223.method1297(class408.field5585[var12], -7, var14, arg2, var13);
                    }
                    if (class224.field2571 <= var11) {
                        class223.method1297(class408.field5585[var11], -7, var14, arg2, var13);
                    }
                }
            }
            ++var5;
            int var15 = -var5 + arg1;
            int var16 = arg1 - -var5;
            if (var16 >= class224.field2571 && ~var15 >= ~class578.field8182) {
                int var17 = class211.method1255(class338.field4355, arg3 + var6, false, class744.field10385);
                int var18 = class211.method1255(class338.field4355, -var6 + arg3, false, class744.field10385);
                if (~class578.field8182 <= ~var16) {
                    class223.method1297(class408.field5585[var16], -7, var18, arg2, var17);
                }
                if (~var15 <= ~class224.field2571) {
                    class223.method1297(class408.field5585[var15], -7, var18, arg2, var17);
                }
            }
        }
    }

    @OriginalMember(owner = "client!eo", name = "wa", descriptor = "(Lr;IIIIZ)V")
    public final void method1663(class182 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field3654;
        if (this.field3669 != null && arg0 != null) {
            int var7 = -(this.field3656.field5960 * arg2 >> 8) + arg1 >> this.field3656.field5920;
            int var8 = -(this.field3656.field6027 * arg2 >> 8) + arg3 >> this.field3656.field5920;
            this.field3669.method3427(arg0, var7, 1, var8);
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(Lada;[I)V")
    public final void method1668(class163 arg0, int[] arg1) {
        this.field3653.method1721((byte) 93, new class314(this.field3656, this, arg0, arg1));
        ++field3672;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IZ)V")
    public static final void method1762(int arg0, boolean arg1) {
        class220.method1284(class705.field9926, arg1, (byte) 45, class327.field4245, class476.field6777);
        if (arg0 >= 105) {
            ++field3646;
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(B)V")
    public static void method1763(byte arg0) {
        field3674 = null;
        if (arg0 >= -111) {
            method1763((byte) -43);
        }
    }

    @OriginalMember(owner = "client!eo", name = "CA", descriptor = "(Lr;IIIIZ)V")
    public final void method1677(class182 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field3648;
        if (this.field3669 != null && arg0 != null) {
            int var7 = arg1 - (this.field3656.field5960 * arg2 >> 8) >> this.field3656.field5920;
            int var8 = -(this.field3656.field6027 * arg2 >> 8) + arg3 >> this.field3656.field5920;
            this.field3669.method3420(var8, 1, arg0, var7);
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(II)V")
    public final void method1672(int arg0, int arg1) {
        ++field3665;
    }

    @OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(Lnv;IIII[[I[[II)V")
    public class296(class417 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field3656 = arg0;
        this.field3642 = super.field3409 + -2;
        this.field3647 = new int[arg3][arg4][];
        this.field3687 = new float[super.field3410 + 1][super.field3408 + 1];
        this.field3690 = new float[super.field3410 - -1][super.field3408 + 1];
        this.field3649 = new class520[arg3][arg4][];
        this.field3681 = new float[super.field3410 + 1][super.field3408 + 1];
        this.field3671 = new short[arg3 * arg4][];
        this.field3643 = new int[arg3][arg4][];
        this.field3680 = new byte[arg3 + 1][arg4 + 1];
        this.field3676 = new int[arg3][arg4][];
        this.field3678 = arg2;
        this.field3675 = new int[arg3][arg4][];
        this.field3666 = 1 << this.field3642;
        this.field3650 = new int[arg3][arg4][];
        this.field3661 = new byte[arg3][arg4];
        for (int var9 = 1; ~var9 > ~super.field3408; ++var9) {
            for (int var10 = 1; super.field3410 > var10; ++var10) {
                int var11 = arg6[var10 + 1][var9] + -arg6[var10 - 1][var9];
                int var12 = arg6[var10][var9 + 1] + -arg6[var10][var9 + -1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var11 * var11 + arg7 * 4 * arg7 + var12 * var12)));
                this.field3687[var10][var9] = (float) var11 * var13;
                this.field3690[var10][var9] = (float) (-arg7 * 2) * var13;
                this.field3681[var10][var9] = (float) var12 * var13;
            }
        }
        this.field3684 = new class295(128);
        if ((this.field3678 & 16) != 0) {
            this.field3669 = new class603(this.field3656, this);
        }
    }

    @OriginalMember(owner = "client!eo", name = "ka", descriptor = "(III)V")
    public final void method1666(int arg0, int arg1, int arg2) {
        if (~arg2 < ~(this.field3680[arg0][arg1] & 255)) {
            this.field3680[arg0][arg1] = (byte) arg2;
        }
        ++field3664;
    }

    @OriginalMember(owner = "client!eo", name = "fa", descriptor = "(IILr;)Lr;")
    public final class182 method1678(int arg0, int arg1, class182 arg2) {
        ++field3663;
        if ((1 & this.field3661[arg0][arg1]) == 0) {
            return null;
        } else {
            int var4 = super.field3413 >> this.field3656.field5920;
            class396 var5 = (class396) arg2;
            class396 var6;
            if (var5 != null && var5.method2427(var4, var4, 20584)) {
                var6 = var5;
                var5.method2430(false);
            } else {
                var6 = new class396(this.field3656, var4, var4);
            }
            var6.method2428(var4, (byte) -20, 0, var4, 0);
            this.method1764((byte) -106, arg1, var6, arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method1662(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field3668;
        if (~this.field3682 < -1) {
            this.field3656.method2611(30814);
            this.field3656.method2597((byte) 56, false);
            this.field3656.method2625((byte) 73, false);
            this.field3656.method2551((byte) -45, false);
            this.field3656.method2556(false, -64);
            this.field3656.method2606(0, -24754);
            this.field3656.method2624(-2, 2);
            this.field3656.method2621(-2, (class292) null);
            class518.field7375[2] = 0.0F;
            class518.field7375[7] = 0.0F;
            class518.field7375[1] = 0.0F;
            class518.field7375[11] = 0.0F;
            class518.field7375[12] = -(((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field3656.field5899) + -1.0F;
            class518.field7375[4] = 0.0F;
            class518.field7375[5] = (float) arg2 / ((float) super.field3413 * 128.0F * (float) this.field3656.field5837);
            class518.field7375[13] = -(((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field3656.field5837) + 1.0F;
            class518.field7375[0] = (float) arg2 / ((float) super.field3413 * 128.0F * (float) this.field3656.field5899);
            class518.field7375[6] = 0.0F;
            class518.field7375[14] = 0.0F;
            class518.field7375[10] = 0.0F;
            class518.field7375[3] = 0.0F;
            class518.field7375[8] = 0.0F;
            class518.field7375[9] = 0.0F;
            class518.field7375[15] = 1.0F;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(class518.field7375, 0);
            class518.field7375[15] = 1.0F;
            class518.field7375[11] = 0.0F;
            class518.field7375[9] = 1.0F;
            class518.field7375[13] = 0.0F;
            class518.field7375[2] = 0.0F;
            class518.field7375[8] = 0.0F;
            class518.field7375[0] = 1.0F;
            class518.field7375[7] = 0.0F;
            class518.field7375[5] = 0.0F;
            class518.field7375[6] = 1.0F;
            class518.field7375[12] = 0.0F;
            class518.field7375[1] = 0.0F;
            class518.field7375[10] = 0.0F;
            class518.field7375[3] = 0.0F;
            class518.field7375[14] = 0.0F;
            class518.field7375[4] = 0.0F;
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadMatrixf(class518.field7375, 0);
            if (~(this.field3678 & 7) != -1) {
                this.field3656.method2625((byte) 94, true);
                this.field3656.method2578(-16667);
            } else {
                this.field3656.method2625((byte) 122, false);
            }
            this.field3656.method2589(this.field3679, this.field3686, this.field3685, false, this.field3683);
            if (~this.field3656.field6059.field2912.length > ~(this.field3673 * 2)) {
                this.field3656.field6059 = new class685(this.field3673 * 2);
            } else {
                this.field3656.field6059.field2903 = 0;
            }
            int var9 = 0;
            class685 var10 = this.field3656.field6059;
            if (!this.field3656.field5992) {
                for (int var11 = arg4; ~var11 > ~arg6; ++var11) {
                    int var12 = super.field3410 * var11 - -arg3;
                    for (int var13 = arg3; arg5 > var13; ++var13) {
                        if (arg7[-arg3 + var13][-arg4 + var11]) {
                            short[] var14 = this.field3671[var12];
                            if (var14 != null) {
                                for (int var15 = 0; ~var14.length < ~var15; ++var15) {
                                    var10.method1432(65535 & var14[var15], (byte) 98);
                                    ++var9;
                                }
                            }
                        }
                        ++var12;
                    }
                }
            } else {
                for (int var16 = arg4; ~var16 > ~arg6; ++var16) {
                    int var18 = super.field3410 * var16 + arg3;
                    for (int var19 = arg3; ~var19 > ~arg5; ++var19) {
                        if (arg7[-arg3 + var19][-arg4 + var16]) {
                            short[] var20 = this.field3671[var18];
                            if (var20 != null) {
                                for (int var21 = 0; var21 < var20.length; ++var21) {
                                    ++var9;
                                    var10.method1446(var20[var21] & 65535, true);
                                }
                            }
                        }
                        ++var18;
                    }
                }
            }
            if (~var9 < -1) {
                class579 var17 = new class579(this.field3656, 5123, var10.field2912, var10.field2903);
                this.field3656.method2593(4, var9, var17, (byte) -9, 0);
            }
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(BILmt;I)V")
    private final void method1764(byte arg0, int arg1, class396 arg2, int arg3) {
        int var5 = -13 % ((arg0 - 24) / 53);
        ++field3645;
        int[] var6 = this.field3643[arg3][arg1];
        int[] var7 = this.field3650[arg3][arg1];
        int var8 = var6.length;
        if (var8 > this.field3656.field6064.length) {
            this.field3656.field6063 = new int[var8];
            this.field3656.field6064 = new int[var8];
        }
        int[] var9 = this.field3656.field6064;
        int[] var10 = this.field3656.field6063;
        for (int var11 = 0; ~var8 < ~var11; ++var11) {
            var9[var11] = var6[var11] >> this.field3656.field5920;
            var10[var11] = var7[var11] >> this.field3656.field5920;
        }
        int var12 = 0;
        while (var12 < var8) {
            int var13 = var9[var12];
            int var14 = var10[var12++];
            int var15 = var9[var12];
            int var16 = var10[var12++];
            int var17 = var9[var12];
            int var18 = var10[var12++];
            if (~((var13 - var15) * (-var18 + var16) + -((var17 - var15) * (-var14 + var16))) < -1) {
                arg2.method2429(var17, 0, var18, var14, var15, var13, var16);
            }
        }
    }

    @OriginalMember(owner = "client!eo", name = "YA", descriptor = "()V")
    public final void method1674() {
        ++field3658;
        if (~this.field3682 < -1) {
            byte[][] var1 = new byte[super.field3410 + 1][super.field3408 + 1];
            for (int var2 = 1; var2 < super.field3410; ++var2) {
                for (int var103 = 1; super.field3408 > var103; ++var103) {
                    var1[var2][var103] = (byte) ((this.field3680[var2][var103 + 1] >> 3) + (this.field3680[var2][var103 + -1] >> 2) + (this.field3680[var2 + -1][var103] >> 2) + (this.field3680[var2 + 1][var103] >> 3) + (this.field3680[var2][var103] >> 1));
                }
            }
            this.field3688 = new class520[this.field3684.method1752(0)];
            this.field3684.method1750(this.field3688, 0);
            for (int var3 = 0; this.field3688.length > var3; ++var3) {
                this.field3688[var3].method3053(this.field3682, 4);
            }
            int var4 = 24;
            if (this.field3667 != null) {
                var4 += 4;
            }
            if (~(this.field3678 & 7) != -1) {
                var4 += 12;
            }
            NativeHeapBuffer var5 = this.field3656.field5918.method3806(this.field3682 * var4, false);
            Stream var6 = new Stream(var5);
            class520[] var7 = new class520[this.field3682];
            int var8 = class687.method3886(80, this.field3682 / 4);
            if (~var8 > -2) {
                var8 = 1;
            }
            class295 var9 = new class295(var8);
            class520[] var10 = new class520[this.field3691];
            for (int var11 = 0; ~var11 > ~super.field3410; ++var11) {
                for (int var30 = 0; ~super.field3408 < ~var30; ++var30) {
                    if (this.field3676[var11][var30] != null) {
                        class520[] var31 = this.field3649[var11][var30];
                        int[] var32 = this.field3643[var11][var30];
                        int[] var33 = this.field3650[var11][var30];
                        int[] var34 = this.field3675[var11][var30];
                        int[] var35 = this.field3676[var11][var30];
                        int[] var36 = this.field3647 != null ? this.field3647[var11][var30] : null;
                        int[] var37 = this.field3667 == null ? null : this.field3667[var11][var30];
                        if (var34 == null) {
                            var34 = var35;
                        }
                        float var38 = this.field3687[var11][var30];
                        float var39 = this.field3690[var11][var30];
                        float var40 = this.field3681[var11][var30];
                        float var41 = this.field3687[var11][var30 + 1];
                        float var42 = this.field3690[var11][var30 + 1];
                        float var43 = this.field3681[var11][var30 + 1];
                        float var44 = this.field3687[var11 + 1][var30 - -1];
                        float var45 = this.field3690[var11 + 1][var30 - -1];
                        float var46 = this.field3681[var11 + 1][var30 + 1];
                        float var47 = this.field3687[var11 + 1][var30];
                        float var48 = this.field3690[var11 + 1][var30];
                        float var49 = this.field3681[var11 - -1][var30];
                        int var50 = 255 & var1[var11][var30];
                        int var51 = 255 & var1[var11][var30 + 1];
                        int var52 = 255 & var1[var11 + 1][var30 + 1];
                        int var53 = 255 & var1[var11 + 1][var30];
                        int var54 = 0;
                        label338: for (int var55 = 0; var55 < var35.length; ++var55) {
                            class520 var101 = var31[var55];
                            for (int var102 = 0; ~var54 < ~var102; ++var102) {
                                if (var10[var102] == var101) {
                                    continue label338;
                                }
                            }
                            var10[var54++] = var101;
                        }
                        short[] var56 = this.field3671[super.field3410 * var30 + var11] = new short[var35.length];
                        for (int var57 = 0; var57 < var35.length; ++var57) {
                            int var58 = (var11 << super.field3409) + var32[var57];
                            int var59 = (var30 << super.field3409) + var33[var57];
                            int var60 = var58 >> this.field3642;
                            int var61 = var59 >> this.field3642;
                            int var62 = var35[var57];
                            int var63 = var34[var57];
                            int var64 = var36 != null ? var36[var57] : 0;
                            long var65 = (long) var61 | (long) (var60 << 16) | (long) var63 << 48 | (long) var62 << 32;
                            int var67 = var32[var57];
                            int var68 = var33[var57];
                            byte var69 = 74;
                            int var70 = 0;
                            float var71;
                            int var72;
                            float var73;
                            float var74;
                            if (var67 == 0 && var68 == 0) {
                                var71 = var40;
                                var72 = var69 - var50;
                                var73 = var38;
                                var74 = var39;
                            } else if (~var67 == -1 && ~super.field3413 == ~var68) {
                                var71 = var43;
                                var72 = var69 - var51;
                                var74 = var42;
                                var73 = var41;
                            } else if (~super.field3413 == ~var67 && ~super.field3413 == ~var68) {
                                var74 = var45;
                                var72 = var69 - var52;
                                var71 = var46;
                                var73 = var44;
                            } else if (~super.field3413 == ~var67 && var68 == 0) {
                                var71 = var49;
                                var74 = var48;
                                var72 = var69 - var53;
                                var73 = var47;
                            } else {
                                float var75 = (float) var67 / (float) super.field3413;
                                float var76 = (float) var68 / (float) super.field3413;
                                float var77 = (var47 - var38) * var75 + var38;
                                float var78 = (var48 - var39) * var75 + var39;
                                float var79 = (-var40 + var49) * var75 + var40;
                                float var80 = (-var41 + var44) * var75 + var41;
                                float var81 = (-var42 + var45) * var75 + var42;
                                var73 = (var80 - var77) * var76 + var77;
                                float var82 = (var46 - var43) * var75 + var43;
                                var74 = (var81 - var78) * var76 + var78;
                                var71 = (var82 - var79) * var76 + var79;
                                int var83 = var50 - -((-var50 + var53) * var67 >> super.field3409);
                                int var84 = ((-var51 + var52) * var67 >> super.field3409) + var51;
                                var72 = var69 - (((-var83 + var84) * var68 >> super.field3409) + var83);
                            }
                            float var85 = 1.0F;
                            if (var62 != -1) {
                                int var86 = (127 & var62) * var72 >> 7;
                                if (var86 >= 2) {
                                    if (var86 > 126) {
                                        var86 = 126;
                                    }
                                } else {
                                    var86 = 2;
                                }
                                var70 = class721.field10115[var86 | 65408 & var62];
                                if (~(7 & this.field3678) == -1) {
                                    float var87 = this.field3656.field6003[2] * var71 + this.field3656.field6003[0] * var73 + this.field3656.field6003[1] * var74;
                                    var85 = this.field3656.field6058 + var87 * (!(var87 > 0.0F) ? this.field3656.field6038 : this.field3656.field6029);
                                }
                            }
                            class134 var88 = null;
                            if ((this.field3666 - 1 & var58) == 0 && (var59 & this.field3666 + -1) == 0) {
                                var88 = var9.method1754(false, var65);
                            }
                            int var99;
                            if (var88 == null) {
                                int var89;
                                if (var62 == var63) {
                                    var89 = var70;
                                } else {
                                    int var90 = (127 & var63) * var72 >> 7;
                                    if (~var90 <= -3) {
                                        if (~var90 < -127) {
                                            var90 = 126;
                                        }
                                    } else {
                                        var90 = 2;
                                    }
                                    var89 = class721.field10115[var63 & 65408 | var90];
                                    if ((7 & this.field3678) == 0) {
                                        float var91 = this.field3656.field6003[2] * var71 + this.field3656.field6003[1] * var74 + this.field3656.field6003[0] * var73;
                                        float var92 = this.field3656.field6058 + (var85 > 0.0F ? this.field3656.field6029 : this.field3656.field6038) * var85;
                                        int var93 = (16722604 & var89) >> 16;
                                        int var94 = (65524 & var89) >> 8;
                                        int var95 = var89 & 255;
                                        int var96 = (int) ((float) var93 * var92);
                                        if (var96 < 0) {
                                            var96 = 0;
                                        } else if (var96 > 255) {
                                            var96 = 255;
                                        }
                                        int var97 = (int) ((float) var94 * var92);
                                        if (~var97 > -1) {
                                            var97 = 0;
                                        } else if (~var97 < -256) {
                                            var97 = 255;
                                        }
                                        int var98 = (int) ((float) var95 * var92);
                                        if (var98 >= 0) {
                                            if (~var98 < -256) {
                                                var98 = 255;
                                            }
                                        } else {
                                            var98 = 0;
                                        }
                                        var89 = var98 | var96 << 16 | var97 << 8;
                                    }
                                }
                                if (!this.field3656.field5992) {
                                    var6.method3815((float) var58);
                                    var6.method3815((float) (var64 + this.method1675(var59, var58, 65286)));
                                    var6.method3815((float) var59);
                                    var6.method3814((byte) (var89 >> 16));
                                    var6.method3814((byte) (var89 >> 8));
                                    var6.method3814((byte) var89);
                                    var6.method3814(-1);
                                    var6.method3815((float) var58);
                                    var6.method3815((float) var59);
                                    if (this.field3667 != null) {
                                        var6.method3815((float) (var37 == null ? 0 : var37[var57] + -1));
                                    }
                                    if ((this.field3678 & 7) != 0) {
                                        var6.method3815(var73);
                                        var6.method3815(var74);
                                        var6.method3815(var71);
                                    }
                                } else {
                                    var6.method3810((float) var58);
                                    var6.method3810((float) (var64 + this.method1675(var59, var58, 65286)));
                                    var6.method3810((float) var59);
                                    var6.method3814((byte) (var89 >> 16));
                                    var6.method3814((byte) (var89 >> 8));
                                    var6.method3814((byte) var89);
                                    var6.method3814(-1);
                                    var6.method3810((float) var58);
                                    var6.method3810((float) var59);
                                    if (this.field3667 != null) {
                                        var6.method3810((float) (var37 == null ? 0 : var37[var57] + -1));
                                    }
                                    if (~(7 & this.field3678) != -1) {
                                        var6.method3810(var73);
                                        var6.method3810(var74);
                                        var6.method3810(var71);
                                    }
                                }
                                var99 = this.field3657++;
                                var56[var57] = (short) var99;
                                if (~var62 != 0) {
                                    var7[var99] = var31[var57];
                                }
                                var9.method1751(new class595(var56[var57]), 3970, var65);
                            } else {
                                var56[var57] = ((class595) var88).field8395;
                                var99 = var56[var57] & 65535;
                                if (~var62 != 0 && ~var7[var99].field1522 < ~var31[var57].field1522) {
                                    var7[var99] = var31[var57];
                                }
                            }
                            for (int var100 = 0; ~var54 < ~var100; ++var100) {
                                var10[var100].method3055(var70, var72, -1609616944, var85, var99);
                            }
                            ++this.field3673;
                        }
                    }
                }
            }
            for (int var12 = 0; var12 < this.field3657; ++var12) {
                class520 var29 = var7[var12];
                if (var29 != null) {
                    var29.method3057(var12, true);
                }
            }
            for (int var13 = 0; var13 < super.field3410; ++var13) {
                for (int var18 = 0; super.field3408 > var18; ++var18) {
                    short[] var19 = this.field3671[super.field3410 * var18 - -var13];
                    if (var19 != null) {
                        int var20 = 0;
                        int var21 = 0;
                        while (var19.length > var21) {
                            int var22 = var19[var21++] & 65535;
                            int var23 = var19[var21++] & 65535;
                            int var24 = var19[var21++] & 65535;
                            class520 var25 = var7[var22];
                            class520 var26 = var7[var23];
                            class520 var27 = var7[var24];
                            class520 var28 = null;
                            if (var25 != null) {
                                var25.method3054(var20, 65535, var13, var18);
                                var28 = var25;
                            }
                            if (var26 != null) {
                                var26.method3054(var20, 65535, var13, var18);
                                if (var28 == null || ~var26.field1522 > ~var28.field1522) {
                                    var28 = var26;
                                }
                            }
                            if (var27 != null) {
                                var27.method3054(var20, 65535, var13, var18);
                                if (var28 == null || var27.field1522 < var28.field1522) {
                                    var28 = var27;
                                }
                            }
                            if (var28 != null) {
                                if (var25 != null) {
                                    var28.method3057(var22, true);
                                }
                                if (var26 != null) {
                                    var28.method3057(var23, true);
                                }
                                if (var27 != null) {
                                    var28.method3057(var24, true);
                                }
                                var28.method3054(var20, 65535, var13, var18);
                            }
                            ++var20;
                        }
                    }
                }
            }
            var6.method3821();
            this.field3689 = this.field3656.method2607(var4, false, var6.method3809(), var5, (byte) -47);
            this.field3683 = new class704(this.field3689, 5126, 3, 0);
            this.field3679 = new class704(this.field3689, 5121, 4, 12);
            byte var14;
            if (this.field3667 == null) {
                this.field3685 = new class704(this.field3689, 5126, 2, 16);
                var14 = 24;
            } else {
                var14 = 28;
                this.field3685 = new class704(this.field3689, 5126, 3, 16);
            }
            if (~(this.field3678 & 7) != -1) {
                this.field3686 = new class704(this.field3689, 5126, 3, var14);
            }
            long[] var15 = new long[this.field3688.length];
            for (int var16 = 0; var16 < this.field3688.length; ++var16) {
                class520 var17 = this.field3688[var16];
                var15[var16] = var17.field1522;
                var17.method3050(44, this.field3657);
            }
            class158.method975(-1, this.field3688, var15);
            if (this.field3669 != null) {
                this.field3669.method3425(false);
            }
        } else {
            this.field3669 = null;
        }
        this.field3684 = null;
        this.field3676 = null;
        this.field3687 = this.field3690 = this.field3681 = null;
        this.field3667 = null;
        this.field3680 = null;
        this.field3643 = this.field3650 = null;
        this.field3675 = null;
        this.field3649 = null;
        this.field3647 = null;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIBZIII[[Z)V")
    private final void method1765(int arg0, int arg1, byte arg2, boolean arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field3652;
        if (arg2 <= 15) {
            this.method1673(88, -3, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, 43, 123, -75, false);
        }
        if (this.field3688 != null) {
            int var9 = arg1 + arg1 + 1;
            int var10 = var9 * var9;
            if (~this.field3656.field6062.length > ~var10) {
                this.field3656.field6062 = new int[var10];
            }
            if (this.field3673 * 2 > this.field3656.field6059.field2912.length) {
                this.field3656.field6059 = new class685(this.field3673 * 2);
            }
            int var11 = -arg1 + arg0;
            int var12 = var11;
            if (~var11 > -1) {
                var11 = 0;
            }
            int var13 = arg6 - arg1;
            int var14 = var13;
            if (~var13 > -1) {
                var13 = 0;
            }
            int var15 = arg0 + arg1;
            if (var15 > super.field3410 + -1) {
                var15 = super.field3410 + -1;
            }
            int var16 = arg1 + arg6;
            if (super.field3408 + -1 < var16) {
                var16 = super.field3408 - 1;
            }
            int var17 = 0;
            int[] var18 = this.field3656.field6062;
            for (int var19 = var11; var15 >= var19; ++var19) {
                boolean[] var25 = arg7[var19 - var12];
                for (int var26 = var13; ~var16 <= ~var26; ++var26) {
                    if (var25[-var14 + var26]) {
                        var18[var17++] = super.field3410 * var26 + var19;
                    }
                }
            }
            if (arg4 != -1) {
                this.field3656.method2574((float) arg4, true);
                this.field3656.method2557((byte) -57);
            } else {
                this.field3656.method2566(1);
            }
            this.field3656.method2625((byte) 87, ~(7 & this.field3678) != -1);
            for (int var20 = 0; ~var20 > ~this.field3688.length; ++var20) {
                this.field3688[var20].method3056(var17, -16530, var18);
            }
            if (!this.field3653.method1717((byte) 28)) {
                int var21 = this.field3656.field6014;
                int var22 = this.field3656.field6012;
                this.field3656.method342(0, var22, this.field3656.field6060);
                this.field3656.method2625((byte) 76, false);
                this.field3656.method2556(false, -120);
                this.field3656.method2606(128, -24754);
                this.field3656.method2624(-2, 2);
                this.field3656.method2621(-2, this.field3656.field6008);
                this.field3656.method2558(8448, 0, 7681);
                this.field3656.method2626(8960, 770, 0, 34166);
                this.field3656.method2630(34166, 0, 770, 34167);
                for (class134 var23 = this.field3653.method1719(65280); var23 != null; var23 = this.field3653.method1723(-20665)) {
                    class314 var24 = (class314) var23;
                    var24.method1867(arg6, arg1, (byte) 6, arg0, arg7);
                }
                this.field3656.method2626(8960, 768, 0, 5890);
                this.field3656.method2630(34166, 0, 770, 5890);
                this.field3656.method2621(-2, (class292) null);
                this.field3656.method342(var21, var22, this.field3656.field6060);
            }
            if (this.field3669 != null) {
                OpenGL.glPushMatrix();
                OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
                this.field3656.method2589((class704) null, (class704) null, this.field3685, false, this.field3683);
                this.field3669.method3419(arg1, arg3, arg6, arg7, arg0, -1);
                OpenGL.glPopMatrix();
                return;
            }
        }
    }
}
