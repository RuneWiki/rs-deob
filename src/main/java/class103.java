import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class103 extends class115 {

    @OriginalMember(owner = "client!kk", name = "K", descriptor = "I")
    private int field1171 = 4096;

    @OriginalMember(owner = "client!kk", name = "L", descriptor = "[I")
    private int[] field1172 = new int[3];

    @OriginalMember(owner = "client!kk", name = "M", descriptor = "I")
    private int field1173 = 4096;

    @OriginalMember(owner = "client!kk", name = "O", descriptor = "I")
    private int field1175 = 409;

    @OriginalMember(owner = "client!kk", name = "Q", descriptor = "I")
    private int field1177 = 4096;

    @OriginalMember(owner = "client!kk", name = "J", descriptor = "I")
    public static int field1170;

    @OriginalMember(owner = "client!kk", name = "N", descriptor = "I")
    public static int field1174;

    @OriginalMember(owner = "client!kk", name = "R", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!kk", name = "P", descriptor = "Lep;")
    public static class241 field1176;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Len;Lfs;III)V", line = 5)
    public static final void method557(class174 arg0, class330 arg1, int arg2, int arg3, int arg4) {
        if (arg3 < class158.field2245) {
            class302 var5 = class19.field202[arg2][arg3 + 1][arg4];
            if (var5 != null && var5.field4310 != null && var5.field4310.method217(-103)) {
                arg1.method206(0, arg0, 128, (byte) -42, var5.field4310, 0, true);
            }
        }
        if (arg4 < class158.field2245) {
            class302 var6 = class19.field202[arg2][arg3][arg4 + 1];
            if (var6 != null && var6.field4310 != null && var6.field4310.method217(-104)) {
                arg1.method206(0, arg0, 0, (byte) -42, var6.field4310, 128, true);
            }
        }
        if (arg3 < class158.field2245 && arg4 < class52.field598) {
            class302 var7 = class19.field202[arg2][arg3 + 1][arg4 + 1];
            if (var7 != null && var7.field4310 != null && var7.field4310.method217(-113)) {
                arg1.method206(0, arg0, 128, (byte) -42, var7.field4310, 128, true);
            }
        }
        if (arg3 < class158.field2245 && arg4 > 0) {
            class302 var8 = class19.field202[arg2][arg3 + 1][arg4 - 1];
            if (var8 != null && var8.field4310 != null && var8.field4310.method217(-108)) {
                arg1.method206(0, arg0, 128, (byte) -42, var8.field4310, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)[[I", line = 53)
    public final int[][] method144(int arg0, int arg1) {
        int var3 = 87 % ((arg1 - -80) / 45);
        ++field1170;
        int[][] var4 = super.field1342.method2530(arg0, (byte) 122);
        if (super.field1342.field5819) {
            int[][] var5 = this.method639((byte) 34, arg0, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            for (int var12 = 0; var12 < class218.field2979; ++var12) {
                int var13 = var6[var12];
                int var14 = var13 - this.field1172[0];
                if (~var14 > -1) {
                    var14 = -var14;
                }
                if (~this.field1175 > ~var14) {
                    var9[var12] = var13;
                    var10[var12] = var7[var12];
                    var11[var12] = var8[var12];
                } else {
                    int var15 = var7[var12];
                    int var16 = var15 - this.field1172[1];
                    if (~var16 > -1) {
                        var16 = -var16;
                    }
                    if (~var16 < ~this.field1175) {
                        var9[var12] = var13;
                        var10[var12] = var15;
                        var11[var12] = var8[var12];
                    } else {
                        int var17 = var8[var12];
                        int var18 = -this.field1172[2] + var17;
                        if (~var18 > -1) {
                            var18 = -var18;
                        }
                        if (~this.field1175 > ~var18) {
                            var9[var12] = var13;
                            var10[var12] = var15;
                            var11[var12] = var17;
                        } else {
                            var9[var12] = this.field1173 * var13 >> 12;
                            var10[var12] = this.field1171 * var15 >> 12;
                            var11[var12] = this.field1177 * var17 >> 12;
                        }
                    }
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IILen;ILdl;IIIIIZZI)V", line = 144)
    public static final void method558(int arg0, int arg1, class174 arg2, int arg3, class39 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, boolean arg11, int arg12) {
        ++field1174;
        if (class257.method1613(-120) || class139.method831(arg9, class356.field5209, arg5, arg7, (byte) -88)) {
            if (arg5 < class233.field3176) {
                class233.field3176 = arg5;
            }
            class327 var13 = class157.method1036(0, arg6);
            if (arg12 > -23) {
                method560(79);
            }
            if (class341.field5018 != 1 || !var13.field4649) {
                int var14;
                int var15;
                if (~arg8 != -2 && arg8 != 3) {
                    var14 = var13.field4680;
                    var15 = var13.field4615;
                } else {
                    var14 = var13.field4615;
                    var15 = var13.field4680;
                }
                int var16;
                int var17;
                if (class279.field3935 >= arg9 + var15) {
                    var16 = (var15 - -1 >> 1) + arg9;
                    var17 = (var15 >> 1) + arg9;
                } else {
                    var16 = arg9 + 1;
                    var17 = arg9;
                }
                int var18;
                int var19;
                if (~class164.field2287 <= ~(arg7 + var14)) {
                    var18 = (var14 + 1 >> 1) + arg7;
                    var19 = (var14 >> 1) + arg7;
                } else {
                    var19 = arg7;
                    var18 = arg7 - -1;
                }
                class319 var20 = class132.field1814[arg0];
                int var21 = var20.method1990(var17, var19) - -var20.method1990(var16, var19) - (-var20.method1990(var17, var18) + -var20.method1990(var16, var18)) >> 2;
                int var22 = (arg9 << 7) + (var15 << 6);
                int var23 = (arg7 << 7) + (var14 << 6);
                boolean var24 = arg11 && !arg10 && var13.field4632;
                if (var13.method2021(0)) {
                    class349.method2224(arg9, arg7, (class133) null, var13, arg8, 128, arg5, (class358) null);
                }
                boolean var25 = arg3 == -1 && ~var13.field4639 == 0 && var13.field4599 == null && var13.field4645 == null && !var13.field4634;
                if (!class267.field3755 || ~var13.field4613 == -2) {
                    if (~arg1 == -23) {
                        if (class281.field3945 || var13.field4677 != 0 || ~var13.field4617 == -2 || var13.field4662) {
                            class276 var27;
                            if (var25) {
                                class198 var26 = new class198(arg2, var13, arg0, var22, var21, var23, arg10, arg8, var24);
                                if (var26.method215(-93)) {
                                    var26.method226(arg2, (byte) 111);
                                }
                                var27 = var26;
                            } else {
                                var27 = new class323(arg2, var13, arg8, arg5, arg0, var22, var21, var23, arg10, arg3);
                            }
                            class369.method2329(arg5, arg9, arg7, var27);
                            if (~var13.field4617 == -2 && arg4 != null) {
                                arg4.method236(arg9, 96, arg7);
                            }
                        }
                    } else if (~arg1 != -11 && ~arg1 != -12) {
                        if (arg1 >= 12 && ~arg1 >= -18 || arg1 >= 18 && ~arg1 >= -22) {
                            class113 var29;
                            if (var25) {
                                class402 var28 = new class402(arg2, var13, arg5, arg0, var22, var21, var23, arg10, arg9, arg9 - 1 + var15, arg7, arg7 - (-var14 - -1), arg1, arg8, var24);
                                if (var28.method215(-112)) {
                                    var28.method226(arg2, (byte) 127);
                                }
                                var29 = var28;
                            } else {
                                var29 = new class37(arg2, var13, arg1, arg8, arg5, arg0, var22, var21, var23, arg10, arg9, arg9 + -1 - -var15, arg7, arg7 + -1 - -var14, arg3);
                            }
                            class310.method1947(var29, false);
                            if (arg11 && !arg10 && arg1 >= 12 && arg1 <= 17 && arg1 != 13 && ~arg5 < -1 && var13.field4613 != 0) {
                                class275.field3883[arg5][arg9][arg7] = (byte) class164.method1059(class275.field3883[arg5][arg9][arg7], 4);
                            }
                            if (var13.field4617 != 0 && arg4 != null) {
                                arg4.method239(var13.field4597, arg9, !var13.field4605, arg7, (byte) -9, var15, var14);
                            }
                        } else if (arg1 == 0) {
                            class436 var31;
                            if (var25) {
                                class267 var30 = new class267(arg2, var13, arg0, var22, var21, var23, arg10, arg1, arg8, var24);
                                var31 = var30;
                                if (var30.method215(-103)) {
                                    var30.method226(arg2, (byte) 125);
                                }
                            } else {
                                var31 = new class438(arg2, var13, 0, arg8, arg5, arg0, var22, var21, var23, arg10, arg3);
                            }
                            class275.method1740(arg5, arg9, arg7, var31, (class436) null);
                            if (arg11) {
                                if (~arg8 == -1) {
                                    if (var13.field4640) {
                                        var20.method1992(arg9, arg7, 50);
                                        var20.method1992(arg9, arg7 - -1, 50);
                                    }
                                    if (~var13.field4613 == -2 && !arg10) {
                                        class275.field3883[arg5][arg9][arg7] = (byte) class164.method1059(class275.field3883[arg5][arg9][arg7], 1);
                                    }
                                } else if (~arg8 != -2) {
                                    if (arg8 == 2) {
                                        if (var13.field4640) {
                                            var20.method1992(arg9 + 1, arg7, 50);
                                            var20.method1992(arg9 - -1, arg7 - -1, 50);
                                        }
                                        if (~var13.field4613 == -2 && !arg10) {
                                            class275.field3883[arg5][arg9 + 1][arg7] = (byte) class164.method1059(class275.field3883[arg5][arg9 + 1][arg7], 1);
                                        }
                                    } else if (~arg8 == -4) {
                                        if (var13.field4640) {
                                            var20.method1992(arg9, arg7, 50);
                                            var20.method1992(arg9 - -1, arg7, 50);
                                        }
                                        if (~var13.field4613 == -2 && !arg10) {
                                            class275.field3883[arg5][arg9][arg7] = (byte) class164.method1059(class275.field3883[arg5][arg9][arg7], 2);
                                        }
                                    }
                                } else {
                                    if (var13.field4640) {
                                        var20.method1992(arg9, arg7 + 1, 50);
                                        var20.method1992(arg9 + 1, arg7 + 1, 50);
                                    }
                                    if (var13.field4613 == 1 && !arg10) {
                                        class275.field3883[arg5][arg9][arg7 + 1] = (byte) class164.method1059(class275.field3883[arg5][arg9][arg7 + 1], 2);
                                    }
                                }
                            }
                            if (~var13.field4617 != -1 && arg4 != null) {
                                arg4.method238(arg1, (byte) -109, arg7, arg8, var13.field4597, arg9, !var13.field4605);
                            }
                            if (~var13.field4670 != -17) {
                                class356.method2271(arg5, arg9, arg7, var13.field4670);
                            }
                        } else if (arg1 == 1) {
                            class436 var33;
                            if (var25) {
                                class267 var32 = new class267(arg2, var13, arg0, var22, var21, var23, arg10, arg1, arg8, var24);
                                var33 = var32;
                                if (var32.method215(-127)) {
                                    var32.method226(arg2, (byte) 105);
                                }
                            } else {
                                var33 = new class438(arg2, var13, 1, arg8, arg5, arg0, var22, var21, var23, arg10, arg3);
                            }
                            class275.method1740(arg5, arg9, arg7, var33, (class436) null);
                            if (var13.field4640 && arg11) {
                                if (arg8 != 0) {
                                    if (arg8 == 1) {
                                        var20.method1992(arg9 - -1, arg7 - -1, 50);
                                    } else if (arg8 != 2) {
                                        if (arg8 == 3) {
                                            var20.method1992(arg9, arg7, 50);
                                        }
                                    } else {
                                        var20.method1992(arg9 - -1, arg7, 50);
                                    }
                                } else {
                                    var20.method1992(arg9, arg7 + 1, 50);
                                }
                            }
                            if (~var13.field4617 != -1 && arg4 != null) {
                                arg4.method238(arg1, (byte) -101, arg7, arg8, var13.field4597, arg9, !var13.field4605);
                            }
                        } else if (~arg1 == -3) {
                            int var34 = 3 & arg8 + 1;
                            class436 var35;
                            class436 var36;
                            if (!var25) {
                                var35 = new class438(arg2, var13, 2, arg8 + 4, arg5, arg0, var22, var21, var23, arg10, arg3);
                                var36 = new class438(arg2, var13, 2, var34, arg5, arg0, var22, var21, var23, arg10, arg3);
                            } else {
                                class267 var37 = new class267(arg2, var13, arg0, var22, var21, var23, arg10, arg1, arg8 + 4, var24);
                                class267 var38 = new class267(arg2, var13, arg0, var22, var21, var23, arg10, arg1, var34, var24);
                                if (var37.method215(-105)) {
                                    var37.method226(arg2, (byte) 96);
                                }
                                if (var38.method215(-126)) {
                                    var38.method226(arg2, (byte) 101);
                                }
                                var35 = var37;
                                var36 = var38;
                            }
                            class275.method1740(arg5, arg9, arg7, var35, var36);
                            if (~var13.field4613 == -2 && arg11 && !arg10) {
                                if (arg8 == 0) {
                                    class275.field3883[arg5][arg9][arg7] = (byte) class164.method1059(class275.field3883[arg5][arg9][arg7], 1);
                                    class275.field3883[arg5][arg9][arg7 + 1] = (byte) class164.method1059(class275.field3883[arg5][arg9][arg7 + 1], 2);
                                } else if (arg8 != 1) {
                                    if (~arg8 == -3) {
                                        class275.field3883[arg5][arg9 + 1][arg7] = (byte) class164.method1059(class275.field3883[arg5][arg9 + 1][arg7], 1);
                                        class275.field3883[arg5][arg9][arg7] = (byte) class164.method1059(class275.field3883[arg5][arg9][arg7], 2);
                                    } else if (arg8 == 3) {
                                        class275.field3883[arg5][arg9][arg7] = (byte) class164.method1059(class275.field3883[arg5][arg9][arg7], 2);
                                        class275.field3883[arg5][arg9][arg7] = (byte) class164.method1059(class275.field3883[arg5][arg9][arg7], 1);
                                    }
                                } else {
                                    class275.field3883[arg5][arg9][arg7 + 1] = (byte) class164.method1059(class275.field3883[arg5][arg9][arg7 + 1], 2);
                                    class275.field3883[arg5][arg9 + 1][arg7] = (byte) class164.method1059(class275.field3883[arg5][arg9 + 1][arg7], 1);
                                }
                            }
                            if (var13.field4617 != 0 && arg4 != null) {
                                arg4.method238(arg1, (byte) -102, arg7, arg8, var13.field4597, arg9, !var13.field4605);
                            }
                            if (var13.field4670 != 16) {
                                class356.method2271(arg5, arg9, arg7, var13.field4670);
                            }
                        } else if (arg1 == 3) {
                            class436 var39;
                            if (!var25) {
                                var39 = new class438(arg2, var13, 3, arg8, arg5, arg0, var22, var21, var23, arg10, arg3);
                            } else {
                                class267 var40 = new class267(arg2, var13, arg0, var22, var21, var23, arg10, arg1, arg8, var24);
                                if (var40.method215(-96)) {
                                    var40.method226(arg2, (byte) 117);
                                }
                                var39 = var40;
                            }
                            class275.method1740(arg5, arg9, arg7, var39, (class436) null);
                            if (var13.field4640 && arg11) {
                                if (~arg8 != -1) {
                                    if (~arg8 != -2) {
                                        if (~arg8 == -3) {
                                            var20.method1992(arg9 + 1, arg7, 50);
                                        } else if (arg8 == 3) {
                                            var20.method1992(arg9, arg7, 50);
                                        }
                                    } else {
                                        var20.method1992(arg9 - -1, arg7 - -1, 50);
                                    }
                                } else {
                                    var20.method1992(arg9, arg7 + 1, 50);
                                }
                            }
                            if (~var13.field4617 != -1 && arg4 != null) {
                                arg4.method238(arg1, (byte) -122, arg7, arg8, var13.field4597, arg9, !var13.field4605);
                            }
                        } else if (~arg1 == -10) {
                            class113 var42;
                            if (var25) {
                                class402 var41 = new class402(arg2, var13, arg5, arg0, var22, var21, var23, arg10, arg9, arg9, arg7, arg7, arg1, arg8, var24);
                                var42 = var41;
                                if (var41.method215(-101)) {
                                    var41.method226(arg2, (byte) 108);
                                }
                            } else {
                                var42 = new class37(arg2, var13, arg1, arg8, arg5, arg0, var22, var21, var23, arg10, arg9, var15 - 1 + arg9, arg7, arg7 + -1 + var14, arg3);
                            }
                            class310.method1947(var42, false);
                            if (var13.field4617 != 0 && arg4 != null) {
                                arg4.method239(var13.field4597, arg9, !var13.field4605, arg7, (byte) -9, var15, var14);
                            }
                            if (~var13.field4670 != -17) {
                                class356.method2271(arg5, arg9, arg7, var13.field4670);
                            }
                        } else if (arg1 == 4) {
                            class143 var43;
                            if (!var25) {
                                var43 = new class75(arg2, var13, arg1, arg8, arg5, arg0, var22, var21, var23, arg10, 0, 0, 0, arg3);
                            } else {
                                class318 var44 = new class318(arg2, var13, arg0, var22, var21, var23, arg10, 0, 0, 0, arg1, arg8);
                                if (var44.method215(-115)) {
                                    var44.method226(arg2, (byte) 93);
                                }
                                var43 = var44;
                            }
                            class102.method548(arg5, arg9, arg7, var43, (class143) null);
                        } else if (arg1 == 5) {
                            int var45 = 16;
                            class265 var46 = (class265) class204.method1300(arg5, arg9, arg7);
                            if (var46 != null) {
                                var45 = class157.method1036(0, var46.method225(95)).field4670;
                            }
                            class143 var48;
                            if (var25) {
                                class318 var47 = new class318(arg2, var13, arg0, var22, var21, var23, arg10, 0, class1.field11[arg8] * var45, class102.field1165[arg8] * var45, arg1, arg8);
                                if (var47.method215(-112)) {
                                    var47.method226(arg2, (byte) 116);
                                }
                                var48 = var47;
                            } else {
                                var48 = new class75(arg2, var13, arg1, arg8, arg5, arg0, var22, var21, var23, arg10, 0, class1.field11[arg8] * var45, class102.field1165[arg8] * var45, arg3);
                            }
                            class102.method548(arg5, arg9, arg7, var48, (class143) null);
                        } else if (arg1 == 6) {
                            int var49 = 8;
                            class265 var50 = (class265) class204.method1300(arg5, arg9, arg7);
                            if (var50 != null) {
                                var49 = class157.method1036(0, var50.method225(79)).field4670 / 2;
                            }
                            class143 var52;
                            if (var25) {
                                class318 var51 = new class318(arg2, var13, arg0, var22, var21, var23, arg10, arg8, class1.field11[arg8] * var49, class102.field1165[arg8] * var49, arg1, arg8 + 4);
                                if (var51.method215(-102)) {
                                    var51.method226(arg2, (byte) 122);
                                }
                                var52 = var51;
                            } else {
                                var52 = new class75(arg2, var13, arg1, arg8 + 4, arg5, arg0, var22, var21, var23, arg10, arg8, class401.field5824[arg8] * var49, class78.field890[arg8] * var49, arg3);
                            }
                            class102.method548(arg5, arg9, arg7, var52, (class143) null);
                        } else if (arg1 == 7) {
                            int var53 = 3 & arg8 + 2;
                            class143 var55;
                            if (var25) {
                                class318 var54 = new class318(arg2, var13, arg0, var22, var21, var23, arg10, var53, 0, 0, arg1, var53 + 4);
                                if (var54.method215(-126)) {
                                    var54.method226(arg2, (byte) 106);
                                }
                                var55 = var54;
                            } else {
                                var55 = new class75(arg2, var13, arg1, var53 + 4, arg5, arg0, var22, var21, var23, arg10, var53, 0, 0, arg3);
                            }
                            class102.method548(arg5, arg9, arg7, var55, (class143) null);
                        } else if (arg1 == 8) {
                            int var56 = arg8 + 2 & 3;
                            int var57 = 8;
                            class265 var58 = (class265) class204.method1300(arg5, arg9, arg7);
                            if (var58 != null) {
                                var57 = class157.method1036(0, var58.method225(100)).field4670 / 2;
                            }
                            class143 var61;
                            class143 var62;
                            if (var25) {
                                class318 var59 = new class318(arg2, var13, arg0, var22, var21, var23, arg10, arg8, class401.field5824[arg8] * var57, class78.field890[arg8] * var57, arg1, arg8 + 4);
                                class318 var60 = new class318(arg2, var13, arg0, var22, var21, var23, arg10, arg8, 0, 0, arg1, var56 + 4);
                                if (var59.method215(-103)) {
                                    var59.method226(arg2, (byte) 112);
                                }
                                if (var60.method215(-116)) {
                                    var60.method226(arg2, (byte) 99);
                                }
                                var61 = var59;
                                var62 = var60;
                            } else {
                                class75 var63 = new class75(arg2, var13, arg1, arg8, arg5, arg0, var22, var21, var23, arg10, arg8, class401.field5824[arg8] * var57, class78.field890[arg8] * var57, arg3);
                                class75 var64 = new class75(arg2, var13, arg1, arg8, arg5, arg0, var22, var21, var23, arg10, arg8, 0, 0, arg3);
                                var61 = var63;
                                var62 = var64;
                            }
                            class102.method548(arg5, arg9, arg7, var61, var62);
                        }
                    } else {
                        class402 var65 = null;
                        int var67;
                        class113 var68;
                        if (var25) {
                            class402 var66 = new class402(arg2, var13, arg5, arg0, var22, var21, var23, arg10, arg9, arg9 + var15 + -1, arg7, arg7 + var14 - 1, arg1, arg8, var24);
                            var67 = var66.method2545(true);
                            var68 = var66;
                            var65 = var66;
                        } else {
                            var67 = 15;
                            var68 = new class37(arg2, var13, arg1, arg8, arg5, arg0, var22, var21, var23, arg10, arg9, arg9 + var15 - 1, arg7, arg7 + -1 + var14, arg3);
                        }
                        if (class310.method1947(var68, false)) {
                            if (var65 != null && var65.method215(-124)) {
                                var65.method226(arg2, (byte) 121);
                            }
                            if (var13.field4640 && arg11) {
                                if (var67 > 30) {
                                    var67 = 30;
                                }
                                for (int var69 = 0; ~var69 >= ~var15; ++var69) {
                                    for (int var70 = 0; ~var14 <= ~var70; ++var70) {
                                        var20.method1992(arg9 + var69, arg7 + var70, var67);
                                    }
                                }
                            }
                        }
                        if (var13.field4617 != 0 && arg4 != null) {
                            arg4.method239(var13.field4597, arg9, !var13.field4605, arg7, (byte) -9, var15, var14);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Z)V", line = 759)
    public static final void method559(boolean arg0) {
        if (arg0) {
            class19.field202 = class379.field5582;
            class132.field1814 = class111.field1285;
        } else {
            class19.field202 = class384.field5629;
            class132.field1814 = class78.field887;
        }
        class52.field594 = class19.field202.length;
    }

    @OriginalMember(owner = "client!kk", name = "h", descriptor = "(I)V", line = 775)
    public static void method560(int arg0) {
        field1176 = null;
        if (arg0 != 0) {
            method560(10);
        }
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "()V", line = 862)
    public class103() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(BLbk;I)V", line = 798)
    public final void method149(byte arg0, class211 arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (~arg2 == -5) {
                            int var5 = arg1.method1353(108);
                            this.field1172[2] = class40.method253(var5 >> 12, 0);
                            this.field1172[0] = class40.method253(16711680, var5) << 4;
                            this.field1172[1] = class40.method253(4080, var5 >> 4);
                        }
                    } else {
                        this.field1173 = arg1.method1355(32136);
                    }
                } else {
                    this.field1171 = arg1.method1355(32136);
                }
            } else {
                this.field1177 = arg1.method1355(32136);
            }
        } else {
            this.field1175 = arg1.method1355(32136);
        }
        if (arg0 <= 83) {
            method558(-50, 109, (class174) null, -47, (class39) null, 43, 58, 28, -51, 84, false, false, -32);
        }
        ++field1178;
    }
}
