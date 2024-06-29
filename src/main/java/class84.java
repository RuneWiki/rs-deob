import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class84 {

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "Ljava/lang/String;")
    public static String field1416 = null;

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "I")
    public static int field1414 = -1;

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "I")
    public static int field1413 = 0;

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "J")
    public static long field1417 = 0L;

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "Luk;")
    public static class100 field1411 = new class100(128);

    @OriginalMember(owner = "client!lk", name = "n", descriptor = "Z")
    public static boolean field1423 = true;

    @OriginalMember(owner = "client!lk", name = "o", descriptor = "I")
    public static int field1424 = 0;

    @OriginalMember(owner = "client!lk", name = "q", descriptor = "I")
    public static int field1426 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!lk", name = "p", descriptor = "[J")
    public static long[] field1425 = new long[32];

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "I")
    public static int field1412;

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "I")
    public static int field1418;

    @OriginalMember(owner = "client!lk", name = "j", descriptor = "I")
    public static int field1419;

    @OriginalMember(owner = "client!lk", name = "k", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!lk", name = "l", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "Lna;")
    public static class32 field1415;

    @OriginalMember(owner = "client!lk", name = "m", descriptor = "Z")
    public static boolean field1422;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)V")
    public static final void method593(int arg0, int arg1) {
        field1419++;
        class53 var2 = (class53) class291.field4590.method285((long) arg0, 13821);
        if (var2 != null) {
            for (int var3 = arg1; var3 < var2.field800.length; var3++) {
                var2.field800[var3] = -1;
                var2.field813[var3] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ZIIIIII)V")
    public static final void method594(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1420++;
        class6.field132 = 0;
        for (int var7 = -1; var7 < (class70.field1119 + class137.field2110); var7++) {
            class144 var23;
            if (var7 == -1) {
                var23 = class283.field4473;
            } else if (var7 < class137.field2110) {
                var23 = class210.field3267[class99.field1660[var7]];
            } else {
                var23 = class255.field4082[class284.field4506[var7 - class137.field2110]];
            }
            if (var23 != null && var23.method328(0)) {
                if (var23 instanceof class45) {
                    class60 var24 = ((class45) var23).field645;
                    if (var24.field1020 != null) {
                        var24 = var24.method459(true);
                    }
                    if (var24 == null) {
                        continue;
                    }
                }
                if (var7 >= class137.field2110) {
                    class60 var30 = ((class45) var23).field645;
                    if (var30.field1020 != null) {
                        var30 = var30.method459(true);
                    }
                    if (var30.field984 >= 0 && class274.field4369.length > var30.field984) {
                        int var31;
                        if (var30.field989 == -1) {
                            var31 = var23.method968(200) + 15;
                        } else {
                            var31 = var30.field989 + 15;
                        }
                        class86.method613(arg2 >> 1, var23, var31, arg6 >> 1, 24344, arg5, arg1);
                        if (class294.field4630 > -1) {
                            class274.field4369[var30.field984].method856(class294.field4630 + arg4 - 12, arg3 - -field1414 + -30);
                        }
                    }
                    class83[] var32 = class28.field393;
                    for (int var33 = 0; var33 < var32.length; var33++) {
                        class83 var48 = var32[var33];
                        if (var48 != null && var48.field1397 == 1 && class284.field4506[var7 - class137.field2110] == var48.field1409 && (class192.field2978 % 20) < 10) {
                            int var49;
                            if (var30.field989 == -1) {
                                var49 = var23.method968(200) + 15;
                            } else {
                                var49 = var30.field989 + 15;
                            }
                            class86.method613(arg2 >> 1, var23, var49, arg6 >> 1, 24344, arg5, arg1);
                            if (class294.field4630 > -1) {
                                class167.field2615[var48.field1404].method856(class294.field4630 + arg4 - 12, arg3 - -field1414 + -28);
                            }
                        }
                    }
                } else {
                    int var25 = 30;
                    class236 var26 = (class236) var23;
                    if (var26.field3827 != -1 || var26.field3799 != -1) {
                        class86.method613(arg2 >> 1, var23, var23.method968(200) + 15, arg6 >> 1, 24344, arg5, arg1);
                        if (class294.field4630 > -1) {
                            if (var26.field3827 != -1) {
                                class95.field1617[var26.field3827].method856(arg4 + class294.field4630 - 12, field1414 - var25 + arg3);
                                var25 += 25;
                            }
                            if (var26.field3799 != -1) {
                                class274.field4369[var26.field3799].method856(class294.field4630 + arg4 - 12, field1414 - var25 + arg3);
                                var25 += 25;
                            }
                        }
                    }
                    if (var7 >= 0) {
                        int var27 = 0;
                        class83[] var28 = class28.field393;
                        while (var28.length > var27) {
                            class83 var29 = var28[var27];
                            if (var29 != null && var29.field1397 == 10 && class99.field1660[var7] == var29.field1409) {
                                class86.method613(arg2 >> 1, var23, var23.method968(200) + 15, arg6 >> 1, 24344, arg5, arg1);
                                if (class294.field4630 > -1) {
                                    class167.field2615[var29.field1404].method856(class294.field4630 + arg4 - 12, field1414 + arg3 + -var25);
                                }
                            }
                            var27++;
                        }
                    }
                }
                if (var23.field2286 != null && (var7 >= class137.field2110 || class102.field1711 == 0 || class102.field1711 == 3 || class102.field1711 == 1 && class93.method707(((class236) var23).field3803, (byte) -61))) {
                    class86.method613(arg2 >> 1, var23, var23.method968(200), arg6 >> 1, 24344, arg5, arg1);
                    if (class294.field4630 > -1 && class98.field1646 > class6.field132) {
                        class98.field1644[class6.field132] = class228.field3517.method1674(var23.field2286) / 2;
                        class98.field1656[class6.field132] = class228.field3517.field3929;
                        class98.field1640[class6.field132] = class294.field4630;
                        class98.field1643[class6.field132] = field1414;
                        class98.field1637[class6.field132] = var23.field2205;
                        class98.field1651[class6.field132] = var23.field2274;
                        class98.field1639[class6.field132] = var23.field2207;
                        class98.field1658[class6.field132] = var23.field2286;
                        class6.field132++;
                    }
                }
                if (class192.field2978 < var23.field2277) {
                    class186 var34 = class28.field391[0];
                    class186 var35 = class28.field391[1];
                    int var36;
                    if ((var23 instanceof class45)) {
                        class45 var37 = (class45) var23;
                        class186[] var38 = (class186[]) class181.field2824.method1887(0, (long) var37.field645.field1023);
                        if (var38 == null) {
                            var38 = class159.method1074(class130.field2055, 0, var37.field645.field1023, (byte) 85);
                            if (var38 != null) {
                                class181.field2824.method1886(-54, (long) var37.field645.field1023, var38);
                            }
                        }
                        class60 var39 = var37.field645;
                        if (var38 != null && var38.length == 2) {
                            var35 = var38[1];
                            var34 = var38[0];
                        }
                        if (var39.field989 == -1) {
                            var36 = var23.method968(200);
                        } else {
                            var36 = var39.field989;
                        }
                    } else {
                        var36 = var23.method968(200);
                    }
                    class86.method613(arg2 >> 1, var23, var36 + var34.field2871 + 10, arg6 >> 1, 24344, arg5, arg1);
                    if (class294.field4630 > -1) {
                        int var40 = arg4 - ((var34.field2874 >> 1) - class294.field4630);
                        int var41 = arg3 + field1414 - 3;
                        var34.method856(var40, var41);
                        int var42 = var23.field2219 * var34.field2874 / 255;
                        int var43 = var34.field2871;
                        class211.method1427(var40, var41, var40 + var42, var41 + var43);
                        var35.method856(var40, var41);
                        class211.method1418(arg4, arg3, arg4 + arg6, arg2 + arg3);
                    }
                }
                for (int var44 = 0; var44 < 4; var44++) {
                    if (var23.field2216[var44] > class192.field2978) {
                        int var45;
                        if ((var23 instanceof class45)) {
                            class45 var46 = (class45) var23;
                            class60 var47 = var46.field645;
                            if (var47.field989 == -1) {
                                var45 = var23.method968(200) / 2;
                            } else {
                                var45 = var47.field989 / 2;
                            }
                        } else {
                            var45 = var23.method968(200) / 2;
                        }
                        class86.method613(arg2 >> 1, var23, var45, arg6 >> 1, 24344, arg5, arg1);
                        if (class294.field4630 > -1) {
                            if (var44 == 1) {
                                field1414 -= 20;
                            }
                            if (var44 == 2) {
                                field1414 -= 10;
                                class294.field4630 -= 15;
                            }
                            if (var44 == 3) {
                                field1414 -= 10;
                                class294.field4630 += 15;
                            }
                            class222.field3405[var23.field2269[var44]].method856(class294.field4630 + arg4 - 12, field1414 + arg3 + -12);
                            class28.field392.method1671(Integer.toString(var23.field2285[var44]), class294.field4630 + arg4 - 1, arg3 + 3 - -field1414, 16777215, 0);
                        }
                    }
                }
            }
        }
        if (arg0) {
            field1411 = null;
        }
        for (int var8 = 0; var8 < class6.field132; var8++) {
            int var9 = class98.field1640[var8];
            int var10 = class98.field1643[var8];
            boolean var11 = true;
            int var12 = class98.field1644[var8];
            int var13 = class98.field1656[var8];
            while (var11) {
                var11 = false;
                for (int var22 = 0; var22 < var8; var22++) {
                    if (class98.field1643[var22] - class98.field1656[var22] < var10 + 2 && (class98.field1643[var22] + 2) > (var10 - var13) && class98.field1644[var22] + class98.field1640[var22] > -var12 + var9 && (var9 + var12) > (class98.field1640[var22] - class98.field1644[var22]) && class98.field1643[var22] - class98.field1656[var22] < var10) {
                        var11 = true;
                        var10 = class98.field1643[var22] - class98.field1656[var22];
                    }
                }
            }
            class294.field4630 = class98.field1640[var8];
            field1414 = class98.field1643[var8] = var10;
            String var14 = class98.field1658[var8];
            if (class27.field375 == 0) {
                int var15 = 16776960;
                if (class98.field1637[var8] < 6) {
                    var15 = class152.field2391[class98.field1637[var8]];
                }
                if (class98.field1637[var8] == 6) {
                    var15 = class121.field1938 % 20 < 10 ? 16711680 : 16776960;
                }
                if (class98.field1637[var8] == 7) {
                    var15 = class121.field1938 % 20 >= 10 ? 65535 : 255;
                }
                if (class98.field1637[var8] == 8) {
                    var15 = (class121.field1938 % 20) >= 10 ? 8454016 : 45056;
                }
                if (class98.field1637[var8] == 9) {
                    int var16 = 150 - class98.field1639[var8];
                    if (var16 < 50) {
                        var15 = var16 * 1280 + 16711680;
                    } else if (var16 < 100) {
                        var15 = 16776960 - (var16 - 50) * 327680;
                    } else if (var16 < 150) {
                        var15 = (var16 - 100) * 5 + 65280;
                    }
                }
                if (class98.field1637[var8] == 10) {
                    int var17 = 150 - class98.field1639[var8];
                    if (var17 < 50) {
                        var15 = var17 * 5 + 16711680;
                    } else if (var17 < 100) {
                        var15 = 16711935 - ((var17 - 50) * 327680);
                    } else if (var17 < 150) {
                        var15 = var17 * 327680 + 500 + 255 - (var17 * 5) - 32768000;
                    }
                }
                if (class98.field1637[var8] == 11) {
                    int var18 = 150 - class98.field1639[var8];
                    if (var18 < 50) {
                        var15 = 16777215 - (var18 * 327685);
                    } else if (var18 < 100) {
                        var15 = var18 * 327685 + 65280 - 16384250;
                    } else if (var18 < 150) {
                        var15 = 49545215 - (var18 * 327680);
                    }
                }
                if (class98.field1651[var8] == 0) {
                    class228.field3517.method1671(var14, class294.field4630 + arg4, field1414 + arg3, var15, 0);
                }
                if (class98.field1651[var8] == 1) {
                    class228.field3517.method1655(var14, class294.field4630 + arg4, field1414 + arg3, var15, 0, class121.field1938);
                }
                if (class98.field1651[var8] == 2) {
                    class228.field3517.method1654(var14, class294.field4630 + arg4, arg3 - -field1414, var15, 0, class121.field1938);
                }
                if (class98.field1651[var8] == 3) {
                    class228.field3517.method1666(var14, class294.field4630 + arg4, arg3 - -field1414, var15, 0, class121.field1938, 150 - class98.field1639[var8]);
                }
                if (class98.field1651[var8] == 4) {
                    int var19 = (150 - class98.field1639[var8]) * (class228.field3517.method1674(var14) + 100) / 150;
                    class211.method1427(arg4 + class294.field4630 - 50, arg3, arg4 + class294.field4630 + 50, arg2 + arg3);
                    class228.field3517.method1676(var14, arg4 - (var19 - class294.field4630 - 50), field1414 + arg3, var15, 0);
                    class211.method1418(arg4, arg3, arg4 + arg6, arg2 + arg3);
                }
                if (class98.field1651[var8] == 5) {
                    int var20 = 0;
                    int var21 = 150 - class98.field1639[var8];
                    if (var21 < 25) {
                        var20 = var21 - 25;
                    } else if (var21 > 125) {
                        var20 = var21 - 125;
                    }
                    class211.method1427(arg4, arg3 + field1414 - class228.field3517.field3929 - 1, arg4 + arg6, field1414 + arg3 + 5);
                    class228.field3517.method1671(var14, arg4 + class294.field4630, field1414 + arg3 - -var20, var15, 0);
                    class211.method1418(arg4, arg3, arg4 + arg6, arg2 + arg3);
                }
            } else {
                class228.field3517.method1671(var14, class294.field4630 + arg4, field1414 + arg3, 16776960, 0);
            }
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V")
    public static void method595(int arg0) {
        if (arg0 > -122) {
            field1424 = -60;
        }
        field1415 = null;
        field1416 = null;
        field1411 = null;
        field1425 = null;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(BI)Lre;")
    public static final class228 method596(byte arg0, int arg1) {
        field1418++;
        int var2 = arg1 >> 16;
        if (arg0 != 35) {
            field1426 = -11;
        }
        int var3 = arg1 & 0xFFFF;
        if (class193.field3052[var2] == null || class193.field3052[var2][var3] == null) {
            boolean var4 = class53.method394(false, var2);
            if (!var4) {
                return null;
            }
        }
        return class193.field3052[var2][var3];
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIBIII)V")
    public static final void method597(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field1421++;
        for (int var6 = arg0; var6 <= arg4; var6++) {
            class166.method1124(true, class154.field2406[var6], arg1, arg3, arg5);
        }
        if (arg2 <= 72) {
            method597(120, 88, (byte) 22, -98, -36, 116);
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(III)Ljava/lang/String;")
    public static final String method598(int arg0, int arg1, int arg2) {
        field1410++;
        int var3 = arg1 - arg0;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (var3 > 9) {
            return "<col=00ff00>";
        } else if (var3 > 6) {
            return "<col=40ff00>";
        } else if (arg2 != -1) {
            return null;
        } else if (var3 > 3) {
            return "<col=80ff00>";
        } else if (var3 > 0) {
            return "<col=c0ff00>";
        } else {
            return "<col=ffff00>";
        }
    }
}
