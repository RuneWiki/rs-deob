import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class230 extends class252 {

    @OriginalMember(owner = "client!cb", name = "U", descriptor = "I")
    public static int field3971 = 0;

    @OriginalMember(owner = "client!cb", name = "X", descriptor = "Ljd;")
    private static class85 field3974 = class221.method1499("Loaded interfaces", (byte) -46);

    @OriginalMember(owner = "client!cb", name = "Z", descriptor = "Ljd;")
    public static class85 field3976 = field3974;

    @OriginalMember(owner = "client!cb", name = "Y", descriptor = "Ljd;")
    private static class85 field3975 = class221.method1499("Loading fonts )2 ", (byte) 115);

    @OriginalMember(owner = "client!cb", name = "T", descriptor = "Ljd;")
    public static class85 field3970 = field3975;

    @OriginalMember(owner = "client!cb", name = "gb", descriptor = "I")
    public static int field3983 = 0;

    @OriginalMember(owner = "client!cb", name = "W", descriptor = "I")
    public static int field3973;

    @OriginalMember(owner = "client!cb", name = "ab", descriptor = "I")
    public static int field3977;

    @OriginalMember(owner = "client!cb", name = "bb", descriptor = "I")
    public static int field3978;

    @OriginalMember(owner = "client!cb", name = "cb", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!cb", name = "eb", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!cb", name = "fb", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!cb", name = "hb", descriptor = "I")
    public static int field3984;

    @OriginalMember(owner = "client!cb", name = "ib", descriptor = "I")
    public static int field3985;

    @OriginalMember(owner = "client!cb", name = "jb", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!cb", name = "V", descriptor = "Lgj;")
    public static class223 field3972;

    @OriginalMember(owner = "client!cb", name = "db", descriptor = "Lge;")
    public static class68 field3980;

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "()V")
    public class230() {
        super(1, false);
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(IB)[I")
    public final int[] method149(int arg0, byte arg1) {
        ++field3981;
        if (arg1 != -55) {
            field3971 = 75;
        }
        int[] var3 = super.field4356.method868(arg0, (byte) 106);
        if (super.field4356.field2258) {
            for (int var4 = 0; ~class5.field63 < ~var4; ++var4) {
                this.method1543(-30263, var4, arg0);
                int[] var5 = this.method1742((byte) 8, 0, class109.field1924);
                var3[var4] = var5[class57.field998];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lik;IB)V")
    public final void method88(class247 arg0, int arg1, byte arg2) {
        ++field3985;
        if (~arg1 == -1) {
            super.field4338 = arg0.method1711((byte) -67) == 1;
        }
        if (arg2 != -99) {
            field3978 = -33;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lik;I)V")
    public static final void method1540(class247 arg0, int arg1) {
        ++field3977;
        if (arg1 != 128) {
            field3971 = 12;
        }
        while (true) {
            while (arg0.field4238.length > arg0.field4224) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg0.method1711((byte) -67) == 1) {
                    var3 = arg0.method1711((byte) -67);
                    var2 = true;
                    var4 = arg0.method1711((byte) -67);
                }
                int var5 = arg0.method1711((byte) -67);
                int var6 = arg0.method1711((byte) -67);
                int var7 = var5 * 64 + -class21.field303;
                int var8 = class79.field1458 - (1 - -(var6 * 64) + -class196.field3371);
                if (var7 >= 0 && ~(var8 - 63) <= -1 && var7 + 63 < class100.field1793 && var8 < class79.field1458) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; ++var11) {
                        for (int var12 = 0; var12 < 64; ++var12) {
                            if (!var2 || var11 >= var3 * 8 && ~(var3 * 8 - -8) < ~var11 && var4 * 8 <= var12 && var12 < var4 * 8 + 8) {
                                byte var13 = arg0.method1690(true);
                                if (var13 != 0) {
                                    if (class134.field2341[var9][var10] == null) {
                                        class134.field2341[var9][var10] = new byte[4096];
                                    }
                                    class134.field2341[var9][var10][(-var12 + 63 << 6) - -var11] = var13;
                                    byte var14 = arg0.method1690(true);
                                    if (class127.field2216[var9][var10] == null) {
                                        class127.field2216[var9][var10] = new byte[4096];
                                    }
                                    class127.field2216[var9][var10][(-var12 + 63 << 6) - -var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var2 ? 64 : 4096); ++var15) {
                        byte var16 = arg0.method1690(true);
                        if (var16 != 0) {
                            ++arg0.field4224;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIZ)V")
    public static final void method1541(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field3986;
        class171 var5 = class85.method579(8, 0, arg1);
        var5.method1140(-28981);
        var5.field2948 = arg3;
        if (!arg4) {
            field3978 = -115;
        }
        var5.field2951 = arg2;
        var5.field2947 = arg0;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IB)[[I")
    public final int[][] method89(int arg0, byte arg1) {
        ++field3979;
        int[][] var3 = super.field4350.method155(arg0, false);
        if (super.field4350.field338) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~var7 > ~class5.field63; ++var7) {
                this.method1543(-30263, var7, arg0);
                int[][] var8 = this.method1737(0, arg1 + 126, class109.field1924);
                var4[var7] = var8[0][class57.field998];
                var5[var7] = var8[1][class57.field998];
                var6[var7] = var8[2][class57.field998];
            }
        }
        if (arg1 != -123) {
            this.method89(83, (byte) -55);
        }
        return var3;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(III[Ljb;IIIIII)V")
    public static final void method1542(int arg0, int arg1, int arg2, class255[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class179.method1216(arg9, arg1, arg6, arg5);
        class173.method1169();
        ++field3984;
        for (int var10 = 0; arg3.length > var10; ++var10) {
            class255 var11 = arg3[var10];
            if (var11 != null && (var11.field4530 == arg4 || ~arg4 == 1412584498 && class177.field3035 == var11)) {
                int var12;
                if (~arg8 != 0) {
                    var12 = arg8;
                } else {
                    class146.field2493[class22.field307] = var11.field4559 + arg7;
                    class253.field4364[class22.field307] = var11.field4554 + arg2;
                    class54.field947[class22.field307] = var11.field4513;
                    class246.field4201[class22.field307] = var11.field4482;
                    var12 = class22.field307++;
                }
                var11.field4452 = var12;
                var11.field4499 = class151.field2555;
                if (!var11.field4459 || !client.method994(var11)) {
                    if (var11.field4519 > 0) {
                        class124.method848(var11, (byte) 53);
                    }
                    int var13 = var11.field4554 - -arg2;
                    int var14 = var11.field4538;
                    int var15 = var11.field4559 + arg7;
                    if (class183.field3134 && (client.method987(var11) != 0 || var11.field4436 == 0) && ~var14 < -128) {
                        var14 = 127;
                    }
                    if (class177.field3035 == var11) {
                        if (arg4 != -1412584499 && !var11.field4392) {
                            class235.field4061 = arg3;
                            class83.field1526 = arg2;
                            class242.field4160 = arg7;
                            continue;
                        }
                        if (!var11.field4392) {
                            var14 = 128;
                        }
                        if (class251.field4330 && class239.field4115) {
                            int var16 = class245.field4195;
                            int var17 = class106.field1851;
                            int var18 = var16 - class16.field233;
                            if (var18 < class202.field3520) {
                                var18 = class202.field3520;
                            }
                            if (~(var11.field4513 + var18) < ~(class202.field3520 + class153.field2645.field4513)) {
                                var18 = -var11.field4513 + class153.field2645.field4513 + class202.field3520;
                            }
                            var15 = var18;
                            int var19 = var17 - class244.field4177;
                            if (var19 < class146.field2490) {
                                var19 = class146.field2490;
                            }
                            if (~(class146.field2490 + class153.field2645.field4482) > ~(var11.field4482 + var19)) {
                                var19 = class146.field2490 - -class153.field2645.field4482 + -var11.field4482;
                            }
                            var13 = var19;
                        }
                    }
                    int var20;
                    int var21;
                    int var24;
                    int var25;
                    if (var11.field4436 != 2) {
                        var20 = var13 > arg1 ? var13 : arg1;
                        var21 = var15 > arg9 ? var15 : arg9;
                        int var22 = var11.field4513 + var15;
                        int var23 = var11.field4482 + var13;
                        if (~var11.field4436 == -10) {
                            ++var23;
                            ++var22;
                        }
                        var24 = ~var22 > ~arg6 ? var22 : arg6;
                        var25 = ~var23 <= ~arg5 ? arg5 : var23;
                    } else {
                        var24 = arg6;
                        var20 = arg1;
                        var21 = arg9;
                        var25 = arg5;
                    }
                    if (!var11.field4459 || var24 > var21 && ~var20 > ~var25) {
                        if (var11.field4519 != 0) {
                            if (~var11.field4519 == -1338) {
                                class239.field4124 = var13;
                                class98.field1770 = var15;
                                class27.field420 = var11;
                                class144.method949(var11.field4519 == 1403, var11.field4482, var15, -13117, var13, var11.field4513);
                                class179.method1216(arg9, arg1, arg6, arg5);
                                continue;
                            }
                            if (var11.field4519 == 1338) {
                                if (var11.method1764(0)) {
                                    class11.method93(var13, var11, 155670992, var15, var12);
                                    class179.method1216(arg9, arg1, arg6, arg5);
                                }
                                continue;
                            }
                            if (~var11.field4519 == -1340) {
                                if (var11.method1764(0)) {
                                    class144.method948(var11, var13, var12, var15, false);
                                    class179.method1216(arg9, arg1, arg6, arg5);
                                }
                                continue;
                            }
                            if (~var11.field4519 == -1401) {
                                class156.method1022(-83, var13, var11.field4482, var15, var11.field4513);
                                class20.field286[var12] = true;
                                class217.field3803[var12] = true;
                                class179.method1216(arg9, arg1, arg6, arg5);
                                continue;
                            }
                            if (~var11.field4519 == -1402) {
                                class232.method1551(var15, var11.field4513, var11.field4482, (byte) -111, var13);
                                class20.field286[var12] = true;
                                class217.field3803[var12] = true;
                                class179.method1216(arg9, arg1, arg6, arg5);
                                continue;
                            }
                            if (~var11.field4519 == -1403) {
                                class236.method1581(10007, var15, var13);
                                class20.field286[var12] = true;
                                class217.field3803[var12] = true;
                                continue;
                            }
                            if (~var11.field4519 == -1405) {
                                class23.method151(var13, class180.field3092, class130.field2280, var11.field4482, var11, var11.field4513, (byte) 22, var15);
                                class20.field286[var12] = true;
                                class217.field3803[var12] = true;
                                continue;
                            }
                            if (~var11.field4519 == -1406) {
                                if (!class28.field432) {
                                    continue;
                                }
                                int var26 = var15 - -var11.field4513;
                                int var27 = var13 + 15;
                                class30.field457.method62(class172.method1150(new class85[] { class189.field3245, class68.method451(class131.field2283, -12572) }, 0), var26, var27, 16776960, -1);
                                int var115 = var27 + 15;
                                Runtime var28 = Runtime.getRuntime();
                                int var29 = (int) ((var28.totalMemory() + -var28.freeMemory()) / 1024L);
                                int var30 = 0;
                                int var31 = 16776960;
                                if (~var29 < -65537) {
                                    var31 = 16711680;
                                }
                                int var32 = 0;
                                int var33 = 0;
                                class30.field457.method62(class172.method1150(new class85[] { class38.field596, class68.method451(var29, -12572), class37.field572 }, 0), var26, var115, var31, -1);
                                int var34 = 16776960;
                                var27 = var115 + 15;
                                for (int var35 = 0; var35 < 27; ++var35) {
                                    var30 += class4.field43[var35].method1336(3);
                                    var32 += class4.field43[var35].method1326(120);
                                    var33 += class4.field43[var35].method1337(0);
                                }
                                int var36 = var33 * 100 / var30;
                                int var37 = var32 * 10000 / var30;
                                class85 var38 = class172.method1150(new class85[] { class45.field814, class207.method1418(0, true, -14502, (long) var37, 2), class163.field2805, class68.method451(var36, -12572), class40.field640 }, 0);
                                class130.field2280.method62(var38, var26, var27, var34, -1);
                                var27 += 12;
                                class20.field286[var12] = true;
                                class217.field3803[var12] = true;
                                continue;
                            }
                        }
                        if (!class52.field902) {
                            if (~var11.field4436 == -1 && var11.field4433 && ~var21 >= ~class151.field2551 && ~var20 >= ~class194.field3315 && ~var24 < ~class151.field2551 && ~class194.field3315 > ~var25 && !class183.field3134) {
                                class90.field1659[0] = 1001;
                                class115.field2058 = 1;
                                class124.field2198[0] = class38.field586;
                                class184.field3161[0] = class100.field1795;
                            }
                            if (var21 <= class151.field2551 && var20 <= class194.field3315 && ~var24 < ~class151.field2551 && ~var25 < ~class194.field3315) {
                                class7.method34(-var15 + class151.field2551, false, var11, class194.field3315 - var13);
                            }
                        }
                        if (~var11.field4436 == -1) {
                            if (!var11.field4459 && client.method994(var11) && class115.field2057 != var11) {
                                continue;
                            }
                            if (!var11.field4459) {
                                if (var11.field4484 > -var11.field4482 + var11.field4466) {
                                    var11.field4484 = -var11.field4482 + var11.field4466;
                                }
                                if (var11.field4484 < 0) {
                                    var11.field4484 = 0;
                                }
                            }
                            method1542(-118, var20, -var11.field4484 + var13, arg3, var11.field4479, var25, var24, -var11.field4557 + var15, var12, var21);
                            if (var11.field4549 != null) {
                                method1542(-118, var20, -var11.field4484 + var13, var11.field4549, var11.field4479, var25, var24, var15 - var11.field4557, var12, var21);
                            }
                            class129 var39 = (class129) class121.field2126.method1398(1, (long) var11.field4479);
                            if (var39 != null) {
                                if (~var39.field2263 == -1 && !class52.field902 && class151.field2551 >= var21 && ~var20 >= ~class194.field3315 && ~var24 < ~class151.field2551 && ~class194.field3315 > ~var25 && !class183.field3134) {
                                    class90.field1659[0] = 1001;
                                    class124.field2198[0] = class38.field586;
                                    class115.field2058 = 1;
                                    class184.field3161[0] = class100.field1795;
                                }
                                class182.method1252(var12, var24, var13, (byte) 4, var25, var15, var20, var21, var39.field2264);
                            }
                            class179.method1216(arg9, arg1, arg6, arg5);
                            class173.method1169();
                        }
                        if (class269.field4778[var12] || class183.field3128 > 1) {
                            if (~var11.field4436 == -1 && !var11.field4459 && var11.field4466 > var11.field4482) {
                                class16.method118(var11.field4466, var11.field4513 + var15, -1, var11.field4484, var13, var11.field4482);
                            }
                            if (~var11.field4436 != -2) {
                                if (~var11.field4436 == -3) {
                                    int var40 = 0;
                                    for (int var41 = 0; var41 < var11.field4533; ++var41) {
                                        for (int var42 = 0; ~var11.field4510 < ~var42; ++var42) {
                                            int var43 = (var11.field4504 + 32) * var42 + var15;
                                            int var44 = var13 - -((32 - -var11.field4558) * var41);
                                            if (var40 < 20) {
                                                var43 += var11.field4475[var40];
                                                var44 += var11.field4531[var40];
                                            }
                                            if (var11.field4417[var40] <= 0) {
                                                if (var11.field4461 != null && ~var40 > -21) {
                                                    class12 var56 = var11.method1767(var40, (byte) -112);
                                                    if (var56 != null) {
                                                        var56.method56(var43, var44);
                                                    } else if (class61.field1131) {
                                                        class16.method120((byte) -117, var11);
                                                    }
                                                }
                                            } else {
                                                boolean var45 = false;
                                                boolean var46 = false;
                                                int var47 = var11.field4417[var40] - 1;
                                                if (~(var43 + 32) < ~arg9 && ~var43 > ~arg6 && ~arg1 > ~(var44 + 32) && arg5 > var44 || class204.field3576 == var11 && class4.field40 == var40) {
                                                    class12 var48;
                                                    if (class70.field1303 == 1 && class261.field4625 == var40 && class191.field3281 == var11.field4479) {
                                                        var48 = class176.method1191(0, var47, 2, (byte) -40, var11.field4413, var11.field4395[var40]);
                                                    } else {
                                                        var48 = class176.method1191(3153952, var47, 1, (byte) -46, var11.field4413, var11.field4395[var40]);
                                                    }
                                                    if (class173.field2997) {
                                                        class20.field286[var12] = true;
                                                    }
                                                    if (var48 != null) {
                                                        if (class204.field3576 == var11 && ~class4.field40 == ~var40) {
                                                            int var49 = -class202.field3519 + class245.field4195;
                                                            int var50 = -class195.field3344 + class106.field1851;
                                                            if (~var49 > -6 && ~var49 < 4) {
                                                                var49 = 0;
                                                            }
                                                            if (var50 < 5 && ~var50 < 4) {
                                                                var50 = 0;
                                                            }
                                                            if (~class20.field285 > -6) {
                                                                var50 = 0;
                                                                var49 = 0;
                                                            }
                                                            var48.method52(var43 - -var49, var44 + var50, 128);
                                                            if (~arg4 != 0) {
                                                                class255 var51 = arg3[65535 & arg4];
                                                                int var52 = class179.field3070;
                                                                int var53 = class179.field3071;
                                                                if (~(var44 + var50) > ~var53 && var51.field4484 > 0) {
                                                                    int var54 = (-var44 + -var50 + var53) * class218.field3820 / 3;
                                                                    if (~var54 < ~(class218.field3820 * 10)) {
                                                                        var54 = class218.field3820 * 10;
                                                                    }
                                                                    if (~var54 < ~var51.field4484) {
                                                                        var54 = var51.field4484;
                                                                    }
                                                                    class195.field3344 += var54;
                                                                    var51.field4484 -= var54;
                                                                    class16.method120((byte) -81, var51);
                                                                }
                                                                if (var52 < var44 - -32 + var50 && ~(-var51.field4482 + var51.field4466) < ~var51.field4484) {
                                                                    int var55 = (-var52 + 32 + var44 + var50) * class218.field3820 / 3;
                                                                    if (~(class218.field3820 * 10) > ~var55) {
                                                                        var55 = class218.field3820 * 10;
                                                                    }
                                                                    if (~var55 < ~(-var51.field4482 + var51.field4466 + -var51.field4484)) {
                                                                        var55 = -var51.field4482 + var51.field4466 - var51.field4484;
                                                                    }
                                                                    class195.field3344 -= var55;
                                                                    var51.field4484 += var55;
                                                                    class16.method120((byte) -108, var51);
                                                                }
                                                            }
                                                        } else if (class31.field482 == var11 && class18.field262 == var40) {
                                                            var48.method52(var43, var44, 128);
                                                        } else {
                                                            var48.method56(var43, var44);
                                                        }
                                                    } else {
                                                        class16.method120((byte) -15, var11);
                                                    }
                                                }
                                            }
                                            ++var40;
                                        }
                                    }
                                } else if (var11.field4436 == 3) {
                                    int var57;
                                    if (!class8.method46(var11, 56)) {
                                        var57 = var11.field4407;
                                        if (class115.field2057 == var11 && var11.field4520 != 0) {
                                            var57 = var11.field4520;
                                        }
                                    } else {
                                        var57 = var11.field4509;
                                        if (class115.field2057 == var11 && ~var11.field4428 != -1) {
                                            var57 = var11.field4428;
                                        }
                                    }
                                    if (var14 == 0) {
                                        if (!var11.field4556) {
                                            class179.method1217(var15, var13, var11.field4513, var11.field4482, var57);
                                        } else {
                                            class179.method1222(var15, var13, var11.field4513, var11.field4482, var57);
                                        }
                                    } else if (!var11.field4556) {
                                        class179.method1207(var15, var13, var11.field4513, var11.field4482, var57, -(255 & var14) + 256);
                                    } else {
                                        class179.method1210(var15, var13, var11.field4513, var11.field4482, var57, -(255 & var14) + 256);
                                    }
                                } else if (~var11.field4436 == -5) {
                                    class10 var58 = var11.method1761(class45.field798, Integer.MIN_VALUE);
                                    if (var58 == null) {
                                        if (class61.field1131) {
                                            class16.method120((byte) -57, var11);
                                        }
                                    } else {
                                        class85 var59 = var11.field4534;
                                        int var60;
                                        if (class8.method46(var11, 16)) {
                                            var60 = var11.field4509;
                                            if (class115.field2057 == var11 && var11.field4428 != 0) {
                                                var60 = var11.field4428;
                                            }
                                            if (var11.field4471.method586(true) > 0) {
                                                var59 = var11.field4471;
                                            }
                                        } else {
                                            var60 = var11.field4407;
                                            if (class115.field2057 == var11 && ~var11.field4520 != -1) {
                                                var60 = var11.field4520;
                                            }
                                        }
                                        if (var11.field4459 && ~var11.field4548 != 0) {
                                            class61 var61 = class32.method221(11649, var11.field4548);
                                            var59 = var61.field1106;
                                            if (var59 == null) {
                                                var59 = class237.field4090;
                                            }
                                            if ((var61.field1158 == 1 || ~var11.field4487 != -2) && ~var11.field4487 != 0) {
                                                var59 = class172.method1150(new class85[] { class269.field4781, var59, class204.field3561, class134.method895(-18225, var11.field4487) }, 0);
                                            }
                                        }
                                        if (class47.field836 == var11) {
                                            var59 = class45.field806;
                                            var60 = var11.field4407;
                                        }
                                        if (!var11.field4459) {
                                            var59 = class268.method1844(var59, 113, var11);
                                        }
                                        var58.method63(var59, var15, var13, var11.field4513, var11.field4482, var60, !var11.field4444 ? -1 : 0, var11.field4423, var11.field4473, var11.field4468);
                                    }
                                } else if (var11.field4436 == 5) {
                                    if (!var11.field4459) {
                                        class12 var62 = var11.method1772(class8.method46(var11, 37), -1);
                                        if (var62 != null) {
                                            var62.method56(var15, var13);
                                        } else if (class61.field1131) {
                                            class16.method120((byte) -37, var11);
                                        }
                                    } else {
                                        class12 var63;
                                        if (~var11.field4548 == 0) {
                                            var63 = var11.method1772(false, -1);
                                        } else {
                                            var63 = class176.method1191(var11.field4456, var11.field4548, var11.field4462, (byte) -66, var11.field4413, var11.field4487);
                                        }
                                        if (var63 == null) {
                                            if (class61.field1131) {
                                                class16.method120((byte) -40, var11);
                                            }
                                        } else {
                                            int var64 = var63.field182;
                                            int var65 = var63.field185;
                                            if (!var11.field4543) {
                                                int var66 = var11.field4513 * 4096 / var64;
                                                if (~var11.field4553 == -1) {
                                                    if (~var14 == -1) {
                                                        if (var11.field4513 == var64 && var11.field4482 == var65) {
                                                            var63.method56(var15, var13);
                                                        } else {
                                                            var63.method99(var15, var13, var11.field4513, var11.field4482);
                                                        }
                                                    } else {
                                                        var63.method51(var15, var13, var11.field4513, var11.field4482, -(var14 & 255) + 256);
                                                    }
                                                } else {
                                                    var63.method101(var66, var11.field4513 / 2 + var15, 781, var13 - -(var11.field4482 / 2), var11.field4553);
                                                }
                                            } else {
                                                int var67 = (-1 - -var64 + var11.field4513) / var64;
                                                int var68 = (var11.field4482 - (-var65 + 1)) / var65;
                                                class179.method1230(var15, var13, var11.field4513 + var15, var11.field4482 + var13);
                                                for (int var69 = 0; ~var67 < ~var69; ++var69) {
                                                    for (int var70 = 0; var68 > var70; ++var70) {
                                                        if (~var11.field4553 != -1) {
                                                            var63.method101(4096, var64 * var69 - -(var64 / 2) + var15, 781, var65 / 2 + var65 * var70 + var13, var11.field4553);
                                                        } else if (~var14 == -1) {
                                                            var63.method56(var64 * var69 + var15, var65 * var70 + var13);
                                                        } else {
                                                            var63.method52(var64 * var69 + var15, var65 * var70 + var13, -(var14 & 255) + 256);
                                                        }
                                                    }
                                                }
                                                class179.method1216(arg9, arg1, arg6, arg5);
                                            }
                                        }
                                    }
                                } else if (~var11.field4436 == -7) {
                                    boolean var71 = class8.method46(var11, 25);
                                    int var72;
                                    if (var71) {
                                        var72 = var11.field4477;
                                    } else {
                                        var72 = var11.field4426;
                                    }
                                    int var73 = 0;
                                    class26 var74 = null;
                                    if (var11.field4548 == -1) {
                                        if (~var11.field4492 != -6) {
                                            if (var72 != -1) {
                                                class106 var75 = class101.method704(1, var72);
                                                var74 = var11.method1766(var71, var11.field4497, (byte) -90, class22.field308.field796, var75);
                                                if (var74 == null && class61.field1131) {
                                                    class16.method120((byte) -52, var11);
                                                }
                                            } else {
                                                var74 = var11.method1766(var71, -1, (byte) -90, class22.field308.field796, (class106) null);
                                                if (var74 == null && class61.field1131) {
                                                    class16.method120((byte) -28, var11);
                                                }
                                            }
                                        } else if (~var11.field4425 != 0) {
                                            int var76 = 2047 & var11.field4425;
                                            if (class213.field3748 == var76) {
                                                var76 = 2047;
                                            }
                                            class44 var77 = class249.field4291[var76];
                                            class106 var78 = ~var72 == 0 ? null : class101.method704(1, var72);
                                            if (var77 != null && (int) var77.field762.method624(false) << 11 == (var11.field4425 & -2048)) {
                                                var74 = var77.field796.method1243((class106) null, var78, var11.field4497, 0, 0);
                                            }
                                        } else {
                                            var74 = class161.field2771.method1243((class106) null, (class106) null, -1, -1, 0);
                                        }
                                    } else {
                                        class61 var79 = class32.method221(11649, var11.field4548);
                                        if (var79 != null) {
                                            class61 var80 = var79.method405(-30784, var11.field4487);
                                            class106 var81 = var72 != -1 ? class101.method704(1, var72) : null;
                                            var74 = var80.method415(var11.field4497, 1, var81, true);
                                            if (var74 == null) {
                                                class16.method120((byte) -50, var11);
                                            } else {
                                                var73 = -var74.method6() / 2;
                                            }
                                        }
                                    }
                                    if (var74 != null) {
                                        int var82;
                                        if (var11.field4469 <= 0) {
                                            var82 = 256;
                                        } else {
                                            var82 = (var11.field4513 << 8) / var11.field4469;
                                        }
                                        int var83;
                                        if (~var11.field4537 >= -1) {
                                            var83 = 256;
                                        } else {
                                            var83 = (var11.field4482 << 8) / var11.field4537;
                                        }
                                        int var84 = var11.field4482 / 2 + (var13 - -(var11.field4536 * var83 >> 8));
                                        int var85 = (var11.field4441 * var82 >> 8) + (var15 - -(var11.field4513 / 2));
                                        class173.method1161(var85, var84);
                                        int var86 = class173.field2984[var11.field4416] * var11.field4500 >> 16;
                                        int var87 = class173.field2995[var11.field4416] * var11.field4500 >> 16;
                                        if (var11.field4459) {
                                            if (var11.field4415) {
                                                ((class42) var74).method296(0, var11.field4394, var11.field4512, var11.field4416, var11.field4440, var86 - -var73 + var11.field4455, var11.field4455 + var87, var11.field4500);
                                            } else {
                                                var74.method174(0, var11.field4394, var11.field4512, var11.field4416, var11.field4440, var73 + var86 + var11.field4455, var11.field4455 + var87);
                                            }
                                        } else {
                                            var74.method174(0, var11.field4394, 0, var11.field4416, 0, var86, var87);
                                        }
                                        class173.method1158();
                                    }
                                } else {
                                    if (~var11.field4436 == -8) {
                                        class10 var88 = var11.method1761(class45.field798, Integer.MIN_VALUE);
                                        if (var88 == null) {
                                            if (class61.field1131) {
                                                class16.method120((byte) -63, var11);
                                            }
                                            continue;
                                        }
                                        int var89 = 0;
                                        for (int var90 = 0; var11.field4533 > var90; ++var90) {
                                            for (int var91 = 0; var11.field4510 > var91; ++var91) {
                                                if (var11.field4417[var89] > 0) {
                                                    class61 var92 = class32.method221(11649, var11.field4417[var89] + -1);
                                                    class85 var93;
                                                    if (var92.field1158 != 1 && var11.field4395[var89] == 1) {
                                                        var93 = class172.method1150(new class85[] { class269.field4781, var92.field1106, class239.field4129 }, 0);
                                                    } else {
                                                        var93 = class172.method1150(new class85[] { class269.field4781, var92.field1106, class204.field3561, class134.method895(-18225, var11.field4395[var89]) }, 0);
                                                    }
                                                    int var94 = (115 - -var11.field4504) * var91 + var15;
                                                    int var95 = var13 - -((var11.field4558 + 12) * var90);
                                                    if (var11.field4423 == 0) {
                                                        var88.method67(var93, var94, var95, var11.field4407, var11.field4444 ? 0 : -1);
                                                    } else if (var11.field4423 != 1) {
                                                        var88.method62(var93, var94 + -1 + 115, var95, var11.field4407, !var11.field4444 ? -1 : 0);
                                                    } else {
                                                        var88.method71(var93, var94 + 57, var95, var11.field4407, var11.field4444 ? 0 : -1);
                                                    }
                                                }
                                                ++var89;
                                            }
                                        }
                                    }
                                    if (var11.field4436 == 8 && class75.field1397 == var11 && ~class24.field343 == ~class210.field3679) {
                                        int var96 = 0;
                                        class10 var97 = class30.field457;
                                        int var98 = 0;
                                        class85 var99 = var11.field4534;
                                        class85 var100 = class268.method1844(var99, -112, var11);
                                        while (var100.method586(true) > 0) {
                                            int var108 = var100.method607(class153.field2653, false);
                                            class85 var109;
                                            if (~var108 != 0) {
                                                var109 = var100.method636(var108, 0, true);
                                                var100 = var100.method611((byte) -97, var108 + 4);
                                            } else {
                                                var109 = var100;
                                                var100 = class100.field1795;
                                            }
                                            int var110 = var97.method75(var109);
                                            var98 += var97.field147 + 1;
                                            if (var96 < var110) {
                                                var96 = var110;
                                            }
                                        }
                                        var96 += 6;
                                        int var101 = var11.field4513 - (5 - -var96) + var15;
                                        var98 += 7;
                                        int var102 = var11.field4482 + var13 + 5;
                                        if (var98 + var102 > arg5) {
                                            var102 = -var98 + arg5;
                                        }
                                        if (~var101 > ~(var15 - -5)) {
                                            var101 = var15 + 5;
                                        }
                                        if (var96 + var101 > arg6) {
                                            var101 = -var96 + arg6;
                                        }
                                        class179.method1222(var101, var102, var96, var98, 16777120);
                                        class179.method1217(var101, var102, var96, var98, 0);
                                        int var103 = var97.field147 + var102 + 2;
                                        class85 var104 = var11.field4534;
                                        class85 var105 = class268.method1844(var104, 41, var11);
                                        while (var105.method586(true) > 0) {
                                            int var106 = var105.method607(class153.field2653, false);
                                            class85 var107;
                                            if (var106 != -1) {
                                                var107 = var105.method636(var106, 0, true);
                                                var105 = var105.method611((byte) -97, var106 + 4);
                                            } else {
                                                var107 = var105;
                                                var105 = class100.field1795;
                                            }
                                            var97.method67(var107, var101 + 3, var103, 0, -1);
                                            var103 += var97.field147 + 1;
                                        }
                                    }
                                    if (~var11.field4436 == -10) {
                                        int var111;
                                        int var112;
                                        int var113;
                                        int var114;
                                        if (var11.field4544) {
                                            var111 = var11.field4513 + var15;
                                            var112 = var13;
                                            var113 = var11.field4482 + var13;
                                            var114 = var15;
                                        } else {
                                            var112 = var11.field4482 + var13;
                                            var114 = var15;
                                            var113 = var13;
                                            var111 = var15 - -var11.field4513;
                                        }
                                        if (~var11.field4517 == -2) {
                                            class179.method1231(var114, var113, var111, var112, var11.field4407);
                                        } else {
                                            class179.method1215(var114, var113, var111, var112, var11.field4407, var11.field4517);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg0 >= -110) {
            method1544((byte) 29);
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(III)V")
    private final void method1543(int arg0, int arg1, int arg2) {
        ++field3973;
        int var4 = class105.field1838[arg1];
        int var5 = class39.field622[arg2];
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 - 2048));
        if (arg0 != -30263) {
            field3976 = null;
        }
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class109.field1924 = arg2;
            class57.field998 = arg1;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class57.field998 = arg2;
            class109.field1924 = arg1;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class57.field998 = class5.field63 - arg2;
            class109.field1924 = arg1;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class109.field1924 = -arg2 + class140.field2422;
            class57.field998 = arg1;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class109.field1924 = -arg2 + class140.field2422;
            class57.field998 = -arg1 + class5.field63;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class57.field998 = -arg2 + class5.field63;
            class109.field1924 = class140.field2422 - arg1;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class57.field998 = arg2;
            class109.field1924 = -arg1 + class140.field2422;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class109.field1924 = arg2;
            class57.field998 = -arg1 + class5.field63;
        }
        class109.field1924 &= class25.field360;
        class57.field998 &= class67.field1233;
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(B)V")
    public static void method1544(byte arg0) {
        field3976 = null;
        field3970 = null;
        field3974 = null;
        field3975 = null;
        field3980 = null;
        int var1 = -66 % ((arg0 - -18) / 41);
        field3972 = null;
    }
}
