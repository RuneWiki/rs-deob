import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class183 extends class51 {

    @OriginalMember(owner = "client!li", name = "H", descriptor = "[B")
    public byte[] field3123;

    @OriginalMember(owner = "client!li", name = "G", descriptor = "I")
    public static int field3122 = 0;

    @OriginalMember(owner = "client!li", name = "J", descriptor = "Lhi;")
    public static class82 field3124 = class95.method664((byte) -59, ",Mcran)2titre charg-B");

    @OriginalMember(owner = "client!li", name = "M", descriptor = "Lhi;")
    public static class82 field3127 = class95.method664((byte) -70, " )2> ");

    @OriginalMember(owner = "client!li", name = "E", descriptor = "I")
    public static int field3120;

    @OriginalMember(owner = "client!li", name = "F", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!li", name = "K", descriptor = "I")
    public static int field3125;

    @OriginalMember(owner = "client!li", name = "L", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "client!li", name = "N", descriptor = "I")
    public static int field3128;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I[Luk;)V", line = 3)
    public static final void method1269(int arg0, class108[] arg1) {
        class171.field2949[arg0] = arg1;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lwg;B)V", line = 8)
    public static final void method1270(class181 arg0, byte arg1) {
        field3128++;
        long var2 = 0L;
        int var4 = 0;
        if (arg1 < 67) {
            method1270((class181) null, (byte) 47);
        }
        int var5 = -1;
        int var6 = 0;
        if (arg0.field3095 == 0) {
            var2 = class317.method2173(arg0.field3093, arg0.field3085, arg0.field3087);
        }
        if (arg0.field3095 == 1) {
            var2 = class33.method258(arg0.field3093, arg0.field3085, arg0.field3087);
        }
        if (arg0.field3095 == 2) {
            var2 = class297.method2054(arg0.field3093, arg0.field3085, arg0.field3087);
        }
        if (arg0.field3095 == 3) {
            var2 = class262.method1870(arg0.field3093, arg0.field3085, arg0.field3087);
        }
        if (var2 != 0L) {
            var4 = (int) var2 >> 14 & 0x1F;
            var5 = Integer.MAX_VALUE & (int) (var2 >>> 32);
            var6 = (int) var2 >> 20 & 0x3;
        }
        arg0.field3084 = var6;
        arg0.field3081 = var5;
        arg0.field3089 = var4;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(BLeb;)V", line = 50)
    public static final void method1271(byte arg0, class275 arg1) {
        field3121++;
        for (class241 var2 = (class241) class131.field2276.method1936(16173); var2 != null; var2 = (class241) class131.field2276.method1926((byte) 90)) {
            if (var2.field4191 == arg1) {
                if (var2.field4181 != null) {
                    class219.field3803.method882(var2.field4181);
                    var2.field4181 = null;
                }
                var2.method961((byte) 92);
                return;
            }
        }
        if (arg0 > -126) {
            field3127 = (class82) null;
        }
    }

    @OriginalMember(owner = "client!li", name = "g", descriptor = "(I)V", line = 83)
    public static void method1272(int arg0) {
        field3127 = null;
        if (arg0 != -30885) {
            field3127 = (class82) null;
        }
        field3124 = null;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIBIII)V", line = 109)
    public static final void method1273(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field3126++;
        class283.field4748 = 0;
        for (int var7 = -1; var7 < class297.field5054 + class25.field333; var7++) {
            class93 var8;
            if (var7 == -1) {
                var8 = class168.field2932;
            } else if (var7 < class297.field5054) {
                var8 = class29.field405[class310.field5292[var7]];
            } else {
                var8 = class99.field1777[class43.field749[var7 - class297.field5054]];
            }
            if (var8 != null && var8.method516(0)) {
                if (var8 instanceof class275) {
                    class233 var9 = ((class275) var8).field4628;
                    if (var9.field4063 != null) {
                        var9 = var9.method1652(false);
                    }
                    if (var9 == null) {
                        continue;
                    }
                }
                if (class297.field5054 <= var7) {
                    class233 var10 = ((class275) var8).field4628;
                    if (var10.field4063 != null) {
                        var10 = var10.method1652(false);
                    }
                    if (var10.field4066 >= 0 && var10.field4066 < class259.field4430.length) {
                        int var11;
                        if (var10.field4026 == -1) {
                            var11 = var8.method652(false) + 15;
                        } else {
                            var11 = var10.field4026 + 15;
                        }
                        class123.method839(var11, var8, arg6, (byte) -17, arg1 >> 1, arg5, arg0 >> 1);
                        if (class34.field523 > -1) {
                            class259.field4430[var10.field4066].method600(arg4 + class34.field523 - 12, arg2 - (-class291.field4893 - -30));
                        }
                    }
                    class84[] var12 = class101.field1804;
                    for (int var13 = 0; var13 < var12.length; var13++) {
                        class84 var14 = var12[var13];
                        if (var14 != null && var14.field1506 == 1 && class43.field749[var7 - class297.field5054] == var14.field1494 && (class212.field3708 % 20) < 10) {
                            int var15;
                            if (var10.field4026 == -1) {
                                var15 = var8.method652(false) + 15;
                            } else {
                                var15 = var10.field4026 + 15;
                            }
                            class123.method839(var15, var8, arg6, (byte) -28, arg1 >> 1, arg5, arg0 >> 1);
                            if (class34.field523 > -1) {
                                class290.field4872[var14.field1516].method600(arg4 - (12 - class34.field523), class291.field4893 + -28 + arg2);
                            }
                        }
                    }
                } else {
                    int var16 = 30;
                    class81 var17 = (class81) var8;
                    if (var17.field1412 != -1 || var17.field1373 != -1) {
                        class123.method839(var8.method652(false) + 15, var8, arg6, (byte) -44, arg1 >> 1, arg5, arg0 >> 1);
                        if (class34.field523 > -1) {
                            if (var17.field1412 != -1) {
                                class44.field762[var17.field1412].method600(class34.field523 + arg4 - 12, class291.field4893 + arg2 + -var16);
                                var16 += 25;
                            }
                            if (var17.field1373 != -1) {
                                class259.field4430[var17.field1373].method600(class34.field523 + arg4 - 12, class291.field4893 + arg2 + -var16);
                                var16 += 25;
                            }
                        }
                    }
                    if (var7 >= 0) {
                        int var18 = 0;
                        class84[] var19 = class101.field1804;
                        while (var18 < var19.length) {
                            class84 var20 = var19[var18];
                            if (var20 != null && var20.field1506 == 10 && class310.field5292[var7] == var20.field1494) {
                                class123.method839(var8.method652(false) + 15, var8, arg6, (byte) -99, arg1 >> 1, arg5, arg0 >> 1);
                                if (class34.field523 > -1) {
                                    class290.field4872[var20.field1516].method600(class34.field523 + arg4 - 12, -var16 + arg2 + class291.field4893);
                                }
                            }
                            var18++;
                        }
                    }
                }
                if (var8.field1725 != null && (var7 >= class297.field5054 || class60.field943 == 0 || class60.field943 == 3 || class60.field943 == 1 && class245.method1756(((class81) var8).field1409, (byte) -104))) {
                    class123.method839(var8.method652(false), var8, arg6, (byte) -83, arg1 >> 1, arg5, arg0 >> 1);
                    if (class34.field523 > -1 && class191.field3211 > class283.field4748) {
                        class191.field3213[class283.field4748] = class253.field4354.method124(var8.field1725) / 2;
                        class191.field3217[class283.field4748] = class253.field4354.field192;
                        class191.field3209[class283.field4748] = class34.field523;
                        class191.field3208[class283.field4748] = class291.field4893;
                        class191.field3212[class283.field4748] = var8.field1686;
                        class191.field3216[class283.field4748] = var8.field1661;
                        class191.field3215[class283.field4748] = var8.field1698;
                        class191.field3206[class283.field4748] = var8.field1725;
                        class283.field4748++;
                    }
                }
                if (class212.field3708 < var8.field1666) {
                    class86 var21 = class166.field2908[0];
                    class86 var22 = class166.field2908[1];
                    int var23;
                    if ((var8 instanceof class275)) {
                        class275 var24 = (class275) var8;
                        class86[] var25 = (class86[]) ((class86[]) class150.field2553.method2175((long) var24.field4628.field4030, 3008));
                        if (var25 == null) {
                            var25 = class139.method945(64, 0, var24.field4628.field4030, class182.field3117);
                            if (var25 != null) {
                                class150.field2553.method2169(var25, (long) var24.field4628.field4030, (byte) 94);
                            }
                        }
                        if (var25 != null && var25.length == 2) {
                            var22 = var25[1];
                            var21 = var25[0];
                        }
                        class233 var26 = var24.field4628;
                        if (var26.field4026 == -1) {
                            var23 = var8.method652(false);
                        } else {
                            var23 = var26.field4026;
                        }
                    } else {
                        var23 = var8.method652(false);
                    }
                    class123.method839(var23 + var21.field1533 + 10, var8, arg6, (byte) -63, arg1 >> 1, arg5, arg0 >> 1);
                    if (class34.field523 > -1) {
                        int var27 = class34.field523 + arg4 - (var21.field1543 >> 1);
                        int var28 = arg2 + class291.field4893 - 3;
                        var21.method600(var27, var28);
                        int var29 = var8.field1712 * var21.field1543 / 255;
                        int var30 = var21.field1533;
                        if (class147.field2485) {
                            class116.method787(var27, var28, var27 + var29, var28 + var30);
                        } else {
                            class320.method2216(var27, var28, var27 + var29, var28 + var30);
                        }
                        var22.method600(var27, var28);
                        if (class147.field2485) {
                            class116.method789(arg4, arg2, arg4 + arg0, arg2 - -arg1);
                        } else {
                            class320.method2220(arg4, arg2, arg0 + arg4, arg1 + arg2);
                        }
                    }
                }
                for (int var31 = 0; var31 < 4; var31++) {
                    if (var8.field1724[var31] > class212.field3708) {
                        int var32;
                        if ((var8 instanceof class275)) {
                            class275 var33 = (class275) var8;
                            class233 var34 = var33.field4628;
                            if (var34.field4026 == -1) {
                                var32 = var8.method652(false) / 2;
                            } else {
                                var32 = var34.field4026 / 2;
                            }
                        } else {
                            var32 = var8.method652(false) / 2;
                        }
                        class123.method839(var32, var8, arg6, (byte) -27, arg1 >> 1, arg5, arg0 >> 1);
                        if (class34.field523 > -1) {
                            if (var31 == 1) {
                                class291.field4893 -= 20;
                            }
                            if (var31 == 2) {
                                class34.field523 -= 15;
                                class291.field4893 -= 10;
                            }
                            if (var31 == 3) {
                                class34.field523 += 15;
                                class291.field4893 -= 10;
                            }
                            class99.field1779[var8.field1718[var31]].method600(class34.field523 + arg4 - 12, class291.field4893 + arg2 + -12);
                            class21.field283.method120(class327.method2240((byte) -74, var8.field1693[var31]), class34.field523 + arg4 - 1, class291.field4893 + arg2 - -3, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var35 = 0; var35 < class283.field4748; var35++) {
            int var36 = class191.field3209[var35];
            int var37 = class191.field3208[var35];
            int var38 = class191.field3213[var35];
            int var39 = class191.field3217[var35];
            boolean var40 = true;
            while (var40) {
                var40 = false;
                for (int var41 = 0; var41 < var35; var41++) {
                    if (var37 + 2 > class191.field3208[var41] + -class191.field3217[var41] && (class191.field3208[var41] + 2) > (var37 - var39) && (var36 - var38) < (class191.field3213[var41] + class191.field3209[var41]) && var36 + var38 > class191.field3209[var41] - class191.field3213[var41] && var37 > (class191.field3208[var41] - class191.field3217[var41])) {
                        var40 = true;
                        var37 = class191.field3208[var41] - class191.field3217[var41];
                    }
                }
            }
            class34.field523 = class191.field3209[var35];
            class291.field4893 = class191.field3208[var35] = var37;
            class82 var42 = class191.field3206[var35];
            if (class165.field2890 == 0) {
                int var43 = 16776960;
                if (class191.field3212[var35] < 6) {
                    var43 = class77.field1311[class191.field3212[var35]];
                }
                if (class191.field3212[var35] == 6) {
                    var43 = (class47.field789 % 20) >= 10 ? 16776960 : 16711680;
                }
                if (class191.field3212[var35] == 7) {
                    var43 = (class47.field789 % 20) >= 10 ? 65535 : 255;
                }
                if (class191.field3212[var35] == 8) {
                    var43 = (class47.field789 % 20) >= 10 ? 8454016 : 45056;
                }
                if (class191.field3212[var35] == 9) {
                    int var44 = 150 - class191.field3215[var35];
                    if (var44 < 50) {
                        var43 = (var44 * 1280) + 16711680;
                    } else if (var44 < 100) {
                        var43 = 16776960 - ((var44 - 50) * 327680);
                    } else if (var44 < 150) {
                        var43 = var44 * 5 + 65280 - 500;
                    }
                }
                if (class191.field3212[var35] == 10) {
                    int var45 = 150 - class191.field3215[var35];
                    if (var45 < 50) {
                        var43 = var45 * 5 + 16711680;
                    } else if (var45 < 100) {
                        var43 = 16711935 - ((var45 - 50) * 327680);
                    } else if (var45 < 150) {
                        var43 = (var45 - 100) * 327680 + 255 - (var45 + -100) * 5;
                    }
                }
                if (class191.field3212[var35] == 11) {
                    int var46 = 150 - class191.field3215[var35];
                    if (var46 < 50) {
                        var43 = 16777215 - (var46 * 327685);
                    } else if (var46 < 100) {
                        var43 = (var46 - 50) * 327685 + 65280;
                    } else if (var46 < 150) {
                        var43 = 16777215 - (var46 - 100) * 327680;
                    }
                }
                if (class191.field3216[var35] == 0) {
                    class253.field4354.method120(var42, class34.field523 + arg4, class291.field4893 + arg2, var43, 0);
                }
                if (class191.field3216[var35] == 1) {
                    class253.field4354.method116(var42, class34.field523 + arg4, class291.field4893 + arg2, var43, 0, class47.field789);
                }
                if (class191.field3216[var35] == 2) {
                    class253.field4354.method115(var42, class34.field523 + arg4, class291.field4893 + arg2, var43, 0, class47.field789);
                }
                if (class191.field3216[var35] == 3) {
                    class253.field4354.method127(var42, class34.field523 + arg4, class291.field4893 + arg2, var43, 0, class47.field789, 150 - class191.field3215[var35]);
                }
                if (class191.field3216[var35] == 4) {
                    int var47 = (150 - class191.field3215[var35]) * (class253.field4354.method124(var42) + 100) / 150;
                    if (class147.field2485) {
                        class116.method787(class34.field523 + arg4 - 50, arg2, arg4 + class34.field523 + 50, arg1 + arg2);
                    } else {
                        class320.method2216(class34.field523 + arg4 - 50, arg2, class34.field523 + arg4 + 50, arg1 + arg2);
                    }
                    class253.field4354.method112(var42, arg4 - (var47 - class34.field523 - 50), class291.field4893 + arg2, var43, 0);
                    if (class147.field2485) {
                        class116.method789(arg4, arg2, arg0 + arg4, arg1 + arg2);
                    } else {
                        class320.method2220(arg4, arg2, arg0 + arg4, arg2 - -arg1);
                    }
                }
                if (class191.field3216[var35] == 5) {
                    int var48 = 150 - class191.field3215[var35];
                    if (class147.field2485) {
                        class116.method787(arg4, arg2 + class291.field4893 - (class253.field4354.field192 + 1), arg0 + arg4, class291.field4893 + arg2 + 5);
                    } else {
                        class320.method2216(arg4, class291.field4893 + arg2 - class253.field4354.field192 - 1, arg4 - -arg0, class291.field4893 + arg2 + 5);
                    }
                    int var49 = 0;
                    if (var48 < 25) {
                        var49 = var48 - 25;
                    } else if (var48 > 125) {
                        var49 = var48 - 125;
                    }
                    class253.field4354.method120(var42, class34.field523 + arg4, class291.field4893 + var49 + arg2, var43, 0);
                    if (class147.field2485) {
                        class116.method789(arg4, arg2, arg0 + arg4, arg1 + arg2);
                    } else {
                        class320.method2220(arg4, arg2, arg4 + arg0, arg2 - -arg1);
                    }
                }
            } else {
                class253.field4354.method120(var42, class34.field523 + arg4, class291.field4893 + arg2, 16776960, 0);
            }
        }
        if (arg3 <= 43) {
            method1270((class181) null, (byte) -19);
        }
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "([B)V", line = 591)
    public class183(byte[] arg0) {
        this.field3123 = arg0;
    }
}
