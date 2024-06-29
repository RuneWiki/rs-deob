import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class88 {

    @OriginalMember(owner = "client!me", name = "v", descriptor = "I")
    private int field2062 = 0;

    @OriginalMember(owner = "client!me", name = "A", descriptor = "I")
    private int field2067;

    @OriginalMember(owner = "client!me", name = "x", descriptor = "I")
    private int field2064;

    @OriginalMember(owner = "client!me", name = "p", descriptor = "[[I")
    public int[][] field2056;

    @OriginalMember(owner = "client!me", name = "h", descriptor = "I")
    private int field2048;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "I")
    public static volatile int field2042 = 0;

    @OriginalMember(owner = "client!me", name = "m", descriptor = "Lwd;")
    public static class150 field2053 = class2.method9(true, "Anmelde)2Zeitlimit -Uberschritten)3");

    @OriginalMember(owner = "client!me", name = "s", descriptor = "I")
    public static int field2059 = -1;

    @OriginalMember(owner = "client!me", name = "q", descriptor = "[I")
    public static int[] field2057 = new int[4000];

    @OriginalMember(owner = "client!me", name = "n", descriptor = "J")
    public static long field2054 = 0L;

    @OriginalMember(owner = "client!me", name = "u", descriptor = "I")
    public static int field2061 = 0;

    @OriginalMember(owner = "client!me", name = "t", descriptor = "Lwd;")
    public static class150 field2060 = class2.method9(true, "(U1");

    @OriginalMember(owner = "client!me", name = "d", descriptor = "Lwd;")
    private static class150 field2044 = class2.method9(true, "Press (Wrecover a locked account(W on front page)3");

    @OriginalMember(owner = "client!me", name = "F", descriptor = "Lwd;")
    public static class150 field2072 = field2044;

    @OriginalMember(owner = "client!me", name = "G", descriptor = "I")
    public static int field2073 = 128;

    @OriginalMember(owner = "client!me", name = "E", descriptor = "Li;")
    public static class56 field2071 = new class56(50);

    @OriginalMember(owner = "client!me", name = "H", descriptor = "I")
    public static int field2074 = 0;

    @OriginalMember(owner = "client!me", name = "I", descriptor = "Lwd;")
    private static class150 field2075 = class2.method9(true, "and choose the (Wcreate account(W");

    @OriginalMember(owner = "client!me", name = "J", descriptor = "I")
    public static int field2076 = 1;

    @OriginalMember(owner = "client!me", name = "K", descriptor = "Lwd;")
    public static class150 field2077 = field2075;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!me", name = "f", descriptor = "I")
    public static int field2046;

    @OriginalMember(owner = "client!me", name = "g", descriptor = "I")
    public static int field2047;

    @OriginalMember(owner = "client!me", name = "i", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!me", name = "j", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!me", name = "k", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!me", name = "l", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!me", name = "o", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!me", name = "r", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!me", name = "w", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "client!me", name = "y", descriptor = "I")
    public static int field2065;

    @OriginalMember(owner = "client!me", name = "z", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!me", name = "B", descriptor = "I")
    public static int field2068;

    @OriginalMember(owner = "client!me", name = "C", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!me", name = "D", descriptor = "I")
    public static int field2070;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIIILva;IIB)V")
    public static final void method620(int arg0, int arg1, int arg2, int arg3, int arg4, class141 arg5, int arg6, int arg7, byte arg8) {
        field2055++;
        if (class68.field1711) {
            class42.field1140 = 32;
        } else {
            class42.field1140 = 0;
        }
        class68.field1711 = false;
        if (arg8 >= -101) {
            method633(null, 57);
        }
        if (arg6 <= arg2 && arg2 < arg6 + 16 && arg4 >= arg0 && arg0 + 16 > arg4) {
            if (arg1 == 1) {
                class82.field1972 = true;
            }
            if (arg1 == 2 || arg1 == 3) {
                class40.field1067 = true;
            }
            arg5.field3309 -= class101.field2289 * 4;
        } else if (arg6 <= arg2 && arg2 < arg6 + 16 && arg0 + arg3 - 16 <= arg4 && arg0 + arg3 > arg4) {
            arg5.field3309 += class101.field2289 * 4;
            if (arg1 == 2 || arg1 == 3) {
                class40.field1067 = true;
            }
            if (arg1 == 1) {
                class82.field1972 = true;
            }
        } else if (arg6 - class42.field1140 <= arg2 && class42.field1140 + arg6 + 16 > arg2 && arg0 + 16 <= arg4 && arg0 + arg3 - 16 > arg4 && class101.field2289 > 0) {
            if (arg1 == 1) {
                class82.field1972 = true;
            }
            class68.field1711 = true;
            if (arg1 == 2 || arg1 == 3) {
                class40.field1067 = true;
            }
            int var9 = (arg3 - 32) * arg3 / arg7;
            if (var9 < 8) {
                var9 = 8;
            }
            int var10 = arg4 - arg0 - var9 / 2 - 16;
            int var11 = arg3 - var9 - 32;
            arg5.field3309 = (arg7 - arg3) * var10 / var11;
        }
        if (class8.field175 == 0) {
            return;
        }
        int var12 = arg5.field3321;
        if (arg1 == -1) {
            var12 = 479;
        }
        if (arg6 - var12 > arg2 || arg0 > arg4 || arg6 + 16 <= arg2 || arg0 + arg3 < arg4) {
            return;
        }
        if (arg1 == 1) {
            class82.field1972 = true;
        }
        arg5.field3309 += class8.field175 * 45;
        if (arg1 == 2 || arg1 == 3) {
            class40.field1067 = true;
        }
        return;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
    public static void method621(int arg0) {
        field2053 = null;
        int var1 = -67 % ((arg0 + 6) / 46);
        field2071 = null;
        field2072 = null;
        field2077 = null;
        field2057 = null;
        field2044 = null;
        field2075 = null;
        field2060 = null;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(B)V")
    public final void method622(byte arg0) {
        int var2 = 105 / ((28 - arg0) / 47);
        for (int var3 = 0; var3 < this.field2064; var3++) {
            for (int var4 = 0; var4 < this.field2067; var4++) {
                if (var3 == 0 || var4 == 0 || this.field2064 - 1 == var3 || this.field2067 - 1 == var4) {
                    this.field2056[var3][var4] = 16777215;
                } else {
                    this.field2056[var3][var4] = 16777216;
                }
            }
        }
        field2043++;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIZI)V")
    private final void method623(int arg0, int arg1, boolean arg2, int arg3) {
        this.field2056[arg3][arg1] = class94.method667(this.field2056[arg3][arg1], 16777215 - arg0);
        field2047++;
        if (!arg2) {
            field2074 = 71;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIBIIZI)V")
    public final void method624(int arg0, int arg1, byte arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field2049++;
        int var8 = 256;
        if (arg5) {
            var8 += 131072;
        }
        int var9 = arg3 - this.field2048;
        if (arg6 == 1 || arg6 == 3) {
            int var10 = arg4;
            arg4 = arg0;
            arg0 = var10;
        }
        int var11 = arg1 - this.field2062;
        if (arg2 != 51) {
            return;
        }
        for (int var12 = var9; var12 < arg4 + var9; var12++) {
            if (var12 >= 0 && this.field2064 > var12) {
                for (int var13 = var11; var13 < arg0 + var11; var13++) {
                    if (var13 >= 0 && var13 < this.field2067) {
                        this.method623(var8, var13, true, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIII)V")
    private final void method625(int arg0, int arg1, int arg2, int arg3) {
        this.field2056[arg1][arg3] = class147.method1100(this.field2056[arg1][arg3], arg0);
        if (arg2 == 17498112) {
            field2063++;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ZBIIIII)V")
    public final void method626(boolean arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = arg5 - this.field2062;
        field2041++;
        if (arg2 == 1 || arg2 == 3) {
            int var9 = arg4;
            arg4 = arg3;
            arg3 = var9;
        }
        int var10 = 256;
        if (arg0) {
            var10 += 131072;
        }
        int var11 = arg6 - this.field2048;
        if (arg1 != 117) {
            field2073 = -27;
        }
        for (int var12 = var11; var12 < var11 + arg4; var12++) {
            if (var12 >= 0 && var12 < this.field2064) {
                for (int var13 = var8; var13 < var8 + arg3; var13++) {
                    if (var13 >= 0 && this.field2067 > var13) {
                        this.method625(var10, var12, 17498112, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIIIII)Z")
    public final boolean method627(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2046++;
        if (arg1 == arg2 && arg3 == arg4) {
            return true;
        }
        int var8 = arg3 - this.field2062;
        int var9 = arg4 - this.field2062;
        int var10 = arg1 - this.field2048;
        if (arg6 != 4344) {
            this.method635(-123, true, 91, -77, 73, -103);
        }
        int var11 = arg2 - this.field2048;
        if (arg0 == 6 || arg0 == 7) {
            if (arg0 == 7) {
                arg5 = arg5 + 2 & 0x3;
            }
            if (arg5 == 0) {
                if (var11 + 1 == var10 && var8 == var9 && (this.field2056[var10][var9] & 0x80) == 0) {
                    return true;
                }
                if (var10 == var11 && var8 - 1 == var9 && (this.field2056[var10][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg5 == 1) {
                if (var11 - 1 == var10 && var8 == var9 && (this.field2056[var10][var9] & 0x8) == 0) {
                    return true;
                }
                if (var10 == var11 && var8 - 1 == var9 && (this.field2056[var10][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg5 == 2) {
                if (var11 - 1 == var10 && var8 == var9 && (this.field2056[var10][var9] & 0x8) == 0) {
                    return true;
                }
                if (var10 == var11 && var8 + 1 == var9 && (this.field2056[var10][var9] & 0x20) == 0) {
                    return true;
                }
            } else if (arg5 == 3) {
                if (var11 + 1 == var10 && var8 == var9 && (this.field2056[var10][var9] & 0x80) == 0) {
                    return true;
                }
                if (var10 == var11 && var8 + 1 == var9 && (this.field2056[var10][var9] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg0 == 8) {
            if (var10 == var11 && var8 + 1 == var9 && (this.field2056[var10][var9] & 0x20) == 0) {
                return true;
            }
            if (var10 == var11 && var8 - 1 == var9 && (this.field2056[var10][var9] & 0x2) == 0) {
                return true;
            }
            if (var11 - 1 == var10 && var8 == var9 && (this.field2056[var10][var9] & 0x8) == 0) {
                return true;
            }
            if (var11 + 1 == var10 && var8 == var9 && (this.field2056[var10][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(III)V")
    public final void method628(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field2048;
        field2068++;
        int var5 = arg2 - this.field2062;
        if (arg1 != 4096) {
            this.method629(-89, -47, -46, -46, -125, 59, -103, -50);
        }
        this.field2056[var4][var5] = class94.method667(this.field2056[var4][var5], 14680063);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method629(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2065++;
        int var9 = arg0 + arg1 - 1;
        int var10 = arg3 + arg6 - 1;
        if (arg1 <= arg2 && arg2 <= var9 && arg7 >= arg3 && var10 >= arg7) {
            return true;
        } else if (arg1 - 1 == arg2 && arg3 <= arg7 && arg7 <= var10 && (this.field2056[arg2 - this.field2048][arg7 - this.field2062] & 0x8) == 0 && (arg4 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg2 && arg3 <= arg7 && arg7 <= var10 && (this.field2056[arg2 - this.field2048][arg7 - this.field2062] & 0x80) == 0 && (arg4 & 0x2) == 0) {
            return true;
        } else if (arg3 + arg5 == arg7 && arg2 >= arg1 && arg2 <= var9 && (this.field2056[arg2 - this.field2048][arg7 - this.field2062] & 0x2) == 0 && (arg4 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg7 && arg2 >= arg1 && arg2 <= var9 && (this.field2056[arg2 - this.field2048][arg7 - this.field2062] & 0x20) == 0 && (arg4 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ZII)V")
    public final void method630(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            this.field2062 = 77;
        }
        int var4 = arg1 - this.field2062;
        int var5 = arg2 - this.field2048;
        this.field2056[var5][var4] = class147.method1100(this.field2056[var5][var4], 2097152);
        field2050++;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lva;B)[I")
    public static final int[] method631(class141 arg0, byte arg1) {
        field2051++;
        int var2 = 56 % ((arg1 - 57) / 63);
        int var3 = arg0.field3323 >> 16;
        if (!class145.method1090(-78, var3)) {
            return null;
        }
        int var4 = arg0.field3304;
        int var5 = arg0.field3353;
        class141 var8;
        for (int var6 = arg0.field3298; var6 != -1; var6 = var8.field3298) {
            var8 = class58.field1500[var3][var6 & 0xFFFF];
            var5 += var8.field3353 - var8.field3309;
            var4 += var8.field3304 - var8.field3390;
        }
        return new int[] { var4, var5 };
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(BIIIIZ)V")
    public final void method632(byte arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2058++;
        int var7 = arg2 - this.field2048;
        int var8 = arg3 - this.field2062;
        if (arg1 == 0) {
            if (arg4 == 0) {
                this.method625(128, var7, 17498112, var8);
                this.method625(8, var7 - 1, 17498112, var8);
            }
            if (arg4 == 1) {
                this.method625(2, var7, 17498112, var8);
                this.method625(32, var7, 17498112, var8 + 1);
            }
            if (arg4 == 2) {
                this.method625(8, var7, 17498112, var8);
                this.method625(128, var7 + 1, 17498112, var8);
            }
            if (arg4 == 3) {
                this.method625(32, var7, 17498112, var8);
                this.method625(2, var7, 17498112, var8 - 1);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg4 == 0) {
                this.method625(1, var7, 17498112, var8);
                this.method625(16, var7 - 1, 17498112, var8 + 1);
            }
            if (arg4 == 1) {
                this.method625(4, var7, 17498112, var8);
                this.method625(64, var7 + 1, 17498112, var8 + 1);
            }
            if (arg4 == 2) {
                this.method625(16, var7, 17498112, var8);
                this.method625(1, var7 + 1, 17498112, var8 - 1);
            }
            if (arg4 == 3) {
                this.method625(64, var7, 17498112, var8);
                this.method625(4, var7 - 1, 17498112, var8 - 1);
            }
        }
        if (arg1 == 2) {
            if (arg4 == 0) {
                this.method625(130, var7, 17498112, var8);
                this.method625(8, var7 - 1, 17498112, var8);
                this.method625(32, var7, 17498112, var8 + 1);
            }
            if (arg4 == 1) {
                this.method625(10, var7, 17498112, var8);
                this.method625(32, var7, 17498112, var8 + 1);
                this.method625(128, var7 + 1, 17498112, var8);
            }
            if (arg4 == 2) {
                this.method625(40, var7, 17498112, var8);
                this.method625(128, var7 + 1, 17498112, var8);
                this.method625(2, var7, 17498112, var8 - 1);
            }
            if (arg4 == 3) {
                this.method625(160, var7, 17498112, var8);
                this.method625(2, var7, 17498112, var8 - 1);
                this.method625(8, var7 - 1, 17498112, var8);
            }
        }
        if (arg0 < 78 || !arg5) {
            return;
        }
        if (arg1 == 0) {
            if (arg4 == 0) {
                this.method625(65536, var7, 17498112, var8);
                this.method625(4096, var7 - 1, 17498112, var8);
            }
            if (arg4 == 1) {
                this.method625(1024, var7, 17498112, var8);
                this.method625(16384, var7, 17498112, var8 + 1);
            }
            if (arg4 == 2) {
                this.method625(4096, var7, 17498112, var8);
                this.method625(65536, var7 + 1, 17498112, var8);
            }
            if (arg4 == 3) {
                this.method625(16384, var7, 17498112, var8);
                this.method625(1024, var7, 17498112, var8 - 1);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg4 == 0) {
                this.method625(512, var7, 17498112, var8);
                this.method625(8192, var7 - 1, 17498112, var8 + 1);
            }
            if (arg4 == 1) {
                this.method625(2048, var7, 17498112, var8);
                this.method625(32768, var7 + 1, 17498112, var8 + 1);
            }
            if (arg4 == 2) {
                this.method625(8192, var7, 17498112, var8);
                this.method625(512, var7 + 1, 17498112, var8 - 1);
            }
            if (arg4 == 3) {
                this.method625(32768, var7, 17498112, var8);
                this.method625(2048, var7 - 1, 17498112, var8 - 1);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method625(66560, var7, 17498112, var8);
            this.method625(4096, var7 - 1, 17498112, var8);
            this.method625(16384, var7, 17498112, var8 + 1);
        }
        if (arg4 == 1) {
            this.method625(5120, var7, 17498112, var8);
            this.method625(16384, var7, 17498112, var8 + 1);
            this.method625(65536, var7 + 1, 17498112, var8);
        }
        if (arg4 == 2) {
            this.method625(20480, var7, 17498112, var8);
            this.method625(65536, var7 + 1, 17498112, var8);
            this.method625(1024, var7, 17498112, var8 - 1);
        }
        if (arg4 == 3) {
            this.method625(81920, var7, 17498112, var8);
            this.method625(1024, var7, 17498112, var8 - 1);
            this.method625(4096, var7 - 1, 17498112, var8);
            return;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lff;I)V")
    public static final void method633(class42 arg0, int arg1) {
        field2066++;
        class107.field2410 = arg0;
        if (arg1 != -300685808) {
            method621(-116);
        }
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(IIIIIII)Z")
    public final boolean method634(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2052++;
        if (arg1 == arg6 && arg4 == arg5) {
            return true;
        }
        int var8 = arg4 - this.field2062;
        int var9 = arg6 - this.field2048;
        int var10 = arg1 - this.field2048;
        int var11 = arg5 - this.field2062;
        if (arg0 == 0) {
            if (arg3 == 0) {
                if (var10 - 1 == var9 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var8 + 1 == var11 && (this.field2056[var9][var11] & 0x1280120) == 0) {
                    return true;
                }
                if (var9 == var10 && var8 - 1 == var11 && (this.field2056[var9][var11] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg3 == 1) {
                if (var9 == var10 && var8 + 1 == var11) {
                    return true;
                }
                if (var10 - 1 == var9 && var8 == var11 && (this.field2056[var9][var11] & 0x1280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var9 && var8 == var11 && (this.field2056[var9][var11] & 0x1280180) == 0) {
                    return true;
                }
            } else if (arg3 == 2) {
                if (var10 + 1 == var9 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var8 + 1 == var11 && (this.field2056[var9][var11] & 0x1280120) == 0) {
                    return true;
                }
                if (var9 == var10 && var8 - 1 == var11 && (this.field2056[var9][var11] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg3 == 3) {
                if (var9 == var10 && var8 - 1 == var11) {
                    return true;
                }
                if (var10 - 1 == var9 && var8 == var11 && (this.field2056[var9][var11] & 0x1280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var9 && var8 == var11 && (this.field2056[var9][var11] & 0x1280180) == 0) {
                    return true;
                }
            }
        }
        if (arg0 == 2) {
            if (arg3 == 0) {
                if (var10 - 1 == var9 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var8 + 1 == var11) {
                    return true;
                }
                if (var10 + 1 == var9 && var8 == var11 && (this.field2056[var9][var11] & 0x1280180) == 0) {
                    return true;
                }
                if (var9 == var10 && var8 - 1 == var11 && (this.field2056[var9][var11] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg3 == 1) {
                if (var10 - 1 == var9 && var8 == var11 && (this.field2056[var9][var11] & 0x1280108) == 0) {
                    return true;
                }
                if (var9 == var10 && var8 + 1 == var11) {
                    return true;
                }
                if (var10 + 1 == var9 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var8 - 1 == var11 && (this.field2056[var9][var11] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg3 == 2) {
                if (var10 - 1 == var9 && var8 == var11 && (this.field2056[var9][var11] & 0x1280108) == 0) {
                    return true;
                }
                if (var9 == var10 && var8 + 1 == var11 && (this.field2056[var9][var11] & 0x1280120) == 0) {
                    return true;
                }
                if (var10 + 1 == var9 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var8 - 1 == var11) {
                    return true;
                }
            } else if (arg3 == 3) {
                if (var10 - 1 == var9 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var8 + 1 == var11 && (this.field2056[var9][var11] & 0x1280120) == 0) {
                    return true;
                }
                if (var10 + 1 == var9 && var8 == var11 && (this.field2056[var9][var11] & 0x1280180) == 0) {
                    return true;
                }
                if (var9 == var10 && var8 - 1 == var11) {
                    return true;
                }
            }
        }
        if (arg0 == 9) {
            if (var9 == var10 && var8 + 1 == var11 && (this.field2056[var9][var11] & 0x20) == 0) {
                return true;
            }
            if (var9 == var10 && var8 - 1 == var11 && (this.field2056[var9][var11] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var9 && var8 == var11 && (this.field2056[var9][var11] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var9 && var8 == var11 && (this.field2056[var9][var11] & 0x80) == 0) {
                return true;
            }
        }
        if (arg2 != 1) {
            this.method625(105, 98, 18, 71);
        }
        return false;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IZIIII)V")
    public final void method635(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field2070++;
        int var7 = 121 / ((arg0 - 23) / 51);
        int var8 = arg2 - this.field2048;
        int var9 = arg5 - this.field2062;
        if (arg3 == 0) {
            if (arg4 == 0) {
                this.method623(128, var9, true, var8);
                this.method623(8, var9, true, var8 - 1);
            }
            if (arg4 == 1) {
                this.method623(2, var9, true, var8);
                this.method623(32, var9 + 1, true, var8);
            }
            if (arg4 == 2) {
                this.method623(8, var9, true, var8);
                this.method623(128, var9, true, var8 + 1);
            }
            if (arg4 == 3) {
                this.method623(32, var9, true, var8);
                this.method623(2, var9 - 1, true, var8);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg4 == 0) {
                this.method623(1, var9, true, var8);
                this.method623(16, var9 + 1, true, var8 - 1);
            }
            if (arg4 == 1) {
                this.method623(4, var9, true, var8);
                this.method623(64, var9 + 1, true, var8 + 1);
            }
            if (arg4 == 2) {
                this.method623(16, var9, true, var8);
                this.method623(1, var9 - 1, true, var8 + 1);
            }
            if (arg4 == 3) {
                this.method623(64, var9, true, var8);
                this.method623(4, var9 - 1, true, var8 - 1);
            }
        }
        if (arg3 == 2) {
            if (arg4 == 0) {
                this.method623(130, var9, true, var8);
                this.method623(8, var9, true, var8 - 1);
                this.method623(32, var9 + 1, true, var8);
            }
            if (arg4 == 1) {
                this.method623(10, var9, true, var8);
                this.method623(32, var9 + 1, true, var8);
                this.method623(128, var9, true, var8 + 1);
            }
            if (arg4 == 2) {
                this.method623(40, var9, true, var8);
                this.method623(128, var9, true, var8 + 1);
                this.method623(2, var9 - 1, true, var8);
            }
            if (arg4 == 3) {
                this.method623(160, var9, true, var8);
                this.method623(2, var9 - 1, true, var8);
                this.method623(8, var9, true, var8 - 1);
            }
        }
        if (!arg1) {
            return;
        }
        if (arg3 == 0) {
            if (arg4 == 0) {
                this.method623(65536, var9, true, var8);
                this.method623(4096, var9, true, var8 - 1);
            }
            if (arg4 == 1) {
                this.method623(1024, var9, true, var8);
                this.method623(16384, var9 + 1, true, var8);
            }
            if (arg4 == 2) {
                this.method623(4096, var9, true, var8);
                this.method623(65536, var9, true, var8 + 1);
            }
            if (arg4 == 3) {
                this.method623(16384, var9, true, var8);
                this.method623(1024, var9 - 1, true, var8);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg4 == 0) {
                this.method623(512, var9, true, var8);
                this.method623(8192, var9 + 1, true, var8 - 1);
            }
            if (arg4 == 1) {
                this.method623(2048, var9, true, var8);
                this.method623(32768, var9 + 1, true, var8 + 1);
            }
            if (arg4 == 2) {
                this.method623(8192, var9, true, var8);
                this.method623(512, var9 - 1, true, var8 + 1);
            }
            if (arg4 == 3) {
                this.method623(32768, var9, true, var8);
                this.method623(2048, var9 - 1, true, var8 - 1);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method623(66560, var9, true, var8);
            this.method623(4096, var9, true, var8 - 1);
            this.method623(16384, var9 + 1, true, var8);
        }
        if (arg4 == 1) {
            this.method623(5120, var9, true, var8);
            this.method623(16384, var9 + 1, true, var8);
            this.method623(65536, var9, true, var8 + 1);
        }
        if (arg4 == 2) {
            this.method623(20480, var9, true, var8);
            this.method623(65536, var9, true, var8 + 1);
            this.method623(1024, var9 - 1, true, var8);
        }
        if (arg4 == 3) {
            this.method623(81920, var9, true, var8);
            this.method623(1024, var9 - 1, true, var8);
            this.method623(4096, var9, true, var8 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(II)V")
    public class88(int arg0, int arg1) {
        this.field2067 = arg1;
        this.field2064 = arg0;
        this.field2056 = new int[this.field2064][this.field2067];
        this.field2048 = 0;
        this.method622((byte) -96);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lff;BLff;Lff;)V")
    public static final void method636(class42 arg0, byte arg1, class42 arg2, class42 arg3) {
        class136.field3196 = arg3;
        field2069++;
        class47.field1255 = arg0;
        if (arg1 != 121) {
            field2060 = null;
        }
        class121.field2793 = arg2;
        class58.field1500 = new class141[class47.field1255.method314(2)][];
        class26.field781 = new boolean[class47.field1255.method314(arg1 - 119)];
    }
}
