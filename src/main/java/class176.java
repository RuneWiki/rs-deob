import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class176 extends class124 {

    @OriginalMember(owner = "client!qb", name = "C", descriptor = "[Z")
    public static boolean[] field3210 = new boolean[8];

    @OriginalMember(owner = "client!qb", name = "E", descriptor = "Lqe;")
    public static class179 field3212 = class206.method1380("gr-Un:", (byte) -128);

    @OriginalMember(owner = "client!qb", name = "z", descriptor = "[[I")
    public static int[][] field3207 = new int[5][5000];

    @OriginalMember(owner = "client!qb", name = "A", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!qb", name = "B", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!qb", name = "F", descriptor = "I")
    public static int field3213;

    @OriginalMember(owner = "client!qb", name = "H", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!qb", name = "D", descriptor = "[I")
    public static int[] field3211;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "(I)V")
    public static final void method1112(int arg0) {
        if (arg0 < 12) {
            field3211 = null;
        }
        if (class84.field1618[96]) {
            class97.field1821 += (-class97.field1821 - 24) / 2;
        } else if (class84.field1618[97]) {
            class97.field1821 += (24 - class97.field1821) / 2;
        } else {
            class97.field1821 /= 2;
        }
        class236.field4342 += class97.field1821 / 2;
        field3214++;
        int var1 = class144.field2633 + class61.field1298.field3159;
        if (class84.field1618[98]) {
            class240.field4416 += (12 - class240.field4416) / 2;
        } else if (class84.field1618[99]) {
            class240.field4416 += (-class240.field4416 - 12) / 2;
        } else {
            class240.field4416 /= 2;
        }
        int var2 = class61.field1298.field3198 + class18.field485;
        class175.field3145 += class240.field4416 / 2;
        if (class230.field4253 - var1 < -500 || class230.field4253 - var1 > 500 || class234.field4321 - var2 < -500 || class234.field4321 - var2 > 500) {
            class234.field4321 = var2;
            class230.field4253 = var1;
        }
        if (class230.field4253 != var1) {
            class230.field4253 += (var1 - class230.field4253) / 16;
        }
        if (class234.field4321 != var2) {
            class234.field4321 += (var2 - class234.field4321) / 16;
        }
        class120.method771(false);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIII[Lae;IIIII)V")
    public static final void method1113(int arg0, int arg1, int arg2, int arg3, class6[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg6 != 32763) {
            field3212 = null;
        }
        class145.method918(arg5, arg7, arg0, arg1);
        class27.method169();
        field3213++;
        for (int var10 = 0; var10 < arg4.length; var10++) {
            class6 var11 = arg4[var10];
            if (var11 != null && (var11.field131 == arg8 || arg8 == -1412584499 && class86.field1647 == var11)) {
                int var12;
                if (arg9 == -1) {
                    class99.field1845[class160.field2907] = var11.field166 + arg2;
                    class116.field2185[class160.field2907] = var11.field83 + arg3;
                    class84.field1636[class160.field2907] = var11.field169;
                    class15.field401[class160.field2907] = var11.field73;
                    var12 = class160.field2907++;
                } else {
                    var12 = arg9;
                }
                var11.field167 = var12;
                var11.field142 = class13.field322;
                if (!var11.field108 || !class32.method204(var11, arg6 - 32814)) {
                    if (var11.field220 > 0) {
                        class191.method1289(var11, 0);
                    }
                    int var13 = var11.field83 + arg3;
                    int var14 = var11.field148;
                    int var15 = var11.field166 + arg2;
                    if (class69.field1378 && (class159.method1026(var11, -1493540320) != 0 || var11.field128 == 0) && var14 > 127) {
                        var14 = 127;
                    }
                    if (class86.field1647 == var11) {
                        if (arg8 != -1412584499 && !var11.field186) {
                            class240.field4422 = arg2;
                            class206.field3843 = arg4;
                            class114.field2135 = arg3;
                            continue;
                        }
                        if (!var11.field186) {
                            var14 = 128;
                        }
                        if (class227.field4207 && class84.field1628) {
                            int var16 = class4.field61;
                            int var17 = var16 - class150.field2701;
                            int var18 = class139.field2559;
                            if (var17 < class18.field476) {
                                var17 = class18.field476;
                            }
                            int var19 = var18 - class233.field4307;
                            if (class18.field476 + class123.field2280.field169 < var17 - -var11.field169) {
                                var17 = class18.field476 + class123.field2280.field169 - var11.field169;
                            }
                            if (var19 < class196.field3640) {
                                var19 = class196.field3640;
                            }
                            if (var11.field73 + var19 > class196.field3640 + class123.field2280.field73) {
                                var19 = class123.field2280.field73 + class196.field3640 - var11.field73;
                            }
                            var13 = var19;
                            var15 = var17;
                        }
                    }
                    int var20;
                    int var21;
                    int var24;
                    int var25;
                    if (var11.field128 == 2) {
                        var20 = arg7;
                        var21 = arg5;
                        var25 = arg0;
                        var24 = arg1;
                    } else {
                        var20 = arg7 >= var13 ? arg7 : var13;
                        var21 = arg5 >= var15 ? arg5 : var15;
                        int var22 = var11.field169 + var15;
                        int var23 = var11.field73 + var13;
                        if (var11.field128 == 9) {
                            var23++;
                            var22++;
                        }
                        var24 = arg1 <= var23 ? arg1 : var23;
                        var25 = var22 >= arg0 ? arg0 : var22;
                    }
                    if (!var11.field108 || var21 < var25 && var20 < var24) {
                        if (var11.field220 != 0) {
                            if (var11.field220 == 1337) {
                                class99.field1849 = var15;
                                class131.field2379 = var13;
                                class44.method290(var11.field169, arg6 ^ 0xFFFF8024, var11.field73, var13, var15);
                                class145.method918(arg5, arg7, arg0, arg1);
                                continue;
                            }
                            if (var11.field220 == 1338) {
                                if (var11.method39((byte) -43)) {
                                    class113.method726(var12, var13, var11, var15, (byte) -123);
                                    class145.method918(arg5, arg7, arg0, arg1);
                                }
                                continue;
                            }
                            if (var11.field220 == 1339) {
                                if (var11.method39((byte) -43)) {
                                    class201.method1334(var15, var11, var13, var12, -99);
                                    class145.method918(arg5, arg7, arg0, arg1);
                                }
                                continue;
                            }
                            if (var11.field220 == 1400) {
                                class40.method262(var11.field73, var15, var13, (byte) -122, var11.field169);
                                class143.field2592[var12] = true;
                                class186.field3455[var12] = true;
                                class145.method918(arg5, arg7, arg0, arg1);
                                continue;
                            }
                            if (var11.field220 == 1401) {
                                class36.method238(var11.field169, var13, var15, 0, var11.field73);
                                class143.field2592[var12] = true;
                                class186.field3455[var12] = true;
                                class145.method918(arg5, arg7, arg0, arg1);
                                continue;
                            }
                        }
                        int var26 = class4.field61;
                        if (var11.field128 == 0 && var11.field125 && var21 <= class4.field61 && var20 <= class139.field2559 && class4.field61 < var25 && class139.field2559 < var24 && !class182.field3358 && !class69.field1378) {
                            class215.field3993[0] = class189.field3509;
                            class23.field552[0] = 1005;
                            class23.field567[0] = class207.field3868;
                            class113.field2118 = 1;
                        }
                        int var27 = class139.field2559;
                        if (!class182.field3358 && var21 <= var26 && var20 <= var27 && var26 < var25 && var27 < var24) {
                            class9.method59(var11, var27 - var13, (byte) -114, var26 - var15);
                        }
                        if (var11.field128 == 0) {
                            if (!var11.field108 && class32.method204(var11, arg6 - 32874) && class155.field2790 != var11) {
                                continue;
                            }
                            if (!var11.field108) {
                                if (var11.field119 > var11.field97 - var11.field73) {
                                    var11.field119 = var11.field97 - var11.field73;
                                }
                                if (var11.field119 < 0) {
                                    var11.field119 = 0;
                                }
                            }
                            method1113(var25, var24, var15 - var11.field70, var13 - var11.field119, arg4, var21, 32763, var20, var11.field173, var12);
                            if (var11.field206 != null) {
                                method1113(var25, var24, var15 - var11.field70, -var11.field119 + var13, var11.field206, var21, 32763, var20, var11.field173, var12);
                            }
                            class98 var28 = (class98) class36.field797.method909(-1, (long) var11.field173);
                            if (var28 != null) {
                                if (var28.field1829 == 0 && class4.field61 >= var21 && var20 <= class139.field2559 && class4.field61 < var25 && var24 > class139.field2559 && !class182.field3358 && !class69.field1378) {
                                    class23.field552[0] = 1005;
                                    class113.field2118 = 1;
                                    class215.field3993[0] = class189.field3509;
                                    class23.field567[0] = class207.field3868;
                                }
                                class106.method691(var28.field1831, var24, var12, -1412584499, var20, var13, var15, var21, var25);
                            }
                            class145.method918(arg5, arg7, arg0, arg1);
                            class27.method169();
                        }
                        if (class147.field2667[var12] || class110.field2056 > 1) {
                            if (var11.field128 == 0 && !var11.field108 && var11.field97 > var11.field73) {
                                class150.method960(var11.field169 + var15, var11.field119, -1, var11.field97, var13, var11.field73);
                            }
                            if (var11.field128 != 1) {
                                if (var11.field128 == 2) {
                                    int var29 = 0;
                                    for (int var30 = 0; var30 < var11.field86; var30++) {
                                        for (int var31 = 0; var31 < var11.field89; var31++) {
                                            int var32 = (var11.field82 + 32) * var31 + var15;
                                            int var33 = var13 + (var11.field103 + 32) * var30;
                                            if (var29 < 20) {
                                                var33 += var11.field117[var29];
                                                var32 += var11.field158[var29];
                                            }
                                            if (var11.field111[var29] > 0) {
                                                boolean var35 = false;
                                                boolean var36 = false;
                                                int var37 = var11.field111[var29] - 1;
                                                if (arg5 < var32 + 32 && var32 < arg0 && arg7 < var33 + 32 && var33 < arg1 || class143.field2599 == var11 && class163.field2950 == var29) {
                                                    class143 var38;
                                                    if (class172.field3086 == 1 && class208.field3912 == var29 && class73.field1436 == var11.field173) {
                                                        var38 = class102.method676(2, var37, var11.field68[var29], var11.field170, arg6 - 11455, 0);
                                                    } else {
                                                        var38 = class102.method676(1, var37, var11.field68[var29], var11.field170, arg6 - 11455, 3153952);
                                                    }
                                                    if (var38 == null) {
                                                        class139.method880(var11, arg6 - 32655);
                                                    } else if (class143.field2599 == var11 && class163.field2950 == var29) {
                                                        int var39 = class139.field2559 - class217.field4023;
                                                        int var40 = class4.field61 - class167.field3005;
                                                        if (var39 < 5 && var39 > -5) {
                                                            var39 = 0;
                                                        }
                                                        if (var40 < 5 && var40 > -5) {
                                                            var40 = 0;
                                                        }
                                                        if (class196.field3645 < 5) {
                                                            var39 = 0;
                                                            var40 = 0;
                                                        }
                                                        var38.method803(var32 + var40, var33 + var39, 128);
                                                        if (arg8 != -1) {
                                                            class6 var41 = arg4[arg8 & 0xFFFF];
                                                            int var42 = class145.field2638;
                                                            int var43 = class145.field2641;
                                                            if (var33 + var39 < var42 && var41.field119 > 0) {
                                                                int var44 = (var42 - var33 - var39) * class66.field1342 / 3;
                                                                if (var44 > class66.field1342 * 10) {
                                                                    var44 = class66.field1342 * 10;
                                                                }
                                                                if (var44 > var41.field119) {
                                                                    var44 = var41.field119;
                                                                }
                                                                class217.field4023 += var44;
                                                                var41.field119 -= var44;
                                                                class139.method880(var41, 97);
                                                            }
                                                            if (var39 + var33 + 32 > var43 && var41.field119 < var41.field97 - var41.field73) {
                                                                int var45 = (var33 + var39 + 32 - var43) * class66.field1342 / 3;
                                                                if (var45 > class66.field1342 * 10) {
                                                                    var45 = class66.field1342 * 10;
                                                                }
                                                                if (var45 > var41.field97 - var41.field73 - var41.field119) {
                                                                    var45 = var41.field97 - var41.field73 - var41.field119;
                                                                }
                                                                var41.field119 += var45;
                                                                class217.field4023 -= var45;
                                                                class139.method880(var41, arg6 - 32642);
                                                            }
                                                        }
                                                    } else if (class208.field3895 == var11 && class175.field3132 == var29) {
                                                        var38.method803(var32, var33, 128);
                                                    } else {
                                                        var38.method799(var32, var33);
                                                    }
                                                }
                                            } else if (var11.field80 != null && var29 < 20) {
                                                class143 var34 = var11.method34(var29, 0);
                                                if (var34 != null) {
                                                    var34.method799(var32, var33);
                                                } else if (class215.field3983) {
                                                    class139.method880(var11, 127);
                                                }
                                            }
                                            var29++;
                                        }
                                    }
                                } else if (var11.field128 == 3) {
                                    int var46;
                                    if (class69.method443(var11, 27948)) {
                                        var46 = var11.field112;
                                        if (class155.field2790 == var11 && var11.field95 != 0) {
                                            var46 = var11.field95;
                                        }
                                    } else {
                                        var46 = var11.field193;
                                        if (class155.field2790 == var11 && var11.field133 != 0) {
                                            var46 = var11.field133;
                                        }
                                    }
                                    if (var14 == 0) {
                                        if (var11.field100) {
                                            class145.method937(var15, var13, var11.field169, var11.field73, var46);
                                        } else {
                                            class145.method919(var15, var13, var11.field169, var11.field73, var46);
                                        }
                                    } else if (var11.field100) {
                                        class145.method923(var15, var13, var11.field169, var11.field73, var46, 256 - (var14 & 0xFF));
                                    } else {
                                        class145.method922(var15, var13, var11.field169, var11.field73, var46, 256 - (var14 & 0xFF));
                                    }
                                } else if (var11.field128 == 4) {
                                    class156 var47 = var11.method38(-5433, class202.field3748);
                                    if (var47 != null) {
                                        class179 var48 = var11.field113;
                                        int var49;
                                        if (class69.method443(var11, 27948)) {
                                            var49 = var11.field112;
                                            if (class155.field2790 == var11 && var11.field95 != 0) {
                                                var49 = var11.field95;
                                            }
                                            if (var11.field157.method1168(true) > 0) {
                                                var48 = var11.field157;
                                            }
                                        } else {
                                            var49 = var11.field193;
                                            if (class155.field2790 == var11 && var11.field133 != 0) {
                                                var49 = var11.field133;
                                            }
                                        }
                                        if (var11.field108 && var11.field172 != -1) {
                                            class15 var50 = class131.method835((byte) -20, var11.field172);
                                            var48 = var50.field418;
                                            if (var48 == null) {
                                                var48 = class22.field540;
                                            }
                                            if ((var50.field430 == 1 || var11.field188 != 1) && var11.field188 != -1) {
                                                var48 = class78.method502((byte) -126, new class179[] { class207.field3866, var48, class39.field829, class235.method1527(arg6 - 1659663929, var11.field188) });
                                            }
                                        }
                                        if (class120.field2249 == var11) {
                                            var48 = class172.field3084;
                                            var49 = var11.field193;
                                        }
                                        if (!var11.field108) {
                                            var48 = class163.method1048(var48, false, var11);
                                        }
                                        var47.method1014(var48, var15, var13, var11.field169, var11.field73, var49, var11.field127 ? 0 : -1, var11.field136, var11.field194, var11.field135);
                                    } else if (class215.field3983) {
                                        class139.method880(var11, 106);
                                    }
                                } else if (var11.field128 == 5) {
                                    if (var11.field108) {
                                        class143 var51;
                                        if (var11.field172 == -1) {
                                            var51 = var11.method33(false, (byte) 119);
                                        } else {
                                            var51 = class102.method676(var11.field208, var11.field172, var11.field188, var11.field170, 21308, var11.field197);
                                        }
                                        if (var51 != null) {
                                            int var52 = var51.field2590;
                                            int var53 = var51.field2603;
                                            if (var11.field200) {
                                                int var55 = (var53 + var11.field169 - 1) / var53;
                                                int var56 = (var52 + var11.field73 - 1) / var52;
                                                class145.method920(var15, var13, var11.field169 + var15, var13 - -var11.field73);
                                                for (int var57 = 0; var57 < var55; var57++) {
                                                    for (int var58 = 0; var58 < var56; var58++) {
                                                        if (var11.field212 != 0) {
                                                            var51.method902(-29324, var52 / 2 + var52 * var58 + var13, 4096, var11.field212, var53 / 2 + var53 * var57 + var15);
                                                        } else if (var14 == 0) {
                                                            var51.method799(var53 * var57 + var15, var13 - -(var52 * var58));
                                                        } else {
                                                            var51.method803(var53 * var57 + var15, var52 * var58 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class145.method918(arg5, arg7, arg0, arg1);
                                            } else {
                                                int var54 = var11.field169 * 4096 / var53;
                                                if (var11.field212 != 0) {
                                                    var51.method902(-29324, var13 + var11.field73 / 2, var54, var11.field212, var15 + var11.field169 / 2);
                                                } else if (var14 != 0) {
                                                    var51.method817(var15, var13, var11.field169, var11.field73, 256 - (var14 & 0xFF));
                                                } else if (var11.field169 == var53 && var11.field73 == var52) {
                                                    var51.method799(var15, var13);
                                                } else {
                                                    var51.method801(var15, var13, var11.field169, var11.field73);
                                                }
                                            }
                                        } else if (class215.field3983) {
                                            class139.method880(var11, 119);
                                        }
                                    } else {
                                        class143 var59 = var11.method33(class69.method443(var11, 27948), (byte) 112);
                                        if (var59 != null) {
                                            var59.method799(var15, var13);
                                        } else if (class215.field3983) {
                                            class139.method880(var11, 96);
                                        }
                                    }
                                } else if (var11.field128 == 6) {
                                    boolean var60 = class69.method443(var11, 27948);
                                    int var61 = 0;
                                    class75 var62 = null;
                                    int var63;
                                    if (var60) {
                                        var63 = var11.field105;
                                    } else {
                                        var63 = var11.field184;
                                    }
                                    if (var11.field172 != -1) {
                                        class15 var68 = class131.method835((byte) -20, var11.field172);
                                        if (var68 != null) {
                                            class15 var69 = var68.method121(false, var11.field188);
                                            var62 = var69.method109(1, (byte) -96, null, 0);
                                            if (var62 == null) {
                                                class139.method880(var11, 98);
                                            } else {
                                                var61 = -var62.method295() / 2;
                                            }
                                        }
                                    } else if (var11.field218 == 5) {
                                        if (var11.field147 == -1) {
                                            var62 = class4.field52.method642(null, -1, (byte) 7, null, -1);
                                        } else {
                                            int var64 = var11.field147 & 0x7FF;
                                            if (class159.field2871 == var64) {
                                                var64 = 2047;
                                            }
                                            class115 var65 = class23.field554[var64];
                                            class117 var66 = var63 == -1 ? null : class239.method1550(var63, (byte) 107);
                                            if (var65 != null && (int) var65.field2168.method1137(103) << 11 == (var11.field147 & 0xFFFFF800)) {
                                                var62 = var65.field2167.method642(null, var11.field195, (byte) 11, var66, 0);
                                            }
                                        }
                                    } else if (var63 == -1) {
                                        var62 = var11.method37(null, class61.field1298.field2167, 10, -1, var60);
                                        if (var62 == null && class215.field3983) {
                                            class139.method880(var11, arg6 - 32636);
                                        }
                                    } else {
                                        class117 var67 = class239.method1550(var63, (byte) 107);
                                        var62 = var11.method37(var67, class61.field1298.field2167, 10, var11.field195, var60);
                                        if (var62 == null && class215.field3983) {
                                            class139.method880(var11, 125);
                                        }
                                    }
                                    if (var62 != null) {
                                        int var70;
                                        if (var11.field216 <= 0) {
                                            var70 = 256;
                                        } else {
                                            var70 = (var11.field169 << 8) / var11.field216;
                                        }
                                        int var71;
                                        if (var11.field160 <= 0) {
                                            var71 = 256;
                                        } else {
                                            var71 = (var11.field73 << 8) / var11.field160;
                                        }
                                        int var72 = (var11.field107 * var70 >> 8) + var11.field169 / 2 + var15;
                                        int var73 = var13 + var11.field73 / 2 + (var11.field115 * var71 >> 8);
                                        class27.method180(var72, var73);
                                        int var74 = class27.field600[var11.field163] * var11.field143 >> 16;
                                        int var75 = class27.field612[var11.field163] * var11.field143 >> 16;
                                        if (!var11.field108) {
                                            var62.method485(0, var11.field199, 0, var11.field163, 0, var75, var74);
                                        } else if (var11.field161) {
                                            ((class203) var62).method1350(0, var11.field199, var11.field153, var11.field163, var11.field149, var75 + var11.field219 + var61, var11.field219 + var74, var11.field143);
                                        } else {
                                            var62.method485(0, var11.field199, var11.field153, var11.field163, var11.field149, var75 + var61 + var11.field219, var11.field219 + var74);
                                        }
                                        class27.method175();
                                    }
                                } else {
                                    if (var11.field128 == 7) {
                                        class156 var76 = var11.method38(arg6 ^ 0xFFFF953C, class202.field3748);
                                        if (var76 == null) {
                                            if (class215.field3983) {
                                                class139.method880(var11, 123);
                                            }
                                            continue;
                                        }
                                        int var77 = 0;
                                        for (int var78 = 0; var78 < var11.field86; var78++) {
                                            for (int var79 = 0; var79 < var11.field89; var79++) {
                                                if (var11.field111[var77] > 0) {
                                                    class15 var80 = class131.method835((byte) -20, var11.field111[var77] - 1);
                                                    class179 var81;
                                                    if (var80.field430 != 1 && var11.field68[var77] == 1) {
                                                        var81 = class78.method502((byte) -107, new class179[] { class207.field3866, var80.field418, class84.field1626 });
                                                    } else {
                                                        var81 = class78.method502((byte) -84, new class179[] { class207.field3866, var80.field418, class39.field829, class235.method1527(-1659631166, var11.field68[var77]) });
                                                    }
                                                    int var82 = var15 + (var11.field82 + 115) * var79;
                                                    int var83 = (var11.field103 + 12) * var78 + var13;
                                                    if (var11.field136 == 0) {
                                                        var76.method1015(var81, var82, var83, var11.field193, var11.field127 ? 0 : -1);
                                                    } else if (var11.field136 == 1) {
                                                        var76.method1000(var81, var82 + 57, var83, var11.field193, var11.field127 ? 0 : -1);
                                                    } else {
                                                        var76.method999(var81, var82 + 115 - 1, var83, var11.field193, var11.field127 ? 0 : -1);
                                                    }
                                                }
                                                var77++;
                                            }
                                        }
                                    }
                                    if (var11.field128 == 8 && class132.field2397 == var11 && class44.field953 == class23.field569) {
                                        int var84 = 0;
                                        class156 var85 = class191.field3546;
                                        int var86 = 0;
                                        class179 var87 = var11.field113;
                                        class179 var88 = class163.method1048(var87, false, var11);
                                        while (var88.method1168(true) > 0) {
                                            int var96 = var88.method1128(arg6 - 32763, class31.field679);
                                            class179 var97;
                                            if (var96 == -1) {
                                                var97 = var88;
                                                var88 = class207.field3868;
                                            } else {
                                                var97 = var88.method1156(-5684, var96, 0);
                                                var88 = var88.method1162((byte) 93, var96 + 4);
                                            }
                                            int var98 = var85.method1005(var97);
                                            var86 += var85.field2808 + 1;
                                            if (var84 < var98) {
                                                var84 = var98;
                                            }
                                        }
                                        var86 += 7;
                                        var84 += 6;
                                        int var89 = var11.field169 + var15 - var84 - 5;
                                        int var90 = var11.field73 + var13 + 5;
                                        if (var86 + var90 > arg1) {
                                            var90 = arg1 - var86;
                                        }
                                        if (var15 + 5 > var89) {
                                            var89 = var15 + 5;
                                        }
                                        if (var84 + var89 > arg0) {
                                            var89 = arg0 - var84;
                                        }
                                        class145.method937(var89, var90, var84, var86, 16777120);
                                        class145.method919(var89, var90, var84, var86, 0);
                                        int var91 = var85.field2808 + var90 + 2;
                                        class179 var92 = var11.field113;
                                        class179 var93 = class163.method1048(var92, false, var11);
                                        while (var93.method1168(true) > 0) {
                                            int var94 = var93.method1128(0, class31.field679);
                                            class179 var95;
                                            if (var94 == -1) {
                                                var95 = var93;
                                                var93 = class207.field3868;
                                            } else {
                                                var95 = var93.method1156(-5684, var94, 0);
                                                var93 = var93.method1162((byte) 115, var94 + 4);
                                            }
                                            var85.method1015(var95, var89 + 3, var91, 0, -1);
                                            var91 += var85.field2808 + 1;
                                        }
                                    }
                                    if (var11.field128 == 9) {
                                        int var99;
                                        int var100;
                                        int var101;
                                        int var102;
                                        if (var11.field179) {
                                            var102 = var15;
                                            var100 = var15 + var11.field169;
                                            var101 = var13;
                                            var99 = var11.field73 + var13;
                                        } else {
                                            var99 = var13;
                                            var100 = var11.field169 + var15;
                                            var101 = var13 + var11.field73;
                                            var102 = var15;
                                        }
                                        if (var11.field120 == 1) {
                                            class145.method928(var102, var99, var100, var101, var11.field193);
                                        } else {
                                            class145.method917(var102, var99, var100, var101, var11.field193, var11.field120);
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

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V")
    public static void method1114(byte arg0) {
        field3212 = null;
        field3211 = null;
        field3210 = null;
        field3207 = null;
        if (arg0 != -15) {
            field3207 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIILkg;)V")
    public static final void method1115(int arg0, int arg1, int arg2, class115 arg3) {
        field3208++;
        if ((arg1 & 0x1) != 0) {
            int var4 = class36.field789.method1223(124);
            int var5 = class36.field789.method1223(124);
            arg3.method1109(var4, (byte) -38, class13.field322, var5);
            arg3.field3204 = class13.field322 + 300;
            arg3.field3202 = class36.field789.method1202(true);
        }
        if ((arg1 & 0x10) != 0) {
            arg3.field3149 = class36.field789.method1250(2);
            arg3.field3164 = class36.field789.method1237(-69);
        }
        if ((arg1 & 0x2) != 0) {
            int var6 = class36.field789.method1245(-80);
            if (var6 == 65535) {
                var6 = -1;
            }
            int var7 = class36.field789.method1243(3);
            class78.method503(var7, (byte) 96, var6, arg3);
        }
        if ((arg1 & 0x100) != 0) {
            arg3.field3158 = class36.field789.method1203(255);
            arg3.field3157 = class36.field789.method1223(120);
            arg3.field3169 = class36.field789.method1243(3);
            arg3.field3175 = class36.field789.method1203(255);
            arg3.field3136 = class36.field789.method1252(2) + class13.field322;
            arg3.field3151 = class36.field789.method1252(2) + class13.field322;
            arg3.field3196 = class36.field789.method1223(124);
            arg3.field3176 = 1;
            arg3.field3180 = 0;
        }
        if ((arg1 & 0x400) != 0) {
            arg3.field3154 = class36.field789.method1237(119);
            int var8 = class36.field789.method1240((byte) 75);
            arg3.field3193 = 0;
            arg3.field3138 = var8 >> 16;
            arg3.field3192 = 0;
            arg3.field3203 = (var8 & 0xFFFF) + class13.field322;
            if (arg3.field3154 == 65535) {
                arg3.field3154 = -1;
            }
            if (arg3.field3203 > class13.field322) {
                arg3.field3192 = -1;
            }
        }
        if ((arg1 & 0x4) != 0) {
            arg3.field3187 = class36.field789.method1242(-104);
            if (arg3.field3187.method1161(0, (byte) -50) == 126) {
                arg3.field3187 = arg3.field3187.method1162((byte) 101, 1);
                class189.method1276(2, (byte) 1, arg3.field3187, arg3.field2168);
            } else if (class61.field1298 == arg3) {
                class189.method1276(2, (byte) 1, arg3.field3187, arg3.field2168);
            }
            arg3.field3134 = 0;
            arg3.field3184 = 0;
            arg3.field3137 = 150;
        }
        if ((arg1 & 0x40) != 0) {
            int var9 = class36.field789.method1243(3);
            byte[] var10 = new byte[var9];
            class185 var11 = new class185(var10);
            class36.field789.method1217(27, var10, var9, 0);
            class198.field3693[arg2] = var11;
            arg3.method741(true, var11);
        }
        if (arg0 >= -64) {
            return;
        }
        if ((arg1 & 0x20) != 0) {
            arg3.field3142 = class36.field789.method1250(2);
            if (arg3.field3142 == 65535) {
                arg3.field3142 = -1;
            }
        }
        if ((arg1 & 0x8) != 0) {
            int var12 = class36.field789.method1237(-93);
            int var13 = class36.field789.method1243(3);
            int var14 = class36.field789.method1202(true);
            int var15 = class36.field789.field3432;
            if (arg3.field2168 != null && arg3.field2167 != null) {
                long var16 = arg3.field2168.method1137(96);
                boolean var18 = false;
                if (var13 <= 1) {
                    for (int var19 = 0; var19 < class98.field1840; var19++) {
                        if (class237.field4358[var19] == var16) {
                            var18 = true;
                            break;
                        }
                    }
                }
                if (!var18 && class110.field2059 == 0) {
                    class243.field4444.field3432 = 0;
                    int var20 = -1;
                    boolean var21 = (var12 & 0x8000) != 0;
                    class36.field789.method1217(74, class243.field4444.field3397, var14, 0);
                    class243.field4444.field3432 = 0;
                    class179 var22;
                    if (var21) {
                        var12 &= 0x7FFF;
                        class183 var23 = class78.method500(-81, class243.field4444);
                        var20 = var23.field3375;
                        var22 = var23.field3377.method837(class243.field4444, true);
                    } else {
                        var22 = class156.method1013(class179.method1133(class243.field4444, -117).method1159((byte) 127));
                    }
                    arg3.field3187 = var22.method1143(117);
                    arg3.field3184 = var12 & 0xFF;
                    arg3.field3137 = 150;
                    arg3.field3134 = var12 >> 8;
                    if (var13 == 2) {
                        class58.method394(var22, var21 ? 17 : 1, 0, null, class78.method502((byte) -128, new class179[] { class175.field3174, arg3.field2168 }), var20);
                    } else if (var13 == 1) {
                        class58.method394(var22, var21 ? 17 : 1, 0, null, class78.method502((byte) -103, new class179[] { class124.field2286, arg3.field2168 }), var20);
                    } else {
                        class58.method394(var22, var21 ? 17 : 2, 0, null, arg3.field2168, var20);
                    }
                }
            }
            class36.field789.field3432 = var14 + var15;
        }
        if ((arg1 & 0x200) != 0) {
            int var24 = class36.field789.method1223(125);
            int var25 = class36.field789.method1203(255);
            arg3.method1109(var24, (byte) 105, class13.field322, var25);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "()V")
    public static final void method1116() {
        for (int var0 = 0; var0 < class155.field2793; var0++) {
            for (int var5 = 0; var5 < class39.field834; var5++) {
                for (int var6 = 0; var6 < class33.field719; var6++) {
                    class229.field4232[var0][var5][var6] = null;
                }
            }
        }
        for (int var1 = 0; var1 < class70.field1409; var1++) {
            for (int var4 = 0; var4 < class70.field1400[var1]; var4++) {
                class70.field1401[var1][var4] = null;
            }
            class70.field1400[var1] = 0;
        }
        for (int var2 = 0; var2 < class73.field1434; var2++) {
            class177.field3217[var2] = null;
        }
        class73.field1434 = 0;
        for (int var3 = 0; var3 < class114.field2141.length; var3++) {
            class114.field2141[var3] = null;
        }
    }
}
