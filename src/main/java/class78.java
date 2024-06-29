import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class78 extends class260 {

    @OriginalMember(owner = "client!oi", name = "R", descriptor = "I")
    private int field1591;

    @OriginalMember(owner = "client!oi", name = "T", descriptor = "Loh;")
    public static class263 field1593 = class253.method1681(-127, "Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100");

    @OriginalMember(owner = "client!oi", name = "M", descriptor = "Loh;")
    public static class263 field1586 = class253.method1681(-123, "<col=40ff00>");

    @OriginalMember(owner = "client!oi", name = "U", descriptor = "Loh;")
    public static class263 field1594 = class253.method1681(-125, "Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

    @OriginalMember(owner = "client!oi", name = "V", descriptor = "Loh;")
    public static class263 field1595 = class253.method1681(-125, "Ausw-=hlen");

    @OriginalMember(owner = "client!oi", name = "Q", descriptor = "S")
    public static short field1590 = 256;

    @OriginalMember(owner = "client!oi", name = "L", descriptor = "I")
    public static int field1585;

    @OriginalMember(owner = "client!oi", name = "O", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!oi", name = "P", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!oi", name = "S", descriptor = "I")
    public static int field1592;

    @OriginalMember(owner = "client!oi", name = "W", descriptor = "I")
    public static int field1596;

    @OriginalMember(owner = "client!oi", name = "X", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!oi", name = "Z", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!oi", name = "Y", descriptor = "[Loh;")
    public static class263[] field1598;

    @OriginalMember(owner = "client!oi", name = "N", descriptor = "[[B")
    public static byte[][] field1587;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I[Lpc;IIIBIIII)V")
    public static final void method532(int arg0, class21[] arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg5 == 83) {
            class133.method881(arg8, arg6, arg2, arg0);
            class270.method1831();
            for (int var10 = 0; ~var10 > ~arg1.length; ++var10) {
                class21 var11 = arg1[var10];
                if (var11 != null && (~var11.field536 == ~arg9 || ~arg9 == 1412584498 && class268.field4724 == var11)) {
                    int var12;
                    if (arg4 == -1) {
                        class185.field3350[class257.field4471] = var11.field523 + arg7;
                        class115.field2155[class257.field4471] = var11.field547 + arg3;
                        class216.field3835[class257.field4471] = var11.field539;
                        class119.field2217[class257.field4471] = var11.field479;
                        var12 = class257.field4471++;
                    } else {
                        var12 = arg4;
                    }
                    var11.field490 = var12;
                    var11.field572 = class228.field4012;
                    if (!var11.field573 || !client.method1004(var11)) {
                        if (var11.field516 > 0) {
                            class16.method117(var11, arg5 + -83);
                        }
                        int var13 = var11.field523 + arg7;
                        int var14 = var11.field547 + arg3;
                        int var15 = var11.field567;
                        if (class121.field2246 && (~client.method1005(var11) != -1 || ~var11.field519 == -1) && var15 > 127) {
                            var15 = 127;
                        }
                        if (class268.field4724 == var11) {
                            if (~arg9 != 1412584498 && !var11.field525) {
                                class232.field4054 = arg1;
                                class126.field2327 = arg3;
                                class87.field1748 = arg7;
                                continue;
                            }
                            if (!var11.field525) {
                                var15 = 128;
                            }
                            if (class111.field2084 && class108.field2039) {
                                int var16 = class136.field2492;
                                int var17 = var16 - class49.field1058;
                                if (class73.field1525 > var17) {
                                    var17 = class73.field1525;
                                }
                                int var18 = class252.field4380;
                                int var19 = var18 - class207.field3754;
                                if (class236.field4128 > var19) {
                                    var19 = class236.field4128;
                                }
                                if (~(class236.field4128 + class253.field4404.field479) > ~(var19 - -var11.field479)) {
                                    var19 = -var11.field479 + class236.field4128 - -class253.field4404.field479;
                                }
                                var14 = var19;
                                if (~(var11.field539 + var17) < ~(class73.field1525 - -class253.field4404.field539)) {
                                    var17 = class73.field1525 + class253.field4404.field539 + -var11.field539;
                                }
                                var13 = var17;
                            }
                        }
                        int var20;
                        int var21;
                        int var22;
                        int var23;
                        if (var11.field519 == 2) {
                            var20 = arg8;
                            var21 = arg2;
                            var22 = arg0;
                            var23 = arg6;
                        } else {
                            var23 = var14 > arg6 ? var14 : arg6;
                            int var24 = var11.field479 + var14;
                            int var25 = var11.field539 + var13;
                            var20 = ~arg8 <= ~var13 ? arg8 : var13;
                            if (var11.field519 == 9) {
                                ++var24;
                                ++var25;
                            }
                            var22 = ~arg0 < ~var24 ? var24 : arg0;
                            var21 = arg2 <= var25 ? arg2 : var25;
                        }
                        if (!var11.field573 || var20 < var21 && ~var23 > ~var22) {
                            if (var11.field516 != 0) {
                                if (var11.field516 == 1337) {
                                    class113.field2122 = var11;
                                    class53.field1120 = var13;
                                    class190.field3416 = var14;
                                    class47.method302(var11.field539, false, var11.field516 == 1403, var11.field479, var13, var14);
                                    class133.method881(arg8, arg6, arg2, arg0);
                                    continue;
                                }
                                if (~var11.field516 == -1339) {
                                    if (var11.method156(arg5 + 42)) {
                                        class125.method805(var12, var11, var13, var14, 1);
                                        class133.method881(arg8, arg6, arg2, arg0);
                                    }
                                    continue;
                                }
                                if (~var11.field516 == -1340) {
                                    if (var11.method156(101)) {
                                        class168.method1115(var11, var12, var13, var14, arg5 + 173);
                                        class133.method881(arg8, arg6, arg2, arg0);
                                    }
                                    continue;
                                }
                                if (~var11.field516 == -1401) {
                                    class253.method1686(var14, var13, (byte) 123, var11.field479, var11.field539);
                                    class21.field629[var12] = true;
                                    class183.field3317[var12] = true;
                                    class133.method881(arg8, arg6, arg2, arg0);
                                    continue;
                                }
                                if (var11.field516 == 1401) {
                                    class261.method1721(var13, var11.field539, var11.field479, (byte) -111, var14);
                                    class21.field629[var12] = true;
                                    class183.field3317[var12] = true;
                                    class133.method881(arg8, arg6, arg2, arg0);
                                    continue;
                                }
                                if (~var11.field516 == -1403) {
                                    class256.method1697(var13, var14, (byte) -102);
                                    class21.field629[var12] = true;
                                    class183.field3317[var12] = true;
                                    continue;
                                }
                                if (var11.field516 == 1405) {
                                    if (!class92.field1816) {
                                        continue;
                                    }
                                    int var26 = var14 - -15;
                                    int var27 = var11.field539 + var13;
                                    int var28 = 16776960;
                                    int var29 = 0;
                                    class151.field2733.method404(class124.method797(-114, new class263[] { class261.field4542, class136.method891(-128, class225.field3969) }), var27, var26, 16776960, -1);
                                    Runtime var30 = Runtime.getRuntime();
                                    int var31 = (int) ((var30.totalMemory() - var30.freeMemory()) / 1024L);
                                    int var32 = 0;
                                    int var115 = var26 + 15;
                                    if (var31 > 65536) {
                                        var28 = 16711680;
                                    }
                                    int var33 = 0;
                                    class151.field2733.method404(class124.method797(-56, new class263[] { class182.field3307, class136.method891(arg5 + -211, var31), class272.field4793 }), var27, var115, var28, -1);
                                    int var34 = 16776960;
                                    for (int var35 = 0; ~var35 > -28; ++var35) {
                                        var29 += class216.field3832[var35].method1498(true);
                                        var33 += class216.field3832[var35].method1497(-2);
                                        var32 += class216.field3832[var35].method1505((byte) -124);
                                    }
                                    var26 = var115 + 15;
                                    int var36 = var32 * 100 / var29;
                                    int var37 = var33 * 10000 / var29;
                                    class263 var38 = class124.method797(arg5 + -127, new class263[] { class44.field964, class56.method355(0, (byte) 84, (long) var37, true, 2), class150.field2709, class136.method891(arg5 ^ -40, var36), class109.field2055 });
                                    class11.field243.method404(var38, var27, var26, var34, -1);
                                    var26 += 12;
                                    class21.field629[var12] = true;
                                    class183.field3317[var12] = true;
                                    continue;
                                }
                            }
                            if (!class2.field53) {
                                if (var11.field519 == 0 && var11.field554 && class122.field2269 >= var20 && class5.field95 >= var23 && ~class122.field2269 > ~var21 && class5.field95 < var22 && !class121.field2246) {
                                    class202.field3645[0] = 1003;
                                    class156.field2811[0] = class93.field1831;
                                    class68.field1382[0] = class20.field459;
                                    class252.field4384 = 1;
                                }
                                if (~var20 >= ~class122.field2269 && var23 <= class5.field95 && ~class122.field2269 > ~var21 && ~var22 < ~class5.field95) {
                                    class166.method1092((byte) 71, -var13 + class122.field2269, -var14 + class5.field95, var11);
                                }
                            }
                            if (var11.field519 == 0) {
                                if (!var11.field573 && client.method1004(var11) && class222.field3929 != var11) {
                                    continue;
                                }
                                if (!var11.field573) {
                                    if (-var11.field479 + var11.field503 < var11.field530) {
                                        var11.field530 = var11.field503 - var11.field479;
                                    }
                                    if (var11.field530 < 0) {
                                        var11.field530 = 0;
                                    }
                                }
                                method532(var22, arg1, var21, var14 - var11.field530, var12, (byte) 83, var23, -var11.field591 + var13, var20, var11.field537);
                                if (var11.field589 != null) {
                                    method532(var22, var11.field589, var21, var14 - var11.field530, var12, (byte) 83, var23, -var11.field591 + var13, var20, var11.field537);
                                }
                                class266 var39 = (class266) class212.field3797.method31(arg5 + -32748, (long) var11.field537);
                                if (var39 != null) {
                                    if (var39.field4640 == 0 && !class2.field53 && var20 <= class122.field2269 && var23 <= class5.field95 && ~var21 < ~class122.field2269 && ~class5.field95 > ~var22 && !class121.field2246) {
                                        class252.field4384 = 1;
                                        class156.field2811[0] = class93.field1831;
                                        class68.field1382[0] = class20.field459;
                                        class202.field3645[0] = 1003;
                                    }
                                    class131.method846(var13, var22, var39.field4641, (byte) -104, var21, var23, var12, var14, var20);
                                }
                                class133.method881(arg8, arg6, arg2, arg0);
                                class270.method1831();
                            }
                            if (class60.field1237[var12] || ~class41.field925 < -2) {
                                if (var11.field519 == 0 && !var11.field573 && var11.field479 < var11.field503) {
                                    class146.method962(var13 - -var11.field539, var11.field503, var11.field530, var11.field479, -27516, var14);
                                }
                                if (var11.field519 != 1) {
                                    if (var11.field519 == 2) {
                                        int var40 = 0;
                                        for (int var41 = 0; var41 < var11.field541; ++var41) {
                                            for (int var42 = 0; ~var42 > ~var11.field491; ++var42) {
                                                int var43 = var13 - -((var11.field494 + 32) * var42);
                                                int var44 = (32 - -var11.field542) * var41 + var14;
                                                if (~var40 > -21) {
                                                    var43 += var11.field504[var40];
                                                    var44 += var11.field612[var40];
                                                }
                                                if (var11.field469[var40] <= 0) {
                                                    if (var11.field621 != null && var40 < 20) {
                                                        class141 var45 = var11.method152(var40, 25540);
                                                        if (var45 != null) {
                                                            var45.method929(var43, var44);
                                                        } else if (class54.field1142) {
                                                            class220.method1508(var11, (byte) -48);
                                                        }
                                                    }
                                                } else {
                                                    boolean var46 = false;
                                                    boolean var47 = false;
                                                    int var48 = var11.field469[var40] + -1;
                                                    if (~arg8 > ~(var43 - -32) && var43 < arg2 && ~arg6 > ~(var44 + 32) && arg0 > var44 || class127.field2360 == var11 && ~class91.field1806 == ~var40) {
                                                        class141 var49;
                                                        if (~class49.field1060 == -2 && ~class121.field2247 == ~var40 && class46.field1006 == var11.field537) {
                                                            var49 = class170.method1125(var48, 2, var11.field608, var11.field618[var40], 0, true);
                                                        } else {
                                                            var49 = class170.method1125(var48, 1, var11.field608, var11.field618[var40], 3153952, true);
                                                        }
                                                        if (class270.field4768) {
                                                            class21.field629[var12] = true;
                                                        }
                                                        if (var49 == null) {
                                                            class220.method1508(var11, (byte) -80);
                                                        } else if (class127.field2360 == var11 && ~class91.field1806 == ~var40) {
                                                            int var50 = class136.field2492 - class153.field2776;
                                                            if (~var50 > -6 && var50 > -5) {
                                                                var50 = 0;
                                                            }
                                                            int var51 = -client.field2762 + class252.field4380;
                                                            if (var51 < 5 && ~var51 < 4) {
                                                                var51 = 0;
                                                            }
                                                            if (~class130.field2388 > -6) {
                                                                var50 = 0;
                                                                var51 = 0;
                                                            }
                                                            var49.method925(var43 - -var50, var44 - -var51, 128);
                                                            if (~arg9 != 0) {
                                                                class21 var52 = arg1[arg9 & 65535];
                                                                int var53 = class133.field2443;
                                                                int var54 = class133.field2450;
                                                                if (var44 + var51 < var54 && var52.field530 > 0) {
                                                                    int var55 = (-var44 + var54 + -var51) * class187.field3369 / 3;
                                                                    if (class187.field3369 * 10 < var55) {
                                                                        var55 = class187.field3369 * 10;
                                                                    }
                                                                    if (var52.field530 < var55) {
                                                                        var55 = var52.field530;
                                                                    }
                                                                    var52.field530 -= var55;
                                                                    client.field2762 += var55;
                                                                    class220.method1508(var52, (byte) -106);
                                                                }
                                                                if (var53 < var51 + 32 + var44 && -var52.field479 + var52.field503 > var52.field530) {
                                                                    int var56 = (var44 + var51 - -32 - var53) * class187.field3369 / 3;
                                                                    if (class187.field3369 * 10 < var56) {
                                                                        var56 = class187.field3369 * 10;
                                                                    }
                                                                    if (-var52.field479 - var52.field530 + var52.field503 < var56) {
                                                                        var56 = -var52.field530 + var52.field503 - var52.field479;
                                                                    }
                                                                    client.field2762 -= var56;
                                                                    var52.field530 += var56;
                                                                    class220.method1508(var52, (byte) -86);
                                                                }
                                                            }
                                                        } else if (class150.field2705 == var11 && ~class157.field2814 == ~var40) {
                                                            var49.method925(var43, var44, 128);
                                                        } else {
                                                            var49.method929(var43, var44);
                                                        }
                                                    }
                                                }
                                                ++var40;
                                            }
                                        }
                                    } else if (var11.field519 == 3) {
                                        int var57;
                                        if (class240.method1608(var11, (byte) -127)) {
                                            var57 = var11.field501;
                                            if (class222.field3929 == var11 && var11.field545 != 0) {
                                                var57 = var11.field545;
                                            }
                                        } else {
                                            var57 = var11.field515;
                                            if (class222.field3929 == var11 && var11.field500 != 0) {
                                                var57 = var11.field500;
                                            }
                                        }
                                        if (~var15 != -1) {
                                            if (!var11.field507) {
                                                class133.method858(var13, var14, var11.field539, var11.field479, var57, 256 - (var15 & 255));
                                            } else {
                                                class133.method874(var13, var14, var11.field539, var11.field479, var57, -(var15 & 255) + 256);
                                            }
                                        } else if (!var11.field507) {
                                            class133.method876(var13, var14, var11.field539, var11.field479, var57);
                                        } else {
                                            class133.method865(var13, var14, var11.field539, var11.field479, var57);
                                        }
                                    } else if (var11.field519 == 4) {
                                        class65 var58 = var11.method159(87, class269.field4738);
                                        if (var58 == null) {
                                            if (class54.field1142) {
                                                class220.method1508(var11, (byte) -119);
                                            }
                                        } else {
                                            class263 var59 = var11.field615;
                                            int var60;
                                            if (class240.method1608(var11, (byte) -127)) {
                                                var60 = var11.field501;
                                                if (class222.field3929 == var11 && var11.field545 != 0) {
                                                    var60 = var11.field545;
                                                }
                                                if (var11.field596.method1740(-127) > 0) {
                                                    var59 = var11.field596;
                                                }
                                            } else {
                                                var60 = var11.field515;
                                                if (class222.field3929 == var11 && ~var11.field500 != -1) {
                                                    var60 = var11.field500;
                                                }
                                            }
                                            if (var11.field573 && ~var11.field620 != 0) {
                                                class72 var61 = class92.method649(arg5 ^ -32425, var11.field620);
                                                var59 = var61.field1467;
                                                if (var59 == null) {
                                                    var59 = class226.field3990;
                                                }
                                                if ((var61.field1487 == 1 || var11.field508 != 1) && ~var11.field508 != 0) {
                                                    var59 = class124.method797(-62, new class263[] { class61.field1244, var59, class112.field2105, class8.method51(var11.field508, -117) });
                                                }
                                            }
                                            if (class113.field2121 == var11) {
                                                var59 = class157.field2831;
                                                var60 = var11.field515;
                                            }
                                            if (!var11.field573) {
                                                var59 = class31.method207(var11, var59, (byte) -108);
                                            }
                                            var58.method414(var59, var13, var14, var11.field539, var11.field479, var60, var11.field540 ? 0 : -1, var11.field626, var11.field524, var11.field617);
                                        }
                                    } else if (var11.field519 == 5) {
                                        if (!var11.field573) {
                                            class141 var62 = var11.method157(class240.method1608(var11, (byte) -127), true);
                                            if (var62 == null) {
                                                if (class54.field1142) {
                                                    class220.method1508(var11, (byte) -118);
                                                }
                                            } else {
                                                var62.method929(var13, var14);
                                            }
                                        } else {
                                            class141 var63;
                                            if (var11.field620 != -1) {
                                                var63 = class170.method1125(var11.field620, var11.field592, var11.field608, var11.field508, var11.field549, true);
                                            } else {
                                                var63 = var11.method157(false, true);
                                            }
                                            if (var63 == null) {
                                                if (class54.field1142) {
                                                    class220.method1508(var11, (byte) -124);
                                                }
                                            } else {
                                                int var64 = var63.field2574;
                                                int var65 = var63.field2580;
                                                if (!var11.field607) {
                                                    int var70 = var11.field539 * 4096 / var64;
                                                    if (~var11.field483 != -1) {
                                                        var63.method937(var11.field539 / 2 + var13, var11.field479 / 2 + var14, false, var11.field483, var70);
                                                    } else if (var15 == 0) {
                                                        if (~var11.field539 == ~var64 && ~var11.field479 == ~var65) {
                                                            var63.method929(var13, var14);
                                                        } else {
                                                            var63.method926(var13, var14, var11.field539, var11.field479);
                                                        }
                                                    } else {
                                                        var63.method919(var13, var14, var11.field539, var11.field479, 256 - (var15 & 255));
                                                    }
                                                } else {
                                                    int var66 = (var11.field479 - -var65 + -1) / var65;
                                                    int var67 = (var64 + -1 + var11.field539) / var64;
                                                    class133.method870(var13, var14, var11.field539 + var13, var11.field479 + var14);
                                                    for (int var68 = 0; var67 > var68; ++var68) {
                                                        for (int var69 = 0; var66 > var69; ++var69) {
                                                            if (var11.field483 != 0) {
                                                                var63.method937(var64 * var68 + var64 / 2 + var13, var65 / 2 + var65 * var69 + var14, false, var11.field483, 4096);
                                                            } else if (var15 == 0) {
                                                                var63.method929(var64 * var68 + var13, var65 * var69 + var14);
                                                            } else {
                                                                var63.method925(var64 * var68 + var13, var14 - -(var65 * var69), 256 - (var15 & 255));
                                                            }
                                                        }
                                                    }
                                                    class133.method881(arg8, arg6, arg2, arg0);
                                                }
                                            }
                                        }
                                    } else if (~var11.field519 == -7) {
                                        class76 var71 = null;
                                        int var72 = 0;
                                        boolean var73 = class240.method1608(var11, (byte) -127);
                                        int var74;
                                        if (var73) {
                                            var74 = var11.field601;
                                        } else {
                                            var74 = var11.field623;
                                        }
                                        if (~var11.field620 != 0) {
                                            class72 var75 = class92.method649(arg5 + -32591, var11.field620);
                                            if (var75 != null) {
                                                class72 var76 = var75.method460(arg5 ^ -84, var11.field508);
                                                class240 var77 = ~var74 != 0 ? class186.method1226(12828, var74) : null;
                                                var71 = var76.method471(var11.field614, var77, arg5 + 31163, 1);
                                                if (var71 == null) {
                                                    class220.method1508(var11, (byte) -50);
                                                } else {
                                                    var72 = -var71.method106() / 2;
                                                }
                                            }
                                        } else if (var11.field481 == 5) {
                                            if (~var11.field594 == 0) {
                                                var71 = class130.field2391.method143((class240) null, -1, (class240) null, 5, -1);
                                            } else {
                                                int var78 = var11.field594 & 2047;
                                                if (~class196.field3574 == ~var78) {
                                                    var78 = 2047;
                                                }
                                                class137 var79 = class151.field2725[var78];
                                                class240 var80 = var74 != -1 ? class186.method1226(arg5 + 12745, var74) : null;
                                                if (var79 != null && (int) var79.field2508.method1755(1) << 11 == (var11.field594 & -2048)) {
                                                    var71 = var79.field2525.method143((class240) null, var11.field614, var80, -118, 0);
                                                }
                                            }
                                        } else if (~var74 != 0) {
                                            class240 var81 = class186.method1226(12828, var74);
                                            var71 = var11.method162(var81, var11.field614, 0, class229.field4018.field2525, var73);
                                            if (var71 == null && class54.field1142) {
                                                class220.method1508(var11, (byte) -97);
                                            }
                                        } else {
                                            var71 = var11.method162((class240) null, -1, 0, class229.field4018.field2525, var73);
                                            if (var71 == null && class54.field1142) {
                                                class220.method1508(var11, (byte) -63);
                                            }
                                        }
                                        if (var71 != null) {
                                            int var82;
                                            if (var11.field487 <= 0) {
                                                var82 = 256;
                                            } else {
                                                var82 = (var11.field539 << 8) / var11.field487;
                                            }
                                            int var83;
                                            if (~var11.field565 < -1) {
                                                var83 = (var11.field479 << 8) / var11.field565;
                                            } else {
                                                var83 = 256;
                                            }
                                            int var84 = var11.field479 / 2 + (var14 - -(var11.field599 * var83 >> 8));
                                            int var85 = (var11.field603 * var82 >> 8) + var11.field539 / 2 + var13;
                                            class270.method1829(var85, var84);
                                            int var86 = class270.field4769[var11.field495] * var11.field587 >> 16;
                                            int var87 = class270.field4762[var11.field495] * var11.field587 >> 16;
                                            if (var11.field573) {
                                                if (var11.field598) {
                                                    ((class167) var71).method1098(0, var11.field588, var11.field582, var11.field495, var11.field555, var11.field553 + var86 + var72, var87 - -var11.field553, var11.field587);
                                                } else {
                                                    var71.method502(0, var11.field588, var11.field582, var11.field495, var11.field555, var86 - -var11.field553 + var72, var11.field553 + var87);
                                                }
                                            } else {
                                                var71.method502(0, var11.field588, 0, var11.field495, 0, var86, var87);
                                            }
                                            class270.method1837();
                                        }
                                    } else {
                                        if (~var11.field519 == -8) {
                                            class65 var88 = var11.method159(94, class269.field4738);
                                            if (var88 == null) {
                                                if (class54.field1142) {
                                                    class220.method1508(var11, (byte) -127);
                                                }
                                                continue;
                                            }
                                            int var89 = 0;
                                            for (int var90 = 0; var90 < var11.field541; ++var90) {
                                                for (int var91 = 0; ~var91 > ~var11.field491; ++var91) {
                                                    if (var11.field469[var89] > 0) {
                                                        class72 var92 = class92.method649(-32508, var11.field469[var89] + -1);
                                                        class263 var93;
                                                        if (var92.field1487 != 1 && var11.field618[var89] == 1) {
                                                            var93 = class124.method797(-66, new class263[] { class61.field1244, var92.field1467, class91.field1800 });
                                                        } else {
                                                            var93 = class124.method797(-80, new class263[] { class61.field1244, var92.field1467, class112.field2105, class8.method51(var11.field618[var89], -105) });
                                                        }
                                                        int var94 = (var11.field494 + 115) * var91 + var13;
                                                        int var95 = (var11.field542 + 12) * var90 + var14;
                                                        if (~var11.field626 != -1) {
                                                            if (var11.field626 != 1) {
                                                                var88.method404(var93, var94 + 115 + -1, var95, var11.field515, var11.field540 ? 0 : -1);
                                                            } else {
                                                                var88.method401(var93, var94 - -57, var95, var11.field515, !var11.field540 ? -1 : 0);
                                                            }
                                                        } else {
                                                            var88.method411(var93, var94, var95, var11.field515, !var11.field540 ? -1 : 0);
                                                        }
                                                    }
                                                    ++var89;
                                                }
                                            }
                                        }
                                        if (var11.field519 == 8 && class75.field1556 == var11 && ~class156.field2808 == ~class11.field245) {
                                            int var96 = 0;
                                            int var97 = 0;
                                            class65 var98 = class151.field2733;
                                            class263 var99 = var11.field615;
                                            class263 var100 = class31.method207(var11, var99, (byte) -113);
                                            while (var100.method1740(arg5 ^ -48) > 0) {
                                                int var108 = var100.method1744(class173.field3146, (byte) -101);
                                                class263 var109;
                                                if (var108 == -1) {
                                                    var109 = var100;
                                                    var100 = class20.field459;
                                                } else {
                                                    var109 = var100.method1763(arg5 + -200, var108, 0);
                                                    var100 = var100.method1787(var108 - -4, false);
                                                }
                                                int var110 = var98.method408(var109);
                                                var96 += var98.field1311 + 1;
                                                if (var97 < var110) {
                                                    var97 = var110;
                                                }
                                            }
                                            var96 += 7;
                                            int var101 = var11.field479 + var14 + 5;
                                            var97 += 6;
                                            if (var96 + var101 > arg0) {
                                                var101 = -var96 + arg0;
                                            }
                                            int var102 = var11.field539 + var13 + -5 + -var97;
                                            if (var13 + 5 > var102) {
                                                var102 = var13 + 5;
                                            }
                                            if (var97 + var102 > arg2) {
                                                var102 = arg2 - var97;
                                            }
                                            class133.method865(var102, var101, var97, var96, 16777120);
                                            class133.method876(var102, var101, var97, var96, 0);
                                            int var103 = var98.field1311 + var101 + 2;
                                            class263 var104 = var11.field615;
                                            class263 var105 = class31.method207(var11, var104, (byte) -125);
                                            while (~var105.method1740(arg5 ^ -46) < -1) {
                                                int var106 = var105.method1744(class173.field3146, (byte) -101);
                                                class263 var107;
                                                if (~var106 == 0) {
                                                    var107 = var105;
                                                    var105 = class20.field459;
                                                } else {
                                                    var107 = var105.method1763(-126, var106, 0);
                                                    var105 = var105.method1787(var106 + 4, false);
                                                }
                                                var98.method411(var107, var102 - -3, var103, 0, -1);
                                                var103 += var98.field1311 + 1;
                                            }
                                        }
                                        if (~var11.field519 == -10) {
                                            int var111;
                                            int var112;
                                            int var113;
                                            int var114;
                                            if (var11.field585) {
                                                var111 = var14;
                                                var112 = var11.field539 + var13;
                                                var113 = var14 - -var11.field479;
                                                var114 = var13;
                                            } else {
                                                var113 = var14;
                                                var114 = var13;
                                                var112 = var11.field539 + var13;
                                                var111 = var11.field479 + var14;
                                            }
                                            if (var11.field475 == 1) {
                                                class133.method862(var114, var113, var112, var111, var11.field515);
                                            } else {
                                                class133.method877(var114, var113, var112, var111, var11.field515, var11.field475);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            ++field1589;
        }
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(I)V")
    private class78(int arg0) {
        super(0, true);
        this.field1591 = 4096;
        this.field1591 = arg0;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ZLue;)V")
    public static final void method533(boolean arg0, class86 arg1) {
        class207.field3749 = class191.method1251(arg1, class50.field1078, 0, (byte) -64);
        ++field1585;
        class24.field689 = new class88[class207.field3749.length];
        class181.field3293 = new class88[class207.field3749.length];
        class131.field2400 = new class88[class207.field3749.length];
        for (int var2 = 0; ~var2 > ~class207.field3749.length; ++var2) {
            class207.field3749[var2].method618();
            class24.field689[var2] = class207.field3749[var2].method623();
            class207.field3749[var2].method618();
            class181.field3293[var2] = class207.field3749[var2].method623();
            class207.field3749[var2].method618();
            class131.field2400[var2] = class207.field3749[var2].method623();
            class207.field3749[var2].method618();
        }
        class47.field1028 = class43.method265(arg1, 0, 0, class75.field1557);
        class1.field11 = class66.method430(0, class169.field3103, arg1, (byte) -27);
        class24.field681 = class66.method430(0, class15.field366, arg1, (byte) -27);
        class48.field1030 = class66.method430(0, class136.field2494, arg1, (byte) -27);
        class272.field4794 = class66.method430(0, class91.field1788, arg1, (byte) -27);
        class105.field1981 = class233.method1561(class189.field3409, arg1, 0, -115);
        class157.field2835 = class233.method1561(class128.field2379, arg1, 0, -71);
        class181.field3287 = class189.method1240(class207.field3747, 0, arg1, (byte) -4);
        if (!arg0) {
            class52.field1109 = class233.method1561(class185.field3341, arg1, 0, -118);
            class176.field3180 = class233.method1561(class156.field2810, arg1, 0, -118);
            class143.field2626 = class120.method777(class103.field1952, -1, arg1, 0);
            class269.field4738 = class120.method777(class90.field1782, -1, arg1, 0);
            class11.field243.method423(class269.field4738, (int[]) null);
            class151.field2733.method423(class269.field4738, (int[]) null);
            class107.field2026.method423(class269.field4738, (int[]) null);
            class140 var3 = class105.method709(class24.field690, 0, arg1, true);
            var3.method932();
            class200.field3617 = var3;
            class140[] var4 = class43.method265(arg1, 0, 0, class119.field2212);
            for (int var5 = 0; ~var5 > ~var4.length; ++var5) {
                var4[var5].method932();
            }
            class62.field1255 = var4;
            int var6 = -10 + (int) (Math.random() * 21.0D);
            int var7 = (int) (21.0D * Math.random()) - 10;
            int var8 = (int) (41.0D * Math.random()) + -20;
            int var9 = (int) (21.0D * Math.random()) - 10;
            for (int var10 = 0; class47.field1028.length > var10; ++var10) {
                class47.field1028[var10].method923(var6 + var8, var8 + var9, var7 - -var8);
            }
            class207.field3749[0].method621(var6 + var8, var9 - -var8, var7 - -var8);
            class24.field684 = class47.field1028;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lsi;IIIZIIIZ)V")
    public static final void method534(class194 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, boolean arg8) {
        if (!arg4) {
            method533(true, (class86) null);
        }
        if (~arg3 <= -1 && ~arg3 > -105 && ~arg7 <= -1 && ~arg7 > -105) {
            if (!arg8) {
                class77.field1576[arg1][arg3][arg7] = 0;
            }
            while (true) {
                int var9 = arg0.method1301(-8317);
                if (~var9 == -1) {
                    if (!arg8) {
                        if (~arg1 == -1) {
                            class112.field2102[0][arg3][arg7] = -class24.method178(4, 932731 - (-arg3 - arg6), arg2 + arg7 + 556238) * 8;
                        } else {
                            class112.field2102[arg1][arg3][arg7] = class112.field2102[arg1 + -1][arg3][arg7] + -240;
                        }
                    } else {
                        class112.field2102[0][arg3][arg7] = class163.field2968[0][arg3][arg7];
                    }
                    break;
                }
                if (var9 == 1) {
                    int var10 = arg0.method1301(-8317);
                    if (arg8) {
                        class112.field2102[0][arg3][arg7] = var10 * 8 + class163.field2968[0][arg3][arg7];
                    } else {
                        if (var10 == 1) {
                            var10 = 0;
                        }
                        if (arg1 == 0) {
                            class112.field2102[0][arg3][arg7] = -var10 * 8;
                        } else {
                            class112.field2102[arg1][arg3][arg7] = class112.field2102[arg1 - 1][arg3][arg7] + -(var10 * 8);
                        }
                    }
                    break;
                }
                if (var9 <= 49) {
                    class75.field1543[arg1][arg3][arg7] = arg0.method1281((byte) 124);
                    class86.field1730[arg1][arg3][arg7] = (byte) ((var9 + -2) / 4);
                    class275.field4821[arg1][arg3][arg7] = (byte) class263.method1777(var9 + -2 + arg5, 3);
                } else if (var9 <= 81) {
                    if (!arg8) {
                        class77.field1576[arg1][arg3][arg7] = (byte) (var9 + -49);
                    }
                } else {
                    class103.field1967[arg1][arg3][arg7] = (byte) (var9 + -81);
                }
            }
        } else {
            while (true) {
                int var11 = arg0.method1301(-8317);
                if (~var11 == -1) {
                    break;
                }
                if (~var11 == -2) {
                    arg0.method1301(-8317);
                    break;
                }
                if (~var11 >= -50) {
                    arg0.method1301(-8317);
                }
            }
        }
        ++field1597;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IILsi;)V")
    public final void method86(int arg0, int arg1, class194 arg2) {
        if (arg0 == 0) {
            this.field1591 = (arg2.method1301(arg1 ^ -13882) << 12) / 255;
        }
        ++field1592;
        if (arg1 != 5701) {
            method532(22, (class21[]) null, -9, -49, -115, (byte) -18, 83, 37, -119, -124);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Ljava/awt/Color;ZZILoh;)V")
    public static final void method535(Color arg0, boolean arg1, boolean arg2, int arg3, class263 arg4) {
        try {
            Graphics var5 = class202.field3648.getGraphics();
            if (class68.field1383 == null) {
                class68.field1383 = new Font("Helvetica", 1, 13);
                class151.field2732 = class202.field3648.getFontMetrics(class68.field1383);
            }
            if (arg1) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class138.field2558, class143.field2616);
            }
            if (arg0 == null) {
                arg0 = new Color(140, 17, 17);
            }
            try {
                if (class47.field1024 == null) {
                    class47.field1024 = class202.field3648.createImage(304, 34);
                }
                Graphics var6 = class47.field1024.getGraphics();
                var6.setColor(arg0);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg3 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg3 * 3 + 2, 2, -(arg3 * 3) + 300, 30);
                var6.setFont(class68.field1383);
                var6.setColor(Color.white);
                arg4.method1771((byte) 124, (-arg4.method1751(arg2, class151.field2732) + 304) / 2, 22, var6);
                var5.drawImage(class47.field1024, class138.field2558 / 2 - 152, class143.field2616 / 2 + -18, (ImageObserver) null);
            } catch (Exception var9) {
                int var7 = class143.field2616 / 2 + -18;
                int var8 = class138.field2558 / 2 + -152;
                var5.setColor(arg0);
                var5.drawRect(var8, var7, 303, 33);
                var5.fillRect(var8 + 2, var7 - -2, arg3 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var8 + 1, var7 + 1, 301, 31);
                var5.fillRect(arg3 * 3 + var8 + 2, var7 - -2, -(arg3 * 3) + 300, 30);
                var5.setFont(class68.field1383);
                var5.setColor(Color.white);
                arg4.method1771((byte) 122, (304 + -arg4.method1751(false, class151.field2732)) / 2 + var8, var7 + 22, var5);
            }
            if (class182.field3308 != null) {
                var5.setFont(class68.field1383);
                var5.setColor(Color.white);
                class182.field3308.method1771((byte) 112, class138.field2558 / 2 - class182.field3308.method1751(arg2, class151.field2732) / 2, class143.field2616 / 2 + -26, var5);
            }
        } catch (Exception var10) {
            class202.field3648.repaint();
        }
        ++field1596;
    }

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "(B)V")
    public static void method536(byte arg0) {
        if (arg0 >= -24) {
            method536((byte) 119);
        }
        field1595 = null;
        field1593 = null;
        field1594 = null;
        field1598 = null;
        field1586 = null;
        field1587 = null;
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "()V")
    public class78() {
        this(4096);
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(II)[I")
    public final int[] method17(int arg0, int arg1) {
        ++field1588;
        if (arg1 != 255) {
            field1599 = -70;
        }
        int[] var3 = super.field4511.method304(arg0, false);
        if (super.field4511.field1029) {
            class149.method978(var3, 0, class49.field1052, this.field1591);
        }
        return var3;
    }
}
