import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class286 {

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "Llf;")
    public static class211 field4530 = new class211(64);

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "I")
    public static int field4535 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!pl", name = "l", descriptor = "Ljava/lang/String;")
    public static String field4540 = "Loaded textures";

    @OriginalMember(owner = "client!pl", name = "i", descriptor = "Llf;")
    public static class211 field4537 = new class211(50);

    @OriginalMember(owner = "client!pl", name = "n", descriptor = "Z")
    public static boolean field4542 = false;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "I")
    public static int field4529;

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "I")
    public static int field4532;

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "I")
    public static int field4533;

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "I")
    public static int field4534;

    @OriginalMember(owner = "client!pl", name = "h", descriptor = "I")
    public static int field4536;

    @OriginalMember(owner = "client!pl", name = "j", descriptor = "I")
    public static int field4538;

    @OriginalMember(owner = "client!pl", name = "k", descriptor = "I")
    public static int field4539;

    @OriginalMember(owner = "client!pl", name = "m", descriptor = "Lol;")
    public static class208 field4541;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method1904(Component arg0, int arg1) {
        if (arg1 != 5952) {
            method1909((byte) -32);
        }
        field4531++;
        arg0.removeKeyListener(class103.field1597);
        arg0.removeFocusListener(class103.field1597);
        class6.field101 = -1;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIIBII)V")
    public static final void method1905(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        if (arg5 >= class51.field710 && arg1 <= class96.field1484 && class110.field1669 <= arg2 && arg0 <= class189.field2984) {
            if (arg3 == 1) {
                class87.method599(arg5, arg0, arg6, (byte) -108, arg2, arg1);
            } else {
                class206.method1405(arg6, arg1, arg2, arg5, arg0, 5, arg3);
            }
        } else if (arg3 == 1) {
            class31.method247(arg6, -1198, arg1, arg2, arg0, arg5);
        } else {
            class125.method847(arg1, -18143, arg0, arg6, arg2, arg3, arg5);
        }
        int var7 = -86 % ((arg4 + 61) / 49);
        field4529++;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public static final boolean method1906(int arg0, String arg1) {
        field4538++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = arg0; var2 < class141.field2066; var2++) {
            if (arg1.equalsIgnoreCase(class139.field2053[var2])) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lua;IIIIII)Lua;")
    public static final class114 method1907(class114 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4534++;
        long var7 = (long) arg4;
        class114 var9 = (class114) class142.field2085.method1428(var7, (byte) -101);
        if (var9 == null) {
            class160 var10 = class160.method1079(class282.field4462, arg4, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1076(64, 768, -50, -10, -50);
            class142.field2085.method1424(var7, var9, -2003648287);
        }
        int var11 = arg0.method755();
        int var12 = arg0.method749();
        int var13 = arg0.method736();
        int var14 = arg0.method748();
        class114 var15 = var9.method743(true, true, true);
        if (arg3 != 0) {
            var15.method734(arg3);
        }
        class156 var16 = (class156) var15;
        if (arg6 != class99.method658(arg1 + var13, class276.field4398, arg5 + var11, -7185) || arg6 != class99.method658(arg1 + var14, class276.field4398, arg5 + var12, -7185)) {
            for (int var17 = 0; var17 < var16.field2346; var17++) {
                var16.field2350[var17] += class99.method658(var16.field2360[var17] + arg1, class276.field4398, var16.field2363[var17] + arg5, -7185) - arg6;
            }
            var16.field2371 = false;
        }
        int var18 = 25 % ((arg2 - 56) / 57);
        return var15;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIII)V")
    public static final void method1908(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4533++;
        if (arg1 <= 23) {
            method1904((Component) null, 86);
        }
        for (int var5 = 0; var5 < class146.field2154; var5++) {
            if (arg3 < (class283.field4485[var5] + class149.field2229[var5]) && class149.field2229[var5] < arg0 + arg3 && arg2 < (class272.field4336[var5] + class155.field2306[var5]) && class272.field4336[var5] < (arg2 + arg4)) {
                class110.field1675[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(B)V")
    public static void method1909(byte arg0) {
        field4537 = null;
        field4541 = null;
        field4530 = null;
        field4540 = null;
        if (arg0 <= 69) {
            method1907((class114) null, -57, -50, 76, 7, -80, 95);
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1910(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class66.field921 == 0) {
            int var7 = class181.field2873;
            int var8 = class80.field1161;
            int var9 = class189.field2982;
            int var10 = class242.field3876;
            int var11 = (arg0 - arg4) * (var7 - var8) / arg3 + var8;
            int var12 = (arg2 - arg5) * (var10 - var9) / arg6 + var9;
            if (class45.field572 && (class207.field3238 & 0x40) != 0) {
                class214 var13 = class136.method918(class50.field668, -21154, class154.field2296);
                if (var13 == null) {
                    class163.method1123((byte) 71);
                } else {
                    class244.method1647(class30.field399, 0, var12, class23.field291, var11, 0L, (short) 33, " ->");
                }
            } else {
                class280.field4437++;
                if (class80.field1151 == 1) {
                    class244.method1647(class84.field1313, 0, var12, -1, var11, 0L, (short) 19, "");
                }
                class244.method1647(class36.field465, 0, var12, -1, var11, 0L, (short) 49, "");
            }
        }
        field4536++;
        long var14 = -1L;
        int var16 = 0;
        if (arg1 != 23757) {
            method1908(-65, -49, 108, -90, 115);
        }
        while (class104.field1606 > var16) {
            long var17 = class215.field3509[var16];
            int var19 = (int) var17 & 0x7F;
            int var20 = (int) var17 >> 7 & 0x7F;
            int var21 = (int) (var17 >>> 32) & Integer.MAX_VALUE;
            int var22 = (int) var17 >> 29 & 0x3;
            if (var14 != var17) {
                label371: {
                    var14 = var17;
                    if (var22 == 2 && class199.method1372(class276.field4398, var19, var20, var17)) {
                        class181 var23 = class25.method224(var21, arg1 ^ 0x5CCD);
                        if (var23.field2803 != null) {
                            var23 = var23.method1268(256);
                        }
                        if (var23 == null) {
                            break label371;
                        }
                        if (class66.field921 == 1) {
                            class115.field1705++;
                            class244.method1647(class218.field3547, 0, var20, class68.field956, var19, var17, (short) 44, class53.field736 + " -> <col=00ffff>" + var23.field2810);
                        } else if (class45.field572) {
                            class110 var28 = class151.field2243 == -1 ? null : class222.method1512(-2, class151.field2243);
                            if ((class207.field3238 & 0x4) != 0 && (var28 == null || var23.method1272(class151.field2243, var28.field1667, 86) != var28.field1667)) {
                                class225.field3634++;
                                class244.method1647(class30.field399, 0, var20, class23.field291, var19, var17, (short) 38, class155.field2307 + " -> <col=00ffff>" + var23.field2810);
                            }
                        } else {
                            class54.field745++;
                            String[] var24 = var23.field2861;
                            if (class68.field951) {
                                var24 = class73.method500(81, var24);
                            }
                            if (var24 != null) {
                                for (int var25 = 4; var25 >= 0; var25--) {
                                    if (var24[var25] != null) {
                                        class283.field4489++;
                                        short var26 = 0;
                                        int var27 = -1;
                                        if (var25 == 0) {
                                            var26 = 41;
                                        }
                                        if (var25 == 1) {
                                            var26 = 35;
                                        }
                                        if (var23.field2875 == var25) {
                                            var27 = var23.field2820;
                                        }
                                        if (var23.field2811 == var25) {
                                            var27 = var23.field2853;
                                        }
                                        if (var25 == 2) {
                                            var26 = 22;
                                        }
                                        if (var25 == 3) {
                                            var26 = 17;
                                        }
                                        if (var25 == 4) {
                                            var26 = 1002;
                                        }
                                        class244.method1647(var24[var25], 0, var20, var27, var19, var17, var26, "<col=00ffff>" + var23.field2810);
                                    }
                                }
                            }
                            class244.method1647(class172.field2702, 0, var20, class107.field1645, var19, (long) var23.field2872, (short) 1004, "<col=00ffff>" + var23.field2810);
                        }
                    }
                    if (var22 == 1) {
                        class56 var29 = class100.field1566[var21];
                        if ((var29.field793.field2012 & 0x1) == 0 && (var29.field1226 & 0x7F) == 0 && (var29.field1273 & 0x7F) == 0 || (var29.field793.field2012 & 0x1) == 1 && (var29.field1226 & 0x7F) == 64 && (var29.field1273 & 0x7F) == 64) {
                            int var30 = var29.field1226 - (var29.field793.field2012 - 1) * 64;
                            int var31 = var29.field1273 - (var29.field793.field2012 * 64 - 64);
                            for (int var32 = 0; var32 < class236.field3774; var32++) {
                                class56 var37 = class100.field1566[class248.field3967[var32]];
                                if (var37 != null && !var37.field1235 && var29 != var37 && var37.field1248) {
                                    int var38 = var37.field1226 - ((var37.field793.field2012 - 1) * 64);
                                    int var39 = var37.field1273 + 64 - (var37.field793.field2012 * 64);
                                    if (var30 <= var38 && var37.field793.field2012 <= (var29.field793.field2012 - (var38 - var30 >> 7)) && var31 <= var39 && (var29.field793.field2012 - (var39 - var31 >> 7)) >= var37.field793.field2012) {
                                        class2.method6(var20, class248.field3967[var32], -1, var19, var37.field793);
                                        var37.field1235 = true;
                                    }
                                }
                            }
                            for (int var33 = 0; var33 < class73.field1040; var33++) {
                                class186 var34 = class153.field2277[class8.field117[var33]];
                                if (var34 != null && !var34.field1235 && var34.field1248) {
                                    int var35 = var34.field1226 - (var34.method565((byte) 0) - 1) * 64;
                                    int var36 = var34.field1273 + 64 - var34.method565((byte) 0) * 64;
                                    if (var35 >= var30 && var34.method565((byte) 0) <= (var29.field793.field2012 - (var35 - var30 >> 7)) && var36 >= var31 && var34.method565((byte) 0) <= var29.field793.field2012 - (var36 - var31 >> 7)) {
                                        class235.method1593(var34, var20, -90, var19, class8.field117[var33]);
                                        var34.field1235 = true;
                                    }
                                }
                            }
                        }
                        if (var29.field1235) {
                            break label371;
                        }
                        class2.method6(var20, var21, -1, var19, var29.field793);
                        var29.field1235 = true;
                    }
                    if (var22 == 0) {
                        class186 var40 = class153.field2277[var21];
                        if ((var40.field1226 & 0x7F) == 64 && (var40.field1273 & 0x7F) == 64) {
                            int var41 = var40.field1226 - (var40.method565((byte) 0) - 1) * 64;
                            int var42 = var40.field1273 - (var40.method565((byte) 0) - 1) * 64;
                            for (int var43 = 0; var43 < class236.field3774; var43++) {
                                class56 var48 = class100.field1566[class248.field3967[var43]];
                                if (var48 != null && !var48.field1235 && var48.field1248) {
                                    int var49 = var48.field1226 + 64 - (var48.field793.field2012 * 64);
                                    int var50 = var48.field1273 - (var48.field793.field2012 * 64 - 64);
                                    if (var49 >= var41 && var48.field793.field2012 <= (var40.method565((byte) 0) - (var49 - var41 >> 7)) && var42 <= var50 && var48.field793.field2012 <= var40.method565((byte) 0) - (var50 - var42 >> 7)) {
                                        class2.method6(var20, class248.field3967[var43], -1, var19, var48.field793);
                                        var48.field1235 = true;
                                    }
                                }
                            }
                            for (int var44 = 0; var44 < class73.field1040; var44++) {
                                class186 var45 = class153.field2277[class8.field117[var44]];
                                if (var45 != null && !var45.field1235 && var40 != var45 && var45.field1248) {
                                    int var46 = var45.field1226 + 64 - var45.method565((byte) 0) * 64;
                                    int var47 = var45.field1273 + 64 - (var45.method565((byte) 0) * 64);
                                    if (var46 >= var41 && var45.method565((byte) 0) <= var40.method565((byte) 0) - (var46 - var41 >> 7) && var42 <= var47 && var45.method565((byte) 0) <= (var40.method565((byte) 0) - (var47 - var42 >> 7))) {
                                        class235.method1593(var45, var20, -57, var19, class8.field117[var44]);
                                        var45.field1235 = true;
                                    }
                                }
                            }
                        }
                        if (var40.field1235) {
                            break label371;
                        }
                        class235.method1593(var40, var20, -95, var19, var21);
                        var40.field1235 = true;
                    }
                    if (var22 == 3) {
                        class46 var51 = class243.field3891[class276.field4398][var19][var20];
                        if (var51 != null) {
                            for (class26 var52 = (class26) var51.method354((byte) -105); var52 != null; var52 = (class26) var51.method352((byte) 118)) {
                                int var53 = var52.field365.field2761;
                                class253 var54 = class162.method1112(var53, (byte) 100);
                                if (class66.field921 == 1) {
                                    class244.method1647(class218.field3547, arg1 ^ 0x5CCD, var20, class68.field956, var19, (long) var53, (short) 39, class53.field736 + " -> <col=ff9040>" + var54.field4035);
                                    class247.field3955++;
                                } else if (class45.field572) {
                                    class110 var59 = class151.field2243 == -1 ? null : class222.method1512(-2, class151.field2243);
                                    if ((class207.field3238 & 0x1) != 0 && (var59 == null || var54.method1693(class151.field2243, var59.field1667, arg1 - 23757) != var59.field1667)) {
                                        class10.field145++;
                                        class244.method1647(class30.field399, arg1 ^ 0x5CCD, var20, class23.field291, var19, (long) var53, (short) 47, class155.field2307 + " -> <col=ff9040>" + var54.field4035);
                                    }
                                } else {
                                    String[] var55 = var54.field4064;
                                    if (class68.field951) {
                                        var55 = class73.method500(81, var55);
                                    }
                                    for (int var56 = 4; var56 >= 0; var56--) {
                                        if (var55 != null && var55[var56] != null) {
                                            class105.field1615++;
                                            int var57 = -1;
                                            if (var54.field4103 == var56) {
                                                var57 = var54.field4063;
                                            }
                                            if (var54.field4079 == var56) {
                                                var57 = var54.field4101;
                                            }
                                            byte var58 = 0;
                                            if (var56 == 0) {
                                                var58 = 24;
                                            }
                                            if (var56 == 1) {
                                                var58 = 3;
                                            }
                                            if (var56 == 2) {
                                                var58 = 60;
                                            }
                                            if (var56 == 3) {
                                                var58 = 2;
                                            }
                                            if (var56 == 4) {
                                                var58 = 45;
                                            }
                                            class244.method1647(var55[var56], 0, var20, var57, var19, (long) var53, var58, "<col=ff9040>" + var54.field4035);
                                        }
                                    }
                                    class244.method1647(class172.field2702, 0, var20, class107.field1645, var19, (long) var53, (short) 1003, "<col=ff9040>" + var54.field4035);
                                    class87.field1372++;
                                }
                            }
                        }
                    }
                }
            }
            var16++;
        }
    }
}
