import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oga")
public class class358 extends class518 {

    @OriginalMember(owner = "client!oga", name = "E", descriptor = "I")
    private int field5205 = 3216;

    @OriginalMember(owner = "client!oga", name = "K", descriptor = "I")
    private int field5208 = 3216;

    @OriginalMember(owner = "client!oga", name = "F", descriptor = "I")
    private int field5211 = 4096;

    @OriginalMember(owner = "client!oga", name = "D", descriptor = "[I")
    private int[] field5201 = new int[3];

    @OriginalMember(owner = "client!oga", name = "N", descriptor = "[Ljava/lang/String;")
    private static final String[] field5213 = new String[] { method2868(method2867("<ro\u0004\r{")), method2868(method2867("<ro\u0004\u000f{")), method2868(method2867("<ro\u0004\u0002{")), method2868(method2867("<ro\u0004\f{")), method2868(method2867("<ro\u0004\u000e{")), method2868(method2867("=`bF")), method2868(method2867("(; \u00045")), method2868(method2867("<ro\u0004\u000b{")), method2868(method2867("<ro\u0004\n{")) };

    @OriginalMember(owner = "client!oga", name = "C", descriptor = "F")
    public static float field5207;

    @OriginalMember(owner = "client!oga", name = "J", descriptor = "I")
    public static int field5202;

    @OriginalMember(owner = "client!oga", name = "B", descriptor = "I")
    public static int field5203;

    @OriginalMember(owner = "client!oga", name = "G", descriptor = "I")
    public static int field5204;

    @OriginalMember(owner = "client!oga", name = "M", descriptor = "I")
    public static int field5206;

    @OriginalMember(owner = "client!oga", name = "H", descriptor = "I")
    public static int field5210;

    @OriginalMember(owner = "client!oga", name = "I", descriptor = "I")
    public static int field5212;

    @OriginalMember(owner = "client!oga", name = "L", descriptor = "[I")
    public static int[] field5209;

    @OriginalMember(owner = "client!oga", name = "<init>", descriptor = "()V")
    public class358() {
        super(1, true);
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(ZIIIIIIIII)Z")
    public static final boolean method2863(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        try {
            ++field5202;
            if (~arg3 >= -2001 && ~arg6 >= -2001 && ~arg4 >= -2001 && ~arg9 >= -2001 && arg8 <= 2000 && ~arg5 >= -2001) {
                if (~arg3 <= 1999 && ~arg6 <= 1999 && arg4 >= -2000 && arg9 >= -2000 && ~arg8 <= 1999 && ~arg5 <= 1999) {
                    if (class404.field5873 == 2) {
                        int var10 = class29.field372 * arg3 + arg9;
                        if (~var10 <= -1 && class715.field10184.length > var10 && (arg2 << 8) - 38400 < class715.field10184[var10]) {
                            return false;
                        }
                        int var11 = class29.field372 * arg6 + arg8;
                        if (~var11 <= -1 && ~class715.field10184.length < ~var11 && (arg7 << 8) - 38400 < class715.field10184[var11]) {
                            return false;
                        }
                        int var12 = arg5 - -(class29.field372 * arg4);
                        if (var12 >= 0 && ~var12 > ~class715.field10184.length && ~((arg1 << 8) + -38400) > ~class715.field10184[var12]) {
                            return false;
                        }
                    }
                    int var13 = -arg9 + arg8;
                    int var14 = arg6 - arg3;
                    int var15 = -arg9 + arg5;
                    int var16 = arg4 - arg3;
                    int var17 = -arg2 + arg7;
                    if (arg3 < arg6 && ~arg4 > ~arg4) {
                        --arg3;
                        if (arg6 <= arg4) {
                            ++arg4;
                        } else {
                            ++arg6;
                        }
                    } else if (~arg6 <= ~arg4) {
                        --arg4;
                        if (arg6 >= arg3) {
                            ++arg6;
                        } else {
                            ++arg3;
                        }
                    } else {
                        if (~arg3 < ~arg4) {
                            ++arg3;
                        } else {
                            ++arg4;
                        }
                        --arg6;
                    }
                    int var18 = arg1 - arg2;
                    int var19 = 0;
                    if (~arg3 != ~arg6) {
                        var19 = (-arg9 + arg8 << 12) / (arg6 - arg3);
                    }
                    int var20 = 0;
                    if (arg4 != arg6) {
                        var20 = (-arg8 + arg5 << 12) / (-arg6 + arg4);
                    }
                    int var21 = 0;
                    if (arg0) {
                        method2866((byte) 17);
                    }
                    if (arg3 != arg4) {
                        var21 = (-arg5 + arg9 << 12) / (-arg4 + arg3);
                    }
                    int var22 = var13 * var16 + -(var14 * var15);
                    if (~var22 == -1) {
                        return false;
                    } else {
                        int var23 = (var16 * var17 - var14 * var18 << 8) / var22;
                        int var24 = (var13 * var18 + -(var15 * var17) << 8) / var22;
                        if (~arg6 <= ~arg3 && ~arg3 >= ~arg4) {
                            if (class518.field7582 <= arg3) {
                                return true;
                            } else {
                                arg2 = (arg2 << 8) + -(arg9 * var23) + var23;
                                if (arg4 > class518.field7582) {
                                    arg4 = class518.field7582;
                                }
                                if (~class518.field7582 > ~arg6) {
                                    arg6 = class518.field7582;
                                }
                                if (arg4 <= arg6) {
                                    arg8 = arg9 <<= 12;
                                    arg5 <<= 12;
                                    if (arg3 < 0) {
                                        arg9 -= arg3 * var19;
                                        arg8 -= arg3 * var21;
                                        arg2 -= arg3 * var24;
                                        arg3 = 0;
                                    }
                                    if (arg4 < 0) {
                                        arg5 -= arg4 * var20;
                                        arg4 = 0;
                                    }
                                    if (~arg3 != ~arg4 && ~var19 < ~var21 || arg3 == arg4 && ~var20 < ~var19) {
                                        arg6 -= arg4;
                                        arg4 -= arg3;
                                        arg3 = class29.field372 * arg3;
                                        while (true) {
                                            --arg4;
                                            if (arg4 < 0) {
                                                while (true) {
                                                    --arg6;
                                                    if (~arg6 > -1) {
                                                        return true;
                                                    }
                                                    if (!class678.method4865((arg5 >> 12) - 1, (arg9 >> 12) + 1, (byte) 98, 0, class715.field10184, arg3, var23, arg2)) {
                                                        return false;
                                                    }
                                                    arg9 += var19;
                                                    arg2 += var24;
                                                    arg5 += var20;
                                                    arg3 += class29.field372;
                                                }
                                            }
                                            if (!class678.method4865((arg8 >> 12) + -1, (arg9 >> 12) + 1, (byte) 83, 0, class715.field10184, arg3, var23, arg2)) {
                                                return false;
                                            }
                                            arg8 += var21;
                                            arg3 += class29.field372;
                                            arg9 += var19;
                                            arg2 += var24;
                                        }
                                    } else {
                                        arg6 -= arg4;
                                        arg4 -= arg3;
                                        arg3 = class29.field372 * arg3;
                                        while (true) {
                                            --arg4;
                                            if (~arg4 > -1) {
                                                while (true) {
                                                    --arg6;
                                                    if (arg6 < 0) {
                                                        return true;
                                                    }
                                                    if (!class678.method4865((arg9 >> 12) + -1, (arg5 >> 12) + 1, (byte) 104, 0, class715.field10184, arg3, var23, arg2)) {
                                                        return false;
                                                    }
                                                    arg5 += var20;
                                                    arg9 += var19;
                                                    arg2 += var24;
                                                    arg3 += class29.field372;
                                                }
                                            }
                                            if (!class678.method4865((arg9 >> 12) + -1, (arg8 >> 12) + 1, (byte) 56, 0, class715.field10184, arg3, var23, arg2)) {
                                                return false;
                                            }
                                            arg2 += var24;
                                            arg9 += var19;
                                            arg8 += var21;
                                            arg3 += class29.field372;
                                        }
                                    }
                                } else {
                                    arg5 = arg9 <<= 12;
                                    arg8 <<= 12;
                                    if (~arg3 > -1) {
                                        arg5 -= arg3 * var21;
                                        arg9 -= arg3 * var19;
                                        arg2 -= arg3 * var24;
                                        arg3 = 0;
                                    }
                                    if (~arg6 > -1) {
                                        arg8 -= arg6 * var20;
                                        arg6 = 0;
                                    }
                                    if ((arg3 == arg6 || ~var21 <= ~var19) && (~arg3 != ~arg6 || var20 >= var21)) {
                                        arg4 -= arg6;
                                        arg6 -= arg3;
                                        arg3 = class29.field372 * arg3;
                                        while (true) {
                                            --arg6;
                                            if (~arg6 > -1) {
                                                while (true) {
                                                    --arg4;
                                                    if (arg4 < 0) {
                                                        return true;
                                                    }
                                                    if (!class678.method4865((arg8 >> 12) + -1, (arg5 >> 12) + 1, (byte) 67, 0, class715.field10184, arg3, var23, arg2)) {
                                                        return false;
                                                    }
                                                    arg8 += var20;
                                                    arg3 += class29.field372;
                                                    arg2 += var24;
                                                    arg5 += var21;
                                                }
                                            }
                                            if (!class678.method4865((arg9 >> 12) - 1, (arg5 >> 12) - -1, (byte) 77, 0, class715.field10184, arg3, var23, arg2)) {
                                                return false;
                                            }
                                            arg3 += class29.field372;
                                            arg9 += var19;
                                            arg2 += var24;
                                            arg5 += var21;
                                        }
                                    } else {
                                        arg4 -= arg6;
                                        arg6 -= arg3;
                                        arg3 = class29.field372 * arg3;
                                        while (true) {
                                            --arg6;
                                            if (~arg6 > -1) {
                                                while (true) {
                                                    --arg4;
                                                    if (arg4 < 0) {
                                                        return true;
                                                    }
                                                    if (!class678.method4865((arg5 >> 12) + -1, (arg8 >> 12) + 1, (byte) 101, 0, class715.field10184, arg3, var23, arg2)) {
                                                        return false;
                                                    }
                                                    arg3 += class29.field372;
                                                    arg2 += var24;
                                                    arg5 += var21;
                                                    arg8 += var20;
                                                }
                                            }
                                            if (!class678.method4865((arg5 >> 12) + -1, (arg9 >> 12) + 1, (byte) 124, 0, class715.field10184, arg3, var23, arg2)) {
                                                return false;
                                            }
                                            arg2 += var24;
                                            arg5 += var21;
                                            arg3 += class29.field372;
                                            arg9 += var19;
                                        }
                                    }
                                }
                            }
                        } else if (arg6 <= arg4) {
                            if (~class518.field7582 >= ~arg6) {
                                return true;
                            } else {
                                if (class518.field7582 < arg3) {
                                    arg3 = class518.field7582;
                                }
                                arg7 = (arg7 << 8) + -(arg8 * var23) + var23;
                                if (~arg4 < ~class518.field7582) {
                                    arg4 = class518.field7582;
                                }
                                if (arg4 < arg3) {
                                    arg9 = arg8 <<= 12;
                                    arg5 <<= 12;
                                    if (arg6 < 0) {
                                        arg8 -= arg6 * var20;
                                        arg9 -= arg6 * var19;
                                        arg7 -= arg6 * var24;
                                        arg6 = 0;
                                    }
                                    if (arg4 < 0) {
                                        arg5 -= arg4 * var21;
                                        arg4 = 0;
                                    }
                                    if (arg4 != arg6 && var19 < var20 || ~arg4 == ~arg6 && ~var21 > ~var19) {
                                        arg3 -= arg4;
                                        arg4 -= arg6;
                                        arg6 = class29.field372 * arg6;
                                        while (true) {
                                            --arg4;
                                            if (arg4 < 0) {
                                                while (true) {
                                                    --arg3;
                                                    if (~arg3 > -1) {
                                                        return true;
                                                    }
                                                    if (!class678.method4865((arg9 >> 12) + -1, (arg5 >> 12) - -1, (byte) 74, 0, class715.field10184, arg6, var23, arg7)) {
                                                        return false;
                                                    }
                                                    arg7 += var24;
                                                    arg6 += class29.field372;
                                                    arg5 += var21;
                                                    arg9 += var19;
                                                }
                                            }
                                            if (!class678.method4865((arg9 >> 12) + -1, (arg8 >> 12) + 1, (byte) 100, 0, class715.field10184, arg6, var23, arg7)) {
                                                return false;
                                            }
                                            arg9 += var19;
                                            arg7 += var24;
                                            arg6 += class29.field372;
                                            arg8 += var20;
                                        }
                                    } else {
                                        arg3 -= arg4;
                                        arg4 -= arg6;
                                        arg6 = class29.field372 * arg6;
                                        while (true) {
                                            --arg4;
                                            if (arg4 < 0) {
                                                while (true) {
                                                    --arg3;
                                                    if (arg3 < 0) {
                                                        return true;
                                                    }
                                                    if (!class678.method4865((arg5 >> 12) + -1, (arg9 >> 12) + 1, (byte) 124, 0, class715.field10184, arg6, var23, arg7)) {
                                                        return false;
                                                    }
                                                    arg6 += class29.field372;
                                                    arg9 += var19;
                                                    arg5 += var21;
                                                    arg7 += var24;
                                                }
                                            }
                                            if (!class678.method4865((arg8 >> 12) + -1, (arg9 >> 12) - -1, (byte) 107, 0, class715.field10184, arg6, var23, arg7)) {
                                                return false;
                                            }
                                            arg8 += var20;
                                            arg9 += var19;
                                            arg7 += var24;
                                            arg6 += class29.field372;
                                        }
                                    }
                                } else {
                                    arg5 = arg8 <<= 12;
                                    arg9 <<= 12;
                                    if (~arg6 > -1) {
                                        arg5 -= arg6 * var19;
                                        arg7 -= arg6 * var24;
                                        arg8 -= arg6 * var20;
                                        arg6 = 0;
                                    }
                                    if (~arg3 > -1) {
                                        arg9 -= arg3 * var21;
                                        arg3 = 0;
                                    }
                                    if (var20 <= var19) {
                                        arg4 -= arg3;
                                        arg3 -= arg6;
                                        arg6 = class29.field372 * arg6;
                                        while (true) {
                                            --arg3;
                                            if (~arg3 > -1) {
                                                while (true) {
                                                    --arg4;
                                                    if (arg4 < 0) {
                                                        return true;
                                                    }
                                                    if (!class678.method4865((arg8 >> 12) + -1, (arg9 >> 12) - -1, (byte) 106, 0, class715.field10184, arg6, var23, arg7)) {
                                                        return false;
                                                    }
                                                    arg9 += var21;
                                                    arg7 += var24;
                                                    arg8 += var20;
                                                    arg6 += class29.field372;
                                                }
                                            }
                                            if (!class678.method4865((arg8 >> 12) + -1, (arg5 >> 12) - -1, (byte) 119, 0, class715.field10184, arg6, var23, arg7)) {
                                                return false;
                                            }
                                            arg8 += var20;
                                            arg5 += var19;
                                            arg7 += var24;
                                            arg6 += class29.field372;
                                        }
                                    } else {
                                        arg4 -= arg3;
                                        arg3 -= arg6;
                                        arg6 = class29.field372 * arg6;
                                        while (true) {
                                            --arg3;
                                            if (~arg3 > -1) {
                                                while (true) {
                                                    --arg4;
                                                    if (arg4 < 0) {
                                                        return true;
                                                    }
                                                    if (!class678.method4865((arg9 >> 12) + -1, (arg8 >> 12) - -1, (byte) 80, 0, class715.field10184, arg6, var23, arg7)) {
                                                        return false;
                                                    }
                                                    arg9 += var21;
                                                    arg6 += class29.field372;
                                                    arg7 += var24;
                                                    arg8 += var20;
                                                }
                                            }
                                            if (!class678.method4865((arg5 >> 12) - 1, (arg8 >> 12) - -1, (byte) 55, 0, class715.field10184, arg6, var23, arg7)) {
                                                return false;
                                            }
                                            arg8 += var20;
                                            arg5 += var19;
                                            arg6 += class29.field372;
                                            arg7 += var24;
                                        }
                                    }
                                }
                            }
                        } else if (~arg4 <= ~class518.field7582) {
                            return true;
                        } else {
                            arg1 = (arg1 << 8) + var23 - arg5 * var23;
                            if (arg3 > class518.field7582) {
                                arg3 = class518.field7582;
                            }
                            if (class518.field7582 < arg6) {
                                arg6 = class518.field7582;
                            }
                            if (~arg3 > ~arg6) {
                                arg8 = arg5 <<= 12;
                                arg9 <<= 12;
                                if (~arg4 > -1) {
                                    arg1 -= arg4 * var24;
                                    arg5 -= arg4 * var21;
                                    arg8 -= arg4 * var20;
                                    arg4 = 0;
                                }
                                if (arg3 < 0) {
                                    arg9 -= arg3 * var19;
                                    arg3 = 0;
                                }
                                if (var20 < var21) {
                                    arg6 -= arg3;
                                    arg3 -= arg4;
                                    arg4 = class29.field372 * arg4;
                                    while (true) {
                                        --arg3;
                                        if (arg3 < 0) {
                                            while (true) {
                                                --arg6;
                                                if (arg6 < 0) {
                                                    return true;
                                                }
                                                if (!class678.method4865((arg8 >> 12) - 1, (arg9 >> 12) + 1, (byte) 54, 0, class715.field10184, arg4, var23, arg1)) {
                                                    return false;
                                                }
                                                arg8 += var20;
                                                arg9 += var19;
                                                arg4 += class29.field372;
                                                arg1 += var24;
                                            }
                                        }
                                        if (!class678.method4865((arg8 >> 12) + -1, (arg5 >> 12) + 1, (byte) 122, 0, class715.field10184, arg4, var23, arg1)) {
                                            return false;
                                        }
                                        arg4 += class29.field372;
                                        arg1 += var24;
                                        arg5 += var21;
                                        arg8 += var20;
                                    }
                                } else {
                                    arg6 -= arg3;
                                    arg3 -= arg4;
                                    arg4 = class29.field372 * arg4;
                                    while (true) {
                                        --arg3;
                                        if (arg3 < 0) {
                                            while (true) {
                                                --arg6;
                                                if (~arg6 > -1) {
                                                    return true;
                                                }
                                                if (!class678.method4865((arg9 >> 12) - 1, (arg8 >> 12) - -1, (byte) 97, 0, class715.field10184, arg4, var23, arg1)) {
                                                    return false;
                                                }
                                                arg9 += var19;
                                                arg4 += class29.field372;
                                                arg1 += var24;
                                                arg8 += var20;
                                            }
                                        }
                                        if (!class678.method4865((arg5 >> 12) + -1, (arg8 >> 12) - -1, (byte) 118, 0, class715.field10184, arg4, var23, arg1)) {
                                            return false;
                                        }
                                        arg8 += var20;
                                        arg1 += var24;
                                        arg5 += var21;
                                        arg4 += class29.field372;
                                    }
                                }
                            } else {
                                arg9 = arg5 <<= 12;
                                arg8 <<= 12;
                                if (arg4 < 0) {
                                    arg1 -= arg4 * var24;
                                    arg9 -= arg4 * var20;
                                    arg5 -= arg4 * var21;
                                    arg4 = 0;
                                }
                                if (arg6 < 0) {
                                    arg8 -= arg6 * var19;
                                    arg6 = 0;
                                }
                                if (~var20 <= ~var21) {
                                    arg3 -= arg6;
                                    arg6 -= arg4;
                                    arg4 = class29.field372 * arg4;
                                    while (true) {
                                        --arg6;
                                        if (arg6 < 0) {
                                            while (true) {
                                                --arg3;
                                                if (arg3 < 0) {
                                                    return true;
                                                }
                                                if (!class678.method4865((arg5 >> 12) + -1, (arg8 >> 12) + 1, (byte) 97, 0, class715.field10184, arg4, var23, arg1)) {
                                                    return false;
                                                }
                                                arg1 += var24;
                                                arg4 += class29.field372;
                                                arg8 += var19;
                                                arg5 += var21;
                                            }
                                        }
                                        if (!class678.method4865((arg5 >> 12) + -1, (arg9 >> 12) + 1, (byte) 68, 0, class715.field10184, arg4, var23, arg1)) {
                                            return false;
                                        }
                                        arg9 += var20;
                                        arg4 += class29.field372;
                                        arg5 += var21;
                                        arg1 += var24;
                                    }
                                } else {
                                    arg3 -= arg6;
                                    arg6 -= arg4;
                                    arg4 = class29.field372 * arg4;
                                    while (true) {
                                        --arg6;
                                        if (arg6 < 0) {
                                            while (true) {
                                                --arg3;
                                                if (arg3 < 0) {
                                                    return true;
                                                }
                                                if (!class678.method4865((arg8 >> 12) + -1, (arg5 >> 12) - -1, (byte) 106, 0, class715.field10184, arg4, var23, arg1)) {
                                                    return false;
                                                }
                                                arg5 += var21;
                                                arg1 += var24;
                                                arg8 += var19;
                                                arg4 += class29.field372;
                                            }
                                        }
                                        if (!class678.method4865((arg9 >> 12) + -1, (arg5 >> 12) + 1, (byte) 92, 0, class715.field10184, arg4, var23, arg1)) {
                                            return false;
                                        }
                                        arg1 += var24;
                                        arg9 += var20;
                                        arg4 += class29.field372;
                                        arg5 += var21;
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
        } catch (RuntimeException var26) {
            throw class665.method4799(var26, field5213[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
        }
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(ILjc;I)V")
    public final void method17(int arg0, class711 arg1, int arg2) {
        try {
            ++field5203;
            if (~arg0 != -1) {
                if (arg0 != 1) {
                    if (~arg0 == -3) {
                        this.field5208 = arg1.method5116((byte) -116);
                    }
                } else {
                    this.field5205 = arg1.method5116((byte) -111);
                }
            } else {
                this.field5211 = arg1.method5116((byte) -122);
            }
            if (arg2 != -3) {
                this.method12(-99);
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field5213[7] + arg0 + ',' + (arg1 != null ? field5213[6] : field5213[5]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!oga", name = "d", descriptor = "(B)V")
    private final void method2864(byte arg0) {
        try {
            ++field5204;
            double var2 = Math.cos((double) ((float) this.field5208 / 4096.0F));
            this.field5201[0] = (int) (4096.0D * Math.sin((double) ((float) this.field5205 / 4096.0F)) * var2);
            this.field5201[1] = (int) (4096.0D * var2 * Math.cos((double) ((float) this.field5205 / 4096.0F)));
            this.field5201[2] = (int) (Math.sin((double) ((float) this.field5208 / 4096.0F)) * 4096.0D);
            int var4 = this.field5201[0] * this.field5201[0] >> 12;
            int var5 = this.field5201[1] * this.field5201[1] >> 12;
            int var6 = this.field5201[2] * this.field5201[2] >> 12;
            if (arg0 > -74) {
                this.field5211 = -126;
            }
            int var7 = (int) (Math.sqrt((double) (var4 + var5 - -var6 >> 12)) * 4096.0D);
            if (var7 != 0) {
                this.field5201[2] = (this.field5201[2] << 12) / var7;
                this.field5201[0] = (this.field5201[0] << 12) / var7;
                this.field5201[1] = (this.field5201[1] << 12) / var7;
            }
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field5213[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oga", name = "b", descriptor = "(I)V")
    public final void method12(int arg0) {
        try {
            if (arg0 > 38) {
                ++field5206;
                this.method2864((byte) -92);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5213[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oga", name = "f", descriptor = "(I)V")
    public static final void method2865(int arg0) {
        try {
            ++field5210;
            if (~class561.field8167 != -1) {
                class341.field4966.method5604(1350);
                client.method4980(17712);
                class47.method534((byte) 6);
            }
            if (arg0 < 99) {
                method2863(true, 111, -41, -8, -36, -53, -37, -109, -40, -24);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field5213[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oga", name = "b", descriptor = "(II)[I")
    public final int[] method14(int arg0, int arg1) {
        try {
            ++field5212;
            int[] var3 = super.field7564.method4462(26041, arg0);
            if (super.field7564.field8652) {
                int var4 = class171.field2273 * this.field5211 >> 12;
                int[] var5 = this.method3944(arg0 + -1 & class478.field7048, 0, (byte) 73);
                int[] var6 = this.method3944(arg0, 0, (byte) 73);
                int[] var7 = this.method3944(arg0 + 1 & class478.field7048, 0, (byte) 73);
                for (int var8 = 0; var8 < class110.field1436; ++var8) {
                    int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                    int var10 = (var6[var8 + -1 & class247.field3543] + -var6[var8 + 1 & class247.field3543]) * var4 >> 12;
                    int var11 = var10 >> 4;
                    int var12 = var9 >> 4;
                    if (var11 < 0) {
                        var11 = -var11;
                    }
                    if (~var11 < -256) {
                        var11 = 255;
                    }
                    if (~var12 > -1) {
                        var12 = -var12;
                    }
                    if (var12 > 255) {
                        var12 = 255;
                    }
                    int var13 = class180.field2339[((var12 + 1) * var12 >> 1) + var11] & 255;
                    int var14 = var9 * var13 >> 8;
                    int var15 = var13 * 4096 >> 8;
                    int var16 = var10 * var13 >> 8;
                    int var17 = this.field5201[1] * var14 >> 12;
                    int var18 = this.field5201[0] * var16 >> 12;
                    int var19 = this.field5201[2] * var15 >> 12;
                    var3[var8] = var17 + var19 + var18;
                }
            }
            int var20 = 18 % ((arg1 - -57) / 55);
            return var3;
        } catch (RuntimeException var22) {
            throw class665.method4799(var22, field5213[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!oga", name = "e", descriptor = "(B)V")
    public static void method2866(byte arg0) {
        try {
            if (arg0 != 83) {
                method2866((byte) -122);
            }
            field5209 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field5213[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oga", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2867(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 72);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!oga", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2868(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 83;
                    break;
                case 1:
                    var10005 = 21;
                    break;
                case 2:
                    var10005 = 14;
                    break;
                case 3:
                    var10005 = 42;
                    break;
                default:
                    var10005 = 72;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
