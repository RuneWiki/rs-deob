import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class1 {

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "Loh;")
    public static class258 field7 = class153.method1046("unzap", 112);

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!qk", name = "i", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "Lgb;")
    public static class213 field6;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "[I")
    public static int[] field1;

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "[[I")
    public static int[][] field8;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V", line = 4)
    public static void method1(int arg0) {
        field6 = null;
        field8 = (int[][]) null;
        int var1 = -68 / ((-arg0 - 12) / 50);
        field1 = null;
        field7 = null;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)V", line = 29)
    public static final void method2(int arg0, int arg1) {
        class253.field4350.method1156(arg0, 0);
        if (arg1 != -25622) {
            field6 = (class213) null;
        }
        field4++;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lwk;", line = 49)
    public static final class106 method3(Throwable arg0, String arg1) {
        field2++;
        class106 var2;
        if (arg0 instanceof class106) {
            var2 = (class106) arg0;
            var2.field1897 = var2.field1897 + ' ' + arg1;
        } else {
            var2 = new class106(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lnd;B)V", line = 67)
    public static final void method4(class58 arg0, byte arg1) {
        if (arg1 > -3) {
            method3((Throwable) null, (String) null);
        }
        field3++;
        if (arg0.field979 == 0) {
            return;
        }
        if (arg0.field963 != -1 && arg0.field963 < 32768) {
            class107 var2 = class16.field214[arg0.field963];
            if (var2 != null) {
                int var3 = arg0.field912 - var2.field912;
                int var4 = arg0.field934 - var2.field934;
                if (var3 != 0 || var4 != 0) {
                    arg0.field961 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field963 >= 32768) {
            int var5 = arg0.field963 - 32768;
            if (class47.field698 == var5) {
                var5 = 2047;
            }
            class231 var6 = class38.field527[var5];
            if (var6 != null) {
                int var7 = arg0.field912 - var6.field912;
                int var8 = arg0.field934 - var6.field934;
                if (var7 != 0 || var8 != 0) {
                    arg0.field961 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field945 != 0 || arg0.field970 != 0) && (arg0.field971 == 0 || arg0.field958 > 0)) {
            int var9 = arg0.field912 + (arg0.method447(18123) - 1) * 64 - (arg0.field945 - class229.field3955 - class229.field3955) * 64;
            int var10 = arg0.field934 + ((arg0.method447(18123) - 1) * 64) - (arg0.field970 - class311.field5271 + -class311.field5271) * 64;
            if (var9 != 0 || var10 != 0) {
                arg0.field961 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
            }
            arg0.field970 = 0;
            arg0.field945 = 0;
        }
        int var11 = arg0.field961 - arg0.field923 & 0x7FF;
        if (var11 == 0) {
            arg0.field950 = 0;
            return;
        }
        arg0.field950++;
        if (var11 > 1024) {
            arg0.field923 -= arg0.field979;
            boolean var12 = true;
            if (var11 < arg0.field979 || var11 > (2048 - arg0.field979)) {
                arg0.field923 = arg0.field961;
                var12 = false;
            }
            if (arg0.field929 == arg0.field909 && (arg0.field950 > 25 || var12)) {
                if (arg0.field927 == -1) {
                    arg0.field909 = arg0.field973;
                } else {
                    arg0.field909 = arg0.field927;
                }
            }
        } else {
            boolean var13 = true;
            arg0.field923 += arg0.field979;
            if (var11 < arg0.field979 || 2048 - arg0.field979 < var11) {
                arg0.field923 = arg0.field961;
                var13 = false;
            }
            if (arg0.field929 == arg0.field909 && (arg0.field950 > 25 || var13)) {
                if (arg0.field967 == -1) {
                    arg0.field909 = arg0.field973;
                } else {
                    arg0.field909 = arg0.field967;
                }
            }
        }
        arg0.field923 &= 0x7FF;
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)Lkl;", line = 190)
    public static final class65 method5(int arg0) {
        field5++;
        if (arg0 != -4928) {
            method3((Throwable) null, (String) null);
        }
        int var1 = class301.field5149[0] * class113.field1958[0];
        int[] var2 = new int[var1];
        byte[] var3 = class37.field497[0];
        for (int var4 = 0; var4 < var1; var4++) {
            var2[var4] = class121.field2143[class2.method15(255, var3[var4])];
        }
        class65 var5;
        if (class257.field4390) {
            var5 = new class221(class108.field1919, class23.field279, class279.field4795[0], class280.field4819[0], class113.field1958[0], class301.field5149[0], var2);
        } else {
            var5 = new class41(class108.field1919, class23.field279, class279.field4795[0], class280.field4819[0], class113.field1958[0], class301.field5149[0], var2);
        }
        class290.method2038(arg0 + 5055);
        return var5;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(III[Ls;ZIIIII)V", line = 221)
    public static final void method6(int arg0, int arg1, int arg2, class171[] arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg4) {
            method1(114);
        }
        if (class257.field4390) {
            class296.method2085(arg6, arg5, arg2, arg1);
        } else {
            class211.method1414(arg6, arg5, arg2, arg1);
            class266.method1872();
        }
        field9++;
        for (int var10 = 0; var10 < arg3.length; var10++) {
            class171 var11 = arg3[var10];
            if (var11 != null && (var11.field2923 == arg0 || arg0 == -1412584499 && class206.field3558 == var11)) {
                int var12;
                if (arg7 == -1) {
                    class276.field4763[class312.field5298] = var11.field3020 + arg9;
                    class121.field2146[class312.field5298] = var11.field2912 + arg8;
                    class114.field2026[class312.field5298] = var11.field3002;
                    class38.field517[class312.field5298] = var11.field3054;
                    var12 = class312.field5298++;
                } else {
                    var12 = arg7;
                }
                var11.field2927 = var12;
                var11.field3021 = class202.field3498;
                if (!var11.field3006 || !client.method357(var11)) {
                    if (var11.field2924 > 0) {
                        class56.method433(false, var11);
                    }
                    int var13 = var11.field3020 + arg9;
                    int var14 = var11.field2912 + arg8;
                    int var15 = var11.field2916;
                    if (class166.field2823 && (client.method354(var11) != 0 || var11.field2936 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class206.field3558 == var11) {
                        if (arg0 != -1412584499 && !var11.field2987) {
                            class307.field5209 = arg8;
                            class145.field2433 = arg3;
                            class279.field4778 = arg9;
                            continue;
                        }
                        if (class281.field4830 && class168.field2854) {
                            int var16 = class194.field3423;
                            int var17 = var16 - class190.field3361;
                            int var18 = class226.field3882;
                            if (var17 < class279.field4797) {
                                var17 = class279.field4797;
                            }
                            int var19 = var18 - class180.field3213;
                            if ((var17 + var11.field3002) > (class279.field4797 + class188.field3336.field3002)) {
                                var17 = class279.field4797 - (var11.field3002 - class188.field3336.field3002);
                            }
                            if (var19 < class207.field3564) {
                                var19 = class207.field3564;
                            }
                            var13 = var17;
                            if ((var19 + var11.field3054) > (class207.field3564 + class188.field3336.field3054)) {
                                var19 = class207.field3564 - (var11.field3054 - class188.field3336.field3054);
                            }
                            var14 = var19;
                        }
                        if (!var11.field2987) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var11.field2936 == 2) {
                        var20 = arg5;
                        var21 = arg2;
                        var22 = arg1;
                        var23 = arg6;
                    } else {
                        var20 = arg5 >= var14 ? arg5 : var14;
                        var23 = arg6 < var13 ? var13 : arg6;
                        int var24 = var11.field3002 + var13;
                        int var25 = var11.field3054 + var14;
                        if (var11.field2936 == 9) {
                            var24++;
                            var25++;
                        }
                        var21 = arg2 > var24 ? var24 : arg2;
                        var22 = var25 < arg1 ? var25 : arg1;
                    }
                    if (!var11.field3006 || var23 < var21 && var20 < var22) {
                        if (var11.field2924 != 0) {
                            if (var11.field2924 == 1337 || var11.field2924 == 1403 && class257.field4390) {
                                class8.field105 = var14;
                                class250.field4314 = var11;
                                class55.field866 = var13;
                                class127.method921(var13, var14, 4, var11.field2924 == 1403, var11.field3002, var11.field3054);
                                if (class257.field4390) {
                                    class296.method2085(arg6, arg5, arg2, arg1);
                                } else {
                                    class211.method1414(arg6, arg5, arg2, arg1);
                                }
                                continue;
                            }
                            if (var11.field2924 == 1338) {
                                if (var11.method1154(arg4)) {
                                    class180.method1235(true, var11, var14, var13, var12);
                                    if (class257.field4390) {
                                        class296.method2085(arg6, arg5, arg2, arg1);
                                    } else {
                                        class211.method1414(arg6, arg5, arg2, arg1);
                                    }
                                }
                                continue;
                            }
                            if (var11.field2924 == 1339) {
                                if (var11.method1154(false)) {
                                    class75.method552(var11, var12, var13, var14, (byte) -75);
                                    if (class257.field4390) {
                                        class296.method2085(arg6, arg5, arg2, arg1);
                                    } else {
                                        class211.method1414(arg6, arg5, arg2, arg1);
                                    }
                                }
                                continue;
                            }
                            if (var11.field2924 == 1400) {
                                class220.method1490(-124, var11.field3002, var13, var14, var11.field3054);
                                class238.field4151[var12] = true;
                                class74.field1292[var12] = true;
                                if (class257.field4390) {
                                    class296.method2085(arg6, arg5, arg2, arg1);
                                } else {
                                    class211.method1414(arg6, arg5, arg2, arg1);
                                }
                                continue;
                            }
                            if (var11.field2924 == 1401) {
                                class38.method280(var13, var11.field3054, (byte) -128, var11.field3002, var14);
                                class238.field4151[var12] = true;
                                class74.field1292[var12] = true;
                                if (class257.field4390) {
                                    class296.method2085(arg6, arg5, arg2, arg1);
                                } else {
                                    class211.method1414(arg6, arg5, arg2, arg1);
                                }
                                continue;
                            }
                            if (var11.field2924 == 1402) {
                                if (!class257.field4390) {
                                    class90.method674(var13, var14, (byte) 76);
                                    class238.field4151[var12] = true;
                                    class74.field1292[var12] = true;
                                }
                                continue;
                            }
                            if (var11.field2924 == 1405) {
                                if (!class282.field4843) {
                                    continue;
                                }
                                int var26 = var11.field3002 + var13;
                                int var27 = var14 + 15;
                                class44.field662.method246(class100.method755(-6, new class258[] { class130.field2292, class218.method1481(-97, class149.field2533) }), var26, var27, 16776960, -1);
                                Runtime var28 = Runtime.getRuntime();
                                int var126 = var27 + 15;
                                int var29 = (int) ((var28.totalMemory() - var28.freeMemory()) / 1024L);
                                int var30 = 16776960;
                                if (var29 > 65536) {
                                    var30 = 16711680;
                                }
                                class44.field662.method246(class100.method755(-6, new class258[] { class291.field5021, class218.method1481(109, var29), class297.field5089 }), var26, var126, var30, -1);
                                var27 = var126 + 15;
                                if (class257.field4390) {
                                    int var31 = (class196.field3440 + class196.field3442 + class196.field3438) / 1024;
                                    int var32 = 16776960;
                                    if (var31 > 65536) {
                                        var32 = 16711680;
                                    }
                                    class44.field662.method246(class100.method755(-6, new class258[] { class39.field544, class218.method1481(108, var31), class297.field5089 }), var26, var27, var32, -1);
                                    var27 += 15;
                                }
                                int var33 = 16776960;
                                int var34 = 0;
                                int var35 = 0;
                                int var36 = 0;
                                for (int var37 = 0; var37 < 27; var37++) {
                                    var34 += class98.field1753[var37].method415((byte) -68);
                                    var35 += class98.field1753[var37].method411(255);
                                    var36 += class98.field1753[var37].method408(false);
                                }
                                int var38 = var36 * 100 / var34;
                                int var39 = var35 * 10000 / var34;
                                class258 var40 = class100.method755(-6, new class258[] { class226.field3874, class234.method1562(2, 0, true, (long) var39, 1), class234.field4047, class218.method1481(69, var38), class154.field2637 });
                                class79.field1355.method246(var40, var26, var27, var33, -1);
                                class238.field4151[var12] = true;
                                class74.field1292[var12] = true;
                                var27 += 12;
                                continue;
                            }
                        }
                        if (!class252.field4342) {
                            if (var11.field2936 == 0 && var11.field2929 && var23 <= class84.field1415 && class113.field1947 >= var20 && class84.field1415 < var21 && class113.field1947 < var22 && !class166.field2823) {
                                class242.field4205[0] = class68.field1185;
                                class225.field3849[0] = class235.field4104;
                                class227.field3910[0] = 1004;
                                class69.field1195 = 1;
                            }
                            if (class84.field1415 >= var23 && var20 <= class113.field1947 && var21 > class84.field1415 && class113.field1947 < var22) {
                                class114.method849(var11, class113.field1947 - var14, (byte) 43, class84.field1415 - var13);
                            }
                        }
                        if (var11.field2936 == 0) {
                            if (!var11.field3006 && client.method357(var11) && class49.field737 != var11) {
                                continue;
                            }
                            if (!var11.field3006) {
                                if (var11.field2966 > var11.field3036 - var11.field3054) {
                                    var11.field2966 = var11.field3036 - var11.field3054;
                                }
                                if (var11.field2966 < 0) {
                                    var11.field2966 = 0;
                                }
                            }
                            method6(var11.field3061, var22, var21, arg3, arg4, var20, var23, var12, var14 - var11.field2966, -var11.field2957 + var13);
                            if (var11.field2982 != null) {
                                method6(var11.field3061, var22, var21, var11.field2982, arg4, var20, var23, var12, var14 - var11.field2966, -var11.field2957 + var13);
                            }
                            class247 var41 = (class247) class276.field4750.method986((long) var11.field3061, 0);
                            if (var41 != null) {
                                if (var41.field4279 == 0 && !class252.field4342 && class84.field1415 >= var23 && var20 <= class113.field1947 && class84.field1415 < var21 && class113.field1947 < var22 && !class166.field2823) {
                                    class242.field4205[0] = class68.field1185;
                                    class225.field3849[0] = class235.field4104;
                                    class227.field3910[0] = 1004;
                                    class69.field1195 = 1;
                                }
                                class75.method550(var12, var22, arg4, var21, var41.field4283, var13, var14, var20, var23);
                            }
                            if (class257.field4390) {
                                class296.method2085(arg6, arg5, arg2, arg1);
                            } else {
                                class211.method1414(arg6, arg5, arg2, arg1);
                                class266.method1872();
                            }
                        }
                        if (class201.field3479[var12] || class191.field3373 > 1) {
                            if (var11.field2936 == 0 && !var11.field3006 && var11.field3054 < var11.field3036) {
                                class236.method1625(var11.field2966, var11.field3002 + var13, var14, 5349, var11.field3036, var11.field3054);
                            }
                            if (var11.field2936 != 1) {
                                if (var11.field2936 == 2) {
                                    int var109 = 0;
                                    for (int var110 = 0; var110 < var11.field3046; var110++) {
                                        for (int var111 = 0; var111 < var11.field3067; var111++) {
                                            int var112 = (var11.field2934 + 32) * var111 + var13;
                                            int var113 = var14 + ((var11.field2911 + 32) * var110);
                                            if (var109 < 20) {
                                                var113 += var11.field2942[var109];
                                                var112 += var11.field2948[var109];
                                            }
                                            if (var11.field3042[var109] > 0) {
                                                boolean var114 = false;
                                                boolean var115 = false;
                                                int var116 = var11.field3042[var109] - 1;
                                                if ((var112 + 32) > arg6 && arg2 > var112 && var113 + 32 > arg5 && var113 < arg1 || class123.field2183 == var11 && class14.field184 == var109) {
                                                    class65 var117;
                                                    if (class145.field2453 == 1 && class103.field1882 == var109 && class42.field590 == var11.field3061) {
                                                        var117 = class134.method949(92, var11.field3074, var116, var11.field2977[var109], 2, 0);
                                                    } else {
                                                        var117 = class134.method949(123, var11.field3074, var116, var11.field2977[var109], 1, 3153952);
                                                    }
                                                    if (class266.field4629) {
                                                        class238.field4151[var12] = true;
                                                    }
                                                    if (var117 == null) {
                                                        class165.method1099((byte) 125, var11);
                                                    } else if (class123.field2183 == var11 && class14.field184 == var109) {
                                                        int var118 = class194.field3423 - class197.field3451;
                                                        int var119 = class226.field3882 - class206.field3560;
                                                        if (var119 < 5 && var119 > -5) {
                                                            var119 = 0;
                                                        }
                                                        if (var118 < 5 && var118 > -5) {
                                                            var118 = 0;
                                                        }
                                                        if (class215.field3736 < 5) {
                                                            var119 = 0;
                                                            var118 = 0;
                                                        }
                                                        var117.method322(var112 + var118, var113 + var119, 128);
                                                        if (arg0 != -1) {
                                                            class171 var120 = arg3[arg0 & 0xFFFF];
                                                            int var121;
                                                            int var122;
                                                            if (class257.field4390) {
                                                                var122 = class296.field5080;
                                                                var121 = class296.field5082;
                                                            } else {
                                                                var121 = class211.field3637;
                                                                var122 = class211.field3642;
                                                            }
                                                            if ((var113 + var119) < var121 && var120.field2966 > 0) {
                                                                int var123 = (var121 - var113 - var119) * class251.field4329 / 3;
                                                                if (var123 > (class251.field4329 * 10)) {
                                                                    var123 = class251.field4329 * 10;
                                                                }
                                                                if (var120.field2966 < var123) {
                                                                    var123 = var120.field2966;
                                                                }
                                                                var120.field2966 -= var123;
                                                                class206.field3560 += var123;
                                                                class165.method1099((byte) 126, var120);
                                                            }
                                                            if (var122 < var113 + var119 + 32 && var120.field3036 - var120.field3054 > var120.field2966) {
                                                                int var124 = (var113 + 32 - (-var119 + var122)) * class251.field4329 / 3;
                                                                if ((class251.field4329 * 10) < var124) {
                                                                    var124 = class251.field4329 * 10;
                                                                }
                                                                if ((var120.field3036 - var120.field3054 - var120.field2966) < var124) {
                                                                    var124 = var120.field3036 - var120.field3054 - var120.field2966;
                                                                }
                                                                class206.field3560 -= var124;
                                                                var120.field2966 += var124;
                                                                class165.method1099((byte) 126, var120);
                                                            }
                                                        }
                                                    } else if (class303.field5173 == var11 && class76.field1326 == var109) {
                                                        var117.method322(var112, var113, 128);
                                                    } else {
                                                        var117.method327(var112, var113);
                                                    }
                                                }
                                            } else if (var11.field3058 != null && var109 < 20) {
                                                class65 var125 = var11.method1143(var109, -115);
                                                if (var125 != null) {
                                                    var125.method327(var112, var113);
                                                } else if (class48.field722) {
                                                    class165.method1099((byte) 125, var11);
                                                }
                                            }
                                            var109++;
                                        }
                                    }
                                } else if (var11.field2936 == 3) {
                                    int var108;
                                    if (class290.method2040(906, var11)) {
                                        var108 = var11.field2947;
                                        if (class49.field737 == var11 && var11.field3038 != 0) {
                                            var108 = var11.field3038;
                                        }
                                    } else {
                                        var108 = var11.field3037;
                                        if (class49.field737 == var11 && var11.field3034 != 0) {
                                            var108 = var11.field3034;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var11.field3003) {
                                            if (class257.field4390) {
                                                class296.method2096(var13, var14, var11.field3002, var11.field3054, var108);
                                            } else {
                                                class211.method1398(var13, var14, var11.field3002, var11.field3054, var108);
                                            }
                                        } else if (class257.field4390) {
                                            class296.method2084(var13, var14, var11.field3002, var11.field3054, var108);
                                        } else {
                                            class211.method1404(var13, var14, var11.field3002, var11.field3054, var108);
                                        }
                                    } else if (var11.field3003) {
                                        if (class257.field4390) {
                                            class296.method2089(var13, var14, var11.field3002, var11.field3054, var108, 256 - (var15 & 0xFF));
                                        } else {
                                            class211.method1406(var13, var14, var11.field3002, var11.field3054, var108, 256 - (var15 & 0xFF));
                                        }
                                    } else if (class257.field4390) {
                                        class296.method2082(var13, var14, var11.field3002, var11.field3054, var108, 256 - (var15 & 0xFF));
                                    } else {
                                        class211.method1400(var13, var14, var11.field3002, var11.field3054, var108, 256 - (var15 & 0xFF));
                                    }
                                } else if (var11.field2936 == 4) {
                                    class35 var104 = var11.method1148(class117.field2070, (byte) -74);
                                    if (var104 != null) {
                                        class258 var105 = var11.field2946;
                                        int var106;
                                        if (class290.method2040(906, var11)) {
                                            var106 = var11.field2947;
                                            if (class49.field737 == var11 && var11.field3038 != 0) {
                                                var106 = var11.field3038;
                                            }
                                            if (var11.field3057.method1816(false) > 0) {
                                                var105 = var11.field3057;
                                            }
                                        } else {
                                            var106 = var11.field3037;
                                            if (class49.field737 == var11 && var11.field3034 != 0) {
                                                var106 = var11.field3034;
                                            }
                                        }
                                        if (var11.field3006 && var11.field3014 != -1) {
                                            class61 var107 = class186.method1256((byte) 120, var11.field3014);
                                            var105 = var107.field1053;
                                            if (var105 == null) {
                                                var105 = class23.field294;
                                            }
                                            if ((var107.field1049 == 1 || var11.field2933 != 1) && var11.field2933 != -1) {
                                                var105 = class100.method755(-6, new class258[] { class191.field3375, var105, class289.field4983, class12.method86(11232, var11.field2933) });
                                            }
                                        }
                                        if (class23.field297 == var11) {
                                            var105 = class207.field3565;
                                            var106 = var11.field3037;
                                        }
                                        if (!var11.field3006) {
                                            var105 = class63.method489(var11, var105, (byte) -105);
                                        }
                                        var104.method269(var105, var13, var14, var11.field3002, var11.field3054, var106, var11.field2915 ? 0 : -1, var11.field2989, var11.field2986, var11.field3044);
                                    } else if (class48.field722) {
                                        class165.method1099((byte) 127, var11);
                                    }
                                } else if (var11.field2936 == 5) {
                                    if (var11.field3006) {
                                        class65 var89;
                                        if (var11.field3014 == -1) {
                                            var89 = var11.method1146((byte) -84, false);
                                        } else {
                                            var89 = class134.method949(52, var11.field3074, var11.field3014, var11.field2933, var11.field2998, var11.field3024);
                                        }
                                        if (var89 != null) {
                                            int var90 = var89.field1136;
                                            int var91 = var89.field1145;
                                            if (var11.field2992) {
                                                int var93 = (var11.field3002 + var90 - 1) / var90;
                                                int var94 = (var11.field3054 + var91 - 1) / var91;
                                                if (class257.field4390) {
                                                    class296.method2086(var13, var14, var11.field3002 + var13, var14 - -var11.field3054);
                                                    class221 var95 = (class221) var89;
                                                    boolean var96 = class210.method1384(!arg4, var89.field1141);
                                                    boolean var97 = class210.method1384(true, var89.field1148);
                                                    if (var96 && var97) {
                                                        if (var15 == 0) {
                                                            var95.method1499(var13, var14, var93, var94);
                                                        } else {
                                                            var95.method1493(var13, var14, 256 - (var15 & 0xFF), var93, var94);
                                                        }
                                                    } else if (var96) {
                                                        for (int var98 = 0; var98 < var94; var98++) {
                                                            if (var15 == 0) {
                                                                var95.method1499(var13, var14 + (var91 * var98), var93, 1);
                                                            } else {
                                                                var95.method1493(var13, var91 * var98 + var14, 256 - (var15 & 0xFF), var93, 1);
                                                            }
                                                        }
                                                    } else if (var97) {
                                                        for (int var99 = 0; var99 < var93; var99++) {
                                                            if (var15 == 0) {
                                                                var95.method1499(var90 * var99 + var13, var14, 1, var94);
                                                            } else {
                                                                var95.method1493(var90 * var99 + var13, var14, 256 - (var15 & 0xFF), 1, var94);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var100 = 0; var100 < var93; var100++) {
                                                            for (int var101 = 0; var101 < var94; var101++) {
                                                                if (var15 == 0) {
                                                                    var89.method327(var90 * var100 + var13, var14 - -(var91 * var101));
                                                                } else {
                                                                    var89.method322(var13 + (var90 * var100), var91 * var101 + var14, 256 - (var15 & 0xFF));
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class296.method2085(arg6, arg5, arg2, arg1);
                                                } else {
                                                    class211.method1394(var13, var14, var13 + var11.field3002, var14 - -var11.field3054);
                                                    for (int var102 = 0; var102 < var93; var102++) {
                                                        for (int var103 = 0; var103 < var94; var103++) {
                                                            if (var11.field2925 != 0) {
                                                                var89.method500(var14 - (-(var91 / 2) - (var91 * var103)), 126, var11.field2925, 4096, var90 / 2 + (var13 + (var90 * var102)));
                                                            } else if (var15 == 0) {
                                                                var89.method327(var90 * var102 + var13, var91 * var103 + var14);
                                                            } else {
                                                                var89.method322(var13 + (var90 * var102), var91 * var103 + var14, 256 - (var15 & 0xFF));
                                                            }
                                                        }
                                                    }
                                                    class211.method1414(arg6, arg5, arg2, arg1);
                                                }
                                            } else {
                                                int var92 = var11.field3002 * 4096 / var90;
                                                if (var11.field2925 != 0) {
                                                    var89.method500(var11.field3054 / 2 + var14, 126, var11.field2925, var92, var11.field3002 / 2 + var13);
                                                } else if (var15 != 0) {
                                                    var89.method329(var13, var14, var11.field3002, var11.field3054, 256 - (var15 & 0xFF));
                                                } else if (var11.field3002 == var90 && var11.field3054 == var91) {
                                                    var89.method327(var13, var14);
                                                } else {
                                                    var89.method316(var13, var14, var11.field3002, var11.field3054);
                                                }
                                            }
                                        } else if (class48.field722) {
                                            class165.method1099((byte) 127, var11);
                                        }
                                    } else {
                                        class65 var88 = var11.method1146((byte) -50, class290.method2040(906, var11));
                                        if (var88 != null) {
                                            var88.method327(var13, var14);
                                        } else if (class48.field722) {
                                            class165.method1099((byte) 125, var11);
                                        }
                                    }
                                } else if (var11.field2936 == 6) {
                                    boolean var42 = class290.method2040(906, var11);
                                    int var43;
                                    if (var42) {
                                        var43 = var11.field2961;
                                    } else {
                                        var43 = var11.field3077;
                                    }
                                    class305 var44 = null;
                                    int var45 = 0;
                                    if (var11.field3014 != -1) {
                                        class61 var50 = class186.method1256((byte) 126, var11.field3014);
                                        if (var50 != null) {
                                            class61 var51 = var50.method468(-1, var11.field2933);
                                            class2 var52 = var43 == -1 ? null : class263.method1842(var43, (byte) -114);
                                            var44 = var51.method473((byte) 126, 1, var52, var11.field2965);
                                            if (var44 == null) {
                                                class165.method1099((byte) 127, var11);
                                            } else {
                                                var45 = -var44.method361() / 2;
                                            }
                                        }
                                    } else if (var11.field2940 == 5) {
                                        if (var11.field3059 == -1) {
                                            var44 = class8.field100.method1141(-1, (class2) null, -1, -20040, (class2) null);
                                        } else {
                                            int var46 = var11.field3059 & 0x7FF;
                                            if (class47.field698 == var46) {
                                                var46 = 2047;
                                            }
                                            class231 var47 = class38.field527[var46];
                                            class2 var48 = var43 == -1 ? null : class263.method1842(var43, (byte) -114);
                                            if (var47 != null && (int) var47.field4007.method1769(16) << 11 == (var11.field3059 & 0xFFFFF800)) {
                                                var44 = var47.field4011.method1141(0, (class2) null, var11.field2965, -20040, var48);
                                            }
                                        }
                                    } else if (var43 == -1) {
                                        var44 = var11.method1145(class152.field2606.field4011, (class2) null, -1, var42, (byte) -110);
                                        if (var44 == null && class48.field722) {
                                            class165.method1099((byte) 125, var11);
                                        }
                                    } else {
                                        class2 var49 = class263.method1842(var43, (byte) -114);
                                        var44 = var11.method1145(class152.field2606.field4011, var49, var11.field2965, var42, (byte) -110);
                                        if (var44 == null && class48.field722) {
                                            class165.method1099((byte) 126, var11);
                                        }
                                    }
                                    if (var44 != null) {
                                        int var53;
                                        if (var11.field3033 > 0) {
                                            var53 = (var11.field3002 << 8) / var11.field3033;
                                        } else {
                                            var53 = 256;
                                        }
                                        int var54;
                                        if (var11.field3000 > 0) {
                                            var54 = (var11.field3054 << 8) / var11.field3000;
                                        } else {
                                            var54 = 256;
                                        }
                                        int var55 = var11.field3002 / 2 + (var11.field2997 * var53 >> 8) + var13;
                                        int var56 = (var11.field3066 * var54 >> 8) + var14 + (var11.field3054 / 2);
                                        if (class257.field4390) {
                                            if (var11.field2939) {
                                                class257.method1756(var55, var56, var11.field2974, var11.field2914, var53, var54);
                                            } else {
                                                class257.method1744(var55, var56, var53, var54);
                                                class257.method1728((float) var11.field3017, (float) var11.field2914 * 1.5F);
                                            }
                                            class257.method1734();
                                            class257.method1730(true);
                                            class257.method1745(false);
                                            class214.method1457(arg4);
                                            if (class217.field3746) {
                                                class296.method2088();
                                                class257.method1751();
                                                class296.method2085(arg6, arg5, arg2, arg1);
                                                class217.field3746 = false;
                                            }
                                            if (var11.field2996) {
                                                class257.method1746();
                                            }
                                            int var57 = class266.field4636[var11.field2954] * var11.field2974 >> 16;
                                            int var58 = class266.field4642[var11.field2954] * var11.field2974 >> 16;
                                            if (var11.field3006) {
                                                var44.method657(0, var11.field2944, var11.field2931, var11.field2954, var11.field3011, var58 - (-var45 - var11.field2993), var11.field2993 + var57);
                                            } else {
                                                var44.method657(0, var11.field2944, 0, var11.field2954, 0, var58, var57);
                                            }
                                            if (var11.field2996) {
                                                class257.method1754();
                                            }
                                        } else {
                                            class266.method1862(var55, var56);
                                            int var59 = class266.field4636[var11.field2954] * var11.field2974 >> 16;
                                            int var60 = class266.field4642[var11.field2954] * var11.field2974 >> 16;
                                            if (!var11.field3006) {
                                                var44.method657(0, var11.field2944, 0, var11.field2954, 0, var60, var59);
                                            } else if (var11.field2939) {
                                                ((class89) var44).method655(0, var11.field2944, var11.field2931, var11.field2954, var11.field3011, var45 + var60 + var11.field2993, var59 - -var11.field2993, var11.field2974);
                                            } else {
                                                var44.method657(0, var11.field2944, var11.field2931, var11.field2954, var11.field3011, var60 + var45 + var11.field2993, var11.field2993 + var59);
                                            }
                                            class266.method1875();
                                        }
                                    }
                                } else {
                                    if (var11.field2936 == 7) {
                                        class35 var61 = var11.method1148(class117.field2070, (byte) -97);
                                        if (var61 == null) {
                                            if (class48.field722) {
                                                class165.method1099((byte) 125, var11);
                                            }
                                            continue;
                                        }
                                        int var62 = 0;
                                        for (int var63 = 0; var63 < var11.field3046; var63++) {
                                            for (int var64 = 0; var64 < var11.field3067; var64++) {
                                                if (var11.field3042[var62] > 0) {
                                                    class61 var65 = class186.method1256((byte) 119, var11.field3042[var62] - 1);
                                                    class258 var66;
                                                    if (var65.field1049 != 1 && var11.field2977[var62] == 1) {
                                                        var66 = class100.method755(-6, new class258[] { class191.field3375, var65.field1053, class45.field687 });
                                                    } else {
                                                        var66 = class100.method755(-6, new class258[] { class191.field3375, var65.field1053, class289.field4983, class12.method86(11232, var11.field2977[var62]) });
                                                    }
                                                    int var67 = var13 + ((var11.field2934 + 115) * var64);
                                                    int var68 = (var11.field2911 + 12) * var63 + var14;
                                                    if (var11.field2989 == 0) {
                                                        var61.method268(var66, var67, var68, var11.field3037, var11.field2915 ? 0 : -1);
                                                    } else if (var11.field2989 == 1) {
                                                        var61.method260(var66, var67 + 57, var68, var11.field3037, var11.field2915 ? 0 : -1);
                                                    } else {
                                                        var61.method246(var66, var67 + 114, var68, var11.field3037, var11.field2915 ? 0 : -1);
                                                    }
                                                }
                                                var62++;
                                            }
                                        }
                                    }
                                    if (var11.field2936 == 8 && class268.field4671 == var11 && class58.field953 == class233.field4040) {
                                        int var69 = 0;
                                        int var70 = 0;
                                        class35 var71 = class44.field662;
                                        class258 var72 = var11.field2946;
                                        class258 var73 = class63.method489(var11, var72, (byte) -117);
                                        while (var73.method1816(arg4) > 0) {
                                            int var74 = var73.method1808(class94.field1657, 0);
                                            class258 var75;
                                            if (var74 == -1) {
                                                var75 = var73;
                                                var73 = class235.field4104;
                                            } else {
                                                var75 = var73.method1813(var74, 0, true);
                                                var73 = var73.method1777((byte) 127, var74 + 4);
                                            }
                                            int var76 = var71.method252(var75);
                                            if (var69 < var76) {
                                                var69 = var76;
                                            }
                                            var70 += var71.field418 + 1;
                                        }
                                        var70 += 7;
                                        var69 += 6;
                                        int var77 = var13 + var11.field3002 - var69 - 5;
                                        if ((var13 + 5) > var77) {
                                            var77 = var13 + 5;
                                        }
                                        int var78 = var11.field3054 + var14 + 5;
                                        if (var69 + var77 > arg2) {
                                            var77 = arg2 - var69;
                                        }
                                        if (arg1 < (var70 + var78)) {
                                            var78 = arg1 - var70;
                                        }
                                        if (class257.field4390) {
                                            class296.method2096(var77, var78, var69, var70, 16777120);
                                            class296.method2084(var77, var78, var69, var70, 0);
                                        } else {
                                            class211.method1398(var77, var78, var69, var70, 16777120);
                                            class211.method1404(var77, var78, var69, var70, 0);
                                        }
                                        class258 var79 = var11.field2946;
                                        int var80 = var71.field418 + var78 + 2;
                                        class258 var81 = class63.method489(var11, var79, (byte) -124);
                                        while (var81.method1816(false) > 0) {
                                            int var82 = var81.method1808(class94.field1657, 0);
                                            class258 var83;
                                            if (var82 == -1) {
                                                var83 = var81;
                                                var81 = class235.field4104;
                                            } else {
                                                var83 = var81.method1813(var82, 0, true);
                                                var81 = var81.method1777((byte) 124, var82 + 4);
                                            }
                                            var71.method268(var83, var77 + 3, var80, 0, -1);
                                            var80 += var71.field418 + 1;
                                        }
                                    }
                                    if (var11.field2936 == 9) {
                                        int var84;
                                        int var85;
                                        int var86;
                                        int var87;
                                        if (var11.field2999) {
                                            var84 = var11.field3002 + var13;
                                            var85 = var11.field3054 + var14;
                                            var86 = var14;
                                            var87 = var13;
                                        } else {
                                            var84 = var13 + var11.field3002;
                                            var87 = var13;
                                            var86 = var11.field3054 + var14;
                                            var85 = var14;
                                        }
                                        if (var11.field3055 == 1) {
                                            if (class257.field4390) {
                                                class296.method2090(var87, var85, var84, var86, var11.field3037);
                                            } else {
                                                class211.method1393(var87, var85, var84, var86, var11.field3037);
                                            }
                                        } else if (class257.field4390) {
                                            class296.method2095(var87, var85, var84, var86, var11.field3037, var11.field3055);
                                        } else {
                                            class211.method1402(var87, var85, var84, var86, var11.field3037, var11.field3055);
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
}
