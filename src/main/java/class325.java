import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class325 {

    @OriginalMember(owner = "client!bm", name = "t", descriptor = "Lib;")
    public static class249 field4422 = class218.method1453(7868);

    @OriginalMember(owner = "client!bm", name = "v", descriptor = "Z")
    public static boolean field4424 = false;

    @OriginalMember(owner = "client!bm", name = "A", descriptor = "I")
    public static int field4429 = 0;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "I")
    public static int field4403;

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "I")
    public int field4405;

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "I")
    public static int field4406;

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "I")
    public static int field4407;

    @OriginalMember(owner = "client!bm", name = "f", descriptor = "I")
    public static int field4408;

    @OriginalMember(owner = "client!bm", name = "g", descriptor = "I")
    public static int field4409;

    @OriginalMember(owner = "client!bm", name = "h", descriptor = "I")
    public static int field4410;

    @OriginalMember(owner = "client!bm", name = "i", descriptor = "I")
    public static int field4411;

    @OriginalMember(owner = "client!bm", name = "j", descriptor = "I")
    public static int field4412;

    @OriginalMember(owner = "client!bm", name = "k", descriptor = "I")
    public static int field4413;

    @OriginalMember(owner = "client!bm", name = "l", descriptor = "I")
    public static int field4414;

    @OriginalMember(owner = "client!bm", name = "m", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!bm", name = "o", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!bm", name = "p", descriptor = "I")
    public static int field4418;

    @OriginalMember(owner = "client!bm", name = "q", descriptor = "I")
    public static int field4419;

    @OriginalMember(owner = "client!bm", name = "r", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!bm", name = "s", descriptor = "I")
    public int field4421;

    @OriginalMember(owner = "client!bm", name = "u", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!bm", name = "w", descriptor = "I")
    public static int field4425;

    @OriginalMember(owner = "client!bm", name = "x", descriptor = "I")
    public int field4426;

    @OriginalMember(owner = "client!bm", name = "y", descriptor = "I")
    public int field4427;

    @OriginalMember(owner = "client!bm", name = "z", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "Lgf;")
    public static class202 field4404;

    @OriginalMember(owner = "client!bm", name = "n", descriptor = "[[I")
    public int[][] field4416;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(III)V", line = 4)
    public final void method1973(int arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            int var4 = arg0 - this.field4427;
            int var5 = arg1 - this.field4426;
            field4413++;
            this.field4416[var4][var5] = class187.method1301(this.field4416[var4][var5], -2097153);
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIIIIII)Z", line = 18)
    public final boolean method1974(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4412++;
        if (arg2 == 1) {
            if (arg4 == arg5 && arg0 == arg6) {
                return true;
            }
        } else if (arg5 <= arg4 && arg5 + arg2 - 1 >= arg4 && arg0 >= arg0 && arg0 <= arg0 + arg2 - 1) {
            return true;
        }
        int var9 = arg5 - this.field4427;
        if (arg7 != 0) {
            return false;
        }
        int var10 = arg0 - this.field4426;
        int var11 = arg4 - this.field4427;
        int var12 = arg6 - this.field4426;
        if (arg2 == 1) {
            if (arg1 == 0) {
                if (arg3 == 0) {
                    if (var11 - 1 == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var10 + 1 == var12 && (this.field4416[var9][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 - 1 == var12 && (this.field4416[var9][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var9 == var11 && var10 + 1 == var12) {
                        return true;
                    }
                    if (var11 - 1 == var9 && var10 == var12 && (this.field4416[var9][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var10 == var12 && (this.field4416[var9][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if ((var11 + 1) == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var10 + 1) == var12 && (this.field4416[var9][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var10 - 1) == var12 && (this.field4416[var9][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var9 == var11 && var10 - 1 == var12) {
                        return true;
                    }
                    if ((var11 - 1) == var9 && var10 == var12 && (this.field4416[var9][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 == var12 && (this.field4416[var9][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg1 == 2) {
                if (arg3 == 0) {
                    if ((var11 - 1) == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var10 + 1) == var12) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 == var12 && (this.field4416[var9][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 - 1 == var12 && (this.field4416[var9][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if ((var11 - 1) == var9 && var10 == var12 && (this.field4416[var9][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 + 1 == var12) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var10 - 1) == var12 && (this.field4416[var9][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if ((var11 - 1) == var9 && var10 == var12 && (this.field4416[var9][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 + 1 == var12 && (this.field4416[var9][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var10 - 1) == var12) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var11 - 1 == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var10 + 1 == var12 && (this.field4416[var9][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 == var12 && (this.field4416[var9][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 - 1 == var12) {
                        return true;
                    }
                }
            }
            if (arg1 == 9) {
                if (var9 == var11 && var10 + 1 == var12 && (this.field4416[var9][var12] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var11 && var10 - 1 == var12 && (this.field4416[var9][var12] & 0x2) == 0) {
                    return true;
                }
                if (var11 - 1 == var9 && var10 == var12 && (this.field4416[var9][var12] & 0x8) == 0) {
                    return true;
                }
                if (var11 + 1 == var9 && var10 == var12 && (this.field4416[var9][var12] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var9 + arg2 - 1;
            int var14 = arg2 + var12 - 1;
            if (arg1 == 0) {
                if (arg3 == 0) {
                    if (var11 - arg2 == var9 && var10 >= var12 && var14 >= var10) {
                        return true;
                    }
                    if (var9 <= var11 && var13 >= var11 && (var10 + 1) == var12 && (this.field4416[var11][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var11 <= var13 && var10 - arg2 == var12 && (this.field4416[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var9 <= var11 && var13 >= var11 && var10 + 1 == var12) {
                        return true;
                    }
                    if (var11 - arg2 == var9 && var12 <= var10 && var10 <= var14 && (this.field4416[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 >= var12 && var14 >= var10 && (this.field4416[var9][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var11 + 1 == var9 && var12 <= var10 && var14 >= var10) {
                        return true;
                    }
                    if (var11 >= var9 && var11 <= var13 && (var10 + 1) == var12 && (this.field4416[var11][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var11 <= var13 && var10 - arg2 == var12 && (this.field4416[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var9 <= var11 && var13 >= var11 && (var10 - arg2) == var12) {
                        return true;
                    }
                    if ((var11 - arg2) == var9 && var12 <= var10 && var14 >= var10 && (this.field4416[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var12 <= var10 && var14 >= var10 && (this.field4416[var9][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg1 == 2) {
                if (arg3 == 0) {
                    if (var11 - arg2 == var9 && var10 >= var12 && var14 >= var10) {
                        return true;
                    }
                    if (var11 >= var9 && var13 >= var11 && (var10 + 1) == var12) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var12 <= var10 && var14 >= var10 && (this.field4416[var9][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var11 <= var13 && var10 - arg2 == var12 && (this.field4416[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if ((var11 - arg2) == var9 && var10 >= var12 && var14 >= var10 && (this.field4416[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var11 <= var13 && (var10 + 1) == var12) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var10 >= var12 && var14 >= var10) {
                        return true;
                    }
                    if (var9 <= var11 && var11 <= var13 && var10 - arg2 == var12 && (this.field4416[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var11 - arg2 == var9 && var10 >= var12 && var10 <= var14 && (this.field4416[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var13 >= var11 && (var10 + 1) == var12 && (this.field4416[var11][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var10 >= var12 && var10 <= var14) {
                        return true;
                    }
                    if (var11 >= var9 && var11 <= var13 && (var10 - arg2) == var12) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var11 - arg2 == var9 && var10 >= var12 && var14 >= var10) {
                        return true;
                    }
                    if (var9 <= var11 && var13 >= var11 && (var10 + 1) == var12 && (this.field4416[var11][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var10 >= var12 && var14 >= var10 && (this.field4416[var9][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var13 >= var11 && (var10 - arg2) == var12) {
                        return true;
                    }
                }
            }
            if (arg1 == 9) {
                if (var11 >= var9 && var11 <= var13 && (var10 + 1) == var12 && (this.field4416[var11][var12] & 0x2C0120) == 0) {
                    return true;
                }
                if (var11 >= var9 && var13 >= var11 && (var10 - arg2) == var12 && (this.field4416[var11][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if (var11 - arg2 == var9 && var12 <= var10 && var10 <= var14 && (this.field4416[var13][var10] & 0x2C0108) == 0) {
                    return true;
                }
                if (var11 + 1 == var9 && var10 >= var12 && var10 <= var14 && (this.field4416[var9][var10] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IZIZIIB)V", line = 386)
    public final void method1975(int arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5, byte arg6) {
        field4409++;
        int var8 = arg2 - this.field4426;
        int var9 = arg5 - this.field4427;
        if (arg0 == 0) {
            if (arg4 == 0) {
                this.method1982(-2, var9, 128, var8);
                this.method1982(-2, var9 - 1, 8, var8);
            }
            if (arg4 == 1) {
                this.method1982(-2, var9, 2, var8);
                this.method1982(arg6 ^ 0xFFFFFF9F, var9, 32, var8 + 1);
            }
            if (arg4 == 2) {
                this.method1982(-2, var9, 8, var8);
                this.method1982(-2, var9 + 1, 128, var8);
            }
            if (arg4 == 3) {
                this.method1982(arg6 ^ 0xFFFFFF9F, var9, 32, var8);
                this.method1982(-2, var9, 2, var8 - 1);
            }
        }
        if (arg6 != 97) {
            field4424 = true;
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg4 == 0) {
                this.method1982(arg6 - 99, var9, 1, var8);
                this.method1982(-2, var9 - 1, 16, var8 + 1);
            }
            if (arg4 == 1) {
                this.method1982(arg6 - 99, var9, 4, var8);
                this.method1982(-2, var9 + 1, 64, var8 + 1);
            }
            if (arg4 == 2) {
                this.method1982(-2, var9, 16, var8);
                this.method1982(-2, var9 + 1, 1, var8 - 1);
            }
            if (arg4 == 3) {
                this.method1982(-2, var9, 64, var8);
                this.method1982(-2, var9 - 1, 4, var8 - 1);
            }
        }
        if (arg0 == 2) {
            if (arg4 == 0) {
                this.method1982(-2, var9, 130, var8);
                this.method1982(-2, var9 - 1, 8, var8);
                this.method1982(arg6 ^ 0xFFFFFF9F, var9, 32, var8 + 1);
            }
            if (arg4 == 1) {
                this.method1982(-2, var9, 10, var8);
                this.method1982(-2, var9, 32, var8 + 1);
                this.method1982(-2, var9 + 1, 128, var8);
            }
            if (arg4 == 2) {
                this.method1982(-2, var9, 40, var8);
                this.method1982(arg6 - 99, var9 - -1, 128, var8);
                this.method1982(-2, var9, 2, var8 - 1);
            }
            if (arg4 == 3) {
                this.method1982(-2, var9, 160, var8);
                this.method1982(-2, var9, 2, var8 - 1);
                this.method1982(-2, var9 - 1, 8, var8);
            }
        }
        if (arg3) {
            if (arg0 == 0) {
                if (arg4 == 0) {
                    this.method1982(arg6 - 99, var9, 65536, var8);
                    this.method1982(-2, var9 - 1, 4096, var8);
                }
                if (arg4 == 1) {
                    this.method1982(arg6 ^ 0xFFFFFF9F, var9, 1024, var8);
                    this.method1982(-2, var9, 16384, var8 + 1);
                }
                if (arg4 == 2) {
                    this.method1982(-2, var9, 4096, var8);
                    this.method1982(-2, var9 + 1, 65536, var8);
                }
                if (arg4 == 3) {
                    this.method1982(-2, var9, 16384, var8);
                    this.method1982(-2, var9, 1024, var8 - 1);
                }
            }
            if (arg0 == 1 || arg0 == 3) {
                if (arg4 == 0) {
                    this.method1982(-2, var9, 512, var8);
                    this.method1982(arg6 ^ 0xFFFFFF9F, var9 - 1, 8192, var8 + 1);
                }
                if (arg4 == 1) {
                    this.method1982(-2, var9, 2048, var8);
                    this.method1982(-2, var9 + 1, 32768, var8 + 1);
                }
                if (arg4 == 2) {
                    this.method1982(-2, var9, 8192, var8);
                    this.method1982(-2, var9 + 1, 512, var8 - 1);
                }
                if (arg4 == 3) {
                    this.method1982(-2, var9, 32768, var8);
                    this.method1982(-2, var9 - 1, 2048, var8 - 1);
                }
            }
            if (arg0 == 2) {
                if (arg4 == 0) {
                    this.method1982(-2, var9, 66560, var8);
                    this.method1982(-2, var9 - 1, 4096, var8);
                    this.method1982(-2, var9, 16384, var8 + 1);
                }
                if (arg4 == 1) {
                    this.method1982(-2, var9, 5120, var8);
                    this.method1982(-2, var9, 16384, var8 + 1);
                    this.method1982(arg6 - 99, var9 - -1, 65536, var8);
                }
                if (arg4 == 2) {
                    this.method1982(-2, var9, 20480, var8);
                    this.method1982(-2, var9 + 1, 65536, var8);
                    this.method1982(arg6 ^ 0xFFFFFF9F, var9, 1024, var8 - 1);
                }
                if (arg4 == 3) {
                    this.method1982(arg6 - 99, var9, 81920, var8);
                    this.method1982(-2, var9, 1024, var8 - 1);
                    this.method1982(arg6 - 99, var9 - 1, 4096, var8);
                }
            }
        }
        if (!arg1) {
            return;
        }
        if (arg0 == 0) {
            if (arg4 == 0) {
                this.method1982(-2, var9, 536870912, var8);
                this.method1982(-2, var9 - 1, 33554432, var8);
            }
            if (arg4 == 1) {
                this.method1982(-2, var9, 8388608, var8);
                this.method1982(-2, var9, 134217728, var8 + 1);
            }
            if (arg4 == 2) {
                this.method1982(-2, var9, 33554432, var8);
                this.method1982(arg6 ^ 0xFFFFFF9F, var9 + 1, 536870912, var8);
            }
            if (arg4 == 3) {
                this.method1982(-2, var9, 134217728, var8);
                this.method1982(arg6 - 99, var9, 8388608, var8 - 1);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg4 == 0) {
                this.method1982(-2, var9, 4194304, var8);
                this.method1982(-2, var9 - 1, 67108864, var8 + 1);
            }
            if (arg4 == 1) {
                this.method1982(arg6 ^ 0xFFFFFF9F, var9, 16777216, var8);
                this.method1982(-2, var9 + 1, 268435456, var8 + 1);
            }
            if (arg4 == 2) {
                this.method1982(arg6 - 99, var9, 67108864, var8);
                this.method1982(-2, var9 + 1, 4194304, var8 - 1);
            }
            if (arg4 == 3) {
                this.method1982(-2, var9, 268435456, var8);
                this.method1982(arg6 ^ 0xFFFFFF9F, var9 - 1, 16777216, var8 - 1);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method1982(arg6 - 99, var9, 545259520, var8);
            this.method1982(-2, var9 - 1, 33554432, var8);
            this.method1982(-2, var9, 134217728, var8 + 1);
        }
        if (arg4 == 1) {
            this.method1982(-2, var9, 41943040, var8);
            this.method1982(arg6 ^ 0xFFFFFF9F, var9, 134217728, var8 + 1);
            this.method1982(arg6 - 99, var9 + 1, 536870912, var8);
        }
        if (arg4 == 2) {
            this.method1982(arg6 ^ 0xFFFFFF9F, var9, 167772160, var8);
            this.method1982(arg6 ^ 0xFFFFFF9F, var9 + 1, 536870912, var8);
            this.method1982(-2, var9, 8388608, var8 - 1);
        }
        if (arg4 == 3) {
            this.method1982(arg6 - 99, var9, 671088640, var8);
            this.method1982(arg6 - 99, var9, 8388608, var8 - 1);
            this.method1982(-2, var9 - 1, 33554432, var8);
            return;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIBI)I", line = 699)
    public static final int method1976(int arg0, int arg1, byte arg2, int arg3) {
        field4425++;
        if (arg2 < 72) {
            return -35;
        } else {
            int var4 = ((arg3 & 0xFF00) * arg0 & 0xFF0000 | (arg3 & 0xFF00FF) * arg0 & 0xFF00FF00) >>> 8;
            int var5 = 255 - arg0;
            return (((arg1 & 0xFF00) * var5 & 0xFF0000 | (arg1 & 0xFF00FF) * var5 & 0xFF00FF00) >>> 8) + var4;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IZI)V", line = 718)
    public final void method1977(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            this.field4405 = 25;
        }
        field4406++;
        int var4 = arg0 - this.field4427;
        int var5 = arg2 - this.field4426;
        this.field4416[var4][var5] = class431.method2655(this.field4416[var4][var5], 262144);
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(III)V", line = 734)
    public final void method1978(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field4426;
        if (arg1 != 15789) {
            this.field4405 = 82;
        }
        field4408++;
        int var5 = arg2 - this.field4427;
        this.field4416[var5][var4] = class431.method2655(this.field4416[var5][var4], 2097152);
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)V", line = 747)
    public static final void method1979(int arg0) {
        field4418++;
        if (class398.field5508) {
            return;
        }
        if (arg0 != 656384) {
            method1979(-101);
        }
        class68.field964 = true;
        class398.field5508 = true;
        if (class229.field3214) {
            class356.field4785 = (float) ((int) class356.field4785 - 17 & 0xFFFFFFF0);
        } else {
            class230.field3233 += (-12.0F - class230.field3233) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIZ)V", line = 783)
    public final void method1980(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            this.method1978(27, -17, -93);
        }
        field4407++;
        int var4 = arg1 - this.field4427;
        int var5 = arg0 - this.field4426;
        this.field4416[var4][var5] = class187.method1301(this.field4416[var4][var5], -262145);
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILij;ZLij;Z)V", line = 797)
    public static final void method1981(int arg0, class316 arg1, boolean arg2, class316 arg3, boolean arg4) {
        class187.field2710 = arg3;
        class231.field3251 = arg1;
        class26.field329 = arg2;
        field4415++;
        if (!arg4) {
            class19.field252 = arg0;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIII)V", line = 815)
    private final void method1982(int arg0, int arg1, int arg2, int arg3) {
        field4414++;
        this.field4416[arg1][arg3] = class187.method1301(this.field4416[arg1][arg3], ~arg2);
        if (arg0 != -2) {
            this.method1973(7, -29, -83);
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(ZZIIIII)V", line = 827)
    public final void method1983(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4423++;
        int var8 = 256;
        if (arg0) {
            var8 |= 0x20000;
        }
        if (arg1) {
            var8 |= 0x40000000;
        }
        int var9 = arg3 - this.field4426;
        if (arg4 != 12298) {
            field4429 = 19;
        }
        int var10 = arg6 - this.field4427;
        for (int var11 = var10; var11 < (arg2 + var10); var11++) {
            if (var11 >= 0 && this.field4405 > var11) {
                for (int var12 = var9; var12 < (arg5 + var9); var12++) {
                    if (var12 >= 0 && this.field4421 > var12) {
                        this.method1986(var12, var11, (byte) -87, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIZIIZ)V", line = 873)
    public final void method1984(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, boolean arg6) {
        field4419++;
        int var8 = arg4 - this.field4427;
        int var9 = arg2 - this.field4426;
        if (arg5 == 0) {
            if (arg1 == 0) {
                this.method1986(var9, var8, (byte) 127, 128);
                this.method1986(var9, var8 - 1, (byte) 127, 8);
            }
            if (arg1 == 1) {
                this.method1986(var9, var8, (byte) -125, 2);
                this.method1986(var9 + 1, var8, (byte) 126, 32);
            }
            if (arg1 == 2) {
                this.method1986(var9, var8, (byte) 125, 8);
                this.method1986(var9, var8 + 1, (byte) 0, 128);
            }
            if (arg1 == 3) {
                this.method1986(var9, var8, (byte) 124, 32);
                this.method1986(var9 - 1, var8, (byte) 126, 2);
            }
        }
        if (arg0 == arg5 || arg5 == 3) {
            if (arg1 == 0) {
                this.method1986(var9, var8, (byte) 125, 1);
                this.method1986(var9 + 1, var8 + -1, (byte) -3, 16);
            }
            if (arg1 == 1) {
                this.method1986(var9, var8, (byte) 126, 4);
                this.method1986(var9 + 1, var8 + 1, (byte) -25, 64);
            }
            if (arg1 == 2) {
                this.method1986(var9, var8, (byte) 127, 16);
                this.method1986(var9 - 1, var8 + 1, (byte) 124, 1);
            }
            if (arg1 == 3) {
                this.method1986(var9, var8, (byte) 27, 64);
                this.method1986(var9 - 1, var8 - 1, (byte) -85, 4);
            }
        }
        if (arg5 == 2) {
            if (arg1 == 0) {
                this.method1986(var9, var8, (byte) 127, 130);
                this.method1986(var9, var8 - 1, (byte) -81, 8);
                this.method1986(var9 + 1, var8, (byte) 25, 32);
            }
            if (arg1 == 1) {
                this.method1986(var9, var8, (byte) -116, 10);
                this.method1986(var9 + 1, var8, (byte) 124, 32);
                this.method1986(var9, var8 + 1, (byte) 126, 128);
            }
            if (arg1 == 2) {
                this.method1986(var9, var8, (byte) -93, 40);
                this.method1986(var9, var8 + 1, (byte) -109, 128);
                this.method1986(var9 - 1, var8, (byte) 126, 2);
            }
            if (arg1 == 3) {
                this.method1986(var9, var8, (byte) -37, 160);
                this.method1986(var9 - 1, var8, (byte) -120, 2);
                this.method1986(var9, var8 - 1, (byte) 126, 8);
            }
        }
        if (arg3) {
            if (arg5 == 0) {
                if (arg1 == 0) {
                    this.method1986(var9, var8, (byte) -33, 65536);
                    this.method1986(var9, var8 - 1, (byte) 125, 4096);
                }
                if (arg1 == 1) {
                    this.method1986(var9, var8, (byte) -32, 1024);
                    this.method1986(var9 + 1, var8, (byte) 27, 16384);
                }
                if (arg1 == 2) {
                    this.method1986(var9, var8, (byte) 29, 4096);
                    this.method1986(var9, var8 + 1, (byte) 24, 65536);
                }
                if (arg1 == 3) {
                    this.method1986(var9, var8, (byte) -116, 16384);
                    this.method1986(var9 - 1, var8, (byte) -69, 1024);
                }
            }
            if (arg5 == 1 || arg5 == 3) {
                if (arg1 == 0) {
                    this.method1986(var9, var8, (byte) -119, 512);
                    this.method1986(var9 + 1, var8 + -1, (byte) -122, 8192);
                }
                if (arg1 == 1) {
                    this.method1986(var9, var8, (byte) 125, 2048);
                    this.method1986(var9 + 1, var8 + 1, (byte) 14, 32768);
                }
                if (arg1 == 2) {
                    this.method1986(var9, var8, (byte) 126, 8192);
                    this.method1986(var9 - 1, var8 + 1, (byte) 127, 512);
                }
                if (arg1 == 3) {
                    this.method1986(var9, var8, (byte) 126, 32768);
                    this.method1986(var9 - 1, var8 - 1, (byte) -68, 2048);
                }
            }
            if (arg5 == 2) {
                if (arg1 == 0) {
                    this.method1986(var9, var8, (byte) 124, 66560);
                    this.method1986(var9, var8 - 1, (byte) -57, 4096);
                    this.method1986(var9 + 1, var8, (byte) -79, 16384);
                }
                if (arg1 == 1) {
                    this.method1986(var9, var8, (byte) -97, 5120);
                    this.method1986(var9 + 1, var8, (byte) -110, 16384);
                    this.method1986(var9, var8 + 1, (byte) 126, 65536);
                }
                if (arg1 == 2) {
                    this.method1986(var9, var8, (byte) 124, 20480);
                    this.method1986(var9, var8 + 1, (byte) 127, 65536);
                    this.method1986(var9 - 1, var8, (byte) -76, 1024);
                }
                if (arg1 == 3) {
                    this.method1986(var9, var8, (byte) -113, 81920);
                    this.method1986(var9 - 1, var8, (byte) -82, 1024);
                    this.method1986(var9, var8 - 1, (byte) 127, 4096);
                }
            }
        }
        if (!arg6) {
            return;
        }
        if (arg5 == 0) {
            if (arg1 == 0) {
                this.method1986(var9, var8, (byte) 125, 536870912);
                this.method1986(var9, var8 - 1, (byte) -69, 33554432);
            }
            if (arg1 == 1) {
                this.method1986(var9, var8, (byte) 126, 8388608);
                this.method1986(var9 + 1, var8, (byte) -55, 134217728);
            }
            if (arg1 == 2) {
                this.method1986(var9, var8, (byte) 126, 33554432);
                this.method1986(var9, var8 + 1, (byte) -99, 536870912);
            }
            if (arg1 == 3) {
                this.method1986(var9, var8, (byte) -40, 134217728);
                this.method1986(var9 - 1, var8, (byte) 125, 8388608);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg1 == 0) {
                this.method1986(var9, var8, (byte) 127, 4194304);
                this.method1986(var9 + 1, var8 + -1, (byte) -85, 67108864);
            }
            if (arg1 == 1) {
                this.method1986(var9, var8, (byte) -52, 16777216);
                this.method1986(var9 + 1, var8 + 1, (byte) -58, 268435456);
            }
            if (arg1 == 2) {
                this.method1986(var9, var8, (byte) -109, 67108864);
                this.method1986(var9 - 1, var8 + 1, (byte) 125, 4194304);
            }
            if (arg1 == 3) {
                this.method1986(var9, var8, (byte) 125, 268435456);
                this.method1986(var9 - 1, var8 + -1, (byte) -94, 16777216);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method1986(var9, var8, (byte) 127, 545259520);
            this.method1986(var9, var8 - 1, (byte) 124, 33554432);
            this.method1986(var9 + 1, var8, (byte) 127, 134217728);
        }
        if (arg1 == 1) {
            this.method1986(var9, var8, (byte) 124, 41943040);
            this.method1986(var9 + 1, var8, (byte) 22, 134217728);
            this.method1986(var9, var8 + 1, (byte) -74, 536870912);
        }
        if (arg1 == 2) {
            this.method1986(var9, var8, (byte) -31, 167772160);
            this.method1986(var9, var8 + 1, (byte) -110, 536870912);
            this.method1986(var9 - 1, var8, (byte) 124, 8388608);
        }
        if (arg1 == 3) {
            this.method1986(var9, var8, (byte) 127, 671088640);
            this.method1986(var9 - 1, var8, (byte) -20, 8388608);
            this.method1986(var9, var8 - 1, (byte) 28, 33554432);
            return;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(B)V", line = 1187)
    public static void method1985(byte arg0) {
        field4422 = null;
        if (arg0 >= -107) {
            field4422 = null;
        }
        field4404 = null;
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(IIBI)V", line = 1198)
    private final void method1986(int arg0, int arg1, byte arg2, int arg3) {
        int var5 = 109 / ((arg2 - 77) / 47);
        field4428++;
        this.field4416[arg1][arg0] = class431.method2655(this.field4416[arg1][arg0], arg3);
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(I)V", line = 1211)
    public final void method1987(int arg0) {
        for (int var2 = 0; var2 < this.field4405; var2++) {
            for (int var3 = 0; var3 < this.field4421; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= this.field4405 - 5 || var3 >= this.field4421 - 5) {
                    this.field4416[var2][var3] = -1;
                } else {
                    this.field4416[var2][var3] = 2097152;
                }
            }
        }
        if (arg0 == 32) {
            field4403++;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIIIIIIII)Z", line = 1243)
    public final boolean method1988(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg5 != 1) {
            return true;
        }
        field4410++;
        int var11 = arg1 + arg2;
        int var12 = arg0 + arg7;
        int var13 = arg3 + arg6;
        int var14 = arg4 + arg8;
        if (arg1 == var13 && (arg9 & 0x2) == 0) {
            int var15 = arg4 >= arg0 ? arg4 : arg0;
            int var16 = var14 <= var12 ? var14 : var12;
            while (var16 > var15) {
                if ((this.field4416[var13 - this.field4427 - 1][var15 - this.field4426] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg6 == var11 && (arg9 & 0x8) == 0) {
            int var17 = arg4 >= arg0 ? arg4 : arg0;
            int var18 = var14 > var12 ? var12 : var14;
            while (var17 < var18) {
                if ((this.field4416[arg6 - this.field4427][var17 - this.field4426] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg0 == var14 && (arg9 & 0x1) == 0) {
            int var19 = arg1 > arg6 ? arg1 : arg6;
            int var20 = var13 > var11 ? var11 : var13;
            while (var19 < var20) {
                if ((this.field4416[var19 - this.field4427][var14 - this.field4426 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg4 == var12 && (arg9 & 0x4) == 0) {
            int var21 = arg6 >= arg1 ? arg6 : arg1;
            int var22 = var13 <= var11 ? var13 : var11;
            while (var22 > var21) {
                if ((this.field4416[var21 - this.field4427][arg4 - this.field4426] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIIIIIII)Z", line = 1336)
    public final boolean method1989(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4417++;
        if (arg8 > 1) {
            return class146.method1051(arg5, arg7, arg8, false, arg4, arg3, arg1, arg2, arg8) ? true : this.method1988(arg5, arg1, arg8, arg3, arg2, 1, arg4, arg8, arg7, arg0);
        }
        int var10 = -75 % ((55 - arg6) / 60);
        int var11 = arg4 + arg3 - 1;
        int var12 = arg2 + arg7 - 1;
        if (arg4 <= arg1 && arg1 <= var11 && arg5 >= arg2 && arg5 <= var12) {
            return true;
        } else if (arg4 - 1 == arg1 && arg5 >= arg2 && arg5 <= var12 && (this.field4416[arg1 - this.field4427][arg5 - this.field4426] & 0x8) == 0 && (arg0 & 0x8) == 0) {
            return true;
        } else if ((var11 + 1) == arg1 && arg2 <= arg5 && var12 >= arg5 && (this.field4416[arg1 - this.field4427][arg5 - this.field4426] & 0x80) == 0 && (arg0 & 0x2) == 0) {
            return true;
        } else if ((arg2 - 1) == arg5 && arg4 <= arg1 && var11 >= arg1 && (this.field4416[arg1 - this.field4427][arg5 - this.field4426] & 0x2) == 0 && (arg0 & 0x4) == 0) {
            return true;
        } else {
            return var12 + 1 == arg5 && arg1 >= arg4 && arg1 <= var11 && (this.field4416[arg1 - this.field4427][arg5 - this.field4426] & 0x20) == 0 && (arg0 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(IIIIIIII)Z", line = 1390)
    public final boolean method1990(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4420++;
        if (arg1 == 1) {
            if (arg0 == arg5 && arg2 == arg6) {
                return true;
            }
        } else if (arg5 <= arg0 && arg1 + arg5 - 1 >= arg0 && arg2 >= arg2 && arg2 <= arg1 + arg2 - 1) {
            return true;
        }
        int var9 = arg6 - this.field4426;
        int var10 = arg0 - this.field4427;
        if (arg4 != 32) {
            return true;
        }
        int var11 = arg5 - this.field4427;
        int var12 = arg2 - this.field4426;
        if (arg1 == 1) {
            if (arg7 == 6 || arg7 == 7) {
                if (arg7 == 7) {
                    arg3 = arg3 + 2 & 0x3;
                }
                if (arg3 == 0) {
                    if (var10 + 1 == var11 && var9 == var12 && (this.field4416[var11][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 - 1) == var9 && (this.field4416[var11][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var10 - 1 == var11 && var9 == var12 && (this.field4416[var11][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var9 && (this.field4416[var11][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if ((var10 - 1) == var11 && var9 == var12 && (this.field4416[var11][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9 && (this.field4416[var11][var9] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if ((var10 + 1) == var11 && var9 == var12 && (this.field4416[var11][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9 && (this.field4416[var11][var9] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg7 == 8) {
                if (var10 == var11 && (var12 + 1) == var9 && (this.field4416[var11][var9] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var11 && (var12 - 1) == var9 && (this.field4416[var11][var9] & 0x2) == 0) {
                    return true;
                }
                if ((var10 - 1) == var11 && var9 == var12 && (this.field4416[var11][var9] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var11 && var9 == var12 && (this.field4416[var11][var9] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg1 + var11 - 1;
            int var14 = arg1 + var9 - 1;
            if (arg7 == 6 || arg7 == 7) {
                if (arg7 == 7) {
                    arg3 = arg3 + 2 & 0x3;
                }
                if (arg3 == 0) {
                    if ((var10 + 1) == var11 && var9 <= var12 && var14 >= var12 && (this.field4416[var11][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var13 >= var10 && (var12 - arg1) == var9 && (this.field4416[var10][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var10 - arg1 == var11 && var12 >= var9 && var12 <= var14 && (this.field4416[var13][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var13 >= var10 && (var12 - arg1) == var9 && (this.field4416[var10][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if ((var10 - arg1) == var11 && var9 <= var12 && var14 >= var12 && (this.field4416[var13][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var10 <= var13 && (var12 + 1) == var9 && (this.field4416[var10][var9] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if ((var10 + 1) == var11 && var9 <= var12 && var12 <= var14 && (this.field4416[var11][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var13 >= var10 && (var12 + 1) == var9 && (this.field4416[var10][var9] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg7 == 8) {
                if (var11 <= var10 && var10 <= var13 && (var12 + 1) == var9 && (this.field4416[var10][var9] & 0x20) == 0) {
                    return true;
                }
                if (var11 <= var10 && var10 <= var13 && var12 - arg1 == var9 && (this.field4416[var10][var14] & 0x2) == 0) {
                    return true;
                }
                if ((var10 - arg1) == var11 && var9 <= var12 && var12 <= var14 && (this.field4416[var13][var12] & 0x8) == 0) {
                    return true;
                }
                if ((var10 + 1) == var11 && var12 >= var9 && var12 <= var14 && (this.field4416[var11][var12] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(ZIIZIIII)V", line = 1579)
    public final void method1991(boolean arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        field4411++;
        int var9 = 256;
        if (arg0) {
            var9 |= 0x20000;
        }
        if (arg3) {
            var9 |= 0x40000000;
        }
        if (arg4 == 1 || arg4 == 3) {
            int var10 = arg7;
            arg7 = arg5;
            arg5 = var10;
        }
        if (arg1 != -1) {
            this.field4426 = -9;
        }
        int var11 = arg2 - this.field4426;
        int var12 = arg6 - this.field4427;
        for (int var13 = var12; var13 < (arg7 + var12); var13++) {
            if (var13 >= 0 && this.field4405 > var13) {
                for (int var14 = var11; var14 < (var11 + arg5); var14++) {
                    if (var14 >= 0 && this.field4421 > var14) {
                        this.method1982(-2, var13, var9, var14);
                    }
                }
            }
        }
    }
}
