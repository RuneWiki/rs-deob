import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class175 {

    @OriginalMember(owner = "client!th", name = "c", descriptor = "Lbt;")
    public static class363 field2395 = new class363(8);

    @OriginalMember(owner = "client!th", name = "g", descriptor = "Z")
    public static boolean field2399 = true;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "I")
    public int field2394;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!th", name = "f", descriptor = "I")
    public static int field2398;

    @OriginalMember(owner = "client!th", name = "h", descriptor = "I")
    public int field2400;

    @OriginalMember(owner = "client!th", name = "i", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!th", name = "j", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!th", name = "k", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!th", name = "l", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!th", name = "m", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!th", name = "n", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!th", name = "o", descriptor = "I")
    public static int field2407;

    @OriginalMember(owner = "client!th", name = "q", descriptor = "I")
    public static int field2409;

    @OriginalMember(owner = "client!th", name = "r", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!th", name = "s", descriptor = "I")
    public static int field2411;

    @OriginalMember(owner = "client!th", name = "t", descriptor = "I")
    public static int field2412;

    @OriginalMember(owner = "client!th", name = "u", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!th", name = "v", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!th", name = "w", descriptor = "I")
    public int field2415;

    @OriginalMember(owner = "client!th", name = "x", descriptor = "I")
    public static int field2416;

    @OriginalMember(owner = "client!th", name = "y", descriptor = "I")
    public static int field2417;

    @OriginalMember(owner = "client!th", name = "z", descriptor = "I")
    public static int field2418;

    @OriginalMember(owner = "client!th", name = "A", descriptor = "I")
    public int field2419;

    @OriginalMember(owner = "client!th", name = "p", descriptor = "[[I")
    public int[][] field2408;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(III)V", line = 4)
    public final void method1202(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field2419;
        int var5 = 95 / ((arg2 - 67) / 36);
        int var6 = arg1 - this.field2400;
        field2409++;
        this.field2408[var4][var6] = class259.method1785(this.field2408[var4][var6], 262144);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIIIIBII)Z", line = 18)
    public final boolean method1203(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8) {
        field2418++;
        if (arg5 > 1) {
            return class100.method659(arg4, (byte) -115, arg3, arg0, arg7, arg2, arg5, arg5, arg8) ? true : this.method1214(arg2, arg0, arg7, arg4, arg6 ^ 0xFFFFFFB8, arg5, arg3, arg8, arg5, arg1);
        }
        int var10 = arg8 + arg2 - 1;
        int var11 = arg3 + arg7 - 1;
        if (arg0 >= arg8 && arg0 <= var10 && arg3 <= arg4 && var11 >= arg4) {
            return true;
        } else if ((arg8 - 1) == arg0 && arg3 <= arg4 && var11 >= arg4 && (this.field2408[arg0 - this.field2419][arg4 - this.field2400] & 0x8) == 0 && (arg1 & 0x8) == 0) {
            return true;
        } else if ((var10 + 1) == arg0 && arg3 <= arg4 && arg4 <= var11 && (this.field2408[arg0 - this.field2419][arg4 - this.field2400] & 0x80) == 0 && (arg1 & 0x2) == 0) {
            return true;
        } else if ((arg3 - 1) == arg4 && arg0 >= arg8 && arg0 <= var10 && (this.field2408[arg0 - this.field2419][arg4 - this.field2400] & 0x2) == 0 && (arg1 & 0x4) == 0) {
            return true;
        } else if ((var11 + 1) == arg4 && arg8 <= arg0 && var10 >= arg0 && (this.field2408[arg0 - this.field2419][arg4 - this.field2400] & 0x20) == 0 && (arg1 & 0x1) == 0) {
            return true;
        } else if (arg6 == -128) {
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(BIIIIIII)Z", line = 65)
    public final boolean method1204(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2397++;
        if (arg2 == 1) {
            if (arg4 == arg5 && arg3 == arg7) {
                return true;
            }
        } else if (arg5 <= arg4 && arg4 <= (arg5 - (1 - arg2)) && arg7 >= arg7 && arg7 <= arg2 + arg7 - 1) {
            return true;
        }
        int var9 = arg7 - this.field2400;
        int var10 = arg4 - this.field2419;
        int var11 = arg3 - this.field2400;
        if (arg0 != -30) {
            this.field2419 = 76;
        }
        int var12 = arg5 - this.field2419;
        if (arg2 == 1) {
            if (arg6 == 6 || arg6 == 7) {
                if (arg6 == 7) {
                    arg1 = arg1 + 2 & 0x3;
                }
                if (arg1 == 0) {
                    if ((var10 + 1) == var12 && var9 == var11 && (this.field2408[var12][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var9 - 1 == var11 && (this.field2408[var12][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if ((var10 - 1) == var12 && var9 == var11 && (this.field2408[var12][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var9 - 1) == var11 && (this.field2408[var12][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var10 - 1 == var12 && var9 == var11 && (this.field2408[var12][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var9 + 1) == var11 && (this.field2408[var12][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if ((var10 + 1) == var12 && var9 == var11 && (this.field2408[var12][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var9 + 1 == var11 && (this.field2408[var12][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg6 == 8) {
                if (var10 == var12 && var9 + 1 == var11 && (this.field2408[var12][var11] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var12 && var9 - 1 == var11 && (this.field2408[var12][var11] & 0x2) == 0) {
                    return true;
                }
                if ((var10 - 1) == var12 && var9 == var11 && (this.field2408[var12][var11] & 0x8) == 0) {
                    return true;
                }
                if ((var10 + 1) == var12 && var9 == var11 && (this.field2408[var12][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var12 + arg2 - 1;
            int var14 = var11 + arg2 - 1;
            if (arg6 == 6 || arg6 == 7) {
                if (arg6 == 7) {
                    arg1 = arg1 + 2 & 0x3;
                }
                if (arg1 == 0) {
                    if (var10 + 1 == var12 && var9 >= var11 && var14 >= var9 && (this.field2408[var12][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 <= var10 && var10 <= var13 && (var9 - arg2) == var11 && (this.field2408[var10][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if ((var10 - arg2) == var12 && var11 <= var9 && var9 <= var14 && (this.field2408[var13][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 >= var12 && var13 >= var10 && (var9 - arg2) == var11 && (this.field2408[var10][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if ((var10 - arg2) == var12 && var11 <= var9 && var9 <= var14 && (this.field2408[var13][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 >= var12 && var10 <= var13 && (var9 + 1) == var11 && (this.field2408[var10][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var10 + 1 == var12 && var9 >= var11 && var9 <= var14 && (this.field2408[var12][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 >= var12 && var10 <= var13 && var9 + 1 == var11 && (this.field2408[var10][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg6 == 8) {
                if (var10 >= var12 && var10 <= var13 && (var9 + 1) == var11 && (this.field2408[var10][var11] & 0x20) == 0) {
                    return true;
                }
                if (var12 <= var10 && var10 <= var13 && var9 - arg2 == var11 && (this.field2408[var10][var14] & 0x2) == 0) {
                    return true;
                }
                if ((var10 - arg2) == var12 && var11 <= var9 && var14 >= var9 && (this.field2408[var13][var9] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var12 && var11 <= var9 && var9 <= var14 && (this.field2408[var12][var9] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(III)V", line = 261)
    public final void method1205(int arg0, int arg1, int arg2) {
        field2416++;
        int var4 = arg0 - this.field2400;
        int var5 = arg1 - this.field2419;
        this.field2408[var5][var4] = class386.method2438(this.field2408[var5][var4], arg2);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(II)V", line = 272)
    public static final void method1206(int arg0, int arg1) {
        class363 var2 = class124.field1645;
        synchronized (class124.field1645) {
            class124.field1645.method2300(arg1, true);
        }
        field2393++;
        class363 var3 = class165.field2180;
        synchronized (class165.field2180) {
            class165.field2180.method2300(arg1, true);
        }
        class363 var4 = class459.field6785;
        synchronized (class459.field6785) {
            class459.field6785.method2300(arg1, true);
            if (arg0 != 16949) {
                method1213(-118, -51, false, 76);
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIIIIII)Z", line = 296)
    public final boolean method1207(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2414++;
        if (arg3 == 1) {
            if (arg2 == arg7 && arg4 == arg6) {
                return true;
            }
        } else if (arg7 >= arg2 && arg7 <= arg2 + arg3 - 1 && arg4 >= arg4 && (arg3 + arg4 - 1) >= arg4) {
            return true;
        }
        int var9 = arg6 - this.field2400;
        int var10 = arg7 - this.field2419;
        int var11 = arg2 - this.field2419;
        if (arg5 != -1) {
            return true;
        }
        int var12 = arg4 - this.field2400;
        if (arg3 == 1) {
            if (arg0 == 0) {
                if (arg1 == 0) {
                    if ((var10 - 1) == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9 && (this.field2408[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 - 1) == var9 && (this.field2408[var11][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var10 == var11 && var12 + 1 == var9) {
                        return true;
                    }
                    if (var10 - 1 == var11 && var9 == var12 && (this.field2408[var11][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 == var12 && (this.field2408[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var10 + 1 == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9 && (this.field2408[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 - 1) == var9 && (this.field2408[var11][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var10 == var11 && (var12 - 1) == var9) {
                        return true;
                    }
                    if (var10 - 1 == var11 && var9 == var12 && (this.field2408[var11][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 == var12 && (this.field2408[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 2) {
                if (arg1 == 0) {
                    if ((var10 - 1) == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var12 + 1 == var9) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 == var12 && (this.field2408[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var9 && (this.field2408[var11][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if ((var10 - 1) == var11 && var9 == var12 && (this.field2408[var11][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var9 && (this.field2408[var11][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if ((var10 - 1) == var11 && var9 == var12 && (this.field2408[var11][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9 && (this.field2408[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var12 - 1) == var9) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var10 - 1 == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var12 + 1 == var9 && (this.field2408[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 == var12 && (this.field2408[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var9) {
                        return true;
                    }
                }
            }
            if (arg0 == 9) {
                if (var10 == var11 && var12 + 1 == var9 && (this.field2408[var11][var9] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var11 && var12 - 1 == var9 && (this.field2408[var11][var9] & 0x2) == 0) {
                    return true;
                }
                if (var10 - 1 == var11 && var9 == var12 && (this.field2408[var11][var9] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var11 && var9 == var12 && (this.field2408[var11][var9] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg3 + var11 - 1;
            int var14 = arg3 + var9 - 1;
            if (arg0 == 0) {
                if (arg1 == 0) {
                    if ((var10 - arg3) == var11 && var12 >= var9 && var12 <= var14) {
                        return true;
                    }
                    if (var11 <= var10 && var13 >= var10 && (var12 + 1) == var9 && (this.field2408[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var13 >= var10 && var12 - arg3 == var9 && (this.field2408[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var10 >= var11 && var10 <= var13 && (var12 + 1) == var9) {
                        return true;
                    }
                    if (var10 - arg3 == var11 && var12 >= var9 && var12 <= var14 && (this.field2408[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var12 >= var9 && var12 <= var14 && (this.field2408[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if ((var10 + 1) == var11 && var12 >= var9 && var14 >= var12) {
                        return true;
                    }
                    if (var10 >= var11 && var13 >= var10 && (var12 + 1) == var9 && (this.field2408[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var13 >= var10 && var12 - arg3 == var9 && (this.field2408[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var11 <= var10 && var13 >= var10 && var12 - arg3 == var9) {
                        return true;
                    }
                    if (var10 - arg3 == var11 && var9 <= var12 && var14 >= var12 && (this.field2408[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var12 >= var9 && var14 >= var12 && (this.field2408[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 2) {
                if (arg1 == 0) {
                    if (var10 - arg3 == var11 && var12 >= var9 && var12 <= var14) {
                        return true;
                    }
                    if (var11 <= var10 && var10 <= var13 && var12 + 1 == var9) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var12 >= var9 && var12 <= var14 && (this.field2408[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var10 <= var13 && (var12 - arg3) == var9 && (this.field2408[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var10 - arg3 == var11 && var12 >= var9 && var12 <= var14 && (this.field2408[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var10 <= var13 && var12 + 1 == var9) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var12 >= var9 && var12 <= var14) {
                        return true;
                    }
                    if (var11 <= var10 && var13 >= var10 && var12 - arg3 == var9 && (this.field2408[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var10 - arg3 == var11 && var12 >= var9 && var14 >= var12 && (this.field2408[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var13 >= var10 && (var12 + 1) == var9 && (this.field2408[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 <= var12 && var14 >= var12) {
                        return true;
                    }
                    if (var10 >= var11 && var10 <= var13 && var12 - arg3 == var9) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var10 - arg3 == var11 && var9 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var10 >= var11 && var10 <= var13 && (var12 + 1) == var9 && (this.field2408[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var12 >= var9 && var12 <= var14 && (this.field2408[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var10 <= var13 && (var12 - arg3) == var9) {
                        return true;
                    }
                }
            }
            if (arg0 == 9) {
                if (var11 <= var10 && var10 <= var13 && var12 + 1 == var9 && (this.field2408[var10][var9] & 0x2C0120) == 0) {
                    return true;
                }
                if (var11 <= var10 && var13 >= var10 && var12 - arg3 == var9 && (this.field2408[var10][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if (var10 - arg3 == var11 && var9 <= var12 && var12 <= var14 && (this.field2408[var13][var12] & 0x2C0108) == 0) {
                    return true;
                }
                if ((var10 + 1) == var11 && var9 <= var12 && var14 >= var12 && (this.field2408[var11][var12] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(B)V", line = 665)
    public static void method1208(byte arg0) {
        field2395 = null;
        int var1 = -106 % ((33 - arg0) / 62);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ZIIBIIZ)V", line = 675)
    public final void method1209(boolean arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, boolean arg6) {
        int var8 = arg2 - this.field2419;
        int var9 = arg4 - this.field2400;
        field2398++;
        if (arg1 == 0) {
            if (arg5 == 0) {
                this.method1218(1, var8, 128, var9);
                this.method1218(1, var8 - 1, 8, var9);
            }
            if (arg5 == 1) {
                this.method1218(1, var8, 2, var9);
                this.method1218(arg3 + 41, var8, 32, var9 + 1);
            }
            if (arg5 == 2) {
                this.method1218(1, var8, 8, var9);
                this.method1218(arg3 + 41, var8 + 1, 128, var9);
            }
            if (arg5 == 3) {
                this.method1218(1, var8, 32, var9);
                this.method1218(arg3 ^ 0xFFFFFFD9, var8, 2, var9 - 1);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg5 == 0) {
                this.method1218(1, var8, 1, var9);
                this.method1218(1, var8 - 1, 16, var9 + 1);
            }
            if (arg5 == 1) {
                this.method1218(1, var8, 4, var9);
                this.method1218(1, var8 + 1, 64, var9 + 1);
            }
            if (arg5 == 2) {
                this.method1218(1, var8, 16, var9);
                this.method1218(arg3 + 41, var8 + 1, 1, var9 - 1);
            }
            if (arg5 == 3) {
                this.method1218(1, var8, 64, var9);
                this.method1218(1, var8 - 1, 4, var9 - 1);
            }
        }
        if (arg3 != -40) {
            method1206(26, -120);
        }
        if (arg1 == 2) {
            if (arg5 == 0) {
                this.method1218(arg3 ^ 0xFFFFFFD9, var8, 130, var9);
                this.method1218(1, var8 - 1, 8, var9);
                this.method1218(1, var8, 32, var9 + 1);
            }
            if (arg5 == 1) {
                this.method1218(1, var8, 10, var9);
                this.method1218(1, var8, 32, var9 + 1);
                this.method1218(1, var8 + 1, 128, var9);
            }
            if (arg5 == 2) {
                this.method1218(arg3 ^ 0xFFFFFFD9, var8, 40, var9);
                this.method1218(1, var8 + 1, 128, var9);
                this.method1218(1, var8, 2, var9 - 1);
            }
            if (arg5 == 3) {
                this.method1218(1, var8, 160, var9);
                this.method1218(arg3 + 41, var8, 2, var9 - 1);
                this.method1218(arg3 + 41, var8 + -1, 8, var9);
            }
        }
        if (arg0) {
            if (arg1 == 0) {
                if (arg5 == 0) {
                    this.method1218(1, var8, 65536, var9);
                    this.method1218(1, var8 - 1, 4096, var9);
                }
                if (arg5 == 1) {
                    this.method1218(1, var8, 1024, var9);
                    this.method1218(1, var8, 16384, var9 + 1);
                }
                if (arg5 == 2) {
                    this.method1218(1, var8, 4096, var9);
                    this.method1218(1, var8 + 1, 65536, var9);
                }
                if (arg5 == 3) {
                    this.method1218(1, var8, 16384, var9);
                    this.method1218(1, var8, 1024, var9 - 1);
                }
            }
            if (arg1 == 1 || arg1 == 3) {
                if (arg5 == 0) {
                    this.method1218(1, var8, 512, var9);
                    this.method1218(1, var8 - 1, 8192, var9 + 1);
                }
                if (arg5 == 1) {
                    this.method1218(1, var8, 2048, var9);
                    this.method1218(1, var8 + 1, 32768, var9 + 1);
                }
                if (arg5 == 2) {
                    this.method1218(arg3 ^ 0xFFFFFFD9, var8, 8192, var9);
                    this.method1218(1, var8 + 1, 512, var9 - 1);
                }
                if (arg5 == 3) {
                    this.method1218(1, var8, 32768, var9);
                    this.method1218(1, var8 - 1, 2048, var9 - 1);
                }
            }
            if (arg1 == 2) {
                if (arg5 == 0) {
                    this.method1218(1, var8, 66560, var9);
                    this.method1218(1, var8 - 1, 4096, var9);
                    this.method1218(1, var8, 16384, var9 + 1);
                }
                if (arg5 == 1) {
                    this.method1218(1, var8, 5120, var9);
                    this.method1218(1, var8, 16384, var9 + 1);
                    this.method1218(1, var8 + 1, 65536, var9);
                }
                if (arg5 == 2) {
                    this.method1218(1, var8, 20480, var9);
                    this.method1218(1, var8 + 1, 65536, var9);
                    this.method1218(arg3 ^ 0xFFFFFFD9, var8, 1024, var9 - 1);
                }
                if (arg5 == 3) {
                    this.method1218(arg3 ^ 0xFFFFFFD9, var8, 81920, var9);
                    this.method1218(1, var8, 1024, var9 - 1);
                    this.method1218(1, var8 - 1, 4096, var9);
                }
            }
        }
        if (!arg6) {
            return;
        }
        if (arg1 == 0) {
            if (arg5 == 0) {
                this.method1218(arg3 + 41, var8, 536870912, var9);
                this.method1218(1, var8 - 1, 33554432, var9);
            }
            if (arg5 == 1) {
                this.method1218(arg3 + 41, var8, 8388608, var9);
                this.method1218(1, var8, 134217728, var9 + 1);
            }
            if (arg5 == 2) {
                this.method1218(arg3 + 41, var8, 33554432, var9);
                this.method1218(1, var8 + 1, 536870912, var9);
            }
            if (arg5 == 3) {
                this.method1218(1, var8, 134217728, var9);
                this.method1218(1, var8, 8388608, var9 - 1);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg5 == 0) {
                this.method1218(arg3 + 41, var8, 4194304, var9);
                this.method1218(1, var8 - 1, 67108864, var9 + 1);
            }
            if (arg5 == 1) {
                this.method1218(1, var8, 16777216, var9);
                this.method1218(1, var8 + 1, 268435456, var9 + 1);
            }
            if (arg5 == 2) {
                this.method1218(1, var8, 67108864, var9);
                this.method1218(1, var8 + 1, 4194304, var9 - 1);
            }
            if (arg5 == 3) {
                this.method1218(1, var8, 268435456, var9);
                this.method1218(arg3 + 41, var8 + -1, 16777216, var9 - 1);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method1218(1, var8, 545259520, var9);
            this.method1218(1, var8 - 1, 33554432, var9);
            this.method1218(1, var8, 134217728, var9 + 1);
        }
        if (arg5 == 1) {
            this.method1218(arg3 + 41, var8, 41943040, var9);
            this.method1218(1, var8, 134217728, var9 + 1);
            this.method1218(1, var8 + 1, 536870912, var9);
        }
        if (arg5 == 2) {
            this.method1218(arg3 ^ 0xFFFFFFD9, var8, 167772160, var9);
            this.method1218(1, var8 + 1, 536870912, var9);
            this.method1218(arg3 ^ 0xFFFFFFD9, var8, 8388608, var9 - 1);
        }
        if (arg5 == 3) {
            this.method1218(1, var8, 671088640, var9);
            this.method1218(1, var8, 8388608, var9 - 1);
            this.method1218(1, var8 - 1, 33554432, var9);
            return;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Z)V", line = 985)
    public static final void method1210(boolean arg0) {
        if (!arg0) {
            method1206(44, -63);
        }
        if (class157.field2120 != null) {
            class157.field2120.method136(86);
            class370.field5412 = null;
            class157.field2120 = null;
        }
        field2405++;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIII)V", line = 1003)
    private final void method1211(int arg0, int arg1, int arg2, int arg3) {
        this.field2408[arg3][arg1] = class386.method2438(this.field2408[arg3][arg1], ~arg2);
        if (arg0 != 1) {
            this.field2408 = null;
        }
        field2417++;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(BIZ)Ljava/lang/String;", line = 1019)
    public static final String method1212(byte arg0, int arg1, boolean arg2) {
        if (arg0 > -92) {
            return null;
        } else {
            field2396++;
            return arg2 && arg1 >= 0 ? method1213(arg1, 10, arg2, 1) : Integer.toString(arg1);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIZI)Ljava/lang/String;", line = 1039)
    private static final String method1213(int arg0, int arg1, boolean arg2, int arg3) {
        field2411++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        } else if (arg2 && arg0 >= 0) {
            int var4 = 2;
            for (int var5 = arg0 / arg1; var5 != 0; var5 /= arg1) {
                var4++;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            for (int var7 = var4 - arg3; var7 > 0; var7--) {
                int var8 = arg0;
                arg0 /= arg1;
                int var9 = var8 - (arg0 * arg1);
                if (var9 < 10) {
                    var6[var7] = (char) (var9 + 48);
                } else {
                    var6[var7] = (char) (var9 + 87);
                }
            }
            return new String(var6);
        } else {
            return Integer.toString(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIIIIIIII)Z", line = 1091)
    public final boolean method1214(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2413++;
        int var11 = arg1 + arg8;
        int var12 = arg3 + arg5;
        int var13 = 24 % ((-arg4 - 41) / 49);
        int var14 = arg0 + arg7;
        int var15 = arg2 + arg6;
        if (arg1 == var14 && (arg9 & 0x2) == 0) {
            int var16 = arg6 < arg3 ? arg3 : arg6;
            int var17 = var12 < var15 ? var12 : var15;
            while (var16 < var17) {
                if ((this.field2408[var14 - this.field2419 - 1][var16 - this.field2400] & 0x8) == 0) {
                    return true;
                }
                var16++;
            }
        } else if (arg7 == var11 && (arg9 & 0x8) == 0) {
            int var18 = arg3 <= arg6 ? arg6 : arg3;
            int var19 = var15 <= var12 ? var15 : var12;
            while (var18 < var19) {
                if ((this.field2408[arg7 - this.field2419][var18 - this.field2400] & 0x80) == 0) {
                    return true;
                }
                var18++;
            }
        } else if (arg3 == var15 && (arg9 & 0x1) == 0) {
            int var20 = arg1 <= arg7 ? arg7 : arg1;
            int var21 = var11 < var14 ? var11 : var14;
            while (var21 > var20) {
                if ((this.field2408[var20 - this.field2419][var15 - this.field2400 - 1] & 0x2) == 0) {
                    return true;
                }
                var20++;
            }
        } else if (arg6 == var12 && (arg9 & 0x4) == 0) {
            int var22 = arg1 <= arg7 ? arg7 : arg1;
            int var23 = var14 > var11 ? var11 : var14;
            while (var22 < var23) {
                if ((this.field2408[var22 - this.field2419][arg6 - this.field2400] & 0x20) == 0) {
                    return true;
                }
                var22++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ZLjava/lang/String;Z)V", line = 1183)
    public static final void method1215(boolean arg0, String arg1, boolean arg2) {
        field2410++;
        class383.field5618.field1369 = 1;
        String var3 = arg1.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        if (arg0) {
            method1215(true, (String) null, true);
        }
        for (int var6 = 0; var6 < class157.field2119.field154; var6++) {
            class427 var9 = class157.field2119.method176((byte) -61, var6);
            if ((!arg2 || var9.field6147) && var9.field6178 == -1 && var9.field6143 == -1 && var9.field6152 == 0 && var9.field6145.toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 250) {
                    class127.field1684 = -1;
                    class92.field1137 = null;
                    return;
                }
                if (var4.length <= var5) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var6;
            }
        }
        class178.field2512 = 0;
        class92.field1137 = var4;
        class127.field1684 = var5;
        String[] var7 = new String[class127.field1684];
        for (int var8 = 0; var8 < class127.field1684; var8++) {
            var7[var8] = class157.field2119.method176((byte) -56, var4[var8]).field6145;
        }
        class216.method1492((byte) -126, class92.field1137, var7);
        class383.field5618.method720(24394);
        class383.field5618.field1369 = 2;
    }

    @OriginalMember(owner = "client!th", name = "c", descriptor = "(III)V", line = 1260)
    public final void method1216(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field2400;
        int var5 = arg0 - this.field2419;
        if (arg2 != 0) {
            this.method1216(21, -77, 113);
        }
        field2412++;
        this.field2408[var5][var4] = class386.method2438(this.field2408[var5][var4], -2097153);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ZIBIZII)V", line = 1275)
    public final void method1217(boolean arg0, int arg1, byte arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field2402++;
        int var8 = 256;
        if (arg2 >= 0) {
            return;
        }
        if (arg0) {
            var8 |= 0x20000;
        }
        if (arg4) {
            var8 |= 0x40000000;
        }
        int var9 = arg6 - this.field2419;
        int var10 = arg5 - this.field2400;
        for (int var11 = var9; var11 < (var9 + arg3); var11++) {
            if (var11 >= 0 && var11 < this.field2415) {
                for (int var12 = var10; var12 < (arg1 + var10); var12++) {
                    if (var12 >= 0 && this.field2394 > var12) {
                        this.method1218(1, var11, var8, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(IIII)V", line = 1331)
    private final void method1218(int arg0, int arg1, int arg2, int arg3) {
        field2406++;
        if (arg0 != 1) {
            this.field2419 = -109;
        }
        this.field2408[arg1][arg3] = class259.method1785(this.field2408[arg1][arg3], arg2);
    }

    @OriginalMember(owner = "client!th", name = "d", descriptor = "(III)V", line = 1342)
    public final void method1219(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field2400;
        field2407++;
        int var5 = arg2 - this.field2419;
        this.field2408[var5][var4] = class259.method1785(this.field2408[var5][var4], 2097152);
        if (arg1 != -1862) {
            this.field2408 = null;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIZIIZZI)V", line = 1355)
    public final void method1220(int arg0, int arg1, boolean arg2, int arg3, int arg4, boolean arg5, boolean arg6, int arg7) {
        field2403++;
        if (!arg5) {
            return;
        }
        int var9 = 256;
        if (arg2) {
            var9 |= 0x20000;
        }
        int var10 = arg7 - this.field2419;
        if (arg1 == 1 || arg1 == 3) {
            int var11 = arg3;
            arg3 = arg0;
            arg0 = var11;
        }
        int var12 = arg4 - this.field2400;
        if (arg6) {
            var9 |= 0x40000000;
        }
        for (int var13 = var10; var13 < (arg3 + var10); var13++) {
            if (var13 >= 0 && this.field2415 > var13) {
                for (int var14 = var12; var14 < (arg0 + var12); var14++) {
                    if (var14 >= 0 && var14 < this.field2394) {
                        this.method1211(1, var14, var9, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(B)V", line = 1408)
    public final void method1221(byte arg0) {
        field2401++;
        int var2 = 0;
        if (arg0 >= -23) {
            this.field2400 = 85;
        }
        while (var2 < this.field2415) {
            for (int var3 = 0; var3 < this.field2394; var3++) {
                if (var2 == 0 || var3 == 0 || this.field2415 - 5 <= var2 || var3 >= (this.field2394 - 5)) {
                    this.field2408[var2][var3] = -1;
                } else {
                    this.field2408[var2][var3] = 2097152;
                }
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIZZIII)V", line = 1440)
    public final void method1222(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6) {
        int var8 = arg4 - this.field2419;
        field2404++;
        int var9 = arg6 - this.field2400;
        if (arg0 == 0) {
            if (arg5 == 0) {
                this.method1211(arg1 - 33554431, var9, 128, var8);
                this.method1211(1, var9, 8, var8 - 1);
            }
            if (arg5 == 1) {
                this.method1211(1, var9, 2, var8);
                this.method1211(1, var9 + 1, 32, var8);
            }
            if (arg5 == 2) {
                this.method1211(arg1 ^ 0x2000001, var9, 8, var8);
                this.method1211(arg1 ^ 0x2000001, var9, 128, var8 + 1);
            }
            if (arg5 == 3) {
                this.method1211(1, var9, 32, var8);
                this.method1211(1, var9 - 1, 2, var8);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg5 == 0) {
                this.method1211(arg1 ^ 0x2000001, var9, 1, var8);
                this.method1211(1, var9 + 1, 16, var8 - 1);
            }
            if (arg5 == 1) {
                this.method1211(1, var9, 4, var8);
                this.method1211(1, var9 + 1, 64, var8 + 1);
            }
            if (arg5 == 2) {
                this.method1211(1, var9, 16, var8);
                this.method1211(1, var9 - 1, 1, var8 + 1);
            }
            if (arg5 == 3) {
                this.method1211(1, var9, 64, var8);
                this.method1211(arg1 - 33554431, var9 - 1, 4, var8 - 1);
            }
        }
        if (arg0 == 2) {
            if (arg5 == 0) {
                this.method1211(arg1 ^ 0x2000001, var9, 130, var8);
                this.method1211(1, var9, 8, var8 - 1);
                this.method1211(arg1 - 33554431, var9 + 1, 32, var8);
            }
            if (arg5 == 1) {
                this.method1211(1, var9, 10, var8);
                this.method1211(1, var9 + 1, 32, var8);
                this.method1211(1, var9, 128, var8 + 1);
            }
            if (arg5 == 2) {
                this.method1211(1, var9, 40, var8);
                this.method1211(1, var9, 128, var8 + 1);
                this.method1211(1, var9 - 1, 2, var8);
            }
            if (arg5 == 3) {
                this.method1211(1, var9, 160, var8);
                this.method1211(1, var9 - 1, 2, var8);
                this.method1211(1, var9, 8, var8 - 1);
            }
        }
        if (arg2) {
            if (arg0 == 0) {
                if (arg5 == 0) {
                    this.method1211(1, var9, 65536, var8);
                    this.method1211(1, var9, 4096, var8 - 1);
                }
                if (arg5 == 1) {
                    this.method1211(arg1 - 33554431, var9, 1024, var8);
                    this.method1211(1, var9 + 1, 16384, var8);
                }
                if (arg5 == 2) {
                    this.method1211(1, var9, 4096, var8);
                    this.method1211(1, var9, 65536, var8 + 1);
                }
                if (arg5 == 3) {
                    this.method1211(1, var9, 16384, var8);
                    this.method1211(1, var9 - 1, 1024, var8);
                }
            }
            if (arg0 == 1 || arg0 == 3) {
                if (arg5 == 0) {
                    this.method1211(1, var9, 512, var8);
                    this.method1211(1, var9 + 1, 8192, var8 - 1);
                }
                if (arg5 == 1) {
                    this.method1211(1, var9, 2048, var8);
                    this.method1211(1, var9 + 1, 32768, var8 + 1);
                }
                if (arg5 == 2) {
                    this.method1211(1, var9, 8192, var8);
                    this.method1211(1, var9 - 1, 512, var8 + 1);
                }
                if (arg5 == 3) {
                    this.method1211(1, var9, 32768, var8);
                    this.method1211(1, var9 - 1, 2048, var8 - 1);
                }
            }
            if (arg0 == 2) {
                if (arg5 == 0) {
                    this.method1211(1, var9, 66560, var8);
                    this.method1211(1, var9, 4096, var8 - 1);
                    this.method1211(1, var9 + 1, 16384, var8);
                }
                if (arg5 == 1) {
                    this.method1211(arg1 - 33554431, var9, 5120, var8);
                    this.method1211(1, var9 + 1, 16384, var8);
                    this.method1211(arg1 - 33554431, var9, 65536, var8 + 1);
                }
                if (arg5 == 2) {
                    this.method1211(1, var9, 20480, var8);
                    this.method1211(1, var9, 65536, var8 + 1);
                    this.method1211(1, var9 - 1, 1024, var8);
                }
                if (arg5 == 3) {
                    this.method1211(arg1 ^ 0x2000001, var9, 81920, var8);
                    this.method1211(arg1 - 33554431, var9 + -1, 1024, var8);
                    this.method1211(1, var9, 4096, var8 - 1);
                }
            }
        }
        if (arg3) {
            if (arg0 == 0) {
                if (arg5 == 0) {
                    this.method1211(1, var9, 536870912, var8);
                    this.method1211(1, var9, 33554432, var8 - 1);
                }
                if (arg5 == 1) {
                    this.method1211(1, var9, 8388608, var8);
                    this.method1211(1, var9 + 1, 134217728, var8);
                }
                if (arg5 == 2) {
                    this.method1211(1, var9, 33554432, var8);
                    this.method1211(1, var9, 536870912, var8 + 1);
                }
                if (arg5 == 3) {
                    this.method1211(arg1 - 33554431, var9, 134217728, var8);
                    this.method1211(1, var9 - 1, 8388608, var8);
                }
            }
            if (arg0 == 1 || arg0 == 3) {
                if (arg5 == 0) {
                    this.method1211(1, var9, 4194304, var8);
                    this.method1211(1, var9 + 1, 67108864, var8 - 1);
                }
                if (arg5 == 1) {
                    this.method1211(1, var9, 16777216, var8);
                    this.method1211(1, var9 + 1, 268435456, var8 + 1);
                }
                if (arg5 == 2) {
                    this.method1211(1, var9, 67108864, var8);
                    this.method1211(1, var9 - 1, 4194304, var8 + 1);
                }
                if (arg5 == 3) {
                    this.method1211(1, var9, 268435456, var8);
                    this.method1211(1, var9 - 1, 16777216, var8 - 1);
                }
            }
            if (arg0 == 2) {
                if (arg5 == 0) {
                    this.method1211(arg1 - 33554431, var9, 545259520, var8);
                    this.method1211(1, var9, 33554432, var8 - 1);
                    this.method1211(1, var9 + 1, 134217728, var8);
                }
                if (arg5 == 1) {
                    this.method1211(1, var9, 41943040, var8);
                    this.method1211(1, var9 + 1, 134217728, var8);
                    this.method1211(1, var9, 536870912, var8 + 1);
                }
                if (arg5 == 2) {
                    this.method1211(1, var9, 167772160, var8);
                    this.method1211(1, var9, 536870912, var8 + 1);
                    this.method1211(1, var9 - 1, 8388608, var8);
                }
                if (arg5 == 3) {
                    this.method1211(1, var9, 671088640, var8);
                    this.method1211(arg1 ^ 0x2000001, var9 - 1, 8388608, var8);
                    this.method1211(1, var9, 33554432, var8 - 1);
                }
            }
        }
        if (arg1 != 33554432) {
            method1210(false);
        }
    }
}
