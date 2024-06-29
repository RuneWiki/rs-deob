import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class173 {

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "I")
    public int field2512;

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "I")
    public static int field2513;

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "I")
    public static int field2515;

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "I")
    public static int field2517;

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "I")
    public static int field2518;

    @OriginalMember(owner = "client!cl", name = "l", descriptor = "I")
    public static int field2520;

    @OriginalMember(owner = "client!cl", name = "m", descriptor = "I")
    public static int field2521;

    @OriginalMember(owner = "client!cl", name = "n", descriptor = "I")
    public int field2522;

    @OriginalMember(owner = "client!cl", name = "o", descriptor = "I")
    public static int field2523;

    @OriginalMember(owner = "client!cl", name = "p", descriptor = "I")
    public int field2524;

    @OriginalMember(owner = "client!cl", name = "r", descriptor = "I")
    public static int field2526;

    @OriginalMember(owner = "client!cl", name = "s", descriptor = "I")
    public int field2527;

    @OriginalMember(owner = "client!cl", name = "t", descriptor = "I")
    public static int field2528;

    @OriginalMember(owner = "client!cl", name = "u", descriptor = "I")
    public static int field2529;

    @OriginalMember(owner = "client!cl", name = "q", descriptor = "Lre;")
    public static class425 field2525;

    @OriginalMember(owner = "client!cl", name = "k", descriptor = "[[I")
    public int[][] field2519;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Z)V", line = 4)
    public static void method1148(boolean arg0) {
        if (arg0) {
            method1148(false);
        }
        field2525 = null;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ZZIIIIZ)V", line = 15)
    public final void method1149(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field2528++;
        int var8 = 256;
        if (arg1) {
            var8 |= 0x20000;
        }
        int var9 = arg3 - this.field2512;
        if (arg0) {
            var8 |= 0x40000000;
        }
        int var10 = arg5 - this.field2522;
        if (arg6) {
            this.method1150(-56, -12, 44, -30, -54, -11, 65, 90);
        }
        for (int var11 = var9; var11 < arg2 + var9; var11++) {
            if (var11 >= 0 && var11 < this.field2524) {
                for (int var12 = var10; var12 < (arg4 + var10); var12++) {
                    if (var12 >= 0 && this.field2527 > var12) {
                        this.method1156(var11, false, var12, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIIIIII)Z", line = 62)
    public final boolean method1150(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2518++;
        if (arg4 == 1) {
            if (arg0 == arg5 && arg1 == arg2) {
                return true;
            }
        } else if (arg5 >= arg0 && arg0 + arg4 - 1 >= arg5 && arg1 >= arg1 && arg1 + arg4 - 1 >= arg1) {
            return true;
        }
        int var9 = arg1 - this.field2522;
        int var10 = arg5 - this.field2512;
        int var11 = arg2 - this.field2522;
        int var12 = arg0 - this.field2512;
        if (arg6 != -24128) {
            this.method1152(-91, 27, 83, -105, -110, 3, 91, -94, 18);
        }
        if (arg4 == 1) {
            if (arg3 == 6 || arg3 == 7) {
                if (arg3 == 7) {
                    arg7 = arg7 + 2 & 0x3;
                }
                if (arg7 == 0) {
                    if ((var10 + 1) == var12 && var9 == var11 && (this.field2519[var12][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var9 - 1) == var11 && (this.field2519[var12][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if ((var10 - 1) == var12 && var9 == var11 && (this.field2519[var12][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var9 - 1 == var11 && (this.field2519[var12][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if ((var10 - 1) == var12 && var9 == var11 && (this.field2519[var12][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var9 + 1) == var11 && (this.field2519[var12][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if (var10 + 1 == var12 && var9 == var11 && (this.field2519[var12][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var9 + 1 == var11 && (this.field2519[var12][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 8) {
                if (var10 == var12 && var9 + 1 == var11 && (this.field2519[var12][var11] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var12 && var9 - 1 == var11 && (this.field2519[var12][var11] & 0x2) == 0) {
                    return true;
                }
                if ((var10 - 1) == var12 && var9 == var11 && (this.field2519[var12][var11] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var12 && var9 == var11 && (this.field2519[var12][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var12 + arg4 - 1;
            int var14 = var11 + arg4 - 1;
            if (arg3 == 6 || arg3 == 7) {
                if (arg3 == 7) {
                    arg7 = arg7 + 2 & 0x3;
                }
                if (arg7 == 0) {
                    if ((var10 + 1) == var12 && var9 >= var11 && var9 <= var14 && (this.field2519[var12][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 <= var10 && var10 <= var13 && (var9 - arg4) == var11 && (this.field2519[var10][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if ((var10 - arg4) == var12 && var9 >= var11 && var9 <= var14 && (this.field2519[var13][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 <= var10 && var13 >= var10 && var9 - arg4 == var11 && (this.field2519[var10][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if (var10 - arg4 == var12 && var9 >= var11 && var9 <= var14 && (this.field2519[var13][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 <= var10 && var10 <= var13 && var9 + 1 == var11 && (this.field2519[var10][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if (var10 + 1 == var12 && var11 <= var9 && var9 <= var14 && (this.field2519[var12][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 >= var12 && var10 <= var13 && var9 + 1 == var11 && (this.field2519[var10][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 8) {
                if (var12 <= var10 && var10 <= var13 && var9 + 1 == var11 && (this.field2519[var10][var11] & 0x20) == 0) {
                    return true;
                }
                if (var12 <= var10 && var13 >= var10 && (var9 - arg4) == var11 && (this.field2519[var10][var14] & 0x2) == 0) {
                    return true;
                }
                if (var10 - arg4 == var12 && var9 >= var11 && var14 >= var9 && (this.field2519[var13][var9] & 0x8) == 0) {
                    return true;
                }
                if ((var10 + 1) == var12 && var11 <= var9 && var9 <= var14 && (this.field2519[var12][var9] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIIIIIIII)Z", line = 258)
    public final boolean method1151(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2516++;
        int var11 = arg5 + arg9;
        int var12 = arg0 + arg6;
        if (arg8 != -65537) {
            this.field2527 = 120;
        }
        int var13 = arg1 + arg2;
        int var14 = arg7 + arg3;
        if (arg5 == var13 && (arg4 & 0x2) == 0) {
            int var15 = arg7 < arg6 ? arg6 : arg7;
            int var16 = var14 > var12 ? var12 : var14;
            while (var16 > var15) {
                if ((this.field2519[var13 - this.field2512 - 1][var15 - this.field2522] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg1 == var11 && (arg4 & 0x8) == 0) {
            int var17 = arg7 < arg6 ? arg6 : arg7;
            int var18 = var12 < var14 ? var12 : var14;
            while (var17 < var18) {
                if ((this.field2519[arg1 - this.field2512][var17 - this.field2522] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg6 == var14 && (arg4 & 0x1) == 0) {
            int var19 = arg1 < arg5 ? arg5 : arg1;
            int var20 = var13 <= var11 ? var13 : var11;
            while (var19 < var20) {
                if ((this.field2519[var19 - this.field2512][var14 - this.field2522 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg7 == var12 && (arg4 & 0x4) == 0) {
            int var21 = arg5 <= arg1 ? arg1 : arg5;
            int var22 = var11 < var13 ? var11 : var13;
            while (var21 < var22) {
                if ((this.field2519[var21 - this.field2512][arg7 - this.field2522] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIIIIIII)Z", line = 352)
    public final boolean method1152(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2521++;
        if (arg5 > 1) {
            return class201.method1289(arg5, arg7, true, arg2, arg6, arg8, arg5, arg1, arg4) ? true : this.method1151(arg5, arg6, arg2, arg7, arg3, arg1, arg4, arg8, -65537, arg5);
        }
        int var10 = arg6 + arg2 - 1;
        int var11 = arg7 + arg8 - 1;
        if (arg1 >= arg6 && arg1 <= var10 && arg4 >= arg8 && arg4 <= var11) {
            return true;
        }
        if (arg0 >= -71) {
            field2525 = null;
        }
        if ((arg6 - 1) == arg1 && arg4 >= arg8 && arg4 <= var11 && (this.field2519[arg1 - this.field2512][arg4 - this.field2522] & 0x8) == 0 && (arg3 & 0x8) == 0) {
            return true;
        } else if (var10 + 1 == arg1 && arg8 <= arg4 && var11 >= arg4 && (this.field2519[arg1 - this.field2512][arg4 - this.field2522] & 0x80) == 0 && (arg3 & 0x2) == 0) {
            return true;
        } else if (arg8 - 1 == arg4 && arg1 >= arg6 && var10 >= arg1 && (this.field2519[arg1 - this.field2512][arg4 - this.field2522] & 0x2) == 0 && (arg3 & 0x4) == 0) {
            return true;
        } else {
            return var11 + 1 == arg4 && arg6 <= arg1 && arg1 <= var10 && (this.field2519[arg1 - this.field2512][arg4 - this.field2522] & 0x20) == 0 && (arg3 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIBZIIIZ)V", line = 395)
    public final void method1153(int arg0, int arg1, byte arg2, boolean arg3, int arg4, int arg5, int arg6, boolean arg7) {
        field2517++;
        int var9 = 256;
        if (arg7) {
            var9 |= 0x20000;
        }
        if (arg5 == 1 || arg5 == 3) {
            int var10 = arg4;
            arg4 = arg0;
            arg0 = var10;
        }
        int var11 = arg6 - this.field2522;
        int var12 = arg1 - this.field2512;
        if (arg2 != 11) {
            return;
        }
        if (arg3) {
            var9 |= 0x40000000;
        }
        for (int var13 = var12; var13 < arg4 + var12; var13++) {
            if (var13 >= 0 && this.field2524 > var13) {
                for (int var14 = var11; var14 < (arg0 + var11); var14++) {
                    if (var14 >= 0 && this.field2527 > var14) {
                        this.method1159(var9, var13, var14, -65);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIIBIII)Z", line = 453)
    public final boolean method1154(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        field2515++;
        if (arg6 == 1) {
            if (arg0 == arg1 && arg2 == arg5) {
                return true;
            }
        } else if (arg0 >= arg1 && arg1 + arg6 - 1 >= arg0 && arg2 >= arg2 && arg2 <= arg2 + arg6 - 1) {
            return true;
        }
        int var9 = arg1 - this.field2512;
        int var10 = arg5 - this.field2522;
        int var11 = arg0 - this.field2512;
        int var12 = arg2 - this.field2522;
        int var13 = 0 % ((arg4 - 9) / 33);
        if (arg6 == 1) {
            if (arg3 == 0) {
                if (arg7 == 0) {
                    if ((var11 - 1) == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var12 + 1) == var10 && (this.field2519[var9][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var12 - 1 == var10 && (this.field2519[var9][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if (var9 == var11 && var12 + 1 == var10) {
                        return true;
                    }
                    if ((var11 - 1) == var9 && var10 == var12 && (this.field2519[var9][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var10 == var12 && (this.field2519[var9][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if (var11 + 1 == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var12 + 1 == var10 && (this.field2519[var9][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var12 - 1 == var10 && (this.field2519[var9][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if (var9 == var11 && (var12 - 1) == var10) {
                        return true;
                    }
                    if (var11 - 1 == var9 && var10 == var12 && (this.field2519[var9][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 == var12 && (this.field2519[var9][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 2) {
                if (arg7 == 0) {
                    if (var11 - 1 == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var12 + 1) == var10) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 == var12 && (this.field2519[var9][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 - 1) == var10 && (this.field2519[var9][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if (var11 - 1 == var9 && var10 == var12 && (this.field2519[var9][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var12 + 1 == var10) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var12 - 1 == var10 && (this.field2519[var9][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if ((var11 - 1) == var9 && var10 == var12 && (this.field2519[var9][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var12 + 1 == var10 && (this.field2519[var9][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var12 - 1) == var10) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if ((var11 - 1) == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var12 + 1 == var10 && (this.field2519[var9][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var10 == var12 && (this.field2519[var9][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 - 1) == var10) {
                        return true;
                    }
                }
            }
            if (arg3 == 9) {
                if (var9 == var11 && var12 + 1 == var10 && (this.field2519[var9][var10] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var11 && (var12 - 1) == var10 && (this.field2519[var9][var10] & 0x2) == 0) {
                    return true;
                }
                if ((var11 - 1) == var9 && var10 == var12 && (this.field2519[var9][var10] & 0x8) == 0) {
                    return true;
                }
                if ((var11 + 1) == var9 && var10 == var12 && (this.field2519[var9][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var14 = var9 - (1 - arg6);
            int var15 = arg6 + var10 - 1;
            if (arg3 == 0) {
                if (arg7 == 0) {
                    if ((var11 - arg6) == var9 && var10 <= var12 && var15 >= var12) {
                        return true;
                    }
                    if (var11 >= var9 && var11 <= var14 && (var12 + 1) == var10 && (this.field2519[var11][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var14 >= var11 && var12 - arg6 == var10 && (this.field2519[var11][var15] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if (var11 >= var9 && var14 >= var11 && (var12 + 1) == var10) {
                        return true;
                    }
                    if (var11 - arg6 == var9 && var12 >= var10 && var12 <= var15 && (this.field2519[var14][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var12 >= var10 && var12 <= var15 && (this.field2519[var9][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if ((var11 + 1) == var9 && var12 >= var10 && var15 >= var12) {
                        return true;
                    }
                    if (var9 <= var11 && var14 >= var11 && (var12 + 1) == var10 && (this.field2519[var11][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var14 >= var11 && (var12 - arg6) == var10 && (this.field2519[var11][var15] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if (var9 <= var11 && var11 <= var14 && (var12 - arg6) == var10) {
                        return true;
                    }
                    if (var11 - arg6 == var9 && var10 <= var12 && var12 <= var15 && (this.field2519[var14][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 <= var12 && var15 >= var12 && (this.field2519[var9][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 2) {
                if (arg7 == 0) {
                    if ((var11 - arg6) == var9 && var12 >= var10 && var12 <= var15) {
                        return true;
                    }
                    if (var9 <= var11 && var14 >= var11 && (var12 + 1) == var10) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var12 >= var10 && var12 <= var15 && (this.field2519[var9][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var14 >= var11 && var12 - arg6 == var10 && (this.field2519[var11][var15] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if ((var11 - arg6) == var9 && var12 >= var10 && var12 <= var15 && (this.field2519[var14][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var14 >= var11 && var12 + 1 == var10) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var12 >= var10 && var15 >= var12) {
                        return true;
                    }
                    if (var11 >= var9 && var11 <= var14 && (var12 - arg6) == var10 && (this.field2519[var11][var15] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if ((var11 - arg6) == var9 && var12 >= var10 && var12 <= var15 && (this.field2519[var14][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var11 <= var14 && var12 + 1 == var10 && (this.field2519[var11][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var12 >= var10 && var12 <= var15) {
                        return true;
                    }
                    if (var9 <= var11 && var14 >= var11 && var12 - arg6 == var10) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if (var11 - arg6 == var9 && var12 >= var10 && var15 >= var12) {
                        return true;
                    }
                    if (var9 <= var11 && var11 <= var14 && var12 + 1 == var10 && (this.field2519[var11][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var12 >= var10 && var15 >= var12 && (this.field2519[var9][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var11 <= var14 && var12 - arg6 == var10) {
                        return true;
                    }
                }
            }
            if (arg3 == 9) {
                if (var9 <= var11 && var14 >= var11 && (var12 + 1) == var10 && (this.field2519[var11][var10] & 0x2C0120) == 0) {
                    return true;
                }
                if (var9 <= var11 && var11 <= var14 && var12 - arg6 == var10 && (this.field2519[var11][var15] & 0x2C0102) == 0) {
                    return true;
                }
                if ((var11 - arg6) == var9 && var12 >= var10 && var15 >= var12 && (this.field2519[var14][var12] & 0x2C0108) == 0) {
                    return true;
                }
                if (var11 + 1 == var9 && var10 <= var12 && var12 <= var15 && (this.field2519[var9][var12] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(Z)V", line = 820)
    public final void method1155(boolean arg0) {
        for (int var2 = 0; var2 < this.field2524; var2++) {
            for (int var3 = 0; var3 < this.field2527; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= this.field2524 - 5 || (this.field2527 - 5) <= var3) {
                    this.field2519[var2][var3] = -1;
                } else {
                    this.field2519[var2][var3] = 2097152;
                }
            }
        }
        if (!arg0) {
            method1148(true);
        }
        field2509++;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IZII)V", line = 851)
    private final void method1156(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg1) {
            this.method1155(false);
        }
        this.field2519[arg0][arg2] = class191.method1230(this.field2519[arg0][arg2], arg3);
        field2511++;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIB)V", line = 863)
    public final void method1157(int arg0, int arg1, byte arg2) {
        if (arg2 >= -12) {
            this.method1152(-75, 88, 116, 113, 108, 26, -5, 20, -44);
        }
        int var4 = arg1 - this.field2512;
        int var5 = arg0 - this.field2522;
        field2510++;
        this.field2519[var4][var5] = class494.method2839(this.field2519[var4][var5], -2097153);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IBI)V", line = 878)
    public final void method1158(int arg0, byte arg1, int arg2) {
        if (arg1 != -35) {
            this.field2512 = 88;
        }
        int var4 = arg2 - this.field2522;
        field2526++;
        int var5 = arg0 - this.field2512;
        this.field2519[var5][var4] = class191.method1230(this.field2519[var5][var4], 262144);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIII)V", line = 892)
    private final void method1159(int arg0, int arg1, int arg2, int arg3) {
        field2523++;
        this.field2519[arg1][arg2] = class494.method2839(this.field2519[arg1][arg2], ~arg0);
        if (arg3 > -57) {
            this.field2522 = 4;
        }
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(IIB)V", line = 905)
    public final void method1160(int arg0, int arg1, byte arg2) {
        int var4 = arg1 - this.field2522;
        int var5 = arg0 - this.field2512;
        field2529++;
        this.field2519[var5][var4] = class191.method1230(this.field2519[var5][var4], 2097152);
        if (arg2 != 56) {
            this.method1158(20, (byte) -83, 111);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(III)V", line = 924)
    public final void method1161(int arg0, int arg1, int arg2) {
        field2520++;
        int var4 = arg0 - this.field2522;
        int var5 = arg1 - this.field2512;
        if (arg2 > -48) {
            this.field2524 = -61;
        }
        this.field2519[var5][var4] = class494.method2839(this.field2519[var5][var4], -262145);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIBZZII)V", line = 946)
    public final void method1162(int arg0, int arg1, byte arg2, boolean arg3, boolean arg4, int arg5, int arg6) {
        field2514++;
        int var8 = arg5 - this.field2522;
        int var9 = arg6 - this.field2512;
        if (arg1 == 0) {
            if (arg0 == 0) {
                this.method1156(var9, false, var8, 128);
                this.method1156(var9 - 1, false, var8, 8);
            }
            if (arg0 == 1) {
                this.method1156(var9, false, var8, 2);
                this.method1156(var9, false, var8 + 1, 32);
            }
            if (arg0 == 2) {
                this.method1156(var9, false, var8, 8);
                this.method1156(var9 + 1, false, var8, 128);
            }
            if (arg0 == 3) {
                this.method1156(var9, false, var8, 32);
                this.method1156(var9, false, var8 - 1, 2);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg0 == 0) {
                this.method1156(var9, false, var8, 1);
                this.method1156(var9 - 1, false, var8 + 1, 16);
            }
            if (arg0 == 1) {
                this.method1156(var9, false, var8, 4);
                this.method1156(var9 + 1, false, var8 + 1, 64);
            }
            if (arg0 == 2) {
                this.method1156(var9, false, var8, 16);
                this.method1156(var9 + 1, false, var8 - 1, 1);
            }
            if (arg0 == 3) {
                this.method1156(var9, false, var8, 64);
                this.method1156(var9 - 1, false, var8 - 1, 4);
            }
        }
        if (arg1 == 2) {
            if (arg0 == 0) {
                this.method1156(var9, false, var8, 130);
                this.method1156(var9 - 1, false, var8, 8);
                this.method1156(var9, false, var8 + 1, 32);
            }
            if (arg0 == 1) {
                this.method1156(var9, false, var8, 10);
                this.method1156(var9, false, var8 + 1, 32);
                this.method1156(var9 + 1, false, var8, 128);
            }
            if (arg0 == 2) {
                this.method1156(var9, false, var8, 40);
                this.method1156(var9 + 1, false, var8, 128);
                this.method1156(var9, false, var8 - 1, 2);
            }
            if (arg0 == 3) {
                this.method1156(var9, false, var8, 160);
                this.method1156(var9, false, var8 - 1, 2);
                this.method1156(var9 - 1, false, var8, 8);
            }
        }
        if (arg3) {
            if (arg1 == 0) {
                if (arg0 == 0) {
                    this.method1156(var9, false, var8, 65536);
                    this.method1156(var9 - 1, false, var8, 4096);
                }
                if (arg0 == 1) {
                    this.method1156(var9, false, var8, 1024);
                    this.method1156(var9, false, var8 + 1, 16384);
                }
                if (arg0 == 2) {
                    this.method1156(var9, false, var8, 4096);
                    this.method1156(var9 + 1, false, var8, 65536);
                }
                if (arg0 == 3) {
                    this.method1156(var9, false, var8, 16384);
                    this.method1156(var9, false, var8 - 1, 1024);
                }
            }
            if (arg1 == 1 || arg1 == 3) {
                if (arg0 == 0) {
                    this.method1156(var9, false, var8, 512);
                    this.method1156(var9 - 1, false, var8 + 1, 8192);
                }
                if (arg0 == 1) {
                    this.method1156(var9, false, var8, 2048);
                    this.method1156(var9 + 1, false, var8 + 1, 32768);
                }
                if (arg0 == 2) {
                    this.method1156(var9, false, var8, 8192);
                    this.method1156(var9 + 1, false, var8 - 1, 512);
                }
                if (arg0 == 3) {
                    this.method1156(var9, false, var8, 32768);
                    this.method1156(var9 - 1, false, var8 - 1, 2048);
                }
            }
            if (arg1 == 2) {
                if (arg0 == 0) {
                    this.method1156(var9, false, var8, 66560);
                    this.method1156(var9 - 1, false, var8, 4096);
                    this.method1156(var9, false, var8 + 1, 16384);
                }
                if (arg0 == 1) {
                    this.method1156(var9, false, var8, 5120);
                    this.method1156(var9, false, var8 + 1, 16384);
                    this.method1156(var9 + 1, false, var8, 65536);
                }
                if (arg0 == 2) {
                    this.method1156(var9, false, var8, 20480);
                    this.method1156(var9 + 1, false, var8, 65536);
                    this.method1156(var9, false, var8 - 1, 1024);
                }
                if (arg0 == 3) {
                    this.method1156(var9, false, var8, 81920);
                    this.method1156(var9, false, var8 - 1, 1024);
                    this.method1156(var9 - 1, false, var8, 4096);
                }
            }
        }
        if (arg4) {
            if (arg1 == 0) {
                if (arg0 == 0) {
                    this.method1156(var9, false, var8, 536870912);
                    this.method1156(var9 - 1, false, var8, 33554432);
                }
                if (arg0 == 1) {
                    this.method1156(var9, false, var8, 8388608);
                    this.method1156(var9, false, var8 + 1, 134217728);
                }
                if (arg0 == 2) {
                    this.method1156(var9, false, var8, 33554432);
                    this.method1156(var9 + 1, false, var8, 536870912);
                }
                if (arg0 == 3) {
                    this.method1156(var9, false, var8, 134217728);
                    this.method1156(var9, false, var8 - 1, 8388608);
                }
            }
            if (arg1 == 1 || arg1 == 3) {
                if (arg0 == 0) {
                    this.method1156(var9, false, var8, 4194304);
                    this.method1156(var9 - 1, false, var8 + 1, 67108864);
                }
                if (arg0 == 1) {
                    this.method1156(var9, false, var8, 16777216);
                    this.method1156(var9 + 1, false, var8 + 1, 268435456);
                }
                if (arg0 == 2) {
                    this.method1156(var9, false, var8, 67108864);
                    this.method1156(var9 + 1, false, var8 - 1, 4194304);
                }
                if (arg0 == 3) {
                    this.method1156(var9, false, var8, 268435456);
                    this.method1156(var9 - 1, false, var8 - 1, 16777216);
                }
            }
            if (arg1 == 2) {
                if (arg0 == 0) {
                    this.method1156(var9, false, var8, 545259520);
                    this.method1156(var9 - 1, false, var8, 33554432);
                    this.method1156(var9, false, var8 + 1, 134217728);
                }
                if (arg0 == 1) {
                    this.method1156(var9, false, var8, 41943040);
                    this.method1156(var9, false, var8 + 1, 134217728);
                    this.method1156(var9 + 1, false, var8, 536870912);
                }
                if (arg0 == 2) {
                    this.method1156(var9, false, var8, 167772160);
                    this.method1156(var9 + 1, false, var8, 536870912);
                    this.method1156(var9, false, var8 - 1, 8388608);
                }
                if (arg0 == 3) {
                    this.method1156(var9, false, var8, 671088640);
                    this.method1156(var9, false, var8 - 1, 8388608);
                    this.method1156(var9 - 1, false, var8, 33554432);
                }
            }
        }
        int var10 = -79 % ((arg2 - 71) / 37);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIZIZI)V", line = 1261)
    public final void method1163(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5, int arg6) {
        int var8 = arg6 - this.field2522;
        if (arg4 != 3) {
            this.field2522 = 67;
        }
        int var9 = arg1 - this.field2512;
        field2513++;
        if (arg2 == 0) {
            if (arg0 == 0) {
                this.method1159(128, var9, var8, -90);
                this.method1159(8, var9 - 1, var8, -105);
            }
            if (arg0 == 1) {
                this.method1159(2, var9, var8, -104);
                this.method1159(32, var9, var8 + 1, -83);
            }
            if (arg0 == 2) {
                this.method1159(8, var9, var8, arg4 ^ 0xFFFFFFA6);
                this.method1159(128, var9 + 1, var8, -85);
            }
            if (arg0 == 3) {
                this.method1159(32, var9, var8, -64);
                this.method1159(2, var9, var8 - 1, -62);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg0 == 0) {
                this.method1159(1, var9, var8, -64);
                this.method1159(16, var9 - 1, var8 + 1, -85);
            }
            if (arg0 == 1) {
                this.method1159(4, var9, var8, -96);
                this.method1159(64, var9 + 1, var8 + 1, -82);
            }
            if (arg0 == 2) {
                this.method1159(16, var9, var8, -94);
                this.method1159(1, var9 + 1, var8 + -1, -90);
            }
            if (arg0 == 3) {
                this.method1159(64, var9, var8, arg4 ^ 0xFFFFFFAA);
                this.method1159(4, var9 - 1, var8 + -1, -112);
            }
        }
        if (arg2 == 2) {
            if (arg0 == 0) {
                this.method1159(130, var9, var8, -125);
                this.method1159(8, var9 - 1, var8, -102);
                this.method1159(32, var9, var8 + 1, -76);
            }
            if (arg0 == 1) {
                this.method1159(10, var9, var8, -120);
                this.method1159(32, var9, var8 + 1, -81);
                this.method1159(128, var9 + 1, var8, arg4 - 74);
            }
            if (arg0 == 2) {
                this.method1159(40, var9, var8, arg4 - 121);
                this.method1159(128, var9 + 1, var8, arg4 ^ 0xFFFFFFBE);
                this.method1159(2, var9, var8 - 1, -107);
            }
            if (arg0 == 3) {
                this.method1159(160, var9, var8, -107);
                this.method1159(2, var9, var8 - 1, -78);
                this.method1159(8, var9 - 1, var8, -125);
            }
        }
        if (arg3) {
            if (arg2 == 0) {
                if (arg0 == 0) {
                    this.method1159(65536, var9, var8, -115);
                    this.method1159(4096, var9 - 1, var8, -109);
                }
                if (arg0 == 1) {
                    this.method1159(1024, var9, var8, -69);
                    this.method1159(16384, var9, var8 + 1, -90);
                }
                if (arg0 == 2) {
                    this.method1159(4096, var9, var8, -83);
                    this.method1159(65536, var9 + 1, var8, arg4 ^ 0xFFFFFFA2);
                }
                if (arg0 == 3) {
                    this.method1159(16384, var9, var8, -65);
                    this.method1159(1024, var9, var8 - 1, -124);
                }
            }
            if (arg2 == 1 || arg2 == 3) {
                if (arg0 == 0) {
                    this.method1159(512, var9, var8, -113);
                    this.method1159(8192, var9 - 1, var8 - -1, -71);
                }
                if (arg0 == 1) {
                    this.method1159(2048, var9, var8, -119);
                    this.method1159(32768, var9 + 1, var8 + 1, -107);
                }
                if (arg0 == 2) {
                    this.method1159(8192, var9, var8, -119);
                    this.method1159(512, var9 + 1, var8 - 1, arg4 ^ 0xFFFFFFC0);
                }
                if (arg0 == 3) {
                    this.method1159(32768, var9, var8, arg4 - 65);
                    this.method1159(2048, var9 - 1, var8 + -1, -64);
                }
            }
            if (arg2 == 2) {
                if (arg0 == 0) {
                    this.method1159(66560, var9, var8, arg4 - 111);
                    this.method1159(4096, var9 - 1, var8, -102);
                    this.method1159(16384, var9, var8 + 1, -92);
                }
                if (arg0 == 1) {
                    this.method1159(5120, var9, var8, -84);
                    this.method1159(16384, var9, var8 + 1, -117);
                    this.method1159(65536, var9 + 1, var8, -120);
                }
                if (arg0 == 2) {
                    this.method1159(20480, var9, var8, -69);
                    this.method1159(65536, var9 + 1, var8, -81);
                    this.method1159(1024, var9, var8 - 1, -119);
                }
                if (arg0 == 3) {
                    this.method1159(81920, var9, var8, -63);
                    this.method1159(1024, var9, var8 - 1, -100);
                    this.method1159(4096, var9 - 1, var8, -60);
                }
            }
        }
        if (!arg5) {
            return;
        }
        if (arg2 == 0) {
            if (arg0 == 0) {
                this.method1159(536870912, var9, var8, -77);
                this.method1159(33554432, var9 - 1, var8, -81);
            }
            if (arg0 == 1) {
                this.method1159(8388608, var9, var8, arg4 ^ 0xFFFFFF86);
                this.method1159(134217728, var9, var8 + 1, -102);
            }
            if (arg0 == 2) {
                this.method1159(33554432, var9, var8, -72);
                this.method1159(536870912, var9 + 1, var8, -86);
            }
            if (arg0 == 3) {
                this.method1159(134217728, var9, var8, -124);
                this.method1159(8388608, var9, var8 - 1, -105);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg0 == 0) {
                this.method1159(4194304, var9, var8, -63);
                this.method1159(67108864, var9 - 1, var8 + 1, arg4 - 84);
            }
            if (arg0 == 1) {
                this.method1159(16777216, var9, var8, -101);
                this.method1159(268435456, var9 + 1, var8 + 1, arg4 - 125);
            }
            if (arg0 == 2) {
                this.method1159(67108864, var9, var8, arg4 ^ 0xFFFFFF88);
                this.method1159(4194304, var9 + 1, var8 + -1, -103);
            }
            if (arg0 == 3) {
                this.method1159(268435456, var9, var8, -110);
                this.method1159(16777216, var9 - 1, var8 + -1, -106);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method1159(545259520, var9, var8, -60);
            this.method1159(33554432, var9 - 1, var8, -89);
            this.method1159(134217728, var9, var8 + 1, -83);
        }
        if (arg0 == 1) {
            this.method1159(41943040, var9, var8, -80);
            this.method1159(134217728, var9, var8 + 1, -101);
            this.method1159(536870912, var9 + 1, var8, -70);
        }
        if (arg0 == 2) {
            this.method1159(167772160, var9, var8, -116);
            this.method1159(536870912, var9 + 1, var8, -78);
            this.method1159(8388608, var9, var8 - 1, arg4 ^ 0xFFFFFFA3);
        }
        if (arg0 == 3) {
            this.method1159(671088640, var9, var8, arg4 ^ 0xFFFFFFA9);
            this.method1159(8388608, var9, var8 - 1, -77);
            this.method1159(33554432, var9 - 1, var8, -107);
            return;
        }
    }
}
