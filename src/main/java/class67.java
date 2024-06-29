import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class67 extends class264 {

    @OriginalMember(owner = "client!r", name = "nb", descriptor = "[S")
    private short[] field1046 = new short[257];

    @OriginalMember(owner = "client!r", name = "mb", descriptor = "I")
    private int field1045 = 0;

    @OriginalMember(owner = "client!r", name = "fb", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "client!r", name = "gb", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "client!r", name = "hb", descriptor = "I")
    public static int field1040;

    @OriginalMember(owner = "client!r", name = "ib", descriptor = "I")
    public static int field1041;

    @OriginalMember(owner = "client!r", name = "jb", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "client!r", name = "kb", descriptor = "I")
    public static int field1043;

    @OriginalMember(owner = "client!r", name = "lb", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "client!r", name = "qb", descriptor = "I")
    public static int field1049;

    @OriginalMember(owner = "client!r", name = "rb", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!r", name = "sb", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!r", name = "tb", descriptor = "I")
    public static int field1052;

    @OriginalMember(owner = "client!r", name = "vb", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!r", name = "wb", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!r", name = "xb", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "client!r", name = "yb", descriptor = "I")
    public static int field1057;

    @OriginalMember(owner = "client!r", name = "zb", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!r", name = "ub", descriptor = "[I")
    private int[] field1053;

    @OriginalMember(owner = "client!r", name = "Ab", descriptor = "[I")
    private int[] field1059;

    @OriginalMember(owner = "client!r", name = "ob", descriptor = "[[B")
    public static byte[][] field1047;

    @OriginalMember(owner = "client!r", name = "pb", descriptor = "[[I")
    private int[][] field1048;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIIIII[Leb;)V", line = 4)
    public static final void method474(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class253[] arg9) {
        if (arg7 != 1) {
            method486(68, (byte) 78, (class202) null);
        }
        field1044++;
        class124.method822(arg8, arg0, arg6, arg3);
        for (int var10 = 0; var10 < arg9.length; var10++) {
            class253 var11 = arg9[var10];
            if (var11 != null && (var11.field4196 == arg4 || arg4 == -1412584499 && class174.field2664 == var11)) {
                int var12;
                if (arg2 == -1) {
                    class218.field3510[class188.field2947] = var11.field4235 + arg5;
                    class14.field257[class188.field2947] = var11.field4322 + arg1;
                    class177.field2701[class188.field2947] = var11.field4228;
                    class102.field1523[class188.field2947] = var11.field4190;
                    var12 = class188.field2947++;
                } else {
                    var12 = arg2;
                }
                var11.field4187 = class50.field784;
                var11.field4299 = var12;
                if (!var11.field4265 || !client.method766(var11)) {
                    if (var11.field4238 > 0) {
                        class153.method968(var11, -122);
                    }
                    int var13 = var11.field4308;
                    int var14 = var11.field4322 + arg1;
                    int var15 = var11.field4235 + arg5;
                    if (class184.field2833 && (client.method767(var11) != 0 || var11.field4216 == 0) && var13 > 127) {
                        var13 = 127;
                    }
                    if (class174.field2664 == var11) {
                        if (arg4 != -1412584499 && !var11.field4201) {
                            class15.field272 = arg5;
                            class176.field2690 = arg9;
                            class49.field773 = arg1;
                            continue;
                        }
                        if (class136.field2011 && class182.field2778) {
                            int var16 = class18.field308;
                            int var17 = class271.field4636;
                            int var18 = var16 - class98.field1466;
                            if (var18 < class247.field4090) {
                                var18 = class247.field4090;
                            }
                            if (var11.field4190 + var18 > class247.field4090 + class189.field2959.field4190) {
                                var18 = class247.field4090 + class189.field2959.field4190 - var11.field4190;
                            }
                            int var19 = var17 - class270.field4630;
                            var14 = var18;
                            if (var19 < class92.field1392) {
                                var19 = class92.field1392;
                            }
                            if (class92.field1392 + class189.field2959.field4228 < var19 - -var11.field4228) {
                                var19 = class92.field1392 + class189.field2959.field4228 - var11.field4228;
                            }
                            var15 = var19;
                        }
                        if (!var11.field4201) {
                            var13 = 128;
                        }
                    }
                    int var20;
                    int var22;
                    int var24;
                    int var25;
                    if (var11.field4216 == 2) {
                        var20 = arg0;
                        var24 = arg6;
                        var22 = arg8;
                        var25 = arg3;
                    } else {
                        var20 = arg0 >= var14 ? arg0 : var14;
                        int var21 = var11.field4228 + var15;
                        var22 = arg8 >= var15 ? arg8 : var15;
                        int var23 = var11.field4190 + var14;
                        if (var11.field4216 == 9) {
                            var21++;
                            var23++;
                        }
                        var24 = arg6 <= var21 ? arg6 : var21;
                        var25 = var23 < arg3 ? var23 : arg3;
                    }
                    if (!var11.field4265 || var24 > var22 && var20 < var25) {
                        if (var11.field4238 != 0) {
                            if (var11.field4238 == 1337 || var11.field4238 == 1403) {
                                class16.field300 = var14;
                                class208.field3306 = var11;
                                class294.field4960 = var15;
                                class1.method6(var11.field4228, var14, var11.field4238 == 1403, (byte) 112, var15, var11.field4190);
                                class124.method822(arg8, arg0, arg6, arg3);
                                continue;
                            }
                            if (var11.field4238 == 1338) {
                                if (var11.method1775(arg7 ^ 0x1)) {
                                    class73.method524(24632, var14, var12, var15, var11);
                                    class124.method822(arg8, arg0, arg6, arg3);
                                }
                                continue;
                            }
                            if (var11.field4238 == 1339) {
                                if (var11.method1775(0)) {
                                    class176.method1152(var14, var12, var15, true, var11);
                                    class124.method822(arg8, arg0, arg6, arg3);
                                }
                                continue;
                            }
                            if (var11.field4238 == 1400) {
                                class171.method1137(var15, var14, var11.field4190, false, var11.field4228);
                                class296.field4975[var12] = true;
                                class52.field822[var12] = true;
                                class124.method822(arg8, arg0, arg6, arg3);
                                continue;
                            }
                            if (var11.field4238 == 1401) {
                                class164.method1095(var11.field4190, var15, var11.field4228, (byte) 48, var14);
                                class296.field4975[var12] = true;
                                class52.field822[var12] = true;
                                class124.method822(arg8, arg0, arg6, arg3);
                                continue;
                            }
                            if (var11.field4238 == 1402) {
                                continue;
                            }
                            if (var11.field4238 == 1404) {
                                class43.method303(1, var14, class201.field3197, class282.field4791, var15, var11.field4190, var11.field4228, var11);
                                class296.field4975[var12] = true;
                                class52.field822[var12] = true;
                                continue;
                            }
                            if (var11.field4238 == 1405) {
                                if (class197.field3131) {
                                    int var26 = var11.field4228 + var15;
                                    int var27 = var14 + 15;
                                    class72.field1127.method2017(class288.method1940((byte) 74, new class5[] { class210.field3355, class175.method1148(class266.field4545, false) }), var26, var27, 16776960, -1);
                                    int var114 = var27 + 15;
                                    int var28 = 16776960;
                                    Runtime var29 = Runtime.getRuntime();
                                    int var30 = (int) ((var29.totalMemory() - var29.freeMemory()) / 1024L);
                                    if (var30 > 65536) {
                                        var28 = 16711680;
                                    }
                                    class72.field1127.method2017(class288.method1940((byte) 71, new class5[] { class156.field2334, class175.method1148(var30, false), class217.field3488 }), var26, var114, var28, -1);
                                    var27 = var114 + 15;
                                    int var31 = 16776960;
                                    int var32 = (class36.field573 + class36.field575 + class36.field574) / 1024;
                                    if (var32 > 65536) {
                                        var31 = 16711680;
                                    }
                                    class72.field1127.method2017(class288.method1940((byte) 78, new class5[] { class12.field227, class175.method1148(var32, false), class217.field3488 }), var26, var27, var31, -1);
                                    var27 += 15;
                                    class296.field4975[var12] = true;
                                    class52.field822[var12] = true;
                                }
                                continue;
                            }
                        }
                        if (!class251.field4162) {
                            if (var11.field4216 == 0 && var11.field4264 && var22 <= class176.field2683 && var20 <= class51.field808 && class176.field2683 < var24 && var25 > class51.field808 && !class184.field2833) {
                                class118.field1786[0] = class262.field4472;
                                class282.field4794 = 1;
                                class104.field1554[0] = 1003;
                                class20.field344[0] = class250.field4145;
                            }
                            if (var22 <= class176.field2683 && var20 <= class51.field808 && var24 > class176.field2683 && class51.field808 < var25) {
                                class110.method732(-113, class51.field808 - var14, var11, class176.field2683 - var15);
                            }
                        }
                        if (var11.field4216 == 0) {
                            if (!var11.field4265 && client.method766(var11) && class29.field480 != var11) {
                                continue;
                            }
                            if (!var11.field4265) {
                                if (var11.field4243 > (var11.field4334 - var11.field4190)) {
                                    var11.field4243 = var11.field4334 - var11.field4190;
                                }
                                if (var11.field4243 < 0) {
                                    var11.field4243 = 0;
                                }
                            }
                            method474(var20, var14 - var11.field4243, var12, var25, var11.field4206, var15 - var11.field4233, var24, 1, var22, arg9);
                            if (var11.field4275 != null) {
                                method474(var20, var14 - var11.field4243, var12, var25, var11.field4206, var15 - var11.field4233, var24, arg7, var22, var11.field4275);
                            }
                            class174 var33 = (class174) class81.field1253.method1372(false, (long) var11.field4206);
                            if (var33 != null) {
                                if (var33.field2663 == 0 && !class251.field4162 && class176.field2683 >= var22 && var20 <= class51.field808 && var24 > class176.field2683 && var25 > class51.field808 && !class184.field2833) {
                                    class118.field1786[0] = class262.field4472;
                                    class104.field1554[0] = 1003;
                                    class20.field344[0] = class250.field4145;
                                    class282.field4794 = 1;
                                }
                                class40.method283(var14, var20, var25, var15, var33.field2660, var24, var22, var12, 57);
                            }
                            class124.method822(arg8, arg0, arg6, arg3);
                        }
                        if (class48.field736[var12] || class161.field2462 > 1) {
                            if (var11.field4216 == 0 && !var11.field4265 && var11.field4334 > var11.field4190) {
                                class60.method447(var15 + var11.field4228, var11.field4243, arg7 - 35, var11.field4334, var14, var11.field4190);
                            }
                            if (var11.field4216 != 1) {
                                if (var11.field4216 == 2) {
                                    int var97 = 0;
                                    for (int var98 = 0; var98 < var11.field4248; var98++) {
                                        for (int var99 = 0; var99 < var11.field4283; var99++) {
                                            int var100 = (var11.field4203 + 32) * var98 + var14;
                                            int var101 = (var11.field4244 + 32) * var99 + var15;
                                            if (var97 < 20) {
                                                var101 += var11.field4290[var97];
                                                var100 += var11.field4195[var97];
                                            }
                                            if (var11.field4257[var97] > 0) {
                                                int var102 = var11.field4257[var97] - 1;
                                                boolean var103 = false;
                                                boolean var104 = false;
                                                if (var101 + 32 > arg8 && var101 < arg6 && arg0 < (var100 + 32) && arg3 > var100 || class300.field5066 == var11 && class152.field2204 == var97) {
                                                    class237 var105;
                                                    if (class96.field1431 == 1 && class20.field333 == var97 && class85.field1289 == var11.field4206) {
                                                        var105 = class260.method1801(true, var11.field4317[var97], 2, var102, var11.field4330, 0);
                                                    } else {
                                                        var105 = class260.method1801(true, var11.field4317[var97], 1, var102, var11.field4330, 3153952);
                                                    }
                                                    if (class229.field3800) {
                                                        class296.field4975[var12] = true;
                                                    }
                                                    if (var105 == null) {
                                                        class29.method205(var11, (byte) 90);
                                                    } else if (class300.field5066 == var11 && class152.field2204 == var97) {
                                                        int var106 = class18.field308 - class158.field2383;
                                                        if (var106 < 5 && var106 > -5) {
                                                            var106 = 0;
                                                        }
                                                        int var107 = class271.field4636 - class72.field1131;
                                                        if (var107 < 5 && var107 > -5) {
                                                            var107 = 0;
                                                        }
                                                        if (class294.field4965 < 5) {
                                                            var107 = 0;
                                                            var106 = 0;
                                                        }
                                                        var105.method726(var101 + var107, var100 + var106, 128);
                                                        if (arg4 != -1) {
                                                            class253 var108 = arg9[arg4 & 0xFFFF];
                                                            int var109 = class124.field1873;
                                                            int var110 = class124.field1874;
                                                            if (var110 > (var100 + var106) && var108.field4243 > 0) {
                                                                int var111 = (var110 - var100 - var106) * class282.field4788 / 3;
                                                                if (class282.field4788 * 10 < var111) {
                                                                    var111 = class282.field4788 * 10;
                                                                }
                                                                if (var111 > var108.field4243) {
                                                                    var111 = var108.field4243;
                                                                }
                                                                class158.field2383 += var111;
                                                                var108.field4243 -= var111;
                                                                class29.method205(var108, (byte) 101);
                                                            }
                                                            if (var109 < (var100 + var106 + 32) && var108.field4243 < (var108.field4334 - var108.field4190)) {
                                                                int var112 = (var100 + var106 + 32 - var109) * class282.field4788 / 3;
                                                                if (var112 > class282.field4788 * 10) {
                                                                    var112 = class282.field4788 * 10;
                                                                }
                                                                if (var112 > (var108.field4334 - var108.field4190 - var108.field4243)) {
                                                                    var112 = var108.field4334 - var108.field4243 - var108.field4190;
                                                                }
                                                                var108.field4243 += var112;
                                                                class158.field2383 -= var112;
                                                                class29.method205(var108, (byte) 112);
                                                            }
                                                        }
                                                    } else if (class264.field4493 == var11 && class39.field598 == var97) {
                                                        var105.method726(var101, var100, 128);
                                                    } else {
                                                        var105.method213(var101, var100);
                                                    }
                                                }
                                            } else if (var11.field4215 != null && var97 < 20) {
                                                class237 var113 = var11.method1768(var97, (byte) -53);
                                                if (var113 != null) {
                                                    var113.method213(var101, var100);
                                                } else if (class256.field4374) {
                                                    class29.method205(var11, (byte) 108);
                                                }
                                            }
                                            var97++;
                                        }
                                    }
                                } else if (var11.field4216 == 3) {
                                    int var96;
                                    if (class105.method664(-4, var11)) {
                                        var96 = var11.field4295;
                                        if (class29.field480 == var11 && var11.field4328 != 0) {
                                            var96 = var11.field4328;
                                        }
                                    } else {
                                        var96 = var11.field4310;
                                        if (class29.field480 == var11 && var11.field4252 != 0) {
                                            var96 = var11.field4252;
                                        }
                                    }
                                    if (var13 == 0) {
                                        if (var11.field4272) {
                                            class124.method826(var15, var14, var11.field4228, var11.field4190, var96);
                                        } else {
                                            class124.method823(var15, var14, var11.field4228, var11.field4190, var96);
                                        }
                                    } else if (var11.field4272) {
                                        class124.method830(var15, var14, var11.field4228, var11.field4190, var96, 256 - (var13 & 0xFF));
                                    } else {
                                        class124.method818(var15, var14, var11.field4228, var11.field4190, var96, 256 - (var13 & 0xFF));
                                    }
                                } else if (var11.field4216 == 4) {
                                    class299 var92 = var11.method1765(class20.field343, 0);
                                    if (var92 != null) {
                                        class5 var93 = var11.field4327;
                                        int var94;
                                        if (class105.method664(-4, var11)) {
                                            var94 = var11.field4295;
                                            if (class29.field480 == var11 && var11.field4328 != 0) {
                                                var94 = var11.field4328;
                                            }
                                            if (var11.field4184.method36(30673) > 0) {
                                                var93 = var11.field4184;
                                            }
                                        } else {
                                            var94 = var11.field4310;
                                            if (class29.field480 == var11 && var11.field4252 != 0) {
                                                var94 = var11.field4252;
                                            }
                                        }
                                        if (var11.field4265 && var11.field4198 != -1) {
                                            class196 var95 = class235.method1664(78, var11.field4198);
                                            var93 = var95.field3062;
                                            if (var93 == null) {
                                                var93 = class81.field1265;
                                            }
                                            if ((var95.field3109 == 1 || var11.field4281 != 1) && var11.field4281 != -1) {
                                                var93 = class288.method1940((byte) 103, new class5[] { class181.field2768, var93, class115.field1712, class43.method301(18343, var11.field4281) });
                                            }
                                        }
                                        if (class73.field1145 == var11) {
                                            var93 = class106.field1567;
                                            var94 = var11.field4310;
                                        }
                                        if (!var11.field4265) {
                                            var93 = class79.method541(var93, (byte) 127, var11);
                                        }
                                        var92.method2018(var93, var15, var14, var11.field4228, var11.field4190, var94, var11.field4316 ? 0 : -1, var11.field4284, var11.field4338, var11.field4309);
                                    } else if (class256.field4374) {
                                        class29.method205(var11, (byte) 112);
                                    }
                                } else if (var11.field4216 == 5) {
                                    if (var11.field4265) {
                                        class237 var79;
                                        if (var11.field4198 == -1) {
                                            var79 = var11.method1774(-75, false);
                                        } else {
                                            var79 = class260.method1801(true, var11.field4281, var11.field4311, var11.field4198, var11.field4330, var11.field4287);
                                        }
                                        if (var79 != null) {
                                            int var80 = var79.field3926;
                                            int var81 = var79.field3913;
                                            if (var11.field4202) {
                                                int var82 = (var81 - (1 - var11.field4190)) / var81;
                                                int var83 = (var80 + var11.field4228 - 1) / var80;
                                                class124.method829(var15, var14, var11.field4228 + var15, var11.field4190 + var14);
                                                boolean var84 = class206.method1361(20079, var79.field3918);
                                                boolean var85 = class206.method1361(20079, var79.field3914);
                                                class109 var86 = (class109) var79;
                                                if (var84 && var85) {
                                                    if (var13 == 0) {
                                                        var86.method729(var15, var14, var83, var82);
                                                    } else {
                                                        var86.method720(var15, var14, 256 - (var13 & 0xFF), var83, var82);
                                                    }
                                                } else if (var84) {
                                                    for (int var90 = 0; var90 < var82; var90++) {
                                                        if (var13 == 0) {
                                                            var86.method729(var15, var14 + (var81 * var90), var83, 1);
                                                        } else {
                                                            var86.method720(var15, var81 * var90 + var14, -(var13 & 0xFF) + 256, var83, 1);
                                                        }
                                                    }
                                                } else if (var85) {
                                                    for (int var87 = 0; var87 < var83; var87++) {
                                                        if (var13 == 0) {
                                                            var86.method729(var80 * var87 + var15, var14, 1, var82);
                                                        } else {
                                                            var86.method720(var15 + (var80 * var87), var14, 256 - (var13 & 0xFF), 1, var82);
                                                        }
                                                    }
                                                } else {
                                                    for (int var88 = 0; var88 < var83; var88++) {
                                                        for (int var89 = 0; var89 < var82; var89++) {
                                                            if (var13 == 0) {
                                                                var79.method213(var80 * var88 + var15, var14 - -(var81 * var89));
                                                            } else {
                                                                var79.method726(var80 * var88 + var15, var81 * var89 + var14, 256 - (var13 & 0xFF));
                                                            }
                                                        }
                                                    }
                                                }
                                                class124.method822(arg8, arg0, arg6, arg3);
                                            } else {
                                                int var91 = var11.field4228 * 4096 / var80;
                                                if (var11.field4292 != 0) {
                                                    var79.method1677(var11.field4190 / 2 + var14, var11.field4292, var91, var11.field4228 / 2 + var15, (byte) -88);
                                                } else if (var13 != 0) {
                                                    var79.method730(var15, var14, var11.field4228, var11.field4190, 256 - (var13 & 0xFF));
                                                } else if (var11.field4228 == var80 && var11.field4190 == var81) {
                                                    var79.method213(var15, var14);
                                                } else {
                                                    var79.method721(var15, var14, var11.field4228, var11.field4190);
                                                }
                                            }
                                        } else if (class256.field4374) {
                                            class29.method205(var11, (byte) 99);
                                        }
                                    } else {
                                        class237 var78 = var11.method1774(-111, class105.method664(-4, var11));
                                        if (var78 != null) {
                                            var78.method213(var15, var14);
                                        } else if (class256.field4374) {
                                            class29.method205(var11, (byte) 123);
                                        }
                                    }
                                } else if (var11.field4216 == 6) {
                                    int var34 = 0;
                                    boolean var35 = class105.method664(arg7 - 5, var11);
                                    int var36;
                                    if (var35) {
                                        var36 = var11.field4294;
                                    } else {
                                        var36 = var11.field4300;
                                    }
                                    class34 var37 = null;
                                    if (var11.field4198 != -1) {
                                        class196 var38 = class235.method1664(124, var11.field4198);
                                        if (var38 != null) {
                                            class196 var39 = var38.method1287(var11.field4281, arg7 ^ 0x0);
                                            class33 var40 = var36 == -1 ? null : class171.method1136(var36, -6722);
                                            var37 = var39.method1285(var40, var11.field4336, 1, (byte) -67);
                                            if (var37 == null) {
                                                class29.method205(var11, (byte) 88);
                                            } else {
                                                var34 = -var37.method248() / 2;
                                            }
                                        }
                                    } else if (var11.field4262 == 5) {
                                        if (var11.field4183 == -1) {
                                            var37 = class186.field2926.method845(arg7 - 2, (class33) null, (class33) null, -1, -1);
                                        } else {
                                            int var42 = var11.field4183 & 0x7FF;
                                            if (class161.field2460 == var42) {
                                                var42 = 2047;
                                            }
                                            class91 var43 = class267.field4593[var42];
                                            class33 var44 = var36 == -1 ? null : class171.method1136(var36, -6722);
                                            if (var43 != null && (int) var43.field1367.method69(-49) << 11 == (var11.field4183 & 0xFFFFF800)) {
                                                var37 = var43.field1369.method845(-1, (class33) null, var44, var11.field4336, 0);
                                            }
                                        }
                                    } else if (var36 == -1) {
                                        var37 = var11.method1767(-1, var35, (class33) null, class151.field2183.field1369, 88);
                                        if (var37 == null && class256.field4374) {
                                            class29.method205(var11, (byte) 125);
                                        }
                                    } else {
                                        class33 var41 = class171.method1136(var36, -6722);
                                        var37 = var11.method1767(var11.field4336, var35, var41, class151.field2183.field1369, arg7 - 48);
                                        if (var37 == null && class256.field4374) {
                                            class29.method205(var11, (byte) 110);
                                        }
                                    }
                                    if (var37 != null) {
                                        int var45;
                                        if (var11.field4220 <= 0) {
                                            var45 = 256;
                                        } else {
                                            var45 = (var11.field4228 << 8) / var11.field4220;
                                        }
                                        int var46;
                                        if (var11.field4306 <= 0) {
                                            var46 = 256;
                                        } else {
                                            var46 = (var11.field4190 << 8) / var11.field4306;
                                        }
                                        int var47 = var11.field4190 / 2 + var14 + (var11.field4303 * var46 >> 8);
                                        int var48 = (var11.field4335 * var45 >> 8) + var11.field4228 / 2 + var15;
                                        if (var11.field4256) {
                                            class45.method310(var48, var47, var11.field4325, var11.field4237, var45, var46);
                                        } else {
                                            class45.method325(var48, var47, var45, var46);
                                            class45.method324((float) var11.field4240, (float) var11.field4237 * 1.5F);
                                        }
                                        class45.method306();
                                        class45.method317(true);
                                        class45.method332(false);
                                        class129.method857(arg7 - 83);
                                        if (class40.field605) {
                                            class124.method819();
                                            class45.method342();
                                            class124.method822(arg8, arg0, arg6, arg3);
                                            class40.field605 = false;
                                        }
                                        if (var11.field4345) {
                                            class45.method340();
                                        }
                                        int var49 = class229.field3806[var11.field4302] * var11.field4325 >> 16;
                                        int var50 = class229.field3805[var11.field4302] * var11.field4325 >> 16;
                                        if (var11.field4265) {
                                            var37.method235(0, var11.field4319, var11.field4249, var11.field4302, var11.field4205, var34 + var50 + var11.field4255, var11.field4255 + var49);
                                        } else {
                                            var37.method235(0, var11.field4319, 0, var11.field4302, 0, var50, var49);
                                        }
                                        if (var11.field4345) {
                                            class45.method341();
                                        }
                                    }
                                } else {
                                    if (var11.field4216 == 7) {
                                        class299 var51 = var11.method1765(class20.field343, 0);
                                        if (var51 == null) {
                                            if (class256.field4374) {
                                                class29.method205(var11, (byte) 113);
                                            }
                                            continue;
                                        }
                                        int var52 = 0;
                                        for (int var53 = 0; var53 < var11.field4248; var53++) {
                                            for (int var54 = 0; var54 < var11.field4283; var54++) {
                                                if (var11.field4257[var52] > 0) {
                                                    class196 var55 = class235.method1664(78, var11.field4257[var52] - 1);
                                                    class5 var56;
                                                    if (var55.field3109 != 1 && var11.field4317[var52] == 1) {
                                                        var56 = class288.method1940((byte) 75, new class5[] { class181.field2768, var55.field3062, class271.field4642 });
                                                    } else {
                                                        var56 = class288.method1940((byte) 104, new class5[] { class181.field2768, var55.field3062, class115.field1712, class43.method301(arg7 + 18342, var11.field4317[var52]) });
                                                    }
                                                    int var57 = (var11.field4244 + 115) * var54 + var15;
                                                    int var58 = var14 + ((var11.field4203 + 12) * var53);
                                                    if (var11.field4284 == 0) {
                                                        var51.method2032(var56, var57, var58, var11.field4310, var11.field4316 ? 0 : -1);
                                                    } else if (var11.field4284 == 1) {
                                                        var51.method2019(var56, var57 + 57, var58, var11.field4310, var11.field4316 ? 0 : -1);
                                                    } else {
                                                        var51.method2017(var56, var57 + 115 - 1, var58, var11.field4310, var11.field4316 ? 0 : -1);
                                                    }
                                                }
                                                var52++;
                                            }
                                        }
                                    }
                                    if (var11.field4216 == 8 && class267.field4582 == var11 && class294.field4962 == class194.field3022) {
                                        int var59 = 0;
                                        int var60 = 0;
                                        class299 var61 = class72.field1127;
                                        class5 var62 = var11.field4327;
                                        class5 var63 = class79.method541(var62, (byte) 127, var11);
                                        while (var63.method36(30673) > 0) {
                                            int var64 = var63.method73(-5069, class127.field1913);
                                            class5 var65;
                                            if (var64 == -1) {
                                                var65 = var63;
                                                var63 = class250.field4145;
                                            } else {
                                                var65 = var63.method76(0, 0, var64);
                                                var63 = var63.method78(arg7 ^ 0xFFFF9E97, var64 + 4);
                                            }
                                            int var66 = var61.method2013(var65);
                                            if (var66 > var59) {
                                                var59 = var66;
                                            }
                                            var60 += var61.field5037 + 1;
                                        }
                                        var60 += 7;
                                        int var67 = var11.field4190 + var14 + 5;
                                        var59 += 6;
                                        if (arg3 < var67 + var60) {
                                            var67 = arg3 - var60;
                                        }
                                        int var68 = var15 - (-var11.field4228 - (-var59 - 5));
                                        if (var15 + 5 > var68) {
                                            var68 = var15 + 5;
                                        }
                                        if (arg6 < var59 + var68) {
                                            var68 = arg6 - var59;
                                        }
                                        class124.method826(var68, var67, var59, var60, 16777120);
                                        class124.method823(var68, var67, var59, var60, 0);
                                        int var69 = var67 - (-var61.field5037 - 2);
                                        class5 var70 = var11.field4327;
                                        class5 var71 = class79.method541(var70, (byte) 125, var11);
                                        while (var71.method36(arg7 ^ 0x77D0) > 0) {
                                            int var72 = var71.method73(arg7 ^ 0xFFFFEC32, class127.field1913);
                                            class5 var73;
                                            if (var72 == -1) {
                                                var73 = var71;
                                                var71 = class250.field4145;
                                            } else {
                                                var73 = var71.method76(arg7 - 1, 0, var72);
                                                var71 = var71.method78(-24938, var72 + 4);
                                            }
                                            var61.method2032(var73, var68 + 3, var69, 0, -1);
                                            var69 += var61.field5037 + 1;
                                        }
                                    }
                                    if (var11.field4216 == 9) {
                                        int var74;
                                        int var75;
                                        int var76;
                                        int var77;
                                        if (var11.field4188) {
                                            var74 = var15;
                                            var76 = var11.field4190 + var14;
                                            var77 = var11.field4228 + var15;
                                            var75 = var14;
                                        } else {
                                            var74 = var15;
                                            var75 = var14 + var11.field4190;
                                            var76 = var14;
                                            var77 = var11.field4228 + var15;
                                        }
                                        if (var11.field4226 == 1) {
                                            class124.method821(var74, var76, var77, var75, var11.field4310);
                                        } else {
                                            class124.method832(var74, var76, var77, var75, var11.field4310, var11.field4226);
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

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V", line = 1094)
    public class67() {
        super(1, true);
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(II)[I", line = 1106)
    public final int[] method5(int arg0, int arg1) {
        field1055++;
        int[] var3 = this.field4501.method1176(arg1, 122);
        if (this.field4501.field2741) {
            int[] var4 = this.method1815(0, arg1, -104);
            for (int var5 = 0; var5 < class226.field3716; var5++) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field1046[var6];
            }
        }
        if (arg0 >= -58) {
            this.field1059 = (int[]) null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Leb;IIIIII)V", line = 1151)
    public static final void method475(class253 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1054++;
        int var7 = arg2 * arg2 + arg6 * arg6;
        if (var7 > 360000) {
            return;
        }
        if (arg5 != 127) {
            method475((class253) null, 8, -120, 118, -28, -36, 22);
        }
        int var8 = Math.min(arg0.field4228 / 2, arg0.field4190 / 2);
        if (var7 <= (var8 * var8)) {
            class189.method1243(arg6, arg1, (byte) -113, arg2, arg4, class90.field1344[arg3], arg0);
            return;
        }
        int var9 = class24.field416 + class14.field268 & 0x7FF;
        int var10 = class229.field3805[var9];
        var8 -= 10;
        int var11 = var10 * 256 / (class236.field3894 + 256);
        int var12 = class229.field3806[var9];
        int var13 = var12 * 256 / (class236.field3894 + 256);
        int var14 = arg6 * var11 + (arg2 * var13) >> 16;
        int var15 = arg6 * var13 - (arg2 * var11) >> 16;
        double var16 = Math.atan2((double) var14, (double) var15);
        int var18 = (int) ((double) var8 * Math.sin(var16));
        int var19 = (int) (Math.cos(var16) * (double) var8);
        ((class109) class204.field3261[arg3]).method727(240, 240, (arg0.field4228 / 2 + var18 + arg1) * 16, (arg0.field4190 / 2 + arg4 - var19) * 16, (int) (var16 * 10430.378D), 4096);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 1197)
    public static final void method476(int arg0, Component arg1) {
        field1041++;
        Method var2 = class154.field2265;
        int var3 = 41 / ((arg0 + 45) / 50);
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var5) {
            }
        }
        arg1.addKeyListener(class61.field954);
        arg1.addFocusListener(class61.field954);
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(ZII)V", line = 1228)
    public static final void method477(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            return;
        }
        class145.field2104 = class204.field3262[arg1][arg2].field1995;
        class119.field1800 = class204.field3262[arg1][arg2].field2004;
        class97.field1438 = class204.field3262[arg1][arg2].field2003;
        field1058++;
        class293.method1971((float) class145.field2104, (float) class119.field1800, (float) class97.field1438);
    }

    @OriginalMember(owner = "client!r", name = "h", descriptor = "(I)V", line = 1249)
    private final void method478(int arg0) {
        if (arg0 != 0) {
            this.field1053 = (int[]) null;
        }
        int var2 = this.field1045;
        if (var2 == 2) {
            for (int var3 = 0; var3 < 257; var3++) {
                int var4 = var3 << 4;
                int var5;
                for (var5 = 1; (this.field1048.length - 1) > var5 && var4 >= this.field1048[var5][0]; var5++) {
                }
                int[] var6 = this.field1048[var5 - 1];
                int[] var7 = this.field1048[var5];
                int var8 = this.method482(var5 - 2, 9)[1];
                int var9 = var6[1];
                int var10 = var7[1];
                int var11 = this.method482(var5 + 1, arg0 + 9)[1];
                int var12 = (var4 - var6[0] << 12) / (var7[0] - var6[0]);
                int var13 = var12 * var12 >> 12;
                int var15 = var10 - var8;
                int var16 = var11 - var10 - (var8 - var9);
                int var17 = var8 - var9 - var16;
                int var18 = (var12 * var16 >> 12) * var13 >> 12;
                int var19 = var13 * var17 >> 12;
                int var20 = var12 * var15 >> 12;
                int var21 = var9 + var18 + var19 + var20;
                if (var21 <= -32768) {
                    var21 = -32767;
                }
                if (var21 >= 32768) {
                    var21 = 32767;
                }
                this.field1046[var3] = (short) var21;
            }
        } else if (var2 == 1) {
            for (int var30 = 0; var30 < 257; var30++) {
                int var31 = var30 << 4;
                int var32;
                for (var32 = 1; (this.field1048.length - 1) > var32 && var31 >= this.field1048[var32][0]; var32++) {
                }
                int[] var33 = this.field1048[var32 - 1];
                int[] var34 = this.field1048[var32];
                int var35 = (var31 - var33[0] << 12) / (var34[0] - var33[0]);
                int var36 = 4096 - class195.field3043[var35 >> 5 & 0xFF] >> 1;
                int var37 = 4096 - var36;
                int var38 = var33[1] * var37 + var34[1] * var36 >> 12;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field1046[var30] = (short) var38;
            }
        } else {
            for (int var22 = 0; var22 < 257; var22++) {
                int var23 = var22 << 4;
                int var24;
                for (var24 = 1; this.field1048.length - 1 > var24 && this.field1048[var24][0] <= var23; var24++) {
                }
                int[] var25 = this.field1048[var24];
                int[] var26 = this.field1048[var24 - 1];
                int var27 = (var23 - var26[0] << 12) / (var25[0] - var26[0]);
                int var28 = 4096 - var27;
                int var29 = var25[1] * var27 + var26[1] * var28 >> 12;
                if (var29 <= -32768) {
                    var29 = -32767;
                }
                if (var29 >= 32768) {
                    var29 = 32767;
                }
                this.field1046[var22] = (short) var29;
            }
        }
        field1056++;
    }

    @OriginalMember(owner = "client!r", name = "f", descriptor = "(I)V", line = 1428)
    public final void method111(int arg0) {
        if (this.field1048 == null) {
            this.field1048 = new int[][] { { 0, 0 }, { 4096, 4096 } };
        }
        field1057++;
        int var2 = 2 / ((66 - arg0) / 44);
        if (this.field1048.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        }
        if (this.field1045 == 2) {
            this.method480(false);
        }
        class90.method592(0);
        this.method478(0);
    }

    @OriginalMember(owner = "client!r", name = "i", descriptor = "(I)[Lpk;", line = 1450)
    public static final class74[] method479(int arg0) {
        field1049++;
        if (arg0 != 17090) {
            method481(-6L, (byte) 32);
        }
        class74[] var1 = new class74[class79.field1221];
        for (int var2 = 0; var2 < class79.field1221; var2++) {
            var1[var2] = new class298(class282.field4786, class281.field4765, class88.field1315[var2], class287.field4836[var2], class112.field1665[var2], class179.field2718[var2], class37.field590[var2], class268.field4610);
        }
        class207.method1365(arg0 - 17081);
        return var1;
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(Z)V", line = 1489)
    private final void method480(boolean arg0) {
        field1043++;
        int[] var2 = this.field1048[0];
        int[] var3 = this.field1048[1];
        int[] var4 = this.field1048[this.field1048.length - 2];
        int[] var5 = this.field1048[this.field1048.length - 1];
        if (!arg0) {
            this.field1053 = new int[] { var2[0] - (var3[0] - var2[0]), var2[1] - (var3[1] + -var2[1]) };
            this.field1059 = new int[] { var4[0] - (var5[0] - var4[0]), var4[1] - -var4[1] + -var5[1] };
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(JB)V", line = 1509)
    public static final void method481(long arg0, byte arg1) {
        field1042++;
        if (arg0 == 0L) {
            return;
        }
        if (arg1 != 33) {
            method484(29);
        }
        for (int var3 = 0; var3 < class100.field1484; var3++) {
            if (class202.field3226[var3] == arg0) {
                class100.field1484--;
                for (int var4 = var3; var4 < class100.field1484; var4++) {
                    class202.field3226[var4] = class202.field3226[var4 + 1];
                    class153.field2239[var4] = class153.field2239[var4 + 1];
                }
                class228.field3777 = class303.field5107;
                class147.field2127.method1389((byte) 103, 200);
                class147.field2127.method1548(false, arg0);
                class170.field2620++;
                break;
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(II)[I", line = 1551)
    private final int[] method482(int arg0, int arg1) {
        field1051++;
        if (arg0 < 0) {
            return this.field1053;
        } else if (arg1 == 9) {
            return arg0 < this.field1048.length ? this.field1048[arg0] : this.field1059;
        } else {
            return (int[]) null;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ILni;)V", line = 1574)
    public static final void method483(int arg0, class202 arg1) {
        field1039++;
        if (arg0 == 2) {
            class19.field323 = arg1.method1346((byte) -85, class196.field3090);
            class76.field1190 = arg1.method1346((byte) 42, class80.field1238);
        }
    }

    @OriginalMember(owner = "client!r", name = "j", descriptor = "(I)V", line = 1587)
    public static void method484(int arg0) {
        if (arg0 <= 102) {
            field1038 = -53;
        }
        field1047 = (byte[][]) null;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IZIZIIZI)Lrj;", line = 1602)
    public static final class237 method485(int arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5, boolean arg6, int arg7) {
        field1052++;
        class196 var8 = class235.method1664(107, arg4);
        if (arg0 > 1 && var8.field3055 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg0 >= var8.field3113[var10] && var8.field3113[var10] != 0) {
                    var9 = var8.field3055[var10];
                }
            }
            if (var9 != -1) {
                var8 = class235.method1664(98, var9);
            }
        }
        class227 var11 = var8.method1299((byte) 31);
        if (var11 == null) {
            return null;
        }
        class222 var12 = null;
        if (var8.field3080 != -1) {
            var12 = (class222) method485(10, false, 0, true, var8.field3078, 1, true, 0);
            if (var12 == null) {
                return null;
            }
        } else if (var8.field3085 != -1) {
            var12 = (class222) method485(arg0, false, arg2, true, var8.field3083, arg5, false, arg7 ^ 0x0);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = class191.field2981;
        int var14 = class191.field2976;
        int var15 = class191.field2982;
        int[] var16 = new int[4];
        class191.method1258(var16);
        class222 var17 = new class222(36, 32);
        class191.method1254(var17.field3652, 36, 32);
        class229.method1635();
        class229.method1631(16, 16);
        int var18 = var8.field3101;
        if (arg6) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg5 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        class229.field3807 = false;
        int var19 = class229.field3805[var8.field3068] * var18 >> 16;
        int var20 = class229.field3806[var8.field3068] * var18 >> 16;
        var11.method235(arg7, var8.field3106, var8.field3092, var8.field3068, var8.field3059, var8.field3063 + var19 - (var11.method248() / 2), var8.field3063 + var20);
        if (arg5 >= 1) {
            var17.method1561(1);
            if (arg5 >= 2) {
                var17.method1561(16777215);
            }
            class191.method1254(var17.field3652, 36, 32);
        }
        if (arg2 != 0) {
            var17.method1565(arg2);
        }
        if (var8.field3080 != -1) {
            var12.method213(0, 0);
        } else if (var8.field3085 != -1) {
            class191.method1254(var12.field3652, 36, 32);
            var17.method213(0, 0);
            var17 = var12;
        }
        if (arg1 && (var8.field3109 == 1 || arg0 != 1) && arg0 != -1) {
            class223.field3662.method2032(class260.method1799(0, arg0), 0, 9, 16776960, 1);
        }
        class191.method1254(var13, var14, var15);
        class191.method1250(var16);
        class229.method1635();
        class229.field3807 = true;
        return arg3 ? var17 : new class109(var17);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IILii;)V", line = 1734)
    public final void method4(int arg0, int arg1, class221 arg2) {
        if (arg1 > -27) {
            return;
        }
        if (arg0 == 0) {
            this.field1045 = arg2.method1509(true);
            this.field1048 = new int[arg2.method1509(true)][2];
            for (int var4 = 0; var4 < this.field1048.length; var4++) {
                this.field1048[var4][0] = arg2.method1524((byte) 70);
                this.field1048[var4][1] = arg2.method1524((byte) 120);
            }
        }
        field1040++;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IBLni;)Z", line = 1767)
    public static final boolean method486(int arg0, byte arg1, class202 arg2) {
        field1050++;
        if (arg1 != 125) {
            return true;
        }
        byte[] var3 = arg2.method1329(arg0, 1);
        if (var3 == null) {
            return false;
        } else {
            class98.method632(arg1 ^ 0xFFFFF07D, var3);
            return true;
        }
    }
}
