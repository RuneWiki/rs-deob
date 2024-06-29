import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class438 {

    @OriginalMember(owner = "client!qs", name = "f", descriptor = "I")
    public static int field6400 = 0;

    @OriginalMember(owner = "client!qs", name = "d", descriptor = "Z")
    public static boolean field6398 = false;

    @OriginalMember(owner = "client!qs", name = "z", descriptor = "[[I")
    public static int[][] field6420 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!qs", name = "A", descriptor = "[Lki;")
    public static class93[] field6421 = new class93[50];

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "I")
    public static int field6395;

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "I")
    public static int field6396;

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "I")
    public int field6397;

    @OriginalMember(owner = "client!qs", name = "e", descriptor = "I")
    public static int field6399;

    @OriginalMember(owner = "client!qs", name = "g", descriptor = "I")
    public static int field6401;

    @OriginalMember(owner = "client!qs", name = "h", descriptor = "I")
    public static int field6402;

    @OriginalMember(owner = "client!qs", name = "i", descriptor = "I")
    public static int field6403;

    @OriginalMember(owner = "client!qs", name = "j", descriptor = "I")
    public static int field6404;

    @OriginalMember(owner = "client!qs", name = "k", descriptor = "I")
    public static int field6405;

    @OriginalMember(owner = "client!qs", name = "l", descriptor = "I")
    public static int field6406;

    @OriginalMember(owner = "client!qs", name = "m", descriptor = "I")
    public static int field6407;

    @OriginalMember(owner = "client!qs", name = "n", descriptor = "I")
    public static int field6408;

    @OriginalMember(owner = "client!qs", name = "o", descriptor = "I")
    public static int field6409;

    @OriginalMember(owner = "client!qs", name = "p", descriptor = "I")
    public static int field6410;

    @OriginalMember(owner = "client!qs", name = "q", descriptor = "I")
    public static int field6411;

    @OriginalMember(owner = "client!qs", name = "r", descriptor = "I")
    public static int field6412;

    @OriginalMember(owner = "client!qs", name = "s", descriptor = "I")
    public static int field6413;

    @OriginalMember(owner = "client!qs", name = "t", descriptor = "I")
    public static int field6414;

    @OriginalMember(owner = "client!qs", name = "u", descriptor = "I")
    public int field6415;

    @OriginalMember(owner = "client!qs", name = "v", descriptor = "I")
    public static int field6416;

    @OriginalMember(owner = "client!qs", name = "w", descriptor = "I")
    public int field6417;

    @OriginalMember(owner = "client!qs", name = "x", descriptor = "I")
    public static int field6418;

    @OriginalMember(owner = "client!qs", name = "y", descriptor = "I")
    public static int field6419;

    @OriginalMember(owner = "client!qs", name = "C", descriptor = "I")
    public int field6423;

    @OriginalMember(owner = "client!qs", name = "B", descriptor = "[[I")
    public int[][] field6422;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIIIIIIII)Z", line = 3)
    public final boolean method2703(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field6412++;
        if (arg5 > 1) {
            return class278.method1533(arg3, arg0, arg7, arg4, arg5, arg5, (byte) -52, arg8, arg1) ? true : this.method2717(arg5, (byte) -118, arg0, arg5, arg7, arg1, arg6, arg8, arg3, arg4);
        }
        int var10 = arg1 + arg3 - 1;
        int var11 = arg0 + arg8 - 1;
        if (arg3 <= arg7 && var10 >= arg7 && arg0 <= arg4 && var11 >= arg4) {
            return true;
        } else if (arg2 + arg3 == arg7 && arg0 <= arg4 && var11 >= arg4 && (this.field6422[arg7 - this.field6415][arg4 - this.field6423] & 0x8) == 0 && (arg6 & 0x8) == 0) {
            return true;
        } else if ((var10 + 1) == arg7 && arg4 >= arg0 && arg4 <= var11 && (this.field6422[arg7 - this.field6415][arg4 - this.field6423] & 0x80) == 0 && (arg6 & 0x2) == 0) {
            return true;
        } else if (arg0 - 1 == arg4 && arg7 >= arg3 && var10 >= arg7 && (this.field6422[arg7 - this.field6415][arg4 - this.field6423] & 0x2) == 0 && (arg6 & 0x4) == 0) {
            return true;
        } else {
            return (var11 + 1) == arg4 && arg7 >= arg3 && var10 >= arg7 && (this.field6422[arg7 - this.field6415][arg4 - this.field6423] & 0x20) == 0 && (arg6 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)V", line = 48)
    public final void method2704(int arg0) {
        for (int var2 = arg0; var2 < this.field6417; var2++) {
            for (int var3 = 0; var3 < this.field6397; var3++) {
                if (var2 == 0 || var3 == 0 || (this.field6417 - 5) <= var2 || this.field6397 - 5 <= var3) {
                    this.field6422[var2][var3] = -1;
                } else {
                    this.field6422[var2][var3] = 2097152;
                }
            }
        }
        field6411++;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIII)V", line = 76)
    private final void method2705(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 < 121) {
            this.method2722(-38, 21, 107);
        }
        field6419++;
        this.field6422[arg1][arg0] = class392.method2441(this.field6422[arg1][arg0], arg2);
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(BI)V", line = 99)
    public static final void method2706(byte arg0, int arg1) {
        field6409++;
        if (class452.field6580 == null) {
            class452.field6580 = new byte[4][class315.field4214][class340.field4549];
        }
        int var2 = 0;
        if (arg1 > -88) {
            field6398 = true;
        }
        while (var2 < 4) {
            for (int var3 = 0; var3 < class315.field4214; var3++) {
                for (int var4 = 0; var4 < class340.field4549; var4++) {
                    class452.field6580[var2][var3][var4] = arg0;
                }
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIIIIIII)Z", line = 137)
    public final boolean method2707(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field6405++;
        if (arg0 == 1) {
            if (arg3 == arg6 && arg5 == arg7) {
                return true;
            }
        } else if (arg6 >= arg3 && arg0 + arg3 - 1 >= arg6 && arg7 >= arg7 && arg7 <= (arg0 + arg7 - 1)) {
            return true;
        }
        int var9 = arg5 - this.field6423;
        int var10 = arg7 - this.field6423;
        int var11 = arg6 - this.field6415;
        int var12 = arg3 - this.field6415;
        if (arg2 != 64) {
            field6421 = null;
        }
        if (arg0 == 1) {
            if (arg4 == 0) {
                if (arg1 == 0) {
                    if ((var11 - 1) == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && (var10 + 1) == var9 && (this.field6422[var12][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var10 - 1) == var9 && (this.field6422[var12][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var11 == var12 && (var10 + 1) == var9) {
                        return true;
                    }
                    if (var11 - 1 == var12 && var9 == var10 && (this.field6422[var12][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var9 == var10 && (this.field6422[var12][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var11 + 1 == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && (var10 + 1) == var9 && (this.field6422[var12][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var10 - 1 == var9 && (this.field6422[var12][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var11 == var12 && var10 - 1 == var9) {
                        return true;
                    }
                    if ((var11 - 1) == var12 && var9 == var10 && (this.field6422[var12][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var9 == var10 && (this.field6422[var12][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 2) {
                if (arg1 == 0) {
                    if (var11 - 1 == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && var10 + 1 == var9) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var9 == var10 && (this.field6422[var12][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var10 - 1) == var9 && (this.field6422[var12][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var11 - 1 == var12 && var9 == var10 && (this.field6422[var12][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var10 + 1) == var9) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && (var10 - 1) == var9 && (this.field6422[var12][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if ((var11 - 1) == var12 && var9 == var10 && (this.field6422[var12][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var10 + 1 == var9 && (this.field6422[var12][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && var10 - 1 == var9) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if ((var11 - 1) == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && var10 + 1 == var9 && (this.field6422[var12][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var9 == var10 && (this.field6422[var12][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var10 - 1) == var9) {
                        return true;
                    }
                }
            }
            if (arg4 == 9) {
                if (var11 == var12 && var10 + 1 == var9 && (this.field6422[var12][var9] & 0x20) == 0) {
                    return true;
                }
                if (var11 == var12 && var10 - 1 == var9 && (this.field6422[var12][var9] & 0x2) == 0) {
                    return true;
                }
                if (var11 - 1 == var12 && var9 == var10 && (this.field6422[var12][var9] & 0x8) == 0) {
                    return true;
                }
                if ((var11 + 1) == var12 && var9 == var10 && (this.field6422[var12][var9] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg0 + var12 - 1;
            int var14 = arg0 + var9 - 1;
            if (arg4 == 0) {
                if (arg1 == 0) {
                    if (var11 - arg0 == var12 && var9 <= var10 && var10 <= var14) {
                        return true;
                    }
                    if (var11 >= var12 && var11 <= var13 && (var10 + 1) == var9 && (this.field6422[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 <= var11 && var11 <= var13 && var10 - arg0 == var9 && (this.field6422[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var11 >= var12 && var11 <= var13 && var10 + 1 == var9) {
                        return true;
                    }
                    if ((var11 - arg0) == var12 && var10 >= var9 && var10 <= var14 && (this.field6422[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var9 <= var10 && var14 >= var10 && (this.field6422[var12][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var11 + 1 == var12 && var10 >= var9 && var14 >= var10) {
                        return true;
                    }
                    if (var11 >= var12 && var13 >= var11 && var10 + 1 == var9 && (this.field6422[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 <= var11 && var11 <= var13 && var10 - arg0 == var9 && (this.field6422[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var12 <= var11 && var13 >= var11 && var10 - arg0 == var9) {
                        return true;
                    }
                    if (var11 - arg0 == var12 && var10 >= var9 && var14 >= var10 && (this.field6422[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var9 <= var10 && var14 >= var10 && (this.field6422[var12][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 2) {
                if (arg1 == 0) {
                    if ((var11 - arg0) == var12 && var10 >= var9 && var10 <= var14) {
                        return true;
                    }
                    if (var12 <= var11 && var11 <= var13 && (var10 + 1) == var9) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var10 >= var9 && var10 <= var14 && (this.field6422[var12][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var12 <= var11 && var13 >= var11 && var10 - arg0 == var9 && (this.field6422[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if ((var11 - arg0) == var12 && var10 >= var9 && var14 >= var10 && (this.field6422[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 <= var11 && var11 <= var13 && (var10 + 1) == var9) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var9 <= var10 && var10 <= var14) {
                        return true;
                    }
                    if (var12 <= var11 && var11 <= var13 && (var10 - arg0) == var9 && (this.field6422[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var11 - arg0 == var12 && var10 >= var9 && var10 <= var14 && (this.field6422[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 >= var12 && var13 >= var11 && var10 + 1 == var9 && (this.field6422[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var9 <= var10 && var10 <= var14) {
                        return true;
                    }
                    if (var11 >= var12 && var13 >= var11 && (var10 - arg0) == var9) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var11 - arg0 == var12 && var10 >= var9 && var14 >= var10) {
                        return true;
                    }
                    if (var12 <= var11 && var13 >= var11 && (var10 + 1) == var9 && (this.field6422[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var10 >= var9 && var10 <= var14 && (this.field6422[var12][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 >= var12 && var11 <= var13 && (var10 - arg0) == var9) {
                        return true;
                    }
                }
            }
            if (arg4 == 9) {
                if (var12 <= var11 && var13 >= var11 && (var10 + 1) == var9 && (this.field6422[var11][var9] & 0x2C0120) == 0) {
                    return true;
                }
                if (var11 >= var12 && var13 >= var11 && var10 - arg0 == var9 && (this.field6422[var11][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if ((var11 - arg0) == var12 && var10 >= var9 && var14 >= var10 && (this.field6422[var13][var10] & 0x2C0108) == 0) {
                    return true;
                }
                if (var11 + 1 == var12 && var9 <= var10 && var10 <= var14 && (this.field6422[var12][var10] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(IIIIIIII)Z", line = 514)
    public final boolean method2708(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field6401++;
        if (arg5 == 1) {
            if (arg3 == arg4 && arg2 == arg7) {
                return true;
            }
        } else if (arg3 <= arg4 && (arg3 + arg5 - 1) >= arg4 && arg2 >= arg2 && arg2 <= arg2 - (1 - arg5)) {
            return true;
        }
        int var9 = arg3 - this.field6415;
        int var10 = arg2 - this.field6423;
        int var11 = arg7 - this.field6423;
        int var12 = arg4 - this.field6415;
        if (arg0 != -1) {
            this.field6417 = 78;
        }
        if (arg5 == 1) {
            if (arg1 == 6 || arg1 == 7) {
                if (arg1 == 7) {
                    arg6 = arg6 + 2 & 0x3;
                }
                if (arg6 == 0) {
                    if (var12 + 1 == var9 && var10 == var11 && (this.field6422[var9][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var10 - 1 == var11 && (this.field6422[var9][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if ((var12 - 1) == var9 && var10 == var11 && (this.field6422[var9][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var10 - 1) == var11 && (this.field6422[var9][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if ((var12 - 1) == var9 && var10 == var11 && (this.field6422[var9][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var10 + 1 == var11 && (this.field6422[var9][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if ((var12 + 1) == var9 && var10 == var11 && (this.field6422[var9][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var10 + 1 == var11 && (this.field6422[var9][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg1 == 8) {
                if (var9 == var12 && (var10 + 1) == var11 && (this.field6422[var9][var11] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var12 && (var10 - 1) == var11 && (this.field6422[var9][var11] & 0x2) == 0) {
                    return true;
                }
                if (var12 - 1 == var9 && var10 == var11 && (this.field6422[var9][var11] & 0x8) == 0) {
                    return true;
                }
                if (var12 + 1 == var9 && var10 == var11 && (this.field6422[var9][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var9 - (1 - arg5);
            int var14 = arg5 + var11 - 1;
            if (arg1 == 6 || arg1 == 7) {
                if (arg1 == 7) {
                    arg6 = arg6 + 2 & 0x3;
                }
                if (arg6 == 0) {
                    if ((var12 + 1) == var9 && var10 >= var11 && var14 >= var10 && (this.field6422[var9][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 >= var9 && var13 >= var12 && var10 - arg5 == var11 && (this.field6422[var12][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if ((var12 - arg5) == var9 && var10 >= var11 && var14 >= var10 && (this.field6422[var13][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 <= var12 && var13 >= var12 && (var10 - arg5) == var11 && (this.field6422[var12][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if (var12 - arg5 == var9 && var10 >= var11 && var10 <= var14 && (this.field6422[var13][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 <= var12 && var12 <= var13 && (var10 + 1) == var11 && (this.field6422[var12][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if ((var12 + 1) == var9 && var11 <= var10 && var14 >= var10 && (this.field6422[var9][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 <= var12 && var13 >= var12 && var10 + 1 == var11 && (this.field6422[var12][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg1 == 8) {
                if (var12 >= var9 && var13 >= var12 && var10 + 1 == var11 && (this.field6422[var12][var11] & 0x20) == 0) {
                    return true;
                }
                if (var9 <= var12 && var12 <= var13 && (var10 - arg5) == var11 && (this.field6422[var12][var14] & 0x2) == 0) {
                    return true;
                }
                if ((var12 - arg5) == var9 && var10 >= var11 && var10 <= var14 && (this.field6422[var13][var10] & 0x8) == 0) {
                    return true;
                }
                if (var12 + 1 == var9 && var11 <= var10 && var14 >= var10 && (this.field6422[var9][var10] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(BLam;)V", line = 700)
    public static final void method2709(byte arg0, class286 arg1) {
        field6414++;
        class405.field5886 = arg1;
        if (arg0 != -12) {
            method2719(3, 87);
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIIIIIZZ)V", line = 711)
    public final void method2710(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        field6402++;
        int var9 = 256;
        int var10 = 118 / ((arg2 - 59) / 46);
        if (arg6) {
            var9 |= 0x20000;
        }
        int var11 = arg4 - this.field6415;
        int var12 = arg0 - this.field6423;
        if (arg3 == 1 || arg3 == 3) {
            int var13 = arg1;
            arg1 = arg5;
            arg5 = var13;
        }
        if (arg7) {
            var9 |= 0x40000000;
        }
        for (int var14 = var11; var14 < (var11 + arg1); var14++) {
            if (var14 >= 0 && var14 < this.field6417) {
                for (int var15 = var12; var15 < (arg5 + var12); var15++) {
                    if (var15 >= 0 && var15 < this.field6397) {
                        this.method2715(var9, var15, var14, -6289);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IZIIZBI)V", line = 762)
    public final void method2711(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, byte arg5, int arg6) {
        field6395++;
        int var8 = arg2 - this.field6415;
        int var9 = -74 % ((arg5 - 10) / 43);
        int var10 = arg3 - this.field6423;
        if (arg0 == 0) {
            if (arg6 == 0) {
                this.method2715(128, var10, var8, -6289);
                this.method2715(8, var10, var8 - 1, -6289);
            }
            if (arg6 == 1) {
                this.method2715(2, var10, var8, -6289);
                this.method2715(32, var10 + 1, var8, -6289);
            }
            if (arg6 == 2) {
                this.method2715(8, var10, var8, -6289);
                this.method2715(128, var10, var8 + 1, -6289);
            }
            if (arg6 == 3) {
                this.method2715(32, var10, var8, -6289);
                this.method2715(2, var10 - 1, var8, -6289);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg6 == 0) {
                this.method2715(1, var10, var8, -6289);
                this.method2715(16, var10 + 1, var8 + -1, -6289);
            }
            if (arg6 == 1) {
                this.method2715(4, var10, var8, -6289);
                this.method2715(64, var10 + 1, var8 + 1, -6289);
            }
            if (arg6 == 2) {
                this.method2715(16, var10, var8, -6289);
                this.method2715(1, var10 - 1, var8 + 1, -6289);
            }
            if (arg6 == 3) {
                this.method2715(64, var10, var8, -6289);
                this.method2715(4, var10 - 1, var8 - 1, -6289);
            }
        }
        if (arg0 == 2) {
            if (arg6 == 0) {
                this.method2715(130, var10, var8, -6289);
                this.method2715(8, var10, var8 - 1, -6289);
                this.method2715(32, var10 + 1, var8, -6289);
            }
            if (arg6 == 1) {
                this.method2715(10, var10, var8, -6289);
                this.method2715(32, var10 + 1, var8, -6289);
                this.method2715(128, var10, var8 + 1, -6289);
            }
            if (arg6 == 2) {
                this.method2715(40, var10, var8, -6289);
                this.method2715(128, var10, var8 + 1, -6289);
                this.method2715(2, var10 - 1, var8, -6289);
            }
            if (arg6 == 3) {
                this.method2715(160, var10, var8, -6289);
                this.method2715(2, var10 - 1, var8, -6289);
                this.method2715(8, var10, var8 - 1, -6289);
            }
        }
        if (arg1) {
            if (arg0 == 0) {
                if (arg6 == 0) {
                    this.method2715(65536, var10, var8, -6289);
                    this.method2715(4096, var10, var8 - 1, -6289);
                }
                if (arg6 == 1) {
                    this.method2715(1024, var10, var8, -6289);
                    this.method2715(16384, var10 + 1, var8, -6289);
                }
                if (arg6 == 2) {
                    this.method2715(4096, var10, var8, -6289);
                    this.method2715(65536, var10, var8 + 1, -6289);
                }
                if (arg6 == 3) {
                    this.method2715(16384, var10, var8, -6289);
                    this.method2715(1024, var10 - 1, var8, -6289);
                }
            }
            if (arg0 == 1 || arg0 == 3) {
                if (arg6 == 0) {
                    this.method2715(512, var10, var8, -6289);
                    this.method2715(8192, var10 + 1, var8 + -1, -6289);
                }
                if (arg6 == 1) {
                    this.method2715(2048, var10, var8, -6289);
                    this.method2715(32768, var10 + 1, var8 + 1, -6289);
                }
                if (arg6 == 2) {
                    this.method2715(8192, var10, var8, -6289);
                    this.method2715(512, var10 - 1, var8 + 1, -6289);
                }
                if (arg6 == 3) {
                    this.method2715(32768, var10, var8, -6289);
                    this.method2715(2048, var10 - 1, var8 + -1, -6289);
                }
            }
            if (arg0 == 2) {
                if (arg6 == 0) {
                    this.method2715(66560, var10, var8, -6289);
                    this.method2715(4096, var10, var8 - 1, -6289);
                    this.method2715(16384, var10 + 1, var8, -6289);
                }
                if (arg6 == 1) {
                    this.method2715(5120, var10, var8, -6289);
                    this.method2715(16384, var10 + 1, var8, -6289);
                    this.method2715(65536, var10, var8 + 1, -6289);
                }
                if (arg6 == 2) {
                    this.method2715(20480, var10, var8, -6289);
                    this.method2715(65536, var10, var8 + 1, -6289);
                    this.method2715(1024, var10 - 1, var8, -6289);
                }
                if (arg6 == 3) {
                    this.method2715(81920, var10, var8, -6289);
                    this.method2715(1024, var10 - 1, var8, -6289);
                    this.method2715(4096, var10, var8 - 1, -6289);
                }
            }
        }
        if (!arg4) {
            return;
        }
        if (arg0 == 0) {
            if (arg6 == 0) {
                this.method2715(536870912, var10, var8, -6289);
                this.method2715(33554432, var10, var8 - 1, -6289);
            }
            if (arg6 == 1) {
                this.method2715(8388608, var10, var8, -6289);
                this.method2715(134217728, var10 + 1, var8, -6289);
            }
            if (arg6 == 2) {
                this.method2715(33554432, var10, var8, -6289);
                this.method2715(536870912, var10, var8 + 1, -6289);
            }
            if (arg6 == 3) {
                this.method2715(134217728, var10, var8, -6289);
                this.method2715(8388608, var10 - 1, var8, -6289);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg6 == 0) {
                this.method2715(4194304, var10, var8, -6289);
                this.method2715(67108864, var10 + 1, var8 + -1, -6289);
            }
            if (arg6 == 1) {
                this.method2715(16777216, var10, var8, -6289);
                this.method2715(268435456, var10 + 1, var8 + 1, -6289);
            }
            if (arg6 == 2) {
                this.method2715(67108864, var10, var8, -6289);
                this.method2715(4194304, var10 - 1, var8 + 1, -6289);
            }
            if (arg6 == 3) {
                this.method2715(268435456, var10, var8, -6289);
                this.method2715(16777216, var10 - 1, var8 + -1, -6289);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg6 == 0) {
            this.method2715(545259520, var10, var8, -6289);
            this.method2715(33554432, var10, var8 - 1, -6289);
            this.method2715(134217728, var10 + 1, var8, -6289);
        }
        if (arg6 == 1) {
            this.method2715(41943040, var10, var8, -6289);
            this.method2715(134217728, var10 + 1, var8, -6289);
            this.method2715(536870912, var10, var8 + 1, -6289);
        }
        if (arg6 == 2) {
            this.method2715(167772160, var10, var8, -6289);
            this.method2715(536870912, var10, var8 + 1, -6289);
            this.method2715(8388608, var10 - 1, var8, -6289);
        }
        if (arg6 == 3) {
            this.method2715(671088640, var10, var8, -6289);
            this.method2715(8388608, var10 - 1, var8, -6289);
            this.method2715(33554432, var10, var8 - 1, -6289);
            return;
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIIIIZZ)V", line = 1067)
    public final void method2712(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        int var8 = arg3 - this.field6423;
        field6404++;
        int var9 = arg4 - this.field6415;
        if (arg0 == 0) {
            if (arg1 == 0) {
                this.method2705(var8, var9, 128, 122);
                this.method2705(var8, var9 - 1, 8, 124);
            }
            if (arg1 == 1) {
                this.method2705(var8, var9, 2, 123);
                this.method2705(var8 + 1, var9, 32, 124);
            }
            if (arg1 == 2) {
                this.method2705(var8, var9, 8, 122);
                this.method2705(var8, var9 + 1, 128, 124);
            }
            if (arg1 == 3) {
                this.method2705(var8, var9, 32, 126);
                this.method2705(var8 - 1, var9, 2, 123);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg1 == 0) {
                this.method2705(var8, var9, 1, 122);
                this.method2705(var8 + 1, var9 + -1, 16, 124);
            }
            if (arg1 == 1) {
                this.method2705(var8, var9, 4, 125);
                this.method2705(var8 + 1, var9 + 1, 64, 123);
            }
            if (arg1 == 2) {
                this.method2705(var8, var9, 16, 125);
                this.method2705(var8 - 1, var9 + 1, 1, 124);
            }
            if (arg1 == 3) {
                this.method2705(var8, var9, 64, 126);
                this.method2705(var8 - 1, var9 + -1, 4, 122);
            }
        }
        if (arg0 == 2) {
            if (arg1 == 0) {
                this.method2705(var8, var9, 130, 125);
                this.method2705(var8, var9 - 1, 8, 124);
                this.method2705(var8 + 1, var9, 32, 127);
            }
            if (arg1 == 1) {
                this.method2705(var8, var9, 10, 126);
                this.method2705(var8 + 1, var9, 32, 125);
                this.method2705(var8, var9 + 1, 128, 123);
            }
            if (arg1 == 2) {
                this.method2705(var8, var9, 40, 125);
                this.method2705(var8, var9 + 1, 128, 122);
                this.method2705(var8 - 1, var9, 2, 124);
            }
            if (arg1 == 3) {
                this.method2705(var8, var9, 160, 127);
                this.method2705(var8 - 1, var9, 2, 127);
                this.method2705(var8, var9 - 1, 8, 125);
            }
        }
        if (arg5) {
            if (arg0 == 0) {
                if (arg1 == 0) {
                    this.method2705(var8, var9, 65536, 123);
                    this.method2705(var8, var9 - 1, 4096, 127);
                }
                if (arg1 == 1) {
                    this.method2705(var8, var9, 1024, 126);
                    this.method2705(var8 + 1, var9, 16384, 122);
                }
                if (arg1 == 2) {
                    this.method2705(var8, var9, 4096, 123);
                    this.method2705(var8, var9 + 1, 65536, 125);
                }
                if (arg1 == 3) {
                    this.method2705(var8, var9, 16384, 124);
                    this.method2705(var8 - 1, var9, 1024, 122);
                }
            }
            if (arg0 == 1 || arg0 == 3) {
                if (arg1 == 0) {
                    this.method2705(var8, var9, 512, 125);
                    this.method2705(var8 + 1, var9 + -1, 8192, 125);
                }
                if (arg1 == 1) {
                    this.method2705(var8, var9, 2048, 125);
                    this.method2705(var8 + 1, var9 + 1, 32768, 124);
                }
                if (arg1 == 2) {
                    this.method2705(var8, var9, 8192, 127);
                    this.method2705(var8 - 1, var9 + 1, 512, 124);
                }
                if (arg1 == 3) {
                    this.method2705(var8, var9, 32768, 127);
                    this.method2705(var8 - 1, var9 + -1, 2048, 124);
                }
            }
            if (arg0 == 2) {
                if (arg1 == 0) {
                    this.method2705(var8, var9, 66560, 123);
                    this.method2705(var8, var9 - 1, 4096, 124);
                    this.method2705(var8 + 1, var9, 16384, 126);
                }
                if (arg1 == 1) {
                    this.method2705(var8, var9, 5120, 127);
                    this.method2705(var8 + 1, var9, 16384, 124);
                    this.method2705(var8, var9 + 1, 65536, 124);
                }
                if (arg1 == 2) {
                    this.method2705(var8, var9, 20480, 124);
                    this.method2705(var8, var9 + 1, 65536, 125);
                    this.method2705(var8 - 1, var9, 1024, 127);
                }
                if (arg1 == 3) {
                    this.method2705(var8, var9, 81920, 127);
                    this.method2705(var8 - 1, var9, 1024, 122);
                    this.method2705(var8, var9 - 1, 4096, 123);
                }
            }
        }
        if (arg2 > 0) {
            field6420 = null;
        }
        if (!arg6) {
            return;
        }
        if (arg0 == 0) {
            if (arg1 == 0) {
                this.method2705(var8, var9, 536870912, 126);
                this.method2705(var8, var9 - 1, 33554432, 127);
            }
            if (arg1 == 1) {
                this.method2705(var8, var9, 8388608, 126);
                this.method2705(var8 + 1, var9, 134217728, 126);
            }
            if (arg1 == 2) {
                this.method2705(var8, var9, 33554432, 126);
                this.method2705(var8, var9 + 1, 536870912, 125);
            }
            if (arg1 == 3) {
                this.method2705(var8, var9, 134217728, 122);
                this.method2705(var8 - 1, var9, 8388608, 127);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg1 == 0) {
                this.method2705(var8, var9, 4194304, 125);
                this.method2705(var8 + 1, var9 + -1, 67108864, 125);
            }
            if (arg1 == 1) {
                this.method2705(var8, var9, 16777216, 124);
                this.method2705(var8 + 1, var9 - -1, 268435456, 124);
            }
            if (arg1 == 2) {
                this.method2705(var8, var9, 67108864, 125);
                this.method2705(var8 - 1, var9 + 1, 4194304, 122);
            }
            if (arg1 == 3) {
                this.method2705(var8, var9, 268435456, 125);
                this.method2705(var8 - 1, var9 - 1, 16777216, 122);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method2705(var8, var9, 545259520, 123);
            this.method2705(var8, var9 - 1, 33554432, 123);
            this.method2705(var8 + 1, var9, 134217728, 124);
        }
        if (arg1 == 1) {
            this.method2705(var8, var9, 41943040, 124);
            this.method2705(var8 + 1, var9, 134217728, 124);
            this.method2705(var8, var9 + 1, 536870912, 127);
        }
        if (arg1 == 2) {
            this.method2705(var8, var9, 167772160, 124);
            this.method2705(var8, var9 + 1, 536870912, 126);
            this.method2705(var8 - 1, var9, 8388608, 124);
        }
        if (arg1 == 3) {
            this.method2705(var8, var9, 671088640, 124);
            this.method2705(var8 - 1, var9, 8388608, 125);
            this.method2705(var8, var9 - 1, 33554432, 123);
            return;
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IBZIIIZ)V", line = 1376)
    public final void method2713(int arg0, byte arg1, boolean arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg1 >= -106) {
            method2719(43, -39);
        }
        field6396++;
        int var8 = 256;
        if (arg6) {
            var8 |= 0x20000;
        }
        int var9 = arg0 - this.field6415;
        if (arg2) {
            var8 |= 0x40000000;
        }
        int var10 = arg5 - this.field6423;
        for (int var11 = var9; var11 < arg3 + var9; var11++) {
            if (var11 >= 0 && var11 < this.field6417) {
                for (int var12 = var10; var12 < arg4 + var10; var12++) {
                    if (var12 >= 0 && var12 < this.field6397) {
                        this.method2705(var12, var11, var8, 124);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(III)V", line = 1428)
    public final void method2714(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field6415;
        int var5 = arg1 - this.field6423;
        field6406++;
        this.field6422[var4][var5] = class262.method1461(this.field6422[var4][var5], -2097153);
        if (arg2 != -10297) {
            this.field6422 = null;
        }
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(IIII)V", line = 1446)
    private final void method2715(int arg0, int arg1, int arg2, int arg3) {
        field6399++;
        if (arg3 != -6289) {
            this.method2712(46, 39, 55, -61, 45, false, false);
        }
        this.field6422[arg2][arg1] = class262.method1461(this.field6422[arg2][arg1], ~arg0);
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(III)V", line = 1457)
    public final void method2716(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field6415;
        int var5 = arg2 - this.field6423;
        field6413++;
        this.field6422[var4][var5] = class392.method2441(this.field6422[var4][var5], 262144);
        if (arg1 != 0) {
            field6421 = null;
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IBIIIIIIII)Z", line = 1473)
    public final boolean method2717(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field6416++;
        int var11 = arg0 + arg4;
        int var12 = arg3 + arg9;
        if (arg1 != -118) {
            this.method2708(85, 38, -112, -95, 16, 81, -86, -59);
        }
        int var13 = arg5 + arg8;
        int var14 = arg2 + arg7;
        if (arg4 == var13 && (arg6 & 0x2) == 0) {
            int var15 = arg9 <= arg2 ? arg2 : arg9;
            int var16 = var12 < var14 ? var12 : var14;
            while (var15 < var16) {
                if ((this.field6422[var13 - this.field6415 - 1][var15 - this.field6423] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg8 == var11 && (arg6 & 0x8) == 0) {
            int var17 = arg2 >= arg9 ? arg2 : arg9;
            int var18 = var12 >= var14 ? var14 : var12;
            while (var17 < var18) {
                if ((this.field6422[arg8 - this.field6415][var17 - this.field6423] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg9 == var14 && (arg6 & 0x1) == 0) {
            int var19 = arg4 > arg8 ? arg4 : arg8;
            int var20 = var11 < var13 ? var11 : var13;
            while (var19 < var20) {
                if ((this.field6422[var19 - this.field6415][var14 - this.field6423 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg2 == var12 && (arg6 & 0x4) == 0) {
            int var21 = arg4 > arg8 ? arg4 : arg8;
            int var22 = var13 <= var11 ? var13 : var11;
            while (var21 < var22) {
                if ((this.field6422[var21 - this.field6415][arg2 - this.field6423] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(BII)V", line = 1566)
    public final void method2718(byte arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field6415;
        int var5 = -41 % ((-arg0 - 6) / 35);
        int var6 = arg2 - this.field6423;
        field6410++;
        this.field6422[var4][var6] = class392.method2441(this.field6422[var4][var6], 2097152);
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(II)Lel;", line = 1586)
    public static final class328 method2719(int arg0, int arg1) {
        field6407++;
        if (arg0 != -1) {
            return null;
        }
        class328 var2 = (class328) class14.field130.method616(-43, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class127.field1635.method1687(arg1, 35, 255);
        class328 var4 = new class328();
        if (var3 != null) {
            var4.method1880(0, new class250(var3));
        }
        var4.method1878((byte) 75);
        class14.field130.method615((byte) -121, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(Z)V", line = 1619)
    public static final void method2720(boolean arg0) {
        for (int var1 = -1; var1 < class293.field3991; var1++) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class345.field4629[var1];
            }
            class158 var6 = class85.field957[var5];
            if (var6 != null && var6.field6044 > 0) {
                var6.field6044--;
                if (var6.field6044 == 0) {
                    var6.field6060 = null;
                }
            }
        }
        field6418++;
        for (int var2 = 0; var2 < class244.field3320; var2++) {
            int var3 = class308.field4175[var2];
            class91 var4 = class38.field397[var3];
            if (var4 != null && var4.field6044 > 0) {
                var4.field6044--;
                if (var4.field6044 == 0) {
                    var4.field6060 = null;
                }
            }
        }
        if (arg0) {
            field6421 = null;
        }
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(Z)V", line = 1682)
    public static void method2721(boolean arg0) {
        field6421 = null;
        if (!arg0) {
            field6420 = null;
        }
    }

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "(III)V", line = 1694)
    public final void method2722(int arg0, int arg1, int arg2) {
        field6408++;
        if (arg1 == 2) {
            int var4 = arg2 - this.field6423;
            int var5 = arg0 - this.field6415;
            this.field6422[var5][var4] = class262.method1461(this.field6422[var5][var4], -262145);
        }
    }
}
