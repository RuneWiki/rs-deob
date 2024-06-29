import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public class class238 {

    @OriginalMember(owner = "client!up", name = "s", descriptor = "Z")
    public static boolean field3835 = false;

    @OriginalMember(owner = "client!up", name = "n", descriptor = "Llw;")
    public static class233 field3830 = new class233(4);

    @OriginalMember(owner = "client!up", name = "A", descriptor = "Lln;")
    public static class472 field3843 = new class472(7, 0, 1, 1);

    @OriginalMember(owner = "client!up", name = "a", descriptor = "I")
    public static int field3817;

    @OriginalMember(owner = "client!up", name = "b", descriptor = "I")
    public static int field3818;

    @OriginalMember(owner = "client!up", name = "c", descriptor = "I")
    public static int field3819;

    @OriginalMember(owner = "client!up", name = "d", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!up", name = "e", descriptor = "I")
    public static int field3821;

    @OriginalMember(owner = "client!up", name = "f", descriptor = "I")
    public int field3822;

    @OriginalMember(owner = "client!up", name = "g", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!up", name = "h", descriptor = "I")
    public int field3824;

    @OriginalMember(owner = "client!up", name = "i", descriptor = "I")
    public static int field3825;

    @OriginalMember(owner = "client!up", name = "j", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!up", name = "k", descriptor = "I")
    public static int field3827;

    @OriginalMember(owner = "client!up", name = "l", descriptor = "I")
    public int field3828;

    @OriginalMember(owner = "client!up", name = "m", descriptor = "I")
    public static int field3829;

    @OriginalMember(owner = "client!up", name = "p", descriptor = "I")
    public int field3832;

    @OriginalMember(owner = "client!up", name = "q", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!up", name = "r", descriptor = "I")
    public static int field3834;

    @OriginalMember(owner = "client!up", name = "t", descriptor = "I")
    public static int field3836;

    @OriginalMember(owner = "client!up", name = "u", descriptor = "I")
    public static int field3837;

    @OriginalMember(owner = "client!up", name = "v", descriptor = "I")
    public static int field3838;

    @OriginalMember(owner = "client!up", name = "w", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!up", name = "x", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!up", name = "y", descriptor = "I")
    public static int field3841;

    @OriginalMember(owner = "client!up", name = "z", descriptor = "I")
    public static int field3842;

    @OriginalMember(owner = "client!up", name = "o", descriptor = "[[I")
    public int[][] field3831;

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IIII)V", line = 4)
    private final void method1636(int arg0, int arg1, int arg2, int arg3) {
        field3829++;
        if (arg3 == 2883842) {
            this.field3831[arg0][arg1] = class636.method3603(this.field3831[arg0][arg1], ~arg2);
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IIIIIIZI)Z", line = 16)
    public final boolean method1637(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        field3823++;
        if (arg2 == 1) {
            if (arg0 == arg7 && arg1 == arg4) {
                return true;
            }
        } else if (arg7 >= arg0 && arg7 <= (arg2 + arg0 - 1) && arg1 <= arg1 && arg1 <= (arg1 - (1 - arg2))) {
            return true;
        }
        int var9 = arg4 - this.field3828;
        int var10 = arg7 - this.field3832;
        int var11 = arg1 - this.field3828;
        if (!arg6) {
            this.method1653(9, (byte) -120, 114);
        }
        int var12 = arg0 - this.field3832;
        if (arg2 == 1) {
            if (arg3 == 0) {
                if (arg5 == 0) {
                    if (var10 - 1 == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && (var11 + 1) == var9 && (this.field3831[var12][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var11 - 1) == var9 && (this.field3831[var12][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var10 == var12 && var11 + 1 == var9) {
                        return true;
                    }
                    if ((var10 - 1) == var12 && var9 == var11 && (this.field3831[var12][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var9 == var11 && (this.field3831[var12][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if (var10 + 1 == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && var11 + 1 == var9 && (this.field3831[var12][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var11 - 1) == var9 && (this.field3831[var12][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var10 == var12 && var11 - 1 == var9) {
                        return true;
                    }
                    if (var10 - 1 == var12 && var9 == var11 && (this.field3831[var12][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var9 == var11 && (this.field3831[var12][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 2) {
                if (arg5 == 0) {
                    if (var10 - 1 == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && (var11 + 1) == var9) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var9 == var11 && (this.field3831[var12][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var11 - 1) == var9 && (this.field3831[var12][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if ((var10 - 1) == var12 && var9 == var11 && (this.field3831[var12][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var11 + 1 == var9) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && (var11 - 1) == var9 && (this.field3831[var12][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if ((var10 - 1) == var12 && var9 == var11 && (this.field3831[var12][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var11 + 1) == var9 && (this.field3831[var12][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && (var11 - 1) == var9) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var10 - 1 == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && (var11 + 1) == var9 && (this.field3831[var12][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var9 == var11 && (this.field3831[var12][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var11 - 1) == var9) {
                        return true;
                    }
                }
            }
            if (arg3 == 9) {
                if (var10 == var12 && (var11 + 1) == var9 && (this.field3831[var12][var9] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var12 && (var11 - 1) == var9 && (this.field3831[var12][var9] & 0x2) == 0) {
                    return true;
                }
                if (var10 - 1 == var12 && var9 == var11 && (this.field3831[var12][var9] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var12 && var9 == var11 && (this.field3831[var12][var9] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg2 + var12 - 1;
            int var14 = var9 + arg2 - 1;
            if (arg3 == 0) {
                if (arg5 == 0) {
                    if ((var10 - arg2) == var12 && var9 <= var11 && var14 >= var11) {
                        return true;
                    }
                    if (var12 <= var10 && var10 <= var13 && (var11 + 1) == var9 && (this.field3831[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 <= var10 && var13 >= var10 && var11 - arg2 == var9 && (this.field3831[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var12 <= var10 && var10 <= var13 && (var11 + 1) == var9) {
                        return true;
                    }
                    if (var10 - arg2 == var12 && var9 <= var11 && var14 >= var11 && (this.field3831[var13][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var11 >= var9 && var14 >= var11 && (this.field3831[var12][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if ((var10 + 1) == var12 && var11 >= var9 && var11 <= var14) {
                        return true;
                    }
                    if (var10 >= var12 && var10 <= var13 && var11 + 1 == var9 && (this.field3831[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 >= var12 && var10 <= var13 && (var11 - arg2) == var9 && (this.field3831[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var12 <= var10 && var13 >= var10 && (var11 - arg2) == var9) {
                        return true;
                    }
                    if ((var10 - arg2) == var12 && var9 <= var11 && var14 >= var11 && (this.field3831[var13][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var11 >= var9 && var11 <= var14 && (this.field3831[var12][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 2) {
                if (arg5 == 0) {
                    if (var10 - arg2 == var12 && var9 <= var11 && var11 <= var14) {
                        return true;
                    }
                    if (var12 <= var10 && var13 >= var10 && var11 + 1 == var9) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var11 >= var9 && var14 >= var11 && (this.field3831[var12][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 >= var12 && var13 >= var10 && var11 - arg2 == var9 && (this.field3831[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if ((var10 - arg2) == var12 && var11 >= var9 && var11 <= var14 && (this.field3831[var13][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 <= var10 && var13 >= var10 && var11 + 1 == var9) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var9 <= var11 && var11 <= var14) {
                        return true;
                    }
                    if (var12 <= var10 && var10 <= var13 && (var11 - arg2) == var9 && (this.field3831[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if (var10 - arg2 == var12 && var9 <= var11 && var14 >= var11 && (this.field3831[var13][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 >= var12 && var10 <= var13 && var11 + 1 == var9 && (this.field3831[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var11 >= var9 && var11 <= var14) {
                        return true;
                    }
                    if (var10 >= var12 && var10 <= var13 && var11 - arg2 == var9) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if ((var10 - arg2) == var12 && var11 >= var9 && var11 <= var14) {
                        return true;
                    }
                    if (var12 <= var10 && var10 <= var13 && (var11 + 1) == var9 && (this.field3831[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var9 <= var11 && var11 <= var14 && (this.field3831[var12][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var12 <= var10 && var13 >= var10 && (var11 - arg2) == var9) {
                        return true;
                    }
                }
            }
            if (arg3 == 9) {
                if (var12 <= var10 && var10 <= var13 && var11 + 1 == var9 && (this.field3831[var10][var9] & 0x2C0120) == 0) {
                    return true;
                }
                if (var10 >= var12 && var10 <= var13 && var11 - arg2 == var9 && (this.field3831[var10][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if ((var10 - arg2) == var12 && var9 <= var11 && var14 >= var11 && (this.field3831[var13][var11] & 0x2C0108) == 0) {
                    return true;
                }
                if (var10 + 1 == var12 && var9 <= var11 && var11 <= var14 && (this.field3831[var12][var11] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(ZIIIZIZ)V", line = 392)
    public final void method1638(boolean arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, boolean arg6) {
        field3842++;
        if (!arg6) {
            method1645(-24);
        }
        int var8 = arg5 - this.field3828;
        int var9 = arg1 - this.field3832;
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method1636(var9, var8, 128, 2883842);
                this.method1636(var9 - 1, var8, 8, 2883842);
            }
            if (arg3 == 1) {
                this.method1636(var9, var8, 2, 2883842);
                this.method1636(var9, var8 + 1, 32, 2883842);
            }
            if (arg3 == 2) {
                this.method1636(var9, var8, 8, 2883842);
                this.method1636(var9 + 1, var8, 128, 2883842);
            }
            if (arg3 == 3) {
                this.method1636(var9, var8, 32, 2883842);
                this.method1636(var9, var8 - 1, 2, 2883842);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method1636(var9, var8, 1, 2883842);
                this.method1636(var9 - 1, var8 + 1, 16, 2883842);
            }
            if (arg3 == 1) {
                this.method1636(var9, var8, 4, 2883842);
                this.method1636(var9 + 1, var8 - -1, 64, 2883842);
            }
            if (arg3 == 2) {
                this.method1636(var9, var8, 16, 2883842);
                this.method1636(var9 + 1, var8 + -1, 1, 2883842);
            }
            if (arg3 == 3) {
                this.method1636(var9, var8, 64, 2883842);
                this.method1636(var9 - 1, var8 + -1, 4, 2883842);
            }
        }
        if (arg2 == 2) {
            if (arg3 == 0) {
                this.method1636(var9, var8, 130, 2883842);
                this.method1636(var9 - 1, var8, 8, 2883842);
                this.method1636(var9, var8 + 1, 32, 2883842);
            }
            if (arg3 == 1) {
                this.method1636(var9, var8, 10, 2883842);
                this.method1636(var9, var8 + 1, 32, 2883842);
                this.method1636(var9 + 1, var8, 128, 2883842);
            }
            if (arg3 == 2) {
                this.method1636(var9, var8, 40, 2883842);
                this.method1636(var9 + 1, var8, 128, 2883842);
                this.method1636(var9, var8 - 1, 2, 2883842);
            }
            if (arg3 == 3) {
                this.method1636(var9, var8, 160, 2883842);
                this.method1636(var9, var8 - 1, 2, 2883842);
                this.method1636(var9 - 1, var8, 8, 2883842);
            }
        }
        if (arg4) {
            if (arg2 == 0) {
                if (arg3 == 0) {
                    this.method1636(var9, var8, 65536, 2883842);
                    this.method1636(var9 - 1, var8, 4096, 2883842);
                }
                if (arg3 == 1) {
                    this.method1636(var9, var8, 1024, 2883842);
                    this.method1636(var9, var8 + 1, 16384, 2883842);
                }
                if (arg3 == 2) {
                    this.method1636(var9, var8, 4096, 2883842);
                    this.method1636(var9 + 1, var8, 65536, 2883842);
                }
                if (arg3 == 3) {
                    this.method1636(var9, var8, 16384, 2883842);
                    this.method1636(var9, var8 - 1, 1024, 2883842);
                }
            }
            if (arg2 == 1 || arg2 == 3) {
                if (arg3 == 0) {
                    this.method1636(var9, var8, 512, 2883842);
                    this.method1636(var9 - 1, var8 - -1, 8192, 2883842);
                }
                if (arg3 == 1) {
                    this.method1636(var9, var8, 2048, 2883842);
                    this.method1636(var9 + 1, var8 + 1, 32768, 2883842);
                }
                if (arg3 == 2) {
                    this.method1636(var9, var8, 8192, 2883842);
                    this.method1636(var9 + 1, var8 + -1, 512, 2883842);
                }
                if (arg3 == 3) {
                    this.method1636(var9, var8, 32768, 2883842);
                    this.method1636(var9 - 1, var8 + -1, 2048, 2883842);
                }
            }
            if (arg2 == 2) {
                if (arg3 == 0) {
                    this.method1636(var9, var8, 66560, 2883842);
                    this.method1636(var9 - 1, var8, 4096, 2883842);
                    this.method1636(var9, var8 + 1, 16384, 2883842);
                }
                if (arg3 == 1) {
                    this.method1636(var9, var8, 5120, 2883842);
                    this.method1636(var9, var8 + 1, 16384, 2883842);
                    this.method1636(var9 + 1, var8, 65536, 2883842);
                }
                if (arg3 == 2) {
                    this.method1636(var9, var8, 20480, 2883842);
                    this.method1636(var9 + 1, var8, 65536, 2883842);
                    this.method1636(var9, var8 - 1, 1024, 2883842);
                }
                if (arg3 == 3) {
                    this.method1636(var9, var8, 81920, 2883842);
                    this.method1636(var9, var8 - 1, 1024, 2883842);
                    this.method1636(var9 - 1, var8, 4096, 2883842);
                }
            }
        }
        if (!arg0) {
            return;
        }
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method1636(var9, var8, 536870912, 2883842);
                this.method1636(var9 - 1, var8, 33554432, 2883842);
            }
            if (arg3 == 1) {
                this.method1636(var9, var8, 8388608, 2883842);
                this.method1636(var9, var8 + 1, 134217728, 2883842);
            }
            if (arg3 == 2) {
                this.method1636(var9, var8, 33554432, 2883842);
                this.method1636(var9 + 1, var8, 536870912, 2883842);
            }
            if (arg3 == 3) {
                this.method1636(var9, var8, 134217728, 2883842);
                this.method1636(var9, var8 - 1, 8388608, 2883842);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method1636(var9, var8, 4194304, 2883842);
                this.method1636(var9 - 1, var8 + 1, 67108864, 2883842);
            }
            if (arg3 == 1) {
                this.method1636(var9, var8, 16777216, 2883842);
                this.method1636(var9 + 1, var8 + 1, 268435456, 2883842);
            }
            if (arg3 == 2) {
                this.method1636(var9, var8, 67108864, 2883842);
                this.method1636(var9 + 1, var8 + -1, 4194304, 2883842);
            }
            if (arg3 == 3) {
                this.method1636(var9, var8, 268435456, 2883842);
                this.method1636(var9 - 1, var8 + -1, 16777216, 2883842);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method1636(var9, var8, 545259520, 2883842);
            this.method1636(var9 - 1, var8, 33554432, 2883842);
            this.method1636(var9, var8 + 1, 134217728, 2883842);
        }
        if (arg3 == 1) {
            this.method1636(var9, var8, 41943040, 2883842);
            this.method1636(var9, var8 + 1, 134217728, 2883842);
            this.method1636(var9 + 1, var8, 536870912, 2883842);
        }
        if (arg3 == 2) {
            this.method1636(var9, var8, 167772160, 2883842);
            this.method1636(var9 + 1, var8, 536870912, 2883842);
            this.method1636(var9, var8 - 1, 8388608, 2883842);
        }
        if (arg3 == 3) {
            this.method1636(var9, var8, 671088640, 2883842);
            this.method1636(var9, var8 - 1, 8388608, 2883842);
            this.method1636(var9 - 1, var8, 33554432, 2883842);
            return;
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(III)V", line = 708)
    public final void method1639(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field3828;
        field3838++;
        int var5 = arg0 - this.field3832;
        this.field3831[var5][var4] = class636.method3603(this.field3831[var5][var4], arg2);
    }

    @OriginalMember(owner = "client!up", name = "b", descriptor = "(IIII)V", line = 728)
    private final void method1640(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == -1) {
            this.field3831[arg3][arg0] = class112.method903(this.field3831[arg3][arg0], arg1);
            field3840++;
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IIIIZZI)V", line = 741)
    public final void method1641(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5, int arg6) {
        field3820++;
        int var8 = 256;
        if (arg5) {
            var8 |= 0x20000;
        }
        int var9 = arg2 - this.field3828;
        if (arg4) {
            var8 |= 0x40000000;
        }
        if (arg1 != -1) {
            this.method1640(32, 1, 99, -113);
        }
        int var10 = arg3 - this.field3832;
        for (int var11 = var10; var11 < arg0 + var10; var11++) {
            if (var11 >= 0 && this.field3824 > var11) {
                for (int var12 = var9; var12 < (var9 + arg6); var12++) {
                    if (var12 >= 0 && this.field3822 > var12) {
                        this.method1640(var12, var8, arg1, var11);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IIIIIZZI)V", line = 788)
    public final void method1642(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6, int arg7) {
        field3839++;
        int var9 = 256;
        if (arg5) {
            var9 |= 0x20000;
        }
        int var10 = arg1 - this.field3828;
        if (arg6) {
            var9 |= 0x40000000;
        }
        int var11 = arg0 - this.field3832;
        if (arg4 != 11313) {
            return;
        }
        if (arg3 == 1 || arg3 == 3) {
            int var12 = arg2;
            arg2 = arg7;
            arg7 = var12;
        }
        for (int var13 = var11; var13 < (arg2 + var11); var13++) {
            if (var13 >= 0 && this.field3824 > var13) {
                for (int var14 = var10; var14 < var10 + arg7; var14++) {
                    if (var14 >= 0 && this.field3822 > var14) {
                        this.method1636(var13, var14, var9, 2883842);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IIZZIII)V", line = 844)
    public final void method1643(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field3818++;
        int var8 = arg1 - this.field3828;
        int var9 = arg0 - this.field3832;
        if (arg5 == 0) {
            if (arg4 == 0) {
                this.method1640(var8, 128, -1, var9);
                this.method1640(var8, 8, -1, var9 - 1);
            }
            if (arg4 == 1) {
                this.method1640(var8, 2, -1, var9);
                this.method1640(var8 + 1, 32, -1, var9);
            }
            if (arg4 == 2) {
                this.method1640(var8, 8, -1, var9);
                this.method1640(var8, 128, -1, var9 + 1);
            }
            if (arg4 == 3) {
                this.method1640(var8, 32, -1, var9);
                this.method1640(var8 - 1, 2, -1, var9);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg4 == 0) {
                this.method1640(var8, 1, -1, var9);
                this.method1640(var8 + 1, 16, -1, var9 - 1);
            }
            if (arg4 == 1) {
                this.method1640(var8, 4, -1, var9);
                this.method1640(var8 + 1, 64, -1, var9 + 1);
            }
            if (arg4 == 2) {
                this.method1640(var8, 16, -1, var9);
                this.method1640(var8 - 1, 1, -1, var9 + 1);
            }
            if (arg4 == 3) {
                this.method1640(var8, 64, -1, var9);
                this.method1640(var8 - 1, 4, -1, var9 - 1);
            }
        }
        if (arg5 == 2) {
            if (arg4 == 0) {
                this.method1640(var8, 130, -1, var9);
                this.method1640(var8, 8, -1, var9 - 1);
                this.method1640(var8 + 1, 32, -1, var9);
            }
            if (arg4 == 1) {
                this.method1640(var8, 10, -1, var9);
                this.method1640(var8 + 1, 32, -1, var9);
                this.method1640(var8, 128, -1, var9 + 1);
            }
            if (arg4 == 2) {
                this.method1640(var8, 40, -1, var9);
                this.method1640(var8, 128, -1, var9 + 1);
                this.method1640(var8 - 1, 2, -1, var9);
            }
            if (arg4 == 3) {
                this.method1640(var8, 160, -1, var9);
                this.method1640(var8 - 1, 2, -1, var9);
                this.method1640(var8, 8, -1, var9 - 1);
            }
        }
        if (arg6 > -126) {
            this.method1648(39, -89, -64, -44, -24, -30, 25, 87, -44, 112);
        }
        if (arg3) {
            if (arg5 == 0) {
                if (arg4 == 0) {
                    this.method1640(var8, 65536, -1, var9);
                    this.method1640(var8, 4096, -1, var9 - 1);
                }
                if (arg4 == 1) {
                    this.method1640(var8, 1024, -1, var9);
                    this.method1640(var8 + 1, 16384, -1, var9);
                }
                if (arg4 == 2) {
                    this.method1640(var8, 4096, -1, var9);
                    this.method1640(var8, 65536, -1, var9 + 1);
                }
                if (arg4 == 3) {
                    this.method1640(var8, 16384, -1, var9);
                    this.method1640(var8 - 1, 1024, -1, var9);
                }
            }
            if (arg5 == 1 || arg5 == 3) {
                if (arg4 == 0) {
                    this.method1640(var8, 512, -1, var9);
                    this.method1640(var8 + 1, 8192, -1, var9 - 1);
                }
                if (arg4 == 1) {
                    this.method1640(var8, 2048, -1, var9);
                    this.method1640(var8 + 1, 32768, -1, var9 + 1);
                }
                if (arg4 == 2) {
                    this.method1640(var8, 8192, -1, var9);
                    this.method1640(var8 - 1, 512, -1, var9 + 1);
                }
                if (arg4 == 3) {
                    this.method1640(var8, 32768, -1, var9);
                    this.method1640(var8 - 1, 2048, -1, var9 - 1);
                }
            }
            if (arg5 == 2) {
                if (arg4 == 0) {
                    this.method1640(var8, 66560, -1, var9);
                    this.method1640(var8, 4096, -1, var9 - 1);
                    this.method1640(var8 + 1, 16384, -1, var9);
                }
                if (arg4 == 1) {
                    this.method1640(var8, 5120, -1, var9);
                    this.method1640(var8 + 1, 16384, -1, var9);
                    this.method1640(var8, 65536, -1, var9 + 1);
                }
                if (arg4 == 2) {
                    this.method1640(var8, 20480, -1, var9);
                    this.method1640(var8, 65536, -1, var9 + 1);
                    this.method1640(var8 - 1, 1024, -1, var9);
                }
                if (arg4 == 3) {
                    this.method1640(var8, 81920, -1, var9);
                    this.method1640(var8 - 1, 1024, -1, var9);
                    this.method1640(var8, 4096, -1, var9 - 1);
                }
            }
        }
        if (!arg2) {
            return;
        }
        if (arg5 == 0) {
            if (arg4 == 0) {
                this.method1640(var8, 536870912, -1, var9);
                this.method1640(var8, 33554432, -1, var9 - 1);
            }
            if (arg4 == 1) {
                this.method1640(var8, 8388608, -1, var9);
                this.method1640(var8 + 1, 134217728, -1, var9);
            }
            if (arg4 == 2) {
                this.method1640(var8, 33554432, -1, var9);
                this.method1640(var8, 536870912, -1, var9 + 1);
            }
            if (arg4 == 3) {
                this.method1640(var8, 134217728, -1, var9);
                this.method1640(var8 - 1, 8388608, -1, var9);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg4 == 0) {
                this.method1640(var8, 4194304, -1, var9);
                this.method1640(var8 + 1, 67108864, -1, var9 - 1);
            }
            if (arg4 == 1) {
                this.method1640(var8, 16777216, -1, var9);
                this.method1640(var8 + 1, 268435456, -1, var9 + 1);
            }
            if (arg4 == 2) {
                this.method1640(var8, 67108864, -1, var9);
                this.method1640(var8 - 1, 4194304, -1, var9 + 1);
            }
            if (arg4 == 3) {
                this.method1640(var8, 268435456, -1, var9);
                this.method1640(var8 - 1, 16777216, -1, var9 - 1);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method1640(var8, 545259520, -1, var9);
            this.method1640(var8, 33554432, -1, var9 - 1);
            this.method1640(var8 + 1, 134217728, -1, var9);
        }
        if (arg4 == 1) {
            this.method1640(var8, 41943040, -1, var9);
            this.method1640(var8 + 1, 134217728, -1, var9);
            this.method1640(var8, 536870912, -1, var9 + 1);
        }
        if (arg4 == 2) {
            this.method1640(var8, 167772160, -1, var9);
            this.method1640(var8, 536870912, -1, var9 + 1);
            this.method1640(var8 - 1, 8388608, -1, var9);
        }
        if (arg4 == 3) {
            this.method1640(var8, 671088640, -1, var9);
            this.method1640(var8 - 1, 8388608, -1, var9);
            this.method1640(var8, 33554432, -1, var9 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IIZZ)I", line = 1154)
    public static final int method1644(int arg0, int arg1, boolean arg2, boolean arg3) {
        if (arg3) {
            return 55;
        }
        field3819++;
        class33 var4 = class446.method2724(arg1, 9, arg2);
        if (var4 == null) {
            return 0;
        } else if (arg0 >= 0 && arg0 < var4.field310.length) {
            return var4.field310[arg0];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(I)V", line = 1182)
    public static void method1645(int arg0) {
        field3830 = null;
        if (arg0 != 1) {
            field3834 = 7;
        }
        field3843 = null;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IIIIIBIII)Z", line = 1199)
    public final boolean method1646(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8) {
        field3833++;
        if (arg7 > 1) {
            return class590.method3391((byte) -76, arg0, arg8, arg3, arg7, arg7, arg2, arg1, arg4) ? true : this.method1648(arg2, arg7, arg7, arg8, arg3, arg1, arg4, -16827, arg0, arg6);
        }
        int var10 = -98 / ((arg5 + 12) / 37);
        int var11 = arg0 + arg1 - 1;
        int var12 = arg4 + arg8 - 1;
        if (arg2 >= arg0 && arg2 <= var11 && arg8 <= arg3 && var12 >= arg3) {
            return true;
        } else if ((arg0 - 1) == arg2 && arg3 >= arg8 && var12 >= arg3 && (this.field3831[arg2 - this.field3832][arg3 - this.field3828] & 0x8) == 0 && (arg6 & 0x8) == 0) {
            return true;
        } else if ((var11 + 1) == arg2 && arg8 <= arg3 && var12 >= arg3 && (this.field3831[arg2 - this.field3832][arg3 - this.field3828] & 0x80) == 0 && (arg6 & 0x2) == 0) {
            return true;
        } else if (arg8 - 1 == arg3 && arg2 >= arg0 && var11 >= arg2 && (this.field3831[arg2 - this.field3832][arg3 - this.field3828] & 0x2) == 0 && (arg6 & 0x4) == 0) {
            return true;
        } else {
            return (var12 + 1) == arg3 && arg0 <= arg2 && var11 >= arg2 && (this.field3831[arg2 - this.field3832][arg3 - this.field3828] & 0x20) == 0 && (arg6 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IIZ)V", line = 1250)
    public final void method1647(int arg0, int arg1, boolean arg2) {
        int var4 = arg0 - this.field3828;
        if (!arg2) {
            this.method1636(74, -21, -6, -28);
        }
        field3827++;
        int var5 = arg1 - this.field3832;
        this.field3831[var5][var4] = class112.method903(this.field3831[var5][var4], 262144);
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IIIIIIIIII)Z", line = 1263)
    public final boolean method1648(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3817++;
        int var11 = arg0 + arg1;
        int var12 = arg2 + arg4;
        int var13 = arg8 + arg5;
        if (arg7 != -16827) {
            return true;
        }
        int var14 = arg3 + arg6;
        if (arg0 == var13 && (arg9 & 0x2) == 0) {
            int var15 = arg3 >= arg4 ? arg3 : arg4;
            int var16 = var12 < var14 ? var12 : var14;
            while (var16 > var15) {
                if ((this.field3831[var13 - this.field3832 - 1][var15 - this.field3828] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg8 == var11 && (arg9 & 0x8) == 0) {
            int var17 = arg4 <= arg3 ? arg3 : arg4;
            int var18 = var14 <= var12 ? var14 : var12;
            while (var17 < var18) {
                if ((this.field3831[arg8 - this.field3832][var17 - this.field3828] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg4 == var14 && (arg9 & 0x1) == 0) {
            int var19 = arg0 > arg8 ? arg0 : arg8;
            int var20 = var11 >= var13 ? var13 : var11;
            while (var20 > var19) {
                if ((this.field3831[var19 - this.field3832][var14 - this.field3828 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg3 == var12 && (arg9 & 0x4) == 0) {
            int var21 = arg8 >= arg0 ? arg8 : arg0;
            int var22 = var13 > var11 ? var11 : var13;
            while (var21 < var22) {
                if ((this.field3831[var21 - this.field3832][arg3 - this.field3828] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(BII)V", line = 1360)
    public final void method1649(byte arg0, int arg1, int arg2) {
        field3825++;
        int var4 = arg2 - this.field3832;
        int var5 = arg1 - this.field3828;
        this.field3831[var4][var5] = class636.method3603(this.field3831[var4][var5], -262145);
        if (arg0 < 49) {
            method1645(113);
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(B)V", line = 1373)
    public final void method1650(byte arg0) {
        for (int var2 = 0; var2 < this.field3824; var2++) {
            for (int var4 = 0; var4 < this.field3822; var4++) {
                if (var2 == 0 || var4 == 0 || (this.field3824 - 5) <= var2 || var4 >= (this.field3822 - 5)) {
                    this.field3831[var2][var4] = -1;
                } else {
                    this.field3831[var2][var4] = 2097152;
                }
            }
        }
        field3836++;
        int var3 = -36 / ((arg0 - 45) / 52);
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IIZLraa;)V", line = 1403)
    public static final void method1651(int arg0, int arg1, boolean arg2, class353 arg3) {
        if (class552.field7867) {
            class193 var4 = class493.field7149 == -1 ? null : class382.field5728.method1997((byte) 125, class493.field7149);
            if (client.method2735(arg3).method1865(-18211) && (class553.field7869 & 0x20) != 0 && (var4 == null || arg3.method2246(var4.field3339, (byte) -74, class493.field7149) != var4.field3339)) {
                class53.field844++;
                class274.method1800(arg3.field5349, class355.field5375 + " -> " + arg3.field5336, true, (byte) -86, false, class400.field5936, arg3.field5352, arg3.field5328, (long) (arg3.field5352 << 0 | arg3.field5349), false, class131.field2134, 10, 0L);
            }
        }
        field3841++;
        for (int var5 = 9; var5 >= 5; var5--) {
            String var9 = class488.method2971((byte) -104, var5, arg3);
            if (var9 != null) {
                class274.method1800(arg3.field5349, arg3.field5336, true, (byte) 79, false, class495.method3006(var5, -121, arg3), arg3.field5352, arg3.field5328, (long) (arg3.field5352 << 0 | arg3.field5349), false, var9, 1001, (long) (var5 + 1));
                class410.field6055++;
            }
        }
        String var6 = class279.method1819(arg3, (byte) 67);
        if (!arg2) {
            field3834 = 17;
        }
        if (var6 != null) {
            class3.field11++;
            class274.method1800(arg3.field5349, arg3.field5336, true, (byte) 93, false, arg3.field5288, arg3.field5352, arg3.field5328, (long) (arg3.field5349 | arg3.field5352 << 0), false, var6, 8, 0L);
        }
        for (int var7 = 4; var7 >= 0; var7--) {
            String var8 = class488.method2971((byte) -119, var7, arg3);
            if (var8 != null) {
                class274.method1800(arg3.field5349, arg3.field5336, true, (byte) -109, false, class495.method3006(var7, -121, arg3), arg3.field5352, arg3.field5328, (long) (arg3.field5352 << 0 | arg3.field5349), false, var8, 46, (long) (var7 + 1));
                class410.field6055++;
            }
        }
        if (!client.method2735(arg3).method1867((byte) -86)) {
            return;
        }
        if (arg3.field5224 == null) {
            class274.method1800(arg3.field5349, "", true, (byte) 51, false, -1, arg3.field5352, arg3.field5328, (long) (arg3.field5352 << 0 | arg3.field5349), false, class641.field9002.method3621(92, class467.field6804), 3, 0L);
        } else {
            class274.method1800(arg3.field5349, "", true, (byte) -114, false, -1, arg3.field5352, arg3.field5328, (long) (arg3.field5349 | arg3.field5352 << 0), false, arg3.field5224, 3, 0L);
        }
        class203.field3431++;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(Lla;BLjava/lang/String;Z)Lwq;", line = 1477)
    public static final class676 method1652(class422 arg0, byte arg1, String arg2, boolean arg3) {
        field3837++;
        int var4 = 101 % ((82 - arg1) / 36);
        int var5 = arg0.method2629(arg2, 10912);
        if (var5 == -1) {
            return new class676(0);
        }
        int[] var6 = arg0.method2619(var5, true);
        class676 var7 = new class676(var6.length);
        int var8 = 0;
        int var9 = 0;
        while (true) {
            while (var8 < var7.field9540) {
                class301 var10 = new class301(arg0.method2624(0, var5, var6[var9++]));
                int var11 = var10.method1934(-2);
                int var12 = var10.method1989((byte) -109);
                int var13 = var10.method1987(-15);
                if (!arg3 && var13 == 1) {
                    var7.field9540--;
                } else {
                    var7.field9538[var8] = var11;
                    var7.field9537[var8] = var12;
                    var8++;
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IBI)V", line = 1522)
    public final void method1653(int arg0, byte arg1, int arg2) {
        field3821++;
        int var4 = arg2 - this.field3828;
        int var5 = arg0 - this.field3832;
        if (arg1 != 7) {
            field3834 = -116;
        }
        this.field3831[var5][var4] = class112.method903(this.field3831[var5][var4], 2097152);
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IIIIIIII)Z", line = 1538)
    public final boolean method1654(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3826++;
        if (arg3 == arg4) {
            if (arg5 == arg7 && arg1 == arg6) {
                return true;
            }
        } else if (arg7 <= arg5 && arg5 <= arg3 + arg7 - 1 && arg1 >= arg1 && arg1 <= (arg1 + arg3 - 1)) {
            return true;
        }
        int var9 = arg1 - this.field3828;
        int var10 = arg5 - this.field3832;
        int var11 = arg6 - this.field3828;
        int var12 = arg7 - this.field3832;
        if (arg3 == 1) {
            if (arg2 == 6 || arg2 == 7) {
                if (arg2 == 7) {
                    arg0 = arg0 + 2 & 0x3;
                }
                if (arg0 == 0) {
                    if (var10 + 1 == var12 && var9 == var11 && (this.field3831[var12][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var9 - 1) == var11 && (this.field3831[var12][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if ((var10 - 1) == var12 && var9 == var11 && (this.field3831[var12][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var9 - 1) == var11 && (this.field3831[var12][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if (var10 - 1 == var12 && var9 == var11 && (this.field3831[var12][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var9 + 1) == var11 && (this.field3831[var12][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var10 + 1 == var12 && var9 == var11 && (this.field3831[var12][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var9 + 1 == var11 && (this.field3831[var12][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 8) {
                if (var10 == var12 && (var9 + 1) == var11 && (this.field3831[var12][var11] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var12 && var9 - 1 == var11 && (this.field3831[var12][var11] & 0x2) == 0) {
                    return true;
                }
                if (var10 - 1 == var12 && var9 == var11 && (this.field3831[var12][var11] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var12 && var9 == var11 && (this.field3831[var12][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var12 + arg3 - 1;
            int var14 = var11 + arg3 - 1;
            if (arg2 == 6 || arg2 == 7) {
                if (arg2 == 7) {
                    arg0 = arg0 + 2 & 0x3;
                }
                if (arg0 == 0) {
                    if ((var10 + 1) == var12 && var9 >= var11 && var14 >= var9 && (this.field3831[var12][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 <= var10 && var13 >= var10 && (var9 - arg3) == var11 && (this.field3831[var10][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if ((var10 - arg3) == var12 && var9 >= var11 && var9 <= var14 && (this.field3831[var13][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 >= var12 && var10 <= var13 && (var9 - arg3) == var11 && (this.field3831[var10][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if ((var10 - arg3) == var12 && var11 <= var9 && var9 <= var14 && (this.field3831[var13][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 >= var12 && var13 >= var10 && (var9 + 1) == var11 && (this.field3831[var10][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var10 + 1 == var12 && var11 <= var9 && var14 >= var9 && (this.field3831[var12][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 <= var10 && var10 <= var13 && var9 + 1 == var11 && (this.field3831[var10][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 8) {
                if (var10 >= var12 && var13 >= var10 && var9 + 1 == var11 && (this.field3831[var10][var11] & 0x20) == 0) {
                    return true;
                }
                if (var10 >= var12 && var13 >= var10 && var9 - arg3 == var11 && (this.field3831[var10][var14] & 0x2) == 0) {
                    return true;
                }
                if ((var10 - arg3) == var12 && var11 <= var9 && var9 <= var14 && (this.field3831[var13][var9] & 0x8) == 0) {
                    return true;
                }
                if ((var10 + 1) == var12 && var9 >= var11 && var9 <= var14 && (this.field3831[var12][var9] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
