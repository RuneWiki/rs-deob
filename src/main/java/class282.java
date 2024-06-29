import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class282 {

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "[S")
    public short[] field4224;

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "[I")
    public int[] field4229;

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "[S")
    public short[] field4228;

    @OriginalMember(owner = "client!rn", name = "j", descriptor = "J")
    public long field4225;

    @OriginalMember(owner = "client!rn", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4232 = new String[] { method2314(method2313("qW\u0019Wq")), method2314(method2313("qW\u0019Tq")), method2314(method2313("mL[z")), method2314(method2313("x\u0017\u00198$")), method2314(method2313("qW\u0019*0mPC(q")), method2314(method2313("qW\u0019Uq")) };

    @OriginalMember(owner = "client!rn", name = "g", descriptor = "[I")
    public static int[] field4222 = new int[4096];

    @OriginalMember(owner = "client!rn", name = "h", descriptor = "Lel;")
    public static class573 field4226 = new class573(16, -2);

    @OriginalMember(owner = "client!rn", name = "f", descriptor = "Lwia;")
    public static class790 field4230 = new class790(77, 0);

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "J")
    public static long field4231 = 0L;

    @OriginalMember(owner = "client!rn", name = "i", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!rn", name = "e", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIIIIIIIII)Z")
    public static final boolean method2310(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        try {
            field4223++;
            if (arg3 > 2000 || arg8 > 2000 || arg1 > 2000 || arg0 > 2000 || arg5 > 2000 || arg9 > 2000) {
                return false;
            } else if (arg3 >= -2000 && arg8 >= -2000 && arg1 >= -2000 && arg0 >= -2000 && arg5 >= -2000 && arg9 >= -2000) {
                if (class394.field5911 == 2) {
                    int var10 = class756.field10986 * arg3 + arg0;
                    if (var10 >= 0 && class21.field249.length > var10 && class21.field249[var10] > (arg2 << 8) - 38400) {
                        return false;
                    }
                    int var11 = arg5 + (class756.field10986 * arg8);
                    if (var11 >= 0 && class21.field249.length > var11 && (arg6 << 8) - 38400 < class21.field249[var11]) {
                        return false;
                    }
                    int var12 = class756.field10986 * arg1 + arg9;
                    if (var12 >= 0 && var12 < class21.field249.length && class21.field249[var12] > ((arg7 << 8) - 38400)) {
                        return false;
                    }
                }
                int var13 = arg5 - arg0;
                int var14 = arg8 - arg3;
                int var15 = arg9 - arg0;
                int var16 = arg1 - arg3;
                int var17 = arg6 - arg2;
                int var18 = arg7 - arg2;
                if (arg8 > arg3 && arg1 < arg1) {
                    arg3--;
                    if (arg1 >= arg8) {
                        arg1++;
                    } else {
                        arg8++;
                    }
                } else if (arg8 < arg1) {
                    if (arg3 > arg1) {
                        arg3++;
                    } else {
                        arg1++;
                    }
                    arg8--;
                } else {
                    if (arg3 > arg8) {
                        arg3++;
                    } else {
                        arg8++;
                    }
                    arg1--;
                }
                int var19 = 0;
                if (arg3 != arg8) {
                    var19 = (arg5 - arg0 << 12) / (arg8 - arg3);
                }
                int var20 = 0;
                if (arg1 != arg8) {
                    var20 = (arg9 - arg5 << 12) / (arg1 - arg8);
                }
                int var21 = 0;
                if (arg1 != arg3) {
                    var21 = (arg0 - arg9 << 12) / (arg3 - arg1);
                }
                int var22 = var13 * var16 - var14 * var15;
                if (var22 == 0) {
                    return false;
                }
                if (arg4 != -32280) {
                    method2312(true);
                }
                int var23 = (var16 * var17 - (var14 * var18) << 8) / var22;
                int var24 = (var13 * var18 - (var15 * var17) << 8) / var22;
                if (arg3 <= arg8 && arg1 >= arg3) {
                    if (arg3 >= class58.field617) {
                        return true;
                    }
                    if (arg1 > class58.field617) {
                        arg1 = class58.field617;
                    }
                    arg2 = (arg2 << 8) + var23 - (arg0 * var23);
                    if (class58.field617 < arg8) {
                        arg8 = class58.field617;
                    }
                    if (arg1 <= arg8) {
                        arg5 = arg0 <<= 0xC;
                        if (arg3 < 0) {
                            arg0 -= arg3 * var19;
                            arg5 -= arg3 * var21;
                            arg2 -= arg3 * var24;
                            arg3 = 0;
                        }
                        arg9 <<= 0xC;
                        if (arg1 < 0) {
                            arg9 -= arg1 * var20;
                            arg1 = 0;
                        }
                        if (arg1 != arg3 && var19 > var21 || arg1 == arg3 && var19 < var20) {
                            arg8 -= arg1;
                            arg1 -= arg3;
                            arg3 = class756.field10986 * arg3;
                            while (true) {
                                arg1--;
                                if (arg1 < 0) {
                                    while (true) {
                                        arg8--;
                                        if (arg8 < 0) {
                                            return true;
                                        }
                                        if (!class278.method2286(arg2, arg3, (arg0 >> 12) + 1, (arg9 >> 12) + -1, var23, 0, (byte) 126, class21.field249)) {
                                            return false;
                                        }
                                        arg2 += var24;
                                        arg3 += class756.field10986;
                                        arg0 += var19;
                                        arg9 += var20;
                                    }
                                }
                                if (!class278.method2286(arg2, arg3, (arg0 >> 12) + 1, (arg5 >> 12) + -1, var23, 0, (byte) 120, class21.field249)) {
                                    return false;
                                }
                                arg2 += var24;
                                arg3 += class756.field10986;
                                arg0 += var19;
                                arg5 += var21;
                            }
                        } else {
                            arg8 -= arg1;
                            arg1 -= arg3;
                            arg3 = class756.field10986 * arg3;
                            while (true) {
                                arg1--;
                                if (arg1 < 0) {
                                    while (true) {
                                        arg8--;
                                        if (arg8 < 0) {
                                            return true;
                                        }
                                        if (!class278.method2286(arg2, arg3, (arg9 >> 12) + 1, (arg0 >> 12) + -1, var23, 0, (byte) 123, class21.field249)) {
                                            return false;
                                        }
                                        arg9 += var20;
                                        arg2 += var24;
                                        arg3 += class756.field10986;
                                        arg0 += var19;
                                    }
                                }
                                if (!class278.method2286(arg2, arg3, (arg5 >> 12) + 1, (arg0 >> 12) + -1, var23, 0, (byte) 121, class21.field249)) {
                                    return false;
                                }
                                arg0 += var19;
                                arg2 += var24;
                                arg5 += var21;
                                arg3 += class756.field10986;
                            }
                        }
                    } else {
                        arg9 = arg0 <<= 0xC;
                        if (arg3 < 0) {
                            arg2 -= arg3 * var24;
                            arg0 -= arg3 * var19;
                            arg9 -= arg3 * var21;
                            arg3 = 0;
                        }
                        arg5 <<= 0xC;
                        if (arg8 < 0) {
                            arg5 -= arg8 * var20;
                            arg8 = 0;
                        }
                        if ((arg3 == arg8 || var19 <= var21) && (arg3 != arg8 || var20 >= var21)) {
                            arg1 -= arg8;
                            arg8 -= arg3;
                            arg3 = class756.field10986 * arg3;
                            while (true) {
                                arg8--;
                                if (arg8 < 0) {
                                    while (true) {
                                        arg1--;
                                        if (arg1 < 0) {
                                            return true;
                                        }
                                        if (!class278.method2286(arg2, arg3, (arg9 >> 12) + 1, (arg5 >> 12) + -1, var23, 0, (byte) 122, class21.field249)) {
                                            return false;
                                        }
                                        arg3 += class756.field10986;
                                        arg2 += var24;
                                        arg5 += var20;
                                        arg9 += var21;
                                    }
                                }
                                if (!class278.method2286(arg2, arg3, (arg9 >> 12) + 1, (arg0 >> 12) + -1, var23, 0, (byte) 127, class21.field249)) {
                                    return false;
                                }
                                arg2 += var24;
                                arg9 += var21;
                                arg0 += var19;
                                arg3 += class756.field10986;
                            }
                        } else {
                            arg1 -= arg8;
                            arg8 -= arg3;
                            arg3 = class756.field10986 * arg3;
                            while (true) {
                                arg8--;
                                if (arg8 < 0) {
                                    while (true) {
                                        arg1--;
                                        if (arg1 < 0) {
                                            return true;
                                        }
                                        if (!class278.method2286(arg2, arg3, (arg5 >> 12) + 1, (arg9 >> 12) + -1, var23, 0, (byte) 121, class21.field249)) {
                                            return false;
                                        }
                                        arg3 += class756.field10986;
                                        arg5 += var20;
                                        arg9 += var21;
                                        arg2 += var24;
                                    }
                                }
                                if (!class278.method2286(arg2, arg3, (arg0 >> 12) + 1, (arg9 >> 12) + -1, var23, 0, (byte) 121, class21.field249)) {
                                    return false;
                                }
                                arg0 += var19;
                                arg2 += var24;
                                arg9 += var21;
                                arg3 += class756.field10986;
                            }
                        }
                    }
                } else if (arg8 > arg1) {
                    if (class58.field617 <= arg1) {
                        return true;
                    }
                    arg7 = (arg7 << 8) + var23 - (arg9 * var23);
                    if (arg3 > class58.field617) {
                        arg3 = class58.field617;
                    }
                    if (class58.field617 < arg8) {
                        arg8 = class58.field617;
                    }
                    if (arg3 < arg8) {
                        arg5 = arg9 <<= 0xC;
                        arg0 <<= 0xC;
                        if (arg1 < 0) {
                            arg5 -= arg1 * var20;
                            arg9 -= arg1 * var21;
                            arg7 -= arg1 * var24;
                            arg1 = 0;
                        }
                        if (arg3 < 0) {
                            arg0 -= arg3 * var19;
                            arg3 = 0;
                        }
                        if (var21 > var20) {
                            arg8 -= arg3;
                            arg3 -= arg1;
                            arg1 = class756.field10986 * arg1;
                            while (true) {
                                arg3--;
                                if (arg3 < 0) {
                                    while (true) {
                                        arg8--;
                                        if (arg8 < 0) {
                                            return true;
                                        }
                                        if (!class278.method2286(arg7, arg1, (arg0 >> 12) + 1, (arg5 >> 12) - 1, var23, 0, (byte) 120, class21.field249)) {
                                            return false;
                                        }
                                        arg0 += var19;
                                        arg7 += var24;
                                        arg5 += var20;
                                        arg1 += class756.field10986;
                                    }
                                }
                                if (!class278.method2286(arg7, arg1, (arg9 >> 12) + 1, (arg5 >> 12) + -1, var23, 0, (byte) 125, class21.field249)) {
                                    return false;
                                }
                                arg5 += var20;
                                arg7 += var24;
                                arg1 += class756.field10986;
                                arg9 += var21;
                            }
                        } else {
                            arg8 -= arg3;
                            arg3 -= arg1;
                            arg1 = class756.field10986 * arg1;
                            while (true) {
                                arg3--;
                                if (arg3 < 0) {
                                    while (true) {
                                        arg8--;
                                        if (arg8 < 0) {
                                            return true;
                                        }
                                        if (!class278.method2286(arg7, arg1, (arg5 >> 12) + 1, (arg0 >> 12) + -1, var23, 0, (byte) 118, class21.field249)) {
                                            return false;
                                        }
                                        arg7 += var24;
                                        arg0 += var19;
                                        arg1 += class756.field10986;
                                        arg5 += var20;
                                    }
                                }
                                if (!class278.method2286(arg7, arg1, (arg5 >> 12) + 1, (arg9 >> 12) - 1, var23, 0, (byte) 125, class21.field249)) {
                                    return false;
                                }
                                arg9 += var21;
                                arg7 += var24;
                                arg1 += class756.field10986;
                                arg5 += var20;
                            }
                        }
                    } else {
                        arg0 = arg9 <<= 0xC;
                        arg5 <<= 0xC;
                        if (arg1 < 0) {
                            arg0 -= arg1 * var20;
                            arg9 -= arg1 * var21;
                            arg7 -= arg1 * var24;
                            arg1 = 0;
                        }
                        if (arg8 < 0) {
                            arg5 -= arg8 * var19;
                            arg8 = 0;
                        }
                        if (var21 <= var20) {
                            arg3 -= arg8;
                            arg8 -= arg1;
                            arg1 = class756.field10986 * arg1;
                            while (true) {
                                arg8--;
                                if (arg8 < 0) {
                                    while (true) {
                                        arg3--;
                                        if (arg3 < 0) {
                                            return true;
                                        }
                                        if (!class278.method2286(arg7, arg1, (arg5 >> 12) + 1, (arg9 >> 12) + -1, var23, 0, (byte) 126, class21.field249)) {
                                            return false;
                                        }
                                        arg5 += var19;
                                        arg7 += var24;
                                        arg1 += class756.field10986;
                                        arg9 += var21;
                                    }
                                }
                                if (!class278.method2286(arg7, arg1, (arg0 >> 12) + 1, (arg9 >> 12) + -1, var23, 0, (byte) 118, class21.field249)) {
                                    return false;
                                }
                                arg0 += var20;
                                arg1 += class756.field10986;
                                arg9 += var21;
                                arg7 += var24;
                            }
                        } else {
                            arg3 -= arg8;
                            arg8 -= arg1;
                            arg1 = class756.field10986 * arg1;
                            while (true) {
                                arg8--;
                                if (arg8 < 0) {
                                    while (true) {
                                        arg3--;
                                        if (arg3 < 0) {
                                            return true;
                                        }
                                        if (!class278.method2286(arg7, arg1, (arg9 >> 12) + 1, (arg5 >> 12) - 1, var23, 0, (byte) 120, class21.field249)) {
                                            return false;
                                        }
                                        arg5 += var19;
                                        arg7 += var24;
                                        arg9 += var21;
                                        arg1 += class756.field10986;
                                    }
                                }
                                if (!class278.method2286(arg7, arg1, (arg9 >> 12) + 1, (arg0 >> 12) - 1, var23, 0, (byte) 119, class21.field249)) {
                                    return false;
                                }
                                arg0 += var20;
                                arg7 += var24;
                                arg1 += class756.field10986;
                                arg9 += var21;
                            }
                        }
                    }
                } else if (class58.field617 <= arg8) {
                    return true;
                } else {
                    arg6 = (arg6 << 8) + var23 - (arg5 * var23);
                    if (arg1 > class58.field617) {
                        arg1 = class58.field617;
                    }
                    if (class58.field617 < arg3) {
                        arg3 = class58.field617;
                    }
                    if (arg3 <= arg1) {
                        arg9 = arg5 <<= 0xC;
                        arg0 <<= 0xC;
                        if (arg8 < 0) {
                            arg5 -= arg8 * var20;
                            arg6 -= arg8 * var24;
                            arg9 -= arg8 * var19;
                            arg8 = 0;
                        }
                        if (arg3 < 0) {
                            arg0 -= arg3 * var21;
                            arg3 = 0;
                        }
                        if (var20 > var19) {
                            arg1 -= arg3;
                            arg3 -= arg8;
                            arg8 = class756.field10986 * arg8;
                            while (true) {
                                arg3--;
                                if (arg3 < 0) {
                                    while (true) {
                                        arg1--;
                                        if (arg1 < 0) {
                                            return true;
                                        }
                                        if (!class278.method2286(arg6, arg8, (arg5 >> 12) + 1, (arg0 >> 12) - 1, var23, 0, (byte) 125, class21.field249)) {
                                            return false;
                                        }
                                        arg6 += var24;
                                        arg5 += var20;
                                        arg8 += class756.field10986;
                                        arg0 += var21;
                                    }
                                }
                                if (!class278.method2286(arg6, arg8, (arg5 >> 12) + 1, (arg9 >> 12) + -1, var23, 0, (byte) 119, class21.field249)) {
                                    return false;
                                }
                                arg6 += var24;
                                arg9 += var19;
                                arg5 += var20;
                                arg8 += class756.field10986;
                            }
                        } else {
                            arg1 -= arg3;
                            arg3 -= arg8;
                            arg8 = class756.field10986 * arg8;
                            while (true) {
                                arg3--;
                                if (arg3 < 0) {
                                    while (true) {
                                        arg1--;
                                        if (arg1 < 0) {
                                            return true;
                                        }
                                        if (!class278.method2286(arg6, arg8, (arg0 >> 12) + 1, (arg5 >> 12) + -1, var23, 0, (byte) 127, class21.field249)) {
                                            return false;
                                        }
                                        arg8 += class756.field10986;
                                        arg5 += var20;
                                        arg0 += var21;
                                        arg6 += var24;
                                    }
                                }
                                if (!class278.method2286(arg6, arg8, (arg9 >> 12) + 1, (arg5 >> 12) + -1, var23, 0, (byte) 121, class21.field249)) {
                                    return false;
                                }
                                arg9 += var19;
                                arg5 += var20;
                                arg8 += class756.field10986;
                                arg6 += var24;
                            }
                        }
                    } else {
                        arg0 = arg5 <<= 0xC;
                        arg9 <<= 0xC;
                        if (arg8 < 0) {
                            arg6 -= arg8 * var24;
                            arg0 -= arg8 * var19;
                            arg5 -= arg8 * var20;
                            arg8 = 0;
                        }
                        if (arg1 < 0) {
                            arg9 -= arg1 * var21;
                            arg1 = 0;
                        }
                        if (arg1 != arg8 && var19 < var20 || arg1 == arg8 && var21 < var19) {
                            arg3 -= arg1;
                            arg1 -= arg8;
                            arg8 = class756.field10986 * arg8;
                            while (true) {
                                arg1--;
                                if (arg1 < 0) {
                                    while (true) {
                                        arg3--;
                                        if (arg3 < 0) {
                                            return true;
                                        }
                                        if (!class278.method2286(arg6, arg8, (arg9 >> 12) + 1, (arg0 >> 12) + -1, var23, 0, (byte) 124, class21.field249)) {
                                            return false;
                                        }
                                        arg0 += var19;
                                        arg8 += class756.field10986;
                                        arg9 += var21;
                                        arg6 += var24;
                                    }
                                }
                                if (!class278.method2286(arg6, arg8, (arg5 >> 12) + 1, (arg0 >> 12) + -1, var23, 0, (byte) 126, class21.field249)) {
                                    return false;
                                }
                                arg0 += var19;
                                arg5 += var20;
                                arg6 += var24;
                                arg8 += class756.field10986;
                            }
                        } else {
                            arg3 -= arg1;
                            arg1 -= arg8;
                            arg8 = class756.field10986 * arg8;
                            while (true) {
                                arg1--;
                                if (arg1 < 0) {
                                    while (true) {
                                        arg3--;
                                        if (arg3 < 0) {
                                            return true;
                                        }
                                        if (!class278.method2286(arg6, arg8, (arg0 >> 12) + 1, (arg9 >> 12) + -1, var23, 0, (byte) 121, class21.field249)) {
                                            return false;
                                        }
                                        arg0 += var19;
                                        arg9 += var21;
                                        arg6 += var24;
                                        arg8 += class756.field10986;
                                    }
                                }
                                if (!class278.method2286(arg6, arg8, (arg0 >> 12) + 1, (arg5 >> 12) + -1, var23, 0, (byte) 127, class21.field249)) {
                                    return false;
                                }
                                arg6 += var24;
                                arg8 += class756.field10986;
                                arg5 += var20;
                                arg0 += var19;
                            }
                        }
                    }
                }
            } else {
                return false;
            }
        } catch (RuntimeException var26) {
            throw class759.method5498(var26, field4232[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)V")
    public static void method2311(int arg0) {
        try {
            field4226 = null;
            field4222 = null;
            if (arg0 >= 33) {
                field4230 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field4232[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Z)I")
    public static final int method2312(boolean arg0) {
        try {
            field4227++;
            if (arg0) {
                method2312(true);
            }
            return 16;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field4232[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(J[I[S[S)V")
    public class282(long arg0, int[] arg1, short[] arg2, short[] arg3) {
        try {
            this.field4224 = arg2;
            this.field4229 = arg1;
            this.field4228 = arg3;
            this.field4225 = arg0;
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field4232[4] + arg0 + ',' + (arg1 == null ? field4232[2] : field4232[3]) + ',' + (arg2 == null ? field4232[2] : field4232[3]) + ',' + (arg3 == null ? field4232[2] : field4232[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "()V")
    protected class282() {
    }

    @OriginalMember(owner = "client!rn", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2313(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x59);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!rn", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2314(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 3;
                    break;
                case 1:
                    var10005 = 57;
                    break;
                case 2:
                    var10005 = 55;
                    break;
                case 3:
                    var10005 = 22;
                    break;
                default:
                    var10005 = 89;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
