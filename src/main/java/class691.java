import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class691 {

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "I")
    public static int field9630 = 1;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
    public static int field9617;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "I")
    public static int field9618;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
    public static int field9619;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
    public int field9620;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
    public static int field9621;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
    public static int field9622;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "I")
    public static int field9623;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "I")
    public int field9624;

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "I")
    public int field9625;

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "I")
    public static int field9626;

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
    public static int field9627;

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "I")
    public static int field9628;

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "I")
    public static int field9629;

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "I")
    public static int field9631;

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "I")
    public static int field9632;

    @OriginalMember(owner = "client!kb", name = "q", descriptor = "I")
    public static int field9633;

    @OriginalMember(owner = "client!kb", name = "r", descriptor = "I")
    public static int field9634;

    @OriginalMember(owner = "client!kb", name = "s", descriptor = "I")
    public static int field9635;

    @OriginalMember(owner = "client!kb", name = "t", descriptor = "I")
    public static int field9636;

    @OriginalMember(owner = "client!kb", name = "u", descriptor = "I")
    public static int field9637;

    @OriginalMember(owner = "client!kb", name = "v", descriptor = "I")
    public static int field9638;

    @OriginalMember(owner = "client!kb", name = "x", descriptor = "I")
    public int field9640;

    @OriginalMember(owner = "client!kb", name = "w", descriptor = "[[I")
    public int[][] field9639;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(III)V", line = 4)
    public final void method3885(int arg0, int arg1, int arg2) {
        if (arg1 >= -28) {
            this.method3896(-119, 110, -115);
        }
        int var4 = arg2 - this.field9640;
        field9626++;
        int var5 = arg0 - this.field9624;
        this.field9639[var5][var4] = class48.method346(this.field9639[var5][var4], -2097153);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZIZIIII)V", line = 18)
    public final void method3886(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        field9623++;
        int var8 = 256;
        if (arg0) {
            var8 |= 0x20000;
        }
        if (arg6 >= -86) {
            method3900(-84, null);
        }
        int var9 = arg3 - this.field9640;
        if (arg2) {
            var8 |= 0x40000000;
        }
        int var10 = arg5 - this.field9624;
        for (int var11 = var10; var11 < arg1 + var10; var11++) {
            if (var11 >= 0 && var11 < this.field9620) {
                for (int var12 = var9; var12 < arg4 + var9; var12++) {
                    if (var12 >= 0 && this.field9625 > var12) {
                        this.method3890(var12, var8, var11, (byte) 82);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIZ)V", line = 65)
    private final void method3887(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg3) {
            this.field9639[arg0][arg1] = class48.method346(this.field9639[arg0][arg1], ~arg2);
            field9628++;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V", line = 79)
    public final void method3888(byte arg0) {
        for (int var2 = 0; var2 < this.field9620; var2++) {
            for (int var3 = 0; var3 < this.field9625; var3++) {
                if (var2 == 0 || var3 == 0 || (this.field9620 - 5) <= var2 || (this.field9625 - 5) <= var3) {
                    this.field9639[var2][var3] = -1;
                } else {
                    this.field9639[var2][var3] = 2097152;
                }
            }
        }
        if (arg0 != 12) {
            this.field9625 = -8;
        }
        field9638++;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIBIZIZ)V", line = 114)
    public final void method3889(int arg0, int arg1, byte arg2, int arg3, boolean arg4, int arg5, boolean arg6) {
        int var8 = arg1 - this.field9640;
        field9618++;
        int var9 = arg5 - this.field9624;
        if (arg3 == 0) {
            if (arg0 == 0) {
                this.method3887(var9, var8, 128, true);
                this.method3887(var9 - 1, var8, 8, true);
            }
            if (arg0 == 1) {
                this.method3887(var9, var8, 2, true);
                this.method3887(var9, var8 + 1, 32, true);
            }
            if (arg0 == 2) {
                this.method3887(var9, var8, 8, true);
                this.method3887(var9 + 1, var8, 128, true);
            }
            if (arg0 == 3) {
                this.method3887(var9, var8, 32, true);
                this.method3887(var9, var8 - 1, 2, true);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg0 == 0) {
                this.method3887(var9, var8, 1, true);
                this.method3887(var9 - 1, var8 + 1, 16, true);
            }
            if (arg0 == 1) {
                this.method3887(var9, var8, 4, true);
                this.method3887(var9 + 1, var8 + 1, 64, true);
            }
            if (arg0 == 2) {
                this.method3887(var9, var8, 16, true);
                this.method3887(var9 + 1, var8 - 1, 1, true);
            }
            if (arg0 == 3) {
                this.method3887(var9, var8, 64, true);
                this.method3887(var9 - 1, var8 + -1, 4, true);
            }
        }
        if (arg2 > -95) {
            this.field9625 = 109;
        }
        if (arg3 == 2) {
            if (arg0 == 0) {
                this.method3887(var9, var8, 130, true);
                this.method3887(var9 - 1, var8, 8, true);
                this.method3887(var9, var8 + 1, 32, true);
            }
            if (arg0 == 1) {
                this.method3887(var9, var8, 10, true);
                this.method3887(var9, var8 + 1, 32, true);
                this.method3887(var9 + 1, var8, 128, true);
            }
            if (arg0 == 2) {
                this.method3887(var9, var8, 40, true);
                this.method3887(var9 + 1, var8, 128, true);
                this.method3887(var9, var8 - 1, 2, true);
            }
            if (arg0 == 3) {
                this.method3887(var9, var8, 160, true);
                this.method3887(var9, var8 - 1, 2, true);
                this.method3887(var9 - 1, var8, 8, true);
            }
        }
        if (arg6) {
            if (arg3 == 0) {
                if (arg0 == 0) {
                    this.method3887(var9, var8, 65536, true);
                    this.method3887(var9 - 1, var8, 4096, true);
                }
                if (arg0 == 1) {
                    this.method3887(var9, var8, 1024, true);
                    this.method3887(var9, var8 + 1, 16384, true);
                }
                if (arg0 == 2) {
                    this.method3887(var9, var8, 4096, true);
                    this.method3887(var9 + 1, var8, 65536, true);
                }
                if (arg0 == 3) {
                    this.method3887(var9, var8, 16384, true);
                    this.method3887(var9, var8 - 1, 1024, true);
                }
            }
            if (arg3 == 1 || arg3 == 3) {
                if (arg0 == 0) {
                    this.method3887(var9, var8, 512, true);
                    this.method3887(var9 - 1, var8 - -1, 8192, true);
                }
                if (arg0 == 1) {
                    this.method3887(var9, var8, 2048, true);
                    this.method3887(var9 + 1, var8 + 1, 32768, true);
                }
                if (arg0 == 2) {
                    this.method3887(var9, var8, 8192, true);
                    this.method3887(var9 + 1, var8 - 1, 512, true);
                }
                if (arg0 == 3) {
                    this.method3887(var9, var8, 32768, true);
                    this.method3887(var9 - 1, var8 + -1, 2048, true);
                }
            }
            if (arg3 == 2) {
                if (arg0 == 0) {
                    this.method3887(var9, var8, 66560, true);
                    this.method3887(var9 - 1, var8, 4096, true);
                    this.method3887(var9, var8 + 1, 16384, true);
                }
                if (arg0 == 1) {
                    this.method3887(var9, var8, 5120, true);
                    this.method3887(var9, var8 + 1, 16384, true);
                    this.method3887(var9 + 1, var8, 65536, true);
                }
                if (arg0 == 2) {
                    this.method3887(var9, var8, 20480, true);
                    this.method3887(var9 + 1, var8, 65536, true);
                    this.method3887(var9, var8 - 1, 1024, true);
                }
                if (arg0 == 3) {
                    this.method3887(var9, var8, 81920, true);
                    this.method3887(var9, var8 - 1, 1024, true);
                    this.method3887(var9 - 1, var8, 4096, true);
                }
            }
        }
        if (!arg4) {
            return;
        }
        if (arg3 == 0) {
            if (arg0 == 0) {
                this.method3887(var9, var8, 536870912, true);
                this.method3887(var9 - 1, var8, 33554432, true);
            }
            if (arg0 == 1) {
                this.method3887(var9, var8, 8388608, true);
                this.method3887(var9, var8 + 1, 134217728, true);
            }
            if (arg0 == 2) {
                this.method3887(var9, var8, 33554432, true);
                this.method3887(var9 + 1, var8, 536870912, true);
            }
            if (arg0 == 3) {
                this.method3887(var9, var8, 134217728, true);
                this.method3887(var9, var8 - 1, 8388608, true);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg0 == 0) {
                this.method3887(var9, var8, 4194304, true);
                this.method3887(var9 - 1, var8 + 1, 67108864, true);
            }
            if (arg0 == 1) {
                this.method3887(var9, var8, 16777216, true);
                this.method3887(var9 + 1, var8 + 1, 268435456, true);
            }
            if (arg0 == 2) {
                this.method3887(var9, var8, 67108864, true);
                this.method3887(var9 + 1, var8 + -1, 4194304, true);
            }
            if (arg0 == 3) {
                this.method3887(var9, var8, 268435456, true);
                this.method3887(var9 - 1, var8 + -1, 16777216, true);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method3887(var9, var8, 545259520, true);
            this.method3887(var9 - 1, var8, 33554432, true);
            this.method3887(var9, var8 + 1, 134217728, true);
        }
        if (arg0 == 1) {
            this.method3887(var9, var8, 41943040, true);
            this.method3887(var9, var8 + 1, 134217728, true);
            this.method3887(var9 + 1, var8, 536870912, true);
        }
        if (arg0 == 2) {
            this.method3887(var9, var8, 167772160, true);
            this.method3887(var9 + 1, var8, 536870912, true);
            this.method3887(var9, var8 - 1, 8388608, true);
        }
        if (arg0 == 3) {
            this.method3887(var9, var8, 671088640, true);
            this.method3887(var9, var8 - 1, 8388608, true);
            this.method3887(var9 - 1, var8, 33554432, true);
            return;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIB)V", line = 418)
    private final void method3890(int arg0, int arg1, int arg2, byte arg3) {
        field9637++;
        this.field9639[arg2][arg0] = class446.method2556(this.field9639[arg2][arg0], arg1);
        if (arg3 != 82) {
            this.method3889(-76, -127, (byte) -73, -49, true, -37, false);
        }
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(III)V", line = 435)
    public final void method3891(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field9624;
        int var5 = arg2 - this.field9640;
        field9621++;
        this.field9639[var4][var5] = class446.method2556(this.field9639[var4][var5], arg0);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIII)I", line = 447)
    public static final int method3892(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 != 2) {
            method3900(118, null);
        }
        field9634++;
        if (class507.field6771 == null) {
            return 0;
        }
        if (arg2 < 3) {
            int var6 = arg0 >> 9;
            int var7 = arg4 >> 9;
            if (arg1 < 0 || arg5 < 0 || class719.field10004 - 1 < arg1 || arg5 > class107.field1453 - 1) {
                return 0;
            }
            if (var6 < 1 || var7 < 1 || var6 > class719.field10004 - 1 || class107.field1453 - 1 < var7) {
                return 0;
            }
            boolean var8 = (class184.field2782[1][arg0 >> 9][arg4 >> 9] & 0x2) != 0;
            if ((arg0 & 0x1FF) == 0) {
                boolean var9 = (class184.field2782[1][var6 - 1][arg4 >> 9] & 0x2) != 0;
                boolean var10 = (class184.field2782[1][var6][arg4 >> 9] & 0x2) != 0;
                if (var10 != var9) {
                    var8 = (class184.field2782[1][arg1][arg5] & 0x2) != 0;
                }
            }
            if ((arg4 & 0x1FF) == 0) {
                boolean var11 = (class184.field2782[1][arg0 >> 9][var7 - 1] & 0x2) != 0;
                boolean var12 = (class184.field2782[1][arg0 >> 9][var7] & 0x2) != 0;
                if (var11 != var12) {
                    var8 = (class184.field2782[1][arg1][arg5] & 0x2) != 0;
                }
            }
            if (var8) {
                arg2++;
            }
        }
        return class507.field6771[arg2].method1750((byte) 100, arg0, arg4);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIIIII)Z", line = 505)
    public final boolean method3893(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field9629++;
        if (arg0 == arg1) {
            if (arg4 == arg6 && arg5 == arg7) {
                return true;
            }
        } else if (arg6 >= arg4 && arg6 <= arg1 + arg4 - 1 && arg5 >= arg5 && (arg1 + arg5 - 1) >= arg5) {
            return true;
        }
        int var9 = arg4 - this.field9624;
        int var10 = arg5 - this.field9640;
        int var11 = arg6 - this.field9624;
        int var12 = arg7 - this.field9640;
        if (arg1 == 1) {
            if (arg3 == 6 || arg3 == 7) {
                if (arg3 == 7) {
                    arg2 = arg2 + 2 & 0x3;
                }
                if (arg2 == 0) {
                    if (var11 + 1 == var9 && var10 == var12 && (this.field9639[var9][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 - 1 == var12 && (this.field9639[var9][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var11 - 1 == var9 && var10 == var12 && (this.field9639[var9][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var10 - 1) == var12 && (this.field9639[var9][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if (var11 - 1 == var9 && var10 == var12 && (this.field9639[var9][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var10 + 1) == var12 && (this.field9639[var9][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if ((var11 + 1) == var9 && var10 == var12 && (this.field9639[var9][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 + 1 == var12 && (this.field9639[var9][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 8) {
                if (var9 == var11 && (var10 + 1) == var12 && (this.field9639[var9][var12] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var11 && var10 - 1 == var12 && (this.field9639[var9][var12] & 0x2) == 0) {
                    return true;
                }
                if (var11 - 1 == var9 && var10 == var12 && (this.field9639[var9][var12] & 0x8) == 0) {
                    return true;
                }
                if (var11 + 1 == var9 && var10 == var12 && (this.field9639[var9][var12] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg1 + var9 - 1;
            int var14 = arg1 + var12 - 1;
            if (arg3 == 6 || arg3 == 7) {
                if (arg3 == 7) {
                    arg2 = arg2 + 2 & 0x3;
                }
                if (arg2 == 0) {
                    if ((var11 + 1) == var9 && var10 >= var12 && var10 <= var14 && (this.field9639[var9][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var13 >= var11 && var10 - arg1 == var12 && (this.field9639[var11][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var11 - arg1 == var9 && var10 >= var12 && var14 >= var10 && (this.field9639[var13][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var11 <= var13 && var10 - arg1 == var12 && (this.field9639[var11][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if ((var11 - arg1) == var9 && var12 <= var10 && var14 >= var10 && (this.field9639[var13][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var13 >= var11 && (var10 + 1) == var12 && (this.field9639[var11][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var11 + 1 == var9 && var12 <= var10 && var14 >= var10 && (this.field9639[var9][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var11 <= var13 && var10 + 1 == var12 && (this.field9639[var11][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 8) {
                if (var9 <= var11 && var13 >= var11 && (var10 + 1) == var12 && (this.field9639[var11][var12] & 0x20) == 0) {
                    return true;
                }
                if (var11 >= var9 && var13 >= var11 && (var10 - arg1) == var12 && (this.field9639[var11][var14] & 0x2) == 0) {
                    return true;
                }
                if (var11 - arg1 == var9 && var12 <= var10 && var14 >= var10 && (this.field9639[var13][var10] & 0x8) == 0) {
                    return true;
                }
                if ((var11 + 1) == var9 && var12 <= var10 && var10 <= var14 && (this.field9639[var9][var10] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIIIIII)Z", line = 695)
    public final boolean method3894(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field9627++;
        if (arg2 > 1) {
            return class287.method1780(arg2, arg6, arg5, arg4, arg2, arg1, arg0, arg7, true) ? true : this.method3899(arg2, arg1, arg6, arg4, arg7, arg3 - 101, arg0, arg8, arg2, arg5);
        }
        int var10 = arg0 + arg1 - 1;
        int var11 = arg4 + arg6 + arg3;
        if (arg0 <= arg7 && arg7 <= var10 && arg5 >= arg4 && arg5 <= var11) {
            return true;
        } else if ((arg0 - 1) == arg7 && arg4 <= arg5 && var11 >= arg5 && (this.field9639[arg7 - this.field9624][arg5 - this.field9640] & 0x8) == 0 && (arg8 & 0x8) == 0) {
            return true;
        } else if ((var10 + 1) == arg7 && arg4 <= arg5 && var11 >= arg5 && (this.field9639[arg7 - this.field9624][arg5 - this.field9640] & 0x80) == 0 && (arg8 & 0x2) == 0) {
            return true;
        } else if ((arg4 - 1) == arg5 && arg0 <= arg7 && arg7 <= var10 && (this.field9639[arg7 - this.field9624][arg5 - this.field9640] & 0x2) == 0 && (arg8 & 0x4) == 0) {
            return true;
        } else {
            return var11 + 1 == arg5 && arg0 <= arg7 && arg7 <= var10 && (this.field9639[arg7 - this.field9624][arg5 - this.field9640] & 0x20) == 0 && (arg8 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZII)V", line = 742)
    public final void method3895(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            field9630 = 32;
        }
        field9636++;
        int var4 = arg2 - this.field9640;
        int var5 = arg1 - this.field9624;
        this.field9639[var5][var4] = class446.method2556(this.field9639[var5][var4], 262144);
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(III)V", line = 758)
    public final void method3896(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field9624;
        int var5 = arg2 - this.field9640;
        if (arg0 > -47) {
            this.method3896(-92, -70, -124);
        }
        field9631++;
        this.field9639[var4][var5] = class48.method346(this.field9639[var4][var5], -262145);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZIIZIII)V", line = 772)
    public final void method3897(boolean arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        int var8 = arg2 - this.field9640;
        int var9 = arg6 - this.field9624;
        if (arg4 != 659456) {
            return;
        }
        field9632++;
        if (arg1 == 0) {
            if (arg5 == 0) {
                this.method3890(var8, 128, var9, (byte) 82);
                this.method3890(var8, 8, var9 - 1, (byte) 82);
            }
            if (arg5 == 1) {
                this.method3890(var8, 2, var9, (byte) 82);
                this.method3890(var8 + 1, 32, var9, (byte) 82);
            }
            if (arg5 == 2) {
                this.method3890(var8, 8, var9, (byte) 82);
                this.method3890(var8, 128, var9 + 1, (byte) 82);
            }
            if (arg5 == 3) {
                this.method3890(var8, 32, var9, (byte) 82);
                this.method3890(var8 - 1, 2, var9, (byte) 82);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg5 == 0) {
                this.method3890(var8, 1, var9, (byte) 82);
                this.method3890(var8 + 1, 16, var9 - 1, (byte) 82);
            }
            if (arg5 == 1) {
                this.method3890(var8, 4, var9, (byte) 82);
                this.method3890(var8 + 1, 64, var9 + 1, (byte) 82);
            }
            if (arg5 == 2) {
                this.method3890(var8, 16, var9, (byte) 82);
                this.method3890(var8 - 1, 1, var9 + 1, (byte) 82);
            }
            if (arg5 == 3) {
                this.method3890(var8, 64, var9, (byte) 82);
                this.method3890(var8 - 1, 4, var9 - 1, (byte) 82);
            }
        }
        if (arg1 == 2) {
            if (arg5 == 0) {
                this.method3890(var8, 130, var9, (byte) 82);
                this.method3890(var8, 8, var9 - 1, (byte) 82);
                this.method3890(var8 + 1, 32, var9, (byte) 82);
            }
            if (arg5 == 1) {
                this.method3890(var8, 10, var9, (byte) 82);
                this.method3890(var8 + 1, 32, var9, (byte) 82);
                this.method3890(var8, 128, var9 + 1, (byte) 82);
            }
            if (arg5 == 2) {
                this.method3890(var8, 40, var9, (byte) 82);
                this.method3890(var8, 128, var9 + 1, (byte) 82);
                this.method3890(var8 - 1, 2, var9, (byte) 82);
            }
            if (arg5 == 3) {
                this.method3890(var8, 160, var9, (byte) 82);
                this.method3890(var8 - 1, 2, var9, (byte) 82);
                this.method3890(var8, 8, var9 - 1, (byte) 82);
            }
        }
        if (arg3) {
            if (arg1 == 0) {
                if (arg5 == 0) {
                    this.method3890(var8, 65536, var9, (byte) 82);
                    this.method3890(var8, 4096, var9 - 1, (byte) 82);
                }
                if (arg5 == 1) {
                    this.method3890(var8, 1024, var9, (byte) 82);
                    this.method3890(var8 + 1, 16384, var9, (byte) 82);
                }
                if (arg5 == 2) {
                    this.method3890(var8, 4096, var9, (byte) 82);
                    this.method3890(var8, 65536, var9 + 1, (byte) 82);
                }
                if (arg5 == 3) {
                    this.method3890(var8, 16384, var9, (byte) 82);
                    this.method3890(var8 - 1, 1024, var9, (byte) 82);
                }
            }
            if (arg1 == 1 || arg1 == 3) {
                if (arg5 == 0) {
                    this.method3890(var8, 512, var9, (byte) 82);
                    this.method3890(var8 + 1, 8192, var9 - 1, (byte) 82);
                }
                if (arg5 == 1) {
                    this.method3890(var8, 2048, var9, (byte) 82);
                    this.method3890(var8 + 1, 32768, var9 + 1, (byte) 82);
                }
                if (arg5 == 2) {
                    this.method3890(var8, 8192, var9, (byte) 82);
                    this.method3890(var8 - 1, 512, var9 + 1, (byte) 82);
                }
                if (arg5 == 3) {
                    this.method3890(var8, 32768, var9, (byte) 82);
                    this.method3890(var8 - 1, 2048, var9 - 1, (byte) 82);
                }
            }
            if (arg1 == 2) {
                if (arg5 == 0) {
                    this.method3890(var8, 66560, var9, (byte) 82);
                    this.method3890(var8, 4096, var9 - 1, (byte) 82);
                    this.method3890(var8 + 1, 16384, var9, (byte) 82);
                }
                if (arg5 == 1) {
                    this.method3890(var8, 5120, var9, (byte) 82);
                    this.method3890(var8 + 1, 16384, var9, (byte) 82);
                    this.method3890(var8, 65536, var9 + 1, (byte) 82);
                }
                if (arg5 == 2) {
                    this.method3890(var8, 20480, var9, (byte) 82);
                    this.method3890(var8, 65536, var9 + 1, (byte) 82);
                    this.method3890(var8 - 1, 1024, var9, (byte) 82);
                }
                if (arg5 == 3) {
                    this.method3890(var8, 81920, var9, (byte) 82);
                    this.method3890(var8 - 1, 1024, var9, (byte) 82);
                    this.method3890(var8, 4096, var9 - 1, (byte) 82);
                }
            }
        }
        if (!arg0) {
            return;
        }
        if (arg1 == 0) {
            if (arg5 == 0) {
                this.method3890(var8, 536870912, var9, (byte) 82);
                this.method3890(var8, 33554432, var9 - 1, (byte) 82);
            }
            if (arg5 == 1) {
                this.method3890(var8, 8388608, var9, (byte) 82);
                this.method3890(var8 + 1, 134217728, var9, (byte) 82);
            }
            if (arg5 == 2) {
                this.method3890(var8, 33554432, var9, (byte) 82);
                this.method3890(var8, 536870912, var9 + 1, (byte) 82);
            }
            if (arg5 == 3) {
                this.method3890(var8, 134217728, var9, (byte) 82);
                this.method3890(var8 - 1, 8388608, var9, (byte) 82);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg5 == 0) {
                this.method3890(var8, 4194304, var9, (byte) 82);
                this.method3890(var8 + 1, 67108864, var9 - 1, (byte) 82);
            }
            if (arg5 == 1) {
                this.method3890(var8, 16777216, var9, (byte) 82);
                this.method3890(var8 + 1, 268435456, var9 + 1, (byte) 82);
            }
            if (arg5 == 2) {
                this.method3890(var8, 67108864, var9, (byte) 82);
                this.method3890(var8 - 1, 4194304, var9 + 1, (byte) 82);
            }
            if (arg5 == 3) {
                this.method3890(var8, 268435456, var9, (byte) 82);
                this.method3890(var8 - 1, 16777216, var9 - 1, (byte) 82);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method3890(var8, 545259520, var9, (byte) 82);
            this.method3890(var8, 33554432, var9 - 1, (byte) 82);
            this.method3890(var8 + 1, 134217728, var9, (byte) 82);
        }
        if (arg5 == 1) {
            this.method3890(var8, 41943040, var9, (byte) 82);
            this.method3890(var8 + 1, 134217728, var9, (byte) 82);
            this.method3890(var8, 536870912, var9 + 1, (byte) 82);
        }
        if (arg5 == 2) {
            this.method3890(var8, 167772160, var9, (byte) 82);
            this.method3890(var8, 536870912, var9 + 1, (byte) 82);
            this.method3890(var8 - 1, 8388608, var9, (byte) 82);
        }
        if (arg5 == 3) {
            this.method3890(var8, 671088640, var9, (byte) 82);
            this.method3890(var8 - 1, 8388608, var9, (byte) 82);
            this.method3890(var8, 33554432, var9 - 1, (byte) 82);
            return;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIZIZII)V", line = 1082)
    public final void method3898(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field9635++;
        int var9 = 256;
        if (arg3) {
            var9 |= 0x20000;
        }
        if (arg5) {
            var9 |= 0x40000000;
        }
        int var10 = arg1 - this.field9640;
        if (arg2 == 1 || arg2 == 3) {
            int var11 = arg6;
            arg6 = arg0;
            arg0 = var11;
        }
        int var12 = arg4 - this.field9624;
        if (arg7 > -89) {
            method3892(78, 127, 122, -66, -33, -16);
        }
        for (int var13 = var12; var13 < arg6 + var12; var13++) {
            if (var13 >= 0 && this.field9620 > var13) {
                for (int var14 = var10; var14 < arg0 + var10; var14++) {
                    if (var14 >= 0 && var14 < this.field9625) {
                        this.method3887(var13, var14, var9, true);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIIIIIII)Z", line = 1137)
    public final boolean method3899(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field9617++;
        int var11 = -51 / ((-arg5 - 45) / 52);
        int var12 = arg0 + arg4;
        int var13 = arg8 + arg9;
        int var14 = arg1 + arg6;
        int var15 = arg2 + arg3;
        if (arg4 == var14 && (arg7 & 0x2) == 0) {
            int var16 = arg9 <= arg3 ? arg3 : arg9;
            int var17 = var15 > var13 ? var13 : var15;
            while (var17 > var16) {
                if ((this.field9639[var14 - this.field9624 - 1][var16 - this.field9640] & 0x8) == 0) {
                    return true;
                }
                var16++;
            }
        } else if (arg6 == var12 && (arg7 & 0x8) == 0) {
            int var18 = arg3 < arg9 ? arg9 : arg3;
            int var19 = var15 > var13 ? var13 : var15;
            while (var19 > var18) {
                if ((this.field9639[arg6 - this.field9624][var18 - this.field9640] & 0x80) == 0) {
                    return true;
                }
                var18++;
            }
        } else if (arg9 == var15 && (arg7 & 0x1) == 0) {
            int var20 = arg4 > arg6 ? arg4 : arg6;
            int var21 = var14 > var12 ? var12 : var14;
            while (var20 < var21) {
                if ((this.field9639[var20 - this.field9624][var15 - this.field9640 - 1] & 0x2) == 0) {
                    return true;
                }
                var20++;
            }
        } else if (arg3 == var13 && (arg7 & 0x4) == 0) {
            int var22 = arg4 <= arg6 ? arg6 : arg4;
            int var23 = var14 <= var12 ? var14 : var12;
            while (var23 > var22) {
                if ((this.field9639[var22 - this.field9624][arg3 - this.field9640] & 0x20) == 0) {
                    return true;
                }
                var22++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILfb;)Ldaa;", line = 1230)
    public static final class10 method3900(int arg0, class675 arg1) {
        field9619++;
        class10 var2;
        if (class371.field5164 == null) {
            var2 = new class10();
        } else {
            var2 = class371.field5164;
            class371.field5164 = class371.field5164.field174;
            class34.field508--;
            var2.field174 = null;
        }
        if (arg0 != 31296) {
            method3892(-62, -65, 58, 2, -112, 88);
        }
        var2.field170 = arg1;
        return var2;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IBIIIIII)Z", line = 1255)
    public final boolean method3901(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field9622++;
        if (arg1 != -119) {
            return false;
        }
        if (arg4 == 1) {
            if (arg5 == arg6 && arg2 == arg7) {
                return true;
            }
        } else if (arg5 >= arg6 && arg4 + arg6 - 1 >= arg5 && arg7 <= arg7 && arg7 <= (arg7 + arg4 - 1)) {
            return true;
        }
        int var9 = arg2 - this.field9640;
        int var10 = arg5 - this.field9624;
        int var11 = arg6 - this.field9624;
        int var12 = arg7 - this.field9640;
        if (arg4 == 1) {
            if (arg3 == 0) {
                if (arg0 == 0) {
                    if ((var10 - 1) == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9 && (this.field9639[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 - 1) == var9 && (this.field9639[var11][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var10 == var11 && var12 + 1 == var9) {
                        return true;
                    }
                    if (var10 - 1 == var11 && var9 == var12 && (this.field9639[var11][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 == var12 && (this.field9639[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if ((var10 + 1) == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var12 + 1 == var9 && (this.field9639[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var9 && (this.field9639[var11][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var10 == var11 && var12 - 1 == var9) {
                        return true;
                    }
                    if ((var10 - 1) == var11 && var9 == var12 && (this.field9639[var11][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 == var12 && (this.field9639[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 2) {
                if (arg0 == 0) {
                    if (var10 - 1 == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var12 + 1 == var9) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 == var12 && (this.field9639[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 - 1) == var9 && (this.field9639[var11][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var10 - 1 == var11 && var9 == var12 && (this.field9639[var11][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var9 && (this.field9639[var11][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if ((var10 - 1) == var11 && var9 == var12 && (this.field9639[var11][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 + 1 == var9 && (this.field9639[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var12 - 1) == var9) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if ((var10 - 1) == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9 && (this.field9639[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 == var12 && (this.field9639[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 - 1) == var9) {
                        return true;
                    }
                }
            }
            if (arg3 == 9) {
                if (var10 == var11 && var12 + 1 == var9 && (this.field9639[var11][var9] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var11 && var12 - 1 == var9 && (this.field9639[var11][var9] & 0x2) == 0) {
                    return true;
                }
                if ((var10 - 1) == var11 && var9 == var12 && (this.field9639[var11][var9] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var11 && var9 == var12 && (this.field9639[var11][var9] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg4 + var11 - 1;
            int var14 = arg4 + var9 - 1;
            if (arg3 == 0) {
                if (arg0 == 0) {
                    if ((var10 - arg4) == var11 && var12 >= var9 && var12 <= var14) {
                        return true;
                    }
                    if (var11 <= var10 && var10 <= var13 && (var12 + 1) == var9 && (this.field9639[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var13 >= var10 && (var12 - arg4) == var9 && (this.field9639[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var10 >= var11 && var13 >= var10 && var12 + 1 == var9) {
                        return true;
                    }
                    if (var10 - arg4 == var11 && var9 <= var12 && var12 <= var14 && (this.field9639[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var12 >= var9 && var14 >= var12 && (this.field9639[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if ((var10 + 1) == var11 && var9 <= var12 && var14 >= var12) {
                        return true;
                    }
                    if (var10 >= var11 && var13 >= var10 && (var12 + 1) == var9 && (this.field9639[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var13 >= var10 && var12 - arg4 == var9 && (this.field9639[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var11 <= var10 && var13 >= var10 && var12 - arg4 == var9) {
                        return true;
                    }
                    if (var10 - arg4 == var11 && var12 >= var9 && var12 <= var14 && (this.field9639[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var12 >= var9 && var14 >= var12 && (this.field9639[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 2) {
                if (arg0 == 0) {
                    if ((var10 - arg4) == var11 && var12 >= var9 && var14 >= var12) {
                        return true;
                    }
                    if (var10 >= var11 && var13 >= var10 && (var12 + 1) == var9) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var12 >= var9 && var12 <= var14 && (this.field9639[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var13 >= var10 && (var12 - arg4) == var9 && (this.field9639[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var10 - arg4 == var11 && var12 >= var9 && var14 >= var12 && (this.field9639[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var13 >= var10 && var12 + 1 == var9) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var12 >= var9 && var14 >= var12) {
                        return true;
                    }
                    if (var10 >= var11 && var10 <= var13 && var12 - arg4 == var9 && (this.field9639[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if ((var10 - arg4) == var11 && var12 >= var9 && var12 <= var14 && (this.field9639[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var10 <= var13 && var12 + 1 == var9 && (this.field9639[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var12 >= var9 && var12 <= var14) {
                        return true;
                    }
                    if (var10 >= var11 && var13 >= var10 && var12 - arg4 == var9) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var10 - arg4 == var11 && var12 >= var9 && var14 >= var12) {
                        return true;
                    }
                    if (var10 >= var11 && var10 <= var13 && var12 + 1 == var9 && (this.field9639[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 <= var12 && var14 >= var12 && (this.field9639[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var13 >= var10 && (var12 - arg4) == var9) {
                        return true;
                    }
                }
            }
            if (arg3 == 9) {
                if (var11 <= var10 && var13 >= var10 && var12 + 1 == var9 && (this.field9639[var10][var9] & 0x2C0120) == 0) {
                    return true;
                }
                if (var11 <= var10 && var10 <= var13 && (var12 - arg4) == var9 && (this.field9639[var10][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if ((var10 - arg4) == var11 && var9 <= var12 && var12 <= var14 && (this.field9639[var13][var12] & 0x2C0108) == 0) {
                    return true;
                }
                if (var10 + 1 == var11 && var12 >= var9 && var12 <= var14 && (this.field9639[var11][var12] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
