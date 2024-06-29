import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class285 extends class57 implements class149 {

    @OriginalMember(owner = "client!jb", name = "H", descriptor = "Lni;")
    public class304 field4574;

    @OriginalMember(owner = "client!jb", name = "Z", descriptor = "Z")
    private boolean field4592;

    @OriginalMember(owner = "client!jb", name = "L", descriptor = "[I")
    public static int[] field4578 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

    @OriginalMember(owner = "client!jb", name = "J", descriptor = "[Ljava/lang/String;")
    public static String[] field4576 = new String[100];

    @OriginalMember(owner = "client!jb", name = "C", descriptor = "I")
    public static int field4569;

    @OriginalMember(owner = "client!jb", name = "D", descriptor = "I")
    public static int field4570;

    @OriginalMember(owner = "client!jb", name = "E", descriptor = "I")
    public static int field4571;

    @OriginalMember(owner = "client!jb", name = "F", descriptor = "I")
    public static int field4572;

    @OriginalMember(owner = "client!jb", name = "G", descriptor = "I")
    public static int field4573;

    @OriginalMember(owner = "client!jb", name = "I", descriptor = "I")
    public static int field4575;

    @OriginalMember(owner = "client!jb", name = "K", descriptor = "I")
    public static int field4577;

    @OriginalMember(owner = "client!jb", name = "M", descriptor = "I")
    public static int field4579;

    @OriginalMember(owner = "client!jb", name = "N", descriptor = "I")
    public static int field4580;

    @OriginalMember(owner = "client!jb", name = "O", descriptor = "I")
    public static int field4581;

    @OriginalMember(owner = "client!jb", name = "R", descriptor = "I")
    public static int field4584;

    @OriginalMember(owner = "client!jb", name = "S", descriptor = "I")
    public static int field4585;

    @OriginalMember(owner = "client!jb", name = "T", descriptor = "I")
    public static int field4586;

    @OriginalMember(owner = "client!jb", name = "U", descriptor = "I")
    public static int field4587;

    @OriginalMember(owner = "client!jb", name = "V", descriptor = "I")
    public static int field4588;

    @OriginalMember(owner = "client!jb", name = "W", descriptor = "I")
    public static int field4589;

    @OriginalMember(owner = "client!jb", name = "X", descriptor = "I")
    public static int field4590;

    @OriginalMember(owner = "client!jb", name = "Y", descriptor = "I")
    public static int field4591;

    @OriginalMember(owner = "client!jb", name = "P", descriptor = "Luj;")
    public static class214 field4582;

    @OriginalMember(owner = "client!jb", name = "Q", descriptor = "Lah;")
    public static class215 field4583;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Le;B)V")
    public final void method199(class312 arg0, byte arg1) {
        this.field4574.method2049(arg0, (byte) -115);
        ++field4587;
        if (arg1 != -22) {
            this.method199((class312) null, (byte) 60);
        }
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(Le;B)V")
    public final void method196(class312 arg0, byte arg1) {
        if (arg1 <= -66) {
            ++field4581;
            class348 var3 = this.field4574.method2038(true, super.field722, 1, 131072, true, super.field724, arg0);
            if (var3 != null) {
                this.field4574.method2046(false, arg0, super.field726, super.field711, super.field720, super.field710, 2, var3);
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
    public final void method198(int arg0) {
        ++field4591;
        if (arg0 != -32289) {
            this.method189((class312) null, true);
        }
    }

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "(I)I")
    public final int method314(int arg0) {
        ++field4569;
        if (arg0 != 27647) {
            method1936((class172) null, 49, false);
        }
        return this.field4574.method2045((byte) 2);
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Le;Lfa;IIIIIIIZIIIII)V")
    public class285(class312 arg0, class127 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg4, arg6, arg7, arg8, arg10, arg11, arg12, arg13, arg1.field1994 == 1, class424.method2635(-113, arg3, arg2));
        this.field4574 = new class304(arg0, arg1, arg2, arg3, super.field714, arg5, arg6, arg8, arg9, arg14);
        this.field4592 = arg1.field2021 != 0 && !arg9;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILe;IIZLhm;I)V")
    public final void method184(int arg0, class312 arg1, int arg2, int arg3, boolean arg4, class120 arg5, int arg6) {
        if (arg3 == 0) {
            ++field4570;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Z)I")
    public final int method197(boolean arg0) {
        if (!arg0) {
            field4582 = null;
        }
        ++field4585;
        return this.field4574.field4834;
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(B)Z")
    public final boolean method190(byte arg0) {
        if (arg0 >= -126) {
            this.method193(56);
        }
        ++field4572;
        return this.field4574.method2043((byte) -83);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIILe;)Z")
    public final boolean method188(int arg0, int arg1, int arg2, class312 arg3) {
        ++field4575;
        class348 var5 = this.field4574.method2038(false, super.field722, arg1 + -65535, arg1, false, super.field724, arg3);
        if (var5 == null) {
            return false;
        } else {
            class435 var6 = arg3.method713();
            var6.method1984(super.field724, super.field721, super.field722);
            return var5.method39(arg0, arg2, var6, false);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Le;I)V")
    public final void method194(class312 arg0, int arg1) {
        ++field4590;
        this.field4574.method2051((byte) 126, arg0);
        int var3 = 37 % ((arg1 - -19) / 62);
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)I")
    public final int method195(int arg0) {
        ++field4588;
        if (arg0 != 3076) {
            field4576 = null;
        }
        return this.field4574.field4808;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "([[BLlf;[[I[[BII[[B[[BIIZLe;Llf;)V")
    public static final void method1935(byte[][] arg0, class129 arg1, int[][] arg2, byte[][] arg3, int arg4, int arg5, byte[][] arg6, byte[][] arg7, int arg8, int arg9, boolean arg10, class312 arg11, class129 arg12) {
        if (arg9 != 2833) {
            field4583 = null;
        }
        for (int var13 = 0; var13 < arg5; ++var13) {
            int var14 = ~(arg5 + -1) >= ~var13 ? var13 : var13 + 1;
            for (int var15 = 0; arg8 > var15; ++var15) {
                int var16 = ~var15 <= ~(arg8 + -1) ? var15 : var15 - -1;
                if (class117.method852(true) || class396.method2495(var13, (byte) 59, class81.field1007, arg4, var15)) {
                    boolean var17 = false;
                    boolean var18 = false;
                    boolean[] var19 = new boolean[4];
                    int var20 = arg7[var13][var15];
                    int var21 = arg0[var13][var15];
                    int var22 = 255 & arg6[var13][var15];
                    int var23 = 255 & arg3[var13][var15];
                    int var24 = arg3[var13][var16] & 255;
                    int var25 = arg3[var14][var16] & 255;
                    int var26 = arg3[var14][var15] & 255;
                    if (~var22 != -1 || var23 != 0) {
                        class235 var27 = ~var22 == -1 ? null : class345.method2257(var22 + -1, true);
                        class402 var28 = ~var23 == -1 ? null : class92.method545(var23 + -1, (byte) 39);
                        if (var20 == 0 && var27 == null) {
                            var20 = 12;
                        }
                        class235 var29 = var27;
                        if (var27 != null) {
                            if (~var27.field3935 == 0 && ~var27.field3931 == 0) {
                                var29 = var27;
                                var27 = null;
                            } else if (var28 != null && ~var20 != -1) {
                                var18 = var27.field3927;
                            }
                        }
                        if ((~var20 == -1 || var20 == 12) && var13 > 0 && var15 > 0 && ~arg5 < ~var13 && ~arg8 < ~var15) {
                            byte var30 = 0;
                            byte var31 = 0;
                            byte var32 = 0;
                            int var33 = var31 + (~arg3[var14][var15 + -1] != ~var23 ? -1 : 1);
                            int var34 = var30 + (~arg3[var13 + -1][var15 + -1] == ~var23 ? 1 : -1);
                            int var35 = var32 + (arg3[var14][var16] != var23 ? -1 : 1);
                            byte var36 = 0;
                            int var37 = var36 + (~arg3[var13 + -1][var16] != ~var23 ? -1 : 1);
                            if (~arg3[var13][var15 + -1] != ~var23) {
                                --var33;
                                --var34;
                            } else {
                                ++var33;
                                ++var34;
                            }
                            if (~arg3[var14][var15] == ~var23) {
                                ++var35;
                                ++var33;
                            } else {
                                --var35;
                                --var33;
                            }
                            if (~arg3[var13][var16] == ~var23) {
                                ++var35;
                                ++var37;
                            } else {
                                --var37;
                                --var35;
                            }
                            if (~arg3[var13 - 1][var15] == ~var23) {
                                ++var34;
                                ++var37;
                            } else {
                                --var37;
                                --var34;
                            }
                            int var38 = var34 - var35;
                            if (~var38 > -1) {
                                var38 = -var38;
                            }
                            int var39 = -var37 + var33;
                            if (~var39 > -1) {
                                var39 = -var39;
                            }
                            if (var38 == var39) {
                                var38 = arg1.method779(var13, var15) - arg1.method779(var14, var16);
                                if (~var38 > -1) {
                                    var38 = -var38;
                                }
                                var39 = arg1.method779(var14, var15) - arg1.method779(var13, var16);
                                if (var39 < 0) {
                                    var39 = -var39;
                                }
                            }
                            var21 = ~var39 >= ~var38 ? 0 : 1;
                        }
                        for (int var40 = 0; ~var40 > -14; ++var40) {
                            class329.field5159[var40] = -1;
                            class403.field6019[var40] = 1;
                        }
                        boolean[] var41 = var27 != null && var27.field3927 ? class139.field2164[var20] : class112.field1555[var20];
                        class42.method282(arg6, var15, var21, var19, arg0, var13, arg11, arg7, (byte) -125, arg5, arg8, var28, var20, var27);
                        boolean var42 = var27 != null && var27.field3935 != var27.field3931;
                        if (!var42) {
                            for (int var43 = 0; var43 < 8; ++var43) {
                                if (~class329.field5159[var43] <= -1 && ~class98.field1371[var43] != ~class127.field2015[var43]) {
                                    var42 = true;
                                    break;
                                }
                            }
                        }
                        if (!var41[var21 + 1 & 3]) {
                            var19[1] = class373.method2381(var19[1], class37.method242(class403.field6019[4], class403.field6019[2]) == 0);
                        }
                        if (!var41[var21 + 3 & 3]) {
                            var19[3] = class373.method2381(var19[3], ~class37.method242(class403.field6019[0], class403.field6019[6]) == -1);
                        }
                        if (!var41[var21 & 3]) {
                            var19[0] = class373.method2381(var19[0], ~class37.method242(class403.field6019[2], class403.field6019[0]) == -1);
                        }
                        if (!var41[3 & var21 + 2]) {
                            var19[2] = class373.method2381(var19[2], class37.method242(class403.field6019[6], class403.field6019[4]) == 0);
                        }
                        if (!var18 && (~var20 == -1 || ~var20 == -13)) {
                            if (var19[0] && !var19[1] && !var19[2] && var19[3]) {
                                var20 = ~var20 != -1 ? 14 : 13;
                                var21 = 0;
                                var19[0] = var19[3] = false;
                            } else if (var19[0] && var19[1] && !var19[2] && !var19[3]) {
                                var20 = var20 == 0 ? 13 : 14;
                                var19[0] = var19[1] = false;
                                var21 = 3;
                            } else if (!var19[0] && var19[1] && var19[2] && !var19[3]) {
                                var20 = ~var20 != -1 ? 14 : 13;
                                var19[1] = var19[2] = false;
                                var21 = 2;
                            } else if (!var19[0] && !var19[1] && var19[2] && var19[3]) {
                                var19[2] = var19[3] = false;
                                var21 = 1;
                                var20 = var20 == 0 ? 13 : 14;
                            }
                        }
                        boolean var44 = !var18 && !var19[0] && !var19[2] && !var19[1] && !var19[3];
                        int[] var45 = null;
                        int var46;
                        int[] var47;
                        int[] var48;
                        int var49;
                        int[] var50;
                        if (var44) {
                            var46 = var28 == null ? 0 : class304.field4807[var20];
                            var47 = class249.field4071[var20];
                            var48 = class424.field6265[var20];
                            var49 = var27 != null ? class349.field5404[var20] : 0;
                            var50 = class263.field4234[var20];
                        } else if (var18) {
                            var49 = var27 == null ? 0 : class40.field506[var20];
                            var46 = var28 != null ? class382.field5770[var20] : 0;
                            var47 = class264.field4252[var20];
                            var45 = class201.field3233[var20];
                            var50 = class30.field358[var20];
                            var48 = class52.field646[var20];
                        } else {
                            var47 = class214.field3496[var20];
                            var46 = var28 == null ? 0 : class52.field641[var20];
                            var50 = class414.field6127[var20];
                            var45 = class376.field5689[var20];
                            var49 = var27 != null ? class280.field4480[var20] : 0;
                            var48 = class134.field2113[var20];
                        }
                        int var51 = var46 + var49;
                        if (~var51 >= -1) {
                            class362.method2345(arg4, var13, var15);
                        } else {
                            if (var19[0]) {
                                ++var51;
                            }
                            if (var19[2]) {
                                ++var51;
                            }
                            if (var19[1]) {
                                ++var51;
                            }
                            if (var19[3]) {
                                ++var51;
                            }
                            int var52 = 0;
                            int var53 = 0;
                            int var54 = var51 * 3;
                            int[] var55 = arg10 ? new int[var54] : null;
                            int[] var56 = var42 ? new int[var54] : null;
                            int[] var57 = new int[var54];
                            int[] var58 = new int[var54];
                            int[] var59 = new int[var54];
                            int[] var60 = new int[var54];
                            int[] var61 = new int[var54];
                            int var62 = -1;
                            int var63 = -1;
                            int var64 = 256;
                            if (var27 == null) {
                                if (var44) {
                                    var52 += class349.field5404[var20];
                                } else if (!var18) {
                                    var52 += class280.field4480[var20];
                                } else {
                                    var52 += class40.field506[var20];
                                }
                            } else {
                                var62 = var27.field3935;
                                var63 = !arg11.method711() ? var27.field3930 : var27.field3921;
                                var64 = var27.field3939;
                                int var65 = class250.method1726(var27, arg11, true);
                                for (int var66 = 0; ~var49 < ~var66; ++var66) {
                                    boolean var92 = false;
                                    byte var93;
                                    if (var19[3 & -var21] && var45[0] == var52) {
                                        class73.field928[0] = var48[var52];
                                        class73.field928[1] = 1;
                                        class73.field928[2] = var47[var52];
                                        class73.field928[3] = 1;
                                        class73.field928[4] = var50[var52];
                                        class73.field928[5] = var47[var52];
                                        var93 = 6;
                                    } else if (var19[3 & -var21 + 2] && ~var45[2] == ~var52) {
                                        class73.field928[0] = var48[var52];
                                        class73.field928[1] = 5;
                                        class73.field928[2] = var47[var52];
                                        class73.field928[3] = 5;
                                        class73.field928[4] = var50[var52];
                                        class73.field928[5] = var47[var52];
                                        var93 = 6;
                                    } else if (var19[-var21 + 1 & 3] && ~var45[1] == ~var52) {
                                        class73.field928[0] = var48[var52];
                                        class73.field928[1] = 3;
                                        class73.field928[2] = var47[var52];
                                        class73.field928[3] = 3;
                                        class73.field928[4] = var50[var52];
                                        class73.field928[5] = var47[var52];
                                        var93 = 6;
                                    } else if (var19[3 & 3 - var21] && var45[3] == var52) {
                                        class73.field928[0] = var48[var52];
                                        class73.field928[1] = 7;
                                        class73.field928[2] = var47[var52];
                                        class73.field928[3] = 7;
                                        class73.field928[4] = var50[var52];
                                        class73.field928[5] = var47[var52];
                                        var93 = 6;
                                    } else {
                                        class73.field928[0] = var48[var52];
                                        class73.field928[1] = var50[var52];
                                        var93 = 3;
                                        class73.field928[2] = var47[var52];
                                    }
                                    ++var52;
                                    for (int var94 = 0; ~var93 < ~var94; ++var94) {
                                        int var95 = class73.field928[var94];
                                        int var96 = -(var21 * 2) + var95 & 7;
                                        int var97 = class282.field4532[var95];
                                        int var98 = class225.field3744[var95];
                                        if (~var21 != -2) {
                                            if (~var21 != -3) {
                                                if (var21 == 3) {
                                                    var57[var53] = -var98 + 128;
                                                    var58[var53] = var97;
                                                } else {
                                                    var57[var53] = var97;
                                                    var58[var53] = var98;
                                                }
                                            } else {
                                                var57[var53] = -var97 + 128;
                                                var58[var53] = -var98 + 128;
                                            }
                                        } else {
                                            var57[var53] = var98;
                                            var58[var53] = -var97 + 128;
                                        }
                                        if (arg10 && class108.field1513[var20][var95]) {
                                            int var99 = (var13 << 7) + var57[var53];
                                            int var100 = (var15 << 7) - -var58[var53];
                                            var55[var53] = arg12.method771(var99, var100) - arg1.method771(var99, var100);
                                        }
                                        if (var95 < 8 && ~class329.field5159[var96] < ~var27.field3936) {
                                            if (var56 != null) {
                                                var56[var53] = class98.field1371[var96];
                                            }
                                            var61[var53] = class447.field6525[var96];
                                            var60[var53] = class449.field6547[var96];
                                            var59[var53] = class127.field2015[var96];
                                        } else {
                                            if (var56 != null) {
                                                var56[var53] = var65;
                                            }
                                            var60[var53] = arg11.method711() ? var27.field3921 : var27.field3930;
                                            var61[var53] = var27.field3939;
                                            var59[var53] = var62;
                                        }
                                        ++var53;
                                    }
                                }
                                if (!arg10 && arg4 == 0) {
                                    class224.method1608(var13, var15, var27.field3925, var27.field3929 * 8);
                                }
                                if (~var20 != -13 && ~var27.field3935 != 0 && var27.field3922) {
                                    var17 = true;
                                }
                            }
                            if (var28 != null) {
                                if (~var24 == -1) {
                                    var24 = var23;
                                }
                                if (var25 == 0) {
                                    var25 = var23;
                                }
                                if (var26 == 0) {
                                    var26 = var23;
                                }
                                class402 var67 = class92.method545(var23 + -1, (byte) 94);
                                class402 var68 = class92.method545(var24 + -1, (byte) 64);
                                class402 var69 = class92.method545(var25 + -1, (byte) 75);
                                class402 var70 = class92.method545(var26 - 1, (byte) 87);
                                for (int var71 = 0; var71 < var46; ++var71) {
                                    boolean var72 = false;
                                    byte var73;
                                    if (var19[3 & -var21] && var45[0] == var52) {
                                        class73.field928[0] = var48[var52];
                                        class73.field928[1] = 1;
                                        class73.field928[2] = var47[var52];
                                        class73.field928[3] = 1;
                                        class73.field928[4] = var50[var52];
                                        class73.field928[5] = var47[var52];
                                        var73 = 6;
                                    } else if (var19[3 & -var21 + 2] && ~var45[2] == ~var52) {
                                        class73.field928[0] = var48[var52];
                                        class73.field928[1] = 5;
                                        class73.field928[2] = var47[var52];
                                        class73.field928[3] = 5;
                                        class73.field928[4] = var50[var52];
                                        var73 = 6;
                                        class73.field928[5] = var47[var52];
                                    } else if (var19[3 & -var21 + 1] && ~var45[1] == ~var52) {
                                        class73.field928[0] = var48[var52];
                                        class73.field928[1] = 3;
                                        class73.field928[2] = var47[var52];
                                        class73.field928[3] = 3;
                                        class73.field928[4] = var50[var52];
                                        class73.field928[5] = var47[var52];
                                        var73 = 6;
                                    } else if (var19[-var21 + 3 & 3] && var45[3] == var52) {
                                        class73.field928[0] = var48[var52];
                                        class73.field928[1] = 7;
                                        class73.field928[2] = var47[var52];
                                        class73.field928[3] = 7;
                                        class73.field928[4] = var50[var52];
                                        class73.field928[5] = var47[var52];
                                        var73 = 6;
                                    } else {
                                        class73.field928[0] = var48[var52];
                                        class73.field928[1] = var50[var52];
                                        class73.field928[2] = var47[var52];
                                        var73 = 3;
                                    }
                                    for (int var74 = 0; ~var73 < ~var74; ++var74) {
                                        int var75 = class73.field928[var74];
                                        int var76 = 7 & var75 - var21 * 2;
                                        int var77 = class282.field4532[var75];
                                        int var78 = class225.field3744[var75];
                                        int var79;
                                        int var80;
                                        if (~var21 == -2) {
                                            var79 = -var77 + 128;
                                            var80 = var78;
                                        } else if (~var21 == -3) {
                                            var80 = -var77 + 128;
                                            var79 = -var78 + 128;
                                        } else if (~var21 != -4) {
                                            var80 = var77;
                                            var79 = var78;
                                        } else {
                                            var79 = var77;
                                            var80 = -var78 + 128;
                                        }
                                        var57[var53] = var80;
                                        var58[var53] = var79;
                                        if (arg10 && class108.field1513[var20][var75]) {
                                            int var81 = (var13 << 7) + var80;
                                            int var82 = (var15 << 7) + var79;
                                            var55[var53] = arg12.method771(var81, var82) - arg1.method771(var81, var82);
                                        }
                                        if (~var75 > -9 && ~class329.field5159[var76] <= -1) {
                                            if (var56 != null) {
                                                var56[var53] = class98.field1371[var76];
                                            }
                                            var61[var53] = class447.field6525[var76];
                                            var60[var53] = class449.field6547[var76];
                                            var59[var53] = class127.field2015[var76];
                                        } else {
                                            if (var18 && class108.field1513[var20][var75]) {
                                                var60[var53] = var63;
                                                var61[var53] = var64;
                                                var59[var53] = var62;
                                            } else if (var80 == 0 && ~var79 == -1) {
                                                var59[var53] = arg2[var13][var15];
                                                var60[var53] = var67.field6002;
                                                var61[var53] = var67.field5997;
                                            } else if (~var80 == -1 && ~var79 == -129) {
                                                var59[var53] = arg2[var13][var16];
                                                var60[var53] = var68.field6002;
                                                var61[var53] = var68.field5997;
                                            } else if (~var80 == -129 && var79 == 128) {
                                                var59[var53] = arg2[var14][var16];
                                                var60[var53] = var69.field6002;
                                                var61[var53] = var69.field5997;
                                            } else if (~var80 == -129 && ~var79 == -1) {
                                                var59[var53] = arg2[var14][var15];
                                                var60[var53] = var70.field6002;
                                                var61[var53] = var70.field5997;
                                            } else {
                                                if (var80 >= 64) {
                                                    if (var79 < 64) {
                                                        var60[var53] = var70.field6002;
                                                        var61[var53] = var70.field5997;
                                                    } else {
                                                        var60[var53] = var69.field6002;
                                                        var61[var53] = var69.field5997;
                                                    }
                                                } else if (var79 < 64) {
                                                    var60[var53] = var67.field6002;
                                                    var61[var53] = var67.field5997;
                                                } else {
                                                    var60[var53] = var68.field6002;
                                                    var61[var53] = var68.field5997;
                                                }
                                                int var83 = class230.method1635(arg2[var14][var15], var80 << 7 >> 7, arg2[var13][var15], false);
                                                int var84 = class230.method1635(arg2[var14][var16], var80 << 7 >> 7, arg2[var13][var16], false);
                                                var59[var53] = class230.method1635(var84, var79 << 7 >> 7, var83, false);
                                            }
                                            if (var56 != null) {
                                                var56[var53] = var59[var53];
                                            }
                                        }
                                        ++var53;
                                    }
                                    ++var52;
                                }
                                if (var20 != 0 && var28.field5994) {
                                    var17 = true;
                                }
                            }
                            int var85 = arg1.method779(var13, var15);
                            int var86 = arg1.method779(var14, var15);
                            int var87 = arg1.method779(var14, var16);
                            int var88 = arg1.method779(var13, var16);
                            if (arg4 > 0) {
                                boolean var89 = true;
                                if (~var23 == -1 && ~var20 != -1) {
                                    var89 = false;
                                }
                                if (~var22 < -1 && var29 != null && !var29.field3934) {
                                    var89 = false;
                                }
                                if (var89 && var85 == var86 && var85 == var87 && var85 == var88) {
                                    class369.field5616[arg4][var13][var15] = (byte) class35.method227(class369.field5616[arg4][var13][var15], 4);
                                }
                            }
                            int var90 = 0;
                            int var91 = 0;
                            if (arg10) {
                                var90 = class318.method2116(var13, var15);
                                var91 = class277.method1868(var13, var15);
                            }
                            arg1.method768(var13, var15, var57, var55, var58, var59, var56, var60, var61, var90, var91, var17);
                            class362.method2345(arg4, var13, var15);
                        }
                    }
                }
            }
        }
        ++field4580;
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(I)Z")
    public final boolean method186(int arg0) {
        ++field4577;
        return arg0 != 0 ? false : false;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Le;IB)Lid;")
    public final class348 method200(class312 arg0, int arg1, byte arg2) {
        if (arg2 != -52) {
            this.method194((class312) null, -59);
        }
        ++field4571;
        return this.field4574.method2038(false, 0, 1, arg1, false, 0, arg0);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Le;Z)Lum;")
    public final class306 method189(class312 arg0, boolean arg1) {
        ++field4573;
        class348 var3 = this.field4574.method2038(arg1, super.field722, 1, 1024, false, super.field724, arg0);
        if (var3 == null) {
            return null;
        } else {
            class435 var4 = arg0.method713();
            var4.method1984(super.field724, super.field721, super.field722);
            class306 var5 = null;
            if (this.field4592) {
                var5 = class203.method1443(-115, 1);
            }
            if (this.field4574.field4819 != null) {
                class198 var6 = this.field4574.field4819.method489();
                arg0.method561(var3, var6, var4, var5 == null ? null : var5.field4856[0], 0);
            } else {
                var3.method26(var4, var5 != null ? var5.field4856[0] : null, 0);
            }
            this.field4574.method2046(true, arg0, super.field726, super.field711, super.field720, super.field710, 2, var3);
            return var5;
        }
    }

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "(I)V")
    public final void method193(int arg0) {
        if (arg0 != 0) {
            this.method186(37);
        }
        ++field4584;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)I")
    public final int method183(byte arg0) {
        int var2 = 88 % ((49 - arg0) / 47);
        ++field4586;
        return this.field4574.field4805;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lne;IZ)I")
    public static final int method1936(class172 arg0, int arg1, boolean arg2) {
        if (arg2) {
            field4583 = null;
        }
        ++field4589;
        if (arg0.field2716 != null && arg1 < arg0.field2716.length) {
            try {
                int[] var3 = arg0.field2716[arg1];
                int var4 = 0;
                int var5 = 0;
                byte var6 = 0;
                while (true) {
                    int var7 = var3[var5++];
                    int var8 = 0;
                    byte var9 = 0;
                    if (~var7 == -1) {
                        return var4;
                    }
                    if (var7 == 1) {
                        var8 = class205.field3309[var3[var5++]];
                    }
                    if (~var7 == -3) {
                        var8 = class388.field5849[var3[var5++]];
                    }
                    if (~var7 == -4) {
                        var8 = class209.field3354[var3[var5++]];
                    }
                    if (var7 == 4) {
                        int var10 = var3[var5++] << 16;
                        int var11 = var10 + var3[var5++];
                        class172 var12 = class196.method1375(var11, (byte) -56);
                        int var13 = var3[var5++];
                        if (var13 != -1 && (!class155.method1092(true, var13).field1320 || class84.field1040)) {
                            for (int var14 = 0; ~var12.field2858.length < ~var14; ++var14) {
                                if (~(var13 + 1) == ~var12.field2858[var14]) {
                                    var8 += var12.field2720[var14];
                                }
                            }
                        }
                    }
                    if (~var7 == -6) {
                        var8 = class403.field6014[var3[var5++]];
                    }
                    if (var7 == 6) {
                        var8 = class140.field2172[class388.field5849[var3[var5++]] - 1];
                    }
                    if (~var7 == -8) {
                        var8 = class403.field6014[var3[var5++]] * 100 / 46875;
                    }
                    if (var7 == 8) {
                        var8 = class261.field4201.field3603;
                    }
                    if (~var7 == -10) {
                        for (int var15 = 0; var15 < 25; ++var15) {
                            if (class345.field5324[var15]) {
                                var8 += class388.field5849[var15];
                            }
                        }
                    }
                    if (var7 == 10) {
                        int var16 = var3[var5++] << 16;
                        int var17 = var16 + var3[var5++];
                        class172 var18 = class196.method1375(var17, (byte) -56);
                        int var19 = var3[var5++];
                        if (var19 != -1 && (!class155.method1092(!arg2, var19).field1320 || class84.field1040)) {
                            for (int var20 = 0; ~var20 > ~var18.field2858.length; ++var20) {
                                if (~(var19 - -1) == ~var18.field2858[var20]) {
                                    var8 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (~var7 == -12) {
                        var8 = class58.field735;
                    }
                    if (~var7 == -13) {
                        var8 = class77.field964;
                    }
                    if (~var7 == -14) {
                        int var21 = class403.field6014[var3[var5++]];
                        int var22 = var3[var5++];
                        var8 = ~(var21 & 1 << var22) != -1 ? 1 : 0;
                    }
                    if (var7 == 15) {
                        var9 = 1;
                    }
                    if (var7 == 14) {
                        int var23 = var3[var5++];
                        var8 = class338.method2228(var23, -117);
                    }
                    if (var7 == 16) {
                        var9 = 2;
                    }
                    if (var7 == 17) {
                        var9 = 3;
                    }
                    if (var7 == 18) {
                        var8 = (class261.field4201.field724 >> 7) + class409.field6048;
                    }
                    if (~var7 == -20) {
                        var8 = (class261.field4201.field722 >> 7) - -class444.field6481;
                    }
                    if (~var7 == -21) {
                        var8 = var3[var5++];
                    }
                    if (~var9 == -1) {
                        if (var6 == 0) {
                            var4 += var8;
                        }
                        if (~var6 == -2) {
                            var4 -= var8;
                        }
                        if (var6 == 2 && var8 != 0) {
                            var4 /= var8;
                        }
                        if (~var6 == -4) {
                            var4 *= var8;
                        }
                        var6 = 0;
                    } else {
                        var6 = var9;
                    }
                }
            } catch (Exception var24) {
                return -1;
            }
        } else {
            return -2;
        }
    }

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "(B)V")
    public static void method1937(byte arg0) {
        int var1 = -58 / ((-21 - arg0) / 60);
        field4583 = null;
        field4578 = null;
        field4582 = null;
        field4576 = null;
    }
}
