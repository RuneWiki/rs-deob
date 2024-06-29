import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class60 {

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    public static int field1117 = 0;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "Z")
    public static boolean field1115 = false;

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "B")
    public static byte field1121 = 0;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "Z")
    public static boolean field1116;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
    public static final void method426(int arg0) {
        field1114++;
        if (class28.field629 > 0) {
            class28.field629--;
        }
        if (class202.field3690 > 1) {
            class202.field3690--;
        }
        if (class42.field896) {
            class42.field896 = false;
            class167.method1079((byte) -107);
            return;
        }
        for (int var1 = 0; var1 < 100 && class184.method1156(arg0); var1++) {
        }
        if (class34.field749 != 30) {
            return;
        }
        class105.method643((byte) 90, class42.field895, 224);
        Object var2 = class186.field3444.field1917;
        synchronized (class186.field3444.field1917) {
            if (!class65.field1233) {
                class186.field3444.field1922 = 0;
            } else if (class222.field4168 != 0 || class186.field3444.field1922 >= 40) {
                class42.field895.method1347((byte) -64, 166);
                class42.field895.method676(0, (byte) -3);
                class205.field3816++;
                int var3 = class42.field895.field2053;
                int var4 = 0;
                for (int var5 = 0; class186.field3444.field1922 > var5 && class42.field895.field2053 - var3 < 240; var5++) {
                    var4++;
                    int var6 = class186.field3444.field1923[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 502) {
                        var6 = 502;
                    }
                    int var7 = class186.field3444.field1921[var5];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 764) {
                        var7 = 764;
                    }
                    int var8 = var6 * 765 + var7;
                    if (class186.field3444.field1923[var5] == -1 && class186.field3444.field1921[var5] == -1) {
                        var6 = -1;
                        var7 = -1;
                        var8 = 524287;
                    }
                    if (class120.field2267 != var7 || class160.field3047 != var6) {
                        int var9 = var7 - class120.field2267;
                        int var10 = var6 - class160.field3047;
                        class160.field3047 = var6;
                        class120.field2267 = var7;
                        if (class237.field4424 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var9 += 32;
                            var10 += 32;
                            class42.field895.method672(-279704376, (class237.field4424 << 12) + var10 + (var9 << 6));
                            class237.field4424 = 0;
                        } else if (class237.field4424 < 8) {
                            class42.field895.method677((byte) -115, (class237.field4424 << 19) + var8 + 8388608);
                            class237.field4424 = 0;
                        } else {
                            class42.field895.method684(var8 + (class237.field4424 << 19) - 1073741824, 75);
                            class237.field4424 = 0;
                        }
                    } else if (class237.field4424 < 2047) {
                        class237.field4424++;
                    }
                }
                class42.field895.method694(class42.field895.field2053 - var3, 32);
                if (var4 >= class186.field3444.field1922) {
                    class186.field3444.field1922 = 0;
                } else {
                    class186.field3444.field1922 -= var4;
                    for (int var11 = 0; var11 < class186.field3444.field1922; var11++) {
                        class186.field3444.field1921[var11] = class186.field3444.field1921[var11 + var4];
                        class186.field3444.field1923[var11] = class186.field3444.field1923[var4 + var11];
                    }
                }
            }
        }
        if (class222.field4168 != 0) {
            class34.field737++;
            int var12 = class153.field2938;
            long var13 = (class222.field4166 - class132.field2549) / 50L;
            if (var13 > 4095L) {
                var13 = 4095L;
            }
            if (var12 < 0) {
                var12 = 0;
            } else if (var12 > 502) {
                var12 = 502;
            }
            int var15 = class64.field1168;
            byte var16 = 0;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 764) {
                var15 = 764;
            }
            int var17 = (int) var13;
            int var18 = var12 * 765 + var15;
            class132.field2549 = class222.field4166;
            if (class222.field4168 == 2) {
                var16 = 1;
            }
            class42.field895.method1347((byte) -90, 117);
            class42.field895.method702(441048200, (var16 << 19) + ((var17 << 20) + var18));
        }
        if (class71.field1388 > 0) {
            class71.field1388--;
        }
        if (class6.field98[96] || class6.field98[97] || class6.field98[98] || class6.field98[99]) {
            class44.field922 = true;
        }
        if (class44.field922 && class71.field1388 <= 0) {
            class44.field922 = false;
            class71.field1388 = 20;
            class42.field895.method1347((byte) -96, 39);
            class42.field895.method660(0, class140.field2697);
            class42.field895.method671((byte) 109, class116.field2218);
            class196.field3570++;
        }
        if (field1116 && !client.field704) {
            class71.field1378++;
            client.field704 = true;
            class42.field895.method1347((byte) -75, 27);
            class42.field895.method676(1, (byte) -3);
        }
        if (!field1116 && client.field704) {
            client.field704 = false;
            class71.field1378++;
            class42.field895.method1347((byte) -77, 27);
            class42.field895.method676(0, (byte) -3);
        }
        class5.method50(0);
        if (class34.field749 != 30) {
            return;
        }
        class46.method338(arg0 + 26054);
        class210.method1341(-118);
        class209.field3885++;
        if (class209.field3885 > 750) {
            class167.method1079((byte) 15);
            return;
        }
        class180.method1130(-65);
        class192.method1198((byte) 124);
        class82.method535(arg0 - 1);
        class111.method717((byte) -118);
        if (class106.field1958 != 0) {
            class119.field2256 += 20;
            if (class119.field2256 >= 400) {
                class106.field1958 = 0;
            }
        }
        class121.field2305++;
        if (class204.field3796 != null) {
            class140.field2692++;
            if (class140.field2692 >= 15) {
                class80.method527(class204.field3796, 31702);
                class204.field3796 = null;
            }
        }
        if (class173.field3242 != null) {
            class80.method527(class173.field3242, 31702);
            if (class128.field2489 + 5 < class94.field1769 || class94.field1769 < class128.field2489 - 5 || class120.field2276 + 5 < class137.field2651 || class120.field2276 - 5 > class137.field2651) {
                class205.field3827 = true;
            }
            class103.field1910++;
            if (class94.field1773 == 0) {
                if (class205.field3827 && class103.field1910 >= 5) {
                    if (class173.field3242 == class114.field2178 && class165.field3142 != class159.field3036) {
                        class16.field426++;
                        class13 var19 = class173.field3242;
                        byte var20 = 0;
                        if (class67.field1265 == 1 && var19.field348 == 206) {
                            var20 = 1;
                        }
                        if (var19.field289[class165.field3142] <= 0) {
                            var20 = 0;
                        }
                        if (class221.method1406(class221.method1405(var19, (byte) -95), (byte) -107)) {
                            int var21 = class165.field3142;
                            int var22 = class159.field3036;
                            var19.field289[var21] = var19.field289[var22];
                            var19.field226[var21] = var19.field226[var22];
                            var19.field289[var22] = -1;
                            var19.field226[var22] = 0;
                        } else if (var20 == 1) {
                            int var23 = class159.field3036;
                            int var24 = class165.field3142;
                            while (var23 != var24) {
                                if (var23 > var24) {
                                    var19.method118(false, var23, var23 - 1);
                                    var23--;
                                } else if (var24 > var23) {
                                    var19.method118(false, var23, var23 + 1);
                                    var23++;
                                }
                            }
                        } else {
                            var19.method118(false, class159.field3036, class165.field3142);
                        }
                        class42.field895.method1347((byte) -126, 66);
                        class42.field895.method663(arg0 - 71, class159.field3036);
                        class42.field895.method702(441048200, class173.field3242.field269);
                        class42.field895.method672(-279704376, class165.field3142);
                        class42.field895.method665((byte) 32, var20);
                    }
                } else if ((class155.field2952 == 1 || class155.method991(class172.field3227 - 1, arg0 ^ 0x2)) && class172.field3227 > 2) {
                    class21.method205((byte) 102);
                } else if (class172.field3227 > 0) {
                    class71.method485(2, class172.field3227 - 1);
                }
                class222.field4168 = 0;
                class173.field3242 = null;
                class140.field2692 = 10;
            }
        }
        field1115 = false;
        class81.field1564 = arg0;
        class182.field3372 = null;
        class13.field276 = false;
        class13 var25 = class151.field2917;
        class13 var26 = class152.field2935;
        class151.field2917 = null;
        class152.field2935 = null;
        while (class99.method619(127) && class81.field1564 < 128) {
            class186.field3443[class81.field1564] = class215.field3992;
            class187.field3446[class81.field1564] = class21.field496;
            class81.field1564++;
        }
        class228.field4275 = null;
        if (class25.field580 != -1) {
            class179.method1122(0, 0, class70.field1315, 0, class122.field2321, class25.field580, arg0 - 1, 0);
        }
        class28.field616++;
        while (true) {
            class191 var27;
            class13 var28;
            class13 var29;
            do {
                var27 = (class191) class29.field639.method244(-4835);
                if (var27 == null) {
                    while (true) {
                        class191 var30;
                        class13 var31;
                        class13 var32;
                        do {
                            var30 = (class191) class157.field2997.method244(arg0 ^ 0xFFFFED1D);
                            if (var30 == null) {
                                while (true) {
                                    class191 var33;
                                    class13 var34;
                                    class13 var35;
                                    do {
                                        var33 = (class191) class197.field3583.method244(-4835);
                                        if (var33 == null) {
                                            if (class120.field2278 && class228.field4275 == null) {
                                                class120.field2278 = false;
                                            }
                                            if (class182.field3369 != null) {
                                                class91.method585((byte) 101);
                                            }
                                            if (class71.field1385 != -1) {
                                                int var36 = class71.field1385;
                                                int var37 = class81.field1566;
                                                boolean var38 = class62.method431(true, 0, 0, 0, 0, 0, class17.field432.field1333[0], class17.field432.field1358[0], 0, var37, var36, -103);
                                                class71.field1385 = -1;
                                                if (var38) {
                                                    class106.field1958 = 1;
                                                    class57.field1070 = class153.field2938;
                                                    class119.field2256 = 0;
                                                    class138.field2669 = class64.field1168;
                                                }
                                            }
                                            class6.method56((byte) -30);
                                            if (class152.field2935 != var26) {
                                                if (var26 != null) {
                                                    class80.method527(var26, 31702);
                                                }
                                                if (class152.field2935 != null) {
                                                    class80.method527(class152.field2935, 31702);
                                                }
                                            }
                                            if (class151.field2917 != var25 && class36.field782 == class197.field3581) {
                                                if (var25 != null) {
                                                    class80.method527(var25, 31702);
                                                }
                                                if (class151.field2917 != null) {
                                                    class80.method527(class151.field2917, arg0 ^ 0x7BD6);
                                                }
                                            }
                                            if (class151.field2917 == null) {
                                                if (class36.field782 > 0) {
                                                    class36.field782--;
                                                }
                                            } else if (class36.field782 < class197.field3581) {
                                                class36.field782++;
                                                if (class36.field782 == class197.field3581) {
                                                    class80.method527(class151.field2917, arg0 + 31702);
                                                }
                                            }
                                            class111.method722(0);
                                            if (class44.field928) {
                                                class116.method747(arg0 + 9187);
                                            }
                                            for (int var39 = 0; var39 < 5; var39++) {
                                                int var10002 = class92.field1731[var39]++;
                                            }
                                            int var40 = class222.method1425(-127);
                                            int var41 = class180.method1128((byte) -23);
                                            if (var40 > 4500 && var41 > 4500) {
                                                class28.field629 = 250;
                                                class200.field3661++;
                                                class202.method1286(false, 4000);
                                                class42.field895.method1347((byte) -111, 3);
                                            }
                                            class32.field668++;
                                            if (class32.field668 > 500) {
                                                class32.field668 = 0;
                                                int var42 = (int) (Math.random() * 8.0D);
                                                if ((var42 & 0x4) == 4) {
                                                    class84.field1598 += class59.field1098;
                                                }
                                                if ((var42 & 0x1) == 1) {
                                                    class125.field2392 += class93.field1749;
                                                }
                                                if ((var42 & 0x2) == 2) {
                                                    class31.field658 += class193.field3555;
                                                }
                                            }
                                            if (class84.field1598 < -40) {
                                                class59.field1098 = 1;
                                            }
                                            if (class125.field2392 < -50) {
                                                class93.field1749 = 2;
                                            }
                                            class129.field2516++;
                                            if (class84.field1598 > 40) {
                                                class59.field1098 = -1;
                                            }
                                            class229.field4302++;
                                            if (class229.field4302 > 500) {
                                                class229.field4302 = 0;
                                                int var43 = (int) (Math.random() * 8.0D);
                                                if ((var43 & 0x2) == 2) {
                                                    class208.field3876 += class157.field3017;
                                                }
                                                if ((var43 & 0x1) == 1) {
                                                    class34.field740 += class200.field3650;
                                                }
                                            }
                                            if (class31.field658 < -55) {
                                                class193.field3555 = 2;
                                            }
                                            if (class34.field740 < -60) {
                                                class200.field3650 = 2;
                                            }
                                            if (class31.field658 > 55) {
                                                class193.field3555 = -2;
                                            }
                                            if (class34.field740 > 60) {
                                                class200.field3650 = -2;
                                            }
                                            if (class208.field3876 < -20) {
                                                class157.field3017 = 1;
                                            }
                                            if (class208.field3876 > 10) {
                                                class157.field3017 = -1;
                                            }
                                            if (class125.field2392 > 50) {
                                                class93.field1749 = -2;
                                            }
                                            if (class129.field2516 > 50) {
                                                class27.field604++;
                                                class42.field895.method1347((byte) -55, 207);
                                            }
                                            try {
                                                if (class31.field656 != null && class42.field895.field2053 > 0) {
                                                    class31.field656.method785(0, 0, class42.field895.field2006, class42.field895.field2053);
                                                    class129.field2516 = 0;
                                                    class42.field895.field2053 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var44) {
                                                class167.method1079((byte) 22);
                                                return;
                                            }
                                        }
                                        var34 = var33.field3521;
                                        if (var34.field264 < 0) {
                                            break;
                                        }
                                        var35 = class10.method92(923, var34.field238);
                                    } while (var35 == null || var35.field307 == null || var34.field264 >= var35.field307.length || var35.field307[var34.field264] != var34);
                                    class52.method373(-32560, var33);
                                }
                            }
                            var31 = var30.field3521;
                            if (var31.field264 < 0) {
                                break;
                            }
                            var32 = class10.method92(923, var31.field238);
                        } while (var32 == null || var32.field307 == null || var32.field307.length <= var31.field264 || var32.field307[var31.field264] != var31);
                        class52.method373(-32560, var30);
                    }
                }
                var28 = var27.field3521;
                if (var28.field264 < 0) {
                    break;
                }
                var29 = class10.method92(923, var28.field238);
            } while (var29 == null || var29.field307 == null || var29.field307.length <= var28.field264 || var29.field307[var28.field264] != var28);
            class52.method373(-32560, var27);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ZIIIII[Lba;II)V")
    public static final void method427(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class13[] arg6, int arg7, int arg8) {
        field1120++;
        if (arg0) {
            method426(93);
        }
        for (int var9 = 0; var9 < arg6.length; var9++) {
            class13 var10 = arg6[var9];
            if (var10 != null && (!var10.field323 || var10.field365 == 0 || var10.field249 || class221.method1405(var10, (byte) -95) != 0 || class57.field1074 == var10 || var10.field348 == 1338) && var10.field238 == arg3 && (!var10.field323 || !class155.method992(0, var10))) {
                int var11 = var10.field295 + arg7;
                int var12 = var10.field236 + arg4;
                if (class182.field3369 == var10) {
                    class165.field3137 = var12;
                    class108.field1998 = var11;
                    class13.field276 = true;
                }
                int var14;
                int var16;
                int var17;
                int var18;
                if (var10.field365 == 2) {
                    var18 = arg8;
                    var16 = arg2;
                    var14 = arg1;
                    var17 = arg5;
                } else {
                    int var13 = var10.field341 + var12;
                    var14 = arg1 < var11 ? var11 : arg1;
                    int var15 = var10.field245 + var11;
                    var16 = var12 > arg2 ? var12 : arg2;
                    if (var10.field365 == 9) {
                        var13++;
                        var15++;
                    }
                    var17 = var13 >= arg5 ? arg5 : var13;
                    var18 = var15 < arg8 ? var15 : arg8;
                }
                if (!var10.field323 || var17 > var16 && var14 < var18) {
                    if (var10.field348 == 1337) {
                        class80.method527(var10, 31702);
                    } else {
                        if (var10.field348 == 1400) {
                            class228.field4275 = var10;
                        }
                        if (var10.field365 == 0) {
                            if (var10.field348 == 1400) {
                                class174.field3275 = false;
                            }
                            if (!var10.field323 && class155.method992(0, var10) && class152.field2935 != var10) {
                                continue;
                            }
                            method427(false, var14, var16, var10.field269, var12 - var10.field316, var17, arg6, var11 - var10.field314, var18);
                            if (var10.field307 != null) {
                                method427(arg0, var14, var16, var10.field269, var12 - var10.field316, var17, var10.field307, var11 - var10.field314, var18);
                            }
                            class21 var19 = (class21) class208.field3863.method1520((long) var10.field269, 75);
                            if (var19 != null) {
                                class179.method1122(var16, var12, var17, var11, var18, var19.field493, -1, var14);
                            }
                            if (var10.field348 == 1400 && class174.field3275) {
                                return;
                            }
                        }
                        if (var10.field323) {
                            boolean var20;
                            if (var16 <= class94.field1769 && class137.field2651 >= var14 && class94.field1769 < var17 && var18 > class137.field2651) {
                                var20 = true;
                            } else {
                                var20 = false;
                            }
                            if (var20) {
                                class174.field3275 = true;
                            }
                            boolean var21 = false;
                            if (class222.field4168 == 1 && var16 <= class64.field1168 && var14 <= class153.field2938 && var17 > class64.field1168 && var18 > class153.field2938) {
                                var21 = true;
                            }
                            boolean var22 = false;
                            if (class94.field1773 == 1 && var20) {
                                var22 = true;
                            }
                            if (var10.field348 == 1338) {
                                if (var21) {
                                    class211.method1346(var10, class153.field2938 - var11, class64.field1168 - var12, 20239);
                                }
                                continue;
                            }
                            if (var10.field348 == 1400) {
                                if (var21) {
                                    if (class6.field98[82] && class5.field87 > 0) {
                                        int var23 = (int) ((double) (class64.field1168 - var10.field341 / 2 - var12) * 2.0D / class229.field4313) + class167.field3184 + class175.field3287;
                                        int var24 = class38.field852 + class59.field1107 - class122.field2334 - (int) ((double) (-var11 + class153.field2938 - var10.field245 / 2) * 2.0D / class229.field4313);
                                        class222 var25 = class234.method1531(new class222[] { class161.field3061, class56.method414(-107, var23 >> 6), class237.field4415, class56.method414(-118, var24 >> 6), class237.field4415, class56.method414(-105, var23 & 0x3F), class237.field4415, class56.method414(-126, var24 & 0x3F) }, -10949);
                                        var25.method1422(-6720);
                                        class39.method314(false, var25);
                                        class92.method590((byte) -77);
                                    } else {
                                        class130.field2528 = class94.field1769;
                                        class120.field2278 = true;
                                        class186.field3438 = class137.field2651;
                                        class64.field1167 = class122.field2334;
                                        class25.field576 = class175.field3287;
                                    }
                                    continue;
                                }
                                if (var22 && class120.field2278) {
                                    class122.method778(22171, class25.field576 + (int) ((double) (class130.field2528 - class94.field1769) * 2.0D / class104.field1929));
                                    class77.method514((int) ((double) (class186.field3438 - class137.field2651) * 2.0D / class104.field1929) + class64.field1167, (byte) -76);
                                    continue;
                                }
                                class120.field2278 = false;
                            }
                            if (var10.field348 == 1401 && var22) {
                                class226.method1475(class137.field2651 - var11, -var12 + class94.field1769, (byte) -128, var10.field341, var10.field245);
                            }
                            if (var21) {
                                class180.method1129(var10, class153.field2938 - var11, -var12 + class64.field1168, 0);
                            }
                            if (class182.field3369 != null && class182.field3369 != var10 && var20 && class73.method498(class221.method1405(var10, (byte) -118), -1)) {
                                class182.field3372 = var10;
                            }
                            if (class57.field1074 == var10) {
                                class66.field1249 = var12;
                                field1115 = true;
                                class39.field867 = var11;
                            }
                            if (var10.field249) {
                                if (var20 && class225.field4209 != 0 && var10.field267 != null) {
                                    class191 var26 = new class191();
                                    var26.field3521 = var10;
                                    var26.field3517 = class225.field4209;
                                    var26.field3510 = var10.field267;
                                    class197.field3583.method235(var26, !arg0);
                                }
                                if (class182.field3369 != null || class173.field3242 != null || class38.field834 || class120.field2278) {
                                    var22 = false;
                                    var21 = false;
                                    var20 = false;
                                }
                                if (!var10.field301 && var21) {
                                    var10.field301 = true;
                                    if (var10.field255 != null) {
                                        class191 var27 = new class191();
                                        var27.field3521 = var10;
                                        var27.field3517 = class153.field2938 - var11;
                                        var27.field3526 = class64.field1168 - var12;
                                        var27.field3510 = var10.field255;
                                        class197.field3583.method235(var27, true);
                                    }
                                }
                                if (var10.field301 && var22 && var10.field339 != null) {
                                    class191 var28 = new class191();
                                    var28.field3526 = class94.field1769 - var12;
                                    var28.field3517 = class137.field2651 - var11;
                                    var28.field3521 = var10;
                                    var28.field3510 = var10.field339;
                                    class197.field3583.method235(var28, true);
                                }
                                if (var10.field301 && !var22) {
                                    var10.field301 = false;
                                    if (var10.field345 != null) {
                                        class191 var29 = new class191();
                                        var29.field3517 = class137.field2651 - var11;
                                        var29.field3521 = var10;
                                        var29.field3526 = class94.field1769 - var12;
                                        var29.field3510 = var10.field345;
                                        class157.field2997.method235(var29, true);
                                    }
                                }
                                if (var22 && var10.field247 != null) {
                                    class191 var30 = new class191();
                                    var30.field3517 = class137.field2651 - var11;
                                    var30.field3521 = var10;
                                    var30.field3526 = class94.field1769 - var12;
                                    var30.field3510 = var10.field247;
                                    class197.field3583.method235(var30, !arg0);
                                }
                                if (!var10.field261 && var20) {
                                    var10.field261 = true;
                                    if (var10.field274 != null) {
                                        class191 var31 = new class191();
                                        var31.field3526 = class94.field1769 - var12;
                                        var31.field3517 = class137.field2651 - var11;
                                        var31.field3521 = var10;
                                        var31.field3510 = var10.field274;
                                        class197.field3583.method235(var31, true);
                                    }
                                }
                                if (var10.field261 && var20 && var10.field320 != null) {
                                    class191 var32 = new class191();
                                    var32.field3517 = class137.field2651 - var11;
                                    var32.field3510 = var10.field320;
                                    var32.field3526 = class94.field1769 - var12;
                                    var32.field3521 = var10;
                                    class197.field3583.method235(var32, !arg0);
                                }
                                if (var10.field261 && !var20) {
                                    var10.field261 = false;
                                    if (var10.field265 != null) {
                                        class191 var33 = new class191();
                                        var33.field3526 = class94.field1769 - var12;
                                        var33.field3517 = class137.field2651 - var11;
                                        var33.field3510 = var10.field265;
                                        var33.field3521 = var10;
                                        class157.field2997.method235(var33, true);
                                    }
                                }
                                if (var10.field233 != null) {
                                    class191 var34 = new class191();
                                    var34.field3510 = var10.field233;
                                    var34.field3521 = var10;
                                    class29.field639.method235(var34, true);
                                }
                                if (var10.field298 != null && var10.field250 < class183.field3395) {
                                    if (var10.field227 == null || class183.field3395 - var10.field250 > 32) {
                                        class191 var39 = new class191();
                                        var39.field3521 = var10;
                                        var39.field3510 = var10.field298;
                                        class197.field3583.method235(var39, true);
                                    } else {
                                        label442: for (int var35 = var10.field250; var35 < class183.field3395; var35++) {
                                            int var36 = class111.field2077[var35 & 0x1F];
                                            for (int var37 = 0; var37 < var10.field227.length; var37++) {
                                                if (var10.field227[var37] == var36) {
                                                    class191 var38 = new class191();
                                                    var38.field3510 = var10.field298;
                                                    var38.field3521 = var10;
                                                    class197.field3583.method235(var38, true);
                                                    break label442;
                                                }
                                            }
                                        }
                                    }
                                    var10.field250 = class183.field3395;
                                }
                                if (var10.field349 != null && class229.field4318 > var10.field322) {
                                    if (var10.field231 == null || class229.field4318 - var10.field322 > 32) {
                                        class191 var44 = new class191();
                                        var44.field3510 = var10.field349;
                                        var44.field3521 = var10;
                                        class197.field3583.method235(var44, true);
                                    } else {
                                        label418: for (int var40 = var10.field322; var40 < class229.field4318; var40++) {
                                            int var41 = class128.field2467[var40 & 0x1F];
                                            for (int var42 = 0; var42 < var10.field231.length; var42++) {
                                                if (var10.field231[var42] == var41) {
                                                    class191 var43 = new class191();
                                                    var43.field3510 = var10.field349;
                                                    var43.field3521 = var10;
                                                    class197.field3583.method235(var43, !arg0);
                                                    break label418;
                                                }
                                            }
                                        }
                                    }
                                    var10.field322 = class229.field4318;
                                }
                                if (var10.field306 != null && var10.field309 < class121.field2317) {
                                    if (var10.field370 == null || class121.field2317 - var10.field309 > 32) {
                                        class191 var49 = new class191();
                                        var49.field3521 = var10;
                                        var49.field3510 = var10.field306;
                                        class197.field3583.method235(var49, !arg0);
                                    } else {
                                        label394: for (int var45 = var10.field309; var45 < class121.field2317; var45++) {
                                            int var46 = class38.field838[var45 & 0x1F];
                                            for (int var47 = 0; var47 < var10.field370.length; var47++) {
                                                if (var10.field370[var47] == var46) {
                                                    class191 var48 = new class191();
                                                    var48.field3521 = var10;
                                                    var48.field3510 = var10.field306;
                                                    class197.field3583.method235(var48, true);
                                                    break label394;
                                                }
                                            }
                                        }
                                    }
                                    var10.field309 = class121.field2317;
                                }
                                if (class69.field1299 > var10.field246 && var10.field362 != null) {
                                    class191 var50 = new class191();
                                    var50.field3521 = var10;
                                    var50.field3510 = var10.field362;
                                    class197.field3583.method235(var50, true);
                                }
                                if (var10.field246 < class68.field1283 && var10.field329 != null) {
                                    class191 var51 = new class191();
                                    var51.field3510 = var10.field329;
                                    var51.field3521 = var10;
                                    class197.field3583.method235(var51, true);
                                }
                                if (class50.field977 > var10.field246 && var10.field343 != null) {
                                    class191 var52 = new class191();
                                    var52.field3510 = var10.field343;
                                    var52.field3521 = var10;
                                    class197.field3583.method235(var52, !arg0);
                                }
                                if (class79.field1523 > var10.field246 && var10.field252 != null) {
                                    class191 var53 = new class191();
                                    var53.field3521 = var10;
                                    var53.field3510 = var10.field252;
                                    class197.field3583.method235(var53, !arg0);
                                }
                                if (var10.field246 < class52.field1003 && var10.field263 != null) {
                                    class191 var54 = new class191();
                                    var54.field3510 = var10.field263;
                                    var54.field3521 = var10;
                                    class197.field3583.method235(var54, true);
                                }
                                var10.field246 = class28.field616;
                                if (var10.field260 != null) {
                                    for (int var55 = 0; var55 < class81.field1564; var55++) {
                                        class191 var56 = new class191();
                                        var56.field3521 = var10;
                                        var56.field3520 = class186.field3443[var55];
                                        var56.field3523 = class187.field3446[var55];
                                        var56.field3510 = var10.field260;
                                        class197.field3583.method235(var56, true);
                                    }
                                }
                            }
                        }
                        if (!var10.field323) {
                            if (class182.field3369 != null || class173.field3242 != null || class38.field834) {
                                return;
                            }
                            if ((var10.field350 >= 0 || var10.field364 != 0) && var16 <= class94.field1769 && var14 <= class137.field2651 && var17 > class94.field1769 && var18 > class137.field2651) {
                                if (var10.field350 < 0) {
                                    class152.field2935 = var10;
                                } else {
                                    class152.field2935 = arg6[var10.field350];
                                }
                            }
                            if (var10.field365 == 8 && var16 <= class94.field1769 && var14 <= class137.field2651 && class94.field1769 < var17 && var18 > class137.field2651) {
                                class151.field2917 = var10;
                            }
                            if (var10.field354 > var10.field245) {
                                class8.method73(var10.field354, var12 + var10.field341, var10.field245, -32, class94.field1769, var10, var11, class137.field2651);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)V")
    public static final void method428(int arg0) {
        class57.field1076 = arg0;
        for (int var1 = 0; var1 < class126.field2409; var1++) {
            for (int var2 = 0; var2 < class181.field3357; var2++) {
                if (class204.field3800[arg0][var1][var2] == null) {
                    class204.field3800[arg0][var1][var2] = new class121(arg0, var1, var2);
                }
            }
        }
    }
}
