import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class228 {

    @OriginalMember(owner = "client!md", name = "h", descriptor = "J")
    public long field3453 = 0L;

    @OriginalMember(owner = "client!md", name = "p", descriptor = "Llc;")
    public static class86 field3461 = new class86(64);

    @OriginalMember(owner = "client!md", name = "a", descriptor = "I")
    public int field3446;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "I")
    public static int field3448;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "I")
    public int field3450;

    @OriginalMember(owner = "client!md", name = "f", descriptor = "I")
    public int field3451;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "I")
    public int field3452;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "I")
    public static int field3454;

    @OriginalMember(owner = "client!md", name = "j", descriptor = "I")
    public static int field3455;

    @OriginalMember(owner = "client!md", name = "l", descriptor = "I")
    public int field3457;

    @OriginalMember(owner = "client!md", name = "m", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!md", name = "o", descriptor = "I")
    public int field3460;

    @OriginalMember(owner = "client!md", name = "q", descriptor = "I")
    public int field3462;

    @OriginalMember(owner = "client!md", name = "s", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!md", name = "k", descriptor = "Lhc;")
    public static class235 field3456;

    @OriginalMember(owner = "client!md", name = "n", descriptor = "Lsa;")
    public class268 field3459;

    @OriginalMember(owner = "client!md", name = "r", descriptor = "Lsa;")
    public class268 field3463;

    @OriginalMember(owner = "client!md", name = "b", descriptor = "[[[B")
    public static byte[][][] field3447;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1506(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class141.field1963 == 0) {
            int var7 = class41.field614;
            int var8 = class252.field3849;
            int var9 = class180.field2530;
            int var10 = class86.field1168;
            int var11 = (arg6 - arg3) * (var10 - var9) / arg0 + var9;
            int var12 = (arg5 - arg4) * (var8 - var7) / arg1 + var7;
            if (class11.field113 && (class285.field4469 & 0x40) != 0) {
                class211 var13 = class168.method1099(0, class144.field1998, class93.field1306);
                if (var13 == null) {
                    class136.method923(-32);
                } else {
                    class238.method1593(class93.field1303, 0L, arg2 ^ 0xFFFF87C4, var12, class168.field2332, " ->", (short) 43, var11);
                }
            } else {
                if (class124.field1746 == 1) {
                    class238.method1593(-1, 0L, arg2 - 30916, var12, class242.field3712, "", (short) 49, var11);
                }
                class238.method1593(-1, 0L, -30789, var12, class277.field4285, "", (short) 9, var11);
                class219.field3298++;
            }
        }
        if (arg2 != 127) {
            field3464 = -92;
        }
        field3454++;
        long var14 = -1L;
        for (int var16 = 0; var16 < class246.field3760; var16++) {
            long var17 = class62.field857[var16];
            int var19 = (int) var17 >> 7 & 0x7F;
            int var20 = (int) var17 >> 29 & 0x3;
            int var21 = (int) var17 & 0x7F;
            int var22 = Integer.MAX_VALUE & (int) (var17 >>> 32);
            if (var14 != var17) {
                var14 = var17;
                if (var20 == 2 && class234.method1545(class295.field4642, var21, var19, var17)) {
                    class111 var23 = class76.method489(var22, arg2 - 22);
                    if (var23.field1597 != null) {
                        var23 = var23.method726((byte) 110);
                    }
                    if (var23 == null) {
                        continue;
                    }
                    if (class141.field1963 == 1) {
                        class193.field2674++;
                        class238.method1593(class265.field3976, var17, -30789, var21, class224.field3405, class238.field3612 + " -> <col=00ffff>" + var23.field1565, (short) 15, var19);
                    } else if (class11.field113) {
                        class230 var28 = class96.field1357 == -1 ? null : class92.method602(-80, class96.field1357);
                        if ((class285.field4469 & 0x4) != 0 && (var28 == null || var23.method715(class96.field1357, 127, var28.field3480) != var28.field3480)) {
                            class238.method1593(class93.field1303, var17, -30789, var21, class168.field2332, class54.field791 + " -> <col=00ffff>" + var23.field1565, (short) 59, var19);
                            class16.field165++;
                        }
                    } else {
                        class193.field2675++;
                        String[] var24 = var23.field1544;
                        if (class175.field2462) {
                            var24 = class197.method1261(var24, arg2 ^ 0x7A);
                        }
                        if (var24 != null) {
                            for (int var25 = 4; var25 >= 0; var25--) {
                                if (var24[var25] != null) {
                                    class100.field1395++;
                                    short var26 = 0;
                                    if (var25 == 0) {
                                        var26 = 32;
                                    }
                                    if (var25 == 1) {
                                        var26 = 2;
                                    }
                                    if (var25 == 2) {
                                        var26 = 34;
                                    }
                                    int var27 = -1;
                                    if (var23.field1547 == var25) {
                                        var27 = var23.field1572;
                                    }
                                    if (var23.field1612 == var25) {
                                        var27 = var23.field1569;
                                    }
                                    if (var25 == 3) {
                                        var26 = 10;
                                    }
                                    if (var25 == 4) {
                                        var26 = 1002;
                                    }
                                    class238.method1593(var27, var17, arg2 - 30916, var21, var24[var25], "<col=00ffff>" + var23.field1565, var26, var19);
                                }
                            }
                        }
                        class238.method1593(class273.field4217, (long) var23.field1579, -30789, var21, class277.field4295, "<col=00ffff>" + var23.field1565, (short) 1001, var19);
                    }
                }
                if (var20 == 1) {
                    class140 var29 = class119.field1679[var22];
                    if ((var29.field1946.field4431 & 0x1) == 0 && (var29.field4019 & 0x7F) == 0 && (var29.field4085 & 0x7F) == 0 || (var29.field1946.field4431 & 0x1) == 1 && (var29.field4019 & 0x7F) == 64 && (var29.field4085 & 0x7F) == 64) {
                        int var30 = var29.field4019 - ((var29.field1946.field4431 - 1) * 64);
                        int var31 = var29.field4085 - ((var29.field1946.field4431 - 1) * 64);
                        for (int var32 = 0; var32 < class92.field1283; var32++) {
                            class140 var37 = class119.field1679[class194.field2688[var32]];
                            if (var37 != null && !var37.field4056 && var29 != var37 && var37.field4063) {
                                int var38 = var37.field4019 - (var37.field1946.field4431 - 1) * 64;
                                int var39 = var37.field4085 + 64 - (var37.field1946.field4431 * 64);
                                if (var30 <= var38 && var37.field1946.field4431 <= var29.field1946.field4431 - (var38 - var30 >> 7) && var31 <= var39 && (var29.field1946.field4431 - (var39 - var31 >> 7)) >= var37.field1946.field4431) {
                                    class245.method1651(var21, class194.field2688[var32], true, var19, var37.field1946);
                                    var37.field4056 = true;
                                }
                            }
                        }
                        for (int var33 = 0; var33 < class103.field1442; var33++) {
                            class88 var34 = class154.field2133[class205.field2848[var33]];
                            if (var34 != null && !var34.field4056 && var34.field4063) {
                                int var35 = var34.field4019 - ((var34.method561(-1) - 1) * 64);
                                int var36 = var34.field4085 - (var34.method561(-1) - 1) * 64;
                                if (var30 <= var35 && var34.method561(-1) <= var29.field1946.field4431 - (var35 - var30 >> 7) && var31 <= var36 && var34.method561(arg2 ^ 0xFFFFFF80) <= (var29.field1946.field4431 - (var36 - var31 >> 7))) {
                                    class15.method87(var21, class205.field2848[var33], var34, var19, 0);
                                    var34.field4056 = true;
                                }
                            }
                        }
                    }
                    if (var29.field4056) {
                        continue;
                    }
                    class245.method1651(var21, var22, true, var19, var29.field1946);
                    var29.field4056 = true;
                }
                if (var20 == 0) {
                    class88 var40 = class154.field2133[var22];
                    if ((var40.field4019 & 0x7F) == 64 && (var40.field4085 & 0x7F) == 64) {
                        int var41 = var40.field4019 - (var40.method561(arg2 ^ 0xFFFFFF80) - 1) * 64;
                        int var42 = var40.field4085 - ((var40.method561(arg2 ^ -128) - 1) * 64);
                        for (int var43 = 0; var43 < class92.field1283; var43++) {
                            class140 var48 = class119.field1679[class194.field2688[var43]];
                            if (var48 != null && !var48.field4056 && var48.field4063) {
                                int var49 = var48.field4019 - (var48.field1946.field4431 * 64 - 64);
                                int var50 = var48.field4085 - ((var48.field1946.field4431 - 1) * 64);
                                if (var49 >= var41 && var48.field1946.field4431 <= (var40.method561(arg2 - 128) - (var49 - var41 >> 7)) && var42 <= var50 && var48.field1946.field4431 <= (var40.method561(-1) - (var50 - var42 >> 7))) {
                                    class245.method1651(var21, class194.field2688[var43], true, var19, var48.field1946);
                                    var48.field4056 = true;
                                }
                            }
                        }
                        for (int var44 = 0; var44 < class103.field1442; var44++) {
                            class88 var45 = class154.field2133[class205.field2848[var44]];
                            if (var45 != null && !var45.field4056 && var40 != var45 && var45.field4063) {
                                int var46 = var45.field4019 - (var45.method561(-1) * 64 - 64);
                                int var47 = var45.field4085 - (var45.method561(-1) - 1) * 64;
                                if (var46 >= var41 && var45.method561(-1) <= var40.method561(-1) - (var46 - var41 >> 7) && var42 <= var47 && var45.method561(-1) <= (var40.method561(-1) - (var47 - var42 >> 7))) {
                                    class15.method87(var21, class205.field2848[var44], var45, var19, 0);
                                    var45.field4056 = true;
                                }
                            }
                        }
                    }
                    if (var40.field4056) {
                        continue;
                    }
                    class15.method87(var21, var22, var40, var19, 0);
                    var40.field4056 = true;
                }
                if (var20 == 3) {
                    class148 var51 = class297.field4690[class295.field4642][var21][var19];
                    if (var51 != null) {
                        for (class207 var52 = (class207) var51.method992(3); var52 != null; var52 = (class207) var51.method994(10014)) {
                            int var53 = var52.field2893.field2355;
                            class32 var54 = class73.method463(var53, -31104);
                            if (class141.field1963 == 1) {
                                class238.method1593(class265.field3976, (long) var53, -30789, var21, class224.field3405, class238.field3612 + " -> <col=ff9040>" + var54.field437, (short) 60, var19);
                                class29.field376++;
                            } else if (class11.field113) {
                                class230 var55 = class96.field1357 == -1 ? null : class92.method602(-93, class96.field1357);
                                if ((class285.field4469 & 0x1) != 0 && (var55 == null || var54.method212(class96.field1357, arg2 - 15, var55.field3480) != var55.field3480)) {
                                    class238.method1593(class93.field1303, (long) var53, -30789, var21, class168.field2332, class54.field791 + " -> <col=ff9040>" + var54.field437, (short) 19, var19);
                                    class266.field3983++;
                                }
                            } else {
                                class214.field3219++;
                                String[] var56 = var54.field438;
                                if (class175.field2462) {
                                    var56 = class197.method1261(var56, 5);
                                }
                                for (int var57 = 4; var57 >= 0; var57--) {
                                    if (var56 != null && var56[var57] != null) {
                                        class231.field3501++;
                                        byte var58 = 0;
                                        if (var57 == 0) {
                                            var58 = 20;
                                        }
                                        if (var57 == 1) {
                                            var58 = 24;
                                        }
                                        int var59 = -1;
                                        if (var54.field491 == var57) {
                                            var59 = var54.field442;
                                        }
                                        if (var54.field472 == var57) {
                                            var59 = var54.field464;
                                        }
                                        if (var57 == 2) {
                                            var58 = 11;
                                        }
                                        if (var57 == 3) {
                                            var58 = 28;
                                        }
                                        if (var57 == 4) {
                                            var58 = 13;
                                        }
                                        class238.method1593(var59, (long) var53, -30789, var21, var56[var57], "<col=ff9040>" + var54.field437, var58, var19);
                                    }
                                }
                                class238.method1593(class273.field4217, (long) var53, arg2 - 30916, var21, class277.field4295, "<col=ff9040>" + var54.field437, (short) 1004, var19);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BI)V")
    public static final void method1507(byte arg0, int arg1) {
        class171 var2 = class247.field3784.method21((byte) 67);
        if (arg0 != 110) {
            field3456 = null;
        }
        while (var2 != null) {
            if ((long) arg1 == (var2.field2369 >> 48 & 0xFFFFL)) {
                var2.method1115(-8);
            }
            var2 = class247.field3784.method22(true);
        }
        field3449++;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method1508(byte arg0, String arg1) {
        System.out.println("Bad " + arg1 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        field3458++;
        System.exit(1);
        if (arg0 != 27) {
            method1506(34, 14, 68, -117, -66, 72, 86);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V")
    public static void method1509(byte arg0) {
        if (arg0 >= -124) {
            method1507((byte) 31, -72);
        }
        field3447 = null;
        field3456 = null;
        field3461 = null;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BJ)V")
    public static final void method1510(byte arg0, long arg1) {
        try {
            Thread.sleep(arg1);
            if (arg0 < 23) {
                field3464 = -27;
            }
        } catch (InterruptedException var3) {
        }
        field3448++;
    }
}
