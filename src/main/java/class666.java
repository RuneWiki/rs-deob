import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class666 {

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "Leba;")
    public static class550 field9475 = new class550(109, -1);

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "[S")
    private static short[] field9476 = new short[] { 967, 20428, -21577, 11219, -10290 };

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "[S")
    private static short[] field9477 = new short[] { 952, 20413, -21592, 11204, -10305 };

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "I")
    public static int field9479 = 765;

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "[S")
    private static short[] field9478 = new short[] { 962, 20423, -21582, 11214, -10295 };

    @OriginalMember(owner = "client!sj", name = "i", descriptor = "[S")
    private static short[] field9480 = new short[] { 957, 20418, -21587, 11209, -10300 };

    @OriginalMember(owner = "client!sj", name = "j", descriptor = "[[S")
    public static short[][] field9481 = new short[][] { field9476, field9478, field9480, field9477 };

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "I")
    public static int field9472;

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "I")
    public static int field9473;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "I")
    public static int field9474;

    @OriginalMember(owner = "client!sj", name = "toString", descriptor = "()Ljava/lang/String;", line = 3)
    public final String toString() {
        field9474++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IBIIIII)V", line = 15)
    public static final void method3793(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field9473++;
        int var7 = class426.field5750;
        int[] var8 = class586.field8104;
        class37.field502 = 0;
        for (int var9 = 0; var9 < class289.field3820 + var7; var9++) {
            class384 var32 = null;
            class231 var33;
            if (var7 <= var9) {
                var33 = ((class407) class296.field3921.method3057(1, (long) class389.field5220[var9 - var7])).field5354;
                var32 = ((class351) var33).field4671;
                if (var32.field5121 != null) {
                    var32 = var32.method2203(3, class564.field7696);
                    if (var32 == null) {
                        continue;
                    }
                }
            } else {
                var33 = class513.field7145[var8[var9]];
            }
            if (var33.field3031 >= 0 && (class647.field8940 == var33.field3024 || class408.field5369.field385 == var33.field385)) {
                class116.method678(arg5, (byte) -73, arg2 >> 1, arg3, var33.method1433(false), var33, arg4 >> 1);
                if (class289.field3821[0] >= 0) {
                    if (var33.field3062 != null && (var9 >= var7 || class141.field1916 == 0 || class141.field1916 == 3 || class141.field1916 == 1 && class473.method2730((byte) 98, ((class573) var33).field7791)) && class37.field502 < class665.field9471) {
                        class665.field9465[class37.field502] = class254.field3332.method3765(var33.field3062, (byte) 6) / 2;
                        class665.field9464[class37.field502] = class289.field3821[0];
                        class665.field9470[class37.field502] = class289.field3821[1];
                        class665.field9467[class37.field502] = var33.field3019;
                        class665.field9466[class37.field502] = var33.field3072;
                        class665.field9469[class37.field502] = var33.field3077;
                        class665.field9468[class37.field502] = var33.field3062;
                        class37.field502++;
                    }
                    int var34 = class289.field3821[1] + arg0;
                    int var45;
                    if (var33.field3042 || var33.field3032 <= class327.field4404) {
                        var45 = var34 - Math.max(class254.field3332.field9375, class99.field1196[0].method529());
                    } else {
                        boolean var35 = true;
                        byte var36 = 1;
                        int var37;
                        if (var7 <= var9) {
                            var37 = var32.field5081;
                            if (var37 == -1) {
                                var37 = var33.method1432(arg1 ^ 0xB).field3456;
                            }
                        } else {
                            class573 var38 = class513.field7145[var8[var9]];
                            var37 = var33.method1432(-1).field3456;
                            if (var38.field7818) {
                                var36 = 2;
                            }
                        }
                        class532[] var39 = class99.field1196;
                        if (var37 != -1) {
                            class532[] var40 = (class532[]) class230.field2981.method2176(-125, (long) var37);
                            if (var40 == null) {
                                class92[] var41 = class92.method512(class390.field5228, var37, 0);
                                if (var41 != null) {
                                    var40 = new class532[var41.length];
                                    for (int var42 = 0; var42 < var41.length; var42++) {
                                        var40[var42] = class146.field1963.method1139(var41[var42], true);
                                    }
                                    class230.field2981.method2174(var40, (long) var37, (byte) 125);
                                }
                            }
                            if (var40 != null && var40.length >= 2) {
                                var39 = var40;
                            }
                        }
                        if (var39.length <= var36) {
                            var36 = 1;
                        }
                        class532 var43 = var39[0];
                        class532 var44 = var39[var36];
                        var45 = var34 - Math.max(class254.field3332.field9375, var43.method529());
                        int var46 = class289.field3821[0] + arg6 - (var43.method530() >> 1);
                        int var47 = var43.method530() * var33.field2994 / 255;
                        if (var33.field2994 > 0 && var47 < 2) {
                            var47 = 2;
                        }
                        var43.method2990(var46, var45);
                        class146.field1963.method1077(var46, var45, var46 + var47, var45 + var43.method529());
                        var44.method2990(var46, var45);
                        class146.field1963.method1042(arg6, arg0, arg6 + arg2, arg0 - -arg4);
                    }
                    var45 -= 2;
                    if (!var33.field3042) {
                        if (class327.field4404 < var33.field2987) {
                            class532 var48 = class452.field5968[var33.field3071 ? 2 : 0];
                            class532 var49 = class452.field5968[var33.field3071 ? 3 : 1];
                            boolean var50 = true;
                            int var51;
                            if (var33 instanceof class351) {
                                var51 = var32.field5097;
                                if (var51 == -1) {
                                    var51 = var33.method1432(arg1 + 11).field3438;
                                }
                            } else {
                                var51 = var33.method1432(-1).field3438;
                            }
                            if (var51 != -1) {
                                class532[] var52 = (class532[]) class436.field5815.method2176(-124, (long) var51);
                                if (var52 == null) {
                                    class92[] var53 = class92.method512(class390.field5228, var51, 0);
                                    if (var53 != null) {
                                        var52 = new class532[var53.length];
                                        for (int var54 = 0; var54 < var53.length; var54++) {
                                            var52[var54] = class146.field1963.method1139(var53[var54], true);
                                        }
                                        class436.field5815.method2174(var52, (long) var51, (byte) 6);
                                    }
                                }
                                if (var52 != null && var52.length == 4) {
                                    var48 = var52[var33.field3071 ? 2 : 0];
                                    var49 = var52[var33.field3071 ? 3 : 1];
                                }
                            }
                            int var55 = var33.field2987 - class327.field4404;
                            int var56;
                            if (var55 <= var33.field3076) {
                                var56 = var48.method530();
                            } else {
                                int var57 = var55 - var33.field3076;
                                int var58 = var33.field3078 == 0 ? 0 : (var33.field3046 - var57) / var33.field3078 * var33.field3078;
                                var56 = var48.method530() * var58 / var33.field3046;
                            }
                            int var59 = var48.method529();
                            var45 -= var59;
                            int var60 = arg6 + class289.field3821[0] - (var48.method530() >> 1);
                            var48.method2990(var60, var45);
                            class146.field1963.method1077(var60, var45, var60 + var56, var45 - -var59);
                            var49.method2990(var60, var45);
                            class146.field1963.method1042(arg6, arg0, arg2 + arg6, arg0 - -arg4);
                            var45 -= 2;
                        }
                        if (var7 > var9) {
                            class573 var62 = (class573) var33;
                            if (var62.field7799 != -1) {
                                var45 -= 25;
                                class237.field3134[var62.field7799].method2990(arg6 + class289.field3821[0] - 12, var45);
                                var45 -= 2;
                            }
                            if (var62.field7798 != -1) {
                                var45 -= 25;
                                class116.field1489[var62.field7798].method2990(class289.field3821[0] + arg6 - 12, var45);
                                var45 -= 2;
                            }
                        } else if (var32.field5113 >= 0 && var32.field5113 < class116.field1489.length) {
                            class532 var61 = class116.field1489[var32.field5113];
                            var45 -= 25;
                            var61.method2990(arg6 + (class289.field3821[0] - (var61.method530() >> 1)), var45);
                            var45 -= 2;
                        }
                    }
                    int var10000;
                    if (!(var33 instanceof class573)) {
                        int var63 = 0;
                        class669[] var64 = class121.field1575;
                        for (int var65 = 0; var65 < var64.length; var65++) {
                            class669 var67 = var64[var65];
                            if (var67 != null && var67.field9508 == 1 && class389.field5220[var9 - var7] == var67.field9513) {
                                class532 var68 = class623.field8633[var67.field9510];
                                if (var68.method529() > var63) {
                                    var63 = var68.method529();
                                }
                                if (class327.field4404 % 20 < 10) {
                                    var68.method2990(class289.field3821[0] + arg6 - 12, -var68.method529() + var45);
                                }
                            }
                        }
                        if (var63 > 0) {
                            var10000 = var45 - (var63 + 2);
                        }
                    } else if (var9 >= 0) {
                        int var69 = 0;
                        class669[] var70 = class121.field1575;
                        for (int var71 = 0; var71 < var70.length; var71++) {
                            class669 var73 = var70[var71];
                            if (var73 != null && var73.field9508 == 10 && var8[var9] == var73.field9513) {
                                class532 var74 = class623.field8633[var73.field9510];
                                if (var69 < var74.method529()) {
                                    var69 = var74.method529();
                                }
                                var74.method2990(class289.field3821[0] + arg6 - 12, -var74.method529() + var45);
                            }
                        }
                        if (var69 > 0) {
                            var10000 = var45 - (var69 + 2);
                        }
                    }
                    for (int var75 = 0; var75 < 4; var75++) {
                        if (class327.field4404 < var33.field3018[var75]) {
                            int var76 = var33.method1433(false) / 2;
                            class116.method678(arg5, (byte) -68, arg2 >> 1, arg3, var76, var33, arg4 >> 1);
                            if (class289.field3821[0] > -1) {
                                int var77 = class55.field720[var33.field3017[var75]].method530();
                                if (var75 == 1) {
                                    class289.field3821[1] -= 20;
                                }
                                if (var75 == 2) {
                                    class289.field3821[1] -= 10;
                                    class289.field3821[0] -= var77 - 9;
                                }
                                if (var75 == 3) {
                                    class289.field3821[0] += var77 - 9;
                                    class289.field3821[1] -= 10;
                                }
                                class55.field720[var33.field3017[var75]].method2990(arg6 + class289.field3821[0] - (var77 >> 1), class289.field3821[1] + -12 + arg0);
                                class399.field5300.method2323(30, 0, class289.field3821[0] + arg6 - 1, -1, Integer.toString(var33.field3002[var75]), class289.field3821[1] + arg0 + 3);
                            }
                        }
                    }
                }
            }
        }
        for (int var10 = 0; var10 < class471.field6568; var10++) {
            int var28 = class377.field4991[var10];
            class231 var29;
            if (var28 < 2048) {
                var29 = class513.field7145[var28];
            } else {
                var29 = ((class407) class296.field3921.method3057(1, (long) (var28 - 2048))).field5354;
            }
            int var30 = class457.field6005[var10];
            class231 var31;
            if (var30 < 2048) {
                var31 = class513.field7145[var30];
            } else {
                var31 = ((class407) class296.field3921.method3057(1, (long) (var30 - 2048))).field5354;
            }
            class177.method1199(var31, arg6, arg5, arg4, arg3, arg0, true, var29, arg2, --var29.field3041);
        }
        int var11 = class254.field3332.field9375 + class254.field3332.field9366 + 2;
        int var12 = 0;
        if (arg1 != -12) {
            return;
        }
        while (class37.field502 > var12) {
            int var13 = class665.field9464[var12];
            int var14 = class665.field9470[var12];
            int var15 = class665.field9465[var12];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var27 = 0; var27 < var12; var27++) {
                    if (var14 + 2 > class665.field9470[var27] + -var11 && (class665.field9470[var27] + 2) > (var14 - var11) && (var13 - var15) < (class665.field9465[var27] + class665.field9464[var27]) && (class665.field9464[var27] - class665.field9465[var27]) < (var13 + var15) && var14 > (class665.field9470[var27] - var11)) {
                        var16 = true;
                        var14 = class665.field9470[var27] - var11;
                    }
                }
            }
            class665.field9470[var12] = var14;
            String var17 = class665.field9468[var12];
            if (class351.field4678 == 0) {
                int var18 = 16776960;
                if (class665.field9467[var12] < 6) {
                    var18 = class187.field2607[class665.field9467[var12]];
                }
                if (class665.field9467[var12] == 6) {
                    var18 = class647.field8940 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (class665.field9467[var12] == 7) {
                    var18 = class647.field8940 % 20 >= 10 ? 65535 : 255;
                }
                if (class665.field9467[var12] == 8) {
                    var18 = class647.field8940 % 20 >= 10 ? 8454016 : 45056;
                }
                if (class665.field9467[var12] == 9) {
                    int var19 = 150 - class665.field9469[var12];
                    if (var19 < 50) {
                        var18 = var19 * 1280 + 16711680;
                    } else if (var19 < 100) {
                        var18 = 16384000 + 16776960 - (var19 * 327680);
                    } else if (var19 < 150) {
                        var18 = (var19 - 100) * 5 + 65280;
                    }
                }
                if (class665.field9467[var12] == 10) {
                    int var20 = 150 - class665.field9469[var12];
                    if (var20 < 50) {
                        var18 = var20 * 5 + 16711680;
                    } else if (var20 < 100) {
                        var18 = 16384000 + 16711935 - (var20 * 327680);
                    } else if (var20 < 150) {
                        var18 = (var20 * 327680) + 255 - ((var20 - 100) * 5) - 32768000;
                    }
                }
                if (class665.field9467[var12] == 11) {
                    int var21 = 150 - class665.field9469[var12];
                    if (var21 < 50) {
                        var18 = 16777215 - (var21 * 327685);
                    } else if (var21 < 100) {
                        var18 = var21 * 327685 - 16318970;
                    } else if (var21 < 150) {
                        var18 = 32768000 + 16777215 - var21 * 327680;
                    }
                }
                int var22 = var18 | 0xFF000000;
                if (class665.field9466[var12] == 0) {
                    class622.field8625.method2323(72, -16777216, arg6 + var13, var22, var17, arg0 + var14);
                }
                if (class665.field9466[var12] == 1) {
                    class622.field8625.method2322(var22, var17, class647.field8940, arg1 ^ 0xFFFFFFF1, arg6 + var13, -16777216, arg0 + var14);
                }
                if (class665.field9466[var12] == 2) {
                    class622.field8625.method2331(arg6 + var13, -16777216, class647.field8940, arg0 + var14, 68, var17, var22);
                }
                if (class665.field9466[var12] == 3) {
                    class622.field8625.method2329(arg0 + var14, class647.field8940, 150 - class665.field9469[var12], arg6 + var13, var22, var17, -16777216, arg1 ^ 0x7F);
                }
                if (class665.field9466[var12] == 4) {
                    int var23 = (150 - class665.field9469[var12]) * (class254.field3332.method3765(var17, (byte) 6) + 100) / 150;
                    class146.field1963.method1077(arg6 + var13 - 50, arg0, arg6 + var13 + 50, arg0 + arg4);
                    class622.field8625.method2316(arg6 + var13 + 50 - var23, var22, arg0 + var14, var17, -16777216, 0);
                    class146.field1963.method1042(arg6, arg0, arg2 + arg6, arg0 + arg4);
                }
                if (class665.field9466[var12] == 5) {
                    int var24 = 150 - class665.field9469[var12];
                    int var25 = 0;
                    if (var24 < 25) {
                        var25 = var24 - 25;
                    } else if (var24 > 125) {
                        var25 = var24 - 125;
                    }
                    int var26 = class254.field3332.field9375 + class254.field3332.field9366;
                    class146.field1963.method1077(arg6, arg0 + var14 - var26 - 1, arg6 - -arg2, arg0 + var14 + 5);
                    class622.field8625.method2323(arg1 + 108, -16777216, arg6 + var13, var22, var17, arg0 + var14 + var25);
                    class146.field1963.method1042(arg6, arg0, arg6 + arg2, arg0 - -arg4);
                }
            } else {
                class622.field8625.method2323(arg1 ^ 0xFFFFFFBD, -16777216, arg6 + var13, -256, var17, arg0 + var14);
            }
            var12++;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Z)V", line = 602)
    public static void method3794(boolean arg0) {
        if (!arg0) {
            method3795(null, -2);
        }
        field9480 = null;
        field9475 = null;
        field9478 = null;
        field9476 = null;
        field9477 = null;
        field9481 = null;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 619)
    public static final void method3795(String arg0, int arg1) {
        field9472++;
        if (class267.field3491 == null) {
            return;
        }
        class641.field8848++;
        class229 var2 = class97.method550(class71.field841, false, class649.field8962);
        if (arg1 != 327680) {
            field9477 = null;
        }
        var2.field2971.method915(-31914, class206.method1313((byte) -56, arg0));
        var2.field2971.method936(arg0, 110);
        class307.method1805(var2, -14704);
    }
}
