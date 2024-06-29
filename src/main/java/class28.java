import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class28 {

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
    public static int field660 = 1;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "Lhb;")
    public static class44 field661 = class102.method810(")3000", -28606);

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "I")
    public static int field665 = 0;

    @OriginalMember(owner = "client!ec", name = "l", descriptor = "Lhb;")
    public static class44 field666 = class102.method810(" )2> @yel@", -28606);

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "Lwd;")
    public static class131 field657 = new class131(new byte[5000]);

    @OriginalMember(owner = "client!ec", name = "o", descriptor = "J")
    public static long field669 = 0L;

    @OriginalMember(owner = "client!ec", name = "n", descriptor = "I")
    public static int field668 = 1;

    @OriginalMember(owner = "client!ec", name = "p", descriptor = "Lhb;")
    private static class44 field670 = class102.method810("Username: ", -28606);

    @OriginalMember(owner = "client!ec", name = "m", descriptor = "Lhb;")
    public static class44 field667 = field670;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "Lfb;")
    public static class33 field662;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V", line = 21)
    public static final void method230(int arg0) {
        field655++;
        class34.field840++;
        class105.method829((byte) 88, true);
        class1.method3(true, -65);
        class105.method829((byte) -122, false);
        class1.method3(false, -65);
        class122.method938((byte) 122);
        class23.method174(true);
        if (!class33.field802) {
            int var1 = class116.field2849;
            if (var1 < class15.field295 / 256) {
                var1 = class15.field295 / 256;
            }
            if (class100.field2548[4] && var1 < class2.field29[4] + 128) {
                var1 = class2.field29[4] + 128;
            }
            int var2 = class85.field2176 + class81.field2065 & 0x7FF;
            class129.method963(class55.method507(class72.field1820.field1371, class79.field1993, class72.field1820.field1384, -1) - 50, 0, class57.field1507, class9.field179, var1, var2, var1 * 3 + 600);
        }
        int var3;
        if (class33.field802) {
            var3 = class11.method75(false);
        } else {
            var3 = class1.method7((byte) -110);
        }
        int var4 = class51.field1279;
        int var5 = class95.field2420;
        int var6 = class130.field3122;
        int var7 = class101.field2579;
        int var8 = class88.field2236;
        for (int var9 = 0; var9 < 5; var9++) {
            if (class100.field2548[var9]) {
                int var10 = (int) (Math.random() * (double) (class122.field2974[var9] * 2 + 1) + Math.sin((double) class27.field626[var9] / 100.0D * (double) class90.field2311[var9]) * (double) class2.field29[var9] - (double) class122.field2974[var9]);
                if (var9 == 4) {
                    class95.field2420 += var10;
                    if (class95.field2420 < 128) {
                        class95.field2420 = 128;
                    }
                    if (class95.field2420 > 383) {
                        class95.field2420 = 383;
                    }
                }
                if (var9 == 3) {
                    class101.field2579 = class101.field2579 + var10 & 0x7FF;
                }
                if (var9 == 2) {
                    class51.field1279 += var10;
                }
                if (var9 == 1) {
                    class88.field2236 += var10;
                }
                if (var9 == 0) {
                    class130.field3122 += var10;
                }
            }
        }
        class57.method537(-1);
        class24.field577 = class110.field2749 - 4;
        class24.field571 = 0;
        class24.field575 = class100.field2519 - 4;
        class24.field573 = true;
        class112.method854();
        class89.field2283.method236(class130.field3122, class88.field2236, class51.field1279, class95.field2420, class101.field2579, var3);
        class89.field2283.method268();
        class13.method89(arg0 ^ 0xFFFFDC8D);
        class34.method331(-12190);
        ((class96) class58.field1516).method756(class44.field1124, 4);
        class75.method638(true);
        if (class94.field2392 && class27.method229(4584, true, false) == 0) {
            class94.field2392 = false;
        }
        if (class94.field2392) {
            class57.method537(-1);
            class112.method854();
            class40.method349(class36.field857, (byte) 95, false, null);
        }
        class34.method334(1024);
        class88.field2236 = var8;
        class101.field2579 = var7;
        class130.field3122 = var6;
        class95.field2420 = var5;
        class51.field1279 = var4;
        if (arg0 != 9074) {
            method233((byte) 49);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BIII)Lhc;", line = 143)
    public static final class45 method231(byte arg0, int arg1, int arg2, int arg3) {
        field664++;
        if (arg3 == 0) {
            class45 var4 = (class45) class116.field2842.method330((long) arg1, -1);
            if (var4 != null && var4.field1132 != arg2 && var4.field1132 != -1) {
                var4.method948(126);
                var4 = null;
            }
            if (var4 != null) {
                return var4;
            }
        }
        class80 var5 = class42.method358(0, arg1);
        if (var5.field2036 == null) {
            arg2 = -1;
        }
        if (arg2 > 1) {
            int var6 = -1;
            for (int var7 = 0; var7 < 10; var7++) {
                if (var5.field2019[var7] <= arg2 && var5.field2019[var7] != 0) {
                    var6 = var5.field2036[var7];
                }
            }
            if (var6 != -1) {
                var5 = class42.method358(0, var6);
            }
        }
        class24 var8 = var5.method660(true, 1, 21);
        if (var8 == null) {
            return null;
        }
        class45 var9 = null;
        if (var5.field2037 != -1) {
            var9 = method231((byte) 49, var5.field2030, 10, -1);
            if (var9 == null) {
                return null;
            }
        }
        int[] var10 = class112.field2776;
        int var11 = class112.field2772;
        int var12 = class112.field2773;
        int var13 = class112.field2774;
        int var14 = class112.field2775;
        int var15 = class112.field2771;
        int var16 = class112.field2770;
        int[] var17 = class58.method558();
        int var18 = class58.field1526;
        int var19 = class58.field1523;
        class45 var20 = new class45(32, 32);
        class112.method857(var20.field1131, 32, 32);
        class27.field618 = class58.method548(class27.field618);
        class112.method856(0, 0, 32, 32, 0);
        int var21 = var5.field2054;
        class58.field1513 = false;
        if (arg3 == -1) {
            var21 = (int) ((double) var21 * 1.5D);
        }
        if (arg3 > 0) {
            var21 = (int) ((double) var21 * 1.04D);
        }
        int var22 = class58.field1519[var5.field2050] * var21 >> 16;
        int var23 = class58.field1518[var5.field2050] * var21 >> 16;
        var8.method205();
        var8.method178(0, var5.field2048, var5.field2028, var5.field2050, var5.field2021, var8.field2466 / 2 + var22 + var5.field2039, var5.field2039 + var23);
        for (int var24 = 31; var24 >= 0; var24--) {
            for (int var31 = 31; var31 >= 0; var31--) {
                if (var20.field1131[var31 * 32 + var24] == 0) {
                    if (var24 > 0 && var20.field1131[var24 + var31 * 32 - 1] > 1) {
                        var20.field1131[var31 * 32 + var24] = 1;
                    } else if (var31 > 0 && var20.field1131[var31 * 32 + var24 - 32] > 1) {
                        var20.field1131[var31 * 32 + var24] = 1;
                    } else if (var24 < 31 && var20.field1131[var31 * 32 + var24 + 1] > 1) {
                        var20.field1131[var31 * 32 + var24] = 1;
                    } else if (var31 < 31 && var20.field1131[var31 * 32 + var24 + 32] > 1) {
                        var20.field1131[var31 * 32 + var24] = 1;
                    }
                }
            }
        }
        if (arg3 > 0) {
            for (int var25 = 31; var25 >= 0; var25--) {
                for (int var26 = 31; var26 >= 0; var26--) {
                    if (var20.field1131[var25 + var26 * 32] == 0) {
                        if (var25 > 0 && var20.field1131[var26 * 32 + var25 - 1] == 1) {
                            var20.field1131[var26 * 32 + var25] = arg3;
                        } else if (var26 > 0 && var20.field1131[var26 * 32 + var25 - 32] == 1) {
                            var20.field1131[var26 * 32 + var25] = arg3;
                        } else if (var25 < 31 && var20.field1131[var26 * 32 + var25 + 1] == 1) {
                            var20.field1131[var25 + var26 * 32] = arg3;
                        } else if (var26 < 31 && var20.field1131[var26 * 32 + var25 + 32] == 1) {
                            var20.field1131[var26 * 32 + var25] = arg3;
                        }
                    }
                }
            }
        } else if (arg3 == 0) {
            for (int var27 = 31; var27 >= 0; var27--) {
                for (int var28 = 31; var28 >= 0; var28--) {
                    if (var20.field1131[var27 + var28 * 32] == 0 && var27 > 0 && var28 > 0 && var20.field1131[(var28 - 1) * 32 + var27 - 1] > 0) {
                        var20.field1131[var27 + var28 * 32] = 3153952;
                    }
                }
            }
        }
        if (var5.field2037 != -1) {
            int var29 = var9.field1133;
            var9.field1133 = 32;
            int var30 = var9.field1132;
            var9.field1132 = 32;
            var9.method428(0, 0);
            var9.field1133 = var29;
            var9.field1132 = var30;
        }
        if (arg3 == 0) {
            class116.field2842.method332(var20, 0, (long) arg1);
        }
        if (arg0 <= 12) {
            return null;
        }
        class112.method857(var10, var12, var16);
        class112.method859(var11, var14, var13, var15);
        class58.method548(var17);
        class58.field1526 = var18;
        class58.field1523 = var19;
        class58.method551();
        class58.field1513 = true;
        if (var5.field2024 == 1) {
            var20.field1133 = 33;
        } else {
            var20.field1133 = 32;
        }
        var20.field1132 = arg2;
        return var20;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IZI[II)V", line = 404)
    public static final void method232(int arg0, boolean arg1, int arg2, int[] arg3, int arg4) {
        if (arg4 != 26691) {
            return;
        }
        class127.field3047.method747(17);
        class127.field3051.method680(0, 0);
        field656++;
        if (arg1) {
            if (arg3[arg0] != -1) {
                if (arg0 == 0) {
                    class63.field1599.method680(22, 10);
                }
                if (arg0 == 1) {
                    class127.field3053.method680(54, 8);
                }
                if (arg0 == 2) {
                    class127.field3053.method680(82, 8);
                }
                if (arg0 == 3) {
                    class53.field1320.method680(110, 8);
                }
                if (arg0 == 4) {
                    class51.field1280.method680(153, 8);
                }
                if (arg0 == 5) {
                    class51.field1280.method680(181, 8);
                }
                if (arg0 == 6) {
                    class111.field2761.method680(209, 9);
                }
            }
            if (arg3[0] != -1 && arg2 != 0) {
                class128.field3081[0].method680(29, 13);
            }
            if (arg3[1] != -1 && arg2 != 1) {
                class128.field3081[1].method680(53, 11);
            }
            if (arg3[2] != -1 && arg2 != 2) {
                class128.field3081[2].method680(82, 11);
            }
            if (arg3[3] != -1 && arg2 != 3) {
                class128.field3081[3].method680(115, 12);
            }
            if (arg3[4] != -1 && arg2 != 4) {
                class128.field3081[4].method680(153, 13);
            }
            if (arg3[5] != -1 && arg2 != 5) {
                class128.field3081[5].method680(180, 11);
            }
            if (arg3[6] != -1 && arg2 != 6) {
                class128.field3081[6].method680(208, 13);
            }
        }
        class88.field2252.method747(17);
        class15.field288.method680(0, 0);
        if (arg1) {
            if (arg3[arg0] != -1) {
                if (arg0 == 7) {
                    class80.field2013.method680(42, 0);
                }
                if (arg0 == 8) {
                    class86.field2196.method680(74, 0);
                }
                if (arg0 == 9) {
                    class86.field2196.method680(102, 0);
                }
                if (arg0 == 10) {
                    class94.field2399.method680(130, 1);
                }
                if (arg0 == 11) {
                    class57.field1505.method680(173, 0);
                }
                if (arg0 == 12) {
                    class57.field1505.method680(201, 0);
                }
                if (arg0 == 13) {
                    class61.field1557.method680(229, 0);
                }
            }
            if (arg3[8] != -1 && arg2 != 8) {
                class128.field3081[7].method680(74, 2);
            }
            if (arg3[9] != -1 && arg2 != 9) {
                class128.field3081[8].method680(102, 3);
            }
            if (arg3[10] != -1 && arg2 != 10) {
                class128.field3081[9].method680(137, 4);
            }
            if (arg3[11] != -1 && arg2 != 11) {
                class128.field3081[10].method680(174, 2);
            }
            if (arg3[12] != -1 && arg2 != 12) {
                class128.field3081[11].method680(201, 2);
            }
            if (arg3[13] != -1 && arg2 != 13) {
                class128.field3081[12].method680(226, 2);
            }
        }
        try {
            Graphics var5 = class22.field483.getGraphics();
            class127.field3047.method143(516, var5, -10166, 160);
            class88.field2252.method143(496, var5, -10166, 466);
        } catch (Exception var6) {
            class22.field483.repaint();
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V", line = 537)
    public static void method233(byte arg0) {
        field657 = null;
        field667 = null;
        field661 = null;
        int var1 = -47 / ((58 - arg0) / 52);
        field662 = null;
        field670 = null;
        field666 = null;
    }
}
