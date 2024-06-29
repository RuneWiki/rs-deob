import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class119 {

    @OriginalMember(owner = "client!p", name = "k", descriptor = "Liq;")
    public static class362 field1457 = new class362("green:", "grün:", "vert:", "verde:");

    @OriginalMember(owner = "client!p", name = "o", descriptor = "[Lkb;")
    public static class412[] field1461 = new class412[14];

    @OriginalMember(owner = "client!p", name = "a", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!p", name = "c", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "I")
    public static int field1450;

    @OriginalMember(owner = "client!p", name = "e", descriptor = "I")
    public static int field1451;

    @OriginalMember(owner = "client!p", name = "f", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!p", name = "g", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!p", name = "h", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!p", name = "i", descriptor = "I")
    public int field1455;

    @OriginalMember(owner = "client!p", name = "j", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!p", name = "l", descriptor = "I")
    public static int field1458;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "I")
    public int field1459;

    @OriginalMember(owner = "client!p", name = "n", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!p", name = "p", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!p", name = "q", descriptor = "I")
    public static int field1463;

    @OriginalMember(owner = "client!p", name = "r", descriptor = "I")
    public static int field1464;

    @OriginalMember(owner = "client!p", name = "s", descriptor = "I")
    public int field1465;

    @OriginalMember(owner = "client!p", name = "t", descriptor = "I")
    public int field1466;

    @OriginalMember(owner = "client!p", name = "u", descriptor = "I")
    public static int field1467;

    @OriginalMember(owner = "client!p", name = "w", descriptor = "I")
    public static int field1469;

    @OriginalMember(owner = "client!p", name = "x", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!p", name = "y", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!p", name = "z", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!p", name = "A", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!p", name = "v", descriptor = "[[I")
    public int[][] field1468;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIZIZIII)V", line = 3)
    public final void method732(int arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        field1464++;
        int var9 = 256;
        int var10 = -40 % ((-arg5 - 36) / 38);
        if (arg2) {
            var9 |= 0x20000;
        }
        if (arg4) {
            var9 |= 0x40000000;
        }
        if (arg6 == 1 || arg6 == 3) {
            int var11 = arg7;
            arg7 = arg0;
            arg0 = var11;
        }
        int var12 = arg3 - this.field1455;
        int var13 = arg1 - this.field1466;
        for (int var14 = var12; var14 < (arg7 + var12); var14++) {
            if (var14 >= 0 && this.field1465 > var14) {
                for (int var15 = var13; var15 < (arg0 + var13); var15++) {
                    if (var15 >= 0 && this.field1459 > var15) {
                        this.method736(var15, var14, 96, var9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(III)V", line = 57)
    public final void method733(int arg0, int arg1, int arg2) {
        field1450++;
        int var4 = arg1 - this.field1466;
        if (arg2 != 8) {
            method746(false);
        }
        int var5 = arg0 - this.field1455;
        this.field1468[var5][var4] = class33.method210(this.field1468[var5][var4], -262145);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIII)V", line = 82)
    private final void method734(int arg0, int arg1, int arg2, int arg3) {
        field1462++;
        this.field1468[arg1][arg3] = class429.method2704(this.field1468[arg1][arg3], arg0);
        if (arg2 != -1) {
            method750((String) null, (byte) -102);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIIZZI)V", line = 96)
    public final void method735(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5, int arg6) {
        int var8 = arg6 - this.field1466;
        int var9 = arg3 - this.field1455;
        field1452++;
        if (arg1 == 0) {
            if (arg0 == 0) {
                this.method734(128, var9, -1, var8);
                this.method734(8, var9 - 1, -1, var8);
            }
            if (arg0 == 1) {
                this.method734(2, var9, -1, var8);
                this.method734(32, var9, -1, var8 + 1);
            }
            if (arg0 == 2) {
                this.method734(8, var9, -1, var8);
                this.method734(128, var9 + 1, arg2 ^ 0xFFFFFFFE, var8);
            }
            if (arg0 == 3) {
                this.method734(32, var9, -1, var8);
                this.method734(2, var9, arg2 - 2, var8 + -1);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg0 == 0) {
                this.method734(1, var9, -1, var8);
                this.method734(16, var9 - 1, -1, var8 + 1);
            }
            if (arg0 == 1) {
                this.method734(4, var9, -1, var8);
                this.method734(64, var9 + 1, -1, var8 + 1);
            }
            if (arg0 == 2) {
                this.method734(16, var9, -1, var8);
                this.method734(1, var9 + 1, -1, var8 + -1);
            }
            if (arg0 == 3) {
                this.method734(64, var9, -1, var8);
                this.method734(4, var9 - 1, arg2 + -2, var8 - 1);
            }
        }
        if (arg1 == 2) {
            if (arg0 == 0) {
                this.method734(130, var9, -1, var8);
                this.method734(8, var9 - 1, arg2 + -2, var8);
                this.method734(32, var9, -1, var8 + 1);
            }
            if (arg0 == 1) {
                this.method734(10, var9, -1, var8);
                this.method734(32, var9, -1, var8 + 1);
                this.method734(128, var9 + 1, arg2 + -2, var8);
            }
            if (arg0 == 2) {
                this.method734(40, var9, -1, var8);
                this.method734(128, var9 + 1, -1, var8);
                this.method734(2, var9, arg2 ^ 0xFFFFFFFE, var8 - 1);
            }
            if (arg0 == 3) {
                this.method734(160, var9, -1, var8);
                this.method734(2, var9, -1, var8 - 1);
                this.method734(8, var9 - 1, -1, var8);
            }
        }
        if (arg4) {
            if (arg1 == 0) {
                if (arg0 == 0) {
                    this.method734(65536, var9, -1, var8);
                    this.method734(4096, var9 - 1, -1, var8);
                }
                if (arg0 == 1) {
                    this.method734(1024, var9, -1, var8);
                    this.method734(16384, var9, -1, var8 + 1);
                }
                if (arg0 == 2) {
                    this.method734(4096, var9, arg2 ^ 0xFFFFFFFE, var8);
                    this.method734(65536, var9 + 1, -1, var8);
                }
                if (arg0 == 3) {
                    this.method734(16384, var9, -1, var8);
                    this.method734(1024, var9, arg2 ^ 0xFFFFFFFE, var8 - 1);
                }
            }
            if (arg1 == 1 || arg1 == 3) {
                if (arg0 == 0) {
                    this.method734(512, var9, -1, var8);
                    this.method734(8192, var9 - 1, -1, var8 + 1);
                }
                if (arg0 == 1) {
                    this.method734(2048, var9, -1, var8);
                    this.method734(32768, var9 + 1, -1, var8 + 1);
                }
                if (arg0 == 2) {
                    this.method734(8192, var9, -1, var8);
                    this.method734(512, var9 + 1, -1, var8 + -1);
                }
                if (arg0 == 3) {
                    this.method734(32768, var9, -1, var8);
                    this.method734(2048, var9 - 1, -1, var8 - 1);
                }
            }
            if (arg1 == 2) {
                if (arg0 == 0) {
                    this.method734(66560, var9, -1, var8);
                    this.method734(4096, var9 - 1, -1, var8);
                    this.method734(16384, var9, -1, var8 + 1);
                }
                if (arg0 == 1) {
                    this.method734(5120, var9, -1, var8);
                    this.method734(16384, var9, -1, var8 + 1);
                    this.method734(65536, var9 + 1, -1, var8);
                }
                if (arg0 == 2) {
                    this.method734(20480, var9, -1, var8);
                    this.method734(65536, var9 + 1, -1, var8);
                    this.method734(1024, var9, arg2 ^ 0xFFFFFFFE, var8 - 1);
                }
                if (arg0 == 3) {
                    this.method734(81920, var9, arg2 ^ 0xFFFFFFFE, var8);
                    this.method734(1024, var9, -1, var8 - 1);
                    this.method734(4096, var9 - 1, -1, var8);
                }
            }
        }
        if (arg2 != 1) {
            this.method740(7, -93, 14, 43, -81, 57, 19, -88);
        }
        if (!arg5) {
            return;
        }
        if (arg1 == 0) {
            if (arg0 == 0) {
                this.method734(536870912, var9, -1, var8);
                this.method734(33554432, var9 - 1, arg2 ^ 0xFFFFFFFE, var8);
            }
            if (arg0 == 1) {
                this.method734(8388608, var9, -1, var8);
                this.method734(134217728, var9, arg2 - 2, var8 + 1);
            }
            if (arg0 == 2) {
                this.method734(33554432, var9, arg2 - 2, var8);
                this.method734(536870912, var9 + 1, -1, var8);
            }
            if (arg0 == 3) {
                this.method734(134217728, var9, -1, var8);
                this.method734(8388608, var9, -1, var8 - 1);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg0 == 0) {
                this.method734(4194304, var9, -1, var8);
                this.method734(67108864, var9 - 1, -1, var8 + 1);
            }
            if (arg0 == 1) {
                this.method734(16777216, var9, arg2 ^ 0xFFFFFFFE, var8);
                this.method734(268435456, var9 + 1, -1, var8 + 1);
            }
            if (arg0 == 2) {
                this.method734(67108864, var9, arg2 ^ 0xFFFFFFFE, var8);
                this.method734(4194304, var9 + 1, arg2 ^ 0xFFFFFFFE, var8 - 1);
            }
            if (arg0 == 3) {
                this.method734(268435456, var9, -1, var8);
                this.method734(16777216, var9 - 1, -1, var8 - 1);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method734(545259520, var9, -1, var8);
            this.method734(33554432, var9 - 1, -1, var8);
            this.method734(134217728, var9, -1, var8 + 1);
        }
        if (arg0 == 1) {
            this.method734(41943040, var9, -1, var8);
            this.method734(134217728, var9, arg2 - 2, var8 - -1);
            this.method734(536870912, var9 + 1, arg2 ^ 0xFFFFFFFE, var8);
        }
        if (arg0 == 2) {
            this.method734(167772160, var9, arg2 - 2, var8);
            this.method734(536870912, var9 + 1, -1, var8);
            this.method734(8388608, var9, -1, var8 - 1);
        }
        if (arg0 == 3) {
            this.method734(671088640, var9, -1, var8);
            this.method734(8388608, var9, -1, var8 - 1);
            this.method734(33554432, var9 - 1, -1, var8);
            return;
        }
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(IIII)V", line = 405)
    private final void method736(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 <= 46) {
            this.method736(-124, -46, -50, 18);
        }
        field1467++;
        this.field1468[arg1][arg0] = class33.method210(this.field1468[arg1][arg0], ~arg3);
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(III)V", line = 423)
    public final void method737(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field1455;
        field1460++;
        int var5 = arg1 - this.field1466;
        this.field1468[var4][var5] = class33.method210(this.field1468[var4][var5], arg2);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIIIIIIII)Z", line = 433)
    public final boolean method738(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1463++;
        if (arg4 != 1180666916) {
            return true;
        }
        int var11 = arg3 + arg8;
        int var12 = arg6 + arg7;
        int var13 = arg5 + arg2;
        int var14 = arg0 + arg9;
        if (arg8 == var13 && (arg1 & 0x2) == 0) {
            int var15 = arg6 <= arg9 ? arg9 : arg6;
            int var16 = var12 >= var14 ? var14 : var12;
            while (var15 < var16) {
                if ((this.field1468[var13 - this.field1455 - 1][var15 - this.field1466] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg5 == var11 && (arg1 & 0x8) == 0) {
            int var17 = arg9 >= arg6 ? arg9 : arg6;
            int var18 = var14 > var12 ? var12 : var14;
            while (var18 > var17) {
                if ((this.field1468[arg5 - this.field1455][var17 - this.field1466] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg6 == var14 && (arg1 & 0x1) == 0) {
            int var19 = arg8 <= arg5 ? arg5 : arg8;
            int var20 = var13 > var11 ? var11 : var13;
            while (var19 < var20) {
                if ((this.field1468[var19 - this.field1455][var14 - this.field1466 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg9 == var12 && (arg1 & 0x4) == 0) {
            int var21 = arg5 >= arg8 ? arg5 : arg8;
            int var22 = var13 > var11 ? var11 : var13;
            while (var21 < var22) {
                if ((this.field1468[var21 - this.field1455][arg9 - this.field1466] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V", line = 530)
    public static final void method739(byte arg0) {
        int var1 = 41 / ((arg0 - 34) / 54);
        class345.field4887.method1626((byte) 106);
        field1473++;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIIIIII)Z", line = 541)
    public final boolean method740(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1456++;
        if (arg5 == 1) {
            if (arg4 == arg6 && arg0 == arg1) {
                return true;
            }
        } else if (arg4 >= arg6 && arg4 <= (arg5 + arg6 - 1) && arg0 >= arg0 && (arg0 + arg5 - 1) >= arg0) {
            return true;
        }
        int var9 = arg0 - this.field1466;
        int var10 = arg6 - this.field1455;
        if (arg2 != 8192) {
            return true;
        }
        int var11 = arg1 - this.field1466;
        int var12 = arg4 - this.field1455;
        if (arg5 == 1) {
            if (arg3 == 6 || arg3 == 7) {
                if (arg3 == 7) {
                    arg7 = arg7 + 2 & 0x3;
                }
                if (arg7 == 0) {
                    if (var12 + 1 == var10 && var9 == var11 && (this.field1468[var10][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var9 - 1 == var11 && (this.field1468[var10][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if ((var12 - 1) == var10 && var9 == var11 && (this.field1468[var10][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var9 - 1 == var11 && (this.field1468[var10][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if ((var12 - 1) == var10 && var9 == var11 && (this.field1468[var10][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var9 + 1) == var11 && (this.field1468[var10][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if (var12 + 1 == var10 && var9 == var11 && (this.field1468[var10][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var9 + 1) == var11 && (this.field1468[var10][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 8) {
                if (var10 == var12 && (var9 + 1) == var11 && (this.field1468[var10][var11] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var12 && (var9 - 1) == var11 && (this.field1468[var10][var11] & 0x2) == 0) {
                    return true;
                }
                if (var12 - 1 == var10 && var9 == var11 && (this.field1468[var10][var11] & 0x8) == 0) {
                    return true;
                }
                if ((var12 + 1) == var10 && var9 == var11 && (this.field1468[var10][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var10 + arg5 - 1;
            int var14 = var11 - (1 - arg5);
            if (arg3 == 6 || arg3 == 7) {
                if (arg3 == 7) {
                    arg7 = arg7 + 2 & 0x3;
                }
                if (arg7 == 0) {
                    if ((var12 + 1) == var10 && var11 <= var9 && var9 <= var14 && (this.field1468[var10][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 >= var10 && var12 <= var13 && (var9 - arg5) == var11 && (this.field1468[var12][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if ((var12 - arg5) == var10 && var9 >= var11 && var14 >= var9 && (this.field1468[var13][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 <= var12 && var13 >= var12 && (var9 - arg5) == var11 && (this.field1468[var12][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if ((var12 - arg5) == var10 && var9 >= var11 && var14 >= var9 && (this.field1468[var13][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 >= var10 && var13 >= var12 && var9 + 1 == var11 && (this.field1468[var12][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if ((var12 + 1) == var10 && var9 >= var11 && var14 >= var9 && (this.field1468[var10][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 >= var10 && var12 <= var13 && (var9 + 1) == var11 && (this.field1468[var12][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 8) {
                if (var12 >= var10 && var13 >= var12 && var9 + 1 == var11 && (this.field1468[var12][var11] & 0x20) == 0) {
                    return true;
                }
                if (var12 >= var10 && var12 <= var13 && var9 - arg5 == var11 && (this.field1468[var12][var14] & 0x2) == 0) {
                    return true;
                }
                if (var12 - arg5 == var10 && var11 <= var9 && var14 >= var9 && (this.field1468[var13][var9] & 0x8) == 0) {
                    return true;
                }
                if ((var12 + 1) == var10 && var11 <= var9 && var9 <= var14 && (this.field1468[var10][var9] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Z)V", line = 740)
    public final void method741(boolean arg0) {
        if (arg0) {
            this.field1455 = 102;
        }
        for (int var2 = 0; var2 < this.field1465; var2++) {
            for (int var3 = 0; var3 < this.field1459; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= (this.field1465 - 5) || var3 >= (this.field1459 - 5)) {
                    this.field1468[var2][var3] = -1;
                } else {
                    this.field1468[var2][var3] = 2097152;
                }
            }
        }
        field1453++;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIB)V", line = 771)
    public final void method742(int arg0, int arg1, byte arg2) {
        int var4 = arg0 - this.field1466;
        if (arg2 == -98) {
            int var5 = arg1 - this.field1455;
            field1447++;
            this.field1468[var5][var4] = class429.method2704(this.field1468[var5][var4], 2097152);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIIIIIII)Z", line = 789)
    public final boolean method743(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1451++;
        if (arg5 > 1) {
            return class40.method240(arg3, arg7, arg5, arg2, 0, arg4, arg5, arg6, arg8) ? true : this.method738(arg4, arg1, arg3, arg5, 1180666916, arg2, arg7, arg5, arg6, arg8);
        }
        int var10 = arg3 + arg2 - 1;
        int var11 = arg8 + arg4 - 1;
        int var12 = 66 % ((arg0 - 7) / 34);
        if (arg6 >= arg2 && arg6 <= var10 && arg8 <= arg7 && arg7 <= var11) {
            return true;
        } else if ((arg2 - 1) == arg6 && arg7 >= arg8 && arg7 <= var11 && (this.field1468[arg6 - this.field1455][arg7 - this.field1466] & 0x8) == 0 && (arg1 & 0x8) == 0) {
            return true;
        } else if (var10 + 1 == arg6 && arg7 >= arg8 && arg7 <= var11 && (this.field1468[arg6 - this.field1455][arg7 - this.field1466] & 0x80) == 0 && (arg1 & 0x2) == 0) {
            return true;
        } else if (arg8 - 1 == arg7 && arg6 >= arg2 && var10 >= arg6 && (this.field1468[arg6 - this.field1455][arg7 - this.field1466] & 0x2) == 0 && (arg1 & 0x4) == 0) {
            return true;
        } else {
            return var11 + 1 == arg7 && arg2 <= arg6 && arg6 <= var10 && (this.field1468[arg6 - this.field1455][arg7 - this.field1466] & 0x20) == 0 && (arg1 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(III)V", line = 831)
    public final void method744(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field1455;
        field1458++;
        if (arg1 != -12854) {
            this.method747(-110, -112, false, -62, -24, 96, true);
        }
        int var5 = arg0 - this.field1466;
        this.field1468[var4][var5] = class429.method2704(this.field1468[var4][var5], 262144);
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(IIIIIIII)Z", line = 846)
    public final boolean method745(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1470++;
        if (arg3 == 1) {
            if (arg0 == arg4 && arg1 == arg2) {
                return true;
            }
        } else if (arg0 <= arg4 && arg4 <= arg0 + arg3 - 1 && arg2 >= arg2 && arg2 <= (arg3 + arg2 - 1)) {
            return true;
        }
        int var9 = arg1 - this.field1466;
        int var10 = arg4 - this.field1455;
        int var11 = arg0 - this.field1455;
        int var12 = arg2 - this.field1466;
        if (arg6 != 421) {
            return true;
        }
        if (arg3 == 1) {
            if (arg5 == 0) {
                if (arg7 == 0) {
                    if (var10 - 1 == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var12 + 1 == var9 && (this.field1468[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var9 && (this.field1468[var11][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if (var10 == var11 && (var12 + 1) == var9) {
                        return true;
                    }
                    if (var10 - 1 == var11 && var9 == var12 && (this.field1468[var11][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 == var12 && (this.field1468[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if ((var10 + 1) == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9 && (this.field1468[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var9 && (this.field1468[var11][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if (var10 == var11 && var12 - 1 == var9) {
                        return true;
                    }
                    if ((var10 - 1) == var11 && var9 == var12 && (this.field1468[var11][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 == var12 && (this.field1468[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 2) {
                if (arg7 == 0) {
                    if ((var10 - 1) == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 == var12 && (this.field1468[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var9 && (this.field1468[var11][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if ((var10 - 1) == var11 && var9 == var12 && (this.field1468[var11][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 + 1 == var9) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var9 && (this.field1468[var11][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if (var10 - 1 == var11 && var9 == var12 && (this.field1468[var11][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9 && (this.field1468[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var9) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if (var10 - 1 == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9 && (this.field1468[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 == var12 && (this.field1468[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var9) {
                        return true;
                    }
                }
            }
            if (arg5 == 9) {
                if (var10 == var11 && (var12 + 1) == var9 && (this.field1468[var11][var9] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var11 && var12 - 1 == var9 && (this.field1468[var11][var9] & 0x2) == 0) {
                    return true;
                }
                if ((var10 - 1) == var11 && var9 == var12 && (this.field1468[var11][var9] & 0x8) == 0) {
                    return true;
                }
                if ((var10 + 1) == var11 && var9 == var12 && (this.field1468[var11][var9] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var11 - (1 - arg3);
            int var14 = arg3 + var9 - 1;
            if (arg5 == 0) {
                if (arg7 == 0) {
                    if (var10 - arg3 == var11 && var9 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var10 >= var11 && var10 <= var13 && (var12 + 1) == var9 && (this.field1468[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var13 >= var10 && (var12 - arg3) == var9 && (this.field1468[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if (var10 >= var11 && var10 <= var13 && var12 + 1 == var9) {
                        return true;
                    }
                    if ((var10 - arg3) == var11 && var9 <= var12 && var12 <= var14 && (this.field1468[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var12 >= var9 && var14 >= var12 && (this.field1468[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if ((var10 + 1) == var11 && var12 >= var9 && var14 >= var12) {
                        return true;
                    }
                    if (var11 <= var10 && var10 <= var13 && var12 + 1 == var9 && (this.field1468[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var10 <= var13 && var12 - arg3 == var9 && (this.field1468[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if (var11 <= var10 && var10 <= var13 && var12 - arg3 == var9) {
                        return true;
                    }
                    if ((var10 - arg3) == var11 && var9 <= var12 && var12 <= var14 && (this.field1468[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 <= var12 && var12 <= var14 && (this.field1468[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 2) {
                if (arg7 == 0) {
                    if ((var10 - arg3) == var11 && var9 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var10 >= var11 && var13 >= var10 && var12 + 1 == var9) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 <= var12 && var12 <= var14 && (this.field1468[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var10 <= var13 && var12 - arg3 == var9 && (this.field1468[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if (var10 - arg3 == var11 && var12 >= var9 && var12 <= var14 && (this.field1468[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var13 >= var10 && var12 + 1 == var9) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var12 >= var9 && var14 >= var12) {
                        return true;
                    }
                    if (var10 >= var11 && var13 >= var10 && (var12 - arg3) == var9 && (this.field1468[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if ((var10 - arg3) == var11 && var12 >= var9 && var14 >= var12 && (this.field1468[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var13 >= var10 && var12 + 1 == var9 && (this.field1468[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var12 >= var9 && var12 <= var14) {
                        return true;
                    }
                    if (var10 >= var11 && var13 >= var10 && (var12 - arg3) == var9) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if ((var10 - arg3) == var11 && var9 <= var12 && var14 >= var12) {
                        return true;
                    }
                    if (var11 <= var10 && var10 <= var13 && var12 + 1 == var9 && (this.field1468[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var12 >= var9 && var14 >= var12 && (this.field1468[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var13 >= var10 && (var12 - arg3) == var9) {
                        return true;
                    }
                }
            }
            if (arg5 == 9) {
                if (var11 <= var10 && var10 <= var13 && var12 + 1 == var9 && (this.field1468[var10][var9] & 0x2C0120) == 0) {
                    return true;
                }
                if (var10 >= var11 && var10 <= var13 && (var12 - arg3) == var9 && (this.field1468[var10][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if ((var10 - arg3) == var11 && var9 <= var12 && var14 >= var12 && (this.field1468[var13][var12] & 0x2C0108) == 0) {
                    return true;
                }
                if ((var10 + 1) == var11 && var12 >= var9 && var12 <= var14 && (this.field1468[var11][var12] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(Z)V", line = 1221)
    public static final void method746(boolean arg0) {
        class347.field4907 = null;
        class73.field874 = null;
        class97.field1167 = null;
        class313.field4421 = null;
        class174.field2391 = null;
        class279.field3953 = null;
        if (!arg0) {
            field1461 = null;
        }
        class286.field4017 = null;
        class100.field1215 = null;
        class263.field3750 = null;
        class362.field5167 = null;
        class71.field818 = null;
        field1472++;
        class18.field215 = null;
        class405.field5851 = null;
        class7.field98 = null;
        class178.field2446 = null;
        class46.field550 = null;
        class406.field5864 = null;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIZIIIZ)V", line = 1251)
    public final void method747(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, boolean arg6) {
        int var8 = arg0 - this.field1466;
        int var9 = arg1 - this.field1455;
        field1449++;
        if (arg5 == 0) {
            if (arg4 == 0) {
                this.method736(var8, var9, arg3 - 16777144, 128);
                this.method736(var8, var9 - 1, arg3 + -16777137, 8);
            }
            if (arg4 == 1) {
                this.method736(var8, var9, arg3 - 16777115, 2);
                this.method736(var8 + 1, var9, arg3 ^ 0x100005B, 32);
            }
            if (arg4 == 2) {
                this.method736(var8, var9, 81, 8);
                this.method736(var8, var9 + 1, 57, 128);
            }
            if (arg4 == 3) {
                this.method736(var8, var9, 54, 32);
                this.method736(var8 - 1, var9, 95, 2);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg4 == 0) {
                this.method736(var8, var9, 90, 1);
                this.method736(var8 + 1, var9 + -1, 81, 16);
            }
            if (arg4 == 1) {
                this.method736(var8, var9, 58, 4);
                this.method736(var8 + 1, var9 - -1, arg3 ^ 0x1000075, 64);
            }
            if (arg4 == 2) {
                this.method736(var8, var9, 68, 16);
                this.method736(var8 - 1, var9 + 1, 51, 1);
            }
            if (arg4 == 3) {
                this.method736(var8, var9, 75, 64);
                this.method736(var8 - 1, var9 + -1, 48, 4);
            }
        }
        if (arg5 == 2) {
            if (arg4 == 0) {
                this.method736(var8, var9, 108, 130);
                this.method736(var8, var9 - 1, arg3 ^ 0x100003B, 8);
                this.method736(var8 + 1, var9, 69, 32);
            }
            if (arg4 == 1) {
                this.method736(var8, var9, 60, 10);
                this.method736(var8 + 1, var9, arg3 - 16777160, 32);
                this.method736(var8, var9 + 1, arg3 ^ 0x1000071, 128);
            }
            if (arg4 == 2) {
                this.method736(var8, var9, 112, 40);
                this.method736(var8, var9 + 1, arg3 ^ 0x1000052, 128);
                this.method736(var8 - 1, var9, arg3 ^ 0x1000054, 2);
            }
            if (arg4 == 3) {
                this.method736(var8, var9, 58, 160);
                this.method736(var8 - 1, var9, 58, 2);
                this.method736(var8, var9 - 1, arg3 ^ 0x1000059, 8);
            }
        }
        if (arg6) {
            if (arg5 == 0) {
                if (arg4 == 0) {
                    this.method736(var8, var9, 49, 65536);
                    this.method736(var8, var9 - 1, 122, 4096);
                }
                if (arg4 == 1) {
                    this.method736(var8, var9, 47, 1024);
                    this.method736(var8 + 1, var9, 96, 16384);
                }
                if (arg4 == 2) {
                    this.method736(var8, var9, 64, 4096);
                    this.method736(var8, var9 + 1, 68, 65536);
                }
                if (arg4 == 3) {
                    this.method736(var8, var9, 117, 16384);
                    this.method736(var8 - 1, var9, 88, 1024);
                }
            }
            if (arg5 == 1 || arg5 == 3) {
                if (arg4 == 0) {
                    this.method736(var8, var9, 106, 512);
                    this.method736(var8 + 1, var9 + -1, arg3 ^ 0x1000039, 8192);
                }
                if (arg4 == 1) {
                    this.method736(var8, var9, arg3 - 16777162, 2048);
                    this.method736(var8 + 1, var9 + 1, 81, 32768);
                }
                if (arg4 == 2) {
                    this.method736(var8, var9, arg3 ^ 0x1000032, 8192);
                    this.method736(var8 - 1, var9 + 1, 98, 512);
                }
                if (arg4 == 3) {
                    this.method736(var8, var9, 56, 32768);
                    this.method736(var8 - 1, var9 + -1, 63, 2048);
                }
            }
            if (arg5 == 2) {
                if (arg4 == 0) {
                    this.method736(var8, var9, arg3 - 16777111, 66560);
                    this.method736(var8, var9 - 1, 112, 4096);
                    this.method736(var8 + 1, var9, 64, 16384);
                }
                if (arg4 == 1) {
                    this.method736(var8, var9, 62, 5120);
                    this.method736(var8 + 1, var9, 87, 16384);
                    this.method736(var8, var9 + 1, 120, 65536);
                }
                if (arg4 == 2) {
                    this.method736(var8, var9, 59, 20480);
                    this.method736(var8, var9 + 1, 74, 65536);
                    this.method736(var8 - 1, var9, 72, 1024);
                }
                if (arg4 == 3) {
                    this.method736(var8, var9, 60, 81920);
                    this.method736(var8 - 1, var9, 76, 1024);
                    this.method736(var8, var9 - 1, 88, 4096);
                }
            }
        }
        if (arg2) {
            if (arg5 == 0) {
                if (arg4 == 0) {
                    this.method736(var8, var9, arg3 - 16777132, 536870912);
                    this.method736(var8, var9 - 1, 49, 33554432);
                }
                if (arg4 == 1) {
                    this.method736(var8, var9, 123, 8388608);
                    this.method736(var8 + 1, var9, 108, 134217728);
                }
                if (arg4 == 2) {
                    this.method736(var8, var9, 60, 33554432);
                    this.method736(var8, var9 + 1, arg3 ^ 0x1000031, 536870912);
                }
                if (arg4 == 3) {
                    this.method736(var8, var9, 123, 134217728);
                    this.method736(var8 - 1, var9, 94, 8388608);
                }
            }
            if (arg5 == 1 || arg5 == 3) {
                if (arg4 == 0) {
                    this.method736(var8, var9, 97, 4194304);
                    this.method736(var8 + 1, var9 + -1, 118, 67108864);
                }
                if (arg4 == 1) {
                    this.method736(var8, var9, 67, 16777216);
                    this.method736(var8 + 1, var9 + 1, 52, 268435456);
                }
                if (arg4 == 2) {
                    this.method736(var8, var9, 72, 67108864);
                    this.method736(var8 - 1, var9 + 1, 51, 4194304);
                }
                if (arg4 == 3) {
                    this.method736(var8, var9, arg3 - 16777100, 268435456);
                    this.method736(var8 - 1, var9 + -1, 61, 16777216);
                }
            }
            if (arg5 == 2) {
                if (arg4 == 0) {
                    this.method736(var8, var9, 73, 545259520);
                    this.method736(var8, var9 - 1, 117, 33554432);
                    this.method736(var8 + 1, var9, 106, 134217728);
                }
                if (arg4 == 1) {
                    this.method736(var8, var9, 97, 41943040);
                    this.method736(var8 + 1, var9, 71, 134217728);
                    this.method736(var8, var9 + 1, 50, 536870912);
                }
                if (arg4 == 2) {
                    this.method736(var8, var9, arg3 - 16777120, 167772160);
                    this.method736(var8, var9 + 1, 116, 536870912);
                    this.method736(var8 - 1, var9, arg3 - 16777143, 8388608);
                }
                if (arg4 == 3) {
                    this.method736(var8, var9, 66, 671088640);
                    this.method736(var8 - 1, var9, 97, 8388608);
                    this.method736(var8, var9 - 1, 110, 33554432);
                }
            }
        }
        if (arg3 != 16777216) {
            method739((byte) 20);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IB)V", line = 1564)
    public static final void method748(int arg0, byte arg1) {
        class237 var2 = class254.field3653;
        synchronized (class254.field3653) {
            class254.field3653.method1629(arg0, 65);
        }
        field1471++;
        if (arg1 > 107) {
            class237 var3 = class43.field534;
            synchronized (class43.field534) {
                class43.field534.method1629(arg0, 71);
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(B)V", line = 1581)
    public static void method749(byte arg0) {
        field1457 = null;
        field1461 = null;
        if (arg0 < 7) {
            field1457 = null;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 1592)
    public static final void method750(String arg0, byte arg1) {
        class292.field4086 = arg0;
        field1469++;
        if (class14.field185.field2685 == null) {
            return;
        }
        try {
            String var2 = class14.field185.field2685.getParameter("cookieprefix");
            String var3 = class14.field185.field2685.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg0 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg0.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class288.method1885(class175.method1195(127) + 94608000000L, -1) + "; Max-Age=" + 94608000L;
            }
            class368.method2346(class14.field185.field2685, false, "document.cookie=\"" + var5 + "\"");
            int var6 = 52 / ((arg1 + 57) / 43);
        } catch (Throwable var7) {
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IZIIZII)V", line = 1627)
    public final void method751(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field1454++;
        int var8 = 256;
        if (arg1) {
            var8 |= 0x20000;
        }
        int var9 = arg0 - this.field1466;
        int var10 = arg2 - this.field1455;
        if (arg6 != -10763) {
            this.method742(43, 65, (byte) 14);
        }
        if (arg4) {
            var8 |= 0x40000000;
        }
        for (int var11 = var10; var11 < (arg5 + var10); var11++) {
            if (var11 >= 0 && var11 < this.field1465) {
                for (int var12 = var9; var12 < arg3 + var9; var12++) {
                    if (var12 >= 0 && this.field1459 > var12) {
                        this.method734(var8, var11, -1, var12);
                    }
                }
            }
        }
    }
}
