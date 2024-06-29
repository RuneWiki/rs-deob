import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class258 {

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "Ljava/lang/String;")
    public static String field3852 = "Loaded wordpack";

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIII[BZ[Lo;)[I", line = 4)
    public static final int[] method1896(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, boolean arg6, class96[] arg7) {
        if (arg0 <= 70) {
            method1900((class361) null, -38);
        }
        field3854++;
        if (!arg6) {
            for (int var8 = 0; var8 < 4; var8++) {
                for (int var9 = 0; var9 < 64; var9++) {
                    for (int var10 = 0; var10 < 64; var10++) {
                        if ((arg4 + var9) > 0 && (arg4 + var9) < 103 && (arg1 + var10) > 0 && (arg1 + var10) < 103) {
                            arg7[var8].field1349[arg4 + var9][arg1 + var10] = class287.method2076(arg7[var8].field1349[arg4 + var9][arg1 + var10], -2097153);
                        }
                    }
                }
            }
        }
        int var11 = arg2 + arg4;
        byte var12;
        if (arg6) {
            var12 = 1;
        } else {
            var12 = 4;
        }
        class190 var13 = new class190(arg5);
        int var14 = arg1 + arg3;
        for (int var15 = 0; var15 < var12; var15++) {
            for (int var16 = 0; var16 < 64; var16++) {
                for (int var17 = 0; var17 < 64; var17++) {
                    class165.method1178(false, arg1 + var17, var13, var15, 0, arg6, 0, arg4 + var16, 0, 0, var14 + var17, var11 + var16);
                }
            }
        }
        boolean var18 = false;
        boolean var19 = false;
        while (var13.field2718.length > var13.field2776) {
            int var20 = var13.method1319(255);
            if (var20 == 128) {
                class343.field5299[0] = var13.method1317((byte) 124);
                var18 = true;
                class343.field5299[1] = var13.method1347((byte) 61);
                class343.field5299[2] = var13.method1347((byte) 61);
                class343.field5299[3] = var13.method1347((byte) 61);
                class343.field5299[4] = var13.method1317((byte) 94);
            } else {
                if (var20 != 129) {
                    var13.field2776--;
                    break;
                }
                var19 = true;
                for (int var21 = 0; var21 < 4; var21++) {
                    byte var22 = var13.method1322(9813);
                    if (var22 == 0) {
                        int var23 = arg4;
                        int var24 = arg1;
                        if (arg1 < 0) {
                            var24 = 0;
                        } else if (arg1 >= 104) {
                            var24 = 104;
                        }
                        int var25 = arg4 + 64;
                        if (var25 < 0) {
                            var25 = 0;
                        } else if (var25 >= 104) {
                            var25 = 104;
                        }
                        if (arg4 < 0) {
                            var23 = 0;
                        } else if (arg4 >= 104) {
                            var23 = 104;
                        }
                        int var26 = arg1 + 64;
                        if (var26 < 0) {
                            var26 = 0;
                        } else if (var26 >= 104) {
                            var26 = 104;
                        }
                        while (var23 < var25) {
                            while (var26 > var24) {
                                class286.field4309[var21][var23][var24] = 0;
                                var24++;
                            }
                            var23++;
                        }
                    } else if (var22 == 1) {
                        for (int var31 = 0; var31 < 64; var31 += 4) {
                            for (int var32 = 0; var32 < 64; var32 += 4) {
                                byte var33 = var13.method1322(9813);
                                for (int var34 = arg4 + var31; var34 < (arg4 + var31 + 4); var34++) {
                                    for (int var35 = arg1 + var32; var35 < arg1 + var32 + 4; var35++) {
                                        if (var34 >= 0 && var34 < 104 && var35 >= 0 && var35 < 104) {
                                            class286.field4309[var21][var34][var35] = var33;
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var22 == 2 && var21 > 0) {
                        int var27 = arg4;
                        if (arg4 < 0) {
                            var27 = 0;
                        } else if (arg4 >= 104) {
                            var27 = 104;
                        }
                        int var28 = arg4 + 64;
                        int var29 = arg1;
                        if (arg1 < 0) {
                            var29 = 0;
                        } else if (arg1 >= 104) {
                            var29 = 104;
                        }
                        if (var28 < 0) {
                            var28 = 0;
                        } else if (var28 >= 104) {
                            var28 = 104;
                        }
                        int var30 = arg1 + 64;
                        if (var30 < 0) {
                            var30 = 0;
                        } else if (var30 >= 104) {
                            var30 = 104;
                        }
                        while (var28 > var27) {
                            while (var30 > var29) {
                                class286.field4309[var21][var27][var29] = class286.field4309[var21 - 1][var27][var29];
                                var29++;
                            }
                            var27++;
                        }
                    }
                }
            }
        }
        if (class141.field2031 && !arg6) {
            class2 var36 = null;
            while (true) {
                while (var13.field2776 < var13.field2718.length) {
                    int var37 = var13.method1319(255);
                    if (var37 == 0) {
                        var36 = new class2(var13);
                    } else if (var37 == 1) {
                        int var38 = var13.method1319(255);
                        if (var38 > 0) {
                            for (int var39 = 0; var39 < var38; var39++) {
                                class277 var40 = new class277(var13);
                                if (var40.field4196 == 31) {
                                    class207 var41 = class20.method127((byte) -125, var13.method1317((byte) 120));
                                    var40.method2026(var41.field3030, var41.field3023, var41.field3024, var41.field3033, 0);
                                }
                                var40.field4222 += arg4 << 7;
                                var40.field4208 += arg1 << 7;
                                int var42 = var40.field4208 >> 7;
                                int var43 = var40.field4222 >> 7;
                                if (var43 >= 0 && var42 >= 0 && var43 < 104 && var42 < 104) {
                                    var40.field4218 = (class230.field3491[1][var43][var42] & 0x2) != 0;
                                    var40.field4224 = class132.field1930[var40.field4214][var43][var42] - var40.field4224;
                                    class268.method1976(var40);
                                }
                            }
                        }
                    } else if (var37 == 2) {
                        if (var36 == null) {
                            var36 = new class2();
                        }
                        var36.method10(var13, -124);
                    } else {
                        throw new IllegalStateException();
                    }
                }
                if (var36 == null) {
                    var36 = new class2();
                }
                for (int var44 = 0; var44 < 8; var44++) {
                    for (int var45 = 0; var45 < 8; var45++) {
                        int var46 = (arg4 >> 3) + var44;
                        int var47 = (arg1 >> 3) + var45;
                        if (var46 >= 0 && var46 < 13 && var47 >= 0 && var47 < 13) {
                            class73.field1070[var46][var47] = var36;
                        }
                    }
                }
                break;
            }
        }
        if (!var19) {
            for (int var48 = 0; var48 < 4; var48++) {
                for (int var49 = 0; var49 < 16; var49++) {
                    for (int var50 = 0; var50 < 16; var50++) {
                        int var51 = (arg1 >> 2) + var50;
                        int var52 = (arg4 >> 2) + var49;
                        if (var52 >= 0 && var52 < 26 && var51 >= 0 && var51 < 26) {
                            class286.field4309[var48][var52][var51] = 0;
                        }
                    }
                }
            }
        }
        return var18 ? class343.field5299 : null;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lqm;[I[IZ[I)V", line = 424)
    public static final void method1897(class228 arg0, int[] arg1, int[] arg2, boolean arg3, int[] arg4) {
        if (!arg3) {
            method1896(4, 24, -108, 102, 35, (byte[]) null, false, (class96[]) null);
        }
        for (int var5 = 0; var5 < arg4.length; var5++) {
            int var6 = arg4[var5];
            int var7 = arg2[var5];
            int var8 = arg1[var5];
            int var9 = 0;
            while (var8 != 0 && arg0.field5185.length > var9) {
                if ((var8 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg0.field5185[var9] = null;
                    } else {
                        class248 var10 = class119.method893(var6, (byte) -41);
                        int var11 = var10.field3691;
                        class124 var12 = arg0.field5185[var9];
                        if (var12 != null) {
                            if (var12.field1796 == var6) {
                                if (var11 == 0) {
                                    var12 = arg0.field5185[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field1802 = 0;
                                    var12.field1799 = 0;
                                    var12.field1800 = 0;
                                    var12.field1798 = 1;
                                    var12.field1804 = var7;
                                    class361.method2512(-29521, arg0.field5137, class1.field55 == arg0, 0, var10, arg0.field5165);
                                } else if (var11 == 2) {
                                    var12.field1800 = 0;
                                }
                            } else if (var10.field3666 >= class119.method893(var12.field1796, (byte) -41).field3666) {
                                var12 = arg0.field5185[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class124 var13 = arg0.field5185[var9] = new class124();
                            var13.field1799 = 0;
                            var13.field1804 = var7;
                            var13.field1798 = 1;
                            var13.field1796 = var6;
                            var13.field1800 = 0;
                            var13.field1802 = 0;
                            class361.method2512(-29521, arg0.field5137, class1.field55 == arg0, 0, var10, arg0.field5165);
                        }
                    }
                }
                var9++;
                var8 >>>= 0x1;
            }
        }
        field3855++;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIIZ)V", line = 532)
    public static final void method1898(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class18.field295 = arg1;
        class146.field2109 = arg2;
        class261.field3975 = arg3;
        class251.field3726 = new class167[arg0][class18.field295][class146.field2109];
        class287.field4340 = new int[arg0][class18.field295 + 1][class146.field2109 + 1];
        if (class141.field2031) {
            class247.field3663 = new class224[4][];
        }
        if (arg4) {
            class129.field1875 = new class167[1][class18.field295][class146.field2109];
            class165.field2358 = new int[class18.field295][class146.field2109];
            class240.field3567 = new int[1][class18.field295 + 1][class146.field2109 + 1];
            if (class141.field2031) {
                class253.field3781 = new class224[1][];
            }
        } else {
            class129.field1875 = (class167[][][]) null;
            class165.field2358 = (int[][]) null;
            class240.field3567 = (int[][][]) null;
            class253.field3781 = (class224[][]) null;
        }
        class119.method892(false);
        class294.field4430 = new class252[500];
        class132.field1926 = 0;
        class193.field2814 = new class252[500];
        class81.field1154 = 0;
        class272.field4125 = new int[arg0][class18.field295 + 1][class146.field2109 + 1];
        class344.field5330 = new class180[5000];
        class352.field5421 = 0;
        class331.field5039 = new class180[100];
        class322.field4852 = new boolean[class261.field3975 + class261.field3975 + 1][class261.field3975 + class261.field3975 + 1];
        class48.field721 = new boolean[class261.field3975 + class261.field3975 + 2][class261.field3975 + class261.field3975 + 2];
        class286.field4309 = new byte[arg0][class18.field295][class146.field2109];
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)V", line = 574)
    public static void method1899(byte arg0) {
        field3852 = null;
        if (arg0 != 109) {
            method1901(38, -51, -89, -56, -107, -108, 51, (byte) -114);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lph;I)V", line = 585)
    public static final void method1900(class361 arg0, int arg1) {
        class27.field386 = arg0.method2505("titlebg", (byte) -47);
        class241.field3600 = arg0.method2505("logo", (byte) -127);
        if (arg1 != 27965) {
            field3852 = (String) null;
        }
        field3856++;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIIIIIB)V", line = 605)
    public static final void method1901(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        int var8 = 23 / ((-arg7 - 58) / 54);
        field3853++;
        int var9 = arg3 + arg4;
        int var10 = arg6 - arg4;
        int var11 = arg1 + arg4;
        for (int var12 = arg3; var12 < var9; var12++) {
            class329.method2285(arg1, class274.field4158[var12], (byte) -121, arg2, arg0);
        }
        for (int var13 = arg6; var13 > var10; var13--) {
            class329.method2285(arg1, class274.field4158[var13], (byte) 124, arg2, arg0);
        }
        int var14 = arg2 - arg4;
        for (int var15 = var9; var15 <= var10; var15++) {
            int[] var16 = class274.field4158[var15];
            class329.method2285(arg1, var16, (byte) 108, var11, arg0);
            class329.method2285(var11, var16, (byte) -88, var14, arg5);
            class329.method2285(var14, var16, (byte) -54, arg2, arg0);
        }
    }
}
