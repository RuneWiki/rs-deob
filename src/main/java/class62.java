import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class62 {

    @OriginalMember(owner = "client!sd", name = "t", descriptor = "I")
    public static int field738 = 0;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
    public static int field719;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
    public static int field720;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
    public int field722;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "I")
    public static int field724;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "I")
    public int field728;

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "I")
    public int field729;

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "I")
    public int field733;

    @OriginalMember(owner = "client!sd", name = "p", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!sd", name = "q", descriptor = "I")
    public static int field735;

    @OriginalMember(owner = "client!sd", name = "r", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!sd", name = "s", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!sd", name = "u", descriptor = "I")
    public static int field739;

    @OriginalMember(owner = "client!sd", name = "v", descriptor = "I")
    public static int field740;

    @OriginalMember(owner = "client!sd", name = "w", descriptor = "I")
    public static int field741;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "Lfs;")
    public static class387 field726;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "[[I")
    public int[][] field721;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(III)V")
    public final void method550(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field728;
        field741++;
        int var5 = arg1 - this.field733;
        if (arg0 != -1) {
            this.method551(-50, -17, 88);
        }
        this.field721[var4][var5] = class244.method1606(this.field721[var4][var5], 262144);
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(III)V")
    public final void method551(int arg0, int arg1, int arg2) {
        field719++;
        int var4 = arg1 - this.field733;
        int var5 = -128 % ((26 - arg2) / 52);
        int var6 = arg0 - this.field728;
        this.field721[var6][var4] = class345.method2089(this.field721[var6][var4], -2097153);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIZIIIZI)V")
    public final void method552(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        field730++;
        if (arg3 != 22914) {
            this.method564(13, -76, true, 20, 86, -58, -72, -112);
        }
        int var9 = 256;
        if (arg2) {
            var9 |= 0x20000;
        }
        if (arg1 == 1 || arg1 == 3) {
            int var10 = arg4;
            arg4 = arg7;
            arg7 = var10;
        }
        if (arg6) {
            var9 |= 0x40000000;
        }
        int var11 = arg5 - this.field728;
        int var12 = arg0 - this.field733;
        for (int var13 = var11; var13 < arg4 + var11; var13++) {
            if (var13 >= 0 && var13 < this.field729) {
                for (int var14 = var12; var14 < (var12 + arg7); var14++) {
                    if (var14 >= 0 && this.field722 > var14) {
                        this.method554(var9, 0, var13, var14);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIZ)V")
    private final void method553(int arg0, int arg1, int arg2, boolean arg3) {
        if (!arg3) {
            this.field721[arg2][arg1] = class244.method1606(this.field721[arg2][arg1], arg0);
            field737++;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIII)V")
    private final void method554(int arg0, int arg1, int arg2, int arg3) {
        this.field721[arg2][arg3] = class345.method2089(this.field721[arg2][arg3], ~arg0);
        if (arg1 != 0) {
            this.field729 = -117;
        }
        field724++;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIIIII)Z")
    public final boolean method555(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field720++;
        if (arg1 > 1) {
            return class38.method385(arg1, arg5, arg1, arg4, arg0, arg8, arg6, arg2, (byte) 119) ? true : this.method559(arg2, 0, arg1, arg4, arg6, arg3, arg5, arg8, arg0, arg1);
        }
        if (arg7 < 63) {
            this.method563(-54, -2, 32, -25, -125, true, true);
        }
        int var10 = arg0 + arg2 - 1;
        int var11 = arg5 + arg4 - 1;
        if (arg2 <= arg6 && var10 >= arg6 && arg5 <= arg8 && arg8 <= var11) {
            return true;
        } else if ((arg2 - 1) == arg6 && arg5 <= arg8 && arg8 <= var11 && (this.field721[arg6 - this.field728][arg8 - this.field733] & 0x8) == 0 && (arg3 & 0x8) == 0) {
            return true;
        } else if ((var10 + 1) == arg6 && arg5 <= arg8 && arg8 <= var11 && (this.field721[arg6 - this.field728][arg8 - this.field733] & 0x80) == 0 && (arg3 & 0x2) == 0) {
            return true;
        } else if (arg5 - 1 == arg8 && arg2 <= arg6 && arg6 <= var10 && (this.field721[arg6 - this.field728][arg8 - this.field733] & 0x2) == 0 && (arg3 & 0x4) == 0) {
            return true;
        } else {
            return var11 + 1 == arg8 && arg6 >= arg2 && var10 >= arg6 && (this.field721[arg6 - this.field728][arg8 - this.field733] & 0x20) == 0 && (arg3 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IZIIZII)V")
    public final void method556(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field725++;
        int var8 = 256;
        if (arg1) {
            var8 |= 0x20000;
        }
        if (arg4) {
            var8 |= 0x40000000;
        }
        int var9 = arg6 - this.field733;
        int var10 = arg5 - this.field728;
        int var11 = var10;
        if (arg2 != 16624) {
            this.method566(11);
        }
        while (var10 + arg0 > var11) {
            if (var11 >= 0 && this.field729 > var11) {
                for (int var12 = var9; var12 < (arg3 + var9); var12++) {
                    if (var12 >= 0 && this.field722 > var12) {
                        this.method553(var8, var12, var11, false);
                    }
                }
            }
            var11++;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIZII)Z")
    public final boolean method557(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field736++;
        if (arg3 == 1) {
            if (arg4 == arg6 && arg0 == arg2) {
                return true;
            }
        } else if (arg4 <= arg6 && (arg4 + arg3 - 1) >= arg6 && arg2 <= arg2 && arg2 + arg3 - 1 >= arg2) {
            return true;
        }
        int var9 = arg4 - this.field728;
        int var10 = arg0 - this.field733;
        int var11 = arg2 - this.field733;
        int var12 = arg6 - this.field728;
        if (arg3 == 1) {
            if (arg7 == 0) {
                if (arg1 == 0) {
                    if (var12 - 1 == var9 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && var11 + 1 == var10 && (this.field721[var9][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var11 - 1) == var10 && (this.field721[var9][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var9 == var12 && (var11 + 1) == var10) {
                        return true;
                    }
                    if ((var12 - 1) == var9 && var10 == var11 && (this.field721[var9][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var10 == var11 && (this.field721[var9][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if ((var12 + 1) == var9 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && var11 + 1 == var10 && (this.field721[var9][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var11 - 1) == var10 && (this.field721[var9][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var9 == var12 && var11 - 1 == var10) {
                        return true;
                    }
                    if (var12 - 1 == var9 && var10 == var11 && (this.field721[var9][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var10 == var11 && (this.field721[var9][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg7 == 2) {
                if (arg1 == 0) {
                    if ((var12 - 1) == var9 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && (var11 + 1) == var10) {
                        return true;
                    }
                    if ((var12 + 1) == var9 && var10 == var11 && (this.field721[var9][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var11 - 1) == var10 && (this.field721[var9][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var12 - 1 == var9 && var10 == var11 && (this.field721[var9][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var11 + 1) == var10) {
                        return true;
                    }
                    if ((var12 + 1) == var9 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && (var11 - 1) == var10 && (this.field721[var9][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var12 - 1 == var9 && var10 == var11 && (this.field721[var9][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var11 + 1) == var10 && (this.field721[var9][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var9 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && var11 - 1 == var10) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if ((var12 - 1) == var9 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && var11 + 1 == var10 && (this.field721[var9][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var9 && var10 == var11 && (this.field721[var9][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var11 - 1) == var10) {
                        return true;
                    }
                }
            }
            if (arg7 == 9) {
                if (var9 == var12 && (var11 + 1) == var10 && (this.field721[var9][var10] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var12 && var11 - 1 == var10 && (this.field721[var9][var10] & 0x2) == 0) {
                    return true;
                }
                if ((var12 - 1) == var9 && var10 == var11 && (this.field721[var9][var10] & 0x8) == 0) {
                    return true;
                }
                if ((var12 + 1) == var9 && var10 == var11 && (this.field721[var9][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var9 + arg3 - 1;
            int var14 = var10 + arg3 - 1;
            if (arg7 == 0) {
                if (arg1 == 0) {
                    if (var12 - arg3 == var9 && var11 >= var10 && var14 >= var11) {
                        return true;
                    }
                    if (var12 >= var9 && var12 <= var13 && (var11 + 1) == var10 && (this.field721[var12][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 <= var12 && var13 >= var12 && var11 - arg3 == var10 && (this.field721[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var9 <= var12 && var13 >= var12 && (var11 + 1) == var10) {
                        return true;
                    }
                    if (var12 - arg3 == var9 && var11 >= var10 && var14 >= var11 && (this.field721[var13][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var10 <= var11 && var11 <= var14 && (this.field721[var9][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var12 + 1 == var9 && var11 >= var10 && var11 <= var14) {
                        return true;
                    }
                    if (var9 <= var12 && var12 <= var13 && (var11 + 1) == var10 && (this.field721[var12][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 <= var12 && var12 <= var13 && (var11 - arg3) == var10 && (this.field721[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var9 <= var12 && var12 <= var13 && var11 - arg3 == var10) {
                        return true;
                    }
                    if (var12 - arg3 == var9 && var10 <= var11 && var14 >= var11 && (this.field721[var13][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var11 >= var10 && var11 <= var14 && (this.field721[var9][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg7 == 2) {
                if (arg1 == 0) {
                    if (var12 - arg3 == var9 && var10 <= var11 && var11 <= var14) {
                        return true;
                    }
                    if (var12 >= var9 && var13 >= var12 && (var11 + 1) == var10) {
                        return true;
                    }
                    if ((var12 + 1) == var9 && var11 >= var10 && var11 <= var14 && (this.field721[var9][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 <= var12 && var13 >= var12 && (var11 - arg3) == var10 && (this.field721[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var12 - arg3 == var9 && var10 <= var11 && var11 <= var14 && (this.field721[var13][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 <= var12 && var13 >= var12 && (var11 + 1) == var10) {
                        return true;
                    }
                    if ((var12 + 1) == var9 && var10 <= var11 && var14 >= var11) {
                        return true;
                    }
                    if (var9 <= var12 && var12 <= var13 && var11 - arg3 == var10 && (this.field721[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var12 - arg3 == var9 && var10 <= var11 && var14 >= var11 && (this.field721[var13][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 <= var12 && var12 <= var13 && var11 + 1 == var10 && (this.field721[var12][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var9 && var11 >= var10 && var14 >= var11) {
                        return true;
                    }
                    if (var9 <= var12 && var13 >= var12 && var11 - arg3 == var10) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var12 - arg3 == var9 && var10 <= var11 && var14 >= var11) {
                        return true;
                    }
                    if (var9 <= var12 && var12 <= var13 && var11 + 1 == var10 && (this.field721[var12][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var9 && var11 >= var10 && var11 <= var14 && (this.field721[var9][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 <= var12 && var13 >= var12 && var11 - arg3 == var10) {
                        return true;
                    }
                }
            }
            if (arg7 == 9) {
                if (var12 >= var9 && var12 <= var13 && (var11 + 1) == var10 && (this.field721[var12][var10] & 0x2C0120) == 0) {
                    return true;
                }
                if (var9 <= var12 && var12 <= var13 && var11 - arg3 == var10 && (this.field721[var12][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if (var12 - arg3 == var9 && var11 >= var10 && var14 >= var11 && (this.field721[var13][var11] & 0x2C0108) == 0) {
                    return true;
                }
                if (var12 + 1 == var9 && var11 >= var10 && var11 <= var14 && (this.field721[var9][var11] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        if (arg5) {
            this.method557(-38, 68, -104, -110, 105, true, 33, 79);
        }
        return false;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V")
    public static void method558(int arg0) {
        if (arg0 != 3) {
            field738 = 99;
        }
        field726 = null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIIIIII)Z")
    public final boolean method559(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field732++;
        int var11 = arg2 + arg4;
        int var12 = arg7 + arg9;
        if (arg1 != 0) {
            field738 = -66;
        }
        int var13 = arg0 + arg8;
        int var14 = arg3 + arg6;
        if (arg4 == var13 && (arg5 & 0x2) == 0) {
            int var15 = arg6 < arg7 ? arg7 : arg6;
            int var16 = var14 > var12 ? var12 : var14;
            while (var15 < var16) {
                if ((this.field721[var13 - this.field728 - 1][var15 - this.field733] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg0 == var11 && (arg5 & 0x8) == 0) {
            int var17 = arg6 >= arg7 ? arg6 : arg7;
            int var18 = var12 < var14 ? var12 : var14;
            while (var17 < var18) {
                if ((this.field721[arg0 - this.field728][var17 - this.field733] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg7 == var14 && (arg5 & 0x1) == 0) {
            int var19 = arg4 <= arg0 ? arg0 : arg4;
            int var20 = var13 <= var11 ? var13 : var11;
            while (var19 < var20) {
                if ((this.field721[var19 - this.field728][var14 - this.field733 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg6 == var12 && (arg5 & 0x4) == 0) {
            int var21 = arg0 < arg4 ? arg4 : arg0;
            int var22 = var13 > var11 ? var11 : var13;
            while (var21 < var22) {
                if ((this.field721[var21 - this.field728][arg6 - this.field733] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IZIIIZI)V")
    public final void method560(int arg0, boolean arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        int var8 = arg2 - this.field728;
        int var9 = arg0 - this.field733;
        field723++;
        if (arg6 == 0) {
            if (arg4 == 0) {
                this.method553(128, var9, var8, false);
                this.method553(8, var9, var8 - 1, false);
            }
            if (arg4 == 1) {
                this.method553(2, var9, var8, false);
                this.method553(32, var9 + 1, var8, false);
            }
            if (arg4 == 2) {
                this.method553(8, var9, var8, false);
                this.method553(128, var9, var8 + 1, false);
            }
            if (arg4 == 3) {
                this.method553(32, var9, var8, false);
                this.method553(2, var9 - 1, var8, false);
            }
        }
        if (arg3 != 268435456) {
            return;
        }
        if (arg6 == 1 || arg6 == 3) {
            if (arg4 == 0) {
                this.method553(1, var9, var8, false);
                this.method553(16, var9 + 1, var8 - 1, false);
            }
            if (arg4 == 1) {
                this.method553(4, var9, var8, false);
                this.method553(64, var9 + 1, var8 + 1, false);
            }
            if (arg4 == 2) {
                this.method553(16, var9, var8, false);
                this.method553(1, var9 - 1, var8 + 1, false);
            }
            if (arg4 == 3) {
                this.method553(64, var9, var8, false);
                this.method553(4, var9 - 1, var8 - 1, false);
            }
        }
        if (arg6 == 2) {
            if (arg4 == 0) {
                this.method553(130, var9, var8, false);
                this.method553(8, var9, var8 - 1, false);
                this.method553(32, var9 + 1, var8, false);
            }
            if (arg4 == 1) {
                this.method553(10, var9, var8, false);
                this.method553(32, var9 + 1, var8, false);
                this.method553(128, var9, var8 + 1, false);
            }
            if (arg4 == 2) {
                this.method553(40, var9, var8, false);
                this.method553(128, var9, var8 + 1, false);
                this.method553(2, var9 - 1, var8, false);
            }
            if (arg4 == 3) {
                this.method553(160, var9, var8, false);
                this.method553(2, var9 - 1, var8, false);
                this.method553(8, var9, var8 - 1, false);
            }
        }
        if (arg1) {
            if (arg6 == 0) {
                if (arg4 == 0) {
                    this.method553(65536, var9, var8, false);
                    this.method553(4096, var9, var8 - 1, false);
                }
                if (arg4 == 1) {
                    this.method553(1024, var9, var8, false);
                    this.method553(16384, var9 + 1, var8, false);
                }
                if (arg4 == 2) {
                    this.method553(4096, var9, var8, false);
                    this.method553(65536, var9, var8 + 1, false);
                }
                if (arg4 == 3) {
                    this.method553(16384, var9, var8, false);
                    this.method553(1024, var9 - 1, var8, false);
                }
            }
            if (arg6 == 1 || arg6 == 3) {
                if (arg4 == 0) {
                    this.method553(512, var9, var8, false);
                    this.method553(8192, var9 + 1, var8 + -1, false);
                }
                if (arg4 == 1) {
                    this.method553(2048, var9, var8, false);
                    this.method553(32768, var9 + 1, var8 + 1, false);
                }
                if (arg4 == 2) {
                    this.method553(8192, var9, var8, false);
                    this.method553(512, var9 - 1, var8 + 1, false);
                }
                if (arg4 == 3) {
                    this.method553(32768, var9, var8, false);
                    this.method553(2048, var9 - 1, var8 - 1, false);
                }
            }
            if (arg6 == 2) {
                if (arg4 == 0) {
                    this.method553(66560, var9, var8, false);
                    this.method553(4096, var9, var8 - 1, false);
                    this.method553(16384, var9 + 1, var8, false);
                }
                if (arg4 == 1) {
                    this.method553(5120, var9, var8, false);
                    this.method553(16384, var9 + 1, var8, false);
                    this.method553(65536, var9, var8 + 1, false);
                }
                if (arg4 == 2) {
                    this.method553(20480, var9, var8, false);
                    this.method553(65536, var9, var8 + 1, false);
                    this.method553(1024, var9 - 1, var8, false);
                }
                if (arg4 == 3) {
                    this.method553(81920, var9, var8, false);
                    this.method553(1024, var9 - 1, var8, false);
                    this.method553(4096, var9, var8 - 1, false);
                }
            }
        }
        if (!arg5) {
            return;
        }
        if (arg6 == 0) {
            if (arg4 == 0) {
                this.method553(536870912, var9, var8, false);
                this.method553(33554432, var9, var8 - 1, false);
            }
            if (arg4 == 1) {
                this.method553(8388608, var9, var8, false);
                this.method553(134217728, var9 + 1, var8, false);
            }
            if (arg4 == 2) {
                this.method553(33554432, var9, var8, false);
                this.method553(536870912, var9, var8 + 1, false);
            }
            if (arg4 == 3) {
                this.method553(134217728, var9, var8, false);
                this.method553(8388608, var9 - 1, var8, false);
            }
        }
        if (arg6 == 1 || arg6 == 3) {
            if (arg4 == 0) {
                this.method553(4194304, var9, var8, false);
                this.method553(67108864, var9 + 1, var8 + -1, false);
            }
            if (arg4 == 1) {
                this.method553(16777216, var9, var8, false);
                this.method553(268435456, var9 + 1, var8 + 1, false);
            }
            if (arg4 == 2) {
                this.method553(67108864, var9, var8, false);
                this.method553(4194304, var9 - 1, var8 + 1, false);
            }
            if (arg4 == 3) {
                this.method553(268435456, var9, var8, false);
                this.method553(16777216, var9 - 1, var8 + -1, false);
            }
        }
        if (arg6 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method553(545259520, var9, var8, false);
            this.method553(33554432, var9, var8 - 1, false);
            this.method553(134217728, var9 + 1, var8, false);
        }
        if (arg4 == 1) {
            this.method553(41943040, var9, var8, false);
            this.method553(134217728, var9 + 1, var8, false);
            this.method553(536870912, var9, var8 + 1, false);
        }
        if (arg4 == 2) {
            this.method553(167772160, var9, var8, false);
            this.method553(536870912, var9, var8 + 1, false);
            this.method553(8388608, var9 - 1, var8, false);
        }
        if (arg4 == 3) {
            this.method553(671088640, var9, var8, false);
            this.method553(8388608, var9 - 1, var8, false);
            this.method553(33554432, var9, var8 - 1, false);
            return;
        }
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)V")
    public static final void method561(int arg0) {
        field735++;
        class156 var1 = class100.field1370;
        synchronized (class100.field1370) {
            class100.field1370.method1105(false);
        }
        class156 var2 = class484.field7118;
        synchronized (class484.field7118) {
            class484.field7118.method1105(false);
            if (arg0 != 8) {
                field726 = null;
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIZ)V")
    public final void method562(int arg0, int arg1, boolean arg2) {
        field740++;
        int var4 = arg0 - this.field728;
        if (!arg2) {
            int var5 = arg1 - this.field733;
            this.field721[var4][var5] = class345.method2089(this.field721[var4][var5], -262145);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIZZ)V")
    public final void method563(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        field739++;
        int var8 = arg4 - this.field728;
        int var9 = arg3 - this.field733;
        if (arg2 == 0) {
            if (arg1 == 0) {
                this.method554(128, 0, var8, var9);
                this.method554(8, 0, var8 - 1, var9);
            }
            if (arg1 == 1) {
                this.method554(2, 0, var8, var9);
                this.method554(32, 0, var8, var9 + 1);
            }
            if (arg1 == 2) {
                this.method554(8, 0, var8, var9);
                this.method554(128, 0, var8 + 1, var9);
            }
            if (arg1 == 3) {
                this.method554(32, 0, var8, var9);
                this.method554(2, 0, var8, var9 - 1);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg1 == 0) {
                this.method554(1, 0, var8, var9);
                this.method554(16, 0, var8 - 1, var9 + 1);
            }
            if (arg1 == 1) {
                this.method554(4, 0, var8, var9);
                this.method554(64, 0, var8 + 1, var9 + 1);
            }
            if (arg1 == 2) {
                this.method554(16, 0, var8, var9);
                this.method554(1, 0, var8 + 1, var9 + -1);
            }
            if (arg1 == 3) {
                this.method554(64, 0, var8, var9);
                this.method554(4, 0, var8 - 1, var9 + -1);
            }
        }
        if (arg2 == 2) {
            if (arg1 == 0) {
                this.method554(130, 0, var8, var9);
                this.method554(8, 0, var8 - 1, var9);
                this.method554(32, 0, var8, var9 + 1);
            }
            if (arg1 == 1) {
                this.method554(10, 0, var8, var9);
                this.method554(32, 0, var8, var9 + 1);
                this.method554(128, 0, var8 + 1, var9);
            }
            if (arg1 == 2) {
                this.method554(40, 0, var8, var9);
                this.method554(128, 0, var8 + 1, var9);
                this.method554(2, 0, var8, var9 - 1);
            }
            if (arg1 == 3) {
                this.method554(160, 0, var8, var9);
                this.method554(2, 0, var8, var9 - 1);
                this.method554(8, 0, var8 - 1, var9);
            }
        }
        if (arg0 > -56) {
            return;
        }
        if (arg5) {
            if (arg2 == 0) {
                if (arg1 == 0) {
                    this.method554(65536, 0, var8, var9);
                    this.method554(4096, 0, var8 - 1, var9);
                }
                if (arg1 == 1) {
                    this.method554(1024, 0, var8, var9);
                    this.method554(16384, 0, var8, var9 + 1);
                }
                if (arg1 == 2) {
                    this.method554(4096, 0, var8, var9);
                    this.method554(65536, 0, var8 + 1, var9);
                }
                if (arg1 == 3) {
                    this.method554(16384, 0, var8, var9);
                    this.method554(1024, 0, var8, var9 - 1);
                }
            }
            if (arg2 == 1 || arg2 == 3) {
                if (arg1 == 0) {
                    this.method554(512, 0, var8, var9);
                    this.method554(8192, 0, var8 - 1, var9 + 1);
                }
                if (arg1 == 1) {
                    this.method554(2048, 0, var8, var9);
                    this.method554(32768, 0, var8 + 1, var9 + 1);
                }
                if (arg1 == 2) {
                    this.method554(8192, 0, var8, var9);
                    this.method554(512, 0, var8 + 1, var9 + -1);
                }
                if (arg1 == 3) {
                    this.method554(32768, 0, var8, var9);
                    this.method554(2048, 0, var8 - 1, var9 + -1);
                }
            }
            if (arg2 == 2) {
                if (arg1 == 0) {
                    this.method554(66560, 0, var8, var9);
                    this.method554(4096, 0, var8 - 1, var9);
                    this.method554(16384, 0, var8, var9 + 1);
                }
                if (arg1 == 1) {
                    this.method554(5120, 0, var8, var9);
                    this.method554(16384, 0, var8, var9 + 1);
                    this.method554(65536, 0, var8 + 1, var9);
                }
                if (arg1 == 2) {
                    this.method554(20480, 0, var8, var9);
                    this.method554(65536, 0, var8 + 1, var9);
                    this.method554(1024, 0, var8, var9 - 1);
                }
                if (arg1 == 3) {
                    this.method554(81920, 0, var8, var9);
                    this.method554(1024, 0, var8, var9 - 1);
                    this.method554(4096, 0, var8 - 1, var9);
                }
            }
        }
        if (!arg6) {
            return;
        }
        if (arg2 == 0) {
            if (arg1 == 0) {
                this.method554(536870912, 0, var8, var9);
                this.method554(33554432, 0, var8 - 1, var9);
            }
            if (arg1 == 1) {
                this.method554(8388608, 0, var8, var9);
                this.method554(134217728, 0, var8, var9 + 1);
            }
            if (arg1 == 2) {
                this.method554(33554432, 0, var8, var9);
                this.method554(536870912, 0, var8 + 1, var9);
            }
            if (arg1 == 3) {
                this.method554(134217728, 0, var8, var9);
                this.method554(8388608, 0, var8, var9 - 1);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg1 == 0) {
                this.method554(4194304, 0, var8, var9);
                this.method554(67108864, 0, var8 - 1, var9 + 1);
            }
            if (arg1 == 1) {
                this.method554(16777216, 0, var8, var9);
                this.method554(268435456, 0, var8 + 1, var9 + 1);
            }
            if (arg1 == 2) {
                this.method554(67108864, 0, var8, var9);
                this.method554(4194304, 0, var8 + 1, var9 + -1);
            }
            if (arg1 == 3) {
                this.method554(268435456, 0, var8, var9);
                this.method554(16777216, 0, var8 - 1, var9 + -1);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method554(545259520, 0, var8, var9);
            this.method554(33554432, 0, var8 - 1, var9);
            this.method554(134217728, 0, var8, var9 + 1);
        }
        if (arg1 == 1) {
            this.method554(41943040, 0, var8, var9);
            this.method554(134217728, 0, var8, var9 + 1);
            this.method554(536870912, 0, var8 + 1, var9);
        }
        if (arg1 == 2) {
            this.method554(167772160, 0, var8, var9);
            this.method554(536870912, 0, var8 + 1, var9);
            this.method554(8388608, 0, var8, var9 - 1);
        }
        if (arg1 == 3) {
            this.method554(671088640, 0, var8, var9);
            this.method554(8388608, 0, var8, var9 - 1);
            this.method554(33554432, 0, var8 - 1, var9);
            return;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIZIIIII)Z")
    public final boolean method564(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field727++;
        if (arg7 == 1) {
            if (arg1 == arg4 && arg5 == arg6) {
                return true;
            }
        } else if (arg1 <= arg4 && arg4 <= (arg1 + arg7 - 1) && arg6 <= arg6 && arg6 + arg7 - 1 >= arg6) {
            return true;
        }
        if (arg2) {
            this.field722 = -32;
        }
        int var9 = arg6 - this.field733;
        int var10 = arg4 - this.field728;
        int var11 = arg1 - this.field728;
        int var12 = arg5 - this.field733;
        if (arg7 == 1) {
            if (arg3 == 6 || arg3 == 7) {
                if (arg3 == 7) {
                    arg0 = arg0 + 2 & 0x3;
                }
                if (arg0 == 0) {
                    if (var10 + 1 == var11 && var9 == var12 && (this.field721[var11][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var9 - 1) == var12 && (this.field721[var11][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if ((var10 - 1) == var11 && var9 == var12 && (this.field721[var11][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var9 - 1) == var12 && (this.field721[var11][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if (var10 - 1 == var11 && var9 == var12 && (this.field721[var11][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var9 + 1 == var12 && (this.field721[var11][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if ((var10 + 1) == var11 && var9 == var12 && (this.field721[var11][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var9 + 1) == var12 && (this.field721[var11][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 8) {
                if (var10 == var11 && (var9 + 1) == var12 && (this.field721[var11][var12] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var11 && var9 - 1 == var12 && (this.field721[var11][var12] & 0x2) == 0) {
                    return true;
                }
                if ((var10 - 1) == var11 && var9 == var12 && (this.field721[var11][var12] & 0x8) == 0) {
                    return true;
                }
                if ((var10 + 1) == var11 && var9 == var12 && (this.field721[var11][var12] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg7 + var11 - 1;
            int var14 = arg7 + var12 - 1;
            if (arg3 == 6 || arg3 == 7) {
                if (arg3 == 7) {
                    arg0 = arg0 + 2 & 0x3;
                }
                if (arg0 == 0) {
                    if (var10 + 1 == var11 && var9 >= var12 && var14 >= var9 && (this.field721[var11][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var13 >= var10 && var9 - arg7 == var12 && (this.field721[var10][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if ((var10 - arg7) == var11 && var12 <= var9 && var9 <= var14 && (this.field721[var13][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var13 >= var10 && (var9 - arg7) == var12 && (this.field721[var10][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if (var10 - arg7 == var11 && var12 <= var9 && var9 <= var14 && (this.field721[var13][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var13 >= var10 && var9 + 1 == var12 && (this.field721[var10][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var10 + 1 == var11 && var12 <= var9 && var14 >= var9 && (this.field721[var11][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var13 >= var10 && (var9 + 1) == var12 && (this.field721[var10][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 8) {
                if (var11 <= var10 && var13 >= var10 && var9 + 1 == var12 && (this.field721[var10][var12] & 0x20) == 0) {
                    return true;
                }
                if (var10 >= var11 && var10 <= var13 && (var9 - arg7) == var12 && (this.field721[var10][var14] & 0x2) == 0) {
                    return true;
                }
                if ((var10 - arg7) == var11 && var12 <= var9 && var9 <= var14 && (this.field721[var13][var9] & 0x8) == 0) {
                    return true;
                }
                if ((var10 + 1) == var11 && var12 <= var9 && var9 <= var14 && (this.field721[var11][var9] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(III)V")
    public final void method565(int arg0, int arg1, int arg2) {
        field731++;
        int var4 = arg0 - this.field733;
        int var5 = arg2 - this.field728;
        this.field721[var5][var4] = class244.method1606(this.field721[var5][var4], arg1);
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(I)V")
    public final void method566(int arg0) {
        field734++;
        if (arg0 > -47) {
            this.method555(-104, -4, 100, 41, 16, 28, 39, 115, -124);
        }
        for (int var2 = 0; var2 < this.field729; var2++) {
            for (int var3 = 0; var3 < this.field722; var3++) {
                if (var2 == 0 || var3 == 0 || (this.field729 - 5) <= var2 || this.field722 - 5 <= var3) {
                    this.field721[var2][var3] = -1;
                } else {
                    this.field721[var2][var3] = 2097152;
                }
            }
        }
    }
}
