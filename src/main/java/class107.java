import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class107 {

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "Ldc;")
    public static class37 field1856 = class185.method1233((byte) 86, "Spieler kann nicht gefunden werden: ");

    @OriginalMember(owner = "client!jj", name = "o", descriptor = "Ldc;")
    private static class37 field1869 = class185.method1233((byte) 86, "Loaded input handler");

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "Ldc;")
    public static class37 field1858 = field1869;

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "Loa;")
    public static class153 field1857 = new class153(512);

    @OriginalMember(owner = "client!jj", name = "s", descriptor = "[J")
    public static long[] field1873 = new long[256];

    @OriginalMember(owner = "client!jj", name = "u", descriptor = "I")
    public static int field1875 = 0;

    @OriginalMember(owner = "client!jj", name = "v", descriptor = "I")
    public static int field1876 = 0;

    @OriginalMember(owner = "client!jj", name = "w", descriptor = "Ldc;")
    public static class37 field1877 = class185.method1233((byte) 86, ":trade:");

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "I")
    public int field1855;

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "I")
    public int field1859;

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "I")
    public int field1860;

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "I")
    public int field1863;

    @OriginalMember(owner = "client!jj", name = "k", descriptor = "I")
    public int field1865;

    @OriginalMember(owner = "client!jj", name = "m", descriptor = "I")
    public int field1867;

    @OriginalMember(owner = "client!jj", name = "n", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!jj", name = "p", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!jj", name = "q", descriptor = "I")
    public int field1871;

    @OriginalMember(owner = "client!jj", name = "j", descriptor = "[B")
    public byte[] field1864;

    @OriginalMember(owner = "client!jj", name = "l", descriptor = "[B")
    public byte[] field1866;

    @OriginalMember(owner = "client!jj", name = "t", descriptor = "[I")
    public static int[] field1874;

    @OriginalMember(owner = "client!jj", name = "r", descriptor = "[[[B")
    public static byte[][][] field1872;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lmf;I)I")
    public static final int method699(class136 arg0, int arg1) {
        field1870++;
        if (arg1 <= 47) {
            return 120;
        } else {
            class140 var2 = (class140) field1857.method1047((byte) 121, ((long) arg0.field2608 << 32) + (long) arg0.field2515);
            return var2 == null ? arg0.field2565 : var2.field2710;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Z)V")
    public static final void method700(boolean arg0) {
        if (arg0) {
            class39.field808 = class228.field4197;
            class180.field3354 = class127.field2341;
        } else {
            class39.field808 = class78.field1370;
            class180.field3354 = class194.field3620;
        }
        class95.field1674 = class180.field3354.length;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIII[Lmf;IIII)V")
    public static final void method701(int arg0, int arg1, int arg2, int arg3, class136[] arg4, int arg5, int arg6, int arg7, int arg8) {
        field1868++;
        if (arg7 < 69) {
            return;
        }
        for (int var9 = 0; var9 < arg4.length; var9++) {
            class136 var10 = arg4[var9];
            if (var10 != null && (!var10.field2527 || var10.field2513 == 0 || var10.field2594 || method699(var10, 88) != 0 || class136.field2612 == var10 || var10.field2659 == 1338) && var10.field2566 == arg0 && (!var10.field2527 || !class25.method171(true, var10))) {
                int var11 = var10.field2630 + arg8;
                int var12 = var10.field2636 + arg1;
                int var13;
                int var14;
                int var17;
                int var18;
                if (var10.field2513 == 2) {
                    var14 = arg3;
                    var13 = arg6;
                    var18 = arg2;
                    var17 = arg5;
                } else {
                    var13 = arg6 >= var12 ? arg6 : var12;
                    var14 = arg3 < var11 ? var11 : arg3;
                    int var15 = var10.field2638 + var11;
                    int var16 = var10.field2509 + var12;
                    if (var10.field2513 == 9) {
                        var16++;
                        var15++;
                    }
                    var17 = arg5 <= var16 ? arg5 : var16;
                    var18 = var15 < arg2 ? var15 : arg2;
                }
                if (class56.field1073 == var10) {
                    class41.field861 = var11;
                    class245.field4479 = true;
                    class235.field4282 = var12;
                }
                if (!var10.field2527 || var18 > var14 && var13 < var17) {
                    if (var10.field2513 == 0) {
                        if (!var10.field2527 && class25.method171(true, var10) && class99.field1736 != var10) {
                            continue;
                        }
                        if (var10.field2660 && var14 <= class80.field1416 && var13 <= class235.field4271 && var18 > class80.field1416 && class235.field4271 < var17) {
                            for (class51 var19 = (class51) class63.field1154.method1338(-116); var19 != null; var19 = (class51) class63.field1154.method1332((byte) -89)) {
                                if (var19.field1030) {
                                    var19.method433(0);
                                }
                            }
                            for (class51 var20 = (class51) class13.field186.method1338(79); var20 != null; var20 = (class51) class13.field186.method1332((byte) -89)) {
                                if (var20.field1030) {
                                    var20.method433(0);
                                }
                            }
                            if (class39.field811 == 0) {
                                class56.field1073 = null;
                                class136.field2612 = null;
                            }
                            class29.field544 = false;
                        }
                    }
                    if (var10.field2527) {
                        boolean var21 = false;
                        boolean var22 = false;
                        boolean var23;
                        if (class80.field1416 >= var14 && class235.field4271 >= var13 && var18 > class80.field1416 && var17 > class235.field4271) {
                            var23 = true;
                        } else {
                            var23 = false;
                        }
                        if (class97.field1698 == 1 && class205.field3805 >= var14 && var13 <= class200.field3745 && var18 > class205.field3805 && class200.field3745 < var17) {
                            var21 = true;
                        }
                        if (class20.field334 == 1 && var23) {
                            var22 = true;
                        }
                        if (var21) {
                            class5.method43(var10, (byte) -102, class200.field3745 - var12, -var11 + class205.field3805);
                        }
                        if (class56.field1073 != null && class56.field1073 != var10 && var23 && class104.method680(method699(var10, 57), true)) {
                            class200.field3741 = var10;
                        }
                        if (class136.field2612 == var10) {
                            class136.field2592 = var12;
                            class163.field3100 = true;
                            class108.field1886 = var11;
                        }
                        if (var10.field2594 || var10.field2659 != 0) {
                            if (var23 && class108.field1884 != 0 && var10.field2550 != null) {
                                class51 var24 = new class51();
                                var24.field1042 = var10.field2550;
                                var24.field1026 = class108.field1884;
                                var24.field1031 = var10;
                                var24.field1030 = true;
                                class63.field1154.method1340(59, var24);
                            }
                            if (class56.field1073 != null || class115.field2052 != null || class118.field2114 || var10.field2659 != 1400 && class29.field544) {
                                var22 = false;
                                var23 = false;
                                var21 = false;
                            }
                            if (var10.field2659 == 1337) {
                                class210.method1395((byte) 29, var10);
                                continue;
                            }
                            if (var10.field2659 == 1338) {
                                if (var21) {
                                    class211.method1406(class200.field3745 - var12, -var11 + class205.field3805, -96, var10);
                                }
                                continue;
                            }
                            if (var10.field2659 == 1400) {
                                class139.field2694 = var10;
                                if (var21) {
                                    if (class229.field4204[82] && class92.field1582 > 0) {
                                        int var25 = (int) ((double) (class205.field3805 - var10.field2638 / 2 - var11) * 2.0D / class244.field4471) + class235.field4272 + class240.field4412;
                                        int var26 = class68.field1224 + class190.field3528 - (int) ((double) (class200.field3745 - var12 + -(var10.field2509 / 2)) * 2.0D / class244.field4471) - class20.field338;
                                        class37 var27 = class80.method548(new class37[] { class119.field2130, class151.method1034((byte) -9, var25 >> 6), class218.field4065, class151.method1034((byte) -9, var26 >> 6), class218.field4065, class151.method1034((byte) -9, var25 & 0x3F), class218.field4065, class151.method1034((byte) -9, var26 & 0x3F) }, -32);
                                        var27.method321(-118);
                                        class118.method817(-91, var27);
                                        class28.method198(-7602);
                                        continue;
                                    }
                                    class29.field544 = true;
                                    class75.field1334 = class80.field1416;
                                    class160.field3031 = class235.field4271;
                                    class124.field2214 = class20.field338;
                                    class174.field3309 = class240.field4412;
                                    continue;
                                }
                                if (var22 && class29.field544) {
                                    class72.method513(128, (int) ((double) (class75.field1334 - class80.field1416) * 2.0D / class31.field632) + class174.field3309);
                                    class199.method1317((byte) -98, (int) ((double) (class160.field3031 - class235.field4271) * 2.0D / class31.field632) + class124.field2214);
                                    continue;
                                }
                                class29.field544 = false;
                                continue;
                            }
                            if (var10.field2659 == 1401) {
                                if (var22) {
                                    class190.method1267(class235.field4271 - var12, var10.field2509, class80.field1416 - var11, var10.field2638, 4096);
                                }
                                continue;
                            }
                            if (!var10.field2557 && var21) {
                                var10.field2557 = true;
                                if (var10.field2518 != null) {
                                    class51 var28 = new class51();
                                    var28.field1032 = class205.field3805 - var11;
                                    var28.field1042 = var10.field2518;
                                    var28.field1030 = true;
                                    var28.field1026 = class200.field3745 - var12;
                                    var28.field1031 = var10;
                                    class63.field1154.method1340(36, var28);
                                }
                            }
                            if (var10.field2557 && var22 && var10.field2603 != null) {
                                class51 var29 = new class51();
                                var29.field1031 = var10;
                                var29.field1032 = class80.field1416 - var11;
                                var29.field1042 = var10.field2603;
                                var29.field1026 = class235.field4271 - var12;
                                var29.field1030 = true;
                                class63.field1154.method1340(126, var29);
                            }
                            if (var10.field2557 && !var22) {
                                var10.field2557 = false;
                                if (var10.field2533 != null) {
                                    class51 var30 = new class51();
                                    var30.field1042 = var10.field2533;
                                    var30.field1030 = true;
                                    var30.field1026 = class235.field4271 - var12;
                                    var30.field1031 = var10;
                                    var30.field1032 = class80.field1416 - var11;
                                    class13.field186.method1340(103, var30);
                                }
                            }
                            if (var22 && var10.field2532 != null) {
                                class51 var31 = new class51();
                                var31.field1042 = var10.field2532;
                                var31.field1030 = true;
                                var31.field1026 = class235.field4271 - var12;
                                var31.field1031 = var10;
                                var31.field1032 = class80.field1416 - var11;
                                class63.field1154.method1340(-123, var31);
                            }
                            if (!var10.field2635 && var23) {
                                var10.field2635 = true;
                                if (var10.field2546 != null) {
                                    class51 var32 = new class51();
                                    var32.field1032 = class80.field1416 - var11;
                                    var32.field1026 = class235.field4271 - var12;
                                    var32.field1042 = var10.field2546;
                                    var32.field1030 = true;
                                    var32.field1031 = var10;
                                    class63.field1154.method1340(-98, var32);
                                }
                            }
                            if (var10.field2635 && var23 && var10.field2511 != null) {
                                class51 var33 = new class51();
                                var33.field1042 = var10.field2511;
                                var33.field1026 = class235.field4271 - var12;
                                var33.field1032 = class80.field1416 - var11;
                                var33.field1031 = var10;
                                var33.field1030 = true;
                                class63.field1154.method1340(-125, var33);
                            }
                            if (var10.field2635 && !var23) {
                                var10.field2635 = false;
                                if (var10.field2583 != null) {
                                    class51 var34 = new class51();
                                    var34.field1042 = var10.field2583;
                                    var34.field1026 = class235.field4271 - var12;
                                    var34.field1032 = class80.field1416 - var11;
                                    var34.field1031 = var10;
                                    var34.field1030 = true;
                                    class13.field186.method1340(-112, var34);
                                }
                            }
                            if (var10.field2507 != null) {
                                class51 var35 = new class51();
                                var35.field1031 = var10;
                                var35.field1042 = var10.field2507;
                                class25.field432.method1340(34, var35);
                            }
                            if (var10.field2559 != null && var10.field2549 < class158.field3000) {
                                if (var10.field2650 == null || class158.field3000 - var10.field2549 > 32) {
                                    class51 var40 = new class51();
                                    var40.field1042 = var10.field2559;
                                    var40.field1031 = var10;
                                    class63.field1154.method1340(-99, var40);
                                } else {
                                    label435: for (int var36 = var10.field2549; var36 < class158.field3000; var36++) {
                                        int var37 = class114.field2042[var36 & 0x1F];
                                        for (int var38 = 0; var38 < var10.field2650.length; var38++) {
                                            if (var10.field2650[var38] == var37) {
                                                class51 var39 = new class51();
                                                var39.field1031 = var10;
                                                var39.field1042 = var10.field2559;
                                                class63.field1154.method1340(-97, var39);
                                                break label435;
                                            }
                                        }
                                    }
                                }
                                var10.field2549 = class158.field3000;
                            }
                            if (var10.field2545 != null && class138.field2685 > var10.field2577) {
                                if (var10.field2611 == null || class138.field2685 - var10.field2577 > 32) {
                                    class51 var45 = new class51();
                                    var45.field1042 = var10.field2545;
                                    var45.field1031 = var10;
                                    class63.field1154.method1340(-102, var45);
                                } else {
                                    label411: for (int var41 = var10.field2577; var41 < class138.field2685; var41++) {
                                        int var42 = class183.field3390[var41 & 0x1F];
                                        for (int var43 = 0; var43 < var10.field2611.length; var43++) {
                                            if (var10.field2611[var43] == var42) {
                                                class51 var44 = new class51();
                                                var44.field1031 = var10;
                                                var44.field1042 = var10.field2545;
                                                class63.field1154.method1340(88, var44);
                                                break label411;
                                            }
                                        }
                                    }
                                }
                                var10.field2577 = class138.field2685;
                            }
                            if (var10.field2542 != null && var10.field2604 < class203.field3771) {
                                if (var10.field2627 == null || class203.field3771 - var10.field2604 > 32) {
                                    class51 var50 = new class51();
                                    var50.field1031 = var10;
                                    var50.field1042 = var10.field2542;
                                    class63.field1154.method1340(-126, var50);
                                } else {
                                    label387: for (int var46 = var10.field2604; var46 < class203.field3771; var46++) {
                                        int var47 = class174.field3319[var46 & 0x1F];
                                        for (int var48 = 0; var48 < var10.field2627.length; var48++) {
                                            if (var10.field2627[var48] == var47) {
                                                class51 var49 = new class51();
                                                var49.field1042 = var10.field2542;
                                                var49.field1031 = var10;
                                                class63.field1154.method1340(-110, var49);
                                                break label387;
                                            }
                                        }
                                    }
                                }
                                var10.field2604 = class203.field3771;
                            }
                            if (var10.field2553 < class222.field4123 && var10.field2575 != null) {
                                class51 var51 = new class51();
                                var51.field1031 = var10;
                                var51.field1042 = var10.field2575;
                                class63.field1154.method1340(41, var51);
                            }
                            if (var10.field2553 < class168.field3197 && var10.field2614 != null) {
                                class51 var52 = new class51();
                                var52.field1042 = var10.field2614;
                                var52.field1031 = var10;
                                class63.field1154.method1340(-113, var52);
                            }
                            if (var10.field2553 < class198.field3698 && var10.field2647 != null) {
                                class51 var53 = new class51();
                                var53.field1031 = var10;
                                var53.field1042 = var10.field2647;
                                class63.field1154.method1340(-97, var53);
                            }
                            if (class94.field1644 > var10.field2553 && var10.field2602 != null) {
                                class51 var54 = new class51();
                                var54.field1042 = var10.field2602;
                                var54.field1031 = var10;
                                class63.field1154.method1340(-116, var54);
                            }
                            if (var10.field2553 < class198.field3693 && var10.field2606 != null) {
                                class51 var55 = new class51();
                                var55.field1042 = var10.field2606;
                                var55.field1031 = var10;
                                class63.field1154.method1340(104, var55);
                            }
                            var10.field2553 = class112.field1963;
                            if (var10.field2562 != null) {
                                for (int var56 = 0; var56 < class190.field3480; var56++) {
                                    class51 var57 = new class51();
                                    var57.field1031 = var10;
                                    var57.field1029 = class51.field1033[var56];
                                    var57.field1034 = class39.field815[var56];
                                    var57.field1042 = var10.field2562;
                                    class63.field1154.method1340(74, var57);
                                }
                            }
                        }
                    }
                    if (!var10.field2527 && class56.field1073 == null && class115.field2052 == null && !class118.field2114) {
                        if ((var10.field2537 >= 0 || var10.field2616 != 0) && var14 <= class80.field1416 && class235.field4271 >= var13 && class80.field1416 < var18 && var17 > class235.field4271) {
                            if (var10.field2537 >= 0) {
                                class99.field1736 = arg4[var10.field2537];
                            } else {
                                class99.field1736 = var10;
                            }
                        }
                        if (var10.field2513 == 8 && class80.field1416 >= var14 && var13 <= class235.field4271 && var18 > class80.field1416 && class235.field4271 < var17) {
                            class212.field3964 = var10;
                        }
                        if (var10.field2509 < var10.field2598) {
                            class204.method1346(var10, false, var10.field2638 + var11, var10.field2509, class80.field1416, var12, class235.field4271, var10.field2598);
                        }
                    }
                    if (var10.field2513 == 0) {
                        method701(var10.field2608, var12 - var10.field2593, var18, var14, arg4, var17, var13, 120, var11 - var10.field2519);
                        if (var10.field2641 != null) {
                            method701(var10.field2608, var12 - var10.field2593, var18, var14, var10.field2641, var17, var13, 99, var11 - var10.field2519);
                        }
                        class201 var58 = (class201) class85.field1499.method1047((byte) -76, (long) var10.field2608);
                        if (var58 != null) {
                            class61.method459(var18, var58.field3746, var11, 100, var14, var13, var12, var17);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(III)V")
    public static final void method702(int arg0, int arg1, int arg2) {
        class18 var3 = class180.field3354[arg0][arg1][arg2];
        if (var3 != null) {
            var3.field295 = null;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILwa;ZI)Lji;")
    public static final class106 method703(int arg0, class238 arg1, boolean arg2, int arg3) {
        field1861++;
        if (!arg2) {
            method701(-64, -35, 29, 64, null, 24, -92, 108, 25);
        }
        return class192.method1278(arg1, 0, arg0, arg3) ? class208.method1376(0) : null;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZIIZIZIZ)Lji;")
    public static final class106 method704(boolean arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5, int arg6, boolean arg7) {
        field1862++;
        class125 var8 = class223.method1471(121, arg2);
        if (arg6 > 1 && var8.field2228 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (var8.field2266[var10] <= arg6 && var8.field2266[var10] != 0) {
                    var9 = var8.field2228[var10];
                }
            }
            if (var9 != -1) {
                var8 = class223.method1471(120, var9);
            }
        }
        class42 var11 = var8.method856((byte) -104);
        if (var11 == null) {
            return null;
        }
        class106 var12 = null;
        if (var8.field2285 != -1) {
            var12 = method704(false, 1, var8.field2291, true, 0, false, 10, true);
            if (var12 == null) {
                return null;
            }
        } else if (var8.field2245 != -1) {
            var12 = method704(false, arg1, var8.field2224, false, arg4, false, arg6, true);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = class48.field955;
        int var14 = class48.field958;
        int var15 = class48.field956;
        int[] var16 = new int[4];
        class48.method415(var16);
        class182 var17 = new class182(36, 32);
        class48.method400(var17.field3375, 36, 32);
        class169.method1128();
        class169.method1127(16, 16);
        int var18 = var8.field2226;
        if (arg3) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg1 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        class169.field3221 = arg5;
        int var19 = class169.field3211[var8.field2221] * var18 >> 16;
        int var20 = class169.field3220[var8.field2221] * var18 >> 16;
        var11.method20(0, var8.field2277, var8.field2227, var8.field2221, var8.field2252, var19 + var8.field2229 - var11.method5() / 2, var20 - -var8.field2229);
        if (arg1 >= 1) {
            var17.method1207(1);
        }
        if (arg1 >= 2) {
            var17.method1207(16777215);
        }
        if (arg4 != 0) {
            var17.method1223(arg4);
        }
        if (var8.field2245 != -1) {
            class182 var21 = new class182(36, 32);
            class48.method400(var21.field3375, 36, 32);
            var12.method687(0, 0);
            var17.method687(0, 0);
            var17 = var21;
            Object var22 = null;
        }
        class48.method400(var17.field3375, 36, 32);
        if (var8.field2285 != -1) {
            var12.method687(0, 0);
        }
        if (arg0 && (var8.field2225 == 1 || arg6 != 1) && arg6 != -1) {
            class119.field2126.method607(class210.method1396(arg6, -19978), 0, 9, 16776960, 1);
        }
        class48.method400(var13, var15, var14);
        class48.method416(var16);
        class169.method1128();
        class169.field3221 = true;
        return var17;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V")
    public static void method705(int arg0) {
        field1856 = null;
        field1858 = null;
        field1877 = null;
        field1872 = null;
        field1873 = null;
        field1874 = null;
        field1857 = null;
        field1869 = null;
        if (arg0 >= -55) {
            field1876 = 78;
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field1873[var0] = var1;
        }
    }
}
