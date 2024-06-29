import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class135 {

    @OriginalMember(owner = "client!td", name = "w", descriptor = "I")
    private int field3234 = 0;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "I")
    private int field3214 = 0;

    @OriginalMember(owner = "client!td", name = "B", descriptor = "I")
    private int field3239;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "I")
    private int field3212;

    @OriginalMember(owner = "client!td", name = "s", descriptor = "[[I")
    public int[][] field3230;

    @OriginalMember(owner = "client!td", name = "p", descriptor = "I")
    public static int field3227 = -1;

    @OriginalMember(owner = "client!td", name = "v", descriptor = "[Llc;")
    public static class79[] field3233 = new class79[16];

    @OriginalMember(owner = "client!td", name = "k", descriptor = "Leb;")
    public static class31 field3222 = new class31(64);

    @OriginalMember(owner = "client!td", name = "C", descriptor = "Lqf;")
    private static class117 field3240 = class72.method514(121, "Accept trade");

    @OriginalMember(owner = "client!td", name = "F", descriptor = "Lqf;")
    private static class117 field3243 = class72.method514(116, "Hide");

    @OriginalMember(owner = "client!td", name = "G", descriptor = "I")
    public static int field3244 = 0;

    @OriginalMember(owner = "client!td", name = "E", descriptor = "Lqf;")
    public static class117 field3242 = field3243;

    @OriginalMember(owner = "client!td", name = "H", descriptor = "Lqf;")
    public static class117 field3245 = field3240;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "I")
    public static int field3213;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "I")
    public static int field3217;

    @OriginalMember(owner = "client!td", name = "g", descriptor = "I")
    public static int field3218;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "I")
    public static int field3220;

    @OriginalMember(owner = "client!td", name = "j", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!td", name = "l", descriptor = "I")
    public static int field3223;

    @OriginalMember(owner = "client!td", name = "m", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!td", name = "n", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!td", name = "q", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!td", name = "r", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!td", name = "t", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!td", name = "u", descriptor = "I")
    public static int field3232;

    @OriginalMember(owner = "client!td", name = "x", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!td", name = "y", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!td", name = "z", descriptor = "I")
    public static int field3237;

    @OriginalMember(owner = "client!td", name = "A", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!td", name = "D", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!td", name = "h", descriptor = "[I")
    public static int[] field3219;

    @OriginalMember(owner = "client!td", name = "o", descriptor = "[Lma;")
    public static class84[] field3226;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(III)V")
    public final void method1041(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field3214;
        int var5 = arg1 - this.field3234;
        field3235++;
        this.field3230[var5][var4] = class96.method763(this.field3230[var5][var4], arg0);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ILmf;IBLmf;)Lmf;")
    public static final class89 method1042(int arg0, class89 arg1, int arg2, byte arg3, class89 arg4) {
        class89 var5 = class91.method723(arg4.field2095, arg4.field2152, arg1, arg2, 0, arg0, arg4.field2043, 122, arg4.field2125, arg4.field2103, class141.field3426[arg4.field2125 >> 16], 0);
        field3220++;
        if (arg3 != -2) {
            method1056((byte) 80);
        }
        if (var5 == null) {
            if (arg4.field2084 != null) {
                var5 = class91.method723(arg4.field2095, arg4.field2152, arg1, arg2, 0, arg0, arg4.field2043, 112, arg4.field2125, arg4.field2103, arg4.field2084, 0);
            }
            return var5;
        } else {
            return var5;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIII)V")
    private final void method1043(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 == -20099) {
            this.field3230[arg3][arg1] = class16.method135(this.field3230[arg3][arg1], ~arg2);
            field3225++;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IBZIIII)V")
    public final void method1044(int arg0, byte arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = arg4 - this.field3234;
        field3213++;
        int var9 = arg3 - this.field3214;
        int var10 = 256;
        if (arg6 == 1 || arg6 == 3) {
            int var11 = arg0;
            arg0 = arg5;
            arg5 = var11;
        }
        if (arg2) {
            var10 += 131072;
        }
        int var12 = 34 % ((arg1 - 56) / 42);
        for (int var13 = var8; var13 < arg0 + var8; var13++) {
            if (var13 >= 0 && this.field3212 > var13) {
                for (int var14 = var9; var14 < arg5 + var9; var14++) {
                    if (var14 >= 0 && this.field3239 > var14) {
                        this.method1050(var10, 1, var14, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(III)V")
    public final void method1045(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field3214;
        int var5 = arg0 - this.field3234;
        this.field3230[var5][var4] = class96.method763(this.field3230[var5][var4], arg1);
        field3236++;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ZIIIII)V")
    public final void method1046(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - this.field3214;
        field3218++;
        int var8 = arg3 - this.field3234;
        if (arg4 == 0) {
            if (arg5 == 0) {
                this.method1043(arg1 ^ 0x59A9, var7, 128, var8);
                this.method1043(arg1 ^ 0x59A9, var7, 8, var8 - 1);
            }
            if (arg5 == 1) {
                this.method1043(-20099, var7, 2, var8);
                this.method1043(-20099, var7 + 1, 32, var8);
            }
            if (arg5 == 2) {
                this.method1043(-20099, var7, 8, var8);
                this.method1043(-20099, var7, 128, var8 + 1);
            }
            if (arg5 == 3) {
                this.method1043(arg1 ^ 0x59A9, var7, 32, var8);
                this.method1043(-20099, var7 - 1, 2, var8);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg5 == 0) {
                this.method1043(-20099, var7, 1, var8);
                this.method1043(-20099, var7 + 1, 16, var8 - 1);
            }
            if (arg5 == 1) {
                this.method1043(arg1 - 14167, var7, 4, var8);
                this.method1043(arg1 - 14167, var7 + 1, 64, var8 + 1);
            }
            if (arg5 == 2) {
                this.method1043(-20099, var7, 16, var8);
                this.method1043(-20099, var7 - 1, 1, var8 + 1);
            }
            if (arg5 == 3) {
                this.method1043(arg1 - 14167, var7, 64, var8);
                this.method1043(-20099, var7 - 1, 4, var8 - 1);
            }
        }
        if (arg1 != -5932) {
            method1055(null, -13, 108);
        }
        if (arg4 == 2) {
            if (arg5 == 0) {
                this.method1043(-20099, var7, 130, var8);
                this.method1043(-20099, var7, 8, var8 - 1);
                this.method1043(-20099, var7 + 1, 32, var8);
            }
            if (arg5 == 1) {
                this.method1043(-20099, var7, 10, var8);
                this.method1043(-20099, var7 + 1, 32, var8);
                this.method1043(arg1 - 14167, var7, 128, var8 + 1);
            }
            if (arg5 == 2) {
                this.method1043(-20099, var7, 40, var8);
                this.method1043(-20099, var7, 128, var8 + 1);
                this.method1043(arg1 - 14167, var7 + -1, 2, var8);
            }
            if (arg5 == 3) {
                this.method1043(arg1 ^ 0x59A9, var7, 160, var8);
                this.method1043(arg1 ^ 0x59A9, var7 - 1, 2, var8);
                this.method1043(-20099, var7, 8, var8 - 1);
            }
        }
        if (!arg0) {
            return;
        }
        if (arg4 == 0) {
            if (arg5 == 0) {
                this.method1043(arg1 ^ 0x59A9, var7, 65536, var8);
                this.method1043(-20099, var7, 4096, var8 - 1);
            }
            if (arg5 == 1) {
                this.method1043(-20099, var7, 1024, var8);
                this.method1043(-20099, var7 + 1, 16384, var8);
            }
            if (arg5 == 2) {
                this.method1043(arg1 - 14167, var7, 4096, var8);
                this.method1043(-20099, var7, 65536, var8 + 1);
            }
            if (arg5 == 3) {
                this.method1043(-20099, var7, 16384, var8);
                this.method1043(arg1 ^ 0x59A9, var7 - 1, 1024, var8);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg5 == 0) {
                this.method1043(-20099, var7, 512, var8);
                this.method1043(-20099, var7 + 1, 8192, var8 - 1);
            }
            if (arg5 == 1) {
                this.method1043(-20099, var7, 2048, var8);
                this.method1043(-20099, var7 + 1, 32768, var8 + 1);
            }
            if (arg5 == 2) {
                this.method1043(arg1 ^ 0x59A9, var7, 8192, var8);
                this.method1043(arg1 ^ 0x59A9, var7 - 1, 512, var8 + 1);
            }
            if (arg5 == 3) {
                this.method1043(arg1 ^ 0x59A9, var7, 32768, var8);
                this.method1043(-20099, var7 - 1, 2048, var8 - 1);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method1043(-20099, var7, 66560, var8);
            this.method1043(-20099, var7, 4096, var8 - 1);
            this.method1043(-20099, var7 + 1, 16384, var8);
        }
        if (arg5 == 1) {
            this.method1043(-20099, var7, 5120, var8);
            this.method1043(-20099, var7 + 1, 16384, var8);
            this.method1043(-20099, var7, 65536, var8 + 1);
        }
        if (arg5 == 2) {
            this.method1043(arg1 - 14167, var7, 20480, var8);
            this.method1043(-20099, var7, 65536, var8 + 1);
            this.method1043(arg1 ^ 0x59A9, var7 - 1, 1024, var8);
        }
        if (arg5 == 3) {
            this.method1043(arg1 - 14167, var7, 81920, var8);
            this.method1043(-20099, var7 - 1, 1024, var8);
            this.method1043(-20099, var7, 4096, var8 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIBIIII)Z")
    public final boolean method1047(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        field3228++;
        if (arg4 == arg5 && arg0 == arg3) {
            return true;
        }
        int var8 = -1 / ((74 - arg2) / 32);
        int var9 = arg4 - this.field3234;
        int var10 = arg5 - this.field3234;
        int var11 = arg0 - this.field3214;
        int var12 = arg3 - this.field3214;
        if (arg6 == 6 || arg6 == 7) {
            if (arg6 == 7) {
                arg1 = arg1 + 2 & 0x3;
            }
            if (arg1 == 0) {
                if (var10 + 1 == var9 && var11 == var12 && (this.field3230[var9][var12] & 0x80) == 0) {
                    return true;
                }
                if (var9 == var10 && var11 - 1 == var12 && (this.field3230[var9][var12] & 0x2) == 0) {
                    return true;
                }
            } else if (arg1 == 1) {
                if (var10 - 1 == var9 && var11 == var12 && (this.field3230[var9][var12] & 0x8) == 0) {
                    return true;
                }
                if (var9 == var10 && var11 - 1 == var12 && (this.field3230[var9][var12] & 0x2) == 0) {
                    return true;
                }
            } else if (arg1 == 2) {
                if (var10 - 1 == var9 && var11 == var12 && (this.field3230[var9][var12] & 0x8) == 0) {
                    return true;
                }
                if (var9 == var10 && var11 + 1 == var12 && (this.field3230[var9][var12] & 0x20) == 0) {
                    return true;
                }
            } else if (arg1 == 3) {
                if (var10 + 1 == var9 && var11 == var12 && (this.field3230[var9][var12] & 0x80) == 0) {
                    return true;
                }
                if (var9 == var10 && var11 + 1 == var12 && (this.field3230[var9][var12] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg6 == 8) {
            if (var9 == var10 && var11 + 1 == var12 && (this.field3230[var9][var12] & 0x20) == 0) {
                return true;
            }
            if (var9 == var10 && var11 - 1 == var12 && (this.field3230[var9][var12] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var9 && var11 == var12 && (this.field3230[var9][var12] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var9 && var11 == var12 && (this.field3230[var9][var12] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(III)V")
    public final void method1048(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field3234;
        field3216++;
        if (arg0 >= -12) {
            this.field3214 = 94;
        }
        int var5 = arg1 - this.field3214;
        this.field3230[var4][var5] = class16.method135(this.field3230[var4][var5], -262145);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method1049(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3224++;
        int var9 = arg4 + arg7 - 1;
        int var10 = arg1 + arg6 - 1;
        if (arg6 <= arg2 && arg2 <= var10 && arg5 >= arg7 && arg5 <= var9) {
            return true;
        } else if (arg6 - 1 == arg2 && arg5 >= arg7 && arg5 <= var9 && (this.field3230[arg2 - this.field3234][arg5 - this.field3214] & 0x8) == 0 && (arg0 & 0x8) == 0) {
            return true;
        } else if (var10 + 1 == arg2 && arg5 >= arg7 && var9 >= arg5 && (this.field3230[arg2 - this.field3234][arg5 - this.field3214] & 0x80) == 0 && (arg0 & 0x2) == 0) {
            return true;
        } else if (arg3 + arg7 == arg5 && arg2 >= arg6 && var10 >= arg2 && (this.field3230[arg2 - this.field3234][arg5 - this.field3214] & 0x2) == 0 && (arg0 & 0x4) == 0) {
            return true;
        } else {
            return var9 + 1 == arg5 && arg2 >= arg6 && arg2 <= var10 && (this.field3230[arg2 - this.field3234][arg5 - this.field3214] & 0x20) == 0 && (arg0 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(IIII)V")
    private final void method1050(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 1) {
            field3233 = null;
        }
        this.field3230[arg3][arg2] = class96.method763(this.field3230[arg3][arg2], arg0);
        field3221++;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V")
    public final void method1051(int arg0) {
        field3215++;
        if (arg0 != 18580) {
            field3244 = 40;
        }
        for (int var2 = 0; var2 < this.field3212; var2++) {
            for (int var3 = 0; var3 < this.field3239; var3++) {
                if (var2 == 0 || var3 == 0 || this.field3212 - 1 == var2 || this.field3239 - 1 == var3) {
                    this.field3230[var2][var3] = 16777215;
                } else {
                    this.field3230[var2][var3] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IZIIIII)Z")
    public final boolean method1052(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!arg1) {
            this.method1057(false, 76, 39, 110, 9, 78, 30);
        }
        field3232++;
        if (arg0 == arg2 && arg3 == arg4) {
            return true;
        }
        int var8 = arg2 - this.field3234;
        int var9 = arg0 - this.field3234;
        int var10 = arg4 - this.field3214;
        int var11 = arg3 - this.field3214;
        if (arg5 == 0) {
            if (arg6 == 0) {
                if (var9 - 1 == var8 && var10 == var11) {
                    return true;
                }
                if (var8 == var9 && var11 + 1 == var10 && (this.field3230[var8][var10] & 0x12C0120) == 0) {
                    return true;
                }
                if (var8 == var9 && var11 - 1 == var10 && (this.field3230[var8][var10] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg6 == 1) {
                if (var8 == var9 && var11 + 1 == var10) {
                    return true;
                }
                if (var9 - 1 == var8 && var10 == var11 && (this.field3230[var8][var10] & 0x12C0108) == 0) {
                    return true;
                }
                if (var9 + 1 == var8 && var10 == var11 && (this.field3230[var8][var10] & 0x12C0180) == 0) {
                    return true;
                }
            } else if (arg6 == 2) {
                if (var9 + 1 == var8 && var10 == var11) {
                    return true;
                }
                if (var8 == var9 && var11 + 1 == var10 && (this.field3230[var8][var10] & 0x12C0120) == 0) {
                    return true;
                }
                if (var8 == var9 && var11 - 1 == var10 && (this.field3230[var8][var10] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg6 == 3) {
                if (var8 == var9 && var11 - 1 == var10) {
                    return true;
                }
                if (var9 - 1 == var8 && var10 == var11 && (this.field3230[var8][var10] & 0x12C0108) == 0) {
                    return true;
                }
                if (var9 + 1 == var8 && var10 == var11 && (this.field3230[var8][var10] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        if (arg5 == 2) {
            if (arg6 == 0) {
                if (var9 - 1 == var8 && var10 == var11) {
                    return true;
                }
                if (var8 == var9 && var11 + 1 == var10) {
                    return true;
                }
                if (var9 + 1 == var8 && var10 == var11 && (this.field3230[var8][var10] & 0x12C0180) == 0) {
                    return true;
                }
                if (var8 == var9 && var11 - 1 == var10 && (this.field3230[var8][var10] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg6 == 1) {
                if (var9 - 1 == var8 && var10 == var11 && (this.field3230[var8][var10] & 0x12C0108) == 0) {
                    return true;
                }
                if (var8 == var9 && var11 + 1 == var10) {
                    return true;
                }
                if (var9 + 1 == var8 && var10 == var11) {
                    return true;
                }
                if (var8 == var9 && var11 - 1 == var10 && (this.field3230[var8][var10] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg6 == 2) {
                if (var9 - 1 == var8 && var10 == var11 && (this.field3230[var8][var10] & 0x12C0108) == 0) {
                    return true;
                }
                if (var8 == var9 && var11 + 1 == var10 && (this.field3230[var8][var10] & 0x12C0120) == 0) {
                    return true;
                }
                if (var9 + 1 == var8 && var10 == var11) {
                    return true;
                }
                if (var8 == var9 && var11 - 1 == var10) {
                    return true;
                }
            } else if (arg6 == 3) {
                if (var9 - 1 == var8 && var10 == var11) {
                    return true;
                }
                if (var8 == var9 && var11 + 1 == var10 && (this.field3230[var8][var10] & 0x12C0120) == 0) {
                    return true;
                }
                if (var9 + 1 == var8 && var10 == var11 && (this.field3230[var8][var10] & 0x12C0180) == 0) {
                    return true;
                }
                if (var8 == var9 && var11 - 1 == var10) {
                    return true;
                }
            }
        }
        if (arg5 == 9) {
            if (var8 == var9 && var11 + 1 == var10 && (this.field3230[var8][var10] & 0x20) == 0) {
                return true;
            }
            if (var8 == var9 && var11 - 1 == var10 && (this.field3230[var8][var10] & 0x2) == 0) {
                return true;
            }
            if (var9 - 1 == var8 && var10 == var11 && (this.field3230[var8][var10] & 0x8) == 0) {
                return true;
            }
            if (var9 + 1 == var8 && var10 == var11 && (this.field3230[var8][var10] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(ZIIIII)V")
    public final void method1053(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - this.field3234;
        int var8 = arg4 - this.field3214;
        if (arg5 == 0) {
            if (arg3 == 0) {
                this.method1050(128, arg1 ^ 0x3, var8, var7);
                this.method1050(8, 1, var8, var7 - 1);
            }
            if (arg3 == 1) {
                this.method1050(2, arg1 - 1, var8, var7);
                this.method1050(32, 1, var8 + 1, var7);
            }
            if (arg3 == 2) {
                this.method1050(8, 1, var8, var7);
                this.method1050(128, 1, var8, var7 + 1);
            }
            if (arg3 == 3) {
                this.method1050(32, 1, var8, var7);
                this.method1050(2, arg1 - 1, var8 + -1, var7);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg3 == 0) {
                this.method1050(1, 1, var8, var7);
                this.method1050(16, arg1 ^ 0x3, var8 + 1, var7 - 1);
            }
            if (arg3 == 1) {
                this.method1050(4, 1, var8, var7);
                this.method1050(64, 1, var8 + 1, var7 - -1);
            }
            if (arg3 == 2) {
                this.method1050(16, 1, var8, var7);
                this.method1050(1, 1, var8 - 1, var7 + 1);
            }
            if (arg3 == 3) {
                this.method1050(64, arg1 - 1, var8, var7);
                this.method1050(4, 1, var8 - 1, var7 + -1);
            }
        }
        if (arg5 == 2) {
            if (arg3 == 0) {
                this.method1050(130, 1, var8, var7);
                this.method1050(8, 1, var8, var7 - 1);
                this.method1050(32, 1, var8 + 1, var7);
            }
            if (arg3 == 1) {
                this.method1050(10, arg1 ^ 0x3, var8, var7);
                this.method1050(32, 1, var8 + 1, var7);
                this.method1050(128, 1, var8, var7 + 1);
            }
            if (arg3 == 2) {
                this.method1050(40, 1, var8, var7);
                this.method1050(128, 1, var8, var7 + 1);
                this.method1050(2, 1, var8 - 1, var7);
            }
            if (arg3 == 3) {
                this.method1050(160, 1, var8, var7);
                this.method1050(2, 1, var8 - 1, var7);
                this.method1050(8, 1, var8, var7 - 1);
            }
        }
        if (arg0) {
            if (arg5 == 0) {
                if (arg3 == 0) {
                    this.method1050(65536, 1, var8, var7);
                    this.method1050(4096, 1, var8, var7 - 1);
                }
                if (arg3 == 1) {
                    this.method1050(1024, 1, var8, var7);
                    this.method1050(16384, 1, var8 + 1, var7);
                }
                if (arg3 == 2) {
                    this.method1050(4096, arg1 - 1, var8, var7);
                    this.method1050(65536, 1, var8, var7 + 1);
                }
                if (arg3 == 3) {
                    this.method1050(16384, arg1 - 1, var8, var7);
                    this.method1050(1024, arg1 - 1, var8 - 1, var7);
                }
            }
            if (arg5 == 1 || arg5 == 3) {
                if (arg3 == 0) {
                    this.method1050(512, arg1 ^ 0x3, var8, var7);
                    this.method1050(8192, 1, var8 + 1, var7 - 1);
                }
                if (arg3 == 1) {
                    this.method1050(2048, 1, var8, var7);
                    this.method1050(32768, arg1 - 1, var8 + 1, var7 + 1);
                }
                if (arg3 == 2) {
                    this.method1050(8192, arg1 - 1, var8, var7);
                    this.method1050(512, 1, var8 - 1, var7 - -1);
                }
                if (arg3 == 3) {
                    this.method1050(32768, arg1 ^ 0x3, var8, var7);
                    this.method1050(2048, arg1 - 1, var8 + -1, var7 - 1);
                }
            }
            if (arg5 == 2) {
                if (arg3 == 0) {
                    this.method1050(66560, 1, var8, var7);
                    this.method1050(4096, 1, var8, var7 - 1);
                    this.method1050(16384, 1, var8 + 1, var7);
                }
                if (arg3 == 1) {
                    this.method1050(5120, arg1 ^ 0x3, var8, var7);
                    this.method1050(16384, 1, var8 + 1, var7);
                    this.method1050(65536, 1, var8, var7 + 1);
                }
                if (arg3 == 2) {
                    this.method1050(20480, arg1 - 1, var8, var7);
                    this.method1050(65536, 1, var8, var7 + 1);
                    this.method1050(1024, 1, var8 - 1, var7);
                }
                if (arg3 == 3) {
                    this.method1050(81920, arg1 - 1, var8, var7);
                    this.method1050(1024, 1, var8 - 1, var7);
                    this.method1050(4096, 1, var8, var7 - 1);
                }
            }
        }
        field3217++;
        if (arg1 != 2) {
            this.method1053(true, 27, -22, 85, 72, -30);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V")
    public static void method1054(byte arg0) {
        field3226 = null;
        field3233 = null;
        field3245 = null;
        field3242 = null;
        field3222 = null;
        field3219 = null;
        if (arg0 > 58) {
            field3240 = null;
            field3243 = null;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lmd;II)V")
    public static final void method1055(class87 arg0, int arg1, int arg2) {
        field3231++;
        class87.method687(arg0.field1998, arg1, arg0.field1960, (byte) -79);
        if (arg2 != 21395) {
            field3241 = -53;
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(B)V")
    public static final void method1056(byte arg0) {
        field3238++;
        if (class121.field2891 != 0) {
            return;
        }
        class27.field531 = 1;
        class82.field1884[0] = class153.field3781;
        class3.field54[0] = 1001;
        if (field3227 != -1) {
            class85.field1924 = -1;
            class134.field3169 = -1;
            class31.method255(0, field3227, 0, 0, class18.field274, 765, class143.field3504, -29013, 503);
            class90.field2209 = class85.field1924;
            class116.field2757 = class134.field3169;
            return;
        }
        boolean var1 = false;
        if (arg0 != 18) {
            field3245 = null;
        }
        class91.method721(arg0 - 50);
        class85.field1924 = -1;
        class134.field3169 = -1;
        if (class143.field3504 > 4 && class18.field274 > 4 && class143.field3504 < 516 && class18.field274 < 338) {
            if (class96.field2316 == -1) {
                class75.method539((byte) -126);
            } else {
                class31.method255(4, class96.field2316, 0, 4, class18.field274, 516, class143.field3504, -29013, 338);
            }
        }
        class116.field2757 = class134.field3169;
        class90.field2209 = class85.field1924;
        class85.field1924 = -1;
        class134.field3169 = -1;
        if (class143.field3504 > 553 && class18.field274 > 205 && class143.field3504 < 743 && class18.field274 < 466) {
            if (class140.field3343 != -1) {
                class31.method255(553, class140.field3343, 1, 205, class18.field274, 743, class143.field3504, -29013, 466);
            } else if (class27.field529[class64.field1281] != -1) {
                class31.method255(553, class27.field529[class64.field1281], 1, 205, class18.field274, 743, class143.field3504, arg0 ^ 0xFFFF8EB9, 466);
            }
        }
        if (class85.field1924 != class47.field949) {
            class139.field3310 = true;
            class47.field949 = class85.field1924;
        }
        if (class90.field2215 != class134.field3169) {
            class90.field2215 = class134.field3169;
            class139.field3310 = true;
        }
        class134.field3169 = -1;
        class85.field1924 = -1;
        if (class143.field3504 > 17 && class18.field274 > 357 && class143.field3504 < 496 && class18.field274 < 453) {
            if (class95.field2288 != -1) {
                class31.method255(17, class95.field2288, 2, 357, class18.field274, 496, class143.field3504, -29013, 453);
            } else if (class152.field3738 != -1) {
                class31.method255(17, class152.field3738, 3, 357, class18.field274, 496, class143.field3504, -29013, 453);
            } else if (class18.field274 < 434 && class143.field3504 < 426) {
                class95.method749(class18.field274 - 357, (byte) 75, class143.field3504 - 17);
            }
        }
        if ((class95.field2288 != -1 || class152.field3738 != -1) && class85.field1924 != class72.field1585) {
            class87.field1993 = true;
            class72.field1585 = class85.field1924;
        }
        if ((class95.field2288 != -1 || class152.field3738 != -1) && class134.field3169 != class107.field2544) {
            class87.field1993 = true;
            class107.field2544 = class134.field3169;
        }
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class27.field531 - 1; var2++) {
                if (class3.field54[var2] < 1000 && class3.field54[var2 + 1] > 1000) {
                    var1 = false;
                    class117 var3 = class82.field1884[var2];
                    class82.field1884[var2] = class82.field1884[var2 + 1];
                    class82.field1884[var2 + 1] = var3;
                    int var4 = class3.field54[var2];
                    class3.field54[var2] = class3.field54[var2 + 1];
                    class3.field54[var2 + 1] = var4;
                    int var5 = class107.field2552[var2];
                    class107.field2552[var2] = class107.field2552[var2 + 1];
                    class107.field2552[var2 + 1] = var5;
                    int var6 = class136.field3255[var2];
                    class136.field3255[var2] = class136.field3255[var2 + 1];
                    class136.field3255[var2 + 1] = var6;
                    int var7 = class60.field1197[var2];
                    class60.field1197[var2] = class60.field1197[var2 + 1];
                    class60.field1197[var2 + 1] = var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ZIIIIII)V")
    public final void method1057(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = arg5 - this.field3214;
        field3237++;
        if (arg4 == 1 || arg4 == 3) {
            int var9 = arg3;
            arg3 = arg1;
            arg1 = var9;
        }
        int var10 = arg6 - this.field3234;
        int var11 = 256;
        if (arg0) {
            var11 += 131072;
        }
        for (int var12 = var10; var12 < arg3 + var10; var12++) {
            if (var12 >= 0 && this.field3212 > var12) {
                for (int var13 = var8; var13 < var8 + arg1; var13++) {
                    if (var13 >= 0 && var13 < this.field3239) {
                        this.method1043(-20099, var13, var11, var12);
                    }
                }
            }
        }
        if (arg2 != 25027) {
            method1055(null, 33, 30);
        }
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(II)V")
    public class135(int arg0, int arg1) {
        this.field3239 = arg1;
        this.field3212 = arg0;
        this.field3230 = new int[this.field3212][this.field3239];
        this.method1051(18580);
    }
}
