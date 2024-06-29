import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class91 extends class193 {

    @OriginalMember(owner = "client!bh", name = "t", descriptor = "Llh;")
    private class59 field1239;

    @OriginalMember(owner = "client!bh", name = "o", descriptor = "I")
    private int field1234;

    @OriginalMember(owner = "client!bh", name = "F", descriptor = "[[I")
    public int[][] field1251;

    @OriginalMember(owner = "client!bh", name = "y", descriptor = "[[I")
    private int[][] field1244;

    @OriginalMember(owner = "client!bh", name = "r", descriptor = "I")
    private int field1237;

    @OriginalMember(owner = "client!bh", name = "s", descriptor = "I")
    private int field1238;

    @OriginalMember(owner = "client!bh", name = "C", descriptor = "[[B")
    private byte[][] field1248;

    @OriginalMember(owner = "client!bh", name = "D", descriptor = "[[B")
    private byte[][] field1249;

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "I")
    private int field1229;

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "I")
    private int field1230;

    @OriginalMember(owner = "client!bh", name = "l", descriptor = "I")
    private int field1231;

    @OriginalMember(owner = "client!bh", name = "n", descriptor = "I")
    private int field1233;

    @OriginalMember(owner = "client!bh", name = "q", descriptor = "I")
    private int field1236;

    @OriginalMember(owner = "client!bh", name = "u", descriptor = "I")
    private int field1240;

    @OriginalMember(owner = "client!bh", name = "v", descriptor = "I")
    private int field1241;

    @OriginalMember(owner = "client!bh", name = "x", descriptor = "I")
    private int field1243;

    @OriginalMember(owner = "client!bh", name = "z", descriptor = "I")
    private int field1245;

    @OriginalMember(owner = "client!bh", name = "A", descriptor = "I")
    private int field1246;

    @OriginalMember(owner = "client!bh", name = "B", descriptor = "I")
    private int field1247;

    @OriginalMember(owner = "client!bh", name = "G", descriptor = "I")
    private int field1252;

    @OriginalMember(owner = "client!bh", name = "E", descriptor = "[[Ln;")
    private class214[][] field1250;

    @OriginalMember(owner = "client!bh", name = "p", descriptor = "[[Lds;")
    private class253[][] field1235;

    @OriginalMember(owner = "client!bh", name = "m", descriptor = "[[Lan;")
    private class259[][] field1232;

    @OriginalMember(owner = "client!bh", name = "w", descriptor = "[[Lmh;")
    private class404[][] field1242;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)Z", line = 4)
    private final boolean method721(int arg0) {
        if ((this.field1234 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else {
            return arg0 == 8;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)I", line = 18)
    public final int method722(int arg0, int arg1) {
        return this.field1251[arg0][arg1];
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIIIII[[ZLho;[I[I)V", line = 24)
    private final void method723(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class130 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field1707 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field1250[var16][var17] != null) {
                        class214 var18 = this.field1250[var16][var17];
                        if (var18.field2989 != -1 && (var18.field2984 & 2) == 0 && var18.field2986 == -1) {
                            int var19 = this.field1239.method487(var18.field2989);
                            arg8.method939(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class373.method2452(var18.field2983 & 65535, var19, (byte) 99), class373.method2452(var18.field2985 & 65535, var19, (byte) 99), class373.method2452(var18.field2988 & 65535, var19, (byte) 106));
                            arg8.method939(var15, var15, var15 - var13, var14, var13 + var14, var14, class373.method2452(var18.field2987 & 65535, var19, (byte) 103), class373.method2452(var18.field2988 & 65535, var19, (byte) 107), class373.method2452(var18.field2985 & 65535, var19, (byte) 117));
                        } else if (var18.field2986 == -1) {
                            arg8.method939(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field2983 & 65535, var18.field2985 & 65535, var18.field2988 & 65535);
                            arg8.method939(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field2987 & 65535, var18.field2988 & 65535, var18.field2985 & 65535);
                        } else {
                            int var20 = var18.field2986;
                            arg8.method939(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var20, var20, var20);
                            arg8.method939(var15, var15, var15 - var13, var14, var13 + var14, var14, var20, var20, var20);
                        }
                    } else if (this.field1232[var16][var17] != null) {
                        class259 var21 = this.field1232[var16][var17];
                        for (int var22 = 0; var22 < var21.field3815; ++var22) {
                            arg9[var22] = (var21.field3806[var22] - this.field1237 * var16) * var13 / this.field1237 + var14;
                            arg10[var22] = var15 - (var21.field3811[var22] - this.field1237 * var17) * var13 / this.field1237;
                        }
                        for (int var23 = 0; var23 < var21.field3816; ++var23) {
                            short var24 = var21.field3812[var23];
                            short var25 = var21.field3813[var23];
                            short var26 = var21.field3814[var23];
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field3808 != null && var21.field3808[var23] != -1) {
                                int var33 = var21.field3808[var23];
                                arg8.method939(var30, var31, var32, var27, var28, var29, class373.method2452(var21.field3817[var24], var33, (byte) 117), class373.method2452(var21.field3817[var25], var33, (byte) 94), class373.method2452(var21.field3817[var26], var33, (byte) 113));
                            } else if (var21.field3810 != null && var21.field3810[var23] != -1) {
                                int var34 = this.field1239.method487(var21.field3810[var23]);
                                arg8.method939(var30, var31, var32, var27, var28, var29, class373.method2452(var21.field3817[var24], var34, (byte) 77), class373.method2452(var21.field3817[var25], var34, (byte) 62), class373.method2452(var21.field3817[var26], var34, (byte) 98));
                            } else {
                                int var35 = var21.field3809[var23];
                                arg8.method939(var30, var31, var32, var27, var28, var29, class373.method2452(var21.field3817[var24], var35, (byte) 121), class373.method2452(var21.field3817[var25], var35, (byte) 72), class373.method2452(var21.field3817[var26], var35, (byte) 79));
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field1707 = true;
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(II)V", line = 155)
    public final void method724(int arg0, int arg1) {
        class334 var3 = this.field1239.method459(Thread.currentThread());
        var3.field4905.field1708 = 0;
        if (this.field1242 != null) {
            this.method732(arg0, arg1, this.field1239.field901, var3.field4905, var3.field4945, var3.field4950, var3.field4954);
        } else {
            if (this.field1250 != null) {
                this.method736(arg0, arg1, var3.field4905, var3.field4945, var3.field4950, var3.field4954);
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(II)I", line = 167)
    public final int method725(int arg0, int arg1) {
        int var3 = arg0 >> this.field1238;
        int var4 = arg1 >> this.field1238;
        if (var3 >= 0 && var4 >= 0 && var3 <= super.field2681 - 1 && var4 <= super.field2685 - 1) {
            int var5 = arg0 & this.field1237 - 1;
            int var6 = arg1 & this.field1237 - 1;
            int var7 = (this.field1237 - var5) * this.field1251[var3][var4] + this.field1251[var3 + 1][var4] * var5 >> this.field1238;
            int var8 = (this.field1237 - var5) * this.field1251[var3][var4 + 1] + this.field1251[var3 + 1][var4 + 1] * var5 >> this.field1238;
            return (this.field1237 - var6) * var7 + var6 * var8 >> this.field1238;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V", line = 188)
    public final void method726(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9, int arg10, boolean arg11) {
        if (this.field1242 == null) {
            this.field1242 = new class404[super.field2681][super.field2685];
            this.field1235 = new class253[super.field2681][super.field2685];
        } else if (this.field1250 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var13 = 0; var13 < arg5.length; ++var13) {
                if (arg5[var13] == -1) {
                    arg5[var13] = 0;
                } else {
                    arg5[var13] = class72.field1019[class357.method2347((byte) 87, arg5[var13]) & 65535] << 8 | 255;
                }
            }
            if (arg6 != null) {
                for (int var14 = 0; var14 < arg6.length; ++var14) {
                    if (arg6[var14] == -1) {
                        arg6[var14] = 0;
                    } else {
                        arg6[var14] = class72.field1019[class357.method2347((byte) 87, arg6[var14]) & 65535] << 8 | 255;
                    }
                }
            }
            boolean var15 = true;
            int var16 = -1;
            int var17 = -1;
            int var18 = -1;
            int var19 = -1;
            if (arg2.length == 6) {
                for (int var20 = 0; var20 < 6; ++var20) {
                    if (arg2[var20] == 0 && arg4[var20] == 0) {
                        if (var16 != -1 && arg5[var16] != arg5[var20]) {
                            var15 = false;
                            break;
                        }
                        var16 = var20;
                    } else if (arg2[var20] == this.field1237 && arg4[var20] == 0) {
                        if (var17 != -1 && arg5[var17] != arg5[var20]) {
                            var15 = false;
                            break;
                        }
                        var17 = var20;
                    } else if (arg2[var20] == this.field1237 && arg4[var20] == this.field1237) {
                        if (var18 != -1 && arg5[var18] != arg5[var20]) {
                            var15 = false;
                            break;
                        }
                        var18 = var20;
                    } else if (arg2[var20] == 0 && arg4[var20] == this.field1237) {
                        if (var19 != -1 && arg5[var19] != arg5[var20]) {
                            var15 = false;
                            break;
                        }
                        var19 = var20;
                    }
                }
                if (var16 == -1 || var17 == -1 || var18 == -1 || var19 == -1) {
                    var15 = false;
                }
                if (var15) {
                    if (arg3 != null) {
                        for (int var21 = 0; var21 < 4; ++var21) {
                            if (arg3[var21] != 0) {
                                var15 = false;
                                break;
                            }
                        }
                    }
                    if (var15) {
                        for (int var22 = 1; var22 < 4; ++var22) {
                            if (arg2[var22] != arg2[0] && arg2[0] + this.field1237 != arg2[var22] && arg2[0] - this.field1237 != arg2[var22]) {
                                var15 = false;
                                break;
                            }
                            if (arg4[var22] != arg4[0] && arg4[0] + this.field1237 != arg4[var22] && arg4[0] - this.field1237 != arg4[var22]) {
                                var15 = false;
                                break;
                            }
                        }
                    }
                }
            } else {
                var15 = false;
            }
            if (var15) {
                class404 var23 = new class404();
                int var24 = arg5[0];
                int var25 = arg7[0];
                if (arg6 != null) {
                    var23.field5880 = arg6[0] >> 8;
                    if (var24 == 0) {
                        var23.field5881 = (byte) (var23.field5881 | 2);
                    }
                } else if (var24 == 0) {
                    return;
                }
                if (this.field1251[arg0 + 1][arg1] == this.field1251[arg0][arg1] && this.field1251[arg0 + 1][arg1 + 1] == this.field1251[arg0][arg1] && this.field1251[arg0][arg1 + 1] == this.field1251[arg0][arg1]) {
                    var23.field5881 = (byte) (var23.field5881 | 1);
                }
                if (var25 != -1 && (var23.field5881 & 2) == 0 && !this.field1239.field909.method1962(var25, -11999).field26) {
                    var23.field5885 = this.field1248[arg0][arg1] - this.field1249[arg0][arg1];
                    var23.field5882 = this.field1248[arg0 + 1][arg1] - this.field1249[arg0 + 1][arg1];
                    var23.field5884 = this.field1248[arg0 + 1][arg1 + 1] - this.field1249[arg0 + 1][arg1 + 1];
                    var23.field5879 = this.field1248[arg0][arg1 + 1] - this.field1249[arg0][arg1 + 1];
                    var23.field5883 = (short) var25;
                } else {
                    int var26;
                    if (this.field1244 != null && arg10 != 0) {
                        var26 = this.field1244[arg0][arg1] * 255 / arg10;
                        if (var26 < 0) {
                            var26 = 0;
                        } else if (var26 > 255) {
                            var26 = 255;
                        }
                    } else {
                        var26 = 0;
                    }
                    var23.field5885 = class254.method1644(var26, arg9, -30, method730(arg5[var16] >> 8, this.field1248[arg0][arg1] - this.field1249[arg0][arg1]));
                    if (var23.field5880 != 0) {
                        var23.field5885 |= 255 - (this.field1248[arg0][arg1] - this.field1249[arg0][arg1]) << 25;
                    }
                    int var27;
                    if (this.field1244 != null && arg10 != 0) {
                        var27 = this.field1244[arg0 + 1][arg1] * 255 / arg10;
                        if (var27 < 0) {
                            var27 = 0;
                        } else if (var27 > 255) {
                            var27 = 255;
                        }
                    } else {
                        var27 = 0;
                    }
                    var23.field5882 = class254.method1644(var27, arg9, -77, method730(arg5[var17] >> 8, this.field1248[arg0 + 1][arg1] - this.field1249[arg0 + 1][arg1]));
                    if (var23.field5880 != 0) {
                        var23.field5882 |= 255 - (this.field1248[arg0 + 1][arg1] - this.field1249[arg0 + 1][arg1]) << 25;
                    }
                    int var28;
                    if (this.field1244 != null && arg10 != 0) {
                        var28 = this.field1244[arg0 + 1][arg1 + 1] * 255 / arg10;
                        if (var28 < 0) {
                            var28 = 0;
                        } else if (var28 > 255) {
                            var28 = 255;
                        }
                    } else {
                        var28 = 0;
                    }
                    var23.field5884 = class254.method1644(var28, arg9, -39, method730(arg5[var18] >> 8, this.field1248[arg0 + 1][arg1 + 1] - this.field1249[arg0 + 1][arg1 + 1]));
                    if (var23.field5880 != 0) {
                        var23.field5884 |= 255 - (this.field1248[arg0 + 1][arg1 + 1] - this.field1249[arg0 + 1][arg1 + 1]) << 25;
                    }
                    int var29;
                    if (this.field1244 != null && arg10 != 0) {
                        var29 = this.field1244[arg0][arg1 + 1] * 255 / arg10;
                        if (var29 < 0) {
                            var29 = 0;
                        } else if (var29 > 255) {
                            var29 = 255;
                        }
                    } else {
                        var29 = 0;
                    }
                    var23.field5879 = class254.method1644(var29, arg9, -108, method730(arg5[var19] >> 8, this.field1248[arg0][arg1 + 1] - this.field1249[arg0][arg1 + 1]));
                    if (var23.field5880 != 0) {
                        var23.field5879 |= 255 - (this.field1248[arg0][arg1 + 1] - this.field1249[arg0][arg1 + 1]) << 25;
                    }
                    var23.field5883 = -1;
                }
                this.field1242[arg0][arg1] = var23;
            } else {
                class253 var30 = new class253();
                var30.field3705 = (short) arg2.length;
                var30.field3699 = (short) (arg2.length / 3);
                var30.field3704 = new short[var30.field3705];
                var30.field3702 = new short[var30.field3705];
                var30.field3703 = new short[var30.field3705];
                var30.field3696 = new int[var30.field3705];
                if (this.field1244 != null) {
                    var30.field3701 = new short[var30.field3705];
                }
                for (int var31 = 0; var31 < var30.field3705; ++var31) {
                    int var46 = arg2[var31];
                    int var47 = arg4[var31];
                    boolean var48 = false;
                    int var49;
                    if (var46 == 0 && var47 == 0) {
                        var49 = this.field1248[arg0][arg1] - this.field1249[arg0][arg1];
                    } else if (var46 == 0 && this.field1237 == var47) {
                        var49 = this.field1248[arg0][arg1 + 1] - this.field1249[arg0][arg1 + 1];
                    } else if (this.field1237 == var46 && this.field1237 == var47) {
                        var49 = this.field1248[arg0 + 1][arg1 + 1] - this.field1249[arg0 + 1][arg1 + 1];
                    } else if (this.field1237 == var46 && var47 == 0) {
                        var49 = this.field1248[arg0 + 1][arg1] - this.field1249[arg0 + 1][arg1];
                    } else {
                        int var50 = (this.field1248[arg0 + 1][arg1] - this.field1249[arg0 + 1][arg1]) * var46 + (this.field1248[arg0][arg1] - this.field1249[arg0][arg1]) * (this.field1237 - var46);
                        int var51 = (this.field1248[arg0 + 1][arg1 + 1] - this.field1249[arg0 + 1][arg1 + 1]) * var46 + (this.field1248[arg0][arg1 + 1] - this.field1249[arg0][arg1 + 1]) * (this.field1237 - var46);
                        var49 = (this.field1237 - var47) * var50 + var47 * var51 >> this.field1238 * 2;
                    }
                    short var52 = (short) ((arg0 << this.field1238) + var46);
                    short var53 = (short) ((arg1 << this.field1238) + var47);
                    var30.field3704[var31] = var52;
                    var30.field3703[var31] = var53;
                    var30.field3702[var31] = (short) (this.method725(var52, var53) + (arg3 != null ? arg3[var31] : 0));
                    if (var49 < 0) {
                        var49 = 0;
                    }
                    if (arg7[var31] != -1 && !this.field1239.field909.method1962(arg7[var31], -11999).field26) {
                        var30.field3696[var31] = var49;
                    } else if (arg5[var31] == 0) {
                        if (arg6 != null) {
                            var30.field3696[var31] = var49 << 25;
                        } else {
                            var30.field3696[var31] = 0;
                        }
                    } else {
                        int var54 = 0;
                        if (this.field1244 != null) {
                            boolean var55 = false;
                            int var56;
                            if (var46 == 0 && var47 == 0) {
                                var56 = this.field1244[arg0][arg1];
                            } else if (var46 == 0 && this.field1237 == var47) {
                                var56 = this.field1244[arg0][arg1 + 1];
                            } else if (this.field1237 == var46 && this.field1237 == var47) {
                                var56 = this.field1244[arg0 + 1][arg1 + 1];
                            } else if (this.field1237 == var46 && var47 == 0) {
                                var56 = this.field1244[arg0 + 1][arg1];
                            } else {
                                int var57 = (this.field1237 - var46) * this.field1244[arg0][arg1] + this.field1244[arg0 + 1][arg1] * var46;
                                int var58 = (this.field1237 - var46) * this.field1244[arg0][arg1 + 1] + this.field1244[arg0 + 1][arg1 + 1] * var46;
                                var56 = (this.field1237 - var47) * var57 + var47 * var58 >> this.field1238 * 2;
                            }
                            var30.field3701[var31] = (short) var56;
                            if (arg10 != 0) {
                                var54 = var56 * 255 / arg10;
                                if (var54 < 0) {
                                    var54 = 0;
                                } else if (var54 > 255) {
                                    var54 = 255;
                                }
                            }
                        }
                        var30.field3696[var31] = class254.method1644(var54, arg9, -96, method730(arg5[var31] >> 8, var49));
                        if (arg6 != null) {
                            var30.field3696[var31] |= var49 << 25;
                        }
                    }
                }
                boolean var32 = false;
                for (int var33 = 0; var33 < var30.field3699; ++var33) {
                    if (arg7[var33 * 3] != -1 && !this.field1239.field909.method1962(arg7[var33 * 3], -11999).field26) {
                        var32 = true;
                    }
                }
                if (arg6 != null) {
                    var30.field3697 = new int[var30.field3699];
                }
                if (var32) {
                    var30.field3698 = new short[var30.field3699];
                    var30.field3700 = new short[var30.field3699];
                }
                for (int var34 = 0; var34 < var30.field3699; ++var34) {
                    int var35 = var34 * 3;
                    if (arg6 != null && arg6[var35] != 0) {
                        var30.field3697[var34] = arg6[var35] >> 8;
                    }
                    if (var32) {
                        int var36 = var35 + 1;
                        int var37 = var36 + 1;
                        boolean var38 = false;
                        boolean var39 = true;
                        int var40 = arg7[var35];
                        if (var40 != -1 && !this.field1239.field909.method1962(var40, -11999).field26) {
                            var38 = true;
                        } else {
                            var39 = false;
                        }
                        int var41 = arg7[var36];
                        if (var41 != -1 && !this.field1239.field909.method1962(var41, -11999).field26) {
                            var38 = true;
                        } else {
                            var39 = false;
                        }
                        int var42 = arg7[var37];
                        if (var42 != -1 && !this.field1239.field909.method1962(var42, -11999).field26) {
                            var38 = true;
                        } else {
                            var39 = false;
                        }
                        if (var39) {
                            var30.field3698[var34] = (short) var42;
                            var30.field3700[var34] = (short) arg8[var35];
                        } else {
                            if (var38) {
                                int var43 = arg7[var35];
                                if (var43 != -1 && !this.field1239.field909.method1962(var43, -11999).field26) {
                                    var30.field3696[var35] = class72.field1019[class357.method2347((byte) 87, this.field1239.field909.method1962(var43, -11999).field37 & 65535) & 65535];
                                }
                                int var44 = arg7[var36];
                                if (var44 != -1 && !this.field1239.field909.method1962(var44, -11999).field26) {
                                    var30.field3696[var36] = class72.field1019[class357.method2347((byte) 87, this.field1239.field909.method1962(var44, -11999).field37 & 65535) & 65535];
                                }
                                int var45 = arg7[var37];
                                if (var45 != -1 && !this.field1239.field909.method1962(var45, -11999).field26) {
                                    var30.field3696[var37] = class72.field1019[class357.method2347((byte) 87, this.field1239.field909.method1962(var45, -11999).field37 & 65535) & 65535];
                                }
                            }
                            var30.field3698[var34] = -1;
                        }
                    }
                }
                this.field1235[arg0][arg1] = var30;
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lc;IIIIZ)V", line = 697)
    public final void method727(class308 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(III)V", line = 701)
    public final void method728(int arg0, int arg1, int arg2) {
        if (this.field1249[arg0][arg1] < arg2) {
            this.field1249[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V", line = 706)
    public final void method729(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int arg12, int arg13, boolean arg14) {
        if (this.field1250 == null) {
            this.field1250 = new class214[super.field2681][super.field2685];
            this.field1232 = new class259[super.field2681][super.field2685];
        } else if (this.field1242 != null) {
            throw new IllegalStateException();
        }
        boolean var16 = false;
        if (arg8.length == 2 && arg5.length == 2 && (arg8[0] == arg8[1] || arg10[0] != -1 && arg10[0] == arg10[1])) {
            var16 = true;
            for (int var17 = 1; var17 < 2; ++var17) {
                int var18 = arg2[arg5[var17]];
                int var19 = arg4[arg5[var17]];
                if (var18 != 0 && this.field1237 != var18 || var19 != 0 && this.field1237 != var19) {
                    var16 = false;
                    break;
                }
            }
        }
        if (!var16) {
            class259 var20 = new class259();
            short var21 = (short) arg2.length;
            short var22 = (short) arg8.length;
            var20.field3815 = var21;
            var20.field3817 = new short[var21];
            var20.field3806 = new int[var21];
            var20.field3807 = new int[var21];
            var20.field3811 = new int[var21];
            for (int var23 = 0; var23 < var21; ++var23) {
                int var28 = arg2[var23];
                int var29 = arg4[var23];
                if (var28 == 0 && var29 == 0) {
                    var20.field3817[var23] = (short) (this.field1248[arg0][arg1] - this.field1249[arg0][arg1]);
                } else if (var28 == 0 && this.field1237 == var29) {
                    var20.field3817[var23] = (short) (this.field1248[arg0][arg1 + 1] - this.field1249[arg0][arg1 + 1]);
                } else if (this.field1237 == var28 && this.field1237 == var29) {
                    var20.field3817[var23] = (short) (this.field1248[arg0 + 1][arg1 + 1] - this.field1249[arg0 + 1][arg1 + 1]);
                } else if (this.field1237 == var28 && var29 == 0) {
                    var20.field3817[var23] = (short) (this.field1248[arg0 + 1][arg1] - this.field1249[arg0 + 1][arg1]);
                } else {
                    int var30 = (this.field1248[arg0 + 1][arg1] - this.field1249[arg0 + 1][arg1]) * var28 + (this.field1248[arg0][arg1] - this.field1249[arg0][arg1]) * (this.field1237 - var28);
                    int var31 = (this.field1248[arg0 + 1][arg1 + 1] - this.field1249[arg0 + 1][arg1 + 1]) * var28 + (this.field1248[arg0][arg1 + 1] - this.field1249[arg0][arg1 + 1]) * (this.field1237 - var28);
                    var20.field3817[var23] = (short) ((this.field1237 - var29) * var30 + var29 * var31 >> this.field1238 * 2);
                }
                int var32 = (arg0 << this.field1238) + var28;
                int var33 = (arg1 << this.field1238) + var29;
                var20.field3806[var23] = var32;
                var20.field3811[var23] = var33;
                var20.field3807[var23] = this.method725(var32, var33) + (arg3 != null ? arg3[var23] : 0);
                if (var20.field3817[var23] < 2) {
                    var20.field3817[var23] = 2;
                }
            }
            boolean var24 = false;
            int var25 = 0;
            for (int var26 = 0; var26 < var22; ++var26) {
                if (arg8[var26] >= 0 || arg9 != null && arg9[var26] >= 0) {
                    ++var25;
                }
                if (arg10[var26] != -1 && !this.field1239.field909.method1962(arg10[var26], -11999).field26) {
                    var24 = true;
                }
            }
            var20.field3809 = new int[var25];
            if (arg9 != null) {
                var20.field3808 = new int[var25];
            }
            var20.field3812 = new short[var25];
            var20.field3813 = new short[var25];
            var20.field3814 = new short[var25];
            if (var24) {
                var20.field3810 = new short[var25];
                var20.field3818 = new short[var25];
            }
            for (int var27 = 0; var27 < var22; ++var27) {
                if (arg8[var27] >= 0 || arg9 != null && arg9[var27] >= 0) {
                    if (arg8[var27] >= 0) {
                        var20.field3809[var20.field3816] = class357.method2347((byte) 87, arg8[var27]);
                    } else {
                        var20.field3809[var20.field3816] = -1;
                    }
                    if (arg9 != null) {
                        if (arg9[var27] != -1) {
                            var20.field3808[var20.field3816] = class357.method2347((byte) 87, arg9[var27]);
                        } else {
                            var20.field3808[var20.field3816] = -1;
                        }
                    }
                    var20.field3812[var20.field3816] = (short) arg5[var27];
                    var20.field3813[var20.field3816] = (short) arg6[var27];
                    var20.field3814[var20.field3816] = (short) arg7[var27];
                    if (var24) {
                        if (arg10[var27] != -1 && !this.field1239.field909.method1962(arg10[var27], -11999).field26) {
                            var20.field3810[var20.field3816] = (short) arg10[var27];
                            var20.field3818[var20.field3816] = (short) arg11[var27];
                        } else {
                            var20.field3810[var20.field3816] = -1;
                        }
                    }
                    ++var20.field3816;
                }
            }
            this.field1232[arg0][arg1] = var20;
        } else {
            if (arg8[0] >= 0 || arg9 != null && arg9[0] >= 0) {
                class214 var34 = new class214();
                int var35 = arg8[0];
                int var36 = arg10[0];
                if (arg9 != null) {
                    var34.field2986 = class373.method2452(this.field1248[arg0][arg1] - this.field1249[arg0][arg1], class357.method2347((byte) 87, arg9[0]), (byte) 66);
                    if (var35 == -1) {
                        var34.field2984 = (byte) (var34.field2984 | 2);
                    }
                }
                if (this.field1251[arg0 + 1][arg1] == this.field1251[arg0][arg1] && this.field1251[arg0 + 1][arg1 + 1] == this.field1251[arg0][arg1] && this.field1251[arg0][arg1 + 1] == this.field1251[arg0][arg1]) {
                    var34.field2984 = (byte) (var34.field2984 | 1);
                }
                if (var36 != -1 && (var34.field2984 & 2) == 0 && !this.field1239.field909.method1962(var36, -11999).field26) {
                    var34.field2987 = (short) (this.field1248[arg0][arg1] - this.field1249[arg0][arg1]);
                    var34.field2988 = (short) (this.field1248[arg0 + 1][arg1] - this.field1249[arg0 + 1][arg1]);
                    var34.field2983 = (short) (this.field1248[arg0 + 1][arg1 + 1] - this.field1249[arg0 + 1][arg1 + 1]);
                    var34.field2985 = (short) (this.field1248[arg0][arg1 + 1] - this.field1249[arg0][arg1 + 1]);
                    var34.field2989 = (short) var36;
                } else {
                    short var37 = class357.method2347((byte) 87, var35);
                    var34.field2987 = (short) class373.method2452(this.field1248[arg0][arg1] - this.field1249[arg0][arg1], var37, (byte) 117);
                    var34.field2988 = (short) class373.method2452(this.field1248[arg0 + 1][arg1] - this.field1249[arg0 + 1][arg1], var37, (byte) 120);
                    var34.field2983 = (short) class373.method2452(this.field1248[arg0 + 1][arg1 + 1] - this.field1249[arg0 + 1][arg1 + 1], var37, (byte) 110);
                    var34.field2985 = (short) class373.method2452(this.field1248[arg0][arg1 + 1] - this.field1249[arg0][arg1 + 1], var37, (byte) 61);
                    var34.field2989 = -1;
                }
                this.field1250[arg0][arg1] = var34;
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "(II)I", line = 936)
    private static final int method730(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "()V", line = 965)
    public final void method731() {
        this.field1248 = null;
        this.field1249 = null;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIZLho;[I[I[I)V", line = 971)
    private final void method732(int arg0, int arg1, boolean arg2, class130 arg3, int[] arg4, int[] arg5, int[] arg6) {
        class404 var8 = this.field1242[arg0][arg1];
        if (var8 != null) {
            if ((var8.field5881 & 2) == 0) {
                int var9 = this.field1237 * arg0;
                int var10 = this.field1237 + var9;
                int var11 = this.field1237 * arg1;
                int var12 = this.field1237 + var11;
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
                if ((var8.field5881 & 1) != 0 && !arg2) {
                    int var17 = this.field1251[arg0][arg1];
                    int var18 = this.field1240 * var17;
                    var19 = (this.field1243 * var11 + this.field1236 * var9 + var18 >> 15) + this.field1247;
                    if (var19 <= this.field1239.field893) {
                        return;
                    }
                    var20 = (this.field1243 * var11 + this.field1236 * var10 + var18 >> 15) + this.field1247;
                    if (var20 <= this.field1239.field893) {
                        return;
                    }
                    var21 = (this.field1243 * var12 + this.field1236 * var10 + var18 >> 15) + this.field1247;
                    if (var21 <= this.field1239.field893) {
                        return;
                    }
                    var22 = (this.field1243 * var12 + this.field1236 * var9 + var18 >> 15) + this.field1247;
                    if (var22 <= this.field1239.field893) {
                        return;
                    }
                    if (this.field1239.field910) {
                        int var23 = var19 - this.field1239.field912;
                        if (var23 > 0) {
                            var13 = var23;
                            if (var23 > 255) {
                                var13 = 255;
                            }
                        }
                        int var24 = var20 - this.field1239.field912;
                        if (var24 > 0) {
                            var14 = var24;
                            if (var24 > 255) {
                                var14 = 255;
                            }
                        }
                        int var25 = var21 - this.field1239.field912;
                        if (var25 > 0) {
                            var15 = var25;
                            if (var25 > 255) {
                                var15 = 255;
                            }
                        }
                        int var26 = var22 - this.field1239.field912;
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    int var27 = this.field1233 * var17;
                    int var28 = this.field1246 * var17;
                    var29 = (this.field1245 * var11 + this.field1229 * var9 + var27 >> 15) + this.field1231;
                    var30 = this.field1239.field876 * var29 / var19 + arg3.field1706;
                    var31 = (this.field1230 * var11 + this.field1241 * var9 + var28 >> 15) + this.field1252;
                    var32 = this.field1239.field892 * var31 / var19 + arg3.field1705;
                    var33 = (this.field1245 * var11 + this.field1229 * var10 + var27 >> 15) + this.field1231;
                    var34 = this.field1239.field876 * var33 / var20 + arg3.field1706;
                    var35 = (this.field1230 * var11 + this.field1241 * var10 + var28 >> 15) + this.field1252;
                    var36 = this.field1239.field892 * var35 / var20 + arg3.field1705;
                    var37 = (this.field1245 * var12 + this.field1229 * var10 + var27 >> 15) + this.field1231;
                    var38 = this.field1239.field876 * var37 / var21 + arg3.field1706;
                    var39 = (this.field1230 * var12 + this.field1241 * var10 + var28 >> 15) + this.field1252;
                    var40 = this.field1239.field892 * var39 / var21 + arg3.field1705;
                    var41 = (this.field1245 * var12 + this.field1229 * var9 + var27 >> 15) + this.field1231;
                    var42 = this.field1239.field876 * var41 / var22 + arg3.field1706;
                    var43 = (this.field1230 * var12 + this.field1241 * var9 + var28 >> 15) + this.field1252;
                    var44 = this.field1239.field892 * var43 / var22 + arg3.field1705;
                } else {
                    int var45 = this.field1251[arg0][arg1];
                    int var46 = this.field1251[arg0 + 1][arg1];
                    int var47 = this.field1251[arg0 + 1][arg1 + 1];
                    int var48 = this.field1251[arg0][arg1 + 1];
                    var19 = (this.field1243 * var11 + this.field1240 * var45 + this.field1236 * var9 >> 15) + this.field1247;
                    if (var19 <= this.field1239.field893) {
                        return;
                    }
                    var20 = (this.field1243 * var11 + this.field1240 * var46 + this.field1236 * var10 >> 15) + this.field1247;
                    if (var20 <= this.field1239.field893) {
                        return;
                    }
                    var21 = (this.field1243 * var12 + this.field1240 * var47 + this.field1236 * var10 >> 15) + this.field1247;
                    if (var21 <= this.field1239.field893) {
                        return;
                    }
                    var22 = (this.field1243 * var12 + this.field1240 * var48 + this.field1236 * var9 >> 15) + this.field1247;
                    if (var22 <= this.field1239.field893) {
                        return;
                    }
                    if (arg2) {
                        int var49 = var19 - this.field1239.field912;
                        if (var49 > 255) {
                            var49 = 255;
                        }
                        if (var49 > 0) {
                            var13 = var49;
                            int var50 = this.field1244[arg0][arg1] * var49 / 255;
                            if (var50 > 0) {
                                var45 -= var50;
                            }
                        }
                        int var51 = var20 - this.field1239.field912;
                        if (var51 > 255) {
                            var51 = 255;
                        }
                        if (var51 > 0) {
                            var14 = var51;
                            int var52 = this.field1244[arg0 + 1][arg1] * var51 / 255;
                            if (var52 > 0) {
                                var46 -= var52;
                            }
                        }
                        int var53 = var21 - this.field1239.field912;
                        if (var53 > 255) {
                            var53 = 255;
                        }
                        if (var53 > 0) {
                            var15 = var53;
                            int var54 = this.field1244[arg0 + 1][arg1 + 1] * var53 / 255;
                            if (var54 > 0) {
                                var47 -= var54;
                            }
                        }
                        int var55 = var22 - this.field1239.field912;
                        if (var55 > 255) {
                            var55 = 255;
                        }
                        if (var55 > 0) {
                            var16 = var55;
                            int var56 = this.field1244[arg0][arg1 + 1] * var55 / 255;
                            if (var56 > 0) {
                                var48 -= var56;
                            }
                        }
                    } else if (this.field1239.field910) {
                        int var57 = var19 - this.field1239.field912;
                        if (var57 > 0) {
                            var13 = var57;
                            if (var57 > 255) {
                                var13 = 255;
                            }
                        }
                        int var58 = var20 - this.field1239.field912;
                        if (var58 > 0) {
                            var14 = var58;
                            if (var58 > 255) {
                                var14 = 255;
                            }
                        }
                        int var59 = var21 - this.field1239.field912;
                        if (var59 > 0) {
                            var15 = var59;
                            if (var59 > 255) {
                                var15 = 255;
                            }
                        }
                        int var60 = var22 - this.field1239.field912;
                        if (var60 > 0) {
                            var16 = var60;
                            if (var60 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    var29 = (this.field1245 * var11 + this.field1233 * var45 + this.field1229 * var9 >> 15) + this.field1231;
                    var30 = this.field1239.field876 * var29 / var19 + arg3.field1706;
                    var31 = (this.field1230 * var11 + this.field1246 * var45 + this.field1241 * var9 >> 15) + this.field1252;
                    var32 = this.field1239.field892 * var31 / var19 + arg3.field1705;
                    var33 = (this.field1245 * var11 + this.field1233 * var46 + this.field1229 * var10 >> 15) + this.field1231;
                    var34 = this.field1239.field876 * var33 / var20 + arg3.field1706;
                    var35 = (this.field1230 * var11 + this.field1246 * var46 + this.field1241 * var10 >> 15) + this.field1252;
                    var36 = this.field1239.field892 * var35 / var20 + arg3.field1705;
                    var37 = (this.field1245 * var12 + this.field1233 * var47 + this.field1229 * var10 >> 15) + this.field1231;
                    var38 = this.field1239.field876 * var37 / var21 + arg3.field1706;
                    var39 = (this.field1230 * var12 + this.field1246 * var47 + this.field1241 * var10 >> 15) + this.field1252;
                    var40 = this.field1239.field892 * var39 / var21 + arg3.field1705;
                    var41 = (this.field1245 * var12 + this.field1233 * var48 + this.field1229 * var9 >> 15) + this.field1231;
                    var42 = this.field1239.field876 * var41 / var22 + arg3.field1706;
                    var43 = (this.field1230 * var12 + this.field1246 * var48 + this.field1241 * var9 >> 15) + this.field1252;
                    var44 = this.field1239.field892 * var43 / var22 + arg3.field1705;
                }
                boolean var61 = var8.field5883 != -1 && this.method721(this.field1239.field909.method1962(var8.field5883, -11999).field45);
                int var62 = var14 + var15 + var16;
                if ((var36 - var44) * (var38 - var42) - (var34 - var42) * (var40 - var44) > 0) {
                    arg3.field1700 = var38 < 0 || var42 < 0 || var34 < 0 || var38 > arg3.field1704 || var42 > arg3.field1704 || var34 > arg3.field1704;
                    if (var62 < 765) {
                        if (var61) {
                            arg3.field1708 = 100;
                        }
                        if (var62 > 0) {
                            if (var8.field5883 >= 0) {
                                arg3.method932(var40, var44, var36, var38, var42, var34, this.field1239.field897, var15, var16, var14, var8.field5884, var8.field5879, var8.field5882, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field5883);
                            } else {
                                arg3.method927(var40, var44, var36, var38, var42, var34, class245.method1596(false, var8.field5884, var15 << 24 | this.field1239.field897), class245.method1596(false, var8.field5879, var16 << 24 | this.field1239.field897), class245.method1596(false, var8.field5882, var14 << 24 | this.field1239.field897));
                            }
                        } else if (var8.field5883 >= 0) {
                            arg3.method935(var40, var44, var36, var38, var42, var34, var8.field5884, var8.field5879, var8.field5882, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field5883);
                        } else {
                            arg3.method927(var40, var44, var36, var38, var42, var34, var8.field5884, var8.field5879, var8.field5882);
                        }
                        arg3.field1708 = 0;
                    } else {
                        arg3.method936(var40, var44, var36, var38, var42, var34, this.field1239.field897);
                    }
                }
                int var63 = var13 + var14 + var16;
                if ((var30 - var34) * (var44 - var36) - (var32 - var36) * (var42 - var34) > 0) {
                    arg3.field1700 = var30 < 0 || var34 < 0 || var42 < 0 || var30 > arg3.field1704 || var34 > arg3.field1704 || var42 > arg3.field1704;
                    if (var63 < 765) {
                        if (var61) {
                            arg3.field1708 = 100;
                        }
                        if (var63 > 0) {
                            if (var8.field5883 >= 0) {
                                arg3.method932(var32, var36, var44, var30, var34, var42, this.field1239.field897, var13, var14, var16, var8.field5885, var8.field5882, var8.field5879, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field5883);
                            } else {
                                arg3.method927(var32, var36, var44, var30, var34, var42, class245.method1596(false, var8.field5885, var13 << 24 | this.field1239.field897), class245.method1596(false, var8.field5882, var14 << 24 | this.field1239.field897), class245.method1596(false, var8.field5879, var16 << 24 | this.field1239.field897));
                            }
                        } else if (var8.field5883 >= 0) {
                            arg3.method935(var32, var36, var44, var30, var34, var42, var8.field5885, var8.field5882, var8.field5879, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field5883);
                        } else {
                            arg3.method927(var32, var36, var44, var30, var34, var42, var8.field5885, var8.field5882, var8.field5879);
                        }
                        arg3.field1708 = 0;
                        return;
                    }
                    arg3.method936(var32, var36, var44, var30, var34, var42, this.field1239.field897);
                }
            }
        } else {
            class253 var64 = this.field1235[arg0][arg1];
            if (var64 != null) {
                for (int var65 = 0; var65 < var64.field3705; ++var65) {
                    short var105 = var64.field3704[var65];
                    int var106 = var64.field3702[var65];
                    short var107 = var64.field3703[var65];
                    int var108 = (this.field1243 * var107 + this.field1240 * var106 + this.field1236 * var105 >> 15) + this.field1247;
                    if (var108 <= this.field1239.field893) {
                        return;
                    }
                    arg6[var65] = 0;
                    if (arg2) {
                        int var109 = var108 - this.field1239.field912;
                        if (var109 > 255) {
                            var109 = 255;
                        }
                        if (var109 > 0) {
                            arg6[var65] = var109;
                            int var110 = var64.field3701[var65] * var109 / 255;
                            if (var110 > 0) {
                                var106 -= var110;
                            }
                        }
                    } else if (this.field1239.field910) {
                        int var111 = var108 - this.field1239.field912;
                        if (var111 > 0) {
                            arg6[var65] = var111;
                            if (arg6[var65] > 255) {
                                arg6[var65] = 255;
                            }
                        }
                    }
                    int var112 = (this.field1245 * var107 + this.field1233 * var106 + this.field1229 * var105 >> 15) + this.field1231;
                    int var113 = (this.field1230 * var107 + this.field1246 * var106 + this.field1241 * var105 >> 15) + this.field1252;
                    arg4[var65] = this.field1239.field876 * var112 / var108 + arg3.field1706;
                    arg5[var65] = this.field1239.field892 * var113 / var108 + arg3.field1705;
                }
                if (var64.field3698 != null) {
                    int var66 = this.field1251[arg0][arg1];
                    int var67 = this.field1251[arg0 + 1][arg1];
                    int var68 = this.field1251[arg0][arg1 + 1];
                    int var69 = this.field1237 * arg0;
                    int var70 = this.field1237 + var69;
                    int var71 = this.field1237 * arg1;
                    int var72 = this.field1237 + var71;
                    int var73 = (this.field1245 * var71 + this.field1233 * var66 + this.field1229 * var69 >> 15) + this.field1231;
                    int var74 = (this.field1230 * var71 + this.field1246 * var66 + this.field1241 * var69 >> 15) + this.field1252;
                    int var75 = (this.field1243 * var71 + this.field1240 * var66 + this.field1236 * var69 >> 15) + this.field1247;
                    int var76 = (this.field1245 * var71 + this.field1233 * var67 + this.field1229 * var70 >> 15) + this.field1231;
                    int var77 = (this.field1230 * var71 + this.field1246 * var67 + this.field1241 * var70 >> 15) + this.field1252;
                    int var78 = (this.field1243 * var71 + this.field1240 * var67 + this.field1236 * var70 >> 15) + this.field1247;
                    int var79 = (this.field1245 * var72 + this.field1233 * var68 + this.field1229 * var69 >> 15) + this.field1231;
                    int var80 = (this.field1230 * var72 + this.field1246 * var68 + this.field1241 * var69 >> 15) + this.field1252;
                    int var81 = (this.field1243 * var72 + this.field1240 * var68 + this.field1236 * var69 >> 15) + this.field1247;
                    for (int var82 = 0; var82 < var64.field3699; ++var82) {
                        int var83 = var82 * 3;
                        int var84 = var83 + 1;
                        int var85 = var84 + 1;
                        int var86 = arg4[var83];
                        int var87 = arg4[var84];
                        int var88 = arg4[var85];
                        int var89 = arg5[var83];
                        int var90 = arg5[var84];
                        int var91 = arg5[var85];
                        int var92 = arg6[var83] + arg6[var84] + arg6[var85];
                        if ((var86 - var87) * (var91 - var90) - (var88 - var87) * (var89 - var90) > 0) {
                            arg3.field1700 = var86 < 0 || var87 < 0 || var88 < 0 || var86 > arg3.field1704 || var87 > arg3.field1704 || var88 > arg3.field1704;
                            short var93 = var64.field3698[var82];
                            if (var92 < 765) {
                                if (var93 != -1 && this.method721(this.field1239.field909.method1962(var93, -11999).field45)) {
                                    arg3.field1708 = 100;
                                }
                                if (var92 > 0) {
                                    if (var93 != -1) {
                                        arg3.method932(var89, var90, var91, var86, var87, var88, this.field1239.field897, arg6[var83], arg6[var84], arg6[var85], var64.field3696[var83], var64.field3696[var84], var64.field3696[var85], var73, var76, var79, var74, var77, var80, var75, var78, var81, var93);
                                    } else if ((var64.field3696[var83] & 16777215) != 0) {
                                        arg3.method927(var89, var90, var91, var86, var87, var88, class245.method1596(false, var64.field3696[var83], arg6[var83] << 24 | this.field1239.field897), class245.method1596(false, var64.field3696[var84], arg6[var84] << 24 | this.field1239.field897), class245.method1596(false, var64.field3696[var85], arg6[var85] << 24 | this.field1239.field897));
                                    }
                                } else if (var93 != -1) {
                                    arg3.method935(var89, var90, var91, var86, var87, var88, var64.field3696[var83], var64.field3696[var84], var64.field3696[var85], var73, var76, var79, var74, var77, var80, var75, var78, var81, var93);
                                } else if ((var64.field3696[var83] & 16777215) != 0) {
                                    arg3.method927(var89, var90, var91, var86, var87, var88, var64.field3696[var83], var64.field3696[var84], var64.field3696[var85]);
                                }
                                arg3.field1708 = 0;
                            } else {
                                arg3.method936(var89, var90, var91, var86, var87, var88, this.field1239.field897);
                            }
                        }
                    }
                    return;
                }
                for (int var94 = 0; var94 < var64.field3699; ++var94) {
                    int var95 = var94 * 3;
                    int var96 = var95 + 1;
                    int var97 = var96 + 1;
                    int var98 = arg4[var95];
                    int var99 = arg4[var96];
                    int var100 = arg4[var97];
                    int var101 = arg5[var95];
                    int var102 = arg5[var96];
                    int var103 = arg5[var97];
                    int var104 = arg6[var95] + arg6[var96] + arg6[var97];
                    if ((var98 - var99) * (var103 - var102) - (var100 - var99) * (var101 - var102) > 0) {
                        arg3.field1700 = var98 < 0 || var99 < 0 || var100 < 0 || var98 > arg3.field1704 || var99 > arg3.field1704 || var100 > arg3.field1704;
                        if (var104 < 765) {
                            if (var104 > 0) {
                                if ((var64.field3696[var95] & 16777215) != 0) {
                                    arg3.method927(var101, var102, var103, var98, var99, var100, class254.method1644(arg6[var95], this.field1239.field897, -70, var64.field3696[var95]), class254.method1644(arg6[var96], this.field1239.field897, -61, var64.field3696[var96]), class254.method1644(arg6[var97], this.field1239.field897, -42, var64.field3696[var97]));
                                }
                            } else if ((var64.field3696[var95] & 16777215) != 0) {
                                arg3.method927(var101, var102, var103, var98, var99, var100, var64.field3696[var95], var64.field3696[var96], var64.field3696[var97]);
                            }
                        } else {
                            arg3.method936(var101, var102, var103, var98, var99, var100, this.field1239.field897);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(Lc;IIIIZ)V", line = 1537)
    public final void method733(class308 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Ldn;[I)V", line = 1544)
    public final void method734(class16 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IILc;)Lc;", line = 1548)
    public final class308 method735(int arg0, int arg1, class308 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Llh;IIII[[I[[II)V", line = 1551)
    public class91(class59 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4);
        this.field1239 = arg0;
        this.field1234 = arg2;
        this.field1251 = arg5;
        this.field1244 = arg6;
        this.field1237 = arg7;
        this.field1238 = 0;
        while (arg7 > 1) {
            ++this.field1238;
            arg7 >>= 1;
        }
        this.field1248 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field1239.field915 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = this.field1251[var11 + 1][var10] - this.field1251[var11 - 1][var10];
                int var14 = this.field1251[var11][var10 + 1] - this.field1251[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + var13 * var13 + 65536));
                int var16 = (var13 << 8) / var15;
                int var17 = -65536 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field1239.field873 * var18 + this.field1239.field916 * var17 + this.field1239.field885 * var16 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field1248[var11][var10] = (byte) var20;
            }
        }
        this.field1249 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IILho;[I[I[I)V", line = 1612)
    private final void method736(int arg0, int arg1, class130 arg2, int[] arg3, int[] arg4, int[] arg5) {
        class214 var7 = this.field1250[arg0][arg1];
        if (var7 != null) {
            if ((var7.field2984 & 2) == 0) {
                int var8 = this.field1237 * arg0;
                int var9 = this.field1237 + var8;
                int var10 = this.field1237 * arg1;
                int var11 = this.field1237 + var10;
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
                if ((var7.field2984 & 1) != 0) {
                    int var12 = this.field1251[arg0][arg1];
                    int var13 = this.field1240 * var12;
                    var14 = (this.field1243 * var10 + this.field1236 * var8 + var13 >> 15) + this.field1247;
                    if (var14 <= this.field1239.field893) {
                        return;
                    }
                    var15 = (this.field1243 * var10 + this.field1236 * var9 + var13 >> 15) + this.field1247;
                    if (var15 <= this.field1239.field893) {
                        return;
                    }
                    int var16 = (this.field1243 * var11 + this.field1236 * var9 + var13 >> 15) + this.field1247;
                    if (var16 <= this.field1239.field893) {
                        return;
                    }
                    var17 = (this.field1243 * var11 + this.field1236 * var8 + var13 >> 15) + this.field1247;
                    if (var17 <= this.field1239.field893) {
                        return;
                    }
                    int var18 = this.field1233 * var12;
                    int var19 = this.field1246 * var12;
                    var20 = (this.field1245 * var10 + this.field1229 * var8 + var18 >> 15) + this.field1231;
                    var21 = this.field1239.field876 * var20 / var14 + arg2.field1706;
                    var22 = (this.field1230 * var10 + this.field1241 * var8 + var19 >> 15) + this.field1252;
                    var23 = this.field1239.field892 * var22 / var14 + arg2.field1705;
                    var24 = (this.field1245 * var10 + this.field1229 * var9 + var18 >> 15) + this.field1231;
                    var25 = this.field1239.field876 * var24 / var15 + arg2.field1706;
                    var26 = (this.field1230 * var10 + this.field1241 * var9 + var19 >> 15) + this.field1252;
                    var27 = this.field1239.field892 * var26 / var15 + arg2.field1705;
                    int var28 = (this.field1245 * var11 + this.field1229 * var9 + var18 >> 15) + this.field1231;
                    var29 = this.field1239.field876 * var28 / var16 + arg2.field1706;
                    int var30 = (this.field1230 * var11 + this.field1241 * var9 + var19 >> 15) + this.field1252;
                    var31 = this.field1239.field892 * var30 / var16 + arg2.field1705;
                    var32 = (this.field1245 * var11 + this.field1229 * var8 + var18 >> 15) + this.field1231;
                    var33 = this.field1239.field876 * var32 / var17 + arg2.field1706;
                    var34 = (this.field1230 * var11 + this.field1241 * var8 + var19 >> 15) + this.field1252;
                    var35 = this.field1239.field892 * var34 / var17 + arg2.field1705;
                } else {
                    int var36 = this.field1251[arg0][arg1];
                    int var37 = this.field1251[arg0 + 1][arg1];
                    int var38 = this.field1251[arg0 + 1][arg1 + 1];
                    int var39 = this.field1251[arg0][arg1 + 1];
                    var14 = (this.field1243 * var10 + this.field1240 * var36 + this.field1236 * var8 >> 15) + this.field1247;
                    if (var14 <= this.field1239.field893) {
                        return;
                    }
                    var15 = (this.field1243 * var10 + this.field1240 * var37 + this.field1236 * var9 >> 15) + this.field1247;
                    if (var15 <= this.field1239.field893) {
                        return;
                    }
                    int var40 = (this.field1243 * var11 + this.field1240 * var38 + this.field1236 * var9 >> 15) + this.field1247;
                    if (var40 <= this.field1239.field893) {
                        return;
                    }
                    var17 = (this.field1243 * var11 + this.field1240 * var39 + this.field1236 * var8 >> 15) + this.field1247;
                    if (var17 <= this.field1239.field893) {
                        return;
                    }
                    var20 = (this.field1245 * var10 + this.field1233 * var36 + this.field1229 * var8 >> 15) + this.field1231;
                    var21 = this.field1239.field876 * var20 / var14 + arg2.field1706;
                    var22 = (this.field1230 * var10 + this.field1246 * var36 + this.field1241 * var8 >> 15) + this.field1252;
                    var23 = this.field1239.field892 * var22 / var14 + arg2.field1705;
                    var24 = (this.field1245 * var10 + this.field1233 * var37 + this.field1229 * var9 >> 15) + this.field1231;
                    var25 = this.field1239.field876 * var24 / var15 + arg2.field1706;
                    var26 = (this.field1230 * var10 + this.field1246 * var37 + this.field1241 * var9 >> 15) + this.field1252;
                    var27 = this.field1239.field892 * var26 / var15 + arg2.field1705;
                    int var41 = (this.field1245 * var11 + this.field1233 * var38 + this.field1229 * var9 >> 15) + this.field1231;
                    var29 = this.field1239.field876 * var41 / var40 + arg2.field1706;
                    int var42 = (this.field1230 * var11 + this.field1246 * var38 + this.field1241 * var9 >> 15) + this.field1252;
                    var31 = this.field1239.field892 * var42 / var40 + arg2.field1705;
                    var32 = (this.field1245 * var11 + this.field1233 * var39 + this.field1229 * var8 >> 15) + this.field1231;
                    var33 = this.field1239.field876 * var32 / var17 + arg2.field1706;
                    var34 = (this.field1230 * var11 + this.field1246 * var39 + this.field1241 * var8 >> 15) + this.field1252;
                    var35 = this.field1239.field892 * var34 / var17 + arg2.field1705;
                }
                if ((var27 - var35) * (var29 - var33) - (var25 - var33) * (var31 - var35) > 0) {
                    arg2.field1700 = var29 < 0 || var33 < 0 || var25 < 0 || var29 > arg2.field1704 || var33 > arg2.field1704 || var25 > arg2.field1704;
                    if (var7.field2989 >= 0) {
                        if (this.method721(this.field1239.field909.method1962(var7.field2989, -11999).field45)) {
                            arg2.field1708 = 100;
                        }
                        arg2.method935(var31, var35, var27, var29, var33, var25, var7.field2983 & 65535, var7.field2985 & 65535, var7.field2988 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field2989);
                        arg2.field1708 = 0;
                    } else {
                        arg2.method939(var31, var35, var27, var29, var33, var25, var7.field2983 & 65535, var7.field2985 & 65535, var7.field2988 & 65535);
                    }
                }
                if ((var21 - var25) * (var35 - var27) - (var23 - var27) * (var33 - var25) > 0) {
                    arg2.field1700 = var21 < 0 || var25 < 0 || var33 < 0 || var21 > arg2.field1704 || var25 > arg2.field1704 || var33 > arg2.field1704;
                    if (var7.field2989 >= 0) {
                        if (this.method721(this.field1239.field909.method1962(var7.field2989, -11999).field45)) {
                            arg2.field1708 = 100;
                        }
                        arg2.method935(var23, var27, var35, var21, var25, var33, var7.field2987 & 65535, var7.field2988 & 65535, var7.field2985 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field2989);
                        arg2.field1708 = 0;
                        return;
                    }
                    arg2.method939(var23, var27, var35, var21, var25, var33, var7.field2987 & 65535, var7.field2988 & 65535, var7.field2985 & 65535);
                }
            }
        } else {
            class259 var43 = this.field1232[arg0][arg1];
            if (var43 != null) {
                for (int var44 = 0; var44 < var43.field3815; ++var44) {
                    int var84 = var43.field3806[var44];
                    int var85 = var43.field3807[var44];
                    int var86 = var43.field3811[var44];
                    int var87 = (this.field1243 * var86 + this.field1240 * var85 + this.field1236 * var84 >> 15) + this.field1247;
                    if (var87 <= this.field1239.field893) {
                        return;
                    }
                    int var88 = (this.field1245 * var86 + this.field1233 * var85 + this.field1229 * var84 >> 15) + this.field1231;
                    int var89 = (this.field1230 * var86 + this.field1246 * var85 + this.field1241 * var84 >> 15) + this.field1252;
                    arg3[var44] = this.field1239.field876 * var88 / var87 + arg2.field1706;
                    arg4[var44] = this.field1239.field892 * var89 / var87 + arg2.field1705;
                }
                if (var43.field3810 != null) {
                    int var45 = this.field1251[arg0][arg1];
                    int var46 = this.field1251[arg0 + 1][arg1];
                    int var47 = this.field1251[arg0][arg1 + 1];
                    int var48 = this.field1237 * arg0;
                    int var49 = this.field1237 + var48;
                    int var50 = this.field1237 * arg1;
                    int var51 = this.field1237 + var50;
                    int var52 = (this.field1245 * var50 + this.field1233 * var45 + this.field1229 * var48 >> 15) + this.field1231;
                    int var53 = (this.field1230 * var50 + this.field1246 * var45 + this.field1241 * var48 >> 15) + this.field1252;
                    int var54 = (this.field1243 * var50 + this.field1240 * var45 + this.field1236 * var48 >> 15) + this.field1247;
                    int var55 = (this.field1245 * var50 + this.field1233 * var46 + this.field1229 * var49 >> 15) + this.field1231;
                    int var56 = (this.field1230 * var50 + this.field1246 * var46 + this.field1241 * var49 >> 15) + this.field1252;
                    int var57 = (this.field1243 * var50 + this.field1240 * var46 + this.field1236 * var49 >> 15) + this.field1247;
                    int var58 = (this.field1245 * var51 + this.field1233 * var47 + this.field1229 * var48 >> 15) + this.field1231;
                    int var59 = (this.field1230 * var51 + this.field1246 * var47 + this.field1241 * var48 >> 15) + this.field1252;
                    int var60 = (this.field1243 * var51 + this.field1240 * var47 + this.field1236 * var48 >> 15) + this.field1247;
                    for (int var61 = 0; var61 < var43.field3816; ++var61) {
                        short var62 = var43.field3812[var61];
                        short var63 = var43.field3813[var61];
                        short var64 = var43.field3814[var61];
                        int var65 = arg3[var62];
                        int var66 = arg3[var63];
                        int var67 = arg3[var64];
                        int var68 = arg4[var62];
                        int var69 = arg4[var63];
                        int var70 = arg4[var64];
                        if ((var65 - var66) * (var70 - var69) - (var67 - var66) * (var68 - var69) > 0) {
                            arg2.field1700 = var65 < 0 || var66 < 0 || var67 < 0 || var65 > arg2.field1704 || var66 > arg2.field1704 || var67 > arg2.field1704;
                            short var71 = var43.field3810[var61];
                            if (var71 != -1) {
                                if (this.method721(this.field1239.field909.method1962(var71, -11999).field45)) {
                                    arg2.field1708 = 100;
                                }
                                arg2.method935(var68, var69, var70, var65, var66, var67, var43.field3817[var62], var43.field3817[var63], var43.field3817[var64], var52, var55, var58, var53, var56, var59, var54, var57, var60, var71);
                                arg2.field1708 = 0;
                            } else {
                                int var72 = var43.field3809[var61];
                                if (var72 != -1) {
                                    arg2.method939(var68, var69, var70, var65, var66, var67, class373.method2452(var43.field3817[var62], var72, (byte) 72), class373.method2452(var43.field3817[var63], var72, (byte) 68), class373.method2452(var43.field3817[var64], var72, (byte) 112));
                                }
                            }
                        }
                    }
                    return;
                }
                for (int var73 = 0; var73 < var43.field3816; ++var73) {
                    short var74 = var43.field3812[var73];
                    short var75 = var43.field3813[var73];
                    short var76 = var43.field3814[var73];
                    int var77 = arg3[var74];
                    int var78 = arg3[var75];
                    int var79 = arg3[var76];
                    int var80 = arg4[var74];
                    int var81 = arg4[var75];
                    int var82 = arg4[var76];
                    if ((var77 - var78) * (var82 - var81) - (var79 - var78) * (var80 - var81) > 0) {
                        int var83 = var43.field3809[var73];
                        if (var83 != -1) {
                            arg2.field1700 = var77 < 0 || var78 < 0 || var79 < 0 || var77 > arg2.field1704 || var78 > arg2.field1704 || var79 > arg2.field1704;
                            arg2.method939(var80, var81, var82, var77, var78, var79, class373.method2452(var43.field3817[var74], var83, (byte) 67), class373.method2452(var43.field3817[var75], var83, (byte) 64), class373.method2452(var43.field3817[var76], var83, (byte) 71));
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(IIIIIII[[ZLho;[I[I)V", line = 1929)
    private final void method737(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class130 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field1707 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field1242[var16][var17] != null) {
                        class404 var18 = this.field1242[var16][var17];
                        if (var18.field5883 != -1 && (var18.field5881 & 2) == 0 && var18.field5880 == 0) {
                            int var19 = this.field1239.method487(var18.field5883);
                            arg8.method939(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class373.method2452(var18.field5884, var19, (byte) 76), class373.method2452(var18.field5879, var19, (byte) 114), class373.method2452(var18.field5882, var19, (byte) 73));
                            arg8.method939(var15, var15, var15 - var13, var14, var13 + var14, var14, class373.method2452(var18.field5885, var19, (byte) 92), class373.method2452(var18.field5882, var19, (byte) 84), class373.method2452(var18.field5879, var19, (byte) 81));
                        } else if (var18.field5880 == 0) {
                            arg8.method927(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field5884, var18.field5879, var18.field5882);
                            arg8.method927(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field5885, var18.field5882, var18.field5879);
                        } else {
                            int var20 = var18.field5880;
                            arg8.method927(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class245.method1596(false, var20, var18.field5884 & -16777216), class245.method1596(false, var20, var18.field5879 & -16777216), class245.method1596(false, var20, var18.field5882 & -16777216));
                            arg8.method927(var15, var15, var15 - var13, var14, var13 + var14, var14, class245.method1596(false, var20, var18.field5885 & -16777216), class245.method1596(false, var20, var18.field5882 & -16777216), class245.method1596(false, var20, var18.field5879 & -16777216));
                        }
                    } else if (this.field1235[var16][var17] != null) {
                        class253 var21 = this.field1235[var16][var17];
                        for (int var22 = 0; var22 < var21.field3705; ++var22) {
                            arg9[var22] = (var21.field3704[var22] - this.field1237 * var16) * var13 / this.field1237 + var14;
                            arg10[var22] = var15 - (var21.field3703[var22] - this.field1237 * var17) * var13 / this.field1237;
                        }
                        for (int var23 = 0; var23 < var21.field3699; ++var23) {
                            int var24 = var23 * 3;
                            int var25 = var24 + 1;
                            int var26 = var25 + 1;
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field3697 != null && var21.field3697[var23] != 0 && (var21.field3698 == null || var21.field3698 != null && var21.field3698[var23] == -1)) {
                                int var33 = var21.field3697[var23];
                                arg8.method927(var30, var31, var32, var27, var28, var29, class245.method1596(false, var33, -16777216 - (var21.field3696[var24] & -16777216)), class245.method1596(false, var33, -16777216 - (var21.field3696[var25] & -16777216)), class245.method1596(false, var33, -16777216 - (var21.field3696[var26] & -16777216)));
                            } else if (var21.field3698 != null && var21.field3698[var23] != -1) {
                                int var34 = this.field1239.method487(var21.field3698[var23]);
                                arg8.method939(var30, var31, var32, var27, var28, var29, var34, var34, var34);
                            } else {
                                arg8.method927(var30, var31, var32, var27, var28, var29, var21.field3696[var24], var21.field3696[var25], var21.field3696[var26]);
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field1707 = true;
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(Lc;IIIIZ)Z", line = 2059)
    public final boolean method738(class308 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(III[[ZZ)V", line = 2064)
    public final void method739(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        class367 var6 = this.field1239.field908;
        this.field1229 = var6.field5416;
        this.field1233 = var6.field5413;
        this.field1245 = var6.field5411;
        this.field1231 = var6.field5407;
        this.field1241 = var6.field5409;
        this.field1246 = var6.field5414;
        this.field1230 = var6.field5412;
        this.field1252 = var6.field5410;
        this.field1236 = var6.field5415;
        this.field1240 = var6.field5408;
        this.field1243 = var6.field5417;
        this.field1247 = var6.field5418;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIIIII[[Z)V", line = 2085)
    public final void method740(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        class334 var9 = this.field1239.method459(Thread.currentThread());
        class130 var10 = var9.field4905;
        var10.field1708 = 0;
        var10.field1700 = false;
        if (this.field1242 != null) {
            this.method737(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field4945, var9.field4950);
        } else {
            if (this.field1250 != null) {
                this.method723(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field4945, var9.field4950);
            }
        }
    }
}
