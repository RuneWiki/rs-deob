import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public abstract class class460 extends class766 {

    @OriginalMember(owner = "client!ag", name = "o", descriptor = "Ljava/lang/String;")
    public static String field6275 = null;

    @OriginalMember(owner = "client!ag", name = "v", descriptor = "Lss;")
    public static class307 field6282 = new class307("", 15);

    @OriginalMember(owner = "client!ag", name = "y", descriptor = "I")
    public static int field6285 = 0;

    @OriginalMember(owner = "client!ag", name = "z", descriptor = "[Ljava/lang/String;")
    public static String[] field6286 = new String[100];

    @OriginalMember(owner = "client!ag", name = "n", descriptor = "I")
    public static int field6274;

    @OriginalMember(owner = "client!ag", name = "p", descriptor = "I")
    public static int field6276;

    @OriginalMember(owner = "client!ag", name = "q", descriptor = "I")
    public int field6277;

    @OriginalMember(owner = "client!ag", name = "r", descriptor = "I")
    public int field6278;

    @OriginalMember(owner = "client!ag", name = "s", descriptor = "I")
    public static int field6279;

    @OriginalMember(owner = "client!ag", name = "t", descriptor = "I")
    public static int field6280;

    @OriginalMember(owner = "client!ag", name = "u", descriptor = "I")
    public static int field6281;

    @OriginalMember(owner = "client!ag", name = "x", descriptor = "I")
    public static int field6284;

    @OriginalMember(owner = "client!ag", name = "w", descriptor = "[I")
    public int[] field6283;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IILjava/awt/Canvas;B)V")
    public abstract void method636(int arg0, int arg1, Canvas arg2, byte arg3);

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method2685(int arg0, String arg1) {
        field6281++;
        if (arg1 == null) {
            return -1;
        }
        if (arg0 != -1) {
            method2692((byte) 120);
        }
        for (int var2 = 0; var2 < class381.field5340; var2++) {
            if (arg1.equalsIgnoreCase(class586.field8428[var2])) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lr;III[Z)V")
    public static final void method2686(class115 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class678.field9594 == class454.field6207) {
            return;
        }
        int var5 = class495.field6799[arg1].method2478(true, arg3, arg2);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class419 var7 = class495.field6799[var6];
                if (var7 != null) {
                    var7.method823(arg0, arg2, var5 - var7.method2478(true, arg3, arg2), arg3, 0, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V")
    public static final void method2687(int arg0) {
        class233.field3384.method2830(128);
        int var1 = 24 / ((arg0 - 20) / 62);
        field6280++;
        class582.field8375 = 1;
        class542.field7503 = null;
        class348.field4945 = null;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIIIIILjava/awt/Graphics;)V")
    public abstract void method635(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, Graphics arg7);

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIZIIIIIII)Z")
    public static final boolean method2688(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field6279++;
        if (arg6 > 2000 || arg1 > 2000 || arg3 > 2000 || arg9 > 2000 || arg7 > 2000 || arg4 > 2000) {
            return false;
        } else if (arg6 >= -2000 && arg1 >= -2000 && arg3 >= -2000 && arg9 >= -2000 && arg7 >= -2000 && arg4 >= -2000) {
            if (class37.field443 == 2) {
                int var10 = class597.field8526 * arg6 + arg9;
                if (var10 >= 0 && var10 < class116.field1991.length && class116.field1991[var10] > (arg8 << 8) - 38400) {
                    return false;
                }
                int var11 = class597.field8526 * arg1 + arg7;
                if (var11 >= 0 && class116.field1991.length > var11 && class116.field1991[var11] > ((arg0 << 8) - 38400)) {
                    return false;
                }
                int var12 = arg4 + (class597.field8526 * arg3);
                if (var12 >= 0 && class116.field1991.length > var12 && class116.field1991[var12] > ((arg5 << 8) - 38400)) {
                    return false;
                }
            }
            if (!arg2) {
                method2685(113, null);
            }
            int var13 = arg7 - arg9;
            int var14 = arg1 - arg6;
            int var15 = arg4 - arg9;
            int var16 = arg3 - arg6;
            int var17 = arg0 - arg8;
            if (arg1 > arg6 && arg3 > arg3) {
                arg6--;
                if (arg3 < arg1) {
                    arg1++;
                } else {
                    arg3++;
                }
            } else if (arg3 > arg1) {
                if (arg6 > arg3) {
                    arg6++;
                } else {
                    arg3++;
                }
                arg1--;
            } else {
                if (arg6 <= arg1) {
                    arg1++;
                } else {
                    arg6++;
                }
                arg3--;
            }
            int var18 = arg5 - arg8;
            int var19 = 0;
            if (arg1 != arg6) {
                var19 = (arg7 - arg9 << 12) / (arg1 - arg6);
            }
            int var20 = 0;
            if (arg1 != arg3) {
                var20 = (arg4 - arg7 << 12) / (arg3 - arg1);
            }
            int var21 = 0;
            if (arg3 != arg6) {
                var21 = (arg9 - arg4 << 12) / (arg6 - arg3);
            }
            int var22 = var13 * var16 - (var14 * var15);
            if (var22 == 0) {
                return false;
            }
            int var23 = (var16 * var17 - (var14 * var18) << 8) / var22;
            int var24 = (var13 * var18 - (var15 * var17) << 8) / var22;
            if (arg1 >= arg6 && arg6 <= arg3) {
                if (arg6 >= class122.field2067) {
                    return true;
                }
                if (arg1 > class122.field2067) {
                    arg1 = class122.field2067;
                }
                if (arg3 > class122.field2067) {
                    arg3 = class122.field2067;
                }
                int var25 = (arg8 << 8) + var23 - (arg9 * var23);
                if (arg3 <= arg1) {
                    int var26;
                    int var27 = var26 = arg9 << 12;
                    if (arg6 < 0) {
                        var26 -= arg6 * var19;
                        var27 -= arg6 * var21;
                        var25 -= arg6 * var24;
                        arg6 = 0;
                    }
                    int var28 = arg4 << 12;
                    if (arg3 < 0) {
                        var28 -= arg3 * var20;
                        arg3 = 0;
                    }
                    if ((arg3 == arg6 || var19 <= var21) && (arg3 != arg6 || var20 <= var19)) {
                        int var32 = arg1 - arg3;
                        int var33 = arg3 - arg6;
                        int var34 = class597.field8526 * arg6;
                        while (true) {
                            var33--;
                            if (var33 < 0) {
                                while (true) {
                                    var32--;
                                    if (var32 < 0) {
                                        return true;
                                    }
                                    if (!class152.method1194(class116.field1991, (var26 >> 12) - 1, false, var25, 0, var34, var23, (var28 >> 12) + 1)) {
                                        return false;
                                    }
                                    var26 += var19;
                                    var25 += var24;
                                    var28 += var20;
                                    var34 += class597.field8526;
                                }
                            }
                            if (!class152.method1194(class116.field1991, (var26 >> 12) - 1, false, var25, 0, var34, var23, (var27 >> 12) + 1)) {
                                return false;
                            }
                            var26 += var19;
                            var27 += var21;
                            var34 += class597.field8526;
                            var25 += var24;
                        }
                    } else {
                        int var29 = arg1 - arg3;
                        int var30 = arg3 - arg6;
                        int var31 = class597.field8526 * arg6;
                        while (true) {
                            var30--;
                            if (var30 < 0) {
                                while (true) {
                                    var29--;
                                    if (var29 < 0) {
                                        return true;
                                    }
                                    if (!class152.method1194(class116.field1991, (var28 >> 12) - 1, false, var25, 0, var31, var23, (var26 >> 12) + 1)) {
                                        return false;
                                    }
                                    var28 += var20;
                                    var26 += var19;
                                    var31 += class597.field8526;
                                    var25 += var24;
                                }
                            }
                            if (!class152.method1194(class116.field1991, (var27 >> 12) - 1, !arg2, var25, 0, var31, var23, (var26 >> 12) + 1)) {
                                return false;
                            }
                            var25 += var24;
                            var26 += var19;
                            var27 += var21;
                            var31 += class597.field8526;
                        }
                    }
                } else {
                    int var35;
                    int var36 = var35 = arg9 << 12;
                    if (arg6 < 0) {
                        var35 -= arg6 * var19;
                        var25 -= arg6 * var24;
                        var36 -= arg6 * var21;
                        arg6 = 0;
                    }
                    int var37 = arg7 << 12;
                    if (arg1 < 0) {
                        var37 -= arg1 * var20;
                        arg1 = 0;
                    }
                    if ((arg1 == arg6 || var19 <= var21) && (arg1 != arg6 || var20 >= var21)) {
                        int var41 = arg3 - arg1;
                        int var42 = arg1 - arg6;
                        int var43 = class597.field8526 * arg6;
                        while (true) {
                            var42--;
                            if (var42 < 0) {
                                while (true) {
                                    var41--;
                                    if (var41 < 0) {
                                        return true;
                                    }
                                    if (!class152.method1194(class116.field1991, (var37 >> 12) - 1, false, var25, 0, var43, var23, (var36 >> 12) + 1)) {
                                        return false;
                                    }
                                    var25 += var24;
                                    var43 += class597.field8526;
                                    var36 += var21;
                                    var37 += var20;
                                }
                            }
                            if (!class152.method1194(class116.field1991, (var35 >> 12) - 1, !arg2, var25, 0, var43, var23, (var36 >> 12) + 1)) {
                                return false;
                            }
                            var43 += class597.field8526;
                            var35 += var19;
                            var25 += var24;
                            var36 += var21;
                        }
                    } else {
                        int var38 = arg3 - arg1;
                        int var39 = arg1 - arg6;
                        int var40 = class597.field8526 * arg6;
                        while (true) {
                            var39--;
                            if (var39 < 0) {
                                while (true) {
                                    var38--;
                                    if (var38 < 0) {
                                        return true;
                                    }
                                    if (!class152.method1194(class116.field1991, (var36 >> 12) - 1, false, var25, 0, var40, var23, (var37 >> 12) + 1)) {
                                        return false;
                                    }
                                    var36 += var21;
                                    var40 += class597.field8526;
                                    var37 += var20;
                                    var25 += var24;
                                }
                            }
                            if (!class152.method1194(class116.field1991, (var36 >> 12) - 1, !arg2, var25, 0, var40, var23, (var35 >> 12) + 1)) {
                                return false;
                            }
                            var25 += var24;
                            var40 += class597.field8526;
                            var35 += var19;
                            var36 += var21;
                        }
                    }
                }
            } else if (arg3 < arg1) {
                if (arg3 >= class122.field2067) {
                    return true;
                }
                int var44 = (arg5 << 8) + var23 - arg4 * var23;
                if (arg1 > class122.field2067) {
                    arg1 = class122.field2067;
                }
                if (class122.field2067 < arg6) {
                    arg6 = class122.field2067;
                }
                if (arg1 > arg6) {
                    int var45;
                    int var46 = var45 = arg4 << 12;
                    int var47 = arg9 << 12;
                    if (arg3 < 0) {
                        var46 -= arg3 * var20;
                        var45 -= arg3 * var21;
                        var44 -= arg3 * var24;
                        arg3 = 0;
                    }
                    if (arg6 < 0) {
                        var47 -= arg6 * var19;
                        arg6 = 0;
                    }
                    if (var20 < var21) {
                        int var48 = arg1 - arg6;
                        int var49 = arg6 - arg3;
                        int var50 = class597.field8526 * arg3;
                        while (true) {
                            var49--;
                            if (var49 < 0) {
                                while (true) {
                                    var48--;
                                    if (var48 < 0) {
                                        return true;
                                    }
                                    if (!class152.method1194(class116.field1991, (var46 >> 12) - 1, false, var44, 0, var50, var23, (var47 >> 12) + 1)) {
                                        return false;
                                    }
                                    var47 += var19;
                                    var46 += var20;
                                    var44 += var24;
                                    var50 += class597.field8526;
                                }
                            }
                            if (!class152.method1194(class116.field1991, (var46 >> 12) - 1, false, var44, 0, var50, var23, (var45 >> 12) + 1)) {
                                return false;
                            }
                            var50 += class597.field8526;
                            var44 += var24;
                            var46 += var20;
                            var45 += var21;
                        }
                    } else {
                        int var51 = arg1 - arg6;
                        int var52 = arg6 - arg3;
                        int var53 = class597.field8526 * arg3;
                        while (true) {
                            var52--;
                            if (var52 < 0) {
                                while (true) {
                                    var51--;
                                    if (var51 < 0) {
                                        return true;
                                    }
                                    if (!class152.method1194(class116.field1991, (var47 >> 12) - 1, false, var44, 0, var53, var23, (var46 >> 12) + 1)) {
                                        return false;
                                    }
                                    var53 += class597.field8526;
                                    var44 += var24;
                                    var47 += var19;
                                    var46 += var20;
                                }
                            }
                            if (!class152.method1194(class116.field1991, (var45 >> 12) - 1, false, var44, 0, var53, var23, (var46 >> 12) + 1)) {
                                return false;
                            }
                            var53 += class597.field8526;
                            var46 += var20;
                            var45 += var21;
                            var44 += var24;
                        }
                    }
                } else {
                    int var54;
                    int var55 = var54 = arg4 << 12;
                    int var56 = arg7 << 12;
                    if (arg3 < 0) {
                        var54 -= arg3 * var21;
                        var55 -= arg3 * var20;
                        var44 -= arg3 * var24;
                        arg3 = 0;
                    }
                    if (arg1 < 0) {
                        var56 -= arg1 * var19;
                        arg1 = 0;
                    }
                    if (var21 <= var20) {
                        int var57 = arg6 - arg1;
                        int var58 = arg1 - arg3;
                        int var59 = class597.field8526 * arg3;
                        while (true) {
                            var58--;
                            if (var58 < 0) {
                                while (true) {
                                    var57--;
                                    if (var57 < 0) {
                                        return true;
                                    }
                                    if (!class152.method1194(class116.field1991, (var54 >> 12) - 1, false, var44, 0, var59, var23, (var56 >> 12) + 1)) {
                                        return false;
                                    }
                                    var59 += class597.field8526;
                                    var54 += var21;
                                    var56 += var19;
                                    var44 += var24;
                                }
                            }
                            if (!class152.method1194(class116.field1991, (var54 >> 12) - 1, false, var44, 0, var59, var23, (var55 >> 12) + 1)) {
                                return false;
                            }
                            var44 += var24;
                            var54 += var21;
                            var55 += var20;
                            var59 += class597.field8526;
                        }
                    } else {
                        int var60 = arg6 - arg1;
                        int var61 = arg1 - arg3;
                        int var62 = class597.field8526 * arg3;
                        while (true) {
                            var61--;
                            if (var61 < 0) {
                                while (true) {
                                    var60--;
                                    if (var60 < 0) {
                                        return true;
                                    }
                                    if (!class152.method1194(class116.field1991, (var56 >> 12) - 1, false, var44, 0, var62, var23, (var54 >> 12) + 1)) {
                                        return false;
                                    }
                                    var62 += class597.field8526;
                                    var56 += var19;
                                    var44 += var24;
                                    var54 += var21;
                                }
                            }
                            if (!class152.method1194(class116.field1991, (var55 >> 12) - 1, false, var44, 0, var62, var23, (var54 >> 12) + 1)) {
                                return false;
                            }
                            var55 += var20;
                            var62 += class597.field8526;
                            var44 += var24;
                            var54 += var21;
                        }
                    }
                }
            } else if (arg1 >= class122.field2067) {
                return true;
            } else {
                if (class122.field2067 < arg6) {
                    arg6 = class122.field2067;
                }
                if (arg3 > class122.field2067) {
                    arg3 = class122.field2067;
                }
                int var63 = (arg0 << 8) + var23 - arg7 * var23;
                if (arg6 > arg3) {
                    int var64;
                    int var65 = var64 = arg7 << 12;
                    if (arg1 < 0) {
                        var64 -= arg1 * var20;
                        var63 -= arg1 * var24;
                        var65 -= arg1 * var19;
                        arg1 = 0;
                    }
                    int var66 = arg4 << 12;
                    if (arg3 < 0) {
                        var66 -= arg3 * var21;
                        arg3 = 0;
                    }
                    if ((arg1 == arg3 || var19 >= var20) && (arg1 != arg3 || var19 <= var21)) {
                        int var70 = arg6 - arg3;
                        int var71 = arg3 - arg1;
                        int var72 = class597.field8526 * arg1;
                        while (true) {
                            var71--;
                            if (var71 < 0) {
                                while (true) {
                                    var70--;
                                    if (var70 < 0) {
                                        return true;
                                    }
                                    if (!class152.method1194(class116.field1991, (var66 >> 12) - 1, !arg2, var63, 0, var72, var23, (var65 >> 12) + 1)) {
                                        return false;
                                    }
                                    var65 += var19;
                                    var66 += var21;
                                    var63 += var24;
                                    var72 += class597.field8526;
                                }
                            }
                            if (!class152.method1194(class116.field1991, (var64 >> 12) - 1, false, var63, 0, var72, var23, (var65 >> 12) + 1)) {
                                return false;
                            }
                            var63 += var24;
                            var64 += var20;
                            var72 += class597.field8526;
                            var65 += var19;
                        }
                    } else {
                        int var67 = arg6 - arg3;
                        int var68 = arg3 - arg1;
                        int var69 = class597.field8526 * arg1;
                        while (true) {
                            var68--;
                            if (var68 < 0) {
                                while (true) {
                                    var67--;
                                    if (var67 < 0) {
                                        return true;
                                    }
                                    if (!class152.method1194(class116.field1991, (var65 >> 12) - 1, false, var63, 0, var69, var23, (var66 >> 12) + 1)) {
                                        return false;
                                    }
                                    var66 += var21;
                                    var69 += class597.field8526;
                                    var65 += var19;
                                    var63 += var24;
                                }
                            }
                            if (!class152.method1194(class116.field1991, (var65 >> 12) - 1, !arg2, var63, 0, var69, var23, (var64 >> 12) + 1)) {
                                return false;
                            }
                            var69 += class597.field8526;
                            var64 += var20;
                            var63 += var24;
                            var65 += var19;
                        }
                    }
                } else {
                    int var73;
                    int var74 = var73 = arg7 << 12;
                    if (arg1 < 0) {
                        var73 -= arg1 * var20;
                        var74 -= arg1 * var19;
                        var63 -= arg1 * var24;
                        arg1 = 0;
                    }
                    int var75 = arg9 << 12;
                    if (arg6 < 0) {
                        var75 -= arg6 * var21;
                        arg6 = 0;
                    }
                    if (var19 < var20) {
                        int var76 = arg3 - arg6;
                        int var77 = arg6 - arg1;
                        int var78 = class597.field8526 * arg1;
                        while (true) {
                            var77--;
                            if (var77 < 0) {
                                while (true) {
                                    var76--;
                                    if (var76 < 0) {
                                        return true;
                                    }
                                    if (!class152.method1194(class116.field1991, (var75 >> 12) - 1, false, var63, 0, var78, var23, (var73 >> 12) + 1)) {
                                        return false;
                                    }
                                    var73 += var20;
                                    var63 += var24;
                                    var78 += class597.field8526;
                                    var75 += var21;
                                }
                            }
                            if (!class152.method1194(class116.field1991, (var74 >> 12) - 1, false, var63, 0, var78, var23, (var73 >> 12) + 1)) {
                                return false;
                            }
                            var74 += var19;
                            var63 += var24;
                            var73 += var20;
                            var78 += class597.field8526;
                        }
                    } else {
                        int var79 = arg3 - arg6;
                        int var80 = arg6 - arg1;
                        int var81 = class597.field8526 * arg1;
                        while (true) {
                            var80--;
                            if (var80 < 0) {
                                while (true) {
                                    var79--;
                                    if (var79 < 0) {
                                        return true;
                                    }
                                    if (!class152.method1194(class116.field1991, (var73 >> 12) - 1, !arg2, var63, 0, var81, var23, (var75 >> 12) + 1)) {
                                        return false;
                                    }
                                    var75 += var21;
                                    var73 += var20;
                                    var81 += class597.field8526;
                                    var63 += var24;
                                }
                            }
                            if (!class152.method1194(class116.field1991, (var73 >> 12) - 1, false, var63, 0, var81, var23, (var74 >> 12) + 1)) {
                                return false;
                            }
                            var73 += var20;
                            var74 += var19;
                            var81 += class597.field8526;
                            var63 += var24;
                        }
                    }
                }
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IZIZI[Luf;)V")
    public static final void method2689(int arg0, boolean arg1, int arg2, boolean arg3, int arg4, class519[] arg5) {
        int var6 = 0;
        if (arg3) {
            field6275 = null;
        }
        while (var6 < arg5.length) {
            class519 var7 = arg5[var6];
            if (var7 != null && var7.field7223 == arg0) {
                class58.method619(arg4, arg2, arg1, 5, var7);
                class458.method2680(arg4, 27797, arg2, var7);
                if (var7.field7145 > (var7.field7126 - var7.field7128)) {
                    var7.field7145 = var7.field7126 - var7.field7128;
                }
                if (var7.field7161 - var7.field7255 < var7.field7244) {
                    var7.field7244 = var7.field7161 - var7.field7255;
                }
                if (var7.field7145 < 0) {
                    var7.field7145 = 0;
                }
                if (var7.field7244 < 0) {
                    var7.field7244 = 0;
                }
                if (var7.field7190 == 0) {
                    class597.method3483(arg3, arg1, var7);
                }
            }
            var6++;
        }
        field6274++;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZZ)V")
    public static final void method2690(boolean arg0, boolean arg1) {
        field6276++;
        class421 var2 = (class421) class628.field8911.method3731((byte) -105);
        if (!arg0) {
            return;
        }
        while (var2 != null) {
            if (var2.field5835 != null) {
                class234.field3399.method4220(var2.field5835);
                var2.field5835 = null;
            }
            if (var2.field5863 != null) {
                class234.field3399.method4220(var2.field5863);
                var2.field5863 = null;
            }
            var2.method4237(-1);
            var2 = (class421) class628.field8911.method3729((byte) -117);
        }
        if (!arg1) {
            return;
        }
        for (class421 var3 = (class421) class254.field3641.method3731((byte) -117); var3 != null; var3 = (class421) class254.field3641.method3729((byte) 3)) {
            if (var3.field5835 != null) {
                class234.field3399.method4220(var3.field5835);
                var3.field5835 = null;
            }
            var3.method4237(-1);
        }
        for (class421 var4 = (class421) class221.field3243.method4254((byte) 8); var4 != null; var4 = (class421) class221.field3243.method4251(-44)) {
            if (var4.field5835 != null) {
                class234.field3399.method4220(var4.field5835);
                var4.field5835 = null;
            }
            var4.method4237(-1);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIIII)I")
    public static final int method2691(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field6284++;
        if (class678.field9594 == null) {
            return 0;
        }
        if (arg5 != -8725) {
            method2689(75, true, 123, false, -39, null);
        }
        if (arg1 < 3) {
            int var6 = arg2 >> 9;
            int var7 = arg4 >> 9;
            if (arg3 < 0 || arg0 < 0 || (class192.field2891 - 1) < arg3 || arg0 > class456.field6225 - 1) {
                return 0;
            }
            if (var6 < 1 || var7 < 1 || var6 > class192.field2891 - 1 || var7 > class456.field6225 - 1) {
                return 0;
            }
            boolean var8 = (class336.field4782[1][arg2 >> 9][arg4 >> 9] & 0x2) != 0;
            if ((arg2 & 0x1FF) == 0) {
                boolean var9 = (class336.field4782[1][var6 - 1][arg4 >> 9] & 0x2) != 0;
                boolean var10 = (class336.field4782[1][var6][arg4 >> 9] & 0x2) != 0;
                if (var10 != var9) {
                    var8 = (class336.field4782[1][arg3][arg0] & 0x2) != 0;
                }
            }
            if ((arg4 & 0x1FF) == 0) {
                boolean var11 = (class336.field4782[1][arg2 >> 9][var7 - 1] & 0x2) != 0;
                boolean var12 = (class336.field4782[1][arg2 >> 9][var7] & 0x2) != 0;
                if (var11 != var12) {
                    var8 = (class336.field4782[1][arg3][arg0] & 0x2) != 0;
                }
            }
            if (var8) {
                arg1++;
            }
        }
        return class678.field9594[arg1].method2478(true, arg4, arg2);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V")
    public static void method2692(byte arg0) {
        field6275 = null;
        field6286 = null;
        if (arg0 >= -114) {
            field6275 = null;
        }
        field6282 = null;
    }
}
