import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public abstract class class105 extends class137 {

    @OriginalMember(owner = "client!jj", name = "B", descriptor = "I")
    public int field1150 = -1;

    @OriginalMember(owner = "client!jj", name = "x", descriptor = "Luq;")
    public class148 field1146;

    @OriginalMember(owner = "client!jj", name = "G", descriptor = "I")
    private int field1155;

    @OriginalMember(owner = "client!jj", name = "m", descriptor = "[[I")
    public int[][] field1135;

    @OriginalMember(owner = "client!jj", name = "C", descriptor = "[[B")
    private byte[][] field1151;

    @OriginalMember(owner = "client!jj", name = "u", descriptor = "[[B")
    private byte[][] field1143;

    @OriginalMember(owner = "client!jj", name = "l", descriptor = "I")
    public int field1134;

    @OriginalMember(owner = "client!jj", name = "n", descriptor = "I")
    public int field1136;

    @OriginalMember(owner = "client!jj", name = "o", descriptor = "I")
    public int field1137;

    @OriginalMember(owner = "client!jj", name = "p", descriptor = "I")
    public int field1138;

    @OriginalMember(owner = "client!jj", name = "q", descriptor = "I")
    public int field1139;

    @OriginalMember(owner = "client!jj", name = "v", descriptor = "I")
    public int field1144;

    @OriginalMember(owner = "client!jj", name = "w", descriptor = "I")
    public int field1145;

    @OriginalMember(owner = "client!jj", name = "y", descriptor = "I")
    public int field1147;

    @OriginalMember(owner = "client!jj", name = "z", descriptor = "I")
    public int field1148;

    @OriginalMember(owner = "client!jj", name = "D", descriptor = "I")
    public int field1152;

    @OriginalMember(owner = "client!jj", name = "E", descriptor = "I")
    public int field1153;

    @OriginalMember(owner = "client!jj", name = "F", descriptor = "I")
    public int field1154;

    @OriginalMember(owner = "client!jj", name = "A", descriptor = "[[Lcg;")
    public class124[][] field1149;

    @OriginalMember(owner = "client!jj", name = "r", descriptor = "[[Lsa;")
    public class188[][] field1140;

    @OriginalMember(owner = "client!jj", name = "s", descriptor = "[[Lom;")
    public class339[][] field1141;

    @OriginalMember(owner = "client!jj", name = "t", descriptor = "[[Lsca;")
    public class42[][] field1142;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lod;[I)V")
    public final void method254(class463 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!jj", name = "BA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method249(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (this.field1149 == null) {
            this.field1149 = new class124[super.field1558][super.field1562];
            this.field1141 = new class339[super.field1558][super.field1562];
        } else if (this.field1140 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var15 = 0; var15 < arg6.length; ++var15) {
                if (arg6[var15] == -1) {
                    arg6[var15] = 0;
                } else {
                    arg6[var15] = class57.field592[class509.method2923(true, arg6[var15]) & 65535] << 8 | 255;
                }
            }
            if (arg7 != null) {
                for (int var16 = 0; var16 < arg7.length; ++var16) {
                    if (arg7[var16] == -1) {
                        arg7[var16] = 0;
                    } else {
                        arg7[var16] = class57.field592[class509.method2923(true, arg7[var16]) & 65535] << 8 | 255;
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
                    } else if (arg2[var22] == super.field1561 && arg4[var22] == 0) {
                        if (var19 != -1 && arg6[var19] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var19 = var22;
                    } else if (arg2[var22] == super.field1561 && arg4[var22] == super.field1561) {
                        if (var20 != -1 && arg6[var20] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var20 = var22;
                    } else if (arg2[var22] == 0 && arg4[var22] == super.field1561) {
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
                            if (arg2[var24] != arg2[0] && arg2[0] + super.field1561 != arg2[var24] && arg2[0] - super.field1561 != arg2[var24]) {
                                var17 = false;
                                break;
                            }
                            if (arg4[var24] != arg4[0] && arg4[0] + super.field1561 != arg4[var24] && arg4[0] - super.field1561 != arg4[var24]) {
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
                class124 var25 = new class124();
                int var26 = arg6[0];
                int var27 = arg8[0];
                if (arg7 != null) {
                    var25.field1416 = arg7[0] >> 8;
                    if (var26 == 0) {
                        var25.field1417 = (byte) (var25.field1417 | 2);
                    }
                } else if (var26 == 0) {
                    return;
                }
                if (this.field1135[arg0 + 1][arg1] == this.field1135[arg0][arg1] && this.field1135[arg0 + 1][arg1 + 1] == this.field1135[arg0][arg1] && this.field1135[arg0][arg1 + 1] == this.field1135[arg0][arg1]) {
                    var25.field1417 = (byte) (var25.field1417 | 1);
                }
                if (var27 != -1 && (var25.field1417 & 2) == 0 && !this.field1146.field8990.method846((byte) -124, var27).field5492) {
                    var25.field1414 = this.field1151[arg0][arg1] - this.field1143[arg0][arg1];
                    var25.field1409 = this.field1151[arg0 + 1][arg1] - this.field1143[arg0 + 1][arg1];
                    var25.field1412 = this.field1151[arg0 + 1][arg1 + 1] - this.field1143[arg0 + 1][arg1 + 1];
                    var25.field1410 = this.field1151[arg0][arg1 + 1] - this.field1143[arg0][arg1 + 1];
                    var25.field1413 = (short) var27;
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
                    var25.field1414 = class250.method1434(var28, method630(arg6[var18] >> 8, this.field1151[arg0][arg1] - this.field1143[arg0][arg1]), 12686, arg10);
                    if (var25.field1416 != 0) {
                        var25.field1414 |= 255 - (this.field1151[arg0][arg1] - this.field1143[arg0][arg1]) << 25;
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
                    var25.field1409 = class250.method1434(var29, method630(arg6[var19] >> 8, this.field1151[arg0 + 1][arg1] - this.field1143[arg0 + 1][arg1]), 12686, arg10);
                    if (var25.field1416 != 0) {
                        var25.field1409 |= 255 - (this.field1151[arg0 + 1][arg1] - this.field1143[arg0 + 1][arg1]) << 25;
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
                    var25.field1412 = class250.method1434(var30, method630(arg6[var20] >> 8, this.field1151[arg0 + 1][arg1 + 1] - this.field1143[arg0 + 1][arg1 + 1]), 12686, arg10);
                    if (var25.field1416 != 0) {
                        var25.field1412 |= 255 - (this.field1151[arg0 + 1][arg1 + 1] - this.field1143[arg0 + 1][arg1 + 1]) << 25;
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
                    var25.field1410 = class250.method1434(var31, method630(arg6[var21] >> 8, this.field1151[arg0][arg1 + 1] - this.field1143[arg0][arg1 + 1]), 12686, arg10);
                    if (var25.field1416 != 0) {
                        var25.field1410 |= 255 - (this.field1151[arg0][arg1 + 1] - this.field1143[arg0][arg1 + 1]) << 25;
                    }
                    var25.field1413 = -1;
                }
                if (arg5 != null) {
                    var25.field1418 = (short) arg5[var20];
                    var25.field1415 = (short) arg5[var21];
                    var25.field1408 = (short) arg5[var19];
                    var25.field1411 = (short) arg5[var18];
                }
                this.field1149[arg0][arg1] = var25;
            } else {
                class339 var32 = new class339();
                var32.field4422 = (short) arg2.length;
                var32.field4417 = (short) (arg2.length / 3);
                var32.field4425 = new short[var32.field4422];
                var32.field4419 = new short[var32.field4422];
                var32.field4424 = new short[var32.field4422];
                var32.field4426 = new int[var32.field4422];
                if (arg5 != null) {
                    var32.field4423 = new short[var32.field4422];
                }
                for (int var33 = 0; var33 < var32.field4422; ++var33) {
                    int var48 = arg2[var33];
                    int var49 = arg4[var33];
                    boolean var50 = false;
                    int var51;
                    if (var48 == 0 && var49 == 0) {
                        var51 = this.field1151[arg0][arg1] - this.field1143[arg0][arg1];
                    } else if (var48 == 0 && super.field1561 == var49) {
                        var51 = this.field1151[arg0][arg1 + 1] - this.field1143[arg0][arg1 + 1];
                    } else if (super.field1561 == var48 && super.field1561 == var49) {
                        var51 = this.field1151[arg0 + 1][arg1 + 1] - this.field1143[arg0 + 1][arg1 + 1];
                    } else if (super.field1561 == var48 && var49 == 0) {
                        var51 = this.field1151[arg0 + 1][arg1] - this.field1143[arg0 + 1][arg1];
                    } else {
                        int var52 = (this.field1151[arg0 + 1][arg1] - this.field1143[arg0 + 1][arg1]) * var48 + (this.field1151[arg0][arg1] - this.field1143[arg0][arg1]) * (super.field1561 - var48);
                        int var53 = (this.field1151[arg0 + 1][arg1 + 1] - this.field1143[arg0 + 1][arg1 + 1]) * var48 + (this.field1151[arg0][arg1 + 1] - this.field1143[arg0][arg1 + 1]) * (super.field1561 - var48);
                        var51 = (super.field1561 - var49) * var52 + var49 * var53 >> super.field1560 * 2;
                    }
                    int var54 = (arg0 << super.field1560) + var48;
                    int var55 = (arg1 << super.field1560) + var49;
                    var32.field4425[var33] = (short) var48;
                    var32.field4424[var33] = (short) var49;
                    var32.field4419[var33] = (short) (this.method242(var54, var55) + (arg3 != null ? arg3[var33] : 0));
                    if (var51 < 0) {
                        var51 = 0;
                    }
                    if (arg8[var33] != -1 && !this.field1146.field8990.method846((byte) -112, arg8[var33]).field5492) {
                        var32.field4426[var33] = var51;
                    } else if (arg6[var33] == 0) {
                        if (arg7 != null) {
                            var32.field4426[var33] = var51 << 25;
                        } else {
                            var32.field4426[var33] = 0;
                        }
                    } else {
                        int var56 = 0;
                        if (arg5 != null) {
                            short var57 = var32.field4423[var33] = (short) arg5[var33];
                            if (arg11 != 0) {
                                var56 = var57 * 255 / arg11;
                                if (var56 < 0) {
                                    var56 = 0;
                                } else if (var56 > 255) {
                                    var56 = 255;
                                }
                            }
                        }
                        var32.field4426[var33] = class250.method1434(var56, method630(arg6[var33] >> 8, var51), 12686, arg10);
                        if (arg7 != null) {
                            var32.field4426[var33] |= var51 << 25;
                        }
                    }
                }
                boolean var34 = false;
                for (int var35 = 0; var35 < var32.field4417; ++var35) {
                    if (arg8[var35 * 3] != -1 && !this.field1146.field8990.method846((byte) -105, arg8[var35 * 3]).field5492) {
                        var34 = true;
                    }
                }
                if (arg7 != null) {
                    var32.field4418 = new int[var32.field4417];
                }
                if (var34) {
                    var32.field4421 = new short[var32.field4417];
                    var32.field4420 = new short[var32.field4417];
                }
                for (int var36 = 0; var36 < var32.field4417; ++var36) {
                    int var37 = var36 * 3;
                    if (arg7 != null && arg7[var37] != 0) {
                        var32.field4418[var36] = arg7[var37] >> 8;
                    }
                    if (var34) {
                        int var38 = var37 + 1;
                        int var39 = var38 + 1;
                        boolean var40 = false;
                        boolean var41 = true;
                        int var42 = arg8[var37];
                        if (var42 != -1 && !this.field1146.field8990.method846((byte) -128, var42).field5492) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var43 = arg8[var38];
                        if (var43 != -1 && !this.field1146.field8990.method846((byte) -114, var43).field5492) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var44 = arg8[var39];
                        if (var44 != -1 && !this.field1146.field8990.method846((byte) -124, var44).field5492) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        if (var41) {
                            var32.field4421[var36] = (short) var44;
                            var32.field4420[var36] = (short) arg9[var37];
                        } else {
                            if (var40) {
                                int var45 = arg8[var37];
                                if (var45 != -1 && !this.field1146.field8990.method846((byte) -110, var45).field5492) {
                                    var32.field4426[var37] = class57.field592[class509.method2923(true, this.field1146.field8990.method846((byte) -111, var45).field5480 & 65535) & 65535];
                                }
                                int var46 = arg8[var38];
                                if (var46 != -1 && !this.field1146.field8990.method846((byte) -115, var46).field5492) {
                                    var32.field4426[var38] = class57.field592[class509.method2923(true, this.field1146.field8990.method846((byte) -119, var46).field5480 & 65535) & 65535];
                                }
                                int var47 = arg8[var39];
                                if (var47 != -1 && !this.field1146.field8990.method846((byte) -119, var47).field5492) {
                                    var32.field4426[var39] = class57.field592[class509.method2923(true, this.field1146.field8990.method846((byte) -108, var47).field5480 & 65535) & 65535];
                                }
                            }
                            var32.field4421[var36] = -1;
                        }
                    }
                }
                this.field1141[arg0][arg1] = var32;
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "JA", descriptor = "(II)I")
    public final int method253(int arg0, int arg1) {
        return this.field1135[arg0][arg1];
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method244(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        if (this.field1140 == null) {
            this.field1140 = new class188[super.field1558][super.field1562];
            this.field1142 = new class42[super.field1558][super.field1562];
        } else if (this.field1149 != null) {
            throw new IllegalStateException();
        }
        boolean var18 = false;
        if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
            var18 = true;
            for (int var19 = 1; var19 < 2; ++var19) {
                int var20 = arg2[arg6[var19]];
                int var21 = arg4[arg6[var19]];
                if (var20 != 0 && super.field1561 != var20 || var21 != 0 && super.field1561 != var21) {
                    var18 = false;
                    break;
                }
            }
        }
        if (!var18) {
            class42 var22 = new class42();
            short var23 = (short) arg2.length;
            short var24 = (short) arg9.length;
            var22.field438 = var23;
            var22.field442 = new short[var23];
            var22.field446 = new short[var23];
            var22.field440 = new short[var23];
            var22.field450 = new short[var23];
            for (int var25 = 0; var25 < var23; ++var25) {
                int var30 = arg2[var25];
                int var31 = arg4[var25];
                if (var30 == 0 && var31 == 0) {
                    var22.field442[var25] = (short) (this.field1151[arg0][arg1] - this.field1143[arg0][arg1]);
                } else if (var30 == 0 && super.field1561 == var31) {
                    var22.field442[var25] = (short) (this.field1151[arg0][arg1 + 1] - this.field1143[arg0][arg1 + 1]);
                } else if (super.field1561 == var30 && super.field1561 == var31) {
                    var22.field442[var25] = (short) (this.field1151[arg0 + 1][arg1 + 1] - this.field1143[arg0 + 1][arg1 + 1]);
                } else if (super.field1561 == var30 && var31 == 0) {
                    var22.field442[var25] = (short) (this.field1151[arg0 + 1][arg1] - this.field1143[arg0 + 1][arg1]);
                } else {
                    int var32 = (this.field1151[arg0 + 1][arg1] - this.field1143[arg0 + 1][arg1]) * var30 + (this.field1151[arg0][arg1] - this.field1143[arg0][arg1]) * (super.field1561 - var30);
                    int var33 = (this.field1151[arg0 + 1][arg1 + 1] - this.field1143[arg0 + 1][arg1 + 1]) * var30 + (this.field1151[arg0][arg1 + 1] - this.field1143[arg0][arg1 + 1]) * (super.field1561 - var30);
                    var22.field442[var25] = (short) ((super.field1561 - var31) * var32 + var31 * var33 >> super.field1560 * 2);
                }
                int var34 = (arg0 << super.field1560) + var30;
                int var35 = (arg1 << super.field1560) + var31;
                var22.field446[var25] = (short) var30;
                var22.field450[var25] = (short) var31;
                var22.field440[var25] = (short) (this.method242(var34, var35) + (arg3 != null ? arg3[var25] : 0));
                if (var22.field442[var25] < 2) {
                    var22.field442[var25] = 2;
                }
            }
            boolean var26 = false;
            int var27 = 0;
            for (int var28 = 0; var28 < var24; ++var28) {
                if (arg9[var28] >= 0 || arg10 != null && arg10[var28] >= 0) {
                    ++var27;
                }
                if (arg11[var28] != -1 && !this.field1146.field8990.method846((byte) -110, arg11[var28]).field5492) {
                    var26 = true;
                }
            }
            var22.field449 = new int[var27];
            if (arg10 != null) {
                var22.field445 = new int[var27];
            }
            var22.field439 = new short[var27];
            var22.field443 = new short[var27];
            var22.field444 = new short[var27];
            if (var26) {
                var22.field448 = new short[var27];
                var22.field447 = new short[var27];
            }
            for (int var29 = 0; var29 < var24; ++var29) {
                if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
                    if (arg9[var29] >= 0) {
                        var22.field449[var22.field441] = class509.method2923(true, arg9[var29]);
                    } else {
                        var22.field449[var22.field441] = -1;
                    }
                    if (arg10 != null) {
                        if (arg10[var29] != -1) {
                            var22.field445[var22.field441] = class509.method2923(true, arg10[var29]);
                        } else {
                            var22.field445[var22.field441] = -1;
                        }
                    }
                    var22.field439[var22.field441] = (short) arg6[var29];
                    var22.field443[var22.field441] = (short) arg7[var29];
                    var22.field444[var22.field441] = (short) arg8[var29];
                    if (var26) {
                        if (arg11[var29] != -1 && !this.field1146.field8990.method846((byte) -127, arg11[var29]).field5492) {
                            var22.field448[var22.field441] = (short) arg11[var29];
                            var22.field447[var22.field441] = (short) arg12[var29];
                        } else {
                            var22.field448[var22.field441] = -1;
                        }
                    }
                    ++var22.field441;
                }
            }
            this.field1142[arg0][arg1] = var22;
        } else {
            if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
                class188 var36 = new class188();
                int var37 = arg9[0];
                int var38 = arg11[0];
                if (arg10 != null) {
                    var36.field2287 = class80.method514(class509.method2923(true, arg10[0]), this.field1151[arg0][arg1] - this.field1143[arg0][arg1], (byte) -110);
                    if (var37 == -1) {
                        var36.field2289 = (byte) (var36.field2289 | 2);
                    }
                }
                if (this.field1135[arg0 + 1][arg1] == this.field1135[arg0][arg1] && this.field1135[arg0 + 1][arg1 + 1] == this.field1135[arg0][arg1] && this.field1135[arg0][arg1 + 1] == this.field1135[arg0][arg1]) {
                    var36.field2289 = (byte) (var36.field2289 | 1);
                }
                if (var38 != -1 && (var36.field2289 & 2) == 0 && !this.field1146.field8990.method846((byte) -113, var38).field5492) {
                    var36.field2293 = (short) (this.field1151[arg0][arg1] - this.field1143[arg0][arg1]);
                    var36.field2288 = (short) (this.field1151[arg0 + 1][arg1] - this.field1143[arg0 + 1][arg1]);
                    var36.field2290 = (short) (this.field1151[arg0 + 1][arg1 + 1] - this.field1143[arg0 + 1][arg1 + 1]);
                    var36.field2292 = (short) (this.field1151[arg0][arg1 + 1] - this.field1143[arg0][arg1 + 1]);
                    var36.field2291 = (short) var38;
                } else {
                    short var39 = class509.method2923(true, var37);
                    var36.field2293 = (short) class80.method514(var39, this.field1151[arg0][arg1] - this.field1143[arg0][arg1], (byte) -111);
                    var36.field2288 = (short) class80.method514(var39, this.field1151[arg0 + 1][arg1] - this.field1143[arg0 + 1][arg1], (byte) -104);
                    var36.field2290 = (short) class80.method514(var39, this.field1151[arg0 + 1][arg1 + 1] - this.field1143[arg0 + 1][arg1 + 1], (byte) -114);
                    var36.field2292 = (short) class80.method514(var39, this.field1151[arg0][arg1 + 1] - this.field1143[arg0][arg1 + 1], (byte) -124);
                    var36.field2291 = -1;
                }
                this.field1140[arg0][arg1] = var36;
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method246(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lw;IIIIZ)Z")
    public final boolean method250(class269 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!jj", name = "aa", descriptor = "(Lw;IIIIZ)V")
    public final void method251(class269 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!jj", name = "sa", descriptor = "(II)I")
    public final int method242(int arg0, int arg1) {
        int var3 = arg0 >> super.field1560;
        int var4 = arg1 >> super.field1560;
        if (var3 >= 0 && var4 >= 0 && var3 <= super.field1558 - 1 && var4 <= super.field1562 - 1) {
            int var5 = arg0 & super.field1561 - 1;
            int var6 = arg1 & super.field1561 - 1;
            int var7 = (super.field1561 - var5) * this.field1135[var3][var4] + this.field1135[var3 + 1][var4] * var5 >> super.field1560;
            int var8 = (super.field1561 - var5) * this.field1135[var3][var4 + 1] + this.field1135[var3 + 1][var4 + 1] * var5 >> super.field1560;
            return (super.field1561 - var6) * var7 + var6 * var8 >> super.field1560;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(I)Z")
    public final boolean method629(int arg0) {
        if ((this.field1155 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else if (arg0 == 8) {
            return true;
        } else {
            return arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(II)I")
    private static final int method630(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Luq;IIII[[I[[II)V")
    public class105(class148 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field1146 = arg0;
        this.field1155 = arg2;
        this.field1135 = arg5;
        this.field1151 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field1146.field1697 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
                int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + arg7 * 512 + var13 * var13));
                int var16 = (var13 << 8) / var15;
                int var17 = arg7 * -512 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field1146.field1674 * var18 + this.field1146.field1681 * var16 + this.field1146.field1672 * var17 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field1151[var11][var10] = (byte) var20;
            }
        }
        this.field1143 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!jj", name = "EA", descriptor = "(III)V")
    public final void method243(int arg0, int arg1, int arg2) {
        if (this.field1143[arg0][arg1] < arg2) {
            this.field1143[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!jj", name = "ba", descriptor = "()V")
    public final void method248() {
        this.field1151 = null;
        this.field1143 = null;
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "(IILw;)Lw;")
    public final class269 method240(int arg0, int arg1, class269 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!jj", name = "FA", descriptor = "(Lw;IIIIZ)V")
    public final void method247(class269 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)V")
    public abstract void method252(int arg0, int arg1);

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(III[[ZZ)V")
    public void method245(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        class47 var6 = this.field1146.field1679;
        this.field1150 = -1;
        this.field1139 = var6.field518;
        this.field1137 = var6.field512;
        this.field1145 = var6.field517;
        this.field1147 = var6.field510;
        this.field1136 = var6.field509;
        this.field1153 = var6.field513;
        this.field1138 = var6.field514;
        this.field1154 = var6.field519;
        this.field1148 = var6.field516;
        this.field1152 = var6.field520;
        this.field1144 = var6.field515;
        this.field1134 = var6.field511;
    }
}
