import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tfa")
public class class31 extends class314 {

    @OriginalMember(owner = "client!tfa", name = "N", descriptor = "Lac;")
    public static class501 field451 = new class501("LOCAL", 4);

    @OriginalMember(owner = "client!tfa", name = "Q", descriptor = "I")
    public static int field454 = 1405;

    @OriginalMember(owner = "client!tfa", name = "U", descriptor = "[I")
    public static int[] field458 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!tfa", name = "L", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!tfa", name = "M", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!tfa", name = "O", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!tfa", name = "P", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!tfa", name = "R", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!tfa", name = "S", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!tfa", name = "T", descriptor = "[Ljr;")
    public static class96[] field457;

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(II)[I", line = 3)
    public final int[] method6(int arg0, int arg1) {
        if (arg1 < 109) {
            method439(-68);
        }
        ++field452;
        int[] var3 = super.field4928.method534((byte) -48, arg0);
        if (super.field4928.field618) {
            int var4 = class657.field9166[arg0];
            for (int var5 = 0; ~var5 > ~class81.field1009; ++var5) {
                var3[var5] = this.method437(true, var4, class328.field5091[var5]) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(ZII)I", line = 36)
    private final int method437(boolean arg0, int arg1, int arg2) {
        ++field456;
        int var4 = arg1 * 57 + arg2;
        int var5 = var4 ^ var4 << 1;
        if (!arg0) {
            method439(-93);
        }
        return -(((var5 * 15731 * var5 - -789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144) + 4096;
    }

    @OriginalMember(owner = "client!tfa", name = "h", descriptor = "(I)Z", line = 50)
    public static final boolean method438(int arg0) {
        ++field449;
        if (arg0 != 16776960) {
            return true;
        } else {
            return !class106.method1005("jaclib", (byte) 122) ? false : class106.method1005("hw3d", (byte) 123);
        }
    }

    @OriginalMember(owner = "client!tfa", name = "i", descriptor = "(I)V", line = 68)
    public static final void method439(int arg0) {
        ++field450;
        class373.method2453(false, 101);
        if (~class368.field5763 <= arg0 && class368.field5763 != 0) {
            class265.method1878(class368.field5763, arg0 + -14472);
            class368.field5763 = -1;
        }
    }

    @OriginalMember(owner = "client!tfa", name = "b", descriptor = "(B)V", line = 82)
    public static void method440(byte arg0) {
        if (arg0 > -77) {
            field454 = -68;
        }
        field457 = null;
        field458 = null;
        field451 = null;
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(IIIIIII)V", line = 94)
    public static final void method441(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg6 != -15003) {
            method438(-108);
        }
        ++field453;
        int var7 = class99.field1607;
        int[] var8 = class359.field5700;
        class155.field2647 = 0;
        for (int var9 = 0; ~var9 > ~(var7 - -class283.field4523); ++var9) {
            class705 var32 = null;
            class260 var33;
            if (~var7 < ~var9) {
                var33 = class597.field8465[var8[var9]];
            } else {
                var33 = ((class348) class592.field8395.method1558((long) class102.field1690[-var7 + var9], (byte) -93)).field5577;
                var32 = ((class589) var33).field8354;
                if (var32.field9912 != null) {
                    var32 = var32.method3973(true, class539.field7869);
                    if (var32 == null) {
                        continue;
                    }
                }
            }
            if (~var33.field4187 <= -1 && (~class607.field8632 == ~var33.field4237 || ~class567.field8141.field9695 == ~var33.field9695)) {
                class27.method423(arg3, arg6 ^ -15003, arg0 >> 1, arg1, var33.method1848((byte) 91), var33, arg2 >> 1);
                if (class321.field5031[0] >= 0) {
                    if (var33.field4182 != null && (var7 <= var9 || ~class174.field2878 == -1 || ~class174.field2878 == -4 || class174.field2878 == 1 && class503.method3059((byte) -77, ((class304) var33).field4792)) && ~class52.field692 < ~class155.field2647) {
                        class52.field701[class155.field2647] = class35.field508.method3672(var33.field4182, false) / 2;
                        class52.field696[class155.field2647] = class321.field5031[0];
                        class52.field704[class155.field2647] = class321.field5031[1];
                        class52.field694[class155.field2647] = var33.field4252;
                        class52.field707[class155.field2647] = var33.field4171;
                        class52.field697[class155.field2647] = var33.field4246;
                        class52.field706[class155.field2647] = var33.field4182;
                        ++class155.field2647;
                    }
                    int var34 = class321.field5031[1] + arg4;
                    int var45;
                    if (!var33.field4180 && class562.field8084 < var33.field4190) {
                        boolean var35 = true;
                        byte var36 = 1;
                        int var38;
                        if (~var7 < ~var9) {
                            class304 var37 = class597.field8465[var8[var9]];
                            var38 = var33.method1856(arg6 ^ -15907).field9004;
                            if (var37.field4758) {
                                var36 = 2;
                            }
                        } else {
                            var38 = var32.field9982;
                            if (~var38 == 0) {
                                var38 = var33.method1856(1208).field9004;
                            }
                        }
                        class702[] var39 = class262.field4278;
                        if (~var38 != 0) {
                            class702[] var40 = (class702[]) class462.field6900.method560(false, (long) var38);
                            if (var40 == null) {
                                class284[] var41 = class284.method2018(class158.field2699, var38, 0);
                                if (var41 != null) {
                                    var40 = new class702[var41.length];
                                    for (int var42 = 0; var42 < var41.length; ++var42) {
                                        var40[var42] = class627.field8857.method265(var41[var42], true);
                                    }
                                    class462.field6900.method559(var40, (long) var38, 0);
                                }
                            }
                            if (var40 != null && var40.length >= 2) {
                                var39 = var40;
                            }
                        }
                        if (var39.length <= var36) {
                            var36 = 1;
                        }
                        class702 var43 = var39[0];
                        class702 var44 = var39[var36];
                        var45 = var34 - Math.max(class35.field508.field8890, var43.method1075());
                        int var46 = class321.field5031[0] + arg5 + -(var43.method1083() >> 1);
                        int var47 = var43.method1083() * var33.field4186 / 255;
                        if (~var33.field4186 < -1 && ~var47 > -3) {
                            var47 = 2;
                        }
                        var43.method3960(var46, var45);
                        class627.field8857.method271(var46, var45, var46 + var47, var45 - -var43.method1075());
                        var44.method3960(var46, var45);
                        class627.field8857.method352(arg5, arg4, arg0 + arg5, arg2 + arg4);
                    } else {
                        var45 = var34 - Math.max(class35.field508.field8890, class262.field4278[0].method1075());
                    }
                    var45 -= 2;
                    if (!var33.field4180) {
                        if (var33.field4205 > class562.field8084) {
                            class702 var48 = class149.field2479[!var33.field4179 ? 0 : 2];
                            class702 var49 = class149.field2479[var33.field4179 ? 3 : 1];
                            boolean var50 = true;
                            int var51;
                            if (var33 instanceof class589) {
                                var51 = var32.field9962;
                                if (~var51 == 0) {
                                    var51 = var33.method1856(1208).field9040;
                                }
                            } else {
                                var51 = var33.method1856(1208).field9040;
                            }
                            if (~var51 != 0) {
                                class702[] var52 = (class702[]) class206.field3450.method560(false, (long) var51);
                                if (var52 == null) {
                                    class284[] var53 = class284.method2018(class158.field2699, var51, 0);
                                    if (var53 != null) {
                                        var52 = new class702[var53.length];
                                        for (int var54 = 0; ~var53.length < ~var54; ++var54) {
                                            var52[var54] = class627.field8857.method265(var53[var54], true);
                                        }
                                        class206.field3450.method559(var52, (long) var51, 0);
                                    }
                                }
                                if (var52 != null && var52.length == 4) {
                                    var49 = var52[!var33.field4179 ? 1 : 3];
                                    var48 = var52[!var33.field4179 ? 0 : 2];
                                }
                            }
                            int var55 = -class562.field8084 + var33.field4205;
                            int var56;
                            if (~var33.field4248 <= ~var55) {
                                var56 = var48.method1083();
                            } else {
                                int var57 = var55 - var33.field4248;
                                int var58 = var33.field4236 == 0 ? 0 : (-var57 + var33.field4250) / var33.field4236 * var33.field4236;
                                var56 = var48.method1083() * var58 / var33.field4250;
                            }
                            int var59 = var48.method1075();
                            var45 -= var59;
                            int var60 = class321.field5031[0] + (arg5 - (var48.method1083() >> 1));
                            var48.method3960(var60, var45);
                            class627.field8857.method271(var60, var45, var56 + var60, var45 + var59);
                            var49.method3960(var60, var45);
                            class627.field8857.method352(arg5, arg4, arg0 + arg5, arg2 + arg4);
                            var45 -= 2;
                        }
                        if (~var9 <= ~var7) {
                            if (var32.field9908 >= 0 && ~class70.field888.length < ~var32.field9908) {
                                var45 -= 25;
                                class702 var61 = class70.field888[var32.field9908];
                                var61.method3960(class321.field5031[0] + arg5 + -(var61.method1083() >> 1), var45);
                                var45 -= 2;
                            }
                        } else {
                            class304 var62 = (class304) var33;
                            if (~var62.field4754 != 0) {
                                var45 -= 25;
                                class350.field5591[var62.field4754].method3960(arg5 - -class321.field5031[0] + -12, var45);
                                var45 -= 2;
                            }
                            if (var62.field4764 != -1) {
                                var45 -= 25;
                                class70.field888[var62.field4764].method3960(arg5 + -12 + class321.field5031[0], var45);
                                var45 -= 2;
                            }
                        }
                    }
                    int var10000;
                    if (!(var33 instanceof class304)) {
                        int var63 = 0;
                        class515[] var64 = class472.field6987;
                        for (int var65 = 0; ~var65 > ~var64.length; ++var65) {
                            class515 var67 = var64[var65];
                            if (var67 != null && var67.field7483 == 1 && class102.field1690[var9 - var7] == var67.field7485) {
                                class702 var68 = class487.field7143[var67.field7480];
                                if (~var63 > ~var68.method1075()) {
                                    var63 = var68.method1075();
                                }
                                if (class562.field8084 % 20 < 10) {
                                    var68.method3960(class321.field5031[0] + -12 + arg5, var45 + -var68.method1075());
                                }
                            }
                        }
                        if (~var63 < -1) {
                            var10000 = var45 - (var63 - -2);
                        }
                    } else if (~var9 <= -1) {
                        int var69 = 0;
                        class515[] var70 = class472.field6987;
                        for (int var71 = 0; ~var71 > ~var70.length; ++var71) {
                            class515 var73 = var70[var71];
                            if (var73 != null && ~var73.field7483 == -11 && ~var8[var9] == ~var73.field7485) {
                                class702 var74 = class487.field7143[var73.field7480];
                                if (~var69 > ~var74.method1075()) {
                                    var69 = var74.method1075();
                                }
                                var74.method3960(class321.field5031[0] + arg5 - 12, var45 - var74.method1075());
                            }
                        }
                        if (~var69 < -1) {
                            var10000 = var45 - (var69 + 2);
                        }
                    }
                    for (int var75 = 0; var75 < 4; ++var75) {
                        if (~class562.field8084 > ~var33.field4154[var75]) {
                            int var76 = var33.method1848((byte) 86) / 2;
                            class27.method423(arg3, 0, arg0 >> 1, arg1, var76, var33, arg2 >> 1);
                            if (class321.field5031[0] > -1) {
                                int var77 = class575.field8195[var33.field4167[var75]].method1083();
                                if (~var75 == -2) {
                                    class321.field5031[1] -= 20;
                                }
                                if (var75 == 2) {
                                    class321.field5031[0] -= var77 + -9;
                                    class321.field5031[1] -= 10;
                                }
                                if (~var75 == -4) {
                                    class321.field5031[1] -= 10;
                                    class321.field5031[0] += var77 + -9;
                                }
                                class575.field8195[var33.field4167[var75]].method3960(class321.field5031[0] + arg5 + -(var77 >> 1), arg4 + -12 + class321.field5031[1]);
                                class329.field5095.method2654(class321.field5031[1] + 3 + arg4, 0, -1, Integer.toString(var33.field4222[var75]), class321.field5031[0] + arg5 + -1, true);
                            }
                        }
                    }
                }
            }
        }
        for (int var10 = 0; var10 < class469.field6954; ++var10) {
            int var28 = class344.field5547[var10];
            class260 var29;
            if (~var28 <= -2049) {
                var29 = ((class348) class592.field8395.method1558((long) (var28 - 2048), (byte) -93)).field5577;
            } else {
                var29 = class597.field8465[var28];
            }
            int var30 = class28.field437[var10];
            class260 var31;
            if (~var30 > -2049) {
                var31 = class597.field8465[var30];
            } else {
                var31 = ((class348) class592.field8395.method1558((long) (var30 - 2048), (byte) -93)).field5577;
            }
            class211.method1600(arg1, arg3, var29, arg2, arg5, arg0, --var29.field4161, arg4, 256, var31);
        }
        int var11 = class35.field508.field8893 + class35.field508.field8890 - -2;
        for (int var12 = 0; ~var12 > ~class155.field2647; ++var12) {
            int var13 = class52.field696[var12];
            int var14 = class52.field704[var12];
            int var15 = class52.field701[var12];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var27 = 0; var27 < var12; ++var27) {
                    if (class52.field704[var27] + -var11 < var14 + 2 && -var11 + var14 < class52.field704[var27] - -2 && ~(class52.field701[var27] + class52.field696[var27]) < ~(-var15 + var13) && ~(var13 - -var15) < ~(class52.field696[var27] + -class52.field701[var27]) && ~(class52.field704[var27] + -var11) > ~var14) {
                        var16 = true;
                        var14 = class52.field704[var27] + -var11;
                    }
                }
            }
            class52.field704[var12] = var14;
            String var17 = class52.field706[var12];
            if (class325.field5057 == 0) {
                int var18 = 16776960;
                if (class52.field694[var12] < 6) {
                    var18 = class130.field2138[class52.field694[var12]];
                }
                if (~class52.field694[var12] == -7) {
                    var18 = class607.field8632 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (class52.field694[var12] == 7) {
                    var18 = class607.field8632 % 20 < 10 ? 255 : 65535;
                }
                if (class52.field694[var12] == 8) {
                    var18 = class607.field8632 % 20 >= 10 ? 8454016 : 45056;
                }
                if (~class52.field694[var12] == -10) {
                    int var19 = 150 - class52.field697[var12];
                    if (var19 >= 50) {
                        if (~var19 <= -101) {
                            if (var19 < 150) {
                                var18 = (var19 - 100) * 5 + 65280;
                            }
                        } else {
                            var18 = -((var19 - 50) * 327680) + 16776960;
                        }
                    } else {
                        var18 = 16711680 - -(var19 * 1280);
                    }
                }
                if (class52.field694[var12] == 10) {
                    int var20 = -class52.field697[var12] + 150;
                    if (~var20 <= -51) {
                        if (var20 >= 100) {
                            if (var20 < 150) {
                                var18 = var20 * 327680 - 32768000 + -((var20 + -100) * 5) + 255;
                            }
                        } else {
                            var18 = -(var20 * 327680) + 16384000 + 16711935;
                        }
                    } else {
                        var18 = var20 * 5 + 16711680;
                    }
                }
                if (class52.field694[var12] == 11) {
                    int var21 = -class52.field697[var12] + 150;
                    if (var21 >= 50) {
                        if (~var21 > -101) {
                            var18 = (var21 - 50) * 327685 + 65280;
                        } else if (~var21 > -151) {
                            var18 = -((var21 + -100) * 327680) + 16777215;
                        }
                    } else {
                        var18 = -(var21 * 327685) + 16777215;
                    }
                }
                int var22 = var18 | -16777216;
                if (class52.field707[var12] == 0) {
                    class246.field3928.method2654(arg4 - -var14, -16777216, var22, var17, arg5 + var13, true);
                }
                if (~class52.field707[var12] == -2) {
                    class246.field3928.method2665(arg5 - -var13, -16777216, var22, 124, arg4 + var14, class607.field8632, var17);
                }
                if (class52.field707[var12] == 2) {
                    class246.field3928.method2652((byte) 47, var22, class607.field8632, arg5 + var13, -16777216, var17, arg4 + var14);
                }
                if (class52.field707[var12] == 3) {
                    class246.field3928.method2662(-16777216, false, 150 - class52.field697[var12], var17, var22, arg5 + var13, arg4 + var14, class607.field8632);
                }
                if (~class52.field707[var12] == -5) {
                    int var23 = (-class52.field697[var12] + 150) * (class35.field508.method3672(var17, false) + 100) / 150;
                    class627.field8857.method271(arg5 + var13 + -50, arg4, arg5 + var13 + 50, arg2 + arg4);
                    class246.field3928.method2657(var17, -16777216, arg5 + var13 + 50 + -var23, var22, arg4 + var14, (byte) -108);
                    class627.field8857.method352(arg5, arg4, arg5 - -arg0, arg4 - -arg2);
                }
                if (~class52.field707[var12] == -6) {
                    int var24 = -class52.field697[var12] + 150;
                    int var25 = 0;
                    if (var24 >= 25) {
                        if (var24 > 125) {
                            var25 = var24 + -125;
                        }
                    } else {
                        var25 = var24 + -25;
                    }
                    int var26 = class35.field508.field8893 + class35.field508.field8890;
                    class627.field8857.method271(arg5, arg4 + -1 + var14 + -var26, arg0 + arg5, arg4 + 5 + var14);
                    class246.field3928.method2654(var14 + var25 + arg4, -16777216, var22, var17, arg5 + var13, true);
                    class627.field8857.method352(arg5, arg4, arg0 + arg5, arg2 + arg4);
                }
            } else {
                class246.field3928.method2654(arg4 + var14, -16777216, -256, var17, arg5 + var13, true);
            }
        }
    }

    @OriginalMember(owner = "client!tfa", name = "<init>", descriptor = "()V", line = 674)
    public class31() {
        super(0, true);
    }
}
