import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class103 extends class317 {

    @OriginalMember(owner = "client!hk", name = "M", descriptor = "I")
    public static int field1406 = 0;

    @OriginalMember(owner = "client!hk", name = "T", descriptor = "Ljava/lang/String;")
    public static String field1413 = "Your friend list is full. Max of 100 for free users, and 200 for members.";

    @OriginalMember(owner = "client!hk", name = "J", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!hk", name = "K", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!hk", name = "N", descriptor = "I")
    public static int field1407;

    @OriginalMember(owner = "client!hk", name = "O", descriptor = "I")
    public static int field1408;

    @OriginalMember(owner = "client!hk", name = "P", descriptor = "I")
    public static int field1409;

    @OriginalMember(owner = "client!hk", name = "Q", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!hk", name = "R", descriptor = "I")
    public static int field1411;

    @OriginalMember(owner = "client!hk", name = "S", descriptor = "I")
    public static int field1412;

    @OriginalMember(owner = "client!hk", name = "L", descriptor = "Lbc;")
    public static class4 field1405;

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "()V", line = 7)
    public class103() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(II)[I", line = 22)
    public final int[] method140(int arg0, int arg1) {
        int[] var3 = this.field4847.method1387(arg1, (byte) -123);
        if (arg0 != 542) {
            return (int[]) null;
        }
        if (this.field4847.field2751) {
            class281.method1944(var3, 0, class326.field4933, class51.field693[arg1]);
        }
        field1407++;
        return var3;
    }

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "(I)Lvm;", line = 41)
    public static final class297 method756(int arg0) {
        field1408++;
        if (arg0 != 255) {
            field1406 = 64;
        }
        return class135.field1864;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IZ)Z", line = 52)
    public static final boolean method757(int arg0, boolean arg1) {
        field1412++;
        if (class41.field472 == arg0) {
            return false;
        }
        class203.field2908 = new int[104][104];
        if (arg1) {
            return false;
        }
        class199.field2840 = new int[4][13][13];
        for (int var2 = 0; var2 < 4; var2++) {
            class312.field4714[var2] = new class72(104, 104);
        }
        class246.field3544 = new class192[4][104][104];
        class136.field1887 = new byte[4][104][104];
        class240.field3406 = new byte[4][104][104];
        if (class67.field908) {
            class147.method1056(4, 104, 104);
            class322.method2259(104, 104);
            class181.field2431 = new class85[13][13];
        }
        class41.field472 = arg0;
        return true;
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(Z)V", line = 96)
    public static void method758(boolean arg0) {
        field1405 = null;
        if (!arg0) {
            method762(-10, true);
        }
        field1413 = null;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIZII[IIIIII)V", line = 108)
    public static final void method759(int arg0, int arg1, boolean arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var11 = arg0;
        field1404++;
        if (arg0 >= class38.field431) {
            return;
        }
        int var12 = arg0 + arg4;
        if (class38.field434 > arg0) {
            var11 = class38.field434;
        }
        if (class38.field434 >= var12) {
            return;
        }
        if (var12 > class38.field431) {
            var12 = class38.field431;
        }
        if (arg3 != -12702) {
            field1405 = (class4) null;
        }
        int var13 = arg6;
        if (arg6 >= class38.field428) {
            return;
        }
        if (arg6 < class38.field427) {
            var13 = class38.field427;
        }
        int var14 = arg1 + arg6;
        if (class38.field427 >= var14) {
            return;
        }
        if (var14 > class38.field428) {
            var14 = class38.field428;
        }
        int var15 = var14 - arg6;
        if (arg9 == 9) {
            arg8 = arg8 + 1 & 0x3;
            arg9 = 1;
        }
        int var16 = class38.field433 * var13 + var11;
        if (arg9 == 10) {
            arg8 = arg8 + 3 & 0x3;
            arg9 = 1;
        }
        int var17 = var13 - arg6;
        int var18 = arg1 - var17;
        if (arg9 == 11) {
            arg9 = 8;
            arg8 = arg8 + 3 & 0x3;
        }
        int var19 = class38.field433 + var11 - var12;
        int var20 = arg1 - var15;
        int var21 = var11 - arg0;
        int var22 = var12 - arg0;
        int var23 = arg4 - var22;
        int var24 = arg4 - var21;
        if (arg9 == 1) {
            if (arg8 == 0) {
                for (int var87 = var17; var87 < var15; var87++) {
                    for (int var88 = var21; var88 < var22; var88++) {
                        if (var87 >= var88) {
                            arg5[var16] = arg10;
                        } else if (arg2) {
                            arg5[var16] = arg7;
                        }
                        var16++;
                    }
                    var16 += var19;
                }
            } else if (arg8 == 1) {
                for (int var85 = var18 - 1; var85 >= var20; var85--) {
                    for (int var86 = var21; var86 < var22; var86++) {
                        if (var85 >= var86) {
                            arg5[var16] = arg10;
                        } else if (arg2) {
                            arg5[var16] = arg7;
                        }
                        var16++;
                    }
                    var16 += var19;
                }
            } else if (arg8 == 2) {
                for (int var81 = var17; var81 < var15; var81++) {
                    for (int var82 = var21; var82 < var22; var82++) {
                        if (var81 <= var82) {
                            arg5[var16] = arg10;
                        } else if (arg2) {
                            arg5[var16] = arg7;
                        }
                        var16++;
                    }
                    var16 += var19;
                }
            } else if (arg8 == 3) {
                for (int var83 = var18 - 1; var83 >= var20; var83--) {
                    for (int var84 = var21; var84 < var22; var84++) {
                        if (var84 >= var83) {
                            arg5[var16] = arg10;
                        } else if (arg2) {
                            arg5[var16] = arg7;
                        }
                        var16++;
                    }
                    var16 += var19;
                }
            }
        } else if (arg9 == 2) {
            if (arg8 == 0) {
                for (int var79 = var18 - 1; var79 >= var20; var79--) {
                    for (int var80 = var21; var80 < var22; var80++) {
                        if (var79 >> 1 >= var80) {
                            arg5[var16] = arg10;
                        } else if (arg2) {
                            arg5[var16] = arg7;
                        }
                        var16++;
                    }
                    var16 += var19;
                }
            } else if (arg8 == 1) {
                for (int var77 = var17; var77 < var15; var77++) {
                    for (int var78 = var21; var78 < var22; var78++) {
                        if (var16 >= 0 && arg5.length > var16) {
                            if (var77 << 1 <= var78) {
                                arg5[var16] = arg10;
                            } else if (arg2) {
                                arg5[var16] = arg7;
                            }
                            var16++;
                        } else {
                            var16++;
                        }
                    }
                    var16 += var19;
                }
            } else if (arg8 == 2) {
                for (int var73 = var17; var73 < var15; var73++) {
                    for (int var74 = var24 - 1; var74 >= var23; var74--) {
                        if (var73 >> 1 >= var74) {
                            arg5[var16] = arg10;
                        } else if (arg2) {
                            arg5[var16] = arg7;
                        }
                        var16++;
                    }
                    var16 += var19;
                }
            } else if (arg8 == 3) {
                for (int var75 = var18 - 1; var75 >= var20; var75--) {
                    for (int var76 = var24 - 1; var76 >= var23; var76--) {
                        if (var75 << 1 <= var76) {
                            arg5[var16] = arg10;
                        } else if (arg2) {
                            arg5[var16] = arg7;
                        }
                        var16++;
                    }
                    var16 += var19;
                }
            }
        } else if (arg9 == 3) {
            if (arg8 == 0) {
                for (int var31 = var18 - 1; var31 >= var20; var31--) {
                    for (int var32 = var24 - 1; var32 >= var23; var32--) {
                        if (var32 <= var31 >> 1) {
                            arg5[var16] = arg10;
                        } else if (arg2) {
                            arg5[var16] = arg7;
                        }
                        var16++;
                    }
                    var16 += var19;
                }
            } else if (arg8 == 1) {
                for (int var25 = var18 - 1; var25 >= var20; var25--) {
                    for (int var26 = var21; var26 < var22; var26++) {
                        if (var25 << 1 <= var26) {
                            arg5[var16] = arg10;
                        } else if (arg2) {
                            arg5[var16] = arg7;
                        }
                        var16++;
                    }
                    var16 += var19;
                }
            } else if (arg8 == 2) {
                for (int var29 = var17; var29 < var15; var29++) {
                    for (int var30 = var21; var30 < var22; var30++) {
                        if (var30 <= var29 >> 1) {
                            arg5[var16] = arg10;
                        } else if (arg2) {
                            arg5[var16] = arg7;
                        }
                        var16++;
                    }
                    var16 += var19;
                }
            } else if (arg8 == 3) {
                for (int var27 = var17; var27 < var15; var27++) {
                    for (int var28 = var24 - 1; var28 >= var23; var28--) {
                        if (var27 << 1 <= var28) {
                            arg5[var16] = arg10;
                        } else if (arg2) {
                            arg5[var16] = arg7;
                        }
                        var16++;
                    }
                    var16 += var19;
                }
            }
        } else if (arg9 == 4) {
            if (arg8 == 0) {
                for (int var33 = var18 - 1; var33 >= var20; var33--) {
                    for (int var34 = var21; var34 < var22; var34++) {
                        if (var33 >> 1 <= var34) {
                            arg5[var16] = arg10;
                        } else if (arg2) {
                            arg5[var16] = arg7;
                        }
                        var16++;
                    }
                    var16 += var19;
                }
            } else if (arg8 == 1) {
                for (int var35 = var17; var35 < var15; var35++) {
                    for (int var36 = var21; var36 < var22; var36++) {
                        if (var36 <= (var35 << 1)) {
                            arg5[var16] = arg10;
                        } else if (arg2) {
                            arg5[var16] = arg7;
                        }
                        var16++;
                    }
                    var16 += var19;
                }
            } else if (arg8 == 2) {
                for (int var39 = var17; var39 < var15; var39++) {
                    for (int var40 = var24 - 1; var40 >= var23; var40--) {
                        if (var40 >= (var39 >> 1)) {
                            arg5[var16] = arg10;
                        } else if (arg2) {
                            arg5[var16] = arg7;
                        }
                        var16++;
                    }
                    var16 += var19;
                }
            } else if (arg8 == 3) {
                for (int var37 = var18 - 1; var37 >= var20; var37--) {
                    for (int var38 = var24 - 1; var38 >= var23; var38--) {
                        if (var37 << 1 >= var38) {
                            arg5[var16] = arg10;
                        } else if (arg2) {
                            arg5[var16] = arg7;
                        }
                        var16++;
                    }
                    var16 += var19;
                }
            }
        } else if (arg9 != 5) {
            if (arg9 == 6) {
                if (arg8 == 0) {
                    for (int var41 = var17; var41 < var15; var41++) {
                        for (int var42 = var21; var42 < var22; var42++) {
                            if (var42 <= arg4 / 2) {
                                arg5[var16] = arg10;
                            } else if (arg2) {
                                arg5[var16] = arg7;
                            }
                            var16++;
                        }
                        var16 += var19;
                    }
                    return;
                }
                if (arg8 == 1) {
                    for (int var63 = var17; var63 < var15; var63++) {
                        for (int var64 = var21; var64 < var22; var64++) {
                            if (var63 <= arg1 / 2) {
                                arg5[var16] = arg10;
                            } else if (arg2) {
                                arg5[var16] = arg7;
                            }
                            var16++;
                        }
                        var16 += var19;
                    }
                    return;
                }
                if (arg8 == 2) {
                    for (int var43 = var17; var43 < var15; var43++) {
                        for (int var44 = var21; var44 < var22; var44++) {
                            if (var44 >= (arg4 / 2)) {
                                arg5[var16] = arg10;
                            } else if (arg2) {
                                arg5[var16] = arg7;
                            }
                            var16++;
                        }
                        var16 += var19;
                    }
                    return;
                }
                if (arg8 == 3) {
                    for (int var61 = var17; var61 < var15; var61++) {
                        for (int var62 = var21; var62 < var22; var62++) {
                            if ((arg1 / 2) <= var61) {
                                arg5[var16] = arg10;
                            } else if (arg2) {
                                arg5[var16] = arg7;
                            }
                            var16++;
                        }
                        var16 += var19;
                    }
                    return;
                }
            }
            if (arg9 == 7) {
                if (arg8 == 0) {
                    for (int var45 = var17; var45 < var15; var45++) {
                        for (int var46 = var21; var46 < var22; var46++) {
                            if ((var45 - arg1 / 2) >= var46) {
                                arg5[var16] = arg10;
                            } else if (arg2) {
                                arg5[var16] = arg7;
                            }
                            var16++;
                        }
                        var16 += var19;
                    }
                    return;
                }
                if (arg8 == 1) {
                    for (int var47 = var18 - 1; var47 >= var20; var47--) {
                        for (int var48 = var21; var48 < var22; var48++) {
                            if (var47 - (arg1 / 2) >= var48) {
                                arg5[var16] = arg10;
                            } else if (arg2) {
                                arg5[var16] = arg7;
                            }
                            var16++;
                        }
                        var16 += var19;
                    }
                    return;
                }
                if (arg8 == 2) {
                    for (int var49 = var18 - 1; var49 >= var20; var49--) {
                        for (int var50 = var24 - 1; var50 >= var23; var50--) {
                            if (var50 <= var49 - (arg1 / 2)) {
                                arg5[var16] = arg10;
                            } else if (arg2) {
                                arg5[var16] = arg7;
                            }
                            var16++;
                        }
                        var16 += var19;
                    }
                    return;
                }
                if (arg8 == 3) {
                    for (int var51 = var17; var51 < var15; var51++) {
                        for (int var52 = var24 - 1; var52 >= var23; var52--) {
                            if (var52 <= (var51 - (arg1 / 2))) {
                                arg5[var16] = arg10;
                            } else if (arg2) {
                                arg5[var16] = arg7;
                            }
                            var16++;
                        }
                        var16 += var19;
                    }
                    return;
                }
            }
            if (arg9 == 8) {
                if (arg8 == 0) {
                    for (int var53 = var17; var53 < var15; var53++) {
                        for (int var54 = var21; var54 < var22; var54++) {
                            if (var53 - (arg1 / 2) <= var54) {
                                arg5[var16] = arg10;
                            } else if (arg2) {
                                arg5[var16] = arg7;
                            }
                            var16++;
                        }
                        var16 += var19;
                    }
                    return;
                }
                if (arg8 == 1) {
                    for (int var59 = var18 - 1; var59 >= var20; var59--) {
                        for (int var60 = var21; var60 < var22; var60++) {
                            if (var60 >= var59 - (arg1 / 2)) {
                                arg5[var16] = arg10;
                            } else if (arg2) {
                                arg5[var16] = arg7;
                            }
                            var16++;
                        }
                        var16 += var19;
                    }
                    return;
                }
                if (arg8 == 2) {
                    for (int var57 = var18 - 1; var57 >= var20; var57--) {
                        for (int var58 = var24 - 1; var58 >= var23; var58--) {
                            if (var57 - (arg1 / 2) <= var58) {
                                arg5[var16] = arg10;
                            } else if (arg2) {
                                arg5[var16] = arg7;
                            }
                            var16++;
                        }
                        var16 += var19;
                    }
                    return;
                }
                if (arg8 == 3) {
                    for (int var55 = var17; var55 < var15; var55++) {
                        for (int var56 = var24 - 1; var56 >= var23; var56--) {
                            if ((var55 - (arg1 / 2)) <= var56) {
                                arg5[var16] = arg10;
                            } else if (arg2) {
                                arg5[var16] = arg7;
                            }
                            var16++;
                        }
                        var16 += var19;
                    }
                    return;
                }
            }
        } else if (arg8 == 0) {
            for (int var71 = var18 - 1; var71 >= var20; var71--) {
                for (int var72 = var24 - 1; var72 >= var23; var72--) {
                    if (var71 >> 1 <= var72) {
                        arg5[var16] = arg10;
                    } else if (arg2) {
                        arg5[var16] = arg7;
                    }
                    var16++;
                }
                var16 += var19;
            }
        } else if (arg8 == 1) {
            for (int var65 = var18 - 1; var65 >= var20; var65--) {
                for (int var66 = var21; var66 < var22; var66++) {
                    if (var66 <= var65 << 1) {
                        arg5[var16] = arg10;
                    } else if (arg2) {
                        arg5[var16] = arg7;
                    }
                    var16++;
                }
                var16 += var19;
            }
        } else if (arg8 == 2) {
            for (int var69 = var17; var69 < var15; var69++) {
                for (int var70 = var21; var70 < var22; var70++) {
                    if (var69 >> 1 <= var70) {
                        arg5[var16] = arg10;
                    } else if (arg2) {
                        arg5[var16] = arg7;
                    }
                    var16++;
                }
                var16 += var19;
            }
        } else if (arg8 == 3) {
            for (int var67 = var17; var67 < var15; var67++) {
                for (int var68 = var24 - 1; var68 >= var23; var68--) {
                    if (var67 << 1 >= var68) {
                        arg5[var16] = arg10;
                    } else if (arg2) {
                        arg5[var16] = arg7;
                    }
                    var16++;
                }
                var16 += var19;
            }
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "([[B[Lre;I[[F[[BI[[B[[I[[F[[F[[BI)V", line = 1288)
    public static final void method760(byte[][] arg0, class270[] arg1, int arg2, float[][] arg3, byte[][] arg4, int arg5, byte[][] arg6, int[][] arg7, float[][] arg8, float[][] arg9, byte[][] arg10, int arg11) {
        field1410++;
        for (int var12 = 0; var12 < arg5; var12++) {
            class270 var13 = arg1[var12];
            if (var13.field4010 == arg11) {
                class233 var14 = new class233();
                int var15 = (var13.field4025 >> 7) - var13.field4026;
                int var16 = 0;
                int var17 = (var13.field4008 >> 7) - var13.field4026;
                if (var17 < 0) {
                    var16 -= var17;
                    var17 = 0;
                }
                int var18 = (var13.field4008 >> 7) + var13.field4026;
                if (var18 > 103) {
                    var18 = 103;
                }
                for (int var19 = var17; var19 <= var18; var19++) {
                    short var20 = var13.field4017[var16];
                    int var21 = (var20 >> 8) + var15;
                    int var22 = (var20 & 0xFF) + var21 - 1;
                    if (var21 < 0) {
                        var21 = 0;
                    }
                    if (var22 > 103) {
                        var22 = 103;
                    }
                    for (int var23 = var21; var23 <= var22; var23++) {
                        int var24 = arg4[var23][var19] & 0xFF;
                        int var25 = arg10[var23][var19] & 0xFF;
                        boolean var26 = false;
                        if (var24 == 0) {
                            if (var25 == 0) {
                                continue;
                            }
                            class273 var31 = class189.method1328(var25 - 1, 4);
                            if (var31.field4095 == -1) {
                                continue;
                            }
                            if (arg6[var23][var19] != 0) {
                                int[] var32 = class119.field1604[arg6[var23][var19]];
                                var14.field3297 += ((var32.length >> 1) - 2) * 3;
                                var14.field3294 += var32.length >> 1;
                                continue;
                            }
                        } else if (var25 != 0) {
                            class273 var27 = class189.method1328(var25 - 1, 4);
                            if (var27.field4095 == -1) {
                                byte var28 = arg6[var23][var19];
                                if (var28 != 0) {
                                    int[] var29 = class342.field5126[var28];
                                    var14.field3297 += ((var29.length >> 1) - 2) * 3;
                                    var14.field3294 += var29.length >> 1;
                                }
                                continue;
                            }
                            byte var30 = arg6[var23][var19];
                            if (var30 != 0) {
                                var26 = true;
                            }
                        }
                        class280 var33 = class52.method360(arg11, var23, var19);
                        if (var33 != null) {
                            int var34 = (int) (var33.field4203 >> 14) & 0x3F;
                            if (var34 == 9) {
                                int[] var35 = null;
                                int var36 = (int) (var33.field4203 >> 20) & 0x3;
                                if ((var36 & 0x1) == 0) {
                                    boolean var37 = (var23 + 1) <= var22;
                                    boolean var38 = var21 <= var23 - 1;
                                    if (!var38 && var18 >= (var19 + 1)) {
                                        short var39 = var13.field4017[var16 + 1];
                                        int var40 = (var39 >> 8) + var15;
                                        int var41 = var40 + (var39 & 0xFF);
                                        var38 = var40 < var23 && var23 < var41;
                                    }
                                    if (!var37 && var17 <= (var19 - 1)) {
                                        short var42 = var13.field4017[var16 - 1];
                                        int var43 = var15 + (var42 >> 8);
                                        int var44 = (var42 & 0xFF) + var43;
                                        var37 = var43 < var23 && var44 > var23;
                                    }
                                    if (var38 && var37) {
                                        var35 = class119.field1604[0];
                                    } else if (var38) {
                                        var35 = class119.field1604[1];
                                    } else if (var37) {
                                        var35 = class119.field1604[1];
                                    }
                                } else {
                                    boolean var45 = var23 + 1 <= var22;
                                    boolean var46 = (var23 - 1) >= var21;
                                    if (!var46 && var19 - 1 >= var17) {
                                        short var47 = var13.field4017[var16 - 1];
                                        int var48 = var15 + (var47 >> 8);
                                        int var49 = (var47 & 0xFF) + var48;
                                        var46 = var48 < var23 && var49 > var23;
                                    }
                                    if (!var45 && var19 + 1 <= var18) {
                                        short var50 = var13.field4017[var16 + 1];
                                        int var51 = (var50 >> 8) + var15;
                                        int var52 = (var50 & 0xFF) + var51;
                                        var45 = var23 > var51 && var23 < var52;
                                    }
                                    if (var46 && var45) {
                                        var35 = class119.field1604[0];
                                    } else if (var46) {
                                        var35 = class119.field1604[1];
                                    } else if (var45) {
                                        var35 = class119.field1604[1];
                                    }
                                }
                                if (var35 != null) {
                                    var14.field3297 += ((var35.length >> 1) - 2) * 3;
                                    var14.field3294 += var35.length >> 1;
                                }
                                continue;
                            }
                        }
                        if (var26) {
                            int[] var53 = class342.field5126[arg6[var23][var19]];
                            int[] var54 = class119.field1604[arg6[var23][var19]];
                            var14.field3297 += (var54.length >> 1) * 3 - 6;
                            var14.field3297 += ((var53.length >> 1) - 2) * 3;
                            var14.field3294 += var54.length >> 1;
                            var14.field3294 += var53.length >> 1;
                        } else {
                            int[] var55 = class119.field1604[0];
                            var14.field3297 += ((var55.length >> 1) - 2) * 3;
                            var14.field3294 += var55.length >> 1;
                        }
                    }
                    var16++;
                }
                int var56 = 0;
                var14.method1606();
                if (((var13.field4008 >> 7) - var13.field4026) < 0) {
                    var56 -= (var13.field4008 >> 7) - var13.field4026;
                }
                for (int var57 = var17; var57 <= var18; var57++) {
                    short var58 = var13.field4017[var56];
                    int var59 = (var58 >> 8) + var15;
                    int var60 = (var58 & 0xFF) + var59 - 1;
                    if (var59 < 0) {
                        var59 = 0;
                    }
                    if (var60 > 103) {
                        var60 = 103;
                    }
                    for (int var61 = var59; var61 <= var60; var61++) {
                        byte var62 = arg0[var61][var57];
                        int var63 = arg4[var61][var57] & 0xFF;
                        int var64 = arg10[var61][var57] & 0xFF;
                        boolean var65 = false;
                        if (var63 == 0) {
                            if (var64 == 0) {
                                continue;
                            }
                            class273 var68 = class189.method1328(var64 - 1, 4);
                            if (var68.field4095 == -1) {
                                continue;
                            }
                            if (arg6[var61][var57] != 0) {
                                class310.method2129(var57, arg0[var61][var57], (byte) -22, arg9, var13, var14, var61, class119.field1604[arg6[var61][var57]], arg8, arg3, arg7);
                                continue;
                            }
                        } else if (var64 != 0) {
                            class273 var66 = class189.method1328(var64 - 1, arg2 + 5);
                            if (var66.field4095 == -1) {
                                class310.method2129(var57, arg0[var61][var57], (byte) 105, arg9, var13, var14, var61, class342.field5126[arg6[var61][var57]], arg8, arg3, arg7);
                                continue;
                            }
                            byte var67 = arg6[var61][var57];
                            if (var67 != 0) {
                                var65 = true;
                            }
                        }
                        class280 var69 = class52.method360(arg11, var61, var57);
                        if (var69 != null) {
                            int var70 = (int) (var69.field4203 >> 14) & 0x3F;
                            if (var70 == 9) {
                                int[] var71 = null;
                                int var72 = (int) (var69.field4203 >> 20) & 0x3;
                                if ((var72 & 0x1) == 0) {
                                    boolean var81 = (var61 - 1) >= var59;
                                    boolean var82 = (var61 + 1) <= var60;
                                    if (!var81 && var57 + 1 <= var18) {
                                        short var83 = var13.field4017[var56 + 1];
                                        int var84 = (var83 >> 8) + var15;
                                        int var85 = (var83 & 0xFF) + var84;
                                        var81 = var61 > var84 && var61 < var85;
                                    }
                                    if (!var82 && (var57 - 1) >= var17) {
                                        short var86 = var13.field4017[var56 - 1];
                                        int var87 = (var86 >> 8) + var15;
                                        int var88 = (var86 & 0xFF) + var87;
                                        var82 = var61 > var87 && var61 < var88;
                                    }
                                    if (var81 && var82) {
                                        var71 = class119.field1604[0];
                                    } else if (var81) {
                                        var71 = class119.field1604[1];
                                        var62 = 1;
                                    } else if (var82) {
                                        var62 = 3;
                                        var71 = class119.field1604[1];
                                    }
                                } else {
                                    boolean var73 = (var61 + 1) <= var60;
                                    boolean var74 = var59 <= var61 - 1;
                                    if (!var74 && var57 - 1 >= var17) {
                                        short var75 = var13.field4017[var56 - 1];
                                        int var76 = (var75 >> 8) + var15;
                                        int var77 = (var75 & 0xFF) + var76;
                                        var74 = var61 > var76 && var77 > var61;
                                    }
                                    if (!var73 && var57 + 1 <= var18) {
                                        short var78 = var13.field4017[var56 + 1];
                                        int var79 = var15 + (var78 >> 8);
                                        int var80 = (var78 & 0xFF) + var79;
                                        var73 = var61 > var79 && var61 < var80;
                                    }
                                    if (var74 && var73) {
                                        var71 = class119.field1604[0];
                                    } else if (var74) {
                                        var71 = class119.field1604[1];
                                        var62 = 0;
                                    } else if (var73) {
                                        var71 = class119.field1604[1];
                                        var62 = 2;
                                    }
                                }
                                if (var71 != null) {
                                    class310.method2129(var57, var62, (byte) -81, arg9, var13, var14, var61, var71, arg8, arg3, arg7);
                                }
                                continue;
                            }
                        }
                        if (var65) {
                            class310.method2129(var57, arg0[var61][var57], (byte) 117, arg9, var13, var14, var61, class342.field5126[arg6[var61][var57]], arg8, arg3, arg7);
                            class310.method2129(var57, arg0[var61][var57], (byte) -26, arg9, var13, var14, var61, class119.field1604[arg6[var61][var57]], arg8, arg3, arg7);
                        } else {
                            class310.method2129(var57, var62, (byte) 64, arg9, var13, var14, var61, class119.field1604[0], arg8, arg3, arg7);
                        }
                    }
                    var56++;
                }
                if (var14.field3286 > 0 && var14.field3284 > 0) {
                    var14.method1610();
                    var13.field4006 = var14;
                }
            }
        }
        if (arg2 != -1) {
            method762(47, true);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", line = 1813)
    public static final String method761(int arg0, String arg1, String arg2, String arg3) {
        field1409++;
        for (int var4 = arg1.indexOf(arg3); var4 != -1; var4 = arg1.indexOf(arg3, var4 + arg2.length())) {
            arg1 = arg1.substring(0, var4) + arg2 + arg1.substring(arg3.length() + var4);
        }
        if (arg0 != -6399) {
            method756(27);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(IZ)I", line = 1836)
    public static final int method762(int arg0, boolean arg1) {
        field1403++;
        if (arg0 <= 0) {
            if (!arg1) {
                field1413 = (String) null;
            }
            return arg0 < 0 ? -1 : 0;
        } else {
            return 1;
        }
    }
}
