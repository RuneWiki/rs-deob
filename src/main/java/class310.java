import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class310 {

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "I")
    public int field5222;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public int field5214;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
    public int field5219;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
    public int field5223;

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "Lok;")
    public static class41 field5225 = class137.method956("Schlie-8en", 45);

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "Lok;")
    public static class41 field5221 = class137.method956("Titelbild geladen)3", 45);

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "Lok;")
    private static class41 field5228 = class137.method956("yellow:", 45);

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "Lok;")
    public static class41 field5217 = field5228;

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "[I")
    public static int[] field5229 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!lc", name = "q", descriptor = "Lok;")
    public static class41 field5230 = field5228;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
    public static int field5215;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    public static int field5216;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
    public static int field5218;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
    public static int field5220;

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "I")
    public static int field5227;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "[Lna;")
    public static class156[] field5224;

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "[Lqi;")
    public static class232[] field5226;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(JI)V", line = 6)
    public static final void method2146(long arg0, int arg1) {
        field5227++;
        class285.field4642.field1640 = 0;
        class285.field4642.method797(87, arg1 ^ 0x564D);
        class285.field4642.method800(arg0, (byte) -113);
        class32.field479 = 1;
        class167.field2656 = 0;
        class130.field1947 = 0;
        class32.field471 = arg1;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V", line = 26)
    public static void method2147(int arg0) {
        field5221 = null;
        field5229 = null;
        field5228 = null;
        field5230 = null;
        if (arg0 != 2) {
            method2149(-25, (float[][]) ((float[][]) null), (class297[]) null, (float[][]) ((float[][]) null), (byte[][]) ((byte[][]) null), (float[][]) ((float[][]) null), (byte[][]) ((byte[][]) null), (byte[][]) ((byte[][]) null), -17, (byte[][]) ((byte[][]) null), (int[][]) ((int[][]) null), -73);
        }
        field5217 = null;
        field5226 = null;
        field5225 = null;
        field5224 = null;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIIBII)V", line = 48)
    public static final void method2148(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        field5215++;
        int var8 = 0;
        int var9 = arg6;
        int var10 = 0;
        int var11 = arg4 - arg0;
        int var12 = arg4 * arg4;
        int var13 = arg6 - arg0;
        int var14 = var11 * var11;
        int var15 = arg6 * arg6;
        int var16 = var13 * var13;
        int var17 = var12 << 1;
        int var18 = var16 << 1;
        int var19 = var15 << 1;
        int var20 = arg6 << 1;
        int var21 = var13 << 1;
        int var22 = var14 << 1;
        int var23 = (1 - var20) * var12 + var19;
        int var24 = var15 - ((var20 - 1) * var17);
        int var25 = var16 - (var21 - 1) * var22;
        int var26 = (1 - var21) * var14 + var18;
        int var27 = var12 << 2;
        int var28 = var15 << 2;
        int var29 = var14 << 2;
        int var30 = var19 * 3;
        int var31 = var18 * 3;
        int var32 = (var20 - 3) * var17;
        int var33 = var28;
        int var34 = (var21 - 3) * var22;
        int var35 = var16 << 2;
        int var36 = (arg6 - 1) * var27;
        int var37 = var35;
        int var38 = (var13 - 1) * var29;
        int[] var39 = class239.field3829[arg2];
        class269.method1908(arg5 - 24, var39, arg1, arg7 - var11, -arg4 + arg7);
        class269.method1908(arg5 ^ 0x38, var39, arg3, arg7 + var11, -var11 + arg7);
        class269.method1908(19, var39, arg1, arg4 + arg7, arg7 + var11);
        if (arg5 != 43) {
            return;
        }
        while (var9 > 0) {
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var30;
                    var30 += var28;
                    var24 += var33;
                    var33 += var28;
                    var8++;
                }
            }
            if (var24 < 0) {
                var8++;
                var23 += var30;
                var24 += var33;
                var30 += var28;
                var33 += var28;
            }
            boolean var40 = var9 <= var13;
            var24 += -var32;
            if (var40) {
                if (var26 < 0) {
                    while (var26 < 0) {
                        var26 += var31;
                        var31 += var35;
                        var10++;
                        var25 += var37;
                        var37 += var35;
                    }
                }
                if (var25 < 0) {
                    var10++;
                    var25 += var37;
                    var26 += var31;
                    var31 += var35;
                    var37 += var35;
                }
                var25 += -var34;
                var26 += -var38;
                var38 -= var29;
                var34 -= var29;
            }
            var9--;
            var23 += -var36;
            int var41 = arg2 + var9;
            var32 -= var27;
            int var42 = arg2 - var9;
            int var43 = arg7 + var8;
            var36 -= var27;
            int var44 = arg7 - var8;
            if (var40) {
                int var45 = arg7 + var10;
                int var46 = arg7 - var10;
                class269.method1908(19, class239.field3829[var42], arg1, var46, var44);
                class269.method1908(19, class239.field3829[var42], arg3, var45, var46);
                class269.method1908(arg5 ^ 0x38, class239.field3829[var42], arg1, var43, var45);
                class269.method1908(arg5 - 24, class239.field3829[var41], arg1, var46, var44);
                class269.method1908(19, class239.field3829[var41], arg3, var45, var46);
                class269.method1908(arg5 - 24, class239.field3829[var41], arg1, var43, var45);
            } else {
                class269.method1908(arg5 - 24, class239.field3829[var42], arg1, var43, var44);
                class269.method1908(19, class239.field3829[var41], arg1, var43, var44);
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I[[F[Lwa;[[F[[B[[F[[B[[BI[[B[[II)V", line = 228)
    public static final void method2149(int arg0, float[][] arg1, class297[] arg2, float[][] arg3, byte[][] arg4, float[][] arg5, byte[][] arg6, byte[][] arg7, int arg8, byte[][] arg9, int[][] arg10, int arg11) {
        for (int var12 = 0; var12 < arg8; var12++) {
            class297 var13 = arg2[var12];
            if (var13.field4813 == arg0) {
                class243 var14 = new class243();
                int var15 = (var13.field4803 >> 7) - var13.field4816;
                int var16 = 0;
                int var17 = (var13.field4808 >> 7) - var13.field4816;
                int var18 = (var13.field4808 >> 7) + var13.field4816;
                if (var18 > 103) {
                    var18 = 103;
                }
                if (var17 < 0) {
                    var16 -= var17;
                    var17 = 0;
                }
                for (int var19 = var17; var19 <= var18; var19++) {
                    short var20 = var13.field4811[var16];
                    int var21 = (var20 >> 8) + var15;
                    int var22 = (var20 & 0xFF) + var21 - 1;
                    if (var22 > 103) {
                        var22 = 103;
                    }
                    if (var21 < 0) {
                        var21 = 0;
                    }
                    for (int var23 = var21; var23 <= var22; var23++) {
                        boolean var24 = false;
                        int var25 = arg9[var23][var19] & 0xFF;
                        int var26 = arg7[var23][var19] & 0xFF;
                        if (var25 == 0) {
                            if (var26 == 0) {
                                continue;
                            }
                            class117 var27 = class301.method2075(1000, var26 - 1);
                            if (var27.field1710 == -1) {
                                continue;
                            }
                            if (arg4[var23][var19] != 0) {
                                int[] var28 = class301.field4884[arg4[var23][var19]];
                                var14.field3889 += (var28.length >> 1) * 3 - 6;
                                var14.field3878 += var28.length >> 1;
                                continue;
                            }
                        } else if (var26 != 0) {
                            class117 var29 = class301.method2075(1000, var26 - 1);
                            if (var29.field1710 == -1) {
                                byte var30 = arg4[var23][var19];
                                if (var30 != 0) {
                                    int[] var31 = class70.field1062[var30];
                                    var14.field3889 += ((var31.length >> 1) - 2) * 3;
                                    var14.field3878 += var31.length >> 1;
                                }
                                continue;
                            }
                            byte var32 = arg4[var23][var19];
                            if (var32 != 0) {
                                var24 = true;
                            }
                        }
                        class232 var33 = class128.method897(arg0, var23, var19);
                        if (var33 != null) {
                            int var34 = (int) (var33.field3672 >> 14) & 0x3F;
                            if (var34 == 9) {
                                int var35 = (int) (var33.field3672 >> 20) & 0x3;
                                int[] var36 = null;
                                if ((var35 & 0x1) == 0) {
                                    boolean var45 = var23 + 1 <= var22;
                                    boolean var46 = var23 - 1 >= var21;
                                    if (!var46 && var18 >= var19 + 1) {
                                        short var47 = var13.field4811[var16 + 1];
                                        int var48 = (var47 >> 8) + var15;
                                        int var49 = (var47 & 0xFF) + var48;
                                        var46 = var23 > var48 && var49 > var23;
                                    }
                                    if (!var45 && (var19 - 1) >= var17) {
                                        short var50 = var13.field4811[var16 - 1];
                                        int var51 = (var50 >> 8) + var15;
                                        int var52 = var51 + (var50 & 0xFF);
                                        var45 = var23 > var51 && var23 < var52;
                                    }
                                    if (var46 && var45) {
                                        var36 = class301.field4884[0];
                                    } else if (var46) {
                                        var36 = class301.field4884[1];
                                    } else if (var45) {
                                        var36 = class301.field4884[1];
                                    }
                                } else {
                                    boolean var37 = var22 >= var23 + 1;
                                    boolean var38 = var23 - 1 >= var21;
                                    if (!var38 && (var19 - 1) >= var17) {
                                        short var39 = var13.field4811[var16 - 1];
                                        int var40 = (var39 >> 8) + var15;
                                        int var41 = (var39 & 0xFF) + var40;
                                        var38 = var40 < var23 && var41 > var23;
                                    }
                                    if (!var37 && var18 >= (var19 + 1)) {
                                        short var42 = var13.field4811[var16 + 1];
                                        int var43 = var15 + (var42 >> 8);
                                        int var44 = (var42 & 0xFF) + var43;
                                        var37 = var23 > var43 && var44 > var23;
                                    }
                                    if (var38 && var37) {
                                        var36 = class301.field4884[0];
                                    } else if (var38) {
                                        var36 = class301.field4884[1];
                                    } else if (var37) {
                                        var36 = class301.field4884[1];
                                    }
                                }
                                if (var36 != null) {
                                    var14.field3889 += ((var36.length >> 1) - 2) * 3;
                                    var14.field3878 += var36.length >> 1;
                                }
                                continue;
                            }
                        }
                        if (var24) {
                            int[] var53 = class301.field4884[arg4[var23][var19]];
                            int[] var54 = class70.field1062[arg4[var23][var19]];
                            var14.field3889 += (var53.length >> 1) * 3 - 6;
                            var14.field3889 += (var54.length >> 1) * 3 - 6;
                            var14.field3878 += var53.length >> 1;
                            var14.field3878 += var54.length >> 1;
                        } else {
                            int[] var55 = class301.field4884[0];
                            var14.field3889 += ((var55.length >> 1) - 2) * 3;
                            var14.field3878 += var55.length >> 1;
                        }
                    }
                    var16++;
                }
                var14.method1739();
                int var56 = 0;
                if (((var13.field4808 >> 7) - var13.field4816) < 0) {
                    var56 -= (var13.field4808 >> 7) - var13.field4816;
                }
                for (int var57 = var17; var57 <= var18; var57++) {
                    short var58 = var13.field4811[var56];
                    int var59 = (var58 >> 8) + var15;
                    int var60 = (var58 & 0xFF) + var59 - 1;
                    if (var59 < 0) {
                        var59 = 0;
                    }
                    if (var60 > 103) {
                        var60 = 103;
                    }
                    for (int var61 = var59; var61 <= var60; var61++) {
                        byte var62 = arg6[var61][var57];
                        int var63 = arg9[var61][var57] & 0xFF;
                        int var64 = arg7[var61][var57] & 0xFF;
                        boolean var65 = false;
                        if (var63 == 0) {
                            if (var64 == 0) {
                                continue;
                            }
                            class117 var68 = class301.method2075(1000, var64 - 1);
                            if (var68.field1710 == -1) {
                                continue;
                            }
                            if (arg4[var61][var57] != 0) {
                                class117.method832(var13, arg1, class301.field4884[arg4[var61][var57]], var14, arg6[var61][var57], arg5, false, arg3, arg10, var61, var57);
                                continue;
                            }
                        } else if (var64 == 0) {
                            var62 = 0;
                        } else {
                            class117 var66 = class301.method2075(1000, var64 - 1);
                            if (var66.field1710 == -1) {
                                class117.method832(var13, arg1, class70.field1062[arg4[var61][var57]], var14, arg6[var61][var57], arg5, false, arg3, arg10, var61, var57);
                                continue;
                            }
                            byte var67 = arg4[var61][var57];
                            if (var67 != 0) {
                                var65 = true;
                            }
                        }
                        class232 var69 = class128.method897(arg0, var61, var57);
                        if (var69 != null) {
                            int var70 = (int) (var69.field3672 >> 14) & 0x3F;
                            if (var70 == 9) {
                                int[] var71 = null;
                                int var72 = (int) (var69.field3672 >> 20) & 0x3;
                                if ((var72 & 0x1) == 0) {
                                    boolean var81 = var59 <= (var61 - 1);
                                    boolean var82 = var60 >= (var61 + 1);
                                    if (!var81 && (var57 + 1) <= var18) {
                                        short var83 = var13.field4811[var56 + 1];
                                        int var84 = var15 + (var83 >> 8);
                                        int var85 = (var83 & 0xFF) + var84;
                                        var81 = var61 > var84 && var85 > var61;
                                    }
                                    if (!var82 && (var57 - 1) >= var17) {
                                        short var86 = var13.field4811[var56 - 1];
                                        int var87 = var15 + (var86 >> 8);
                                        int var88 = (var86 & 0xFF) + var87;
                                        var82 = var87 < var61 && var61 < var88;
                                    }
                                    if (var81 && var82) {
                                        var71 = class301.field4884[0];
                                    } else if (var81) {
                                        var62 = 1;
                                        var71 = class301.field4884[1];
                                    } else if (var82) {
                                        var62 = 3;
                                        var71 = class301.field4884[1];
                                    }
                                } else {
                                    boolean var73 = var59 <= var61 - 1;
                                    if (!var73 && (var57 - 1) >= var17) {
                                        short var74 = var13.field4811[var56 - 1];
                                        int var75 = var15 + (var74 >> 8);
                                        int var76 = (var74 & 0xFF) + var75;
                                        var73 = var61 > var75 && var61 < var76;
                                    }
                                    boolean var77 = var60 >= (var61 + 1);
                                    if (!var77 && var57 + 1 <= var18) {
                                        short var78 = var13.field4811[var56 + 1];
                                        int var79 = (var78 >> 8) + var15;
                                        int var80 = (var78 & 0xFF) + var79;
                                        var77 = var61 > var79 && var61 < var80;
                                    }
                                    if (var73 && var77) {
                                        var71 = class301.field4884[0];
                                    } else if (var73) {
                                        var71 = class301.field4884[1];
                                        var62 = 0;
                                    } else if (var77) {
                                        var62 = 2;
                                        var71 = class301.field4884[1];
                                    }
                                }
                                if (var71 != null) {
                                    class117.method832(var13, arg1, var71, var14, var62, arg5, false, arg3, arg10, var61, var57);
                                }
                                continue;
                            }
                        }
                        if (var65) {
                            class117.method832(var13, arg1, class70.field1062[arg4[var61][var57]], var14, arg6[var61][var57], arg5, false, arg3, arg10, var61, var57);
                            class117.method832(var13, arg1, class301.field4884[arg4[var61][var57]], var14, arg6[var61][var57], arg5, false, arg3, arg10, var61, var57);
                        } else {
                            class117.method832(var13, arg1, class301.field4884[0], var14, var62, arg5, false, arg3, arg10, var61, var57);
                        }
                    }
                    var56++;
                }
                if (var14.field3888 > 0 && var14.field3884 > 0) {
                    var14.method1741();
                    var13.field4801 = var14;
                }
            }
        }
        if (arg11 >= -114) {
            field5217 = (class41) null;
        }
        field5220++;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IB)V", line = 770)
    public static final void method2150(int arg0, byte arg1) {
        if (arg1 != 92) {
            method2147(125);
        }
        field5216++;
        class32.field466.method138(arg0, arg1 ^ 0x5C);
        class28.field418.method138(arg0, 0);
        class144.field2197.method138(arg0, 0);
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V", line = 789)
    public class310() {
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(Llc;)V", line = 794)
    public class310(class310 arg0) {
        this.field5222 = arg0.field5222;
        this.field5214 = arg0.field5214;
        this.field5219 = arg0.field5219;
        this.field5223 = arg0.field5223;
    }
}
