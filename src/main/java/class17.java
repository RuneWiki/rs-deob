import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class17 {

    @OriginalMember(owner = "client!db", name = "e", descriptor = "I")
    public static int field316 = 2;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "[Lp;")
    public static class280[] field315 = new class280[1000];

    @OriginalMember(owner = "client!db", name = "j", descriptor = "I")
    public static int field321 = -2;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "[I")
    public static int[] field314 = new int[2500];

    @OriginalMember(owner = "client!db", name = "h", descriptor = "S")
    public static short field319 = 1;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "I")
    public int field312;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "I")
    public int field317;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!db", name = "k", descriptor = "I")
    public int field322;

    @OriginalMember(owner = "client!db", name = "l", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IILtg;I)Lde;")
    public static final class108 method130(int arg0, int arg1, class180 arg2, int arg3) {
        field318++;
        if (arg3 > -13) {
            method130(-14, 21, (class180) null, 73);
        }
        return class90.method648(arg1, arg0, arg2, -41) ? class165.method1161(122) : null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IZIIZLpk;IIIII)V")
    public static final void method131(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, class99 arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field320++;
        if (arg1 && !class215.method1436(104) && (class259.field4598[0][arg9][arg8] & 0x2) == 0) {
            if ((class259.field4598[arg3][arg9][arg8] & 0x10) != 0) {
                return;
            }
            if (class232.method1560(arg8, arg10 ^ 0x38B37AE2, arg3, arg9) != class23.field427) {
                return;
            }
        }
        if (arg10 != 951286498) {
            method131(-93, true, 94, -96, false, (class99) null, 67, -107, 30, 94, -116);
        }
        if (arg3 < class153.field2653) {
            class153.field2653 = arg3;
        }
        class130 var11 = class32.method277((byte) -68, arg6);
        int var12;
        int var13;
        if (arg7 == 1 || arg7 == 3) {
            var13 = var11.field2265;
            var12 = var11.field2277;
        } else {
            var12 = var11.field2265;
            var13 = var11.field2277;
        }
        int var14;
        int var15;
        if (arg9 + var13 <= 104) {
            var14 = (var13 >> 1) + arg9;
            var15 = (var13 + 1 >> 1) + arg9;
        } else {
            var14 = arg9;
            var15 = arg9 + 1;
        }
        int var16;
        int var17;
        if ((arg8 + var12) <= 104) {
            var16 = (var12 + 1 >> 1) + arg8;
            var17 = (var12 >> 1) + arg8;
        } else {
            var17 = arg8;
            var16 = arg8 + 1;
        }
        int[][] var18 = class145.field2529[arg2];
        int var19 = (arg9 << 7) + (var13 << 6);
        int var20 = var18[var14][var17] + var18[var15][var17] - (-var18[var14][var16] + -var18[var15][var16]) >> 2;
        int var21 = (arg8 << 7) + (var12 << 6);
        int[][] var22 = null;
        long var23 = (long) (arg9 | arg8 << 7 | arg0 << 14 | arg7 << 20 | 0x40000000);
        if (arg4) {
            var22 = class168.field2937[0];
        } else if (arg2 < 3) {
            var22 = class145.field2529[arg2 + 1];
        }
        if (var11.field2302 == 0 || arg4) {
            var23 |= Long.MIN_VALUE;
        }
        if (var11.field2270 == 1) {
            var23 |= 0x400000L;
        }
        if (var11.field2298) {
            var23 |= 0x80000000L;
        }
        if (var11.method895(1)) {
            class127.method877(arg8, arg9, 128, arg3, (class142) null, arg7, (class61) null, var11);
        }
        long var25 = var23 | (long) arg6 << 32;
        boolean var27 = var11.field2293 & !arg4;
        if (arg0 == 22) {
            if (class12.field252 || var11.field2302 != 0 || var11.field2281 == 1 || var11.field2248) {
                class265 var29;
                if (var11.field2260 == -1 && var11.field2269 == null && !var11.field2322) {
                    class273 var28 = var11.method897(arg7, arg1, var18, var19, var21, 22, var22, var27, -79, var20, (class5) null);
                    var29 = var28.field4751;
                } else {
                    var29 = new class234(arg6, 22, arg7, arg2, arg9, arg8, var11.field2260, var11.field2247, (class265) null);
                }
                class184.method1282(arg3, arg9, arg8, var20, var29, var25, var11.field2271);
                if (var11.field2281 == 1 && arg5 != null) {
                    arg5.method702(arg9, (byte) -115, arg8);
                }
            }
        } else if (arg0 == 10 || arg0 == 11) {
            class265 var69;
            if (var11.field2260 == -1 && var11.field2269 == null && !var11.field2322) {
                class273 var68 = var11.method897(arg0 == 11 ? arg7 + 4 : arg7, arg1, var18, var19, var21, 10, var22, var27, -79, var20, (class5) null);
                var69 = var68.field4751;
            } else {
                var69 = new class234(arg6, 10, arg0 == 11 ? arg7 + 4 : arg7, arg2, arg9, arg8, var11.field2260, var11.field2247, (class265) null);
            }
            if (var69 != null) {
                boolean var70 = class37.method296(arg3, arg9, arg8, var20, var13, var12, var69, 0, var25);
                if (var11.field2323 && var70 && arg1) {
                    int var71 = 15;
                    if (var69 instanceof class256) {
                        var71 = ((class256) var69).method1606() / 4;
                        if (var71 > 30) {
                            var71 = 30;
                        }
                    }
                    for (int var72 = 0; var72 <= var13; var72++) {
                        for (int var73 = 0; var73 <= var12; var73++) {
                            if (var71 > class144.field2514[arg3][arg9 + var72][arg8 + var73]) {
                                class144.field2514[arg3][arg9 + var72][arg8 + var73] = (byte) var71;
                            }
                        }
                    }
                }
            }
            if (var11.field2281 != 0 && arg5 != null) {
                arg5.method698(arg9, var12, arg8, var13, var11.field2249, 0);
            }
        } else if (arg0 >= 12) {
            class265 var31;
            if (var11.field2260 == -1 && var11.field2269 == null && !var11.field2322) {
                class273 var30 = var11.method897(arg7, arg1, var18, var19, var21, arg0, var22, var27, -90, var20, (class5) null);
                var31 = var30.field4751;
            } else {
                var31 = new class234(arg6, arg0, arg7, arg2, arg9, arg8, var11.field2260, var11.field2247, (class265) null);
            }
            class37.method296(arg3, arg9, arg8, var20, 1, 1, var31, 0, var25);
            if (arg1 && arg0 >= 12 && arg0 <= 17 && arg0 != 13 && arg3 > 0) {
                class253.field4431[arg3][arg9][arg8] = class160.method1143(class253.field4431[arg3][arg9][arg8], 4);
            }
            if (var11.field2281 != 0 && arg5 != null) {
                arg5.method698(arg9, var12, arg8, var13, var11.field2249, 0);
            }
        } else if (arg0 == 0) {
            class265 var33;
            if (var11.field2260 == -1 && var11.field2269 == null && !var11.field2322) {
                class273 var32 = var11.method897(arg7, arg1, var18, var19, var21, 0, var22, var27, arg10 ^ 0x38B37ABE, var20, (class5) null);
                var33 = var32.field4751;
            } else {
                var33 = new class234(arg6, 0, arg7, arg2, arg9, arg8, var11.field2260, var11.field2247, (class265) null);
            }
            class66.method458(arg3, arg9, arg8, var20, var33, (class265) null, class57.field923[arg7], 0, var25);
            if (arg1) {
                if (arg7 == 0) {
                    if (var11.field2323) {
                        class144.field2514[arg3][arg9][arg8] = 50;
                        class144.field2514[arg3][arg9][arg8 + 1] = 50;
                    }
                    if (var11.field2279) {
                        class253.field4431[arg3][arg9][arg8] = class160.method1143(class253.field4431[arg3][arg9][arg8], 1);
                    }
                } else if (arg7 == 1) {
                    if (var11.field2323) {
                        class144.field2514[arg3][arg9][arg8 + 1] = 50;
                        class144.field2514[arg3][arg9 + 1][arg8 + 1] = 50;
                    }
                    if (var11.field2279) {
                        class253.field4431[arg3][arg9][arg8 + 1] = class160.method1143(class253.field4431[arg3][arg9][arg8 + 1], 2);
                    }
                } else if (arg7 == 2) {
                    if (var11.field2323) {
                        class144.field2514[arg3][arg9 + 1][arg8] = 50;
                        class144.field2514[arg3][arg9 + 1][arg8 + 1] = 50;
                    }
                    if (var11.field2279) {
                        class253.field4431[arg3][arg9 + 1][arg8] = class160.method1143(class253.field4431[arg3][arg9 + 1][arg8], 1);
                    }
                } else if (arg7 == 3) {
                    if (var11.field2323) {
                        class144.field2514[arg3][arg9][arg8] = 50;
                        class144.field2514[arg3][arg9 + 1][arg8] = 50;
                    }
                    if (var11.field2279) {
                        class253.field4431[arg3][arg9][arg8] = class160.method1143(class253.field4431[arg3][arg9][arg8], 2);
                    }
                }
            }
            if (var11.field2281 != 0 && arg5 != null) {
                arg5.method695(arg8, arg9, arg0, var11.field2249, true, arg7);
            }
            if (var11.field2274 != 16) {
                class243.method1654(arg3, arg9, arg8, var11.field2274);
            }
        } else if (arg0 == 1) {
            class265 var35;
            if (var11.field2260 == -1 && var11.field2269 == null && !var11.field2322) {
                class273 var34 = var11.method897(arg7, arg1, var18, var19, var21, 1, var22, var27, -68, var20, (class5) null);
                var35 = var34.field4751;
            } else {
                var35 = new class234(arg6, 1, arg7, arg2, arg9, arg8, var11.field2260, var11.field2247, (class265) null);
            }
            class66.method458(arg3, arg9, arg8, var20, var35, (class265) null, class133.field2361[arg7], 0, var25);
            if (var11.field2323 && arg1) {
                if (arg7 == 0) {
                    class144.field2514[arg3][arg9][arg8 + 1] = 50;
                } else if (arg7 == 1) {
                    class144.field2514[arg3][arg9 + 1][arg8 + 1] = 50;
                } else if (arg7 == 2) {
                    class144.field2514[arg3][arg9 + 1][arg8] = 50;
                } else if (arg7 == 3) {
                    class144.field2514[arg3][arg9][arg8] = 50;
                }
            }
            if (var11.field2281 != 0 && arg5 != null) {
                arg5.method695(arg8, arg9, arg0, var11.field2249, true, arg7);
            }
        } else if (arg0 == 2) {
            int var36 = arg7 + 1 & 0x3;
            class265 var38;
            class265 var40;
            if (var11.field2260 == -1 && var11.field2269 == null && !var11.field2322) {
                class273 var37 = var11.method897(arg7 + 4, arg1, var18, var19, var21, 2, var22, var27, -61, var20, (class5) null);
                var38 = var37.field4751;
                class273 var39 = var11.method897(var36, arg1, var18, var19, var21, 2, var22, var27, 105, var20, (class5) null);
                var40 = var39.field4751;
            } else {
                var38 = new class234(arg6, 2, arg7 + 4, arg2, arg9, arg8, var11.field2260, var11.field2247, (class265) null);
                var40 = new class234(arg6, 2, var36, arg2, arg9, arg8, var11.field2260, var11.field2247, (class265) null);
            }
            class66.method458(arg3, arg9, arg8, var20, var38, var40, class57.field923[arg7], class57.field923[var36], var25);
            if (var11.field2279 && arg1) {
                if (arg7 == 0) {
                    class253.field4431[arg3][arg9][arg8] = class160.method1143(class253.field4431[arg3][arg9][arg8], 1);
                    class253.field4431[arg3][arg9][arg8 + 1] = class160.method1143(class253.field4431[arg3][arg9][arg8 + 1], 2);
                } else if (arg7 == 1) {
                    class253.field4431[arg3][arg9][arg8 + 1] = class160.method1143(class253.field4431[arg3][arg9][arg8 + 1], 2);
                    class253.field4431[arg3][arg9 + 1][arg8] = class160.method1143(class253.field4431[arg3][arg9 + 1][arg8], 1);
                } else if (arg7 == 2) {
                    class253.field4431[arg3][arg9 + 1][arg8] = class160.method1143(class253.field4431[arg3][arg9 + 1][arg8], 1);
                    class253.field4431[arg3][arg9][arg8] = class160.method1143(class253.field4431[arg3][arg9][arg8], 2);
                } else if (arg7 == 3) {
                    class253.field4431[arg3][arg9][arg8] = class160.method1143(class253.field4431[arg3][arg9][arg8], 2);
                    class253.field4431[arg3][arg9][arg8] = class160.method1143(class253.field4431[arg3][arg9][arg8], 1);
                }
            }
            if (var11.field2281 != 0 && arg5 != null) {
                arg5.method695(arg8, arg9, arg0, var11.field2249, true, arg7);
            }
            if (var11.field2274 != 16) {
                class243.method1654(arg3, arg9, arg8, var11.field2274);
            }
        } else if (arg0 == 3) {
            class265 var42;
            if (var11.field2260 == -1 && var11.field2269 == null && !var11.field2322) {
                class273 var41 = var11.method897(arg7, arg1, var18, var19, var21, 3, var22, var27, 108, var20, (class5) null);
                var42 = var41.field4751;
            } else {
                var42 = new class234(arg6, 3, arg7, arg2, arg9, arg8, var11.field2260, var11.field2247, (class265) null);
            }
            class66.method458(arg3, arg9, arg8, var20, var42, (class265) null, class133.field2361[arg7], 0, var25);
            if (var11.field2323 && arg1) {
                if (arg7 == 0) {
                    class144.field2514[arg3][arg9][arg8 + 1] = 50;
                } else if (arg7 == 1) {
                    class144.field2514[arg3][arg9 + 1][arg8 + 1] = 50;
                } else if (arg7 == 2) {
                    class144.field2514[arg3][arg9 + 1][arg8] = 50;
                } else if (arg7 == 3) {
                    class144.field2514[arg3][arg9][arg8] = 50;
                }
            }
            if (var11.field2281 != 0 && arg5 != null) {
                arg5.method695(arg8, arg9, arg0, var11.field2249, true, arg7);
            }
        } else if (arg0 == 9) {
            class265 var44;
            if (var11.field2260 == -1 && var11.field2269 == null && !var11.field2322) {
                class273 var43 = var11.method897(arg7, arg1, var18, var19, var21, arg0, var22, var27, 25, var20, (class5) null);
                var44 = var43.field4751;
            } else {
                var44 = new class234(arg6, arg0, arg7, arg2, arg9, arg8, var11.field2260, var11.field2247, (class265) null);
            }
            class37.method296(arg3, arg9, arg8, var20, 1, 1, var44, 0, var25);
            if (var11.field2281 != 0 && arg5 != null) {
                arg5.method698(arg9, var12, arg8, var13, var11.field2249, 0);
            }
            if (var11.field2274 != 16) {
                class243.method1654(arg3, arg9, arg8, var11.field2274);
            }
        } else if (arg0 == 4) {
            class265 var46;
            if (var11.field2260 == -1 && var11.field2269 == null && !var11.field2322) {
                class273 var45 = var11.method897(arg7, arg1, var18, var19, var21, 4, var22, var27, 71, var20, (class5) null);
                var46 = var45.field4751;
            } else {
                var46 = new class234(arg6, 4, arg7, arg2, arg9, arg8, var11.field2260, var11.field2247, (class265) null);
            }
            class22.method173(arg3, arg9, arg8, var20, var46, (class265) null, class57.field923[arg7], 0, 0, 0, var25);
        } else if (arg0 == 5) {
            int var47 = 16;
            long var48 = class113.method798(arg3, arg9, arg8);
            if (var48 != 0L) {
                var47 = class32.method277((byte) -120, Integer.MAX_VALUE & (int) (var48 >>> 32)).field2274;
            }
            class265 var51;
            if (var11.field2260 == -1 && var11.field2269 == null && !var11.field2322) {
                class273 var50 = var11.method897(arg7, arg1, var18, var19, var21, 4, var22, var27, 112, var20, (class5) null);
                var51 = var50.field4751;
            } else {
                var51 = new class234(arg6, 4, arg7, arg2, arg9, arg8, var11.field2260, var11.field2247, (class265) null);
            }
            class22.method173(arg3, arg9, arg8, var20, var51, (class265) null, class57.field923[arg7], 0, class62.field1022[arg7] * var47, class64.field1062[arg7] * var47, var25);
        } else if (arg0 == 6) {
            int var52 = 8;
            long var53 = class113.method798(arg3, arg9, arg8);
            if (var53 != 0L) {
                var52 = class32.method277((byte) -108, Integer.MAX_VALUE & (int) (var53 >>> 32)).field2274 / 2;
            }
            class265 var56;
            if (var11.field2260 == -1 && var11.field2269 == null && !var11.field2322) {
                class273 var55 = var11.method897(arg7 + 4, arg1, var18, var19, var21, 4, var22, var27, -98, var20, (class5) null);
                var56 = var55.field4751;
            } else {
                var56 = new class234(arg6, 4, arg7 + 4, arg2, arg9, arg8, var11.field2260, var11.field2247, (class265) null);
            }
            class22.method173(arg3, arg9, arg8, var20, var56, (class265) null, 256, arg7, class153.field2645[arg7] * var52, class3.field100[arg7] * var52, var25);
        } else if (arg0 == 7) {
            int var57 = arg7 + 2 & 0x3;
            class265 var59;
            if (var11.field2260 == -1 && var11.field2269 == null && !var11.field2322) {
                class273 var58 = var11.method897(var57 + 4, arg1, var18, var19, var21, 4, var22, var27, 60, var20, (class5) null);
                var59 = var58.field4751;
            } else {
                var59 = new class234(arg6, 4, var57 + 4, arg2, arg9, arg8, var11.field2260, var11.field2247, (class265) null);
            }
            class22.method173(arg3, arg9, arg8, var20, var59, (class265) null, 256, var57, 0, 0, var25);
        } else if (arg0 == 8) {
            long var60 = class113.method798(arg3, arg9, arg8);
            int var62 = 8;
            if (var60 != 0L) {
                var62 = class32.method277((byte) -61, (int) (var60 >>> 32) & Integer.MAX_VALUE).field2274 / 2;
            }
            int var63 = arg7 + 2 & 0x3;
            class265 var65;
            class265 var67;
            if (var11.field2260 == -1 && var11.field2269 == null && !var11.field2322) {
                class273 var64 = var11.method897(arg7 + 4, arg1, var18, var19, var21, 4, var22, var27, 108, var20, (class5) null);
                var65 = var64.field4751;
                class273 var66 = var11.method897(var63 + 4, arg1, var18, var19, var21, 4, var22, var27, -60, var20, (class5) null);
                var67 = var66.field4751;
            } else {
                var65 = new class234(arg6, 4, arg7 + 4, arg2, arg9, arg8, var11.field2260, var11.field2247, (class265) null);
                var67 = new class234(arg6, 4, var63 + 4, arg2, arg9, arg8, var11.field2260, var11.field2247, (class265) null);
            }
            class22.method173(arg3, arg9, arg8, var20, var65, var67, 256, arg7, class153.field2645[arg7] * var62, class3.field100[arg7] * var62, var25);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
    public static void method132(int arg0) {
        field315 = null;
        field314 = null;
        if (arg0 != 6) {
            field319 = -67;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(III)J")
    public static final long method133(int arg0, int arg1, int arg2) {
        class162 var3 = class220.field3787[arg0][arg1][arg2];
        return var3 == null || var3.field2852 == null ? 0L : var3.field2852.field807;
    }
}
