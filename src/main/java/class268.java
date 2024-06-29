import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class268 {

    @OriginalMember(owner = "client!br", name = "e", descriptor = "Ljv;")
    public static class55 field3851 = new class55(4);

    @OriginalMember(owner = "client!br", name = "z", descriptor = "Lrn;")
    public static class174 field3872 = new class174(63, 5);

    @OriginalMember(owner = "client!br", name = "a", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!br", name = "b", descriptor = "I")
    public static int field3848;

    @OriginalMember(owner = "client!br", name = "c", descriptor = "I")
    public static int field3849;

    @OriginalMember(owner = "client!br", name = "d", descriptor = "I")
    public static int field3850;

    @OriginalMember(owner = "client!br", name = "f", descriptor = "I")
    public int field3852;

    @OriginalMember(owner = "client!br", name = "h", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!br", name = "i", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!br", name = "j", descriptor = "I")
    public int field3856;

    @OriginalMember(owner = "client!br", name = "l", descriptor = "I")
    public static int field3858;

    @OriginalMember(owner = "client!br", name = "m", descriptor = "I")
    public static int field3859;

    @OriginalMember(owner = "client!br", name = "n", descriptor = "I")
    public static int field3860;

    @OriginalMember(owner = "client!br", name = "o", descriptor = "I")
    public static int field3861;

    @OriginalMember(owner = "client!br", name = "p", descriptor = "I")
    public int field3862;

    @OriginalMember(owner = "client!br", name = "q", descriptor = "I")
    public static int field3863;

    @OriginalMember(owner = "client!br", name = "r", descriptor = "I")
    public static int field3864;

    @OriginalMember(owner = "client!br", name = "s", descriptor = "I")
    public static int field3865;

    @OriginalMember(owner = "client!br", name = "t", descriptor = "I")
    public static int field3866;

    @OriginalMember(owner = "client!br", name = "u", descriptor = "I")
    public static int field3867;

    @OriginalMember(owner = "client!br", name = "v", descriptor = "I")
    public static int field3868;

    @OriginalMember(owner = "client!br", name = "w", descriptor = "I")
    public int field3869;

    @OriginalMember(owner = "client!br", name = "y", descriptor = "I")
    public static int field3871;

    @OriginalMember(owner = "client!br", name = "k", descriptor = "Lbu;")
    public static class17 field3857;

    @OriginalMember(owner = "client!br", name = "g", descriptor = "[[I")
    public int[][] field3853;

    @OriginalMember(owner = "client!br", name = "x", descriptor = "[[[Liq;")
    public static class429[][][] field3870;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IIBIIIIIII)Z")
    public final boolean method1719(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 <= 99) {
            method1729(106);
        }
        field3860++;
        int var11 = arg5 + arg6;
        int var12 = arg4 + arg7;
        int var13 = arg0 + arg9;
        int var14 = arg3 + arg8;
        if (arg5 == var13 && (arg1 & 0x2) == 0) {
            int var15 = arg7 > arg8 ? arg7 : arg8;
            int var16 = var12 >= var14 ? var14 : var12;
            while (var16 > var15) {
                if ((this.field3853[var13 - (this.field3862 + 1)][var15 - this.field3869] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg0 == var11 && (arg1 & 0x8) == 0) {
            int var17 = arg7 <= arg8 ? arg8 : arg7;
            int var18 = var14 > var12 ? var12 : var14;
            while (var17 < var18) {
                if ((this.field3853[arg0 - this.field3862][var17 - this.field3869] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg7 == var14 && (arg1 & 0x1) == 0) {
            int var19 = arg5 > arg0 ? arg5 : arg0;
            int var20 = var11 < var13 ? var11 : var13;
            while (var20 > var19) {
                if ((this.field3853[var19 - this.field3862][var14 - this.field3869 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg8 == var12 && (arg1 & 0x4) == 0) {
            int var21 = arg0 < arg5 ? arg5 : arg0;
            int var22 = var13 > var11 ? var11 : var13;
            while (var22 > var21) {
                if ((this.field3853[var21 - this.field3862][arg8 - this.field3869] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IIB)V")
    public final void method1720(int arg0, int arg1, byte arg2) {
        field3850++;
        int var4 = arg1 - this.field3869;
        if (arg2 != 105) {
            this.method1730(89, 64, -84, 103);
        }
        int var5 = arg0 - this.field3862;
        this.field3853[var5][var4] = class207.method1405(this.field3853[var5][var4], -262145);
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(III)V")
    public final void method1721(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field3862;
        int var5 = arg2 - this.field3869;
        int var6 = -73 % ((arg0 - 10) / 47);
        field3859++;
        this.field3853[var4][var5] = class207.method1405(this.field3853[var4][var5], -2097153);
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(ZIIIIIII)Z")
    public final boolean method1722(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3867++;
        if (!arg0) {
            field3857 = null;
        }
        if (arg2 == 1) {
            if (arg6 == arg7 && arg3 == arg4) {
                return true;
            }
        } else if (arg7 >= arg6 && (arg6 + arg2 - 1) >= arg7 && arg3 <= arg3 && arg3 <= arg2 + arg3 - 1) {
            return true;
        }
        int var9 = arg4 - this.field3869;
        int var10 = arg7 - this.field3862;
        int var11 = arg3 - this.field3869;
        int var12 = arg6 - this.field3862;
        if (arg2 == 1) {
            if (arg5 == 6 || arg5 == 7) {
                if (arg5 == 7) {
                    arg1 = arg1 + 2 & 0x3;
                }
                if (arg1 == 0) {
                    if (var10 + 1 == var12 && var9 == var11 && (this.field3853[var12][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var11 - 1) == var9 && (this.field3853[var12][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if ((var10 - 1) == var12 && var9 == var11 && (this.field3853[var12][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var11 - 1 == var9 && (this.field3853[var12][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var10 - 1 == var12 && var9 == var11 && (this.field3853[var12][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var11 + 1 == var9 && (this.field3853[var12][var9] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if ((var10 + 1) == var12 && var9 == var11 && (this.field3853[var12][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var11 + 1 == var9 && (this.field3853[var12][var9] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 8) {
                if (var10 == var12 && (var11 + 1) == var9 && (this.field3853[var12][var9] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var12 && (var11 - 1) == var9 && (this.field3853[var12][var9] & 0x2) == 0) {
                    return true;
                }
                if (var10 - 1 == var12 && var9 == var11 && (this.field3853[var12][var9] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var12 && var9 == var11 && (this.field3853[var12][var9] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg2 + var12 - 1;
            int var14 = arg2 + var9 - 1;
            if (arg5 == 6 || arg5 == 7) {
                if (arg5 == 7) {
                    arg1 = arg1 + 2 & 0x3;
                }
                if (arg1 == 0) {
                    if ((var10 + 1) == var12 && var9 <= var11 && var14 >= var11 && (this.field3853[var12][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 >= var12 && var10 <= var13 && (var11 - arg2) == var9 && (this.field3853[var10][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if ((var10 - arg2) == var12 && var11 >= var9 && var14 >= var11 && (this.field3853[var13][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 <= var10 && var13 >= var10 && var11 - arg2 == var9 && (this.field3853[var10][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if ((var10 - arg2) == var12 && var9 <= var11 && var14 >= var11 && (this.field3853[var13][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 >= var12 && var13 >= var10 && var11 + 1 == var9 && (this.field3853[var10][var9] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if ((var10 + 1) == var12 && var9 <= var11 && var14 >= var11 && (this.field3853[var12][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 >= var12 && var10 <= var13 && var11 + 1 == var9 && (this.field3853[var10][var9] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 8) {
                if (var10 >= var12 && var10 <= var13 && var11 + 1 == var9 && (this.field3853[var10][var9] & 0x20) == 0) {
                    return true;
                }
                if (var12 <= var10 && var13 >= var10 && var11 - arg2 == var9 && (this.field3853[var10][var14] & 0x2) == 0) {
                    return true;
                }
                if ((var10 - arg2) == var12 && var11 >= var9 && var14 >= var11 && (this.field3853[var13][var11] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var12 && var9 <= var11 && var11 <= var14 && (this.field3853[var12][var11] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method1723(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3868++;
        if (arg3 == 1) {
            if (arg1 == arg4 && arg2 == arg7) {
                return true;
            }
        } else if (arg4 <= arg1 && arg3 + arg4 - 1 >= arg1 && arg7 >= arg7 && (arg7 + arg3 - 1) >= arg7) {
            return true;
        }
        if (arg5 != 0) {
            method1729(127);
        }
        int var9 = arg7 - this.field3869;
        int var10 = arg4 - this.field3862;
        int var11 = arg2 - this.field3869;
        int var12 = arg1 - this.field3862;
        if (arg3 == 1) {
            if (arg0 == 0) {
                if (arg6 == 0) {
                    if (var12 - 1 == var10 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && (var9 + 1) == var11 && (this.field3853[var10][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var9 - 1) == var11 && (this.field3853[var10][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var10 == var12 && var9 + 1 == var11) {
                        return true;
                    }
                    if (var12 - 1 == var10 && var9 == var11 && (this.field3853[var10][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var10 && var9 == var11 && (this.field3853[var10][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if ((var12 + 1) == var10 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && (var9 + 1) == var11 && (this.field3853[var10][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var9 - 1) == var11 && (this.field3853[var10][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var10 == var12 && var9 - 1 == var11) {
                        return true;
                    }
                    if (var12 - 1 == var10 && var9 == var11 && (this.field3853[var10][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var10 && var9 == var11 && (this.field3853[var10][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 2) {
                if (arg6 == 0) {
                    if ((var12 - 1) == var10 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && (var9 + 1) == var11) {
                        return true;
                    }
                    if (var12 + 1 == var10 && var9 == var11 && (this.field3853[var10][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var9 - 1 == var11 && (this.field3853[var10][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var12 - 1 == var10 && var9 == var11 && (this.field3853[var10][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var9 + 1 == var11) {
                        return true;
                    }
                    if ((var12 + 1) == var10 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && var9 - 1 == var11 && (this.field3853[var10][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if (var12 - 1 == var10 && var9 == var11 && (this.field3853[var10][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var9 + 1 == var11 && (this.field3853[var10][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var10 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && (var9 - 1) == var11) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var12 - 1 == var10 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && (var9 + 1) == var11 && (this.field3853[var10][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var10 && var9 == var11 && (this.field3853[var10][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var9 - 1) == var11) {
                        return true;
                    }
                }
            }
            if (arg0 == 9) {
                if (var10 == var12 && var9 + 1 == var11 && (this.field3853[var10][var11] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var12 && (var9 - 1) == var11 && (this.field3853[var10][var11] & 0x2) == 0) {
                    return true;
                }
                if (var12 - 1 == var10 && var9 == var11 && (this.field3853[var10][var11] & 0x8) == 0) {
                    return true;
                }
                if ((var12 + 1) == var10 && var9 == var11 && (this.field3853[var10][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var10 + arg3 - 1;
            int var14 = arg3 + var11 - 1;
            if (arg0 == 0) {
                if (arg6 == 0) {
                    if (var12 - arg3 == var10 && var11 <= var9 && var14 >= var9) {
                        return true;
                    }
                    if (var10 <= var12 && var12 <= var13 && (var9 + 1) == var11 && (this.field3853[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 <= var12 && var12 <= var13 && var9 - arg3 == var11 && (this.field3853[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var10 <= var12 && var12 <= var13 && (var9 + 1) == var11) {
                        return true;
                    }
                    if (var12 - arg3 == var10 && var11 <= var9 && var14 >= var9 && (this.field3853[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var10 && var9 >= var11 && var9 <= var14 && (this.field3853[var10][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if ((var12 + 1) == var10 && var9 >= var11 && var14 >= var9) {
                        return true;
                    }
                    if (var12 >= var10 && var12 <= var13 && (var9 + 1) == var11 && (this.field3853[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 >= var10 && var13 >= var12 && var9 - arg3 == var11 && (this.field3853[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var12 >= var10 && var13 >= var12 && (var9 - arg3) == var11) {
                        return true;
                    }
                    if (var12 - arg3 == var10 && var9 >= var11 && var9 <= var14 && (this.field3853[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var10 && var9 >= var11 && var9 <= var14 && (this.field3853[var10][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 2) {
                if (arg6 == 0) {
                    if ((var12 - arg3) == var10 && var9 >= var11 && var14 >= var9) {
                        return true;
                    }
                    if (var12 >= var10 && var12 <= var13 && (var9 + 1) == var11) {
                        return true;
                    }
                    if ((var12 + 1) == var10 && var9 >= var11 && var9 <= var14 && (this.field3853[var10][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 <= var12 && var13 >= var12 && (var9 - arg3) == var11 && (this.field3853[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var12 - arg3 == var10 && var11 <= var9 && var9 <= var14 && (this.field3853[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 >= var10 && var13 >= var12 && var9 + 1 == var11) {
                        return true;
                    }
                    if (var12 + 1 == var10 && var11 <= var9 && var9 <= var14) {
                        return true;
                    }
                    if (var12 >= var10 && var13 >= var12 && var9 - arg3 == var11 && (this.field3853[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if (var12 - arg3 == var10 && var11 <= var9 && var14 >= var9 && (this.field3853[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 >= var10 && var12 <= var13 && var9 + 1 == var11 && (this.field3853[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var10 && var11 <= var9 && var14 >= var9) {
                        return true;
                    }
                    if (var12 >= var10 && var13 >= var12 && var9 - arg3 == var11) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if ((var12 - arg3) == var10 && var11 <= var9 && var9 <= var14) {
                        return true;
                    }
                    if (var12 >= var10 && var12 <= var13 && var9 + 1 == var11 && (this.field3853[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var10 && var9 >= var11 && var14 >= var9 && (this.field3853[var10][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var12 >= var10 && var13 >= var12 && var9 - arg3 == var11) {
                        return true;
                    }
                }
            }
            if (arg0 == 9) {
                if (var10 <= var12 && var13 >= var12 && var9 + 1 == var11 && (this.field3853[var12][var11] & 0x2C0120) == 0) {
                    return true;
                }
                if (var10 <= var12 && var12 <= var13 && var9 - arg3 == var11 && (this.field3853[var12][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if (var12 - arg3 == var10 && var11 <= var9 && var14 >= var9 && (this.field3853[var13][var9] & 0x2C0108) == 0) {
                    return true;
                }
                if ((var12 + 1) == var10 && var11 <= var9 && var9 <= var14 && (this.field3853[var10][var9] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IIIZIZZ)V")
    public final void method1724(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5, boolean arg6) {
        int var8 = arg4 - this.field3869;
        field3849++;
        int var9 = arg1 - this.field3862;
        if (arg2 == 0) {
            if (arg0 == 0) {
                this.method1728(128, -29376, var8, var9);
                this.method1728(8, -29376, var8, var9 - 1);
            }
            if (arg0 == 1) {
                this.method1728(2, -29376, var8, var9);
                this.method1728(32, -29376, var8 + 1, var9);
            }
            if (arg0 == 2) {
                this.method1728(8, -29376, var8, var9);
                this.method1728(128, -29376, var8, var9 + 1);
            }
            if (arg0 == 3) {
                this.method1728(32, -29376, var8, var9);
                this.method1728(2, -29376, var8 - 1, var9);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg0 == 0) {
                this.method1728(1, -29376, var8, var9);
                this.method1728(16, -29376, var8 + 1, var9 + -1);
            }
            if (arg0 == 1) {
                this.method1728(4, -29376, var8, var9);
                this.method1728(64, -29376, var8 + 1, var9 + 1);
            }
            if (arg0 == 2) {
                this.method1728(16, -29376, var8, var9);
                this.method1728(1, -29376, var8 - 1, var9 - -1);
            }
            if (arg0 == 3) {
                this.method1728(64, -29376, var8, var9);
                this.method1728(4, -29376, var8 - 1, var9 + -1);
            }
        }
        if (arg2 == 2) {
            if (arg0 == 0) {
                this.method1728(130, -29376, var8, var9);
                this.method1728(8, -29376, var8, var9 - 1);
                this.method1728(32, -29376, var8 + 1, var9);
            }
            if (arg0 == 1) {
                this.method1728(10, -29376, var8, var9);
                this.method1728(32, -29376, var8 + 1, var9);
                this.method1728(128, -29376, var8, var9 + 1);
            }
            if (arg0 == 2) {
                this.method1728(40, -29376, var8, var9);
                this.method1728(128, -29376, var8, var9 + 1);
                this.method1728(2, -29376, var8 - 1, var9);
            }
            if (arg0 == 3) {
                this.method1728(160, -29376, var8, var9);
                this.method1728(2, -29376, var8 - 1, var9);
                this.method1728(8, -29376, var8, var9 - 1);
            }
        }
        if (arg5) {
            if (arg2 == 0) {
                if (arg0 == 0) {
                    this.method1728(65536, -29376, var8, var9);
                    this.method1728(4096, -29376, var8, var9 - 1);
                }
                if (arg0 == 1) {
                    this.method1728(1024, -29376, var8, var9);
                    this.method1728(16384, -29376, var8 + 1, var9);
                }
                if (arg0 == 2) {
                    this.method1728(4096, -29376, var8, var9);
                    this.method1728(65536, -29376, var8, var9 + 1);
                }
                if (arg0 == 3) {
                    this.method1728(16384, -29376, var8, var9);
                    this.method1728(1024, -29376, var8 - 1, var9);
                }
            }
            if (arg2 == 1 || arg2 == 3) {
                if (arg0 == 0) {
                    this.method1728(512, -29376, var8, var9);
                    this.method1728(8192, -29376, var8 + 1, var9 + -1);
                }
                if (arg0 == 1) {
                    this.method1728(2048, -29376, var8, var9);
                    this.method1728(32768, -29376, var8 + 1, var9 - -1);
                }
                if (arg0 == 2) {
                    this.method1728(8192, -29376, var8, var9);
                    this.method1728(512, -29376, var8 - 1, var9 + 1);
                }
                if (arg0 == 3) {
                    this.method1728(32768, -29376, var8, var9);
                    this.method1728(2048, -29376, var8 - 1, var9 + -1);
                }
            }
            if (arg2 == 2) {
                if (arg0 == 0) {
                    this.method1728(66560, -29376, var8, var9);
                    this.method1728(4096, -29376, var8, var9 - 1);
                    this.method1728(16384, -29376, var8 + 1, var9);
                }
                if (arg0 == 1) {
                    this.method1728(5120, -29376, var8, var9);
                    this.method1728(16384, -29376, var8 + 1, var9);
                    this.method1728(65536, -29376, var8, var9 + 1);
                }
                if (arg0 == 2) {
                    this.method1728(20480, -29376, var8, var9);
                    this.method1728(65536, -29376, var8, var9 + 1);
                    this.method1728(1024, -29376, var8 - 1, var9);
                }
                if (arg0 == 3) {
                    this.method1728(81920, -29376, var8, var9);
                    this.method1728(1024, -29376, var8 - 1, var9);
                    this.method1728(4096, -29376, var8, var9 - 1);
                }
            }
        }
        if (arg3) {
            if (arg2 == 0) {
                if (arg0 == 0) {
                    this.method1728(536870912, -29376, var8, var9);
                    this.method1728(33554432, -29376, var8, var9 - 1);
                }
                if (arg0 == 1) {
                    this.method1728(8388608, -29376, var8, var9);
                    this.method1728(134217728, -29376, var8 + 1, var9);
                }
                if (arg0 == 2) {
                    this.method1728(33554432, -29376, var8, var9);
                    this.method1728(536870912, -29376, var8, var9 + 1);
                }
                if (arg0 == 3) {
                    this.method1728(134217728, -29376, var8, var9);
                    this.method1728(8388608, -29376, var8 - 1, var9);
                }
            }
            if (arg2 == 1 || arg2 == 3) {
                if (arg0 == 0) {
                    this.method1728(4194304, -29376, var8, var9);
                    this.method1728(67108864, -29376, var8 + 1, var9 - 1);
                }
                if (arg0 == 1) {
                    this.method1728(16777216, -29376, var8, var9);
                    this.method1728(268435456, -29376, var8 + 1, var9 - -1);
                }
                if (arg0 == 2) {
                    this.method1728(67108864, -29376, var8, var9);
                    this.method1728(4194304, -29376, var8 - 1, var9 + 1);
                }
                if (arg0 == 3) {
                    this.method1728(268435456, -29376, var8, var9);
                    this.method1728(16777216, -29376, var8 - 1, var9 + -1);
                }
            }
            if (arg2 == 2) {
                if (arg0 == 0) {
                    this.method1728(545259520, -29376, var8, var9);
                    this.method1728(33554432, -29376, var8, var9 - 1);
                    this.method1728(134217728, -29376, var8 + 1, var9);
                }
                if (arg0 == 1) {
                    this.method1728(41943040, -29376, var8, var9);
                    this.method1728(134217728, -29376, var8 + 1, var9);
                    this.method1728(536870912, -29376, var8, var9 + 1);
                }
                if (arg0 == 2) {
                    this.method1728(167772160, -29376, var8, var9);
                    this.method1728(536870912, -29376, var8, var9 + 1);
                    this.method1728(8388608, -29376, var8 - 1, var9);
                }
                if (arg0 == 3) {
                    this.method1728(671088640, -29376, var8, var9);
                    this.method1728(8388608, -29376, var8 - 1, var9);
                    this.method1728(33554432, -29376, var8, var9 - 1);
                }
            }
        }
        if (arg6) {
            this.method1724(124, 34, 0, true, -14, true, false);
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IIIIIZZ)V")
    public final void method1725(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        int var8 = arg2 - this.field3869;
        int var9 = arg1 - this.field3862;
        field3847++;
        if (arg3 == 0) {
            if (arg4 == 0) {
                this.method1730(98, 128, var8, var9);
                this.method1730(127, 8, var8, var9 - 1);
            }
            if (arg4 == 1) {
                this.method1730(110, 2, var8, var9);
                this.method1730(102, 32, var8 + 1, var9);
            }
            if (arg4 == 2) {
                this.method1730(99, 8, var8, var9);
                this.method1730(arg0 ^ 0xFFFFA003, 128, var8, var9 + 1);
            }
            if (arg4 == 3) {
                this.method1730(122, 32, var8, var9);
                this.method1730(97, 2, var8 - 1, var9);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg4 == 0) {
                this.method1730(101, 1, var8, var9);
                this.method1730(108, 16, var8 + 1, var9 + -1);
            }
            if (arg4 == 1) {
                this.method1730(109, 4, var8, var9);
                this.method1730(arg0 ^ 0xFFFFA013, 64, var8 + 1, var9 + 1);
            }
            if (arg4 == 2) {
                this.method1730(80, 16, var8, var9);
                this.method1730(112, 1, var8 - 1, var9 - -1);
            }
            if (arg4 == 3) {
                this.method1730(121, 64, var8, var9);
                this.method1730(122, 4, var8 - 1, var9 - 1);
            }
        }
        if (arg0 != -24484) {
            return;
        }
        if (arg3 == 2) {
            if (arg4 == 0) {
                this.method1730(arg0 + 24596, 130, var8, var9);
                this.method1730(124, 8, var8, var9 - 1);
                this.method1730(121, 32, var8 + 1, var9);
            }
            if (arg4 == 1) {
                this.method1730(arg0 + 24600, 10, var8, var9);
                this.method1730(121, 32, var8 + 1, var9);
                this.method1730(84, 128, var8, var9 + 1);
            }
            if (arg4 == 2) {
                this.method1730(arg0 ^ 0xFFFFA023, 40, var8, var9);
                this.method1730(127, 128, var8, var9 + 1);
                this.method1730(arg0 + 24609, 2, var8 - 1, var9);
            }
            if (arg4 == 3) {
                this.method1730(arg0 ^ 0xFFFFA021, 160, var8, var9);
                this.method1730(92, 2, var8 - 1, var9);
                this.method1730(122, 8, var8, var9 - 1);
            }
        }
        if (arg5) {
            if (arg3 == 0) {
                if (arg4 == 0) {
                    this.method1730(114, 65536, var8, var9);
                    this.method1730(82, 4096, var8, var9 - 1);
                }
                if (arg4 == 1) {
                    this.method1730(118, 1024, var8, var9);
                    this.method1730(109, 16384, var8 + 1, var9);
                }
                if (arg4 == 2) {
                    this.method1730(94, 4096, var8, var9);
                    this.method1730(109, 65536, var8, var9 + 1);
                }
                if (arg4 == 3) {
                    this.method1730(96, 16384, var8, var9);
                    this.method1730(arg0 ^ 0xFFFFA00B, 1024, var8 - 1, var9);
                }
            }
            if (arg3 == 1 || arg3 == 3) {
                if (arg4 == 0) {
                    this.method1730(arg0 + 24605, 512, var8, var9);
                    this.method1730(107, 8192, var8 + 1, var9 + -1);
                }
                if (arg4 == 1) {
                    this.method1730(arg0 + 24583, 2048, var8, var9);
                    this.method1730(109, 32768, var8 + 1, var9 + 1);
                }
                if (arg4 == 2) {
                    this.method1730(arg0 + 24580, 8192, var8, var9);
                    this.method1730(101, 512, var8 - 1, var9 + 1);
                }
                if (arg4 == 3) {
                    this.method1730(109, 32768, var8, var9);
                    this.method1730(76, 2048, var8 - 1, var9 - 1);
                }
            }
            if (arg3 == 2) {
                if (arg4 == 0) {
                    this.method1730(78, 66560, var8, var9);
                    this.method1730(arg0 ^ 0xFFFFA033, 4096, var8, var9 - 1);
                    this.method1730(110, 16384, var8 + 1, var9);
                }
                if (arg4 == 1) {
                    this.method1730(85, 5120, var8, var9);
                    this.method1730(112, 16384, var8 + 1, var9);
                    this.method1730(arg0 + 24580, 65536, var8, var9 + 1);
                }
                if (arg4 == 2) {
                    this.method1730(77, 20480, var8, var9);
                    this.method1730(arg0 + 24572, 65536, var8, var9 + 1);
                    this.method1730(arg0 + 24562, 1024, var8 - 1, var9);
                }
                if (arg4 == 3) {
                    this.method1730(125, 81920, var8, var9);
                    this.method1730(arg0 + 24604, 1024, var8 - 1, var9);
                    this.method1730(96, 4096, var8, var9 - 1);
                }
            }
        }
        if (!arg6) {
            return;
        }
        if (arg3 == 0) {
            if (arg4 == 0) {
                this.method1730(125, 536870912, var8, var9);
                this.method1730(120, 33554432, var8, var9 - 1);
            }
            if (arg4 == 1) {
                this.method1730(117, 8388608, var8, var9);
                this.method1730(87, 134217728, var8 + 1, var9);
            }
            if (arg4 == 2) {
                this.method1730(110, 33554432, var8, var9);
                this.method1730(110, 536870912, var8, var9 + 1);
            }
            if (arg4 == 3) {
                this.method1730(92, 134217728, var8, var9);
                this.method1730(99, 8388608, var8 - 1, var9);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg4 == 0) {
                this.method1730(102, 4194304, var8, var9);
                this.method1730(108, 67108864, var8 + 1, var9 + -1);
            }
            if (arg4 == 1) {
                this.method1730(126, 16777216, var8, var9);
                this.method1730(93, 268435456, var8 + 1, var9 + 1);
            }
            if (arg4 == 2) {
                this.method1730(arg0 ^ 0xFFFFA007, 67108864, var8, var9);
                this.method1730(127, 4194304, var8 - 1, var9 + 1);
            }
            if (arg4 == 3) {
                this.method1730(arg0 ^ 0xFFFFA02B, 268435456, var8, var9);
                this.method1730(105, 16777216, var8 - 1, var9 + -1);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method1730(127, 545259520, var8, var9);
            this.method1730(97, 33554432, var8, var9 - 1);
            this.method1730(arg0 ^ 0xFFFFA035, 134217728, var8 + 1, var9);
        }
        if (arg4 == 1) {
            this.method1730(109, 41943040, var8, var9);
            this.method1730(arg0 + 24598, 134217728, var8 + 1, var9);
            this.method1730(118, 536870912, var8, var9 + 1);
        }
        if (arg4 == 2) {
            this.method1730(110, 167772160, var8, var9);
            this.method1730(95, 536870912, var8, var9 + 1);
            this.method1730(87, 8388608, var8 - 1, var9);
        }
        if (arg4 == 3) {
            this.method1730(90, 671088640, var8, var9);
            this.method1730(123, 8388608, var8 - 1, var9);
            this.method1730(90, 33554432, var8, var9 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(I)V")
    public final void method1726(int arg0) {
        for (int var2 = 0; var2 < this.field3856; var2++) {
            for (int var3 = 0; var3 < this.field3852; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= this.field3856 - 5 || this.field3852 - 5 <= var3) {
                    this.field3853[var2][var3] = -1;
                } else {
                    this.field3853[var2][var3] = 2097152;
                }
            }
        }
        field3865++;
        if (arg0 > -3) {
            this.field3853 = null;
        }
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(III)V")
    public final void method1727(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field3869;
        field3861++;
        int var5 = arg1 - this.field3862;
        if (arg0 != -17012) {
            field3872 = null;
        }
        this.field3853[var5][var4] = class121.method909(this.field3853[var5][var4], 262144);
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IIII)V")
    private final void method1728(int arg0, int arg1, int arg2, int arg3) {
        field3848++;
        if (arg1 != -29376) {
            this.field3862 = 6;
        }
        this.field3853[arg3][arg2] = class121.method909(this.field3853[arg3][arg2], arg0);
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(I)V")
    public static void method1729(int arg0) {
        field3870 = null;
        field3872 = null;
        if (arg0 != -1) {
            field3870 = null;
        }
        field3857 = null;
        field3851 = null;
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(IIII)V")
    private final void method1730(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 <= 75) {
            this.field3853 = null;
        }
        this.field3853[arg3][arg2] = class207.method1405(this.field3853[arg3][arg2], ~arg1);
        field3871++;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(ZZIIIIBI)V")
    public final void method1731(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        field3854++;
        int var9 = 256;
        if (arg1) {
            var9 |= 0x20000;
        }
        if (arg2 == 1 || arg2 == 3) {
            int var10 = arg4;
            arg4 = arg5;
            arg5 = var10;
        }
        if (arg0) {
            var9 |= 0x40000000;
        }
        if (arg6 != 115) {
            field3872 = null;
        }
        int var11 = arg3 - this.field3862;
        int var12 = arg7 - this.field3869;
        for (int var13 = var11; var13 < arg4 + var11; var13++) {
            if (var13 >= 0 && this.field3856 > var13) {
                for (int var14 = var12; var14 < arg5 + var12; var14++) {
                    if (var14 >= 0 && this.field3852 > var14) {
                        this.method1730(83, var9, var14, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IIIIIIIII)Z")
    public final boolean method1732(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3855++;
        if (arg2 > 1) {
            return class283.method1806(arg2, 1, arg2, arg0, arg7, arg6, arg4, arg8, arg5) ? true : this.method1719(arg8, arg3, (byte) 119, arg7, arg2, arg0, arg2, arg5, arg4, arg6);
        }
        int var10 = arg8 + arg6 - 1;
        int var11 = arg4 + arg7 - 1;
        int var12 = -92 % ((-arg1 - 48) / 42);
        if (arg0 >= arg8 && arg0 <= var10 && arg5 >= arg4 && arg5 <= var11) {
            return true;
        } else if (arg8 - 1 == arg0 && arg4 <= arg5 && var11 >= arg5 && (this.field3853[arg0 - this.field3862][arg5 - this.field3869] & 0x8) == 0 && (arg3 & 0x8) == 0) {
            return true;
        } else if ((var10 + 1) == arg0 && arg4 <= arg5 && var11 >= arg5 && (this.field3853[arg0 - this.field3862][arg5 - this.field3869] & 0x80) == 0 && (arg3 & 0x2) == 0) {
            return true;
        } else if ((arg4 - 1) == arg5 && arg8 <= arg0 && arg0 <= var10 && (this.field3853[arg0 - this.field3862][arg5 - this.field3869] & 0x2) == 0 && (arg3 & 0x4) == 0) {
            return true;
        } else {
            return (var11 + 1) == arg5 && arg0 >= arg8 && arg0 <= var10 && (this.field3853[arg0 - this.field3862][arg5 - this.field3869] & 0x20) == 0 && (arg3 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!br", name = "c", descriptor = "(III)V")
    public final void method1733(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field3862;
        field3863++;
        int var5 = arg1 - this.field3869;
        if (arg0 != 0) {
            this.method1728(103, 90, 23, -122);
        }
        this.field3853[var4][var5] = class121.method909(this.field3853[var4][var5], 2097152);
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(ZZIIIZI)V")
    public final void method1734(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field3864++;
        int var8 = 256;
        if (arg5) {
            var8 |= 0x20000;
        }
        int var9 = arg4 - this.field3869;
        int var10 = arg6 - this.field3862;
        if (arg1) {
            var8 |= 0x40000000;
        }
        int var11 = var10;
        if (arg0) {
            field3870 = null;
        }
        while (var11 < (var10 + arg3)) {
            if (var11 >= 0 && this.field3856 > var11) {
                for (int var12 = var9; var12 < (arg2 + var9); var12++) {
                    if (var12 >= 0 && var12 < this.field3852) {
                        this.method1728(var8, -29376, var12, var11);
                    }
                }
            }
            var11++;
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(II)V")
    public static final void method1735(int arg0, int arg1) {
        class355.field5423 = arg1;
        field3858++;
        class271.field3908.method488(-3);
        if (arg0 != -28389) {
            method1729(-13);
        }
    }
}
