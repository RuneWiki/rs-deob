import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class410 extends class333 {

    @OriginalMember(owner = "client!bn", name = "m", descriptor = "[B")
    public byte[] field5472;

    @OriginalMember(owner = "client!bn", name = "w", descriptor = "[B")
    public byte[] field5482;

    @OriginalMember(owner = "client!bn", name = "o", descriptor = "[S")
    public short[] field5474;

    @OriginalMember(owner = "client!bn", name = "r", descriptor = "[Lug;")
    public class450[] field5477;

    @OriginalMember(owner = "client!bn", name = "p", descriptor = "[Lrj;")
    public class646[] field5475;

    @OriginalMember(owner = "client!bn", name = "v", descriptor = "[B")
    public byte[] field5481;

    @OriginalMember(owner = "client!bn", name = "t", descriptor = "[I")
    private int[] field5479;

    @OriginalMember(owner = "client!bn", name = "n", descriptor = "I")
    public int field5473;

    @OriginalMember(owner = "client!bn", name = "k", descriptor = "Lht;")
    public static class607 field5470 = new class607("", 11);

    @OriginalMember(owner = "client!bn", name = "l", descriptor = "I")
    public static int field5471;

    @OriginalMember(owner = "client!bn", name = "q", descriptor = "I")
    public static int field5476;

    @OriginalMember(owner = "client!bn", name = "s", descriptor = "I")
    public static int field5478;

    @OriginalMember(owner = "client!bn", name = "u", descriptor = "I")
    public static int field5480;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)V")
    public final void method2293(int arg0) {
        this.field5479 = null;
        if (arg0 == 128) {
            field5476++;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIIIIIIIII)Z")
    public static final boolean method2294(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field5480++;
        if (arg5 > 2000 || arg6 > 2000 || arg7 > 2000 || arg9 > 2000 || arg4 > 2000 || arg1 > 2000) {
            return false;
        } else if (arg5 >= -2000 && arg6 >= -2000 && arg7 >= -2000 && arg9 >= -2000 && arg4 >= -2000 && arg1 >= -2000) {
            if (class371.field5067 == 2) {
                int var10 = arg9 + (class148.field1637 * arg5);
                if (var10 >= 0 && var10 < class560.field7990.length && ((arg0 << 8) - 15360) < class560.field7990[var10]) {
                    return false;
                }
                int var11 = class148.field1637 * arg6 + arg4;
                if (var11 >= 0 && var11 < class560.field7990.length && class560.field7990[var11] > (arg3 << 8) - 15360) {
                    return false;
                }
                int var12 = class148.field1637 * arg7 + arg1;
                if (var12 >= 0 && class560.field7990.length > var12 && (arg8 << 8) - 15360 < class560.field7990[var12]) {
                    return false;
                }
            }
            int var13 = arg4 - arg9;
            int var14 = arg6 - arg5;
            int var15 = arg1 - arg9;
            int var16 = arg7 - arg5;
            int var17 = arg3 - arg0;
            int var18 = arg8 - arg0;
            if (arg5 < arg6 && arg7 > arg7) {
                arg5--;
                if (arg7 < arg6) {
                    arg6++;
                } else {
                    arg7++;
                }
            } else if (arg7 <= arg6) {
                arg7--;
                if (arg6 >= arg5) {
                    arg6++;
                } else {
                    arg5++;
                }
            } else {
                if (arg5 > arg7) {
                    arg5++;
                } else {
                    arg7++;
                }
                arg6--;
            }
            int var19 = 0;
            if (arg5 != arg6) {
                var19 = (arg4 - arg9 << 12) / (arg6 - arg5);
            }
            int var20 = 0;
            if (arg6 != arg7) {
                var20 = (arg1 - arg4 << 12) / (arg7 - arg6);
            }
            int var21 = 0;
            if (arg2 < 28) {
                method2297(-86, -30, -38);
            }
            if (arg5 != arg7) {
                var21 = (arg9 - arg1 << 12) / (arg5 - arg7);
            }
            int var22 = var13 * var16 - (var14 * var15);
            if (var22 == 0) {
                return false;
            }
            int var23 = (var16 * var17 - (var14 * var18) << 8) / var22;
            int var24 = (var13 * var18 - (var15 * var17) << 8) / var22;
            if (arg5 <= arg6 && arg7 >= arg5) {
                if (class303.field3755 <= arg5) {
                    return true;
                }
                int var25 = (arg0 << 8) + var23 - (arg9 * var23);
                if (arg6 > class303.field3755) {
                    arg6 = class303.field3755;
                }
                if (class303.field3755 < arg7) {
                    arg7 = class303.field3755;
                }
                if (arg7 <= arg6) {
                    int var26;
                    int var27 = var26 = arg9 << 12;
                    int var28 = arg1 << 12;
                    if (arg5 < 0) {
                        var26 -= arg5 * var19;
                        var25 -= arg5 * var24;
                        var27 -= arg5 * var21;
                        arg5 = 0;
                    }
                    if (arg7 < 0) {
                        var28 -= arg7 * var20;
                        arg7 = 0;
                    }
                    if (arg5 != arg7 && var21 < var19 || arg5 == arg7 && var19 < var20) {
                        int var29 = arg6 - arg7;
                        int var30 = arg7 - arg5;
                        int var31 = class148.field1637 * arg5;
                        while (true) {
                            var30--;
                            if (var30 < 0) {
                                while (true) {
                                    var29--;
                                    if (var29 < 0) {
                                        return true;
                                    }
                                    if (!class31.method162(class560.field7990, (var26 >> 12) + 1, (byte) 125, var25, 0, var31, var23, (var28 >> 12) - 1)) {
                                        return false;
                                    }
                                    var28 += var20;
                                    var25 += var24;
                                    var26 += var19;
                                    var31 += class148.field1637;
                                }
                            }
                            if (!class31.method162(class560.field7990, (var26 >> 12) + 1, (byte) 125, var25, 0, var31, var23, (var27 >> 12) - 1)) {
                                return false;
                            }
                            var25 += var24;
                            var26 += var19;
                            var31 += class148.field1637;
                            var27 += var21;
                        }
                    } else {
                        int var32 = arg6 - arg7;
                        int var33 = arg7 - arg5;
                        int var34 = class148.field1637 * arg5;
                        while (true) {
                            var33--;
                            if (var33 < 0) {
                                while (true) {
                                    var32--;
                                    if (var32 < 0) {
                                        return true;
                                    }
                                    if (!class31.method162(class560.field7990, (var28 >> 12) + 1, (byte) 125, var25, 0, var34, var23, (var26 >> 12) - 1)) {
                                        return false;
                                    }
                                    var34 += class148.field1637;
                                    var26 += var19;
                                    var28 += var20;
                                    var25 += var24;
                                }
                            }
                            if (!class31.method162(class560.field7990, (var27 >> 12) + 1, (byte) 125, var25, 0, var34, var23, (var26 >> 12) - 1)) {
                                return false;
                            }
                            var34 += class148.field1637;
                            var27 += var21;
                            var26 += var19;
                            var25 += var24;
                        }
                    }
                } else {
                    int var35;
                    int var36 = var35 = arg9 << 12;
                    if (arg5 < 0) {
                        var36 -= arg5 * var21;
                        var35 -= arg5 * var19;
                        var25 -= arg5 * var24;
                        arg5 = 0;
                    }
                    int var37 = arg4 << 12;
                    if (arg6 < 0) {
                        var37 -= arg6 * var20;
                        arg6 = 0;
                    }
                    if ((arg5 == arg6 || var21 >= var19) && (arg5 != arg6 || var21 <= var20)) {
                        int var41 = arg7 - arg6;
                        int var42 = arg6 - arg5;
                        int var43 = class148.field1637 * arg5;
                        while (true) {
                            var42--;
                            if (var42 < 0) {
                                while (true) {
                                    var41--;
                                    if (var41 < 0) {
                                        return true;
                                    }
                                    if (!class31.method162(class560.field7990, (var36 >> 12) + 1, (byte) 125, var25, 0, var43, var23, (var37 >> 12) - 1)) {
                                        return false;
                                    }
                                    var25 += var24;
                                    var36 += var21;
                                    var37 += var20;
                                    var43 += class148.field1637;
                                }
                            }
                            if (!class31.method162(class560.field7990, (var36 >> 12) + 1, (byte) 125, var25, 0, var43, var23, (var35 >> 12) - 1)) {
                                return false;
                            }
                            var25 += var24;
                            var36 += var21;
                            var35 += var19;
                            var43 += class148.field1637;
                        }
                    } else {
                        int var38 = arg7 - arg6;
                        int var39 = arg6 - arg5;
                        int var40 = class148.field1637 * arg5;
                        while (true) {
                            var39--;
                            if (var39 < 0) {
                                while (true) {
                                    var38--;
                                    if (var38 < 0) {
                                        return true;
                                    }
                                    if (!class31.method162(class560.field7990, (var37 >> 12) + 1, (byte) 125, var25, 0, var40, var23, (var36 >> 12) - 1)) {
                                        return false;
                                    }
                                    var36 += var21;
                                    var40 += class148.field1637;
                                    var37 += var20;
                                    var25 += var24;
                                }
                            }
                            if (!class31.method162(class560.field7990, (var35 >> 12) + 1, (byte) 125, var25, 0, var40, var23, (var36 >> 12) - 1)) {
                                return false;
                            }
                            var40 += class148.field1637;
                            var25 += var24;
                            var35 += var19;
                            var36 += var21;
                        }
                    }
                }
            } else if (arg7 >= arg6) {
                if (class303.field3755 <= arg6) {
                    return true;
                }
                int var44 = (arg3 << 8) + var23 - (arg4 * var23);
                if (arg7 > class303.field3755) {
                    arg7 = class303.field3755;
                }
                if (class303.field3755 < arg5) {
                    arg5 = class303.field3755;
                }
                if (arg5 <= arg7) {
                    int var45;
                    int var46 = var45 = arg4 << 12;
                    if (arg6 < 0) {
                        var45 -= arg6 * var20;
                        var44 -= arg6 * var24;
                        var46 -= arg6 * var19;
                        arg6 = 0;
                    }
                    int var47 = arg9 << 12;
                    if (arg5 < 0) {
                        var47 -= arg5 * var21;
                        arg5 = 0;
                    }
                    if (var19 < var20) {
                        int var48 = arg7 - arg5;
                        int var49 = arg5 - arg6;
                        int var50 = class148.field1637 * arg6;
                        while (true) {
                            var49--;
                            if (var49 < 0) {
                                while (true) {
                                    var48--;
                                    if (var48 < 0) {
                                        return true;
                                    }
                                    if (!class31.method162(class560.field7990, (var45 >> 12) + 1, (byte) 125, var44, 0, var50, var23, (var47 >> 12) - 1)) {
                                        return false;
                                    }
                                    var44 += var24;
                                    var47 += var21;
                                    var45 += var20;
                                    var50 += class148.field1637;
                                }
                            }
                            if (!class31.method162(class560.field7990, (var45 >> 12) + 1, (byte) 125, var44, 0, var50, var23, (var46 >> 12) - 1)) {
                                return false;
                            }
                            var44 += var24;
                            var46 += var19;
                            var45 += var20;
                            var50 += class148.field1637;
                        }
                    } else {
                        int var51 = arg7 - arg5;
                        int var52 = arg5 - arg6;
                        int var53 = class148.field1637 * arg6;
                        while (true) {
                            var52--;
                            if (var52 < 0) {
                                while (true) {
                                    var51--;
                                    if (var51 < 0) {
                                        return true;
                                    }
                                    if (!class31.method162(class560.field7990, (var47 >> 12) + 1, (byte) 125, var44, 0, var53, var23, (var45 >> 12) - 1)) {
                                        return false;
                                    }
                                    var44 += var24;
                                    var47 += var21;
                                    var53 += class148.field1637;
                                    var45 += var20;
                                }
                            }
                            if (!class31.method162(class560.field7990, (var46 >> 12) + 1, (byte) 125, var44, 0, var53, var23, (var45 >> 12) - 1)) {
                                return false;
                            }
                            var44 += var24;
                            var53 += class148.field1637;
                            var45 += var20;
                            var46 += var19;
                        }
                    }
                } else {
                    int var54;
                    int var55 = var54 = arg4 << 12;
                    int var56 = arg1 << 12;
                    if (arg6 < 0) {
                        var55 -= arg6 * var19;
                        var44 -= arg6 * var24;
                        var54 -= arg6 * var20;
                        arg6 = 0;
                    }
                    if (arg7 < 0) {
                        var56 -= arg7 * var21;
                        arg7 = 0;
                    }
                    if (arg6 != arg7 && var20 > var19 || arg6 == arg7 && var19 > var21) {
                        int var57 = arg5 - arg7;
                        int var58 = arg7 - arg6;
                        int var59 = class148.field1637 * arg6;
                        while (true) {
                            var58--;
                            if (var58 < 0) {
                                while (true) {
                                    var57--;
                                    if (var57 < 0) {
                                        return true;
                                    }
                                    if (!class31.method162(class560.field7990, (var56 >> 12) + 1, (byte) 125, var44, 0, var59, var23, (var55 >> 12) - 1)) {
                                        return false;
                                    }
                                    var44 += var24;
                                    var56 += var21;
                                    var59 += class148.field1637;
                                    var55 += var19;
                                }
                            }
                            if (!class31.method162(class560.field7990, (var54 >> 12) + 1, (byte) 125, var44, 0, var59, var23, (var55 >> 12) - 1)) {
                                return false;
                            }
                            var44 += var24;
                            var54 += var20;
                            var55 += var19;
                            var59 += class148.field1637;
                        }
                    } else {
                        int var60 = arg5 - arg7;
                        int var61 = arg7 - arg6;
                        int var62 = class148.field1637 * arg6;
                        while (true) {
                            var61--;
                            if (var61 < 0) {
                                while (true) {
                                    var60--;
                                    if (var60 < 0) {
                                        return true;
                                    }
                                    if (!class31.method162(class560.field7990, (var55 >> 12) + 1, (byte) 125, var44, 0, var62, var23, (var56 >> 12) - 1)) {
                                        return false;
                                    }
                                    var55 += var19;
                                    var56 += var21;
                                    var62 += class148.field1637;
                                    var44 += var24;
                                }
                            }
                            if (!class31.method162(class560.field7990, (var55 >> 12) + 1, (byte) 125, var44, 0, var62, var23, (var54 >> 12) - 1)) {
                                return false;
                            }
                            var54 += var20;
                            var55 += var19;
                            var44 += var24;
                            var62 += class148.field1637;
                        }
                    }
                }
            } else if (arg7 >= class303.field3755) {
                return true;
            } else {
                int var63 = (arg8 << 8) + var23 - (arg1 * var23);
                if (arg5 > class303.field3755) {
                    arg5 = class303.field3755;
                }
                if (class303.field3755 < arg6) {
                    arg6 = class303.field3755;
                }
                if (arg5 >= arg6) {
                    int var64;
                    int var65 = var64 = arg1 << 12;
                    int var66 = arg4 << 12;
                    if (arg7 < 0) {
                        var63 -= arg7 * var24;
                        var65 -= arg7 * var20;
                        var64 -= arg7 * var21;
                        arg7 = 0;
                    }
                    if (arg6 < 0) {
                        var66 -= arg6 * var19;
                        arg6 = 0;
                    }
                    if (var20 >= var21) {
                        int var67 = arg5 - arg6;
                        int var68 = arg6 - arg7;
                        int var69 = class148.field1637 * arg7;
                        while (true) {
                            var68--;
                            if (var68 < 0) {
                                while (true) {
                                    var67--;
                                    if (var67 < 0) {
                                        return true;
                                    }
                                    if (!class31.method162(class560.field7990, (var66 >> 12) + 1, (byte) 125, var63, 0, var69, var23, (var64 >> 12) - 1)) {
                                        return false;
                                    }
                                    var66 += var19;
                                    var64 += var21;
                                    var63 += var24;
                                    var69 += class148.field1637;
                                }
                            }
                            if (!class31.method162(class560.field7990, (var65 >> 12) + 1, (byte) 125, var63, 0, var69, var23, (var64 >> 12) - 1)) {
                                return false;
                            }
                            var69 += class148.field1637;
                            var65 += var20;
                            var64 += var21;
                            var63 += var24;
                        }
                    } else {
                        int var70 = arg5 - arg6;
                        int var71 = arg6 - arg7;
                        int var72 = class148.field1637 * arg7;
                        while (true) {
                            var71--;
                            if (var71 < 0) {
                                while (true) {
                                    var70--;
                                    if (var70 < 0) {
                                        return true;
                                    }
                                    if (!class31.method162(class560.field7990, (var64 >> 12) + 1, (byte) 125, var63, 0, var72, var23, (var66 >> 12) - 1)) {
                                        return false;
                                    }
                                    var64 += var21;
                                    var63 += var24;
                                    var72 += class148.field1637;
                                    var66 += var19;
                                }
                            }
                            if (!class31.method162(class560.field7990, (var64 >> 12) + 1, (byte) 125, var63, 0, var72, var23, (var65 >> 12) - 1)) {
                                return false;
                            }
                            var72 += class148.field1637;
                            var64 += var21;
                            var65 += var20;
                            var63 += var24;
                        }
                    }
                } else {
                    int var73;
                    int var74 = var73 = arg1 << 12;
                    int var75 = arg9 << 12;
                    if (arg7 < 0) {
                        var74 -= arg7 * var20;
                        var73 -= arg7 * var21;
                        var63 -= arg7 * var24;
                        arg7 = 0;
                    }
                    if (arg5 < 0) {
                        var75 -= arg5 * var19;
                        arg5 = 0;
                    }
                    if (var20 >= var21) {
                        int var76 = arg6 - arg5;
                        int var77 = arg5 - arg7;
                        int var78 = class148.field1637 * arg7;
                        while (true) {
                            var77--;
                            if (var77 < 0) {
                                while (true) {
                                    var76--;
                                    if (var76 < 0) {
                                        return true;
                                    }
                                    if (!class31.method162(class560.field7990, (var74 >> 12) + 1, (byte) 125, var63, 0, var78, var23, (var75 >> 12) - 1)) {
                                        return false;
                                    }
                                    var75 += var19;
                                    var78 += class148.field1637;
                                    var74 += var20;
                                    var63 += var24;
                                }
                            }
                            if (!class31.method162(class560.field7990, (var74 >> 12) + 1, (byte) 125, var63, 0, var78, var23, (var73 >> 12) - 1)) {
                                return false;
                            }
                            var78 += class148.field1637;
                            var74 += var20;
                            var63 += var24;
                            var73 += var21;
                        }
                    } else {
                        int var79 = arg6 - arg5;
                        int var80 = arg5 - arg7;
                        int var81 = class148.field1637 * arg7;
                        while (true) {
                            var80--;
                            if (var80 < 0) {
                                while (true) {
                                    var79--;
                                    if (var79 < 0) {
                                        return true;
                                    }
                                    if (!class31.method162(class560.field7990, (var75 >> 12) + 1, (byte) 125, var63, 0, var81, var23, (var74 >> 12) - 1)) {
                                        return false;
                                    }
                                    var75 += var19;
                                    var74 += var20;
                                    var63 += var24;
                                    var81 += class148.field1637;
                                }
                            }
                            if (!class31.method162(class560.field7990, (var73 >> 12) + 1, (byte) 125, var63, 0, var81, var23, (var74 >> 12) - 1)) {
                                return false;
                            }
                            var74 += var20;
                            var81 += class148.field1637;
                            var63 += var24;
                            var73 += var21;
                        }
                    }
                }
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "([BLjea;[IB)Z")
    public final boolean method2295(byte[] arg0, class231 arg1, int[] arg2, byte arg3) {
        field5478++;
        boolean var5 = true;
        int var6 = 0;
        if (arg3 <= 30) {
            this.field5481 = null;
        }
        class450 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg0 == null || arg0[var8] != 0) {
                int var9 = this.field5479[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg1.method1389(var9 >> 2, true, arg2);
                        } else {
                            var7 = arg1.method1384(63, arg2, var9 >> 2);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field5477[var8] = var7;
                        this.field5479[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(B)V")
    public static void method2296(byte arg0) {
        field5470 = null;
        if (arg0 < 49) {
            method2296((byte) 1);
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(III)I")
    public static final int method2297(int arg0, int arg1, int arg2) {
        field5471++;
        int var3 = arg1 >>> 24;
        if (arg0 != -2045314824) {
            method2297(48, 96, -102);
        }
        int var4 = ((arg1 & 0xFF00) * var3 & 0xFF0000 | (arg1 & 0xFF00FF) * var3 & 0xFF00FF00) >>> 8;
        int var5 = 255 - var3;
        return (((arg2 & 0xFF00FF) * var5 & 0xFF00FF00 | (arg2 & 0xFF00) * var5 & 0xFF0000) >>> 8) + var4;
    }

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "()V")
    public class410() {
    }

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "([B)V")
    public class410(byte[] arg0) {
        this.field5472 = new byte[128];
        this.field5482 = new byte[128];
        this.field5474 = new short[128];
        this.field5477 = new class450[128];
        this.field5475 = new class646[128];
        this.field5481 = new byte[128];
        this.field5479 = new int[128];
        class115 var2 = new class115(arg0);
        int var3;
        for (var3 = 0; var2.field1269[var2.field1218 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method657(false);
        }
        var2.field1218++;
        var3++;
        int var6 = var2.field1218;
        var2.field1218 += var3;
        int var7;
        for (var7 = 0; var2.field1269[var2.field1218 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method657(false);
        }
        var7++;
        var2.field1218++;
        int var10 = var2.field1218;
        var2.field1218 += var7;
        int var11;
        for (var11 = 0; var2.field1269[var2.field1218 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method657(false);
        }
        var2.field1218++;
        var11++;
        byte[] var14 = new byte[var11];
        int var16;
        if (var11 > 1) {
            var14[1] = 1;
            int var15 = 1;
            var16 = 2;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var2.method620((byte) -126);
                if (var18 == 0) {
                    var15 = var16++;
                } else {
                    if (var18 <= var15) {
                        var18--;
                    }
                    var15 = var18;
                }
                var14[var17] = (byte) var15;
            }
        } else {
            var16 = var11;
        }
        class646[] var19 = new class646[var16];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class646 var103 = var19[var20] = new class646();
            int var104 = var2.method620((byte) -13);
            if (var104 > 0) {
                var103.field9122 = new byte[var104 * 2];
            }
            int var105 = var2.method620((byte) -27);
            if (var105 > 0) {
                var103.field9115 = new byte[var105 * 2 + 2];
                var103.field9115[1] = 64;
            }
        }
        int var21 = var2.method620((byte) -40);
        byte[] var22 = var21 > 0 ? new byte[var21 * 2] : null;
        int var23 = var2.method620((byte) 15);
        byte[] var24 = var23 <= 0 ? null : new byte[var23 * 2];
        int var25;
        for (var25 = 0; var2.field1269[var2.field1218 + var25] != 0; var25++) {
        }
        byte[] var26 = new byte[var25];
        for (int var27 = 0; var27 < var25; var27++) {
            var26[var27] = var2.method657(false);
        }
        var2.field1218++;
        var25++;
        int var28 = 0;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var2.method620((byte) -127);
            this.field5474[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var2.method620((byte) 18);
            this.field5474[var31] = (short) (this.field5474[var31] + (var30 << 8));
        }
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        for (int var35 = 0; var35 < 128; var35++) {
            if (var32 == 0) {
                if (var26.length <= var33) {
                    var32 = -1;
                } else {
                    var32 = var26[var33++];
                }
                var34 = var2.method652((byte) 57);
            }
            this.field5474[var35] = (short) (this.field5474[var35] + class105.method572(var34 - 1 << 14, 32768));
            var32--;
            this.field5479[var35] = var34;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field5479[var39] != 0) {
                if (var36 == 0) {
                    var38 = var2.field1269[var6++] - 1;
                    if (var4.length <= var37) {
                        var36 = -1;
                    } else {
                        var36 = var4[var37++];
                    }
                }
                this.field5472[var39] = (byte) var38;
                var36--;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field5479[var43] != 0) {
                if (var41 == 0) {
                    var42 = var2.field1269[var10++] + 16 << 2;
                    if (var8.length > var40) {
                        var41 = var8[var40++];
                    } else {
                        var41 = -1;
                    }
                }
                var41--;
                this.field5481[var43] = (byte) var42;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class646 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field5479[var47] != 0) {
                if (var45 == 0) {
                    var46 = var19[var14[var44]];
                    if (var44 < var12.length) {
                        var45 = var12[var44++];
                    } else {
                        var45 = -1;
                    }
                }
                this.field5475[var47] = var46;
                var45--;
            }
        }
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        for (int var51 = 0; var51 < 128; var51++) {
            if (var48 == 0) {
                if (var49 >= var26.length) {
                    var48 = -1;
                } else {
                    var48 = var26[var49++];
                }
                if (this.field5479[var51] > 0) {
                    var50 = var2.method620((byte) -126) + 1;
                }
            }
            this.field5482[var51] = (byte) var50;
            var48--;
        }
        this.field5473 = var2.method620((byte) -5) + 1;
        for (int var52 = 0; var52 < var16; var52++) {
            class646 var100 = var19[var52];
            if (var100.field9122 != null) {
                for (int var101 = 1; var101 < var100.field9122.length; var101 += 2) {
                    var100.field9122[var101] = var2.method657(false);
                }
            }
            if (var100.field9115 != null) {
                for (int var102 = 3; var102 < (var100.field9115.length - 2); var102 += 2) {
                    var100.field9115[var102] = var2.method657(false);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var2.method657(false);
            }
        }
        if (var24 != null) {
            for (int var54 = 1; var54 < var24.length; var54 += 2) {
                var24[var54] = var2.method657(false);
            }
        }
        for (int var55 = 0; var55 < var16; var55++) {
            class646 var97 = var19[var55];
            if (var97.field9115 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field9115.length; var99 += 2) {
                    var98 = var98 + var2.method620((byte) 8) + 1;
                    var97.field9115[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var16; var56++) {
            class646 var94 = var19[var56];
            if (var94.field9122 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field9122.length; var96 += 2) {
                    var95 = var2.method620((byte) 86) + var95 + 1;
                    var94.field9122[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var2.method620((byte) -128);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 = var57 + var2.method620((byte) 99) + 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[0];
            byte var60 = var22[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field5482[var61] = (byte) (this.field5482[var61] * var60 + 32 >> 6);
            }
            int var62 = 2;
            while (var22.length > var62) {
                byte var65 = var22[var62];
                byte var66 = var22[var62 + 1];
                int var67 = (var65 - var59) / 2 + (var65 - var59) * var60;
                for (int var68 = var59; var68 < var65; var68++) {
                    int var69 = class376.method2180((byte) 56, var65 - var59, var67);
                    var67 += var66 - var60;
                    this.field5482[var68] = (byte) (this.field5482[var68] * var69 + 32 >> 6);
                }
                var62 += 2;
                var60 = var66;
                var59 = var65;
            }
            for (int var63 = var59; var63 < 128; var63++) {
                this.field5482[var63] = (byte) (this.field5482[var63] * var60 + 32 >> 6);
            }
            Object var64 = null;
        }
        if (var24 != null) {
            int var70 = var2.method620((byte) -19);
            var24[0] = (byte) var70;
            for (int var71 = 2; var71 < var24.length; var71 += 2) {
                var70 = var70 + var2.method620((byte) -126) + 1;
                var24[var71] = (byte) var70;
            }
            byte var72 = var24[0];
            int var73 = var24[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field5481[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field5481[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var75 < var24.length) {
                byte var79 = var24[var75];
                int var80 = var24[var75 + 1] << 1;
                int var81 = (var79 - var72) / 2 + (var79 - var72) * var73;
                for (int var82 = var72; var82 < var79; var82++) {
                    int var83 = class376.method2180((byte) 41, var79 - var72, var81);
                    int var84 = (this.field5481[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    var81 += var80 - var73;
                    this.field5481[var82] = (byte) var84;
                }
                var75 += 2;
                var73 = var80;
                var72 = var79;
            }
            for (int var76 = var72; var76 < 128; var76++) {
                int var78 = (this.field5481[var76] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field5481[var76] = (byte) var78;
            }
            Object var77 = null;
        }
        for (int var86 = 0; var86 < var16; var86++) {
            var19[var86].field9117 = var2.method620((byte) -127);
        }
        for (int var87 = 0; var87 < var16; var87++) {
            class646 var93 = var19[var87];
            if (var93.field9122 != null) {
                var93.field9110 = var2.method620((byte) -126);
            }
            if (var93.field9115 != null) {
                var93.field9113 = var2.method620((byte) -126);
            }
            if (var93.field9117 > 0) {
                var93.field9114 = var2.method620((byte) -126);
            }
        }
        for (int var88 = 0; var88 < var16; var88++) {
            var19[var88].field9112 = var2.method620((byte) -127);
        }
        for (int var89 = 0; var89 < var16; var89++) {
            class646 var92 = var19[var89];
            if (var92.field9112 > 0) {
                var92.field9109 = var2.method620((byte) -128);
            }
        }
        for (int var90 = 0; var90 < var16; var90++) {
            class646 var91 = var19[var90];
            if (var91.field9109 > 0) {
                var91.field9116 = var2.method620((byte) -126);
            }
        }
    }
}
