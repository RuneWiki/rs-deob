import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class461 extends class82 {

    @OriginalMember(owner = "client!j", name = "U", descriptor = "[Z")
    public static boolean[] field6368 = new boolean[100];

    @OriginalMember(owner = "client!j", name = "T", descriptor = "Lvj;")
    public static class373 field6367 = new class373(37, 5);

    @OriginalMember(owner = "client!j", name = "L", descriptor = "I")
    public static int field6359;

    @OriginalMember(owner = "client!j", name = "M", descriptor = "I")
    public static int field6360;

    @OriginalMember(owner = "client!j", name = "N", descriptor = "I")
    public static int field6361;

    @OriginalMember(owner = "client!j", name = "P", descriptor = "I")
    private int field6363;

    @OriginalMember(owner = "client!j", name = "Q", descriptor = "I")
    private int field6364;

    @OriginalMember(owner = "client!j", name = "R", descriptor = "I")
    public static int field6365;

    @OriginalMember(owner = "client!j", name = "S", descriptor = "I")
    private int field6366;

    @OriginalMember(owner = "client!j", name = "V", descriptor = "I")
    public static int field6369;

    @OriginalMember(owner = "client!j", name = "O", descriptor = "Ldj;")
    public static class287 field6362;

    @OriginalMember(owner = "client!j", name = "W", descriptor = "[I")
    public static int[] field6370;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(B)V")
    public static void method2684(byte arg0) {
        field6370 = null;
        field6368 = null;
        if (arg0 >= 82) {
            field6367 = null;
            field6362 = null;
        }
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "()V")
    public class461() {
        this(0);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(I)V")
    private class461(int arg0) {
        super(0, false);
        this.method2687(arg0, -83);
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(II)[[I")
    public final int[][] method481(int arg0, int arg1) {
        ++field6369;
        if (arg0 != 1000) {
            this.field6366 = 6;
        }
        int[][] var3 = super.field992.method3178(arg1, 0);
        if (super.field992.field7962) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~var7 > ~class629.field9033; ++var7) {
                var4[var7] = this.field6366;
                var5[var7] = this.field6363;
                var6[var7] = this.field6364;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "([II[Ljava/lang/Object;)V")
    public static final void method2685(int[] arg0, int arg1, Object[] arg2) {
        ++field6361;
        class262.method1468(arg2, Integer.MIN_VALUE, arg0.length + -1, arg0, arg1);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IILos;)V")
    public final void method198(int arg0, int arg1, class374 arg2) {
        ++field6365;
        int var4 = -110 / ((arg1 - -69) / 42);
        if (~arg0 == -1) {
            this.method2687(arg2.method2128(true), -67);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2686(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 > -12) {
            method2684((byte) -6);
        }
        ++field6360;
        int var7 = class370.field4878;
        int[] var8 = class519.field7302;
        class368.field4858 = 0;
        for (int var9 = 0; ~(class474.field6637 + var7) < ~var9; ++var9) {
            class74 var32 = null;
            class463 var33;
            if (var9 >= var7) {
                var33 = ((class415) class309.field3938.method2645((long) class194.field2345[-var7 + var9], (byte) -118)).field5390;
                var32 = ((class459) var33).field6334;
                if (var32.field800 != null) {
                    var32 = var32.method420(class281.field3700, 120);
                    if (var32 == null) {
                        continue;
                    }
                }
            } else {
                var33 = class459.field6329[var8[var9]];
            }
            if (var33.field6472 >= 0 && (~class631.field9087 == ~var33.field6460 || class103.field1265.field8660 == var33.field8660)) {
                class458.method2668(arg6, (byte) -6, arg3 >> 1, arg5, var33.method2676((byte) 64), arg2 >> 1, var33);
                if (~class34.field271[0] <= -1) {
                    if (var33.field6441 != null && (~var9 <= ~var7 || class151.field1809 == 0 || class151.field1809 == 3 || class151.field1809 == 1 && class367.method2050(((class545) var33).field8023, (byte) -124)) && class115.field1437 > class368.field4858) {
                        class115.field1448[class368.field4858] = class410.field5340.method1241(var33.field6441, (byte) 0) / 2;
                        class115.field1438[class368.field4858] = class34.field271[0];
                        class115.field1446[class368.field4858] = class34.field271[1];
                        class115.field1442[class368.field4858] = var33.field6464;
                        class115.field1447[class368.field4858] = var33.field6453;
                        class115.field1441[class368.field4858] = var33.field6448;
                        class115.field1444[class368.field4858] = var33.field6441;
                        ++class368.field4858;
                    }
                    int var34 = class34.field271[1] + arg0;
                    int var45;
                    if (!var33.field6451 && var33.field6414 > class335.field4358) {
                        boolean var35 = true;
                        byte var36 = 1;
                        int var37;
                        if (var7 <= var9) {
                            var37 = var32.field846;
                            if (~var37 == 0) {
                                var37 = var33.method2704(0).field4554;
                            }
                        } else {
                            class545 var38 = class459.field6329[var8[var9]];
                            var37 = var33.method2704(0).field4554;
                            if (var38.field7986) {
                                var36 = 2;
                            }
                        }
                        class52[] var39 = class98.field1212;
                        if (var37 != -1) {
                            class52[] var40 = (class52[]) class436.field5918.method3682(0, (long) var37);
                            if (var40 == null) {
                                class3[] var41 = class3.method14(class39.field299, var37, 0);
                                if (var41 != null) {
                                    var40 = new class52[var41.length];
                                    for (int var42 = 0; ~var42 > ~var41.length; ++var42) {
                                        var40[var42] = class210.field2560.method1101(var41[var42], true);
                                    }
                                    class436.field5918.method3684(var40, 0, (long) var37);
                                }
                            }
                            if (var40 != null && ~var40.length <= -3) {
                                var39 = var40;
                            }
                        }
                        if (~var39.length >= ~var36) {
                            var36 = 1;
                        }
                        class52 var43 = var39[0];
                        class52 var44 = var39[var36];
                        var45 = var34 - Math.max(class410.field5340.field2634, var43.method290());
                        int var46 = class34.field271[0] + (arg1 - (var43.method291() >> 1));
                        int var47 = var43.method291() * var33.field6433 / 255;
                        if (~var33.field6433 < -1 && var47 < 2) {
                            var47 = 2;
                        }
                        var43.method299(var46, var45);
                        class210.field2560.method1119(var46, var45, var46 + var47, var43.method290() + var45);
                        var44.method299(var46, var45);
                        class210.field2560.method1107(arg1, arg0, arg1 - -arg2, arg0 + arg3);
                    } else {
                        var45 = var34 - Math.max(class410.field5340.field2634, class98.field1212[0].method290());
                    }
                    var45 -= 2;
                    if (!var33.field6451) {
                        if (~class335.field4358 > ~var33.field6424) {
                            class52 var48 = class82.field995[var33.field6428 ? 2 : 0];
                            class52 var49 = class82.field995[!var33.field6428 ? 1 : 3];
                            boolean var50 = true;
                            int var51;
                            if (var33 instanceof class459) {
                                var51 = var32.field819;
                                if (~var51 == 0) {
                                    var51 = var33.method2704(0).field4581;
                                }
                            } else {
                                var51 = var33.method2704(0).field4581;
                            }
                            if (~var51 != 0) {
                                class52[] var52 = (class52[]) class220.field2716.method3682(0, (long) var51);
                                if (var52 == null) {
                                    class3[] var53 = class3.method14(class39.field299, var51, 0);
                                    if (var53 != null) {
                                        var52 = new class52[var53.length];
                                        for (int var54 = 0; var54 < var53.length; ++var54) {
                                            var52[var54] = class210.field2560.method1101(var53[var54], true);
                                        }
                                        class220.field2716.method3684(var52, 0, (long) var51);
                                    }
                                }
                                if (var52 != null && ~var52.length == -5) {
                                    var48 = var52[var33.field6428 ? 2 : 0];
                                    var49 = var52[!var33.field6428 ? 1 : 3];
                                }
                            }
                            int var55 = -class335.field4358 + var33.field6424;
                            int var56;
                            if (~var33.field6418 <= ~var55) {
                                var56 = var48.method291();
                            } else {
                                int var57 = var55 - var33.field6418;
                                int var58 = ~var33.field6459 == -1 ? 0 : (-var57 + var33.field6432) / var33.field6459 * var33.field6459;
                                var56 = var58 * var48.method291() / var33.field6432;
                            }
                            int var59 = var48.method290();
                            var45 -= var59;
                            int var60 = class34.field271[0] + arg1 - (var48.method291() >> 1);
                            var48.method299(var60, var45);
                            class210.field2560.method1119(var60, var45, var56 + var60, var45 + var59);
                            var49.method299(var60, var45);
                            var45 -= 2;
                            class210.field2560.method1107(arg1, arg0, arg1 - -arg2, arg0 + arg3);
                        }
                        if (~var7 >= ~var9) {
                            if (~var32.field856 <= -1 && var32.field856 < class595.field8633.length) {
                                class52 var61 = class595.field8633[var32.field856];
                                var45 -= 25;
                                var61.method299(class34.field271[0] + (arg1 - (var61.method291() >> 1)), var45);
                                var45 -= 2;
                            }
                        } else {
                            class545 var62 = (class545) var33;
                            if (~var62.field7998 != 0) {
                                var45 -= 25;
                                class159.field1922[var62.field7998].method299(class34.field271[0] + -12 + arg1, var45);
                                var45 -= 2;
                            }
                            if (var62.field8021 != -1) {
                                var45 -= 25;
                                class595.field8633[var62.field8021].method299(class34.field271[0] + arg1 + -12, var45);
                                var45 -= 2;
                            }
                        }
                    }
                    int var10000;
                    if (var33 instanceof class545) {
                        if (var9 >= 0) {
                            int var63 = 0;
                            class458[] var64 = class225.field2765;
                            for (int var65 = 0; ~var64.length < ~var65; ++var65) {
                                class458 var67 = var64[var65];
                                if (var67 != null && var67.field6309 == 10 && var8[var9] == var67.field6303) {
                                    class52 var68 = class286.field3726[var67.field6308];
                                    if (~var63 > ~var68.method290()) {
                                        var63 = var68.method290();
                                    }
                                    var68.method299(arg1 + -12 + class34.field271[0], -var68.method290() + var45);
                                }
                            }
                            if (var63 > 0) {
                                var10000 = var45 - (var63 + 2);
                            }
                        }
                    } else {
                        int var69 = 0;
                        class458[] var70 = class225.field2765;
                        for (int var71 = 0; var70.length > var71; ++var71) {
                            class458 var76 = var70[var71];
                            if (var76 != null && var76.field6309 == 1 && ~class194.field2345[-var7 + var9] == ~var76.field6303) {
                                class52 var77 = class286.field3726[var76.field6308];
                                if (var77.method290() > var69) {
                                    var69 = var77.method290();
                                }
                                if (class335.field4358 % 20 < 10) {
                                    var77.method299(arg1 + -12 - -class34.field271[0], -var77.method290() + var45);
                                }
                            }
                        }
                        if (~var69 < -1) {
                            var10000 = var45 - (var69 + 2);
                        }
                    }
                    for (int var73 = 0; ~var73 > -5; ++var73) {
                        if (class335.field4358 < var33.field6392[var73]) {
                            int var74 = var33.method2676((byte) 64) / 2;
                            class458.method2668(arg6, (byte) -6, arg3 >> 1, arg5, var74, arg2 >> 1, var33);
                            if (class34.field271[0] > -1) {
                                int var75 = class9.field64[var33.field6423[var73]].method291();
                                if (var73 == 1) {
                                    class34.field271[1] -= 20;
                                }
                                if (~var73 == -3) {
                                    class34.field271[1] -= 10;
                                    class34.field271[0] -= var75 + -9;
                                }
                                if (~var73 == -4) {
                                    class34.field271[1] -= 10;
                                    class34.field271[0] += var75 + -9;
                                }
                                class9.field64[var33.field6423[var73]].method299(-(var75 >> 1) + arg1 - -class34.field271[0], arg0 - 12 + class34.field271[1]);
                                class403.field5290.method534(11740, Integer.toString(var33.field6445[var73]), 0, class34.field271[1] + arg0 + 3, -1, arg1 - -class34.field271[0] + -1);
                            }
                        }
                    }
                }
            }
        }
        for (int var10 = 0; var10 < class295.field3806; ++var10) {
            int var28 = class220.field2720[var10];
            class463 var29;
            if (~var28 <= -2049) {
                var29 = ((class415) class309.field3938.method2645((long) (var28 + -2048), (byte) -94)).field5390;
            } else {
                var29 = class459.field6329[var28];
            }
            int var30 = class431.field5846[var10];
            class463 var31;
            if (~var30 > -2049) {
                var31 = class459.field6329[var30];
            } else {
                var31 = ((class415) class309.field3938.method2645((long) (var30 + -2048), (byte) -97)).field5390;
            }
            class173.method967(arg2, arg1, var31, (byte) -102, arg6, var29, --var29.field6431, arg3, arg0, arg5);
        }
        int var11 = class410.field5340.field2634 + 2 + class410.field5340.field2624;
        for (int var12 = 0; ~class368.field4858 < ~var12; ++var12) {
            int var13 = class115.field1438[var12];
            int var14 = class115.field1446[var12];
            int var15 = class115.field1448[var12];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var27 = 0; ~var27 > ~var12; ++var27) {
                    if (var14 + 2 > class115.field1446[var27] - var11 && var14 - var11 < class115.field1446[var27] + 2 && -var15 + var13 < class115.field1438[var27] - -class115.field1448[var27] && class115.field1438[var27] + -class115.field1448[var27] < var13 - -var15 && var14 > class115.field1446[var27] - var11) {
                        var14 = class115.field1446[var27] - var11;
                        var16 = true;
                    }
                }
            }
            class115.field1446[var12] = var14;
            String var17 = class115.field1444[var12];
            if (class210.field2564 == 0) {
                int var18 = 16776960;
                if (class115.field1442[var12] < 6) {
                    var18 = class307.field3917[class115.field1442[var12]];
                }
                if (~class115.field1442[var12] == -7) {
                    var18 = class631.field9087 % 20 < 10 ? 16711680 : 16776960;
                }
                if (~class115.field1442[var12] == -8) {
                    var18 = ~(class631.field9087 % 20) > -11 ? 255 : 65535;
                }
                if (~class115.field1442[var12] == -9) {
                    var18 = ~(class631.field9087 % 20) <= -11 ? 8454016 : 45056;
                }
                if (class115.field1442[var12] == 9) {
                    int var19 = 150 - class115.field1441[var12];
                    if (var19 >= 50) {
                        if (~var19 <= -101) {
                            if (var19 < 150) {
                                var18 = (var19 - 100) * 5 + 65280;
                            }
                        } else {
                            var18 = 16776960 - (var19 - 50) * 327680;
                        }
                    } else {
                        var18 = var19 * 1280 + 16711680;
                    }
                }
                if (class115.field1442[var12] == 10) {
                    int var20 = -class115.field1441[var12] + 150;
                    if (~var20 > -51) {
                        var18 = var20 * 5 + 16711680;
                    } else if (~var20 > -101) {
                        var18 = 16711935 - (var20 * 327680 + -16384000);
                    } else if (var20 < 150) {
                        var18 = var20 * 327680 + (-(var20 * 5) - -500) + -32768000 + 255;
                    }
                }
                if (class115.field1442[var12] == 11) {
                    int var21 = -class115.field1441[var12] + 150;
                    if (var21 >= 50) {
                        if (var21 < 100) {
                            var18 = -16384250 - -(var21 * 327685) + 65280;
                        } else if (var21 < 150) {
                            var18 = -(var21 * 327680) + 32768000 + 16777215;
                        }
                    } else {
                        var18 = -(var21 * 327685) + 16777215;
                    }
                }
                int var22 = -16777216 | var18;
                if (class115.field1447[var12] == 0) {
                    class459.field6320.method534(11740, var17, -16777216, arg0 + var14, var22, arg1 + var13);
                }
                if (class115.field1447[var12] == 1) {
                    class459.field6320.method537(arg0 - -var14, 5, arg1 + var13, class631.field9087, var22, -16777216, var17);
                }
                if (~class115.field1447[var12] == -3) {
                    class459.field6320.method538(arg1 + var13, arg0 + var14, class631.field9087, 6294, var17, var22, -16777216);
                }
                if (class115.field1447[var12] == 3) {
                    class459.field6320.method548(var17, -16777216, arg1 - -var13, -class115.field1441[var12] + 150, -56, arg0 + var14, var22, class631.field9087);
                }
                if (~class115.field1447[var12] == -5) {
                    int var23 = (-class115.field1441[var12] + 150) * (class410.field5340.method1241(var17, (byte) 0) - -100) / 150;
                    class210.field2560.method1119(arg1 + -50 + var13, arg0, var13 + 50 + arg1, arg0 + arg3);
                    class459.field6320.method540(var22, arg0 + var14, var17, arg1 + var13 + -var23 + 50, -16777216, false);
                    class210.field2560.method1107(arg1, arg0, arg1 + arg2, arg0 - -arg3);
                }
                if (class115.field1447[var12] == 5) {
                    int var24 = -class115.field1441[var12] + 150;
                    int var25 = 0;
                    if (var24 >= 25) {
                        if (~var24 < -126) {
                            var25 = var24 + -125;
                        }
                    } else {
                        var25 = var24 + -25;
                    }
                    int var26 = class410.field5340.field2634 + class410.field5340.field2624;
                    class210.field2560.method1119(arg1, arg0 - -var14 - var26 + -1, arg1 - -arg2, arg0 + 5 - -var14);
                    class459.field6320.method534(11740, var17, -16777216, arg0 + var14 + var25, var22, arg1 + var13);
                    class210.field2560.method1107(arg1, arg0, arg1 + arg2, arg0 - -arg3);
                }
            } else {
                class459.field6320.method534(11740, var17, -16777216, arg0 + var14, -256, arg1 - -var13);
            }
        }
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "(II)V")
    private final void method2687(int arg0, int arg1) {
        ++field6359;
        this.field6366 = (16711680 & arg0) >> 12;
        this.field6363 = (65280 & arg0) >> 4;
        int var3 = -94 % ((arg1 - -20) / 42);
        this.field6364 = (arg0 & 255) << 4;
    }
}
