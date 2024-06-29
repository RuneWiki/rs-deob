import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class707 extends class282 {

    @OriginalMember(owner = "client!ed", name = "V", descriptor = "Lfh;")
    private class653 field9814 = new class653();

    @OriginalMember(owner = "client!ed", name = "W", descriptor = "Lbi;")
    public class483 field9815;

    @OriginalMember(owner = "client!ed", name = "M", descriptor = "I")
    private int field9805;

    @OriginalMember(owner = "client!ed", name = "db", descriptor = "[[F")
    private float[][] field9822;

    @OriginalMember(owner = "client!ed", name = "x", descriptor = "I")
    private int field9790;

    @OriginalMember(owner = "client!ed", name = "S", descriptor = "[[[I")
    public int[][][] field9811;

    @OriginalMember(owner = "client!ed", name = "X", descriptor = "I")
    public int field9816;

    @OriginalMember(owner = "client!ed", name = "t", descriptor = "[[[I")
    private int[][][] field9786;

    @OriginalMember(owner = "client!ed", name = "ob", descriptor = "[[F")
    private float[][] field9833;

    @OriginalMember(owner = "client!ed", name = "mb", descriptor = "[[F")
    private float[][] field9831;

    @OriginalMember(owner = "client!ed", name = "J", descriptor = "[[[Lkw;")
    private class253[][][] field9802;

    @OriginalMember(owner = "client!ed", name = "z", descriptor = "[[[I")
    private int[][][] field9792;

    @OriginalMember(owner = "client!ed", name = "u", descriptor = "[[[I")
    public int[][][] field9787;

    @OriginalMember(owner = "client!ed", name = "U", descriptor = "[[S")
    public short[][] field9813;

    @OriginalMember(owner = "client!ed", name = "I", descriptor = "[[B")
    private byte[][] field9801;

    @OriginalMember(owner = "client!ed", name = "cb", descriptor = "[[B")
    private byte[][] field9821;

    @OriginalMember(owner = "client!ed", name = "P", descriptor = "[[[I")
    public int[][][] field9808;

    @OriginalMember(owner = "client!ed", name = "lb", descriptor = "Ltba;")
    private class165 field9830;

    @OriginalMember(owner = "client!ed", name = "F", descriptor = "Lnr;")
    private class59 field9798;

    @OriginalMember(owner = "client!ed", name = "D", descriptor = "Lhs;")
    public static class329 field9796 = new class329();

    @OriginalMember(owner = "client!ed", name = "q", descriptor = "I")
    public static int field9783;

    @OriginalMember(owner = "client!ed", name = "r", descriptor = "I")
    public static int field9784;

    @OriginalMember(owner = "client!ed", name = "s", descriptor = "I")
    public static int field9785;

    @OriginalMember(owner = "client!ed", name = "v", descriptor = "I")
    public static int field9788;

    @OriginalMember(owner = "client!ed", name = "w", descriptor = "I")
    public static int field9789;

    @OriginalMember(owner = "client!ed", name = "y", descriptor = "I")
    public static int field9791;

    @OriginalMember(owner = "client!ed", name = "A", descriptor = "I")
    public static int field9793;

    @OriginalMember(owner = "client!ed", name = "B", descriptor = "I")
    public static int field9794;

    @OriginalMember(owner = "client!ed", name = "C", descriptor = "I")
    public static int field9795;

    @OriginalMember(owner = "client!ed", name = "E", descriptor = "I")
    public static int field9797;

    @OriginalMember(owner = "client!ed", name = "G", descriptor = "I")
    private int field9799;

    @OriginalMember(owner = "client!ed", name = "H", descriptor = "I")
    public static int field9800;

    @OriginalMember(owner = "client!ed", name = "K", descriptor = "I")
    public static int field9803;

    @OriginalMember(owner = "client!ed", name = "L", descriptor = "I")
    public static int field9804;

    @OriginalMember(owner = "client!ed", name = "N", descriptor = "I")
    public static int field9806;

    @OriginalMember(owner = "client!ed", name = "O", descriptor = "I")
    public static int field9807;

    @OriginalMember(owner = "client!ed", name = "Q", descriptor = "I")
    public static int field9809;

    @OriginalMember(owner = "client!ed", name = "R", descriptor = "I")
    private int field9810;

    @OriginalMember(owner = "client!ed", name = "T", descriptor = "I")
    public static int field9812;

    @OriginalMember(owner = "client!ed", name = "Z", descriptor = "I")
    public static int field9818;

    @OriginalMember(owner = "client!ed", name = "ab", descriptor = "I")
    public static int field9819;

    @OriginalMember(owner = "client!ed", name = "ib", descriptor = "I")
    private int field9827;

    @OriginalMember(owner = "client!ed", name = "nb", descriptor = "I")
    private int field9832;

    @OriginalMember(owner = "client!ed", name = "bb", descriptor = "Lju;")
    private class128 field9820;

    @OriginalMember(owner = "client!ed", name = "eb", descriptor = "Luo;")
    public class578 field9823;

    @OriginalMember(owner = "client!ed", name = "fb", descriptor = "Luo;")
    public class578 field9824;

    @OriginalMember(owner = "client!ed", name = "gb", descriptor = "Luo;")
    public class578 field9825;

    @OriginalMember(owner = "client!ed", name = "jb", descriptor = "Luo;")
    private class578 field9828;

    @OriginalMember(owner = "client!ed", name = "kb", descriptor = "[Lkw;")
    private class253[] field9829;

    @OriginalMember(owner = "client!ed", name = "hb", descriptor = "[Ls;")
    public static class282[] field9826;

    @OriginalMember(owner = "client!ed", name = "Y", descriptor = "[[[I")
    private int[][][] field9817;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)V", line = 7)
    public final void method1678(int arg0, int arg1) {
        ++field9785;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 14)
    public final void method1671(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field9794;
        int var18 = arg9.length;
        int[] var19 = new int[var18 * 3];
        int[] var20 = new int[var18 * 3];
        int[] var21 = new int[var18 * 3];
        int[] var22 = new int[var18 * 3];
        int[] var23 = new int[var18 * 3];
        int[] var24 = new int[var18 * 3];
        int[] var25 = arg3 != null ? new int[var18 * 3] : null;
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
            var22[var27] = arg10 == null ? arg9[var28] : arg10[var28];
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
        this.method1674(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lr;IIIIZ)Z", line = 98)
    public final boolean method1675(class185 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field9800;
        if (this.field9798 != null && arg0 != null) {
            int var7 = -(this.field9815.field6886 * arg2 >> 8) + arg1 >> this.field9815.field6775;
            int var8 = -(this.field9815.field6834 * arg2 >> 8) + arg3 >> this.field9815.field6775;
            return this.field9798.method424(var8, arg0, var7, 100);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ed", name = "wa", descriptor = "(Lr;IIIIZ)V", line = 116)
    public final void method1685(class185 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field9809;
        if (this.field9798 != null && arg0 != null) {
            int var7 = -(this.field9815.field6886 * arg2 >> 8) + arg1 >> this.field9815.field6775;
            int var8 = -(this.field9815.field6834 * arg2 >> 8) + arg3 >> this.field9815.field6775;
            this.field9798.method427(arg0, var8, var7, (byte) -100);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILuu;BI)V", line = 133)
    private final void method3955(int arg0, class289 arg1, byte arg2, int arg3) {
        ++field9804;
        int[] var5 = this.field9787[arg3][arg0];
        int[] var6 = this.field9808[arg3][arg0];
        int var7 = var5.length;
        if (this.field9815.field6925.length < var7) {
            this.field9815.field6927 = new int[var7];
            this.field9815.field6925 = new int[var7];
        }
        int[] var8 = this.field9815.field6925;
        int[] var9 = this.field9815.field6927;
        for (int var10 = 0; ~var10 > ~var7; ++var10) {
            var8[var10] = var5[var10] >> this.field9815.field6775;
            var9[var10] = var6[var10] >> this.field9815.field6775;
        }
        int var11 = 0;
        if (arg2 != 12) {
            this.method1675((class185) null, 17, 39, 59, -89, true);
        }
        while (~var7 < ~var11) {
            int var12 = var8[var11];
            int var13 = var9[var11++];
            int var14 = var8[var11];
            int var15 = var9[var11++];
            int var16 = var8[var11];
            int var17 = var9[var11++];
            if ((-var14 + var12) * (-var17 + var15) - (-var13 + var15) * (-var14 + var16) > 0) {
                arg1.method1730(var14, var16, var15, false, var17, var12, var13);
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "CA", descriptor = "(Lr;IIIIZ)V", line = 195)
    public final void method1684(class185 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field9791;
        if (this.field9798 != null && arg0 != null) {
            int var7 = -(this.field9815.field6886 * arg2 >> 8) + arg1 >> this.field9815.field6775;
            int var8 = -(this.field9815.field6834 * arg2 >> 8) + arg3 >> this.field9815.field6775;
            this.field9798.method430(var8, 5123, var7, arg0);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZI)V", line = 213)
    public static final void method3956(boolean arg0, int arg1) {
        class526.field7351 = arg1;
        if (!arg0) {
            method3959((byte) 36, (class461) null);
        }
        ++field9788;
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Lbi;IIII[[I[[II)V", line = 224)
    public class707(class483 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field9815 = arg0;
        this.field9805 = super.field3550 + -2;
        this.field9822 = new float[super.field3561 + 1][super.field3555 + 1];
        this.field9790 = 1 << this.field9805;
        this.field9811 = new int[arg3][arg4][];
        this.field9816 = arg2;
        this.field9786 = new int[arg3][arg4][];
        this.field9833 = new float[super.field3561 + 1][super.field3555 + 1];
        this.field9831 = new float[super.field3561 - -1][super.field3555 + 1];
        this.field9802 = new class253[arg3][arg4][];
        this.field9792 = new int[arg3][arg4][];
        this.field9787 = new int[arg3][arg4][];
        this.field9813 = new short[arg3 * arg4][];
        this.field9801 = new byte[arg3][arg4];
        this.field9821 = new byte[arg3 + 1][arg4 + 1];
        this.field9808 = new int[arg3][arg4][];
        for (int var9 = 1; super.field3555 > var9; ++var9) {
            for (int var10 = 1; var10 < super.field3561; ++var10) {
                int var11 = arg6[var10 + 1][var9] - arg6[var10 + -1][var9];
                int var12 = arg6[var10][var9 - -1] - arg6[var10][var9 + -1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + arg7 * 4 * arg7 + var11 * var11)));
                this.field9822[var10][var9] = (float) var11 * var13;
                this.field9833[var10][var9] = (float) (-arg7 * 2) * var13;
                this.field9831[var10][var9] = (float) var12 * var13;
            }
        }
        this.field9830 = new class165(128);
        if ((this.field9816 & 16) != 0) {
            this.field9798 = new class59(this.field9815, this);
        }
    }

    @OriginalMember(owner = "client!ed", name = "YA", descriptor = "()V", line = 284)
    public final void method1673() {
        ++field9783;
        if (this.field9827 <= 0) {
            this.field9798 = null;
        } else {
            byte[][] var1 = new byte[super.field3561 - -1][super.field3555 + 1];
            for (int var2 = 1; var2 < super.field3561; ++var2) {
                for (int var103 = 1; ~super.field3555 < ~var103; ++var103) {
                    var1[var2][var103] = (byte) ((this.field9821[var2][var103 + -1] >> 2) + (this.field9821[var2 - 1][var103] >> 2) + (this.field9821[var2 - -1][var103] >> 3) + (this.field9821[var2][var103 + 1] >> 3) + (this.field9821[var2][var103] >> 1));
                }
            }
            this.field9829 = new class253[this.field9830.method1159((byte) -106)];
            this.field9830.method1152(this.field9829, 32260);
            for (int var3 = 0; var3 < this.field9829.length; ++var3) {
                this.field9829[var3].method1553(this.field9827, -15936);
            }
            int var4 = 24;
            if (this.field9817 != null) {
                var4 += 4;
            }
            if (~(7 & this.field9816) != -1) {
                var4 += 12;
            }
            NativeHeapBuffer var5 = this.field9815.field6778.method3781(this.field9827 * var4, false);
            Stream var6 = new Stream(var5);
            class253[] var7 = new class253[this.field9827];
            int var8 = class113.method890(this.field9827 / 4, 2094889633);
            if (~var8 > -2) {
                var8 = 1;
            }
            class165 var9 = new class165(var8);
            class253[] var10 = new class253[this.field9832];
            for (int var11 = 0; super.field3561 > var11; ++var11) {
                for (int var30 = 0; ~var30 > ~super.field3555; ++var30) {
                    if (this.field9811[var11][var30] != null) {
                        class253[] var31 = this.field9802[var11][var30];
                        int[] var32 = this.field9787[var11][var30];
                        int[] var33 = this.field9808[var11][var30];
                        int[] var34 = this.field9786[var11][var30];
                        int[] var35 = this.field9811[var11][var30];
                        int[] var36 = this.field9792 == null ? null : this.field9792[var11][var30];
                        if (var34 == null) {
                            var34 = var35;
                        }
                        int[] var37 = this.field9817 == null ? null : this.field9817[var11][var30];
                        float var38 = this.field9822[var11][var30];
                        float var39 = this.field9833[var11][var30];
                        float var40 = this.field9831[var11][var30];
                        float var41 = this.field9822[var11][var30 + 1];
                        float var42 = this.field9833[var11][var30 - -1];
                        float var43 = this.field9831[var11][var30 + 1];
                        float var44 = this.field9822[var11 + 1][var30 + 1];
                        float var45 = this.field9833[var11 - -1][var30 + 1];
                        float var46 = this.field9831[var11 + 1][var30 + 1];
                        float var47 = this.field9822[var11 + 1][var30];
                        float var48 = this.field9833[var11 - -1][var30];
                        float var49 = this.field9831[var11 - -1][var30];
                        int var50 = 255 & var1[var11][var30];
                        int var51 = var1[var11][var30 + 1] & 255;
                        int var52 = var1[var11 + 1][var30 + 1] & 255;
                        int var53 = 255 & var1[var11 + 1][var30];
                        int var54 = 0;
                        label337: for (int var55 = 0; ~var35.length < ~var55; ++var55) {
                            class253 var101 = var31[var55];
                            for (int var102 = 0; ~var102 > ~var54; ++var102) {
                                if (var10[var102] == var101) {
                                    continue label337;
                                }
                            }
                            var10[var54++] = var101;
                        }
                        short[] var56 = this.field9813[super.field3561 * var30 + var11] = new short[var35.length];
                        for (int var57 = 0; var57 < var35.length; ++var57) {
                            int var58 = (var11 << super.field3550) + var32[var57];
                            int var59 = (var30 << super.field3550) - -var33[var57];
                            int var60 = var58 >> this.field9805;
                            int var61 = var59 >> this.field9805;
                            int var62 = var35[var57];
                            int var63 = var34[var57];
                            int var64 = var36 == null ? 0 : var36[var57];
                            long var65 = (long) var61 | (long) (var60 << 16) | (long) var63 << 48 | (long) var62 << 32;
                            int var67 = var32[var57];
                            int var68 = var33[var57];
                            byte var69 = 74;
                            int var70 = 0;
                            float var71;
                            int var72;
                            float var73;
                            float var74;
                            if (~var67 == -1 && ~var68 == -1) {
                                var71 = var39;
                                var72 = var69 - var50;
                                var73 = var40;
                                var74 = var38;
                            } else if (~var67 == -1 && super.field3557 == var68) {
                                var71 = var42;
                                var72 = var69 - var51;
                                var73 = var43;
                                var74 = var41;
                            } else if (super.field3557 == var67 && super.field3557 == var68) {
                                var74 = var44;
                                var71 = var45;
                                var73 = var46;
                                var72 = var69 - var52;
                            } else if (~super.field3557 == ~var67 && var68 == 0) {
                                var72 = var69 - var53;
                                var71 = var48;
                                var74 = var47;
                                var73 = var49;
                            } else {
                                float var75 = (float) var67 / (float) super.field3557;
                                float var76 = (float) var68 / (float) super.field3557;
                                float var77 = (-var38 + var47) * var75 + var38;
                                float var78 = (-var39 + var48) * var75 + var39;
                                float var79 = (-var40 + var49) * var75 + var40;
                                float var80 = (var44 - var41) * var75 + var41;
                                float var81 = (var45 - var42) * var75 + var42;
                                var74 = (var80 - var77) * var76 + var77;
                                float var82 = (var46 - var43) * var75 + var43;
                                var71 = (-var78 + var81) * var76 + var78;
                                var73 = (-var79 + var82) * var76 + var79;
                                int var83 = ((-var50 + var53) * var67 >> super.field3550) + var50;
                                int var84 = var51 - -((-var51 + var52) * var67 >> super.field3550);
                                var72 = var69 - (((var84 - var83) * var68 >> super.field3550) + var83);
                            }
                            float var85 = 1.0F;
                            if (var62 != -1) {
                                int var86 = (var62 & 127) * var72 >> 7;
                                if (~var86 > -3) {
                                    var86 = 2;
                                } else if (~var86 < -127) {
                                    var86 = 126;
                                }
                                var70 = class267.field3365[var86 | 65408 & var62];
                                if ((this.field9816 & 7) == 0) {
                                    float var87 = this.field9815.field6871[2] * var73 + this.field9815.field6871[1] * var71 + this.field9815.field6871[0] * var74;
                                    var85 = this.field9815.field6835 + var87 * (!(var87 > 0.0F) ? this.field9815.field6848 : this.field9815.field6919);
                                }
                            }
                            class168 var88 = null;
                            if ((var58 & this.field9790 + -1) == 0 && ~(this.field9790 + -1 & var59) == -1) {
                                var88 = var9.method1160(var65, 120);
                            }
                            int var89;
                            if (var88 != null) {
                                var56[var57] = ((class273) var88).field3422;
                                var89 = var56[var57] & 65535;
                                if (~var62 != 0 && ~var31[var57].field2333 > ~var7[var89].field2333) {
                                    var7[var89] = var31[var57];
                                }
                            } else {
                                int var91;
                                if (~var62 != ~var63) {
                                    int var90 = (var63 & 127) * var72 >> 7;
                                    if (var90 >= 2) {
                                        if (var90 > 126) {
                                            var90 = 126;
                                        }
                                    } else {
                                        var90 = 2;
                                    }
                                    var91 = class267.field3365[65408 & var63 | var90];
                                    if (~(7 & this.field9816) == -1) {
                                        float var92 = this.field9815.field6871[2] * var73 + this.field9815.field6871[0] * var74 + this.field9815.field6871[1] * var71;
                                        float var93 = this.field9815.field6835 + var85 * (var85 > 0.0F ? this.field9815.field6919 : this.field9815.field6848);
                                        int var94 = (16750628 & var91) >> 16;
                                        int var95 = (65371 & var91) >> 8;
                                        int var96 = (int) ((float) var94 * var93);
                                        int var97 = 255 & var91;
                                        if (~var96 > -1) {
                                            var96 = 0;
                                        } else if (var96 > 255) {
                                            var96 = 255;
                                        }
                                        int var98 = (int) ((float) var95 * var93);
                                        if (~var98 <= -1) {
                                            if (var98 > 255) {
                                                var98 = 255;
                                            }
                                        } else {
                                            var98 = 0;
                                        }
                                        int var99 = (int) ((float) var97 * var93);
                                        if (var99 < 0) {
                                            var99 = 0;
                                        } else if (var99 > 255) {
                                            var99 = 255;
                                        }
                                        var91 = var99 | var98 << 8 | var96 << 16;
                                    }
                                } else {
                                    var91 = var70;
                                }
                                if (this.field9815.field6903) {
                                    var6.method3796((float) var58);
                                    var6.method3796((float) (var64 + this.method1676(var58, true, var59)));
                                    var6.method3796((float) var59);
                                    var6.method3792((byte) (var91 >> 16));
                                    var6.method3792((byte) (var91 >> 8));
                                    var6.method3792((byte) var91);
                                    var6.method3792(-1);
                                    var6.method3796((float) var58);
                                    var6.method3796((float) var59);
                                    if (this.field9817 != null) {
                                        var6.method3796((float) (var37 == null ? 0 : var37[var57] + -1));
                                    }
                                    if (~(7 & this.field9816) != -1) {
                                        var6.method3796(var74);
                                        var6.method3796(var71);
                                        var6.method3796(var73);
                                    }
                                } else {
                                    var6.method3794((float) var58);
                                    var6.method3794((float) (this.method1676(var58, true, var59) + var64));
                                    var6.method3794((float) var59);
                                    var6.method3792((byte) (var91 >> 16));
                                    var6.method3792((byte) (var91 >> 8));
                                    var6.method3792((byte) var91);
                                    var6.method3792(-1);
                                    var6.method3794((float) var58);
                                    var6.method3794((float) var59);
                                    if (this.field9817 != null) {
                                        var6.method3794((float) (var37 == null ? 0 : var37[var57] + -1));
                                    }
                                    if ((this.field9816 & 7) != 0) {
                                        var6.method3794(var74);
                                        var6.method3794(var71);
                                        var6.method3794(var73);
                                    }
                                }
                                var89 = this.field9799++;
                                var56[var57] = (short) var89;
                                if (~var62 != 0) {
                                    var7[var89] = var31[var57];
                                }
                                var9.method1153(new class273(var56[var57]), var65, -1);
                            }
                            for (int var100 = 0; var54 > var100; ++var100) {
                                var10[var100].method1551(var70, var72, 109, var89, var85);
                            }
                            ++this.field9810;
                        }
                    }
                }
            }
            for (int var12 = 0; ~this.field9799 < ~var12; ++var12) {
                class253 var29 = var7[var12];
                if (var29 != null) {
                    var29.method1550((byte) 125, var12);
                }
            }
            for (int var13 = 0; super.field3561 > var13; ++var13) {
                for (int var18 = 0; super.field3555 > var18; ++var18) {
                    short[] var19 = this.field9813[super.field3561 * var18 - -var13];
                    if (var19 != null) {
                        int var20 = 0;
                        int var21 = 0;
                        while (~var21 > ~var19.length) {
                            int var22 = 65535 & var19[var21++];
                            int var23 = 65535 & var19[var21++];
                            int var24 = var19[var21++] & 65535;
                            class253 var25 = var7[var22];
                            class253 var26 = var7[var23];
                            class253 var27 = var7[var24];
                            class253 var28 = null;
                            if (var25 != null) {
                                var28 = var25;
                                var25.method1552(var18, var20, 0, var13);
                            }
                            if (var26 != null) {
                                var26.method1552(var18, var20, 0, var13);
                                if (var28 == null || var28.field2333 > var26.field2333) {
                                    var28 = var26;
                                }
                            }
                            if (var27 != null) {
                                var27.method1552(var18, var20, 0, var13);
                                if (var28 == null || ~var27.field2333 > ~var28.field2333) {
                                    var28 = var27;
                                }
                            }
                            if (var28 != null) {
                                if (var25 != null) {
                                    var28.method1550((byte) -81, var22);
                                }
                                if (var26 != null) {
                                    var28.method1550((byte) 127, var23);
                                }
                                if (var27 != null) {
                                    var28.method1550((byte) 126, var24);
                                }
                                var28.method1552(var18, var20, 0, var13);
                            }
                            ++var20;
                        }
                    }
                }
            }
            var6.method3793();
            this.field9820 = this.field9815.method2810(var4, var5, false, var6.method3790(), false);
            this.field9824 = new class578(this.field9820, 5126, 3, 0);
            this.field9828 = new class578(this.field9820, 5121, 4, 12);
            byte var14;
            if (this.field9817 == null) {
                this.field9823 = new class578(this.field9820, 5126, 2, 16);
                var14 = 24;
            } else {
                this.field9823 = new class578(this.field9820, 5126, 3, 16);
                var14 = 28;
            }
            if (~(this.field9816 & 7) != -1) {
                this.field9825 = new class578(this.field9820, 5126, 3, var14);
            }
            long[] var15 = new long[this.field9829.length];
            for (int var16 = 0; var16 < this.field9829.length; ++var16) {
                class253 var17 = this.field9829[var16];
                var15[var16] = var17.field2333;
                var17.method1548(this.field9799, 0);
            }
            class179.method1222(var15, (byte) -15, this.field9829);
            if (this.field9798 != null) {
                this.field9798.method429(1);
            }
        }
        this.field9802 = null;
        this.field9821 = null;
        this.field9822 = this.field9833 = this.field9831 = null;
        this.field9817 = null;
        this.field9787 = this.field9808 = null;
        this.field9786 = null;
        this.field9811 = null;
        this.field9792 = null;
        this.field9830 = null;
    }

    @OriginalMember(owner = "client!ed", name = "ka", descriptor = "(III)V", line = 863)
    public final void method1670(int arg0, int arg1, int arg2) {
        if (arg2 > (255 & this.field9821[arg0][arg1])) {
            this.field9821[arg0][arg1] = (byte) arg2;
        }
        ++field9819;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(III[[ZZI)V", line = 876)
    public final void method1681(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        ++field9803;
        this.method3960(arg2, -1, 72, arg3, arg4, arg0, arg1, arg5);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIIII[[Z)V", line = 884)
    public final void method1688(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field9818;
        if (~this.field9827 < -1) {
            this.field9815.method2785(-1);
            this.field9815.method2789(false, 16160);
            this.field9815.method2776(1, false);
            this.field9815.method2801(-1, false);
            this.field9815.method2816((byte) -86, false);
            this.field9815.method2844(109, 0);
            this.field9815.method2777(-2, 1);
            this.field9815.method2850(94, (class695) null);
            class217.field2932[8] = 0.0F;
            class217.field2932[11] = 0.0F;
            class217.field2932[3] = 0.0F;
            class217.field2932[6] = 0.0F;
            class217.field2932[1] = 0.0F;
            class217.field2932[12] = -(((float) (arg2 * arg3) / 128.0F + (float) (-(arg0 * 2))) / (float) this.field9815.field6681) + -1.0F;
            class217.field2932[2] = 0.0F;
            class217.field2932[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field9815.field6671;
            class217.field2932[15] = 1.0F;
            class217.field2932[4] = 0.0F;
            class217.field2932[5] = (float) arg2 / ((float) super.field3557 * 128.0F * (float) this.field9815.field6671);
            class217.field2932[14] = 0.0F;
            class217.field2932[9] = 0.0F;
            class217.field2932[10] = 0.0F;
            class217.field2932[0] = (float) arg2 / ((float) super.field3557 * 128.0F * (float) this.field9815.field6681);
            class217.field2932[7] = 0.0F;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(class217.field2932, 0);
            class217.field2932[4] = 0.0F;
            class217.field2932[5] = 0.0F;
            class217.field2932[1] = 0.0F;
            class217.field2932[2] = 0.0F;
            class217.field2932[11] = 0.0F;
            class217.field2932[14] = 0.0F;
            class217.field2932[10] = 0.0F;
            class217.field2932[9] = 1.0F;
            class217.field2932[8] = 0.0F;
            class217.field2932[6] = 1.0F;
            class217.field2932[12] = 0.0F;
            class217.field2932[0] = 1.0F;
            class217.field2932[7] = 0.0F;
            class217.field2932[15] = 1.0F;
            class217.field2932[3] = 0.0F;
            class217.field2932[13] = 0.0F;
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadMatrixf(class217.field2932, 0);
            if ((7 & this.field9816) != 0) {
                this.field9815.method2776(1, true);
                this.field9815.method2853(-20561);
            } else {
                this.field9815.method2776(1, false);
            }
            this.field9815.method2821((byte) -48, this.field9825, this.field9824, this.field9828, this.field9823);
            if (~(this.field9810 * 2) < ~this.field9815.field6845.field6180.length) {
                this.field9815.field6845 = new class736(this.field9810 * 2);
            } else {
                this.field9815.field6845.field6193 = 0;
            }
            int var9 = 0;
            class736 var10 = this.field9815.field6845;
            if (this.field9815.field6903) {
                for (int var11 = arg4; var11 < arg6; ++var11) {
                    int var12 = super.field3561 * var11 + arg3;
                    for (int var13 = arg3; arg5 > var13; ++var13) {
                        if (arg7[-arg3 + var13][-arg4 + var11]) {
                            short[] var14 = this.field9813[var12];
                            if (var14 != null) {
                                for (int var15 = 0; var14.length > var15; ++var15) {
                                    var10.method2620(65535 & var14[var15], false);
                                    ++var9;
                                }
                            }
                        }
                        ++var12;
                    }
                }
            } else {
                for (int var16 = arg4; ~var16 > ~arg6; ++var16) {
                    int var18 = super.field3561 * var16 + arg3;
                    for (int var19 = arg3; arg5 > var19; ++var19) {
                        if (arg7[var19 - arg3][var16 - arg4]) {
                            short[] var20 = this.field9813[var18];
                            if (var20 != null) {
                                for (int var21 = 0; var21 < var20.length; ++var21) {
                                    ++var9;
                                    var10.method2619(var20[var21] & 65535, -1);
                                }
                            }
                        }
                        ++var18;
                    }
                }
            }
            if (~var9 < -1) {
                class256 var17 = new class256(this.field9815, 5123, var10.field6180, var10.field6193);
                this.field9815.method2854(4, 0, var9, var17, (byte) -82);
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Llaa;[I)V", line = 1055)
    public final void method1687(class123 arg0, int[] arg1) {
        this.field9814.method3671(new class450(this.field9815, this, arg0, arg1), false);
        ++field9793;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILria;II)V", line = 1065)
    public static final void method3957(int arg0, class288 arg1, int arg2, int arg3) {
        if (arg1.field3640 == 0) {
            arg1.field3635 = arg1.field3683;
        } else if (arg1.field3640 != 1) {
            if (arg1.field3640 == 2) {
                arg1.field3635 = arg3 - arg1.field3683 + -arg1.field3617;
            } else if (~arg1.field3640 == -4) {
                arg1.field3635 = arg1.field3683 * arg3 >> 14;
            } else if (~arg1.field3640 == -5) {
                arg1.field3635 = (arg1.field3683 * arg3 >> 14) + (-arg1.field3617 + arg3) / 2;
            } else {
                arg1.field3635 = -arg1.field3617 + arg3 + -(arg1.field3683 * arg3 >> 14);
            }
        } else {
            arg1.field3635 = (-arg1.field3617 + arg3) / 2 + arg1.field3683;
        }
        ++field9807;
        if (arg1.field3697 != 0) {
            if (arg1.field3697 != 1) {
                if (~arg1.field3697 == -3) {
                    arg1.field3687 = -arg1.field3642 + arg0 - arg1.field3714;
                } else if (arg1.field3697 != 3) {
                    if (arg1.field3697 == 4) {
                        arg1.field3687 = (-arg1.field3714 + arg0) / 2 - -(arg1.field3642 * arg0 >> 14);
                    } else {
                        arg1.field3687 = -arg1.field3714 + arg0 + -(arg1.field3642 * arg0 >> 14);
                    }
                } else {
                    arg1.field3687 = arg1.field3642 * arg0 >> 14;
                }
            } else {
                arg1.field3687 = (-arg1.field3714 + arg0) / 2 - -arg1.field3642;
            }
        } else {
            arg1.field3687 = arg1.field3642;
        }
        if (class711.field9869 && (client.method1833(arg1).field3291 != 0 || ~arg1.field3655 == -1)) {
            if (arg1.field3687 >= 0) {
                if (~arg0 > ~(arg1.field3687 - -arg1.field3714)) {
                    arg1.field3687 = -arg1.field3714 + arg0;
                }
            } else {
                arg1.field3687 = 0;
            }
            if (arg1.field3635 >= 0) {
                if (~arg3 > ~(arg1.field3635 - -arg1.field3617)) {
                    arg1.field3635 = arg3 - arg1.field3617;
                }
            } else {
                arg1.field3635 = 0;
            }
        }
        if (arg2 < 45) {
            method3956(true, -25);
        }
    }

    @OriginalMember(owner = "client!ed", name = "fa", descriptor = "(IILr;)Lr;", line = 1147)
    public final class185 method1672(int arg0, int arg1, class185 arg2) {
        ++field9806;
        if (~(1 & this.field9801[arg0][arg1]) == -1) {
            return null;
        } else {
            int var4 = super.field3557 >> this.field9815.field6775;
            class289 var5 = (class289) arg2;
            class289 var6;
            if (var5 != null && var5.method1733(var4, -2679, var4)) {
                var6 = var5;
                var5.method1731((byte) -117);
            } else {
                var6 = new class289(this.field9815, var4, var4);
            }
            var6.method1734(17655, var4, 0, 0, var4);
            this.method3955(arg1, var6, (byte) 12, arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(I)V", line = 1175)
    public static void method3958(int arg0) {
        field9826 = null;
        field9796 = null;
        int var1 = -100 % ((-42 - arg0) / 46);
    }

    @OriginalMember(owner = "client!ed", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 1195)
    public final void method1674(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        ++field9789;
        if (arg5 != null && this.field9817 == null) {
            this.field9817 = new int[super.field3561][super.field3555][];
        }
        if (arg3 != null && this.field9792 == null) {
            this.field9792 = new int[super.field3561][super.field3555][];
        }
        class153 var15 = this.field9815.field830;
        this.field9787[arg0][arg1] = arg2;
        this.field9808[arg0][arg1] = arg4;
        this.field9811[arg0][arg1] = arg6;
        this.field9786[arg0][arg1] = arg7;
        if (this.field9817 != null) {
            this.field9817[arg0][arg1] = arg5;
        }
        if (this.field9792 != null) {
            this.field9792[arg0][arg1] = arg3;
        }
        class253[] var16 = this.field9802[arg0][arg1] = new class253[arg6.length];
        for (int var17 = 0; ~var17 > ~arg6.length; ++var17) {
            int var18 = arg8[var17];
            int var19 = arg9[var17];
            if (~(32 & this.field9816) != -1 && ~var18 != 0 && var15.method1072(var18, true).field7456) {
                var19 = 128;
                var18 = -1;
            }
            long var20 = (long) (var19 << 14) | (long) arg11 << 42 | (long) arg12 << 48 | (long) arg10 << 28 | (long) var18;
            class168 var22;
            for (var22 = this.field9830.method1160(var20, 120); var22 != null; var22 = this.field9830.method1162(110)) {
                class253 var23 = (class253) var22;
                if (var23.field3221 == var18 && (float) var19 == var23.field3222 && ~var23.field3226 == ~arg10 && var23.field3236 == arg11 && var23.field3233 == arg12) {
                    break;
                }
            }
            if (var22 == null) {
                var16[var17] = new class253(this, var18, var19, arg10, arg11, arg12);
                this.field9830.method1153(var16[var17], var20, -1);
            } else {
                var16[var17] = (class253) var22;
            }
        }
        if (arg13) {
            this.field9801[arg0][arg1] = (byte) class683.method3840(this.field9801[arg0][arg1], 1);
        }
        if (~arg6.length < ~this.field9832) {
            this.field9832 = arg6.length;
        }
        this.field9827 += arg6.length;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BLsl;)Ljg;", line = 1277)
    public static final class342 method3959(byte arg0, class461 arg1) {
        ++field9812;
        if (arg0 >= -75) {
            method3959((byte) -94, (class461) null);
        }
        int var2 = arg1.method2600((byte) -126);
        class91 var3 = class94.method762(1)[arg1.method2600((byte) -123)];
        class599 var4 = class680.method3832(-17399)[arg1.method2600((byte) -126)];
        int var5 = arg1.method2577(2);
        int var6 = arg1.method2577(2);
        int var7 = arg1.method2566(-2);
        int var8 = arg1.method2566(-2);
        int var9 = arg1.method2622(-539564808);
        int var10 = arg1.method2622(-539564808);
        int var11 = arg1.method2622(-539564808);
        boolean var12 = arg1.method2600((byte) -127) == 1;
        return new class342(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(III[[ZZIII)V", line = 1313)
    private final void method3960(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6, int arg7) {
        int var9 = 8 / ((14 - arg2) / 38);
        ++field9784;
        if (this.field9829 != null) {
            int var10 = arg0 + 1 - -arg0;
            int var11 = var10 * var10;
            if (~this.field9815.field6923.length > ~var11) {
                this.field9815.field6923 = new int[var11];
            }
            if (~(this.field9810 * 2) < ~this.field9815.field6845.field6180.length) {
                this.field9815.field6845 = new class736(this.field9810 * 2);
            }
            int var12 = -arg0 + arg5;
            int var13 = var12;
            if (var12 < 0) {
                var12 = 0;
            }
            int var14 = -arg0 + arg6;
            int var15 = var14;
            if (var14 < 0) {
                var14 = 0;
            }
            int var16 = arg0 + arg5;
            if (var16 > super.field3561 + -1) {
                var16 = super.field3561 + -1;
            }
            int var17 = arg0 + arg6;
            if (~var17 < ~(super.field3555 + -1)) {
                var17 = super.field3555 + -1;
            }
            int var18 = 0;
            int[] var19 = this.field9815.field6923;
            for (int var20 = var12; ~var20 >= ~var16; ++var20) {
                boolean[] var26 = arg3[-var13 + var20];
                for (int var27 = var14; ~var27 >= ~var17; ++var27) {
                    if (var26[var27 - var15]) {
                        var19[var18++] = super.field3561 * var27 + var20;
                    }
                }
            }
            if (~arg1 == 0) {
                this.field9815.method2784(-9);
            } else {
                this.field9815.method2808((float) arg1, (byte) 9);
                this.field9815.method2797((byte) -27);
            }
            this.field9815.method2776(1, ~(this.field9816 & 7) != -1);
            for (int var21 = 0; ~var21 > ~this.field9829.length; ++var21) {
                this.field9829[var21].method1549(var18, -9570, var19);
            }
            if (!this.field9814.method3667((byte) -45)) {
                int var22 = this.field9815.field6864;
                int var23 = this.field9815.field6814;
                this.field9815.method457(0, var23, this.field9815.field6858);
                this.field9815.method2776(1, false);
                this.field9815.method2816((byte) -19, false);
                this.field9815.method2844(120, 128);
                this.field9815.method2777(-2, 1);
                this.field9815.method2850(-96, this.field9815.field6873);
                this.field9815.method2799(-27874, 8448, 7681);
                this.field9815.method2775(34166, (byte) -88, 770, 0);
                this.field9815.method2788(770, 34167, false, 0);
                for (class168 var24 = this.field9814.method3672(-1); var24 != null; var24 = this.field9814.method3662(-1)) {
                    class450 var25 = (class450) var24;
                    var25.method2531(arg5, arg6, 15229, arg3, arg0);
                }
                this.field9815.method2775(5890, (byte) -88, 768, 0);
                this.field9815.method2788(770, 5890, false, 0);
                this.field9815.method2850(120, (class695) null);
                this.field9815.method457(var22, var23, this.field9815.field6858);
            }
            if (this.field9798 != null) {
                OpenGL.glPushMatrix();
                OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
                this.field9815.method2821((byte) -48, (class578) null, this.field9824, (class578) null, this.field9823);
                this.field9798.method426(arg3, arg4, -28167, arg6, arg5, arg0);
                OpenGL.glPopMatrix();
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BILria;)I", line = 1454)
    public static final int method3961(byte arg0, int arg1, class288 arg2) {
        ++field9795;
        if (!client.method1833(arg2).method1570(arg1, 0) && arg2.field3695 == null) {
            return -1;
        } else if (arg0 != -51) {
            return -2;
        } else {
            return arg2.field3664 != null && ~arg2.field3664.length < ~arg1 ? arg2.field3664[arg1] : -1;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(III[[ZZII)V", line = 1482)
    public final void method1680(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        this.method3960(arg2, arg5, 112, arg3, arg4, arg0, arg1, arg6);
        ++field9797;
    }
}
