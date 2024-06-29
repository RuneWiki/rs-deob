import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class355 {

    @OriginalMember(owner = "client!jo", name = "e", descriptor = "[I")
    public static int[] field4833 = new int[1000];

    @OriginalMember(owner = "client!jo", name = "q", descriptor = "Z")
    public static boolean field4845 = false;

    @OriginalMember(owner = "client!jo", name = "r", descriptor = "[I")
    public static int[] field4846 = new int[16];

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "I")
    public int field4829;

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "I")
    public static int field4831;

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "I")
    public static int field4832;

    @OriginalMember(owner = "client!jo", name = "f", descriptor = "I")
    public static int field4834;

    @OriginalMember(owner = "client!jo", name = "g", descriptor = "I")
    public static int field4835;

    @OriginalMember(owner = "client!jo", name = "h", descriptor = "I")
    public static int field4836;

    @OriginalMember(owner = "client!jo", name = "i", descriptor = "I")
    public static int field4837;

    @OriginalMember(owner = "client!jo", name = "j", descriptor = "I")
    public static int field4838;

    @OriginalMember(owner = "client!jo", name = "k", descriptor = "I")
    public int field4839;

    @OriginalMember(owner = "client!jo", name = "l", descriptor = "I")
    public static int field4840;

    @OriginalMember(owner = "client!jo", name = "m", descriptor = "I")
    public int field4841;

    @OriginalMember(owner = "client!jo", name = "n", descriptor = "I")
    public static int field4842;

    @OriginalMember(owner = "client!jo", name = "o", descriptor = "I")
    public int field4843;

    @OriginalMember(owner = "client!jo", name = "p", descriptor = "I")
    public static int field4844;

    @OriginalMember(owner = "client!jo", name = "s", descriptor = "I")
    public static int field4847;

    @OriginalMember(owner = "client!jo", name = "t", descriptor = "I")
    public static int field4848;

    @OriginalMember(owner = "client!jo", name = "u", descriptor = "I")
    public static int field4849;

    @OriginalMember(owner = "client!jo", name = "v", descriptor = "I")
    public static int field4850;

    @OriginalMember(owner = "client!jo", name = "w", descriptor = "I")
    public static int field4851;

    @OriginalMember(owner = "client!jo", name = "x", descriptor = "I")
    public static int field4852;

    @OriginalMember(owner = "client!jo", name = "y", descriptor = "I")
    public static int field4853;

    @OriginalMember(owner = "client!jo", name = "z", descriptor = "I")
    public static int field4854;

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "[[I")
    public int[][] field4830;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(III)V", line = 5)
    public final void method2177(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field4843;
        if (arg2 < 48) {
            field4845 = false;
        }
        field4848++;
        int var5 = arg0 - this.field4841;
        this.field4830[var4][var5] = class204.method1456(this.field4830[var4][var5], -2097153);
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIZI)V", line = 19)
    private final void method2178(int arg0, int arg1, boolean arg2, int arg3) {
        if (!arg2) {
            this.method2190(-79, 16, -72, 60, 110, 40, 111, true, -103);
        }
        field4853++;
        this.field4830[arg0][arg1] = class530.method3011(this.field4830[arg0][arg1], arg3);
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(ZIII)V", line = 30)
    private final void method2179(boolean arg0, int arg1, int arg2, int arg3) {
        this.field4830[arg3][arg1] = class204.method1456(this.field4830[arg3][arg1], ~arg2);
        if (arg0) {
            this.method2177(31, -38, -123);
        }
        field4832++;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(ZIIIIIZ)V", line = 41)
    public final void method2180(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field4837++;
        if (arg4 != -3924) {
            this.method2193(57, 21, 97, 63, 48, -110, 0, 64);
        }
        int var8 = 256;
        if (arg6) {
            var8 |= 0x20000;
        }
        int var9 = arg2 - this.field4841;
        if (arg0) {
            var8 |= 0x40000000;
        }
        int var10 = arg5 - this.field4843;
        for (int var11 = var10; var11 < arg1 + var10; var11++) {
            if (var11 >= 0 && var11 < this.field4839) {
                for (int var12 = var9; var12 < (var9 + arg3); var12++) {
                    if (var12 >= 0 && this.field4829 > var12) {
                        this.method2178(var11, var12, true, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lcn;ZZ)V", line = 89)
    public static final void method2181(class543 arg0, boolean arg1, boolean arg2) {
        arg0.field7397 = arg2;
        if (!class120.field2186) {
            class8.method56(arg0, class718.field9874);
        } else if (arg1) {
            class102.field1651[class102.field1651.length - 1].method3660(115, arg0);
        } else {
            int var3 = class262.method1715(arg0.field7392);
            int var4 = class559.field7939[2] * arg0.method900(0) / arg0.field7393;
            int var5 = class262.method1715(arg0.field7392 - var4);
            int var6 = class262.method1715(arg0.field7392 + var4);
            if (var5 == var6) {
                class102.field1651[var3].method3660(111, arg0);
            } else if (var6 - var5 == 1) {
                class102.field1651[class360.field4913 + var5].method3660(95, arg0);
            } else {
                class102.field1651[class102.field1651.length - 1].method3660(108, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(ZIZIIIII)V", line = 126)
    public final void method2182(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4840++;
        int var9 = 256;
        if (arg5 <= 123) {
            return;
        }
        if (arg0) {
            var9 |= 0x20000;
        }
        int var10 = arg1 - this.field4843;
        if (arg4 == 1 || arg4 == 3) {
            int var11 = arg7;
            arg7 = arg6;
            arg6 = var11;
        }
        int var12 = arg3 - this.field4841;
        if (arg2) {
            var9 |= 0x40000000;
        }
        for (int var13 = var10; var13 < var10 + arg7; var13++) {
            if (var13 >= 0 && var13 < this.field4839) {
                for (int var14 = var12; var14 < arg6 + var12; var14++) {
                    if (var14 >= 0 && var14 < this.field4829) {
                        this.method2179(false, var14, var9, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(III)V", line = 182)
    public final void method2183(int arg0, int arg1, int arg2) {
        if (arg0 <= 11) {
            this.field4830 = null;
        }
        int var4 = arg2 - this.field4843;
        field4847++;
        int var5 = arg1 - this.field4841;
        this.field4830[var4][var5] = class530.method3011(this.field4830[var4][var5], 2097152);
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(ZII)V", line = 196)
    public final void method2184(boolean arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field4843;
        field4854++;
        int var5 = arg2 - this.field4841;
        if (arg0) {
            this.field4830 = null;
        }
        this.field4830[var4][var5] = class530.method3011(this.field4830[var4][var5], 262144);
    }

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "(III)V", line = 210)
    public final void method2185(int arg0, int arg1, int arg2) {
        field4831++;
        int var4 = arg0 - this.field4841;
        int var5 = arg2 - this.field4843;
        this.field4830[var5][var4] = class204.method1456(this.field4830[var5][var4], arg1);
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIIIIIII)Z", line = 239)
    public final boolean method2186(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4838++;
        if (arg2 != 5282) {
            this.field4830 = null;
        }
        if (arg1 == 1) {
            if (arg5 == arg7 && arg3 == arg4) {
                return true;
            }
        } else if (arg5 >= arg7 && arg1 + arg7 - 1 >= arg5 && arg4 <= arg4 && arg4 <= (arg1 + arg4 - 1)) {
            return true;
        }
        int var9 = arg5 - this.field4843;
        int var10 = arg4 - this.field4841;
        int var11 = arg3 - this.field4841;
        int var12 = arg7 - this.field4843;
        if (arg1 == 1) {
            if (arg0 == 0) {
                if (arg6 == 0) {
                    if (var9 - 1 == var12 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && (var10 + 1) == var11 && (this.field4830[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var10 - 1 == var11 && (this.field4830[var12][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var9 == var12 && var10 + 1 == var11) {
                        return true;
                    }
                    if (var9 - 1 == var12 && var10 == var11 && (this.field4830[var12][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var12 && var10 == var11 && (this.field4830[var12][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if ((var9 + 1) == var12 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && var10 + 1 == var11 && (this.field4830[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var10 - 1 == var11 && (this.field4830[var12][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var9 == var12 && var10 - 1 == var11) {
                        return true;
                    }
                    if ((var9 - 1) == var12 && var10 == var11 && (this.field4830[var12][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var12 && var10 == var11 && (this.field4830[var12][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 2) {
                if (arg6 == 0) {
                    if (var9 - 1 == var12 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && var10 + 1 == var11) {
                        return true;
                    }
                    if ((var9 + 1) == var12 && var10 == var11 && (this.field4830[var12][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var10 - 1 == var11 && (this.field4830[var12][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if ((var9 - 1) == var12 && var10 == var11 && (this.field4830[var12][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var10 + 1 == var11) {
                        return true;
                    }
                    if (var9 + 1 == var12 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && var10 - 1 == var11 && (this.field4830[var12][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if ((var9 - 1) == var12 && var10 == var11 && (this.field4830[var12][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var10 + 1 == var11 && (this.field4830[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var12 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && (var10 - 1) == var11) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if ((var9 - 1) == var12 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && var10 + 1 == var11 && (this.field4830[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var12 && var10 == var11 && (this.field4830[var12][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var10 - 1 == var11) {
                        return true;
                    }
                }
            }
            if (arg0 == 9) {
                if (var9 == var12 && var10 + 1 == var11 && (this.field4830[var12][var11] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var12 && (var10 - 1) == var11 && (this.field4830[var12][var11] & 0x2) == 0) {
                    return true;
                }
                if (var9 - 1 == var12 && var10 == var11 && (this.field4830[var12][var11] & 0x8) == 0) {
                    return true;
                }
                if (var9 + 1 == var12 && var10 == var11 && (this.field4830[var12][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg1 + var12 - 1;
            int var14 = var11 + arg1 - 1;
            if (arg0 == 0) {
                if (arg6 == 0) {
                    if (var9 - arg1 == var12 && var11 <= var10 && var10 <= var14) {
                        return true;
                    }
                    if (var9 >= var12 && var13 >= var9 && (var10 + 1) == var11 && (this.field4830[var9][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 >= var12 && var13 >= var9 && (var10 - arg1) == var11 && (this.field4830[var9][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var12 <= var9 && var13 >= var9 && var10 + 1 == var11) {
                        return true;
                    }
                    if (var9 - arg1 == var12 && var10 >= var11 && var14 >= var10 && (this.field4830[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var12 && var10 >= var11 && var14 >= var10 && (this.field4830[var12][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if ((var9 + 1) == var12 && var10 >= var11 && var14 >= var10) {
                        return true;
                    }
                    if (var12 <= var9 && var9 <= var13 && (var10 + 1) == var11 && (this.field4830[var9][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 >= var12 && var9 <= var13 && var10 - arg1 == var11 && (this.field4830[var9][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var9 >= var12 && var13 >= var9 && var10 - arg1 == var11) {
                        return true;
                    }
                    if (var9 - arg1 == var12 && var10 >= var11 && var10 <= var14 && (this.field4830[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var12 && var10 >= var11 && var14 >= var10 && (this.field4830[var12][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 2) {
                if (arg6 == 0) {
                    if (var9 - arg1 == var12 && var11 <= var10 && var14 >= var10) {
                        return true;
                    }
                    if (var9 >= var12 && var9 <= var13 && var10 + 1 == var11) {
                        return true;
                    }
                    if ((var9 + 1) == var12 && var11 <= var10 && var14 >= var10 && (this.field4830[var12][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 >= var12 && var13 >= var9 && (var10 - arg1) == var11 && (this.field4830[var9][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if ((var9 - arg1) == var12 && var10 >= var11 && var14 >= var10 && (this.field4830[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 >= var12 && var9 <= var13 && (var10 + 1) == var11) {
                        return true;
                    }
                    if ((var9 + 1) == var12 && var10 >= var11 && var10 <= var14) {
                        return true;
                    }
                    if (var12 <= var9 && var9 <= var13 && (var10 - arg1) == var11 && (this.field4830[var9][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if ((var9 - arg1) == var12 && var10 >= var11 && var14 >= var10 && (this.field4830[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 >= var12 && var9 <= var13 && (var10 + 1) == var11 && (this.field4830[var9][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var12 && var10 >= var11 && var14 >= var10) {
                        return true;
                    }
                    if (var12 <= var9 && var9 <= var13 && var10 - arg1 == var11) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var9 - arg1 == var12 && var11 <= var10 && var14 >= var10) {
                        return true;
                    }
                    if (var12 <= var9 && var13 >= var9 && (var10 + 1) == var11 && (this.field4830[var9][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var12 && var11 <= var10 && var14 >= var10 && (this.field4830[var12][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var12 <= var9 && var13 >= var9 && (var10 - arg1) == var11) {
                        return true;
                    }
                }
            }
            if (arg0 == 9) {
                if (var12 <= var9 && var9 <= var13 && var10 + 1 == var11 && (this.field4830[var9][var11] & 0x2C0120) == 0) {
                    return true;
                }
                if (var9 >= var12 && var9 <= var13 && (var10 - arg1) == var11 && (this.field4830[var9][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if (var9 - arg1 == var12 && var10 >= var11 && var10 <= var14 && (this.field4830[var13][var10] & 0x2C0108) == 0) {
                    return true;
                }
                if ((var9 + 1) == var12 && var10 >= var11 && var10 <= var14 && (this.field4830[var12][var10] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIIIZZI)V", line = 610)
    public final void method2187(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5, int arg6) {
        int var8 = 82 / ((45 - arg6) / 43);
        int var9 = arg3 - this.field4841;
        int var10 = arg2 - this.field4843;
        field4836++;
        if (arg1 == 0) {
            if (arg0 == 0) {
                this.method2179(false, var9, 128, var10);
                this.method2179(false, var9, 8, var10 - 1);
            }
            if (arg0 == 1) {
                this.method2179(false, var9, 2, var10);
                this.method2179(false, var9 + 1, 32, var10);
            }
            if (arg0 == 2) {
                this.method2179(false, var9, 8, var10);
                this.method2179(false, var9, 128, var10 + 1);
            }
            if (arg0 == 3) {
                this.method2179(false, var9, 32, var10);
                this.method2179(false, var9 - 1, 2, var10);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg0 == 0) {
                this.method2179(false, var9, 1, var10);
                this.method2179(false, var9 + 1, 16, var10 - 1);
            }
            if (arg0 == 1) {
                this.method2179(false, var9, 4, var10);
                this.method2179(false, var9 + 1, 64, var10 + 1);
            }
            if (arg0 == 2) {
                this.method2179(false, var9, 16, var10);
                this.method2179(false, var9 - 1, 1, var10 + 1);
            }
            if (arg0 == 3) {
                this.method2179(false, var9, 64, var10);
                this.method2179(false, var9 - 1, 4, var10 - 1);
            }
        }
        if (arg1 == 2) {
            if (arg0 == 0) {
                this.method2179(false, var9, 130, var10);
                this.method2179(false, var9, 8, var10 - 1);
                this.method2179(false, var9 + 1, 32, var10);
            }
            if (arg0 == 1) {
                this.method2179(false, var9, 10, var10);
                this.method2179(false, var9 + 1, 32, var10);
                this.method2179(false, var9, 128, var10 + 1);
            }
            if (arg0 == 2) {
                this.method2179(false, var9, 40, var10);
                this.method2179(false, var9, 128, var10 + 1);
                this.method2179(false, var9 - 1, 2, var10);
            }
            if (arg0 == 3) {
                this.method2179(false, var9, 160, var10);
                this.method2179(false, var9 - 1, 2, var10);
                this.method2179(false, var9, 8, var10 - 1);
            }
        }
        if (arg5) {
            if (arg1 == 0) {
                if (arg0 == 0) {
                    this.method2179(false, var9, 65536, var10);
                    this.method2179(false, var9, 4096, var10 - 1);
                }
                if (arg0 == 1) {
                    this.method2179(false, var9, 1024, var10);
                    this.method2179(false, var9 + 1, 16384, var10);
                }
                if (arg0 == 2) {
                    this.method2179(false, var9, 4096, var10);
                    this.method2179(false, var9, 65536, var10 + 1);
                }
                if (arg0 == 3) {
                    this.method2179(false, var9, 16384, var10);
                    this.method2179(false, var9 - 1, 1024, var10);
                }
            }
            if (arg1 == 1 || arg1 == 3) {
                if (arg0 == 0) {
                    this.method2179(false, var9, 512, var10);
                    this.method2179(false, var9 + 1, 8192, var10 - 1);
                }
                if (arg0 == 1) {
                    this.method2179(false, var9, 2048, var10);
                    this.method2179(false, var9 + 1, 32768, var10 + 1);
                }
                if (arg0 == 2) {
                    this.method2179(false, var9, 8192, var10);
                    this.method2179(false, var9 - 1, 512, var10 + 1);
                }
                if (arg0 == 3) {
                    this.method2179(false, var9, 32768, var10);
                    this.method2179(false, var9 - 1, 2048, var10 - 1);
                }
            }
            if (arg1 == 2) {
                if (arg0 == 0) {
                    this.method2179(false, var9, 66560, var10);
                    this.method2179(false, var9, 4096, var10 - 1);
                    this.method2179(false, var9 + 1, 16384, var10);
                }
                if (arg0 == 1) {
                    this.method2179(false, var9, 5120, var10);
                    this.method2179(false, var9 + 1, 16384, var10);
                    this.method2179(false, var9, 65536, var10 + 1);
                }
                if (arg0 == 2) {
                    this.method2179(false, var9, 20480, var10);
                    this.method2179(false, var9, 65536, var10 + 1);
                    this.method2179(false, var9 - 1, 1024, var10);
                }
                if (arg0 == 3) {
                    this.method2179(false, var9, 81920, var10);
                    this.method2179(false, var9 - 1, 1024, var10);
                    this.method2179(false, var9, 4096, var10 - 1);
                }
            }
        }
        if (!arg4) {
            return;
        }
        if (arg1 == 0) {
            if (arg0 == 0) {
                this.method2179(false, var9, 536870912, var10);
                this.method2179(false, var9, 33554432, var10 - 1);
            }
            if (arg0 == 1) {
                this.method2179(false, var9, 8388608, var10);
                this.method2179(false, var9 + 1, 134217728, var10);
            }
            if (arg0 == 2) {
                this.method2179(false, var9, 33554432, var10);
                this.method2179(false, var9, 536870912, var10 + 1);
            }
            if (arg0 == 3) {
                this.method2179(false, var9, 134217728, var10);
                this.method2179(false, var9 - 1, 8388608, var10);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg0 == 0) {
                this.method2179(false, var9, 4194304, var10);
                this.method2179(false, var9 + 1, 67108864, var10 - 1);
            }
            if (arg0 == 1) {
                this.method2179(false, var9, 16777216, var10);
                this.method2179(false, var9 + 1, 268435456, var10 + 1);
            }
            if (arg0 == 2) {
                this.method2179(false, var9, 67108864, var10);
                this.method2179(false, var9 - 1, 4194304, var10 + 1);
            }
            if (arg0 == 3) {
                this.method2179(false, var9, 268435456, var10);
                this.method2179(false, var9 - 1, 16777216, var10 - 1);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method2179(false, var9, 545259520, var10);
            this.method2179(false, var9, 33554432, var10 - 1);
            this.method2179(false, var9 + 1, 134217728, var10);
        }
        if (arg0 == 1) {
            this.method2179(false, var9, 41943040, var10);
            this.method2179(false, var9 + 1, 134217728, var10);
            this.method2179(false, var9, 536870912, var10 + 1);
        }
        if (arg0 == 2) {
            this.method2179(false, var9, 167772160, var10);
            this.method2179(false, var9, 536870912, var10 + 1);
            this.method2179(false, var9 - 1, 8388608, var10);
        }
        if (arg0 == 3) {
            this.method2179(false, var9, 671088640, var10);
            this.method2179(false, var9 - 1, 8388608, var10);
            this.method2179(false, var9, 33554432, var10 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(B)V", line = 930)
    public static void method2188(byte arg0) {
        field4846 = null;
        field4833 = null;
        if (arg0 < 102) {
            method2188((byte) -120);
        }
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(B)V", line = 945)
    public final void method2189(byte arg0) {
        field4851++;
        if (arg0 >= -74) {
            method2192(-108);
        }
        for (int var2 = 0; var2 < this.field4839; var2++) {
            for (int var3 = 0; var3 < this.field4829; var3++) {
                if (var2 == 0 || var3 == 0 || (this.field4839 - 5) <= var2 || var3 >= (this.field4829 - 5)) {
                    this.field4830[var2][var3] = -1;
                } else {
                    this.field4830[var2][var3] = 2097152;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIIIIIIZI)Z", line = 977)
    public final boolean method2190(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
        field4842++;
        if (arg6 > 1) {
            return class28.method183(arg1, arg5, arg2, arg8, arg6, arg0, -1803607479, arg3, arg6) ? true : this.method2195(arg5, arg0, arg6, arg8, arg4, 8, arg3, arg2, arg6, arg1);
        }
        int var10 = arg5 + arg3 - 1;
        int var11 = arg1 + arg2 - 1;
        if (arg5 <= arg8 && arg8 <= var10 && arg2 <= arg0 && arg0 <= var11) {
            return true;
        } else if ((arg5 - 1) == arg8 && arg2 <= arg0 && var11 >= arg0 && (this.field4830[arg8 - this.field4843][arg0 - this.field4841] & 0x8) == 0 && (arg4 & 0x8) == 0) {
            return true;
        } else if (var10 + 1 == arg8 && arg0 >= arg2 && var11 >= arg0 && (this.field4830[arg8 - this.field4843][arg0 - this.field4841] & 0x80) == 0 && (arg4 & 0x2) == 0) {
            return true;
        } else if (arg2 - 1 == arg0 && arg5 <= arg8 && arg8 <= var10 && (this.field4830[arg8 - this.field4843][arg0 - this.field4841] & 0x2) == 0 && (arg4 & 0x4) == 0) {
            return true;
        } else if ((var11 + 1) == arg0 && arg8 >= arg5 && var10 >= arg8 && (this.field4830[arg8 - this.field4843][arg0 - this.field4841] & 0x20) == 0 && (arg4 & 0x1) == 0) {
            return true;
        } else {
            if (arg7) {
                this.method2186(-9, 21, -126, -95, -122, -10, 83, 15);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIBZIZI)V", line = 1020)
    public final void method2191(int arg0, int arg1, byte arg2, boolean arg3, int arg4, boolean arg5, int arg6) {
        int var8 = arg1 - this.field4841;
        if (arg2 != 59) {
            return;
        }
        field4834++;
        int var9 = arg6 - this.field4843;
        if (arg4 == 0) {
            if (arg0 == 0) {
                this.method2178(var9, var8, true, 128);
                this.method2178(var9 - 1, var8, true, 8);
            }
            if (arg0 == 1) {
                this.method2178(var9, var8, true, 2);
                this.method2178(var9, var8 + 1, true, 32);
            }
            if (arg0 == 2) {
                this.method2178(var9, var8, true, 8);
                this.method2178(var9 + 1, var8, true, 128);
            }
            if (arg0 == 3) {
                this.method2178(var9, var8, true, 32);
                this.method2178(var9, var8 - 1, true, 2);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg0 == 0) {
                this.method2178(var9, var8, true, 1);
                this.method2178(var9 - 1, var8 + 1, true, 16);
            }
            if (arg0 == 1) {
                this.method2178(var9, var8, true, 4);
                this.method2178(var9 + 1, var8 - -1, true, 64);
            }
            if (arg0 == 2) {
                this.method2178(var9, var8, true, 16);
                this.method2178(var9 + 1, var8 + -1, true, 1);
            }
            if (arg0 == 3) {
                this.method2178(var9, var8, true, 64);
                this.method2178(var9 - 1, var8 + -1, true, 4);
            }
        }
        if (arg4 == 2) {
            if (arg0 == 0) {
                this.method2178(var9, var8, true, 130);
                this.method2178(var9 - 1, var8, true, 8);
                this.method2178(var9, var8 + 1, true, 32);
            }
            if (arg0 == 1) {
                this.method2178(var9, var8, true, 10);
                this.method2178(var9, var8 + 1, true, 32);
                this.method2178(var9 + 1, var8, true, 128);
            }
            if (arg0 == 2) {
                this.method2178(var9, var8, true, 40);
                this.method2178(var9 + 1, var8, true, 128);
                this.method2178(var9, var8 - 1, true, 2);
            }
            if (arg0 == 3) {
                this.method2178(var9, var8, true, 160);
                this.method2178(var9, var8 - 1, true, 2);
                this.method2178(var9 - 1, var8, true, 8);
            }
        }
        if (arg5) {
            if (arg4 == 0) {
                if (arg0 == 0) {
                    this.method2178(var9, var8, true, 65536);
                    this.method2178(var9 - 1, var8, true, 4096);
                }
                if (arg0 == 1) {
                    this.method2178(var9, var8, true, 1024);
                    this.method2178(var9, var8 + 1, true, 16384);
                }
                if (arg0 == 2) {
                    this.method2178(var9, var8, true, 4096);
                    this.method2178(var9 + 1, var8, true, 65536);
                }
                if (arg0 == 3) {
                    this.method2178(var9, var8, true, 16384);
                    this.method2178(var9, var8 - 1, true, 1024);
                }
            }
            if (arg4 == 1 || arg4 == 3) {
                if (arg0 == 0) {
                    this.method2178(var9, var8, true, 512);
                    this.method2178(var9 - 1, var8 - -1, true, 8192);
                }
                if (arg0 == 1) {
                    this.method2178(var9, var8, true, 2048);
                    this.method2178(var9 + 1, var8 + 1, true, 32768);
                }
                if (arg0 == 2) {
                    this.method2178(var9, var8, true, 8192);
                    this.method2178(var9 + 1, var8 - 1, true, 512);
                }
                if (arg0 == 3) {
                    this.method2178(var9, var8, true, 32768);
                    this.method2178(var9 - 1, var8 + -1, true, 2048);
                }
            }
            if (arg4 == 2) {
                if (arg0 == 0) {
                    this.method2178(var9, var8, true, 66560);
                    this.method2178(var9 - 1, var8, true, 4096);
                    this.method2178(var9, var8 + 1, true, 16384);
                }
                if (arg0 == 1) {
                    this.method2178(var9, var8, true, 5120);
                    this.method2178(var9, var8 + 1, true, 16384);
                    this.method2178(var9 + 1, var8, true, 65536);
                }
                if (arg0 == 2) {
                    this.method2178(var9, var8, true, 20480);
                    this.method2178(var9 + 1, var8, true, 65536);
                    this.method2178(var9, var8 - 1, true, 1024);
                }
                if (arg0 == 3) {
                    this.method2178(var9, var8, true, 81920);
                    this.method2178(var9, var8 - 1, true, 1024);
                    this.method2178(var9 - 1, var8, true, 4096);
                }
            }
        }
        if (!arg3) {
            return;
        }
        if (arg4 == 0) {
            if (arg0 == 0) {
                this.method2178(var9, var8, true, 536870912);
                this.method2178(var9 - 1, var8, true, 33554432);
            }
            if (arg0 == 1) {
                this.method2178(var9, var8, true, 8388608);
                this.method2178(var9, var8 + 1, true, 134217728);
            }
            if (arg0 == 2) {
                this.method2178(var9, var8, true, 33554432);
                this.method2178(var9 + 1, var8, true, 536870912);
            }
            if (arg0 == 3) {
                this.method2178(var9, var8, true, 134217728);
                this.method2178(var9, var8 - 1, true, 8388608);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg0 == 0) {
                this.method2178(var9, var8, true, 4194304);
                this.method2178(var9 - 1, var8 + 1, true, 67108864);
            }
            if (arg0 == 1) {
                this.method2178(var9, var8, true, 16777216);
                this.method2178(var9 + 1, var8 + 1, true, 268435456);
            }
            if (arg0 == 2) {
                this.method2178(var9, var8, true, 67108864);
                this.method2178(var9 + 1, var8 + -1, true, 4194304);
            }
            if (arg0 == 3) {
                this.method2178(var9, var8, true, 268435456);
                this.method2178(var9 - 1, var8 + -1, true, 16777216);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method2178(var9, var8, true, 545259520);
            this.method2178(var9 - 1, var8, true, 33554432);
            this.method2178(var9, var8 + 1, true, 134217728);
        }
        if (arg0 == 1) {
            this.method2178(var9, var8, true, 41943040);
            this.method2178(var9, var8 + 1, true, 134217728);
            this.method2178(var9 + 1, var8, true, 536870912);
        }
        if (arg0 == 2) {
            this.method2178(var9, var8, true, 167772160);
            this.method2178(var9 + 1, var8, true, 536870912);
            this.method2178(var9, var8 - 1, true, 8388608);
        }
        if (arg0 == 3) {
            this.method2178(var9, var8, true, 671088640);
            this.method2178(var9, var8 - 1, true, 8388608);
            this.method2178(var9 - 1, var8, true, 33554432);
            return;
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)V", line = 1327)
    public static final void method2192(int arg0) {
        if (arg0 != -3) {
            return;
        }
        class80.field1115.method272(20);
        field4844++;
        class281.field3898.method272(20);
        class79.field1110.method272(20);
        class642.field8889.method272(20);
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(IIIIIIII)Z", line = 1341)
    public final boolean method2193(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4850++;
        if (arg6 != -1) {
            field4845 = false;
        }
        if (arg2 == 1) {
            if (arg0 == arg3 && arg5 == arg7) {
                return true;
            }
        } else if (arg0 <= arg3 && (arg2 + arg0 - 1) >= arg3 && arg7 <= arg7 && arg7 <= arg7 + arg2 - 1) {
            return true;
        }
        int var9 = arg7 - this.field4841;
        int var10 = arg0 - this.field4843;
        int var11 = arg3 - this.field4843;
        int var12 = arg5 - this.field4841;
        if (arg2 == 1) {
            if (arg1 == 6 || arg1 == 7) {
                if (arg1 == 7) {
                    arg4 = arg4 + 2 & 0x3;
                }
                if (arg4 == 0) {
                    if (var11 + 1 == var10 && var9 == var12 && (this.field4830[var10][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var9 - 1 == var12 && (this.field4830[var10][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var11 - 1 == var10 && var9 == var12 && (this.field4830[var10][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var9 - 1) == var12 && (this.field4830[var10][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if (var11 - 1 == var10 && var9 == var12 && (this.field4830[var10][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var9 + 1) == var12 && (this.field4830[var10][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if ((var11 + 1) == var10 && var9 == var12 && (this.field4830[var10][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var9 + 1 == var12 && (this.field4830[var10][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg1 == 8) {
                if (var10 == var11 && var9 + 1 == var12 && (this.field4830[var10][var12] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var11 && var9 - 1 == var12 && (this.field4830[var10][var12] & 0x2) == 0) {
                    return true;
                }
                if (var11 - 1 == var10 && var9 == var12 && (this.field4830[var10][var12] & 0x8) == 0) {
                    return true;
                }
                if ((var11 + 1) == var10 && var9 == var12 && (this.field4830[var10][var12] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg2 + var10 - 1;
            int var14 = var12 - (1 - arg2);
            if (arg1 == 6 || arg1 == 7) {
                if (arg1 == 7) {
                    arg4 = arg4 + 2 & 0x3;
                }
                if (arg4 == 0) {
                    if (var11 + 1 == var10 && var12 <= var9 && var9 <= var14 && (this.field4830[var10][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 <= var11 && var13 >= var11 && var9 - arg2 == var12 && (this.field4830[var11][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if ((var11 - arg2) == var10 && var12 <= var9 && var9 <= var14 && (this.field4830[var13][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 >= var10 && var13 >= var11 && var9 - arg2 == var12 && (this.field4830[var11][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if ((var11 - arg2) == var10 && var12 <= var9 && var14 >= var9 && (this.field4830[var13][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 >= var10 && var13 >= var11 && var9 + 1 == var12 && (this.field4830[var11][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var11 + 1 == var10 && var12 <= var9 && var9 <= var14 && (this.field4830[var10][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 <= var11 && var11 <= var13 && var9 + 1 == var12 && (this.field4830[var11][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg1 == 8) {
                if (var11 >= var10 && var13 >= var11 && (var9 + 1) == var12 && (this.field4830[var11][var12] & 0x20) == 0) {
                    return true;
                }
                if (var10 <= var11 && var11 <= var13 && var9 - arg2 == var12 && (this.field4830[var11][var14] & 0x2) == 0) {
                    return true;
                }
                if (var11 - arg2 == var10 && var9 >= var12 && var14 >= var9 && (this.field4830[var13][var9] & 0x8) == 0) {
                    return true;
                }
                if (var11 + 1 == var10 && var12 <= var9 && var9 <= var14 && (this.field4830[var10][var9] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lfca;I)Ldd;", line = 1523)
    public static final class733 method2194(class93 arg0, int arg1) {
        if (arg1 < 24) {
            field4833 = null;
        }
        field4852++;
        return new class733(arg0.method774(-4), arg0.method774(-4), arg0.method774(-4), arg0.method774(-4), arg0.method767((byte) -128), arg0.method793((byte) 112));
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIIIIIIIII)Z", line = 1537)
    public final boolean method2195(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field4835++;
        int var11 = arg2 + arg3;
        if (arg5 != 8) {
            method2181(null, true, true);
        }
        int var12 = arg1 + arg8;
        int var13 = arg0 + arg6;
        int var14 = arg7 + arg9;
        if (arg3 == var13 && (arg4 & 0x2) == 0) {
            int var15 = arg7 < arg1 ? arg1 : arg7;
            int var16 = var14 > var12 ? var12 : var14;
            while (var16 > var15) {
                if ((this.field4830[var13 - this.field4843 - 1][var15 - this.field4841] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg0 == var11 && (arg4 & 0x8) == 0) {
            int var17 = arg7 < arg1 ? arg1 : arg7;
            int var18 = var12 < var14 ? var12 : var14;
            while (var18 > var17) {
                if ((this.field4830[arg0 - this.field4843][var17 - this.field4841] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg1 == var14 && (arg4 & 0x1) == 0) {
            int var19 = arg3 > arg0 ? arg3 : arg0;
            int var20 = var11 >= var13 ? var13 : var11;
            while (var19 < var20) {
                if ((this.field4830[var19 - this.field4843][var14 - this.field4841 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg7 == var12 && (arg4 & 0x4) == 0) {
            int var21 = arg0 >= arg3 ? arg0 : arg3;
            int var22 = var11 < var13 ? var11 : var13;
            while (var21 < var22) {
                if ((this.field4830[var21 - this.field4843][arg7 - this.field4841] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }
}
