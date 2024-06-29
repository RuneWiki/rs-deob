import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class219 extends class71 {

    @OriginalMember(owner = "client!og", name = "s", descriptor = "Ljava/lang/String;")
    public String field3508;

    @OriginalMember(owner = "client!og", name = "z", descriptor = "I")
    public static int field3515 = 0;

    @OriginalMember(owner = "client!og", name = "C", descriptor = "[I")
    public static int[] field3517 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!og", name = "t", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!og", name = "u", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "client!og", name = "w", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!og", name = "x", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!og", name = "y", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!og", name = "A", descriptor = "I")
    public static int field3516;

    @OriginalMember(owner = "client!og", name = "v", descriptor = "Lkb;")
    public static class39 field3511;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lok;I)V", line = 12)
    public static final void method1600(class160 arg0, int arg1) {
        if (class318.field4928 == arg0.field2603) {
            class284.field4485[arg0.field2574] = true;
        }
        if (arg1 <= 96) {
            method1606(-32, (byte) -86, (class160[]) null, -72, -27, -127, 35, -35, 107, 52);
        }
        field3510++;
    }

    @OriginalMember(owner = "client!og", name = "c", descriptor = "(B)V", line = 27)
    public static void method1601(byte arg0) {
        field3517 = null;
        if (arg0 < 62) {
            method1600((class160) null, 0);
        }
        field3511 = null;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lkb;I)Z", line = 42)
    public static final boolean method1602(class39 arg0, int arg1) {
        if (arg1 != -1) {
            method1606(94, (byte) 37, (class160[]) null, -78, -81, -101, 63, 74, 82, -42);
        }
        field3513++;
        return arg0.method246(false, class127.field1900);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Z)I", line = 61)
    public static final int method1603(boolean arg0) {
        field3516++;
        if (arg0) {
            method1602((class39) null, 14);
        }
        if (class193.field3167 == null) {
            return -1;
        }
        while (class19.field269 < class193.field3167.field4901) {
            if (class193.field3167.method2190(class19.field269, (byte) -106)) {
                return class19.field269++;
            }
            class19.field269++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!og", name = "d", descriptor = "(B)V", line = 85)
    public static final void method1604(byte arg0) {
        if (arg0 != 19) {
            return;
        }
        while (true) {
            class18 var1;
            class132 var3;
            do {
                var1 = (class18) class39.field531.method1814(arg0 - 30340);
                if (var1 == null) {
                    field3509++;
                    return;
                }
                if (var1.field248 < 0) {
                    int var2 = -var1.field248 - 1;
                    if (class254.field4032 == var2) {
                        var3 = class13.field159;
                    } else {
                        var3 = class100.field1523[var2];
                    }
                } else {
                    int var4 = var1.field248 - 1;
                    var3 = class297.field4657[var4];
                }
            } while (var3 == null);
            class149 var5 = class291.method2043(var1.field237, 23006);
            if (class148.field2209 >= 3) {
            }
            int var6;
            int var7;
            if (var1.field251 == 1 || var1.field251 == 3) {
                var7 = var5.field2278;
                var6 = var5.field2253;
            } else {
                var6 = var5.field2278;
                var7 = var5.field2253;
            }
            int var8 = var1.field239 + (var7 >> 1);
            int var9 = var1.field239 + (var7 + 1 >> 1);
            int var10 = (var6 >> 1) + var1.field242;
            int var11 = (var6 + 1 >> 1) + var1.field242;
            int[][] var12 = class84.field1282[class148.field2209];
            int var13 = class208.field3411[var1.field249];
            class232 var14 = null;
            int var15 = var12[var9][var10] + var12[var8][var10] - (-var12[var8][var11] - var12[var9][var11]) >> 2;
            if (var13 == 0) {
                class19 var19 = class287.method2019(class148.field2209, var1.field239, var1.field242);
                if (var19 != null) {
                    var14 = var19.field259;
                }
            } else if (var13 == 1) {
                class145 var18 = class132.method901(class148.field2209, var1.field239, var1.field242);
                if (var18 != null) {
                    var14 = var18.field2174;
                }
            } else if (var13 == 2) {
                class271 var17 = class202.method1476(class148.field2209, var1.field239, var1.field242);
                if (var17 != null) {
                    var14 = var17.field4286;
                }
            } else if (var13 == 3) {
                class49 var16 = class19.method126(class148.field2209, var1.field239, var1.field242);
                if (var16 != null) {
                    var14 = var16.field667;
                }
            }
            if (var14 != null) {
                class290.method2038(var1.field245 + 1, var1.field239, var1.field242, (byte) -42, 0, class148.field2209, var1.field252 + 1, -1, 0, var13);
                var3.field2027 = var15;
                var3.field1982 = class48.field648 + var1.field245;
                var3.field1999 = class48.field648 + var1.field252;
                var3.field2026 = var1.field242 * 128 + var6 * 64;
                var3.field2011 = var1.field239 * 128 + var7 * 64;
                int var20 = var1.field241;
                int var21 = var1.field247;
                var3.field1986 = var14;
                if (var21 < var20) {
                    int var22 = var20;
                    var20 = var21;
                    var21 = var22;
                }
                int var23 = var1.field240;
                var3.field2035 = var1.field239 + var20;
                int var24 = var1.field244;
                if (var23 < var24) {
                    int var25 = var24;
                    var24 = var23;
                    var23 = var25;
                }
                var3.field1963 = var1.field242 + var23;
                var3.field1971 = var1.field242 + var24;
                var3.field1966 = var1.field239 + var21;
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "()V", line = 261)
    public class219() {
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 264)
    public class219(String arg0, int arg1) {
        this.field3508 = arg0;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIII)Lhh;", line = 283)
    public static final class224 method1605(int arg0, int arg1, int arg2, int arg3) {
        field3514++;
        class224 var4 = new class224();
        var4.field3563 = arg3;
        var4.field3564 = arg1;
        if (arg0 > -108) {
            method1604((byte) -105);
        }
        class176.field2870.method1750(var4, (byte) 124, (long) arg2);
        class103.method726((byte) 127, arg1);
        class160 var5 = class37.method238((byte) -93, arg2);
        if (var5 != null) {
            method1600(var5, 119);
        }
        if (class10.field109 != null) {
            method1600(class10.field109, 100);
            class10.field109 = null;
        }
        int var6 = class126.field1887;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class224.method1642(class50.field686[var7], (byte) 124)) {
                class215.method1570(var7, (byte) -37);
            }
        }
        if (class126.field1887 == 1) {
            class19.field274 = false;
            class325.method2260(class181.field2932, -12886, class86.field1297, class12.field136, class333.field5166);
        } else {
            class325.method2260(class181.field2932, -12886, class86.field1297, class12.field136, class333.field5166);
            int var8 = class55.field732.method995(class188.field3062);
            for (int var9 = 0; var9 < class126.field1887; var9++) {
                int var10 = class55.field732.method995(class93.method675(var9, true));
                if (var8 < var10) {
                    var8 = var10;
                }
            }
            class12.field136 = class126.field1887 * 15 + (class119.field1827 ? 26 : 22);
            class181.field2932 = var8 + 8;
        }
        if (var5 != null) {
            class326.method2267(false, var5, 0);
        }
        class80.method590(arg1, (byte) -115);
        if (class246.field3904 != -1) {
            class125.method864(class246.field3904, 1, -1);
        }
        return var4;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IB[Lok;IIIIIII)V", line = 360)
    public static final void method1606(int arg0, byte arg1, class160[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3512++;
        if (class186.field2991) {
            class344.method2376(arg6, arg9, arg3, arg8);
        } else {
            class216.method1571(arg6, arg9, arg3, arg8);
            class25.method166();
        }
        int var10 = -98 / ((32 - arg1) / 61);
        for (int var11 = 0; var11 < arg2.length; var11++) {
            class160 var12 = arg2[var11];
            if (var12 != null && (var12.field2544 == arg7 || arg7 == -1412584499 && class86.field1296 == var12)) {
                int var13;
                if (arg4 == -1) {
                    class192.field3135[class140.field2086] = var12.field2595 + arg5;
                    class48.field647[class140.field2086] = var12.field2602 + arg0;
                    class283.field4466[class140.field2086] = var12.field2458;
                    class210.field3433[class140.field2086] = var12.field2590;
                    var13 = class140.field2086++;
                } else {
                    var13 = arg4;
                }
                var12.field2603 = class48.field648;
                var12.field2574 = var13;
                if (!var12.field2551 || !client.method1896(var12)) {
                    if (var12.field2461 > 0) {
                        class255.method1800(var12, (byte) 101);
                    }
                    int var14 = var12.field2602 + arg0;
                    int var15 = var12.field2595 + arg5;
                    int var16 = var12.field2503;
                    if (class147.field2201 && (client.method1913(var12).field2725 != 0 || var12.field2608 == 0) && var16 > 127) {
                        var16 = 127;
                    }
                    if (class86.field1296 == var12) {
                        if (arg7 != -1412584499 && !var12.field2589) {
                            class282.field4449 = arg2;
                            class169.field2708 = arg0;
                            class19.field276 = arg5;
                            continue;
                        }
                        if (!var12.field2589) {
                            var16 = 128;
                        }
                        if (class242.field3846 && class146.field2186) {
                            int var17 = class4.field35;
                            int var18 = var17 - class17.field231;
                            if (class46.field627 > var18) {
                                var18 = class46.field627;
                            }
                            if ((var12.field2590 + var18) > (class46.field627 + class341.field5315.field2590)) {
                                var18 = class46.field627 + class341.field5315.field2590 - var12.field2590;
                            }
                            var14 = var18;
                            int var19 = class164.field2672;
                            int var20 = var19 - class160.field2591;
                            if (var20 < class187.field3044) {
                                var20 = class187.field3044;
                            }
                            if (var12.field2458 + var20 > class187.field3044 + class341.field5315.field2458) {
                                var20 = class187.field3044 + class341.field5315.field2458 - var12.field2458;
                            }
                            var15 = var20;
                        }
                    }
                    int var21;
                    int var23;
                    int var25;
                    int var26;
                    if (var12.field2608 == 2) {
                        var23 = arg9;
                        var21 = arg6;
                        var25 = arg3;
                        var26 = arg8;
                    } else {
                        var21 = var15 <= arg6 ? arg6 : var15;
                        int var22 = var12.field2458 + var15;
                        var23 = var14 > arg9 ? var14 : arg9;
                        int var24 = var12.field2590 + var14;
                        if (var12.field2608 == 9) {
                            var22++;
                            var24++;
                        }
                        var25 = var22 < arg3 ? var22 : arg3;
                        var26 = var24 >= arg8 ? arg8 : var24;
                    }
                    if (!var12.field2551 || var21 < var25 && var26 > var23) {
                        if (var12.field2461 != 0) {
                            if (var12.field2461 == 1337 || var12.field2461 == 1403) {
                                class90.field1378 = var14;
                                class339.field5273 = var12;
                                class139.field2078 = var15;
                                class312.method2172(var12.field2458, var15, var12.field2590, (byte) 122, var12.field2461 == 1403, var14);
                                class284.field4485[var13] = true;
                                if (class186.field2991) {
                                    class344.method2376(arg6, arg9, arg3, arg8);
                                } else {
                                    class216.method1571(arg6, arg9, arg3, arg8);
                                }
                                continue;
                            }
                            if (var12.field2461 == 1338) {
                                if (!var12.method1108((byte) -28)) {
                                    continue;
                                }
                                class149.method1048(var14, 92, var12, var15, var13);
                                if (class186.field2991) {
                                    class344.method2376(arg6, arg9, arg3, arg8);
                                } else {
                                    class216.method1571(arg6, arg9, arg3, arg8);
                                }
                                if (class258.field4087 != 0 && class258.field4087 != 3 || class19.field274 || class18.field256 < var21 || var23 > class323.field5055 || class18.field256 >= var25 || var26 <= class323.field5055) {
                                    continue;
                                }
                                int var27 = class18.field256 - var15;
                                int var28 = class323.field5055 - var14;
                                int var29 = var12.field2569[var28];
                                if (var29 > var27 || (var12.field2438[var28] + var29) < var27) {
                                    continue;
                                }
                                int var30 = var28 - var12.field2590 / 2;
                                int var31 = var27 - var12.field2458 / 2;
                                int var32 = (int) class312.field4862 + class339.field5253 & 0x7FF;
                                int var33 = class25.field359[var32];
                                int var34 = (class313.field4882 + 256) * var33 >> 8;
                                int var35 = class25.field355[var32];
                                int var36 = (class313.field4882 + 256) * var35 >> 8;
                                int var37 = var30 * var34 - var31 * var36 >> 11;
                                int var38 = var30 * var36 + var31 * var34 >> 11;
                                int var39 = var38 + (class13.field159.field1980 - (class13.field159.method910(-1) - 1) * 64) >> 7;
                                int var40 = class13.field159.field1944 - (var37 - 64) - (class13.field159.method910(-1) * 64) >> 7;
                                if (class313.field4874 && (class26.field374 & 0x40) != 0) {
                                    class160 var41 = class241.method1709(class288.field4531, -123, class131.field1933);
                                    if (var41 == null) {
                                        class10.method58((byte) 109);
                                    } else {
                                        class22.method142(class24.field344, (short) 24, var39, -125, var40, " ->", class282.field4458, 1L);
                                    }
                                    continue;
                                }
                                if (class20.field290 == 1) {
                                    class22.method142(-1, (short) 9, var39, -127, var40, "", class17.field226, 1L);
                                }
                                class22.method142(-1, (short) 29, var39, 102, var40, "", class10.field113, 1L);
                                continue;
                            }
                            if (var12.field2461 == 1339) {
                                if (var12.method1108((byte) -48)) {
                                    class87.method633(var15, var13, 2, var12, var14);
                                    if (class186.field2991) {
                                        class344.method2376(arg6, arg9, arg3, arg8);
                                    } else {
                                        class216.method1571(arg6, arg9, arg3, arg8);
                                    }
                                }
                                continue;
                            }
                            if (var12.field2461 == 1400) {
                                class256.method1803(var12.field2590, var12.field2458, var14, var15, 93);
                                class284.field4485[var13] = true;
                                class237.field3748[var13] = true;
                                if (class186.field2991) {
                                    class344.method2376(arg6, arg9, arg3, arg8);
                                } else {
                                    class216.method1571(arg6, arg9, arg3, arg8);
                                }
                                continue;
                            }
                            if (var12.field2461 == 1401) {
                                class78.method573(var12.field2590, var15, -2, var14, var12.field2458);
                                class284.field4485[var13] = true;
                                class237.field3748[var13] = true;
                                if (class186.field2991) {
                                    class344.method2376(arg6, arg9, arg3, arg8);
                                } else {
                                    class216.method1571(arg6, arg9, arg3, arg8);
                                }
                                continue;
                            }
                            if (var12.field2461 == 1402) {
                                if (!class186.field2991) {
                                    class49.method345((byte) 5, var15, var14);
                                    class284.field4485[var13] = true;
                                    class237.field3748[var13] = true;
                                }
                                continue;
                            }
                            if (var12.field2461 == 1405) {
                                if (!class305.field4762) {
                                    continue;
                                }
                                int var42 = var12.field2458 + var15;
                                int var43 = 16776960;
                                int var44 = var14 + 15;
                                class295.field4628.method1008("Fps:" + class44.field604, var42, var44, 16776960, -1);
                                int var143 = var44 + 15;
                                Runtime var45 = Runtime.getRuntime();
                                int var46 = (int) ((var45.totalMemory() - var45.freeMemory()) / 1024L);
                                if (var46 > 65536) {
                                    var43 = 16711680;
                                }
                                class295.field4628.method1008("Mem:" + var46 + "k", var42, var143, var43, -1);
                                var44 = var143 + 15;
                                if (class186.field2991) {
                                    int var47 = 16776960;
                                    int var48 = (class275.field4358 + class275.field4355 + class275.field4357) / 1024;
                                    if (var48 > 65536) {
                                        var47 = 16711680;
                                    }
                                    class295.field4628.method1008("Card:" + var48 + "k", var42, var44, var47, -1);
                                    var44 += 15;
                                }
                                int var49 = 16776960;
                                int var50 = 0;
                                int var51 = 0;
                                int var52 = 0;
                                for (int var53 = 0; var53 < 29; var53++) {
                                    var52 += class34.field457[var53].method1192((byte) -99);
                                    var50 += class34.field457[var53].method1185((byte) -15);
                                    var51 += class34.field457[var53].method1190((byte) 119);
                                }
                                int var54 = var51 * 100 / var52;
                                int var55 = var50 * 10000 / var52;
                                String var56 = "Cache:" + class331.method2291(2, (long) var55, 0, true, true) + "% (" + var54 + "%)";
                                class99.field1516.method1008(var56, var42, var44, var49, -1);
                                class284.field4485[var13] = true;
                                class237.field3748[var13] = true;
                                var44 += 12;
                                continue;
                            }
                            if (var12.field2461 == 1406) {
                                class39.field525 = var14;
                                class128.field1904 = var15;
                                class215.field3475 = var12;
                                continue;
                            }
                        }
                        if (!class19.field274) {
                            if (var12.field2608 == 0 && var12.field2508 && var21 <= class18.field256 && class323.field5055 >= var23 && class18.field256 < var25 && var26 > class323.field5055 && !class147.field2201) {
                                class50.field686[0] = 1003;
                                class284.field4478[0] = class24.field343;
                                class126.field1887 = 1;
                                class56.field746[0] = class239.field3778;
                                class147.field2199[0] = "";
                            }
                            if (class18.field256 >= var21 && class323.field5055 >= var23 && class18.field256 < var25 && var26 > class323.field5055) {
                                class92.method666(var12, class323.field5055 - var14, 32, class18.field256 - var15);
                            }
                        }
                        if (var12.field2608 == 0) {
                            if (!var12.field2551 && client.method1896(var12) && class102.field1564 != var12) {
                                continue;
                            }
                            if (!var12.field2551) {
                                if (var12.field2472 > var12.field2495 - var12.field2590) {
                                    var12.field2472 = var12.field2495 - var12.field2590;
                                }
                                if (var12.field2472 < 0) {
                                    var12.field2472 = 0;
                                }
                            }
                            if (class186.field2991 && var12.field2461 == 1407) {
                                class199.method1462(var15, var14, var12.field2458, var12.field2590);
                            }
                            method1606(var14 - var12.field2472, (byte) -95, arg2, var25, var13, var15 - var12.field2466, var21, var12.field2446, var26, var23);
                            if (var12.field2459 != null) {
                                method1606(var14 - var12.field2472, (byte) -58, var12.field2459, var25, var13, var15 - var12.field2466, var21, var12.field2446, var26, var23);
                            }
                            class224 var57 = (class224) class176.field2870.method1743((long) var12.field2446, (byte) -106);
                            if (var57 != null) {
                                if (var57.field3563 == 0 && !class19.field274 && class18.field256 >= var21 && var23 <= class323.field5055 && var25 > class18.field256 && var26 > class323.field5055 && !class147.field2201) {
                                    class50.field686[0] = 1003;
                                    class126.field1887 = 1;
                                    class56.field746[0] = class239.field3778;
                                    class284.field4478[0] = class24.field343;
                                    class147.field2199[0] = "";
                                }
                                class222.method1616((byte) 89, var21, var14, var25, var13, var26, var23, var57.field3564, var15);
                            }
                            if (class186.field2991 && var12.field2461 == 1407) {
                                class199.method1457();
                            }
                            if (class186.field2991) {
                                class344.method2376(arg6, arg9, arg3, arg8);
                            } else {
                                class216.method1571(arg6, arg9, arg3, arg8);
                                class25.method166();
                            }
                        }
                        if (class314.field4894[var13] || class330.field5148 > 1) {
                            if (var12.field2608 == 0 && !var12.field2551 && var12.field2590 < var12.field2495) {
                                class48.method331(0, var12.field2495, var12.field2458 + var15, var12.field2590, var12.field2472, var14);
                            }
                            if (var12.field2608 != 1) {
                                if (var12.field2608 == 2) {
                                    int var58 = 0;
                                    for (int var59 = 0; var59 < var12.field2552; var59++) {
                                        for (int var60 = 0; var60 < var12.field2448; var60++) {
                                            int var61 = var14 + ((var12.field2610 + 32) * var59);
                                            int var62 = (var12.field2604 + 32) * var60 + var15;
                                            if (var58 < 20) {
                                                var62 += var12.field2583[var58];
                                                var61 += var12.field2570[var58];
                                            }
                                            if (var12.field2615[var58] > 0) {
                                                boolean var64 = false;
                                                boolean var65 = false;
                                                int var66 = var12.field2615[var58] - 1;
                                                if (var62 + 32 > arg6 && var62 < arg3 && arg9 < var61 + 32 && arg8 > var61 || class90.field1374 == var12 && class247.field3922 == var58) {
                                                    class321 var67;
                                                    if (class49.field676 == 1 && class105.field1597 == var58 && class18.field255 == var12.field2446) {
                                                        var67 = class270.method1929((class303) null, 112, var66, 2, 0, var12.field2565, var12.field2559[var58]);
                                                    } else {
                                                        var67 = class270.method1929((class303) null, 70, var66, 1, 3153952, var12.field2565, var12.field2559[var58]);
                                                    }
                                                    if (class25.field356) {
                                                        class284.field4485[var13] = true;
                                                    }
                                                    if (var67 == null) {
                                                        method1600(var12, 127);
                                                    } else if (class90.field1374 == var12 && class247.field3922 == var58) {
                                                        int var68 = class4.field35 - class289.field4557;
                                                        int var69 = class164.field2672 - class50.field692;
                                                        if (var68 < 5 && var68 > -5) {
                                                            var68 = 0;
                                                        }
                                                        if (var69 < 5 && var69 > -5) {
                                                            var69 = 0;
                                                        }
                                                        if (class272.field4318 < 5) {
                                                            var68 = 0;
                                                            var69 = 0;
                                                        }
                                                        var67.method82(var62 + var69, var61 + var68, 128);
                                                        if (arg7 != -1) {
                                                            class160 var70 = arg2[arg7 & 0xFFFF];
                                                            int var71;
                                                            int var72;
                                                            if (class186.field2991) {
                                                                var71 = class344.field5356;
                                                                var72 = class344.field5358;
                                                            } else {
                                                                var72 = class216.field3479;
                                                                var71 = class216.field3485;
                                                            }
                                                            if (var71 > var61 + var68 && var70.field2472 > 0) {
                                                                int var73 = (var71 - var61 - var68) * class274.field4353 / 3;
                                                                if (class274.field4353 * 10 < var73) {
                                                                    var73 = class274.field4353 * 10;
                                                                }
                                                                if (var73 > var70.field2472) {
                                                                    var73 = var70.field2472;
                                                                }
                                                                class289.field4557 += var73;
                                                                var70.field2472 -= var73;
                                                                method1600(var70, 108);
                                                            }
                                                            if (var68 + var61 + 32 > var72 && (var70.field2495 - var70.field2590) > var70.field2472) {
                                                                int var74 = (var68 + var61 + 32 - var72) * class274.field4353 / 3;
                                                                if (var74 > class274.field4353 * 10) {
                                                                    var74 = class274.field4353 * 10;
                                                                }
                                                                if (var70.field2495 - var70.field2590 - var70.field2472 < var74) {
                                                                    var74 = var70.field2495 - var70.field2590 - var70.field2472;
                                                                }
                                                                var70.field2472 += var74;
                                                                class289.field4557 -= var74;
                                                                method1600(var70, 115);
                                                            }
                                                        }
                                                    } else if (class169.field2710 == var12 && class221.field3525 == var58) {
                                                        var67.method82(var62, var61, 128);
                                                    } else {
                                                        var67.method84(var62, var61);
                                                    }
                                                }
                                            } else if (var12.field2564 != null && var58 < 20) {
                                                class321 var63 = var12.method1104(var58, 0);
                                                if (var63 != null) {
                                                    var63.method84(var62, var61);
                                                } else if (class51.field696) {
                                                    method1600(var12, 114);
                                                }
                                            }
                                            var58++;
                                        }
                                    }
                                } else if (var12.field2608 == 3) {
                                    int var142;
                                    if (class261.method1868(true, var12)) {
                                        var142 = var12.field2522;
                                        if (class102.field1564 == var12 && var12.field2467 != 0) {
                                            var142 = var12.field2467;
                                        }
                                    } else {
                                        var142 = var12.field2452;
                                        if (class102.field1564 == var12 && var12.field2455 != 0) {
                                            var142 = var12.field2455;
                                        }
                                    }
                                    if (var16 == 0) {
                                        if (var12.field2451) {
                                            if (class186.field2991) {
                                                class344.method2375(var15, var14, var12.field2458, var12.field2590, var142);
                                            } else {
                                                class216.method1573(var15, var14, var12.field2458, var12.field2590, var142);
                                            }
                                        } else if (class186.field2991) {
                                            class344.method2371(var15, var14, var12.field2458, var12.field2590, var142);
                                        } else {
                                            class216.method1579(var15, var14, var12.field2458, var12.field2590, var142);
                                        }
                                    } else if (var12.field2451) {
                                        if (class186.field2991) {
                                            class344.method2378(var15, var14, var12.field2458, var12.field2590, var142, 256 - (var16 & 0xFF));
                                        } else {
                                            class216.method1584(var15, var14, var12.field2458, var12.field2590, var142, 256 - (var16 & 0xFF));
                                        }
                                    } else if (class186.field2991) {
                                        class344.method2385(var15, var14, var12.field2458, var12.field2590, var142, 256 - (var16 & 0xFF));
                                    } else {
                                        class216.method1592(var15, var14, var12.field2458, var12.field2590, var142, 256 - (var16 & 0xFF));
                                    }
                                } else if (var12.field2608 == 4) {
                                    class143 var75 = var12.method1106(class256.field4061, (byte) 112);
                                    if (var75 != null) {
                                        String var76 = var12.field2468;
                                        int var77;
                                        if (class261.method1868(true, var12)) {
                                            var77 = var12.field2522;
                                            if (class102.field1564 == var12 && var12.field2467 != 0) {
                                                var77 = var12.field2467;
                                            }
                                            if (var12.field2501.length() > 0) {
                                                var76 = var12.field2501;
                                            }
                                        } else {
                                            var77 = var12.field2452;
                                            if (class102.field1564 == var12 && var12.field2455 != 0) {
                                                var77 = var12.field2455;
                                            }
                                        }
                                        if (var12.field2551 && var12.field2572 != -1) {
                                            class74 var78 = class31.method198(false, var12.field2572);
                                            var76 = var78.field996;
                                            if (var76 == null) {
                                                var76 = "null";
                                            }
                                            if ((var78.field960 == 1 || var12.field2537 != 1) && var12.field2537 != -1) {
                                                var76 = "<col=ff9040>" + var76 + "</col> x" + class71.method464(-17348, var12.field2537);
                                            }
                                        }
                                        if (class10.field109 == var12) {
                                            var77 = var12.field2452;
                                            var76 = class68.field881;
                                        }
                                        if (!var12.field2551) {
                                            var76 = class276.method1971(-121, var76, var12);
                                        }
                                        var75.method993(var76, var15, var14, var12.field2458, var12.field2590, var77, var12.field2483 ? 0 : -1, var12.field2613, var12.field2575, var12.field2505);
                                    } else if (class51.field696) {
                                        method1600(var12, 108);
                                    }
                                } else if (var12.field2608 == 5) {
                                    if (!var12.field2551) {
                                        class321 var79 = var12.method1100(class261.method1868(true, var12), 117);
                                        if (var79 != null) {
                                            var79.method84(var15, var14);
                                        } else if (class51.field696) {
                                            method1600(var12, 110);
                                        }
                                    } else if (var12.field2454 >= 0) {
                                        class268 var95 = var12.method1099((byte) 84);
                                        if (class186.field2991) {
                                            var95.method1917(0, var15, var14, var12.field2458, var12.field2590, var12.field2460, var12.field2494, 0);
                                        } else {
                                            var95.method1919(0, var15, var14, var12.field2458, var12.field2590, var12.field2460, var12.field2494, 0);
                                        }
                                    } else {
                                        class321 var80;
                                        if (var12.field2572 == -1) {
                                            var80 = var12.method1100(false, 126);
                                        } else if (var12.field2443 && class13.field159.field5004 != null) {
                                            var80 = class270.method1929(class13.field159.field5004, 97, var12.field2572, var12.field2606, var12.field2541, var12.field2565, var12.field2537);
                                        } else {
                                            var80 = class270.method1929((class303) null, 26, var12.field2572, var12.field2606, var12.field2541, var12.field2565, var12.field2537);
                                        }
                                        if (var80 != null) {
                                            int var81 = var80.field5028;
                                            int var82 = var80.field5027;
                                            if (var12.field2549) {
                                                int var84 = (var12.field2458 + var81 - 1) / var81;
                                                int var85 = (var82 + var12.field2590 - 1) / var82;
                                                if (class186.field2991) {
                                                    class344.method2379(var15, var14, var12.field2458 + var15, var12.field2590 + var14);
                                                    boolean var86 = class224.method1638((byte) -67, var80.field5040);
                                                    boolean var87 = class224.method1638((byte) -91, var80.field5030);
                                                    class14 var88 = (class14) var80;
                                                    if (var86 && var87) {
                                                        if (var16 == 0) {
                                                            var88.method85(var15, var14, var84, var85);
                                                        } else {
                                                            var88.method90(var15, var14, 256 - (var16 & 0xFF), var84, var85);
                                                        }
                                                    } else if (var86) {
                                                        for (int var92 = 0; var92 < var85; var92++) {
                                                            if (var16 == 0) {
                                                                var88.method85(var15, var14 + (var82 * var92), var84, 1);
                                                            } else {
                                                                var88.method90(var15, var14 + (var82 * var92), 256 - (var16 & 0xFF), var84, 1);
                                                            }
                                                        }
                                                    } else if (var87) {
                                                        for (int var91 = 0; var91 < var84; var91++) {
                                                            if (var16 == 0) {
                                                                var88.method85(var81 * var91 + var15, var14, 1, var85);
                                                            } else {
                                                                var88.method90(var81 * var91 + var15, var14, 256 - (var16 & 0xFF), 1, var85);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var89 = 0; var89 < var84; var89++) {
                                                            for (int var90 = 0; var90 < var85; var90++) {
                                                                if (var16 == 0) {
                                                                    var80.method84(var81 * var89 + var15, var82 * var90 + var14);
                                                                } else {
                                                                    var80.method82(var81 * var89 + var15, var82 * var90 + var14, 256 - (var16 & 0xFF));
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class344.method2376(arg6, arg9, arg3, arg8);
                                                } else {
                                                    class216.method1577(var15, var14, var12.field2458 + var15, var12.field2590 + var14);
                                                    for (int var93 = 0; var93 < var84; var93++) {
                                                        for (int var94 = 0; var94 < var85; var94++) {
                                                            if (var12.field2493 != 0) {
                                                                var80.method2248(var81 / 2 + (var15 + (var81 * var93)), var12.field2493, var82 / 2 + var82 * var94 + var14, 4096, 15);
                                                            } else if (var16 == 0) {
                                                                var80.method84(var81 * var93 + var15, var82 * var94 + var14);
                                                            } else {
                                                                var80.method82(var81 * var93 + var15, var82 * var94 + var14, 256 - (var16 & 0xFF));
                                                            }
                                                        }
                                                    }
                                                    class216.method1571(arg6, arg9, arg3, arg8);
                                                }
                                            } else {
                                                int var83 = var12.field2458 * 4096 / var81;
                                                if (var12.field2493 != 0) {
                                                    var80.method2248(var15 + (var12.field2458 / 2), var12.field2493, var12.field2590 / 2 + var14, var83, 15);
                                                } else if (var16 != 0) {
                                                    var80.method81(var15, var14, var12.field2458, var12.field2590, 256 - (var16 & 0xFF));
                                                } else if (var12.field2458 == var81 && var12.field2590 == var82) {
                                                    var80.method84(var15, var14);
                                                } else {
                                                    var80.method88(var15, var14, var12.field2458, var12.field2590);
                                                }
                                            }
                                        } else if (class51.field696) {
                                            method1600(var12, 110);
                                        }
                                    }
                                } else if (var12.field2608 == 6) {
                                    boolean var96 = class261.method1868(true, var12);
                                    class134 var97 = null;
                                    int var98;
                                    if (var96) {
                                        var98 = var12.field2622;
                                    } else {
                                        var98 = var12.field2596;
                                    }
                                    int var99 = 0;
                                    if (var12.field2572 != -1) {
                                        class74 var104 = class31.method198(false, var12.field2572);
                                        if (var104 != null) {
                                            class74 var105 = var104.method481(var12.field2537, 28050);
                                            class80 var106 = var98 == -1 ? null : class37.method236(var98, 20254);
                                            if (var12.field2443 && class13.field159.field5004 != null) {
                                                var97 = var105.method489(var12.field2600, var106, 1, false, class13.field159.field5004, var12.field2605, var12.field2618);
                                            } else {
                                                var97 = var105.method489(var12.field2600, var106, 1, false, (class303) null, var12.field2605, var12.field2618);
                                            }
                                            if (var97 == null) {
                                                method1600(var12, 110);
                                            } else {
                                                var99 = -var97.method152() / 2;
                                            }
                                        }
                                    } else if (var12.field2621 == 5) {
                                        if (var12.field2624 == -1) {
                                            var97 = class69.field899.method2121(-1, (class188[]) null, false, (class80) null, -1, 0, -1, 0, -1, true, (class80) null);
                                        } else {
                                            int var100 = var12.field2624 & 0x7FF;
                                            if (class254.field4032 == var100) {
                                                var100 = 2047;
                                            }
                                            class320 var101 = class100.field1523[var100];
                                            class80 var102 = var98 == -1 ? null : class37.method236(var98, 20254);
                                            if (var101 != null && ((int) class232.method1669(37, var101.field5003) << 11) == (var12.field2624 & 0xFFFFF800)) {
                                                var97 = var101.field5004.method2121(-1, (class188[]) null, false, var102, -1, 0, var12.field2605, 0, 0, true, (class80) null);
                                            }
                                        }
                                    } else if (var98 == -1) {
                                        var97 = var12.method1109(var96, 0, -1, -1, class13.field159.field5004, 49, (class80) null);
                                        if (var97 == null && class51.field696) {
                                            method1600(var12, 125);
                                        }
                                    } else {
                                        class80 var103 = class37.method236(var98, 20254);
                                        var97 = var12.method1109(var96, var12.field2600, var12.field2618, var12.field2605, class13.field159.field5004, 82, var103);
                                        if (var97 == null && class51.field696) {
                                            method1600(var12, 108);
                                        }
                                    }
                                    if (var97 != null) {
                                        int var107;
                                        if (var12.field2534 <= 0) {
                                            var107 = 256;
                                        } else {
                                            var107 = (var12.field2590 << 8) / var12.field2534;
                                        }
                                        int var108;
                                        if (var12.field2563 <= 0) {
                                            var108 = 256;
                                        } else {
                                            var108 = (var12.field2458 << 8) / var12.field2563;
                                        }
                                        int var109 = (var12.field2480 * var108 >> 8) + (var15 + (var12.field2458 / 2));
                                        int var110 = var14 - (-(var12.field2445 * var107 >> 8) - (var12.field2590 / 2));
                                        if (class186.field2991) {
                                            if (var12.field2453) {
                                                class186.method1302(var109, var110, var12.field2447, var12.field2529, var108, var107);
                                            } else {
                                                class186.method1297(var109, var110, var108, var107);
                                                class186.method1306((float) var12.field2546, (float) var12.field2529 * 1.5F);
                                            }
                                            class186.method1298();
                                            class186.method1274(true);
                                            class186.method1290(false);
                                            class115.method797(class91.field1404, (byte) 86);
                                            if (class26.field383) {
                                                class344.method2372();
                                                class186.method1312();
                                                class344.method2376(arg6, arg9, arg3, arg8);
                                                class26.field383 = false;
                                            }
                                            if (var12.field2488) {
                                                class186.method1284();
                                            }
                                            int var111 = class25.field355[var12.field2586] * var12.field2447 >> 16;
                                            int var112 = class25.field359[var12.field2586] * var12.field2447 >> 16;
                                            if (var12.field2551) {
                                                var97.method499(0, var12.field2582, var12.field2520, var12.field2586, var12.field2555, var12.field2521 + var99 + var111, var12.field2521 + var112, -1L);
                                            } else {
                                                var97.method499(0, var12.field2582, 0, var12.field2586, 0, var111, var112, -1L);
                                            }
                                            if (var12.field2488) {
                                                class186.method1289();
                                            }
                                        } else {
                                            class25.method164(var109, var110);
                                            int var113 = class25.field355[var12.field2586] * var12.field2447 >> 16;
                                            int var114 = class25.field359[var12.field2586] * var12.field2447 >> 16;
                                            if (!var12.field2551) {
                                                var97.method499(0, var12.field2582, 0, var12.field2586, 0, var113, var114, -1L);
                                            } else if (var12.field2453) {
                                                ((class76) var97).method563(0, var12.field2582, var12.field2520, var12.field2586, var12.field2555, var113 + var99 + var12.field2521, var12.field2521 + var114, var12.field2447);
                                            } else {
                                                var97.method499(0, var12.field2582, var12.field2520, var12.field2586, var12.field2555, var99 + var113 + var12.field2521, var12.field2521 + var114, -1L);
                                            }
                                            class25.method165();
                                        }
                                    }
                                } else {
                                    if (var12.field2608 == 7) {
                                        class143 var115 = var12.method1106(class256.field4061, (byte) 111);
                                        if (var115 == null) {
                                            if (class51.field696) {
                                                method1600(var12, 120);
                                            }
                                            continue;
                                        }
                                        int var116 = 0;
                                        for (int var117 = 0; var117 < var12.field2552; var117++) {
                                            for (int var118 = 0; var118 < var12.field2448; var118++) {
                                                if (var12.field2615[var116] > 0) {
                                                    class74 var119 = class31.method198(false, var12.field2615[var116] - 1);
                                                    String var120;
                                                    if (var119.field960 != 1 && var12.field2559[var116] == 1) {
                                                        var120 = "<col=ff9040>" + var119.field996 + "</col>";
                                                    } else {
                                                        var120 = "<col=ff9040>" + var119.field996 + "</col> x" + class71.method464(-17348, var12.field2559[var116]);
                                                    }
                                                    int var121 = (var12.field2610 + 12) * var117 + var14;
                                                    int var122 = (var12.field2604 + 115) * var118 + var15;
                                                    if (var12.field2613 == 0) {
                                                        var115.method1009(var120, var122, var121, var12.field2452, var12.field2483 ? 0 : -1);
                                                    } else if (var12.field2613 == 1) {
                                                        var115.method1001(var120, var122 + 57, var121, var12.field2452, var12.field2483 ? 0 : -1);
                                                    } else {
                                                        var115.method1008(var120, var122 + 114, var121, var12.field2452, var12.field2483 ? 0 : -1);
                                                    }
                                                }
                                                var116++;
                                            }
                                        }
                                    }
                                    if (var12.field2608 == 8 && class242.field3840 == var12 && class130.field1923 == class127.field1902) {
                                        int var123 = 0;
                                        int var124 = 0;
                                        class143 var125 = class295.field4628;
                                        String var126 = var12.field2468;
                                        String var127 = class276.method1971(48, var126, var12);
                                        while (var127.length() > 0) {
                                            int var128 = var127.indexOf("<br>");
                                            String var129;
                                            if (var128 == -1) {
                                                var129 = var127;
                                                var127 = "";
                                            } else {
                                                var129 = var127.substring(0, var128);
                                                var127 = var127.substring(var128 + 4);
                                            }
                                            int var130 = var125.method995(var129);
                                            if (var124 < var130) {
                                                var124 = var130;
                                            }
                                            var123 += var125.field2154 + 1;
                                        }
                                        var123 += 7;
                                        var124 += 6;
                                        int var131 = var15 - var124 - (-var12.field2458 + 5);
                                        int var132 = var14 + var12.field2590 + 5;
                                        if ((var15 + 5) > var131) {
                                            var131 = var15 + 5;
                                        }
                                        if (var123 + var132 > arg8) {
                                            var132 = arg8 - var123;
                                        }
                                        if (arg3 < var124 + var131) {
                                            var131 = arg3 - var124;
                                        }
                                        if (class186.field2991) {
                                            class344.method2375(var131, var132, var124, var123, 16777120);
                                            class344.method2371(var131, var132, var124, var123, 0);
                                        } else {
                                            class216.method1573(var131, var132, var124, var123, 16777120);
                                            class216.method1579(var131, var132, var124, var123, 0);
                                        }
                                        int var133 = var125.field2154 + var132 + 2;
                                        String var134 = var12.field2468;
                                        String var135 = class276.method1971(-116, var134, var12);
                                        while (var135.length() > 0) {
                                            int var136 = var135.indexOf("<br>");
                                            String var137;
                                            if (var136 == -1) {
                                                var137 = var135;
                                                var135 = "";
                                            } else {
                                                var137 = var135.substring(0, var136);
                                                var135 = var135.substring(var136 + 4);
                                            }
                                            var125.method1009(var137, var131 + 3, var133, 0, -1);
                                            var133 += var125.field2154 + 1;
                                        }
                                    }
                                    if (var12.field2608 == 9) {
                                        int var138;
                                        int var139;
                                        int var140;
                                        int var141;
                                        if (var12.field2462) {
                                            var138 = var14;
                                            var139 = var12.field2590 + var14;
                                            var140 = var12.field2458 + var15;
                                            var141 = var15;
                                        } else {
                                            var140 = var15 + var12.field2458;
                                            var141 = var15;
                                            var139 = var14;
                                            var138 = var12.field2590 + var14;
                                        }
                                        if (var12.field2482 == 1) {
                                            if (class186.field2991) {
                                                class344.method2380(var141, var139, var140, var138, var12.field2452);
                                            } else {
                                                class216.method1578(var141, var139, var140, var138, var12.field2452);
                                            }
                                        } else if (class186.field2991) {
                                            class344.method2382(var141, var139, var140, var138, var12.field2452, var12.field2482);
                                        } else {
                                            class216.method1594(var141, var139, var140, var138, var12.field2452, var12.field2482);
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
