import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class183 {

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "I")
    public int field3190 = -1;

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "Lfg;")
    public static class48 field3188 = new class48(128);

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "Lsi;")
    public static class237 field3191 = new class237(512);

    @OriginalMember(owner = "client!ti", name = "i", descriptor = "I")
    public static int field3192 = 0;

    @OriginalMember(owner = "client!ti", name = "k", descriptor = "[[I")
    public static int[][] field3194 = new int[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!ti", name = "j", descriptor = "Loh;")
    public static class169 field3193 = new class169(5000);

    @OriginalMember(owner = "client!ti", name = "l", descriptor = "Lce;")
    public static class126 field3195 = class206.method1445(-7923, "::replacecanvas");

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "Ltl;")
    public class267 field3185;

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "[I")
    public int[] field3186;

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "[Lce;")
    public class126[] field3187;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIBII[Lwd;IIII)V", line = 5)
    public static final void method1309(int arg0, int arg1, byte arg2, int arg3, int arg4, class112[] arg5, int arg6, int arg7, int arg8, int arg9) {
        if (class56.field846) {
            class101.method687(arg9, arg1, arg0, arg3);
        } else {
            class276.method1862(arg9, arg1, arg0, arg3);
            class236.method1619();
        }
        for (int var10 = 0; var10 < arg5.length; var10++) {
            class112 var11 = arg5[var10];
            if (var11 != null && (var11.field1865 == arg6 || arg6 == -1412584499 && class82.field1324 == var11)) {
                int var12;
                if (arg7 == -1) {
                    class123.field2089[class320.field5481] = var11.field1919 + arg8;
                    class175.field3087[class320.field5481] = var11.field1784 + arg4;
                    class14.field198[class320.field5481] = var11.field1766;
                    class36.field519[class320.field5481] = var11.field1753;
                    var12 = class320.field5481++;
                } else {
                    var12 = arg7;
                }
                var11.field1805 = var12;
                var11.field1921 = class249.field4174;
                if (!var11.field1916 || !client.method814(var11)) {
                    if (var11.field1885 > 0) {
                        class102.method696((byte) 86, var11);
                    }
                    int var13 = var11.field1884;
                    int var14 = var11.field1919 + arg8;
                    int var15 = var11.field1784 + arg4;
                    if (class241.field4091 && (client.method804(var11) != 0 || var11.field1780 == 0) && var13 > 127) {
                        var13 = 127;
                    }
                    if (class82.field1324 == var11) {
                        if (arg6 != -1412584499 && !var11.field1801) {
                            class58.field908 = arg5;
                            class228.field3839 = arg8;
                            class313.field5331 = arg4;
                            continue;
                        }
                        if (class17.field232 && class286.field4760) {
                            int var16 = class138.field2493;
                            int var17 = var16 - class102.field1638;
                            int var18 = class260.field4366;
                            int var19 = var18 - class174.field3085;
                            if (class32.field471 > var17) {
                                var17 = class32.field471;
                            }
                            if (var19 < class234.field3954) {
                                var19 = class234.field3954;
                            }
                            if (class234.field3954 + class88.field1378.field1753 < var11.field1753 + var19) {
                                var19 = class88.field1378.field1753 + class234.field3954 - var11.field1753;
                            }
                            var15 = var19;
                            if ((class32.field471 + class88.field1378.field1766) < (var11.field1766 + var17)) {
                                var17 = class32.field471 + class88.field1378.field1766 - var11.field1766;
                            }
                            var14 = var17;
                        }
                        if (!var11.field1801) {
                            var13 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var11.field1780 == 2) {
                        var20 = arg9;
                        var21 = arg0;
                        var22 = arg1;
                        var23 = arg3;
                    } else {
                        var22 = arg1 >= var15 ? arg1 : var15;
                        var20 = arg9 < var14 ? var14 : arg9;
                        int var24 = var11.field1766 + var14;
                        int var25 = var11.field1753 + var15;
                        if (var11.field1780 == 9) {
                            var25++;
                            var24++;
                        }
                        var23 = var25 < arg3 ? var25 : arg3;
                        var21 = var24 >= arg0 ? arg0 : var24;
                    }
                    if (!var11.field1916 || var21 > var20 && var23 > var22) {
                        if (var11.field1885 != 0) {
                            if (var11.field1885 == 1337 || var11.field1885 == 1403 && class56.field846) {
                                class249.field4164 = var15;
                                class46.field717 = var11;
                                class162.field2919 = var14;
                                class58.method398(var11.field1885 == 1403, -27913, var11.field1766, var14, var11.field1753, var15);
                                if (class56.field846) {
                                    class101.method687(arg9, arg1, arg0, arg3);
                                } else {
                                    class276.method1862(arg9, arg1, arg0, arg3);
                                }
                                continue;
                            }
                            if (var11.field1885 == 1338) {
                                if (!var11.method738((byte) -40)) {
                                    continue;
                                }
                                class209.method1459(true, var14, var12, var15, var11);
                                if (class56.field846) {
                                    class101.method687(arg9, arg1, arg0, arg3);
                                } else {
                                    class276.method1862(arg9, arg1, arg0, arg3);
                                }
                                if (class182.field3175 != 0 && class182.field3175 != 3 || class51.field783 || class322.field5496 < var20 || class128.field2198 < var22 || class322.field5496 >= var21 || var23 <= class128.field2198) {
                                    continue;
                                }
                                int var41 = class322.field5496 - var14;
                                int var42 = class128.field2198 - var15;
                                int var43 = var11.field1796[var42];
                                if (var43 > var41 || var41 > (var11.field1772[var42] + var43)) {
                                    continue;
                                }
                                int var44 = var42 - var11.field1753 / 2;
                                int var45 = var41 - var11.field1766 / 2;
                                int var46 = class180.field3134 + class144.field2618 & 0x7FF;
                                int var47 = class236.field3985[var46];
                                int var48 = (class234.field3951 + 256) * var47 >> 8;
                                int var49 = class236.field3971[var46];
                                int var50 = (class234.field3951 + 256) * var49 >> 8;
                                int var51 = var44 * var50 - var45 * var48 >> 11;
                                int var52 = var44 * var48 + (var45 * var50) >> 11;
                                int var53 = class286.field4744.field2461 + var52 >> 7;
                                int var54 = class286.field4744.field2487 - var51 >> 7;
                                if (class313.field5371 && (class9.field105 & 0x40) != 0) {
                                    class112 var55 = class53.method337((byte) -127, class189.field3250, class52.field797);
                                    if (var55 == null) {
                                        class300.method2017(60);
                                    } else {
                                        class224.method1536(class128.field2203, class85.field1345, -125, var53, (short) 23, 1L, -1, var54);
                                    }
                                    continue;
                                }
                                if (class23.field335 == 1) {
                                    class224.method1536(class224.field3772, class65.field1096, -122, var53, (short) 51, 1L, -1, var54);
                                }
                                class224.method1536(class224.field3772, class286.field4745, -125, var53, (short) 32, 1L, -1, var54);
                                continue;
                            }
                            if (var11.field1885 == 1339) {
                                if (var11.method738((byte) -46)) {
                                    class176.method1275(var12, var11, var14, var15, 64);
                                    if (class56.field846) {
                                        class101.method687(arg9, arg1, arg0, arg3);
                                    } else {
                                        class276.method1862(arg9, arg1, arg0, arg3);
                                    }
                                }
                                continue;
                            }
                            if (var11.field1885 == 1400) {
                                class254.method1721(var11.field1766, var15, (byte) -33, var14, var11.field1753);
                                class220.field3698[var12] = true;
                                class250.field4186[var12] = true;
                                if (class56.field846) {
                                    class101.method687(arg9, arg1, arg0, arg3);
                                } else {
                                    class276.method1862(arg9, arg1, arg0, arg3);
                                }
                                continue;
                            }
                            if (var11.field1885 == 1401) {
                                class102.method698(var11.field1766, var14, var11.field1753, var15, 0);
                                class220.field3698[var12] = true;
                                class250.field4186[var12] = true;
                                if (class56.field846) {
                                    class101.method687(arg9, arg1, arg0, arg3);
                                } else {
                                    class276.method1862(arg9, arg1, arg0, arg3);
                                }
                                continue;
                            }
                            if (var11.field1885 == 1402) {
                                if (!class56.field846) {
                                    class124.method829(var15, (byte) 18, var14);
                                    class220.field3698[var12] = true;
                                    class250.field4186[var12] = true;
                                }
                                continue;
                            }
                            if (var11.field1885 == 1405) {
                                if (!class37.field550) {
                                    continue;
                                }
                                int var26 = var11.field1766 + var14;
                                int var27 = var15 + 15;
                                class174.field3077.method2146(class12.method69(new class126[] { class54.field822, class195.method1386((byte) 20, class262.field4383) }, (byte) 127), var26, var27, 16776960, -1);
                                int var141 = var27 + 15;
                                int var28 = 16776960;
                                Runtime var29 = Runtime.getRuntime();
                                int var30 = (int) ((var29.totalMemory() - var29.freeMemory()) / 1024L);
                                if (var30 > 65536) {
                                    var28 = 16711680;
                                }
                                class174.field3077.method2146(class12.method69(new class126[] { class223.field3759, class195.method1386((byte) 20, var30), class52.field796 }, (byte) 120), var26, var141, var28, -1);
                                var27 = var141 + 15;
                                if (class56.field846) {
                                    int var31 = 16776960;
                                    int var32 = (class121.field2022 + class121.field2025 + class121.field2026) / 1024;
                                    if (var32 > 65536) {
                                        var31 = 16711680;
                                    }
                                    class174.field3077.method2146(class12.method69(new class126[] { class153.field2804, class195.method1386((byte) 20, var32), class52.field796 }, (byte) 117), var26, var27, var31, -1);
                                    var27 += 15;
                                }
                                int var33 = 16776960;
                                int var34 = 0;
                                int var35 = 0;
                                int var36 = 0;
                                for (int var37 = 0; var37 < 28; var37++) {
                                    var34 += class293.field4868[var37].method1382((byte) -125);
                                    var36 += class293.field4868[var37].method1383(-1473004792);
                                    var35 += class293.field4868[var37].method1381(125);
                                }
                                int var38 = var35 * 100 / var34;
                                int var39 = var36 * 10000 / var34;
                                class126 var40 = class12.method69(new class126[] { class125.field2111, class52.method328((byte) 27, 0, 2, (long) var39, true), class81.field1313, class195.method1386((byte) 20, var38), class96.field1530 }, (byte) 115);
                                class118.field1987.method2146(var40, var26, var27, var33, -1);
                                var27 += 12;
                                class220.field3698[var12] = true;
                                class250.field4186[var12] = true;
                                continue;
                            }
                            if (var11.field1885 == 1406) {
                                class260.field4359 = var11;
                                class100.field1621 = var14;
                                class161.field2910 = var15;
                                continue;
                            }
                        }
                        if (!class51.field783) {
                            if (var11.field1780 == 0 && var11.field1892 && var20 <= class322.field5496 && var22 <= class128.field2198 && class322.field5496 < var21 && class128.field2198 < var23 && !class241.field4091) {
                                class296.field4932[0] = class142.field2582;
                                class173.field3067 = 1;
                                class84.field1341[0] = 1007;
                                class131.field2247[0] = class202.field3465;
                                class214.field3636[0] = class224.field3772;
                            }
                            if (var20 <= class322.field5496 && var22 <= class128.field2198 && class322.field5496 < var21 && var23 > class128.field2198) {
                                class159.method1172((byte) 6, class322.field5496 - var14, -var15 + class128.field2198, var11);
                            }
                        }
                        if (var11.field1780 == 0) {
                            if (!var11.field1916 && client.method814(var11) && class74.field1197 != var11) {
                                continue;
                            }
                            if (!var11.field1916) {
                                if (var11.field1791 - var11.field1753 < var11.field1827) {
                                    var11.field1827 = var11.field1791 - var11.field1753;
                                }
                                if (var11.field1827 < 0) {
                                    var11.field1827 = 0;
                                }
                            }
                            method1309(var21, var22, (byte) -126, var23, var15 - var11.field1827, arg5, var11.field1833, var12, var14 - var11.field1880, var20);
                            if (var11.field1810 != null) {
                                method1309(var21, var22, (byte) -128, var23, var15 - var11.field1827, var11.field1810, var11.field1833, var12, var14 - var11.field1880, var20);
                            }
                            class65 var56 = (class65) class16.field222.method1631(false, (long) var11.field1833);
                            if (var56 != null) {
                                if (var56.field1099 == 0 && !class51.field783 && var20 <= class322.field5496 && var22 <= class128.field2198 && class322.field5496 < var21 && class128.field2198 < var23 && !class241.field4091) {
                                    class131.field2247[0] = class202.field3465;
                                    class173.field3067 = 1;
                                    class296.field4932[0] = class142.field2582;
                                    class84.field1341[0] = 1007;
                                    class214.field3636[0] = class224.field3772;
                                }
                                class264.method1773(var23, var21, var15, var14, var20, var22, var12, (byte) 122, var56.field1097);
                            }
                            if (class56.field846) {
                                class101.method687(arg9, arg1, arg0, arg3);
                            } else {
                                class276.method1862(arg9, arg1, arg0, arg3);
                                class236.method1619();
                            }
                        }
                        if (class234.field3956[var12] || class226.field3804 > 1) {
                            if (var11.field1780 == 0 && !var11.field1916 && var11.field1753 < var11.field1791) {
                                class252.method1705((byte) -8, var14 + var11.field1766, var15, var11.field1791, var11.field1827, var11.field1753);
                            }
                            if (var11.field1780 != 1) {
                                if (var11.field1780 == 2) {
                                    int var124 = 0;
                                    for (int var125 = 0; var125 < var11.field1850; var125++) {
                                        for (int var126 = 0; var126 < var11.field1831; var126++) {
                                            int var127 = (var11.field1888 + 32) * var126 + var14;
                                            int var128 = var15 + ((var11.field1754 + 32) * var125);
                                            if (var124 < 20) {
                                                var128 += var11.field1859[var124];
                                                var127 += var11.field1771[var124];
                                            }
                                            if (var11.field1849[var124] > 0) {
                                                boolean var130 = false;
                                                boolean var131 = false;
                                                int var132 = var11.field1849[var124] - 1;
                                                if (arg9 < (var127 + 32) && arg0 > var127 && (var128 + 32) > arg1 && var128 < arg3 || class122.field2052 == var11 && class212.field3616 == var124) {
                                                    class273 var133;
                                                    if (class257.field4316 == 1 && class24.field352 == var124 && class251.field4207 == var11.field1833) {
                                                        var133 = class172.method1254(var132, 2, var11.field1899[var124], 0, var11.field1920, (byte) -59);
                                                    } else {
                                                        var133 = class172.method1254(var132, 1, var11.field1899[var124], 3153952, var11.field1920, (byte) -59);
                                                    }
                                                    if (class236.field3977) {
                                                        class220.field3698[var12] = true;
                                                    }
                                                    if (var133 == null) {
                                                        class23.method114(var11, (byte) 94);
                                                    } else if (class122.field2052 == var11 && class212.field3616 == var124) {
                                                        int var134 = class260.field4366 - class174.field3074;
                                                        int var135 = class138.field2493 - class249.field4177;
                                                        if (var134 < 5 && var134 > -5) {
                                                            var134 = 0;
                                                        }
                                                        if (var135 < 5 && var135 > -5) {
                                                            var135 = 0;
                                                        }
                                                        if (class51.field787 < 5) {
                                                            var135 = 0;
                                                            var134 = 0;
                                                        }
                                                        var133.method1318(var127 + var135, var128 - -var134, 128);
                                                        if (arg6 != -1) {
                                                            class112 var136 = arg5[arg6 & 0xFFFF];
                                                            int var137;
                                                            int var138;
                                                            if (class56.field846) {
                                                                var137 = class101.field1629;
                                                                var138 = class101.field1628;
                                                            } else {
                                                                var138 = class276.field4621;
                                                                var137 = class276.field4627;
                                                            }
                                                            if (var128 + var134 < var137 && var136.field1827 > 0) {
                                                                int var139 = (var137 - var128 - var134) * class303.field5038 / 3;
                                                                if ((class303.field5038 * 10) < var139) {
                                                                    var139 = class303.field5038 * 10;
                                                                }
                                                                if (var139 > var136.field1827) {
                                                                    var139 = var136.field1827;
                                                                }
                                                                var136.field1827 -= var139;
                                                                class174.field3074 += var139;
                                                                class23.method114(var136, (byte) 94);
                                                            }
                                                            if ((var128 + var134 + 32) > var138 && var136.field1827 < var136.field1791 - var136.field1753) {
                                                                int var140 = (var128 + var134 + 32 - var138) * class303.field5038 / 3;
                                                                if (class303.field5038 * 10 < var140) {
                                                                    var140 = class303.field5038 * 10;
                                                                }
                                                                if ((var136.field1791 - var136.field1827 - var136.field1753) < var140) {
                                                                    var140 = var136.field1791 - var136.field1753 - var136.field1827;
                                                                }
                                                                var136.field1827 += var140;
                                                                class174.field3074 -= var140;
                                                                class23.method114(var136, (byte) 94);
                                                            }
                                                        }
                                                    } else if (class180.field3138 == var11 && class168.field2977 == var124) {
                                                        var133.method1318(var127, var128, 128);
                                                    } else {
                                                        var133.method1333(var127, var128);
                                                    }
                                                }
                                            } else if (var11.field1835 != null && var124 < 20) {
                                                class273 var129 = var11.method750(true, var124);
                                                if (var129 != null) {
                                                    var129.method1333(var127, var128);
                                                } else if (class292.field4838) {
                                                    class23.method114(var11, (byte) 94);
                                                }
                                            }
                                            var124++;
                                        }
                                    }
                                } else if (var11.field1780 == 3) {
                                    int var57;
                                    if (class143.method1044((byte) -115, var11)) {
                                        var57 = var11.field1755;
                                        if (class74.field1197 == var11 && var11.field1910 != 0) {
                                            var57 = var11.field1910;
                                        }
                                    } else {
                                        var57 = var11.field1877;
                                        if (class74.field1197 == var11 && var11.field1789 != 0) {
                                            var57 = var11.field1789;
                                        }
                                    }
                                    if (var13 == 0) {
                                        if (var11.field1854) {
                                            if (class56.field846) {
                                                class101.method689(var14, var15, var11.field1766, var11.field1753, var57);
                                            } else {
                                                class276.method1844(var14, var15, var11.field1766, var11.field1753, var57);
                                            }
                                        } else if (class56.field846) {
                                            class101.method681(var14, var15, var11.field1766, var11.field1753, var57);
                                        } else {
                                            class276.method1842(var14, var15, var11.field1766, var11.field1753, var57);
                                        }
                                    } else if (var11.field1854) {
                                        if (class56.field846) {
                                            class101.method695(var14, var15, var11.field1766, var11.field1753, var57, 256 - (var13 & 0xFF));
                                        } else {
                                            class276.method1853(var14, var15, var11.field1766, var11.field1753, var57, 256 - (var13 & 0xFF));
                                        }
                                    } else if (class56.field846) {
                                        class101.method686(var14, var15, var11.field1766, var11.field1753, var57, 256 - (var13 & 0xFF));
                                    } else {
                                        class276.method1848(var14, var15, var11.field1766, var11.field1753, var57, 256 - (var13 & 0xFF));
                                    }
                                } else if (var11.field1780 == 4) {
                                    class312 var58 = var11.method744(23020, class119.field2007);
                                    if (var58 != null) {
                                        class126 var59 = var11.field1802;
                                        int var60;
                                        if (class143.method1044((byte) -128, var11)) {
                                            var60 = var11.field1755;
                                            if (class74.field1197 == var11 && var11.field1910 != 0) {
                                                var60 = var11.field1910;
                                            }
                                            if (var11.field1799.method878((byte) 59) > 0) {
                                                var59 = var11.field1799;
                                            }
                                        } else {
                                            var60 = var11.field1877;
                                            if (class74.field1197 == var11 && var11.field1789 != 0) {
                                                var60 = var11.field1789;
                                            }
                                        }
                                        if (var11.field1916 && var11.field1803 != -1) {
                                            class137 var61 = class68.method498(84, var11.field1803);
                                            var59 = var61.field2396;
                                            if (var59 == null) {
                                                var59 = class234.field3950;
                                            }
                                            if ((var61.field2407 == 1 || var11.field1775 != 1) && var11.field1775 != -1) {
                                                var59 = class12.method69(new class126[] { class99.field1598, var59, class169.field3011, class253.method1711(var11.field1775, 103) }, (byte) 118);
                                            }
                                        }
                                        if (class64.field1084 == var11) {
                                            var59 = class103.field1646;
                                            var60 = var11.field1877;
                                        }
                                        if (!var11.field1916) {
                                            var59 = class158.method1160(var11, -68, var59);
                                        }
                                        var58.method2153(var59, var14, var15, var11.field1766, var11.field1753, var60, var11.field1821 ? 0 : -1, var11.field1851, var11.field1840, var11.field1905);
                                    } else if (class292.field4838) {
                                        class23.method114(var11, (byte) 94);
                                    }
                                } else if (var11.field1780 == 5) {
                                    if (var11.field1916) {
                                        class273 var62;
                                        if (var11.field1803 == -1) {
                                            var62 = var11.method740(false, (byte) -23);
                                        } else {
                                            var62 = class172.method1254(var11.field1803, var11.field1759, var11.field1775, var11.field1907, var11.field1920, (byte) -59);
                                        }
                                        if (var62 != null) {
                                            int var63 = var62.field4597;
                                            int var64 = var62.field4600;
                                            if (var11.field1906) {
                                                int var65 = (var64 + var11.field1766 - 1) / var64;
                                                int var66 = (var63 - (1 - var11.field1753)) / var63;
                                                if (class56.field846) {
                                                    class198 var67 = (class198) var62;
                                                    class101.method692(var14, var15, var11.field1766 + var14, var11.field1753 + var15);
                                                    boolean var68 = class169.method1240(var62.field4595, (byte) -74);
                                                    boolean var69 = class169.method1240(var62.field4601, (byte) -74);
                                                    if (var68 && var69) {
                                                        if (var13 == 0) {
                                                            var67.method1401(var14, var15, var65, var66);
                                                        } else {
                                                            var67.method1404(var14, var15, 256 - (var13 & 0xFF), var65, var66);
                                                        }
                                                    } else if (var68) {
                                                        for (int var73 = 0; var73 < var66; var73++) {
                                                            if (var13 == 0) {
                                                                var67.method1401(var14, var63 * var73 + var15, var65, 1);
                                                            } else {
                                                                var67.method1404(var14, var63 * var73 + var15, -(var13 & 0xFF) + 256, var65, 1);
                                                            }
                                                        }
                                                    } else if (var69) {
                                                        for (int var70 = 0; var70 < var65; var70++) {
                                                            if (var13 == 0) {
                                                                var67.method1401(var64 * var70 + var14, var15, 1, var66);
                                                            } else {
                                                                var67.method1404(var64 * var70 + var14, var15, 256 - (var13 & 0xFF), 1, var66);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var71 = 0; var71 < var65; var71++) {
                                                            for (int var72 = 0; var72 < var66; var72++) {
                                                                if (var13 == 0) {
                                                                    var62.method1333(var64 * var71 + var14, var63 * var72 + var15);
                                                                } else {
                                                                    var62.method1318(var64 * var71 + var14, var15 - -(var63 * var72), 256 - (var13 & 0xFF));
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class101.method687(arg9, arg1, arg0, arg3);
                                                } else {
                                                    class276.method1854(var14, var15, var11.field1766 + var14, var11.field1753 + var15);
                                                    for (int var74 = 0; var74 < var65; var74++) {
                                                        for (int var75 = 0; var75 < var66; var75++) {
                                                            if (var11.field1862 != 0) {
                                                                var62.method1830(4096, 875013576, var15 - (-(var63 * var75) - var63 / 2), var11.field1862, var64 / 2 + var64 * var74 + var14);
                                                            } else if (var13 == 0) {
                                                                var62.method1333(var64 * var74 + var14, var63 * var75 + var15);
                                                            } else {
                                                                var62.method1318(var14 + (var64 * var74), var63 * var75 + var15, 256 - (var13 & 0xFF));
                                                            }
                                                        }
                                                    }
                                                    class276.method1862(arg9, arg1, arg0, arg3);
                                                }
                                            } else {
                                                int var76 = var11.field1766 * 4096 / var64;
                                                if (var11.field1862 != 0) {
                                                    var62.method1830(var76, 875013576, var15 + (var11.field1753 / 2), var11.field1862, var11.field1766 / 2 + var14);
                                                } else if (var13 != 0) {
                                                    var62.method1316(var14, var15, var11.field1766, var11.field1753, 256 - (var13 & 0xFF));
                                                } else if (var11.field1766 == var64 && var11.field1753 == var63) {
                                                    var62.method1333(var14, var15);
                                                } else {
                                                    var62.method1331(var14, var15, var11.field1766, var11.field1753);
                                                }
                                            }
                                        } else if (class292.field4838) {
                                            class23.method114(var11, (byte) 94);
                                        }
                                    } else {
                                        class273 var77 = var11.method740(class143.method1044((byte) -93, var11), (byte) -23);
                                        if (var77 != null) {
                                            var77.method1333(var14, var15);
                                        } else if (class292.field4838) {
                                            class23.method114(var11, (byte) 94);
                                        }
                                    }
                                } else if (var11.field1780 == 6) {
                                    boolean var78 = class143.method1044((byte) -122, var11);
                                    int var79;
                                    if (var78) {
                                        var79 = var11.field1788;
                                    } else {
                                        var79 = var11.field1824;
                                    }
                                    class196 var80 = null;
                                    int var81 = 0;
                                    if (var11.field1803 != -1) {
                                        class137 var82 = class68.method498(29, var11.field1803);
                                        if (var82 != null) {
                                            class137 var83 = var82.method995(var11.field1775, false);
                                            class294 var84 = var79 == -1 ? null : class110.method721(-127, var79);
                                            var80 = var83.method992(var84, 1, var11.field1793, 0);
                                            if (var80 == null) {
                                                class23.method114(var11, (byte) 94);
                                            } else {
                                                var81 = -var80.method225() / 2;
                                            }
                                        }
                                    } else if (var11.field1800 == 5) {
                                        if (var11.field1774 == -1) {
                                            var80 = class19.field259.method1659(5734, (class294) null, -1, (class294) null, -1, true);
                                        } else {
                                            int var86 = var11.field1774 & 0x7FF;
                                            if (class11.field145 == var86) {
                                                var86 = 2047;
                                            }
                                            class301 var87 = class85.field1352[var86];
                                            class294 var88 = var79 == -1 ? null : class110.method721(-125, var79);
                                            if (var87 != null && ((int) var87.field5019.method845((byte) -123) << 11) == (var11.field1774 & 0xFFFFF800)) {
                                                var80 = var87.field5004.method1659(5734, var88, var11.field1793, (class294) null, 0, true);
                                            }
                                        }
                                    } else if (var79 == -1) {
                                        var80 = var11.method748((class294) null, 11520, -1, class286.field4744.field5004, var78);
                                        if (var80 == null && class292.field4838) {
                                            class23.method114(var11, (byte) 94);
                                        }
                                    } else {
                                        class294 var85 = class110.method721(-126, var79);
                                        var80 = var11.method748(var85, 11520, var11.field1793, class286.field4744.field5004, var78);
                                        if (var80 == null && class292.field4838) {
                                            class23.method114(var11, (byte) 94);
                                        }
                                    }
                                    if (var80 != null) {
                                        int var89;
                                        if (var11.field1806 > 0) {
                                            var89 = (var11.field1766 << 8) / var11.field1806;
                                        } else {
                                            var89 = 256;
                                        }
                                        int var90;
                                        if (var11.field1897 <= 0) {
                                            var90 = 256;
                                        } else {
                                            var90 = (var11.field1753 << 8) / var11.field1897;
                                        }
                                        int var91 = var15 - (-(var11.field1886 * var90 >> 8) - (var11.field1753 / 2));
                                        int var92 = var11.field1766 / 2 + (var14 + (var11.field1758 * var89 >> 8));
                                        if (class56.field846) {
                                            if (var11.field1883) {
                                                class56.method373(var92, var91, var11.field1770, var11.field1836, var89, var90);
                                            } else {
                                                class56.method377(var92, var91, var89, var90);
                                                class56.method353((float) var11.field1826, (float) var11.field1836 * 1.5F);
                                            }
                                            class56.method368();
                                            class56.method369(true);
                                            class56.method361(false);
                                            class202.method1427((byte) -128, class287.field4776);
                                            if (class59.field923) {
                                                class101.method682();
                                                class56.method362();
                                                class101.method687(arg9, arg1, arg0, arg3);
                                                class59.field923 = false;
                                            }
                                            if (var11.field1790) {
                                                class56.method356();
                                            }
                                            int var93 = class236.field3971[var11.field1843] * var11.field1770 >> 16;
                                            int var94 = class236.field3985[var11.field1843] * var11.field1770 >> 16;
                                            if (var11.field1916) {
                                                var80.method220(0, var11.field1891, var11.field1794, var11.field1843, var11.field1902, var94 + var11.field1878 + var81, var11.field1878 + var93, -1L);
                                            } else {
                                                var80.method220(0, var11.field1891, 0, var11.field1843, 0, var94, var93, -1L);
                                            }
                                            if (var11.field1790) {
                                                class56.method360();
                                            }
                                        } else {
                                            class236.method1611(var92, var91);
                                            int var95 = class236.field3985[var11.field1843] * var11.field1770 >> 16;
                                            int var96 = class236.field3971[var11.field1843] * var11.field1770 >> 16;
                                            if (!var11.field1916) {
                                                var80.method220(0, var11.field1891, 0, var11.field1843, 0, var95, var96, -1L);
                                            } else if (var11.field1883) {
                                                ((class38) var80).method214(0, var11.field1891, var11.field1794, var11.field1843, var11.field1902, var81 + var95 + var11.field1878, var11.field1878 + var96, var11.field1770);
                                            } else {
                                                var80.method220(0, var11.field1891, var11.field1794, var11.field1843, var11.field1902, var11.field1878 + var81 + var95, var11.field1878 + var96, -1L);
                                            }
                                            class236.method1607();
                                        }
                                    }
                                } else {
                                    if (var11.field1780 == 7) {
                                        class312 var97 = var11.method744(23020, class119.field2007);
                                        if (var97 == null) {
                                            if (class292.field4838) {
                                                class23.method114(var11, (byte) 94);
                                            }
                                            continue;
                                        }
                                        int var98 = 0;
                                        for (int var99 = 0; var99 < var11.field1850; var99++) {
                                            for (int var100 = 0; var100 < var11.field1831; var100++) {
                                                if (var11.field1849[var98] > 0) {
                                                    class137 var101 = class68.method498(14, var11.field1849[var98] - 1);
                                                    class126 var102;
                                                    if (var101.field2407 != 1 && var11.field1899[var98] == 1) {
                                                        var102 = class12.method69(new class126[] { class99.field1598, var101.field2396, class228.field3841 }, (byte) 125);
                                                    } else {
                                                        var102 = class12.method69(new class126[] { class99.field1598, var101.field2396, class169.field3011, class253.method1711(var11.field1899[var98], 102) }, (byte) 127);
                                                    }
                                                    int var103 = (var11.field1888 + 115) * var100 + var14;
                                                    int var104 = (var11.field1754 + 12) * var99 + var15;
                                                    if (var11.field1851 == 0) {
                                                        var97.method2135(var102, var103, var104, var11.field1877, var11.field1821 ? 0 : -1);
                                                    } else if (var11.field1851 == 1) {
                                                        var97.method2144(var102, var103 + 57, var104, var11.field1877, var11.field1821 ? 0 : -1);
                                                    } else {
                                                        var97.method2146(var102, var103 + 114, var104, var11.field1877, var11.field1821 ? 0 : -1);
                                                    }
                                                }
                                                var98++;
                                            }
                                        }
                                    }
                                    if (var11.field1780 == 8 && class150.field2742 == var11 && class197.field3367 == class144.field2620) {
                                        int var105 = 0;
                                        class312 var106 = class174.field3077;
                                        int var107 = 0;
                                        class126 var108 = var11.field1802;
                                        class126 var109 = class158.method1160(var11, -88, var108);
                                        while (var109.method878((byte) 80) > 0) {
                                            int var110 = var109.method875(class265.field4491, -41);
                                            class126 var111;
                                            if (var110 == -1) {
                                                var111 = var109;
                                                var109 = class224.field3772;
                                            } else {
                                                var111 = var109.method859(var110, -107, 0);
                                                var109 = var109.method879(-14178, var110 + 4);
                                            }
                                            int var112 = var106.method2154(var111);
                                            var107 += var106.field5291 + 1;
                                            if (var105 < var112) {
                                                var105 = var112;
                                            }
                                        }
                                        var107 += 7;
                                        var105 += 6;
                                        int var113 = var11.field1766 + var14 - var105 - 5;
                                        int var114 = var15 + var11.field1753 + 5;
                                        if (var113 < (var14 + 5)) {
                                            var113 = var14 + 5;
                                        }
                                        if (arg0 < (var105 + var113)) {
                                            var113 = arg0 - var105;
                                        }
                                        if (var107 + var114 > arg3) {
                                            var114 = arg3 - var107;
                                        }
                                        if (class56.field846) {
                                            class101.method689(var113, var114, var105, var107, 16777120);
                                            class101.method681(var113, var114, var105, var107, 0);
                                        } else {
                                            class276.method1844(var113, var114, var105, var107, 16777120);
                                            class276.method1842(var113, var114, var105, var107, 0);
                                        }
                                        int var115 = var106.field5291 + var114 + 2;
                                        class126 var116 = var11.field1802;
                                        class126 var117 = class158.method1160(var11, -107, var116);
                                        while (var117.method878((byte) 102) > 0) {
                                            int var118 = var117.method875(class265.field4491, -62);
                                            class126 var119;
                                            if (var118 == -1) {
                                                var119 = var117;
                                                var117 = class224.field3772;
                                            } else {
                                                var119 = var117.method859(var118, -120, 0);
                                                var117 = var117.method879(-14178, var118 + 4);
                                            }
                                            var106.method2135(var119, var113 + 3, var115, 0, -1);
                                            var115 += var106.field5291 + 1;
                                        }
                                    }
                                    if (var11.field1780 == 9) {
                                        int var120;
                                        int var121;
                                        int var122;
                                        int var123;
                                        if (var11.field1798) {
                                            var120 = var14 + var11.field1766;
                                            var121 = var15;
                                            var122 = var14;
                                            var123 = var11.field1753 + var15;
                                        } else {
                                            var123 = var15;
                                            var121 = var11.field1753 + var15;
                                            var120 = var11.field1766 + var14;
                                            var122 = var14;
                                        }
                                        if (var11.field1860 == 1) {
                                            if (class56.field846) {
                                                class101.method688(var122, var123, var120, var121, var11.field1877);
                                            } else {
                                                class276.method1855(var122, var123, var120, var121, var11.field1877);
                                            }
                                        } else if (class56.field846) {
                                            class101.method683(var122, var123, var120, var121, var11.field1877, var11.field1860);
                                        } else {
                                            class276.method1845(var122, var123, var120, var121, var11.field1877, var11.field1860);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg2 > -120) {
            method1311(false, (byte[]) null, 82);
        }
        field3189++;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Z)V", line = 1286)
    public static void method1310(boolean arg0) {
        if (arg0) {
            method1311(false, (byte[]) null, 78);
        }
        field3191 = null;
        field3193 = null;
        field3194 = (int[][]) null;
        field3188 = null;
        field3195 = null;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Z[BI)Ljava/lang/Object;", line = 1308)
    public static final Object method1311(boolean arg0, byte[] arg1, int arg2) {
        field3184++;
        int var3 = 93 / ((-arg2 - 86) / 32);
        if (arg1 == null) {
            return null;
        }
        if (arg1.length > 136 && !class267.field4526) {
            try {
                class200 var4 = (class200) Class.forName("cl").getDeclaredConstructor().newInstance();
                var4.method717(arg1, 113);
                return var4;
            } catch (Throwable var6) {
                class267.field4526 = true;
            }
        }
        return arg0 ? class7.method41(arg1, true) : arg1;
    }
}
