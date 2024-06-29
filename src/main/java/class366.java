import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class366 {

    @OriginalMember(owner = "client!g", name = "j", descriptor = "I")
    public static int field4985 = 0;

    @OriginalMember(owner = "client!g", name = "h", descriptor = "I")
    public static int field4983 = -1;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "I")
    public static int field4976;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "I")
    public static int field4978;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "I")
    public static int field4979;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "I")
    public static int field4980;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "I")
    public int field4981;

    @OriginalMember(owner = "client!g", name = "g", descriptor = "I")
    public int field4982;

    @OriginalMember(owner = "client!g", name = "i", descriptor = "I")
    public static int field4984;

    @OriginalMember(owner = "client!g", name = "k", descriptor = "I")
    public static int field4986;

    @OriginalMember(owner = "client!g", name = "l", descriptor = "I")
    public static int field4987;

    @OriginalMember(owner = "client!g", name = "m", descriptor = "I")
    public static int field4988;

    @OriginalMember(owner = "client!g", name = "n", descriptor = "I")
    public static int field4989;

    @OriginalMember(owner = "client!g", name = "o", descriptor = "I")
    public static int field4990;

    @OriginalMember(owner = "client!g", name = "p", descriptor = "I")
    public static int field4991;

    @OriginalMember(owner = "client!g", name = "q", descriptor = "I")
    public int field4992;

    @OriginalMember(owner = "client!g", name = "r", descriptor = "I")
    public static int field4993;

    @OriginalMember(owner = "client!g", name = "s", descriptor = "I")
    public static int field4994;

    @OriginalMember(owner = "client!g", name = "t", descriptor = "I")
    public static int field4995;

    @OriginalMember(owner = "client!g", name = "u", descriptor = "I")
    public static int field4996;

    @OriginalMember(owner = "client!g", name = "v", descriptor = "I")
    public static int field4997;

    @OriginalMember(owner = "client!g", name = "w", descriptor = "I")
    public static int field4998;

    @OriginalMember(owner = "client!g", name = "x", descriptor = "I")
    public int field4999;

    @OriginalMember(owner = "client!g", name = "y", descriptor = "I")
    public static int field5000;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "[[I")
    public int[][] field4977;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(III)V")
    public final void method2299(int arg0, int arg1, int arg2) {
        field4991++;
        int var4 = arg2 - this.field4982;
        int var5 = arg0 - this.field4992;
        this.field4977[var4][var5] = class213.method1307(this.field4977[var4][var5], 262144);
        if (arg1 != 6311) {
            this.method2305(-56, 104, -22, -43);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ZIIIIIIIII)Z")
    public final boolean method2300(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field4976++;
        int var11 = arg3 + arg5;
        if (!arg0) {
            this.method2301(true, -17, -13, -21, -114, -18, true);
        }
        int var12 = arg9 + arg7;
        int var13 = arg2 + arg4;
        int var14 = arg1 + arg6;
        if (arg3 == var13 && (arg8 & 0x2) == 0) {
            int var15 = arg9 > arg1 ? arg9 : arg1;
            int var16 = var14 > var12 ? var12 : var14;
            while (var16 > var15) {
                if ((this.field4977[var13 - this.field4982 - 1][var15 - this.field4992] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg2 == var11 && (arg8 & 0x8) == 0) {
            int var17 = arg9 <= arg1 ? arg1 : arg9;
            int var18 = var12 >= var14 ? var14 : var12;
            while (var18 > var17) {
                if ((this.field4977[arg2 - this.field4982][var17 - this.field4992] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg9 == var14 && (arg8 & 0x1) == 0) {
            int var19 = arg3 > arg2 ? arg3 : arg2;
            int var20 = var11 < var13 ? var11 : var13;
            while (var20 > var19) {
                if ((this.field4977[var19 - this.field4982][var14 - this.field4992 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg1 == var12 && (arg8 & 0x4) == 0) {
            int var21 = arg2 >= arg3 ? arg2 : arg3;
            int var22 = var11 >= var13 ? var13 : var11;
            while (var21 < var22) {
                if ((this.field4977[var21 - this.field4982][arg1 - this.field4992] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ZIIIIIZ)V")
    public final void method2301(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field4979++;
        int var8 = 256;
        if (arg6) {
            var8 |= 0x20000;
        }
        int var9 = arg2 - this.field4992;
        if (arg0) {
            var8 |= 0x40000000;
        }
        int var10 = arg1 - this.field4982;
        int var11 = var10;
        if (arg3 != -25599) {
            this.method2303(55, -111, -55, 13, -54, -11, 118, 9);
        }
        while (var11 < (arg4 + var10)) {
            if (var11 >= 0 && var11 < this.field4999) {
                for (int var12 = var9; var12 < arg5 + var9; var12++) {
                    if (var12 >= 0 && this.field4981 > var12) {
                        this.method2305(var12, var11, 1, var8);
                    }
                }
            }
            var11++;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIBZIZII)V")
    public final void method2302(int arg0, int arg1, byte arg2, boolean arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field4997++;
        int var9 = 256;
        if (arg3) {
            var9 |= 0x20000;
        }
        if (arg0 == 1 || arg0 == 3) {
            int var10 = arg4;
            arg4 = arg1;
            arg1 = var10;
        }
        int var11 = -78 % ((arg2 + 21) / 58);
        if (arg5) {
            var9 |= 0x40000000;
        }
        int var12 = arg7 - this.field4992;
        int var13 = arg6 - this.field4982;
        for (int var14 = var13; var14 < arg4 + var13; var14++) {
            if (var14 >= 0 && this.field4999 > var14) {
                for (int var15 = var12; var15 < (arg1 + var12); var15++) {
                    if (var15 >= 0 && this.field4981 > var15) {
                        this.method2310(var9, var14, var15, 8388608);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method2303(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg4 != 2048) {
            this.field4992 = -44;
        }
        field4990++;
        if (arg5 == 1) {
            if (arg0 == arg6 && arg1 == arg7) {
                return true;
            }
        } else if (arg6 <= arg0 && arg0 <= (arg6 + arg5 - 1) && arg7 <= arg7 && arg7 <= arg5 + arg7 - 1) {
            return true;
        }
        int var9 = arg6 - this.field4982;
        int var10 = arg1 - this.field4992;
        int var11 = arg0 - this.field4982;
        int var12 = arg7 - this.field4992;
        if (arg5 == 1) {
            if (arg2 == 6 || arg2 == 7) {
                if (arg2 == 7) {
                    arg3 = arg3 + 2 & 0x3;
                }
                if (arg3 == 0) {
                    if (var11 + 1 == var9 && var10 == var12 && (this.field4977[var9][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var12 - 1 == var10 && (this.field4977[var9][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var11 - 1 == var9 && var10 == var12 && (this.field4977[var9][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var12 - 1 == var10 && (this.field4977[var9][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if ((var11 - 1) == var9 && var10 == var12 && (this.field4977[var9][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var12 + 1 == var10 && (this.field4977[var9][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var11 + 1 == var9 && var10 == var12 && (this.field4977[var9][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var12 + 1 == var10 && (this.field4977[var9][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 8) {
                if (var9 == var11 && var12 + 1 == var10 && (this.field4977[var9][var10] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var11 && (var12 - 1) == var10 && (this.field4977[var9][var10] & 0x2) == 0) {
                    return true;
                }
                if ((var11 - 1) == var9 && var10 == var12 && (this.field4977[var9][var10] & 0x8) == 0) {
                    return true;
                }
                if ((var11 + 1) == var9 && var10 == var12 && (this.field4977[var9][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg5 + var9 - 1;
            int var14 = var10 + arg5 - 1;
            if (arg2 == 6 || arg2 == 7) {
                if (arg2 == 7) {
                    arg3 = arg3 + 2 & 0x3;
                }
                if (arg3 == 0) {
                    if ((var11 + 1) == var9 && var10 <= var12 && var14 >= var12 && (this.field4977[var9][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var13 >= var11 && var12 - arg5 == var10 && (this.field4977[var11][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var11 - arg5 == var9 && var10 <= var12 && var14 >= var12 && (this.field4977[var13][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var11 <= var13 && (var12 - arg5) == var10 && (this.field4977[var11][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var11 - arg5 == var9 && var12 >= var10 && var12 <= var14 && (this.field4977[var13][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var11 <= var13 && var12 + 1 == var10 && (this.field4977[var11][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if ((var11 + 1) == var9 && var12 >= var10 && var14 >= var12 && (this.field4977[var9][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var13 >= var11 && (var12 + 1) == var10 && (this.field4977[var11][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 8) {
                if (var11 >= var9 && var11 <= var13 && var12 + 1 == var10 && (this.field4977[var11][var10] & 0x20) == 0) {
                    return true;
                }
                if (var11 >= var9 && var11 <= var13 && var12 - arg5 == var10 && (this.field4977[var11][var14] & 0x2) == 0) {
                    return true;
                }
                if (var11 - arg5 == var9 && var12 >= var10 && var14 >= var12 && (this.field4977[var13][var12] & 0x8) == 0) {
                    return true;
                }
                if (var11 + 1 == var9 && var10 <= var12 && var14 >= var12 && (this.field4977[var9][var12] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(III)V")
    public final void method2304(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field4982;
        field4989++;
        if (arg1 < -91) {
            int var5 = arg0 - this.field4992;
            this.field4977[var4][var5] = class213.method1307(this.field4977[var4][var5], 2097152);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIII)V")
    private final void method2305(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 1) {
            this.field4982 = 26;
        }
        field4993++;
        this.field4977[arg1][arg0] = class213.method1307(this.field4977[arg1][arg0], arg3);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIZZIZI)V")
    public final void method2306(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, boolean arg5, int arg6) {
        int var8 = arg4 - this.field4982;
        field4984++;
        int var9 = arg1 - this.field4992;
        if (arg6 == 0) {
            if (arg0 == 0) {
                this.method2305(var9, var8, 1, 128);
                this.method2305(var9, var8 - 1, 1, 8);
            }
            if (arg0 == 1) {
                this.method2305(var9, var8, 1, 2);
                this.method2305(var9 + 1, var8, 1, 32);
            }
            if (arg0 == 2) {
                this.method2305(var9, var8, 1, 8);
                this.method2305(var9, var8 + 1, 1, 128);
            }
            if (arg0 == 3) {
                this.method2305(var9, var8, 1, 32);
                this.method2305(var9 - 1, var8, 1, 2);
            }
        }
        if (arg6 == 1 || arg6 == 3) {
            if (arg0 == 0) {
                this.method2305(var9, var8, 1, 1);
                this.method2305(var9 + 1, var8 + -1, 1, 16);
            }
            if (arg0 == 1) {
                this.method2305(var9, var8, 1, 4);
                this.method2305(var9 + 1, var8 + 1, 1, 64);
            }
            if (arg0 == 2) {
                this.method2305(var9, var8, 1, 16);
                this.method2305(var9 - 1, var8 + 1, 1, 1);
            }
            if (arg0 == 3) {
                this.method2305(var9, var8, 1, 64);
                this.method2305(var9 - 1, var8 - 1, 1, 4);
            }
        }
        if (arg3) {
            this.method2307(21, 72, true, 7, true, 64, false);
        }
        if (arg6 == 2) {
            if (arg0 == 0) {
                this.method2305(var9, var8, 1, 130);
                this.method2305(var9, var8 - 1, 1, 8);
                this.method2305(var9 + 1, var8, 1, 32);
            }
            if (arg0 == 1) {
                this.method2305(var9, var8, 1, 10);
                this.method2305(var9 + 1, var8, 1, 32);
                this.method2305(var9, var8 + 1, 1, 128);
            }
            if (arg0 == 2) {
                this.method2305(var9, var8, 1, 40);
                this.method2305(var9, var8 + 1, 1, 128);
                this.method2305(var9 - 1, var8, 1, 2);
            }
            if (arg0 == 3) {
                this.method2305(var9, var8, 1, 160);
                this.method2305(var9 - 1, var8, 1, 2);
                this.method2305(var9, var8 - 1, 1, 8);
            }
        }
        if (arg2) {
            if (arg6 == 0) {
                if (arg0 == 0) {
                    this.method2305(var9, var8, 1, 65536);
                    this.method2305(var9, var8 - 1, 1, 4096);
                }
                if (arg0 == 1) {
                    this.method2305(var9, var8, 1, 1024);
                    this.method2305(var9 + 1, var8, 1, 16384);
                }
                if (arg0 == 2) {
                    this.method2305(var9, var8, 1, 4096);
                    this.method2305(var9, var8 + 1, 1, 65536);
                }
                if (arg0 == 3) {
                    this.method2305(var9, var8, 1, 16384);
                    this.method2305(var9 - 1, var8, 1, 1024);
                }
            }
            if (arg6 == 1 || arg6 == 3) {
                if (arg0 == 0) {
                    this.method2305(var9, var8, 1, 512);
                    this.method2305(var9 + 1, var8 + -1, 1, 8192);
                }
                if (arg0 == 1) {
                    this.method2305(var9, var8, 1, 2048);
                    this.method2305(var9 + 1, var8 + 1, 1, 32768);
                }
                if (arg0 == 2) {
                    this.method2305(var9, var8, 1, 8192);
                    this.method2305(var9 - 1, var8 + 1, 1, 512);
                }
                if (arg0 == 3) {
                    this.method2305(var9, var8, 1, 32768);
                    this.method2305(var9 - 1, var8 + -1, 1, 2048);
                }
            }
            if (arg6 == 2) {
                if (arg0 == 0) {
                    this.method2305(var9, var8, 1, 66560);
                    this.method2305(var9, var8 - 1, 1, 4096);
                    this.method2305(var9 + 1, var8, 1, 16384);
                }
                if (arg0 == 1) {
                    this.method2305(var9, var8, 1, 5120);
                    this.method2305(var9 + 1, var8, 1, 16384);
                    this.method2305(var9, var8 + 1, 1, 65536);
                }
                if (arg0 == 2) {
                    this.method2305(var9, var8, 1, 20480);
                    this.method2305(var9, var8 + 1, 1, 65536);
                    this.method2305(var9 - 1, var8, 1, 1024);
                }
                if (arg0 == 3) {
                    this.method2305(var9, var8, 1, 81920);
                    this.method2305(var9 - 1, var8, 1, 1024);
                    this.method2305(var9, var8 - 1, 1, 4096);
                }
            }
        }
        if (!arg5) {
            return;
        }
        if (arg6 == 0) {
            if (arg0 == 0) {
                this.method2305(var9, var8, 1, 536870912);
                this.method2305(var9, var8 - 1, 1, 33554432);
            }
            if (arg0 == 1) {
                this.method2305(var9, var8, 1, 8388608);
                this.method2305(var9 + 1, var8, 1, 134217728);
            }
            if (arg0 == 2) {
                this.method2305(var9, var8, 1, 33554432);
                this.method2305(var9, var8 + 1, 1, 536870912);
            }
            if (arg0 == 3) {
                this.method2305(var9, var8, 1, 134217728);
                this.method2305(var9 - 1, var8, 1, 8388608);
            }
        }
        if (arg6 == 1 || arg6 == 3) {
            if (arg0 == 0) {
                this.method2305(var9, var8, 1, 4194304);
                this.method2305(var9 + 1, var8 - 1, 1, 67108864);
            }
            if (arg0 == 1) {
                this.method2305(var9, var8, 1, 16777216);
                this.method2305(var9 + 1, var8 + 1, 1, 268435456);
            }
            if (arg0 == 2) {
                this.method2305(var9, var8, 1, 67108864);
                this.method2305(var9 - 1, var8 + 1, 1, 4194304);
            }
            if (arg0 == 3) {
                this.method2305(var9, var8, 1, 268435456);
                this.method2305(var9 - 1, var8 - 1, 1, 16777216);
            }
        }
        if (arg6 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method2305(var9, var8, 1, 545259520);
            this.method2305(var9, var8 - 1, 1, 33554432);
            this.method2305(var9 + 1, var8, 1, 134217728);
        }
        if (arg0 == 1) {
            this.method2305(var9, var8, 1, 41943040);
            this.method2305(var9 + 1, var8, 1, 134217728);
            this.method2305(var9, var8 + 1, 1, 536870912);
        }
        if (arg0 == 2) {
            this.method2305(var9, var8, 1, 167772160);
            this.method2305(var9, var8 + 1, 1, 536870912);
            this.method2305(var9 - 1, var8, 1, 8388608);
        }
        if (arg0 == 3) {
            this.method2305(var9, var8, 1, 671088640);
            this.method2305(var9 - 1, var8, 1, 8388608);
            this.method2305(var9, var8 - 1, 1, 33554432);
            return;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIZIZIZ)V")
    public final void method2307(int arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5, boolean arg6) {
        int var8 = arg1 - this.field4992;
        int var9 = arg0 - this.field4982;
        field4996++;
        if (arg3 == 0) {
            if (arg5 == 0) {
                this.method2310(128, var9, var8, 8388608);
                this.method2310(8, var9 - 1, var8, 8388608);
            }
            if (arg5 == 1) {
                this.method2310(2, var9, var8, 8388608);
                this.method2310(32, var9, var8 + 1, 8388608);
            }
            if (arg5 == 2) {
                this.method2310(8, var9, var8, 8388608);
                this.method2310(128, var9 + 1, var8, 8388608);
            }
            if (arg5 == 3) {
                this.method2310(32, var9, var8, 8388608);
                this.method2310(2, var9, var8 - 1, 8388608);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg5 == 0) {
                this.method2310(1, var9, var8, 8388608);
                this.method2310(16, var9 - 1, var8 + 1, 8388608);
            }
            if (arg5 == 1) {
                this.method2310(4, var9, var8, 8388608);
                this.method2310(64, var9 + 1, var8 + 1, 8388608);
            }
            if (arg5 == 2) {
                this.method2310(16, var9, var8, 8388608);
                this.method2310(1, var9 + 1, var8 - 1, 8388608);
            }
            if (arg5 == 3) {
                this.method2310(64, var9, var8, 8388608);
                this.method2310(4, var9 - 1, var8 - 1, 8388608);
            }
        }
        if (arg3 == 2) {
            if (arg5 == 0) {
                this.method2310(130, var9, var8, 8388608);
                this.method2310(8, var9 - 1, var8, 8388608);
                this.method2310(32, var9, var8 + 1, 8388608);
            }
            if (arg5 == 1) {
                this.method2310(10, var9, var8, 8388608);
                this.method2310(32, var9, var8 + 1, 8388608);
                this.method2310(128, var9 + 1, var8, 8388608);
            }
            if (arg5 == 2) {
                this.method2310(40, var9, var8, 8388608);
                this.method2310(128, var9 + 1, var8, 8388608);
                this.method2310(2, var9, var8 - 1, 8388608);
            }
            if (arg5 == 3) {
                this.method2310(160, var9, var8, 8388608);
                this.method2310(2, var9, var8 - 1, 8388608);
                this.method2310(8, var9 - 1, var8, 8388608);
            }
        }
        if (arg6) {
            if (arg3 == 0) {
                if (arg5 == 0) {
                    this.method2310(65536, var9, var8, 8388608);
                    this.method2310(4096, var9 - 1, var8, 8388608);
                }
                if (arg5 == 1) {
                    this.method2310(1024, var9, var8, 8388608);
                    this.method2310(16384, var9, var8 + 1, 8388608);
                }
                if (arg5 == 2) {
                    this.method2310(4096, var9, var8, 8388608);
                    this.method2310(65536, var9 + 1, var8, 8388608);
                }
                if (arg5 == 3) {
                    this.method2310(16384, var9, var8, 8388608);
                    this.method2310(1024, var9, var8 - 1, 8388608);
                }
            }
            if (arg3 == 1 || arg3 == 3) {
                if (arg5 == 0) {
                    this.method2310(512, var9, var8, 8388608);
                    this.method2310(8192, var9 - 1, var8 + 1, 8388608);
                }
                if (arg5 == 1) {
                    this.method2310(2048, var9, var8, 8388608);
                    this.method2310(32768, var9 + 1, var8 + 1, 8388608);
                }
                if (arg5 == 2) {
                    this.method2310(8192, var9, var8, 8388608);
                    this.method2310(512, var9 + 1, var8 + -1, 8388608);
                }
                if (arg5 == 3) {
                    this.method2310(32768, var9, var8, 8388608);
                    this.method2310(2048, var9 - 1, var8 - 1, 8388608);
                }
            }
            if (arg3 == 2) {
                if (arg5 == 0) {
                    this.method2310(66560, var9, var8, 8388608);
                    this.method2310(4096, var9 - 1, var8, 8388608);
                    this.method2310(16384, var9, var8 + 1, 8388608);
                }
                if (arg5 == 1) {
                    this.method2310(5120, var9, var8, 8388608);
                    this.method2310(16384, var9, var8 + 1, 8388608);
                    this.method2310(65536, var9 + 1, var8, 8388608);
                }
                if (arg5 == 2) {
                    this.method2310(20480, var9, var8, 8388608);
                    this.method2310(65536, var9 + 1, var8, 8388608);
                    this.method2310(1024, var9, var8 - 1, 8388608);
                }
                if (arg5 == 3) {
                    this.method2310(81920, var9, var8, 8388608);
                    this.method2310(1024, var9, var8 - 1, 8388608);
                    this.method2310(4096, var9 - 1, var8, 8388608);
                }
            }
        }
        if (!arg2) {
            return;
        }
        if (arg3 == 0) {
            if (arg5 == 0) {
                this.method2310(536870912, var9, var8, 8388608);
                this.method2310(33554432, var9 - 1, var8, 8388608);
            }
            if (arg5 == 1) {
                this.method2310(8388608, var9, var8, 8388608);
                this.method2310(134217728, var9, var8 + 1, 8388608);
            }
            if (arg5 == 2) {
                this.method2310(33554432, var9, var8, 8388608);
                this.method2310(536870912, var9 + 1, var8, 8388608);
            }
            if (arg5 == 3) {
                this.method2310(134217728, var9, var8, 8388608);
                this.method2310(8388608, var9, var8 - 1, 8388608);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg5 == 0) {
                this.method2310(4194304, var9, var8, 8388608);
                this.method2310(67108864, var9 - 1, var8 + 1, 8388608);
            }
            if (arg5 == 1) {
                this.method2310(16777216, var9, var8, 8388608);
                this.method2310(268435456, var9 + 1, var8 + 1, 8388608);
            }
            if (arg5 == 2) {
                this.method2310(67108864, var9, var8, 8388608);
                this.method2310(4194304, var9 + 1, var8 + -1, 8388608);
            }
            if (arg5 == 3) {
                this.method2310(268435456, var9, var8, 8388608);
                this.method2310(16777216, var9 - 1, var8 - 1, 8388608);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method2310(545259520, var9, var8, 8388608);
            this.method2310(33554432, var9 - 1, var8, 8388608);
            this.method2310(134217728, var9, var8 + 1, 8388608);
        }
        if (arg5 == 1) {
            this.method2310(41943040, var9, var8, 8388608);
            this.method2310(134217728, var9, var8 + 1, 8388608);
            this.method2310(536870912, var9 + 1, var8, 8388608);
        }
        if (arg5 == 2) {
            this.method2310(167772160, var9, var8, 8388608);
            this.method2310(536870912, var9 + 1, var8, 8388608);
            this.method2310(8388608, var9, var8 - 1, 8388608);
        }
        if (arg5 == 3) {
            this.method2310(671088640, var9, var8, 8388608);
            this.method2310(8388608, var9, var8 - 1, 8388608);
            this.method2310(33554432, var9 - 1, var8, 8388608);
            return;
        }
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(III)V")
    public final void method2308(int arg0, int arg1, int arg2) {
        field4995++;
        int var4 = arg0 - this.field4982;
        int var5 = arg1 - this.field4992;
        this.field4977[var4][var5] = class191.method1183(this.field4977[var4][var5], -262145);
        if (arg2 != -1) {
            this.method2301(false, -111, 56, -7, -86, 72, true);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(BI)I")
    public static final int method2309(byte arg0, int arg1) {
        if (arg0 >= -53) {
            return -34;
        }
        field4986++;
        int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
        int var3 = arg1 * 6 - 61440;
        int var4 = (arg1 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(IIII)V")
    private final void method2310(int arg0, int arg1, int arg2, int arg3) {
        field5000++;
        if (arg3 == 8388608) {
            this.field4977[arg1][arg2] = class191.method1183(this.field4977[arg1][arg2], ~arg0);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method2311(String arg0, int arg1) {
        int var2 = -48 % ((1 - arg1) / 56);
        field4987++;
        return class396.method2450(arg0, 91, true, 10);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIIIIII)Z")
    public final boolean method2312(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4994++;
        if (arg2 > 1) {
            return class347.method2206(arg3, (byte) -70, arg6, arg2, arg4, arg8, arg5, arg0, arg2) ? true : this.method2300(true, arg5, arg3, arg6, arg8, arg2, arg4, arg2, arg1, arg0);
        } else if (arg7 == -1063950782) {
            int var10 = arg8 + arg3 - 1;
            int var11 = arg4 + arg5 - 1;
            if (arg6 >= arg3 && var10 >= arg6 && arg5 <= arg0 && arg0 <= var11) {
                return true;
            } else if (arg3 - 1 == arg6 && arg0 >= arg5 && var11 >= arg0 && (this.field4977[arg6 - this.field4982][arg0 - this.field4992] & 0x8) == 0 && (arg1 & 0x8) == 0) {
                return true;
            } else if (var10 + 1 == arg6 && arg5 <= arg0 && arg0 <= var11 && (this.field4977[arg6 - this.field4982][arg0 - this.field4992] & 0x80) == 0 && (arg1 & 0x2) == 0) {
                return true;
            } else if (arg5 - 1 == arg0 && arg3 <= arg6 && arg6 <= var10 && (this.field4977[arg6 - this.field4982][arg0 - this.field4992] & 0x2) == 0 && (arg1 & 0x4) == 0) {
                return true;
            } else {
                return (var11 + 1) == arg0 && arg3 <= arg6 && var10 >= arg6 && (this.field4977[arg6 - this.field4982][arg0 - this.field4992] & 0x20) == 0 && (arg1 & 0x1) == 0;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V")
    public final void method2313(int arg0) {
        field4988++;
        if (arg0 >= -7) {
            field4985 = 43;
        }
        for (int var2 = 0; var2 < this.field4999; var2++) {
            for (int var3 = 0; var3 < this.field4981; var3++) {
                if (var2 == 0 || var3 == 0 || (this.field4999 - 5) <= var2 || var3 >= this.field4981 - 5) {
                    this.field4977[var2][var3] = -1;
                } else {
                    this.field4977[var2][var3] = 2097152;
                }
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIB)V")
    public final void method2314(int arg0, int arg1, byte arg2) {
        int var4 = arg0 - this.field4982;
        int var5 = 74 % ((arg2 - 53) / 46);
        field4980++;
        int var6 = arg1 - this.field4992;
        this.field4977[var4][var6] = class191.method1183(this.field4977[var4][var6], -2097153);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(BIIIIIII)Z")
    public final boolean method2315(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4998++;
        if (arg5 == 1) {
            if (arg1 == arg7 && arg3 == arg4) {
                return true;
            }
        } else if (arg1 >= arg7 && (arg5 + arg7 - 1) >= arg1 && arg4 >= arg4 && arg4 <= (arg4 + arg5 - 1)) {
            return true;
        }
        int var9 = arg4 - this.field4992;
        int var10 = arg7 - this.field4982;
        int var11 = arg3 - this.field4992;
        int var12 = arg1 - this.field4982;
        if (arg5 == 1) {
            if (arg2 == 0) {
                if (arg6 == 0) {
                    if (var12 - 1 == var10 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && var9 + 1 == var11 && (this.field4977[var10][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var9 - 1 == var11 && (this.field4977[var10][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var10 == var12 && (var9 + 1) == var11) {
                        return true;
                    }
                    if (var12 - 1 == var10 && var9 == var11 && (this.field4977[var10][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var10 && var9 == var11 && (this.field4977[var10][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if (var12 + 1 == var10 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && (var9 + 1) == var11 && (this.field4977[var10][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var9 - 1) == var11 && (this.field4977[var10][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var10 == var12 && (var9 - 1) == var11) {
                        return true;
                    }
                    if (var12 - 1 == var10 && var9 == var11 && (this.field4977[var10][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var10 && var9 == var11 && (this.field4977[var10][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 2) {
                if (arg6 == 0) {
                    if (var12 - 1 == var10 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && var9 + 1 == var11) {
                        return true;
                    }
                    if ((var12 + 1) == var10 && var9 == var11 && (this.field4977[var10][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var9 - 1 == var11 && (this.field4977[var10][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var12 - 1 == var10 && var9 == var11 && (this.field4977[var10][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var9 + 1) == var11) {
                        return true;
                    }
                    if (var12 + 1 == var10 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && (var9 - 1) == var11 && (this.field4977[var10][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if ((var12 - 1) == var10 && var9 == var11 && (this.field4977[var10][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var9 + 1) == var11 && (this.field4977[var10][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var10 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && (var9 - 1) == var11) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if ((var12 - 1) == var10 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && var9 + 1 == var11 && (this.field4977[var10][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var10 && var9 == var11 && (this.field4977[var10][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var9 - 1) == var11) {
                        return true;
                    }
                }
            }
            if (arg2 == 9) {
                if (var10 == var12 && (var9 + 1) == var11 && (this.field4977[var10][var11] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var12 && (var9 - 1) == var11 && (this.field4977[var10][var11] & 0x2) == 0) {
                    return true;
                }
                if (var12 - 1 == var10 && var9 == var11 && (this.field4977[var10][var11] & 0x8) == 0) {
                    return true;
                }
                if (var12 + 1 == var10 && var9 == var11 && (this.field4977[var10][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var10 - (1 - arg5);
            int var14 = var11 + arg5 - 1;
            if (arg2 == 0) {
                if (arg6 == 0) {
                    if (var12 - arg5 == var10 && var11 <= var9 && var14 >= var9) {
                        return true;
                    }
                    if (var10 <= var12 && var13 >= var12 && (var9 + 1) == var11 && (this.field4977[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 <= var12 && var12 <= var13 && var9 - arg5 == var11 && (this.field4977[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var12 >= var10 && var12 <= var13 && (var9 + 1) == var11) {
                        return true;
                    }
                    if ((var12 - arg5) == var10 && var11 <= var9 && var14 >= var9 && (this.field4977[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var10 && var11 <= var9 && var14 >= var9 && (this.field4977[var10][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if ((var12 + 1) == var10 && var11 <= var9 && var9 <= var14) {
                        return true;
                    }
                    if (var10 <= var12 && var13 >= var12 && var9 + 1 == var11 && (this.field4977[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 >= var10 && var12 <= var13 && (var9 - arg5) == var11 && (this.field4977[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var10 <= var12 && var13 >= var12 && (var9 - arg5) == var11) {
                        return true;
                    }
                    if (var12 - arg5 == var10 && var9 >= var11 && var14 >= var9 && (this.field4977[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var10 && var9 >= var11 && var9 <= var14 && (this.field4977[var10][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 2) {
                if (arg6 == 0) {
                    if ((var12 - arg5) == var10 && var9 >= var11 && var14 >= var9) {
                        return true;
                    }
                    if (var10 <= var12 && var13 >= var12 && (var9 + 1) == var11) {
                        return true;
                    }
                    if ((var12 + 1) == var10 && var11 <= var9 && var9 <= var14 && (this.field4977[var10][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 <= var12 && var12 <= var13 && (var9 - arg5) == var11 && (this.field4977[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var12 - arg5 == var10 && var9 >= var11 && var9 <= var14 && (this.field4977[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 >= var10 && var13 >= var12 && var9 + 1 == var11) {
                        return true;
                    }
                    if ((var12 + 1) == var10 && var11 <= var9 && var9 <= var14) {
                        return true;
                    }
                    if (var10 <= var12 && var13 >= var12 && var9 - arg5 == var11 && (this.field4977[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if ((var12 - arg5) == var10 && var9 >= var11 && var9 <= var14 && (this.field4977[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 <= var12 && var12 <= var13 && (var9 + 1) == var11 && (this.field4977[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var10 && var11 <= var9 && var14 >= var9) {
                        return true;
                    }
                    if (var10 <= var12 && var13 >= var12 && (var9 - arg5) == var11) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if ((var12 - arg5) == var10 && var11 <= var9 && var9 <= var14) {
                        return true;
                    }
                    if (var12 >= var10 && var12 <= var13 && (var9 + 1) == var11 && (this.field4977[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var10 && var11 <= var9 && var14 >= var9 && (this.field4977[var10][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var12 >= var10 && var12 <= var13 && (var9 - arg5) == var11) {
                        return true;
                    }
                }
            }
            if (arg2 == 9) {
                if (var10 <= var12 && var13 >= var12 && (var9 + 1) == var11 && (this.field4977[var12][var11] & 0x2C0120) == 0) {
                    return true;
                }
                if (var10 <= var12 && var13 >= var12 && var9 - arg5 == var11 && (this.field4977[var12][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if (var12 - arg5 == var10 && var11 <= var9 && var14 >= var9 && (this.field4977[var13][var9] & 0x2C0108) == 0) {
                    return true;
                }
                if ((var12 + 1) == var10 && var11 <= var9 && var9 <= var14 && (this.field4977[var10][var9] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        if (arg0 < 75) {
            this.field4982 = 116;
        }
        return false;
    }
}
