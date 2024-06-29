import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public class class19 {

    @OriginalMember(owner = "client!bu", name = "c", descriptor = "[[I")
    public static int[][] field517 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!bu", name = "i", descriptor = "I")
    public static int field523 = -50;

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "I")
    public int field516;

    @OriginalMember(owner = "client!bu", name = "d", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!bu", name = "f", descriptor = "I")
    public int field520;

    @OriginalMember(owner = "client!bu", name = "g", descriptor = "I")
    public int field521;

    @OriginalMember(owner = "client!bu", name = "h", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!bu", name = "j", descriptor = "I")
    public static int field524;

    @OriginalMember(owner = "client!bu", name = "k", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client!bu", name = "e", descriptor = "Z")
    public boolean field519;

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(IZIIIIIIII)Z", line = 3)
    public static final boolean method330(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field515++;
        if (arg6 > 2000 || arg0 > 2000 || arg9 > 2000 || arg4 > 2000 || arg5 > 2000 || arg2 > 2000) {
            return false;
        } else if (arg6 >= -2000 && arg0 >= -2000 && arg9 >= -2000 && arg4 >= -2000 && arg5 >= -2000 && arg2 >= -2000) {
            if (class159.field1938 == 2) {
                int var10 = class353.field4718 * arg6 + arg4;
                if (var10 >= 0 && class501.field6999.length > var10 && ((arg8 << 8) - 15360) < class501.field6999[var10]) {
                    return false;
                }
                int var11 = class353.field4718 * arg0 + arg5;
                if (var11 >= 0 && class501.field6999.length > var11 && (arg3 << 8) - 15360 < class501.field6999[var11]) {
                    return false;
                }
                int var12 = arg2 + (class353.field4718 * arg9);
                if (var12 >= 0 && class501.field6999.length > var12 && ((arg7 << 8) - 15360) < class501.field6999[var12]) {
                    return false;
                }
            }
            int var13 = arg5 - arg4;
            int var14 = arg0 - arg6;
            int var15 = arg2 - arg4;
            int var16 = arg9 - arg6;
            int var17 = arg3 - arg8;
            int var18 = arg7 - arg8;
            if (arg0 > arg6 && arg9 < arg9) {
                arg6--;
                if (arg0 <= arg9) {
                    arg9++;
                } else {
                    arg0++;
                }
            } else if (arg9 > arg0) {
                if (arg9 < arg6) {
                    arg6++;
                } else {
                    arg9++;
                }
                arg0--;
            } else {
                arg9--;
                if (arg6 > arg0) {
                    arg6++;
                } else {
                    arg0++;
                }
            }
            int var19 = 0;
            if (arg0 != arg6) {
                var19 = (arg5 - arg4 << 12) / (arg0 - arg6);
            }
            int var20 = 0;
            if (arg0 != arg9) {
                var20 = (arg2 - arg5 << 12) / (arg9 - arg0);
            }
            int var21 = 0;
            if (arg6 != arg9) {
                var21 = (arg4 - arg2 << 12) / (arg6 - arg9);
            }
            int var22 = var13 * var16 - (var14 * var15);
            if (var22 == 0) {
                return false;
            }
            int var23 = (var16 * var17 - var14 * var18 << 8) / var22;
            int var24 = (var13 * var18 - var15 * var17 << 8) / var22;
            if (arg1) {
                field517 = null;
            }
            if (arg0 >= arg6 && arg6 <= arg9) {
                if (arg6 >= class432.field6204) {
                    return true;
                }
                if (arg0 > class432.field6204) {
                    arg0 = class432.field6204;
                }
                if (arg9 > class432.field6204) {
                    arg9 = class432.field6204;
                }
                int var25 = (arg8 << 8) + var23 - (arg4 * var23);
                if (arg0 < arg9) {
                    int var26;
                    int var27 = var26 = arg4 << 12;
                    if (arg6 < 0) {
                        var25 -= arg6 * var24;
                        var26 -= arg6 * var19;
                        var27 -= arg6 * var21;
                        arg6 = 0;
                    }
                    int var28 = arg5 << 12;
                    if (arg0 < 0) {
                        var28 -= arg0 * var20;
                        arg0 = 0;
                    }
                    if (arg0 != arg6 && var19 > var21 || arg0 == arg6 && var21 > var20) {
                        int var29 = arg9 - arg0;
                        int var30 = arg0 - arg6;
                        int var31 = class353.field4718 * arg6;
                        while (true) {
                            var30--;
                            if (var30 < 0) {
                                while (true) {
                                    var29--;
                                    if (var29 < 0) {
                                        return true;
                                    }
                                    if (!class499.method2904((var28 >> 12) + 1, var25, (var27 >> 12) - 1, var23, 6408, class501.field6999, 0, var31)) {
                                        return false;
                                    }
                                    var31 += class353.field4718;
                                    var27 += var21;
                                    var28 += var20;
                                    var25 += var24;
                                }
                            }
                            if (!class499.method2904((var26 >> 12) + 1, var25, (var27 >> 12) - 1, var23, 6408, class501.field6999, 0, var31)) {
                                return false;
                            }
                            var25 += var24;
                            var26 += var19;
                            var31 += class353.field4718;
                            var27 += var21;
                        }
                    } else {
                        int var32 = arg9 - arg0;
                        int var33 = arg0 - arg6;
                        int var34 = class353.field4718 * arg6;
                        while (true) {
                            var33--;
                            if (var33 < 0) {
                                while (true) {
                                    var32--;
                                    if (var32 < 0) {
                                        return true;
                                    }
                                    if (!class499.method2904((var27 >> 12) + 1, var25, (var28 >> 12) - 1, var23, 6408, class501.field6999, 0, var34)) {
                                        return false;
                                    }
                                    var34 += class353.field4718;
                                    var27 += var21;
                                    var28 += var20;
                                    var25 += var24;
                                }
                            }
                            if (!class499.method2904((var27 >> 12) + 1, var25, (var26 >> 12) - 1, var23, 6408, class501.field6999, 0, var34)) {
                                return false;
                            }
                            var25 += var24;
                            var26 += var19;
                            var34 += class353.field4718;
                            var27 += var21;
                        }
                    }
                } else {
                    int var35;
                    int var36 = var35 = arg4 << 12;
                    int var37 = arg2 << 12;
                    if (arg6 < 0) {
                        var36 -= arg6 * var21;
                        var25 -= arg6 * var24;
                        var35 -= arg6 * var19;
                        arg6 = 0;
                    }
                    if (arg9 < 0) {
                        var37 -= arg9 * var20;
                        arg9 = 0;
                    }
                    if ((arg6 == arg9 || var21 >= var19) && (arg6 != arg9 || var19 >= var20)) {
                        int var41 = arg0 - arg9;
                        int var42 = arg9 - arg6;
                        int var43 = class353.field4718 * arg6;
                        while (true) {
                            var42--;
                            if (var42 < 0) {
                                while (true) {
                                    var41--;
                                    if (var41 < 0) {
                                        return true;
                                    }
                                    if (!class499.method2904((var37 >> 12) + 1, var25, (var35 >> 12) - 1, var23, 6408, class501.field6999, 0, var43)) {
                                        return false;
                                    }
                                    var25 += var24;
                                    var43 += class353.field4718;
                                    var35 += var19;
                                    var37 += var20;
                                }
                            }
                            if (!class499.method2904((var36 >> 12) + 1, var25, (var35 >> 12) - 1, var23, 6408, class501.field6999, 0, var43)) {
                                return false;
                            }
                            var36 += var21;
                            var43 += class353.field4718;
                            var35 += var19;
                            var25 += var24;
                        }
                    } else {
                        int var38 = arg0 - arg9;
                        int var39 = arg9 - arg6;
                        int var40 = class353.field4718 * arg6;
                        while (true) {
                            var39--;
                            if (var39 < 0) {
                                while (true) {
                                    var38--;
                                    if (var38 < 0) {
                                        return true;
                                    }
                                    if (!class499.method2904((var35 >> 12) + 1, var25, (var37 >> 12) - 1, var23, 6408, class501.field6999, 0, var40)) {
                                        return false;
                                    }
                                    var40 += class353.field4718;
                                    var35 += var19;
                                    var25 += var24;
                                    var37 += var20;
                                }
                            }
                            if (!class499.method2904((var35 >> 12) + 1, var25, (var36 >> 12) - 1, var23, 6408, class501.field6999, 0, var40)) {
                                return false;
                            }
                            var25 += var24;
                            var36 += var21;
                            var35 += var19;
                            var40 += class353.field4718;
                        }
                    }
                }
            } else if (arg0 > arg9) {
                if (class432.field6204 <= arg9) {
                    return true;
                }
                int var44 = (arg7 << 8) + var23 - arg2 * var23;
                if (class432.field6204 < arg0) {
                    arg0 = class432.field6204;
                }
                if (class432.field6204 < arg6) {
                    arg6 = class432.field6204;
                }
                if (arg0 <= arg6) {
                    int var45;
                    int var46 = var45 = arg2 << 12;
                    int var47 = arg5 << 12;
                    if (arg9 < 0) {
                        var44 -= arg9 * var24;
                        var45 -= arg9 * var21;
                        var46 -= arg9 * var20;
                        arg9 = 0;
                    }
                    if (arg0 < 0) {
                        var47 -= arg0 * var19;
                        arg0 = 0;
                    }
                    if (var21 <= var20) {
                        int var48 = arg6 - arg0;
                        int var49 = arg0 - arg9;
                        int var50 = class353.field4718 * arg9;
                        while (true) {
                            var49--;
                            if (var49 < 0) {
                                while (true) {
                                    var48--;
                                    if (var48 < 0) {
                                        return true;
                                    }
                                    if (!class499.method2904((var47 >> 12) + 1, var44, (var45 >> 12) - 1, var23, 6408, class501.field6999, 0, var50)) {
                                        return false;
                                    }
                                    var50 += class353.field4718;
                                    var47 += var19;
                                    var45 += var21;
                                    var44 += var24;
                                }
                            }
                            if (!class499.method2904((var46 >> 12) + 1, var44, (var45 >> 12) - 1, var23, 6408, class501.field6999, 0, var50)) {
                                return false;
                            }
                            var45 += var21;
                            var50 += class353.field4718;
                            var44 += var24;
                            var46 += var20;
                        }
                    } else {
                        int var51 = arg6 - arg0;
                        int var52 = arg0 - arg9;
                        int var53 = class353.field4718 * arg9;
                        while (true) {
                            var52--;
                            if (var52 < 0) {
                                while (true) {
                                    var51--;
                                    if (var51 < 0) {
                                        return true;
                                    }
                                    if (!class499.method2904((var45 >> 12) + 1, var44, (var47 >> 12) - 1, var23, 6408, class501.field6999, 0, var53)) {
                                        return false;
                                    }
                                    var45 += var21;
                                    var53 += class353.field4718;
                                    var47 += var19;
                                    var44 += var24;
                                }
                            }
                            if (!class499.method2904((var45 >> 12) + 1, var44, (var46 >> 12) - 1, var23, 6408, class501.field6999, 0, var53)) {
                                return false;
                            }
                            var46 += var20;
                            var44 += var24;
                            var45 += var21;
                            var53 += class353.field4718;
                        }
                    }
                } else {
                    int var54;
                    int var55 = var54 = arg2 << 12;
                    int var56 = arg4 << 12;
                    if (arg9 < 0) {
                        var55 -= arg9 * var20;
                        var54 -= arg9 * var21;
                        var44 -= arg9 * var24;
                        arg9 = 0;
                    }
                    if (arg6 < 0) {
                        var56 -= arg6 * var19;
                        arg6 = 0;
                    }
                    if (var21 <= var20) {
                        int var57 = arg0 - arg6;
                        int var58 = arg6 - arg9;
                        int var59 = class353.field4718 * arg9;
                        while (true) {
                            var58--;
                            if (var58 < 0) {
                                while (true) {
                                    var57--;
                                    if (var57 < 0) {
                                        return true;
                                    }
                                    if (!class499.method2904((var55 >> 12) + 1, var44, (var56 >> 12) - 1, var23, 6408, class501.field6999, 0, var59)) {
                                        return false;
                                    }
                                    var44 += var24;
                                    var56 += var19;
                                    var59 += class353.field4718;
                                    var55 += var20;
                                }
                            }
                            if (!class499.method2904((var55 >> 12) + 1, var44, (var54 >> 12) - 1, var23, 6408, class501.field6999, 0, var59)) {
                                return false;
                            }
                            var59 += class353.field4718;
                            var55 += var20;
                            var54 += var21;
                            var44 += var24;
                        }
                    } else {
                        int var60 = arg0 - arg6;
                        int var61 = arg6 - arg9;
                        int var62 = class353.field4718 * arg9;
                        while (true) {
                            var61--;
                            if (var61 < 0) {
                                while (true) {
                                    var60--;
                                    if (var60 < 0) {
                                        return true;
                                    }
                                    if (!class499.method2904((var56 >> 12) + 1, var44, (var55 >> 12) - 1, var23, 6408, class501.field6999, 0, var62)) {
                                        return false;
                                    }
                                    var56 += var19;
                                    var55 += var20;
                                    var62 += class353.field4718;
                                    var44 += var24;
                                }
                            }
                            if (!class499.method2904((var54 >> 12) + 1, var44, (var55 >> 12) - 1, var23, 6408, class501.field6999, 0, var62)) {
                                return false;
                            }
                            var44 += var24;
                            var55 += var20;
                            var54 += var21;
                            var62 += class353.field4718;
                        }
                    }
                }
            } else if (class432.field6204 <= arg0) {
                return true;
            } else {
                int var63 = (arg3 << 8) + var23 - arg5 * var23;
                if (class432.field6204 < arg6) {
                    arg6 = class432.field6204;
                }
                if (arg9 > class432.field6204) {
                    arg9 = class432.field6204;
                }
                if (arg6 <= arg9) {
                    int var64;
                    int var65 = var64 = arg5 << 12;
                    if (arg0 < 0) {
                        var64 -= arg0 * var20;
                        var65 -= arg0 * var19;
                        var63 -= arg0 * var24;
                        arg0 = 0;
                    }
                    int var66 = arg4 << 12;
                    if (arg6 < 0) {
                        var66 -= arg6 * var21;
                        arg6 = 0;
                    }
                    if (var19 >= var20) {
                        int var67 = arg9 - arg6;
                        int var68 = arg6 - arg0;
                        int var69 = class353.field4718 * arg0;
                        while (true) {
                            var68--;
                            if (var68 < 0) {
                                while (true) {
                                    var67--;
                                    if (var67 < 0) {
                                        return true;
                                    }
                                    if (!class499.method2904((var66 >> 12) + 1, var63, (var64 >> 12) - 1, var23, 6408, class501.field6999, 0, var69)) {
                                        return false;
                                    }
                                    var63 += var24;
                                    var69 += class353.field4718;
                                    var64 += var20;
                                    var66 += var21;
                                }
                            }
                            if (!class499.method2904((var65 >> 12) + 1, var63, (var64 >> 12) - 1, var23, 6408, class501.field6999, 0, var69)) {
                                return false;
                            }
                            var64 += var20;
                            var69 += class353.field4718;
                            var65 += var19;
                            var63 += var24;
                        }
                    } else {
                        int var70 = arg9 - arg6;
                        int var71 = arg6 - arg0;
                        int var72 = class353.field4718 * arg0;
                        while (true) {
                            var71--;
                            if (var71 < 0) {
                                while (true) {
                                    var70--;
                                    if (var70 < 0) {
                                        return true;
                                    }
                                    if (!class499.method2904((var64 >> 12) + 1, var63, (var66 >> 12) - 1, var23, 6408, class501.field6999, 0, var72)) {
                                        return false;
                                    }
                                    var66 += var21;
                                    var64 += var20;
                                    var63 += var24;
                                    var72 += class353.field4718;
                                }
                            }
                            if (!class499.method2904((var64 >> 12) + 1, var63, (var65 >> 12) - 1, var23, 6408, class501.field6999, 0, var72)) {
                                return false;
                            }
                            var65 += var19;
                            var64 += var20;
                            var72 += class353.field4718;
                            var63 += var24;
                        }
                    }
                } else {
                    int var73;
                    int var74 = var73 = arg5 << 12;
                    int var75 = arg2 << 12;
                    if (arg0 < 0) {
                        var63 -= arg0 * var24;
                        var74 -= arg0 * var19;
                        var73 -= arg0 * var20;
                        arg0 = 0;
                    }
                    if (arg9 < 0) {
                        var75 -= arg9 * var21;
                        arg9 = 0;
                    }
                    if (arg0 != arg9 && var19 < var20 || arg0 == arg9 && var21 < var19) {
                        int var76 = arg6 - arg9;
                        int var77 = arg9 - arg0;
                        int var78 = class353.field4718 * arg0;
                        while (true) {
                            var77--;
                            if (var77 < 0) {
                                while (true) {
                                    var76--;
                                    if (var76 < 0) {
                                        return true;
                                    }
                                    if (!class499.method2904((var75 >> 12) + 1, var63, (var74 >> 12) - 1, var23, 6408, class501.field6999, 0, var78)) {
                                        return false;
                                    }
                                    var74 += var19;
                                    var78 += class353.field4718;
                                    var75 += var21;
                                    var63 += var24;
                                }
                            }
                            if (!class499.method2904((var73 >> 12) + 1, var63, (var74 >> 12) - 1, var23, 6408, class501.field6999, 0, var78)) {
                                return false;
                            }
                            var74 += var19;
                            var78 += class353.field4718;
                            var63 += var24;
                            var73 += var20;
                        }
                    } else {
                        int var79 = arg6 - arg9;
                        int var80 = arg9 - arg0;
                        int var81 = class353.field4718 * arg0;
                        while (true) {
                            var80--;
                            if (var80 < 0) {
                                while (true) {
                                    var79--;
                                    if (var79 < 0) {
                                        return true;
                                    }
                                    if (!class499.method2904((var74 >> 12) + 1, var63, (var75 >> 12) - 1, var23, 6408, class501.field6999, 0, var81)) {
                                        return false;
                                    }
                                    var63 += var24;
                                    var75 += var21;
                                    var74 += var19;
                                    var81 += class353.field4718;
                                }
                            }
                            if (!class499.method2904((var74 >> 12) + 1, var63, (var73 >> 12) - 1, var23, 6408, class501.field6999, 0, var81)) {
                                return false;
                            }
                            var73 += var20;
                            var74 += var19;
                            var81 += class353.field4718;
                            var63 += var24;
                        }
                    }
                }
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(B)V", line = 643)
    public static void method331(byte arg0) {
        field517 = null;
        if (arg0 < 91) {
            field517 = null;
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(ILdc;B)Z", line = 653)
    public static final boolean method332(int arg0, class5 arg1, byte arg2) {
        field525++;
        int var3 = arg1.method25(2, 255);
        if (var3 == 0) {
            if (arg1.method25(1, 255) != 0) {
                method332(arg0, arg1, (byte) -128);
            }
            int var4 = arg1.method25(6, 255);
            int var5 = arg1.method25(6, 255);
            boolean var6 = arg1.method25(1, 255) == 1;
            if (var6) {
                class700.field9908[class677.field9699++] = arg0;
            }
            if (class184.field2252[arg0] != null) {
                throw new RuntimeException("hr:lr");
            }
            class19 var7 = class195.field2364[arg0];
            class613 var8 = class184.field2252[arg0] = new class613();
            var8.field2664 = arg0;
            if (class69.field1062[arg0] != null) {
                var8.method3517(class69.field1062[arg0], (byte) -107);
            }
            var8.method1293((byte) -62, true, var7.field520);
            var8.field2628 = var7.field516;
            int var9 = var7.field521;
            int var10 = var9 >> 28;
            int var11 = var9 >> 14 & 0xFF;
            int var12 = var9 & 0xFF;
            int var13 = (var11 << 6) + var4 - class36.field689;
            var8.field8782 = var7.field519;
            int var14 = (var12 << 6) + var5 - class88.field1239;
            var8.field2679[0] = class468.field6541[arg0];
            var8.field532 = var8.field535 = (byte) var10;
            if (class626.method3602(var13, var14, (byte) -94)) {
                var8.field535++;
            }
            var8.method3515((byte) -59, var14, var13);
            var8.field8783 = false;
            class195.field2364[arg0] = null;
            return true;
        } else if (var3 == 1) {
            int var15 = arg1.method25(2, 255);
            int var16 = class195.field2364[arg0].field521;
            class195.field2364[arg0].field521 = ((var16 >> 28) + var15 & 0x3 << 28) + (var16 & 0xFFFFFFF);
            return false;
        } else if (var3 == 2) {
            int var17 = arg1.method25(5, 255);
            int var18 = var17 >> 3;
            int var19 = var17 & 0x7;
            int var20 = class195.field2364[arg0].field521;
            int var21 = (var20 >> 28) + var18 & 0x3;
            int var22 = (var20 & 0x3FC821) >> 14;
            int var23 = var20 & 0xFF;
            if (var19 == 0) {
                var23--;
                var22--;
            }
            if (var19 == 1) {
                var23--;
            }
            if (var19 == 2) {
                var22++;
                var23--;
            }
            if (var19 == 3) {
                var22--;
            }
            if (var19 == 4) {
                var22++;
            }
            if (var19 == 5) {
                var23++;
                var22--;
            }
            if (var19 == 6) {
                var23++;
            }
            if (var19 == 7) {
                var23++;
                var22++;
            }
            class195.field2364[arg0].field521 = (var21 << 28) + (var22 << 14) + var23;
            return false;
        } else {
            int var24 = arg1.method25(18, 255);
            int var25 = var24 >> 16;
            int var26 = var24 >> 8 & 0xFF;
            int var27 = var24 & 0xFF;
            int var28 = class195.field2364[arg0].field521;
            int var29 = (var28 >> 28) + var25 & 0x3;
            int var30 = (var28 >> 14) + var26 & 0xFF;
            int var31 = var28 + var27 & 0xFF;
            if (arg2 > -26) {
                field517 = null;
            }
            class195.field2364[arg0].field521 = (var29 << 28) + var31 + (var30 << 14);
            return false;
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(II)Z", line = 831)
    public static final boolean method333(int arg0, int arg1) {
        if (arg0 != -1002) {
            return false;
        }
        field518++;
        if (arg1 == 2 || arg1 == 5 || arg1 == 10 || arg1 == 13 || arg1 == 1001) {
            return true;
        } else {
            return arg1 == 44 || arg1 == 1011;
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(I)Z", line = 857)
    public static final boolean method334(int arg0) {
        field522++;
        if (arg0 != -31431) {
            method331((byte) 81);
        }
        return class602.method3469(arg0 ^ 0xFFFF9DA3, "jaclib") ? class602.method3469(6298, "hw3d") : false;
    }
}
