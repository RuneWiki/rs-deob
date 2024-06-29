import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class79 {

    @OriginalMember(owner = "client!ld", name = "A", descriptor = "I")
    private int field1140;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
    private int field1115;

    @OriginalMember(owner = "client!ld", name = "s", descriptor = "I")
    private int field1132;

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
    private int field1120;

    @OriginalMember(owner = "client!ld", name = "l", descriptor = "[[I")
    public int[][] field1125;

    @OriginalMember(owner = "client!ld", name = "w", descriptor = "Llf;")
    public static class211 field1136 = new class211(64);

    @OriginalMember(owner = "client!ld", name = "B", descriptor = "I")
    public static int field1141 = 0;

    @OriginalMember(owner = "client!ld", name = "C", descriptor = "I")
    public static int field1142 = 0;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "I")
    public static int field1121;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "I")
    public static int field1122;

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "I")
    public static int field1123;

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "I")
    public static int field1124;

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "client!ld", name = "n", descriptor = "I")
    public static int field1127;

    @OriginalMember(owner = "client!ld", name = "o", descriptor = "I")
    public static int field1128;

    @OriginalMember(owner = "client!ld", name = "p", descriptor = "I")
    public static int field1129;

    @OriginalMember(owner = "client!ld", name = "q", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "client!ld", name = "r", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "client!ld", name = "t", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "client!ld", name = "u", descriptor = "I")
    public static int field1134;

    @OriginalMember(owner = "client!ld", name = "v", descriptor = "I")
    public static int field1135;

    @OriginalMember(owner = "client!ld", name = "x", descriptor = "I")
    public static int field1137;

    @OriginalMember(owner = "client!ld", name = "y", descriptor = "I")
    public static int field1138;

    @OriginalMember(owner = "client!ld", name = "z", descriptor = "I")
    public static int field1139;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIII)V")
    public static final void method532(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1117++;
        int var5 = 0;
        if (arg4 != 2) {
            field1129 = 80;
        }
        while (class146.field2154 > var5) {
            if (arg0 < class283.field4485[var5] + class149.field2229[var5] && class149.field2229[var5] < (arg0 + arg1) && arg2 < (class272.field4336[var5] + class155.field2306[var5]) && class272.field4336[var5] < arg2 + arg3) {
                class80.field1162[var5] = true;
            }
            var5++;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIII)V")
    private final void method533(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 == 29306) {
            this.field1125[arg2][arg3] = class224.method1526(this.field1125[arg2][arg3], ~arg0);
            field1131++;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(BII)V")
    public final void method534(byte arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field1132;
        field1116++;
        if (arg0 != 7) {
            this.method541(119, 105, -36, 113, 106, (byte) -113, -74, -95, 94);
        }
        int var5 = arg2 - this.field1115;
        this.field1125[var5][var4] = class120.method787(this.field1125[var5][var4], 2097152);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZIIIII)V")
    public final void method535(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1139++;
        int var7 = arg4 - this.field1132;
        int var8 = arg1 - this.field1115;
        if (arg3 == 0) {
            if (arg2 == 0) {
                this.method533(128, 29306, var8, var7);
                this.method533(8, 29306, var8 - 1, var7);
            }
            if (arg2 == 1) {
                this.method533(2, arg5 ^ 0x667A, var8, var7);
                this.method533(32, 29306, var8, var7 + 1);
            }
            if (arg2 == 2) {
                this.method533(8, 29306, var8, var7);
                this.method533(128, 29306, var8 + 1, var7);
            }
            if (arg2 == 3) {
                this.method533(32, arg5 + 24186, var8, var7);
                this.method533(2, 29306, var8, var7 - 1);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg2 == 0) {
                this.method533(1, arg5 + 24186, var8, var7);
                this.method533(16, arg5 + 24186, var8 + -1, var7 + 1);
            }
            if (arg2 == 1) {
                this.method533(4, 29306, var8, var7);
                this.method533(64, 29306, var8 + 1, var7 + 1);
            }
            if (arg2 == 2) {
                this.method533(16, 29306, var8, var7);
                this.method533(1, arg5 + 24186, var8 + 1, var7 - 1);
            }
            if (arg2 == 3) {
                this.method533(64, 29306, var8, var7);
                this.method533(4, arg5 + 24186, var8 - 1, var7 - 1);
            }
        }
        if (arg3 == 2) {
            if (arg2 == 0) {
                this.method533(130, 29306, var8, var7);
                this.method533(8, arg5 ^ 0x667A, var8 - 1, var7);
                this.method533(32, arg5 + 24186, var8, var7 + 1);
            }
            if (arg2 == 1) {
                this.method533(10, 29306, var8, var7);
                this.method533(32, 29306, var8, var7 + 1);
                this.method533(128, arg5 ^ 0x667A, var8 + 1, var7);
            }
            if (arg2 == 2) {
                this.method533(40, 29306, var8, var7);
                this.method533(128, 29306, var8 + 1, var7);
                this.method533(2, 29306, var8, var7 - 1);
            }
            if (arg2 == 3) {
                this.method533(160, arg5 ^ 0x667A, var8, var7);
                this.method533(2, 29306, var8, var7 - 1);
                this.method533(8, arg5 + 24186, var8 + -1, var7);
            }
        }
        if (arg5 != 5120) {
            this.field1115 = 84;
        }
        if (!arg0) {
            return;
        }
        if (arg3 == 0) {
            if (arg2 == 0) {
                this.method533(65536, arg5 + 24186, var8, var7);
                this.method533(4096, 29306, var8 - 1, var7);
            }
            if (arg2 == 1) {
                this.method533(1024, 29306, var8, var7);
                this.method533(16384, 29306, var8, var7 + 1);
            }
            if (arg2 == 2) {
                this.method533(4096, 29306, var8, var7);
                this.method533(65536, 29306, var8 + 1, var7);
            }
            if (arg2 == 3) {
                this.method533(16384, arg5 ^ 0x667A, var8, var7);
                this.method533(1024, 29306, var8, var7 - 1);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg2 == 0) {
                this.method533(512, arg5 + 24186, var8, var7);
                this.method533(8192, 29306, var8 - 1, var7 + 1);
            }
            if (arg2 == 1) {
                this.method533(2048, 29306, var8, var7);
                this.method533(32768, arg5 ^ 0x667A, var8 + 1, var7 - -1);
            }
            if (arg2 == 2) {
                this.method533(8192, 29306, var8, var7);
                this.method533(512, arg5 ^ 0x667A, var8 + 1, var7 - 1);
            }
            if (arg2 == 3) {
                this.method533(32768, arg5 + 24186, var8, var7);
                this.method533(2048, 29306, var8 - 1, var7 + -1);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method533(66560, 29306, var8, var7);
            this.method533(4096, 29306, var8 - 1, var7);
            this.method533(16384, arg5 ^ 0x667A, var8, var7 + 1);
        }
        if (arg2 == 1) {
            this.method533(5120, 29306, var8, var7);
            this.method533(16384, 29306, var8, var7 + 1);
            this.method533(65536, 29306, var8 + 1, var7);
        }
        if (arg2 == 2) {
            this.method533(20480, 29306, var8, var7);
            this.method533(65536, 29306, var8 + 1, var7);
            this.method533(1024, 29306, var8, var7 - 1);
        }
        if (arg2 == 3) {
            this.method533(81920, 29306, var8, var7);
            this.method533(1024, 29306, var8, var7 - 1);
            this.method533(4096, 29306, var8 - 1, var7);
            return;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
    public static void method536(int arg0) {
        if (arg0 != -770) {
            field1141 = -100;
        }
        field1136 = null;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(III)V")
    public final void method537(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field1115;
        field1133++;
        int var5 = arg0 - this.field1132;
        this.field1125[var4][var5] = class224.method1526(this.field1125[var4][var5], -262145);
        if (arg1 != -1) {
            this.method544(90, -70, 91, false, (byte) 21, 115);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIBIIIII)Z")
    public final boolean method538(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1118++;
        if (arg3 == 1) {
            if (arg5 == arg7 && arg4 == arg6) {
                return true;
            }
        } else if (arg5 >= arg7 && arg5 <= (arg3 + arg7 - 1) && arg6 <= arg6 && arg6 <= arg3 + arg6 - 1) {
            return true;
        }
        int var9 = arg5 - this.field1115;
        int var10 = arg7 - this.field1115;
        int var11 = arg4 - this.field1132;
        int var12 = arg6 - this.field1132;
        if (arg2 != -43) {
            this.field1140 = 96;
        }
        if (arg3 == 1) {
            if (arg1 == 0) {
                if (arg0 == 0) {
                    if (var9 - 1 == var10 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var12 + 1 == var11 && (this.field1125[var10][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var12 - 1) == var11 && (this.field1125[var10][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var9 == var10 && (var12 + 1) == var11) {
                        return true;
                    }
                    if ((var9 - 1) == var10 && var11 == var12 && (this.field1125[var10][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var11 == var12 && (this.field1125[var10][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if (var9 + 1 == var10 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var12 + 1 == var11 && (this.field1125[var10][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var12 - 1 == var11 && (this.field1125[var10][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var9 == var10 && var12 - 1 == var11) {
                        return true;
                    }
                    if ((var9 - 1) == var10 && var11 == var12 && (this.field1125[var10][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var11 == var12 && (this.field1125[var10][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg1 == 2) {
                if (arg0 == 0) {
                    if (var9 - 1 == var10 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var12 + 1 == var11) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var11 == var12 && (this.field1125[var10][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var12 - 1) == var11 && (this.field1125[var10][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if ((var9 - 1) == var10 && var11 == var12 && (this.field1125[var10][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var12 + 1) == var11) {
                        return true;
                    }
                    if (var9 + 1 == var10 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var12 - 1 == var11 && (this.field1125[var10][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if (var9 - 1 == var10 && var11 == var12 && (this.field1125[var10][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var12 + 1 == var11 && (this.field1125[var10][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && (var12 - 1) == var11) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var9 - 1 == var10 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && (var12 + 1) == var11 && (this.field1125[var10][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var11 == var12 && (this.field1125[var10][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var12 - 1) == var11) {
                        return true;
                    }
                }
            }
            if (arg1 == 9) {
                if (var9 == var10 && (var12 + 1) == var11 && (this.field1125[var10][var11] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var10 && (var12 - 1) == var11 && (this.field1125[var10][var11] & 0x2) == 0) {
                    return true;
                }
                if (var9 - 1 == var10 && var11 == var12 && (this.field1125[var10][var11] & 0x8) == 0) {
                    return true;
                }
                if ((var9 + 1) == var10 && var11 == var12 && (this.field1125[var10][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg3 + var10 - 1;
            int var14 = var11 + arg3 - 1;
            if (arg1 == 0) {
                if (arg0 == 0) {
                    if ((var9 - arg3) == var10 && var12 >= var11 && var14 >= var12) {
                        return true;
                    }
                    if (var9 >= var10 && var13 >= var9 && var12 + 1 == var11 && (this.field1125[var9][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 <= var9 && var13 >= var9 && (var12 - arg3) == var11 && (this.field1125[var9][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var10 <= var9 && var9 <= var13 && var12 + 1 == var11) {
                        return true;
                    }
                    if (var9 - arg3 == var10 && var12 >= var11 && var14 >= var12 && (this.field1125[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var12 >= var11 && var14 >= var12 && (this.field1125[var10][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if ((var9 + 1) == var10 && var12 >= var11 && var14 >= var12) {
                        return true;
                    }
                    if (var9 >= var10 && var9 <= var13 && var12 + 1 == var11 && (this.field1125[var9][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 <= var9 && var9 <= var13 && (var12 - arg3) == var11 && (this.field1125[var9][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var9 >= var10 && var13 >= var9 && (var12 - arg3) == var11) {
                        return true;
                    }
                    if (var9 - arg3 == var10 && var11 <= var12 && var12 <= var14 && (this.field1125[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var12 >= var11 && var14 >= var12 && (this.field1125[var10][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg1 == 2) {
                if (arg0 == 0) {
                    if (var9 - arg3 == var10 && var12 >= var11 && var12 <= var14) {
                        return true;
                    }
                    if (var9 >= var10 && var13 >= var9 && (var12 + 1) == var11) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var12 >= var11 && var12 <= var14 && (this.field1125[var10][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var10 <= var9 && var9 <= var13 && var12 - arg3 == var11 && (this.field1125[var9][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var9 - arg3 == var10 && var12 >= var11 && var14 >= var12 && (this.field1125[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 >= var10 && var13 >= var9 && (var12 + 1) == var11) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var11 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var10 <= var9 && var9 <= var13 && (var12 - arg3) == var11 && (this.field1125[var9][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if (var9 - arg3 == var10 && var11 <= var12 && var14 >= var12 && (this.field1125[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 <= var9 && var9 <= var13 && (var12 + 1) == var11 && (this.field1125[var9][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var11 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var10 <= var9 && var13 >= var9 && var12 - arg3 == var11) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var9 - arg3 == var10 && var12 >= var11 && var14 >= var12) {
                        return true;
                    }
                    if (var10 <= var9 && var13 >= var9 && (var12 + 1) == var11 && (this.field1125[var9][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var10 && var12 >= var11 && var14 >= var12 && (this.field1125[var10][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 >= var10 && var13 >= var9 && (var12 - arg3) == var11) {
                        return true;
                    }
                }
            }
            if (arg1 == 9) {
                if (var10 <= var9 && var9 <= var13 && var12 + 1 == var11 && (this.field1125[var9][var11] & 0x12C0120) == 0) {
                    return true;
                }
                if (var9 >= var10 && var13 >= var9 && var12 - arg3 == var11 && (this.field1125[var9][var14] & 0x12C0102) == 0) {
                    return true;
                }
                if (var9 - arg3 == var10 && var12 >= var11 && var12 <= var14 && (this.field1125[var13][var12] & 0x12C0108) == 0) {
                    return true;
                }
                if (var9 + 1 == var10 && var11 <= var12 && var14 >= var12 && (this.field1125[var10][var12] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIIIIIIII)Z")
    private final boolean method539(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1123++;
        int var11 = arg1 + arg2;
        int var12 = arg0 + arg9;
        int var13 = arg5 + arg8;
        if (arg6 >= -1) {
            return true;
        }
        int var14 = arg3 + arg7;
        if (arg0 <= arg1 && var12 > arg1) {
            if (arg5 == var14 && (arg4 & 0x4) == 0) {
                int var15 = arg1;
                int var16 = var12 < var11 ? var12 : var11;
                while (var15 < var16) {
                    if ((this.field1125[var15 - this.field1115][var14 - this.field1132 - 1] & 0x2) == 0) {
                        return true;
                    }
                    var15++;
                }
            } else if (arg3 == var13 && (arg4 & 0x1) == 0) {
                int var17 = arg1;
                int var18 = var11 > var12 ? var12 : var11;
                while (var17 < var18) {
                    if ((this.field1125[var17 - this.field1115][arg3 - this.field1132] & 0x20) == 0) {
                        return true;
                    }
                    var17++;
                }
            }
        } else if (var11 > arg0 && var12 >= var11) {
            if (arg5 == var14 && (arg4 & 0x4) == 0) {
                for (int var19 = arg0; var19 < var11; var19++) {
                    if ((this.field1125[var19 - this.field1115][var14 - this.field1132 - 1] & 0x2) == 0) {
                        return true;
                    }
                }
            } else if (arg3 == var13 && (arg4 & 0x1) == 0) {
                for (int var20 = arg0; var20 < var11; var20++) {
                    if ((this.field1125[var20 - this.field1115][arg3 - this.field1132] & 0x20) == 0) {
                        return true;
                    }
                }
            }
        } else if (arg5 <= arg3 && var13 > arg3) {
            if (arg0 == var11 && (arg4 & 0x8) == 0) {
                int var21 = arg3;
                int var22 = var14 > var13 ? var13 : var14;
                while (var22 > var21) {
                    if ((this.field1125[var11 - this.field1115 - 1][var21 - this.field1132] & 0x8) == 0) {
                        return true;
                    }
                    var21++;
                }
            } else if (arg1 == var12 && (arg4 & 0x2) == 0) {
                int var23 = arg3;
                int var24 = var13 >= var14 ? var14 : var13;
                while (var23 < var24) {
                    if ((this.field1125[arg1 - this.field1115][var23 - this.field1132] & 0x80) == 0) {
                        return true;
                    }
                    var23++;
                }
            }
        } else if (var14 > arg5 && var13 >= var14) {
            if (arg0 == var11 && (arg4 & 0x8) == 0) {
                for (int var25 = arg5; var25 < var14; var25++) {
                    if ((this.field1125[var11 - this.field1115 - 1][var25 - this.field1132] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg1 == var12 && (arg4 & 0x2) == 0) {
                for (int var26 = arg5; var26 < var14; var26++) {
                    if ((this.field1125[arg1 - this.field1115][var26 - this.field1132] & 0x80) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIIIIZ)V")
    public final void method540(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field1121++;
        int var8 = arg2 - this.field1115;
        int var9 = arg1 - this.field1132;
        if (arg3 == 1 || arg3 == 3) {
            int var10 = arg4;
            arg4 = arg0;
            arg0 = var10;
        }
        int var11 = 256;
        if (arg6) {
            var11 += 131072;
        }
        if (arg5 != 0) {
            field1136 = null;
        }
        for (int var12 = var8; var12 < (arg4 + var8); var12++) {
            if (var12 >= 0 && var12 < this.field1140) {
                for (int var13 = var9; var13 < arg0 + var9; var13++) {
                    if (var13 >= 0 && this.field1120 > var13) {
                        this.method533(var11, arg5 + 29306, var12, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIIIBIII)Z")
    private final boolean method541(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8) {
        field1126++;
        if (arg4 < (arg0 + arg8) && (arg1 + arg4) > arg8) {
            int var10 = -37 % ((69 - arg5) / 54);
            return arg6 < (arg3 + arg7) && (arg6 + arg2) > arg7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IILgk;Lgk;Z)I")
    public static final int method542(int arg0, int arg1, class157 arg2, class157 arg3, boolean arg4) {
        field1134++;
        int var5 = 28 % ((arg1 + 24) / 54);
        if (arg0 == 1) {
            int var6 = arg3.field1477;
            int var7 = arg2.field1477;
            if (!arg4) {
                if (var7 == -1) {
                    var7 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var6 - var7;
        } else if (arg0 == 2) {
            return class218.method1476(1, arg2.method1059((byte) -94).field1851, arg3.method1059((byte) -100).field1851, class48.field614);
        } else if (arg0 == 3) {
            if (arg3.field2423.equals("-")) {
                if (arg2.field2423.equals("-")) {
                    return 0;
                } else if (arg4) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg2.field2423.equals("-")) {
                return arg4 ? 1 : -1;
            } else {
                return class218.method1476(1, arg2.field2423, arg3.field2423, class48.field614);
            }
        } else if (arg0 == 4) {
            if (arg3.method636((byte) 117)) {
                return arg2.method636((byte) 123) ? 0 : 1;
            } else if (arg2.method636((byte) 121)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg0 == 5) {
            if (arg3.method638(35)) {
                return arg2.method638(45) ? 0 : 1;
            } else if (arg2.method638(124)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg0 == 6) {
            if (arg3.method637((byte) -69)) {
                return arg2.method637((byte) 72) ? 0 : 1;
            } else if (arg2.method637((byte) 72)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg0 != 7) {
            return arg3.field2421 - arg2.field2421;
        } else if (arg3.method642(21649)) {
            return arg2.method642(21649) ? 0 : 1;
        } else if (arg2.method642(21649)) {
            return -1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method543(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1135++;
        if (arg6 == 1) {
            if (arg2 == arg4 && arg1 == arg7) {
                return true;
            }
        } else if (arg4 <= arg2 && arg2 <= arg4 + arg6 - 1 && arg7 <= arg7 && arg7 <= arg6 + arg7 - 1) {
            return true;
        }
        int var9 = arg7 - this.field1132;
        int var10 = arg2 - this.field1115;
        int var11 = arg1 - this.field1132;
        if (arg5 != 1) {
            this.method533(63, -39, 106, -46);
        }
        int var12 = arg4 - this.field1115;
        if (arg6 == 1) {
            if (arg3 == 6 || arg3 == 7) {
                if (arg3 == 7) {
                    arg0 = arg0 + 2 & 0x3;
                }
                if (arg0 == 0) {
                    if ((var10 + 1) == var12 && var9 == var11 && (this.field1125[var12][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var9 - 1) == var11 && (this.field1125[var12][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var10 - 1 == var12 && var9 == var11 && (this.field1125[var12][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var9 - 1 == var11 && (this.field1125[var12][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if (var10 - 1 == var12 && var9 == var11 && (this.field1125[var12][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var9 + 1 == var11 && (this.field1125[var12][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if ((var10 + 1) == var12 && var9 == var11 && (this.field1125[var12][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var9 + 1 == var11 && (this.field1125[var12][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 8) {
                if (var10 == var12 && var9 + 1 == var11 && (this.field1125[var12][var11] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var12 && (var9 - 1) == var11 && (this.field1125[var12][var11] & 0x2) == 0) {
                    return true;
                }
                if ((var10 - 1) == var12 && var9 == var11 && (this.field1125[var12][var11] & 0x8) == 0) {
                    return true;
                }
                if ((var10 + 1) == var12 && var9 == var11 && (this.field1125[var12][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var12 + arg6 - 1;
            int var14 = arg6 + var11 - 1;
            if (arg3 == 6 || arg3 == 7) {
                if (arg3 == 7) {
                    arg0 = arg0 + 2 & 0x3;
                }
                if (arg0 == 0) {
                    if ((var10 + 1) == var12 && var9 >= var11 && var9 <= var14 && (this.field1125[var12][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 >= var12 && var13 >= var10 && var9 - arg6 == var11 && (this.field1125[var10][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if ((var10 - arg6) == var12 && var9 >= var11 && var9 <= var14 && (this.field1125[var13][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 >= var12 && var13 >= var10 && (var9 - arg6) == var11 && (this.field1125[var10][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if (var10 - arg6 == var12 && var9 >= var11 && var9 <= var14 && (this.field1125[var13][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 <= var10 && var13 >= var10 && var9 + 1 == var11 && (this.field1125[var10][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if ((var10 + 1) == var12 && var11 <= var9 && var14 >= var9 && (this.field1125[var12][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 >= var12 && var13 >= var10 && (var9 + 1) == var11 && (this.field1125[var10][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 8) {
                if (var10 >= var12 && var13 >= var10 && (var9 + 1) == var11 && (this.field1125[var10][var11] & 0x20) == 0) {
                    return true;
                }
                if (var10 >= var12 && var10 <= var13 && (var9 - arg6) == var11 && (this.field1125[var10][var14] & 0x2) == 0) {
                    return true;
                }
                if ((var10 - arg6) == var12 && var9 >= var11 && var14 >= var9 && (this.field1125[var13][var9] & 0x8) == 0) {
                    return true;
                }
                if ((var10 + 1) == var12 && var9 >= var11 && var9 <= var14 && (this.field1125[var12][var9] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIZBI)V")
    public final void method544(int arg0, int arg1, int arg2, boolean arg3, byte arg4, int arg5) {
        int var7 = arg1 - this.field1115;
        field1138++;
        int var8 = arg5 - this.field1132;
        if (arg0 == 0) {
            if (arg2 == 0) {
                this.method550(-5311, var7, 128, var8);
                this.method550(-5311, var7 - 1, 8, var8);
            }
            if (arg2 == 1) {
                this.method550(-5311, var7, 2, var8);
                this.method550(-5311, var7, 32, var8 + 1);
            }
            if (arg2 == 2) {
                this.method550(-5311, var7, 8, var8);
                this.method550(-5311, var7 + 1, 128, var8);
            }
            if (arg2 == 3) {
                this.method550(-5311, var7, 32, var8);
                this.method550(-5311, var7, 2, var8 - 1);
            }
        }
        if (arg4 <= 13) {
            field1142 = -14;
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg2 == 0) {
                this.method550(-5311, var7, 1, var8);
                this.method550(-5311, var7 - 1, 16, var8 + 1);
            }
            if (arg2 == 1) {
                this.method550(-5311, var7, 4, var8);
                this.method550(-5311, var7 + 1, 64, var8 + 1);
            }
            if (arg2 == 2) {
                this.method550(-5311, var7, 16, var8);
                this.method550(-5311, var7 + 1, 1, var8 - 1);
            }
            if (arg2 == 3) {
                this.method550(-5311, var7, 64, var8);
                this.method550(-5311, var7 - 1, 4, var8 - 1);
            }
        }
        if (arg0 == 2) {
            if (arg2 == 0) {
                this.method550(-5311, var7, 130, var8);
                this.method550(-5311, var7 - 1, 8, var8);
                this.method550(-5311, var7, 32, var8 + 1);
            }
            if (arg2 == 1) {
                this.method550(-5311, var7, 10, var8);
                this.method550(-5311, var7, 32, var8 + 1);
                this.method550(-5311, var7 + 1, 128, var8);
            }
            if (arg2 == 2) {
                this.method550(-5311, var7, 40, var8);
                this.method550(-5311, var7 + 1, 128, var8);
                this.method550(-5311, var7, 2, var8 - 1);
            }
            if (arg2 == 3) {
                this.method550(-5311, var7, 160, var8);
                this.method550(-5311, var7, 2, var8 - 1);
                this.method550(-5311, var7 - 1, 8, var8);
            }
        }
        if (!arg3) {
            return;
        }
        if (arg0 == 0) {
            if (arg2 == 0) {
                this.method550(-5311, var7, 65536, var8);
                this.method550(-5311, var7 - 1, 4096, var8);
            }
            if (arg2 == 1) {
                this.method550(-5311, var7, 1024, var8);
                this.method550(-5311, var7, 16384, var8 + 1);
            }
            if (arg2 == 2) {
                this.method550(-5311, var7, 4096, var8);
                this.method550(-5311, var7 + 1, 65536, var8);
            }
            if (arg2 == 3) {
                this.method550(-5311, var7, 16384, var8);
                this.method550(-5311, var7, 1024, var8 - 1);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg2 == 0) {
                this.method550(-5311, var7, 512, var8);
                this.method550(-5311, var7 - 1, 8192, var8 + 1);
            }
            if (arg2 == 1) {
                this.method550(-5311, var7, 2048, var8);
                this.method550(-5311, var7 + 1, 32768, var8 + 1);
            }
            if (arg2 == 2) {
                this.method550(-5311, var7, 8192, var8);
                this.method550(-5311, var7 + 1, 512, var8 - 1);
            }
            if (arg2 == 3) {
                this.method550(-5311, var7, 32768, var8);
                this.method550(-5311, var7 - 1, 2048, var8 - 1);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method550(-5311, var7, 66560, var8);
            this.method550(-5311, var7 - 1, 4096, var8);
            this.method550(-5311, var7, 16384, var8 + 1);
        }
        if (arg2 == 1) {
            this.method550(-5311, var7, 5120, var8);
            this.method550(-5311, var7, 16384, var8 + 1);
            this.method550(-5311, var7 + 1, 65536, var8);
        }
        if (arg2 == 2) {
            this.method550(-5311, var7, 20480, var8);
            this.method550(-5311, var7 + 1, 65536, var8);
            this.method550(-5311, var7, 1024, var8 - 1);
        }
        if (arg2 == 3) {
            this.method550(-5311, var7, 81920, var8);
            this.method550(-5311, var7, 1024, var8 - 1);
            this.method550(-5311, var7 - 1, 4096, var8);
            return;
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)V")
    public static final void method545(int arg0) {
        class139.field2044++;
        class13.field165.method892(71, (byte) -89);
        class13.field165.method184(class277.method1859(-127), 85);
        field1124++;
        class13.field165.method223(-1720191288, class135.field1960);
        class13.field165.method223(-1720191288, class98.field1510);
        if (arg0 > 85) {
            class13.field165.method184(class229.field3703, 114);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V")
    public final void method546(byte arg0) {
        field1119++;
        int var2 = 0;
        int var3 = 16 / ((-arg0 - 90) / 32);
        while (this.field1140 > var2) {
            for (int var4 = 0; var4 < this.field1120; var4++) {
                if (var2 == 0 || var4 == 0 || this.field1140 - 5 <= var2 || var4 >= this.field1120 - 5) {
                    this.field1125[var2][var4] = 16777215;
                } else {
                    this.field1125[var2][var4] = 16777216;
                }
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(III)V")
    public final void method547(int arg0, int arg1, int arg2) {
        if (arg2 != 5162) {
            field1129 = -118;
        }
        int var4 = arg1 - this.field1115;
        int var5 = arg0 - this.field1132;
        this.field1125[var4][var5] = class120.method787(this.field1125[var4][var5], 262144);
        field1127++;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIZIBI)V")
    public final void method548(int arg0, int arg1, boolean arg2, int arg3, byte arg4, int arg5) {
        int var7 = arg5 - this.field1115;
        field1137++;
        int var8 = arg1 - this.field1132;
        if (arg4 != -118) {
            this.method543(54, -54, 98, 124, 5, 30, 123, -22);
        }
        int var9 = 256;
        if (arg2) {
            var9 += 131072;
        }
        for (int var10 = var7; var10 < var7 + arg0; var10++) {
            if (var10 >= 0 && this.field1140 > var10) {
                for (int var11 = var8; var11 < arg3 + var8; var11++) {
                    if (var11 >= 0 && var11 < this.field1120) {
                        this.method550(-5311, var10, var9, var11);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIIIIIII)Z")
    public final boolean method549(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1130++;
        if (arg2 > 1) {
            return this.method541(arg5, arg2, arg2, arg4, arg3, (byte) 12, arg6, arg7, arg0) ? true : this.method539(arg0, arg3, arg2, arg6, arg1, arg7, -36, arg2, arg4, arg5);
        }
        int var10 = -10 % ((66 - arg8) / 58);
        int var11 = arg4 + arg7 - 1;
        int var12 = arg5 + arg0 - 1;
        if (arg0 <= arg3 && var12 >= arg3 && arg6 >= arg7 && arg6 <= var11) {
            return true;
        } else if ((arg0 - 1) == arg3 && arg6 >= arg7 && var11 >= arg6 && (this.field1125[arg3 - this.field1115][arg6 - this.field1132] & 0x8) == 0 && (arg1 & 0x8) == 0) {
            return true;
        } else if ((var12 + 1) == arg3 && arg7 <= arg6 && arg6 <= var11 && (this.field1125[arg3 - this.field1115][arg6 - this.field1132] & 0x80) == 0 && (arg1 & 0x2) == 0) {
            return true;
        } else if (arg7 - 1 == arg6 && arg0 <= arg3 && var12 >= arg3 && (this.field1125[arg3 - this.field1115][arg6 - this.field1132] & 0x2) == 0 && (arg1 & 0x4) == 0) {
            return true;
        } else {
            return var11 + 1 == arg6 && arg3 >= arg0 && arg3 <= var12 && (this.field1125[arg3 - this.field1115][arg6 - this.field1132] & 0x20) == 0 && (arg1 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(IIII)V")
    private final void method550(int arg0, int arg1, int arg2, int arg3) {
        field1122++;
        if (arg0 != -5311) {
            this.field1125 = null;
        }
        this.field1125[arg1][arg3] = class120.method787(this.field1125[arg1][arg3], arg2);
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(I)I")
    public static final int method551(int arg0) {
        field1128++;
        if (arg0 != 8) {
            method545(114);
        }
        return class87.field1375;
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(II)V")
    public class79(int arg0, int arg1) {
        this.field1140 = arg0;
        this.field1115 = 0;
        this.field1132 = 0;
        this.field1120 = arg1;
        this.field1125 = new int[this.field1140][this.field1120];
        this.method546((byte) 57);
    }
}
