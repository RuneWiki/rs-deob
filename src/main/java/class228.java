import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nfa")
public class class228 {

    @OriginalMember(owner = "client!nfa", name = "k", descriptor = "Lhca;")
    public static class244 field3055 = new class244();

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!nfa", name = "b", descriptor = "I")
    public static int field3046;

    @OriginalMember(owner = "client!nfa", name = "c", descriptor = "I")
    public static int field3047;

    @OriginalMember(owner = "client!nfa", name = "d", descriptor = "I")
    public static int field3048;

    @OriginalMember(owner = "client!nfa", name = "f", descriptor = "I")
    public static int field3050;

    @OriginalMember(owner = "client!nfa", name = "g", descriptor = "I")
    public static int field3051;

    @OriginalMember(owner = "client!nfa", name = "h", descriptor = "I")
    public int field3052;

    @OriginalMember(owner = "client!nfa", name = "i", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!nfa", name = "j", descriptor = "I")
    public static int field3054;

    @OriginalMember(owner = "client!nfa", name = "l", descriptor = "I")
    public static int field3056;

    @OriginalMember(owner = "client!nfa", name = "m", descriptor = "I")
    public static int field3057;

    @OriginalMember(owner = "client!nfa", name = "n", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!nfa", name = "p", descriptor = "I")
    public int field3060;

    @OriginalMember(owner = "client!nfa", name = "q", descriptor = "I")
    public int field3061;

    @OriginalMember(owner = "client!nfa", name = "r", descriptor = "I")
    public static int field3062;

    @OriginalMember(owner = "client!nfa", name = "s", descriptor = "I")
    public int field3063;

    @OriginalMember(owner = "client!nfa", name = "t", descriptor = "I")
    public static int field3064;

    @OriginalMember(owner = "client!nfa", name = "u", descriptor = "I")
    public static int field3065;

    @OriginalMember(owner = "client!nfa", name = "v", descriptor = "I")
    public static int field3066;

    @OriginalMember(owner = "client!nfa", name = "w", descriptor = "I")
    public static int field3067;

    @OriginalMember(owner = "client!nfa", name = "o", descriptor = "Lpg;")
    public static class289 field3059;

    @OriginalMember(owner = "client!nfa", name = "e", descriptor = "[[I")
    public int[][] field3049;

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(BII)V", line = 4)
    public final void method1342(byte arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field3063;
        int var5 = -111 / ((arg0 - 62) / 45);
        int var6 = arg2 - this.field3052;
        field3046++;
        this.field3049[var4][var6] = class678.method3817(this.field3049[var4][var6], 262144);
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IIII)V", line = 18)
    private final void method1343(int arg0, int arg1, int arg2, int arg3) {
        field3045++;
        if (arg1 <= 53) {
            this.method1354((byte) -78);
        }
        this.field3049[arg3][arg0] = class678.method3817(this.field3049[arg3][arg0], arg2);
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IZIZBIII)V", line = 32)
    public final void method1344(int arg0, boolean arg1, int arg2, boolean arg3, byte arg4, int arg5, int arg6, int arg7) {
        field3066++;
        int var9 = 256;
        if (arg1) {
            var9 |= 0x20000;
        }
        if (arg0 == 1 || arg0 == 3) {
            int var10 = arg5;
            arg5 = arg7;
            arg7 = var10;
        }
        int var11 = arg2 - this.field3052;
        int var12 = arg6 - this.field3063;
        if (arg4 != -68) {
            this.method1349(43, true, -22, (byte) 33, 17, 63, true);
        }
        if (arg3) {
            var9 |= 0x40000000;
        }
        for (int var13 = var12; var13 < arg5 + var12; var13++) {
            if (var13 >= 0 && var13 < this.field3060) {
                for (int var14 = var11; var14 < (arg7 + var11); var14++) {
                    if (var14 >= 0 && var14 < this.field3061) {
                        this.method1350(var14, var13, var9, (byte) 21);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IIIIIIII)Z", line = 92)
    public final boolean method1345(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3047++;
        if (arg6 == 1) {
            if (arg4 == arg7 && arg0 == arg5) {
                return true;
            }
        } else if (arg4 >= arg7 && arg4 <= arg6 + arg7 - 1 && arg0 <= arg0 && (arg0 + arg6 - 1) >= arg0) {
            return true;
        }
        int var9 = arg0 - this.field3052;
        int var10 = arg7 - this.field3063;
        int var11 = arg5 - this.field3052;
        int var12 = arg4 - this.field3063;
        if (arg6 == 1) {
            if (arg1 == 0) {
                if (arg2 == 0) {
                    if (var12 - 1 == var10 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && (var9 + 1) == var11 && (this.field3049[var10][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var9 - 1) == var11 && (this.field3049[var10][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var10 == var12 && var9 + 1 == var11) {
                        return true;
                    }
                    if ((var12 - 1) == var10 && var9 == var11 && (this.field3049[var10][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var10 && var9 == var11 && (this.field3049[var10][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if (var12 + 1 == var10 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && (var9 + 1) == var11 && (this.field3049[var10][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var9 - 1 == var11 && (this.field3049[var10][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var10 == var12 && (var9 - 1) == var11) {
                        return true;
                    }
                    if (var12 - 1 == var10 && var9 == var11 && (this.field3049[var10][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var10 && var9 == var11 && (this.field3049[var10][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg1 == 2) {
                if (arg2 == 0) {
                    if ((var12 - 1) == var10 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && (var9 + 1) == var11) {
                        return true;
                    }
                    if (var12 + 1 == var10 && var9 == var11 && (this.field3049[var10][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var9 - 1) == var11 && (this.field3049[var10][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var12 - 1 == var10 && var9 == var11 && (this.field3049[var10][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var9 + 1) == var11) {
                        return true;
                    }
                    if (var12 + 1 == var10 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && var9 - 1 == var11 && (this.field3049[var10][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if ((var12 - 1) == var10 && var9 == var11 && (this.field3049[var10][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var9 + 1) == var11 && (this.field3049[var10][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var10 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && var9 - 1 == var11) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if ((var12 - 1) == var10 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && (var9 + 1) == var11 && (this.field3049[var10][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var10 && var9 == var11 && (this.field3049[var10][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var9 - 1 == var11) {
                        return true;
                    }
                }
            }
            if (arg1 == 9) {
                if (var10 == var12 && (var9 + 1) == var11 && (this.field3049[var10][var11] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var12 && (var9 - 1) == var11 && (this.field3049[var10][var11] & 0x2) == 0) {
                    return true;
                }
                if (var12 - 1 == var10 && var9 == var11 && (this.field3049[var10][var11] & 0x8) == 0) {
                    return true;
                }
                if (var12 + 1 == var10 && var9 == var11 && (this.field3049[var10][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg6 + var10 - 1;
            int var14 = arg6 + var11 - 1;
            if (arg1 == 0) {
                if (arg2 == 0) {
                    if ((var12 - arg6) == var10 && var11 <= var9 && var9 <= var14) {
                        return true;
                    }
                    if (var10 <= var12 && var13 >= var12 && var9 + 1 == var11 && (this.field3049[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 >= var10 && var12 <= var13 && var9 - arg6 == var11 && (this.field3049[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var12 >= var10 && var12 <= var13 && var9 + 1 == var11) {
                        return true;
                    }
                    if ((var12 - arg6) == var10 && var11 <= var9 && var14 >= var9 && (this.field3049[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var10 && var11 <= var9 && var14 >= var9 && (this.field3049[var10][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if (var12 + 1 == var10 && var9 >= var11 && var14 >= var9) {
                        return true;
                    }
                    if (var12 >= var10 && var12 <= var13 && (var9 + 1) == var11 && (this.field3049[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 >= var10 && var12 <= var13 && (var9 - arg6) == var11 && (this.field3049[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var12 >= var10 && var13 >= var12 && (var9 - arg6) == var11) {
                        return true;
                    }
                    if ((var12 - arg6) == var10 && var11 <= var9 && var9 <= var14 && (this.field3049[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var10 && var11 <= var9 && var9 <= var14 && (this.field3049[var10][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg1 == 2) {
                if (arg2 == 0) {
                    if (var12 - arg6 == var10 && var9 >= var11 && var9 <= var14) {
                        return true;
                    }
                    if (var12 >= var10 && var13 >= var12 && var9 + 1 == var11) {
                        return true;
                    }
                    if ((var12 + 1) == var10 && var11 <= var9 && var14 >= var9 && (this.field3049[var10][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var12 >= var10 && var12 <= var13 && var9 - arg6 == var11 && (this.field3049[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var12 - arg6 == var10 && var9 >= var11 && var9 <= var14 && (this.field3049[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 >= var10 && var12 <= var13 && (var9 + 1) == var11) {
                        return true;
                    }
                    if ((var12 + 1) == var10 && var11 <= var9 && var9 <= var14) {
                        return true;
                    }
                    if (var10 <= var12 && var12 <= var13 && var9 - arg6 == var11 && (this.field3049[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if (var12 - arg6 == var10 && var9 >= var11 && var9 <= var14 && (this.field3049[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 <= var12 && var13 >= var12 && var9 + 1 == var11 && (this.field3049[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var10 && var11 <= var9 && var14 >= var9) {
                        return true;
                    }
                    if (var12 >= var10 && var12 <= var13 && var9 - arg6 == var11) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var12 - arg6 == var10 && var11 <= var9 && var14 >= var9) {
                        return true;
                    }
                    if (var10 <= var12 && var13 >= var12 && (var9 + 1) == var11 && (this.field3049[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var10 && var11 <= var9 && var9 <= var14 && (this.field3049[var10][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 <= var12 && var12 <= var13 && (var9 - arg6) == var11) {
                        return true;
                    }
                }
            }
            if (arg1 == 9) {
                if (var12 >= var10 && var12 <= var13 && (var9 + 1) == var11 && (this.field3049[var12][var11] & 0x2C0120) == 0) {
                    return true;
                }
                if (var12 >= var10 && var12 <= var13 && (var9 - arg6) == var11 && (this.field3049[var12][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if ((var12 - arg6) == var10 && var11 <= var9 && var9 <= var14 && (this.field3049[var13][var9] & 0x2C0108) == 0) {
                    return true;
                }
                if ((var12 + 1) == var10 && var11 <= var9 && var14 >= var9 && (this.field3049[var10][var9] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return arg3 != 2883842;
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IIIIIIIII)Z", line = 461)
    public final boolean method1346(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3058++;
        if (arg4 > 1) {
            return class80.method581(arg1, arg3, arg8, arg6, arg4, arg7, arg4, 32660, arg5) ? true : this.method1352(arg1, arg4, arg5, arg4, arg2, arg8, arg7, -25945, arg6, arg3);
        }
        int var10 = arg6 + arg7 - 1;
        int var11 = arg8 + arg1 - 1;
        if (arg6 <= arg3 && arg3 <= var10 && arg5 >= arg8 && arg5 <= var11) {
            return true;
        } else if (arg0 != -4794) {
            return true;
        } else if ((arg6 - 1) == arg3 && arg8 <= arg5 && var11 >= arg5 && (this.field3049[arg3 - this.field3063][arg5 - this.field3052] & 0x8) == 0 && (arg2 & 0x8) == 0) {
            return true;
        } else if ((var10 + 1) == arg3 && arg5 >= arg8 && arg5 <= var11 && (this.field3049[arg3 - this.field3063][arg5 - this.field3052] & 0x80) == 0 && (arg2 & 0x2) == 0) {
            return true;
        } else if ((arg8 - 1) == arg5 && arg6 <= arg3 && var10 >= arg3 && (this.field3049[arg3 - this.field3063][arg5 - this.field3052] & 0x2) == 0 && (arg2 & 0x4) == 0) {
            return true;
        } else {
            return var11 + 1 == arg5 && arg3 >= arg6 && arg3 <= var10 && (this.field3049[arg3 - this.field3063][arg5 - this.field3052] & 0x20) == 0 && (arg2 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IBI)V", line = 504)
    public final void method1347(int arg0, byte arg1, int arg2) {
        int var4 = arg0 - this.field3052;
        field3048++;
        if (arg1 != -96) {
            this.method1357(true, true, -6, 44, -117, -82, -105);
        }
        int var5 = arg2 - this.field3063;
        this.field3049[var5][var4] = class678.method3817(this.field3049[var5][var4], 2097152);
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(III)V", line = 519)
    public final void method1348(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field3063;
        field3053++;
        int var5 = arg0 - this.field3052;
        this.field3049[var4][var5] = class665.method3759(this.field3049[var4][var5], arg1);
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IZIBIIZ)V", line = 530)
    public final void method1349(int arg0, boolean arg1, int arg2, byte arg3, int arg4, int arg5, boolean arg6) {
        int var8 = arg5 - this.field3063;
        field3054++;
        int var9 = arg2 - this.field3052;
        if (arg4 == 0) {
            if (arg0 == 0) {
                this.method1343(var9, arg3 - 48, 128, var8);
                this.method1343(var9, 71, 8, var8 - 1);
            }
            if (arg0 == 1) {
                this.method1343(var9, 99, 2, var8);
                this.method1343(var9 + 1, arg3 + -14, 32, var8);
            }
            if (arg0 == 2) {
                this.method1343(var9, 86, 8, var8);
                this.method1343(var9, 101, 128, var8 + 1);
            }
            if (arg0 == 3) {
                this.method1343(var9, 121, 32, var8);
                this.method1343(var9 - 1, 58, 2, var8);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg0 == 0) {
                this.method1343(var9, 62, 1, var8);
                this.method1343(var9 + 1, 111, 16, var8 - 1);
            }
            if (arg0 == 1) {
                this.method1343(var9, 117, 4, var8);
                this.method1343(var9 + 1, 66, 64, var8 + 1);
            }
            if (arg0 == 2) {
                this.method1343(var9, 122, 16, var8);
                this.method1343(var9 - 1, 109, 1, var8 + 1);
            }
            if (arg0 == 3) {
                this.method1343(var9, 121, 64, var8);
                this.method1343(var9 - 1, arg3 + -13, 4, var8 - 1);
            }
        }
        if (arg4 == 2) {
            if (arg0 == 0) {
                this.method1343(var9, 87, 130, var8);
                this.method1343(var9, 116, 8, var8 - 1);
                this.method1343(var9 + 1, arg3 + -26, 32, var8);
            }
            if (arg0 == 1) {
                this.method1343(var9, 110, 10, var8);
                this.method1343(var9 + 1, arg3 + -33, 32, var8);
                this.method1343(var9, 54, 128, var8 + 1);
            }
            if (arg0 == 2) {
                this.method1343(var9, 117, 40, var8);
                this.method1343(var9, arg3 ^ 0x50, 128, var8 + 1);
                this.method1343(var9 - 1, arg3 ^ 0x26, 2, var8);
            }
            if (arg0 == 3) {
                this.method1343(var9, 63, 160, var8);
                this.method1343(var9 - 1, 64, 2, var8);
                this.method1343(var9, 94, 8, var8 - 1);
            }
        }
        if (arg3 != 102) {
            this.method1352(20, -5, 108, -82, -60, -27, -36, -46, -78, -91);
        }
        if (arg1) {
            if (arg4 == 0) {
                if (arg0 == 0) {
                    this.method1343(var9, 55, 65536, var8);
                    this.method1343(var9, 64, 4096, var8 - 1);
                }
                if (arg0 == 1) {
                    this.method1343(var9, 116, 1024, var8);
                    this.method1343(var9 + 1, 112, 16384, var8);
                }
                if (arg0 == 2) {
                    this.method1343(var9, 109, 4096, var8);
                    this.method1343(var9, 104, 65536, var8 + 1);
                }
                if (arg0 == 3) {
                    this.method1343(var9, 99, 16384, var8);
                    this.method1343(var9 - 1, 98, 1024, var8);
                }
            }
            if (arg4 == 1 || arg4 == 3) {
                if (arg0 == 0) {
                    this.method1343(var9, 66, 512, var8);
                    this.method1343(var9 + 1, 122, 8192, var8 - 1);
                }
                if (arg0 == 1) {
                    this.method1343(var9, 87, 2048, var8);
                    this.method1343(var9 + 1, 112, 32768, var8 + 1);
                }
                if (arg0 == 2) {
                    this.method1343(var9, 95, 8192, var8);
                    this.method1343(var9 - 1, arg3 + 5, 512, var8 + 1);
                }
                if (arg0 == 3) {
                    this.method1343(var9, 60, 32768, var8);
                    this.method1343(var9 - 1, 58, 2048, var8 - 1);
                }
            }
            if (arg4 == 2) {
                if (arg0 == 0) {
                    this.method1343(var9, arg3 ^ 0x5F, 66560, var8);
                    this.method1343(var9, 60, 4096, var8 - 1);
                    this.method1343(var9 + 1, 92, 16384, var8);
                }
                if (arg0 == 1) {
                    this.method1343(var9, 79, 5120, var8);
                    this.method1343(var9 + 1, 109, 16384, var8);
                    this.method1343(var9, 69, 65536, var8 + 1);
                }
                if (arg0 == 2) {
                    this.method1343(var9, 62, 20480, var8);
                    this.method1343(var9, 57, 65536, var8 + 1);
                    this.method1343(var9 - 1, 126, 1024, var8);
                }
                if (arg0 == 3) {
                    this.method1343(var9, 78, 81920, var8);
                    this.method1343(var9 - 1, 91, 1024, var8);
                    this.method1343(var9, 95, 4096, var8 - 1);
                }
            }
        }
        if (!arg6) {
            return;
        }
        if (arg4 == 0) {
            if (arg0 == 0) {
                this.method1343(var9, arg3 ^ 0x5F, 536870912, var8);
                this.method1343(var9, arg3 - 6, 33554432, var8 - 1);
            }
            if (arg0 == 1) {
                this.method1343(var9, 57, 8388608, var8);
                this.method1343(var9 + 1, 107, 134217728, var8);
            }
            if (arg0 == 2) {
                this.method1343(var9, arg3 - 11, 33554432, var8);
                this.method1343(var9, 78, 536870912, var8 + 1);
            }
            if (arg0 == 3) {
                this.method1343(var9, 124, 134217728, var8);
                this.method1343(var9 - 1, 81, 8388608, var8);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg0 == 0) {
                this.method1343(var9, arg3 ^ 0x1F, 4194304, var8);
                this.method1343(var9 + 1, 67, 67108864, var8 - 1);
            }
            if (arg0 == 1) {
                this.method1343(var9, 118, 16777216, var8);
                this.method1343(var9 + 1, 85, 268435456, var8 + 1);
            }
            if (arg0 == 2) {
                this.method1343(var9, 72, 67108864, var8);
                this.method1343(var9 - 1, 80, 4194304, var8 + 1);
            }
            if (arg0 == 3) {
                this.method1343(var9, 62, 268435456, var8);
                this.method1343(var9 - 1, arg3 + 12, 16777216, var8 - 1);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method1343(var9, arg3 - 34, 545259520, var8);
            this.method1343(var9, 80, 33554432, var8 - 1);
            this.method1343(var9 + 1, arg3 ^ 0x17, 134217728, var8);
        }
        if (arg0 == 1) {
            this.method1343(var9, 117, 41943040, var8);
            this.method1343(var9 + 1, 73, 134217728, var8);
            this.method1343(var9, 122, 536870912, var8 + 1);
        }
        if (arg0 == 2) {
            this.method1343(var9, arg3 - 28, 167772160, var8);
            this.method1343(var9, 110, 536870912, var8 + 1);
            this.method1343(var9 - 1, 124, 8388608, var8);
        }
        if (arg0 == 3) {
            this.method1343(var9, 83, 671088640, var8);
            this.method1343(var9 - 1, 79, 8388608, var8);
            this.method1343(var9, 67, 33554432, var8 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IIIB)V", line = 840)
    private final void method1350(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != 21) {
            this.field3060 = 38;
        }
        this.field3049[arg1][arg0] = class665.method3759(this.field3049[arg1][arg0], ~arg2);
        field3064++;
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(I)V", line = 873)
    public static void method1351(int arg0) {
        field3055 = null;
        field3059 = null;
        if (arg0 != 17860) {
            field3055 = null;
        }
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IIIIIIIIII)Z", line = 890)
    public final boolean method1352(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3050++;
        if (arg7 != -25945) {
            return false;
        }
        int var11 = arg3 + arg9;
        int var12 = arg1 + arg2;
        int var13 = arg6 + arg8;
        int var14 = arg0 + arg5;
        if (arg9 == var13 && (arg4 & 0x2) == 0) {
            int var15 = arg2 > arg5 ? arg2 : arg5;
            int var16 = var14 > var12 ? var12 : var14;
            while (var15 < var16) {
                if ((this.field3049[var13 - this.field3063 - 1][var15 - this.field3052] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg8 == var11 && (arg4 & 0x8) == 0) {
            int var17 = arg5 < arg2 ? arg2 : arg5;
            int var18 = var14 <= var12 ? var14 : var12;
            while (var17 < var18) {
                if ((this.field3049[arg8 - this.field3063][var17 - this.field3052] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg2 == var14 && (arg4 & 0x1) == 0) {
            int var19 = arg8 >= arg9 ? arg8 : arg9;
            int var20 = var13 <= var11 ? var13 : var11;
            while (var19 < var20) {
                if ((this.field3049[var19 - this.field3063][var14 - this.field3052 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg5 == var12 && (arg4 & 0x4) == 0) {
            int var21 = arg8 >= arg9 ? arg8 : arg9;
            int var22 = var11 >= var13 ? var13 : var11;
            while (var22 > var21) {
                if ((this.field3049[var21 - this.field3063][arg5 - this.field3052] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IIIIIIBI)Z", line = 988)
    public final boolean method1353(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        field3062++;
        if (arg1 == 1) {
            if (arg0 == arg3 && arg2 == arg5) {
                return true;
            }
        } else if (arg3 <= arg0 && arg3 + arg1 - 1 >= arg0 && arg2 <= arg2 && arg2 <= (arg2 - (1 - arg1))) {
            return true;
        }
        int var9 = -98 / ((-arg6 - 85) / 32);
        int var10 = arg0 - this.field3063;
        int var11 = arg3 - this.field3063;
        int var12 = arg5 - this.field3052;
        int var13 = arg2 - this.field3052;
        if (arg1 == 1) {
            if (arg4 == 6 || arg4 == 7) {
                if (arg4 == 7) {
                    arg7 = arg7 + 2 & 0x3;
                }
                if (arg7 == 0) {
                    if ((var10 + 1) == var11 && var12 == var13 && (this.field3049[var11][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var13 - 1) == var12 && (this.field3049[var11][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if ((var10 - 1) == var11 && var12 == var13 && (this.field3049[var11][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var13 - 1 == var12 && (this.field3049[var11][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if (var10 - 1 == var11 && var12 == var13 && (this.field3049[var11][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var13 + 1) == var12 && (this.field3049[var11][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if (var10 + 1 == var11 && var12 == var13 && (this.field3049[var11][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var13 + 1 == var12 && (this.field3049[var11][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 8) {
                if (var10 == var11 && (var13 + 1) == var12 && (this.field3049[var11][var12] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var11 && (var13 - 1) == var12 && (this.field3049[var11][var12] & 0x2) == 0) {
                    return true;
                }
                if ((var10 - 1) == var11 && var12 == var13 && (this.field3049[var11][var12] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var11 && var12 == var13 && (this.field3049[var11][var12] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var14 = var11 - (1 - arg1);
            int var15 = var12 + arg1 - 1;
            if (arg4 == 6 || arg4 == 7) {
                if (arg4 == 7) {
                    arg7 = arg7 + 2 & 0x3;
                }
                if (arg7 == 0) {
                    if (var10 + 1 == var11 && var12 <= var13 && var13 <= var15 && (this.field3049[var11][var13] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var10 <= var14 && var13 - arg1 == var12 && (this.field3049[var10][var15] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if (var10 - arg1 == var11 && var12 <= var13 && var15 >= var13 && (this.field3049[var14][var13] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var10 <= var14 && var13 - arg1 == var12 && (this.field3049[var10][var15] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if (var10 - arg1 == var11 && var12 <= var13 && var15 >= var13 && (this.field3049[var14][var13] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var10 <= var14 && (var13 + 1) == var12 && (this.field3049[var10][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if ((var10 + 1) == var11 && var13 >= var12 && var15 >= var13 && (this.field3049[var11][var13] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var14 >= var10 && (var13 + 1) == var12 && (this.field3049[var10][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 8) {
                if (var11 <= var10 && var14 >= var10 && var13 + 1 == var12 && (this.field3049[var10][var12] & 0x20) == 0) {
                    return true;
                }
                if (var10 >= var11 && var14 >= var10 && var13 - arg1 == var12 && (this.field3049[var10][var15] & 0x2) == 0) {
                    return true;
                }
                if (var10 - arg1 == var11 && var12 <= var13 && var15 >= var13 && (this.field3049[var14][var13] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var11 && var13 >= var12 && var15 >= var13 && (this.field3049[var11][var13] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(B)V", line = 1177)
    public final void method1354(byte arg0) {
        field3051++;
        if (arg0 <= 54) {
            return;
        }
        for (int var2 = 0; var2 < this.field3060; var2++) {
            for (int var3 = 0; var3 < this.field3061; var3++) {
                if (var2 == 0 || var3 == 0 || (this.field3060 - 5) <= var2 || var3 >= this.field3061 - 5) {
                    this.field3049[var2][var3] = -1;
                } else {
                    this.field3049[var2][var3] = 2097152;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nfa", name = "b", descriptor = "(III)V", line = 1210)
    public final void method1355(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field3052;
        field3067++;
        int var5 = arg1 - this.field3063;
        this.field3049[var5][var4] = class665.method3759(this.field3049[var5][var4], arg2);
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IZZZIII)V", line = 1221)
    public final void method1356(int arg0, boolean arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6) {
        if (arg2) {
            return;
        }
        int var8 = arg5 - this.field3052;
        int var9 = arg4 - this.field3063;
        field3057++;
        if (arg6 == 0) {
            if (arg0 == 0) {
                this.method1350(var8, var9, 128, (byte) 21);
                this.method1350(var8, var9 - 1, 8, (byte) 21);
            }
            if (arg0 == 1) {
                this.method1350(var8, var9, 2, (byte) 21);
                this.method1350(var8 + 1, var9, 32, (byte) 21);
            }
            if (arg0 == 2) {
                this.method1350(var8, var9, 8, (byte) 21);
                this.method1350(var8, var9 + 1, 128, (byte) 21);
            }
            if (arg0 == 3) {
                this.method1350(var8, var9, 32, (byte) 21);
                this.method1350(var8 - 1, var9, 2, (byte) 21);
            }
        }
        if (arg6 == 1 || arg6 == 3) {
            if (arg0 == 0) {
                this.method1350(var8, var9, 1, (byte) 21);
                this.method1350(var8 + 1, var9 + -1, 16, (byte) 21);
            }
            if (arg0 == 1) {
                this.method1350(var8, var9, 4, (byte) 21);
                this.method1350(var8 + 1, var9 + 1, 64, (byte) 21);
            }
            if (arg0 == 2) {
                this.method1350(var8, var9, 16, (byte) 21);
                this.method1350(var8 - 1, var9 + 1, 1, (byte) 21);
            }
            if (arg0 == 3) {
                this.method1350(var8, var9, 64, (byte) 21);
                this.method1350(var8 - 1, var9 + -1, 4, (byte) 21);
            }
        }
        if (arg6 == 2) {
            if (arg0 == 0) {
                this.method1350(var8, var9, 130, (byte) 21);
                this.method1350(var8, var9 - 1, 8, (byte) 21);
                this.method1350(var8 + 1, var9, 32, (byte) 21);
            }
            if (arg0 == 1) {
                this.method1350(var8, var9, 10, (byte) 21);
                this.method1350(var8 + 1, var9, 32, (byte) 21);
                this.method1350(var8, var9 + 1, 128, (byte) 21);
            }
            if (arg0 == 2) {
                this.method1350(var8, var9, 40, (byte) 21);
                this.method1350(var8, var9 + 1, 128, (byte) 21);
                this.method1350(var8 - 1, var9, 2, (byte) 21);
            }
            if (arg0 == 3) {
                this.method1350(var8, var9, 160, (byte) 21);
                this.method1350(var8 - 1, var9, 2, (byte) 21);
                this.method1350(var8, var9 - 1, 8, (byte) 21);
            }
        }
        if (arg1) {
            if (arg6 == 0) {
                if (arg0 == 0) {
                    this.method1350(var8, var9, 65536, (byte) 21);
                    this.method1350(var8, var9 - 1, 4096, (byte) 21);
                }
                if (arg0 == 1) {
                    this.method1350(var8, var9, 1024, (byte) 21);
                    this.method1350(var8 + 1, var9, 16384, (byte) 21);
                }
                if (arg0 == 2) {
                    this.method1350(var8, var9, 4096, (byte) 21);
                    this.method1350(var8, var9 + 1, 65536, (byte) 21);
                }
                if (arg0 == 3) {
                    this.method1350(var8, var9, 16384, (byte) 21);
                    this.method1350(var8 - 1, var9, 1024, (byte) 21);
                }
            }
            if (arg6 == 1 || arg6 == 3) {
                if (arg0 == 0) {
                    this.method1350(var8, var9, 512, (byte) 21);
                    this.method1350(var8 + 1, var9 - 1, 8192, (byte) 21);
                }
                if (arg0 == 1) {
                    this.method1350(var8, var9, 2048, (byte) 21);
                    this.method1350(var8 + 1, var9 - -1, 32768, (byte) 21);
                }
                if (arg0 == 2) {
                    this.method1350(var8, var9, 8192, (byte) 21);
                    this.method1350(var8 - 1, var9 + 1, 512, (byte) 21);
                }
                if (arg0 == 3) {
                    this.method1350(var8, var9, 32768, (byte) 21);
                    this.method1350(var8 - 1, var9 + -1, 2048, (byte) 21);
                }
            }
            if (arg6 == 2) {
                if (arg0 == 0) {
                    this.method1350(var8, var9, 66560, (byte) 21);
                    this.method1350(var8, var9 - 1, 4096, (byte) 21);
                    this.method1350(var8 + 1, var9, 16384, (byte) 21);
                }
                if (arg0 == 1) {
                    this.method1350(var8, var9, 5120, (byte) 21);
                    this.method1350(var8 + 1, var9, 16384, (byte) 21);
                    this.method1350(var8, var9 + 1, 65536, (byte) 21);
                }
                if (arg0 == 2) {
                    this.method1350(var8, var9, 20480, (byte) 21);
                    this.method1350(var8, var9 + 1, 65536, (byte) 21);
                    this.method1350(var8 - 1, var9, 1024, (byte) 21);
                }
                if (arg0 == 3) {
                    this.method1350(var8, var9, 81920, (byte) 21);
                    this.method1350(var8 - 1, var9, 1024, (byte) 21);
                    this.method1350(var8, var9 - 1, 4096, (byte) 21);
                }
            }
        }
        if (!arg3) {
            return;
        }
        if (arg6 == 0) {
            if (arg0 == 0) {
                this.method1350(var8, var9, 536870912, (byte) 21);
                this.method1350(var8, var9 - 1, 33554432, (byte) 21);
            }
            if (arg0 == 1) {
                this.method1350(var8, var9, 8388608, (byte) 21);
                this.method1350(var8 + 1, var9, 134217728, (byte) 21);
            }
            if (arg0 == 2) {
                this.method1350(var8, var9, 33554432, (byte) 21);
                this.method1350(var8, var9 + 1, 536870912, (byte) 21);
            }
            if (arg0 == 3) {
                this.method1350(var8, var9, 134217728, (byte) 21);
                this.method1350(var8 - 1, var9, 8388608, (byte) 21);
            }
        }
        if (arg6 == 1 || arg6 == 3) {
            if (arg0 == 0) {
                this.method1350(var8, var9, 4194304, (byte) 21);
                this.method1350(var8 + 1, var9 + -1, 67108864, (byte) 21);
            }
            if (arg0 == 1) {
                this.method1350(var8, var9, 16777216, (byte) 21);
                this.method1350(var8 + 1, var9 + 1, 268435456, (byte) 21);
            }
            if (arg0 == 2) {
                this.method1350(var8, var9, 67108864, (byte) 21);
                this.method1350(var8 - 1, var9 + 1, 4194304, (byte) 21);
            }
            if (arg0 == 3) {
                this.method1350(var8, var9, 268435456, (byte) 21);
                this.method1350(var8 - 1, var9 + -1, 16777216, (byte) 21);
            }
        }
        if (arg6 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method1350(var8, var9, 545259520, (byte) 21);
            this.method1350(var8, var9 - 1, 33554432, (byte) 21);
            this.method1350(var8 + 1, var9, 134217728, (byte) 21);
        }
        if (arg0 == 1) {
            this.method1350(var8, var9, 41943040, (byte) 21);
            this.method1350(var8 + 1, var9, 134217728, (byte) 21);
            this.method1350(var8, var9 + 1, 536870912, (byte) 21);
        }
        if (arg0 == 2) {
            this.method1350(var8, var9, 167772160, (byte) 21);
            this.method1350(var8, var9 + 1, 536870912, (byte) 21);
            this.method1350(var8 - 1, var9, 8388608, (byte) 21);
        }
        if (arg0 == 3) {
            this.method1350(var8, var9, 671088640, (byte) 21);
            this.method1350(var8 - 1, var9, 8388608, (byte) 21);
            this.method1350(var8, var9 - 1, 33554432, (byte) 21);
            return;
        }
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(ZZIIIII)V", line = 1532)
    public final void method1357(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3056++;
        int var8 = 256;
        if (arg0) {
            var8 |= 0x20000;
        }
        if (arg1) {
            var8 |= 0x40000000;
        }
        int var9 = arg4 - this.field3063;
        if (arg3 != -2276) {
            this.field3061 = -37;
        }
        int var10 = arg6 - this.field3052;
        for (int var11 = var9; var11 < arg2 + var9; var11++) {
            if (var11 >= 0 && this.field3060 > var11) {
                for (int var12 = var10; var12 < arg5 + var10; var12++) {
                    if (var12 >= 0 && this.field3061 > var12) {
                        this.method1343(var12, 112, var8, var11);
                    }
                }
            }
        }
    }
}
