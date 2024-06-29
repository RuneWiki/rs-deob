import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public abstract class class413 extends class291 {

    @OriginalMember(owner = "client!id", name = "k", descriptor = "Lkl;")
    public static class55 field6027 = new class55(10, 2, 2, 0);

    @OriginalMember(owner = "client!id", name = "o", descriptor = "[Ljava/lang/String;")
    public static String[] field6031 = new String[100];

    @OriginalMember(owner = "client!id", name = "q", descriptor = "[B")
    public static byte[] field6033 = new byte[2048];

    @OriginalMember(owner = "client!id", name = "n", descriptor = "Z")
    public static boolean field6030 = false;

    @OriginalMember(owner = "client!id", name = "l", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field6028 = new Rectangle[100];

    @OriginalMember(owner = "client!id", name = "d", descriptor = "I")
    public static int field6020;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "I")
    public int field6021;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "I")
    public static int field6022;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "I")
    public static int field6023;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "I")
    public static int field6024;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "I")
    public int field6025;

    @OriginalMember(owner = "client!id", name = "j", descriptor = "I")
    public int field6026;

    @OriginalMember(owner = "client!id", name = "p", descriptor = "I")
    public static int field6032;

    @OriginalMember(owner = "client!id", name = "s", descriptor = "I")
    public static int field6035;

    @OriginalMember(owner = "client!id", name = "m", descriptor = "Lbr;")
    public static class269 field6029;

    @OriginalMember(owner = "client!id", name = "r", descriptor = "Z")
    public boolean field6034;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "(I)V")
    public final void method495(int arg0) {
        if (arg0 <= -104) {
            field6024++;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(B)V")
    public static void method2468(byte arg0) {
        field6033 = null;
        field6031 = null;
        field6029 = null;
        if (arg0 != 11) {
            method2469(58, 103, 54, 25, 35, -113, 41);
        }
        field6028 = null;
        field6027 = null;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2469(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6023++;
        int var7 = class375.field5498;
        class366.field5364 = 0;
        int[] var8 = class397.field5793;
        for (int var9 = 0; var9 < class275.field3772 + var7; var9++) {
            class79 var32 = null;
            class77 var33;
            if (var9 < var7) {
                var33 = class12.field182[var8[var9]];
            } else {
                var33 = class378.field5533[class65.field899[var9 - var7]];
                var32 = ((class502) var33).field7387;
                if (var32.field1143 != null) {
                    var32 = var32.method646(0, class421.field6166);
                    if (var32 == null) {
                        continue;
                    }
                }
            }
            if (var33.field1042 >= 0 && (class168.field2517 == var33.field1096 || class316.field4324.field1738 == var33.field1738)) {
                class324.method1875(arg2, arg4, arg5 >> 1, var33, false, arg3 >> 1, var33.method621(-1));
                if (class52.field637[0] >= 0) {
                    if (var33.field1100 != null && (var7 <= var9 || class341.field4919 == 0 || class341.field4919 == 3 || class341.field4919 == 1 && class202.method1259(((class438) var33).field6421, -112)) && class366.field5364 < class173.field2573) {
                        class173.field2576[class366.field5364] = class407.field5952.method2867(var33.field1100, (byte) -70) / 2;
                        class173.field2575[class366.field5364] = class52.field637[0];
                        class173.field2568[class366.field5364] = class52.field637[1];
                        class173.field2567[class366.field5364] = var33.field1073;
                        class173.field2571[class366.field5364] = var33.field1104;
                        class173.field2572[class366.field5364] = var33.field1050;
                        class173.field2574[class366.field5364] = var33.field1100;
                        class366.field5364++;
                    }
                    int var34 = class52.field637[1] + arg1;
                    int var45;
                    if (var33.field1071 || class441.field6516 >= var33.field1056) {
                        var45 = var34 - Math.max(class407.field5952.field7165, class64.field807[0].method98());
                    } else {
                        boolean var35 = true;
                        byte var36 = 1;
                        int var37;
                        if (var7 <= var9) {
                            var37 = var32.field1186;
                            if (var37 == -1) {
                                var37 = var33.method616((byte) -83).field1366;
                            }
                        } else {
                            class438 var38 = class12.field182[var8[var9]];
                            var37 = var33.method616((byte) -83).field1366;
                            if (var38.field6413) {
                                var36 = 2;
                            }
                        }
                        class16[] var39 = class64.field807;
                        if (var37 != -1) {
                            class16[] var40 = (class16[]) class33.field440.method1073((long) var37, false);
                            if (var40 == null) {
                                class4[] var41 = class4.method24(class364.field5334, var37, 0);
                                if (var41 != null) {
                                    var40 = new class16[var41.length];
                                    for (int var42 = 0; var42 < var41.length; var42++) {
                                        var40[var42] = class269.field3721.method265(var41[var42], true);
                                    }
                                    class33.field440.method1072((long) var37, var40, false);
                                }
                            }
                            if (var40 != null && var40.length >= 2) {
                                var39 = var40;
                            }
                        }
                        if (var39.length <= var36) {
                            var36 = 1;
                        }
                        class16 var43 = var39[0];
                        class16 var44 = var39[var36];
                        var45 = var34 - Math.max(class407.field5952.field7165, var43.method98());
                        int var46 = class52.field637[0] + arg6 - (var43.method102() >> 1);
                        int var47 = var43.method102() * var33.field1079 / 255;
                        if (var33.field1079 > 0 && var47 < 2) {
                            var47 = 2;
                        }
                        var43.method85(var46, var45);
                        class269.field3721.method250(var46, var45, var46 + var47, var45 + var43.method98());
                        var44.method85(var46, var45);
                        class269.field3721.method279(arg6, arg1, arg5 + arg6, arg1 + arg3);
                    }
                    var45 -= 2;
                    if (!var33.field1071) {
                        if (class441.field6516 < var33.field1039) {
                            class16 var48 = class278.field3807[var33.field1029 ? 2 : 0];
                            class16 var49 = class278.field3807[var33.field1029 ? 3 : 1];
                            boolean var50 = true;
                            int var51;
                            if ((var33 instanceof class502)) {
                                var51 = var32.field1189;
                                if (var51 == -1) {
                                    var51 = var33.method616((byte) -83).field1359;
                                }
                            } else {
                                var51 = var33.method616((byte) -83).field1359;
                            }
                            if (var51 != -1) {
                                class16[] var52 = (class16[]) class318.field4371.method1073((long) var51, false);
                                if (var52 == null) {
                                    class4[] var53 = class4.method24(class364.field5334, var51, 0);
                                    if (var53 != null) {
                                        var52 = new class16[var53.length];
                                        for (int var54 = 0; var54 < var53.length; var54++) {
                                            var52[var54] = class269.field3721.method265(var53[var54], true);
                                        }
                                        class318.field4371.method1072((long) var51, var52, false);
                                    }
                                }
                                if (var52 != null && var52.length == 4) {
                                    var48 = var52[var33.field1029 ? 2 : 0];
                                    var49 = var52[var33.field1029 ? 3 : 1];
                                }
                            }
                            int var55 = var33.field1039 - class441.field6516;
                            int var56;
                            if (var33.field1041 >= var55) {
                                var56 = var48.method102();
                            } else {
                                int var57 = var55 - var33.field1041;
                                int var58 = var33.field1040 == 0 ? 0 : (var33.field1044 - var57) / var33.field1040 * var33.field1040;
                                var56 = var58 * var48.method102() / var33.field1044;
                            }
                            int var59 = var48.method98();
                            var45 -= var59;
                            int var60 = arg6 - ((var48.method102() >> 1) - class52.field637[0]);
                            var48.method85(var60, var45);
                            class269.field3721.method250(var60, var45, var56 + var60, var45 - -var59);
                            var49.method85(var60, var45);
                            var45 -= 2;
                            class269.field3721.method279(arg6, arg1, arg5 + arg6, arg1 - -arg3);
                        }
                        if (var7 > var9) {
                            class438 var62 = (class438) var33;
                            if (var62.field6445 != -1) {
                                var45 -= 25;
                                class372.field5448[var62.field6445].method85(class52.field637[0] + arg6 - 12, var45);
                                var45 -= 2;
                            }
                            if (var62.field6441 != -1) {
                                var45 -= 25;
                                class183.field2681[var62.field6441].method85(arg6 + class52.field637[0] - 12, var45);
                                var45 -= 2;
                            }
                        } else if (var32.field1163 >= 0 && class183.field2681.length > var32.field1163) {
                            var45 -= 25;
                            class16 var61 = class183.field2681[var32.field1163];
                            var61.method85(class52.field637[0] + arg6 - (var61.method102() >> 1), var45);
                            var45 -= 2;
                        }
                    }
                    int var10000;
                    if (!var33 instanceof class438) {
                        int var69 = 0;
                        class371[] var70 = class218.field3046;
                        for (int var71 = 0; var71 < var70.length; var71++) {
                            class371 var75 = var70[var71];
                            if (var75 != null && var75.field5433 == 1 && class65.field899[var9 - var7] == var75.field5428) {
                                class16 var76 = class528.field7802[var75.field5435];
                                if (var76.method98() > var69) {
                                    var69 = var76.method98();
                                }
                                if (class441.field6516 % 20 < 10) {
                                    var76.method85(arg6 + class52.field637[0] - 12, -var76.method98() + var45);
                                }
                            }
                        }
                        if (var69 > 0) {
                            var10000 = var45 - (var69 + 2);
                        }
                    } else if (var9 >= 0) {
                        int var63 = 0;
                        class371[] var64 = class218.field3046;
                        for (int var65 = 0; var65 < var64.length; var65++) {
                            class371 var67 = var64[var65];
                            if (var67 != null && var67.field5433 == 10 && var8[var9] == var67.field5428) {
                                class16 var68 = class528.field7802[var67.field5435];
                                if (var68.method98() > var63) {
                                    var63 = var68.method98();
                                }
                                var68.method85(class52.field637[0] + arg6 - 12, var45 + -var68.method98());
                            }
                        }
                        if (var63 > 0) {
                            var10000 = var45 - (var63 + 2);
                        }
                    }
                    for (int var73 = 0; var73 < 4; var73++) {
                        if (class441.field6516 < var33.field1078[var73]) {
                            int var74 = var33.method621(arg0 ^ 0xFFFFEB9C) / 2;
                            class324.method1875(arg2, arg4, arg5 >> 1, var33, false, arg3 >> 1, var74);
                            if (class52.field637[0] > -1) {
                                if (var73 == 1) {
                                    class52.field637[1] -= 20;
                                }
                                if (var73 == 2) {
                                    class52.field637[0] -= 15;
                                    class52.field637[1] -= 10;
                                }
                                if (var73 == 3) {
                                    class52.field637[0] += 15;
                                    class52.field637[1] -= 10;
                                }
                                class441.field6532[var33.field1082[var73]].method85(arg6 + class52.field637[0] - 12, class52.field637[1] + -12 + arg1);
                                class451.field6653.method1840(-1, true, Integer.toString(var33.field1038[var73]), 0, arg1 + class52.field637[1] + 3, arg6 - (-class52.field637[0] + 1));
                            }
                        }
                    }
                }
            }
        }
        for (int var10 = 0; var10 < class367.field5390; var10++) {
            int var28 = class52.field634[var10];
            class77 var29;
            if (var28 < 2048) {
                var29 = class12.field182[var28];
            } else {
                var29 = class378.field5533[var28 - 2048];
            }
            int var30 = class309.field4208[var10];
            class77 var31;
            if (var30 < 2048) {
                var31 = class12.field182[var30];
            } else {
                var31 = class378.field5533[var30 - 2048];
            }
            class300.method1755(arg1, arg5, arg6, arg3, arg2, var31, --var29.field1053, (byte) 107, arg4, var29);
        }
        int var11 = class407.field5952.field7165 + class407.field5952.field7155 + 2;
        if (arg0 != 5219) {
            field6031 = null;
        }
        for (int var12 = 0; var12 < class366.field5364; var12++) {
            int var13 = class173.field2575[var12];
            int var14 = class173.field2568[var12];
            int var15 = class173.field2576[var12];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var27 = 0; var27 < var12; var27++) {
                    if (var14 + 2 > class173.field2568[var27] + -var11 && (var14 - var11) < (class173.field2568[var27] + 2) && class173.field2576[var27] + class173.field2575[var27] > -var15 + var13 && (var13 + var15) > (class173.field2575[var27] - class173.field2576[var27]) && (class173.field2568[var27] - var11) < var14) {
                        var14 = class173.field2568[var27] - var11;
                        var16 = true;
                    }
                }
            }
            class173.field2568[var12] = var14;
            String var17 = class173.field2574[var12];
            if (class147.field2130 == 0) {
                int var18 = 16776960;
                if (class173.field2567[var12] < 6) {
                    var18 = class26.field352[class173.field2567[var12]];
                }
                if (class173.field2567[var12] == 6) {
                    var18 = (class168.field2517 % 20) < 10 ? 16711680 : 16776960;
                }
                if (class173.field2567[var12] == 7) {
                    var18 = (class168.field2517 % 20) >= 10 ? 65535 : 255;
                }
                if (class173.field2567[var12] == 8) {
                    var18 = class168.field2517 % 20 >= 10 ? 8454016 : 45056;
                }
                if (class173.field2567[var12] == 9) {
                    int var19 = 150 - class173.field2572[var12];
                    if (var19 < 50) {
                        var18 = var19 * 1280 + 16711680;
                    } else if (var19 < 100) {
                        var18 = 16776960 + 16384000 - (var19 * 327680);
                    } else if (var19 < 150) {
                        var18 = (var19 - 100) * 5 + 65280;
                    }
                }
                if (class173.field2567[var12] == 10) {
                    int var20 = 150 - class173.field2572[var12];
                    if (var20 < 50) {
                        var18 = var20 * 5 + 16711680;
                    } else if (var20 < 100) {
                        var18 = 16384000 + 16711935 - (var20 * 327680);
                    } else if (var20 < 150) {
                        var18 = var20 * 327680 + 255 - (var20 * 5 - 500) - 32768000;
                    }
                }
                if (class173.field2567[var12] == 11) {
                    int var21 = 150 - class173.field2572[var12];
                    if (var21 < 50) {
                        var18 = 16777215 - var21 * 327685;
                    } else if (var21 < 100) {
                        var18 = 65280 - (16384250 - (var21 * 327685));
                    } else if (var21 < 150) {
                        var18 = 16777215 + 32768000 - var21 * 327680;
                    }
                }
                int var22 = var18 | 0xFF000000;
                if (class173.field2571[var12] == 0) {
                    class135.field1949.method1840(var22, true, var17, -16777216, arg1 + var14, arg6 + var13);
                }
                if (class173.field2571[var12] == 1) {
                    class135.field1949.method1828(-16777216, arg1 + var14, arg6 - -var13, var22, var17, class168.field2517, 29969);
                }
                if (class173.field2571[var12] == 2) {
                    class135.field1949.method1834(var22, class168.field2517, -16777216, var17, arg6 + var13, -12700, arg1 + var14);
                }
                if (class173.field2571[var12] == 3) {
                    class135.field1949.method1839(arg1 + var14, arg6 + var13, -101, class168.field2517, var22, 150 - class173.field2572[var12], var17, -16777216);
                }
                if (class173.field2571[var12] == 4) {
                    int var23 = (150 - class173.field2572[var12]) * (class407.field5952.method2867(var17, (byte) -70) + 100) / 150;
                    class269.field3721.method250(arg6 + var13 - 50, arg1, arg6 + var13 + 50, arg1 + arg3);
                    class135.field1949.method1833(arg6 + var13 + 50 - var23, var17, -16777216, 86, arg1 + var14, var22);
                    class269.field3721.method279(arg6, arg1, arg5 + arg6, arg1 - -arg3);
                }
                if (class173.field2571[var12] == 5) {
                    int var24 = 150 - class173.field2572[var12];
                    int var25 = 0;
                    if (var24 < 25) {
                        var25 = var24 - 25;
                    } else if (var24 > 125) {
                        var25 = var24 - 125;
                    }
                    int var26 = class407.field5952.field7165 + class407.field5952.field7155;
                    class269.field3721.method250(arg6, var14 + arg1 - var26 - 1, arg5 + arg6, arg1 + var14 + 5);
                    class135.field1949.method1840(var22, true, var17, -16777216, var14 + var25 + arg1, arg6 + var13);
                    class269.field3721.method279(arg6, arg1, arg5 + arg6, arg1 + arg3);
                }
            } else {
                class135.field1949.method1840(-256, true, var17, -16777216, arg1 + var14, arg6 + var13);
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lya;IZLij;III)V")
    public final void method498(class38 arg0, int arg1, boolean arg2, class291 arg3, int arg4, int arg5, int arg6) {
        if (arg6 != -1) {
            method2468((byte) 8);
        }
        field6022++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!id", name = "f", descriptor = "(I)Z")
    public final boolean method492(int arg0) {
        field6020++;
        return arg0 != -1;
    }
}
