import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class7 {

    @OriginalMember(owner = "client!il", name = "b", descriptor = "Ldg;")
    public static class376 field62 = new class376(28, -1);

    @OriginalMember(owner = "client!il", name = "e", descriptor = "I")
    public static int field65 = 0;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "client!il", name = "c", descriptor = "I")
    public static int field63;

    @OriginalMember(owner = "client!il", name = "d", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!il", name = "f", descriptor = "Lf;")
    public static class702 field66;

    @OriginalMember(owner = "client!il", name = "g", descriptor = "[Lvh;")
    public static class327[] field67;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIIZIIIII)Z", line = 4)
    public static final boolean method39(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field63++;
        if (arg1 > 2000 || arg0 > 2000 || arg7 > 2000 || arg8 > 2000 || arg2 > 2000 || arg9 > 2000) {
            return false;
        } else if (arg1 >= -2000 && arg0 >= -2000 && arg7 >= -2000 && arg8 >= -2000 && arg2 >= -2000 && arg9 >= -2000) {
            if (class498.field7067 == 2) {
                int var10 = arg8 + (class235.field3639 * arg1);
                if (var10 >= 0 && var10 < class704.field9914.length && (arg5 << 8) - 15360 < class704.field9914[var10]) {
                    return false;
                }
                int var11 = arg2 + (class235.field3639 * arg0);
                if (var11 >= 0 && var11 < class704.field9914.length && ((arg3 << 8) - 15360) < class704.field9914[var11]) {
                    return false;
                }
                int var12 = class235.field3639 * arg7 + arg9;
                if (var12 >= 0 && var12 < class704.field9914.length && class704.field9914[var12] > (arg6 << 8) - 15360) {
                    return false;
                }
            }
            int var13 = arg2 - arg8;
            int var14 = arg0 - arg1;
            int var15 = arg9 - arg8;
            int var16 = arg7 - arg1;
            int var17 = arg3 - arg5;
            int var18 = arg6 - arg5;
            if (arg0 > arg1 && arg7 > arg7) {
                if (arg7 >= arg0) {
                    arg7++;
                } else {
                    arg0++;
                }
                arg1--;
            } else if (arg7 <= arg0) {
                if (arg1 <= arg0) {
                    arg0++;
                } else {
                    arg1++;
                }
                arg7--;
            } else {
                if (arg7 < arg1) {
                    arg1++;
                } else {
                    arg7++;
                }
                arg0--;
            }
            int var19 = 0;
            if (arg0 != arg1) {
                var19 = (arg2 - arg8 << 12) / (arg0 - arg1);
            }
            int var20 = 0;
            if (arg0 != arg7) {
                var20 = (arg9 - arg2 << 12) / (arg7 - arg0);
            }
            int var21 = 0;
            if (!arg4) {
                field66 = null;
            }
            if (arg1 != arg7) {
                var21 = (arg8 - arg9 << 12) / (arg1 - arg7);
            }
            int var22 = var13 * var16 - (var14 * var15);
            if (var22 == 0) {
                return false;
            }
            int var23 = (var16 * var17 - (var14 * var18) << 8) / var22;
            int var24 = (var13 * var18 - var15 * var17 << 8) / var22;
            if (arg1 <= arg0 && arg7 >= arg1) {
                if (class405.field5935 <= arg1) {
                    return true;
                }
                if (arg0 > class405.field5935) {
                    arg0 = class405.field5935;
                }
                int var25 = (arg5 << 8) + var23 - (arg8 * var23);
                if (class405.field5935 < arg7) {
                    arg7 = class405.field5935;
                }
                if (arg0 < arg7) {
                    int var26;
                    int var27 = var26 = arg8 << 12;
                    int var28 = arg2 << 12;
                    if (arg1 < 0) {
                        var25 -= arg1 * var24;
                        var26 -= arg1 * var19;
                        var27 -= arg1 * var21;
                        arg1 = 0;
                    }
                    if (arg0 < 0) {
                        var28 -= arg0 * var20;
                        arg0 = 0;
                    }
                    if ((arg0 == arg1 || var21 >= var19) && (arg0 != arg1 || var21 <= var20)) {
                        int var32 = arg7 - arg0;
                        int var33 = arg0 - arg1;
                        int var34 = class235.field3639 * arg1;
                        while (true) {
                            var33--;
                            if (var33 < 0) {
                                while (true) {
                                    var32--;
                                    if (var32 < 0) {
                                        return true;
                                    }
                                    if (!class502.method2894(class704.field9914, var34, var25, (var27 >> 12) + 1, 0, (var28 >> 12) - 1, var23, 111)) {
                                        return false;
                                    }
                                    var34 += class235.field3639;
                                    var28 += var20;
                                    var25 += var24;
                                    var27 += var21;
                                }
                            }
                            if (!class502.method2894(class704.field9914, var34, var25, (var27 >> 12) + 1, 0, (var26 >> 12) - 1, var23, -112)) {
                                return false;
                            }
                            var34 += class235.field3639;
                            var27 += var21;
                            var26 += var19;
                            var25 += var24;
                        }
                    } else {
                        int var29 = arg7 - arg0;
                        int var30 = arg0 - arg1;
                        int var31 = class235.field3639 * arg1;
                        while (true) {
                            var30--;
                            if (var30 < 0) {
                                while (true) {
                                    var29--;
                                    if (var29 < 0) {
                                        return true;
                                    }
                                    if (!class502.method2894(class704.field9914, var31, var25, (var28 >> 12) + 1, 0, (var27 >> 12) - 1, var23, 122)) {
                                        return false;
                                    }
                                    var25 += var24;
                                    var31 += class235.field3639;
                                    var28 += var20;
                                    var27 += var21;
                                }
                            }
                            if (!class502.method2894(class704.field9914, var31, var25, (var26 >> 12) + 1, 0, (var27 >> 12) - 1, var23, 47)) {
                                return false;
                            }
                            var25 += var24;
                            var27 += var21;
                            var31 += class235.field3639;
                            var26 += var19;
                        }
                    }
                } else {
                    int var35;
                    int var36 = var35 = arg8 << 12;
                    if (arg1 < 0) {
                        var35 -= arg1 * var19;
                        var25 -= arg1 * var24;
                        var36 -= arg1 * var21;
                        arg1 = 0;
                    }
                    int var37 = arg9 << 12;
                    if (arg7 < 0) {
                        var37 -= arg7 * var20;
                        arg7 = 0;
                    }
                    if (arg1 != arg7 && var19 > var21 || arg1 == arg7 && var19 < var20) {
                        int var38 = arg0 - arg7;
                        int var39 = arg7 - arg1;
                        int var40 = class235.field3639 * arg1;
                        while (true) {
                            var39--;
                            if (var39 < 0) {
                                while (true) {
                                    var38--;
                                    if (var38 < 0) {
                                        return true;
                                    }
                                    if (!class502.method2894(class704.field9914, var40, var25, (var35 >> 12) + 1, 0, (var37 >> 12) - 1, var23, -76)) {
                                        return false;
                                    }
                                    var37 += var20;
                                    var25 += var24;
                                    var35 += var19;
                                    var40 += class235.field3639;
                                }
                            }
                            if (!class502.method2894(class704.field9914, var40, var25, (var35 >> 12) + 1, 0, (var36 >> 12) - 1, var23, -92)) {
                                return false;
                            }
                            var36 += var21;
                            var40 += class235.field3639;
                            var35 += var19;
                            var25 += var24;
                        }
                    } else {
                        int var41 = arg0 - arg7;
                        int var42 = arg7 - arg1;
                        int var43 = class235.field3639 * arg1;
                        while (true) {
                            var42--;
                            if (var42 < 0) {
                                while (true) {
                                    var41--;
                                    if (var41 < 0) {
                                        return true;
                                    }
                                    if (!class502.method2894(class704.field9914, var43, var25, (var37 >> 12) + 1, 0, (var35 >> 12) - 1, var23, -108)) {
                                        return false;
                                    }
                                    var25 += var24;
                                    var43 += class235.field3639;
                                    var35 += var19;
                                    var37 += var20;
                                }
                            }
                            if (!class502.method2894(class704.field9914, var43, var25, (var36 >> 12) + 1, 0, (var35 >> 12) - 1, var23, 61)) {
                                return false;
                            }
                            var25 += var24;
                            var36 += var21;
                            var35 += var19;
                            var43 += class235.field3639;
                        }
                    }
                }
            } else if (arg0 <= arg7) {
                if (class405.field5935 <= arg0) {
                    return true;
                }
                if (class405.field5935 < arg1) {
                    arg1 = class405.field5935;
                }
                if (class405.field5935 < arg7) {
                    arg7 = class405.field5935;
                }
                int var44 = (arg3 << 8) + var23 - (arg2 * var23);
                if (arg1 <= arg7) {
                    int var45;
                    int var46 = var45 = arg2 << 12;
                    int var47 = arg8 << 12;
                    if (arg0 < 0) {
                        var46 -= arg0 * var19;
                        var45 -= arg0 * var20;
                        var44 -= arg0 * var24;
                        arg0 = 0;
                    }
                    if (arg1 < 0) {
                        var47 -= arg1 * var21;
                        arg1 = 0;
                    }
                    if (var20 <= var19) {
                        int var48 = arg7 - arg1;
                        int var49 = arg1 - arg0;
                        int var50 = class235.field3639 * arg0;
                        while (true) {
                            var49--;
                            if (var49 < 0) {
                                while (true) {
                                    var48--;
                                    if (var48 < 0) {
                                        return true;
                                    }
                                    if (!class502.method2894(class704.field9914, var50, var44, (var47 >> 12) + 1, 0, (var45 >> 12) - 1, var23, -74)) {
                                        return false;
                                    }
                                    var50 += class235.field3639;
                                    var44 += var24;
                                    var47 += var21;
                                    var45 += var20;
                                }
                            }
                            if (!class502.method2894(class704.field9914, var50, var44, (var46 >> 12) + 1, 0, (var45 >> 12) - 1, var23, -96)) {
                                return false;
                            }
                            var50 += class235.field3639;
                            var44 += var24;
                            var46 += var19;
                            var45 += var20;
                        }
                    } else {
                        int var51 = arg7 - arg1;
                        int var52 = arg1 - arg0;
                        int var53 = class235.field3639 * arg0;
                        while (true) {
                            var52--;
                            if (var52 < 0) {
                                while (true) {
                                    var51--;
                                    if (var51 < 0) {
                                        return true;
                                    }
                                    if (!class502.method2894(class704.field9914, var53, var44, (var45 >> 12) + 1, 0, (var47 >> 12) - 1, var23, -90)) {
                                        return false;
                                    }
                                    var44 += var24;
                                    var47 += var21;
                                    var45 += var20;
                                    var53 += class235.field3639;
                                }
                            }
                            if (!class502.method2894(class704.field9914, var53, var44, (var45 >> 12) + 1, 0, (var46 >> 12) - 1, var23, -118)) {
                                return false;
                            }
                            var44 += var24;
                            var45 += var20;
                            var53 += class235.field3639;
                            var46 += var19;
                        }
                    }
                } else {
                    int var54;
                    int var55 = var54 = arg2 << 12;
                    int var56 = arg9 << 12;
                    if (arg0 < 0) {
                        var55 -= arg0 * var19;
                        var54 -= arg0 * var20;
                        var44 -= arg0 * var24;
                        arg0 = 0;
                    }
                    if (arg7 < 0) {
                        var56 -= arg7 * var21;
                        arg7 = 0;
                    }
                    if (arg0 != arg7 && var20 > var19 || arg0 == arg7 && var19 > var21) {
                        int var57 = arg1 - arg7;
                        int var58 = arg7 - arg0;
                        int var59 = class235.field3639 * arg0;
                        while (true) {
                            var58--;
                            if (var58 < 0) {
                                while (true) {
                                    var57--;
                                    if (var57 < 0) {
                                        return true;
                                    }
                                    if (!class502.method2894(class704.field9914, var59, var44, (var56 >> 12) + 1, 0, (var55 >> 12) - 1, var23, -91)) {
                                        return false;
                                    }
                                    var59 += class235.field3639;
                                    var55 += var19;
                                    var44 += var24;
                                    var56 += var21;
                                }
                            }
                            if (!class502.method2894(class704.field9914, var59, var44, (var54 >> 12) + 1, 0, (var55 >> 12) - 1, var23, 102)) {
                                return false;
                            }
                            var54 += var20;
                            var44 += var24;
                            var59 += class235.field3639;
                            var55 += var19;
                        }
                    } else {
                        int var60 = arg1 - arg7;
                        int var61 = arg7 - arg0;
                        int var62 = class235.field3639 * arg0;
                        while (true) {
                            var61--;
                            if (var61 < 0) {
                                while (true) {
                                    var60--;
                                    if (var60 < 0) {
                                        return true;
                                    }
                                    if (!class502.method2894(class704.field9914, var62, var44, (var55 >> 12) + 1, 0, (var56 >> 12) - 1, var23, -85)) {
                                        return false;
                                    }
                                    var62 += class235.field3639;
                                    var44 += var24;
                                    var56 += var21;
                                    var55 += var19;
                                }
                            }
                            if (!class502.method2894(class704.field9914, var62, var44, (var55 >> 12) + 1, 0, (var54 >> 12) - 1, var23, 27)) {
                                return false;
                            }
                            var54 += var20;
                            var62 += class235.field3639;
                            var44 += var24;
                            var55 += var19;
                        }
                    }
                }
            } else if (arg7 >= class405.field5935) {
                return true;
            } else {
                if (arg0 > class405.field5935) {
                    arg0 = class405.field5935;
                }
                int var63 = (arg6 << 8) + var23 - (arg9 * var23);
                if (arg1 > class405.field5935) {
                    arg1 = class405.field5935;
                }
                if (arg0 <= arg1) {
                    int var64;
                    int var65 = var64 = arg9 << 12;
                    if (arg7 < 0) {
                        var65 -= arg7 * var20;
                        var63 -= arg7 * var24;
                        var64 -= arg7 * var21;
                        arg7 = 0;
                    }
                    int var66 = arg2 << 12;
                    if (arg0 < 0) {
                        var66 -= arg0 * var19;
                        arg0 = 0;
                    }
                    if (var21 > var20) {
                        int var67 = arg1 - arg0;
                        int var68 = arg0 - arg7;
                        int var69 = class235.field3639 * arg7;
                        while (true) {
                            var68--;
                            if (var68 < 0) {
                                while (true) {
                                    var67--;
                                    if (var67 < 0) {
                                        return true;
                                    }
                                    if (!class502.method2894(class704.field9914, var69, var63, (var64 >> 12) + 1, 0, (var66 >> 12) - 1, var23, 65)) {
                                        return false;
                                    }
                                    var64 += var21;
                                    var69 += class235.field3639;
                                    var66 += var19;
                                    var63 += var24;
                                }
                            }
                            if (!class502.method2894(class704.field9914, var69, var63, (var64 >> 12) + 1, 0, (var65 >> 12) - 1, var23, 40)) {
                                return false;
                            }
                            var63 += var24;
                            var64 += var21;
                            var69 += class235.field3639;
                            var65 += var20;
                        }
                    } else {
                        int var70 = arg1 - arg0;
                        int var71 = arg0 - arg7;
                        int var72 = class235.field3639 * arg7;
                        while (true) {
                            var71--;
                            if (var71 < 0) {
                                while (true) {
                                    var70--;
                                    if (var70 < 0) {
                                        return true;
                                    }
                                    if (!class502.method2894(class704.field9914, var72, var63, (var66 >> 12) + 1, 0, (var64 >> 12) - 1, var23, -73)) {
                                        return false;
                                    }
                                    var64 += var21;
                                    var66 += var19;
                                    var72 += class235.field3639;
                                    var63 += var24;
                                }
                            }
                            if (!class502.method2894(class704.field9914, var72, var63, (var65 >> 12) + 1, 0, (var64 >> 12) - 1, var23, -115)) {
                                return false;
                            }
                            var72 += class235.field3639;
                            var63 += var24;
                            var65 += var20;
                            var64 += var21;
                        }
                    }
                } else {
                    int var73;
                    int var74 = var73 = arg9 << 12;
                    if (arg7 < 0) {
                        var73 -= arg7 * var21;
                        var63 -= arg7 * var24;
                        var74 -= arg7 * var20;
                        arg7 = 0;
                    }
                    int var75 = arg8 << 12;
                    if (arg1 < 0) {
                        var75 -= arg1 * var19;
                        arg1 = 0;
                    }
                    if (var21 <= var20) {
                        int var76 = arg0 - arg1;
                        int var77 = arg1 - arg7;
                        int var78 = class235.field3639 * arg7;
                        while (true) {
                            var77--;
                            if (var77 < 0) {
                                while (true) {
                                    var76--;
                                    if (var76 < 0) {
                                        return true;
                                    }
                                    if (!class502.method2894(class704.field9914, var78, var63, (var74 >> 12) + 1, 0, (var75 >> 12) - 1, var23, -87)) {
                                        return false;
                                    }
                                    var63 += var24;
                                    var78 += class235.field3639;
                                    var75 += var19;
                                    var74 += var20;
                                }
                            }
                            if (!class502.method2894(class704.field9914, var78, var63, (var74 >> 12) + 1, 0, (var73 >> 12) - 1, var23, 100)) {
                                return false;
                            }
                            var73 += var21;
                            var78 += class235.field3639;
                            var74 += var20;
                            var63 += var24;
                        }
                    } else {
                        int var79 = arg0 - arg1;
                        int var80 = arg1 - arg7;
                        int var81 = class235.field3639 * arg7;
                        while (true) {
                            var80--;
                            if (var80 < 0) {
                                while (true) {
                                    var79--;
                                    if (var79 < 0) {
                                        return true;
                                    }
                                    if (!class502.method2894(class704.field9914, var81, var63, (var75 >> 12) + 1, 0, (var74 >> 12) - 1, var23, -82)) {
                                        return false;
                                    }
                                    var75 += var19;
                                    var81 += class235.field3639;
                                    var74 += var20;
                                    var63 += var24;
                                }
                            }
                            if (!class502.method2894(class704.field9914, var81, var63, (var73 >> 12) + 1, 0, (var74 >> 12) - 1, var23, 112)) {
                                return false;
                            }
                            var63 += var24;
                            var74 += var20;
                            var81 += class235.field3639;
                            var73 += var21;
                        }
                    }
                }
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(B)V", line = 642)
    public static final void method40(byte arg0) {
        field64++;
        class203 var1 = null;
        try {
            class494 var2 = class368.field5267.method14(false, "3", arg0 - 9);
            while (var2.field7024 == 0) {
                class561.method3202(1L, (byte) -71);
            }
            if (var2.field7024 == 2) {
                throw new RuntimeException("Error opening file");
            }
            var1 = (class203) var2.field7019;
            byte[] var3 = new byte[(int) var1.method1351(arg0 - 50)];
            if (var3.length == 0) {
                class103.field1615 = "";
                class645.field9063 = "";
            } else {
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method1350(var3.length - var4, var4, (byte) -125, var3);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class695 var6 = new class695(var3);
                int var7 = var6.method3826(false);
                if (var7 > 120) {
                    throw new RuntimeException("Bad length");
                }
                var6.field9761 = var7 + 1;
                if (!var6.method3825((byte) -104)) {
                    throw new RuntimeException("Invalid CRC");
                }
                var6.field9761 = 1;
                int var8 = var6.method3826(false);
                if (var8 > 3) {
                    throw new RuntimeException("Invalid version " + var8);
                }
                class103.field1615 = var6.method3833((byte) -104);
                class645.field9063 = var6.method3833((byte) -111);
                if (var8 >= 1) {
                    class697.field9865 = var6.method3847((byte) 118);
                } else {
                    class697.field9865 = class40.field657;
                }
                if (var8 < 2) {
                    class328.field4855 = class254.field3901;
                } else {
                    class328.field4855 = var6.method3854((byte) -12);
                }
                if (var8 < 3) {
                    class187.field2702 = class493.field7018;
                } else if (var6.method3826(false) == 1) {
                    class187.field2702 = var6.method3833((byte) -58);
                } else {
                    class187.field2702 = null;
                }
            }
            if (arg0 != -22) {
                method40((byte) -28);
            }
        } catch (Exception var10) {
            class645.field9063 = "";
            class103.field1615 = "";
        }
        try {
            if (var1 != null) {
                var1.method1344((byte) 126);
            }
        } catch (Exception var9) {
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V", line = 743)
    public static void method41(int arg0) {
        field62 = null;
        if (arg0 == -1269184308) {
            field67 = null;
            field66 = null;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Lr;II)V", line = 769)
    public static final void method42(class166 arg0, int arg1, int arg2) {
        field61++;
        if (!class202.field2847) {
            class266.field4020 = 0;
            return;
        }
        if (class384.field5417) {
            class267.field4036 = class568.field7988.method426(false);
        }
        class109.field1669 = 0;
        class376.field5359 = 0;
        class56.field1093 = 0;
        int[] var3 = arg0.method145();
        class387.field5544 = (int) ((float) var3[3] / 3.0F);
        class411.field5997 = (int) ((float) var3[2] / 3.0F);
        if (arg1 != -6871) {
            field67 = null;
        }
        arg0.method208(class338.field4985);
        if ((int) ((float) class338.field4985[0] / 3.0F) != class235.field3639 || (int) ((float) class338.field4985[1] / 3.0F) != class405.field5935) {
            class405.field5935 = (int) ((float) class338.field4985[1] / 3.0F);
            class235.field3639 = (int) ((float) class338.field4985[0] / 3.0F);
            class585.field8201 = class235.field3639 >> 1;
            class486.field6918 = class405.field5935 >> 1;
            class704.field9914 = new int[class405.field5935 * class235.field3639];
        }
        class564.field7945 = arg0.method153();
        class266.field4020 = 0;
        for (int var4 = 0; var4 < class186.field2673; var4++) {
            class120.method916((byte) 60, class196.field2799[var4], arg0, arg2);
        }
        for (int var5 = 0; var5 < class9.field94; var5++) {
            class120.method916((byte) 98, class178.field2538[var5], arg0, arg2);
        }
        for (int var6 = 0; var6 < class586.field8205; var6++) {
            class120.method916((byte) 91, field67[var6], arg0, arg2);
        }
        class416.field6031 = 0;
        if (class266.field4020 > 0) {
            int var7 = class704.field9914.length;
            int var8 = var7 - var7 & 0x7;
            int var9 = 0;
            while (var8 > var9) {
                class704.field9914[var9++] = Integer.MAX_VALUE;
                class704.field9914[var9++] = Integer.MAX_VALUE;
                class704.field9914[var9++] = Integer.MAX_VALUE;
                class704.field9914[var9++] = Integer.MAX_VALUE;
                class704.field9914[var9++] = Integer.MAX_VALUE;
                class704.field9914[var9++] = Integer.MAX_VALUE;
                class704.field9914[var9++] = Integer.MAX_VALUE;
                class704.field9914[var9++] = Integer.MAX_VALUE;
            }
            while (var7 > var9) {
                class704.field9914[var9++] = Integer.MAX_VALUE;
            }
            class498.field7067 = 1;
            for (int var10 = 0; var10 < class266.field4020; var10++) {
                class327 var11 = class612.field8574[var10];
                method39(var11.field4838[1], var11.field4838[0], var11.field4845[1], var11.field4847[1], true, var11.field4847[0], var11.field4847[3], var11.field4838[3], var11.field4845[0], var11.field4845[3]);
                method39(var11.field4838[2], var11.field4838[1], var11.field4845[2], var11.field4847[2], true, var11.field4847[1], var11.field4847[3], var11.field4838[3], var11.field4845[1], var11.field4845[3]);
            }
            class498.field7067 = 2;
        }
        if (class384.field5417) {
            class598.field8454 = class568.field7988.method426(false) - class267.field4036;
        }
    }
}
