import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class200 {

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "Lda;")
    public static class275 field3419 = class255.method1672(126, "Versteckt");

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "Lfd;")
    public static class229 field3421 = null;

    @OriginalMember(owner = "client!lj", name = "l", descriptor = "Lda;")
    public static class275 field3426 = class255.method1672(115, "(Y<)4col>");

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "Lda;")
    public static class275 field3420 = class255.method1672(118, "Bitte entfernen Sie ");

    @OriginalMember(owner = "client!lj", name = "j", descriptor = "Lda;")
    public static class275 field3424 = class255.method1672(95, "titlebg");

    @OriginalMember(owner = "client!lj", name = "m", descriptor = "I")
    public static int field3427 = 0;

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "[Z")
    public static boolean[] field3418 = new boolean[100];

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "I")
    public static int field3422 = 0;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "I")
    public static int field3415;

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!lj", name = "k", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!lj", name = "n", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!lj", name = "o", descriptor = "I")
    public static int field3429;

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "Llb;")
    public static class274 field3417;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lda;IZ)V")
    public static final void method1307(class275 arg0, int arg1, boolean arg2) {
        if (arg1 != 50) {
            field3421 = null;
        }
        field3416++;
        if (arg2) {
            try {
                class92.field1560.getAppletContext().showDocument(arg0.method1836(class92.field1560.getCodeBase(), arg1 + 31), "_blank");
            } catch (Exception var4) {
            }
        } else {
            try {
                class92.field1560.getAppletContext().showDocument(arg0.method1836(class92.field1560.getCodeBase(), 126), "_top");
            } catch (Exception var3) {
            }
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V")
    public static void method1308(int arg0) {
        field3418 = null;
        field3419 = null;
        field3420 = null;
        field3421 = null;
        int var1 = 10 / ((7 - arg0) / 51);
        field3424 = null;
        field3426 = null;
        field3417 = null;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(B)V")
    public static final void method1309(byte arg0) {
        field3429++;
        try {
            if (class83.field1347 == 1) {
                int var1 = class6.field92.method1547(113);
                if (var1 > 0 && class6.field92.method1566((byte) 93)) {
                    int var2 = var1 - class224.field3787;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class6.field92.method1543(true, var2);
                    return;
                }
                class6.field92.method1567(-32717);
                class6.field92.method1546(-9468);
                class170.field2961 = null;
                class156.field2743 = null;
                if (class96.field1636 == null) {
                    class83.field1347 = 0;
                } else {
                    class83.field1347 = 2;
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class6.field92.method1567(-32717);
            class156.field2743 = null;
            class83.field1347 = 0;
            class96.field1636 = null;
            class170.field2961 = null;
        }
        if (arg0 > -98) {
            field3422 = -112;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(III)Ltf;")
    public static final class119 method1310(int arg0, int arg1, int arg2) {
        class3 var3 = class235.field4101[arg0][arg1][arg2];
        return var3 == null ? null : var3.field41;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1311(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3425++;
        class153.field2689 = 0;
        for (int var7 = -1; var7 < (class32.field486 + class181.field3118); var7++) {
            class104 var23;
            if (var7 == -1) {
                var23 = class66.field1094;
            } else if (class32.field486 > var7) {
                var23 = class16.field238[class149.field2595[var7]];
            } else {
                var23 = class31.field478[class228.field3851[var7 - class32.field486]];
            }
            if (var23 != null && var23.method747(1529241680)) {
                if (var23 instanceof class165) {
                    class23 var24 = ((class165) var23).field2873;
                    if (var24.field406 != null) {
                        var24 = var24.method140(1);
                    }
                    if (var24 == null) {
                        continue;
                    }
                }
                if (class32.field486 <= var7) {
                    class23 var30 = ((class165) var23).field2873;
                    if (var30.field406 != null) {
                        var30 = var30.method140(1);
                    }
                    if (var30.field403 >= 0 && var30.field403 < class238.field4156.length) {
                        int var31;
                        if (var30.field367 == -1) {
                            var31 = var23.method753(-20812) + 15;
                        } else {
                            var31 = var30.field367 + 15;
                        }
                        class147.method1043(arg5 >> 1, var31, arg4, arg0, arg1 >> 1, (byte) 96, var23);
                        if (class41.field687 > -1) {
                            class238.field4156[var30.field403].method728(class41.field687 + arg6 - 12, class84.field1370 + -30 + arg3);
                        }
                    }
                    class9[] var32 = class114.field2014;
                    for (int var33 = 0; var33 < var32.length; var33++) {
                        class9 var48 = var32[var33];
                        if (var48 != null && var48.field135 == 1 && class228.field3851[var7 - class32.field486] == var48.field140 && (class35.field576 % 20) < 10) {
                            int var49;
                            if (var30.field367 == -1) {
                                var49 = var23.method753(-20812) + 15;
                            } else {
                                var49 = var30.field367 + 15;
                            }
                            class147.method1043(arg5 >> 1, var49, arg4, arg0, arg1 >> 1, (byte) 91, var23);
                            if (class41.field687 > -1) {
                                class165.field2872[var48.field138].method728(class41.field687 + arg6 - 12, class84.field1370 + arg3 - 28);
                            }
                        }
                    }
                } else {
                    int var25 = 30;
                    class109 var26 = (class109) var23;
                    if (var26.field1935 != -1 || var26.field1932 != -1) {
                        class147.method1043(arg5 >> 1, var23.method753(-20812) + 15, arg4, arg0, arg1 >> 1, (byte) -123, var23);
                        if (class41.field687 > -1) {
                            if (var26.field1935 != -1) {
                                class235.field4103[var26.field1935].method728(class41.field687 + arg6 - 12, class84.field1370 + arg3 + -var25);
                                var25 += 25;
                            }
                            if (var26.field1932 != -1) {
                                class238.field4156[var26.field1932].method728(arg6 + class41.field687 - 12, class84.field1370 + arg3 - var25);
                                var25 += 25;
                            }
                        }
                    }
                    if (var7 >= 0) {
                        class9[] var27 = class114.field2014;
                        for (int var28 = 0; var28 < var27.length; var28++) {
                            class9 var29 = var27[var28];
                            if (var29 != null && var29.field135 == 10 && class149.field2595[var7] == var29.field140) {
                                class147.method1043(arg5 >> 1, var23.method753(-20812) + 15, arg4, arg0, arg1 >> 1, (byte) -55, var23);
                                if (class41.field687 > -1) {
                                    class165.field2872[var29.field138].method728(arg6 + class41.field687 - 12, -var25 + arg3 + class84.field1370);
                                }
                            }
                        }
                    }
                }
                if (var23.field1782 != null && (class32.field486 <= var7 || class95.field1627 == 0 || class95.field1627 == 3 || class95.field1627 == 1 && class72.method468(((class109) var23).field1910, (byte) -90))) {
                    class147.method1043(arg5 >> 1, var23.method753(-20812), arg4, arg0, arg1 >> 1, (byte) 80, var23);
                    if (class41.field687 > -1 && class92.field1582 > class153.field2689) {
                        class92.field1581[class153.field2689] = class93.field1599.method113(var23.field1782) / 2;
                        class92.field1578[class153.field2689] = class93.field1599.field315;
                        class92.field1574[class153.field2689] = class41.field687;
                        class92.field1583[class153.field2689] = class84.field1370;
                        class92.field1579[class153.field2689] = var23.field1734;
                        class92.field1577[class153.field2689] = var23.field1765;
                        class92.field1576[class153.field2689] = var23.field1783;
                        class92.field1580[class153.field2689] = var23.field1782;
                        class153.field2689++;
                    }
                }
                if (class35.field576 < var23.field1754) {
                    class179 var34 = class35.field585[1];
                    class179 var35 = class35.field585[0];
                    int var36;
                    if ((var23 instanceof class165)) {
                        class165 var37 = (class165) var23;
                        class179[] var38 = (class179[]) class122.field2193.method990((long) var37.field2873.field397, (byte) 44);
                        if (var38 == null) {
                            var38 = class142.method1023(-17933, 0, var37.field2873.field397, class229.field3994);
                            if (var38 != null) {
                                class122.field2193.method986(0, (long) var37.field2873.field397, var38);
                            }
                        }
                        class23 var39 = var37.field2873;
                        if (var38 != null && var38.length == 2) {
                            var35 = var38[0];
                            var34 = var38[1];
                        }
                        if (var39.field367 == -1) {
                            var36 = var23.method753(-20812);
                        } else {
                            var36 = var39.field367;
                        }
                    } else {
                        var36 = var23.method753(-20812);
                    }
                    class147.method1043(arg5 >> 1, var36 + var35.field3085 + 10, arg4, arg0, arg1 >> 1, (byte) -96, var23);
                    if (class41.field687 > -1) {
                        int var40 = class41.field687 + arg6 - (var35.field3084 >> 1);
                        int var41 = class84.field1370 + arg3 - 3;
                        var35.method728(var40, var41);
                        int var42 = var23.field1730 * var35.field3084 / 255;
                        int var43 = var35.field3085;
                        class47.method295(var40, var41, var40 + var42, var41 - -var43);
                        var34.method728(var40, var41);
                        class47.method297(arg6, arg3, arg6 + arg1, arg3 + arg5);
                    }
                }
                for (int var44 = 0; var44 < 4; var44++) {
                    if (var23.field1764[var44] > class35.field576) {
                        int var47;
                        if (var23 instanceof class165) {
                            class165 var45 = (class165) var23;
                            class23 var46 = var45.field2873;
                            if (var46.field367 == -1) {
                                var47 = var23.method753(-20812) / 2;
                            } else {
                                var47 = var46.field367 / 2;
                            }
                        } else {
                            var47 = var23.method753(arg2 - 24487) / 2;
                        }
                        class147.method1043(arg5 >> 1, var47, arg4, arg0, arg1 >> 1, (byte) -66, var23);
                        if (class41.field687 > -1) {
                            if (var44 == 1) {
                                class84.field1370 -= 20;
                            }
                            if (var44 == 2) {
                                class41.field687 -= 15;
                                class84.field1370 -= 10;
                            }
                            if (var44 == 3) {
                                class84.field1370 -= 10;
                                class41.field687 += 15;
                            }
                            class235.field4105[var23.field1745[var44]].method728(class41.field687 + arg6 - 12, arg3 - (-class84.field1370 + 12));
                            class5.field73.method116(class250.method1644(var23.field1728[var44], (byte) -115), class41.field687 + arg6 - 1, arg3 - -class84.field1370 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var8 = 0; var8 < class153.field2689; var8++) {
            int var9 = class92.field1574[var8];
            int var10 = class92.field1581[var8];
            int var11 = class92.field1578[var8];
            int var12 = class92.field1583[var8];
            boolean var13 = true;
            while (var13) {
                var13 = false;
                for (int var22 = 0; var22 < var8; var22++) {
                    if (class92.field1583[var22] - class92.field1578[var22] < var12 + 2 && class92.field1583[var22] + 2 > -var11 + var12 && var9 - var10 < class92.field1581[var22] + class92.field1574[var22] && class92.field1574[var22] - class92.field1581[var22] < var9 + var10 && class92.field1583[var22] - class92.field1578[var22] < var12) {
                        var12 = class92.field1583[var22] - class92.field1578[var22];
                        var13 = true;
                    }
                }
            }
            class41.field687 = class92.field1574[var8];
            class84.field1370 = class92.field1583[var8] = var12;
            class275 var14 = class92.field1580[var8];
            if (class78.field1295 == 0) {
                int var15 = 16776960;
                if (class92.field1579[var8] < 6) {
                    var15 = class124.field2214[class92.field1579[var8]];
                }
                if (class92.field1579[var8] == 6) {
                    var15 = (class168.field2925 % 20) < 10 ? 16711680 : 16776960;
                }
                if (class92.field1579[var8] == 7) {
                    var15 = class168.field2925 % 20 < 10 ? 255 : 65535;
                }
                if (class92.field1579[var8] == 8) {
                    var15 = class168.field2925 % 20 < 10 ? 45056 : 8454016;
                }
                if (class92.field1579[var8] == 9) {
                    int var16 = 150 - class92.field1576[var8];
                    if (var16 < 50) {
                        var15 = (var16 * 1280) + 16711680;
                    } else if (var16 < 100) {
                        var15 = 33160960 - var16 * 327680;
                    } else if (var16 < 150) {
                        var15 = (var16 - 100) * 5 + 65280;
                    }
                }
                if (class92.field1579[var8] == 10) {
                    int var17 = 150 - class92.field1576[var8];
                    if (var17 < 50) {
                        var15 = var17 * 5 + 16711680;
                    } else if (var17 < 100) {
                        var15 = 16711935 - ((var17 - 50) * 327680);
                    } else if (var17 < 150) {
                        var15 = var17 * 327680 + 255 + 500 - var17 * 5 - 32768000;
                    }
                }
                if (class92.field1579[var8] == 11) {
                    int var18 = 150 - class92.field1576[var8];
                    if (var18 < 50) {
                        var15 = 16777215 - var18 * 327685;
                    } else if (var18 < 100) {
                        var15 = ((var18 - 50) * 327685) + 65280;
                    } else if (var18 < 150) {
                        var15 = 16777215 + 32768000 - var18 * 327680;
                    }
                }
                if (class92.field1577[var8] == 0) {
                    class93.field1599.method116(var14, class41.field687 + arg6, class84.field1370 + arg3, var15, 0);
                }
                if (class92.field1577[var8] == 1) {
                    class93.field1599.method114(var14, class41.field687 + arg6, class84.field1370 + arg3, var15, 0, class168.field2925);
                }
                if (class92.field1577[var8] == 2) {
                    class93.field1599.method118(var14, class41.field687 + arg6, class84.field1370 + arg3, var15, 0, class168.field2925);
                }
                if (class92.field1577[var8] == 3) {
                    class93.field1599.method126(var14, class41.field687 + arg6, class84.field1370 + arg3, var15, 0, class168.field2925, 150 - class92.field1576[var8]);
                }
                if (class92.field1577[var8] == 4) {
                    int var19 = (150 - class92.field1576[var8]) * (class93.field1599.method113(var14) + 100) / 150;
                    class47.method295(class41.field687 + arg6 - 50, arg3, class41.field687 + arg6 + 50, arg3 + arg5);
                    class93.field1599.method121(var14, arg6 + class41.field687 + 50 - var19, class84.field1370 + arg3, var15, 0);
                    class47.method297(arg6, arg3, arg6 + arg1, arg3 + arg5);
                }
                if (class92.field1577[var8] == 5) {
                    int var20 = 150 - class92.field1576[var8];
                    int var21 = 0;
                    class47.method295(arg6, class84.field1370 + arg3 - class93.field1599.field315 - 1, arg1 + arg6, class84.field1370 + arg3 + 5);
                    if (var20 < 25) {
                        var21 = var20 - 25;
                    } else if (var20 > 125) {
                        var21 = var20 - 125;
                    }
                    class93.field1599.method116(var14, arg6 + class41.field687, arg3 + var21 - -class84.field1370, var15, 0);
                    class47.method297(arg6, arg3, arg6 + arg1, arg3 + arg5);
                }
            } else {
                class93.field1599.method116(var14, class41.field687 + arg6, arg3 - -class84.field1370, 16776960, 0);
            }
        }
        if (arg2 != 3675) {
            method1308(-86);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lma;[Lrk;[Lrk;[Lrk;B[Lkb;[Lrk;)V")
    public static final void method1312(class105 arg0, class20[] arg1, class20[] arg2, class20[] arg3, byte arg4, class259[] arg5, class20[] arg6) {
        class94.field1605 = arg3;
        class209.field3537 = arg5;
        int var7 = -110 / ((arg4 + 62) / 58);
        class228.field3855 = arg1;
        class125.field2244 = arg0;
        class262.field4554 = arg6;
        class77.field1259 = arg2;
        field3428++;
        class93.field1590.method549((byte) -94);
        int var8 = class125.field2244.method767(524287, class73.field1188);
        int[] var9 = class125.field2244.method761(true, var8);
        for (int var10 = 0; var10 < var9.length; var10++) {
            class93.field1590.method547(104, class192.method1259(12345678, new class85(class125.field2244.method775(var8, var9[var10], -24799))));
        }
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(B)V")
    public static final void method1313(byte arg0) {
        class91.field1550 = 0;
        int var1 = (class66.field1094.field1770 >> 7) + class16.field237;
        int var2 = 36 % ((arg0 + 45) / 48);
        field3423++;
        int var3 = (class66.field1094.field1758 >> 7) + class234.field4083;
        if (var1 >= 3053 && var1 <= 3156 && var3 >= 3056 && var3 <= 3136) {
            class91.field1550 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var3 >= 9492 && var3 <= 9535) {
            class91.field1550 = 1;
        }
        if (class91.field1550 == 1 && var1 >= 3139 && var1 <= 3199 && var3 >= 3008 && var3 <= 3062) {
            class91.field1550 = 0;
        }
    }
}
