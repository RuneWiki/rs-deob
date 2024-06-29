import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class262 {

    @OriginalMember(owner = "client!ne", name = "t", descriptor = "I")
    private int field4158 = 0;

    @OriginalMember(owner = "client!ne", name = "p", descriptor = "I")
    private int field4154;

    @OriginalMember(owner = "client!ne", name = "w", descriptor = "I")
    private int field4161;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "I")
    private int field4146;

    @OriginalMember(owner = "client!ne", name = "r", descriptor = "[[I")
    public int[][] field4156;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
    public static int field4139;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    public static int field4140;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "I")
    public static int field4142;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
    public static int field4143;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
    public static int field4144;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "I")
    public static int field4147;

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "I")
    public static int field4148;

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "I")
    public static int field4149;

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "I")
    public static int field4150;

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "I")
    public static int field4151;

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "I")
    public static int field4152;

    @OriginalMember(owner = "client!ne", name = "o", descriptor = "I")
    public static int field4153;

    @OriginalMember(owner = "client!ne", name = "q", descriptor = "I")
    public static int field4155;

    @OriginalMember(owner = "client!ne", name = "s", descriptor = "I")
    public static int field4157;

    @OriginalMember(owner = "client!ne", name = "u", descriptor = "I")
    public static int field4159;

    @OriginalMember(owner = "client!ne", name = "v", descriptor = "I")
    public static int field4160;

    @OriginalMember(owner = "client!ne", name = "x", descriptor = "I")
    public static int field4162;

    @OriginalMember(owner = "client!ne", name = "y", descriptor = "I")
    public static int field4163;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "Lkf;")
    public static class249 field4141;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "[[Z")
    public static boolean[][] field4145;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZIIZIII)V", line = 5)
    public final void method1845(boolean arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        int var8 = arg2 - this.field4161;
        field4148++;
        int var9 = arg6 - this.field4158;
        if (arg1 == 0) {
            if (arg4 == 0) {
                this.method1862(var9, 54, var8, 128);
                this.method1862(var9, 37, var8 - 1, 8);
            }
            if (arg4 == 1) {
                this.method1862(var9, arg5 ^ 0xFFFFB7D4, var8, 2);
                this.method1862(var9 + 1, arg5 ^ 0xFFFFB7CA, var8, 32);
            }
            if (arg4 == 2) {
                this.method1862(var9, 114, var8, 8);
                this.method1862(var9, 20, var8 + 1, 128);
            }
            if (arg4 == 3) {
                this.method1862(var9, 71, var8, 32);
                this.method1862(var9 - 1, arg5 + 18458, var8, 2);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg4 == 0) {
                this.method1862(var9, 96, var8, 1);
                this.method1862(var9 + 1, arg5 ^ 0xFFFFB7D6, var8 - 1, 16);
            }
            if (arg4 == 1) {
                this.method1862(var9, 54, var8, 4);
                this.method1862(var9 + 1, 20, var8 + 1, 64);
            }
            if (arg4 == 2) {
                this.method1862(var9, 118, var8, 16);
                this.method1862(var9 - 1, arg5 ^ 0xFFFFB7B8, var8 + 1, 1);
            }
            if (arg4 == 3) {
                this.method1862(var9, 38, var8, 64);
                this.method1862(var9 - 1, 72, var8 - 1, 4);
            }
        }
        if (arg5 != -18433) {
            this.field4146 = 85;
        }
        if (arg1 == 2) {
            if (arg4 == 0) {
                this.method1862(var9, 53, var8, 130);
                this.method1862(var9, 111, var8 - 1, 8);
                this.method1862(var9 + 1, arg5 ^ 0xFFFFB79C, var8, 32);
            }
            if (arg4 == 1) {
                this.method1862(var9, 72, var8, 10);
                this.method1862(var9 + 1, 56, var8, 32);
                this.method1862(var9, 23, var8 + 1, 128);
            }
            if (arg4 == 2) {
                this.method1862(var9, 54, var8, 40);
                this.method1862(var9, 122, var8 + 1, 128);
                this.method1862(var9 - 1, 89, var8, 2);
            }
            if (arg4 == 3) {
                this.method1862(var9, 83, var8, 160);
                this.method1862(var9 - 1, 36, var8, 2);
                this.method1862(var9, arg5 ^ 0xFFFFB7B2, var8 - 1, 8);
            }
        }
        if (arg0) {
            if (arg1 == 0) {
                if (arg4 == 0) {
                    this.method1862(var9, arg5 + 18521, var8, 65536);
                    this.method1862(var9, 70, var8 - 1, 4096);
                }
                if (arg4 == 1) {
                    this.method1862(var9, 85, var8, 1024);
                    this.method1862(var9 + 1, 83, var8, 16384);
                }
                if (arg4 == 2) {
                    this.method1862(var9, 48, var8, 4096);
                    this.method1862(var9, 93, var8 + 1, 65536);
                }
                if (arg4 == 3) {
                    this.method1862(var9, 75, var8, 16384);
                    this.method1862(var9 - 1, arg5 ^ 0xFFFFB7D3, var8, 1024);
                }
            }
            if (arg1 == 1 || arg1 == 3) {
                if (arg4 == 0) {
                    this.method1862(var9, 21, var8, 512);
                    this.method1862(var9 + 1, 69, var8 - 1, 8192);
                }
                if (arg4 == 1) {
                    this.method1862(var9, 30, var8, 2048);
                    this.method1862(var9 + 1, 92, var8 + 1, 32768);
                }
                if (arg4 == 2) {
                    this.method1862(var9, 122, var8, 8192);
                    this.method1862(var9 - 1, 44, var8 + 1, 512);
                }
                if (arg4 == 3) {
                    this.method1862(var9, 96, var8, 32768);
                    this.method1862(var9 - 1, 17, var8 - 1, 2048);
                }
            }
            if (arg1 == 2) {
                if (arg4 == 0) {
                    this.method1862(var9, 65, var8, 66560);
                    this.method1862(var9, 57, var8 - 1, 4096);
                    this.method1862(var9 + 1, 108, var8, 16384);
                }
                if (arg4 == 1) {
                    this.method1862(var9, arg5 + 18543, var8, 5120);
                    this.method1862(var9 + 1, arg5 ^ 0xFFFFB7A0, var8, 16384);
                    this.method1862(var9, arg5 ^ 0xFFFFB790, var8 + 1, 65536);
                }
                if (arg4 == 2) {
                    this.method1862(var9, 78, var8, 20480);
                    this.method1862(var9, 63, var8 + 1, 65536);
                    this.method1862(var9 - 1, 29, var8, 1024);
                }
                if (arg4 == 3) {
                    this.method1862(var9, 105, var8, 81920);
                    this.method1862(var9 - 1, 23, var8, 1024);
                    this.method1862(var9, 52, var8 - 1, 4096);
                }
            }
        }
        if (!arg3) {
            return;
        }
        if (arg1 == 0) {
            if (arg4 == 0) {
                this.method1862(var9, 90, var8, 536870912);
                this.method1862(var9, 111, var8 - 1, 33554432);
            }
            if (arg4 == 1) {
                this.method1862(var9, arg5 + 18546, var8, 8388608);
                this.method1862(var9 + 1, 87, var8, 134217728);
            }
            if (arg4 == 2) {
                this.method1862(var9, 55, var8, 33554432);
                this.method1862(var9, 21, var8 + 1, 536870912);
            }
            if (arg4 == 3) {
                this.method1862(var9, 97, var8, 134217728);
                this.method1862(var9 - 1, 111, var8, 8388608);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg4 == 0) {
                this.method1862(var9, arg5 + 18480, var8, 4194304);
                this.method1862(var9 + 1, 39, var8 - 1, 67108864);
            }
            if (arg4 == 1) {
                this.method1862(var9, 124, var8, 16777216);
                this.method1862(var9 + 1, 55, var8 + 1, 268435456);
            }
            if (arg4 == 2) {
                this.method1862(var9, 114, var8, 67108864);
                this.method1862(var9 - 1, 77, var8 + 1, 4194304);
            }
            if (arg4 == 3) {
                this.method1862(var9, 51, var8, 268435456);
                this.method1862(var9 - 1, arg5 ^ 0xFFFFB7EE, var8 - 1, 16777216);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method1862(var9, 90, var8, 545259520);
            this.method1862(var9, 122, var8 - 1, 33554432);
            this.method1862(var9 + 1, arg5 + 18484, var8, 134217728);
        }
        if (arg4 == 1) {
            this.method1862(var9, 81, var8, 41943040);
            this.method1862(var9 + 1, 35, var8, 134217728);
            this.method1862(var9, 120, var8 + 1, 536870912);
        }
        if (arg4 == 2) {
            this.method1862(var9, arg5 + 18558, var8, 167772160);
            this.method1862(var9, 103, var8 + 1, 536870912);
            this.method1862(var9 - 1, 72, var8, 8388608);
        }
        if (arg4 == 3) {
            this.method1862(var9, 49, var8, 671088640);
            this.method1862(var9 - 1, 122, var8, 8388608);
            this.method1862(var9, 76, var8 - 1, 33554432);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIIIIIII)Z", line = 319)
    private final boolean method1846(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field4140++;
        int var11 = arg7 + arg8;
        if (arg3 < 3) {
            this.field4158 = 5;
        }
        int var12 = arg4 + arg0;
        int var13 = arg2 + arg6;
        int var14 = arg5 + arg9;
        if (arg8 >= arg4 && arg8 < var12) {
            if (arg5 == var13 && (arg1 & 0x4) == 0) {
                int var15 = arg8;
                int var16 = var11 > var12 ? var12 : var11;
                while (var16 > var15) {
                    if ((this.field4156[var15 - this.field4161][var13 - this.field4158 - 1] & 0x2) == 0) {
                        return true;
                    }
                    var15++;
                }
            } else if (arg6 == var14 && (arg1 & 0x1) == 0) {
                int var17 = arg8;
                int var18 = var12 < var11 ? var12 : var11;
                while (var17 < var18) {
                    if ((this.field4156[var17 - this.field4161][arg6 - this.field4158] & 0x20) == 0) {
                        return true;
                    }
                    var17++;
                }
            }
        } else if (var11 > arg4 && var12 >= var11) {
            if (arg5 == var13 && (arg1 & 0x4) == 0) {
                int var19 = arg4;
                int var20 = var11 <= var12 ? var11 : var12;
                while (var19 < var20) {
                    if ((this.field4156[var19 - this.field4161][var13 - this.field4158 - 1] & 0x2) == 0) {
                        return true;
                    }
                    var19++;
                }
            } else if (arg6 == var14 && (arg1 & 0x1) == 0) {
                int var21 = arg4;
                int var22 = var11 > var12 ? var12 : var11;
                while (var22 > var21) {
                    if ((this.field4156[var21 - this.field4161][arg6 - this.field4158] & 0x20) == 0) {
                        return true;
                    }
                    var21++;
                }
            }
        } else if (arg5 <= arg6 && var14 > arg6) {
            if (arg4 == var11 && (arg1 & 0x8) == 0) {
                int var23 = arg6;
                int var24 = var14 >= var13 ? var13 : var14;
                while (var24 > var23) {
                    if ((this.field4156[var11 - this.field4161 - 1][var23 - this.field4158] & 0x8) == 0) {
                        return true;
                    }
                    var23++;
                }
            } else if (arg8 == var12 && (arg1 & 0x2) == 0) {
                int var25 = arg6;
                int var26 = var13 > var14 ? var14 : var13;
                while (var25 < var26) {
                    if ((this.field4156[arg8 - this.field4161][var25 - this.field4158] & 0x80) == 0) {
                        return true;
                    }
                    var25++;
                }
            }
        } else if (arg5 < var13 && var14 >= var13) {
            if (arg4 == var11 && (arg1 & 0x8) == 0) {
                int var27 = var13 <= var14 ? var13 : var14;
                for (int var28 = arg5; var28 < var27; var28++) {
                    if ((this.field4156[var11 - this.field4161 - 1][var28 - this.field4158] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg8 == var12 && (arg1 & 0x2) == 0) {
                int var29 = arg5;
                int var30 = var14 >= var13 ? var13 : var14;
                while (var30 > var29) {
                    if ((this.field4156[arg8 - this.field4161][var29 - this.field4158] & 0x80) == 0) {
                        return true;
                    }
                    var29++;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIIIIBI)Z", line = 488)
    public final boolean method1847(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8) {
        field4144++;
        if (arg8 > 1) {
            return class328.method2282(arg6, arg8, arg8, arg1, arg4, arg3, arg5, 0, arg2) ? true : this.method1846(arg3, arg0, arg8, arg7 + 197, arg6, arg1, arg4, arg8, arg2, arg5);
        }
        int var10 = arg3 + arg6 - 1;
        int var11 = arg1 + arg5 - 1;
        if (arg2 >= arg6 && arg2 <= var10 && arg4 >= arg1 && var11 >= arg4) {
            return true;
        } else if (arg6 - 1 == arg2 && arg4 >= arg1 && arg4 <= var11 && (this.field4156[arg2 - this.field4161][arg4 - this.field4158] & 0x8) == 0 && (arg0 & 0x8) == 0) {
            return true;
        } else if (arg7 != -91) {
            return false;
        } else if ((var10 + 1) == arg2 && arg1 <= arg4 && arg4 <= var11 && (this.field4156[arg2 - this.field4161][arg4 - this.field4158] & 0x80) == 0 && (arg0 & 0x2) == 0) {
            return true;
        } else if ((arg1 - 1) == arg4 && arg6 <= arg2 && var10 >= arg2 && (this.field4156[arg2 - this.field4161][arg4 - this.field4158] & 0x2) == 0 && (arg0 & 0x4) == 0) {
            return true;
        } else {
            return var11 + 1 == arg4 && arg6 <= arg2 && arg2 <= var10 && (this.field4156[arg2 - this.field4161][arg4 - this.field4158] & 0x20) == 0 && (arg0 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IBI)V", line = 529)
    public final void method1848(int arg0, byte arg1, int arg2) {
        field4150++;
        int var4 = arg2 - this.field4161;
        int var5 = arg0 - this.field4158;
        int var6 = 7 % ((-arg1 - 12) / 43);
        this.field4156[var4][var5] = class77.method492(this.field4156[var4][var5], 262144);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIB)Z", line = 542)
    public final boolean method1849(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field4159++;
        if (arg1 == arg3 && arg0 == arg2) {
            return true;
        }
        int var6 = arg2 - this.field4158;
        int var7 = arg1 - this.field4161;
        if (arg4 <= 121) {
            return true;
        } else if (var7 >= 0 && this.field4146 > var7 && var6 >= 0 && var6 < this.field4154) {
            int var8 = arg3 - this.field4161;
            int var9;
            if (var7 > var8) {
                var9 = var7 - var8;
            } else {
                var9 = var8 - var7;
            }
            int var10 = arg0 - this.field4158;
            int var11;
            if (var10 >= var6) {
                var11 = var10 - var6;
            } else {
                var11 = var6 - var10;
            }
            if (var11 < var9) {
                int var12 = 32768;
                int var13 = var11 * 65536 / var9;
                while (var7 != var8) {
                    if (var8 < var7) {
                        if ((this.field4156[var8][var10] & 0x2C0108) != 0) {
                            return false;
                        }
                        var8++;
                    } else if (var7 < var8) {
                        if ((this.field4156[var8][var10] & 0x2C0180) != 0) {
                            return false;
                        }
                        var8--;
                    }
                    var12 += var13;
                    if (var12 >= 65536) {
                        var12 -= 65536;
                        if (var6 > var10) {
                            if ((this.field4156[var8][var10] & 0x2C0102) != 0) {
                                return false;
                            }
                            var10++;
                        } else if (var6 < var10) {
                            if ((this.field4156[var8][var10] & 0x2C0120) != 0) {
                                return false;
                            }
                            var10--;
                        }
                    }
                }
            } else {
                int var14 = var9 * 65536 / var11;
                int var15 = 32768;
                while (var6 != var10) {
                    if (var10 < var6) {
                        if ((this.field4156[var8][var10] & 0x2C0102) != 0) {
                            return false;
                        }
                        var10++;
                    } else if (var10 > var6) {
                        if ((this.field4156[var8][var10] & 0x2C0120) != 0) {
                            return false;
                        }
                        var10--;
                    }
                    var15 += var14;
                    if (var15 >= 65536) {
                        var15 -= 65536;
                        if (var7 > var8) {
                            if ((this.field4156[var8][var10] & 0x2C0108) != 0) {
                                return false;
                            }
                            var8++;
                        } else if (var7 < var8) {
                            if ((this.field4156[var8][var10] & 0x2C0180) != 0) {
                                return false;
                            }
                            var8--;
                        }
                    }
                }
            }
            return (this.field4156[var7][var6] & 0x240100) == 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IZIIIIZI)V", line = 693)
    public final void method1850(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        int var9 = arg5 - this.field4158;
        int var10 = 256;
        if (arg3 == 1 || arg3 == 3) {
            int var11 = arg7;
            arg7 = arg4;
            arg4 = var11;
        }
        field4142++;
        int var12 = arg0 - this.field4161;
        if (arg2 != -30321) {
            this.field4146 = 42;
        }
        if (arg1) {
            var10 |= 0x20000;
        }
        if (arg6) {
            var10 |= 0x40000000;
        }
        for (int var13 = var12; var13 < (var12 + arg7); var13++) {
            if (var13 >= 0 && this.field4146 > var13) {
                for (int var14 = var9; var14 < arg4 + var9; var14++) {
                    if (var14 >= 0 && this.field4154 > var14) {
                        this.method1859(var14, 119, var13, var10);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V", line = 747)
    public final void method1851(int arg0) {
        int var2 = 0;
        if (arg0 != 15850) {
            field4141 = (class249) null;
        }
        while (var2 < this.field4146) {
            for (int var3 = 0; var3 < this.field4154; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= (this.field4146 - 5) || var3 >= (this.field4154 - 5)) {
                    this.field4156[var2][var3] = 16777215;
                } else {
                    this.field4156[var2][var3] = 2097152;
                }
            }
            var2++;
        }
        field4149++;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIBIIIII)Z", line = 778)
    public final boolean method1852(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4157++;
        if (arg5 == 1) {
            if (arg6 == arg7 && arg3 == arg4) {
                return true;
            }
        } else if (arg6 <= arg7 && arg7 <= (arg6 + arg5 - 1) && arg3 >= arg3 && (arg3 + arg5 - 1) >= arg3) {
            return true;
        }
        int var9 = arg3 - this.field4158;
        int var10 = arg4 - this.field4158;
        int var11 = arg7 - this.field4161;
        if (arg2 < 65) {
            this.field4158 = -99;
        }
        int var12 = arg6 - this.field4161;
        if (arg5 == 1) {
            if (arg0 == 6 || arg0 == 7) {
                if (arg0 == 7) {
                    arg1 = arg1 + 2 & 0x3;
                }
                if (arg1 == 0) {
                    if (var11 + 1 == var12 && var9 == var10 && (this.field4156[var12][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 - 1 == var10 && (this.field4156[var12][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var11 - 1 == var12 && var9 == var10 && (this.field4156[var12][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 - 1 == var10 && (this.field4156[var12][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var11 - 1 == var12 && var9 == var10 && (this.field4156[var12][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var9 + 1) == var10 && (this.field4156[var12][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var11 + 1 == var12 && var9 == var10 && (this.field4156[var12][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 + 1 == var10 && (this.field4156[var12][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 8) {
                if (var11 == var12 && (var9 + 1) == var10 && (this.field4156[var12][var10] & 0x20) == 0) {
                    return true;
                }
                if (var11 == var12 && var9 - 1 == var10 && (this.field4156[var12][var10] & 0x2) == 0) {
                    return true;
                }
                if (var11 - 1 == var12 && var9 == var10 && (this.field4156[var12][var10] & 0x8) == 0) {
                    return true;
                }
                if ((var11 + 1) == var12 && var9 == var10 && (this.field4156[var12][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg5 + var10 - 1;
            int var14 = arg5 + var12 - 1;
            if (arg0 == 6 || arg0 == 7) {
                if (arg0 == 7) {
                    arg1 = arg1 + 2 & 0x3;
                }
                if (arg1 == 0) {
                    if (var11 + 1 == var12 && var9 >= var10 && var13 >= var9 && (this.field4156[var12][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 <= var11 && var14 >= var11 && var9 - arg5 == var10 && (this.field4156[var11][var13] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if ((var11 - arg5) == var12 && var10 <= var9 && var13 >= var9 && (this.field4156[var14][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 <= var11 && var11 <= var14 && var9 - arg5 == var10 && (this.field4156[var11][var13] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if ((var11 - arg5) == var12 && var9 >= var10 && var9 <= var13 && (this.field4156[var14][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 <= var11 && var14 >= var11 && (var9 + 1) == var10 && (this.field4156[var11][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var11 + 1 == var12 && var9 >= var10 && var9 <= var13 && (this.field4156[var12][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 >= var12 && var11 <= var14 && (var9 + 1) == var10 && (this.field4156[var11][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 8) {
                if (var12 <= var11 && var14 >= var11 && (var9 + 1) == var10 && (this.field4156[var11][var10] & 0x20) == 0) {
                    return true;
                }
                if (var11 >= var12 && var14 >= var11 && (var9 - arg5) == var10 && (this.field4156[var11][var13] & 0x2) == 0) {
                    return true;
                }
                if (var11 - arg5 == var12 && var9 >= var10 && var9 <= var13 && (this.field4156[var14][var9] & 0x8) == 0) {
                    return true;
                }
                if (var11 + 1 == var12 && var10 <= var9 && var13 >= var9 && (this.field4156[var12][var9] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)V", line = 969)
    public static void method1853(int arg0) {
        if (arg0 != -13957) {
            method1853(82);
        }
        field4141 = null;
        field4145 = (boolean[][]) null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZZIIIZI)V", line = 981)
    public final void method1854(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field4162++;
        int var8 = 256;
        if (arg0) {
            var8 |= 0x20000;
        }
        int var9 = arg6 - this.field4161;
        if (arg1) {
            var8 |= 0x40000000;
        }
        int var10 = arg4 - this.field4158;
        if (arg5) {
            this.method1849(-97, 3, -122, 110, (byte) 43);
        }
        for (int var11 = var9; var11 < var9 + arg2; var11++) {
            if (var11 >= 0 && var11 < this.field4146) {
                for (int var12 = var10; var12 < (arg3 + var10); var12++) {
                    if (var12 >= 0 && var12 < this.field4154) {
                        this.method1862(var12, 25, var11, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZIZIIII)V", line = 1027)
    public final void method1855(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        field4143++;
        int var8 = arg4 - this.field4158;
        int var9 = arg6 - this.field4161;
        if (arg5 == 0) {
            if (arg3 == 0) {
                this.method1859(var8, -41, var9, 128);
                this.method1859(var8, 122, var9 - 1, 8);
            }
            if (arg3 == 1) {
                this.method1859(var8, 104, var9, 2);
                this.method1859(var8 + 1, -106, var9, 32);
            }
            if (arg3 == 2) {
                this.method1859(var8, 115, var9, 8);
                this.method1859(var8, arg1 + 112, var9 + 1, 128);
            }
            if (arg3 == 3) {
                this.method1859(var8, 117, var9, 32);
                this.method1859(var8 - 1, 125, var9, 2);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg3 == 0) {
                this.method1859(var8, -65, var9, 1);
                this.method1859(var8 + 1, arg1 ^ 0x6A, var9 - 1, 16);
            }
            if (arg3 == 1) {
                this.method1859(var8, -88, var9, 4);
                this.method1859(var8 + 1, 119, var9 + 1, 64);
            }
            if (arg3 == 2) {
                this.method1859(var8, 109, var9, 16);
                this.method1859(var8 - 1, 120, var9 + 1, 1);
            }
            if (arg3 == 3) {
                this.method1859(var8, -51, var9, 64);
                this.method1859(var8 - 1, -108, var9 + -1, 4);
            }
        }
        if (arg5 == 2) {
            if (arg3 == 0) {
                this.method1859(var8, 111, var9, 130);
                this.method1859(var8, -47, var9 - 1, 8);
                this.method1859(var8 + 1, 106, var9, 32);
            }
            if (arg3 == 1) {
                this.method1859(var8, -39, var9, 10);
                this.method1859(var8 + 1, -48, var9, 32);
                this.method1859(var8, -31, var9 + 1, 128);
            }
            if (arg3 == 2) {
                this.method1859(var8, arg1 ^ 0xFFFFFFA1, var9, 40);
                this.method1859(var8, 121, var9 + 1, 128);
                this.method1859(var8 - 1, 118, var9, 2);
            }
            if (arg3 == 3) {
                this.method1859(var8, arg1 + 124, var9, 160);
                this.method1859(var8 - 1, 124, var9, 2);
                this.method1859(var8, 122, var9 - 1, 8);
            }
        }
        if (arg0) {
            if (arg5 == 0) {
                if (arg3 == 0) {
                    this.method1859(var8, arg1 + 104, var9, 65536);
                    this.method1859(var8, 125, var9 - 1, 4096);
                }
                if (arg3 == 1) {
                    this.method1859(var8, -75, var9, 1024);
                    this.method1859(var8 + 1, 112, var9, 16384);
                }
                if (arg3 == 2) {
                    this.method1859(var8, 118, var9, 4096);
                    this.method1859(var8, 126, var9 + 1, 65536);
                }
                if (arg3 == 3) {
                    this.method1859(var8, arg1 ^ 0x7C, var9, 16384);
                    this.method1859(var8 - 1, arg1 ^ 0xFFFFFFE0, var9, 1024);
                }
            }
            if (arg5 == 1 || arg5 == 3) {
                if (arg3 == 0) {
                    this.method1859(var8, 124, var9, 512);
                    this.method1859(var8 + 1, arg1 + 127, var9 - 1, 8192);
                }
                if (arg3 == 1) {
                    this.method1859(var8, 111, var9, 2048);
                    this.method1859(var8 + 1, arg1 ^ 0xFFFFFF92, var9 + 1, 32768);
                }
                if (arg3 == 2) {
                    this.method1859(var8, -84, var9, 8192);
                    this.method1859(var8 - 1, -70, var9 + 1, 512);
                }
                if (arg3 == 3) {
                    this.method1859(var8, -111, var9, 32768);
                    this.method1859(var8 - 1, arg1 + 125, var9 - 1, 2048);
                }
            }
            if (arg5 == 2) {
                if (arg3 == 0) {
                    this.method1859(var8, arg1 ^ 0x7A, var9, 66560);
                    this.method1859(var8, -71, var9 - 1, 4096);
                    this.method1859(var8 + 1, -68, var9, 16384);
                }
                if (arg3 == 1) {
                    this.method1859(var8, 124, var9, 5120);
                    this.method1859(var8 + 1, -56, var9, 16384);
                    this.method1859(var8, -63, var9 + 1, 65536);
                }
                if (arg3 == 2) {
                    this.method1859(var8, -78, var9, 20480);
                    this.method1859(var8, -34, var9 + 1, 65536);
                    this.method1859(var8 - 1, 107, var9, 1024);
                }
                if (arg3 == 3) {
                    this.method1859(var8, 118, var9, 81920);
                    this.method1859(var8 - 1, 122, var9, 1024);
                    this.method1859(var8, 116, var9 - 1, 4096);
                }
            }
        }
        if (arg1 != 0) {
            this.method1862(112, -14, 108, 91);
        }
        if (!arg2) {
            return;
        }
        if (arg5 == 0) {
            if (arg3 == 0) {
                this.method1859(var8, arg1 ^ 0x75, var9, 536870912);
                this.method1859(var8, -28, var9 - 1, 33554432);
            }
            if (arg3 == 1) {
                this.method1859(var8, 102, var9, 8388608);
                this.method1859(var8 + 1, arg1 ^ 0x6B, var9, 134217728);
            }
            if (arg3 == 2) {
                this.method1859(var8, 107, var9, 33554432);
                this.method1859(var8, 109, var9 + 1, 536870912);
            }
            if (arg3 == 3) {
                this.method1859(var8, arg1 + 125, var9, 134217728);
                this.method1859(var8 - 1, -99, var9, 8388608);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg3 == 0) {
                this.method1859(var8, 117, var9, 4194304);
                this.method1859(var8 + 1, 119, var9 - 1, 67108864);
            }
            if (arg3 == 1) {
                this.method1859(var8, -122, var9, 16777216);
                this.method1859(var8 + 1, 103, var9 + 1, 268435456);
            }
            if (arg3 == 2) {
                this.method1859(var8, 127, var9, 67108864);
                this.method1859(var8 - 1, -124, var9 + 1, 4194304);
            }
            if (arg3 == 3) {
                this.method1859(var8, 105, var9, 268435456);
                this.method1859(var8 - 1, arg1 + 103, var9 - 1, 16777216);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method1859(var8, arg1 + 124, var9, 545259520);
            this.method1859(var8, 106, var9 - 1, 33554432);
            this.method1859(var8 + 1, -115, var9, 134217728);
        }
        if (arg3 == 1) {
            this.method1859(var8, -83, var9, 41943040);
            this.method1859(var8 + 1, -64, var9, 134217728);
            this.method1859(var8, 104, var9 + 1, 536870912);
        }
        if (arg3 == 2) {
            this.method1859(var8, 123, var9, 167772160);
            this.method1859(var8, arg1 ^ 0xFFFFFFAB, var9 + 1, 536870912);
            this.method1859(var8 - 1, 117, var9, 8388608);
        }
        if (arg3 == 3) {
            this.method1859(var8, -102, var9, 671088640);
            this.method1859(var8 - 1, arg1 + -90, var9, 8388608);
            this.method1859(var8, -77, var9 - 1, 33554432);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIIBII)Z", line = 1330)
    public final boolean method1856(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        field4155++;
        if (arg0 == 1) {
            if (arg2 == arg7 && arg1 == arg6) {
                return true;
            }
        } else if (arg2 <= arg7 && arg7 <= (arg2 + arg0 - 1) && arg1 <= arg1 && arg1 + arg0 - 1 >= arg1) {
            return true;
        }
        int var9 = arg6 - this.field4158;
        int var10 = arg7 - this.field4161;
        int var11 = arg1 - this.field4158;
        int var12 = arg2 - this.field4161;
        if (arg5 != 100) {
            return true;
        }
        if (arg0 == 1) {
            if (arg3 == 0) {
                if (arg4 == 0) {
                    if ((var10 - 1) == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && var11 + 1 == var9 && (this.field4156[var12][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var11 - 1 == var9 && (this.field4156[var12][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var10 == var12 && var11 + 1 == var9) {
                        return true;
                    }
                    if ((var10 - 1) == var12 && var9 == var11 && (this.field4156[var12][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var9 == var11 && (this.field4156[var12][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if ((var10 + 1) == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && (var11 + 1) == var9 && (this.field4156[var12][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var11 - 1) == var9 && (this.field4156[var12][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var10 == var12 && (var11 - 1) == var9) {
                        return true;
                    }
                    if (var10 - 1 == var12 && var9 == var11 && (this.field4156[var12][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var9 == var11 && (this.field4156[var12][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 2) {
                if (arg4 == 0) {
                    if (var10 - 1 == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && (var11 + 1) == var9) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var9 == var11 && (this.field4156[var12][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var11 - 1 == var9 && (this.field4156[var12][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var10 - 1 == var12 && var9 == var11 && (this.field4156[var12][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var11 + 1) == var9) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && var11 - 1 == var9 && (this.field4156[var12][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if ((var10 - 1) == var12 && var9 == var11 && (this.field4156[var12][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var11 + 1 == var9 && (this.field4156[var12][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && var11 - 1 == var9) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if ((var10 - 1) == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && var11 + 1 == var9 && (this.field4156[var12][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var9 == var11 && (this.field4156[var12][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var11 - 1 == var9) {
                        return true;
                    }
                }
            }
            if (arg3 == 9) {
                if (var10 == var12 && var11 + 1 == var9 && (this.field4156[var12][var9] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var12 && var11 - 1 == var9 && (this.field4156[var12][var9] & 0x2) == 0) {
                    return true;
                }
                if ((var10 - 1) == var12 && var9 == var11 && (this.field4156[var12][var9] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var12 && var9 == var11 && (this.field4156[var12][var9] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var12 + arg0 - 1;
            int var14 = var9 + arg0 - 1;
            if (arg3 == 0) {
                if (arg4 == 0) {
                    if ((var10 - arg0) == var12 && var11 >= var9 && var14 >= var11) {
                        return true;
                    }
                    if (var10 >= var12 && var10 <= var13 && var11 + 1 == var9 && (this.field4156[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 <= var10 && var13 >= var10 && (var11 - arg0) == var9 && (this.field4156[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var10 >= var12 && var13 >= var10 && (var11 + 1) == var9) {
                        return true;
                    }
                    if (var10 - arg0 == var12 && var9 <= var11 && var14 >= var11 && (this.field4156[var13][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var9 <= var11 && var11 <= var14 && (this.field4156[var12][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if ((var10 + 1) == var12 && var11 >= var9 && var14 >= var11) {
                        return true;
                    }
                    if (var10 >= var12 && var10 <= var13 && var11 + 1 == var9 && (this.field4156[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 >= var12 && var13 >= var10 && var11 - arg0 == var9 && (this.field4156[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var12 <= var10 && var10 <= var13 && var11 - arg0 == var9) {
                        return true;
                    }
                    if ((var10 - arg0) == var12 && var11 >= var9 && var11 <= var14 && (this.field4156[var13][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var11 >= var9 && var14 >= var11 && (this.field4156[var12][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 2) {
                if (arg4 == 0) {
                    if (var10 - arg0 == var12 && var9 <= var11 && var14 >= var11) {
                        return true;
                    }
                    if (var12 <= var10 && var13 >= var10 && var11 + 1 == var9) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var11 >= var9 && var11 <= var14 && (this.field4156[var12][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 >= var12 && var13 >= var10 && (var11 - arg0) == var9 && (this.field4156[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if ((var10 - arg0) == var12 && var9 <= var11 && var14 >= var11 && (this.field4156[var13][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 >= var12 && var10 <= var13 && (var11 + 1) == var9) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var11 >= var9 && var11 <= var14) {
                        return true;
                    }
                    if (var12 <= var10 && var10 <= var13 && (var11 - arg0) == var9 && (this.field4156[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if (var10 - arg0 == var12 && var11 >= var9 && var11 <= var14 && (this.field4156[var13][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 <= var10 && var10 <= var13 && (var11 + 1) == var9 && (this.field4156[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var9 <= var11 && var11 <= var14) {
                        return true;
                    }
                    if (var12 <= var10 && var13 >= var10 && var11 - arg0 == var9) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if ((var10 - arg0) == var12 && var11 >= var9 && var11 <= var14) {
                        return true;
                    }
                    if (var10 >= var12 && var10 <= var13 && (var11 + 1) == var9 && (this.field4156[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var11 >= var9 && var11 <= var14 && (this.field4156[var12][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var12 <= var10 && var13 >= var10 && (var11 - arg0) == var9) {
                        return true;
                    }
                }
            }
            if (arg3 == 9) {
                if (var12 <= var10 && var10 <= var13 && (var11 + 1) == var9 && (this.field4156[var10][var9] & 0x2C0120) == 0) {
                    return true;
                }
                if (var12 <= var10 && var10 <= var13 && var11 - arg0 == var9 && (this.field4156[var10][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if (var10 - arg0 == var12 && var11 >= var9 && var14 >= var11 && (this.field4156[var13][var11] & 0x2C0108) == 0) {
                    return true;
                }
                if ((var10 + 1) == var12 && var11 >= var9 && var11 <= var14 && (this.field4156[var12][var11] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIB)V", line = 1697)
    public final void method1857(int arg0, int arg1, byte arg2) {
        field4151++;
        int var4 = arg1 - this.field4158;
        int var5 = arg0 - this.field4161;
        this.field4156[var5][var4] = class77.method492(this.field4156[var5][var4], 2097152);
        if (arg2 != -14) {
            this.field4156 = (int[][]) ((int[][]) null);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(III)V", line = 1725)
    public final void method1858(int arg0, int arg1, int arg2) {
        field4152++;
        int var4 = arg0 - this.field4161;
        int var5 = arg2 - this.field4158;
        this.field4156[var4][var5] = class261.method1840(this.field4156[var4][var5], -262145);
        if (arg1 >= -47) {
            this.method1848(12, (byte) -123, -110);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIII)V", line = 1739)
    private final void method1859(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 85 / ((39 - arg1) / 63);
        this.field4156[arg2][arg0] = class261.method1840(this.field4156[arg2][arg0], ~arg3);
        field4153++;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Z)V", line = 1760)
    public static final void method1860(boolean arg0) {
        int var1 = class357.field5669;
        if (!arg0) {
            return;
        }
        field4163++;
        int var2 = class151.field2399;
        byte var3 = 20;
        int var4 = class251.field3977 - 3;
        int var5 = class257.field4073;
        if (class201.field3051 == null || class315.field4948 == null) {
            if (class65.field786.method125(class140.field2095, 123) && class65.field786.method125(class261.field4138, -99)) {
                class201.field3051 = class25.method182(class140.field2095, class65.field786, 0, -58);
                class315.field4948 = class25.method182(class261.field4138, class65.field786, 0, -82);
                if (class272.field4317) {
                    if ((class201.field3051 instanceof class155)) {
                        class201.field3051 = new class157((class158) class201.field3051);
                    } else {
                        class201.field3051 = new class200((class158) class201.field3051);
                    }
                    if ((class315.field4948 instanceof class155)) {
                        class315.field4948 = new class157((class158) class315.field4948);
                    } else {
                        class315.field4948 = new class200((class158) class315.field4948);
                    }
                }
            } else if (class272.field4317) {
                class239.method1652(var1, var2, var5, var3, class192.field2883, 256 - class93.field1273);
            } else {
                class343.method2364(var1, var2, var5, var3, class192.field2883, 256 - class93.field1273);
            }
        }
        if (class201.field3051 != null && class315.field4948 != null) {
            int var6 = (var5 - (class315.field4948.field13 * 2)) / class201.field3051.field13;
            for (int var7 = 0; var7 < var6; var7++) {
                class201.field3051.method11(class201.field3051.field13 * var7 + class315.field4948.field13 + var1, var2);
            }
            class315.field4948.method11(var1, var2);
            class315.field4948.method18(var1 + var5 - class315.field4948.field13, var2);
        }
        class93.field1233.method1685(class110.field1513, var1 + 3, var2 - -14, class267.field4202, -1);
        if (class272.field4317) {
            class239.method1652(var1, var2 + var3, var5, var4 - var3, class192.field2883, 256 - class93.field1273);
        } else {
            class343.method2364(var1, var2 + var3, var5, var4 - var3, class192.field2883, 256 - class93.field1273);
        }
        int var8 = class128.field1873;
        int var9 = class197.field3009;
        for (int var10 = 0; var10 < class74.field924; var10++) {
            int var11 = var2 + var3 + ((class74.field924 - var10 + -1) * 15) + 13;
            if (var1 < var9 && var9 < (var1 + var5) && var8 > (var11 - 13) && var8 < var11 + 3) {
                if (class272.field4317) {
                    class239.method1652(var1, var11 - 12, var5, 15, class35.field394, 256 - class135.field2024);
                } else {
                    class343.method2364(var1, var11 - 12, var5, 15, class35.field394, 256 - class135.field2024);
                }
            }
        }
        if ((class180.field2702 == null || class302.field4709 == null || class120.field1666 == null) && class65.field786.method125(class138.field2062, -122) && class65.field786.method125(class356.field5654, -100) && class65.field786.method125(class355.field5652, -45)) {
            class180.field2702 = class25.method182(class138.field2062, class65.field786, 0, -43);
            class302.field4709 = class25.method182(class356.field5654, class65.field786, 0, -110);
            class120.field1666 = class25.method182(class355.field5652, class65.field786, 0, -78);
            if (class272.field4317) {
                if (class180.field2702 instanceof class155) {
                    class180.field2702 = new class157((class158) class180.field2702);
                } else {
                    class180.field2702 = new class200((class158) class180.field2702);
                }
                if ((class302.field4709 instanceof class155)) {
                    class302.field4709 = new class157((class158) class302.field4709);
                } else {
                    class302.field4709 = new class200((class158) class302.field4709);
                }
                if ((class120.field1666 instanceof class155)) {
                    class120.field1666 = new class157((class158) class120.field1666);
                } else {
                    class120.field1666 = new class200((class158) class120.field1666);
                }
            }
        }
        if (class180.field2702 != null && class302.field4709 != null && class120.field1666 != null) {
            int var12 = (var5 - (class120.field1666.field13 * 2)) / class180.field2702.field13;
            for (int var13 = 0; var13 < var12; var13++) {
                class180.field2702.method11(class180.field2702.field13 * var13 + class120.field1666.field13 + var1, var2 + var4 + -class180.field2702.field24);
            }
            int var14 = (var4 - var3 - class120.field1666.field24) / class302.field4709.field24;
            for (int var15 = 0; var15 < var14; var15++) {
                class302.field4709.method11(var1, class302.field4709.field24 * var15 + var2 + var3);
                class302.field4709.method18(var1 - (class302.field4709.field13 - var5), class302.field4709.field24 * var15 + var2 + var3);
            }
            class120.field1666.method11(var1, var2 + var4 - class120.field1666.field24);
            class120.field1666.method18(var1 + var5 - class120.field1666.field13, var2 - class120.field1666.field24 + var4);
        }
        for (int var16 = 0; var16 < class74.field924; var16++) {
            int var17 = (class74.field924 - var16 - 1) * 15 + var2 + var3 + 13;
            int var18 = class267.field4202;
            if (var9 > var1 && var9 < var1 + var5 && var8 > var17 - 13 && var8 < var17 + 3) {
                var18 = class57.field680;
            }
            class93.field1233.method1685(class2.method14(var16, true), var1 + 3, var17, var18, 0);
        }
        class356.method2455(class151.field2399, class257.field4073, 66, class357.field5669, class251.field3977);
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(I)V", line = 1937)
    public static final void method1861(int arg0) {
        field4139++;
        if (class293.field4625) {
            return;
        }
        if (class222.field3355) {
            class103.field1423 = (float) ((int) class103.field1423 - 17 & 0xFFFFFFF0);
        } else {
            class203.field3089 += (-class203.field3089 - 12.0F) / 2.0F;
        }
        class234.field3560 = true;
        class293.field4625 = true;
        if (arg0 != 1) {
            method1861(100);
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(IIII)V", line = 1961)
    private final void method1862(int arg0, int arg1, int arg2, int arg3) {
        this.field4156[arg2][arg0] = class77.method492(this.field4156[arg2][arg0], arg3);
        if (arg1 < 15) {
            method1861(112);
        }
        field4147++;
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(II)V", line = 1971)
    public class262(int arg0, int arg1) {
        this.field4154 = arg1;
        this.field4161 = 0;
        this.field4146 = arg0;
        this.field4156 = new int[this.field4146][this.field4154];
        this.method1851(15850);
    }
}
