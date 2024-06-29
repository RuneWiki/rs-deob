import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class311 extends class292 {

    @OriginalMember(owner = "client!gg", name = "q", descriptor = "Z")
    public static boolean field4529 = false;

    @OriginalMember(owner = "client!gg", name = "p", descriptor = "I")
    public static int field4528 = 0;

    @OriginalMember(owner = "client!gg", name = "n", descriptor = "I")
    public static int field4526;

    @OriginalMember(owner = "client!gg", name = "r", descriptor = "I")
    public static int field4530;

    @OriginalMember(owner = "client!gg", name = "s", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!gg", name = "t", descriptor = "I")
    public static int field4532;

    @OriginalMember(owner = "client!gg", name = "v", descriptor = "I")
    public static int field4534;

    @OriginalMember(owner = "client!gg", name = "x", descriptor = "I")
    public static int field4536;

    @OriginalMember(owner = "client!gg", name = "u", descriptor = "Ldp;")
    public static class174 field4533;

    @OriginalMember(owner = "client!gg", name = "w", descriptor = "Ldp;")
    public static class174 field4535;

    @OriginalMember(owner = "client!gg", name = "o", descriptor = "[Lnc;")
    public static class126[] field4527;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "([[BILja;[[BIBIII[[BI[ZLml;Lsb;)V")
    public static final void method2117(byte[][] arg0, int arg1, class90 arg2, byte[][] arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, byte[][] arg9, int arg10, boolean[] arg11, class451 arg12, class361 arg13) {
        field4536++;
        if (arg12 != null && arg13 != null || arg13 != null && arg10 == 12 || arg12 != null && arg10 == 0) {
            boolean[] var14 = arg12 != null && arg12.field6551 ? class282.field4230[arg10] : class73.field1215[arg10];
            if (arg6 > 0) {
                if (arg8 > 0) {
                    int var15 = arg9[arg8 - 1][arg6 - 1] & 0xFF;
                    if (var15 > 0) {
                        class451 var16 = class206.method1555(var15 - 1, 4);
                        if (var16.field6548 != -1 && var16.field6551) {
                            byte var17 = arg3[arg8 - 1][arg6 - 1];
                            int var18 = arg0[arg8 - 1][arg6 - 1] * 2 + 4 & 0x7;
                            int var19 = class105.method938(var16, 11224, arg2);
                            if (class58.field915[var17][var18]) {
                                class270.field4065[0] = var16.field6548;
                                class439.field6385[0] = var19;
                                class35.field502[0] = arg2.method707() ? var16.field6561 : var16.field6538;
                                class205.field3008[0] = var16.field6541;
                                class90.field1433[0] = var16.field6542;
                                class198.field2881[0] = 256;
                            }
                        }
                    }
                }
                if ((arg7 - 1) > arg8) {
                    int var20 = arg9[arg8 + 1][arg6 - 1] & 0xFF;
                    if (var20 > 0) {
                        class451 var21 = class206.method1555(var20 - 1, 4);
                        if (var21.field6548 != -1 && var21.field6551) {
                            byte var22 = arg3[arg8 + 1][arg6 - 1];
                            int var23 = arg0[arg8 + 1][arg6 - 1] * 2 + 6 & 0x7;
                            int var24 = class105.method938(var21, 11224, arg2);
                            if (class58.field915[var22][var23]) {
                                class270.field4065[2] = var21.field6548;
                                class439.field6385[2] = var24;
                                class35.field502[2] = arg2.method707() ? var21.field6561 : var21.field6538;
                                class205.field3008[2] = var21.field6541;
                                class90.field1433[2] = var21.field6542;
                                class198.field2881[2] = 512;
                            }
                        }
                    }
                }
            }
            if ((arg4 - 1) > arg6) {
                if (arg8 > 0) {
                    int var25 = arg9[arg8 - 1][arg6 + 1] & 0xFF;
                    if (var25 > 0) {
                        class451 var26 = class206.method1555(var25 - 1, 4);
                        if (var26.field6548 != -1 && var26.field6551) {
                            byte var27 = arg3[arg8 - 1][arg6 + 1];
                            int var28 = arg0[arg8 - 1][arg6 + 1] * 2 + 2 & 0x7;
                            int var29 = class105.method938(var26, 11224, arg2);
                            if (class58.field915[var27][var28]) {
                                class270.field4065[6] = var26.field6548;
                                class439.field6385[6] = var29;
                                class35.field502[6] = arg2.method707() ? var26.field6561 : var26.field6538;
                                class205.field3008[6] = var26.field6541;
                                class90.field1433[6] = var26.field6542;
                                class198.field2881[6] = 64;
                            }
                        }
                    }
                }
                if (arg8 < (arg7 - 1)) {
                    int var30 = arg9[arg8 + 1][arg6 + 1] & 0xFF;
                    if (var30 > 0) {
                        class451 var31 = class206.method1555(var30 - 1, 4);
                        if (var31.field6548 != -1 && var31.field6551) {
                            byte var32 = arg3[arg8 + 1][arg6 + 1];
                            int var33 = arg0[arg8 + 1][arg6 + 1] * 2 & 0x7;
                            int var34 = class105.method938(var31, 11224, arg2);
                            if (class58.field915[var32][var33]) {
                                class270.field4065[4] = var31.field6548;
                                class439.field6385[4] = var34;
                                class35.field502[4] = arg2.method707() ? var31.field6561 : var31.field6538;
                                class205.field3008[4] = var31.field6541;
                                class90.field1433[4] = var31.field6542;
                                class198.field2881[4] = 128;
                            }
                        }
                    }
                }
            }
            if (arg6 > 0) {
                int var35 = arg9[arg8][arg6 - 1] & 0xFF;
                if (var35 > 0) {
                    class451 var36 = class206.method1555(var35 - 1, 4);
                    if (var36.field6548 != -1) {
                        byte var37 = arg3[arg8][arg6 - 1];
                        byte var38 = arg0[arg8][arg6 - 1];
                        if (var36.field6551) {
                            int var39 = 2;
                            int var40 = var38 * 2 + 4;
                            int var41 = class105.method938(var36, 11224, arg2);
                            for (int var42 = 0; var42 < 3; var42++) {
                                var39 &= 0x7;
                                var40 &= 0x7;
                                if (class58.field915[var37][var40] && class90.field1433[var39] <= var36.field6542) {
                                    class270.field4065[var39] = var36.field6548;
                                    class439.field6385[var39] = var41;
                                    class35.field502[var39] = arg2.method707() ? var36.field6561 : var36.field6538;
                                    class205.field3008[var39] = var36.field6541;
                                    if (class90.field1433[var39] == var36.field6542) {
                                        class198.field2881[var39] = class439.method2744(class198.field2881[var39], 32);
                                    } else {
                                        class198.field2881[var39] = 32;
                                    }
                                    class90.field1433[var39] = var36.field6542;
                                }
                                var40++;
                                var39--;
                            }
                            if (!var14[arg1 & 0x3]) {
                                arg11[0] = class282.field4230[var37][class35.method254(var38 + 2, 3)];
                            }
                        } else if (!var14[arg1 & 0x3]) {
                            arg11[0] = class73.field1215[var37][class35.method254(var38 + 2, 3)];
                        }
                    }
                }
            }
            if (arg6 < (arg4 - 1)) {
                int var43 = arg9[arg8][arg6 + 1] & 0xFF;
                if (var43 > 0) {
                    class451 var44 = class206.method1555(var43 - 1, 4);
                    if (var44.field6548 != -1) {
                        byte var45 = arg3[arg8][arg6 + 1];
                        byte var46 = arg0[arg8][arg6 + 1];
                        if (var44.field6551) {
                            int var47 = 4;
                            int var48 = var46 * 2 + 2;
                            int var49 = class105.method938(var44, 11224, arg2);
                            for (int var50 = 0; var50 < 3; var50++) {
                                var48 &= 0x7;
                                var47 &= 0x7;
                                if (class58.field915[var45][var48] && var44.field6542 >= class90.field1433[var47]) {
                                    class270.field4065[var47] = var44.field6548;
                                    class439.field6385[var47] = var49;
                                    class35.field502[var47] = arg2.method707() ? var44.field6561 : var44.field6538;
                                    class205.field3008[var47] = var44.field6541;
                                    if (class90.field1433[var47] == var44.field6542) {
                                        class198.field2881[var47] = class439.method2744(class198.field2881[var47], 16);
                                    } else {
                                        class198.field2881[var47] = 16;
                                    }
                                    class90.field1433[var47] = var44.field6542;
                                }
                                var47++;
                                var48--;
                            }
                            if (!var14[arg1 + 2 & 0x3]) {
                                arg11[2] = class282.field4230[var45][class35.method254(var46, 3)];
                            }
                        } else if (!var14[arg1 + 2 & 0x3]) {
                            arg11[2] = class73.field1215[var45][class35.method254(3, var46)];
                        }
                    }
                }
            }
            if (arg8 > 0) {
                int var51 = arg9[arg8 - 1][arg6] & 0xFF;
                if (var51 > 0) {
                    class451 var52 = class206.method1555(var51 - 1, 4);
                    if (var52.field6548 != -1) {
                        byte var53 = arg3[arg8 - 1][arg6];
                        byte var54 = arg0[arg8 - 1][arg6];
                        if (var52.field6551) {
                            int var55 = 6;
                            int var56 = var54 * 2 + 4;
                            int var57 = class105.method938(var52, 11224, arg2);
                            for (int var58 = 0; var58 < 3; var58++) {
                                var55 &= 0x7;
                                var56 &= 0x7;
                                if (class58.field915[var53][var56] && var52.field6542 >= class90.field1433[var55]) {
                                    class270.field4065[var55] = var52.field6548;
                                    class439.field6385[var55] = var57;
                                    class35.field502[var55] = arg2.method707() ? var52.field6561 : var52.field6538;
                                    class205.field3008[var55] = var52.field6541;
                                    if (class90.field1433[var55] == var52.field6542) {
                                        class198.field2881[var55] = class439.method2744(class198.field2881[var55], 8);
                                    } else {
                                        class198.field2881[var55] = 8;
                                    }
                                    class90.field1433[var55] = var52.field6542;
                                }
                                var55++;
                                var56--;
                            }
                            if (!var14[arg1 + 3 & 0x3]) {
                                arg11[3] = class282.field4230[var53][class35.method254(var54 + 1, 3)];
                            }
                        } else if (!var14[arg1 + 3 & 0x3]) {
                            arg11[3] = class73.field1215[var53][class35.method254(3, var54 + 1)];
                        }
                    }
                }
            }
            if ((arg7 - 1) > arg8) {
                int var59 = arg9[arg8 + 1][arg6] & 0xFF;
                if (var59 > 0) {
                    class451 var60 = class206.method1555(var59 - 1, 4);
                    if (var60.field6548 != -1) {
                        byte var61 = arg3[arg8 + 1][arg6];
                        byte var62 = arg0[arg8 + 1][arg6];
                        if (var60.field6551) {
                            int var63 = 4;
                            int var64 = var62 * 2 + 6;
                            int var65 = class105.method938(var60, 11224, arg2);
                            for (int var66 = 0; var66 < 3; var66++) {
                                var63 &= 0x7;
                                var64 &= 0x7;
                                if (class58.field915[var61][var64] && class90.field1433[var63] <= var60.field6542) {
                                    class270.field4065[var63] = var60.field6548;
                                    class439.field6385[var63] = var65;
                                    class35.field502[var63] = arg2.method707() ? var60.field6561 : var60.field6538;
                                    class205.field3008[var63] = var60.field6541;
                                    if (class90.field1433[var63] == var60.field6542) {
                                        class198.field2881[var63] = class439.method2744(class198.field2881[var63], 4);
                                    } else {
                                        class198.field2881[var63] = 4;
                                    }
                                    class90.field1433[var63] = var60.field6542;
                                }
                                var64++;
                                var63--;
                            }
                            if (!var14[arg1 + 1 & 0x3]) {
                                arg11[1] = class282.field4230[var61][class35.method254(var62 + 3, 3)];
                            }
                        } else if (!var14[arg1 + 1 & 0x3]) {
                            arg11[1] = class73.field1215[var61][class35.method254(var62 + 3, 3)];
                        }
                    }
                }
            }
        }
        if (arg12 != null) {
            int var67 = class105.method938(arg12, 11224, arg2);
            if (arg12.field6551) {
                for (int var68 = 0; var68 < 8; var68++) {
                    int var69 = var68 - arg1 * 2 & 0x7;
                    if (class58.field915[arg10][var68] && arg12.field6542 >= class90.field1433[var69]) {
                        class270.field4065[var69] = arg12.field6548;
                        class439.field6385[var69] = var67;
                        class35.field502[var69] = arg2.method707() ? arg12.field6561 : arg12.field6538;
                        class205.field3008[var69] = arg12.field6541;
                        if (class90.field1433[var69] == arg12.field6542) {
                            class198.field2881[var69] = class439.method2744(class198.field2881[var69], 2);
                        } else {
                            class198.field2881[var69] = 2;
                        }
                        class90.field1433[var69] = arg12.field6542;
                    }
                }
            }
        }
        if (arg5 <= 59) {
            field4529 = true;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lrn;Lmb;IIIBLja;II)V")
    public static final void method2118(class134 arg0, class258 arg1, int arg2, int arg3, int arg4, byte arg5, class90 arg6, int arg7, int arg8) {
        field4532++;
        if (arg5 != 102) {
            method2119(-71, 55);
        }
        class242 var9 = class1.method3(arg7, arg5 - 66);
        if (var9 == null || !var9.field3490 || !var9.method1768(21)) {
            return;
        }
        if (var9.field3488 != null) {
            int[] var10 = new int[var9.field3488.length];
            for (int var11 = 0; var11 < var10.length / 2; var11++) {
                int var13;
                if (class322.field4643 == 4) {
                    var13 = (int) class106.field1756 & 0x3FFF;
                } else {
                    var13 = (int) class106.field1756 + class1.field3 & 0x3FFF;
                }
                int var14 = class56.field897[var13];
                int var15 = class56.field898[var13];
                if (class322.field4643 != 4) {
                    var14 = var14 * 256 / (class248.field3593 + 256);
                    var15 = var15 * 256 / (class248.field3593 + 256);
                }
                var10[var11 * 2] = ((arg4 + (var9.field3488[var11 * 2] * 4)) * var15 + (var9.field3488[var11 * 2 + 1] * 4 + arg3) * var14 >> 15) + arg1.field3764 / 2 + arg8;
                var10[var11 * 2 + 1] = arg1.field3758 / 2 + arg2 - ((var9.field3488[var11 * 2 + 1] * 4 + arg3) * var15 + -((var9.field3488[var11 * 2] * 4 + arg4) * var14) >> 15);
            }
            class173.method1317(arg6, var10, var9.field3521, arg1.field3803, arg1.field3726);
            for (int var12 = 0; var12 < var10.length / 2 - 1; var12++) {
                arg6.method719(var10[var12 * 2], var10[var12 * 2 + 1], var10[(var12 + 1) * 2], var10[var12 * 2 + 1 + 2], var9.field3512, 1, arg0, arg8, arg2);
            }
            arg6.method719(var10[var10.length - 2], var10[var10.length - 1], var10[0], var10[1], var9.field3512, 1, arg0, arg8, arg2);
        }
        class421 var16 = null;
        if (var9.field3514 != -1) {
            var16 = var9.method1772((byte) -103, arg6, false);
            if (var16 != null) {
                class275.method1967(arg1, var16, arg4, arg2, arg8, arg3, arg0, 16383);
            }
        }
        if (var9.field3483 == null) {
            return;
        }
        int var17 = 0;
        if (var16 != null) {
            var17 = var16.method1467();
        }
        class220 var18 = class273.field4110;
        class186 var19 = class221.field3294;
        if (var9.field3519 == 1) {
            var18 = class107.field1763;
            var19 = class269.field4041;
        }
        if (var9.field3519 == 2) {
            var18 = class250.field3620;
            var19 = class150.field2295;
        }
        class113.method975(var17, arg3, arg2, arg4, var19, var9.field3525, var18, false, var9.field3483, arg0, arg8, arg1);
        return;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)Lga;")
    public static final class277 method2119(int arg0, int arg1) {
        field4534++;
        class277 var2 = (class277) class137.field2190.method103(arg0 + 21880, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class1.field7.method1355(arg1, -12607, 29);
        class277 var4 = new class277();
        if (var3 != null) {
            var4.method1979((byte) -55, arg1, new class37(var3));
        }
        class137.field2190.method113(var4, 0, (long) arg1);
        return arg0 == -21880 ? var4 : null;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IB)V")
    public static final void method2120(int arg0, byte arg1) {
        field4530++;
        if (arg1 > -121) {
            field4527 = null;
        }
        class188 var2 = (class188) class319.field4606.method1219((long) arg0, -127);
        if (var2 != null) {
            var2.method251(13);
        }
    }

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "(I)V")
    public static void method2121(int arg0) {
        int var1 = -11 / ((arg0 + 54) / 46);
        field4533 = null;
        field4535 = null;
        field4527 = null;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZI)V")
    public static final void method2122(boolean arg0, int arg1) {
        class63.field1011++;
        field4531++;
        class13.field216.method2781(false, 202);
        for (class120 var2 = (class120) class355.field5045.method1222(5656); var2 != null; var2 = (class120) class355.field5045.method1224((byte) -110)) {
            if (!var2.method252(-92)) {
                var2 = (class120) class355.field5045.method1222(5656);
                if (var2 == null) {
                    break;
                }
            }
            if (var2.field1875 == 0) {
                class254.method1839(true, arg0, -1, var2);
            }
        }
        if (arg1 <= 27) {
            field4535 = null;
        }
        if (class132.field2132 != null) {
            class107.method947(true, class132.field2132);
            class132.field2132 = null;
        }
    }
}
