import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class158 {

    @OriginalMember(owner = "client!ld", name = "t", descriptor = "[I")
    public static int[] field1876 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "Lcga;")
    public static class449 field1859 = new class449(33, -1);

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
    public static int field1857;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
    public int field1863;

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "I")
    public int field1864;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!ld", name = "l", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!ld", name = "n", descriptor = "I")
    public int field1870;

    @OriginalMember(owner = "client!ld", name = "o", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!ld", name = "p", descriptor = "I")
    public int field1872;

    @OriginalMember(owner = "client!ld", name = "q", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!ld", name = "r", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!ld", name = "u", descriptor = "I")
    public static int field1877;

    @OriginalMember(owner = "client!ld", name = "v", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!ld", name = "s", descriptor = "[[I")
    public int[][] field1875;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIB)V", line = 7)
    private final void method966(int arg0, int arg1, int arg2, byte arg3) {
        int var5 = 45 / (-arg3 / 63);
        field1865++;
        this.field1875[arg0][arg1] = class109.method762(this.field1875[arg0][arg1], ~arg2);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIZZIIZ)V", line = 19)
    public final void method967(int arg0, int arg1, int arg2, boolean arg3, boolean arg4, int arg5, int arg6, boolean arg7) {
        field1866++;
        int var9 = 256;
        if (arg7) {
            var9 |= 0x20000;
        }
        if (arg4) {
            var9 |= 0x40000000;
        }
        if (arg5 == 1 || arg5 == 3) {
            int var10 = arg2;
            arg2 = arg1;
            arg1 = var10;
        }
        if (arg3) {
            return;
        }
        int var11 = arg0 - this.field1864;
        int var12 = arg6 - this.field1872;
        for (int var13 = var12; var13 < arg2 + var12; var13++) {
            if (var13 >= 0 && this.field1863 > var13) {
                for (int var14 = var11; var14 < arg1 + var11; var14++) {
                    if (var14 >= 0 && var14 < this.field1870) {
                        this.method966(var13, var14, var9, (byte) 114);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIII)V", line = 76)
    private final void method968(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != -28400) {
            this.method977(-10, true, 91, 22, false, false, 81);
        }
        this.field1875[arg2][arg3] = class364.method2113(this.field1875[arg2][arg3], arg0);
        field1861++;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIIIIIII)Z", line = 88)
    public final boolean method969(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1862++;
        if (arg7 > 1) {
            return class500.method2723(arg2, arg5, arg6, arg8, arg7, -82, arg7, arg0, arg4) ? true : this.method975(arg7, arg1, arg7, arg4, 12150, arg2, arg5, arg0, arg6, arg8);
        }
        int var10 = arg2 + arg5 - 1;
        int var11 = arg6 + arg4 - 1;
        if (arg5 <= arg0 && var10 >= arg0 && arg4 <= arg8 && arg8 <= var11) {
            return true;
        } else if ((arg5 - 1) == arg0 && arg8 >= arg4 && arg8 <= var11 && (this.field1875[arg0 - this.field1872][arg8 - this.field1864] & 0x8) == 0 && (arg1 & 0x8) == 0) {
            return true;
        } else if (var10 + 1 == arg0 && arg8 >= arg4 && arg8 <= var11 && (this.field1875[arg0 - this.field1872][arg8 - this.field1864] & 0x80) == 0 && (arg1 & 0x2) == 0) {
            return true;
        } else if ((arg4 - 1) == arg8 && arg5 <= arg0 && arg0 <= var10 && (this.field1875[arg0 - this.field1872][arg8 - this.field1864] & 0x2) == 0 && (arg1 & 0x4) == 0) {
            return true;
        } else if (var11 + 1 == arg8 && arg5 <= arg0 && var10 >= arg0 && (this.field1875[arg0 - this.field1872][arg8 - this.field1864] & 0x20) == 0 && (arg1 & 0x1) == 0) {
            return true;
        } else {
            if (arg3 > -70) {
                this.method972(-112, 66, -5);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIBIIII)Z", line = 131)
    public final boolean method970(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        field1860++;
        if (arg2 == 1) {
            if (arg5 == arg6 && arg0 == arg1) {
                return true;
            }
        } else if (arg6 >= arg5 && arg6 <= arg2 + arg5 - 1 && arg1 <= arg1 && arg1 <= arg1 + arg2 - 1) {
            return true;
        }
        int var9 = arg1 - this.field1864;
        int var10 = arg6 - this.field1872;
        int var11 = arg0 - this.field1864;
        int var12 = arg5 - this.field1872;
        if (arg2 == 1) {
            if (arg7 == 0) {
                if (arg4 == 0) {
                    if ((var10 - 1) == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && (var9 + 1) == var11 && (this.field1875[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var9 - 1 == var11 && (this.field1875[var12][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var10 == var12 && (var9 + 1) == var11) {
                        return true;
                    }
                    if ((var10 - 1) == var12 && var9 == var11 && (this.field1875[var12][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var9 == var11 && (this.field1875[var12][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if (var10 + 1 == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && (var9 + 1) == var11 && (this.field1875[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var9 - 1) == var11 && (this.field1875[var12][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var10 == var12 && (var9 - 1) == var11) {
                        return true;
                    }
                    if (var10 - 1 == var12 && var9 == var11 && (this.field1875[var12][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var9 == var11 && (this.field1875[var12][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg7 == 2) {
                if (arg4 == 0) {
                    if ((var10 - 1) == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && (var9 + 1) == var11) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var9 == var11 && (this.field1875[var12][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var9 - 1 == var11 && (this.field1875[var12][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var10 - 1 == var12 && var9 == var11 && (this.field1875[var12][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var9 + 1 == var11) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && (var9 - 1) == var11 && (this.field1875[var12][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if (var10 - 1 == var12 && var9 == var11 && (this.field1875[var12][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var9 + 1 == var11 && (this.field1875[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && var9 - 1 == var11) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var10 - 1 == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && (var9 + 1) == var11 && (this.field1875[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var9 == var11 && (this.field1875[var12][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var9 - 1) == var11) {
                        return true;
                    }
                }
            }
            if (arg7 == 9) {
                if (var10 == var12 && var9 + 1 == var11 && (this.field1875[var12][var11] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var12 && (var9 - 1) == var11 && (this.field1875[var12][var11] & 0x2) == 0) {
                    return true;
                }
                if (var10 - 1 == var12 && var9 == var11 && (this.field1875[var12][var11] & 0x8) == 0) {
                    return true;
                }
                if ((var10 + 1) == var12 && var9 == var11 && (this.field1875[var12][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var12 + arg2 - 1;
            int var14 = var11 + arg2 - 1;
            if (arg7 == 0) {
                if (arg4 == 0) {
                    if (var10 - arg2 == var12 && var11 <= var9 && var14 >= var9) {
                        return true;
                    }
                    if (var10 >= var12 && var13 >= var10 && var9 + 1 == var11 && (this.field1875[var10][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 >= var12 && var13 >= var10 && var9 - arg2 == var11 && (this.field1875[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var10 >= var12 && var10 <= var13 && var9 + 1 == var11) {
                        return true;
                    }
                    if (var10 - arg2 == var12 && var9 >= var11 && var9 <= var14 && (this.field1875[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var11 <= var9 && var9 <= var14 && (this.field1875[var12][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if ((var10 + 1) == var12 && var11 <= var9 && var9 <= var14) {
                        return true;
                    }
                    if (var10 >= var12 && var13 >= var10 && var9 + 1 == var11 && (this.field1875[var10][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 <= var10 && var13 >= var10 && (var9 - arg2) == var11 && (this.field1875[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var10 >= var12 && var13 >= var10 && (var9 - arg2) == var11) {
                        return true;
                    }
                    if (var10 - arg2 == var12 && var11 <= var9 && var9 <= var14 && (this.field1875[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var9 >= var11 && var9 <= var14 && (this.field1875[var12][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg7 == 2) {
                if (arg4 == 0) {
                    if (var10 - arg2 == var12 && var11 <= var9 && var14 >= var9) {
                        return true;
                    }
                    if (var12 <= var10 && var10 <= var13 && var9 + 1 == var11) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var11 <= var9 && var14 >= var9 && (this.field1875[var12][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 >= var12 && var10 <= var13 && (var9 - arg2) == var11 && (this.field1875[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var10 - arg2 == var12 && var9 >= var11 && var14 >= var9 && (this.field1875[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 >= var12 && var10 <= var13 && (var9 + 1) == var11) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var11 <= var9 && var9 <= var14) {
                        return true;
                    }
                    if (var10 >= var12 && var10 <= var13 && (var9 - arg2) == var11 && (this.field1875[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if ((var10 - arg2) == var12 && var9 >= var11 && var9 <= var14 && (this.field1875[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 >= var12 && var10 <= var13 && var9 + 1 == var11 && (this.field1875[var10][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var9 >= var11 && var14 >= var9) {
                        return true;
                    }
                    if (var10 >= var12 && var10 <= var13 && var9 - arg2 == var11) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if ((var10 - arg2) == var12 && var11 <= var9 && var14 >= var9) {
                        return true;
                    }
                    if (var10 >= var12 && var10 <= var13 && (var9 + 1) == var11 && (this.field1875[var10][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var11 <= var9 && var9 <= var14 && (this.field1875[var12][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 >= var12 && var13 >= var10 && var9 - arg2 == var11) {
                        return true;
                    }
                }
            }
            if (arg7 == 9) {
                if (var12 <= var10 && var13 >= var10 && (var9 + 1) == var11 && (this.field1875[var10][var11] & 0x2C0120) == 0) {
                    return true;
                }
                if (var10 >= var12 && var13 >= var10 && (var9 - arg2) == var11 && (this.field1875[var10][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if ((var10 - arg2) == var12 && var9 >= var11 && var14 >= var9 && (this.field1875[var13][var9] & 0x2C0108) == 0) {
                    return true;
                }
                if (var10 + 1 == var12 && var9 >= var11 && var14 >= var9 && (this.field1875[var12][var9] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        if (arg3 != 96) {
            this.field1863 = 13;
        }
        return false;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIIIIBI)Z", line = 496)
    public final boolean method971(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        if (arg6 >= -113) {
            this.field1863 = 51;
        }
        field1873++;
        if (arg2 == 1) {
            if (arg4 == arg7 && arg0 == arg5) {
                return true;
            }
        } else if (arg7 <= arg4 && arg7 + arg2 - 1 >= arg4 && arg5 >= arg5 && arg5 <= arg2 + arg5 - 1) {
            return true;
        }
        int var9 = arg5 - this.field1864;
        int var10 = arg7 - this.field1872;
        int var11 = arg0 - this.field1864;
        int var12 = arg4 - this.field1872;
        if (arg2 == 1) {
            if (arg3 == 6 || arg3 == 7) {
                if (arg3 == 7) {
                    arg1 = arg1 + 2 & 0x3;
                }
                if (arg1 == 0) {
                    if (var12 + 1 == var10 && var9 == var11 && (this.field1875[var10][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var9 - 1 == var11 && (this.field1875[var10][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if ((var12 - 1) == var10 && var9 == var11 && (this.field1875[var10][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var9 - 1) == var11 && (this.field1875[var10][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var12 - 1 == var10 && var9 == var11 && (this.field1875[var10][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var9 + 1) == var11 && (this.field1875[var10][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if ((var12 + 1) == var10 && var9 == var11 && (this.field1875[var10][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var9 + 1 == var11 && (this.field1875[var10][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 8) {
                if (var10 == var12 && (var9 + 1) == var11 && (this.field1875[var10][var11] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var12 && (var9 - 1) == var11 && (this.field1875[var10][var11] & 0x2) == 0) {
                    return true;
                }
                if (var12 - 1 == var10 && var9 == var11 && (this.field1875[var10][var11] & 0x8) == 0) {
                    return true;
                }
                if ((var12 + 1) == var10 && var9 == var11 && (this.field1875[var10][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg2 + var10 - 1;
            int var14 = arg2 + var11 - 1;
            if (arg3 == 6 || arg3 == 7) {
                if (arg3 == 7) {
                    arg1 = arg1 + 2 & 0x3;
                }
                if (arg1 == 0) {
                    if (var12 + 1 == var10 && var11 <= var9 && var14 >= var9 && (this.field1875[var10][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 <= var12 && var13 >= var12 && var9 - arg2 == var11 && (this.field1875[var12][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if ((var12 - arg2) == var10 && var9 >= var11 && var9 <= var14 && (this.field1875[var13][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 <= var12 && var12 <= var13 && var9 - arg2 == var11 && (this.field1875[var12][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if ((var12 - arg2) == var10 && var11 <= var9 && var9 <= var14 && (this.field1875[var13][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 >= var10 && var12 <= var13 && (var9 + 1) == var11 && (this.field1875[var12][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if ((var12 + 1) == var10 && var11 <= var9 && var9 <= var14 && (this.field1875[var10][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 >= var10 && var13 >= var12 && (var9 + 1) == var11 && (this.field1875[var12][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 8) {
                if (var10 <= var12 && var13 >= var12 && (var9 + 1) == var11 && (this.field1875[var12][var11] & 0x20) == 0) {
                    return true;
                }
                if (var10 <= var12 && var13 >= var12 && var9 - arg2 == var11 && (this.field1875[var12][var14] & 0x2) == 0) {
                    return true;
                }
                if ((var12 - arg2) == var10 && var9 >= var11 && var14 >= var9 && (this.field1875[var13][var9] & 0x8) == 0) {
                    return true;
                }
                if (var12 + 1 == var10 && var11 <= var9 && var9 <= var14 && (this.field1875[var10][var9] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(III)V", line = 680)
    public final void method972(int arg0, int arg1, int arg2) {
        field1877++;
        int var4 = arg1 - this.field1864;
        if (arg2 < 95) {
            this.method967(-59, -77, -9, false, true, -24, -92, false);
        }
        int var5 = arg0 - this.field1872;
        this.field1875[var5][var4] = class109.method762(this.field1875[var5][var4], -262145);
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(III)V", line = 702)
    public final void method973(int arg0, int arg1, int arg2) {
        field1878++;
        if (arg1 > 5) {
            int var4 = arg2 - this.field1864;
            int var5 = arg0 - this.field1872;
            this.field1875[var5][var4] = class364.method2113(this.field1875[var5][var4], 262144);
        }
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(III)V", line = 727)
    public final void method974(int arg0, int arg1, int arg2) {
        field1857++;
        if (arg0 != -2995) {
            field1859 = null;
        }
        int var4 = arg1 - this.field1872;
        int var5 = arg2 - this.field1864;
        this.field1875[var4][var5] = class109.method762(this.field1875[var4][var5], -2097153);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIIIIIIII)Z", line = 741)
    public final boolean method975(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1874++;
        int var11 = arg0 + arg7;
        int var12 = arg2 + arg9;
        if (arg4 != 12150) {
            this.field1870 = 17;
        }
        int var13 = arg5 + arg6;
        int var14 = arg3 + arg8;
        if (arg7 == var13 && (arg1 & 0x2) == 0) {
            int var15 = arg3 >= arg9 ? arg3 : arg9;
            int var16 = var14 > var12 ? var12 : var14;
            while (var16 > var15) {
                if ((this.field1875[var13 - this.field1872 - 1][var15 - this.field1864] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg6 == var11 && (arg1 & 0x8) == 0) {
            int var17 = arg9 > arg3 ? arg9 : arg3;
            int var18 = var12 >= var14 ? var14 : var12;
            while (var18 > var17) {
                if ((this.field1875[arg6 - this.field1872][var17 - this.field1864] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg9 == var14 && (arg1 & 0x1) == 0) {
            int var19 = arg7 <= arg6 ? arg6 : arg7;
            int var20 = var13 > var11 ? var11 : var13;
            while (var19 < var20) {
                if ((this.field1875[var19 - this.field1872][var14 - this.field1864 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg3 == var12 && (arg1 & 0x4) == 0) {
            int var21 = arg7 > arg6 ? arg7 : arg6;
            int var22 = var11 < var13 ? var11 : var13;
            while (var22 > var21) {
                if ((this.field1875[var21 - this.field1872][arg3 - this.field1864] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V", line = 836)
    public static void method976(int arg0) {
        if (arg0 != -2097153) {
            method976(-36);
        }
        field1876 = null;
        field1859 = null;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IZIIZZI)V", line = 851)
    public final void method977(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, boolean arg5, int arg6) {
        field1868++;
        int var8 = 256;
        if (arg4) {
            var8 |= 0x20000;
        }
        int var9 = arg0 - this.field1872;
        int var10 = arg3 - this.field1864;
        if (arg5) {
            var8 |= 0x40000000;
        }
        if (!arg1) {
            this.method973(74, -98, 0);
        }
        for (int var11 = var9; var11 < arg6 + var9; var11++) {
            if (var11 >= 0 && this.field1863 > var11) {
                for (int var12 = var10; var12 < (arg2 + var10); var12++) {
                    if (var12 >= 0 && var12 < this.field1870) {
                        this.method968(var8, -28400, var11, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZIZIIII)V", line = 896)
    public final void method978(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = arg3 - this.field1872;
        field1858++;
        int var9 = arg6 - this.field1864;
        if (arg1 == 0) {
            if (arg5 == 0) {
                this.method966(var8, var9, 128, (byte) 64);
                this.method966(var8 - 1, var9, 8, (byte) 120);
            }
            if (arg5 == 1) {
                this.method966(var8, var9, 2, (byte) -107);
                this.method966(var8, var9 + 1, 32, (byte) -109);
            }
            if (arg5 == 2) {
                this.method966(var8, var9, 8, (byte) -85);
                this.method966(var8 + 1, var9, 128, (byte) 82);
            }
            if (arg5 == 3) {
                this.method966(var8, var9, 32, (byte) -128);
                this.method966(var8, var9 - 1, 2, (byte) -105);
            }
        }
        if (arg4 != 16384) {
            this.method973(-67, 5, 37);
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg5 == 0) {
                this.method966(var8, var9, 1, (byte) -93);
                this.method966(var8 - 1, var9 - -1, 16, (byte) -115);
            }
            if (arg5 == 1) {
                this.method966(var8, var9, 4, (byte) -112);
                this.method966(var8 + 1, var9 - -1, 64, (byte) 107);
            }
            if (arg5 == 2) {
                this.method966(var8, var9, 16, (byte) -92);
                this.method966(var8 + 1, var9 + -1, 1, (byte) -97);
            }
            if (arg5 == 3) {
                this.method966(var8, var9, 64, (byte) 71);
                this.method966(var8 - 1, var9 + -1, 4, (byte) -90);
            }
        }
        if (arg1 == 2) {
            if (arg5 == 0) {
                this.method966(var8, var9, 130, (byte) -75);
                this.method966(var8 - 1, var9, 8, (byte) -114);
                this.method966(var8, var9 + 1, 32, (byte) -106);
            }
            if (arg5 == 1) {
                this.method966(var8, var9, 10, (byte) 124);
                this.method966(var8, var9 + 1, 32, (byte) -87);
                this.method966(var8 + 1, var9, 128, (byte) 87);
            }
            if (arg5 == 2) {
                this.method966(var8, var9, 40, (byte) 85);
                this.method966(var8 + 1, var9, 128, (byte) -90);
                this.method966(var8, var9 - 1, 2, (byte) 66);
            }
            if (arg5 == 3) {
                this.method966(var8, var9, 160, (byte) -98);
                this.method966(var8, var9 - 1, 2, (byte) -112);
                this.method966(var8 - 1, var9, 8, (byte) 79);
            }
        }
        if (arg2) {
            if (arg1 == 0) {
                if (arg5 == 0) {
                    this.method966(var8, var9, 65536, (byte) 112);
                    this.method966(var8 - 1, var9, 4096, (byte) -89);
                }
                if (arg5 == 1) {
                    this.method966(var8, var9, 1024, (byte) -75);
                    this.method966(var8, var9 + 1, 16384, (byte) 119);
                }
                if (arg5 == 2) {
                    this.method966(var8, var9, 4096, (byte) -74);
                    this.method966(var8 + 1, var9, 65536, (byte) 102);
                }
                if (arg5 == 3) {
                    this.method966(var8, var9, 16384, (byte) 116);
                    this.method966(var8, var9 - 1, 1024, (byte) -123);
                }
            }
            if (arg1 == 1 || arg1 == 3) {
                if (arg5 == 0) {
                    this.method966(var8, var9, 512, (byte) -71);
                    this.method966(var8 - 1, var9 - -1, 8192, (byte) -64);
                }
                if (arg5 == 1) {
                    this.method966(var8, var9, 2048, (byte) 100);
                    this.method966(var8 + 1, var9 + 1, 32768, (byte) 85);
                }
                if (arg5 == 2) {
                    this.method966(var8, var9, 8192, (byte) 84);
                    this.method966(var8 + 1, var9 + -1, 512, (byte) -107);
                }
                if (arg5 == 3) {
                    this.method966(var8, var9, 32768, (byte) -66);
                    this.method966(var8 - 1, var9 - 1, 2048, (byte) 126);
                }
            }
            if (arg1 == 2) {
                if (arg5 == 0) {
                    this.method966(var8, var9, 66560, (byte) -99);
                    this.method966(var8 - 1, var9, 4096, (byte) -106);
                    this.method966(var8, var9 + 1, 16384, (byte) 104);
                }
                if (arg5 == 1) {
                    this.method966(var8, var9, 5120, (byte) -109);
                    this.method966(var8, var9 + 1, 16384, (byte) -63);
                    this.method966(var8 + 1, var9, 65536, (byte) 103);
                }
                if (arg5 == 2) {
                    this.method966(var8, var9, 20480, (byte) -114);
                    this.method966(var8 + 1, var9, 65536, (byte) -74);
                    this.method966(var8, var9 - 1, 1024, (byte) -91);
                }
                if (arg5 == 3) {
                    this.method966(var8, var9, 81920, (byte) 88);
                    this.method966(var8, var9 - 1, 1024, (byte) -112);
                    this.method966(var8 - 1, var9, 4096, (byte) 100);
                }
            }
        }
        if (!arg0) {
            return;
        }
        if (arg1 == 0) {
            if (arg5 == 0) {
                this.method966(var8, var9, 536870912, (byte) 118);
                this.method966(var8 - 1, var9, 33554432, (byte) 112);
            }
            if (arg5 == 1) {
                this.method966(var8, var9, 8388608, (byte) -118);
                this.method966(var8, var9 + 1, 134217728, (byte) 117);
            }
            if (arg5 == 2) {
                this.method966(var8, var9, 33554432, (byte) 76);
                this.method966(var8 + 1, var9, 536870912, (byte) -115);
            }
            if (arg5 == 3) {
                this.method966(var8, var9, 134217728, (byte) 92);
                this.method966(var8, var9 - 1, 8388608, (byte) -128);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg5 == 0) {
                this.method966(var8, var9, 4194304, (byte) -118);
                this.method966(var8 - 1, var9 + 1, 67108864, (byte) -96);
            }
            if (arg5 == 1) {
                this.method966(var8, var9, 16777216, (byte) 126);
                this.method966(var8 + 1, var9 - -1, 268435456, (byte) 96);
            }
            if (arg5 == 2) {
                this.method966(var8, var9, 67108864, (byte) 104);
                this.method966(var8 + 1, var9 + -1, 4194304, (byte) 113);
            }
            if (arg5 == 3) {
                this.method966(var8, var9, 268435456, (byte) 105);
                this.method966(var8 - 1, var9 + -1, 16777216, (byte) -69);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method966(var8, var9, 545259520, (byte) 84);
            this.method966(var8 - 1, var9, 33554432, (byte) -119);
            this.method966(var8, var9 + 1, 134217728, (byte) 74);
        }
        if (arg5 == 1) {
            this.method966(var8, var9, 41943040, (byte) 65);
            this.method966(var8, var9 + 1, 134217728, (byte) -66);
            this.method966(var8 + 1, var9, 536870912, (byte) 125);
        }
        if (arg5 == 2) {
            this.method966(var8, var9, 167772160, (byte) -117);
            this.method966(var8 + 1, var9, 536870912, (byte) 86);
            this.method966(var8, var9 - 1, 8388608, (byte) -72);
        }
        if (arg5 == 3) {
            this.method966(var8, var9, 671088640, (byte) 86);
            this.method966(var8, var9 - 1, 8388608, (byte) -106);
            this.method966(var8 - 1, var9, 33554432, (byte) -104);
            return;
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)V", line = 1213)
    public final void method979(int arg0) {
        if (arg0 != 13292) {
            return;
        }
        for (int var2 = 0; var2 < this.field1863; var2++) {
            for (int var3 = 0; var3 < this.field1870; var3++) {
                if (var2 == 0 || var3 == 0 || this.field1863 - 5 <= var2 || var3 >= this.field1870 - 5) {
                    this.field1875[var2][var3] = -1;
                } else {
                    this.field1875[var2][var3] = 2097152;
                }
            }
        }
        field1871++;
    }

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "(III)V", line = 1250)
    public final void method980(int arg0, int arg1, int arg2) {
        if (arg2 >= -68) {
            this.method968(115, 104, -33, 0);
        }
        field1867++;
        int var4 = arg1 - this.field1872;
        int var5 = arg0 - this.field1864;
        this.field1875[var4][var5] = class364.method2113(this.field1875[var4][var5], 2097152);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IZIZIII)V", line = 1267)
    public final void method981(int arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        int var8 = arg2 - this.field1864;
        int var9 = arg0 - this.field1872;
        field1869++;
        if (arg6 == 0) {
            if (arg5 == 0) {
                this.method968(128, -28400, var9, var8);
                this.method968(8, -28400, var9 - 1, var8);
            }
            if (arg5 == 1) {
                this.method968(2, -28400, var9, var8);
                this.method968(32, -28400, var9, var8 + 1);
            }
            if (arg5 == 2) {
                this.method968(8, -28400, var9, var8);
                this.method968(128, -28400, var9 + 1, var8);
            }
            if (arg5 == 3) {
                this.method968(32, -28400, var9, var8);
                this.method968(2, -28400, var9, var8 - 1);
            }
        }
        if (arg4 == arg6 || arg6 == 3) {
            if (arg5 == 0) {
                this.method968(1, -28400, var9, var8);
                this.method968(16, -28400, var9 - 1, var8 + 1);
            }
            if (arg5 == 1) {
                this.method968(4, arg4 - 28401, var9, var8);
                this.method968(64, -28400, var9 + 1, var8 + 1);
            }
            if (arg5 == 2) {
                this.method968(16, -28400, var9, var8);
                this.method968(1, arg4 - 28401, var9 + 1, var8 - 1);
            }
            if (arg5 == 3) {
                this.method968(64, arg4 - 28401, var9, var8);
                this.method968(4, arg4 - 28401, var9 - 1, var8 - 1);
            }
        }
        if (arg6 == 2) {
            if (arg5 == 0) {
                this.method968(130, -28400, var9, var8);
                this.method968(8, -28400, var9 - 1, var8);
                this.method968(32, -28400, var9, var8 + 1);
            }
            if (arg5 == 1) {
                this.method968(10, arg4 - 28401, var9, var8);
                this.method968(32, -28400, var9, var8 + 1);
                this.method968(128, arg4 ^ 0xFFFF9111, var9 + 1, var8);
            }
            if (arg5 == 2) {
                this.method968(40, arg4 ^ 0xFFFF9111, var9, var8);
                this.method968(128, arg4 - 28401, var9 - -1, var8);
                this.method968(2, arg4 - 28401, var9, var8 - 1);
            }
            if (arg5 == 3) {
                this.method968(160, -28400, var9, var8);
                this.method968(2, -28400, var9, var8 - 1);
                this.method968(8, -28400, var9 - 1, var8);
            }
        }
        if (arg1) {
            if (arg6 == 0) {
                if (arg5 == 0) {
                    this.method968(65536, -28400, var9, var8);
                    this.method968(4096, -28400, var9 - 1, var8);
                }
                if (arg5 == 1) {
                    this.method968(1024, -28400, var9, var8);
                    this.method968(16384, arg4 - 28401, var9, var8 + 1);
                }
                if (arg5 == 2) {
                    this.method968(4096, arg4 - 28401, var9, var8);
                    this.method968(65536, -28400, var9 + 1, var8);
                }
                if (arg5 == 3) {
                    this.method968(16384, -28400, var9, var8);
                    this.method968(1024, -28400, var9, var8 - 1);
                }
            }
            if (arg6 == 1 || arg6 == 3) {
                if (arg5 == 0) {
                    this.method968(512, -28400, var9, var8);
                    this.method968(8192, arg4 - 28401, var9 + -1, var8 + 1);
                }
                if (arg5 == 1) {
                    this.method968(2048, -28400, var9, var8);
                    this.method968(32768, -28400, var9 + 1, var8 - -1);
                }
                if (arg5 == 2) {
                    this.method968(8192, -28400, var9, var8);
                    this.method968(512, -28400, var9 + 1, var8 + -1);
                }
                if (arg5 == 3) {
                    this.method968(32768, -28400, var9, var8);
                    this.method968(2048, -28400, var9 - 1, var8 + -1);
                }
            }
            if (arg6 == 2) {
                if (arg5 == 0) {
                    this.method968(66560, -28400, var9, var8);
                    this.method968(4096, -28400, var9 - 1, var8);
                    this.method968(16384, -28400, var9, var8 + 1);
                }
                if (arg5 == 1) {
                    this.method968(5120, -28400, var9, var8);
                    this.method968(16384, -28400, var9, var8 + 1);
                    this.method968(65536, -28400, var9 + 1, var8);
                }
                if (arg5 == 2) {
                    this.method968(20480, -28400, var9, var8);
                    this.method968(65536, -28400, var9 + 1, var8);
                    this.method968(1024, -28400, var9, var8 - 1);
                }
                if (arg5 == 3) {
                    this.method968(81920, -28400, var9, var8);
                    this.method968(1024, -28400, var9, var8 - 1);
                    this.method968(4096, -28400, var9 - 1, var8);
                }
            }
        }
        if (!arg3) {
            return;
        }
        if (arg6 == 0) {
            if (arg5 == 0) {
                this.method968(536870912, -28400, var9, var8);
                this.method968(33554432, -28400, var9 - 1, var8);
            }
            if (arg5 == 1) {
                this.method968(8388608, -28400, var9, var8);
                this.method968(134217728, -28400, var9, var8 + 1);
            }
            if (arg5 == 2) {
                this.method968(33554432, -28400, var9, var8);
                this.method968(536870912, -28400, var9 + 1, var8);
            }
            if (arg5 == 3) {
                this.method968(134217728, -28400, var9, var8);
                this.method968(8388608, -28400, var9, var8 - 1);
            }
        }
        if (arg6 == 1 || arg6 == 3) {
            if (arg5 == 0) {
                this.method968(4194304, -28400, var9, var8);
                this.method968(67108864, -28400, var9 - 1, var8 + 1);
            }
            if (arg5 == 1) {
                this.method968(16777216, -28400, var9, var8);
                this.method968(268435456, -28400, var9 + 1, var8 + 1);
            }
            if (arg5 == 2) {
                this.method968(67108864, arg4 - 28401, var9, var8);
                this.method968(4194304, arg4 - 28401, var9 - -1, var8 - 1);
            }
            if (arg5 == 3) {
                this.method968(268435456, -28400, var9, var8);
                this.method968(16777216, -28400, var9 - 1, var8 + -1);
            }
        }
        if (arg6 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method968(545259520, -28400, var9, var8);
            this.method968(33554432, arg4 - 28401, var9 + -1, var8);
            this.method968(134217728, -28400, var9, var8 + 1);
        }
        if (arg5 == 1) {
            this.method968(41943040, arg4 - 28401, var9, var8);
            this.method968(134217728, -28400, var9, var8 + 1);
            this.method968(536870912, arg4 ^ 0xFFFF9111, var9 + 1, var8);
        }
        if (arg5 == 2) {
            this.method968(167772160, -28400, var9, var8);
            this.method968(536870912, -28400, var9 + 1, var8);
            this.method968(8388608, arg4 - 28401, var9, var8 - 1);
        }
        if (arg5 == 3) {
            this.method968(671088640, -28400, var9, var8);
            this.method968(8388608, -28400, var9, var8 - 1);
            this.method968(33554432, -28400, var9 - 1, var8);
            return;
        }
    }
}
