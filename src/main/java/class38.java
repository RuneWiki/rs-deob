import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class38 extends class323 {

    @OriginalMember(owner = "client!gh", name = "G", descriptor = "Lsq;")
    private class27 field504;

    @OriginalMember(owner = "client!gh", name = "H", descriptor = "I")
    private int field505;

    @OriginalMember(owner = "client!gh", name = "M", descriptor = "[[I")
    public int[][] field510;

    @OriginalMember(owner = "client!gh", name = "J", descriptor = "[[I")
    private int[][] field507;

    @OriginalMember(owner = "client!gh", name = "F", descriptor = "I")
    private int field503;

    @OriginalMember(owner = "client!gh", name = "I", descriptor = "I")
    private int field506;

    @OriginalMember(owner = "client!gh", name = "r", descriptor = "[[B")
    private byte[][] field489;

    @OriginalMember(owner = "client!gh", name = "z", descriptor = "[[B")
    private byte[][] field497;

    @OriginalMember(owner = "client!gh", name = "q", descriptor = "I")
    private int field488;

    @OriginalMember(owner = "client!gh", name = "s", descriptor = "I")
    private int field490;

    @OriginalMember(owner = "client!gh", name = "u", descriptor = "I")
    private int field492;

    @OriginalMember(owner = "client!gh", name = "w", descriptor = "I")
    private int field494;

    @OriginalMember(owner = "client!gh", name = "x", descriptor = "I")
    private int field495;

    @OriginalMember(owner = "client!gh", name = "y", descriptor = "I")
    private int field496;

    @OriginalMember(owner = "client!gh", name = "A", descriptor = "I")
    private int field498;

    @OriginalMember(owner = "client!gh", name = "C", descriptor = "I")
    private int field500;

    @OriginalMember(owner = "client!gh", name = "D", descriptor = "I")
    private int field501;

    @OriginalMember(owner = "client!gh", name = "E", descriptor = "I")
    private int field502;

    @OriginalMember(owner = "client!gh", name = "K", descriptor = "I")
    private int field508;

    @OriginalMember(owner = "client!gh", name = "L", descriptor = "I")
    private int field509;

    @OriginalMember(owner = "client!gh", name = "t", descriptor = "[[Ljj;")
    private class158[][] field491;

    @OriginalMember(owner = "client!gh", name = "p", descriptor = "[[Lor;")
    private class297[][] field487;

    @OriginalMember(owner = "client!gh", name = "B", descriptor = "[[Lvm;")
    private class324[][] field499;

    @OriginalMember(owner = "client!gh", name = "v", descriptor = "[[Lki;")
    private class94[][] field493;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIIIII[[ZLgm;[I[I)V", line = 4)
    private final void method323(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class338 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field4571 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field493[var16][var17] != null) {
                        class94 var18 = this.field493[var16][var17];
                        if (var18.field1310 != -1 && (var18.field1305 & 2) == 0 && var18.field1306 == 0) {
                            int var19 = this.field504.method182(var18.field1310);
                            arg8.method2048(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class144.method1045(var18.field1307, (byte) 27, var19), class144.method1045(var18.field1309, (byte) 119, var19), class144.method1045(var18.field1304, (byte) 27, var19));
                            arg8.method2048(var15, var15, var15 - var13, var14, var13 + var14, var14, class144.method1045(var18.field1308, (byte) 64, var19), class144.method1045(var18.field1304, (byte) 103, var19), class144.method1045(var18.field1309, (byte) 41, var19));
                        } else if (var18.field1306 == 0) {
                            arg8.method2053(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field1307, var18.field1309, var18.field1304);
                            arg8.method2053(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field1308, var18.field1304, var18.field1309);
                        } else {
                            int var20 = var18.field1306;
                            arg8.method2053(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class219.method1455(false, var20, var18.field1307 & -16777216), class219.method1455(false, var20, var18.field1309 & -16777216), class219.method1455(false, var20, var18.field1304 & -16777216));
                            arg8.method2053(var15, var15, var15 - var13, var14, var13 + var14, var14, class219.method1455(false, var20, var18.field1308 & -16777216), class219.method1455(false, var20, var18.field1304 & -16777216), class219.method1455(false, var20, var18.field1309 & -16777216));
                        }
                    } else if (this.field499[var16][var17] != null) {
                        class324 var21 = this.field499[var16][var17];
                        for (int var22 = 0; var22 < var21.field4400; ++var22) {
                            arg9[var22] = (var21.field4395[var22] - this.field503 * var16) * var13 / this.field503 + var14;
                            arg10[var22] = var15 - (var21.field4394[var22] - this.field503 * var17) * var13 / this.field503;
                        }
                        for (int var23 = 0; var23 < var21.field4393; ++var23) {
                            int var24 = var23 * 3;
                            int var25 = var24 + 1;
                            int var26 = var25 + 1;
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field4396 == null || var21.field4396[var23] == 0 || var21.field4401 != null && (var21.field4401 == null || var21.field4401[var23] != -1)) {
                                if (var21.field4401 != null && var21.field4401[var23] != -1) {
                                    int var34 = this.field504.method182(var21.field4401[var23]);
                                    arg8.method2048(var30, var31, var32, var27, var28, var29, var34, var34, var34);
                                } else {
                                    arg8.method2053(var30, var31, var32, var27, var28, var29, var21.field4397[var24], var21.field4397[var25], var21.field4397[var26]);
                                }
                            } else {
                                int var33 = var21.field4396[var23];
                                arg8.method2053(var30, var31, var32, var27, var28, var29, class219.method1455(false, var33, -16777216 - (var21.field4397[var24] & -16777216)), class219.method1455(false, var33, -16777216 - (var21.field4397[var25] & -16777216)), class219.method1455(false, var33, -16777216 - (var21.field4397[var26] & -16777216)));
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field4571 = true;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Llb;IIIIZ)V", line = 133)
    public final void method324(class210 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "()V", line = 142)
    public final void method325() {
        this.field489 = null;
        this.field497 = null;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V", line = 146)
    public final void method326(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9, int arg10, boolean arg11) {
        if (this.field493 == null) {
            this.field493 = new class94[super.field4384][super.field4382];
            this.field499 = new class324[super.field4384][super.field4382];
        } else if (this.field487 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var13 = 0; var13 < arg5.length; ++var13) {
                if (arg5[var13] == -1) {
                    arg5[var13] = 0;
                } else {
                    arg5[var13] = class119.field1810[class408.method2524(arg5[var13], 127) & 65535] << 8 | 255;
                }
            }
            if (arg6 != null) {
                for (int var14 = 0; var14 < arg6.length; ++var14) {
                    if (arg6[var14] == -1) {
                        arg6[var14] = 0;
                    } else {
                        arg6[var14] = class119.field1810[class408.method2524(arg6[var14], 127) & 65535] << 8 | 255;
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
                    } else if (arg2[var20] == this.field503 && arg4[var20] == 0) {
                        if (var17 != -1 && arg5[var17] != arg5[var20]) {
                            var15 = false;
                            break;
                        }
                        var17 = var20;
                    } else if (arg2[var20] == this.field503 && arg4[var20] == this.field503) {
                        if (var18 != -1 && arg5[var18] != arg5[var20]) {
                            var15 = false;
                            break;
                        }
                        var18 = var20;
                    } else if (arg2[var20] == 0 && arg4[var20] == this.field503) {
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
                            if (arg2[var22] != arg2[0] && arg2[0] + this.field503 != arg2[var22] && arg2[0] - this.field503 != arg2[var22]) {
                                var15 = false;
                                break;
                            }
                            if (arg4[var22] != arg4[0] && arg4[0] + this.field503 != arg4[var22] && arg4[0] - this.field503 != arg4[var22]) {
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
                class94 var23 = new class94();
                int var24 = arg5[0];
                int var25 = arg7[0];
                if (arg6 != null) {
                    var23.field1306 = arg6[0] >> 8;
                    if (var24 == 0) {
                        var23.field1305 = (byte) (var23.field1305 | 2);
                    }
                } else if (var24 == 0) {
                    return;
                }
                if (this.field510[arg0 + 1][arg1] == this.field510[arg0][arg1] && this.field510[arg0 + 1][arg1 + 1] == this.field510[arg0][arg1] && this.field510[arg0][arg1 + 1] == this.field510[arg0][arg1]) {
                    var23.field1305 = (byte) (var23.field1305 | 1);
                }
                if (var25 != -1 && (var23.field1305 & 2) == 0 && !this.field504.field365.method1366(var25, -11039).field709) {
                    var23.field1308 = this.field489[arg0][arg1] - this.field497[arg0][arg1];
                    var23.field1304 = this.field489[arg0 + 1][arg1] - this.field497[arg0 + 1][arg1];
                    var23.field1307 = this.field489[arg0 + 1][arg1 + 1] - this.field497[arg0 + 1][arg1 + 1];
                    var23.field1309 = this.field489[arg0][arg1 + 1] - this.field497[arg0][arg1 + 1];
                    var23.field1310 = (short) var25;
                } else {
                    int var26;
                    if (this.field507 != null && arg10 != 0) {
                        var26 = this.field507[arg0][arg1] * 255 / arg10;
                        if (var26 < 0) {
                            var26 = 0;
                        } else if (var26 > 255) {
                            var26 = 255;
                        }
                    } else {
                        var26 = 0;
                    }
                    var23.field1308 = class325.method1976(var26, method334(arg5[var16] >> 8, this.field489[arg0][arg1] - this.field497[arg0][arg1]), (byte) 127, arg9);
                    if (var23.field1306 != 0) {
                        var23.field1308 |= 255 - (this.field489[arg0][arg1] - this.field497[arg0][arg1]) << 25;
                    }
                    int var27;
                    if (this.field507 != null && arg10 != 0) {
                        var27 = this.field507[arg0 + 1][arg1] * 255 / arg10;
                        if (var27 < 0) {
                            var27 = 0;
                        } else if (var27 > 255) {
                            var27 = 255;
                        }
                    } else {
                        var27 = 0;
                    }
                    var23.field1304 = class325.method1976(var27, method334(arg5[var17] >> 8, this.field489[arg0 + 1][arg1] - this.field497[arg0 + 1][arg1]), (byte) 126, arg9);
                    if (var23.field1306 != 0) {
                        var23.field1304 |= 255 - (this.field489[arg0 + 1][arg1] - this.field497[arg0 + 1][arg1]) << 25;
                    }
                    int var28;
                    if (this.field507 != null && arg10 != 0) {
                        var28 = this.field507[arg0 + 1][arg1 + 1] * 255 / arg10;
                        if (var28 < 0) {
                            var28 = 0;
                        } else if (var28 > 255) {
                            var28 = 255;
                        }
                    } else {
                        var28 = 0;
                    }
                    var23.field1307 = class325.method1976(var28, method334(arg5[var18] >> 8, this.field489[arg0 + 1][arg1 + 1] - this.field497[arg0 + 1][arg1 + 1]), (byte) 107, arg9);
                    if (var23.field1306 != 0) {
                        var23.field1307 |= 255 - (this.field489[arg0 + 1][arg1 + 1] - this.field497[arg0 + 1][arg1 + 1]) << 25;
                    }
                    int var29;
                    if (this.field507 != null && arg10 != 0) {
                        var29 = this.field507[arg0][arg1 + 1] * 255 / arg10;
                        if (var29 < 0) {
                            var29 = 0;
                        } else if (var29 > 255) {
                            var29 = 255;
                        }
                    } else {
                        var29 = 0;
                    }
                    var23.field1309 = class325.method1976(var29, method334(arg5[var19] >> 8, this.field489[arg0][arg1 + 1] - this.field497[arg0][arg1 + 1]), (byte) 114, arg9);
                    if (var23.field1306 != 0) {
                        var23.field1309 |= 255 - (this.field489[arg0][arg1 + 1] - this.field497[arg0][arg1 + 1]) << 25;
                    }
                    var23.field1310 = -1;
                }
                this.field493[arg0][arg1] = var23;
            } else {
                class324 var30 = new class324();
                var30.field4400 = (short) arg2.length;
                var30.field4393 = (short) (arg2.length / 3);
                var30.field4395 = new short[var30.field4400];
                var30.field4398 = new short[var30.field4400];
                var30.field4394 = new short[var30.field4400];
                var30.field4397 = new int[var30.field4400];
                if (this.field507 != null) {
                    var30.field4402 = new short[var30.field4400];
                }
                for (int var31 = 0; var31 < var30.field4400; ++var31) {
                    int var46 = arg2[var31];
                    int var47 = arg4[var31];
                    boolean var48 = false;
                    int var49;
                    if (var46 == 0 && var47 == 0) {
                        var49 = this.field489[arg0][arg1] - this.field497[arg0][arg1];
                    } else if (var46 == 0 && this.field503 == var47) {
                        var49 = this.field489[arg0][arg1 + 1] - this.field497[arg0][arg1 + 1];
                    } else if (this.field503 == var46 && this.field503 == var47) {
                        var49 = this.field489[arg0 + 1][arg1 + 1] - this.field497[arg0 + 1][arg1 + 1];
                    } else if (this.field503 == var46 && var47 == 0) {
                        var49 = this.field489[arg0 + 1][arg1] - this.field497[arg0 + 1][arg1];
                    } else {
                        int var50 = (this.field489[arg0 + 1][arg1] - this.field497[arg0 + 1][arg1]) * var46 + (this.field489[arg0][arg1] - this.field497[arg0][arg1]) * (this.field503 - var46);
                        int var51 = (this.field489[arg0 + 1][arg1 + 1] - this.field497[arg0 + 1][arg1 + 1]) * var46 + (this.field489[arg0][arg1 + 1] - this.field497[arg0][arg1 + 1]) * (this.field503 - var46);
                        var49 = (this.field503 - var47) * var50 + var47 * var51 >> this.field506 * 2;
                    }
                    short var52 = (short) ((arg0 << this.field506) + var46);
                    short var53 = (short) ((arg1 << this.field506) + var47);
                    var30.field4395[var31] = var52;
                    var30.field4394[var31] = var53;
                    var30.field4398[var31] = (short) (this.method331(var52, var53) + (arg3 != null ? arg3[var31] : 0));
                    if (var49 < 0) {
                        var49 = 0;
                    }
                    if (arg7[var31] != -1 && !this.field504.field365.method1366(arg7[var31], -11039).field709) {
                        var30.field4397[var31] = var49;
                    } else if (arg5[var31] == 0) {
                        if (arg6 != null) {
                            var30.field4397[var31] = var49 << 25;
                        } else {
                            var30.field4397[var31] = 0;
                        }
                    } else {
                        int var54 = 0;
                        if (this.field507 != null) {
                            boolean var55 = false;
                            int var56;
                            if (var46 == 0 && var47 == 0) {
                                var56 = this.field507[arg0][arg1];
                            } else if (var46 == 0 && this.field503 == var47) {
                                var56 = this.field507[arg0][arg1 + 1];
                            } else if (this.field503 == var46 && this.field503 == var47) {
                                var56 = this.field507[arg0 + 1][arg1 + 1];
                            } else if (this.field503 == var46 && var47 == 0) {
                                var56 = this.field507[arg0 + 1][arg1];
                            } else {
                                int var57 = (this.field503 - var46) * this.field507[arg0][arg1] + this.field507[arg0 + 1][arg1] * var46;
                                int var58 = (this.field503 - var46) * this.field507[arg0][arg1 + 1] + this.field507[arg0 + 1][arg1 + 1] * var46;
                                var56 = (this.field503 - var47) * var57 + var47 * var58 >> this.field506 * 2;
                            }
                            var30.field4402[var31] = (short) var56;
                            if (arg10 != 0) {
                                var54 = var56 * 255 / arg10;
                                if (var54 < 0) {
                                    var54 = 0;
                                } else if (var54 > 255) {
                                    var54 = 255;
                                }
                            }
                        }
                        var30.field4397[var31] = class325.method1976(var54, method334(arg5[var31] >> 8, var49), (byte) 99, arg9);
                        if (arg6 != null) {
                            var30.field4397[var31] |= var49 << 25;
                        }
                    }
                }
                boolean var32 = false;
                for (int var33 = 0; var33 < var30.field4393; ++var33) {
                    if (arg7[var33 * 3] != -1 && !this.field504.field365.method1366(arg7[var33 * 3], -11039).field709) {
                        var32 = true;
                    }
                }
                if (arg6 != null) {
                    var30.field4396 = new int[var30.field4393];
                }
                if (var32) {
                    var30.field4401 = new short[var30.field4393];
                    var30.field4399 = new short[var30.field4393];
                }
                for (int var34 = 0; var34 < var30.field4393; ++var34) {
                    int var35 = var34 * 3;
                    if (arg6 != null && arg6[var35] != 0) {
                        var30.field4396[var34] = arg6[var35] >> 8;
                    }
                    if (var32) {
                        int var36 = var35 + 1;
                        int var37 = var36 + 1;
                        boolean var38 = false;
                        boolean var39 = true;
                        int var40 = arg7[var35];
                        if (var40 != -1 && !this.field504.field365.method1366(var40, -11039).field709) {
                            var38 = true;
                        } else {
                            var39 = false;
                        }
                        int var41 = arg7[var36];
                        if (var41 != -1 && !this.field504.field365.method1366(var41, -11039).field709) {
                            var38 = true;
                        } else {
                            var39 = false;
                        }
                        int var42 = arg7[var37];
                        if (var42 != -1 && !this.field504.field365.method1366(var42, -11039).field709) {
                            var38 = true;
                        } else {
                            var39 = false;
                        }
                        if (var39) {
                            var30.field4401[var34] = (short) var42;
                            var30.field4399[var34] = (short) arg8[var35];
                        } else {
                            if (var38) {
                                int var43 = arg7[var35];
                                if (var43 != -1 && !this.field504.field365.method1366(var43, -11039).field709) {
                                    var30.field4397[var35] = class119.field1810[class408.method2524(this.field504.field365.method1366(var43, -11039).field723 & 65535, 127) & 65535];
                                }
                                int var44 = arg7[var36];
                                if (var44 != -1 && !this.field504.field365.method1366(var44, -11039).field709) {
                                    var30.field4397[var36] = class119.field1810[class408.method2524(this.field504.field365.method1366(var44, -11039).field723 & 65535, 127) & 65535];
                                }
                                int var45 = arg7[var37];
                                if (var45 != -1 && !this.field504.field365.method1366(var45, -11039).field709) {
                                    var30.field4397[var37] = class119.field1810[class408.method2524(this.field504.field365.method1366(var45, -11039).field723 & 65535, 127) & 65535];
                                }
                            }
                            var30.field4401[var34] = -1;
                        }
                    }
                }
                this.field499[arg0][arg1] = var30;
            }
        }
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)Z", line = 655)
    private final boolean method327(int arg0) {
        if ((this.field505 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else {
            return arg0 == 8;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lbn;[I)V", line = 667)
    public final void method328(class155 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(II)I", line = 670)
    public final int method329(int arg0, int arg1) {
        return this.field510[arg0][arg1];
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIIIII[[Z)V", line = 679)
    public final void method330(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        class72 var9 = this.field504.method208(Thread.currentThread());
        class338 var10 = var9.field1001;
        var10.field4572 = 0;
        var10.field4563 = false;
        if (this.field493 != null) {
            this.method323(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field1030, var9.field1036);
        } else {
            if (this.field487 != null) {
                this.method342(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field1030, var9.field1036);
            }
        }
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(II)I", line = 696)
    public final int method331(int arg0, int arg1) {
        int var3 = arg0 >> this.field506;
        int var4 = arg1 >> this.field506;
        if (var3 >= 0 && var4 >= 0 && var3 <= super.field4384 - 1 && var4 <= super.field4382 - 1) {
            int var5 = arg0 & this.field503 - 1;
            int var6 = arg1 & this.field503 - 1;
            int var7 = (this.field503 - var5) * this.field510[var3][var4] + this.field510[var3 + 1][var4] * var5 >> this.field506;
            int var8 = (this.field503 - var5) * this.field510[var3][var4 + 1] + this.field510[var3 + 1][var4 + 1] * var5 >> this.field506;
            return (this.field503 - var6) * var7 + var6 * var8 >> this.field506;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(Llb;IIIIZ)V", line = 713)
    public final void method332(class210 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V", line = 717)
    public final void method333(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int arg12, int arg13, boolean arg14) {
        if (this.field487 == null) {
            this.field487 = new class297[super.field4384][super.field4382];
            this.field491 = new class158[super.field4384][super.field4382];
        } else if (this.field493 != null) {
            throw new IllegalStateException();
        }
        boolean var16 = false;
        if (arg8.length == 2 && arg5.length == 2 && (arg8[0] == arg8[1] || arg10[0] != -1 && arg10[0] == arg10[1])) {
            var16 = true;
            for (int var17 = 1; var17 < 2; ++var17) {
                int var18 = arg2[arg5[var17]];
                int var19 = arg4[arg5[var17]];
                if (var18 != 0 && this.field503 != var18 || var19 != 0 && this.field503 != var19) {
                    var16 = false;
                    break;
                }
            }
        }
        if (!var16) {
            class158 var20 = new class158();
            short var21 = (short) arg2.length;
            short var22 = (short) arg8.length;
            var20.field2239 = var21;
            var20.field2241 = new short[var21];
            var20.field2249 = new int[var21];
            var20.field2240 = new int[var21];
            var20.field2246 = new int[var21];
            for (int var23 = 0; var23 < var21; ++var23) {
                int var28 = arg2[var23];
                int var29 = arg4[var23];
                if (var28 == 0 && var29 == 0) {
                    var20.field2241[var23] = (short) (this.field489[arg0][arg1] - this.field497[arg0][arg1]);
                } else if (var28 == 0 && this.field503 == var29) {
                    var20.field2241[var23] = (short) (this.field489[arg0][arg1 + 1] - this.field497[arg0][arg1 + 1]);
                } else if (this.field503 == var28 && this.field503 == var29) {
                    var20.field2241[var23] = (short) (this.field489[arg0 + 1][arg1 + 1] - this.field497[arg0 + 1][arg1 + 1]);
                } else if (this.field503 == var28 && var29 == 0) {
                    var20.field2241[var23] = (short) (this.field489[arg0 + 1][arg1] - this.field497[arg0 + 1][arg1]);
                } else {
                    int var30 = (this.field489[arg0 + 1][arg1] - this.field497[arg0 + 1][arg1]) * var28 + (this.field489[arg0][arg1] - this.field497[arg0][arg1]) * (this.field503 - var28);
                    int var31 = (this.field489[arg0 + 1][arg1 + 1] - this.field497[arg0 + 1][arg1 + 1]) * var28 + (this.field489[arg0][arg1 + 1] - this.field497[arg0][arg1 + 1]) * (this.field503 - var28);
                    var20.field2241[var23] = (short) ((this.field503 - var29) * var30 + var29 * var31 >> this.field506 * 2);
                }
                int var32 = (arg0 << this.field506) + var28;
                int var33 = (arg1 << this.field506) + var29;
                var20.field2249[var23] = var32;
                var20.field2246[var23] = var33;
                var20.field2240[var23] = this.method331(var32, var33) + (arg3 != null ? arg3[var23] : 0);
                if (var20.field2241[var23] < 2) {
                    var20.field2241[var23] = 2;
                }
            }
            boolean var24 = false;
            int var25 = 0;
            for (int var26 = 0; var26 < var22; ++var26) {
                if (arg8[var26] >= 0 || arg9 != null && arg9[var26] >= 0) {
                    ++var25;
                }
                if (arg10[var26] != -1 && !this.field504.field365.method1366(arg10[var26], -11039).field709) {
                    var24 = true;
                }
            }
            var20.field2242 = new int[var25];
            if (arg9 != null) {
                var20.field2243 = new int[var25];
            }
            var20.field2251 = new short[var25];
            var20.field2250 = new short[var25];
            var20.field2248 = new short[var25];
            if (var24) {
                var20.field2247 = new short[var25];
                var20.field2245 = new short[var25];
            }
            for (int var27 = 0; var27 < var22; ++var27) {
                if (arg8[var27] >= 0 || arg9 != null && arg9[var27] >= 0) {
                    if (arg8[var27] >= 0) {
                        var20.field2242[var20.field2244] = class408.method2524(arg8[var27], 127);
                    } else {
                        var20.field2242[var20.field2244] = -1;
                    }
                    if (arg9 != null) {
                        if (arg9[var27] != -1) {
                            var20.field2243[var20.field2244] = class408.method2524(arg9[var27], 127);
                        } else {
                            var20.field2243[var20.field2244] = -1;
                        }
                    }
                    var20.field2251[var20.field2244] = (short) arg5[var27];
                    var20.field2250[var20.field2244] = (short) arg6[var27];
                    var20.field2248[var20.field2244] = (short) arg7[var27];
                    if (var24) {
                        if (arg10[var27] != -1 && !this.field504.field365.method1366(arg10[var27], -11039).field709) {
                            var20.field2247[var20.field2244] = (short) arg10[var27];
                            var20.field2245[var20.field2244] = (short) arg11[var27];
                        } else {
                            var20.field2247[var20.field2244] = -1;
                        }
                    }
                    ++var20.field2244;
                }
            }
            this.field491[arg0][arg1] = var20;
        } else {
            if (arg8[0] >= 0 || arg9 != null && arg9[0] >= 0) {
                class297 var34 = new class297();
                int var35 = arg8[0];
                int var36 = arg10[0];
                if (arg9 != null) {
                    var34.field4080 = class144.method1045(this.field489[arg0][arg1] - this.field497[arg0][arg1], (byte) 47, class408.method2524(arg9[0], 127));
                    if (var35 == -1) {
                        var34.field4074 = (byte) (var34.field4074 | 2);
                    }
                }
                if (this.field510[arg0 + 1][arg1] == this.field510[arg0][arg1] && this.field510[arg0 + 1][arg1 + 1] == this.field510[arg0][arg1] && this.field510[arg0][arg1 + 1] == this.field510[arg0][arg1]) {
                    var34.field4074 = (byte) (var34.field4074 | 1);
                }
                if (var36 != -1 && (var34.field4074 & 2) == 0 && !this.field504.field365.method1366(var36, -11039).field709) {
                    var34.field4076 = (short) (this.field489[arg0][arg1] - this.field497[arg0][arg1]);
                    var34.field4079 = (short) (this.field489[arg0 + 1][arg1] - this.field497[arg0 + 1][arg1]);
                    var34.field4078 = (short) (this.field489[arg0 + 1][arg1 + 1] - this.field497[arg0 + 1][arg1 + 1]);
                    var34.field4077 = (short) (this.field489[arg0][arg1 + 1] - this.field497[arg0][arg1 + 1]);
                    var34.field4075 = (short) var36;
                } else {
                    short var37 = class408.method2524(var35, 127);
                    var34.field4076 = (short) class144.method1045(this.field489[arg0][arg1] - this.field497[arg0][arg1], (byte) 79, var37);
                    var34.field4079 = (short) class144.method1045(this.field489[arg0 + 1][arg1] - this.field497[arg0 + 1][arg1], (byte) 118, var37);
                    var34.field4078 = (short) class144.method1045(this.field489[arg0 + 1][arg1 + 1] - this.field497[arg0 + 1][arg1 + 1], (byte) 73, var37);
                    var34.field4077 = (short) class144.method1045(this.field489[arg0][arg1 + 1] - this.field497[arg0][arg1 + 1], (byte) 87, var37);
                    var34.field4075 = -1;
                }
                this.field487[arg0][arg1] = var34;
            }
        }
    }

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "(II)I", line = 947)
    private static final int method334(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(III)V", line = 976)
    public final void method335(int arg0, int arg1, int arg2) {
        if (this.field497[arg0][arg1] < arg2) {
            this.field497[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(Llb;IIIIZ)Z", line = 982)
    public final boolean method336(class210 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(Lsq;IIII[[I[[II)V", line = 990)
    public class38(class27 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4);
        this.field504 = arg0;
        this.field505 = arg2;
        this.field510 = arg5;
        this.field507 = arg6;
        this.field503 = arg7;
        this.field506 = 0;
        while (arg7 > 1) {
            ++this.field506;
            arg7 >>= 1;
        }
        this.field489 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field504.field363 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = this.field510[var11 + 1][var10] - this.field510[var11 - 1][var10];
                int var14 = this.field510[var11][var10 + 1] - this.field510[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + var13 * var13 + 65536));
                int var16 = (var13 << 8) / var15;
                int var17 = -65536 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field504.field375 * var18 + this.field504.field388 * var16 + this.field504.field383 * var17 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field489[var11][var10] = (byte) var20;
            }
        }
        this.field497 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)V", line = 1050)
    public final void method337(int arg0, int arg1) {
        class72 var3 = this.field504.method208(Thread.currentThread());
        var3.field1001.field4572 = 0;
        if (this.field493 != null) {
            this.method339(arg0, arg1, this.field504.field385, var3.field1001, var3.field1030, var3.field1036, var3.field1034);
        } else {
            if (this.field487 != null) {
                this.method340(arg0, arg1, var3.field1001, var3.field1030, var3.field1036, var3.field1034);
            }
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(III[[ZZ)V", line = 1066)
    public final void method338(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        class400 var6 = this.field504.field345;
        this.field498 = var6.field5545;
        this.field508 = var6.field5542;
        this.field488 = var6.field5547;
        this.field492 = var6.field5540;
        this.field490 = var6.field5550;
        this.field500 = var6.field5543;
        this.field509 = var6.field5546;
        this.field502 = var6.field5551;
        this.field495 = var6.field5549;
        this.field501 = var6.field5541;
        this.field494 = var6.field5544;
        this.field496 = var6.field5548;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIZLgm;[I[I[I)V", line = 1082)
    private final void method339(int arg0, int arg1, boolean arg2, class338 arg3, int[] arg4, int[] arg5, int[] arg6) {
        class94 var8 = this.field493[arg0][arg1];
        if (var8 != null) {
            if ((var8.field1305 & 2) == 0) {
                int var9 = this.field503 * arg0;
                int var10 = this.field503 + var9;
                int var11 = this.field503 * arg1;
                int var12 = this.field503 + var11;
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
                if ((var8.field1305 & 1) != 0 && !arg2) {
                    int var17 = this.field510[arg0][arg1];
                    int var18 = this.field501 * var17;
                    var19 = (this.field494 * var11 + this.field495 * var9 + var18 >> 15) + this.field496;
                    if (var19 <= this.field504.field381) {
                        return;
                    }
                    var20 = (this.field494 * var11 + this.field495 * var10 + var18 >> 15) + this.field496;
                    if (var20 <= this.field504.field381) {
                        return;
                    }
                    var21 = (this.field494 * var12 + this.field495 * var10 + var18 >> 15) + this.field496;
                    if (var21 <= this.field504.field381) {
                        return;
                    }
                    var22 = (this.field494 * var12 + this.field495 * var9 + var18 >> 15) + this.field496;
                    if (var22 <= this.field504.field381) {
                        return;
                    }
                    if (this.field504.field342) {
                        int var23 = var19 - this.field504.field358;
                        if (var23 > 0) {
                            var13 = var23;
                            if (var23 > 255) {
                                var13 = 255;
                            }
                        }
                        int var24 = var20 - this.field504.field358;
                        if (var24 > 0) {
                            var14 = var24;
                            if (var24 > 255) {
                                var14 = 255;
                            }
                        }
                        int var25 = var21 - this.field504.field358;
                        if (var25 > 0) {
                            var15 = var25;
                            if (var25 > 255) {
                                var15 = 255;
                            }
                        }
                        int var26 = var22 - this.field504.field358;
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    int var27 = this.field508 * var17;
                    int var28 = this.field500 * var17;
                    var29 = (this.field488 * var11 + this.field498 * var9 + var27 >> 15) + this.field492;
                    var30 = this.field504.field368 * var29 / var19 + arg3.field4569;
                    var31 = (this.field509 * var11 + this.field490 * var9 + var28 >> 15) + this.field502;
                    var32 = this.field504.field359 * var31 / var19 + arg3.field4561;
                    var33 = (this.field488 * var11 + this.field498 * var10 + var27 >> 15) + this.field492;
                    var34 = this.field504.field368 * var33 / var20 + arg3.field4569;
                    var35 = (this.field509 * var11 + this.field490 * var10 + var28 >> 15) + this.field502;
                    var36 = this.field504.field359 * var35 / var20 + arg3.field4561;
                    var37 = (this.field488 * var12 + this.field498 * var10 + var27 >> 15) + this.field492;
                    var38 = this.field504.field368 * var37 / var21 + arg3.field4569;
                    var39 = (this.field509 * var12 + this.field490 * var10 + var28 >> 15) + this.field502;
                    var40 = this.field504.field359 * var39 / var21 + arg3.field4561;
                    var41 = (this.field488 * var12 + this.field498 * var9 + var27 >> 15) + this.field492;
                    var42 = this.field504.field368 * var41 / var22 + arg3.field4569;
                    var43 = (this.field509 * var12 + this.field490 * var9 + var28 >> 15) + this.field502;
                    var44 = this.field504.field359 * var43 / var22 + arg3.field4561;
                } else {
                    int var45 = this.field510[arg0][arg1];
                    int var46 = this.field510[arg0 + 1][arg1];
                    int var47 = this.field510[arg0 + 1][arg1 + 1];
                    int var48 = this.field510[arg0][arg1 + 1];
                    var19 = (this.field494 * var11 + this.field501 * var45 + this.field495 * var9 >> 15) + this.field496;
                    if (var19 <= this.field504.field381) {
                        return;
                    }
                    var20 = (this.field494 * var11 + this.field501 * var46 + this.field495 * var10 >> 15) + this.field496;
                    if (var20 <= this.field504.field381) {
                        return;
                    }
                    var21 = (this.field494 * var12 + this.field501 * var47 + this.field495 * var10 >> 15) + this.field496;
                    if (var21 <= this.field504.field381) {
                        return;
                    }
                    var22 = (this.field494 * var12 + this.field501 * var48 + this.field495 * var9 >> 15) + this.field496;
                    if (var22 <= this.field504.field381) {
                        return;
                    }
                    if (arg2) {
                        int var49 = var19 - this.field504.field358;
                        if (var49 > 255) {
                            var49 = 255;
                        }
                        if (var49 > 0) {
                            var13 = var49;
                            int var50 = this.field507[arg0][arg1] * var49 / 255;
                            if (var50 > 0) {
                                var45 -= var50;
                            }
                        }
                        int var51 = var20 - this.field504.field358;
                        if (var51 > 255) {
                            var51 = 255;
                        }
                        if (var51 > 0) {
                            var14 = var51;
                            int var52 = this.field507[arg0 + 1][arg1] * var51 / 255;
                            if (var52 > 0) {
                                var46 -= var52;
                            }
                        }
                        int var53 = var21 - this.field504.field358;
                        if (var53 > 255) {
                            var53 = 255;
                        }
                        if (var53 > 0) {
                            var15 = var53;
                            int var54 = this.field507[arg0 + 1][arg1 + 1] * var53 / 255;
                            if (var54 > 0) {
                                var47 -= var54;
                            }
                        }
                        int var55 = var22 - this.field504.field358;
                        if (var55 > 255) {
                            var55 = 255;
                        }
                        if (var55 > 0) {
                            var16 = var55;
                            int var56 = this.field507[arg0][arg1 + 1] * var55 / 255;
                            if (var56 > 0) {
                                var48 -= var56;
                            }
                        }
                    } else if (this.field504.field342) {
                        int var57 = var19 - this.field504.field358;
                        if (var57 > 0) {
                            var13 = var57;
                            if (var57 > 255) {
                                var13 = 255;
                            }
                        }
                        int var58 = var20 - this.field504.field358;
                        if (var58 > 0) {
                            var14 = var58;
                            if (var58 > 255) {
                                var14 = 255;
                            }
                        }
                        int var59 = var21 - this.field504.field358;
                        if (var59 > 0) {
                            var15 = var59;
                            if (var59 > 255) {
                                var15 = 255;
                            }
                        }
                        int var60 = var22 - this.field504.field358;
                        if (var60 > 0) {
                            var16 = var60;
                            if (var60 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    var29 = (this.field488 * var11 + this.field508 * var45 + this.field498 * var9 >> 15) + this.field492;
                    var30 = this.field504.field368 * var29 / var19 + arg3.field4569;
                    var31 = (this.field509 * var11 + this.field500 * var45 + this.field490 * var9 >> 15) + this.field502;
                    var32 = this.field504.field359 * var31 / var19 + arg3.field4561;
                    var33 = (this.field488 * var11 + this.field508 * var46 + this.field498 * var10 >> 15) + this.field492;
                    var34 = this.field504.field368 * var33 / var20 + arg3.field4569;
                    var35 = (this.field509 * var11 + this.field500 * var46 + this.field490 * var10 >> 15) + this.field502;
                    var36 = this.field504.field359 * var35 / var20 + arg3.field4561;
                    var37 = (this.field488 * var12 + this.field508 * var47 + this.field498 * var10 >> 15) + this.field492;
                    var38 = this.field504.field368 * var37 / var21 + arg3.field4569;
                    var39 = (this.field509 * var12 + this.field500 * var47 + this.field490 * var10 >> 15) + this.field502;
                    var40 = this.field504.field359 * var39 / var21 + arg3.field4561;
                    var41 = (this.field488 * var12 + this.field508 * var48 + this.field498 * var9 >> 15) + this.field492;
                    var42 = this.field504.field368 * var41 / var22 + arg3.field4569;
                    var43 = (this.field509 * var12 + this.field500 * var48 + this.field490 * var9 >> 15) + this.field502;
                    var44 = this.field504.field359 * var43 / var22 + arg3.field4561;
                }
                boolean var61 = var8.field1310 != -1 && this.method327(this.field504.field365.method1366(var8.field1310, -11039).field707);
                int var62 = var14 + var15 + var16;
                if ((var36 - var44) * (var38 - var42) - (var34 - var42) * (var40 - var44) > 0) {
                    arg3.field4563 = var38 < 0 || var42 < 0 || var34 < 0 || var38 > arg3.field4562 || var42 > arg3.field4562 || var34 > arg3.field4562;
                    if (var62 < 765) {
                        if (var61) {
                            arg3.field4572 = 100;
                        }
                        if (var62 > 0) {
                            if (var8.field1310 >= 0) {
                                arg3.method2055(var40, var44, var36, var38, var42, var34, this.field504.field379, var15, var16, var14, var8.field1307, var8.field1309, var8.field1304, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field1310);
                            } else {
                                arg3.method2053(var40, var44, var36, var38, var42, var34, class219.method1455(false, var8.field1307, var15 << 24 | this.field504.field379), class219.method1455(false, var8.field1309, var16 << 24 | this.field504.field379), class219.method1455(false, var8.field1304, var14 << 24 | this.field504.field379));
                            }
                        } else if (var8.field1310 >= 0) {
                            arg3.method2049(var40, var44, var36, var38, var42, var34, var8.field1307, var8.field1309, var8.field1304, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field1310);
                        } else {
                            arg3.method2053(var40, var44, var36, var38, var42, var34, var8.field1307, var8.field1309, var8.field1304);
                        }
                        arg3.field4572 = 0;
                    } else {
                        arg3.method2050(var40, var44, var36, var38, var42, var34, this.field504.field379);
                    }
                }
                int var63 = var13 + var14 + var16;
                if ((var30 - var34) * (var44 - var36) - (var32 - var36) * (var42 - var34) > 0) {
                    arg3.field4563 = var30 < 0 || var34 < 0 || var42 < 0 || var30 > arg3.field4562 || var34 > arg3.field4562 || var42 > arg3.field4562;
                    if (var63 < 765) {
                        if (var61) {
                            arg3.field4572 = 100;
                        }
                        if (var63 > 0) {
                            if (var8.field1310 >= 0) {
                                arg3.method2055(var32, var36, var44, var30, var34, var42, this.field504.field379, var13, var14, var16, var8.field1308, var8.field1304, var8.field1309, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field1310);
                            } else {
                                arg3.method2053(var32, var36, var44, var30, var34, var42, class219.method1455(false, var8.field1308, var13 << 24 | this.field504.field379), class219.method1455(false, var8.field1304, var14 << 24 | this.field504.field379), class219.method1455(false, var8.field1309, var16 << 24 | this.field504.field379));
                            }
                        } else if (var8.field1310 >= 0) {
                            arg3.method2049(var32, var36, var44, var30, var34, var42, var8.field1308, var8.field1304, var8.field1309, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field1310);
                        } else {
                            arg3.method2053(var32, var36, var44, var30, var34, var42, var8.field1308, var8.field1304, var8.field1309);
                        }
                        arg3.field4572 = 0;
                        return;
                    }
                    arg3.method2050(var32, var36, var44, var30, var34, var42, this.field504.field379);
                }
            }
        } else {
            class324 var64 = this.field499[arg0][arg1];
            if (var64 != null) {
                for (int var65 = 0; var65 < var64.field4400; ++var65) {
                    short var105 = var64.field4395[var65];
                    int var106 = var64.field4398[var65];
                    short var107 = var64.field4394[var65];
                    int var108 = (this.field494 * var107 + this.field501 * var106 + this.field495 * var105 >> 15) + this.field496;
                    if (var108 <= this.field504.field381) {
                        return;
                    }
                    arg6[var65] = 0;
                    if (arg2) {
                        int var109 = var108 - this.field504.field358;
                        if (var109 > 255) {
                            var109 = 255;
                        }
                        if (var109 > 0) {
                            arg6[var65] = var109;
                            int var110 = var64.field4402[var65] * var109 / 255;
                            if (var110 > 0) {
                                var106 -= var110;
                            }
                        }
                    } else if (this.field504.field342) {
                        int var111 = var108 - this.field504.field358;
                        if (var111 > 0) {
                            arg6[var65] = var111;
                            if (arg6[var65] > 255) {
                                arg6[var65] = 255;
                            }
                        }
                    }
                    int var112 = (this.field488 * var107 + this.field508 * var106 + this.field498 * var105 >> 15) + this.field492;
                    int var113 = (this.field509 * var107 + this.field500 * var106 + this.field490 * var105 >> 15) + this.field502;
                    arg4[var65] = this.field504.field368 * var112 / var108 + arg3.field4569;
                    arg5[var65] = this.field504.field359 * var113 / var108 + arg3.field4561;
                }
                if (var64.field4401 != null) {
                    int var66 = this.field510[arg0][arg1];
                    int var67 = this.field510[arg0 + 1][arg1];
                    int var68 = this.field510[arg0][arg1 + 1];
                    int var69 = this.field503 * arg0;
                    int var70 = this.field503 + var69;
                    int var71 = this.field503 * arg1;
                    int var72 = this.field503 + var71;
                    int var73 = (this.field488 * var71 + this.field508 * var66 + this.field498 * var69 >> 15) + this.field492;
                    int var74 = (this.field509 * var71 + this.field500 * var66 + this.field490 * var69 >> 15) + this.field502;
                    int var75 = (this.field494 * var71 + this.field501 * var66 + this.field495 * var69 >> 15) + this.field496;
                    int var76 = (this.field488 * var71 + this.field508 * var67 + this.field498 * var70 >> 15) + this.field492;
                    int var77 = (this.field509 * var71 + this.field500 * var67 + this.field490 * var70 >> 15) + this.field502;
                    int var78 = (this.field494 * var71 + this.field501 * var67 + this.field495 * var70 >> 15) + this.field496;
                    int var79 = (this.field488 * var72 + this.field508 * var68 + this.field498 * var69 >> 15) + this.field492;
                    int var80 = (this.field509 * var72 + this.field500 * var68 + this.field490 * var69 >> 15) + this.field502;
                    int var81 = (this.field494 * var72 + this.field501 * var68 + this.field495 * var69 >> 15) + this.field496;
                    for (int var82 = 0; var82 < var64.field4393; ++var82) {
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
                            arg3.field4563 = var86 < 0 || var87 < 0 || var88 < 0 || var86 > arg3.field4562 || var87 > arg3.field4562 || var88 > arg3.field4562;
                            short var93 = var64.field4401[var82];
                            if (var92 < 765) {
                                if (var93 != -1 && this.method327(this.field504.field365.method1366(var93, -11039).field707)) {
                                    arg3.field4572 = 100;
                                }
                                if (var92 > 0) {
                                    if (var93 != -1) {
                                        arg3.method2055(var89, var90, var91, var86, var87, var88, this.field504.field379, arg6[var83], arg6[var84], arg6[var85], var64.field4397[var83], var64.field4397[var84], var64.field4397[var85], var73, var76, var79, var74, var77, var80, var75, var78, var81, var93);
                                    } else if ((var64.field4397[var83] & 16777215) != 0) {
                                        arg3.method2053(var89, var90, var91, var86, var87, var88, class219.method1455(false, var64.field4397[var83], arg6[var83] << 24 | this.field504.field379), class219.method1455(false, var64.field4397[var84], arg6[var84] << 24 | this.field504.field379), class219.method1455(false, var64.field4397[var85], arg6[var85] << 24 | this.field504.field379));
                                    }
                                } else if (var93 != -1) {
                                    arg3.method2049(var89, var90, var91, var86, var87, var88, var64.field4397[var83], var64.field4397[var84], var64.field4397[var85], var73, var76, var79, var74, var77, var80, var75, var78, var81, var93);
                                } else if ((var64.field4397[var83] & 16777215) != 0) {
                                    arg3.method2053(var89, var90, var91, var86, var87, var88, var64.field4397[var83], var64.field4397[var84], var64.field4397[var85]);
                                }
                                arg3.field4572 = 0;
                            } else {
                                arg3.method2050(var89, var90, var91, var86, var87, var88, this.field504.field379);
                            }
                        }
                    }
                    return;
                }
                for (int var94 = 0; var94 < var64.field4393; ++var94) {
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
                        arg3.field4563 = var98 < 0 || var99 < 0 || var100 < 0 || var98 > arg3.field4562 || var99 > arg3.field4562 || var100 > arg3.field4562;
                        if (var104 < 765) {
                            if (var104 > 0) {
                                if ((var64.field4397[var95] & 16777215) != 0) {
                                    arg3.method2053(var101, var102, var103, var98, var99, var100, class325.method1976(arg6[var95], var64.field4397[var95], (byte) 75, this.field504.field379), class325.method1976(arg6[var96], var64.field4397[var96], (byte) 114, this.field504.field379), class325.method1976(arg6[var97], var64.field4397[var97], (byte) 92, this.field504.field379));
                                }
                            } else if ((var64.field4397[var95] & 16777215) != 0) {
                                arg3.method2053(var101, var102, var103, var98, var99, var100, var64.field4397[var95], var64.field4397[var96], var64.field4397[var97]);
                            }
                        } else {
                            arg3.method2050(var101, var102, var103, var98, var99, var100, this.field504.field379);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IILgm;[I[I[I)V", line = 1649)
    private final void method340(int arg0, int arg1, class338 arg2, int[] arg3, int[] arg4, int[] arg5) {
        class297 var7 = this.field487[arg0][arg1];
        if (var7 != null) {
            if ((var7.field4074 & 2) == 0) {
                int var8 = this.field503 * arg0;
                int var9 = this.field503 + var8;
                int var10 = this.field503 * arg1;
                int var11 = this.field503 + var10;
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
                if ((var7.field4074 & 1) != 0) {
                    int var12 = this.field510[arg0][arg1];
                    int var13 = this.field501 * var12;
                    var14 = (this.field494 * var10 + this.field495 * var8 + var13 >> 15) + this.field496;
                    if (var14 <= this.field504.field381) {
                        return;
                    }
                    var15 = (this.field494 * var10 + this.field495 * var9 + var13 >> 15) + this.field496;
                    if (var15 <= this.field504.field381) {
                        return;
                    }
                    int var16 = (this.field494 * var11 + this.field495 * var9 + var13 >> 15) + this.field496;
                    if (var16 <= this.field504.field381) {
                        return;
                    }
                    var17 = (this.field494 * var11 + this.field495 * var8 + var13 >> 15) + this.field496;
                    if (var17 <= this.field504.field381) {
                        return;
                    }
                    int var18 = this.field508 * var12;
                    int var19 = this.field500 * var12;
                    var20 = (this.field488 * var10 + this.field498 * var8 + var18 >> 15) + this.field492;
                    var21 = this.field504.field368 * var20 / var14 + arg2.field4569;
                    var22 = (this.field509 * var10 + this.field490 * var8 + var19 >> 15) + this.field502;
                    var23 = this.field504.field359 * var22 / var14 + arg2.field4561;
                    var24 = (this.field488 * var10 + this.field498 * var9 + var18 >> 15) + this.field492;
                    var25 = this.field504.field368 * var24 / var15 + arg2.field4569;
                    var26 = (this.field509 * var10 + this.field490 * var9 + var19 >> 15) + this.field502;
                    var27 = this.field504.field359 * var26 / var15 + arg2.field4561;
                    int var28 = (this.field488 * var11 + this.field498 * var9 + var18 >> 15) + this.field492;
                    var29 = this.field504.field368 * var28 / var16 + arg2.field4569;
                    int var30 = (this.field509 * var11 + this.field490 * var9 + var19 >> 15) + this.field502;
                    var31 = this.field504.field359 * var30 / var16 + arg2.field4561;
                    var32 = (this.field488 * var11 + this.field498 * var8 + var18 >> 15) + this.field492;
                    var33 = this.field504.field368 * var32 / var17 + arg2.field4569;
                    var34 = (this.field509 * var11 + this.field490 * var8 + var19 >> 15) + this.field502;
                    var35 = this.field504.field359 * var34 / var17 + arg2.field4561;
                } else {
                    int var36 = this.field510[arg0][arg1];
                    int var37 = this.field510[arg0 + 1][arg1];
                    int var38 = this.field510[arg0 + 1][arg1 + 1];
                    int var39 = this.field510[arg0][arg1 + 1];
                    var14 = (this.field494 * var10 + this.field501 * var36 + this.field495 * var8 >> 15) + this.field496;
                    if (var14 <= this.field504.field381) {
                        return;
                    }
                    var15 = (this.field494 * var10 + this.field501 * var37 + this.field495 * var9 >> 15) + this.field496;
                    if (var15 <= this.field504.field381) {
                        return;
                    }
                    int var40 = (this.field494 * var11 + this.field501 * var38 + this.field495 * var9 >> 15) + this.field496;
                    if (var40 <= this.field504.field381) {
                        return;
                    }
                    var17 = (this.field494 * var11 + this.field501 * var39 + this.field495 * var8 >> 15) + this.field496;
                    if (var17 <= this.field504.field381) {
                        return;
                    }
                    var20 = (this.field488 * var10 + this.field508 * var36 + this.field498 * var8 >> 15) + this.field492;
                    var21 = this.field504.field368 * var20 / var14 + arg2.field4569;
                    var22 = (this.field509 * var10 + this.field500 * var36 + this.field490 * var8 >> 15) + this.field502;
                    var23 = this.field504.field359 * var22 / var14 + arg2.field4561;
                    var24 = (this.field488 * var10 + this.field508 * var37 + this.field498 * var9 >> 15) + this.field492;
                    var25 = this.field504.field368 * var24 / var15 + arg2.field4569;
                    var26 = (this.field509 * var10 + this.field500 * var37 + this.field490 * var9 >> 15) + this.field502;
                    var27 = this.field504.field359 * var26 / var15 + arg2.field4561;
                    int var41 = (this.field488 * var11 + this.field508 * var38 + this.field498 * var9 >> 15) + this.field492;
                    var29 = this.field504.field368 * var41 / var40 + arg2.field4569;
                    int var42 = (this.field509 * var11 + this.field500 * var38 + this.field490 * var9 >> 15) + this.field502;
                    var31 = this.field504.field359 * var42 / var40 + arg2.field4561;
                    var32 = (this.field488 * var11 + this.field508 * var39 + this.field498 * var8 >> 15) + this.field492;
                    var33 = this.field504.field368 * var32 / var17 + arg2.field4569;
                    var34 = (this.field509 * var11 + this.field500 * var39 + this.field490 * var8 >> 15) + this.field502;
                    var35 = this.field504.field359 * var34 / var17 + arg2.field4561;
                }
                if ((var27 - var35) * (var29 - var33) - (var25 - var33) * (var31 - var35) > 0) {
                    arg2.field4563 = var29 < 0 || var33 < 0 || var25 < 0 || var29 > arg2.field4562 || var33 > arg2.field4562 || var25 > arg2.field4562;
                    if (var7.field4075 >= 0) {
                        if (this.method327(this.field504.field365.method1366(var7.field4075, -11039).field707)) {
                            arg2.field4572 = 100;
                        }
                        arg2.method2049(var31, var35, var27, var29, var33, var25, var7.field4078 & 65535, var7.field4077 & 65535, var7.field4079 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field4075);
                        arg2.field4572 = 0;
                    } else {
                        arg2.method2048(var31, var35, var27, var29, var33, var25, var7.field4078 & 65535, var7.field4077 & 65535, var7.field4079 & 65535);
                    }
                }
                if ((var21 - var25) * (var35 - var27) - (var23 - var27) * (var33 - var25) > 0) {
                    arg2.field4563 = var21 < 0 || var25 < 0 || var33 < 0 || var21 > arg2.field4562 || var25 > arg2.field4562 || var33 > arg2.field4562;
                    if (var7.field4075 >= 0) {
                        if (this.method327(this.field504.field365.method1366(var7.field4075, -11039).field707)) {
                            arg2.field4572 = 100;
                        }
                        arg2.method2049(var23, var27, var35, var21, var25, var33, var7.field4076 & 65535, var7.field4079 & 65535, var7.field4077 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field4075);
                        arg2.field4572 = 0;
                        return;
                    }
                    arg2.method2048(var23, var27, var35, var21, var25, var33, var7.field4076 & 65535, var7.field4079 & 65535, var7.field4077 & 65535);
                }
            }
        } else {
            class158 var43 = this.field491[arg0][arg1];
            if (var43 != null) {
                for (int var44 = 0; var44 < var43.field2239; ++var44) {
                    int var84 = var43.field2249[var44];
                    int var85 = var43.field2240[var44];
                    int var86 = var43.field2246[var44];
                    int var87 = (this.field494 * var86 + this.field501 * var85 + this.field495 * var84 >> 15) + this.field496;
                    if (var87 <= this.field504.field381) {
                        return;
                    }
                    int var88 = (this.field488 * var86 + this.field508 * var85 + this.field498 * var84 >> 15) + this.field492;
                    int var89 = (this.field509 * var86 + this.field500 * var85 + this.field490 * var84 >> 15) + this.field502;
                    arg3[var44] = this.field504.field368 * var88 / var87 + arg2.field4569;
                    arg4[var44] = this.field504.field359 * var89 / var87 + arg2.field4561;
                }
                if (var43.field2247 != null) {
                    int var45 = this.field510[arg0][arg1];
                    int var46 = this.field510[arg0 + 1][arg1];
                    int var47 = this.field510[arg0][arg1 + 1];
                    int var48 = this.field503 * arg0;
                    int var49 = this.field503 + var48;
                    int var50 = this.field503 * arg1;
                    int var51 = this.field503 + var50;
                    int var52 = (this.field488 * var50 + this.field508 * var45 + this.field498 * var48 >> 15) + this.field492;
                    int var53 = (this.field509 * var50 + this.field500 * var45 + this.field490 * var48 >> 15) + this.field502;
                    int var54 = (this.field494 * var50 + this.field501 * var45 + this.field495 * var48 >> 15) + this.field496;
                    int var55 = (this.field488 * var50 + this.field508 * var46 + this.field498 * var49 >> 15) + this.field492;
                    int var56 = (this.field509 * var50 + this.field500 * var46 + this.field490 * var49 >> 15) + this.field502;
                    int var57 = (this.field494 * var50 + this.field501 * var46 + this.field495 * var49 >> 15) + this.field496;
                    int var58 = (this.field488 * var51 + this.field508 * var47 + this.field498 * var48 >> 15) + this.field492;
                    int var59 = (this.field509 * var51 + this.field500 * var47 + this.field490 * var48 >> 15) + this.field502;
                    int var60 = (this.field494 * var51 + this.field501 * var47 + this.field495 * var48 >> 15) + this.field496;
                    for (int var61 = 0; var61 < var43.field2244; ++var61) {
                        short var62 = var43.field2251[var61];
                        short var63 = var43.field2250[var61];
                        short var64 = var43.field2248[var61];
                        int var65 = arg3[var62];
                        int var66 = arg3[var63];
                        int var67 = arg3[var64];
                        int var68 = arg4[var62];
                        int var69 = arg4[var63];
                        int var70 = arg4[var64];
                        if ((var65 - var66) * (var70 - var69) - (var67 - var66) * (var68 - var69) > 0) {
                            arg2.field4563 = var65 < 0 || var66 < 0 || var67 < 0 || var65 > arg2.field4562 || var66 > arg2.field4562 || var67 > arg2.field4562;
                            short var71 = var43.field2247[var61];
                            if (var71 != -1) {
                                if (this.method327(this.field504.field365.method1366(var71, -11039).field707)) {
                                    arg2.field4572 = 100;
                                }
                                arg2.method2049(var68, var69, var70, var65, var66, var67, var43.field2241[var62], var43.field2241[var63], var43.field2241[var64], var52, var55, var58, var53, var56, var59, var54, var57, var60, var71);
                                arg2.field4572 = 0;
                            } else {
                                int var72 = var43.field2242[var61];
                                if (var72 != -1) {
                                    arg2.method2048(var68, var69, var70, var65, var66, var67, class144.method1045(var43.field2241[var62], (byte) 41, var72), class144.method1045(var43.field2241[var63], (byte) 124, var72), class144.method1045(var43.field2241[var64], (byte) 64, var72));
                                }
                            }
                        }
                    }
                    return;
                }
                for (int var73 = 0; var73 < var43.field2244; ++var73) {
                    short var74 = var43.field2251[var73];
                    short var75 = var43.field2250[var73];
                    short var76 = var43.field2248[var73];
                    int var77 = arg3[var74];
                    int var78 = arg3[var75];
                    int var79 = arg3[var76];
                    int var80 = arg4[var74];
                    int var81 = arg4[var75];
                    int var82 = arg4[var76];
                    if ((var77 - var78) * (var82 - var81) - (var79 - var78) * (var80 - var81) > 0) {
                        int var83 = var43.field2242[var73];
                        if (var83 != -1) {
                            arg2.field4563 = var77 < 0 || var78 < 0 || var79 < 0 || var77 > arg2.field4562 || var78 > arg2.field4562 || var79 > arg2.field4562;
                            arg2.method2048(var80, var81, var82, var77, var78, var79, class144.method1045(var43.field2241[var74], (byte) 85, var83), class144.method1045(var43.field2241[var75], (byte) 24, var83), class144.method1045(var43.field2241[var76], (byte) 119, var83));
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IILlb;)Llb;", line = 1965)
    public final class210 method341(int arg0, int arg1, class210 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(IIIIIII[[ZLgm;[I[I)V", line = 1970)
    private final void method342(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class338 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field4571 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field487[var16][var17] != null) {
                        class297 var18 = this.field487[var16][var17];
                        if (var18.field4075 != -1 && (var18.field4074 & 2) == 0 && var18.field4080 == -1) {
                            int var19 = this.field504.method182(var18.field4075);
                            arg8.method2048(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class144.method1045(var18.field4078 & 65535, (byte) 125, var19), class144.method1045(var18.field4077 & 65535, (byte) 38, var19), class144.method1045(var18.field4079 & 65535, (byte) 61, var19));
                            arg8.method2048(var15, var15, var15 - var13, var14, var13 + var14, var14, class144.method1045(var18.field4076 & 65535, (byte) 76, var19), class144.method1045(var18.field4079 & 65535, (byte) 93, var19), class144.method1045(var18.field4077 & 65535, (byte) 36, var19));
                        } else if (var18.field4080 == -1) {
                            arg8.method2048(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field4078 & 65535, var18.field4077 & 65535, var18.field4079 & 65535);
                            arg8.method2048(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field4076 & 65535, var18.field4079 & 65535, var18.field4077 & 65535);
                        } else {
                            int var20 = var18.field4080;
                            arg8.method2048(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var20, var20, var20);
                            arg8.method2048(var15, var15, var15 - var13, var14, var13 + var14, var14, var20, var20, var20);
                        }
                    } else if (this.field491[var16][var17] != null) {
                        class158 var21 = this.field491[var16][var17];
                        for (int var22 = 0; var22 < var21.field2239; ++var22) {
                            arg9[var22] = (var21.field2249[var22] - this.field503 * var16) * var13 / this.field503 + var14;
                            arg10[var22] = var15 - (var21.field2246[var22] - this.field503 * var17) * var13 / this.field503;
                        }
                        for (int var23 = 0; var23 < var21.field2244; ++var23) {
                            short var24 = var21.field2251[var23];
                            short var25 = var21.field2250[var23];
                            short var26 = var21.field2248[var23];
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field2243 != null && var21.field2243[var23] != -1) {
                                int var33 = var21.field2243[var23];
                                arg8.method2048(var30, var31, var32, var27, var28, var29, class144.method1045(var21.field2241[var24], (byte) 124, var33), class144.method1045(var21.field2241[var25], (byte) 118, var33), class144.method1045(var21.field2241[var26], (byte) 26, var33));
                            } else if (var21.field2247 != null && var21.field2247[var23] != -1) {
                                int var34 = this.field504.method182(var21.field2247[var23]);
                                arg8.method2048(var30, var31, var32, var27, var28, var29, class144.method1045(var21.field2241[var24], (byte) 71, var34), class144.method1045(var21.field2241[var25], (byte) 93, var34), class144.method1045(var21.field2241[var26], (byte) 88, var34));
                            } else {
                                int var35 = var21.field2242[var23];
                                arg8.method2048(var30, var31, var32, var27, var28, var29, class144.method1045(var21.field2241[var24], (byte) 107, var35), class144.method1045(var21.field2241[var25], (byte) 32, var35), class144.method1045(var21.field2241[var26], (byte) 25, var35));
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field4571 = true;
    }
}
