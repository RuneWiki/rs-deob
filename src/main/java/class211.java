import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class211 extends InputStream {

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "[I")
    public static int[] field3756 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "Z")
    public static boolean field3755 = false;

    @OriginalMember(owner = "client!lf", name = "k", descriptor = "Lid;")
    public static class149 field3763 = class60.method382("ondulation2:", (byte) 75);

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "Z")
    public static boolean field3762 = true;

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "Z")
    public static boolean field3761 = true;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
    public static int field3753;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "I")
    public static int field3754;

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "I")
    public static int field3757;

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "I")
    public static int field3760;

    @OriginalMember(owner = "client!lf", name = "l", descriptor = "I")
    public static int field3764;

    @OriginalMember(owner = "client!lf", name = "m", descriptor = "I")
    public static int field3765;

    @OriginalMember(owner = "client!lf", name = "n", descriptor = "I")
    public static int field3766;

    @OriginalMember(owner = "client!lf", name = "o", descriptor = "I")
    public static int field3767;

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "[[[I")
    public static int[][][] field3759;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IZ)Lid;")
    public static final class149 method1434(int arg0, boolean arg1) {
        if (arg1) {
            field3764++;
            return class249.method1727(false, 0, arg0, 10);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V")
    public static void method1435(int arg0) {
        field3763 = null;
        if (arg0 != 0) {
            method1434(-53, true);
        }
        field3756 = null;
        field3759 = null;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)V")
    public static final void method1436(int arg0) {
        field3758++;
        if (arg0 != -22028) {
            method1437(106, -37);
        }
        for (int var1 = 0; var1 < class162.field3013; var1++) {
            int var2 = class255.field4462[var1];
            class127 var3 = class107.field1851[var2];
            int var4 = class11.field150.method489((byte) -115);
            if ((var4 & 0x10) != 0) {
                var4 += class11.field150.method489((byte) -70) << 8;
            }
            class162.method1190(var2, var3, arg0 + 21910, var4);
        }
    }

    @OriginalMember(owner = "client!lf", name = "read", descriptor = "()I")
    public final int read() {
        class151.method1074(-113, 30000L);
        field3760++;
        return -1;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)V")
    public static final void method1437(int arg0, int arg1) {
        int var2 = 41 / ((26 - arg1) / 34);
        field3767++;
        class216 var3 = class139.method972(arg0, false, 2);
        var3.method1457(0);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I[Laj;IIIIIIZI)V")
    public static final void method1438(int arg0, class47[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        field3766++;
        class72.method461(arg9, arg4, arg6, arg3);
        class235.method1584();
        for (int var10 = 0; var10 < arg1.length; var10++) {
            class47 var11 = arg1[var10];
            if (var11 != null && (var11.field707 == arg2 || arg2 == -1412584499 && class244.field4296 == var11)) {
                int var12;
                if (arg5 == -1) {
                    class54.field979[class259.field4538] = var11.field754 + arg7;
                    class41.field645[class259.field4538] = var11.field784 + arg0;
                    class157.field2887[class259.field4538] = var11.field722;
                    class259.field4548[class259.field4538] = var11.field727;
                    var12 = class259.field4538++;
                } else {
                    var12 = arg5;
                }
                var11.field767 = var12;
                var11.field737 = class118.field2022;
                if (!var11.field718 || !client.method1107(var11)) {
                    if (var11.field820 > 0) {
                        class15.method96(12449, var11);
                    }
                    int var13 = var11.field754 + arg7;
                    int var14 = var11.field738;
                    int var15 = var11.field784 + arg0;
                    if (class38.field563 && (client.method1104(var11).field2992 != 0 || var11.field760 == 0) && var14 > 127) {
                        var14 = 127;
                    }
                    if (class244.field4296 == var11) {
                        if (arg2 != -1412584499 && !var11.field823) {
                            class124.field2193 = arg7;
                            class168.field3117 = arg1;
                            class188.field3376 = arg0;
                            continue;
                        }
                        if (!var11.field823) {
                            var14 = 128;
                        }
                        if (class182.field3285 && class20.field305) {
                            int var16 = class49.field883;
                            int var17 = var16 - class106.field1839;
                            if (class143.field2603 > var17) {
                                var17 = class143.field2603;
                            }
                            if (class143.field2603 + class102.field1801.field722 < var11.field722 + var17) {
                                var17 = class143.field2603 + class102.field1801.field722 - var11.field722;
                            }
                            var13 = var17;
                            int var18 = class285.field5068;
                            int var19 = var18 - class106.field1831;
                            if (class99.field1755 > var19) {
                                var19 = class99.field1755;
                            }
                            if ((class99.field1755 + class102.field1801.field727) < (var19 + var11.field727)) {
                                var19 = class99.field1755 + class102.field1801.field727 - var11.field727;
                            }
                            var15 = var19;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var11.field760 == 2) {
                        var20 = arg4;
                        var21 = arg3;
                        var22 = arg6;
                        var23 = arg9;
                    } else {
                        var20 = arg4 < var15 ? var15 : arg4;
                        var23 = arg9 >= var13 ? arg9 : var13;
                        int var24 = var15 + var11.field727;
                        int var25 = var11.field722 + var13;
                        if (var11.field760 == 9) {
                            var25++;
                            var24++;
                        }
                        var22 = arg6 > var25 ? var25 : arg6;
                        var21 = arg3 > var24 ? var24 : arg3;
                    }
                    if (!var11.field718 || var23 < var22 && var21 > var20) {
                        if (var11.field820 != 0) {
                            if (var11.field820 == 1337) {
                                class80.field1486 = var13;
                                class7.field86 = var11;
                                class268.field4815 = var15;
                                class232.method1568((byte) 118, var11.field727, var11.field722, var15, var13, var11.field820 == 1403);
                                class72.method461(arg9, arg4, arg6, arg3);
                                continue;
                            }
                            if (var11.field820 == 1338) {
                                if (!var11.method293(22710)) {
                                    continue;
                                }
                                class122.method861(var13, var11, var12, 32, var15);
                                class72.method461(arg9, arg4, arg6, arg3);
                                if (class62.field1109 != 0 && class62.field1109 != 3 || class32.field481 || var23 > class189.field3383 || class2.field32 < var20 || class189.field3383 >= var22 || var21 <= class2.field32) {
                                    continue;
                                }
                                int var26 = class2.field32 - var15;
                                int var27 = class189.field3383 - var13;
                                int var28 = var11.field712[var26];
                                if (var28 > var27 || var27 > (var11.field870[var26] + var28)) {
                                    continue;
                                }
                                int var29 = var26 - var11.field727 / 2;
                                int var30 = class55.field985 + class184.field3320 & 0x7FF;
                                int var31 = var27 - var11.field722 / 2;
                                int var32 = class235.field4118[var30];
                                int var33 = class235.field4123[var30];
                                int var34 = (class232.field4093 + 256) * var33 >> 8;
                                int var35 = (class232.field4093 + 256) * var32 >> 8;
                                int var36 = var29 * var34 + var31 * var35 >> 11;
                                int var37 = var29 * var35 - (var31 * var34) >> 11;
                                int var38 = class77.field1449.field2347 + var36 >> 7;
                                int var39 = class77.field1449.field2340 - var37 >> 7;
                                if (class40.field621 && (class247.field4332 & 0x40) != 0) {
                                    class47 var40 = class247.method1720(class24.field368, 18062, class97.field1717);
                                    if (var40 == null) {
                                        class261.method1816(5197);
                                    } else {
                                        class69.method434((byte) 122, class197.field3586, (short) 41, class197.field3581, var38, var39, 1L, class216.field3805);
                                    }
                                    continue;
                                }
                                if (class245.field4306 == 1) {
                                    class69.method434((byte) 118, class171.field3158, (short) 5, class198.field3599, var38, var39, 1L, -1);
                                }
                                class69.method434((byte) 109, class171.field3158, (short) 57, class54.field981, var38, var39, 1L, -1);
                                continue;
                            }
                            if (var11.field820 == 1339) {
                                if (var11.method293(22710)) {
                                    class108.method760(var12, var11, 3, var13, var15);
                                    class72.method461(arg9, arg4, arg6, arg3);
                                }
                                continue;
                            }
                            if (var11.field820 == 1400) {
                                class277.method1912(var15, 2, var13, var11.field727, var11.field722);
                                class94.field1664[var12] = true;
                                class216.field3819[var12] = true;
                                class72.method461(arg9, arg4, arg6, arg3);
                                continue;
                            }
                            if (var11.field820 == 1401) {
                                class61.method384(var13, (byte) 20, var15, var11.field727, var11.field722);
                                class94.field1664[var12] = true;
                                class216.field3819[var12] = true;
                                class72.method461(arg9, arg4, arg6, arg3);
                                continue;
                            }
                            if (var11.field820 == 1402) {
                                class60.method380(var13, 122, var15);
                                class94.field1664[var12] = true;
                                class216.field3819[var12] = true;
                                continue;
                            }
                            if (var11.field820 == 1405) {
                                if (!class168.field3129) {
                                    continue;
                                }
                                int var41 = var11.field722 + var13;
                                int var42 = var15 + 15;
                                class6.field73.method1171(class237.method1603(new class149[] { class138.field2523, method1434(class133.field2412, true) }, -126), var41, var42, 16776960, -1);
                                Runtime var43 = Runtime.getRuntime();
                                int var44 = 0;
                                int var45 = (int) ((var43.totalMemory() - var43.freeMemory()) / 1024L);
                                int var46 = 0;
                                int var130 = var42 + 15;
                                int var47 = 16776960;
                                if (var45 > 65536) {
                                    var47 = 16711680;
                                }
                                int var48 = 0;
                                class6.field73.method1171(class237.method1603(new class149[] { class249.field4357, method1434(var45, true), class10.field146 }, -107), var41, var130, var47, -1);
                                var42 = var130 + 15;
                                for (int var49 = 0; var49 < 28; var49++) {
                                    var44 += class25.field378[var49].method1332((byte) 64);
                                    var46 += class25.field378[var49].method1334(arg8);
                                    var48 += class25.field378[var49].method1335(123);
                                }
                                int var50 = 16776960;
                                int var51 = var46 * 10000 / var44;
                                int var52 = var48 * 100 / var44;
                                class149 var53 = class237.method1603(new class149[] { class74.field1317, class227.method1525((long) var51, 0, 2, (byte) 98, true), class281.field4994, method1434(var52, true), class181.field3259 }, -95);
                                class188.field3364.method1171(var53, var41, var42, var50, -1);
                                class94.field1664[var12] = true;
                                class216.field3819[var12] = true;
                                var42 += 12;
                                continue;
                            }
                            if (var11.field820 == 1406) {
                                class122.field2155 = var13;
                                class288.field5144 = var15;
                                class128.field2257 = var11;
                                continue;
                            }
                        }
                        if (!class32.field481) {
                            if (var11.field760 == 0 && var11.field857 && class189.field3383 >= var23 && var20 <= class2.field32 && var22 > class189.field3383 && var21 > class2.field32 && !class38.field563) {
                                class224.field3941[0] = class169.field3134;
                                class284.field5032[0] = 1002;
                                class60.field1092 = 1;
                                class138.field2517[0] = class133.field2413;
                                class78.field1456[0] = class171.field3158;
                            }
                            if (var23 <= class189.field3383 && class2.field32 >= var20 && var22 > class189.field3383 && var21 > class2.field32) {
                                class94.method683(class2.field32 - var15, -var13 + class189.field3383, -1, var11);
                            }
                        }
                        if (var11.field760 == 0) {
                            if (!var11.field718 && client.method1107(var11) && class176.field3224 != var11) {
                                continue;
                            }
                            if (!var11.field718) {
                                if (var11.field824 > var11.field755 - var11.field727) {
                                    var11.field824 = var11.field755 - var11.field727;
                                }
                                if (var11.field824 < 0) {
                                    var11.field824 = 0;
                                }
                            }
                            method1438(var15 - var11.field824, arg1, var11.field834, var21, var20, var12, var22, var13 - var11.field805, arg8, var23);
                            if (var11.field761 != null) {
                                method1438(var15 - var11.field824, var11.field761, var11.field834, var21, var20, var12, var22, var13 - var11.field805, true, var23);
                            }
                            class3 var54 = (class3) class34.field499.method639((byte) -15, (long) var11.field834);
                            if (var54 != null) {
                                if (var54.field37 == 0 && !class32.field481 && class189.field3383 >= var23 && class2.field32 >= var20 && var22 > class189.field3383 && class2.field32 < var21 && !class38.field563) {
                                    class60.field1092 = 1;
                                    class284.field5032[0] = 1002;
                                    class224.field3941[0] = class169.field3134;
                                    class138.field2517[0] = class133.field2413;
                                    class78.field1456[0] = class171.field3158;
                                }
                                class182.method1260(var21, var15, var20, var22, var23, var12, var13, var54.field42, 22562);
                            }
                            class72.method461(arg9, arg4, arg6, arg3);
                            class235.method1584();
                        }
                        if (class16.field230[var12] || class287.field5119 > 1) {
                            if (var11.field760 == 0 && !var11.field718 && var11.field727 < var11.field755) {
                                class254.method1750(var11.field727, var15, var11.field824, var11.field755, var11.field722 + var13, (byte) 122);
                            }
                            if (var11.field760 != 1) {
                                if (var11.field760 == 2) {
                                    int var55 = 0;
                                    for (int var56 = 0; var56 < var11.field732; var56++) {
                                        for (int var57 = 0; var57 < var11.field726; var57++) {
                                            int var58 = var13 + ((var11.field859 + 32) * var57);
                                            int var59 = (var11.field746 + 32) * var56 + var15;
                                            if (var55 < 20) {
                                                var58 += var11.field770[var55];
                                                var59 += var11.field778[var55];
                                            }
                                            if (var11.field797[var55] > 0) {
                                                boolean var61 = false;
                                                boolean var62 = false;
                                                int var63 = var11.field797[var55] - 1;
                                                if (arg9 < (var58 + 32) && var58 < arg6 && arg4 < var59 + 32 && var59 < arg3 || class23.field322 == var11 && class115.field1970 == var55) {
                                                    class190 var64;
                                                    if (class43.field657 == 1 && class78.field1459 == var55 && class5.field60 == var11.field834) {
                                                        var64 = class168.method1217(var63, 2, var11.field698, var11.field786[var55], (byte) -65, 0);
                                                    } else {
                                                        var64 = class168.method1217(var63, 1, var11.field698, var11.field786[var55], (byte) 73, 3153952);
                                                    }
                                                    if (class235.field4119) {
                                                        class94.field1664[var12] = true;
                                                    }
                                                    if (var64 == null) {
                                                        class182.method1267(var11, 117);
                                                    } else if (class23.field322 == var11 && class115.field1970 == var55) {
                                                        int var65 = class285.field5068 - class186.field3349;
                                                        if (var65 < 5 && var65 > -5) {
                                                            var65 = 0;
                                                        }
                                                        int var66 = class49.field883 - class210.field3747;
                                                        if (var66 < 5 && var66 > -5) {
                                                            var66 = 0;
                                                        }
                                                        if (class50.field900 < 5) {
                                                            var66 = 0;
                                                            var65 = 0;
                                                        }
                                                        var64.method285(var58 + var66, var59 - -var65, 128);
                                                        if (arg2 != -1) {
                                                            class47 var67 = arg1[arg2 & 0xFFFF];
                                                            int var68 = class72.field1249;
                                                            int var69 = class72.field1251;
                                                            if (var59 + var65 < var68 && var67.field824 > 0) {
                                                                int var70 = (var68 - var65 - var59) * class149.field2683 / 3;
                                                                if (var70 > (class149.field2683 * 10)) {
                                                                    var70 = class149.field2683 * 10;
                                                                }
                                                                if (var70 > var67.field824) {
                                                                    var70 = var67.field824;
                                                                }
                                                                class186.field3349 += var70;
                                                                var67.field824 -= var70;
                                                                class182.method1267(var67, 105);
                                                            }
                                                            if (var65 + var59 + 32 > var69 && var67.field824 < var67.field755 - var67.field727) {
                                                                int var71 = (var59 + var65 + 32 - var69) * class149.field2683 / 3;
                                                                if ((class149.field2683 * 10) < var71) {
                                                                    var71 = class149.field2683 * 10;
                                                                }
                                                                if ((var67.field755 - var67.field727 - var67.field824) < var71) {
                                                                    var71 = var67.field755 - (var67.field824 + var67.field727);
                                                                }
                                                                var67.field824 += var71;
                                                                class186.field3349 -= var71;
                                                                class182.method1267(var67, 102);
                                                            }
                                                        }
                                                    } else if (class116.field1979 == var11 && class62.field1107 == var55) {
                                                        var64.method285(var58, var59, 128);
                                                    } else {
                                                        var64.method263(var58, var59);
                                                    }
                                                }
                                            } else if (var11.field757 != null && var55 < 20) {
                                                class190 var60 = var11.method298(true, var55);
                                                if (var60 != null) {
                                                    var60.method263(var58, var59);
                                                } else if (class269.field4855) {
                                                    class182.method1267(var11, 78);
                                                }
                                            }
                                            var55++;
                                        }
                                    }
                                } else if (var11.field760 == 3) {
                                    int var72;
                                    if (class65.method405(var11, (byte) -70)) {
                                        var72 = var11.field728;
                                        if (class176.field3224 == var11 && var11.field860 != 0) {
                                            var72 = var11.field860;
                                        }
                                    } else {
                                        var72 = var11.field812;
                                        if (class176.field3224 == var11 && var11.field721 != 0) {
                                            var72 = var11.field721;
                                        }
                                    }
                                    if (var14 == 0) {
                                        if (var11.field833) {
                                            class72.method459(var13, var15, var11.field722, var11.field727, var72);
                                        } else {
                                            class72.method457(var13, var15, var11.field722, var11.field727, var72);
                                        }
                                    } else if (var11.field833) {
                                        class72.method462(var13, var15, var11.field722, var11.field727, var72, 256 - (var14 & 0xFF));
                                    } else {
                                        class72.method465(var13, var15, var11.field722, var11.field727, var72, 256 - (var14 & 0xFF));
                                    }
                                } else if (var11.field760 == 4) {
                                    class160 var73 = var11.method306(class184.field3326, (byte) 109);
                                    if (var73 != null) {
                                        class149 var74 = var11.field752;
                                        int var75;
                                        if (class65.method405(var11, (byte) 125)) {
                                            var75 = var11.field728;
                                            if (class176.field3224 == var11 && var11.field860 != 0) {
                                                var75 = var11.field860;
                                            }
                                            if (var11.field705.method1053((byte) 126) > 0) {
                                                var74 = var11.field705;
                                            }
                                        } else {
                                            var75 = var11.field812;
                                            if (class176.field3224 == var11 && var11.field721 != 0) {
                                                var75 = var11.field721;
                                            }
                                        }
                                        if (var11.field718 && var11.field822 != -1) {
                                            class261 var76 = class226.method1516(var11.field822, -28322);
                                            var74 = var76.field4604;
                                            if (var74 == null) {
                                                var74 = class165.field3074;
                                            }
                                            if ((var76.field4645 == 1 || var11.field821 != 1) && var11.field821 != -1) {
                                                var74 = class237.method1603(new class149[] { class36.field541, var74, class190.field3413, class124.method873(var11.field821, 112) }, -122);
                                            }
                                        }
                                        if (class263.field4677 == var11) {
                                            var75 = var11.field812;
                                            var74 = class189.field3388;
                                        }
                                        if (!var11.field718) {
                                            var74 = client.method1110(var74, var11, (byte) -43);
                                        }
                                        var73.method1153(var74, var13, var15, var11.field722, var11.field727, var75, var11.field811 ? 0 : -1, var11.field747, var11.field781, var11.field731);
                                    } else if (class269.field4855) {
                                        class182.method1267(var11, 75);
                                    }
                                } else if (var11.field760 == 5) {
                                    if (var11.field718) {
                                        class190 var77;
                                        if (var11.field822 == -1) {
                                            var77 = var11.method300(false, -72);
                                        } else {
                                            var77 = class168.method1217(var11.field822, var11.field817, var11.field698, var11.field821, (byte) 69, var11.field827);
                                        }
                                        if (var77 != null) {
                                            int var78 = var77.field3401;
                                            int var79 = var77.field3411;
                                            if (var11.field710) {
                                                int var81 = (var79 - (1 - var11.field722)) / var79;
                                                int var82 = (var78 + var11.field727 - 1) / var78;
                                                class72.method449(var13, var15, var11.field722 + var13, var11.field727 + var15);
                                                for (int var83 = 0; var83 < var81; var83++) {
                                                    for (int var84 = 0; var84 < var82; var84++) {
                                                        if (var11.field720 != 0) {
                                                            var77.method1297(var11.field720, var78 / 2 + var78 * var84 + var15, true, var79 / 2 + var79 * var83 + var13, 4096);
                                                        } else if (var14 == 0) {
                                                            var77.method263(var79 * var83 + var13, var78 * var84 + var15);
                                                        } else {
                                                            var77.method285(var79 * var83 + var13, var15 - -(var78 * var84), 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class72.method461(arg9, arg4, arg6, arg3);
                                            } else {
                                                int var80 = var11.field722 * 4096 / var79;
                                                if (var11.field720 != 0) {
                                                    var77.method1297(var11.field720, var15 + (var11.field727 / 2), arg8, var11.field722 / 2 + var13, var80);
                                                } else if (var14 != 0) {
                                                    var77.method283(var13, var15, var11.field722, var11.field727, 256 - (var14 & 0xFF));
                                                } else if (var11.field722 == var79 && var11.field727 == var78) {
                                                    var77.method263(var13, var15);
                                                } else {
                                                    var77.method280(var13, var15, var11.field722, var11.field727);
                                                }
                                            }
                                        } else if (class269.field4855) {
                                            class182.method1267(var11, 112);
                                        }
                                    } else {
                                        class190 var85 = var11.method300(class65.method405(var11, (byte) -117), -62);
                                        if (var85 != null) {
                                            var85.method263(var13, var15);
                                        } else if (class269.field4855) {
                                            class182.method1267(var11, 96);
                                        }
                                    }
                                } else if (var11.field760 == 6) {
                                    boolean var86 = class65.method405(var11, (byte) -17);
                                    class262 var87 = null;
                                    int var88;
                                    if (var86) {
                                        var88 = var11.field866;
                                    } else {
                                        var88 = var11.field807;
                                    }
                                    int var89 = 0;
                                    if (var11.field822 != -1) {
                                        class261 var94 = class226.method1516(var11.field822, -28322);
                                        if (var94 != null) {
                                            class261 var95 = var94.method1803(var11.field821, -1);
                                            class164 var96 = var88 == -1 ? null : class69.method436(var88, -32);
                                            var87 = var95.method1815(var96, var11.field790, -93, 1, var11.field831, var11.field736);
                                            if (var87 == null) {
                                                class182.method1267(var11, 97);
                                            } else {
                                                var89 = -var87.method53() / 2;
                                            }
                                        }
                                    } else if (var11.field862 == 5) {
                                        if (var11.field716 == -1) {
                                            var87 = class36.field533.method1314(-1, -1, (class164) null, -1, true, (class242[]) null, 0, 0, true, (class164) null, -1);
                                        } else {
                                            int var90 = var11.field716 & 0x7FF;
                                            if (class258.field4514 == var90) {
                                                var90 = 2047;
                                            }
                                            class127 var91 = class107.field1851[var90];
                                            class164 var92 = var88 == -1 ? null : class69.method436(var88, -32);
                                            if (var91 != null && (int) var91.field2243.method1023((byte) -16) << 11 == (var11.field716 & 0xFFFFF800)) {
                                                var87 = var91.field2226.method1314(0, -1, var92, var11.field790, arg8, (class242[]) null, 0, 0, true, (class164) null, -1);
                                            }
                                        }
                                    } else if (var88 == -1) {
                                        var87 = var11.method296(class77.field1449.field2226, -1, -1, var86, 0, false, (class164) null);
                                        if (var87 == null && class269.field4855) {
                                            class182.method1267(var11, 84);
                                        }
                                    } else {
                                        class164 var93 = class69.method436(var88, -32);
                                        var87 = var11.method296(class77.field1449.field2226, var11.field736, var11.field790, var86, var11.field831, false, var93);
                                        if (var87 == null && class269.field4855) {
                                            class182.method1267(var11, 105);
                                        }
                                    }
                                    if (var87 != null) {
                                        int var97;
                                        if (var11.field744 > 0) {
                                            var97 = (var11.field727 << 8) / var11.field744;
                                        } else {
                                            var97 = 256;
                                        }
                                        int var98;
                                        if (var11.field773 <= 0) {
                                            var98 = 256;
                                        } else {
                                            var98 = (var11.field722 << 8) / var11.field773;
                                        }
                                        int var99 = (var11.field762 * var98 >> 8) + (var13 + (var11.field722 / 2));
                                        int var100 = (var11.field845 * var97 >> 8) + var11.field727 / 2 + var15;
                                        class235.method1595(var99, var100);
                                        int var101 = class235.field4123[var11.field863] * var11.field871 >> 16;
                                        int var102 = class235.field4118[var11.field863] * var11.field871 >> 16;
                                        if (!var11.field718) {
                                            var87.method859(0, var11.field697, 0, var11.field863, 0, var101, var102, -1L);
                                        } else if (var11.field832) {
                                            ((class121) var87).method844(0, var11.field697, var11.field858, var11.field863, var11.field749, var89 + var101 + var11.field753, var11.field753 + var102, var11.field871);
                                        } else {
                                            var87.method859(0, var11.field697, var11.field858, var11.field863, var11.field749, var89 + var101 + var11.field753, var11.field753 + var102, -1L);
                                        }
                                        class235.method1576();
                                    }
                                } else {
                                    if (var11.field760 == 7) {
                                        class160 var103 = var11.method306(class184.field3326, (byte) 57);
                                        if (var103 == null) {
                                            if (class269.field4855) {
                                                class182.method1267(var11, 124);
                                            }
                                            continue;
                                        }
                                        int var104 = 0;
                                        for (int var105 = 0; var105 < var11.field732; var105++) {
                                            for (int var106 = 0; var106 < var11.field726; var106++) {
                                                if (var11.field797[var104] > 0) {
                                                    class261 var107 = class226.method1516(var11.field797[var104] - 1, -28322);
                                                    class149 var108;
                                                    if (var107.field4645 != 1 && var11.field786[var104] == 1) {
                                                        var108 = class237.method1603(new class149[] { class36.field541, var107.field4604, class227.field3981 }, -99);
                                                    } else {
                                                        var108 = class237.method1603(new class149[] { class36.field541, var107.field4604, class190.field3413, class124.method873(var11.field786[var104], 108) }, -120);
                                                    }
                                                    int var109 = (var11.field859 + 115) * var106 + var13;
                                                    int var110 = (var11.field746 + 12) * var105 + var15;
                                                    if (var11.field747 == 0) {
                                                        var103.method1168(var108, var109, var110, var11.field812, var11.field811 ? 0 : -1);
                                                    } else if (var11.field747 == 1) {
                                                        var103.method1156(var108, var109 + 57, var110, var11.field812, var11.field811 ? 0 : -1);
                                                    } else {
                                                        var103.method1171(var108, var109 + 114, var110, var11.field812, var11.field811 ? 0 : -1);
                                                    }
                                                }
                                                var104++;
                                            }
                                        }
                                    }
                                    if (var11.field760 == 8 && class24.field346 == var11 && class64.field1146 == class24.field344) {
                                        int var111 = 0;
                                        int var112 = 0;
                                        class149 var113 = var11.field752;
                                        class160 var114 = class6.field73;
                                        class149 var115 = client.method1110(var113, var11, (byte) -40);
                                        while (var115.method1053((byte) -114) > 0) {
                                            int var123 = var115.method1036((byte) -128, class43.field663);
                                            class149 var124;
                                            if (var123 == -1) {
                                                var124 = var115;
                                                var115 = class171.field3158;
                                            } else {
                                                var124 = var115.method1024(0, -5975, var123);
                                                var115 = var115.method1025((byte) 34, var123 + 4);
                                            }
                                            int var125 = var114.method1161(var124);
                                            if (var111 < var125) {
                                                var111 = var125;
                                            }
                                            var112 += var114.field2932 + 1;
                                        }
                                        var112 += 7;
                                        var111 += 6;
                                        int var116 = var11.field727 + var15 + 5;
                                        if (var112 + var116 > arg3) {
                                            var116 = arg3 - var112;
                                        }
                                        int var117 = var11.field722 + var13 - var111 - 5;
                                        if (var13 + 5 > var117) {
                                            var117 = var13 + 5;
                                        }
                                        if (var117 + var111 > arg6) {
                                            var117 = arg6 - var111;
                                        }
                                        class72.method459(var117, var116, var111, var112, 16777120);
                                        class72.method457(var117, var116, var111, var112, 0);
                                        class149 var118 = var11.field752;
                                        int var119 = var116 + var114.field2932 + 2;
                                        class149 var120 = client.method1110(var118, var11, (byte) -84);
                                        while (var120.method1053((byte) 110) > 0) {
                                            int var121 = var120.method1036((byte) -128, class43.field663);
                                            class149 var122;
                                            if (var121 == -1) {
                                                var122 = var120;
                                                var120 = class171.field3158;
                                            } else {
                                                var122 = var120.method1024(0, -5975, var121);
                                                var120 = var120.method1025((byte) 34, var121 + 4);
                                            }
                                            var114.method1168(var122, var117 + 3, var119, 0, -1);
                                            var119 += var114.field2932 + 1;
                                        }
                                    }
                                    if (var11.field760 == 9) {
                                        int var126;
                                        int var127;
                                        int var128;
                                        int var129;
                                        if (var11.field838) {
                                            var129 = var11.field722 + var13;
                                            var128 = var15 + var11.field727;
                                            var126 = var15;
                                            var127 = var13;
                                        } else {
                                            var126 = var15 + var11.field727;
                                            var127 = var13;
                                            var128 = var15;
                                            var129 = var11.field722 + var13;
                                        }
                                        if (var11.field844 == 1) {
                                            class72.method467(var127, var128, var129, var126, var11.field812);
                                        } else {
                                            class72.method458(var127, var128, var129, var126, var11.field812, var11.field844);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!arg8) {
            method1434(-88, false);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "([Lid;[SIZI)V")
    public static final void method1439(class149[] arg0, short[] arg1, int arg2, boolean arg3, int arg4) {
        if (!arg3) {
            method1439((class149[]) null, (short[]) null, -18, true, 126);
        }
        if (arg4 > arg2) {
            int var5 = (arg2 + arg4) / 2;
            int var6 = arg2;
            class149 var7 = arg0[var5];
            arg0[var5] = arg0[arg4];
            arg0[arg4] = var7;
            short var8 = arg1[var5];
            arg1[var5] = arg1[arg4];
            arg1[arg4] = var8;
            for (int var9 = arg2; var9 < arg4; var9++) {
                if (var7 == null || arg0[var9] != null && arg0[var9].method1059(19, var7) < (var9 & 0x1)) {
                    class149 var10 = arg0[var9];
                    arg0[var9] = arg0[var6];
                    arg0[var6] = var10;
                    short var11 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6++] = var11;
                }
            }
            arg0[arg4] = arg0[var6];
            arg0[var6] = var7;
            arg1[arg4] = arg1[var6];
            arg1[var6] = var8;
            method1439(arg0, arg1, arg2, true, var6 - 1);
            method1439(arg0, arg1, var6 + 1, true, arg4);
        }
        field3754++;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)V")
    public static final void method1440(byte arg0) {
        field3753++;
        int var1 = 0;
        int[] var2 = new int[class44.field678];
        for (int var3 = 0; var3 < class44.field678; var3++) {
            class261 var5 = class226.method1516(var3, -28322);
            if (var5.field4668 >= 0 || var5.field4653 >= 0) {
                var2[var1++] = var3;
            }
        }
        class52.field942 = new int[var1];
        if (arg0 < -64) {
            for (int var4 = 0; var4 < var1; var4++) {
                class52.field942[var4] = var2[var4];
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(I)V")
    public static final void method1441(int arg0) {
        if (arg0 <= 55) {
            field3759 = null;
        }
        field3765++;
        class115.field1957.method1291(0);
    }
}
