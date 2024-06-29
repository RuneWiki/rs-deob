import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public abstract class class433 {

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "Lsl;")
    public static class318 field6357 = new class318(55, 16);

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "Lo;")
    public static class24 field6361 = null;

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "Z")
    public static boolean field6360 = false;

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "[C")
    public static char[] field6362 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "I")
    public static int field6356;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "I")
    public static int field6358;

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "I")
    public static int field6359;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILfq;)Lfq;")
    public abstract class135 method2626(int arg0, class135 arg1);

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZIZLjava/lang/String;)I")
    public static final int method2627(boolean arg0, int arg1, boolean arg2, String arg3) {
        field6359++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        boolean var4 = arg0;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg3.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg3.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg2) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                throw new NumberFormatException();
            }
            if (var11 >= arg1) {
                throw new NumberFormatException();
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg1 * var6 + var11;
            if ((var10 / arg1) != var6) {
                throw new NumberFormatException();
            }
            var6 = var10;
            var5 = true;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var6;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
    public static final void method2628(int arg0) {
        if (class76.field1036 > 1) {
            class411.field6111 = class49.field548;
            class76.field1036--;
        }
        field6356++;
        if (class289.field4154 > 0) {
            class289.field4154--;
        }
        if (class450.field6642) {
            class450.field6642 = false;
            class290.method1832((byte) 124);
            return;
        }
        if (!class500.field7415) {
            class63.method567(-89);
        }
        for (int var1 = 0; var1 < 100 && class396.method2428(false); var1++) {
        }
        if (class113.field1589 != 30) {
            return;
        }
        class521.method3098(class531.field7779.method1982(2), class472.field6970, -125);
        if (class377.field5588 == null) {
            if (class346.field4815 <= class437.method2644(-99)) {
                class377.field5588 = class392.field5764.method261(arg0 ^ 0x300F, class521.field7650);
            }
        } else if (class377.field5588.field4733 != -1) {
            class32.method258(-78, class372.field5528);
            class472.field6970.method611((byte) 67, class377.field5588.field4733);
            class377.field5588 = null;
            class346.field4815 = class437.method2644(-62) + 30000L;
        }
        class306 var2 = (class306) class188.field2670.method1018(60);
        if (var2 != null || (class437.method2644(arg0 ^ 0xFFFFCFE0) - 2000L) > class125.field1826) {
            boolean var3 = false;
            int var4 = class472.field6970.field827;
            for (class306 var5 = (class306) class175.field2475.method1018(74); var5 != null && class472.field6970.field827 - var4 < 240; var5 = (class306) class175.field2475.method1022((byte) -112)) {
                var5.method1525((byte) -80);
                int var6 = var5.method236((byte) -87);
                if (var6 < 0) {
                    var6 = 0;
                } else if (var6 > 65534) {
                    var6 = 65534;
                }
                int var7 = var5.method233(arg0 ^ 0x3013);
                if (var7 < 0) {
                    var7 = 0;
                } else if (var7 > 65534) {
                    var7 = 65534;
                }
                boolean var8 = false;
                if (var5.method236((byte) -87) == -1 && var5.method233(-107) == -1) {
                    var6 = -1;
                    var8 = true;
                    var7 = -1;
                }
                if (class203.field2947 != var7 || class112.field1577 != var6) {
                    if (!var3) {
                        class531.field7782++;
                        class32.method258(arg0 - 12442, class501.field7433);
                        class472.field6970.method638(255, 0);
                        var3 = true;
                        var4 = class472.field6970.field827;
                    }
                    int var9 = var7 - class203.field2947;
                    class203.field2947 = var7;
                    int var10 = var6 - class112.field1577;
                    class112.field1577 = var6;
                    int var11 = (int) ((var5.method235((byte) 122) - class125.field1826) / 20L);
                    if (var11 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                        var10 += 32;
                        var9 += 32;
                        class472.field6970.method611((byte) 67, (var9 << 6) + (var11 << 12) + var10);
                    } else if (var11 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                        class472.field6970.method638(255, var11 + 128);
                        var9 += 128;
                        var10 += 128;
                        class472.field6970.method611((byte) 67, (var9 << 8) + var10);
                    } else if (var11 >= 32) {
                        class472.field6970.method611((byte) 67, var11 + 57344);
                        if (var8) {
                            class472.field6970.method618(Integer.MIN_VALUE, (byte) -83);
                        } else {
                            class472.field6970.method618(var6 << 16 | var7, (byte) -97);
                        }
                    } else {
                        class472.field6970.method638(255, var11 + 192);
                        if (var8) {
                            class472.field6970.method618(Integer.MIN_VALUE, (byte) -68);
                        } else {
                            class472.field6970.method618(var6 << 16 | var7, (byte) 92);
                        }
                    }
                    class125.field1826 = var5.method235((byte) 117);
                }
            }
            if (var3) {
                class472.field6970.method632(-1591647264, class472.field6970.field827 - var4);
            }
        }
        if (var2 != null) {
            long var12 = (var2.method235((byte) 127) - class380.field5619) / 50L;
            if (var12 > 32767L) {
                var12 = 32767L;
            }
            class380.field5619 = var2.method235((byte) -68);
            int var14 = var2.method236((byte) -122);
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 65535) {
                var14 = 65535;
            }
            int var15 = var2.method233(-104);
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            byte var16 = 0;
            if (var2.method231((byte) 102) == 2) {
                var16 = 1;
            }
            class91.field1247++;
            int var17 = (int) var12;
            class32.method258(-120, class245.field3608);
            class472.field6970.method618(var14 << 16 | var15, (byte) -65);
            class472.field6970.method592((byte) -115, var17 | var16 << 15);
        }
        if (class484.field7122 > 0) {
            int var18 = 0;
            for (int var19 = 0; var19 < class484.field7122; var19++) {
                if (class386.field5678[var19].method696(false)) {
                    var18++;
                }
            }
            if (var18 > 0) {
                class32.method258(-86, class430.field6324);
                if (var18 > 75) {
                    var18 = 75;
                }
                class223.field3277++;
                class472.field6970.method638(255, var18 * 3);
                for (int var20 = 0; var20 < class484.field7122; var20++) {
                    class74 var21 = class386.field5678[var20];
                    if (var21.method696(false)) {
                        long var22 = (var21.method697(-5423) - class196.field2857) / 50L;
                        class196.field2857 = var21.method697(-5423);
                        if (var22 > 65535L) {
                            var22 = 65535L;
                        }
                        class472.field6970.method638(arg0 ^ 0x30B5, var21.method701((byte) 120));
                        class472.field6970.method611((byte) 67, (int) var22);
                    }
                }
            }
        }
        if (class322.field4535 > 0) {
            class322.field4535--;
        }
        if (class531.field7820 && class322.field4535 <= 0) {
            class531.field7820 = false;
            class322.field4535 = 20;
            class275.field4058++;
            class32.method258(-81, class96.field1295);
            class472.field6970.method592((byte) -120, (int) class328.field4588 >> 3);
            class472.field6970.method583((byte) -57, (int) class386.field5687 >> 3);
        }
        if (class162.field2279 && !class200.field2932) {
            class386.field5696++;
            class200.field2932 = true;
            class32.method258(arg0 - 12475, class199.field2908);
            class472.field6970.method638(255, 1);
        }
        if (!class162.field2279 && class200.field2932) {
            class386.field5696++;
            class200.field2932 = false;
            class32.method258(arg0 ^ 0xFFFFCFF4, class199.field2908);
            class472.field6970.method638(255, 0);
        }
        if (!class247.field3663) {
            class32.method258(-86, class82.field1114);
            class386.field5684++;
            class472.field6970.method638(255, 0);
            int var24 = class472.field6970.field827;
            class65 var25 = class478.field7044.method2074(arg0 ^ 0xFFFFCFEE);
            class472.field6970.method606(0, true, var25.field783, var25.field827);
            class472.field6970.method632(arg0 - 1591659626, -var24 + class472.field6970.field827);
            class247.field3663 = true;
        }
        if (class422.field6240 != null) {
            if (class462.field6802 == 2) {
                class515.method3059(488012003);
            } else if (class462.field6802 == 3) {
                class306.method1901(true);
            }
        }
        if (class411.field6112) {
            class411.field6112 = false;
        } else {
            class434.field6365 /= 2.0F;
        }
        if (class458.field6716) {
            class458.field6716 = false;
        } else {
            class323.field4542 /= 2.0F;
        }
        class272.method1755(false);
        if (class113.field1589 != 30) {
            return;
        }
        class183.method1291(-12388);
        class467.method2803(127);
        class81.method734((byte) 124);
        class65.method614(-126);
        class112.field1578++;
        if (class112.field1578 > 750) {
            class290.method1832((byte) 103);
            return;
        }
        class267.method1718(-117);
        class24.method207((byte) -86);
        class460.method2762(true);
        for (int var26 = class253.field3739.method2747(true, arg0 ^ 0xFFFFCF8E); var26 != -1; var26 = class253.field3739.method2747(false, arg0 - 12470)) {
            class489.method2943(false, var26);
            class480.field7057[class345.method2089(31, class125.field1837++)] = var26;
        }
        for (class215 var27 = class150.method1084(0); var27 != null; var27 = class150.method1084(0)) {
            int var28 = var27.method1467((byte) 94);
            int var29 = var27.method1470((byte) -10);
            if (var28 == 1) {
                class290.field4169[var29] = var27.field3082;
                class34.field396 |= class450.field6635[var29];
                class250.field3684[class345.method2089(class63.field747++, 31)] = var29;
            } else if (var28 == 2) {
                class162.field2292[var29] = var27.field3080;
                class489.field7190[class345.method2089(class176.field2497++, 31)] = var29;
            } else if (var28 == 3) {
                class188 var30 = class371.method2286(0, var29);
                if (!var27.field3080.equals(var30.field2677)) {
                    var30.field2677 = var27.field3080;
                    class120.method951(var30, (byte) -109);
                }
            } else if (var28 == 4) {
                class188 var48 = class371.method2286(arg0 ^ 0x304A, var29);
                int var49 = var27.field3082;
                int var50 = var27.field3081;
                int var51 = var27.field3077;
                if (var48.field2651 != var49 || var48.field2622 != var50 || var48.field2741 != var51) {
                    var48.field2622 = var50;
                    var48.field2741 = var51;
                    var48.field2651 = var49;
                    class120.method951(var48, (byte) -109);
                }
            } else if (var28 == 5) {
                class188 var31 = class371.method2286(0, var29);
                if (var27.field3082 != var31.field2639 || var27.field3082 == -1) {
                    var31.field2686 = 0;
                    var31.field2705 = 0;
                    var31.field2628 = 1;
                    var31.field2639 = var27.field3082;
                    class120.method951(var31, (byte) -109);
                }
            } else if (var28 == 6) {
                int var32 = var27.field3082;
                int var33 = var32 >> 10 & 0x1F;
                int var34 = (var32 & 0x3E9) >> 5;
                int var35 = var32 & 0x1F;
                int var36 = (var33 << 19) + (var34 << 11) + (var35 << 3);
                class188 var37 = class371.method2286(arg0 ^ 0x304A, var29);
                if (var37.field2604 != var36) {
                    var37.field2604 = var36;
                    class120.method951(var37, (byte) -109);
                }
            } else if (var28 == 7) {
                class188 var46 = class371.method2286(0, var29);
                boolean var47 = var27.field3082 == 1;
                if (var47 != var46.field2714) {
                    var46.field2714 = var47;
                    class120.method951(var46, (byte) -109);
                }
            } else if (var28 == 8) {
                class188 var38 = class371.method2286(0, var29);
                if (var27.field3082 != var38.field2735 || var27.field3081 != var38.field2764 || var27.field3077 != var38.field2761) {
                    var38.field2761 = var27.field3077;
                    var38.field2764 = var27.field3081;
                    var38.field2735 = var27.field3082;
                    if (var38.field2617 != -1) {
                        if (var38.field2695 > 0) {
                            var38.field2761 = var38.field2761 * 32 / var38.field2695;
                        } else if (var38.field2688 > 0) {
                            var38.field2761 = var38.field2761 * 32 / var38.field2688;
                        }
                    }
                    class120.method951(var38, (byte) -109);
                }
            } else if (var28 == 9) {
                class188 var45 = class371.method2286(0, var29);
                if (var27.field3082 != var45.field2617 || var27.field3081 != var45.field2710) {
                    var45.field2710 = var27.field3081;
                    var45.field2617 = var27.field3082;
                    class120.method951(var45, (byte) -109);
                }
            } else if (var28 == 10) {
                class188 var39 = class371.method2286(arg0 - 12362, var29);
                if (var27.field3082 != var39.field2685 || var27.field3081 != var39.field2701 || var27.field3077 != var39.field2733) {
                    var39.field2685 = var27.field3082;
                    var39.field2701 = var27.field3081;
                    var39.field2733 = var27.field3077;
                    class120.method951(var39, (byte) -109);
                }
            } else if (var28 == 11) {
                class188 var40 = class371.method2286(0, var29);
                var40.field2656 = 0;
                var40.field2718 = var40.field2671 = var27.field3082;
                var40.field2748 = 0;
                var40.field2765 = var40.field2675 = var27.field3081;
                class120.method951(var40, (byte) -109);
            } else if (var28 == 12) {
                class188 var43 = class371.method2286(0, var29);
                int var44 = var27.field3082;
                if (var43 != null && var43.field2727 == 0) {
                    if (var44 > var43.field2712 - var43.field2672) {
                        var44 = var43.field2712 - var43.field2672;
                    }
                    if (var44 < 0) {
                        var44 = 0;
                    }
                    if (var43.field2744 != var44) {
                        var43.field2744 = var44;
                        class120.method951(var43, (byte) -109);
                    }
                }
            } else if (var28 == 14) {
                class188 var42 = class371.method2286(arg0 ^ 0x304A, var29);
                var42.field2665 = var27.field3082;
            } else if (var28 == 15) {
                class98.field1317 = var27.field3081;
                class233.field3421 = true;
                class74.field1012 = var27.field3082;
            } else if (var28 == 16) {
                class188 var41 = class371.method2286(0, var29);
                var41.field2642 = var27.field3082;
            }
        }
        class406.field6056++;
        if (class496.field7278 != 0) {
            class108.field1541 += 20;
            if (class108.field1541 >= 400) {
                class496.field7278 = 0;
            }
        }
        if (class274.field4041 != null) {
            class382.field5631++;
            if (class382.field5631 >= 15) {
                class120.method951(class274.field4041, (byte) -109);
                class274.field4041 = null;
            }
        }
        class502.field7456 = null;
        class93.field1273 = null;
        class50.field555 = false;
        class442.field6559 = false;
        class50.method502(-1, (byte) -82, null, -1);
        class17.method133(-103, null, -1, -1);
        if (!class453.field6671) {
            class86.field1177 = -1;
        }
        class386.method2353(128);
        class49.field548++;
        if (class314.field4469) {
            class278.field4071++;
            class32.method258(-85, class296.field4254);
            class472.field6970.method619(class95.field1282 | class525.field7708 << 14 | class363.field5040 << 28, 690087856);
            class314.field4469 = false;
        }
        while (true) {
            class125 var52;
            class188 var53;
            class188 var54;
            do {
                var52 = (class125) class10.field116.method1014(arg0 - 8267);
                if (var52 == null) {
                    while (true) {
                        class125 var55;
                        class188 var56;
                        class188 var57;
                        do {
                            var55 = (class125) class33.field389.method1014(4095);
                            if (var55 == null) {
                                while (true) {
                                    class125 var58;
                                    class188 var59;
                                    class188 var60;
                                    do {
                                        var58 = (class125) class440.field6536.method1014(4095);
                                        if (var58 == null) {
                                            if (arg0 != 12362) {
                                                return;
                                            }
                                            if (class502.field7456 == null) {
                                                class495.field7267 = 0;
                                            }
                                            if (class134.field1943 != null) {
                                                class435.method2637(-95);
                                            }
                                            if (class365.field5273 > 0 && class229.field3360.method796(-97, 82) && class229.field3360.method796(-73, 81) && class124.field1814 != 0) {
                                                int var61 = class435.field6375.field6328 - class124.field1814;
                                                if (var61 < 0) {
                                                    var61 = 0;
                                                } else if (var61 > 3) {
                                                    var61 = 3;
                                                }
                                                class87.method771(var61, arg0 - 12299, class435.field6375.field1778[0] + class476.field7013, class435.field6375.field1777[0] + class340.field4713);
                                            }
                                            class200.method1407(-1);
                                            for (int var62 = 0; var62 < 5; var62++) {
                                                int var10002 = class442.field6562[var62]++;
                                            }
                                            if (class34.field396 && class345.field4780 < (class437.method2644(-111) - 60000L)) {
                                                class393.method2406(arg0 - 34487);
                                            }
                                            class87.field1187++;
                                            if (class87.field1187 > 500) {
                                                class87.field1187 = 0;
                                                int var63 = (int) (Math.random() * 8.0D);
                                                if ((var63 & 0x1) == 1) {
                                                    class255.field3748 += class400.field5940;
                                                }
                                                if ((var63 & 0x4) == 4) {
                                                    class148.field2073 += class330.field4615;
                                                }
                                                if ((var63 & 0x2) == 2) {
                                                    class478.field7040 += class73.field1001;
                                                }
                                            }
                                            if (class255.field3748 < -50) {
                                                class400.field5940 = 2;
                                            }
                                            if (class478.field7040 < -55) {
                                                class73.field1001 = 2;
                                            }
                                            if (class255.field3748 > 50) {
                                                class400.field5940 = -2;
                                            }
                                            if (class478.field7040 > 55) {
                                                class73.field1001 = -2;
                                            }
                                            if (class148.field2073 < -40) {
                                                class330.field4615 = 1;
                                            }
                                            class3.field38++;
                                            if (class148.field2073 > 40) {
                                                class330.field4615 = -1;
                                            }
                                            if (class3.field38 > 500) {
                                                class3.field38 = 0;
                                                int var64 = (int) (Math.random() * 8.0D);
                                                if ((var64 & 0x2) == 2) {
                                                    class465.field6839 += class465.field6831;
                                                }
                                                if ((var64 & 0x1) == 1) {
                                                    class455.field6702 += class155.field2205;
                                                }
                                            }
                                            if (class455.field6702 < -60) {
                                                class155.field2205 = 2;
                                            }
                                            if (class455.field6702 > 60) {
                                                class155.field2205 = -2;
                                            }
                                            if (class465.field6839 < -20) {
                                                class465.field6831 = 1;
                                            }
                                            if (class465.field6839 > 10) {
                                                class465.field6831 = -1;
                                            }
                                            class6.field82++;
                                            if (class6.field82 > 50) {
                                                class47.field521++;
                                                class32.method258(-65, class445.field6582);
                                            }
                                            if (class439.field6531) {
                                                class140.method1048((byte) 82);
                                                class439.field6531 = false;
                                            }
                                            try {
                                                if (class383.field5635 != null && class472.field6970.field827 > 0) {
                                                    class98.field1320 += class472.field6970.field827;
                                                    class383.field5635.method650(class472.field6970.field827, 0, class472.field6970.field783, 127);
                                                    class472.field6970.field827 = 0;
                                                    class6.field82 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var65) {
                                                class290.method1832((byte) 99);
                                                return;
                                            }
                                        }
                                        var59 = var58.field1830;
                                        if (var59.field2773 < 0) {
                                            break;
                                        }
                                        var60 = class371.method2286(0, var59.field2745);
                                    } while (var60 == null || var60.field2758 == null || var59.field2773 >= var60.field2758.length || var60.field2758[var59.field2773] != var59);
                                    class41.method409(var58);
                                }
                            }
                            var56 = var55.field1830;
                            if (var56.field2773 < 0) {
                                break;
                            }
                            var57 = class371.method2286(0, var56.field2745);
                        } while (var57 == null || var57.field2758 == null || var56.field2773 >= var57.field2758.length || var57.field2758[var56.field2773] != var56);
                        class41.method409(var55);
                    }
                }
                var53 = var52.field1830;
                if (var53.field2773 < 0) {
                    break;
                }
                var54 = class371.method2286(arg0 ^ 0x304A, var53.field2745);
            } while (var54 == null || var54.field2758 == null || var54.field2758.length <= var53.field2773 || var54.field2758[var53.field2773] != var53);
            class41.method409(var52);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)V")
    public static void method2629(byte arg0) {
        field6357 = null;
        field6362 = null;
        if (arg0 >= -12) {
            field6360 = true;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
    public static final String method2630(String arg0, int arg1, String arg2, String arg3) {
        if (arg1 != -9) {
            return null;
        }
        field6358++;
        for (int var4 = arg3.indexOf(arg2); var4 != -1; var4 = arg3.indexOf(arg2, arg0.length() + var4)) {
            arg3 = arg3.substring(0, var4) + arg0 + arg3.substring(var4 + arg2.length());
        }
        return arg3;
    }
}
