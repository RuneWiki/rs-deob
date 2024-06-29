import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class94 {

    @OriginalMember(owner = "client!he", name = "k", descriptor = "I")
    public static int field1538 = 0;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "[[I")
    public static int[][] field1529 = new int[][] { new int[0], { 128, 0, 128, 128, 0, 128 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 64, 0, 128, 0, 128, 128, 64, 128 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 128, 0, 0, 32, 32, 96, 32, 128, 0, 128, 128 } };

    @OriginalMember(owner = "client!he", name = "z", descriptor = "Lsa;")
    public static class110 field1553 = new class110(16);

    @OriginalMember(owner = "client!he", name = "a", descriptor = "I")
    public int field1528;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "I")
    public int field1532;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "I")
    public int field1534;

    @OriginalMember(owner = "client!he", name = "h", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!he", name = "i", descriptor = "I")
    public int field1536;

    @OriginalMember(owner = "client!he", name = "j", descriptor = "I")
    public int field1537;

    @OriginalMember(owner = "client!he", name = "l", descriptor = "I")
    public int field1539;

    @OriginalMember(owner = "client!he", name = "m", descriptor = "I")
    public int field1540;

    @OriginalMember(owner = "client!he", name = "n", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!he", name = "o", descriptor = "I")
    public int field1542;

    @OriginalMember(owner = "client!he", name = "p", descriptor = "I")
    public int field1543;

    @OriginalMember(owner = "client!he", name = "q", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!he", name = "r", descriptor = "I")
    public int field1545;

    @OriginalMember(owner = "client!he", name = "s", descriptor = "I")
    public int field1546;

    @OriginalMember(owner = "client!he", name = "t", descriptor = "I")
    public int field1547;

    @OriginalMember(owner = "client!he", name = "u", descriptor = "I")
    public int field1548;

    @OriginalMember(owner = "client!he", name = "v", descriptor = "I")
    public int field1549;

    @OriginalMember(owner = "client!he", name = "w", descriptor = "I")
    public int field1550;

    @OriginalMember(owner = "client!he", name = "x", descriptor = "I")
    public int field1551;

    @OriginalMember(owner = "client!he", name = "A", descriptor = "I")
    public int field1554;

    @OriginalMember(owner = "client!he", name = "B", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!he", name = "C", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!he", name = "D", descriptor = "I")
    public int field1557;

    @OriginalMember(owner = "client!he", name = "y", descriptor = "[Lai;")
    public static class126[] field1552;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(II)Lre;", line = 12)
    public static final class278 method672(int arg0, int arg1) {
        field1541++;
        class278 var2 = (class278) class317.field4934.method1830((long) arg0, (byte) 52);
        if (arg1 != 0) {
            return (class278) null;
        } else if (var2 == null) {
            byte[] var3 = class159.field2512.method467(class54.method400(arg0, arg1 + 1023), 120, class141.method1077(arg0, 128));
            class278 var4 = new class278();
            if (var3 != null) {
                var4.method1989(false, new class101(var3));
            }
            class317.field4934.method1831((long) arg0, var4, -13897);
            return var4;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(II)I", line = 34)
    public static int method673(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 56)
    public static final boolean method674(String arg0, int arg1) {
        field1556++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class319.field4971; var2++) {
            if (arg0.equalsIgnoreCase(class329.field5082[var2])) {
                return true;
            }
        }
        if (arg1 != 0) {
            method677(-82, -100, 22, -128, 42, -94, 114);
        }
        if (arg0.equalsIgnoreCase(class19.field356.field494)) {
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V", line = 88)
    public static void method675(int arg0) {
        field1553 = null;
        if (arg0 != 0) {
            method672(20, -46);
        }
        field1552 = null;
        field1529 = (int[][]) null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(III)I", line = 101)
    public static final int method676(int arg0, int arg1, int arg2) {
        field1555++;
        if (arg0 == -1) {
            return 12345678;
        }
        int var3 = (arg1 & arg0) * arg2 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIIIII)V", line = 132)
    public static final void method677(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1544++;
        class181.field2894 = 0;
        for (int var7 = -1; var7 < class65.field1058 + class77.field1173; var7++) {
            class89 var8;
            if (var7 == -1) {
                var8 = class19.field356;
            } else if (var7 >= class65.field1058) {
                var8 = class138.field2196[class145.field2279[var7 - class65.field1058]];
            } else {
                var8 = class82.field1228[class149.field2398[var7]];
            }
            if (var8 != null && var8.method199(58)) {
                if (var8 instanceof class305) {
                    class208 var9 = ((class305) var8).field4778;
                    if (var9.field3313 != null) {
                        var9 = var9.method1518(-4841);
                    }
                    if (var9 == null) {
                        continue;
                    }
                }
                if (class65.field1058 <= var7) {
                    class208 var10 = ((class305) var8).field4778;
                    if (var10.field3313 != null) {
                        var10 = var10.method1518(-4841);
                    }
                    if (var10.field3322 >= 0 && class221.field3525.length > var10.field3322) {
                        int var11;
                        if (var10.field3297 == -1) {
                            var11 = var8.method637((byte) 123) + 15;
                        } else {
                            var11 = var10.field3297 + 15;
                        }
                        class243.method1727(var8, arg1, arg2 >> 1, var11, arg5 >> 1, arg0, -82);
                        if (class326.field5065 > -1) {
                            class221.field3525[var10.field3322].method59(arg3 + class326.field5065 - 12, arg4 + -30 + class67.field1080);
                        }
                    }
                    class210[] var12 = class88.field1341;
                    for (int var13 = 0; var13 < var12.length; var13++) {
                        class210 var14 = var12[var13];
                        if (var14 != null && var14.field3358 == 1 && class145.field2279[var7 - class65.field1058] == var14.field3364 && class205.field3252 % 20 < 10) {
                            int var15;
                            if (var10.field3297 == -1) {
                                var15 = var8.method637((byte) 110) + 15;
                            } else {
                                var15 = var10.field3297 + 15;
                            }
                            class243.method1727(var8, arg1, arg2 >> 1, var15, arg5 >> 1, arg0, 101);
                            if (class326.field5065 > -1) {
                                class293.field4614[var14.field3360].method59(class326.field5065 + arg3 - 12, arg4 - -class67.field1080 + -28);
                            }
                        }
                    }
                } else {
                    int var16 = 30;
                    class30 var17 = (class30) var8;
                    if (var17.field488 != -1 || var17.field499 != -1) {
                        class243.method1727(var8, arg1, arg2 >> 1, var8.method637((byte) 124) + 15, arg5 >> 1, arg0, arg6 + 79);
                        if (class326.field5065 > -1) {
                            if (var17.field488 != -1) {
                                class205.field3253[var17.field488].method59(arg3 + class326.field5065 - 12, arg4 - -class67.field1080 + -var16);
                                var16 += 25;
                            }
                            if (var17.field499 != -1) {
                                class221.field3525[var17.field499].method59(arg3 + class326.field5065 - 12, arg4 - var16 + class67.field1080);
                                var16 += 25;
                            }
                        }
                    }
                    if (var7 >= 0) {
                        int var18 = 0;
                        class210[] var19 = class88.field1341;
                        while (var19.length > var18) {
                            class210 var20 = var19[var18];
                            if (var20 != null && var20.field3358 == 10 && class149.field2398[var7] == var20.field3364) {
                                class243.method1727(var8, arg1, arg2 >> 1, var8.method637((byte) 79) + 15, arg5 >> 1, arg0, -74);
                                if (class326.field5065 > -1) {
                                    class293.field4614[var20.field3360].method59(class326.field5065 + arg3 - 12, -var16 + arg4 + class67.field1080);
                                }
                            }
                            var18++;
                        }
                    }
                }
                if (var8.field1451 != null && (class65.field1058 <= var7 || class206.field3255 == 0 || class206.field3255 == 3 || class206.field3255 == 1 && method674(((class30) var8).field494, 0))) {
                    class243.method1727(var8, arg1, arg2 >> 1, var8.method637((byte) 119), arg5 >> 1, arg0, 58);
                    if (class326.field5065 > -1 && class150.field2414 > class181.field2894) {
                        class150.field2405[class181.field2894] = class95.field1558.method1035(var8.field1451) / 2;
                        class150.field2417[class181.field2894] = class95.field1558.field2133;
                        class150.field2416[class181.field2894] = class326.field5065;
                        class150.field2412[class181.field2894] = class67.field1080;
                        class150.field2411[class181.field2894] = var8.field1406;
                        class150.field2410[class181.field2894] = var8.field1394;
                        class150.field2409[class181.field2894] = var8.field1423;
                        class150.field2415[class181.field2894] = var8.field1451;
                        class181.field2894++;
                    }
                }
                if (var8.field1457 > class205.field3252) {
                    class126 var21 = class56.field900[0];
                    class126 var22 = class56.field900[1];
                    int var26;
                    if (var8 instanceof class305) {
                        class305 var23 = (class305) var8;
                        class126[] var24 = (class126[]) ((class126[]) class196.field3117.method1830((long) var23.field4778.field3329, (byte) 52));
                        if (var24 == null) {
                            var24 = class84.method601(class210.field3356, 5, 0, var23.field4778.field3329);
                            if (var24 != null) {
                                class196.field3117.method1831((long) var23.field4778.field3329, var24, arg6 - 13869);
                            }
                        }
                        if (var24 != null && var24.length == 2) {
                            var22 = var24[1];
                            var21 = var24[0];
                        }
                        class208 var25 = var23.field4778;
                        if (var25.field3297 == -1) {
                            var26 = var8.method637((byte) 52);
                        } else {
                            var26 = var25.field3297;
                        }
                    } else {
                        var26 = var8.method637((byte) 96);
                    }
                    class243.method1727(var8, arg1, arg2 >> 1, var26 + var21.field2011 + 10, arg5 >> 1, arg0, 45);
                    if (class326.field5065 > -1) {
                        int var27 = class326.field5065 + arg3 - (var21.field2007 >> 1);
                        int var28 = class67.field1080 + arg4 - 3;
                        var21.method59(var27, var28);
                        int var29 = var21.field2011;
                        int var30 = var8.field1424 * var21.field2007 / 255;
                        if (class265.field4126) {
                            class262.method1862(var27, var28, var27 + var30, var28 - -var29);
                        } else {
                            class182.method1357(var27, var28, var27 + var30, var28 - -var29);
                        }
                        var22.method59(var27, var28);
                        if (class265.field4126) {
                            class262.method1865(arg3, arg4, arg3 + arg5, arg2 + arg4);
                        } else {
                            class182.method1358(arg3, arg4, arg3 + arg5, arg2 + arg4);
                        }
                    }
                }
                for (int var31 = 0; var31 < 4; var31++) {
                    if (var8.field1403[var31] > class205.field3252) {
                        int var32;
                        if ((var8 instanceof class305)) {
                            class305 var33 = (class305) var8;
                            class208 var34 = var33.field4778;
                            if (var34.field3297 == -1) {
                                var32 = var8.method637((byte) 46) / 2;
                            } else {
                                var32 = var34.field3297 / 2;
                            }
                        } else {
                            var32 = var8.method637((byte) 37) / 2;
                        }
                        class243.method1727(var8, arg1, arg2 >> 1, var32, arg5 >> 1, arg0, 104);
                        if (class326.field5065 > -1) {
                            if (var31 == 1) {
                                class67.field1080 -= 20;
                            }
                            if (var31 == 2) {
                                class326.field5065 -= 15;
                                class67.field1080 -= 10;
                            }
                            if (var31 == 3) {
                                class326.field5065 += 15;
                                class67.field1080 -= 10;
                            }
                            class195.field3107[var8.field1419[var31]].method59(arg3 + class326.field5065 - 12, class67.field1080 + -12 + arg4);
                            class127.field2035.method1023(Integer.toString(var8.field1390[var31]), arg3 + class326.field5065 - 1, class67.field1080 + arg4 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var35 = 0; var35 < class181.field2894; var35++) {
            int var36 = class150.field2416[var35];
            int var37 = class150.field2405[var35];
            int var38 = class150.field2417[var35];
            boolean var39 = true;
            int var40 = class150.field2412[var35];
            while (var39) {
                var39 = false;
                for (int var41 = 0; var41 < var35; var41++) {
                    if ((var40 + 2) > (class150.field2412[var41] - class150.field2417[var41]) && (var40 - var38) < (class150.field2412[var41] + 2) && (var36 - var37) < (class150.field2416[var41] + class150.field2405[var41]) && class150.field2416[var41] - class150.field2405[var41] < var36 + var37 && var40 > (class150.field2412[var41] - class150.field2417[var41])) {
                        var40 = class150.field2412[var41] - class150.field2417[var41];
                        var39 = true;
                    }
                }
            }
            class326.field5065 = class150.field2416[var35];
            class67.field1080 = class150.field2412[var35] = var40;
            String var42 = class150.field2415[var35];
            if (class162.field2542 == 0) {
                int var43 = 16776960;
                if (class150.field2411[var35] < 6) {
                    var43 = class236.field3708[class150.field2411[var35]];
                }
                if (class150.field2411[var35] == 6) {
                    var43 = class160.field2521 % 20 < 10 ? 16711680 : 16776960;
                }
                if (class150.field2411[var35] == 7) {
                    var43 = class160.field2521 % 20 >= 10 ? 65535 : 255;
                }
                if (class150.field2411[var35] == 8) {
                    var43 = class160.field2521 % 20 >= 10 ? 8454016 : 45056;
                }
                if (class150.field2411[var35] == 9) {
                    int var44 = 150 - class150.field2409[var35];
                    if (var44 < 50) {
                        var43 = var44 * 1280 + 16711680;
                    } else if (var44 < 100) {
                        var43 = 16776960 - ((var44 - 50) * 327680);
                    } else if (var44 < 150) {
                        var43 = (var44 * 5) + 64780;
                    }
                }
                if (class150.field2411[var35] == 10) {
                    int var45 = 150 - class150.field2409[var35];
                    if (var45 < 50) {
                        var43 = var45 * 5 + 16711680;
                    } else if (var45 < 100) {
                        var43 = 16711935 - (var45 - 50) * 327680;
                    } else if (var45 < 150) {
                        var43 = ((var45 - 100) * 327680) + 255 + 500 - (var45 * 5);
                    }
                }
                if (class150.field2411[var35] == 11) {
                    int var46 = 150 - class150.field2409[var35];
                    if (var46 < 50) {
                        var43 = 16777215 - (var46 * 327685);
                    } else if (var46 < 100) {
                        var43 = (var46 * 327685) - 16318970;
                    } else if (var46 < 150) {
                        var43 = 49545215 - (var46 * 327680);
                    }
                }
                if (class150.field2410[var35] == 0) {
                    class95.field1558.method1023(var42, arg3 + class326.field5065, arg4 - -class67.field1080, var43, 0);
                }
                if (class150.field2410[var35] == 1) {
                    class95.field1558.method1016(var42, arg3 + class326.field5065, class67.field1080 + arg4, var43, 0, class160.field2521);
                }
                if (class150.field2410[var35] == 2) {
                    class95.field1558.method1033(var42, class326.field5065 + arg3, class67.field1080 + arg4, var43, 0, class160.field2521);
                }
                if (class150.field2410[var35] == 3) {
                    class95.field1558.method1022(var42, arg3 + class326.field5065, class67.field1080 + arg4, var43, 0, class160.field2521, 150 - class150.field2409[var35]);
                }
                if (class150.field2410[var35] == 4) {
                    int var47 = (150 - class150.field2409[var35]) * (class95.field1558.method1035(var42) + 100) / 150;
                    if (class265.field4126) {
                        class262.method1862(arg3 + class326.field5065 - 50, arg4, arg3 + class326.field5065 + 50, arg4 - -arg2);
                    } else {
                        class182.method1357(class326.field5065 + arg3 - 50, arg4, class326.field5065 + arg3 + 50, arg2 + arg4);
                    }
                    class95.field1558.method1029(var42, class326.field5065 + arg3 + 50 - var47, class67.field1080 + arg4, var43, 0);
                    if (class265.field4126) {
                        class262.method1865(arg3, arg4, arg3 + arg5, arg2 + arg4);
                    } else {
                        class182.method1358(arg3, arg4, arg3 + arg5, arg2 + arg4);
                    }
                }
                if (class150.field2410[var35] == 5) {
                    int var48 = 150 - class150.field2409[var35];
                    int var49 = 0;
                    if (class265.field4126) {
                        class262.method1862(arg3, class67.field1080 + arg4 - class95.field1558.field2133 - 1, arg3 + arg5, arg4 + class67.field1080 + 5);
                    } else {
                        class182.method1357(arg3, arg4 + class67.field1080 - (class95.field1558.field2133 + 1), arg3 + arg5, arg4 + class67.field1080 + 5);
                    }
                    if (var48 < 25) {
                        var49 = var48 - 25;
                    } else if (var48 > 125) {
                        var49 = var48 - 125;
                    }
                    class95.field1558.method1023(var42, class326.field5065 + arg3, arg4 + var49 - -class67.field1080, var43, 0);
                    if (class265.field4126) {
                        class262.method1865(arg3, arg4, arg3 + arg5, arg2 + arg4);
                    } else {
                        class182.method1358(arg3, arg4, arg3 + arg5, arg2 + arg4);
                    }
                }
            } else {
                class95.field1558.method1023(var42, arg3 + class326.field5065, class67.field1080 + arg4, 16776960, 0);
            }
        }
        if (arg6 != -28) {
            field1553 = (class110) null;
        }
    }
}
