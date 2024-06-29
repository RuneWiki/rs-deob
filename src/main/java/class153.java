import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class153 extends class263 {

    @OriginalMember(owner = "client!fm", name = "K", descriptor = "I")
    private int field2323 = 0;

    @OriginalMember(owner = "client!fm", name = "E", descriptor = "I")
    private int field2318 = 4096;

    @OriginalMember(owner = "client!fm", name = "N", descriptor = "[I")
    public static int[] field2326 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99 };

    @OriginalMember(owner = "client!fm", name = "M", descriptor = "[S")
    public static short[] field2325 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!fm", name = "I", descriptor = "Luv;")
    public static class2 field2321 = new class2(83, 6);

    @OriginalMember(owner = "client!fm", name = "Q", descriptor = "I")
    public static int field2329 = 1339;

    @OriginalMember(owner = "client!fm", name = "G", descriptor = "I")
    public static int field2319;

    @OriginalMember(owner = "client!fm", name = "H", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!fm", name = "J", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!fm", name = "L", descriptor = "I")
    public static int field2324;

    @OriginalMember(owner = "client!fm", name = "P", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!fm", name = "O", descriptor = "[Lgs;")
    public static class439[] field2327;

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "()V", line = 3)
    public class153() {
        super(1, true);
    }

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "(I)V", line = 6)
    public static void method1103(int arg0) {
        if (arg0 == 14664) {
            field2327 = null;
            field2325 = null;
            field2321 = null;
            field2326 = null;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IZLgk;)V", line = 21)
    public final void method32(int arg0, boolean arg1, class468 arg2) {
        if (arg0 != 0) {
            if (~arg0 == -2) {
                this.field2318 = arg2.method2727((byte) 43);
            }
        } else {
            this.field2323 = arg2.method2727((byte) 43);
        }
        if (!arg1) {
            field2322 = 119;
        }
        ++field2320;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IB)[I", line = 56)
    public final int[] method33(int arg0, byte arg1) {
        ++field2324;
        if (arg1 <= 40) {
            this.method33(82, (byte) -108);
        }
        int[] var3 = super.field3917.method41(arg0, 1);
        if (super.field3917.field91) {
            int[] var4 = this.method1644(0, 0, arg0);
            for (int var5 = 0; ~class367.field5597 < ~var5; ++var5) {
                int var6 = var4[var5];
                var3[var5] = this.field2323 <= var6 && ~this.field2318 <= ~var6 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(II)Z", line = 97)
    public static final boolean method1104(int arg0, int arg1) {
        ++field2328;
        if (arg0 > -127) {
            field2321 = null;
        }
        return arg1 == 2 || ~arg1 == -4;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIIIIII)V", line = 119)
    public static final void method1105(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2319;
        int var7 = class146.field2203;
        int[] var8 = class457.field6694;
        class103.field1555 = 0;
        if (arg5 < -86) {
            for (int var9 = 0; class519.field7609 + var7 > var9; ++var9) {
                class277 var32 = null;
                class400 var33;
                if (var9 < var7) {
                    var33 = class83.field1327[var8[var9]];
                } else {
                    var33 = class88.field1375[class327.field5114[-var7 + var9]];
                    var32 = ((class351) var33).field5409;
                    if (var32.field4148 != null) {
                        var32 = var32.method1734((byte) -125, class307.field4619);
                        if (var32 == null) {
                            continue;
                        }
                    }
                }
                if (var33.field5995 >= 0 && (class439.field6459 == var33.field5972 || ~class410.field6198.field7686 == ~var33.field7686)) {
                    class364.method2173(arg4 >> 1, arg6, var33, var33.method2119(131072), (byte) 111, arg2, arg1 >> 1);
                    if (~class142.field2140[0] <= -1) {
                        if (var33.field6007 != null && (~var7 >= ~var9 || class338.field5213 == 0 || ~class338.field5213 == -4 || class338.field5213 == 1 && class23.method228(35, ((class480) var33).field7063)) && ~class103.field1555 > ~class50.field644) {
                            class50.field646[class103.field1555] = class342.field5252.method2599(var33.field6007, (byte) 121) / 2;
                            class50.field643[class103.field1555] = class142.field2140[0];
                            class50.field642[class103.field1555] = class142.field2140[1];
                            class50.field645[class103.field1555] = var33.field6041;
                            class50.field647[class103.field1555] = var33.field6020;
                            class50.field648[class103.field1555] = var33.field6010;
                            class50.field641[class103.field1555] = var33.field6007;
                            ++class103.field1555;
                        }
                        int var34 = class142.field2140[1] + arg3;
                        int var45;
                        if (!var33.field5981 && var33.field6014 > class86.field1350) {
                            boolean var35 = true;
                            byte var36 = 1;
                            int var38;
                            if (var9 < var7) {
                                class480 var37 = class83.field1327[var8[var9]];
                                var38 = var33.method2415(0).field2803;
                                if (var37.field7089) {
                                    var36 = 2;
                                }
                            } else {
                                var38 = var32.field4137;
                                if (~var38 == 0) {
                                    var38 = var33.method2415(0).field2803;
                                }
                            }
                            class127[] var39 = class397.field5929;
                            if (var38 != -1) {
                                class127[] var40 = (class127[]) class125.field1877.method2288((long) var38, 0);
                                if (var40 == null) {
                                    class319[] var41 = class319.method1995(class142.field2146, var38, 0);
                                    if (var41 != null) {
                                        var40 = new class127[var41.length];
                                        for (int var42 = 0; var41.length > var42; ++var42) {
                                            var40[var42] = class407.field6147.method98(var41[var42], true);
                                        }
                                        class125.field1877.method2290((long) var38, var40, 105);
                                    }
                                }
                                if (var40 != null && ~var40.length <= -3) {
                                    var39 = var40;
                                }
                            }
                            if (var36 >= var39.length) {
                                var36 = 1;
                            }
                            class127 var43 = var39[0];
                            class127 var44 = var39[var36];
                            var45 = var34 - Math.max(class342.field5252.field6516, var43.method465());
                            int var46 = class142.field2140[0] + arg0 + -(var43.method470() >> 1);
                            int var47 = var43.method470() * var33.field5978 / 255;
                            if (~var33.field5978 < -1 && var47 < 2) {
                                var47 = 2;
                            }
                            var43.method936(var46, var45);
                            class407.field6147.method159(var46, var45, var46 + var47, var45 - -var43.method465());
                            var44.method936(var46, var45);
                            class407.field6147.method84(arg0, arg3, arg0 - -arg4, arg1 + arg3);
                        } else {
                            var45 = var34 - Math.max(class342.field5252.field6516, class397.field5929[0].method465());
                        }
                        var45 -= 2;
                        if (!var33.field5981) {
                            if (var33.field5983 > class86.field1350) {
                                class127 var48 = class367.field5596[!var33.field6052 ? 0 : 2];
                                class127 var49 = class367.field5596[!var33.field6052 ? 1 : 3];
                                boolean var50 = true;
                                int var51;
                                if (var33 instanceof class351) {
                                    var51 = var32.field4136;
                                    if (~var51 == 0) {
                                        var51 = var33.method2415(0).field2828;
                                    }
                                } else {
                                    var51 = var33.method2415(0).field2828;
                                }
                                if (var51 != -1) {
                                    class127[] var52 = (class127[]) class32.field451.method2288((long) var51, 0);
                                    if (var52 == null) {
                                        class319[] var53 = class319.method1995(class142.field2146, var51, 0);
                                        if (var53 != null) {
                                            var52 = new class127[var53.length];
                                            for (int var54 = 0; var53.length > var54; ++var54) {
                                                var52[var54] = class407.field6147.method98(var53[var54], true);
                                            }
                                            class32.field451.method2290((long) var51, var52, 103);
                                        }
                                    }
                                    if (var52 != null && var52.length == 4) {
                                        var48 = var52[!var33.field6052 ? 0 : 2];
                                        var49 = var52[!var33.field6052 ? 1 : 3];
                                    }
                                }
                                int var55 = -class86.field1350 + var33.field5983;
                                int var58;
                                if (~var33.field6046 > ~var55) {
                                    int var56 = var55 - var33.field6046;
                                    int var57 = var33.field6031 != 0 ? (var33.field5996 - var56) / var33.field6031 * var33.field6031 : 0;
                                    var58 = var57 * var48.method470() / var33.field5996;
                                } else {
                                    var58 = var48.method470();
                                }
                                int var59 = var48.method465();
                                var45 -= var59;
                                int var60 = arg0 - (-class142.field2140[0] + (var48.method470() >> 1));
                                var48.method936(var60, var45);
                                class407.field6147.method159(var60, var45, var60 - -var58, var45 + var59);
                                var49.method936(var60, var45);
                                var45 -= 2;
                                class407.field6147.method84(arg0, arg3, arg0 + arg4, arg1 + arg3);
                            }
                            if (var9 < var7) {
                                class480 var61 = (class480) var33;
                                if (~var61.field7073 != 0) {
                                    var45 -= 25;
                                    class52.field672[var61.field7073].method936(arg0 - (-class142.field2140[0] + 12), var45);
                                    var45 -= 2;
                                }
                                if (var61.field7092 != -1) {
                                    var45 -= 25;
                                    class320.field4929[var61.field7092].method936(class142.field2140[0] + arg0 + -12, var45);
                                    var45 -= 2;
                                }
                            } else if (var32.field4129 >= 0 && ~var32.field4129 > ~class320.field4929.length) {
                                var45 -= 25;
                                class127 var62 = class320.field4929[var32.field4129];
                                var62.method936(class142.field2140[0] + arg0 + -(var62.method470() >> 1), var45);
                                var45 -= 2;
                            }
                        }
                        int var10000;
                        if (var33 instanceof class480) {
                            if (var9 >= 0) {
                                int var63 = 0;
                                class427[] var64 = class390.field5874;
                                for (int var65 = 0; var64.length > var65; ++var65) {
                                    class427 var67 = var64[var65];
                                    if (var67 != null && ~var67.field6358 == -11 && ~var8[var9] == ~var67.field6361) {
                                        class127 var68 = class320.field4932[var67.field6360];
                                        if (var63 < var68.method465()) {
                                            var63 = var68.method465();
                                        }
                                        var68.method936(class142.field2140[0] + -12 + arg0, -var68.method465() + var45);
                                    }
                                }
                                if (~var63 < -1) {
                                    var10000 = var45 - (var63 - -2);
                                }
                            }
                        } else {
                            int var69 = 0;
                            class427[] var70 = class390.field5874;
                            for (int var71 = 0; ~var70.length < ~var71; ++var71) {
                                class427 var76 = var70[var71];
                                if (var76 != null && var76.field6358 == 1 && ~class327.field5114[-var7 + var9] == ~var76.field6361) {
                                    class127 var77 = class320.field4932[var76.field6360];
                                    if (~var69 > ~var77.method465()) {
                                        var69 = var77.method465();
                                    }
                                    if (class86.field1350 % 20 < 10) {
                                        var77.method936(class142.field2140[0] + arg0 - 12, -var77.method465() + var45);
                                    }
                                }
                            }
                            if (var69 > 0) {
                                var10000 = var45 - (var69 + 2);
                            }
                        }
                        for (int var73 = 0; var73 < 4; ++var73) {
                            if (~var33.field6028[var73] < ~class86.field1350) {
                                int var74 = var33.method2119(131072) / 2;
                                class364.method2173(arg4 >> 1, arg6, var33, var74, (byte) 111, arg2, arg1 >> 1);
                                if (~class142.field2140[0] < 0) {
                                    int var75 = class456.field6688[var33.field5988[var73]].method470();
                                    if (var73 == 1) {
                                        class142.field2140[1] -= 20;
                                    }
                                    if (var73 == 2) {
                                        class142.field2140[0] -= var75 - 9;
                                        class142.field2140[1] -= 10;
                                    }
                                    if (~var73 == -4) {
                                        class142.field2140[1] -= 10;
                                        class142.field2140[0] += var75 + -9;
                                    }
                                    class456.field6688[var33.field5988[var73]].method936(arg0 - -class142.field2140[0] - (var75 >> 1), class142.field2140[1] + arg3 + -12);
                                    class267.field3975.method1922(23063, 0, -1, Integer.toString(var33.field6049[var73]), arg0 - (-class142.field2140[0] - -1), class142.field2140[1] + 3 + arg3);
                                }
                            }
                        }
                    }
                }
            }
            for (int var10 = 0; var10 < class325.field5071; ++var10) {
                int var28 = class201.field2932[var10];
                class400 var29;
                if (~var28 > -2049) {
                    var29 = class83.field1327[var28];
                } else {
                    var29 = class88.field1375[var28 + -2048];
                }
                int var30 = class187.field2752[var10];
                class400 var31;
                if (~var30 <= -2049) {
                    var31 = class88.field1375[var30 + -2048];
                } else {
                    var31 = class83.field1327[var30];
                }
                class167.method1163(arg3, arg6, --var29.field6048, arg0, var29, var31, arg2, false, arg1, arg4);
            }
            int var11 = class342.field5252.field6503 + 2 + class342.field5252.field6516;
            for (int var12 = 0; var12 < class103.field1555; ++var12) {
                int var13 = class50.field643[var12];
                int var14 = class50.field642[var12];
                int var15 = class50.field646[var12];
                boolean var16 = true;
                while (var16) {
                    var16 = false;
                    for (int var27 = 0; var27 < var12; ++var27) {
                        if (~(class50.field642[var27] - var11) > ~(var14 - -2) && class50.field642[var27] + 2 > -var11 + var14 && ~(class50.field643[var27] - -class50.field646[var27]) < ~(-var15 + var13) && ~(var13 + var15) < ~(class50.field643[var27] + -class50.field646[var27]) && ~var14 < ~(class50.field642[var27] + -var11)) {
                            var14 = class50.field642[var27] - var11;
                            var16 = true;
                        }
                    }
                }
                class50.field642[var12] = var14;
                String var17 = class50.field641[var12];
                if (class352.field5425 != 0) {
                    class345.field5325.method1922(23063, -16777216, -256, var17, arg0 + var13, arg3 + var14);
                } else {
                    int var18 = 16776960;
                    if (~class50.field645[var12] > -7) {
                        var18 = class348.field5356[class50.field645[var12]];
                    }
                    if (~class50.field645[var12] == -7) {
                        var18 = class439.field6459 % 20 >= 10 ? 16776960 : 16711680;
                    }
                    if (~class50.field645[var12] == -8) {
                        var18 = class439.field6459 % 20 < 10 ? 255 : 65535;
                    }
                    if (~class50.field645[var12] == -9) {
                        var18 = ~(class439.field6459 % 20) > -11 ? 45056 : 8454016;
                    }
                    if (~class50.field645[var12] == -10) {
                        int var19 = 150 - class50.field648[var12];
                        if (var19 >= 50) {
                            if (~var19 <= -101) {
                                if (~var19 > -151) {
                                    var18 = var19 * 5 + -500 + 65280;
                                }
                            } else {
                                var18 = 16776960 - (var19 + -50) * 327680;
                            }
                        } else {
                            var18 = 16711680 - -(var19 * 1280);
                        }
                    }
                    if (class50.field645[var12] == 10) {
                        int var20 = 150 - class50.field648[var12];
                        if (var20 < 50) {
                            var18 = var20 * 5 + 16711680;
                        } else if (~var20 > -101) {
                            var18 = -(var20 * 327680) - -33095935;
                        } else if (~var20 > -151) {
                            var18 = var20 * 327680 + -32768000 + 755 + -(var20 * 5);
                        }
                    }
                    if (class50.field645[var12] == 11) {
                        int var21 = -class50.field648[var12] + 150;
                        if (~var21 > -51) {
                            var18 = -(var21 * 327685) + 16777215;
                        } else if (~var21 <= -101) {
                            if (~var21 > -151) {
                                var18 = -((var21 - 100) * 327680) + 16777215;
                            }
                        } else {
                            var18 = var21 * 327685 + -16318970;
                        }
                    }
                    int var22 = -16777216 | var18;
                    if (class50.field647[var12] == 0) {
                        class345.field5325.method1922(23063, -16777216, var22, var17, arg0 - -var13, arg3 + var14);
                    }
                    if (~class50.field647[var12] == -2) {
                        class345.field5325.method1925(arg3 - -var14, var22, class439.field6459, -16777216, 5, var17, arg0 + var13);
                    }
                    if (class50.field647[var12] == 2) {
                        class345.field5325.method1915(var22, arg3 + var14, class439.field6459, -16777216, 5, var17, arg0 - -var13);
                    }
                    if (~class50.field647[var12] == -4) {
                        class345.field5325.method1926(var22, -10919, -16777216, 150 - class50.field648[var12], class439.field6459, arg0 - -var13, arg3 + var14, var17);
                    }
                    if (~class50.field647[var12] == -5) {
                        int var23 = (-class50.field648[var12] + 150) * (class342.field5252.method2599(var17, (byte) 109) - -100) / 150;
                        class407.field6147.method159(arg0 + var13 - 50, arg3, arg0 + var13 + 50, arg3 - -arg1);
                        class345.field5325.method1918(-16777216, arg3 + var14, var22, 121, var17, arg0 - var23 + var13 + 50);
                        class407.field6147.method84(arg0, arg3, arg0 + arg4, arg1 + arg3);
                    }
                    if (~class50.field647[var12] == -6) {
                        int var24 = -class50.field648[var12] + 150;
                        int var25 = 0;
                        if (~var24 > -26) {
                            var25 = var24 + -25;
                        } else if (~var24 < -126) {
                            var25 = var24 + -125;
                        }
                        int var26 = class342.field5252.field6516 + class342.field5252.field6503;
                        class407.field6147.method159(arg0, -var26 + arg3 + var14 + -1, arg0 + arg4, var14 + 5 + arg3);
                        class345.field5325.method1922(23063, -16777216, var22, var17, arg0 + var13, arg3 + var14 + var25);
                        class407.field6147.method84(arg0, arg3, arg0 + arg4, arg1 + arg3);
                    }
                }
            }
        }
    }
}
