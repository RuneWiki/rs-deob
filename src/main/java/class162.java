import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class162 extends class222 {

    @OriginalMember(owner = "client!bg", name = "cb", descriptor = "I")
    private int field2930 = 6;

    @OriginalMember(owner = "client!bg", name = "gb", descriptor = "Lgj;")
    public static class226 field2934 = new class226(200);

    @OriginalMember(owner = "client!bg", name = "ib", descriptor = "Lsb;")
    public static class98 field2936 = class47.method368("titlebg", 0);

    @OriginalMember(owner = "client!bg", name = "W", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!bg", name = "Y", descriptor = "I")
    public static int field2926;

    @OriginalMember(owner = "client!bg", name = "Z", descriptor = "I")
    public static int field2927;

    @OriginalMember(owner = "client!bg", name = "bb", descriptor = "I")
    public static int field2929;

    @OriginalMember(owner = "client!bg", name = "db", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!bg", name = "eb", descriptor = "I")
    public static int field2932;

    @OriginalMember(owner = "client!bg", name = "fb", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!bg", name = "hb", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!bg", name = "ab", descriptor = "Lac;")
    public static class188 field2928;

    @OriginalMember(owner = "client!bg", name = "X", descriptor = "[I")
    public static int[] field2925;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "(I)V")
    public static void method1172(int arg0) {
        field2936 = null;
        if (arg0 != 0) {
            method1172(-36);
        }
        field2925 = null;
        field2934 = null;
        field2928 = null;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Llj;ZI)V")
    public final void method3(class216 arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.method7((byte) 46, -52);
        }
        if (arg2 != 0) {
            if (arg2 == 1) {
                super.field3842 = arg0.method1446(5350) == 1;
            }
        } else {
            this.field2930 = arg0.method1446(5350);
        }
        ++field2932;
    }

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "(I)V")
    public static final void method1173(int arg0) {
        class144.field2528.method1554((byte) -109);
        ++field2929;
        if (arg0 != 4096) {
            field2925 = null;
        }
        class224.field3862.method1554((byte) -109);
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(IIIII)V")
    public static final void method1174(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2926;
        class128.method964(arg0, arg2, arg0 + arg1, arg2 - -arg3);
        class128.method967(arg0, arg2, arg1, arg3, 0);
        if (class226.field3903 >= 100) {
            if (arg4 <= 48) {
                method1174(-62, 40, -4, -41, 59);
            }
            if (class83.field1461 == null || ~class83.field1461.field1454 != ~arg1 || ~class83.field1461.field1444 != ~arg3) {
                class247 var5 = new class247(arg1, arg3);
                class128.method973(var5.field4338, arg1, arg3);
                class115.method866(0, 0, arg3, 0, class148.field2743, arg1, class140.field2488, (byte) 105, 0);
                class83.field1461 = var5;
                class189.field3278.method1631(0);
            }
            class83.field1461.method617(arg0, arg2);
            int var6 = class252.field4418 * arg3 / class148.field2743 + arg2;
            int var7 = class194.field3369 * arg1 / class140.field2488;
            int var8 = class161.field2915 * arg1 / class140.field2488 + arg0;
            int var9 = class41.field680 * arg3 / class148.field2743;
            class128.method968(var8, var6, var7, var9, 16711680, 128);
            class128.method963(var8, var6, var7, var9, 16711680);
            if (~class62.field1036 < -1 && ~(class62.field1036 % 10) > -6) {
                for (class253 var10 = (class253) class192.field3322.method371((byte) 61); var10 != null; var10 = (class253) class192.field3322.method370(true)) {
                    if (class106.field1905 == var10.field4429) {
                        int var11 = arg0 - -(var10.field4428 * arg1 / class140.field2488);
                        int var12 = arg2 - -(var10.field4435 * arg3 / class148.field2743);
                        class128.method967(var11 + -2, var12 + -2, 4, 4, 16776960);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(II)[[I")
    public final int[][] method4(int arg0, int arg1) {
        ++field2933;
        if (arg1 != 1) {
            field2935 = -20;
        }
        int[][] var3 = super.field3834.method627(4103, arg0);
        if (super.field3834.field1486) {
            int[][] var4 = this.method1531(arg0, 0, arg1 ^ 122);
            int[][] var5 = this.method1531(arg0, 1, 110);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var4[1];
            int[] var9 = var5[0];
            int[] var10 = var4[0];
            int[] var11 = var3[2];
            int[] var12 = var4[2];
            int[] var13 = var5[2];
            int[] var14 = var5[1];
            int var15 = this.field2930;
            if (var15 != 1) {
                if (var15 != 2) {
                    if (~var15 != -4) {
                        if (var15 != 4) {
                            if (~var15 != -6) {
                                if (var15 != 6) {
                                    if (var15 != 7) {
                                        if (var15 != 8) {
                                            if (var15 != 9) {
                                                if (~var15 != -11) {
                                                    if (var15 != 11) {
                                                        if (var15 == 12) {
                                                            for (int var16 = 0; class13.field253 > var16; ++var16) {
                                                                int var17 = var13[var16];
                                                                int var18 = var8[var16];
                                                                int var19 = var9[var16];
                                                                int var20 = var10[var16];
                                                                int var21 = var14[var16];
                                                                int var22 = var12[var16];
                                                                var6[var16] = -(var19 * var20 >> 11) + var19 + var20;
                                                                var7[var16] = var18 + var21 + -(var18 * var21 >> 11);
                                                                var11[var16] = -(var17 * var22 >> 11) + var22 + var17;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; ~var23 > ~class13.field253; ++var23) {
                                                            int var24 = var10[var23];
                                                            int var25 = var9[var23];
                                                            int var26 = var14[var23];
                                                            int var27 = var12[var23];
                                                            int var28 = var13[var23];
                                                            int var29 = var8[var23];
                                                            var6[var23] = ~var25 > ~var24 ? -var25 + var24 : -var24 + var25;
                                                            var7[var23] = ~var26 > ~var29 ? -var26 + var29 : -var29 + var26;
                                                            var11[var23] = ~var28 > ~var27 ? -var28 + var27 : -var27 + var28;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; ~var30 > ~class13.field253; ++var30) {
                                                        int var31 = var13[var30];
                                                        int var32 = var8[var30];
                                                        int var33 = var14[var30];
                                                        int var34 = var9[var30];
                                                        int var35 = var10[var30];
                                                        int var36 = var12[var30];
                                                        var6[var30] = var35 > var34 ? var35 : var34;
                                                        var7[var30] = ~var33 > ~var32 ? var32 : var33;
                                                        var11[var30] = ~var31 <= ~var36 ? var31 : var36;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; ~var37 > ~class13.field253; ++var37) {
                                                    int var38 = var10[var37];
                                                    int var39 = var9[var37];
                                                    int var40 = var13[var37];
                                                    int var41 = var12[var37];
                                                    int var42 = var14[var37];
                                                    int var43 = var8[var37];
                                                    var6[var37] = ~var39 < ~var38 ? var38 : var39;
                                                    var7[var37] = ~var43 <= ~var42 ? var42 : var43;
                                                    var11[var37] = var40 <= var41 ? var40 : var41;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; class13.field253 > var44; ++var44) {
                                                int var45 = var8[var44];
                                                int var46 = var10[var44];
                                                int var47 = var12[var44];
                                                var6[var44] = var46 == 0 ? 0 : -((-var9[var44] + 4096 << 12) / var46) + 4096;
                                                var7[var44] = ~var45 != -1 ? -((-var14[var44] + 4096 << 12) / var45) + 4096 : 0;
                                                var11[var44] = ~var47 == -1 ? 0 : 4096 - (4096 - var13[var44] << 12) / var47;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; class13.field253 > var48; ++var48) {
                                            int var49 = var10[var48];
                                            int var50 = var12[var48];
                                            int var51 = var8[var48];
                                            var6[var48] = var49 != 4096 ? (var9[var48] << 12) / (-var49 + 4096) : 4096;
                                            var7[var48] = ~var51 != -4097 ? (var14[var48] << 12) / (-var51 + 4096) : 4096;
                                            var11[var48] = var50 != 4096 ? (var13[var48] << 12) / (-var50 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; var52 < class13.field253; ++var52) {
                                        int var53 = var13[var52];
                                        int var54 = var14[var52];
                                        int var55 = var9[var52];
                                        var6[var52] = var55 >= 2048 ? -((-var10[var52] + 4096) * (-var55 + 4096) >> 11) + 4096 : var10[var52] * var55 >> 11;
                                        var7[var52] = var54 < 2048 ? var8[var52] * var54 >> 11 : -((-var8[var52] + 4096) * (-var54 + 4096) >> 11) + 4096;
                                        var11[var52] = var53 < 2048 ? var12[var52] * var53 >> 11 : -((4096 - var53) * (-var12[var52] + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var56 = 0; var56 < class13.field253; ++var56) {
                                    var6[var56] = -((4096 - var9[var56]) * (-var10[var56] + 4096) >> 12) + 4096;
                                    var7[var56] = -((-var8[var56] + 4096) * (-var14[var56] + 4096) >> 12) + 4096;
                                    var11[var56] = -((-var12[var56] + 4096) * (-var13[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; ~class13.field253 < ~var57; ++var57) {
                                int var58 = var9[var57];
                                int var59 = var14[var57];
                                int var60 = var13[var57];
                                var6[var57] = ~var58 == -1 ? 4096 : (var10[var57] << 12) / var58;
                                var7[var57] = var59 != 0 ? (var8[var57] << 12) / var59 : 4096;
                                var11[var57] = ~var60 != -1 ? (var12[var57] << 12) / var60 : 4096;
                            }
                        }
                    } else {
                        for (int var61 = 0; class13.field253 > var61; ++var61) {
                            var6[var61] = var9[var61] * var10[var61] >> 12;
                            var7[var61] = var8[var61] * var14[var61] >> 12;
                            var11[var61] = var12[var61] * var13[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; ~var62 > ~class13.field253; ++var62) {
                        var6[var62] = var10[var62] + -var9[var62];
                        var7[var62] = var8[var62] + -var14[var62];
                        var11[var62] = var12[var62] - var13[var62];
                    }
                }
            } else {
                for (int var63 = 0; var63 < class13.field253; ++var63) {
                    var6[var63] = var9[var63] + var10[var63];
                    var7[var63] = var8[var63] + var14[var63];
                    var11[var63] = var12[var63] + var13[var63];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(BI)[I")
    public final int[] method7(byte arg0, int arg1) {
        if (arg0 <= 35) {
            method1173(-97);
        }
        ++field2927;
        int[] var3 = super.field3844.method22(0, arg1);
        if (super.field3844.field61) {
            int[] var4 = this.method1537((byte) 70, 0, arg1);
            int[] var5 = this.method1537((byte) 88, 1, arg1);
            int var6 = this.field2930;
            if (var6 != 1) {
                if (~var6 != -3) {
                    if (var6 != 3) {
                        if (~var6 != -5) {
                            if (~var6 != -6) {
                                if (~var6 != -7) {
                                    if (~var6 != -8) {
                                        if (~var6 != -9) {
                                            if (~var6 != -10) {
                                                if (var6 != 10) {
                                                    if (~var6 != -12) {
                                                        if (~var6 == -13) {
                                                            for (int var7 = 0; ~var7 > ~class13.field253; ++var7) {
                                                                int var8 = var4[var7];
                                                                int var9 = var5[var7];
                                                                var3[var7] = var8 - -var9 - (var8 * var9 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; class13.field253 > var10; ++var10) {
                                                            int var11 = var4[var10];
                                                            int var12 = var5[var10];
                                                            var3[var10] = ~var11 < ~var12 ? var11 - var12 : -var11 + var12;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; var13 < class13.field253; ++var13) {
                                                        int var14 = var5[var13];
                                                        int var15 = var4[var13];
                                                        var3[var13] = var15 <= var14 ? var14 : var15;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; ~var16 > ~class13.field253; ++var16) {
                                                    int var17 = var4[var16];
                                                    int var18 = var5[var16];
                                                    var3[var16] = ~var18 >= ~var17 ? var18 : var17;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; ~class13.field253 < ~var19; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = ~var20 != -1 ? -((-var5[var19] + 4096 << 12) / var20) + 4096 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; var21 < class13.field253; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = ~var22 != -4097 ? (var5[var21] << 12) / (-var22 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; class13.field253 > var23; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = ~var24 <= -2049 ? -((4096 - var24) * (-var4[var23] + 4096) >> 11) + 4096 : var4[var23] * var24 >> 11;
                                    }
                                }
                            } else {
                                for (int var25 = 0; ~class13.field253 < ~var25; ++var25) {
                                    var3[var25] = -((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; var26 < class13.field253; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = ~var27 != -1 ? (var4[var26] << 12) / var27 : 4096;
                            }
                        }
                    } else {
                        for (int var28 = 0; class13.field253 > var28; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; var29 < class13.field253; ++var29) {
                        var3[var29] = var4[var29] - var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; ~class13.field253 < ~var30; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "()V")
    public class162() {
        super(2, false);
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(BI)I")
    public static final int method1175(byte arg0, int arg1) {
        ++field2931;
        if (arg0 != -25) {
            field2936 = null;
        }
        if (~arg1 <= -98 && arg1 <= 122 || arg1 >= 224 && ~arg1 >= -255 && ~arg1 != -248) {
            return arg1 + -32;
        } else if (arg1 == 255) {
            return 159;
        } else {
            return ~arg1 == -157 ? 140 : arg1;
        }
    }
}
