import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class311 {

    @OriginalMember(owner = "client!ep", name = "t", descriptor = "I")
    public static int field4830 = 0;

    @OriginalMember(owner = "client!ep", name = "z", descriptor = "F")
    public static float field4836 = 0.0F;

    @OriginalMember(owner = "client!ep", name = "k", descriptor = "[I")
    public static int[] field4821 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!ep", name = "n", descriptor = "Lgn;")
    public static class526 field4824 = new class526(3, 5);

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "I")
    public static int field4811;

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "I")
    public static int field4812;

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "I")
    public int field4813;

    @OriginalMember(owner = "client!ep", name = "d", descriptor = "I")
    public static int field4814;

    @OriginalMember(owner = "client!ep", name = "e", descriptor = "I")
    public static int field4815;

    @OriginalMember(owner = "client!ep", name = "g", descriptor = "I")
    public static int field4817;

    @OriginalMember(owner = "client!ep", name = "h", descriptor = "I")
    public static int field4818;

    @OriginalMember(owner = "client!ep", name = "j", descriptor = "I")
    public int field4820;

    @OriginalMember(owner = "client!ep", name = "l", descriptor = "I")
    public static int field4822;

    @OriginalMember(owner = "client!ep", name = "m", descriptor = "I")
    public static int field4823;

    @OriginalMember(owner = "client!ep", name = "o", descriptor = "I")
    public static int field4825;

    @OriginalMember(owner = "client!ep", name = "p", descriptor = "I")
    public static int field4826;

    @OriginalMember(owner = "client!ep", name = "q", descriptor = "I")
    public int field4827;

    @OriginalMember(owner = "client!ep", name = "r", descriptor = "I")
    public static int field4828;

    @OriginalMember(owner = "client!ep", name = "s", descriptor = "I")
    public static int field4829;

    @OriginalMember(owner = "client!ep", name = "u", descriptor = "I")
    public static int field4831;

    @OriginalMember(owner = "client!ep", name = "v", descriptor = "I")
    public static int field4832;

    @OriginalMember(owner = "client!ep", name = "w", descriptor = "I")
    public int field4833;

    @OriginalMember(owner = "client!ep", name = "x", descriptor = "I")
    public static int field4834;

    @OriginalMember(owner = "client!ep", name = "y", descriptor = "I")
    public static int field4835;

    @OriginalMember(owner = "client!ep", name = "A", descriptor = "I")
    public static int field4837;

    @OriginalMember(owner = "client!ep", name = "B", descriptor = "I")
    public static int field4838;

    @OriginalMember(owner = "client!ep", name = "f", descriptor = "Ll;")
    public static class127 field4816;

    @OriginalMember(owner = "client!ep", name = "C", descriptor = "Lvg;")
    public static class56 field4839;

    @OriginalMember(owner = "client!ep", name = "i", descriptor = "[[I")
    public int[][] field4819;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Z)V", line = 5)
    public static void method1947(boolean arg0) {
        field4816 = null;
        field4824 = null;
        field4821 = null;
        field4839 = null;
        if (!arg0) {
            method1947(false);
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(BIZIIZI)V", line = 28)
    public final void method1948(byte arg0, int arg1, boolean arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field4825++;
        int var8 = arg4 - this.field4813;
        int var9 = arg6 - this.field4820;
        if (arg0 >= -51) {
            return;
        }
        if (arg3 == 0) {
            if (arg1 == 0) {
                this.method1953(-73, var9, 128, var8);
                this.method1953(-110, var9, 8, var8 - 1);
            }
            if (arg1 == 1) {
                this.method1953(-125, var9, 2, var8);
                this.method1953(-100, var9 + 1, 32, var8);
            }
            if (arg1 == 2) {
                this.method1953(-76, var9, 8, var8);
                this.method1953(-79, var9, 128, var8 + 1);
            }
            if (arg1 == 3) {
                this.method1953(-77, var9, 32, var8);
                this.method1953(-105, var9 - 1, 2, var8);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg1 == 0) {
                this.method1953(-106, var9, 1, var8);
                this.method1953(-100, var9 + 1, 16, var8 - 1);
            }
            if (arg1 == 1) {
                this.method1953(-84, var9, 4, var8);
                this.method1953(-83, var9 + 1, 64, var8 + 1);
            }
            if (arg1 == 2) {
                this.method1953(-119, var9, 16, var8);
                this.method1953(-106, var9 - 1, 1, var8 + 1);
            }
            if (arg1 == 3) {
                this.method1953(-75, var9, 64, var8);
                this.method1953(-93, var9 - 1, 4, var8 - 1);
            }
        }
        if (arg3 == 2) {
            if (arg1 == 0) {
                this.method1953(-85, var9, 130, var8);
                this.method1953(-82, var9, 8, var8 - 1);
                this.method1953(-126, var9 + 1, 32, var8);
            }
            if (arg1 == 1) {
                this.method1953(-115, var9, 10, var8);
                this.method1953(-116, var9 + 1, 32, var8);
                this.method1953(-115, var9, 128, var8 + 1);
            }
            if (arg1 == 2) {
                this.method1953(-89, var9, 40, var8);
                this.method1953(-127, var9, 128, var8 + 1);
                this.method1953(-83, var9 - 1, 2, var8);
            }
            if (arg1 == 3) {
                this.method1953(-97, var9, 160, var8);
                this.method1953(-73, var9 - 1, 2, var8);
                this.method1953(-113, var9, 8, var8 - 1);
            }
        }
        if (arg2) {
            if (arg3 == 0) {
                if (arg1 == 0) {
                    this.method1953(-126, var9, 65536, var8);
                    this.method1953(-103, var9, 4096, var8 - 1);
                }
                if (arg1 == 1) {
                    this.method1953(-90, var9, 1024, var8);
                    this.method1953(-116, var9 + 1, 16384, var8);
                }
                if (arg1 == 2) {
                    this.method1953(-74, var9, 4096, var8);
                    this.method1953(-74, var9, 65536, var8 + 1);
                }
                if (arg1 == 3) {
                    this.method1953(-104, var9, 16384, var8);
                    this.method1953(-77, var9 - 1, 1024, var8);
                }
            }
            if (arg3 == 1 || arg3 == 3) {
                if (arg1 == 0) {
                    this.method1953(-125, var9, 512, var8);
                    this.method1953(-110, var9 + 1, 8192, var8 - 1);
                }
                if (arg1 == 1) {
                    this.method1953(-88, var9, 2048, var8);
                    this.method1953(-85, var9 + 1, 32768, var8 + 1);
                }
                if (arg1 == 2) {
                    this.method1953(-105, var9, 8192, var8);
                    this.method1953(-101, var9 - 1, 512, var8 + 1);
                }
                if (arg1 == 3) {
                    this.method1953(-104, var9, 32768, var8);
                    this.method1953(-82, var9 - 1, 2048, var8 - 1);
                }
            }
            if (arg3 == 2) {
                if (arg1 == 0) {
                    this.method1953(-115, var9, 66560, var8);
                    this.method1953(-85, var9, 4096, var8 - 1);
                    this.method1953(-116, var9 + 1, 16384, var8);
                }
                if (arg1 == 1) {
                    this.method1953(-113, var9, 5120, var8);
                    this.method1953(-96, var9 + 1, 16384, var8);
                    this.method1953(-106, var9, 65536, var8 + 1);
                }
                if (arg1 == 2) {
                    this.method1953(-91, var9, 20480, var8);
                    this.method1953(-119, var9, 65536, var8 + 1);
                    this.method1953(-80, var9 - 1, 1024, var8);
                }
                if (arg1 == 3) {
                    this.method1953(-125, var9, 81920, var8);
                    this.method1953(-122, var9 - 1, 1024, var8);
                    this.method1953(-96, var9, 4096, var8 - 1);
                }
            }
        }
        if (!arg5) {
            return;
        }
        if (arg3 == 0) {
            if (arg1 == 0) {
                this.method1953(-94, var9, 536870912, var8);
                this.method1953(-123, var9, 33554432, var8 - 1);
            }
            if (arg1 == 1) {
                this.method1953(-88, var9, 8388608, var8);
                this.method1953(-128, var9 + 1, 134217728, var8);
            }
            if (arg1 == 2) {
                this.method1953(-79, var9, 33554432, var8);
                this.method1953(-74, var9, 536870912, var8 + 1);
            }
            if (arg1 == 3) {
                this.method1953(-74, var9, 134217728, var8);
                this.method1953(-113, var9 - 1, 8388608, var8);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg1 == 0) {
                this.method1953(-105, var9, 4194304, var8);
                this.method1953(-128, var9 + 1, 67108864, var8 - 1);
            }
            if (arg1 == 1) {
                this.method1953(-104, var9, 16777216, var8);
                this.method1953(-109, var9 + 1, 268435456, var8 + 1);
            }
            if (arg1 == 2) {
                this.method1953(-103, var9, 67108864, var8);
                this.method1953(-92, var9 - 1, 4194304, var8 + 1);
            }
            if (arg1 == 3) {
                this.method1953(-121, var9, 268435456, var8);
                this.method1953(-93, var9 - 1, 16777216, var8 - 1);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method1953(-82, var9, 545259520, var8);
            this.method1953(-97, var9, 33554432, var8 - 1);
            this.method1953(-75, var9 + 1, 134217728, var8);
        }
        if (arg1 == 1) {
            this.method1953(-89, var9, 41943040, var8);
            this.method1953(-114, var9 + 1, 134217728, var8);
            this.method1953(-105, var9, 536870912, var8 + 1);
        }
        if (arg1 == 2) {
            this.method1953(-118, var9, 167772160, var8);
            this.method1953(-113, var9, 536870912, var8 + 1);
            this.method1953(-118, var9 - 1, 8388608, var8);
        }
        if (arg1 == 3) {
            this.method1953(-104, var9, 671088640, var8);
            this.method1953(-73, var9 - 1, 8388608, var8);
            this.method1953(-124, var9, 33554432, var8 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(III)V", line = 340)
    public final void method1949(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field4820;
        int var5 = arg1 - this.field4813;
        field4823++;
        this.field4819[var5][var4] = class140.method1023(this.field4819[var5][var4], arg2);
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIBI)V", line = 355)
    private final void method1950(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 == 70) {
            field4829++;
            this.field4819[arg3][arg1] = class390.method2340(this.field4819[arg3][arg1], arg0);
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IZIIIIIII)Z", line = 371)
    public final boolean method1951(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4811++;
        if (arg3 > 1) {
            return class482.method2882(arg2, arg8, arg3, arg0, arg5, -110, arg7, arg3, arg4) ? true : this.method1954(arg3, arg4, (byte) -34, arg0, arg5, arg8, arg3, arg6, arg7, arg2);
        } else if (arg1) {
            int var10 = arg5 + arg8 - 1;
            int var11 = arg4 + arg7 - 1;
            if (arg2 >= arg8 && var10 >= arg2 && arg0 >= arg7 && var11 >= arg0) {
                return true;
            } else if ((arg8 - 1) == arg2 && arg7 <= arg0 && var11 >= arg0 && (this.field4819[arg2 - this.field4813][arg0 - this.field4820] & 0x8) == 0 && (arg6 & 0x8) == 0) {
                return true;
            } else if (var10 + 1 == arg2 && arg7 <= arg0 && var11 >= arg0 && (this.field4819[arg2 - this.field4813][arg0 - this.field4820] & 0x80) == 0 && (arg6 & 0x2) == 0) {
                return true;
            } else if (arg7 - 1 == arg0 && arg8 <= arg2 && var10 >= arg2 && (this.field4819[arg2 - this.field4813][arg0 - this.field4820] & 0x2) == 0 && (arg6 & 0x4) == 0) {
                return true;
            } else {
                return (var11 + 1) == arg0 && arg8 <= arg2 && arg2 <= var10 && (this.field4819[arg2 - this.field4813][arg0 - this.field4820] & 0x20) == 0 && (arg6 & 0x1) == 0;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIIBIIII)Z", line = 415)
    public final boolean method1952(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        field4838++;
        if (arg6 == 1) {
            if (arg0 == arg4 && arg2 == arg5) {
                return true;
            }
        } else if (arg4 <= arg0 && arg0 <= (arg4 + arg6 - 1) && arg2 >= arg2 && arg2 <= (arg2 + arg6 - 1)) {
            return true;
        }
        if (arg3 < 82) {
            return true;
        }
        int var9 = arg0 - this.field4813;
        int var10 = arg2 - this.field4820;
        int var11 = arg4 - this.field4813;
        int var12 = arg5 - this.field4820;
        if (arg6 == 1) {
            if (arg7 == 6 || arg7 == 7) {
                if (arg7 == 7) {
                    arg1 = arg1 + 2 & 0x3;
                }
                if (arg1 == 0) {
                    if ((var9 + 1) == var11 && var10 == var12 && (this.field4819[var11][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 - 1 == var12 && (this.field4819[var11][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if ((var9 - 1) == var11 && var10 == var12 && (this.field4819[var11][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var10 - 1) == var12 && (this.field4819[var11][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if ((var9 - 1) == var11 && var10 == var12 && (this.field4819[var11][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var10 + 1) == var12 && (this.field4819[var11][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var9 + 1 == var11 && var10 == var12 && (this.field4819[var11][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 + 1 == var12 && (this.field4819[var11][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg7 == 8) {
                if (var9 == var11 && var10 + 1 == var12 && (this.field4819[var11][var12] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var11 && (var10 - 1) == var12 && (this.field4819[var11][var12] & 0x2) == 0) {
                    return true;
                }
                if ((var9 - 1) == var11 && var10 == var12 && (this.field4819[var11][var12] & 0x8) == 0) {
                    return true;
                }
                if (var9 + 1 == var11 && var10 == var12 && (this.field4819[var11][var12] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var11 + arg6 - 1;
            int var14 = var12 + arg6 - 1;
            if (arg7 == 6 || arg7 == 7) {
                if (arg7 == 7) {
                    arg1 = arg1 + 2 & 0x3;
                }
                if (arg1 == 0) {
                    if ((var9 + 1) == var11 && var12 <= var10 && var14 >= var10 && (this.field4819[var11][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var9 <= var13 && var10 - arg6 == var12 && (this.field4819[var9][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if ((var9 - arg6) == var11 && var12 <= var10 && var10 <= var14 && (this.field4819[var13][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var13 >= var9 && (var10 - arg6) == var12 && (this.field4819[var9][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if ((var9 - arg6) == var11 && var10 >= var12 && var10 <= var14 && (this.field4819[var13][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var9 <= var13 && var10 + 1 == var12 && (this.field4819[var9][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var9 + 1 == var11 && var10 >= var12 && var10 <= var14 && (this.field4819[var11][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var13 && (var10 + 1) == var12 && (this.field4819[var9][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg7 == 8) {
                if (var11 <= var9 && var13 >= var9 && (var10 + 1) == var12 && (this.field4819[var9][var12] & 0x20) == 0) {
                    return true;
                }
                if (var11 <= var9 && var13 >= var9 && (var10 - arg6) == var12 && (this.field4819[var9][var14] & 0x2) == 0) {
                    return true;
                }
                if (var9 - arg6 == var11 && var10 >= var12 && var14 >= var10 && (this.field4819[var13][var10] & 0x8) == 0) {
                    return true;
                }
                if (var9 + 1 == var11 && var10 >= var12 && var10 <= var14 && (this.field4819[var11][var10] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIII)V", line = 604)
    private final void method1953(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 >= -72) {
            this.field4819 = null;
        }
        field4817++;
        this.field4819[arg3][arg1] = class140.method1023(this.field4819[arg3][arg1], ~arg2);
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIBIIIIIII)Z", line = 617)
    public final boolean method1954(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field4835++;
        int var11 = arg0 + arg9;
        int var12 = arg3 + arg6;
        if (arg2 >= -6) {
            this.method1949(5, 121, -102);
        }
        int var13 = arg4 + arg5;
        int var14 = arg1 + arg8;
        if (arg9 == var13 && (arg7 & 0x2) == 0) {
            int var15 = arg3 > arg8 ? arg3 : arg8;
            int var16 = var14 > var12 ? var12 : var14;
            while (var16 > var15) {
                if ((this.field4819[var13 - this.field4813 - 1][var15 - this.field4820] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg5 == var11 && (arg7 & 0x8) == 0) {
            int var17 = arg8 < arg3 ? arg3 : arg8;
            int var18 = var14 <= var12 ? var14 : var12;
            while (var17 < var18) {
                if ((this.field4819[arg5 - this.field4813][var17 - this.field4820] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg3 == var14 && (arg7 & 0x1) == 0) {
            int var19 = arg9 > arg5 ? arg9 : arg5;
            int var20 = var13 <= var11 ? var13 : var11;
            while (var20 > var19) {
                if ((this.field4819[var19 - this.field4813][var14 - this.field4820 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg8 == var12 && (arg7 & 0x4) == 0) {
            int var21 = arg5 < arg9 ? arg9 : arg5;
            int var22 = var13 <= var11 ? var13 : var11;
            while (var21 < var22) {
                if ((this.field4819[var21 - this.field4813][arg8 - this.field4820] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIIIIIII)Z", line = 709)
    public final boolean method1955(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4832++;
        if (arg3 == 1) {
            if (arg2 == arg6 && arg0 == arg7) {
                return true;
            }
        } else if (arg6 <= arg2 && arg6 - (1 - arg3) >= arg2 && arg7 <= arg7 && arg7 <= (arg7 + arg3 - 1)) {
            return true;
        }
        int var9 = arg6 - this.field4813;
        if (arg4 != -3) {
            field4834 = 98;
        }
        int var10 = arg7 - this.field4820;
        int var11 = arg0 - this.field4820;
        int var12 = arg2 - this.field4813;
        if (arg3 == 1) {
            if (arg1 == 0) {
                if (arg5 == 0) {
                    if ((var12 - 1) == var9 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && var10 + 1 == var11 && (this.field4819[var9][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var10 - 1) == var11 && (this.field4819[var9][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var9 == var12 && (var10 + 1) == var11) {
                        return true;
                    }
                    if ((var12 - 1) == var9 && var10 == var11 && (this.field4819[var9][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var9 && var10 == var11 && (this.field4819[var9][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if (var12 + 1 == var9 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && (var10 + 1) == var11 && (this.field4819[var9][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var10 - 1 == var11 && (this.field4819[var9][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var9 == var12 && var10 - 1 == var11) {
                        return true;
                    }
                    if ((var12 - 1) == var9 && var10 == var11 && (this.field4819[var9][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var9 && var10 == var11 && (this.field4819[var9][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg1 == 2) {
                if (arg5 == 0) {
                    if (var12 - 1 == var9 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && (var10 + 1) == var11) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var10 == var11 && (this.field4819[var9][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var10 - 1 == var11 && (this.field4819[var9][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if ((var12 - 1) == var9 && var10 == var11 && (this.field4819[var9][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var10 + 1) == var11) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && var10 - 1 == var11 && (this.field4819[var9][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if ((var12 - 1) == var9 && var10 == var11 && (this.field4819[var9][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var10 + 1 == var11 && (this.field4819[var9][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && (var10 - 1) == var11) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if ((var12 - 1) == var9 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && var10 + 1 == var11 && (this.field4819[var9][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var10 == var11 && (this.field4819[var9][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var10 - 1) == var11) {
                        return true;
                    }
                }
            }
            if (arg1 == 9) {
                if (var9 == var12 && (var10 + 1) == var11 && (this.field4819[var9][var11] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var12 && var10 - 1 == var11 && (this.field4819[var9][var11] & 0x2) == 0) {
                    return true;
                }
                if (var12 - 1 == var9 && var10 == var11 && (this.field4819[var9][var11] & 0x8) == 0) {
                    return true;
                }
                if (var12 + 1 == var9 && var10 == var11 && (this.field4819[var9][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg3 + var9 - 1;
            int var14 = var11 + arg3 - 1;
            if (arg1 == 0) {
                if (arg5 == 0) {
                    if (var12 - arg3 == var9 && var10 >= var11 && var14 >= var10) {
                        return true;
                    }
                    if (var12 >= var9 && var13 >= var12 && (var10 + 1) == var11 && (this.field4819[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 >= var9 && var13 >= var12 && var10 - arg3 == var11 && (this.field4819[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var9 <= var12 && var13 >= var12 && var10 + 1 == var11) {
                        return true;
                    }
                    if ((var12 - arg3) == var9 && var11 <= var10 && var14 >= var10 && (this.field4819[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var9 && var11 <= var10 && var10 <= var14 && (this.field4819[var9][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if (var12 + 1 == var9 && var11 <= var10 && var14 >= var10) {
                        return true;
                    }
                    if (var9 <= var12 && var12 <= var13 && (var10 + 1) == var11 && (this.field4819[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 >= var9 && var12 <= var13 && var10 - arg3 == var11 && (this.field4819[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var9 <= var12 && var12 <= var13 && (var10 - arg3) == var11) {
                        return true;
                    }
                    if (var12 - arg3 == var9 && var10 >= var11 && var10 <= var14 && (this.field4819[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var10 >= var11 && var10 <= var14 && (this.field4819[var9][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg1 == 2) {
                if (arg5 == 0) {
                    if ((var12 - arg3) == var9 && var11 <= var10 && var10 <= var14) {
                        return true;
                    }
                    if (var12 >= var9 && var13 >= var12 && var10 + 1 == var11) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var11 <= var10 && var10 <= var14 && (this.field4819[var9][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 <= var12 && var13 >= var12 && (var10 - arg3) == var11 && (this.field4819[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if ((var12 - arg3) == var9 && var10 >= var11 && var10 <= var14 && (this.field4819[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 >= var9 && var12 <= var13 && (var10 + 1) == var11) {
                        return true;
                    }
                    if ((var12 + 1) == var9 && var10 >= var11 && var10 <= var14) {
                        return true;
                    }
                    if (var12 >= var9 && var13 >= var12 && (var10 - arg3) == var11 && (this.field4819[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if (var12 - arg3 == var9 && var11 <= var10 && var10 <= var14 && (this.field4819[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 >= var9 && var12 <= var13 && var10 + 1 == var11 && (this.field4819[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var10 >= var11 && var14 >= var10) {
                        return true;
                    }
                    if (var12 >= var9 && var13 >= var12 && (var10 - arg3) == var11) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if ((var12 - arg3) == var9 && var11 <= var10 && var10 <= var14) {
                        return true;
                    }
                    if (var12 >= var9 && var13 >= var12 && (var10 + 1) == var11 && (this.field4819[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var10 >= var11 && var10 <= var14 && (this.field4819[var9][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 <= var12 && var12 <= var13 && var10 - arg3 == var11) {
                        return true;
                    }
                }
            }
            if (arg1 == 9) {
                if (var12 >= var9 && var12 <= var13 && (var10 + 1) == var11 && (this.field4819[var12][var11] & 0x2C0120) == 0) {
                    return true;
                }
                if (var9 <= var12 && var13 >= var12 && var10 - arg3 == var11 && (this.field4819[var12][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if (var12 - arg3 == var9 && var10 >= var11 && var14 >= var10 && (this.field4819[var13][var10] & 0x2C0108) == 0) {
                    return true;
                }
                if (var12 + 1 == var9 && var11 <= var10 && var10 <= var14 && (this.field4819[var9][var10] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(ZIIIIIZ)V", line = 1087)
    public final void method1956(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field4815++;
        int var8 = arg1 - this.field4813;
        int var9 = arg5 - this.field4820;
        if (arg4 == 0) {
            if (arg2 == 0) {
                this.method1950(128, var9, (byte) 70, var8);
                this.method1950(8, var9, (byte) 70, var8 - 1);
            }
            if (arg2 == 1) {
                this.method1950(2, var9, (byte) 70, var8);
                this.method1950(32, var9 + 1, (byte) 70, var8);
            }
            if (arg2 == 2) {
                this.method1950(8, var9, (byte) 70, var8);
                this.method1950(128, var9, (byte) 70, var8 + 1);
            }
            if (arg2 == 3) {
                this.method1950(32, var9, (byte) 70, var8);
                this.method1950(2, var9 - 1, (byte) 70, var8);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg2 == 0) {
                this.method1950(1, var9, (byte) 70, var8);
                this.method1950(16, var9 + 1, (byte) 70, var8 - 1);
            }
            if (arg2 == 1) {
                this.method1950(4, var9, (byte) 70, var8);
                this.method1950(64, var9 + 1, (byte) 70, var8 + 1);
            }
            if (arg2 == 2) {
                this.method1950(16, var9, (byte) 70, var8);
                this.method1950(1, var9 - 1, (byte) 70, var8 + 1);
            }
            if (arg2 == 3) {
                this.method1950(64, var9, (byte) 70, var8);
                this.method1950(4, var9 - 1, (byte) 70, var8 - 1);
            }
        }
        if (arg3 != 3) {
            return;
        }
        if (arg4 == 2) {
            if (arg2 == 0) {
                this.method1950(130, var9, (byte) 70, var8);
                this.method1950(8, var9, (byte) 70, var8 - 1);
                this.method1950(32, var9 + 1, (byte) 70, var8);
            }
            if (arg2 == 1) {
                this.method1950(10, var9, (byte) 70, var8);
                this.method1950(32, var9 + 1, (byte) 70, var8);
                this.method1950(128, var9, (byte) 70, var8 + 1);
            }
            if (arg2 == 2) {
                this.method1950(40, var9, (byte) 70, var8);
                this.method1950(128, var9, (byte) 70, var8 + 1);
                this.method1950(2, var9 - 1, (byte) 70, var8);
            }
            if (arg2 == 3) {
                this.method1950(160, var9, (byte) 70, var8);
                this.method1950(2, var9 - 1, (byte) 70, var8);
                this.method1950(8, var9, (byte) 70, var8 - 1);
            }
        }
        if (arg0) {
            if (arg4 == 0) {
                if (arg2 == 0) {
                    this.method1950(65536, var9, (byte) 70, var8);
                    this.method1950(4096, var9, (byte) 70, var8 - 1);
                }
                if (arg2 == 1) {
                    this.method1950(1024, var9, (byte) 70, var8);
                    this.method1950(16384, var9 + 1, (byte) 70, var8);
                }
                if (arg2 == 2) {
                    this.method1950(4096, var9, (byte) 70, var8);
                    this.method1950(65536, var9, (byte) 70, var8 + 1);
                }
                if (arg2 == 3) {
                    this.method1950(16384, var9, (byte) 70, var8);
                    this.method1950(1024, var9 - 1, (byte) 70, var8);
                }
            }
            if (arg4 == 1 || arg4 == 3) {
                if (arg2 == 0) {
                    this.method1950(512, var9, (byte) 70, var8);
                    this.method1950(8192, var9 + 1, (byte) 70, var8 - 1);
                }
                if (arg2 == 1) {
                    this.method1950(2048, var9, (byte) 70, var8);
                    this.method1950(32768, var9 + 1, (byte) 70, var8 + 1);
                }
                if (arg2 == 2) {
                    this.method1950(8192, var9, (byte) 70, var8);
                    this.method1950(512, var9 - 1, (byte) 70, var8 + 1);
                }
                if (arg2 == 3) {
                    this.method1950(32768, var9, (byte) 70, var8);
                    this.method1950(2048, var9 - 1, (byte) 70, var8 - 1);
                }
            }
            if (arg4 == 2) {
                if (arg2 == 0) {
                    this.method1950(66560, var9, (byte) 70, var8);
                    this.method1950(4096, var9, (byte) 70, var8 - 1);
                    this.method1950(16384, var9 + 1, (byte) 70, var8);
                }
                if (arg2 == 1) {
                    this.method1950(5120, var9, (byte) 70, var8);
                    this.method1950(16384, var9 + 1, (byte) 70, var8);
                    this.method1950(65536, var9, (byte) 70, var8 + 1);
                }
                if (arg2 == 2) {
                    this.method1950(20480, var9, (byte) 70, var8);
                    this.method1950(65536, var9, (byte) 70, var8 + 1);
                    this.method1950(1024, var9 - 1, (byte) 70, var8);
                }
                if (arg2 == 3) {
                    this.method1950(81920, var9, (byte) 70, var8);
                    this.method1950(1024, var9 - 1, (byte) 70, var8);
                    this.method1950(4096, var9, (byte) 70, var8 - 1);
                }
            }
        }
        if (!arg6) {
            return;
        }
        if (arg4 == 0) {
            if (arg2 == 0) {
                this.method1950(536870912, var9, (byte) 70, var8);
                this.method1950(33554432, var9, (byte) 70, var8 - 1);
            }
            if (arg2 == 1) {
                this.method1950(8388608, var9, (byte) 70, var8);
                this.method1950(134217728, var9 + 1, (byte) 70, var8);
            }
            if (arg2 == 2) {
                this.method1950(33554432, var9, (byte) 70, var8);
                this.method1950(536870912, var9, (byte) 70, var8 + 1);
            }
            if (arg2 == 3) {
                this.method1950(134217728, var9, (byte) 70, var8);
                this.method1950(8388608, var9 - 1, (byte) 70, var8);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg2 == 0) {
                this.method1950(4194304, var9, (byte) 70, var8);
                this.method1950(67108864, var9 + 1, (byte) 70, var8 - 1);
            }
            if (arg2 == 1) {
                this.method1950(16777216, var9, (byte) 70, var8);
                this.method1950(268435456, var9 + 1, (byte) 70, var8 + 1);
            }
            if (arg2 == 2) {
                this.method1950(67108864, var9, (byte) 70, var8);
                this.method1950(4194304, var9 - 1, (byte) 70, var8 + 1);
            }
            if (arg2 == 3) {
                this.method1950(268435456, var9, (byte) 70, var8);
                this.method1950(16777216, var9 - 1, (byte) 70, var8 - 1);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method1950(545259520, var9, (byte) 70, var8);
            this.method1950(33554432, var9, (byte) 70, var8 - 1);
            this.method1950(134217728, var9 + 1, (byte) 70, var8);
        }
        if (arg2 == 1) {
            this.method1950(41943040, var9, (byte) 70, var8);
            this.method1950(134217728, var9 + 1, (byte) 70, var8);
            this.method1950(536870912, var9, (byte) 70, var8 + 1);
        }
        if (arg2 == 2) {
            this.method1950(167772160, var9, (byte) 70, var8);
            this.method1950(536870912, var9, (byte) 70, var8 + 1);
            this.method1950(8388608, var9 - 1, (byte) 70, var8);
        }
        if (arg2 == 3) {
            this.method1950(671088640, var9, (byte) 70, var8);
            this.method1950(8388608, var9 - 1, (byte) 70, var8);
            this.method1950(33554432, var9, (byte) 70, var8 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(ZII)V", line = 1402)
    public final void method1957(boolean arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field4813;
        if (!arg0) {
            this.field4827 = 102;
        }
        int var5 = arg2 - this.field4820;
        field4814++;
        this.field4819[var4][var5] = class390.method2340(this.field4819[var4][var5], 2097152);
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(III)V", line = 1422)
    public final void method1958(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field4820;
        int var5 = arg1 - this.field4813;
        if (arg2 <= 90) {
            this.method1959(19);
        }
        field4828++;
        this.field4819[var5][var4] = class140.method1023(this.field4819[var5][var4], -262145);
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)V", line = 1437)
    public final void method1959(int arg0) {
        for (int var2 = 0; var2 < this.field4827; var2++) {
            for (int var3 = 0; var3 < this.field4833; var3++) {
                if (var2 == 0 || var3 == 0 || (this.field4827 - 5) <= var2 || var3 >= this.field4833 - 5) {
                    this.field4819[var2][var3] = -1;
                } else {
                    this.field4819[var2][var3] = 2097152;
                }
            }
        }
        if (arg0 == 13734) {
            field4831++;
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IZIZBII)V", line = 1475)
    public final void method1960(int arg0, boolean arg1, int arg2, boolean arg3, byte arg4, int arg5, int arg6) {
        field4826++;
        int var8 = 256;
        if (arg1) {
            var8 |= 0x20000;
        }
        if (arg3) {
            var8 |= 0x40000000;
        }
        int var9 = arg5 - this.field4820;
        int var10 = arg0 - this.field4813;
        int var11 = var10;
        int var12 = -80 / ((14 - arg4) / 41);
        while ((var10 + arg2) > var11) {
            if (var11 >= 0 && var11 < this.field4827) {
                for (int var13 = var9; var13 < (var9 + arg6); var13++) {
                    if (var13 >= 0 && this.field4833 > var13) {
                        this.method1950(var8, var13, (byte) 70, var11);
                    }
                }
            }
            var11++;
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIIIZIZI)V", line = 1524)
    public final void method1961(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, boolean arg6, int arg7) {
        field4837++;
        int var9 = arg2;
        if (arg4) {
            var9 = arg2 | 0x20000;
        }
        int var10 = arg7 - this.field4813;
        int var11 = arg5 - this.field4820;
        if (arg3 == 1 || arg3 == 3) {
            int var12 = arg1;
            arg1 = arg0;
            arg0 = var12;
        }
        if (arg6) {
            var9 |= 0x40000000;
        }
        for (int var13 = var10; var13 < var10 + arg1; var13++) {
            if (var13 >= 0 && var13 < this.field4827) {
                for (int var14 = var11; var14 < (arg0 + var11); var14++) {
                    if (var14 >= 0 && var14 < this.field4833) {
                        this.method1953(arg2 - 377, var14, var9, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "(III)V", line = 1574)
    public final void method1962(int arg0, int arg1, int arg2) {
        field4812++;
        int var4 = arg0 - this.field4813;
        int var5 = arg1 - this.field4820;
        int var6 = -98 % ((arg2 - 68) / 57);
        this.field4819[var4][var5] = class390.method2340(this.field4819[var4][var5], 262144);
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(BII)V", line = 1586)
    public static final void method1963(byte arg0, int arg1, int arg2) {
        field4818++;
        if (class251.field3433 == class214.field3057) {
            if (class27.method262(0, (byte) -120, false, arg1, 0, 1, -2, arg2, 1)) {
                return;
            }
            class27.method262(0, (byte) -118, false, arg1, 0, 1, -3, arg2, 1);
        } else if (class27.method262(0, (byte) -128, false, arg1, 0, 1, -3, arg2, 1)) {
            return;
        } else {
            class27.method262(0, (byte) -122, false, arg1, 0, 1, -2, arg2, 1);
        }
        if (arg0 != -34) {
            field4821 = null;
        }
    }
}
