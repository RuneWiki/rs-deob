import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class661 {

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "Leb;")
    public static class584 field9384 = new class584();

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
    public static int field9376;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
    public static int field9377;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
    public static int field9378;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
    public static int field9379;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
    public int field9380;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    public static int field9381;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public static int field9382;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
    public static int field9383;

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
    public int field9385;

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "I")
    public static int field9386;

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "I")
    public static int field9387;

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "I")
    public int field9388;

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "I")
    public static int field9389;

    @OriginalMember(owner = "client!ed", name = "o", descriptor = "I")
    public static int field9390;

    @OriginalMember(owner = "client!ed", name = "q", descriptor = "I")
    public static int field9392;

    @OriginalMember(owner = "client!ed", name = "r", descriptor = "I")
    public static int field9393;

    @OriginalMember(owner = "client!ed", name = "t", descriptor = "I")
    public static int field9395;

    @OriginalMember(owner = "client!ed", name = "u", descriptor = "I")
    public static int field9396;

    @OriginalMember(owner = "client!ed", name = "v", descriptor = "I")
    public static int field9397;

    @OriginalMember(owner = "client!ed", name = "w", descriptor = "I")
    public int field9398;

    @OriginalMember(owner = "client!ed", name = "x", descriptor = "I")
    public static int field9399;

    @OriginalMember(owner = "client!ed", name = "s", descriptor = "[I")
    public static int[] field9394;

    @OriginalMember(owner = "client!ed", name = "p", descriptor = "[[I")
    public int[][] field9391;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IZIIIZI)V")
    public final void method3701(int arg0, boolean arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field9386++;
        int var8 = 256;
        if (arg5) {
            var8 |= 0x20000;
        }
        int var9 = arg3 - this.field9385;
        int var10 = -69 % ((-arg4 - 40) / 62);
        if (arg1) {
            var8 |= 0x40000000;
        }
        int var11 = arg6 - this.field9388;
        for (int var12 = var9; var12 < (arg0 + var9); var12++) {
            if (var12 >= 0 && this.field9380 > var12) {
                for (int var13 = var11; var13 < (arg2 + var11); var13++) {
                    if (var13 >= 0 && this.field9398 > var13) {
                        this.method3708(var8, var13, var12, (byte) -90);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZII)V")
    public final void method3702(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            int var4 = arg2 - this.field9388;
            int var5 = arg1 - this.field9385;
            field9389++;
            this.field9391[var5][var4] = class571.method3139(this.field9391[var5][var4], -262145);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V")
    public final void method3703(byte arg0) {
        field9379++;
        int var2 = 41 / ((arg0 - 45) / 58);
        for (int var3 = 0; var3 < this.field9380; var3++) {
            for (int var4 = 0; var4 < this.field9398; var4++) {
                if (var3 == 0 || var4 == 0 || this.field9380 - 5 <= var3 || var4 >= (this.field9398 - 5)) {
                    this.field9391[var3][var4] = -1;
                } else {
                    this.field9391[var3][var4] = 2097152;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z)V")
    public static final void method3704(boolean arg0) {
        class684.field9622 = arg0;
        field9396++;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method3705(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field9392++;
        if (arg0 == 1) {
            if (arg3 == arg7 && arg1 == arg2) {
                return true;
            }
        } else if (arg7 >= arg3 && arg7 <= arg0 + arg3 - 1 && arg1 <= arg1 && arg1 <= (arg1 + arg0 - 1)) {
            return true;
        }
        if (arg4 > -38) {
            field9384 = null;
        }
        int var9 = arg2 - this.field9388;
        int var10 = arg3 - this.field9385;
        int var11 = arg7 - this.field9385;
        int var12 = arg1 - this.field9388;
        if (arg0 == 1) {
            if (arg5 == 0) {
                if (arg6 == 0) {
                    if ((var11 - 1) == var10 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9 && (this.field9391[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var9 && (this.field9391[var10][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var10 == var11 && (var12 + 1) == var9) {
                        return true;
                    }
                    if ((var11 - 1) == var10 && var9 == var12 && (this.field9391[var10][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var9 == var12 && (this.field9391[var10][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if ((var11 + 1) == var10 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9 && (this.field9391[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var9 && (this.field9391[var10][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var10 == var11 && (var12 - 1) == var9) {
                        return true;
                    }
                    if (var11 - 1 == var10 && var9 == var12 && (this.field9391[var10][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var9 == var12 && (this.field9391[var10][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 2) {
                if (arg6 == 0) {
                    if (var11 - 1 == var10 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var12 + 1 == var9) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var9 == var12 && (this.field9391[var10][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var9 && (this.field9391[var10][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var11 - 1 == var10 && var9 == var12 && (this.field9391[var10][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9) {
                        return true;
                    }
                    if ((var11 + 1) == var10 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var9 && (this.field9391[var10][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if (var11 - 1 == var10 && var9 == var12 && (this.field9391[var10][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9 && (this.field9391[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var10 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var12 - 1) == var9) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var11 - 1 == var10 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9 && (this.field9391[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var10 && var9 == var12 && (this.field9391[var10][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var9) {
                        return true;
                    }
                }
            }
            if (arg5 == 9) {
                if (var10 == var11 && var12 + 1 == var9 && (this.field9391[var10][var9] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var11 && (var12 - 1) == var9 && (this.field9391[var10][var9] & 0x2) == 0) {
                    return true;
                }
                if (var11 - 1 == var10 && var9 == var12 && (this.field9391[var10][var9] & 0x8) == 0) {
                    return true;
                }
                if (var11 + 1 == var10 && var9 == var12 && (this.field9391[var10][var9] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var10 + arg0 - 1;
            int var14 = arg0 + var9 - 1;
            if (arg5 == 0) {
                if (arg6 == 0) {
                    if (var11 - arg0 == var10 && var12 >= var9 && var14 >= var12) {
                        return true;
                    }
                    if (var11 >= var10 && var11 <= var13 && (var12 + 1) == var9 && (this.field9391[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 >= var10 && var13 >= var11 && (var12 - arg0) == var9 && (this.field9391[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var11 >= var10 && var13 >= var11 && (var12 + 1) == var9) {
                        return true;
                    }
                    if ((var11 - arg0) == var10 && var9 <= var12 && var12 <= var14 && (this.field9391[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var12 >= var9 && var12 <= var14 && (this.field9391[var10][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if ((var11 + 1) == var10 && var9 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var11 >= var10 && var13 >= var11 && (var12 + 1) == var9 && (this.field9391[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 >= var10 && var13 >= var11 && (var12 - arg0) == var9 && (this.field9391[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var11 >= var10 && var11 <= var13 && (var12 - arg0) == var9) {
                        return true;
                    }
                    if (var11 - arg0 == var10 && var9 <= var12 && var14 >= var12 && (this.field9391[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var9 <= var12 && var14 >= var12 && (this.field9391[var10][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 2) {
                if (arg6 == 0) {
                    if (var11 - arg0 == var10 && var12 >= var9 && var14 >= var12) {
                        return true;
                    }
                    if (var10 <= var11 && var13 >= var11 && var12 + 1 == var9) {
                        return true;
                    }
                    if ((var11 + 1) == var10 && var9 <= var12 && var14 >= var12 && (this.field9391[var10][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 <= var11 && var13 >= var11 && var12 - arg0 == var9 && (this.field9391[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var11 - arg0 == var10 && var12 >= var9 && var12 <= var14 && (this.field9391[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 >= var10 && var11 <= var13 && (var12 + 1) == var9) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var9 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var11 >= var10 && var13 >= var11 && var12 - arg0 == var9 && (this.field9391[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if (var11 - arg0 == var10 && var9 <= var12 && var14 >= var12 && (this.field9391[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 >= var10 && var11 <= var13 && var12 + 1 == var9 && (this.field9391[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var12 >= var9 && var14 >= var12) {
                        return true;
                    }
                    if (var10 <= var11 && var13 >= var11 && (var12 - arg0) == var9) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var11 - arg0 == var10 && var9 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var11 >= var10 && var11 <= var13 && var12 + 1 == var9 && (this.field9391[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var12 >= var9 && var14 >= var12 && (this.field9391[var10][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 <= var11 && var11 <= var13 && var12 - arg0 == var9) {
                        return true;
                    }
                }
            }
            if (arg5 == 9) {
                if (var10 <= var11 && var11 <= var13 && (var12 + 1) == var9 && (this.field9391[var11][var9] & 0x2C0120) == 0) {
                    return true;
                }
                if (var11 >= var10 && var11 <= var13 && (var12 - arg0) == var9 && (this.field9391[var11][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if ((var11 - arg0) == var10 && var9 <= var12 && var12 <= var14 && (this.field9391[var13][var12] & 0x2C0108) == 0) {
                    return true;
                }
                if (var11 + 1 == var10 && var12 >= var9 && var12 <= var14 && (this.field9391[var10][var12] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIIBIII)Z")
    public final boolean method3706(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8) {
        field9382++;
        if (arg1 > 1) {
            return class502.method2790(arg4, arg1, arg8, arg3, arg6, arg1, arg2, arg0, -24945) ? true : this.method3716(arg1, arg3, arg1, arg5 ^ 0xFFFFFFF9, arg2, arg0, arg8, arg7, arg4, arg6);
        } else if (arg5 == -5) {
            int var10 = arg3 + arg6 - 1;
            int var11 = arg2 + arg8 - 1;
            if (arg0 >= arg6 && var10 >= arg0 && arg4 >= arg2 && var11 >= arg4) {
                return true;
            } else if ((arg6 - 1) == arg0 && arg4 >= arg2 && var11 >= arg4 && (this.field9391[arg0 - this.field9385][arg4 - this.field9388] & 0x8) == 0 && (arg7 & 0x8) == 0) {
                return true;
            } else if (var10 + 1 == arg0 && arg4 >= arg2 && var11 >= arg4 && (this.field9391[arg0 - this.field9385][arg4 - this.field9388] & 0x80) == 0 && (arg7 & 0x2) == 0) {
                return true;
            } else if (arg2 - 1 == arg4 && arg6 <= arg0 && var10 >= arg0 && (this.field9391[arg0 - this.field9385][arg4 - this.field9388] & 0x2) == 0 && (arg7 & 0x4) == 0) {
                return true;
            } else {
                return var11 + 1 == arg4 && arg0 >= arg6 && arg0 <= var10 && (this.field9391[arg0 - this.field9385][arg4 - this.field9388] & 0x20) == 0 && (arg7 & 0x1) == 0;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIIBII)Z")
    public final boolean method3707(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        field9395++;
        if (arg1 == 1) {
            if (arg3 == arg7 && arg0 == arg6) {
                return true;
            }
        } else if (arg3 >= arg7 && arg3 <= arg1 + arg7 - 1 && arg6 >= arg6 && (arg1 + arg6 - 1) >= arg6) {
            return true;
        }
        int var9 = arg7 - this.field9385;
        int var10 = arg6 - this.field9388;
        int var11 = arg0 - this.field9388;
        if (arg5 >= -64) {
            method3715((byte) 114);
        }
        int var12 = arg3 - this.field9385;
        if (arg1 == 1) {
            if (arg4 == 6 || arg4 == 7) {
                if (arg4 == 7) {
                    arg2 = arg2 + 2 & 0x3;
                }
                if (arg2 == 0) {
                    if ((var12 + 1) == var9 && var10 == var11 && (this.field9391[var9][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var10 - 1 == var11 && (this.field9391[var9][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if ((var12 - 1) == var9 && var10 == var11 && (this.field9391[var9][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var10 - 1) == var11 && (this.field9391[var9][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if ((var12 - 1) == var9 && var10 == var11 && (this.field9391[var9][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var10 + 1 == var11 && (this.field9391[var9][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var12 + 1 == var9 && var10 == var11 && (this.field9391[var9][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var10 + 1 == var11 && (this.field9391[var9][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 8) {
                if (var9 == var12 && var10 + 1 == var11 && (this.field9391[var9][var11] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var12 && (var10 - 1) == var11 && (this.field9391[var9][var11] & 0x2) == 0) {
                    return true;
                }
                if (var12 - 1 == var9 && var10 == var11 && (this.field9391[var9][var11] & 0x8) == 0) {
                    return true;
                }
                if (var12 + 1 == var9 && var10 == var11 && (this.field9391[var9][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var9 + arg1 - 1;
            int var14 = var11 + arg1 - 1;
            if (arg4 == 6 || arg4 == 7) {
                if (arg4 == 7) {
                    arg2 = arg2 + 2 & 0x3;
                }
                if (arg2 == 0) {
                    if (var12 + 1 == var9 && var11 <= var10 && var10 <= var14 && (this.field9391[var9][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 >= var9 && var13 >= var12 && (var10 - arg1) == var11 && (this.field9391[var12][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if ((var12 - arg1) == var9 && var10 >= var11 && var14 >= var10 && (this.field9391[var13][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 <= var12 && var12 <= var13 && var10 - arg1 == var11 && (this.field9391[var12][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if (var12 - arg1 == var9 && var10 >= var11 && var10 <= var14 && (this.field9391[var13][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 <= var12 && var12 <= var13 && var10 + 1 == var11 && (this.field9391[var12][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if ((var12 + 1) == var9 && var10 >= var11 && var10 <= var14 && (this.field9391[var9][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 >= var9 && var13 >= var12 && (var10 + 1) == var11 && (this.field9391[var12][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 8) {
                if (var12 >= var9 && var13 >= var12 && var10 + 1 == var11 && (this.field9391[var12][var11] & 0x20) == 0) {
                    return true;
                }
                if (var9 <= var12 && var13 >= var12 && var10 - arg1 == var11 && (this.field9391[var12][var14] & 0x2) == 0) {
                    return true;
                }
                if (var12 - arg1 == var9 && var11 <= var10 && var10 <= var14 && (this.field9391[var13][var10] & 0x8) == 0) {
                    return true;
                }
                if (var12 + 1 == var9 && var11 <= var10 && var10 <= var14 && (this.field9391[var9][var10] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIB)V")
    private final void method3708(int arg0, int arg1, int arg2, byte arg3) {
        this.field9391[arg2][arg1] = class220.method1393(this.field9391[arg2][arg1], arg0);
        if (arg3 != -90) {
            this.method3713(79, -29, -70);
        }
        field9390++;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIZIIZI)V")
    public final void method3709(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, boolean arg6, int arg7) {
        field9378++;
        int var9 = 256;
        if (arg6) {
            var9 |= 0x20000;
        }
        int var10 = arg1 - this.field9388;
        int var11 = arg5 - this.field9385;
        if (arg7 == 1 || arg7 == 3) {
            int var12 = arg0;
            arg0 = arg2;
            arg2 = var12;
        }
        if (arg3) {
            var9 |= 0x40000000;
        }
        if (arg4 > -4) {
            return;
        }
        for (int var13 = var11; var13 < arg0 + var11; var13++) {
            if (var13 >= 0 && var13 < this.field9380) {
                for (int var14 = var10; var14 < (arg2 + var10); var14++) {
                    if (var14 >= 0 && var14 < this.field9398) {
                        this.method3712(-2097153, var13, var14, var9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZZIIIII)V")
    public final void method3710(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 >= -70) {
            this.field9398 = 91;
        }
        int var8 = arg3 - this.field9385;
        field9399++;
        int var9 = arg4 - this.field9388;
        if (arg5 == 0) {
            if (arg6 == 0) {
                this.method3708(128, var9, var8, (byte) -90);
                this.method3708(8, var9, var8 - 1, (byte) -90);
            }
            if (arg6 == 1) {
                this.method3708(2, var9, var8, (byte) -90);
                this.method3708(32, var9 + 1, var8, (byte) -90);
            }
            if (arg6 == 2) {
                this.method3708(8, var9, var8, (byte) -90);
                this.method3708(128, var9, var8 + 1, (byte) -90);
            }
            if (arg6 == 3) {
                this.method3708(32, var9, var8, (byte) -90);
                this.method3708(2, var9 - 1, var8, (byte) -90);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg6 == 0) {
                this.method3708(1, var9, var8, (byte) -90);
                this.method3708(16, var9 + 1, var8 + -1, (byte) -90);
            }
            if (arg6 == 1) {
                this.method3708(4, var9, var8, (byte) -90);
                this.method3708(64, var9 + 1, var8 - -1, (byte) -90);
            }
            if (arg6 == 2) {
                this.method3708(16, var9, var8, (byte) -90);
                this.method3708(1, var9 - 1, var8 - -1, (byte) -90);
            }
            if (arg6 == 3) {
                this.method3708(64, var9, var8, (byte) -90);
                this.method3708(4, var9 - 1, var8 + -1, (byte) -90);
            }
        }
        if (arg5 == 2) {
            if (arg6 == 0) {
                this.method3708(130, var9, var8, (byte) -90);
                this.method3708(8, var9, var8 - 1, (byte) -90);
                this.method3708(32, var9 + 1, var8, (byte) -90);
            }
            if (arg6 == 1) {
                this.method3708(10, var9, var8, (byte) -90);
                this.method3708(32, var9 + 1, var8, (byte) -90);
                this.method3708(128, var9, var8 + 1, (byte) -90);
            }
            if (arg6 == 2) {
                this.method3708(40, var9, var8, (byte) -90);
                this.method3708(128, var9, var8 + 1, (byte) -90);
                this.method3708(2, var9 - 1, var8, (byte) -90);
            }
            if (arg6 == 3) {
                this.method3708(160, var9, var8, (byte) -90);
                this.method3708(2, var9 - 1, var8, (byte) -90);
                this.method3708(8, var9, var8 - 1, (byte) -90);
            }
        }
        if (arg0) {
            if (arg5 == 0) {
                if (arg6 == 0) {
                    this.method3708(65536, var9, var8, (byte) -90);
                    this.method3708(4096, var9, var8 - 1, (byte) -90);
                }
                if (arg6 == 1) {
                    this.method3708(1024, var9, var8, (byte) -90);
                    this.method3708(16384, var9 + 1, var8, (byte) -90);
                }
                if (arg6 == 2) {
                    this.method3708(4096, var9, var8, (byte) -90);
                    this.method3708(65536, var9, var8 + 1, (byte) -90);
                }
                if (arg6 == 3) {
                    this.method3708(16384, var9, var8, (byte) -90);
                    this.method3708(1024, var9 - 1, var8, (byte) -90);
                }
            }
            if (arg5 == 1 || arg5 == 3) {
                if (arg6 == 0) {
                    this.method3708(512, var9, var8, (byte) -90);
                    this.method3708(8192, var9 + 1, var8 - 1, (byte) -90);
                }
                if (arg6 == 1) {
                    this.method3708(2048, var9, var8, (byte) -90);
                    this.method3708(32768, var9 + 1, var8 + 1, (byte) -90);
                }
                if (arg6 == 2) {
                    this.method3708(8192, var9, var8, (byte) -90);
                    this.method3708(512, var9 - 1, var8 - -1, (byte) -90);
                }
                if (arg6 == 3) {
                    this.method3708(32768, var9, var8, (byte) -90);
                    this.method3708(2048, var9 - 1, var8 + -1, (byte) -90);
                }
            }
            if (arg5 == 2) {
                if (arg6 == 0) {
                    this.method3708(66560, var9, var8, (byte) -90);
                    this.method3708(4096, var9, var8 - 1, (byte) -90);
                    this.method3708(16384, var9 + 1, var8, (byte) -90);
                }
                if (arg6 == 1) {
                    this.method3708(5120, var9, var8, (byte) -90);
                    this.method3708(16384, var9 + 1, var8, (byte) -90);
                    this.method3708(65536, var9, var8 + 1, (byte) -90);
                }
                if (arg6 == 2) {
                    this.method3708(20480, var9, var8, (byte) -90);
                    this.method3708(65536, var9, var8 + 1, (byte) -90);
                    this.method3708(1024, var9 - 1, var8, (byte) -90);
                }
                if (arg6 == 3) {
                    this.method3708(81920, var9, var8, (byte) -90);
                    this.method3708(1024, var9 - 1, var8, (byte) -90);
                    this.method3708(4096, var9, var8 - 1, (byte) -90);
                }
            }
        }
        if (!arg1) {
            return;
        }
        if (arg5 == 0) {
            if (arg6 == 0) {
                this.method3708(536870912, var9, var8, (byte) -90);
                this.method3708(33554432, var9, var8 - 1, (byte) -90);
            }
            if (arg6 == 1) {
                this.method3708(8388608, var9, var8, (byte) -90);
                this.method3708(134217728, var9 + 1, var8, (byte) -90);
            }
            if (arg6 == 2) {
                this.method3708(33554432, var9, var8, (byte) -90);
                this.method3708(536870912, var9, var8 + 1, (byte) -90);
            }
            if (arg6 == 3) {
                this.method3708(134217728, var9, var8, (byte) -90);
                this.method3708(8388608, var9 - 1, var8, (byte) -90);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg6 == 0) {
                this.method3708(4194304, var9, var8, (byte) -90);
                this.method3708(67108864, var9 + 1, var8 + -1, (byte) -90);
            }
            if (arg6 == 1) {
                this.method3708(16777216, var9, var8, (byte) -90);
                this.method3708(268435456, var9 + 1, var8 + 1, (byte) -90);
            }
            if (arg6 == 2) {
                this.method3708(67108864, var9, var8, (byte) -90);
                this.method3708(4194304, var9 - 1, var8 + 1, (byte) -90);
            }
            if (arg6 == 3) {
                this.method3708(268435456, var9, var8, (byte) -90);
                this.method3708(16777216, var9 - 1, var8 + -1, (byte) -90);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg6 == 0) {
            this.method3708(545259520, var9, var8, (byte) -90);
            this.method3708(33554432, var9, var8 - 1, (byte) -90);
            this.method3708(134217728, var9 + 1, var8, (byte) -90);
        }
        if (arg6 == 1) {
            this.method3708(41943040, var9, var8, (byte) -90);
            this.method3708(134217728, var9 + 1, var8, (byte) -90);
            this.method3708(536870912, var9, var8 + 1, (byte) -90);
        }
        if (arg6 == 2) {
            this.method3708(167772160, var9, var8, (byte) -90);
            this.method3708(536870912, var9, var8 + 1, (byte) -90);
            this.method3708(8388608, var9 - 1, var8, (byte) -90);
        }
        if (arg6 == 3) {
            this.method3708(671088640, var9, var8, (byte) -90);
            this.method3708(8388608, var9 - 1, var8, (byte) -90);
            this.method3708(33554432, var9, var8 - 1, (byte) -90);
            return;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IZZIZII)V")
    public final void method3711(int arg0, boolean arg1, boolean arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field9383++;
        int var8 = arg5 - this.field9385;
        int var9 = arg6 - this.field9388;
        if (arg0 == 0) {
            if (arg3 == 0) {
                this.method3712(-2097153, var8, var9, 128);
                this.method3712(-2097153, var8 - 1, var9, 8);
            }
            if (arg3 == 1) {
                this.method3712(-2097153, var8, var9, 2);
                this.method3712(-2097153, var8, var9 + 1, 32);
            }
            if (arg3 == 2) {
                this.method3712(-2097153, var8, var9, 8);
                this.method3712(-2097153, var8 + 1, var9, 128);
            }
            if (arg3 == 3) {
                this.method3712(-2097153, var8, var9, 32);
                this.method3712(-2097153, var8, var9 - 1, 2);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg3 == 0) {
                this.method3712(-2097153, var8, var9, 1);
                this.method3712(-2097153, var8 - 1, var9 + 1, 16);
            }
            if (arg3 == 1) {
                this.method3712(-2097153, var8, var9, 4);
                this.method3712(-2097153, var8 + 1, var9 + 1, 64);
            }
            if (arg3 == 2) {
                this.method3712(-2097153, var8, var9, 16);
                this.method3712(-2097153, var8 + 1, var9 - 1, 1);
            }
            if (arg3 == 3) {
                this.method3712(-2097153, var8, var9, 64);
                this.method3712(-2097153, var8 - 1, var9 + -1, 4);
            }
        }
        if (arg0 == 2) {
            if (arg3 == 0) {
                this.method3712(-2097153, var8, var9, 130);
                this.method3712(-2097153, var8 - 1, var9, 8);
                this.method3712(-2097153, var8, var9 + 1, 32);
            }
            if (arg3 == 1) {
                this.method3712(-2097153, var8, var9, 10);
                this.method3712(-2097153, var8, var9 + 1, 32);
                this.method3712(-2097153, var8 + 1, var9, 128);
            }
            if (arg3 == 2) {
                this.method3712(-2097153, var8, var9, 40);
                this.method3712(-2097153, var8 + 1, var9, 128);
                this.method3712(-2097153, var8, var9 - 1, 2);
            }
            if (arg3 == 3) {
                this.method3712(-2097153, var8, var9, 160);
                this.method3712(-2097153, var8, var9 - 1, 2);
                this.method3712(-2097153, var8 - 1, var9, 8);
            }
        }
        if (arg4) {
            if (arg0 == 0) {
                if (arg3 == 0) {
                    this.method3712(-2097153, var8, var9, 65536);
                    this.method3712(-2097153, var8 - 1, var9, 4096);
                }
                if (arg3 == 1) {
                    this.method3712(-2097153, var8, var9, 1024);
                    this.method3712(-2097153, var8, var9 + 1, 16384);
                }
                if (arg3 == 2) {
                    this.method3712(-2097153, var8, var9, 4096);
                    this.method3712(-2097153, var8 + 1, var9, 65536);
                }
                if (arg3 == 3) {
                    this.method3712(-2097153, var8, var9, 16384);
                    this.method3712(-2097153, var8, var9 - 1, 1024);
                }
            }
            if (arg0 == 1 || arg0 == 3) {
                if (arg3 == 0) {
                    this.method3712(-2097153, var8, var9, 512);
                    this.method3712(-2097153, var8 - 1, var9 - -1, 8192);
                }
                if (arg3 == 1) {
                    this.method3712(-2097153, var8, var9, 2048);
                    this.method3712(-2097153, var8 + 1, var9 + 1, 32768);
                }
                if (arg3 == 2) {
                    this.method3712(-2097153, var8, var9, 8192);
                    this.method3712(-2097153, var8 + 1, var9 + -1, 512);
                }
                if (arg3 == 3) {
                    this.method3712(-2097153, var8, var9, 32768);
                    this.method3712(-2097153, var8 - 1, var9 + -1, 2048);
                }
            }
            if (arg0 == 2) {
                if (arg3 == 0) {
                    this.method3712(-2097153, var8, var9, 66560);
                    this.method3712(-2097153, var8 - 1, var9, 4096);
                    this.method3712(-2097153, var8, var9 + 1, 16384);
                }
                if (arg3 == 1) {
                    this.method3712(-2097153, var8, var9, 5120);
                    this.method3712(-2097153, var8, var9 + 1, 16384);
                    this.method3712(-2097153, var8 + 1, var9, 65536);
                }
                if (arg3 == 2) {
                    this.method3712(-2097153, var8, var9, 20480);
                    this.method3712(-2097153, var8 + 1, var9, 65536);
                    this.method3712(-2097153, var8, var9 - 1, 1024);
                }
                if (arg3 == 3) {
                    this.method3712(-2097153, var8, var9, 81920);
                    this.method3712(-2097153, var8, var9 - 1, 1024);
                    this.method3712(-2097153, var8 - 1, var9, 4096);
                }
            }
        }
        if (arg2) {
            field9394 = null;
        }
        if (!arg1) {
            return;
        }
        if (arg0 == 0) {
            if (arg3 == 0) {
                this.method3712(-2097153, var8, var9, 536870912);
                this.method3712(-2097153, var8 - 1, var9, 33554432);
            }
            if (arg3 == 1) {
                this.method3712(-2097153, var8, var9, 8388608);
                this.method3712(-2097153, var8, var9 + 1, 134217728);
            }
            if (arg3 == 2) {
                this.method3712(-2097153, var8, var9, 33554432);
                this.method3712(-2097153, var8 + 1, var9, 536870912);
            }
            if (arg3 == 3) {
                this.method3712(-2097153, var8, var9, 134217728);
                this.method3712(-2097153, var8, var9 - 1, 8388608);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg3 == 0) {
                this.method3712(-2097153, var8, var9, 4194304);
                this.method3712(-2097153, var8 - 1, var9 + 1, 67108864);
            }
            if (arg3 == 1) {
                this.method3712(-2097153, var8, var9, 16777216);
                this.method3712(-2097153, var8 + 1, var9 + 1, 268435456);
            }
            if (arg3 == 2) {
                this.method3712(-2097153, var8, var9, 67108864);
                this.method3712(-2097153, var8 + 1, var9 - 1, 4194304);
            }
            if (arg3 == 3) {
                this.method3712(-2097153, var8, var9, 268435456);
                this.method3712(-2097153, var8 - 1, var9 + -1, 16777216);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method3712(-2097153, var8, var9, 545259520);
            this.method3712(-2097153, var8 - 1, var9, 33554432);
            this.method3712(-2097153, var8, var9 + 1, 134217728);
        }
        if (arg3 == 1) {
            this.method3712(-2097153, var8, var9, 41943040);
            this.method3712(-2097153, var8, var9 + 1, 134217728);
            this.method3712(-2097153, var8 + 1, var9, 536870912);
        }
        if (arg3 == 2) {
            this.method3712(-2097153, var8, var9, 167772160);
            this.method3712(-2097153, var8 + 1, var9, 536870912);
            this.method3712(-2097153, var8, var9 - 1, 8388608);
        }
        if (arg3 == 3) {
            this.method3712(-2097153, var8, var9, 671088640);
            this.method3712(-2097153, var8, var9 - 1, 8388608);
            this.method3712(-2097153, var8 - 1, var9, 33554432);
            return;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIII)V")
    private final void method3712(int arg0, int arg1, int arg2, int arg3) {
        field9376++;
        if (arg0 == -2097153) {
            this.field9391[arg1][arg2] = class571.method3139(this.field9391[arg1][arg2], ~arg3);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(III)V")
    public final void method3713(int arg0, int arg1, int arg2) {
        field9381++;
        int var4 = arg2 - this.field9388;
        int var5 = arg0 - this.field9385;
        this.field9391[var5][var4] = class220.method1393(this.field9391[var5][var4], arg1);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IBI)V")
    public final void method3714(int arg0, byte arg1, int arg2) {
        int var4 = arg0 - this.field9388;
        field9393++;
        int var5 = arg2 - this.field9385;
        if (arg1 >= 53) {
            this.field9391[var5][var4] = class571.method3139(this.field9391[var5][var4], -2097153);
        }
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(B)I")
    public static final int method3715(byte arg0) {
        field9387++;
        if (arg0 != 58) {
            method3718(98);
        }
        return 16;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIIIIIII)Z")
    public final boolean method3716(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field9397++;
        int var11 = arg0 + arg5;
        int var12 = arg2 + arg8;
        int var13 = arg1 + arg9;
        if (arg3 != 2) {
            this.field9380 = 76;
        }
        int var14 = arg4 + arg6;
        if (arg5 == var13 && (arg7 & 0x2) == 0) {
            int var15 = arg4 >= arg8 ? arg4 : arg8;
            int var16 = var12 >= var14 ? var14 : var12;
            while (var16 > var15) {
                if ((this.field9391[var13 - this.field9385 - 1][var15 - this.field9388] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg9 == var11 && (arg7 & 0x8) == 0) {
            int var17 = arg8 <= arg4 ? arg4 : arg8;
            int var18 = var12 < var14 ? var12 : var14;
            while (var18 > var17) {
                if ((this.field9391[arg9 - this.field9385][var17 - this.field9388] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg8 == var14 && (arg7 & 0x1) == 0) {
            int var19 = arg9 < arg5 ? arg5 : arg9;
            int var20 = var11 < var13 ? var11 : var13;
            while (var20 > var19) {
                if ((this.field9391[var19 - this.field9385][var14 - this.field9388 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg4 == var12 && (arg7 & 0x4) == 0) {
            int var21 = arg5 <= arg9 ? arg9 : arg5;
            int var22 = var11 < var13 ? var11 : var13;
            while (var22 > var21) {
                if ((this.field9391[var21 - this.field9385][arg4 - this.field9388] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(III)V")
    public final void method3717(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field9385;
        int var5 = arg2 - this.field9388;
        field9377++;
        this.field9391[var4][var5] = class220.method1393(this.field9391[var4][var5], arg0);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
    public static void method3718(int arg0) {
        field9384 = null;
        if (arg0 != 1) {
            field9384 = null;
        }
        field9394 = null;
    }
}
