import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class348 {

    @OriginalMember(owner = "client!is", name = "q", descriptor = "[B")
    public static byte[] field4480 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!is", name = "x", descriptor = "Lap;")
    public static class335 field4487;

    @OriginalMember(owner = "client!is", name = "z", descriptor = "I")
    public static int field4489;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "I")
    public int field4464;

    @OriginalMember(owner = "client!is", name = "c", descriptor = "I")
    public static int field4466;

    @OriginalMember(owner = "client!is", name = "d", descriptor = "I")
    public int field4467;

    @OriginalMember(owner = "client!is", name = "e", descriptor = "I")
    public static int field4468;

    @OriginalMember(owner = "client!is", name = "f", descriptor = "I")
    public static int field4469;

    @OriginalMember(owner = "client!is", name = "g", descriptor = "I")
    public static int field4470;

    @OriginalMember(owner = "client!is", name = "h", descriptor = "I")
    public static int field4471;

    @OriginalMember(owner = "client!is", name = "i", descriptor = "I")
    public static int field4472;

    @OriginalMember(owner = "client!is", name = "j", descriptor = "I")
    public static int field4473;

    @OriginalMember(owner = "client!is", name = "k", descriptor = "I")
    public int field4474;

    @OriginalMember(owner = "client!is", name = "l", descriptor = "I")
    public static int field4475;

    @OriginalMember(owner = "client!is", name = "m", descriptor = "I")
    public static int field4476;

    @OriginalMember(owner = "client!is", name = "n", descriptor = "I")
    public static int field4477;

    @OriginalMember(owner = "client!is", name = "o", descriptor = "I")
    public int field4478;

    @OriginalMember(owner = "client!is", name = "p", descriptor = "I")
    public static int field4479;

    @OriginalMember(owner = "client!is", name = "r", descriptor = "I")
    public static int field4481;

    @OriginalMember(owner = "client!is", name = "s", descriptor = "I")
    public static int field4482;

    @OriginalMember(owner = "client!is", name = "t", descriptor = "I")
    public static int field4483;

    @OriginalMember(owner = "client!is", name = "u", descriptor = "I")
    public static int field4484;

    @OriginalMember(owner = "client!is", name = "v", descriptor = "I")
    public static int field4485;

    @OriginalMember(owner = "client!is", name = "w", descriptor = "I")
    public static int field4486;

    @OriginalMember(owner = "client!is", name = "y", descriptor = "I")
    public static int field4488;

    @OriginalMember(owner = "client!is", name = "b", descriptor = "[[I")
    public int[][] field4465;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method1987(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4477++;
        if (arg0 == 1) {
            if (arg2 == arg3 && arg1 == arg7) {
                return true;
            }
        } else if (arg2 <= arg3 && arg3 <= (arg2 + arg0 - 1) && arg7 <= arg7 && arg7 <= arg7 + arg0 - 1) {
            return true;
        }
        int var9 = arg7 - this.field4464;
        int var10 = -76 % ((arg6 - 44) / 48);
        int var11 = arg1 - this.field4464;
        int var12 = arg2 - this.field4478;
        int var13 = arg3 - this.field4478;
        if (arg0 == 1) {
            if (arg5 == 6 || arg5 == 7) {
                if (arg5 == 7) {
                    arg4 = arg4 + 2 & 0x3;
                }
                if (arg4 == 0) {
                    if (var13 + 1 == var12 && var9 == var11 && (this.field4465[var12][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 == var13 && (var9 - 1) == var11 && (this.field4465[var12][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if ((var13 - 1) == var12 && var9 == var11 && (this.field4465[var12][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 == var13 && (var9 - 1) == var11 && (this.field4465[var12][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if (var13 - 1 == var12 && var9 == var11 && (this.field4465[var12][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 == var13 && (var9 + 1) == var11 && (this.field4465[var12][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var13 + 1 == var12 && var9 == var11 && (this.field4465[var12][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 == var13 && var9 + 1 == var11 && (this.field4465[var12][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 8) {
                if (var12 == var13 && (var9 + 1) == var11 && (this.field4465[var12][var11] & 0x20) == 0) {
                    return true;
                }
                if (var12 == var13 && var9 - 1 == var11 && (this.field4465[var12][var11] & 0x2) == 0) {
                    return true;
                }
                if (var13 - 1 == var12 && var9 == var11 && (this.field4465[var12][var11] & 0x8) == 0) {
                    return true;
                }
                if ((var13 + 1) == var12 && var9 == var11 && (this.field4465[var12][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var14 = arg0 + var12 - 1;
            int var15 = var11 + arg0 - 1;
            if (arg5 == 6 || arg5 == 7) {
                if (arg5 == 7) {
                    arg4 = arg4 + 2 & 0x3;
                }
                if (arg4 == 0) {
                    if (var13 + 1 == var12 && var11 <= var9 && var15 >= var9 && (this.field4465[var12][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var13 >= var12 && var13 <= var14 && var9 - arg0 == var11 && (this.field4465[var13][var15] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var13 - arg0 == var12 && var9 >= var11 && var9 <= var15 && (this.field4465[var14][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var13 >= var12 && var14 >= var13 && var9 - arg0 == var11 && (this.field4465[var13][var15] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if (var13 - arg0 == var12 && var11 <= var9 && var9 <= var15 && (this.field4465[var14][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 <= var13 && var14 >= var13 && (var9 + 1) == var11 && (this.field4465[var13][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var13 + 1 == var12 && var11 <= var9 && var9 <= var15 && (this.field4465[var12][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 <= var13 && var14 >= var13 && var9 + 1 == var11 && (this.field4465[var13][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 8) {
                if (var13 >= var12 && var14 >= var13 && (var9 + 1) == var11 && (this.field4465[var13][var11] & 0x20) == 0) {
                    return true;
                }
                if (var12 <= var13 && var13 <= var14 && (var9 - arg0) == var11 && (this.field4465[var13][var15] & 0x2) == 0) {
                    return true;
                }
                if ((var13 - arg0) == var12 && var11 <= var9 && var15 >= var9 && (this.field4465[var14][var9] & 0x8) == 0) {
                    return true;
                }
                if ((var13 + 1) == var12 && var11 <= var9 && var15 >= var9 && (this.field4465[var12][var9] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(IIII)V")
    private final void method1988(int arg0, int arg1, int arg2, int arg3) {
        this.field4465[arg3][arg1] = class378.method2145(this.field4465[arg3][arg1], ~arg0);
        field4482++;
        if (arg2 != 2883968) {
            this.field4474 = 60;
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(III)V")
    public final void method1989(int arg0, int arg1, int arg2) {
        if (arg0 != 1) {
            field4489 = -94;
        }
        int var4 = arg1 - this.field4478;
        field4466++;
        int var5 = arg2 - this.field4464;
        this.field4465[var4][var5] = class378.method2145(this.field4465[var4][var5], -2097153);
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(IZIIZII)V")
    public final void method1990(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        int var8 = arg6 - this.field4464;
        field4475++;
        int var9 = arg0 - this.field4478;
        if (arg2 == 0) {
            if (arg5 == 0) {
                this.method2002(var9, 128, 26, var8);
                this.method2002(var9 - 1, 8, 94, var8);
            }
            if (arg5 == 1) {
                this.method2002(var9, 2, -128, var8);
                this.method2002(var9, 32, 44, var8 + 1);
            }
            if (arg5 == 2) {
                this.method2002(var9, 8, 109, var8);
                this.method2002(var9 + 1, 128, -128, var8);
            }
            if (arg5 == 3) {
                this.method2002(var9, 32, -128, var8);
                this.method2002(var9, 2, -127, var8 - 1);
            }
        }
        if (arg2 == arg3 || arg2 == 3) {
            if (arg5 == 0) {
                this.method2002(var9, 1, -126, var8);
                this.method2002(var9 - 1, 16, -126, var8 + 1);
            }
            if (arg5 == 1) {
                this.method2002(var9, 4, arg3 + 13, var8);
                this.method2002(var9 + 1, 64, -128, var8 + 1);
            }
            if (arg5 == 2) {
                this.method2002(var9, 16, -30, var8);
                this.method2002(var9 + 1, 1, -126, var8 - 1);
            }
            if (arg5 == 3) {
                this.method2002(var9, 64, -127, var8);
                this.method2002(var9 - 1, 4, -125, var8 - 1);
            }
        }
        if (arg2 == 2) {
            if (arg5 == 0) {
                this.method2002(var9, 130, -125, var8);
                this.method2002(var9 - 1, 8, 124, var8);
                this.method2002(var9, 32, 115, var8 + 1);
            }
            if (arg5 == 1) {
                this.method2002(var9, 10, -125, var8);
                this.method2002(var9, 32, -127, var8 + 1);
                this.method2002(var9 + 1, 128, 53, var8);
            }
            if (arg5 == 2) {
                this.method2002(var9, 40, -17, var8);
                this.method2002(var9 + 1, 128, arg3 - 129, var8);
                this.method2002(var9, 2, 123, var8 - 1);
            }
            if (arg5 == 3) {
                this.method2002(var9, 160, arg3 ^ 0xFFFFFFEB, var8);
                this.method2002(var9, 2, -35, var8 - 1);
                this.method2002(var9 - 1, 8, arg3 - 13, var8);
            }
        }
        if (arg4) {
            if (arg2 == 0) {
                if (arg5 == 0) {
                    this.method2002(var9, 65536, 84, var8);
                    this.method2002(var9 - 1, 4096, arg3 - 38, var8);
                }
                if (arg5 == 1) {
                    this.method2002(var9, 1024, 42, var8);
                    this.method2002(var9, 16384, -125, var8 + 1);
                }
                if (arg5 == 2) {
                    this.method2002(var9, 4096, -125, var8);
                    this.method2002(var9 + 1, 65536, arg3 + 28, var8);
                }
                if (arg5 == 3) {
                    this.method2002(var9, 16384, arg3 - 129, var8);
                    this.method2002(var9, 1024, arg3 - 127, var8 + -1);
                }
            }
            if (arg2 == 1 || arg2 == 3) {
                if (arg5 == 0) {
                    this.method2002(var9, 512, arg3 - 2, var8);
                    this.method2002(var9 - 1, 8192, 63, var8 + 1);
                }
                if (arg5 == 1) {
                    this.method2002(var9, 2048, 104, var8);
                    this.method2002(var9 + 1, 32768, -126, var8 + 1);
                }
                if (arg5 == 2) {
                    this.method2002(var9, 8192, arg3 - 127, var8);
                    this.method2002(var9 + 1, 512, -127, var8 - 1);
                }
                if (arg5 == 3) {
                    this.method2002(var9, 32768, 35, var8);
                    this.method2002(var9 - 1, 2048, -126, var8 - 1);
                }
            }
            if (arg2 == 2) {
                if (arg5 == 0) {
                    this.method2002(var9, 66560, arg3 - 127, var8);
                    this.method2002(var9 - 1, 4096, 57, var8);
                    this.method2002(var9, 16384, arg3 - 129, var8 + 1);
                }
                if (arg5 == 1) {
                    this.method2002(var9, 5120, -127, var8);
                    this.method2002(var9, 16384, arg3 - 128, var8 - -1);
                    this.method2002(var9 + 1, 65536, arg3 - 126, var8);
                }
                if (arg5 == 2) {
                    this.method2002(var9, 20480, 17, var8);
                    this.method2002(var9 + 1, 65536, 59, var8);
                    this.method2002(var9, 1024, 68, var8 - 1);
                }
                if (arg5 == 3) {
                    this.method2002(var9, 81920, -37, var8);
                    this.method2002(var9, 1024, -125, var8 - 1);
                    this.method2002(var9 - 1, 4096, -125, var8);
                }
            }
        }
        if (!arg1) {
            return;
        }
        if (arg2 == 0) {
            if (arg5 == 0) {
                this.method2002(var9, 536870912, 11, var8);
                this.method2002(var9 - 1, 33554432, 24, var8);
            }
            if (arg5 == 1) {
                this.method2002(var9, 8388608, arg3 ^ 0x46, var8);
                this.method2002(var9, 134217728, -126, var8 + 1);
            }
            if (arg5 == 2) {
                this.method2002(var9, 33554432, 43, var8);
                this.method2002(var9 + 1, 536870912, -125, var8);
            }
            if (arg5 == 3) {
                this.method2002(var9, 134217728, -30, var8);
                this.method2002(var9, 8388608, -128, var8 - 1);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg5 == 0) {
                this.method2002(var9, 4194304, 9, var8);
                this.method2002(var9 - 1, 67108864, -126, var8 + 1);
            }
            if (arg5 == 1) {
                this.method2002(var9, 16777216, -127, var8);
                this.method2002(var9 + 1, 268435456, 53, var8 + 1);
            }
            if (arg5 == 2) {
                this.method2002(var9, 67108864, arg3 - 126, var8);
                this.method2002(var9 + 1, 4194304, -125, var8 - 1);
            }
            if (arg5 == 3) {
                this.method2002(var9, 268435456, -128, var8);
                this.method2002(var9 - 1, 16777216, -40, var8 - 1);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method2002(var9, 545259520, arg3 ^ 0x54, var8);
            this.method2002(var9 - 1, 33554432, 17, var8);
            this.method2002(var9, 134217728, 9, var8 + 1);
        }
        if (arg5 == 1) {
            this.method2002(var9, 41943040, 37, var8);
            this.method2002(var9, 134217728, -128, var8 + 1);
            this.method2002(var9 + 1, 536870912, 47, var8);
        }
        if (arg5 == 2) {
            this.method2002(var9, 167772160, 19, var8);
            this.method2002(var9 + 1, 536870912, -18, var8);
            this.method2002(var9, 8388608, 39, var8 - 1);
        }
        if (arg5 == 3) {
            this.method2002(var9, 671088640, -5, var8);
            this.method2002(var9, 8388608, -126, var8 - 1);
            this.method2002(var9 - 1, 33554432, 118, var8);
            return;
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(IB)V")
    public static final void method1991(int arg0, byte arg1) {
        class156.field1978 = -1;
        class9.field148 = arg0;
        class1.field5 = 0;
        field4472++;
        class76.field985 = -1;
        if (arg1 >= -79) {
            field4480 = null;
        }
        class534.field7859 = null;
        class176.field2324 = 1;
        class498.field7216 = false;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(B)V")
    public static void method1992(byte arg0) {
        if (arg0 <= 111) {
            field4488 = -23;
        }
        field4480 = null;
        field4487 = null;
    }

    @OriginalMember(owner = "client!is", name = "b", descriptor = "(III)V")
    public final void method1993(int arg0, int arg1, int arg2) {
        field4473++;
        int var4 = -84 % ((arg1 + 65) / 41);
        int var5 = arg2 - this.field4464;
        int var6 = arg0 - this.field4478;
        this.field4465[var6][var5] = class378.method2145(this.field4465[var6][var5], -262145);
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(IBIIIIIIII)Z")
    public final boolean method1994(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field4476++;
        int var11 = -28 / ((arg1 - 26) / 34);
        int var12 = arg9 + arg8;
        int var13 = arg2 + arg3;
        int var14 = arg5 + arg0;
        int var15 = arg4 + arg6;
        if (arg9 == var14 && (arg7 & 0x2) == 0) {
            int var16 = arg2 <= arg6 ? arg6 : arg2;
            int var17 = var13 < var15 ? var13 : var15;
            while (var17 > var16) {
                if ((this.field4465[var14 - this.field4478 - 1][var16 - this.field4464] & 0x8) == 0) {
                    return true;
                }
                var16++;
            }
        } else if (arg5 == var12 && (arg7 & 0x8) == 0) {
            int var18 = arg6 < arg2 ? arg2 : arg6;
            int var19 = var15 <= var13 ? var15 : var13;
            while (var18 < var19) {
                if ((this.field4465[arg5 - this.field4478][var18 - this.field4464] & 0x80) == 0) {
                    return true;
                }
                var18++;
            }
        } else if (arg2 == var15 && (arg7 & 0x1) == 0) {
            int var20 = arg9 > arg5 ? arg9 : arg5;
            int var21 = var14 <= var12 ? var14 : var12;
            while (var21 > var20) {
                if ((this.field4465[var20 - this.field4478][var15 - this.field4464 - 1] & 0x2) == 0) {
                    return true;
                }
                var20++;
            }
        } else if (arg6 == var13 && (arg7 & 0x4) == 0) {
            int var22 = arg5 < arg9 ? arg9 : arg5;
            int var23 = var12 >= var14 ? var14 : var12;
            while (var23 > var22) {
                if ((this.field4465[var22 - this.field4478][arg6 - this.field4464] & 0x20) == 0) {
                    return true;
                }
                var22++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(IZIBIIZI)V")
    public final void method1995(int arg0, boolean arg1, int arg2, byte arg3, int arg4, int arg5, boolean arg6, int arg7) {
        field4484++;
        if (arg3 >= -59) {
            method1999(-24, 65, 121, -59);
        }
        int var9 = 256;
        if (arg6) {
            var9 |= 0x20000;
        }
        if (arg4 == 1 || arg4 == 3) {
            int var10 = arg7;
            arg7 = arg0;
            arg0 = var10;
        }
        int var11 = arg5 - this.field4464;
        if (arg1) {
            var9 |= 0x40000000;
        }
        int var12 = arg2 - this.field4478;
        for (int var13 = var12; var13 < arg7 + var12; var13++) {
            if (var13 >= 0 && var13 < this.field4474) {
                for (int var14 = var11; var14 < arg0 + var11; var14++) {
                    if (var14 >= 0 && var14 < this.field4467) {
                        this.method1988(var9, var14, 2883968, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(IIIIZIZ)V")
    public final void method1996(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, boolean arg6) {
        field4483++;
        int var8 = arg3 - this.field4478;
        int var9 = arg1 - this.field4464;
        if (~arg5 == arg0) {
            if (arg2 == 0) {
                this.method1988(128, var9, 2883968, var8);
                this.method1988(8, var9, arg0 ^ 0xFFD3FE7F, var8 - 1);
            }
            if (arg2 == 1) {
                this.method1988(2, var9, 2883968, var8);
                this.method1988(32, var9 + 1, arg0 ^ 0xFFD3FE7F, var8);
            }
            if (arg2 == 2) {
                this.method1988(8, var9, arg0 + 2883969, var8);
                this.method1988(128, var9, arg0 + 2883969, var8 + 1);
            }
            if (arg2 == 3) {
                this.method1988(32, var9, arg0 + 2883969, var8);
                this.method1988(2, var9 - 1, arg0 ^ 0xFFD3FE7F, var8);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg2 == 0) {
                this.method1988(1, var9, 2883968, var8);
                this.method1988(16, var9 + 1, 2883968, var8 - 1);
            }
            if (arg2 == 1) {
                this.method1988(4, var9, 2883968, var8);
                this.method1988(64, var9 + 1, 2883968, var8 + 1);
            }
            if (arg2 == 2) {
                this.method1988(16, var9, 2883968, var8);
                this.method1988(1, var9 - 1, 2883968, var8 + 1);
            }
            if (arg2 == 3) {
                this.method1988(64, var9, arg0 + 2883969, var8);
                this.method1988(4, var9 - 1, 2883968, var8 - 1);
            }
        }
        if (arg5 == 2) {
            if (arg2 == 0) {
                this.method1988(130, var9, arg0 + 2883969, var8);
                this.method1988(8, var9, 2883968, var8 - 1);
                this.method1988(32, var9 + 1, 2883968, var8);
            }
            if (arg2 == 1) {
                this.method1988(10, var9, arg0 ^ 0xFFD3FE7F, var8);
                this.method1988(32, var9 + 1, 2883968, var8);
                this.method1988(128, var9, 2883968, var8 + 1);
            }
            if (arg2 == 2) {
                this.method1988(40, var9, 2883968, var8);
                this.method1988(128, var9, arg0 + 2883969, var8 + 1);
                this.method1988(2, var9 - 1, 2883968, var8);
            }
            if (arg2 == 3) {
                this.method1988(160, var9, arg0 ^ 0xFFD3FE7F, var8);
                this.method1988(2, var9 - 1, 2883968, var8);
                this.method1988(8, var9, 2883968, var8 - 1);
            }
        }
        if (arg6) {
            if (arg5 == 0) {
                if (arg2 == 0) {
                    this.method1988(65536, var9, 2883968, var8);
                    this.method1988(4096, var9, 2883968, var8 - 1);
                }
                if (arg2 == 1) {
                    this.method1988(1024, var9, 2883968, var8);
                    this.method1988(16384, var9 + 1, 2883968, var8);
                }
                if (arg2 == 2) {
                    this.method1988(4096, var9, 2883968, var8);
                    this.method1988(65536, var9, 2883968, var8 + 1);
                }
                if (arg2 == 3) {
                    this.method1988(16384, var9, 2883968, var8);
                    this.method1988(1024, var9 - 1, arg0 ^ 0xFFD3FE7F, var8);
                }
            }
            if (arg5 == 1 || arg5 == 3) {
                if (arg2 == 0) {
                    this.method1988(512, var9, arg0 + 2883969, var8);
                    this.method1988(8192, var9 + 1, 2883968, var8 - 1);
                }
                if (arg2 == 1) {
                    this.method1988(2048, var9, 2883968, var8);
                    this.method1988(32768, var9 + 1, 2883968, var8 + 1);
                }
                if (arg2 == 2) {
                    this.method1988(8192, var9, 2883968, var8);
                    this.method1988(512, var9 - 1, 2883968, var8 + 1);
                }
                if (arg2 == 3) {
                    this.method1988(32768, var9, 2883968, var8);
                    this.method1988(2048, var9 - 1, arg0 + 2883969, var8 - 1);
                }
            }
            if (arg5 == 2) {
                if (arg2 == 0) {
                    this.method1988(66560, var9, arg0 + 2883969, var8);
                    this.method1988(4096, var9, 2883968, var8 - 1);
                    this.method1988(16384, var9 + 1, arg0 ^ 0xFFD3FE7F, var8);
                }
                if (arg2 == 1) {
                    this.method1988(5120, var9, arg0 + 2883969, var8);
                    this.method1988(16384, var9 + 1, 2883968, var8);
                    this.method1988(65536, var9, 2883968, var8 + 1);
                }
                if (arg2 == 2) {
                    this.method1988(20480, var9, arg0 + 2883969, var8);
                    this.method1988(65536, var9, 2883968, var8 + 1);
                    this.method1988(1024, var9 - 1, 2883968, var8);
                }
                if (arg2 == 3) {
                    this.method1988(81920, var9, 2883968, var8);
                    this.method1988(1024, var9 - 1, 2883968, var8);
                    this.method1988(4096, var9, 2883968, var8 - 1);
                }
            }
        }
        if (!arg4) {
            return;
        }
        if (arg5 == 0) {
            if (arg2 == 0) {
                this.method1988(536870912, var9, arg0 + 2883969, var8);
                this.method1988(33554432, var9, arg0 + 2883969, var8 + -1);
            }
            if (arg2 == 1) {
                this.method1988(8388608, var9, arg0 ^ 0xFFD3FE7F, var8);
                this.method1988(134217728, var9 + 1, arg0 ^ 0xFFD3FE7F, var8);
            }
            if (arg2 == 2) {
                this.method1988(33554432, var9, 2883968, var8);
                this.method1988(536870912, var9, 2883968, var8 + 1);
            }
            if (arg2 == 3) {
                this.method1988(134217728, var9, arg0 + 2883969, var8);
                this.method1988(8388608, var9 - 1, 2883968, var8);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg2 == 0) {
                this.method1988(4194304, var9, arg0 + 2883969, var8);
                this.method1988(67108864, var9 + 1, arg0 ^ 0xFFD3FE7F, var8 - 1);
            }
            if (arg2 == 1) {
                this.method1988(16777216, var9, 2883968, var8);
                this.method1988(268435456, var9 + 1, 2883968, var8 + 1);
            }
            if (arg2 == 2) {
                this.method1988(67108864, var9, 2883968, var8);
                this.method1988(4194304, var9 - 1, 2883968, var8 + 1);
            }
            if (arg2 == 3) {
                this.method1988(268435456, var9, 2883968, var8);
                this.method1988(16777216, var9 - 1, 2883968, var8 - 1);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method1988(545259520, var9, 2883968, var8);
            this.method1988(33554432, var9, 2883968, var8 - 1);
            this.method1988(134217728, var9 + 1, 2883968, var8);
        }
        if (arg2 == 1) {
            this.method1988(41943040, var9, 2883968, var8);
            this.method1988(134217728, var9 + 1, arg0 ^ 0xFFD3FE7F, var8);
            this.method1988(536870912, var9, 2883968, var8 + 1);
        }
        if (arg2 == 2) {
            this.method1988(167772160, var9, 2883968, var8);
            this.method1988(536870912, var9, 2883968, var8 + 1);
            this.method1988(8388608, var9 - 1, arg0 ^ 0xFFD3FE7F, var8);
        }
        if (arg2 == 3) {
            this.method1988(671088640, var9, arg0 ^ 0xFFD3FE7F, var8);
            this.method1988(8388608, var9 - 1, 2883968, var8);
            this.method1988(33554432, var9, arg0 ^ 0xFFD3FE7F, var8 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(IIIIIIIII)Z")
    public final boolean method1997(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4469++;
        if (arg2 > 1) {
            return class265.method1573(arg2, arg6, (byte) -113, arg0, arg4, arg8, arg5, arg2, arg7) ? true : this.method1994(arg5, (byte) -9, arg6, arg2, arg4, arg7, arg8, arg3, arg2, arg0);
        }
        int var10 = arg5 + arg7 - 1;
        int var11 = arg8 - (1 - arg4);
        if (arg0 >= arg7 && arg0 <= var10 && arg6 >= arg8 && var11 >= arg6) {
            return true;
        } else if (arg7 - 1 == arg0 && arg6 >= arg8 && var11 >= arg6 && (this.field4465[arg0 - this.field4478][arg6 - this.field4464] & 0x8) == 0 && (arg3 & 0x8) == 0) {
            return true;
        } else if (var10 + 1 == arg0 && arg6 >= arg8 && var11 >= arg6 && (this.field4465[arg0 - this.field4478][arg6 - this.field4464] & 0x80) == 0 && (arg3 & 0x2) == 0) {
            return true;
        } else if (arg8 - arg1 == arg6 && arg7 <= arg0 && arg0 <= var10 && (this.field4465[arg0 - this.field4478][arg6 - this.field4464] & 0x2) == 0 && (arg3 & 0x4) == 0) {
            return true;
        } else {
            return var11 + 1 == arg6 && arg7 <= arg0 && var10 >= arg0 && (this.field4465[arg0 - this.field4478][arg6 - this.field4464] & 0x20) == 0 && (arg3 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(BII)V")
    public final void method1998(byte arg0, int arg1, int arg2) {
        field4471++;
        int var4 = arg1 - this.field4478;
        if (arg0 >= 54) {
            int var5 = arg2 - this.field4464;
            this.field4465[var4][var5] = class215.method1323(this.field4465[var4][var5], 2097152);
        }
    }

    @OriginalMember(owner = "client!is", name = "b", descriptor = "(IIII)I")
    public static final int method1999(int arg0, int arg1, int arg2, int arg3) {
        field4485++;
        if (class285.field3646 < 100) {
            return -2;
        }
        int var4 = arg2;
        int var5 = Integer.MAX_VALUE;
        int var6 = arg1 - class241.field3112;
        int var7 = arg3 - class241.field3119;
        for (class160 var8 = (class160) class241.field3099.method153(0); var8 != null; var8 = (class160) class241.field3099.method161(arg2 - 105)) {
            if (var8.field2035 == arg0) {
                int var9 = var8.field2043;
                int var10 = var8.field2036;
                int var11 = class241.field3112 + var9 << 14 | class241.field3119 + var10;
                int var12 = (var7 - var10) * (var7 - var10) + (var6 - var9) * (var6 - var9);
                if (var4 < 0 || var12 < var5) {
                    var4 = var11;
                    var5 = var12;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!is", name = "c", descriptor = "(III)V")
    public final void method2000(int arg0, int arg1, int arg2) {
        field4479++;
        int var4 = arg2 - this.field4478;
        int var5 = arg1 - this.field4464;
        this.field4465[var4][var5] = class215.method1323(this.field4465[var4][var5], 262144);
        int var6 = -75 / ((-arg0 - 7) / 49);
    }

    @OriginalMember(owner = "client!is", name = "b", descriptor = "(IIIIIIII)Z")
    public final boolean method2001(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4481++;
        if (arg5 != -1) {
            this.field4474 = 80;
        }
        if (arg6 == 1) {
            if (arg0 == arg7 && arg2 == arg4) {
                return true;
            }
        } else if (arg7 <= arg0 && (arg6 + arg7 - 1) >= arg0 && arg2 >= arg2 && arg2 <= arg6 + arg2 - 1) {
            return true;
        }
        int var9 = arg7 - this.field4478;
        int var10 = arg0 - this.field4478;
        int var11 = arg4 - this.field4464;
        int var12 = arg2 - this.field4464;
        if (arg6 == 1) {
            if (arg3 == 0) {
                if (arg1 == 0) {
                    if ((var10 - 1) == var9 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var12 + 1 == var11 && (this.field4465[var9][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var12 - 1 == var11 && (this.field4465[var9][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var9 == var10 && (var12 + 1) == var11) {
                        return true;
                    }
                    if ((var10 - 1) == var9 && var11 == var12 && (this.field4465[var9][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var9 && var11 == var12 && (this.field4465[var9][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var10 + 1 == var9 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && (var12 + 1) == var11 && (this.field4465[var9][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var12 - 1 == var11 && (this.field4465[var9][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var9 == var10 && var12 - 1 == var11) {
                        return true;
                    }
                    if (var10 - 1 == var9 && var11 == var12 && (this.field4465[var9][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var9 && var11 == var12 && (this.field4465[var9][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 2) {
                if (arg1 == 0) {
                    if (var10 - 1 == var9 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var12 + 1 == var11) {
                        return true;
                    }
                    if (var10 + 1 == var9 && var11 == var12 && (this.field4465[var9][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var12 - 1) == var11 && (this.field4465[var9][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if ((var10 - 1) == var9 && var11 == var12 && (this.field4465[var9][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var12 + 1) == var11) {
                        return true;
                    }
                    if ((var10 + 1) == var9 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var12 - 1 == var11 && (this.field4465[var9][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var10 - 1 == var9 && var11 == var12 && (this.field4465[var9][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var12 + 1 == var11 && (this.field4465[var9][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var9 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var12 - 1 == var11) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if ((var10 - 1) == var9 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var12 + 1 == var11 && (this.field4465[var9][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var9 && var11 == var12 && (this.field4465[var9][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var12 - 1) == var11) {
                        return true;
                    }
                }
            }
            if (arg3 == 9) {
                if (var9 == var10 && (var12 + 1) == var11 && (this.field4465[var9][var11] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var10 && var12 - 1 == var11 && (this.field4465[var9][var11] & 0x2) == 0) {
                    return true;
                }
                if (var10 - 1 == var9 && var11 == var12 && (this.field4465[var9][var11] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var9 && var11 == var12 && (this.field4465[var9][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg6 + var9 - 1;
            int var14 = arg6 + var11 - 1;
            if (arg3 == 0) {
                if (arg1 == 0) {
                    if ((var10 - arg6) == var9 && var11 <= var12 && var14 >= var12) {
                        return true;
                    }
                    if (var9 <= var10 && var13 >= var10 && (var12 + 1) == var11 && (this.field4465[var10][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 >= var9 && var13 >= var10 && (var12 - arg6) == var11 && (this.field4465[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var10 >= var9 && var10 <= var13 && (var12 + 1) == var11) {
                        return true;
                    }
                    if (var10 - arg6 == var9 && var11 <= var12 && var12 <= var14 && (this.field4465[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var9 && var11 <= var12 && var14 >= var12 && (this.field4465[var9][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var10 + 1 == var9 && var12 >= var11 && var14 >= var12) {
                        return true;
                    }
                    if (var9 <= var10 && var13 >= var10 && (var12 + 1) == var11 && (this.field4465[var10][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 <= var10 && var10 <= var13 && var12 - arg6 == var11 && (this.field4465[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var10 >= var9 && var13 >= var10 && (var12 - arg6) == var11) {
                        return true;
                    }
                    if (var10 - arg6 == var9 && var11 <= var12 && var12 <= var14 && (this.field4465[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var9 && var12 >= var11 && var14 >= var12 && (this.field4465[var9][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 2) {
                if (arg1 == 0) {
                    if (var10 - arg6 == var9 && var11 <= var12 && var14 >= var12) {
                        return true;
                    }
                    if (var9 <= var10 && var10 <= var13 && (var12 + 1) == var11) {
                        return true;
                    }
                    if (var10 + 1 == var9 && var11 <= var12 && var12 <= var14 && (this.field4465[var9][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 <= var10 && var10 <= var13 && var12 - arg6 == var11 && (this.field4465[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var10 - arg6 == var9 && var11 <= var12 && var14 >= var12 && (this.field4465[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 <= var10 && var13 >= var10 && var12 + 1 == var11) {
                        return true;
                    }
                    if ((var10 + 1) == var9 && var11 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var9 <= var10 && var10 <= var13 && (var12 - arg6) == var11 && (this.field4465[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var10 - arg6 == var9 && var12 >= var11 && var12 <= var14 && (this.field4465[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 >= var9 && var10 <= var13 && var12 + 1 == var11 && (this.field4465[var10][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var9 && var12 >= var11 && var14 >= var12) {
                        return true;
                    }
                    if (var10 >= var9 && var10 <= var13 && var12 - arg6 == var11) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var10 - arg6 == var9 && var12 >= var11 && var14 >= var12) {
                        return true;
                    }
                    if (var10 >= var9 && var13 >= var10 && (var12 + 1) == var11 && (this.field4465[var10][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var9 && var12 >= var11 && var12 <= var14 && (this.field4465[var9][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 >= var9 && var13 >= var10 && (var12 - arg6) == var11) {
                        return true;
                    }
                }
            }
            if (arg3 == 9) {
                if (var10 >= var9 && var13 >= var10 && var12 + 1 == var11 && (this.field4465[var10][var11] & 0x2C0120) == 0) {
                    return true;
                }
                if (var9 <= var10 && var13 >= var10 && (var12 - arg6) == var11 && (this.field4465[var10][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if (var10 - arg6 == var9 && var11 <= var12 && var12 <= var14 && (this.field4465[var13][var12] & 0x2C0108) == 0) {
                    return true;
                }
                if ((var10 + 1) == var9 && var12 >= var11 && var12 <= var14 && (this.field4465[var9][var12] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!is", name = "c", descriptor = "(IIII)V")
    private final void method2002(int arg0, int arg1, int arg2, int arg3) {
        int var5 = -76 / ((arg2 + 89) / 36);
        this.field4465[arg0][arg3] = class215.method1323(this.field4465[arg0][arg3], arg1);
        field4470++;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(ZIIIZII)V")
    public final void method2003(boolean arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field4468++;
        int var8 = 256;
        if (arg0) {
            var8 |= 0x20000;
        }
        int var9 = -84 % ((arg1 - 68) / 52);
        int var10 = arg5 - this.field4478;
        int var11 = arg2 - this.field4464;
        if (arg4) {
            var8 |= 0x40000000;
        }
        for (int var12 = var10; var12 < var10 + arg3; var12++) {
            if (var12 >= 0 && var12 < this.field4474) {
                for (int var13 = var11; var13 < (arg6 + var11); var13++) {
                    if (var13 >= 0 && this.field4467 > var13) {
                        this.method2002(var12, var8, -6, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(I)V")
    public final void method2004(int arg0) {
        if (arg0 != -1) {
            field4487 = null;
        }
        for (int var2 = 0; var2 < this.field4474; var2++) {
            for (int var3 = 0; var3 < this.field4467; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= this.field4474 - 5 || var3 >= (this.field4467 - 5)) {
                    this.field4465[var2][var3] = -1;
                } else {
                    this.field4465[var2][var3] = 2097152;
                }
            }
        }
        field4486++;
    }

    static {
        new class335("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
        field4487 = new class335("Loading world map - ", "Lade Weltkarte - ", "Chargement de la mappemonde - ", "Carregando mapa-múndi - ");
        new class335(null, "bevor du die Option 'Regelverstoß melden' benutzt.", null, null);
        field4489 = -1;
    }
}
