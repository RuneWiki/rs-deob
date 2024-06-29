import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class240 {

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "[J")
    public static long[] field3361 = new long[100];

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "Luc;")
    public static class51 field3359 = new class51(8);

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "[I")
    public static int[] field3364 = new int[16384];

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "[I")
    public static int[] field3365 = new int[16384];

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "[[S")
    public static short[][] field3367;

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "Ljava/lang/String;")
    public static String field3369;

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "I")
    public static int field3366;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "I")
    public static int field3370;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field3364[var2] = (int) (Math.sin((double) var2 * var0) * 32768.0D);
            field3365[var2] = (int) (Math.cos((double) var2 * var0) * 32768.0D);
        }
        field3367 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };
        field3369 = "white:";
        field3368 = 0;
        field3366 = 0;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V", line = 11)
    public static void method1553(byte arg0) {
        field3359 = null;
        field3367 = null;
        field3364 = null;
        field3365 = null;
        if (arg0 <= 123) {
            field3368 = 94;
        }
        field3361 = null;
        field3369 = null;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lfb;ILjava/lang/String;)I", line = 33)
    public static final int method1554(class341 arg0, int arg1, String arg2) {
        field3360++;
        int var3 = arg0.field5049;
        byte[] var4 = class165.method1115(arg2, (byte) 107);
        arg0.method2246(var4.length, (byte) 52);
        if (arg1 != -1) {
            method1555(-7, 16, 60, -36, 59, 16, -127);
        }
        arg0.field5049 += class322.field4801.method2131(arg0.field5049, var4, var4.length, 0, (byte) -117, arg0.field5042);
        return arg0.field5049 - var3;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIIIII)V", line = 56)
    public static final void method1555(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3363++;
        class421.field6112 = 0;
        for (int var7 = -1; var7 < class402.field5869 + class93.field1274; var7++) {
            class189 var30 = null;
            class162 var31;
            if (var7 < 0) {
                var31 = class383.field5609;
            } else if (var7 >= class402.field5869) {
                var31 = class388.field5670[class62.field943[var7 - class402.field5869]];
                var30 = ((class163) var31).field2206;
                if (var30.field2575 != null) {
                    var30 = var30.method1253(-1);
                    if (var30 == null) {
                        continue;
                    }
                }
            } else {
                var31 = class176.field2382[class117.field1528[var7]];
            }
            if (var31.field2119 >= 0) {
                class7.method36(arg4 >> 1, 90, var31, arg5, var31.method1092(-1), arg1 >> 1, arg2);
                if (class53.field814[0] >= 0) {
                    if (var31.field2104 != null && (var7 >= class402.field5869 || class387.field5666 == 0 || class387.field5666 == 3 || class387.field5666 == 1 && class107.method811(((class317) var31).field4650, arg0 + 65534)) && class421.field6112 < class256.field3733) {
                        class256.field3760[class421.field6112] = class233.field3232.method2695(-1, var31.field2104) / 2;
                        class256.field3755[class421.field6112] = class53.field814[0];
                        class256.field3728[class421.field6112] = class53.field814[1];
                        class256.field3753[class421.field6112] = var31.field2145;
                        class256.field3727[class421.field6112] = var31.field2175;
                        class256.field3762[class421.field6112] = var31.field2128;
                        class256.field3754[class421.field6112] = var31.field2104;
                        class421.field6112++;
                    }
                    class315 var32 = class217.field3027[0];
                    int var33 = class53.field814[1] + arg6 - Math.max(class233.field3232.field6255, var32.method202());
                    if (!var31.field2140 && class231.field3179 < var31.field2174) {
                        class315 var34 = class217.field3027[1];
                        if (var31 instanceof class163) {
                            class163 var35 = (class163) var31;
                            class315[] var36 = (class315[]) class66.field981.method378((byte) 28, (long) var35.field2206.field2642);
                            if (var36 == null) {
                                class10[] var37 = class10.method75(class118.field1532, var35.field2206.field2642, 0);
                                if (var37 != null) {
                                    var36 = new class315[var37.length];
                                    for (int var38 = 0; var38 < var37.length; var38++) {
                                        var36[var38] = class126.field1647.method463(var37[var38], true);
                                    }
                                    class66.field981.method367((long) var35.field2206.field2642, var36, true);
                                }
                            }
                            if (var36 != null && var36.length == 2) {
                                var32 = var36[0];
                                var34 = var36[1];
                            }
                        }
                        int var39 = arg3 - ((var32.method208() >> 1) - class53.field814[0]);
                        var32.method2070(var39, var33);
                        int var40 = var32.method208() * var31.field2182 / 255;
                        class126.field1647.method460(var39, var33, var39 + var40, var33 + var32.method202());
                        var34.method2070(var39, var33);
                        class126.field1647.method462(arg3, arg6, arg3 + arg4, arg6 - -arg1);
                    }
                    var33 -= 2;
                    if (!var31.field2140) {
                        if (var31.field2176 > class231.field3179) {
                            class315 var41 = class112.field1455[var31.field2147 ? 2 : 0];
                            class315 var42 = class112.field1455[var31.field2147 ? 3 : 1];
                            boolean var43 = true;
                            int var44;
                            if (var31 instanceof class163) {
                                var44 = var30.field2622;
                                if (var44 == -1) {
                                    var44 = var31.method1084(-24211).field4351;
                                }
                            } else {
                                var44 = var31.method1084(-24211).field4351;
                            }
                            if (var44 != -1) {
                                class315[] var45 = (class315[]) class235.field3278.method378((byte) 28, (long) var44);
                                if (var45 == null) {
                                    class10[] var46 = class10.method75(class118.field1532, var44, 0);
                                    if (var46 != null) {
                                        var45 = new class315[var46.length];
                                        for (int var47 = 0; var47 < var46.length; var47++) {
                                            var45[var47] = class126.field1647.method463(var46[var47], true);
                                        }
                                        class235.field3278.method367((long) var44, var45, true);
                                    }
                                }
                                if (var45 != null && var45.length == 4) {
                                    var42 = var45[var31.field2147 ? 3 : 1];
                                    var41 = var45[var31.field2147 ? 2 : 0];
                                }
                            }
                            int var48 = var31.field2176 - class231.field3179;
                            int var51;
                            if (var48 > var31.field2121) {
                                int var49 = var48 - var31.field2121;
                                int var50 = var31.field2112 == 0 ? 0 : (var31.field2138 - var49) / var31.field2112 * var31.field2112;
                                var51 = var50 * var41.method208() / var31.field2138;
                            } else {
                                var51 = var41.method208();
                            }
                            int var52 = var41.method202();
                            var33 -= var52;
                            int var53 = class53.field814[0] + (arg3 - (var41.method208() >> 1));
                            var41.method2070(var53, var33);
                            class126.field1647.method460(var53, var33, var51 + var53, var33 + var52);
                            var42.method2070(var53, var33);
                            var33 -= 2;
                            class126.field1647.method462(arg3, arg6, arg3 + arg4, arg6 - -arg1);
                        }
                        if (var7 < class402.field5869) {
                            class317 var54 = (class317) var31;
                            if (var54.field4657 != -1) {
                                var33 -= 25;
                                class161.field2097[var54.field4657].method2070(class53.field814[0] + arg3 - 12, var33);
                                var33 -= 2;
                            }
                            if (var54.field4637 != -1) {
                                var33 -= 25;
                                class13.field206[var54.field4637].method2070(class53.field814[0] + arg3 - 12, var33);
                                var33 -= 2;
                            }
                        } else if (var30.field2634 >= 0 && var30.field2634 < class13.field206.length) {
                            class315 var55 = class13.field206[var30.field2634];
                            var33 -= 25;
                            var55.method2070(class53.field814[0] + arg3 - (var55.method208() >> 1), var33);
                            var33 -= 2;
                        }
                    }
                    int var10000;
                    if (!var31 instanceof class317) {
                        int var62 = 0;
                        class198[] var63 = class349.field5195;
                        for (int var64 = 0; var64 < var63.length; var64++) {
                            class198 var68 = var63[var64];
                            if (var68 != null && var68.field2741 == 1 && class62.field943[var7 - class402.field5869] == var68.field2729) {
                                class315 var69 = class160.field2083[var68.field2732];
                                if (var69.method202() > var62) {
                                    var62 = var69.method202();
                                }
                                if (class231.field3179 % 20 < 10) {
                                    var69.method2070(class53.field814[0] + arg3 - 12, var33 - var69.method202());
                                }
                            }
                        }
                        if (var62 > 0) {
                            var10000 = var33 - (var62 + 2);
                        }
                    } else if (var7 >= 0) {
                        int var56 = 0;
                        class198[] var57 = class349.field5195;
                        for (int var58 = 0; var58 < var57.length; var58++) {
                            class198 var60 = var57[var58];
                            if (var60 != null && var60.field2741 == 10 && class117.field1528[var7] == var60.field2729) {
                                class315 var61 = class160.field2083[var60.field2732];
                                if (var61.method202() > var56) {
                                    var56 = var61.method202();
                                }
                                var61.method2070(class53.field814[0] + arg3 - 12, var33 + -var61.method202());
                            }
                        }
                        if (var56 > 0) {
                            var10000 = var33 - (var56 + 2);
                        }
                    }
                    for (int var66 = 0; var66 < 4; var66++) {
                        if (var31.field2170[var66] > class231.field3179) {
                            int var67 = var31.method1092(-1) / 2;
                            class7.method36(arg4 >> 1, 90, var31, arg5, var67, arg1 >> 1, arg2);
                            if (class53.field814[0] > -1) {
                                if (var66 == 1) {
                                    class53.field814[1] -= 20;
                                }
                                if (var66 == 2) {
                                    class53.field814[0] -= 15;
                                    class53.field814[1] -= 10;
                                }
                                if (var66 == 3) {
                                    class53.field814[0] += 15;
                                    class53.field814[1] -= 10;
                                }
                                class24.field441[var31.field2106[var66]].method2070(arg3 + class53.field814[0] - 12, class53.field814[1] + arg6 + -12);
                                class237.field3304.method925(0, Integer.toString(var31.field2127[var66]), arg3 + class53.field814[0] - 1, -1, -22978, class53.field814[1] + arg6 + 3);
                            }
                        }
                    }
                }
            }
        }
        for (int var8 = 0; var8 < class4.field68; var8++) {
            int var26 = class197.field2725[var8];
            class162 var27;
            if (var26 < 2048) {
                var27 = class176.field2382[var26];
            } else {
                var27 = class388.field5670[var26 - 2048];
            }
            int var28 = class241.field3378[var8];
            class162 var29;
            if (var28 < 2048) {
                var29 = class176.field2382[var28];
            } else {
                var29 = class388.field5670[var28 - 2048];
            }
            class431.method2687(arg1, var27, arg2, var29, arg3, --var27.field2107, 0, arg4, arg5, arg6);
        }
        int var9 = class233.field3232.field6255 + class233.field3232.field6259 + 2;
        for (int var10 = 0; var10 < class421.field6112; var10++) {
            int var11 = class256.field3755[var10];
            int var12 = class256.field3728[var10];
            int var13 = class256.field3760[var10];
            boolean var14 = true;
            while (var14) {
                var14 = false;
                for (int var25 = 0; var25 < var10; var25++) {
                    if ((class256.field3728[var25] - var9) < (var12 + 2) && (class256.field3728[var25] + 2) > (var12 - var9) && (class256.field3760[var25] + class256.field3755[var25]) > (var11 - var13) && class256.field3755[var25] - class256.field3760[var25] < var11 + var13 && (class256.field3728[var25] - var9) < var12) {
                        var14 = true;
                        var12 = class256.field3728[var25] - var9;
                    }
                }
            }
            class256.field3728[var10] = var12;
            String var15 = class256.field3754[var10];
            if (class389.field5686 == 0) {
                int var16 = 16776960;
                if (class256.field3753[var10] < 6) {
                    var16 = class396.field5776[class256.field3753[var10]];
                }
                if (class256.field3753[var10] == 6) {
                    var16 = class394.field5731 % 20 < 10 ? 16711680 : 16776960;
                }
                if (class256.field3753[var10] == 7) {
                    var16 = (class394.field5731 % 20) < 10 ? 255 : 65535;
                }
                if (class256.field3753[var10] == 8) {
                    var16 = class394.field5731 % 20 >= 10 ? 8454016 : 45056;
                }
                if (class256.field3753[var10] == 9) {
                    int var17 = 150 - class256.field3762[var10];
                    if (var17 < 50) {
                        var16 = var17 * 1280 + 16711680;
                    } else if (var17 < 100) {
                        var16 = 33160960 - (var17 * 327680);
                    } else if (var17 < 150) {
                        var16 = (var17 - 100) * 5 + 65280;
                    }
                }
                if (class256.field3753[var10] == 10) {
                    int var18 = 150 - class256.field3762[var10];
                    if (var18 < 50) {
                        var16 = var18 * 5 + 16711680;
                    } else if (var18 < 100) {
                        var16 = 33095935 - (var18 * 327680);
                    } else if (var18 < 150) {
                        var16 = (var18 - 100) * 327680 + 255 - ((var18 - 100) * 5);
                    }
                }
                if (class256.field3753[var10] == 11) {
                    int var19 = 150 - class256.field3762[var10];
                    if (var19 < 50) {
                        var16 = 16777215 - var19 * 327685;
                    } else if (var19 < 100) {
                        var16 = (var19 - 50) * 327685 + 65280;
                    } else if (var19 < 150) {
                        var16 = 16777215 - ((var19 - 100) * 327680);
                    }
                }
                int var20 = var16 | 0xFF000000;
                if (class256.field3727[var10] == 0) {
                    class199.field2756.method925(-16777216, var15, arg3 + var11, var20, -22978, arg6 + var12);
                }
                if (class256.field3727[var10] == 1) {
                    class199.field2756.method912(var20, class394.field5731, var15, arg3 + var11, (byte) 101, -16777216, arg6 + var12);
                }
                if (class256.field3727[var10] == 2) {
                    class199.field2756.method920(class394.field5731, var15, arg6 + var12, -16777216, arg3 + var11, var20, arg0 ^ 0xFE);
                }
                if (class256.field3727[var10] == 3) {
                    class199.field2756.method909(class394.field5731, -116, 150 - class256.field3762[var10], arg3 + var11, var20, -16777216, arg6 + var12, var15);
                }
                if (class256.field3727[var10] == 4) {
                    int var21 = (150 - class256.field3762[var10]) * (class233.field3232.method2695(-1, var15) + 100) / 150;
                    class126.field1647.method460(arg3 + var11 - 50, arg6, var11 + arg3 + 50, arg1 + arg6);
                    class199.field2756.method907(var15, false, -16777216, arg6 + var12, var20, arg3 + var11 + 50 - var21);
                    class126.field1647.method462(arg3, arg6, arg3 + arg4, arg1 + arg6);
                }
                if (class256.field3727[var10] == 5) {
                    int var22 = 150 - class256.field3762[var10];
                    int var23 = 0;
                    if (var22 < 25) {
                        var23 = var22 - 25;
                    } else if (var22 > 125) {
                        var23 = var22 - 125;
                    }
                    int var24 = class233.field3232.field6259 + class233.field3232.field6255;
                    class126.field1647.method460(arg3, arg6 + var12 - var24 - 1, arg3 + arg4, arg6 + var12 + 5);
                    class199.field2756.method925(-16777216, var15, arg3 + var11, var20, -22978, arg6 + var12 + var23);
                    class126.field1647.method462(arg3, arg6, arg3 + arg4, arg1 + arg6);
                }
            } else {
                class199.field2756.method925(-16777216, var15, arg3 + var11, -256, -22978, arg6 + var12);
            }
        }
        if (arg0 != 1) {
            field3359 = null;
        }
    }
}
