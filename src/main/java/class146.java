import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class146 {

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "[Ljava/lang/String;")
    private String[] field1878 = new String[0];

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "I")
    private int field1881 = -1;

    @OriginalMember(owner = "client!qm", name = "j", descriptor = "Z")
    private boolean field1886 = false;

    @OriginalMember(owner = "client!qm", name = "g", descriptor = "I")
    private int field1883;

    @OriginalMember(owner = "client!qm", name = "h", descriptor = "Llga;")
    public static class712 field1884 = new class712(83, 12);

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "I")
    public static int field1877;

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!qm", name = "i", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!qm", name = "k", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!qm", name = "l", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!qm", name = "m", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!qm", name = "n", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "J")
    public static long field1882;

    @OriginalMember(owner = "client!qm", name = "o", descriptor = "Lo;")
    public static class29 field1891;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)V")
    public static void method899(int arg0) {
        field1884 = null;
        field1891 = null;
        if (arg0 != 1) {
            field1891 = null;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IB)I")
    private final int method900(int arg0, byte arg1) {
        field1887++;
        int var3 = 119 % ((19 - arg1) / 62);
        int var4 = this.field1878.length;
        while (var4 <= arg0) {
            if (!this.field1886) {
                var4 += this.field1883;
            } else if (var4 == 0) {
                var4 = 1;
            } else {
                var4 = this.field1883 * var4;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!qm", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1889++;
        StringBuffer var1 = new StringBuffer();
        var1.append("[");
        for (int var2 = 0; var2 < this.field1881; var2++) {
            if (var2 != 0) {
                var1.append(", ");
            }
            var1.append(this.field1878[var2]);
        }
        var1.append("]");
        return var1.toString();
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(II)V")
    private final void method901(int arg0, int arg1) {
        if (arg0 <= 43) {
            this.field1886 = true;
        }
        field1880++;
        String[] var3 = new String[this.method900(arg1, (byte) 89)];
        class373.method2192(this.field1878, 0, var3, 0, this.field1878.length);
        this.field1878 = var3;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIBIIIIIII)Z")
    public static final boolean method902(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1879++;
        if (arg5 > 2000 || arg7 > 2000 || arg4 > 2000 || arg1 > 2000 || arg0 > 2000 || arg6 > 2000) {
            return false;
        } else if (arg5 >= -2000 && arg7 >= -2000 && arg4 >= -2000 && arg1 >= -2000 && arg0 >= -2000 && arg6 >= -2000) {
            if (class354.field4725 == 2) {
                int var10 = class38.field394 * arg5 + arg1;
                if (var10 >= 0 && class648.field9025.length > var10 && ((arg8 << 8) - 38400) < class648.field9025[var10]) {
                    return false;
                }
                int var11 = arg0 + (class38.field394 * arg7);
                if (var11 >= 0 && class648.field9025.length > var11 && class648.field9025[var11] > (arg3 << 8) - 38400) {
                    return false;
                }
                int var12 = class38.field394 * arg4 + arg6;
                if (var12 >= 0 && var12 < class648.field9025.length && (arg9 << 8) - 38400 < class648.field9025[var12]) {
                    return false;
                }
            }
            int var13 = arg0 - arg1;
            int var14 = arg7 - arg5;
            if (arg2 <= 70) {
                return false;
            }
            int var15 = arg6 - arg1;
            int var16 = arg4 - arg5;
            int var17 = arg3 - arg8;
            int var18 = arg9 - arg8;
            if (arg7 > arg5 && arg4 > arg4) {
                arg5--;
                if (arg4 >= arg7) {
                    arg4++;
                } else {
                    arg7++;
                }
            } else if (arg4 > arg7) {
                if (arg4 >= arg5) {
                    arg4++;
                } else {
                    arg5++;
                }
                arg7--;
            } else {
                if (arg7 >= arg5) {
                    arg7++;
                } else {
                    arg5++;
                }
                arg4--;
            }
            int var19 = 0;
            if (arg5 != arg7) {
                var19 = (arg0 - arg1 << 12) / (arg7 - arg5);
            }
            int var20 = 0;
            if (arg4 != arg7) {
                var20 = (arg6 - arg0 << 12) / (arg4 - arg7);
            }
            int var21 = 0;
            if (arg4 != arg5) {
                var21 = (arg1 - arg6 << 12) / (arg5 - arg4);
            }
            int var22 = var13 * var16 - (var14 * var15);
            if (var22 == 0) {
                return false;
            }
            int var23 = (var16 * var17 - (var14 * var18) << 8) / var22;
            int var24 = (var13 * var18 - (var15 * var17) << 8) / var22;
            if (arg7 >= arg5 && arg4 >= arg5) {
                if (arg5 >= class547.field7720) {
                    return true;
                }
                if (class547.field7720 < arg4) {
                    arg4 = class547.field7720;
                }
                int var25 = (arg8 << 8) + var23 - arg1 * var23;
                if (arg7 > class547.field7720) {
                    arg7 = class547.field7720;
                }
                if (arg4 <= arg7) {
                    int var26;
                    int var27 = var26 = arg1 << 12;
                    if (arg5 < 0) {
                        var26 -= arg5 * var19;
                        var25 -= arg5 * var24;
                        var27 -= arg5 * var21;
                        arg5 = 0;
                    }
                    int var28 = arg6 << 12;
                    if (arg4 < 0) {
                        var28 -= arg4 * var20;
                        arg4 = 0;
                    }
                    if (arg4 != arg5 && var19 > var21 || arg4 == arg5 && var20 > var19) {
                        int var29 = arg7 - arg4;
                        int var30 = arg4 - arg5;
                        int var31 = class38.field394 * arg5;
                        while (true) {
                            var30--;
                            if (var30 < 0) {
                                while (true) {
                                    var29--;
                                    if (var29 < 0) {
                                        return true;
                                    }
                                    if (!class365.method2091((var28 >> 12) - 1, var23, var31, 0, var25, (byte) -108, (var26 >> 12) + 1, class648.field9025)) {
                                        return false;
                                    }
                                    var28 += var20;
                                    var25 += var24;
                                    var26 += var19;
                                    var31 += class38.field394;
                                }
                            }
                            if (!class365.method2091((var27 >> 12) - 1, var23, var31, 0, var25, (byte) -119, (var26 >> 12) + 1, class648.field9025)) {
                                return false;
                            }
                            var25 += var24;
                            var26 += var19;
                            var27 += var21;
                            var31 += class38.field394;
                        }
                    } else {
                        int var32 = arg7 - arg4;
                        int var33 = arg4 - arg5;
                        int var34 = class38.field394 * arg5;
                        while (true) {
                            var33--;
                            if (var33 < 0) {
                                while (true) {
                                    var32--;
                                    if (var32 < 0) {
                                        return true;
                                    }
                                    if (!class365.method2091((var26 >> 12) - 1, var23, var34, 0, var25, (byte) -38, (var28 >> 12) + 1, class648.field9025)) {
                                        return false;
                                    }
                                    var26 += var19;
                                    var25 += var24;
                                    var28 += var20;
                                    var34 += class38.field394;
                                }
                            }
                            if (!class365.method2091((var26 >> 12) - 1, var23, var34, 0, var25, (byte) -30, (var27 >> 12) + 1, class648.field9025)) {
                                return false;
                            }
                            var26 += var19;
                            var27 += var21;
                            var25 += var24;
                            var34 += class38.field394;
                        }
                    }
                } else {
                    int var35;
                    int var36 = var35 = arg1 << 12;
                    int var37 = arg0 << 12;
                    if (arg5 < 0) {
                        var35 -= arg5 * var19;
                        var36 -= arg5 * var21;
                        var25 -= arg5 * var24;
                        arg5 = 0;
                    }
                    if (arg7 < 0) {
                        var37 -= arg7 * var20;
                        arg7 = 0;
                    }
                    if ((arg5 == arg7 || var19 <= var21) && (arg5 != arg7 || var21 <= var20)) {
                        int var41 = arg4 - arg7;
                        int var42 = arg7 - arg5;
                        int var43 = class38.field394 * arg5;
                        while (true) {
                            var42--;
                            if (var42 < 0) {
                                while (true) {
                                    var41--;
                                    if (var41 < 0) {
                                        return true;
                                    }
                                    if (!class365.method2091((var37 >> 12) - 1, var23, var43, 0, var25, (byte) -32, (var36 >> 12) + 1, class648.field9025)) {
                                        return false;
                                    }
                                    var36 += var21;
                                    var25 += var24;
                                    var37 += var20;
                                    var43 += class38.field394;
                                }
                            }
                            if (!class365.method2091((var35 >> 12) - 1, var23, var43, 0, var25, (byte) -70, (var36 >> 12) + 1, class648.field9025)) {
                                return false;
                            }
                            var25 += var24;
                            var43 += class38.field394;
                            var35 += var19;
                            var36 += var21;
                        }
                    } else {
                        int var38 = arg4 - arg7;
                        int var39 = arg7 - arg5;
                        int var40 = class38.field394 * arg5;
                        while (true) {
                            var39--;
                            if (var39 < 0) {
                                while (true) {
                                    var38--;
                                    if (var38 < 0) {
                                        return true;
                                    }
                                    if (!class365.method2091((var36 >> 12) - 1, var23, var40, 0, var25, (byte) -59, (var37 >> 12) + 1, class648.field9025)) {
                                        return false;
                                    }
                                    var37 += var20;
                                    var40 += class38.field394;
                                    var25 += var24;
                                    var36 += var21;
                                }
                            }
                            if (!class365.method2091((var36 >> 12) - 1, var23, var40, 0, var25, (byte) -104, (var35 >> 12) + 1, class648.field9025)) {
                                return false;
                            }
                            var35 += var19;
                            var36 += var21;
                            var40 += class38.field394;
                            var25 += var24;
                        }
                    }
                }
            } else if (arg7 > arg4) {
                if (class547.field7720 <= arg4) {
                    return true;
                }
                if (arg7 > class547.field7720) {
                    arg7 = class547.field7720;
                }
                int var44 = (arg9 << 8) + var23 - arg6 * var23;
                if (arg5 > class547.field7720) {
                    arg5 = class547.field7720;
                }
                if (arg5 >= arg7) {
                    int var45;
                    int var46 = var45 = arg6 << 12;
                    if (arg4 < 0) {
                        var46 -= arg4 * var20;
                        var45 -= arg4 * var21;
                        var44 -= arg4 * var24;
                        arg4 = 0;
                    }
                    int var47 = arg0 << 12;
                    if (arg7 < 0) {
                        var47 -= arg7 * var19;
                        arg7 = 0;
                    }
                    if (var21 <= var20) {
                        int var48 = arg5 - arg7;
                        int var49 = arg7 - arg4;
                        int var50 = class38.field394 * arg4;
                        while (true) {
                            var49--;
                            if (var49 < 0) {
                                while (true) {
                                    var48--;
                                    if (var48 < 0) {
                                        return true;
                                    }
                                    if (!class365.method2091((var45 >> 12) - 1, var23, var50, 0, var44, (byte) -104, (var47 >> 12) + 1, class648.field9025)) {
                                        return false;
                                    }
                                    var47 += var19;
                                    var45 += var21;
                                    var44 += var24;
                                    var50 += class38.field394;
                                }
                            }
                            if (!class365.method2091((var45 >> 12) - 1, var23, var50, 0, var44, (byte) -62, (var46 >> 12) + 1, class648.field9025)) {
                                return false;
                            }
                            var50 += class38.field394;
                            var44 += var24;
                            var46 += var20;
                            var45 += var21;
                        }
                    } else {
                        int var51 = arg5 - arg7;
                        int var52 = arg7 - arg4;
                        int var53 = class38.field394 * arg4;
                        while (true) {
                            var52--;
                            if (var52 < 0) {
                                while (true) {
                                    var51--;
                                    if (var51 < 0) {
                                        return true;
                                    }
                                    if (!class365.method2091((var47 >> 12) - 1, var23, var53, 0, var44, (byte) -31, (var45 >> 12) + 1, class648.field9025)) {
                                        return false;
                                    }
                                    var44 += var24;
                                    var53 += class38.field394;
                                    var45 += var21;
                                    var47 += var19;
                                }
                            }
                            if (!class365.method2091((var46 >> 12) - 1, var23, var53, 0, var44, (byte) -24, (var45 >> 12) + 1, class648.field9025)) {
                                return false;
                            }
                            var44 += var24;
                            var45 += var21;
                            var46 += var20;
                            var53 += class38.field394;
                        }
                    }
                } else {
                    int var54;
                    int var55 = var54 = arg6 << 12;
                    if (arg4 < 0) {
                        var55 -= arg4 * var20;
                        var44 -= arg4 * var24;
                        var54 -= arg4 * var21;
                        arg4 = 0;
                    }
                    int var56 = arg1 << 12;
                    if (arg5 < 0) {
                        var56 -= arg5 * var19;
                        arg5 = 0;
                    }
                    if (var21 <= var20) {
                        int var57 = arg7 - arg5;
                        int var58 = arg5 - arg4;
                        int var59 = class38.field394 * arg4;
                        while (true) {
                            var58--;
                            if (var58 < 0) {
                                while (true) {
                                    var57--;
                                    if (var57 < 0) {
                                        return true;
                                    }
                                    if (!class365.method2091((var56 >> 12) - 1, var23, var59, 0, var44, (byte) -76, (var55 >> 12) + 1, class648.field9025)) {
                                        return false;
                                    }
                                    var56 += var19;
                                    var59 += class38.field394;
                                    var44 += var24;
                                    var55 += var20;
                                }
                            }
                            if (!class365.method2091((var54 >> 12) - 1, var23, var59, 0, var44, (byte) -57, (var55 >> 12) + 1, class648.field9025)) {
                                return false;
                            }
                            var54 += var21;
                            var44 += var24;
                            var59 += class38.field394;
                            var55 += var20;
                        }
                    } else {
                        int var60 = arg7 - arg5;
                        int var61 = arg5 - arg4;
                        int var62 = class38.field394 * arg4;
                        while (true) {
                            var61--;
                            if (var61 < 0) {
                                while (true) {
                                    var60--;
                                    if (var60 < 0) {
                                        return true;
                                    }
                                    if (!class365.method2091((var55 >> 12) - 1, var23, var62, 0, var44, (byte) -21, (var56 >> 12) + 1, class648.field9025)) {
                                        return false;
                                    }
                                    var55 += var20;
                                    var44 += var24;
                                    var62 += class38.field394;
                                    var56 += var19;
                                }
                            }
                            if (!class365.method2091((var55 >> 12) - 1, var23, var62, 0, var44, (byte) -85, (var54 >> 12) + 1, class648.field9025)) {
                                return false;
                            }
                            var44 += var24;
                            var55 += var20;
                            var54 += var21;
                            var62 += class38.field394;
                        }
                    }
                }
            } else if (arg7 >= class547.field7720) {
                return true;
            } else {
                if (arg5 > class547.field7720) {
                    arg5 = class547.field7720;
                }
                int var63 = (arg3 << 8) + var23 - (arg0 * var23);
                if (class547.field7720 < arg4) {
                    arg4 = class547.field7720;
                }
                if (arg4 < arg5) {
                    int var64;
                    int var65 = var64 = arg0 << 12;
                    if (arg7 < 0) {
                        var65 -= arg7 * var19;
                        var63 -= arg7 * var24;
                        var64 -= arg7 * var20;
                        arg7 = 0;
                    }
                    int var66 = arg6 << 12;
                    if (arg4 < 0) {
                        var66 -= arg4 * var21;
                        arg4 = 0;
                    }
                    if (arg4 != arg7 && var19 < var20 || arg4 == arg7 && var19 > var21) {
                        int var67 = arg5 - arg4;
                        int var68 = arg4 - arg7;
                        int var69 = class38.field394 * arg7;
                        while (true) {
                            var68--;
                            if (var68 < 0) {
                                while (true) {
                                    var67--;
                                    if (var67 < 0) {
                                        return true;
                                    }
                                    if (!class365.method2091((var65 >> 12) - 1, var23, var69, 0, var63, (byte) -123, (var66 >> 12) + 1, class648.field9025)) {
                                        return false;
                                    }
                                    var69 += class38.field394;
                                    var63 += var24;
                                    var66 += var21;
                                    var65 += var19;
                                }
                            }
                            if (!class365.method2091((var65 >> 12) - 1, var23, var69, 0, var63, (byte) -113, (var64 >> 12) + 1, class648.field9025)) {
                                return false;
                            }
                            var69 += class38.field394;
                            var64 += var20;
                            var63 += var24;
                            var65 += var19;
                        }
                    } else {
                        int var70 = arg5 - arg4;
                        int var71 = arg4 - arg7;
                        int var72 = class38.field394 * arg7;
                        while (true) {
                            var71--;
                            if (var71 < 0) {
                                while (true) {
                                    var70--;
                                    if (var70 < 0) {
                                        return true;
                                    }
                                    if (!class365.method2091((var66 >> 12) - 1, var23, var72, 0, var63, (byte) -74, (var65 >> 12) + 1, class648.field9025)) {
                                        return false;
                                    }
                                    var63 += var24;
                                    var66 += var21;
                                    var65 += var19;
                                    var72 += class38.field394;
                                }
                            }
                            if (!class365.method2091((var64 >> 12) - 1, var23, var72, 0, var63, (byte) -87, (var65 >> 12) + 1, class648.field9025)) {
                                return false;
                            }
                            var72 += class38.field394;
                            var63 += var24;
                            var65 += var19;
                            var64 += var20;
                        }
                    }
                } else {
                    int var73;
                    int var74 = var73 = arg0 << 12;
                    if (arg7 < 0) {
                        var73 -= arg7 * var20;
                        var74 -= arg7 * var19;
                        var63 -= arg7 * var24;
                        arg7 = 0;
                    }
                    int var75 = arg1 << 12;
                    if (arg5 < 0) {
                        var75 -= arg5 * var21;
                        arg5 = 0;
                    }
                    if (var20 <= var19) {
                        int var76 = arg4 - arg5;
                        int var77 = arg5 - arg7;
                        int var78 = class38.field394 * arg7;
                        while (true) {
                            var77--;
                            if (var77 < 0) {
                                while (true) {
                                    var76--;
                                    if (var76 < 0) {
                                        return true;
                                    }
                                    if (!class365.method2091((var73 >> 12) - 1, var23, var78, 0, var63, (byte) -96, (var75 >> 12) + 1, class648.field9025)) {
                                        return false;
                                    }
                                    var73 += var20;
                                    var78 += class38.field394;
                                    var63 += var24;
                                    var75 += var21;
                                }
                            }
                            if (!class365.method2091((var73 >> 12) - 1, var23, var78, 0, var63, (byte) -126, (var74 >> 12) + 1, class648.field9025)) {
                                return false;
                            }
                            var73 += var20;
                            var74 += var19;
                            var78 += class38.field394;
                            var63 += var24;
                        }
                    } else {
                        int var79 = arg4 - arg5;
                        int var80 = arg5 - arg7;
                        int var81 = class38.field394 * arg7;
                        while (true) {
                            var80--;
                            if (var80 < 0) {
                                while (true) {
                                    var79--;
                                    if (var79 < 0) {
                                        return true;
                                    }
                                    if (!class365.method2091((var75 >> 12) - 1, var23, var81, 0, var63, (byte) -95, (var73 >> 12) + 1, class648.field9025)) {
                                        return false;
                                    }
                                    var75 += var21;
                                    var63 += var24;
                                    var73 += var20;
                                    var81 += class38.field394;
                                }
                            }
                            if (!class365.method2091((var74 >> 12) - 1, var23, var81, 0, var63, (byte) -87, (var73 >> 12) + 1, class648.field9025)) {
                                return false;
                            }
                            var74 += var19;
                            var63 += var24;
                            var81 += class38.field394;
                            var73 += var20;
                        }
                    }
                }
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(I)[Ljava/lang/String;")
    public final String[] method903(int arg0) {
        field1885++;
        String[] var2 = new String[this.field1881 + 1];
        class373.method2192(this.field1878, 0, var2, 0, this.field1881 + 1);
        if (arg0 != 20780) {
            this.method901(11, 74);
        }
        return var2;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public final void method904(String arg0, int arg1) {
        field1877++;
        this.method905(arg0, this.field1881 + 1, arg1 ^ 0x1);
        if (arg1 != 0) {
            this.method905(null, -34, -116);
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Ljava/lang/String;II)V")
    private final void method905(String arg0, int arg1, int arg2) {
        if (arg1 > this.field1881) {
            this.field1881 = arg1;
        }
        if (arg2 != 1) {
            return;
        }
        field1888++;
        if (arg1 >= this.field1878.length) {
            this.method901(104, arg1);
        }
        this.field1878[arg1] = arg0;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIIIIII)V")
    public static final void method906(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class122.field1604 <= (arg2 - arg4) && class165.field2070 >= arg2 + arg4 && (arg0 - arg4) >= class759.field10576 && class29.field238 >= (arg0 + arg4)) {
            class289.method1728(-119, arg1, arg4, arg2, arg3, arg5, arg0);
        } else {
            class731.method4098(arg4, arg3, arg1, (byte) 93, arg0, arg2, arg5);
        }
        field1890++;
        if (arg6 != 1333849452) {
            method899(-70);
        }
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(IZ)V")
    public class146(int arg0, boolean arg1) {
        this.field1883 = arg0;
        this.field1886 = arg1;
    }
}
