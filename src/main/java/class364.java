import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gha")
public class class364 extends class54 {

    @OriginalMember(owner = "client!gha", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5582 = new String[] { method2958(method2957("kV\u0014\u000f%$")), method2958(method2957("kV\u0014\u000f&$")), method2958(method2957("kV\u0014\u000f!$")), method2958(method2957("kV\u0014\u000f($")), method2958(method2957("bK\u0019M")), method2958(method2957("w\u0010[\u000f\u001f")), method2958(method2957("kV\u0014\u000f#$")), method2958(method2957("kV\u0014\u000f+$")), method2958(method2957("kV\u0014\u000f $")), method2958(method2957("kV\u0014\u000f*$")), method2958(method2957("kV\u0014\u000f$$")), method2958(method2957("kV\u0014\u000f'$")) };

    @OriginalMember(owner = "client!gha", name = "s", descriptor = "[C")
    public static char[] field5574 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!gha", name = "w", descriptor = "Z")
    public static boolean field5576 = false;

    @OriginalMember(owner = "client!gha", name = "q", descriptor = "I")
    public static int field5571;

    @OriginalMember(owner = "client!gha", name = "v", descriptor = "I")
    public static int field5572;

    @OriginalMember(owner = "client!gha", name = "n", descriptor = "I")
    public static int field5573;

    @OriginalMember(owner = "client!gha", name = "o", descriptor = "I")
    public static int field5575;

    @OriginalMember(owner = "client!gha", name = "r", descriptor = "I")
    public static int field5577;

    @OriginalMember(owner = "client!gha", name = "p", descriptor = "I")
    public static int field5578;

    @OriginalMember(owner = "client!gha", name = "t", descriptor = "I")
    public static int field5579;

    @OriginalMember(owner = "client!gha", name = "u", descriptor = "I")
    public static int field5580;

    @OriginalMember(owner = "client!gha", name = "m", descriptor = "I")
    public static int field5581;

    @OriginalMember(owner = "client!gha", name = "d", descriptor = "(I)V", line = 5)
    public static void method2951(int arg0) {
        try {
            field5574 = null;
            if (arg0 != -26071) {
                method2956(-102, -90, 91, -86, 4, (byte) 63, 104);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field5582[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gha", name = "c", descriptor = "(Z)I", line = 15)
    public final int method2952(boolean arg0) {
        try {
            ++field5571;
            return arg0 ? -32 : super.field593;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field5582[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(II)V", line = 30)
    public final void method113(int arg0, int arg1) {
        try {
            super.field593 = arg1;
            ++field5572;
            if (arg0 != 0) {
                this.method2952(true);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field5582[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(B)V", line = 42)
    public static final void method2953(byte arg0) {
        try {
            if (class251.field3897 != 0) {
                if (class629.field9198 != null) {
                    class629.field9198.method2700((byte) 124);
                    class629.field9198 = null;
                }
                class225.method1949(-72);
                class37.method241((byte) -77);
            }
            ++field5573;
            int var1 = -40 % ((arg0 - 7) / 53);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field5582[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(IIIZLqa;)Z", line = 66)
    public static final boolean method2954(int arg0, int arg1, int arg2, boolean arg3, class261 arg4) {
        try {
            ++field5581;
            if (class64.field658 && class16.field197) {
                if (~class73.field850 > -101) {
                    return false;
                } else if (!class56.method418(arg0, arg2, 109, arg1)) {
                    return false;
                } else {
                    int var5 = arg1 << class602.field8828;
                    int var6 = arg0 << class602.field8828;
                    int var7 = class555.field8261[arg2].method2407(arg0, arg1, -109) - 1;
                    int var8 = var7 + arg4.method1088(-2226);
                    if (~arg4.field4023 == -2) {
                        if (!class351.method2882(123, class358.field5488 + var6, var6, var8, var5, var5, var5, var7, var8, var6)) {
                            return false;
                        } else if (!class351.method2882(123, class358.field5488 + var6, var6, var8, var5, var5, var5, var7, var7, class358.field5488 + var6)) {
                            return false;
                        } else {
                            ++class26.field324;
                            return true;
                        }
                    } else if (~arg4.field4023 == -3) {
                        if (!class351.method2882(112, class358.field5488 + var6, var6 - -class358.field5488, var8, class358.field5488 + var5, var5, var5, var7, var8, class358.field5488 + var6)) {
                            return false;
                        } else if (!class351.method2882(115, class358.field5488 + var6, var6 - -class358.field5488, var7, class358.field5488 + var5, var5 - -class358.field5488, var5, var7, var8, var6 - -class358.field5488)) {
                            return false;
                        } else {
                            ++class26.field324;
                            return true;
                        }
                    } else if (~arg4.field4023 == -5) {
                        if (!class351.method2882(122, var6 - -class358.field5488, var6, var8, class358.field5488 + var5, class358.field5488 + var5, class358.field5488 + var5, var7, var8, var6)) {
                            return false;
                        } else if (!class351.method2882(125, class358.field5488 + var6, var6, var8, class358.field5488 + var5, class358.field5488 + var5, class358.field5488 + var5, var7, var7, class358.field5488 + var6)) {
                            return false;
                        } else {
                            ++class26.field324;
                            return true;
                        }
                    } else if (arg4.field4023 == 8) {
                        if (!class351.method2882(115, var6, var6, var8, class358.field5488 + var5, var5, var5, var7, var8, var6)) {
                            return false;
                        } else if (!class351.method2882(120, var6, var6, var7, class358.field5488 + var5, var5 - -class358.field5488, var5, var7, var8, var6)) {
                            return false;
                        } else {
                            ++class26.field324;
                            return true;
                        }
                    } else {
                        if (arg3) {
                            method2955((String) null, 25);
                        }
                        if (~arg4.field4023 == -17) {
                            if (!class546.method4118(-127, var7, var8, class578.field8582 + var6, var5, class578.field8582, class578.field8582)) {
                                return false;
                            } else {
                                ++class26.field324;
                                return true;
                            }
                        } else if (arg4.field4023 == 32) {
                            if (!class546.method4118(-128, var7, var8, class578.field8582 + var6, var5 - -class578.field8582, class578.field8582, class578.field8582)) {
                                return false;
                            } else {
                                ++class26.field324;
                                return true;
                            }
                        } else if (~arg4.field4023 == -65) {
                            if (!class546.method4118(-125, var7, var8, var6, class578.field8582 + var5, class578.field8582, class578.field8582)) {
                                return false;
                            } else {
                                ++class26.field324;
                                return true;
                            }
                        } else if (~arg4.field4023 == -129) {
                            if (!class546.method4118(-127, var7, var8, var6, var5, class578.field8582, class578.field8582)) {
                                return false;
                            } else {
                                ++class26.field324;
                                return true;
                            }
                        } else {
                            return true;
                        }
                    }
                }
            } else {
                return false;
            }
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field5582[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field5582[5] : field5582[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!gha", name = "<init>", descriptor = "(Lhia;)V", line = 193)
    public class364(class73 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!gha", name = "b", descriptor = "(Z)I", line = 199)
    public final int method111(boolean arg0) {
        try {
            if (arg0) {
                return -86;
            } else {
                ++field5580;
                return 3;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field5582[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(Z)V", line = 211)
    public final void method115(boolean arg0) {
        try {
            ++field5575;
            if (!arg0) {
                this.method109(88, (byte) 34);
            }
            if (~super.field593 > -1 || super.field593 > 4) {
                super.field593 = this.method111(false);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field5582[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 228)
    public static final void method2955(String arg0, int arg1) {
        try {
            ++field5579;
            if (class186.field2563 != null) {
                ++class609.field8901;
                class280 var2 = class610.method4508(class16.field196, class279.field4190, (byte) -80);
                var2.field4197.method1428((byte) -24, class554.method4169(23827, arg0));
                var2.field4197.method1464(arg0, 255);
                if (arg1 >= 31) {
                    class106.method934((byte) 53, var2);
                }
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field5582[7] + (arg0 != null ? field5582[5] : field5582[4]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gha", name = "b", descriptor = "(IB)I", line = 248)
    public final int method109(int arg0, byte arg1) {
        try {
            ++field5578;
            return arg1 >= -106 ? -92 : 1;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field5582[8] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gha", name = "<init>", descriptor = "(ILhia;)V", line = 259)
    public class364(int arg0, class73 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(IIIIIBI)V", line = 268)
    public static final void method2956(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        try {
            ++field5577;
            int var7 = class3.field34;
            class731.field10618 = 0;
            int[] var8 = class358.field5483;
            for (int var9 = 0; ~var9 > ~(var7 - -class6.field60); ++var9) {
                class496 var10 = null;
                class247 var11;
                if (var7 <= var9) {
                    var11 = ((class383) class207.field3184.method977((long) class590.field8680[var9 - var7], 1)).field5799;
                    var10 = ((class612) var11).field8947;
                    if (var10.field7110 != null) {
                        var10 = var10.method3742(-1, class276.field4168);
                        if (var10 == null) {
                            continue;
                        }
                    }
                } else {
                    var11 = class197.field2685[var8[var9]];
                }
                if (~var11.field3808 <= -1 && (~class373.field5698 == ~var11.field3766 || ~class225.field3446.field6200 == ~var11.field6200)) {
                    class434.method3318(var11.method2102((byte) 110), var11, arg1 >> 1, arg3 >> 1, 0, arg2, arg4);
                    if (~class694.field10139[0] <= -1) {
                        if (var11.field3782 != null && (var7 <= var9 || ~class757.field10993 == -1 || class757.field10993 == 3 || class757.field10993 == 1 && class358.method2921(((class726) var11).field10506, (byte) -16)) && class71.field777 > class731.field10618) {
                            class71.field766[class731.field10618] = class475.field6895.method4322(256, var11.field3782) / 2;
                            class71.field780[class731.field10618] = class694.field10139[0];
                            class71.field778[class731.field10618] = class694.field10139[1];
                            class71.field773[class731.field10618] = var11.field3805;
                            class71.field767[class731.field10618] = var11.field3776;
                            class71.field768[class731.field10618] = var11.field3812;
                            class71.field779[class731.field10618] = var11.field3782;
                            ++class731.field10618;
                        }
                        int var12 = class694.field10139[1] + arg6;
                        int var13;
                        if (!var11.field3800 && ~class375.field5711 > ~var11.field3787) {
                            boolean var14 = true;
                            byte var15 = 1;
                            int var16;
                            if (var7 <= var9) {
                                var16 = var10.field7153;
                                if (var16 == -1) {
                                    var16 = var11.method2099(127).field1726;
                                }
                            } else {
                                class726 var17 = class197.field2685[var8[var9]];
                                var16 = var11.method2099(120).field1726;
                                if (var17.field10512) {
                                    var15 = 2;
                                }
                            }
                            class581[] var18 = class783.field11415;
                            if (~var16 != 0) {
                                class581[] var19 = (class581[]) class608.field8892.method1558((byte) 96, (long) var16);
                                if (var19 == null) {
                                    class481[] var20 = class481.method3673(class383.field5798, var16, 0);
                                    if (var20 != null) {
                                        var19 = new class581[var20.length];
                                        for (int var21 = 0; var21 < var20.length; ++var21) {
                                            var19[var21] = class610.field8913.method487(var20[var21], true);
                                        }
                                        class608.field8892.method1556((long) var16, var19, 1);
                                    }
                                }
                                if (var19 != null && var19.length >= 2) {
                                    var18 = var19;
                                }
                            }
                            if (~var15 <= ~var18.length) {
                                var15 = 1;
                            }
                            class581 var22 = var18[0];
                            class581 var23 = var18[var15];
                            var13 = var12 - Math.max(class475.field6895.field8574, var22.method986());
                            int var24 = arg0 - (-class694.field10139[0] - -(var22.method991() >> 1));
                            int var25 = var22.method991() * var11.field3764 / 255;
                            int var26 = var22.method986();
                            if (~var11.field3764 < -1 && ~var25 > -3) {
                                var25 = 2;
                            }
                            var22.method4347(var24, var13);
                            class610.field8913.method522(var24, var13, var24 + var25, var13 + var26);
                            var23.method4347(var24, var13);
                            class610.field8913.method489(arg0, arg6, arg0 + arg3, arg1 + arg6);
                            class758.method5495((byte) 50, var13 + var26, var13, var24 + var22.method988(), var24);
                        } else {
                            var13 = var12 - Math.max(class475.field6895.field8574, class783.field11415[0].method986());
                        }
                        var13 -= 2;
                        if (!var11.field3800) {
                            if (class375.field5711 < var11.field3768) {
                                class581 var27 = class744.field10821[var11.field3846 ? 2 : 0];
                                class581 var28 = class744.field10821[var11.field3846 ? 3 : 1];
                                boolean var29 = true;
                                int var30;
                                if (!(var11 instanceof class612)) {
                                    var30 = var11.method2099(111).field1732;
                                } else {
                                    var30 = var10.field7161;
                                    if (~var30 == 0) {
                                        var30 = var11.method2099(114).field1732;
                                    }
                                }
                                if (var30 != -1) {
                                    class581[] var31 = (class581[]) class757.field10996.method1558((byte) 96, (long) var30);
                                    if (var31 == null) {
                                        class481[] var32 = class481.method3673(class383.field5798, var30, 0);
                                        if (var32 != null) {
                                            var31 = new class581[var32.length];
                                            for (int var33 = 0; var33 < var32.length; ++var33) {
                                                var31[var33] = class610.field8913.method487(var32[var33], true);
                                            }
                                            class757.field10996.method1556((long) var30, var31, 1);
                                        }
                                    }
                                    if (var31 != null && ~var31.length == -5) {
                                        var27 = var31[!var11.field3846 ? 0 : 2];
                                        var28 = var31[var11.field3846 ? 3 : 1];
                                    }
                                }
                                int var34 = -class375.field5711 + var11.field3768;
                                int var37;
                                if (var34 > var11.field3829) {
                                    int var35 = var34 - var11.field3829;
                                    int var36 = ~var11.field3795 != -1 ? (-var35 + var11.field3770) / var11.field3795 * var11.field3795 : 0;
                                    var37 = var36 * var27.method991() / var11.field3770;
                                } else {
                                    var37 = var27.method991();
                                }
                                int var38 = var27.method986();
                                var13 -= var38;
                                int var39 = arg0 - -class694.field10139[0] + -(var27.method991() >> 1);
                                var27.method4347(var39, var13);
                                class610.field8913.method522(var39, var13, var37 + var39, var13 + var38);
                                var28.method4347(var39, var13);
                                class610.field8913.method489(arg0, arg6, arg0 + arg3, arg1 + arg6);
                                class758.method5495((byte) 50, var13 + var38, var13, var27.method988() + var39, var39);
                                var13 -= 2;
                            }
                            if (~var9 > ~var7) {
                                class726 var40 = (class726) var11;
                                if (var40.field10490 != -1) {
                                    var13 -= 25;
                                    class581 var41 = class91.field1039[var40.field10490];
                                    var41.method4347(class694.field10139[0] + arg0 + -12, var13);
                                    class758.method5495((byte) 50, var41.method997() + var13, var13, class694.field10139[0] + -12 + (arg0 - -var41.method988()), arg0 + -12 + class694.field10139[0]);
                                    var13 -= 2;
                                }
                                if (var40.field10507 != -1) {
                                    var13 -= 25;
                                    class581 var42 = class125.field1469[var40.field10507];
                                    var42.method4347(class694.field10139[0] + -12 + arg0, var13);
                                    class758.method5495((byte) 50, var13 + var42.method997(), var13, class694.field10139[0] + arg0 - (12 - var42.method988()), class694.field10139[0] - 12 + arg0);
                                    var13 -= 2;
                                }
                            } else if (var10.field7157 >= 0 && ~var10.field7157 > ~class125.field1469.length) {
                                class581 var43 = class125.field1469[var10.field7157];
                                var13 -= 25;
                                var43.method4347(class694.field10139[0] + arg0 - (var43.method991() >> 1), var13);
                                class758.method5495((byte) 50, var13 + var43.method997(), var13, class694.field10139[0] + arg0 + -(var43.method991() >> 1) + var43.method988(), arg0 - (-class694.field10139[0] + (var43.method991() >> 1)));
                                var13 -= 2;
                            }
                        }
                        int var10000;
                        if (var11 instanceof class726) {
                            if (var9 >= 0) {
                                int var44 = 0;
                                class352[] var45 = class708.field10260;
                                for (int var46 = 0; var45.length > var46; ++var46) {
                                    class352 var47 = var45[var46];
                                    if (var47 != null && ~var47.field5432 == -11 && ~var8[var9] == ~var47.field5435) {
                                        class581 var48 = class715.field10345[var47.field5438];
                                        if (var44 < var48.method986()) {
                                            var44 = var48.method986();
                                        }
                                        var48.method4347(class694.field10139[0] + arg0 + -12, var13 + -var48.method986());
                                        class758.method5495((byte) 50, var13 - var48.method986() + var48.method997(), var13 - var48.method986(), arg0 + class694.field10139[0] + (-12 - -var48.method988()), arg0 - (-class694.field10139[0] + 12));
                                    }
                                }
                                if (~var44 < -1) {
                                    var10000 = var13 - (var44 - -2);
                                }
                            }
                        } else {
                            int var50 = 0;
                            class352[] var51 = class708.field10260;
                            for (int var52 = 0; var51.length > var52; ++var52) {
                                class352 var53 = var51[var52];
                                if (var53 != null && var53.field5432 == 1 && class590.field8680[-var7 + var9] == var53.field5435) {
                                    class581 var54 = class715.field10345[var53.field5438];
                                    if (var50 < var54.method986()) {
                                        var50 = var54.method986();
                                    }
                                    if (class375.field5711 % 20 < 10) {
                                        var54.method4347(class694.field10139[0] - 12 + arg0, -var54.method986() + var13);
                                        class758.method5495((byte) 50, -var54.method986() + var13 + var54.method997(), var13 - var54.method986(), -12 + arg0 + (class694.field10139[0] - -var54.method988()), class694.field10139[0] + arg0 - 12);
                                    }
                                }
                            }
                            if (~var50 < -1) {
                                var10000 = var13 - (var50 + 2);
                            }
                        }
                        for (int var56 = 0; ~class411.field6076 < ~var56; ++var56) {
                            int var57 = var11.field3853[var56];
                            int var58 = var11.field3838[var56];
                            class772 var59 = null;
                            int var60 = 0;
                            if (~var58 > -1) {
                                if (~var57 > -1) {
                                    continue;
                                }
                            } else {
                                if (class375.field5711 >= var57) {
                                    continue;
                                }
                                var59 = class81.field924.method4987(-21990, var11.field3838[var56]);
                                var60 = var59.field11233;
                            }
                            int var61 = var11.field3760[var56];
                            class772 var62 = null;
                            if (~var61 <= -1) {
                                var62 = class81.field924.method4987(-21990, var61);
                            }
                            if (~class375.field5711 <= ~(-var60 + var57)) {
                                int var63 = var11.field3789[var56];
                                if (var63 >= 0) {
                                    var11.field3787 = class375.field5711 + 300;
                                    var11.field3764 = var63;
                                    var11.field3789[var56] = -1;
                                }
                                if (var59 == null) {
                                    var11.field3853[var56] = -1;
                                } else {
                                    int var64 = var11.method2102((byte) 35) / 2;
                                    class434.method3318(var64, var11, arg1 >> 1, arg3 >> 1, 0, arg2, arg4);
                                    if (~class694.field10139[0] < 0) {
                                        class694.field10139[0] += class226.field3466[var56];
                                        class694.field10139[1] += class87.field981[var56];
                                        Object var65 = null;
                                        Object var66 = null;
                                        Object var67 = null;
                                        Object var68 = null;
                                        int var69 = 0;
                                        int var70 = 0;
                                        int var71 = 0;
                                        int var72 = 0;
                                        int var73 = 0;
                                        int var74 = 0;
                                        int var75 = 0;
                                        int var76 = 0;
                                        class581 var77 = null;
                                        class581 var78 = null;
                                        class581 var79 = null;
                                        class581 var80 = null;
                                        int var81 = 0;
                                        int var82 = 0;
                                        int var83 = 0;
                                        int var84 = 0;
                                        int var85 = 0;
                                        int var86 = 0;
                                        int var87 = 0;
                                        int var88 = 0;
                                        int var89 = 0;
                                        class581 var90 = var59.method5587(122, class610.field8913);
                                        if (var90 != null) {
                                            var69 = var90.method991();
                                            int var91 = var90.method986();
                                            if (~var91 < ~var89) {
                                                var89 = var91;
                                            }
                                            var90.method994(class521.field7631);
                                            var73 = class521.field7631[0];
                                        }
                                        class581 var92 = var59.method5590(-1, class610.field8913);
                                        if (var92 != null) {
                                            var70 = var92.method991();
                                            int var93 = var92.method986();
                                            if (var93 > var89) {
                                                var89 = var93;
                                            }
                                            var92.method994(class521.field7631);
                                            var74 = class521.field7631[0];
                                        }
                                        class581 var94 = var59.method5597(28566, class610.field8913);
                                        if (var94 != null) {
                                            var71 = var94.method991();
                                            int var95 = var94.method986();
                                            var94.method994(class521.field7631);
                                            if (var89 < var95) {
                                                var89 = var95;
                                            }
                                            var75 = class521.field7631[0];
                                        }
                                        class581 var96 = var59.method5598(class610.field8913, 14528);
                                        if (var96 != null) {
                                            var72 = var96.method991();
                                            int var97 = var96.method986();
                                            if (~var89 > ~var97) {
                                                var89 = var97;
                                            }
                                            var96.method994(class521.field7631);
                                            var76 = class521.field7631[0];
                                        }
                                        if (var62 != null) {
                                            var77 = var62.method5587(97, class610.field8913);
                                            if (var77 != null) {
                                                var81 = var77.method991();
                                                int var98 = var77.method986();
                                                var77.method994(class521.field7631);
                                                if (~var98 < ~var89) {
                                                    var89 = var98;
                                                }
                                                var85 = class521.field7631[0];
                                            }
                                            var78 = var62.method5590(-1, class610.field8913);
                                            if (var78 != null) {
                                                var82 = var78.method991();
                                                int var99 = var78.method986();
                                                if (~var89 > ~var99) {
                                                    var89 = var99;
                                                }
                                                var78.method994(class521.field7631);
                                                var86 = class521.field7631[0];
                                            }
                                            var79 = var62.method5597(28566, class610.field8913);
                                            if (var79 != null) {
                                                var83 = var79.method991();
                                                int var100 = var79.method986();
                                                var79.method994(class521.field7631);
                                                if (~var100 < ~var89) {
                                                    var89 = var100;
                                                }
                                                var87 = class521.field7631[0];
                                            }
                                            var80 = var62.method5598(class610.field8913, 14528);
                                            if (var80 != null) {
                                                var84 = var80.method991();
                                                int var101 = var80.method986();
                                                var80.method994(class521.field7631);
                                                if (var101 > var89) {
                                                    var89 = var101;
                                                }
                                                var88 = class521.field7631[0];
                                            }
                                        }
                                        class67 var102 = class562.field8349;
                                        class67 var103 = class562.field8349;
                                        class578 var104 = class493.field7083;
                                        int var105 = var59.field11219;
                                        class578 var106 = class493.field7083;
                                        if (var105 >= 0) {
                                            class67 var107 = class749.method5450(class610.field8913, true, var105, false);
                                            class578 var108 = class273.method2262(119, var105, class610.field8913);
                                            if (var107 != null && var108 != null) {
                                                var102 = var107;
                                                var104 = var108;
                                            }
                                        }
                                        if (var62 != null) {
                                            int var109 = var62.field11219;
                                            if (~var109 <= -1) {
                                                class67 var110 = class749.method5450(class610.field8913, true, var109, false);
                                                class578 var111 = class273.method2262(85, var109, class610.field8913);
                                                if (var110 != null && var111 != null) {
                                                    var103 = var110;
                                                    var106 = var111;
                                                }
                                            }
                                        }
                                        Object var112 = null;
                                        String var113 = null;
                                        boolean var114 = false;
                                        int var115 = 0;
                                        String var116 = var59.method5588(var11.field3817[var56], (byte) -65);
                                        int var117 = var104.method4322(256, var116);
                                        if (var62 != null) {
                                            var113 = var62.method5588(var11.field3761[var56], (byte) -55);
                                            var115 = var106.method4322(256, var113);
                                        }
                                        int var118 = 0;
                                        if (var70 > 0) {
                                            var118 = var117 / var70 - -1;
                                        }
                                        int var119 = 0;
                                        if (var62 != null && var82 > 0) {
                                            var119 = var115 / var82 + 1;
                                        }
                                        int var120 = 0;
                                        int var121 = var120;
                                        if (var69 > 0) {
                                            var120 += var69;
                                        }
                                        var120 += 2;
                                        int var122 = var120;
                                        if (var71 > 0) {
                                            var120 += var71;
                                        }
                                        int var123 = var120;
                                        int var124 = var120;
                                        int var126;
                                        if (~var70 < -1) {
                                            int var125 = var70 * var118;
                                            var126 = var120 + var125;
                                            var124 = (-var117 + var125) / 2 + var120;
                                        } else {
                                            var126 = var117 + var120;
                                        }
                                        int var127 = var126;
                                        if (~var72 < -1) {
                                            var126 += var72;
                                        }
                                        int var128 = 0;
                                        int var129 = 0;
                                        int var130 = 0;
                                        int var131 = 0;
                                        int var132 = 0;
                                        if (var62 != null) {
                                            var126 += 2;
                                            var128 = var126;
                                            if (~var81 < -1) {
                                                var126 += var81;
                                            }
                                            var126 += 2;
                                            var129 = var126;
                                            if (var83 > 0) {
                                                var126 += var83;
                                            }
                                            var130 = var126;
                                            var132 = var126;
                                            if (~var82 >= -1) {
                                                var126 += var115;
                                            } else {
                                                int var133 = var82 * var119;
                                                var132 = (-var115 + var133) / 2 + var126;
                                                var126 += var133;
                                            }
                                            var131 = var126;
                                            if (~var84 < -1) {
                                                var126 += var84;
                                            }
                                        }
                                        int var134 = var11.field3853[var56] - class375.field5711;
                                        int var135 = -(var59.field11236 * var134 / var59.field11233) + var59.field11236;
                                        int var136 = var59.field11224 * var134 / var59.field11233 + -var59.field11224;
                                        int var137 = class694.field10139[0] + arg0 + -(var126 >> 1) + var135;
                                        int var138 = arg6 - -class694.field10139[1] + -12 + var136;
                                        int var139 = var138;
                                        int var140 = var89 + var138;
                                        int var141 = var138 - -15 + var59.field11220;
                                        int var142 = -var104.field8574 + var141;
                                        int var143 = var141 - -var104.field8571;
                                        if (~var138 < ~var142) {
                                            var139 = var142;
                                        }
                                        if (~var140 > ~var143) {
                                            var140 = var143;
                                        }
                                        int var144 = 0;
                                        if (var62 != null) {
                                            var144 = var138 + 15 - -var62.field11220;
                                            int var145 = -var106.field8574 + var144;
                                            if (~var139 < ~var145) {
                                                var139 = var145;
                                            }
                                            int var146 = var144 - -var106.field8571;
                                            if (~var140 > ~var146) {
                                                var140 = var146;
                                            }
                                        }
                                        int var147 = 255;
                                        if (var59.field11212 >= 0) {
                                            var147 = (var134 << 8) / (-var59.field11212 + var59.field11233);
                                        }
                                        if (var147 >= 0 && ~var147 > -256) {
                                            int var148 = var147 << 24;
                                            int var149 = 16777215 | var148;
                                            if (var90 != null) {
                                                var90.method999(var137 - -var121 - var73, var138, 0, var149, 1);
                                            }
                                            if (var94 != null) {
                                                var94.method999(var137 - -var122 + -var75, var138, 0, var149, 1);
                                            }
                                            if (var92 != null) {
                                                for (int var150 = 0; var118 > var150; ++var150) {
                                                    var92.method999(var70 * var150 + var137 - -var123 + -var74, var138, 0, var149, 1);
                                                }
                                            }
                                            if (var96 != null) {
                                                var96.method999(var127 + var137 - var76, var138, 0, var149, 1);
                                            }
                                            var102.method596(0, 31, var116, var141, var148 | var59.field11235, var124 + var137);
                                            if (var62 != null) {
                                                if (var77 != null) {
                                                    var77.method999(var128 + var137 + -var85, var138, 0, var149, 1);
                                                }
                                                if (var79 != null) {
                                                    var79.method999(var137 - -var129 - var87, var138, 0, var149, 1);
                                                }
                                                if (var78 != null) {
                                                    for (int var151 = 0; var119 > var151; ++var151) {
                                                        var78.method999(var130 - -(var82 * var151) + -var86 + var137, var138, 0, var149, 1);
                                                    }
                                                }
                                                if (var80 != null) {
                                                    var80.method999(var131 + var137 - var88, var138, 0, var149, 1);
                                                }
                                                var103.method596(0, 31, var113, var144, var62.field11235 | var148, var132 + var137);
                                            }
                                        } else {
                                            if (var90 != null) {
                                                var90.method4347(var137 - -var121 + -var73, var138);
                                            }
                                            if (var94 != null) {
                                                var94.method4347(-var75 + var137 + var122, var138);
                                            }
                                            if (var92 != null) {
                                                for (int var152 = 0; var118 > var152; ++var152) {
                                                    var92.method4347(var137 - -(var70 * var152) + -var74 + var123, var138);
                                                }
                                            }
                                            if (var96 != null) {
                                                var96.method4347(var137 - -var127 + -var76, var138);
                                            }
                                            var102.method596(0, 31, var116, var141, var59.field11235 | -16777216, var137 - -var124);
                                            if (var62 != null) {
                                                if (var77 != null) {
                                                    var77.method4347(var128 + var137 + -var85, var138);
                                                }
                                                if (var79 != null) {
                                                    var79.method4347(-var87 + var137 + var129, var138);
                                                }
                                                if (var78 != null) {
                                                    for (int var153 = 0; ~var119 < ~var153; ++var153) {
                                                        var78.method4347(-var86 + var137 - -(var82 * var153) + var130, var138);
                                                    }
                                                }
                                                if (var80 != null) {
                                                    var80.method4347(-var88 + var137 - -var131, var138);
                                                }
                                                var103.method596(0, 31, var113, var144, var62.field11235 | -16777216, var132 + var137);
                                            }
                                        }
                                        class758.method5495((byte) 50, var140 + 1, var139, var126 + var137, var137);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            for (int var154 = 0; ~var154 > ~class257.field3983; ++var154) {
                int var155 = class342.field5316[var154];
                class247 var156;
                if (~var155 <= -2049) {
                    var156 = ((class383) class207.field3184.method977((long) (var155 + -2048), 1)).field5799;
                } else {
                    var156 = class197.field2685[var155];
                }
                int var157 = class12.field146[var154];
                class247 var158;
                if (~var157 > -2049) {
                    var158 = class197.field2685[var157];
                } else {
                    var158 = ((class383) class207.field3184.method977((long) (var157 - 2048), 1)).field5799;
                }
                class640.method4694(--var156.field3801, var156, arg6, arg4, arg1, arg3, var158, arg0, arg2, (byte) -69);
            }
            if (arg5 > -108) {
                field5574 = null;
            }
            int var159 = class475.field6895.field8574 + class475.field6895.field8571 + 2;
            for (int var160 = 0; ~var160 > ~class731.field10618; ++var160) {
                int var161 = class71.field780[var160];
                int var162 = class71.field778[var160];
                int var163 = class71.field766[var160];
                boolean var164 = true;
                while (var164) {
                    var164 = false;
                    for (int var165 = 0; var165 < var160; ++var165) {
                        if (~(class71.field778[var165] - var159) > ~(var162 + 2) && ~(class71.field778[var165] + 2) < ~(var162 - var159) && ~(-var163 + var161) > ~(class71.field780[var165] - -class71.field766[var165]) && class71.field780[var165] - class71.field766[var165] < var161 + var163 && class71.field778[var165] + -var159 < var162) {
                            var164 = true;
                            var162 = class71.field778[var165] + -var159;
                        }
                    }
                }
                class71.field778[var160] = var162;
                String var166 = class71.field779[var160];
                int var167 = class475.field6895.method4322(256, var166);
                int var168 = arg0 + var161;
                int var169 = arg6 - -var162 + -class475.field6895.field8574;
                int var170 = var168 - -var167;
                int var171 = arg6 + var162 - -class475.field6895.field8571;
                if (~class308.field4840 == -1) {
                    int var172 = 16776960;
                    if (~class71.field773[var160] > -7) {
                        var172 = class717.field10393[class71.field773[var160]];
                    }
                    if (class71.field773[var160] == 6) {
                        var172 = class373.field5698 % 20 < 10 ? 16711680 : 16776960;
                    }
                    if (~class71.field773[var160] == -8) {
                        var172 = ~(class373.field5698 % 20) <= -11 ? 65535 : 255;
                    }
                    if (~class71.field773[var160] == -9) {
                        var172 = ~(class373.field5698 % 20) <= -11 ? 8454016 : 45056;
                    }
                    if (~class71.field773[var160] == -10) {
                        int var173 = -class71.field768[var160] + 150;
                        if (var173 < 50) {
                            var172 = var173 * 1280 + 16711680;
                        } else if (~var173 <= -101) {
                            if (~var173 > -151) {
                                var172 = 65280 - -((var173 - 100) * 5);
                            }
                        } else {
                            var172 = -((var173 + -50) * 327680) + 16776960;
                        }
                    }
                    if (~class71.field773[var160] == -11) {
                        int var174 = -class71.field768[var160] + 150;
                        if (~var174 <= -51) {
                            if (~var174 > -101) {
                                var172 = -((var174 - 50) * 327680) + 16711935;
                            } else if (~var174 > -151) {
                                var172 = (var174 + -100) * 327680 + 255 + 500 + -(var174 * 5);
                            }
                        } else {
                            var172 = var174 * 5 + 16711680;
                        }
                    }
                    if (class71.field773[var160] == 11) {
                        int var175 = 150 - class71.field768[var160];
                        if (var175 >= 50) {
                            if (~var175 <= -101) {
                                if (var175 < 150) {
                                    var172 = -(var175 * 327680) + 16777215 + 32768000;
                                }
                            } else {
                                var172 = var175 * 327685 - 16318970;
                            }
                        } else {
                            var172 = -(var175 * 327685) + 16777215;
                        }
                    }
                    int var176 = -16777216 | var172;
                    if (class71.field767[var160] == 0) {
                        class269.field4100.method608(arg0 + var161, arg6 + var162, var176, true, -16777216, var166);
                        var170 -= var167 >> 1;
                        var168 -= var167 >> 1;
                    }
                    if (~class71.field767[var160] == -2) {
                        var168 -= var167 >> 1;
                        var171 += 5;
                        class269.field4100.method597(var176, class373.field5698, arg0 - -var161, var166, arg6 + var162, -16777216, -24786);
                        var170 -= var167 >> 1;
                        var169 -= 5;
                    }
                    if (~class71.field767[var160] == -3) {
                        var169 -= 5;
                        var171 += 5;
                        class269.field4100.method599(-16777216, class373.field5698, arg0 + var161, 125, var166, arg6 + var162, var176);
                        var170 -= (var167 >> 1) + -5;
                        var168 -= (var167 >> 1) - -5;
                    }
                    if (class71.field767[var160] == 3) {
                        var170 -= var167 >> 1;
                        var168 -= var167 >> 1;
                        class269.field4100.method610(-16777216, var166, arg0 + var161, arg6 - -var162, var176, 150 - class71.field768[var160], class373.field5698, 2);
                        var169 -= 7;
                        var171 += 7;
                    }
                    if (~class71.field767[var160] == -5) {
                        int var177 = (-class71.field768[var160] + 150) * (100 + class475.field6895.method4322(256, var166)) / 150;
                        class610.field8913.method522(arg0 + -50 + var161, arg6, arg0 + 50 + var161, arg1 + arg6);
                        class269.field4100.method596(-16777216, 31, var166, arg6 + var162, var176, -var177 + 50 + var161 + arg0);
                        var168 += 50 - var177;
                        var170 += -var177 + 50;
                        class610.field8913.method489(arg0, arg6, arg0 - -arg3, arg1 + arg6);
                    }
                    if (class71.field767[var160] == 5) {
                        int var178 = -class71.field768[var160] + 150;
                        int var179 = 0;
                        if (~var178 > -26) {
                            var179 = var178 + -25;
                        } else if (~var178 < -126) {
                            var179 = var178 + -125;
                        }
                        int var180 = class475.field6895.field8574 - -class475.field6895.field8571;
                        class610.field8913.method522(arg0, -var180 + -1 + arg6 + var162, arg0 + arg3, arg6 + var162 - -5);
                        var168 -= var167 >> 1;
                        var170 -= var167 >> 1;
                        var169 += var179;
                        class269.field4100.method608(arg0 + var161, arg6 + var179 + var162, var176, true, -16777216, var166);
                        var171 += var179;
                        class610.field8913.method489(arg0, arg6, arg0 + arg3, arg6 - -arg1);
                    }
                } else {
                    var168 -= var167 >> 1;
                    var170 -= var167 >> 1;
                    class269.field4100.method608(arg0 + var161, arg6 + var162, -256, true, -16777216, var166);
                }
                class758.method5495((byte) 50, var171 + 1, var169, var170 - -1, var168);
            }
        } catch (RuntimeException var182) {
            throw class759.method5498(var182, field5582[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!gha", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2957(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 98);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gha", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2958(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 12;
                    break;
                case 1:
                    var10005 = 62;
                    break;
                case 2:
                    var10005 = 117;
                    break;
                case 3:
                    var10005 = 33;
                    break;
                default:
                    var10005 = 98;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
