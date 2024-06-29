import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class83 {

    @OriginalMember(owner = "client!m", name = "F", descriptor = "I")
    private int field1980;

    @OriginalMember(owner = "client!m", name = "p", descriptor = "I")
    private int field1964;

    @OriginalMember(owner = "client!m", name = "f", descriptor = "I")
    private int field1954;

    @OriginalMember(owner = "client!m", name = "v", descriptor = "I")
    private int field1970;

    @OriginalMember(owner = "client!m", name = "x", descriptor = "[[I")
    public int[][] field1972;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "Ltd;")
    private static class136 field1949 = class145.method1172("wave2:", 45);

    @OriginalMember(owner = "client!m", name = "t", descriptor = "I")
    public static int field1968 = 127;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "Ltd;")
    public static class136 field1953 = class145.method1172(" )2>", 45);

    @OriginalMember(owner = "client!m", name = "o", descriptor = "[I")
    public static int[] field1963 = new int[2000];

    @OriginalMember(owner = "client!m", name = "g", descriptor = "Ltd;")
    public static class136 field1955 = field1949;

    @OriginalMember(owner = "client!m", name = "y", descriptor = "I")
    public static int field1973 = 0;

    @OriginalMember(owner = "client!m", name = "A", descriptor = "I")
    public static int field1975 = 0;

    @OriginalMember(owner = "client!m", name = "C", descriptor = "I")
    public static int field1977 = 0;

    @OriginalMember(owner = "client!m", name = "i", descriptor = "Ltd;")
    public static class136 field1957 = class145.method1172("Lade Texturen )2 ", 45);

    @OriginalMember(owner = "client!m", name = "D", descriptor = "Ltd;")
    public static class136 field1978 = field1949;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "I")
    public static int field1950;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!m", name = "d", descriptor = "I")
    public static int field1952;

    @OriginalMember(owner = "client!m", name = "h", descriptor = "I")
    public static int field1956;

    @OriginalMember(owner = "client!m", name = "j", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!m", name = "k", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!m", name = "l", descriptor = "I")
    public static int field1960;

    @OriginalMember(owner = "client!m", name = "m", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!m", name = "n", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!m", name = "q", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!m", name = "r", descriptor = "I")
    public static int field1966;

    @OriginalMember(owner = "client!m", name = "s", descriptor = "I")
    public static int field1967;

    @OriginalMember(owner = "client!m", name = "u", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!m", name = "w", descriptor = "I")
    public static int field1971;

    @OriginalMember(owner = "client!m", name = "z", descriptor = "I")
    public static int field1974;

    @OriginalMember(owner = "client!m", name = "B", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!m", name = "E", descriptor = "I")
    public static int field1979;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIIIBII)Z")
    public final boolean method613(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        field1958++;
        int var9 = arg6 + arg3 - 1;
        int var10 = arg2 + arg7 - 1;
        if (arg7 <= arg4 && var10 >= arg4 && arg1 >= arg6 && arg1 <= var9) {
            return true;
        } else if (arg7 - 1 == arg4 && arg6 <= arg1 && var9 >= arg1 && (this.field1972[arg4 - this.field1964][arg1 - this.field1970] & 0x8) == 0 && (arg0 & 0x8) == 0) {
            return true;
        } else if (var10 + 1 == arg4 && arg1 >= arg6 && arg1 <= var9 && (this.field1972[arg4 - this.field1964][arg1 - this.field1970] & 0x80) == 0 && (arg0 & 0x2) == 0) {
            return true;
        } else {
            if (arg5 >= -115) {
                this.method624(-26, -18, -74, true, 59, -86, 79);
            }
            if (arg6 - 1 == arg1 && arg4 >= arg7 && arg4 <= var10 && (this.field1972[arg4 - this.field1964][arg1 - this.field1970] & 0x2) == 0 && (arg0 & 0x4) == 0) {
                return true;
            } else {
                return var9 + 1 == arg1 && arg4 >= arg7 && arg4 <= var10 && (this.field1972[arg4 - this.field1964][arg1 - this.field1970] & 0x20) == 0 && (arg0 & 0x1) == 0;
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ZIIIIIZ)V")
    public final void method614(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        int var8 = arg4 - this.field1964;
        int var9 = arg5 - this.field1970;
        field1959++;
        if (arg2 == 1 || arg2 == 3) {
            int var10 = arg1;
            arg1 = arg3;
            arg3 = var10;
        }
        int var11 = 256;
        if (!arg6) {
            this.method623(-125, 80, -8, -21);
        }
        if (arg0) {
            var11 += 131072;
        }
        for (int var12 = var8; var12 < arg1 + var8; var12++) {
            if (var12 >= 0 && this.field1980 > var12) {
                for (int var13 = var9; var13 < arg3 + var9; var13++) {
                    if (var13 >= 0 && this.field1954 > var13) {
                        this.method623(var11, -2, var13, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ZIBIII)V")
    public final void method615(boolean arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        if (arg2 < 44) {
            field1978 = null;
        }
        int var7 = arg4 - this.field1970;
        int var8 = arg3 - this.field1964;
        if (arg1 == 0) {
            if (arg5 == 0) {
                this.method623(128, -2, var7, var8);
                this.method623(8, -2, var7, var8 - 1);
            }
            if (arg5 == 1) {
                this.method623(2, -2, var7, var8);
                this.method623(32, -2, var7 + 1, var8);
            }
            if (arg5 == 2) {
                this.method623(8, -2, var7, var8);
                this.method623(128, -2, var7, var8 + 1);
            }
            if (arg5 == 3) {
                this.method623(32, -2, var7, var8);
                this.method623(2, -2, var7 - 1, var8);
            }
        }
        field1966++;
        if (arg1 == 1 || arg1 == 3) {
            if (arg5 == 0) {
                this.method623(1, -2, var7, var8);
                this.method623(16, -2, var7 + 1, var8 + -1);
            }
            if (arg5 == 1) {
                this.method623(4, -2, var7, var8);
                this.method623(64, -2, var7 + 1, var8 + 1);
            }
            if (arg5 == 2) {
                this.method623(16, -2, var7, var8);
                this.method623(1, -2, var7 - 1, var8 + 1);
            }
            if (arg5 == 3) {
                this.method623(64, -2, var7, var8);
                this.method623(4, -2, var7 - 1, var8 - 1);
            }
        }
        if (arg1 == 2) {
            if (arg5 == 0) {
                this.method623(130, -2, var7, var8);
                this.method623(8, -2, var7, var8 - 1);
                this.method623(32, -2, var7 + 1, var8);
            }
            if (arg5 == 1) {
                this.method623(10, -2, var7, var8);
                this.method623(32, -2, var7 + 1, var8);
                this.method623(128, -2, var7, var8 + 1);
            }
            if (arg5 == 2) {
                this.method623(40, -2, var7, var8);
                this.method623(128, -2, var7, var8 + 1);
                this.method623(2, -2, var7 - 1, var8);
            }
            if (arg5 == 3) {
                this.method623(160, -2, var7, var8);
                this.method623(2, -2, var7 - 1, var8);
                this.method623(8, -2, var7, var8 - 1);
            }
        }
        if (!arg0) {
            return;
        }
        if (arg1 == 0) {
            if (arg5 == 0) {
                this.method623(65536, -2, var7, var8);
                this.method623(4096, -2, var7, var8 - 1);
            }
            if (arg5 == 1) {
                this.method623(1024, -2, var7, var8);
                this.method623(16384, -2, var7 + 1, var8);
            }
            if (arg5 == 2) {
                this.method623(4096, -2, var7, var8);
                this.method623(65536, -2, var7, var8 + 1);
            }
            if (arg5 == 3) {
                this.method623(16384, -2, var7, var8);
                this.method623(1024, -2, var7 - 1, var8);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg5 == 0) {
                this.method623(512, -2, var7, var8);
                this.method623(8192, -2, var7 + 1, var8 + -1);
            }
            if (arg5 == 1) {
                this.method623(2048, -2, var7, var8);
                this.method623(32768, -2, var7 + 1, var8 - -1);
            }
            if (arg5 == 2) {
                this.method623(8192, -2, var7, var8);
                this.method623(512, -2, var7 - 1, var8 + 1);
            }
            if (arg5 == 3) {
                this.method623(32768, -2, var7, var8);
                this.method623(2048, -2, var7 - 1, var8 + -1);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method623(66560, -2, var7, var8);
            this.method623(4096, -2, var7, var8 - 1);
            this.method623(16384, -2, var7 + 1, var8);
        }
        if (arg5 == 1) {
            this.method623(5120, -2, var7, var8);
            this.method623(16384, -2, var7 + 1, var8);
            this.method623(65536, -2, var7, var8 + 1);
        }
        if (arg5 == 2) {
            this.method623(20480, -2, var7, var8);
            this.method623(65536, -2, var7, var8 + 1);
            this.method623(1024, -2, var7 - 1, var8);
        }
        if (arg5 == 3) {
            this.method623(81920, -2, var7, var8);
            this.method623(1024, -2, var7 - 1, var8);
            this.method623(4096, -2, var7, var8 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
    public final void method616(int arg0) {
        field1952++;
        for (int var2 = 0; var2 < this.field1980; var2++) {
            for (int var3 = 0; var3 < this.field1954; var3++) {
                if (var2 == 0 || var3 == 0 || this.field1980 - 5 <= var2 || this.field1954 - 5 <= var3) {
                    this.field1972[var2][var3] = 16777215;
                } else {
                    this.field1972[var2][var3] = 16777216;
                }
            }
        }
        if (arg0 != 2) {
            this.method622(73, -111, -118, false, -67, 67, 124);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(III)V")
    public final void method617(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field1970;
        int var5 = arg2 - this.field1964;
        if (arg0 != 4096) {
            this.method616(-17);
        }
        field1961++;
        this.field1972[var5][var4] = class154.method1207(this.field1972[var5][var4], -262145);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIIIII)Z")
    public final boolean method618(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1960++;
        if (arg2 != 128) {
            return true;
        } else if (arg3 == arg5 && arg4 == arg6) {
            return true;
        } else {
            int var8 = arg4 - this.field1970;
            int var9 = arg3 - this.field1964;
            int var10 = arg5 - this.field1964;
            int var11 = arg6 - this.field1970;
            if (arg0 == 6 || arg0 == 7) {
                if (arg0 == 7) {
                    arg1 = arg1 + 2 & 0x3;
                }
                if (arg1 == 0) {
                    if (var10 + 1 == var9 && var8 == var11 && (this.field1972[var9][var8] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var11 - 1 == var8 && (this.field1972[var9][var8] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var10 - 1 == var9 && var8 == var11 && (this.field1972[var9][var8] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var11 - 1 == var8 && (this.field1972[var9][var8] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var10 - 1 == var9 && var8 == var11 && (this.field1972[var9][var8] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var11 + 1 == var8 && (this.field1972[var9][var8] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var10 + 1 == var9 && var8 == var11 && (this.field1972[var9][var8] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var11 + 1 == var8 && (this.field1972[var9][var8] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 8) {
                if (var9 == var10 && var11 + 1 == var8 && (this.field1972[var9][var8] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var10 && var11 - 1 == var8 && (this.field1972[var9][var8] & 0x2) == 0) {
                    return true;
                }
                if (var10 - 1 == var9 && var8 == var11 && (this.field1972[var9][var8] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var9 && var8 == var11 && (this.field1972[var9][var8] & 0x80) == 0) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IBI)V")
    public final void method619(int arg0, byte arg1, int arg2) {
        int var4 = arg2 - this.field1964;
        int var5 = arg0 - this.field1970;
        int var6 = -20 / (arg1 / 51);
        field1969++;
        this.field1972[var4][var5] = class2.method13(this.field1972[var4][var5], 262144);
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(I)V")
    public static void method620(int arg0) {
        field1953 = null;
        field1978 = null;
        field1957 = null;
        if (arg0 >= -53) {
            field1975 = -4;
        }
        field1963 = null;
        field1949 = null;
        field1955 = null;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIII)V")
    private final void method621(int arg0, int arg1, int arg2, int arg3) {
        field1950++;
        this.field1972[arg2][arg3] = class2.method13(this.field1972[arg2][arg3], arg1);
        if (arg0 != 28662) {
            field1957 = null;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIZIII)Z")
    public final boolean method622(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field1971++;
        if (arg2 == arg4 && arg5 == arg6) {
            return true;
        }
        int var8 = arg6 - this.field1970;
        int var9 = arg2 - this.field1964;
        int var10 = arg4 - this.field1964;
        int var11 = arg5 - this.field1970;
        if (arg0 == 0) {
            if (arg1 == 0) {
                if (var10 - 1 == var9 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var8 + 1 == var11 && (this.field1972[var9][var11] & 0x12C0120) == 0) {
                    return true;
                }
                if (var9 == var10 && var8 - 1 == var11 && (this.field1972[var9][var11] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg1 == 1) {
                if (var9 == var10 && var8 + 1 == var11) {
                    return true;
                }
                if (var10 - 1 == var9 && var8 == var11 && (this.field1972[var9][var11] & 0x12C0108) == 0) {
                    return true;
                }
                if (var10 + 1 == var9 && var8 == var11 && (this.field1972[var9][var11] & 0x12C0180) == 0) {
                    return true;
                }
            } else if (arg1 == 2) {
                if (var10 + 1 == var9 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var8 + 1 == var11 && (this.field1972[var9][var11] & 0x12C0120) == 0) {
                    return true;
                }
                if (var9 == var10 && var8 - 1 == var11 && (this.field1972[var9][var11] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg1 == 3) {
                if (var9 == var10 && var8 - 1 == var11) {
                    return true;
                }
                if (var10 - 1 == var9 && var8 == var11 && (this.field1972[var9][var11] & 0x12C0108) == 0) {
                    return true;
                }
                if (var10 + 1 == var9 && var8 == var11 && (this.field1972[var9][var11] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        if (!arg3) {
            field1953 = null;
        }
        if (arg0 == 2) {
            if (arg1 == 0) {
                if (var10 - 1 == var9 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var8 + 1 == var11) {
                    return true;
                }
                if (var10 + 1 == var9 && var8 == var11 && (this.field1972[var9][var11] & 0x12C0180) == 0) {
                    return true;
                }
                if (var9 == var10 && var8 - 1 == var11 && (this.field1972[var9][var11] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg1 == 1) {
                if (var10 - 1 == var9 && var8 == var11 && (this.field1972[var9][var11] & 0x12C0108) == 0) {
                    return true;
                }
                if (var9 == var10 && var8 + 1 == var11) {
                    return true;
                }
                if (var10 + 1 == var9 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var8 - 1 == var11 && (this.field1972[var9][var11] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg1 == 2) {
                if (var10 - 1 == var9 && var8 == var11 && (this.field1972[var9][var11] & 0x12C0108) == 0) {
                    return true;
                }
                if (var9 == var10 && var8 + 1 == var11 && (this.field1972[var9][var11] & 0x12C0120) == 0) {
                    return true;
                }
                if (var10 + 1 == var9 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var8 - 1 == var11) {
                    return true;
                }
            } else if (arg1 == 3) {
                if (var10 - 1 == var9 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var8 + 1 == var11 && (this.field1972[var9][var11] & 0x12C0120) == 0) {
                    return true;
                }
                if (var10 + 1 == var9 && var8 == var11 && (this.field1972[var9][var11] & 0x12C0180) == 0) {
                    return true;
                }
                if (var9 == var10 && var8 - 1 == var11) {
                    return true;
                }
            }
        }
        if (arg0 == 9) {
            if (var9 == var10 && var8 + 1 == var11 && (this.field1972[var9][var11] & 0x20) == 0) {
                return true;
            }
            if (var9 == var10 && var8 - 1 == var11 && (this.field1972[var9][var11] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var9 && var8 == var11 && (this.field1972[var9][var11] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var9 && var8 == var11 && (this.field1972[var9][var11] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(IIII)V")
    private final void method623(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != -2) {
            field1963 = null;
        }
        this.field1972[arg3][arg2] = class154.method1207(this.field1972[arg3][arg2], ~arg0);
        field1956++;
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(IIIZIII)V")
    public final void method624(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        int var8 = arg2 - this.field1970;
        int var9 = arg4 - this.field1964;
        field1967++;
        int var10 = 256;
        if (arg1 == 1 || arg1 == 3) {
            int var11 = arg0;
            arg0 = arg5;
            arg5 = var11;
        }
        if (arg3) {
            var10 += 131072;
        }
        if (arg6 <= 126) {
            field1955 = null;
        }
        for (int var12 = var9; var12 < arg0 + var9; var12++) {
            if (var12 >= 0 && this.field1980 > var12) {
                for (int var13 = var8; var13 < arg5 + var8; var13++) {
                    if (var13 >= 0 && this.field1954 > var13) {
                        this.method621(28662, var10, var12, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIIZI)V")
    public final void method625(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field1962++;
        int var7 = arg3 - this.field1970;
        int var8 = arg0 - this.field1964;
        if (arg1 == 0) {
            if (arg5 == 0) {
                this.method621(28662, 128, var8, var7);
                this.method621(28662, 8, var8 - 1, var7);
            }
            if (arg5 == 1) {
                this.method621(28662, 2, var8, var7);
                this.method621(28662, 32, var8, var7 + 1);
            }
            if (arg5 == 2) {
                this.method621(28662, 8, var8, var7);
                this.method621(28662, 128, var8 + 1, var7);
            }
            if (arg5 == 3) {
                this.method621(28662, 32, var8, var7);
                this.method621(28662, 2, var8, var7 - 1);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg5 == 0) {
                this.method621(28662, 1, var8, var7);
                this.method621(28662, 16, var8 - 1, var7 + 1);
            }
            if (arg5 == 1) {
                this.method621(28662, 4, var8, var7);
                this.method621(28662, 64, var8 + 1, var7 + 1);
            }
            if (arg5 == 2) {
                this.method621(28662, 16, var8, var7);
                this.method621(28662, 1, var8 + 1, var7 + -1);
            }
            if (arg5 == 3) {
                this.method621(28662, 64, var8, var7);
                this.method621(28662, 4, var8 - 1, var7 + -1);
            }
        }
        int var9 = -26 / ((arg2 + 65) / 32);
        if (arg1 == 2) {
            if (arg5 == 0) {
                this.method621(28662, 130, var8, var7);
                this.method621(28662, 8, var8 - 1, var7);
                this.method621(28662, 32, var8, var7 + 1);
            }
            if (arg5 == 1) {
                this.method621(28662, 10, var8, var7);
                this.method621(28662, 32, var8, var7 + 1);
                this.method621(28662, 128, var8 + 1, var7);
            }
            if (arg5 == 2) {
                this.method621(28662, 40, var8, var7);
                this.method621(28662, 128, var8 + 1, var7);
                this.method621(28662, 2, var8, var7 - 1);
            }
            if (arg5 == 3) {
                this.method621(28662, 160, var8, var7);
                this.method621(28662, 2, var8, var7 - 1);
                this.method621(28662, 8, var8 - 1, var7);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg1 == 0) {
            if (arg5 == 0) {
                this.method621(28662, 65536, var8, var7);
                this.method621(28662, 4096, var8 - 1, var7);
            }
            if (arg5 == 1) {
                this.method621(28662, 1024, var8, var7);
                this.method621(28662, 16384, var8, var7 + 1);
            }
            if (arg5 == 2) {
                this.method621(28662, 4096, var8, var7);
                this.method621(28662, 65536, var8 + 1, var7);
            }
            if (arg5 == 3) {
                this.method621(28662, 16384, var8, var7);
                this.method621(28662, 1024, var8, var7 - 1);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg5 == 0) {
                this.method621(28662, 512, var8, var7);
                this.method621(28662, 8192, var8 - 1, var7 + 1);
            }
            if (arg5 == 1) {
                this.method621(28662, 2048, var8, var7);
                this.method621(28662, 32768, var8 + 1, var7 + 1);
            }
            if (arg5 == 2) {
                this.method621(28662, 8192, var8, var7);
                this.method621(28662, 512, var8 + 1, var7 + -1);
            }
            if (arg5 == 3) {
                this.method621(28662, 32768, var8, var7);
                this.method621(28662, 2048, var8 - 1, var7 + -1);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method621(28662, 66560, var8, var7);
            this.method621(28662, 4096, var8 - 1, var7);
            this.method621(28662, 16384, var8, var7 + 1);
        }
        if (arg5 == 1) {
            this.method621(28662, 5120, var8, var7);
            this.method621(28662, 16384, var8, var7 + 1);
            this.method621(28662, 65536, var8 + 1, var7);
        }
        if (arg5 == 2) {
            this.method621(28662, 20480, var8, var7);
            this.method621(28662, 65536, var8 + 1, var7);
            this.method621(28662, 1024, var8, var7 - 1);
        }
        if (arg5 == 3) {
            this.method621(28662, 81920, var8, var7);
            this.method621(28662, 1024, var8, var7 - 1);
            this.method621(28662, 4096, var8 - 1, var7);
            return;
        }
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(III)V")
    public final void method626(int arg0, int arg1, int arg2) {
        field1979++;
        int var4 = arg1 - this.field1964;
        if (arg2 == 2) {
            int var5 = arg0 - this.field1970;
            this.field1972[var4][var5] = class2.method13(this.field1972[var4][var5], 2097152);
        }
    }

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(I)V")
    public static final void method627(int arg0) {
        Object var1 = class7.field127;
        synchronized (class7.field127) {
            if (~class15.field286 != arg0) {
                class15.field286 = 1;
                try {
                    class7.field127.wait();
                } catch (InterruptedException var2) {
                }
            }
        }
        field1951++;
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(II)V")
    public class83(int arg0, int arg1) {
        this.field1980 = arg0;
        this.field1964 = 0;
        this.field1954 = arg1;
        this.field1970 = 0;
        this.field1972 = new int[this.field1980][this.field1954];
        this.method616(2);
    }
}
