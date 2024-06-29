import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class275 extends class112 {

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "Lhj;")
    public static class258 field4273 = new class258();

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "Lac;")
    public static class241 field4279 = new class241(0, 0);

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
    public static int field4274;

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "I")
    public static int field4275;

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "I")
    public static int field4276;

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "I")
    public static int field4277;

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "I")
    public static int field4278;

    @OriginalMember(owner = "client!cf", name = "s", descriptor = "I")
    public static int field4282;

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "Ljd;")
    public static class95 field4280;

    @OriginalMember(owner = "client!cf", name = "r", descriptor = "[B")
    public static byte[] field4281;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)V", line = 7)
    public static final void method1911(int arg0, int arg1) {
        class179.method1345(class179.field2840, ((float) arg1 * 0.1F + 0.7F) * 1.1523438F, 0.69921875F, 0.69921875F);
        field4275++;
        class179.method1343(-50.0F, -60.0F, -50.0F);
        class179.method1339(class179.field2839, arg0, false);
        class179.method1340();
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IBIII)V", line = 20)
    public static final void method1912(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 > -41) {
            return;
        }
        if (class234.field3569 <= (arg0 - arg4) && class322.field4965 >= arg0 + arg4 && (arg3 - arg4) >= class212.field3261 && (arg3 + arg4) <= class182.field2888) {
            class339.method2364(arg4, (byte) 108, arg3, arg0, arg2);
        } else {
            class279.method1932(119, arg4, arg3, arg0, arg2);
        }
        field4274++;
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)[Lvn;", line = 38)
    public static final class134[] method1913(int arg0) {
        if (class12.field151 == null) {
            class134[] var1 = class90.method655(class330.field5074, (byte) -72);
            int var2 = 0;
            class134[] var3 = new class134[var1.length];
            label58: for (int var4 = 0; var4 < var1.length; var4++) {
                class134 var5 = var1[var4];
                if ((var5.field2040 <= 0 || var5.field2040 >= 24) && var5.field2035 >= 800 && var5.field2043 >= 600) {
                    for (int var6 = 0; var6 < var2; var6++) {
                        class134 var7 = var3[var6];
                        if (var5.field2035 == var7.field2035 && var5.field2043 == var7.field2043) {
                            if (var5.field2040 > var7.field2040) {
                                var3[var6] = var5;
                            }
                            continue label58;
                        }
                    }
                    var3[var2] = var5;
                    var2++;
                }
            }
            class12.field151 = new class134[var2];
            class126.method941(var3, 0, class12.field151, 0, var2);
            int[] var8 = new int[class12.field151.length];
            for (int var9 = 0; var9 < class12.field151.length; var9++) {
                class134 var10 = class12.field151[var9];
                var8[var9] = var10.field2043 * var10.field2035;
            }
            class222.method1577(class12.field151, false, var8);
        }
        field4277++;
        if (arg0 < 2) {
            method1915((byte) -50, -17, 45, 20, -73, 56, -127, 34, -32, 76, -87);
        }
        return class12.field151;
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(I)V", line = 114)
    public static void method1914(int arg0) {
        field4281 = null;
        if (arg0 != 16777215) {
            field4281 = (byte[]) null;
        }
        field4279 = null;
        field4273 = null;
        field4280 = null;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(BIIIIIIIIII)V", line = 138)
    public static final void method1915(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field4278++;
        int var11 = arg8 - arg10;
        int var12 = arg9 - arg7;
        if (class229.field3494 > arg8) {
            var11++;
        }
        if (arg9 < class243.field3691) {
            var12++;
        }
        int var10000;
        for (int var13 = 0; var13 < var12; var13++) {
            int var14 = arg2 + (arg4 * var13) >> 16;
            int var15 = (var13 + 1) * arg4 + arg2 >> 16;
            int var16 = var15 - var14;
            if (var16 > 0) {
                int var17 = arg7 + var13 >> 6;
                if (var17 >= 0 && (class157.field2389.length - 1) >= var17) {
                    int var18 = arg5 + var14;
                    int var19 = arg5 + var15;
                    byte[][] var20 = class209.field3194[var17];
                    int[][] var21 = class157.field2389[var17];
                    byte[][] var22 = class240.field3653[var17];
                    byte[][] var23 = class210.field3221[var17];
                    byte[][] var24 = class158.field2408[var17];
                    byte[][] var25 = class147.field2234[var17];
                    for (int var26 = 0; var26 < var11; var26++) {
                        int var27 = arg6 * var26 + arg3 >> 16;
                        int var28 = arg3 + ((var26 + 1) * arg6) >> 16;
                        int var29 = var28 - var27;
                        if (var29 > 0) {
                            int var30 = arg1 + var28;
                            int var31 = arg10 + var26 >> 6;
                            int var32 = arg1 + var27;
                            int var33 = arg10 + var26 & 0x3F;
                            int var34 = arg7 + var13 & 0x3F;
                            int var35 = (var33 << 6) + var34;
                            int var36;
                            if (var31 < 0 || var21.length - 1 < var31 || var21[var31] == null) {
                                if (class163.field2649.field4023 != -1) {
                                    var36 = class163.field2649.field4023;
                                } else if ((arg7 + var13 & 0x4) == (arg10 + var26 & 0x4)) {
                                    var36 = class332.field5171[class303.field4645 + 1];
                                } else {
                                    var36 = 4936552;
                                }
                                if (var31 < 0 || var31 > (var21.length - 1)) {
                                    if (var36 == 0) {
                                        var36 = 1;
                                    }
                                    class287.method1987(var18, var32, var16, var29, var36);
                                    continue;
                                }
                            } else {
                                var36 = var21[var31][var35];
                            }
                            if (var36 == 0) {
                                var36 = 1;
                            }
                            int var37 = var20[var31] == null ? 0 : class332.field5171[var20[var31][var35] & 0xFF];
                            int var38 = var23[var31] == null ? 0 : class332.field5171[var23[var31][var35] & 0xFF];
                            if (var37 == 0 && var38 == 0) {
                                class287.method1987(var18, var32, var16, var29, var36);
                            } else {
                                if (var37 != 0) {
                                    byte var39 = var22[var31] == null ? 0 : var22[var31][var35];
                                    int var40 = var39 & 0xFC;
                                    if (var37 == -1) {
                                        var37 = 1;
                                    }
                                    if (var40 == 0 || var16 <= 1 || var29 <= 1) {
                                        class287.method1987(var18, var32, var16, var29, var37);
                                    } else {
                                        class118.method902(var16, var32, var37, var39 & 0x3, 114, true, var40 >> 2, var36, class287.field4453, var29, var18);
                                    }
                                }
                                if (var38 != 0) {
                                    if (var38 == -1) {
                                        var38 = var36;
                                    }
                                    byte var41 = var24[var31][var35];
                                    int var42 = var41 & 0xFC;
                                    if (var42 == 0 || var16 <= 1 || var29 <= 1) {
                                        class287.method1987(var18, var32, var16, var29, var38);
                                    }
                                    class118.method902(var16, var32, var38, var41 & 0x3, 121, var37 == 0, var42 >> 2, 0, class287.field4453, var29, var18);
                                }
                            }
                            if (var25[var31] != null) {
                                int var43 = var25[var31][var35] & 0xFF;
                                if (var43 != 0) {
                                    int var44;
                                    if (var16 == 1) {
                                        var44 = var18;
                                    } else {
                                        var44 = var19 - 1;
                                    }
                                    int var45;
                                    if (var29 == 1) {
                                        var45 = var32;
                                    } else {
                                        var45 = var30 - 1;
                                    }
                                    int var46 = 13421772;
                                    if (var43 >= 5 && var43 <= 8 || var43 >= 13 && var43 <= 16 || var43 >= 21 && var43 <= 24 || var43 == 27 || var43 == 28) {
                                        var46 = 13369344;
                                        var43 -= 4;
                                    }
                                    if (var43 == 1) {
                                        class287.method1979(var18, var32, var29, var46);
                                    } else if (var43 == 2) {
                                        class287.method1990(var18, var32, var16, var46);
                                    } else if (var43 == 3) {
                                        class287.method1979(var44, var32, var29, var46);
                                    } else if (var43 == 4) {
                                        class287.method1990(var18, var45, var16, var46);
                                    } else if (var43 == 9) {
                                        class287.method1979(var18, var32, var29, 16777215);
                                        class287.method1990(var18, var32, var16, var46);
                                    } else if (var43 == 10) {
                                        class287.method1979(var44, var32, var29, 16777215);
                                        class287.method1990(var18, var32, var16, var46);
                                    } else if (var43 == 11) {
                                        class287.method1979(var44, var32, var29, 16777215);
                                        class287.method1990(var18, var45, var16, var46);
                                    } else if (var43 == 12) {
                                        class287.method1979(var18, var32, var29, 16777215);
                                        class287.method1990(var18, var45, var16, var46);
                                    } else if (var43 == 17) {
                                        class287.method1990(var18, var32, 1, var46);
                                    } else if (var43 == 18) {
                                        class287.method1990(var44, var32, 1, var46);
                                    } else if (var43 == 19) {
                                        class287.method1990(var44, var45, 1, var46);
                                    } else if (var43 == 20) {
                                        class287.method1990(var18, var45, 1, var46);
                                    } else if (var43 == 25) {
                                        for (int var47 = 0; var47 < var29; var47++) {
                                            class287.method1990(var18 + var47, var45 - var47, 1, var46);
                                        }
                                    } else if (var43 == 26) {
                                        for (int var48 = 0; var48 < var29; var48++) {
                                            class287.method1990(var18 + var48, var32 + var48, 1, var46);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    var10000 = arg5 + var15;
                    int var50 = arg5 + var14;
                    for (int var51 = 0; var51 < var11; var51++) {
                        int var52;
                        if (class163.field2649.field4023 != -1) {
                            var52 = class163.field2649.field4023;
                        } else if ((var13 + arg7 & 0x4) == (arg10 + var51 & 0x4)) {
                            var52 = class332.field5171[class303.field4645 + 1];
                        } else {
                            var52 = 4936552;
                        }
                        if (var52 == 0) {
                            var52 = 1;
                        }
                        int var53 = (arg6 * var51 + arg3 >> 16) + arg1;
                        int var54 = ((var51 + 1) * arg6 + arg3 >> 16) + arg1;
                        int var55 = var54 - var53;
                        class287.method1987(var50, var53, var16, var55, var52);
                    }
                }
            }
        }
        if (arg0 >= -32) {
            method1911(-94, -59);
        }
        for (int var56 = -2; var56 < (var12 + 2); var56++) {
            int var57 = arg4 * var56 + arg2 >> 16;
            int var58 = (var56 + 1) * arg4 + arg2 >> 16;
            int var59 = var58 - var57;
            if (var59 > 0) {
                int var60 = arg5 + var57;
                var10000 = arg5 + var58;
                int var62 = arg7 + var56 >> 6;
                if (var62 >= 0 && var62 <= class335.field5214.length - 1) {
                    int[][] var63 = class335.field5214[var62];
                    for (int var64 = -2; var64 < (var11 + 2); var64++) {
                        int var65 = arg6 * var64 + arg3 >> 16;
                        int var66 = arg3 + ((var64 + 1) * arg6) >> 16;
                        int var67 = var66 - var65;
                        if (var67 > 0) {
                            int var68 = var64 + arg10 >> 6;
                            int var69 = arg1 + var65;
                            var10000 = arg1 + var66;
                            if (var68 >= 0 && var68 <= (var63.length - 1)) {
                                int var71 = (var64 + arg10 & 0x3F << 6) + (arg7 + var56 & 0x3F);
                                if (var63[var68] != null) {
                                    int var72 = var63[var68][var71];
                                    int var73 = var72 & 0x1FFF;
                                    if (var73 != 0) {
                                        int var74 = var72 >> 13 & 0x3;
                                        boolean var75 = ((var72 & 0x8BEF) >> 15) == 1;
                                        class219 var76 = class283.method1960(var73 - 1, 34);
                                        class42 var77 = var76.method1558(var75, -16287, var74);
                                        if (var77 != null) {
                                            int var78 = var77.field5047 * var59 / 4;
                                            int var79 = var77.field5049 * var67 / 4;
                                            if (var76.field3355) {
                                                int var80 = (var72 & 0xF6933) >> 16;
                                                int var81 = var72 >> 20 & 0xF;
                                                if ((var74 & 0x1) == 1) {
                                                    int var82 = var80;
                                                    var80 = var81;
                                                    var81 = var82;
                                                }
                                                var79 = var67 * var81;
                                                var78 = var59 * var80;
                                            }
                                            if (var78 != 0 && var79 != 0) {
                                                if (var76.field3354 == 0) {
                                                    var77.method328(var60, var67 + var69 - var79, var78, var79);
                                                } else {
                                                    var77.method326(var60, var67 + var69 - var79, var78, var79, var76.field3354);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
