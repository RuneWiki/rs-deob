import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class495 extends class170 {

    @OriginalMember(owner = "client!jm", name = "i", descriptor = "I")
    private int field7163;

    @OriginalMember(owner = "client!jm", name = "p", descriptor = "I")
    private int field7170;

    @OriginalMember(owner = "client!jm", name = "h", descriptor = "I")
    private int field7162;

    @OriginalMember(owner = "client!jm", name = "l", descriptor = "I")
    private int field7166;

    @OriginalMember(owner = "client!jm", name = "n", descriptor = "I")
    public static int field7168 = 0;

    @OriginalMember(owner = "client!jm", name = "q", descriptor = "Lqt;")
    public static class459 field7171 = new class459(25, 8);

    @OriginalMember(owner = "client!jm", name = "j", descriptor = "I")
    public static int field7164;

    @OriginalMember(owner = "client!jm", name = "k", descriptor = "I")
    public static int field7165;

    @OriginalMember(owner = "client!jm", name = "m", descriptor = "I")
    public static int field7167;

    @OriginalMember(owner = "client!jm", name = "o", descriptor = "I")
    public static int field7169;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2906(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field7167;
        int var7 = class452.field6603;
        class203.field3132 = 0;
        int[] var8 = class532.field7853;
        if (arg4 != -16777216) {
            method2907(118);
        }
        for (int var9 = 0; ~var9 > ~(class477.field6952 + var7); ++var9) {
            class311 var32 = null;
            class23 var33;
            if (var7 <= var9) {
                var33 = ((class193) class390.field5539.method2284(true, (long) class483.field7012[-var7 + var9])).field2805;
                var32 = ((class279) var33).field4157;
                if (var32.field4631 != null) {
                    var32 = var32.method1972(class84.field1335, (byte) 109);
                    if (var32 == null) {
                        continue;
                    }
                }
            } else {
                var33 = class494.field7143[var8[var9]];
            }
            if (~var33.field285 <= -1 && (~class110.field1635 == ~var33.field235 || class364.field5293.field6956 == var33.field6956)) {
                class316.method1999(arg5 >> 1, 0, var33, var33.method140((byte) -106), arg1, arg2 >> 1, arg6);
                if (class452.field6599[0] >= 0) {
                    if (var33.field239 != null && (~var7 >= ~var9 || ~class414.field5868 == -1 || class414.field5868 == 3 || class414.field5868 == 1 && class375.method2288((byte) 95, ((class510) var33).field7363)) && class342.field5058 > class203.field3132) {
                        class342.field5059[class203.field3132] = class425.field6028.method875(var33.field239, (byte) 5) / 2;
                        class342.field5055[class203.field3132] = class452.field6599[0];
                        class342.field5057[class203.field3132] = class452.field6599[1];
                        class342.field5060[class203.field3132] = var33.field249;
                        class342.field5061[class203.field3132] = var33.field312;
                        class342.field5056[class203.field3132] = var33.field306;
                        class342.field5054[class203.field3132] = var33.field239;
                        ++class203.field3132;
                    }
                    int var34 = class452.field6599[1] + arg3;
                    int var45;
                    if (!var33.field298 && var33.field319 > class24.field349) {
                        boolean var35 = true;
                        byte var36 = 1;
                        int var38;
                        if (~var9 > ~var7) {
                            class510 var37 = class494.field7143[var8[var9]];
                            var38 = var33.method139((byte) -52).field3534;
                            if (var37.field7375) {
                                var36 = 2;
                            }
                        } else {
                            var38 = var32.field4615;
                            if (var38 == -1) {
                                var38 = var33.method139((byte) -57).field3534;
                            }
                        }
                        class343[] var39 = class156.field2391;
                        if (var38 != -1) {
                            class343[] var40 = (class343[]) class52.field962.method2982(0, (long) var38);
                            if (var40 == null) {
                                class104[] var41 = class104.method760(class96.field1527, var38, 0);
                                if (var41 != null) {
                                    var40 = new class343[var41.length];
                                    for (int var42 = 0; var41.length > var42; ++var42) {
                                        var40[var42] = class76.field1256.method308(var41[var42], true);
                                    }
                                    class52.field962.method2981(var40, 125, (long) var38);
                                }
                            }
                            if (var40 != null && var40.length >= 2) {
                                var39 = var40;
                            }
                        }
                        if (~var36 <= ~var39.length) {
                            var36 = 1;
                        }
                        class343 var43 = var39[0];
                        class343 var44 = var39[var36];
                        var45 = var34 - Math.max(class425.field6028.field1854, var43.method367());
                        int var46 = class452.field6599[0] + arg0 - (var43.method378() >> 1);
                        int var47 = var43.method378() * var33.field241 / 255;
                        if (~var33.field241 < -1 && ~var47 > -3) {
                            var47 = 2;
                        }
                        var43.method2175(var46, var45);
                        class76.field1256.method185(var46, var45, var46 + var47, var43.method367() + var45);
                        var44.method2175(var46, var45);
                        class76.field1256.method345(arg0, arg3, arg0 + arg2, arg3 + arg5);
                    } else {
                        var45 = var34 - Math.max(class425.field6028.field1854, class156.field2391[0].method367());
                    }
                    var45 -= 2;
                    if (!var33.field298) {
                        if (var33.field310 > class24.field349) {
                            class343 var48 = class189.field2776[var33.field272 ? 2 : 0];
                            class343 var49 = class189.field2776[!var33.field272 ? 1 : 3];
                            boolean var50 = true;
                            int var51;
                            if (var33 instanceof class279) {
                                var51 = var32.field4652;
                                if (~var51 == 0) {
                                    var51 = var33.method139((byte) -51).field3526;
                                }
                            } else {
                                var51 = var33.method139((byte) -126).field3526;
                            }
                            if (~var51 != 0) {
                                class343[] var52 = (class343[]) class152.field2322.method2982(0, (long) var51);
                                if (var52 == null) {
                                    class104[] var53 = class104.method760(class96.field1527, var51, 0);
                                    if (var53 != null) {
                                        var52 = new class343[var53.length];
                                        for (int var54 = 0; var54 < var53.length; ++var54) {
                                            var52[var54] = class76.field1256.method308(var53[var54], true);
                                        }
                                        class152.field2322.method2981(var52, arg4 ^ -16777185, (long) var51);
                                    }
                                }
                                if (var52 != null && ~var52.length == -5) {
                                    var49 = var52[!var33.field272 ? 1 : 3];
                                    var48 = var52[var33.field272 ? 2 : 0];
                                }
                            }
                            int var55 = -class24.field349 + var33.field310;
                            int var56;
                            if (var33.field291 >= var55) {
                                var56 = var48.method378();
                            } else {
                                int var57 = var55 - var33.field291;
                                int var58 = var33.field263 == 0 ? 0 : (-var57 + var33.field304) / var33.field263 * var33.field263;
                                var56 = var58 * var48.method378() / var33.field304;
                            }
                            int var59 = var48.method367();
                            var45 -= var59;
                            int var60 = arg0 - (-class452.field6599[0] - -(var48.method378() >> 1));
                            var48.method2175(var60, var45);
                            class76.field1256.method185(var60, var45, var56 + var60, var45 + var59);
                            var49.method2175(var60, var45);
                            class76.field1256.method345(arg0, arg3, arg0 + arg2, arg3 + arg5);
                            var45 -= 2;
                        }
                        if (var9 >= var7) {
                            if (~var32.field4603 <= -1 && var32.field4603 < class368.field5317.length) {
                                class343 var61 = class368.field5317[var32.field4603];
                                var45 -= 25;
                                var61.method2175(arg0 - -class452.field6599[0] - (var61.method378() >> 1), var45);
                                var45 -= 2;
                            }
                        } else {
                            class510 var62 = (class510) var33;
                            if (var62.field7370 != -1) {
                                var45 -= 25;
                                class355.field5178[var62.field7370].method2175(arg0 + -12 + class452.field6599[0], var45);
                                var45 -= 2;
                            }
                            if (~var62.field7402 != 0) {
                                var45 -= 25;
                                class368.field5317[var62.field7402].method2175(class452.field6599[0] - 12 + arg0, var45);
                                var45 -= 2;
                            }
                        }
                    }
                    int var10000;
                    if (var33 instanceof class510) {
                        if (var9 >= 0) {
                            int var63 = 0;
                            class3[] var64 = class356.field5182;
                            for (int var65 = 0; var64.length > var65; ++var65) {
                                class3 var67 = var64[var65];
                                if (var67 != null && ~var67.field17 == -11 && ~var8[var9] == ~var67.field8) {
                                    class343 var68 = class288.field4263[var67.field12];
                                    if (var63 < var68.method367()) {
                                        var63 = var68.method367();
                                    }
                                    var68.method2175(class452.field6599[0] + -12 + arg0, -var68.method367() + var45);
                                }
                            }
                            if (~var63 < -1) {
                                var10000 = var45 - (var63 - -2);
                            }
                        }
                    } else {
                        int var69 = 0;
                        class3[] var70 = class356.field5182;
                        for (int var71 = 0; var70.length > var71; ++var71) {
                            class3 var76 = var70[var71];
                            if (var76 != null && var76.field17 == 1 && class483.field7012[-var7 + var9] == var76.field8) {
                                class343 var77 = class288.field4263[var76.field12];
                                if (~var77.method367() < ~var69) {
                                    var69 = var77.method367();
                                }
                                if (class24.field349 % 20 < 10) {
                                    var77.method2175(arg0 - -class452.field6599[0] + -12, var45 - var77.method367());
                                }
                            }
                        }
                        if (~var69 < -1) {
                            var10000 = var45 - (var69 - -2);
                        }
                    }
                    for (int var73 = 0; var73 < 4; ++var73) {
                        if (class24.field349 < var33.field303[var73]) {
                            int var74 = var33.method140((byte) -119) / 2;
                            class316.method1999(arg5 >> 1, 0, var33, var74, arg1, arg2 >> 1, arg6);
                            if (~class452.field6599[0] < 0) {
                                int var75 = class330.field4895[var33.field288[var73]].method378();
                                if (~var73 == -2) {
                                    class452.field6599[1] -= 20;
                                }
                                if (~var73 == -3) {
                                    class452.field6599[0] -= var75 - 9;
                                    class452.field6599[1] -= 10;
                                }
                                if (var73 == 3) {
                                    class452.field6599[1] -= 10;
                                    class452.field6599[0] += var75 + -9;
                                }
                                class330.field4895[var33.field288[var73]].method2175(arg0 - -class452.field6599[0] + -(var75 >> 1), arg3 - (-class452.field6599[1] + 12));
                                class521.field7593.method1746(false, -1, class452.field6599[0] + arg0 + -1, arg3 - -class452.field6599[1] - -3, Integer.toString(var33.field282[var73]), 0);
                            }
                        }
                    }
                }
            }
        }
        for (int var10 = 0; ~class170.field2535 < ~var10; ++var10) {
            int var28 = class149.field2284[var10];
            class23 var29;
            if (~var28 > -2049) {
                var29 = class494.field7143[var28];
            } else {
                var29 = ((class193) class390.field5539.method2284(true, (long) (var28 + -2048))).field2805;
            }
            int var30 = class229.field3439[var10];
            class23 var31;
            if (~var30 > -2049) {
                var31 = class494.field7143[var30];
            } else {
                var31 = ((class193) class390.field5539.method2284(true, (long) (var30 + -2048))).field2805;
            }
            client.method1380(arg6, arg3, arg1, arg2, --var29.field323, arg0, false, var31, arg5, var29);
        }
        int var11 = class425.field6028.field1863 + class425.field6028.field1854 + 2;
        for (int var12 = 0; ~class203.field3132 < ~var12; ++var12) {
            int var13 = class342.field5055[var12];
            int var14 = class342.field5057[var12];
            int var15 = class342.field5059[var12];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var27 = 0; ~var27 > ~var12; ++var27) {
                    if (~(class342.field5057[var27] + -var11) > ~(var14 + 2) && class342.field5057[var27] - -2 > var14 - var11 && ~(var13 - var15) > ~(class342.field5059[var27] + class342.field5055[var27]) && ~(var13 + var15) < ~(class342.field5055[var27] + -class342.field5059[var27]) && class342.field5057[var27] + -var11 < var14) {
                        var14 = class342.field5057[var27] + -var11;
                        var16 = true;
                    }
                }
            }
            class342.field5057[var12] = var14;
            String var17 = class342.field5054[var12];
            if (~class487.field7050 == -1) {
                int var18 = 16776960;
                if (~class342.field5060[var12] > -7) {
                    var18 = class29.field401[class342.field5060[var12]];
                }
                if (class342.field5060[var12] == 6) {
                    var18 = ~(class110.field1635 % 20) <= -11 ? 16776960 : 16711680;
                }
                if (~class342.field5060[var12] == -8) {
                    var18 = class110.field1635 % 20 >= 10 ? 65535 : 255;
                }
                if (~class342.field5060[var12] == -9) {
                    var18 = class110.field1635 % 20 >= 10 ? 8454016 : 45056;
                }
                if (class342.field5060[var12] == 9) {
                    int var19 = -class342.field5056[var12] + 150;
                    if (var19 >= 50) {
                        if (var19 >= 100) {
                            if (~var19 > -151) {
                                var18 = var19 * 5 + -500 + 65280;
                            }
                        } else {
                            var18 = 16776960 - (var19 + -50) * 327680;
                        }
                    } else {
                        var18 = var19 * 1280 + 16711680;
                    }
                }
                if (class342.field5060[var12] == 10) {
                    int var20 = -class342.field5056[var12] + 150;
                    if (~var20 > -51) {
                        var18 = 16711680 - -(var20 * 5);
                    } else if (~var20 <= -101) {
                        if (var20 < 150) {
                            var18 = (var20 + -100) * 327680 + 500 + 255 + -(var20 * 5);
                        }
                    } else {
                        var18 = -((var20 - 50) * 327680) + 16711935;
                    }
                }
                if (class342.field5060[var12] == 11) {
                    int var21 = -class342.field5056[var12] + 150;
                    if (~var21 > -51) {
                        var18 = 16777215 - var21 * 327685;
                    } else if (var21 >= 100) {
                        if (~var21 > -151) {
                            var18 = -(var21 * 327680) + 32768000 + 16777215;
                        }
                    } else {
                        var18 = 65280 - (-(var21 * 327685) + 16384250);
                    }
                }
                int var22 = var18 | -16777216;
                if (~class342.field5061[var12] == -1) {
                    class270.field4072.method1746(false, var22, arg0 - -var13, arg3 + var14, var17, -16777216);
                }
                if (~class342.field5061[var12] == -2) {
                    class270.field4072.method1750(var22, -16777216, arg0 + var13, arg3 + var14, 43, class110.field1635, var17);
                }
                if (class342.field5061[var12] == 2) {
                    class270.field4072.method1735(arg0 - -var13, arg3 - -var14, -16777216, 0, var17, var22, class110.field1635);
                }
                if (class342.field5061[var12] == 3) {
                    class270.field4072.method1741(-class342.field5056[var12] + 150, arg3 + var14, var17, 0, class110.field1635, -16777216, arg0 + var13, var22);
                }
                if (class342.field5061[var12] == 4) {
                    int var23 = (-class342.field5056[var12] + 150) * (class425.field6028.method875(var17, (byte) 5) + 100) / 150;
                    class76.field1256.method185(var13 + -50 + arg0, arg3, arg0 - -var13 + 50, arg3 + arg5);
                    class270.field4072.method1743(var17, var13 + 50 + arg0 - var23, -16777216, arg3 + var14, var22, (byte) 115);
                    class76.field1256.method345(arg0, arg3, arg0 + arg2, arg3 + arg5);
                }
                if (~class342.field5061[var12] == -6) {
                    int var24 = 150 - class342.field5056[var12];
                    int var25 = 0;
                    if (var24 < 25) {
                        var25 = var24 - 25;
                    } else if (~var24 < -126) {
                        var25 = var24 + -125;
                    }
                    int var26 = class425.field6028.field1863 + class425.field6028.field1854;
                    class76.field1256.method185(arg0, arg3 + var14 + -1 + -var26, arg0 + arg2, var14 + 5 + arg3);
                    class270.field4072.method1746(false, var22, arg0 + var13, var14 + var25 + arg3, var17, -16777216);
                    class76.field1256.method345(arg0, arg3, arg0 + arg2, arg3 + arg5);
                }
            } else {
                class270.field4072.method1746(false, -256, arg0 + var13, arg3 + var14, var17, -16777216);
            }
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIB)V")
    public final void method70(int arg0, int arg1, byte arg2) {
        ++field7169;
        int var4 = this.field7166 * arg1 >> 12;
        int var5 = this.field7162 * arg1 >> 12;
        int var6 = this.field7170 * arg0 >> 12;
        if (arg2 != -99) {
            this.method70(113, -98, (byte) 8);
        }
        int var7 = this.field7163 * arg0 >> 12;
        class543.method3185(var6, super.field2538, var7, var4, super.field2533, -121, var5);
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)V")
    public static void method2907(int arg0) {
        field7171 = null;
        if (arg0 >= -83) {
            method2907(-24);
        }
    }

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(IIIIIII)V")
    public class495(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field7163 = arg3;
        this.field7170 = arg1;
        this.field7162 = arg2;
        this.field7166 = arg0;
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(IIB)V")
    public final void method72(int arg0, int arg1, byte arg2) {
        ++field7164;
        int var4 = this.field7166 * arg0 >> 12;
        int var5 = this.field7162 * arg0 >> 12;
        int var6 = this.field7170 * arg1 >> 12;
        if (arg2 == 60) {
            int var7 = this.field7163 * arg1 >> 12;
            class198.method1337(super.field2534, var6, var5, var4, var7, super.field2533, super.field2538, -4);
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(III)V")
    public final void method69(int arg0, int arg1, int arg2) {
        ++field7165;
        int var4 = this.field7166 * arg2 >> 12;
        int var5 = this.field7162 * arg2 >> 12;
        int var6 = this.field7170 * arg0 >> 12;
        int var7 = this.field7163 * arg0 >> 12;
        if (arg1 == 1) {
            class214.method1435(var5, super.field2534, -7533, var7, var6, var4);
        }
    }
}
