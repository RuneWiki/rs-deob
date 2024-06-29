import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class144 extends class136 {

    @OriginalMember(owner = "client!jf", name = "C", descriptor = "Z")
    private boolean field2016 = true;

    @OriginalMember(owner = "client!jf", name = "D", descriptor = "Z")
    private boolean field2017 = true;

    @OriginalMember(owner = "client!jf", name = "I", descriptor = "Lbg;")
    public static class324 field2022 = new class324(90, 12);

    @OriginalMember(owner = "client!jf", name = "J", descriptor = "I")
    public static int field2023 = 0;

    @OriginalMember(owner = "client!jf", name = "K", descriptor = "[F")
    public static float[] field2024 = new float[4];

    @OriginalMember(owner = "client!jf", name = "E", descriptor = "I")
    public static int field2018;

    @OriginalMember(owner = "client!jf", name = "F", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!jf", name = "G", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!jf", name = "H", descriptor = "I")
    public static int field2021;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILya;II)V", line = 5)
    public static final void method1063(int arg0, class38 arg1, int arg2, int arg3) {
        ++field2018;
        if (~arg2 <= -1 && ~arg3 <= -1 && ~class241.field3566 != -1 && class172.field2446 != 0) {
            arg1.method394(class446.field6590, class45.field509, class241.field3566, class172.field2446);
            arg1.method380(class221.field3176, class208.field3015, class241.field3566, class172.field2446);
            if (arg0 != -1) {
                field2023 = 66;
            }
            class122 var4 = arg1.method341();
            var4.method242(class122.field1788, class236.field3462, class289.field4153, class224.field3281, class372.field5533, class380.field5616);
            arg1.method308(var4);
            if (class283.field4115 != null) {
                int var5 = -1;
                int var6 = -1;
                int var7 = arg1.method383();
                int var8 = (-class446.field6590 + arg2) * var7 / class241.field3566;
                int var9 = (-class45.field509 + arg3) * var7 / class172.field2446;
                int var10 = arg1.method309();
                int var11 = (-class446.field6590 + arg2) * var10 / class241.field3566;
                int var12 = (arg3 - class45.field509) * var10 / class172.field2446;
                int[] var13 = new int[] { var8, var9, var7 };
                var4.method244(var13);
                int[] var14 = new int[] { var11, var12, var10 };
                var4.method244(var14);
                float var15 = 0.0F;
                int var16 = var14[0] - var13[0];
                int var17 = var14[1] + -var13[1];
                int var18 = var14[2] + -var13[2];
                while (var15 < 1.0F) {
                    int var19 = (int) ((float) var16 * var15 + (float) var13[0]);
                    int var20 = var19 >> 7;
                    int var21 = (int) ((float) var18 * var15 + (float) var13[2]);
                    int var22 = var21 >> 7;
                    if (var20 > 0 && ~var22 < -1 && ~class397.field5828 < ~var20 && ~class457.field6713 < ~var22) {
                        int var23 = class435.field6375.field6328;
                        if (~var23 > -4 && ~(class238.field3497[1][var20][var22] & 2) != -1) {
                            ++var23;
                        }
                        if ((float) class283.field4115[var23].method426(var19, var21) < (float) var17 * var15 + (float) var13[1]) {
                            var5 = (-1 + class435.field6375.method963((byte) 127) << 6) + var19 >> 7;
                            var6 = (class435.field6375.method963((byte) 127) - 1 << 6) + var21 >> 7;
                            break;
                        }
                    }
                    var15 = (float) ((double) var15 + 0.01D);
                }
                if (~var5 != 0 && var6 != -1) {
                    if (class453.field6671 && (64 & class223.field3273) != 0) {
                        class188 var24 = class274.method1766(class404.field5977, class219.field3149, (byte) 126);
                        if (var24 == null) {
                            class235.method1568((byte) -44);
                        } else {
                            class434.method2632(19, (byte) -55, false, 0L, var5, " ->", true, class8.field93, var6, -1, class148.field2074);
                        }
                    } else {
                        if (class61.field703 == class51.field564) {
                            class434.method2632(59, (byte) -55, false, 0L, var5, "", true, class176.field2503.method2031(true, class377.field5585), var6, -1, -1);
                        }
                        ++class482.field7091;
                        class434.method2632(44, (byte) -55, false, 0L, var5, "", true, class7.field87, var6, -1, class456.field6706);
                    }
                }
            }
            class493 var25 = class111.field1573;
            for (class462 var26 = (class462) var25.method2955(62); var26 != null; var26 = (class462) var25.method2952((byte) -83)) {
                if (~class435.field6375.field6328 == ~var26.field6793 && var26.method2774(arg2, 0, arg3, arg1)) {
                    if (var26.field6799 instanceof class364) {
                        class364 var27 = (class364) var26.field6799;
                        int var28 = var27.method963((byte) 127);
                        if (~(1 & var28) == -1 && (var27.field6335 & 127) == 0 && ~(var27.field6334 & 127) == -1 || ~(1 & var28) == -2 && ~(var27.field6335 & 127) == -65 && ~(127 & var27.field6334) == -65) {
                            int var29 = var27.field6335 + -(var27.method963((byte) 127) - 1 << 6);
                            int var30 = var27.field6334 + -(-1 + var27.method963((byte) 127) << 6);
                            for (int var31 = 0; class232.field3410 > var31; ++var31) {
                                class461 var38 = class250.field3690[class173.field2454[var31]];
                                if (var38 != null && class263.field3867 != var38.field1731 && var38.field1711) {
                                    int var39 = -(var38.field6790.field1344 + -1 << 6) + var38.field6335;
                                    int var40 = -(var38.field6790.field1344 + -1 << 6) + var38.field6334;
                                    if (var39 >= var29 && var38.field6790.field1344 <= -(-var29 + var39 >> 7) + var27.method963((byte) 127) && var40 >= var30 && ~var38.field6790.field1344 >= ~(-(-var30 + var40 >> 7) + var27.method963((byte) 127))) {
                                        class49.method498(class435.field6375.field6328 != var26.field6793, var38, false);
                                        var38.field1731 = class263.field3867;
                                    }
                                }
                            }
                            int var32 = class75.field1027;
                            int[] var33 = class334.field4634;
                            for (int var34 = 0; ~var34 > ~var32; ++var34) {
                                class364 var35 = class384.field5647[var33[var34]];
                                if (var35 != null && class263.field3867 != var35.field1731 && var27 != var35 && var35.field1711) {
                                    int var36 = var35.field6335 - (-1 + var35.method963((byte) 127) << 6);
                                    int var37 = var35.field6334 - (-1 + var35.method963((byte) 127) << 6);
                                    if (~var36 <= ~var29 && ~var35.method963((byte) 127) >= ~(-(var36 - var29 >> 7) + var27.method963((byte) 127)) && ~var30 >= ~var37 && ~var35.method963((byte) 127) >= ~(var27.method963((byte) 127) - (-var30 + var37 >> 7))) {
                                        class142.method1056(-91, class435.field6375.field6328 != var26.field6793, var35);
                                        var35.field1731 = class263.field3867;
                                    }
                                }
                            }
                        }
                        if (class263.field3867 == var27.field1731) {
                            continue;
                        }
                        class142.method1056(-109, class435.field6375.field6328 != var26.field6793, var27);
                        var27.field1731 = class263.field3867;
                    }
                    if (var26.field6799 instanceof class461) {
                        class461 var41 = (class461) var26.field6799;
                        if (var41.field6790 != null) {
                            if ((1 & var41.field6790.field1344) == 0 && (127 & var41.field6335) == 0 && ~(127 & var41.field6334) == -1 || ~(var41.field6790.field1344 & 1) == -2 && (var41.field6335 & 127) == 64 && (var41.field6334 & 127) == 64) {
                                int var42 = -(var41.field6790.field1344 + -1 << 6) + var41.field6335;
                                int var43 = -(var41.field6790.field1344 - 1 << 6) + var41.field6334;
                                for (int var44 = 0; ~var44 > ~class232.field3410; ++var44) {
                                    class461 var51 = class250.field3690[class173.field2454[var44]];
                                    if (var51 != null && ~class263.field3867 != ~var51.field1731 && var41 != var51 && var51.field1711) {
                                        int var52 = -(var51.field6790.field1344 + -1 << 6) + var51.field6335;
                                        int var53 = -(var51.field6790.field1344 + -1 << 6) + var51.field6334;
                                        if (~var52 <= ~var42 && var51.field6790.field1344 <= -(-var42 + var52 >> 7) + var41.field6790.field1344 && ~var43 >= ~var53 && var51.field6790.field1344 <= -(-var43 + var53 >> 7) + var41.field6790.field1344) {
                                            class49.method498(~class435.field6375.field6328 != ~var26.field6793, var51, false);
                                            var51.field1731 = class263.field3867;
                                        }
                                    }
                                }
                                int var45 = class75.field1027;
                                int[] var46 = class334.field4634;
                                for (int var47 = 0; var47 < var45; ++var47) {
                                    class364 var48 = class384.field5647[var46[var47]];
                                    if (var48 != null && class263.field3867 != var48.field1731 && var48.field1711) {
                                        int var49 = var48.field6335 - (var48.method963((byte) 127) + -1 << 6);
                                        int var50 = var48.field6334 + -(-1 + var48.method963((byte) 127) << 6);
                                        if (~var49 <= ~var42 && var48.method963((byte) 127) <= -(var49 - var42 >> 7) + var41.field6790.field1344 && ~var43 >= ~var50 && var48.method963((byte) 127) <= var41.field6790.field1344 - (var50 - var43 >> 7)) {
                                            class142.method1056(arg0 + 80, ~class435.field6375.field6328 != ~var26.field6793, var48);
                                            var48.field1731 = class263.field3867;
                                        }
                                    }
                                }
                            }
                            if (class263.field3867 == var41.field1731) {
                                continue;
                            }
                            class49.method498(class435.field6375.field6328 != var26.field6793, var41, false);
                            var41.field1731 = class263.field3867;
                        }
                    }
                    if (var26.field6799 instanceof class200) {
                        class518 var54 = (class518) class89.field1216.method875((long) (var26.field6796 | var26.field6793 << 28 | var26.field6795 << 14), 125);
                        if (var54 != null) {
                            for (class203 var55 = (class203) var54.field7628.method1017(-62); var55 != null; var55 = (class203) var54.field7628.method1023((byte) 32)) {
                                class72 var56 = class270.field3995.method6(arg0 ^ -22884, var55.field2939);
                                if (class453.field6671) {
                                    if (class435.field6375.field6328 == var26.field6793) {
                                        class284 var57 = class299.field4290 != -1 ? class215.field3100.method2740((byte) -40, class299.field4290) : null;
                                        if ((class223.field3273 & 1) != 0 && (var57 == null || var56.method679(class299.field4290, -114, var57.field4127) != var57.field4127)) {
                                            class434.method2632(6, (byte) -55, false, (long) var55.field2939, var26.field6796, class91.field1252 + " -> <col=ff9040>" + var56.field929, true, class8.field93, var26.field6795, -1, class148.field2074);
                                            ++class151.field2140;
                                        }
                                    }
                                } else {
                                    if (class435.field6375.field6328 == var26.field6793) {
                                        String[] var58 = var56.field947;
                                        for (int var59 = 4; var59 >= 0; --var59) {
                                            if (var58 != null && var58[var59] != null) {
                                                byte var60 = 0;
                                                int var61 = class396.field5816;
                                                if (~var59 == -1) {
                                                    var60 = 49;
                                                }
                                                if (~var59 == -2) {
                                                    var60 = 51;
                                                }
                                                if (var59 == 2) {
                                                    var60 = 16;
                                                }
                                                if (var59 == 3) {
                                                    var60 = 4;
                                                }
                                                if (var56.field913 == var59) {
                                                    var61 = var56.field956;
                                                }
                                                if (~var59 == -5) {
                                                    var60 = 2;
                                                }
                                                if (var56.field954 == var59) {
                                                    var61 = var56.field917;
                                                }
                                                class434.method2632(var60, (byte) -55, false, (long) var55.field2939, var26.field6796, "<col=ff9040>" + var56.field929, true, var58[var59], var26.field6795, -1, var61);
                                                ++class521.field7666;
                                            }
                                        }
                                    }
                                    class434.method2632(1009, (byte) -55, class435.field6375.field6328 != var26.field6793, (long) var55.field2939, var26.field6796, "<col=ff9040>" + var56.field929, true, class516.field7611.method2031(true, class377.field5585), var26.field6795, -1, class170.field2413);
                                    ++class293.field4216;
                                }
                            }
                        }
                    }
                    if (var26.field6799 instanceof class529) {
                        class529 var62 = (class529) var26.field6799;
                        class222 var63 = class384.field5645.method786(var62.method28(true), 0);
                        if (var63.field3233 != null) {
                            var63 = var63.method1509(class253.field3739, (byte) -120);
                        }
                        if (var63 != null) {
                            if (class453.field6671) {
                                if (class435.field6375.field6328 == var26.field6793) {
                                    class284 var68 = class299.field4290 != -1 ? class215.field3100.method2740((byte) 104, class299.field4290) : null;
                                    if ((4 & class223.field3273) != 0 && (var68 == null || ~var63.method1510(class299.field4290, (byte) 101, var68.field4127) != ~var68.field4127)) {
                                        ++class364.field5064;
                                        class434.method2632(30, (byte) -55, false, class506.method3021((byte) 68, var26.field6796, var62, var26.field6795), var26.field6796, class91.field1252 + " -> <col=00ffff>" + var63.field3254, true, class8.field93, var26.field6795, -1, class148.field2074);
                                    }
                                }
                            } else {
                                if (~class435.field6375.field6328 == ~var26.field6793) {
                                    String[] var64 = var63.field3205;
                                    if (var64 != null) {
                                        for (int var65 = 4; var65 >= 0; --var65) {
                                            if (var64[var65] != null) {
                                                short var66 = 0;
                                                int var67 = class396.field5816;
                                                if (~var65 == -1) {
                                                    var66 = 18;
                                                }
                                                if (var65 == 1) {
                                                    var66 = 45;
                                                }
                                                if (~var65 == -3) {
                                                    var66 = 23;
                                                }
                                                if (var65 == 3) {
                                                    var66 = 25;
                                                }
                                                if (~var65 == -5) {
                                                    var66 = 1007;
                                                }
                                                if (var63.field3210 == var65) {
                                                    var67 = var63.field3219;
                                                }
                                                if (~var63.field3242 == ~var65) {
                                                    var67 = var63.field3252;
                                                }
                                                class434.method2632(var66, (byte) -55, false, class506.method3021((byte) 101, var26.field6796, var62, var26.field6795), var26.field6796, "<col=00ffff>" + var63.field3254, true, var64[var65], var26.field6795, -1, var67);
                                                ++class269.field3964;
                                            }
                                        }
                                    }
                                }
                                ++class418.field6165;
                                class434.method2632(1010, (byte) -55, ~class435.field6375.field6328 != ~var26.field6793, (long) var63.field3217, var26.field6796, "<col=00ffff>" + var63.field3254, true, class516.field7611.method2031(true, class377.field5585), var26.field6795, -1, class170.field2413);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "()V", line = 470)
    public class144() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(Z)V", line = 475)
    public static void method1064(boolean arg0) {
        field2022 = null;
        field2024 = null;
        if (!arg0) {
            field2024 = null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)[I", line = 487)
    public final int[] method82(int arg0, int arg1) {
        int var3 = 60 / ((arg0 - 67) / 50);
        ++field2020;
        int[] var4 = super.field1957.method2887((byte) -112, arg1);
        if (super.field1957.field7031) {
            int[] var5 = this.method1033(this.field2016 ? -arg1 + class519.field7637 : arg1, 0, 0);
            if (this.field2017) {
                for (int var6 = 0; class467.field6889 > var6; ++var6) {
                    var4[var6] = var5[-var6 + class166.field2356];
                }
            } else {
                class201.method1413(var5, 0, var4, 0, class467.field6889);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(BI)[[I", line = 524)
    public final int[][] method272(byte arg0, int arg1) {
        if (arg0 < 33) {
            field2022 = null;
        }
        ++field2019;
        int[][] var3 = super.field1952.method3127((byte) 67, arg1);
        if (super.field1952.field7770) {
            int[][] var4 = this.method1036(3, 0, this.field2016 ? -arg1 + class519.field7637 : arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (!this.field2017) {
                for (int var11 = 0; ~var11 > ~class467.field6889; ++var11) {
                    var8[var11] = var5[var11];
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                }
            } else {
                for (int var12 = 0; class467.field6889 > var12; ++var12) {
                    var8[var12] = var5[-var12 + class166.field2356];
                    var9[var12] = var6[-var12 + class166.field2356];
                    var10[var12] = var7[-var12 + class166.field2356];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IILiv;)V", line = 588)
    public final void method268(int arg0, int arg1, class65 arg2) {
        ++field2021;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    super.field1966 = ~arg2.method577(arg0 ^ 251) == -2;
                }
            } else {
                this.field2016 = arg2.method577(255) == 1;
            }
        } else {
            this.field2017 = ~arg2.method577(255) == -2;
        }
        if (arg0 != 4) {
            field2024 = null;
        }
    }
}
