import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class515 extends class223 {

    @OriginalMember(owner = "client!bf", name = "t", descriptor = "I")
    private int field7644 = -1;

    @OriginalMember(owner = "client!bf", name = "z", descriptor = "Lf;")
    private class195 field7650;

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "I")
    private int field7634;

    @OriginalMember(owner = "client!bf", name = "p", descriptor = "[[I")
    public int[][] field7640;

    @OriginalMember(owner = "client!bf", name = "A", descriptor = "[[B")
    private byte[][] field7651;

    @OriginalMember(owner = "client!bf", name = "n", descriptor = "[[B")
    private byte[][] field7638;

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
    private int field7632;

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "I")
    private int field7635;

    @OriginalMember(owner = "client!bf", name = "l", descriptor = "I")
    private int field7636;

    @OriginalMember(owner = "client!bf", name = "m", descriptor = "I")
    private int field7637;

    @OriginalMember(owner = "client!bf", name = "o", descriptor = "I")
    private int field7639;

    @OriginalMember(owner = "client!bf", name = "q", descriptor = "I")
    private int field7641;

    @OriginalMember(owner = "client!bf", name = "r", descriptor = "I")
    private int field7642;

    @OriginalMember(owner = "client!bf", name = "s", descriptor = "I")
    private int field7643;

    @OriginalMember(owner = "client!bf", name = "u", descriptor = "I")
    private int field7645;

    @OriginalMember(owner = "client!bf", name = "w", descriptor = "I")
    private int field7647;

    @OriginalMember(owner = "client!bf", name = "B", descriptor = "I")
    private int field7652;

    @OriginalMember(owner = "client!bf", name = "C", descriptor = "I")
    private int field7653;

    @OriginalMember(owner = "client!bf", name = "x", descriptor = "[[Lka;")
    private class157[][] field7648;

    @OriginalMember(owner = "client!bf", name = "v", descriptor = "[[Lti;")
    private class374[][] field7646;

    @OriginalMember(owner = "client!bf", name = "y", descriptor = "[[Lhe;")
    private class424[][] field7649;

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "[[Ljf;")
    private class533[][] field7633;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIIII[[ZLuq;[I[I)V")
    private final void method3099(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class351 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field5466 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field7648[var16][var17] != null) {
                        class157 var18 = this.field7648[var16][var17];
                        if (var18.field2163 != -1 && (var18.field2161 & 2) == 0 && var18.field2164 == -1) {
                            int var19 = this.field7650.method1263(var18.field2163);
                            arg8.method2322(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class442.method2803(-128, var18.field2160 & 65535, var19), class442.method2803(-124, var18.field2159 & 65535, var19), class442.method2803(-124, var18.field2165 & 65535, var19));
                            arg8.method2322(var15, var15, var15 - var13, var14, var13 + var14, var14, class442.method2803(-127, var18.field2162 & 65535, var19), class442.method2803(-127, var18.field2165 & 65535, var19), class442.method2803(-126, var18.field2159 & 65535, var19));
                        } else if (var18.field2164 == -1) {
                            arg8.method2322(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field2160 & 65535, var18.field2159 & 65535, var18.field2165 & 65535);
                            arg8.method2322(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field2162 & 65535, var18.field2165 & 65535, var18.field2159 & 65535);
                        } else {
                            int var20 = var18.field2164;
                            arg8.method2322(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var20, var20, var20);
                            arg8.method2322(var15, var15, var15 - var13, var14, var13 + var14, var14, var20, var20, var20);
                        }
                    } else if (this.field7649[var16][var17] != null) {
                        class424 var21 = this.field7649[var16][var17];
                        for (int var22 = 0; var22 < var21.field6430; ++var22) {
                            arg9[var22] = var21.field6435[var22] * var13 / super.field3754 + var14;
                            arg10[var22] = var15 - var21.field6425[var22] * var13 / super.field3754;
                        }
                        for (int var23 = 0; var23 < var21.field6434; ++var23) {
                            short var24 = var21.field6436[var23];
                            short var25 = var21.field6427[var23];
                            short var26 = var21.field6433[var23];
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field6432 != null && var21.field6432[var23] != -1) {
                                int var33 = var21.field6432[var23];
                                arg8.method2322(var30, var31, var32, var27, var28, var29, class442.method2803(-126, var21.field6428[var24], var33), class442.method2803(-124, var21.field6428[var25], var33), class442.method2803(-127, var21.field6428[var26], var33));
                            } else if (var21.field6437 != null && var21.field6437[var23] != -1) {
                                int var34 = this.field7650.method1263(var21.field6437[var23]);
                                arg8.method2322(var30, var31, var32, var27, var28, var29, class442.method2803(-124, var21.field6428[var24], var34), class442.method2803(-124, var21.field6428[var25], var34), class442.method2803(-128, var21.field6428[var26], var34));
                            } else {
                                int var35 = var21.field6429[var23];
                                arg8.method2322(var30, var31, var32, var27, var28, var29, class442.method2803(-123, var21.field6428[var24], var35), class442.method2803(-124, var21.field6428[var25], var35), class442.method2803(-123, var21.field6428[var26], var35));
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field5466 = true;
    }

    @OriginalMember(owner = "client!bf", name = "ca", descriptor = "(II)I")
    public final int method692(int arg0, int arg1) {
        int var3 = arg0 >> super.field3753;
        int var4 = arg1 >> super.field3753;
        if (var3 >= 0 && var4 >= 0 && var3 <= super.field3755 - 1 && var4 <= super.field3752 - 1) {
            int var5 = arg0 & super.field3754 - 1;
            int var6 = arg1 & super.field3754 - 1;
            int var7 = (super.field3754 - var5) * this.field7640[var3][var4] + this.field7640[var3 + 1][var4] * var5 >> super.field3753;
            int var8 = (super.field3754 - var5) * this.field7640[var3][var4 + 1] + this.field7640[var3 + 1][var4 + 1] * var5 >> super.field3753;
            return (super.field3754 - var6) * var7 + var6 * var8 >> super.field3753;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lf;IIII[[I[[II)V")
    public class515(class195 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field7650 = arg0;
        this.field7634 = arg2;
        this.field7640 = arg5;
        this.field7651 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field7650.field2934 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
                int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + arg7 * 512 + var13 * var13));
                int var16 = (var13 << 8) / var15;
                int var17 = arg7 * -512 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field7650.field2910 * var18 + this.field7650.field2943 * var17 + this.field7650.field2941 * var16 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field7651[var11][var10] = (byte) var20;
            }
        }
        this.field7638 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method686(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        if (this.field7648 == null) {
            this.field7648 = new class157[super.field3755][super.field3752];
            this.field7649 = new class424[super.field3755][super.field3752];
        } else if (this.field7646 != null) {
            throw new IllegalStateException();
        }
        boolean var18 = false;
        if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
            var18 = true;
            for (int var19 = 1; var19 < 2; ++var19) {
                int var20 = arg2[arg6[var19]];
                int var21 = arg4[arg6[var19]];
                if (var20 != 0 && super.field3754 != var20 || var21 != 0 && super.field3754 != var21) {
                    var18 = false;
                    break;
                }
            }
        }
        if (!var18) {
            class424 var22 = new class424();
            short var23 = (short) arg2.length;
            short var24 = (short) arg9.length;
            var22.field6430 = var23;
            var22.field6428 = new short[var23];
            var22.field6435 = new short[var23];
            var22.field6431 = new short[var23];
            var22.field6425 = new short[var23];
            for (int var25 = 0; var25 < var23; ++var25) {
                int var30 = arg2[var25];
                int var31 = arg4[var25];
                if (var30 == 0 && var31 == 0) {
                    var22.field6428[var25] = (short) (this.field7651[arg0][arg1] - this.field7638[arg0][arg1]);
                } else if (var30 == 0 && super.field3754 == var31) {
                    var22.field6428[var25] = (short) (this.field7651[arg0][arg1 + 1] - this.field7638[arg0][arg1 + 1]);
                } else if (super.field3754 == var30 && super.field3754 == var31) {
                    var22.field6428[var25] = (short) (this.field7651[arg0 + 1][arg1 + 1] - this.field7638[arg0 + 1][arg1 + 1]);
                } else if (super.field3754 == var30 && var31 == 0) {
                    var22.field6428[var25] = (short) (this.field7651[arg0 + 1][arg1] - this.field7638[arg0 + 1][arg1]);
                } else {
                    int var32 = (this.field7651[arg0 + 1][arg1] - this.field7638[arg0 + 1][arg1]) * var30 + (this.field7651[arg0][arg1] - this.field7638[arg0][arg1]) * (super.field3754 - var30);
                    int var33 = (this.field7651[arg0 + 1][arg1 + 1] - this.field7638[arg0 + 1][arg1 + 1]) * var30 + (this.field7651[arg0][arg1 + 1] - this.field7638[arg0][arg1 + 1]) * (super.field3754 - var30);
                    var22.field6428[var25] = (short) ((super.field3754 - var31) * var32 + var31 * var33 >> super.field3753 * 2);
                }
                int var34 = (arg0 << super.field3753) + var30;
                int var35 = (arg1 << super.field3753) + var31;
                var22.field6435[var25] = (short) var30;
                var22.field6425[var25] = (short) var31;
                var22.field6431[var25] = (short) (this.method692(var34, var35) + (arg3 != null ? arg3[var25] : 0));
                if (var22.field6428[var25] < 2) {
                    var22.field6428[var25] = 2;
                }
            }
            boolean var26 = false;
            int var27 = 0;
            for (int var28 = 0; var28 < var24; ++var28) {
                if (arg9[var28] >= 0 || arg10 != null && arg10[var28] >= 0) {
                    ++var27;
                }
                if (arg11[var28] != -1 && !this.field7650.field7480.method1366(arg11[var28], (byte) 15).field7269) {
                    var26 = true;
                }
            }
            var22.field6429 = new int[var27];
            if (arg10 != null) {
                var22.field6432 = new int[var27];
            }
            var22.field6436 = new short[var27];
            var22.field6427 = new short[var27];
            var22.field6433 = new short[var27];
            if (var26) {
                var22.field6437 = new short[var27];
                var22.field6426 = new short[var27];
            }
            for (int var29 = 0; var29 < var24; ++var29) {
                if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
                    if (arg9[var29] >= 0) {
                        var22.field6429[var22.field6434] = class493.method3014(arg9[var29], -1947159711);
                    } else {
                        var22.field6429[var22.field6434] = -1;
                    }
                    if (arg10 != null) {
                        if (arg10[var29] != -1) {
                            var22.field6432[var22.field6434] = class493.method3014(arg10[var29], -1947159711);
                        } else {
                            var22.field6432[var22.field6434] = -1;
                        }
                    }
                    var22.field6436[var22.field6434] = (short) arg6[var29];
                    var22.field6427[var22.field6434] = (short) arg7[var29];
                    var22.field6433[var22.field6434] = (short) arg8[var29];
                    if (var26) {
                        if (arg11[var29] != -1 && !this.field7650.field7480.method1366(arg11[var29], (byte) -125).field7269) {
                            var22.field6437[var22.field6434] = (short) arg11[var29];
                            var22.field6426[var22.field6434] = (short) arg12[var29];
                        } else {
                            var22.field6437[var22.field6434] = -1;
                        }
                    }
                    ++var22.field6434;
                }
            }
            this.field7649[arg0][arg1] = var22;
        } else {
            if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
                class157 var36 = new class157();
                int var37 = arg9[0];
                int var38 = arg11[0];
                if (arg10 != null) {
                    var36.field2164 = class442.method2803(-128, this.field7651[arg0][arg1] - this.field7638[arg0][arg1], class493.method3014(arg10[0], -1947159711));
                    if (var37 == -1) {
                        var36.field2161 = (byte) (var36.field2161 | 2);
                    }
                }
                if (this.field7640[arg0 + 1][arg1] == this.field7640[arg0][arg1] && this.field7640[arg0 + 1][arg1 + 1] == this.field7640[arg0][arg1] && this.field7640[arg0][arg1 + 1] == this.field7640[arg0][arg1]) {
                    var36.field2161 = (byte) (var36.field2161 | 1);
                }
                if (var38 != -1 && (var36.field2161 & 2) == 0 && !this.field7650.field7480.method1366(var38, (byte) 122).field7269) {
                    var36.field2162 = (short) (this.field7651[arg0][arg1] - this.field7638[arg0][arg1]);
                    var36.field2165 = (short) (this.field7651[arg0 + 1][arg1] - this.field7638[arg0 + 1][arg1]);
                    var36.field2160 = (short) (this.field7651[arg0 + 1][arg1 + 1] - this.field7638[arg0 + 1][arg1 + 1]);
                    var36.field2159 = (short) (this.field7651[arg0][arg1 + 1] - this.field7638[arg0][arg1 + 1]);
                    var36.field2163 = (short) var38;
                } else {
                    short var39 = class493.method3014(var37, -1947159711);
                    var36.field2162 = (short) class442.method2803(-125, this.field7651[arg0][arg1] - this.field7638[arg0][arg1], var39);
                    var36.field2165 = (short) class442.method2803(-125, this.field7651[arg0 + 1][arg1] - this.field7638[arg0 + 1][arg1], var39);
                    var36.field2160 = (short) class442.method2803(-123, this.field7651[arg0 + 1][arg1 + 1] - this.field7638[arg0 + 1][arg1 + 1], var39);
                    var36.field2159 = (short) class442.method2803(-124, this.field7651[arg0][arg1 + 1] - this.field7638[arg0][arg1 + 1], var39);
                    var36.field2163 = -1;
                }
                this.field7648[arg0][arg1] = var36;
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(IIIIIII[[ZLuq;[I[I)V")
    private final void method3100(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class351 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field5466 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field7646[var16][var17] != null) {
                        class374 var18 = this.field7646[var16][var17];
                        if (var18.field5742 != -1 && (var18.field5734 & 2) == 0 && var18.field5737 == 0) {
                            int var19 = this.field7650.method1263(var18.field5742);
                            arg8.method2322(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class442.method2803(-128, var18.field5739, var19), class442.method2803(-125, var18.field5740, var19), class442.method2803(-123, var18.field5743, var19));
                            arg8.method2322(var15, var15, var15 - var13, var14, var13 + var14, var14, class442.method2803(-126, var18.field5738, var19), class442.method2803(-124, var18.field5743, var19), class442.method2803(-126, var18.field5740, var19));
                        } else if (var18.field5737 == 0) {
                            arg8.method2321(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field5739, var18.field5740, var18.field5743);
                            arg8.method2321(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field5738, var18.field5743, var18.field5740);
                        } else {
                            int var20 = var18.field5737;
                            arg8.method2321(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class262.method1797(var18.field5739 & -16777216, true, var20), class262.method1797(var18.field5740 & -16777216, true, var20), class262.method1797(var18.field5743 & -16777216, true, var20));
                            arg8.method2321(var15, var15, var15 - var13, var14, var13 + var14, var14, class262.method1797(var18.field5738 & -16777216, true, var20), class262.method1797(var18.field5743 & -16777216, true, var20), class262.method1797(var18.field5740 & -16777216, true, var20));
                        }
                    } else if (this.field7633[var16][var17] != null) {
                        class533 var21 = this.field7633[var16][var17];
                        for (int var22 = 0; var22 < var21.field7819; ++var22) {
                            arg9[var22] = var21.field7814[var22] * var13 / super.field3754 + var14;
                            arg10[var22] = var15 - var21.field7821[var22] * var13 / super.field3754;
                        }
                        for (int var23 = 0; var23 < var21.field7816; ++var23) {
                            int var24 = var23 * 3;
                            int var25 = var24 + 1;
                            int var26 = var25 + 1;
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field7823 != null && var21.field7823[var23] != 0 && (var21.field7818 == null || var21.field7818 != null && var21.field7818[var23] == -1)) {
                                int var33 = var21.field7823[var23];
                                arg8.method2321(var30, var31, var32, var27, var28, var29, class262.method1797(-16777216 - (var21.field7815[var24] & -16777216), true, var33), class262.method1797(-16777216 - (var21.field7815[var25] & -16777216), true, var33), class262.method1797(-16777216 - (var21.field7815[var26] & -16777216), true, var33));
                            } else if (var21.field7818 != null && var21.field7818[var23] != -1) {
                                int var34 = this.field7650.method1263(var21.field7818[var23]);
                                arg8.method2322(var30, var31, var32, var27, var28, var29, var34, var34, var34);
                            } else {
                                arg8.method2321(var30, var31, var32, var27, var28, var29, var21.field7815[var24], var21.field7815[var25], var21.field7815[var26]);
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field5466 = true;
    }

    @OriginalMember(owner = "client!bf", name = "qa", descriptor = "(III)V")
    public final void method684(int arg0, int arg1, int arg2) {
        if (this.field7638[arg0][arg1] < arg2) {
            this.field7638[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIZLuq;[I[I[I)V")
    private final void method3101(int arg0, int arg1, boolean arg2, class351 arg3, int[] arg4, int[] arg5, int[] arg6) {
        class374 var8 = this.field7646[arg0][arg1];
        if (var8 != null) {
            if ((var8.field5734 & 2) == 0) {
                int var9 = super.field3754 * arg0;
                int var10 = super.field3754 + var9;
                int var11 = super.field3754 * arg1;
                int var12 = super.field3754 + var11;
                int var13 = 0;
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                int var19;
                int var20;
                int var21;
                int var22;
                int var29;
                int var30;
                int var31;
                int var32;
                int var33;
                int var34;
                int var35;
                int var36;
                int var37;
                int var38;
                int var39;
                int var40;
                int var41;
                int var42;
                int var43;
                int var44;
                if ((var8.field5734 & 1) != 0 && !arg2) {
                    int var17 = this.field7640[arg0][arg1];
                    if (this.field7644 == -1) {
                        int var18 = this.field7645 * var17;
                        var19 = (this.field7642 * var11 + this.field7632 * var9 + var18 >> 15) + this.field7635;
                        if (var19 <= this.field7650.field2925) {
                            return;
                        }
                        var20 = (this.field7642 * var11 + this.field7632 * var10 + var18 >> 15) + this.field7635;
                        if (var20 <= this.field7650.field2925) {
                            return;
                        }
                        var21 = (this.field7642 * var12 + this.field7632 * var10 + var18 >> 15) + this.field7635;
                        if (var21 <= this.field7650.field2925) {
                            return;
                        }
                        var22 = (this.field7642 * var12 + this.field7632 * var9 + var18 >> 15) + this.field7635;
                        if (var22 <= this.field7650.field2925) {
                            return;
                        }
                    } else {
                        var22 = this.field7644;
                        var21 = this.field7644;
                        var20 = this.field7644;
                        var19 = this.field7644;
                    }
                    if (this.field7650.field2926) {
                        int var23 = var19 - this.field7650.field2935;
                        if (var23 > 0) {
                            var13 = var23;
                            if (var23 > 255) {
                                var13 = 255;
                            }
                        }
                        int var24 = var20 - this.field7650.field2935;
                        if (var24 > 0) {
                            var14 = var24;
                            if (var24 > 255) {
                                var14 = 255;
                            }
                        }
                        int var25 = var21 - this.field7650.field2935;
                        if (var25 > 0) {
                            var15 = var25;
                            if (var25 > 255) {
                                var15 = 255;
                            }
                        }
                        int var26 = var22 - this.field7650.field2935;
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    int var27 = this.field7652 * var17;
                    int var28 = this.field7643 * var17;
                    var29 = (this.field7636 * var11 + this.field7647 * var9 + var27 >> 15) + this.field7641;
                    var30 = this.field7650.field2917 * var29 / var19 + arg3.field5473;
                    var31 = (this.field7639 * var11 + this.field7637 * var9 + var28 >> 15) + this.field7653;
                    var32 = this.field7650.field2918 * var31 / var19 + arg3.field5474;
                    var33 = (this.field7636 * var11 + this.field7647 * var10 + var27 >> 15) + this.field7641;
                    var34 = this.field7650.field2917 * var33 / var20 + arg3.field5473;
                    var35 = (this.field7639 * var11 + this.field7637 * var10 + var28 >> 15) + this.field7653;
                    var36 = this.field7650.field2918 * var35 / var20 + arg3.field5474;
                    var37 = (this.field7636 * var12 + this.field7647 * var10 + var27 >> 15) + this.field7641;
                    var38 = this.field7650.field2917 * var37 / var21 + arg3.field5473;
                    var39 = (this.field7639 * var12 + this.field7637 * var10 + var28 >> 15) + this.field7653;
                    var40 = this.field7650.field2918 * var39 / var21 + arg3.field5474;
                    var41 = (this.field7636 * var12 + this.field7647 * var9 + var27 >> 15) + this.field7641;
                    var42 = this.field7650.field2917 * var41 / var22 + arg3.field5473;
                    var43 = (this.field7639 * var12 + this.field7637 * var9 + var28 >> 15) + this.field7653;
                    var44 = this.field7650.field2918 * var43 / var22 + arg3.field5474;
                } else {
                    int var45 = this.field7640[arg0][arg1];
                    int var46 = this.field7640[arg0 + 1][arg1];
                    int var47 = this.field7640[arg0 + 1][arg1 + 1];
                    int var48 = this.field7640[arg0][arg1 + 1];
                    if (this.field7644 == -1) {
                        var19 = (this.field7642 * var11 + this.field7645 * var45 + this.field7632 * var9 >> 15) + this.field7635;
                        if (var19 <= this.field7650.field2925) {
                            return;
                        }
                        var20 = (this.field7642 * var11 + this.field7645 * var46 + this.field7632 * var10 >> 15) + this.field7635;
                        if (var20 <= this.field7650.field2925) {
                            return;
                        }
                        var21 = (this.field7642 * var12 + this.field7645 * var47 + this.field7632 * var10 >> 15) + this.field7635;
                        if (var21 <= this.field7650.field2925) {
                            return;
                        }
                        var22 = (this.field7642 * var12 + this.field7645 * var48 + this.field7632 * var9 >> 15) + this.field7635;
                        if (var22 <= this.field7650.field2925) {
                            return;
                        }
                    } else {
                        var22 = this.field7644;
                        var21 = this.field7644;
                        var20 = this.field7644;
                        var19 = this.field7644;
                    }
                    if (arg2) {
                        int var49 = var19 - this.field7650.field2935;
                        if (var49 > 255) {
                            var49 = 255;
                        }
                        if (var49 > 0) {
                            var13 = var49;
                            int var50 = var8.field5733 * var49 / 255;
                            if (var50 > 0) {
                                var45 -= var50;
                            }
                        }
                        int var51 = var20 - this.field7650.field2935;
                        if (var51 > 255) {
                            var51 = 255;
                        }
                        if (var51 > 0) {
                            var14 = var51;
                            int var52 = var8.field5735 * var51 / 255;
                            if (var52 > 0) {
                                var46 -= var52;
                            }
                        }
                        int var53 = var21 - this.field7650.field2935;
                        if (var53 > 255) {
                            var53 = 255;
                        }
                        if (var53 > 0) {
                            var15 = var53;
                            int var54 = var8.field5741 * var53 / 255;
                            if (var54 > 0) {
                                var47 -= var54;
                            }
                        }
                        int var55 = var22 - this.field7650.field2935;
                        if (var55 > 255) {
                            var55 = 255;
                        }
                        if (var55 > 0) {
                            var16 = var55;
                            int var56 = var8.field5736 * var55 / 255;
                            if (var56 > 0) {
                                var48 -= var56;
                            }
                        }
                    } else if (this.field7650.field2926) {
                        int var57 = var19 - this.field7650.field2935;
                        if (var57 > 0) {
                            var13 = var57;
                            if (var57 > 255) {
                                var13 = 255;
                            }
                        }
                        int var58 = var20 - this.field7650.field2935;
                        if (var58 > 0) {
                            var14 = var58;
                            if (var58 > 255) {
                                var14 = 255;
                            }
                        }
                        int var59 = var21 - this.field7650.field2935;
                        if (var59 > 0) {
                            var15 = var59;
                            if (var59 > 255) {
                                var15 = 255;
                            }
                        }
                        int var60 = var22 - this.field7650.field2935;
                        if (var60 > 0) {
                            var16 = var60;
                            if (var60 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    var29 = (this.field7636 * var11 + this.field7652 * var45 + this.field7647 * var9 >> 15) + this.field7641;
                    var30 = this.field7650.field2917 * var29 / var19 + arg3.field5473;
                    var31 = (this.field7639 * var11 + this.field7643 * var45 + this.field7637 * var9 >> 15) + this.field7653;
                    var32 = this.field7650.field2918 * var31 / var19 + arg3.field5474;
                    var33 = (this.field7636 * var11 + this.field7652 * var46 + this.field7647 * var10 >> 15) + this.field7641;
                    var34 = this.field7650.field2917 * var33 / var20 + arg3.field5473;
                    var35 = (this.field7639 * var11 + this.field7643 * var46 + this.field7637 * var10 >> 15) + this.field7653;
                    var36 = this.field7650.field2918 * var35 / var20 + arg3.field5474;
                    var37 = (this.field7636 * var12 + this.field7652 * var47 + this.field7647 * var10 >> 15) + this.field7641;
                    var38 = this.field7650.field2917 * var37 / var21 + arg3.field5473;
                    var39 = (this.field7639 * var12 + this.field7643 * var47 + this.field7637 * var10 >> 15) + this.field7653;
                    var40 = this.field7650.field2918 * var39 / var21 + arg3.field5474;
                    var41 = (this.field7636 * var12 + this.field7652 * var48 + this.field7647 * var9 >> 15) + this.field7641;
                    var42 = this.field7650.field2917 * var41 / var22 + arg3.field5473;
                    var43 = (this.field7639 * var12 + this.field7643 * var48 + this.field7637 * var9 >> 15) + this.field7653;
                    var44 = this.field7650.field2918 * var43 / var22 + arg3.field5474;
                }
                boolean var61 = var8.field5742 != -1 && this.method3103(this.field7650.field7480.method1366(var8.field5742, (byte) 80).field7282);
                int var62 = var14 + var15 + var16;
                if ((var36 - var44) * (var38 - var42) - (var34 - var42) * (var40 - var44) > 0) {
                    arg3.field5477 = var38 < 0 || var42 < 0 || var34 < 0 || var38 > arg3.field5471 || var42 > arg3.field5471 || var34 > arg3.field5471;
                    if (var62 < 765) {
                        if (var61) {
                            arg3.field5469 = 100;
                        }
                        if (var62 > 0) {
                            if (var8.field5742 >= 0) {
                                arg3.method2323(var40, var44, var36, var38, var42, var34, this.field7650.field2912, var15, var16, var14, var8.field5739, var8.field5740, var8.field5743, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field5742);
                            } else {
                                arg3.method2321(var40, var44, var36, var38, var42, var34, class262.method1797(var15 << 24 | this.field7650.field2912, true, var8.field5739), class262.method1797(var16 << 24 | this.field7650.field2912, true, var8.field5740), class262.method1797(var14 << 24 | this.field7650.field2912, true, var8.field5743));
                            }
                        } else if (var8.field5742 >= 0) {
                            arg3.method2325(var40, var44, var36, var38, var42, var34, var8.field5739, var8.field5740, var8.field5743, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field5742);
                        } else {
                            arg3.method2321(var40, var44, var36, var38, var42, var34, var8.field5739, var8.field5740, var8.field5743);
                        }
                        arg3.field5469 = 0;
                    } else {
                        arg3.method2324(var40, var44, var36, var38, var42, var34, this.field7650.field2912);
                    }
                }
                int var63 = var13 + var14 + var16;
                if ((var30 - var34) * (var44 - var36) - (var32 - var36) * (var42 - var34) > 0) {
                    arg3.field5477 = var30 < 0 || var34 < 0 || var42 < 0 || var30 > arg3.field5471 || var34 > arg3.field5471 || var42 > arg3.field5471;
                    if (var63 < 765) {
                        if (var61) {
                            arg3.field5469 = 100;
                        }
                        if (var63 > 0) {
                            if (var8.field5742 >= 0) {
                                arg3.method2323(var32, var36, var44, var30, var34, var42, this.field7650.field2912, var13, var14, var16, var8.field5738, var8.field5743, var8.field5740, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field5742);
                            } else {
                                arg3.method2321(var32, var36, var44, var30, var34, var42, class262.method1797(var13 << 24 | this.field7650.field2912, true, var8.field5738), class262.method1797(var14 << 24 | this.field7650.field2912, true, var8.field5743), class262.method1797(var16 << 24 | this.field7650.field2912, true, var8.field5740));
                            }
                        } else if (var8.field5742 >= 0) {
                            arg3.method2325(var32, var36, var44, var30, var34, var42, var8.field5738, var8.field5743, var8.field5740, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field5742);
                        } else {
                            arg3.method2321(var32, var36, var44, var30, var34, var42, var8.field5738, var8.field5743, var8.field5740);
                        }
                        arg3.field5469 = 0;
                        return;
                    }
                    arg3.method2324(var32, var36, var44, var30, var34, var42, this.field7650.field2912);
                }
            }
        } else {
            class533 var64 = this.field7633[arg0][arg1];
            if (var64 != null) {
                if (this.field7644 == -1) {
                    for (int var65 = 0; var65 < var64.field7819; ++var65) {
                        int var66 = (arg0 << super.field3753) + var64.field7814[var65];
                        int var67 = var64.field7817[var65];
                        int var68 = (arg1 << super.field3753) + var64.field7821[var65];
                        int var69 = (this.field7642 * var68 + this.field7645 * var67 + this.field7632 * var66 >> 15) + this.field7635;
                        if (var69 <= this.field7650.field2925) {
                            return;
                        }
                        arg6[var65] = 0;
                        if (arg2) {
                            int var70 = var69 - this.field7650.field2935;
                            if (var70 > 255) {
                                var70 = 255;
                            }
                            if (var70 > 0) {
                                arg6[var65] = var70;
                                int var71 = var64.field7820[var65] * var70 / 255;
                                if (var71 > 0) {
                                    var67 -= var71;
                                }
                            }
                        } else if (this.field7650.field2926) {
                            int var72 = var69 - this.field7650.field2935;
                            if (var72 > 0) {
                                arg6[var65] = var72;
                                if (arg6[var65] > 255) {
                                    arg6[var65] = 255;
                                }
                            }
                        }
                        int var73 = (this.field7636 * var68 + this.field7652 * var67 + this.field7647 * var66 >> 15) + this.field7641;
                        int var74 = (this.field7639 * var68 + this.field7643 * var67 + this.field7637 * var66 >> 15) + this.field7653;
                        arg4[var65] = this.field7650.field2917 * var73 / var69 + arg3.field5473;
                        arg5[var65] = this.field7650.field2918 * var74 / var69 + arg3.field5474;
                    }
                } else {
                    for (int var75 = 0; var75 < var64.field7819; ++var75) {
                        int var115 = (arg0 << super.field3753) + var64.field7814[var75];
                        int var116 = var64.field7817[var75];
                        int var117 = (arg1 << super.field3753) + var64.field7821[var75];
                        arg6[var75] = 0;
                        if (arg2) {
                            int var118 = this.field7644 - this.field7650.field2935;
                            if (var118 > 255) {
                                var118 = 255;
                            }
                            if (var118 > 0) {
                                arg6[var75] = var118;
                                int var119 = var64.field7820[var75] * var118 / 255;
                                if (var119 > 0) {
                                    var116 -= var119;
                                }
                            }
                        } else if (this.field7650.field2926) {
                            int var120 = this.field7644 - this.field7650.field2935;
                            if (var120 > 0) {
                                arg6[var75] = var120;
                                if (arg6[var75] > 255) {
                                    arg6[var75] = 255;
                                }
                            }
                        }
                        int var121 = (this.field7636 * var117 + this.field7652 * var116 + this.field7647 * var115 >> 15) + this.field7641;
                        int var122 = (this.field7639 * var117 + this.field7643 * var116 + this.field7637 * var115 >> 15) + this.field7653;
                        arg4[var75] = this.field7650.field2917 * var121 / this.field7644 + arg3.field5473;
                        arg5[var75] = this.field7650.field2918 * var122 / this.field7644 + arg3.field5474;
                    }
                }
                if (var64.field7818 != null) {
                    int var76 = this.field7640[arg0][arg1];
                    int var77 = this.field7640[arg0 + 1][arg1];
                    int var78 = this.field7640[arg0][arg1 + 1];
                    int var79 = super.field3754 * arg0;
                    int var80 = super.field3754 + var79;
                    int var81 = super.field3754 * arg1;
                    int var82 = super.field3754 + var81;
                    int var83 = (this.field7636 * var81 + this.field7652 * var76 + this.field7647 * var79 >> 15) + this.field7641;
                    int var84 = (this.field7639 * var81 + this.field7643 * var76 + this.field7637 * var79 >> 15) + this.field7653;
                    int var85 = (this.field7642 * var81 + this.field7645 * var76 + this.field7632 * var79 >> 15) + this.field7635;
                    int var86 = (this.field7636 * var81 + this.field7652 * var77 + this.field7647 * var80 >> 15) + this.field7641;
                    int var87 = (this.field7639 * var81 + this.field7643 * var77 + this.field7637 * var80 >> 15) + this.field7653;
                    int var88 = (this.field7642 * var81 + this.field7645 * var77 + this.field7632 * var80 >> 15) + this.field7635;
                    int var89 = (this.field7636 * var82 + this.field7652 * var78 + this.field7647 * var79 >> 15) + this.field7641;
                    int var90 = (this.field7639 * var82 + this.field7643 * var78 + this.field7637 * var79 >> 15) + this.field7653;
                    int var91 = (this.field7642 * var82 + this.field7645 * var78 + this.field7632 * var79 >> 15) + this.field7635;
                    for (int var92 = 0; var92 < var64.field7816; ++var92) {
                        int var93 = var92 * 3;
                        int var94 = var93 + 1;
                        int var95 = var94 + 1;
                        int var96 = arg4[var93];
                        int var97 = arg4[var94];
                        int var98 = arg4[var95];
                        int var99 = arg5[var93];
                        int var100 = arg5[var94];
                        int var101 = arg5[var95];
                        int var102 = arg6[var93] + arg6[var94] + arg6[var95];
                        if ((var96 - var97) * (var101 - var100) - (var98 - var97) * (var99 - var100) > 0) {
                            arg3.field5477 = var96 < 0 || var97 < 0 || var98 < 0 || var96 > arg3.field5471 || var97 > arg3.field5471 || var98 > arg3.field5471;
                            short var103 = var64.field7818[var92];
                            if (var102 < 765) {
                                if (var103 != -1 && this.method3103(this.field7650.field7480.method1366(var103, (byte) 8).field7282)) {
                                    arg3.field5469 = 100;
                                }
                                if (var102 > 0) {
                                    if (var103 != -1) {
                                        arg3.method2323(var99, var100, var101, var96, var97, var98, this.field7650.field2912, arg6[var93], arg6[var94], arg6[var95], var64.field7815[var93], var64.field7815[var94], var64.field7815[var95], var83, var86, var89, var84, var87, var90, var85, var88, var91, var103);
                                    } else if ((var64.field7815[var93] & 16777215) != 0) {
                                        arg3.method2321(var99, var100, var101, var96, var97, var98, class262.method1797(arg6[var93] << 24 | this.field7650.field2912, true, var64.field7815[var93]), class262.method1797(arg6[var94] << 24 | this.field7650.field2912, true, var64.field7815[var94]), class262.method1797(arg6[var95] << 24 | this.field7650.field2912, true, var64.field7815[var95]));
                                    }
                                } else if (var103 != -1) {
                                    arg3.method2325(var99, var100, var101, var96, var97, var98, var64.field7815[var93], var64.field7815[var94], var64.field7815[var95], var83, var86, var89, var84, var87, var90, var85, var88, var91, var103);
                                } else if ((var64.field7815[var93] & 16777215) != 0) {
                                    arg3.method2321(var99, var100, var101, var96, var97, var98, var64.field7815[var93], var64.field7815[var94], var64.field7815[var95]);
                                }
                                arg3.field5469 = 0;
                            } else {
                                arg3.method2324(var99, var100, var101, var96, var97, var98, this.field7650.field2912);
                            }
                        }
                    }
                    return;
                }
                for (int var104 = 0; var104 < var64.field7816; ++var104) {
                    int var105 = var104 * 3;
                    int var106 = var105 + 1;
                    int var107 = var106 + 1;
                    int var108 = arg4[var105];
                    int var109 = arg4[var106];
                    int var110 = arg4[var107];
                    int var111 = arg5[var105];
                    int var112 = arg5[var106];
                    int var113 = arg5[var107];
                    int var114 = arg6[var105] + arg6[var106] + arg6[var107];
                    if ((var108 - var109) * (var113 - var112) - (var110 - var109) * (var111 - var112) > 0) {
                        arg3.field5477 = var108 < 0 || var109 < 0 || var110 < 0 || var108 > arg3.field5471 || var109 > arg3.field5471 || var110 > arg3.field5471;
                        if (var114 < 765) {
                            if (var114 > 0) {
                                if ((var64.field7815[var105] & 16777215) != 0) {
                                    arg3.method2321(var111, var112, var113, var108, var109, var110, class59.method447(arg6[var105], var64.field7815[var105], this.field7650.field2912, 5), class59.method447(arg6[var106], var64.field7815[var106], this.field7650.field2912, 5), class59.method447(arg6[var107], var64.field7815[var107], this.field7650.field2912, 5));
                                }
                            } else if ((var64.field7815[var105] & 16777215) != 0) {
                                arg3.method2321(var111, var112, var113, var108, var109, var110, var64.field7815[var105], var64.field7815[var106], var64.field7815[var107]);
                            }
                        } else {
                            arg3.method2324(var111, var112, var113, var108, var109, var110, this.field7650.field2912);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "ba", descriptor = "(Li;IIIIZ)V")
    public final void method685(class521 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!bf", name = "ua", descriptor = "(II)I")
    public final int method688(int arg0, int arg1) {
        return this.field7640[arg0][arg1];
    }

    @OriginalMember(owner = "client!bf", name = "aa", descriptor = "()V")
    public final void method700() {
        this.field7651 = null;
        this.field7638 = null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)V")
    public final void method699(int arg0, int arg1) {
        class50 var3 = this.field7650.method1272(Thread.currentThread());
        var3.field630.field5469 = 0;
        if (this.field7646 != null) {
            this.method3101(arg0, arg1, this.field7650.field2913, var3.field630, var3.field671, var3.field674, var3.field642);
        } else {
            if (this.field7648 != null) {
                this.method3104(arg0, arg1, var3.field630, var3.field671, var3.field674, var3.field642);
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method690(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        class50 var9 = this.field7650.method1272(Thread.currentThread());
        class351 var10 = var9.field630;
        var10.field5469 = 0;
        var10.field5477 = false;
        if (this.field7646 != null) {
            this.method3100(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field671, var9.field674);
        } else {
            if (this.field7648 != null) {
                this.method3099(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field671, var9.field674);
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(II)I")
    private static final int method3102(int arg0, int arg1) {
        int var2 = (arg0 & 16711680) * arg1 >> 23;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 253) {
            var2 = 253;
        }
        int var3 = (arg0 & 65280) * arg1 >> 15;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 253) {
            var3 = 253;
        }
        int var4 = (arg0 & 255) * arg1 >> 7;
        if (var4 < 2) {
            var4 = 2;
        } else if (var4 > 253) {
            var4 = 253;
        }
        return var2 << 16 | var3 << 8 | var4;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(III[[ZZ)V")
    public final void method689(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        class26 var6 = this.field7650.field2951;
        this.field7644 = -1;
        this.field7647 = var6.field282;
        this.field7652 = var6.field289;
        this.field7636 = var6.field280;
        this.field7641 = var6.field281;
        this.field7637 = var6.field284;
        this.field7643 = var6.field288;
        this.field7639 = var6.field285;
        this.field7653 = var6.field291;
        this.field7632 = var6.field283;
        this.field7645 = var6.field286;
        this.field7642 = var6.field290;
        this.field7635 = var6.field287;
    }

    @OriginalMember(owner = "client!bf", name = "OA", descriptor = "(IILi;)Li;")
    public final class521 method697(int arg0, int arg1, class521 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Li;IIIIZ)Z")
    public final boolean method696(class521 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)Z")
    private final boolean method3103(int arg0) {
        if ((this.field7634 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else if (arg0 == 8) {
            return true;
        } else {
            return arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!bf", name = "pa", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method687(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (this.field7646 == null) {
            this.field7646 = new class374[super.field3755][super.field3752];
            this.field7633 = new class533[super.field3755][super.field3752];
        } else if (this.field7648 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var15 = 0; var15 < arg6.length; ++var15) {
                if (arg6[var15] == -1) {
                    arg6[var15] = 0;
                } else {
                    arg6[var15] = class329.field5177[class493.method3014(arg6[var15], -1947159711) & 65535] << 8 | 255;
                }
            }
            if (arg7 != null) {
                for (int var16 = 0; var16 < arg7.length; ++var16) {
                    if (arg7[var16] == -1) {
                        arg7[var16] = 0;
                    } else {
                        arg7[var16] = class329.field5177[class493.method3014(arg7[var16], -1947159711) & 65535] << 8 | 255;
                    }
                }
            }
            boolean var17 = true;
            int var18 = -1;
            int var19 = -1;
            int var20 = -1;
            int var21 = -1;
            if (arg2.length == 6) {
                for (int var22 = 0; var22 < 6; ++var22) {
                    if (arg2[var22] == 0 && arg4[var22] == 0) {
                        if (var18 != -1 && arg6[var18] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var18 = var22;
                    } else if (arg2[var22] == super.field3754 && arg4[var22] == 0) {
                        if (var19 != -1 && arg6[var19] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var19 = var22;
                    } else if (arg2[var22] == super.field3754 && arg4[var22] == super.field3754) {
                        if (var20 != -1 && arg6[var20] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var20 = var22;
                    } else if (arg2[var22] == 0 && arg4[var22] == super.field3754) {
                        if (var21 != -1 && arg6[var21] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var21 = var22;
                    }
                }
                if (var18 == -1 || var19 == -1 || var20 == -1 || var21 == -1) {
                    var17 = false;
                }
                if (var17) {
                    if (arg3 != null) {
                        for (int var23 = 0; var23 < 4; ++var23) {
                            if (arg3[var23] != 0) {
                                var17 = false;
                                break;
                            }
                        }
                    }
                    if (var17) {
                        for (int var24 = 1; var24 < 4; ++var24) {
                            if (arg2[var24] != arg2[0] && arg2[0] + super.field3754 != arg2[var24] && arg2[0] - super.field3754 != arg2[var24]) {
                                var17 = false;
                                break;
                            }
                            if (arg4[var24] != arg4[0] && arg4[0] + super.field3754 != arg4[var24] && arg4[0] - super.field3754 != arg4[var24]) {
                                var17 = false;
                                break;
                            }
                        }
                    }
                }
            } else {
                var17 = false;
            }
            if (var17) {
                class374 var25 = new class374();
                int var26 = arg6[0];
                int var27 = arg8[0];
                if (arg7 != null) {
                    var25.field5737 = arg7[0] >> 8;
                    if (var26 == 0) {
                        var25.field5734 = (byte) (var25.field5734 | 2);
                    }
                } else if (var26 == 0) {
                    return;
                }
                if (this.field7640[arg0 + 1][arg1] == this.field7640[arg0][arg1] && this.field7640[arg0 + 1][arg1 + 1] == this.field7640[arg0][arg1] && this.field7640[arg0][arg1 + 1] == this.field7640[arg0][arg1]) {
                    var25.field5734 = (byte) (var25.field5734 | 1);
                }
                if (var27 != -1 && (var25.field5734 & 2) == 0 && !this.field7650.field7480.method1366(var27, (byte) 42).field7269) {
                    var25.field5738 = this.field7651[arg0][arg1] - this.field7638[arg0][arg1];
                    var25.field5743 = this.field7651[arg0 + 1][arg1] - this.field7638[arg0 + 1][arg1];
                    var25.field5739 = this.field7651[arg0 + 1][arg1 + 1] - this.field7638[arg0 + 1][arg1 + 1];
                    var25.field5740 = this.field7651[arg0][arg1 + 1] - this.field7638[arg0][arg1 + 1];
                    var25.field5742 = (short) var27;
                } else {
                    int var28;
                    if (arg5 != null && arg11 != 0) {
                        var28 = arg5[var18] * 255 / arg11;
                        if (var28 < 0) {
                            var28 = 0;
                        } else if (var28 > 255) {
                            var28 = 255;
                        }
                    } else {
                        var28 = 0;
                    }
                    var25.field5738 = class59.method447(var28, method3102(arg6[var18] >> 8, this.field7651[arg0][arg1] - this.field7638[arg0][arg1]), arg10, 5);
                    if (var25.field5737 != 0) {
                        var25.field5738 |= 255 - (this.field7651[arg0][arg1] - this.field7638[arg0][arg1]) << 25;
                    }
                    int var29;
                    if (arg5 != null && arg11 != 0) {
                        var29 = arg5[var19] * 255 / arg11;
                        if (var29 < 0) {
                            var29 = 0;
                        } else if (var29 > 255) {
                            var29 = 255;
                        }
                    } else {
                        var29 = 0;
                    }
                    var25.field5743 = class59.method447(var29, method3102(arg6[var19] >> 8, this.field7651[arg0 + 1][arg1] - this.field7638[arg0 + 1][arg1]), arg10, 5);
                    if (var25.field5737 != 0) {
                        var25.field5743 |= 255 - (this.field7651[arg0 + 1][arg1] - this.field7638[arg0 + 1][arg1]) << 25;
                    }
                    int var30;
                    if (arg5 != null && arg11 != 0) {
                        var30 = arg5[var20] * 255 / arg11;
                        if (var30 < 0) {
                            var30 = 0;
                        } else if (var30 > 255) {
                            var30 = 255;
                        }
                    } else {
                        var30 = 0;
                    }
                    var25.field5739 = class59.method447(var30, method3102(arg6[var20] >> 8, this.field7651[arg0 + 1][arg1 + 1] - this.field7638[arg0 + 1][arg1 + 1]), arg10, 5);
                    if (var25.field5737 != 0) {
                        var25.field5739 |= 255 - (this.field7651[arg0 + 1][arg1 + 1] - this.field7638[arg0 + 1][arg1 + 1]) << 25;
                    }
                    int var31;
                    if (arg5 != null && arg11 != 0) {
                        var31 = arg5[var21] * 255 / arg11;
                        if (var31 < 0) {
                            var31 = 0;
                        } else if (var31 > 255) {
                            var31 = 255;
                        }
                    } else {
                        var31 = 0;
                    }
                    var25.field5740 = class59.method447(var31, method3102(arg6[var21] >> 8, this.field7651[arg0][arg1 + 1] - this.field7638[arg0][arg1 + 1]), arg10, 5);
                    if (var25.field5737 != 0) {
                        var25.field5740 |= 255 - (this.field7651[arg0][arg1 + 1] - this.field7638[arg0][arg1 + 1]) << 25;
                    }
                    var25.field5742 = -1;
                }
                if (arg5 != null) {
                    var25.field5741 = (short) arg5[var20];
                    var25.field5736 = (short) arg5[var21];
                    var25.field5735 = (short) arg5[var19];
                    var25.field5733 = (short) arg5[var18];
                }
                this.field7646[arg0][arg1] = var25;
            } else {
                class533 var32 = new class533();
                var32.field7819 = (short) arg2.length;
                var32.field7816 = (short) (arg2.length / 3);
                var32.field7814 = new short[var32.field7819];
                var32.field7817 = new short[var32.field7819];
                var32.field7821 = new short[var32.field7819];
                var32.field7815 = new int[var32.field7819];
                if (arg5 != null) {
                    var32.field7820 = new short[var32.field7819];
                }
                for (int var33 = 0; var33 < var32.field7819; ++var33) {
                    int var48 = arg2[var33];
                    int var49 = arg4[var33];
                    boolean var50 = false;
                    int var51;
                    if (var48 == 0 && var49 == 0) {
                        var51 = this.field7651[arg0][arg1] - this.field7638[arg0][arg1];
                    } else if (var48 == 0 && super.field3754 == var49) {
                        var51 = this.field7651[arg0][arg1 + 1] - this.field7638[arg0][arg1 + 1];
                    } else if (super.field3754 == var48 && super.field3754 == var49) {
                        var51 = this.field7651[arg0 + 1][arg1 + 1] - this.field7638[arg0 + 1][arg1 + 1];
                    } else if (super.field3754 == var48 && var49 == 0) {
                        var51 = this.field7651[arg0 + 1][arg1] - this.field7638[arg0 + 1][arg1];
                    } else {
                        int var52 = (this.field7651[arg0 + 1][arg1] - this.field7638[arg0 + 1][arg1]) * var48 + (this.field7651[arg0][arg1] - this.field7638[arg0][arg1]) * (super.field3754 - var48);
                        int var53 = (this.field7651[arg0 + 1][arg1 + 1] - this.field7638[arg0 + 1][arg1 + 1]) * var48 + (this.field7651[arg0][arg1 + 1] - this.field7638[arg0][arg1 + 1]) * (super.field3754 - var48);
                        var51 = (super.field3754 - var49) * var52 + var49 * var53 >> super.field3753 * 2;
                    }
                    int var54 = (arg0 << super.field3753) + var48;
                    int var55 = (arg1 << super.field3753) + var49;
                    var32.field7814[var33] = (short) var48;
                    var32.field7821[var33] = (short) var49;
                    var32.field7817[var33] = (short) (this.method692(var54, var55) + (arg3 != null ? arg3[var33] : 0));
                    if (var51 < 0) {
                        var51 = 0;
                    }
                    if (arg8[var33] != -1 && !this.field7650.field7480.method1366(arg8[var33], (byte) -121).field7269) {
                        var32.field7815[var33] = var51;
                    } else if (arg6[var33] == 0) {
                        if (arg7 != null) {
                            var32.field7815[var33] = var51 << 25;
                        } else {
                            var32.field7815[var33] = 0;
                        }
                    } else {
                        int var56 = 0;
                        if (arg5 != null) {
                            short var57 = var32.field7820[var33] = (short) arg5[var33];
                            if (arg11 != 0) {
                                var56 = var57 * 255 / arg11;
                                if (var56 < 0) {
                                    var56 = 0;
                                } else if (var56 > 255) {
                                    var56 = 255;
                                }
                            }
                        }
                        var32.field7815[var33] = class59.method447(var56, method3102(arg6[var33] >> 8, var51), arg10, 5);
                        if (arg7 != null) {
                            var32.field7815[var33] |= var51 << 25;
                        }
                    }
                }
                boolean var34 = false;
                for (int var35 = 0; var35 < var32.field7816; ++var35) {
                    if (arg8[var35 * 3] != -1 && !this.field7650.field7480.method1366(arg8[var35 * 3], (byte) -21).field7269) {
                        var34 = true;
                    }
                }
                if (arg7 != null) {
                    var32.field7823 = new int[var32.field7816];
                }
                if (var34) {
                    var32.field7818 = new short[var32.field7816];
                    var32.field7822 = new short[var32.field7816];
                }
                for (int var36 = 0; var36 < var32.field7816; ++var36) {
                    int var37 = var36 * 3;
                    if (arg7 != null && arg7[var37] != 0) {
                        var32.field7823[var36] = arg7[var37] >> 8;
                    }
                    if (var34) {
                        int var38 = var37 + 1;
                        int var39 = var38 + 1;
                        boolean var40 = false;
                        boolean var41 = true;
                        int var42 = arg8[var37];
                        if (var42 != -1 && !this.field7650.field7480.method1366(var42, (byte) -120).field7269) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var43 = arg8[var38];
                        if (var43 != -1 && !this.field7650.field7480.method1366(var43, (byte) -123).field7269) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var44 = arg8[var39];
                        if (var44 != -1 && !this.field7650.field7480.method1366(var44, (byte) 94).field7269) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        if (var41) {
                            var32.field7818[var36] = (short) var44;
                            var32.field7822[var36] = (short) arg9[var37];
                        } else {
                            if (var40) {
                                int var45 = arg8[var37];
                                if (var45 != -1 && !this.field7650.field7480.method1366(var45, (byte) -123).field7269) {
                                    var32.field7815[var37] = class329.field5177[class493.method3014(this.field7650.field7480.method1366(var45, (byte) 112).field7281 & 65535, -1947159711) & 65535];
                                }
                                int var46 = arg8[var38];
                                if (var46 != -1 && !this.field7650.field7480.method1366(var46, (byte) -123).field7269) {
                                    var32.field7815[var38] = class329.field5177[class493.method3014(this.field7650.field7480.method1366(var46, (byte) -120).field7281 & 65535, -1947159711) & 65535];
                                }
                                int var47 = arg8[var39];
                                if (var47 != -1 && !this.field7650.field7480.method1366(var47, (byte) -121).field7269) {
                                    var32.field7815[var39] = class329.field5177[class493.method3014(this.field7650.field7480.method1366(var47, (byte) -128).field7281 & 65535, -1947159711) & 65535];
                                }
                            }
                            var32.field7818[var36] = -1;
                        }
                    }
                }
                this.field7633[arg0][arg1] = var32;
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Las;[I)V")
    public final void method694(class415 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IILuq;[I[I[I)V")
    private final void method3104(int arg0, int arg1, class351 arg2, int[] arg3, int[] arg4, int[] arg5) {
        class157 var7 = this.field7648[arg0][arg1];
        if (var7 != null) {
            if ((var7.field2161 & 2) == 0) {
                int var8 = super.field3754 * arg0;
                int var9 = super.field3754 + var8;
                int var10 = super.field3754 * arg1;
                int var11 = super.field3754 + var10;
                int var14;
                int var15;
                int var17;
                int var20;
                int var21;
                int var22;
                int var23;
                int var24;
                int var25;
                int var26;
                int var27;
                int var29;
                int var31;
                int var32;
                int var33;
                int var34;
                int var35;
                if ((var7.field2161 & 1) != 0) {
                    int var12 = this.field7640[arg0][arg1];
                    int var16;
                    if (this.field7644 == -1) {
                        int var13 = this.field7645 * var12;
                        var14 = (this.field7642 * var10 + this.field7632 * var8 + var13 >> 15) + this.field7635;
                        if (var14 <= this.field7650.field2925) {
                            return;
                        }
                        var15 = (this.field7642 * var10 + this.field7632 * var9 + var13 >> 15) + this.field7635;
                        if (var15 <= this.field7650.field2925) {
                            return;
                        }
                        var16 = (this.field7642 * var11 + this.field7632 * var9 + var13 >> 15) + this.field7635;
                        if (var16 <= this.field7650.field2925) {
                            return;
                        }
                        var17 = (this.field7642 * var11 + this.field7632 * var8 + var13 >> 15) + this.field7635;
                        if (var17 <= this.field7650.field2925) {
                            return;
                        }
                    } else {
                        var17 = this.field7644;
                        var16 = this.field7644;
                        var15 = this.field7644;
                        var14 = this.field7644;
                    }
                    int var18 = this.field7652 * var12;
                    int var19 = this.field7643 * var12;
                    var20 = (this.field7636 * var10 + this.field7647 * var8 + var18 >> 15) + this.field7641;
                    var21 = this.field7650.field2917 * var20 / var14 + arg2.field5473;
                    var22 = (this.field7639 * var10 + this.field7637 * var8 + var19 >> 15) + this.field7653;
                    var23 = this.field7650.field2918 * var22 / var14 + arg2.field5474;
                    var24 = (this.field7636 * var10 + this.field7647 * var9 + var18 >> 15) + this.field7641;
                    var25 = this.field7650.field2917 * var24 / var15 + arg2.field5473;
                    var26 = (this.field7639 * var10 + this.field7637 * var9 + var19 >> 15) + this.field7653;
                    var27 = this.field7650.field2918 * var26 / var15 + arg2.field5474;
                    int var28 = (this.field7636 * var11 + this.field7647 * var9 + var18 >> 15) + this.field7641;
                    var29 = this.field7650.field2917 * var28 / var16 + arg2.field5473;
                    int var30 = (this.field7639 * var11 + this.field7637 * var9 + var19 >> 15) + this.field7653;
                    var31 = this.field7650.field2918 * var30 / var16 + arg2.field5474;
                    var32 = (this.field7636 * var11 + this.field7647 * var8 + var18 >> 15) + this.field7641;
                    var33 = this.field7650.field2917 * var32 / var17 + arg2.field5473;
                    var34 = (this.field7639 * var11 + this.field7637 * var8 + var19 >> 15) + this.field7653;
                    var35 = this.field7650.field2918 * var34 / var17 + arg2.field5474;
                } else {
                    int var36 = this.field7640[arg0][arg1];
                    int var37 = this.field7640[arg0 + 1][arg1];
                    int var38 = this.field7640[arg0 + 1][arg1 + 1];
                    int var39 = this.field7640[arg0][arg1 + 1];
                    int var40;
                    if (this.field7644 == -1) {
                        var14 = (this.field7642 * var10 + this.field7645 * var36 + this.field7632 * var8 >> 15) + this.field7635;
                        if (var14 <= this.field7650.field2925) {
                            return;
                        }
                        var15 = (this.field7642 * var10 + this.field7645 * var37 + this.field7632 * var9 >> 15) + this.field7635;
                        if (var15 <= this.field7650.field2925) {
                            return;
                        }
                        var40 = (this.field7642 * var11 + this.field7645 * var38 + this.field7632 * var9 >> 15) + this.field7635;
                        if (var40 <= this.field7650.field2925) {
                            return;
                        }
                        var17 = (this.field7642 * var11 + this.field7645 * var39 + this.field7632 * var8 >> 15) + this.field7635;
                        if (var17 <= this.field7650.field2925) {
                            return;
                        }
                    } else {
                        var17 = this.field7644;
                        var40 = this.field7644;
                        var15 = this.field7644;
                        var14 = this.field7644;
                    }
                    var20 = (this.field7636 * var10 + this.field7652 * var36 + this.field7647 * var8 >> 15) + this.field7641;
                    var21 = this.field7650.field2917 * var20 / var14 + arg2.field5473;
                    var22 = (this.field7639 * var10 + this.field7643 * var36 + this.field7637 * var8 >> 15) + this.field7653;
                    var23 = this.field7650.field2918 * var22 / var14 + arg2.field5474;
                    var24 = (this.field7636 * var10 + this.field7652 * var37 + this.field7647 * var9 >> 15) + this.field7641;
                    var25 = this.field7650.field2917 * var24 / var15 + arg2.field5473;
                    var26 = (this.field7639 * var10 + this.field7643 * var37 + this.field7637 * var9 >> 15) + this.field7653;
                    var27 = this.field7650.field2918 * var26 / var15 + arg2.field5474;
                    int var41 = (this.field7636 * var11 + this.field7652 * var38 + this.field7647 * var9 >> 15) + this.field7641;
                    var29 = this.field7650.field2917 * var41 / var40 + arg2.field5473;
                    int var42 = (this.field7639 * var11 + this.field7643 * var38 + this.field7637 * var9 >> 15) + this.field7653;
                    var31 = this.field7650.field2918 * var42 / var40 + arg2.field5474;
                    var32 = (this.field7636 * var11 + this.field7652 * var39 + this.field7647 * var8 >> 15) + this.field7641;
                    var33 = this.field7650.field2917 * var32 / var17 + arg2.field5473;
                    var34 = (this.field7639 * var11 + this.field7643 * var39 + this.field7637 * var8 >> 15) + this.field7653;
                    var35 = this.field7650.field2918 * var34 / var17 + arg2.field5474;
                }
                if ((var27 - var35) * (var29 - var33) - (var25 - var33) * (var31 - var35) > 0) {
                    arg2.field5477 = var29 < 0 || var33 < 0 || var25 < 0 || var29 > arg2.field5471 || var33 > arg2.field5471 || var25 > arg2.field5471;
                    if (var7.field2163 >= 0) {
                        if (this.method3103(this.field7650.field7480.method1366(var7.field2163, (byte) 50).field7282)) {
                            arg2.field5469 = 100;
                        }
                        arg2.method2325(var31, var35, var27, var29, var33, var25, var7.field2160 & 65535, var7.field2159 & 65535, var7.field2165 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field2163);
                        arg2.field5469 = 0;
                    } else {
                        arg2.method2322(var31, var35, var27, var29, var33, var25, var7.field2160 & 65535, var7.field2159 & 65535, var7.field2165 & 65535);
                    }
                }
                if ((var21 - var25) * (var35 - var27) - (var23 - var27) * (var33 - var25) > 0) {
                    arg2.field5477 = var21 < 0 || var25 < 0 || var33 < 0 || var21 > arg2.field5471 || var25 > arg2.field5471 || var33 > arg2.field5471;
                    if (var7.field2163 >= 0) {
                        if (this.method3103(this.field7650.field7480.method1366(var7.field2163, (byte) -5).field7282)) {
                            arg2.field5469 = 100;
                        }
                        arg2.method2325(var23, var27, var35, var21, var25, var33, var7.field2162 & 65535, var7.field2165 & 65535, var7.field2159 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field2163);
                        arg2.field5469 = 0;
                        return;
                    }
                    arg2.method2322(var23, var27, var35, var21, var25, var33, var7.field2162 & 65535, var7.field2165 & 65535, var7.field2159 & 65535);
                }
            }
        } else {
            class424 var43 = this.field7649[arg0][arg1];
            if (var43 != null) {
                if (this.field7644 == -1) {
                    for (int var44 = 0; var44 < var43.field6430; ++var44) {
                        int var45 = (arg0 << super.field3753) + var43.field6435[var44];
                        short var46 = var43.field6431[var44];
                        int var47 = (arg1 << super.field3753) + var43.field6425[var44];
                        int var48 = (this.field7642 * var47 + this.field7645 * var46 + this.field7632 * var45 >> 15) + this.field7635;
                        if (var48 <= this.field7650.field2925) {
                            return;
                        }
                        int var49 = (this.field7636 * var47 + this.field7652 * var46 + this.field7647 * var45 >> 15) + this.field7641;
                        int var50 = (this.field7639 * var47 + this.field7643 * var46 + this.field7637 * var45 >> 15) + this.field7653;
                        arg3[var44] = this.field7650.field2917 * var49 / var48 + arg2.field5473;
                        arg4[var44] = this.field7650.field2918 * var50 / var48 + arg2.field5474;
                    }
                } else {
                    for (int var51 = 0; var51 < var43.field6430; ++var51) {
                        int var91 = (arg0 << super.field3753) + var43.field6435[var51];
                        short var92 = var43.field6431[var51];
                        int var93 = (arg1 << super.field3753) + var43.field6425[var51];
                        int var94 = (this.field7636 * var93 + this.field7652 * var92 + this.field7647 * var91 >> 15) + this.field7641;
                        int var95 = (this.field7639 * var93 + this.field7643 * var92 + this.field7637 * var91 >> 15) + this.field7653;
                        arg3[var51] = this.field7650.field2917 * var94 / this.field7644 + arg2.field5473;
                        arg4[var51] = this.field7650.field2918 * var95 / this.field7644 + arg2.field5474;
                    }
                }
                if (var43.field6437 != null) {
                    int var52 = this.field7640[arg0][arg1];
                    int var53 = this.field7640[arg0 + 1][arg1];
                    int var54 = this.field7640[arg0][arg1 + 1];
                    int var55 = super.field3754 * arg0;
                    int var56 = super.field3754 + var55;
                    int var57 = super.field3754 * arg1;
                    int var58 = super.field3754 + var57;
                    int var59 = (this.field7636 * var57 + this.field7652 * var52 + this.field7647 * var55 >> 15) + this.field7641;
                    int var60 = (this.field7639 * var57 + this.field7643 * var52 + this.field7637 * var55 >> 15) + this.field7653;
                    int var61 = (this.field7642 * var57 + this.field7645 * var52 + this.field7632 * var55 >> 15) + this.field7635;
                    int var62 = (this.field7636 * var57 + this.field7652 * var53 + this.field7647 * var56 >> 15) + this.field7641;
                    int var63 = (this.field7639 * var57 + this.field7643 * var53 + this.field7637 * var56 >> 15) + this.field7653;
                    int var64 = (this.field7642 * var57 + this.field7645 * var53 + this.field7632 * var56 >> 15) + this.field7635;
                    int var65 = (this.field7636 * var58 + this.field7652 * var54 + this.field7647 * var55 >> 15) + this.field7641;
                    int var66 = (this.field7639 * var58 + this.field7643 * var54 + this.field7637 * var55 >> 15) + this.field7653;
                    int var67 = (this.field7642 * var58 + this.field7645 * var54 + this.field7632 * var55 >> 15) + this.field7635;
                    for (int var68 = 0; var68 < var43.field6434; ++var68) {
                        short var69 = var43.field6436[var68];
                        short var70 = var43.field6427[var68];
                        short var71 = var43.field6433[var68];
                        int var72 = arg3[var69];
                        int var73 = arg3[var70];
                        int var74 = arg3[var71];
                        int var75 = arg4[var69];
                        int var76 = arg4[var70];
                        int var77 = arg4[var71];
                        if ((var72 - var73) * (var77 - var76) - (var74 - var73) * (var75 - var76) > 0) {
                            arg2.field5477 = var72 < 0 || var73 < 0 || var74 < 0 || var72 > arg2.field5471 || var73 > arg2.field5471 || var74 > arg2.field5471;
                            short var78 = var43.field6437[var68];
                            if (var78 != -1) {
                                if (this.method3103(this.field7650.field7480.method1366(var78, (byte) 55).field7282)) {
                                    arg2.field5469 = 100;
                                }
                                arg2.method2325(var75, var76, var77, var72, var73, var74, var43.field6428[var69], var43.field6428[var70], var43.field6428[var71], var59, var62, var65, var60, var63, var66, var61, var64, var67, var78);
                                arg2.field5469 = 0;
                            } else {
                                int var79 = var43.field6429[var68];
                                if (var79 != -1) {
                                    arg2.method2322(var75, var76, var77, var72, var73, var74, class442.method2803(-123, var43.field6428[var69], var79), class442.method2803(-127, var43.field6428[var70], var79), class442.method2803(-124, var43.field6428[var71], var79));
                                }
                            }
                        }
                    }
                    return;
                }
                for (int var80 = 0; var80 < var43.field6434; ++var80) {
                    short var81 = var43.field6436[var80];
                    short var82 = var43.field6427[var80];
                    short var83 = var43.field6433[var80];
                    int var84 = arg3[var81];
                    int var85 = arg3[var82];
                    int var86 = arg3[var83];
                    int var87 = arg4[var81];
                    int var88 = arg4[var82];
                    int var89 = arg4[var83];
                    if ((var84 - var85) * (var89 - var88) - (var86 - var85) * (var87 - var88) > 0) {
                        int var90 = var43.field6429[var80];
                        if (var90 != -1) {
                            arg2.field5477 = var84 < 0 || var85 < 0 || var86 < 0 || var84 > arg2.field5471 || var85 > arg2.field5471 || var86 > arg2.field5471;
                            arg2.method2322(var87, var88, var89, var84, var85, var86, class442.method2803(-126, var43.field6428[var81], var90), class442.method2803(-128, var43.field6428[var82], var90), class442.method2803(-128, var43.field6428[var83], var90));
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "H", descriptor = "(Li;IIIIZ)V")
    public final void method698(class521 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }
}
