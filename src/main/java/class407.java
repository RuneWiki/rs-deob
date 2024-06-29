import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class407 {

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "Lpu;")
    public static class179 field6005 = new class179("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");

    @OriginalMember(owner = "client!uh", name = "z", descriptor = "[[I")
    public static int[][] field6029 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "I")
    public static int field6006;

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "I")
    public static int field6007;

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "I")
    public static int field6008;

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "I")
    public static int field6009;

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "I")
    public static int field6010;

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "I")
    public static int field6011;

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "I")
    public int field6012;

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "I")
    public static int field6013;

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "I")
    public static int field6014;

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "I")
    public int field6015;

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "I")
    public static int field6016;

    @OriginalMember(owner = "client!uh", name = "n", descriptor = "I")
    public static int field6017;

    @OriginalMember(owner = "client!uh", name = "o", descriptor = "I")
    public static int field6018;

    @OriginalMember(owner = "client!uh", name = "p", descriptor = "I")
    public int field6019;

    @OriginalMember(owner = "client!uh", name = "q", descriptor = "I")
    public static int field6020;

    @OriginalMember(owner = "client!uh", name = "r", descriptor = "I")
    public static int field6021;

    @OriginalMember(owner = "client!uh", name = "s", descriptor = "I")
    public static int field6022;

    @OriginalMember(owner = "client!uh", name = "t", descriptor = "I")
    public static int field6023;

    @OriginalMember(owner = "client!uh", name = "v", descriptor = "I")
    public static int field6025;

    @OriginalMember(owner = "client!uh", name = "w", descriptor = "I")
    public int field6026;

    @OriginalMember(owner = "client!uh", name = "x", descriptor = "I")
    public static int field6027;

    @OriginalMember(owner = "client!uh", name = "A", descriptor = "I")
    public static int field6030;

    @OriginalMember(owner = "client!uh", name = "B", descriptor = "I")
    public static int field6031;

    @OriginalMember(owner = "client!uh", name = "y", descriptor = "[I")
    public static int[] field6028;

    @OriginalMember(owner = "client!uh", name = "u", descriptor = "[Lya;")
    public static class11[] field6024;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "[[I")
    public int[][] field6004;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(III)V")
    public final void method2556(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field6015;
        field6025++;
        int var5 = arg1 - this.field6019;
        this.field6004[var5][var4] = class307.method2028(this.field6004[var5][var4], arg2);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V")
    public static void method2557(int arg0) {
        field6029 = null;
        if (arg0 < 90) {
            field6016 = -103;
        }
        field6028 = null;
        field6005 = null;
        field6024 = null;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIZIZII)V")
    public final void method2558(int arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field6030++;
        int var8 = 256;
        if (arg2) {
            var8 |= 0x20000;
        }
        if (arg4) {
            var8 |= 0x40000000;
        }
        int var9 = arg3 - this.field6015;
        int var10 = arg0 - this.field6019;
        for (int var11 = var10; var11 < (arg6 + var10); var11++) {
            if (var11 >= 0 && this.field6026 > var11) {
                for (int var12 = var9; var12 < arg5 + var9; var12++) {
                    if (var12 >= 0 && this.field6012 > var12) {
                        this.method2565(52, var12, var11, var8);
                    }
                }
            }
        }
        if (arg1 > -9) {
            method2557(36);
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)Z")
    public static final boolean method2559(int arg0, int arg1) {
        field6010++;
        if (arg0 == 3518) {
            return arg1 >= 0 && arg1 <= 3 || arg1 == 9;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IZII)V")
    public static final void method2560(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg1) {
            field6016 = 85;
        }
        field6017++;
        class229.field3460 = new byte[arg0][arg2][arg3];
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIIIIZZ)V")
    public final void method2561(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        field6020++;
        int var9 = 256;
        if (arg7) {
            var9 |= 0x20000;
        }
        if (arg6) {
            var9 |= 0x40000000;
        }
        int var10 = arg4 - this.field6015;
        if (arg0 == 1 || arg0 == 3) {
            int var11 = arg2;
            arg2 = arg5;
            arg5 = var11;
        }
        int var12 = arg3 - this.field6019;
        for (int var13 = var12; var13 < arg2 + var12; var13++) {
            if (var13 >= 0 && var13 < this.field6026) {
                for (int var14 = var10; var14 < (arg5 + var10); var14++) {
                    if (var14 >= 0 && this.field6012 > var14) {
                        this.method2571(arg1 + 126, var13, var9, var14);
                    }
                }
            }
        }
        if (arg1 != -1) {
            this.method2561(2, 23, -116, 117, -102, -120, false, false);
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method2562(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field6021++;
        if (arg6 == 1) {
            if (arg5 == arg7 && arg1 == arg2) {
                return true;
            }
        } else if (arg5 >= arg7 && (arg7 + arg6 - 1) >= arg5 && arg2 <= arg2 && arg2 <= (arg6 + arg2 - 1)) {
            return true;
        }
        int var9 = arg1 - this.field6015;
        int var10 = arg2 - this.field6015;
        int var11 = arg7 - this.field6019;
        int var12 = arg5 - this.field6019;
        if (~arg6 == arg3) {
            if (arg0 == 6 || arg0 == 7) {
                if (arg0 == 7) {
                    arg4 = arg4 + 2 & 0x3;
                }
                if (arg4 == 0) {
                    if ((var12 + 1) == var11 && var9 == var10 && (this.field6004[var11][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var10 - 1) == var9 && (this.field6004[var11][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if ((var12 - 1) == var11 && var9 == var10 && (this.field6004[var11][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var10 - 1) == var9 && (this.field6004[var11][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if (var12 - 1 == var11 && var9 == var10 && (this.field6004[var11][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var10 + 1) == var9 && (this.field6004[var11][var9] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if ((var12 + 1) == var11 && var9 == var10 && (this.field6004[var11][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var10 + 1 == var9 && (this.field6004[var11][var9] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 8) {
                if (var11 == var12 && (var10 + 1) == var9 && (this.field6004[var11][var9] & 0x20) == 0) {
                    return true;
                }
                if (var11 == var12 && (var10 - 1) == var9 && (this.field6004[var11][var9] & 0x2) == 0) {
                    return true;
                }
                if ((var12 - 1) == var11 && var9 == var10 && (this.field6004[var11][var9] & 0x8) == 0) {
                    return true;
                }
                if (var12 + 1 == var11 && var9 == var10 && (this.field6004[var11][var9] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var11 - (1 - arg6);
            int var14 = arg6 + var9 - 1;
            if (arg0 == 6 || arg0 == 7) {
                if (arg0 == 7) {
                    arg4 = arg4 + 2 & 0x3;
                }
                if (arg4 == 0) {
                    if (var12 + 1 == var11 && var9 <= var10 && var14 >= var10 && (this.field6004[var11][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 <= var12 && var12 <= var13 && (var10 - arg6) == var9 && (this.field6004[var12][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if ((var12 - arg6) == var11 && var9 <= var10 && var10 <= var14 && (this.field6004[var13][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 <= var12 && var12 <= var13 && (var10 - arg6) == var9 && (this.field6004[var12][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if ((var12 - arg6) == var11 && var9 <= var10 && var14 >= var10 && (this.field6004[var13][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 >= var11 && var13 >= var12 && (var10 + 1) == var9 && (this.field6004[var12][var9] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if ((var12 + 1) == var11 && var9 <= var10 && var14 >= var10 && (this.field6004[var11][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 <= var12 && var12 <= var13 && (var10 + 1) == var9 && (this.field6004[var12][var9] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 8) {
                if (var12 >= var11 && var13 >= var12 && (var10 + 1) == var9 && (this.field6004[var12][var9] & 0x20) == 0) {
                    return true;
                }
                if (var11 <= var12 && var13 >= var12 && var10 - arg6 == var9 && (this.field6004[var12][var14] & 0x2) == 0) {
                    return true;
                }
                if (var12 - arg6 == var11 && var10 >= var9 && var14 >= var10 && (this.field6004[var13][var10] & 0x8) == 0) {
                    return true;
                }
                if (var12 + 1 == var11 && var9 <= var10 && var10 <= var14 && (this.field6004[var11][var10] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIIZZI)V")
    public final void method2563(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5, int arg6) {
        int var8 = arg3 - this.field6015;
        field6009++;
        int var9 = -86 / ((arg1 - 46) / 52);
        int var10 = arg0 - this.field6019;
        if (arg6 == 0) {
            if (arg2 == 0) {
                this.method2571(124, var10, 128, var8);
                this.method2571(115, var10 - 1, 8, var8);
            }
            if (arg2 == 1) {
                this.method2571(125, var10, 2, var8);
                this.method2571(127, var10, 32, var8 + 1);
            }
            if (arg2 == 2) {
                this.method2571(126, var10, 8, var8);
                this.method2571(116, var10 + 1, 128, var8);
            }
            if (arg2 == 3) {
                this.method2571(126, var10, 32, var8);
                this.method2571(115, var10, 2, var8 - 1);
            }
        }
        if (arg6 == 1 || arg6 == 3) {
            if (arg2 == 0) {
                this.method2571(121, var10, 1, var8);
                this.method2571(116, var10 - 1, 16, var8 + 1);
            }
            if (arg2 == 1) {
                this.method2571(117, var10, 4, var8);
                this.method2571(115, var10 + 1, 64, var8 + 1);
            }
            if (arg2 == 2) {
                this.method2571(117, var10, 16, var8);
                this.method2571(117, var10 + 1, 1, var8 - 1);
            }
            if (arg2 == 3) {
                this.method2571(123, var10, 64, var8);
                this.method2571(117, var10 - 1, 4, var8 - 1);
            }
        }
        if (arg6 == 2) {
            if (arg2 == 0) {
                this.method2571(122, var10, 130, var8);
                this.method2571(120, var10 - 1, 8, var8);
                this.method2571(119, var10, 32, var8 + 1);
            }
            if (arg2 == 1) {
                this.method2571(115, var10, 10, var8);
                this.method2571(119, var10, 32, var8 + 1);
                this.method2571(124, var10 + 1, 128, var8);
            }
            if (arg2 == 2) {
                this.method2571(124, var10, 40, var8);
                this.method2571(124, var10 + 1, 128, var8);
                this.method2571(126, var10, 2, var8 - 1);
            }
            if (arg2 == 3) {
                this.method2571(126, var10, 160, var8);
                this.method2571(124, var10, 2, var8 - 1);
                this.method2571(117, var10 - 1, 8, var8);
            }
        }
        if (arg4) {
            if (arg6 == 0) {
                if (arg2 == 0) {
                    this.method2571(126, var10, 65536, var8);
                    this.method2571(116, var10 - 1, 4096, var8);
                }
                if (arg2 == 1) {
                    this.method2571(126, var10, 1024, var8);
                    this.method2571(123, var10, 16384, var8 + 1);
                }
                if (arg2 == 2) {
                    this.method2571(123, var10, 4096, var8);
                    this.method2571(127, var10 + 1, 65536, var8);
                }
                if (arg2 == 3) {
                    this.method2571(120, var10, 16384, var8);
                    this.method2571(116, var10, 1024, var8 - 1);
                }
            }
            if (arg6 == 1 || arg6 == 3) {
                if (arg2 == 0) {
                    this.method2571(125, var10, 512, var8);
                    this.method2571(119, var10 - 1, 8192, var8 + 1);
                }
                if (arg2 == 1) {
                    this.method2571(122, var10, 2048, var8);
                    this.method2571(118, var10 + 1, 32768, var8 + 1);
                }
                if (arg2 == 2) {
                    this.method2571(119, var10, 8192, var8);
                    this.method2571(115, var10 + 1, 512, var8 - 1);
                }
                if (arg2 == 3) {
                    this.method2571(121, var10, 32768, var8);
                    this.method2571(121, var10 - 1, 2048, var8 - 1);
                }
            }
            if (arg6 == 2) {
                if (arg2 == 0) {
                    this.method2571(120, var10, 66560, var8);
                    this.method2571(126, var10 - 1, 4096, var8);
                    this.method2571(117, var10, 16384, var8 + 1);
                }
                if (arg2 == 1) {
                    this.method2571(121, var10, 5120, var8);
                    this.method2571(126, var10, 16384, var8 + 1);
                    this.method2571(115, var10 + 1, 65536, var8);
                }
                if (arg2 == 2) {
                    this.method2571(125, var10, 20480, var8);
                    this.method2571(121, var10 + 1, 65536, var8);
                    this.method2571(118, var10, 1024, var8 - 1);
                }
                if (arg2 == 3) {
                    this.method2571(120, var10, 81920, var8);
                    this.method2571(124, var10, 1024, var8 - 1);
                    this.method2571(121, var10 - 1, 4096, var8);
                }
            }
        }
        if (!arg5) {
            return;
        }
        if (arg6 == 0) {
            if (arg2 == 0) {
                this.method2571(123, var10, 536870912, var8);
                this.method2571(121, var10 - 1, 33554432, var8);
            }
            if (arg2 == 1) {
                this.method2571(123, var10, 8388608, var8);
                this.method2571(127, var10, 134217728, var8 + 1);
            }
            if (arg2 == 2) {
                this.method2571(118, var10, 33554432, var8);
                this.method2571(123, var10 + 1, 536870912, var8);
            }
            if (arg2 == 3) {
                this.method2571(123, var10, 134217728, var8);
                this.method2571(120, var10, 8388608, var8 - 1);
            }
        }
        if (arg6 == 1 || arg6 == 3) {
            if (arg2 == 0) {
                this.method2571(115, var10, 4194304, var8);
                this.method2571(124, var10 - 1, 67108864, var8 + 1);
            }
            if (arg2 == 1) {
                this.method2571(119, var10, 16777216, var8);
                this.method2571(115, var10 + 1, 268435456, var8 + 1);
            }
            if (arg2 == 2) {
                this.method2571(119, var10, 67108864, var8);
                this.method2571(123, var10 + 1, 4194304, var8 - 1);
            }
            if (arg2 == 3) {
                this.method2571(118, var10, 268435456, var8);
                this.method2571(124, var10 - 1, 16777216, var8 - 1);
            }
        }
        if (arg6 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method2571(120, var10, 545259520, var8);
            this.method2571(121, var10 - 1, 33554432, var8);
            this.method2571(127, var10, 134217728, var8 + 1);
        }
        if (arg2 == 1) {
            this.method2571(126, var10, 41943040, var8);
            this.method2571(116, var10, 134217728, var8 + 1);
            this.method2571(117, var10 + 1, 536870912, var8);
        }
        if (arg2 == 2) {
            this.method2571(120, var10, 167772160, var8);
            this.method2571(123, var10 + 1, 536870912, var8);
            this.method2571(123, var10, 8388608, var8 - 1);
        }
        if (arg2 == 3) {
            this.method2571(121, var10, 671088640, var8);
            this.method2571(124, var10, 8388608, var8 - 1);
            this.method2571(116, var10 - 1, 33554432, var8);
            return;
        }
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(III)V")
    public final void method2564(int arg0, int arg1, int arg2) {
        field6007++;
        int var4 = -109 / ((-arg2 - 78) / 32);
        int var5 = arg0 - this.field6019;
        int var6 = arg1 - this.field6015;
        this.field6004[var5][var6] = class19.method118(this.field6004[var5][var6], 262144);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIII)V")
    private final void method2565(int arg0, int arg1, int arg2, int arg3) {
        this.field6004[arg2][arg1] = class19.method118(this.field6004[arg2][arg1], arg3);
        field6013++;
        if (arg0 <= 26) {
            field6024 = null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "(III)V")
    public final void method2566(int arg0, int arg1, int arg2) {
        field6018++;
        if (arg0 > -57) {
            this.method2567((byte) -103, -82, 67);
        }
        int var4 = arg2 - this.field6019;
        int var5 = arg1 - this.field6015;
        this.field6004[var4][var5] = class19.method118(this.field6004[var4][var5], 2097152);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(BII)V")
    public final void method2567(byte arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field6015;
        int var5 = arg1 - this.field6019;
        field6008++;
        if (arg0 != 27) {
            field6016 = 72;
        }
        this.field6004[var5][var4] = class307.method2028(this.field6004[var5][var4], -262145);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)V")
    public final void method2568(byte arg0) {
        field6023++;
        int var2 = 0;
        if (arg0 != -123) {
            this.method2572(-23, -57, -40, -16, -26, -120, 10, (byte) -6);
        }
        while (var2 < this.field6026) {
            for (int var3 = 0; var3 < this.field6012; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= this.field6026 - 5 || var3 >= this.field6012 - 5) {
                    this.field6004[var2][var3] = -1;
                } else {
                    this.field6004[var2][var3] = 2097152;
                }
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IZIZIII)V")
    public final void method2569(int arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        int var8 = arg0 - this.field6015;
        if (arg4 != 1) {
            return;
        }
        int var9 = arg6 - this.field6019;
        field6011++;
        if (arg2 == 0) {
            if (arg5 == 0) {
                this.method2565(114, var8, var9, 128);
                this.method2565(arg4 + 102, var8, var9 - 1, 8);
            }
            if (arg5 == 1) {
                this.method2565(36, var8, var9, 2);
                this.method2565(51, var8 + 1, var9, 32);
            }
            if (arg5 == 2) {
                this.method2565(arg4 + 26, var8, var9, 8);
                this.method2565(50, var8, var9 + 1, 128);
            }
            if (arg5 == 3) {
                this.method2565(116, var8, var9, 32);
                this.method2565(82, var8 - 1, var9, 2);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg5 == 0) {
                this.method2565(27, var8, var9, 1);
                this.method2565(arg4 ^ 0x67, var8 + 1, var9 - 1, 16);
            }
            if (arg5 == 1) {
                this.method2565(arg4 + 88, var8, var9, 4);
                this.method2565(32, var8 + 1, var9 + 1, 64);
            }
            if (arg5 == 2) {
                this.method2565(79, var8, var9, 16);
                this.method2565(87, var8 - 1, var9 - -1, 1);
            }
            if (arg5 == 3) {
                this.method2565(arg4 + 100, var8, var9, 64);
                this.method2565(45, var8 - 1, var9 - 1, 4);
            }
        }
        if (arg2 == 2) {
            if (arg5 == 0) {
                this.method2565(114, var8, var9, 130);
                this.method2565(arg4 + 106, var8, var9 - 1, 8);
                this.method2565(35, var8 + 1, var9, 32);
            }
            if (arg5 == 1) {
                this.method2565(arg4 + 86, var8, var9, 10);
                this.method2565(63, var8 + 1, var9, 32);
                this.method2565(126, var8, var9 + 1, 128);
            }
            if (arg5 == 2) {
                this.method2565(arg4 + 47, var8, var9, 40);
                this.method2565(74, var8, var9 + 1, 128);
                this.method2565(arg4 ^ 0x5C, var8 - 1, var9, 2);
            }
            if (arg5 == 3) {
                this.method2565(56, var8, var9, 160);
                this.method2565(55, var8 - 1, var9, 2);
                this.method2565(98, var8, var9 - 1, 8);
            }
        }
        if (arg1) {
            if (arg2 == 0) {
                if (arg5 == 0) {
                    this.method2565(58, var8, var9, 65536);
                    this.method2565(92, var8, var9 - 1, 4096);
                }
                if (arg5 == 1) {
                    this.method2565(arg4 + 64, var8, var9, 1024);
                    this.method2565(104, var8 + 1, var9, 16384);
                }
                if (arg5 == 2) {
                    this.method2565(arg4 + 36, var8, var9, 4096);
                    this.method2565(arg4 + 119, var8, var9 + 1, 65536);
                }
                if (arg5 == 3) {
                    this.method2565(121, var8, var9, 16384);
                    this.method2565(arg4 + 76, var8 - 1, var9, 1024);
                }
            }
            if (arg2 == 1 || arg2 == 3) {
                if (arg5 == 0) {
                    this.method2565(arg4 ^ 0x1D, var8, var9, 512);
                    this.method2565(44, var8 + 1, var9 + -1, 8192);
                }
                if (arg5 == 1) {
                    this.method2565(91, var8, var9, 2048);
                    this.method2565(98, var8 + 1, var9 + 1, 32768);
                }
                if (arg5 == 2) {
                    this.method2565(arg4 ^ 0x48, var8, var9, 8192);
                    this.method2565(40, var8 - 1, var9 + 1, 512);
                }
                if (arg5 == 3) {
                    this.method2565(91, var8, var9, 32768);
                    this.method2565(73, var8 - 1, var9 + -1, 2048);
                }
            }
            if (arg2 == 2) {
                if (arg5 == 0) {
                    this.method2565(arg4 + 117, var8, var9, 66560);
                    this.method2565(63, var8, var9 - 1, 4096);
                    this.method2565(111, var8 + 1, var9, 16384);
                }
                if (arg5 == 1) {
                    this.method2565(121, var8, var9, 5120);
                    this.method2565(105, var8 + 1, var9, 16384);
                    this.method2565(arg4 ^ 0x65, var8, var9 + 1, 65536);
                }
                if (arg5 == 2) {
                    this.method2565(87, var8, var9, 20480);
                    this.method2565(arg4 + 104, var8, var9 + 1, 65536);
                    this.method2565(62, var8 - 1, var9, 1024);
                }
                if (arg5 == 3) {
                    this.method2565(arg4 + 46, var8, var9, 81920);
                    this.method2565(27, var8 - 1, var9, 1024);
                    this.method2565(arg4 ^ 0x6E, var8, var9 - 1, 4096);
                }
            }
        }
        if (!arg3) {
            return;
        }
        if (arg2 == 0) {
            if (arg5 == 0) {
                this.method2565(83, var8, var9, 536870912);
                this.method2565(98, var8, var9 - 1, 33554432);
            }
            if (arg5 == 1) {
                this.method2565(40, var8, var9, 8388608);
                this.method2565(83, var8 + 1, var9, 134217728);
            }
            if (arg5 == 2) {
                this.method2565(106, var8, var9, 33554432);
                this.method2565(66, var8, var9 + 1, 536870912);
            }
            if (arg5 == 3) {
                this.method2565(94, var8, var9, 134217728);
                this.method2565(arg4 + 62, var8 + -1, var9, 8388608);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg5 == 0) {
                this.method2565(arg4 + 60, var8, var9, 4194304);
                this.method2565(53, var8 + 1, var9 + -1, 67108864);
            }
            if (arg5 == 1) {
                this.method2565(70, var8, var9, 16777216);
                this.method2565(41, var8 + 1, var9 - -1, 268435456);
            }
            if (arg5 == 2) {
                this.method2565(56, var8, var9, 67108864);
                this.method2565(arg4 ^ 0x41, var8 - 1, var9 - -1, 4194304);
            }
            if (arg5 == 3) {
                this.method2565(106, var8, var9, 268435456);
                this.method2565(32, var8 - 1, var9 + -1, 16777216);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method2565(66, var8, var9, 545259520);
            this.method2565(64, var8, var9 - 1, 33554432);
            this.method2565(33, var8 + 1, var9, 134217728);
        }
        if (arg5 == 1) {
            this.method2565(96, var8, var9, 41943040);
            this.method2565(65, var8 + 1, var9, 134217728);
            this.method2565(arg4 ^ 0x44, var8, var9 + 1, 536870912);
        }
        if (arg5 == 2) {
            this.method2565(arg4 ^ 0x50, var8, var9, 167772160);
            this.method2565(29, var8, var9 + 1, 536870912);
            this.method2565(43, var8 - 1, var9, 8388608);
        }
        if (arg5 == 3) {
            this.method2565(37, var8, var9, 671088640);
            this.method2565(81, var8 - 1, var9, 8388608);
            this.method2565(109, var8, var9 - 1, 33554432);
            return;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIIIIIIII)Z")
    public final boolean method2570(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg6 != -6197) {
            return true;
        }
        field6006++;
        int var11 = arg4 + arg5;
        int var12 = arg0 + arg1;
        int var13 = arg2 + arg3;
        int var14 = arg7 + arg9;
        if (arg5 == var13 && (arg8 & 0x2) == 0) {
            int var15 = arg7 >= arg0 ? arg7 : arg0;
            int var16 = var12 >= var14 ? var14 : var12;
            while (var15 < var16) {
                if ((this.field6004[var13 - this.field6019 - 1][var15 - this.field6015] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg3 == var11 && (arg8 & 0x8) == 0) {
            int var17 = arg0 > arg7 ? arg0 : arg7;
            int var18 = var14 > var12 ? var12 : var14;
            while (var18 > var17) {
                if ((this.field6004[arg3 - this.field6019][var17 - this.field6015] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg0 == var14 && (arg8 & 0x1) == 0) {
            int var19 = arg3 >= arg5 ? arg3 : arg5;
            int var20 = var11 < var13 ? var11 : var13;
            while (var20 > var19) {
                if ((this.field6004[var19 - this.field6019][var14 - this.field6015 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg7 == var12 && (arg8 & 0x4) == 0) {
            int var21 = arg3 >= arg5 ? arg3 : arg5;
            int var22 = var11 < var13 ? var11 : var13;
            while (var21 < var22) {
                if ((this.field6004[var21 - this.field6019][arg7 - this.field6015] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(IIII)V")
    private final void method2571(int arg0, int arg1, int arg2, int arg3) {
        this.field6004[arg1][arg3] = class307.method2028(this.field6004[arg1][arg3], ~arg2);
        if (arg0 <= 114) {
            this.field6015 = 61;
        }
        field6027++;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIIIIIB)Z")
    public final boolean method2572(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field6014++;
        if (arg4 == 1) {
            if (arg0 == arg6 && arg2 == arg5) {
                return true;
            }
        } else if (arg6 >= arg0 && arg6 <= arg0 + arg4 - 1 && arg5 <= arg5 && (arg4 + arg5 - 1) >= arg5) {
            return true;
        }
        int var9 = arg2 - this.field6015;
        int var10 = arg0 - this.field6019;
        int var11 = arg6 - this.field6019;
        int var12 = arg5 - this.field6015;
        if (arg4 == 1) {
            if (arg1 == 0) {
                if (arg3 == 0) {
                    if (var11 - 1 == var10 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9 && (this.field6004[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var9 && (this.field6004[var10][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var10 == var11 && (var12 + 1) == var9) {
                        return true;
                    }
                    if (var11 - 1 == var10 && var9 == var12 && (this.field6004[var10][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var10 && var9 == var12 && (this.field6004[var10][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var11 + 1 == var10 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var12 + 1 == var9 && (this.field6004[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 - 1) == var9 && (this.field6004[var10][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var10 == var11 && (var12 - 1) == var9) {
                        return true;
                    }
                    if ((var11 - 1) == var10 && var9 == var12 && (this.field6004[var10][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var10 && var9 == var12 && (this.field6004[var10][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg1 == 2) {
                if (arg3 == 0) {
                    if (var11 - 1 == var10 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var12 + 1 == var9) {
                        return true;
                    }
                    if ((var11 + 1) == var10 && var9 == var12 && (this.field6004[var10][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var9 && (this.field6004[var10][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if ((var11 - 1) == var10 && var9 == var12 && (this.field6004[var10][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var12 - 1) == var9 && (this.field6004[var10][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var11 - 1 == var10 && var9 == var12 && (this.field6004[var10][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 + 1 == var9 && (this.field6004[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var12 - 1) == var9) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var11 - 1 == var10 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var12 + 1 == var9 && (this.field6004[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var10 && var9 == var12 && (this.field6004[var10][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 - 1) == var9) {
                        return true;
                    }
                }
            }
            if (arg1 == 9) {
                if (var10 == var11 && var12 + 1 == var9 && (this.field6004[var10][var9] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var11 && var12 - 1 == var9 && (this.field6004[var10][var9] & 0x2) == 0) {
                    return true;
                }
                if (var11 - 1 == var10 && var9 == var12 && (this.field6004[var10][var9] & 0x8) == 0) {
                    return true;
                }
                if ((var11 + 1) == var10 && var9 == var12 && (this.field6004[var10][var9] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var10 + arg4 - 1;
            int var14 = arg4 + var9 - 1;
            if (arg1 == 0) {
                if (arg3 == 0) {
                    if ((var11 - arg4) == var10 && var12 >= var9 && var14 >= var12) {
                        return true;
                    }
                    if (var11 >= var10 && var11 <= var13 && (var12 + 1) == var9 && (this.field6004[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 >= var10 && var13 >= var11 && var12 - arg4 == var9 && (this.field6004[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var10 <= var11 && var13 >= var11 && var12 + 1 == var9) {
                        return true;
                    }
                    if ((var11 - arg4) == var10 && var12 >= var9 && var14 >= var12 && (this.field6004[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var10 && var9 <= var12 && var14 >= var12 && (this.field6004[var10][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if ((var11 + 1) == var10 && var12 >= var9 && var12 <= var14) {
                        return true;
                    }
                    if (var10 <= var11 && var11 <= var13 && (var12 + 1) == var9 && (this.field6004[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 <= var11 && var11 <= var13 && var12 - arg4 == var9 && (this.field6004[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var10 <= var11 && var13 >= var11 && var12 - arg4 == var9) {
                        return true;
                    }
                    if (var11 - arg4 == var10 && var12 >= var9 && var14 >= var12 && (this.field6004[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var10 && var12 >= var9 && var14 >= var12 && (this.field6004[var10][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg1 == 2) {
                if (arg3 == 0) {
                    if (var11 - arg4 == var10 && var12 >= var9 && var14 >= var12) {
                        return true;
                    }
                    if (var11 >= var10 && var13 >= var11 && (var12 + 1) == var9) {
                        return true;
                    }
                    if ((var11 + 1) == var10 && var9 <= var12 && var14 >= var12 && (this.field6004[var10][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 >= var10 && var13 >= var11 && var12 - arg4 == var9 && (this.field6004[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var11 - arg4 == var10 && var9 <= var12 && var14 >= var12 && (this.field6004[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 >= var10 && var11 <= var13 && (var12 + 1) == var9) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var12 >= var9 && var14 >= var12) {
                        return true;
                    }
                    if (var11 >= var10 && var11 <= var13 && var12 - arg4 == var9 && (this.field6004[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var11 - arg4 == var10 && var9 <= var12 && var12 <= var14 && (this.field6004[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 >= var10 && var11 <= var13 && (var12 + 1) == var9 && (this.field6004[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var9 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var11 >= var10 && var11 <= var13 && (var12 - arg4) == var9) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var11 - arg4 == var10 && var9 <= var12 && var14 >= var12) {
                        return true;
                    }
                    if (var10 <= var11 && var11 <= var13 && (var12 + 1) == var9 && (this.field6004[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var10 && var9 <= var12 && var12 <= var14 && (this.field6004[var10][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 <= var11 && var11 <= var13 && (var12 - arg4) == var9) {
                        return true;
                    }
                }
            }
            if (arg1 == 9) {
                if (var10 <= var11 && var11 <= var13 && var12 + 1 == var9 && (this.field6004[var11][var9] & 0x2C0120) == 0) {
                    return true;
                }
                if (var10 <= var11 && var13 >= var11 && var12 - arg4 == var9 && (this.field6004[var11][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if ((var11 - arg4) == var10 && var12 >= var9 && var14 >= var12 && (this.field6004[var13][var12] & 0x2C0108) == 0) {
                    return true;
                }
                if ((var11 + 1) == var10 && var12 >= var9 && var14 >= var12 && (this.field6004[var10][var12] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        if (arg7 < 51) {
            this.field6026 = -57;
        }
        return false;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIIIIIII)Z")
    public final boolean method2573(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field6022++;
        if (arg2 > 1) {
            return class342.method2204(arg8, (byte) -120, arg2, arg7, arg6, arg1, arg5, arg4, arg2) ? true : this.method2570(arg1, arg2, arg4, arg7, arg2, arg8, -6197, arg6, arg0, arg5);
        }
        int var10 = arg4 + arg7 - 1;
        int var11 = arg6 + arg5 - 1;
        if (arg8 >= arg7 && var10 >= arg8 && arg6 <= arg1 && arg1 <= var11) {
            return true;
        } else if ((arg7 - 1) == arg8 && arg1 >= arg6 && var11 >= arg1 && (this.field6004[arg8 - this.field6019][arg1 - this.field6015] & 0x8) == 0 && (arg0 & 0x8) == 0) {
            return true;
        } else if (arg3 != 8) {
            return true;
        } else if (var10 + 1 == arg8 && arg6 <= arg1 && var11 >= arg1 && (this.field6004[arg8 - this.field6019][arg1 - this.field6015] & 0x80) == 0 && (arg0 & 0x2) == 0) {
            return true;
        } else if (arg6 - 1 == arg1 && arg7 <= arg8 && var10 >= arg8 && (this.field6004[arg8 - this.field6019][arg1 - this.field6015] & 0x2) == 0 && (arg0 & 0x4) == 0) {
            return true;
        } else {
            return var11 + 1 == arg1 && arg8 >= arg7 && arg8 <= var10 && (this.field6004[arg8 - this.field6019][arg1 - this.field6015] & 0x20) == 0 && (arg0 & 0x1) == 0;
        }
    }
}
