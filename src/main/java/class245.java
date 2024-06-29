import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class245 {

    @OriginalMember(owner = "client!sl", name = "g", descriptor = "Lpn;")
    public static class361 field3296 = new class361();

    @OriginalMember(owner = "client!sl", name = "z", descriptor = "Z")
    public static boolean field3315 = false;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "I")
    public static int field3292;

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!sl", name = "h", descriptor = "I")
    public static int field3297;

    @OriginalMember(owner = "client!sl", name = "i", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!sl", name = "j", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!sl", name = "l", descriptor = "I")
    public static int field3301;

    @OriginalMember(owner = "client!sl", name = "m", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!sl", name = "n", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!sl", name = "o", descriptor = "I")
    public static int field3304;

    @OriginalMember(owner = "client!sl", name = "p", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!sl", name = "q", descriptor = "I")
    public int field3306;

    @OriginalMember(owner = "client!sl", name = "r", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!sl", name = "s", descriptor = "I")
    public int field3308;

    @OriginalMember(owner = "client!sl", name = "t", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!sl", name = "u", descriptor = "I")
    public static int field3310;

    @OriginalMember(owner = "client!sl", name = "v", descriptor = "I")
    public static int field3311;

    @OriginalMember(owner = "client!sl", name = "w", descriptor = "I")
    public int field3312;

    @OriginalMember(owner = "client!sl", name = "x", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!sl", name = "y", descriptor = "I")
    public int field3314;

    @OriginalMember(owner = "client!sl", name = "k", descriptor = "[[I")
    public int[][] field3300;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIIIBIII)Z", line = 4)
    public final boolean method1497(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        if (arg4 != 12) {
            method1498(80, 50, -53);
        }
        field3294++;
        if (arg1 == 1) {
            if (arg3 == arg7 && arg0 == arg6) {
                return true;
            }
        } else if (arg7 <= arg3 && (arg1 + arg7 - 1) >= arg3 && arg0 >= arg0 && arg0 <= arg1 + arg0 - 1) {
            return true;
        }
        int var9 = arg7 - this.field3312;
        int var10 = arg3 - this.field3312;
        int var11 = arg6 - this.field3308;
        int var12 = arg0 - this.field3308;
        if (arg1 == 1) {
            if (arg5 == 0) {
                if (arg2 == 0) {
                    if (var10 - 1 == var9 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var12 + 1 == var11 && (this.field3300[var9][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var12 - 1) == var11 && (this.field3300[var9][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var9 == var10 && var12 + 1 == var11) {
                        return true;
                    }
                    if (var10 - 1 == var9 && var11 == var12 && (this.field3300[var9][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var9 && var11 == var12 && (this.field3300[var9][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if (var10 + 1 == var9 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && (var12 + 1) == var11 && (this.field3300[var9][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var12 - 1 == var11 && (this.field3300[var9][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var9 == var10 && var12 - 1 == var11) {
                        return true;
                    }
                    if (var10 - 1 == var9 && var11 == var12 && (this.field3300[var9][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var9 && var11 == var12 && (this.field3300[var9][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 2) {
                if (arg2 == 0) {
                    if ((var10 - 1) == var9 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var12 + 1 == var11) {
                        return true;
                    }
                    if (var10 + 1 == var9 && var11 == var12 && (this.field3300[var9][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var12 - 1) == var11 && (this.field3300[var9][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var10 - 1 == var9 && var11 == var12 && (this.field3300[var9][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var12 + 1 == var11) {
                        return true;
                    }
                    if (var10 + 1 == var9 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var12 - 1 == var11 && (this.field3300[var9][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if ((var10 - 1) == var9 && var11 == var12 && (this.field3300[var9][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var12 + 1) == var11 && (this.field3300[var9][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var9 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && (var12 - 1) == var11) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var10 - 1 == var9 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && (var12 + 1) == var11 && (this.field3300[var9][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var9 && var11 == var12 && (this.field3300[var9][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var12 - 1) == var11) {
                        return true;
                    }
                }
            }
            if (arg5 == 9) {
                if (var9 == var10 && var12 + 1 == var11 && (this.field3300[var9][var11] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var10 && (var12 - 1) == var11 && (this.field3300[var9][var11] & 0x2) == 0) {
                    return true;
                }
                if ((var10 - 1) == var9 && var11 == var12 && (this.field3300[var9][var11] & 0x8) == 0) {
                    return true;
                }
                if ((var10 + 1) == var9 && var11 == var12 && (this.field3300[var9][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var9 + arg1 - 1;
            int var14 = arg1 + var11 - 1;
            if (arg5 == 0) {
                if (arg2 == 0) {
                    if (var10 - arg1 == var9 && var11 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var10 >= var9 && var10 <= var13 && (var12 + 1) == var11 && (this.field3300[var10][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 >= var9 && var10 <= var13 && (var12 - arg1) == var11 && (this.field3300[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var10 >= var9 && var10 <= var13 && var12 + 1 == var11) {
                        return true;
                    }
                    if ((var10 - arg1) == var9 && var11 <= var12 && var12 <= var14 && (this.field3300[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var9 && var12 >= var11 && var12 <= var14 && (this.field3300[var9][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if ((var10 + 1) == var9 && var12 >= var11 && var14 >= var12) {
                        return true;
                    }
                    if (var10 >= var9 && var10 <= var13 && var12 + 1 == var11 && (this.field3300[var10][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 >= var9 && var10 <= var13 && var12 - arg1 == var11 && (this.field3300[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var9 <= var10 && var10 <= var13 && (var12 - arg1) == var11) {
                        return true;
                    }
                    if (var10 - arg1 == var9 && var12 >= var11 && var14 >= var12 && (this.field3300[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var9 && var12 >= var11 && var12 <= var14 && (this.field3300[var9][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 2) {
                if (arg2 == 0) {
                    if (var10 - arg1 == var9 && var12 >= var11 && var12 <= var14) {
                        return true;
                    }
                    if (var9 <= var10 && var13 >= var10 && var12 + 1 == var11) {
                        return true;
                    }
                    if ((var10 + 1) == var9 && var11 <= var12 && var14 >= var12 && (this.field3300[var9][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 <= var10 && var10 <= var13 && (var12 - arg1) == var11 && (this.field3300[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if ((var10 - arg1) == var9 && var12 >= var11 && var14 >= var12 && (this.field3300[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 <= var10 && var10 <= var13 && var12 + 1 == var11) {
                        return true;
                    }
                    if ((var10 + 1) == var9 && var11 <= var12 && var14 >= var12) {
                        return true;
                    }
                    if (var9 <= var10 && var10 <= var13 && var12 - arg1 == var11 && (this.field3300[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if (var10 - arg1 == var9 && var12 >= var11 && var12 <= var14 && (this.field3300[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 <= var10 && var10 <= var13 && (var12 + 1) == var11 && (this.field3300[var10][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var9 && var11 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var9 <= var10 && var10 <= var13 && (var12 - arg1) == var11) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var10 - arg1 == var9 && var11 <= var12 && var14 >= var12) {
                        return true;
                    }
                    if (var9 <= var10 && var10 <= var13 && (var12 + 1) == var11 && (this.field3300[var10][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var9 && var11 <= var12 && var14 >= var12 && (this.field3300[var9][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 <= var10 && var10 <= var13 && var12 - arg1 == var11) {
                        return true;
                    }
                }
            }
            if (arg5 == 9) {
                if (var9 <= var10 && var10 <= var13 && (var12 + 1) == var11 && (this.field3300[var10][var11] & 0x2C0120) == 0) {
                    return true;
                }
                if (var9 <= var10 && var13 >= var10 && var12 - arg1 == var11 && (this.field3300[var10][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if (var10 - arg1 == var9 && var11 <= var12 && var12 <= var14 && (this.field3300[var13][var12] & 0x2C0108) == 0) {
                    return true;
                }
                if ((var10 + 1) == var9 && var12 >= var11 && var12 <= var14 && (this.field3300[var9][var12] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(III)I", line = 371)
    public static final int method1498(int arg0, int arg1, int arg2) {
        if (arg0 != 2883872) {
            method1505(49);
        }
        field3292++;
        int var3 = class539.method3036(4, arg1 + 91923, arg2 + 45365, -1) + (class539.method3036(2, arg1 + 37821, arg2 + 10294, arg0 ^ 0xFFD3FEDF) - 128 >> 1) + (class539.method3036(1, arg1, arg2, arg0 + -2883873) + -128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIBIIIIII)Z", line = 392)
    public final boolean method1499(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3299++;
        if (arg1 > 1) {
            return class609.method3356(arg1, arg5, arg7, arg6, arg0, arg4, -82, arg3, arg1) ? true : this.method1513(arg1, arg4, arg0, arg7, arg3, arg5, arg1, arg8, (byte) -124, arg6);
        }
        if (arg2 != -42) {
            method1510(55);
        }
        int var10 = arg5 + arg7 - 1;
        int var11 = arg3 + arg0 - 1;
        if (arg4 >= arg5 && var10 >= arg4 && arg6 >= arg0 && arg6 <= var11) {
            return true;
        } else if ((arg5 - 1) == arg4 && arg0 <= arg6 && var11 >= arg6 && (this.field3300[arg4 - this.field3312][arg6 - this.field3308] & 0x8) == 0 && (arg8 & 0x8) == 0) {
            return true;
        } else if (var10 + 1 == arg4 && arg0 <= arg6 && var11 >= arg6 && (this.field3300[arg4 - this.field3312][arg6 - this.field3308] & 0x80) == 0 && (arg8 & 0x2) == 0) {
            return true;
        } else if (arg0 - 1 == arg6 && arg5 <= arg4 && var10 >= arg4 && (this.field3300[arg4 - this.field3312][arg6 - this.field3308] & 0x2) == 0 && (arg8 & 0x4) == 0) {
            return true;
        } else {
            return var11 + 1 == arg6 && arg5 <= arg4 && arg4 <= var10 && (this.field3300[arg4 - this.field3312][arg6 - this.field3308] & 0x20) == 0 && (arg8 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(ZZIIIIII)V", line = 437)
    public final void method1500(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg4 != 8192) {
            this.method1507(88, -36, 121);
        }
        field3290++;
        int var9 = 256;
        if (arg0) {
            var9 |= 0x20000;
        }
        if (arg5 == 1 || arg5 == 3) {
            int var10 = arg7;
            arg7 = arg3;
            arg3 = var10;
        }
        int var11 = arg2 - this.field3308;
        if (arg1) {
            var9 |= 0x40000000;
        }
        int var12 = arg6 - this.field3312;
        for (int var13 = var12; var13 < arg7 + var12; var13++) {
            if (var13 >= 0 && var13 < this.field3314) {
                for (int var14 = var11; var14 < arg3 + var11; var14++) {
                    if (var14 >= 0 && var14 < this.field3306) {
                        this.method1512(var13, 1073741824, var14, var9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIB)V", line = 494)
    public final void method1501(int arg0, int arg1, byte arg2) {
        field3301++;
        int var4 = arg0 - this.field3308;
        if (arg2 == 49) {
            int var5 = arg1 - this.field3312;
            this.field3300[var5][var4] = class288.method1722(this.field3300[var5][var4], 2097152);
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Z)V", line = 507)
    public final void method1502(boolean arg0) {
        for (int var2 = 0; var2 < this.field3314; var2++) {
            for (int var3 = 0; var3 < this.field3306; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= (this.field3314 - 5) || (this.field3306 - 5) <= var3) {
                    this.field3300[var2][var3] = -1;
                } else {
                    this.field3300[var2][var3] = 2097152;
                }
            }
        }
        field3310++;
        if (arg0) {
            method1498(-86, 89, -10);
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIIZIIZ)V", line = 538)
    public final void method1503(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, boolean arg6) {
        if (arg5 > -112) {
            return;
        }
        field3295++;
        int var8 = 256;
        if (arg3) {
            var8 |= 0x20000;
        }
        int var9 = arg0 - this.field3308;
        int var10 = arg4 - this.field3312;
        if (arg6) {
            var8 |= 0x40000000;
        }
        for (int var11 = var10; var11 < arg1 + var10; var11++) {
            if (var11 >= 0 && var11 < this.field3314) {
                for (int var12 = var9; var12 < (var9 + arg2); var12++) {
                    if (var12 >= 0 && var12 < this.field3306) {
                        this.method1504(var12, -125, var11, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIII)V", line = 585)
    private final void method1504(int arg0, int arg1, int arg2, int arg3) {
        this.field3300[arg2][arg0] = class288.method1722(this.field3300[arg2][arg0], arg3);
        int var5 = 55 % ((-arg1 - 45) / 33);
        field3309++;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)V", line = 595)
    public static void method1505(int arg0) {
        field3296 = null;
        if (arg0 != -10914) {
            field3315 = true;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIZI)I", line = 607)
    public static final int method1506(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg2) {
            method1506(38, -47, false, 59);
        }
        field3297++;
        int var4 = arg3 & 0x3;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return arg1;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return 7 - arg1;
        }
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(III)V", line = 635)
    public final void method1507(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field3312;
        int var5 = arg0 - this.field3308;
        field3307++;
        this.field3300[var4][var5] = class288.method1722(this.field3300[var4][var5], arg2);
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(BII)V", line = 647)
    public final void method1508(byte arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field3308;
        if (arg0 == 70) {
            field3303++;
            int var5 = arg1 - this.field3312;
            this.field3300[var5][var4] = class230.method1424(this.field3300[var5][var4], -262145);
        }
    }

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "(III)V", line = 670)
    public final void method1509(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field3308;
        field3293++;
        int var5 = arg1 - this.field3312;
        if (arg2 < 13) {
            method1506(-4, 24, true, 116);
        }
        this.field3300[var5][var4] = class230.method1424(this.field3300[var5][var4], -2097153);
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(I)V", line = 692)
    public static final void method1510(int arg0) {
        field3302++;
        if (class495.field6687.field1356 && class453.field6179.field9558 != -1) {
            class78.method442(40000, class453.field6179.field9558, class453.field6179.field9560);
        }
        int var1 = 103 % ((arg0 + 9) / 63);
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIIIIIII)Z", line = 711)
    public final boolean method1511(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3304++;
        if (arg3 == 1) {
            if (arg4 == arg6 && arg2 == arg7) {
                return true;
            }
        } else if (arg6 <= arg4 && arg3 + arg6 - 1 >= arg4 && arg2 >= arg2 && arg2 <= (arg2 + arg3 - 1)) {
            return true;
        }
        int var9 = arg6 - this.field3312;
        int var10 = arg7 - this.field3308;
        int var11 = arg4 - this.field3312;
        int var12 = arg2 - this.field3308;
        if (arg3 == 1) {
            if (arg5 == 6 || arg5 == 7) {
                if (arg5 == 7) {
                    arg0 = arg0 + 2 & 0x3;
                }
                if (arg0 == 0) {
                    if (var11 + 1 == var9 && var10 == var12 && (this.field3300[var9][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 - 1) == var10 && (this.field3300[var9][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var11 - 1 == var9 && var10 == var12 && (this.field3300[var9][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var12 - 1 == var10 && (this.field3300[var9][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if (var11 - 1 == var9 && var10 == var12 && (this.field3300[var9][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 + 1) == var10 && (this.field3300[var9][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if ((var11 + 1) == var9 && var10 == var12 && (this.field3300[var9][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var12 + 1 == var10 && (this.field3300[var9][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 8) {
                if (var9 == var11 && var12 + 1 == var10 && (this.field3300[var9][var10] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var11 && (var12 - 1) == var10 && (this.field3300[var9][var10] & 0x2) == 0) {
                    return true;
                }
                if (var11 - 1 == var9 && var10 == var12 && (this.field3300[var9][var10] & 0x8) == 0) {
                    return true;
                }
                if (var11 + 1 == var9 && var10 == var12 && (this.field3300[var9][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var9 + arg3 - 1;
            int var14 = var10 + arg3 - 1;
            if (arg5 == 6 || arg5 == 7) {
                if (arg5 == 7) {
                    arg0 = arg0 + 2 & 0x3;
                }
                if (arg0 == 0) {
                    if (var11 + 1 == var9 && var10 <= var12 && var14 >= var12 && (this.field3300[var9][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var13 >= var11 && (var12 - arg3) == var10 && (this.field3300[var11][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var11 - arg3 == var9 && var10 <= var12 && var12 <= var14 && (this.field3300[var13][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var11 <= var13 && (var12 - arg3) == var10 && (this.field3300[var11][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if ((var11 - arg3) == var9 && var10 <= var12 && var12 <= var14 && (this.field3300[var13][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var13 >= var11 && (var12 + 1) == var10 && (this.field3300[var11][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var11 + 1 == var9 && var10 <= var12 && var12 <= var14 && (this.field3300[var9][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var11 <= var13 && (var12 + 1) == var10 && (this.field3300[var11][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 8) {
                if (var11 >= var9 && var13 >= var11 && (var12 + 1) == var10 && (this.field3300[var11][var10] & 0x20) == 0) {
                    return true;
                }
                if (var11 >= var9 && var11 <= var13 && var12 - arg3 == var10 && (this.field3300[var11][var14] & 0x2) == 0) {
                    return true;
                }
                if (var11 - arg3 == var9 && var10 <= var12 && var12 <= var14 && (this.field3300[var13][var12] & 0x8) == 0) {
                    return true;
                }
                if ((var11 + 1) == var9 && var10 <= var12 && var14 >= var12 && (this.field3300[var9][var12] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return arg1 < 58 ? false : false;
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(IIII)V", line = 905)
    private final void method1512(int arg0, int arg1, int arg2, int arg3) {
        field3291++;
        this.field3300[arg0][arg2] = class230.method1424(this.field3300[arg0][arg2], ~arg3);
        if (arg1 != 1073741824) {
            this.field3300 = null;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIIIIIIIBI)Z", line = 920)
    public final boolean method1513(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9) {
        field3305++;
        int var11 = arg1 + arg6;
        int var12 = arg0 + arg9;
        if (arg8 >= -82) {
            this.method1503(-40, 2, -77, false, -22, -99, true);
        }
        int var13 = arg3 + arg5;
        int var14 = arg2 + arg4;
        if (arg1 == var13 && (arg7 & 0x2) == 0) {
            int var15 = arg2 >= arg9 ? arg2 : arg9;
            int var16 = var12 < var14 ? var12 : var14;
            while (var15 < var16) {
                if ((this.field3300[var13 - this.field3312 - 1][var15 - this.field3308] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg5 == var11 && (arg7 & 0x8) == 0) {
            int var17 = arg2 < arg9 ? arg9 : arg2;
            int var18 = var14 > var12 ? var12 : var14;
            while (var17 < var18) {
                if ((this.field3300[arg5 - this.field3312][var17 - this.field3308] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg9 == var14 && (arg7 & 0x1) == 0) {
            int var19 = arg1 <= arg5 ? arg5 : arg1;
            int var20 = var13 > var11 ? var11 : var13;
            while (var19 < var20) {
                if ((this.field3300[var19 - this.field3312][var14 - (this.field3308 + 1)] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg2 == var12 && (arg7 & 0x4) == 0) {
            int var21 = arg5 >= arg1 ? arg5 : arg1;
            int var22 = var13 <= var11 ? var13 : var11;
            while (var21 < var22) {
                if ((this.field3300[var21 - this.field3312][arg2 - this.field3308] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IBIIIZZ)V", line = 1016)
    public final void method1514(int arg0, byte arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        int var8 = arg3 - this.field3312;
        if (arg1 < 43) {
            method1515(-65, null, -98, -2);
        }
        int var9 = arg2 - this.field3308;
        field3313++;
        if (arg4 == 0) {
            if (arg0 == 0) {
                this.method1512(var8, 1073741824, var9, 128);
                this.method1512(var8 - 1, 1073741824, var9, 8);
            }
            if (arg0 == 1) {
                this.method1512(var8, 1073741824, var9, 2);
                this.method1512(var8, 1073741824, var9 + 1, 32);
            }
            if (arg0 == 2) {
                this.method1512(var8, 1073741824, var9, 8);
                this.method1512(var8 + 1, 1073741824, var9, 128);
            }
            if (arg0 == 3) {
                this.method1512(var8, 1073741824, var9, 32);
                this.method1512(var8, 1073741824, var9 - 1, 2);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg0 == 0) {
                this.method1512(var8, 1073741824, var9, 1);
                this.method1512(var8 - 1, 1073741824, var9 + 1, 16);
            }
            if (arg0 == 1) {
                this.method1512(var8, 1073741824, var9, 4);
                this.method1512(var8 + 1, 1073741824, var9 + 1, 64);
            }
            if (arg0 == 2) {
                this.method1512(var8, 1073741824, var9, 16);
                this.method1512(var8 + 1, 1073741824, var9 - 1, 1);
            }
            if (arg0 == 3) {
                this.method1512(var8, 1073741824, var9, 64);
                this.method1512(var8 - 1, 1073741824, var9 - 1, 4);
            }
        }
        if (arg4 == 2) {
            if (arg0 == 0) {
                this.method1512(var8, 1073741824, var9, 130);
                this.method1512(var8 - 1, 1073741824, var9, 8);
                this.method1512(var8, 1073741824, var9 + 1, 32);
            }
            if (arg0 == 1) {
                this.method1512(var8, 1073741824, var9, 10);
                this.method1512(var8, 1073741824, var9 + 1, 32);
                this.method1512(var8 + 1, 1073741824, var9, 128);
            }
            if (arg0 == 2) {
                this.method1512(var8, 1073741824, var9, 40);
                this.method1512(var8 + 1, 1073741824, var9, 128);
                this.method1512(var8, 1073741824, var9 - 1, 2);
            }
            if (arg0 == 3) {
                this.method1512(var8, 1073741824, var9, 160);
                this.method1512(var8, 1073741824, var9 - 1, 2);
                this.method1512(var8 - 1, 1073741824, var9, 8);
            }
        }
        if (arg6) {
            if (arg4 == 0) {
                if (arg0 == 0) {
                    this.method1512(var8, 1073741824, var9, 65536);
                    this.method1512(var8 - 1, 1073741824, var9, 4096);
                }
                if (arg0 == 1) {
                    this.method1512(var8, 1073741824, var9, 1024);
                    this.method1512(var8, 1073741824, var9 + 1, 16384);
                }
                if (arg0 == 2) {
                    this.method1512(var8, 1073741824, var9, 4096);
                    this.method1512(var8 + 1, 1073741824, var9, 65536);
                }
                if (arg0 == 3) {
                    this.method1512(var8, 1073741824, var9, 16384);
                    this.method1512(var8, 1073741824, var9 - 1, 1024);
                }
            }
            if (arg4 == 1 || arg4 == 3) {
                if (arg0 == 0) {
                    this.method1512(var8, 1073741824, var9, 512);
                    this.method1512(var8 - 1, 1073741824, var9 + 1, 8192);
                }
                if (arg0 == 1) {
                    this.method1512(var8, 1073741824, var9, 2048);
                    this.method1512(var8 + 1, 1073741824, var9 + 1, 32768);
                }
                if (arg0 == 2) {
                    this.method1512(var8, 1073741824, var9, 8192);
                    this.method1512(var8 + 1, 1073741824, var9 - 1, 512);
                }
                if (arg0 == 3) {
                    this.method1512(var8, 1073741824, var9, 32768);
                    this.method1512(var8 - 1, 1073741824, var9 - 1, 2048);
                }
            }
            if (arg4 == 2) {
                if (arg0 == 0) {
                    this.method1512(var8, 1073741824, var9, 66560);
                    this.method1512(var8 - 1, 1073741824, var9, 4096);
                    this.method1512(var8, 1073741824, var9 + 1, 16384);
                }
                if (arg0 == 1) {
                    this.method1512(var8, 1073741824, var9, 5120);
                    this.method1512(var8, 1073741824, var9 + 1, 16384);
                    this.method1512(var8 + 1, 1073741824, var9, 65536);
                }
                if (arg0 == 2) {
                    this.method1512(var8, 1073741824, var9, 20480);
                    this.method1512(var8 + 1, 1073741824, var9, 65536);
                    this.method1512(var8, 1073741824, var9 - 1, 1024);
                }
                if (arg0 == 3) {
                    this.method1512(var8, 1073741824, var9, 81920);
                    this.method1512(var8, 1073741824, var9 - 1, 1024);
                    this.method1512(var8 - 1, 1073741824, var9, 4096);
                }
            }
        }
        if (!arg5) {
            return;
        }
        if (arg4 == 0) {
            if (arg0 == 0) {
                this.method1512(var8, 1073741824, var9, 536870912);
                this.method1512(var8 - 1, 1073741824, var9, 33554432);
            }
            if (arg0 == 1) {
                this.method1512(var8, 1073741824, var9, 8388608);
                this.method1512(var8, 1073741824, var9 + 1, 134217728);
            }
            if (arg0 == 2) {
                this.method1512(var8, 1073741824, var9, 33554432);
                this.method1512(var8 + 1, 1073741824, var9, 536870912);
            }
            if (arg0 == 3) {
                this.method1512(var8, 1073741824, var9, 134217728);
                this.method1512(var8, 1073741824, var9 - 1, 8388608);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg0 == 0) {
                this.method1512(var8, 1073741824, var9, 4194304);
                this.method1512(var8 - 1, 1073741824, var9 + 1, 67108864);
            }
            if (arg0 == 1) {
                this.method1512(var8, 1073741824, var9, 16777216);
                this.method1512(var8 + 1, 1073741824, var9 + 1, 268435456);
            }
            if (arg0 == 2) {
                this.method1512(var8, 1073741824, var9, 67108864);
                this.method1512(var8 + 1, 1073741824, var9 - 1, 4194304);
            }
            if (arg0 == 3) {
                this.method1512(var8, 1073741824, var9, 268435456);
                this.method1512(var8 - 1, 1073741824, var9 - 1, 16777216);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method1512(var8, 1073741824, var9, 545259520);
            this.method1512(var8 - 1, 1073741824, var9, 33554432);
            this.method1512(var8, 1073741824, var9 + 1, 134217728);
        }
        if (arg0 == 1) {
            this.method1512(var8, 1073741824, var9, 41943040);
            this.method1512(var8, 1073741824, var9 + 1, 134217728);
            this.method1512(var8 + 1, 1073741824, var9, 536870912);
        }
        if (arg0 == 2) {
            this.method1512(var8, 1073741824, var9, 167772160);
            this.method1512(var8 + 1, 1073741824, var9, 536870912);
            this.method1512(var8, 1073741824, var9 - 1, 8388608);
        }
        if (arg0 == 3) {
            this.method1512(var8, 1073741824, var9, 671088640);
            this.method1512(var8, 1073741824, var9 - 1, 8388608);
            this.method1512(var8 - 1, 1073741824, var9, 33554432);
            return;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(I[BII)Ljava/lang/String;", line = 1328)
    public static final String method1515(int arg0, byte[] arg1, int arg2, int arg3) {
        field3311++;
        char[] var4 = new char[arg2];
        int var5 = 0;
        int var6 = arg0 + arg2;
        if (arg3 >= -51) {
            method1506(-20, -12, false, -9);
        }
        for (int var7 = arg0; var7 < var6; var7++) {
            int var8 = arg1[var7] & 0xFF;
            if (var8 < 128) {
                var4[var5++] = (char) var8;
            } else if (var8 < 194) {
                throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + var8);
            } else if (var8 >= 224) {
                if (var8 >= 240) {
                    if (var8 < 244) {
                        throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
                    }
                    throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + var8);
                }
                if (var6 <= var7 + 2) {
                    throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
                }
                var7++;
                int var9 = arg1[var7] & 0xFF;
                if (var9 < 128 || var9 > 191) {
                    throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
                }
                var7++;
                int var10 = arg1[var7] & 0xFF;
                if (var10 < 128 || var10 > 191) {
                    throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
                }
                var4[var5++] = (char) class288.method1722(class288.method1722(class230.method1424(-921600, var8 << 12), class230.method1424(-129, var9) << 6), class230.method1424(var10, -129));
            } else if (var6 > (var7 + 1)) {
                var7++;
                int var11 = arg1[var7] & 0xFF;
                if (var11 < 128 || var11 > 191) {
                    throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
                }
                var4[var5++] = (char) class288.method1722(class230.method1424(-12352, var8 << 6), class230.method1424(-129, var11));
            } else {
                throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IZIIIIZ)V", line = 1404)
    public final void method1516(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field3298++;
        int var8 = arg0 - this.field3312;
        int var9 = arg5 - this.field3308;
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method1504(var9, 98, var8, 128);
                this.method1504(var9, -79, var8 - 1, 8);
            }
            if (arg3 == 1) {
                this.method1504(var9, 31, var8, 2);
                this.method1504(var9 + 1, -83, var8, 32);
            }
            if (arg3 == 2) {
                this.method1504(var9, -95, var8, 8);
                this.method1504(var9, -86, var8 + 1, 128);
            }
            if (arg3 == 3) {
                this.method1504(var9, -90, var8, 32);
                this.method1504(var9 - 1, arg4 + -245, var8, 2);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method1504(var9, -87, var8, 1);
                this.method1504(var9 + 1, arg4 + -135, var8 - 1, 16);
            }
            if (arg3 == 1) {
                this.method1504(var9, 69, var8, 4);
                this.method1504(var9 + 1, -104, var8 - -1, 64);
            }
            if (arg3 == 2) {
                this.method1504(var9, arg4 - 36, var8, 16);
                this.method1504(var9 - 1, -106, var8 + 1, 1);
            }
            if (arg3 == 3) {
                this.method1504(var9, 53, var8, 64);
                this.method1504(var9 - 1, -92, var8 + -1, 4);
            }
        }
        if (arg2 == 2) {
            if (arg3 == 0) {
                this.method1504(var9, arg4 - 42, var8, 130);
                this.method1504(var9, arg4 ^ 0xF1, var8 - 1, 8);
                this.method1504(var9 + 1, 30, var8, 32);
            }
            if (arg3 == 1) {
                this.method1504(var9, -125, var8, 10);
                this.method1504(var9 + 1, -78, var8, 32);
                this.method1504(var9, 52, var8 + 1, 128);
            }
            if (arg3 == 2) {
                this.method1504(var9, arg4 ^ 0xFFFFFF08, var8, 40);
                this.method1504(var9, 43, var8 + 1, 128);
                this.method1504(var9 - 1, arg4 ^ 0xFFFFFF2F, var8, 2);
            }
            if (arg3 == 3) {
                this.method1504(var9, -8, var8, 160);
                this.method1504(var9 - 1, -91, var8, 2);
                this.method1504(var9, -100, var8 - 1, 8);
            }
        }
        if (arg1) {
            if (arg2 == 0) {
                if (arg3 == 0) {
                    this.method1504(var9, 110, var8, 65536);
                    this.method1504(var9, -112, var8 - 1, 4096);
                }
                if (arg3 == 1) {
                    this.method1504(var9, arg4 ^ 0xD1, var8, 1024);
                    this.method1504(var9 + 1, -78, var8, 16384);
                }
                if (arg3 == 2) {
                    this.method1504(var9, -112, var8, 4096);
                    this.method1504(var9, arg4 ^ 0xFFFFFF07, var8 + 1, 65536);
                }
                if (arg3 == 3) {
                    this.method1504(var9, -123, var8, 16384);
                    this.method1504(var9 - 1, 63, var8, 1024);
                }
            }
            if (arg2 == 1 || arg2 == 3) {
                if (arg3 == 0) {
                    this.method1504(var9, 47, var8, 512);
                    this.method1504(var9 + 1, -103, var8 + -1, 8192);
                }
                if (arg3 == 1) {
                    this.method1504(var9, -1, var8, 2048);
                    this.method1504(var9 + 1, arg4 ^ 0xD5, var8 + 1, 32768);
                }
                if (arg3 == 2) {
                    this.method1504(var9, -116, var8, 8192);
                    this.method1504(var9 - 1, arg4 ^ 0xFFFFFF0C, var8 + 1, 512);
                }
                if (arg3 == 3) {
                    this.method1504(var9, 107, var8, 32768);
                    this.method1504(var9 - 1, -102, var8 - 1, 2048);
                }
            }
            if (arg2 == 2) {
                if (arg3 == 0) {
                    this.method1504(var9, -128, var8, 66560);
                    this.method1504(var9, 61, var8 - 1, 4096);
                    this.method1504(var9 + 1, arg4 + -32, var8, 16384);
                }
                if (arg3 == 1) {
                    this.method1504(var9, arg4 - 213, var8, 5120);
                    this.method1504(var9 + 1, -121, var8, 16384);
                    this.method1504(var9, 52, var8 + 1, 65536);
                }
                if (arg3 == 2) {
                    this.method1504(var9, arg4 ^ 0xBB, var8, 20480);
                    this.method1504(var9, -109, var8 + 1, 65536);
                    this.method1504(var9 - 1, arg4 ^ 0xFFFFFF19, var8, 1024);
                }
                if (arg3 == 3) {
                    this.method1504(var9, 63, var8, 81920);
                    this.method1504(var9 - 1, 100, var8, 1024);
                    this.method1504(var9, 122, var8 - 1, 4096);
                }
            }
        }
        if (arg6) {
            if (arg2 == 0) {
                if (arg3 == 0) {
                    this.method1504(var9, -125, var8, 536870912);
                    this.method1504(var9, 63, var8 - 1, 33554432);
                }
                if (arg3 == 1) {
                    this.method1504(var9, arg4 - 238, var8, 8388608);
                    this.method1504(var9 + 1, -99, var8, 134217728);
                }
                if (arg3 == 2) {
                    this.method1504(var9, -82, var8, 33554432);
                    this.method1504(var9, 76, var8 + 1, 536870912);
                }
                if (arg3 == 3) {
                    this.method1504(var9, -2, var8, 134217728);
                    this.method1504(var9 - 1, 103, var8, 8388608);
                }
            }
            if (arg2 == 1 || arg2 == 3) {
                if (arg3 == 0) {
                    this.method1504(var9, 9, var8, 4194304);
                    this.method1504(var9 + 1, -101, var8 + -1, 67108864);
                }
                if (arg3 == 1) {
                    this.method1504(var9, arg4 - 245, var8, 16777216);
                    this.method1504(var9 + 1, 71, var8 + 1, 268435456);
                }
                if (arg3 == 2) {
                    this.method1504(var9, 98, var8, 67108864);
                    this.method1504(var9 - 1, arg4 ^ 0xCB, var8 + 1, 4194304);
                }
                if (arg3 == 3) {
                    this.method1504(var9, -90, var8, 268435456);
                    this.method1504(var9 - 1, arg4 ^ 0xFFFFFF7A, var8 - 1, 16777216);
                }
            }
            if (arg2 == 2) {
                if (arg3 == 0) {
                    this.method1504(var9, -90, var8, 545259520);
                    this.method1504(var9, -115, var8 - 1, 33554432);
                    this.method1504(var9 + 1, 15, var8, 134217728);
                }
                if (arg3 == 1) {
                    this.method1504(var9, -102, var8, 41943040);
                    this.method1504(var9 + 1, arg4 ^ 0xEC, var8, 134217728);
                    this.method1504(var9, arg4 ^ 0xFFFFFF21, var8 + 1, 536870912);
                }
                if (arg3 == 2) {
                    this.method1504(var9, arg4 - 242, var8, 167772160);
                    this.method1504(var9, arg4 ^ 0xFFFFFF1A, var8 + 1, 536870912);
                    this.method1504(var9 - 1, 66, var8, 8388608);
                }
                if (arg3 == 3) {
                    this.method1504(var9, -91, var8, 671088640);
                    this.method1504(var9 - 1, -117, var8, 8388608);
                    this.method1504(var9, arg4 ^ 0xFFFFFF02, var8 - 1, 33554432);
                }
            }
        }
        if (arg4 != 128) {
            this.field3314 = 31;
        }
    }
}
