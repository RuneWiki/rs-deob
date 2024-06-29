import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class121 {

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "I")
    public static int field2236 = 0;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "Lmb;")
    public static class96 field2234 = class243.method1708("::errortest", (byte) 113);

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "Z")
    public static boolean field2238 = false;

    @OriginalMember(owner = "client!rd", name = "n", descriptor = "Lmb;")
    private static class96 field2242 = class243.method1708("Please remove ", (byte) 106);

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "Lmb;")
    public static class96 field2237 = class243.method1708("(U", (byte) 121);

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "Lmb;")
    public static class96 field2233 = field2242;

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "I")
    public static int field2240 = 0;

    @OriginalMember(owner = "client!rd", name = "m", descriptor = "J")
    public static long field2241 = 0L;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "Lmb;")
    public static class96 field2231 = field2242;

    @OriginalMember(owner = "client!rd", name = "o", descriptor = "Lmb;")
    public static class96 field2243 = class243.method1708("Lade Benutzeroberfl-=che )2 ", (byte) 125);

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "F")
    public static float field2232;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZIIIIILsi;IZII)V")
    public static final void method929(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class207 arg6, int arg7, boolean arg8, int arg9, int arg10) {
        field2230++;
        if (arg8 && !class106.method786(arg1 ^ 0x2A) && (class132.field2376[0][arg7][arg9] & 0x2) == 0) {
            if ((class132.field2376[arg2][arg7][arg9] & 0x10) != 0) {
                return;
            }
            if (class76.method551(arg7, arg9, arg2, (byte) -126) != class277.field4822) {
                return;
            }
        }
        if (class41.field707 > arg2) {
            class41.field707 = arg2;
        }
        class196 var11 = class132.method995(arg5, 0);
        int var12;
        int var13;
        if (arg3 == 1 || arg3 == 3) {
            var12 = var11.field3415;
            var13 = var11.field3388;
        } else {
            var12 = var11.field3388;
            var13 = var11.field3415;
        }
        int var14;
        int var15;
        if (arg7 + var13 <= 104) {
            var14 = (var13 >> 1) + arg7;
            var15 = (var13 + 1 >> 1) + arg7;
        } else {
            var14 = arg7;
            var15 = arg7 + 1;
        }
        int var16;
        int var17;
        if ((arg9 + var12) > 104) {
            var16 = arg9;
            var17 = arg9 + 1;
        } else {
            var16 = arg9 + (var12 >> 1);
            var17 = (var12 + 1 >> 1) + arg9;
        }
        int[][] var18 = class173.field3022[arg4];
        int var19 = (arg7 << 7) + (var13 << 6);
        int var20 = var18[var15][var16] + var18[var15][var17] + var18[var14][var16] + var18[var14][var17] >> 2;
        int var21 = (arg9 << 7) + (var12 << 6);
        long var22 = (long) (arg10 << 14 | arg9 << 7 | arg7 | arg3 << 20 | 0x40000000);
        int[][] var24 = null;
        if (arg0) {
            var24 = class106.field1790[0];
        } else if (arg4 < 3) {
            var24 = class173.field3022[arg4 + 1];
        }
        if (var11.field3430 == 0 || arg0) {
            var22 |= Long.MIN_VALUE;
        }
        if (var11.field3363 == 1) {
            var22 |= 0x400000L;
        }
        if (var11.field3382) {
            var22 |= 0x80000000L;
        }
        long var25 = var22 | (long) arg5 << 32;
        if (var11.method1369(false)) {
            class236.method1609((class47) null, (class197) null, arg9, arg2, (byte) -115, arg7, var11, arg3);
        }
        boolean var27 = var11.field3380 & !arg0;
        if (arg10 == 22) {
            if (class89.field1478 || var11.field3430 != 0 || var11.field3368 == 1 || var11.field3411) {
                class108 var29;
                if (var11.field3384 == -1 && var11.field3408 == null) {
                    class78 var28 = var11.method1361(var21, -15613, var27, var19, var20, var18, 22, arg3, var24, arg8, (class30) null);
                    var29 = var28.field1332;
                } else {
                    var29 = new class144(arg5, 22, arg3, arg4, arg7, arg9, var11.field3384, var11.field3423, (class108) null);
                }
                class188.method1329(arg2, arg7, arg9, var20, var29, var25, var11.field3374);
                if (var11.field3368 == 1 && arg6 != null) {
                    arg6.method1427(arg9, (byte) 86, arg7);
                }
            }
        } else if (arg10 == 10 || arg10 == 11) {
            class108 var69;
            if (var11.field3384 == -1 && var11.field3408 == null) {
                class78 var68 = var11.method1361(var21, -15613, var27, var19, var20, var18, 10, arg10 == 11 ? arg3 + 4 : arg3, var24, arg8, (class30) null);
                var69 = var68.field1332;
            } else {
                var69 = new class144(arg5, 10, arg10 == 11 ? arg3 + 4 : arg3, arg4, arg7, arg9, var11.field3384, var11.field3423, (class108) null);
            }
            if (var69 != null) {
                boolean var70 = class222.method1526(arg2, arg7, arg9, var20, var13, var12, var69, 0, var25);
                if (var11.field3421 && var70 && arg8) {
                    int var71 = 15;
                    if (var69 instanceof class35) {
                        var71 = ((class35) var69).method278() / 4;
                        if (var71 > 30) {
                            var71 = 30;
                        }
                    }
                    for (int var72 = 0; var72 <= var13; var72++) {
                        for (int var73 = 0; var73 <= var12; var73++) {
                            if (class27.field462[arg2][arg7 + var72][arg9 + var73] < var71) {
                                class27.field462[arg2][arg7 + var72][arg9 + var73] = (byte) var71;
                            }
                        }
                    }
                }
            }
            if (var11.field3368 != 0 && arg6 != null) {
                arg6.method1438(var12, var13, arg1 ^ 0xFFFFFF90, arg7, arg9, var11.field3381);
            }
        } else if (arg10 >= 12) {
            class108 var31;
            if (var11.field3384 == -1 && var11.field3408 == null) {
                class78 var30 = var11.method1361(var21, -15613, var27, var19, var20, var18, arg10, arg3, var24, arg8, (class30) null);
                var31 = var30.field1332;
            } else {
                var31 = new class144(arg5, arg10, arg3, arg4, arg7, arg9, var11.field3384, var11.field3423, (class108) null);
            }
            class222.method1526(arg2, arg7, arg9, var20, 1, 1, var31, 0, var25);
            if (arg8 && arg10 >= 12 && arg10 <= 17 && arg10 != 13 && arg2 > 0) {
                class162.field2889[arg2][arg7][arg9] = class45.method348(class162.field2889[arg2][arg7][arg9], 4);
            }
            if (var11.field3368 != 0 && arg6 != null) {
                arg6.method1438(var12, var13, arg1 - 108, arg7, arg9, var11.field3381);
            }
        } else if (arg10 == 0) {
            class108 var33;
            if (var11.field3384 == -1 && var11.field3408 == null) {
                class78 var32 = var11.method1361(var21, arg1 - 15617, var27, var19, var20, var18, 0, arg3, var24, arg8, (class30) null);
                var33 = var32.field1332;
            } else {
                var33 = new class144(arg5, 0, arg3, arg4, arg7, arg9, var11.field3384, var11.field3423, (class108) null);
            }
            class234.method1590(arg2, arg7, arg9, var20, var33, (class108) null, class124.field2299[arg3], 0, var25);
            if (arg8) {
                if (arg3 == 0) {
                    if (var11.field3421) {
                        class27.field462[arg2][arg7][arg9] = 50;
                        class27.field462[arg2][arg7][arg9 + 1] = 50;
                    }
                    if (var11.field3429) {
                        class162.field2889[arg2][arg7][arg9] = class45.method348(class162.field2889[arg2][arg7][arg9], 1);
                    }
                } else if (arg3 == 1) {
                    if (var11.field3421) {
                        class27.field462[arg2][arg7][arg9 + 1] = 50;
                        class27.field462[arg2][arg7 + 1][arg9 + 1] = 50;
                    }
                    if (var11.field3429) {
                        class162.field2889[arg2][arg7][arg9 + 1] = class45.method348(class162.field2889[arg2][arg7][arg9 + 1], 2);
                    }
                } else if (arg3 == 2) {
                    if (var11.field3421) {
                        class27.field462[arg2][arg7 + 1][arg9] = 50;
                        class27.field462[arg2][arg7 + 1][arg9 + 1] = 50;
                    }
                    if (var11.field3429) {
                        class162.field2889[arg2][arg7 + 1][arg9] = class45.method348(class162.field2889[arg2][arg7 + 1][arg9], 1);
                    }
                } else if (arg3 == 3) {
                    if (var11.field3421) {
                        class27.field462[arg2][arg7][arg9] = 50;
                        class27.field462[arg2][arg7 + 1][arg9] = 50;
                    }
                    if (var11.field3429) {
                        class162.field2889[arg2][arg7][arg9] = class45.method348(class162.field2889[arg2][arg7][arg9], 2);
                    }
                }
            }
            if (var11.field3368 != 0 && arg6 != null) {
                arg6.method1445(arg10, var11.field3381, arg3, arg1 ^ 0x3B, arg9, arg7);
            }
            if (var11.field3413 != 16) {
                class53.method401(arg2, arg7, arg9, var11.field3413);
            }
        } else {
            if (arg1 != 4) {
                method930((byte) -86);
            }
            if (arg10 == 1) {
                class108 var35;
                if (var11.field3384 == -1 && var11.field3408 == null) {
                    class78 var34 = var11.method1361(var21, -15613, var27, var19, var20, var18, 1, arg3, var24, arg8, (class30) null);
                    var35 = var34.field1332;
                } else {
                    var35 = new class144(arg5, 1, arg3, arg4, arg7, arg9, var11.field3384, var11.field3423, (class108) null);
                }
                class234.method1590(arg2, arg7, arg9, var20, var35, (class108) null, class127.field2316[arg3], 0, var25);
                if (var11.field3421 && arg8) {
                    if (arg3 == 0) {
                        class27.field462[arg2][arg7][arg9 + 1] = 50;
                    } else if (arg3 == 1) {
                        class27.field462[arg2][arg7 + 1][arg9 + 1] = 50;
                    } else if (arg3 == 2) {
                        class27.field462[arg2][arg7 + 1][arg9] = 50;
                    } else if (arg3 == 3) {
                        class27.field462[arg2][arg7][arg9] = 50;
                    }
                }
                if (var11.field3368 != 0 && arg6 != null) {
                    arg6.method1445(arg10, var11.field3381, arg3, arg1 ^ 0x43, arg9, arg7);
                }
            } else if (arg10 == 2) {
                int var36 = arg3 + 1 & 0x3;
                class108 var38;
                class108 var40;
                if (var11.field3384 == -1 && var11.field3408 == null) {
                    class78 var37 = var11.method1361(var21, -15613, var27, var19, var20, var18, 2, arg3 + 4, var24, arg8, (class30) null);
                    var38 = var37.field1332;
                    class78 var39 = var11.method1361(var21, arg1 - 15617, var27, var19, var20, var18, 2, var36, var24, arg8, (class30) null);
                    var40 = var39.field1332;
                } else {
                    var38 = new class144(arg5, 2, arg3 + 4, arg4, arg7, arg9, var11.field3384, var11.field3423, (class108) null);
                    var40 = new class144(arg5, 2, var36, arg4, arg7, arg9, var11.field3384, var11.field3423, (class108) null);
                }
                class234.method1590(arg2, arg7, arg9, var20, var38, var40, class124.field2299[arg3], class124.field2299[var36], var25);
                if (var11.field3429 && arg8) {
                    if (arg3 == 0) {
                        class162.field2889[arg2][arg7][arg9] = class45.method348(class162.field2889[arg2][arg7][arg9], 1);
                        class162.field2889[arg2][arg7][arg9 + 1] = class45.method348(class162.field2889[arg2][arg7][arg9 + 1], 2);
                    } else if (arg3 == 1) {
                        class162.field2889[arg2][arg7][arg9 + 1] = class45.method348(class162.field2889[arg2][arg7][arg9 + 1], 2);
                        class162.field2889[arg2][arg7 + 1][arg9] = class45.method348(class162.field2889[arg2][arg7 + 1][arg9], 1);
                    } else if (arg3 == 2) {
                        class162.field2889[arg2][arg7 + 1][arg9] = class45.method348(class162.field2889[arg2][arg7 + 1][arg9], 1);
                        class162.field2889[arg2][arg7][arg9] = class45.method348(class162.field2889[arg2][arg7][arg9], 2);
                    } else if (arg3 == 3) {
                        class162.field2889[arg2][arg7][arg9] = class45.method348(class162.field2889[arg2][arg7][arg9], 2);
                        class162.field2889[arg2][arg7][arg9] = class45.method348(class162.field2889[arg2][arg7][arg9], 1);
                    }
                }
                if (var11.field3368 != 0 && arg6 != null) {
                    arg6.method1445(arg10, var11.field3381, arg3, arg1 ^ 0x39, arg9, arg7);
                }
                if (var11.field3413 != 16) {
                    class53.method401(arg2, arg7, arg9, var11.field3413);
                }
            } else if (arg10 == 3) {
                class108 var42;
                if (var11.field3384 == -1 && var11.field3408 == null) {
                    class78 var41 = var11.method1361(var21, arg1 ^ 0xFFFFC307, var27, var19, var20, var18, 3, arg3, var24, arg8, (class30) null);
                    var42 = var41.field1332;
                } else {
                    var42 = new class144(arg5, 3, arg3, arg4, arg7, arg9, var11.field3384, var11.field3423, (class108) null);
                }
                class234.method1590(arg2, arg7, arg9, var20, var42, (class108) null, class127.field2316[arg3], 0, var25);
                if (var11.field3421 && arg8) {
                    if (arg3 == 0) {
                        class27.field462[arg2][arg7][arg9 + 1] = 50;
                    } else if (arg3 == 1) {
                        class27.field462[arg2][arg7 + 1][arg9 + 1] = 50;
                    } else if (arg3 == 2) {
                        class27.field462[arg2][arg7 + 1][arg9] = 50;
                    } else if (arg3 == 3) {
                        class27.field462[arg2][arg7][arg9] = 50;
                    }
                }
                if (var11.field3368 != 0 && arg6 != null) {
                    arg6.method1445(arg10, var11.field3381, arg3, arg1 ^ 0x64, arg9, arg7);
                }
            } else if (arg10 == 9) {
                class108 var44;
                if (var11.field3384 == -1 && var11.field3408 == null) {
                    class78 var43 = var11.method1361(var21, -15613, var27, var19, var20, var18, arg10, arg3, var24, arg8, (class30) null);
                    var44 = var43.field1332;
                } else {
                    var44 = new class144(arg5, arg10, arg3, arg4, arg7, arg9, var11.field3384, var11.field3423, (class108) null);
                }
                class222.method1526(arg2, arg7, arg9, var20, 1, 1, var44, 0, var25);
                if (var11.field3368 != 0 && arg6 != null) {
                    arg6.method1438(var12, var13, arg1 ^ 0x2B, arg7, arg9, var11.field3381);
                }
                if (var11.field3413 != 16) {
                    class53.method401(arg2, arg7, arg9, var11.field3413);
                }
            } else if (arg10 == 4) {
                class108 var46;
                if (var11.field3384 == -1 && var11.field3408 == null) {
                    class78 var45 = var11.method1361(var21, -15613, var27, var19, var20, var18, 4, arg3, var24, arg8, (class30) null);
                    var46 = var45.field1332;
                } else {
                    var46 = new class144(arg5, 4, arg3, arg4, arg7, arg9, var11.field3384, var11.field3423, (class108) null);
                }
                class175.method1251(arg2, arg7, arg9, var20, var46, (class108) null, class124.field2299[arg3], 0, 0, 0, var25);
            } else if (arg10 == 5) {
                long var47 = class41.method317(arg2, arg7, arg9);
                int var49 = 16;
                if (var47 != 0L) {
                    var49 = class132.method995((int) (var47 >>> 32) & Integer.MAX_VALUE, 0).field3413;
                }
                class108 var51;
                if (var11.field3384 == -1 && var11.field3408 == null) {
                    class78 var50 = var11.method1361(var21, -15613, var27, var19, var20, var18, 4, arg3, var24, arg8, (class30) null);
                    var51 = var50.field1332;
                } else {
                    var51 = new class144(arg5, 4, arg3, arg4, arg7, arg9, var11.field3384, var11.field3423, (class108) null);
                }
                class175.method1251(arg2, arg7, arg9, var20, var51, (class108) null, class124.field2299[arg3], 0, class259.field4485[arg3] * var49, class120.field2220[arg3] * var49, var25);
            } else if (arg10 == 6) {
                long var52 = class41.method317(arg2, arg7, arg9);
                int var54 = 8;
                if (var52 != 0L) {
                    var54 = class132.method995((int) (var52 >>> 32) & Integer.MAX_VALUE, 0).field3413 / 2;
                }
                class108 var56;
                if (var11.field3384 == -1 && var11.field3408 == null) {
                    class78 var55 = var11.method1361(var21, -15613, var27, var19, var20, var18, 4, arg3 + 4, var24, arg8, (class30) null);
                    var56 = var55.field1332;
                } else {
                    var56 = new class144(arg5, 4, arg3 + 4, arg4, arg7, arg9, var11.field3384, var11.field3423, (class108) null);
                }
                class175.method1251(arg2, arg7, arg9, var20, var56, (class108) null, 256, arg3, class153.field2689[arg3] * var54, class82.field1391[arg3] * var54, var25);
            } else if (arg10 == 7) {
                int var57 = arg3 + 2 & 0x3;
                class108 var59;
                if (var11.field3384 == -1 && var11.field3408 == null) {
                    class78 var58 = var11.method1361(var21, -15613, var27, var19, var20, var18, 4, var57 + 4, var24, arg8, (class30) null);
                    var59 = var58.field1332;
                } else {
                    var59 = new class144(arg5, 4, var57 + 4, arg4, arg7, arg9, var11.field3384, var11.field3423, (class108) null);
                }
                class175.method1251(arg2, arg7, arg9, var20, var59, (class108) null, 256, var57, 0, 0, var25);
            } else if (arg10 == 8) {
                int var60 = 8;
                long var61 = class41.method317(arg2, arg7, arg9);
                if (var61 != 0L) {
                    var60 = class132.method995((int) (var61 >>> 32) & Integer.MAX_VALUE, arg1 ^ 0x4).field3413 / 2;
                }
                int var63 = arg3 + 2 & 0x3;
                class108 var65;
                class108 var67;
                if (var11.field3384 == -1 && var11.field3408 == null) {
                    class78 var64 = var11.method1361(var21, arg1 - 15617, var27, var19, var20, var18, 4, arg3 + 4, var24, arg8, (class30) null);
                    var65 = var64.field1332;
                    class78 var66 = var11.method1361(var21, -15613, var27, var19, var20, var18, 4, var63 + 4, var24, arg8, (class30) null);
                    var67 = var66.field1332;
                } else {
                    var65 = new class144(arg5, 4, arg3 + 4, arg4, arg7, arg9, var11.field3384, var11.field3423, (class108) null);
                    var67 = new class144(arg5, 4, var63 + 4, arg4, arg7, arg9, var11.field3384, var11.field3423, (class108) null);
                }
                class175.method1251(arg2, arg7, arg9, var20, var65, var67, 256, arg3, class153.field2689[arg3] * var60, class82.field1391[arg3] * var60, var25);
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V")
    public static void method930(byte arg0) {
        field2234 = null;
        field2237 = null;
        int var1 = 104 % ((44 - arg0) / 40);
        field2242 = null;
        field2233 = null;
        field2231 = null;
        field2243 = null;
    }
}
