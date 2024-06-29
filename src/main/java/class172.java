import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class172 {

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
    public static int field2549 = 0;

    @OriginalMember(owner = "client!pd", name = "t", descriptor = "[[I")
    public static int[][] field2568 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!pd", name = "v", descriptor = "[I")
    public static int[] field2570 = new int[13];

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
    public int field2550;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "I")
    public static int field2558;

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "I")
    public int field2559;

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!pd", name = "n", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!pd", name = "p", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!pd", name = "q", descriptor = "I")
    public int field2565;

    @OriginalMember(owner = "client!pd", name = "r", descriptor = "I")
    public static int field2566;

    @OriginalMember(owner = "client!pd", name = "s", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!pd", name = "u", descriptor = "I")
    public static int field2569;

    @OriginalMember(owner = "client!pd", name = "w", descriptor = "I")
    public static int field2571;

    @OriginalMember(owner = "client!pd", name = "x", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!pd", name = "z", descriptor = "I")
    public int field2574;

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "Lga;")
    public static class279 field2560;

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "Lul;")
    public static class406 field2557;

    @OriginalMember(owner = "client!pd", name = "y", descriptor = "[[I")
    public int[][] field2573;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)V")
    public static void method1149(byte arg0) {
        field2557 = null;
        field2568 = null;
        field2570 = null;
        field2560 = null;
        if (arg0 != 116) {
            field2549 = -62;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(III)V")
    public final void method1150(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field2559;
        field2554++;
        int var5 = arg1 - this.field2565;
        this.field2573[var4][var5] = class264.method1763(this.field2573[var4][var5], 262144);
        if (arg0 != -10376) {
            field2560 = null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(III)V")
    public final void method1151(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field2565;
        int var5 = arg0 - this.field2559;
        field2561++;
        if (arg1 >= 19) {
            this.field2573[var5][var4] = class264.method1763(this.field2573[var5][var4], 2097152);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIII)V")
    private final void method1152(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 < -122) {
            field2552++;
            this.field2573[arg0][arg2] = class74.method644(this.field2573[arg0][arg2], ~arg1);
        }
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(IIII)I")
    public static final int method1153(int arg0, int arg1, int arg2, int arg3) {
        field2566++;
        if (class491.field7059 == null) {
            return 0;
        }
        int var4 = arg2 >> 7;
        int var5 = arg3 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > class69.field976 - 1 || class285.field4328 - 1 < var5) {
            return 0;
        }
        int var6 = arg0;
        if (~arg0 > arg1 && (class476.field6873[1][var4][var5] & 0x2) != 0) {
            var6 = arg0 + 1;
        }
        return class491.field7059[var6].method412(arg2, arg3);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIIIBIII)Z")
    public final boolean method1154(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8) {
        field2569++;
        if (arg3 > 1) {
            return class56.method515(arg7, arg3, arg8, arg0, arg3, arg2, arg4, 4268, arg6) ? true : this.method1162(arg7, arg2, arg3, arg4, arg6, arg8, arg0, arg1, arg3, (byte) 10);
        }
        int var10 = arg4 - (1 - arg8);
        int var11 = arg2 + arg6 - 1;
        if (arg0 >= arg4 && var10 >= arg0 && arg6 <= arg7 && var11 >= arg7) {
            return true;
        } else if ((arg4 - 1) == arg0 && arg7 >= arg6 && arg7 <= var11 && (this.field2573[arg0 - this.field2559][arg7 - this.field2565] & 0x8) == 0 && (arg1 & 0x8) == 0) {
            return true;
        } else {
            if (arg5 <= 115) {
                this.method1157(104, -115, -114, true, false, 44, 3);
            }
            if ((var10 + 1) == arg0 && arg7 >= arg6 && var11 >= arg7 && (this.field2573[arg0 - this.field2559][arg7 - this.field2565] & 0x80) == 0 && (arg1 & 0x2) == 0) {
                return true;
            } else if (arg6 - 1 == arg7 && arg4 <= arg0 && arg0 <= var10 && (this.field2573[arg0 - this.field2559][arg7 - this.field2565] & 0x2) == 0 && (arg1 & 0x4) == 0) {
                return true;
            } else {
                return (var11 + 1) == arg7 && arg0 >= arg4 && var10 >= arg0 && (this.field2573[arg0 - this.field2559][arg7 - this.field2565] & 0x20) == 0 && (arg1 & 0x1) == 0;
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(III)V")
    public final void method1155(int arg0, int arg1, int arg2) {
        field2564++;
        int var4 = -128 % ((arg2 - 15) / 33);
        int var5 = arg0 - this.field2565;
        int var6 = arg1 - this.field2559;
        this.field2573[var6][var5] = class74.method644(this.field2573[var6][var5], -262145);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method1156(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2555++;
        if (arg3 == 1) {
            if (arg1 == arg2 && arg5 == arg7) {
                return true;
            }
        } else if (arg1 <= arg2 && arg2 <= (arg3 + arg1 - 1) && arg5 >= arg5 && arg5 <= (arg5 + arg3 - 1)) {
            return true;
        }
        int var9 = arg5 - this.field2565;
        if (arg6 != -1) {
            this.method1155(127, 8, -72);
        }
        int var10 = arg7 - this.field2565;
        int var11 = arg2 - this.field2559;
        int var12 = arg1 - this.field2559;
        if (arg3 == 1) {
            if (arg4 == 0) {
                if (arg0 == 0) {
                    if (var11 - 1 == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && (var9 + 1) == var10 && (this.field2573[var12][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var9 - 1) == var10 && (this.field2573[var12][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var11 == var12 && var9 + 1 == var10) {
                        return true;
                    }
                    if ((var11 - 1) == var12 && var9 == var10 && (this.field2573[var12][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var9 == var10 && (this.field2573[var12][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if (var11 + 1 == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && (var9 + 1) == var10 && (this.field2573[var12][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 - 1 == var10 && (this.field2573[var12][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var11 == var12 && var9 - 1 == var10) {
                        return true;
                    }
                    if ((var11 - 1) == var12 && var9 == var10 && (this.field2573[var12][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var9 == var10 && (this.field2573[var12][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 2) {
                if (arg0 == 0) {
                    if ((var11 - 1) == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && (var9 + 1) == var10) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var9 == var10 && (this.field2573[var12][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 - 1 == var10 && (this.field2573[var12][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if ((var11 - 1) == var12 && var9 == var10 && (this.field2573[var12][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var9 + 1) == var10) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && var9 - 1 == var10 && (this.field2573[var12][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if ((var11 - 1) == var12 && var9 == var10 && (this.field2573[var12][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var9 + 1) == var10 && (this.field2573[var12][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && var9 - 1 == var10) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if ((var11 - 1) == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && (var9 + 1) == var10 && (this.field2573[var12][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var9 == var10 && (this.field2573[var12][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var9 - 1) == var10) {
                        return true;
                    }
                }
            }
            if (arg4 == 9) {
                if (var11 == var12 && var9 + 1 == var10 && (this.field2573[var12][var10] & 0x20) == 0) {
                    return true;
                }
                if (var11 == var12 && (var9 - 1) == var10 && (this.field2573[var12][var10] & 0x2) == 0) {
                    return true;
                }
                if (var11 - 1 == var12 && var9 == var10 && (this.field2573[var12][var10] & 0x8) == 0) {
                    return true;
                }
                if ((var11 + 1) == var12 && var9 == var10 && (this.field2573[var12][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var12 + arg3 - 1;
            int var14 = var10 + arg3 - 1;
            if (arg4 == 0) {
                if (arg0 == 0) {
                    if (var11 - arg3 == var12 && var10 <= var9 && var9 <= var14) {
                        return true;
                    }
                    if (var11 >= var12 && var13 >= var11 && (var9 + 1) == var10 && (this.field2573[var11][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 <= var11 && var13 >= var11 && (var9 - arg3) == var10 && (this.field2573[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var11 >= var12 && var11 <= var13 && var9 + 1 == var10) {
                        return true;
                    }
                    if (var11 - arg3 == var12 && var10 <= var9 && var9 <= var14 && (this.field2573[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var10 <= var9 && var14 >= var9 && (this.field2573[var12][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if (var11 + 1 == var12 && var10 <= var9 && var14 >= var9) {
                        return true;
                    }
                    if (var11 >= var12 && var11 <= var13 && (var9 + 1) == var10 && (this.field2573[var11][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 >= var12 && var13 >= var11 && var9 - arg3 == var10 && (this.field2573[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var11 >= var12 && var11 <= var13 && (var9 - arg3) == var10) {
                        return true;
                    }
                    if (var11 - arg3 == var12 && var10 <= var9 && var9 <= var14 && (this.field2573[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var9 >= var10 && var14 >= var9 && (this.field2573[var12][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 2) {
                if (arg0 == 0) {
                    if (var11 - arg3 == var12 && var10 <= var9 && var14 >= var9) {
                        return true;
                    }
                    if (var12 <= var11 && var13 >= var11 && (var9 + 1) == var10) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var10 <= var9 && var14 >= var9 && (this.field2573[var12][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var12 <= var11 && var13 >= var11 && (var9 - arg3) == var10 && (this.field2573[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var11 - arg3 == var12 && var10 <= var9 && var14 >= var9 && (this.field2573[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 >= var12 && var13 >= var11 && var9 + 1 == var10) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var10 <= var9 && var9 <= var14) {
                        return true;
                    }
                    if (var11 >= var12 && var13 >= var11 && (var9 - arg3) == var10 && (this.field2573[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if ((var11 - arg3) == var12 && var10 <= var9 && var14 >= var9 && (this.field2573[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 >= var12 && var11 <= var13 && (var9 + 1) == var10 && (this.field2573[var11][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var9 >= var10 && var14 >= var9) {
                        return true;
                    }
                    if (var12 <= var11 && var13 >= var11 && (var9 - arg3) == var10) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var11 - arg3 == var12 && var10 <= var9 && var14 >= var9) {
                        return true;
                    }
                    if (var12 <= var11 && var11 <= var13 && var9 + 1 == var10 && (this.field2573[var11][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var9 >= var10 && var9 <= var14 && (this.field2573[var12][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 >= var12 && var13 >= var11 && (var9 - arg3) == var10) {
                        return true;
                    }
                }
            }
            if (arg4 == 9) {
                if (var11 >= var12 && var13 >= var11 && var9 + 1 == var10 && (this.field2573[var11][var10] & 0x2C0120) == 0) {
                    return true;
                }
                if (var11 >= var12 && var11 <= var13 && var9 - arg3 == var10 && (this.field2573[var11][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if ((var11 - arg3) == var12 && var10 <= var9 && var14 >= var9 && (this.field2573[var13][var9] & 0x2C0108) == 0) {
                    return true;
                }
                if (var11 + 1 == var12 && var9 >= var10 && var14 >= var9 && (this.field2573[var12][var9] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIZZII)V")
    public final void method1157(int arg0, int arg1, int arg2, boolean arg3, boolean arg4, int arg5, int arg6) {
        if (arg1 <= 4) {
            field2557 = null;
        }
        int var8 = arg5 - this.field2565;
        field2572++;
        int var9 = arg6 - this.field2559;
        if (arg0 == 0) {
            if (arg2 == 0) {
                this.method1152(var9, 128, var8, -124);
                this.method1152(var9 - 1, 8, var8, -126);
            }
            if (arg2 == 1) {
                this.method1152(var9, 2, var8, -125);
                this.method1152(var9, 32, var8 + 1, -128);
            }
            if (arg2 == 2) {
                this.method1152(var9, 8, var8, -124);
                this.method1152(var9 + 1, 128, var8, -123);
            }
            if (arg2 == 3) {
                this.method1152(var9, 32, var8, -128);
                this.method1152(var9, 2, var8 - 1, -126);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg2 == 0) {
                this.method1152(var9, 1, var8, -125);
                this.method1152(var9 - 1, 16, var8 + 1, -126);
            }
            if (arg2 == 1) {
                this.method1152(var9, 4, var8, -124);
                this.method1152(var9 + 1, 64, var8 + 1, -126);
            }
            if (arg2 == 2) {
                this.method1152(var9, 16, var8, -123);
                this.method1152(var9 + 1, 1, var8 - 1, -126);
            }
            if (arg2 == 3) {
                this.method1152(var9, 64, var8, -126);
                this.method1152(var9 - 1, 4, var8 - 1, -127);
            }
        }
        if (arg0 == 2) {
            if (arg2 == 0) {
                this.method1152(var9, 130, var8, -128);
                this.method1152(var9 - 1, 8, var8, -127);
                this.method1152(var9, 32, var8 + 1, -123);
            }
            if (arg2 == 1) {
                this.method1152(var9, 10, var8, -125);
                this.method1152(var9, 32, var8 + 1, -125);
                this.method1152(var9 + 1, 128, var8, -127);
            }
            if (arg2 == 2) {
                this.method1152(var9, 40, var8, -126);
                this.method1152(var9 + 1, 128, var8, -125);
                this.method1152(var9, 2, var8 - 1, -127);
            }
            if (arg2 == 3) {
                this.method1152(var9, 160, var8, -125);
                this.method1152(var9, 2, var8 - 1, -124);
                this.method1152(var9 - 1, 8, var8, -123);
            }
        }
        if (arg3) {
            if (arg0 == 0) {
                if (arg2 == 0) {
                    this.method1152(var9, 65536, var8, -125);
                    this.method1152(var9 - 1, 4096, var8, -125);
                }
                if (arg2 == 1) {
                    this.method1152(var9, 1024, var8, -124);
                    this.method1152(var9, 16384, var8 + 1, -127);
                }
                if (arg2 == 2) {
                    this.method1152(var9, 4096, var8, -125);
                    this.method1152(var9 + 1, 65536, var8, -125);
                }
                if (arg2 == 3) {
                    this.method1152(var9, 16384, var8, -128);
                    this.method1152(var9, 1024, var8 - 1, -126);
                }
            }
            if (arg0 == 1 || arg0 == 3) {
                if (arg2 == 0) {
                    this.method1152(var9, 512, var8, -128);
                    this.method1152(var9 - 1, 8192, var8 + 1, -123);
                }
                if (arg2 == 1) {
                    this.method1152(var9, 2048, var8, -124);
                    this.method1152(var9 + 1, 32768, var8 + 1, -128);
                }
                if (arg2 == 2) {
                    this.method1152(var9, 8192, var8, -128);
                    this.method1152(var9 + 1, 512, var8 - 1, -124);
                }
                if (arg2 == 3) {
                    this.method1152(var9, 32768, var8, -127);
                    this.method1152(var9 - 1, 2048, var8 - 1, -125);
                }
            }
            if (arg0 == 2) {
                if (arg2 == 0) {
                    this.method1152(var9, 66560, var8, -123);
                    this.method1152(var9 - 1, 4096, var8, -127);
                    this.method1152(var9, 16384, var8 + 1, -126);
                }
                if (arg2 == 1) {
                    this.method1152(var9, 5120, var8, -123);
                    this.method1152(var9, 16384, var8 + 1, -127);
                    this.method1152(var9 + 1, 65536, var8, -125);
                }
                if (arg2 == 2) {
                    this.method1152(var9, 20480, var8, -126);
                    this.method1152(var9 + 1, 65536, var8, -123);
                    this.method1152(var9, 1024, var8 - 1, -127);
                }
                if (arg2 == 3) {
                    this.method1152(var9, 81920, var8, -123);
                    this.method1152(var9, 1024, var8 - 1, -126);
                    this.method1152(var9 - 1, 4096, var8, -128);
                }
            }
        }
        if (!arg4) {
            return;
        }
        if (arg0 == 0) {
            if (arg2 == 0) {
                this.method1152(var9, 536870912, var8, -127);
                this.method1152(var9 - 1, 33554432, var8, -123);
            }
            if (arg2 == 1) {
                this.method1152(var9, 8388608, var8, -123);
                this.method1152(var9, 134217728, var8 + 1, -124);
            }
            if (arg2 == 2) {
                this.method1152(var9, 33554432, var8, -125);
                this.method1152(var9 + 1, 536870912, var8, -125);
            }
            if (arg2 == 3) {
                this.method1152(var9, 134217728, var8, -124);
                this.method1152(var9, 8388608, var8 - 1, -127);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg2 == 0) {
                this.method1152(var9, 4194304, var8, -126);
                this.method1152(var9 - 1, 67108864, var8 + 1, -124);
            }
            if (arg2 == 1) {
                this.method1152(var9, 16777216, var8, -124);
                this.method1152(var9 + 1, 268435456, var8 + 1, -127);
            }
            if (arg2 == 2) {
                this.method1152(var9, 67108864, var8, -127);
                this.method1152(var9 + 1, 4194304, var8 - 1, -125);
            }
            if (arg2 == 3) {
                this.method1152(var9, 268435456, var8, -127);
                this.method1152(var9 - 1, 16777216, var8 - 1, -128);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method1152(var9, 545259520, var8, -127);
            this.method1152(var9 - 1, 33554432, var8, -123);
            this.method1152(var9, 134217728, var8 + 1, -124);
        }
        if (arg2 == 1) {
            this.method1152(var9, 41943040, var8, -123);
            this.method1152(var9, 134217728, var8 + 1, -125);
            this.method1152(var9 + 1, 536870912, var8, -124);
        }
        if (arg2 == 2) {
            this.method1152(var9, 167772160, var8, -127);
            this.method1152(var9 + 1, 536870912, var8, -124);
            this.method1152(var9, 8388608, var8 - 1, -125);
        }
        if (arg2 == 3) {
            this.method1152(var9, 671088640, var8, -123);
            this.method1152(var9, 8388608, var8 - 1, -124);
            this.method1152(var9 - 1, 33554432, var8, -128);
            return;
        }
    }

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "(III)V")
    public final void method1158(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field2565;
        field2553++;
        int var5 = arg0 - this.field2559;
        this.field2573[var5][var4] = class74.method644(this.field2573[var5][var4], -2097153);
        if (arg2 != 2883842) {
            this.field2573 = null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IBZIIIZ)V")
    public final void method1159(int arg0, byte arg1, boolean arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field2558++;
        int var8 = arg5 - this.field2559;
        int var9 = arg0 - this.field2565;
        if (arg4 == 0) {
            if (arg3 == 0) {
                this.method1163(var8, 128, 17370, var9);
                this.method1163(var8 - 1, 8, 17370, var9);
            }
            if (arg3 == 1) {
                this.method1163(var8, 2, 17370, var9);
                this.method1163(var8, 32, 17370, var9 + 1);
            }
            if (arg3 == 2) {
                this.method1163(var8, 8, 17370, var9);
                this.method1163(var8 + 1, 128, 17370, var9);
            }
            if (arg3 == 3) {
                this.method1163(var8, 32, 17370, var9);
                this.method1163(var8, 2, 17370, var9 - 1);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg3 == 0) {
                this.method1163(var8, 1, 17370, var9);
                this.method1163(var8 - 1, 16, 17370, var9 + 1);
            }
            if (arg3 == 1) {
                this.method1163(var8, 4, 17370, var9);
                this.method1163(var8 + 1, 64, 17370, var9 + 1);
            }
            if (arg3 == 2) {
                this.method1163(var8, 16, 17370, var9);
                this.method1163(var8 + 1, 1, 17370, var9 - 1);
            }
            if (arg3 == 3) {
                this.method1163(var8, 64, 17370, var9);
                this.method1163(var8 - 1, 4, 17370, var9 - 1);
            }
        }
        if (arg1 < 126) {
            this.method1159(-11, (byte) -125, true, 66, 87, 41, false);
        }
        if (arg4 == 2) {
            if (arg3 == 0) {
                this.method1163(var8, 130, 17370, var9);
                this.method1163(var8 - 1, 8, 17370, var9);
                this.method1163(var8, 32, 17370, var9 + 1);
            }
            if (arg3 == 1) {
                this.method1163(var8, 10, 17370, var9);
                this.method1163(var8, 32, 17370, var9 + 1);
                this.method1163(var8 + 1, 128, 17370, var9);
            }
            if (arg3 == 2) {
                this.method1163(var8, 40, 17370, var9);
                this.method1163(var8 + 1, 128, 17370, var9);
                this.method1163(var8, 2, 17370, var9 - 1);
            }
            if (arg3 == 3) {
                this.method1163(var8, 160, 17370, var9);
                this.method1163(var8, 2, 17370, var9 - 1);
                this.method1163(var8 - 1, 8, 17370, var9);
            }
        }
        if (arg6) {
            if (arg4 == 0) {
                if (arg3 == 0) {
                    this.method1163(var8, 65536, 17370, var9);
                    this.method1163(var8 - 1, 4096, 17370, var9);
                }
                if (arg3 == 1) {
                    this.method1163(var8, 1024, 17370, var9);
                    this.method1163(var8, 16384, 17370, var9 + 1);
                }
                if (arg3 == 2) {
                    this.method1163(var8, 4096, 17370, var9);
                    this.method1163(var8 + 1, 65536, 17370, var9);
                }
                if (arg3 == 3) {
                    this.method1163(var8, 16384, 17370, var9);
                    this.method1163(var8, 1024, 17370, var9 - 1);
                }
            }
            if (arg4 == 1 || arg4 == 3) {
                if (arg3 == 0) {
                    this.method1163(var8, 512, 17370, var9);
                    this.method1163(var8 - 1, 8192, 17370, var9 + 1);
                }
                if (arg3 == 1) {
                    this.method1163(var8, 2048, 17370, var9);
                    this.method1163(var8 + 1, 32768, 17370, var9 + 1);
                }
                if (arg3 == 2) {
                    this.method1163(var8, 8192, 17370, var9);
                    this.method1163(var8 + 1, 512, 17370, var9 - 1);
                }
                if (arg3 == 3) {
                    this.method1163(var8, 32768, 17370, var9);
                    this.method1163(var8 - 1, 2048, 17370, var9 - 1);
                }
            }
            if (arg4 == 2) {
                if (arg3 == 0) {
                    this.method1163(var8, 66560, 17370, var9);
                    this.method1163(var8 - 1, 4096, 17370, var9);
                    this.method1163(var8, 16384, 17370, var9 + 1);
                }
                if (arg3 == 1) {
                    this.method1163(var8, 5120, 17370, var9);
                    this.method1163(var8, 16384, 17370, var9 + 1);
                    this.method1163(var8 + 1, 65536, 17370, var9);
                }
                if (arg3 == 2) {
                    this.method1163(var8, 20480, 17370, var9);
                    this.method1163(var8 + 1, 65536, 17370, var9);
                    this.method1163(var8, 1024, 17370, var9 - 1);
                }
                if (arg3 == 3) {
                    this.method1163(var8, 81920, 17370, var9);
                    this.method1163(var8, 1024, 17370, var9 - 1);
                    this.method1163(var8 - 1, 4096, 17370, var9);
                }
            }
        }
        if (!arg2) {
            return;
        }
        if (arg4 == 0) {
            if (arg3 == 0) {
                this.method1163(var8, 536870912, 17370, var9);
                this.method1163(var8 - 1, 33554432, 17370, var9);
            }
            if (arg3 == 1) {
                this.method1163(var8, 8388608, 17370, var9);
                this.method1163(var8, 134217728, 17370, var9 + 1);
            }
            if (arg3 == 2) {
                this.method1163(var8, 33554432, 17370, var9);
                this.method1163(var8 + 1, 536870912, 17370, var9);
            }
            if (arg3 == 3) {
                this.method1163(var8, 134217728, 17370, var9);
                this.method1163(var8, 8388608, 17370, var9 - 1);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg3 == 0) {
                this.method1163(var8, 4194304, 17370, var9);
                this.method1163(var8 - 1, 67108864, 17370, var9 + 1);
            }
            if (arg3 == 1) {
                this.method1163(var8, 16777216, 17370, var9);
                this.method1163(var8 + 1, 268435456, 17370, var9 + 1);
            }
            if (arg3 == 2) {
                this.method1163(var8, 67108864, 17370, var9);
                this.method1163(var8 + 1, 4194304, 17370, var9 - 1);
            }
            if (arg3 == 3) {
                this.method1163(var8, 268435456, 17370, var9);
                this.method1163(var8 - 1, 16777216, 17370, var9 - 1);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method1163(var8, 545259520, 17370, var9);
            this.method1163(var8 - 1, 33554432, 17370, var9);
            this.method1163(var8, 134217728, 17370, var9 + 1);
        }
        if (arg3 == 1) {
            this.method1163(var8, 41943040, 17370, var9);
            this.method1163(var8, 134217728, 17370, var9 + 1);
            this.method1163(var8 + 1, 536870912, 17370, var9);
        }
        if (arg3 == 2) {
            this.method1163(var8, 167772160, 17370, var9);
            this.method1163(var8 + 1, 536870912, 17370, var9);
            this.method1163(var8, 8388608, 17370, var9 - 1);
        }
        if (arg3 == 3) {
            this.method1163(var8, 671088640, 17370, var9);
            this.method1163(var8, 8388608, 17370, var9 - 1);
            this.method1163(var8 - 1, 33554432, 17370, var9);
            return;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ZIIIIIII)Z")
    public final boolean method1160(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0) {
            this.field2559 = 29;
        }
        field2567++;
        if (arg1 == 1) {
            if (arg2 == arg5 && arg3 == arg6) {
                return true;
            }
        } else if (arg5 >= arg2 && arg5 <= arg1 + arg2 - 1 && arg6 <= arg6 && (arg1 + arg6 - 1) >= arg6) {
            return true;
        }
        int var9 = arg2 - this.field2559;
        int var10 = arg6 - this.field2565;
        int var11 = arg5 - this.field2559;
        int var12 = arg3 - this.field2565;
        if (arg1 == 1) {
            if (arg7 == 6 || arg7 == 7) {
                if (arg7 == 7) {
                    arg4 = arg4 + 2 & 0x3;
                }
                if (arg4 == 0) {
                    if ((var11 + 1) == var9 && var10 == var12 && (this.field2573[var9][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 - 1 == var12 && (this.field2573[var9][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var11 - 1 == var9 && var10 == var12 && (this.field2573[var9][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 - 1 == var12 && (this.field2573[var9][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if (var11 - 1 == var9 && var10 == var12 && (this.field2573[var9][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var10 + 1) == var12 && (this.field2573[var9][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if ((var11 + 1) == var9 && var10 == var12 && (this.field2573[var9][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 + 1 == var12 && (this.field2573[var9][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg7 == 8) {
                if (var9 == var11 && (var10 + 1) == var12 && (this.field2573[var9][var12] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var11 && (var10 - 1) == var12 && (this.field2573[var9][var12] & 0x2) == 0) {
                    return true;
                }
                if ((var11 - 1) == var9 && var10 == var12 && (this.field2573[var9][var12] & 0x8) == 0) {
                    return true;
                }
                if (var11 + 1 == var9 && var10 == var12 && (this.field2573[var9][var12] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var9 - (1 - arg1);
            int var14 = arg1 + var12 - 1;
            if (arg7 == 6 || arg7 == 7) {
                if (arg7 == 7) {
                    arg4 = arg4 + 2 & 0x3;
                }
                if (arg4 == 0) {
                    if ((var11 + 1) == var9 && var12 <= var10 && var14 >= var10 && (this.field2573[var9][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var11 <= var13 && var10 - arg1 == var12 && (this.field2573[var11][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if ((var11 - arg1) == var9 && var10 >= var12 && var10 <= var14 && (this.field2573[var13][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var11 <= var13 && var10 - arg1 == var12 && (this.field2573[var11][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if ((var11 - arg1) == var9 && var12 <= var10 && var14 >= var10 && (this.field2573[var13][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var13 >= var11 && var10 + 1 == var12 && (this.field2573[var11][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var11 + 1 == var9 && var10 >= var12 && var10 <= var14 && (this.field2573[var9][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var11 <= var13 && var10 + 1 == var12 && (this.field2573[var11][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg7 == 8) {
                if (var11 >= var9 && var11 <= var13 && (var10 + 1) == var12 && (this.field2573[var11][var12] & 0x20) == 0) {
                    return true;
                }
                if (var9 <= var11 && var13 >= var11 && var10 - arg1 == var12 && (this.field2573[var11][var14] & 0x2) == 0) {
                    return true;
                }
                if (var11 - arg1 == var9 && var10 >= var12 && var14 >= var10 && (this.field2573[var13][var10] & 0x8) == 0) {
                    return true;
                }
                if ((var11 + 1) == var9 && var12 <= var10 && var10 <= var14 && (this.field2573[var9][var10] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
    public final void method1161(int arg0) {
        field2551++;
        int var2 = -13 % ((-arg0 - 62) / 48);
        for (int var3 = 0; var3 < this.field2550; var3++) {
            for (int var4 = 0; var4 < this.field2574; var4++) {
                if (var3 == 0 || var4 == 0 || (this.field2550 - 5) <= var3 || (this.field2574 - 5) <= var4) {
                    this.field2573[var3][var4] = -1;
                } else {
                    this.field2573[var3][var4] = 2097152;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIIIIIIIB)Z")
    public final boolean method1162(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte arg9) {
        field2556++;
        int var11 = arg2 + arg6;
        int var12 = arg0 + arg8;
        int var13 = arg3 + arg5;
        int var14 = arg1 + arg4;
        if (arg6 == var13 && (arg7 & 0x2) == 0) {
            int var15 = arg4 >= arg0 ? arg4 : arg0;
            int var16 = var12 < var14 ? var12 : var14;
            while (var15 < var16) {
                if ((this.field2573[var13 - this.field2559 - 1][var15 - this.field2565] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg3 == var11 && (arg7 & 0x8) == 0) {
            int var17 = arg0 > arg4 ? arg0 : arg4;
            int var18 = var12 >= var14 ? var14 : var12;
            while (var17 < var18) {
                if ((this.field2573[arg3 - this.field2559][var17 - this.field2565] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg0 == var14 && (arg7 & 0x1) == 0) {
            int var19 = arg6 <= arg3 ? arg3 : arg6;
            int var20 = var13 > var11 ? var11 : var13;
            while (var19 < var20) {
                if ((this.field2573[var19 - this.field2559][var14 - this.field2565 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg4 == var12 && (arg7 & 0x4) == 0) {
            int var21 = arg3 < arg6 ? arg6 : arg3;
            int var22 = var13 > var11 ? var11 : var13;
            while (var21 < var22) {
                if ((this.field2573[var21 - this.field2559][arg4 - this.field2565] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return arg9 == 10 ? false : false;
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(IIII)V")
    private final void method1163(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 17370) {
            field2563++;
            this.field2573[arg0][arg3] = class264.method1763(this.field2573[arg0][arg3], arg1);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IZIIIZII)V")
    public final void method1164(int arg0, boolean arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field2571++;
        int var9 = 256;
        if (arg5) {
            var9 |= 0x20000;
        }
        int var10 = arg6 - this.field2565;
        if (arg1) {
            var9 |= 0x40000000;
        }
        if (arg2 == 1 || arg2 == 3) {
            int var11 = arg4;
            arg4 = arg7;
            arg7 = var11;
        }
        int var12 = arg0 - this.field2559;
        if (arg3 != 0) {
            this.field2559 = 117;
        }
        for (int var13 = var12; var13 < var12 + arg4; var13++) {
            if (var13 >= 0 && this.field2550 > var13) {
                for (int var14 = var10; var14 < (var10 + arg7); var14++) {
                    if (var14 >= 0 && this.field2574 > var14) {
                        this.method1152(var13, var9, var14, arg3 ^ 0xFFFFFF83);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ZZIIIII)V")
    public final void method1165(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2562++;
        int var8 = 256;
        if (arg0) {
            var8 |= 0x20000;
        }
        int var9 = arg3 - this.field2565;
        if (arg1) {
            var8 |= 0x40000000;
        }
        int var10 = arg4 - this.field2559;
        int var11 = var10;
        if (arg2 != 1) {
            return;
        }
        while (var11 < var10 + arg5) {
            if (var11 >= 0 && var11 < this.field2550) {
                for (int var12 = var9; var12 < (arg6 + var9); var12++) {
                    if (var12 >= 0 && this.field2574 > var12) {
                        this.method1163(var11, var8, 17370, var12);
                    }
                }
            }
            var11++;
        }
    }
}
