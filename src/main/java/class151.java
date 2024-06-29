import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class151 {

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "[I")
    public static int[] field2322 = new int[32];

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "Lik;")
    public static class410 field2308 = new class410(64);

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "I")
    public static int field2324 = 0;

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "I")
    public static int field2323 = -1;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    public static int field2301;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
    public static int field2305;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
    public static int field2307;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "I")
    public static int field2310;

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "I")
    public static int field2311;

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "I")
    public int field2312;

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "I")
    public int field2313;

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "I")
    public static int field2314;

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "I")
    public int field2316;

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "I")
    public static int field2319;

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "I")
    public int field2320;

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "[[I")
    public int[][] field2303;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZIIIZIB)V")
    public final void method1152(boolean arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, byte arg6) {
        field2307++;
        int var8 = 256;
        if (arg4) {
            var8 |= 0x20000;
        }
        if (arg6 != 126) {
            this.method1164(94, -113, true, true, 94, -38, 33);
        }
        int var9 = arg1 - this.field2320;
        int var10 = arg5 - this.field2316;
        if (arg0) {
            var8 |= 0x40000000;
        }
        for (int var11 = var9; var11 < (arg2 + var9); var11++) {
            if (var11 >= 0 && var11 < this.field2312) {
                for (int var12 = var10; var12 < arg3 + var10; var12++) {
                    if (var12 >= 0 && var12 < this.field2313) {
                        this.method1153(var12, var8, 80, var11);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)V")
    private final void method1153(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 < 32) {
            this.field2313 = -117;
        }
        field2305++;
        this.field2303[arg3][arg0] = class260.method1678(this.field2303[arg3][arg0], arg1);
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIII)V")
    private final void method1154(int arg0, int arg1, int arg2, int arg3) {
        this.field2303[arg0][arg3] = class323.method2059(this.field2303[arg0][arg3], ~arg1);
        field2302++;
        if (arg2 > -14) {
            field2323 = 32;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(BIIIIIII)Z")
    public final boolean method1155(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2301++;
        if (arg1 == 1) {
            if (arg2 == arg5 && arg4 == arg6) {
                return true;
            }
        } else if (arg5 <= arg2 && arg5 + arg1 - 1 >= arg2 && arg4 >= arg4 && (arg1 + arg4 - 1) >= arg4) {
            return true;
        }
        int var9 = arg6 - this.field2316;
        int var10 = arg5 - this.field2320;
        if (arg0 != 36) {
            field2322 = null;
        }
        int var11 = arg2 - this.field2320;
        int var12 = arg4 - this.field2316;
        if (arg1 == 1) {
            if (arg3 == 0) {
                if (arg7 == 0) {
                    if ((var11 - 1) == var10 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9 && (this.field2303[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 - 1) == var9 && (this.field2303[var10][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if (var10 == var11 && (var12 + 1) == var9) {
                        return true;
                    }
                    if (var11 - 1 == var10 && var9 == var12 && (this.field2303[var10][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var10 && var9 == var12 && (this.field2303[var10][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if ((var11 + 1) == var10 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9 && (this.field2303[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 - 1) == var9 && (this.field2303[var10][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if (var10 == var11 && var12 - 1 == var9) {
                        return true;
                    }
                    if ((var11 - 1) == var10 && var9 == var12 && (this.field2303[var10][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var10 && var9 == var12 && (this.field2303[var10][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 2) {
                if (arg7 == 0) {
                    if ((var11 - 1) == var10 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var12 + 1 == var9) {
                        return true;
                    }
                    if ((var11 + 1) == var10 && var9 == var12 && (this.field2303[var10][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 - 1) == var9 && (this.field2303[var10][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if ((var11 - 1) == var10 && var9 == var12 && (this.field2303[var10][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 + 1 == var9) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var9 && (this.field2303[var10][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if (var11 - 1 == var10 && var9 == var12 && (this.field2303[var10][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 + 1 == var9 && (this.field2303[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var10 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var9) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if ((var11 - 1) == var10 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var12 + 1 == var9 && (this.field2303[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var10 && var9 == var12 && (this.field2303[var10][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var9) {
                        return true;
                    }
                }
            }
            if (arg3 == 9) {
                if (var10 == var11 && var12 + 1 == var9 && (this.field2303[var10][var9] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var11 && var12 - 1 == var9 && (this.field2303[var10][var9] & 0x2) == 0) {
                    return true;
                }
                if (var11 - 1 == var10 && var9 == var12 && (this.field2303[var10][var9] & 0x8) == 0) {
                    return true;
                }
                if ((var11 + 1) == var10 && var9 == var12 && (this.field2303[var10][var9] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var10 + arg1 - 1;
            int var14 = arg1 + var9 - 1;
            if (arg3 == 0) {
                if (arg7 == 0) {
                    if ((var11 - arg1) == var10 && var9 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var10 <= var11 && var13 >= var11 && var12 + 1 == var9 && (this.field2303[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 >= var10 && var11 <= var13 && var12 - arg1 == var9 && (this.field2303[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if (var11 >= var10 && var13 >= var11 && var12 + 1 == var9) {
                        return true;
                    }
                    if (var11 - arg1 == var10 && var9 <= var12 && var12 <= var14 && (this.field2303[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var9 <= var12 && var14 >= var12 && (this.field2303[var10][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if (var11 + 1 == var10 && var12 >= var9 && var14 >= var12) {
                        return true;
                    }
                    if (var10 <= var11 && var11 <= var13 && var12 + 1 == var9 && (this.field2303[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 >= var10 && var11 <= var13 && var12 - arg1 == var9 && (this.field2303[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if (var10 <= var11 && var11 <= var13 && (var12 - arg1) == var9) {
                        return true;
                    }
                    if ((var11 - arg1) == var10 && var9 <= var12 && var12 <= var14 && (this.field2303[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var10 && var9 <= var12 && var12 <= var14 && (this.field2303[var10][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 2) {
                if (arg7 == 0) {
                    if (var11 - arg1 == var10 && var12 >= var9 && var14 >= var12) {
                        return true;
                    }
                    if (var10 <= var11 && var11 <= var13 && (var12 + 1) == var9) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var12 >= var9 && var14 >= var12 && (this.field2303[var10][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 <= var11 && var11 <= var13 && var12 - arg1 == var9 && (this.field2303[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if (var11 - arg1 == var10 && var12 >= var9 && var14 >= var12 && (this.field2303[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 >= var10 && var13 >= var11 && var12 + 1 == var9) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var9 <= var12 && var14 >= var12) {
                        return true;
                    }
                    if (var10 <= var11 && var13 >= var11 && (var12 - arg1) == var9 && (this.field2303[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if ((var11 - arg1) == var10 && var9 <= var12 && var12 <= var14 && (this.field2303[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 >= var10 && var13 >= var11 && (var12 + 1) == var9 && (this.field2303[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var10 && var12 >= var9 && var12 <= var14) {
                        return true;
                    }
                    if (var11 >= var10 && var13 >= var11 && var12 - arg1 == var9) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if (var11 - arg1 == var10 && var12 >= var9 && var14 >= var12) {
                        return true;
                    }
                    if (var11 >= var10 && var13 >= var11 && (var12 + 1) == var9 && (this.field2303[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var12 >= var9 && var12 <= var14 && (this.field2303[var10][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 <= var11 && var11 <= var13 && (var12 - arg1) == var9) {
                        return true;
                    }
                }
            }
            if (arg3 == 9) {
                if (var10 <= var11 && var11 <= var13 && (var12 + 1) == var9 && (this.field2303[var11][var9] & 0x2C0120) == 0) {
                    return true;
                }
                if (var10 <= var11 && var13 >= var11 && var12 - arg1 == var9 && (this.field2303[var11][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if (var11 - arg1 == var10 && var12 >= var9 && var12 <= var14 && (this.field2303[var13][var12] & 0x2C0108) == 0) {
                    return true;
                }
                if (var11 + 1 == var10 && var12 >= var9 && var14 >= var12 && (this.field2303[var10][var12] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIII)Z")
    public final boolean method1156(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2310++;
        if (arg1 < arg5) {
            return class448.method2791(arg7, arg4, arg3, (byte) 119, arg5, arg6, arg8, arg2, arg5) ? true : this.method1161(arg5, arg2, arg6, (byte) -59, arg4, arg3, arg8, arg0, arg7, arg5);
        }
        int var10 = arg7 + arg3 - 1;
        int var11 = arg2 + arg8 - 1;
        if (arg3 <= arg4 && arg4 <= var10 && arg6 >= arg2 && var11 >= arg6) {
            return true;
        } else if (arg3 - 1 == arg4 && arg6 >= arg2 && arg6 <= var11 && (this.field2303[arg4 - this.field2320][arg6 - this.field2316] & 0x8) == 0 && (arg0 & 0x8) == 0) {
            return true;
        } else if ((var10 + 1) == arg4 && arg2 <= arg6 && var11 >= arg6 && (this.field2303[arg4 - this.field2320][arg6 - this.field2316] & 0x80) == 0 && (arg0 & 0x2) == 0) {
            return true;
        } else if ((arg2 - 1) == arg6 && arg4 >= arg3 && var10 >= arg4 && (this.field2303[arg4 - this.field2320][arg6 - this.field2316] & 0x2) == 0 && (arg0 & 0x4) == 0) {
            return true;
        } else {
            return var11 + 1 == arg6 && arg4 >= arg3 && arg4 <= var10 && (this.field2303[arg4 - this.field2320][arg6 - this.field2316] & 0x20) == 0 && (arg0 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
    public static void method1157(int arg0) {
        field2322 = null;
        if (arg0 != 8) {
            method1162(-16, (String) null, false, (class427) null);
        }
        field2308 = null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IZI)V")
    public final void method1158(int arg0, boolean arg1, int arg2) {
        field2318++;
        if (arg1) {
            int var4 = arg0 - this.field2316;
            int var5 = arg2 - this.field2320;
            this.field2303[var5][var4] = class323.method2059(this.field2303[var5][var4], -2097153);
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
    public final void method1159(int arg0) {
        field2317++;
        int var2 = 0;
        if (arg0 != 3340) {
            method1157(-69);
        }
        while (this.field2312 > var2) {
            for (int var3 = 0; var3 < this.field2313; var3++) {
                if (var2 == 0 || var3 == 0 || (this.field2312 - 5) <= var2 || this.field2313 - 5 <= var3) {
                    this.field2303[var2][var3] = -1;
                } else {
                    this.field2303[var2][var3] = 2097152;
                }
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(III)V")
    public final void method1160(int arg0, int arg1, int arg2) {
        if (arg1 != -23407) {
            this.method1165(23, -25, -122, 90, -123, 15, 56, -2);
        }
        int var4 = arg0 - this.field2316;
        field2315++;
        int var5 = arg2 - this.field2320;
        this.field2303[var5][var4] = class260.method1678(this.field2303[var5][var4], 2097152);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIBIIIIII)Z")
    public final boolean method1161(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2321++;
        int var11 = arg0 + arg4;
        int var12 = arg2 + arg9;
        int var13 = arg5 + arg8;
        if (arg3 >= -19) {
            this.field2320 = 105;
        }
        int var14 = arg1 + arg6;
        if (arg4 == var13 && (arg7 & 0x2) == 0) {
            int var15 = arg1 >= arg2 ? arg1 : arg2;
            int var16 = var12 < var14 ? var12 : var14;
            while (var16 > var15) {
                if ((this.field2303[var13 - this.field2320 - 1][var15 - this.field2316] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg5 == var11 && (arg7 & 0x8) == 0) {
            int var17 = arg2 > arg1 ? arg2 : arg1;
            int var18 = var12 < var14 ? var12 : var14;
            while (var18 > var17) {
                if ((this.field2303[arg5 - this.field2320][var17 - this.field2316] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg2 == var14 && (arg7 & 0x1) == 0) {
            int var19 = arg4 > arg5 ? arg4 : arg5;
            int var20 = var13 <= var11 ? var13 : var11;
            while (var19 < var20) {
                if ((this.field2303[var19 - this.field2320][var14 - this.field2316 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg1 == var12 && (arg7 & 0x4) == 0) {
            int var21 = arg5 >= arg4 ? arg5 : arg4;
            int var22 = var13 <= var11 ? var13 : var11;
            while (var21 < var22) {
                if ((this.field2303[var21 - this.field2320][arg1 - this.field2316] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILjava/lang/String;ZLrk;)Llq;")
    public static final class75 method1162(int arg0, String arg1, boolean arg2, class427 arg3) {
        field2306++;
        int var4 = arg3.method2643(arg1, -1);
        if (var4 == -1) {
            return new class75(0);
        }
        int[] var5 = arg3.method2641(var4, arg0 ^ 0xFFFFFF83);
        class75 var6 = new class75(var5.length);
        int var7 = 0;
        int var8 = 0;
        while (true) {
            while (var6.field1116 > var7) {
                class289 var9 = new class289(arg3.method2633(var5[var8++], -1, var4));
                int var10 = var9.method1856((byte) 74);
                int var11 = var9.method1853(-25);
                int var12 = var9.method1861((byte) -72);
                if (!arg2 && var12 == 1) {
                    var6.field1116--;
                } else {
                    var6.field1121[var7] = var10;
                    var6.field1117[var7] = var11;
                    var7++;
                }
            }
            if (arg0 != 1) {
                field2308 = null;
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IZIZIIIB)V")
    public final void method1163(int arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, byte arg7) {
        field2311++;
        int var9 = 256;
        if (arg1) {
            var9 |= 0x20000;
        }
        if (arg4 == 1 || arg4 == 3) {
            int var10 = arg2;
            arg2 = arg0;
            arg0 = var10;
        }
        if (arg3) {
            var9 |= 0x40000000;
        }
        int var11 = arg5 - this.field2316;
        int var12 = arg6 - this.field2320;
        int var13 = var12;
        if (arg7 > -107) {
            field2322 = null;
        }
        while (var13 < (arg2 + var12)) {
            if (var13 >= 0 && var13 < this.field2312) {
                for (int var14 = var11; var14 < (var11 + arg0); var14++) {
                    if (var14 >= 0 && this.field2313 > var14) {
                        this.method1154(var13, var9, -94, var14);
                    }
                }
            }
            var13++;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIZZIII)V")
    public final void method1164(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6) {
        int var8 = arg4 - this.field2320;
        field2309++;
        int var9 = arg6 - this.field2316;
        if (arg5 == 0) {
            if (arg1 == 0) {
                this.method1153(var9, 128, arg0 ^ 0xE24, var8);
                this.method1153(var9, 8, 99, var8 - 1);
            }
            if (arg1 == 1) {
                this.method1153(var9, 2, 94, var8);
                this.method1153(var9 + 1, 32, 68, var8);
            }
            if (arg1 == 2) {
                this.method1153(var9, 8, 110, var8);
                this.method1153(var9, 128, 70, var8 + 1);
            }
            if (arg1 == 3) {
                this.method1153(var9, 32, arg0 - 3555, var8);
                this.method1153(var9 - 1, 2, arg0 - 3543, var8);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg1 == 0) {
                this.method1153(var9, 1, 114, var8);
                this.method1153(var9 + 1, 16, 74, var8 - 1);
            }
            if (arg1 == 1) {
                this.method1153(var9, 4, 120, var8);
                this.method1153(var9 + 1, 64, 61, var8 + 1);
            }
            if (arg1 == 2) {
                this.method1153(var9, 16, 55, var8);
                this.method1153(var9 - 1, 1, arg0 - 3489, var8 + 1);
            }
            if (arg1 == 3) {
                this.method1153(var9, 64, 98, var8);
                this.method1153(var9 - 1, 4, arg0 ^ 0xE20, var8 - 1);
            }
        }
        if (arg0 != 3610) {
            method1157(25);
        }
        if (arg5 == 2) {
            if (arg1 == 0) {
                this.method1153(var9, 130, 73, var8);
                this.method1153(var9, 8, arg0 ^ 0xE5C, var8 - 1);
                this.method1153(var9 + 1, 32, 35, var8);
            }
            if (arg1 == 1) {
                this.method1153(var9, 10, 94, var8);
                this.method1153(var9 + 1, 32, 55, var8);
                this.method1153(var9, 128, 79, var8 + 1);
            }
            if (arg1 == 2) {
                this.method1153(var9, 40, 98, var8);
                this.method1153(var9, 128, arg0 ^ 0xE3C, var8 + 1);
                this.method1153(var9 - 1, 2, 117, var8);
            }
            if (arg1 == 3) {
                this.method1153(var9, 160, arg0 ^ 0xE70, var8);
                this.method1153(var9 - 1, 2, 95, var8);
                this.method1153(var9, 8, arg0 - 3506, var8 + -1);
            }
        }
        if (arg3) {
            if (arg5 == 0) {
                if (arg1 == 0) {
                    this.method1153(var9, 65536, arg0 ^ 0xE7C, var8);
                    this.method1153(var9, 4096, 37, var8 - 1);
                }
                if (arg1 == 1) {
                    this.method1153(var9, 1024, 55, var8);
                    this.method1153(var9 + 1, 16384, arg0 ^ 0xE67, var8);
                }
                if (arg1 == 2) {
                    this.method1153(var9, 4096, arg0 ^ 0xE2D, var8);
                    this.method1153(var9, 65536, 121, var8 + 1);
                }
                if (arg1 == 3) {
                    this.method1153(var9, 16384, 127, var8);
                    this.method1153(var9 - 1, 1024, 72, var8);
                }
            }
            if (arg5 == 1 || arg5 == 3) {
                if (arg1 == 0) {
                    this.method1153(var9, 512, 48, var8);
                    this.method1153(var9 + 1, 8192, 37, var8 - 1);
                }
                if (arg1 == 1) {
                    this.method1153(var9, 2048, 58, var8);
                    this.method1153(var9 + 1, 32768, 99, var8 + 1);
                }
                if (arg1 == 2) {
                    this.method1153(var9, 8192, 36, var8);
                    this.method1153(var9 - 1, 512, 92, var8 + 1);
                }
                if (arg1 == 3) {
                    this.method1153(var9, 32768, 73, var8);
                    this.method1153(var9 - 1, 2048, arg0 ^ 0xE73, var8 - 1);
                }
            }
            if (arg5 == 2) {
                if (arg1 == 0) {
                    this.method1153(var9, 66560, 50, var8);
                    this.method1153(var9, 4096, 37, var8 - 1);
                    this.method1153(var9 + 1, 16384, arg0 ^ 0xE41, var8);
                }
                if (arg1 == 1) {
                    this.method1153(var9, 5120, arg0 - 3502, var8);
                    this.method1153(var9 + 1, 16384, arg0 ^ 0xE3C, var8);
                    this.method1153(var9, 65536, 115, var8 + 1);
                }
                if (arg1 == 2) {
                    this.method1153(var9, 20480, 39, var8);
                    this.method1153(var9, 65536, 105, var8 + 1);
                    this.method1153(var9 - 1, 1024, 39, var8);
                }
                if (arg1 == 3) {
                    this.method1153(var9, 81920, arg0 ^ 0xE2C, var8);
                    this.method1153(var9 - 1, 1024, 93, var8);
                    this.method1153(var9, 4096, arg0 ^ 0xE56, var8 - 1);
                }
            }
        }
        if (!arg2) {
            return;
        }
        if (arg5 == 0) {
            if (arg1 == 0) {
                this.method1153(var9, 536870912, arg0 ^ 0xE47, var8);
                this.method1153(var9, 33554432, 112, var8 - 1);
            }
            if (arg1 == 1) {
                this.method1153(var9, 8388608, 73, var8);
                this.method1153(var9 + 1, 134217728, arg0 - 3552, var8);
            }
            if (arg1 == 2) {
                this.method1153(var9, 33554432, 37, var8);
                this.method1153(var9, 536870912, 90, var8 + 1);
            }
            if (arg1 == 3) {
                this.method1153(var9, 134217728, arg0 ^ 0xE72, var8);
                this.method1153(var9 - 1, 8388608, 97, var8);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg1 == 0) {
                this.method1153(var9, 4194304, arg0 ^ 0xE72, var8);
                this.method1153(var9 + 1, 67108864, 115, var8 - 1);
            }
            if (arg1 == 1) {
                this.method1153(var9, 16777216, 44, var8);
                this.method1153(var9 + 1, 268435456, 33, var8 + 1);
            }
            if (arg1 == 2) {
                this.method1153(var9, 67108864, 54, var8);
                this.method1153(var9 - 1, 4194304, arg0 - 3497, var8 + 1);
            }
            if (arg1 == 3) {
                this.method1153(var9, 268435456, arg0 ^ 0xE50, var8);
                this.method1153(var9 - 1, 16777216, 39, var8 - 1);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method1153(var9, 545259520, 97, var8);
            this.method1153(var9, 33554432, 48, var8 - 1);
            this.method1153(var9 + 1, 134217728, 105, var8);
        }
        if (arg1 == 1) {
            this.method1153(var9, 41943040, 37, var8);
            this.method1153(var9 + 1, 134217728, 102, var8);
            this.method1153(var9, 536870912, 65, var8 + 1);
        }
        if (arg1 == 2) {
            this.method1153(var9, 167772160, 49, var8);
            this.method1153(var9, 536870912, arg0 - 3545, var8 + 1);
            this.method1153(var9 - 1, 8388608, 84, var8);
        }
        if (arg1 == 3) {
            this.method1153(var9, 671088640, 107, var8);
            this.method1153(var9 - 1, 8388608, 123, var8);
            this.method1153(var9, 33554432, 96, var8 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method1165(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2304++;
        if (arg2 == 1) {
            if (arg5 == arg7 && arg4 == arg6) {
                return true;
            }
        } else if (arg5 <= arg7 && arg7 <= arg2 + arg5 - 1 && arg4 <= arg4 && arg4 <= arg2 + arg4 - 1) {
            return true;
        }
        int var9 = arg4 - this.field2316;
        int var10 = arg6 - this.field2316;
        int var11 = arg5 - this.field2320;
        int var12 = arg7 - this.field2320;
        if (arg3 != -15410) {
            return true;
        }
        if (arg2 == 1) {
            if (arg0 == 6 || arg0 == 7) {
                if (arg0 == 7) {
                    arg1 = arg1 + 2 & 0x3;
                }
                if (arg1 == 0) {
                    if ((var12 + 1) == var11 && var9 == var10 && (this.field2303[var11][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var9 - 1) == var10 && (this.field2303[var11][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var12 - 1 == var11 && var9 == var10 && (this.field2303[var11][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var9 - 1) == var10 && (this.field2303[var11][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if ((var12 - 1) == var11 && var9 == var10 && (this.field2303[var11][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 + 1 == var10 && (this.field2303[var11][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var12 + 1 == var11 && var9 == var10 && (this.field2303[var11][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var9 + 1) == var10 && (this.field2303[var11][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 8) {
                if (var11 == var12 && (var9 + 1) == var10 && (this.field2303[var11][var10] & 0x20) == 0) {
                    return true;
                }
                if (var11 == var12 && var9 - 1 == var10 && (this.field2303[var11][var10] & 0x2) == 0) {
                    return true;
                }
                if ((var12 - 1) == var11 && var9 == var10 && (this.field2303[var11][var10] & 0x8) == 0) {
                    return true;
                }
                if ((var12 + 1) == var11 && var9 == var10 && (this.field2303[var11][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var11 + arg2 - 1;
            int var14 = arg2 + var10 - 1;
            if (arg0 == 6 || arg0 == 7) {
                if (arg0 == 7) {
                    arg1 = arg1 + 2 & 0x3;
                }
                if (arg1 == 0) {
                    if ((var12 + 1) == var11 && var10 <= var9 && var14 >= var9 && (this.field2303[var11][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 >= var11 && var13 >= var12 && var9 - arg2 == var10 && (this.field2303[var12][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if ((var12 - arg2) == var11 && var9 >= var10 && var9 <= var14 && (this.field2303[var13][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 <= var12 && var13 >= var12 && (var9 - arg2) == var10 && (this.field2303[var12][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if ((var12 - arg2) == var11 && var10 <= var9 && var9 <= var14 && (this.field2303[var13][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 <= var12 && var12 <= var13 && (var9 + 1) == var10 && (this.field2303[var12][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var12 + 1 == var11 && var10 <= var9 && var9 <= var14 && (this.field2303[var11][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 <= var12 && var12 <= var13 && var9 + 1 == var10 && (this.field2303[var12][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 8) {
                if (var11 <= var12 && var13 >= var12 && var9 + 1 == var10 && (this.field2303[var12][var10] & 0x20) == 0) {
                    return true;
                }
                if (var12 >= var11 && var12 <= var13 && var9 - arg2 == var10 && (this.field2303[var12][var14] & 0x2) == 0) {
                    return true;
                }
                if ((var12 - arg2) == var11 && var9 >= var10 && var14 >= var9 && (this.field2303[var13][var9] & 0x8) == 0) {
                    return true;
                }
                if ((var12 + 1) == var11 && var9 >= var10 && var14 >= var9 && (this.field2303[var11][var9] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IZI)V")
    public final void method1166(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.method1166(-8, true, 11);
        }
        int var4 = arg0 - this.field2316;
        field2314++;
        int var5 = arg2 - this.field2320;
        this.field2303[var5][var4] = class260.method1678(this.field2303[var5][var4], 262144);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IZIZZII)V")
    public final void method1167(int arg0, boolean arg1, int arg2, boolean arg3, boolean arg4, int arg5, int arg6) {
        if (!arg3) {
            this.method1154(-85, 107, 71, 79);
        }
        int var8 = arg6 - this.field2316;
        int var9 = arg0 - this.field2320;
        field2319++;
        if (arg2 == 0) {
            if (arg5 == 0) {
                this.method1154(var9, 128, -16, var8);
                this.method1154(var9 - 1, 8, -22, var8);
            }
            if (arg5 == 1) {
                this.method1154(var9, 2, -29, var8);
                this.method1154(var9, 32, -44, var8 + 1);
            }
            if (arg5 == 2) {
                this.method1154(var9, 8, -42, var8);
                this.method1154(var9 + 1, 128, -69, var8);
            }
            if (arg5 == 3) {
                this.method1154(var9, 32, -65, var8);
                this.method1154(var9, 2, -70, var8 - 1);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg5 == 0) {
                this.method1154(var9, 1, -32, var8);
                this.method1154(var9 - 1, 16, -32, var8 + 1);
            }
            if (arg5 == 1) {
                this.method1154(var9, 4, -53, var8);
                this.method1154(var9 + 1, 64, -82, var8 + 1);
            }
            if (arg5 == 2) {
                this.method1154(var9, 16, -115, var8);
                this.method1154(var9 + 1, 1, -48, var8 - 1);
            }
            if (arg5 == 3) {
                this.method1154(var9, 64, -117, var8);
                this.method1154(var9 - 1, 4, -17, var8 - 1);
            }
        }
        if (arg2 == 2) {
            if (arg5 == 0) {
                this.method1154(var9, 130, -45, var8);
                this.method1154(var9 - 1, 8, -91, var8);
                this.method1154(var9, 32, -126, var8 + 1);
            }
            if (arg5 == 1) {
                this.method1154(var9, 10, -104, var8);
                this.method1154(var9, 32, -44, var8 + 1);
                this.method1154(var9 + 1, 128, -23, var8);
            }
            if (arg5 == 2) {
                this.method1154(var9, 40, -75, var8);
                this.method1154(var9 + 1, 128, -66, var8);
                this.method1154(var9, 2, -87, var8 - 1);
            }
            if (arg5 == 3) {
                this.method1154(var9, 160, -55, var8);
                this.method1154(var9, 2, -83, var8 - 1);
                this.method1154(var9 - 1, 8, -119, var8);
            }
        }
        if (arg1) {
            if (arg2 == 0) {
                if (arg5 == 0) {
                    this.method1154(var9, 65536, -28, var8);
                    this.method1154(var9 - 1, 4096, -72, var8);
                }
                if (arg5 == 1) {
                    this.method1154(var9, 1024, -126, var8);
                    this.method1154(var9, 16384, -120, var8 + 1);
                }
                if (arg5 == 2) {
                    this.method1154(var9, 4096, -77, var8);
                    this.method1154(var9 + 1, 65536, -67, var8);
                }
                if (arg5 == 3) {
                    this.method1154(var9, 16384, -22, var8);
                    this.method1154(var9, 1024, -48, var8 - 1);
                }
            }
            if (arg2 == 1 || arg2 == 3) {
                if (arg5 == 0) {
                    this.method1154(var9, 512, -16, var8);
                    this.method1154(var9 - 1, 8192, -38, var8 + 1);
                }
                if (arg5 == 1) {
                    this.method1154(var9, 2048, -37, var8);
                    this.method1154(var9 + 1, 32768, -74, var8 + 1);
                }
                if (arg5 == 2) {
                    this.method1154(var9, 8192, -116, var8);
                    this.method1154(var9 + 1, 512, -30, var8 - 1);
                }
                if (arg5 == 3) {
                    this.method1154(var9, 32768, -116, var8);
                    this.method1154(var9 - 1, 2048, -34, var8 - 1);
                }
            }
            if (arg2 == 2) {
                if (arg5 == 0) {
                    this.method1154(var9, 66560, -115, var8);
                    this.method1154(var9 - 1, 4096, -32, var8);
                    this.method1154(var9, 16384, -87, var8 + 1);
                }
                if (arg5 == 1) {
                    this.method1154(var9, 5120, -120, var8);
                    this.method1154(var9, 16384, -17, var8 + 1);
                    this.method1154(var9 + 1, 65536, -36, var8);
                }
                if (arg5 == 2) {
                    this.method1154(var9, 20480, -67, var8);
                    this.method1154(var9 + 1, 65536, -96, var8);
                    this.method1154(var9, 1024, -128, var8 - 1);
                }
                if (arg5 == 3) {
                    this.method1154(var9, 81920, -23, var8);
                    this.method1154(var9, 1024, -58, var8 - 1);
                    this.method1154(var9 - 1, 4096, -85, var8);
                }
            }
        }
        if (!arg4) {
            return;
        }
        if (arg2 == 0) {
            if (arg5 == 0) {
                this.method1154(var9, 536870912, -83, var8);
                this.method1154(var9 - 1, 33554432, -94, var8);
            }
            if (arg5 == 1) {
                this.method1154(var9, 8388608, -107, var8);
                this.method1154(var9, 134217728, -78, var8 + 1);
            }
            if (arg5 == 2) {
                this.method1154(var9, 33554432, -88, var8);
                this.method1154(var9 + 1, 536870912, -84, var8);
            }
            if (arg5 == 3) {
                this.method1154(var9, 134217728, -24, var8);
                this.method1154(var9, 8388608, -59, var8 - 1);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg5 == 0) {
                this.method1154(var9, 4194304, -109, var8);
                this.method1154(var9 - 1, 67108864, -95, var8 + 1);
            }
            if (arg5 == 1) {
                this.method1154(var9, 16777216, -33, var8);
                this.method1154(var9 + 1, 268435456, -25, var8 + 1);
            }
            if (arg5 == 2) {
                this.method1154(var9, 67108864, -87, var8);
                this.method1154(var9 + 1, 4194304, -125, var8 - 1);
            }
            if (arg5 == 3) {
                this.method1154(var9, 268435456, -91, var8);
                this.method1154(var9 - 1, 16777216, -16, var8 - 1);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method1154(var9, 545259520, -103, var8);
            this.method1154(var9 - 1, 33554432, -53, var8);
            this.method1154(var9, 134217728, -27, var8 + 1);
        }
        if (arg5 == 1) {
            this.method1154(var9, 41943040, -95, var8);
            this.method1154(var9, 134217728, -41, var8 + 1);
            this.method1154(var9 + 1, 536870912, -47, var8);
        }
        if (arg5 == 2) {
            this.method1154(var9, 167772160, -104, var8);
            this.method1154(var9 + 1, 536870912, -43, var8);
            this.method1154(var9, 8388608, -117, var8 - 1);
        }
        if (arg5 == 3) {
            this.method1154(var9, 671088640, -78, var8);
            this.method1154(var9, 8388608, -80, var8 - 1);
            this.method1154(var9 - 1, 33554432, -111, var8);
            return;
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(III)V")
    public final void method1168(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field2320;
        int var5 = arg2 - this.field2316;
        field2300++;
        if (arg0 < 32) {
            field2323 = 113;
        }
        this.field2303[var4][var5] = class323.method2059(this.field2303[var4][var5], -262145);
    }
}
