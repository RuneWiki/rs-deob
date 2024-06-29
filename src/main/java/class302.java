import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!caa")
public class class302 {

    @OriginalMember(owner = "client!caa", name = "g", descriptor = "Ldh;")
    public static class320 field3765 = new class320(102, 0);

    @OriginalMember(owner = "client!caa", name = "v", descriptor = "I")
    public static int field3780 = -1;

    @OriginalMember(owner = "client!caa", name = "y", descriptor = "I")
    public static int field3783 = 0;

    @OriginalMember(owner = "client!caa", name = "z", descriptor = "I")
    public static int field3784 = 0;

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "I")
    public int field3759;

    @OriginalMember(owner = "client!caa", name = "b", descriptor = "I")
    public static int field3760;

    @OriginalMember(owner = "client!caa", name = "c", descriptor = "I")
    public int field3761;

    @OriginalMember(owner = "client!caa", name = "e", descriptor = "I")
    public static int field3763;

    @OriginalMember(owner = "client!caa", name = "f", descriptor = "I")
    public static int field3764;

    @OriginalMember(owner = "client!caa", name = "h", descriptor = "I")
    public static int field3766;

    @OriginalMember(owner = "client!caa", name = "i", descriptor = "I")
    public int field3767;

    @OriginalMember(owner = "client!caa", name = "j", descriptor = "I")
    public static int field3768;

    @OriginalMember(owner = "client!caa", name = "k", descriptor = "I")
    public int field3769;

    @OriginalMember(owner = "client!caa", name = "m", descriptor = "I")
    public static int field3771;

    @OriginalMember(owner = "client!caa", name = "n", descriptor = "I")
    public static int field3772;

    @OriginalMember(owner = "client!caa", name = "o", descriptor = "I")
    public static int field3773;

    @OriginalMember(owner = "client!caa", name = "p", descriptor = "I")
    public static int field3774;

    @OriginalMember(owner = "client!caa", name = "q", descriptor = "I")
    public static int field3775;

    @OriginalMember(owner = "client!caa", name = "r", descriptor = "I")
    public static int field3776;

    @OriginalMember(owner = "client!caa", name = "s", descriptor = "I")
    public static int field3777;

    @OriginalMember(owner = "client!caa", name = "t", descriptor = "I")
    public static int field3778;

    @OriginalMember(owner = "client!caa", name = "u", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!caa", name = "w", descriptor = "I")
    public static int field3781;

    @OriginalMember(owner = "client!caa", name = "x", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!caa", name = "A", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!caa", name = "d", descriptor = "Z")
    public static boolean field3762;

    @OriginalMember(owner = "client!caa", name = "l", descriptor = "[[I")
    public int[][] field3770;

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(IIIB)V")
    private final void method1804(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 == -124) {
            field3778++;
            this.field3770[arg2][arg0] = class695.method3919(this.field3770[arg2][arg0], arg1);
        }
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(IIBIIIIII)Z")
    public final boolean method1805(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3760++;
        if (arg6 > 1) {
            return class377.method2303(arg5, arg6, arg6, arg7, arg4, 4, arg0, arg1, arg3) ? true : this.method1807((byte) 88, arg0, arg1, arg7, arg5, arg4, arg3, arg8, arg6, arg6);
        }
        int var10 = arg4 + arg7 - 1;
        int var11 = arg0 + arg3 - 1;
        if (arg4 <= arg1 && arg1 <= var10 && arg0 <= arg5 && var11 >= arg5) {
            return true;
        } else if ((arg4 - 1) == arg1 && arg0 <= arg5 && var11 >= arg5 && (this.field3770[arg1 - this.field3759][arg5 - this.field3761] & 0x8) == 0 && (arg8 & 0x8) == 0) {
            return true;
        } else if (var10 + 1 == arg1 && arg0 <= arg5 && var11 >= arg5 && (this.field3770[arg1 - this.field3759][arg5 - this.field3761] & 0x80) == 0 && (arg8 & 0x2) == 0) {
            return true;
        } else if (arg0 - 1 == arg5 && arg4 <= arg1 && var10 >= arg1 && (this.field3770[arg1 - this.field3759][arg5 - this.field3761] & 0x2) == 0 && (arg8 & 0x4) == 0) {
            return true;
        } else {
            if (arg2 < 29) {
                this.field3769 = 102;
            }
            return var11 + 1 == arg5 && arg1 >= arg4 && var10 >= arg1 && (this.field3770[arg1 - this.field3759][arg5 - this.field3761] & 0x20) == 0 && (arg8 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(BIZIIZI)V")
    public final void method1806(byte arg0, int arg1, boolean arg2, int arg3, int arg4, boolean arg5, int arg6) {
        if (arg0 != 119) {
            method1808((byte) -68, 2, 87);
        }
        field3773++;
        int var8 = 256;
        if (arg2) {
            var8 |= 0x20000;
        }
        int var9 = arg3 - this.field3759;
        int var10 = arg6 - this.field3761;
        if (arg5) {
            var8 |= 0x40000000;
        }
        for (int var11 = var9; var11 < var9 + arg1; var11++) {
            if (var11 >= 0 && var11 < this.field3767) {
                for (int var12 = var10; var12 < arg4 + var10; var12++) {
                    if (var12 >= 0 && var12 < this.field3769) {
                        this.method1804(var12, var8, var11, (byte) -124);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(BIIIIIIIII)Z")
    public final boolean method1807(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3775++;
        int var11 = arg2 + arg9;
        int var12 = arg4 + arg8;
        int var13 = arg3 + arg5;
        if (arg0 != 88) {
            return false;
        }
        int var14 = arg1 + arg6;
        if (arg2 == var13 && (arg7 & 0x2) == 0) {
            int var15 = arg1 >= arg4 ? arg1 : arg4;
            int var16 = var14 <= var12 ? var14 : var12;
            while (var16 > var15) {
                if ((this.field3770[var13 - this.field3759 - 1][var15 - this.field3761] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg5 == var11 && (arg7 & 0x8) == 0) {
            int var17 = arg1 >= arg4 ? arg1 : arg4;
            int var18 = var14 <= var12 ? var14 : var12;
            while (var17 < var18) {
                if ((this.field3770[arg5 - this.field3759][var17 - this.field3761] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg4 == var14 && (arg7 & 0x1) == 0) {
            int var19 = arg5 < arg2 ? arg2 : arg5;
            int var20 = var13 > var11 ? var11 : var13;
            while (var20 > var19) {
                if ((this.field3770[var19 - this.field3759][var14 - this.field3761 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg1 == var12 && (arg7 & 0x4) == 0) {
            int var21 = arg5 < arg2 ? arg2 : arg5;
            int var22 = var13 > var11 ? var11 : var13;
            while (var21 < var22) {
                if ((this.field3770[var21 - this.field3759][arg1 - this.field3761] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(BII)I")
    public static final int method1808(byte arg0, int arg1, int arg2) {
        if (arg0 != 51) {
            field3783 = 105;
        }
        field3785++;
        return arg1 == 1 || arg1 == 3 ? class84.field886[arg2 & 0x3] : class221.field2548[arg2 & 0x3];
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(Z)V")
    public final void method1809(boolean arg0) {
        if (arg0) {
            return;
        }
        for (int var2 = 0; var2 < this.field3767; var2++) {
            for (int var3 = 0; var3 < this.field3769; var3++) {
                if (var2 == 0 || var3 == 0 || (this.field3767 - 5) <= var2 || (this.field3769 - 5) <= var3) {
                    this.field3770[var2][var3] = -1;
                } else {
                    this.field3770[var2][var3] = 2097152;
                }
            }
        }
        field3768++;
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(IBI)V")
    public final void method1810(int arg0, byte arg1, int arg2) {
        field3771++;
        int var4 = arg0 - this.field3761;
        if (arg1 < -11) {
            int var5 = arg2 - this.field3759;
            this.field3770[var5][var4] = class327.method1956(this.field3770[var5][var4], -262145);
        }
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(IZZIIII)V")
    public final void method1811(int arg0, boolean arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = arg4 - this.field3759;
        field3782++;
        int var9 = arg3 - this.field3761;
        if (arg0 == 0) {
            if (arg6 == 0) {
                this.method1804(var9, 128, var8, (byte) -124);
                this.method1804(var9, 8, var8 - 1, (byte) -124);
            }
            if (arg6 == 1) {
                this.method1804(var9, 2, var8, (byte) -124);
                this.method1804(var9 + 1, 32, var8, (byte) -124);
            }
            if (arg6 == 2) {
                this.method1804(var9, 8, var8, (byte) -124);
                this.method1804(var9, 128, var8 + 1, (byte) -124);
            }
            if (arg6 == 3) {
                this.method1804(var9, 32, var8, (byte) -124);
                this.method1804(var9 - 1, 2, var8, (byte) -124);
            }
        }
        if (arg0 == arg5 || arg0 == 3) {
            if (arg6 == 0) {
                this.method1804(var9, 1, var8, (byte) -124);
                this.method1804(var9 + 1, 16, var8 - 1, (byte) -124);
            }
            if (arg6 == 1) {
                this.method1804(var9, 4, var8, (byte) -124);
                this.method1804(var9 + 1, 64, var8 + 1, (byte) -124);
            }
            if (arg6 == 2) {
                this.method1804(var9, 16, var8, (byte) -124);
                this.method1804(var9 - 1, 1, var8 + 1, (byte) -124);
            }
            if (arg6 == 3) {
                this.method1804(var9, 64, var8, (byte) -124);
                this.method1804(var9 - 1, 4, var8 - 1, (byte) -124);
            }
        }
        if (arg0 == 2) {
            if (arg6 == 0) {
                this.method1804(var9, 130, var8, (byte) -124);
                this.method1804(var9, 8, var8 - 1, (byte) -124);
                this.method1804(var9 + 1, 32, var8, (byte) -124);
            }
            if (arg6 == 1) {
                this.method1804(var9, 10, var8, (byte) -124);
                this.method1804(var9 + 1, 32, var8, (byte) -124);
                this.method1804(var9, 128, var8 + 1, (byte) -124);
            }
            if (arg6 == 2) {
                this.method1804(var9, 40, var8, (byte) -124);
                this.method1804(var9, 128, var8 + 1, (byte) -124);
                this.method1804(var9 - 1, 2, var8, (byte) -124);
            }
            if (arg6 == 3) {
                this.method1804(var9, 160, var8, (byte) -124);
                this.method1804(var9 - 1, 2, var8, (byte) -124);
                this.method1804(var9, 8, var8 - 1, (byte) -124);
            }
        }
        if (arg1) {
            if (arg0 == 0) {
                if (arg6 == 0) {
                    this.method1804(var9, 65536, var8, (byte) -124);
                    this.method1804(var9, 4096, var8 - 1, (byte) -124);
                }
                if (arg6 == 1) {
                    this.method1804(var9, 1024, var8, (byte) -124);
                    this.method1804(var9 + 1, 16384, var8, (byte) -124);
                }
                if (arg6 == 2) {
                    this.method1804(var9, 4096, var8, (byte) -124);
                    this.method1804(var9, 65536, var8 + 1, (byte) -124);
                }
                if (arg6 == 3) {
                    this.method1804(var9, 16384, var8, (byte) -124);
                    this.method1804(var9 - 1, 1024, var8, (byte) -124);
                }
            }
            if (arg0 == 1 || arg0 == 3) {
                if (arg6 == 0) {
                    this.method1804(var9, 512, var8, (byte) -124);
                    this.method1804(var9 + 1, 8192, var8 - 1, (byte) -124);
                }
                if (arg6 == 1) {
                    this.method1804(var9, 2048, var8, (byte) -124);
                    this.method1804(var9 + 1, 32768, var8 + 1, (byte) -124);
                }
                if (arg6 == 2) {
                    this.method1804(var9, 8192, var8, (byte) -124);
                    this.method1804(var9 - 1, 512, var8 + 1, (byte) -124);
                }
                if (arg6 == 3) {
                    this.method1804(var9, 32768, var8, (byte) -124);
                    this.method1804(var9 - 1, 2048, var8 - 1, (byte) -124);
                }
            }
            if (arg0 == 2) {
                if (arg6 == 0) {
                    this.method1804(var9, 66560, var8, (byte) -124);
                    this.method1804(var9, 4096, var8 - 1, (byte) -124);
                    this.method1804(var9 + 1, 16384, var8, (byte) -124);
                }
                if (arg6 == 1) {
                    this.method1804(var9, 5120, var8, (byte) -124);
                    this.method1804(var9 + 1, 16384, var8, (byte) -124);
                    this.method1804(var9, 65536, var8 + 1, (byte) -124);
                }
                if (arg6 == 2) {
                    this.method1804(var9, 20480, var8, (byte) -124);
                    this.method1804(var9, 65536, var8 + 1, (byte) -124);
                    this.method1804(var9 - 1, 1024, var8, (byte) -124);
                }
                if (arg6 == 3) {
                    this.method1804(var9, 81920, var8, (byte) -124);
                    this.method1804(var9 - 1, 1024, var8, (byte) -124);
                    this.method1804(var9, 4096, var8 - 1, (byte) -124);
                }
            }
        }
        if (!arg2) {
            return;
        }
        if (arg0 == 0) {
            if (arg6 == 0) {
                this.method1804(var9, 536870912, var8, (byte) -124);
                this.method1804(var9, 33554432, var8 - 1, (byte) -124);
            }
            if (arg6 == 1) {
                this.method1804(var9, 8388608, var8, (byte) -124);
                this.method1804(var9 + 1, 134217728, var8, (byte) -124);
            }
            if (arg6 == 2) {
                this.method1804(var9, 33554432, var8, (byte) -124);
                this.method1804(var9, 536870912, var8 + 1, (byte) -124);
            }
            if (arg6 == 3) {
                this.method1804(var9, 134217728, var8, (byte) -124);
                this.method1804(var9 - 1, 8388608, var8, (byte) -124);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg6 == 0) {
                this.method1804(var9, 4194304, var8, (byte) -124);
                this.method1804(var9 + 1, 67108864, var8 - 1, (byte) -124);
            }
            if (arg6 == 1) {
                this.method1804(var9, 16777216, var8, (byte) -124);
                this.method1804(var9 + 1, 268435456, var8 + 1, (byte) -124);
            }
            if (arg6 == 2) {
                this.method1804(var9, 67108864, var8, (byte) -124);
                this.method1804(var9 - 1, 4194304, var8 + 1, (byte) -124);
            }
            if (arg6 == 3) {
                this.method1804(var9, 268435456, var8, (byte) -124);
                this.method1804(var9 - 1, 16777216, var8 - 1, (byte) -124);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg6 == 0) {
            this.method1804(var9, 545259520, var8, (byte) -124);
            this.method1804(var9, 33554432, var8 - 1, (byte) -124);
            this.method1804(var9 + 1, 134217728, var8, (byte) -124);
        }
        if (arg6 == 1) {
            this.method1804(var9, 41943040, var8, (byte) -124);
            this.method1804(var9 + 1, 134217728, var8, (byte) -124);
            this.method1804(var9, 536870912, var8 + 1, (byte) -124);
        }
        if (arg6 == 2) {
            this.method1804(var9, 167772160, var8, (byte) -124);
            this.method1804(var9, 536870912, var8 + 1, (byte) -124);
            this.method1804(var9 - 1, 8388608, var8, (byte) -124);
        }
        if (arg6 == 3) {
            this.method1804(var9, 671088640, var8, (byte) -124);
            this.method1804(var9 - 1, 8388608, var8, (byte) -124);
            this.method1804(var9, 33554432, var8 - 1, (byte) -124);
            return;
        }
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(I)V")
    public static void method1812(int arg0) {
        field3765 = null;
        if (arg0 != -10385) {
            method1815(-3, 50, 88);
        }
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(III)V")
    public final void method1813(int arg0, int arg1, int arg2) {
        field3763++;
        int var4 = arg2 - this.field3759;
        int var5 = arg0 - this.field3761;
        this.field3770[var4][var5] = class695.method3919(this.field3770[var4][var5], arg1);
    }

    @OriginalMember(owner = "client!caa", name = "b", descriptor = "(III)V")
    public final void method1814(int arg0, int arg1, int arg2) {
        field3776++;
        int var4 = arg0 - this.field3759;
        int var5 = arg2 - this.field3761;
        this.field3770[var4][var5] = class327.method1956(this.field3770[var4][var5], arg1);
    }

    @OriginalMember(owner = "client!caa", name = "c", descriptor = "(III)I")
    public static final int method1815(int arg0, int arg1, int arg2) {
        field3777++;
        int var3 = arg0 + (arg1 * 57);
        int var4 = var3 ^ var3 << 13;
        int var5 = arg2 & (var4 * 15731 * var4 + 789221) * var4 + 1376312589;
        return var5 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!caa", name = "b", descriptor = "(BII)V")
    public final void method1816(byte arg0, int arg1, int arg2) {
        if (arg0 == -34) {
            field3772++;
            int var4 = arg1 - this.field3759;
            int var5 = arg2 - this.field3761;
            this.field3770[var4][var5] = class695.method3919(this.field3770[var4][var5], 2097152);
        }
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method1817(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3766++;
        if (arg2 == 1) {
            if (arg5 == arg7 && arg1 == arg6) {
                return true;
            }
        } else if (arg5 <= arg7 && (arg2 + arg5 - 1) >= arg7 && arg6 <= arg6 && arg2 + arg6 - 1 >= arg6) {
            return true;
        }
        if (arg3 != 128) {
            this.field3769 = -46;
        }
        int var9 = arg6 - this.field3761;
        int var10 = arg7 - this.field3759;
        int var11 = arg1 - this.field3761;
        int var12 = arg5 - this.field3759;
        if (arg2 == 1) {
            if (arg0 == 6 || arg0 == 7) {
                if (arg0 == 7) {
                    arg4 = arg4 + 2 & 0x3;
                }
                if (arg4 == 0) {
                    if ((var10 + 1) == var12 && var9 == var11 && (this.field3770[var12][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var9 - 1) == var11 && (this.field3770[var12][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var10 - 1 == var12 && var9 == var11 && (this.field3770[var12][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var9 - 1 == var11 && (this.field3770[var12][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if (var10 - 1 == var12 && var9 == var11 && (this.field3770[var12][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var9 + 1) == var11 && (this.field3770[var12][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if ((var10 + 1) == var12 && var9 == var11 && (this.field3770[var12][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var9 + 1) == var11 && (this.field3770[var12][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 8) {
                if (var10 == var12 && (var9 + 1) == var11 && (this.field3770[var12][var11] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var12 && var9 - 1 == var11 && (this.field3770[var12][var11] & 0x2) == 0) {
                    return true;
                }
                if (var10 - 1 == var12 && var9 == var11 && (this.field3770[var12][var11] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var12 && var9 == var11 && (this.field3770[var12][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg2 + var12 - 1;
            int var14 = var11 + arg2 - 1;
            if (arg0 == 6 || arg0 == 7) {
                if (arg0 == 7) {
                    arg4 = arg4 + 2 & 0x3;
                }
                if (arg4 == 0) {
                    if ((var10 + 1) == var12 && var11 <= var9 && var14 >= var9 && (this.field3770[var12][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 >= var12 && var13 >= var10 && var9 - arg2 == var11 && (this.field3770[var10][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if ((var10 - arg2) == var12 && var9 >= var11 && var9 <= var14 && (this.field3770[var13][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 <= var10 && var10 <= var13 && var9 - arg2 == var11 && (this.field3770[var10][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if (var10 - arg2 == var12 && var11 <= var9 && var9 <= var14 && (this.field3770[var13][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 >= var12 && var10 <= var13 && (var9 + 1) == var11 && (this.field3770[var10][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if ((var10 + 1) == var12 && var11 <= var9 && var9 <= var14 && (this.field3770[var12][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 >= var12 && var10 <= var13 && (var9 + 1) == var11 && (this.field3770[var10][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 8) {
                if (var12 <= var10 && var10 <= var13 && var9 + 1 == var11 && (this.field3770[var10][var11] & 0x20) == 0) {
                    return true;
                }
                if (var10 >= var12 && var13 >= var10 && (var9 - arg2) == var11 && (this.field3770[var10][var14] & 0x2) == 0) {
                    return true;
                }
                if (var10 - arg2 == var12 && var11 <= var9 && var9 <= var14 && (this.field3770[var13][var9] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var12 && var11 <= var9 && var9 <= var14 && (this.field3770[var12][var9] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(IIII)V")
    private final void method1818(int arg0, int arg1, int arg2, int arg3) {
        this.field3770[arg3][arg2] = class327.method1956(this.field3770[arg3][arg2], ~arg1);
        field3764++;
        if (arg0 != 0) {
            this.method1816((byte) 95, 64, 106);
        }
    }

    @OriginalMember(owner = "client!caa", name = "b", descriptor = "(IIIIIIII)Z")
    public final boolean method1819(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3774++;
        if (arg7 == 1) {
            if (arg1 == arg4 && arg0 == arg3) {
                return true;
            }
        } else if (arg1 >= arg4 && arg4 - (1 - arg7) >= arg1 && arg3 <= arg3 && arg3 + arg7 - 1 >= arg3) {
            return true;
        }
        int var9 = arg0 - this.field3761;
        int var10 = arg3 - this.field3761;
        int var11 = arg4 - this.field3759;
        if (arg2 != 2883848) {
            return false;
        }
        int var12 = arg1 - this.field3759;
        if (arg7 == 1) {
            if (arg6 == 0) {
                if (arg5 == 0) {
                    if ((var12 - 1) == var11 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && var10 + 1 == var9 && (this.field3770[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var10 - 1 == var9 && (this.field3770[var11][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var11 == var12 && (var10 + 1) == var9) {
                        return true;
                    }
                    if (var12 - 1 == var11 && var9 == var10 && (this.field3770[var11][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var11 && var9 == var10 && (this.field3770[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if ((var12 + 1) == var11 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && var10 + 1 == var9 && (this.field3770[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var10 - 1 == var9 && (this.field3770[var11][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var11 == var12 && var10 - 1 == var9) {
                        return true;
                    }
                    if ((var12 - 1) == var11 && var9 == var10 && (this.field3770[var11][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var11 && var9 == var10 && (this.field3770[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg6 == 2) {
                if (arg5 == 0) {
                    if (var12 - 1 == var11 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && (var10 + 1) == var9) {
                        return true;
                    }
                    if (var12 + 1 == var11 && var9 == var10 && (this.field3770[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var10 - 1 == var9 && (this.field3770[var11][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var12 - 1 == var11 && var9 == var10 && (this.field3770[var11][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var10 + 1 == var9) {
                        return true;
                    }
                    if ((var12 + 1) == var11 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && var10 - 1 == var9 && (this.field3770[var11][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if (var12 - 1 == var11 && var9 == var10 && (this.field3770[var11][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var10 + 1 == var9 && (this.field3770[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var11 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && var10 - 1 == var9) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var12 - 1 == var11 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && (var10 + 1) == var9 && (this.field3770[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var11 && var9 == var10 && (this.field3770[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var10 - 1) == var9) {
                        return true;
                    }
                }
            }
            if (arg6 == 9) {
                if (var11 == var12 && (var10 + 1) == var9 && (this.field3770[var11][var9] & 0x20) == 0) {
                    return true;
                }
                if (var11 == var12 && (var10 - 1) == var9 && (this.field3770[var11][var9] & 0x2) == 0) {
                    return true;
                }
                if ((var12 - 1) == var11 && var9 == var10 && (this.field3770[var11][var9] & 0x8) == 0) {
                    return true;
                }
                if ((var12 + 1) == var11 && var9 == var10 && (this.field3770[var11][var9] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg7 + var11 - 1;
            int var14 = arg7 + var9 - 1;
            if (arg6 == 0) {
                if (arg5 == 0) {
                    if (var12 - arg7 == var11 && var10 >= var9 && var10 <= var14) {
                        return true;
                    }
                    if (var11 <= var12 && var13 >= var12 && var10 + 1 == var9 && (this.field3770[var12][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 <= var12 && var12 <= var13 && var10 - arg7 == var9 && (this.field3770[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var11 <= var12 && var12 <= var13 && (var10 + 1) == var9) {
                        return true;
                    }
                    if ((var12 - arg7) == var11 && var9 <= var10 && var10 <= var14 && (this.field3770[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var11 && var10 >= var9 && var10 <= var14 && (this.field3770[var11][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if (var12 + 1 == var11 && var10 >= var9 && var14 >= var10) {
                        return true;
                    }
                    if (var12 >= var11 && var12 <= var13 && var10 + 1 == var9 && (this.field3770[var12][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 >= var11 && var13 >= var12 && (var10 - arg7) == var9 && (this.field3770[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var11 <= var12 && var13 >= var12 && (var10 - arg7) == var9) {
                        return true;
                    }
                    if ((var12 - arg7) == var11 && var9 <= var10 && var10 <= var14 && (this.field3770[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var11 && var10 >= var9 && var14 >= var10 && (this.field3770[var11][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg6 == 2) {
                if (arg5 == 0) {
                    if ((var12 - arg7) == var11 && var9 <= var10 && var10 <= var14) {
                        return true;
                    }
                    if (var11 <= var12 && var12 <= var13 && var10 + 1 == var9) {
                        return true;
                    }
                    if ((var12 + 1) == var11 && var10 >= var9 && var14 >= var10 && (this.field3770[var11][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 <= var12 && var13 >= var12 && (var10 - arg7) == var9 && (this.field3770[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var12 - arg7 == var11 && var10 >= var9 && var10 <= var14 && (this.field3770[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 <= var12 && var12 <= var13 && (var10 + 1) == var9) {
                        return true;
                    }
                    if (var12 + 1 == var11 && var10 >= var9 && var10 <= var14) {
                        return true;
                    }
                    if (var12 >= var11 && var12 <= var13 && (var10 - arg7) == var9 && (this.field3770[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if (var12 - arg7 == var11 && var9 <= var10 && var14 >= var10 && (this.field3770[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 >= var11 && var12 <= var13 && (var10 + 1) == var9 && (this.field3770[var12][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var11 && var10 >= var9 && var10 <= var14) {
                        return true;
                    }
                    if (var11 <= var12 && var13 >= var12 && var10 - arg7 == var9) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if ((var12 - arg7) == var11 && var10 >= var9 && var10 <= var14) {
                        return true;
                    }
                    if (var12 >= var11 && var12 <= var13 && var10 + 1 == var9 && (this.field3770[var12][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var11 && var9 <= var10 && var10 <= var14 && (this.field3770[var11][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var12 >= var11 && var13 >= var12 && (var10 - arg7) == var9) {
                        return true;
                    }
                }
            }
            if (arg6 == 9) {
                if (var11 <= var12 && var13 >= var12 && (var10 + 1) == var9 && (this.field3770[var12][var9] & 0x2C0120) == 0) {
                    return true;
                }
                if (var11 <= var12 && var12 <= var13 && (var10 - arg7) == var9 && (this.field3770[var12][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if (var12 - arg7 == var11 && var10 >= var9 && var14 >= var10 && (this.field3770[var13][var10] & 0x2C0108) == 0) {
                    return true;
                }
                if ((var12 + 1) == var11 && var9 <= var10 && var14 >= var10 && (this.field3770[var11][var10] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(IIIZIIZI)V")
    public final void method1820(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, boolean arg6, int arg7) {
        field3779++;
        int var9 = 256;
        if (arg6) {
            var9 |= 0x20000;
        }
        int var10 = arg1 - this.field3759;
        if (arg3) {
            var9 |= 0x40000000;
        }
        int var11 = arg7 - this.field3761;
        if (arg4 == 1 || arg4 == 3) {
            int var12 = arg2;
            arg2 = arg5;
            arg5 = var12;
        }
        if (arg0 != 31903) {
            return;
        }
        for (int var13 = var10; var13 < arg2 + var10; var13++) {
            if (var13 >= 0 && var13 < this.field3767) {
                for (int var14 = var11; var14 < arg5 + var11; var14++) {
                    if (var14 >= 0 && var14 < this.field3769) {
                        this.method1818(0, var9, var14, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(ZIIZIZI)V")
    public final void method1821(boolean arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5, int arg6) {
        int var8 = arg1 - this.field3759;
        field3781++;
        int var9 = arg2 - this.field3761;
        if (arg6 == 0) {
            if (arg4 == 0) {
                this.method1818(0, 128, var9, var8);
                this.method1818(0, 8, var9, var8 - 1);
            }
            if (arg4 == 1) {
                this.method1818(0, 2, var9, var8);
                this.method1818(0, 32, var9 + 1, var8);
            }
            if (arg4 == 2) {
                this.method1818(0, 8, var9, var8);
                this.method1818(0, 128, var9, var8 + 1);
            }
            if (arg4 == 3) {
                this.method1818(0, 32, var9, var8);
                this.method1818(0, 2, var9 - 1, var8);
            }
        }
        if (arg6 == 1 || arg6 == 3) {
            if (arg4 == 0) {
                this.method1818(0, 1, var9, var8);
                this.method1818(0, 16, var9 + 1, var8 - 1);
            }
            if (arg4 == 1) {
                this.method1818(0, 4, var9, var8);
                this.method1818(0, 64, var9 + 1, var8 + 1);
            }
            if (arg4 == 2) {
                this.method1818(0, 16, var9, var8);
                this.method1818(0, 1, var9 - 1, var8 - -1);
            }
            if (arg4 == 3) {
                this.method1818(0, 64, var9, var8);
                this.method1818(0, 4, var9 - 1, var8 + -1);
            }
        }
        if (arg6 == 2) {
            if (arg4 == 0) {
                this.method1818(0, 130, var9, var8);
                this.method1818(0, 8, var9, var8 - 1);
                this.method1818(0, 32, var9 + 1, var8);
            }
            if (arg4 == 1) {
                this.method1818(0, 10, var9, var8);
                this.method1818(0, 32, var9 + 1, var8);
                this.method1818(0, 128, var9, var8 + 1);
            }
            if (arg4 == 2) {
                this.method1818(0, 40, var9, var8);
                this.method1818(0, 128, var9, var8 + 1);
                this.method1818(0, 2, var9 - 1, var8);
            }
            if (arg4 == 3) {
                this.method1818(0, 160, var9, var8);
                this.method1818(0, 2, var9 - 1, var8);
                this.method1818(0, 8, var9, var8 - 1);
            }
        }
        if (arg5) {
            this.field3759 = 14;
        }
        if (arg0) {
            if (arg6 == 0) {
                if (arg4 == 0) {
                    this.method1818(0, 65536, var9, var8);
                    this.method1818(0, 4096, var9, var8 - 1);
                }
                if (arg4 == 1) {
                    this.method1818(0, 1024, var9, var8);
                    this.method1818(0, 16384, var9 + 1, var8);
                }
                if (arg4 == 2) {
                    this.method1818(0, 4096, var9, var8);
                    this.method1818(0, 65536, var9, var8 + 1);
                }
                if (arg4 == 3) {
                    this.method1818(0, 16384, var9, var8);
                    this.method1818(0, 1024, var9 - 1, var8);
                }
            }
            if (arg6 == 1 || arg6 == 3) {
                if (arg4 == 0) {
                    this.method1818(0, 512, var9, var8);
                    this.method1818(0, 8192, var9 + 1, var8 - 1);
                }
                if (arg4 == 1) {
                    this.method1818(0, 2048, var9, var8);
                    this.method1818(0, 32768, var9 + 1, var8 + 1);
                }
                if (arg4 == 2) {
                    this.method1818(0, 8192, var9, var8);
                    this.method1818(0, 512, var9 - 1, var8 + 1);
                }
                if (arg4 == 3) {
                    this.method1818(0, 32768, var9, var8);
                    this.method1818(0, 2048, var9 - 1, var8 + -1);
                }
            }
            if (arg6 == 2) {
                if (arg4 == 0) {
                    this.method1818(0, 66560, var9, var8);
                    this.method1818(0, 4096, var9, var8 - 1);
                    this.method1818(0, 16384, var9 + 1, var8);
                }
                if (arg4 == 1) {
                    this.method1818(0, 5120, var9, var8);
                    this.method1818(0, 16384, var9 + 1, var8);
                    this.method1818(0, 65536, var9, var8 + 1);
                }
                if (arg4 == 2) {
                    this.method1818(0, 20480, var9, var8);
                    this.method1818(0, 65536, var9, var8 + 1);
                    this.method1818(0, 1024, var9 - 1, var8);
                }
                if (arg4 == 3) {
                    this.method1818(0, 81920, var9, var8);
                    this.method1818(0, 1024, var9 - 1, var8);
                    this.method1818(0, 4096, var9, var8 - 1);
                }
            }
        }
        if (!arg3) {
            return;
        }
        if (arg6 == 0) {
            if (arg4 == 0) {
                this.method1818(0, 536870912, var9, var8);
                this.method1818(0, 33554432, var9, var8 - 1);
            }
            if (arg4 == 1) {
                this.method1818(0, 8388608, var9, var8);
                this.method1818(0, 134217728, var9 + 1, var8);
            }
            if (arg4 == 2) {
                this.method1818(0, 33554432, var9, var8);
                this.method1818(0, 536870912, var9, var8 + 1);
            }
            if (arg4 == 3) {
                this.method1818(0, 134217728, var9, var8);
                this.method1818(0, 8388608, var9 - 1, var8);
            }
        }
        if (arg6 == 1 || arg6 == 3) {
            if (arg4 == 0) {
                this.method1818(0, 4194304, var9, var8);
                this.method1818(0, 67108864, var9 + 1, var8 + -1);
            }
            if (arg4 == 1) {
                this.method1818(0, 16777216, var9, var8);
                this.method1818(0, 268435456, var9 + 1, var8 + 1);
            }
            if (arg4 == 2) {
                this.method1818(0, 67108864, var9, var8);
                this.method1818(0, 4194304, var9 - 1, var8 - -1);
            }
            if (arg4 == 3) {
                this.method1818(0, 268435456, var9, var8);
                this.method1818(0, 16777216, var9 - 1, var8 + -1);
            }
        }
        if (arg6 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method1818(0, 545259520, var9, var8);
            this.method1818(0, 33554432, var9, var8 - 1);
            this.method1818(0, 134217728, var9 + 1, var8);
        }
        if (arg4 == 1) {
            this.method1818(0, 41943040, var9, var8);
            this.method1818(0, 134217728, var9 + 1, var8);
            this.method1818(0, 536870912, var9, var8 + 1);
        }
        if (arg4 == 2) {
            this.method1818(0, 167772160, var9, var8);
            this.method1818(0, 536870912, var9, var8 + 1);
            this.method1818(0, 8388608, var9 - 1, var8);
        }
        if (arg4 == 3) {
            this.method1818(0, 671088640, var9, var8);
            this.method1818(0, 8388608, var9 - 1, var8);
            this.method1818(0, 33554432, var9, var8 - 1);
            return;
        }
    }
}
