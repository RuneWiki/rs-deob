import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("hb")
public class class71 {

    @OriginalMember(owner = "hb", name = "a", descriptor = "Llf;")
    public static class109 field1377 = class35.method275("<col=ffff00>*V", 2);

    @OriginalMember(owner = "hb", name = "g", descriptor = "I")
    public static int field1383 = -1;

    @OriginalMember(owner = "hb", name = "k", descriptor = "Llf;")
    private static class109 field1387 = class35.method275("Loaded textures", 2);

    @OriginalMember(owner = "hb", name = "l", descriptor = "Llf;")
    public static class109 field1388 = field1387;

    @OriginalMember(owner = "hb", name = "m", descriptor = "Llf;")
    public static class109 field1389 = class35.method275("jlv", 2);

    @OriginalMember(owner = "hb", name = "b", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "hb", name = "d", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "hb", name = "h", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "hb", name = "j", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "hb", name = "e", descriptor = "J")
    public long field1381;

    @OriginalMember(owner = "hb", name = "c", descriptor = "Lbg;")
    public static class18 field1379;

    @OriginalMember(owner = "hb", name = "f", descriptor = "Lhb;")
    public class71 field1382;

    @OriginalMember(owner = "hb", name = "i", descriptor = "Lhb;")
    public class71 field1385;

    @OriginalMember(owner = "hb", name = "a", descriptor = "(B)V")
    public static void method450(byte arg0) {
        field1388 = null;
        field1377 = null;
        if (arg0 < 116) {
            method450((byte) -96);
        }
        field1379 = null;
        field1387 = null;
        field1389 = null;
    }

    @OriginalMember(owner = "hb", name = "b", descriptor = "(B)Z")
    public final boolean method451(byte arg0) {
        field1378++;
        if (arg0 != -8) {
            this.field1385 = null;
        }
        return this.field1382 != null;
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(Z)V")
    public final void method452(boolean arg0) {
        field1380++;
        if (!arg0) {
            this.method451((byte) -53);
        }
        if (this.field1382 != null) {
            this.field1382.field1385 = this.field1385;
            this.field1385.field1382 = this.field1382;
            this.field1385 = null;
            this.field1382 = null;
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(IIIII[Lvg;III)V")
    public static final void method453(int arg0, int arg1, int arg2, int arg3, int arg4, class200[] arg5, int arg6, int arg7, int arg8) {
        if (arg2 >= -35) {
            method453(-100, 97, -35, -93, 19, null, 3, 11, -55);
        }
        field1384++;
        for (int var9 = 0; var9 < arg5.length; var9++) {
            class200 var10 = arg5[var9];
            if (var10 != null && (!var10.field3946 || var10.field3875 == 0 || var10.field3890 || class126.method918(var10, 101) != 0 || class46.field955 == var10 || var10.field3916 == 1338) && var10.field3868 == arg7 && (!var10.field3946 || !class113.method834((byte) 20, var10))) {
                int var11 = var10.field3825 + arg8;
                int var12 = var10.field3936 + arg4;
                if (class182.field3431 == var10) {
                    field1383 = var12;
                    class52.field1048 = true;
                    class139.field2697 = var11;
                }
                int var13;
                int var14;
                int var17;
                int var18;
                if (var10.field3875 == 2) {
                    var18 = arg0;
                    var13 = arg6;
                    var14 = arg3;
                    var17 = arg1;
                } else if (var10.field3875 == 9) {
                    int var19 = var11;
                    int var20 = var12;
                    int var21 = var12 + var10.field3901;
                    int var22 = var10.field3881 + var11;
                    if (var11 > var22) {
                        var19 = var22;
                        var22 = var11;
                    }
                    if (var21 < var12) {
                        var20 = var21;
                        var21 = var12;
                    }
                    var22++;
                    var21++;
                    var13 = arg6 >= var19 ? arg6 : var19;
                    var17 = var22 < arg1 ? var22 : arg1;
                    var18 = var21 < arg0 ? var21 : arg0;
                    var14 = var20 <= arg3 ? arg3 : var20;
                } else {
                    var13 = var11 <= arg6 ? arg6 : var11;
                    var14 = var12 <= arg3 ? arg3 : var12;
                    int var15 = var12 + var10.field3901;
                    int var16 = var10.field3881 + var11;
                    var17 = arg1 <= var16 ? arg1 : var16;
                    var18 = arg0 > var15 ? var15 : arg0;
                }
                if (!var10.field3946 || var17 > var13 && var18 > var14) {
                    if (var10.field3916 == 1337) {
                        class115.method851(var10, -23101);
                    } else {
                        if (var10.field3875 == 0) {
                            if (!var10.field3946 && class113.method834((byte) -121, var10) && class209.field4069 != var10) {
                                continue;
                            }
                            method453(var18, var17, -65, var14, var12 - var10.field3945, arg5, var13, var10.field3866, var11 - var10.field3817);
                            if (var10.field3898 != null) {
                                method453(var18, var17, -83, var14, var12 - var10.field3945, var10.field3898, var13, var10.field3866, var11 - var10.field3817);
                            }
                            class60 var25 = (class60) class113.field2236.method337((long) var10.field3866, (byte) -101);
                            if (var25 != null) {
                                class104.method744(var11, (byte) 117, var18, var14, var13, var17, var12, var25.field1174);
                            }
                        }
                        if (var10.field3946) {
                            boolean var26;
                            if (class21.field479 >= var13 && var14 <= class109.field2134 && var17 > class21.field479 && var18 > class109.field2134) {
                                var26 = true;
                            } else {
                                var26 = false;
                            }
                            boolean var27 = false;
                            if (class206.field4043 == 1 && var26) {
                                var27 = true;
                            }
                            boolean var28 = false;
                            if (class69.field1333 == 1 && var13 <= class129.field2511 && var14 <= class67.field1310 && class129.field2511 < var17 && var18 > class67.field1310) {
                                var28 = true;
                            }
                            if (var10.field3916 == 1338) {
                                if (var28) {
                                    class60.method393(class67.field1310 - var12, var10, class129.field2511 - var11, (byte) 100);
                                }
                                continue;
                            }
                            if (var28) {
                                class78.method506(class67.field1310 - var12, var10, class129.field2511 - var11, (byte) 89);
                            }
                            if (class182.field3431 != null && class182.field3431 != var10 && var26 && class49.method330(1, class126.method918(var10, 110))) {
                                class48.field984 = var10;
                            }
                            if (class46.field955 == var10) {
                                class193.field3688 = var12;
                                class27.field596 = true;
                                class21.field473 = var11;
                            }
                            if (var10.field3890) {
                                if (var26 && class46.field963 != 0 && var10.field3937 != null) {
                                    class82 var29 = new class82();
                                    var29.field1611 = class46.field963;
                                    var29.field1613 = var10.field3937;
                                    var29.field1608 = var10;
                                    class177.field3337.method1231(var29, 0);
                                }
                                if (class182.field3431 != null || class174.field3296 != null || class51.field1041) {
                                    var28 = false;
                                    var26 = false;
                                    var27 = false;
                                }
                                if (!var10.field3943 && var28) {
                                    var10.field3943 = true;
                                    if (var10.field3891 != null) {
                                        class82 var30 = new class82();
                                        var30.field1608 = var10;
                                        var30.field1611 = class67.field1310 - var12;
                                        var30.field1626 = class129.field2511 - var11;
                                        var30.field1613 = var10.field3891;
                                        class177.field3337.method1231(var30, 0);
                                    }
                                }
                                if (var10.field3943 && var27 && var10.field3882 != null) {
                                    class82 var31 = new class82();
                                    var31.field1613 = var10.field3882;
                                    var31.field1626 = class21.field479 - var11;
                                    var31.field1608 = var10;
                                    var31.field1611 = class109.field2134 - var12;
                                    class177.field3337.method1231(var31, 0);
                                }
                                if (var10.field3943 && !var27) {
                                    var10.field3943 = false;
                                    if (var10.field3885 != null) {
                                        class82 var32 = new class82();
                                        var32.field1626 = class21.field479 - var11;
                                        var32.field1613 = var10.field3885;
                                        var32.field1611 = class109.field2134 - var12;
                                        var32.field1608 = var10;
                                        class210.field4089.method1231(var32, 0);
                                    }
                                }
                                if (var27 && var10.field3917 != null) {
                                    class82 var33 = new class82();
                                    var33.field1611 = class109.field2134 - var12;
                                    var33.field1608 = var10;
                                    var33.field1626 = class21.field479 - var11;
                                    var33.field1613 = var10.field3917;
                                    class177.field3337.method1231(var33, 0);
                                }
                                if (!var10.field3851 && var26) {
                                    var10.field3851 = true;
                                    if (var10.field3849 != null) {
                                        class82 var34 = new class82();
                                        var34.field1626 = class21.field479 - var11;
                                        var34.field1613 = var10.field3849;
                                        var34.field1611 = class109.field2134 - var12;
                                        var34.field1608 = var10;
                                        class177.field3337.method1231(var34, 0);
                                    }
                                }
                                if (var10.field3851 && var26 && var10.field3835 != null) {
                                    class82 var35 = new class82();
                                    var35.field1608 = var10;
                                    var35.field1611 = class109.field2134 - var12;
                                    var35.field1613 = var10.field3835;
                                    var35.field1626 = class21.field479 - var11;
                                    class177.field3337.method1231(var35, 0);
                                }
                                if (var10.field3851 && !var26) {
                                    var10.field3851 = false;
                                    if (var10.field3878 != null) {
                                        class82 var36 = new class82();
                                        var36.field1608 = var10;
                                        var36.field1611 = class109.field2134 - var12;
                                        var36.field1626 = class21.field479 - var11;
                                        var36.field1613 = var10.field3878;
                                        class210.field4089.method1231(var36, 0);
                                    }
                                }
                                if (var10.field3947 != null) {
                                    class82 var37 = new class82();
                                    var37.field1608 = var10;
                                    var37.field1613 = var10.field3947;
                                    class109.field2153.method1231(var37, 0);
                                }
                                if (var10.field3846 != null && var10.field3838 < class62.field1201) {
                                    if (var10.field3864 == null || class62.field1201 - var10.field3838 > 32) {
                                        class82 var42 = new class82();
                                        var42.field1613 = var10.field3846;
                                        var42.field1608 = var10;
                                        class177.field3337.method1231(var42, 0);
                                    } else {
                                        label397: for (int var38 = var10.field3838; var38 < class62.field1201; var38++) {
                                            int var39 = class171.field3216[var38 & 0x1F];
                                            for (int var40 = 0; var40 < var10.field3864.length; var40++) {
                                                if (var10.field3864[var40] == var39) {
                                                    class82 var41 = new class82();
                                                    var41.field1608 = var10;
                                                    var41.field1613 = var10.field3846;
                                                    class177.field3337.method1231(var41, 0);
                                                    break label397;
                                                }
                                            }
                                        }
                                    }
                                    var10.field3838 = class62.field1201;
                                }
                                if (var10.field3952 != null && class139.field2698 > var10.field3949) {
                                    if (var10.field3830 == null || class139.field2698 - var10.field3949 > 32) {
                                        class82 var47 = new class82();
                                        var47.field1613 = var10.field3952;
                                        var47.field1608 = var10;
                                        class177.field3337.method1231(var47, 0);
                                    } else {
                                        label373: for (int var43 = var10.field3949; var43 < class139.field2698; var43++) {
                                            int var44 = class77.field1492[var43 & 0x1F];
                                            for (int var45 = 0; var45 < var10.field3830.length; var45++) {
                                                if (var10.field3830[var45] == var44) {
                                                    class82 var46 = new class82();
                                                    var46.field1613 = var10.field3952;
                                                    var46.field1608 = var10;
                                                    class177.field3337.method1231(var46, 0);
                                                    break label373;
                                                }
                                            }
                                        }
                                    }
                                    var10.field3949 = class139.field2698;
                                }
                                if (var10.field3933 != null && var10.field3918 < class106.field2100) {
                                    if (var10.field3879 == null || class106.field2100 - var10.field3918 > 32) {
                                        class82 var52 = new class82();
                                        var52.field1608 = var10;
                                        var52.field1613 = var10.field3933;
                                        class177.field3337.method1231(var52, 0);
                                    } else {
                                        label349: for (int var48 = var10.field3918; var48 < class106.field2100; var48++) {
                                            int var49 = class91.field1883[var48 & 0x1F];
                                            for (int var50 = 0; var50 < var10.field3879.length; var50++) {
                                                if (var10.field3879[var50] == var49) {
                                                    class82 var51 = new class82();
                                                    var51.field1608 = var10;
                                                    var51.field1613 = var10.field3933;
                                                    class177.field3337.method1231(var51, 0);
                                                    break label349;
                                                }
                                            }
                                        }
                                    }
                                    var10.field3918 = class106.field2100;
                                }
                                if (var10.field3906 < class182.field3428 && var10.field3911 != null) {
                                    class82 var53 = new class82();
                                    var53.field1613 = var10.field3911;
                                    var53.field1608 = var10;
                                    class177.field3337.method1231(var53, 0);
                                }
                                if (class107.field2127 > var10.field3906 && var10.field3935 != null) {
                                    class82 var54 = new class82();
                                    var54.field1613 = var10.field3935;
                                    var54.field1608 = var10;
                                    class177.field3337.method1231(var54, 0);
                                }
                                if (class162.field3030 > var10.field3906 && var10.field3889 != null) {
                                    class82 var55 = new class82();
                                    var55.field1608 = var10;
                                    var55.field1613 = var10.field3889;
                                    class177.field3337.method1231(var55, 0);
                                }
                                if (var10.field3906 < class147.field2838 && var10.field3860 != null) {
                                    class82 var56 = new class82();
                                    var56.field1608 = var10;
                                    var56.field1613 = var10.field3860;
                                    class177.field3337.method1231(var56, 0);
                                }
                                if (var10.field3906 < class98.field1977 && var10.field3831 != null) {
                                    class82 var57 = new class82();
                                    var57.field1613 = var10.field3831;
                                    var57.field1608 = var10;
                                    class177.field3337.method1231(var57, 0);
                                }
                                var10.field3906 = class75.field1442;
                                if (var10.field3905 != null) {
                                    for (int var58 = 0; var58 < class48.field990; var58++) {
                                        class82 var59 = new class82();
                                        var59.field1608 = var10;
                                        var59.field1629 = class24.field542[var58];
                                        var59.field1615 = class201.field3967[var58];
                                        var59.field1613 = var10.field3905;
                                        class177.field3337.method1231(var59, 0);
                                    }
                                }
                            }
                        }
                        if (!var10.field3946) {
                            if (class182.field3431 != null || class174.field3296 != null || class51.field1041) {
                                return;
                            }
                            if ((var10.field3908 >= 0 || var10.field3839 != 0) && var13 <= class21.field479 && class109.field2134 >= var14 && class21.field479 < var17 && class109.field2134 < var18) {
                                if (var10.field3908 >= 0) {
                                    class209.field4069 = arg5[var10.field3908];
                                } else {
                                    class209.field4069 = var10;
                                }
                            }
                            if (var10.field3875 == 8 && var13 <= class21.field479 && var14 <= class109.field2134 && class21.field479 < var17 && class109.field2134 < var18) {
                                class92.field1889 = var10;
                            }
                            if (var10.field3847 > var10.field3901) {
                                class148.method1032(var10.field3847, true, class21.field479, var10.field3901, var10, var10.field3881 + var11, var12, class109.field2134);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "([Llb;B)V")
    public static final void method454(class105[] arg0, byte arg1) {
        field1386++;
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var113 = 0; var113 < 104; var113++) {
                for (int var114 = 0; var114 < 104; var114++) {
                    if ((class88.field1827[var2][var113][var114] & 0x1) == 1) {
                        int var115 = var2;
                        if ((class88.field1827[1][var113][var114] & 0x2) == 2) {
                            var115 = var2 - 1;
                        }
                        if (var115 >= 0) {
                            arg0[var115].method758(arg1 ^ 0xFFDFFF91, var113, var114);
                        }
                    }
                }
            }
        }
        class203.field3994 += (int) (Math.random() * 5.0D) - 2;
        class80.field1576 += (int) (Math.random() * 5.0D) - 2;
        if (class203.field3994 < -16) {
            class203.field3994 = -16;
        }
        if (class203.field3994 > 16) {
            class203.field3994 = 16;
        }
        int[][] var3 = new int[104][104];
        int var4 = class203.field3994 >> 1;
        if (class80.field1576 < -8) {
            class80.field1576 = -8;
        }
        int[][] var5 = new int[104][104];
        if (class80.field1576 > 8) {
            class80.field1576 = 8;
        }
        int var6 = class80.field1576 >> 2 << 10;
        for (int var7 = 0; var7 < 4; var7++) {
            byte[][] var50 = class204.field4018[var7];
            byte var51 = 96;
            int var52 = (int) Math.sqrt(5100.0D);
            short var53 = 768;
            int var54 = var52 * var53 >> 8;
            for (int var55 = 1; var55 < 103; var55++) {
                for (int var103 = 1; var103 < 103; var103++) {
                    int var105 = class184.field3448[var7][var103 + 1][var55] - class184.field3448[var7][var103 - 1][var55];
                    int var106 = class184.field3448[var7][var103][var55 + 1] - class184.field3448[var7][var103][var55 - 1];
                    int var107 = (int) Math.sqrt((double) (var106 * var106 + var105 * var105 + 65536));
                    int var108 = (var105 << 8) / var107;
                    int var109 = (var106 << 8) / var107;
                    int var110 = 65536 / var107;
                    int var111 = (var108 * -50 + var109 * -50 + var110 * -10) / var54 + var51;
                    int var112 = (var50[var103 - 1][var55] >> 2) + (var50[var103][var55 + 1] >> 3) + (var50[var103][var55] >> 1) + (var50[var103][var55 - 1] >> 2) + (var50[var103 + 1][var55] >> 3);
                    var5[var103][var55] = var111 - var112;
                }
            }
            for (int var56 = 0; var56 < 104; var56++) {
                class103.field2044[var56] = 0;
                class35.field781[var56] = 0;
                class185.field3522[var56] = 0;
                class59.field1173[var56] = 0;
                class40.field846[var56] = 0;
            }
            for (int var57 = -5; var57 < 104; var57++) {
                for (int var88 = 0; var88 < 104; var88++) {
                    int var97 = var57 + 5;
                    int var10002;
                    if (var97 < 104) {
                        int var98 = class88.field1836[var7][var97][var88] & 0xFF;
                        if (var98 > 0) {
                            class128 var99 = class31.method266((byte) 55, var98 - 1);
                            class103.field2044[var88] += var99.field2476;
                            class35.field781[var88] += var99.field2479;
                            class185.field3522[var88] += var99.field2475;
                            class59.field1173[var88] += var99.field2470;
                            var10002 = class40.field846[var88]++;
                        }
                    }
                    int var100 = var57 - 5;
                    if (var100 >= 0) {
                        int var101 = class88.field1836[var7][var100][var88] & 0xFF;
                        if (var101 > 0) {
                            class128 var102 = class31.method266((byte) 55, var101 - 1);
                            class103.field2044[var88] -= var102.field2476;
                            class35.field781[var88] -= var102.field2479;
                            class185.field3522[var88] -= var102.field2475;
                            class59.field1173[var88] -= var102.field2470;
                            var10002 = class40.field846[var88]--;
                        }
                    }
                }
                if (var57 >= 0) {
                    int var89 = 0;
                    int var90 = 0;
                    int var91 = 0;
                    int var92 = 0;
                    int var93 = 0;
                    for (int var94 = -5; var94 < 104; var94++) {
                        int var95 = var94 - 5;
                        int var96 = var94 + 5;
                        if (var96 < 104) {
                            var93 += class59.field1173[var96];
                            var92 += class35.field781[var96];
                            var91 += class40.field846[var96];
                            var90 += class185.field3522[var96];
                            var89 += class103.field2044[var96];
                        }
                        if (var95 >= 0) {
                            var90 -= class185.field3522[var95];
                            var89 -= class103.field2044[var95];
                            var93 -= class59.field1173[var95];
                            var92 -= class35.field781[var95];
                            var91 -= class40.field846[var95];
                        }
                        if (var94 >= 0 && var91 > 0) {
                            var3[var57][var94] = class187.method1273(0, var89 * 256 / var93, var92 / var91, var90 / var91);
                        }
                    }
                }
            }
            for (int var58 = 1; var58 < 103; var58++) {
                for (int var61 = 1; var61 < 103; var61++) {
                    if (!class181.field3420 || (class88.field1827[0][var58][var61] & 0x2) != 0 || (class88.field1827[var7][var58][var61] & 0x10) == 0 && class161.method1097(var61, (byte) -99, var7, var58) == class165.field3101) {
                        if (class83.field1687 > var7) {
                            class83.field1687 = var7;
                        }
                        int var62 = class142.field2745[var7][var58][var61] & 0xFF;
                        int var63 = class88.field1836[var7][var58][var61] & 0xFF;
                        if (var63 > 0 || var62 > 0) {
                            int var64 = class184.field3448[var7][var58 + 1][var61];
                            int var65 = class184.field3448[var7][var58][var61];
                            int var66 = class184.field3448[var7][var58 + 1][var61 + 1];
                            int var67 = class184.field3448[var7][var58][var61 + 1];
                            if (var7 > 0) {
                                boolean var68 = true;
                                if (var63 == 0 && class9.field123[var7][var58][var61] != 0) {
                                    var68 = false;
                                }
                                if (var62 > 0 && !class55.method359(85, var62 - 1).field603) {
                                    var68 = false;
                                }
                                if (var68 && var64 == var65 && var65 == var66 && var65 == var67) {
                                    class187.field3577[var7][var58][var61] = class31.method262(class187.field3577[var7][var58][var61], 2340);
                                }
                            }
                            int var69;
                            int var72;
                            if (var63 > 0) {
                                var69 = var3[var58][var61];
                                int var70 = (var69 & 0x7F) + var4;
                                if (var70 < 0) {
                                    var70 = 0;
                                } else if (var70 > 127) {
                                    var70 = 127;
                                }
                                int var71 = (var6 + var69 & 0xFC00) + (var69 & 0x380) + var70;
                                var72 = class124.field2381[class118.method863(96, -14538, var71)];
                            } else {
                                var72 = 0;
                                var69 = -1;
                            }
                            int var73 = var5[var58][var61];
                            int var74 = var5[var58 + 1][var61];
                            int var75 = var5[var58 + 1][var61 + 1];
                            int var76 = var5[var58][var61 + 1];
                            if (var62 == 0) {
                                class73.method459(var7, var58, var61, 0, 0, -1, var65, var64, var66, var67, class118.method863(var73, -14538, var69), class118.method863(var74, -14538, var69), class118.method863(var75, -14538, var69), class118.method863(var76, -14538, var69), 0, 0, 0, 0, var72, 0);
                            } else {
                                byte var77 = class106.field2110[var7][var58][var61];
                                int var78 = class9.field123[var7][var58][var61] + 1;
                                class28 var79 = class55.method359(67, var62 - 1);
                                int var80 = var79.field610;
                                if (var80 >= 0 && !class124.field2385.method9(-113, var80)) {
                                    var80 = -1;
                                }
                                int var81;
                                int var82;
                                if (var80 >= 0) {
                                    var81 = class124.field2381[class27.method223(class124.field2385.method4(var80, false), (byte) -128, 96)];
                                    var82 = -1;
                                } else if (var79.field609 == -1) {
                                    var81 = 0;
                                    var82 = -2;
                                } else {
                                    var82 = var79.field609;
                                    int var83 = (var82 & 0x7F) + var4;
                                    if (var83 < 0) {
                                        var83 = 0;
                                    } else if (var83 > 127) {
                                        var83 = 127;
                                    }
                                    int var84 = (var6 + var82 & 0xFC00) + (var82 & 0x380) + var83;
                                    var81 = class124.field2381[class27.method223(var84, (byte) -128, 96)];
                                }
                                if (var79.field607 >= 0) {
                                    int var85 = var79.field607;
                                    int var86 = (var85 & 0x7F) + var4;
                                    if (var86 < 0) {
                                        var86 = 0;
                                    } else if (var86 > 127) {
                                        var86 = 127;
                                    }
                                    int var87 = (var85 & 0x380) + ((var6 + var85 & 0xFC00) + var86);
                                    var81 = class124.field2381[class27.method223(var87, (byte) -128, 96)];
                                }
                                class73.method459(var7, var58, var61, var78, var77, var80, var65, var64, var66, var67, class118.method863(var73, -14538, var69), class118.method863(var74, -14538, var69), class118.method863(var75, -14538, var69), class118.method863(var76, arg1 ^ 0x38A7, var69), class27.method223(var82, (byte) -128, var73), class27.method223(var82, (byte) -128, var74), class27.method223(var82, (byte) -128, var75), class27.method223(var82, (byte) -128, var76), var72, var81);
                            }
                        }
                    }
                }
            }
            for (int var59 = 1; var59 < 103; var59++) {
                for (int var60 = 1; var60 < 103; var60++) {
                    class192.method1289(var7, var60, var59, class161.method1097(var59, (byte) -99, var7, var60));
                }
            }
            class88.field1836[var7] = null;
            class142.field2745[var7] = null;
            class9.field123[var7] = null;
            class106.field2110[var7] = null;
            class204.field4018[var7] = null;
        }
        class102.method733(-50, -10, -50);
        for (int var8 = 0; var8 < 104; var8++) {
            for (int var49 = 0; var49 < 104; var49++) {
                if ((class88.field1827[1][var8][var49] & 0x2) == 2) {
                    class60.method395(var8, var49);
                }
            }
        }
        int var9 = 1;
        int var10 = 2;
        int var11 = 4;
        for (int var12 = 0; var12 < 4; var12++) {
            if (var12 > 0) {
                var10 <<= 0x3;
                var9 <<= 0x3;
                var11 <<= 0x3;
            }
            for (int var13 = 0; var13 <= var12; var13++) {
                for (int var14 = 0; var14 <= 104; var14++) {
                    for (int var15 = 0; var15 <= 104; var15++) {
                        if ((var9 & class187.field3577[var13][var15][var14]) != 0) {
                            int var16;
                            for (var16 = var14; var16 > 0 && (class187.field3577[var13][var15][var16 - 1] & var9) != 0; var16--) {
                            }
                            int var17;
                            for (var17 = var14; var17 < 104 && (var9 & class187.field3577[var13][var15][var17 + 1]) != 0; var17++) {
                            }
                            int var18;
                            label360: for (var18 = var13; var18 > 0; var18--) {
                                for (int var19 = var16; var19 <= var17; var19++) {
                                    if ((class187.field3577[var18 - 1][var15][var19] & var9) == 0) {
                                        break label360;
                                    }
                                }
                            }
                            int var20;
                            label348: for (var20 = var13; var20 < var12; var20++) {
                                for (int var21 = var16; var21 <= var17; var21++) {
                                    if ((class187.field3577[var20 + 1][var15][var21] & var9) == 0) {
                                        break label348;
                                    }
                                }
                            }
                            int var22 = (var17 + 1 - var16) * (var20 + 1 - var18);
                            if (var22 >= 8) {
                                short var23 = 240;
                                int var24 = class184.field3448[var20][var15][var16] - var23;
                                int var25 = class184.field3448[var18][var15][var16];
                                class4.method17(var12, 1, var15 * 128, var15 * 128, var16 * 128, var17 * 128 + 128, var24, var25);
                                for (int var26 = var18; var26 <= var20; var26++) {
                                    for (int var27 = var16; var27 <= var17; var27++) {
                                        class187.field3577[var26][var15][var27] = class170.method1140(class187.field3577[var26][var15][var27], ~var9);
                                    }
                                }
                            }
                        }
                        if ((var10 & class187.field3577[var13][var15][var14]) != 0) {
                            int var28 = var15;
                            int var29 = var15;
                            int var30 = var13;
                            while (var29 < 104 && (var10 & class187.field3577[var13][var29 + 1][var14]) != 0) {
                                var29++;
                            }
                            int var31 = var13;
                            while (var28 > 0 && (class187.field3577[var13][var28 - 1][var14] & var10) != 0) {
                                var28--;
                            }
                            label415: while (var30 > 0) {
                                for (int var32 = var28; var32 <= var29; var32++) {
                                    if ((class187.field3577[var30 - 1][var32][var14] & var10) == 0) {
                                        break label415;
                                    }
                                }
                                var30--;
                            }
                            label404: while (var12 > var31) {
                                for (int var33 = var28; var33 <= var29; var33++) {
                                    if ((class187.field3577[var31 + 1][var33][var14] & var10) == 0) {
                                        break label404;
                                    }
                                }
                                var31++;
                            }
                            int var34 = (var31 + 1 - var30) * (var29 + 1 - var28);
                            if (var34 >= 8) {
                                short var35 = 240;
                                int var36 = class184.field3448[var31][var28][var14] - var35;
                                int var37 = class184.field3448[var30][var28][var14];
                                class4.method17(var12, 2, var28 * 128, var29 * 128 + 128, var14 * 128, var14 * 128, var36, var37);
                                for (int var38 = var30; var38 <= var31; var38++) {
                                    for (int var39 = var28; var39 <= var29; var39++) {
                                        class187.field3577[var38][var39][var14] = class170.method1140(class187.field3577[var38][var39][var14], ~var10);
                                    }
                                }
                            }
                        }
                        if ((var11 & class187.field3577[var13][var15][var14]) != 0) {
                            int var40 = var15;
                            int var41 = var14;
                            int var42 = var15;
                            int var43 = var14;
                            while (var41 < 104 && (var11 & class187.field3577[var13][var15][var41 + 1]) != 0) {
                                var41++;
                            }
                            while (var43 > 0 && (var11 & class187.field3577[var13][var15][var43 - 1]) != 0) {
                                var43--;
                            }
                            label469: while (var42 > 0) {
                                for (int var44 = var43; var44 <= var41; var44++) {
                                    if ((class187.field3577[var13][var42 - 1][var44] & var11) == 0) {
                                        break label469;
                                    }
                                }
                                var42--;
                            }
                            label458: while (var40 < 104) {
                                for (int var45 = var43; var45 <= var41; var45++) {
                                    if ((class187.field3577[var13][var40 + 1][var45] & var11) == 0) {
                                        break label458;
                                    }
                                }
                                var40++;
                            }
                            if ((var41 + 1 - var43) * (-var42 + 1 + var40) >= 4) {
                                int var46 = class184.field3448[var13][var42][var43];
                                class4.method17(var12, 4, var42 * 128, var40 * 128 + 128, var43 * 128, var41 * 128 + 128, var46, var46);
                                for (int var47 = var42; var47 <= var40; var47++) {
                                    for (int var48 = var43; var48 <= var41; var48++) {
                                        class187.field3577[var13][var47][var48] = class170.method1140(class187.field3577[var13][var47][var48], ~var11);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg1 != -111) {
            field1379 = null;
        }
    }
}
