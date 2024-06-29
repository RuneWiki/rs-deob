import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class44 {

    @OriginalMember(owner = "client!pk", name = "o", descriptor = "I")
    private int field735 = 0;

    @OriginalMember(owner = "client!pk", name = "q", descriptor = "I")
    private int field737 = 0;

    @OriginalMember(owner = "client!pk", name = "m", descriptor = "I")
    private int field733;

    @OriginalMember(owner = "client!pk", name = "t", descriptor = "I")
    private int field740;

    @OriginalMember(owner = "client!pk", name = "h", descriptor = "[[I")
    public int[][] field728;

    @OriginalMember(owner = "client!pk", name = "j", descriptor = "[Lie;")
    public static class49[] field730 = new class49[50];

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "I")
    public static int field726 = 0;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "I")
    public static int field721;

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "I")
    public static int field722;

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "I")
    public static int field724;

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!pk", name = "i", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!pk", name = "k", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!pk", name = "l", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!pk", name = "n", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!pk", name = "p", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!pk", name = "r", descriptor = "I")
    public static int field738;

    @OriginalMember(owner = "client!pk", name = "s", descriptor = "I")
    public static int field739;

    @OriginalMember(owner = "client!pk", name = "u", descriptor = "I")
    public static int field741;

    @OriginalMember(owner = "client!pk", name = "v", descriptor = "I")
    public static int field742;

    @OriginalMember(owner = "client!pk", name = "w", descriptor = "I")
    public static int field743;

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "Ldk;")
    public static class251 field727;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIII)V")
    private final void method294(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == -1) {
            field721++;
            this.field728[arg3][arg1] = class51.method359(this.field728[arg3][arg1], ~arg0);
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(III)V")
    public final void method295(int arg0, int arg1, int arg2) {
        if (arg0 != 21876) {
            this.field728 = null;
        }
        field723++;
        int var4 = arg1 - this.field735;
        int var5 = arg2 - this.field737;
        this.field728[var5][var4] = class173.method1263(this.field728[var5][var4], 262144);
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIBIIII)Z")
    public final boolean method296(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        field731++;
        if (arg5 == 1) {
            if (arg0 == arg2 && arg1 == arg4) {
                return true;
            }
        } else if (arg2 <= arg0 && arg0 <= (arg2 + arg5 - 1) && arg4 <= arg4 && (arg4 + arg5 - 1) >= arg4) {
            return true;
        }
        int var9 = arg1 - this.field735;
        int var10 = arg2 - this.field737;
        int var11 = arg4 - this.field735;
        int var12 = arg0 - this.field737;
        if (arg5 == 1) {
            if (arg7 == 6 || arg7 == 7) {
                if (arg7 == 7) {
                    arg6 = arg6 + 2 & 0x3;
                }
                if (arg6 == 0) {
                    if ((var12 + 1) == var10 && var9 == var11 && (this.field728[var10][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var11 - 1) == var9 && (this.field728[var10][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if ((var12 - 1) == var10 && var9 == var11 && (this.field728[var10][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var11 - 1) == var9 && (this.field728[var10][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if ((var12 - 1) == var10 && var9 == var11 && (this.field728[var10][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var11 + 1 == var9 && (this.field728[var10][var9] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var12 + 1 == var10 && var9 == var11 && (this.field728[var10][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var11 + 1) == var9 && (this.field728[var10][var9] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg7 == 8) {
                if (var10 == var12 && (var11 + 1) == var9 && (this.field728[var10][var9] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var12 && var11 - 1 == var9 && (this.field728[var10][var9] & 0x2) == 0) {
                    return true;
                }
                if (var12 - 1 == var10 && var9 == var11 && (this.field728[var10][var9] & 0x8) == 0) {
                    return true;
                }
                if ((var12 + 1) == var10 && var9 == var11 && (this.field728[var10][var9] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var10 + arg5 - 1;
            int var14 = arg5 + var9 - 1;
            if (arg7 == 6 || arg7 == 7) {
                if (arg7 == 7) {
                    arg6 = arg6 + 2 & 0x3;
                }
                if (arg6 == 0) {
                    if ((var12 + 1) == var10 && var9 <= var11 && var11 <= var14 && (this.field728[var10][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 <= var12 && var13 >= var12 && var11 - arg5 == var9 && (this.field728[var12][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var12 - arg5 == var10 && var9 <= var11 && var11 <= var14 && (this.field728[var13][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 >= var10 && var13 >= var12 && var11 - arg5 == var9 && (this.field728[var12][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if ((var12 - arg5) == var10 && var9 <= var11 && var14 >= var11 && (this.field728[var13][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 >= var10 && var12 <= var13 && (var11 + 1) == var9 && (this.field728[var12][var9] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var12 + 1 == var10 && var11 >= var9 && var11 <= var14 && (this.field728[var10][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 <= var12 && var13 >= var12 && var11 + 1 == var9 && (this.field728[var12][var9] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg7 == 8) {
                if (var10 <= var12 && var12 <= var13 && var11 + 1 == var9 && (this.field728[var12][var9] & 0x20) == 0) {
                    return true;
                }
                if (var10 <= var12 && var13 >= var12 && var11 - arg5 == var9 && (this.field728[var12][var14] & 0x2) == 0) {
                    return true;
                }
                if ((var12 - arg5) == var10 && var9 <= var11 && var14 >= var11 && (this.field728[var13][var11] & 0x8) == 0) {
                    return true;
                }
                if (var12 + 1 == var10 && var11 >= var9 && var14 >= var11 && (this.field728[var10][var11] & 0x80) == 0) {
                    return true;
                }
            }
        }
        if (arg3 > -84) {
            this.method298(69, 97, 10, 12, 73, 122, -93, -82, 0);
        }
        return false;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IBIIIZZI)V")
    public final void method297(int arg0, byte arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6, int arg7) {
        field722++;
        if (arg1 < 99) {
            this.method304(48, 63, false, -91, false, -85, 22);
        }
        int var9 = arg2 - this.field735;
        int var10 = 256;
        if (arg4 == 1 || arg4 == 3) {
            int var11 = arg3;
            arg3 = arg7;
            arg7 = var11;
        }
        int var12 = arg0 - this.field737;
        if (arg6) {
            var10 |= 0x20000;
        }
        if (arg5) {
            var10 |= 0x40000000;
        }
        for (int var13 = var12; var13 < (arg3 + var12); var13++) {
            if (var13 >= 0 && this.field733 > var13) {
                for (int var14 = var9; var14 < (arg7 + var9); var14++) {
                    if (var14 >= 0 && var14 < this.field740) {
                        this.method294(var10, var14, -1, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIIIIIII)Z")
    public final boolean method298(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field734++;
        if (arg3 > 1) {
            return class1.method6(arg0, arg3, arg6, arg3, arg5, arg4, arg1, arg2, 14938) ? true : this.method307(arg3, arg0, arg8, arg2, -111, arg4, arg1, arg3, arg6, arg5);
        }
        int var10 = arg2 + arg5 - 1;
        int var11 = arg0 + arg1 - 1;
        if (arg4 >= arg0 && var11 >= arg4 && arg5 <= arg6 && var10 >= arg6) {
            return true;
        } else if (arg7 <= 35) {
            return true;
        } else if (arg0 - 1 == arg4 && arg5 <= arg6 && var10 >= arg6 && (this.field728[arg4 - this.field737][arg6 - this.field735] & 0x8) == 0 && (arg8 & 0x8) == 0) {
            return true;
        } else if ((var11 + 1) == arg4 && arg5 <= arg6 && arg6 <= var10 && (this.field728[arg4 - this.field737][arg6 - this.field735] & 0x80) == 0 && (arg8 & 0x2) == 0) {
            return true;
        } else if (arg5 - 1 == arg6 && arg0 <= arg4 && arg4 <= var11 && (this.field728[arg4 - this.field737][arg6 - this.field735] & 0x2) == 0 && (arg8 & 0x4) == 0) {
            return true;
        } else {
            return (var10 + 1) == arg6 && arg0 <= arg4 && arg4 <= var11 && (this.field728[arg4 - this.field737][arg6 - this.field735] & 0x20) == 0 && (arg8 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IBI)V")
    public final void method299(int arg0, byte arg1, int arg2) {
        field732++;
        int var4 = arg2 - this.field737;
        int var5 = arg0 - this.field735;
        int var6 = 119 / ((-arg1 - 42) / 56);
        this.field728[var4][var5] = class173.method1263(this.field728[var4][var5], 2097152);
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(IIII)V")
    private final void method300(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 == 21221) {
            field743++;
            this.field728[arg1][arg3] = class173.method1263(this.field728[arg1][arg3], arg2);
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)V")
    public static void method301(int arg0) {
        field730 = null;
        if (arg0 != -2) {
            method301(69);
        }
        field727 = null;
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(III)V")
    public final void method302(int arg0, int arg1, int arg2) {
        field736++;
        int var4 = arg1 - this.field735;
        int var5 = arg2 - this.field737;
        this.field728[var5][var4] = class51.method359(this.field728[var5][var4], -262145);
        if (arg0 >= -102) {
            this.method303(79, -63, true, -77, -9, 107, false);
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIZIIIZ)V")
    public final void method303(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, boolean arg6) {
        int var8 = 256;
        int var9 = arg3 - this.field735;
        field729++;
        int var10 = arg0 - this.field737;
        if (arg2) {
            var8 |= 0x20000;
        }
        if (arg6) {
            var8 |= 0x40000000;
        }
        for (int var11 = var10; var11 < arg4 + var10; var11++) {
            if (var11 >= 0 && this.field733 > var11) {
                for (int var12 = var9; var12 < arg5 + var9; var12++) {
                    if (var12 >= 0 && var12 < this.field740) {
                        this.method300(21221, var11, var8, var12);
                    }
                }
            }
        }
        if (arg1 != 1073741824) {
            this.method297(-1, (byte) 42, -10, 119, 1, true, false, 115);
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIZIZII)V")
    public final void method304(int arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5, int arg6) {
        int var8 = arg5 - this.field737;
        int var9 = arg6 - this.field735;
        field741++;
        if (~arg0 == arg1) {
            if (arg3 == 0) {
                this.method294(128, var9, -1, var8);
                this.method294(8, var9, -1, var8 - 1);
            }
            if (arg3 == 1) {
                this.method294(2, var9, -1, var8);
                this.method294(32, var9 + 1, -1, var8);
            }
            if (arg3 == 2) {
                this.method294(8, var9, -1, var8);
                this.method294(128, var9, -1, var8 + 1);
            }
            if (arg3 == 3) {
                this.method294(32, var9, -1, var8);
                this.method294(2, var9 - 1, -1, var8);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg3 == 0) {
                this.method294(1, var9, -1, var8);
                this.method294(16, var9 + 1, -1, var8 + -1);
            }
            if (arg3 == 1) {
                this.method294(4, var9, -1, var8);
                this.method294(64, var9 + 1, -1, var8 + 1);
            }
            if (arg3 == 2) {
                this.method294(16, var9, -1, var8);
                this.method294(1, var9 - 1, -1, var8 + 1);
            }
            if (arg3 == 3) {
                this.method294(64, var9, -1, var8);
                this.method294(4, var9 - 1, -1, var8 + -1);
            }
        }
        if (arg0 == 2) {
            if (arg3 == 0) {
                this.method294(130, var9, arg1, var8);
                this.method294(8, var9, -1, var8 - 1);
                this.method294(32, var9 + 1, -1, var8);
            }
            if (arg3 == 1) {
                this.method294(10, var9, -1, var8);
                this.method294(32, var9 + 1, arg1, var8);
                this.method294(128, var9, arg1, var8 + 1);
            }
            if (arg3 == 2) {
                this.method294(40, var9, arg1, var8);
                this.method294(128, var9, -1, var8 + 1);
                this.method294(2, var9 - 1, -1, var8);
            }
            if (arg3 == 3) {
                this.method294(160, var9, -1, var8);
                this.method294(2, var9 - 1, -1, var8);
                this.method294(8, var9, arg1, var8 - 1);
            }
        }
        if (arg2) {
            if (arg0 == 0) {
                if (arg3 == 0) {
                    this.method294(65536, var9, -1, var8);
                    this.method294(4096, var9, -1, var8 - 1);
                }
                if (arg3 == 1) {
                    this.method294(1024, var9, arg1, var8);
                    this.method294(16384, var9 + 1, -1, var8);
                }
                if (arg3 == 2) {
                    this.method294(4096, var9, arg1, var8);
                    this.method294(65536, var9, -1, var8 + 1);
                }
                if (arg3 == 3) {
                    this.method294(16384, var9, -1, var8);
                    this.method294(1024, var9 - 1, -1, var8);
                }
            }
            if (arg0 == 1 || arg0 == 3) {
                if (arg3 == 0) {
                    this.method294(512, var9, arg1, var8);
                    this.method294(8192, var9 + 1, -1, var8 + -1);
                }
                if (arg3 == 1) {
                    this.method294(2048, var9, -1, var8);
                    this.method294(32768, var9 + 1, -1, var8 + 1);
                }
                if (arg3 == 2) {
                    this.method294(8192, var9, -1, var8);
                    this.method294(512, var9 - 1, arg1, var8 + 1);
                }
                if (arg3 == 3) {
                    this.method294(32768, var9, -1, var8);
                    this.method294(2048, var9 - 1, -1, var8 + -1);
                }
            }
            if (arg0 == 2) {
                if (arg3 == 0) {
                    this.method294(66560, var9, -1, var8);
                    this.method294(4096, var9, arg1, var8 - 1);
                    this.method294(16384, var9 + 1, -1, var8);
                }
                if (arg3 == 1) {
                    this.method294(5120, var9, -1, var8);
                    this.method294(16384, var9 + 1, -1, var8);
                    this.method294(65536, var9, -1, var8 + 1);
                }
                if (arg3 == 2) {
                    this.method294(20480, var9, -1, var8);
                    this.method294(65536, var9, -1, var8 + 1);
                    this.method294(1024, var9 - 1, arg1, var8);
                }
                if (arg3 == 3) {
                    this.method294(81920, var9, arg1, var8);
                    this.method294(1024, var9 - 1, arg1, var8);
                    this.method294(4096, var9, -1, var8 - 1);
                }
            }
        }
        if (!arg4) {
            return;
        }
        if (arg0 == 0) {
            if (arg3 == 0) {
                this.method294(536870912, var9, arg1, var8);
                this.method294(33554432, var9, -1, var8 - 1);
            }
            if (arg3 == 1) {
                this.method294(8388608, var9, -1, var8);
                this.method294(134217728, var9 + 1, -1, var8);
            }
            if (arg3 == 2) {
                this.method294(33554432, var9, -1, var8);
                this.method294(536870912, var9, -1, var8 + 1);
            }
            if (arg3 == 3) {
                this.method294(134217728, var9, -1, var8);
                this.method294(8388608, var9 - 1, -1, var8);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg3 == 0) {
                this.method294(4194304, var9, arg1, var8);
                this.method294(67108864, var9 + 1, arg1, var8 - 1);
            }
            if (arg3 == 1) {
                this.method294(16777216, var9, -1, var8);
                this.method294(268435456, var9 + 1, -1, var8 + 1);
            }
            if (arg3 == 2) {
                this.method294(67108864, var9, -1, var8);
                this.method294(4194304, var9 - 1, -1, var8 + 1);
            }
            if (arg3 == 3) {
                this.method294(268435456, var9, arg1, var8);
                this.method294(16777216, var9 - 1, -1, var8 - 1);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method294(545259520, var9, -1, var8);
            this.method294(33554432, var9, -1, var8 - 1);
            this.method294(134217728, var9 + 1, -1, var8);
        }
        if (arg3 == 1) {
            this.method294(41943040, var9, -1, var8);
            this.method294(134217728, var9 + 1, arg1, var8);
            this.method294(536870912, var9, -1, var8 + 1);
        }
        if (arg3 == 2) {
            this.method294(167772160, var9, arg1, var8);
            this.method294(536870912, var9, arg1, var8 + 1);
            this.method294(8388608, var9 - 1, arg1, var8);
        }
        if (arg3 == 3) {
            this.method294(671088640, var9, -1, var8);
            this.method294(8388608, var9 - 1, -1, var8);
            this.method294(33554432, var9, -1, var8 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Z)V")
    public final void method305(boolean arg0) {
        field724++;
        int var2 = 0;
        if (!arg0) {
            this.method309(125, -87, -126, -7, 112, 106, -57, -77);
        }
        while (this.field733 > var2) {
            for (int var3 = 0; var3 < this.field740; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= (this.field733 - 5) || var3 >= this.field740 - 5) {
                    this.field728[var2][var3] = 16777215;
                } else {
                    this.field728[var2][var3] = 2097152;
                }
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZIZIIIZ)V")
    public final void method306(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, boolean arg6) {
        int var8 = arg1 - this.field737;
        int var9 = arg5 - this.field735;
        field739++;
        if (arg0) {
            return;
        }
        if (arg4 == 0) {
            if (arg3 == 0) {
                this.method300(21221, var8, 128, var9);
                this.method300(21221, var8 - 1, 8, var9);
            }
            if (arg3 == 1) {
                this.method300(21221, var8, 2, var9);
                this.method300(21221, var8, 32, var9 + 1);
            }
            if (arg3 == 2) {
                this.method300(21221, var8, 8, var9);
                this.method300(21221, var8 + 1, 128, var9);
            }
            if (arg3 == 3) {
                this.method300(21221, var8, 32, var9);
                this.method300(21221, var8, 2, var9 - 1);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg3 == 0) {
                this.method300(21221, var8, 1, var9);
                this.method300(21221, var8 - 1, 16, var9 + 1);
            }
            if (arg3 == 1) {
                this.method300(21221, var8, 4, var9);
                this.method300(21221, var8 + 1, 64, var9 + 1);
            }
            if (arg3 == 2) {
                this.method300(21221, var8, 16, var9);
                this.method300(21221, var8 + 1, 1, var9 - 1);
            }
            if (arg3 == 3) {
                this.method300(21221, var8, 64, var9);
                this.method300(21221, var8 - 1, 4, var9 - 1);
            }
        }
        if (arg4 == 2) {
            if (arg3 == 0) {
                this.method300(21221, var8, 130, var9);
                this.method300(21221, var8 - 1, 8, var9);
                this.method300(21221, var8, 32, var9 + 1);
            }
            if (arg3 == 1) {
                this.method300(21221, var8, 10, var9);
                this.method300(21221, var8, 32, var9 + 1);
                this.method300(21221, var8 + 1, 128, var9);
            }
            if (arg3 == 2) {
                this.method300(21221, var8, 40, var9);
                this.method300(21221, var8 + 1, 128, var9);
                this.method300(21221, var8, 2, var9 - 1);
            }
            if (arg3 == 3) {
                this.method300(21221, var8, 160, var9);
                this.method300(21221, var8, 2, var9 - 1);
                this.method300(21221, var8 - 1, 8, var9);
            }
        }
        if (arg2) {
            if (arg4 == 0) {
                if (arg3 == 0) {
                    this.method300(21221, var8, 65536, var9);
                    this.method300(21221, var8 - 1, 4096, var9);
                }
                if (arg3 == 1) {
                    this.method300(21221, var8, 1024, var9);
                    this.method300(21221, var8, 16384, var9 + 1);
                }
                if (arg3 == 2) {
                    this.method300(21221, var8, 4096, var9);
                    this.method300(21221, var8 + 1, 65536, var9);
                }
                if (arg3 == 3) {
                    this.method300(21221, var8, 16384, var9);
                    this.method300(21221, var8, 1024, var9 - 1);
                }
            }
            if (arg4 == 1 || arg4 == 3) {
                if (arg3 == 0) {
                    this.method300(21221, var8, 512, var9);
                    this.method300(21221, var8 - 1, 8192, var9 + 1);
                }
                if (arg3 == 1) {
                    this.method300(21221, var8, 2048, var9);
                    this.method300(21221, var8 + 1, 32768, var9 + 1);
                }
                if (arg3 == 2) {
                    this.method300(21221, var8, 8192, var9);
                    this.method300(21221, var8 + 1, 512, var9 - 1);
                }
                if (arg3 == 3) {
                    this.method300(21221, var8, 32768, var9);
                    this.method300(21221, var8 - 1, 2048, var9 - 1);
                }
            }
            if (arg4 == 2) {
                if (arg3 == 0) {
                    this.method300(21221, var8, 66560, var9);
                    this.method300(21221, var8 - 1, 4096, var9);
                    this.method300(21221, var8, 16384, var9 + 1);
                }
                if (arg3 == 1) {
                    this.method300(21221, var8, 5120, var9);
                    this.method300(21221, var8, 16384, var9 + 1);
                    this.method300(21221, var8 + 1, 65536, var9);
                }
                if (arg3 == 2) {
                    this.method300(21221, var8, 20480, var9);
                    this.method300(21221, var8 + 1, 65536, var9);
                    this.method300(21221, var8, 1024, var9 - 1);
                }
                if (arg3 == 3) {
                    this.method300(21221, var8, 81920, var9);
                    this.method300(21221, var8, 1024, var9 - 1);
                    this.method300(21221, var8 - 1, 4096, var9);
                }
            }
        }
        if (!arg6) {
            return;
        }
        if (arg4 == 0) {
            if (arg3 == 0) {
                this.method300(21221, var8, 536870912, var9);
                this.method300(21221, var8 - 1, 33554432, var9);
            }
            if (arg3 == 1) {
                this.method300(21221, var8, 8388608, var9);
                this.method300(21221, var8, 134217728, var9 + 1);
            }
            if (arg3 == 2) {
                this.method300(21221, var8, 33554432, var9);
                this.method300(21221, var8 + 1, 536870912, var9);
            }
            if (arg3 == 3) {
                this.method300(21221, var8, 134217728, var9);
                this.method300(21221, var8, 8388608, var9 - 1);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg3 == 0) {
                this.method300(21221, var8, 4194304, var9);
                this.method300(21221, var8 - 1, 67108864, var9 + 1);
            }
            if (arg3 == 1) {
                this.method300(21221, var8, 16777216, var9);
                this.method300(21221, var8 + 1, 268435456, var9 + 1);
            }
            if (arg3 == 2) {
                this.method300(21221, var8, 67108864, var9);
                this.method300(21221, var8 + 1, 4194304, var9 - 1);
            }
            if (arg3 == 3) {
                this.method300(21221, var8, 268435456, var9);
                this.method300(21221, var8 - 1, 16777216, var9 - 1);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method300(21221, var8, 545259520, var9);
            this.method300(21221, var8 - 1, 33554432, var9);
            this.method300(21221, var8, 134217728, var9 + 1);
        }
        if (arg3 == 1) {
            this.method300(21221, var8, 41943040, var9);
            this.method300(21221, var8, 134217728, var9 + 1);
            this.method300(21221, var8 + 1, 536870912, var9);
        }
        if (arg3 == 2) {
            this.method300(21221, var8, 167772160, var9);
            this.method300(21221, var8 + 1, 536870912, var9);
            this.method300(21221, var8, 8388608, var9 - 1);
        }
        if (arg3 == 3) {
            this.method300(21221, var8, 671088640, var9);
            this.method300(21221, var8, 8388608, var9 - 1);
            this.method300(21221, var8 - 1, 33554432, var9);
            return;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIIIIIIII)Z")
    private final boolean method307(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var11 = -64 % ((arg4 + 65) / 42);
        field742++;
        int var12 = arg3 + arg9;
        int var13 = arg5 + arg7;
        int var14 = arg1 + arg6;
        int var15 = arg0 + arg8;
        if (arg5 == var14 && (arg2 & 0x2) == 0) {
            int var16 = arg9 >= arg8 ? arg9 : arg8;
            int var17 = var15 < var12 ? var15 : var12;
            while (var17 > var16) {
                if ((this.field728[var14 - this.field737 - 1][var16 - this.field735] & 0x8) == 0) {
                    return true;
                }
                var16++;
            }
        } else if (arg1 == var13 && (arg2 & 0x8) == 0) {
            int var18 = arg9 < arg8 ? arg8 : arg9;
            int var19 = var12 > var15 ? var15 : var12;
            while (var19 > var18) {
                if ((this.field728[arg1 - this.field737][var18 - this.field735] & 0x80) == 0) {
                    return true;
                }
                var18++;
            }
        } else if (arg8 == var12 && (arg2 & 0x1) == 0) {
            int var20 = arg5 <= arg1 ? arg1 : arg5;
            int var21 = var13 < var14 ? var13 : var14;
            while (var21 > var20) {
                if ((this.field728[var20 - this.field737][var12 - this.field735 - 1] & 0x2) == 0) {
                    return true;
                }
                var20++;
            }
        } else if (arg9 == var15 && (arg2 & 0x4) == 0) {
            int var22 = arg5 > arg1 ? arg5 : arg1;
            int var23 = var14 > var13 ? var13 : var14;
            while (var22 < var23) {
                if ((this.field728[var22 - this.field737][arg9 - this.field735] & 0x20) == 0) {
                    return true;
                }
                var22++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "(III)I")
    public static final int method308(int arg0, int arg1, int arg2) {
        int var3 = arg0 * 57 + arg1;
        int var4 = var3 << 13 ^ var3;
        field725++;
        if (arg2 != -903775002) {
            field726 = 45;
        }
        int var5 = Integer.MAX_VALUE & (var4 * 15731 * var4 + 789221) * var4 + 1376312589;
        return (var5 & 0x7FADE17) >> 19;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method309(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg7 != -1) {
            return true;
        }
        field738++;
        if (arg5 == 1) {
            if (arg1 == arg3 && arg0 == arg2) {
                return true;
            }
        } else if (arg3 >= arg1 && arg1 + arg5 - 1 >= arg3 && arg0 >= arg0 && arg0 + arg5 - 1 >= arg0) {
            return true;
        }
        int var9 = arg0 - this.field735;
        int var10 = arg2 - this.field735;
        int var11 = arg1 - this.field737;
        int var12 = arg3 - this.field737;
        if (arg5 == 1) {
            if (arg4 == 0) {
                if (arg6 == 0) {
                    if (var12 - 1 == var11 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && var9 + 1 == var10 && (this.field728[var11][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 - 1 == var10 && (this.field728[var11][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var11 == var12 && var9 + 1 == var10) {
                        return true;
                    }
                    if ((var12 - 1) == var11 && var9 == var10 && (this.field728[var11][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var11 && var9 == var10 && (this.field728[var11][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if (var12 + 1 == var11 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && (var9 + 1) == var10 && (this.field728[var11][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var9 - 1) == var10 && (this.field728[var11][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var11 == var12 && var9 - 1 == var10) {
                        return true;
                    }
                    if ((var12 - 1) == var11 && var9 == var10 && (this.field728[var11][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var11 && var9 == var10 && (this.field728[var11][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 2) {
                if (arg6 == 0) {
                    if ((var12 - 1) == var11 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && var9 + 1 == var10) {
                        return true;
                    }
                    if ((var12 + 1) == var11 && var9 == var10 && (this.field728[var11][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 - 1 == var10 && (this.field728[var11][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var12 - 1 == var11 && var9 == var10 && (this.field728[var11][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var9 + 1) == var10) {
                        return true;
                    }
                    if (var12 + 1 == var11 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && var9 - 1 == var10 && (this.field728[var11][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if (var12 - 1 == var11 && var9 == var10 && (this.field728[var11][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 + 1 == var10 && (this.field728[var11][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var11 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && var9 - 1 == var10) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if ((var12 - 1) == var11 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && var9 + 1 == var10 && (this.field728[var11][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var11 && var9 == var10 && (this.field728[var11][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 - 1 == var10) {
                        return true;
                    }
                }
            }
            if (arg4 == 9) {
                if (var11 == var12 && var9 + 1 == var10 && (this.field728[var11][var10] & 0x20) == 0) {
                    return true;
                }
                if (var11 == var12 && (var9 - 1) == var10 && (this.field728[var11][var10] & 0x2) == 0) {
                    return true;
                }
                if (var12 - 1 == var11 && var9 == var10 && (this.field728[var11][var10] & 0x8) == 0) {
                    return true;
                }
                if (var12 + 1 == var11 && var9 == var10 && (this.field728[var11][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var10 + arg5 - 1;
            int var14 = arg5 + var11 - 1;
            if (arg4 == 0) {
                if (arg6 == 0) {
                    if ((var12 - arg5) == var11 && var10 <= var9 && var13 >= var9) {
                        return true;
                    }
                    if (var11 <= var12 && var12 <= var14 && var9 + 1 == var10 && (this.field728[var12][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 >= var11 && var12 <= var14 && (var9 - arg5) == var10 && (this.field728[var12][var13] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var11 <= var12 && var12 <= var14 && var9 + 1 == var10) {
                        return true;
                    }
                    if (var12 - arg5 == var11 && var10 <= var9 && var9 <= var13 && (this.field728[var14][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var11 && var9 >= var10 && var9 <= var13 && (this.field728[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if ((var12 + 1) == var11 && var10 <= var9 && var9 <= var13) {
                        return true;
                    }
                    if (var11 <= var12 && var14 >= var12 && (var9 + 1) == var10 && (this.field728[var12][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 >= var11 && var12 <= var14 && var9 - arg5 == var10 && (this.field728[var12][var13] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var12 >= var11 && var12 <= var14 && (var9 - arg5) == var10) {
                        return true;
                    }
                    if (var12 - arg5 == var11 && var9 >= var10 && var13 >= var9 && (this.field728[var14][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var11 && var9 >= var10 && var13 >= var9 && (this.field728[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 2) {
                if (arg6 == 0) {
                    if (var12 - arg5 == var11 && var10 <= var9 && var9 <= var13) {
                        return true;
                    }
                    if (var12 >= var11 && var14 >= var12 && var9 + 1 == var10) {
                        return true;
                    }
                    if (var12 + 1 == var11 && var10 <= var9 && var9 <= var13 && (this.field728[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 <= var12 && var12 <= var14 && var9 - arg5 == var10 && (this.field728[var12][var13] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var12 - arg5 == var11 && var10 <= var9 && var13 >= var9 && (this.field728[var14][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 <= var12 && var14 >= var12 && (var9 + 1) == var10) {
                        return true;
                    }
                    if (var12 + 1 == var11 && var10 <= var9 && var13 >= var9) {
                        return true;
                    }
                    if (var12 >= var11 && var12 <= var14 && (var9 - arg5) == var10 && (this.field728[var12][var13] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if (var12 - arg5 == var11 && var10 <= var9 && var9 <= var13 && (this.field728[var14][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 <= var12 && var12 <= var14 && (var9 + 1) == var10 && (this.field728[var12][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var11 && var10 <= var9 && var13 >= var9) {
                        return true;
                    }
                    if (var12 >= var11 && var12 <= var14 && var9 - arg5 == var10) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if ((var12 - arg5) == var11 && var10 <= var9 && var13 >= var9) {
                        return true;
                    }
                    if (var12 >= var11 && var14 >= var12 && var9 + 1 == var10 && (this.field728[var12][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var11 && var9 >= var10 && var13 >= var9 && (this.field728[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 <= var12 && var14 >= var12 && (var9 - arg5) == var10) {
                        return true;
                    }
                }
            }
            if (arg4 == 9) {
                if (var12 >= var11 && var14 >= var12 && (var9 + 1) == var10 && (this.field728[var12][var10] & 0x2C0120) == 0) {
                    return true;
                }
                if (var12 >= var11 && var12 <= var14 && var9 - arg5 == var10 && (this.field728[var12][var13] & 0x2C0102) == 0) {
                    return true;
                }
                if ((var12 - arg5) == var11 && var10 <= var9 && var9 <= var13 && (this.field728[var14][var9] & 0x2C0108) == 0) {
                    return true;
                }
                if ((var12 + 1) == var11 && var9 >= var10 && var13 >= var9 && (this.field728[var11][var9] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(II)V")
    public class44(int arg0, int arg1) {
        this.field733 = arg0;
        this.field740 = arg1;
        this.field728 = new int[this.field733][this.field740];
        this.method305(true);
    }
}
