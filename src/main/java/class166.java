import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class166 extends class264 {

    @OriginalMember(owner = "client!cg", name = "L", descriptor = "I")
    private int field2923 = 4096;

    @OriginalMember(owner = "client!cg", name = "J", descriptor = "I")
    private int field2921 = 4096;

    @OriginalMember(owner = "client!cg", name = "S", descriptor = "I")
    private int field2930 = 4096;

    @OriginalMember(owner = "client!cg", name = "M", descriptor = "Lcf;")
    public static class93 field2924 = class147.method1066("settings=", -48);

    @OriginalMember(owner = "client!cg", name = "W", descriptor = "I")
    public static int field2934 = 2301979;

    @OriginalMember(owner = "client!cg", name = "N", descriptor = "I")
    public static int field2925;

    @OriginalMember(owner = "client!cg", name = "O", descriptor = "I")
    public static int field2926;

    @OriginalMember(owner = "client!cg", name = "Q", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!cg", name = "R", descriptor = "I")
    public static int field2929;

    @OriginalMember(owner = "client!cg", name = "T", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!cg", name = "V", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!cg", name = "X", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!cg", name = "Y", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!cg", name = "U", descriptor = "Lwd;")
    public static class22 field2932;

    @OriginalMember(owner = "client!cg", name = "P", descriptor = "Ls;")
    public static class237 field2927;

    @OriginalMember(owner = "client!cg", name = "K", descriptor = "[Ldh;")
    public static class120[] field2922;

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "()V")
    public class166() {
        super(1, false);
    }

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "(B)V")
    public static void method1202(byte arg0) {
        field2927 = null;
        field2922 = null;
        int var1 = 23 % ((arg0 - 6) / 36);
        field2924 = null;
        field2932 = null;
    }

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "(I)V")
    public static final void method1203(int arg0) {
        if (arg0 != 4096) {
            method1203(-103);
        }
        ++field2936;
        class287.field5139.method300(0);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method17(int arg0, boolean arg1) {
        if (arg1) {
            field2931 = 74;
        }
        ++field2926;
        int[][] var3 = super.field4705.method1089(arg0, 27);
        if (super.field4705.field2670) {
            int[][] var4 = this.method1773(-118, 0, arg0);
            int[] var5 = var4[1];
            int[] var6 = var4[2];
            int[] var7 = var4[0];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class176.field3060; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (~var13 == ~var14 && var12 == var14) {
                    var8[var11] = this.field2923 * var13 >> 12;
                    var9[var11] = this.field2921 * var14 >> 12;
                    var10[var11] = this.field2930 * var12 >> 12;
                } else {
                    var8[var11] = this.field2923;
                    var9[var11] = this.field2921;
                    var10[var11] = this.field2930;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IILee;)V")
    public final void method20(int arg0, int arg1, class280 arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    this.field2930 = arg2.method1891(-126);
                }
            } else {
                this.field2921 = arg2.method1891(-127);
            }
        } else {
            this.field2923 = arg2.method1891(-125);
        }
        if (arg0 < 11) {
            method1204((class181) null, 73, 68, true, -100);
        }
        ++field2929;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Ltg;IIZI)V")
    public static final void method1204(class181 arg0, int arg1, int arg2, boolean arg3, int arg4) {
        ++field2933;
        int var5 = arg0.field3270;
        if (~arg0.field3229 == arg2) {
            arg0.field3270 = arg0.field3277;
        } else if (~arg0.field3229 == -2) {
            arg0.field3270 = -arg0.field3277 + arg4;
        } else if (arg0.field3229 != 2) {
            if (~arg0.field3229 == -4) {
                if (~arg0.field3289 != -3) {
                    if (~arg0.field3289 == -8) {
                        arg0.field3270 = (arg0.field3277 + -1) * arg0.field3303 + arg0.field3277 * 115;
                    }
                } else {
                    arg0.field3270 = arg0.field3277 * 32 - -((arg0.field3277 + -1) * arg0.field3303);
                }
            }
        } else {
            arg0.field3270 = arg0.field3277 * arg4 >> 14;
        }
        int var6 = arg0.field3252;
        if (~arg0.field3324 == -1) {
            arg0.field3252 = arg0.field3210;
        } else if (arg0.field3324 != 1) {
            if (arg0.field3324 == 2) {
                arg0.field3252 = arg0.field3210 * arg1 >> 14;
            } else if (~arg0.field3324 == -4) {
                if (arg0.field3289 != 2) {
                    if (arg0.field3289 == 7) {
                        arg0.field3252 = arg0.field3210 * 12 - -((arg0.field3210 + -1) * arg0.field3331);
                    }
                } else {
                    arg0.field3252 = (arg0.field3210 + -1) * arg0.field3331 + arg0.field3210 * 32;
                }
            }
        } else {
            arg0.field3252 = -arg0.field3210 + arg1;
        }
        if (arg0.field3229 == 4) {
            arg0.field3270 = arg0.field3352 * arg0.field3252 / arg0.field3234;
        }
        if (~arg0.field3324 == -5) {
            arg0.field3252 = arg0.field3270 * arg0.field3234 / arg0.field3352;
        }
        if (class252.field4546 && (client.method1109(arg0).field3646 != 0 || arg0.field3289 == 0)) {
            if (arg0.field3252 < 5 && arg0.field3270 < 5) {
                arg0.field3270 = 5;
                arg0.field3252 = 5;
            } else {
                if (arg0.field3252 <= 0) {
                    arg0.field3252 = 5;
                }
                if (arg0.field3270 <= 0) {
                    arg0.field3270 = 5;
                }
            }
        }
        if (~arg0.field3218 == -1338) {
            class34.field538 = arg0;
        }
        if (arg3 && arg0.field3284 != null) {
            if (arg0.field3270 != var5 || arg0.field3252 != var6) {
                class223 var7 = new class223();
                var7.field4015 = arg0.field3284;
                var7.field4017 = arg0;
                class40.field623.method1152((byte) -5, var7);
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1205(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class126.field2240 = 0;
        ++field2935;
        if (arg3 != 6) {
            field2925 = 78;
        }
        for (int var7 = -1; ~var7 > ~(class72.field1299 + class252.field4543); ++var7) {
            class210 var23;
            if (~var7 != 0) {
                if (~class252.field4543 >= ~var7) {
                    var23 = class155.field2709[class58.field995[-class252.field4543 + var7]];
                } else {
                    var23 = class224.field4031[class234.field4166[var7]];
                }
            } else {
                var23 = field2927;
            }
            if (var23 != null && var23.method1478((byte) 20)) {
                if (var23 instanceof class227) {
                    class145 var24 = ((class227) var23).field4062;
                    if (var24.field2523 != null) {
                        var24 = var24.method1058(249);
                    }
                    if (var24 == null) {
                        continue;
                    }
                }
                if (~var7 <= ~class252.field4543) {
                    class145 var30 = ((class227) var23).field4062;
                    if (var30.field2523 != null) {
                        var30 = var30.method1058(arg3 + 243);
                    }
                    if (~var30.field2534 <= -1 && var30.field2534 < class18.field231.length) {
                        int var31;
                        if (var30.field2524 == -1) {
                            var31 = var23.method1481((byte) 93) - -15;
                        } else {
                            var31 = var30.field2524 + 15;
                        }
                        class174.method1245(arg5 >> 1, arg0 >> 1, arg1, var23, arg6, (byte) 0, var31);
                        if (class227.field4057 > -1) {
                            class18.field231[var30.field2534].method560(arg2 - 12 + class227.field4057, class156.field2766 + -30 + arg4);
                        }
                    }
                    class174[] var32 = class44.field707;
                    for (int var33 = 0; var32.length > var33; ++var33) {
                        class174 var48 = var32[var33];
                        if (var48 != null && ~var48.field3028 == -2 && ~class58.field995[-class252.field4543 + var7] == ~var48.field3022 && ~(class275.field4921 % 20) > -11) {
                            int var49;
                            if (~var30.field2524 != 0) {
                                var49 = var30.field2524 + 15;
                            } else {
                                var49 = 15 + var23.method1481((byte) 91);
                            }
                            class174.method1245(arg5 >> 1, arg0 >> 1, arg1, var23, arg6, (byte) 0, var49);
                            if (class227.field4057 > -1) {
                                class264.field4700[var48.field3025].method560(class227.field4057 + arg2 + -12, arg4 - -class156.field2766 + -28);
                            }
                        }
                    }
                } else {
                    int var25 = 30;
                    class237 var26 = (class237) var23;
                    if (~var26.field4222 != 0 || var26.field4234 != -1) {
                        class174.method1245(arg5 >> 1, arg0 >> 1, arg1, var23, arg6, (byte) 0, 15 + var23.method1481((byte) 108));
                        if (~class227.field4057 < 0) {
                            if (var26.field4222 != -1) {
                                class97.field1731[var26.field4222].method560(class227.field4057 + arg2 + -12, -var25 + arg4 - -class156.field2766);
                                var25 += 25;
                            }
                            if (~var26.field4234 != 0) {
                                class18.field231[var26.field4234].method560(class227.field4057 + arg2 - 12, -var25 + arg4 - -class156.field2766);
                                var25 += 25;
                            }
                        }
                    }
                    if (var7 >= 0) {
                        class174[] var27 = class44.field707;
                        for (int var28 = 0; var28 < var27.length; ++var28) {
                            class174 var29 = var27[var28];
                            if (var29 != null && ~var29.field3028 == -11 && class234.field4166[var7] == var29.field3022) {
                                class174.method1245(arg5 >> 1, arg0 >> 1, arg1, var23, arg6, (byte) 0, var23.method1481((byte) 80) - -15);
                                if (~class227.field4057 < 0) {
                                    class264.field4700[var29.field3025].method560(class227.field4057 + -12 + arg2, -var25 + arg4 + class156.field2766);
                                }
                            }
                        }
                    }
                }
                if (var23.field3792 != null && (var7 >= class252.field4543 || ~class195.field3565 == -1 || ~class195.field3565 == -4 || class195.field3565 == 1 && class232.method1589(((class237) var23).field4247, (byte) 123))) {
                    class174.method1245(arg5 >> 1, arg0 >> 1, arg1, var23, arg6, (byte) 0, var23.method1481((byte) 109));
                    if (class227.field4057 > -1 && class126.field2240 < class117.field2092) {
                        class117.field2085[class126.field2240] = class183.field3383.method1820(var23.field3792) / 2;
                        class117.field2091[class126.field2240] = class183.field3383.field4888;
                        class117.field2074[class126.field2240] = class227.field4057;
                        class117.field2079[class126.field2240] = class156.field2766;
                        class117.field2069[class126.field2240] = var23.field3835;
                        class117.field2083[class126.field2240] = var23.field3810;
                        class117.field2088[class126.field2240] = var23.field3773;
                        class117.field2086[class126.field2240] = var23.field3792;
                        ++class126.field2240;
                    }
                }
                if (~class275.field4921 > ~var23.field3772) {
                    class120 var34 = class255.field4615[0];
                    class120 var35 = class255.field4615[1];
                    int var39;
                    if (var23 instanceof class227) {
                        class227 var36 = (class227) var23;
                        class120[] var37 = (class120[]) class148.field2606.method302((long) var36.field4062.field2517, 0);
                        if (var37 == null) {
                            var37 = class168.method1211(127, 0, class246.field4436, var36.field4062.field2517);
                            if (var37 != null) {
                                class148.field2606.method297((long) var36.field4062.field2517, var37, arg3 + 10408);
                            }
                        }
                        if (var37 != null && var37.length == 2) {
                            var34 = var37[0];
                            var35 = var37[1];
                        }
                        class145 var38 = var36.field4062;
                        if (var38.field2524 != -1) {
                            var39 = var38.field2524;
                        } else {
                            var39 = var23.method1481((byte) -12);
                        }
                    } else {
                        var39 = var23.method1481((byte) -34);
                    }
                    class174.method1245(arg5 >> 1, arg0 >> 1, arg1, var23, arg6, (byte) 0, var39 + 10 + var34.field2127);
                    if (class227.field4057 > -1) {
                        int var40 = arg2 - -class227.field4057 + -(var34.field2135 >> 1);
                        int var41 = arg4 + -3 - -class156.field2766;
                        var34.method560(var40, var41);
                        int var42 = var23.field3855 * var34.field2135 / 255;
                        int var43 = var34.field2127;
                        class75.method520(var40, var41, var40 + var42, var41 + var43);
                        var35.method560(var40, var41);
                        class75.method507(arg2, arg4, arg0 + arg2, arg4 - -arg5);
                    }
                }
                for (int var44 = 0; ~var44 > -5; ++var44) {
                    if (~var23.field3854[var44] < ~class275.field4921) {
                        int var47;
                        if (var23 instanceof class227) {
                            class227 var45 = (class227) var23;
                            class145 var46 = var45.field4062;
                            if (~var46.field2524 == 0) {
                                var47 = var23.method1481((byte) 82) / 2;
                            } else {
                                var47 = var46.field2524 / 2;
                            }
                        } else {
                            var47 = var23.method1481((byte) -87) / 2;
                        }
                        class174.method1245(arg5 >> 1, arg0 >> 1, arg1, var23, arg6, (byte) 0, var47);
                        if (~class227.field4057 < 0) {
                            if (~var44 == -2) {
                                class156.field2766 -= 20;
                            }
                            if (var44 == 2) {
                                class227.field4057 -= 15;
                                class156.field2766 -= 10;
                            }
                            if (var44 == 3) {
                                class156.field2766 -= 10;
                                class227.field4057 += 15;
                            }
                            class58.field996[var23.field3769[var44]].method560(class227.field4057 + arg2 + -12, arg4 - 12 + class156.field2766);
                            class63.field1149.method1836(class148.method1067(arg3 ^ -7009, var23.field3787[var44]), class227.field4057 + -1 + arg2, arg4 + 3 + class156.field2766, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var8 = 0; ~var8 > ~class126.field2240; ++var8) {
            int var9 = class117.field2074[var8];
            int var10 = class117.field2079[var8];
            int var11 = class117.field2085[var8];
            boolean var12 = true;
            int var13 = class117.field2091[var8];
            while (var12) {
                var12 = false;
                for (int var22 = 0; var8 > var22; ++var22) {
                    if (~(class117.field2079[var22] + -class117.field2091[var22]) > ~(var10 + 2) && ~(class117.field2079[var22] + 2) < ~(-var13 + var10) && ~(class117.field2085[var22] + class117.field2074[var22]) < ~(-var11 + var9) && ~(var9 + var11) < ~(class117.field2074[var22] + -class117.field2085[var22]) && class117.field2079[var22] + -class117.field2091[var22] < var10) {
                        var12 = true;
                        var10 = class117.field2079[var22] + -class117.field2091[var22];
                    }
                }
            }
            class227.field4057 = class117.field2074[var8];
            class156.field2766 = class117.field2079[var8] = var10;
            class93 var14 = class117.field2086[var8];
            if (class128.field2256 == 0) {
                int var15 = 16776960;
                if (class117.field2069[var8] < 6) {
                    var15 = class29.field375[class117.field2069[var8]];
                }
                if (~class117.field2069[var8] == -7) {
                    var15 = ~(class278.field4975 % 20) > -11 ? 16711680 : 16776960;
                }
                if (class117.field2069[var8] == 7) {
                    var15 = ~(class278.field4975 % 20) <= -11 ? 65535 : 255;
                }
                if (class117.field2069[var8] == 8) {
                    var15 = ~(class278.field4975 % 20) <= -11 ? 8454016 : 45056;
                }
                if (class117.field2069[var8] == 9) {
                    int var16 = 150 - class117.field2088[var8];
                    if (var16 < 50) {
                        var15 = var16 * 1280 + 16711680;
                    } else if (var16 >= 100) {
                        if (~var16 > -151) {
                            var15 = (var16 + -100) * 5 + 65280;
                        }
                    } else {
                        var15 = -((var16 + -50) * 327680) + 16776960;
                    }
                }
                if (class117.field2069[var8] == 10) {
                    int var17 = 150 - class117.field2088[var8];
                    if (~var17 <= -51) {
                        if (~var17 > -101) {
                            var15 = -(var17 * 327680) + 33095935;
                        } else if (var17 < 150) {
                            var15 = var17 * 327680 + -((var17 - 100) * 5) + -32768000 + 255;
                        }
                    } else {
                        var15 = var17 * 5 + 16711680;
                    }
                }
                if (class117.field2069[var8] == 11) {
                    int var18 = -class117.field2088[var8] + 150;
                    if (var18 >= 50) {
                        if (var18 < 100) {
                            var15 = (var18 - 50) * 327685 + 65280;
                        } else if (~var18 > -151) {
                            var15 = 49545215 - var18 * 327680;
                        }
                    } else {
                        var15 = -(var18 * 327685) + 16777215;
                    }
                }
                if (class117.field2083[var8] == 0) {
                    class183.field3383.method1836(var14, class227.field4057 + arg2, class156.field2766 + arg4, var15, 0);
                }
                if (class117.field2083[var8] == 1) {
                    class183.field3383.method1819(var14, class227.field4057 + arg2, class156.field2766 + arg4, var15, 0, class278.field4975);
                }
                if (class117.field2083[var8] == 2) {
                    class183.field3383.method1830(var14, arg2 - -class227.field4057, class156.field2766 + arg4, var15, 0, class278.field4975);
                }
                if (~class117.field2083[var8] == -4) {
                    class183.field3383.method1814(var14, class227.field4057 + arg2, class156.field2766 + arg4, var15, 0, class278.field4975, 150 - class117.field2088[var8]);
                }
                if (~class117.field2083[var8] == -5) {
                    int var19 = (150 - class117.field2088[var8]) * (100 + class183.field3383.method1820(var14)) / 150;
                    class75.method520(class227.field4057 + -50 + arg2, arg4, arg2 + 50 + class227.field4057, arg4 + arg5);
                    class183.field3383.method1832(var14, arg2 + 50 + class227.field4057 + -var19, arg4 - -class156.field2766, var15, 0);
                    class75.method507(arg2, arg4, arg2 - -arg0, arg4 + arg5);
                }
                if (class117.field2083[var8] == 5) {
                    int var20 = -class117.field2088[var8] + 150;
                    class75.method520(arg2, arg4 + -1 - (-class156.field2766 - -class183.field3383.field4888), arg0 + arg2, arg4 + 5 + class156.field2766);
                    int var21 = 0;
                    if (var20 >= 25) {
                        if (var20 > 125) {
                            var21 = var20 + -125;
                        }
                    } else {
                        var21 = var20 + -25;
                    }
                    class183.field3383.method1836(var14, class227.field4057 + arg2, class156.field2766 - -var21 + arg4, var15, 0);
                    class75.method507(arg2, arg4, arg0 + arg2, arg4 - -arg5);
                }
            } else {
                class183.field3383.method1836(var14, arg2 - -class227.field4057, class156.field2766 + arg4, 16776960, 0);
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "(I)V")
    public static final void method1206(int arg0) {
        class260.field4672.method300(0);
        ++field2928;
        if (arg0 > -52) {
            field2925 = -128;
        }
    }
}
