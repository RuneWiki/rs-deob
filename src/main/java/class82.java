import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class82 {

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "Lbd;")
    private static class162 field1425 = class17.method142(0, "You can(Wt add yourself to your own ignore list)3");

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "Lbd;")
    public static class162 field1423 = field1425;

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
    public static int field1426 = 100;

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "I")
    public static int field1429 = 0;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "Lcj;")
    public static class182 field1418 = new class182(16);

    @OriginalMember(owner = "client!cc", name = "p", descriptor = "I")
    public static int field1433 = 0;

    @OriginalMember(owner = "client!cc", name = "q", descriptor = "[I")
    public static int[] field1434 = new int[32];

    @OriginalMember(owner = "client!cc", name = "o", descriptor = "J")
    public static long field1432 = 0L;

    @OriginalMember(owner = "client!cc", name = "r", descriptor = "I")
    public static int field1435 = 0;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
    public static int field1419;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
    public static int field1422;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
    public static int field1428;

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!cc", name = "s", descriptor = "I")
    public static int field1436;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lda;BZLlc;Lda;)V", line = 35)
    public static final void method623(class143 arg0, byte arg1, boolean arg2, class189 arg3, class143 arg4) {
        if (arg1 != 1) {
            field1426 = -102;
        }
        field1420++;
        class235.field3929 = arg0;
        class102.field1853 = arg4;
        class146.field2647 = arg2;
        int var5 = class102.field1853.method1140(-1) - 1;
        class173.field2988 = var5 * 256 + class102.field1853.method1121(var5, (byte) -126);
        class214.field3595 = arg3;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIIIIIIZLqd;Z)V", line = 51)
    public static final void method624(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, class179 arg9, boolean arg10) {
        field1428++;
        if (arg8 && !class4.method19(arg5 ^ 0xFFFFFF84) && (class213.field3580[0][arg1][arg7] & 0x2) == 0) {
            if ((class213.field3580[arg6][arg1][arg7] & 0x10) != 0) {
                return;
            }
            if (class185.method1400(arg1, arg6, arg5 - 32, arg7) != class245.field4080) {
                return;
            }
        }
        if (arg6 < class142.field2543) {
            class142.field2543 = arg6;
        }
        class311 var11 = class229.method1637(arg2, (byte) 93);
        if (class117.field2159 && var11.field5226) {
            return;
        }
        int var12;
        int var13;
        if (arg0 == 1 || arg0 == 3) {
            var12 = var11.field5217;
            var13 = var11.field5201;
        } else {
            var12 = var11.field5201;
            var13 = var11.field5217;
        }
        int var14;
        int var15;
        if (arg1 + var12 <= 104) {
            var14 = arg1 + (var12 >> 1);
            var15 = (var12 + 1 >> 1) + arg1;
        } else {
            var15 = arg1 + 1;
            var14 = arg1;
        }
        int var16;
        int var17;
        if (arg7 + var13 <= 104) {
            var16 = (var13 + 1 >> 1) + arg7;
            var17 = (var13 >> 1) + arg7;
        } else {
            var16 = arg7 + 1;
            var17 = arg7;
        }
        if (arg5 != 4) {
            method628(-56, (class143) null, -43);
        }
        int[][] var18 = class206.field3473[arg3];
        int var19 = var18[var14][var17] + var18[var15][var17] + var18[var15][var16] + var18[var14][var16] >> 2;
        int var20 = (arg1 << 7) + (var12 << 6);
        int var21 = (arg7 << 7) + (var13 << 6);
        int var22 = 0;
        if (class117.field2159 && arg3 != 0) {
            int[][] var23 = class206.field3473[0];
            var22 = var19 - (var23[var15][var17] + var23[var14][var16] + var23[var15][var16] + var23[var14][var17] >> 2);
        }
        int[][] var24 = (int[][]) null;
        long var25 = (long) (arg0 | 0x400 << 20 | arg4 << 14 | arg1 | arg7 << 7);
        if (var11.field5194 == 0 || arg10) {
            var25 |= Long.MIN_VALUE;
        }
        if (var11.field5231 == 1) {
            var25 |= 0x400000L;
        }
        if (arg10) {
            var24 = class73.field1166[0];
        } else if (arg3 < 3) {
            var24 = class206.field3473[arg3 + 1];
        }
        if (var11.field5214) {
            var25 |= 0x80000000L;
        }
        long var27 = var25 | (long) arg2 << 32;
        if (var11.method2097((byte) 103)) {
            class68.method486(arg7, -94, arg0, var11, (class39) null, arg6, (class60) null, arg1);
        }
        boolean var29 = var11.field5242 & !arg10;
        if (arg4 == 22) {
            if (class267.field4461 || var11.field5194 != 0 || var11.field5245 == 1 || var11.field5227) {
                class255 var77;
                if (var11.field5193 == -1 && var11.field5191 == null) {
                    class128 var76 = var11.method2100(arg8, var19, 22, var24, arg5 - 5, arg0, var18, var21, var29, var20, (class99) null);
                    if (class117.field2159 && var29) {
                        class287.method1995(var76.field2317, var20, var22, var21);
                    }
                    var77 = var76.field2327;
                } else {
                    var77 = new class302(arg2, 22, arg0, arg3, arg1, arg7, var11.field5193, var11.field5197, (class255) null);
                }
                class46.method330(arg6, arg1, arg7, var19, var77, var27, var11.field5237);
                if (var11.field5245 == 1 && arg9 != null) {
                    arg9.method1357(arg1, -76, arg7);
                }
            }
        } else if (arg4 == 10 || arg4 == 11) {
            class255 var71;
            if (var11.field5193 == -1 && var11.field5191 == null) {
                class128 var70 = var11.method2100(arg8, var19, 10, var24, -1, arg4 == 11 ? arg0 + 4 : arg0, var18, var21, var29, var20, (class99) null);
                if (class117.field2159 && var29) {
                    class287.method1995(var70.field2317, var20, var22, var21);
                }
                var71 = var70.field2327;
            } else {
                var71 = new class302(arg2, 10, arg4 == 11 ? arg0 + 4 : arg0, arg3, arg1, arg7, var11.field5193, var11.field5197, (class255) null);
            }
            if (var71 != null) {
                boolean var72 = class205.method1520(arg6, arg1, arg7, var19, var12, var13, var71, 0, var27);
                if (var11.field5250 && var72 && arg8) {
                    int var73 = 15;
                    if (var71 instanceof class176) {
                        var73 = ((class176) var71).method97() / 4;
                        if (var73 > 30) {
                            var73 = 30;
                        }
                    }
                    for (int var74 = 0; var74 <= var12; var74++) {
                        for (int var75 = 0; var75 <= var13; var75++) {
                            if (var73 > class317.field5341[arg6][arg1 + var74][arg7 + var75]) {
                                class317.field5341[arg6][arg1 + var74][arg7 + var75] = (byte) var73;
                            }
                        }
                    }
                }
            }
            if (var11.field5245 != 0 && arg9 != null) {
                arg9.method1355(var11.field5230, true, var12, arg1, arg7, var13);
            }
        } else if (arg4 >= 12) {
            class255 var69;
            if (var11.field5193 == -1 && var11.field5191 == null) {
                class128 var68 = var11.method2100(arg8, var19, arg4, var24, -1, arg0, var18, var21, var29, var20, (class99) null);
                if (class117.field2159 && var29) {
                    class287.method1995(var68.field2317, var20, var22, var21);
                }
                var69 = var68.field2327;
            } else {
                var69 = new class302(arg2, arg4, arg0, arg3, arg1, arg7, var11.field5193, var11.field5197, (class255) null);
            }
            class205.method1520(arg6, arg1, arg7, var19, 1, 1, var69, 0, var27);
            if (arg8 && arg4 >= 12 && arg4 <= 17 && arg4 != 13 && arg6 > 0) {
                class93.field1648[arg6][arg1][arg7] = class289.method2005(class93.field1648[arg6][arg1][arg7], 4);
            }
            if (var11.field5245 != 0 && arg9 != null) {
                arg9.method1355(var11.field5230, true, var12, arg1, arg7, var13);
            }
        } else if (arg4 == 0) {
            class255 var31;
            if (var11.field5193 == -1 && var11.field5191 == null) {
                class128 var30 = var11.method2100(arg8, var19, 0, var24, -1, arg0, var18, var21, var29, var20, (class99) null);
                if (class117.field2159 && var29) {
                    class287.method1995(var30.field2317, var20, var22, var21);
                }
                var31 = var30.field2327;
            } else {
                var31 = new class302(arg2, 0, arg0, arg3, arg1, arg7, var11.field5193, var11.field5197, (class255) null);
            }
            class239.method1690(arg6, arg1, arg7, var19, var31, (class255) null, class23.field394[arg0], 0, var27);
            if (arg8) {
                if (arg0 == 0) {
                    if (var11.field5250) {
                        class317.field5341[arg6][arg1][arg7] = 50;
                        class317.field5341[arg6][arg1][arg7 + 1] = 50;
                    }
                    if (var11.field5238) {
                        class93.field1648[arg6][arg1][arg7] = class289.method2005(class93.field1648[arg6][arg1][arg7], 1);
                    }
                } else if (arg0 == 1) {
                    if (var11.field5250) {
                        class317.field5341[arg6][arg1][arg7 + 1] = 50;
                        class317.field5341[arg6][arg1 + 1][arg7 + 1] = 50;
                    }
                    if (var11.field5238) {
                        class93.field1648[arg6][arg1][arg7 + 1] = class289.method2005(class93.field1648[arg6][arg1][arg7 + 1], 2);
                    }
                } else if (arg0 == 2) {
                    if (var11.field5250) {
                        class317.field5341[arg6][arg1 + 1][arg7] = 50;
                        class317.field5341[arg6][arg1 + 1][arg7 + 1] = 50;
                    }
                    if (var11.field5238) {
                        class93.field1648[arg6][arg1 + 1][arg7] = class289.method2005(class93.field1648[arg6][arg1 + 1][arg7], 1);
                    }
                } else if (arg0 == 3) {
                    if (var11.field5250) {
                        class317.field5341[arg6][arg1][arg7] = 50;
                        class317.field5341[arg6][arg1 + 1][arg7] = 50;
                    }
                    if (var11.field5238) {
                        class93.field1648[arg6][arg1][arg7] = class289.method2005(class93.field1648[arg6][arg1][arg7], 2);
                    }
                }
            }
            if (var11.field5245 != 0 && arg9 != null) {
                arg9.method1353(arg1, arg0, arg7, var11.field5230, true, arg4);
            }
            if (var11.field5236 != 16) {
                class63.method431(arg6, arg1, arg7, var11.field5236);
            }
        } else if (arg4 == 1) {
            class255 var33;
            if (var11.field5193 == -1 && var11.field5191 == null) {
                class128 var32 = var11.method2100(arg8, var19, 1, var24, -1, arg0, var18, var21, var29, var20, (class99) null);
                if (class117.field2159 && var29) {
                    class287.method1995(var32.field2317, var20, var22, var21);
                }
                var33 = var32.field2327;
            } else {
                var33 = new class302(arg2, 1, arg0, arg3, arg1, arg7, var11.field5193, var11.field5197, (class255) null);
            }
            class239.method1690(arg6, arg1, arg7, var19, var33, (class255) null, class270.field4516[arg0], 0, var27);
            if (var11.field5250 && arg8) {
                if (arg0 == 0) {
                    class317.field5341[arg6][arg1][arg7 + 1] = 50;
                } else if (arg0 == 1) {
                    class317.field5341[arg6][arg1 + 1][arg7 + 1] = 50;
                } else if (arg0 == 2) {
                    class317.field5341[arg6][arg1 + 1][arg7] = 50;
                } else if (arg0 == 3) {
                    class317.field5341[arg6][arg1][arg7] = 50;
                }
            }
            if (var11.field5245 != 0 && arg9 != null) {
                arg9.method1353(arg1, arg0, arg7, var11.field5230, true, arg4);
            }
        } else if (arg4 == 2) {
            int var34 = arg0 + 1 & 0x3;
            class255 var36;
            class255 var38;
            if (var11.field5193 == -1 && var11.field5191 == null) {
                class128 var35 = var11.method2100(arg8, var19, 2, var24, arg5 - 5, arg0 + 4, var18, var21, var29, var20, (class99) null);
                if (class117.field2159 && var29) {
                    class287.method1995(var35.field2317, var20, var22, var21);
                }
                var36 = var35.field2327;
                class128 var37 = var11.method2100(arg8, var19, 2, var24, arg5 ^ 0xFFFFFFFB, var34, var18, var21, var29, var20, (class99) null);
                if (class117.field2159 && var29) {
                    class287.method1995(var37.field2317, var20, var22, var21);
                }
                var38 = var37.field2327;
            } else {
                var36 = new class302(arg2, 2, arg0 + 4, arg3, arg1, arg7, var11.field5193, var11.field5197, (class255) null);
                var38 = new class302(arg2, 2, var34, arg3, arg1, arg7, var11.field5193, var11.field5197, (class255) null);
            }
            class239.method1690(arg6, arg1, arg7, var19, var36, var38, class23.field394[arg0], class23.field394[var34], var27);
            if (var11.field5238 && arg8) {
                if (arg0 == 0) {
                    class93.field1648[arg6][arg1][arg7] = class289.method2005(class93.field1648[arg6][arg1][arg7], 1);
                    class93.field1648[arg6][arg1][arg7 + 1] = class289.method2005(class93.field1648[arg6][arg1][arg7 + 1], 2);
                } else if (arg0 == 1) {
                    class93.field1648[arg6][arg1][arg7 + 1] = class289.method2005(class93.field1648[arg6][arg1][arg7 + 1], 2);
                    class93.field1648[arg6][arg1 + 1][arg7] = class289.method2005(class93.field1648[arg6][arg1 + 1][arg7], 1);
                } else if (arg0 == 2) {
                    class93.field1648[arg6][arg1 + 1][arg7] = class289.method2005(class93.field1648[arg6][arg1 + 1][arg7], 1);
                    class93.field1648[arg6][arg1][arg7] = class289.method2005(class93.field1648[arg6][arg1][arg7], 2);
                } else if (arg0 == 3) {
                    class93.field1648[arg6][arg1][arg7] = class289.method2005(class93.field1648[arg6][arg1][arg7], 2);
                    class93.field1648[arg6][arg1][arg7] = class289.method2005(class93.field1648[arg6][arg1][arg7], 1);
                }
            }
            if (var11.field5245 != 0 && arg9 != null) {
                arg9.method1353(arg1, arg0, arg7, var11.field5230, true, arg4);
            }
            if (var11.field5236 != 16) {
                class63.method431(arg6, arg1, arg7, var11.field5236);
            }
        } else if (arg4 == 3) {
            class255 var40;
            if (var11.field5193 == -1 && var11.field5191 == null) {
                class128 var39 = var11.method2100(arg8, var19, 3, var24, -1, arg0, var18, var21, var29, var20, (class99) null);
                if (class117.field2159 && var29) {
                    class287.method1995(var39.field2317, var20, var22, var21);
                }
                var40 = var39.field2327;
            } else {
                var40 = new class302(arg2, 3, arg0, arg3, arg1, arg7, var11.field5193, var11.field5197, (class255) null);
            }
            class239.method1690(arg6, arg1, arg7, var19, var40, (class255) null, class270.field4516[arg0], 0, var27);
            if (var11.field5250 && arg8) {
                if (arg0 == 0) {
                    class317.field5341[arg6][arg1][arg7 + 1] = 50;
                } else if (arg0 == 1) {
                    class317.field5341[arg6][arg1 + 1][arg7 + 1] = 50;
                } else if (arg0 == 2) {
                    class317.field5341[arg6][arg1 + 1][arg7] = 50;
                } else if (arg0 == 3) {
                    class317.field5341[arg6][arg1][arg7] = 50;
                }
            }
            if (var11.field5245 != 0 && arg9 != null) {
                arg9.method1353(arg1, arg0, arg7, var11.field5230, true, arg4);
            }
        } else if (arg4 == 9) {
            class255 var67;
            if (var11.field5193 == -1 && var11.field5191 == null) {
                class128 var66 = var11.method2100(arg8, var19, arg4, var24, -1, arg0, var18, var21, var29, var20, (class99) null);
                if (class117.field2159 && var29) {
                    class287.method1995(var66.field2317, var20, var22, var21);
                }
                var67 = var66.field2327;
            } else {
                var67 = new class302(arg2, arg4, arg0, arg3, arg1, arg7, var11.field5193, var11.field5197, (class255) null);
            }
            class205.method1520(arg6, arg1, arg7, var19, 1, 1, var67, 0, var27);
            if (var11.field5245 != 0 && arg9 != null) {
                arg9.method1355(var11.field5230, true, var12, arg1, arg7, var13);
            }
            if (var11.field5236 != 16) {
                class63.method431(arg6, arg1, arg7, var11.field5236);
            }
        } else if (arg4 == 4) {
            class255 var42;
            if (var11.field5193 == -1 && var11.field5191 == null) {
                class128 var41 = var11.method2100(arg8, var19, 4, var24, -1, arg0, var18, var21, var29, var20, (class99) null);
                if (class117.field2159 && var29) {
                    class287.method1995(var41.field2317, var20, var22, var21);
                }
                var42 = var41.field2327;
            } else {
                var42 = new class302(arg2, 4, arg0, arg3, arg1, arg7, var11.field5193, var11.field5197, (class255) null);
            }
            class315.method2149(arg6, arg1, arg7, var19, var42, (class255) null, class23.field394[arg0], 0, 0, 0, var27);
        } else if (arg4 == 5) {
            int var61 = 16;
            long var62 = method626(arg6, arg1, arg7);
            if (var62 != 0L) {
                var61 = class229.method1637((int) (var62 >>> 32) & Integer.MAX_VALUE, (byte) 93).field5236;
            }
            class255 var65;
            if (var11.field5193 == -1 && var11.field5191 == null) {
                class128 var64 = var11.method2100(arg8, var19, 4, var24, -1, arg0, var18, var21, var29, var20, (class99) null);
                if (class117.field2159 && var29) {
                    class287.method1995(var64.field2317, var20 - (class71.field1140[arg0] * 8), var22, var21 - class230.field3823[arg0] * 8);
                }
                var65 = var64.field2327;
            } else {
                var65 = new class302(arg2, 4, arg0, arg3, arg1, arg7, var11.field5193, var11.field5197, (class255) null);
            }
            class315.method2149(arg6, arg1, arg7, var19, var65, (class255) null, class23.field394[arg0], 0, class71.field1140[arg0] * var61, class230.field3823[arg0] * var61, var27);
        } else if (arg4 == 6) {
            int var56 = 8;
            long var57 = method626(arg6, arg1, arg7);
            if (var57 != 0L) {
                var56 = class229.method1637((int) (var57 >>> 32) & Integer.MAX_VALUE, (byte) 93).field5236 / 2;
            }
            class255 var60;
            if (var11.field5193 == -1 && var11.field5191 == null) {
                class128 var59 = var11.method2100(arg8, var19, 4, var24, -1, arg0 + 4, var18, var21, var29, var20, (class99) null);
                if (class117.field2159 && var29) {
                    class287.method1995(var59.field2317, var20 - class185.field3185[arg0] * 8, var22, var21 - class157.field2775[arg0] * 8);
                }
                var60 = var59.field2327;
            } else {
                var60 = new class302(arg2, 4, arg0 + 4, arg3, arg1, arg7, var11.field5193, var11.field5197, (class255) null);
            }
            class315.method2149(arg6, arg1, arg7, var19, var60, (class255) null, 256, arg0, class185.field3185[arg0] * var56, class157.field2775[arg0] * var56, var27);
        } else if (arg4 == 7) {
            int var53 = arg0 + 2 & 0x3;
            class255 var55;
            if (var11.field5193 == -1 && var11.field5191 == null) {
                class128 var54 = var11.method2100(arg8, var19, 4, var24, -1, var53 + 4, var18, var21, var29, var20, (class99) null);
                if (class117.field2159 && var29) {
                    class287.method1995(var54.field2317, var20, var22, var21);
                }
                var55 = var54.field2327;
            } else {
                var55 = new class302(arg2, 4, var53 + 4, arg3, arg1, arg7, var11.field5193, var11.field5197, (class255) null);
            }
            class315.method2149(arg6, arg1, arg7, var19, var55, (class255) null, 256, var53, 0, 0, var27);
        } else if (arg4 == 8) {
            int var43 = 8;
            long var44 = method626(arg6, arg1, arg7);
            if (var44 != 0L) {
                var43 = class229.method1637(Integer.MAX_VALUE & (int) (var44 >>> 32), (byte) 93).field5236 / 2;
            }
            int var46 = arg0 + 2 & 0x3;
            class255 var50;
            class255 var52;
            if (var11.field5193 == -1 && var11.field5191 == null) {
                int var47 = class157.field2775[arg0] * 8;
                int var48 = class185.field3185[arg0] * 8;
                class128 var49 = var11.method2100(arg8, var19, 4, var24, arg5 - 5, arg0 + 4, var18, var21, var29, var20, (class99) null);
                if (class117.field2159 && var29) {
                    class287.method1995(var49.field2317, var20 - var48, var22, var21 - var47);
                }
                var50 = var49.field2327;
                class128 var51 = var11.method2100(arg8, var19, 4, var24, -1, var46 + 4, var18, var21, var29, var20, (class99) null);
                if (class117.field2159 && var29) {
                    class287.method1995(var51.field2317, var20 - var48, var22, var21 - var47);
                }
                var52 = var51.field2327;
            } else {
                var50 = new class302(arg2, 4, arg0 + 4, arg3, arg1, arg7, var11.field5193, var11.field5197, (class255) null);
                var52 = new class302(arg2, 4, var46 + 4, arg3, arg1, arg7, var11.field5193, var11.field5197, (class255) null);
            }
            class315.method2149(arg6, arg1, arg7, var19, var50, var52, 256, arg0, class185.field3185[arg0] * var43, class157.field2775[arg0] * var43, var27);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V", line = 746)
    public static void method625(int arg0) {
        if (arg0 != -2329) {
            method629((class162) null, 75, -69, -104, -75L, -30, 33);
        }
        field1425 = null;
        field1434 = null;
        field1418 = null;
        field1423 = null;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(III)J", line = 760)
    public static final long method626(int arg0, int arg1, int arg2) {
        class225 var3 = class288.field4856[arg0][arg1][arg2];
        return var3 == null || var3.field3753 == null ? 0L : var3.field3753.field4526;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V", line = 774)
    public static final void method627(int arg0) {
        field1421++;
        for (int var1 = 0; var1 < class279.field4705; var1++) {
            class194 var2 = class261.method1801((byte) -103, var1);
            if (var2 != null && var2.field3268 == 0) {
                class263.field4389[var1] = 0;
                class129.field2329[var1] = 0;
            }
        }
        if (arg0 != 9366) {
            field1429 = 82;
        }
        class235.field3925 = new class235(16);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILda;I)[Lpm;", line = 827)
    public static final class99[] method628(int arg0, class143 arg1, int arg2) {
        field1430++;
        if (class212.method1555(73, arg1, arg0)) {
            return arg2 == 20511 ? class120.method977(-126) : (class99[]) null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lbd;IIIJII)V", line = 853)
    public static final void method629(class162 arg0, int arg1, int arg2, int arg3, long arg4, int arg5, int arg6) {
        field1419++;
        class94 var8 = new class94(128);
        var8.method753(10, true);
        var8.method751((int) (Math.random() * 99999.0D), -1044017976);
        var8.method751(517, arg1 - 1044049684);
        var8.method745(arg4, (byte) -124);
        var8.method730(false, (int) (Math.random() * 9.9999999E7D));
        if (arg1 != 31708) {
            field1425 = (class162) null;
        }
        var8.method727(arg0, -253);
        var8.method730(false, (int) (Math.random() * 9.9999999E7D));
        var8.method751(class262.field4377, -1044017976);
        var8.method753(arg6, true);
        var8.method753(arg2, true);
        var8.method730(false, (int) (Math.random() * 9.9999999E7D));
        var8.method751(arg3, -1044017976);
        var8.method751(arg5, -1044017976);
        var8.method730(false, (int) (Math.random() * 9.9999999E7D));
        var8.method708(arg1 - 27612, class250.field4170, class274.field4556);
        class187.field3229.field1653 = 0;
        class187.field3229.method753(183, true);
        class187.field3229.method753(var8.field1653, true);
        class187.field3229.method720(var8.field1653, var8.field1681, 0, -92);
        class139.field2488 = 0;
        class87.field1556 = 1;
        class92.field1624 = -3;
        class219.field3657 = 0;
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(I)Lb;", line = 927)
    public static final class94 method630(int arg0) {
        class94 var1 = new class94(30);
        var1.method753(7, true);
        field1422++;
        var1.method753(class39.field639, true);
        var1.method753(class198.field3369 ? 1 : 0, true);
        var1.method753(class45.field724 ? 1 : 0, true);
        var1.method753(class267.field4461 ? 1 : 0, true);
        var1.method753(class203.field3439 ? 1 : 0, true);
        var1.method753(class261.field4362 ? 1 : 0, true);
        var1.method753(class295.field4945 ? 1 : 0, true);
        var1.method753(class247.field4090 ? 1 : 0, true);
        var1.method753(class92.field1621 ? 1 : 0, true);
        var1.method753(class291.field4906, true);
        var1.method753(class92.field1634 ? 1 : 0, true);
        var1.method753(class27.field458 ? 1 : 0, true);
        var1.method753(class259.field4317 ? 1 : 0, true);
        int var2 = -41 % ((29 - arg0) / 56);
        var1.method753(class112.field2031, true);
        var1.method753(class156.field2746 ? 1 : 0, true);
        var1.method753(class154.field2727, true);
        var1.method753(class135.field2413, true);
        var1.method753(class256.field4256, true);
        var1.method751(class204.field3452, -1044017976);
        var1.method751(class138.field2465, -1044017976);
        var1.method753(2, true);
        var1.method730(false, class220.field3674);
        var1.method753(class258.field4296, true);
        var1.method753(class25.field413 ? 1 : 0, true);
        return var1;
    }

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "(I)V", line = 963)
    public static final void method631(int arg0) {
        field1424++;
        if (arg0 != 10057) {
            field1425 = (class162) null;
        }
        class270.field4508.method1533(true);
        class134.field2398.method1533(true);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILbd;)I", line = 984)
    public static final int method632(int arg0, class162 arg1) {
        field1427++;
        if (arg1 == null) {
            return -1;
        }
        if (arg0 != 24210) {
            field1418 = (class182) null;
        }
        for (int var2 = 0; var2 < class264.field4403; var2++) {
            if (arg1.method1282(class290.field4891[var2], arg0 ^ 0x5EDB)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILbd;Lbd;I)V", line = 1010)
    public static final void method633(int arg0, class162 arg1, class162 arg2, int arg3) {
        field1431++;
        int var4 = -22 % ((61 - arg3) / 34);
        class63.method426(arg0, -1, arg2, -1, (class162) null, arg1);
    }
}
