import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("je")
public class class90 {

    @OriginalMember(owner = "je", name = "a", descriptor = "Llf;")
    private static class109 field1848 = class35.method275("Players", 2);

    @OriginalMember(owner = "je", name = "d", descriptor = "Llf;")
    public static class109 field1851 = field1848;

    @OriginalMember(owner = "je", name = "g", descriptor = "Llf;")
    public static class109 field1854 = class35.method275("Bitte laden Sie die Seite neu)3", 2);

    @OriginalMember(owner = "je", name = "e", descriptor = "I")
    public static int field1852 = 0;

    @OriginalMember(owner = "je", name = "h", descriptor = "Ljava/util/Random;")
    public static Random field1855 = new Random();

    @OriginalMember(owner = "je", name = "l", descriptor = "Llf;")
    public static class109 field1859 = class35.method275("Update)2Liste geladen)3", 2);

    @OriginalMember(owner = "je", name = "m", descriptor = "[[S")
    public static short[][] field1860 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "je", name = "k", descriptor = "I")
    public static int field1858 = 0;

    @OriginalMember(owner = "je", name = "b", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "je", name = "c", descriptor = "I")
    public static int field1850;

    @OriginalMember(owner = "je", name = "f", descriptor = "I")
    public static int field1853;

    @OriginalMember(owner = "je", name = "i", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "je", name = "n", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "je", name = "j", descriptor = "Lqh;")
    public static class156 field1857;

    @OriginalMember(owner = "je", name = "a", descriptor = "(Ldb;ILdb;)V")
    public static final void method659(class33 arg0, int arg1, class33 arg2) {
        field1850++;
        if (class178.field3350 == null) {
            class178.field3350 = class117.method859(class107.field2121, class73.field1410, (byte) 99, class145.field2795);
        }
        if (class179.field3391 == null) {
            class179.field3391 = class141.method1006(class145.field2795, 64, class179.field3390, class73.field1410);
        }
        if (class123.field2372 == null) {
            class123.field2372 = class141.method1006(class145.field2795, -95, class186.field3539, class73.field1410);
        }
        if (class83.field1689 == null) {
            class83.field1689 = class141.method1006(class145.field2795, -71, class112.field2222, class73.field1410);
        }
        class11.method76(0, 23, 765, 480, 0);
        class11.method66(0, 0, 125, 23, 12425273, 9135624);
        class11.method66(125, 0, 640, 23, 5197647, 2697513);
        arg0.method140(class68.field1325, 62, 15, 0, -1);
        if (class83.field1689 != null) {
            class83.field1689[1].method280(140, 1);
            arg2.method119(class145.field2789, 152, 10, 16777215, -1);
            class83.field1689[0].method280(140, 12);
            arg2.method119(class111.field2202, 152, 21, 16777215, -1);
        }
        if (class123.field2372 != null) {
            short var3 = 280;
            short var4 = 390;
            if (class157.field2961[0] == 0 && class126.field2432[0] == 0) {
                class123.field2372[2].method280(var3, 4);
            } else {
                class123.field2372[0].method280(var3, 4);
            }
            if (class157.field2961[0] == 0 && class126.field2432[0] == 1) {
                class123.field2372[3].method280(var3 + 15, 4);
            } else {
                class123.field2372[1].method280(var3 + 15, 4);
            }
            short var5 = 500;
            short var6 = 610;
            arg0.method119(class31.field737, var3 + 32, 17, 16777215, -1);
            if (class157.field2961[0] == 1 && class126.field2432[0] == 0) {
                class123.field2372[2].method280(var4, 4);
            } else {
                class123.field2372[0].method280(var4, 4);
            }
            if (class157.field2961[0] == 1 && class126.field2432[0] == 1) {
                class123.field2372[3].method280(var4 + 15, 4);
            } else {
                class123.field2372[1].method280(var4 + 15, 4);
            }
            arg0.method119(field1851, var4 + 32, 17, 16777215, -1);
            if (class157.field2961[0] == 2 && class126.field2432[0] == 0) {
                class123.field2372[2].method280(var5, 4);
            } else {
                class123.field2372[0].method280(var5, 4);
            }
            if (class157.field2961[0] == 2 && class126.field2432[0] == 1) {
                class123.field2372[3].method280(var5 + 15, 4);
            } else {
                class123.field2372[1].method280(var5 + 15, 4);
            }
            arg0.method119(class73.field1409, var5 + 32, 17, 16777215, -1);
            if (class157.field2961[0] == 3 && class126.field2432[0] == 0) {
                class123.field2372[2].method280(var6, 4);
            } else {
                class123.field2372[0].method280(var6, 4);
            }
            if (class157.field2961[0] == 3 && class126.field2432[0] == 1) {
                class123.field2372[3].method280(var6 + 15, 4);
            } else {
                class123.field2372[1].method280(var6 + 15, 4);
            }
            arg0.method119(class60.field1182, var6 + 32, 17, 16777215, -1);
        }
        class11.method76(708, 4, 50, 16, 0);
        if (arg1 < 104) {
            return;
        }
        arg2.method140(class57.field1154, 733, 16, 16777215, -1);
        class197.field3772 = -1;
        if (class178.field3350 == null) {
            return;
        }
        byte var7 = 88;
        int var8 = 765 / (var7 + 1);
        byte var9 = 19;
        int var10 = 480 / (var9 + 1);
        int var11;
        int var12;
        do {
            var11 = var10;
            var12 = var8;
            if (class63.field1209 <= (var8 - 1) * var10) {
                var8--;
            }
            if (class63.field1209 <= (var10 - 1) * var8) {
                var10--;
            }
            if ((var10 - 1) * var8 >= class63.field1209) {
                var10--;
            }
        } while (var10 != var11 || var8 != var12);
        int var13 = (765 - var7 * var8) / (var8 + 1);
        if (var13 > 5) {
            var13 = 5;
        }
        int var14 = (765 - var7 * var8 - (var8 - 1) * var13) / 2;
        int var15 = var14;
        int var16 = 0;
        int var17 = (480 - var9 * var10) / (var10 - -1);
        if (var17 > 5) {
            var17 = 5;
        }
        int var18 = (480 - var9 * var10 - (var10 + -1) * var17) / 2;
        int var19 = var18 + 23;
        for (int var20 = 0; var20 < class63.field1209; var20++) {
            class55 var21 = class168.field3121[var20];
            boolean var22 = true;
            class109 var23 = class52.method345((byte) 85, var21.field1106);
            if (var21.field1106 == -1) {
                var22 = false;
                var23 = class201.field3964;
            } else if (var21.field1106 > 1980) {
                var23 = class145.field2809;
                var22 = false;
            }
            if (class21.field479 >= var15 && class109.field2134 >= var19 && var7 + var15 > class21.field479 && class109.field2134 < var9 + var19 && var22) {
                class197.field3772 = var20;
                class178.field3350[var21.field1111 ? 1 : 0].method705(var15, var19, 128, 16777215);
            } else {
                class178.field3350[var21.field1111 ? 1 : 0].method730(var15, var19);
            }
            if (class179.field3391 != null) {
                class179.field3391[(var21.field1111 ? 8 : 0) + var21.field1110].method280(var15 + 29, var19);
            }
            arg0.method140(class52.method345((byte) 85, var21.field1113), var15 + 15, var9 / 2 + var19 + 5, 0, -1);
            arg2.method140(var23, var15 + 60, var9 / 2 + 5 + var19, 268435455, -1);
            var19 += var9 + var17;
            int var10000 = ~var10;
            var16++;
            if (var10000 >= ~var16) {
                var16 = 0;
                var15 += var13 + var7;
                var19 = var18 + 23;
            }
        }
    }

    @OriginalMember(owner = "je", name = "a", descriptor = "(B)V")
    public static void method660(byte arg0) {
        field1855 = null;
        field1857 = null;
        field1848 = null;
        field1854 = null;
        field1860 = null;
        if (arg0 != -71) {
            method662(43, 9, (byte) -26, 64, 68);
        }
        field1851 = null;
        field1859 = null;
    }

    @OriginalMember(owner = "je", name = "a", descriptor = "(BIILbg;Lbg;)Ldb;")
    public static final class33 method661(byte arg0, int arg1, int arg2, class18 arg3, class18 arg4) {
        if (arg0 >= -44) {
            return null;
        } else {
            field1853++;
            return class203.method1333(-21957, arg3, arg2, arg1) ? class162.method1099(arg4.method147(0, arg2, arg1), 0) : null;
        }
    }

    @OriginalMember(owner = "je", name = "a", descriptor = "(IIBII)V")
    public static final void method662(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field1856++;
        class159.field2981 = 0;
        int var5 = -40 % ((-arg2 - 50) / 57);
        for (int var6 = -1; var6 < class157.field2956 + class1.field10; var6++) {
            class187 var22;
            if (var6 == -1) {
                var22 = class157.field2955;
            } else if (class157.field2956 > var6) {
                var22 = class202.field3975[class125.field2405[var6]];
            } else {
                var22 = class183.field3444[class1.field8[var6 - class157.field2956]];
            }
            if (var22 != null && var22.method996(0)) {
                if (var22 instanceof class139) {
                    class170 var23 = ((class139) var22).field2691;
                    if (var23.field3170 != null) {
                        var23 = var23.method1137(-1);
                    }
                    if (var23 == null) {
                        continue;
                    }
                }
                if (class157.field2956 <= var6) {
                    class170 var24 = ((class139) var22).field2691;
                    if (var24.field3170 != null) {
                        var24 = var24.method1137(-1);
                    }
                    if (var24.field3162 >= 0 && class152.field2906.length > var24.field3162) {
                        class144.method1015(-25993, var22, var22.method1267(-106) + 15);
                        if (class183.field3440 > -1) {
                            class152.field2906[var24.field3162].method704(arg3 + class183.field3440 - 12, arg1 + -30 + class187.field3604);
                        }
                    }
                    if (class76.field1455 == 1 && class1.field8[var6 - class157.field2956] == class24.field546 && class143.field2754 % 20 < 10) {
                        class144.method1015(-25993, var22, var22.method1267(-112) + 15);
                        if (class183.field3440 > -1) {
                            class137.field2653[0].method704(class183.field3440 + arg3 - 12, arg1 + -28 - -class187.field3604);
                        }
                    }
                } else {
                    class184 var25 = (class184) var22;
                    int var26 = 30;
                    if (var25.field3464 != -1 || var25.field3471 != -1) {
                        class144.method1015(-25993, var22, var22.method1267(-101) + 15);
                        if (class183.field3440 > -1) {
                            if (var25.field3464 != -1) {
                                class121.field2344[var25.field3464].method704(arg3 + class183.field3440 - 12, arg1 - var26 + class187.field3604);
                                var26 += 25;
                            }
                            if (var25.field3471 != -1) {
                                class152.field2906[var25.field3471].method704(class183.field3440 + arg3 - 12, class187.field3604 + arg1 + -var26);
                                var26 += 25;
                            }
                        }
                    }
                    if (var6 >= 0 && class76.field1455 == 10 && class125.field2405[var6] == class105.field2094) {
                        class144.method1015(-25993, var22, var22.method1267(-102) + 15);
                        if (class183.field3440 > -1) {
                            class137.field2653[1].method704(class183.field3440 + arg3 - 12, class187.field3604 + arg1 + -var26);
                        }
                    }
                }
                if (var22.field3588 != null && (var6 >= class157.field2956 || class82.field1627 == 0 || class82.field1627 == 3 || class82.field1627 == 1 && class22.method205(((class184) var22).field3455, -72))) {
                    class144.method1015(-25993, var22, var22.method1267(-101));
                    if (class183.field3440 > -1 && class34.field777 > class159.field2981) {
                        class34.field761[class159.field2981] = class46.field957.method123(var22.field3588) / 2;
                        class34.field775[class159.field2981] = class46.field957.field326;
                        class34.field755[class159.field2981] = class183.field3440;
                        class34.field752[class159.field2981] = class187.field3604;
                        class34.field758[class159.field2981] = var22.field3575;
                        class34.field771[class159.field2981] = var22.field3591;
                        class34.field764[class159.field2981] = var22.field3599;
                        class34.field768[class159.field2981] = var22.field3588;
                        class159.field2981++;
                    }
                }
                if (class143.field2754 < var22.field3605) {
                    class144.method1015(-25993, var22, var22.method1267(-117) + 15);
                    if (class183.field3440 > -1) {
                        class11.method76(class183.field3440 + arg3 - 15, class187.field3604 + arg1 + -3, var22.field3592, 5, 65280);
                        class11.method76(arg3 + class183.field3440 + var22.field3592 - 15, class187.field3604 + arg1 + -3, 30 - var22.field3592, 5, 16711680);
                    }
                }
                for (int var27 = 0; var27 < 4; var27++) {
                    if (var22.field3576[var27] > class143.field2754) {
                        class144.method1015(-25993, var22, var22.method1267(-73) / 2);
                        if (class183.field3440 > -1) {
                            if (var27 == 1) {
                                class187.field3604 -= 20;
                            }
                            if (var27 == 2) {
                                class187.field3604 -= 10;
                                class183.field3440 -= 15;
                            }
                            if (var27 == 3) {
                                class187.field3604 -= 10;
                                class183.field3440 += 15;
                            }
                            class140.field2705[var22.field3572[var27]].method704(class183.field3440 + arg3 - 12, class187.field3604 - 12 + arg1);
                            class74.field1426.method140(class52.method345((byte) 85, var22.field3580[var27]), class183.field3440 + arg3 - 1, class187.field3604 + arg1 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var7 = 0; var7 < class159.field2981; var7++) {
            int var8 = class34.field755[var7];
            int var9 = class34.field752[var7];
            int var10 = class34.field761[var7];
            int var11 = class34.field775[var7];
            boolean var12 = true;
            while (var12) {
                var12 = false;
                for (int var21 = 0; var21 < var7; var21++) {
                    if (class34.field752[var21] - class34.field775[var21] < var9 + 2 && var9 - var11 < class34.field752[var21] + 2 && class34.field755[var21] + class34.field761[var21] > var8 - var10 && var8 + var10 > class34.field755[var21] + -class34.field761[var21] && var9 > class34.field752[var21] - class34.field775[var21]) {
                        var12 = true;
                        var9 = class34.field752[var21] - class34.field775[var21];
                    }
                }
            }
            class183.field3440 = class34.field755[var7];
            class187.field3604 = class34.field752[var7] = var9;
            class109 var13 = class34.field768[var7];
            if (class54.field1090 == 0) {
                int var14 = 16776960;
                if (class34.field758[var7] < 6) {
                    var14 = class41.field859[class34.field758[var7]];
                }
                if (class34.field758[var7] == 6) {
                    var14 = class55.field1115 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (class34.field758[var7] == 7) {
                    var14 = class55.field1115 % 20 >= 10 ? 65535 : 255;
                }
                if (class34.field758[var7] == 8) {
                    var14 = class55.field1115 % 20 < 10 ? 45056 : 8454016;
                }
                if (class34.field758[var7] == 9) {
                    int var15 = 150 - class34.field764[var7];
                    if (var15 < 50) {
                        var14 = var15 * 1280 + 16711680;
                    } else if (var15 < 100) {
                        var14 = 16776960 - (var15 - 50) * 327680;
                    } else if (var15 < 150) {
                        var14 = var15 * 5 + 65280 - 500;
                    }
                }
                if (class34.field758[var7] == 10) {
                    int var16 = 150 - class34.field764[var7];
                    if (var16 < 50) {
                        var14 = var16 * 5 + 16711680;
                    } else if (var16 < 100) {
                        var14 = 16711935 - (var16 - 50) * 327680;
                    } else if (var16 < 150) {
                        var14 = var16 * 327680 + 255 + 500 - var16 * 5 - 32768000;
                    }
                }
                if (class34.field758[var7] == 11) {
                    int var17 = 150 - class34.field764[var7];
                    if (var17 < 50) {
                        var14 = 16777215 - var17 * 327685;
                    } else if (var17 < 100) {
                        var14 = var17 * 327685 + 65280 - 16384250;
                    } else if (var17 < 150) {
                        var14 = 16777215 - (var17 - 100) * 327680;
                    }
                }
                if (class34.field771[var7] == 0) {
                    class46.field957.method140(var13, class183.field3440 + arg3, class187.field3604 + arg1, var14, 0);
                }
                if (class34.field771[var7] == 1) {
                    class46.field957.method131(var13, class183.field3440 + arg3, class187.field3604 + arg1, var14, 0, class55.field1115);
                }
                if (class34.field771[var7] == 2) {
                    class46.field957.method130(var13, class183.field3440 + arg3, class187.field3604 + arg1, var14, 0, class55.field1115);
                }
                if (class34.field771[var7] == 3) {
                    class46.field957.method134(var13, class183.field3440 + arg3, arg1 - -class187.field3604, var14, 0, class55.field1115, 150 - class34.field764[var7]);
                }
                if (class34.field771[var7] == 4) {
                    int var18 = (150 - class34.field764[var7]) * (class46.field957.method123(var13) + 100) / 150;
                    class11.method74(class183.field3440 + arg3 - 50, arg1, class183.field3440 + arg3 + 50, arg0 + arg1);
                    class46.field957.method119(var13, class183.field3440 + arg3 + 50 - var18, class187.field3604 + arg1, var14, 0);
                    class11.method71(arg3, arg1, arg3 + arg4, arg0 + arg1);
                }
                if (class34.field771[var7] == 5) {
                    int var19 = 150 - class34.field764[var7];
                    int var20 = 0;
                    class11.method74(arg3, arg1 + class187.field3604 - class46.field957.field326 - 1, arg3 + arg4, arg1 + class187.field3604 + 5);
                    if (var19 < 25) {
                        var20 = var19 - 25;
                    } else if (var19 > 125) {
                        var20 = var19 - 125;
                    }
                    class46.field957.method140(var13, arg3 + class183.field3440, arg1 - -class187.field3604 + var20, var14, 0);
                    class11.method71(arg3, arg1, arg3 + arg4, arg0 + arg1);
                }
            } else {
                class46.field957.method140(var13, arg3 + class183.field3440, class187.field3604 + arg1, 16776960, 0);
            }
        }
    }

    @OriginalMember(owner = "je", name = "a", descriptor = "(Lkc;Z)V")
    public static final void method663(class97 arg0, boolean arg1) {
        if (arg0.field1963 != null) {
            arg0.field1963.field548 = 0;
        }
        arg0.field1961 = false;
        for (class97 var2 = arg0.method613(); var2 != null; var2 = arg0.method630()) {
            method663(var2, arg1);
        }
        if (!arg1) {
            method663(null, false);
        }
        field1849++;
    }
}
