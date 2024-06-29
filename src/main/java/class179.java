import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class179 {

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "I")
    private int field3059 = 0;

    @OriginalMember(owner = "client!qd", name = "s", descriptor = "I")
    private int field3073;

    @OriginalMember(owner = "client!qd", name = "u", descriptor = "I")
    private int field3075;

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "I")
    private int field3067;

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "[[I")
    public int[][] field3061;

    @OriginalMember(owner = "client!qd", name = "r", descriptor = "Lbd;")
    public static class162 field3072 = class17.method142(0, ")1a2)1m");

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "I")
    public static int field3063 = 0;

    @OriginalMember(owner = "client!qd", name = "w", descriptor = "I")
    public static int field3077 = 0;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
    public static int field3055;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "I")
    public static int field3056;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
    public static int field3057;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "I")
    public static int field3060;

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "I")
    public static int field3062;

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "I")
    public static int field3064;

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "I")
    public static int field3065;

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "I")
    public static int field3066;

    @OriginalMember(owner = "client!qd", name = "n", descriptor = "I")
    public static int field3068;

    @OriginalMember(owner = "client!qd", name = "o", descriptor = "I")
    public static int field3069;

    @OriginalMember(owner = "client!qd", name = "p", descriptor = "I")
    public static int field3070;

    @OriginalMember(owner = "client!qd", name = "q", descriptor = "I")
    public static int field3071;

    @OriginalMember(owner = "client!qd", name = "t", descriptor = "I")
    public static int field3074;

    @OriginalMember(owner = "client!qd", name = "v", descriptor = "I")
    public static int field3076;

    @OriginalMember(owner = "client!qd", name = "x", descriptor = "I")
    public static int field3078;

    @OriginalMember(owner = "client!qd", name = "y", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!qd", name = "z", descriptor = "I")
    public static int field3080;

    @OriginalMember(owner = "client!qd", name = "A", descriptor = "I")
    public static int field3081;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IZIB)V", line = 24)
    public static final void method1350(int arg0, boolean arg1, int arg2, byte arg3) {
        field3056++;
        if (arg3 <= 5) {
            field3077 = -37;
        }
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        class15.field233 = arg1;
        class305.field5135 = arg2;
        class306.field5146 = arg0;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZIIIII)V", line = 42)
    public final void method1351(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != -4) {
            this.method1367(-127, 0, 58, 97);
        }
        int var7 = arg4 - this.field3075;
        field3074++;
        int var8 = arg5 - this.field3059;
        if (arg3 == 0) {
            if (arg2 == 0) {
                this.method1367(var7, -65, 128, var8);
                this.method1367(var7 - 1, arg1 ^ 0x9, 8, var8);
            }
            if (arg2 == 1) {
                this.method1367(var7, -24, 2, var8);
                this.method1367(var7, 97, 32, var8 + 1);
            }
            if (arg2 == 2) {
                this.method1367(var7, -112, 8, var8);
                this.method1367(var7 + 1, 89, 128, var8);
            }
            if (arg2 == 3) {
                this.method1367(var7, -62, 32, var8);
                this.method1367(var7, -28, 2, var8 - 1);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg2 == 0) {
                this.method1367(var7, 127, 1, var8);
                this.method1367(var7 - 1, arg1 ^ 0xFFFFFFEC, 16, var8 + 1);
            }
            if (arg2 == 1) {
                this.method1367(var7, 4, 4, var8);
                this.method1367(var7 + 1, -69, 64, var8 + 1);
            }
            if (arg2 == 2) {
                this.method1367(var7, 109, 16, var8);
                this.method1367(var7 + 1, -25, 1, var8 - 1);
            }
            if (arg2 == 3) {
                this.method1367(var7, 93, 64, var8);
                this.method1367(var7 - 1, -12, 4, var8 - 1);
            }
        }
        if (arg3 == 2) {
            if (arg2 == 0) {
                this.method1367(var7, arg1 ^ 0xFFFFFFFB, 130, var8);
                this.method1367(var7 - 1, arg1 ^ 0xFFFFFF87, 8, var8);
                this.method1367(var7, -107, 32, var8 + 1);
            }
            if (arg2 == 1) {
                this.method1367(var7, -114, 10, var8);
                this.method1367(var7, 5, 32, var8 + 1);
                this.method1367(var7 + 1, arg1 + 130, 128, var8);
            }
            if (arg2 == 2) {
                this.method1367(var7, 113, 40, var8);
                this.method1367(var7 + 1, 117, 128, var8);
                this.method1367(var7, 125, 2, var8 - 1);
            }
            if (arg2 == 3) {
                this.method1367(var7, 127, 160, var8);
                this.method1367(var7, 112, 2, var8 - 1);
                this.method1367(var7 - 1, 98, 8, var8);
            }
        }
        if (!arg0) {
            return;
        }
        if (arg3 == 0) {
            if (arg2 == 0) {
                this.method1367(var7, -92, 65536, var8);
                this.method1367(var7 - 1, arg1 ^ 0xFFFFFF9A, 4096, var8);
            }
            if (arg2 == 1) {
                this.method1367(var7, -111, 1024, var8);
                this.method1367(var7, arg1 + 96, 16384, var8 + 1);
            }
            if (arg2 == 2) {
                this.method1367(var7, arg1 + 120, 4096, var8);
                this.method1367(var7 + 1, 122, 65536, var8);
            }
            if (arg2 == 3) {
                this.method1367(var7, -53, 16384, var8);
                this.method1367(var7, 98, 1024, var8 - 1);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg2 == 0) {
                this.method1367(var7, -26, 512, var8);
                this.method1367(var7 - 1, arg1 + 123, 8192, var8 + 1);
            }
            if (arg2 == 1) {
                this.method1367(var7, -68, 2048, var8);
                this.method1367(var7 + 1, 7, 32768, var8 + 1);
            }
            if (arg2 == 2) {
                this.method1367(var7, -86, 8192, var8);
                this.method1367(var7 + 1, 119, 512, var8 - 1);
            }
            if (arg2 == 3) {
                this.method1367(var7, 107, 32768, var8);
                this.method1367(var7 - 1, -110, 2048, var8 - 1);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method1367(var7, 122, 66560, var8);
            this.method1367(var7 - 1, -128, 4096, var8);
            this.method1367(var7, 90, 16384, var8 + 1);
        }
        if (arg2 == 1) {
            this.method1367(var7, -22, 5120, var8);
            this.method1367(var7, arg1 + 102, 16384, var8 + 1);
            this.method1367(var7 + 1, arg1 ^ 0x9, 65536, var8);
        }
        if (arg2 == 2) {
            this.method1367(var7, -98, 20480, var8);
            this.method1367(var7 + 1, arg1 ^ 0xFFFFFF8B, 65536, var8);
            this.method1367(var7, -74, 1024, var8 - 1);
        }
        if (arg2 == 3) {
            this.method1367(var7, -61, 81920, var8);
            this.method1367(var7, arg1 ^ 0xFFFFFF87, 1024, var8 - 1);
            this.method1367(var7 - 1, arg1 ^ 0xFFFFFF95, 4096, var8);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIIIIII)Z", line = 250)
    public final boolean method1352(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3071++;
        if (arg2 == arg6) {
            if (arg1 == arg7 && arg4 == arg5) {
                return true;
            }
        } else if (arg7 <= arg1 && arg7 + arg2 - 1 >= arg1 && arg4 <= arg4 && arg4 <= (arg4 + arg2 - 1)) {
            return true;
        }
        int var9 = arg1 - this.field3075;
        int var10 = arg7 - this.field3075;
        int var11 = arg5 - this.field3059;
        int var12 = arg4 - this.field3059;
        if (arg2 == 1) {
            if (arg3 == 0) {
                if (arg0 == 0) {
                    if ((var9 - 1) == var10 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var12 + 1 == var11 && (this.field3061[var10][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var12 - 1) == var11 && (this.field3061[var10][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var9 == var10 && var12 + 1 == var11) {
                        return true;
                    }
                    if (var9 - 1 == var10 && var11 == var12 && (this.field3061[var10][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var11 == var12 && (this.field3061[var10][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if (var9 + 1 == var10 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && (var12 + 1) == var11 && (this.field3061[var10][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var12 - 1) == var11 && (this.field3061[var10][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var9 == var10 && (var12 - 1) == var11) {
                        return true;
                    }
                    if ((var9 - 1) == var10 && var11 == var12 && (this.field3061[var10][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var10 && var11 == var12 && (this.field3061[var10][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 2) {
                if (arg0 == 0) {
                    if ((var9 - 1) == var10 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && (var12 + 1) == var11) {
                        return true;
                    }
                    if (var9 + 1 == var10 && var11 == var12 && (this.field3061[var10][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var12 - 1) == var11 && (this.field3061[var10][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if ((var9 - 1) == var10 && var11 == var12 && (this.field3061[var10][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var12 + 1 == var11) {
                        return true;
                    }
                    if (var9 + 1 == var10 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var12 - 1 == var11 && (this.field3061[var10][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if (var9 - 1 == var10 && var11 == var12 && (this.field3061[var10][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var12 + 1) == var11 && (this.field3061[var10][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var12 - 1 == var11) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var9 - 1 == var10 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var12 + 1 == var11 && (this.field3061[var10][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var10 && var11 == var12 && (this.field3061[var10][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var12 - 1 == var11) {
                        return true;
                    }
                }
            }
            if (arg3 == 9) {
                if (var9 == var10 && var12 + 1 == var11 && (this.field3061[var10][var11] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var10 && (var12 - 1) == var11 && (this.field3061[var10][var11] & 0x2) == 0) {
                    return true;
                }
                if (var9 - 1 == var10 && var11 == var12 && (this.field3061[var10][var11] & 0x8) == 0) {
                    return true;
                }
                if ((var9 + 1) == var10 && var11 == var12 && (this.field3061[var10][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var10 + arg2 - 1;
            int var14 = var11 + arg2 - 1;
            if (arg3 == 0) {
                if (arg0 == 0) {
                    if (var9 - arg2 == var10 && var11 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var9 >= var10 && var9 <= var13 && (var12 + 1) == var11 && (this.field3061[var9][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 >= var10 && var13 >= var9 && var12 - arg2 == var11 && (this.field3061[var9][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var9 >= var10 && var13 >= var9 && var12 + 1 == var11) {
                        return true;
                    }
                    if (var9 - arg2 == var10 && var12 >= var11 && var14 >= var12 && (this.field3061[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var10 && var12 >= var11 && var12 <= var14 && (this.field3061[var10][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if (var9 + 1 == var10 && var11 <= var12 && var14 >= var12) {
                        return true;
                    }
                    if (var9 >= var10 && var9 <= var13 && (var12 + 1) == var11 && (this.field3061[var9][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 <= var9 && var9 <= var13 && (var12 - arg2) == var11 && (this.field3061[var9][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var9 >= var10 && var9 <= var13 && var12 - arg2 == var11) {
                        return true;
                    }
                    if (var9 - arg2 == var10 && var12 >= var11 && var12 <= var14 && (this.field3061[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var11 <= var12 && var14 >= var12 && (this.field3061[var10][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 2) {
                if (arg0 == 0) {
                    if (var9 - arg2 == var10 && var11 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var9 >= var10 && var13 >= var9 && var12 + 1 == var11) {
                        return true;
                    }
                    if (var9 + 1 == var10 && var11 <= var12 && var12 <= var14 && (this.field3061[var10][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var10 <= var9 && var13 >= var9 && var12 - arg2 == var11 && (this.field3061[var9][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if ((var9 - arg2) == var10 && var11 <= var12 && var14 >= var12 && (this.field3061[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 <= var9 && var9 <= var13 && (var12 + 1) == var11) {
                        return true;
                    }
                    if (var9 + 1 == var10 && var11 <= var12 && var14 >= var12) {
                        return true;
                    }
                    if (var10 <= var9 && var9 <= var13 && var12 - arg2 == var11 && (this.field3061[var9][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if (var9 - arg2 == var10 && var11 <= var12 && var14 >= var12 && (this.field3061[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 >= var10 && var13 >= var9 && (var12 + 1) == var11 && (this.field3061[var9][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var10 && var12 >= var11 && var14 >= var12) {
                        return true;
                    }
                    if (var9 >= var10 && var13 >= var9 && var12 - arg2 == var11) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var9 - arg2 == var10 && var11 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var10 <= var9 && var9 <= var13 && (var12 + 1) == var11 && (this.field3061[var9][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var10 && var12 >= var11 && var12 <= var14 && (this.field3061[var10][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var10 <= var9 && var9 <= var13 && var12 - arg2 == var11) {
                        return true;
                    }
                }
            }
            if (arg3 == 9) {
                if (var10 <= var9 && var9 <= var13 && var12 + 1 == var11 && (this.field3061[var9][var11] & 0x12C0120) == 0) {
                    return true;
                }
                if (var10 <= var9 && var9 <= var13 && (var12 - arg2) == var11 && (this.field3061[var9][var14] & 0x12C0102) == 0) {
                    return true;
                }
                if (var9 - arg2 == var10 && var11 <= var12 && var12 <= var14 && (this.field3061[var13][var12] & 0x12C0108) == 0) {
                    return true;
                }
                if (var9 + 1 == var10 && var12 >= var11 && var14 >= var12 && (this.field3061[var10][var12] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIZZI)V", line = 611)
    public final void method1353(int arg0, int arg1, int arg2, boolean arg3, boolean arg4, int arg5) {
        if (!arg4) {
            return;
        }
        int var7 = arg2 - this.field3059;
        int var8 = arg0 - this.field3075;
        field3081++;
        if (arg5 == 0) {
            if (arg1 == 0) {
                this.method1363(var8, true, 128, var7);
                this.method1363(var8 - 1, true, 8, var7);
            }
            if (arg1 == 1) {
                this.method1363(var8, true, 2, var7);
                this.method1363(var8, true, 32, var7 + 1);
            }
            if (arg1 == 2) {
                this.method1363(var8, true, 8, var7);
                this.method1363(var8 + 1, true, 128, var7);
            }
            if (arg1 == 3) {
                this.method1363(var8, true, 32, var7);
                this.method1363(var8, true, 2, var7 - 1);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg1 == 0) {
                this.method1363(var8, true, 1, var7);
                this.method1363(var8 - 1, true, 16, var7 + 1);
            }
            if (arg1 == 1) {
                this.method1363(var8, true, 4, var7);
                this.method1363(var8 + 1, arg4, 64, var7 + 1);
            }
            if (arg1 == 2) {
                this.method1363(var8, true, 16, var7);
                this.method1363(var8 + 1, true, 1, var7 - 1);
            }
            if (arg1 == 3) {
                this.method1363(var8, true, 64, var7);
                this.method1363(var8 - 1, true, 4, var7 - 1);
            }
        }
        if (arg5 == 2) {
            if (arg1 == 0) {
                this.method1363(var8, true, 130, var7);
                this.method1363(var8 - 1, true, 8, var7);
                this.method1363(var8, true, 32, var7 + 1);
            }
            if (arg1 == 1) {
                this.method1363(var8, true, 10, var7);
                this.method1363(var8, true, 32, var7 + 1);
                this.method1363(var8 + 1, arg4, 128, var7);
            }
            if (arg1 == 2) {
                this.method1363(var8, true, 40, var7);
                this.method1363(var8 + 1, true, 128, var7);
                this.method1363(var8, true, 2, var7 - 1);
            }
            if (arg1 == 3) {
                this.method1363(var8, arg4, 160, var7);
                this.method1363(var8, arg4, 2, var7 - 1);
                this.method1363(var8 - 1, arg4, 8, var7);
            }
        }
        if (!arg3) {
            return;
        }
        if (arg5 == 0) {
            if (arg1 == 0) {
                this.method1363(var8, true, 65536, var7);
                this.method1363(var8 - 1, true, 4096, var7);
            }
            if (arg1 == 1) {
                this.method1363(var8, arg4, 1024, var7);
                this.method1363(var8, true, 16384, var7 + 1);
            }
            if (arg1 == 2) {
                this.method1363(var8, arg4, 4096, var7);
                this.method1363(var8 + 1, arg4, 65536, var7);
            }
            if (arg1 == 3) {
                this.method1363(var8, true, 16384, var7);
                this.method1363(var8, true, 1024, var7 - 1);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg1 == 0) {
                this.method1363(var8, arg4, 512, var7);
                this.method1363(var8 - 1, true, 8192, var7 + 1);
            }
            if (arg1 == 1) {
                this.method1363(var8, true, 2048, var7);
                this.method1363(var8 + 1, true, 32768, var7 + 1);
            }
            if (arg1 == 2) {
                this.method1363(var8, true, 8192, var7);
                this.method1363(var8 + 1, true, 512, var7 - 1);
            }
            if (arg1 == 3) {
                this.method1363(var8, true, 32768, var7);
                this.method1363(var8 - 1, arg4, 2048, var7 - 1);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method1363(var8, true, 66560, var7);
            this.method1363(var8 - 1, true, 4096, var7);
            this.method1363(var8, true, 16384, var7 + 1);
        }
        if (arg1 == 1) {
            this.method1363(var8, true, 5120, var7);
            this.method1363(var8, true, 16384, var7 + 1);
            this.method1363(var8 + 1, arg4, 65536, var7);
        }
        if (arg1 == 2) {
            this.method1363(var8, true, 20480, var7);
            this.method1363(var8 + 1, true, 65536, var7);
            this.method1363(var8, true, 1024, var7 - 1);
        }
        if (arg1 == 3) {
            this.method1363(var8, arg4, 81920, var7);
            this.method1363(var8, arg4, 1024, var7 - 1);
            this.method1363(var8 - 1, true, 4096, var7);
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(IIIIIIII)Z", line = 825)
    public final boolean method1354(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3062++;
        if (arg5 != 128) {
            this.method1352(114, 91, -17, -27, -123, 26, 77, -126);
        }
        if (arg6 == 1) {
            if (arg1 == arg3 && arg2 == arg4) {
                return true;
            }
        } else if (arg3 <= arg1 && arg1 <= arg3 + arg6 - 1 && arg2 <= arg2 && arg2 <= (arg2 + arg6 - 1)) {
            return true;
        }
        int var9 = arg4 - this.field3059;
        int var10 = arg2 - this.field3059;
        int var11 = arg1 - this.field3075;
        int var12 = arg3 - this.field3075;
        if (arg6 == 1) {
            if (arg0 == 6 || arg0 == 7) {
                if (arg0 == 7) {
                    arg7 = arg7 + 2 & 0x3;
                }
                if (arg7 == 0) {
                    if (var11 + 1 == var12 && var9 == var10 && (this.field3061[var12][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var10 - 1 == var9 && (this.field3061[var12][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if (var11 - 1 == var12 && var9 == var10 && (this.field3061[var12][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var10 - 1 == var9 && (this.field3061[var12][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if (var11 - 1 == var12 && var9 == var10 && (this.field3061[var12][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var10 + 1) == var9 && (this.field3061[var12][var9] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if ((var11 + 1) == var12 && var9 == var10 && (this.field3061[var12][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var10 + 1) == var9 && (this.field3061[var12][var9] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 8) {
                if (var11 == var12 && var10 + 1 == var9 && (this.field3061[var12][var9] & 0x20) == 0) {
                    return true;
                }
                if (var11 == var12 && var10 - 1 == var9 && (this.field3061[var12][var9] & 0x2) == 0) {
                    return true;
                }
                if (var11 - 1 == var12 && var9 == var10 && (this.field3061[var12][var9] & 0x8) == 0) {
                    return true;
                }
                if (var11 + 1 == var12 && var9 == var10 && (this.field3061[var12][var9] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg6 + var12 - 1;
            int var14 = var9 + arg6 - 1;
            if (arg0 == 6 || arg0 == 7) {
                if (arg0 == 7) {
                    arg7 = arg7 + 2 & 0x3;
                }
                if (arg7 == 0) {
                    if (var11 + 1 == var12 && var9 <= var10 && var14 >= var10 && (this.field3061[var12][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 <= var11 && var11 <= var13 && var10 - arg6 == var9 && (this.field3061[var11][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if ((var11 - arg6) == var12 && var10 >= var9 && var10 <= var14 && (this.field3061[var13][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 <= var11 && var13 >= var11 && (var10 - arg6) == var9 && (this.field3061[var11][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if (var11 - arg6 == var12 && var9 <= var10 && var10 <= var14 && (this.field3061[var13][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 <= var11 && var11 <= var13 && (var10 + 1) == var9 && (this.field3061[var11][var9] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if ((var11 + 1) == var12 && var10 >= var9 && var14 >= var10 && (this.field3061[var12][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 >= var12 && var13 >= var11 && var10 + 1 == var9 && (this.field3061[var11][var9] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 8) {
                if (var11 >= var12 && var13 >= var11 && var10 + 1 == var9 && (this.field3061[var11][var9] & 0x20) == 0) {
                    return true;
                }
                if (var12 <= var11 && var13 >= var11 && (var10 - arg6) == var9 && (this.field3061[var11][var14] & 0x2) == 0) {
                    return true;
                }
                if (var11 - arg6 == var12 && var10 >= var9 && var10 <= var14 && (this.field3061[var13][var10] & 0x8) == 0) {
                    return true;
                }
                if (var11 + 1 == var12 && var10 >= var9 && var10 <= var14 && (this.field3061[var12][var10] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZZIIII)V", line = 1018)
    public final void method1355(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg3 - this.field3075;
        field3068++;
        int var8 = arg4 - this.field3059;
        int var9 = 256;
        if (arg0) {
            var9 += 131072;
        }
        int var10 = var7;
        if (!arg1) {
            return;
        }
        while (var10 < (arg2 + var7)) {
            if (var10 >= 0 && var10 < this.field3067) {
                for (int var11 = var8; var11 < (arg5 + var8); var11++) {
                    if (var11 >= 0 && var11 < this.field3073) {
                        this.method1363(var10, true, var9, var11);
                    }
                }
            }
            var10++;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIIIIIIII)Z", line = 1060)
    private final boolean method1356(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3069++;
        if (arg3 != 31136) {
            this.field3067 = 78;
        }
        int var11 = arg4 + arg6;
        int var12 = arg5 + arg9;
        int var13 = arg7 + arg8;
        int var14 = arg2 + arg0;
        if (arg2 <= arg6 && var14 > arg6) {
            if (arg8 == var12 && (arg1 & 0x4) == 0) {
                int var15 = arg6;
                int var16 = var14 < var11 ? var14 : var11;
                while (var15 < var16) {
                    if ((this.field3061[var15 - this.field3075][var12 - this.field3059 - 1] & 0x2) == 0) {
                        return true;
                    }
                    var15++;
                }
            } else if (arg9 == var13 && (arg1 & 0x1) == 0) {
                int var17 = arg6;
                int var18 = var11 <= var14 ? var11 : var14;
                while (var18 > var17) {
                    if ((this.field3061[var17 - this.field3075][arg9 - this.field3059] & 0x20) == 0) {
                        return true;
                    }
                    var17++;
                }
            }
        } else if (arg2 < var11 && var14 >= var11) {
            if (arg8 == var12 && (arg1 & 0x4) == 0) {
                for (int var19 = arg2; var19 < var11; var19++) {
                    if ((this.field3061[var19 - this.field3075][var12 - this.field3059 - 1] & 0x2) == 0) {
                        return true;
                    }
                }
            } else if (arg9 == var13 && (arg1 & 0x1) == 0) {
                for (int var20 = arg2; var20 < var11; var20++) {
                    if ((this.field3061[var20 - this.field3075][arg9 - this.field3059] & 0x20) == 0) {
                        return true;
                    }
                }
            }
        } else if (arg9 >= arg8 && var13 > arg9) {
            if (arg2 == var11 && (arg1 & 0x8) == 0) {
                int var21 = arg9;
                int var22 = var13 < var12 ? var13 : var12;
                while (var22 > var21) {
                    if ((this.field3061[var11 - this.field3075 - 1][var21 - this.field3059] & 0x8) == 0) {
                        return true;
                    }
                    var21++;
                }
            } else if (arg6 == var14 && (arg1 & 0x2) == 0) {
                int var23 = var13 < var12 ? var13 : var12;
                for (int var24 = arg9; var24 < var23; var24++) {
                    if ((this.field3061[arg6 - this.field3075][var24 - this.field3059] & 0x80) == 0) {
                        return true;
                    }
                }
            }
        } else if (arg8 < var12 && var12 <= var13) {
            if (arg2 == var11 && (arg1 & 0x8) == 0) {
                for (int var25 = arg8; var25 < var12; var25++) {
                    if ((this.field3061[var11 - this.field3075 - 1][var25 - this.field3059] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg6 == var14 && (arg1 & 0x2) == 0) {
                for (int var26 = arg8; var26 < var12; var26++) {
                    if ((this.field3061[arg6 - this.field3075][var26 - this.field3059] & 0x80) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(III)V", line = 1222)
    public final void method1357(int arg0, int arg1, int arg2) {
        field3079++;
        int var4 = arg0 - this.field3075;
        int var5 = arg2 - this.field3059;
        this.field3061[var4][var5] = class289.method2005(this.field3061[var4][var5], 262144);
        if (arg1 > -41) {
            field3063 = 124;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIBI)Z", line = 1236)
    public final boolean method1358(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field3055++;
        if (arg1 == arg4 && arg0 == arg2) {
            return true;
        }
        int var6 = arg2 - this.field3059;
        int var7 = arg4 - this.field3075;
        if (var7 < 0 || this.field3067 <= var7 || var6 < 0 || this.field3073 <= var6) {
            return false;
        }
        int var8 = arg1 - this.field3075;
        int var9 = arg0 - this.field3059;
        int var10;
        if (var7 > var8) {
            var10 = var7 - var8;
        } else {
            var10 = var8 - var7;
        }
        int var11;
        if (var9 < var6) {
            var11 = var6 - var9;
        } else {
            var11 = var9 - var6;
        }
        if (var10 <= var11) {
            int var12 = var10 * 65536 / var11;
            int var13 = 32768;
            while (var6 != var9) {
                if (var9 < var6) {
                    if ((this.field3061[var8][var9] & 0x12C0102) != 0) {
                        return false;
                    }
                    var9++;
                } else if (var6 < var9) {
                    if ((this.field3061[var8][var9] & 0x12C0120) != 0) {
                        return false;
                    }
                    var9--;
                }
                var13 += var12;
                if (var13 >= 65536) {
                    var13 -= 65536;
                    if (var7 > var8) {
                        if ((this.field3061[var8][var9] & 0x12C0108) != 0) {
                            return false;
                        }
                        var8++;
                    } else if (var7 < var8) {
                        if ((this.field3061[var8][var9] & 0x12C0180) != 0) {
                            return false;
                        }
                        var8--;
                    }
                }
            }
        } else {
            int var14 = var11 * 65536 / var10;
            int var15 = 32768;
            while (var7 != var8) {
                if (var7 > var8) {
                    if ((this.field3061[var8][var9] & 0x12C0108) != 0) {
                        return false;
                    }
                    var8++;
                } else if (var7 < var8) {
                    if ((this.field3061[var8][var9] & 0x12C0180) != 0) {
                        return false;
                    }
                    var8--;
                }
                var15 += var14;
                if (var15 >= 65536) {
                    var15 -= 65536;
                    if (var6 > var9) {
                        if ((this.field3061[var8][var9] & 0x12C0102) != 0) {
                            return false;
                        }
                        var9++;
                    } else if (var6 < var9) {
                        if ((this.field3061[var8][var9] & 0x12C0120) != 0) {
                            return false;
                        }
                        var9--;
                    }
                }
            }
        }
        if ((this.field3061[var7][var6] & 0x1240100) == 0) {
            int var16 = 107 / ((arg3 - 49) / 56);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(II)Lt;", line = 1387)
    public static final class313 method1359(int arg0, int arg1) {
        field3066++;
        if (arg0 != 19661184) {
            field3072 = (class162) null;
        }
        class313 var2 = (class313) class297.field4968.method1382((byte) -98, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class13.field216.method1128(class77.method579(arg1, arg0 - 19660929), 0, class133.method1050(true, arg1));
        class313 var4 = new class313();
        if (var3 != null) {
            var4.method2136(124, new class94(var3));
        }
        class297.field4968.method1386(var4, -63, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(III)V", line = 1413)
    public final void method1360(int arg0, int arg1, int arg2) {
        if (arg2 > -21) {
            field3077 = -108;
        }
        field3060++;
        int var4 = arg0 - this.field3059;
        int var5 = arg1 - this.field3075;
        this.field3061[var5][var4] = class289.method2005(this.field3061[var5][var4], 2097152);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IZIIIIZ)V", line = 1429)
    public final void method1361(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        int var8 = arg2 - this.field3075;
        int var9 = 256;
        int var10 = arg3 - this.field3059;
        field3076++;
        if (!arg6) {
            field3077 = 121;
        }
        if (arg0 == 1 || arg0 == 3) {
            int var11 = arg4;
            arg4 = arg5;
            arg5 = var11;
        }
        if (arg1) {
            var9 += 131072;
        }
        for (int var12 = var8; var12 < arg4 + var8; var12++) {
            if (var12 >= 0 && this.field3067 > var12) {
                for (int var13 = var10; var13 < arg5 + var10; var13++) {
                    if (var13 >= 0 && this.field3073 > var13) {
                        this.method1367(var12, 95, var9, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(III)V", line = 1480)
    public final void method1362(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field3059;
        field3070++;
        int var5 = arg1 - this.field3075;
        this.field3061[var5][var4] = class92.method695(this.field3061[var5][var4], -262145);
        int var6 = 104 % ((55 - arg2) / 35);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IZII)V", line = 1492)
    private final void method1363(int arg0, boolean arg1, int arg2, int arg3) {
        field3064++;
        this.field3061[arg0][arg3] = class289.method2005(this.field3061[arg0][arg3], arg2);
        if (!arg1) {
            field3063 = 7;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIIIIIIB)Z", line = 1507)
    private final boolean method1364(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8) {
        field3080++;
        if (arg6 + arg7 > arg1 && (arg1 + arg5) > arg7) {
            if (arg8 != 25) {
                this.field3059 = 120;
            }
            return arg3 < (arg0 + arg2) && arg0 < (arg3 + arg4);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lbd;I)Z", line = 1530)
    public static final boolean method1365(class162 arg0, int arg1) {
        field3058++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = arg1; var2 < class135.field2417; var2++) {
            if (arg0.method1282(class9.field108[var2], 54)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIIIIBII)Z", line = 1554)
    public final boolean method1366(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8) {
        field3078++;
        if (arg2 > 1) {
            return this.method1364(arg5, arg7, arg0, arg3, arg2, arg2, arg1, arg8, (byte) 25) ? true : this.method1356(arg1, arg4, arg8, 31136, arg2, arg2, arg7, arg0, arg5, arg3);
        }
        int var10 = arg0 + arg5 - 1;
        int var11 = arg1 + arg8 - 1;
        if (arg8 <= arg7 && arg7 <= var11 && arg3 >= arg5 && var10 >= arg3) {
            return true;
        } else if ((arg8 - 1) == arg7 && arg5 <= arg3 && var10 >= arg3 && (this.field3061[arg7 - this.field3075][arg3 - this.field3059] & 0x8) == 0 && (arg4 & 0x8) == 0) {
            return true;
        } else if ((var11 + 1) == arg7 && arg3 >= arg5 && arg3 <= var10 && (this.field3061[arg7 - this.field3075][arg3 - this.field3059] & 0x80) == 0 && (arg4 & 0x2) == 0) {
            return true;
        } else if ((arg5 - 1) == arg3 && arg8 <= arg7 && arg7 <= var11 && (this.field3061[arg7 - this.field3075][arg3 - this.field3059] & 0x2) == 0 && (arg4 & 0x4) == 0) {
            return true;
        } else {
            if (arg6 > -110) {
                field3077 = -80;
            }
            return var10 + 1 == arg3 && arg8 <= arg7 && arg7 <= var11 && (this.field3061[arg7 - this.field3075][arg3 - this.field3059] & 0x20) == 0 && (arg4 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIII)V", line = 1594)
    private final void method1367(int arg0, int arg1, int arg2, int arg3) {
        field3057++;
        this.field3061[arg0][arg3] = class92.method695(this.field3061[arg0][arg3], ~arg2);
        int var5 = -8 / ((52 - arg1) / 34);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V", line = 1606)
    public static void method1368(int arg0) {
        field3072 = null;
        if (arg0 != 0) {
            field3077 = -90;
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V", line = 1624)
    public final void method1369(int arg0) {
        for (int var2 = 0; var2 < this.field3067; var2++) {
            for (int var3 = 0; var3 < this.field3073; var3++) {
                if (var2 == 0 || var3 == 0 || (this.field3067 - 5) <= var2 || var3 >= this.field3073 - 5) {
                    this.field3061[var2][var3] = 16777215;
                } else {
                    this.field3061[var2][var3] = 16777216;
                }
            }
        }
        if (arg0 != 16777216) {
            method1365((class162) null, -109);
        }
        field3065++;
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(II)V", line = 1664)
    public class179(int arg0, int arg1) {
        this.field3073 = arg1;
        this.field3075 = 0;
        this.field3067 = arg0;
        this.field3061 = new int[this.field3067][this.field3073];
        this.method1369(16777216);
    }
}
