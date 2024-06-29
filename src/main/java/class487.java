import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class487 extends InputStream {

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "I")
    public static int field6475 = 0;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "I")
    public static int field6473;

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "I")
    public static int field6474;

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "I")
    public static int field6476;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(BI)V", line = 5)
    public static final void method2674(byte arg0, int arg1) {
        field6474++;
        if (arg0 != 124 || class668.field9276 == arg1) {
            return;
        }
        class611.field8258 = class656.field9155 = class143.field1877[arg1];
        class563.method3008(arg0 + 388);
        class325.field4211 = new int[4][class611.field8258 >> 3][class656.field9155 >> 3];
        class554.field7252 = new int[class611.field8258][class656.field9155];
        class686.field9410 = new int[class611.field8258][class656.field9155];
        for (int var2 = 0; var2 < 4; var2++) {
            class703.field9806[var2] = class48.method439(class656.field9155, 13556, class611.field8258);
        }
        class605.field8192 = new byte[4][class611.field8258][class656.field9155];
        class697.method3797(class656.field9155, 4, class611.field8258, 11);
        class76.method619(85, class520.field6799, class611.field8258 >> 3, class656.field9155 >> 3);
        class668.field9276 = arg1;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIIIII)V", line = 39)
    public static final void method2675(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6473++;
        int var7 = class260.field3508;
        class164.field2047 = 0;
        int[] var8 = class135.field1779;
        if (arg4 != 4) {
            method2675(27, 29, -49, 32, -19, -46, -62);
        }
        for (int var9 = 0; var9 < (class248.field3351 + var7); var9++) {
            class699 var32 = null;
            class227 var33;
            if (var9 >= var7) {
                var33 = ((class234) class505.field6640.method39((long) class40.field558[var9 - var7], 31750)).field3131;
                var32 = ((class532) var33).field6914;
                if (var32.field9714 != null) {
                    var32 = var32.method3823(class397.field5054, -32574);
                    if (var32 == null) {
                        continue;
                    }
                }
            } else {
                var33 = class592.field8019[var8[var9]];
            }
            if (var33.field2963 >= 0 && (class413.field5318 == var33.field3004 || class233.field3130.field508 == var33.field508)) {
                class410.method2326(arg0, var33, var33.method1423(true), arg1 >> 1, arg6 >> 1, arg2, arg4 ^ 0xA81);
                if (class483.field6441[0] >= 0) {
                    if (var33.field3017 != null && (var7 <= var9 || class681.field9384 == 0 || class681.field9384 == 3 || class681.field9384 == 1 && class678.method3726(((class193) var33).field2492, false)) && class164.field2047 < class72.field970) {
                        class72.field989[class164.field2047] = class411.field5305.method2900(true, var33.field3017) / 2;
                        class72.field978[class164.field2047] = class483.field6441[0];
                        class72.field971[class164.field2047] = class483.field6441[1];
                        class72.field985[class164.field2047] = var33.field2967;
                        class72.field988[class164.field2047] = var33.field2957;
                        class72.field982[class164.field2047] = var33.field2999;
                        class72.field983[class164.field2047] = var33.field3017;
                        class164.field2047++;
                    }
                    int var34 = class483.field6441[1] + arg3;
                    int var45;
                    if (var33.field2983 || var33.field3016 <= class424.field5503) {
                        var45 = var34 - Math.max(class411.field5305.field7103, class87.field1153[0].method607());
                    } else {
                        boolean var35 = true;
                        byte var36 = 1;
                        int var38;
                        if (var7 > var9) {
                            class193 var37 = class592.field8019[var8[var9]];
                            var38 = var33.method1435((byte) 125).field6592;
                            if (var37.field2500) {
                                var36 = 2;
                            }
                        } else {
                            var38 = var32.field9716;
                            if (var38 == -1) {
                                var38 = var33.method1435((byte) 122).field6592;
                            }
                        }
                        class511[] var39 = class87.field1153;
                        if (var38 != -1) {
                            class511[] var40 = (class511[]) class149.field1923.method3655(-108, (long) var38);
                            if (var40 == null) {
                                class506[] var41 = class506.method2731(class90.field1186, var38, 0);
                                if (var41 != null) {
                                    var40 = new class511[var41.length];
                                    for (int var42 = 0; var42 < var41.length; var42++) {
                                        var40[var42] = class520.field6799.method325(var41[var42], true);
                                    }
                                    class149.field1923.method3650((long) var38, -102, var40);
                                }
                            }
                            if (var40 != null && var40.length >= 2) {
                                var39 = var40;
                            }
                        }
                        if (var36 >= var39.length) {
                            var36 = 1;
                        }
                        class511 var43 = var39[0];
                        class511 var44 = var39[var36];
                        var45 = var34 - Math.max(class411.field5305.field7103, var43.method607());
                        int var46 = arg5 + class483.field6441[0] - (var43.method608() >> 1);
                        int var47 = var43.method608() * var33.field2996 / 255;
                        if (var33.field2996 > 0 && var47 < 2) {
                            var47 = 2;
                        }
                        var43.method2751(var46, var45);
                        class520.field6799.method339(var46, var45, var46 + var47, var43.method607() + var45);
                        var44.method2751(var46, var45);
                        class520.field6799.method376(arg5, arg3, arg5 + arg1, arg3 + arg6);
                    }
                    var45 -= 2;
                    if (!var33.field2983) {
                        if (var33.field3012 > class424.field5503) {
                            class511 var48 = class134.field1745[var33.field2982 ? 2 : 0];
                            class511 var49 = class134.field1745[var33.field2982 ? 3 : 1];
                            boolean var50 = true;
                            int var51;
                            if (var33 instanceof class532) {
                                var51 = var32.field9689;
                                if (var51 == -1) {
                                    var51 = var33.method1435((byte) -106).field6583;
                                }
                            } else {
                                var51 = var33.method1435((byte) -57).field6583;
                            }
                            if (var51 != -1) {
                                class511[] var52 = (class511[]) class379.field4852.method3655(-111, (long) var51);
                                if (var52 == null) {
                                    class506[] var53 = class506.method2731(class90.field1186, var51, 0);
                                    if (var53 != null) {
                                        var52 = new class511[var53.length];
                                        for (int var54 = 0; var54 < var53.length; var54++) {
                                            var52[var54] = class520.field6799.method325(var53[var54], true);
                                        }
                                        class379.field4852.method3650((long) var51, -127, var52);
                                    }
                                }
                                if (var52 != null && var52.length == 4) {
                                    var49 = var52[var33.field2982 ? 3 : 1];
                                    var48 = var52[var33.field2982 ? 2 : 0];
                                }
                            }
                            int var55 = var33.field3012 - class424.field5503;
                            int var58;
                            if (var33.field3002 < var55) {
                                int var56 = var55 - var33.field3002;
                                int var57 = var33.field2951 == 0 ? 0 : (var33.field3005 - var56) / var33.field2951 * var33.field2951;
                                var58 = var48.method608() * var57 / var33.field3005;
                            } else {
                                var58 = var48.method608();
                            }
                            int var59 = var48.method607();
                            var45 -= var59;
                            int var60 = class483.field6441[0] + arg5 - (var48.method608() >> 1);
                            var48.method2751(var60, var45);
                            class520.field6799.method339(var60, var45, var58 + var60, var45 + var59);
                            var49.method2751(var60, var45);
                            var45 -= 2;
                            class520.field6799.method376(arg5, arg3, arg1 + arg5, arg3 + arg6);
                        }
                        if (var7 > var9) {
                            class193 var62 = (class193) var33;
                            if (var62.field2470 != -1) {
                                var45 -= 25;
                                class316.field4104[var62.field2470].method2751(class483.field6441[0] + arg5 - 12, var45);
                                var45 -= 2;
                            }
                            if (var62.field2472 != -1) {
                                var45 -= 25;
                                class96.field1259[var62.field2472].method2751(class483.field6441[0] + arg5 - 12, var45);
                                var45 -= 2;
                            }
                        } else if (var32.field9707 >= 0 && var32.field9707 < class96.field1259.length) {
                            var45 -= 25;
                            class511 var61 = class96.field1259[var32.field9707];
                            var61.method2751(class483.field6441[0] + arg5 - (var61.method608() >> 1), var45);
                            var45 -= 2;
                        }
                    }
                    int var10000;
                    if (!var33 instanceof class193) {
                        int var69 = 0;
                        class514[] var70 = class434.field5591;
                        for (int var71 = 0; var71 < var70.length; var71++) {
                            class514 var76 = var70[var71];
                            if (var76 != null && var76.field6726 == 1 && class40.field558[var9 - var7] == var76.field6730) {
                                class511 var77 = class126.field1635[var76.field6732];
                                if (var77.method607() > var69) {
                                    var69 = var77.method607();
                                }
                                if ((class424.field5503 % 20) < 10) {
                                    var77.method2751(arg5 + class483.field6441[0] - 12, var45 + -var77.method607());
                                }
                            }
                        }
                        if (var69 > 0) {
                            var10000 = var45 - (var69 + 2);
                        }
                    } else if (var9 >= 0) {
                        int var63 = 0;
                        class514[] var64 = class434.field5591;
                        for (int var65 = 0; var65 < var64.length; var65++) {
                            class514 var67 = var64[var65];
                            if (var67 != null && var67.field6726 == 10 && var8[var9] == var67.field6730) {
                                class511 var68 = class126.field1635[var67.field6732];
                                if (var63 < var68.method607()) {
                                    var63 = var68.method607();
                                }
                                var68.method2751(arg5 + class483.field6441[0] - 12, -var68.method607() + var45);
                            }
                        }
                        if (var63 > 0) {
                            var10000 = var45 - (var63 + 2);
                        }
                    }
                    for (int var73 = 0; var73 < 4; var73++) {
                        if (var33.field2956[var73] > class424.field5503) {
                            int var74 = var33.method1423(true) / 2;
                            class410.method2326(arg0, var33, var74, arg1 >> 1, arg6 >> 1, arg2, arg4 ^ 0xA81);
                            if (class483.field6441[0] > -1) {
                                int var75 = class519.field6797[var33.field2985[var73]].method608();
                                if (var73 == 1) {
                                    class483.field6441[1] -= 20;
                                }
                                if (var73 == 2) {
                                    class483.field6441[1] -= 10;
                                    class483.field6441[0] -= var75 - 9;
                                }
                                if (var73 == 3) {
                                    class483.field6441[1] -= 10;
                                    class483.field6441[0] += var75 - 9;
                                }
                                class519.field6797[var33.field2985[var73]].method2751(arg5 + class483.field6441[0] - (var75 >> 1), class483.field6441[1] + arg3 + -12);
                                class305.field4015.method3249((byte) -115, -1, class483.field6441[1] + arg3 + 3, Integer.toString(var33.field3007[var73]), class483.field6441[0] + arg5 - 1, 0);
                            }
                        }
                    }
                }
            }
        }
        for (int var10 = 0; var10 < class38.field551; var10++) {
            int var28 = class217.field2848[var10];
            class227 var29;
            if (var28 < 2048) {
                var29 = class592.field8019[var28];
            } else {
                var29 = ((class234) class505.field6640.method39((long) (var28 - 2048), 31750)).field3131;
            }
            int var30 = class165.field2056[var10];
            class227 var31;
            if (var30 >= 2048) {
                var31 = ((class234) class505.field6640.method39((long) (var30 - 2048), arg4 + 31746)).field3131;
            } else {
                var31 = class592.field8019[var30];
            }
            class389.method2226(arg6, arg2, arg5, arg0, --var29.field3011, arg1, 1, arg3, var31, var29);
        }
        int var11 = class411.field5305.field7102 + class411.field5305.field7103 + 2;
        for (int var12 = 0; var12 < class164.field2047; var12++) {
            int var13 = class72.field978[var12];
            int var14 = class72.field971[var12];
            int var15 = class72.field989[var12];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var27 = 0; var27 < var12; var27++) {
                    if ((var14 + 2) > (class72.field971[var27] - var11) && (class72.field971[var27] + 2) > (var14 - var11) && (var13 - var15) < (class72.field978[var27] + class72.field989[var27]) && var13 + var15 > class72.field978[var27] + -class72.field989[var27] && class72.field971[var27] - var11 < var14) {
                        var14 = class72.field971[var27] - var11;
                        var16 = true;
                    }
                }
            }
            class72.field971[var12] = var14;
            String var17 = class72.field983[var12];
            if (class645.field8991 == 0) {
                int var18 = 16776960;
                if (class72.field985[var12] < 6) {
                    var18 = class204.field2645[class72.field985[var12]];
                }
                if (class72.field985[var12] == 6) {
                    var18 = class413.field5318 % 20 < 10 ? 16711680 : 16776960;
                }
                if (class72.field985[var12] == 7) {
                    var18 = (class413.field5318 % 20) >= 10 ? 65535 : 255;
                }
                if (class72.field985[var12] == 8) {
                    var18 = class413.field5318 % 20 < 10 ? 45056 : 8454016;
                }
                if (class72.field985[var12] == 9) {
                    int var19 = 150 - class72.field982[var12];
                    if (var19 < 50) {
                        var18 = var19 * 1280 + 16711680;
                    } else if (var19 < 100) {
                        var18 = 16776960 - (var19 - 50) * 327680;
                    } else if (var19 < 150) {
                        var18 = (var19 - 100) * 5 + 65280;
                    }
                }
                if (class72.field985[var12] == 10) {
                    int var20 = 150 - class72.field982[var12];
                    if (var20 < 50) {
                        var18 = (var20 * 5) + 16711680;
                    } else if (var20 < 100) {
                        var18 = 33095935 - var20 * 327680;
                    } else if (var20 < 150) {
                        var18 = (var20 * 327680) + 755 - (var20 * 5) - 32768000;
                    }
                }
                if (class72.field985[var12] == 11) {
                    int var21 = 150 - class72.field982[var12];
                    if (var21 < 50) {
                        var18 = 16777215 - var21 * 327685;
                    } else if (var21 < 100) {
                        var18 = (var21 - 50) * 327685 + 65280;
                    } else if (var21 < 150) {
                        var18 = 16777215 - ((var21 - 100) * 327680);
                    }
                }
                int var22 = var18 | 0xFF000000;
                if (class72.field988[var12] == 0) {
                    class456.field5983.method3249((byte) -103, var22, arg3 + var14, var17, arg5 + var13, -16777216);
                }
                if (class72.field988[var12] == 1) {
                    class456.field5983.method3241(arg3 + var14, var17, var22, -16777216, class413.field5318, arg5 + var13, (byte) -25);
                }
                if (class72.field988[var12] == 2) {
                    class456.field5983.method3240(arg4 ^ 0xFFFFFFF9, var17, var22, class413.field5318, arg3 + var14, arg5 - -var13, -16777216);
                }
                if (class72.field988[var12] == 3) {
                    class456.field5983.method3253(var22, 150 - class72.field982[var12], -16777216, arg5 + var13, class413.field5318, arg3 + var14, 18326, var17);
                }
                if (class72.field988[var12] == 4) {
                    int var23 = (150 - class72.field982[var12]) * (class411.field5305.method2900(true, var17) + 100) / 150;
                    class520.field6799.method339(arg5 + var13 - 50, arg3, arg5 + var13 + 50, arg3 + arg6);
                    class456.field5983.method3243(var17, arg5 + var13 + 50 - var23, arg3 - -var14, var22, -16777216, -24);
                    class520.field6799.method376(arg5, arg3, arg1 + arg5, arg3 + arg6);
                }
                if (class72.field988[var12] == 5) {
                    int var24 = 150 - class72.field982[var12];
                    int var25 = 0;
                    if (var24 < 25) {
                        var25 = var24 - 25;
                    } else if (var24 > 125) {
                        var25 = var24 - 125;
                    }
                    int var26 = class411.field5305.field7103 + class411.field5305.field7102;
                    class520.field6799.method339(arg5, var14 + arg3 - var26 - 1, arg1 + arg5, var14 + arg3 + 5);
                    class456.field5983.method3249((byte) 62, var22, arg3 + var14 + var25, var17, arg5 + var13, -16777216);
                    class520.field6799.method376(arg5, arg3, arg1 + arg5, arg3 + arg6);
                }
            } else {
                class456.field5983.method3249((byte) 46, -256, arg3 + var14, var17, arg5 + var13, -16777216);
            }
        }
    }

    @OriginalMember(owner = "client!ti", name = "read", descriptor = "()I", line = 617)
    public final int read() {
        field6476++;
        class122.method905(30000L, -6145);
        return -1;
    }
}
