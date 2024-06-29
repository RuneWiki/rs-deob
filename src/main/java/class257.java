import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class257 {

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
    public int field4022 = -1;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    public int field4023 = 1190717;

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "Z")
    public boolean field4032 = false;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "I")
    public int field4026 = -1;

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "I")
    public int field4034 = 0;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
    public int field4027 = 8;

    @OriginalMember(owner = "client!ce", name = "q", descriptor = "Z")
    public boolean field4038 = true;

    @OriginalMember(owner = "client!ce", name = "p", descriptor = "I")
    public int field4037 = 16;

    @OriginalMember(owner = "client!ce", name = "r", descriptor = "I")
    public int field4039 = 128;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "Z")
    public boolean field4029 = true;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "[I")
    public static int[] field4028 = new int[2];

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "Lpg;")
    public static class320 field4031 = new class320(64);

    @OriginalMember(owner = "client!ce", name = "n", descriptor = "I")
    public static int field4035 = 0;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    public static int field4024;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
    public static int field4025;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "I")
    public static int field4030;

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!ce", name = "o", descriptor = "I")
    public static int field4036;

    @OriginalMember(owner = "client!ce", name = "s", descriptor = "I")
    public static int field4040;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIBI)V", line = 9)
    public static final void method1760(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        int var5 = -27 / ((arg3 + 11) / 35);
        field4025++;
        if (class206.field3170 <= (arg0 - arg4) && class12.field184 >= (arg0 + arg4) && class119.field1817 <= (arg1 - arg4) && class141.field2187 >= (arg1 + arg4)) {
            class270.method1859(arg0, 25, arg4, arg2, arg1);
        } else {
            class71.method539(arg0, arg4, arg1, arg2, 0);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V", line = 26)
    public static void method1761(byte arg0) {
        field4031 = null;
        field4028 = null;
        if (arg0 > -46) {
            field4028 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lkh;IBI)V", line = 41)
    private final void method1762(class166 arg0, int arg1, byte arg2, int arg3) {
        if (arg2 != -95) {
            this.method1762((class166) null, -116, (byte) 92, 119);
        }
        field4030++;
        if (arg1 == 1) {
            this.field4034 = class107.method777(arg2 - 28, arg0.method1156((byte) 115));
        } else if (arg1 == 2) {
            this.field4022 = arg0.method1178(0);
        } else if (arg1 == 3) {
            this.field4022 = arg0.method1151(arg2 ^ 0x13);
            if (this.field4022 == 65535) {
                this.field4022 = -1;
            }
        } else if (arg1 == 5) {
            this.field4029 = false;
        } else if (arg1 == 7) {
            this.field4026 = class107.method777(-108, arg0.method1156((byte) 29));
        } else if (arg1 == 8) {
            class318.field4976 = arg3;
        } else if (arg1 == 9) {
            this.field4039 = arg0.method1151(-66);
        } else if (arg1 == 10) {
            this.field4038 = false;
        } else if (arg1 == 11) {
            this.field4027 = arg0.method1178(0);
        } else if (arg1 == 12) {
            this.field4032 = true;
        } else if (arg1 == 13) {
            this.field4023 = arg0.method1156((byte) 110);
        } else if (arg1 == 14) {
            this.field4037 = arg0.method1178(0);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IILkh;)V", line = 115)
    public final void method1763(int arg0, int arg1, class166 arg2) {
        if (arg1 != 0) {
            this.method1762((class166) null, 125, (byte) -103, 24);
        }
        while (true) {
            int var4 = arg2.method1178(0);
            if (var4 == 0) {
                field4033++;
                return;
            }
            this.method1762(arg2, var4, (byte) -95, arg0);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZIIZLvg;IIIIII)V", line = 159)
    public static final void method1764(boolean arg0, int arg1, int arg2, boolean arg3, class303 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field4036++;
        if (arg3 && !class19.method150(-84) && (class92.field1468[0][arg1][arg6] & 0x2) == 0) {
            if ((class92.field1468[arg8][arg1][arg6] & 0x10) != 0) {
                return;
            }
            if (class342.method2365(arg6, 1, arg1, arg8) != class276.field4262) {
                return;
            }
        }
        if (class237.field3779 > arg8) {
            class237.field3779 = arg8;
        }
        class85 var11 = class201.method1431(-113, arg5);
        if (class94.field1516 && var11.field1372) {
            return;
        }
        int var12;
        int var13;
        if (arg7 == 1 || arg7 == 3) {
            var13 = var11.field1390;
            var12 = var11.field1385;
        } else {
            var12 = var11.field1390;
            var13 = var11.field1385;
        }
        int var14;
        int var15;
        if ((arg1 + var12) > 104) {
            var14 = arg1;
            var15 = arg1 + 1;
        } else {
            var15 = (var12 + 1 >> 1) + arg1;
            var14 = (var12 >> 1) + arg1;
        }
        int[][] var16 = class218.field3321[arg10];
        int var17 = (arg1 << 7) + (var12 << 6);
        int var18;
        int var19;
        if ((arg6 + var13) <= 104) {
            var18 = (var13 + 1 >> 1) + arg6;
            var19 = arg6 + (var13 >> 1);
        } else {
            var18 = arg6 + 1;
            var19 = arg6;
        }
        if (arg2 != -28552) {
            field4035 = -25;
        }
        int var20 = (arg6 << 7) + (var13 << 6);
        int var21 = var16[var14][var18] + var16[var15][var18] + var16[var14][var19] + var16[var15][var19] >> 2;
        int var22 = 0;
        if (class94.field1516 && arg10 != 0) {
            int[][] var23 = class218.field3321[0];
            var22 = var21 - (var23[var14][var19] + var23[var15][var19] + var23[var14][var18] + var23[var15][var18] >> 2);
        }
        long var24 = (long) (arg7 | 0x400 << 20 | arg6 << 7 | arg1 | arg9 << 14);
        int[][] var26 = (int[][]) null;
        if (var11.field1377 == 0 || arg0) {
            var24 |= Long.MIN_VALUE;
        }
        if (arg0) {
            var26 = class216.field3293[0];
        } else if (arg10 < 3) {
            var26 = class218.field3321[arg10 + 1];
        }
        if (var11.field1316 == 1) {
            var24 |= 0x400000L;
        }
        if (var11.field1341) {
            var24 |= 0x80000000L;
        }
        long var27 = var24 | (long) arg5 << 32;
        if (var11.method609(-102)) {
            class11.method82(arg8, var11, arg6, (class313) null, (class33) null, arg1, 128, arg7);
        }
        int var29 = var11.field1350;
        boolean var30 = !arg0 & var11.field1344;
        if (arg9 == 22) {
            if (class260.field4071 || var11.field1377 != 0 || var11.field1337 == 1 || var11.field1336) {
                class253 var78;
                if (var29 == -1 && var11.field1375 == null && !var11.field1379) {
                    class121 var77 = var11.method604(arg7, var21, var26, (class168) null, var20, var30, arg3, var17, 1343828227, 22, var16);
                    if (class94.field1516 && var30) {
                        class6.method41(var77.field1850, var17, var22, var20);
                    }
                    var78 = var77.field1843;
                } else {
                    var78 = new class233(arg5, 22, arg7, arg10, arg1, arg6, var29, var11.field1347, (class253) null);
                }
                class324.method2202(arg8, arg1, arg6, var21, var78, var27, var11.field1317);
                if (var11.field1337 == 1 && arg4 != null) {
                    arg4.method2069(arg6, arg1, 113);
                }
            }
        } else if (arg9 == 10 || arg9 == 11) {
            class253 var72;
            if (var29 == -1 && var11.field1375 == null && !var11.field1379) {
                class121 var71 = var11.method604(arg9 == 11 ? arg7 + 4 : arg7, var21, var26, (class168) null, var20, var30, arg3, var17, 1343828227, 10, var16);
                if (class94.field1516 && var30) {
                    class6.method41(var71.field1850, var17, var22, var20);
                }
                var72 = var71.field1843;
            } else {
                var72 = new class233(arg5, 10, arg9 == 11 ? arg7 + 4 : arg7, arg10, arg1, arg6, var29, var11.field1347, (class253) null);
            }
            if (var72 != null) {
                boolean var73 = class184.method1323(arg8, arg1, arg6, var21, var12, var13, var72, 0, var27);
                if (var11.field1346 && var73 && arg3) {
                    int var74 = 15;
                    if (var72 instanceof class221) {
                        var74 = ((class221) var72).method171() / 4;
                        if (var74 > 30) {
                            var74 = 30;
                        }
                    }
                    for (int var75 = 0; var75 <= var12; var75++) {
                        for (int var76 = 0; var76 <= var13; var76++) {
                            if (class228.field3626[arg8][arg1 + var75][arg6 + var76] < var74) {
                                class228.field3626[arg8][arg1 + var75][arg6 + var76] = (byte) var74;
                            }
                        }
                    }
                }
            }
            if (var11.field1337 != 0 && arg4 != null) {
                arg4.method2063(-3, var12, arg6, arg1, !var11.field1348, var11.field1368, var13);
            }
        } else if (arg9 >= 12) {
            class253 var70;
            if (var29 == -1 && var11.field1375 == null && !var11.field1379) {
                class121 var69 = var11.method604(arg7, var21, var26, (class168) null, var20, var30, arg3, var17, 1343828227, arg9, var16);
                if (class94.field1516 && var30) {
                    class6.method41(var69.field1850, var17, var22, var20);
                }
                var70 = var69.field1843;
            } else {
                var70 = new class233(arg5, arg9, arg7, arg10, arg1, arg6, var29, var11.field1347, (class253) null);
            }
            class184.method1323(arg8, arg1, arg6, var21, 1, 1, var70, 0, var27);
            if (arg3 && arg9 >= 12 && arg9 <= 17 && arg9 != 13 && arg8 > 0 && var11.field1329 != 0) {
                class61.field989[arg8][arg1][arg6] = class222.method1577(class61.field989[arg8][arg1][arg6], 4);
            }
            if (var11.field1337 != 0 && arg4 != null) {
                arg4.method2063(-3, var12, arg6, arg1, !var11.field1348, var11.field1368, var13);
            }
        } else if (arg9 == 0) {
            class253 var32;
            if (var29 == -1 && var11.field1375 == null && !var11.field1379) {
                class121 var31 = var11.method604(arg7, var21, var26, (class168) null, var20, var30, arg3, var17, 1343828227, 0, var16);
                if (class94.field1516 && var30) {
                    class6.method41(var31.field1850, var17, var22, var20);
                }
                var32 = var31.field1843;
            } else {
                var32 = new class233(arg5, 0, arg7, arg10, arg1, arg6, var29, var11.field1347, (class253) null);
            }
            class116.method858(arg8, arg1, arg6, var21, var32, (class253) null, class295.field4566[arg7], 0, var27);
            if (arg3) {
                if (arg7 == 0) {
                    if (var11.field1346) {
                        class228.field3626[arg8][arg1][arg6] = 50;
                        class228.field3626[arg8][arg1][arg6 + 1] = 50;
                    }
                    if (var11.field1329 == 1) {
                        class61.field989[arg8][arg1][arg6] = class222.method1577(class61.field989[arg8][arg1][arg6], 1);
                    }
                } else if (arg7 == 1) {
                    if (var11.field1346) {
                        class228.field3626[arg8][arg1][arg6 + 1] = 50;
                        class228.field3626[arg8][arg1 + 1][arg6 + 1] = 50;
                    }
                    if (var11.field1329 == 1) {
                        class61.field989[arg8][arg1][arg6 + 1] = class222.method1577(class61.field989[arg8][arg1][arg6 + 1], 2);
                    }
                } else if (arg7 == 2) {
                    if (var11.field1346) {
                        class228.field3626[arg8][arg1 + 1][arg6] = 50;
                        class228.field3626[arg8][arg1 + 1][arg6 + 1] = 50;
                    }
                    if (var11.field1329 == 1) {
                        class61.field989[arg8][arg1 + 1][arg6] = class222.method1577(class61.field989[arg8][arg1 + 1][arg6], 1);
                    }
                } else if (arg7 == 3) {
                    if (var11.field1346) {
                        class228.field3626[arg8][arg1][arg6] = 50;
                        class228.field3626[arg8][arg1 + 1][arg6] = 50;
                    }
                    if (var11.field1329 == 1) {
                        class61.field989[arg8][arg1][arg6] = class222.method1577(class61.field989[arg8][arg1][arg6], 2);
                    }
                }
            }
            if (var11.field1337 != 0 && arg4 != null) {
                arg4.method2061(arg9, var11.field1368, arg6, arg7, !var11.field1348, arg1, arg2 + 28674);
            }
            if (var11.field1343 != 16) {
                class165.method1115(arg8, arg1, arg6, var11.field1343);
            }
        } else if (arg9 == 1) {
            class253 var68;
            if (var29 == -1 && var11.field1375 == null && !var11.field1379) {
                class121 var67 = var11.method604(arg7, var21, var26, (class168) null, var20, var30, arg3, var17, 1343828227, 1, var16);
                if (class94.field1516 && var30) {
                    class6.method41(var67.field1850, var17, var22, var20);
                }
                var68 = var67.field1843;
            } else {
                var68 = new class233(arg5, 1, arg7, arg10, arg1, arg6, var29, var11.field1347, (class253) null);
            }
            class116.method858(arg8, arg1, arg6, var21, var68, (class253) null, class162.field2436[arg7], 0, var27);
            if (var11.field1346 && arg3) {
                if (arg7 == 0) {
                    class228.field3626[arg8][arg1][arg6 + 1] = 50;
                } else if (arg7 == 1) {
                    class228.field3626[arg8][arg1 + 1][arg6 + 1] = 50;
                } else if (arg7 == 2) {
                    class228.field3626[arg8][arg1 + 1][arg6] = 50;
                } else if (arg7 == 3) {
                    class228.field3626[arg8][arg1][arg6] = 50;
                }
            }
            if (var11.field1337 != 0 && arg4 != null) {
                arg4.method2061(arg9, var11.field1368, arg6, arg7, !var11.field1348, arg1, arg2 ^ 0x6FB4);
            }
        } else if (arg9 == 2) {
            int var33 = arg7 + 1 & 0x3;
            class253 var35;
            class253 var37;
            if (var29 == -1 && var11.field1375 == null && !var11.field1379) {
                class121 var34 = var11.method604(arg7 + 4, var21, var26, (class168) null, var20, var30, arg3, var17, arg2 + 1343856779, 2, var16);
                if (class94.field1516 && var30) {
                    class6.method41(var34.field1850, var17, var22, var20);
                }
                var35 = var34.field1843;
                class121 var36 = var11.method604(var33, var21, var26, (class168) null, var20, var30, arg3, var17, 1343828227, 2, var16);
                if (class94.field1516 && var30) {
                    class6.method41(var36.field1850, var17, var22, var20);
                }
                var37 = var36.field1843;
            } else {
                var35 = new class233(arg5, 2, arg7 + 4, arg10, arg1, arg6, var29, var11.field1347, (class253) null);
                var37 = new class233(arg5, 2, var33, arg10, arg1, arg6, var29, var11.field1347, (class253) null);
            }
            class116.method858(arg8, arg1, arg6, var21, var35, var37, class295.field4566[arg7], class295.field4566[var33], var27);
            if (var11.field1329 == 1 && arg3) {
                if (arg7 == 0) {
                    class61.field989[arg8][arg1][arg6] = class222.method1577(class61.field989[arg8][arg1][arg6], 1);
                    class61.field989[arg8][arg1][arg6 + 1] = class222.method1577(class61.field989[arg8][arg1][arg6 + 1], 2);
                } else if (arg7 == 1) {
                    class61.field989[arg8][arg1][arg6 + 1] = class222.method1577(class61.field989[arg8][arg1][arg6 + 1], 2);
                    class61.field989[arg8][arg1 + 1][arg6] = class222.method1577(class61.field989[arg8][arg1 + 1][arg6], 1);
                } else if (arg7 == 2) {
                    class61.field989[arg8][arg1 + 1][arg6] = class222.method1577(class61.field989[arg8][arg1 + 1][arg6], 1);
                    class61.field989[arg8][arg1][arg6] = class222.method1577(class61.field989[arg8][arg1][arg6], 2);
                } else if (arg7 == 3) {
                    class61.field989[arg8][arg1][arg6] = class222.method1577(class61.field989[arg8][arg1][arg6], 2);
                    class61.field989[arg8][arg1][arg6] = class222.method1577(class61.field989[arg8][arg1][arg6], 1);
                }
            }
            if (var11.field1337 != 0 && arg4 != null) {
                arg4.method2061(arg9, var11.field1368, arg6, arg7, !var11.field1348, arg1, -75);
            }
            if (var11.field1343 != 16) {
                class165.method1115(arg8, arg1, arg6, var11.field1343);
            }
        } else if (arg9 == 3) {
            class253 var66;
            if (var29 == -1 && var11.field1375 == null && !var11.field1379) {
                class121 var65 = var11.method604(arg7, var21, var26, (class168) null, var20, var30, arg3, var17, arg2 ^ 0xAFE6A17B, 3, var16);
                if (class94.field1516 && var30) {
                    class6.method41(var65.field1850, var17, var22, var20);
                }
                var66 = var65.field1843;
            } else {
                var66 = new class233(arg5, 3, arg7, arg10, arg1, arg6, var29, var11.field1347, (class253) null);
            }
            class116.method858(arg8, arg1, arg6, var21, var66, (class253) null, class162.field2436[arg7], 0, var27);
            if (var11.field1346 && arg3) {
                if (arg7 == 0) {
                    class228.field3626[arg8][arg1][arg6 + 1] = 50;
                } else if (arg7 == 1) {
                    class228.field3626[arg8][arg1 + 1][arg6 + 1] = 50;
                } else if (arg7 == 2) {
                    class228.field3626[arg8][arg1 + 1][arg6] = 50;
                } else if (arg7 == 3) {
                    class228.field3626[arg8][arg1][arg6] = 50;
                }
            }
            if (var11.field1337 != 0 && arg4 != null) {
                arg4.method2061(arg9, var11.field1368, arg6, arg7, !var11.field1348, arg1, -106);
            }
        } else if (arg9 == 9) {
            class253 var39;
            if (var29 == -1 && var11.field1375 == null && !var11.field1379) {
                class121 var38 = var11.method604(arg7, var21, var26, (class168) null, var20, var30, arg3, var17, arg2 ^ 0xAFE6A17B, arg9, var16);
                if (class94.field1516 && var30) {
                    class6.method41(var38.field1850, var17, var22, var20);
                }
                var39 = var38.field1843;
            } else {
                var39 = new class233(arg5, arg9, arg7, arg10, arg1, arg6, var29, var11.field1347, (class253) null);
            }
            class184.method1323(arg8, arg1, arg6, var21, 1, 1, var39, 0, var27);
            if (var11.field1337 != 0 && arg4 != null) {
                arg4.method2063(arg2 ^ 0x6F85, var12, arg6, arg1, !var11.field1348, var11.field1368, var13);
            }
            if (var11.field1343 != 16) {
                class165.method1115(arg8, arg1, arg6, var11.field1343);
            }
        } else if (arg9 == 4) {
            class253 var41;
            if (var29 == -1 && var11.field1375 == null && !var11.field1379) {
                class121 var40 = var11.method604(arg7, var21, var26, (class168) null, var20, var30, arg3, var17, 1343828227, 4, var16);
                if (class94.field1516 && var30) {
                    class6.method41(var40.field1850, var17, var22, var20);
                }
                var41 = var40.field1843;
            } else {
                var41 = new class233(arg5, 4, arg7, arg10, arg1, arg6, var29, var11.field1347, (class253) null);
            }
            class252.method1743(arg8, arg1, arg6, var21, var41, (class253) null, class295.field4566[arg7], 0, 0, 0, var27);
        } else if (arg9 == 5) {
            int var60 = 16;
            long var61 = class10.method78(arg8, arg1, arg6);
            if (var61 != 0L) {
                var60 = class201.method1431(arg2 ^ 0x6FE7, (int) (var61 >>> 32) & Integer.MAX_VALUE).field1343;
            }
            class253 var64;
            if (var29 == -1 && var11.field1375 == null && !var11.field1379) {
                class121 var63 = var11.method604(arg7, var21, var26, (class168) null, var20, var30, arg3, var17, 1343828227, 4, var16);
                if (class94.field1516 && var30) {
                    class6.method41(var63.field1850, var17 - (class338.field5286[arg7] * 8), var22, var20 - class61.field981[arg7] * 8);
                }
                var64 = var63.field1843;
            } else {
                var64 = new class233(arg5, 4, arg7, arg10, arg1, arg6, var29, var11.field1347, (class253) null);
            }
            class252.method1743(arg8, arg1, arg6, var21, var64, (class253) null, class295.field4566[arg7], 0, class338.field5286[arg7] * var60, class61.field981[arg7] * var60, var27);
        } else if (arg9 == 6) {
            int var55 = 8;
            long var56 = class10.method78(arg8, arg1, arg6);
            if (var56 != 0L) {
                var55 = class201.method1431(arg2 ^ 0x6FE2, Integer.MAX_VALUE & (int) (var56 >>> 32)).field1343 / 2;
            }
            class253 var59;
            if (var29 == -1 && var11.field1375 == null && !var11.field1379) {
                class121 var58 = var11.method604(arg7 + 4, var21, var26, (class168) null, var20, var30, arg3, var17, arg2 ^ 0xAFE6A17B, 4, var16);
                if (class94.field1516 && var30) {
                    class6.method41(var58.field1850, var17 - class111.field1732[arg7] * 8, var22, var20 - class239.field3810[arg7] * 8);
                }
                var59 = var58.field1843;
            } else {
                var59 = new class233(arg5, 4, arg7 + 4, arg10, arg1, arg6, var29, var11.field1347, (class253) null);
            }
            class252.method1743(arg8, arg1, arg6, var21, var59, (class253) null, 256, arg7, class111.field1732[arg7] * var55, class239.field3810[arg7] * var55, var27);
        } else if (arg9 == 7) {
            int var52 = arg7 + 2 & 0x3;
            class253 var54;
            if (var29 == -1 && var11.field1375 == null && !var11.field1379) {
                class121 var53 = var11.method604(var52 + 4, var21, var26, (class168) null, var20, var30, arg3, var17, arg2 ^ 0xAFE6A17B, 4, var16);
                if (class94.field1516 && var30) {
                    class6.method41(var53.field1850, var17, var22, var20);
                }
                var54 = var53.field1843;
            } else {
                var54 = new class233(arg5, 4, var52 + 4, arg10, arg1, arg6, var29, var11.field1347, (class253) null);
            }
            class252.method1743(arg8, arg1, arg6, var21, var54, (class253) null, 256, var52, 0, 0, var27);
        } else if (arg9 == 8) {
            int var42 = 8;
            long var43 = class10.method78(arg8, arg1, arg6);
            if (var43 != 0L) {
                var42 = class201.method1431(-101, (int) (var43 >>> 32) & Integer.MAX_VALUE).field1343 / 2;
            }
            int var45 = arg7 + 2 & 0x3;
            class253 var49;
            class253 var51;
            if (var29 == -1 && var11.field1375 == null && !var11.field1379) {
                int var46 = class239.field3810[arg7] * 8;
                int var47 = class111.field1732[arg7] * 8;
                class121 var48 = var11.method604(arg7 + 4, var21, var26, (class168) null, var20, var30, arg3, var17, 1343828227, 4, var16);
                if (class94.field1516 && var30) {
                    class6.method41(var48.field1850, var17 - var47, var22, var20 - var46);
                }
                var49 = var48.field1843;
                class121 var50 = var11.method604(var45 + 4, var21, var26, (class168) null, var20, var30, arg3, var17, 1343828227, 4, var16);
                if (class94.field1516 && var30) {
                    class6.method41(var50.field1850, var17 - var47, var22, var20 - var46);
                }
                var51 = var50.field1843;
            } else {
                var49 = new class233(arg5, 4, arg7 + 4, arg10, arg1, arg6, var29, var11.field1347, (class253) null);
                var51 = new class233(arg5, 4, var45 + 4, arg10, arg1, arg6, var29, var11.field1347, (class253) null);
            }
            class252.method1743(arg8, arg1, arg6, var21, var49, var51, 256, arg7, class111.field1732[arg7] * var42, class239.field3810[arg7] * var42, var27);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(FIIIIZIB)[I", line = 814)
    public static final int[] method1765(float arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, byte arg7) {
        field4040++;
        int[] var8 = new int[arg6];
        class331 var9 = new class331();
        var9.field5138 = arg3;
        var9.field5150 = (int) (arg0 * 4096.0F);
        var9.field5140 = arg1;
        var9.field5149 = arg5;
        var9.field5155 = arg4;
        var9.field5142 = arg2;
        var9.method381(-86);
        class80.method577(1, 0, arg6);
        var9.method2295(false, var8, 0);
        return arg7 < 0 ? (int[]) null : var8;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IZ)V", line = 845)
    public static final void method1766(int arg0, boolean arg1) {
        class307.field4773 = (byte[][][]) null;
        class99.field1576 = null;
        class89.field1432 = (byte[][][]) null;
        class270.field4210 = (int[][][]) null;
        class150.field2268 = (byte[][][]) null;
        class70.field1139 = (byte[][][]) null;
        if (arg1 && class214.field3256 != null) {
            class1.field2 = class214.field3256.field28;
        } else {
            class1.field2 = -1;
        }
        class35.field536 = 0;
        class223.field3545 = (int[][][]) null;
        class188.field2808 = (int[][][]) null;
        field4024++;
        class214.field3256 = null;
        class19.field260 = (byte[][][]) null;
        class110.field1712 = null;
        class44.field705.method634((byte) 86);
        class41.field614 = null;
        class299.field4622 = null;
        class337.field5273 = null;
        class278.field4286 = null;
        int var2 = 29 % ((arg0 - 55) / 40);
        class162.field2445 = null;
        class295.field4565 = null;
        class54.field911 = -1;
        class290.field4513 = null;
        class253.field3987 = null;
        class327.field5088 = null;
        class265.field4132 = null;
        class273.field4228 = -1;
        class51.field827 = null;
    }
}
