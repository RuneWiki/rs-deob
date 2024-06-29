import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class141 {

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
    public int field2352;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
    public int field2354;

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "Lbe;")
    public static class283 field2360 = class153.method941(125, " steht bereits auf Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "I")
    public static int field2359 = 0;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "I")
    public static int field2358;

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "I")
    public static int field2361;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "Z")
    public static boolean field2355;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIBIIIIIII)V", line = 16)
    public static final void method886(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 < 49) {
            field2359 = 124;
        }
        class91 var10 = (class91) class153.field2518.method1812((byte) 13);
        field2353++;
        class91 var11 = null;
        while (var10 != null) {
            if (var10.field1535 == arg4 && var10.field1540 == arg6 && var10.field1531 == arg5 && var10.field1545 == arg1) {
                var11 = var10;
                break;
            }
            var10 = (class91) class153.field2518.method1813((byte) 48);
        }
        if (var11 == null) {
            var11 = new class91();
            var11.field1535 = arg4;
            var11.field1545 = arg1;
            var11.field1540 = arg6;
            var11.field1531 = arg5;
            class241.method1622(var11, (byte) -116);
            class153.field2518.method1809(var11, (byte) -128);
        }
        var11.field1529 = arg9;
        var11.field1534 = arg8;
        var11.field1544 = arg3;
        var11.field1542 = arg7;
        var11.field1537 = arg0;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IBILrl;II)V", line = 60)
    public static final void method887(int arg0, byte arg1, int arg2, class183 arg3, int arg4, int arg5) {
        field2358++;
        if (arg3.field3140 == -1 && arg3.field3143 == null) {
            return;
        }
        int var6 = 0;
        if (arg3.field3133 < arg0) {
            var6 += arg0 - arg3.field3133;
        } else if (arg0 < arg3.field3138) {
            var6 += arg3.field3138 - arg0;
        }
        if (arg3.field3152 < arg4) {
            var6 += arg4 - arg3.field3152;
        } else if (arg3.field3149 > arg4) {
            var6 += arg3.field3149 - arg4;
        }
        if (arg3.field3136 == 0 || arg3.field3136 < (var6 - 64) || class33.field500 == 0 || arg3.field3144 != arg5) {
            if (arg3.field3155 != null) {
                class301.field5089.method1275(arg3.field3155);
                arg3.field3155 = null;
            }
            if (arg3.field3135 != null) {
                class301.field5089.method1275(arg3.field3135);
                arg3.field3135 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        if (arg1 <= 117) {
            return;
        }
        int var7 = (arg3.field3136 - var6) * class33.field500 / arg3.field3136;
        if (arg3.field3155 != null) {
            arg3.field3155.method295(var7);
        } else if (arg3.field3140 >= 0) {
            class147 var8 = class147.method915(class103.field1741, arg3.field3140, 0);
            if (var8 != null) {
                class32 var9 = var8.method916().method217(class281.field4739);
                class51 var10 = class51.method306(var9, 100, var7);
                var10.method309(-1);
                class301.field5089.method1274(var10);
                arg3.field3155 = var10;
            }
        }
        if (arg3.field3135 != null) {
            arg3.field3135.method295(var7);
            if (!arg3.field3135.method551((byte) -116)) {
                arg3.field3135 = null;
            }
        } else if (arg3.field3143 != null && (arg3.field3134 -= arg2) <= 0) {
            int var11 = (int) (Math.random() * (double) arg3.field3143.length);
            class147 var12 = class147.method915(class103.field1741, arg3.field3143[var11], 0);
            if (var12 != null) {
                class32 var13 = var12.method916().method217(class281.field4739);
                class51 var14 = class51.method306(var13, 100, var7);
                var14.method309(0);
                class301.field5089.method1274(var14);
                arg3.field3135 = var14;
                arg3.field3134 = arg3.field3150 + (int) ((double) (arg3.field3151 - arg3.field3150) * Math.random());
            }
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILdh;IZII)V", line = 189)
    public static final void method888(int arg0, class157 arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field2357++;
        if (class127.field2103 >= 50 || arg1.field2593 == null || arg4 >= arg1.field2593.length || arg1.field2593[arg4] == null) {
            return;
        }
        int var6 = arg1.field2593[arg4][arg0];
        int var7 = var6 & 0xF;
        int var8 = var6 >> 4 & 0x7;
        int var9 = var6 >> 8;
        if (arg1.field2593[arg4].length > 1) {
            int var10 = (int) (Math.random() * (double) arg1.field2593[arg4].length);
            if (var10 > 0) {
                var9 = arg1.field2593[arg4][var10];
            }
        }
        if (var7 == 0) {
            if (arg3) {
                class282.method1893(var9, 0, true, var8);
            }
        } else if (class33.field500 != 0) {
            int var11 = (arg5 - 64) / 128;
            class30.field460[class127.field2103] = var9;
            class280.field4679[class127.field2103] = var8;
            class225.field3788[class127.field2103] = 0;
            int var12 = (arg2 - 64) / 128;
            class168.field2815[class127.field2103] = null;
            class187.field3200[class127.field2103] = (var12 << 8) + (var11 << 16) + var7;
            class127.field2103++;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(II)V", line = 251)
    public static final void method889(int arg0, int arg1) {
        field2351++;
        if (arg1 < 0) {
            return;
        }
        int var2 = class135.field2257[arg1];
        int var3 = class215.field3647[arg1];
        long var4 = class76.field1320[arg1];
        int var6 = (int) class76.field1320[arg1];
        int var7 = class110.field1868[arg1];
        if (var7 >= 2000) {
            var7 -= 2000;
        }
        if (var7 == 12) {
            class228.field3831.method621(2, 8);
            class6.field54++;
            class228.field3831.method1540(var6, (byte) 121);
            class228.field3831.method1516(var3, 2051576880);
            class228.field3831.method1513(var2, (byte) 89);
            class53.field712 = 0;
            class2.field19 = class65.method418(-8429, var3);
            class225.field3777 = var2;
        }
        if (var7 == 39) {
            class228.field3831.method621(102, 8);
            class197.field3374++;
            class228.field3831.method1515(var3, 114);
            class69 var8 = class65.method418(-8429, var3);
            if (var8.field1062 != null && var8.field1062[0][0] == 5) {
                int var9 = var8.field1062[0][1];
                if (class6.field63[var9] != var8.field1131[0]) {
                    class6.field63[var9] = var8.field1131[0];
                    class42.method255(var9, -10);
                }
            }
        }
        if (var7 == 11) {
            class228.field3831.method621(179, 8);
            class228.field3831.method1540(var2, (byte) 95);
            class113.field1900++;
            class228.field3831.method1510((byte) 98, var6);
            class228.field3831.method1548(var3, -63);
            class53.field712 = 0;
            class2.field19 = class65.method418(-8429, var3);
            class225.field3777 = var2;
        }
        if (var7 == 41) {
            class191 var10 = class149.field2436[var6];
            if (var10 != null) {
                class53.method335(class213.field3624.field1150[0], 1, 0, 1, class213.field3624.field1178[0], var10.field1150[0], var10.field1178[0], 0, false, 0, 2, 1);
                class295.field4990++;
                class140.field2339 = 0;
                class273.field4588 = 2;
                class222.field3735 = class47.field647;
                class90.field1527 = class269.field4537;
                class228.field3831.method621(212, 8);
                class228.field3831.method1513(var6, (byte) -111);
            }
        }
        if (var7 == 49) {
            class60 var11 = class33.field493[var6];
            if (var11 != null) {
                class122.field2032++;
                class53.method335(class213.field3624.field1150[0], 1, 0, 1, class213.field3624.field1178[0], var11.field1150[0], var11.field1178[0], 0, false, 0, 2, 1);
                class222.field3735 = class47.field647;
                class90.field1527 = class269.field4537;
                class140.field2339 = 0;
                class273.field4588 = 2;
                class228.field3831.method621(121, 8);
                class228.field3831.method1540(var6, (byte) 82);
            }
        }
        if (var7 == 23) {
            class228.field3831.method621(28, 8);
            class40.field564++;
            class228.field3831.method1533(true, var2);
            class228.field3831.method1516(var3, 2051576880);
            class228.field3831.method1540(var6, (byte) 113);
            class53.field712 = 0;
            class2.field19 = class65.method418(-8429, var3);
            class225.field3777 = var2;
        }
        if (var7 == 29) {
            class46.method270(-27);
            class69 var12 = class65.method418(-8429, var3);
            class222.field3727 = 1;
            class99.field1685 = var3;
            class113.field1901 = var6;
            class70.field1191 = var2;
            class272.method1834(var12, 0);
            class222.field3745 = class299.method2022(new class283[] { class245.field4163, class103.method676(var6, -1).field5155, class87.field1479 }, (byte) 74);
            if (class222.field3745 == null) {
                class222.field3745 = class35.field524;
            }
            return;
        }
        if (var7 == 51) {
            class228.field3831.method621(53, 8);
            class228.field3831.method1501(var3, -14657);
            class228.field3831.method1513(var2, (byte) 48);
            class306.field5244++;
            class228.field3831.method1533(true, class70.field1191);
            class228.field3831.method1515(class99.field1685, 74);
            class228.field3831.method1510((byte) 80, var6);
            class228.field3831.method1510((byte) 50, class113.field1901);
            class53.field712 = 0;
            class2.field19 = class65.method418(-8429, var3);
            class225.field3777 = var2;
        }
        if (var7 == 18) {
            class191 var13 = class149.field2436[var6];
            if (var13 != null) {
                class215.field3648++;
                class53.method335(class213.field3624.field1150[0], 1, 0, 1, class213.field3624.field1178[0], var13.field1150[0], var13.field1178[0], 0, false, 0, 2, 1);
                class222.field3735 = class47.field647;
                class90.field1527 = class269.field4537;
                class140.field2339 = 0;
                class273.field4588 = 2;
                class228.field3831.method621(142, 8);
                class228.field3831.method1540(var6, (byte) -118);
            }
        }
        if (var7 == 10) {
            class191 var14 = class149.field2436[var6];
            if (var14 != null) {
                class53.method335(class213.field3624.field1150[0], 1, 0, 1, class213.field3624.field1178[0], var14.field1150[0], var14.field1178[0], 0, false, 0, 2, 1);
                class90.field1527 = class269.field4537;
                class273.field4588 = 2;
                class140.field2339 = 0;
                class222.field3735 = class47.field647;
                class3.field38++;
                class228.field3831.method621(215, 8);
                class228.field3831.method1513(var6, (byte) -107);
            }
        }
        if (var7 == 47) {
            class252.method1711(0);
        }
        if (var7 == 38) {
            class241.method1623(var3, 0, var4, var2);
            class228.field3831.method621(39, 8);
            class236.field3956++;
            class228.field3831.method1540((int) (var4 >>> 32) & Integer.MAX_VALUE, (byte) -88);
            class228.field3831.method1513(class107.field1833 + var3, (byte) -104);
            class228.field3831.method1533(true, class214.field3637 + var2);
        }
        if (var7 == 45) {
            class69 var15 = class225.method1480((byte) 117, var2, var3);
            if (var15 != null) {
                class46.method270(126);
                class299.method2029(var3, var2, (byte) 8, class6.method36(client.method1601(var15), (byte) 67));
                class222.field3727 = 0;
                class89.field1514 = class210.method1386(var15, 0);
                if (class89.field1514 == null) {
                    class89.field1514 = class48.field662;
                }
                if (var15.field1121) {
                    class135.field2272 = class299.method2022(new class283[] { var15.field1008, class87.field1479 }, (byte) 115);
                } else {
                    class135.field2272 = class299.method2022(new class283[] { class142.field2362, var15.field982, class87.field1479 }, (byte) 43);
                }
            }
            return;
        }
        if (var7 == 57) {
            class58.field795++;
            class241.method1623(var3, 0, var4, var2);
            class228.field3831.method621(25, 8);
            class228.field3831.method1533(true, Integer.MAX_VALUE & (int) (var4 >>> 32));
            class228.field3831.method1533(true, class107.field1833 + var3);
            class228.field3831.method1540(var2 + class214.field3637, (byte) 95);
        }
        if (var7 == 1001) {
            class69 var16 = class65.method418(-8429, var3);
            if (var16 == null || var16.field973[var2] < 100000) {
                class228.field3831.method621(0, 8);
                class109.field1842++;
                class228.field3831.method1533(true, var6);
            } else {
                class60.method394(0, class299.method2022(new class283[] { class296.method2012(var16.field973[var2], (byte) 125), class67.field949, class103.method676(var6, -1).field5155 }, (byte) 89), class213.field3616, (byte) 58);
            }
            class53.field712 = 0;
            class2.field19 = class65.method418(-8429, var3);
            class225.field3777 = var2;
        }
        if (var7 == 1006) {
            class241.method1623(var3, 0, var4, var2);
            class144.field2384++;
            class228.field3831.method621(219, 8);
            class228.field3831.method1513(var3 + class107.field1833, (byte) -108);
            class228.field3831.method1513(class214.field3637 + var2, (byte) -110);
            class228.field3831.method1510((byte) 126, (int) (var4 >>> 32) & Integer.MAX_VALUE);
        }
        if (var7 == 28) {
            class191 var17 = class149.field2436[var6];
            if (var17 != null) {
                class53.method335(class213.field3624.field1150[0], 1, 0, 1, class213.field3624.field1178[0], var17.field1150[0], var17.field1178[0], 0, false, 0, 2, 1);
                class273.field4588 = 2;
                class140.field2339 = 0;
                class222.field3735 = class47.field647;
                class241.field4070++;
                class90.field1527 = class269.field4537;
                class228.field3831.method621(234, 8);
                class228.field3831.method1540(var6, (byte) 100);
                class228.field3831.method1540(class175.field3023, (byte) 74);
                class228.field3831.method1516(class143.field2373, 2051576880);
            }
        }
        if (var7 == 1002) {
            class222.field3735 = class47.field647;
            class116.field1967++;
            class273.field4588 = 2;
            class140.field2339 = 0;
            class90.field1527 = class269.field4537;
            class228.field3831.method621(203, 8);
            class228.field3831.method1533(true, var6);
        }
        if (var7 == 1) {
            class60 var18 = class33.field493[var6];
            if (var18 != null) {
                class53.method335(class213.field3624.field1150[0], 1, 0, 1, class213.field3624.field1178[0], var18.field1150[0], var18.field1178[0], 0, false, 0, 2, 1);
                class222.field3735 = class47.field647;
                class90.field1527 = class269.field4537;
                class140.field2339 = 0;
                class184.field3173++;
                class273.field4588 = 2;
                class228.field3831.method621(71, 8);
                class228.field3831.method1548(class99.field1685, -109);
                class228.field3831.method1510((byte) 116, class113.field1901);
                class228.field3831.method1513(class70.field1191, (byte) 85);
                class228.field3831.method1513(var6, (byte) -101);
            }
        }
        if (var7 == 15) {
            class63.field870++;
            class228.field3831.method621(220, 8);
            class228.field3831.method1533(true, var2);
            class228.field3831.method1510((byte) 25, var6);
            class228.field3831.method1515(var3, 64);
            class53.field712 = 0;
            class2.field19 = class65.method418(-8429, var3);
            class225.field3777 = var2;
        }
        if (var7 == 19) {
            class249.field4242++;
            boolean var19 = class53.method335(class213.field3624.field1150[0], 0, 0, 1, class213.field3624.field1178[0], var3, var2, 0, false, 0, 2, 0);
            if (!var19) {
                class53.method335(class213.field3624.field1150[0], 1, 0, 1, class213.field3624.field1178[0], var3, var2, 0, false, 0, 2, 1);
            }
            class222.field3735 = class47.field647;
            class90.field1527 = class269.field4537;
            class140.field2339 = 0;
            class273.field4588 = 2;
            class228.field3831.method621(148, 8);
            class228.field3831.method1513(var6, (byte) 60);
            class228.field3831.method1513(class107.field1833 + var3, (byte) 75);
            class228.field3831.method1510((byte) 28, class214.field3637 + var2);
        }
        if (var7 == 5) {
            class69 var21 = class65.method418(-8429, var3);
            boolean var22 = true;
            if (var21.field975 > 0) {
                var22 = class151.method930(var21, -122);
            }
            if (var22) {
                class197.field3374++;
                class228.field3831.method621(102, 8);
                class228.field3831.method1515(var3, 90);
            }
        }
        if (var7 == 21 && class241.method1623(var3, 0, var4, var2)) {
            class228.field3831.method621(5, 8);
            class47.field645++;
            class228.field3831.method1501(class143.field2373, -14657);
            class228.field3831.method1513(var3 + class107.field1833, (byte) -127);
            class228.field3831.method1510((byte) 57, class175.field3023);
            class228.field3831.method1533(true, var2 + class214.field3637);
            class228.field3831.method1533(true, (int) (var4 >>> 32) & Integer.MAX_VALUE);
        }
        if (var7 == 22) {
            class197.field3374++;
            class228.field3831.method621(102, 8);
            class228.field3831.method1515(var3, 67);
            class69 var23 = class65.method418(-8429, var3);
            if (var23.field1062 != null && var23.field1062[0][0] == 5) {
                int var24 = var23.field1062[0][1];
                class6.field63[var24] = 1 - class6.field63[var24];
                class42.method255(var24, -10);
            }
        }
        if (var7 == 20) {
            class191 var25 = class149.field2436[var6];
            if (var25 != null) {
                class53.method335(class213.field3624.field1150[0], 1, 0, 1, class213.field3624.field1178[0], var25.field1150[0], var25.field1178[0], 0, false, 0, 2, 1);
                class140.field2339 = 0;
                class222.field3735 = class47.field647;
                class273.field4588 = 2;
                class130.field2202++;
                class90.field1527 = class269.field4537;
                class228.field3831.method621(79, 8);
                class228.field3831.method1510((byte) 24, var6);
            }
        }
        if (var7 == 14 && class69.field1034 == null) {
            class94.method606(var2, var3, (byte) 114);
            class69.field1034 = class225.method1480((byte) 119, var2, var3);
            class272.method1834(class69.field1034, 0);
        }
        if (var7 == 50) {
            class228.field3831.method621(50, 8);
            class67.field946++;
            class228.field3831.method1548(var3, 51);
            class228.field3831.method1510((byte) 73, var6);
            class228.field3831.method1533(true, var2);
            class53.field712 = 0;
            class2.field19 = class65.method418(-8429, var3);
            class225.field3777 = var2;
        }
        if (var7 == 36) {
            boolean var26 = class53.method335(class213.field3624.field1150[0], 0, 0, 1, class213.field3624.field1178[0], var3, var2, 0, false, 0, 2, 0);
            class153.field2508++;
            if (!var26) {
                class53.method335(class213.field3624.field1150[0], 1, 0, 1, class213.field3624.field1178[0], var3, var2, 0, false, 0, 2, 1);
            }
            class90.field1527 = class269.field4537;
            class140.field2339 = 0;
            class222.field3735 = class47.field647;
            class273.field4588 = 2;
            class228.field3831.method621(186, 8);
            class228.field3831.method1510((byte) 85, class214.field3637 + var2);
            class228.field3831.method1510((byte) 18, var6);
            class228.field3831.method1540(class107.field1833 + var3, (byte) -43);
        }
        if (var7 == 59) {
            class191 var28 = class149.field2436[var6];
            if (var28 != null) {
                class53.method335(class213.field3624.field1150[0], 1, 0, 1, class213.field3624.field1178[0], var28.field1150[0], var28.field1178[0], 0, false, 0, 2, 1);
                class309.field5283++;
                class222.field3735 = class47.field647;
                class90.field1527 = class269.field4537;
                class140.field2339 = 0;
                class273.field4588 = 2;
                class228.field3831.method621(82, 8);
                class228.field3831.method1510((byte) 56, var6);
            }
        }
        if (var7 == 3) {
            class60 var29 = class33.field493[var6];
            if (var29 != null) {
                class55.field760++;
                class53.method335(class213.field3624.field1150[0], 1, 0, 1, class213.field3624.field1178[0], var29.field1150[0], var29.field1178[0], 0, false, 0, 2, 1);
                class273.field4588 = 2;
                class90.field1527 = class269.field4537;
                class222.field3735 = class47.field647;
                class140.field2339 = 0;
                class228.field3831.method621(189, 8);
                class228.field3831.method1513(var6, (byte) 45);
            }
        }
        if (var7 == 24 && class241.method1623(var3, 0, var4, var2)) {
            class228.field3831.method621(107, 8);
            class116.field1963++;
            class228.field3831.method1540(class214.field3637 + var2, (byte) -124);
            class228.field3831.method1516(class99.field1685, 2051576880);
            class228.field3831.method1540(var3 + class107.field1833, (byte) -94);
            class228.field3831.method1533(true, class70.field1191);
            class228.field3831.method1533(true, class113.field1901);
            class228.field3831.method1540((int) (var4 >>> 32) & Integer.MAX_VALUE, (byte) -102);
        }
        if (var7 == 42) {
            class241.method1623(var3, 0, var4, var2);
            class149.field2425++;
            class228.field3831.method621(24, 8);
            class228.field3831.method1513((int) (var4 >>> 32) & Integer.MAX_VALUE, (byte) -104);
            class228.field3831.method1510((byte) 62, class107.field1833 + var3);
            class228.field3831.method1513(class214.field3637 + var2, (byte) -126);
        }
        if (var7 == 16) {
            class30.field462++;
            class228.field3831.method621(254, 8);
            class228.field3831.method1516(var3, 2051576880);
            class228.field3831.method1513(var6, (byte) -108);
            class228.field3831.method1513(var2, (byte) 29);
            class53.field712 = 0;
            class2.field19 = class65.method418(-8429, var3);
            class225.field3777 = var2;
        }
        if (var7 == 26) {
            class195.field3327++;
            boolean var30 = class53.method335(class213.field3624.field1150[0], 0, 0, 1, class213.field3624.field1178[0], var3, var2, 0, false, 0, 2, 0);
            if (!var30) {
                class53.method335(class213.field3624.field1150[0], 1, 0, 1, class213.field3624.field1178[0], var3, var2, 0, false, 0, 2, 1);
            }
            class273.field4588 = 2;
            class222.field3735 = class47.field647;
            class140.field2339 = 0;
            class90.field1527 = class269.field4537;
            class228.field3831.method621(247, 8);
            class228.field3831.method1516(class99.field1685, 2051576880);
            class228.field3831.method1540(class214.field3637 + var2, (byte) -46);
            class228.field3831.method1513(class113.field1901, (byte) 104);
            class228.field3831.method1510((byte) 83, var6);
            class228.field3831.method1513(class70.field1191, (byte) 80);
            class228.field3831.method1513(var3 + class107.field1833, (byte) 50);
        }
        if (var7 == 25) {
            class191 var32 = class149.field2436[var6];
            if (var32 != null) {
                class280.field4681++;
                class53.method335(class213.field3624.field1150[0], 1, 0, 1, class213.field3624.field1178[0], var32.field1150[0], var32.field1178[0], 0, false, 0, 2, 1);
                class140.field2339 = 0;
                class90.field1527 = class269.field4537;
                class222.field3735 = class47.field647;
                class273.field4588 = 2;
                class228.field3831.method621(133, 8);
                class228.field3831.method1510((byte) 55, var6);
            }
        }
        if (var7 == 48) {
            class60 var33 = class33.field493[var6];
            if (var33 != null) {
                class53.method335(class213.field3624.field1150[0], 1, 0, 1, class213.field3624.field1178[0], var33.field1150[0], var33.field1178[0], 0, false, 0, 2, 1);
                class90.field1527 = class269.field4537;
                class140.field2339 = 0;
                class222.field3735 = class47.field647;
                class273.field4588 = 2;
                class228.field3831.method621(85, 8);
                class163.field2699++;
                class228.field3831.method1510((byte) 99, var6);
            }
        }
        if (var7 == 35) {
            class143.method902(class61.field850, var2, var3);
        }
        if (var7 == 7) {
            class35.field519 = true;
            class143.method902(class61.field850, var2, var3);
        }
        if (var7 == 34) {
            class46.field633++;
            boolean var34 = class53.method335(class213.field3624.field1150[0], 0, 0, 1, class213.field3624.field1178[0], var3, var2, 0, false, 0, 2, 0);
            if (!var34) {
                class53.method335(class213.field3624.field1150[0], 1, 0, 1, class213.field3624.field1178[0], var3, var2, 0, false, 0, 2, 1);
            }
            class222.field3735 = class47.field647;
            class140.field2339 = 0;
            class90.field1527 = class269.field4537;
            class273.field4588 = 2;
            class228.field3831.method621(233, 8);
            class228.field3831.method1513(class214.field3637 + var2, (byte) 70);
            class228.field3831.method1510((byte) 52, class107.field1833 + var3);
            class228.field3831.method1540(var6, (byte) -64);
        }
        if (var7 == 46) {
            class60 var36 = class33.field493[var6];
            if (var36 != null) {
                class133.field2239++;
                class53.method335(class213.field3624.field1150[0], 1, 0, 1, class213.field3624.field1178[0], var36.field1150[0], var36.field1178[0], 0, false, 0, 2, 1);
                class140.field2339 = 0;
                class90.field1527 = class269.field4537;
                class222.field3735 = class47.field647;
                class273.field4588 = 2;
                class228.field3831.method621(205, 8);
                class228.field3831.method1513(var6, (byte) -113);
            }
        }
        if (var7 == 1007) {
            class140.field2339 = 0;
            class222.field3735 = class47.field647;
            class90.field1527 = class269.field4537;
            class273.field4588 = 2;
            class60 var37 = class33.field493[var6];
            if (var37 != null) {
                class129 var38 = var37.field822;
                if (var38.field2193 != null) {
                    var38 = var38.method806((byte) -3);
                }
                if (var38 != null) {
                    class195.field3333++;
                    class228.field3831.method621(167, 8);
                    class228.field3831.method1513(var38.field2174, (byte) 25);
                }
            }
        }
        if (var7 == 32) {
            class301.field5080++;
            class228.field3831.method621(161, 8);
            class228.field3831.method1533(true, var2);
            class228.field3831.method1548(var3, -69);
            class228.field3831.method1513(var6, (byte) 83);
            class53.field712 = 0;
            class2.field19 = class65.method418(-8429, var3);
            class225.field3777 = var2;
        }
        if (var7 == 2) {
            class191 var39 = class149.field2436[var6];
            if (var39 != null) {
                class87.field1467++;
                class53.method335(class213.field3624.field1150[0], 1, 0, 1, class213.field3624.field1178[0], var39.field1150[0], var39.field1178[0], 0, false, 0, 2, 1);
                class222.field3735 = class47.field647;
                class273.field4588 = 2;
                class90.field1527 = class269.field4537;
                class140.field2339 = 0;
                class228.field3831.method621(101, 8);
                class228.field3831.method1510((byte) 111, var6);
            }
        }
        if (var7 == 17) {
            class228.field3831.method621(243, 8);
            class40.field567++;
            class228.field3831.method1513(class175.field3023, (byte) -115);
            class228.field3831.method1516(class143.field2373, 2051576880);
            class228.field3831.method1515(var3, 54);
            class228.field3831.method1540(var2, (byte) 125);
        }
        if (var7 == 9) {
            class191 var40 = class149.field2436[var6];
            if (var40 != null) {
                class53.method335(class213.field3624.field1150[0], 1, 0, 1, class213.field3624.field1178[0], var40.field1150[0], var40.field1178[0], 0, false, 0, 2, 1);
                class48.field658++;
                class140.field2339 = 0;
                class273.field4588 = 2;
                class222.field3735 = class47.field647;
                class90.field1527 = class269.field4537;
                class228.field3831.method621(185, 8);
                class228.field3831.method1533(true, class113.field1901);
                class228.field3831.method1510((byte) 82, class70.field1191);
                class228.field3831.method1501(class99.field1685, -14657);
                class228.field3831.method1510((byte) 55, var6);
            }
        }
        if (var7 == 30) {
            class166.field2770++;
            class241.method1623(var3, 0, var4, var2);
            class228.field3831.method621(6, 8);
            class228.field3831.method1513(class107.field1833 + var3, (byte) -118);
            class228.field3831.method1510((byte) 79, (int) (var4 >>> 32) & Integer.MAX_VALUE);
            class228.field3831.method1540(class214.field3637 + var2, (byte) -68);
        }
        if (var7 == 40) {
            class228.field3831.method621(139, 8);
            class5.field51++;
            class228.field3831.method1540(var6, (byte) -63);
            class228.field3831.method1540(var2, (byte) 110);
            class228.field3831.method1515(var3, 122);
            class53.field712 = 0;
            class2.field19 = class65.method418(-8429, var3);
            class225.field3777 = var2;
        }
        if (var7 == 43 || var7 == 1005) {
            class159.method972(var6, class216.field3656[arg1], var3, var2, 122);
        }
        if (var7 == 6) {
            boolean var41 = class53.method335(class213.field3624.field1150[0], 0, 0, 1, class213.field3624.field1178[0], var3, var2, 0, false, 0, 2, 0);
            if (!var41) {
                class53.method335(class213.field3624.field1150[0], 1, 0, 1, class213.field3624.field1178[0], var3, var2, 0, false, 0, 2, 1);
            }
            class90.field1527 = class269.field4537;
            class94.field1584++;
            class140.field2339 = 0;
            class273.field4588 = 2;
            class222.field3735 = class47.field647;
            class228.field3831.method621(118, 8);
            class228.field3831.method1510((byte) 107, class214.field3637 + var2);
            class228.field3831.method1533(true, var6);
            class228.field3831.method1501(class143.field2373, -14657);
            class228.field3831.method1533(true, class175.field3023);
            class228.field3831.method1510((byte) 49, class107.field1833 + var3);
        }
        if (var7 == 1004) {
            class222.field3735 = class47.field647;
            class109.field1842++;
            class140.field2339 = 0;
            class90.field1527 = class269.field4537;
            class273.field4588 = 2;
            class228.field3831.method621(0, 8);
            class228.field3831.method1533(true, var6);
        }
        if (var7 == 44) {
            class97.field1619++;
            boolean var43 = class53.method335(class213.field3624.field1150[0], 0, 0, 1, class213.field3624.field1178[0], var3, var2, 0, false, 0, 2, 0);
            if (!var43) {
                class53.method335(class213.field3624.field1150[0], 1, 0, 1, class213.field3624.field1178[0], var3, var2, 0, false, 0, 2, 1);
            }
            class273.field4588 = 2;
            class90.field1527 = class269.field4537;
            class222.field3735 = class47.field647;
            class140.field2339 = 0;
            class228.field3831.method621(94, 8);
            class228.field3831.method1513(class107.field1833 + var3, (byte) -120);
            class228.field3831.method1540(var6, (byte) -122);
            class228.field3831.method1533(true, var2 + class214.field3637);
        }
        if (var7 == 37) {
            class191 var45 = class149.field2436[var6];
            if (var45 != null) {
                class53.method335(class213.field3624.field1150[0], 1, 0, 1, class213.field3624.field1178[0], var45.field1150[0], var45.field1178[0], 0, false, 0, 2, 1);
                class273.field4588 = 2;
                class222.field3735 = class47.field647;
                class248.field4241++;
                class140.field2339 = 0;
                class90.field1527 = class269.field4537;
                class228.field3831.method621(59, 8);
                class228.field3831.method1513(var6, (byte) -116);
            }
        }
        if (var7 == 33) {
            class237.field3980++;
            boolean var46 = class53.method335(class213.field3624.field1150[0], 0, 0, 1, class213.field3624.field1178[0], var3, var2, 0, false, 0, 2, 0);
            if (!var46) {
                class53.method335(class213.field3624.field1150[0], 1, 0, 1, class213.field3624.field1178[0], var3, var2, 0, false, 0, 2, 1);
            }
            class222.field3735 = class47.field647;
            class140.field2339 = 0;
            class90.field1527 = class269.field4537;
            class273.field4588 = 2;
            class228.field3831.method621(196, 8);
            class228.field3831.method1513(class107.field1833 + var3, (byte) -101);
            class228.field3831.method1533(true, var6);
            class228.field3831.method1533(true, class214.field3637 + var2);
        }
        if (var7 == 4) {
            class60 var48 = class33.field493[var6];
            if (var48 != null) {
                class53.method335(class213.field3624.field1150[0], 1, 0, 1, class213.field3624.field1178[0], var48.field1150[0], var48.field1178[0], 0, false, 0, 2, 1);
                class140.field2339 = 0;
                class90.field1527 = class269.field4537;
                class222.field3735 = class47.field647;
                class254.field4285++;
                class273.field4588 = 2;
                class228.field3831.method621(192, 8);
                class228.field3831.method1501(class143.field2373, -14657);
                class228.field3831.method1533(true, class175.field3023);
                class228.field3831.method1540(var6, (byte) 103);
            }
        }
        if (var7 == 31) {
            class228.field3831.method621(152, 8);
            class228.field3831.method1515(class143.field2373, 63);
            class216.field3666++;
            class228.field3831.method1548(var3, -35);
            class228.field3831.method1533(true, class175.field3023);
            class228.field3831.method1533(true, var6);
            class228.field3831.method1540(var2, (byte) -58);
            class53.field712 = 0;
            class2.field19 = class65.method418(-8429, var3);
            class225.field3777 = var2;
        }
        if (var7 == 13) {
            class60 var49 = class33.field493[var6];
            if (var49 != null) {
                class53.method335(class213.field3624.field1150[0], 1, 0, 1, class213.field3624.field1178[0], var49.field1150[0], var49.field1178[0], 0, false, 0, 2, 1);
                class222.field3735 = class47.field647;
                class273.field4588 = 2;
                class90.field1527 = class269.field4537;
                class140.field2339 = 0;
                class192.field3293++;
                class228.field3831.method621(84, 8);
                class228.field3831.method1510((byte) 71, var6);
            }
        }
        int var50 = -8 % ((arg0 - 57) / 54);
        if (var7 == 8) {
            class260.field4417++;
            class228.field3831.method621(178, 8);
            class228.field3831.method1540(var6, (byte) -90);
            class228.field3831.method1501(var3, -14657);
            class228.field3831.method1540(var2, (byte) -108);
            class53.field712 = 0;
            class2.field19 = class65.method418(-8429, var3);
            class225.field3777 = var2;
        }
        if (var7 == 58) {
            class228.field3831.method621(246, 8);
            class228.field3831.method1513(var2, (byte) -126);
            class278.field4644++;
            class228.field3831.method1513(var6, (byte) -118);
            class228.field3831.method1516(var3, 2051576880);
            class53.field712 = 0;
            class2.field19 = class65.method418(-8429, var3);
            class225.field3777 = var2;
        }
        if (class222.field3727 != 0) {
            class222.field3727 = 0;
            class272.method1834(class65.method418(-8429, class99.field1685), 0);
        }
        if (class103.field1760) {
            class46.method270(-66);
        }
        if (class2.field19 != null && class53.field712 == 0) {
            class272.method1834(class2.field19, 0);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V", line = 1239)
    public static void method890(int arg0) {
        int var1 = -71 / ((39 - arg0) / 63);
        field2360 = null;
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(IIIIIIZ)V", line = 1246)
    public class141(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field2352 = arg5;
        this.field2354 = arg2;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I[Lkg;I)V", line = 1267)
    public static final void method891(int arg0, class69[] arg1, int arg2) {
        if (arg0 != 2047) {
            field2360 = (class283) null;
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class69 var4 = arg1[var3];
            if (var4 != null && var4.field1059 == arg2 && (!var4.field1121 || !client.method1590(var4))) {
                if (var4.field1143 == 0) {
                    if (!var4.field1121 && client.method1590(var4) && class117.field1978 != var4) {
                        continue;
                    }
                    method891(2047, arg1, var4.field1079);
                    if (var4.field1043 != null) {
                        method891(2047, var4.field1043, var4.field1079);
                    }
                    class159 var5 = (class159) class58.field805.method1612((long) var4.field1079, 125);
                    if (var5 != null) {
                        class153.method943(26393, var5.field2600);
                    }
                }
                if (var4.field1143 == 6) {
                    if (var4.field1052 != -1 || var4.field1092 != -1) {
                        boolean var6 = class307.method2090(var4, (byte) 32);
                        int var7;
                        if (var6) {
                            var7 = var4.field1092;
                        } else {
                            var7 = var4.field1052;
                        }
                        if (var7 != -1) {
                            class157 var8 = class132.method821(128, var7);
                            if (var8 != null) {
                                var4.field1088 += class44.field606;
                                while (var8.field2568[var4.field1075] < var4.field1088) {
                                    var4.field1088 -= var8.field2568[var4.field1075];
                                    var4.field1075++;
                                    if (var8.field2578.length <= var4.field1075) {
                                        var4.field1075 -= var8.field2567;
                                        if (var4.field1075 < 0 || var4.field1075 >= var8.field2578.length) {
                                            var4.field1075 = 0;
                                        }
                                    }
                                    class272.method1834(var4, 0);
                                }
                            }
                        }
                    }
                    if (var4.field1025 != 0 && !var4.field1121) {
                        int var9 = var4.field1025 << 16 >> 16;
                        int var10 = var4.field1025 >> 16;
                        int var11 = class44.field606 * var10;
                        int var12 = class44.field606 * var9;
                        var4.field977 = var4.field977 + var12 & 0x7FF;
                        var4.field1099 = var4.field1099 + var11 & 0x7FF;
                        class272.method1834(var4, 0);
                    }
                }
            }
        }
        field2356++;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(III)V", line = 1379)
    public static final void method892(int arg0, int arg1, int arg2) {
        class94 var3 = class46.method272(arg0, (byte) 70);
        field2361++;
        int var4 = var3.field1590;
        int var5 = var3.field1585;
        int var6 = var3.field1594;
        if (arg1 != 196) {
            return;
        }
        int var7 = class294.field4955[var6 - var4];
        if (arg2 < 0 || var7 < arg2) {
            arg2 = 0;
        }
        int var8 = var7 << var4;
        class237.method1582((byte) 123, var5, arg2 << var4 & var8 | ~var8 & class67.field934[var5]);
    }
}
