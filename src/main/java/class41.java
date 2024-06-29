import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class41 {

    @OriginalMember(owner = "client!qr", name = "f", descriptor = "I")
    public static int field564 = -1;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!qr", name = "c", descriptor = "I")
    public int field561;

    @OriginalMember(owner = "client!qr", name = "d", descriptor = "I")
    public static int field562;

    @OriginalMember(owner = "client!qr", name = "e", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!qr", name = "g", descriptor = "I")
    public int field565;

    @OriginalMember(owner = "client!qr", name = "h", descriptor = "I")
    public int field566;

    @OriginalMember(owner = "client!qr", name = "i", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!qr", name = "j", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!qr", name = "k", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!qr", name = "l", descriptor = "I")
    public int field570;

    @OriginalMember(owner = "client!qr", name = "m", descriptor = "I")
    public static int field571;

    @OriginalMember(owner = "client!qr", name = "o", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!qr", name = "p", descriptor = "I")
    public static int field574;

    @OriginalMember(owner = "client!qr", name = "q", descriptor = "I")
    public static int field575;

    @OriginalMember(owner = "client!qr", name = "r", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!qr", name = "s", descriptor = "I")
    public static int field577;

    @OriginalMember(owner = "client!qr", name = "t", descriptor = "I")
    public static int field578;

    @OriginalMember(owner = "client!qr", name = "u", descriptor = "I")
    public static int field579;

    @OriginalMember(owner = "client!qr", name = "v", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!qr", name = "w", descriptor = "I")
    public static int field581;

    @OriginalMember(owner = "client!qr", name = "n", descriptor = "[[I")
    public int[][] field572;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method269(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field562++;
        if (arg3 != -3) {
            this.field565 = -19;
        }
        if (arg7 == 1) {
            if (arg5 == arg6 && arg1 == arg4) {
                return true;
            }
        } else if (arg6 <= arg5 && arg5 <= arg6 + arg7 - 1 && arg1 >= arg1 && arg1 <= (arg1 + arg7 - 1)) {
            return true;
        }
        int var9 = arg5 - this.field565;
        int var10 = arg4 - this.field570;
        int var11 = arg6 - this.field565;
        int var12 = arg1 - this.field570;
        if (arg7 == 1) {
            if (arg2 == 0) {
                if (arg0 == 0) {
                    if ((var9 - 1) == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var12 + 1) == var10 && (this.field572[var11][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 - 1) == var10 && (this.field572[var11][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var9 == var11 && (var12 + 1) == var10) {
                        return true;
                    }
                    if ((var9 - 1) == var11 && var10 == var12 && (this.field572[var11][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var10 == var12 && (this.field572[var11][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if ((var9 + 1) == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var12 + 1) == var10 && (this.field572[var11][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var12 - 1 == var10 && (this.field572[var11][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var9 == var11 && var12 - 1 == var10) {
                        return true;
                    }
                    if (var9 - 1 == var11 && var10 == var12 && (this.field572[var11][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 == var12 && (this.field572[var11][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 2) {
                if (arg0 == 0) {
                    if ((var9 - 1) == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var12 + 1) == var10) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 == var12 && (this.field572[var11][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 - 1) == var10 && (this.field572[var11][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var9 - 1 == var11 && var10 == var12 && (this.field572[var11][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 + 1) == var10) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var12 - 1) == var10 && (this.field572[var11][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if (var9 - 1 == var11 && var10 == var12 && (this.field572[var11][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 + 1) == var10 && (this.field572[var11][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var12 - 1) == var10) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var9 - 1 == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var12 + 1) == var10 && (this.field572[var11][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 == var12 && (this.field572[var11][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 - 1) == var10) {
                        return true;
                    }
                }
            }
            if (arg2 == 9) {
                if (var9 == var11 && var12 + 1 == var10 && (this.field572[var11][var10] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var11 && var12 - 1 == var10 && (this.field572[var11][var10] & 0x2) == 0) {
                    return true;
                }
                if (var9 - 1 == var11 && var10 == var12 && (this.field572[var11][var10] & 0x8) == 0) {
                    return true;
                }
                if (var9 + 1 == var11 && var10 == var12 && (this.field572[var11][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg7 + var11 - 1;
            int var14 = var10 + arg7 - 1;
            if (arg2 == 0) {
                if (arg0 == 0) {
                    if ((var9 - arg7) == var11 && var10 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var13 && (var12 + 1) == var10 && (this.field572[var9][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var13 >= var9 && (var12 - arg7) == var10 && (this.field572[var9][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var11 <= var9 && var9 <= var13 && (var12 + 1) == var10) {
                        return true;
                    }
                    if ((var9 - arg7) == var11 && var12 >= var10 && var14 >= var12 && (this.field572[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 <= var12 && var14 >= var12 && (this.field572[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if (var9 + 1 == var11 && var12 >= var10 && var14 >= var12) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var13 && var12 + 1 == var10 && (this.field572[var9][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 >= var11 && var13 >= var9 && var12 - arg7 == var10 && (this.field572[var9][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var11 <= var9 && var13 >= var9 && var12 - arg7 == var10) {
                        return true;
                    }
                    if ((var9 - arg7) == var11 && var10 <= var12 && var14 >= var12 && (this.field572[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var12 >= var10 && var12 <= var14 && (this.field572[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 2) {
                if (arg0 == 0) {
                    if ((var9 - arg7) == var11 && var12 >= var10 && var14 >= var12) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var13 && (var12 + 1) == var10) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var12 >= var10 && var12 <= var14 && (this.field572[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var9 <= var13 && var12 - arg7 == var10 && (this.field572[var9][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if ((var9 - arg7) == var11 && var10 <= var12 && var14 >= var12 && (this.field572[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var13 && var12 + 1 == var10) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 <= var12 && var14 >= var12) {
                        return true;
                    }
                    if (var11 <= var9 && var13 >= var9 && (var12 - arg7) == var10 && (this.field572[var9][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if ((var9 - arg7) == var11 && var12 >= var10 && var12 <= var14 && (this.field572[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var9 <= var13 && (var12 + 1) == var10 && (this.field572[var9][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var12 >= var10 && var12 <= var14) {
                        return true;
                    }
                    if (var11 <= var9 && var13 >= var9 && (var12 - arg7) == var10) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var9 - arg7 == var11 && var10 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var13 && var12 + 1 == var10 && (this.field572[var9][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 <= var12 && var14 >= var12 && (this.field572[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var13 && var12 - arg7 == var10) {
                        return true;
                    }
                }
            }
            if (arg2 == 9) {
                if (var9 >= var11 && var9 <= var13 && var12 + 1 == var10 && (this.field572[var9][var10] & 0x2C0120) == 0) {
                    return true;
                }
                if (var9 >= var11 && var13 >= var9 && (var12 - arg7) == var10 && (this.field572[var9][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if (var9 - arg7 == var11 && var10 <= var12 && var12 <= var14 && (this.field572[var13][var12] & 0x2C0108) == 0) {
                    return true;
                }
                if ((var9 + 1) == var11 && var12 >= var10 && var14 >= var12 && (this.field572[var11][var12] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(IIIIIIIIII)Z")
    public final boolean method270(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field559++;
        int var11 = arg6 + arg8;
        int var12 = arg4 + arg7;
        if (arg0 != 0) {
            this.field566 = -104;
        }
        int var13 = arg2 + arg5;
        int var14 = arg3 + arg9;
        if (arg8 == var13 && (arg1 & 0x2) == 0) {
            int var15 = arg9 >= arg7 ? arg9 : arg7;
            int var16 = var12 >= var14 ? var14 : var12;
            while (var16 > var15) {
                if ((this.field572[var13 - this.field565 - 1][var15 - this.field570] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg5 == var11 && (arg1 & 0x8) == 0) {
            int var17 = arg7 <= arg9 ? arg9 : arg7;
            int var18 = var14 <= var12 ? var14 : var12;
            while (var18 > var17) {
                if ((this.field572[arg5 - this.field565][var17 - this.field570] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg7 == var14 && (arg1 & 0x1) == 0) {
            int var19 = arg8 > arg5 ? arg8 : arg5;
            int var20 = var11 < var13 ? var11 : var13;
            while (var20 > var19) {
                if ((this.field572[var19 - this.field565][var14 - this.field570 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg9 == var12 && (arg1 & 0x4) == 0) {
            int var21 = arg5 >= arg8 ? arg5 : arg8;
            int var22 = var13 > var11 ? var11 : var13;
            while (var21 < var22) {
                if ((this.field572[var21 - this.field565][arg9 - this.field570] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(IBIIIIIII)Z")
    public final boolean method271(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field580++;
        if (arg7 > 1) {
            return class253.method1763(arg3, arg7, arg5, arg7, arg8, arg4, arg2, (byte) -91, arg6) ? true : this.method270(0, arg0, arg8, arg3, arg7, arg5, arg7, arg2, arg6, arg4);
        }
        int var10 = 105 / ((14 - arg1) / 52);
        int var11 = arg8 + arg5 - 1;
        int var12 = arg3 + arg4 - 1;
        if (arg6 >= arg5 && arg6 <= var11 && arg4 <= arg2 && var12 >= arg2) {
            return true;
        } else if (arg5 - 1 == arg6 && arg4 <= arg2 && arg2 <= var12 && (this.field572[arg6 - this.field565][arg2 - this.field570] & 0x8) == 0 && (arg0 & 0x8) == 0) {
            return true;
        } else if ((var11 + 1) == arg6 && arg4 <= arg2 && arg2 <= var12 && (this.field572[arg6 - this.field565][arg2 - this.field570] & 0x80) == 0 && (arg0 & 0x2) == 0) {
            return true;
        } else if ((arg4 - 1) == arg2 && arg6 >= arg5 && var11 >= arg6 && (this.field572[arg6 - this.field565][arg2 - this.field570] & 0x2) == 0 && (arg0 & 0x4) == 0) {
            return true;
        } else {
            return (var12 + 1) == arg2 && arg6 >= arg5 && var11 >= arg6 && (this.field572[arg6 - this.field565][arg2 - this.field570] & 0x20) == 0 && (arg0 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(IIII)V")
    private final void method272(int arg0, int arg1, int arg2, int arg3) {
        this.field572[arg3][arg0] = class209.method1483(this.field572[arg3][arg0], ~arg2);
        if (arg1 < 97) {
            this.method279(22, -34, true);
        }
        field573++;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(BIIIIZZI)V")
    public final void method273(byte arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6, int arg7) {
        field581++;
        int var9 = 256;
        if (arg5) {
            var9 |= 0x20000;
        }
        if (arg2 == 1 || arg2 == 3) {
            int var10 = arg7;
            arg7 = arg3;
            arg3 = var10;
        }
        if (arg0 != -87) {
            this.field572 = null;
        }
        int var11 = arg4 - this.field570;
        int var12 = arg1 - this.field565;
        if (arg6) {
            var9 |= 0x40000000;
        }
        for (int var13 = var12; var13 < var12 + arg7; var13++) {
            if (var13 >= 0 && var13 < this.field566) {
                for (int var14 = var11; var14 < (arg3 + var11); var14++) {
                    if (var14 >= 0 && this.field561 > var14) {
                        this.method272(var14, 112, var9, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "(IIII)V")
    private final void method274(int arg0, int arg1, int arg2, int arg3) {
        field563++;
        this.field572[arg1][arg2] = class332.method2176(this.field572[arg1][arg2], arg0);
        if (arg3 > -35) {
            this.method269(-12, -30, -64, -74, -27, -85, -126, -51);
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(IBI)V")
    public final void method275(int arg0, byte arg1, int arg2) {
        int var4 = 38 / ((arg1 - 51) / 53);
        int var5 = arg2 - this.field570;
        int var6 = arg0 - this.field565;
        field569++;
        this.field572[var6][var5] = class332.method2176(this.field572[var6][var5], 262144);
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(IIZIZII)V")
    public final void method276(int arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (arg6 != -1) {
            return;
        }
        field575++;
        int var8 = 256;
        if (arg4) {
            var8 |= 0x20000;
        }
        if (arg2) {
            var8 |= 0x40000000;
        }
        int var9 = arg3 - this.field565;
        int var10 = arg5 - this.field570;
        for (int var11 = var9; var11 < var9 + arg1; var11++) {
            if (var11 >= 0 && var11 < this.field566) {
                for (int var12 = var10; var12 < (arg0 + var10); var12++) {
                    if (var12 >= 0 && var12 < this.field561) {
                        this.method274(var8, var11, var12, -46);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(Z)V")
    public final void method277(boolean arg0) {
        field574++;
        if (!arg0) {
            return;
        }
        for (int var2 = 0; var2 < this.field566; var2++) {
            for (int var3 = 0; var3 < this.field561; var3++) {
                if (var2 == 0 || var3 == 0 || (this.field566 - 5) <= var2 || var3 >= (this.field561 - 5)) {
                    this.field572[var2][var3] = -1;
                } else {
                    this.field572[var2][var3] = 2097152;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(IZIIBIZ)V")
    public final void method278(int arg0, boolean arg1, int arg2, int arg3, byte arg4, int arg5, boolean arg6) {
        int var8 = arg2 - this.field565;
        int var9 = arg5 - this.field570;
        field576++;
        if (arg3 == 0) {
            if (arg0 == 0) {
                this.method274(128, var8, var9, -113);
                this.method274(8, var8 - 1, var9, -87);
            }
            if (arg0 == 1) {
                this.method274(2, var8, var9, -82);
                this.method274(32, var8, var9 + 1, -67);
            }
            if (arg0 == 2) {
                this.method274(8, var8, var9, -80);
                this.method274(128, var8 + 1, var9, -64);
            }
            if (arg0 == 3) {
                this.method274(32, var8, var9, -65);
                this.method274(2, var8, var9 - 1, -116);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg0 == 0) {
                this.method274(1, var8, var9, -124);
                this.method274(16, var8 - 1, var9 + 1, -101);
            }
            if (arg0 == 1) {
                this.method274(4, var8, var9, -109);
                this.method274(64, var8 + 1, var9 + 1, -125);
            }
            if (arg0 == 2) {
                this.method274(16, var8, var9, -52);
                this.method274(1, var8 + 1, var9 + -1, -116);
            }
            if (arg0 == 3) {
                this.method274(64, var8, var9, -104);
                this.method274(4, var8 - 1, var9 - 1, -43);
            }
        }
        if (arg3 == 2) {
            if (arg0 == 0) {
                this.method274(130, var8, var9, -107);
                this.method274(8, var8 - 1, var9, -108);
                this.method274(32, var8, var9 + 1, -116);
            }
            if (arg0 == 1) {
                this.method274(10, var8, var9, -84);
                this.method274(32, var8, var9 + 1, -93);
                this.method274(128, var8 + 1, var9, -73);
            }
            if (arg0 == 2) {
                this.method274(40, var8, var9, -122);
                this.method274(128, var8 + 1, var9, -126);
                this.method274(2, var8, var9 - 1, -38);
            }
            if (arg0 == 3) {
                this.method274(160, var8, var9, -48);
                this.method274(2, var8, var9 - 1, -128);
                this.method274(8, var8 - 1, var9, -107);
            }
        }
        if (arg6) {
            if (arg3 == 0) {
                if (arg0 == 0) {
                    this.method274(65536, var8, var9, -79);
                    this.method274(4096, var8 - 1, var9, -115);
                }
                if (arg0 == 1) {
                    this.method274(1024, var8, var9, -106);
                    this.method274(16384, var8, var9 + 1, -102);
                }
                if (arg0 == 2) {
                    this.method274(4096, var8, var9, -45);
                    this.method274(65536, var8 + 1, var9, -117);
                }
                if (arg0 == 3) {
                    this.method274(16384, var8, var9, -63);
                    this.method274(1024, var8, var9 - 1, -95);
                }
            }
            if (arg3 == 1 || arg3 == 3) {
                if (arg0 == 0) {
                    this.method274(512, var8, var9, -46);
                    this.method274(8192, var8 - 1, var9 - -1, -90);
                }
                if (arg0 == 1) {
                    this.method274(2048, var8, var9, -83);
                    this.method274(32768, var8 + 1, var9 + 1, -127);
                }
                if (arg0 == 2) {
                    this.method274(8192, var8, var9, -51);
                    this.method274(512, var8 + 1, var9 + -1, -83);
                }
                if (arg0 == 3) {
                    this.method274(32768, var8, var9, -63);
                    this.method274(2048, var8 - 1, var9 + -1, -54);
                }
            }
            if (arg3 == 2) {
                if (arg0 == 0) {
                    this.method274(66560, var8, var9, -42);
                    this.method274(4096, var8 - 1, var9, -45);
                    this.method274(16384, var8, var9 + 1, -61);
                }
                if (arg0 == 1) {
                    this.method274(5120, var8, var9, -119);
                    this.method274(16384, var8, var9 + 1, -48);
                    this.method274(65536, var8 + 1, var9, -69);
                }
                if (arg0 == 2) {
                    this.method274(20480, var8, var9, -121);
                    this.method274(65536, var8 + 1, var9, -77);
                    this.method274(1024, var8, var9 - 1, -127);
                }
                if (arg0 == 3) {
                    this.method274(81920, var8, var9, -96);
                    this.method274(1024, var8, var9 - 1, -82);
                    this.method274(4096, var8 - 1, var9, -92);
                }
            }
        }
        if (arg1) {
            if (arg3 == 0) {
                if (arg0 == 0) {
                    this.method274(536870912, var8, var9, -120);
                    this.method274(33554432, var8 - 1, var9, -84);
                }
                if (arg0 == 1) {
                    this.method274(8388608, var8, var9, -81);
                    this.method274(134217728, var8, var9 + 1, -87);
                }
                if (arg0 == 2) {
                    this.method274(33554432, var8, var9, -110);
                    this.method274(536870912, var8 + 1, var9, -62);
                }
                if (arg0 == 3) {
                    this.method274(134217728, var8, var9, -103);
                    this.method274(8388608, var8, var9 - 1, -115);
                }
            }
            if (arg3 == 1 || arg3 == 3) {
                if (arg0 == 0) {
                    this.method274(4194304, var8, var9, -77);
                    this.method274(67108864, var8 - 1, var9 + 1, -40);
                }
                if (arg0 == 1) {
                    this.method274(16777216, var8, var9, -47);
                    this.method274(268435456, var8 + 1, var9 + 1, -89);
                }
                if (arg0 == 2) {
                    this.method274(67108864, var8, var9, -106);
                    this.method274(4194304, var8 + 1, var9 + -1, -37);
                }
                if (arg0 == 3) {
                    this.method274(268435456, var8, var9, -90);
                    this.method274(16777216, var8 - 1, var9 - 1, -43);
                }
            }
            if (arg3 == 2) {
                if (arg0 == 0) {
                    this.method274(545259520, var8, var9, -45);
                    this.method274(33554432, var8 - 1, var9, -88);
                    this.method274(134217728, var8, var9 + 1, -111);
                }
                if (arg0 == 1) {
                    this.method274(41943040, var8, var9, -115);
                    this.method274(134217728, var8, var9 + 1, -105);
                    this.method274(536870912, var8 + 1, var9, -59);
                }
                if (arg0 == 2) {
                    this.method274(167772160, var8, var9, -112);
                    this.method274(536870912, var8 + 1, var9, -101);
                    this.method274(8388608, var8, var9 - 1, -77);
                }
                if (arg0 == 3) {
                    this.method274(671088640, var8, var9, -105);
                    this.method274(8388608, var8, var9 - 1, -63);
                    this.method274(33554432, var8 - 1, var9, -104);
                }
            }
        }
        if (arg4 >= -92) {
            this.field570 = 80;
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(IIZ)V")
    public final void method279(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            int var4 = arg1 - this.field570;
            field567++;
            int var5 = arg0 - this.field565;
            this.field572[var5][var4] = class209.method1483(this.field572[var5][var4], -2097153);
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(Ljava/lang/String;BZ)V")
    public static final void method280(String arg0, byte arg1, boolean arg2) {
        String var3 = arg0.toLowerCase();
        field578++;
        short[] var4 = new short[16];
        int var5 = 0;
        int var6 = arg2 ? 32768 : 0;
        int var7 = (arg2 ? class13.field179 : class293.field4242) + var6;
        for (int var8 = var6; var8 < var7; var8++) {
            class59 var12 = class23.method126(32767, var8);
            if (var12.field799 && var12.method389((byte) -125).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class297.field4327 = null;
                    class324.field4722 = -1;
                    return;
                }
                if (var4.length <= var5) {
                    short[] var13 = new short[var4.length * 2];
                    for (int var14 = 0; var14 < var5; var14++) {
                        var13[var14] = var4[var14];
                    }
                    var4 = var13;
                }
                var4[var5++] = (short) var8;
            }
        }
        class297.field4327 = var4;
        class324.field4722 = var5;
        class19.field255 = 0;
        String[] var9 = new String[class324.field4722];
        int var10 = 0;
        int var11 = -18 / ((77 - arg1) / 42);
        while (class324.field4722 > var10) {
            var9[var10] = class23.method126(32767, var4[var10]).method389((byte) -117);
            var10++;
        }
        class376.method2401(false, var9, class297.field4327);
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(IZ)Lac;")
    public static final class320 method281(int arg0, boolean arg1) {
        field568++;
        class320 var2 = (class320) class24.field305.method99(arg1, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class86.field1119.method643(34, arg0, true);
        class320 var4 = new class320();
        if (var3 != null) {
            var4.method2129(new class130(var3), arg0, (byte) -91);
        }
        class24.field305.method90(var4, (long) arg0, 0);
        return var4;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(BZIIIIZ)V")
    public final void method282(byte arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        int var8 = arg2 - this.field570;
        int var9 = arg4 - this.field565;
        field571++;
        if (arg5 == 0) {
            if (arg3 == 0) {
                this.method272(var8, 125, 128, var9);
                this.method272(var8, 123, 8, var9 - 1);
            }
            if (arg3 == 1) {
                this.method272(var8, 111, 2, var9);
                this.method272(var8 + 1, 114, 32, var9);
            }
            if (arg3 == 2) {
                this.method272(var8, 126, 8, var9);
                this.method272(var8, 99, 128, var9 + 1);
            }
            if (arg3 == 3) {
                this.method272(var8, 110, 32, var9);
                this.method272(var8 - 1, 125, 2, var9);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg3 == 0) {
                this.method272(var8, 116, 1, var9);
                this.method272(var8 + 1, 98, 16, var9 - 1);
            }
            if (arg3 == 1) {
                this.method272(var8, 125, 4, var9);
                this.method272(var8 + 1, 116, 64, var9 + 1);
            }
            if (arg3 == 2) {
                this.method272(var8, 127, 16, var9);
                this.method272(var8 - 1, 118, 1, var9 + 1);
            }
            if (arg3 == 3) {
                this.method272(var8, 104, 64, var9);
                this.method272(var8 - 1, 126, 4, var9 - 1);
            }
        }
        if (arg5 == 2) {
            if (arg3 == 0) {
                this.method272(var8, 106, 130, var9);
                this.method272(var8, 119, 8, var9 - 1);
                this.method272(var8 + 1, 108, 32, var9);
            }
            if (arg3 == 1) {
                this.method272(var8, 116, 10, var9);
                this.method272(var8 + 1, 106, 32, var9);
                this.method272(var8, 116, 128, var9 + 1);
            }
            if (arg3 == 2) {
                this.method272(var8, 118, 40, var9);
                this.method272(var8, 122, 128, var9 + 1);
                this.method272(var8 - 1, 102, 2, var9);
            }
            if (arg3 == 3) {
                this.method272(var8, 119, 160, var9);
                this.method272(var8 - 1, 99, 2, var9);
                this.method272(var8, 111, 8, var9 - 1);
            }
        }
        if (arg1) {
            if (arg5 == 0) {
                if (arg3 == 0) {
                    this.method272(var8, 107, 65536, var9);
                    this.method272(var8, 111, 4096, var9 - 1);
                }
                if (arg3 == 1) {
                    this.method272(var8, 113, 1024, var9);
                    this.method272(var8 + 1, 127, 16384, var9);
                }
                if (arg3 == 2) {
                    this.method272(var8, 101, 4096, var9);
                    this.method272(var8, 109, 65536, var9 + 1);
                }
                if (arg3 == 3) {
                    this.method272(var8, 108, 16384, var9);
                    this.method272(var8 - 1, 112, 1024, var9);
                }
            }
            if (arg5 == 1 || arg5 == 3) {
                if (arg3 == 0) {
                    this.method272(var8, 104, 512, var9);
                    this.method272(var8 + 1, 104, 8192, var9 - 1);
                }
                if (arg3 == 1) {
                    this.method272(var8, 98, 2048, var9);
                    this.method272(var8 + 1, 119, 32768, var9 + 1);
                }
                if (arg3 == 2) {
                    this.method272(var8, 101, 8192, var9);
                    this.method272(var8 - 1, 119, 512, var9 + 1);
                }
                if (arg3 == 3) {
                    this.method272(var8, 105, 32768, var9);
                    this.method272(var8 - 1, 107, 2048, var9 - 1);
                }
            }
            if (arg5 == 2) {
                if (arg3 == 0) {
                    this.method272(var8, 124, 66560, var9);
                    this.method272(var8, 120, 4096, var9 - 1);
                    this.method272(var8 + 1, 104, 16384, var9);
                }
                if (arg3 == 1) {
                    this.method272(var8, 115, 5120, var9);
                    this.method272(var8 + 1, 108, 16384, var9);
                    this.method272(var8, 108, 65536, var9 + 1);
                }
                if (arg3 == 2) {
                    this.method272(var8, 108, 20480, var9);
                    this.method272(var8, 106, 65536, var9 + 1);
                    this.method272(var8 - 1, 121, 1024, var9);
                }
                if (arg3 == 3) {
                    this.method272(var8, 118, 81920, var9);
                    this.method272(var8 - 1, 122, 1024, var9);
                    this.method272(var8, 113, 4096, var9 - 1);
                }
            }
        }
        if (arg6) {
            if (arg5 == 0) {
                if (arg3 == 0) {
                    this.method272(var8, 121, 536870912, var9);
                    this.method272(var8, 109, 33554432, var9 - 1);
                }
                if (arg3 == 1) {
                    this.method272(var8, 119, 8388608, var9);
                    this.method272(var8 + 1, 110, 134217728, var9);
                }
                if (arg3 == 2) {
                    this.method272(var8, 104, 33554432, var9);
                    this.method272(var8, 98, 536870912, var9 + 1);
                }
                if (arg3 == 3) {
                    this.method272(var8, 121, 134217728, var9);
                    this.method272(var8 - 1, 114, 8388608, var9);
                }
            }
            if (arg5 == 1 || arg5 == 3) {
                if (arg3 == 0) {
                    this.method272(var8, 127, 4194304, var9);
                    this.method272(var8 + 1, 115, 67108864, var9 - 1);
                }
                if (arg3 == 1) {
                    this.method272(var8, 127, 16777216, var9);
                    this.method272(var8 + 1, 122, 268435456, var9 + 1);
                }
                if (arg3 == 2) {
                    this.method272(var8, 117, 67108864, var9);
                    this.method272(var8 - 1, 124, 4194304, var9 + 1);
                }
                if (arg3 == 3) {
                    this.method272(var8, 109, 268435456, var9);
                    this.method272(var8 - 1, 99, 16777216, var9 - 1);
                }
            }
            if (arg5 == 2) {
                if (arg3 == 0) {
                    this.method272(var8, 101, 545259520, var9);
                    this.method272(var8, 116, 33554432, var9 - 1);
                    this.method272(var8 + 1, 106, 134217728, var9);
                }
                if (arg3 == 1) {
                    this.method272(var8, 115, 41943040, var9);
                    this.method272(var8 + 1, 100, 134217728, var9);
                    this.method272(var8, 107, 536870912, var9 + 1);
                }
                if (arg3 == 2) {
                    this.method272(var8, 120, 167772160, var9);
                    this.method272(var8, 117, 536870912, var9 + 1);
                    this.method272(var8 - 1, 103, 8388608, var9);
                }
                if (arg3 == 3) {
                    this.method272(var8, 105, 671088640, var9);
                    this.method272(var8 - 1, 118, 8388608, var9);
                    this.method272(var8, 102, 33554432, var9 - 1);
                }
            }
        }
        if (arg0 <= 55) {
            method280((String) null, (byte) 91, false);
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(IZIIIIII)Z")
    public final boolean method283(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field560++;
        if (arg5 == 1) {
            if (arg4 == arg7 && arg2 == arg6) {
                return true;
            }
        } else if (arg4 >= arg7 && arg4 <= (arg7 + arg5 - 1) && arg6 >= arg6 && arg5 + arg6 - 1 >= arg6) {
            return true;
        }
        if (arg1) {
            return true;
        }
        int var9 = arg2 - this.field570;
        int var10 = arg6 - this.field570;
        int var11 = arg4 - this.field565;
        int var12 = arg7 - this.field565;
        if (arg5 == 1) {
            if (arg0 == 6 || arg0 == 7) {
                if (arg0 == 7) {
                    arg3 = arg3 + 2 & 0x3;
                }
                if (arg3 == 0) {
                    if (var11 + 1 == var12 && var9 == var10 && (this.field572[var12][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var10 - 1) == var9 && (this.field572[var12][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var11 - 1 == var12 && var9 == var10 && (this.field572[var12][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var10 - 1) == var9 && (this.field572[var12][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var11 - 1 == var12 && var9 == var10 && (this.field572[var12][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var10 + 1 == var9 && (this.field572[var12][var9] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var11 + 1 == var12 && var9 == var10 && (this.field572[var12][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var10 + 1) == var9 && (this.field572[var12][var9] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 8) {
                if (var11 == var12 && var10 + 1 == var9 && (this.field572[var12][var9] & 0x20) == 0) {
                    return true;
                }
                if (var11 == var12 && (var10 - 1) == var9 && (this.field572[var12][var9] & 0x2) == 0) {
                    return true;
                }
                if (var11 - 1 == var12 && var9 == var10 && (this.field572[var12][var9] & 0x8) == 0) {
                    return true;
                }
                if ((var11 + 1) == var12 && var9 == var10 && (this.field572[var12][var9] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg5 + var12 - 1;
            int var14 = arg5 + var9 - 1;
            if (arg0 == 6 || arg0 == 7) {
                if (arg0 == 7) {
                    arg3 = arg3 + 2 & 0x3;
                }
                if (arg3 == 0) {
                    if (var11 + 1 == var12 && var10 >= var9 && var10 <= var14 && (this.field572[var12][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 <= var11 && var13 >= var11 && var10 - arg5 == var9 && (this.field572[var11][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if ((var11 - arg5) == var12 && var10 >= var9 && var10 <= var14 && (this.field572[var13][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 >= var12 && var13 >= var11 && (var10 - arg5) == var9 && (this.field572[var11][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if ((var11 - arg5) == var12 && var9 <= var10 && var10 <= var14 && (this.field572[var13][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 >= var12 && var11 <= var13 && (var10 + 1) == var9 && (this.field572[var11][var9] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var11 + 1 == var12 && var9 <= var10 && var10 <= var14 && (this.field572[var12][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 >= var12 && var13 >= var11 && (var10 + 1) == var9 && (this.field572[var11][var9] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 8) {
                if (var12 <= var11 && var11 <= var13 && var10 + 1 == var9 && (this.field572[var11][var9] & 0x20) == 0) {
                    return true;
                }
                if (var11 >= var12 && var11 <= var13 && var10 - arg5 == var9 && (this.field572[var11][var14] & 0x2) == 0) {
                    return true;
                }
                if (var11 - arg5 == var12 && var9 <= var10 && var10 <= var14 && (this.field572[var13][var10] & 0x8) == 0) {
                    return true;
                }
                if ((var11 + 1) == var12 && var9 <= var10 && var10 <= var14 && (this.field572[var12][var10] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(BII)V")
    public final void method284(byte arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field570;
        int var5 = arg2 - this.field565;
        if (arg0 < -5) {
            field579++;
            this.field572[var5][var4] = class332.method2176(this.field572[var5][var4], 2097152);
        }
    }

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "(IBI)V")
    public final void method285(int arg0, byte arg1, int arg2) {
        field577++;
        int var4 = arg0 - this.field570;
        int var5 = arg2 - this.field565;
        this.field572[var5][var4] = class209.method1483(this.field572[var5][var4], -262145);
        if (arg1 != 80) {
            method281(117, false);
        }
    }
}
