import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class221 {

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "Lrb;")
    public static class213 field3671 = null;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "Lqd;")
    public static class40 field3670 = class147.method1106("leuchten3:", (byte) -122);

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "[F")
    public static float[] field3676 = new float[4];

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "I")
    public static int field3672;

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "I")
    public static int field3673;

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "I")
    public static int field3674;

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "I")
    public static int field3675;

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "I")
    public static int field3677;

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "I")
    public static int field3678;

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "I")
    public static int field3679;

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "I")
    public static int field3680;

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "I")
    public static int field3681;

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "I")
    public static int field3682;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "([Lrg;II[[B[[B[[F[[B[[F[[F[[I[[BI)V", line = 7)
    public static final void method1545(class90[] arg0, int arg1, int arg2, byte[][] arg3, byte[][] arg4, float[][] arg5, byte[][] arg6, float[][] arg7, float[][] arg8, int[][] arg9, byte[][] arg10, int arg11) {
        if (arg11 != -1) {
            field3680 = -78;
        }
        field3673++;
        for (int var12 = 0; var12 < arg1; var12++) {
            class90 var13 = arg0[var12];
            if (var13.field1634 == arg2) {
                int var14 = 0;
                class124 var15 = new class124();
                int var16 = (var13.field1614 >> 7) - var13.field1628;
                int var17 = (var13.field1641 >> 7) - var13.field1628;
                if (var16 < 0) {
                    var14 -= var16;
                    var16 = 0;
                }
                int var18 = (var13.field1614 >> 7) + var13.field1628;
                if (var18 > 103) {
                    var18 = 103;
                }
                for (int var19 = var16; var19 <= var18; var19++) {
                    short var20 = var13.field1621[var14];
                    int var21 = (var20 >> 8) + var17;
                    int var22 = (var20 & 0xFF) + var21 - 1;
                    if (var22 > 103) {
                        var22 = 103;
                    }
                    if (var21 < 0) {
                        var21 = 0;
                    }
                    for (int var23 = var21; var23 <= var22; var23++) {
                        int var24 = arg3[var23][var19] & 0xFF;
                        int var25 = arg10[var23][var19] & 0xFF;
                        boolean var26 = false;
                        if (var24 == 0) {
                            if (var25 == 0) {
                                continue;
                            }
                            class50 var27 = class285.method1986(2402, var25 - 1);
                            if (var27.field973 == -1) {
                                continue;
                            }
                            if (arg4[var23][var19] != 0) {
                                int[] var28 = class244.field4037[arg4[var23][var19]];
                                var15.field2144 += ((var28.length >> 1) - 2) * 3;
                                var15.field2147 += var28.length >> 1;
                                continue;
                            }
                        } else if (var25 != 0) {
                            class50 var29 = class285.method1986(2402, var25 - 1);
                            if (var29.field973 == -1) {
                                byte var30 = arg4[var23][var19];
                                if (var30 != 0) {
                                    int[] var31 = class315.field5347[var30];
                                    var15.field2144 += ((var31.length >> 1) - 2) * 3;
                                    var15.field2147 += var31.length >> 1;
                                }
                                continue;
                            }
                            byte var32 = arg4[var23][var19];
                            if (var32 != 0) {
                                var26 = true;
                            }
                        }
                        class193 var33 = class172.method1268(arg2, var23, var19);
                        if (var33 != null) {
                            int var34 = (int) (var33.field3101 >> 14) & 0x3F;
                            if (var34 == 9) {
                                int var38 = (int) (var33.field3101 >> 20) & 0x3;
                                int[] var39 = null;
                                if ((var38 & 0x1) == 0) {
                                    boolean var40 = var21 <= (var23 - 1);
                                    if (!var40 && var18 >= var19 + 1) {
                                        short var41 = var13.field1621[var14 + 1];
                                        int var42 = (var41 >> 8) + var17;
                                        int var43 = (var41 & 0xFF) + var42;
                                        var40 = var42 < var23 && var43 > var23;
                                    }
                                    boolean var44 = var22 >= var23 + 1;
                                    if (!var44 && var16 <= var19 - 1) {
                                        short var45 = var13.field1621[var14 - 1];
                                        int var46 = var17 + (var45 >> 8);
                                        int var47 = var46 + (var45 & 0xFF);
                                        var44 = var46 < var23 && var47 > var23;
                                    }
                                    if (var40 && var44) {
                                        var39 = class244.field4037[0];
                                    } else if (var40) {
                                        var39 = class244.field4037[1];
                                    } else if (var44) {
                                        var39 = class244.field4037[1];
                                    }
                                } else {
                                    boolean var48 = var22 >= (var23 + 1);
                                    boolean var49 = var21 <= (var23 - 1);
                                    if (!var49 && var16 <= (var19 - 1)) {
                                        short var50 = var13.field1621[var14 - 1];
                                        int var51 = (var50 >> 8) + var17;
                                        int var52 = (var50 & 0xFF) + var51;
                                        var49 = var51 < var23 && var23 < var52;
                                    }
                                    if (!var48 && var19 + 1 <= var18) {
                                        short var53 = var13.field1621[var14 + 1];
                                        int var54 = (var53 >> 8) + var17;
                                        int var55 = (var53 & 0xFF) + var54;
                                        var48 = var54 < var23 && var23 < var55;
                                    }
                                    if (var49 && var48) {
                                        var39 = class244.field4037[0];
                                    } else if (var49) {
                                        var39 = class244.field4037[1];
                                    } else if (var48) {
                                        var39 = class244.field4037[1];
                                    }
                                }
                                if (var39 != null) {
                                    var15.field2144 += ((var39.length >> 1) - 2) * 3;
                                    var15.field2147 += var39.length >> 1;
                                }
                                continue;
                            }
                        }
                        if (var26) {
                            int[] var35 = class244.field4037[arg4[var23][var19]];
                            int[] var36 = class315.field5347[arg4[var23][var19]];
                            var15.field2144 += ((var35.length >> 1) - 2) * 3;
                            var15.field2144 += (var36.length >> 1) * 3 - 6;
                            var15.field2147 += var35.length >> 1;
                            var15.field2147 += var36.length >> 1;
                        } else {
                            int[] var37 = class244.field4037[0];
                            var15.field2144 += ((var37.length >> 1) - 2) * 3;
                            var15.field2147 += var37.length >> 1;
                        }
                    }
                    var14++;
                }
                var15.method933();
                int var56 = 0;
                if (((var13.field1614 >> 7) - var13.field1628) < 0) {
                    var56 -= (var13.field1614 >> 7) - var13.field1628;
                }
                for (int var57 = var16; var57 <= var18; var57++) {
                    short var58 = var13.field1621[var56];
                    int var59 = var17 + (var58 >> 8);
                    int var60 = (var58 & 0xFF) + var59 - 1;
                    if (var60 > 103) {
                        var60 = 103;
                    }
                    if (var59 < 0) {
                        var59 = 0;
                    }
                    for (int var61 = var59; var61 <= var60; var61++) {
                        byte var62 = arg6[var61][var57];
                        int var63 = arg3[var61][var57] & 0xFF;
                        boolean var64 = false;
                        int var65 = arg10[var61][var57] & 0xFF;
                        if (var63 == 0) {
                            if (var65 == 0) {
                                continue;
                            }
                            class50 var66 = class285.method1986(2402, var65 - 1);
                            if (var66.field973 == -1) {
                                continue;
                            }
                            if (arg4[var61][var57] != 0) {
                                class218.method1529(var13, arg5, arg9, arg8, var57, -4579, arg6[var61][var57], var15, arg7, class244.field4037[arg4[var61][var57]], var61);
                                continue;
                            }
                        } else if (var65 == 0) {
                            var62 = 0;
                        } else {
                            class50 var67 = class285.method1986(2402, var65 - 1);
                            if (var67.field973 == -1) {
                                class218.method1529(var13, arg5, arg9, arg8, var57, -4579, arg6[var61][var57], var15, arg7, class315.field5347[arg4[var61][var57]], var61);
                                continue;
                            }
                            byte var68 = arg4[var61][var57];
                            if (var68 != 0) {
                                var64 = true;
                            }
                        }
                        class193 var69 = class172.method1268(arg2, var61, var57);
                        if (var69 != null) {
                            int var70 = (int) (var69.field3101 >> 14) & 0x3F;
                            if (var70 == 9) {
                                int var71 = (int) (var69.field3101 >> 20) & 0x3;
                                int[] var72 = null;
                                if ((var71 & 0x1) == 0) {
                                    boolean var73 = var59 <= (var61 - 1);
                                    if (!var73 && var57 + 1 <= var18) {
                                        short var74 = var13.field1621[var56 + 1];
                                        int var75 = (var74 >> 8) + var17;
                                        int var76 = (var74 & 0xFF) + var75;
                                        var73 = var75 < var61 && var76 > var61;
                                    }
                                    boolean var77 = var60 >= (var61 + 1);
                                    if (!var77 && var16 <= (var57 - 1)) {
                                        short var78 = var13.field1621[var56 - 1];
                                        int var79 = (var78 >> 8) + var17;
                                        int var80 = (var78 & 0xFF) + var79;
                                        var77 = var79 < var61 && var61 < var80;
                                    }
                                    if (var73 && var77) {
                                        var72 = class244.field4037[0];
                                    } else if (var73) {
                                        var62 = 1;
                                        var72 = class244.field4037[1];
                                    } else if (var77) {
                                        var72 = class244.field4037[1];
                                        var62 = 3;
                                    }
                                } else {
                                    boolean var81 = var60 >= var61 + 1;
                                    boolean var82 = (var61 - 1) >= var59;
                                    if (!var82 && (var57 - 1) >= var16) {
                                        short var83 = var13.field1621[var56 - 1];
                                        int var84 = (var83 >> 8) + var17;
                                        int var85 = (var83 & 0xFF) + var84;
                                        var82 = var61 > var84 && var85 > var61;
                                    }
                                    if (!var81 && var18 >= var57 + 1) {
                                        short var86 = var13.field1621[var56 + 1];
                                        int var87 = (var86 >> 8) + var17;
                                        int var88 = (var86 & 0xFF) + var87;
                                        var81 = var61 > var87 && var88 > var61;
                                    }
                                    if (var82 && var81) {
                                        var72 = class244.field4037[0];
                                    } else if (var82) {
                                        var72 = class244.field4037[1];
                                        var62 = 0;
                                    } else if (var81) {
                                        var62 = 2;
                                        var72 = class244.field4037[1];
                                    }
                                }
                                if (var72 != null) {
                                    class218.method1529(var13, arg5, arg9, arg8, var57, -4579, var62, var15, arg7, var72, var61);
                                }
                                continue;
                            }
                        }
                        if (var64) {
                            class218.method1529(var13, arg5, arg9, arg8, var57, -4579, arg6[var61][var57], var15, arg7, class315.field5347[arg4[var61][var57]], var61);
                            class218.method1529(var13, arg5, arg9, arg8, var57, -4579, arg6[var61][var57], var15, arg7, class244.field4037[arg4[var61][var57]], var61);
                        } else {
                            class218.method1529(var13, arg5, arg9, arg8, var57, -4579, var62, var15, arg7, class244.field4037[0], var61);
                        }
                    }
                    var56++;
                }
                if (var15.field2141 > 0 && var15.field2146 > 0) {
                    var15.method936();
                    var13.field1639 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V", line = 536)
    public static final void method1546(int arg0) {
        Container var1;
        if (class271.field4503 != null) {
            var1 = class271.field4503;
        } else if (class106.field1867 == null) {
            var1 = class275.field4573.field1876;
        } else {
            var1 = class106.field1867;
        }
        field3681++;
        class59.field1139 = var1.getSize().width;
        class182.field2955 = var1.getSize().height;
        if (class106.field1867 == var1) {
            Insets var2 = class106.field1867.getInsets();
            class182.field2955 -= var2.top + var2.bottom;
            class59.field1139 -= var2.right + var2.left;
        }
        if (class304.method2073((byte) 79) < 2) {
            class112.field1945 = 765;
            class33.field663 = 0;
            class73.field1287 = 503;
            class110.field1921 = (class59.field1139 - 765) / 2;
        } else {
            class73.field1287 = class182.field2955;
            class112.field1945 = class59.field1139;
            class33.field663 = 0;
            class110.field1921 = 0;
        }
        if (class21.field350) {
            class21.method162(class112.field1945, class73.field1287);
        }
        class213.field3470.setSize(class112.field1945, class73.field1287);
        if (class106.field1867 == var1) {
            Insets var3 = class106.field1867.getInsets();
            class213.field3470.setLocation(class110.field1921 + var3.left, var3.top - -class33.field663);
        } else {
            class213.field3470.setLocation(class110.field1921, class33.field663);
        }
        if (class148.field2499 != -1) {
            class248.method1754(true, (byte) 87);
        }
        class146.method1103(arg0);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIIII)V", line = 595)
    public static final void method1547(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class131.method971(arg6, arg2 + 52914);
        field3672++;
        int var7 = 0;
        int var8 = arg6 - arg3;
        int var9 = arg6;
        if (var8 < 0) {
            var8 = 0;
        }
        int var10 = -arg6;
        int var11 = var8;
        int var12 = -var8;
        int[] var13 = class37.field694[arg5];
        int var14 = -1;
        int var15 = -1;
        int var16 = arg4 + var8;
        int var17 = arg4 - var8;
        class150.method1124(var17, arg4 - arg6, arg1, true, var13);
        class150.method1124(var16, var17, arg0, true, var13);
        if (arg2 != -29773) {
            method1548(true);
        }
        class150.method1124(arg4 + arg6, var16, arg1, true, var13);
        while (var7 < var9) {
            var15 += 2;
            var12 += var15;
            var14 += 2;
            if (var12 >= 0 && var11 >= 1) {
                class303.field5075[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            var10 += var14;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                if (var8 > var9) {
                    int[] var18 = class37.field694[arg5 + var9];
                    int[] var19 = class37.field694[arg5 - var9];
                    int var20 = class303.field5075[var9];
                    int var21 = arg4 - var7;
                    int var22 = arg4 + var7;
                    int var23 = arg4 - var20;
                    int var24 = arg4 + var20;
                    class150.method1124(var23, var21, arg1, true, var18);
                    class150.method1124(var24, var23, arg0, true, var18);
                    class150.method1124(var22, var24, arg1, true, var18);
                    class150.method1124(var23, var21, arg1, true, var19);
                    class150.method1124(var24, var23, arg0, true, var19);
                    class150.method1124(var22, var24, arg1, true, var19);
                } else {
                    int[] var25 = class37.field694[arg5 - var9];
                    int var26 = arg4 + var7;
                    int[] var27 = class37.field694[arg5 + var9];
                    int var28 = arg4 - var7;
                    class150.method1124(var26, var28, arg1, true, var27);
                    class150.method1124(var26, var28, arg1, true, var25);
                }
            }
            int[] var29 = class37.field694[arg5 + var7];
            int var30 = arg4 - var9;
            int var31 = arg4 + var9;
            int[] var32 = class37.field694[arg5 - var7];
            if (var8 > var7) {
                int var33 = var7 <= var11 ? var11 : class303.field5075[var7];
                int var34 = arg4 - var33;
                class150.method1124(var34, var30, arg1, true, var29);
                int var35 = arg4 + var33;
                class150.method1124(var35, var34, arg0, true, var29);
                class150.method1124(var31, var35, arg1, true, var29);
                class150.method1124(var34, var30, arg1, true, var32);
                class150.method1124(var35, var34, arg0, true, var32);
                class150.method1124(var31, var35, arg1, true, var32);
            } else {
                class150.method1124(var31, var30, arg1, true, var29);
                class150.method1124(var31, var30, arg1, true, var32);
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Z)V", line = 724)
    public static void method1548(boolean arg0) {
        field3670 = null;
        field3671 = null;
        if (arg0) {
            field3676 = null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IZ)Lni;", line = 740)
    public static final class23 method1549(int arg0, boolean arg1) {
        field3678++;
        if (arg0 == 0) {
            return new class15();
        } else if (arg0 == 1) {
            return new class96();
        } else if (arg0 == 2) {
            return new class195();
        } else if (arg0 == 3) {
            return new class286();
        } else if (arg0 == 4) {
            return new class264();
        } else if (arg0 == 5) {
            return new class128();
        } else if (arg0 == 6) {
            return new class6();
        } else if (arg0 == 7) {
            return new class106();
        } else if (arg0 == 8) {
            return new class120();
        } else if (arg0 == 9) {
            return new class148();
        } else if (arg0 == 10) {
            return new class204();
        } else if (arg0 == 11) {
            return new class306();
        } else if (arg0 == 12) {
            return new class22();
        } else if (arg0 == 13) {
            return new class160();
        } else if (arg0 == 14) {
            return new class54();
        } else if (arg0 == 15) {
            return new class275();
        } else if (arg0 == 16) {
            return new class57();
        } else if (arg0 == 17) {
            return new class263();
        } else if (arg0 == 18) {
            return new class162();
        } else if (arg0 == 19) {
            return new class101();
        } else if (arg0 == 20) {
            return new class192();
        } else if (arg0 == 21) {
            return new class39();
        } else if (arg0 == 22) {
            return new class227();
        } else if (arg0 == 23) {
            return new class59();
        } else if (arg0 == 24) {
            return new class279();
        } else if (arg0 == 25) {
            return new class228();
        } else if (arg0 == 26) {
            return new class73();
        } else if (arg0 == 27) {
            return new class68();
        } else if (arg0 == 28) {
            return new class285();
        } else if (arg0 == 29) {
            return new class222();
        } else if (arg0 == 30) {
            return new class172();
        } else if (arg0 == 31) {
            return new class8();
        } else if (arg0 == 32) {
            return new class293();
        } else if (arg0 == 33) {
            return new class288();
        } else if (arg0 == 34) {
            return new class251();
        } else if (arg0 == 35) {
            return new class150();
        } else if (arg0 == 36) {
            return new class268();
        } else if (arg0 == 37) {
            return new class244();
        } else if (arg0 == 38) {
            return new class10();
        } else if (arg0 == 39) {
            return new class5();
        } else if (arg1) {
            return (class23) null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)V", line = 1059)
    public static final void method1550(int arg0) {
        if (arg0 != 1) {
            field3676 = (float[]) null;
        }
        field3679++;
        class39.field705.method1349(true);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(BLbb;)V", line = 1083)
    public static final void method1551(byte arg0, class86 arg1) {
        if (arg0 != 10) {
            method1552(-91, 116, -32, (class86) null, -29, 62, -70);
        }
        field3675++;
        arg1.field1530 = false;
        if (arg1.field1514 != -1) {
            class300 var2 = class20.method128(116, arg1.field1514);
            if (var2 == null || var2.field5018 == null) {
                arg1.field1514 = -1;
            } else {
                arg1.field1481++;
                if (var2.field5018.length > arg1.field1487 && arg1.field1481 > var2.field5033[arg1.field1487]) {
                    arg1.field1487++;
                    arg1.field1481 = 1;
                    class185.method1338(var2, arg1.field1531, -31987, class255.field4233 == arg1, arg1.field1497, arg1.field1487);
                }
                if (arg1.field1487 >= var2.field5018.length) {
                    arg1.field1481 = 0;
                    arg1.field1487 = 0;
                    class185.method1338(var2, arg1.field1531, arg0 - 31997, class255.field4233 == arg1, arg1.field1497, arg1.field1487);
                }
            }
        }
        if (arg1.field1502 != -1 && class256.field4266 >= arg1.field1508) {
            int var3 = class185.method1339(-454810365, arg1.field1502).field4600;
            if (var3 == -1) {
                arg1.field1502 = -1;
            } else {
                class300 var4 = class20.method128(49, var3);
                if (var4 == null || var4.field5018 == null) {
                    arg1.field1502 = -1;
                } else {
                    if (arg1.field1526 < 0) {
                        arg1.field1526 = 0;
                        class185.method1338(var4, arg1.field1531, -31987, class255.field4233 == arg1, arg1.field1497, 0);
                    }
                    arg1.field1491++;
                    if (var4.field5018.length > arg1.field1526 && arg1.field1491 > var4.field5033[arg1.field1526]) {
                        arg1.field1491 = 1;
                        arg1.field1526++;
                        class185.method1338(var4, arg1.field1531, -31987, class255.field4233 == arg1, arg1.field1497, arg1.field1526);
                    }
                    if (arg1.field1526 >= var4.field5018.length) {
                        arg1.field1502 = -1;
                    }
                }
            }
        }
        if (arg1.field1519 != -1 && arg1.field1529 <= 1) {
            class300 var5 = class20.method128(123, arg1.field1519);
            if (var5.field5037 == 1 && arg1.field1490 > 0 && arg1.field1505 <= class256.field4266 && class256.field4266 > arg1.field1488) {
                arg1.field1529 = 1;
                return;
            }
        }
        if (arg1.field1519 != -1 && arg1.field1529 == 0) {
            class300 var6 = class20.method128(91, arg1.field1519);
            if (var6 == null || var6.field5018 == null) {
                arg1.field1519 = -1;
            } else {
                arg1.field1546++;
                if (var6.field5018.length > arg1.field1534 && arg1.field1546 > var6.field5033[arg1.field1534]) {
                    arg1.field1534++;
                    arg1.field1546 = 1;
                    class185.method1338(var6, arg1.field1531, -31987, class255.field4233 == arg1, arg1.field1497, arg1.field1534);
                }
                if (arg1.field1534 >= var6.field5018.length) {
                    arg1.field1525++;
                    arg1.field1534 -= var6.field5036;
                    if (var6.field5032 <= arg1.field1525) {
                        arg1.field1519 = -1;
                    } else if (arg1.field1534 >= 0 && arg1.field1534 < var6.field5018.length) {
                        class185.method1338(var6, arg1.field1531, -31987, class255.field4233 == arg1, arg1.field1497, arg1.field1534);
                    } else {
                        arg1.field1519 = -1;
                    }
                }
                arg1.field1530 = var6.field5019;
            }
        }
        if (arg1.field1529 > 0) {
            arg1.field1529--;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIILbb;III)V", line = 1225)
    public static final void method1552(int arg0, int arg1, int arg2, class86 arg3, int arg4, int arg5, int arg6) {
        if (arg4 == 0) {
            field3682++;
            class229.method1601(arg1, arg3.field1497, arg6, arg3.field1531, arg2, arg5, arg0, (byte) 82);
        }
    }

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(I)V", line = 1247)
    public static final void method1553(int arg0) {
        field3674++;
        for (int var1 = -1; var1 < class159.field2663; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class212.field3390[var1];
            }
            class258 var3 = class298.field4979[var2];
            if (var3 != null) {
                class189.method1363(var3.method666(24207), -75, var3);
            }
        }
        if (arg0 != 27719) {
            method1552(-40, -14, -119, (class86) null, 39, 99, -93);
        }
    }
}
