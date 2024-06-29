import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tia")
public class class266 extends Exception {

    @OriginalMember(owner = "client!tia", name = "d", descriptor = "[Lq;")
    public static class426[] field3307 = new class426[128];

    @OriginalMember(owner = "client!tia", name = "f", descriptor = "Ltp;")
    public static class532 field3309 = null;

    @OriginalMember(owner = "client!tia", name = "c", descriptor = "[C")
    private static char[] field3306 = new char[64];

    @OriginalMember(owner = "client!tia", name = "b", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!tia", name = "e", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "Loh;")
    public static class404 field3304;

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field3306[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field3306[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field3306[var2] = (char) (var2 - 4);
        }
        field3306[62] = '*';
        field3306[63] = '-';
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(I)V", line = 11)
    public static void method1599(int arg0) {
        field3309 = null;
        if (arg0 == 31975) {
            field3307 = null;
            field3304 = null;
            field3306 = null;
        }
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(IIIIIBI)V", line = 27)
    public static final void method1600(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field3305++;
        int var7 = class585.field8256;
        class360.field4622 = 0;
        int[] var8 = class399.field5459;
        for (int var9 = 0; var9 < var7 + class302.field3784; var9++) {
            class326 var37 = null;
            class504 var38;
            if (var9 >= var7) {
                var38 = ((class151) class253.field3052.method1754(false, (long) class272.field3359[var9 - var7])).field1661;
                var37 = ((class197) var38).field2293;
                if (var37.field4199 != null) {
                    var37 = var37.method1939(true, class722.field10125);
                    if (var37 == null) {
                        continue;
                    }
                }
            } else {
                var38 = class75.field792[var8[var9]];
            }
            if (var38.field7123 >= 0 && (class188.field2231 == var38.field7077 || class90.field937.field4628 == var38.field4628)) {
                class275.method1625(arg1, arg4 >> 1, var38, arg6 >> 1, arg2, false, var38.method1181((byte) 39));
                if (class595.field8399[0] >= 0) {
                    if (var38.field7125 != null && (var7 <= var9 || class740.field10346 == 0 || class740.field10346 == 3 || class740.field10346 == 1 && class177.method1095(((class183) var38).field2157, -32705)) && class112.field1175 > class360.field4622) {
                        class112.field1181[class360.field4622] = class96.field1014.method3137((byte) -54, var38.field7125) / 2;
                        class112.field1176[class360.field4622] = class595.field8399[0];
                        class112.field1187[class360.field4622] = class595.field8399[1];
                        class112.field1186[class360.field4622] = var38.field7163;
                        class112.field1178[class360.field4622] = var38.field7165;
                        class112.field1184[class360.field4622] = var38.field7079;
                        class112.field1189[class360.field4622] = var38.field7125;
                        class360.field4622++;
                    }
                    int var39 = class595.field8399[1] + arg0;
                    int var50;
                    if (var38.field7108 || var38.field7180 <= class392.field5398) {
                        var50 = var39 - Math.max(class96.field1014.field7741, class198.field2334[0].method509());
                    } else {
                        boolean var40 = true;
                        byte var41 = 1;
                        int var43;
                        if (var7 > var9) {
                            class183 var42 = class75.field792[var8[var9]];
                            var43 = var38.method2992(-1).field3113;
                            if (var42.field2176) {
                                var41 = 2;
                            }
                        } else {
                            var43 = var37.field4170;
                            if (var43 == -1) {
                                var43 = var38.method2992(-1).field3113;
                            }
                        }
                        class131[] var44 = class198.field2334;
                        if (var43 != -1) {
                            class131[] var45 = (class131[]) class560.field7991.method3538((long) var43, 0);
                            if (var45 == null) {
                                class155[] var46 = class155.method958(class394.field5410, var43, 0);
                                if (var46 != null) {
                                    var45 = new class131[var46.length];
                                    for (int var47 = 0; var47 < var46.length; var47++) {
                                        var45[var47] = class275.field3370.method434(var46[var47], true);
                                    }
                                    class560.field7991.method3537(-94, (long) var43, var45);
                                }
                            }
                            if (var45 != null && var45.length >= 2) {
                                var44 = var45;
                            }
                        }
                        if (var44.length <= var41) {
                            var41 = 1;
                        }
                        class131 var48 = var44[0];
                        class131 var49 = var44[var41];
                        var50 = var39 - Math.max(class96.field1014.field7741, var48.method509());
                        int var51 = class595.field8399[0] + arg3 - (var48.method503() >> 1);
                        int var52 = var48.method503() * var38.field7078 / 255;
                        int var53 = var48.method509();
                        if (var38.field7078 > 0 && var52 < 2) {
                            var52 = 2;
                        }
                        var48.method824(var51, var50);
                        class275.field3370.method438(var51, var50, var51 + var52, var50 + var53);
                        var49.method824(var51, var50);
                        class275.field3370.method432(arg3, arg0, arg3 + arg6, arg0 + arg4);
                        class16.method75(var50, (byte) 117, var50 + var53, var51, var48.method501() + var51);
                    }
                    var50 -= 2;
                    if (!var38.field7108) {
                        if (var38.field7171 > class392.field5398) {
                            class131 var54 = class163.field1825[var38.field7114 ? 2 : 0];
                            class131 var55 = class163.field1825[var38.field7114 ? 3 : 1];
                            boolean var56 = true;
                            int var57;
                            if (var38 instanceof class197) {
                                var57 = var37.field4162;
                                if (var57 == -1) {
                                    var57 = var38.method2992(-1).field3092;
                                }
                            } else {
                                var57 = var38.method2992(-1).field3092;
                            }
                            if (var57 != -1) {
                                class131[] var58 = (class131[]) class592.field8346.method3538((long) var57, 0);
                                if (var58 == null) {
                                    class155[] var59 = class155.method958(class394.field5410, var57, 0);
                                    if (var59 != null) {
                                        var58 = new class131[var59.length];
                                        for (int var60 = 0; var60 < var59.length; var60++) {
                                            var58[var60] = class275.field3370.method434(var59[var60], true);
                                        }
                                        class592.field8346.method3537(73, (long) var57, var58);
                                    }
                                }
                                if (var58 != null && var58.length == 4) {
                                    var55 = var58[var38.field7114 ? 3 : 1];
                                    var54 = var58[var38.field7114 ? 2 : 0];
                                }
                            }
                            int var61 = var38.field7171 - class392.field5398;
                            int var62;
                            if (var38.field7174 >= var61) {
                                var62 = var54.method503();
                            } else {
                                int var63 = var61 - var38.field7174;
                                int var64 = var38.field7128 == 0 ? 0 : (var38.field7113 - var63) / var38.field7128 * var38.field7128;
                                var62 = var54.method503() * var64 / var38.field7113;
                            }
                            int var65 = var54.method509();
                            var50 -= var65;
                            int var66 = arg3 - ((var54.method503() >> 1) - class595.field8399[0]);
                            var54.method824(var66, var50);
                            class275.field3370.method438(var66, var50, var62 + var66, var50 + var65);
                            var55.method824(var66, var50);
                            class275.field3370.method432(arg3, arg0, arg3 + arg6, arg0 + arg4);
                            class16.method75(var50, (byte) -127, var50 + var65, var66, var54.method501() + var66);
                            var50 -= 2;
                        }
                        if (var9 < var7) {
                            class183 var67 = (class183) var38;
                            if (var67.field2183 != -1) {
                                var50 -= 25;
                                class131 var68 = class485.field6896[var67.field2183];
                                var68.method824(arg3 + class595.field8399[0] - 12, var50);
                                class16.method75(var50, (byte) -121, var68.method510() + var50, class595.field8399[0] + arg3 - 12, class595.field8399[0] + arg3 + var68.method501() - 12);
                                var50 -= 2;
                            }
                            if (var67.field2181 != -1) {
                                var50 -= 25;
                                class131 var69 = class153.field1689[var67.field2181];
                                var69.method824(arg3 + class595.field8399[0] - 12, var50);
                                class16.method75(var50, (byte) 78, var69.method510() + var50, arg3 - 12 + class595.field8399[0], arg3 + class595.field8399[0] + var69.method501() - 12);
                                var50 -= 2;
                            }
                        } else if (var37.field4153 >= 0 && class153.field1689.length > var37.field4153) {
                            class131 var70 = class153.field1689[var37.field4153];
                            var50 -= 25;
                            var70.method824(class595.field8399[0] + arg3 - (var70.method503() >> 1), var50);
                            class16.method75(var50, (byte) 11, var50 + var70.method510(), class595.field8399[0] + arg3 + -(var70.method503() >> 1), class595.field8399[0] + arg3 - (var70.method503() >> 1) + var70.method501());
                            var50 -= 2;
                        }
                    }
                    int var10000;
                    if (!var38 instanceof class183) {
                        int var77 = 0;
                        class210[] var78 = class115.field1203;
                        for (int var79 = 0; var79 < var78.length; var79++) {
                            class210 var84 = var78[var79];
                            if (var84 != null && var84.field2471 == 1 && class272.field3359[var9 - var7] == var84.field2481) {
                                class131 var85 = class255.field3121[var84.field2480];
                                if (var85.method509() > var77) {
                                    var77 = var85.method509();
                                }
                                if ((class392.field5398 % 20) < 10) {
                                    var85.method824(class595.field8399[0] + arg3 - 12, -var85.method509() + var50);
                                    class16.method75(var50 - var85.method509(), (byte) 97, var50 - var85.method509() + var85.method510(), class595.field8399[0] + -12 + arg3, class595.field8399[0] + arg3 + var85.method501() - 12);
                                }
                            }
                        }
                        if (var77 > 0) {
                            var10000 = var50 - (var77 + 2);
                        }
                    } else if (var9 >= 0) {
                        int var71 = 0;
                        class210[] var72 = class115.field1203;
                        for (int var73 = 0; var73 < var72.length; var73++) {
                            class210 var75 = var72[var73];
                            if (var75 != null && var75.field2471 == 10 && var8[var9] == var75.field2481) {
                                class131 var76 = class255.field3121[var75.field2480];
                                if (var71 < var76.method509()) {
                                    var71 = var76.method509();
                                }
                                var76.method824(class595.field8399[0] + arg3 - 12, var50 + -var76.method509());
                                class16.method75(var50 - var76.method509(), (byte) 48, var50 - var76.method509() + var76.method510(), arg3 - 12 + class595.field8399[0], class595.field8399[0] + (arg3 - -var76.method501()) - 12);
                            }
                        }
                        if (var71 > 0) {
                            var10000 = var50 - (var71 + 2);
                        }
                    }
                    for (int var81 = 0; var81 < 4; var81++) {
                        if (var38.field7095[var81] > class392.field5398) {
                            int var82 = var38.method1181((byte) -120) / 2;
                            class275.method1625(arg1, arg4 >> 1, var38, arg6 >> 1, arg2, false, var82);
                            if (class595.field8399[0] > -1) {
                                int var83 = class675.field9562[var38.field7076[var81]].method503();
                                if (var81 == 1) {
                                    class595.field8399[1] -= 20;
                                }
                                if (var81 == 2) {
                                    class595.field8399[1] -= 10;
                                    class595.field8399[0] -= var83 - 9;
                                }
                                if (var81 == 3) {
                                    class595.field8399[0] += var83 - 9;
                                    class595.field8399[1] -= 10;
                                }
                                class675.field9562[var38.field7076[var81]].method824(class595.field8399[0] + arg3 - (var83 >> 1), arg0 - -class595.field8399[1] + -12);
                                class322.field4116.method450(0, -1, 0, Integer.toString(var38.field7110[var81]), class595.field8399[0] + arg3 - 1, class595.field8399[1] + arg0 + 3);
                            }
                        }
                    }
                }
            }
        }
        for (int var10 = 0; var10 < class709.field9996; var10++) {
            int var33 = class370.field4741[var10];
            class504 var34;
            if (var33 >= 2048) {
                var34 = ((class151) class253.field3052.method1754(false, (long) (var33 - 2048))).field1661;
            } else {
                var34 = class75.field792[var33];
            }
            int var35 = class748.field10429[var10];
            class504 var36;
            if (var35 < 2048) {
                var36 = class75.field792[var35];
            } else {
                var36 = ((class151) class253.field3052.method1754(false, (long) (var35 - 2048))).field1661;
            }
            class260.method1552(arg6, 18, arg2, arg3, arg0, var34, arg4, var36, arg1, --var34.field7097);
        }
        if (arg5 > -57) {
            method1599(-39);
        }
        int var11 = class96.field1014.field7741 + class96.field1014.field7728 + 2;
        for (int var12 = 0; var12 < class360.field4622; var12++) {
            int var13 = class112.field1176[var12];
            int var14 = class112.field1187[var12];
            int var15 = class112.field1181[var12];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var32 = 0; var32 < var12; var32++) {
                    if ((class112.field1187[var32] - var11) < (var14 + 2) && (var14 - var11) < (class112.field1187[var32] + 2) && (var13 - var15) < (class112.field1181[var32] + class112.field1176[var32]) && class112.field1176[var32] - class112.field1181[var32] < var13 + var15 && var14 > (class112.field1187[var32] - var11)) {
                        var14 = class112.field1187[var32] - var11;
                        var16 = true;
                    }
                }
            }
            class112.field1187[var12] = var14;
            String var17 = class112.field1189[var12];
            int var18 = class96.field1014.method3137((byte) -54, var17);
            int var19 = arg3 + var13;
            int var20 = arg0 + var14 - class96.field1014.field7741;
            int var21 = var18 + var19;
            int var22 = class96.field1014.field7728 + var14 + arg0;
            if (class198.field2318 == 0) {
                int var23 = 16776960;
                if (class112.field1186[var12] < 6) {
                    var23 = class168.field1875[class112.field1186[var12]];
                }
                if (class112.field1186[var12] == 6) {
                    var23 = (class188.field2231 % 20) < 10 ? 16711680 : 16776960;
                }
                if (class112.field1186[var12] == 7) {
                    var23 = (class188.field2231 % 20) >= 10 ? 65535 : 255;
                }
                if (class112.field1186[var12] == 8) {
                    var23 = class188.field2231 % 20 < 10 ? 45056 : 8454016;
                }
                if (class112.field1186[var12] == 9) {
                    int var24 = 150 - class112.field1184[var12];
                    if (var24 < 50) {
                        var23 = var24 * 1280 + 16711680;
                    } else if (var24 < 100) {
                        var23 = 16384000 + 16776960 - (var24 * 327680);
                    } else if (var24 < 150) {
                        var23 = (var24 - 100) * 5 + 65280;
                    }
                }
                if (class112.field1186[var12] == 10) {
                    int var25 = 150 - class112.field1184[var12];
                    if (var25 < 50) {
                        var23 = (var25 * 5) + 16711680;
                    } else if (var25 < 100) {
                        var23 = 16384000 + 16711935 - var25 * 327680;
                    } else if (var25 < 150) {
                        var23 = var25 * 327680 - (((var25 - 100) * 5) + 32767745);
                    }
                }
                if (class112.field1186[var12] == 11) {
                    int var26 = 150 - class112.field1184[var12];
                    if (var26 < 50) {
                        var23 = 16777215 - (var26 * 327685);
                    } else if (var26 < 100) {
                        var23 = var26 * 327685 + 65280 - 16384250;
                    } else if (var26 < 150) {
                        var23 = 49545215 - var26 * 327680;
                    }
                }
                int var27 = var23 | 0xFF000000;
                if (class112.field1178[var12] == 0) {
                    var21 -= var18 >> 1;
                    class567.field8070.method450(-16777216, var27, 0, var17, arg3 + var13, arg0 - -var14);
                    var19 -= var18 >> 1;
                }
                if (class112.field1178[var12] == 1) {
                    var22 += 5;
                    var20 -= 5;
                    class567.field8070.method443((byte) -76, -16777216, arg0 + var14, var17, class188.field2231, var27, arg3 + var13);
                    var19 -= var18 >> 1;
                    var21 -= var18 >> 1;
                }
                if (class112.field1178[var12] == 2) {
                    var22 += 5;
                    var19 -= (var18 >> 1) + 5;
                    var20 -= 5;
                    var21 -= (var18 >> 1) - 5;
                    class567.field8070.method454(5, class188.field2231, arg3 + var13, -16777216, var27, var17, arg0 + var14);
                }
                if (class112.field1178[var12] == 3) {
                    class567.field8070.method458(true, -16777216, arg3 + var13, var27, 150 - class112.field1184[var12], arg0 + var14, class188.field2231, var17);
                    var22 += 7;
                    var19 -= var18 >> 1;
                    var21 -= var18 >> 1;
                    var20 -= 7;
                }
                if (class112.field1178[var12] == 4) {
                    int var28 = (150 - class112.field1184[var12]) * (class96.field1014.method3137((byte) -54, var17) + 100) / 150;
                    class275.field3370.method438(arg3 + var13 - 50, arg0, var13 + arg3 + 50, arg0 - -arg4);
                    var21 += 50 - var28;
                    var19 += 50 - var28;
                    class567.field8070.method442(var13 + arg3 + 50 - var28, -16777216, arg0 + var14, var27, var17, 0);
                    class275.field3370.method432(arg3, arg0, arg3 + arg6, arg0 + arg4);
                }
                if (class112.field1178[var12] == 5) {
                    int var29 = 150 - class112.field1184[var12];
                    int var30 = 0;
                    if (var29 < 25) {
                        var30 = var29 - 25;
                    } else if (var29 > 125) {
                        var30 = var29 - 125;
                    }
                    int var31 = class96.field1014.field7741 + class96.field1014.field7728;
                    class275.field3370.method438(arg3, var14 + arg0 - var31 - 1, arg3 + arg6, var14 + arg0 + 5);
                    var20 += var30;
                    var19 -= var18 >> 1;
                    class567.field8070.method450(-16777216, var27, 0, var17, arg3 + var13, arg0 + var30 + var14);
                    var22 += var30;
                    var21 -= var18 >> 1;
                    class275.field3370.method432(arg3, arg0, arg3 + arg6, arg0 + arg4);
                }
            } else {
                class567.field8070.method450(-16777216, -256, 0, var17, arg3 + var13, arg0 + var14);
                var21 -= var18 >> 1;
                var19 -= var18 >> 1;
            }
            class16.method75(var20, (byte) 125, var22 + 1, var19, var21 + 1);
        }
    }
}
