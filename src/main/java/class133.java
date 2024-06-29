import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class133 {

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "Lao;")
    public static class188 field2040 = new class188(57, 8);

    @OriginalMember(owner = "client!oe", name = "x", descriptor = "I")
    public static int field2060 = 0;

    @OriginalMember(owner = "client!oe", name = "A", descriptor = "[B")
    public static byte[] field2063 = new byte[2048];

    @OriginalMember(owner = "client!oe", name = "z", descriptor = "I")
    public static int field2062 = 0;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "I")
    public static int field2037;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "I")
    public int field2044;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "I")
    public static int field2046;

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "I")
    public int field2048;

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!oe", name = "n", descriptor = "I")
    public int field2050;

    @OriginalMember(owner = "client!oe", name = "o", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!oe", name = "p", descriptor = "I")
    public int field2052;

    @OriginalMember(owner = "client!oe", name = "q", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!oe", name = "r", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!oe", name = "s", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!oe", name = "t", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!oe", name = "u", descriptor = "I")
    public static int field2057;

    @OriginalMember(owner = "client!oe", name = "w", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!oe", name = "y", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!oe", name = "B", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!oe", name = "v", descriptor = "Lmg;")
    public static class100 field2058;

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "[[I")
    public int[][] field2047;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method971(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2057++;
        if (arg4 == 1) {
            if (arg1 == arg3 && arg6 == arg7) {
                return true;
            }
        } else if (arg1 <= arg3 && (arg1 + arg4 - 1) >= arg3 && arg6 >= arg6 && arg4 + arg6 - 1 >= arg6) {
            return true;
        }
        int var9 = arg3 - this.field2050;
        int var10 = arg6 - this.field2052;
        int var11 = arg1 - this.field2050;
        int var12 = arg7 - this.field2052;
        if (arg4 == 1) {
            if (arg2 == 6 || arg2 == 7) {
                if (arg2 == 7) {
                    arg0 = arg0 + 2 & 0x3;
                }
                if (arg0 == 0) {
                    if (var9 + 1 == var11 && var10 == var12 && (this.field2047[var11][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var10 - 1) == var12 && (this.field2047[var11][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if ((var9 - 1) == var11 && var10 == var12 && (this.field2047[var11][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 - 1 == var12 && (this.field2047[var11][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if (var9 - 1 == var11 && var10 == var12 && (this.field2047[var11][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 + 1 == var12 && (this.field2047[var11][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if ((var9 + 1) == var11 && var10 == var12 && (this.field2047[var11][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var10 + 1) == var12 && (this.field2047[var11][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 8) {
                if (var9 == var11 && var10 + 1 == var12 && (this.field2047[var11][var12] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var11 && (var10 - 1) == var12 && (this.field2047[var11][var12] & 0x2) == 0) {
                    return true;
                }
                if ((var9 - 1) == var11 && var10 == var12 && (this.field2047[var11][var12] & 0x8) == 0) {
                    return true;
                }
                if ((var9 + 1) == var11 && var10 == var12 && (this.field2047[var11][var12] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var11 + arg4 - 1;
            int var14 = var12 + arg4 - 1;
            if (arg2 == 6 || arg2 == 7) {
                if (arg2 == 7) {
                    arg0 = arg0 + 2 & 0x3;
                }
                if (arg0 == 0) {
                    if ((var9 + 1) == var11 && var12 <= var10 && var14 >= var10 && (this.field2047[var11][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var13 >= var9 && (var10 - arg4) == var12 && (this.field2047[var9][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if ((var9 - arg4) == var11 && var12 <= var10 && var14 >= var10 && (this.field2047[var13][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 >= var11 && var13 >= var9 && var10 - arg4 == var12 && (this.field2047[var9][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if ((var9 - arg4) == var11 && var12 <= var10 && var14 >= var10 && (this.field2047[var13][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var9 <= var13 && var10 + 1 == var12 && (this.field2047[var9][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var9 + 1 == var11 && var12 <= var10 && var10 <= var14 && (this.field2047[var11][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var13 && (var10 + 1) == var12 && (this.field2047[var9][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 8) {
                if (var9 >= var11 && var9 <= var13 && var10 + 1 == var12 && (this.field2047[var9][var12] & 0x20) == 0) {
                    return true;
                }
                if (var9 >= var11 && var13 >= var9 && (var10 - arg4) == var12 && (this.field2047[var9][var14] & 0x2) == 0) {
                    return true;
                }
                if ((var9 - arg4) == var11 && var10 >= var12 && var10 <= var14 && (this.field2047[var13][var10] & 0x8) == 0) {
                    return true;
                }
                if (var9 + 1 == var11 && var12 <= var10 && var14 >= var10 && (this.field2047[var11][var10] & 0x80) == 0) {
                    return true;
                }
            }
        }
        if (arg5 != 0) {
            method988((byte) 76, null, null, null, null);
        }
        return false;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIIIIIIII)Z")
    public final boolean method972(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2059++;
        if (arg2 < 52) {
            field2062 = -19;
        }
        int var11 = arg1 + arg6;
        int var12 = arg7 + arg9;
        int var13 = arg4 + arg5;
        int var14 = arg0 + arg3;
        if (arg6 == var13 && (arg8 & 0x2) == 0) {
            int var15 = arg7 > arg0 ? arg7 : arg0;
            int var16 = var12 >= var14 ? var14 : var12;
            while (var15 < var16) {
                if ((this.field2047[var13 - this.field2050 - 1][var15 - this.field2052] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg4 == var11 && (arg8 & 0x8) == 0) {
            int var17 = arg0 < arg7 ? arg7 : arg0;
            int var18 = var12 < var14 ? var12 : var14;
            while (var17 < var18) {
                if ((this.field2047[arg4 - this.field2050][var17 - this.field2052] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg7 == var14 && (arg8 & 0x1) == 0) {
            int var19 = arg6 > arg4 ? arg6 : arg4;
            int var20 = var13 <= var11 ? var13 : var11;
            while (var19 < var20) {
                if ((this.field2047[var19 - this.field2050][var14 - this.field2052 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg0 == var12 && (arg8 & 0x4) == 0) {
            int var21 = arg6 > arg4 ? arg6 : arg4;
            int var22 = var13 <= var11 ? var13 : var11;
            while (var21 < var22) {
                if ((this.field2047[var21 - this.field2050][arg0 - this.field2052] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIZBIIZ)V")
    public final void method973(int arg0, int arg1, boolean arg2, byte arg3, int arg4, int arg5, boolean arg6) {
        field2061++;
        int var8 = arg4 - this.field2050;
        int var9 = arg5 - this.field2052;
        if (arg1 == 0) {
            if (arg0 == 0) {
                this.method989(var9, var8, 128, -2);
                this.method989(var9, var8 - 1, 8, -2);
            }
            if (arg0 == 1) {
                this.method989(var9, var8, 2, -2);
                this.method989(var9 + 1, var8, 32, -2);
            }
            if (arg0 == 2) {
                this.method989(var9, var8, 8, -2);
                this.method989(var9, var8 + 1, 128, -2);
            }
            if (arg0 == 3) {
                this.method989(var9, var8, 32, -2);
                this.method989(var9 - 1, var8, 2, -2);
            }
        }
        if (arg3 >= -32) {
            method986(101, -72, false);
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg0 == 0) {
                this.method989(var9, var8, 1, -2);
                this.method989(var9 + 1, var8 + -1, 16, -2);
            }
            if (arg0 == 1) {
                this.method989(var9, var8, 4, -2);
                this.method989(var9 + 1, var8 + 1, 64, -2);
            }
            if (arg0 == 2) {
                this.method989(var9, var8, 16, -2);
                this.method989(var9 - 1, var8 - -1, 1, -2);
            }
            if (arg0 == 3) {
                this.method989(var9, var8, 64, -2);
                this.method989(var9 - 1, var8 + -1, 4, -2);
            }
        }
        if (arg1 == 2) {
            if (arg0 == 0) {
                this.method989(var9, var8, 130, -2);
                this.method989(var9, var8 - 1, 8, -2);
                this.method989(var9 + 1, var8, 32, -2);
            }
            if (arg0 == 1) {
                this.method989(var9, var8, 10, -2);
                this.method989(var9 + 1, var8, 32, -2);
                this.method989(var9, var8 + 1, 128, -2);
            }
            if (arg0 == 2) {
                this.method989(var9, var8, 40, -2);
                this.method989(var9, var8 + 1, 128, -2);
                this.method989(var9 - 1, var8, 2, -2);
            }
            if (arg0 == 3) {
                this.method989(var9, var8, 160, -2);
                this.method989(var9 - 1, var8, 2, -2);
                this.method989(var9, var8 - 1, 8, -2);
            }
        }
        if (arg2) {
            if (arg1 == 0) {
                if (arg0 == 0) {
                    this.method989(var9, var8, 65536, -2);
                    this.method989(var9, var8 - 1, 4096, -2);
                }
                if (arg0 == 1) {
                    this.method989(var9, var8, 1024, -2);
                    this.method989(var9 + 1, var8, 16384, -2);
                }
                if (arg0 == 2) {
                    this.method989(var9, var8, 4096, -2);
                    this.method989(var9, var8 + 1, 65536, -2);
                }
                if (arg0 == 3) {
                    this.method989(var9, var8, 16384, -2);
                    this.method989(var9 - 1, var8, 1024, -2);
                }
            }
            if (arg1 == 1 || arg1 == 3) {
                if (arg0 == 0) {
                    this.method989(var9, var8, 512, -2);
                    this.method989(var9 + 1, var8 + -1, 8192, -2);
                }
                if (arg0 == 1) {
                    this.method989(var9, var8, 2048, -2);
                    this.method989(var9 + 1, var8 + 1, 32768, -2);
                }
                if (arg0 == 2) {
                    this.method989(var9, var8, 8192, -2);
                    this.method989(var9 - 1, var8 - -1, 512, -2);
                }
                if (arg0 == 3) {
                    this.method989(var9, var8, 32768, -2);
                    this.method989(var9 - 1, var8 + -1, 2048, -2);
                }
            }
            if (arg1 == 2) {
                if (arg0 == 0) {
                    this.method989(var9, var8, 66560, -2);
                    this.method989(var9, var8 - 1, 4096, -2);
                    this.method989(var9 + 1, var8, 16384, -2);
                }
                if (arg0 == 1) {
                    this.method989(var9, var8, 5120, -2);
                    this.method989(var9 + 1, var8, 16384, -2);
                    this.method989(var9, var8 + 1, 65536, -2);
                }
                if (arg0 == 2) {
                    this.method989(var9, var8, 20480, -2);
                    this.method989(var9, var8 + 1, 65536, -2);
                    this.method989(var9 - 1, var8, 1024, -2);
                }
                if (arg0 == 3) {
                    this.method989(var9, var8, 81920, -2);
                    this.method989(var9 - 1, var8, 1024, -2);
                    this.method989(var9, var8 - 1, 4096, -2);
                }
            }
        }
        if (!arg6) {
            return;
        }
        if (arg1 == 0) {
            if (arg0 == 0) {
                this.method989(var9, var8, 536870912, -2);
                this.method989(var9, var8 - 1, 33554432, -2);
            }
            if (arg0 == 1) {
                this.method989(var9, var8, 8388608, -2);
                this.method989(var9 + 1, var8, 134217728, -2);
            }
            if (arg0 == 2) {
                this.method989(var9, var8, 33554432, -2);
                this.method989(var9, var8 + 1, 536870912, -2);
            }
            if (arg0 == 3) {
                this.method989(var9, var8, 134217728, -2);
                this.method989(var9 - 1, var8, 8388608, -2);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg0 == 0) {
                this.method989(var9, var8, 4194304, -2);
                this.method989(var9 + 1, var8 - 1, 67108864, -2);
            }
            if (arg0 == 1) {
                this.method989(var9, var8, 16777216, -2);
                this.method989(var9 + 1, var8 + 1, 268435456, -2);
            }
            if (arg0 == 2) {
                this.method989(var9, var8, 67108864, -2);
                this.method989(var9 - 1, var8 + 1, 4194304, -2);
            }
            if (arg0 == 3) {
                this.method989(var9, var8, 268435456, -2);
                this.method989(var9 - 1, var8 + -1, 16777216, -2);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method989(var9, var8, 545259520, -2);
            this.method989(var9, var8 - 1, 33554432, -2);
            this.method989(var9 + 1, var8, 134217728, -2);
        }
        if (arg0 == 1) {
            this.method989(var9, var8, 41943040, -2);
            this.method989(var9 + 1, var8, 134217728, -2);
            this.method989(var9, var8 + 1, 536870912, -2);
        }
        if (arg0 == 2) {
            this.method989(var9, var8, 167772160, -2);
            this.method989(var9, var8 + 1, 536870912, -2);
            this.method989(var9 - 1, var8, 8388608, -2);
        }
        if (arg0 == 3) {
            this.method989(var9, var8, 671088640, -2);
            this.method989(var9 - 1, var8, 8388608, -2);
            this.method989(var9, var8 - 1, 33554432, -2);
            return;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIIIIIII)Z")
    public final boolean method974(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg6 != 2) {
            this.field2052 = -42;
        }
        field2053++;
        if (arg1 > 1) {
            return class310.method1945(arg1, arg3, arg8, (byte) -73, arg4, arg5, arg7, arg0, arg1) ? true : this.method972(arg8, arg1, 103, arg0, arg3, arg4, arg7, arg5, arg2, arg1);
        }
        int var10 = arg3 + arg4 - 1;
        int var11 = arg8 + arg0 - 1;
        if (arg3 <= arg7 && arg7 <= var10 && arg5 >= arg8 && var11 >= arg5) {
            return true;
        } else if ((arg3 - 1) == arg7 && arg8 <= arg5 && arg5 <= var11 && (this.field2047[arg7 - this.field2050][arg5 - this.field2052] & 0x8) == 0 && (arg2 & 0x8) == 0) {
            return true;
        } else if ((var10 + 1) == arg7 && arg8 <= arg5 && arg5 <= var11 && (this.field2047[arg7 - this.field2050][arg5 - this.field2052] & 0x80) == 0 && (arg2 & 0x2) == 0) {
            return true;
        } else if (arg8 - 1 == arg5 && arg7 >= arg3 && var10 >= arg7 && (this.field2047[arg7 - this.field2050][arg5 - this.field2052] & 0x2) == 0 && (arg2 & 0x4) == 0) {
            return true;
        } else {
            return var11 + 1 == arg5 && arg3 <= arg7 && arg7 <= var10 && (this.field2047[arg7 - this.field2050][arg5 - this.field2052] & 0x20) == 0 && (arg2 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZII)V")
    public final void method975(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            this.method989(-101, -24, -121, -75);
        }
        field2046++;
        int var4 = arg1 - this.field2050;
        int var5 = arg2 - this.field2052;
        this.field2047[var4][var5] = class29.method239(this.field2047[var4][var5], 2097152);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z)V")
    public static void method976(boolean arg0) {
        if (arg0) {
            method988((byte) -94, null, null, null, null);
        }
        field2063 = null;
        field2040 = null;
        field2058 = null;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(BII)V")
    public final void method977(byte arg0, int arg1, int arg2) {
        if (arg0 != 78) {
            this.method980(-34, (byte) 87, -14, false, 10, false, 103);
        }
        int var4 = arg2 - this.field2050;
        int var5 = arg1 - this.field2052;
        field2064++;
        this.field2047[var4][var5] = class388.method2441(this.field2047[var4][var5], -2097153);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIZIBZ)V")
    public final void method978(int arg0, int arg1, int arg2, boolean arg3, int arg4, byte arg5, boolean arg6) {
        field2042++;
        int var8 = 256;
        if (arg6) {
            var8 |= 0x20000;
        }
        int var9 = arg4 - this.field2050;
        if (arg3) {
            var8 |= 0x40000000;
        }
        int var10 = arg1 - this.field2052;
        if (arg5 <= 91) {
            return;
        }
        for (int var11 = var9; var11 < arg2 + var9; var11++) {
            if (var11 >= 0 && this.field2044 > var11) {
                for (int var12 = var10; var12 < (arg0 + var10); var12++) {
                    if (var12 >= 0 && var12 < this.field2048) {
                        this.method989(var12, var11, var8, -2);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(IIIIIIII)Z")
    public final boolean method979(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2056++;
        if (arg1 == 1) {
            if (arg0 == arg2 && arg6 == arg7) {
                return true;
            }
        } else if (arg2 >= arg0 && arg2 <= (arg0 + arg1 - 1) && arg7 <= arg7 && arg7 <= arg1 + arg7 - 1) {
            return true;
        }
        int var9 = arg6 - this.field2052;
        if (arg3 != 0) {
            return false;
        }
        int var10 = arg0 - this.field2050;
        int var11 = arg2 - this.field2050;
        int var12 = arg7 - this.field2052;
        if (arg1 == 1) {
            if (arg5 == 0) {
                if (arg4 == 0) {
                    if (var11 - 1 == var10 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9 && (this.field2047[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 - 1) == var9 && (this.field2047[var10][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var10 == var11 && var12 + 1 == var9) {
                        return true;
                    }
                    if (var11 - 1 == var10 && var9 == var12 && (this.field2047[var10][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var9 == var12 && (this.field2047[var10][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if (var11 + 1 == var10 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var12 + 1 == var9 && (this.field2047[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var9 && (this.field2047[var10][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var10 == var11 && var12 - 1 == var9) {
                        return true;
                    }
                    if ((var11 - 1) == var10 && var9 == var12 && (this.field2047[var10][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var9 == var12 && (this.field2047[var10][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 2) {
                if (arg4 == 0) {
                    if (var11 - 1 == var10 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var12 + 1 == var9) {
                        return true;
                    }
                    if ((var11 + 1) == var10 && var9 == var12 && (this.field2047[var10][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 - 1) == var9 && (this.field2047[var10][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var11 - 1 == var10 && var9 == var12 && (this.field2047[var10][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9) {
                        return true;
                    }
                    if ((var11 + 1) == var10 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var12 - 1) == var9 && (this.field2047[var10][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if ((var11 - 1) == var10 && var9 == var12 && (this.field2047[var10][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 + 1 == var9 && (this.field2047[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var10 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var9) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var11 - 1 == var10 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9 && (this.field2047[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var10 && var9 == var12 && (this.field2047[var10][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 - 1) == var9) {
                        return true;
                    }
                }
            }
            if (arg5 == 9) {
                if (var10 == var11 && (var12 + 1) == var9 && (this.field2047[var10][var9] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var11 && var12 - 1 == var9 && (this.field2047[var10][var9] & 0x2) == 0) {
                    return true;
                }
                if (var11 - 1 == var10 && var9 == var12 && (this.field2047[var10][var9] & 0x8) == 0) {
                    return true;
                }
                if ((var11 + 1) == var10 && var9 == var12 && (this.field2047[var10][var9] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg1 + var10 - 1;
            int var14 = var9 + arg1 - 1;
            if (arg5 == 0) {
                if (arg4 == 0) {
                    if ((var11 - arg1) == var10 && var9 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var11 >= var10 && var13 >= var11 && (var12 + 1) == var9 && (this.field2047[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 >= var10 && var11 <= var13 && (var12 - arg1) == var9 && (this.field2047[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var10 <= var11 && var13 >= var11 && var12 + 1 == var9) {
                        return true;
                    }
                    if (var11 - arg1 == var10 && var9 <= var12 && var14 >= var12 && (this.field2047[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var9 <= var12 && var12 <= var14 && (this.field2047[var10][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if ((var11 + 1) == var10 && var9 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var11 >= var10 && var13 >= var11 && var12 + 1 == var9 && (this.field2047[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 >= var10 && var11 <= var13 && var12 - arg1 == var9 && (this.field2047[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var11 >= var10 && var13 >= var11 && (var12 - arg1) == var9) {
                        return true;
                    }
                    if (var11 - arg1 == var10 && var9 <= var12 && var14 >= var12 && (this.field2047[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var12 >= var9 && var12 <= var14 && (this.field2047[var10][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 2) {
                if (arg4 == 0) {
                    if (var11 - arg1 == var10 && var9 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var10 <= var11 && var13 >= var11 && (var12 + 1) == var9) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var12 >= var9 && var14 >= var12 && (this.field2047[var10][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 <= var11 && var13 >= var11 && var12 - arg1 == var9 && (this.field2047[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var11 - arg1 == var10 && var12 >= var9 && var12 <= var14 && (this.field2047[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 >= var10 && var13 >= var11 && var12 + 1 == var9) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var12 >= var9 && var12 <= var14) {
                        return true;
                    }
                    if (var11 >= var10 && var11 <= var13 && var12 - arg1 == var9 && (this.field2047[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if ((var11 - arg1) == var10 && var9 <= var12 && var12 <= var14 && (this.field2047[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 <= var11 && var13 >= var11 && (var12 + 1) == var9 && (this.field2047[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var10 && var12 >= var9 && var12 <= var14) {
                        return true;
                    }
                    if (var10 <= var11 && var11 <= var13 && (var12 - arg1) == var9) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if ((var11 - arg1) == var10 && var12 >= var9 && var14 >= var12) {
                        return true;
                    }
                    if (var11 >= var10 && var13 >= var11 && (var12 + 1) == var9 && (this.field2047[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var12 >= var9 && var12 <= var14 && (this.field2047[var10][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 <= var11 && var13 >= var11 && var12 - arg1 == var9) {
                        return true;
                    }
                }
            }
            if (arg5 == 9) {
                if (var10 <= var11 && var11 <= var13 && (var12 + 1) == var9 && (this.field2047[var11][var9] & 0x2C0120) == 0) {
                    return true;
                }
                if (var11 >= var10 && var13 >= var11 && (var12 - arg1) == var9 && (this.field2047[var11][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if ((var11 - arg1) == var10 && var9 <= var12 && var12 <= var14 && (this.field2047[var13][var12] & 0x2C0108) == 0) {
                    return true;
                }
                if (var11 + 1 == var10 && var9 <= var12 && var12 <= var14 && (this.field2047[var10][var12] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IBIZIZI)V")
    public final void method980(int arg0, byte arg1, int arg2, boolean arg3, int arg4, boolean arg5, int arg6) {
        int var8 = arg2 - this.field2050;
        field2037++;
        int var9 = arg6 - this.field2052;
        if (arg0 == 0) {
            if (arg4 == 0) {
                this.method984(83, 128, var8, var9);
                this.method984(-75, 8, var8 - 1, var9);
            }
            if (arg4 == 1) {
                this.method984(103, 2, var8, var9);
                this.method984(52, 32, var8, var9 + 1);
            }
            if (arg4 == 2) {
                this.method984(62, 8, var8, var9);
                this.method984(78, 128, var8 + 1, var9);
            }
            if (arg4 == 3) {
                this.method984(120, 32, var8, var9);
                this.method984(-110, 2, var8, var9 - 1);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg4 == 0) {
                this.method984(-111, 1, var8, var9);
                this.method984(-103, 16, var8 - 1, var9 + 1);
            }
            if (arg4 == 1) {
                this.method984(-65, 4, var8, var9);
                this.method984(70, 64, var8 + 1, var9 + 1);
            }
            if (arg4 == 2) {
                this.method984(68, 16, var8, var9);
                this.method984(-72, 1, var8 + 1, var9 + -1);
            }
            if (arg4 == 3) {
                this.method984(50, 64, var8, var9);
                this.method984(-94, 4, var8 - 1, var9 + -1);
            }
        }
        if (arg0 == 2) {
            if (arg4 == 0) {
                this.method984(40, 130, var8, var9);
                this.method984(-115, 8, var8 - 1, var9);
                this.method984(-84, 32, var8, var9 + 1);
            }
            if (arg4 == 1) {
                this.method984(-78, 10, var8, var9);
                this.method984(-83, 32, var8, var9 + 1);
                this.method984(-107, 128, var8 + 1, var9);
            }
            if (arg4 == 2) {
                this.method984(107, 40, var8, var9);
                this.method984(33, 128, var8 + 1, var9);
                this.method984(-73, 2, var8, var9 - 1);
            }
            if (arg4 == 3) {
                this.method984(-119, 160, var8, var9);
                this.method984(121, 2, var8, var9 - 1);
                this.method984(103, 8, var8 - 1, var9);
            }
        }
        if (arg1 > -70) {
            method983(null, (byte) -10);
        }
        if (arg5) {
            if (arg0 == 0) {
                if (arg4 == 0) {
                    this.method984(122, 65536, var8, var9);
                    this.method984(-99, 4096, var8 - 1, var9);
                }
                if (arg4 == 1) {
                    this.method984(-74, 1024, var8, var9);
                    this.method984(46, 16384, var8, var9 + 1);
                }
                if (arg4 == 2) {
                    this.method984(44, 4096, var8, var9);
                    this.method984(-126, 65536, var8 + 1, var9);
                }
                if (arg4 == 3) {
                    this.method984(-76, 16384, var8, var9);
                    this.method984(106, 1024, var8, var9 - 1);
                }
            }
            if (arg0 == 1 || arg0 == 3) {
                if (arg4 == 0) {
                    this.method984(35, 512, var8, var9);
                    this.method984(-90, 8192, var8 - 1, var9 + 1);
                }
                if (arg4 == 1) {
                    this.method984(122, 2048, var8, var9);
                    this.method984(-116, 32768, var8 + 1, var9 + 1);
                }
                if (arg4 == 2) {
                    this.method984(-73, 8192, var8, var9);
                    this.method984(123, 512, var8 + 1, var9 + -1);
                }
                if (arg4 == 3) {
                    this.method984(-82, 32768, var8, var9);
                    this.method984(82, 2048, var8 - 1, var9 - 1);
                }
            }
            if (arg0 == 2) {
                if (arg4 == 0) {
                    this.method984(76, 66560, var8, var9);
                    this.method984(39, 4096, var8 - 1, var9);
                    this.method984(77, 16384, var8, var9 + 1);
                }
                if (arg4 == 1) {
                    this.method984(-125, 5120, var8, var9);
                    this.method984(48, 16384, var8, var9 + 1);
                    this.method984(54, 65536, var8 + 1, var9);
                }
                if (arg4 == 2) {
                    this.method984(62, 20480, var8, var9);
                    this.method984(64, 65536, var8 + 1, var9);
                    this.method984(-90, 1024, var8, var9 - 1);
                }
                if (arg4 == 3) {
                    this.method984(-104, 81920, var8, var9);
                    this.method984(93, 1024, var8, var9 - 1);
                    this.method984(99, 4096, var8 - 1, var9);
                }
            }
        }
        if (!arg3) {
            return;
        }
        if (arg0 == 0) {
            if (arg4 == 0) {
                this.method984(54, 536870912, var8, var9);
                this.method984(33, 33554432, var8 - 1, var9);
            }
            if (arg4 == 1) {
                this.method984(-104, 8388608, var8, var9);
                this.method984(-87, 134217728, var8, var9 + 1);
            }
            if (arg4 == 2) {
                this.method984(-109, 33554432, var8, var9);
                this.method984(-81, 536870912, var8 + 1, var9);
            }
            if (arg4 == 3) {
                this.method984(-84, 134217728, var8, var9);
                this.method984(-69, 8388608, var8, var9 - 1);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg4 == 0) {
                this.method984(-80, 4194304, var8, var9);
                this.method984(-97, 67108864, var8 - 1, var9 + 1);
            }
            if (arg4 == 1) {
                this.method984(-91, 16777216, var8, var9);
                this.method984(-99, 268435456, var8 + 1, var9 - -1);
            }
            if (arg4 == 2) {
                this.method984(-86, 67108864, var8, var9);
                this.method984(105, 4194304, var8 + 1, var9 + -1);
            }
            if (arg4 == 3) {
                this.method984(73, 268435456, var8, var9);
                this.method984(104, 16777216, var8 - 1, var9 + -1);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method984(-89, 545259520, var8, var9);
            this.method984(45, 33554432, var8 - 1, var9);
            this.method984(57, 134217728, var8, var9 + 1);
        }
        if (arg4 == 1) {
            this.method984(68, 41943040, var8, var9);
            this.method984(32, 134217728, var8, var9 + 1);
            this.method984(104, 536870912, var8 + 1, var9);
        }
        if (arg4 == 2) {
            this.method984(79, 167772160, var8, var9);
            this.method984(67, 536870912, var8 + 1, var9);
            this.method984(-113, 8388608, var8, var9 - 1);
        }
        if (arg4 == 3) {
            this.method984(112, 671088640, var8, var9);
            this.method984(115, 8388608, var8, var9 - 1);
            this.method984(-100, 33554432, var8 - 1, var9);
            return;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZIIIZIII)V")
    public final void method981(boolean arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        field2049++;
        int var9 = 256;
        if (arg0) {
            var9 |= 0x20000;
        }
        if (arg4) {
            var9 |= 0x40000000;
        }
        int var10 = arg7 - this.field2050;
        if (arg1 > -77) {
            return;
        }
        int var11 = arg3 - this.field2052;
        if (arg2 == 1 || arg2 == 3) {
            int var12 = arg6;
            arg6 = arg5;
            arg5 = var12;
        }
        for (int var13 = var10; var13 < arg6 + var10; var13++) {
            if (var13 >= 0 && var13 < this.field2044) {
                for (int var14 = var11; var14 < arg5 + var11; var14++) {
                    if (var14 >= 0 && this.field2048 > var14) {
                        this.method984(-110, var9, var13, var14);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
    public final void method982(int arg0) {
        field2051++;
        int var2 = 32 % ((arg0 + 12) / 61);
        for (int var3 = 0; var3 < this.field2044; var3++) {
            for (int var4 = 0; var4 < this.field2048; var4++) {
                if (var3 == 0 || var4 == 0 || (this.field2044 - 5) <= var3 || (this.field2048 - 5) <= var4) {
                    this.field2047[var3][var4] = -1;
                } else {
                    this.field2047[var3][var4] = 2097152;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "([SB)[S")
    public static final short[] method983(short[] arg0, byte arg1) {
        field2041++;
        if (arg0 == null) {
            return null;
        }
        if (arg1 != 119) {
            field2040 = null;
        }
        short[] var2 = new short[arg0.length];
        class486.method2902(arg0, 0, var2, 0, arg0.length);
        return var2;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIII)V")
    private final void method984(int arg0, int arg1, int arg2, int arg3) {
        this.field2047[arg2][arg3] = class388.method2441(this.field2047[arg2][arg3], ~arg1);
        field2054++;
        int var5 = 108 % ((-arg0 - 17) / 48);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)V")
    public final void method985(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field2050;
        if (arg0 < 89) {
            field2058 = null;
        }
        field2055++;
        int var5 = arg1 - this.field2052;
        this.field2047[var4][var5] = class388.method2441(this.field2047[var4][var5], -262145);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIZ)V")
    public static final void method986(int arg0, int arg1, boolean arg2) {
        field2039++;
        class78 var3 = class192.method1311(arg1, arg2, arg0 - 24324);
        if (arg0 != -5172) {
            method988((byte) 98, null, null, null, null);
        }
        if (var3 != null) {
            for (int var4 = 0; var4 < var3.field1306.length; var4++) {
                var3.field1306[var4] = -1;
                var3.field1302[var4] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(III)V")
    public final void method987(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field2052;
        field2045++;
        int var5 = arg0 - this.field2050;
        this.field2047[var5][var4] = class29.method239(this.field2047[var5][var4], 262144);
        if (arg2 != 28308) {
            this.field2048 = -59;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B[I[I[ILkh;)V")
    public static final void method988(byte arg0, int[] arg1, int[] arg2, int[] arg3, class13 arg4) {
        int var5 = 0;
        int var6 = 51 / ((arg0 - 8) / 62);
        while (arg1.length > var5) {
            int var7 = arg1[var5];
            int var8 = arg3[var5];
            int var9 = arg2[var5];
            int var10 = 0;
            while (var8 != 0 && var10 < arg4.field318.length) {
                if ((var8 & 0x1) != 0) {
                    if (var7 == -1) {
                        arg4.field318[var10] = null;
                    } else {
                        class357 var11 = class311.field4455.method1233(true, var7);
                        int var12 = var11.field5404;
                        class228 var13 = arg4.field318[var10];
                        if (var13 != null) {
                            if (var13.field3341 == var7) {
                                if (var12 == 0) {
                                    var13 = arg4.field318[var10] = null;
                                } else if (var12 == 1) {
                                    var13.field3344 = 0;
                                    var13.field3342 = 0;
                                    var13.field3345 = var9;
                                    var13.field3346 = 1;
                                    var13.field3340 = 0;
                                    class435.method2635(arg4.field5538, 232, arg4.field5539, 0, var11, false, arg4.field5529);
                                } else if (var12 == 2) {
                                    var13.field3344 = 0;
                                }
                            } else if (var11.field5389 >= class311.field4455.method1233(true, var13.field3341).field5389) {
                                var13 = arg4.field318[var10] = null;
                            }
                        }
                        if (var13 == null) {
                            class228 var14 = arg4.field318[var10] = new class228();
                            var14.field3344 = 0;
                            var14.field3340 = 0;
                            var14.field3341 = var7;
                            var14.field3345 = var9;
                            var14.field3346 = 1;
                            var14.field3342 = 0;
                            class435.method2635(arg4.field5538, 232, arg4.field5539, 0, var11, false, arg4.field5529);
                        }
                    }
                }
                var10++;
                var8 >>>= 0x1;
            }
            var5++;
        }
        field2038++;
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(IIII)V")
    private final void method989(int arg0, int arg1, int arg2, int arg3) {
        this.field2047[arg1][arg0] = class29.method239(this.field2047[arg1][arg0], arg2);
        field2043++;
        if (arg3 != -2) {
            this.method971(-124, 102, -53, 58, 107, -29, 114, 100);
        }
    }
}
