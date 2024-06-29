import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class83 extends class181 {

    @OriginalMember(owner = "client!be", name = "t", descriptor = "Ljava/lang/String;")
    public String field1275;

    @OriginalMember(owner = "client!be", name = "x", descriptor = "[I")
    public static int[] field1279 = new int[1000];

    @OriginalMember(owner = "client!be", name = "s", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!be", name = "u", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!be", name = "v", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!be", name = "w", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!be", name = "y", descriptor = "I")
    public static int field1280;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Z)V")
    public static void method643(boolean arg0) {
        if (arg0) {
            field1280 = -19;
        }
        field1279 = null;
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V")
    public class83() {
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class83(String arg0) {
        this.field1275 = arg0;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIIIII)V")
    public static final void method644(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1274++;
        if (class277.field4275 == 0) {
            int var7 = class223.field3465;
            int var8 = class167.field2467;
            int var9 = class81.field1265;
            int var10 = class114.field1742;
            int var11 = (arg5 - arg2) * (var8 - var9) / arg6 + var9;
            int var12 = (var10 - var7) * (arg1 - arg0) / arg4 + var7;
            if (class76.field1205 && (class146.field2123 & 0x40) != 0) {
                class297 var13 = class237.method1617(class54.field858, (byte) 63, class111.field1688);
                if (var13 == null) {
                    class18.method126((byte) 126);
                } else {
                    class246.method1685(" ->", var12, 0L, class182.field2647, var11, (short) 9, class270.field4218, true);
                }
            } else {
                if (class246.field3836 == 1) {
                    class246.method1685("", var12, 0L, class12.field180, var11, (short) 58, -1, true);
                }
                class87.field1318++;
                class246.method1685("", var12, 0L, class195.field2946, var11, (short) 38, -1, true);
            }
        }
        long var14 = -1L;
        if (arg3 != 127) {
            return;
        }
        for (int var16 = 0; var16 < class177.field2598; var16++) {
            long var17 = class216.field3322[var16];
            int var19 = (int) var17 >> 7 & 0x7F;
            int var20 = (int) var17 & 0x7F;
            int var21 = Integer.MAX_VALUE & (int) (var17 >>> 32);
            int var22 = (int) var17 >> 29 & 0x3;
            if (var14 != var17) {
                var14 = var17;
                if (var22 == 2 && class278.method1855(class260.field3986, var20, var19, var17)) {
                    class188 var23 = class3.method42(47, var21);
                    if (var23.field2804 != null) {
                        var23 = var23.method1253(false);
                    }
                    if (var23 == null) {
                        continue;
                    }
                    if (class277.field4275 == 1) {
                        class246.method1685(class106.field1570 + " -> <col=00ffff>" + var23.field2770, var20, var17, class123.field1819, var19, (short) 12, class166.field2454, true);
                        class177.field2594++;
                    } else if (class76.field1205) {
                        class260 var24 = class207.field3108 == -1 ? null : class77.method612(class207.field3108, arg3 ^ 0x74);
                        if ((class146.field2123 & 0x4) != 0 && (var24 == null || var23.method1246(25, class207.field3108, var24.field3997) != var24.field3997)) {
                            class246.method1685(class174.field2545 + " -> <col=00ffff>" + var23.field2770, var20, var17, class182.field2647, var19, (short) 3, class270.field4218, true);
                            class262.field4032++;
                        }
                    } else {
                        class22.field361++;
                        String[] var25 = var23.field2737;
                        if (class227.field3540) {
                            var25 = class177.method1172(-6, var25);
                        }
                        if (var25 != null) {
                            for (int var26 = 4; var26 >= 0; var26--) {
                                if (var25[var26] != null) {
                                    class182.field2652++;
                                    short var27 = 0;
                                    int var28 = -1;
                                    if (var23.field2744 == var26) {
                                        var28 = var23.field2764;
                                    }
                                    if (var26 == 0) {
                                        var27 = 22;
                                    }
                                    if (var23.field2762 == var26) {
                                        var28 = var23.field2755;
                                    }
                                    if (var26 == 1) {
                                        var27 = 31;
                                    }
                                    if (var26 == 2) {
                                        var27 = 47;
                                    }
                                    if (var26 == 3) {
                                        var27 = 41;
                                    }
                                    if (var26 == 4) {
                                        var27 = 1004;
                                    }
                                    class246.method1685("<col=00ffff>" + var23.field2770, var20, var17, var25[var26], var19, var27, var28, true);
                                }
                            }
                        }
                        class246.method1685("<col=00ffff>" + var23.field2770, var20, (long) var23.field2742, class128.field1892, var19, (short) 1001, class152.field2223, true);
                    }
                }
                if (var22 == 1) {
                    class87 var29 = class243.field3762[var21];
                    if ((var29.field1323.field2813 & 0x1) == 0 && (var29.field425 & 0x7F) == 0 && (var29.field455 & 0x7F) == 0 || (var29.field1323.field2813 & 0x1) == 1 && (var29.field425 & 0x7F) == 64 && (var29.field455 & 0x7F) == 64) {
                        int var30 = var29.field425 - ((var29.field1323.field2813 - 1) * 64);
                        int var31 = var29.field455 - (var29.field1323.field2813 - 1) * 64;
                        for (int var32 = 0; var32 < class207.field3093; var32++) {
                            class87 var37 = class243.field3762[class285.field4379[var32]];
                            if (var37 != null && !var37.field416 && var29 != var37 && var37.field454) {
                                int var38 = var37.field425 - ((var37.field1323.field2813 - 1) * 64);
                                int var39 = var37.field455 + 64 - var37.field1323.field2813 * 64;
                                if (var30 <= var38 && (var29.field1323.field2813 - (var38 - var30 >> 7)) >= var37.field1323.field2813 && var31 <= var39 && (var29.field1323.field2813 - (var39 - var31 >> 7)) >= var37.field1323.field2813) {
                                    class66.method527(arg3 ^ 0x5, var20, var19, var37.field1323, class285.field4379[var32]);
                                    var37.field416 = true;
                                }
                            }
                        }
                        for (int var33 = 0; var33 < class266.field4155; var33++) {
                            class224 var34 = class166.field2438[class205.field3068[var33]];
                            if (var34 != null && !var34.field416 && var34.field454) {
                                int var35 = var34.field425 + 64 - (var34.method168(-108) * 64);
                                int var36 = var34.field455 - (var34.method168(-120) * 64 - 64);
                                if (var35 >= var30 && var34.method168(-92) <= (var29.field1323.field2813 - (var35 - var30 >> 7)) && var36 >= var31 && var34.method168(-102) <= var29.field1323.field2813 - (var36 - var31 >> 7)) {
                                    class244.method1660(-123, var19, var20, class205.field3068[var33], var34);
                                    var34.field416 = true;
                                }
                            }
                        }
                    }
                    if (var29.field416) {
                        continue;
                    }
                    class66.method527(arg3 - 5, var20, var19, var29.field1323, var21);
                    var29.field416 = true;
                }
                if (var22 == 0) {
                    class224 var40 = class166.field2438[var21];
                    if ((var40.field425 & 0x7F) == 64 && (var40.field455 & 0x7F) == 64) {
                        int var41 = var40.field425 - ((var40.method168(arg3 ^ 0xFFFFFFEF) - 1) * 64);
                        int var42 = var40.field455 - (var40.method168(arg3 - 231) * 64 - 64);
                        for (int var43 = 0; var43 < class207.field3093; var43++) {
                            class87 var48 = class243.field3762[class285.field4379[var43]];
                            if (var48 != null && !var48.field416 && var48.field454) {
                                int var49 = var48.field455 - ((var48.field1323.field2813 - 1) * 64);
                                int var50 = var48.field425 + 64 - (var48.field1323.field2813 * 64);
                                if (var41 <= var50 && var48.field1323.field2813 <= (var40.method168(-95) - (var50 - var41 >> 7)) && var42 <= var49 && var48.field1323.field2813 <= (var40.method168(-107) - (var49 - var42 >> 7))) {
                                    class66.method527(62, var20, var19, var48.field1323, class285.field4379[var43]);
                                    var48.field416 = true;
                                }
                            }
                        }
                        for (int var44 = 0; var44 < class266.field4155; var44++) {
                            class224 var45 = class166.field2438[class205.field3068[var44]];
                            if (var45 != null && !var45.field416 && var40 != var45 && var45.field454) {
                                int var46 = var45.field425 - ((var45.method168(-107) - 1) * 64);
                                int var47 = var45.field455 + 64 - var45.method168(-126) * 64;
                                if (var46 >= var41 && var45.method168(-118) <= var40.method168(-94) - (var46 - var41 >> 7) && var42 <= var47 && var45.method168(-102) <= var40.method168(-116) - (var47 - var42 >> 7)) {
                                    class244.method1660(arg3 ^ 0xFFFFFFB9, var19, var20, class205.field3068[var44], var45);
                                    var45.field416 = true;
                                }
                            }
                        }
                    }
                    if (var40.field416) {
                        continue;
                    }
                    class244.method1660(arg3 ^ 0xFFFFFFEB, var19, var20, var21, var40);
                    var40.field416 = true;
                }
                if (var22 == 3) {
                    class284 var51 = class235.field3614[class260.field3986][var20][var19];
                    if (var51 != null) {
                        for (class4 var52 = (class4) var51.method1890(-10963); var52 != null; var52 = (class4) var51.method1887(-24769)) {
                            int var53 = var52.field54.field2878;
                            class15 var54 = class140.method951((byte) -94, var53);
                            if (class277.field4275 == 1) {
                                class246.method1685(class106.field1570 + " -> <col=ff9040>" + var54.field265, var20, (long) var53, class123.field1819, var19, (short) 28, class166.field2454, true);
                                class249.field3857++;
                            } else if (class76.field1205) {
                                class260 var59 = class207.field3108 == -1 ? null : class77.method612(class207.field3108, arg3 - 116);
                                if ((class146.field2123 & 0x1) != 0 && (var59 == null || var54.method104(true, var59.field3997, class207.field3108) != var59.field3997)) {
                                    class246.method1685(class174.field2545 + " -> <col=ff9040>" + var54.field265, var20, (long) var53, class182.field2647, var19, (short) 23, class270.field4218, true);
                                    class11.field163++;
                                }
                            } else {
                                class123.field1828++;
                                String[] var55 = var54.field279;
                                if (class227.field3540) {
                                    var55 = class177.method1172(-6, var55);
                                }
                                for (int var56 = 4; var56 >= 0; var56--) {
                                    if (var55 != null && var55[var56] != null) {
                                        class134.field1961++;
                                        byte var57 = 0;
                                        if (var56 == 0) {
                                            var57 = 60;
                                        }
                                        int var58 = -1;
                                        if (var56 == 1) {
                                            var57 = 19;
                                        }
                                        if (var54.field233 == var56) {
                                            var58 = var54.field260;
                                        }
                                        if (var56 == 2) {
                                            var57 = 45;
                                        }
                                        if (var56 == 3) {
                                            var57 = 39;
                                        }
                                        if (var54.field255 == var56) {
                                            var58 = var54.field284;
                                        }
                                        if (var56 == 4) {
                                            var57 = 32;
                                        }
                                        class246.method1685("<col=ff9040>" + var54.field265, var20, (long) var53, var55[var56], var19, var57, var58, true);
                                    }
                                }
                                class246.method1685("<col=ff9040>" + var54.field265, var20, (long) var53, class128.field1892, var19, (short) 1002, class152.field2223, true);
                            }
                        }
                    }
                }
            }
        }
    }
}
