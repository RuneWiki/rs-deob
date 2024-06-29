import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class145 {

    @OriginalMember(owner = "client!ld", name = "s", descriptor = "I")
    public static int field2248 = -1;

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "F")
    public static float field2242;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
    public static int field2234;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!ld", name = "l", descriptor = "I")
    public int field2241;

    @OriginalMember(owner = "client!ld", name = "n", descriptor = "I")
    public int field2243;

    @OriginalMember(owner = "client!ld", name = "o", descriptor = "I")
    public int field2244;

    @OriginalMember(owner = "client!ld", name = "p", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!ld", name = "q", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!ld", name = "r", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!ld", name = "t", descriptor = "I")
    public static int field2249;

    @OriginalMember(owner = "client!ld", name = "u", descriptor = "I")
    public static int field2250;

    @OriginalMember(owner = "client!ld", name = "v", descriptor = "I")
    public int field2251;

    @OriginalMember(owner = "client!ld", name = "w", descriptor = "I")
    public static int field2252;

    @OriginalMember(owner = "client!ld", name = "x", descriptor = "[[I")
    public int[][] field2253;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZZIIIII)V")
    public final void method954(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2249++;
        int var8 = 256;
        int var9 = 16 / ((51 - arg6) / 43);
        if (arg0) {
            var8 |= 0x20000;
        }
        if (arg1) {
            var8 |= 0x40000000;
        }
        int var10 = arg5 - this.field2243;
        int var11 = arg2 - this.field2244;
        for (int var12 = var10; var12 < (arg4 + var10); var12++) {
            if (var12 >= 0 && var12 < this.field2251) {
                for (int var13 = var11; var13 < (arg3 + var11); var13++) {
                    if (var13 >= 0 && var13 < this.field2241) {
                        this.method956(var12, 0, var13, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZZIIIZII)V")
    public final void method955(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field2238++;
        int var9 = 256;
        if (arg1) {
            this.field2244 = 20;
        }
        if (arg0) {
            var9 |= 0x20000;
        }
        if (arg5) {
            var9 |= 0x40000000;
        }
        if (arg2 == 1 || arg2 == 3) {
            int var10 = arg4;
            arg4 = arg7;
            arg7 = var10;
        }
        int var11 = arg3 - this.field2243;
        int var12 = arg6 - this.field2244;
        for (int var13 = var11; var13 < arg4 + var11; var13++) {
            if (var13 >= 0 && var13 < this.field2251) {
                for (int var14 = var12; var14 < (arg7 + var12); var14++) {
                    if (var14 >= 0 && this.field2241 > var14) {
                        this.method961(var13, var14, var9, -17647);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIII)V")
    private final void method956(int arg0, int arg1, int arg2, int arg3) {
        this.field2253[arg0][arg2] = class73.method578(this.field2253[arg0][arg2], arg3);
        field2232++;
        if (arg1 != 0) {
            field2242 = -0.5610039F;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIIZIII)Z")
    public final boolean method957(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        field2233++;
        if (arg7 == 1) {
            if (arg1 == arg2 && arg0 == arg6) {
                return true;
            }
        } else if (arg2 <= arg1 && arg1 <= (arg2 - (1 - arg7)) && arg0 <= arg0 && (arg0 + arg7 - 1) >= arg0) {
            return true;
        }
        int var9 = arg0 - this.field2244;
        int var10 = arg1 - this.field2243;
        int var11 = arg2 - this.field2243;
        if (arg4) {
            return false;
        }
        int var12 = arg6 - this.field2244;
        if (arg7 == 1) {
            if (arg5 == 0) {
                if (arg3 == 0) {
                    if (var10 - 1 == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var9 + 1 == var12 && (this.field2253[var11][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var9 - 1) == var12 && (this.field2253[var11][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var10 == var11 && (var9 + 1) == var12) {
                        return true;
                    }
                    if ((var10 - 1) == var11 && var9 == var12 && (this.field2253[var11][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 == var12 && (this.field2253[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var10 + 1 == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var9 + 1) == var12 && (this.field2253[var11][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var9 - 1 == var12 && (this.field2253[var11][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var10 == var11 && var9 - 1 == var12) {
                        return true;
                    }
                    if ((var10 - 1) == var11 && var9 == var12 && (this.field2253[var11][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 == var12 && (this.field2253[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 2) {
                if (arg3 == 0) {
                    if ((var10 - 1) == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var9 + 1 == var12) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 == var12 && (this.field2253[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var9 - 1) == var12 && (this.field2253[var11][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var10 - 1 == var11 && var9 == var12 && (this.field2253[var11][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var9 + 1 == var12) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var9 - 1) == var12 && (this.field2253[var11][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if ((var10 - 1) == var11 && var9 == var12 && (this.field2253[var11][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var9 + 1 == var12 && (this.field2253[var11][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var9 - 1 == var12) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var10 - 1 == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var9 + 1) == var12 && (this.field2253[var11][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 == var12 && (this.field2253[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var9 - 1 == var12) {
                        return true;
                    }
                }
            }
            if (arg5 == 9) {
                if (var10 == var11 && (var9 + 1) == var12 && (this.field2253[var11][var12] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var11 && (var9 - 1) == var12 && (this.field2253[var11][var12] & 0x2) == 0) {
                    return true;
                }
                if ((var10 - 1) == var11 && var9 == var12 && (this.field2253[var11][var12] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var11 && var9 == var12 && (this.field2253[var11][var12] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg7 + var11 - 1;
            int var14 = var12 - (1 - arg7);
            if (arg5 == 0) {
                if (arg3 == 0) {
                    if ((var10 - arg7) == var11 && var9 >= var12 && var14 >= var9) {
                        return true;
                    }
                    if (var10 >= var11 && var10 <= var13 && (var9 + 1) == var12 && (this.field2253[var10][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var10 <= var13 && (var9 - arg7) == var12 && (this.field2253[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var10 >= var11 && var10 <= var13 && (var9 + 1) == var12) {
                        return true;
                    }
                    if (var10 - arg7 == var11 && var12 <= var9 && var14 >= var9 && (this.field2253[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 >= var12 && var14 >= var9 && (this.field2253[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if ((var10 + 1) == var11 && var12 <= var9 && var14 >= var9) {
                        return true;
                    }
                    if (var11 <= var10 && var13 >= var10 && var9 + 1 == var12 && (this.field2253[var10][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var10 <= var13 && var9 - arg7 == var12 && (this.field2253[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var10 >= var11 && var10 <= var13 && (var9 - arg7) == var12) {
                        return true;
                    }
                    if (var10 - arg7 == var11 && var12 <= var9 && var9 <= var14 && (this.field2253[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 >= var12 && var9 <= var14 && (this.field2253[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 2) {
                if (arg3 == 0) {
                    if ((var10 - arg7) == var11 && var12 <= var9 && var9 <= var14) {
                        return true;
                    }
                    if (var10 >= var11 && var13 >= var10 && (var9 + 1) == var12) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var12 <= var9 && var9 <= var14 && (this.field2253[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var10 <= var13 && var9 - arg7 == var12 && (this.field2253[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if ((var10 - arg7) == var11 && var12 <= var9 && var9 <= var14 && (this.field2253[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var13 >= var10 && var9 + 1 == var12) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 >= var12 && var14 >= var9) {
                        return true;
                    }
                    if (var11 <= var10 && var13 >= var10 && var9 - arg7 == var12 && (this.field2253[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var10 - arg7 == var11 && var9 >= var12 && var14 >= var9 && (this.field2253[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var13 >= var10 && var9 + 1 == var12 && (this.field2253[var10][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var12 <= var9 && var9 <= var14) {
                        return true;
                    }
                    if (var11 <= var10 && var13 >= var10 && var9 - arg7 == var12) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if ((var10 - arg7) == var11 && var12 <= var9 && var9 <= var14) {
                        return true;
                    }
                    if (var10 >= var11 && var10 <= var13 && (var9 + 1) == var12 && (this.field2253[var10][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 >= var12 && var9 <= var14 && (this.field2253[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var13 >= var10 && var9 - arg7 == var12) {
                        return true;
                    }
                }
            }
            if (arg5 == 9) {
                if (var10 >= var11 && var10 <= var13 && (var9 + 1) == var12 && (this.field2253[var10][var12] & 0x2C0120) == 0) {
                    return true;
                }
                if (var11 <= var10 && var13 >= var10 && (var9 - arg7) == var12 && (this.field2253[var10][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if (var10 - arg7 == var11 && var12 <= var9 && var9 <= var14 && (this.field2253[var13][var9] & 0x2C0108) == 0) {
                    return true;
                }
                if (var10 + 1 == var11 && var9 >= var12 && var14 >= var9 && (this.field2253[var11][var9] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IZI)Z")
    public static final boolean method958(int arg0, boolean arg1, int arg2) {
        field2239++;
        if (arg1) {
            return (arg2 & 0x100) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(III)V")
    public final void method959(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field2243;
        int var5 = arg2 - this.field2244;
        field2250++;
        this.field2253[var4][var5] = class73.method578(this.field2253[var4][var5], arg1);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IZZZIII)V")
    public final void method960(int arg0, boolean arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6) {
        int var8 = arg0 - this.field2244;
        int var9 = arg5 - this.field2243;
        field2230++;
        if (arg2) {
            this.method956(-68, -35, -113, 80);
        }
        if (arg6 == 0) {
            if (arg4 == 0) {
                this.method956(var9, 0, var8, 128);
                this.method956(var9 - 1, 0, var8, 8);
            }
            if (arg4 == 1) {
                this.method956(var9, 0, var8, 2);
                this.method956(var9, 0, var8 + 1, 32);
            }
            if (arg4 == 2) {
                this.method956(var9, 0, var8, 8);
                this.method956(var9 + 1, 0, var8, 128);
            }
            if (arg4 == 3) {
                this.method956(var9, 0, var8, 32);
                this.method956(var9, 0, var8 - 1, 2);
            }
        }
        if (arg6 == 1 || arg6 == 3) {
            if (arg4 == 0) {
                this.method956(var9, 0, var8, 1);
                this.method956(var9 - 1, 0, var8 + 1, 16);
            }
            if (arg4 == 1) {
                this.method956(var9, 0, var8, 4);
                this.method956(var9 + 1, 0, var8 + 1, 64);
            }
            if (arg4 == 2) {
                this.method956(var9, 0, var8, 16);
                this.method956(var9 + 1, 0, var8 - 1, 1);
            }
            if (arg4 == 3) {
                this.method956(var9, 0, var8, 64);
                this.method956(var9 - 1, 0, var8 - 1, 4);
            }
        }
        if (arg6 == 2) {
            if (arg4 == 0) {
                this.method956(var9, 0, var8, 130);
                this.method956(var9 - 1, 0, var8, 8);
                this.method956(var9, 0, var8 + 1, 32);
            }
            if (arg4 == 1) {
                this.method956(var9, 0, var8, 10);
                this.method956(var9, 0, var8 + 1, 32);
                this.method956(var9 + 1, 0, var8, 128);
            }
            if (arg4 == 2) {
                this.method956(var9, 0, var8, 40);
                this.method956(var9 + 1, 0, var8, 128);
                this.method956(var9, 0, var8 - 1, 2);
            }
            if (arg4 == 3) {
                this.method956(var9, 0, var8, 160);
                this.method956(var9, 0, var8 - 1, 2);
                this.method956(var9 - 1, 0, var8, 8);
            }
        }
        if (arg1) {
            if (arg6 == 0) {
                if (arg4 == 0) {
                    this.method956(var9, 0, var8, 65536);
                    this.method956(var9 - 1, 0, var8, 4096);
                }
                if (arg4 == 1) {
                    this.method956(var9, 0, var8, 1024);
                    this.method956(var9, 0, var8 + 1, 16384);
                }
                if (arg4 == 2) {
                    this.method956(var9, 0, var8, 4096);
                    this.method956(var9 + 1, 0, var8, 65536);
                }
                if (arg4 == 3) {
                    this.method956(var9, 0, var8, 16384);
                    this.method956(var9, 0, var8 - 1, 1024);
                }
            }
            if (arg6 == 1 || arg6 == 3) {
                if (arg4 == 0) {
                    this.method956(var9, 0, var8, 512);
                    this.method956(var9 - 1, 0, var8 + 1, 8192);
                }
                if (arg4 == 1) {
                    this.method956(var9, 0, var8, 2048);
                    this.method956(var9 + 1, 0, var8 + 1, 32768);
                }
                if (arg4 == 2) {
                    this.method956(var9, 0, var8, 8192);
                    this.method956(var9 + 1, 0, var8 - 1, 512);
                }
                if (arg4 == 3) {
                    this.method956(var9, 0, var8, 32768);
                    this.method956(var9 - 1, 0, var8 - 1, 2048);
                }
            }
            if (arg6 == 2) {
                if (arg4 == 0) {
                    this.method956(var9, 0, var8, 66560);
                    this.method956(var9 - 1, 0, var8, 4096);
                    this.method956(var9, 0, var8 + 1, 16384);
                }
                if (arg4 == 1) {
                    this.method956(var9, 0, var8, 5120);
                    this.method956(var9, 0, var8 + 1, 16384);
                    this.method956(var9 + 1, 0, var8, 65536);
                }
                if (arg4 == 2) {
                    this.method956(var9, 0, var8, 20480);
                    this.method956(var9 + 1, 0, var8, 65536);
                    this.method956(var9, 0, var8 - 1, 1024);
                }
                if (arg4 == 3) {
                    this.method956(var9, 0, var8, 81920);
                    this.method956(var9, 0, var8 - 1, 1024);
                    this.method956(var9 - 1, 0, var8, 4096);
                }
            }
        }
        if (!arg3) {
            return;
        }
        if (arg6 == 0) {
            if (arg4 == 0) {
                this.method956(var9, 0, var8, 536870912);
                this.method956(var9 - 1, 0, var8, 33554432);
            }
            if (arg4 == 1) {
                this.method956(var9, 0, var8, 8388608);
                this.method956(var9, 0, var8 + 1, 134217728);
            }
            if (arg4 == 2) {
                this.method956(var9, 0, var8, 33554432);
                this.method956(var9 + 1, 0, var8, 536870912);
            }
            if (arg4 == 3) {
                this.method956(var9, 0, var8, 134217728);
                this.method956(var9, 0, var8 - 1, 8388608);
            }
        }
        if (arg6 == 1 || arg6 == 3) {
            if (arg4 == 0) {
                this.method956(var9, 0, var8, 4194304);
                this.method956(var9 - 1, 0, var8 + 1, 67108864);
            }
            if (arg4 == 1) {
                this.method956(var9, 0, var8, 16777216);
                this.method956(var9 + 1, 0, var8 + 1, 268435456);
            }
            if (arg4 == 2) {
                this.method956(var9, 0, var8, 67108864);
                this.method956(var9 + 1, 0, var8 - 1, 4194304);
            }
            if (arg4 == 3) {
                this.method956(var9, 0, var8, 268435456);
                this.method956(var9 - 1, 0, var8 - 1, 16777216);
            }
        }
        if (arg6 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method956(var9, 0, var8, 545259520);
            this.method956(var9 - 1, 0, var8, 33554432);
            this.method956(var9, 0, var8 + 1, 134217728);
        }
        if (arg4 == 1) {
            this.method956(var9, 0, var8, 41943040);
            this.method956(var9, 0, var8 + 1, 134217728);
            this.method956(var9 + 1, 0, var8, 536870912);
        }
        if (arg4 == 2) {
            this.method956(var9, 0, var8, 167772160);
            this.method956(var9 + 1, 0, var8, 536870912);
            this.method956(var9, 0, var8 - 1, 8388608);
        }
        if (arg4 == 3) {
            this.method956(var9, 0, var8, 671088640);
            this.method956(var9, 0, var8 - 1, 8388608);
            this.method956(var9 - 1, 0, var8, 33554432);
            return;
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(IIII)V")
    private final void method961(int arg0, int arg1, int arg2, int arg3) {
        field2234++;
        if (arg3 == -17647) {
            this.field2253[arg0][arg1] = class589.method3454(this.field2253[arg0][arg1], ~arg2);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
    public final void method962(int arg0) {
        field2245++;
        int var2 = 31 / ((-arg0 - 33) / 36);
        for (int var3 = 0; var3 < this.field2251; var3++) {
            for (int var4 = 0; var4 < this.field2241; var4++) {
                if (var3 == 0 || var4 == 0 || var3 >= (this.field2251 - 5) || var4 >= this.field2241 - 5) {
                    this.field2253[var3][var4] = -1;
                } else {
                    this.field2253[var3][var4] = 2097152;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method963(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2236++;
        if (arg4 == 1) {
            if (arg6 == arg7 && arg1 == arg3) {
                return true;
            }
        } else if (arg6 <= arg7 && (arg4 + arg6 - 1) >= arg7 && arg3 >= arg3 && arg3 <= (arg3 + arg4 - 1)) {
            return true;
        }
        int var9 = arg6 - this.field2243;
        int var10 = arg1 - this.field2244;
        if (arg0 != 671744) {
            this.method955(true, true, -45, 90, -57, true, 16, -11);
        }
        int var11 = arg7 - this.field2243;
        int var12 = arg3 - this.field2244;
        if (arg4 == 1) {
            if (arg2 == 6 || arg2 == 7) {
                if (arg2 == 7) {
                    arg5 = arg5 + 2 & 0x3;
                }
                if (arg5 == 0) {
                    if (var11 + 1 == var9 && var10 == var12 && (this.field2253[var9][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var12 - 1 == var10 && (this.field2253[var9][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var11 - 1 == var9 && var10 == var12 && (this.field2253[var9][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var12 - 1 == var10 && (this.field2253[var9][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if (var11 - 1 == var9 && var10 == var12 && (this.field2253[var9][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 + 1) == var10 && (this.field2253[var9][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var11 + 1 == var9 && var10 == var12 && (this.field2253[var9][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 + 1) == var10 && (this.field2253[var9][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 8) {
                if (var9 == var11 && (var12 + 1) == var10 && (this.field2253[var9][var10] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var11 && (var12 - 1) == var10 && (this.field2253[var9][var10] & 0x2) == 0) {
                    return true;
                }
                if (var11 - 1 == var9 && var10 == var12 && (this.field2253[var9][var10] & 0x8) == 0) {
                    return true;
                }
                if ((var11 + 1) == var9 && var10 == var12 && (this.field2253[var9][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var9 + arg4 - 1;
            int var14 = arg4 + var10 - 1;
            if (arg2 == 6 || arg2 == 7) {
                if (arg2 == 7) {
                    arg5 = arg5 + 2 & 0x3;
                }
                if (arg5 == 0) {
                    if ((var11 + 1) == var9 && var10 <= var12 && var14 >= var12 && (this.field2253[var9][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var13 >= var11 && (var12 - arg4) == var10 && (this.field2253[var11][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var11 - arg4 == var9 && var12 >= var10 && var14 >= var12 && (this.field2253[var13][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var13 >= var11 && var12 - arg4 == var10 && (this.field2253[var11][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if ((var11 - arg4) == var9 && var10 <= var12 && var14 >= var12 && (this.field2253[var13][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var13 >= var11 && var12 + 1 == var10 && (this.field2253[var11][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var11 + 1 == var9 && var10 <= var12 && var12 <= var14 && (this.field2253[var9][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var13 >= var11 && (var12 + 1) == var10 && (this.field2253[var11][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 8) {
                if (var11 >= var9 && var11 <= var13 && var12 + 1 == var10 && (this.field2253[var11][var10] & 0x20) == 0) {
                    return true;
                }
                if (var9 <= var11 && var11 <= var13 && (var12 - arg4) == var10 && (this.field2253[var11][var14] & 0x2) == 0) {
                    return true;
                }
                if ((var11 - arg4) == var9 && var10 <= var12 && var14 >= var12 && (this.field2253[var13][var12] & 0x8) == 0) {
                    return true;
                }
                if ((var11 + 1) == var9 && var10 <= var12 && var12 <= var14 && (this.field2253[var9][var12] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(III)V")
    public final void method964(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field2244;
        field2237++;
        int var5 = arg2 - this.field2243;
        this.field2253[var5][var4] = class589.method3454(this.field2253[var5][var4], arg0);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIBIIIII)Z")
    public final boolean method965(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2231++;
        if (arg5 > 1) {
            return class120.method839(arg1, arg4, (byte) -12, arg8, arg5, arg2, arg6, arg5, arg0) ? true : this.method969(arg5, arg7, (byte) 111, arg2, arg1, arg8, arg5, arg0, arg4, arg6);
        }
        int var10 = arg2 + arg4 - 1;
        int var11 = arg0 + arg6 - 1;
        if (arg1 >= arg2 && var10 >= arg1 && arg8 >= arg0 && var11 >= arg8) {
            return true;
        } else if (arg2 - 1 == arg1 && arg0 <= arg8 && var11 >= arg8 && (this.field2253[arg1 - this.field2243][arg8 - this.field2244] & 0x8) == 0 && (arg7 & 0x8) == 0) {
            return true;
        } else if ((var10 + 1) == arg1 && arg0 <= arg8 && var11 >= arg8 && (this.field2253[arg1 - this.field2243][arg8 - this.field2244] & 0x80) == 0 && (arg7 & 0x2) == 0) {
            return true;
        } else if ((arg0 - 1) == arg8 && arg2 <= arg1 && var10 >= arg1 && (this.field2253[arg1 - this.field2243][arg8 - this.field2244] & 0x2) == 0 && (arg7 & 0x4) == 0) {
            return true;
        } else {
            if (arg3 <= 29) {
                this.method966(false, true, 10, 33, -35, 115, false);
            }
            return var11 + 1 == arg8 && arg2 <= arg1 && arg1 <= var10 && (this.field2253[arg1 - this.field2243][arg8 - this.field2244] & 0x20) == 0 && (arg7 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZZIIIIZ)V")
    public final void method966(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (!arg6) {
            this.field2253 = null;
        }
        int var8 = arg5 - this.field2243;
        field2247++;
        int var9 = arg2 - this.field2244;
        if (arg4 == 0) {
            if (arg3 == 0) {
                this.method961(var8, var9, 128, -17647);
                this.method961(var8 - 1, var9, 8, -17647);
            }
            if (arg3 == 1) {
                this.method961(var8, var9, 2, -17647);
                this.method961(var8, var9 + 1, 32, -17647);
            }
            if (arg3 == 2) {
                this.method961(var8, var9, 8, -17647);
                this.method961(var8 + 1, var9, 128, -17647);
            }
            if (arg3 == 3) {
                this.method961(var8, var9, 32, -17647);
                this.method961(var8, var9 - 1, 2, -17647);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg3 == 0) {
                this.method961(var8, var9, 1, -17647);
                this.method961(var8 - 1, var9 - -1, 16, -17647);
            }
            if (arg3 == 1) {
                this.method961(var8, var9, 4, -17647);
                this.method961(var8 + 1, var9 + 1, 64, -17647);
            }
            if (arg3 == 2) {
                this.method961(var8, var9, 16, -17647);
                this.method961(var8 + 1, var9 - 1, 1, -17647);
            }
            if (arg3 == 3) {
                this.method961(var8, var9, 64, -17647);
                this.method961(var8 - 1, var9 - 1, 4, -17647);
            }
        }
        if (arg4 == 2) {
            if (arg3 == 0) {
                this.method961(var8, var9, 130, -17647);
                this.method961(var8 - 1, var9, 8, -17647);
                this.method961(var8, var9 + 1, 32, -17647);
            }
            if (arg3 == 1) {
                this.method961(var8, var9, 10, -17647);
                this.method961(var8, var9 + 1, 32, -17647);
                this.method961(var8 + 1, var9, 128, -17647);
            }
            if (arg3 == 2) {
                this.method961(var8, var9, 40, -17647);
                this.method961(var8 + 1, var9, 128, -17647);
                this.method961(var8, var9 - 1, 2, -17647);
            }
            if (arg3 == 3) {
                this.method961(var8, var9, 160, -17647);
                this.method961(var8, var9 - 1, 2, -17647);
                this.method961(var8 - 1, var9, 8, -17647);
            }
        }
        if (arg1) {
            if (arg4 == 0) {
                if (arg3 == 0) {
                    this.method961(var8, var9, 65536, -17647);
                    this.method961(var8 - 1, var9, 4096, -17647);
                }
                if (arg3 == 1) {
                    this.method961(var8, var9, 1024, -17647);
                    this.method961(var8, var9 + 1, 16384, -17647);
                }
                if (arg3 == 2) {
                    this.method961(var8, var9, 4096, -17647);
                    this.method961(var8 + 1, var9, 65536, -17647);
                }
                if (arg3 == 3) {
                    this.method961(var8, var9, 16384, -17647);
                    this.method961(var8, var9 - 1, 1024, -17647);
                }
            }
            if (arg4 == 1 || arg4 == 3) {
                if (arg3 == 0) {
                    this.method961(var8, var9, 512, -17647);
                    this.method961(var8 - 1, var9 + 1, 8192, -17647);
                }
                if (arg3 == 1) {
                    this.method961(var8, var9, 2048, -17647);
                    this.method961(var8 + 1, var9 + 1, 32768, -17647);
                }
                if (arg3 == 2) {
                    this.method961(var8, var9, 8192, -17647);
                    this.method961(var8 + 1, var9 - 1, 512, -17647);
                }
                if (arg3 == 3) {
                    this.method961(var8, var9, 32768, -17647);
                    this.method961(var8 - 1, var9 + -1, 2048, -17647);
                }
            }
            if (arg4 == 2) {
                if (arg3 == 0) {
                    this.method961(var8, var9, 66560, -17647);
                    this.method961(var8 - 1, var9, 4096, -17647);
                    this.method961(var8, var9 + 1, 16384, -17647);
                }
                if (arg3 == 1) {
                    this.method961(var8, var9, 5120, -17647);
                    this.method961(var8, var9 + 1, 16384, -17647);
                    this.method961(var8 + 1, var9, 65536, -17647);
                }
                if (arg3 == 2) {
                    this.method961(var8, var9, 20480, -17647);
                    this.method961(var8 + 1, var9, 65536, -17647);
                    this.method961(var8, var9 - 1, 1024, -17647);
                }
                if (arg3 == 3) {
                    this.method961(var8, var9, 81920, -17647);
                    this.method961(var8, var9 - 1, 1024, -17647);
                    this.method961(var8 - 1, var9, 4096, -17647);
                }
            }
        }
        if (!arg0) {
            return;
        }
        if (arg4 == 0) {
            if (arg3 == 0) {
                this.method961(var8, var9, 536870912, -17647);
                this.method961(var8 - 1, var9, 33554432, -17647);
            }
            if (arg3 == 1) {
                this.method961(var8, var9, 8388608, -17647);
                this.method961(var8, var9 + 1, 134217728, -17647);
            }
            if (arg3 == 2) {
                this.method961(var8, var9, 33554432, -17647);
                this.method961(var8 + 1, var9, 536870912, -17647);
            }
            if (arg3 == 3) {
                this.method961(var8, var9, 134217728, -17647);
                this.method961(var8, var9 - 1, 8388608, -17647);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg3 == 0) {
                this.method961(var8, var9, 4194304, -17647);
                this.method961(var8 - 1, var9 + 1, 67108864, -17647);
            }
            if (arg3 == 1) {
                this.method961(var8, var9, 16777216, -17647);
                this.method961(var8 + 1, var9 - -1, 268435456, -17647);
            }
            if (arg3 == 2) {
                this.method961(var8, var9, 67108864, -17647);
                this.method961(var8 + 1, var9 + -1, 4194304, -17647);
            }
            if (arg3 == 3) {
                this.method961(var8, var9, 268435456, -17647);
                this.method961(var8 - 1, var9 + -1, 16777216, -17647);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method961(var8, var9, 545259520, -17647);
            this.method961(var8 - 1, var9, 33554432, -17647);
            this.method961(var8, var9 + 1, 134217728, -17647);
        }
        if (arg3 == 1) {
            this.method961(var8, var9, 41943040, -17647);
            this.method961(var8, var9 + 1, 134217728, -17647);
            this.method961(var8 + 1, var9, 536870912, -17647);
        }
        if (arg3 == 2) {
            this.method961(var8, var9, 167772160, -17647);
            this.method961(var8 + 1, var9, 536870912, -17647);
            this.method961(var8, var9 - 1, 8388608, -17647);
        }
        if (arg3 == 3) {
            this.method961(var8, var9, 671088640, -17647);
            this.method961(var8, var9 - 1, 8388608, -17647);
            this.method961(var8 - 1, var9, 33554432, -17647);
            return;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public static final void method967(String arg0, int arg1, int arg2) {
        int var3 = -87 % ((-arg1 - 72) / 47);
        class351.method2108(class366.field4985, -10511);
        field2235++;
        class508.field7098++;
        class479.field6754.method108((byte) -128, class452.method2655(118, arg0) + 1);
        class479.field6754.method72(-1875, arg2);
        class479.field6754.method74(arg0, 0);
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(III)V")
    public final void method968(int arg0, int arg1, int arg2) {
        if (arg1 == 2) {
            int var4 = arg0 - this.field2244;
            int var5 = arg2 - this.field2243;
            field2240++;
            this.field2253[var5][var4] = class73.method578(this.field2253[var5][var4], 262144);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIBIIIIIII)Z")
    public final boolean method969(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 < 105) {
            this.field2251 = 46;
        }
        field2252++;
        int var11 = arg4 + arg6;
        int var12 = arg0 + arg5;
        int var13 = arg3 + arg8;
        int var14 = arg7 + arg9;
        if (arg4 == var13 && (arg1 & 0x2) == 0) {
            int var15 = arg7 < arg5 ? arg5 : arg7;
            int var16 = var14 <= var12 ? var14 : var12;
            while (var15 < var16) {
                if ((this.field2253[var13 - this.field2243 - 1][var15 - this.field2244] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg3 == var11 && (arg1 & 0x8) == 0) {
            int var17 = arg7 < arg5 ? arg5 : arg7;
            int var18 = var14 <= var12 ? var14 : var12;
            while (var17 < var18) {
                if ((this.field2253[arg3 - this.field2243][var17 - this.field2244] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg5 == var14 && (arg1 & 0x1) == 0) {
            int var19 = arg3 >= arg4 ? arg3 : arg4;
            int var20 = var13 <= var11 ? var13 : var11;
            while (var19 < var20) {
                if ((this.field2253[var19 - this.field2243][var14 - this.field2244 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg7 == var12 && (arg1 & 0x4) == 0) {
            int var21 = arg4 <= arg3 ? arg3 : arg4;
            int var22 = var11 >= var13 ? var13 : var11;
            while (var22 > var21) {
                if ((this.field2253[var21 - this.field2243][arg7 - this.field2244] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "(III)V")
    public final void method970(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field2244;
        int var5 = arg0 - this.field2243;
        field2246++;
        this.field2253[var5][var4] = class589.method3454(this.field2253[var5][var4], -2097153);
        if (arg1 != -27766) {
            this.field2243 = 38;
        }
    }
}
