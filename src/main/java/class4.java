import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class4 extends class178 {

    @OriginalMember(owner = "client!vd", name = "u", descriptor = "Z")
    public static boolean field81 = true;

    @OriginalMember(owner = "client!vd", name = "q", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!vd", name = "s", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!vd", name = "t", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!vd", name = "v", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!vd", name = "r", descriptor = "Lpf;")
    public static class294 field78;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V")
    public static void method14(int arg0) {
        if (arg0 == -4453) {
            field78 = null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lrf;IIII)V")
    public static final void method15(class289 arg0, int arg1, int arg2, int arg3, int arg4) {
        field82++;
        class39.method231(false);
        class111.method716(arg2, arg4, arg0.field4478 + arg2, arg4 - -arg0.field4444);
        if (arg1 > -6) {
            method15((class289) null, -115, -61, 121, 103);
        }
        if (class214.field3211 == 2 || class214.field3211 == 5 || class134.field1959 == null) {
            class111.method712(arg2, arg4, 0, arg0.field4417, arg0.field4427);
        } else {
            int var5 = (int) class84.field1336 + class154.field2311 & 0x7FF;
            int var6 = class165.field2537.field2251 / 32 + 48;
            int var7 = 464 - (class165.field2537.field2234 / 32);
            ((class201) class134.field1959).method1286(arg2, arg4, arg0.field4478, arg0.field4444, var6, var7, var5, class82.field1324 + 256, arg0.field4417, arg0.field4427);
            if (class39.field525 != null) {
                for (int var8 = 0; var8 < class39.field525.field2734; var8++) {
                    if (class39.field525.method1126(var8, (byte) 68)) {
                        int var9 = ((class39.field525.field2739[var8] & 0x3FFF) - class147.field2141) * 4 + 2 - (class165.field2537.field2234 / 32);
                        int var10 = ((class39.field525.field2739[var8] >> 14 & 0x3FFF) - class81.field1303) * 4 + 2 - (class165.field2537.field2251 / 32);
                        int var11 = class249.field3781[var5];
                        int var12 = var11 * 256 / (class82.field1324 + 256);
                        int var13 = class249.field3767[var5];
                        int var14 = var13 * 256 / (class82.field1324 + 256);
                        int var15 = var9 * var14 + var10 * var12 >> 16;
                        int var16 = var9 * var12 - (var10 * var14) >> 16;
                        class164 var17 = class91.field1435;
                        if (class39.field525.method1128(3, var8) == 1) {
                            var17 = class268.field4036;
                        }
                        if (class39.field525.method1128(3, var8) == 2) {
                            var17 = class192.field2953;
                        }
                        int var18 = var17.method1015(class39.field525.field2750[var8], 100);
                        int var19 = var15 - var18 / 2;
                        if (var19 >= (-arg0.field4478) && var19 <= arg0.field4478 && var16 >= (-arg0.field4444) && arg0.field4444 >= var16) {
                            int var20 = 16777215;
                            if (class39.field525.field2747[var8] != -1) {
                                var20 = class39.field525.field2747[var8];
                            }
                            class111.method706(arg0.field4417, arg0.field4427);
                            var17.method1033(class39.field525.field2750[var8], arg0.field4478 / 2 + arg2 + var19, arg0.field4444 / 2 + -var16 + arg4, var18, 50, var20, 0, 256, 1, 0, 0);
                            class111.method724();
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < class184.field2793; var21++) {
                int var58 = class188.field2875[var21] * 4 + 2 - class165.field2537.field2234 / 32;
                int var59 = class93.field1482[var21] * 4 + 2 - (class165.field2537.field2251 / 32);
                class288 var60 = class274.method1816(72, class77.field1243[var21]);
                if (var60.field4336 != null) {
                    var60 = var60.method1906((byte) -127);
                    if (var60 == null || var60.field4358 == -1) {
                        continue;
                    }
                }
                class100.method645(arg2, arg4, 23, var59, var58, arg0, class65.field1024[var60.field4358]);
            }
            for (int var22 = 0; var22 < 104; var22++) {
                for (int var54 = 0; var54 < 104; var54++) {
                    class159 var55 = class251.field3816[class99.field1557][var22][var54];
                    if (var55 != null) {
                        int var56 = var54 * 4 + 2 - (class165.field2537.field2234 / 32);
                        int var57 = var22 * 4 + 2 - (class165.field2537.field2251 / 32);
                        class100.method645(arg2, arg4, 23, var57, var56, arg0, class255.field3889[0]);
                    }
                }
            }
            for (int var23 = 0; var23 < class24.field295; var23++) {
                class61 var50 = class18.field220[class169.field2586[var23]];
                if (var50 != null && var50.method414(1000)) {
                    class72 var51 = var50.field959;
                    if (var51 != null && var51.field1196 != null) {
                        var51 = var51.method487(-1);
                    }
                    if (var51 != null && var51.field1199 && var51.field1204) {
                        int var52 = var50.field2251 / 32 - (class165.field2537.field2251 / 32);
                        int var53 = var50.field2234 / 32 - class165.field2537.field2234 / 32;
                        if (var51.field1165 == -1) {
                            class100.method645(arg2, arg4, 23, var52, var53, arg0, class255.field3889[1]);
                        } else {
                            class100.method645(arg2, arg4, 23, var52, var53, arg0, class65.field1024[var51.field1165]);
                        }
                    }
                }
            }
            for (int var24 = 0; var24 < class141.field2069; var24++) {
                class107 var40 = class96.field1521[class58.field918[var24]];
                if (var40 != null && var40.method414(1000)) {
                    int var41 = var40.field2251 / 32 - class165.field2537.field2251 / 32;
                    int var42 = var40.field2234 / 32 - (class165.field2537.field2234 / 32);
                    boolean var43 = false;
                    long var44 = class94.method604((byte) -95, var40.field1663);
                    for (int var46 = 0; var46 < class150.field2164; var46++) {
                        if (class259.field3944[var46] == var44 && class285.field4275[var46] != 0) {
                            var43 = true;
                            break;
                        }
                    }
                    boolean var47 = false;
                    for (int var48 = 0; var48 < class224.field3352; var48++) {
                        if (class184.field2779[var48].field1321 == var44) {
                            var47 = true;
                            break;
                        }
                    }
                    boolean var49 = false;
                    if (class165.field2537.field1674 != 0 && var40.field1674 != 0 && class165.field2537.field1674 == var40.field1674) {
                        var49 = true;
                    }
                    if (var43) {
                        class100.method645(arg2, arg4, 23, var41, var42, arg0, class255.field3889[3]);
                    } else if (var47) {
                        class100.method645(arg2, arg4, 23, var41, var42, arg0, class255.field3889[5]);
                    } else if (var49) {
                        class100.method645(arg2, arg4, 23, var41, var42, arg0, class255.field3889[4]);
                    } else {
                        class100.method645(arg2, arg4, 23, var41, var42, arg0, class255.field3889[2]);
                    }
                }
            }
            int var25 = 0;
            class93[] var26 = class101.field1591;
            while (var25 < var26.length) {
                class93 var29 = var26[var25];
                if (var29 != null && var29.field1466 != 0 && (class270.field4058 % 20) < 10) {
                    if (var29.field1466 == 1 && var29.field1471 >= 0 && class18.field220.length > var29.field1471) {
                        class61 var30 = class18.field220[var29.field1471];
                        if (var30 != null) {
                            int var31 = var30.field2251 / 32 - (class165.field2537.field2251 / 32);
                            int var32 = var30.field2234 / 32 - class165.field2537.field2234 / 32;
                            class275.method1824(var31, var29.field1473, var32, arg0, arg2, 360000, -256, arg4);
                        }
                    }
                    if (var29.field1466 == 2) {
                        int var33 = (var29.field1468 - class81.field1303) * 4 + 2 - class165.field2537.field2251 / 32;
                        int var34 = (var29.field1474 - class147.field2141) * 4 + 2 - (class165.field2537.field2234 / 32);
                        int var35 = var29.field1470 * 4;
                        int var36 = var35 * var35;
                        class275.method1824(var33, var29.field1473, var34, arg0, arg2, var36, -256, arg4);
                    }
                    if (var29.field1466 == 10 && var29.field1471 >= 0 && class96.field1521.length > var29.field1471) {
                        class107 var37 = class96.field1521[var29.field1471];
                        if (var37 != null) {
                            int var38 = var37.field2251 / 32 - (class165.field2537.field2251 / 32);
                            int var39 = var37.field2234 / 32 - class165.field2537.field2234 / 32;
                            class275.method1824(var38, var29.field1473, var39, arg0, arg2, 360000, -256, arg4);
                        }
                    }
                }
                var25++;
            }
            if (class56.field892 != 0) {
                int var27 = class56.field892 * 4 + 2 - (class165.field2537.field2251 / 32 - (class165.field2537.method676(-30217) * 2 - 2));
                int var28 = class225.field3364 * 4 - ((class165.field2537.field2234 / 32 + 2 - class165.field2537.method676(-30217) * 2) - 2);
                class100.method645(arg2, arg4, 23, var27, var28, arg0, class178.field2729);
            }
            class111.method702(arg0.field4478 / 2 + arg2 - 1, arg4 - (-(arg0.field4444 / 2) + 1), 3, 3, 16777215);
        }
        class1.field16[arg3] = true;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIILjj;)V")
    public static final void method16(int arg0, int arg1, int arg2, int arg3, class107 arg4) {
        field79++;
        if (class165.field2537 == arg4 || class218.field3278 >= 400) {
            return;
        }
        String var11;
        if (arg4.field1648 == 0) {
            boolean var5 = true;
            if (class165.field2537.field1666 != -1 && arg4.field1666 != -1) {
                int var6 = arg4.field1647 >= class165.field2537.field1647 ? arg4.field1647 : class165.field2537.field1647;
                int var7 = arg4.field1666 <= class165.field2537.field1666 ? arg4.field1666 : class165.field2537.field1666;
                int var8 = var6 * 10 / 100 + var7 + 5;
                int var9 = class165.field2537.field1647 - arg4.field1647;
                if (var9 < 0) {
                    var9 = -var9;
                }
                if (var9 > var8) {
                    var5 = false;
                }
            }
            String var10 = class166.field2554 == 1 ? class127.field1910 : class183.field2770;
            if (arg4.field1647 < arg4.field1675) {
                var11 = arg4.method672(5) + (var5 ? class276.method1828((byte) 42, arg4.field1647, class165.field2537.field1647) : "<col=ffffff>") + " (" + var10 + arg4.field1647 + "+" + (arg4.field1675 - arg4.field1647) + ")";
            } else {
                var11 = arg4.method672(5) + (var5 ? class276.method1828((byte) 42, arg4.field1647, class165.field2537.field1647) : "<col=ffffff>") + " (" + var10 + arg4.field1647 + ")";
            }
        } else {
            var11 = arg4.method672(5) + " (" + class251.field3823 + arg4.field1648 + ")";
        }
        if (class114.field1738 == 1) {
            class202.field3049++;
            client.method957(class84.field1337, arg3, (short) 32, 0, (long) arg0, arg2, class251.field3817, class241.field3624 + " -> <col=ffffff>" + var11);
        } else if (!class153.field2305) {
            for (int var12 = 7; var12 >= 0; var12--) {
                if (class72.field1138[var12] != null) {
                    class154.field2309++;
                    short var13 = 0;
                    if (class166.field2554 == 0 && class72.field1138[var12].equalsIgnoreCase(class54.field883)) {
                        if (class165.field2537.field1647 < arg4.field1647) {
                            var13 = 2000;
                        }
                        if (class165.field2537.field1674 != 0 && arg4.field1674 != 0) {
                            if (class165.field2537.field1674 == arg4.field1674) {
                                var13 = 2000;
                            } else {
                                var13 = 0;
                            }
                        }
                    } else if (class241.field3627[var12]) {
                        var13 = 2000;
                    }
                    boolean var14 = false;
                    short var15 = class77.field1237[var12];
                    short var16 = (short) (var13 + var15);
                    client.method957(class91.field1444[var12], arg3, var16, 0, (long) arg0, arg2, class72.field1138[var12], "<col=ffffff>" + var11);
                }
            }
        } else if ((class206.field3092 & 0x8) != 0) {
            client.method957(class289.field4390, arg3, (short) 28, 0, (long) arg0, arg2, class48.field770, class210.field3163 + " -> <col=ffffff>" + var11);
            class146.field2129++;
        }
        if (arg1 < 30) {
            field78 = null;
        }
        for (int var17 = 0; var17 < class218.field3278; var17++) {
            if (class84.field1339[var17] == 16) {
                class46.field754[var17] = "<col=ffffff>" + var11;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(III)V")
    public static final void method17(int arg0, int arg1, int arg2) {
        class186.field2823[arg2] = arg1;
        field80++;
        if (arg0 != 7298) {
            return;
        }
        class63 var3 = (class63) class273.field4110.method1666((long) arg2, (byte) 72);
        if (var3 == null) {
            class63 var4 = new class63(4611686018427387905L);
            class273.field4110.method1663((long) arg2, var4, -89);
        } else if (var3.field987 != 4611686018427387905L) {
            var3.field987 = class263.method1754(arg0 ^ 0x1CFF) + 500L | 0x4000000000000000L;
        }
    }
}
