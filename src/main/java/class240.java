import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public class class240 extends class441 {

    @OriginalMember(owner = "client!wu", name = "j", descriptor = "I")
    private int field3386 = -1;

    @OriginalMember(owner = "client!wu", name = "C", descriptor = "Llg;")
    private class273 field3405;

    @OriginalMember(owner = "client!wu", name = "k", descriptor = "I")
    private int field3387;

    @OriginalMember(owner = "client!wu", name = "u", descriptor = "[[I")
    public int[][] field3397;

    @OriginalMember(owner = "client!wu", name = "y", descriptor = "[[B")
    private byte[][] field3401;

    @OriginalMember(owner = "client!wu", name = "t", descriptor = "[[B")
    private byte[][] field3396;

    @OriginalMember(owner = "client!wu", name = "i", descriptor = "I")
    private int field3385;

    @OriginalMember(owner = "client!wu", name = "l", descriptor = "I")
    private int field3388;

    @OriginalMember(owner = "client!wu", name = "m", descriptor = "I")
    private int field3389;

    @OriginalMember(owner = "client!wu", name = "o", descriptor = "I")
    private int field3391;

    @OriginalMember(owner = "client!wu", name = "p", descriptor = "I")
    private int field3392;

    @OriginalMember(owner = "client!wu", name = "r", descriptor = "I")
    private int field3394;

    @OriginalMember(owner = "client!wu", name = "s", descriptor = "I")
    private int field3395;

    @OriginalMember(owner = "client!wu", name = "w", descriptor = "I")
    private int field3399;

    @OriginalMember(owner = "client!wu", name = "z", descriptor = "I")
    private int field3402;

    @OriginalMember(owner = "client!wu", name = "A", descriptor = "I")
    private int field3403;

    @OriginalMember(owner = "client!wu", name = "B", descriptor = "I")
    private int field3404;

    @OriginalMember(owner = "client!wu", name = "D", descriptor = "I")
    private int field3406;

    @OriginalMember(owner = "client!wu", name = "x", descriptor = "[[Lku;")
    private class243[][] field3400;

    @OriginalMember(owner = "client!wu", name = "v", descriptor = "[[Lbi;")
    private class320[][] field3398;

    @OriginalMember(owner = "client!wu", name = "q", descriptor = "[[Lmp;")
    private class512[][] field3393;

    @OriginalMember(owner = "client!wu", name = "n", descriptor = "[[Lls;")
    private class88[][] field3390;

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "()V", line = 4)
    public final void method847() {
        this.field3401 = null;
        this.field3396 = null;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 8)
    public final void method862(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (this.field3393 == null) {
            this.field3393 = new class512[super.field6434][super.field6436];
            this.field3390 = new class88[super.field6434][super.field6436];
        } else if (this.field3398 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var15 = 0; var15 < arg6.length; ++var15) {
                if (arg6[var15] == -1) {
                    arg6[var15] = 0;
                } else {
                    arg6[var15] = class65.field971[class397.method2372(-1198994943, arg6[var15]) & 65535] << 8 | 255;
                }
            }
            if (arg7 != null) {
                for (int var16 = 0; var16 < arg7.length; ++var16) {
                    if (arg7[var16] == -1) {
                        arg7[var16] = 0;
                    } else {
                        arg7[var16] = class65.field971[class397.method2372(-1198994943, arg7[var16]) & 65535] << 8 | 255;
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
                    } else if (arg2[var22] == super.field6438 && arg4[var22] == 0) {
                        if (var19 != -1 && arg6[var19] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var19 = var22;
                    } else if (arg2[var22] == super.field6438 && arg4[var22] == super.field6438) {
                        if (var20 != -1 && arg6[var20] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var20 = var22;
                    } else if (arg2[var22] == 0 && arg4[var22] == super.field6438) {
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
                            if (arg2[var24] != arg2[0] && arg2[0] + super.field6438 != arg2[var24] && arg2[0] - super.field6438 != arg2[var24]) {
                                var17 = false;
                                break;
                            }
                            if (arg4[var24] != arg4[0] && arg4[0] + super.field6438 != arg4[var24] && arg4[0] - super.field6438 != arg4[var24]) {
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
                class512 var25 = new class512();
                int var26 = arg6[0];
                int var27 = arg8[0];
                if (arg7 != null) {
                    var25.field7767 = arg7[0] >> 8;
                    if (var26 == 0) {
                        var25.field7761 = (byte) (var25.field7761 | 2);
                    }
                } else if (var26 == 0) {
                    return;
                }
                if (this.field3397[arg0 + 1][arg1] == this.field3397[arg0][arg1] && this.field3397[arg0 + 1][arg1 + 1] == this.field3397[arg0][arg1] && this.field3397[arg0][arg1 + 1] == this.field3397[arg0][arg1]) {
                    var25.field7761 = (byte) (var25.field7761 | 1);
                }
                if (var27 != -1 && (var25.field7761 & 2) == 0 && !this.field3405.field1695.method432(var27, true).field1543) {
                    var25.field7764 = this.field3401[arg0][arg1] - this.field3396[arg0][arg1];
                    var25.field7759 = this.field3401[arg0 + 1][arg1] - this.field3396[arg0 + 1][arg1];
                    var25.field7762 = this.field3401[arg0 + 1][arg1 + 1] - this.field3396[arg0 + 1][arg1 + 1];
                    var25.field7757 = this.field3401[arg0][arg1 + 1] - this.field3396[arg0][arg1 + 1];
                    var25.field7763 = (short) var27;
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
                    var25.field7764 = class242.method1498(17289, var28, method1479(arg6[var18] >> 8, this.field3401[arg0][arg1] - this.field3396[arg0][arg1]), arg10);
                    if (var25.field7767 != 0) {
                        var25.field7764 |= 255 - (this.field3401[arg0][arg1] - this.field3396[arg0][arg1]) << 25;
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
                    var25.field7759 = class242.method1498(17289, var29, method1479(arg6[var19] >> 8, this.field3401[arg0 + 1][arg1] - this.field3396[arg0 + 1][arg1]), arg10);
                    if (var25.field7767 != 0) {
                        var25.field7759 |= 255 - (this.field3401[arg0 + 1][arg1] - this.field3396[arg0 + 1][arg1]) << 25;
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
                    var25.field7762 = class242.method1498(17289, var30, method1479(arg6[var20] >> 8, this.field3401[arg0 + 1][arg1 + 1] - this.field3396[arg0 + 1][arg1 + 1]), arg10);
                    if (var25.field7767 != 0) {
                        var25.field7762 |= 255 - (this.field3401[arg0 + 1][arg1 + 1] - this.field3396[arg0 + 1][arg1 + 1]) << 25;
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
                    var25.field7757 = class242.method1498(17289, var31, method1479(arg6[var21] >> 8, this.field3401[arg0][arg1 + 1] - this.field3396[arg0][arg1 + 1]), arg10);
                    if (var25.field7767 != 0) {
                        var25.field7757 |= 255 - (this.field3401[arg0][arg1 + 1] - this.field3396[arg0][arg1 + 1]) << 25;
                    }
                    var25.field7763 = -1;
                }
                if (arg5 != null) {
                    var25.field7766 = (short) arg5[var20];
                    var25.field7760 = (short) arg5[var21];
                    var25.field7758 = (short) arg5[var19];
                    var25.field7765 = (short) arg5[var18];
                }
                this.field3393[arg0][arg1] = var25;
            } else {
                class88 var32 = new class88();
                var32.field1204 = (short) arg2.length;
                var32.field1210 = (short) (arg2.length / 3);
                var32.field1205 = new short[var32.field1204];
                var32.field1203 = new short[var32.field1204];
                var32.field1211 = new short[var32.field1204];
                var32.field1208 = new int[var32.field1204];
                if (arg5 != null) {
                    var32.field1202 = new short[var32.field1204];
                }
                for (int var33 = 0; var33 < var32.field1204; ++var33) {
                    int var48 = arg2[var33];
                    int var49 = arg4[var33];
                    boolean var50 = false;
                    int var51;
                    if (var48 == 0 && var49 == 0) {
                        var51 = this.field3401[arg0][arg1] - this.field3396[arg0][arg1];
                    } else if (var48 == 0 && super.field6438 == var49) {
                        var51 = this.field3401[arg0][arg1 + 1] - this.field3396[arg0][arg1 + 1];
                    } else if (super.field6438 == var48 && super.field6438 == var49) {
                        var51 = this.field3401[arg0 + 1][arg1 + 1] - this.field3396[arg0 + 1][arg1 + 1];
                    } else if (super.field6438 == var48 && var49 == 0) {
                        var51 = this.field3401[arg0 + 1][arg1] - this.field3396[arg0 + 1][arg1];
                    } else {
                        int var52 = (this.field3401[arg0 + 1][arg1] - this.field3396[arg0 + 1][arg1]) * var48 + (this.field3401[arg0][arg1] - this.field3396[arg0][arg1]) * (super.field6438 - var48);
                        int var53 = (this.field3401[arg0 + 1][arg1 + 1] - this.field3396[arg0 + 1][arg1 + 1]) * var48 + (this.field3401[arg0][arg1 + 1] - this.field3396[arg0][arg1 + 1]) * (super.field6438 - var48);
                        var51 = (super.field6438 - var49) * var52 + var49 * var53 >> super.field6441 * 2;
                    }
                    int var54 = (arg0 << super.field6441) + var48;
                    int var55 = (arg1 << super.field6441) + var49;
                    var32.field1205[var33] = (short) var48;
                    var32.field1211[var33] = (short) var49;
                    var32.field1203[var33] = (short) (this.method855(var54, var55) + (arg3 != null ? arg3[var33] : 0));
                    if (var51 < 0) {
                        var51 = 0;
                    }
                    if (arg8[var33] != -1 && !this.field3405.field1695.method432(arg8[var33], true).field1543) {
                        var32.field1208[var33] = var51;
                    } else if (arg6[var33] == 0) {
                        if (arg7 != null) {
                            var32.field1208[var33] = var51 << 25;
                        } else {
                            var32.field1208[var33] = 0;
                        }
                    } else {
                        int var56 = 0;
                        if (arg5 != null) {
                            short var57 = var32.field1202[var33] = (short) arg5[var33];
                            if (arg11 != 0) {
                                var56 = var57 * 255 / arg11;
                                if (var56 < 0) {
                                    var56 = 0;
                                } else if (var56 > 255) {
                                    var56 = 255;
                                }
                            }
                        }
                        var32.field1208[var33] = class242.method1498(17289, var56, method1479(arg6[var33] >> 8, var51), arg10);
                        if (arg7 != null) {
                            var32.field1208[var33] |= var51 << 25;
                        }
                    }
                }
                boolean var34 = false;
                for (int var35 = 0; var35 < var32.field1210; ++var35) {
                    if (arg8[var35 * 3] != -1 && !this.field3405.field1695.method432(arg8[var35 * 3], true).field1543) {
                        var34 = true;
                    }
                }
                if (arg7 != null) {
                    var32.field1206 = new int[var32.field1210];
                }
                if (var34) {
                    var32.field1209 = new short[var32.field1210];
                    var32.field1207 = new short[var32.field1210];
                }
                for (int var36 = 0; var36 < var32.field1210; ++var36) {
                    int var37 = var36 * 3;
                    if (arg7 != null && arg7[var37] != 0) {
                        var32.field1206[var36] = arg7[var37] >> 8;
                    }
                    if (var34) {
                        int var38 = var37 + 1;
                        int var39 = var38 + 1;
                        boolean var40 = false;
                        boolean var41 = true;
                        int var42 = arg8[var37];
                        if (var42 != -1 && !this.field3405.field1695.method432(var42, true).field1543) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var43 = arg8[var38];
                        if (var43 != -1 && !this.field3405.field1695.method432(var43, true).field1543) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var44 = arg8[var39];
                        if (var44 != -1 && !this.field3405.field1695.method432(var44, true).field1543) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        if (var41) {
                            var32.field1209[var36] = (short) var44;
                            var32.field1207[var36] = (short) arg9[var37];
                        } else {
                            if (var40) {
                                int var45 = arg8[var37];
                                if (var45 != -1 && !this.field3405.field1695.method432(var45, true).field1543) {
                                    var32.field1208[var37] = class65.field971[class397.method2372(-1198994943, this.field3405.field1695.method432(var45, true).field1532 & 65535) & 65535];
                                }
                                int var46 = arg8[var38];
                                if (var46 != -1 && !this.field3405.field1695.method432(var46, true).field1543) {
                                    var32.field1208[var38] = class65.field971[class397.method2372(-1198994943, this.field3405.field1695.method432(var46, true).field1532 & 65535) & 65535];
                                }
                                int var47 = arg8[var39];
                                if (var47 != -1 && !this.field3405.field1695.method432(var47, true).field1543) {
                                    var32.field1208[var39] = class65.field971[class397.method2372(-1198994943, this.field3405.field1695.method432(var47, true).field1532 & 65535) & 65535];
                                }
                            }
                            var32.field1209[var36] = -1;
                        }
                    }
                }
                this.field3390[arg0][arg1] = var32;
            }
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIZLof;[I[I[I)V", line = 503)
    private final void method1476(int arg0, int arg1, boolean arg2, class421 arg3, int[] arg4, int[] arg5, int[] arg6) {
        class512 var8 = this.field3393[arg0][arg1];
        if (var8 != null) {
            if ((var8.field7761 & 2) == 0) {
                int var9 = super.field6438 * arg0;
                int var10 = super.field6438 + var9;
                int var11 = super.field6438 * arg1;
                int var12 = super.field6438 + var11;
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
                if ((var8.field7761 & 1) != 0 && !arg2) {
                    int var17 = this.field3397[arg0][arg1];
                    if (this.field3386 == -1) {
                        int var18 = this.field3404 * var17;
                        var19 = (this.field3385 * var11 + this.field3394 * var9 + var18 >> 15) + this.field3389;
                        if (var19 <= this.field3405.field3904) {
                            return;
                        }
                        var20 = (this.field3385 * var11 + this.field3394 * var10 + var18 >> 15) + this.field3389;
                        if (var20 <= this.field3405.field3904) {
                            return;
                        }
                        var21 = (this.field3385 * var12 + this.field3394 * var10 + var18 >> 15) + this.field3389;
                        if (var21 <= this.field3405.field3904) {
                            return;
                        }
                        var22 = (this.field3385 * var12 + this.field3394 * var9 + var18 >> 15) + this.field3389;
                        if (var22 <= this.field3405.field3904) {
                            return;
                        }
                    } else {
                        var22 = this.field3386;
                        var21 = this.field3386;
                        var20 = this.field3386;
                        var19 = this.field3386;
                    }
                    if (this.field3405.field3883) {
                        int var23 = var19 - this.field3405.field3902;
                        if (var23 > 0) {
                            var13 = var23;
                            if (var23 > 255) {
                                var13 = 255;
                            }
                        }
                        int var24 = var20 - this.field3405.field3902;
                        if (var24 > 0) {
                            var14 = var24;
                            if (var24 > 255) {
                                var14 = 255;
                            }
                        }
                        int var25 = var21 - this.field3405.field3902;
                        if (var25 > 0) {
                            var15 = var25;
                            if (var25 > 255) {
                                var15 = 255;
                            }
                        }
                        int var26 = var22 - this.field3405.field3902;
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    int var27 = this.field3402 * var17;
                    int var28 = this.field3391 * var17;
                    var29 = (this.field3395 * var11 + this.field3388 * var9 + var27 >> 15) + this.field3392;
                    var30 = this.field3405.field3872 * var29 / var19 + arg3.field6212;
                    var31 = (this.field3406 * var11 + this.field3399 * var9 + var28 >> 15) + this.field3403;
                    var32 = this.field3405.field3906 * var31 / var19 + arg3.field6211;
                    var33 = (this.field3395 * var11 + this.field3388 * var10 + var27 >> 15) + this.field3392;
                    var34 = this.field3405.field3872 * var33 / var20 + arg3.field6212;
                    var35 = (this.field3406 * var11 + this.field3399 * var10 + var28 >> 15) + this.field3403;
                    var36 = this.field3405.field3906 * var35 / var20 + arg3.field6211;
                    var37 = (this.field3395 * var12 + this.field3388 * var10 + var27 >> 15) + this.field3392;
                    var38 = this.field3405.field3872 * var37 / var21 + arg3.field6212;
                    var39 = (this.field3406 * var12 + this.field3399 * var10 + var28 >> 15) + this.field3403;
                    var40 = this.field3405.field3906 * var39 / var21 + arg3.field6211;
                    var41 = (this.field3395 * var12 + this.field3388 * var9 + var27 >> 15) + this.field3392;
                    var42 = this.field3405.field3872 * var41 / var22 + arg3.field6212;
                    var43 = (this.field3406 * var12 + this.field3399 * var9 + var28 >> 15) + this.field3403;
                    var44 = this.field3405.field3906 * var43 / var22 + arg3.field6211;
                } else {
                    int var45 = this.field3397[arg0][arg1];
                    int var46 = this.field3397[arg0 + 1][arg1];
                    int var47 = this.field3397[arg0 + 1][arg1 + 1];
                    int var48 = this.field3397[arg0][arg1 + 1];
                    if (this.field3386 == -1) {
                        var19 = (this.field3385 * var11 + this.field3404 * var45 + this.field3394 * var9 >> 15) + this.field3389;
                        if (var19 <= this.field3405.field3904) {
                            return;
                        }
                        var20 = (this.field3385 * var11 + this.field3404 * var46 + this.field3394 * var10 >> 15) + this.field3389;
                        if (var20 <= this.field3405.field3904) {
                            return;
                        }
                        var21 = (this.field3385 * var12 + this.field3404 * var47 + this.field3394 * var10 >> 15) + this.field3389;
                        if (var21 <= this.field3405.field3904) {
                            return;
                        }
                        var22 = (this.field3385 * var12 + this.field3404 * var48 + this.field3394 * var9 >> 15) + this.field3389;
                        if (var22 <= this.field3405.field3904) {
                            return;
                        }
                    } else {
                        var22 = this.field3386;
                        var21 = this.field3386;
                        var20 = this.field3386;
                        var19 = this.field3386;
                    }
                    if (arg2) {
                        int var49 = var19 - this.field3405.field3902;
                        if (var49 > 255) {
                            var49 = 255;
                        }
                        if (var49 > 0) {
                            var13 = var49;
                            int var50 = var8.field7765 * var49 / 255;
                            if (var50 > 0) {
                                var45 -= var50;
                            }
                        }
                        int var51 = var20 - this.field3405.field3902;
                        if (var51 > 255) {
                            var51 = 255;
                        }
                        if (var51 > 0) {
                            var14 = var51;
                            int var52 = var8.field7758 * var51 / 255;
                            if (var52 > 0) {
                                var46 -= var52;
                            }
                        }
                        int var53 = var21 - this.field3405.field3902;
                        if (var53 > 255) {
                            var53 = 255;
                        }
                        if (var53 > 0) {
                            var15 = var53;
                            int var54 = var8.field7766 * var53 / 255;
                            if (var54 > 0) {
                                var47 -= var54;
                            }
                        }
                        int var55 = var22 - this.field3405.field3902;
                        if (var55 > 255) {
                            var55 = 255;
                        }
                        if (var55 > 0) {
                            var16 = var55;
                            int var56 = var8.field7760 * var55 / 255;
                            if (var56 > 0) {
                                var48 -= var56;
                            }
                        }
                    } else if (this.field3405.field3883) {
                        int var57 = var19 - this.field3405.field3902;
                        if (var57 > 0) {
                            var13 = var57;
                            if (var57 > 255) {
                                var13 = 255;
                            }
                        }
                        int var58 = var20 - this.field3405.field3902;
                        if (var58 > 0) {
                            var14 = var58;
                            if (var58 > 255) {
                                var14 = 255;
                            }
                        }
                        int var59 = var21 - this.field3405.field3902;
                        if (var59 > 0) {
                            var15 = var59;
                            if (var59 > 255) {
                                var15 = 255;
                            }
                        }
                        int var60 = var22 - this.field3405.field3902;
                        if (var60 > 0) {
                            var16 = var60;
                            if (var60 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    var29 = (this.field3395 * var11 + this.field3402 * var45 + this.field3388 * var9 >> 15) + this.field3392;
                    var30 = this.field3405.field3872 * var29 / var19 + arg3.field6212;
                    var31 = (this.field3406 * var11 + this.field3399 * var9 + this.field3391 * var45 >> 15) + this.field3403;
                    var32 = this.field3405.field3906 * var31 / var19 + arg3.field6211;
                    var33 = (this.field3395 * var11 + this.field3402 * var46 + this.field3388 * var10 >> 15) + this.field3392;
                    var34 = this.field3405.field3872 * var33 / var20 + arg3.field6212;
                    var35 = (this.field3406 * var11 + this.field3399 * var10 + this.field3391 * var46 >> 15) + this.field3403;
                    var36 = this.field3405.field3906 * var35 / var20 + arg3.field6211;
                    var37 = (this.field3395 * var12 + this.field3402 * var47 + this.field3388 * var10 >> 15) + this.field3392;
                    var38 = this.field3405.field3872 * var37 / var21 + arg3.field6212;
                    var39 = (this.field3406 * var12 + this.field3399 * var10 + this.field3391 * var47 >> 15) + this.field3403;
                    var40 = this.field3405.field3906 * var39 / var21 + arg3.field6211;
                    var41 = (this.field3395 * var12 + this.field3402 * var48 + this.field3388 * var9 >> 15) + this.field3392;
                    var42 = this.field3405.field3872 * var41 / var22 + arg3.field6212;
                    var43 = (this.field3406 * var12 + this.field3399 * var9 + this.field3391 * var48 >> 15) + this.field3403;
                    var44 = this.field3405.field3906 * var43 / var22 + arg3.field6211;
                }
                boolean var61 = var8.field7763 != -1 && this.method1481(this.field3405.field1695.method432(var8.field7763, true).field1540);
                int var62 = var14 + var15 + var16;
                if ((var36 - var44) * (var38 - var42) - (var34 - var42) * (var40 - var44) > 0) {
                    arg3.field6210 = var38 < 0 || var42 < 0 || var34 < 0 || var38 > arg3.field6215 || var42 > arg3.field6215 || var34 > arg3.field6215;
                    if (var62 < 765) {
                        if (var61) {
                            arg3.field6219 = 100;
                        }
                        if (var62 > 0) {
                            if (var8.field7763 >= 0) {
                                arg3.method2496(var40, var44, var36, var38, var42, var34, this.field3405.field3890, var15, var16, var14, var8.field7762, var8.field7757, var8.field7759, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field7763);
                            } else {
                                arg3.method2497(var40, var44, var36, var38, var42, var34, class369.method2248(var8.field7762, var15 << 24 | this.field3405.field3890, 65280), class369.method2248(var8.field7757, var16 << 24 | this.field3405.field3890, 65280), class369.method2248(var8.field7759, var14 << 24 | this.field3405.field3890, 65280));
                            }
                        } else if (var8.field7763 >= 0) {
                            arg3.method2500(var40, var44, var36, var38, var42, var34, var8.field7762, var8.field7757, var8.field7759, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field7763);
                        } else {
                            arg3.method2497(var40, var44, var36, var38, var42, var34, var8.field7762, var8.field7757, var8.field7759);
                        }
                        arg3.field6219 = 0;
                    } else {
                        arg3.method2491(var40, var44, var36, var38, var42, var34, this.field3405.field3890);
                    }
                }
                int var63 = var13 + var14 + var16;
                if ((var30 - var34) * (var44 - var36) - (var32 - var36) * (var42 - var34) > 0) {
                    arg3.field6210 = var30 < 0 || var34 < 0 || var42 < 0 || var30 > arg3.field6215 || var34 > arg3.field6215 || var42 > arg3.field6215;
                    if (var63 < 765) {
                        if (var61) {
                            arg3.field6219 = 100;
                        }
                        if (var63 > 0) {
                            if (var8.field7763 >= 0) {
                                arg3.method2496(var32, var36, var44, var30, var34, var42, this.field3405.field3890, var13, var14, var16, var8.field7764, var8.field7759, var8.field7757, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field7763);
                            } else {
                                arg3.method2497(var32, var36, var44, var30, var34, var42, class369.method2248(var8.field7764, var13 << 24 | this.field3405.field3890, 65280), class369.method2248(var8.field7759, var14 << 24 | this.field3405.field3890, 65280), class369.method2248(var8.field7757, var16 << 24 | this.field3405.field3890, 65280));
                            }
                        } else if (var8.field7763 >= 0) {
                            arg3.method2500(var32, var36, var44, var30, var34, var42, var8.field7764, var8.field7759, var8.field7757, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field7763);
                        } else {
                            arg3.method2497(var32, var36, var44, var30, var34, var42, var8.field7764, var8.field7759, var8.field7757);
                        }
                        arg3.field6219 = 0;
                        return;
                    }
                    arg3.method2491(var32, var36, var44, var30, var34, var42, this.field3405.field3890);
                }
            }
        } else {
            class88 var64 = this.field3390[arg0][arg1];
            if (var64 != null) {
                if (this.field3386 == -1) {
                    for (int var65 = 0; var65 < var64.field1204; ++var65) {
                        int var66 = (arg0 << super.field6441) + var64.field1205[var65];
                        int var67 = var64.field1203[var65];
                        int var68 = (arg1 << super.field6441) + var64.field1211[var65];
                        int var69 = (this.field3385 * var68 + this.field3404 * var67 + this.field3394 * var66 >> 15) + this.field3389;
                        if (var69 <= this.field3405.field3904) {
                            return;
                        }
                        arg6[var65] = 0;
                        if (arg2) {
                            int var70 = var69 - this.field3405.field3902;
                            if (var70 > 255) {
                                var70 = 255;
                            }
                            if (var70 > 0) {
                                arg6[var65] = var70;
                                int var71 = var64.field1202[var65] * var70 / 255;
                                if (var71 > 0) {
                                    var67 -= var71;
                                }
                            }
                        } else if (this.field3405.field3883) {
                            int var72 = var69 - this.field3405.field3902;
                            if (var72 > 0) {
                                arg6[var65] = var72;
                                if (arg6[var65] > 255) {
                                    arg6[var65] = 255;
                                }
                            }
                        }
                        int var73 = (this.field3395 * var68 + this.field3402 * var67 + this.field3388 * var66 >> 15) + this.field3392;
                        int var74 = (this.field3406 * var68 + this.field3399 * var66 + this.field3391 * var67 >> 15) + this.field3403;
                        arg4[var65] = this.field3405.field3872 * var73 / var69 + arg3.field6212;
                        arg5[var65] = this.field3405.field3906 * var74 / var69 + arg3.field6211;
                    }
                } else {
                    for (int var75 = 0; var75 < var64.field1204; ++var75) {
                        int var115 = (arg0 << super.field6441) + var64.field1205[var75];
                        int var116 = var64.field1203[var75];
                        int var117 = (arg1 << super.field6441) + var64.field1211[var75];
                        arg6[var75] = 0;
                        if (arg2) {
                            int var118 = this.field3386 - this.field3405.field3902;
                            if (var118 > 255) {
                                var118 = 255;
                            }
                            if (var118 > 0) {
                                arg6[var75] = var118;
                                int var119 = var64.field1202[var75] * var118 / 255;
                                if (var119 > 0) {
                                    var116 -= var119;
                                }
                            }
                        } else if (this.field3405.field3883) {
                            int var120 = this.field3386 - this.field3405.field3902;
                            if (var120 > 0) {
                                arg6[var75] = var120;
                                if (arg6[var75] > 255) {
                                    arg6[var75] = 255;
                                }
                            }
                        }
                        int var121 = (this.field3395 * var117 + this.field3402 * var116 + this.field3388 * var115 >> 15) + this.field3392;
                        int var122 = (this.field3406 * var117 + this.field3399 * var115 + this.field3391 * var116 >> 15) + this.field3403;
                        arg4[var75] = this.field3405.field3872 * var121 / this.field3386 + arg3.field6212;
                        arg5[var75] = this.field3405.field3906 * var122 / this.field3386 + arg3.field6211;
                    }
                }
                if (var64.field1209 != null) {
                    int var76 = this.field3397[arg0][arg1];
                    int var77 = this.field3397[arg0 + 1][arg1];
                    int var78 = this.field3397[arg0][arg1 + 1];
                    int var79 = super.field6438 * arg0;
                    int var80 = super.field6438 + var79;
                    int var81 = super.field6438 * arg1;
                    int var82 = super.field6438 + var81;
                    int var83 = (this.field3395 * var81 + this.field3402 * var76 + this.field3388 * var79 >> 15) + this.field3392;
                    int var84 = (this.field3406 * var81 + this.field3399 * var79 + this.field3391 * var76 >> 15) + this.field3403;
                    int var85 = (this.field3385 * var81 + this.field3404 * var76 + this.field3394 * var79 >> 15) + this.field3389;
                    int var86 = (this.field3395 * var81 + this.field3402 * var77 + this.field3388 * var80 >> 15) + this.field3392;
                    int var87 = (this.field3406 * var81 + this.field3399 * var80 + this.field3391 * var77 >> 15) + this.field3403;
                    int var88 = (this.field3385 * var81 + this.field3404 * var77 + this.field3394 * var80 >> 15) + this.field3389;
                    int var89 = (this.field3395 * var82 + this.field3402 * var78 + this.field3388 * var79 >> 15) + this.field3392;
                    int var90 = (this.field3406 * var82 + this.field3399 * var79 + this.field3391 * var78 >> 15) + this.field3403;
                    int var91 = (this.field3385 * var82 + this.field3404 * var78 + this.field3394 * var79 >> 15) + this.field3389;
                    for (int var92 = 0; var92 < var64.field1210; ++var92) {
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
                            arg3.field6210 = var96 < 0 || var97 < 0 || var98 < 0 || var96 > arg3.field6215 || var97 > arg3.field6215 || var98 > arg3.field6215;
                            short var103 = var64.field1209[var92];
                            if (var102 < 765) {
                                if (var103 != -1 && this.method1481(this.field3405.field1695.method432(var103, true).field1540)) {
                                    arg3.field6219 = 100;
                                }
                                if (var102 > 0) {
                                    if (var103 != -1) {
                                        arg3.method2496(var99, var100, var101, var96, var97, var98, this.field3405.field3890, arg6[var93], arg6[var94], arg6[var95], var64.field1208[var93], var64.field1208[var94], var64.field1208[var95], var83, var86, var89, var84, var87, var90, var85, var88, var91, var103);
                                    } else if ((var64.field1208[var93] & 16777215) != 0) {
                                        arg3.method2497(var99, var100, var101, var96, var97, var98, class369.method2248(var64.field1208[var93], arg6[var93] << 24 | this.field3405.field3890, 65280), class369.method2248(var64.field1208[var94], arg6[var94] << 24 | this.field3405.field3890, 65280), class369.method2248(var64.field1208[var95], arg6[var95] << 24 | this.field3405.field3890, 65280));
                                    }
                                } else if (var103 != -1) {
                                    arg3.method2500(var99, var100, var101, var96, var97, var98, var64.field1208[var93], var64.field1208[var94], var64.field1208[var95], var83, var86, var89, var84, var87, var90, var85, var88, var91, var103);
                                } else if ((var64.field1208[var93] & 16777215) != 0) {
                                    arg3.method2497(var99, var100, var101, var96, var97, var98, var64.field1208[var93], var64.field1208[var94], var64.field1208[var95]);
                                }
                                arg3.field6219 = 0;
                            } else {
                                arg3.method2491(var99, var100, var101, var96, var97, var98, this.field3405.field3890);
                            }
                        }
                    }
                    return;
                }
                for (int var104 = 0; var104 < var64.field1210; ++var104) {
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
                        arg3.field6210 = var108 < 0 || var109 < 0 || var110 < 0 || var108 > arg3.field6215 || var109 > arg3.field6215 || var110 > arg3.field6215;
                        if (var114 < 765) {
                            if (var114 > 0) {
                                if ((var64.field1208[var105] & 16777215) != 0) {
                                    arg3.method2497(var111, var112, var113, var108, var109, var110, class242.method1498(17289, arg6[var105], var64.field1208[var105], this.field3405.field3890), class242.method1498(17289, arg6[var106], var64.field1208[var106], this.field3405.field3890), class242.method1498(17289, arg6[var107], var64.field1208[var107], this.field3405.field3890));
                                }
                            } else if ((var64.field1208[var105] & 16777215) != 0) {
                                arg3.method2497(var111, var112, var113, var108, var109, var110, var64.field1208[var105], var64.field1208[var106], var64.field1208[var107]);
                            }
                        } else {
                            arg3.method2491(var111, var112, var113, var108, var109, var110, this.field3405.field3890);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIIIIII[[Z)V", line = 1147)
    public final void method852(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        class207 var9 = this.field3405.method1671(Thread.currentThread());
        class421 var10 = var9.field2871;
        var10.field6219 = 0;
        var10.field6210 = false;
        if (this.field3393 != null) {
            this.method1477(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field2912, var9.field2920);
        } else {
            if (this.field3398 != null) {
                this.method1480(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field2912, var9.field2920);
            }
        }
    }

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "(Lss;IIIIZ)Z", line = 1164)
    public final boolean method858(class283 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIIIIII[[ZLof;[I[I)V", line = 1170)
    private final void method1477(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class421 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field6221 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field3393[var16][var17] != null) {
                        class512 var18 = this.field3393[var16][var17];
                        if (var18.field7763 != -1 && (var18.field7761 & 2) == 0 && var18.field7767 == 0) {
                            int var19 = this.field3405.method1667(var18.field7763);
                            arg8.method2490(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class158.method1010(var19, (byte) -114, var18.field7762), class158.method1010(var19, (byte) -126, var18.field7757), class158.method1010(var19, (byte) -105, var18.field7759));
                            arg8.method2490(var15, var15, var15 - var13, var14, var13 + var14, var14, class158.method1010(var19, (byte) -118, var18.field7764), class158.method1010(var19, (byte) -98, var18.field7759), class158.method1010(var19, (byte) -102, var18.field7757));
                        } else if (var18.field7767 == 0) {
                            arg8.method2497(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field7762, var18.field7757, var18.field7759);
                            arg8.method2497(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field7764, var18.field7759, var18.field7757);
                        } else {
                            int var20 = var18.field7767;
                            arg8.method2497(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class369.method2248(var20, var18.field7762 & -16777216, 65280), class369.method2248(var20, var18.field7757 & -16777216, 65280), class369.method2248(var20, var18.field7759 & -16777216, 65280));
                            arg8.method2497(var15, var15, var15 - var13, var14, var13 + var14, var14, class369.method2248(var20, var18.field7764 & -16777216, 65280), class369.method2248(var20, var18.field7759 & -16777216, 65280), class369.method2248(var20, var18.field7757 & -16777216, 65280));
                        }
                    } else if (this.field3390[var16][var17] != null) {
                        class88 var21 = this.field3390[var16][var17];
                        for (int var22 = 0; var22 < var21.field1204; ++var22) {
                            arg9[var22] = var21.field1205[var22] * var13 / super.field6438 + var14;
                            arg10[var22] = var15 - var21.field1211[var22] * var13 / super.field6438;
                        }
                        for (int var23 = 0; var23 < var21.field1210; ++var23) {
                            int var24 = var23 * 3;
                            int var25 = var24 + 1;
                            int var26 = var25 + 1;
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field1206 == null || var21.field1206[var23] == 0 || var21.field1209 != null && (var21.field1209 == null || var21.field1209[var23] != -1)) {
                                if (var21.field1209 != null && var21.field1209[var23] != -1) {
                                    int var34 = this.field3405.method1667(var21.field1209[var23]);
                                    arg8.method2490(var30, var31, var32, var27, var28, var29, var34, var34, var34);
                                } else {
                                    arg8.method2497(var30, var31, var32, var27, var28, var29, var21.field1208[var24], var21.field1208[var25], var21.field1208[var26]);
                                }
                            } else {
                                int var33 = var21.field1206[var23];
                                arg8.method2497(var30, var31, var32, var27, var28, var29, class369.method2248(var33, -16777216 - (var21.field1208[var24] & -16777216), 65280), class369.method2248(var33, -16777216 - (var21.field1208[var25] & -16777216), 65280), class369.method2248(var33, -16777216 - (var21.field1208[var26] & -16777216), 65280));
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field6221 = true;
    }

    @OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(Llg;IIII[[I[[II)V", line = 2127)
    public class240(class273 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field3405 = arg0;
        this.field3387 = arg2;
        this.field3397 = arg5;
        this.field3401 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field3405.field3879 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
                int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + arg7 * 512 + var13 * var13));
                int var16 = (var13 << 8) / var15;
                int var17 = arg7 * -512 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field3405.field3869 * var18 + this.field3405.field3895 * var17 + this.field3405.field3881 * var16 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field3401[var11][var10] = (byte) var20;
            }
        }
        this.field3396 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(IILof;[I[I[I)V", line = 1303)
    private final void method1478(int arg0, int arg1, class421 arg2, int[] arg3, int[] arg4, int[] arg5) {
        class320 var7 = this.field3398[arg0][arg1];
        if (var7 != null) {
            if ((var7.field4697 & 2) == 0) {
                int var8 = super.field6438 * arg0;
                int var9 = super.field6438 + var8;
                int var10 = super.field6438 * arg1;
                int var11 = super.field6438 + var10;
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
                if ((var7.field4697 & 1) != 0) {
                    int var12 = this.field3397[arg0][arg1];
                    int var16;
                    if (this.field3386 == -1) {
                        int var13 = this.field3404 * var12;
                        var14 = (this.field3385 * var10 + this.field3394 * var8 + var13 >> 15) + this.field3389;
                        if (var14 <= this.field3405.field3904) {
                            return;
                        }
                        var15 = (this.field3385 * var10 + this.field3394 * var9 + var13 >> 15) + this.field3389;
                        if (var15 <= this.field3405.field3904) {
                            return;
                        }
                        var16 = (this.field3385 * var11 + this.field3394 * var9 + var13 >> 15) + this.field3389;
                        if (var16 <= this.field3405.field3904) {
                            return;
                        }
                        var17 = (this.field3385 * var11 + this.field3394 * var8 + var13 >> 15) + this.field3389;
                        if (var17 <= this.field3405.field3904) {
                            return;
                        }
                    } else {
                        var17 = this.field3386;
                        var16 = this.field3386;
                        var15 = this.field3386;
                        var14 = this.field3386;
                    }
                    int var18 = this.field3402 * var12;
                    int var19 = this.field3391 * var12;
                    var20 = (this.field3395 * var10 + this.field3388 * var8 + var18 >> 15) + this.field3392;
                    var21 = this.field3405.field3872 * var20 / var14 + arg2.field6212;
                    var22 = (this.field3406 * var10 + this.field3399 * var8 + var19 >> 15) + this.field3403;
                    var23 = this.field3405.field3906 * var22 / var14 + arg2.field6211;
                    var24 = (this.field3395 * var10 + this.field3388 * var9 + var18 >> 15) + this.field3392;
                    var25 = this.field3405.field3872 * var24 / var15 + arg2.field6212;
                    var26 = (this.field3406 * var10 + this.field3399 * var9 + var19 >> 15) + this.field3403;
                    var27 = this.field3405.field3906 * var26 / var15 + arg2.field6211;
                    int var28 = (this.field3395 * var11 + this.field3388 * var9 + var18 >> 15) + this.field3392;
                    var29 = this.field3405.field3872 * var28 / var16 + arg2.field6212;
                    int var30 = (this.field3406 * var11 + this.field3399 * var9 + var19 >> 15) + this.field3403;
                    var31 = this.field3405.field3906 * var30 / var16 + arg2.field6211;
                    var32 = (this.field3395 * var11 + this.field3388 * var8 + var18 >> 15) + this.field3392;
                    var33 = this.field3405.field3872 * var32 / var17 + arg2.field6212;
                    var34 = (this.field3406 * var11 + this.field3399 * var8 + var19 >> 15) + this.field3403;
                    var35 = this.field3405.field3906 * var34 / var17 + arg2.field6211;
                } else {
                    int var36 = this.field3397[arg0][arg1];
                    int var37 = this.field3397[arg0 + 1][arg1];
                    int var38 = this.field3397[arg0 + 1][arg1 + 1];
                    int var39 = this.field3397[arg0][arg1 + 1];
                    int var40;
                    if (this.field3386 == -1) {
                        var14 = (this.field3385 * var10 + this.field3404 * var36 + this.field3394 * var8 >> 15) + this.field3389;
                        if (var14 <= this.field3405.field3904) {
                            return;
                        }
                        var15 = (this.field3385 * var10 + this.field3404 * var37 + this.field3394 * var9 >> 15) + this.field3389;
                        if (var15 <= this.field3405.field3904) {
                            return;
                        }
                        var40 = (this.field3385 * var11 + this.field3404 * var38 + this.field3394 * var9 >> 15) + this.field3389;
                        if (var40 <= this.field3405.field3904) {
                            return;
                        }
                        var17 = (this.field3385 * var11 + this.field3404 * var39 + this.field3394 * var8 >> 15) + this.field3389;
                        if (var17 <= this.field3405.field3904) {
                            return;
                        }
                    } else {
                        var17 = this.field3386;
                        var40 = this.field3386;
                        var15 = this.field3386;
                        var14 = this.field3386;
                    }
                    var20 = (this.field3395 * var10 + this.field3402 * var36 + this.field3388 * var8 >> 15) + this.field3392;
                    var21 = this.field3405.field3872 * var20 / var14 + arg2.field6212;
                    var22 = (this.field3406 * var10 + this.field3399 * var8 + this.field3391 * var36 >> 15) + this.field3403;
                    var23 = this.field3405.field3906 * var22 / var14 + arg2.field6211;
                    var24 = (this.field3395 * var10 + this.field3402 * var37 + this.field3388 * var9 >> 15) + this.field3392;
                    var25 = this.field3405.field3872 * var24 / var15 + arg2.field6212;
                    var26 = (this.field3406 * var10 + this.field3399 * var9 + this.field3391 * var37 >> 15) + this.field3403;
                    var27 = this.field3405.field3906 * var26 / var15 + arg2.field6211;
                    int var41 = (this.field3395 * var11 + this.field3402 * var38 + this.field3388 * var9 >> 15) + this.field3392;
                    var29 = this.field3405.field3872 * var41 / var40 + arg2.field6212;
                    int var42 = (this.field3406 * var11 + this.field3399 * var9 + this.field3391 * var38 >> 15) + this.field3403;
                    var31 = this.field3405.field3906 * var42 / var40 + arg2.field6211;
                    var32 = (this.field3395 * var11 + this.field3402 * var39 + this.field3388 * var8 >> 15) + this.field3392;
                    var33 = this.field3405.field3872 * var32 / var17 + arg2.field6212;
                    var34 = (this.field3406 * var11 + this.field3399 * var8 + this.field3391 * var39 >> 15) + this.field3403;
                    var35 = this.field3405.field3906 * var34 / var17 + arg2.field6211;
                }
                if ((var27 - var35) * (var29 - var33) - (var25 - var33) * (var31 - var35) > 0) {
                    arg2.field6210 = var29 < 0 || var33 < 0 || var25 < 0 || var29 > arg2.field6215 || var33 > arg2.field6215 || var25 > arg2.field6215;
                    if (var7.field4699 >= 0) {
                        if (this.method1481(this.field3405.field1695.method432(var7.field4699, true).field1540)) {
                            arg2.field6219 = 100;
                        }
                        arg2.method2500(var31, var35, var27, var29, var33, var25, var7.field4695 & 65535, var7.field4693 & 65535, var7.field4696 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field4699);
                        arg2.field6219 = 0;
                    } else {
                        arg2.method2490(var31, var35, var27, var29, var33, var25, var7.field4695 & 65535, var7.field4693 & 65535, var7.field4696 & 65535);
                    }
                }
                if ((var21 - var25) * (var35 - var27) - (var23 - var27) * (var33 - var25) > 0) {
                    arg2.field6210 = var21 < 0 || var25 < 0 || var33 < 0 || var21 > arg2.field6215 || var25 > arg2.field6215 || var33 > arg2.field6215;
                    if (var7.field4699 >= 0) {
                        if (this.method1481(this.field3405.field1695.method432(var7.field4699, true).field1540)) {
                            arg2.field6219 = 100;
                        }
                        arg2.method2500(var23, var27, var35, var21, var25, var33, var7.field4698 & 65535, var7.field4696 & 65535, var7.field4693 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field4699);
                        arg2.field6219 = 0;
                        return;
                    }
                    arg2.method2490(var23, var27, var35, var21, var25, var33, var7.field4698 & 65535, var7.field4696 & 65535, var7.field4693 & 65535);
                }
            }
        } else {
            class243 var43 = this.field3400[arg0][arg1];
            if (var43 != null) {
                if (this.field3386 == -1) {
                    for (int var44 = 0; var44 < var43.field3507; ++var44) {
                        int var45 = (arg0 << super.field6441) + var43.field3506[var44];
                        short var46 = var43.field3498[var44];
                        int var47 = (arg1 << super.field6441) + var43.field3501[var44];
                        int var48 = (this.field3385 * var47 + this.field3404 * var46 + this.field3394 * var45 >> 15) + this.field3389;
                        if (var48 <= this.field3405.field3904) {
                            return;
                        }
                        int var49 = (this.field3395 * var47 + this.field3402 * var46 + this.field3388 * var45 >> 15) + this.field3392;
                        int var50 = (this.field3406 * var47 + this.field3399 * var45 + this.field3391 * var46 >> 15) + this.field3403;
                        arg3[var44] = this.field3405.field3872 * var49 / var48 + arg2.field6212;
                        arg4[var44] = this.field3405.field3906 * var50 / var48 + arg2.field6211;
                    }
                } else {
                    for (int var51 = 0; var51 < var43.field3507; ++var51) {
                        int var91 = (arg0 << super.field6441) + var43.field3506[var51];
                        short var92 = var43.field3498[var51];
                        int var93 = (arg1 << super.field6441) + var43.field3501[var51];
                        int var94 = (this.field3395 * var93 + this.field3402 * var92 + this.field3388 * var91 >> 15) + this.field3392;
                        int var95 = (this.field3406 * var93 + this.field3399 * var91 + this.field3391 * var92 >> 15) + this.field3403;
                        arg3[var51] = this.field3405.field3872 * var94 / this.field3386 + arg2.field6212;
                        arg4[var51] = this.field3405.field3906 * var95 / this.field3386 + arg2.field6211;
                    }
                }
                if (var43.field3500 != null) {
                    int var52 = this.field3397[arg0][arg1];
                    int var53 = this.field3397[arg0 + 1][arg1];
                    int var54 = this.field3397[arg0][arg1 + 1];
                    int var55 = super.field6438 * arg0;
                    int var56 = super.field6438 + var55;
                    int var57 = super.field6438 * arg1;
                    int var58 = super.field6438 + var57;
                    int var59 = (this.field3395 * var57 + this.field3402 * var52 + this.field3388 * var55 >> 15) + this.field3392;
                    int var60 = (this.field3406 * var57 + this.field3399 * var55 + this.field3391 * var52 >> 15) + this.field3403;
                    int var61 = (this.field3385 * var57 + this.field3404 * var52 + this.field3394 * var55 >> 15) + this.field3389;
                    int var62 = (this.field3395 * var57 + this.field3402 * var53 + this.field3388 * var56 >> 15) + this.field3392;
                    int var63 = (this.field3406 * var57 + this.field3399 * var56 + this.field3391 * var53 >> 15) + this.field3403;
                    int var64 = (this.field3385 * var57 + this.field3404 * var53 + this.field3394 * var56 >> 15) + this.field3389;
                    int var65 = (this.field3395 * var58 + this.field3402 * var54 + this.field3388 * var55 >> 15) + this.field3392;
                    int var66 = (this.field3406 * var58 + this.field3399 * var55 + this.field3391 * var54 >> 15) + this.field3403;
                    int var67 = (this.field3385 * var58 + this.field3404 * var54 + this.field3394 * var55 >> 15) + this.field3389;
                    for (int var68 = 0; var68 < var43.field3497; ++var68) {
                        short var69 = var43.field3496[var68];
                        short var70 = var43.field3505[var68];
                        short var71 = var43.field3503[var68];
                        int var72 = arg3[var69];
                        int var73 = arg3[var70];
                        int var74 = arg3[var71];
                        int var75 = arg4[var69];
                        int var76 = arg4[var70];
                        int var77 = arg4[var71];
                        if ((var72 - var73) * (var77 - var76) - (var74 - var73) * (var75 - var76) > 0) {
                            arg2.field6210 = var72 < 0 || var73 < 0 || var74 < 0 || var72 > arg2.field6215 || var73 > arg2.field6215 || var74 > arg2.field6215;
                            short var78 = var43.field3500[var68];
                            if (var78 != -1) {
                                if (this.method1481(this.field3405.field1695.method432(var78, true).field1540)) {
                                    arg2.field6219 = 100;
                                }
                                arg2.method2500(var75, var76, var77, var72, var73, var74, var43.field3502[var69], var43.field3502[var70], var43.field3502[var71], var59, var62, var65, var60, var63, var66, var61, var64, var67, var78);
                                arg2.field6219 = 0;
                            } else {
                                int var79 = var43.field3499[var68];
                                if (var79 != -1) {
                                    arg2.method2490(var75, var76, var77, var72, var73, var74, class158.method1010(var79, (byte) -126, var43.field3502[var69]), class158.method1010(var79, (byte) -126, var43.field3502[var70]), class158.method1010(var79, (byte) -112, var43.field3502[var71]));
                                }
                            }
                        }
                    }
                    return;
                }
                for (int var80 = 0; var80 < var43.field3497; ++var80) {
                    short var81 = var43.field3496[var80];
                    short var82 = var43.field3505[var80];
                    short var83 = var43.field3503[var80];
                    int var84 = arg3[var81];
                    int var85 = arg3[var82];
                    int var86 = arg3[var83];
                    int var87 = arg4[var81];
                    int var88 = arg4[var82];
                    int var89 = arg4[var83];
                    if ((var84 - var85) * (var89 - var88) - (var86 - var85) * (var87 - var88) > 0) {
                        int var90 = var43.field3499[var80];
                        if (var90 != -1) {
                            arg2.field6210 = var84 < 0 || var85 < 0 || var86 < 0 || var84 > arg2.field6215 || var85 > arg2.field6215 || var86 > arg2.field6215;
                            arg2.method2490(var87, var88, var89, var84, var85, var86, class158.method1010(var90, (byte) -96, var43.field3502[var81]), class158.method1010(var90, (byte) -112, var43.field3502[var82]), class158.method1010(var90, (byte) -105, var43.field3502[var83]));
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(II)V", line = 1661)
    public final void method851(int arg0, int arg1) {
        class207 var3 = this.field3405.method1671(Thread.currentThread());
        var3.field2871.field6219 = 0;
        if (this.field3393 != null) {
            this.method1476(arg0, arg1, this.field3405.field3896, var3.field2871, var3.field2912, var3.field2920, var3.field2919);
        } else {
            if (this.field3398 != null) {
                this.method1478(arg0, arg1, var3.field2871, var3.field2912, var3.field2920, var3.field2919);
            }
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lss;IIIIZ)V", line = 1674)
    public final void method857(class283 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!wu", name = "d", descriptor = "(II)I", line = 1681)
    private static final int method1479(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(III)V", line = 1710)
    public final void method863(int arg0, int arg1, int arg2) {
        if (this.field3396[arg0][arg1] < arg2) {
            this.field3396[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "(II)I", line = 1717)
    public final int method855(int arg0, int arg1) {
        int var3 = arg0 >> super.field6441;
        int var4 = arg1 >> super.field6441;
        if (var3 >= 0 && var4 >= 0 && var3 <= super.field6434 - 1 && var4 <= super.field6436 - 1) {
            int var5 = arg0 & super.field6438 - 1;
            int var6 = arg1 & super.field6438 - 1;
            int var7 = (super.field6438 - var5) * this.field3397[var3][var4] + this.field3397[var3 + 1][var4] * var5 >> super.field6441;
            int var8 = (super.field6438 - var5) * this.field3397[var3][var4 + 1] + this.field3397[var3 + 1][var4 + 1] * var5 >> super.field6441;
            return (super.field6438 - var6) * var7 + var6 * var8 >> super.field6441;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(III[[ZZ)V", line = 1735)
    public final void method859(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        class279 var6 = this.field3405.field3907;
        this.field3386 = -1;
        this.field3388 = var6.field3971;
        this.field3402 = var6.field3978;
        this.field3395 = var6.field3977;
        this.field3392 = var6.field3972;
        this.field3399 = var6.field3976;
        this.field3391 = var6.field3970;
        this.field3406 = var6.field3968;
        this.field3403 = var6.field3969;
        this.field3394 = var6.field3975;
        this.field3404 = var6.field3967;
        this.field3385 = var6.field3973;
        this.field3389 = var6.field3974;
    }

    @OriginalMember(owner = "client!wu", name = "c", descriptor = "(Lss;IIIIZ)V", line = 1750)
    public final void method849(class283 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Ldq;[I)V", line = 1754)
    public final void method854(class472 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!wu", name = "c", descriptor = "(II)I", line = 1758)
    public final int method848(int arg0, int arg1) {
        return this.field3397[arg0][arg1];
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 1764)
    public final void method865(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        if (this.field3398 == null) {
            this.field3398 = new class320[super.field6434][super.field6436];
            this.field3400 = new class243[super.field6434][super.field6436];
        } else if (this.field3393 != null) {
            throw new IllegalStateException();
        }
        boolean var18 = false;
        if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
            var18 = true;
            for (int var19 = 1; var19 < 2; ++var19) {
                int var20 = arg2[arg6[var19]];
                int var21 = arg4[arg6[var19]];
                if (var20 != 0 && super.field6438 != var20 || var21 != 0 && super.field6438 != var21) {
                    var18 = false;
                    break;
                }
            }
        }
        if (!var18) {
            class243 var22 = new class243();
            short var23 = (short) arg2.length;
            short var24 = (short) arg9.length;
            var22.field3507 = var23;
            var22.field3502 = new short[var23];
            var22.field3506 = new short[var23];
            var22.field3498 = new short[var23];
            var22.field3501 = new short[var23];
            for (int var25 = 0; var25 < var23; ++var25) {
                int var30 = arg2[var25];
                int var31 = arg4[var25];
                if (var30 == 0 && var31 == 0) {
                    var22.field3502[var25] = (short) (this.field3401[arg0][arg1] - this.field3396[arg0][arg1]);
                } else if (var30 == 0 && super.field6438 == var31) {
                    var22.field3502[var25] = (short) (this.field3401[arg0][arg1 + 1] - this.field3396[arg0][arg1 + 1]);
                } else if (super.field6438 == var30 && super.field6438 == var31) {
                    var22.field3502[var25] = (short) (this.field3401[arg0 + 1][arg1 + 1] - this.field3396[arg0 + 1][arg1 + 1]);
                } else if (super.field6438 == var30 && var31 == 0) {
                    var22.field3502[var25] = (short) (this.field3401[arg0 + 1][arg1] - this.field3396[arg0 + 1][arg1]);
                } else {
                    int var32 = (this.field3401[arg0 + 1][arg1] - this.field3396[arg0 + 1][arg1]) * var30 + (this.field3401[arg0][arg1] - this.field3396[arg0][arg1]) * (super.field6438 - var30);
                    int var33 = (this.field3401[arg0 + 1][arg1 + 1] - this.field3396[arg0 + 1][arg1 + 1]) * var30 + (this.field3401[arg0][arg1 + 1] - this.field3396[arg0][arg1 + 1]) * (super.field6438 - var30);
                    var22.field3502[var25] = (short) ((super.field6438 - var31) * var32 + var31 * var33 >> super.field6441 * 2);
                }
                int var34 = (arg0 << super.field6441) + var30;
                int var35 = (arg1 << super.field6441) + var31;
                var22.field3506[var25] = (short) var30;
                var22.field3501[var25] = (short) var31;
                var22.field3498[var25] = (short) (this.method855(var34, var35) + (arg3 != null ? arg3[var25] : 0));
                if (var22.field3502[var25] < 2) {
                    var22.field3502[var25] = 2;
                }
            }
            boolean var26 = false;
            int var27 = 0;
            for (int var28 = 0; var28 < var24; ++var28) {
                if (arg9[var28] >= 0 || arg10 != null && arg10[var28] >= 0) {
                    ++var27;
                }
                if (arg11[var28] != -1 && !this.field3405.field1695.method432(arg11[var28], true).field1543) {
                    var26 = true;
                }
            }
            var22.field3499 = new int[var27];
            if (arg10 != null) {
                var22.field3504 = new int[var27];
            }
            var22.field3496 = new short[var27];
            var22.field3505 = new short[var27];
            var22.field3503 = new short[var27];
            if (var26) {
                var22.field3500 = new short[var27];
                var22.field3508 = new short[var27];
            }
            for (int var29 = 0; var29 < var24; ++var29) {
                if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
                    if (arg9[var29] >= 0) {
                        var22.field3499[var22.field3497] = class397.method2372(-1198994943, arg9[var29]);
                    } else {
                        var22.field3499[var22.field3497] = -1;
                    }
                    if (arg10 != null) {
                        if (arg10[var29] != -1) {
                            var22.field3504[var22.field3497] = class397.method2372(-1198994943, arg10[var29]);
                        } else {
                            var22.field3504[var22.field3497] = -1;
                        }
                    }
                    var22.field3496[var22.field3497] = (short) arg6[var29];
                    var22.field3505[var22.field3497] = (short) arg7[var29];
                    var22.field3503[var22.field3497] = (short) arg8[var29];
                    if (var26) {
                        if (arg11[var29] != -1 && !this.field3405.field1695.method432(arg11[var29], true).field1543) {
                            var22.field3500[var22.field3497] = (short) arg11[var29];
                            var22.field3508[var22.field3497] = (short) arg12[var29];
                        } else {
                            var22.field3500[var22.field3497] = -1;
                        }
                    }
                    ++var22.field3497;
                }
            }
            this.field3400[arg0][arg1] = var22;
        } else {
            if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
                class320 var36 = new class320();
                int var37 = arg9[0];
                int var38 = arg11[0];
                if (arg10 != null) {
                    var36.field4694 = class158.method1010(class397.method2372(-1198994943, arg10[0]), (byte) -103, this.field3401[arg0][arg1] - this.field3396[arg0][arg1]);
                    if (var37 == -1) {
                        var36.field4697 = (byte) (var36.field4697 | 2);
                    }
                }
                if (this.field3397[arg0 + 1][arg1] == this.field3397[arg0][arg1] && this.field3397[arg0 + 1][arg1 + 1] == this.field3397[arg0][arg1] && this.field3397[arg0][arg1 + 1] == this.field3397[arg0][arg1]) {
                    var36.field4697 = (byte) (var36.field4697 | 1);
                }
                if (var38 != -1 && (var36.field4697 & 2) == 0 && !this.field3405.field1695.method432(var38, true).field1543) {
                    var36.field4698 = (short) (this.field3401[arg0][arg1] - this.field3396[arg0][arg1]);
                    var36.field4696 = (short) (this.field3401[arg0 + 1][arg1] - this.field3396[arg0 + 1][arg1]);
                    var36.field4695 = (short) (this.field3401[arg0 + 1][arg1 + 1] - this.field3396[arg0 + 1][arg1 + 1]);
                    var36.field4693 = (short) (this.field3401[arg0][arg1 + 1] - this.field3396[arg0][arg1 + 1]);
                    var36.field4699 = (short) var38;
                } else {
                    short var39 = class397.method2372(-1198994943, var37);
                    var36.field4698 = (short) class158.method1010(var39, (byte) -98, this.field3401[arg0][arg1] - this.field3396[arg0][arg1]);
                    var36.field4696 = (short) class158.method1010(var39, (byte) -103, this.field3401[arg0 + 1][arg1] - this.field3396[arg0 + 1][arg1]);
                    var36.field4695 = (short) class158.method1010(var39, (byte) -120, this.field3401[arg0 + 1][arg1 + 1] - this.field3396[arg0 + 1][arg1 + 1]);
                    var36.field4693 = (short) class158.method1010(var39, (byte) -127, this.field3401[arg0][arg1 + 1] - this.field3396[arg0][arg1 + 1]);
                    var36.field4699 = -1;
                }
                this.field3398[arg0][arg1] = var36;
            }
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(IILss;)Lss;", line = 1993)
    public final class283 method860(int arg0, int arg1, class283 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "(IIIIIII[[ZLof;[I[I)V", line = 1997)
    private final void method1480(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class421 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field6221 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field3398[var16][var17] != null) {
                        class320 var18 = this.field3398[var16][var17];
                        if (var18.field4699 != -1 && (var18.field4697 & 2) == 0 && var18.field4694 == -1) {
                            int var19 = this.field3405.method1667(var18.field4699);
                            arg8.method2490(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class158.method1010(var19, (byte) -98, var18.field4695 & 65535), class158.method1010(var19, (byte) -114, var18.field4693 & 65535), class158.method1010(var19, (byte) -112, var18.field4696 & 65535));
                            arg8.method2490(var15, var15, var15 - var13, var14, var13 + var14, var14, class158.method1010(var19, (byte) -128, var18.field4698 & 65535), class158.method1010(var19, (byte) -105, var18.field4696 & 65535), class158.method1010(var19, (byte) -106, var18.field4693 & 65535));
                        } else if (var18.field4694 == -1) {
                            arg8.method2490(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field4695 & 65535, var18.field4693 & 65535, var18.field4696 & 65535);
                            arg8.method2490(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field4698 & 65535, var18.field4696 & 65535, var18.field4693 & 65535);
                        } else {
                            int var20 = var18.field4694;
                            arg8.method2490(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var20, var20, var20);
                            arg8.method2490(var15, var15, var15 - var13, var14, var13 + var14, var14, var20, var20, var20);
                        }
                    } else if (this.field3400[var16][var17] != null) {
                        class243 var21 = this.field3400[var16][var17];
                        for (int var22 = 0; var22 < var21.field3507; ++var22) {
                            arg9[var22] = var21.field3506[var22] * var13 / super.field6438 + var14;
                            arg10[var22] = var15 - var21.field3501[var22] * var13 / super.field6438;
                        }
                        for (int var23 = 0; var23 < var21.field3497; ++var23) {
                            short var24 = var21.field3496[var23];
                            short var25 = var21.field3505[var23];
                            short var26 = var21.field3503[var23];
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field3504 != null && var21.field3504[var23] != -1) {
                                int var33 = var21.field3504[var23];
                                arg8.method2490(var30, var31, var32, var27, var28, var29, class158.method1010(var33, (byte) -103, var21.field3502[var24]), class158.method1010(var33, (byte) -113, var21.field3502[var25]), class158.method1010(var33, (byte) -119, var21.field3502[var26]));
                            } else if (var21.field3500 != null && var21.field3500[var23] != -1) {
                                int var34 = this.field3405.method1667(var21.field3500[var23]);
                                arg8.method2490(var30, var31, var32, var27, var28, var29, class158.method1010(var34, (byte) -119, var21.field3502[var24]), class158.method1010(var34, (byte) -123, var21.field3502[var25]), class158.method1010(var34, (byte) -102, var21.field3502[var26]));
                            } else {
                                int var35 = var21.field3499[var23];
                                arg8.method2490(var30, var31, var32, var27, var28, var29, class158.method1010(var35, (byte) -104, var21.field3502[var24]), class158.method1010(var35, (byte) -114, var21.field3502[var25]), class158.method1010(var35, (byte) -103, var21.field3502[var26]));
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field6221 = true;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(I)Z", line = 2177)
    private final boolean method1481(int arg0) {
        if ((this.field3387 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else if (arg0 == 8) {
            return true;
        } else {
            return arg0 == 9;
        }
    }
}
