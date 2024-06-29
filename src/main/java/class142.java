import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class142 extends class135 {

    @OriginalMember(owner = "client!kj", name = "ab", descriptor = "[S")
    public static short[] field2169 = new short[500];

    @OriginalMember(owner = "client!kj", name = "cb", descriptor = "Lqj;")
    public static class196 field2171 = class80.method502("Standort", -48);

    @OriginalMember(owner = "client!kj", name = "X", descriptor = "Lba;")
    public static class93 field2166 = new class93(64);

    @OriginalMember(owner = "client!kj", name = "ib", descriptor = "Lqj;")
    public static class196 field2177 = class80.method502("<br>(X", -48);

    @OriginalMember(owner = "client!kj", name = "jb", descriptor = "[B")
    public static byte[] field2178 = new byte[520];

    @OriginalMember(owner = "client!kj", name = "mb", descriptor = "Lqj;")
    public static class196 field2181 = class80.method502("hint_headicons", -48);

    @OriginalMember(owner = "client!kj", name = "V", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!kj", name = "W", descriptor = "I")
    public static int field2165;

    @OriginalMember(owner = "client!kj", name = "Y", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!kj", name = "Z", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!kj", name = "bb", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!kj", name = "eb", descriptor = "I")
    public static int field2173;

    @OriginalMember(owner = "client!kj", name = "fb", descriptor = "I")
    public static int field2174;

    @OriginalMember(owner = "client!kj", name = "gb", descriptor = "I")
    public static int field2175;

    @OriginalMember(owner = "client!kj", name = "hb", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!kj", name = "lb", descriptor = "Lgh;")
    public static class168 field2180;

    @OriginalMember(owner = "client!kj", name = "kb", descriptor = "Lai;")
    public static class77 field2179;

    @OriginalMember(owner = "client!kj", name = "db", descriptor = "[Lfi;")
    private class214[] field2172;

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "(I)V")
    public static final void method876(int arg0) {
        class21.field251.method1529(382);
        class28.field348.method1529(382);
        ++field2167;
        if (arg0 <= 123) {
            method876(-38);
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IZ)[I")
    public final int[] method99(int arg0, boolean arg1) {
        ++field2176;
        if (arg1) {
            field2181 = null;
        }
        int[] var3 = super.field1954.method110(arg0, 68);
        if (super.field1954.field244) {
            this.method878(30, super.field1954.method111((byte) 80));
        }
        return var3;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIZIILbh;IIZZI)V")
    public static final void method877(int arg0, int arg1, boolean arg2, int arg3, int arg4, class153 arg5, int arg6, int arg7, boolean arg8, boolean arg9, int arg10) {
        ++field2165;
        if (arg2 && !class9.method37(0) && ~(2 & class88.field1300[0][arg6][arg3]) == -1) {
            if ((16 & class88.field1300[arg0][arg6][arg3]) != 0) {
                return;
            }
            if (class180.method1181(11647, arg0, arg3, arg6) != class67.field948) {
                return;
            }
        }
        if (~class101.field1447 < ~arg0) {
            class101.field1447 = arg0;
        }
        class145 var11 = class83.method521(arg1, (byte) 43);
        int var12;
        int var13;
        if (~arg10 != -2 && ~arg10 != -4) {
            var12 = var11.field2263;
            var13 = var11.field2278;
        } else {
            var13 = var11.field2263;
            var12 = var11.field2278;
        }
        int var14;
        int var15;
        if (~(arg6 + var12) >= -105) {
            var14 = (var12 >> 1) + arg6;
            var15 = (var12 + 1 >> 1) + arg6;
        } else {
            var15 = arg6 + 1;
            var14 = arg6;
        }
        int var16;
        int var17;
        if (arg3 + var13 > 104) {
            var16 = arg3;
            var17 = arg3 - -1;
        } else {
            var17 = (var13 + 1 >> 1) + arg3;
            var16 = arg3 - -(var13 >> 1);
        }
        int[][] var18 = class42.field480[arg4];
        if (arg9) {
            method879(-65L, 47);
        }
        int var19 = var18[var14][var16] + var18[var14][var17] - -var18[var15][var16] + var18[var15][var17] >> 2;
        int var20 = (arg6 << 7) + (var12 << 6);
        int var21 = (arg3 << 7) + (var13 << 6);
        int[][] var22 = null;
        long var23 = (long) (1073741824 | arg7 << 14 | arg3 << 7 | arg6 | arg10 << 20);
        if (arg8) {
            var22 = class203.field3667[0];
        } else if (arg4 < 3) {
            var22 = class42.field480[arg4 + 1];
        }
        if (~var11.field2236 == -1 || arg8) {
            var23 |= Long.MIN_VALUE;
        }
        if (~var11.field2272 == -2) {
            var23 |= 4194304L;
        }
        if (var11.field2261) {
            var23 |= -2147483648L;
        }
        if (var11.method904(!arg9)) {
            class82.method512(var11, -89, arg3, arg10, (class134) null, (class164) null, arg6, arg0);
        }
        long var25 = var23 | (long) arg1 << 32;
        boolean var27 = !arg8 & var11.field2252;
        if (arg7 == 22) {
            if (class219.field3919 || ~var11.field2236 != -1 || var11.field2253 == 1 || var11.field2258) {
                class258 var29;
                if (~var11.field2284 == 0 && var11.field2232 == null) {
                    class33 var28 = var11.method903(var20, 14213, var19, (class68) null, 22, var18, arg10, var22, var21, arg2, var27);
                    var29 = var28.field407;
                } else {
                    var29 = new class151(arg1, 22, arg10, arg4, arg6, arg3, var11.field2284, var11.field2250, (class258) null);
                }
                class78.method486(arg0, arg6, arg3, var19, var29, var25, var11.field2293);
                if (var11.field2253 == 1 && arg5 != null) {
                    arg5.method963(arg6, !arg9, arg3);
                }
            }
        } else if (~arg7 != -11 && arg7 != 11) {
            if (arg7 >= 12) {
                class258 var31;
                if (~var11.field2284 == 0 && var11.field2232 == null) {
                    class33 var30 = var11.method903(var20, 14213, var19, (class68) null, arg7, var18, arg10, var22, var21, arg2, var27);
                    var31 = var30.field407;
                } else {
                    var31 = new class151(arg1, arg7, arg10, arg4, arg6, arg3, var11.field2284, var11.field2250, (class258) null);
                }
                class5.method17(arg0, arg6, arg3, var19, 1, 1, var31, 0, var25);
                if (arg2 && arg7 >= 12 && arg7 <= 17 && ~arg7 != -14 && arg0 > 0) {
                    class225.field4038[arg0][arg6][arg3] = class1.method6(class225.field4038[arg0][arg6][arg3], 2340);
                }
                if (~var11.field2253 != -1 && arg5 != null) {
                    arg5.method960(var13, arg6, var11.field2270, false, arg3, var12);
                }
            } else if (arg7 == 0) {
                class258 var33;
                if (~var11.field2284 == 0 && var11.field2232 == null) {
                    class33 var32 = var11.method903(var20, 14213, var19, (class68) null, 0, var18, arg10, var22, var21, arg2, var27);
                    var33 = var32.field407;
                } else {
                    var33 = new class151(arg1, 0, arg10, arg4, arg6, arg3, var11.field2284, var11.field2250, (class258) null);
                }
                class33.method174(arg0, arg6, arg3, var19, var33, (class258) null, class215.field3862[arg10], 0, var25);
                if (arg2) {
                    if (arg10 == 0) {
                        if (var11.field2259) {
                            class45.field538[arg0][arg6][arg3] = 50;
                            class45.field538[arg0][arg6][arg3 + 1] = 50;
                        }
                        if (var11.field2239) {
                            class225.field4038[arg0][arg6][arg3] = class1.method6(class225.field4038[arg0][arg6][arg3], 585);
                        }
                    } else if (arg10 != 1) {
                        if (~arg10 != -3) {
                            if (arg10 == 3) {
                                if (var11.field2259) {
                                    class45.field538[arg0][arg6][arg3] = 50;
                                    class45.field538[arg0][arg6 + 1][arg3] = 50;
                                }
                                if (var11.field2239) {
                                    class225.field4038[arg0][arg6][arg3] = class1.method6(class225.field4038[arg0][arg6][arg3], 1170);
                                }
                            }
                        } else {
                            if (var11.field2259) {
                                class45.field538[arg0][arg6 + 1][arg3] = 50;
                                class45.field538[arg0][arg6 + 1][arg3 - -1] = 50;
                            }
                            if (var11.field2239) {
                                class225.field4038[arg0][arg6 + 1][arg3] = class1.method6(class225.field4038[arg0][arg6 + 1][arg3], 585);
                            }
                        }
                    } else {
                        if (var11.field2259) {
                            class45.field538[arg0][arg6][arg3 + 1] = 50;
                            class45.field538[arg0][arg6 + 1][arg3 + 1] = 50;
                        }
                        if (var11.field2239) {
                            class225.field4038[arg0][arg6][arg3 + 1] = class1.method6(class225.field4038[arg0][arg6][arg3 + 1], 1170);
                        }
                    }
                }
                if (var11.field2253 != 0 && arg5 != null) {
                    arg5.method958(-46, arg7, var11.field2270, arg3, arg6, arg10);
                }
                if (var11.field2262 != 16) {
                    class71.method453(arg0, arg6, arg3, var11.field2262);
                }
            } else if (arg7 == 1) {
                class258 var35;
                if (var11.field2284 == -1 && var11.field2232 == null) {
                    class33 var34 = var11.method903(var20, 14213, var19, (class68) null, 1, var18, arg10, var22, var21, arg2, var27);
                    var35 = var34.field407;
                } else {
                    var35 = new class151(arg1, 1, arg10, arg4, arg6, arg3, var11.field2284, var11.field2250, (class258) null);
                }
                class33.method174(arg0, arg6, arg3, var19, var35, (class258) null, class202.field3630[arg10], 0, var25);
                if (var11.field2259 && arg2) {
                    if (arg10 == 0) {
                        class45.field538[arg0][arg6][arg3 + 1] = 50;
                    } else if (~arg10 == -2) {
                        class45.field538[arg0][arg6 + 1][arg3 + 1] = 50;
                    } else if (arg10 != 2) {
                        if (~arg10 == -4) {
                            class45.field538[arg0][arg6][arg3] = 50;
                        }
                    } else {
                        class45.field538[arg0][arg6 + 1][arg3] = 50;
                    }
                }
                if (var11.field2253 != 0 && arg5 != null) {
                    arg5.method958(-102, arg7, var11.field2270, arg3, arg6, arg10);
                }
            } else if (~arg7 == -3) {
                int var36 = arg10 + 1 & 3;
                class258 var38;
                class258 var40;
                if (var11.field2284 == -1 && var11.field2232 == null) {
                    class33 var37 = var11.method903(var20, 14213, var19, (class68) null, 2, var18, arg10 + 4, var22, var21, arg2, var27);
                    var38 = var37.field407;
                    class33 var39 = var11.method903(var20, 14213, var19, (class68) null, 2, var18, var36, var22, var21, arg2, var27);
                    var40 = var39.field407;
                } else {
                    var38 = new class151(arg1, 2, 4 - -arg10, arg4, arg6, arg3, var11.field2284, var11.field2250, (class258) null);
                    var40 = new class151(arg1, 2, var36, arg4, arg6, arg3, var11.field2284, var11.field2250, (class258) null);
                }
                class33.method174(arg0, arg6, arg3, var19, var38, var40, class215.field3862[arg10], class215.field3862[var36], var25);
                if (var11.field2239 && arg2) {
                    if (~arg10 != -1) {
                        if (~arg10 == -2) {
                            class225.field4038[arg0][arg6][arg3 + 1] = class1.method6(class225.field4038[arg0][arg6][arg3 + 1], 1170);
                            class225.field4038[arg0][arg6 + 1][arg3] = class1.method6(class225.field4038[arg0][arg6 + 1][arg3], 585);
                        } else if (arg10 != 2) {
                            if (arg10 == 3) {
                                class225.field4038[arg0][arg6][arg3] = class1.method6(class225.field4038[arg0][arg6][arg3], 1170);
                                class225.field4038[arg0][arg6][arg3] = class1.method6(class225.field4038[arg0][arg6][arg3], 585);
                            }
                        } else {
                            class225.field4038[arg0][arg6 + 1][arg3] = class1.method6(class225.field4038[arg0][arg6 + 1][arg3], 585);
                            class225.field4038[arg0][arg6][arg3] = class1.method6(class225.field4038[arg0][arg6][arg3], 1170);
                        }
                    } else {
                        class225.field4038[arg0][arg6][arg3] = class1.method6(class225.field4038[arg0][arg6][arg3], 585);
                        class225.field4038[arg0][arg6][arg3 - -1] = class1.method6(class225.field4038[arg0][arg6][arg3 - -1], 1170);
                    }
                }
                if (var11.field2253 != 0 && arg5 != null) {
                    arg5.method958(-113, arg7, var11.field2270, arg3, arg6, arg10);
                }
                if (var11.field2262 != 16) {
                    class71.method453(arg0, arg6, arg3, var11.field2262);
                }
            } else if (arg7 == 3) {
                class258 var42;
                if (~var11.field2284 == 0 && var11.field2232 == null) {
                    class33 var41 = var11.method903(var20, 14213, var19, (class68) null, 3, var18, arg10, var22, var21, arg2, var27);
                    var42 = var41.field407;
                } else {
                    var42 = new class151(arg1, 3, arg10, arg4, arg6, arg3, var11.field2284, var11.field2250, (class258) null);
                }
                class33.method174(arg0, arg6, arg3, var19, var42, (class258) null, class202.field3630[arg10], 0, var25);
                if (var11.field2259 && arg2) {
                    if (~arg10 == -1) {
                        class45.field538[arg0][arg6][arg3 - -1] = 50;
                    } else if (arg10 != 1) {
                        if (arg10 != 2) {
                            if (~arg10 == -4) {
                                class45.field538[arg0][arg6][arg3] = 50;
                            }
                        } else {
                            class45.field538[arg0][arg6 + 1][arg3] = 50;
                        }
                    } else {
                        class45.field538[arg0][arg6 + 1][arg3 + 1] = 50;
                    }
                }
                if (~var11.field2253 != -1 && arg5 != null) {
                    arg5.method958(-5, arg7, var11.field2270, arg3, arg6, arg10);
                }
            } else if (~arg7 == -10) {
                class258 var44;
                if (var11.field2284 == -1 && var11.field2232 == null) {
                    class33 var43 = var11.method903(var20, 14213, var19, (class68) null, arg7, var18, arg10, var22, var21, arg2, var27);
                    var44 = var43.field407;
                } else {
                    var44 = new class151(arg1, arg7, arg10, arg4, arg6, arg3, var11.field2284, var11.field2250, (class258) null);
                }
                class5.method17(arg0, arg6, arg3, var19, 1, 1, var44, 0, var25);
                if (~var11.field2253 != -1 && arg5 != null) {
                    arg5.method960(var13, arg6, var11.field2270, false, arg3, var12);
                }
                if (~var11.field2262 != -17) {
                    class71.method453(arg0, arg6, arg3, var11.field2262);
                }
            } else if (~arg7 == -5) {
                class258 var46;
                if (var11.field2284 == -1 && var11.field2232 == null) {
                    class33 var45 = var11.method903(var20, 14213, var19, (class68) null, 4, var18, arg10, var22, var21, arg2, var27);
                    var46 = var45.field407;
                } else {
                    var46 = new class151(arg1, 4, arg10, arg4, arg6, arg3, var11.field2284, var11.field2250, (class258) null);
                }
                class146.method915(arg0, arg6, arg3, var19, var46, (class258) null, class215.field3862[arg10], 0, 0, 0, var25);
            } else if (arg7 == 5) {
                int var47 = 16;
                long var48 = class63.method399(arg0, arg6, arg3);
                if (var48 != 0L) {
                    var47 = class83.method521((int) (var48 >>> 32) & Integer.MAX_VALUE, (byte) 58).field2262;
                }
                class258 var51;
                if (var11.field2284 == -1 && var11.field2232 == null) {
                    class33 var50 = var11.method903(var20, 14213, var19, (class68) null, 4, var18, arg10, var22, var21, arg2, var27);
                    var51 = var50.field407;
                } else {
                    var51 = new class151(arg1, 4, arg10, arg4, arg6, arg3, var11.field2284, var11.field2250, (class258) null);
                }
                class146.method915(arg0, arg6, arg3, var19, var51, (class258) null, class215.field3862[arg10], 0, class103.field1498[arg10] * var47, class193.field3401[arg10] * var47, var25);
            } else if (~arg7 == -7) {
                int var52 = 8;
                long var53 = class63.method399(arg0, arg6, arg3);
                if (var53 != 0L) {
                    var52 = class83.method521((int) (var53 >>> 32) & Integer.MAX_VALUE, (byte) 19).field2262 / 2;
                }
                class258 var56;
                if (~var11.field2284 == 0 && var11.field2232 == null) {
                    class33 var55 = var11.method903(var20, 14213, var19, (class68) null, 4, var18, arg10 - -4, var22, var21, arg2, var27);
                    var56 = var55.field407;
                } else {
                    var56 = new class151(arg1, 4, arg10 + 4, arg4, arg6, arg3, var11.field2284, var11.field2250, (class258) null);
                }
                class146.method915(arg0, arg6, arg3, var19, var56, (class258) null, 256, arg10, class84.field1238[arg10] * var52, class231.field4111[arg10] * var52, var25);
            } else if (arg7 == 7) {
                int var57 = 3 & arg10 + 2;
                class258 var59;
                if (var11.field2284 == -1 && var11.field2232 == null) {
                    class33 var58 = var11.method903(var20, 14213, var19, (class68) null, 4, var18, var57 + 4, var22, var21, arg2, var27);
                    var59 = var58.field407;
                } else {
                    var59 = new class151(arg1, 4, var57 - -4, arg4, arg6, arg3, var11.field2284, var11.field2250, (class258) null);
                }
                class146.method915(arg0, arg6, arg3, var19, var59, (class258) null, 256, var57, 0, 0, var25);
            } else if (~arg7 == -9) {
                int var60 = 8;
                long var61 = class63.method399(arg0, arg6, arg3);
                if (~var61 != -1L) {
                    var60 = class83.method521(Integer.MAX_VALUE & (int) (var61 >>> 32), (byte) 43).field2262 / 2;
                }
                int var63 = 3 & arg10 + 2;
                class258 var65;
                class258 var67;
                if (var11.field2284 == -1 && var11.field2232 == null) {
                    class33 var64 = var11.method903(var20, 14213, var19, (class68) null, 4, var18, arg10 + 4, var22, var21, arg2, var27);
                    var65 = var64.field407;
                    class33 var66 = var11.method903(var20, 14213, var19, (class68) null, 4, var18, var63 + 4, var22, var21, arg2, var27);
                    var67 = var66.field407;
                } else {
                    var65 = new class151(arg1, 4, arg10 + 4, arg4, arg6, arg3, var11.field2284, var11.field2250, (class258) null);
                    var67 = new class151(arg1, 4, var63 - -4, arg4, arg6, arg3, var11.field2284, var11.field2250, (class258) null);
                }
                class146.method915(arg0, arg6, arg3, var19, var65, var67, 256, arg10, class84.field1238[arg10] * var60, class231.field4111[arg10] * var60, var25);
            }
        } else {
            class258 var69;
            if (~var11.field2284 == 0 && var11.field2232 == null) {
                class33 var68 = var11.method903(var20, 14213, var19, (class68) null, 10, var18, arg7 != 11 ? arg10 : arg10 + 4, var22, var21, arg2, var27);
                var69 = var68.field407;
            } else {
                var69 = new class151(arg1, 10, arg7 == 11 ? 4 - -arg10 : arg10, arg4, arg6, arg3, var11.field2284, var11.field2250, (class258) null);
            }
            if (var69 != null) {
                boolean var70 = class5.method17(arg0, arg6, arg3, var19, var12, var13, var69, 0, var25);
                if (var11.field2259 && var70 && arg2) {
                    int var71 = 15;
                    if (var69 instanceof class119) {
                        var71 = ((class119) var69).method725() / 4;
                        if (~var71 < -31) {
                            var71 = 30;
                        }
                    }
                    for (int var72 = 0; var72 <= var12; ++var72) {
                        for (int var73 = 0; ~var73 >= ~var13; ++var73) {
                            if (~var71 < ~class45.field538[arg0][arg6 + var72][arg3 + var73]) {
                                class45.field538[arg0][arg6 - -var72][arg3 - -var73] = (byte) var71;
                            }
                        }
                    }
                }
            }
            if (~var11.field2253 != -1 && arg5 != null) {
                arg5.method960(var13, arg6, var11.field2270, false, arg3, var12);
            }
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I[[I)V")
    private final void method878(int arg0, int[][] arg1) {
        ++field2164;
        if (arg0 <= 26) {
            field2178 = null;
        }
        int var3 = class150.field2400;
        int var4 = class131.field1862;
        class103.method631(arg1, -1);
        class221.method1507(class53.field667, 0, 78, class61.field816, 0);
        if (this.field2172 != null) {
            for (int var5 = 0; ~this.field2172.length < ~var5; ++var5) {
                class214 var6 = this.field2172[var5];
                int var7 = var6.field3827;
                int var8 = var6.field3835;
                if (var8 >= 0) {
                    if (~var7 <= -1) {
                        var6.method390((byte) -74, var4, var3);
                    } else {
                        var6.method388(84, var3, var4);
                    }
                } else if (~var7 <= -1) {
                    var6.method392(var4, var3, -954688305);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lp;II)V")
    public final void method97(class56 arg0, int arg1, int arg2) {
        ++field2168;
        if (~arg1 == -1) {
            this.field2172 = new class214[arg0.method367(1)];
            for (int var4 = 0; ~var4 > ~this.field2172.length; ++var4) {
                int var5 = arg0.method367(1);
                if (var5 != 0) {
                    if (~var5 != -2) {
                        if (~var5 != -3) {
                            if (var5 == 3) {
                                this.field2172[var4] = class242.method1643(arg0, true);
                            }
                        } else {
                            this.field2172[var4] = class252.method1708(-87, arg0);
                        }
                    } else {
                        this.field2172[var4] = class11.method52(arg2 + -5277, arg0);
                    }
                } else {
                    this.field2172[var4] = class151.method953((byte) -73, arg0);
                }
            }
        } else if (arg1 == 1) {
            super.field1962 = ~arg0.method367(1) == -2;
        }
        if (arg2 != -16231) {
            method877(-76, 17, false, -66, -15, (class153) null, 123, 63, false, false, -29);
        }
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(II)[[I")
    public final int[][] method164(int arg0, int arg1) {
        if (arg0 != 260028743) {
            return null;
        } else {
            ++field2175;
            int[][] var3 = super.field1947.method511(arg1, -1);
            if (super.field1947.field1180) {
                int var4 = class131.field1862;
                int var5 = class150.field2400;
                int[][] var6 = new int[var5][var4];
                int[][][] var7 = super.field1947.method507(-1);
                this.method878(arg0 + -260028703, var6);
                for (int var8 = 0; ~class150.field2400 < ~var8; ++var8) {
                    int[] var9 = var6[var8];
                    int[][] var10 = var7[var8];
                    int[] var11 = var10[1];
                    int[] var12 = var10[0];
                    int[] var13 = var10[2];
                    for (int var14 = 0; ~class131.field1862 < ~var14; ++var14) {
                        int var15 = var9[var14];
                        var13[var14] = class65.method409(var15 << 4, 4080);
                        var11[var14] = class65.method409(65280, var15) >> 4;
                        var12[var14] = class65.method409(4080, var15 >> 12);
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "()V")
    public class142() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(JI)V")
    public static final void method879(long arg0, int arg1) {
        ++field2170;
        try {
            if (arg1 == 2) {
                Thread.sleep(arg0);
            }
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(Z)V")
    public static void method880(boolean arg0) {
        field2181 = null;
        field2171 = null;
        field2178 = null;
        field2180 = null;
        field2179 = null;
        field2169 = null;
        if (!arg0) {
            field2171 = null;
        }
        field2177 = null;
        field2166 = null;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIJ[I)Lqj;")
    public static final class196 method881(int arg0, int arg1, long arg2, int[] arg3) {
        ++field2174;
        if (class33.field403 != null) {
            class196 var5 = class33.field403.method184(arg1, arg2, arg3, true);
            if (var5 != null) {
                return var5;
            }
        }
        if (arg0 > -23) {
            field2179 = null;
        }
        return ~arg1 == -6 ? client.method627(arg2, (byte) -127).method1307(-118) : class3.method12(arg2, 10);
    }
}
