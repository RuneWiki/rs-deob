import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class140 {

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "I")
    public static int field2436;

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "I")
    public static int field2441;

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "I")
    public int field2443;

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "Ljf;")
    public class229 field2440;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "Lui;")
    public static class268 field2437;

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "Lnf;")
    public static class67 field2438;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZIZLqg;IIBIIII)V", line = 19)
    public static final void method981(boolean arg0, int arg1, boolean arg2, class244 arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9, int arg10) {
        field2436++;
        int var11 = -101 % ((arg6 - 12) / 42);
        if (arg2 && !class110.method781((byte) 127) && (class142.field2464[0][arg10][arg4] & 0x2) == 0) {
            if ((class142.field2464[arg1][arg10][arg4] & 0x10) != 0) {
                return;
            }
            if (class212.method1453(arg4, 122, arg10, arg1) != class225.field3852) {
                return;
            }
        }
        if (class287.field4915 > arg1) {
            class287.field4915 = arg1;
        }
        class83 var12 = class271.method1909(-40, arg9);
        if (class108.field1900 && var12.field1570) {
            return;
        }
        int var13;
        int var14;
        if (arg7 == 1 || arg7 == 3) {
            var14 = var12.field1572;
            var13 = var12.field1528;
        } else {
            var13 = var12.field1572;
            var14 = var12.field1528;
        }
        int var15;
        int var16;
        if (arg10 + var14 <= 104) {
            var15 = arg10 + (var14 + 1 >> 1);
            var16 = (var14 >> 1) + arg10;
        } else {
            var16 = arg10;
            var15 = arg10 + 1;
        }
        int var17;
        int var18;
        if ((arg4 + var13) <= 104) {
            var17 = (var13 + 1 >> 1) + arg4;
            var18 = arg4 + (var13 >> 1);
        } else {
            var18 = arg4;
            var17 = arg4 + 1;
        }
        int[][] var19 = class132.field2328[arg8];
        int var20 = var19[var15][var17] + var19[var16][var17] + var19[var15][var18] + var19[var16][var18] >> 2;
        int var21 = (arg4 << 7) + (var13 << 6);
        int var22 = (arg10 << 7) + (var14 << 6);
        int var23 = 0;
        if (class108.field1900 && arg8 != 0) {
            int[][] var24 = class132.field2328[0];
            var23 = var20 - (var24[var15][var18] + var24[var16][var18] + var24[var15][var17] + var24[var16][var17] >> 2);
        }
        int[][] var25 = (int[][]) null;
        if (arg0) {
            var25 = class16.field256[0];
        } else if (arg8 < 3) {
            var25 = class132.field2328[arg8 + 1];
        }
        long var26 = (long) (arg7 | 0x400 << 20 | arg5 << 14 | arg10 | arg4 << 7);
        if (var12.field1566 == 0 || arg0) {
            var26 |= Long.MIN_VALUE;
        }
        if (var12.field1552 == 1) {
            var26 |= 0x400000L;
        }
        if (var12.field1559) {
            var26 |= 0x80000000L;
        }
        long var28 = var26 | (long) arg9 << 32;
        if (var12.method602(-22802)) {
            class172.method1171((class331) null, false, arg7, (class33) null, arg4, var12, arg1, arg10);
        }
        boolean var30 = var12.field1537 & !arg0;
        if (arg5 == 22) {
            if (class41.field735 || var12.field1566 != 0 || var12.field1551 == 1 || var12.field1560) {
                class174 var78;
                if (var12.field1583 == -1 && var12.field1593 == null && !var12.field1574) {
                    class72 var77 = var12.method600(var22, var25, var30, 22, var20, 0, arg2, var21, arg7, (class248) null, var19);
                    if (class108.field1900 && var30) {
                        class139.method963(var77.field1384, var22, var23, var21);
                    }
                    var78 = var77.field1383;
                } else {
                    var78 = new class20(arg9, 22, arg7, arg8, arg10, arg4, var12.field1583, var12.field1576, (class174) null);
                }
                class256.method1830(arg1, arg10, arg4, var20, var78, var28, var12.field1596);
                if (var12.field1551 == 1 && arg3 != null) {
                    arg3.method1771(arg4, arg10, true);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class174 var72;
            if (var12.field1583 == -1 && var12.field1593 == null && !var12.field1574) {
                class72 var71 = var12.method600(var22, var25, var30, 10, var20, 0, arg2, var21, arg5 == 11 ? arg7 + 4 : arg7, (class248) null, var19);
                if (class108.field1900 && var30) {
                    class139.method963(var71.field1384, var22, var23, var21);
                }
                var72 = var71.field1383;
            } else {
                var72 = new class20(arg9, 10, arg5 == 11 ? arg7 + 4 : arg7, arg8, arg10, arg4, var12.field1583, var12.field1576, (class174) null);
            }
            if (var72 != null) {
                boolean var73 = class80.method570(arg1, arg10, arg4, var20, var14, var13, var72, 0, var28);
                if (var12.field1568 && var73 && arg2) {
                    int var74 = 15;
                    if (var72 instanceof class196) {
                        var74 = ((class196) var72).method295() / 4;
                        if (var74 > 30) {
                            var74 = 30;
                        }
                    }
                    for (int var75 = 0; var75 <= var14; var75++) {
                        for (int var76 = 0; var76 <= var13; var76++) {
                            if (var74 > class70.field1334[arg1][arg10 + var75][arg4 + var76]) {
                                class70.field1334[arg1][arg10 + var75][arg4 + var76] = (byte) var74;
                            }
                        }
                    }
                }
            }
            if (var12.field1551 != 0 && arg3 != null) {
                arg3.method1773(arg10, var14, -18750, var13, arg4, var12.field1592);
            }
        } else if (arg5 >= 12) {
            class174 var70;
            if (var12.field1583 == -1 && var12.field1593 == null && !var12.field1574) {
                class72 var69 = var12.method600(var22, var25, var30, arg5, var20, 0, arg2, var21, arg7, (class248) null, var19);
                if (class108.field1900 && var30) {
                    class139.method963(var69.field1384, var22, var23, var21);
                }
                var70 = var69.field1383;
            } else {
                var70 = new class20(arg9, arg5, arg7, arg8, arg10, arg4, var12.field1583, var12.field1576, (class174) null);
            }
            class80.method570(arg1, arg10, arg4, var20, 1, 1, var70, 0, var28);
            if (arg2 && arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg1 > 0) {
                class220.field3760[arg1][arg10][arg4] = class97.method665(class220.field3760[arg1][arg10][arg4], 4);
            }
            if (var12.field1551 != 0 && arg3 != null) {
                arg3.method1773(arg10, var14, -18750, var13, arg4, var12.field1592);
            }
        } else if (arg5 == 0) {
            class174 var32;
            if (var12.field1583 == -1 && var12.field1593 == null && !var12.field1574) {
                class72 var31 = var12.method600(var22, var25, var30, 0, var20, 0, arg2, var21, arg7, (class248) null, var19);
                if (class108.field1900 && var30) {
                    class139.method963(var31.field1384, var22, var23, var21);
                }
                var32 = var31.field1383;
            } else {
                var32 = new class20(arg9, 0, arg7, arg8, arg10, arg4, var12.field1583, var12.field1576, (class174) null);
            }
            class35.method312(arg1, arg10, arg4, var20, var32, (class174) null, class299.field5091[arg7], 0, var28);
            if (arg2) {
                if (arg7 == 0) {
                    if (var12.field1568) {
                        class70.field1334[arg1][arg10][arg4] = 50;
                        class70.field1334[arg1][arg10][arg4 + 1] = 50;
                    }
                    if (var12.field1543) {
                        class220.field3760[arg1][arg10][arg4] = class97.method665(class220.field3760[arg1][arg10][arg4], 1);
                    }
                } else if (arg7 == 1) {
                    if (var12.field1568) {
                        class70.field1334[arg1][arg10][arg4 + 1] = 50;
                        class70.field1334[arg1][arg10 + 1][arg4 + 1] = 50;
                    }
                    if (var12.field1543) {
                        class220.field3760[arg1][arg10][arg4 + 1] = class97.method665(class220.field3760[arg1][arg10][arg4 + 1], 2);
                    }
                } else if (arg7 == 2) {
                    if (var12.field1568) {
                        class70.field1334[arg1][arg10 + 1][arg4] = 50;
                        class70.field1334[arg1][arg10 + 1][arg4 + 1] = 50;
                    }
                    if (var12.field1543) {
                        class220.field3760[arg1][arg10 + 1][arg4] = class97.method665(class220.field3760[arg1][arg10 + 1][arg4], 1);
                    }
                } else if (arg7 == 3) {
                    if (var12.field1568) {
                        class70.field1334[arg1][arg10][arg4] = 50;
                        class70.field1334[arg1][arg10 + 1][arg4] = 50;
                    }
                    if (var12.field1543) {
                        class220.field3760[arg1][arg10][arg4] = class97.method665(class220.field3760[arg1][arg10][arg4], 2);
                    }
                }
            }
            if (var12.field1551 != 0 && arg3 != null) {
                arg3.method1758(arg7, var12.field1592, arg4, arg10, (byte) -77, arg5);
            }
            if (var12.field1531 != 16) {
                class73.method533(arg1, arg10, arg4, var12.field1531);
            }
        } else if (arg5 == 1) {
            class174 var68;
            if (var12.field1583 == -1 && var12.field1593 == null && !var12.field1574) {
                class72 var67 = var12.method600(var22, var25, var30, 1, var20, 0, arg2, var21, arg7, (class248) null, var19);
                if (class108.field1900 && var30) {
                    class139.method963(var67.field1384, var22, var23, var21);
                }
                var68 = var67.field1383;
            } else {
                var68 = new class20(arg9, 1, arg7, arg8, arg10, arg4, var12.field1583, var12.field1576, (class174) null);
            }
            class35.method312(arg1, arg10, arg4, var20, var68, (class174) null, class275.field4713[arg7], 0, var28);
            if (var12.field1568 && arg2) {
                if (arg7 == 0) {
                    class70.field1334[arg1][arg10][arg4 + 1] = 50;
                } else if (arg7 == 1) {
                    class70.field1334[arg1][arg10 + 1][arg4 + 1] = 50;
                } else if (arg7 == 2) {
                    class70.field1334[arg1][arg10 + 1][arg4] = 50;
                } else if (arg7 == 3) {
                    class70.field1334[arg1][arg10][arg4] = 50;
                }
            }
            if (var12.field1551 != 0 && arg3 != null) {
                arg3.method1758(arg7, var12.field1592, arg4, arg10, (byte) -77, arg5);
            }
        } else if (arg5 == 2) {
            int var62 = arg7 + 1 & 0x3;
            class174 var64;
            class174 var66;
            if (var12.field1583 == -1 && var12.field1593 == null && !var12.field1574) {
                class72 var63 = var12.method600(var22, var25, var30, 2, var20, 0, arg2, var21, arg7 + 4, (class248) null, var19);
                if (class108.field1900 && var30) {
                    class139.method963(var63.field1384, var22, var23, var21);
                }
                var64 = var63.field1383;
                class72 var65 = var12.method600(var22, var25, var30, 2, var20, 0, arg2, var21, var62, (class248) null, var19);
                if (class108.field1900 && var30) {
                    class139.method963(var65.field1384, var22, var23, var21);
                }
                var66 = var65.field1383;
            } else {
                var64 = new class20(arg9, 2, arg7 + 4, arg8, arg10, arg4, var12.field1583, var12.field1576, (class174) null);
                var66 = new class20(arg9, 2, var62, arg8, arg10, arg4, var12.field1583, var12.field1576, (class174) null);
            }
            class35.method312(arg1, arg10, arg4, var20, var64, var66, class299.field5091[arg7], class299.field5091[var62], var28);
            if (var12.field1543 && arg2) {
                if (arg7 == 0) {
                    class220.field3760[arg1][arg10][arg4] = class97.method665(class220.field3760[arg1][arg10][arg4], 1);
                    class220.field3760[arg1][arg10][arg4 + 1] = class97.method665(class220.field3760[arg1][arg10][arg4 + 1], 2);
                } else if (arg7 == 1) {
                    class220.field3760[arg1][arg10][arg4 + 1] = class97.method665(class220.field3760[arg1][arg10][arg4 + 1], 2);
                    class220.field3760[arg1][arg10 + 1][arg4] = class97.method665(class220.field3760[arg1][arg10 + 1][arg4], 1);
                } else if (arg7 == 2) {
                    class220.field3760[arg1][arg10 + 1][arg4] = class97.method665(class220.field3760[arg1][arg10 + 1][arg4], 1);
                    class220.field3760[arg1][arg10][arg4] = class97.method665(class220.field3760[arg1][arg10][arg4], 2);
                } else if (arg7 == 3) {
                    class220.field3760[arg1][arg10][arg4] = class97.method665(class220.field3760[arg1][arg10][arg4], 2);
                    class220.field3760[arg1][arg10][arg4] = class97.method665(class220.field3760[arg1][arg10][arg4], 1);
                }
            }
            if (var12.field1551 != 0 && arg3 != null) {
                arg3.method1758(arg7, var12.field1592, arg4, arg10, (byte) -77, arg5);
            }
            if (var12.field1531 != 16) {
                class73.method533(arg1, arg10, arg4, var12.field1531);
            }
        } else if (arg5 == 3) {
            class174 var34;
            if (var12.field1583 == -1 && var12.field1593 == null && !var12.field1574) {
                class72 var33 = var12.method600(var22, var25, var30, 3, var20, 0, arg2, var21, arg7, (class248) null, var19);
                if (class108.field1900 && var30) {
                    class139.method963(var33.field1384, var22, var23, var21);
                }
                var34 = var33.field1383;
            } else {
                var34 = new class20(arg9, 3, arg7, arg8, arg10, arg4, var12.field1583, var12.field1576, (class174) null);
            }
            class35.method312(arg1, arg10, arg4, var20, var34, (class174) null, class275.field4713[arg7], 0, var28);
            if (var12.field1568 && arg2) {
                if (arg7 == 0) {
                    class70.field1334[arg1][arg10][arg4 + 1] = 50;
                } else if (arg7 == 1) {
                    class70.field1334[arg1][arg10 + 1][arg4 + 1] = 50;
                } else if (arg7 == 2) {
                    class70.field1334[arg1][arg10 + 1][arg4] = 50;
                } else if (arg7 == 3) {
                    class70.field1334[arg1][arg10][arg4] = 50;
                }
            }
            if (var12.field1551 != 0 && arg3 != null) {
                arg3.method1758(arg7, var12.field1592, arg4, arg10, (byte) -77, arg5);
            }
        } else if (arg5 == 9) {
            class174 var61;
            if (var12.field1583 == -1 && var12.field1593 == null && !var12.field1574) {
                class72 var60 = var12.method600(var22, var25, var30, arg5, var20, 0, arg2, var21, arg7, (class248) null, var19);
                if (class108.field1900 && var30) {
                    class139.method963(var60.field1384, var22, var23, var21);
                }
                var61 = var60.field1383;
            } else {
                var61 = new class20(arg9, arg5, arg7, arg8, arg10, arg4, var12.field1583, var12.field1576, (class174) null);
            }
            class80.method570(arg1, arg10, arg4, var20, 1, 1, var61, 0, var28);
            if (var12.field1551 != 0 && arg3 != null) {
                arg3.method1773(arg10, var14, -18750, var13, arg4, var12.field1592);
            }
            if (var12.field1531 != 16) {
                class73.method533(arg1, arg10, arg4, var12.field1531);
            }
        } else if (arg5 == 4) {
            class174 var59;
            if (var12.field1583 == -1 && var12.field1593 == null && !var12.field1574) {
                class72 var58 = var12.method600(var22, var25, var30, 4, var20, 0, arg2, var21, arg7, (class248) null, var19);
                if (class108.field1900 && var30) {
                    class139.method963(var58.field1384, var22, var23, var21);
                }
                var59 = var58.field1383;
            } else {
                var59 = new class20(arg9, 4, arg7, arg8, arg10, arg4, var12.field1583, var12.field1576, (class174) null);
            }
            class78.method557(arg1, arg10, arg4, var20, var59, (class174) null, class299.field5091[arg7], 0, 0, 0, var28);
        } else if (arg5 == 5) {
            int var35 = 16;
            long var36 = class104.method701(arg1, arg10, arg4);
            if (var36 != 0L) {
                var35 = class271.method1909(-32, (int) (var36 >>> 32) & Integer.MAX_VALUE).field1531;
            }
            class174 var39;
            if (var12.field1583 == -1 && var12.field1593 == null && !var12.field1574) {
                class72 var38 = var12.method600(var22, var25, var30, 4, var20, 0, arg2, var21, arg7, (class248) null, var19);
                if (class108.field1900 && var30) {
                    class139.method963(var38.field1384, var22 - (class257.field4483[arg7] * 8), var23, var21 - (class147.field2553[arg7] * 8));
                }
                var39 = var38.field1383;
            } else {
                var39 = new class20(arg9, 4, arg7, arg8, arg10, arg4, var12.field1583, var12.field1576, (class174) null);
            }
            class78.method557(arg1, arg10, arg4, var20, var39, (class174) null, class299.field5091[arg7], 0, class257.field4483[arg7] * var35, class147.field2553[arg7] * var35, var28);
        } else if (arg5 == 6) {
            int var40 = 8;
            long var41 = class104.method701(arg1, arg10, arg4);
            if (var41 != 0L) {
                var40 = class271.method1909(114, Integer.MAX_VALUE & (int) (var41 >>> 32)).field1531 / 2;
            }
            class174 var44;
            if (var12.field1583 == -1 && var12.field1593 == null && !var12.field1574) {
                class72 var43 = var12.method600(var22, var25, var30, 4, var20, 0, arg2, var21, arg7 + 4, (class248) null, var19);
                if (class108.field1900 && var30) {
                    class139.method963(var43.field1384, var22 - (class213.field3646[arg7] * 8), var23, var21 - (class180.field3125[arg7] * 8));
                }
                var44 = var43.field1383;
            } else {
                var44 = new class20(arg9, 4, arg7 + 4, arg8, arg10, arg4, var12.field1583, var12.field1576, (class174) null);
            }
            class78.method557(arg1, arg10, arg4, var20, var44, (class174) null, 256, arg7, class213.field3646[arg7] * var40, class180.field3125[arg7] * var40, var28);
        } else if (arg5 == 7) {
            int var55 = arg7 + 2 & 0x3;
            class174 var57;
            if (var12.field1583 == -1 && var12.field1593 == null && !var12.field1574) {
                class72 var56 = var12.method600(var22, var25, var30, 4, var20, 0, arg2, var21, var55 + 4, (class248) null, var19);
                if (class108.field1900 && var30) {
                    class139.method963(var56.field1384, var22, var23, var21);
                }
                var57 = var56.field1383;
            } else {
                var57 = new class20(arg9, 4, var55 + 4, arg8, arg10, arg4, var12.field1583, var12.field1576, (class174) null);
            }
            class78.method557(arg1, arg10, arg4, var20, var57, (class174) null, 256, var55, 0, 0, var28);
        } else if (arg5 == 8) {
            int var45 = 8;
            int var46 = arg7 + 2 & 0x3;
            long var47 = class104.method701(arg1, arg10, arg4);
            if (var47 != 0L) {
                var45 = class271.method1909(107, (int) (var47 >>> 32) & Integer.MAX_VALUE).field1531 / 2;
            }
            class174 var52;
            class174 var54;
            if (var12.field1583 == -1 && var12.field1593 == null && !var12.field1574) {
                int var49 = class213.field3646[arg7] * 8;
                int var50 = class180.field3125[arg7] * 8;
                class72 var51 = var12.method600(var22, var25, var30, 4, var20, 0, arg2, var21, arg7 + 4, (class248) null, var19);
                if (class108.field1900 && var30) {
                    class139.method963(var51.field1384, var22 - var49, var23, var21 - var50);
                }
                var52 = var51.field1383;
                class72 var53 = var12.method600(var22, var25, var30, 4, var20, 0, arg2, var21, var46 + 4, (class248) null, var19);
                if (class108.field1900 && var30) {
                    class139.method963(var53.field1384, var22 - var49, var23, var21 - var50);
                }
                var54 = var53.field1383;
            } else {
                var52 = new class20(arg9, 4, arg7 + 4, arg8, arg10, arg4, var12.field1583, var12.field1576, (class174) null);
                var54 = new class20(arg9, 4, var46 + 4, arg8, arg10, arg4, var12.field1583, var12.field1576, (class174) null);
            }
            class78.method557(arg1, arg10, arg4, var20, var52, var54, 256, arg7, class213.field3646[arg7] * var45, class180.field3125[arg7] * var45, var28);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)I", line = 680)
    public static final int method982(int arg0) {
        if (arg0 == 1) {
            field2441++;
            return class124.field2183 == null || class124.field2183.field5616 <= class173.field3017 ? -1 : class173.field3017++;
        } else {
            return 106;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Z)V", line = 696)
    public static void method983(boolean arg0) {
        field2438 = null;
        if (!arg0) {
            field2437 = null;
        }
    }
}
