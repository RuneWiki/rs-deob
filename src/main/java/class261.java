import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class261 {

    @OriginalMember(owner = "client!dg", name = "r", descriptor = "I")
    public static int field3468 = 0;

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "Lh;")
    public static class434 field3457 = new class434(82, 0);

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "I")
    public int field3451;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "I")
    public static int field3455;

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "I")
    public int field3456;

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "I")
    public static int field3459;

    @OriginalMember(owner = "client!dg", name = "j", descriptor = "I")
    public static int field3460;

    @OriginalMember(owner = "client!dg", name = "k", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!dg", name = "l", descriptor = "I")
    public static int field3462;

    @OriginalMember(owner = "client!dg", name = "m", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!dg", name = "n", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!dg", name = "o", descriptor = "I")
    public static int field3465;

    @OriginalMember(owner = "client!dg", name = "p", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!dg", name = "q", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!dg", name = "s", descriptor = "I")
    public int field3469;

    @OriginalMember(owner = "client!dg", name = "t", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!dg", name = "u", descriptor = "I")
    public static int field3471;

    @OriginalMember(owner = "client!dg", name = "v", descriptor = "I")
    public int field3472;

    @OriginalMember(owner = "client!dg", name = "w", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!dg", name = "x", descriptor = "I")
    public static int field3474;

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "[[I")
    public int[][] field3454;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lnk;B)V", line = 3)
    public static final void method1467(class464 arg0, byte arg1) {
        field3458++;
        class464 var2 = class445.method2611(arg0, (byte) 72);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class72.field986;
            var4 = class424.field5738;
        } else {
            var3 = var2.field6340;
            var4 = var2.field6308;
        }
        class31.method177(var3, var4, 12908, false, arg0);
        class477.method2794(arg0, var4, var3, (byte) -100);
        if (arg1 <= 68) {
            field3468 = 114;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZZIIIII)V", line = 30)
    public final void method1468(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3473++;
        int var8 = arg3 - this.field3451;
        if (arg2 < 15) {
            method1475(-5, 38, -26);
        }
        int var9 = arg4 - this.field3469;
        if (arg6 == 0) {
            if (arg5 == 0) {
                this.method1478(128, (byte) 56, var9, var8);
                this.method1478(8, (byte) 37, var9, var8 - 1);
            }
            if (arg5 == 1) {
                this.method1478(2, (byte) 79, var9, var8);
                this.method1478(32, (byte) 50, var9 + 1, var8);
            }
            if (arg5 == 2) {
                this.method1478(8, (byte) 120, var9, var8);
                this.method1478(128, (byte) 84, var9, var8 + 1);
            }
            if (arg5 == 3) {
                this.method1478(32, (byte) 79, var9, var8);
                this.method1478(2, (byte) 110, var9 - 1, var8);
            }
        }
        if (arg6 == 1 || arg6 == 3) {
            if (arg5 == 0) {
                this.method1478(1, (byte) 100, var9, var8);
                this.method1478(16, (byte) 96, var9 + 1, var8 - 1);
            }
            if (arg5 == 1) {
                this.method1478(4, (byte) 60, var9, var8);
                this.method1478(64, (byte) 71, var9 + 1, var8 + 1);
            }
            if (arg5 == 2) {
                this.method1478(16, (byte) 52, var9, var8);
                this.method1478(1, (byte) 49, var9 - 1, var8 + 1);
            }
            if (arg5 == 3) {
                this.method1478(64, (byte) 53, var9, var8);
                this.method1478(4, (byte) 55, var9 - 1, var8 + -1);
            }
        }
        if (arg6 == 2) {
            if (arg5 == 0) {
                this.method1478(130, (byte) 102, var9, var8);
                this.method1478(8, (byte) 78, var9, var8 - 1);
                this.method1478(32, (byte) 97, var9 + 1, var8);
            }
            if (arg5 == 1) {
                this.method1478(10, (byte) 106, var9, var8);
                this.method1478(32, (byte) 69, var9 + 1, var8);
                this.method1478(128, (byte) 80, var9, var8 + 1);
            }
            if (arg5 == 2) {
                this.method1478(40, (byte) 47, var9, var8);
                this.method1478(128, (byte) 43, var9, var8 + 1);
                this.method1478(2, (byte) 40, var9 - 1, var8);
            }
            if (arg5 == 3) {
                this.method1478(160, (byte) 99, var9, var8);
                this.method1478(2, (byte) 80, var9 - 1, var8);
                this.method1478(8, (byte) 92, var9, var8 - 1);
            }
        }
        if (arg0) {
            if (arg6 == 0) {
                if (arg5 == 0) {
                    this.method1478(65536, (byte) 106, var9, var8);
                    this.method1478(4096, (byte) 111, var9, var8 - 1);
                }
                if (arg5 == 1) {
                    this.method1478(1024, (byte) 121, var9, var8);
                    this.method1478(16384, (byte) 63, var9 + 1, var8);
                }
                if (arg5 == 2) {
                    this.method1478(4096, (byte) 85, var9, var8);
                    this.method1478(65536, (byte) 115, var9, var8 + 1);
                }
                if (arg5 == 3) {
                    this.method1478(16384, (byte) 114, var9, var8);
                    this.method1478(1024, (byte) 99, var9 - 1, var8);
                }
            }
            if (arg6 == 1 || arg6 == 3) {
                if (arg5 == 0) {
                    this.method1478(512, (byte) 79, var9, var8);
                    this.method1478(8192, (byte) 72, var9 + 1, var8 + -1);
                }
                if (arg5 == 1) {
                    this.method1478(2048, (byte) 89, var9, var8);
                    this.method1478(32768, (byte) 76, var9 + 1, var8 + 1);
                }
                if (arg5 == 2) {
                    this.method1478(8192, (byte) 42, var9, var8);
                    this.method1478(512, (byte) 71, var9 - 1, var8 - -1);
                }
                if (arg5 == 3) {
                    this.method1478(32768, (byte) 49, var9, var8);
                    this.method1478(2048, (byte) 100, var9 - 1, var8 + -1);
                }
            }
            if (arg6 == 2) {
                if (arg5 == 0) {
                    this.method1478(66560, (byte) 87, var9, var8);
                    this.method1478(4096, (byte) 64, var9, var8 - 1);
                    this.method1478(16384, (byte) 117, var9 + 1, var8);
                }
                if (arg5 == 1) {
                    this.method1478(5120, (byte) 117, var9, var8);
                    this.method1478(16384, (byte) 80, var9 + 1, var8);
                    this.method1478(65536, (byte) 72, var9, var8 + 1);
                }
                if (arg5 == 2) {
                    this.method1478(20480, (byte) 65, var9, var8);
                    this.method1478(65536, (byte) 125, var9, var8 + 1);
                    this.method1478(1024, (byte) 107, var9 - 1, var8);
                }
                if (arg5 == 3) {
                    this.method1478(81920, (byte) 66, var9, var8);
                    this.method1478(1024, (byte) 119, var9 - 1, var8);
                    this.method1478(4096, (byte) 122, var9, var8 - 1);
                }
            }
        }
        if (!arg1) {
            return;
        }
        if (arg6 == 0) {
            if (arg5 == 0) {
                this.method1478(536870912, (byte) 125, var9, var8);
                this.method1478(33554432, (byte) 76, var9, var8 - 1);
            }
            if (arg5 == 1) {
                this.method1478(8388608, (byte) 62, var9, var8);
                this.method1478(134217728, (byte) 79, var9 + 1, var8);
            }
            if (arg5 == 2) {
                this.method1478(33554432, (byte) 57, var9, var8);
                this.method1478(536870912, (byte) 105, var9, var8 + 1);
            }
            if (arg5 == 3) {
                this.method1478(134217728, (byte) 46, var9, var8);
                this.method1478(8388608, (byte) 107, var9 - 1, var8);
            }
        }
        if (arg6 == 1 || arg6 == 3) {
            if (arg5 == 0) {
                this.method1478(4194304, (byte) 49, var9, var8);
                this.method1478(67108864, (byte) 126, var9 + 1, var8 - 1);
            }
            if (arg5 == 1) {
                this.method1478(16777216, (byte) 125, var9, var8);
                this.method1478(268435456, (byte) 96, var9 + 1, var8 + 1);
            }
            if (arg5 == 2) {
                this.method1478(67108864, (byte) 119, var9, var8);
                this.method1478(4194304, (byte) 52, var9 - 1, var8 - -1);
            }
            if (arg5 == 3) {
                this.method1478(268435456, (byte) 38, var9, var8);
                this.method1478(16777216, (byte) 83, var9 - 1, var8 + -1);
            }
        }
        if (arg6 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method1478(545259520, (byte) 44, var9, var8);
            this.method1478(33554432, (byte) 107, var9, var8 - 1);
            this.method1478(134217728, (byte) 122, var9 + 1, var8);
        }
        if (arg5 == 1) {
            this.method1478(41943040, (byte) 118, var9, var8);
            this.method1478(134217728, (byte) 65, var9 + 1, var8);
            this.method1478(536870912, (byte) 89, var9, var8 + 1);
        }
        if (arg5 == 2) {
            this.method1478(167772160, (byte) 88, var9, var8);
            this.method1478(536870912, (byte) 96, var9, var8 + 1);
            this.method1478(8388608, (byte) 68, var9 - 1, var8);
        }
        if (arg5 == 3) {
            this.method1478(671088640, (byte) 101, var9, var8);
            this.method1478(8388608, (byte) 94, var9 - 1, var8);
            this.method1478(33554432, (byte) 92, var9, var8 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V", line = 341)
    public final void method1469(int arg0) {
        int var2 = 0;
        if (arg0 > -77) {
            return;
        }
        while (var2 < this.field3456) {
            for (int var3 = 0; var3 < this.field3472; var3++) {
                if (var2 == 0 || var3 == 0 || this.field3456 - 5 <= var2 || (this.field3472 - 5) <= var3) {
                    this.field3454[var2][var3] = -1;
                } else {
                    this.field3454[var2][var3] = 2097152;
                }
            }
            var2++;
        }
        field3464++;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(III)V", line = 373)
    public final void method1470(int arg0, int arg1, int arg2) {
        field3470++;
        int var4 = arg2 - this.field3469;
        int var5 = 5 % ((arg0 + 11) / 53);
        int var6 = arg1 - this.field3451;
        this.field3454[var6][var4] = class99.method612(this.field3454[var6][var4], -2097153);
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(III)V", line = 386)
    public final void method1471(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            this.method1479(-105, 115, 94);
        }
        int var4 = arg1 - this.field3469;
        int var5 = arg0 - this.field3451;
        field3463++;
        this.field3454[var5][var4] = class99.method612(this.field3454[var5][var4], -262145);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIZIIIII)Z", line = 404)
    public final boolean method1472(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3474++;
        if (arg0 == 1) {
            if (arg1 == arg7 && arg4 == arg6) {
                return true;
            }
        } else if (arg7 <= arg1 && arg0 + arg7 - 1 >= arg1 && arg4 >= arg4 && (arg4 - (1 - arg0)) >= arg4) {
            return true;
        }
        if (!arg2) {
            field3468 = -52;
        }
        int var9 = arg4 - this.field3469;
        int var10 = arg6 - this.field3469;
        int var11 = arg7 - this.field3451;
        int var12 = arg1 - this.field3451;
        if (arg0 == 1) {
            if (arg3 == 0) {
                if (arg5 == 0) {
                    if (var12 - 1 == var11 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && var9 + 1 == var10 && (this.field3454[var11][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var9 - 1) == var10 && (this.field3454[var11][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var11 == var12 && (var9 + 1) == var10) {
                        return true;
                    }
                    if ((var12 - 1) == var11 && var9 == var10 && (this.field3454[var11][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var11 && var9 == var10 && (this.field3454[var11][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if (var12 + 1 == var11 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && (var9 + 1) == var10 && (this.field3454[var11][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 - 1 == var10 && (this.field3454[var11][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var11 == var12 && var9 - 1 == var10) {
                        return true;
                    }
                    if (var12 - 1 == var11 && var9 == var10 && (this.field3454[var11][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var11 && var9 == var10 && (this.field3454[var11][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 2) {
                if (arg5 == 0) {
                    if (var12 - 1 == var11 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && var9 + 1 == var10) {
                        return true;
                    }
                    if (var12 + 1 == var11 && var9 == var10 && (this.field3454[var11][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 - 1 == var10 && (this.field3454[var11][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if ((var12 - 1) == var11 && var9 == var10 && (this.field3454[var11][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var9 + 1) == var10) {
                        return true;
                    }
                    if (var12 + 1 == var11 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && var9 - 1 == var10 && (this.field3454[var11][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if ((var12 - 1) == var11 && var9 == var10 && (this.field3454[var11][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 + 1 == var10 && (this.field3454[var11][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var11 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && (var9 - 1) == var10) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if ((var12 - 1) == var11 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && (var9 + 1) == var10 && (this.field3454[var11][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var11 && var9 == var10 && (this.field3454[var11][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 - 1 == var10) {
                        return true;
                    }
                }
            }
            if (arg3 == 9) {
                if (var11 == var12 && (var9 + 1) == var10 && (this.field3454[var11][var10] & 0x20) == 0) {
                    return true;
                }
                if (var11 == var12 && (var9 - 1) == var10 && (this.field3454[var11][var10] & 0x2) == 0) {
                    return true;
                }
                if (var12 - 1 == var11 && var9 == var10 && (this.field3454[var11][var10] & 0x8) == 0) {
                    return true;
                }
                if ((var12 + 1) == var11 && var9 == var10 && (this.field3454[var11][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg0 + var11 - 1;
            int var14 = var10 + arg0 - 1;
            if (arg3 == 0) {
                if (arg5 == 0) {
                    if ((var12 - arg0) == var11 && var10 <= var9 && var9 <= var14) {
                        return true;
                    }
                    if (var11 <= var12 && var12 <= var13 && var9 + 1 == var10 && (this.field3454[var12][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 <= var12 && var13 >= var12 && (var9 - arg0) == var10 && (this.field3454[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var12 >= var11 && var12 <= var13 && (var9 + 1) == var10) {
                        return true;
                    }
                    if (var12 - arg0 == var11 && var9 >= var10 && var9 <= var14 && (this.field3454[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var11 && var9 >= var10 && var14 >= var9 && (this.field3454[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if ((var12 + 1) == var11 && var10 <= var9 && var14 >= var9) {
                        return true;
                    }
                    if (var12 >= var11 && var12 <= var13 && (var9 + 1) == var10 && (this.field3454[var12][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 >= var11 && var12 <= var13 && var9 - arg0 == var10 && (this.field3454[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var11 <= var12 && var13 >= var12 && var9 - arg0 == var10) {
                        return true;
                    }
                    if (var12 - arg0 == var11 && var9 >= var10 && var9 <= var14 && (this.field3454[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var11 && var9 >= var10 && var14 >= var9 && (this.field3454[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 2) {
                if (arg5 == 0) {
                    if ((var12 - arg0) == var11 && var10 <= var9 && var9 <= var14) {
                        return true;
                    }
                    if (var11 <= var12 && var13 >= var12 && var9 + 1 == var10) {
                        return true;
                    }
                    if (var12 + 1 == var11 && var10 <= var9 && var9 <= var14 && (this.field3454[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var12 >= var11 && var12 <= var13 && var9 - arg0 == var10 && (this.field3454[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var12 - arg0 == var11 && var9 >= var10 && var14 >= var9 && (this.field3454[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 >= var11 && var13 >= var12 && var9 + 1 == var10) {
                        return true;
                    }
                    if ((var12 + 1) == var11 && var10 <= var9 && var14 >= var9) {
                        return true;
                    }
                    if (var11 <= var12 && var13 >= var12 && var9 - arg0 == var10 && (this.field3454[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if (var12 - arg0 == var11 && var10 <= var9 && var9 <= var14 && (this.field3454[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 <= var12 && var12 <= var13 && var9 + 1 == var10 && (this.field3454[var12][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var11 && var10 <= var9 && var14 >= var9) {
                        return true;
                    }
                    if (var11 <= var12 && var12 <= var13 && var9 - arg0 == var10) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var12 - arg0 == var11 && var9 >= var10 && var9 <= var14) {
                        return true;
                    }
                    if (var11 <= var12 && var12 <= var13 && var9 + 1 == var10 && (this.field3454[var12][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var11 && var9 >= var10 && var14 >= var9 && (this.field3454[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var12 >= var11 && var12 <= var13 && (var9 - arg0) == var10) {
                        return true;
                    }
                }
            }
            if (arg3 == 9) {
                if (var11 <= var12 && var12 <= var13 && (var9 + 1) == var10 && (this.field3454[var12][var10] & 0x2C0120) == 0) {
                    return true;
                }
                if (var12 >= var11 && var12 <= var13 && var9 - arg0 == var10 && (this.field3454[var12][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if (var12 - arg0 == var11 && var10 <= var9 && var14 >= var9 && (this.field3454[var13][var9] & 0x2C0108) == 0) {
                    return true;
                }
                if ((var12 + 1) == var11 && var10 <= var9 && var9 <= var14 && (this.field3454[var11][var9] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIIIII)Z", line = 770)
    public final boolean method1473(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3462++;
        if (arg1 == 1) {
            if (arg3 == arg7 && arg2 == arg6) {
                return true;
            }
        } else if (arg7 >= arg3 && arg7 <= arg3 + arg1 - 1 && arg6 <= arg6 && arg1 + arg6 - 1 >= arg6) {
            return true;
        }
        int var9 = arg2 - this.field3469;
        if (arg5 != 19348) {
            this.field3472 = -8;
        }
        int var10 = arg6 - this.field3469;
        int var11 = arg3 - this.field3451;
        int var12 = arg7 - this.field3451;
        if (arg1 == 1) {
            if (arg4 == 6 || arg4 == 7) {
                if (arg4 == 7) {
                    arg0 = arg0 + 2 & 0x3;
                }
                if (arg0 == 0) {
                    if ((var12 + 1) == var11 && var9 == var10 && (this.field3454[var11][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var10 - 1) == var9 && (this.field3454[var11][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if ((var12 - 1) == var11 && var9 == var10 && (this.field3454[var11][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var10 - 1 == var9 && (this.field3454[var11][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if (var12 - 1 == var11 && var9 == var10 && (this.field3454[var11][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var10 + 1 == var9 && (this.field3454[var11][var9] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var12 + 1 == var11 && var9 == var10 && (this.field3454[var11][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var10 + 1) == var9 && (this.field3454[var11][var9] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 8) {
                if (var11 == var12 && var10 + 1 == var9 && (this.field3454[var11][var9] & 0x20) == 0) {
                    return true;
                }
                if (var11 == var12 && var10 - 1 == var9 && (this.field3454[var11][var9] & 0x2) == 0) {
                    return true;
                }
                if ((var12 - 1) == var11 && var9 == var10 && (this.field3454[var11][var9] & 0x8) == 0) {
                    return true;
                }
                if ((var12 + 1) == var11 && var9 == var10 && (this.field3454[var11][var9] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg1 + var11 - 1;
            int var14 = arg1 + var9 - 1;
            if (arg4 == 6 || arg4 == 7) {
                if (arg4 == 7) {
                    arg0 = arg0 + 2 & 0x3;
                }
                if (arg0 == 0) {
                    if ((var12 + 1) == var11 && var10 >= var9 && var14 >= var10 && (this.field3454[var11][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 >= var11 && var12 <= var13 && (var10 - arg1) == var9 && (this.field3454[var12][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var12 - arg1 == var11 && var10 >= var9 && var10 <= var14 && (this.field3454[var13][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 >= var11 && var13 >= var12 && (var10 - arg1) == var9 && (this.field3454[var12][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if ((var12 - arg1) == var11 && var10 >= var9 && var10 <= var14 && (this.field3454[var13][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 <= var12 && var13 >= var12 && var10 + 1 == var9 && (this.field3454[var12][var9] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var12 + 1 == var11 && var10 >= var9 && var14 >= var10 && (this.field3454[var11][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 >= var11 && var12 <= var13 && (var10 + 1) == var9 && (this.field3454[var12][var9] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 8) {
                if (var11 <= var12 && var12 <= var13 && (var10 + 1) == var9 && (this.field3454[var12][var9] & 0x20) == 0) {
                    return true;
                }
                if (var11 <= var12 && var13 >= var12 && var10 - arg1 == var9 && (this.field3454[var12][var14] & 0x2) == 0) {
                    return true;
                }
                if ((var12 - arg1) == var11 && var9 <= var10 && var10 <= var14 && (this.field3454[var13][var10] & 0x8) == 0) {
                    return true;
                }
                if ((var12 + 1) == var11 && var9 <= var10 && var14 >= var10 && (this.field3454[var11][var10] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)V", line = 956)
    public static void method1474(int arg0) {
        field3457 = null;
        if (arg0 != 2883872) {
            field3457 = null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(III)I", line = 967)
    public static final int method1475(int arg0, int arg1, int arg2) {
        field3471++;
        if (arg2 == 4 || arg2 == 5) {
            return class367.field5044[arg1 & 0x3];
        } else if (arg0 <= 36) {
            return -16;
        } else {
            return 256;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIII)V", line = 982)
    private final void method1476(int arg0, int arg1, int arg2, int arg3) {
        field3453++;
        this.field3454[arg1][arg3] = class21.method133(this.field3454[arg1][arg3], arg2);
        if (arg0 != 0) {
            this.method1484(-93, -16, true, true, (byte) 38, -63, -117, 113);
        }
    }

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "(III)V", line = 993)
    public final void method1477(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field3469;
        int var5 = arg2 - this.field3451;
        field3459++;
        int var6 = 15 / ((arg0 - 76) / 39);
        this.field3454[var5][var4] = class21.method133(this.field3454[var5][var4], 262144);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IBII)V", line = 1012)
    private final void method1478(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 < 36) {
            method1467((class464) null, (byte) 33);
        }
        field3465++;
        this.field3454[arg3][arg2] = class99.method612(this.field3454[arg3][arg2], ~arg0);
    }

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "(III)V", line = 1027)
    public final void method1479(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field3469;
        int var5 = arg2 - this.field3451;
        field3466++;
        this.field3454[var5][var4] = class21.method133(this.field3454[var5][var4], 2097152);
        if (arg0 != 12533) {
            this.method1472(4, -125, false, -75, -80, 85, -75, 55);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIIIIIII)Z", line = 1040)
    public final boolean method1480(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3455++;
        int var11 = arg1 + arg8;
        int var12 = arg4 + arg7;
        if (arg2 != 23160) {
            method1474(4);
        }
        int var13 = arg6 + arg9;
        int var14 = arg3 + arg0;
        if (arg1 == var13 && (arg5 & 0x2) == 0) {
            int var15 = arg3 >= arg7 ? arg3 : arg7;
            int var16 = var14 <= var12 ? var14 : var12;
            while (var15 < var16) {
                if ((this.field3454[var13 - this.field3451 - 1][var15 - this.field3469] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg6 == var11 && (arg5 & 0x8) == 0) {
            int var17 = arg3 < arg7 ? arg7 : arg3;
            int var18 = var14 <= var12 ? var14 : var12;
            while (var17 < var18) {
                if ((this.field3454[arg6 - this.field3451][var17 - this.field3469] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg7 == var14 && (arg5 & 0x1) == 0) {
            int var19 = arg1 <= arg6 ? arg6 : arg1;
            int var20 = var13 <= var11 ? var13 : var11;
            while (var20 > var19) {
                if ((this.field3454[var19 - this.field3451][var14 - this.field3469 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg3 == var12 && (arg5 & 0x4) == 0) {
            int var21 = arg6 < arg1 ? arg1 : arg6;
            int var22 = var13 <= var11 ? var13 : var11;
            while (var22 > var21) {
                if ((this.field3454[var21 - this.field3451][arg3 - this.field3469] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIZIZB)V", line = 1132)
    public final void method1481(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5, byte arg6) {
        int var8 = arg2 - this.field3451;
        int var9 = arg1 - this.field3469;
        if (arg6 != 9) {
            this.field3454 = null;
        }
        field3467++;
        if (arg4 == 0) {
            if (arg0 == 0) {
                this.method1476(0, var8, 128, var9);
                this.method1476(arg6 ^ 0x9, var8 - 1, 8, var9);
            }
            if (arg0 == 1) {
                this.method1476(0, var8, 2, var9);
                this.method1476(arg6 - 9, var8, 32, var9 + 1);
            }
            if (arg0 == 2) {
                this.method1476(arg6 ^ 0x9, var8, 8, var9);
                this.method1476(arg6 ^ 0x9, var8 + 1, 128, var9);
            }
            if (arg0 == 3) {
                this.method1476(0, var8, 32, var9);
                this.method1476(0, var8, 2, var9 - 1);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg0 == 0) {
                this.method1476(0, var8, 1, var9);
                this.method1476(arg6 - 9, var8 + -1, 16, var9 + 1);
            }
            if (arg0 == 1) {
                this.method1476(0, var8, 4, var9);
                this.method1476(0, var8 + 1, 64, var9 + 1);
            }
            if (arg0 == 2) {
                this.method1476(0, var8, 16, var9);
                this.method1476(0, var8 + 1, 1, var9 - 1);
            }
            if (arg0 == 3) {
                this.method1476(0, var8, 64, var9);
                this.method1476(arg6 ^ 0x9, var8 - 1, 4, var9 - 1);
            }
        }
        if (arg4 == 2) {
            if (arg0 == 0) {
                this.method1476(arg6 - 9, var8, 130, var9);
                this.method1476(0, var8 - 1, 8, var9);
                this.method1476(0, var8, 32, var9 + 1);
            }
            if (arg0 == 1) {
                this.method1476(0, var8, 10, var9);
                this.method1476(0, var8, 32, var9 + 1);
                this.method1476(0, var8 + 1, 128, var9);
            }
            if (arg0 == 2) {
                this.method1476(0, var8, 40, var9);
                this.method1476(arg6 ^ 0x9, var8 + 1, 128, var9);
                this.method1476(0, var8, 2, var9 - 1);
            }
            if (arg0 == 3) {
                this.method1476(0, var8, 160, var9);
                this.method1476(arg6 - 9, var8, 2, var9 - 1);
                this.method1476(0, var8 - 1, 8, var9);
            }
        }
        if (arg3) {
            if (arg4 == 0) {
                if (arg0 == 0) {
                    this.method1476(0, var8, 65536, var9);
                    this.method1476(0, var8 - 1, 4096, var9);
                }
                if (arg0 == 1) {
                    this.method1476(0, var8, 1024, var9);
                    this.method1476(0, var8, 16384, var9 + 1);
                }
                if (arg0 == 2) {
                    this.method1476(0, var8, 4096, var9);
                    this.method1476(0, var8 + 1, 65536, var9);
                }
                if (arg0 == 3) {
                    this.method1476(0, var8, 16384, var9);
                    this.method1476(0, var8, 1024, var9 - 1);
                }
            }
            if (arg4 == 1 || arg4 == 3) {
                if (arg0 == 0) {
                    this.method1476(0, var8, 512, var9);
                    this.method1476(0, var8 - 1, 8192, var9 + 1);
                }
                if (arg0 == 1) {
                    this.method1476(arg6 ^ 0x9, var8, 2048, var9);
                    this.method1476(0, var8 + 1, 32768, var9 + 1);
                }
                if (arg0 == 2) {
                    this.method1476(0, var8, 8192, var9);
                    this.method1476(0, var8 + 1, 512, var9 - 1);
                }
                if (arg0 == 3) {
                    this.method1476(0, var8, 32768, var9);
                    this.method1476(0, var8 - 1, 2048, var9 - 1);
                }
            }
            if (arg4 == 2) {
                if (arg0 == 0) {
                    this.method1476(0, var8, 66560, var9);
                    this.method1476(0, var8 - 1, 4096, var9);
                    this.method1476(0, var8, 16384, var9 + 1);
                }
                if (arg0 == 1) {
                    this.method1476(0, var8, 5120, var9);
                    this.method1476(0, var8, 16384, var9 + 1);
                    this.method1476(0, var8 + 1, 65536, var9);
                }
                if (arg0 == 2) {
                    this.method1476(arg6 ^ 0x9, var8, 20480, var9);
                    this.method1476(0, var8 + 1, 65536, var9);
                    this.method1476(arg6 - 9, var8, 1024, var9 - 1);
                }
                if (arg0 == 3) {
                    this.method1476(0, var8, 81920, var9);
                    this.method1476(arg6 - 9, var8, 1024, var9 - 1);
                    this.method1476(0, var8 - 1, 4096, var9);
                }
            }
        }
        if (!arg5) {
            return;
        }
        if (arg4 == 0) {
            if (arg0 == 0) {
                this.method1476(0, var8, 536870912, var9);
                this.method1476(0, var8 - 1, 33554432, var9);
            }
            if (arg0 == 1) {
                this.method1476(0, var8, 8388608, var9);
                this.method1476(arg6 - 9, var8, 134217728, var9 + 1);
            }
            if (arg0 == 2) {
                this.method1476(0, var8, 33554432, var9);
                this.method1476(0, var8 + 1, 536870912, var9);
            }
            if (arg0 == 3) {
                this.method1476(0, var8, 134217728, var9);
                this.method1476(arg6 ^ 0x9, var8, 8388608, var9 - 1);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg0 == 0) {
                this.method1476(arg6 - 9, var8, 4194304, var9);
                this.method1476(0, var8 - 1, 67108864, var9 + 1);
            }
            if (arg0 == 1) {
                this.method1476(0, var8, 16777216, var9);
                this.method1476(arg6 ^ 0x9, var8 + 1, 268435456, var9 + 1);
            }
            if (arg0 == 2) {
                this.method1476(0, var8, 67108864, var9);
                this.method1476(arg6 - 9, var8 - -1, 4194304, var9 - 1);
            }
            if (arg0 == 3) {
                this.method1476(0, var8, 268435456, var9);
                this.method1476(arg6 ^ 0x9, var8 - 1, 16777216, var9 - 1);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method1476(arg6 - 9, var8, 545259520, var9);
            this.method1476(0, var8 - 1, 33554432, var9);
            this.method1476(0, var8, 134217728, var9 + 1);
        }
        if (arg0 == 1) {
            this.method1476(arg6 ^ 0x9, var8, 41943040, var9);
            this.method1476(0, var8, 134217728, var9 + 1);
            this.method1476(0, var8 + 1, 536870912, var9);
        }
        if (arg0 == 2) {
            this.method1476(0, var8, 167772160, var9);
            this.method1476(0, var8 + 1, 536870912, var9);
            this.method1476(0, var8, 8388608, var9 - 1);
        }
        if (arg0 == 3) {
            this.method1476(0, var8, 671088640, var9);
            this.method1476(0, var8, 8388608, var9 - 1);
            this.method1476(0, var8 - 1, 33554432, var9);
            return;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZIIZIZI)V", line = 1443)
    public final void method1482(boolean arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5, int arg6) {
        field3461++;
        int var8 = 256;
        if (arg0) {
            var8 |= 0x20000;
        }
        if (arg5) {
            field3468 = -73;
        }
        int var9 = arg4 - this.field3469;
        if (arg3) {
            var8 |= 0x40000000;
        }
        int var10 = arg2 - this.field3451;
        for (int var11 = var10; var11 < (arg6 + var10); var11++) {
            if (var11 >= 0 && var11 < this.field3456) {
                for (int var12 = var9; var12 < (arg1 + var9); var12++) {
                    if (var12 >= 0 && this.field3472 > var12) {
                        this.method1476(0, var11, var8, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIIIIII)Z", line = 1507)
    public final boolean method1483(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3460++;
        if (arg8 > 1) {
            return class27.method160(arg2, arg7, arg4, arg3, -50, arg1, arg8, arg6, arg8) ? true : this.method1480(arg2, arg3, 23160, arg4, arg8, arg0, arg1, arg7, arg8, arg6);
        }
        if (arg5 != 4321) {
            this.method1484(-104, 2, false, true, (byte) 0, 38, 111, 71);
        }
        int var10 = arg1 + arg6 - 1;
        int var11 = arg2 + arg4 - 1;
        if (arg1 <= arg3 && arg3 <= var10 && arg7 >= arg4 && arg7 <= var11) {
            return true;
        } else if ((arg1 - 1) == arg3 && arg4 <= arg7 && arg7 <= var11 && (this.field3454[arg3 - this.field3451][arg7 - this.field3469] & 0x8) == 0 && (arg0 & 0x8) == 0) {
            return true;
        } else if ((var10 + 1) == arg3 && arg4 <= arg7 && var11 >= arg7 && (this.field3454[arg3 - this.field3451][arg7 - this.field3469] & 0x80) == 0 && (arg0 & 0x2) == 0) {
            return true;
        } else if ((arg4 - 1) == arg7 && arg1 <= arg3 && var10 >= arg3 && (this.field3454[arg3 - this.field3451][arg7 - this.field3469] & 0x2) == 0 && (arg0 & 0x4) == 0) {
            return true;
        } else {
            return var11 + 1 == arg7 && arg3 >= arg1 && arg3 <= var10 && (this.field3454[arg3 - this.field3451][arg7 - this.field3469] & 0x20) == 0 && (arg0 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIZZBIII)V", line = 1559)
    public final void method1484(int arg0, int arg1, boolean arg2, boolean arg3, byte arg4, int arg5, int arg6, int arg7) {
        field3452++;
        int var9 = 256;
        if (arg3) {
            var9 |= 0x20000;
        }
        if (arg2) {
            var9 |= 0x40000000;
        }
        int var10 = arg6 - this.field3469;
        int var11 = arg5 - this.field3451;
        if (arg0 == 1 || arg0 == 3) {
            int var12 = arg1;
            arg1 = arg7;
            arg7 = var12;
        }
        int var13 = var11;
        if (arg4 > -25) {
            method1467((class464) null, (byte) 30);
        }
        while (var13 < var11 + arg1) {
            if (var13 >= 0 && var13 < this.field3456) {
                for (int var14 = var10; var14 < (var10 + arg7); var14++) {
                    if (var14 >= 0 && this.field3472 > var14) {
                        this.method1478(var9, (byte) 76, var14, var13);
                    }
                }
            }
            var13++;
        }
    }
}
