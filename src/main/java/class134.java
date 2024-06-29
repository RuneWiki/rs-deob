import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class134 {

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "[I")
    public static int[] field2252 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!ro", name = "g", descriptor = "Z")
    public static boolean field2256 = false;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "I")
    public static int field2250;

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!ro", name = "d", descriptor = "I")
    public static int field2253;

    @OriginalMember(owner = "client!ro", name = "e", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!ro", name = "f", descriptor = "I")
    public static int field2255;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IZIIIIIIIZLic;)V", line = 13)
    public static final void method1023(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, class22 arg10) {
        field2253++;
        if (arg9 && !class215.method1621(25) && (class178.field2856[0][arg8][arg7] & 0x2) == 0) {
            if ((class178.field2856[arg3][arg8][arg7] & 0x10) != 0) {
                return;
            }
            if (class90.method718(arg7, arg2 + 1, arg8, arg3) != class344.field5468) {
                return;
            }
        }
        if (arg3 < class123.field2108) {
            class123.field2108 = arg3;
        }
        class29 var11 = class166.method1292(0, arg0);
        if (class42.field607 && var11.field369) {
            return;
        }
        int var12;
        int var13;
        if (arg2 == arg5 || arg5 == 3) {
            var13 = var11.field414;
            var12 = var11.field342;
        } else {
            var12 = var11.field414;
            var13 = var11.field342;
        }
        int var14;
        int var15;
        if (arg8 + var12 > 104) {
            var14 = arg8;
            var15 = arg8 + 1;
        } else {
            var15 = arg8 + (var12 + 1 >> 1);
            var14 = (var12 >> 1) + arg8;
        }
        int var16;
        int var17;
        if (arg7 + var13 > 104) {
            var16 = arg7;
            var17 = arg7 + 1;
        } else {
            var16 = arg7 + (var13 >> 1);
            var17 = arg7 + (var13 + 1 >> 1);
        }
        int[][] var18 = class101.field1656[arg6];
        int var19 = (arg8 << 7) + (var12 << 6);
        int var20 = (arg7 << 7) + (var13 << 6);
        int var21 = var18[var14][var16] + var18[var15][var16] - (-var18[var14][var17] + -var18[var15][var17]) >> 2;
        int var22 = 0;
        if (class42.field607 && arg6 != 0) {
            int[][] var23 = class101.field1656[0];
            var22 = var21 - (var23[var14][var16] + var23[var14][var17] + var23[var15][var16] + var23[var15][var17] >> 2);
        }
        long var24 = (long) (arg5 << 20 | arg4 << 14 | arg8 | arg7 << 7 | 0x40000000);
        int[][] var26 = (int[][]) null;
        if (var11.field384 == 0 || arg1) {
            var24 |= Long.MIN_VALUE;
        }
        if (arg1) {
            var26 = class208.field3270[0];
        } else if (arg6 < 3) {
            var26 = class101.field1656[arg6 + 1];
        }
        if (var11.field411 == 1) {
            var24 |= 0x400000L;
        }
        if (var11.field358) {
            var24 |= 0x80000000L;
        }
        long var27 = var24 | (long) arg0 << 32;
        if (var11.method181(arg2 ^ 0x1)) {
            class340.method2386(arg5, (class288) null, 0, arg3, arg8, (byte) -121, var11, (class258) null, arg7);
        }
        boolean var29 = var11.field391 & !arg1;
        if (arg4 == 22) {
            if (class292.field4726 || var11.field384 != 0 || var11.field371 == 1 || var11.field338) {
                class161 var77;
                if (var11.field337 == -1 && var11.field375 == null && var11.field418 == null && !var11.field353) {
                    class296 var76 = var11.method179((class341) null, var18, arg9, var26, 22, var29, var19, arg5, var20, var21, 32227);
                    if (class42.field607 && var29) {
                        class249.method1927(var76.field4762, var19, var22, var20);
                    }
                    var77 = var76.field4765;
                } else {
                    var77 = new class56(arg0, 22, arg5, arg6, arg8, arg7, -1, var11.field343, (class161) null);
                }
                class26.method167(arg3, arg8, arg7, var21, var77, var27, var11.field413);
                if (var11.field371 == 1 && arg10 != null) {
                    arg10.method132(arg8, arg7, arg2 ^ 0x2C0109);
                }
            }
        } else if (arg4 == 10 || arg4 == 11) {
            class161 var71;
            if (var11.field337 == -1 && var11.field375 == null && var11.field418 == null && !var11.field353) {
                class296 var70 = var11.method179((class341) null, var18, arg9, var26, 10, var29, var19, arg4 == 11 ? arg5 + 4 : arg5, var20, var21, 32227);
                if (class42.field607 && var29) {
                    class249.method1927(var70.field4762, var19, var22, var20);
                }
                var71 = var70.field4765;
            } else {
                var71 = new class56(arg0, 10, arg4 == 11 ? arg5 + 4 : arg5, arg6, arg8, arg7, -1, var11.field343, (class161) null);
            }
            if (var71 != null) {
                boolean var72 = class348.method2438(arg3, arg8, arg7, var21, var12, var13, var71, 0, var27);
                if (var11.field400 && var72 && arg9) {
                    int var73 = 15;
                    if (var71 instanceof class96) {
                        var73 = ((class96) var71).method539() / 4;
                        if (var73 > 30) {
                            var73 = 30;
                        }
                    }
                    for (int var74 = 0; var74 <= var12; var74++) {
                        for (int var75 = 0; var75 <= var13; var75++) {
                            if (var73 > class74.field1267[arg3][arg8 + var74][arg7 + var75]) {
                                class74.field1267[arg3][arg8 + var74][arg7 + var75] = (byte) var73;
                            }
                        }
                    }
                }
            }
            if (var11.field371 != 0 && arg10 != null) {
                arg10.method135(arg7, var11.field420, arg8, var12, var13, 18377, !var11.field365);
            }
        } else if (arg4 >= 12) {
            class161 var31;
            if (var11.field337 == -1 && var11.field375 == null && var11.field418 == null && !var11.field353) {
                class296 var30 = var11.method179((class341) null, var18, arg9, var26, arg4, var29, var19, arg5, var20, var21, arg2 + 32226);
                if (class42.field607 && var29) {
                    class249.method1927(var30.field4762, var19, var22, var20);
                }
                var31 = var30.field4765;
            } else {
                var31 = new class56(arg0, arg4, arg5, arg6, arg8, arg7, -1, var11.field343, (class161) null);
            }
            class348.method2438(arg3, arg8, arg7, var21, 1, 1, var31, 0, var27);
            if (arg9 && arg4 >= 12 && arg4 <= 17 && arg4 != 13 && arg3 > 0 && var11.field374 != 0) {
                class336.field5320[arg3][arg8][arg7] = class75.method624(class336.field5320[arg3][arg8][arg7], 4);
            }
            if (var11.field371 != 0 && arg10 != null) {
                arg10.method135(arg7, var11.field420, arg8, var12, var13, arg2 ^ 0x47C8, !var11.field365);
            }
        } else if (arg4 == 0) {
            class161 var33;
            if (var11.field337 == -1 && var11.field375 == null && var11.field418 == null && !var11.field353) {
                class296 var32 = var11.method179((class341) null, var18, arg9, var26, 0, var29, var19, arg5, var20, var21, 32227);
                if (class42.field607 && var29) {
                    class249.method1927(var32.field4762, var19, var22, var20);
                }
                var33 = var32.field4765;
            } else {
                var33 = new class56(arg0, 0, arg5, arg6, arg8, arg7, -1, var11.field343, (class161) null);
            }
            class102.method793(arg3, arg8, arg7, var21, var33, (class161) null, class309.field4923[arg5], 0, var27);
            if (arg9) {
                if (arg5 == 0) {
                    if (var11.field400) {
                        class74.field1267[arg3][arg8][arg7] = 50;
                        class74.field1267[arg3][arg8][arg7 + 1] = 50;
                    }
                    if (var11.field374 == 1) {
                        class336.field5320[arg3][arg8][arg7] = class75.method624(class336.field5320[arg3][arg8][arg7], 1);
                    }
                } else if (arg5 == 1) {
                    if (var11.field400) {
                        class74.field1267[arg3][arg8][arg7 + 1] = 50;
                        class74.field1267[arg3][arg8 + 1][arg7 + 1] = 50;
                    }
                    if (var11.field374 == 1) {
                        class336.field5320[arg3][arg8][arg7 + 1] = class75.method624(class336.field5320[arg3][arg8][arg7 + 1], 2);
                    }
                } else if (arg5 == 2) {
                    if (var11.field400) {
                        class74.field1267[arg3][arg8 + 1][arg7] = 50;
                        class74.field1267[arg3][arg8 + 1][arg7 + 1] = 50;
                    }
                    if (var11.field374 == 1) {
                        class336.field5320[arg3][arg8 + 1][arg7] = class75.method624(class336.field5320[arg3][arg8 + 1][arg7], 1);
                    }
                } else if (arg5 == 3) {
                    if (var11.field400) {
                        class74.field1267[arg3][arg8][arg7] = 50;
                        class74.field1267[arg3][arg8 + 1][arg7] = 50;
                    }
                    if (var11.field374 == 1) {
                        class336.field5320[arg3][arg8][arg7] = class75.method624(class336.field5320[arg3][arg8][arg7], 2);
                    }
                }
            }
            if (var11.field371 != 0 && arg10 != null) {
                arg10.method129(var11.field420, 1, arg5, arg7, arg4, arg8, !var11.field365);
            }
            if (var11.field409 != 16) {
                class236.method1811(arg3, arg8, arg7, var11.field409);
            }
        } else if (arg4 == 1) {
            class161 var35;
            if (var11.field337 == -1 && var11.field375 == null && var11.field418 == null && !var11.field353) {
                class296 var34 = var11.method179((class341) null, var18, arg9, var26, 1, var29, var19, arg5, var20, var21, 32227);
                if (class42.field607 && var29) {
                    class249.method1927(var34.field4762, var19, var22, var20);
                }
                var35 = var34.field4765;
            } else {
                var35 = new class56(arg0, 1, arg5, arg6, arg8, arg7, -1, var11.field343, (class161) null);
            }
            class102.method793(arg3, arg8, arg7, var21, var35, (class161) null, class3.field37[arg5], 0, var27);
            if (var11.field400 && arg9) {
                if (arg5 == 0) {
                    class74.field1267[arg3][arg8][arg7 + 1] = 50;
                } else if (arg5 == 1) {
                    class74.field1267[arg3][arg8 + 1][arg7 + 1] = 50;
                } else if (arg5 == 2) {
                    class74.field1267[arg3][arg8 + 1][arg7] = 50;
                } else if (arg5 == 3) {
                    class74.field1267[arg3][arg8][arg7] = 50;
                }
            }
            if (var11.field371 != 0 && arg10 != null) {
                arg10.method129(var11.field420, 1, arg5, arg7, arg4, arg8, !var11.field365);
            }
        } else if (arg4 == 2) {
            int var65 = arg5 + 1 & 0x3;
            class161 var67;
            class161 var69;
            if (var11.field337 == -1 && var11.field375 == null && var11.field418 == null && !var11.field353) {
                class296 var66 = var11.method179((class341) null, var18, arg9, var26, 2, var29, var19, arg5 + 4, var20, var21, 32227);
                if (class42.field607 && var29) {
                    class249.method1927(var66.field4762, var19, var22, var20);
                }
                var67 = var66.field4765;
                class296 var68 = var11.method179((class341) null, var18, arg9, var26, 2, var29, var19, var65, var20, var21, 32227);
                if (class42.field607 && var29) {
                    class249.method1927(var68.field4762, var19, var22, var20);
                }
                var69 = var68.field4765;
            } else {
                var67 = new class56(arg0, 2, arg5 + 4, arg6, arg8, arg7, -1, var11.field343, (class161) null);
                var69 = new class56(arg0, 2, var65, arg6, arg8, arg7, -1, var11.field343, (class161) null);
            }
            class102.method793(arg3, arg8, arg7, var21, var67, var69, class309.field4923[arg5], class309.field4923[var65], var27);
            if (var11.field374 == 1 && arg9) {
                if (arg5 == 0) {
                    class336.field5320[arg3][arg8][arg7] = class75.method624(class336.field5320[arg3][arg8][arg7], 1);
                    class336.field5320[arg3][arg8][arg7 + 1] = class75.method624(class336.field5320[arg3][arg8][arg7 + 1], 2);
                } else if (arg5 == 1) {
                    class336.field5320[arg3][arg8][arg7 + 1] = class75.method624(class336.field5320[arg3][arg8][arg7 + 1], 2);
                    class336.field5320[arg3][arg8 + 1][arg7] = class75.method624(class336.field5320[arg3][arg8 + 1][arg7], 1);
                } else if (arg5 == 2) {
                    class336.field5320[arg3][arg8 + 1][arg7] = class75.method624(class336.field5320[arg3][arg8 + 1][arg7], 1);
                    class336.field5320[arg3][arg8][arg7] = class75.method624(class336.field5320[arg3][arg8][arg7], 2);
                } else if (arg5 == 3) {
                    class336.field5320[arg3][arg8][arg7] = class75.method624(class336.field5320[arg3][arg8][arg7], 2);
                    class336.field5320[arg3][arg8][arg7] = class75.method624(class336.field5320[arg3][arg8][arg7], 1);
                }
            }
            if (var11.field371 != 0 && arg10 != null) {
                arg10.method129(var11.field420, arg2, arg5, arg7, arg4, arg8, !var11.field365);
            }
            if (var11.field409 != 16) {
                class236.method1811(arg3, arg8, arg7, var11.field409);
            }
        } else if (arg4 == 3) {
            class161 var64;
            if (var11.field337 == -1 && var11.field375 == null && var11.field418 == null && !var11.field353) {
                class296 var63 = var11.method179((class341) null, var18, arg9, var26, 3, var29, var19, arg5, var20, var21, arg2 + 32226);
                if (class42.field607 && var29) {
                    class249.method1927(var63.field4762, var19, var22, var20);
                }
                var64 = var63.field4765;
            } else {
                var64 = new class56(arg0, 3, arg5, arg6, arg8, arg7, -1, var11.field343, (class161) null);
            }
            class102.method793(arg3, arg8, arg7, var21, var64, (class161) null, class3.field37[arg5], 0, var27);
            if (var11.field400 && arg9) {
                if (arg5 == 0) {
                    class74.field1267[arg3][arg8][arg7 + 1] = 50;
                } else if (arg5 == 1) {
                    class74.field1267[arg3][arg8 + 1][arg7 + 1] = 50;
                } else if (arg5 == 2) {
                    class74.field1267[arg3][arg8 + 1][arg7] = 50;
                } else if (arg5 == 3) {
                    class74.field1267[arg3][arg8][arg7] = 50;
                }
            }
            if (var11.field371 != 0 && arg10 != null) {
                arg10.method129(var11.field420, 1, arg5, arg7, arg4, arg8, !var11.field365);
            }
        } else if (arg4 == 9) {
            class161 var62;
            if (var11.field337 == -1 && var11.field375 == null && var11.field418 == null && !var11.field353) {
                class296 var61 = var11.method179((class341) null, var18, arg9, var26, arg4, var29, var19, arg5, var20, var21, 32227);
                if (class42.field607 && var29) {
                    class249.method1927(var61.field4762, var19, var22, var20);
                }
                var62 = var61.field4765;
            } else {
                var62 = new class56(arg0, arg4, arg5, arg6, arg8, arg7, -1, var11.field343, (class161) null);
            }
            class348.method2438(arg3, arg8, arg7, var21, 1, 1, var62, 0, var27);
            if (var11.field371 != 0 && arg10 != null) {
                arg10.method135(arg7, var11.field420, arg8, var12, var13, 18377, !var11.field365);
            }
            if (var11.field409 != 16) {
                class236.method1811(arg3, arg8, arg7, var11.field409);
            }
        } else if (arg4 == 4) {
            class161 var37;
            if (var11.field337 == -1 && var11.field375 == null && var11.field418 == null && !var11.field353) {
                class296 var36 = var11.method179((class341) null, var18, arg9, var26, 4, var29, var19, arg5, var20, var21, arg2 ^ 0x7DE2);
                if (class42.field607 && var29) {
                    class249.method1927(var36.field4762, var19, var22, var20);
                }
                var37 = var36.field4765;
            } else {
                var37 = new class56(arg0, 4, arg5, arg6, arg8, arg7, -1, var11.field343, (class161) null);
            }
            class142.method1095(arg3, arg8, arg7, var21, var37, (class161) null, class309.field4923[arg5], 0, 0, 0, var27);
        } else if (arg4 == 5) {
            int var56 = 16;
            long var57 = class252.method1955(arg3, arg8, arg7);
            if (var57 != 0L) {
                var56 = class166.method1292(0, (int) (var57 >>> 32) & Integer.MAX_VALUE).field409;
            }
            class161 var60;
            if (var11.field337 == -1 && var11.field375 == null && var11.field418 == null && !var11.field353) {
                class296 var59 = var11.method179((class341) null, var18, arg9, var26, 4, var29, var19, arg5, var20, var21, 32227);
                if (class42.field607 && var29) {
                    class249.method1927(var59.field4762, var19 - (class130.field2200[arg5] * 8), var22, var20 - (class253.field4275[arg5] * 8));
                }
                var60 = var59.field4765;
            } else {
                var60 = new class56(arg0, 4, arg5, arg6, arg8, arg7, -1, var11.field343, (class161) null);
            }
            class142.method1095(arg3, arg8, arg7, var21, var60, (class161) null, class309.field4923[arg5], 0, class130.field2200[arg5] * var56, class253.field4275[arg5] * var56, var27);
        } else if (arg4 == 6) {
            long var38 = class252.method1955(arg3, arg8, arg7);
            int var40 = 8;
            if (var38 != 0L) {
                var40 = class166.method1292(0, (int) (var38 >>> 32) & Integer.MAX_VALUE).field409 / 2;
            }
            class161 var42;
            if (var11.field337 == -1 && var11.field375 == null && var11.field418 == null && !var11.field353) {
                class296 var41 = var11.method179((class341) null, var18, arg9, var26, 4, var29, var19, arg5 + 4, var20, var21, 32227);
                if (class42.field607 && var29) {
                    class249.method1927(var41.field4762, var19 - (class190.field3045[arg5] * 8), var22, var20 - (class329.field5231[arg5] * 8));
                }
                var42 = var41.field4765;
            } else {
                var42 = new class56(arg0, 4, arg5 + 4, arg6, arg8, arg7, -1, var11.field343, (class161) null);
            }
            class142.method1095(arg3, arg8, arg7, var21, var42, (class161) null, 256, arg5, class190.field3045[arg5] * var40, class329.field5231[arg5] * var40, var27);
        } else if (arg4 == 7) {
            int var43 = arg5 + 2 & 0x3;
            class161 var45;
            if (var11.field337 == -1 && var11.field375 == null && var11.field418 == null && !var11.field353) {
                class296 var44 = var11.method179((class341) null, var18, arg9, var26, 4, var29, var19, var43 + 4, var20, var21, 32227);
                if (class42.field607 && var29) {
                    class249.method1927(var44.field4762, var19, var22, var20);
                }
                var45 = var44.field4765;
            } else {
                var45 = new class56(arg0, 4, var43 + 4, arg6, arg8, arg7, -1, var11.field343, (class161) null);
            }
            class142.method1095(arg3, arg8, arg7, var21, var45, (class161) null, 256, var43, 0, 0, var27);
        } else if (arg4 == 8) {
            int var46 = 8;
            long var47 = class252.method1955(arg3, arg8, arg7);
            if (var47 != 0L) {
                var46 = class166.method1292(arg2 ^ 0x1, Integer.MAX_VALUE & (int) (var47 >>> 32)).field409 / 2;
            }
            int var49 = arg5 + 2 & 0x3;
            class161 var53;
            class161 var55;
            if (var11.field337 == -1 && var11.field375 == null && var11.field418 == null && !var11.field353) {
                int var50 = class190.field3045[arg5] * 8;
                int var51 = class329.field5231[arg5] * 8;
                class296 var52 = var11.method179((class341) null, var18, arg9, var26, 4, var29, var19, arg5 + 4, var20, var21, arg2 + 32226);
                if (class42.field607 && var29) {
                    class249.method1927(var52.field4762, var19 - var50, var22, var20 - var51);
                }
                var53 = var52.field4765;
                class296 var54 = var11.method179((class341) null, var18, arg9, var26, 4, var29, var19, var49 + 4, var20, var21, arg2 ^ 0x7DE2);
                if (class42.field607 && var29) {
                    class249.method1927(var54.field4762, var19 - var50, var22, var20 - var51);
                }
                var55 = var54.field4765;
            } else {
                var53 = new class56(arg0, 4, arg5 + 4, arg6, arg8, arg7, -1, var11.field343, (class161) null);
                var55 = new class56(arg0, 4, var49 + 4, arg6, arg8, arg7, -1, var11.field343, (class161) null);
            }
            class142.method1095(arg3, arg8, arg7, var21, var53, var55, 256, arg5, class190.field3045[arg5] * var46, class329.field5231[arg5] * var46, var27);
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(ILjava/lang/String;)J", line = 653)
    public static final long method1024(int arg0, String arg1) {
        field2254++;
        long var2 = 0L;
        int var4 = arg1.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg1.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (long) (var6 + 1 - 65);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (long) (var6 + 1 - 97);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (long) (var6 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        if (arg0 != -25963) {
            field2250 = -60;
        }
        while ((var2 % 37L) == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(ILug;)V", line = 697)
    public static final void method1025(int arg0, class220 arg1) {
        arg1.field3546 = false;
        if (arg1.field3544 != -1) {
            class43 var2 = class198.method1524(arg1.field3544, -115);
            if (var2 == null || var2.field677 == null) {
                arg1.field3544 = -1;
            } else {
                arg1.field3489++;
                if (arg1.field3554 < var2.field677.length && arg1.field3489 > var2.field651[arg1.field3554]) {
                    arg1.field3489 = 1;
                    arg1.field3532++;
                    arg1.field3554++;
                    class334.method2338(class6.field55 == arg1, arg1.field3577, arg1.field3511, arg1.field3554, (byte) -13, var2);
                }
                if (var2.field677.length <= arg1.field3554) {
                    arg1.field3554 = 0;
                    arg1.field3489 = 0;
                    class334.method2338(class6.field55 == arg1, arg1.field3577, arg1.field3511, arg1.field3554, (byte) -13, var2);
                }
                arg1.field3532 = arg1.field3554 + 1;
                if (arg1.field3532 >= var2.field677.length) {
                    arg1.field3532 = 0;
                }
            }
        }
        field2251++;
        if (arg1.field3552 != arg0 && class332.field5261 >= arg1.field3500) {
            class94 var3 = class282.method2071(arg1.field3552, 0);
            int var4 = var3.field1594;
            if (var4 == -1) {
                arg1.field3552 = -1;
            } else {
                label308: {
                    class43 var5 = class198.method1524(var4, 118);
                    if (var3.field1591) {
                        if (var5.field656 == 3) {
                            if (arg1.field3491 > 0 && arg1.field3515 <= class332.field5261 && arg1.field3479 < class332.field5261) {
                                arg1.field3552 = -1;
                                break label308;
                            }
                        } else if (var5.field656 == 1 && arg1.field3491 > 0 && arg1.field3515 <= class332.field5261 && class332.field5261 > arg1.field3479) {
                            arg1.field3500 = class332.field5261 + 1;
                            break label308;
                        }
                    }
                    if (var5 == null || var5.field677 == null) {
                        arg1.field3552 = -1;
                    } else {
                        if (arg1.field3566 < 0) {
                            arg1.field3566 = 0;
                            class334.method2338(class6.field55 == arg1, arg1.field3577, arg1.field3511, 0, (byte) -13, var5);
                        }
                        arg1.field3527++;
                        if (var5.field677.length > arg1.field3566 && var5.field651[arg1.field3566] < arg1.field3527) {
                            arg1.field3566++;
                            arg1.field3527 = 1;
                            class334.method2338(class6.field55 == arg1, arg1.field3577, arg1.field3511, arg1.field3566, (byte) -13, var5);
                        }
                        if (var5.field677.length <= arg1.field3566) {
                            if (var3.field1591) {
                                arg1.field3537++;
                                arg1.field3566 -= var5.field661;
                                if (var5.field667 <= arg1.field3537) {
                                    arg1.field3552 = -1;
                                } else if (arg1.field3566 >= 0 && arg1.field3566 < var5.field677.length) {
                                    class334.method2338(class6.field55 == arg1, arg1.field3577, arg1.field3511, arg1.field3566, (byte) -13, var5);
                                } else {
                                    arg1.field3552 = -1;
                                }
                            } else {
                                arg1.field3552 = -1;
                            }
                        }
                        arg1.field3499 = arg1.field3566 + 1;
                        if (var5.field677.length <= arg1.field3499) {
                            if (var3.field1591) {
                                arg1.field3499 -= var5.field661;
                                if (arg1.field3537 + 1 >= var5.field667) {
                                    arg1.field3499 = -1;
                                } else if (arg1.field3499 < 0 || arg1.field3499 >= var5.field677.length) {
                                    arg1.field3499 = -1;
                                }
                            } else {
                                arg1.field3499 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field3547 != -1 && arg1.field3559 <= 1) {
            class43 var6 = class198.method1524(arg1.field3547, 126);
            if (var6.field656 == 3) {
                if (arg1.field3491 > 0 && class332.field5261 >= arg1.field3515 && arg1.field3479 < class332.field5261) {
                    arg1.field3547 = -1;
                }
            } else if (var6.field656 == 1 && arg1.field3491 > 0 && class332.field5261 >= arg1.field3515 && arg1.field3479 < class332.field5261) {
                arg1.field3559 = 2;
            }
        }
        if (arg1.field3547 != -1 && arg1.field3559 == 0) {
            class43 var7 = class198.method1524(arg1.field3547, -76);
            if (var7 == null || var7.field677 == null) {
                arg1.field3547 = -1;
            } else {
                arg1.field3558++;
                if (var7.field677.length > arg1.field3517 && var7.field651[arg1.field3517] < arg1.field3558) {
                    arg1.field3558 = 1;
                    arg1.field3517++;
                    class334.method2338(class6.field55 == arg1, arg1.field3577, arg1.field3511, arg1.field3517, (byte) -13, var7);
                }
                if (var7.field677.length <= arg1.field3517) {
                    arg1.field3517 -= var7.field661;
                    arg1.field3531++;
                    if (var7.field667 <= arg1.field3531) {
                        arg1.field3547 = -1;
                    } else if (arg1.field3517 >= 0 && var7.field677.length > arg1.field3517) {
                        class334.method2338(class6.field55 == arg1, arg1.field3577, arg1.field3511, arg1.field3517, (byte) -13, var7);
                    } else {
                        arg1.field3547 = -1;
                    }
                }
                arg1.field3576 = arg1.field3517 + 1;
                if (arg1.field3576 >= var7.field677.length) {
                    arg1.field3576 -= var7.field661;
                    if (var7.field667 <= (arg1.field3531 + 1)) {
                        arg1.field3576 = -1;
                    } else if (arg1.field3576 < 0 || arg1.field3576 >= var7.field677.length) {
                        arg1.field3576 = -1;
                    }
                }
                arg1.field3546 = var7.field655;
            }
        }
        if (arg1.field3559 > 0) {
            arg1.field3559--;
        }
        for (int var8 = 0; var8 < arg1.field3539.length; var8++) {
            class194 var9 = arg1.field3539[var8];
            if (var9 != null) {
                if (var9.field3090 > 0) {
                    var9.field3090--;
                } else {
                    class43 var10 = class198.method1524(var9.field3092, -123);
                    if (var10 == null || var10.field677 == null) {
                        arg1.field3539[var8] = null;
                    } else {
                        var9.field3091++;
                        if (var9.field3089 < var10.field677.length && var10.field651[var9.field3089] < var9.field3091) {
                            var9.field3091 = 1;
                            var9.field3089++;
                            class334.method2338(class6.field55 == arg1, arg1.field3577, arg1.field3511, var9.field3089, (byte) -13, var10);
                        }
                        if (var10.field677.length <= var9.field3089) {
                            var9.field3089 -= var10.field661;
                            var9.field3088++;
                            if (var9.field3088 >= var10.field667) {
                                arg1.field3539[var8] = null;
                            } else if (var9.field3089 >= 0 && var9.field3089 < var10.field677.length) {
                                class334.method2338(class6.field55 == arg1, arg1.field3577, arg1.field3511, var9.field3089, (byte) -13, var10);
                            } else {
                                arg1.field3539[var8] = null;
                            }
                        }
                        var9.field3087 = var9.field3089 + 1;
                        if (var9.field3087 >= var10.field677.length) {
                            var9.field3087 -= var10.field661;
                            if ((var9.field3088 + 1) >= var10.field667) {
                                var9.field3087 = -1;
                            } else if (var9.field3087 < 0 || var9.field3087 >= var10.field677.length) {
                                var9.field3087 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(Z)V", line = 1011)
    public static void method1026(boolean arg0) {
        field2252 = null;
        if (!arg0) {
            method1023(118, false, 103, -23, 47, -126, 44, -124, -80, true, (class22) null);
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "([SBII[Ljava/lang/String;)V", line = 1021)
    public static final void method1027(short[] arg0, byte arg1, int arg2, int arg3, String[] arg4) {
        field2255++;
        if (arg1 != -77) {
            field2250 = -116;
        }
        if (arg2 <= arg3) {
            return;
        }
        int var5 = (arg3 + arg2) / 2;
        int var6 = arg3;
        String var7 = arg4[var5];
        arg4[var5] = arg4[arg2];
        arg4[arg2] = var7;
        short var8 = arg0[var5];
        arg0[var5] = arg0[arg2];
        arg0[arg2] = var8;
        for (int var9 = arg3; var9 < arg2; var9++) {
            if (var7 == null || arg4[var9] != null && arg4[var9].compareTo(var7) < (var9 & 0x1)) {
                String var10 = arg4[var9];
                arg4[var9] = arg4[var6];
                arg4[var6] = var10;
                short var11 = arg0[var9];
                arg0[var9] = arg0[var6];
                arg0[var6++] = var11;
            }
        }
        arg4[arg2] = arg4[var6];
        arg4[var6] = var7;
        arg0[arg2] = arg0[var6];
        arg0[var6] = var8;
        method1027(arg0, (byte) -77, var6 - 1, arg3, arg4);
        method1027(arg0, (byte) -77, arg2, var6 + 1, arg4);
    }
}
