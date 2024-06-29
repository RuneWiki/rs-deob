import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jca")
public class class636 extends class171 implements class306 {

    @OriginalMember(owner = "client!jca", name = "c", descriptor = "I")
    private int field8991;

    @OriginalMember(owner = "client!jca", name = "d", descriptor = "I")
    public static int field8992;

    @OriginalMember(owner = "client!jca", name = "e", descriptor = "I")
    public static int field8993;

    @OriginalMember(owner = "client!jca", name = "f", descriptor = "I")
    public static int field8994;

    @OriginalMember(owner = "client!jca", name = "g", descriptor = "I")
    public static int field8995;

    @OriginalMember(owner = "client!jca", name = "h", descriptor = "I")
    public static int field8996;

    @OriginalMember(owner = "client!jca", name = "i", descriptor = "I")
    public static int field8997;

    @OriginalMember(owner = "client!jca", name = "j", descriptor = "I")
    public static int field8998;

    @OriginalMember(owner = "client!jca", name = "k", descriptor = "I")
    public static int field8999;

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(BLr;)V", line = 3)
    public static final void method3541(byte arg0, class166 arg1) {
        ++field8992;
        if (arg0 < 64) {
            method3541((byte) 61, (class166) null);
        }
        if (class293.field4323 != class648.field9106.field3019) {
            if (class153.field2210 != null) {
                if (class354.method2165(4, class648.field9106.field3019, arg1)) {
                    class293.field4323 = class648.field9106.field3019;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(II)V", line = 27)
    public static final void method3542(int arg0, int arg1) {
        class54 var2 = null;
        for (int var3 = arg0; var3 < arg1; ++var3) {
            class37 var4 = class420.field6108[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class8.field82; ++var5) {
                    for (int var6 = 0; var6 < class302.field4492; ++var6) {
                        var2 = var4.method441(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class310.field4593;
                            int var8 = var5 << class310.field4593;
                            for (int var9 = var3 - 1; var9 >= 0; --var9) {
                                class37 var10 = class420.field6108[var9];
                                if (var10 != null) {
                                    int var11 = var4.method432(var6, false, var5) - var10.method432(var6, false, var5);
                                    int var12 = var4.method432(var6 + 1, false, var5) - var10.method432(var6 + 1, false, var5);
                                    int var13 = var4.method432(var6 + 1, false, var5 + 1) - var10.method432(var6 + 1, false, var5 + 1);
                                    int var14 = var4.method432(var6, false, var5 + 1) - var10.method432(var6, false, var5 + 1);
                                    var10.method446(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(IIIIIII)V", line = 91)
    public static final void method3543(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field8993;
        int var7 = class7.field65;
        int[] var8 = class629.field8801;
        class41.field676 = 0;
        for (int var9 = 0; class217.field3042 + var7 > var9; ++var9) {
            class592 var33 = null;
            class425 var34;
            if (~var7 < ~var9) {
                var34 = class141.field2087[var8[var9]];
            } else {
                var34 = ((class16) class189.field2723.method1405((long) class85.field1396[var9 - var7], (byte) -70)).field174;
                var33 = ((class577) var34).field8121;
                if (var33.field8315 != null) {
                    var33 = var33.method3356(107, class61.field1163);
                    if (var33 == null) {
                        continue;
                    }
                }
            }
            if (~var34.field6180 <= -1 && (~class534.field7501 == ~var34.field6233 || class648.field9106.field3019 == var34.field3019)) {
                class258.method1710(arg1, arg5 >> 1, arg3 >> 1, arg4, (byte) 33, var34, var34.method2551(-1145243378));
                if (~class287.field4269[0] <= -1) {
                    if (var34.field6234 != null && (var7 <= var9 || class310.field4595 == 0 || ~class310.field4595 == -4 || ~class310.field4595 == -2 && class249.method1674(((class491) var34).field6981, (byte) -64)) && class41.field676 < class130.field1919) {
                        class130.field1914[class41.field676] = class467.field6721.method1039(0, var34.field6234) / 2;
                        class130.field1920[class41.field676] = class287.field4269[0];
                        class130.field1916[class41.field676] = class287.field4269[1];
                        class130.field1927[class41.field676] = var34.field6168;
                        class130.field1918[class41.field676] = var34.field6190;
                        class130.field1921[class41.field676] = var34.field6208;
                        class130.field1917[class41.field676] = var34.field6234;
                        ++class41.field676;
                    }
                    int var35 = class287.field4269[1] + arg0;
                    int var46;
                    if (!var34.field6186 && var34.field6210 > class564.field7962) {
                        boolean var36 = true;
                        byte var37 = 1;
                        int var39;
                        if (var9 < var7) {
                            class491 var38 = class141.field2087[var8[var9]];
                            var39 = var34.method2544(2).field1422;
                            if (var38.field6999) {
                                var37 = 2;
                            }
                        } else {
                            var39 = var33.field8324;
                            if (~var39 == 0) {
                                var39 = var34.method2544(2).field1422;
                            }
                        }
                        class702[] var40 = class586.field8207;
                        if (~var39 != 0) {
                            class702[] var41 = (class702[]) class197.field2805.method2287(1, (long) var39);
                            if (var41 == null) {
                                class113[] var42 = class113.method884(class703.field9909, var39, 0);
                                if (var42 != null) {
                                    var41 = new class702[var42.length];
                                    for (int var43 = 0; ~var43 > ~var42.length; ++var43) {
                                        var41[var43] = class282.field4228.method138(var42[var43], true);
                                    }
                                    class197.field2805.method2291(var41, (long) var39, 1);
                                }
                            }
                            if (var41 != null && ~var41.length <= -3) {
                                var40 = var41;
                            }
                        }
                        if (var40.length <= var37) {
                            var37 = 1;
                        }
                        class702 var44 = var40[0];
                        class702 var45 = var40[var37];
                        var46 = var35 - Math.max(class467.field6721.field2126, var44.method939());
                        int var47 = class287.field4269[0] + (arg6 - (var44.method927() >> 1));
                        int var48 = var44.method927() * var34.field6254 / 255;
                        if (~var34.field6254 < -1 && ~var48 > -3) {
                            var48 = 2;
                        }
                        var44.method3916(var47, var46);
                        class282.field4228.method107(var47, var46, var47 + var48, var44.method939() + var46);
                        var45.method3916(var47, var46);
                        class282.field4228.method168(arg6, arg0, arg6 - -arg3, arg0 + arg5);
                    } else {
                        var46 = var35 - Math.max(class467.field6721.field2126, class586.field8207[0].method939());
                    }
                    var46 -= 2;
                    if (!var34.field6186) {
                        if (~var34.field6204 < ~class564.field7962) {
                            class702 var49 = class305.field4534[!var34.field6217 ? 0 : 2];
                            class702 var50 = class305.field4534[var34.field6217 ? 3 : 1];
                            boolean var51 = true;
                            int var52;
                            if (!(var34 instanceof class577)) {
                                var52 = var34.method2544(2).field1444;
                            } else {
                                var52 = var33.field8358;
                                if (var52 == -1) {
                                    var52 = var34.method2544(2).field1444;
                                }
                            }
                            if (var52 != -1) {
                                class702[] var53 = (class702[]) class524.field7402.method2287(1, (long) var52);
                                if (var53 == null) {
                                    class113[] var54 = class113.method884(class703.field9909, var52, 0);
                                    if (var54 != null) {
                                        var53 = new class702[var54.length];
                                        for (int var55 = 0; var54.length > var55; ++var55) {
                                            var53[var55] = class282.field4228.method138(var54[var55], true);
                                        }
                                        class524.field7402.method2291(var53, (long) var52, 1);
                                    }
                                }
                                if (var53 != null && var53.length == 4) {
                                    var50 = var53[!var34.field6217 ? 1 : 3];
                                    var49 = var53[var34.field6217 ? 2 : 0];
                                }
                            }
                            int var56 = -class564.field7962 + var34.field6204;
                            int var59;
                            if (~var34.field6224 > ~var56) {
                                int var57 = var56 - var34.field6224;
                                int var58 = var34.field6238 == 0 ? 0 : (var34.field6165 - var57) / var34.field6238 * var34.field6238;
                                var59 = var58 * var49.method927() / var34.field6165;
                            } else {
                                var59 = var49.method927();
                            }
                            int var60 = var49.method939();
                            var46 -= var60;
                            int var61 = arg6 - -class287.field4269[0] + -(var49.method927() >> 1);
                            var49.method3916(var61, var46);
                            class282.field4228.method107(var61, var46, var59 + var61, var46 + var60);
                            var50.method3916(var61, var46);
                            class282.field4228.method168(arg6, arg0, arg6 - -arg3, arg0 + arg5);
                            var46 -= 2;
                        }
                        if (~var9 > ~var7) {
                            class491 var62 = (class491) var34;
                            if (~var62.field6976 != 0) {
                                var46 -= 25;
                                class272.field4093[var62.field6976].method3916(arg6 + -12 + class287.field4269[0], var46);
                                var46 -= 2;
                            }
                            if (~var62.field6948 != 0) {
                                var46 -= 25;
                                class420.field6107[var62.field6948].method3916(arg6 - 12 + class287.field4269[0], var46);
                                var46 -= 2;
                            }
                        } else if (~var33.field8297 <= -1 && ~class420.field6107.length < ~var33.field8297) {
                            class702 var63 = class420.field6107[var33.field8297];
                            var46 -= 25;
                            var63.method3916(class287.field4269[0] + (arg6 - (var63.method927() >> 1)), var46);
                            var46 -= 2;
                        }
                    }
                    int var10000;
                    if (var34 instanceof class491) {
                        if (var9 >= 0) {
                            int var64 = 0;
                            class390[] var65 = class601.field8496;
                            for (int var66 = 0; ~var66 > ~var65.length; ++var66) {
                                class390 var68 = var65[var66];
                                if (var68 != null && ~var68.field5787 == -11 && var8[var9] == var68.field5786) {
                                    class702 var69 = class498.field7055[var68.field5788];
                                    if (var69.method939() > var64) {
                                        var64 = var69.method939();
                                    }
                                    var69.method3916(arg6 - 12 + class287.field4269[0], var46 - var69.method939());
                                }
                            }
                            if (var64 > 0) {
                                var10000 = var46 - (var64 + 2);
                            }
                        }
                    } else {
                        int var70 = 0;
                        class390[] var71 = class601.field8496;
                        for (int var72 = 0; var71.length > var72; ++var72) {
                            class390 var77 = var71[var72];
                            if (var77 != null && var77.field5787 == 1 && class85.field1396[-var7 + var9] == var77.field5786) {
                                class702 var78 = class498.field7055[var77.field5788];
                                if (~var78.method939() < ~var70) {
                                    var70 = var78.method939();
                                }
                                if (class564.field7962 % 20 < 10) {
                                    var78.method3916(class287.field4269[0] + arg6 + -12, var46 - var78.method939());
                                }
                            }
                        }
                        if (~var70 < -1) {
                            var10000 = var46 - (var70 + 2);
                        }
                    }
                    for (int var74 = 0; var74 < 4; ++var74) {
                        if (~class564.field7962 > ~var34.field6197[var74]) {
                            int var75 = var34.method2551(-1145243378) / 2;
                            class258.method1710(arg1, arg5 >> 1, arg3 >> 1, arg4, (byte) 33, var34, var75);
                            if (class287.field4269[0] > -1) {
                                int var76 = class571.field8048[var34.field6240[var74]].method927();
                                if (var74 == 1) {
                                    class287.field4269[1] -= 20;
                                }
                                if (~var74 == -3) {
                                    class287.field4269[1] -= 10;
                                    class287.field4269[0] -= var76 + -9;
                                }
                                if (var74 == 3) {
                                    class287.field4269[0] += var76 + -9;
                                    class287.field4269[1] -= 10;
                                }
                                class571.field8048[var34.field6240[var74]].method3916(class287.field4269[0] - (var76 >> 1) + arg6, class287.field4269[1] + arg0 + -12);
                                class351.field5064.method2494(0, -1, arg6 + -1 + class287.field4269[0], Integer.toString(var34.field6235[var74]), -117, class287.field4269[1] + arg0 - -3);
                            }
                        }
                    }
                }
            }
        }
        for (int var10 = 0; class67.field1231 > var10; ++var10) {
            int var29 = class592.field8366[var10];
            class425 var30;
            if (var29 >= 2048) {
                var30 = ((class16) class189.field2723.method1405((long) (var29 + -2048), (byte) -111)).field174;
            } else {
                var30 = class141.field2087[var29];
            }
            int var31 = class619.field8630[var10];
            class425 var32;
            if (~var31 > -2049) {
                var32 = class141.field2087[var31];
            } else {
                var32 = ((class16) class189.field2723.method1405((long) (var31 + -2048), (byte) -21)).field174;
            }
            class309.method1969(arg6, --var30.field6245, arg3, arg0, var30, arg1, var32, arg5, -78, arg4);
        }
        int var11 = class467.field6721.field2132 + class467.field6721.field2126 + 2;
        for (int var12 = 0; class41.field676 > var12; ++var12) {
            int var14 = class130.field1920[var12];
            int var15 = class130.field1916[var12];
            int var16 = class130.field1914[var12];
            boolean var17 = true;
            while (var17) {
                var17 = false;
                for (int var28 = 0; var12 > var28; ++var28) {
                    if (~(class130.field1916[var28] - var11) > ~(var15 + 2) && ~(class130.field1916[var28] - -2) < ~(-var11 + var15) && ~(class130.field1920[var28] + class130.field1914[var28]) < ~(-var16 + var14) && ~(var14 - -var16) < ~(class130.field1920[var28] + -class130.field1914[var28]) && var15 > class130.field1916[var28] + -var11) {
                        var15 = class130.field1916[var28] + -var11;
                        var17 = true;
                    }
                }
            }
            class130.field1916[var12] = var15;
            String var18 = class130.field1917[var12];
            if (~class190.field2749 != -1) {
                class26.field391.method2494(-16777216, -256, arg6 + var14, var18, -110, arg0 + var15);
            } else {
                int var19 = 16776960;
                if (~class130.field1927[var12] > -7) {
                    var19 = class629.field8796[class130.field1927[var12]];
                }
                if (~class130.field1927[var12] == -7) {
                    var19 = ~(class534.field7501 % 20) <= -11 ? 16776960 : 16711680;
                }
                if (class130.field1927[var12] == 7) {
                    var19 = ~(class534.field7501 % 20) > -11 ? 255 : 65535;
                }
                if (~class130.field1927[var12] == -9) {
                    var19 = class534.field7501 % 20 >= 10 ? 8454016 : 45056;
                }
                if (class130.field1927[var12] == 9) {
                    int var20 = -class130.field1921[var12] + 150;
                    if (~var20 <= -51) {
                        if (var20 < 100) {
                            var19 = -((var20 + -50) * 327680) + 16776960;
                        } else if (~var20 > -151) {
                            var19 = (var20 + -100) * 5 + 65280;
                        }
                    } else {
                        var19 = var20 * 1280 + 16711680;
                    }
                }
                if (class130.field1927[var12] == 10) {
                    int var21 = -class130.field1921[var12] + 150;
                    if (~var21 <= -51) {
                        if (~var21 <= -101) {
                            if (~var21 > -151) {
                                var19 = (var21 + -100) * 327680 + -(var21 * 5) + 255 - -500;
                            }
                        } else {
                            var19 = 16384000 - (var21 * 327680 - 16711935);
                        }
                    } else {
                        var19 = var21 * 5 + 16711680;
                    }
                }
                if (~class130.field1927[var12] == -12) {
                    int var22 = -class130.field1921[var12] + 150;
                    if (var22 < 50) {
                        var19 = -(var22 * 327685) + 16777215;
                    } else if (~var22 > -101) {
                        var19 = (var22 + -50) * 327685 + 65280;
                    } else if (var22 < 150) {
                        var19 = 32768000 - var22 * 327680 + 16777215;
                    }
                }
                int var23 = -16777216 | var19;
                if (~class130.field1918[var12] == -1) {
                    class26.field391.method2494(-16777216, var23, arg6 - -var14, var18, -115, arg0 + var15);
                }
                if (class130.field1918[var12] == 1) {
                    class26.field391.method2506(class534.field7501, arg0 + var15, var18, (byte) 77, -16777216, arg6 - -var14, var23);
                }
                if (~class130.field1918[var12] == -3) {
                    class26.field391.method2491(-16777216, var23, var18, class534.field7501, arg6 + var14, arg0 + var15, (byte) -117);
                }
                if (~class130.field1918[var12] == -4) {
                    class26.field391.method2497(-class130.field1921[var12] + 150, var23, class534.field7501, -16777216, var18, arg6 - -var14, (byte) 91, arg0 + var15);
                }
                if (~class130.field1918[var12] == -5) {
                    int var24 = (-class130.field1921[var12] + 150) * (100 + class467.field6721.method1039(0, var18)) / 150;
                    class282.field4228.method107(var14 + -50 + arg6, arg0, arg6 + var14 - -50, arg0 + arg5);
                    class26.field391.method2492(var23, var18, -var24 + arg6 + var14 + 50, -16777216, (byte) -123, arg0 + var15);
                    class282.field4228.method168(arg6, arg0, arg6 - -arg3, arg0 + arg5);
                }
                if (class130.field1918[var12] == 5) {
                    int var25 = -class130.field1921[var12] + 150;
                    int var26 = 0;
                    if (~var25 <= -26) {
                        if (var25 > 125) {
                            var26 = var25 - 125;
                        }
                    } else {
                        var26 = var25 + -25;
                    }
                    int var27 = class467.field6721.field2126 - -class467.field6721.field2132;
                    class282.field4228.method107(arg6, -var27 + arg0 + var15 - 1, arg3 + arg6, arg0 + 5 + var15);
                    class26.field391.method2494(-16777216, var23, arg6 + var14, var18, -114, arg0 - -var26 + var15);
                    class282.field4228.method168(arg6, arg0, arg3 + arg6, arg0 + arg5);
                }
            }
        }
        int var13 = -62 / ((arg2 - 22) / 37);
    }

    @OriginalMember(owner = "client!jca", name = "<init>", descriptor = "(Lok;I[BI)V", line = 675)
    public class636(class228 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field8991 = arg1;
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(I)I", line = 685)
    public final int method1949(int arg0) {
        ++field8995;
        int var2 = 121 / ((-36 - arg0) / 61);
        return 0;
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(I[BBI)V", line = 700)
    public final void method1948(int arg0, byte[] arg1, byte arg2, int arg3) {
        if (arg2 > -51) {
            method3541((byte) 66, (class166) null);
        }
        ++field8997;
        this.method1170(arg1, arg0);
        this.field8991 = arg3;
    }

    @OriginalMember(owner = "client!jca", name = "b", descriptor = "(I)I", line = 712)
    public final int method1950(int arg0) {
        ++field8996;
        return arg0 > -29 ? 9 : this.field8991;
    }

    @OriginalMember(owner = "client!jca", name = "c", descriptor = "(I)J", line = 724)
    public final long method1951(int arg0) {
        if (arg0 != -27189) {
            return 83L;
        } else {
            ++field8994;
            return super.field2438.getAddress();
        }
    }
}
