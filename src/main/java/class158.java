import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class158 {

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    public static int field2849 = 0;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "I")
    public static int field2851 = 0;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "Lqc;")
    public static class245 field2852 = new class245(4);

    @OriginalMember(owner = "client!si", name = "g", descriptor = "Z")
    public static boolean field2855 = true;

    @OriginalMember(owner = "client!si", name = "h", descriptor = "Lr;")
    public static class66 field2856 = class93.method641(43, "Weiter");

    @OriginalMember(owner = "client!si", name = "f", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "Lha;")
    public static class63 field2850;

    @OriginalMember(owner = "client!si", name = "i", descriptor = "Ljava/awt/Frame;")
    public static Frame field2857;

    @OriginalMember(owner = "client!si", name = "e", descriptor = "[Ljb;")
    public static class256[] field2853;

    @OriginalMember(owner = "client!si", name = "j", descriptor = "[[[Laa;")
    public static class16[][][] field2858;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Laa;Z)V")
    public static final void method1079(class16 arg0, boolean arg1) {
        class145.field2650.method866(arg0, true);
        while (true) {
            class16 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class16[][] var7;
            class16 var66;
            do {
                class16 var65;
                do {
                    class16 var64;
                    do {
                        class16 var63;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class16) class145.field2650.method874(-115);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field218);
                                            var3 = var2.field211;
                                            var4 = var2.field230;
                                            var5 = var2.field215;
                                            var6 = var2.field213;
                                            var7 = class110.field2124[var5];
                                            if (!var2.field217) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class16 var8 = class110.field2124[var5 - 1][var3][var4];
                                                    if (var8 != null && var8.field218) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class256.field4504 && var3 > class44.field776) {
                                                    class16 var9 = var7[var3 - 1][var4];
                                                    if (var9 != null && var9.field218 && (var9.field217 || (var2.field216 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class256.field4504 && var3 < class98.field1920 - 1) {
                                                    class16 var10 = var7[var3 + 1][var4];
                                                    if (var10 != null && var10.field218 && (var10.field217 || (var2.field216 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class254.field4452 && var4 > class192.field3329) {
                                                    class16 var11 = var7[var3][var4 - 1];
                                                    if (var11 != null && var11.field218 && (var11.field217 || (var2.field216 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class254.field4452 && var4 < class64.field1271 - 1) {
                                                    class16 var12 = var7[var3][var4 + 1];
                                                    if (var12 != null && var12.field218 && (var12.field217 || (var2.field216 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field217 = false;
                                            if (var2.field228 != null) {
                                                class16 var13 = var2.field228;
                                                if (var13.field206 == null) {
                                                    if (var13.field227 != null) {
                                                        if (class28.method158(0, var3, var4)) {
                                                            class8.method36(var13.field227, class160.field2875, class218.field3752, class167.field3001, class125.field2370, var3, var4, true);
                                                        } else {
                                                            class8.method36(var13.field227, class160.field2875, class218.field3752, class167.field3001, class125.field2370, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class28.method158(0, var3, var4)) {
                                                    class82.method563(var13.field206, 0, class160.field2875, class218.field3752, class167.field3001, class125.field2370, var3, var4, true);
                                                } else {
                                                    class82.method563(var13.field206, 0, class160.field2875, class218.field3752, class167.field3001, class125.field2370, var3, var4, false);
                                                }
                                                class47 var14 = var13.field205;
                                                if (var14 != null) {
                                                    var14.field849.method25(0, class160.field2875, class218.field3752, class167.field3001, class125.field2370, var14.field851 - class171.field3036, var14.field854 - class142.field2603, var14.field844 - class30.field455, var14.field853);
                                                }
                                                for (int var15 = 0; var15 < var13.field219; var15++) {
                                                    class44 var16 = var13.field220[var15];
                                                    if (var16 != null) {
                                                        var16.field779.method25(var16.field792, class160.field2875, class218.field3752, class167.field3001, class125.field2370, var16.field799 - class171.field3036, var16.field789 - class142.field2603, var16.field787 - class30.field455, var16.field780);
                                                    }
                                                }
                                            }
                                            boolean var17 = false;
                                            if (var2.field206 == null) {
                                                if (var2.field227 != null) {
                                                    if (class28.method158(var6, var3, var4)) {
                                                        class8.method36(var2.field227, class160.field2875, class218.field3752, class167.field3001, class125.field2370, var3, var4, true);
                                                    } else {
                                                        var17 = true;
                                                        class8.method36(var2.field227, class160.field2875, class218.field3752, class167.field3001, class125.field2370, var3, var4, false);
                                                    }
                                                }
                                            } else if (class28.method158(var6, var3, var4)) {
                                                class82.method563(var2.field206, var6, class160.field2875, class218.field3752, class167.field3001, class125.field2370, var3, var4, true);
                                            } else {
                                                var17 = true;
                                                if (var2.field206.field2906 != 12345678 || class249.field4374 && var5 <= class26.field331) {
                                                    class82.method563(var2.field206, var6, class160.field2875, class218.field3752, class167.field3001, class125.field2370, var3, var4, false);
                                                }
                                            }
                                            if (var17) {
                                                class90 var18 = var2.field225;
                                                if (var18 != null && (var18.field1746 & 0x80000000L) != 0L) {
                                                    var18.field1734.method25(0, class160.field2875, class218.field3752, class167.field3001, class125.field2370, var18.field1744 - class171.field3036, var18.field1740 - class142.field2603, var18.field1735 - class30.field455, var18.field1746);
                                                }
                                            }
                                            int var19 = 0;
                                            int var20 = 0;
                                            class47 var21 = var2.field205;
                                            class127 var22 = var2.field212;
                                            if (var21 != null || var22 != null) {
                                                if (class256.field4504 == var3) {
                                                    var19++;
                                                } else if (class256.field4504 < var3) {
                                                    var19 += 2;
                                                }
                                                if (class254.field4452 == var4) {
                                                    var19 += 3;
                                                } else if (class254.field4452 > var4) {
                                                    var19 += 6;
                                                }
                                                var20 = class44.field794[var19];
                                                var2.field221 = class83.field1621[var19];
                                            }
                                            if (var21 != null) {
                                                if ((var21.field855 & class27.field351[var19]) == 0) {
                                                    var2.field226 = 0;
                                                } else if (var21.field855 == 16) {
                                                    var2.field226 = 3;
                                                    var2.field222 = class111.field2133[var19];
                                                    var2.field224 = 3 - var2.field222;
                                                } else if (var21.field855 == 32) {
                                                    var2.field226 = 6;
                                                    var2.field222 = class251.field4422[var19];
                                                    var2.field224 = 6 - var2.field222;
                                                } else if (var21.field855 == 64) {
                                                    var2.field226 = 12;
                                                    var2.field222 = class251.field4421[var19];
                                                    var2.field224 = 12 - var2.field222;
                                                } else {
                                                    var2.field226 = 9;
                                                    var2.field222 = class99.field1951[var19];
                                                    var2.field224 = 9 - var2.field222;
                                                }
                                                if ((var21.field855 & var20) != 0 && !class69.method505(var6, var3, var4, var21.field855)) {
                                                    var21.field849.method25(0, class160.field2875, class218.field3752, class167.field3001, class125.field2370, var21.field851 - class171.field3036, var21.field854 - class142.field2603, var21.field844 - class30.field455, var21.field853);
                                                }
                                                if ((var21.field845 & var20) != 0 && !class69.method505(var6, var3, var4, var21.field845)) {
                                                    var21.field852.method25(0, class160.field2875, class218.field3752, class167.field3001, class125.field2370, var21.field851 - class171.field3036, var21.field854 - class142.field2603, var21.field844 - class30.field455, var21.field853);
                                                }
                                            }
                                            if (var22 != null && !class8.method35(var6, var3, var4, var22.field2384.method28())) {
                                                if ((var22.field2388 & var20) != 0) {
                                                    var22.field2384.method25(0, class160.field2875, class218.field3752, class167.field3001, class125.field2370, var22.field2375 + var22.field2382 - class171.field3036, var22.field2387 - class142.field2603, var22.field2378 + var22.field2389 - class30.field455, var22.field2390);
                                                } else if (var22.field2388 == 256) {
                                                    int var23 = var22.field2375 - class171.field3036;
                                                    int var24 = var22.field2387 - class142.field2603;
                                                    int var25 = var22.field2378 - class30.field455;
                                                    int var26 = var22.field2385;
                                                    int var27;
                                                    if (var26 == 1 || var26 == 2) {
                                                        var27 = -var23;
                                                    } else {
                                                        var27 = var23;
                                                    }
                                                    int var28;
                                                    if (var26 == 2 || var26 == 3) {
                                                        var28 = -var25;
                                                    } else {
                                                        var28 = var25;
                                                    }
                                                    if (var28 < var27) {
                                                        var22.field2384.method25(0, class160.field2875, class218.field3752, class167.field3001, class125.field2370, var22.field2382 + var23, var24, var22.field2389 + var25, var22.field2390);
                                                    } else if (var22.field2386 != null) {
                                                        var22.field2386.method25(0, class160.field2875, class218.field3752, class167.field3001, class125.field2370, var23, var24, var25, var22.field2390);
                                                    }
                                                }
                                            }
                                            if (var17) {
                                                class90 var29 = var2.field225;
                                                if (var29 != null && (var29.field1746 & 0x80000000L) == 0L) {
                                                    var29.field1734.method25(0, class160.field2875, class218.field3752, class167.field3001, class125.field2370, var29.field1744 - class171.field3036, var29.field1740 - class142.field2603, var29.field1735 - class30.field455, var29.field1746);
                                                }
                                                class140 var30 = var2.field207;
                                                if (var30 != null && var30.field2584 == 0) {
                                                    if (var30.field2588 != null) {
                                                        var30.field2588.method25(0, class160.field2875, class218.field3752, class167.field3001, class125.field2370, var30.field2589 - class171.field3036, var30.field2600 - class142.field2603, var30.field2590 - class30.field455, var30.field2586);
                                                    }
                                                    if (var30.field2593 != null) {
                                                        var30.field2593.method25(0, class160.field2875, class218.field3752, class167.field3001, class125.field2370, var30.field2589 - class171.field3036, var30.field2600 - class142.field2603, var30.field2590 - class30.field455, var30.field2586);
                                                    }
                                                    if (var30.field2598 != null) {
                                                        var30.field2598.method25(0, class160.field2875, class218.field3752, class167.field3001, class125.field2370, var30.field2589 - class171.field3036, var30.field2600 - class142.field2603, var30.field2590 - class30.field455, var30.field2586);
                                                    }
                                                }
                                            }
                                            int var31 = var2.field216;
                                            if (var31 != 0) {
                                                if (var3 < class256.field4504 && (var31 & 0x4) != 0) {
                                                    class16 var32 = var7[var3 + 1][var4];
                                                    if (var32 != null && var32.field218) {
                                                        class145.field2650.method866(var32, true);
                                                    }
                                                }
                                                if (var4 < class254.field4452 && (var31 & 0x2) != 0) {
                                                    class16 var33 = var7[var3][var4 + 1];
                                                    if (var33 != null && var33.field218) {
                                                        class145.field2650.method866(var33, true);
                                                    }
                                                }
                                                if (var3 > class256.field4504 && (var31 & 0x1) != 0) {
                                                    class16 var34 = var7[var3 - 1][var4];
                                                    if (var34 != null && var34.field218) {
                                                        class145.field2650.method866(var34, true);
                                                    }
                                                }
                                                if (var4 > class254.field4452 && (var31 & 0x8) != 0) {
                                                    class16 var35 = var7[var3][var4 - 1];
                                                    if (var35 != null && var35.field218) {
                                                        class145.field2650.method866(var35, true);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field226 != 0) {
                                            boolean var36 = true;
                                            for (int var37 = 0; var37 < var2.field219; var37++) {
                                                if (class16.field204 != var2.field220[var37].field797 && (var2.field214[var37] & var2.field226) == var2.field222) {
                                                    var36 = false;
                                                    break;
                                                }
                                            }
                                            if (var36) {
                                                class47 var38 = var2.field205;
                                                if (!class69.method505(var6, var3, var4, var38.field855)) {
                                                    var38.field849.method25(0, class160.field2875, class218.field3752, class167.field3001, class125.field2370, var38.field851 - class171.field3036, var38.field854 - class142.field2603, var38.field844 - class30.field455, var38.field853);
                                                }
                                                var2.field226 = 0;
                                            }
                                        }
                                        if (!var2.field229) {
                                            break;
                                        }
                                        try {
                                            int var39 = var2.field219;
                                            var2.field229 = false;
                                            int var40 = 0;
                                            label572: for (int var41 = 0; var41 < var39; var41++) {
                                                class44 var42 = var2.field220[var41];
                                                if (class16.field204 != var42.field797) {
                                                    for (int var43 = var42.field791; var43 <= var42.field775; var43++) {
                                                        for (int var44 = var42.field790; var44 <= var42.field771; var44++) {
                                                            class16 var45 = var7[var43][var44];
                                                            if (var45.field217) {
                                                                var2.field229 = true;
                                                                continue label572;
                                                            }
                                                            if (var45.field226 != 0) {
                                                                int var46 = 0;
                                                                if (var43 > var42.field791) {
                                                                    var46++;
                                                                }
                                                                if (var43 < var42.field775) {
                                                                    var46 += 4;
                                                                }
                                                                if (var44 > var42.field790) {
                                                                    var46 += 8;
                                                                }
                                                                if (var44 < var42.field771) {
                                                                    var46 += 2;
                                                                }
                                                                if ((var46 & var45.field226) == var2.field224) {
                                                                    var2.field229 = true;
                                                                    continue label572;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class119.field2265[var40++] = var42;
                                                    int var47 = class256.field4504 - var42.field791;
                                                    int var48 = var42.field775 - class256.field4504;
                                                    if (var48 > var47) {
                                                        var47 = var48;
                                                    }
                                                    int var49 = class254.field4452 - var42.field790;
                                                    int var50 = var42.field771 - class254.field4452;
                                                    if (var50 > var49) {
                                                        var42.field793 = var47 + var50;
                                                    } else {
                                                        var42.field793 = var47 + var49;
                                                    }
                                                }
                                            }
                                            while (var40 > 0) {
                                                int var51 = -50;
                                                int var52 = -1;
                                                for (int var53 = 0; var53 < var40; var53++) {
                                                    class44 var54 = class119.field2265[var53];
                                                    if (class16.field204 != var54.field797) {
                                                        if (var54.field793 > var51) {
                                                            var51 = var54.field793;
                                                            var52 = var53;
                                                        } else if (var54.field793 == var51) {
                                                            int var55 = var54.field799 - class171.field3036;
                                                            int var56 = var54.field787 - class30.field455;
                                                            int var57 = class119.field2265[var52].field799 - class171.field3036;
                                                            int var58 = class119.field2265[var52].field787 - class30.field455;
                                                            if (var55 * var55 + var56 * var56 > var57 * var57 + var58 * var58) {
                                                                var52 = var53;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var52 == -1) {
                                                    break;
                                                }
                                                class44 var59 = class119.field2265[var52];
                                                var59.field797 = class16.field204;
                                                if (!class150.method1018(var6, var59.field791, var59.field775, var59.field790, var59.field771, var59.field779.method28())) {
                                                    var59.field779.method25(var59.field792, class160.field2875, class218.field3752, class167.field3001, class125.field2370, var59.field799 - class171.field3036, var59.field789 - class142.field2603, var59.field787 - class30.field455, var59.field780);
                                                }
                                                for (int var60 = var59.field791; var60 <= var59.field775; var60++) {
                                                    for (int var61 = var59.field790; var61 <= var59.field771; var61++) {
                                                        class16 var62 = var7[var60][var61];
                                                        if (var62.field226 != 0) {
                                                            class145.field2650.method866(var62, true);
                                                        } else if ((var3 != var60 || var4 != var61) && var62.field218) {
                                                            class145.field2650.method866(var62, true);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field229) {
                                                break;
                                            }
                                        } catch (Exception var81) {
                                            var2.field229 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field218);
                            } while (var2.field226 != 0);
                            if (var3 > class256.field4504 || var3 <= class44.field776) {
                                break;
                            }
                            var63 = var7[var3 - 1][var4];
                        } while (var63 != null && var63.field218);
                        if (var3 < class256.field4504 || var3 >= class98.field1920 - 1) {
                            break;
                        }
                        var64 = var7[var3 + 1][var4];
                    } while (var64 != null && var64.field218);
                    if (var4 > class254.field4452 || var4 <= class192.field3329) {
                        break;
                    }
                    var65 = var7[var3][var4 - 1];
                } while (var65 != null && var65.field218);
                if (var4 < class254.field4452 || var4 >= class64.field1271 - 1) {
                    break;
                }
                var66 = var7[var3][var4 + 1];
            } while (var66 != null && var66.field218);
            var2.field218 = false;
            class96.field1858--;
            class140 var67 = var2.field207;
            if (var67 != null && var67.field2584 != 0) {
                if (var67.field2588 != null) {
                    var67.field2588.method25(0, class160.field2875, class218.field3752, class167.field3001, class125.field2370, var67.field2589 - class171.field3036, var67.field2600 - class142.field2603 - var67.field2584, var67.field2590 - class30.field455, var67.field2586);
                }
                if (var67.field2593 != null) {
                    var67.field2593.method25(0, class160.field2875, class218.field3752, class167.field3001, class125.field2370, var67.field2589 - class171.field3036, var67.field2600 - class142.field2603 - var67.field2584, var67.field2590 - class30.field455, var67.field2586);
                }
                if (var67.field2598 != null) {
                    var67.field2598.method25(0, class160.field2875, class218.field3752, class167.field3001, class125.field2370, var67.field2589 - class171.field3036, var67.field2600 - class142.field2603 - var67.field2584, var67.field2590 - class30.field455, var67.field2586);
                }
            }
            if (var2.field221 != 0) {
                class127 var68 = var2.field212;
                if (var68 != null && !class8.method35(var6, var3, var4, var68.field2384.method28())) {
                    if ((var68.field2388 & var2.field221) != 0) {
                        var68.field2384.method25(0, class160.field2875, class218.field3752, class167.field3001, class125.field2370, var68.field2375 + var68.field2382 - class171.field3036, var68.field2387 - class142.field2603, var68.field2378 + var68.field2389 - class30.field455, var68.field2390);
                    } else if (var68.field2388 == 256) {
                        int var69 = var68.field2375 - class171.field3036;
                        int var70 = var68.field2387 - class142.field2603;
                        int var71 = var68.field2378 - class30.field455;
                        int var72 = var68.field2385;
                        int var73;
                        if (var72 == 1 || var72 == 2) {
                            var73 = -var69;
                        } else {
                            var73 = var69;
                        }
                        int var74;
                        if (var72 == 2 || var72 == 3) {
                            var74 = -var71;
                        } else {
                            var74 = var71;
                        }
                        if (var74 >= var73) {
                            var68.field2384.method25(0, class160.field2875, class218.field3752, class167.field3001, class125.field2370, var68.field2382 + var69, var70, var68.field2389 + var71, var68.field2390);
                        } else if (var68.field2386 != null) {
                            var68.field2386.method25(0, class160.field2875, class218.field3752, class167.field3001, class125.field2370, var69, var70, var71, var68.field2390);
                        }
                    }
                }
                class47 var75 = var2.field205;
                if (var75 != null) {
                    if ((var75.field845 & var2.field221) != 0 && !class69.method505(var6, var3, var4, var75.field845)) {
                        var75.field852.method25(0, class160.field2875, class218.field3752, class167.field3001, class125.field2370, var75.field851 - class171.field3036, var75.field854 - class142.field2603, var75.field844 - class30.field455, var75.field853);
                    }
                    if ((var75.field855 & var2.field221) != 0 && !class69.method505(var6, var3, var4, var75.field855)) {
                        var75.field849.method25(0, class160.field2875, class218.field3752, class167.field3001, class125.field2370, var75.field851 - class171.field3036, var75.field854 - class142.field2603, var75.field844 - class30.field455, var75.field853);
                    }
                }
            }
            if (var5 < class131.field2449 - 1) {
                class16 var76 = class110.field2124[var5 + 1][var3][var4];
                if (var76 != null && var76.field218) {
                    class145.field2650.method866(var76, true);
                }
            }
            if (var3 < class256.field4504) {
                class16 var77 = var7[var3 + 1][var4];
                if (var77 != null && var77.field218) {
                    class145.field2650.method866(var77, true);
                }
            }
            if (var4 < class254.field4452) {
                class16 var78 = var7[var3][var4 + 1];
                if (var78 != null && var78.field218) {
                    class145.field2650.method866(var78, true);
                }
            }
            if (var3 > class256.field4504) {
                class16 var79 = var7[var3 - 1][var4];
                if (var79 != null && var79.field218) {
                    class145.field2650.method866(var79, true);
                }
            }
            if (var4 > class254.field4452) {
                class16 var80 = var7[var3][var4 - 1];
                if (var80 != null && var80.field218) {
                    class145.field2650.method866(var80, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V")
    public static void method1080(int arg0) {
        field2853 = null;
        field2858 = null;
        field2852 = null;
        field2850 = null;
        if (arg0 != 29889) {
            field2854 = 69;
        }
        field2856 = null;
        field2857 = null;
    }
}
