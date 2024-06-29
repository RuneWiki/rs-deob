import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class63 {

    @OriginalMember(owner = "client!r", name = "d", descriptor = "I")
    public static int field844 = 0;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "[[B")
    public static byte[][] field845 = new byte[1000][];

    @OriginalMember(owner = "client!r", name = "f", descriptor = "I")
    public static int field846 = 0;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "Ljava/lang/String;")
    public static String field843 = "yellow:";

    @OriginalMember(owner = "client!r", name = "a", descriptor = "I")
    public static int field841;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!r", name = "h", descriptor = "I")
    public static int field848;

    @OriginalMember(owner = "client!r", name = "i", descriptor = "I")
    public static int field849;

    @OriginalMember(owner = "client!r", name = "j", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!r", name = "l", descriptor = "I")
    public static int field852;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "[Z")
    public static boolean[] field842;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V")
    public static void method437(int arg0) {
        if (arg0 != -32635) {
            method438(-64);
        }
        field845 = null;
        field842 = null;
        field843 = null;
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(I)Lnj;")
    public static final class228 method438(int arg0) {
        field847++;
        class228 var1 = new class228(37);
        var1.method1346(14, 32767);
        var1.method1346(class416.field6106, 32767);
        var1.method1346(class265.field3845 ? 1 : 0, 32767);
        var1.method1346(class93.field1342 ? 1 : 0, 32767);
        var1.method1346(class42.field584 ? 1 : 0, 32767);
        var1.method1346(class411.field6069 ? 1 : 0, arg0 ^ 0xFF007FFF);
        var1.method1346(0, 32767);
        var1.method1346(class166.field2240 ? 1 : 0, 32767);
        if (arg0 != -16777216) {
            field846 = 40;
        }
        var1.method1346(class431.field6338 ? 1 : 0, 32767);
        var1.method1346(class120.field1678 ? 1 : 0, 32767);
        var1.method1346(class423.field6238, 32767);
        var1.method1346(class211.field2801 ? 1 : 0, 32767);
        var1.method1346(class213.field2853 ? 1 : 0, arg0 + 16809983);
        var1.method1346(class339.field4891 ? 1 : 0, 32767);
        var1.method1346(class286.field4145, arg0 + 16809983);
        var1.method1346(class299.field4384 ? 1 : 0, 32767);
        var1.method1346(class359.field5186, 32767);
        var1.method1346(class400.field5969, arg0 ^ 0xFF007FFF);
        var1.method1346(class156.field2123, arg0 ^ 0xFF007FFF);
        var1.method1326(class406.field6030, -86);
        var1.method1326(class122.field1692, 75);
        var1.method1346(class248.method1498((byte) 25), 32767);
        var1.method1330(class71.field1022, 71);
        var1.method1346(class11.field171, 32767);
        var1.method1346(class275.field3987 ? 1 : 0, 32767);
        var1.method1346(class184.field2496 ? 1 : 0, arg0 + 16809983);
        var1.method1346(class365.field5288, arg0 ^ 0xFF007FFF);
        var1.method1346(class324.field4753 ? 1 : 0, arg0 ^ 0xFF007FFF);
        var1.method1346(class434.field6387 ? 1 : 0, 32767);
        var1.method1346(class416.field6114, 32767);
        var1.method1346(class275.field3984 ? 1 : 0, 32767);
        var1.method1346(class196.field2622, arg0 + 16809983);
        return var1;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIII)V")
    public static final void method439(int arg0, int arg1, int arg2, int arg3) {
        class103.field1430 = new byte[arg0][arg2][arg1];
        field852++;
        if (arg3 != -10) {
            method438(-107);
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIII[Lps;IIIII)V")
    public static final void method440(int arg0, int arg1, int arg2, int arg3, class394[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg1 <= 42) {
            field848 = 89;
        }
        field841++;
        class61.field807.method1767(arg6, arg0, arg7, arg8);
        for (int var10 = 0; var10 < arg4.length; var10++) {
            class394 var11 = arg4[var10];
            if (var11 != null && (var11.field5639 == arg9 || arg9 == -1412584499 && class16.field224 == var11)) {
                int var12;
                if (arg3 == -1) {
                    class229.field3062[class1.field13].setBounds(var11.field5821 + arg2, var11.field5779 - -arg5, var11.field5773, var11.field5672);
                    var12 = class1.field13++;
                } else {
                    var12 = arg3;
                }
                var11.field5759 = var12;
                var11.field5754 = class28.field418;
                if (!var11.field5790 || !client.method1546(var11)) {
                    if (var11.field5654 > 0) {
                        class308.method2097((byte) 89, var11);
                    }
                    int var13 = var11.field5821 + arg2;
                    int var14 = var11.field5779 + arg5;
                    int var15 = var11.field5705;
                    if (class62.field818 && (client.method1544(var11).field4475 != 0 || var11.field5671 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class16.field224 == var11) {
                        if (arg9 != -1412584499 && !var11.field5819) {
                            class397.field5910 = arg2;
                            class173.field2310 = arg5;
                            class377.field5488 = arg4;
                            continue;
                        }
                        if (class376.field5486 && class218.field2881) {
                            int var16 = class124.field1728;
                            int var17 = class323.field4747;
                            int var18 = var16 - class218.field2886;
                            int var19 = var17 - class252.field3471;
                            if (class71.field996 > var18) {
                                var18 = class71.field996;
                            }
                            if ((class71.field996 + class179.field2370.field5773) < (var11.field5773 + var18)) {
                                var18 = class71.field996 + class179.field2370.field5773 - var11.field5773;
                            }
                            if (class302.field4446 > var19) {
                                var19 = class302.field4446;
                            }
                            if (var11.field5672 + var19 > class302.field4446 + class179.field2370.field5672) {
                                var19 = class179.field2370.field5672 + class302.field4446 - var11.field5672;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var11.field5819) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var11.field5671 == 2) {
                        var20 = arg0;
                        var21 = arg8;
                        var22 = arg6;
                        var23 = arg7;
                    } else {
                        int var24 = var11.field5773 + var13;
                        int var25 = var11.field5672 + var14;
                        var22 = var13 > arg6 ? var13 : arg6;
                        var20 = arg0 < var14 ? var14 : arg0;
                        if (var11.field5671 == 9) {
                            var24++;
                            var25++;
                        }
                        var21 = arg8 > var25 ? var25 : arg8;
                        var23 = var24 >= arg7 ? arg7 : var24;
                    }
                    if (!var11.field5790 || var23 > var22 && var20 < var21) {
                        if (var11.field5654 != 0) {
                            if (var11.field5654 == 1337 || var11.field5654 == 1403) {
                                class48.method348(var11.field5773, var11.field5672, (byte) 113, var13, var11.field5654 == 1403, var14);
                                class270.field3927[var12] = true;
                                class61.field807.method1767(arg6, arg0, arg7, arg8);
                                continue;
                            }
                            if (var11.field5654 == 1338) {
                                if (var11.method2525((byte) 42, class61.field807) != null) {
                                    class281.method1935(112);
                                    class451.method2822(var13, class61.field807, var11, var14, 20910);
                                    class57.field775[var12] = true;
                                    class61.field807.method1767(arg6, arg0, arg7, arg8);
                                }
                                continue;
                            }
                            if (var11.field5654 == 1339) {
                                if (var11.method2525((byte) 42, class61.field807) != null) {
                                    class250.method1518(-28215, var13, var14, var11);
                                    class57.field775[var12] = true;
                                    class61.field807.method1767(arg6, arg0, arg7, arg8);
                                }
                                continue;
                            }
                            if (var11.field5654 == 1400) {
                                class153.method960(var11.field5672, class61.field807, var11.field5773, class328.field4780, var14, var13, true);
                                class270.field3927[var12] = true;
                                class61.field807.method1767(arg6, arg0, arg7, arg8);
                                continue;
                            }
                            if (var11.field5654 == 1401) {
                                class249.method1501(var13, (byte) -82, var11.field5773, class61.field807, var11.field5672, var14);
                                class270.field3927[var12] = true;
                                class61.field807.method1767(arg6, arg0, arg7, arg8);
                                continue;
                            }
                            if (var11.field5654 == 1405) {
                                if (!class196.field2625 && !class365.field5285) {
                                    continue;
                                }
                                int var26 = var11.field5773 + var13;
                                int var27 = var14 + 15;
                                if (class196.field2625) {
                                    class393.field5626.method1876("Fps:" + class398.field5939, var26, -256, var27, -1, 24412);
                                    var27 += 15;
                                    Runtime var28 = Runtime.getRuntime();
                                    int var29 = (int) ((var28.totalMemory() - var28.freeMemory()) / 1024L);
                                    int var30 = -256;
                                    if (var29 > 65536) {
                                        var30 = -65536;
                                    }
                                    class393.field5626.method1876("Mem:" + var29 + "k", var26, var30, var27, -1, 24412);
                                    var27 += 15;
                                    int var31 = class61.field807.method1779() / 1024;
                                    class393.field5626.method1876("Offheap:" + var31 + "k", var26, var31 > 65536 ? -65536 : -256, var27, -1, 24412);
                                    var27 += 15;
                                    int var32 = 0;
                                    int var33 = 0;
                                    int var34 = 0;
                                    for (int var35 = 0; var35 < 29; var35++) {
                                        var32 += class87.field1229[var35].method2152(true);
                                        var33 += class87.field1229[var35].method2155(0);
                                        var34 += class87.field1229[var35].method2159(0);
                                    }
                                    int var36 = var34 * 100 / var32;
                                    int var37 = var33 * 10000 / var32;
                                    String var38 = "Cache:" + class237.method1418(0, true, true, 2, (long) var37) + "% (" + var36 + "%)";
                                    class294.field4209.method1876(var38, var26, -256, var27, -1, 24412);
                                    var27 += 12;
                                }
                                if (class21.field282 > 0) {
                                    class294.field4209.method1876("Particles: " + class430.field6329 + " / " + class21.field282, var26, -256, var27, -1, 24412);
                                }
                                var27 += 12;
                                if (class365.field5285) {
                                    class294.field4209.method1876("Polys: " + class61.field807.method1787() + " Models: " + class61.field807.method1678(), var26, -256, var27, -1, 24412);
                                    var27 += 12;
                                    class294.field4209.method1876("Ls: " + class386.field5593 + " La: " + class398.field5921 + " NPC: " + class294.field4216 + " Pl: " + class31.field449, var26, -256, var27, -1, 24412);
                                    var27 += 12;
                                    class25.method180(-4339);
                                }
                                class270.field3927[var12] = true;
                                continue;
                            }
                        }
                        if (var11.field5671 == 0) {
                            if (!var11.field5790 && client.method1546(var11) && class96.field1358 != var11) {
                                continue;
                            }
                            if (!var11.field5790) {
                                if ((var11.field5771 - var11.field5672) < var11.field5764) {
                                    var11.field5764 = var11.field5771 - var11.field5672;
                                }
                                if (var11.field5764 < 0) {
                                    var11.field5764 = 0;
                                }
                            }
                            if (var11.field5654 == 1407 && class61.field807.method1717()) {
                                class61.field807.method1732(var13, var14, var11.field5773, var11.field5672);
                            }
                            method440(var20, 77, var13 - var11.field5742, var12, arg4, var14 - var11.field5764, var22, var23, var21, var11.field5698);
                            if (var11.field5820 != null) {
                                method440(var20, 92, var13 - var11.field5742, var12, var11.field5820, var14 - var11.field5764, var22, var23, var21, var11.field5698);
                            }
                            class169 var39 = (class169) class99.field1377.method384((long) var11.field5698, true);
                            if (var39 != null) {
                                class34.method226(var12, var23, var20, var22, var14, var39.field2275, 54, var13, var21);
                            }
                            if (var11.field5654 == 1407 && class61.field807.method1717()) {
                                class61.field807.method1757();
                                class28.field410 = true;
                            }
                            class61.field807.method1767(arg6, arg0, arg7, arg8);
                        }
                        if (class140.field1920[var12] || class202.field2720 > 1) {
                            if (var11.field5671 == 0 && !var11.field5790 && var11.field5771 > var11.field5672) {
                                class59.method416(var11.field5672, var11.field5773 + var13, var11.field5764, var14, -100, var11.field5771);
                            }
                            if (var11.field5671 != 1) {
                                if (var11.field5671 == 2) {
                                    int var40 = 0;
                                    for (int var41 = 0; var41 < var11.field5670; var41++) {
                                        for (int var42 = 0; var42 < var11.field5813; var42++) {
                                            int var43 = var13 + ((var11.field5636 + 32) * var42);
                                            int var44 = var14 + ((var11.field5751 + 32) * var41);
                                            if (var40 < 20) {
                                                var43 += var11.field5803[var40];
                                                var44 += var11.field5662[var40];
                                            }
                                            if (var11.field5777[var40] > 0) {
                                                boolean var46 = false;
                                                boolean var47 = false;
                                                int var48 = var11.field5777[var40] - 1;
                                                if (arg6 < var43 + 32 && arg7 > var43 && var44 + 32 > arg0 && var44 < arg8 || class192.field2570 == var11 && class43.field607 == var40) {
                                                    class67 var49;
                                                    if (field844 == 1 && class215.field2863 == var40 && class377.field5495 == var11.field5698) {
                                                        var49 = class244.method1464(var48, (byte) -112, var11.field5776[var40], class61.field807, 0, (class296) null, 2, var11.field5640);
                                                    } else {
                                                        var49 = class244.method1464(var48, (byte) -91, var11.field5776[var40], class61.field807, -13623264, (class296) null, 1, var11.field5640);
                                                    }
                                                    if (var49 == null) {
                                                        class407.method2621(var11, 15);
                                                    } else if (class192.field2570 == var11 && class43.field607 == var40) {
                                                        int var50 = class124.field1728 - class279.field4058;
                                                        int var51 = class323.field4747 - class298.field4288;
                                                        if (var50 < 5 && var50 > -5) {
                                                            var50 = 0;
                                                        }
                                                        if (var51 < 5 && var51 > -5) {
                                                            var51 = 0;
                                                        }
                                                        if (class97.field1359 < 5) {
                                                            var50 = 0;
                                                            var51 = 0;
                                                        }
                                                        var49.method407(var43 + var50, var44 + var51, 0, -2013265920, 1);
                                                        if (arg9 != -1) {
                                                            class394 var52 = arg4[arg9 & 0xFFFF];
                                                            int[] var53 = new int[4];
                                                            class61.field807.method1676(var53);
                                                            int var54 = var53[1];
                                                            int var55 = var53[3];
                                                            if (var54 > (var44 + var51) && var52.field5764 > 0) {
                                                                int var56 = (var54 - var51 - var44) * class379.field5514 / 3;
                                                                if (var56 > class379.field5514 * 10) {
                                                                    var56 = class379.field5514 * 10;
                                                                }
                                                                if (var56 > var52.field5764) {
                                                                    var56 = var52.field5764;
                                                                }
                                                                class298.field4288 += var56;
                                                                var52.field5764 -= var56;
                                                                class407.method2621(var52, 15);
                                                            }
                                                            if (var55 < (var44 + var51 + 32) && var52.field5771 - var52.field5672 > var52.field5764) {
                                                                int var57 = (var44 + var51 + 32 - var55) * class379.field5514 / 3;
                                                                if (var57 > (class379.field5514 * 10)) {
                                                                    var57 = class379.field5514 * 10;
                                                                }
                                                                if (var52.field5771 - var52.field5672 - var52.field5764 < var57) {
                                                                    var57 = var52.field5771 - (var52.field5672 + var52.field5764);
                                                                }
                                                                var52.field5764 += var57;
                                                                class298.field4288 -= var57;
                                                                class407.method2621(var52, 15);
                                                            }
                                                        }
                                                    } else if (class318.field4648 == var11 && class298.field4274 == var40) {
                                                        var49.method407(var43, var44, 0, -2013265920, 1);
                                                    } else {
                                                        var49.method454(var43, var44);
                                                    }
                                                }
                                            } else if (var11.field5823 != null && var40 < 20) {
                                                class67 var45 = var11.method2535(var40, (byte) 3, class61.field807);
                                                if (var45 != null) {
                                                    var45.method454(var43, var44);
                                                } else if (class347.field5001) {
                                                    class407.method2621(var11, 15);
                                                }
                                            }
                                            var40++;
                                        }
                                    }
                                } else if (var11.field5671 == 3) {
                                    int var58;
                                    if (class188.method1132((byte) -34, var11)) {
                                        var58 = var11.field5721;
                                        if (class96.field1358 == var11 && var11.field5637 != 0) {
                                            var58 = var11.field5637;
                                        }
                                    } else {
                                        var58 = var11.field5699;
                                        if (class96.field1358 == var11 && var11.field5724 != 0) {
                                            var58 = var11.field5724;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var11.field5755) {
                                            class61.field807.method1632(var13, var14, var11.field5773, var11.field5672, var58, 0);
                                        } else {
                                            class61.field807.method1731(var13, var14, var11.field5773, var11.field5672, var58, 0);
                                        }
                                    } else if (var11.field5755) {
                                        class61.field807.method1632(var13, var14, var11.field5773, var11.field5672, var58 & 0xFFFFFF | 255 - (var15 & 0xFF) << 24, 1);
                                    } else {
                                        class61.field807.method1731(var13, var14, var11.field5773, var11.field5672, 255 - (var15 & 0xFF) << 24 | var58 & 0xFFFFFF, 1);
                                    }
                                } else if (var11.field5671 == 4) {
                                    class273 var59 = var11.method2530(true, class61.field807);
                                    if (var59 != null) {
                                        String var60 = var11.field5775;
                                        int var61;
                                        if (class188.method1132((byte) -9, var11)) {
                                            var61 = var11.field5721;
                                            if (class96.field1358 == var11 && var11.field5637 != 0) {
                                                var61 = var11.field5637;
                                            }
                                            if (var11.field5767.length() > 0) {
                                                var60 = var11.field5767;
                                            }
                                        } else {
                                            var61 = var11.field5699;
                                            if (class96.field1358 == var11 && var11.field5724 != 0) {
                                                var61 = var11.field5724;
                                            }
                                        }
                                        if (var11.field5790 && var11.field5650 != -1) {
                                            class83 var62 = class9.method74(var11.field5650, (byte) -96);
                                            var60 = var62.field1193;
                                            if (var60 == null) {
                                                var60 = "null";
                                            }
                                            if ((var62.field1148 == 1 || var11.field5810 != 1) && var11.field5810 != -1) {
                                                var60 = "<col=ff9040>" + var60 + "</col> x" + class7.method47((byte) 87, var11.field5810);
                                            }
                                        }
                                        if (class211.field2807 == var11) {
                                            var60 = class173.field2316;
                                            var61 = var11.field5699;
                                        }
                                        if (!var11.field5790) {
                                            var60 = class272.method1869(var11, -10852, var60);
                                        }
                                        if (class205.field2770) {
                                            class61.field807.method1665(var13, var14, var11.field5773 + var13, var14 - -var11.field5672);
                                        }
                                        var59.method1877(0, var14, var60, (int[]) null, var61 | 0xFF000000, 0, var11.field5658 ? -16777216 : -1, class270.field3931, var13, var11.field5773, (class2) null, var11.field5770, var11.field5672, (byte) -26, var11.field5690, var11.field5800);
                                        if (class205.field2770) {
                                            class61.field807.method1767(arg6, arg0, arg7, arg8);
                                        }
                                    } else if (class347.field5001) {
                                        class407.method2621(var11, 15);
                                    }
                                } else if (var11.field5671 == 5) {
                                    if (!var11.field5790) {
                                        class67 var63 = var11.method2523(class61.field807, 1, class188.method1132((byte) -100, var11));
                                        if (var63 != null) {
                                            var63.method454(var13, var14);
                                        } else if (class347.field5001) {
                                            class407.method2621(var11, 15);
                                        }
                                    } else if (var11.field5723 >= 0) {
                                        var11.method2521(268435456).method2764(0, (byte) -99, var11.field5817 << 3, 0, var11.field5773, class61.field807, var11.field5783 << 3, var11.field5672, var14, var13);
                                    } else {
                                        class67 var64;
                                        if (var11.field5650 == -1) {
                                            var64 = var11.method2523(class61.field807, 1, false);
                                        } else {
                                            class296 var65 = var11.field5735 ? class227.field2988.field341 : null;
                                            var64 = class244.method1464(var11.field5650, (byte) -60, var11.field5810, class61.field807, var11.field5737 | 0xFF000000, var65, var11.field5733, var11.field5640);
                                        }
                                        if (var64 != null) {
                                            int var66 = var64.method411();
                                            int var67 = var64.method409();
                                            if (var11.field5722) {
                                                class61.field807.method1665(var13, var14, var13 + var11.field5773, var14 - -var11.field5672);
                                                if (var11.field5676 != 0) {
                                                    int var69 = (var66 - (1 - var11.field5773)) / var66;
                                                    int var70 = (var67 + var11.field5672 - 1) / var67;
                                                    for (int var71 = 0; var71 < var69; var71++) {
                                                        for (int var72 = 0; var72 < var70; var72++) {
                                                            var64.method448((float) var66 / 2.0F + (float) (var13 + (var66 * var71)), (float) var67 / 2.0F + (float) (var67 * var72 + var14), 4096, var11.field5676);
                                                        }
                                                    }
                                                } else if (var15 == 0) {
                                                    var64.method412(var13, var14, var11.field5773, var11.field5672, 0, 0, 1);
                                                } else {
                                                    var64.method412(var13, var14, var11.field5773, var11.field5672, 1, 255 - (var15 & 0xFF) << 24 | 0xFFFFFF, 1);
                                                }
                                                class61.field807.method1767(arg6, arg0, arg7, arg8);
                                            } else if (var15 != 0) {
                                                int var68 = 255 - (var15 & 0xFF) << 24 | 0xFFFFFF;
                                                if (var11.field5676 != 0) {
                                                    var64.method452((float) var11.field5773 / 2.0F + (float) var13, (float) var11.field5672 / 2.0F + (float) var14, var11.field5773 * 4096 / var66, var11.field5676, 1, var68, 1);
                                                } else if (var11.field5773 == var66 && var11.field5672 == var67) {
                                                    var64.method407(var13, var14, 1, var68, 1);
                                                } else {
                                                    var64.method402(var13, var14, var11.field5773, var11.field5672, 1, var68, 1);
                                                }
                                            } else if (var11.field5676 != 0) {
                                                var64.method448((float) var11.field5773 / 2.0F + (float) var13, (float) var11.field5672 / 2.0F + (float) var14, var11.field5773 * 4096 / var66, var11.field5676);
                                            } else if (var11.field5773 == var66 && var11.field5672 == var67) {
                                                var64.method454(var13, var14);
                                            } else {
                                                var64.method453(var13, var14, var11.field5773, var11.field5672);
                                            }
                                        } else if (class347.field5001) {
                                            class407.method2621(var11, 15);
                                        }
                                    }
                                } else if (var11.field5671 == 6) {
                                    boolean var73 = class188.method1132((byte) -41, var11);
                                    int var74;
                                    if (var73) {
                                        var74 = var11.field5668;
                                    } else {
                                        var74 = var11.field5643;
                                    }
                                    class156.method968((byte) -37);
                                    class375 var75 = null;
                                    int var76 = 0;
                                    if (var11.field5650 != -1) {
                                        class83 var77 = class9.method74(var11.field5650, (byte) 125);
                                        if (var77 != null) {
                                            class83 var78 = var77.method602(var11.field5810, -20463);
                                            class12 var79 = var74 == -1 ? null : class33.method221((byte) 102, var74);
                                            class296 var80 = var11.field5735 ? class227.field2988.field341 : null;
                                            var75 = var78.method591(var11.field5645, true, var11.field5727, 1024, 1, var80, class61.field807, var79, var11.field5703);
                                            if (var75 == null) {
                                                class407.method2621(var11, 15);
                                            } else {
                                                var76 = -var75.method1597() / 2;
                                            }
                                        }
                                    } else if (var11.field5749 == 5) {
                                        if (var11.field5756 == -1) {
                                            var75 = class213.field2850.method2021(class61.field807, 0, -81, (class12) null, -1, 1024, true, (class316[]) null, 0, (class12) null, -1, -1, -1);
                                        } else {
                                            int var81 = var11.field5756;
                                            class25 var82;
                                            if (class272.field3950 == var81) {
                                                var82 = class227.field2988;
                                            } else {
                                                var82 = class206.field2777[var81];
                                            }
                                            class12 var83 = var74 == -1 ? null : class33.method221((byte) 102, var74);
                                            if (var82 != null && (var81 == 2047 || class117.method762(var82.field340, 0) == var11.field5683)) {
                                                var75 = var82.field341.method2021(class61.field807, 0, -93, (class12) null, var11.field5727, 1024, true, (class316[]) null, var11.field5645, var83, -1, 0, var11.field5703);
                                            }
                                        }
                                    } else if (var11.field5749 == 8 || var11.field5749 == 9) {
                                        class72 var85 = class405.method2613(var11.field5756, (byte) 122);
                                        class12 var86 = var74 == -1 ? null : class33.method221((byte) 102, var74);
                                        if (var85 != null) {
                                            class296 var87 = var11.field5735 ? class227.field2988.field341 : null;
                                            var75 = var85.method531(var11.field5749 == 9, var86, var11.field5645, var11.field5703, var11.field5683, class61.field807, 1024, var87, 0, var11.field5727);
                                        }
                                    } else if (var74 == -1) {
                                        var75 = var11.method2522(-1, class227.field2988.field341, 1024, (byte) 88, var73, -1, class61.field807, 0, (class12) null);
                                        if (var75 == null && class347.field5001) {
                                            class407.method2621(var11, 15);
                                        }
                                    } else {
                                        class12 var84 = class33.method221((byte) 102, var74);
                                        var75 = var11.method2522(var11.field5703, class227.field2988.field341, 1024, (byte) 34, var73, var11.field5727, class61.field807, var11.field5645, var84);
                                        if (var75 == null && class347.field5001) {
                                            class407.method2621(var11, 15);
                                        }
                                    }
                                    if (var75 != null) {
                                        int var88;
                                        if (var11.field5644 > 0) {
                                            var88 = (var11.field5773 << 9) / var11.field5644;
                                        } else {
                                            var88 = 512;
                                        }
                                        int var89;
                                        if (var11.field5782 > 0) {
                                            var89 = (var11.field5672 << 9) / var11.field5782;
                                        } else {
                                            var89 = 512;
                                        }
                                        int var90 = (var11.field5704 * var88 >> 9) + var11.field5773 / 2 + var13;
                                        int var91 = (var11.field5715 * var89 >> 9) + var11.field5672 / 2 + var14;
                                        class199.field2644.method976();
                                        class61.field807.method1648(class199.field2644);
                                        int var92 = class117.field1644[var11.field5666 << 3] * var11.field5659 >> 15;
                                        int var93 = class117.field1636[var11.field5666 << 3] * var11.field5659 >> 15;
                                        class61.field807.method1723(var90, var91, var88, var89);
                                        class61.field807.method1737((float) var11.field5680, var11.field5638 ? (float) var11.field5731 : (float) var11.field5731 * 1.5F);
                                        if (class28.field410) {
                                            class61.field807.method1652();
                                            class61.field807.method1697();
                                            class61.field807.method1767(arg6, arg0, arg7, arg8);
                                            class28.field410 = false;
                                        }
                                        if (var11.field5706) {
                                            class61.field807.method1769(false);
                                        }
                                        if (var11.field5790) {
                                            class227.field2978.method982(-var11.field5694 << 3);
                                            class227.field2978.method980(var11.field5795 << 3);
                                            class227.field2978.method981(var11.field5732, var11.field5720 + var76 + var92, var11.field5720 + var93);
                                        } else {
                                            class227.field2978.method984(var11.field5795 << 3);
                                            class227.field2978.method981(0, var92, var93);
                                        }
                                        class227.field2978.method988(var11.field5666 << 3);
                                        if (class205.field2770) {
                                            class61.field807.method1665(var13, var14, var11.field5773 + var13, var11.field5672 + var14);
                                        }
                                        if (var11.field5638) {
                                            var75.method1587(class227.field2978, (class330) null, var11.field5659, 1);
                                        } else {
                                            var75.method1601(class227.field2978, (class330) null, 1);
                                        }
                                        if (class205.field2770) {
                                            class61.field807.method1767(arg6, arg0, arg7, arg8);
                                        }
                                        if (var11.field5706) {
                                            class61.field807.method1769(true);
                                        }
                                    }
                                } else {
                                    if (var11.field5671 == 7) {
                                        class273 var94 = var11.method2530(true, class61.field807);
                                        if (var94 == null) {
                                            if (class347.field5001) {
                                                class407.method2621(var11, 15);
                                            }
                                            continue;
                                        }
                                        int var95 = 0;
                                        for (int var96 = 0; var96 < var11.field5670; var96++) {
                                            for (int var97 = 0; var97 < var11.field5813; var97++) {
                                                if (var11.field5777[var95] > 0) {
                                                    class83 var98 = class9.method74(var11.field5777[var95] - 1, (byte) 113);
                                                    String var99;
                                                    if (var98.field1148 != 1 && var11.field5776[var95] == 1) {
                                                        var99 = "<col=ff9040>" + var98.field1193 + "</col>";
                                                    } else {
                                                        var99 = "<col=ff9040>" + var98.field1193 + "</col> x" + class7.method47((byte) 87, var11.field5776[var95]);
                                                    }
                                                    int var100 = (var11.field5636 + 115) * var97 + var13;
                                                    int var101 = (var11.field5751 + 12) * var96 + var14;
                                                    if (var11.field5800 == 0) {
                                                        var94.method1889(var11.field5699 | 0xFF000000, var100, -74, var101, (int[]) null, var99, class270.field3931, var11.field5658 ? -16777216 : -1);
                                                    } else if (var11.field5800 == 1) {
                                                        var94.method1880(var99, (byte) 1, var100 + 57, (int[]) null, var11.field5699 | 0xFF000000, var101, class270.field3931, var11.field5658 ? -16777216 : -1);
                                                    } else {
                                                        var94.method1882((byte) 62, var100 + 115 - 1, var101, class270.field3931, var11.field5699 | 0xFF000000, (int[]) null, var11.field5658 ? -16777216 : -1, var99);
                                                    }
                                                }
                                                var95++;
                                            }
                                        }
                                    }
                                    if (var11.field5671 == 8 && class71.field1007 == var11 && class384.field5566 == class171.field2293) {
                                        int var102 = 0;
                                        int var103 = 0;
                                        class273 var104 = class393.field5626;
                                        String var105 = var11.field5775;
                                        String var106 = class272.method1869(var11, -10852, var105);
                                        while (var106.length() > 0) {
                                            int var114 = var106.indexOf("<br>");
                                            String var115;
                                            if (var114 == -1) {
                                                var115 = var106;
                                                var106 = "";
                                            } else {
                                                var115 = var106.substring(0, var114);
                                                var106 = var106.substring(var114 + 4);
                                            }
                                            int var116 = class283.field4123.method2127(255, var115);
                                            if (var116 > var102) {
                                                var102 = var116;
                                            }
                                            var103 += class283.field4123.field4584 + 1;
                                        }
                                        var103 += 7;
                                        var102 += 6;
                                        int var107 = var13 + var11.field5773 - var102 - 5;
                                        int var108 = var11.field5672 + var14 + 5;
                                        if (var107 < (var13 + 5)) {
                                            var107 = var13 + 5;
                                        }
                                        if (arg8 < (var108 + var103)) {
                                            var108 = arg8 - var103;
                                        }
                                        if (var102 + var107 > arg7) {
                                            var107 = arg7 - var102;
                                        }
                                        class61.field807.method1632(var107, var108, var102, var103, -96, 0);
                                        class61.field807.method1731(var107, var108, var102, var103, -16777216, 0);
                                        String var109 = var11.field5775;
                                        int var110 = var108 - (-class283.field4123.field4584 - 2);
                                        String var111 = class272.method1869(var11, -10852, var109);
                                        while (var111.length() > 0) {
                                            int var112 = var111.indexOf("<br>");
                                            String var113;
                                            if (var112 == -1) {
                                                var113 = var111;
                                                var111 = "";
                                            } else {
                                                var113 = var111.substring(0, var112);
                                                var111 = var111.substring(var112 + 4);
                                            }
                                            var104.method1878(var110, -1, -16777216, var113, (byte) 122, var107 + 3);
                                            var110 += class283.field4123.field4584 + 1;
                                        }
                                    }
                                    if (var11.field5671 == 9) {
                                        int var117;
                                        int var118;
                                        int var119;
                                        int var120;
                                        if (var11.field5728) {
                                            var117 = var14;
                                            var118 = var13;
                                            var119 = var11.field5672 + var14;
                                            var120 = var11.field5773 + var13;
                                        } else {
                                            var119 = var14;
                                            var117 = var11.field5672 + var14;
                                            var120 = var13 + var11.field5773;
                                            var118 = var13;
                                        }
                                        if (var11.field5762 == 1) {
                                            class61.field807.method1782(var118, var119, var120, var117, var11.field5699, 0);
                                        } else {
                                            class61.field807.method1704(var118, var119, var120, var117, var11.field5699, var11.field5762, 0);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ZLlm;)V")
    public static final void method441(boolean arg0, class347 arg1) {
        class447.field6554 = arg1;
        field851++;
        if (arg0) {
            field846 = 97;
        }
    }
}
