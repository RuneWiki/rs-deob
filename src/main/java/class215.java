import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class215 {

    @OriginalMember(owner = "client!bm", name = "q", descriptor = "I")
    public static int field2755 = 0;

    @OriginalMember(owner = "client!bm", name = "k", descriptor = "[[S")
    public static short[][] field2749 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "Lhb;")
    public static class250 field2741 = new class250(16, 8);

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "I")
    public int field2743;

    @OriginalMember(owner = "client!bm", name = "f", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!bm", name = "g", descriptor = "I")
    public static int field2745;

    @OriginalMember(owner = "client!bm", name = "h", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!bm", name = "i", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!bm", name = "j", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!bm", name = "l", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!bm", name = "m", descriptor = "I")
    public int field2751;

    @OriginalMember(owner = "client!bm", name = "n", descriptor = "I")
    public static int field2752;

    @OriginalMember(owner = "client!bm", name = "o", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!bm", name = "p", descriptor = "I")
    public int field2754;

    @OriginalMember(owner = "client!bm", name = "r", descriptor = "I")
    public static int field2756;

    @OriginalMember(owner = "client!bm", name = "s", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!bm", name = "t", descriptor = "I")
    public static int field2758;

    @OriginalMember(owner = "client!bm", name = "u", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!bm", name = "v", descriptor = "I")
    public static int field2760;

    @OriginalMember(owner = "client!bm", name = "w", descriptor = "I")
    public static int field2761;

    @OriginalMember(owner = "client!bm", name = "x", descriptor = "I")
    public int field2762;

    @OriginalMember(owner = "client!bm", name = "y", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!bm", name = "z", descriptor = "I")
    public static int field2764;

    @OriginalMember(owner = "client!bm", name = "A", descriptor = "I")
    public static int field2765;

    @OriginalMember(owner = "client!bm", name = "B", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "[[I")
    public int[][] field2742;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(II)V", line = 5)
    public static final void method1365(int arg0, int arg1) {
        field2758++;
        class436 var2 = class459.method2712(5, arg0, -1759243680);
        var2.method2567(16013);
        if (arg1 > -21) {
            field2741 = null;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIIIIIIII)Z", line = 18)
    public final boolean method1366(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2766++;
        int var11 = arg2 + arg5;
        int var12 = arg4 + arg8;
        if (arg0 != 0) {
            this.method1385(80, -125, -45, true, -111, false, false, 26);
        }
        int var13 = arg1 + arg6;
        int var14 = arg7 + arg9;
        if (arg2 == var13 && (arg3 & 0x2) == 0) {
            int var15 = arg7 >= arg8 ? arg7 : arg8;
            int var16 = var12 >= var14 ? var14 : var12;
            while (var15 < var16) {
                if ((this.field2742[var13 - this.field2751 - 1][var15 - this.field2754] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg1 == var11 && (arg3 & 0x8) == 0) {
            int var17 = arg8 <= arg7 ? arg7 : arg8;
            int var18 = var12 >= var14 ? var14 : var12;
            while (var17 < var18) {
                if ((this.field2742[arg1 - this.field2751][var17 - this.field2754] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg8 == var14 && (arg3 & 0x1) == 0) {
            int var19 = arg1 < arg2 ? arg2 : arg1;
            int var20 = var13 > var11 ? var11 : var13;
            while (var20 > var19) {
                if ((this.field2742[var19 - this.field2751][var14 - this.field2754 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg7 == var12 && (arg3 & 0x4) == 0) {
            int var21 = arg2 > arg1 ? arg2 : arg1;
            int var22 = var11 < var13 ? var11 : var13;
            while (var22 > var21) {
                if ((this.field2742[var21 - this.field2751][arg7 - this.field2754] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(III)I", line = 121)
    public static final int method1367(int arg0, int arg1, int arg2) {
        field2757++;
        int var3 = arg0 >>> 31;
        if (arg1 != 0) {
            field2755 = 51;
        }
        return (arg0 + var3) / arg2 - var3;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIIIIII)Z", line = 136)
    public final boolean method1368(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2744++;
        if (arg0 == 1) {
            if (arg5 == arg6 && arg2 == arg4) {
                return true;
            }
        } else if (arg5 >= arg6 && arg5 <= arg6 + arg0 - 1 && arg2 <= arg2 && arg2 <= (arg0 + arg2 - 1)) {
            return true;
        }
        int var9 = arg5 - this.field2751;
        int var10 = arg4 - this.field2754;
        if (arg1 > -2) {
            this.field2762 = -30;
        }
        int var11 = arg2 - this.field2754;
        int var12 = arg6 - this.field2751;
        if (arg0 == 1) {
            if (arg7 == 6 || arg7 == 7) {
                if (arg7 == 7) {
                    arg3 = arg3 + 2 & 0x3;
                }
                if (arg3 == 0) {
                    if ((var9 + 1) == var12 && var10 == var11 && (this.field2742[var12][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var11 - 1 == var10 && (this.field2742[var12][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var9 - 1 == var12 && var10 == var11 && (this.field2742[var12][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var11 - 1 == var10 && (this.field2742[var12][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if ((var9 - 1) == var12 && var10 == var11 && (this.field2742[var12][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var11 + 1) == var10 && (this.field2742[var12][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if ((var9 + 1) == var12 && var10 == var11 && (this.field2742[var12][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var11 + 1 == var10 && (this.field2742[var12][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg7 == 8) {
                if (var9 == var12 && (var11 + 1) == var10 && (this.field2742[var12][var10] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var12 && (var11 - 1) == var10 && (this.field2742[var12][var10] & 0x2) == 0) {
                    return true;
                }
                if (var9 - 1 == var12 && var10 == var11 && (this.field2742[var12][var10] & 0x8) == 0) {
                    return true;
                }
                if (var9 + 1 == var12 && var10 == var11 && (this.field2742[var12][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg0 + var12 - 1;
            int var14 = var10 + arg0 - 1;
            if (arg7 == 6 || arg7 == 7) {
                if (arg7 == 7) {
                    arg3 = arg3 + 2 & 0x3;
                }
                if (arg3 == 0) {
                    if (var9 + 1 == var12 && var11 >= var10 && var14 >= var11 && (this.field2742[var12][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 <= var9 && var13 >= var9 && var11 - arg0 == var10 && (this.field2742[var9][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var9 - arg0 == var12 && var10 <= var11 && var11 <= var14 && (this.field2742[var13][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 <= var9 && var13 >= var9 && (var11 - arg0) == var10 && (this.field2742[var9][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if ((var9 - arg0) == var12 && var11 >= var10 && var14 >= var11 && (this.field2742[var13][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 >= var12 && var13 >= var9 && (var11 + 1) == var10 && (this.field2742[var9][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var9 + 1 == var12 && var10 <= var11 && var14 >= var11 && (this.field2742[var12][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 >= var12 && var13 >= var9 && var11 + 1 == var10 && (this.field2742[var9][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg7 == 8) {
                if (var12 <= var9 && var13 >= var9 && (var11 + 1) == var10 && (this.field2742[var9][var10] & 0x20) == 0) {
                    return true;
                }
                if (var12 <= var9 && var13 >= var9 && (var11 - arg0) == var10 && (this.field2742[var9][var14] & 0x2) == 0) {
                    return true;
                }
                if (var9 - arg0 == var12 && var11 >= var10 && var11 <= var14 && (this.field2742[var13][var11] & 0x8) == 0) {
                    return true;
                }
                if (var9 + 1 == var12 && var10 <= var11 && var11 <= var14 && (this.field2742[var12][var11] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(II)Z", line = 327)
    public static final boolean method1369(int arg0, int arg1) {
        field2739++;
        if (arg0 == 6 || arg0 == 2 || arg0 == 57 || arg0 == 48 || arg0 == 1007) {
            return true;
        } else if (arg0 == 5 || arg0 == 1004) {
            return true;
        } else {
            int var2 = -63 / ((arg1 - 27) / 60);
            return false;
        }
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(III)V", line = 343)
    public final void method1370(int arg0, int arg1, int arg2) {
        if (arg0 != -1) {
            this.field2742 = null;
        }
        int var4 = arg1 - this.field2751;
        int var5 = arg2 - this.field2754;
        field2756++;
        this.field2742[var4][var5] = class60.method339(this.field2742[var4][var5], -262145);
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIBIIZZ)V", line = 356)
    public final void method1371(int arg0, int arg1, byte arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        if (arg2 > -104) {
            this.field2762 = -34;
        }
        int var8 = arg3 - this.field2751;
        int var9 = arg4 - this.field2754;
        field2759++;
        if (arg0 == 0) {
            if (arg1 == 0) {
                this.method1384(123, var9, 128, var8);
                this.method1384(127, var9, 8, var8 - 1);
            }
            if (arg1 == 1) {
                this.method1384(123, var9, 2, var8);
                this.method1384(126, var9 + 1, 32, var8);
            }
            if (arg1 == 2) {
                this.method1384(124, var9, 8, var8);
                this.method1384(123, var9, 128, var8 + 1);
            }
            if (arg1 == 3) {
                this.method1384(-106, var9, 32, var8);
                this.method1384(-58, var9 - 1, 2, var8);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg1 == 0) {
                this.method1384(125, var9, 1, var8);
                this.method1384(36, var9 + 1, 16, var8 - 1);
            }
            if (arg1 == 1) {
                this.method1384(-36, var9, 4, var8);
                this.method1384(127, var9 + 1, 64, var8 + 1);
            }
            if (arg1 == 2) {
                this.method1384(-88, var9, 16, var8);
                this.method1384(-44, var9 - 1, 1, var8 + 1);
            }
            if (arg1 == 3) {
                this.method1384(12, var9, 64, var8);
                this.method1384(126, var9 - 1, 4, var8 - 1);
            }
        }
        if (arg0 == 2) {
            if (arg1 == 0) {
                this.method1384(-65, var9, 130, var8);
                this.method1384(-47, var9, 8, var8 - 1);
                this.method1384(126, var9 + 1, 32, var8);
            }
            if (arg1 == 1) {
                this.method1384(-78, var9, 10, var8);
                this.method1384(-120, var9 + 1, 32, var8);
                this.method1384(-90, var9, 128, var8 + 1);
            }
            if (arg1 == 2) {
                this.method1384(14, var9, 40, var8);
                this.method1384(-123, var9, 128, var8 + 1);
                this.method1384(-94, var9 - 1, 2, var8);
            }
            if (arg1 == 3) {
                this.method1384(123, var9, 160, var8);
                this.method1384(-106, var9 - 1, 2, var8);
                this.method1384(-95, var9, 8, var8 - 1);
            }
        }
        if (arg5) {
            if (arg0 == 0) {
                if (arg1 == 0) {
                    this.method1384(123, var9, 65536, var8);
                    this.method1384(126, var9, 4096, var8 - 1);
                }
                if (arg1 == 1) {
                    this.method1384(122, var9, 1024, var8);
                    this.method1384(122, var9 + 1, 16384, var8);
                }
                if (arg1 == 2) {
                    this.method1384(-26, var9, 4096, var8);
                    this.method1384(-89, var9, 65536, var8 + 1);
                }
                if (arg1 == 3) {
                    this.method1384(127, var9, 16384, var8);
                    this.method1384(123, var9 - 1, 1024, var8);
                }
            }
            if (arg0 == 1 || arg0 == 3) {
                if (arg1 == 0) {
                    this.method1384(12, var9, 512, var8);
                    this.method1384(19, var9 + 1, 8192, var8 - 1);
                }
                if (arg1 == 1) {
                    this.method1384(125, var9, 2048, var8);
                    this.method1384(126, var9 + 1, 32768, var8 + 1);
                }
                if (arg1 == 2) {
                    this.method1384(125, var9, 8192, var8);
                    this.method1384(6, var9 - 1, 512, var8 + 1);
                }
                if (arg1 == 3) {
                    this.method1384(124, var9, 32768, var8);
                    this.method1384(-100, var9 - 1, 2048, var8 - 1);
                }
            }
            if (arg0 == 2) {
                if (arg1 == 0) {
                    this.method1384(126, var9, 66560, var8);
                    this.method1384(11, var9, 4096, var8 - 1);
                    this.method1384(124, var9 + 1, 16384, var8);
                }
                if (arg1 == 1) {
                    this.method1384(126, var9, 5120, var8);
                    this.method1384(123, var9 + 1, 16384, var8);
                    this.method1384(122, var9, 65536, var8 + 1);
                }
                if (arg1 == 2) {
                    this.method1384(122, var9, 20480, var8);
                    this.method1384(123, var9, 65536, var8 + 1);
                    this.method1384(-64, var9 - 1, 1024, var8);
                }
                if (arg1 == 3) {
                    this.method1384(123, var9, 81920, var8);
                    this.method1384(12, var9 - 1, 1024, var8);
                    this.method1384(124, var9, 4096, var8 - 1);
                }
            }
        }
        if (!arg6) {
            return;
        }
        if (arg0 == 0) {
            if (arg1 == 0) {
                this.method1384(124, var9, 536870912, var8);
                this.method1384(124, var9, 33554432, var8 - 1);
            }
            if (arg1 == 1) {
                this.method1384(-59, var9, 8388608, var8);
                this.method1384(3, var9 + 1, 134217728, var8);
            }
            if (arg1 == 2) {
                this.method1384(35, var9, 33554432, var8);
                this.method1384(-102, var9, 536870912, var8 + 1);
            }
            if (arg1 == 3) {
                this.method1384(123, var9, 134217728, var8);
                this.method1384(-108, var9 - 1, 8388608, var8);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg1 == 0) {
                this.method1384(123, var9, 4194304, var8);
                this.method1384(125, var9 + 1, 67108864, var8 - 1);
            }
            if (arg1 == 1) {
                this.method1384(-42, var9, 16777216, var8);
                this.method1384(39, var9 + 1, 268435456, var8 + 1);
            }
            if (arg1 == 2) {
                this.method1384(126, var9, 67108864, var8);
                this.method1384(125, var9 - 1, 4194304, var8 + 1);
            }
            if (arg1 == 3) {
                this.method1384(124, var9, 268435456, var8);
                this.method1384(127, var9 - 1, 16777216, var8 - 1);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method1384(-6, var9, 545259520, var8);
            this.method1384(-43, var9, 33554432, var8 - 1);
            this.method1384(127, var9 + 1, 134217728, var8);
        }
        if (arg1 == 1) {
            this.method1384(127, var9, 41943040, var8);
            this.method1384(125, var9 + 1, 134217728, var8);
            this.method1384(-11, var9, 536870912, var8 + 1);
        }
        if (arg1 == 2) {
            this.method1384(36, var9, 167772160, var8);
            this.method1384(-21, var9, 536870912, var8 + 1);
            this.method1384(122, var9 - 1, 8388608, var8);
        }
        if (arg1 == 3) {
            this.method1384(-91, var9, 671088640, var8);
            this.method1384(-67, var9 - 1, 8388608, var8);
            this.method1384(35, var9, 33554432, var8 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIIIIZII)Z", line = 665)
    public final boolean method1372(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8) {
        field2764++;
        if (arg7 > 1) {
            return class127.method806(arg4, (byte) 81, arg0, arg5, arg8, arg7, arg2, arg7, arg3) ? true : this.method1366(0, arg4, arg2, arg1, arg7, arg7, arg5, arg0, arg3, arg8);
        }
        if (!arg6) {
            field2741 = null;
        }
        int var10 = arg4 + arg5 - 1;
        int var11 = arg0 + arg8 - 1;
        if (arg4 <= arg2 && arg2 <= var10 && arg3 >= arg0 && var11 >= arg3) {
            return true;
        } else if (arg4 - 1 == arg2 && arg3 >= arg0 && arg3 <= var11 && (this.field2742[arg2 - this.field2751][arg3 - this.field2754] & 0x8) == 0 && (arg1 & 0x8) == 0) {
            return true;
        } else if (var10 + 1 == arg2 && arg3 >= arg0 && arg3 <= var11 && (this.field2742[arg2 - this.field2751][arg3 - this.field2754] & 0x80) == 0 && (arg1 & 0x2) == 0) {
            return true;
        } else if ((arg0 - 1) == arg3 && arg4 <= arg2 && arg2 <= var10 && (this.field2742[arg2 - this.field2751][arg3 - this.field2754] & 0x2) == 0 && (arg1 & 0x4) == 0) {
            return true;
        } else {
            return var11 + 1 == arg3 && arg4 <= arg2 && var10 >= arg2 && (this.field2742[arg2 - this.field2751][arg3 - this.field2754] & 0x20) == 0 && (arg1 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIII)V", line = 710)
    private final void method1373(int arg0, int arg1, int arg2, int arg3) {
        this.field2742[arg1][arg2] = class31.method213(this.field2742[arg1][arg2], arg3);
        field2748++;
        int var5 = -32 % ((arg0 + 62) / 43);
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)V", line = 723)
    public final void method1374(int arg0) {
        field2760++;
        for (int var2 = 0; var2 < this.field2743; var2++) {
            for (int var3 = 0; var3 < this.field2762; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= this.field2743 - 5 || var3 >= (this.field2762 - 5)) {
                    this.field2742[var2][var3] = -1;
                } else {
                    this.field2742[var2][var3] = 2097152;
                }
            }
        }
        if (arg0 != -5) {
            field2749 = null;
        }
    }

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "(III)V", line = 756)
    public final void method1375(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field2751;
        field2750++;
        int var5 = 2 % ((61 - arg1) / 43);
        int var6 = arg2 - this.field2754;
        this.field2742[var4][var6] = class60.method339(this.field2742[var4][var6], -2097153);
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(I)V", line = 768)
    public static final void method1376(int arg0) {
        class338.field4326 = null;
        class458.field6395 = false;
        if (arg0 != 1) {
            method1365(10, -97);
        }
        field2761++;
        class218.method1396((byte) 110);
    }

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "(III)V", line = 782)
    public final void method1377(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field2751;
        int var5 = arg0 - this.field2754;
        if (arg2 >= -79) {
            this.field2754 = 6;
        }
        field2763++;
        this.field2742[var4][var5] = class31.method213(this.field2742[var4][var5], 262144);
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IZIZIII)V", line = 799)
    public final void method1378(int arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field2765++;
        int var8 = 256;
        if (arg3) {
            var8 |= 0x20000;
        }
        int var9 = arg2 - this.field2751;
        if (arg1) {
            var8 |= 0x40000000;
        }
        int var10 = arg0 - this.field2754;
        if (arg4 != -837) {
            method1367(97, 78, 103);
        }
        for (int var11 = var9; var11 < var9 + arg5; var11++) {
            if (var11 >= 0 && var11 < this.field2743) {
                for (int var12 = var10; var12 < (var10 + arg6); var12++) {
                    if (var12 >= 0 && var12 < this.field2762) {
                        this.method1373(-112, var11, var12, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "(I)V", line = 848)
    public static void method1379(int arg0) {
        field2741 = null;
        if (arg0 != -30762) {
            field2755 = 3;
        }
        field2749 = null;
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(IIIIIIII)Z", line = 859)
    public final boolean method1380(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2752++;
        if (arg5 == 1) {
            if (arg1 == arg6 && arg3 == arg7) {
                return true;
            }
        } else if (arg1 >= arg6 && arg1 <= arg6 + arg5 - 1 && arg7 <= arg7 && arg7 <= (arg5 + arg7 - 1)) {
            return true;
        }
        if (arg4 != 5810) {
            this.field2762 = -54;
        }
        int var9 = arg1 - this.field2751;
        int var10 = arg3 - this.field2754;
        int var11 = arg6 - this.field2751;
        int var12 = arg7 - this.field2754;
        if (arg5 == 1) {
            if (arg0 == 0) {
                if (arg2 == 0) {
                    if (var9 - 1 == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var12 + 1) == var10 && (this.field2742[var11][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 - 1) == var10 && (this.field2742[var11][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var9 == var11 && var12 + 1 == var10) {
                        return true;
                    }
                    if ((var9 - 1) == var11 && var10 == var12 && (this.field2742[var11][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 == var12 && (this.field2742[var11][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if ((var9 + 1) == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var12 + 1) == var10 && (this.field2742[var11][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var12 - 1 == var10 && (this.field2742[var11][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var9 == var11 && (var12 - 1) == var10) {
                        return true;
                    }
                    if ((var9 - 1) == var11 && var10 == var12 && (this.field2742[var11][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var10 == var12 && (this.field2742[var11][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 2) {
                if (arg2 == 0) {
                    if ((var9 - 1) == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var12 + 1) == var10) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 == var12 && (this.field2742[var11][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var12 - 1 == var10 && (this.field2742[var11][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if ((var9 - 1) == var11 && var10 == var12 && (this.field2742[var11][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 + 1) == var10) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var12 - 1 == var10 && (this.field2742[var11][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if (var9 - 1 == var11 && var10 == var12 && (this.field2742[var11][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 + 1) == var10 && (this.field2742[var11][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var12 - 1 == var10) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var9 - 1 == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var12 + 1) == var10 && (this.field2742[var11][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var10 == var12 && (this.field2742[var11][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var12 - 1 == var10) {
                        return true;
                    }
                }
            }
            if (arg0 == 9) {
                if (var9 == var11 && (var12 + 1) == var10 && (this.field2742[var11][var10] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var11 && (var12 - 1) == var10 && (this.field2742[var11][var10] & 0x2) == 0) {
                    return true;
                }
                if (var9 - 1 == var11 && var10 == var12 && (this.field2742[var11][var10] & 0x8) == 0) {
                    return true;
                }
                if (var9 + 1 == var11 && var10 == var12 && (this.field2742[var11][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg5 + var11 - 1;
            int var14 = var10 + arg5 - 1;
            if (arg0 == 0) {
                if (arg2 == 0) {
                    if ((var9 - arg5) == var11 && var10 <= var12 && var14 >= var12) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var13 && var12 + 1 == var10 && (this.field2742[var9][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var9 <= var13 && (var12 - arg5) == var10 && (this.field2742[var9][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var9 >= var11 && var13 >= var9 && (var12 + 1) == var10) {
                        return true;
                    }
                    if (var9 - arg5 == var11 && var10 <= var12 && var14 >= var12 && (this.field2742[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var10 <= var12 && var14 >= var12 && (this.field2742[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if (var9 + 1 == var11 && var10 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var13 && (var12 + 1) == var10 && (this.field2742[var9][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var9 <= var13 && var12 - arg5 == var10 && (this.field2742[var9][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var9 >= var11 && var9 <= var13 && var12 - arg5 == var10) {
                        return true;
                    }
                    if (var9 - arg5 == var11 && var12 >= var10 && var12 <= var14 && (this.field2742[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var10 <= var12 && var12 <= var14 && (this.field2742[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 2) {
                if (arg2 == 0) {
                    if (var9 - arg5 == var11 && var12 >= var10 && var14 >= var12) {
                        return true;
                    }
                    if (var9 >= var11 && var13 >= var9 && (var12 + 1) == var10) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 <= var12 && var12 <= var14 && (this.field2742[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var13 && (var12 - arg5) == var10 && (this.field2742[var9][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var9 - arg5 == var11 && var12 >= var10 && var14 >= var12 && (this.field2742[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 >= var11 && var13 >= var9 && var12 + 1 == var10) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var12 >= var10 && var12 <= var14) {
                        return true;
                    }
                    if (var9 >= var11 && var13 >= var9 && (var12 - arg5) == var10 && (this.field2742[var9][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if ((var9 - arg5) == var11 && var12 >= var10 && var12 <= var14 && (this.field2742[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var13 >= var9 && (var12 + 1) == var10 && (this.field2742[var9][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var12 >= var10 && var14 >= var12) {
                        return true;
                    }
                    if (var9 >= var11 && var13 >= var9 && (var12 - arg5) == var10) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var9 - arg5 == var11 && var12 >= var10 && var14 >= var12) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var13 && var12 + 1 == var10 && (this.field2742[var9][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var10 <= var12 && var12 <= var14 && (this.field2742[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var13 >= var9 && var12 - arg5 == var10) {
                        return true;
                    }
                }
            }
            if (arg0 == 9) {
                if (var11 <= var9 && var9 <= var13 && (var12 + 1) == var10 && (this.field2742[var9][var10] & 0x2C0120) == 0) {
                    return true;
                }
                if (var9 >= var11 && var9 <= var13 && (var12 - arg5) == var10 && (this.field2742[var9][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if ((var9 - arg5) == var11 && var10 <= var12 && var14 >= var12 && (this.field2742[var13][var12] & 0x2C0108) == 0) {
                    return true;
                }
                if (var9 + 1 == var11 && var10 <= var12 && var14 >= var12 && (this.field2742[var11][var12] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "(III)V", line = 1232)
    public final void method1381(int arg0, int arg1, int arg2) {
        field2746++;
        int var4 = -40 % ((arg1 + 63) / 37);
        int var5 = arg2 - this.field2754;
        int var6 = arg0 - this.field2751;
        this.field2742[var6][var5] = class31.method213(this.field2742[var6][var5], 2097152);
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIILbm;IIIIIZI)Z", line = 1245)
    public static final boolean method1382(int arg0, int arg1, int arg2, class215 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        field2747++;
        int var11 = arg6;
        int var12 = arg7;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg6 - var13;
        if (!arg9) {
            field2741 = null;
        }
        int var16 = arg7 - var14;
        class374.field4867[var13][var14] = 99;
        class258.field3262[var13][var14] = 0;
        byte var17 = 0;
        class460.field6423[var17] = arg6;
        int var18 = 0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class394.field5145[var10001] = arg7;
        int[][] var19 = arg3.field2742;
        while (var26 != var18) {
            var12 = class394.field5145[var18];
            var11 = class460.field6423[var18];
            int var20 = var11 - arg3.field2751;
            int var21 = var11 - var15;
            int var22 = var12 - var16;
            int var23 = var12 - arg3.field2754;
            var18 = var18 + 1 & 0xFFF;
            if (arg1 == -4) {
                if (arg4 == var11 && arg5 == var12) {
                    class328.field4213 = var12;
                    class482.field7025 = var11;
                    return true;
                }
            } else if (arg1 == -3) {
                if (class127.method806(arg4, (byte) 81, arg5, arg0, arg10, 1, var11, 1, var12)) {
                    class328.field4213 = var12;
                    class482.field7025 = var11;
                    return true;
                }
            } else if (arg1 == -2) {
                if (arg3.method1366(0, arg4, var11, arg2, 1, 1, arg0, arg5, var12, arg10)) {
                    class328.field4213 = var12;
                    class482.field7025 = var11;
                    return true;
                }
            } else if (arg1 == -1) {
                if (arg3.method1372(arg5, arg2, var11, var12, arg4, arg0, true, 1, arg10)) {
                    class482.field7025 = var11;
                    class328.field4213 = var12;
                    return true;
                }
            } else if (arg1 == 0 || arg1 == 1 || arg1 == 2 || arg1 == 3 || arg1 == 9) {
                if (arg3.method1380(arg1, arg4, arg8, var12, 5810, 1, var11, arg5)) {
                    class482.field7025 = var11;
                    class328.field4213 = var12;
                    return true;
                }
            } else if (arg3.method1368(1, -17, arg5, arg8, var12, arg4, var11, arg1)) {
                class482.field7025 = var11;
                class328.field4213 = var12;
                return true;
            }
            int var25 = class258.field3262[var21][var22] + 1;
            if (var21 > 0 && class374.field4867[var21 - 1][var22] == 0 && (var19[var20 - 1][var23] & 0x42240000) == 0) {
                class460.field6423[var26] = var11 - 1;
                class394.field5145[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class374.field4867[var21 - 1][var22] = 2;
                class258.field3262[var21 - 1][var22] = var25;
            }
            if (var21 < 127 && class374.field4867[var21 + 1][var22] == 0 && (var19[var20 + 1][var23] & 0x60240000) == 0) {
                class460.field6423[var26] = var11 + 1;
                class394.field5145[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class374.field4867[var21 + 1][var22] = 8;
                class258.field3262[var21 + 1][var22] = var25;
            }
            if (var22 > 0 && class374.field4867[var21][var22 - 1] == 0 && (var19[var20][var23 - 1] & 0x40A40000) == 0) {
                class460.field6423[var26] = var11;
                class394.field5145[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class374.field4867[var21][var22 - 1] = 1;
                class258.field3262[var21][var22 - 1] = var25;
            }
            if (var22 < 127 && class374.field4867[var21][var22 + 1] == 0 && (var19[var20][var23 + 1] & 0x48240000) == 0) {
                class460.field6423[var26] = var11;
                class394.field5145[var26] = var12 + 1;
                class374.field4867[var21][var22 + 1] = 4;
                var26 = var26 + 1 & 0xFFF;
                class258.field3262[var21][var22 + 1] = var25;
            }
            if (var21 > 0 && var22 > 0 && class374.field4867[var21 - 1][var22 - 1] == 0 && (var19[var20 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var20 - 1][var23] & 0x42240000) == 0 && (var19[var20][var23 - 1] & 0x40A40000) == 0) {
                class460.field6423[var26] = var11 - 1;
                class394.field5145[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class374.field4867[var21 - 1][var22 - 1] = 3;
                class258.field3262[var21 - 1][var22 - 1] = var25;
            }
            if (var21 < 127 && var22 > 0 && class374.field4867[var21 + 1][var22 - 1] == 0 && (var19[var20 + 1][var23 - 1] & 0x60E40000) == 0 && (var19[var20 + 1][var23] & 0x60240000) == 0 && (var19[var20][var23 - 1] & 0x40A40000) == 0) {
                class460.field6423[var26] = var11 + 1;
                class394.field5145[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class374.field4867[var21 + 1][var22 - 1] = 9;
                class258.field3262[var21 + 1][var22 - 1] = var25;
            }
            if (var21 > 0 && var22 < 127 && class374.field4867[var21 - 1][var22 + 1] == 0 && (var19[var20 - 1][var23 + 1] & 0x4E240000) == 0 && (var19[var20 - 1][var23] & 0x42240000) == 0 && (var19[var20][var23 + 1] & 0x48240000) == 0) {
                class460.field6423[var26] = var11 - 1;
                class394.field5145[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class374.field4867[var21 - 1][var22 + 1] = 6;
                class258.field3262[var21 - 1][var22 + 1] = var25;
            }
            if (var21 < 127 && var22 < 127 && class374.field4867[var21 + 1][var22 + 1] == 0 && (var19[var20 + 1][var23 + 1] & 0x78240000) == 0 && (var19[var20 + 1][var23] & 0x60240000) == 0 && (var19[var20][var23 + 1] & 0x48240000) == 0) {
                class460.field6423[var26] = var11 + 1;
                class394.field5145[var26] = var12 + 1;
                class374.field4867[var21 + 1][var22 + 1] = 12;
                var26 = var26 + 1 & 0xFFF;
                class258.field3262[var21 + 1][var22 + 1] = var25;
            }
        }
        class482.field7025 = var11;
        class328.field4213 = var12;
        return false;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(ZBIIZII)V", line = 1500)
    public final void method1383(boolean arg0, byte arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field2745++;
        int var8 = arg5 - this.field2754;
        int var9 = arg2 - this.field2751;
        if (arg6 == 0) {
            if (arg3 == 0) {
                this.method1373(-118, var9, var8, 128);
                this.method1373(-120, var9 - 1, var8, 8);
            }
            if (arg3 == 1) {
                this.method1373(97, var9, var8, 2);
                this.method1373(-126, var9, var8 + 1, 32);
            }
            if (arg3 == 2) {
                this.method1373(-122, var9, var8, 8);
                this.method1373(-123, var9 + 1, var8, 128);
            }
            if (arg3 == 3) {
                this.method1373(106, var9, var8, 32);
                this.method1373(112, var9, var8 - 1, 2);
            }
        }
        if (arg6 == 1 || arg6 == 3) {
            if (arg3 == 0) {
                this.method1373(126, var9, var8, 1);
                this.method1373(29, var9 - 1, var8 - -1, 16);
            }
            if (arg3 == 1) {
                this.method1373(21, var9, var8, 4);
                this.method1373(-117, var9 + 1, var8 + 1, 64);
            }
            if (arg3 == 2) {
                this.method1373(-121, var9, var8, 16);
                this.method1373(-115, var9 + 1, var8 + -1, 1);
            }
            if (arg3 == 3) {
                this.method1373(119, var9, var8, 64);
                this.method1373(65, var9 - 1, var8 - 1, 4);
            }
        }
        if (arg6 == 2) {
            if (arg3 == 0) {
                this.method1373(33, var9, var8, 130);
                this.method1373(102, var9 - 1, var8, 8);
                this.method1373(41, var9, var8 + 1, 32);
            }
            if (arg3 == 1) {
                this.method1373(-110, var9, var8, 10);
                this.method1373(-115, var9, var8 + 1, 32);
                this.method1373(-117, var9 + 1, var8, 128);
            }
            if (arg3 == 2) {
                this.method1373(-111, var9, var8, 40);
                this.method1373(-109, var9 + 1, var8, 128);
                this.method1373(91, var9, var8 - 1, 2);
            }
            if (arg3 == 3) {
                this.method1373(97, var9, var8, 160);
                this.method1373(-121, var9, var8 - 1, 2);
                this.method1373(21, var9 - 1, var8, 8);
            }
        }
        if (arg4) {
            if (arg6 == 0) {
                if (arg3 == 0) {
                    this.method1373(-119, var9, var8, 65536);
                    this.method1373(-111, var9 - 1, var8, 4096);
                }
                if (arg3 == 1) {
                    this.method1373(-119, var9, var8, 1024);
                    this.method1373(18, var9, var8 + 1, 16384);
                }
                if (arg3 == 2) {
                    this.method1373(103, var9, var8, 4096);
                    this.method1373(100, var9 + 1, var8, 65536);
                }
                if (arg3 == 3) {
                    this.method1373(54, var9, var8, 16384);
                    this.method1373(-116, var9, var8 - 1, 1024);
                }
            }
            if (arg6 == 1 || arg6 == 3) {
                if (arg3 == 0) {
                    this.method1373(10, var9, var8, 512);
                    this.method1373(33, var9 - 1, var8 - -1, 8192);
                }
                if (arg3 == 1) {
                    this.method1373(-126, var9, var8, 2048);
                    this.method1373(23, var9 + 1, var8 + 1, 32768);
                }
                if (arg3 == 2) {
                    this.method1373(122, var9, var8, 8192);
                    this.method1373(-119, var9 + 1, var8 + -1, 512);
                }
                if (arg3 == 3) {
                    this.method1373(109, var9, var8, 32768);
                    this.method1373(25, var9 - 1, var8 - 1, 2048);
                }
            }
            if (arg6 == 2) {
                if (arg3 == 0) {
                    this.method1373(52, var9, var8, 66560);
                    this.method1373(23, var9 - 1, var8, 4096);
                    this.method1373(-105, var9, var8 + 1, 16384);
                }
                if (arg3 == 1) {
                    this.method1373(127, var9, var8, 5120);
                    this.method1373(-113, var9, var8 + 1, 16384);
                    this.method1373(-8, var9 + 1, var8, 65536);
                }
                if (arg3 == 2) {
                    this.method1373(116, var9, var8, 20480);
                    this.method1373(63, var9 + 1, var8, 65536);
                    this.method1373(59, var9, var8 - 1, 1024);
                }
                if (arg3 == 3) {
                    this.method1373(90, var9, var8, 81920);
                    this.method1373(-6, var9, var8 - 1, 1024);
                    this.method1373(37, var9 - 1, var8, 4096);
                }
            }
        }
        if (arg0) {
            if (arg6 == 0) {
                if (arg3 == 0) {
                    this.method1373(14, var9, var8, 536870912);
                    this.method1373(32, var9 - 1, var8, 33554432);
                }
                if (arg3 == 1) {
                    this.method1373(-108, var9, var8, 8388608);
                    this.method1373(-12, var9, var8 + 1, 134217728);
                }
                if (arg3 == 2) {
                    this.method1373(-105, var9, var8, 33554432);
                    this.method1373(35, var9 + 1, var8, 536870912);
                }
                if (arg3 == 3) {
                    this.method1373(39, var9, var8, 134217728);
                    this.method1373(38, var9, var8 - 1, 8388608);
                }
            }
            if (arg6 == 1 || arg6 == 3) {
                if (arg3 == 0) {
                    this.method1373(-113, var9, var8, 4194304);
                    this.method1373(-116, var9 - 1, var8 + 1, 67108864);
                }
                if (arg3 == 1) {
                    this.method1373(32, var9, var8, 16777216);
                    this.method1373(103, var9 + 1, var8 - -1, 268435456);
                }
                if (arg3 == 2) {
                    this.method1373(15, var9, var8, 67108864);
                    this.method1373(53, var9 + 1, var8 + -1, 4194304);
                }
                if (arg3 == 3) {
                    this.method1373(-108, var9, var8, 268435456);
                    this.method1373(-19, var9 - 1, var8 + -1, 16777216);
                }
            }
            if (arg6 == 2) {
                if (arg3 == 0) {
                    this.method1373(-124, var9, var8, 545259520);
                    this.method1373(-121, var9 - 1, var8, 33554432);
                    this.method1373(-16, var9, var8 + 1, 134217728);
                }
                if (arg3 == 1) {
                    this.method1373(109, var9, var8, 41943040);
                    this.method1373(62, var9, var8 + 1, 134217728);
                    this.method1373(-105, var9 + 1, var8, 536870912);
                }
                if (arg3 == 2) {
                    this.method1373(-113, var9, var8, 167772160);
                    this.method1373(-118, var9 + 1, var8, 536870912);
                    this.method1373(-107, var9, var8 - 1, 8388608);
                }
                if (arg3 == 3) {
                    this.method1373(26, var9, var8, 671088640);
                    this.method1373(2, var9, var8 - 1, 8388608);
                    this.method1373(92, var9 - 1, var8, 33554432);
                }
            }
        }
        if (arg1 > -109) {
            this.field2762 = -105;
        }
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(IIII)V", line = 1816)
    private final void method1384(int arg0, int arg1, int arg2, int arg3) {
        this.field2742[arg3][arg1] = class60.method339(this.field2742[arg3][arg1], ~arg2);
        field2753++;
        int var5 = -72 % ((arg0 - 81) / 41);
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIZIZZI)V", line = 1838)
    public final void method1385(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5, boolean arg6, int arg7) {
        field2740++;
        int var9 = 256;
        if (arg5) {
            var9 |= 0x20000;
        }
        if (arg7 == 1 || arg7 == 3) {
            int var10 = arg0;
            arg0 = arg2;
            arg2 = var10;
        }
        int var11 = arg4 - this.field2754;
        int var12 = arg1 - this.field2751;
        if (arg3) {
            method1365(6, 115);
        }
        if (arg6) {
            var9 |= 0x40000000;
        }
        for (int var13 = var12; var13 < arg0 + var12; var13++) {
            if (var13 >= 0 && this.field2743 > var13) {
                for (int var14 = var11; var14 < (arg2 + var11); var14++) {
                    if (var14 >= 0 && var14 < this.field2762) {
                        this.method1384(-123, var14, var9, var13);
                    }
                }
            }
        }
    }
}
