import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class255 extends class297 {

    @OriginalMember(owner = "client!am", name = "t", descriptor = "[I")
    public int[] field4355 = new int[] { -1 };

    @OriginalMember(owner = "client!am", name = "y", descriptor = "[I")
    public int[] field4360 = new int[] { 0 };

    @OriginalMember(owner = "client!am", name = "z", descriptor = "I")
    public static int field4361 = 0;

    @OriginalMember(owner = "client!am", name = "s", descriptor = "I")
    public static int field4354 = -1;

    @OriginalMember(owner = "client!am", name = "u", descriptor = "I")
    public static int field4356;

    @OriginalMember(owner = "client!am", name = "v", descriptor = "I")
    public static int field4357;

    @OriginalMember(owner = "client!am", name = "w", descriptor = "I")
    public static int field4358;

    @OriginalMember(owner = "client!am", name = "x", descriptor = "I")
    public static int field4359;

    @OriginalMember(owner = "client!am", name = "A", descriptor = "I")
    public static int field4362;

    @OriginalMember(owner = "client!am", name = "B", descriptor = "I")
    public static int field4363;

    @OriginalMember(owner = "client!am", name = "C", descriptor = "I")
    public static int field4364;

    @OriginalMember(owner = "client!am", name = "c", descriptor = "(I)[Lrj;", line = 9)
    public static final class237[] method1781(int arg0) {
        if (arg0 < 33) {
            field4361 = -32;
        }
        field4363++;
        class237[] var1 = new class237[class79.field1221];
        for (int var2 = 0; var2 < class79.field1221; var2++) {
            int var3 = class179.field2718[var2] * class112.field1665[var2];
            byte[] var4 = class37.field590[var2];
            if (class70.field1115[var2]) {
                byte[] var5 = class67.field1047[var2];
                int[] var6 = new int[var3];
                for (int var7 = 0; var7 < var3; var7++) {
                    var6[var7] = class264.method1820(class268.field4610[class204.method1354(255, var4[var7])], class204.method1354(var5[var7], 255) << 24);
                }
                var1[var2] = new class273(class282.field4786, class281.field4765, class88.field1315[var2], class287.field4836[var2], class112.field1665[var2], class179.field2718[var2], var6);
            } else {
                int[] var8 = new int[var3];
                for (int var9 = 0; var9 < var3; var9++) {
                    var8[var9] = class268.field4610[class204.method1354(255, var4[var9])];
                }
                var1[var2] = new class109(class282.field4786, class281.field4765, class88.field1315[var2], class287.field4836[var2], class112.field1665[var2], class179.field2718[var2], var8);
            }
        }
        class207.method1365(9);
        return var1;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(III[IIIIIIZB)V", line = 73)
    public static final void method1782(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, byte arg10) {
        field4358++;
        int var11 = arg4;
        if (class191.field2978 <= arg4) {
            return;
        }
        if (arg4 < class191.field2984) {
            var11 = class191.field2984;
        }
        int var12 = arg2 + arg4;
        if (class191.field2984 >= var12) {
            return;
        }
        if (class191.field2978 < var12) {
            var12 = class191.field2978;
        }
        int var13 = arg6;
        if (class191.field2983 <= arg6) {
            return;
        }
        if (arg6 < class191.field2977) {
            var13 = class191.field2977;
        }
        int var14 = arg6 + arg5;
        if (var14 <= class191.field2977) {
            return;
        }
        if (var14 > class191.field2983) {
            var14 = class191.field2983;
        }
        int var15 = var14 - arg6;
        if (arg0 == 9) {
            arg0 = 1;
            arg7 = arg7 + 1 & 0x3;
        }
        if (arg0 == 10) {
            arg7 = arg7 + 3 & 0x3;
            arg0 = 1;
        }
        if (arg0 == 11) {
            arg0 = 8;
            arg7 = arg7 + 3 & 0x3;
        }
        int var16 = class191.field2976 * var13 + var11;
        int var17 = var13 - arg6;
        int var18 = class191.field2976 + var11 - var12;
        int var19 = var12 - arg4;
        int var20 = var11 - arg4;
        int var21 = arg5 - var17;
        int var22 = arg2 - var20;
        int var23 = arg5 - var15;
        int var24 = arg2 - var19;
        if (arg0 == 1) {
            if (arg7 == 0) {
                for (int var87 = var17; var87 < var15; var87++) {
                    for (int var88 = var20; var88 < var19; var88++) {
                        if (var88 <= var87) {
                            arg3[var16] = arg8;
                        } else if (arg9) {
                            arg3[var16] = arg1;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg7 == 1) {
                for (int var85 = var21 - 1; var85 >= var23; var85--) {
                    for (int var86 = var20; var86 < var19; var86++) {
                        if (var86 <= var85) {
                            arg3[var16] = arg8;
                        } else if (arg9) {
                            arg3[var16] = arg1;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg7 == 2) {
                for (int var81 = var17; var81 < var15; var81++) {
                    for (int var82 = var20; var82 < var19; var82++) {
                        if (var81 <= var82) {
                            arg3[var16] = arg8;
                        } else if (arg9) {
                            arg3[var16] = arg1;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg7 == 3) {
                for (int var83 = var21 - 1; var83 >= var23; var83--) {
                    for (int var84 = var20; var84 < var19; var84++) {
                        if (var83 <= var84) {
                            arg3[var16] = arg8;
                        } else if (arg9) {
                            arg3[var16] = arg1;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == 0) {
                for (int var25 = var21 - 1; var25 >= var23; var25--) {
                    for (int var26 = var20; var26 < var19; var26++) {
                        if ((var25 >> 1) >= var26) {
                            arg3[var16] = arg8;
                        } else if (arg9) {
                            arg3[var16] = arg1;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg7 == 1) {
                for (int var27 = var17; var27 < var15; var27++) {
                    for (int var28 = var20; var28 < var19; var28++) {
                        if (var16 >= 0 && var16 < arg3.length) {
                            if ((var27 << 1) <= var28) {
                                arg3[var16] = arg8;
                            } else if (arg9) {
                                arg3[var16] = arg1;
                            }
                            var16++;
                        } else {
                            var16++;
                        }
                    }
                    var16 += var18;
                }
            } else if (arg7 == 2) {
                for (int var31 = var17; var31 < var15; var31++) {
                    for (int var32 = var22 - 1; var32 >= var24; var32--) {
                        if (var32 <= var31 >> 1) {
                            arg3[var16] = arg8;
                        } else if (arg9) {
                            arg3[var16] = arg1;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg7 == 3) {
                for (int var29 = var21 - 1; var29 >= var23; var29--) {
                    for (int var30 = var22 - 1; var30 >= var24; var30--) {
                        if (var30 >= var29 << 1) {
                            arg3[var16] = arg8;
                        } else if (arg9) {
                            arg3[var16] = arg1;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == 0) {
                for (int var73 = var21 - 1; var73 >= var23; var73--) {
                    for (int var74 = var22 - 1; var74 >= var24; var74--) {
                        if ((var73 >> 1) >= var74) {
                            arg3[var16] = arg8;
                        } else if (arg9) {
                            arg3[var16] = arg1;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg7 == 1) {
                for (int var79 = var21 - 1; var79 >= var23; var79--) {
                    for (int var80 = var20; var80 < var19; var80++) {
                        if (var80 >= (var79 << 1)) {
                            arg3[var16] = arg8;
                        } else if (arg9) {
                            arg3[var16] = arg1;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg7 == 2) {
                for (int var77 = var17; var77 < var15; var77++) {
                    for (int var78 = var20; var78 < var19; var78++) {
                        if (var78 <= var77 >> 1) {
                            arg3[var16] = arg8;
                        } else if (arg9) {
                            arg3[var16] = arg1;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg7 == 3) {
                for (int var75 = var17; var75 < var15; var75++) {
                    for (int var76 = var22 - 1; var76 >= var24; var76--) {
                        if (var76 >= (var75 << 1)) {
                            arg3[var16] = arg8;
                        } else if (arg9) {
                            arg3[var16] = arg1;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            }
        } else if (arg0 == 4) {
            if (arg7 == 0) {
                for (int var71 = var21 - 1; var71 >= var23; var71--) {
                    for (int var72 = var20; var72 < var19; var72++) {
                        if ((var71 >> 1) <= var72) {
                            arg3[var16] = arg8;
                        } else if (arg9) {
                            arg3[var16] = arg1;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg7 == 1) {
                for (int var69 = var17; var69 < var15; var69++) {
                    for (int var70 = var20; var70 < var19; var70++) {
                        if (var70 <= (var69 << 1)) {
                            arg3[var16] = arg8;
                        } else if (arg9) {
                            arg3[var16] = arg1;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg7 == 2) {
                for (int var67 = var17; var67 < var15; var67++) {
                    for (int var68 = var22 - 1; var68 >= var24; var68--) {
                        if (var67 >> 1 <= var68) {
                            arg3[var16] = arg8;
                        } else if (arg9) {
                            arg3[var16] = arg1;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg7 == 3) {
                for (int var65 = var21 - 1; var65 >= var23; var65--) {
                    for (int var66 = var22 - 1; var66 >= var24; var66--) {
                        if (var66 <= (var65 << 1)) {
                            arg3[var16] = arg8;
                        } else if (arg9) {
                            arg3[var16] = arg1;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            }
        } else if (arg0 != 5) {
            if (arg0 == 6) {
                if (arg7 == 0) {
                    for (int var41 = var17; var41 < var15; var41++) {
                        for (int var42 = var20; var42 < var19; var42++) {
                            if (arg2 / 2 >= var42) {
                                arg3[var16] = arg8;
                            } else if (arg9) {
                                arg3[var16] = arg1;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg7 == 1) {
                    for (int var63 = var17; var63 < var15; var63++) {
                        for (int var64 = var20; var64 < var19; var64++) {
                            if (var63 <= (arg5 / 2)) {
                                arg3[var16] = arg8;
                            } else if (arg9) {
                                arg3[var16] = arg1;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg7 == 2) {
                    for (int var43 = var17; var43 < var15; var43++) {
                        for (int var44 = var20; var44 < var19; var44++) {
                            if (var44 >= (arg2 / 2)) {
                                arg3[var16] = arg8;
                            } else if (arg9) {
                                arg3[var16] = arg1;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg7 == 3) {
                    for (int var61 = var17; var61 < var15; var61++) {
                        for (int var62 = var20; var62 < var19; var62++) {
                            if (var61 >= arg5 / 2) {
                                arg3[var16] = arg8;
                            } else if (arg9) {
                                arg3[var16] = arg1;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
            }
            if (arg10 != 47) {
                method1781(-80);
            }
            if (arg0 == 7) {
                if (arg7 == 0) {
                    for (int var51 = var17; var51 < var15; var51++) {
                        for (int var52 = var20; var52 < var19; var52++) {
                            if ((var51 - arg5 / 2) >= var52) {
                                arg3[var16] = arg8;
                            } else if (arg9) {
                                arg3[var16] = arg1;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg7 == 1) {
                    for (int var45 = var21 - 1; var45 >= var23; var45--) {
                        for (int var46 = var20; var46 < var19; var46++) {
                            if ((var45 - (arg5 / 2)) >= var46) {
                                arg3[var16] = arg8;
                            } else if (arg9) {
                                arg3[var16] = arg1;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg7 == 2) {
                    for (int var47 = var21 - 1; var47 >= var23; var47--) {
                        for (int var48 = var22 - 1; var48 >= var24; var48--) {
                            if (var48 <= var47 - (arg5 / 2)) {
                                arg3[var16] = arg8;
                            } else if (arg9) {
                                arg3[var16] = arg1;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg7 == 3) {
                    for (int var49 = var17; var49 < var15; var49++) {
                        for (int var50 = var22 - 1; var50 >= var24; var50--) {
                            if (var50 <= (var49 - (arg5 / 2))) {
                                arg3[var16] = arg8;
                            } else if (arg9) {
                                arg3[var16] = arg1;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
            }
            if (arg0 == 8) {
                if (arg7 == 0) {
                    for (int var59 = var17; var59 < var15; var59++) {
                        for (int var60 = var20; var60 < var19; var60++) {
                            if (var60 >= var59 - (arg5 / 2)) {
                                arg3[var16] = arg8;
                            } else if (arg9) {
                                arg3[var16] = arg1;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg7 == 1) {
                    for (int var53 = var21 - 1; var53 >= var23; var53--) {
                        for (int var54 = var20; var54 < var19; var54++) {
                            if (var54 >= var53 - (arg5 / 2)) {
                                arg3[var16] = arg8;
                            } else if (arg9) {
                                arg3[var16] = arg1;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg7 == 2) {
                    for (int var55 = var21 - 1; var55 >= var23; var55--) {
                        for (int var56 = var22 - 1; var56 >= var24; var56--) {
                            if (var56 >= (var55 - (arg5 / 2))) {
                                arg3[var16] = arg8;
                            } else if (arg9) {
                                arg3[var16] = arg1;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg7 == 3) {
                    for (int var57 = var17; var57 < var15; var57++) {
                        for (int var58 = var22 - 1; var58 >= var24; var58--) {
                            if (var57 - arg5 / 2 <= var58) {
                                arg3[var16] = arg8;
                            } else if (arg9) {
                                arg3[var16] = arg1;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
            }
        } else if (arg7 == 0) {
            for (int var33 = var21 - 1; var33 >= var23; var33--) {
                for (int var34 = var22 - 1; var34 >= var24; var34--) {
                    if (var34 >= var33 >> 1) {
                        arg3[var16] = arg8;
                    } else if (arg9) {
                        arg3[var16] = arg1;
                    }
                    var16++;
                }
                var16 += var18;
            }
        } else if (arg7 == 1) {
            for (int var39 = var21 - 1; var39 >= var23; var39--) {
                for (int var40 = var20; var40 < var19; var40++) {
                    if (var39 << 1 >= var40) {
                        arg3[var16] = arg8;
                    } else if (arg9) {
                        arg3[var16] = arg1;
                    }
                    var16++;
                }
                var16 += var18;
            }
        } else if (arg7 == 2) {
            for (int var35 = var17; var35 < var15; var35++) {
                for (int var36 = var20; var36 < var19; var36++) {
                    if (var36 >= var35 >> 1) {
                        arg3[var16] = arg8;
                    } else if (arg9) {
                        arg3[var16] = arg1;
                    }
                    var16++;
                }
                var16 += var18;
            }
        } else if (arg7 == 3) {
            for (int var37 = var17; var37 < var15; var37++) {
                for (int var38 = var22 - 1; var38 >= var24; var38--) {
                    if (var37 << 1 >= var38) {
                        arg3[var16] = arg8;
                    } else if (arg9) {
                        arg3[var16] = arg1;
                    }
                    var16++;
                }
                var16 += var18;
            }
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(ZIBIIILje;)V", line = 1278)
    public static final void method1783(boolean arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, class158 arg6) {
        field4357++;
        long var7 = (long) ((arg3 << 16) + arg1);
        class136 var9 = (class136) class268.field4622.method1372(false, var7);
        if (var9 != null) {
            return;
        }
        class136 var10 = (class136) class274.field4679.method1372(false, var7);
        if (var10 != null) {
            return;
        }
        if (arg5 <= 37) {
            field4362 = 5;
        }
        class136 var11 = (class136) class282.field4780.method1372(false, var7);
        if (var11 == null) {
            if (!arg0) {
                class136 var12 = (class136) class24.field422.method1372(false, var7);
                if (var12 != null) {
                    return;
                }
            }
            class136 var13 = new class136();
            var13.field2009 = arg2;
            var13.field2013 = arg6;
            var13.field2019 = arg4;
            if (arg0) {
                class268.field4622.method1376(var7, -1, var13);
                class267.field4587++;
            } else {
                class216.field3414.method786(var13, 0);
                class282.field4780.method1376(var7, -1, var13);
                class206.field3281++;
            }
        } else if (arg0) {
            var11.method1828(-127);
            class268.field4622.method1376(var7, -1, var11);
            class267.field4587++;
            class206.field3281--;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIII)I", line = 1355)
    public static final int method1784(int arg0, int arg1, int arg2, int arg3) {
        field4356++;
        if (arg2 != 255) {
            return -127;
        } else if ((class18.field321[arg3][arg1][arg0] & 0x8) == 0) {
            return arg3 <= 0 || (class18.field321[1][arg1][arg0] & 0x2) == 0 ? arg3 : arg3 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(BLeb;)Leb;", line = 1382)
    public static final class253 method1785(byte arg0, class253 arg1) {
        field4364++;
        if (arg1.field4196 != -1) {
            return class172.method1140(arg1.field4196, arg0 + 4);
        }
        int var2 = arg1.field4206 >>> 16;
        class174 var3 = (class174) class81.field1253.method1379(true);
        if (arg0 != -122) {
            field4354 = 78;
        }
        while (var3 != null) {
            if (var3.field2660 == var2) {
                return class172.method1140((int) var3.field5004, arg0 - 4);
            }
            var3 = (class174) class81.field1253.method1380((byte) 66);
        }
        return null;
    }
}
