import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class273 {

    @OriginalMember(owner = "client!rm", name = "f", descriptor = "I")
    private int field4441;

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "I")
    private int field4438;

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "I")
    private int field4440;

    @OriginalMember(owner = "client!rm", name = "p", descriptor = "[[I")
    public int[][] field4451;

    @OriginalMember(owner = "client!rm", name = "n", descriptor = "I")
    private int field4449;

    @OriginalMember(owner = "client!rm", name = "v", descriptor = "I")
    public static int field4457 = 0;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "I")
    public static int field4436;

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "I")
    public static int field4437;

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "I")
    public static int field4439;

    @OriginalMember(owner = "client!rm", name = "g", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!rm", name = "h", descriptor = "I")
    public static int field4443;

    @OriginalMember(owner = "client!rm", name = "i", descriptor = "I")
    public static int field4444;

    @OriginalMember(owner = "client!rm", name = "j", descriptor = "I")
    public static int field4445;

    @OriginalMember(owner = "client!rm", name = "l", descriptor = "I")
    public static int field4447;

    @OriginalMember(owner = "client!rm", name = "m", descriptor = "I")
    public static int field4448;

    @OriginalMember(owner = "client!rm", name = "o", descriptor = "I")
    public static int field4450;

    @OriginalMember(owner = "client!rm", name = "q", descriptor = "I")
    public static int field4452;

    @OriginalMember(owner = "client!rm", name = "r", descriptor = "I")
    public static int field4453;

    @OriginalMember(owner = "client!rm", name = "s", descriptor = "I")
    public static int field4454;

    @OriginalMember(owner = "client!rm", name = "t", descriptor = "I")
    public static int field4455;

    @OriginalMember(owner = "client!rm", name = "u", descriptor = "I")
    public static int field4456;

    @OriginalMember(owner = "client!rm", name = "w", descriptor = "I")
    public static int field4458;

    @OriginalMember(owner = "client!rm", name = "x", descriptor = "I")
    public static int field4459;

    @OriginalMember(owner = "client!rm", name = "y", descriptor = "I")
    public static int field4460;

    @OriginalMember(owner = "client!rm", name = "z", descriptor = "I")
    public static int field4461;

    @OriginalMember(owner = "client!rm", name = "A", descriptor = "I")
    public static int field4462;

    @OriginalMember(owner = "client!rm", name = "k", descriptor = "[[S")
    public static short[][] field4446;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(III)V", line = 6)
    public final void method1925(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field4449;
        field4436++;
        int var5 = arg0 - this.field4438;
        this.field4451[var5][var4] = class287.method2034(this.field4451[var5][var4], 262144);
        int var6 = 100 % ((arg1 + 81) / 44);
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(III)Lqo;", line = 18)
    public static final class332 method1926(int arg0, int arg1, int arg2) {
        class312 var3 = class353.field5644[arg0][arg1][arg2];
        return var3 == null ? null : var3.field5082;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIIIIIIB)Z", line = 28)
    public final boolean method1927(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field4452++;
        if (arg6 == 1) {
            if (arg2 == arg4 && arg0 == arg3) {
                return true;
            }
        } else if (arg4 <= arg2 && arg2 <= (arg4 - (1 - arg6)) && arg0 <= arg0 && arg0 <= (arg0 + arg6 - 1)) {
            return true;
        }
        if (arg7 < 95) {
            method1937(-97);
        }
        int var9 = arg2 - this.field4438;
        int var10 = arg3 - this.field4449;
        int var11 = arg0 - this.field4449;
        int var12 = arg4 - this.field4438;
        if (arg6 == 1) {
            if (arg5 == 0) {
                if (arg1 == 0) {
                    if ((var9 - 1) == var12 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && var11 + 1 == var10 && (this.field4451[var12][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var11 - 1 == var10 && (this.field4451[var12][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var9 == var12 && (var11 + 1) == var10) {
                        return true;
                    }
                    if (var9 - 1 == var12 && var10 == var11 && (this.field4451[var12][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var12 && var10 == var11 && (this.field4451[var12][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if ((var9 + 1) == var12 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && (var11 + 1) == var10 && (this.field4451[var12][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var11 - 1) == var10 && (this.field4451[var12][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var9 == var12 && var11 - 1 == var10) {
                        return true;
                    }
                    if (var9 - 1 == var12 && var10 == var11 && (this.field4451[var12][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var12 && var10 == var11 && (this.field4451[var12][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 2) {
                if (arg1 == 0) {
                    if (var9 - 1 == var12 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && var11 + 1 == var10) {
                        return true;
                    }
                    if (var9 + 1 == var12 && var10 == var11 && (this.field4451[var12][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var11 - 1) == var10 && (this.field4451[var12][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if ((var9 - 1) == var12 && var10 == var11 && (this.field4451[var12][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var11 + 1 == var10) {
                        return true;
                    }
                    if ((var9 + 1) == var12 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && (var11 - 1) == var10 && (this.field4451[var12][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var9 - 1 == var12 && var10 == var11 && (this.field4451[var12][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var11 + 1 == var10 && (this.field4451[var12][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var12 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && var11 - 1 == var10) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if ((var9 - 1) == var12 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && (var11 + 1) == var10 && (this.field4451[var12][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var12 && var10 == var11 && (this.field4451[var12][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var11 - 1) == var10) {
                        return true;
                    }
                }
            }
            if (arg5 == 9) {
                if (var9 == var12 && (var11 + 1) == var10 && (this.field4451[var12][var10] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var12 && var11 - 1 == var10 && (this.field4451[var12][var10] & 0x2) == 0) {
                    return true;
                }
                if ((var9 - 1) == var12 && var10 == var11 && (this.field4451[var12][var10] & 0x8) == 0) {
                    return true;
                }
                if (var9 + 1 == var12 && var10 == var11 && (this.field4451[var12][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var12 + arg6 - 1;
            int var14 = var10 - (1 - arg6);
            if (arg5 == 0) {
                if (arg1 == 0) {
                    if ((var9 - arg6) == var12 && var11 >= var10 && var11 <= var14) {
                        return true;
                    }
                    if (var9 >= var12 && var13 >= var9 && var11 + 1 == var10 && (this.field4451[var9][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 <= var9 && var13 >= var9 && var11 - arg6 == var10 && (this.field4451[var9][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var12 <= var9 && var13 >= var9 && (var11 + 1) == var10) {
                        return true;
                    }
                    if ((var9 - arg6) == var12 && var10 <= var11 && var11 <= var14 && (this.field4451[var13][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var12 && var10 <= var11 && var14 >= var11 && (this.field4451[var12][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if ((var9 + 1) == var12 && var11 >= var10 && var14 >= var11) {
                        return true;
                    }
                    if (var9 >= var12 && var9 <= var13 && var11 + 1 == var10 && (this.field4451[var9][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 <= var9 && var13 >= var9 && var11 - arg6 == var10 && (this.field4451[var9][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var9 >= var12 && var9 <= var13 && var11 - arg6 == var10) {
                        return true;
                    }
                    if ((var9 - arg6) == var12 && var10 <= var11 && var11 <= var14 && (this.field4451[var13][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var12 && var10 <= var11 && var14 >= var11 && (this.field4451[var12][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 2) {
                if (arg1 == 0) {
                    if (var9 - arg6 == var12 && var11 >= var10 && var14 >= var11) {
                        return true;
                    }
                    if (var9 >= var12 && var9 <= var13 && (var11 + 1) == var10) {
                        return true;
                    }
                    if ((var9 + 1) == var12 && var11 >= var10 && var11 <= var14 && (this.field4451[var12][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 >= var12 && var9 <= var13 && var11 - arg6 == var10 && (this.field4451[var9][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if ((var9 - arg6) == var12 && var11 >= var10 && var14 >= var11 && (this.field4451[var13][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 <= var9 && var9 <= var13 && (var11 + 1) == var10) {
                        return true;
                    }
                    if ((var9 + 1) == var12 && var10 <= var11 && var11 <= var14) {
                        return true;
                    }
                    if (var9 >= var12 && var9 <= var13 && var11 - arg6 == var10 && (this.field4451[var9][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if ((var9 - arg6) == var12 && var10 <= var11 && var14 >= var11 && (this.field4451[var13][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 >= var12 && var13 >= var9 && (var11 + 1) == var10 && (this.field4451[var9][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var12 && var11 >= var10 && var11 <= var14) {
                        return true;
                    }
                    if (var12 <= var9 && var13 >= var9 && var11 - arg6 == var10) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if ((var9 - arg6) == var12 && var11 >= var10 && var14 >= var11) {
                        return true;
                    }
                    if (var9 >= var12 && var13 >= var9 && (var11 + 1) == var10 && (this.field4451[var9][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var12 && var11 >= var10 && var11 <= var14 && (this.field4451[var12][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var12 <= var9 && var13 >= var9 && var11 - arg6 == var10) {
                        return true;
                    }
                }
            }
            if (arg5 == 9) {
                if (var12 <= var9 && var9 <= var13 && (var11 + 1) == var10 && (this.field4451[var9][var10] & 0x2C0120) == 0) {
                    return true;
                }
                if (var9 >= var12 && var13 >= var9 && var11 - arg6 == var10 && (this.field4451[var9][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if ((var9 - arg6) == var12 && var10 <= var11 && var11 <= var14 && (this.field4451[var13][var11] & 0x2C0108) == 0) {
                    return true;
                }
                if ((var9 + 1) == var12 && var10 <= var11 && var11 <= var14 && (this.field4451[var12][var11] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIZZIZI)V", line = 396)
    public final void method1928(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, boolean arg5, int arg6) {
        int var8 = arg6 - this.field4438;
        int var9 = arg0 - this.field4449;
        field4460++;
        if (arg1 == 0) {
            if (arg4 == 0) {
                this.method1944(var9, -1, 128, var8);
                this.method1944(var9, -1, 8, var8 - 1);
            }
            if (arg4 == 1) {
                this.method1944(var9, -1, 2, var8);
                this.method1944(var9 + 1, -1, 32, var8);
            }
            if (arg4 == 2) {
                this.method1944(var9, -1, 8, var8);
                this.method1944(var9, -1, 128, var8 + 1);
            }
            if (arg4 == 3) {
                this.method1944(var9, -1, 32, var8);
                this.method1944(var9 - 1, -1, 2, var8);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg4 == 0) {
                this.method1944(var9, -1, 1, var8);
                this.method1944(var9 + 1, -1, 16, var8 - 1);
            }
            if (arg4 == 1) {
                this.method1944(var9, -1, 4, var8);
                this.method1944(var9 + 1, -1, 64, var8 + 1);
            }
            if (arg4 == 2) {
                this.method1944(var9, -1, 16, var8);
                this.method1944(var9 - 1, -1, 1, var8 + 1);
            }
            if (arg4 == 3) {
                this.method1944(var9, -1, 64, var8);
                this.method1944(var9 - 1, -1, 4, var8 - 1);
            }
        }
        if (!arg2) {
            return;
        }
        if (arg1 == 2) {
            if (arg4 == 0) {
                this.method1944(var9, -1, 130, var8);
                this.method1944(var9, -1, 8, var8 - 1);
                this.method1944(var9 + 1, -1, 32, var8);
            }
            if (arg4 == 1) {
                this.method1944(var9, -1, 10, var8);
                this.method1944(var9 + 1, -1, 32, var8);
                this.method1944(var9, -1, 128, var8 + 1);
            }
            if (arg4 == 2) {
                this.method1944(var9, -1, 40, var8);
                this.method1944(var9, -1, 128, var8 + 1);
                this.method1944(var9 - 1, -1, 2, var8);
            }
            if (arg4 == 3) {
                this.method1944(var9, -1, 160, var8);
                this.method1944(var9 - 1, -1, 2, var8);
                this.method1944(var9, -1, 8, var8 - 1);
            }
        }
        if (arg3) {
            if (arg1 == 0) {
                if (arg4 == 0) {
                    this.method1944(var9, -1, 65536, var8);
                    this.method1944(var9, -1, 4096, var8 - 1);
                }
                if (arg4 == 1) {
                    this.method1944(var9, -1, 1024, var8);
                    this.method1944(var9 + 1, -1, 16384, var8);
                }
                if (arg4 == 2) {
                    this.method1944(var9, -1, 4096, var8);
                    this.method1944(var9, -1, 65536, var8 + 1);
                }
                if (arg4 == 3) {
                    this.method1944(var9, -1, 16384, var8);
                    this.method1944(var9 - 1, -1, 1024, var8);
                }
            }
            if (arg1 == 1 || arg1 == 3) {
                if (arg4 == 0) {
                    this.method1944(var9, -1, 512, var8);
                    this.method1944(var9 + 1, -1, 8192, var8 - 1);
                }
                if (arg4 == 1) {
                    this.method1944(var9, -1, 2048, var8);
                    this.method1944(var9 + 1, -1, 32768, var8 + 1);
                }
                if (arg4 == 2) {
                    this.method1944(var9, -1, 8192, var8);
                    this.method1944(var9 - 1, -1, 512, var8 + 1);
                }
                if (arg4 == 3) {
                    this.method1944(var9, -1, 32768, var8);
                    this.method1944(var9 - 1, -1, 2048, var8 - 1);
                }
            }
            if (arg1 == 2) {
                if (arg4 == 0) {
                    this.method1944(var9, -1, 66560, var8);
                    this.method1944(var9, -1, 4096, var8 - 1);
                    this.method1944(var9 + 1, -1, 16384, var8);
                }
                if (arg4 == 1) {
                    this.method1944(var9, -1, 5120, var8);
                    this.method1944(var9 + 1, -1, 16384, var8);
                    this.method1944(var9, -1, 65536, var8 + 1);
                }
                if (arg4 == 2) {
                    this.method1944(var9, -1, 20480, var8);
                    this.method1944(var9, -1, 65536, var8 + 1);
                    this.method1944(var9 - 1, -1, 1024, var8);
                }
                if (arg4 == 3) {
                    this.method1944(var9, -1, 81920, var8);
                    this.method1944(var9 - 1, -1, 1024, var8);
                    this.method1944(var9, -1, 4096, var8 - 1);
                }
            }
        }
        if (!arg5) {
            return;
        }
        if (arg1 == 0) {
            if (arg4 == 0) {
                this.method1944(var9, -1, 536870912, var8);
                this.method1944(var9, -1, 33554432, var8 - 1);
            }
            if (arg4 == 1) {
                this.method1944(var9, -1, 8388608, var8);
                this.method1944(var9 + 1, -1, 134217728, var8);
            }
            if (arg4 == 2) {
                this.method1944(var9, -1, 33554432, var8);
                this.method1944(var9, -1, 536870912, var8 + 1);
            }
            if (arg4 == 3) {
                this.method1944(var9, -1, 134217728, var8);
                this.method1944(var9 - 1, -1, 8388608, var8);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg4 == 0) {
                this.method1944(var9, -1, 4194304, var8);
                this.method1944(var9 + 1, -1, 67108864, var8 - 1);
            }
            if (arg4 == 1) {
                this.method1944(var9, -1, 16777216, var8);
                this.method1944(var9 + 1, -1, 268435456, var8 + 1);
            }
            if (arg4 == 2) {
                this.method1944(var9, -1, 67108864, var8);
                this.method1944(var9 - 1, -1, 4194304, var8 + 1);
            }
            if (arg4 == 3) {
                this.method1944(var9, -1, 268435456, var8);
                this.method1944(var9 - 1, -1, 16777216, var8 - 1);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method1944(var9, -1, 545259520, var8);
            this.method1944(var9, -1, 33554432, var8 - 1);
            this.method1944(var9 + 1, -1, 134217728, var8);
        }
        if (arg4 == 1) {
            this.method1944(var9, -1, 41943040, var8);
            this.method1944(var9 + 1, -1, 134217728, var8);
            this.method1944(var9, -1, 536870912, var8 + 1);
        }
        if (arg4 == 2) {
            this.method1944(var9, -1, 167772160, var8);
            this.method1944(var9, -1, 536870912, var8 + 1);
            this.method1944(var9 - 1, -1, 8388608, var8);
        }
        if (arg4 == 3) {
            this.method1944(var9, -1, 671088640, var8);
            this.method1944(var9 - 1, -1, 8388608, var8);
            this.method1944(var9, -1, 33554432, var8 - 1);
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)V", line = 708)
    public final void method1929(int arg0) {
        if (arg0 != 33554432) {
            return;
        }
        for (int var2 = 0; var2 < this.field4440; var2++) {
            for (int var3 = 0; var3 < this.field4441; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= this.field4440 - 5 || (this.field4441 - 5) <= var3) {
                    this.field4451[var2][var3] = 16777215;
                } else {
                    this.field4451[var2][var3] = 2097152;
                }
            }
        }
        field4443++;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(B)V", line = 743)
    public static final void method1930(byte arg0) {
        if (arg0 != -112) {
            return;
        }
        field4454++;
        if (class14.method137(256) || class276.field4506 == class208.field3479) {
            class194.method1343((byte) 109);
            if (class71.field1316 != class276.field4506) {
                class209.method1445(-12767);
            }
        } else {
            class1.method3(class174.field2886, class115.field2070, false, class276.field4506, 128, class96.field1750.field139[0], class96.field1750.field170[0], false);
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIIIIIIII)Z", line = 763)
    public final boolean method1931(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4453++;
        if (arg5 <= 1) {
            int var10 = arg7 + arg1 + arg8;
            int var11 = arg4 + arg6 - 1;
            if (arg0 >= arg7 && var10 >= arg0 && arg4 <= arg2 && arg2 <= var11) {
                return true;
            } else if (arg7 - 1 == arg0 && arg4 <= arg2 && var11 >= arg2 && (this.field4451[arg0 - this.field4438][arg2 - this.field4449] & 0x8) == 0 && (arg3 & 0x8) == 0) {
                return true;
            } else if (var10 + 1 == arg0 && arg4 <= arg2 && var11 >= arg2 && (this.field4451[arg0 - this.field4438][arg2 - this.field4449] & 0x80) == 0 && (arg3 & 0x2) == 0) {
                return true;
            } else if (arg4 - 1 == arg2 && arg7 <= arg0 && arg0 <= var10 && (this.field4451[arg0 - this.field4438][arg2 - this.field4449] & 0x2) == 0 && (arg3 & 0x4) == 0) {
                return true;
            } else {
                return var11 + 1 == arg2 && arg7 <= arg0 && var10 >= arg0 && (this.field4451[arg0 - this.field4438][arg2 - this.field4449] & 0x20) == 0 && (arg3 & 0x1) == 0;
            }
        } else if (class181.method1280(arg7, arg5, arg1, arg2, arg5, arg4, arg6, 11999, arg0)) {
            return true;
        } else {
            return this.method1943(arg1, arg7, arg2, arg4, arg8 ^ 0x0, arg5, arg3, arg6, arg0, arg5);
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IZIIZZII)V", line = 801)
    public final void method1932(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, boolean arg5, int arg6, int arg7) {
        field4442++;
        int var9 = arg2 - this.field4449;
        if (!arg1) {
            this.field4438 = -95;
        }
        int var10 = 256;
        if (arg7 == 1 || arg7 == 3) {
            int var11 = arg6;
            arg6 = arg0;
            arg0 = var11;
        }
        int var12 = arg3 - this.field4438;
        if (arg4) {
            var10 |= 0x20000;
        }
        if (arg5) {
            var10 |= 0x40000000;
        }
        for (int var13 = var12; var13 < arg6 + var12; var13++) {
            if (var13 >= 0 && this.field4440 > var13) {
                for (int var14 = var9; var14 < arg0 + var9; var14++) {
                    if (var14 >= 0 && var14 < this.field4441) {
                        this.method1944(var14, -1, var10, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "(III)V", line = 858)
    public final void method1933(int arg0, int arg1, int arg2) {
        field4459++;
        if (arg1 == -15272) {
            int var4 = arg0 - this.field4449;
            int var5 = arg2 - this.field4438;
            this.field4451[var5][var4] = class287.method2034(this.field4451[var5][var4], 2097152);
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIIILml;Lml;IIJ)V", line = 870)
    public static final void method1934(int arg0, int arg1, int arg2, int arg3, class152 arg4, class152 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class16 var10 = new class16();
        var10.field469 = arg8;
        var10.field464 = arg1 * 128 + 64;
        var10.field468 = arg2 * 128 + 64;
        var10.field472 = arg3;
        var10.field473 = arg4;
        var10.field465 = arg5;
        var10.field470 = arg6;
        var10.field466 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class353.field5644[var11][arg1][arg2] == null) {
                class353.field5644[var11][arg1][arg2] = new class312(var11, arg1, arg2);
            }
        }
        class353.field5644[arg0][arg1][arg2].field5102 = var10;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(BIII)V", line = 903)
    private final void method1935(byte arg0, int arg1, int arg2, int arg3) {
        field4447++;
        this.field4451[arg2][arg3] = class287.method2034(this.field4451[arg2][arg3], arg1);
        if (arg0 != 19) {
            this.field4451 = (int[][]) ((int[][]) null);
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lla;ILjava/awt/Frame;)V", line = 920)
    public static final void method1936(class157 arg0, int arg1, Frame arg2) {
        while (true) {
            class210 var3 = arg0.method1128(arg2, arg1 + 107);
            while (var3.field3504 == 0) {
                class122.method881(55, 10L);
            }
            if (var3.field3504 == 1) {
                field4439++;
                arg2.setVisible(false);
                if (arg1 != -2) {
                    return;
                }
                arg2.dispose();
                return;
            }
            class122.method881(102, 100L);
        }
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(I)V", line = 943)
    public static void method1937(int arg0) {
        field4446 = (short[][]) null;
        if (arg0 < 117) {
            field4457 = 1;
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(BLek;)I", line = 954)
    public static final int method1938(byte arg0, class206 arg1) {
        if (arg0 >= -62) {
            method1940(34, -71, -84, 102, 26, -24);
        }
        int var2 = 0;
        field4444++;
        if (arg1.method1401(class135.field2313, -2689)) {
            var2++;
        }
        if (arg1.method1401(class257.field4201, -2689)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "(III)I", line = 972)
    public static final int method1939(int arg0, int arg1, int arg2) {
        if (arg0 > arg2) {
            int var3 = arg2;
            arg2 = arg0;
            arg0 = var3;
        }
        if (arg1 > -121) {
            method1930((byte) -62);
        }
        field4462++;
        while (arg0 != 0) {
            int var4 = arg2 % arg0;
            arg2 = arg0;
            arg0 = var4;
        }
        return arg2;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIIIII)Z", line = 1000)
    public static final boolean method1940(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var9 = arg3; var9 <= arg4; var9++) {
                    if (class120.field2136[arg0][var8][var9] == -class264.field4332) {
                        return false;
                    }
                }
            }
            int var10 = (arg1 << 7) + 1;
            int var11 = (arg3 << 7) + 2;
            int var12 = class144.field2427[arg0][arg1][arg3] + arg5;
            if (!class153.method1093(var10, var12, var11)) {
                return false;
            }
            int var13 = (arg2 << 7) - 1;
            if (!class153.method1093(var13, var12, var11)) {
                return false;
            }
            int var14 = (arg4 << 7) - 1;
            if (!class153.method1093(var10, var12, var14)) {
                return false;
            } else if (class153.method1093(var13, var12, var14)) {
                return true;
            } else {
                return false;
            }
        } else if (class296.method2130(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class153.method1093(var6 + 1, class144.field2427[arg0][arg1][arg3] + arg5, var7 + 1) && class153.method1093(var6 + 128 - 1, class144.field2427[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class153.method1093(var6 + 128 - 1, class144.field2427[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class153.method1093(var6 + 1, class144.field2427[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IZIII)Z", line = 1061)
    public final boolean method1941(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field4450++;
        if (arg0 == arg2 && arg3 == arg4) {
            return true;
        }
        int var6 = arg0 - this.field4438;
        int var7 = arg3 - this.field4449;
        if (var6 < 0 || this.field4440 <= var6 || var7 < 0 || var7 >= this.field4441) {
            return false;
        }
        int var8 = arg4 - this.field4449;
        if (arg1) {
            field4446 = (short[][]) ((short[][]) null);
        }
        int var9 = arg2 - this.field4438;
        if (var9 < 0 || var9 >= this.field4440 || var8 < 0 || var8 >= this.field4441) {
            return false;
        }
        int var10;
        if (var6 > var9) {
            var10 = var6 - var9;
        } else {
            var10 = var9 - var6;
        }
        int var11;
        if (var8 >= var7) {
            var11 = var8 - var7;
        } else {
            var11 = var7 - var8;
        }
        if (var10 > var11) {
            int var12 = var11 * 65536 / var10;
            int var13 = 32768;
            while (var6 != var9) {
                if (var6 > var9) {
                    if ((this.field4451[var9][var8] & 0x2C0108) != 0) {
                        return false;
                    }
                    var9++;
                } else if (var6 < var9) {
                    if ((this.field4451[var9][var8] & 0x2C0180) != 0) {
                        return false;
                    }
                    var9--;
                }
                var13 += var12;
                if (var13 >= 65536) {
                    var13 -= 65536;
                    if (var8 < var7) {
                        if ((this.field4451[var9][var8] & 0x2C0102) != 0) {
                            return false;
                        }
                        var8++;
                    } else if (var8 > var7) {
                        if ((this.field4451[var9][var8] & 0x2C0120) != 0) {
                            return false;
                        }
                        var8--;
                    }
                }
            }
        } else {
            int var14 = var10 * 65536 / var11;
            int var15 = 32768;
            while (var7 != var8) {
                if (var7 > var8) {
                    if ((this.field4451[var9][var8] & 0x2C0102) != 0) {
                        return false;
                    }
                    var8++;
                } else if (var7 < var8) {
                    if ((this.field4451[var9][var8] & 0x2C0120) != 0) {
                        return false;
                    }
                    var8--;
                }
                var15 += var14;
                if (var15 >= 65536) {
                    var15 -= 65536;
                    if (var6 > var9) {
                        if ((this.field4451[var9][var8] & 0x2C0108) != 0) {
                            return false;
                        }
                        var9++;
                    } else if (var6 < var9) {
                        if ((this.field4451[var9][var8] & 0x2C0180) != 0) {
                            return false;
                        }
                        var9--;
                    }
                }
            }
        }
        return (this.field4451[var6][var7] & 0x240100) == 0;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(ZLek;Lek;)V", line = 1221)
    public static final void method1942(boolean arg0, class206 arg1, class206 arg2) {
        field4458++;
        class145.field2428 = arg1;
        if (!arg0) {
            class140.field2363 = arg2;
            class156.field2635 = class145.field2428.method1417(!arg0, 3);
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIIIIIIIII)Z", line = 1240)
    private final boolean method1943(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field4455++;
        int var11 = arg5 + arg8;
        if (arg4 != -1) {
            return false;
        }
        int var12 = arg2 + arg9;
        int var13 = arg0 + arg1;
        int var14 = arg3 + arg7;
        if (arg8 == var13 && (arg6 & 0x2) == 0) {
            int var15 = arg3 < arg2 ? arg2 : arg3;
            int var16 = var12 < var14 ? var12 : var14;
            while (var15 < var16) {
                if ((this.field4451[var13 - this.field4438 - 1][var15 - this.field4449] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg1 == var11 && (arg6 & 0x8) == 0) {
            int var17 = arg2 > arg3 ? arg2 : arg3;
            int var18 = var14 > var12 ? var12 : var14;
            while (var18 > var17) {
                if ((this.field4451[arg1 - this.field4438][var17 - this.field4449] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg2 == var14 && (arg6 & 0x1) == 0) {
            int var19 = arg8 > arg1 ? arg8 : arg1;
            int var20 = var11 >= var13 ? var13 : var11;
            while (var20 > var19) {
                if ((this.field4451[var19 - this.field4438][var14 - this.field4449 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg3 == var12 && (arg6 & 0x4) == 0) {
            int var21 = arg1 >= arg8 ? arg1 : arg8;
            int var22 = var13 <= var11 ? var13 : var11;
            while (var22 > var21) {
                if ((this.field4451[var21 - this.field4438][arg3 - this.field4449] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIII)V", line = 1332)
    private final void method1944(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != -1) {
            this.field4449 = -114;
        }
        this.field4451[arg3][arg0] = class83.method613(this.field4451[arg3][arg0], ~arg2);
        field4445++;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIIIIIII)Z", line = 1343)
    public final boolean method1945(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4437++;
        if (arg7 == 1) {
            if (arg0 == arg6 && arg2 == arg5) {
                return true;
            }
        } else if (arg6 <= arg0 && arg0 <= (arg6 + arg7 - 1) && arg5 >= arg5 && (arg5 + arg7 - 1) >= arg5) {
            return true;
        }
        int var9 = arg5 - this.field4449;
        int var10 = arg6 - this.field4438;
        int var11 = arg0 - this.field4438;
        if (arg3 != 16777216) {
            return true;
        }
        int var12 = arg2 - this.field4449;
        if (arg7 == 1) {
            if (arg4 == 6 || arg4 == 7) {
                if (arg4 == 7) {
                    arg1 = arg1 + 2 & 0x3;
                }
                if (arg1 == 0) {
                    if ((var11 + 1) == var10 && var9 == var12 && (this.field4451[var10][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var9 - 1 == var12 && (this.field4451[var10][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var11 - 1 == var10 && var9 == var12 && (this.field4451[var10][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var9 - 1) == var12 && (this.field4451[var10][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if ((var11 - 1) == var10 && var9 == var12 && (this.field4451[var10][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var9 + 1 == var12 && (this.field4451[var10][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var11 + 1 == var10 && var9 == var12 && (this.field4451[var10][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var9 + 1) == var12 && (this.field4451[var10][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 8) {
                if (var10 == var11 && (var9 + 1) == var12 && (this.field4451[var10][var12] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var11 && (var9 - 1) == var12 && (this.field4451[var10][var12] & 0x2) == 0) {
                    return true;
                }
                if ((var11 - 1) == var10 && var9 == var12 && (this.field4451[var10][var12] & 0x8) == 0) {
                    return true;
                }
                if ((var11 + 1) == var10 && var9 == var12 && (this.field4451[var10][var12] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var12 + arg7 - 1;
            int var14 = var10 + arg7 - 1;
            if (arg4 == 6 || arg4 == 7) {
                if (arg4 == 7) {
                    arg1 = arg1 + 2 & 0x3;
                }
                if (arg1 == 0) {
                    if (var11 + 1 == var10 && var9 >= var12 && var9 <= var13 && (this.field4451[var10][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 <= var11 && var14 >= var11 && (var9 - arg7) == var12 && (this.field4451[var11][var13] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if ((var11 - arg7) == var10 && var12 <= var9 && var13 >= var9 && (this.field4451[var14][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 >= var10 && var14 >= var11 && var9 - arg7 == var12 && (this.field4451[var11][var13] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var11 - arg7 == var10 && var9 >= var12 && var13 >= var9 && (this.field4451[var14][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 >= var10 && var11 <= var14 && (var9 + 1) == var12 && (this.field4451[var11][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var11 + 1 == var10 && var9 >= var12 && var13 >= var9 && (this.field4451[var10][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 <= var11 && var14 >= var11 && (var9 + 1) == var12 && (this.field4451[var11][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 8) {
                if (var10 <= var11 && var14 >= var11 && (var9 + 1) == var12 && (this.field4451[var11][var12] & 0x20) == 0) {
                    return true;
                }
                if (var11 >= var10 && var14 >= var11 && (var9 - arg7) == var12 && (this.field4451[var11][var13] & 0x2) == 0) {
                    return true;
                }
                if ((var11 - arg7) == var10 && var9 >= var12 && var13 >= var9 && (this.field4451[var14][var9] & 0x8) == 0) {
                    return true;
                }
                if ((var11 + 1) == var10 && var9 >= var12 && var9 <= var13 && (this.field4451[var10][var9] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "(III)V", line = 1532)
    public final void method1946(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field4438;
        if (arg2 != 29419) {
            this.method1947(65, false, 42, false, (byte) -94, 74, -81);
        }
        int var5 = arg0 - this.field4449;
        this.field4451[var4][var5] = class83.method613(this.field4451[var4][var5], -262145);
        field4456++;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IZIZBII)V", line = 1554)
    public final void method1947(int arg0, boolean arg1, int arg2, boolean arg3, byte arg4, int arg5, int arg6) {
        int var8 = arg2 - this.field4438;
        int var9 = arg6 - this.field4449;
        field4461++;
        if (arg0 == 0) {
            if (arg5 == 0) {
                this.method1935((byte) 19, 128, var8, var9);
                this.method1935((byte) 19, 8, var8 - 1, var9);
            }
            if (arg5 == 1) {
                this.method1935((byte) 19, 2, var8, var9);
                this.method1935((byte) 19, 32, var8, var9 + 1);
            }
            if (arg5 == 2) {
                this.method1935((byte) 19, 8, var8, var9);
                this.method1935((byte) 19, 128, var8 + 1, var9);
            }
            if (arg5 == 3) {
                this.method1935((byte) 19, 32, var8, var9);
                this.method1935((byte) 19, 2, var8, var9 - 1);
            }
        }
        if (arg4 <= 35) {
            return;
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg5 == 0) {
                this.method1935((byte) 19, 1, var8, var9);
                this.method1935((byte) 19, 16, var8 - 1, var9 + 1);
            }
            if (arg5 == 1) {
                this.method1935((byte) 19, 4, var8, var9);
                this.method1935((byte) 19, 64, var8 + 1, var9 - -1);
            }
            if (arg5 == 2) {
                this.method1935((byte) 19, 16, var8, var9);
                this.method1935((byte) 19, 1, var8 + 1, var9 + -1);
            }
            if (arg5 == 3) {
                this.method1935((byte) 19, 64, var8, var9);
                this.method1935((byte) 19, 4, var8 - 1, var9 + -1);
            }
        }
        if (arg0 == 2) {
            if (arg5 == 0) {
                this.method1935((byte) 19, 130, var8, var9);
                this.method1935((byte) 19, 8, var8 - 1, var9);
                this.method1935((byte) 19, 32, var8, var9 + 1);
            }
            if (arg5 == 1) {
                this.method1935((byte) 19, 10, var8, var9);
                this.method1935((byte) 19, 32, var8, var9 + 1);
                this.method1935((byte) 19, 128, var8 + 1, var9);
            }
            if (arg5 == 2) {
                this.method1935((byte) 19, 40, var8, var9);
                this.method1935((byte) 19, 128, var8 + 1, var9);
                this.method1935((byte) 19, 2, var8, var9 - 1);
            }
            if (arg5 == 3) {
                this.method1935((byte) 19, 160, var8, var9);
                this.method1935((byte) 19, 2, var8, var9 - 1);
                this.method1935((byte) 19, 8, var8 - 1, var9);
            }
        }
        if (arg1) {
            if (arg0 == 0) {
                if (arg5 == 0) {
                    this.method1935((byte) 19, 65536, var8, var9);
                    this.method1935((byte) 19, 4096, var8 - 1, var9);
                }
                if (arg5 == 1) {
                    this.method1935((byte) 19, 1024, var8, var9);
                    this.method1935((byte) 19, 16384, var8, var9 + 1);
                }
                if (arg5 == 2) {
                    this.method1935((byte) 19, 4096, var8, var9);
                    this.method1935((byte) 19, 65536, var8 + 1, var9);
                }
                if (arg5 == 3) {
                    this.method1935((byte) 19, 16384, var8, var9);
                    this.method1935((byte) 19, 1024, var8, var9 - 1);
                }
            }
            if (arg0 == 1 || arg0 == 3) {
                if (arg5 == 0) {
                    this.method1935((byte) 19, 512, var8, var9);
                    this.method1935((byte) 19, 8192, var8 - 1, var9 + 1);
                }
                if (arg5 == 1) {
                    this.method1935((byte) 19, 2048, var8, var9);
                    this.method1935((byte) 19, 32768, var8 + 1, var9 + 1);
                }
                if (arg5 == 2) {
                    this.method1935((byte) 19, 8192, var8, var9);
                    this.method1935((byte) 19, 512, var8 + 1, var9 + -1);
                }
                if (arg5 == 3) {
                    this.method1935((byte) 19, 32768, var8, var9);
                    this.method1935((byte) 19, 2048, var8 - 1, var9 + -1);
                }
            }
            if (arg0 == 2) {
                if (arg5 == 0) {
                    this.method1935((byte) 19, 66560, var8, var9);
                    this.method1935((byte) 19, 4096, var8 - 1, var9);
                    this.method1935((byte) 19, 16384, var8, var9 + 1);
                }
                if (arg5 == 1) {
                    this.method1935((byte) 19, 5120, var8, var9);
                    this.method1935((byte) 19, 16384, var8, var9 + 1);
                    this.method1935((byte) 19, 65536, var8 + 1, var9);
                }
                if (arg5 == 2) {
                    this.method1935((byte) 19, 20480, var8, var9);
                    this.method1935((byte) 19, 65536, var8 + 1, var9);
                    this.method1935((byte) 19, 1024, var8, var9 - 1);
                }
                if (arg5 == 3) {
                    this.method1935((byte) 19, 81920, var8, var9);
                    this.method1935((byte) 19, 1024, var8, var9 - 1);
                    this.method1935((byte) 19, 4096, var8 - 1, var9);
                }
            }
        }
        if (!arg3) {
            return;
        }
        if (arg0 == 0) {
            if (arg5 == 0) {
                this.method1935((byte) 19, 536870912, var8, var9);
                this.method1935((byte) 19, 33554432, var8 - 1, var9);
            }
            if (arg5 == 1) {
                this.method1935((byte) 19, 8388608, var8, var9);
                this.method1935((byte) 19, 134217728, var8, var9 + 1);
            }
            if (arg5 == 2) {
                this.method1935((byte) 19, 33554432, var8, var9);
                this.method1935((byte) 19, 536870912, var8 + 1, var9);
            }
            if (arg5 == 3) {
                this.method1935((byte) 19, 134217728, var8, var9);
                this.method1935((byte) 19, 8388608, var8, var9 - 1);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg5 == 0) {
                this.method1935((byte) 19, 4194304, var8, var9);
                this.method1935((byte) 19, 67108864, var8 - 1, var9 + 1);
            }
            if (arg5 == 1) {
                this.method1935((byte) 19, 16777216, var8, var9);
                this.method1935((byte) 19, 268435456, var8 + 1, var9 + 1);
            }
            if (arg5 == 2) {
                this.method1935((byte) 19, 67108864, var8, var9);
                this.method1935((byte) 19, 4194304, var8 + 1, var9 + -1);
            }
            if (arg5 == 3) {
                this.method1935((byte) 19, 268435456, var8, var9);
                this.method1935((byte) 19, 16777216, var8 - 1, var9 + -1);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method1935((byte) 19, 545259520, var8, var9);
            this.method1935((byte) 19, 33554432, var8 - 1, var9);
            this.method1935((byte) 19, 134217728, var8, var9 + 1);
        }
        if (arg5 == 1) {
            this.method1935((byte) 19, 41943040, var8, var9);
            this.method1935((byte) 19, 134217728, var8, var9 + 1);
            this.method1935((byte) 19, 536870912, var8 + 1, var9);
        }
        if (arg5 == 2) {
            this.method1935((byte) 19, 167772160, var8, var9);
            this.method1935((byte) 19, 536870912, var8 + 1, var9);
            this.method1935((byte) 19, 8388608, var8, var9 - 1);
        }
        if (arg5 == 3) {
            this.method1935((byte) 19, 671088640, var8, var9);
            this.method1935((byte) 19, 8388608, var8, var9 - 1);
            this.method1935((byte) 19, 33554432, var8 - 1, var9);
        }
    }

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(II)V", line = 1861)
    public class273(int arg0, int arg1) {
        this.field4441 = arg1;
        this.field4438 = 0;
        this.field4440 = arg0;
        this.field4451 = new int[this.field4440][this.field4441];
        this.field4449 = 0;
        this.method1929(33554432);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(ZIIIZII)V", line = 1876)
    public final void method1948(boolean arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        int var8 = arg5 - this.field4449;
        int var9 = arg1 - this.field4438;
        field4448++;
        int var10 = 256;
        if (arg0) {
            var10 |= 0x20000;
        }
        if (arg4) {
            var10 |= 0x40000000;
        }
        for (int var11 = var9; var11 < arg3 + var9; var11++) {
            if (var11 >= 0 && this.field4440 > var11) {
                for (int var12 = var8; var12 < (arg2 + var8); var12++) {
                    if (var12 >= 0 && this.field4441 > var12) {
                        this.method1935((byte) 19, var10, var11, var12);
                    }
                }
            }
        }
        if (arg6 != 1073741824) {
            this.method1931(21, 10, 82, -17, 32, 19, 31, 8, -20);
        }
    }
}
