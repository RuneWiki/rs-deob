import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class137 extends class128 {

    @OriginalMember(owner = "client!nb", name = "s", descriptor = "I")
    public static volatile int field2165 = 0;

    @OriginalMember(owner = "client!nb", name = "r", descriptor = "Lqd;")
    public static class173 field2164 = new class173(64);

    @OriginalMember(owner = "client!nb", name = "E", descriptor = "[Ljava/lang/String;")
    public static String[] field2177 = new String[100];

    @OriginalMember(owner = "client!nb", name = "F", descriptor = "[I")
    public static int[] field2178 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!nb", name = "C", descriptor = "I")
    public static int field2175 = 0;

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "I")
    public static int field2159;

    @OriginalMember(owner = "client!nb", name = "n", descriptor = "I")
    public static int field2160;

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "I")
    public static int field2161;

    @OriginalMember(owner = "client!nb", name = "p", descriptor = "I")
    public static int field2162;

    @OriginalMember(owner = "client!nb", name = "t", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!nb", name = "u", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!nb", name = "x", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!nb", name = "z", descriptor = "I")
    public static int field2172;

    @OriginalMember(owner = "client!nb", name = "B", descriptor = "I")
    public static int field2174;

    @OriginalMember(owner = "client!nb", name = "D", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!nb", name = "w", descriptor = "J")
    public long field2169;

    @OriginalMember(owner = "client!nb", name = "q", descriptor = "Lnb;")
    public class137 field2163;

    @OriginalMember(owner = "client!nb", name = "A", descriptor = "Lnb;")
    public class137 field2173;

    @OriginalMember(owner = "client!nb", name = "y", descriptor = "Ldk;")
    public static class251 field2171;

    @OriginalMember(owner = "client!nb", name = "v", descriptor = "[Lsa;")
    public static class260[] field2168;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "(I)V")
    public final void method956(int arg0) {
        field2160++;
        if (this.field2163 != null && arg0 == 256) {
            this.field2163.field2173 = this.field2173;
            this.field2173.field2163 = this.field2163;
            this.field2163 = null;
            this.field2173 = null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IZIIIZIBILpk;I)V")
    public static final void method957(int arg0, boolean arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, byte arg7, int arg8, class44 arg9, int arg10) {
        field2170++;
        if (arg5 && !class129.method918(false) && (class301.field4818[0][arg2][arg8] & 0x2) == 0) {
            if ((class301.field4818[arg10][arg2][arg8] & 0x10) != 0) {
                return;
            }
            if (class131.method926((byte) -86, arg8, arg2, arg10) != class287.field4606) {
                return;
            }
        }
        if (class55.field905 > arg10) {
            class55.field905 = arg10;
        }
        class158 var11 = class5.method29(arg3, true);
        int var12;
        int var13;
        if (arg0 == 1 || arg0 == 3) {
            var12 = var11.field2507;
            var13 = var11.field2487;
        } else {
            var12 = var11.field2487;
            var13 = var11.field2507;
        }
        int var14;
        int var15;
        if (arg2 + var13 > 104) {
            var14 = arg2;
            var15 = arg2 + 1;
        } else {
            var14 = (var13 >> 1) + arg2;
            var15 = (var13 + 1 >> 1) + arg2;
        }
        int var16;
        int var17;
        if (arg8 + var12 <= 104) {
            var16 = arg8 + (var12 >> 1);
            var17 = (var12 + 1 >> 1) + arg8;
        } else {
            var17 = arg8 + 1;
            var16 = arg8;
        }
        int[][] var18 = class267.field4304[arg6];
        int var19 = var18[var14][var16] + var18[var15][var16] + var18[var14][var17] + var18[var15][var17] >> 2;
        int var20 = (arg2 << 7) + (var13 << 6);
        int var21 = (arg8 << 7) + (var12 << 6);
        int[][] var22 = null;
        long var23 = (long) (arg4 << 14 | arg2 | arg8 << 7 | arg0 << 20 | 0x40000000);
        if (arg1) {
            var22 = class148.field2320[0];
        } else if (arg6 < 3) {
            var22 = class267.field4304[arg6 + 1];
        }
        if (var11.field2467 == 0 || arg1) {
            var23 |= Long.MIN_VALUE;
        }
        if (var11.field2524 == 1) {
            var23 |= 0x400000L;
        }
        if (var11.field2502) {
            var23 |= 0x80000000L;
        }
        long var25 = var23 | (long) arg3 << 32;
        if (var11.method1084(126)) {
            class267.method1797((byte) -94, arg0, (class131) null, arg10, arg8, arg2, (class299) null, var11, 0);
        }
        boolean var27 = !arg1 & var11.field2520;
        if (arg4 != 22) {
            if (arg7 != 3) {
                field2165 = 127;
            }
            if (arg4 == 10 || arg4 == 11) {
                class2 var69;
                if (var11.field2481 == -1 && var11.field2447 == null && var11.field2448 == null && !var11.field2462) {
                    class123 var68 = var11.method1075(-128, 10, var21, var20, (class260) null, arg4 == 11 ? arg0 + 4 : arg0, var27, arg5, var22, var18, var19);
                    var69 = var68.field1951;
                } else {
                    var69 = new class81(arg3, 10, arg4 == 11 ? arg0 + 4 : arg0, arg6, arg2, arg8, -1, var11.field2500, (class2) null);
                }
                if (var69 != null) {
                    boolean var70 = class204.method1426(arg10, arg2, arg8, var19, var13, var12, var69, 0, var25);
                    if (var11.field2457 && var70 && arg5) {
                        int var71 = 15;
                        if (var69 instanceof class37) {
                            var71 = ((class37) var69).method185() / 4;
                            if (var71 > 30) {
                                var71 = 30;
                            }
                        }
                        for (int var72 = 0; var72 <= var13; var72++) {
                            for (int var73 = 0; var73 <= var12; var73++) {
                                if (var71 > class224.field3644[arg10][arg2 + var72][arg8 + var73]) {
                                    class224.field3644[arg10][arg2 + var72][arg8 + var73] = (byte) var71;
                                }
                            }
                        }
                    }
                }
                if (var11.field2514 != 0 && arg9 != null) {
                    arg9.method303(arg2, 1073741824, var11.field2493, arg8, var13, var12, !var11.field2486);
                }
            } else if (arg4 >= 12) {
                class2 var31;
                if (var11.field2481 == -1 && var11.field2447 == null && var11.field2448 == null && !var11.field2462) {
                    class123 var30 = var11.method1075(19, arg4, var21, var20, (class260) null, arg0, var27, arg5, var22, var18, var19);
                    var31 = var30.field1951;
                } else {
                    var31 = new class81(arg3, arg4, arg0, arg6, arg2, arg8, -1, var11.field2500, (class2) null);
                }
                class204.method1426(arg10, arg2, arg8, var19, 1, 1, var31, 0, var25);
                if (arg5 && arg4 >= 12 && arg4 <= 17 && arg4 != 13 && arg10 > 0 && var11.field2451 != 0) {
                    class293.field4703[arg10][arg2][arg8] = class173.method1263(class293.field4703[arg10][arg2][arg8], 4);
                }
                if (var11.field2514 != 0 && arg9 != null) {
                    arg9.method303(arg2, arg7 + 1073741821, var11.field2493, arg8, var13, var12, !var11.field2486);
                }
            } else if (arg4 == 0) {
                class2 var33;
                if (var11.field2481 == -1 && var11.field2447 == null && var11.field2448 == null && !var11.field2462) {
                    class123 var32 = var11.method1075(108, 0, var21, var20, (class260) null, arg0, var27, arg5, var22, var18, var19);
                    var33 = var32.field1951;
                } else {
                    var33 = new class81(arg3, 0, arg0, arg6, arg2, arg8, -1, var11.field2500, (class2) null);
                }
                class282.method1895(arg10, arg2, arg8, var19, var33, (class2) null, class17.field207[arg0], 0, var25);
                if (arg5) {
                    if (arg0 == 0) {
                        if (var11.field2457) {
                            class224.field3644[arg10][arg2][arg8] = 50;
                            class224.field3644[arg10][arg2][arg8 + 1] = 50;
                        }
                        if (var11.field2451 == 1) {
                            class293.field4703[arg10][arg2][arg8] = class173.method1263(class293.field4703[arg10][arg2][arg8], 1);
                        }
                    } else if (arg0 == 1) {
                        if (var11.field2457) {
                            class224.field3644[arg10][arg2][arg8 + 1] = 50;
                            class224.field3644[arg10][arg2 + 1][arg8 + 1] = 50;
                        }
                        if (var11.field2451 == 1) {
                            class293.field4703[arg10][arg2][arg8 + 1] = class173.method1263(class293.field4703[arg10][arg2][arg8 + 1], 2);
                        }
                    } else if (arg0 == 2) {
                        if (var11.field2457) {
                            class224.field3644[arg10][arg2 + 1][arg8] = 50;
                            class224.field3644[arg10][arg2 + 1][arg8 + 1] = 50;
                        }
                        if (var11.field2451 == 1) {
                            class293.field4703[arg10][arg2 + 1][arg8] = class173.method1263(class293.field4703[arg10][arg2 + 1][arg8], 1);
                        }
                    } else if (arg0 == 3) {
                        if (var11.field2457) {
                            class224.field3644[arg10][arg2][arg8] = 50;
                            class224.field3644[arg10][arg2 + 1][arg8] = 50;
                        }
                        if (var11.field2451 == 1) {
                            class293.field4703[arg10][arg2][arg8] = class173.method1263(class293.field4703[arg10][arg2][arg8], 2);
                        }
                    }
                }
                if (var11.field2514 != 0 && arg9 != null) {
                    arg9.method306(false, arg2, var11.field2493, arg0, arg4, arg8, !var11.field2486);
                }
                if (var11.field2491 != 16) {
                    class132.method936(arg10, arg2, arg8, var11.field2491);
                }
            } else if (arg4 == 1) {
                class2 var35;
                if (var11.field2481 == -1 && var11.field2447 == null && var11.field2448 == null && !var11.field2462) {
                    class123 var34 = var11.method1075(112, 1, var21, var20, (class260) null, arg0, var27, arg5, var22, var18, var19);
                    var35 = var34.field1951;
                } else {
                    var35 = new class81(arg3, 1, arg0, arg6, arg2, arg8, -1, var11.field2500, (class2) null);
                }
                class282.method1895(arg10, arg2, arg8, var19, var35, (class2) null, class204.field3247[arg0], 0, var25);
                if (var11.field2457 && arg5) {
                    if (arg0 == 0) {
                        class224.field3644[arg10][arg2][arg8 + 1] = 50;
                    } else if (arg0 == 1) {
                        class224.field3644[arg10][arg2 + 1][arg8 + 1] = 50;
                    } else if (arg0 == 2) {
                        class224.field3644[arg10][arg2 + 1][arg8] = 50;
                    } else if (arg0 == 3) {
                        class224.field3644[arg10][arg2][arg8] = 50;
                    }
                }
                if (var11.field2514 != 0 && arg9 != null) {
                    arg9.method306(false, arg2, var11.field2493, arg0, arg4, arg8, !var11.field2486);
                }
            } else if (arg4 == 2) {
                int var36 = arg0 + 1 & 0x3;
                class2 var38;
                class2 var40;
                if (var11.field2481 == -1 && var11.field2447 == null && var11.field2448 == null && !var11.field2462) {
                    class123 var37 = var11.method1075(87, 2, var21, var20, (class260) null, arg0 + 4, var27, arg5, var22, var18, var19);
                    var38 = var37.field1951;
                    class123 var39 = var11.method1075(27, 2, var21, var20, (class260) null, var36, var27, arg5, var22, var18, var19);
                    var40 = var39.field1951;
                } else {
                    var38 = new class81(arg3, 2, arg0 + 4, arg6, arg2, arg8, -1, var11.field2500, (class2) null);
                    var40 = new class81(arg3, 2, var36, arg6, arg2, arg8, -1, var11.field2500, (class2) null);
                }
                class282.method1895(arg10, arg2, arg8, var19, var38, var40, class17.field207[arg0], class17.field207[var36], var25);
                if (var11.field2451 == 1 && arg5) {
                    if (arg0 == 0) {
                        class293.field4703[arg10][arg2][arg8] = class173.method1263(class293.field4703[arg10][arg2][arg8], 1);
                        class293.field4703[arg10][arg2][arg8 + 1] = class173.method1263(class293.field4703[arg10][arg2][arg8 + 1], 2);
                    } else if (arg0 == 1) {
                        class293.field4703[arg10][arg2][arg8 + 1] = class173.method1263(class293.field4703[arg10][arg2][arg8 + 1], 2);
                        class293.field4703[arg10][arg2 + 1][arg8] = class173.method1263(class293.field4703[arg10][arg2 + 1][arg8], 1);
                    } else if (arg0 == 2) {
                        class293.field4703[arg10][arg2 + 1][arg8] = class173.method1263(class293.field4703[arg10][arg2 + 1][arg8], 1);
                        class293.field4703[arg10][arg2][arg8] = class173.method1263(class293.field4703[arg10][arg2][arg8], 2);
                    } else if (arg0 == 3) {
                        class293.field4703[arg10][arg2][arg8] = class173.method1263(class293.field4703[arg10][arg2][arg8], 2);
                        class293.field4703[arg10][arg2][arg8] = class173.method1263(class293.field4703[arg10][arg2][arg8], 1);
                    }
                }
                if (var11.field2514 != 0 && arg9 != null) {
                    arg9.method306(false, arg2, var11.field2493, arg0, arg4, arg8, !var11.field2486);
                }
                if (var11.field2491 != 16) {
                    class132.method936(arg10, arg2, arg8, var11.field2491);
                }
            } else if (arg4 == 3) {
                class2 var42;
                if (var11.field2481 == -1 && var11.field2447 == null && var11.field2448 == null && !var11.field2462) {
                    class123 var41 = var11.method1075(-109, 3, var21, var20, (class260) null, arg0, var27, arg5, var22, var18, var19);
                    var42 = var41.field1951;
                } else {
                    var42 = new class81(arg3, 3, arg0, arg6, arg2, arg8, -1, var11.field2500, (class2) null);
                }
                class282.method1895(arg10, arg2, arg8, var19, var42, (class2) null, class204.field3247[arg0], 0, var25);
                if (var11.field2457 && arg5) {
                    if (arg0 == 0) {
                        class224.field3644[arg10][arg2][arg8 + 1] = 50;
                    } else if (arg0 == 1) {
                        class224.field3644[arg10][arg2 + 1][arg8 + 1] = 50;
                    } else if (arg0 == 2) {
                        class224.field3644[arg10][arg2 + 1][arg8] = 50;
                    } else if (arg0 == 3) {
                        class224.field3644[arg10][arg2][arg8] = 50;
                    }
                }
                if (var11.field2514 != 0 && arg9 != null) {
                    arg9.method306(false, arg2, var11.field2493, arg0, arg4, arg8, !var11.field2486);
                }
            } else if (arg4 == 9) {
                class2 var44;
                if (var11.field2481 == -1 && var11.field2447 == null && var11.field2448 == null && !var11.field2462) {
                    class123 var43 = var11.method1075(-123, arg4, var21, var20, (class260) null, arg0, var27, arg5, var22, var18, var19);
                    var44 = var43.field1951;
                } else {
                    var44 = new class81(arg3, arg4, arg0, arg6, arg2, arg8, -1, var11.field2500, (class2) null);
                }
                class204.method1426(arg10, arg2, arg8, var19, 1, 1, var44, 0, var25);
                if (var11.field2514 != 0 && arg9 != null) {
                    arg9.method303(arg2, 1073741824, var11.field2493, arg8, var13, var12, !var11.field2486);
                }
                if (var11.field2491 != 16) {
                    class132.method936(arg10, arg2, arg8, var11.field2491);
                }
            } else if (arg4 == 4) {
                class2 var46;
                if (var11.field2481 == -1 && var11.field2447 == null && var11.field2448 == null && !var11.field2462) {
                    class123 var45 = var11.method1075(4, 4, var21, var20, (class260) null, arg0, var27, arg5, var22, var18, var19);
                    var46 = var45.field1951;
                } else {
                    var46 = new class81(arg3, 4, arg0, arg6, arg2, arg8, -1, var11.field2500, (class2) null);
                }
                class43.method289(arg10, arg2, arg8, var19, var46, (class2) null, class17.field207[arg0], 0, 0, 0, var25);
            } else if (arg4 == 5) {
                int var47 = 16;
                long var48 = class276.method1861(arg10, arg2, arg8);
                if (var48 != 0L) {
                    var47 = class5.method29((int) (var48 >>> 32) & Integer.MAX_VALUE, true).field2491;
                }
                class2 var51;
                if (var11.field2481 == -1 && var11.field2447 == null && var11.field2448 == null && !var11.field2462) {
                    class123 var50 = var11.method1075(-117, 4, var21, var20, (class260) null, arg0, var27, arg5, var22, var18, var19);
                    var51 = var50.field1951;
                } else {
                    var51 = new class81(arg3, 4, arg0, arg6, arg2, arg8, -1, var11.field2500, (class2) null);
                }
                class43.method289(arg10, arg2, arg8, var19, var51, (class2) null, class17.field207[arg0], 0, class34.field512[arg0] * var47, class130.field2035[arg0] * var47, var25);
            } else if (arg4 == 6) {
                int var52 = 8;
                long var53 = class276.method1861(arg10, arg2, arg8);
                if (var53 != 0L) {
                    var52 = class5.method29((int) (var53 >>> 32) & Integer.MAX_VALUE, true).field2491 / 2;
                }
                class2 var56;
                if (var11.field2481 == -1 && var11.field2447 == null && var11.field2448 == null && !var11.field2462) {
                    class123 var55 = var11.method1075(41, 4, var21, var20, (class260) null, arg0 + 4, var27, arg5, var22, var18, var19);
                    var56 = var55.field1951;
                } else {
                    var56 = new class81(arg3, 4, arg0 + 4, arg6, arg2, arg8, -1, var11.field2500, (class2) null);
                }
                class43.method289(arg10, arg2, arg8, var19, var56, (class2) null, 256, arg0, class69.field1151[arg0] * var52, class43.field646[arg0] * var52, var25);
            } else if (arg4 == 7) {
                int var57 = arg0 + 2 & 0x3;
                class2 var59;
                if (var11.field2481 == -1 && var11.field2447 == null && var11.field2448 == null && !var11.field2462) {
                    class123 var58 = var11.method1075(110, 4, var21, var20, (class260) null, var57 + 4, var27, arg5, var22, var18, var19);
                    var59 = var58.field1951;
                } else {
                    var59 = new class81(arg3, 4, var57 + 4, arg6, arg2, arg8, -1, var11.field2500, (class2) null);
                }
                class43.method289(arg10, arg2, arg8, var19, var59, (class2) null, 256, var57, 0, 0, var25);
            } else if (arg4 == 8) {
                int var60 = 8;
                long var61 = class276.method1861(arg10, arg2, arg8);
                if (var61 != 0L) {
                    var60 = class5.method29((int) (var61 >>> 32) & Integer.MAX_VALUE, true).field2491 / 2;
                }
                int var63 = arg0 + 2 & 0x3;
                class2 var65;
                class2 var67;
                if (var11.field2481 == -1 && var11.field2447 == null && var11.field2448 == null && !var11.field2462) {
                    class123 var64 = var11.method1075(120, 4, var21, var20, (class260) null, arg0 + 4, var27, arg5, var22, var18, var19);
                    var65 = var64.field1951;
                    class123 var66 = var11.method1075(39, 4, var21, var20, (class260) null, var63 + 4, var27, arg5, var22, var18, var19);
                    var67 = var66.field1951;
                } else {
                    var65 = new class81(arg3, 4, arg0 + 4, arg6, arg2, arg8, -1, var11.field2500, (class2) null);
                    var67 = new class81(arg3, 4, var63 + 4, arg6, arg2, arg8, -1, var11.field2500, (class2) null);
                }
                class43.method289(arg10, arg2, arg8, var19, var65, var67, 256, arg0, class69.field1151[arg0] * var60, class43.field646[arg0] * var60, var25);
            }
        } else if (class100.field1609 || var11.field2467 != 0 || var11.field2514 == 1 || var11.field2470) {
            class2 var29;
            if (var11.field2481 == -1 && var11.field2447 == null && var11.field2448 == null && !var11.field2462) {
                class123 var28 = var11.method1075(-124, 22, var21, var20, (class260) null, arg0, var27, arg5, var22, var18, var19);
                var29 = var28.field1951;
            } else {
                var29 = new class81(arg3, 22, arg0, arg6, arg2, arg8, -1, var11.field2500, (class2) null);
            }
            class289.method1928(arg10, arg2, arg8, var19, var29, var25, var11.field2475);
            if (var11.field2514 == 1 && arg9 != null) {
                arg9.method295(21876, arg8, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IB)Lbk;")
    public static final class55 method958(int arg0, byte arg1) {
        class55 var2 = (class55) field2164.method1261(0, (long) arg0);
        int var3 = 15 / ((-arg1 - 58) / 36);
        field2172++;
        if (var2 != null) {
            return var2;
        }
        byte[] var4 = class229.field3691.method1680(class291.method1935(arg0, -1), class265.method1785(arg0, 1), -96);
        class55 var5 = new class55();
        var5.field922 = arg0;
        if (var4 != null) {
            var5.method378((byte) -104, new class162(var4));
        }
        field2164.method1264(-1, (long) arg0, var5);
        return var5;
    }

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "(I)V")
    public static void method959(int arg0) {
        field2164 = null;
        field2178 = null;
        if (arg0 == -1) {
            field2171 = null;
            field2177 = null;
            field2168 = null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILjm;)V")
    public static final void method960(int arg0, class126 arg1) {
        field2161++;
        class186.method1333(arg0, arg1, 0);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)Lph;")
    public static final class217 method961(int arg0, int arg1) {
        field2162++;
        class217 var2 = (class217) class75.field1245.method1261(0, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        if (arg0 != 18836) {
            method961(-62, 103);
        }
        byte[] var3 = class72.field1213.method1680(0, arg1, arg0 - 18923);
        class217 var4 = new class217(var3);
        var4.method649(class42.field611, (int[]) null);
        class75.field1245.method1264(arg0 ^ 0xFFFFB66B, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Ldk;ZII)[Lbl;")
    public static final class146[] method962(class251 arg0, boolean arg1, int arg2, int arg3) {
        field2167++;
        if (class290.method1932(121, arg3, arg2, arg0)) {
            return arg1 ? class14.method67(825784792) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIII)V")
    public static final void method963(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2174++;
        int var6 = arg1 - arg3;
        int var7 = arg0 - arg2;
        if (var7 == 0) {
            if (var6 != 0) {
                class256.method1726(arg2, true, arg1, arg4, arg3);
            }
        } else if (var6 == 0) {
            class48.method342(arg2, false, arg0, arg3, arg4);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            boolean var8 = var7 < var6;
            if (var8) {
                int var9 = arg2;
                arg2 = arg3;
                arg3 = var9;
                int var10 = arg0;
                arg0 = arg1;
                arg1 = var10;
            }
            if (arg2 > arg0) {
                int var11 = arg2;
                arg2 = arg0;
                int var12 = arg3;
                arg3 = arg1;
                arg1 = var12;
                arg0 = var11;
            }
            int var13 = arg3;
            if (arg5 != -20685) {
                field2159 = -46;
            }
            int var14 = arg1 - arg3;
            int var15 = arg3 >= arg1 ? -1 : 1;
            int var16 = arg0 - arg2;
            if (var14 < 0) {
                var14 = -var14;
            }
            int var17 = -(var16 >> 1);
            if (var8) {
                for (int var19 = arg2; var19 <= arg0; var19++) {
                    class204.field3253[var19][var13] = arg4;
                    var17 += var14;
                    if (var17 > 0) {
                        var13 += var15;
                        var17 -= var16;
                    }
                }
            } else {
                for (int var18 = arg2; var18 <= arg0; var18++) {
                    class204.field3253[var13][var18] = arg4;
                    var17 += var14;
                    if (var17 > 0) {
                        var17 -= var16;
                        var13 += var15;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "(I)Z")
    public final boolean method964(int arg0) {
        field2166++;
        if (arg0 == -12) {
            return this.field2163 != null;
        } else {
            return true;
        }
    }
}
