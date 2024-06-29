import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class225 {

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "I")
    public static int field3171;

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "[I")
    public static int[] field3169;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1453(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class222.field3142 = 0;
        field3167++;
        if (arg6 > -48) {
            field3169 = null;
        }
        for (int var7 = -1; var7 < class294.field4642 + class238.field3432; var7++) {
            class290 var23;
            if (var7 == -1) {
                var23 = class177.field2507;
            } else if (class238.field3432 > var7) {
                var23 = class253.field3656[class46.field540[var7]];
            } else {
                var23 = class20.field244[class14.field176[var7 - class238.field3432]];
            }
            if (var23 != null && var23.method325(115)) {
                if (var23 instanceof class54) {
                    class267 var24 = ((class54) var23).field636;
                    if (var24.field3884 != null) {
                        var24 = var24.method1707(-1);
                    }
                    if (var24 == null) {
                        continue;
                    }
                }
                if (class238.field3432 <= var7) {
                    class267 var25 = ((class54) var23).field636;
                    if (var25.field3884 != null) {
                        var25 = var25.method1707(-1);
                    }
                    if (var25.field3853 >= 0 && var25.field3853 < class130.field1884.length) {
                        int var26;
                        if (var25.field3912 == -1) {
                            var26 = var23.method1944(-104) + 15;
                        } else {
                            var26 = var25.field3912 + 15;
                        }
                        class253.method1623(arg5, arg4 >> 1, arg3 >> 1, false, var26, var23, arg2);
                        if (class118.field1678 > -1) {
                            class130.field1884[var25.field3853].method848(class118.field1678 + arg1 - 12, arg0 - -class292.field4622 - 30);
                        }
                    }
                    class287[] var27 = class243.field3528;
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        class287 var29 = var27[var28];
                        if (var29 != null && var29.field4470 == 1 && class14.field176[var7 - class238.field3432] == var29.field4459 && class198.field2819 % 20 < 10) {
                            int var30;
                            if (var25.field3912 == -1) {
                                var30 = var23.method1944(-98) + 15;
                            } else {
                                var30 = var25.field3912 + 15;
                            }
                            class253.method1623(arg5, arg4 >> 1, arg3 >> 1, false, var30, var23, arg2);
                            if (class118.field1678 > -1) {
                                class108.field1463[var29.field4466].method848(arg1 - (12 - class118.field1678), class292.field4622 - 28 + arg0);
                            }
                        }
                    }
                } else {
                    class240 var31 = (class240) var23;
                    int var32 = 30;
                    if (var31.field3469 != -1 || var31.field3492 != -1) {
                        class253.method1623(arg5, arg4 >> 1, arg3 >> 1, false, var23.method1944(-99) + 15, var23, arg2);
                        if (class118.field1678 > -1) {
                            if (var31.field3469 != -1) {
                                class248.field3606[var31.field3469].method848(class118.field1678 + arg1 - 12, arg0 - (-class292.field4622 - -var32));
                                var32 += 25;
                            }
                            if (var31.field3492 != -1) {
                                class130.field1884[var31.field3492].method848(class118.field1678 + arg1 - 12, -var32 + arg0 + class292.field4622);
                                var32 += 25;
                            }
                        }
                    }
                    if (var7 >= 0) {
                        class287[] var33 = class243.field3528;
                        for (int var34 = 0; var34 < var33.length; var34++) {
                            class287 var35 = var33[var34];
                            if (var35 != null && var35.field4470 == 10 && class46.field540[var7] == var35.field4459) {
                                class253.method1623(arg5, arg4 >> 1, arg3 >> 1, false, var23.method1944(-106) + 15, var23, arg2);
                                if (class118.field1678 > -1) {
                                    class108.field1463[var35.field4466].method848(arg1 + class118.field1678 - 12, arg0 - (-class292.field4622 + var32));
                                }
                            }
                        }
                    }
                }
                if (var23.field4596 != null && (var7 >= class238.field3432 || class189.field2721 == 0 || class189.field2721 == 3 || class189.field2721 == 1 && class203.method1306(96, ((class240) var23).field3466))) {
                    class253.method1623(arg5, arg4 >> 1, arg3 >> 1, false, var23.method1944(-108), var23, arg2);
                    if (class118.field1678 > -1 && class9.field113 > class222.field3142) {
                        class9.field112[class222.field3142] = class248.field3614.method539(var23.field4596) / 2;
                        class9.field119[class222.field3142] = class248.field3614.field1221;
                        class9.field121[class222.field3142] = class118.field1678;
                        class9.field116[class222.field3142] = class292.field4622;
                        class9.field128[class222.field3142] = var23.field4517;
                        class9.field120[class222.field3142] = var23.field4514;
                        class9.field130[class222.field3142] = var23.field4525;
                        class9.field122[class222.field3142] = var23.field4596;
                        class222.field3142++;
                    }
                }
                if (class198.field2819 < var23.field4594) {
                    class130 var36 = class42.field517[0];
                    class130 var37 = class42.field517[1];
                    int var38;
                    if ((var23 instanceof class54)) {
                        class54 var39 = (class54) var23;
                        class130[] var40 = (class130[]) class227.field3200.method65((byte) -90, (long) var39.field636.field3893);
                        if (var40 == null) {
                            var40 = class212.method1339(57, class120.field1705, var39.field636.field3893, 0);
                            if (var40 != null) {
                                class227.field3200.method64((long) var39.field636.field3893, -1, var40);
                            }
                        }
                        if (var40 != null && var40.length == 2) {
                            var37 = var40[1];
                            var36 = var40[0];
                        }
                        class267 var41 = var39.field636;
                        if (var41.field3912 == -1) {
                            var38 = var23.method1944(-113);
                        } else {
                            var38 = var41.field3912;
                        }
                    } else {
                        var38 = var23.method1944(-100);
                    }
                    class253.method1623(arg5, arg4 >> 1, arg3 >> 1, false, var36.field1879 + var38 + 10, var23, arg2);
                    if (class118.field1678 > -1) {
                        int var42 = arg0 + class292.field4622 - 3;
                        int var43 = class118.field1678 + arg1 - (var36.field1882 >> 1);
                        var36.method848(var43, var42);
                        int var44 = var36.field1879;
                        int var45 = var23.field4530 * var36.field1882 / 255;
                        class155.method1019(var43, var42, var43 + var45, var42 + var44);
                        var37.method848(var43, var42);
                        class155.method1022(arg1, arg0, arg1 + arg3, arg0 - -arg4);
                    }
                }
                for (int var46 = 0; var46 < 4; var46++) {
                    if (class198.field2819 < var23.field4548[var46]) {
                        int var49;
                        if (var23 instanceof class54) {
                            class54 var47 = (class54) var23;
                            class267 var48 = var47.field636;
                            if (var48.field3912 == -1) {
                                var49 = var23.method1944(-104) / 2;
                            } else {
                                var49 = var48.field3912 / 2;
                            }
                        } else {
                            var49 = var23.method1944(-114) / 2;
                        }
                        class253.method1623(arg5, arg4 >> 1, arg3 >> 1, false, var49, var23, arg2);
                        if (class118.field1678 > -1) {
                            if (var46 == 1) {
                                class292.field4622 -= 20;
                            }
                            if (var46 == 2) {
                                class292.field4622 -= 10;
                                class118.field1678 -= 15;
                            }
                            if (var46 == 3) {
                                class118.field1678 += 15;
                                class292.field4622 -= 10;
                            }
                            class60.field707[var23.field4508[var46]].method848(arg1 + class118.field1678 - 12, arg0 - (-class292.field4622 + 12));
                            class11.field141.method528(Integer.toString(var23.field4538[var46]), arg1 + class118.field1678 - 1, arg0 - (-class292.field4622 - 3), 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var8 = 0; var8 < class222.field3142; var8++) {
            int var9 = class9.field121[var8];
            int var10 = class9.field116[var8];
            int var11 = class9.field112[var8];
            int var12 = class9.field119[var8];
            boolean var13 = true;
            while (var13) {
                var13 = false;
                for (int var22 = 0; var22 < var8; var22++) {
                    if ((class9.field116[var22] - class9.field119[var22]) < (var10 + 2) && class9.field116[var22] + 2 > -var12 + var10 && var9 - var11 < class9.field121[var22] + class9.field112[var22] && class9.field121[var22] - class9.field112[var22] < var9 - -var11 && var10 > (class9.field116[var22] - class9.field119[var22])) {
                        var13 = true;
                        var10 = class9.field116[var22] - class9.field119[var22];
                    }
                }
            }
            class118.field1678 = class9.field121[var8];
            class292.field4622 = class9.field116[var8] = var10;
            String var14 = class9.field122[var8];
            if (class6.field78 == 0) {
                int var15 = 16776960;
                if (class9.field128[var8] < 6) {
                    var15 = class44.field528[class9.field128[var8]];
                }
                if (class9.field128[var8] == 6) {
                    var15 = (class241.field3505 % 20) < 10 ? 16711680 : 16776960;
                }
                if (class9.field128[var8] == 7) {
                    var15 = (class241.field3505 % 20) < 10 ? 255 : 65535;
                }
                if (class9.field128[var8] == 8) {
                    var15 = (class241.field3505 % 20) < 10 ? 45056 : 8454016;
                }
                if (class9.field128[var8] == 9) {
                    int var16 = 150 - class9.field130[var8];
                    if (var16 < 50) {
                        var15 = (var16 * 1280) + 16711680;
                    } else if (var16 < 100) {
                        var15 = 16384000 + 16776960 - (var16 * 327680);
                    } else if (var16 < 150) {
                        var15 = (var16 * 5) + 64780;
                    }
                }
                if (class9.field128[var8] == 10) {
                    int var17 = 150 - class9.field130[var8];
                    if (var17 < 50) {
                        var15 = var17 * 5 + 16711680;
                    } else if (var17 < 100) {
                        var15 = 16711935 - ((var17 - 50) * 327680);
                    } else if (var17 < 150) {
                        var15 = (var17 * 327680) + 255 + 500 - (var17 * 5) - 32768000;
                    }
                }
                if (class9.field128[var8] == 11) {
                    int var18 = 150 - class9.field130[var8];
                    if (var18 < 50) {
                        var15 = 16777215 - (var18 * 327685);
                    } else if (var18 < 100) {
                        var15 = var18 * 327685 - 16318970;
                    } else if (var18 < 150) {
                        var15 = 16777215 - ((var18 - 100) * 327680);
                    }
                }
                if (class9.field120[var8] == 0) {
                    class248.field3614.method528(var14, class118.field1678 + arg1, class292.field4622 + arg0, var15, 0);
                }
                if (class9.field120[var8] == 1) {
                    class248.field3614.method521(var14, class118.field1678 + arg1, class292.field4622 + arg0, var15, 0, class241.field3505);
                }
                if (class9.field120[var8] == 2) {
                    class248.field3614.method534(var14, class118.field1678 + arg1, class292.field4622 + arg0, var15, 0, class241.field3505);
                }
                if (class9.field120[var8] == 3) {
                    class248.field3614.method524(var14, class118.field1678 + arg1, class292.field4622 + arg0, var15, 0, class241.field3505, 150 - class9.field130[var8]);
                }
                if (class9.field120[var8] == 4) {
                    int var19 = (150 - class9.field130[var8]) * (class248.field3614.method539(var14) + 100) / 150;
                    class155.method1019(class118.field1678 + arg1 - 50, arg0, class118.field1678 + arg1 + 50, arg0 + arg4);
                    class248.field3614.method537(var14, class118.field1678 + arg1 + 50 - var19, arg0 - -class292.field4622, var15, 0);
                    class155.method1022(arg1, arg0, arg1 + arg3, arg0 + arg4);
                }
                if (class9.field120[var8] == 5) {
                    int var20 = 150 - class9.field130[var8];
                    class155.method1019(arg1, class292.field4622 + arg0 - class248.field3614.field1221 - 1, arg1 - -arg3, arg0 + class292.field4622 + 5);
                    int var21 = 0;
                    if (var20 < 25) {
                        var21 = var20 - 25;
                    } else if (var20 > 125) {
                        var21 = var20 - 125;
                    }
                    class248.field3614.method528(var14, arg1 + class118.field1678, class292.field4622 + arg0 + var21, var15, 0);
                    class155.method1022(arg1, arg0, arg1 + arg3, arg0 + arg4);
                }
            } else {
                class248.field3614.method528(var14, arg1 + class118.field1678, class292.field4622 + arg0, 16776960, 0);
            }
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)V")
    public static void method1454(byte arg0) {
        int var1 = -11 / ((-arg0 - 21) / 63);
        field3169 = null;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)V")
    public static final void method1455(String arg0, int arg1, String arg2, int arg3) {
        int var4 = 24 / ((-arg1 - 76) / 40);
        class21.method125(arg0, arg2, arg3, (String) null, (byte) -86, -1);
        field3168++;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lbc;ZLbc;IB)Lfd;")
    public static final class58 method1456(class282 arg0, boolean arg1, class282 arg2, int arg3, byte arg4) {
        if (arg4 != -122) {
            method1457(-95, false);
        }
        field3171++;
        int[] var5 = arg2.method1851(1, arg3);
        boolean var6 = true;
        for (int var7 = 0; var7 < var5.length; var7++) {
            byte[] var8 = arg2.method1855(var5[var7], arg3, true);
            if (var8 == null) {
                var6 = false;
            } else {
                int var9 = (var8[0] & 0xFF) << 8 | var8[1] & 0xFF;
                byte[] var10;
                if (arg1) {
                    var10 = arg0.method1855(var9, 0, true);
                } else {
                    var10 = arg0.method1855(0, var9, true);
                }
                if (var10 == null) {
                    var6 = false;
                }
            }
        }
        if (!var6) {
            return null;
        }
        try {
            return new class58(arg2, arg0, arg3, arg1);
        } catch (Exception var11) {
            return null;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IZ)V")
    public static final void method1457(int arg0, boolean arg1) {
        class294.field4647 = -1;
        field3170++;
        if (!arg1) {
            field3169 = null;
        }
        class261.field3800 = arg0;
        class274.field4103 = -1;
        class199.method1281(-1);
    }
}
