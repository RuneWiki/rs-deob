import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class367 {

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "F")
    public static float field5396;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
    public static int field5379;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
    public static int field5380;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
    public static int field5381;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    public int field5382;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public int field5383;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
    public int field5384;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
    public static int field5385;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
    public static int field5386;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
    public static int field5387;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
    public static int field5388;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
    public int field5389;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
    public static int field5390;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "I")
    public static int field5391;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "I")
    public static int field5392;

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "I")
    public static int field5393;

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "I")
    public static int field5394;

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "I")
    public static int field5395;

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "I")
    public static int field5397;

    @OriginalMember(owner = "client!ea", name = "u", descriptor = "I")
    public static int field5399;

    @OriginalMember(owner = "client!ea", name = "v", descriptor = "I")
    public static int field5400;

    @OriginalMember(owner = "client!ea", name = "w", descriptor = "I")
    public static int field5401;

    @OriginalMember(owner = "client!ea", name = "t", descriptor = "[[I")
    public int[][] field5398;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIIIII)Z", line = 4)
    public final boolean method2216(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5399++;
        if (arg4 == 1) {
            if (arg3 == arg6 && arg0 == arg2) {
                return true;
            }
        } else if (arg6 >= arg3 && arg6 <= (arg3 + arg4 - 1) && arg0 >= arg0 && (arg0 - (1 - arg4)) >= arg0) {
            return true;
        }
        if (arg7 != -1) {
            return true;
        }
        int var9 = arg3 - this.field5389;
        int var10 = arg6 - this.field5389;
        int var11 = arg0 - this.field5384;
        int var12 = arg2 - this.field5384;
        if (arg4 == 1) {
            if (arg5 == 6 || arg5 == 7) {
                if (arg5 == 7) {
                    arg1 = arg1 + 2 & 0x3;
                }
                if (arg1 == 0) {
                    if ((var10 + 1) == var9 && var11 == var12 && (this.field5398[var9][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var11 - 1) == var12 && (this.field5398[var9][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if ((var10 - 1) == var9 && var11 == var12 && (this.field5398[var9][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var11 - 1 == var12 && (this.field5398[var9][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var10 - 1 == var9 && var11 == var12 && (this.field5398[var9][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var11 + 1) == var12 && (this.field5398[var9][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if ((var10 + 1) == var9 && var11 == var12 && (this.field5398[var9][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var11 + 1) == var12 && (this.field5398[var9][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 8) {
                if (var9 == var10 && var11 + 1 == var12 && (this.field5398[var9][var12] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var10 && (var11 - 1) == var12 && (this.field5398[var9][var12] & 0x2) == 0) {
                    return true;
                }
                if ((var10 - 1) == var9 && var11 == var12 && (this.field5398[var9][var12] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var9 && var11 == var12 && (this.field5398[var9][var12] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg4 + var9 - 1;
            int var14 = arg4 + var12 - 1;
            if (arg5 == 6 || arg5 == 7) {
                if (arg5 == 7) {
                    arg1 = arg1 + 2 & 0x3;
                }
                if (arg1 == 0) {
                    if ((var10 + 1) == var9 && var12 <= var11 && var14 >= var11 && (this.field5398[var9][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 >= var9 && var13 >= var10 && (var11 - arg4) == var12 && (this.field5398[var10][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var10 - arg4 == var9 && var11 >= var12 && var14 >= var11 && (this.field5398[var13][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 >= var9 && var13 >= var10 && var11 - arg4 == var12 && (this.field5398[var10][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if ((var10 - arg4) == var9 && var12 <= var11 && var11 <= var14 && (this.field5398[var13][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 <= var10 && var13 >= var10 && (var11 + 1) == var12 && (this.field5398[var10][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if ((var10 + 1) == var9 && var12 <= var11 && var14 >= var11 && (this.field5398[var9][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 <= var10 && var10 <= var13 && var11 + 1 == var12 && (this.field5398[var10][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 8) {
                if (var10 >= var9 && var10 <= var13 && (var11 + 1) == var12 && (this.field5398[var10][var12] & 0x20) == 0) {
                    return true;
                }
                if (var9 <= var10 && var10 <= var13 && var11 - arg4 == var12 && (this.field5398[var10][var14] & 0x2) == 0) {
                    return true;
                }
                if (var10 - arg4 == var9 && var11 >= var12 && var11 <= var14 && (this.field5398[var13][var11] & 0x8) == 0) {
                    return true;
                }
                if ((var10 + 1) == var9 && var12 <= var11 && var14 >= var11 && (this.field5398[var9][var11] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(III)V", line = 202)
    public final void method2217(int arg0, int arg1, int arg2) {
        field5388++;
        int var4 = arg2 - this.field5384;
        int var5 = arg0 - this.field5389;
        this.field5398[var5][var4] = class318.method1973(this.field5398[var5][var4], arg1);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZIIZIII)V", line = 213)
    public final void method2218(boolean arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field5393++;
        int var8 = 256;
        if (arg0) {
            var8 |= 0x20000;
        }
        if (arg6 != 264273471) {
            return;
        }
        int var9 = arg5 - this.field5389;
        int var10 = arg2 - this.field5384;
        if (arg3) {
            var8 |= 0x40000000;
        }
        for (int var11 = var9; var11 < var9 + arg4; var11++) {
            if (var11 >= 0 && this.field5382 > var11) {
                for (int var12 = var10; var12 < (arg1 + var10); var12++) {
                    if (var12 >= 0 && var12 < this.field5383) {
                        this.method2223(var8, var11, -2, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIII)V", line = 265)
    private final void method2219(int arg0, int arg1, int arg2, int arg3) {
        this.field5398[arg3][arg2] = class330.method2050(this.field5398[arg3][arg2], ~arg1);
        field5390++;
        if (arg0 != -1) {
            this.method2216(120, -111, 75, -119, -19, -88, 39, 48);
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(III)V", line = 276)
    public final void method2220(int arg0, int arg1, int arg2) {
        if (arg0 == 1) {
            field5387++;
            int var4 = arg1 - this.field5384;
            int var5 = arg2 - this.field5389;
            this.field5398[var5][var4] = class318.method1973(this.field5398[var5][var4], 262144);
        }
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(III)V", line = 300)
    public final void method2221(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field5384;
        field5381++;
        int var5 = arg2 - this.field5389;
        if (arg1 != 2) {
            this.method2223(103, 57, -5, -31);
        }
        this.field5398[var5][var4] = class330.method2050(this.field5398[var5][var4], -262145);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIIIIIII)Z", line = 314)
    public final boolean method2222(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg9 < 14) {
            this.method2226(-62, 13, -56, 6, 99, 85, -104, 94, (byte) 63);
        }
        field5386++;
        int var11 = arg1 + arg8;
        int var12 = arg3 + arg4;
        int var13 = arg5 + arg6;
        int var14 = arg0 + arg7;
        if (arg1 == var13 && (arg2 & 0x2) == 0) {
            int var15 = arg7 < arg3 ? arg3 : arg7;
            int var16 = var14 <= var12 ? var14 : var12;
            while (var16 > var15) {
                if ((this.field5398[var13 - this.field5389 - 1][var15 - this.field5384] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg5 == var11 && (arg2 & 0x8) == 0) {
            int var17 = arg3 > arg7 ? arg3 : arg7;
            int var18 = var12 < var14 ? var12 : var14;
            while (var17 < var18) {
                if ((this.field5398[arg5 - this.field5389][var17 - this.field5384] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg3 == var14 && (arg2 & 0x1) == 0) {
            int var19 = arg1 > arg5 ? arg1 : arg5;
            int var20 = var13 <= var11 ? var13 : var11;
            while (var19 < var20) {
                if ((this.field5398[var19 - this.field5389][var14 - this.field5384 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg7 == var12 && (arg2 & 0x4) == 0) {
            int var21 = arg1 <= arg5 ? arg5 : arg1;
            int var22 = var13 <= var11 ? var13 : var11;
            while (var21 < var22) {
                if ((this.field5398[var21 - this.field5389][arg7 - this.field5384] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(IIII)V", line = 406)
    private final void method2223(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == -2) {
            this.field5398[arg1][arg3] = class318.method1973(this.field5398[arg1][arg3], arg0);
            field5400++;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V", line = 418)
    public final void method2224(int arg0) {
        for (int var2 = 0; var2 < this.field5382; var2++) {
            for (int var3 = 0; var3 < this.field5383; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= (this.field5382 - 5) || var3 >= (this.field5383 - 5)) {
                    this.field5398[var2][var3] = -1;
                } else {
                    this.field5398[var2][var3] = 2097152;
                }
            }
        }
        if (arg0 == -1568) {
            field5392++;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZIZIBIII)V", line = 452)
    public final void method2225(boolean arg0, int arg1, boolean arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        if (arg4 != 81) {
            this.method2224(-117);
        }
        field5395++;
        int var9 = 256;
        if (arg0) {
            var9 |= 0x20000;
        }
        int var10 = arg3 - this.field5384;
        if (arg2) {
            var9 |= 0x40000000;
        }
        if (arg6 == 1 || arg6 == 3) {
            int var11 = arg7;
            arg7 = arg1;
            arg1 = var11;
        }
        int var12 = arg5 - this.field5389;
        for (int var13 = var12; var13 < (var12 + arg7); var13++) {
            if (var13 >= 0 && var13 < this.field5382) {
                for (int var14 = var10; var14 < (arg1 + var10); var14++) {
                    if (var14 >= 0 && var14 < this.field5383) {
                        this.method2219(-1, var9, var14, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIIIIIB)Z", line = 510)
    public final boolean method2226(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8) {
        field5401++;
        if (arg6 > 1) {
            return class169.method1062(arg5, 21264, arg6, arg1, arg3, arg2, arg7, arg0, arg6) ? true : this.method2222(arg3, arg0, arg4, arg1, arg6, arg2, arg5, arg7, arg6, 35);
        }
        int var10 = arg2 + arg5 - 1;
        if (arg8 < 61) {
            return true;
        }
        int var11 = arg3 + arg7 - 1;
        if (arg0 >= arg2 && var10 >= arg0 && arg1 >= arg7 && arg1 <= var11) {
            return true;
        } else if ((arg2 - 1) == arg0 && arg1 >= arg7 && var11 >= arg1 && (this.field5398[arg0 - this.field5389][arg1 - this.field5384] & 0x8) == 0 && (arg4 & 0x8) == 0) {
            return true;
        } else if (var10 + 1 == arg0 && arg1 >= arg7 && arg1 <= var11 && (this.field5398[arg0 - this.field5389][arg1 - this.field5384] & 0x80) == 0 && (arg4 & 0x2) == 0) {
            return true;
        } else if ((arg7 - 1) == arg1 && arg2 <= arg0 && arg0 <= var10 && (this.field5398[arg0 - this.field5389][arg1 - this.field5384] & 0x2) == 0 && (arg4 & 0x4) == 0) {
            return true;
        } else {
            return (var11 + 1) == arg1 && arg2 <= arg0 && arg0 <= var10 && (this.field5398[arg0 - this.field5389][arg1 - this.field5384] & 0x20) == 0 && (arg4 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "(III)V", line = 555)
    public final void method2227(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field5389;
        int var5 = arg1 - this.field5384;
        field5397++;
        this.field5398[var4][var5] = class330.method2050(this.field5398[var4][var5], arg2);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIBZZII)V", line = 566)
    public final void method2228(int arg0, int arg1, byte arg2, boolean arg3, boolean arg4, int arg5, int arg6) {
        int var8 = arg0 - this.field5384;
        int var9 = arg6 - this.field5389;
        field5380++;
        if (arg2 <= 111) {
            this.method2219(52, -46, 80, -92);
        }
        if (arg1 == 0) {
            if (arg5 == 0) {
                this.method2223(128, var9, -2, var8);
                this.method2223(8, var9 - 1, -2, var8);
            }
            if (arg5 == 1) {
                this.method2223(2, var9, -2, var8);
                this.method2223(32, var9, -2, var8 + 1);
            }
            if (arg5 == 2) {
                this.method2223(8, var9, -2, var8);
                this.method2223(128, var9 + 1, -2, var8);
            }
            if (arg5 == 3) {
                this.method2223(32, var9, -2, var8);
                this.method2223(2, var9, -2, var8 - 1);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg5 == 0) {
                this.method2223(1, var9, -2, var8);
                this.method2223(16, var9 - 1, -2, var8 + 1);
            }
            if (arg5 == 1) {
                this.method2223(4, var9, -2, var8);
                this.method2223(64, var9 + 1, -2, var8 + 1);
            }
            if (arg5 == 2) {
                this.method2223(16, var9, -2, var8);
                this.method2223(1, var9 + 1, -2, var8 + -1);
            }
            if (arg5 == 3) {
                this.method2223(64, var9, -2, var8);
                this.method2223(4, var9 - 1, -2, var8 + -1);
            }
        }
        if (arg1 == 2) {
            if (arg5 == 0) {
                this.method2223(130, var9, -2, var8);
                this.method2223(8, var9 - 1, -2, var8);
                this.method2223(32, var9, -2, var8 + 1);
            }
            if (arg5 == 1) {
                this.method2223(10, var9, -2, var8);
                this.method2223(32, var9, -2, var8 + 1);
                this.method2223(128, var9 + 1, -2, var8);
            }
            if (arg5 == 2) {
                this.method2223(40, var9, -2, var8);
                this.method2223(128, var9 + 1, -2, var8);
                this.method2223(2, var9, -2, var8 - 1);
            }
            if (arg5 == 3) {
                this.method2223(160, var9, -2, var8);
                this.method2223(2, var9, -2, var8 - 1);
                this.method2223(8, var9 - 1, -2, var8);
            }
        }
        if (arg4) {
            if (arg1 == 0) {
                if (arg5 == 0) {
                    this.method2223(65536, var9, -2, var8);
                    this.method2223(4096, var9 - 1, -2, var8);
                }
                if (arg5 == 1) {
                    this.method2223(1024, var9, -2, var8);
                    this.method2223(16384, var9, -2, var8 + 1);
                }
                if (arg5 == 2) {
                    this.method2223(4096, var9, -2, var8);
                    this.method2223(65536, var9 + 1, -2, var8);
                }
                if (arg5 == 3) {
                    this.method2223(16384, var9, -2, var8);
                    this.method2223(1024, var9, -2, var8 - 1);
                }
            }
            if (arg1 == 1 || arg1 == 3) {
                if (arg5 == 0) {
                    this.method2223(512, var9, -2, var8);
                    this.method2223(8192, var9 - 1, -2, var8 - -1);
                }
                if (arg5 == 1) {
                    this.method2223(2048, var9, -2, var8);
                    this.method2223(32768, var9 + 1, -2, var8 + 1);
                }
                if (arg5 == 2) {
                    this.method2223(8192, var9, -2, var8);
                    this.method2223(512, var9 + 1, -2, var8 + -1);
                }
                if (arg5 == 3) {
                    this.method2223(32768, var9, -2, var8);
                    this.method2223(2048, var9 - 1, -2, var8 + -1);
                }
            }
            if (arg1 == 2) {
                if (arg5 == 0) {
                    this.method2223(66560, var9, -2, var8);
                    this.method2223(4096, var9 - 1, -2, var8);
                    this.method2223(16384, var9, -2, var8 + 1);
                }
                if (arg5 == 1) {
                    this.method2223(5120, var9, -2, var8);
                    this.method2223(16384, var9, -2, var8 + 1);
                    this.method2223(65536, var9 + 1, -2, var8);
                }
                if (arg5 == 2) {
                    this.method2223(20480, var9, -2, var8);
                    this.method2223(65536, var9 + 1, -2, var8);
                    this.method2223(1024, var9, -2, var8 - 1);
                }
                if (arg5 == 3) {
                    this.method2223(81920, var9, -2, var8);
                    this.method2223(1024, var9, -2, var8 - 1);
                    this.method2223(4096, var9 - 1, -2, var8);
                }
            }
        }
        if (!arg3) {
            return;
        }
        if (arg1 == 0) {
            if (arg5 == 0) {
                this.method2223(536870912, var9, -2, var8);
                this.method2223(33554432, var9 - 1, -2, var8);
            }
            if (arg5 == 1) {
                this.method2223(8388608, var9, -2, var8);
                this.method2223(134217728, var9, -2, var8 + 1);
            }
            if (arg5 == 2) {
                this.method2223(33554432, var9, -2, var8);
                this.method2223(536870912, var9 + 1, -2, var8);
            }
            if (arg5 == 3) {
                this.method2223(134217728, var9, -2, var8);
                this.method2223(8388608, var9, -2, var8 - 1);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg5 == 0) {
                this.method2223(4194304, var9, -2, var8);
                this.method2223(67108864, var9 - 1, -2, var8 + 1);
            }
            if (arg5 == 1) {
                this.method2223(16777216, var9, -2, var8);
                this.method2223(268435456, var9 + 1, -2, var8 + 1);
            }
            if (arg5 == 2) {
                this.method2223(67108864, var9, -2, var8);
                this.method2223(4194304, var9 + 1, -2, var8 - 1);
            }
            if (arg5 == 3) {
                this.method2223(268435456, var9, -2, var8);
                this.method2223(16777216, var9 - 1, -2, var8 - 1);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method2223(545259520, var9, -2, var8);
            this.method2223(33554432, var9 - 1, -2, var8);
            this.method2223(134217728, var9, -2, var8 + 1);
        }
        if (arg5 == 1) {
            this.method2223(41943040, var9, -2, var8);
            this.method2223(134217728, var9, -2, var8 + 1);
            this.method2223(536870912, var9 + 1, -2, var8);
        }
        if (arg5 == 2) {
            this.method2223(167772160, var9, -2, var8);
            this.method2223(536870912, var9 + 1, -2, var8);
            this.method2223(8388608, var9, -2, var8 - 1);
        }
        if (arg5 == 3) {
            this.method2223(671088640, var9, -2, var8);
            this.method2223(8388608, var9, -2, var8 - 1);
            this.method2223(33554432, var9 - 1, -2, var8);
            return;
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(IIIIIIII)Z", line = 873)
    public final boolean method2229(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5379++;
        if (arg5 == 1) {
            if (arg0 == arg1 && arg2 == arg4) {
                return true;
            }
        } else if (arg0 >= arg1 && arg0 <= (arg1 + arg5 - 1) && arg2 >= arg2 && arg2 + arg5 - 1 >= arg2) {
            return true;
        }
        int var9 = arg4 - this.field5384;
        int var10 = arg0 - this.field5389;
        int var11 = arg1 - this.field5389;
        int var12 = arg2 - this.field5384;
        if (arg5 == 1) {
            if (arg6 == 0) {
                if (arg3 == 0) {
                    if (var10 - 1 == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var12 + 1 == var9 && (this.field5398[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var9 && (this.field5398[var11][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var10 == var11 && var12 + 1 == var9) {
                        return true;
                    }
                    if (var10 - 1 == var11 && var9 == var12 && (this.field5398[var11][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 == var12 && (this.field5398[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var10 + 1 == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9 && (this.field5398[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 - 1) == var9 && (this.field5398[var11][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var10 == var11 && (var12 - 1) == var9) {
                        return true;
                    }
                    if (var10 - 1 == var11 && var9 == var12 && (this.field5398[var11][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 == var12 && (this.field5398[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg6 == 2) {
                if (arg3 == 0) {
                    if ((var10 - 1) == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 == var12 && (this.field5398[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 - 1) == var9 && (this.field5398[var11][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if ((var10 - 1) == var11 && var9 == var12 && (this.field5398[var11][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 + 1 == var9) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var12 - 1) == var9 && (this.field5398[var11][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var10 - 1 == var11 && var9 == var12 && (this.field5398[var11][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9 && (this.field5398[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var12 - 1) == var9) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if ((var10 - 1) == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9 && (this.field5398[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 == var12 && (this.field5398[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 - 1) == var9) {
                        return true;
                    }
                }
            }
            if (arg6 == 9) {
                if (var10 == var11 && var12 + 1 == var9 && (this.field5398[var11][var9] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var11 && var12 - 1 == var9 && (this.field5398[var11][var9] & 0x2) == 0) {
                    return true;
                }
                if (var10 - 1 == var11 && var9 == var12 && (this.field5398[var11][var9] & 0x8) == 0) {
                    return true;
                }
                if ((var10 + 1) == var11 && var9 == var12 && (this.field5398[var11][var9] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var11 + arg5 - 1;
            int var14 = var9 + arg5 - 1;
            if (arg6 == 0) {
                if (arg3 == 0) {
                    if (var10 - arg5 == var11 && var9 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var10 >= var11 && var13 >= var10 && (var12 + 1) == var9 && (this.field5398[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var13 >= var10 && var12 - arg5 == var9 && (this.field5398[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var11 <= var10 && var13 >= var10 && (var12 + 1) == var9) {
                        return true;
                    }
                    if ((var10 - arg5) == var11 && var9 <= var12 && var12 <= var14 && (this.field5398[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 <= var12 && var14 >= var12 && (this.field5398[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if ((var10 + 1) == var11 && var9 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var11 <= var10 && var10 <= var13 && (var12 + 1) == var9 && (this.field5398[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var10 <= var13 && (var12 - arg5) == var9 && (this.field5398[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var11 <= var10 && var13 >= var10 && (var12 - arg5) == var9) {
                        return true;
                    }
                    if ((var10 - arg5) == var11 && var9 <= var12 && var12 <= var14 && (this.field5398[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 <= var12 && var14 >= var12 && (this.field5398[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg6 == 2) {
                if (arg3 == 0) {
                    if ((var10 - arg5) == var11 && var9 <= var12 && var14 >= var12) {
                        return true;
                    }
                    if (var10 >= var11 && var10 <= var13 && var12 + 1 == var9) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 <= var12 && var12 <= var14 && (this.field5398[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var10 <= var13 && (var12 - arg5) == var9 && (this.field5398[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var10 - arg5 == var11 && var9 <= var12 && var12 <= var14 && (this.field5398[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var13 >= var10 && (var12 + 1) == var9) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 <= var12 && var14 >= var12) {
                        return true;
                    }
                    if (var10 >= var11 && var10 <= var13 && (var12 - arg5) == var9 && (this.field5398[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var10 - arg5 == var11 && var12 >= var9 && var12 <= var14 && (this.field5398[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var10 <= var13 && var12 + 1 == var9 && (this.field5398[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var12 >= var9 && var12 <= var14) {
                        return true;
                    }
                    if (var10 >= var11 && var13 >= var10 && (var12 - arg5) == var9) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var10 - arg5 == var11 && var12 >= var9 && var14 >= var12) {
                        return true;
                    }
                    if (var11 <= var10 && var13 >= var10 && (var12 + 1) == var9 && (this.field5398[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 <= var12 && var14 >= var12 && (this.field5398[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var10 <= var13 && (var12 - arg5) == var9) {
                        return true;
                    }
                }
            }
            if (arg6 == 9) {
                if (var10 >= var11 && var13 >= var10 && (var12 + 1) == var9 && (this.field5398[var10][var9] & 0x2C0120) == 0) {
                    return true;
                }
                if (var11 <= var10 && var13 >= var10 && (var12 - arg5) == var9 && (this.field5398[var10][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if ((var10 - arg5) == var11 && var12 >= var9 && var12 <= var14 && (this.field5398[var13][var12] & 0x2C0108) == 0) {
                    return true;
                }
                if ((var10 + 1) == var11 && var12 >= var9 && var12 <= var14 && (this.field5398[var11][var12] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return arg7 != 2883872;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIZIZ)V", line = 1244)
    public final void method2230(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, boolean arg6) {
        int var8 = arg2 - this.field5389;
        int var9 = arg5 - this.field5384;
        field5385++;
        if (arg0 == 0) {
            if (arg3 == 0) {
                this.method2219(arg1 - 2, 128, var9, var8);
                this.method2219(arg1 - 2, 8, var9, var8 - 1);
            }
            if (arg3 == 1) {
                this.method2219(-1, 2, var9, var8);
                this.method2219(-1, 32, var9 + 1, var8);
            }
            if (arg3 == 2) {
                this.method2219(-1, 8, var9, var8);
                this.method2219(-1, 128, var9, var8 + 1);
            }
            if (arg3 == 3) {
                this.method2219(-1, 32, var9, var8);
                this.method2219(-1, 2, var9 - 1, var8);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg3 == 0) {
                this.method2219(arg1 ^ 0xFFFFFFFE, 1, var9, var8);
                this.method2219(-1, 16, var9 + 1, var8 + -1);
            }
            if (arg3 == 1) {
                this.method2219(-1, 4, var9, var8);
                this.method2219(arg1 ^ 0xFFFFFFFE, 64, var9 + 1, var8 + 1);
            }
            if (arg3 == 2) {
                this.method2219(-1, 16, var9, var8);
                this.method2219(-1, 1, var9 - 1, var8 + 1);
            }
            if (arg3 == 3) {
                this.method2219(-1, 64, var9, var8);
                this.method2219(-1, 4, var9 - 1, var8 + -1);
            }
        }
        if (arg1 != 1) {
            this.method2227(-61, -30, 29);
        }
        if (arg0 == 2) {
            if (arg3 == 0) {
                this.method2219(arg1 ^ 0xFFFFFFFE, 130, var9, var8);
                this.method2219(-1, 8, var9, var8 - 1);
                this.method2219(arg1 ^ 0xFFFFFFFE, 32, var9 + 1, var8);
            }
            if (arg3 == 1) {
                this.method2219(arg1 - 2, 10, var9, var8);
                this.method2219(-1, 32, var9 + 1, var8);
                this.method2219(-1, 128, var9, var8 + 1);
            }
            if (arg3 == 2) {
                this.method2219(-1, 40, var9, var8);
                this.method2219(-1, 128, var9, var8 + 1);
                this.method2219(-1, 2, var9 - 1, var8);
            }
            if (arg3 == 3) {
                this.method2219(-1, 160, var9, var8);
                this.method2219(-1, 2, var9 - 1, var8);
                this.method2219(-1, 8, var9, var8 - 1);
            }
        }
        if (arg4) {
            if (arg0 == 0) {
                if (arg3 == 0) {
                    this.method2219(-1, 65536, var9, var8);
                    this.method2219(-1, 4096, var9, var8 - 1);
                }
                if (arg3 == 1) {
                    this.method2219(-1, 1024, var9, var8);
                    this.method2219(arg1 - 2, 16384, var9 + 1, var8);
                }
                if (arg3 == 2) {
                    this.method2219(-1, 4096, var9, var8);
                    this.method2219(arg1 - 2, 65536, var9, var8 + 1);
                }
                if (arg3 == 3) {
                    this.method2219(-1, 16384, var9, var8);
                    this.method2219(-1, 1024, var9 - 1, var8);
                }
            }
            if (arg0 == 1 || arg0 == 3) {
                if (arg3 == 0) {
                    this.method2219(-1, 512, var9, var8);
                    this.method2219(-1, 8192, var9 + 1, var8 - 1);
                }
                if (arg3 == 1) {
                    this.method2219(-1, 2048, var9, var8);
                    this.method2219(arg1 - 2, 32768, var9 + 1, var8 - -1);
                }
                if (arg3 == 2) {
                    this.method2219(-1, 8192, var9, var8);
                    this.method2219(-1, 512, var9 - 1, var8 - -1);
                }
                if (arg3 == 3) {
                    this.method2219(-1, 32768, var9, var8);
                    this.method2219(arg1 - 2, 2048, var9 - 1, var8 + -1);
                }
            }
            if (arg0 == 2) {
                if (arg3 == 0) {
                    this.method2219(arg1 - 2, 66560, var9, var8);
                    this.method2219(-1, 4096, var9, var8 - 1);
                    this.method2219(-1, 16384, var9 + 1, var8);
                }
                if (arg3 == 1) {
                    this.method2219(-1, 5120, var9, var8);
                    this.method2219(-1, 16384, var9 + 1, var8);
                    this.method2219(-1, 65536, var9, var8 + 1);
                }
                if (arg3 == 2) {
                    this.method2219(-1, 20480, var9, var8);
                    this.method2219(-1, 65536, var9, var8 + 1);
                    this.method2219(arg1 ^ 0xFFFFFFFE, 1024, var9 - 1, var8);
                }
                if (arg3 == 3) {
                    this.method2219(arg1 - 2, 81920, var9, var8);
                    this.method2219(-1, 1024, var9 - 1, var8);
                    this.method2219(-1, 4096, var9, var8 - 1);
                }
            }
        }
        if (!arg6) {
            return;
        }
        if (arg0 == 0) {
            if (arg3 == 0) {
                this.method2219(-1, 536870912, var9, var8);
                this.method2219(arg1 ^ 0xFFFFFFFE, 33554432, var9, var8 - 1);
            }
            if (arg3 == 1) {
                this.method2219(-1, 8388608, var9, var8);
                this.method2219(arg1 - 2, 134217728, var9 + 1, var8);
            }
            if (arg3 == 2) {
                this.method2219(-1, 33554432, var9, var8);
                this.method2219(-1, 536870912, var9, var8 + 1);
            }
            if (arg3 == 3) {
                this.method2219(arg1 - 2, 134217728, var9, var8);
                this.method2219(arg1 ^ 0xFFFFFFFE, 8388608, var9 - 1, var8);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg3 == 0) {
                this.method2219(-1, 4194304, var9, var8);
                this.method2219(-1, 67108864, var9 + 1, var8 + -1);
            }
            if (arg3 == 1) {
                this.method2219(-1, 16777216, var9, var8);
                this.method2219(-1, 268435456, var9 + 1, var8 + 1);
            }
            if (arg3 == 2) {
                this.method2219(-1, 67108864, var9, var8);
                this.method2219(arg1 ^ 0xFFFFFFFE, 4194304, var9 - 1, var8 + 1);
            }
            if (arg3 == 3) {
                this.method2219(-1, 268435456, var9, var8);
                this.method2219(-1, 16777216, var9 - 1, var8 + -1);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method2219(-1, 545259520, var9, var8);
            this.method2219(-1, 33554432, var9, var8 - 1);
            this.method2219(-1, 134217728, var9 + 1, var8);
        }
        if (arg3 == 1) {
            this.method2219(-1, 41943040, var9, var8);
            this.method2219(-1, 134217728, var9 + 1, var8);
            this.method2219(-1, 536870912, var9, var8 + 1);
        }
        if (arg3 == 2) {
            this.method2219(-1, 167772160, var9, var8);
            this.method2219(-1, 536870912, var9, var8 + 1);
            this.method2219(-1, 8388608, var9 - 1, var8);
        }
        if (arg3 == 3) {
            this.method2219(-1, 671088640, var9, var8);
            this.method2219(arg1 - 2, 8388608, var9 - 1, var8);
            this.method2219(-1, 33554432, var9, var8 - 1);
            return;
        }
    }
}
