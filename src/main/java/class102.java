import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class102 extends class242 {

    @OriginalMember(owner = "client!op", name = "k", descriptor = "Lma;")
    private class8 field1391;

    @OriginalMember(owner = "client!op", name = "i", descriptor = "I")
    private int field1389;

    @OriginalMember(owner = "client!op", name = "y", descriptor = "[[I")
    public int[][] field1405;

    @OriginalMember(owner = "client!op", name = "x", descriptor = "[[I")
    private int[][] field1404;

    @OriginalMember(owner = "client!op", name = "v", descriptor = "I")
    private int field1402;

    @OriginalMember(owner = "client!op", name = "B", descriptor = "I")
    private int field1408;

    @OriginalMember(owner = "client!op", name = "E", descriptor = "[[B")
    private byte[][] field1411;

    @OriginalMember(owner = "client!op", name = "r", descriptor = "[[B")
    private byte[][] field1398;

    @OriginalMember(owner = "client!op", name = "j", descriptor = "I")
    private int field1390;

    @OriginalMember(owner = "client!op", name = "l", descriptor = "I")
    private int field1392;

    @OriginalMember(owner = "client!op", name = "m", descriptor = "I")
    private int field1393;

    @OriginalMember(owner = "client!op", name = "o", descriptor = "I")
    private int field1395;

    @OriginalMember(owner = "client!op", name = "p", descriptor = "I")
    private int field1396;

    @OriginalMember(owner = "client!op", name = "q", descriptor = "I")
    private int field1397;

    @OriginalMember(owner = "client!op", name = "s", descriptor = "I")
    private int field1399;

    @OriginalMember(owner = "client!op", name = "t", descriptor = "I")
    private int field1400;

    @OriginalMember(owner = "client!op", name = "u", descriptor = "I")
    private int field1401;

    @OriginalMember(owner = "client!op", name = "w", descriptor = "I")
    private int field1403;

    @OriginalMember(owner = "client!op", name = "z", descriptor = "I")
    private int field1406;

    @OriginalMember(owner = "client!op", name = "C", descriptor = "I")
    private int field1409;

    @OriginalMember(owner = "client!op", name = "n", descriptor = "[[Leh;")
    private class202[][] field1394;

    @OriginalMember(owner = "client!op", name = "A", descriptor = "[[Lur;")
    private class317[][] field1407;

    @OriginalMember(owner = "client!op", name = "F", descriptor = "[[Lor;")
    private class383[][] field1412;

    @OriginalMember(owner = "client!op", name = "D", descriptor = "[[Lqc;")
    private class444[][] field1410;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V")
    public final void method720(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9, int arg10, boolean arg11) {
        if (this.field1410 == null) {
            this.field1410 = new class444[super.field3434][super.field3433];
            this.field1412 = new class383[super.field3434][super.field3433];
        } else if (this.field1394 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var13 = 0; var13 < arg5.length; ++var13) {
                if (arg5[var13] == -1) {
                    arg5[var13] = 0;
                } else {
                    arg5[var13] = class15.field288[class194.method1257(23213, arg5[var13]) & 65535] << 8 | 255;
                }
            }
            if (arg6 != null) {
                for (int var14 = 0; var14 < arg6.length; ++var14) {
                    if (arg6[var14] == -1) {
                        arg6[var14] = 0;
                    } else {
                        arg6[var14] = class15.field288[class194.method1257(23213, arg6[var14]) & 65535] << 8 | 255;
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
                    } else if (arg2[var20] == this.field1402 && arg4[var20] == 0) {
                        if (var17 != -1 && arg5[var17] != arg5[var20]) {
                            var15 = false;
                            break;
                        }
                        var17 = var20;
                    } else if (arg2[var20] == this.field1402 && arg4[var20] == this.field1402) {
                        if (var18 != -1 && arg5[var18] != arg5[var20]) {
                            var15 = false;
                            break;
                        }
                        var18 = var20;
                    } else if (arg2[var20] == 0 && arg4[var20] == this.field1402) {
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
                            if (arg2[var22] != arg2[0] && arg2[0] + this.field1402 != arg2[var22] && arg2[0] - this.field1402 != arg2[var22]) {
                                var15 = false;
                                break;
                            }
                            if (arg4[var22] != arg4[0] && arg4[0] + this.field1402 != arg4[var22] && arg4[0] - this.field1402 != arg4[var22]) {
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
                class444 var23 = new class444();
                int var24 = arg5[0];
                int var25 = arg7[0];
                if (arg6 != null) {
                    var23.field6231 = arg6[0] >> 8;
                    if (var24 == 0) {
                        var23.field6232 = (byte) (var23.field6232 | 2);
                    }
                } else if (var24 == 0) {
                    return;
                }
                if (this.field1405[arg0 + 1][arg1] == this.field1405[arg0][arg1] && this.field1405[arg0 + 1][arg1 + 1] == this.field1405[arg0][arg1] && this.field1405[arg0][arg1 + 1] == this.field1405[arg0][arg1]) {
                    var23.field6232 = (byte) (var23.field6232 | 1);
                }
                if (var25 != -1 && (var23.field6232 & 2) == 0 && !this.field1391.field123.method469(var25, (byte) -58).field6481) {
                    var23.field6230 = this.field1411[arg0][arg1] - this.field1398[arg0][arg1];
                    var23.field6234 = this.field1411[arg0 + 1][arg1] - this.field1398[arg0 + 1][arg1];
                    var23.field6233 = this.field1411[arg0 + 1][arg1 + 1] - this.field1398[arg0 + 1][arg1 + 1];
                    var23.field6235 = this.field1411[arg0][arg1 + 1] - this.field1398[arg0][arg1 + 1];
                    var23.field6229 = (short) var25;
                } else {
                    int var26;
                    if (this.field1404 != null && arg10 != 0) {
                        var26 = this.field1404[arg0][arg1] * 255 / arg10;
                        if (var26 < 0) {
                            var26 = 0;
                        } else if (var26 > 255) {
                            var26 = 255;
                        }
                    } else {
                        var26 = 0;
                    }
                    var23.field6230 = class411.method2579(method734(arg5[var16] >> 8, this.field1411[arg0][arg1] - this.field1398[arg0][arg1]), var26, arg9, 255);
                    if (var23.field6231 != 0) {
                        var23.field6230 |= 255 - (this.field1411[arg0][arg1] - this.field1398[arg0][arg1]) << 25;
                    }
                    int var27;
                    if (this.field1404 != null && arg10 != 0) {
                        var27 = this.field1404[arg0 + 1][arg1] * 255 / arg10;
                        if (var27 < 0) {
                            var27 = 0;
                        } else if (var27 > 255) {
                            var27 = 255;
                        }
                    } else {
                        var27 = 0;
                    }
                    var23.field6234 = class411.method2579(method734(arg5[var17] >> 8, this.field1411[arg0 + 1][arg1] - this.field1398[arg0 + 1][arg1]), var27, arg9, 255);
                    if (var23.field6231 != 0) {
                        var23.field6234 |= 255 - (this.field1411[arg0 + 1][arg1] - this.field1398[arg0 + 1][arg1]) << 25;
                    }
                    int var28;
                    if (this.field1404 != null && arg10 != 0) {
                        var28 = this.field1404[arg0 + 1][arg1 + 1] * 255 / arg10;
                        if (var28 < 0) {
                            var28 = 0;
                        } else if (var28 > 255) {
                            var28 = 255;
                        }
                    } else {
                        var28 = 0;
                    }
                    var23.field6233 = class411.method2579(method734(arg5[var18] >> 8, this.field1411[arg0 + 1][arg1 + 1] - this.field1398[arg0 + 1][arg1 + 1]), var28, arg9, 255);
                    if (var23.field6231 != 0) {
                        var23.field6233 |= 255 - (this.field1411[arg0 + 1][arg1 + 1] - this.field1398[arg0 + 1][arg1 + 1]) << 25;
                    }
                    int var29;
                    if (this.field1404 != null && arg10 != 0) {
                        var29 = this.field1404[arg0][arg1 + 1] * 255 / arg10;
                        if (var29 < 0) {
                            var29 = 0;
                        } else if (var29 > 255) {
                            var29 = 255;
                        }
                    } else {
                        var29 = 0;
                    }
                    var23.field6235 = class411.method2579(method734(arg5[var19] >> 8, this.field1411[arg0][arg1 + 1] - this.field1398[arg0][arg1 + 1]), var29, arg9, 255);
                    if (var23.field6231 != 0) {
                        var23.field6235 |= 255 - (this.field1411[arg0][arg1 + 1] - this.field1398[arg0][arg1 + 1]) << 25;
                    }
                    var23.field6229 = -1;
                }
                this.field1410[arg0][arg1] = var23;
            } else {
                class383 var30 = new class383();
                var30.field5511 = (short) arg2.length;
                var30.field5508 = (short) (arg2.length / 3);
                var30.field5512 = new short[var30.field5511];
                var30.field5516 = new short[var30.field5511];
                var30.field5510 = new short[var30.field5511];
                var30.field5514 = new int[var30.field5511];
                if (this.field1404 != null) {
                    var30.field5515 = new short[var30.field5511];
                }
                for (int var31 = 0; var31 < var30.field5511; ++var31) {
                    int var46 = arg2[var31];
                    int var47 = arg4[var31];
                    boolean var48 = false;
                    int var49;
                    if (var46 == 0 && var47 == 0) {
                        var49 = this.field1411[arg0][arg1] - this.field1398[arg0][arg1];
                    } else if (var46 == 0 && this.field1402 == var47) {
                        var49 = this.field1411[arg0][arg1 + 1] - this.field1398[arg0][arg1 + 1];
                    } else if (this.field1402 == var46 && this.field1402 == var47) {
                        var49 = this.field1411[arg0 + 1][arg1 + 1] - this.field1398[arg0 + 1][arg1 + 1];
                    } else if (this.field1402 == var46 && var47 == 0) {
                        var49 = this.field1411[arg0 + 1][arg1] - this.field1398[arg0 + 1][arg1];
                    } else {
                        int var50 = (this.field1411[arg0 + 1][arg1] - this.field1398[arg0 + 1][arg1]) * var46 + (this.field1411[arg0][arg1] - this.field1398[arg0][arg1]) * (this.field1402 - var46);
                        int var51 = (this.field1411[arg0 + 1][arg1 + 1] - this.field1398[arg0 + 1][arg1 + 1]) * var46 + (this.field1411[arg0][arg1 + 1] - this.field1398[arg0][arg1 + 1]) * (this.field1402 - var46);
                        var49 = (this.field1402 - var47) * var50 + var47 * var51 >> this.field1408 * 2;
                    }
                    short var52 = (short) ((arg0 << this.field1408) + var46);
                    short var53 = (short) ((arg1 << this.field1408) + var47);
                    var30.field5512[var31] = var52;
                    var30.field5510[var31] = var53;
                    var30.field5516[var31] = (short) (this.method725(var52, var53) + (arg3 != null ? arg3[var31] : 0));
                    if (var49 < 0) {
                        var49 = 0;
                    }
                    if (arg7[var31] != -1 && !this.field1391.field123.method469(arg7[var31], (byte) -91).field6481) {
                        var30.field5514[var31] = var49;
                    } else if (arg5[var31] == 0) {
                        if (arg6 != null) {
                            var30.field5514[var31] = var49 << 25;
                        } else {
                            var30.field5514[var31] = 0;
                        }
                    } else {
                        int var54 = 0;
                        if (this.field1404 != null) {
                            boolean var55 = false;
                            int var56;
                            if (var46 == 0 && var47 == 0) {
                                var56 = this.field1404[arg0][arg1];
                            } else if (var46 == 0 && this.field1402 == var47) {
                                var56 = this.field1404[arg0][arg1 + 1];
                            } else if (this.field1402 == var46 && this.field1402 == var47) {
                                var56 = this.field1404[arg0 + 1][arg1 + 1];
                            } else if (this.field1402 == var46 && var47 == 0) {
                                var56 = this.field1404[arg0 + 1][arg1];
                            } else {
                                int var57 = (this.field1402 - var46) * this.field1404[arg0][arg1] + this.field1404[arg0 + 1][arg1] * var46;
                                int var58 = (this.field1402 - var46) * this.field1404[arg0][arg1 + 1] + this.field1404[arg0 + 1][arg1 + 1] * var46;
                                var56 = (this.field1402 - var47) * var57 + var47 * var58 >> this.field1408 * 2;
                            }
                            var30.field5515[var31] = (short) var56;
                            if (arg10 != 0) {
                                var54 = var56 * 255 / arg10;
                                if (var54 < 0) {
                                    var54 = 0;
                                } else if (var54 > 255) {
                                    var54 = 255;
                                }
                            }
                        }
                        var30.field5514[var31] = class411.method2579(method734(arg5[var31] >> 8, var49), var54, arg9, 255);
                        if (arg6 != null) {
                            var30.field5514[var31] |= var49 << 25;
                        }
                    }
                }
                boolean var32 = false;
                for (int var33 = 0; var33 < var30.field5508; ++var33) {
                    if (arg7[var33 * 3] != -1 && !this.field1391.field123.method469(arg7[var33 * 3], (byte) -62).field6481) {
                        var32 = true;
                    }
                }
                if (arg6 != null) {
                    var30.field5517 = new int[var30.field5508];
                }
                if (var32) {
                    var30.field5513 = new short[var30.field5508];
                    var30.field5509 = new short[var30.field5508];
                }
                for (int var34 = 0; var34 < var30.field5508; ++var34) {
                    int var35 = var34 * 3;
                    if (arg6 != null && arg6[var35] != 0) {
                        var30.field5517[var34] = arg6[var35] >> 8;
                    }
                    if (var32) {
                        int var36 = var35 + 1;
                        int var37 = var36 + 1;
                        boolean var38 = false;
                        boolean var39 = true;
                        int var40 = arg7[var35];
                        if (var40 != -1 && !this.field1391.field123.method469(var40, (byte) -65).field6481) {
                            var38 = true;
                        } else {
                            var39 = false;
                        }
                        int var41 = arg7[var36];
                        if (var41 != -1 && !this.field1391.field123.method469(var41, (byte) -102).field6481) {
                            var38 = true;
                        } else {
                            var39 = false;
                        }
                        int var42 = arg7[var37];
                        if (var42 != -1 && !this.field1391.field123.method469(var42, (byte) -89).field6481) {
                            var38 = true;
                        } else {
                            var39 = false;
                        }
                        if (var39) {
                            var30.field5513[var34] = (short) var42;
                            var30.field5509[var34] = (short) arg8[var35];
                        } else {
                            if (var38) {
                                int var43 = arg7[var35];
                                if (var43 != -1 && !this.field1391.field123.method469(var43, (byte) -123).field6481) {
                                    var30.field5514[var35] = class15.field288[class194.method1257(23213, this.field1391.field123.method469(var43, (byte) -126).field6489 & 65535) & 65535];
                                }
                                int var44 = arg7[var36];
                                if (var44 != -1 && !this.field1391.field123.method469(var44, (byte) -81).field6481) {
                                    var30.field5514[var36] = class15.field288[class194.method1257(23213, this.field1391.field123.method469(var44, (byte) -116).field6489 & 65535) & 65535];
                                }
                                int var45 = arg7[var37];
                                if (var45 != -1 && !this.field1391.field123.method469(var45, (byte) -73).field6481) {
                                    var30.field5514[var37] = class15.field288[class194.method1257(23213, this.field1391.field123.method469(var45, (byte) -111).field6489 & 65535) & 65535];
                                }
                            }
                            var30.field5513[var34] = -1;
                        }
                    }
                }
                this.field1412[arg0][arg1] = var30;
            }
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IIIIIII[[ZLoe;[I[I)V")
    private final void method721(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class110 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field1583 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field1394[var16][var17] != null) {
                        class202 var18 = this.field1394[var16][var17];
                        if (var18.field2779 != -1 && (var18.field2778 & 2) == 0 && var18.field2776 == -1) {
                            int var19 = this.field1391.method58(var18.field2779);
                            arg8.method781(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class63.method483(var19, var18.field2775 & 65535, -29919), class63.method483(var19, var18.field2780 & 65535, -29919), class63.method483(var19, var18.field2777 & 65535, -29919));
                            arg8.method781(var15, var15, var15 - var13, var14, var13 + var14, var14, class63.method483(var19, var18.field2774 & 65535, -29919), class63.method483(var19, var18.field2777 & 65535, -29919), class63.method483(var19, var18.field2780 & 65535, -29919));
                        } else if (var18.field2776 == -1) {
                            arg8.method781(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field2775 & 65535, var18.field2780 & 65535, var18.field2777 & 65535);
                            arg8.method781(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field2774 & 65535, var18.field2777 & 65535, var18.field2780 & 65535);
                        } else {
                            int var20 = var18.field2776;
                            arg8.method781(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var20, var20, var20);
                            arg8.method781(var15, var15, var15 - var13, var14, var13 + var14, var14, var20, var20, var20);
                        }
                    } else if (this.field1407[var16][var17] != null) {
                        class317 var21 = this.field1407[var16][var17];
                        for (int var22 = 0; var22 < var21.field4321; ++var22) {
                            arg9[var22] = (var21.field4322[var22] - this.field1402 * var16) * var13 / this.field1402 + var14;
                            arg10[var22] = var15 - (var21.field4326[var22] - this.field1402 * var17) * var13 / this.field1402;
                        }
                        for (int var23 = 0; var23 < var21.field4330; ++var23) {
                            short var24 = var21.field4323[var23];
                            short var25 = var21.field4329[var23];
                            short var26 = var21.field4332[var23];
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field4325 != null && var21.field4325[var23] != -1) {
                                int var33 = var21.field4325[var23];
                                arg8.method781(var30, var31, var32, var27, var28, var29, class63.method483(var33, var21.field4324[var24], -29919), class63.method483(var33, var21.field4324[var25], -29919), class63.method483(var33, var21.field4324[var26], -29919));
                            } else if (var21.field4328 != null && var21.field4328[var23] != -1) {
                                int var34 = this.field1391.method58(var21.field4328[var23]);
                                arg8.method781(var30, var31, var32, var27, var28, var29, class63.method483(var34, var21.field4324[var24], -29919), class63.method483(var34, var21.field4324[var25], -29919), class63.method483(var34, var21.field4324[var26], -29919));
                            } else {
                                int var35 = var21.field4327[var23];
                                arg8.method781(var30, var31, var32, var27, var28, var29, class63.method483(var35, var21.field4324[var24], -29919), class63.method483(var35, var21.field4324[var25], -29919), class63.method483(var35, var21.field4324[var26], -29919));
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field1583 = true;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "()V")
    public final void method722() {
        this.field1411 = null;
        this.field1398 = null;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method723(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        class382 var9 = this.field1391.method104(Thread.currentThread());
        class110 var10 = var9.field5453;
        var10.field1589 = 0;
        var10.field1578 = false;
        if (this.field1410 != null) {
            this.method728(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field5470, var9.field5501);
        } else {
            if (this.field1394 != null) {
                this.method721(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field5470, var9.field5501);
            }
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IIZLoe;[I[I[I)V")
    private final void method724(int arg0, int arg1, boolean arg2, class110 arg3, int[] arg4, int[] arg5, int[] arg6) {
        class444 var8 = this.field1410[arg0][arg1];
        if (var8 != null) {
            if ((var8.field6232 & 2) == 0) {
                int var9 = this.field1402 * arg0;
                int var10 = this.field1402 + var9;
                int var11 = this.field1402 * arg1;
                int var12 = this.field1402 + var11;
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
                if ((var8.field6232 & 1) != 0 && !arg2) {
                    int var17 = this.field1405[arg0][arg1];
                    int var18 = this.field1399 * var17;
                    var19 = (this.field1400 * var11 + this.field1395 * var9 + var18 >> 15) + this.field1401;
                    if (var19 <= this.field1391.field127) {
                        return;
                    }
                    var20 = (this.field1400 * var11 + this.field1395 * var10 + var18 >> 15) + this.field1401;
                    if (var20 <= this.field1391.field127) {
                        return;
                    }
                    var21 = (this.field1400 * var12 + this.field1395 * var10 + var18 >> 15) + this.field1401;
                    if (var21 <= this.field1391.field127) {
                        return;
                    }
                    var22 = (this.field1400 * var12 + this.field1395 * var9 + var18 >> 15) + this.field1401;
                    if (var22 <= this.field1391.field127) {
                        return;
                    }
                    if (this.field1391.field119) {
                        int var23 = var19 - this.field1391.field147;
                        if (var23 > 0) {
                            var13 = var23;
                            if (var23 > 255) {
                                var13 = 255;
                            }
                        }
                        int var24 = var20 - this.field1391.field147;
                        if (var24 > 0) {
                            var14 = var24;
                            if (var24 > 255) {
                                var14 = 255;
                            }
                        }
                        int var25 = var21 - this.field1391.field147;
                        if (var25 > 0) {
                            var15 = var25;
                            if (var25 > 255) {
                                var15 = 255;
                            }
                        }
                        int var26 = var22 - this.field1391.field147;
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    int var27 = this.field1403 * var17;
                    int var28 = this.field1392 * var17;
                    var29 = (this.field1409 * var11 + this.field1397 * var9 + var27 >> 15) + this.field1406;
                    var30 = this.field1391.field140 * var29 / var19 + arg3.field1588;
                    var31 = (this.field1390 * var11 + this.field1393 * var9 + var28 >> 15) + this.field1396;
                    var32 = this.field1391.field141 * var31 / var19 + arg3.field1586;
                    var33 = (this.field1409 * var11 + this.field1397 * var10 + var27 >> 15) + this.field1406;
                    var34 = this.field1391.field140 * var33 / var20 + arg3.field1588;
                    var35 = (this.field1390 * var11 + this.field1393 * var10 + var28 >> 15) + this.field1396;
                    var36 = this.field1391.field141 * var35 / var20 + arg3.field1586;
                    var37 = (this.field1409 * var12 + this.field1397 * var10 + var27 >> 15) + this.field1406;
                    var38 = this.field1391.field140 * var37 / var21 + arg3.field1588;
                    var39 = (this.field1390 * var12 + this.field1393 * var10 + var28 >> 15) + this.field1396;
                    var40 = this.field1391.field141 * var39 / var21 + arg3.field1586;
                    var41 = (this.field1409 * var12 + this.field1397 * var9 + var27 >> 15) + this.field1406;
                    var42 = this.field1391.field140 * var41 / var22 + arg3.field1588;
                    var43 = (this.field1390 * var12 + this.field1393 * var9 + var28 >> 15) + this.field1396;
                    var44 = this.field1391.field141 * var43 / var22 + arg3.field1586;
                } else {
                    int var45 = this.field1405[arg0][arg1];
                    int var46 = this.field1405[arg0 + 1][arg1];
                    int var47 = this.field1405[arg0 + 1][arg1 + 1];
                    int var48 = this.field1405[arg0][arg1 + 1];
                    var19 = (this.field1400 * var11 + this.field1399 * var45 + this.field1395 * var9 >> 15) + this.field1401;
                    if (var19 <= this.field1391.field127) {
                        return;
                    }
                    var20 = (this.field1400 * var11 + this.field1399 * var46 + this.field1395 * var10 >> 15) + this.field1401;
                    if (var20 <= this.field1391.field127) {
                        return;
                    }
                    var21 = (this.field1400 * var12 + this.field1399 * var47 + this.field1395 * var10 >> 15) + this.field1401;
                    if (var21 <= this.field1391.field127) {
                        return;
                    }
                    var22 = (this.field1400 * var12 + this.field1399 * var48 + this.field1395 * var9 >> 15) + this.field1401;
                    if (var22 <= this.field1391.field127) {
                        return;
                    }
                    if (arg2) {
                        int var49 = var19 - this.field1391.field147;
                        if (var49 > 255) {
                            var49 = 255;
                        }
                        if (var49 > 0) {
                            var13 = var49;
                            int var50 = this.field1404[arg0][arg1] * var49 / 255;
                            if (var50 > 0) {
                                var45 -= var50;
                            }
                        }
                        int var51 = var20 - this.field1391.field147;
                        if (var51 > 255) {
                            var51 = 255;
                        }
                        if (var51 > 0) {
                            var14 = var51;
                            int var52 = this.field1404[arg0 + 1][arg1] * var51 / 255;
                            if (var52 > 0) {
                                var46 -= var52;
                            }
                        }
                        int var53 = var21 - this.field1391.field147;
                        if (var53 > 255) {
                            var53 = 255;
                        }
                        if (var53 > 0) {
                            var15 = var53;
                            int var54 = this.field1404[arg0 + 1][arg1 + 1] * var53 / 255;
                            if (var54 > 0) {
                                var47 -= var54;
                            }
                        }
                        int var55 = var22 - this.field1391.field147;
                        if (var55 > 255) {
                            var55 = 255;
                        }
                        if (var55 > 0) {
                            var16 = var55;
                            int var56 = this.field1404[arg0][arg1 + 1] * var55 / 255;
                            if (var56 > 0) {
                                var48 -= var56;
                            }
                        }
                    } else if (this.field1391.field119) {
                        int var57 = var19 - this.field1391.field147;
                        if (var57 > 0) {
                            var13 = var57;
                            if (var57 > 255) {
                                var13 = 255;
                            }
                        }
                        int var58 = var20 - this.field1391.field147;
                        if (var58 > 0) {
                            var14 = var58;
                            if (var58 > 255) {
                                var14 = 255;
                            }
                        }
                        int var59 = var21 - this.field1391.field147;
                        if (var59 > 0) {
                            var15 = var59;
                            if (var59 > 255) {
                                var15 = 255;
                            }
                        }
                        int var60 = var22 - this.field1391.field147;
                        if (var60 > 0) {
                            var16 = var60;
                            if (var60 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    var29 = (this.field1409 * var11 + this.field1403 * var45 + this.field1397 * var9 >> 15) + this.field1406;
                    var30 = this.field1391.field140 * var29 / var19 + arg3.field1588;
                    var31 = (this.field1390 * var11 + this.field1393 * var9 + this.field1392 * var45 >> 15) + this.field1396;
                    var32 = this.field1391.field141 * var31 / var19 + arg3.field1586;
                    var33 = (this.field1409 * var11 + this.field1403 * var46 + this.field1397 * var10 >> 15) + this.field1406;
                    var34 = this.field1391.field140 * var33 / var20 + arg3.field1588;
                    var35 = (this.field1390 * var11 + this.field1393 * var10 + this.field1392 * var46 >> 15) + this.field1396;
                    var36 = this.field1391.field141 * var35 / var20 + arg3.field1586;
                    var37 = (this.field1409 * var12 + this.field1403 * var47 + this.field1397 * var10 >> 15) + this.field1406;
                    var38 = this.field1391.field140 * var37 / var21 + arg3.field1588;
                    var39 = (this.field1390 * var12 + this.field1393 * var10 + this.field1392 * var47 >> 15) + this.field1396;
                    var40 = this.field1391.field141 * var39 / var21 + arg3.field1586;
                    var41 = (this.field1409 * var12 + this.field1403 * var48 + this.field1397 * var9 >> 15) + this.field1406;
                    var42 = this.field1391.field140 * var41 / var22 + arg3.field1588;
                    var43 = (this.field1390 * var12 + this.field1393 * var9 + this.field1392 * var48 >> 15) + this.field1396;
                    var44 = this.field1391.field141 * var43 / var22 + arg3.field1586;
                }
                boolean var61 = var8.field6229 != -1 && this.method729(this.field1391.field123.method469(var8.field6229, (byte) -122).field6471);
                int var62 = var14 + var15 + var16;
                if ((var36 - var44) * (var38 - var42) - (var34 - var42) * (var40 - var44) > 0) {
                    arg3.field1578 = var38 < 0 || var42 < 0 || var34 < 0 || var38 > arg3.field1580 || var42 > arg3.field1580 || var34 > arg3.field1580;
                    if (var62 < 765) {
                        if (var61) {
                            arg3.field1589 = 100;
                        }
                        if (var62 > 0) {
                            if (var8.field6229 >= 0) {
                                arg3.method780(var40, var44, var36, var38, var42, var34, this.field1391.field115, var15, var16, var14, var8.field6233, var8.field6235, var8.field6234, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field6229);
                            } else {
                                arg3.method777(var40, var44, var36, var38, var42, var34, class123.method834(var15 << 24 | this.field1391.field115, var8.field6233, false), class123.method834(var16 << 24 | this.field1391.field115, var8.field6235, false), class123.method834(var14 << 24 | this.field1391.field115, var8.field6234, false));
                            }
                        } else if (var8.field6229 >= 0) {
                            arg3.method774(var40, var44, var36, var38, var42, var34, var8.field6233, var8.field6235, var8.field6234, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field6229);
                        } else {
                            arg3.method777(var40, var44, var36, var38, var42, var34, var8.field6233, var8.field6235, var8.field6234);
                        }
                        arg3.field1589 = 0;
                    } else {
                        arg3.method779(var40, var44, var36, var38, var42, var34, this.field1391.field115);
                    }
                }
                int var63 = var13 + var14 + var16;
                if ((var30 - var34) * (var44 - var36) - (var32 - var36) * (var42 - var34) > 0) {
                    arg3.field1578 = var30 < 0 || var34 < 0 || var42 < 0 || var30 > arg3.field1580 || var34 > arg3.field1580 || var42 > arg3.field1580;
                    if (var63 < 765) {
                        if (var61) {
                            arg3.field1589 = 100;
                        }
                        if (var63 > 0) {
                            if (var8.field6229 >= 0) {
                                arg3.method780(var32, var36, var44, var30, var34, var42, this.field1391.field115, var13, var14, var16, var8.field6230, var8.field6234, var8.field6235, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field6229);
                            } else {
                                arg3.method777(var32, var36, var44, var30, var34, var42, class123.method834(var13 << 24 | this.field1391.field115, var8.field6230, false), class123.method834(var14 << 24 | this.field1391.field115, var8.field6234, false), class123.method834(var16 << 24 | this.field1391.field115, var8.field6235, false));
                            }
                        } else if (var8.field6229 >= 0) {
                            arg3.method774(var32, var36, var44, var30, var34, var42, var8.field6230, var8.field6234, var8.field6235, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field6229);
                        } else {
                            arg3.method777(var32, var36, var44, var30, var34, var42, var8.field6230, var8.field6234, var8.field6235);
                        }
                        arg3.field1589 = 0;
                        return;
                    }
                    arg3.method779(var32, var36, var44, var30, var34, var42, this.field1391.field115);
                }
            }
        } else {
            class383 var64 = this.field1412[arg0][arg1];
            if (var64 != null) {
                for (int var65 = 0; var65 < var64.field5511; ++var65) {
                    short var105 = var64.field5512[var65];
                    int var106 = var64.field5516[var65];
                    short var107 = var64.field5510[var65];
                    int var108 = (this.field1400 * var107 + this.field1399 * var106 + this.field1395 * var105 >> 15) + this.field1401;
                    if (var108 <= this.field1391.field127) {
                        return;
                    }
                    arg6[var65] = 0;
                    if (arg2) {
                        int var109 = var108 - this.field1391.field147;
                        if (var109 > 255) {
                            var109 = 255;
                        }
                        if (var109 > 0) {
                            arg6[var65] = var109;
                            int var110 = var64.field5515[var65] * var109 / 255;
                            if (var110 > 0) {
                                var106 -= var110;
                            }
                        }
                    } else if (this.field1391.field119) {
                        int var111 = var108 - this.field1391.field147;
                        if (var111 > 0) {
                            arg6[var65] = var111;
                            if (arg6[var65] > 255) {
                                arg6[var65] = 255;
                            }
                        }
                    }
                    int var112 = (this.field1409 * var107 + this.field1403 * var106 + this.field1397 * var105 >> 15) + this.field1406;
                    int var113 = (this.field1390 * var107 + this.field1393 * var105 + this.field1392 * var106 >> 15) + this.field1396;
                    arg4[var65] = this.field1391.field140 * var112 / var108 + arg3.field1588;
                    arg5[var65] = this.field1391.field141 * var113 / var108 + arg3.field1586;
                }
                if (var64.field5513 != null) {
                    int var66 = this.field1405[arg0][arg1];
                    int var67 = this.field1405[arg0 + 1][arg1];
                    int var68 = this.field1405[arg0][arg1 + 1];
                    int var69 = this.field1402 * arg0;
                    int var70 = this.field1402 + var69;
                    int var71 = this.field1402 * arg1;
                    int var72 = this.field1402 + var71;
                    int var73 = (this.field1409 * var71 + this.field1403 * var66 + this.field1397 * var69 >> 15) + this.field1406;
                    int var74 = (this.field1390 * var71 + this.field1393 * var69 + this.field1392 * var66 >> 15) + this.field1396;
                    int var75 = (this.field1400 * var71 + this.field1399 * var66 + this.field1395 * var69 >> 15) + this.field1401;
                    int var76 = (this.field1409 * var71 + this.field1403 * var67 + this.field1397 * var70 >> 15) + this.field1406;
                    int var77 = (this.field1390 * var71 + this.field1393 * var70 + this.field1392 * var67 >> 15) + this.field1396;
                    int var78 = (this.field1400 * var71 + this.field1399 * var67 + this.field1395 * var70 >> 15) + this.field1401;
                    int var79 = (this.field1409 * var72 + this.field1403 * var68 + this.field1397 * var69 >> 15) + this.field1406;
                    int var80 = (this.field1390 * var72 + this.field1393 * var69 + this.field1392 * var68 >> 15) + this.field1396;
                    int var81 = (this.field1400 * var72 + this.field1399 * var68 + this.field1395 * var69 >> 15) + this.field1401;
                    for (int var82 = 0; var82 < var64.field5508; ++var82) {
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
                            arg3.field1578 = var86 < 0 || var87 < 0 || var88 < 0 || var86 > arg3.field1580 || var87 > arg3.field1580 || var88 > arg3.field1580;
                            short var93 = var64.field5513[var82];
                            if (var92 < 765) {
                                if (var93 != -1 && this.method729(this.field1391.field123.method469(var93, (byte) -94).field6471)) {
                                    arg3.field1589 = 100;
                                }
                                if (var92 > 0) {
                                    if (var93 != -1) {
                                        arg3.method780(var89, var90, var91, var86, var87, var88, this.field1391.field115, arg6[var83], arg6[var84], arg6[var85], var64.field5514[var83], var64.field5514[var84], var64.field5514[var85], var73, var76, var79, var74, var77, var80, var75, var78, var81, var93);
                                    } else if ((var64.field5514[var83] & 16777215) != 0) {
                                        arg3.method777(var89, var90, var91, var86, var87, var88, class123.method834(arg6[var83] << 24 | this.field1391.field115, var64.field5514[var83], false), class123.method834(arg6[var84] << 24 | this.field1391.field115, var64.field5514[var84], false), class123.method834(arg6[var85] << 24 | this.field1391.field115, var64.field5514[var85], false));
                                    }
                                } else if (var93 != -1) {
                                    arg3.method774(var89, var90, var91, var86, var87, var88, var64.field5514[var83], var64.field5514[var84], var64.field5514[var85], var73, var76, var79, var74, var77, var80, var75, var78, var81, var93);
                                } else if ((var64.field5514[var83] & 16777215) != 0) {
                                    arg3.method777(var89, var90, var91, var86, var87, var88, var64.field5514[var83], var64.field5514[var84], var64.field5514[var85]);
                                }
                                arg3.field1589 = 0;
                            } else {
                                arg3.method779(var89, var90, var91, var86, var87, var88, this.field1391.field115);
                            }
                        }
                    }
                    return;
                }
                for (int var94 = 0; var94 < var64.field5508; ++var94) {
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
                        arg3.field1578 = var98 < 0 || var99 < 0 || var100 < 0 || var98 > arg3.field1580 || var99 > arg3.field1580 || var100 > arg3.field1580;
                        if (var104 < 765) {
                            if (var104 > 0) {
                                if ((var64.field5514[var95] & 16777215) != 0) {
                                    arg3.method777(var101, var102, var103, var98, var99, var100, class411.method2579(var64.field5514[var95], arg6[var95], this.field1391.field115, 255), class411.method2579(var64.field5514[var96], arg6[var96], this.field1391.field115, 255), class411.method2579(var64.field5514[var97], arg6[var97], this.field1391.field115, 255));
                                }
                            } else if ((var64.field5514[var95] & 16777215) != 0) {
                                arg3.method777(var101, var102, var103, var98, var99, var100, var64.field5514[var95], var64.field5514[var96], var64.field5514[var97]);
                            }
                        } else {
                            arg3.method779(var101, var102, var103, var98, var99, var100, this.field1391.field115);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!op", name = "b", descriptor = "(II)I")
    public final int method725(int arg0, int arg1) {
        int var3 = arg0 >> this.field1408;
        int var4 = arg1 >> this.field1408;
        if (var3 >= 0 && var4 >= 0 && var3 <= super.field3434 - 1 && var4 <= super.field3433 - 1) {
            int var5 = arg0 & this.field1402 - 1;
            int var6 = arg1 & this.field1402 - 1;
            int var7 = (this.field1402 - var5) * this.field1405[var3][var4] + this.field1405[var3 + 1][var4] * var5 >> this.field1408;
            int var8 = (this.field1402 - var5) * this.field1405[var3][var4 + 1] + this.field1405[var3 + 1][var4 + 1] * var5 >> this.field1408;
            return (this.field1402 - var6) * var7 + var6 * var8 >> this.field1408;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(Lmc;IIIIZ)Z")
    public final boolean method726(class69 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(Lbh;[I)V")
    public final void method727(class24 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!op", name = "b", descriptor = "(IIIIIII[[ZLoe;[I[I)V")
    private final void method728(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class110 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field1583 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field1410[var16][var17] != null) {
                        class444 var18 = this.field1410[var16][var17];
                        if (var18.field6229 != -1 && (var18.field6232 & 2) == 0 && var18.field6231 == 0) {
                            int var19 = this.field1391.method58(var18.field6229);
                            arg8.method781(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class63.method483(var19, var18.field6233, -29919), class63.method483(var19, var18.field6235, -29919), class63.method483(var19, var18.field6234, -29919));
                            arg8.method781(var15, var15, var15 - var13, var14, var13 + var14, var14, class63.method483(var19, var18.field6230, -29919), class63.method483(var19, var18.field6234, -29919), class63.method483(var19, var18.field6235, -29919));
                        } else if (var18.field6231 == 0) {
                            arg8.method777(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field6233, var18.field6235, var18.field6234);
                            arg8.method777(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field6230, var18.field6234, var18.field6235);
                        } else {
                            int var20 = var18.field6231;
                            arg8.method777(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class123.method834(var18.field6233 & -16777216, var20, false), class123.method834(var18.field6235 & -16777216, var20, false), class123.method834(var18.field6234 & -16777216, var20, false));
                            arg8.method777(var15, var15, var15 - var13, var14, var13 + var14, var14, class123.method834(var18.field6230 & -16777216, var20, false), class123.method834(var18.field6234 & -16777216, var20, false), class123.method834(var18.field6235 & -16777216, var20, false));
                        }
                    } else if (this.field1412[var16][var17] != null) {
                        class383 var21 = this.field1412[var16][var17];
                        for (int var22 = 0; var22 < var21.field5511; ++var22) {
                            arg9[var22] = (var21.field5512[var22] - this.field1402 * var16) * var13 / this.field1402 + var14;
                            arg10[var22] = var15 - (var21.field5510[var22] - this.field1402 * var17) * var13 / this.field1402;
                        }
                        for (int var23 = 0; var23 < var21.field5508; ++var23) {
                            int var24 = var23 * 3;
                            int var25 = var24 + 1;
                            int var26 = var25 + 1;
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field5517 != null && var21.field5517[var23] != 0 && (var21.field5513 == null || var21.field5513 != null && var21.field5513[var23] == -1)) {
                                int var33 = var21.field5517[var23];
                                arg8.method777(var30, var31, var32, var27, var28, var29, class123.method834(-16777216 - (var21.field5514[var24] & -16777216), var33, false), class123.method834(-16777216 - (var21.field5514[var25] & -16777216), var33, false), class123.method834(-16777216 - (var21.field5514[var26] & -16777216), var33, false));
                            } else if (var21.field5513 != null && var21.field5513[var23] != -1) {
                                int var34 = this.field1391.method58(var21.field5513[var23]);
                                arg8.method781(var30, var31, var32, var27, var28, var29, var34, var34, var34);
                            } else {
                                arg8.method777(var30, var31, var32, var27, var28, var29, var21.field5514[var24], var21.field5514[var25], var21.field5514[var26]);
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field1583 = true;
    }

    @OriginalMember(owner = "client!op", name = "c", descriptor = "(I)Z")
    private final boolean method729(int arg0) {
        if ((this.field1389 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else {
            return arg0 == 8;
        }
    }

    @OriginalMember(owner = "client!op", name = "c", descriptor = "(II)V")
    public final void method730(int arg0, int arg1) {
        class382 var3 = this.field1391.method104(Thread.currentThread());
        var3.field5453.field1589 = 0;
        if (this.field1410 != null) {
            this.method724(arg0, arg1, this.field1391.field138, var3.field5453, var3.field5470, var3.field5501, var3.field5490);
        } else {
            if (this.field1394 != null) {
                this.method735(arg0, arg1, var3.field5453, var3.field5470, var3.field5501, var3.field5490);
            }
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(III[[ZZ)V")
    public final void method731(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        class96 var6 = this.field1391.field129;
        this.field1397 = var6.field1346;
        this.field1403 = var6.field1342;
        this.field1409 = var6.field1348;
        this.field1406 = var6.field1347;
        this.field1393 = var6.field1337;
        this.field1392 = var6.field1344;
        this.field1390 = var6.field1341;
        this.field1396 = var6.field1343;
        this.field1395 = var6.field1345;
        this.field1399 = var6.field1340;
        this.field1400 = var6.field1339;
        this.field1401 = var6.field1338;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V")
    public final void method732(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int arg12, int arg13, boolean arg14) {
        if (this.field1394 == null) {
            this.field1394 = new class202[super.field3434][super.field3433];
            this.field1407 = new class317[super.field3434][super.field3433];
        } else if (this.field1410 != null) {
            throw new IllegalStateException();
        }
        boolean var16 = false;
        if (arg8.length == 2 && arg5.length == 2 && (arg8[0] == arg8[1] || arg10[0] != -1 && arg10[0] == arg10[1])) {
            var16 = true;
            for (int var17 = 1; var17 < 2; ++var17) {
                int var18 = arg2[arg5[var17]];
                int var19 = arg4[arg5[var17]];
                if (var18 != 0 && this.field1402 != var18 || var19 != 0 && this.field1402 != var19) {
                    var16 = false;
                    break;
                }
            }
        }
        if (!var16) {
            class317 var20 = new class317();
            short var21 = (short) arg2.length;
            short var22 = (short) arg8.length;
            var20.field4321 = var21;
            var20.field4324 = new short[var21];
            var20.field4322 = new int[var21];
            var20.field4333 = new int[var21];
            var20.field4326 = new int[var21];
            for (int var23 = 0; var23 < var21; ++var23) {
                int var28 = arg2[var23];
                int var29 = arg4[var23];
                if (var28 == 0 && var29 == 0) {
                    var20.field4324[var23] = (short) (this.field1411[arg0][arg1] - this.field1398[arg0][arg1]);
                } else if (var28 == 0 && this.field1402 == var29) {
                    var20.field4324[var23] = (short) (this.field1411[arg0][arg1 + 1] - this.field1398[arg0][arg1 + 1]);
                } else if (this.field1402 == var28 && this.field1402 == var29) {
                    var20.field4324[var23] = (short) (this.field1411[arg0 + 1][arg1 + 1] - this.field1398[arg0 + 1][arg1 + 1]);
                } else if (this.field1402 == var28 && var29 == 0) {
                    var20.field4324[var23] = (short) (this.field1411[arg0 + 1][arg1] - this.field1398[arg0 + 1][arg1]);
                } else {
                    int var30 = (this.field1411[arg0 + 1][arg1] - this.field1398[arg0 + 1][arg1]) * var28 + (this.field1411[arg0][arg1] - this.field1398[arg0][arg1]) * (this.field1402 - var28);
                    int var31 = (this.field1411[arg0 + 1][arg1 + 1] - this.field1398[arg0 + 1][arg1 + 1]) * var28 + (this.field1411[arg0][arg1 + 1] - this.field1398[arg0][arg1 + 1]) * (this.field1402 - var28);
                    var20.field4324[var23] = (short) ((this.field1402 - var29) * var30 + var29 * var31 >> this.field1408 * 2);
                }
                int var32 = (arg0 << this.field1408) + var28;
                int var33 = (arg1 << this.field1408) + var29;
                var20.field4322[var23] = var32;
                var20.field4326[var23] = var33;
                var20.field4333[var23] = this.method725(var32, var33) + (arg3 != null ? arg3[var23] : 0);
                if (var20.field4324[var23] < 2) {
                    var20.field4324[var23] = 2;
                }
            }
            boolean var24 = false;
            int var25 = 0;
            for (int var26 = 0; var26 < var22; ++var26) {
                if (arg8[var26] >= 0 || arg9 != null && arg9[var26] >= 0) {
                    ++var25;
                }
                if (arg10[var26] != -1 && !this.field1391.field123.method469(arg10[var26], (byte) -115).field6481) {
                    var24 = true;
                }
            }
            var20.field4327 = new int[var25];
            if (arg9 != null) {
                var20.field4325 = new int[var25];
            }
            var20.field4323 = new short[var25];
            var20.field4329 = new short[var25];
            var20.field4332 = new short[var25];
            if (var24) {
                var20.field4328 = new short[var25];
                var20.field4331 = new short[var25];
            }
            for (int var27 = 0; var27 < var22; ++var27) {
                if (arg8[var27] >= 0 || arg9 != null && arg9[var27] >= 0) {
                    if (arg8[var27] >= 0) {
                        var20.field4327[var20.field4330] = class194.method1257(23213, arg8[var27]);
                    } else {
                        var20.field4327[var20.field4330] = -1;
                    }
                    if (arg9 != null) {
                        if (arg9[var27] != -1) {
                            var20.field4325[var20.field4330] = class194.method1257(23213, arg9[var27]);
                        } else {
                            var20.field4325[var20.field4330] = -1;
                        }
                    }
                    var20.field4323[var20.field4330] = (short) arg5[var27];
                    var20.field4329[var20.field4330] = (short) arg6[var27];
                    var20.field4332[var20.field4330] = (short) arg7[var27];
                    if (var24) {
                        if (arg10[var27] != -1 && !this.field1391.field123.method469(arg10[var27], (byte) -76).field6481) {
                            var20.field4328[var20.field4330] = (short) arg10[var27];
                            var20.field4331[var20.field4330] = (short) arg11[var27];
                        } else {
                            var20.field4328[var20.field4330] = -1;
                        }
                    }
                    ++var20.field4330;
                }
            }
            this.field1407[arg0][arg1] = var20;
        } else {
            if (arg8[0] >= 0 || arg9 != null && arg9[0] >= 0) {
                class202 var34 = new class202();
                int var35 = arg8[0];
                int var36 = arg10[0];
                if (arg9 != null) {
                    var34.field2776 = class63.method483(class194.method1257(23213, arg9[0]), this.field1411[arg0][arg1] - this.field1398[arg0][arg1], -29919);
                    if (var35 == -1) {
                        var34.field2778 = (byte) (var34.field2778 | 2);
                    }
                }
                if (this.field1405[arg0 + 1][arg1] == this.field1405[arg0][arg1] && this.field1405[arg0 + 1][arg1 + 1] == this.field1405[arg0][arg1] && this.field1405[arg0][arg1 + 1] == this.field1405[arg0][arg1]) {
                    var34.field2778 = (byte) (var34.field2778 | 1);
                }
                if (var36 != -1 && (var34.field2778 & 2) == 0 && !this.field1391.field123.method469(var36, (byte) -107).field6481) {
                    var34.field2774 = (short) (this.field1411[arg0][arg1] - this.field1398[arg0][arg1]);
                    var34.field2777 = (short) (this.field1411[arg0 + 1][arg1] - this.field1398[arg0 + 1][arg1]);
                    var34.field2775 = (short) (this.field1411[arg0 + 1][arg1 + 1] - this.field1398[arg0 + 1][arg1 + 1]);
                    var34.field2780 = (short) (this.field1411[arg0][arg1 + 1] - this.field1398[arg0][arg1 + 1]);
                    var34.field2779 = (short) var36;
                } else {
                    short var37 = class194.method1257(23213, var35);
                    var34.field2774 = (short) class63.method483(var37, this.field1411[arg0][arg1] - this.field1398[arg0][arg1], -29919);
                    var34.field2777 = (short) class63.method483(var37, this.field1411[arg0 + 1][arg1] - this.field1398[arg0 + 1][arg1], -29919);
                    var34.field2775 = (short) class63.method483(var37, this.field1411[arg0 + 1][arg1 + 1] - this.field1398[arg0 + 1][arg1 + 1], -29919);
                    var34.field2780 = (short) class63.method483(var37, this.field1411[arg0][arg1 + 1] - this.field1398[arg0][arg1 + 1], -29919);
                    var34.field2779 = -1;
                }
                this.field1394[arg0][arg1] = var34;
            }
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IILmc;)Lmc;")
    public final class69 method733(int arg0, int arg1, class69 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!op", name = "d", descriptor = "(II)I")
    private static final int method734(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IILoe;[I[I[I)V")
    private final void method735(int arg0, int arg1, class110 arg2, int[] arg3, int[] arg4, int[] arg5) {
        class202 var7 = this.field1394[arg0][arg1];
        if (var7 != null) {
            if ((var7.field2778 & 2) == 0) {
                int var8 = this.field1402 * arg0;
                int var9 = this.field1402 + var8;
                int var10 = this.field1402 * arg1;
                int var11 = this.field1402 + var10;
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
                if ((var7.field2778 & 1) != 0) {
                    int var12 = this.field1405[arg0][arg1];
                    int var13 = this.field1399 * var12;
                    var14 = (this.field1400 * var10 + this.field1395 * var8 + var13 >> 15) + this.field1401;
                    if (var14 <= this.field1391.field127) {
                        return;
                    }
                    var15 = (this.field1400 * var10 + this.field1395 * var9 + var13 >> 15) + this.field1401;
                    if (var15 <= this.field1391.field127) {
                        return;
                    }
                    int var16 = (this.field1400 * var11 + this.field1395 * var9 + var13 >> 15) + this.field1401;
                    if (var16 <= this.field1391.field127) {
                        return;
                    }
                    var17 = (this.field1400 * var11 + this.field1395 * var8 + var13 >> 15) + this.field1401;
                    if (var17 <= this.field1391.field127) {
                        return;
                    }
                    int var18 = this.field1403 * var12;
                    int var19 = this.field1392 * var12;
                    var20 = (this.field1409 * var10 + this.field1397 * var8 + var18 >> 15) + this.field1406;
                    var21 = this.field1391.field140 * var20 / var14 + arg2.field1588;
                    var22 = (this.field1390 * var10 + this.field1393 * var8 + var19 >> 15) + this.field1396;
                    var23 = this.field1391.field141 * var22 / var14 + arg2.field1586;
                    var24 = (this.field1409 * var10 + this.field1397 * var9 + var18 >> 15) + this.field1406;
                    var25 = this.field1391.field140 * var24 / var15 + arg2.field1588;
                    var26 = (this.field1390 * var10 + this.field1393 * var9 + var19 >> 15) + this.field1396;
                    var27 = this.field1391.field141 * var26 / var15 + arg2.field1586;
                    int var28 = (this.field1409 * var11 + this.field1397 * var9 + var18 >> 15) + this.field1406;
                    var29 = this.field1391.field140 * var28 / var16 + arg2.field1588;
                    int var30 = (this.field1390 * var11 + this.field1393 * var9 + var19 >> 15) + this.field1396;
                    var31 = this.field1391.field141 * var30 / var16 + arg2.field1586;
                    var32 = (this.field1409 * var11 + this.field1397 * var8 + var18 >> 15) + this.field1406;
                    var33 = this.field1391.field140 * var32 / var17 + arg2.field1588;
                    var34 = (this.field1390 * var11 + this.field1393 * var8 + var19 >> 15) + this.field1396;
                    var35 = this.field1391.field141 * var34 / var17 + arg2.field1586;
                } else {
                    int var36 = this.field1405[arg0][arg1];
                    int var37 = this.field1405[arg0 + 1][arg1];
                    int var38 = this.field1405[arg0 + 1][arg1 + 1];
                    int var39 = this.field1405[arg0][arg1 + 1];
                    var14 = (this.field1400 * var10 + this.field1399 * var36 + this.field1395 * var8 >> 15) + this.field1401;
                    if (var14 <= this.field1391.field127) {
                        return;
                    }
                    var15 = (this.field1400 * var10 + this.field1399 * var37 + this.field1395 * var9 >> 15) + this.field1401;
                    if (var15 <= this.field1391.field127) {
                        return;
                    }
                    int var40 = (this.field1400 * var11 + this.field1399 * var38 + this.field1395 * var9 >> 15) + this.field1401;
                    if (var40 <= this.field1391.field127) {
                        return;
                    }
                    var17 = (this.field1400 * var11 + this.field1399 * var39 + this.field1395 * var8 >> 15) + this.field1401;
                    if (var17 <= this.field1391.field127) {
                        return;
                    }
                    var20 = (this.field1409 * var10 + this.field1403 * var36 + this.field1397 * var8 >> 15) + this.field1406;
                    var21 = this.field1391.field140 * var20 / var14 + arg2.field1588;
                    var22 = (this.field1390 * var10 + this.field1393 * var8 + this.field1392 * var36 >> 15) + this.field1396;
                    var23 = this.field1391.field141 * var22 / var14 + arg2.field1586;
                    var24 = (this.field1409 * var10 + this.field1403 * var37 + this.field1397 * var9 >> 15) + this.field1406;
                    var25 = this.field1391.field140 * var24 / var15 + arg2.field1588;
                    var26 = (this.field1390 * var10 + this.field1393 * var9 + this.field1392 * var37 >> 15) + this.field1396;
                    var27 = this.field1391.field141 * var26 / var15 + arg2.field1586;
                    int var41 = (this.field1409 * var11 + this.field1403 * var38 + this.field1397 * var9 >> 15) + this.field1406;
                    var29 = this.field1391.field140 * var41 / var40 + arg2.field1588;
                    int var42 = (this.field1390 * var11 + this.field1393 * var9 + this.field1392 * var38 >> 15) + this.field1396;
                    var31 = this.field1391.field141 * var42 / var40 + arg2.field1586;
                    var32 = (this.field1409 * var11 + this.field1403 * var39 + this.field1397 * var8 >> 15) + this.field1406;
                    var33 = this.field1391.field140 * var32 / var17 + arg2.field1588;
                    var34 = (this.field1390 * var11 + this.field1393 * var8 + this.field1392 * var39 >> 15) + this.field1396;
                    var35 = this.field1391.field141 * var34 / var17 + arg2.field1586;
                }
                if ((var27 - var35) * (var29 - var33) - (var25 - var33) * (var31 - var35) > 0) {
                    arg2.field1578 = var29 < 0 || var33 < 0 || var25 < 0 || var29 > arg2.field1580 || var33 > arg2.field1580 || var25 > arg2.field1580;
                    if (var7.field2779 >= 0) {
                        if (this.method729(this.field1391.field123.method469(var7.field2779, (byte) -88).field6471)) {
                            arg2.field1589 = 100;
                        }
                        arg2.method774(var31, var35, var27, var29, var33, var25, var7.field2775 & 65535, var7.field2780 & 65535, var7.field2777 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field2779);
                        arg2.field1589 = 0;
                    } else {
                        arg2.method781(var31, var35, var27, var29, var33, var25, var7.field2775 & 65535, var7.field2780 & 65535, var7.field2777 & 65535);
                    }
                }
                if ((var21 - var25) * (var35 - var27) - (var23 - var27) * (var33 - var25) > 0) {
                    arg2.field1578 = var21 < 0 || var25 < 0 || var33 < 0 || var21 > arg2.field1580 || var25 > arg2.field1580 || var33 > arg2.field1580;
                    if (var7.field2779 >= 0) {
                        if (this.method729(this.field1391.field123.method469(var7.field2779, (byte) -74).field6471)) {
                            arg2.field1589 = 100;
                        }
                        arg2.method774(var23, var27, var35, var21, var25, var33, var7.field2774 & 65535, var7.field2777 & 65535, var7.field2780 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field2779);
                        arg2.field1589 = 0;
                        return;
                    }
                    arg2.method781(var23, var27, var35, var21, var25, var33, var7.field2774 & 65535, var7.field2777 & 65535, var7.field2780 & 65535);
                }
            }
        } else {
            class317 var43 = this.field1407[arg0][arg1];
            if (var43 != null) {
                for (int var44 = 0; var44 < var43.field4321; ++var44) {
                    int var84 = var43.field4322[var44];
                    int var85 = var43.field4333[var44];
                    int var86 = var43.field4326[var44];
                    int var87 = (this.field1400 * var86 + this.field1399 * var85 + this.field1395 * var84 >> 15) + this.field1401;
                    if (var87 <= this.field1391.field127) {
                        return;
                    }
                    int var88 = (this.field1409 * var86 + this.field1403 * var85 + this.field1397 * var84 >> 15) + this.field1406;
                    int var89 = (this.field1390 * var86 + this.field1393 * var84 + this.field1392 * var85 >> 15) + this.field1396;
                    arg3[var44] = this.field1391.field140 * var88 / var87 + arg2.field1588;
                    arg4[var44] = this.field1391.field141 * var89 / var87 + arg2.field1586;
                }
                if (var43.field4328 != null) {
                    int var45 = this.field1405[arg0][arg1];
                    int var46 = this.field1405[arg0 + 1][arg1];
                    int var47 = this.field1405[arg0][arg1 + 1];
                    int var48 = this.field1402 * arg0;
                    int var49 = this.field1402 + var48;
                    int var50 = this.field1402 * arg1;
                    int var51 = this.field1402 + var50;
                    int var52 = (this.field1409 * var50 + this.field1403 * var45 + this.field1397 * var48 >> 15) + this.field1406;
                    int var53 = (this.field1390 * var50 + this.field1393 * var48 + this.field1392 * var45 >> 15) + this.field1396;
                    int var54 = (this.field1400 * var50 + this.field1399 * var45 + this.field1395 * var48 >> 15) + this.field1401;
                    int var55 = (this.field1409 * var50 + this.field1403 * var46 + this.field1397 * var49 >> 15) + this.field1406;
                    int var56 = (this.field1390 * var50 + this.field1393 * var49 + this.field1392 * var46 >> 15) + this.field1396;
                    int var57 = (this.field1400 * var50 + this.field1399 * var46 + this.field1395 * var49 >> 15) + this.field1401;
                    int var58 = (this.field1409 * var51 + this.field1403 * var47 + this.field1397 * var48 >> 15) + this.field1406;
                    int var59 = (this.field1390 * var51 + this.field1393 * var48 + this.field1392 * var47 >> 15) + this.field1396;
                    int var60 = (this.field1400 * var51 + this.field1399 * var47 + this.field1395 * var48 >> 15) + this.field1401;
                    for (int var61 = 0; var61 < var43.field4330; ++var61) {
                        short var62 = var43.field4323[var61];
                        short var63 = var43.field4329[var61];
                        short var64 = var43.field4332[var61];
                        int var65 = arg3[var62];
                        int var66 = arg3[var63];
                        int var67 = arg3[var64];
                        int var68 = arg4[var62];
                        int var69 = arg4[var63];
                        int var70 = arg4[var64];
                        if ((var65 - var66) * (var70 - var69) - (var67 - var66) * (var68 - var69) > 0) {
                            arg2.field1578 = var65 < 0 || var66 < 0 || var67 < 0 || var65 > arg2.field1580 || var66 > arg2.field1580 || var67 > arg2.field1580;
                            short var71 = var43.field4328[var61];
                            if (var71 != -1) {
                                if (this.method729(this.field1391.field123.method469(var71, (byte) -85).field6471)) {
                                    arg2.field1589 = 100;
                                }
                                arg2.method774(var68, var69, var70, var65, var66, var67, var43.field4324[var62], var43.field4324[var63], var43.field4324[var64], var52, var55, var58, var53, var56, var59, var54, var57, var60, var71);
                                arg2.field1589 = 0;
                            } else {
                                int var72 = var43.field4327[var61];
                                if (var72 != -1) {
                                    arg2.method781(var68, var69, var70, var65, var66, var67, class63.method483(var72, var43.field4324[var62], -29919), class63.method483(var72, var43.field4324[var63], -29919), class63.method483(var72, var43.field4324[var64], -29919));
                                }
                            }
                        }
                    }
                    return;
                }
                for (int var73 = 0; var73 < var43.field4330; ++var73) {
                    short var74 = var43.field4323[var73];
                    short var75 = var43.field4329[var73];
                    short var76 = var43.field4332[var73];
                    int var77 = arg3[var74];
                    int var78 = arg3[var75];
                    int var79 = arg3[var76];
                    int var80 = arg4[var74];
                    int var81 = arg4[var75];
                    int var82 = arg4[var76];
                    if ((var77 - var78) * (var82 - var81) - (var79 - var78) * (var80 - var81) > 0) {
                        int var83 = var43.field4327[var73];
                        if (var83 != -1) {
                            arg2.field1578 = var77 < 0 || var78 < 0 || var79 < 0 || var77 > arg2.field1580 || var78 > arg2.field1580 || var79 > arg2.field1580;
                            arg2.method781(var80, var81, var82, var77, var78, var79, class63.method483(var83, var43.field4324[var74], -29919), class63.method483(var83, var43.field4324[var75], -29919), class63.method483(var83, var43.field4324[var76], -29919));
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!op", name = "<init>", descriptor = "(Lma;IIII[[I[[II)V")
    public class102(class8 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4);
        this.field1391 = arg0;
        this.field1389 = arg2;
        this.field1405 = arg5;
        this.field1404 = arg6;
        this.field1402 = arg7;
        this.field1408 = 0;
        while (arg7 > 1) {
            ++this.field1408;
            arg7 >>= 1;
        }
        this.field1411 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field1391.field159 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = this.field1405[var11 + 1][var10] - this.field1405[var11 - 1][var10];
                int var14 = this.field1405[var11][var10 + 1] - this.field1405[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + var13 * var13 + 65536));
                int var16 = (var13 << 8) / var15;
                int var17 = -65536 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field1391.field148 * var18 + this.field1391.field146 * var16 + this.field1391.field134 * var17 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field1411[var11][var10] = (byte) var20;
            }
        }
        this.field1398 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!op", name = "c", descriptor = "(Lmc;IIIIZ)V")
    public final void method736(class69 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(II)I")
    public final int method737(int arg0, int arg1) {
        return this.field1405[arg0][arg1];
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(III)V")
    public final void method738(int arg0, int arg1, int arg2) {
        if (this.field1398[arg0][arg1] < arg2) {
            this.field1398[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!op", name = "b", descriptor = "(Lmc;IIIIZ)V")
    public final void method739(class69 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }
}
