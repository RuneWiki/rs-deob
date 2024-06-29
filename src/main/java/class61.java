import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mia")
public class class61 extends class606 {

    @OriginalMember(owner = "client!mia", name = "p", descriptor = "[I")
    public static int[] field745 = new int[5];

    @OriginalMember(owner = "client!mia", name = "t", descriptor = "[[I")
    public static int[][] field749 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!mia", name = "o", descriptor = "I")
    public static int field744;

    @OriginalMember(owner = "client!mia", name = "q", descriptor = "I")
    public static int field746;

    @OriginalMember(owner = "client!mia", name = "r", descriptor = "I")
    public static int field747;

    @OriginalMember(owner = "client!mia", name = "s", descriptor = "I")
    public static int field748;

    @OriginalMember(owner = "client!mia", name = "u", descriptor = "I")
    public static int field750;

    @OriginalMember(owner = "client!mia", name = "v", descriptor = "I")
    public static int field751;

    @OriginalMember(owner = "client!mia", name = "w", descriptor = "I")
    public static int field752;

    @OriginalMember(owner = "client!mia", name = "y", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!mia", name = "z", descriptor = "I")
    public static int field755;

    @OriginalMember(owner = "client!mia", name = "A", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!mia", name = "B", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!mia", name = "C", descriptor = "I")
    public static int field758;

    @OriginalMember(owner = "client!mia", name = "x", descriptor = "[I")
    public static int[] field753;

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(IBLkd;II)V")
    public static final void method515(int arg0, byte arg1, class280 arg2, int arg3, int arg4) {
        ++field755;
        int var5 = arg2.field8009[0];
        int var6 = arg2.field8015[0];
        if (arg3 != -8958) {
            field753 = null;
        }
        if (var5 >= 0 && ~var5 > ~class336.field4683 && var6 >= 0 && ~var6 > ~class700.field9768) {
            if (~arg0 <= -1 && arg0 < class336.field4683 && ~arg4 <= -1 && ~arg4 > ~class700.field9768) {
                int var7 = class511.method3019(arg2.method1835((byte) 127), var5, var6, 0, -29375, 0, 0, arg4, arg0, class566.field8043, 0, class64.field784, class147.field2114[arg2.field1266], -4, true);
                if (~var7 <= -2) {
                    if (~var7 >= -4) {
                        for (int var8 = 0; ~var8 > ~(var7 + -1); ++var8) {
                            arg2.method1838(class566.field8043[var8], arg1, -106, class64.field784[var8]);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(III)V")
    public final void method516(int arg0, int arg1, int arg2) {
        if (arg1 <= 91) {
            this.method517(false, 13);
        }
        ++field754;
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(ZI)V")
    public final void method517(boolean arg0, int arg1) {
        if (arg1 >= -64) {
            field745 = null;
        }
        ++field757;
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(IZ)V")
    public final void method518(int arg0, boolean arg1) {
        if (arg0 != 5486) {
            field753 = null;
        }
        ++field752;
    }

    @OriginalMember(owner = "client!mia", name = "b", descriptor = "(II)V")
    public static final void method519(int arg0, int arg1) {
        if (arg0 >= -57) {
            field753 = null;
        }
        for (class189 var2 = class347.field4885.method1176(24490); var2 != null; var2 = class347.field4885.method1178((byte) 71)) {
            if ((long) arg1 == (var2.field2546 >> 48 & 65535L)) {
                var2.method1185(-95);
            }
        }
        ++field756;
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method520(int arg0, String arg1) {
        ++field746;
        class614.field8594 = arg1;
        if (class213.field2800 != null) {
            try {
                String var2 = class213.field2800.getParameter("cookieprefix");
                String var3 = class213.field2800.getParameter("cookiehost");
                String var4 = var2 + "settings=" + arg1 + "; version=1; path=/; domain=" + var3;
                String var5;
                if (~arg1.length() != -1) {
                    var5 = var4 + "; Expires=" + class759.method4213((byte) 89, class479.method2864((byte) -43) + 94608000000L) + "; Max-Age=" + 94608000L;
                } else {
                    var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                }
                class113.method796("document.cookie=\"" + var5 + "\"", class213.field2800, 87);
            } catch (Throwable var6) {
            }
            if (arg0 != 29167) {
                method527(-1, -31, (byte) 101);
            }
        }
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(B)V")
    public final void method521(byte arg0) {
        ++field758;
        int var2 = -52 / ((-26 - arg0) / 56);
    }

    @OriginalMember(owner = "client!mia", name = "d", descriptor = "(B)V")
    public static void method522(byte arg0) {
        field753 = null;
        field749 = null;
        if (arg0 != -82) {
            field753 = null;
        }
        field745 = null;
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(Lma;II)V")
    public final void method523(class12 arg0, int arg1, int arg2) {
        ++field751;
        super.field8525.method1663(arg0, -2);
        if (arg2 == 3) {
            super.field8525.method1628((byte) 117, arg1);
        }
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(IIZI)Lfp;")
    public static final class323 method524(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg1 != 5) {
            return null;
        } else {
            ++field750;
            class263 var4 = null;
            if (class286.field4060 != null) {
                var4 = new class263(arg0, class286.field4060, class699.field9762[arg0], 1000000);
            }
            class422.field5960[arg0] = class371.field5219.method1712(arg0, arg1 + -4, class33.field427, var4);
            class422.field5960[arg0].method4065((byte) 68);
            return new class323(class422.field5960[arg0], arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!mia", name = "c", descriptor = "(I)Z")
    public final boolean method525(int arg0) {
        ++field744;
        return arg0 <= 19;
    }

    @OriginalMember(owner = "client!mia", name = "<init>", descriptor = "(Lsr;)V")
    public class61(class251 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(IIIIIIIIBI)Z")
    public static final boolean method526(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9) {
        ++field747;
        if (~arg9 >= -2001 && ~arg0 >= -2001 && arg3 <= 2000 && ~arg7 >= -2001 && ~arg4 >= -2001 && ~arg6 >= -2001) {
            if (arg9 >= -2000 && arg0 >= -2000 && ~arg3 <= 1999 && ~arg7 <= 1999 && arg4 >= -2000 && ~arg6 <= 1999) {
                if (~class546.field7623 == -3) {
                    int var10 = class454.field6415 * arg9 + arg7;
                    if (~var10 <= -1 && class246.field3285.length > var10 && (arg1 << 8) - 38400 < class246.field3285[var10]) {
                        return false;
                    }
                    int var11 = class454.field6415 * arg0 + arg4;
                    if (var11 >= 0 && ~var11 > ~class246.field3285.length && ~((arg2 << 8) + -38400) > ~class246.field3285[var11]) {
                        return false;
                    }
                    int var12 = arg6 - -(class454.field6415 * arg3);
                    if (~var12 <= -1 && var12 < class246.field3285.length && ~((arg5 << 8) - 38400) > ~class246.field3285[var12]) {
                        return false;
                    }
                }
                int var13 = -arg7 + arg4;
                int var14 = -arg9 + arg0;
                int var15 = -arg7 + arg6;
                int var16 = -arg9 + arg3;
                int var17 = -arg1 + arg2;
                if (~arg9 > ~arg0 && ~arg3 < ~arg3) {
                    if (arg0 <= arg3) {
                        ++arg3;
                    } else {
                        ++arg0;
                    }
                    --arg9;
                } else if (arg3 > arg0) {
                    if (arg9 > arg3) {
                        ++arg9;
                    } else {
                        ++arg3;
                    }
                    --arg0;
                } else {
                    if (~arg9 >= ~arg0) {
                        ++arg0;
                    } else {
                        ++arg9;
                    }
                    --arg3;
                }
                int var18 = -arg1 + arg5;
                int var19 = 0;
                if (arg0 != arg9) {
                    var19 = (-arg7 + arg4 << 12) / (arg0 - arg9);
                }
                int var20 = 0;
                if (~arg0 != ~arg3) {
                    var20 = (-arg4 + arg6 << 12) / (-arg0 + arg3);
                }
                int var21 = 0;
                if (arg3 != arg9) {
                    var21 = (-arg6 + arg7 << 12) / (arg9 - arg3);
                }
                int var22 = var13 * var16 + -(var14 * var15);
                if (~var22 == -1) {
                    return false;
                } else {
                    int var23 = (var16 * var17 + -(var14 * var18) << 8) / var22;
                    if (arg8 != -126) {
                        method527(-81, -76, (byte) -39);
                    }
                    int var24 = (var13 * var18 + -(var15 * var17) << 8) / var22;
                    if (arg0 >= arg9 && arg9 <= arg3) {
                        if (class240.field3200 <= arg9) {
                            return true;
                        } else {
                            if (~arg0 < ~class240.field3200) {
                                arg0 = class240.field3200;
                            }
                            int var25 = (arg1 << 8) + -(arg7 * var23) + var23;
                            if (class240.field3200 < arg3) {
                                arg3 = class240.field3200;
                            }
                            if (arg3 <= arg0) {
                                int var26;
                                int var27 = var26 = arg7 << 12;
                                int var28 = arg6 << 12;
                                if (~arg9 > -1) {
                                    var25 -= arg9 * var24;
                                    var26 -= arg9 * var19;
                                    var27 -= arg9 * var21;
                                    arg9 = 0;
                                }
                                if (arg3 < 0) {
                                    var28 -= arg3 * var20;
                                    arg3 = 0;
                                }
                                if ((~arg3 == ~arg9 || var19 <= var21) && (~arg3 != ~arg9 || var20 <= var19)) {
                                    int var32 = arg0 - arg3;
                                    int var33 = arg3 - arg9;
                                    int var34 = class454.field6415 * arg9;
                                    while (true) {
                                        --var33;
                                        if (~var33 > -1) {
                                            while (true) {
                                                --var32;
                                                if (~var32 > -1) {
                                                    return true;
                                                }
                                                if (!class186.method1170(var25, var23, (var26 >> 12) + -1, (byte) -52, 0, (var28 >> 12) - -1, class246.field3285, var34)) {
                                                    return false;
                                                }
                                                var26 += var19;
                                                var34 += class454.field6415;
                                                var28 += var20;
                                                var25 += var24;
                                            }
                                        }
                                        if (!class186.method1170(var25, var23, (var26 >> 12) + -1, (byte) -74, 0, (var27 >> 12) + 1, class246.field3285, var34)) {
                                            return false;
                                        }
                                        var26 += var19;
                                        var27 += var21;
                                        var25 += var24;
                                        var34 += class454.field6415;
                                    }
                                } else {
                                    int var29 = arg0 - arg3;
                                    int var30 = arg3 - arg9;
                                    int var31 = class454.field6415 * arg9;
                                    while (true) {
                                        --var30;
                                        if (~var30 > -1) {
                                            while (true) {
                                                --var29;
                                                if (~var29 > -1) {
                                                    return true;
                                                }
                                                if (!class186.method1170(var25, var23, (var28 >> 12) - 1, (byte) -121, 0, (var26 >> 12) + 1, class246.field3285, var31)) {
                                                    return false;
                                                }
                                                var25 += var24;
                                                var28 += var20;
                                                var26 += var19;
                                                var31 += class454.field6415;
                                            }
                                        }
                                        if (!class186.method1170(var25, var23, (var27 >> 12) - 1, (byte) -54, 0, (var26 >> 12) + 1, class246.field3285, var31)) {
                                            return false;
                                        }
                                        var25 += var24;
                                        var31 += class454.field6415;
                                        var26 += var19;
                                        var27 += var21;
                                    }
                                }
                            } else {
                                int var35;
                                int var36 = var35 = arg7 << 12;
                                int var37 = arg4 << 12;
                                if (~arg9 > -1) {
                                    var36 -= arg9 * var21;
                                    var25 -= arg9 * var24;
                                    var35 -= arg9 * var19;
                                    arg9 = 0;
                                }
                                if (~arg0 > -1) {
                                    var37 -= arg0 * var20;
                                    arg0 = 0;
                                }
                                if ((arg0 == arg9 || var21 >= var19) && (arg0 != arg9 || var20 >= var21)) {
                                    int var41 = arg3 - arg0;
                                    int var42 = arg0 - arg9;
                                    int var43 = class454.field6415 * arg9;
                                    while (true) {
                                        --var42;
                                        if (~var42 > -1) {
                                            while (true) {
                                                --var41;
                                                if (var41 < 0) {
                                                    return true;
                                                }
                                                if (!class186.method1170(var25, var23, (var37 >> 12) - 1, (byte) -94, 0, (var36 >> 12) + 1, class246.field3285, var43)) {
                                                    return false;
                                                }
                                                var37 += var20;
                                                var43 += class454.field6415;
                                                var36 += var21;
                                                var25 += var24;
                                            }
                                        }
                                        if (!class186.method1170(var25, var23, (var35 >> 12) + -1, (byte) -76, 0, (var36 >> 12) + 1, class246.field3285, var43)) {
                                            return false;
                                        }
                                        var25 += var24;
                                        var43 += class454.field6415;
                                        var35 += var19;
                                        var36 += var21;
                                    }
                                } else {
                                    int var38 = arg3 - arg0;
                                    int var39 = arg0 - arg9;
                                    int var40 = class454.field6415 * arg9;
                                    while (true) {
                                        --var39;
                                        if (var39 < 0) {
                                            while (true) {
                                                --var38;
                                                if (~var38 > -1) {
                                                    return true;
                                                }
                                                if (!class186.method1170(var25, var23, (var36 >> 12) + -1, (byte) -77, 0, (var37 >> 12) + 1, class246.field3285, var40)) {
                                                    return false;
                                                }
                                                var36 += var21;
                                                var37 += var20;
                                                var25 += var24;
                                                var40 += class454.field6415;
                                            }
                                        }
                                        if (!class186.method1170(var25, var23, (var36 >> 12) + -1, (byte) -58, 0, (var35 >> 12) + 1, class246.field3285, var40)) {
                                            return false;
                                        }
                                        var36 += var21;
                                        var25 += var24;
                                        var35 += var19;
                                        var40 += class454.field6415;
                                    }
                                }
                            }
                        }
                    } else if (arg0 > arg3) {
                        if (~class240.field3200 >= ~arg3) {
                            return true;
                        } else {
                            if (~class240.field3200 > ~arg0) {
                                arg0 = class240.field3200;
                            }
                            int var44 = (arg5 << 8) + -(arg6 * var23) + var23;
                            if (~class240.field3200 > ~arg9) {
                                arg9 = class240.field3200;
                            }
                            if (~arg9 > ~arg0) {
                                int var45;
                                int var46 = var45 = arg6 << 12;
                                int var47 = arg7 << 12;
                                if (arg3 < 0) {
                                    var44 -= arg3 * var24;
                                    var45 -= arg3 * var21;
                                    var46 -= arg3 * var20;
                                    arg3 = 0;
                                }
                                if (arg9 < 0) {
                                    var47 -= arg9 * var19;
                                    arg9 = 0;
                                }
                                if (var21 > var20) {
                                    int var48 = arg0 - arg9;
                                    int var49 = arg9 - arg3;
                                    int var50 = class454.field6415 * arg3;
                                    while (true) {
                                        --var49;
                                        if (~var49 > -1) {
                                            while (true) {
                                                --var48;
                                                if (~var48 > -1) {
                                                    return true;
                                                }
                                                if (!class186.method1170(var44, var23, (var46 >> 12) - 1, (byte) -64, 0, (var47 >> 12) + 1, class246.field3285, var50)) {
                                                    return false;
                                                }
                                                var47 += var19;
                                                var46 += var20;
                                                var44 += var24;
                                                var50 += class454.field6415;
                                            }
                                        }
                                        if (!class186.method1170(var44, var23, (var46 >> 12) + -1, (byte) -61, 0, (var45 >> 12) + 1, class246.field3285, var50)) {
                                            return false;
                                        }
                                        var44 += var24;
                                        var46 += var20;
                                        var45 += var21;
                                        var50 += class454.field6415;
                                    }
                                } else {
                                    int var51 = arg0 - arg9;
                                    int var52 = arg9 - arg3;
                                    int var53 = class454.field6415 * arg3;
                                    while (true) {
                                        --var52;
                                        if (var52 < 0) {
                                            while (true) {
                                                --var51;
                                                if (~var51 > -1) {
                                                    return true;
                                                }
                                                if (!class186.method1170(var44, var23, (var47 >> 12) + -1, (byte) -55, 0, (var46 >> 12) + 1, class246.field3285, var53)) {
                                                    return false;
                                                }
                                                var47 += var19;
                                                var53 += class454.field6415;
                                                var46 += var20;
                                                var44 += var24;
                                            }
                                        }
                                        if (!class186.method1170(var44, var23, (var45 >> 12) + -1, (byte) -128, 0, (var46 >> 12) + 1, class246.field3285, var53)) {
                                            return false;
                                        }
                                        var44 += var24;
                                        var53 += class454.field6415;
                                        var46 += var20;
                                        var45 += var21;
                                    }
                                }
                            } else {
                                int var54;
                                int var55 = var54 = arg6 << 12;
                                int var56 = arg4 << 12;
                                if (arg3 < 0) {
                                    var54 -= arg3 * var21;
                                    var55 -= arg3 * var20;
                                    var44 -= arg3 * var24;
                                    arg3 = 0;
                                }
                                if (~arg0 > -1) {
                                    var56 -= arg0 * var19;
                                    arg0 = 0;
                                }
                                if (var21 > var20) {
                                    int var57 = arg9 - arg0;
                                    int var58 = arg0 - arg3;
                                    int var59 = class454.field6415 * arg3;
                                    while (true) {
                                        --var58;
                                        if (var58 < 0) {
                                            while (true) {
                                                --var57;
                                                if (~var57 > -1) {
                                                    return true;
                                                }
                                                if (!class186.method1170(var44, var23, (var56 >> 12) + -1, (byte) 121, 0, (var54 >> 12) - -1, class246.field3285, var59)) {
                                                    return false;
                                                }
                                                var59 += class454.field6415;
                                                var44 += var24;
                                                var54 += var21;
                                                var56 += var19;
                                            }
                                        }
                                        if (!class186.method1170(var44, var23, (var55 >> 12) + -1, (byte) -71, 0, (var54 >> 12) + 1, class246.field3285, var59)) {
                                            return false;
                                        }
                                        var44 += var24;
                                        var55 += var20;
                                        var59 += class454.field6415;
                                        var54 += var21;
                                    }
                                } else {
                                    int var60 = arg9 - arg0;
                                    int var61 = arg0 - arg3;
                                    int var62 = class454.field6415 * arg3;
                                    while (true) {
                                        --var61;
                                        if (~var61 > -1) {
                                            while (true) {
                                                --var60;
                                                if (~var60 > -1) {
                                                    return true;
                                                }
                                                if (!class186.method1170(var44, var23, (var54 >> 12) + -1, (byte) 75, 0, (var56 >> 12) + 1, class246.field3285, var62)) {
                                                    return false;
                                                }
                                                var56 += var19;
                                                var44 += var24;
                                                var62 += class454.field6415;
                                                var54 += var21;
                                            }
                                        }
                                        if (!class186.method1170(var44, var23, (var54 >> 12) + -1, (byte) 125, 0, (var55 >> 12) - -1, class246.field3285, var62)) {
                                            return false;
                                        }
                                        var54 += var21;
                                        var55 += var20;
                                        var62 += class454.field6415;
                                        var44 += var24;
                                    }
                                }
                            }
                        }
                    } else if (~class240.field3200 >= ~arg0) {
                        return true;
                    } else {
                        if (~class240.field3200 > ~arg9) {
                            arg9 = class240.field3200;
                        }
                        int var63 = (arg2 << 8) - (arg4 * var23 + -var23);
                        if (~arg3 < ~class240.field3200) {
                            arg3 = class240.field3200;
                        }
                        if (arg3 < arg9) {
                            int var64;
                            int var65 = var64 = arg4 << 12;
                            int var66 = arg6 << 12;
                            if (arg0 < 0) {
                                var63 -= arg0 * var24;
                                var65 -= arg0 * var19;
                                var64 -= arg0 * var20;
                                arg0 = 0;
                            }
                            if (~arg3 > -1) {
                                var66 -= arg3 * var21;
                                arg3 = 0;
                            }
                            if (arg0 != arg3 && var20 > var19 || arg0 == arg3 && var19 > var21) {
                                int var67 = arg9 - arg3;
                                int var68 = arg3 - arg0;
                                int var69 = class454.field6415 * arg0;
                                while (true) {
                                    --var68;
                                    if (~var68 > -1) {
                                        while (true) {
                                            --var67;
                                            if (~var67 > -1) {
                                                return true;
                                            }
                                            if (!class186.method1170(var63, var23, (var65 >> 12) + -1, (byte) -49, 0, (var66 >> 12) + 1, class246.field3285, var69)) {
                                                return false;
                                            }
                                            var65 += var19;
                                            var69 += class454.field6415;
                                            var63 += var24;
                                            var66 += var21;
                                        }
                                    }
                                    if (!class186.method1170(var63, var23, (var65 >> 12) - 1, (byte) -107, 0, (var64 >> 12) + 1, class246.field3285, var69)) {
                                        return false;
                                    }
                                    var63 += var24;
                                    var65 += var19;
                                    var64 += var20;
                                    var69 += class454.field6415;
                                }
                            } else {
                                int var70 = arg9 - arg3;
                                int var71 = arg3 - arg0;
                                int var72 = class454.field6415 * arg0;
                                while (true) {
                                    --var71;
                                    if (var71 < 0) {
                                        while (true) {
                                            --var70;
                                            if (var70 < 0) {
                                                return true;
                                            }
                                            if (!class186.method1170(var63, var23, (var66 >> 12) - 1, (byte) -128, 0, (var65 >> 12) + 1, class246.field3285, var72)) {
                                                return false;
                                            }
                                            var63 += var24;
                                            var66 += var21;
                                            var72 += class454.field6415;
                                            var65 += var19;
                                        }
                                    }
                                    if (!class186.method1170(var63, var23, (var64 >> 12) - 1, (byte) 68, 0, (var65 >> 12) + 1, class246.field3285, var72)) {
                                        return false;
                                    }
                                    var63 += var24;
                                    var64 += var20;
                                    var65 += var19;
                                    var72 += class454.field6415;
                                }
                            }
                        } else {
                            int var73;
                            int var74 = var73 = arg4 << 12;
                            if (arg0 < 0) {
                                var73 -= arg0 * var20;
                                var63 -= arg0 * var24;
                                var74 -= arg0 * var19;
                                arg0 = 0;
                            }
                            int var75 = arg7 << 12;
                            if (~arg9 > -1) {
                                var75 -= arg9 * var21;
                                arg9 = 0;
                            }
                            if (var19 >= var20) {
                                int var76 = arg3 - arg9;
                                int var77 = arg9 - arg0;
                                int var78 = class454.field6415 * arg0;
                                while (true) {
                                    --var77;
                                    if (~var77 > -1) {
                                        while (true) {
                                            --var76;
                                            if (var76 < 0) {
                                                return true;
                                            }
                                            if (!class186.method1170(var63, var23, (var73 >> 12) + -1, (byte) -107, 0, (var75 >> 12) - -1, class246.field3285, var78)) {
                                                return false;
                                            }
                                            var75 += var21;
                                            var63 += var24;
                                            var73 += var20;
                                            var78 += class454.field6415;
                                        }
                                    }
                                    if (!class186.method1170(var63, var23, (var73 >> 12) + -1, (byte) -57, 0, (var74 >> 12) + 1, class246.field3285, var78)) {
                                        return false;
                                    }
                                    var73 += var20;
                                    var74 += var19;
                                    var78 += class454.field6415;
                                    var63 += var24;
                                }
                            } else {
                                int var79 = arg3 - arg9;
                                int var80 = arg9 - arg0;
                                int var81 = class454.field6415 * arg0;
                                while (true) {
                                    --var80;
                                    if (var80 < 0) {
                                        while (true) {
                                            --var79;
                                            if (~var79 > -1) {
                                                return true;
                                            }
                                            if (!class186.method1170(var63, var23, (var75 >> 12) - 1, (byte) -73, 0, (var73 >> 12) + 1, class246.field3285, var81)) {
                                                return false;
                                            }
                                            var73 += var20;
                                            var63 += var24;
                                            var81 += class454.field6415;
                                            var75 += var21;
                                        }
                                    }
                                    if (!class186.method1170(var63, var23, (var74 >> 12) + -1, (byte) 70, 0, (var73 >> 12) + 1, class246.field3285, var81)) {
                                        return false;
                                    }
                                    var81 += class454.field6415;
                                    var63 += var24;
                                    var73 += var20;
                                    var74 += var19;
                                }
                            }
                        }
                    }
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(IIB)I")
    public static final int method527(int arg0, int arg1, byte arg2) {
        ++field748;
        int var3 = (arg1 & 127) * arg0 >> 7;
        if (var3 >= 2) {
            if (~var3 < -127) {
                var3 = 126;
            }
        } else {
            var3 = 2;
        }
        if (arg2 > -64) {
            field745 = null;
        }
        return (65408 & arg1) + var3;
    }
}
