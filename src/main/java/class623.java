import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class623 {

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "[I")
    private int[] field9122 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

    @OriginalMember(owner = "client!nh", name = "l", descriptor = "[I")
    private int[] field9128 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

    @OriginalMember(owner = "client!nh", name = "s", descriptor = "Z")
    public boolean field9135;

    @OriginalMember(owner = "client!nh", name = "p", descriptor = "I")
    public int field9132;

    @OriginalMember(owner = "client!nh", name = "x", descriptor = "Lar;")
    private class4 field9140;

    @OriginalMember(owner = "client!nh", name = "u", descriptor = "Lul;")
    private class388 field9137;

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "I")
    public int field9125;

    @OriginalMember(owner = "client!nh", name = "w", descriptor = "I")
    public int field9139;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "[[[B")
    public byte[][][] field9120;

    @OriginalMember(owner = "client!nh", name = "m", descriptor = "[[[B")
    private byte[][][] field9129;

    @OriginalMember(owner = "client!nh", name = "v", descriptor = "[[[I")
    public int[][][] field9138;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "[[[B")
    private byte[][][] field9118;

    @OriginalMember(owner = "client!nh", name = "A", descriptor = "[[[B")
    private byte[][][] field9143;

    @OriginalMember(owner = "client!nh", name = "z", descriptor = "[[[B")
    private byte[][][] field9142;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "Lqp;")
    public static class586 field9121 = new class586(30, 17);

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "I")
    public static int field9117;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
    public static int field9119;

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "I")
    public static int field9123;

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "I")
    public static int field9124;

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "I")
    public static int field9126;

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "I")
    public static int field9127;

    @OriginalMember(owner = "client!nh", name = "n", descriptor = "I")
    public static int field9130;

    @OriginalMember(owner = "client!nh", name = "o", descriptor = "I")
    public static int field9131;

    @OriginalMember(owner = "client!nh", name = "q", descriptor = "I")
    public static int field9133;

    @OriginalMember(owner = "client!nh", name = "r", descriptor = "I")
    public static int field9134;

    @OriginalMember(owner = "client!nh", name = "y", descriptor = "I")
    public static int field9141;

    @OriginalMember(owner = "client!nh", name = "t", descriptor = "[[[B")
    public byte[][][] field9136;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "([[IZI)V")
    public final void method3631(int[][] arg0, boolean arg1, int arg2) {
        field9134++;
        int[][] var4 = this.field9138[arg2];
        if (!arg1) {
            return;
        }
        for (int var5 = 0; var5 < (this.field9139 + 1); var5++) {
            for (int var6 = 0; var6 < (this.field9125 + 1); var6++) {
                var4[var5][var6] += arg0[var5][var6];
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lps;IIII[Lgea;I)V")
    public final void method3632(class428 arg0, int arg1, int arg2, int arg3, int arg4, class82[] arg5, int arg6) {
        field9123++;
        if (!this.field9135) {
            for (int var8 = 0; var8 < 4; var8++) {
                class82 var9 = arg5[var8];
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        int var12 = arg1 + var10;
                        int var13 = arg4 + var11;
                        if (var12 >= 0 && this.field9139 > var12 && var13 >= 0 && var13 < this.field9125) {
                            var9.method470(var12, var13, (byte) 93);
                        }
                    }
                }
            }
        }
        int var14 = arg1 + arg6;
        int var15 = arg3 + arg4;
        int var16 = 0;
        if (arg2 != 11613) {
            this.field9135 = true;
        }
        while (var16 < this.field9132) {
            for (int var17 = 0; var17 < 64; var17++) {
                for (int var18 = 0; var18 < 64; var18++) {
                    this.method3635(arg0, var16, 0, var17 + arg1, 0, var14 + var17, false, 0, true, arg4 + var18, var15 - -var18);
                }
            }
            var16++;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(BLqa;[Lgea;[[[I)V")
    public final void method3633(byte arg0, class167 arg1, class82[] arg2, int[][][] arg3) {
        if (arg0 < 39) {
            this.method3631(null, false, -11);
        }
        if (!this.field9135) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < this.field9139; var6++) {
                    for (int var7 = 0; var7 < this.field9125; var7++) {
                        if ((class237.field3473[var5][var6][var7] & 0x1) != 0) {
                            int var8 = var5;
                            if ((class237.field3473[1][var6][var7] & 0x2) != 0) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg2[var8].method485(2097152, var6, var7);
                            }
                        }
                    }
                }
            }
        }
        field9124++;
        for (int var9 = 0; var9 < this.field9132; var9++) {
            int var10 = 0;
            int var11 = 0;
            if (!this.field9135) {
                if (class177.field2689) {
                    var10 |= 0x2;
                }
                if (class312.field4691) {
                    var11 |= 0x8;
                }
                if (class136.field1799 != 0) {
                    var10 |= 0x1;
                    if (var9 == 0 | class169.field2296) {
                        var11 |= 0x10;
                    }
                }
            }
            if (class177.field2689) {
                var11 |= 0x7;
            }
            if (!class545.field8134) {
                var11 |= 0x20;
            }
            int[][] var12 = arg3 == null || var9 >= arg3.length ? this.field9138[var9] : arg3[var9];
            class421.method2504(var9, arg1.method965(this.field9139, this.field9125, this.field9138[var9], var12, 128, var10, var11));
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(II[Lgea;IILps;IIII)V")
    public final void method3634(int arg0, int arg1, class82[] arg2, int arg3, int arg4, class428 arg5, int arg6, int arg7, int arg8, int arg9) {
        field9119++;
        int var11 = (arg4 & 0x7) * 8;
        int var12 = (arg9 & 0x7) * 8;
        if (!this.field9135) {
            class82 var13 = arg2[arg7];
            for (int var14 = 0; var14 < 8; var14++) {
                for (int var15 = 0; var15 < 8; var15++) {
                    int var16 = arg8 + class459.method2739(arg3, var14 & 0x7, var15 & 0x7, 3);
                    int var17 = class77.method451(arg3, var15 & 0x7, var14 & 0x7, (byte) 87) + arg0;
                    if (var16 > 0 && this.field9139 - 1 > var16 && var17 > 0 && (this.field9125 - 1) > var17) {
                        var13.method470(var16, var17, (byte) 93);
                    }
                }
            }
        }
        int var18 = arg4 & 0x1FFFFFF8 << 3;
        int var19 = arg9 & 0x1FFFFFF8 << 3;
        if (arg6 < 10) {
            this.field9122 = null;
        }
        byte var20 = 0;
        byte var21 = 0;
        if (arg3 == 1) {
            var21 = 1;
        } else if (arg3 == 2) {
            var21 = 1;
            var20 = 1;
        } else if (arg3 == 3) {
            var20 = 1;
        }
        for (int var22 = 0; var22 < this.field9132; var22++) {
            for (int var23 = 0; var23 < 64; var23++) {
                for (int var24 = 0; var24 < 64; var24++) {
                    if (arg1 == var22 && var23 >= var11 && var11 + 8 >= var23 && var24 >= var12 && var12 + 8 >= var24) {
                        int var25;
                        int var26;
                        if (var11 + 8 == var23 || var12 + 8 == var24) {
                            if (arg3 == 0) {
                                var25 = arg8 + var23 - var11;
                                var26 = arg0 + var24 - var12;
                            } else if (arg3 == 1) {
                                var26 = arg0 + var11 - (var23 - 8);
                                var25 = var24 + arg8 - var12;
                            } else if (arg3 == 2) {
                                var26 = var12 + arg0 - (var24 - 8);
                                var25 = arg8 + var11 + 8 - var23;
                            } else {
                                var25 = var12 + arg8 + 8 - var24;
                                var26 = arg0 + var23 - var11;
                            }
                            this.method3635(arg5, arg7, 0, var25, 0, var18 + var23, true, 0, true, var26, var19 + var24);
                        } else {
                            var25 = class459.method2739(arg3, var23 & 0x7, var24 & 0x7, 3) + arg8;
                            var26 = class77.method451(arg3, var24 & 0x7, var23 & 0x7, (byte) 82) + arg0;
                            this.method3635(arg5, arg7, var21, var25, arg3, var18 + var23, false, var20, true, var26, var19 + var24);
                        }
                        if (var23 == 63 || var24 == 63) {
                            byte var27 = 1;
                            if (var23 == 63 && var24 == 63) {
                                var27 = 3;
                            }
                            for (int var28 = 0; var28 < var27; var28++) {
                                int var29 = var23;
                                int var30 = var24;
                                if (var28 == 0) {
                                    var29 = var23 == 63 ? 64 : var23;
                                    var30 = var24 == 63 ? 64 : var24;
                                } else if (var28 == 1) {
                                    var29 = 64;
                                } else if (var28 == 2) {
                                    var30 = 64;
                                }
                                int var31;
                                int var32;
                                if (arg3 == 0) {
                                    var32 = -var12 - (-var30 - arg0);
                                    var31 = var29 + arg8 - var11;
                                } else if (arg3 == 1) {
                                    var31 = arg8 + var30 - var12;
                                    var32 = var11 + arg0 + 8 - var29;
                                } else if (arg3 == 2) {
                                    var32 = var12 + (arg0 - -8) - var30;
                                    var31 = arg8 + var11 + 8 - var29;
                                } else {
                                    var31 = arg8 - (var30 - var12 - 8);
                                    var32 = arg0 - (var11 - var29);
                                }
                                if (var31 >= 0 && var31 < this.field9139 && var32 >= 0 && var32 < this.field9125) {
                                    this.field9138[arg7][var31][var32] = this.field9138[arg7][var20 + var25][var21 + var26];
                                }
                            }
                        }
                    } else {
                        this.method3635(arg5, 0, 0, -1, 0, 0, false, 0, true, -1, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lps;IIIIIZIZII)V")
    private final void method3635(class428 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, boolean arg8, int arg9, int arg10) {
        if (arg4 == 1) {
            arg2 = 1;
        } else if (arg4 == 2) {
            arg7 = 1;
            arg2 = 1;
        } else if (arg4 == 3) {
            arg7 = 1;
        }
        field9130++;
        if (arg3 >= 0 && arg3 < this.field9139 && arg9 >= 0 && arg9 < this.field9125) {
            if (!this.field9135 && !arg6) {
                class237.field3473[arg1][arg3][arg9] = 0;
            }
            while (true) {
                int var12 = arg0.method2561((byte) 126);
                if (var12 == 0) {
                    if (this.field9135) {
                        this.field9138[0][arg3 + arg7][arg2 + arg9] = 0;
                    } else if (arg1 == 0) {
                        this.field9138[0][arg3 + arg7][arg2 + arg9] = -class350.method2140(4, arg10 + 556238, arg5 + 932731) * 8 << 0;
                    } else {
                        this.field9138[arg1][arg3 + arg7][arg2 + arg9] = this.field9138[arg1 - 1][arg3 + arg7][arg2 + arg9] - 240;
                    }
                    break;
                }
                if (var12 == 1) {
                    int var13 = arg0.method2561((byte) -127);
                    if (this.field9135) {
                        this.field9138[0][arg3 + arg7][arg9 + arg2] = var13 * 8 << 0;
                    } else {
                        if (var13 == 1) {
                            var13 = 0;
                        }
                        if (arg1 == 0) {
                            this.field9138[0][arg3 + arg7][arg2 + arg9] = -var13 * 8 << 0;
                        } else {
                            this.field9138[arg1][arg3 + arg7][arg2 + arg9] = this.field9138[arg1 - 1][arg3 + arg7][arg2 + arg9] - (var13 * 8 << 0);
                        }
                    }
                    break;
                }
                if (var12 <= 49) {
                    if (arg6) {
                        arg0.method2561((byte) 120);
                    } else {
                        this.field9129[arg1][arg3][arg9] = arg0.method2570((byte) 57);
                        this.field9143[arg1][arg3][arg9] = (byte) ((var12 - 2) / 4);
                        this.field9118[arg1][arg3][arg9] = (byte) class637.method3693(var12 + arg4 - 2, 3);
                    }
                } else if (var12 <= 81) {
                    if (!this.field9135 && !arg6) {
                        class237.field3473[arg1][arg3][arg9] = (byte) (var12 - 49);
                    }
                } else if (!arg6) {
                    this.field9142[arg1][arg3][arg9] = (byte) (var12 - 81);
                }
            }
        } else {
            while (true) {
                int var14 = arg0.method2561((byte) 124);
                if (var14 == 0) {
                    break;
                }
                if (var14 == 1) {
                    arg0.method2561((byte) -83);
                    break;
                }
                if (var14 <= 49) {
                    arg0.method2561((byte) -39);
                }
            }
        }
        if (!arg8) {
            this.method3632(null, 62, 45, -108, 72, null, 70);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "([[ILsa;Lsa;Lsa;IZLqa;)V")
    private final void method3636(int[][] arg0, class543 arg1, class543 arg2, class543 arg3, int arg4, boolean arg5, class167 arg6) {
        field9127++;
        int var8 = 0;
        if (arg5) {
            this.field9138 = null;
        }
        while (this.field9139 > var8) {
            for (int var9 = 0; var9 < this.field9125; var9++) {
                if (class555.field8244 == -1 || class169.method1076(var8, arg4, var9, -15708, class555.field8244)) {
                    byte var10 = this.field9143[arg4][var8][var9];
                    byte var11 = this.field9118[arg4][var8][var9];
                    int var12 = this.field9129[arg4][var8][var9] & 0xFF;
                    int var13 = this.field9142[arg4][var8][var9] & 0xFF;
                    class206 var14 = var12 == 0 ? null : this.field9137.method2347(-16497, var12 - 1);
                    class467 var15 = var13 == 0 ? null : this.field9140.method21(var13 - 1, 78);
                    int var16 = 0;
                    int var17 = 0;
                    if (var10 != 0) {
                        var17 = var14 == null ? 0 : class203.field3033[var10];
                        var16 = var15 == null ? 0 : class317.field4742[var10];
                    } else if (var14 != null) {
                        var17 = class203.field3033[var10];
                    } else if (var15 != null) {
                        var16 = class203.field3033[var10];
                    }
                    int var18 = var16 + var17;
                    int var19 = 0;
                    if (var18 != 0) {
                        int[] var20 = new int[var18];
                        int[] var21 = new int[var18];
                        int[] var22 = new int[var18];
                        int[] var23 = new int[var18];
                        boolean var24 = false;
                        if (var14 == null || var14.field3059 == -1 && var14.field3069 == -1 && var14.field3076 == -1) {
                            for (int var27 = 0; var27 < var17; var27++) {
                                var20[var19] = -1;
                                var19++;
                            }
                        } else {
                            int var25 = arg6.method976() ? var14.field3076 : var14.field3064;
                            if (class231.field3413) {
                                var25 = -1;
                            }
                            for (int var26 = 0; var26 < var17; var26++) {
                                var22[var19] = var25;
                                var23[var19] = var14.field3058;
                                if (var14.field3059 == -1) {
                                    var20[var19] = -1;
                                } else {
                                    var20[var19] = var14.field3059;
                                }
                                if (var14.field3069 == -1) {
                                    var21[var19] = -1;
                                } else {
                                    var24 = true;
                                    var21[var19] = var14.field3069;
                                }
                                var19++;
                            }
                            if (!this.field9135 && arg4 == 0) {
                                class328.method2046(var8, var9, var14.field3071, var14.field3056 * 8, var14.field3057);
                            }
                        }
                        if (!var24) {
                            var21 = null;
                        }
                        if (var15 == null) {
                            for (int var30 = 0; var30 < var16; var30++) {
                                var20[var19] = -1;
                                var19++;
                            }
                        } else {
                            int var28 = var15.field6739;
                            if (class231.field3413) {
                                var28 = -1;
                            }
                            for (int var29 = 0; var29 < var16; var29++) {
                                var22[var19] = var28;
                                var23[var19] = var15.field6747;
                                var20[var19] = arg0[var8][var9];
                                if (var21 != null) {
                                    var21[var19] = -1;
                                }
                                var19++;
                            }
                        }
                        int var31 = this.field9128.length;
                        int[] var32 = new int[var31];
                        int[] var33 = new int[var31];
                        int[] var34 = arg1 == null ? null : new int[var31];
                        int[] var35 = arg1 == null && arg2 == null ? null : new int[var31];
                        for (int var36 = 0; var36 < var31; var36++) {
                            int var45 = this.field9128[var36];
                            int var46 = this.field9122[var36];
                            if (var11 == 0) {
                                var32[var36] = var45;
                                var33[var36] = var46;
                            } else if (var11 == 1) {
                                var32[var36] = var46;
                                var33[var36] = 128 - var45;
                            } else if (var11 == 2) {
                                var32[var36] = 128 - var45;
                                var33[var36] = 128 - var46;
                            } else if (var11 == 3) {
                                var32[var36] = 128 - var46;
                                var33[var36] = var45;
                            }
                            if (var34 != null && class10.field93[var10][var36]) {
                                int var49 = (var8 << 7) + var45;
                                int var50 = (var9 << 7) + var45;
                                var34[var36] = arg1.method1323(var49, var50) - arg3.method1323(var49, var50);
                            }
                            if (var35 != null) {
                                if (arg1 != null && !class10.field93[var10][var36]) {
                                    int var51 = (var8 << 7) + var45;
                                    int var52 = (var9 << 7) + var45;
                                    var35[var36] = arg3.method1323(var51, var52) - arg1.method1323(var51, var52);
                                } else if (arg2 != null && !class158.field2043[var10][var36]) {
                                    int var53 = (var8 << 7) + var45;
                                    int var54 = (var9 << 7) + var45;
                                    var35[var36] = arg2.method1323(var53, var54) - arg3.method1323(var53, var54);
                                }
                            }
                        }
                        int var37 = arg3.method1319(var8, var9);
                        int var38 = arg3.method1319(var8 + 1, var9);
                        int var39 = arg3.method1319(var8 + 1, var9 + 1);
                        int var40 = arg3.method1319(var8, var9 + 1);
                        if (arg4 > 0) {
                            boolean var41 = true;
                            if (var13 == 0 && var10 != 0) {
                                var41 = false;
                            }
                            if (var12 > 0 && var14 != null && !var14.field3074) {
                                var41 = false;
                            }
                            if (var41 && var37 == var38 && var37 == var39 && var37 == var40) {
                                this.field9120[arg4][var8][var9] = (byte) class313.method1926(this.field9120[arg4][var8][var9], 4);
                            }
                        }
                        int var42 = 0;
                        int var43 = 0;
                        int var44 = 0;
                        if (this.field9135) {
                            var42 = class501.method3012(var8, var9);
                            var43 = class241.method1546(var8, var9);
                            var44 = class582.method3401(var8, var9);
                        }
                        arg3.method1326(var8, var9, var32, var34, var33, var35, class632.field9238[var10], class534.field7899[var10], class173.field2342[var10], var20, var21, var22, var23, var42, var43, var44, false);
                        class39.method206(arg4, var8, var9);
                    }
                }
            }
            var8++;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lsa;Lqa;BLsa;)V")
    public final void method3637(class543 arg0, class167 arg1, byte arg2, class543 arg3) {
        field9126++;
        if (arg2 != -112) {
            this.method3636(null, null, null, null, 114, true, null);
        }
        int[][] var5 = new int[this.field9139][this.field9125];
        if (class179.field2758 == null || class179.field2758.length != this.field9125) {
            class377.field5549 = new int[this.field9125];
            class16.field143 = new int[this.field9125];
            class257.field3747 = new int[this.field9125];
            class179.field2758 = new int[this.field9125];
            class358.field5201 = new int[this.field9125];
        }
        for (int var6 = 0; var6 < this.field9132; var6++) {
            for (int var8 = 0; var8 < this.field9125; var8++) {
                class179.field2758[var8] = 0;
                class16.field143[var8] = 0;
                class358.field5201[var8] = 0;
                class257.field3747[var8] = 0;
                class377.field5549[var8] = 0;
            }
            for (int var9 = -5; var9 < this.field9139; var9++) {
                for (int var10 = 0; var10 < this.field9125; var10++) {
                    int var19 = var9 + 5;
                    int var10002;
                    if (this.field9139 > var19) {
                        int var20 = this.field9142[var6][var19][var10] & 0xFF;
                        if (var20 > 0) {
                            class467 var21 = this.field9140.method21(var20 - 1, 70);
                            class179.field2758[var10] += var21.field6749;
                            class16.field143[var10] += var21.field6750;
                            class358.field5201[var10] += var21.field6738;
                            class257.field3747[var10] += var21.field6745;
                            var10002 = class377.field5549[var10]++;
                        }
                    }
                    int var22 = var9 - 5;
                    if (var22 >= 0) {
                        int var23 = this.field9142[var6][var22][var10] & 0xFF;
                        if (var23 > 0) {
                            class467 var24 = this.field9140.method21(var23 - 1, arg2 + 206);
                            class179.field2758[var10] -= var24.field6749;
                            class16.field143[var10] -= var24.field6750;
                            class358.field5201[var10] -= var24.field6738;
                            class257.field3747[var10] -= var24.field6745;
                            var10002 = class377.field5549[var10]--;
                        }
                    }
                }
                if (var9 >= 0) {
                    int var11 = 0;
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = 0;
                    int var15 = 0;
                    for (int var16 = -5; var16 < this.field9125; var16++) {
                        int var17 = var16 + 5;
                        if (this.field9125 > var17) {
                            var13 += class358.field5201[var17];
                            var14 += class257.field3747[var17];
                            var12 += class16.field143[var17];
                            var15 += class377.field5549[var17];
                            var11 += class179.field2758[var17];
                        }
                        int var18 = var16 - 5;
                        if (var18 >= 0) {
                            var12 -= class16.field143[var18];
                            var15 -= class377.field5549[var18];
                            var11 -= class179.field2758[var18];
                            var14 -= class257.field3747[var18];
                            var13 -= class358.field5201[var18];
                        }
                        if (var16 >= 0 && var14 > 0 && var15 > 0) {
                            var5[var9][var16] = class593.method3451(var13 / var15, var11 * 256 / var14, var12 / var15, 0);
                        }
                    }
                }
            }
            if (class245.field3589) {
                this.method3640(arg2 ^ 0x40833097, class235.field3455[var6], var6, arg1, var6 == 0 ? arg0 : null, var5, var6 == 0 ? arg3 : null);
            } else {
                this.method3636(var5, var6 == 0 ? arg0 : null, var6 == 0 ? arg3 : null, class235.field3455[var6], var6, false, arg1);
            }
            this.field9142[var6] = null;
            this.field9129[var6] = null;
            this.field9143[var6] = null;
            this.field9118[var6] = null;
        }
        if (!this.field9135) {
            if (class136.field1799 != 0) {
                class632.method3677();
            }
            if (class177.field2689) {
                class595.method3456();
            }
        }
        for (int var7 = 0; var7 < this.field9132; var7++) {
            class235.field3455[var7].method1321();
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIII)V")
    public final void method3638(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 <= 66) {
            this.field9122 = null;
        }
        for (int var6 = 0; var6 < this.field9132; var6++) {
            this.method3642(arg0, arg1, arg3, 0, arg2, var6);
        }
        field9131++;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILli;Lqa;[[B[[BI[ZIIIIILch;[[B)V")
    private final void method3639(int arg0, class467 arg1, class167 arg2, byte[][] arg3, byte[][] arg4, int arg5, boolean[] arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class206 arg12, byte[][] arg13) {
        field9141++;
        boolean[] var15 = arg12 != null && arg12.field3066 ? class327.field4834[arg5] : class74.field864[arg5];
        if (arg8 > 0) {
            if (arg10 > 0) {
                int var16 = arg4[arg10 - 1][arg8 - 1] & 0xFF;
                if (var16 > 0) {
                    class206 var17 = this.field9137.method2347(-16497, var16 - 1);
                    if (var17.field3059 != -1 && var17.field3066) {
                        byte var18 = arg3[arg10 - 1][arg8 - 1];
                        int var19 = arg13[arg10 - 1][arg8 - 1] * 2 + 4 & 0x7;
                        int var20 = class297.method1837(arg2, -4203, var17);
                        if (class10.field93[var18][var19]) {
                            class33.field365[0] = var17.field3059;
                            class43.field515[0] = var20;
                            class265.field3934[0] = arg2.method976() ? var17.field3076 : var17.field3064;
                            class165.field2237[0] = var17.field3058;
                            class349.field5064[0] = var17.field3065;
                            class371.field5371[0] = 256;
                        }
                    }
                }
            }
            if (arg10 < arg11 - 1) {
                int var21 = arg4[arg10 + 1][arg8 - 1] & 0xFF;
                if (var21 > 0) {
                    class206 var22 = this.field9137.method2347(arg9 ^ 0xFFFFDFC7, var21 - 1);
                    if (var22.field3059 != -1 && var22.field3066) {
                        byte var23 = arg3[arg10 + 1][arg8 - 1];
                        int var24 = arg13[arg10 + 1][arg8 - 1] * 2 + 6 & 0x7;
                        int var25 = class297.method1837(arg2, -4203, var22);
                        if (class10.field93[var23][var24]) {
                            class33.field365[2] = var22.field3059;
                            class43.field515[2] = var25;
                            class265.field3934[2] = arg2.method976() ? var22.field3076 : var22.field3064;
                            class165.field2237[2] = var22.field3058;
                            class349.field5064[2] = var22.field3065;
                            class371.field5371[2] = 512;
                        }
                    }
                }
            }
        }
        if ((arg7 - 1) > arg8) {
            if (arg10 > 0) {
                int var26 = arg4[arg10 - 1][arg8 + 1] & 0xFF;
                if (var26 > 0) {
                    class206 var27 = this.field9137.method2347(-16497, var26 - 1);
                    if (var27.field3059 != -1 && var27.field3066) {
                        byte var28 = arg3[arg10 - 1][arg8 + 1];
                        int var29 = arg13[arg10 - 1][arg8 + 1] * 2 + 2 & 0x7;
                        int var30 = class297.method1837(arg2, -4203, var27);
                        if (class10.field93[var28][var29]) {
                            class33.field365[6] = var27.field3059;
                            class43.field515[6] = var30;
                            class265.field3934[6] = arg2.method976() ? var27.field3076 : var27.field3064;
                            class165.field2237[6] = var27.field3058;
                            class349.field5064[6] = var27.field3065;
                            class371.field5371[6] = 64;
                        }
                    }
                }
            }
            if ((arg11 - 1) > arg10) {
                int var31 = arg4[arg10 + 1][arg8 + 1] & 0xFF;
                if (var31 > 0) {
                    class206 var32 = this.field9137.method2347(-16497, var31 - 1);
                    if (var32.field3059 != -1 && var32.field3066) {
                        byte var33 = arg3[arg10 + 1][arg8 + 1];
                        int var34 = arg13[arg10 + 1][arg8 + 1] * 2 & 0x7;
                        int var35 = class297.method1837(arg2, -4203, var32);
                        if (class10.field93[var33][var34]) {
                            class33.field365[4] = var32.field3059;
                            class43.field515[4] = var35;
                            class265.field3934[4] = arg2.method976() ? var32.field3076 : var32.field3064;
                            class165.field2237[4] = var32.field3058;
                            class349.field5064[4] = var32.field3065;
                            class371.field5371[4] = 128;
                        }
                    }
                }
            }
        }
        if (arg8 > 0) {
            int var36 = arg4[arg10][arg8 - 1] & 0xFF;
            if (var36 > 0) {
                class206 var37 = this.field9137.method2347(arg9 - 41145, var36 + -1);
                if (var37.field3059 != -1) {
                    byte var38 = arg3[arg10][arg8 - 1];
                    byte var39 = arg13[arg10][arg8 - 1];
                    if (var37.field3066) {
                        int var40 = 2;
                        int var41 = var39 * 2 + 4;
                        int var42 = class297.method1837(arg2, -4203, var37);
                        for (int var43 = 0; var43 < 3; var43++) {
                            var41 &= 0x7;
                            var40 &= 0x7;
                            if (class10.field93[var38][var41] && class349.field5064[var40] <= var37.field3065) {
                                class33.field365[var40] = var37.field3059;
                                class43.field515[var40] = var42;
                                class265.field3934[var40] = arg2.method976() ? var37.field3076 : var37.field3064;
                                class165.field2237[var40] = var37.field3058;
                                if (class349.field5064[var40] == var37.field3065) {
                                    class371.field5371[var40] = class313.method1926(class371.field5371[var40], 32);
                                } else {
                                    class371.field5371[var40] = 32;
                                }
                                class349.field5064[var40] = var37.field3065;
                            }
                            var40--;
                            var41++;
                        }
                        if (!var15[-(-arg0) & 0x3]) {
                            arg6[0] = class327.field4834[var38][class637.method3693(3, var39 + 2)];
                        }
                    } else if (!var15[arg0 & 0x3]) {
                        arg6[0] = class74.field864[var38][class637.method3693(var39 + 2, 3)];
                    }
                }
            }
        }
        if (arg8 < arg7 - 1) {
            int var44 = arg4[arg10][arg8 + 1] & 0xFF;
            if (var44 > 0) {
                class206 var45 = this.field9137.method2347(-16497, var44 - 1);
                if (var45.field3059 != -1) {
                    byte var46 = arg3[arg10][arg8 + 1];
                    byte var47 = arg13[arg10][arg8 + 1];
                    if (var45.field3066) {
                        int var48 = 4;
                        int var49 = (var47 * 2) + 2;
                        int var50 = class297.method1837(arg2, -4203, var45);
                        for (int var51 = 0; var51 < 3; var51++) {
                            var48 &= 0x7;
                            var49 &= 0x7;
                            if (class10.field93[var46][var49] && var45.field3065 >= class349.field5064[var48]) {
                                class33.field365[var48] = var45.field3059;
                                class43.field515[var48] = var50;
                                class265.field3934[var48] = arg2.method976() ? var45.field3076 : var45.field3064;
                                class165.field2237[var48] = var45.field3058;
                                if (class349.field5064[var48] == var45.field3065) {
                                    class371.field5371[var48] = class313.method1926(class371.field5371[var48], 16);
                                } else {
                                    class371.field5371[var48] = 16;
                                }
                                class349.field5064[var48] = var45.field3065;
                            }
                            var49--;
                            var48++;
                        }
                        if (!var15[arg0 + 2 & 0x3]) {
                            arg6[2] = class327.field4834[var46][class637.method3693(var47, 3)];
                        }
                    } else if (!var15[arg0 + 2 & 0x3]) {
                        arg6[2] = class74.field864[var46][class637.method3693(var47, 3)];
                    }
                }
            }
        }
        if (arg10 > 0) {
            int var52 = arg4[arg10 - 1][arg8] & 0xFF;
            if (var52 > 0) {
                class206 var53 = this.field9137.method2347(-16497, var52 - 1);
                if (var53.field3059 != -1) {
                    byte var54 = arg3[arg10 - 1][arg8];
                    byte var55 = arg13[arg10 - 1][arg8];
                    if (var53.field3066) {
                        int var56 = 6;
                        int var57 = (var55 * 2) + 4;
                        int var58 = class297.method1837(arg2, -4203, var53);
                        for (int var59 = 0; var59 < 3; var59++) {
                            var57 &= 0x7;
                            var56 &= 0x7;
                            if (class10.field93[var54][var57] && class349.field5064[var56] <= var53.field3065) {
                                class33.field365[var56] = var53.field3059;
                                class43.field515[var56] = var58;
                                class265.field3934[var56] = arg2.method976() ? var53.field3076 : var53.field3064;
                                class165.field2237[var56] = var53.field3058;
                                if (class349.field5064[var56] == var53.field3065) {
                                    class371.field5371[var56] = class313.method1926(class371.field5371[var56], 8);
                                } else {
                                    class371.field5371[var56] = 8;
                                }
                                class349.field5064[var56] = var53.field3065;
                            }
                            var57--;
                            var56++;
                        }
                        if (!var15[arg0 + 3 & 0x3]) {
                            arg6[3] = class327.field4834[var54][class637.method3693(3, var55 + 1)];
                        }
                    } else if (!var15[arg0 + 3 & 0x3]) {
                        arg6[3] = class74.field864[var54][class637.method3693(3, var55 + 1)];
                    }
                }
            }
        }
        if (arg10 < (arg11 - 1)) {
            int var60 = arg4[arg10 + 1][arg8] & 0xFF;
            if (var60 > 0) {
                class206 var61 = this.field9137.method2347(-16497, var60 - 1);
                if (var61.field3059 != -1) {
                    byte var62 = arg3[arg10 + 1][arg8];
                    byte var63 = arg13[arg10 + 1][arg8];
                    if (var61.field3066) {
                        int var64 = 4;
                        int var65 = var63 * 2 + 6;
                        int var66 = class297.method1837(arg2, -4203, var61);
                        for (int var67 = 0; var67 < 3; var67++) {
                            var64 &= 0x7;
                            var65 &= 0x7;
                            if (class10.field93[var62][var65] && class349.field5064[var64] <= var61.field3065) {
                                class33.field365[var64] = var61.field3059;
                                class43.field515[var64] = var66;
                                class265.field3934[var64] = arg2.method976() ? var61.field3076 : var61.field3064;
                                class165.field2237[var64] = var61.field3058;
                                if (class349.field5064[var64] == var61.field3065) {
                                    class371.field5371[var64] = class313.method1926(class371.field5371[var64], 4);
                                } else {
                                    class371.field5371[var64] = 4;
                                }
                                class349.field5064[var64] = var61.field3065;
                            }
                            var64--;
                            var65++;
                        }
                        if (!var15[arg0 + 1 & 0x3]) {
                            arg6[1] = class327.field4834[var62][class637.method3693(3, var63 + 3)];
                        }
                    } else if (!var15[arg0 + 1 & 0x3]) {
                        arg6[1] = class74.field864[var62][class637.method3693(var63 + 3, 3)];
                    }
                }
            }
        }
        if (arg9 != 24648) {
            this.field9136 = null;
        }
        if (arg12 == null) {
            return;
        }
        int var68 = class297.method1837(arg2, arg9 - 28851, arg12);
        if (!arg12.field3066) {
            return;
        }
        for (int var69 = 0; var69 < 8; var69++) {
            int var70 = var69 - arg0 * 2 & 0x7;
            if (class10.field93[arg5][var69] && arg12.field3065 >= class349.field5064[var70]) {
                class33.field365[var70] = arg12.field3059;
                class43.field515[var70] = var68;
                class265.field3934[var70] = arg2.method976() ? arg12.field3076 : arg12.field3064;
                class165.field2237[var70] = arg12.field3058;
                if (class349.field5064[var70] == arg12.field3065) {
                    class371.field5371[var70] = class313.method1926(class371.field5371[var70], 2);
                } else {
                    class371.field5371[var70] = 2;
                }
                class349.field5064[var70] = arg12.field3065;
            }
        }
        return;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILsa;ILqa;Lsa;[[ILsa;)V")
    private final void method3640(int arg0, class543 arg1, int arg2, class167 arg3, class543 arg4, int[][] arg5, class543 arg6) {
        if (arg0 != -1082339577) {
            return;
        }
        field9117++;
        byte[][] var8 = this.field9143[arg2];
        byte[][] var9 = this.field9118[arg2];
        byte[][] var10 = this.field9142[arg2];
        byte[][] var11 = this.field9129[arg2];
        for (int var12 = 0; var12 < this.field9139; var12++) {
            int var13 = var12 < this.field9139 - 1 ? var12 + 1 : var12;
            for (int var14 = 0; var14 < this.field9125; var14++) {
                int var15 = this.field9125 - 1 <= var14 ? var14 : var14 + 1;
                if (class555.field8244 == -1 || class169.method1076(var12, arg2, var14, arg0 ^ 0x40830DA3, class555.field8244)) {
                    boolean var16 = false;
                    boolean var17 = false;
                    boolean[] var18 = new boolean[4];
                    int var19 = var8[var12][var14];
                    int var20 = var9[var12][var14];
                    int var21 = var11[var12][var14] & 0xFF;
                    int var22 = var10[var12][var14] & 0xFF;
                    int var23 = var10[var12][var15] & 0xFF;
                    int var24 = var10[var13][var15] & 0xFF;
                    int var25 = var10[var13][var14] & 0xFF;
                    if (var21 != 0 || var22 != 0) {
                        class206 var26 = var21 == 0 ? null : this.field9137.method2347(-16497, var21 - 1);
                        class467 var27 = var22 == 0 ? null : this.field9140.method21(var22 - 1, 70);
                        if (var19 == 0 && var26 == null) {
                            var19 = 12;
                        }
                        class206 var28 = var26;
                        if (var26 != null) {
                            if (var26.field3059 == -1 && var26.field3069 == -1) {
                                var28 = var26;
                                var26 = null;
                            } else if (var27 != null && var19 != 0) {
                                var17 = var26.field3066;
                            }
                        }
                        if ((var19 == 0 || var19 == 12) && var12 > 0 && var14 > 0 && var12 < this.field9139 && var14 < this.field9125) {
                            byte var29 = 0;
                            byte var30 = 0;
                            byte var31 = 0;
                            byte var32 = 0;
                            int var33 = var30 + (var10[var13][var14 - 1] == var22 ? 1 : -1);
                            int var34 = var31 + (var10[var13][var15] == var22 ? 1 : -1);
                            int var35 = var29 + (var10[var12 - 1][var14 - 1] == var22 ? 1 : -1);
                            int var36 = var32 + (var10[var12 - 1][var15] == var22 ? 1 : -1);
                            if (var10[var12][var14 - 1] == var22) {
                                var35++;
                                var33++;
                            } else {
                                var33--;
                                var35--;
                            }
                            if (var10[var13][var14] == var22) {
                                var33++;
                                var34++;
                            } else {
                                var34--;
                                var33--;
                            }
                            if (var10[var12][var15] == var22) {
                                var34++;
                                var36++;
                            } else {
                                var34--;
                                var36--;
                            }
                            if (var10[var12 - 1][var14] == var22) {
                                var35++;
                                var36++;
                            } else {
                                var35--;
                                var36--;
                            }
                            int var37 = var35 - var34;
                            if (var37 < 0) {
                                var37 = -var37;
                            }
                            int var38 = var33 - var36;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            if (var37 == var38) {
                                var37 = arg1.method1319(var12, var14) - arg1.method1319(var13, var15);
                                var38 = arg1.method1319(var13, var14) - arg1.method1319(var12, var15);
                                if (var37 < 0) {
                                    var37 = -var37;
                                }
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                            }
                            var20 = var37 >= var38 ? 0 : 1;
                        }
                        for (int var39 = 0; var39 < 13; var39++) {
                            class349.field5064[var39] = -1;
                            class371.field5371[var39] = 1;
                        }
                        boolean[] var40 = var26 != null && var26.field3066 ? class327.field4834[var19] : class74.field864[var19];
                        this.method3639(var20, var27, arg3, var8, var11, var19, var18, this.field9125, var14, 24648, var12, this.field9139, var26, var9);
                        boolean var41 = var26 != null && var26.field3069 != var26.field3059;
                        if (!var41) {
                            for (int var42 = 0; var42 < 8; var42++) {
                                if (class349.field5064[var42] >= 0 && class43.field515[var42] != class33.field365[var42]) {
                                    var41 = true;
                                    break;
                                }
                            }
                        }
                        if (!var40[var20 + 1 & 0x3]) {
                            var18[1] = class630.method3671(var18[1], class637.method3693(class371.field5371[2], class371.field5371[4]) == 0);
                        }
                        if (!var40[var20 + 3 & 0x3]) {
                            var18[3] = class630.method3671(var18[3], class637.method3693(class371.field5371[6], class371.field5371[0]) == 0);
                        }
                        if (!var40[var20 & 0x3]) {
                            var18[0] = class630.method3671(var18[0], class637.method3693(class371.field5371[0], class371.field5371[2]) == 0);
                        }
                        if (!var40[var20 + 2 & 0x3]) {
                            var18[2] = class630.method3671(var18[2], class637.method3693(class371.field5371[6], class371.field5371[4]) == 0);
                        }
                        if (!var17 && (var19 == 0 || var19 == 12)) {
                            if (var18[0] && !var18[1] && !var18[2] && var18[3]) {
                                var19 = var19 == 0 ? 13 : 14;
                                var18[0] = var18[3] = false;
                                var20 = 0;
                            } else if (var18[0] && var18[1] && !var18[2] && !var18[3]) {
                                var20 = 3;
                                var19 = var19 == 0 ? 13 : 14;
                                var18[0] = var18[1] = false;
                            } else if (!var18[0] && var18[1] && var18[2] && !var18[3]) {
                                var20 = 2;
                                var18[1] = var18[2] = false;
                                var19 = var19 == 0 ? 13 : 14;
                            } else if (!var18[0] && !var18[1] && var18[2] && var18[3]) {
                                var19 = var19 == 0 ? 13 : 14;
                                var20 = 1;
                                var18[2] = var18[3] = false;
                            }
                        }
                        boolean var43 = !var17 && !var18[0] && !var18[2] && !var18[1] && !var18[3];
                        int[] var44 = null;
                        int var45;
                        int[] var46;
                        int[] var47;
                        int var48;
                        int[] var49;
                        if (var43) {
                            var45 = var27 == null ? 0 : class317.field4742[var19];
                            var46 = class632.field9238[var19];
                            var47 = class534.field7899[var19];
                            var48 = var26 == null ? 0 : class203.field3033[var19];
                            var49 = class173.field2342[var19];
                        } else if (var17) {
                            var47 = class614.field9001[var19];
                            var45 = var27 == null ? 0 : class350.field5081[var19];
                            var48 = var26 == null ? 0 : class172.field2329[var19];
                            var44 = class403.field5799[var19];
                            var49 = class362.field5234[var19];
                            var46 = class89.field1141[var19];
                        } else {
                            var49 = class49.field577[var19];
                            var47 = class62.field729[var19];
                            var48 = var26 == null ? 0 : class358.field5197[var19];
                            var46 = class446.field6562[var19];
                            var44 = class142.field1854[var19];
                            var45 = var27 == null ? 0 : class419.field6020[var19];
                        }
                        int var50 = var45 + var48;
                        if (var50 <= 0) {
                            class39.method206(arg2, var12, var14);
                        } else {
                            if (var18[0]) {
                                var50++;
                            }
                            if (var18[2]) {
                                var50++;
                            }
                            if (var18[1]) {
                                var50++;
                            }
                            if (var18[3]) {
                                var50++;
                            }
                            int var51 = 0;
                            int var52 = 0;
                            int var53 = var50 * 3;
                            int[] var54 = var41 ? new int[var53] : null;
                            int[] var55 = new int[var53];
                            int[] var56 = new int[var53];
                            int[] var57 = new int[var53];
                            int[] var58 = new int[var53];
                            int[] var59 = new int[var53];
                            int[] var60 = arg4 == null ? null : new int[var53];
                            int[] var61 = arg4 == null && arg6 == null ? null : new int[var53];
                            int var62 = -1;
                            int var63 = -1;
                            int var64 = 256;
                            if (var26 != null) {
                                var62 = var26.field3059;
                                var63 = arg3.method976() ? var26.field3076 : var26.field3064;
                                var64 = var26.field3058;
                                int var65 = class297.method1837(arg3, -4203, var26);
                                for (int var66 = 0; var66 < var48; var66++) {
                                    boolean var97 = false;
                                    byte var98;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class498.field7477[0] = var46[var51];
                                        class498.field7477[1] = 1;
                                        class498.field7477[2] = var49[var51];
                                        class498.field7477[3] = 1;
                                        class498.field7477[4] = var47[var51];
                                        var98 = 6;
                                        class498.field7477[5] = var49[var51];
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class498.field7477[0] = var46[var51];
                                        class498.field7477[1] = 5;
                                        class498.field7477[2] = var49[var51];
                                        class498.field7477[3] = 5;
                                        class498.field7477[4] = var47[var51];
                                        var98 = 6;
                                        class498.field7477[5] = var49[var51];
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class498.field7477[0] = var46[var51];
                                        class498.field7477[1] = 3;
                                        class498.field7477[2] = var49[var51];
                                        class498.field7477[3] = 3;
                                        class498.field7477[4] = var47[var51];
                                        class498.field7477[5] = var49[var51];
                                        var98 = 6;
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class498.field7477[0] = var46[var51];
                                        class498.field7477[1] = 7;
                                        class498.field7477[2] = var49[var51];
                                        class498.field7477[3] = 7;
                                        class498.field7477[4] = var47[var51];
                                        var98 = 6;
                                        class498.field7477[5] = var49[var51];
                                    } else {
                                        class498.field7477[0] = var46[var51];
                                        class498.field7477[1] = var47[var51];
                                        class498.field7477[2] = var49[var51];
                                        var98 = 3;
                                    }
                                    var51++;
                                    for (int var99 = 0; var99 < var98; var99++) {
                                        int var100 = class498.field7477[var99];
                                        int var101 = var100 - var20 * 2 & 0x7;
                                        int var102 = this.field9128[var100];
                                        int var103 = this.field9122[var100];
                                        int var104;
                                        int var105;
                                        if (var20 == 1) {
                                            var104 = 128 - var102;
                                            var105 = var103;
                                        } else if (var20 == 2) {
                                            var105 = 128 - var102;
                                            var104 = 128 - var103;
                                        } else if (var20 == 3) {
                                            var105 = 128 - var103;
                                            var104 = var102;
                                        } else {
                                            var104 = var103;
                                            var105 = var102;
                                        }
                                        var55[var52] = var105;
                                        var56[var52] = var104;
                                        if (var60 != null && class10.field93[var19][var100]) {
                                            int var106 = (var12 << 7) + var105;
                                            int var107 = (var14 << 7) + var104;
                                            var60[var52] = arg4.method1323(var106, var107) - arg1.method1323(var106, var107);
                                        }
                                        if (var61 != null) {
                                            if (arg4 != null && !class10.field93[var19][var100]) {
                                                int var108 = (var12 << 7) + var105;
                                                int var109 = (var14 << 7) + var104;
                                                var61[var52] = arg1.method1323(var108, var109) - arg4.method1323(var108, var109);
                                            } else if (arg6 != null && !class158.field2043[var19][var100]) {
                                                int var110 = (var12 << 7) + var105;
                                                int var111 = (var14 << 7) + var104;
                                                var61[var52] = arg6.method1323(var110, var111) - arg1.method1323(var110, var111);
                                            }
                                        }
                                        if (var100 < 8 && class349.field5064[var101] > var26.field3065) {
                                            if (var54 != null) {
                                                var54[var52] = class43.field515[var101];
                                            }
                                            var59[var52] = class165.field2237[var101];
                                            var58[var52] = class265.field3934[var101];
                                            var57[var52] = class33.field365[var101];
                                        } else {
                                            if (var54 != null) {
                                                var54[var52] = var65;
                                            }
                                            var58[var52] = arg3.method976() ? var26.field3076 : var26.field3064;
                                            var59[var52] = var26.field3058;
                                            var57[var52] = var62;
                                        }
                                        var52++;
                                    }
                                }
                                if (!this.field9135 && arg2 == 0) {
                                    class328.method2046(var12, var14, var26.field3071, var26.field3056 * 8, var26.field3057);
                                }
                                if (var19 != 12 && var26.field3059 != -1 && var26.field3061) {
                                    var16 = true;
                                }
                            } else if (var43) {
                                var51 += class203.field3033[var19];
                            } else if (var17) {
                                var51 += class172.field2329[var19];
                            } else {
                                var51 += class358.field5197[var19];
                            }
                            if (var27 != null) {
                                if (var25 == 0) {
                                    var25 = var22;
                                }
                                if (var23 == 0) {
                                    var23 = var22;
                                }
                                if (var24 == 0) {
                                    var24 = var22;
                                }
                                class467 var67 = this.field9140.method21(var22 - 1, 90);
                                class467 var68 = this.field9140.method21(var23 - 1, 97);
                                class467 var69 = this.field9140.method21(var24 - 1, 108);
                                class467 var70 = this.field9140.method21(var25 - 1, arg0 ^ 0xBF7CCF5A);
                                for (int var71 = 0; var71 < var45; var71++) {
                                    boolean var72 = false;
                                    byte var73;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class498.field7477[0] = var46[var51];
                                        class498.field7477[1] = 1;
                                        class498.field7477[2] = var49[var51];
                                        class498.field7477[3] = 1;
                                        class498.field7477[4] = var47[var51];
                                        var73 = 6;
                                        class498.field7477[5] = var49[var51];
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class498.field7477[0] = var46[var51];
                                        class498.field7477[1] = 5;
                                        class498.field7477[2] = var49[var51];
                                        class498.field7477[3] = 5;
                                        class498.field7477[4] = var47[var51];
                                        class498.field7477[5] = var49[var51];
                                        var73 = 6;
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class498.field7477[0] = var46[var51];
                                        class498.field7477[1] = 3;
                                        class498.field7477[2] = var49[var51];
                                        class498.field7477[3] = 3;
                                        class498.field7477[4] = var47[var51];
                                        var73 = 6;
                                        class498.field7477[5] = var49[var51];
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class498.field7477[0] = var46[var51];
                                        class498.field7477[1] = 7;
                                        class498.field7477[2] = var49[var51];
                                        class498.field7477[3] = 7;
                                        class498.field7477[4] = var47[var51];
                                        class498.field7477[5] = var49[var51];
                                        var73 = 6;
                                    } else {
                                        class498.field7477[0] = var46[var51];
                                        class498.field7477[1] = var47[var51];
                                        var73 = 3;
                                        class498.field7477[2] = var49[var51];
                                    }
                                    var51++;
                                    for (int var74 = 0; var74 < var73; var74++) {
                                        int var75 = class498.field7477[var74];
                                        int var76 = var75 - (var20 * 2) & 0x7;
                                        int var77 = this.field9128[var75];
                                        int var78 = this.field9122[var75];
                                        int var79;
                                        int var80;
                                        if (var20 == 1) {
                                            var79 = 128 - var77;
                                            var80 = var78;
                                        } else if (var20 == 2) {
                                            var79 = 128 - var78;
                                            var80 = 128 - var77;
                                        } else if (var20 == 3) {
                                            var79 = var77;
                                            var80 = 128 - var78;
                                        } else {
                                            var79 = var78;
                                            var80 = var77;
                                        }
                                        var55[var52] = var80;
                                        var56[var52] = var79;
                                        if (var60 != null && class10.field93[var19][var75]) {
                                            int var81 = (var12 << 7) + var80;
                                            int var82 = (var14 << 7) + var79;
                                            var60[var52] = arg4.method1323(var81, var82) - arg1.method1323(var81, var82);
                                        }
                                        if (var61 != null) {
                                            if (arg4 != null && !class10.field93[var19][var75]) {
                                                int var83 = (var12 << 7) + var80;
                                                int var84 = (var14 << 7) + var79;
                                                var61[var52] = arg1.method1323(var83, var84) - arg4.method1323(var83, var84);
                                            } else if (arg6 != null && !class158.field2043[var19][var75]) {
                                                int var85 = (var12 << 7) + var80;
                                                int var86 = (var14 << 7) + var79;
                                                var61[var52] = arg6.method1323(var85, var86) - arg1.method1323(var85, var86);
                                            }
                                        }
                                        if (var75 < 8 && class349.field5064[var76] >= 0) {
                                            if (var54 != null) {
                                                var54[var52] = class43.field515[var76];
                                            }
                                            var59[var52] = class165.field2237[var76];
                                            var58[var52] = class265.field3934[var76];
                                            var57[var52] = class33.field365[var76];
                                        } else {
                                            if (var17 && class10.field93[var19][var75]) {
                                                var58[var52] = var63;
                                                var59[var52] = var64;
                                                var57[var52] = var62;
                                            } else if (var80 == 0 && var79 == 0) {
                                                var57[var52] = arg5[var12][var14];
                                                var58[var52] = var67.field6739;
                                                var59[var52] = var67.field6747;
                                            } else if (var80 == 0 && var79 == 128) {
                                                var57[var52] = arg5[var12][var15];
                                                var58[var52] = var68.field6739;
                                                var59[var52] = var68.field6747;
                                            } else if (var80 == 128 && var79 == 128) {
                                                var57[var52] = arg5[var13][var15];
                                                var58[var52] = var69.field6739;
                                                var59[var52] = var69.field6747;
                                            } else if (var80 == 128 && var79 == 0) {
                                                var57[var52] = arg5[var13][var14];
                                                var58[var52] = var70.field6739;
                                                var59[var52] = var70.field6747;
                                            } else {
                                                if (var80 < 64) {
                                                    if (var79 >= 64) {
                                                        var58[var52] = var68.field6739;
                                                        var59[var52] = var68.field6747;
                                                    } else {
                                                        var58[var52] = var67.field6739;
                                                        var59[var52] = var67.field6747;
                                                    }
                                                } else if (var79 < 64) {
                                                    var58[var52] = var70.field6739;
                                                    var59[var52] = var70.field6747;
                                                } else {
                                                    var58[var52] = var69.field6739;
                                                    var59[var52] = var69.field6747;
                                                }
                                                int var87 = class203.method1309(var80 << 7 >> 7, arg5[var13][var14], arg0 ^ 0xBF7CCC87, arg5[var12][var14]);
                                                int var88 = class203.method1309(var80 << 7 >> 7, arg5[var13][var15], 896, arg5[var12][var15]);
                                                var57[var52] = class203.method1309(var79 << 7 >> 7, var88, 896, var87);
                                            }
                                            if (var54 != null) {
                                                var54[var52] = var57[var52];
                                            }
                                        }
                                        var52++;
                                    }
                                }
                                if (var19 != 0 && var27.field6746) {
                                    var16 = true;
                                }
                            }
                            int var89 = arg1.method1319(var12, var14);
                            int var90 = arg1.method1319(var13, var14);
                            int var91 = arg1.method1319(var13, var15);
                            int var92 = arg1.method1319(var12, var15);
                            if (arg2 > 0) {
                                boolean var93 = true;
                                if (var22 == 0 && var19 != 0) {
                                    var93 = false;
                                }
                                if (var21 > 0 && var28 != null && !var28.field3074) {
                                    var93 = false;
                                }
                                if (var93 && var89 == var90 && var89 == var91 && var89 == var92) {
                                    this.field9120[arg2][var12][var14] = (byte) class313.method1926(this.field9120[arg2][var12][var14], 4);
                                }
                            }
                            int var94 = 0;
                            int var95 = 0;
                            int var96 = 0;
                            if (this.field9135) {
                                var94 = class501.method3012(var12, var14);
                                var95 = class241.method1546(var12, var14);
                                var96 = class582.method3401(var12, var14);
                            }
                            arg1.method1320(var12, var14, var55, var60, var56, var61, var57, var54, var58, var59, var94, var95, var96, var16);
                            class39.method206(arg2, var12, var14);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V")
    public static void method3641(int arg0) {
        field9121 = null;
        if (arg0 != 18075) {
            field9121 = null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIII)V")
    private final void method3642(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var7 = arg0; var7 < (arg0 + arg4); var7++) {
            for (int var10 = arg1; var10 < (arg1 + arg2); var10++) {
                if (var10 >= 0 && this.field9139 > var10 && var7 >= 0 && var7 < this.field9125) {
                    this.field9138[arg5][var10][var7] = arg5 <= 0 ? 0 : this.field9138[arg5 - 1][var10][var7] - 240;
                }
            }
        }
        field9133++;
        if (arg1 > 0 && this.field9139 > arg1) {
            for (int var8 = arg0 + 1; var8 < (arg0 + arg4); var8++) {
                if (var8 >= 0 && this.field9125 > var8) {
                    this.field9138[arg5][arg1][var8] = this.field9138[arg5][arg1 - 1][var8];
                }
            }
        }
        if (arg0 > 0 && this.field9125 > arg0) {
            for (int var9 = arg1 + 1; var9 < arg1 + arg2; var9++) {
                if (var9 >= 0 && this.field9139 > var9) {
                    this.field9138[arg5][var9][arg0] = this.field9138[arg5][var9][arg0 - 1];
                }
            }
        }
        if (arg1 < arg3 || arg0 < 0 || arg1 >= this.field9139 || this.field9125 <= arg0) {
            return;
        }
        if (arg5 == 0) {
            if (arg1 > 0 && this.field9138[arg5][arg1 - 1][arg0] != 0) {
                this.field9138[arg5][arg1][arg0] = this.field9138[arg5][arg1 - 1][arg0];
                return;
            }
            if (arg0 > 0 && this.field9138[arg5][arg1][arg0 - 1] != 0) {
                this.field9138[arg5][arg1][arg0] = this.field9138[arg5][arg1][arg0 - 1];
                return;
            }
            if (arg1 > 0 && arg0 > 0 && this.field9138[arg5][arg1 - 1][arg0 - 1] != 0) {
                this.field9138[arg5][arg1][arg0] = this.field9138[arg5][arg1 - 1][arg0 - 1];
                return;
            }
        } else if (arg1 <= 0 || this.field9138[arg5 - 1][arg1 - 1][arg0] == this.field9138[arg5][arg1 - 1][arg0]) {
            if (arg0 > 0 && this.field9138[arg5 - 1][arg1][arg0 - 1] != this.field9138[arg5][arg1][arg0 - 1]) {
                this.field9138[arg5][arg1][arg0] = this.field9138[arg5][arg1][arg0 - 1];
                return;
            }
            if (arg1 > 0 && arg0 > 0 && this.field9138[arg5 - 1][arg1 - 1][arg0 - 1] != this.field9138[arg5][arg1 - 1][arg0 - 1]) {
                this.field9138[arg5][arg1][arg0] = this.field9138[arg5][arg1 - 1][arg0 - 1];
                return;
            }
            return;
        } else {
            this.field9138[arg5][arg1][arg0] = this.field9138[arg5][arg1 - 1][arg0];
        }
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(IIIZLul;Lar;)V")
    public class623(int arg0, int arg1, int arg2, boolean arg3, class388 arg4, class4 arg5) {
        this.field9135 = arg3;
        this.field9132 = arg0;
        this.field9140 = arg5;
        this.field9137 = arg4;
        this.field9125 = arg2;
        this.field9139 = arg1;
        this.field9120 = new byte[this.field9132][this.field9139 + 1][this.field9125 + 1];
        this.field9129 = new byte[this.field9132][this.field9139][this.field9125];
        this.field9138 = new int[this.field9132][this.field9139 + 1][this.field9125 + 1];
        this.field9118 = new byte[this.field9132][this.field9139][this.field9125];
        this.field9143 = new byte[this.field9132][this.field9139][this.field9125];
        this.field9142 = new byte[this.field9132][this.field9139][this.field9125];
    }
}
