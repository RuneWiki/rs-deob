import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class158 {

    @OriginalMember(owner = "client!c", name = "o", descriptor = "F")
    public static float field2417;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "I")
    public static int field2407;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "I")
    public int field2408;

    @OriginalMember(owner = "client!c", name = "g", descriptor = "I")
    public static int field2409;

    @OriginalMember(owner = "client!c", name = "h", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!c", name = "i", descriptor = "I")
    public int field2411;

    @OriginalMember(owner = "client!c", name = "j", descriptor = "I")
    public static int field2412;

    @OriginalMember(owner = "client!c", name = "k", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!c", name = "l", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!c", name = "m", descriptor = "I")
    public static int field2415;

    @OriginalMember(owner = "client!c", name = "n", descriptor = "I")
    public static int field2416;

    @OriginalMember(owner = "client!c", name = "p", descriptor = "I")
    public static int field2418;

    @OriginalMember(owner = "client!c", name = "q", descriptor = "I")
    public static int field2419;

    @OriginalMember(owner = "client!c", name = "r", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!c", name = "s", descriptor = "I")
    public static int field2421;

    @OriginalMember(owner = "client!c", name = "u", descriptor = "I")
    public int field2423;

    @OriginalMember(owner = "client!c", name = "v", descriptor = "I")
    public int field2424;

    @OriginalMember(owner = "client!c", name = "w", descriptor = "I")
    public static int field2425;

    @OriginalMember(owner = "client!c", name = "x", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!c", name = "y", descriptor = "I")
    public static int field2427;

    @OriginalMember(owner = "client!c", name = "t", descriptor = "Ldp;")
    public static class174 field2422;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "[[I")
    public int[][] field2405;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIII)V", line = 5)
    private final void method1237(int arg0, int arg1, int arg2, int arg3) {
        field2406++;
        int var5 = 110 % ((-arg3 - 70) / 34);
        this.field2405[arg2][arg1] = class439.method2744(this.field2405[arg2][arg1], arg0);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IBIIIIIII)Z", line = 17)
    public final boolean method1238(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg1 != -19) {
            this.field2411 = 94;
        }
        field2409++;
        if (arg5 > 1) {
            return class372.method2372(arg2, arg8, arg6, arg5, -7247, arg7, arg4, arg5, arg0) ? true : this.method1244(119, arg0, arg4, arg7, arg5, arg6, arg3, arg5, arg8, arg2);
        }
        int var10 = arg2 + arg6 - 1;
        int var11 = arg4 + arg8 - 1;
        if (arg0 >= arg2 && var10 >= arg0 && arg7 >= arg8 && var11 >= arg7) {
            return true;
        } else if (arg2 - 1 == arg0 && arg7 >= arg8 && arg7 <= var11 && (this.field2405[arg0 - this.field2424][arg7 - this.field2411] & 0x8) == 0 && (arg3 & 0x8) == 0) {
            return true;
        } else if (var10 + 1 == arg0 && arg8 <= arg7 && var11 >= arg7 && (this.field2405[arg0 - this.field2424][arg7 - this.field2411] & 0x80) == 0 && (arg3 & 0x2) == 0) {
            return true;
        } else if ((arg8 - 1) == arg7 && arg0 >= arg2 && var10 >= arg0 && (this.field2405[arg0 - this.field2424][arg7 - this.field2411] & 0x2) == 0 && (arg3 & 0x4) == 0) {
            return true;
        } else {
            return (var11 + 1) == arg7 && arg2 <= arg0 && arg0 <= var10 && (this.field2405[arg0 - this.field2424][arg7 - this.field2411] & 0x20) == 0 && (arg3 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(BLec;)Lnj;", line = 62)
    public static final class228 method1239(byte arg0, class37 arg1) {
        field2415++;
        int var2 = 69 / ((arg0 - 47) / 62);
        return new class228(arg1.method321((byte) 117), arg1.method321((byte) 111), arg1.method321((byte) 116), arg1.method321((byte) 122), arg1.method295(true), arg1.method271((byte) 127));
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIZ)V", line = 73)
    public final void method1240(int arg0, int arg1, boolean arg2) {
        int var4 = arg1 - this.field2411;
        int var5 = arg0 - this.field2424;
        field2412++;
        if (arg2) {
            this.method1241(true, -127, -67);
        }
        this.field2405[var5][var4] = class439.method2744(this.field2405[var5][var4], 2097152);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ZII)V", line = 87)
    public final void method1241(boolean arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field2411;
        int var5 = arg1 - this.field2424;
        if (arg0) {
            this.method1240(25, 4, false);
        }
        field2418++;
        this.field2405[var5][var4] = class439.method2744(this.field2405[var5][var4], 262144);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIBIII)Z", line = 100)
    public final boolean method1242(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        field2426++;
        if (arg3 == 1) {
            if (arg0 == arg6 && arg1 == arg2) {
                return true;
            }
        } else if (arg0 <= arg6 && (arg0 - (1 - arg3)) >= arg6 && arg1 <= arg1 && arg1 <= (arg1 + arg3 - 1)) {
            return true;
        }
        int var9 = -5 % ((60 - arg4) / 38);
        int var10 = arg0 - this.field2424;
        int var11 = arg6 - this.field2424;
        int var12 = arg1 - this.field2411;
        int var13 = arg2 - this.field2411;
        if (arg3 == 1) {
            if (arg7 == 0) {
                if (arg5 == 0) {
                    if (var11 - 1 == var10 && var12 == var13) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var13 && (this.field2405[var10][var13] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 - 1) == var13 && (this.field2405[var10][var13] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var10 == var11 && var12 + 1 == var13) {
                        return true;
                    }
                    if ((var11 - 1) == var10 && var12 == var13 && (this.field2405[var10][var13] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var12 == var13 && (this.field2405[var10][var13] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if ((var11 + 1) == var10 && var12 == var13) {
                        return true;
                    }
                    if (var10 == var11 && var12 + 1 == var13 && (this.field2405[var10][var13] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var13 && (this.field2405[var10][var13] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var10 == var11 && var12 - 1 == var13) {
                        return true;
                    }
                    if ((var11 - 1) == var10 && var12 == var13 && (this.field2405[var10][var13] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var12 == var13 && (this.field2405[var10][var13] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg7 == 2) {
                if (arg5 == 0) {
                    if (var11 - 1 == var10 && var12 == var13) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var13) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var12 == var13 && (this.field2405[var10][var13] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var13 && (this.field2405[var10][var13] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if ((var11 - 1) == var10 && var12 == var13 && (this.field2405[var10][var13] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 + 1 == var13) {
                        return true;
                    }
                    if ((var11 + 1) == var10 && var12 == var13) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var13 && (this.field2405[var10][var13] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if (var11 - 1 == var10 && var12 == var13 && (this.field2405[var10][var13] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var13 && (this.field2405[var10][var13] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var12 == var13) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var13) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if ((var11 - 1) == var10 && var12 == var13) {
                        return true;
                    }
                    if (var10 == var11 && var12 + 1 == var13 && (this.field2405[var10][var13] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var10 && var12 == var13 && (this.field2405[var10][var13] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var13) {
                        return true;
                    }
                }
            }
            if (arg7 == 9) {
                if (var10 == var11 && (var12 + 1) == var13 && (this.field2405[var10][var13] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var11 && var12 - 1 == var13 && (this.field2405[var10][var13] & 0x2) == 0) {
                    return true;
                }
                if (var11 - 1 == var10 && var12 == var13 && (this.field2405[var10][var13] & 0x8) == 0) {
                    return true;
                }
                if (var11 + 1 == var10 && var12 == var13 && (this.field2405[var10][var13] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var14 = var10 + arg3 - 1;
            int var15 = var13 + arg3 - 1;
            if (arg7 == 0) {
                if (arg5 == 0) {
                    if ((var11 - arg3) == var10 && var13 <= var12 && var15 >= var12) {
                        return true;
                    }
                    if (var11 >= var10 && var11 <= var14 && (var12 + 1) == var13 && (this.field2405[var11][var13] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 >= var10 && var11 <= var14 && var12 - arg3 == var13 && (this.field2405[var11][var15] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var10 <= var11 && var14 >= var11 && (var12 + 1) == var13) {
                        return true;
                    }
                    if (var11 - arg3 == var10 && var13 <= var12 && var15 >= var12 && (this.field2405[var14][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var10 && var13 <= var12 && var15 >= var12 && (this.field2405[var10][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if ((var11 + 1) == var10 && var12 >= var13 && var15 >= var12) {
                        return true;
                    }
                    if (var11 >= var10 && var11 <= var14 && var12 + 1 == var13 && (this.field2405[var11][var13] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 >= var10 && var14 >= var11 && (var12 - arg3) == var13 && (this.field2405[var11][var15] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var11 >= var10 && var11 <= var14 && var12 - arg3 == var13) {
                        return true;
                    }
                    if (var11 - arg3 == var10 && var12 >= var13 && var12 <= var15 && (this.field2405[var14][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var13 <= var12 && var15 >= var12 && (this.field2405[var10][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg7 == 2) {
                if (arg5 == 0) {
                    if (var11 - arg3 == var10 && var13 <= var12 && var15 >= var12) {
                        return true;
                    }
                    if (var11 >= var10 && var11 <= var14 && (var12 + 1) == var13) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var12 >= var13 && var12 <= var15 && (this.field2405[var10][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 <= var11 && var14 >= var11 && var12 - arg3 == var13 && (this.field2405[var11][var15] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if ((var11 - arg3) == var10 && var13 <= var12 && var15 >= var12 && (this.field2405[var14][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 >= var10 && var11 <= var14 && var12 + 1 == var13) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var12 >= var13 && var12 <= var15) {
                        return true;
                    }
                    if (var10 <= var11 && var11 <= var14 && var12 - arg3 == var13 && (this.field2405[var11][var15] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if (var11 - arg3 == var10 && var12 >= var13 && var12 <= var15 && (this.field2405[var14][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 >= var10 && var11 <= var14 && var12 + 1 == var13 && (this.field2405[var11][var13] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var12 >= var13 && var12 <= var15) {
                        return true;
                    }
                    if (var11 >= var10 && var11 <= var14 && var12 - arg3 == var13) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if ((var11 - arg3) == var10 && var13 <= var12 && var15 >= var12) {
                        return true;
                    }
                    if (var10 <= var11 && var11 <= var14 && (var12 + 1) == var13 && (this.field2405[var11][var13] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var12 >= var13 && var12 <= var15 && (this.field2405[var10][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 <= var11 && var14 >= var11 && var12 - arg3 == var13) {
                        return true;
                    }
                }
            }
            if (arg7 == 9) {
                if (var11 >= var10 && var11 <= var14 && var12 + 1 == var13 && (this.field2405[var11][var13] & 0x2C0120) == 0) {
                    return true;
                }
                if (var10 <= var11 && var11 <= var14 && var12 - arg3 == var13 && (this.field2405[var11][var15] & 0x2C0102) == 0) {
                    return true;
                }
                if ((var11 - arg3) == var10 && var12 >= var13 && var15 >= var12 && (this.field2405[var14][var12] & 0x2C0108) == 0) {
                    return true;
                }
                if (var11 + 1 == var10 && var13 <= var12 && var15 >= var12 && (this.field2405[var10][var12] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(III)V", line = 490)
    public final void method1243(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field2424;
        int var5 = arg2 - this.field2411;
        field2427++;
        this.field2405[var4][var5] = class35.method254(this.field2405[var4][var5], -262145);
        if (arg1 > -121) {
            this.method1252(-99, true, -123, 59, -121, 67, false);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIIIIII)Z", line = 504)
    public final boolean method1244(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2403++;
        if (arg0 < 62) {
            this.method1245(26, 79, (byte) 69, -51);
        }
        int var11 = arg1 + arg7;
        int var12 = arg3 + arg4;
        int var13 = arg9 + arg5;
        int var14 = arg2 + arg8;
        if (arg1 == var13 && (arg6 & 0x2) == 0) {
            int var15 = arg8 < arg3 ? arg3 : arg8;
            int var16 = var14 > var12 ? var12 : var14;
            while (var15 < var16) {
                if ((this.field2405[var13 - this.field2424 - 1][var15 - this.field2411] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg9 == var11 && (arg6 & 0x8) == 0) {
            int var17 = arg3 <= arg8 ? arg8 : arg3;
            int var18 = var12 < var14 ? var12 : var14;
            while (var18 > var17) {
                if ((this.field2405[arg9 - this.field2424][var17 - this.field2411] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg3 == var14 && (arg6 & 0x1) == 0) {
            int var19 = arg1 <= arg9 ? arg9 : arg1;
            int var20 = var13 <= var11 ? var13 : var11;
            while (var19 < var20) {
                if ((this.field2405[var19 - this.field2424][var14 - this.field2411 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg8 == var12 && (arg6 & 0x4) == 0) {
            int var21 = arg9 < arg1 ? arg1 : arg9;
            int var22 = var13 > var11 ? var11 : var13;
            while (var22 > var21) {
                if ((this.field2405[var21 - this.field2424][arg8 - this.field2411] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIBI)V", line = 604)
    private final void method1245(int arg0, int arg1, byte arg2, int arg3) {
        this.field2405[arg3][arg1] = class35.method254(this.field2405[arg3][arg1], ~arg0);
        field2425++;
        int var5 = -22 % ((arg2 - 50) / 56);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIZIIZI)V", line = 614)
    public final void method1246(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, boolean arg6, int arg7) {
        field2413++;
        int var9 = 256;
        if (arg3) {
            var9 |= 0x20000;
        }
        int var10 = arg0 - this.field2411;
        if (arg2 == 1 || arg2 == 3) {
            int var11 = arg5;
            arg5 = arg4;
            arg4 = var11;
        }
        int var12 = arg1 - this.field2424;
        if (arg6) {
            var9 |= 0x40000000;
        }
        int var13 = var12;
        if (arg7 <= 80) {
            method1239((byte) 101, (class37) null);
        }
        while (var13 < (arg5 + var12)) {
            if (var13 >= 0 && var13 < this.field2408) {
                for (int var14 = var10; var14 < (arg4 + var10); var14++) {
                    if (var14 >= 0 && this.field2423 > var14) {
                        this.method1245(var9, var14, (byte) 120, var13);
                    }
                }
            }
            var13++;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V", line = 668)
    public static void method1247(int arg0) {
        if (arg0 != -4) {
            field2417 = -0.15995607F;
        }
        field2422 = null;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(III)V", line = 679)
    public final void method1248(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field2424;
        if (arg1 == 1) {
            field2421++;
            int var5 = arg0 - this.field2411;
            this.field2405[var4][var5] = class35.method254(this.field2405[var4][var5], -2097153);
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(I)V", line = 695)
    public final void method1249(int arg0) {
        field2407++;
        for (int var2 = 0; var2 < this.field2408; var2++) {
            for (int var4 = 0; var4 < this.field2423; var4++) {
                if (var2 == 0 || var4 == 0 || (this.field2408 - 5) <= var2 || this.field2423 - 5 <= var4) {
                    this.field2405[var2][var4] = -1;
                } else {
                    this.field2405[var2][var4] = 2097152;
                }
            }
        }
        int var3 = 20 % ((-arg0 - 65) / 53);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ZIZIIIZ)V", line = 725)
    public final void method1250(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, boolean arg6) {
        int var8 = arg5 - this.field2411;
        field2410++;
        int var9 = arg1 - this.field2424;
        if (arg4 == 0) {
            if (arg3 == 0) {
                this.method1237(128, var8, var9, -125);
                this.method1237(8, var8, var9 - 1, -126);
            }
            if (arg3 == 1) {
                this.method1237(2, var8, var9, -116);
                this.method1237(32, var8 + 1, var9, 103);
            }
            if (arg3 == 2) {
                this.method1237(8, var8, var9, -105);
                this.method1237(128, var8, var9 + 1, -120);
            }
            if (arg3 == 3) {
                this.method1237(32, var8, var9, -122);
                this.method1237(2, var8 - 1, var9, -105);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg3 == 0) {
                this.method1237(1, var8, var9, 40);
                this.method1237(16, var8 + 1, var9 + -1, 53);
            }
            if (arg3 == 1) {
                this.method1237(4, var8, var9, -106);
                this.method1237(64, var8 + 1, var9 + 1, -123);
            }
            if (arg3 == 2) {
                this.method1237(16, var8, var9, -34);
                this.method1237(1, var8 - 1, var9 + 1, 7);
            }
            if (arg3 == 3) {
                this.method1237(64, var8, var9, 95);
                this.method1237(4, var8 - 1, var9 + -1, -117);
            }
        }
        if (arg4 == 2) {
            if (arg3 == 0) {
                this.method1237(130, var8, var9, 116);
                this.method1237(8, var8, var9 - 1, 109);
                this.method1237(32, var8 + 1, var9, 112);
            }
            if (arg3 == 1) {
                this.method1237(10, var8, var9, 50);
                this.method1237(32, var8 + 1, var9, -126);
                this.method1237(128, var8, var9 + 1, -110);
            }
            if (arg3 == 2) {
                this.method1237(40, var8, var9, 122);
                this.method1237(128, var8, var9 + 1, -128);
                this.method1237(2, var8 - 1, var9, -22);
            }
            if (arg3 == 3) {
                this.method1237(160, var8, var9, 73);
                this.method1237(2, var8 - 1, var9, -34);
                this.method1237(8, var8, var9 - 1, 102);
            }
        }
        if (arg6) {
            if (arg4 == 0) {
                if (arg3 == 0) {
                    this.method1237(65536, var8, var9, -111);
                    this.method1237(4096, var8, var9 - 1, 63);
                }
                if (arg3 == 1) {
                    this.method1237(1024, var8, var9, -108);
                    this.method1237(16384, var8 + 1, var9, -104);
                }
                if (arg3 == 2) {
                    this.method1237(4096, var8, var9, -105);
                    this.method1237(65536, var8, var9 + 1, -117);
                }
                if (arg3 == 3) {
                    this.method1237(16384, var8, var9, -21);
                    this.method1237(1024, var8 - 1, var9, 77);
                }
            }
            if (arg4 == 1 || arg4 == 3) {
                if (arg3 == 0) {
                    this.method1237(512, var8, var9, 51);
                    this.method1237(8192, var8 + 1, var9 + -1, -31);
                }
                if (arg3 == 1) {
                    this.method1237(2048, var8, var9, 38);
                    this.method1237(32768, var8 + 1, var9 + 1, -125);
                }
                if (arg3 == 2) {
                    this.method1237(8192, var8, var9, 76);
                    this.method1237(512, var8 - 1, var9 + 1, -123);
                }
                if (arg3 == 3) {
                    this.method1237(32768, var8, var9, 84);
                    this.method1237(2048, var8 - 1, var9 + -1, -104);
                }
            }
            if (arg4 == 2) {
                if (arg3 == 0) {
                    this.method1237(66560, var8, var9, -107);
                    this.method1237(4096, var8, var9 - 1, -119);
                    this.method1237(16384, var8 + 1, var9, -120);
                }
                if (arg3 == 1) {
                    this.method1237(5120, var8, var9, 10);
                    this.method1237(16384, var8 + 1, var9, -108);
                    this.method1237(65536, var8, var9 + 1, 77);
                }
                if (arg3 == 2) {
                    this.method1237(20480, var8, var9, -107);
                    this.method1237(65536, var8, var9 + 1, 72);
                    this.method1237(1024, var8 - 1, var9, -122);
                }
                if (arg3 == 3) {
                    this.method1237(81920, var8, var9, -120);
                    this.method1237(1024, var8 - 1, var9, -108);
                    this.method1237(4096, var8, var9 - 1, -16);
                }
            }
        }
        if (!arg0) {
            this.field2405 = null;
        }
        if (!arg2) {
            return;
        }
        if (arg4 == 0) {
            if (arg3 == 0) {
                this.method1237(536870912, var8, var9, -124);
                this.method1237(33554432, var8, var9 - 1, -108);
            }
            if (arg3 == 1) {
                this.method1237(8388608, var8, var9, 102);
                this.method1237(134217728, var8 + 1, var9, -104);
            }
            if (arg3 == 2) {
                this.method1237(33554432, var8, var9, -12);
                this.method1237(536870912, var8, var9 + 1, -105);
            }
            if (arg3 == 3) {
                this.method1237(134217728, var8, var9, 40);
                this.method1237(8388608, var8 - 1, var9, -111);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg3 == 0) {
                this.method1237(4194304, var8, var9, -105);
                this.method1237(67108864, var8 + 1, var9 - 1, -104);
            }
            if (arg3 == 1) {
                this.method1237(16777216, var8, var9, 26);
                this.method1237(268435456, var8 + 1, var9 + 1, -109);
            }
            if (arg3 == 2) {
                this.method1237(67108864, var8, var9, -26);
                this.method1237(4194304, var8 - 1, var9 + 1, -122);
            }
            if (arg3 == 3) {
                this.method1237(268435456, var8, var9, -115);
                this.method1237(16777216, var8 - 1, var9 + -1, -106);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method1237(545259520, var8, var9, 108);
            this.method1237(33554432, var8, var9 - 1, 14);
            this.method1237(134217728, var8 + 1, var9, -34);
        }
        if (arg3 == 1) {
            this.method1237(41943040, var8, var9, -119);
            this.method1237(134217728, var8 + 1, var9, 68);
            this.method1237(536870912, var8, var9 + 1, -105);
        }
        if (arg3 == 2) {
            this.method1237(167772160, var8, var9, 82);
            this.method1237(536870912, var8, var9 + 1, 42);
            this.method1237(8388608, var8 - 1, var9, 121);
        }
        if (arg3 == 3) {
            this.method1237(671088640, var8, var9, 47);
            this.method1237(8388608, var8 - 1, var9, -123);
            this.method1237(33554432, var8, var9 - 1, 36);
            return;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIIII)Z", line = 1042)
    public final boolean method1251(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2414++;
        if (arg4 == 1) {
            if (arg3 == arg6 && arg0 == arg1) {
                return true;
            }
        } else if (arg3 >= arg6 && arg4 + arg6 - 1 >= arg3 && arg0 >= arg0 && arg0 <= arg0 + arg4 - 1) {
            return true;
        }
        int var9 = arg1 - this.field2411;
        if (arg2 != 2) {
            field2404 = -128;
        }
        int var10 = arg0 - this.field2411;
        int var11 = arg6 - this.field2424;
        int var12 = arg3 - this.field2424;
        if (arg4 == 1) {
            if (arg5 == 6 || arg5 == 7) {
                if (arg5 == 7) {
                    arg7 = arg7 + 2 & 0x3;
                }
                if (arg7 == 0) {
                    if (var12 + 1 == var11 && var9 == var10 && (this.field2405[var11][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var10 - 1 == var9 && (this.field2405[var11][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if ((var12 - 1) == var11 && var9 == var10 && (this.field2405[var11][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var10 - 1 == var9 && (this.field2405[var11][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if (var12 - 1 == var11 && var9 == var10 && (this.field2405[var11][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var10 + 1) == var9 && (this.field2405[var11][var9] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if ((var12 + 1) == var11 && var9 == var10 && (this.field2405[var11][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var10 + 1 == var9 && (this.field2405[var11][var9] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 8) {
                if (var11 == var12 && (var10 + 1) == var9 && (this.field2405[var11][var9] & 0x20) == 0) {
                    return true;
                }
                if (var11 == var12 && var10 - 1 == var9 && (this.field2405[var11][var9] & 0x2) == 0) {
                    return true;
                }
                if ((var12 - 1) == var11 && var9 == var10 && (this.field2405[var11][var9] & 0x8) == 0) {
                    return true;
                }
                if ((var12 + 1) == var11 && var9 == var10 && (this.field2405[var11][var9] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var11 + arg4 - 1;
            int var14 = var9 + arg4 - 1;
            if (arg5 == 6 || arg5 == 7) {
                if (arg5 == 7) {
                    arg7 = arg7 + 2 & 0x3;
                }
                if (arg7 == 0) {
                    if ((var12 + 1) == var11 && var9 <= var10 && var14 >= var10 && (this.field2405[var11][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 >= var11 && var13 >= var12 && var10 - arg4 == var9 && (this.field2405[var12][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if (var12 - arg4 == var11 && var9 <= var10 && var10 <= var14 && (this.field2405[var13][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 >= var11 && var13 >= var12 && var10 - arg4 == var9 && (this.field2405[var12][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if ((var12 - arg4) == var11 && var9 <= var10 && var14 >= var10 && (this.field2405[var13][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 <= var12 && var13 >= var12 && var10 + 1 == var9 && (this.field2405[var12][var9] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if ((var12 + 1) == var11 && var10 >= var9 && var10 <= var14 && (this.field2405[var11][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 <= var12 && var13 >= var12 && var10 + 1 == var9 && (this.field2405[var12][var9] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 8) {
                if (var12 >= var11 && var12 <= var13 && var10 + 1 == var9 && (this.field2405[var12][var9] & 0x20) == 0) {
                    return true;
                }
                if (var11 <= var12 && var13 >= var12 && var10 - arg4 == var9 && (this.field2405[var12][var14] & 0x2) == 0) {
                    return true;
                }
                if ((var12 - arg4) == var11 && var10 >= var9 && var10 <= var14 && (this.field2405[var13][var10] & 0x8) == 0) {
                    return true;
                }
                if ((var12 + 1) == var11 && var9 <= var10 && var10 <= var14 && (this.field2405[var11][var10] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IZIIIIZ)V", line = 1232)
    public final void method1252(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        int var8 = arg3 - this.field2424;
        int var9 = arg4 - this.field2411;
        field2420++;
        if (~arg5 == arg2) {
            if (arg0 == 0) {
                this.method1245(128, var9, (byte) -36, var8);
                this.method1245(8, var9, (byte) 110, var8 - 1);
            }
            if (arg0 == 1) {
                this.method1245(2, var9, (byte) 127, var8);
                this.method1245(32, var9 + 1, (byte) -93, var8);
            }
            if (arg0 == 2) {
                this.method1245(8, var9, (byte) 115, var8);
                this.method1245(128, var9, (byte) -84, var8 + 1);
            }
            if (arg0 == 3) {
                this.method1245(32, var9, (byte) 121, var8);
                this.method1245(2, var9 - 1, (byte) 108, var8);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg0 == 0) {
                this.method1245(1, var9, (byte) 106, var8);
                this.method1245(16, var9 + 1, (byte) -54, var8 - 1);
            }
            if (arg0 == 1) {
                this.method1245(4, var9, (byte) 124, var8);
                this.method1245(64, var9 + 1, (byte) -57, var8 + 1);
            }
            if (arg0 == 2) {
                this.method1245(16, var9, (byte) -121, var8);
                this.method1245(1, var9 - 1, (byte) -24, var8 + 1);
            }
            if (arg0 == 3) {
                this.method1245(64, var9, (byte) -117, var8);
                this.method1245(4, var9 - 1, (byte) -13, var8 - 1);
            }
        }
        if (arg5 == 2) {
            if (arg0 == 0) {
                this.method1245(130, var9, (byte) -60, var8);
                this.method1245(8, var9, (byte) 117, var8 - 1);
                this.method1245(32, var9 + 1, (byte) 109, var8);
            }
            if (arg0 == 1) {
                this.method1245(10, var9, (byte) 117, var8);
                this.method1245(32, var9 + 1, (byte) -110, var8);
                this.method1245(128, var9, (byte) -98, var8 + 1);
            }
            if (arg0 == 2) {
                this.method1245(40, var9, (byte) -114, var8);
                this.method1245(128, var9, (byte) 127, var8 + 1);
                this.method1245(2, var9 - 1, (byte) -75, var8);
            }
            if (arg0 == 3) {
                this.method1245(160, var9, (byte) -67, var8);
                this.method1245(2, var9 - 1, (byte) -72, var8);
                this.method1245(8, var9, (byte) 107, var8 - 1);
            }
        }
        if (arg6) {
            if (arg5 == 0) {
                if (arg0 == 0) {
                    this.method1245(65536, var9, (byte) 118, var8);
                    this.method1245(4096, var9, (byte) -39, var8 - 1);
                }
                if (arg0 == 1) {
                    this.method1245(1024, var9, (byte) -88, var8);
                    this.method1245(16384, var9 + 1, (byte) -42, var8);
                }
                if (arg0 == 2) {
                    this.method1245(4096, var9, (byte) -74, var8);
                    this.method1245(65536, var9, (byte) 115, var8 + 1);
                }
                if (arg0 == 3) {
                    this.method1245(16384, var9, (byte) -51, var8);
                    this.method1245(1024, var9 - 1, (byte) -28, var8);
                }
            }
            if (arg5 == 1 || arg5 == 3) {
                if (arg0 == 0) {
                    this.method1245(512, var9, (byte) -24, var8);
                    this.method1245(8192, var9 + 1, (byte) 125, var8 - 1);
                }
                if (arg0 == 1) {
                    this.method1245(2048, var9, (byte) -56, var8);
                    this.method1245(32768, var9 + 1, (byte) 115, var8 + 1);
                }
                if (arg0 == 2) {
                    this.method1245(8192, var9, (byte) -11, var8);
                    this.method1245(512, var9 - 1, (byte) -51, var8 + 1);
                }
                if (arg0 == 3) {
                    this.method1245(32768, var9, (byte) 117, var8);
                    this.method1245(2048, var9 - 1, (byte) 121, var8 - 1);
                }
            }
            if (arg5 == 2) {
                if (arg0 == 0) {
                    this.method1245(66560, var9, (byte) 122, var8);
                    this.method1245(4096, var9, (byte) -92, var8 - 1);
                    this.method1245(16384, var9 + 1, (byte) -42, var8);
                }
                if (arg0 == 1) {
                    this.method1245(5120, var9, (byte) 122, var8);
                    this.method1245(16384, var9 + 1, (byte) 109, var8);
                    this.method1245(65536, var9, (byte) 110, var8 + 1);
                }
                if (arg0 == 2) {
                    this.method1245(20480, var9, (byte) -51, var8);
                    this.method1245(65536, var9, (byte) 125, var8 + 1);
                    this.method1245(1024, var9 - 1, (byte) 114, var8);
                }
                if (arg0 == 3) {
                    this.method1245(81920, var9, (byte) -91, var8);
                    this.method1245(1024, var9 - 1, (byte) 121, var8);
                    this.method1245(4096, var9, (byte) -10, var8 - 1);
                }
            }
        }
        if (!arg1) {
            return;
        }
        if (arg5 == 0) {
            if (arg0 == 0) {
                this.method1245(536870912, var9, (byte) 110, var8);
                this.method1245(33554432, var9, (byte) -37, var8 - 1);
            }
            if (arg0 == 1) {
                this.method1245(8388608, var9, (byte) -51, var8);
                this.method1245(134217728, var9 + 1, (byte) 112, var8);
            }
            if (arg0 == 2) {
                this.method1245(33554432, var9, (byte) 126, var8);
                this.method1245(536870912, var9, (byte) -88, var8 + 1);
            }
            if (arg0 == 3) {
                this.method1245(134217728, var9, (byte) -72, var8);
                this.method1245(8388608, var9 - 1, (byte) -17, var8);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg0 == 0) {
                this.method1245(4194304, var9, (byte) -98, var8);
                this.method1245(67108864, var9 + 1, (byte) -78, var8 - 1);
            }
            if (arg0 == 1) {
                this.method1245(16777216, var9, (byte) 107, var8);
                this.method1245(268435456, var9 + 1, (byte) 110, var8 + 1);
            }
            if (arg0 == 2) {
                this.method1245(67108864, var9, (byte) -16, var8);
                this.method1245(4194304, var9 - 1, (byte) 122, var8 + 1);
            }
            if (arg0 == 3) {
                this.method1245(268435456, var9, (byte) 110, var8);
                this.method1245(16777216, var9 - 1, (byte) -61, var8 - 1);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method1245(545259520, var9, (byte) 118, var8);
            this.method1245(33554432, var9, (byte) 119, var8 - 1);
            this.method1245(134217728, var9 + 1, (byte) 112, var8);
        }
        if (arg0 == 1) {
            this.method1245(41943040, var9, (byte) -128, var8);
            this.method1245(134217728, var9 + 1, (byte) 121, var8);
            this.method1245(536870912, var9, (byte) -98, var8 + 1);
        }
        if (arg0 == 2) {
            this.method1245(167772160, var9, (byte) 114, var8);
            this.method1245(536870912, var9, (byte) -67, var8 + 1);
            this.method1245(8388608, var9 - 1, (byte) 106, var8);
        }
        if (arg0 == 3) {
            this.method1245(671088640, var9, (byte) -9, var8);
            this.method1245(8388608, var9 - 1, (byte) 113, var8);
            this.method1245(33554432, var9, (byte) 112, var8 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ZBIZIII)V", line = 1535)
    public final void method1253(boolean arg0, byte arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field2419++;
        int var8 = 256;
        if (arg3) {
            var8 |= 0x20000;
        }
        if (arg0) {
            var8 |= 0x40000000;
        }
        if (arg1 < 41) {
            method1254((byte[][]) null, 124, (byte[][]) null, (class126) null, (byte[][]) null, false, (byte[][]) null, -58, 56, (class126) null, 93, (int[][]) null, (class90) null);
        }
        int var9 = arg4 - this.field2424;
        int var10 = arg2 - this.field2411;
        for (int var11 = var9; var11 < (arg6 + var9); var11++) {
            if (var11 >= 0 && var11 < this.field2408) {
                for (int var12 = var10; var12 < (var10 + arg5); var12++) {
                    if (var12 >= 0 && this.field2423 > var12) {
                        this.method1237(var8, var12, var11, -128);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "([[BI[[BLnc;[[BZ[[BIILnc;I[[ILja;)V", line = 1582)
    public static final void method1254(byte[][] arg0, int arg1, byte[][] arg2, class126 arg3, byte[][] arg4, boolean arg5, byte[][] arg6, int arg7, int arg8, class126 arg9, int arg10, int[][] arg11, class90 arg12) {
        field2416++;
        if (arg10 != 1) {
            method1254((byte[][]) null, -58, (byte[][]) null, (class126) null, (byte[][]) null, false, (byte[][]) null, 99, 23, (class126) null, 113, (int[][]) null, (class90) null);
        }
        for (int var13 = 0; var13 < arg7; var13++) {
            for (int var14 = 0; var14 < arg8; var14++) {
                if (class122.method1034(24037) || class202.method1538(var13, var14, class140.field2216, 582, arg1)) {
                    byte var15 = arg0[var13][var14];
                    byte var16 = arg6[var13][var14];
                    int var17 = arg4[var13][var14] & 0xFF;
                    int var18 = arg2[var13][var14] & 0xFF;
                    class451 var19 = var17 == 0 ? null : class206.method1555(var17 - 1, 4);
                    class361 var20 = var18 == 0 ? null : class199.method1514(var18 - 1, (byte) -42);
                    int var21 = 0;
                    int var22 = 0;
                    if (var15 != 0) {
                        var21 = var20 == null ? 0 : class169.field2521[var15];
                        var22 = var19 == null ? 0 : class90.field1419[var15];
                    } else if (var19 != null) {
                        var22 = class90.field1419[var15];
                    } else if (var20 != null) {
                        var21 = class90.field1419[var15];
                    }
                    int var23 = var21 + var22;
                    int var24 = 0;
                    if (var23 != 0) {
                        int[] var25 = new int[var23];
                        int[] var26 = new int[var23];
                        int[] var27 = new int[var23];
                        int[] var28 = new int[var23];
                        boolean var29 = false;
                        if (var19 == null || var19.field6548 == -1 && var19.field6540 == -1 && var19.field6561 == -1) {
                            for (int var32 = 0; var32 < var22; var32++) {
                                var25[var24] = -1;
                                var24++;
                            }
                        } else {
                            int var30 = arg12.method707() ? var19.field6561 : var19.field6538;
                            if (!class280.field4196) {
                                var30 = -1;
                            }
                            for (int var31 = 0; var31 < var22; var31++) {
                                var27[var24] = var30;
                                var28[var24] = var19.field6541;
                                if (var19.field6548 == -1) {
                                    var25[var24] = -1;
                                } else {
                                    var25[var24] = var19.field6548;
                                }
                                if (var19.field6540 == -1) {
                                    var26[var24] = -1;
                                } else {
                                    var26[var24] = var19.field6540;
                                    var29 = true;
                                }
                                var24++;
                            }
                            if (!arg5 && arg1 == 0) {
                                class30.method232(var13, var14, var19.field6546, var19.field6554 * 8);
                            }
                        }
                        if (!var29) {
                            var26 = null;
                        }
                        if (var20 == null) {
                            for (int var33 = 0; var33 < var21; var33++) {
                                var25[var24] = -1;
                                var24++;
                            }
                        } else {
                            int var34 = var20.field5145;
                            if (!class280.field4196) {
                                var34 = -1;
                            }
                            for (int var35 = 0; var35 < var21; var35++) {
                                var27[var24] = var34;
                                var28[var24] = var20.field5156;
                                var25[var24] = arg11[var13][var14];
                                if (var26 != null) {
                                    var26[var24] = -1;
                                }
                                var24++;
                            }
                        }
                        int var36 = class291.field4329.length;
                        int[] var37 = arg5 ? new int[var36] : null;
                        int[] var38 = new int[var36];
                        int[] var39 = new int[var36];
                        for (int var40 = 0; var40 < var36; var40++) {
                            int var48 = class291.field4329[var40];
                            int var49 = class350.field4969[var40];
                            if (var16 == 0) {
                                var38[var40] = var48;
                                var39[var40] = var49;
                            } else if (var16 == 1) {
                                var38[var40] = var49;
                                var39[var40] = 128 - var48;
                            } else if (var16 == 2) {
                                var38[var40] = 128 - var48;
                                var39[var40] = 128 - var49;
                            } else if (var16 == 3) {
                                var38[var40] = 128 - var49;
                                var39[var40] = var48;
                            }
                            if (arg5 && class58.field915[var15][var40]) {
                                int var52 = (var13 << 7) + var38[var40];
                                int var53 = (var14 << 7) + var39[var40];
                                var37[var40] = arg9.method809(var52, var53) - arg3.method809(var52, var53);
                            }
                        }
                        int var41 = arg3.method794(var13, var14);
                        int var42 = arg3.method794(var13 + 1, var14);
                        int var43 = arg3.method794(var13 + 1, var14 + 1);
                        int var44 = arg3.method794(var13, var14 + 1);
                        if (arg1 > 0) {
                            boolean var45 = true;
                            if (var18 == 0 && var15 != 0) {
                                var45 = false;
                            }
                            if (var17 > 0 && var19 != null && !var19.field6545) {
                                var45 = false;
                            }
                            if (var45 && var41 == var42 && var41 == var43 && var41 == var44) {
                                class390.field5615[arg1][var13][var14] = (byte) class439.method2744(class390.field5615[arg1][var13][var14], 4);
                            }
                        }
                        int var46 = 0;
                        int var47 = 0;
                        if (arg5) {
                            var46 = class373.method2379(var13, var14);
                            var47 = class55.method436(var13, var14);
                        }
                        arg3.method799(var13, var14, var38, var37, var39, class270.field4064[var15], class45.field665[var15], class441.field6404[var15], var25, var26, var27, var28, var46, var47, false);
                        class253.method1833(arg1, var13, var14);
                    }
                }
            }
        }
    }
}
