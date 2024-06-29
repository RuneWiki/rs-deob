import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public abstract class class486 {

    @OriginalMember(owner = "client!sj", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7357 = new String[] { method3696(method3695("\u000eTj6gU")), method3696(method3695("\u0006\u0010jPX")), method3696(method3695("\u000eTj9gU")), method3696(method3695("\u0013K(\u0012")), method3696(method3695("\u000eTj;gU")), method3696(method3695("\u000eTj8gU")) };

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "I")
    public static int field7352;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "I")
    public static int field7355;

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "I")
    public static int field7356;

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "Lhk;")
    public static class107 field7354;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "[Lhk;")
    public static class107[] field7353;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIIBIIIII)Z", line = 19)
    public static final boolean method3691(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        try {
            field7355++;
            if (arg1 > 2000 || arg0 > 2000 || arg9 > 2000 || arg6 > 2000 || arg2 > 2000 || arg3 > 2000) {
                return false;
            } else if (arg1 >= -2000 && arg0 >= -2000 && arg9 >= -2000 && arg6 >= -2000 && arg2 >= -2000 && arg3 >= -2000) {
                if (class353.field5694 == 2) {
                    int var10 = class115.field1680 * arg1 + arg6;
                    if (var10 >= 0 && var10 < class430.field6766.length && (arg8 << 8) - 38400 < class430.field6766[var10]) {
                        return false;
                    }
                    int var11 = class115.field1680 * arg0 + arg2;
                    if (var11 >= 0 && class430.field6766.length > var11 && (arg5 << 8) - 38400 < class430.field6766[var11]) {
                        return false;
                    }
                    int var12 = class115.field1680 * arg9 + arg3;
                    if (var12 >= 0 && var12 < class430.field6766.length && ((arg7 << 8) - 38400) < class430.field6766[var12]) {
                        return false;
                    }
                }
                int var13 = 124 % ((arg4 + 50) / 50);
                int var14 = arg2 - arg6;
                int var15 = arg0 - arg1;
                int var16 = arg3 - arg6;
                int var17 = arg9 - arg1;
                int var18 = arg5 - arg8;
                int var19 = arg7 - arg8;
                if (arg1 < arg0 && arg9 > arg9) {
                    arg1--;
                    if (arg0 > arg9) {
                        arg0++;
                    } else {
                        arg9++;
                    }
                } else if (arg0 < arg9) {
                    arg0--;
                    if (arg9 < arg1) {
                        arg1++;
                    } else {
                        arg9++;
                    }
                } else {
                    if (arg1 > arg0) {
                        arg1++;
                    } else {
                        arg0++;
                    }
                    arg9--;
                }
                int var20 = 0;
                if (arg0 != arg1) {
                    var20 = (arg2 - arg6 << 12) / (arg0 - arg1);
                }
                int var21 = 0;
                if (arg0 != arg9) {
                    var21 = (arg3 - arg2 << 12) / (arg9 - arg0);
                }
                int var22 = 0;
                if (arg1 != arg9) {
                    var22 = (arg6 - arg3 << 12) / (arg1 - arg9);
                }
                int var23 = var14 * var17 - (var15 * var16);
                if (var23 == 0) {
                    return false;
                }
                int var24 = (var17 * var18 - var15 * var19 << 8) / var23;
                int var25 = (var14 * var19 - (var16 * var18) << 8) / var23;
                if (arg0 >= arg1 && arg9 >= arg1) {
                    if (class438.field6842 <= arg1) {
                        return true;
                    }
                    arg8 = (arg8 << 8) + var24 - (arg6 * var24);
                    if (arg0 > class438.field6842) {
                        arg0 = class438.field6842;
                    }
                    if (arg9 > class438.field6842) {
                        arg9 = class438.field6842;
                    }
                    if (arg9 > arg0) {
                        arg3 = arg6 <<= 0xC;
                        if (arg1 < 0) {
                            arg8 -= arg1 * var25;
                            arg3 -= arg1 * var22;
                            arg6 -= arg1 * var20;
                            arg1 = 0;
                        }
                        arg2 <<= 0xC;
                        if (arg0 < 0) {
                            arg2 -= arg0 * var21;
                            arg0 = 0;
                        }
                        if (arg0 != arg1 && var20 > var22 || arg0 == arg1 && var21 < var22) {
                            arg9 -= arg0;
                            arg0 -= arg1;
                            arg1 = class115.field1680 * arg1;
                            while (true) {
                                arg0--;
                                if (arg0 < 0) {
                                    while (true) {
                                        arg9--;
                                        if (arg9 < 0) {
                                            return true;
                                        }
                                        if (!class258.method2168(arg8, class430.field6766, 0, var24, (arg3 >> 12) - 1, arg1, -2, (arg2 >> 12) + 1)) {
                                            return false;
                                        }
                                        arg1 += class115.field1680;
                                        arg3 += var22;
                                        arg8 += var25;
                                        arg2 += var21;
                                    }
                                }
                                if (!class258.method2168(arg8, class430.field6766, 0, var24, (arg3 >> 12) - 1, arg1, -2, (arg6 >> 12) + 1)) {
                                    return false;
                                }
                                arg1 += class115.field1680;
                                arg6 += var20;
                                arg3 += var22;
                                arg8 += var25;
                            }
                        } else {
                            arg9 -= arg0;
                            arg0 -= arg1;
                            arg1 = class115.field1680 * arg1;
                            while (true) {
                                arg0--;
                                if (arg0 < 0) {
                                    while (true) {
                                        arg9--;
                                        if (arg9 < 0) {
                                            return true;
                                        }
                                        if (!class258.method2168(arg8, class430.field6766, 0, var24, (arg2 >> 12) - 1, arg1, -2, (arg3 >> 12) + 1)) {
                                            return false;
                                        }
                                        arg3 += var22;
                                        arg8 += var25;
                                        arg1 += class115.field1680;
                                        arg2 += var21;
                                    }
                                }
                                if (!class258.method2168(arg8, class430.field6766, 0, var24, (arg6 >> 12) - 1, arg1, -2, (arg3 >> 12) + 1)) {
                                    return false;
                                }
                                arg1 += class115.field1680;
                                arg3 += var22;
                                arg6 += var20;
                                arg8 += var25;
                            }
                        }
                    } else {
                        arg2 = arg6 <<= 0xC;
                        arg3 <<= 0xC;
                        if (arg1 < 0) {
                            arg6 -= arg1 * var20;
                            arg2 -= arg1 * var22;
                            arg8 -= arg1 * var25;
                            arg1 = 0;
                        }
                        if (arg9 < 0) {
                            arg3 -= arg9 * var21;
                            arg9 = 0;
                        }
                        if (arg1 != arg9 && var20 > var22 || arg1 == arg9 && var20 < var21) {
                            arg0 -= arg9;
                            arg9 -= arg1;
                            arg1 = class115.field1680 * arg1;
                            while (true) {
                                arg9--;
                                if (arg9 < 0) {
                                    while (true) {
                                        arg0--;
                                        if (arg0 < 0) {
                                            return true;
                                        }
                                        if (!class258.method2168(arg8, class430.field6766, 0, var24, (arg3 >> 12) - 1, arg1, -2, (arg6 >> 12) + 1)) {
                                            return false;
                                        }
                                        arg6 += var20;
                                        arg8 += var25;
                                        arg1 += class115.field1680;
                                        arg3 += var21;
                                    }
                                }
                                if (!class258.method2168(arg8, class430.field6766, 0, var24, (arg2 >> 12) - 1, arg1, -2, (arg6 >> 12) + 1)) {
                                    return false;
                                }
                                arg6 += var20;
                                arg2 += var22;
                                arg1 += class115.field1680;
                                arg8 += var25;
                            }
                        } else {
                            arg0 -= arg9;
                            arg9 -= arg1;
                            arg1 = class115.field1680 * arg1;
                            while (true) {
                                arg9--;
                                if (arg9 < 0) {
                                    while (true) {
                                        arg0--;
                                        if (arg0 < 0) {
                                            return true;
                                        }
                                        if (!class258.method2168(arg8, class430.field6766, 0, var24, (arg6 >> 12) - 1, arg1, -2, (arg3 >> 12) + 1)) {
                                            return false;
                                        }
                                        arg3 += var21;
                                        arg8 += var25;
                                        arg1 += class115.field1680;
                                        arg6 += var20;
                                    }
                                }
                                if (!class258.method2168(arg8, class430.field6766, 0, var24, (arg6 >> 12) - 1, arg1, -2, (arg2 >> 12) + 1)) {
                                    return false;
                                }
                                arg6 += var20;
                                arg2 += var22;
                                arg8 += var25;
                                arg1 += class115.field1680;
                            }
                        }
                    }
                } else if (arg0 > arg9) {
                    if (arg9 >= class438.field6842) {
                        return true;
                    }
                    if (class438.field6842 < arg0) {
                        arg0 = class438.field6842;
                    }
                    if (class438.field6842 < arg1) {
                        arg1 = class438.field6842;
                    }
                    arg7 = (arg7 << 8) + var24 - (arg3 * var24);
                    if (arg1 < arg0) {
                        arg2 = arg3 <<= 0xC;
                        if (arg9 < 0) {
                            arg3 -= arg9 * var22;
                            arg2 -= arg9 * var21;
                            arg7 -= arg9 * var25;
                            arg9 = 0;
                        }
                        arg6 <<= 0xC;
                        if (arg1 < 0) {
                            arg6 -= arg1 * var20;
                            arg1 = 0;
                        }
                        if (var22 <= var21) {
                            arg0 -= arg1;
                            arg1 -= arg9;
                            arg9 = class115.field1680 * arg9;
                            while (true) {
                                arg1--;
                                if (arg1 < 0) {
                                    while (true) {
                                        arg0--;
                                        if (arg0 < 0) {
                                            return true;
                                        }
                                        if (!class258.method2168(arg7, class430.field6766, 0, var24, (arg6 >> 12) - 1, arg9, -2, (arg2 >> 12) + 1)) {
                                            return false;
                                        }
                                        arg7 += var25;
                                        arg6 += var20;
                                        arg9 += class115.field1680;
                                        arg2 += var21;
                                    }
                                }
                                if (!class258.method2168(arg7, class430.field6766, 0, var24, (arg3 >> 12) - 1, arg9, -2, (arg2 >> 12) + 1)) {
                                    return false;
                                }
                                arg7 += var25;
                                arg9 += class115.field1680;
                                arg2 += var21;
                                arg3 += var22;
                            }
                        } else {
                            arg0 -= arg1;
                            arg1 -= arg9;
                            arg9 = class115.field1680 * arg9;
                            while (true) {
                                arg1--;
                                if (arg1 < 0) {
                                    while (true) {
                                        arg0--;
                                        if (arg0 < 0) {
                                            return true;
                                        }
                                        if (!class258.method2168(arg7, class430.field6766, 0, var24, (arg2 >> 12) - 1, arg9, -2, (arg6 >> 12) + 1)) {
                                            return false;
                                        }
                                        arg7 += var25;
                                        arg9 += class115.field1680;
                                        arg2 += var21;
                                        arg6 += var20;
                                    }
                                }
                                if (!class258.method2168(arg7, class430.field6766, 0, var24, (arg2 >> 12) - 1, arg9, -2, (arg3 >> 12) + 1)) {
                                    return false;
                                }
                                arg9 += class115.field1680;
                                arg7 += var25;
                                arg3 += var22;
                                arg2 += var21;
                            }
                        }
                    } else {
                        arg6 = arg3 <<= 0xC;
                        arg2 <<= 0xC;
                        if (arg9 < 0) {
                            arg3 -= arg9 * var22;
                            arg6 -= arg9 * var21;
                            arg7 -= arg9 * var25;
                            arg9 = 0;
                        }
                        if (arg0 < 0) {
                            arg2 -= arg0 * var20;
                            arg0 = 0;
                        }
                        if (var22 <= var21) {
                            arg1 -= arg0;
                            arg0 -= arg9;
                            arg9 = class115.field1680 * arg9;
                            while (true) {
                                arg0--;
                                if (arg0 < 0) {
                                    while (true) {
                                        arg1--;
                                        if (arg1 < 0) {
                                            return true;
                                        }
                                        if (!class258.method2168(arg7, class430.field6766, 0, var24, (arg3 >> 12) - 1, arg9, -2, (arg2 >> 12) + 1)) {
                                            return false;
                                        }
                                        arg3 += var22;
                                        arg7 += var25;
                                        arg2 += var20;
                                        arg9 += class115.field1680;
                                    }
                                }
                                if (!class258.method2168(arg7, class430.field6766, 0, var24, (arg3 >> 12) - 1, arg9, -2, (arg6 >> 12) + 1)) {
                                    return false;
                                }
                                arg9 += class115.field1680;
                                arg3 += var22;
                                arg6 += var21;
                                arg7 += var25;
                            }
                        } else {
                            arg1 -= arg0;
                            arg0 -= arg9;
                            arg9 = class115.field1680 * arg9;
                            while (true) {
                                arg0--;
                                if (arg0 < 0) {
                                    while (true) {
                                        arg1--;
                                        if (arg1 < 0) {
                                            return true;
                                        }
                                        if (!class258.method2168(arg7, class430.field6766, 0, var24, (arg2 >> 12) - 1, arg9, -2, (arg3 >> 12) + 1)) {
                                            return false;
                                        }
                                        arg7 += var25;
                                        arg9 += class115.field1680;
                                        arg2 += var20;
                                        arg3 += var22;
                                    }
                                }
                                if (!class258.method2168(arg7, class430.field6766, 0, var24, (arg6 >> 12) - 1, arg9, -2, (arg3 >> 12) + 1)) {
                                    return false;
                                }
                                arg3 += var22;
                                arg6 += var21;
                                arg9 += class115.field1680;
                                arg7 += var25;
                            }
                        }
                    }
                } else if (arg0 >= class438.field6842) {
                    return true;
                } else {
                    arg5 = (arg5 << 8) + var24 - (arg2 * var24);
                    if (arg9 > class438.field6842) {
                        arg9 = class438.field6842;
                    }
                    if (class438.field6842 < arg1) {
                        arg1 = class438.field6842;
                    }
                    if (arg9 >= arg1) {
                        arg3 = arg2 <<= 0xC;
                        arg6 <<= 0xC;
                        if (arg0 < 0) {
                            arg5 -= arg0 * var25;
                            arg2 -= arg0 * var21;
                            arg3 -= arg0 * var20;
                            arg0 = 0;
                        }
                        if (arg1 < 0) {
                            arg6 -= arg1 * var22;
                            arg1 = 0;
                        }
                        if (var20 >= var21) {
                            arg9 -= arg1;
                            arg1 -= arg0;
                            arg0 = class115.field1680 * arg0;
                            while (true) {
                                arg1--;
                                if (arg1 < 0) {
                                    while (true) {
                                        arg9--;
                                        if (arg9 < 0) {
                                            return true;
                                        }
                                        if (!class258.method2168(arg5, class430.field6766, 0, var24, (arg2 >> 12) - 1, arg0, -2, (arg6 >> 12) + 1)) {
                                            return false;
                                        }
                                        arg5 += var25;
                                        arg0 += class115.field1680;
                                        arg6 += var22;
                                        arg2 += var21;
                                    }
                                }
                                if (!class258.method2168(arg5, class430.field6766, 0, var24, (arg2 >> 12) - 1, arg0, -2, (arg3 >> 12) + 1)) {
                                    return false;
                                }
                                arg0 += class115.field1680;
                                arg2 += var21;
                                arg5 += var25;
                                arg3 += var20;
                            }
                        } else {
                            arg9 -= arg1;
                            arg1 -= arg0;
                            arg0 = class115.field1680 * arg0;
                            while (true) {
                                arg1--;
                                if (arg1 < 0) {
                                    while (true) {
                                        arg9--;
                                        if (arg9 < 0) {
                                            return true;
                                        }
                                        if (!class258.method2168(arg5, class430.field6766, 0, var24, (arg6 >> 12) - 1, arg0, -2, (arg2 >> 12) + 1)) {
                                            return false;
                                        }
                                        arg6 += var22;
                                        arg0 += class115.field1680;
                                        arg5 += var25;
                                        arg2 += var21;
                                    }
                                }
                                if (!class258.method2168(arg5, class430.field6766, 0, var24, (arg3 >> 12) - 1, arg0, -2, (arg2 >> 12) + 1)) {
                                    return false;
                                }
                                arg0 += class115.field1680;
                                arg3 += var20;
                                arg2 += var21;
                                arg5 += var25;
                            }
                        }
                    } else {
                        arg6 = arg2 <<= 0xC;
                        arg3 <<= 0xC;
                        if (arg0 < 0) {
                            arg2 -= arg0 * var21;
                            arg6 -= arg0 * var20;
                            arg5 -= arg0 * var25;
                            arg0 = 0;
                        }
                        if (arg9 < 0) {
                            arg3 -= arg9 * var22;
                            arg9 = 0;
                        }
                        if ((arg0 == arg9 || var21 <= var20) && (arg0 != arg9 || var22 >= var20)) {
                            arg1 -= arg9;
                            arg9 -= arg0;
                            arg0 = class115.field1680 * arg0;
                            while (true) {
                                arg9--;
                                if (arg9 < 0) {
                                    while (true) {
                                        arg1--;
                                        if (arg1 < 0) {
                                            return true;
                                        }
                                        if (!class258.method2168(arg5, class430.field6766, 0, var24, (arg3 >> 12) - 1, arg0, -2, (arg6 >> 12) + 1)) {
                                            return false;
                                        }
                                        arg0 += class115.field1680;
                                        arg3 += var22;
                                        arg6 += var20;
                                        arg5 += var25;
                                    }
                                }
                                if (!class258.method2168(arg5, class430.field6766, 0, var24, (arg2 >> 12) - 1, arg0, -2, (arg6 >> 12) + 1)) {
                                    return false;
                                }
                                arg0 += class115.field1680;
                                arg5 += var25;
                                arg2 += var21;
                                arg6 += var20;
                            }
                        } else {
                            arg1 -= arg9;
                            arg9 -= arg0;
                            arg0 = class115.field1680 * arg0;
                            while (true) {
                                arg9--;
                                if (arg9 < 0) {
                                    while (true) {
                                        arg1--;
                                        if (arg1 < 0) {
                                            return true;
                                        }
                                        if (!class258.method2168(arg5, class430.field6766, 0, var24, (arg6 >> 12) - 1, arg0, -2, (arg3 >> 12) + 1)) {
                                            return false;
                                        }
                                        arg5 += var25;
                                        arg6 += var20;
                                        arg3 += var22;
                                        arg0 += class115.field1680;
                                    }
                                }
                                if (!class258.method2168(arg5, class430.field6766, 0, var24, (arg6 >> 12) - 1, arg0, -2, (arg2 >> 12) + 1)) {
                                    return false;
                                }
                                arg0 += class115.field1680;
                                arg5 += var25;
                                arg6 += var20;
                                arg2 += var21;
                            }
                        }
                    }
                }
            } else {
                return false;
            }
        } catch (RuntimeException var27) {
            throw class590.method4333(var27, field7357[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ICLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;", line = 664)
    public static final String method3692(int arg0, char arg1, String arg2, String arg3) {
        try {
            field7352++;
            int var4 = arg3.length();
            int var5 = arg2.length();
            int var6 = var4;
            int var7 = var5 - 1;
            if (var7 != 0) {
                int var8 = 0;
                while (true) {
                    var8 = arg3.indexOf(arg1, var8);
                    if (var8 < 0) {
                        break;
                    }
                    var8++;
                    var6 += var7;
                }
            }
            if (arg0 != -25456) {
                field7353 = null;
            }
            StringBuffer var9 = new StringBuffer(var6);
            int var10 = 0;
            while (true) {
                int var11 = arg3.indexOf(arg1, var10);
                if (var11 < 0) {
                    var9.append(arg3.substring(var10));
                    return var9.toString();
                }
                var9.append(arg3.substring(var10, var11));
                var10 = var11 + 1;
                var9.append(arg2);
            }
        } catch (RuntimeException var13) {
            throw class590.method4333(var13, field7357[2] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field7357[3] : field7357[1]) + ',' + (arg3 == null ? field7357[3] : field7357[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Z)V", line = 717)
    public static final void method3693(boolean arg0) {
        try {
            field7356++;
            class404.field6402 = client.field5163.field583 + client.field5163.field581 + 2;
            class136.field1918 = class64.field877.field581 + class64.field877.field583 + 2;
            class585.field8479 = new String[500];
            for (int var1 = 0; var1 < class585.field8479.length; var1++) {
                class585.field8479[var1] = "";
            }
            class6.method42(arg0, class709.field10200.method5154(class795.field11624, (byte) 65));
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7357[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "(I)V", line = 736)
    public static void method3694(int arg0) {
        try {
            field7353 = null;
            if (arg0 == 1) {
                field7354 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field7357[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "(I)V")
    public abstract void method2464(int arg0);

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "([I)V")
    public abstract void method2479(int[] arg0);

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lsj;)V")
    public abstract void method2461(class486 arg0);

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "(I)V")
    public abstract void method2459(int arg0);

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(III)V")
    public abstract void method2465(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "(I)V")
    public abstract void method2467(int arg0);

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(III[I)V")
    public abstract void method2457(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "(I)V")
    public abstract void method2458(int arg0);

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V")
    public abstract void method2455(int arg0);

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIIII)V")
    public abstract void method2478(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)V")
    public abstract void method2475(int arg0);

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "()Lsj;")
    public abstract class486 method2472();

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(III[I)V")
    public abstract void method2462(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "()V")
    public abstract void method2471();

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(III)V")
    public abstract void method2480(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "(III[I)V")
    public abstract void method2466(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!sj", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3695(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x25);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!sj", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3696(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 125;
                    break;
                case 1:
                    var10005 = 62;
                    break;
                case 2:
                    var10005 = 68;
                    break;
                case 3:
                    var10005 = 126;
                    break;
                default:
                    var10005 = 37;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
